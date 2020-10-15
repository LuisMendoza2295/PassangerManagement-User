package com.pm.user.domain.repository;

import com.pm.user.domain.model.User;
import com.pm.user.domain.vo.UserID;
import reactor.core.publisher.Mono;

public interface UserRepository {

    Mono<User> create(User user);

    Mono<User> getByUserID(UserID userID);
}
