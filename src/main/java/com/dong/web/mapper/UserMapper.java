package com.dong.web.mapper;

import com.dong.web.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    int getRowCount();

    List<User> getAllUsers();

}
