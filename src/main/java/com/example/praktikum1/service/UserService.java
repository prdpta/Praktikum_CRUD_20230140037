package com.example.praktikum1.service;

import com.example.praktikum1.model.dto.UserAddRequest;
import com.example.praktikum1.model.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto AddUser(UserAddRequest request);
    List<UserDto> getAllUser();
    UserDto getUserById(String Id);
    UserDto UpdateUser(String Id, UserAddRequest request);
    void DeleteUser(String Id);
}
