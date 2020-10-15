package com.pm.user.webapp.mapper;

import com.pm.user.domain.model.User;
import com.pm.user.webapp.dto.UserDTO;
import org.springframework.stereotype.Component;

@Component
public class UserDTOMapper {

    public UserDTO map(User user) {
        // TODO: preconditions
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getUserID().getValue());
        userDTO.setName(user.getName());
        userDTO.setEmail(user.getEmail());

        return userDTO;
    }
}
