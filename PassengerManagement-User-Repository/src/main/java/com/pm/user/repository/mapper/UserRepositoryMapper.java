package com.pm.user.repository.mapper;

import com.pm.user.domain.model.User;
import com.pm.user.domain.vo.UserID;
import com.pm.user.repository.entities.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserRepositoryMapper {

    public User map(UserEntity userEntity) {
        // TODO: preconditions
        User user = new User(new UserID(userEntity.getUuid()), userEntity.getName(), userEntity.getEmail());

        return user;
    }
}
