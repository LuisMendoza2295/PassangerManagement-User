package com.pm.user.repository.reactive;

import com.pm.user.repository.entities.UserEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface UserRepositoryReactive extends ReactiveCrudRepository<UserEntity, Long> {

    Mono<UserEntity> findByUuid(String uuid);
}
