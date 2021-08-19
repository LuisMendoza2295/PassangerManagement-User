package com.pm.user.webapp.rest;

import com.pm.user.domain.vo.UserID;
import com.pm.user.service.UserService;
import com.pm.user.webapp.dto.GroupProperties;
import com.pm.user.webapp.dto.UserDTO;
import com.pm.user.webapp.mapper.UserDTOMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/users")
public class UserRestController {

    private final UserService userService;

    private final UserDTOMapper userDTOMapper;

    private final GroupProperties groupProperties;

    @Value("${type.groups.p}")
    private String passenger;

    public UserRestController(UserService userService, UserDTOMapper userDTOMapper, GroupProperties groupProperties) {
        this.userService = userService;
        this.userDTOMapper = userDTOMapper;
        this.groupProperties = groupProperties;
    }

    @GetMapping
    public Mono<String> index() {
        return Mono.just("Index")
                .metrics();
    }

    @GetMapping("/properties")
    public Flux<String> properties() {
        return Flux.fromStream(groupProperties.getGroups()
                .entrySet()
                .stream()
                .map(e -> e.getKey() + ": " + e.getValue()))
                .metrics();
    }

    @GetMapping("/{userId}")
    public Mono<UserDTO> findUserById(@PathVariable("userId") String userIdParam, @RequestHeader HttpHeaders headers) {
        UserID userID = new UserID(userIdParam);

        return this.userService.findUser(userID)
                .map(this.userDTOMapper::map)
                .metrics();
    }
}
