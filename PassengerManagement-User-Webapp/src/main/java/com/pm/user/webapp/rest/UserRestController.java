package com.pm.user.webapp.rest;

import com.pm.user.domain.vo.UserID;
import com.pm.user.service.UserService;
import com.pm.user.webapp.dto.UserDTO;
import com.pm.user.webapp.mapper.UserDTOMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/users")
public class UserRestController {

    private final UserService userService;

    private final UserDTOMapper userDTOMapper;

    public UserRestController(UserService userService, UserDTOMapper userDTOMapper) {
        this.userService = userService;
        this.userDTOMapper = userDTOMapper;
    }

    @GetMapping("/{userId}")
    public Mono<UserDTO> findUserById(@PathVariable("userId") String userIdParam) {
        UserID userID = new UserID(userIdParam);

        return this.userService.findUser(userID)
                .map(this.userDTOMapper::map);
    }
}
