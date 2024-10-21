package ru.maslova.ProjectEmployees_v2.service;

import ru.maslova.ProjectEmployees_v2.dto.UserDto;
import ru.maslova.ProjectEmployees_v2.entity.User;

import java.util.List;

public interface UserService {
    void saveUser (UserDto userDto);

    User findUserByEmail (String email);

    List<UserDto> findAllUsers();
}
