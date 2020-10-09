package com.pm.user.webapp.rest;

import com.pm.user.domain.model.User;
import com.pm.user.domain.vo.UserID;
import com.pm.user.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/users")
public class UserRestController {

    private final UserService userService;

    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{userId}")
    public Mono<User> findUserById(@PathVariable("userId") String userId) {
        return this.userService.findUser(new UserID(userId));
    }
}
