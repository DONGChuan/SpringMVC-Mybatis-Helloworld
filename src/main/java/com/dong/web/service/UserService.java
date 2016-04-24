package com.dong.web.service;

import com.dong.web.mapper.UserMapper;
import com.dong.web.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public int getRowCount() {
        return userMapper.getRowCount();
    }

    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }

}
