package com.pm.user.repository.reactive;

import com.pm.user.repository.entities.UserEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface UserRepositoryReactive extends ReactiveCrudRepository<UserEntity, Long> {

    Mono<UserEntity> findByUuid(String uuid);
}
