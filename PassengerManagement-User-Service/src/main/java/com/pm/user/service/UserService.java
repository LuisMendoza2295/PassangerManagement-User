package com.pm.user.service;

import com.pm.user.domain.model.User;
import com.pm.user.domain.vo.UserID;
import reactor.core.publisher.Mono;

public interface UserService {

    Mono<User> findUser(UserID userID);
}
