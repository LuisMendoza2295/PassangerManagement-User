package com.pm.user.service.impl;

import com.pm.user.domain.model.User;
import com.pm.user.domain.vo.UserID;
import com.pm.user.repository.impl.UserRepositoryImpl;
import com.pm.user.service.UserService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepositoryImpl userRepository;

    public UserServiceImpl(UserRepositoryImpl userRepository) {
        this.userRepository = userRepository;
    }

    public Mono<User> findUser(UserID userID) {
        return this.userRepository.getByUserID(userID);
    }
}
