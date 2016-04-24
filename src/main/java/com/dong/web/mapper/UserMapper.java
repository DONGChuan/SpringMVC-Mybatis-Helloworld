package com.dong.web.mapper;

import com.dong.web.model.User;

import java.util.List;

public interface UserMapper {

    int getRowCount();

    List<User> getAllUsers();

}
