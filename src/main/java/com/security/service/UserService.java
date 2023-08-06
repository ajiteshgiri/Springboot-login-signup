package com.security.service;


import java.util.List;

import com.security.dto.Userdto;
import com.security.entity.User;

public interface UserService {
    void saveUser(Userdto userDto);

    User findByEmail(String email);

    List<Userdto> findAllUsers();
}
