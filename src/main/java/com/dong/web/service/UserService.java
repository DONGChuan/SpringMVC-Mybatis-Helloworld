package com.dong.web.service;

import com.dong.web.mapper.UserMapper;
import com.dong.web.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    // IDE could mention here `Could not autowired`. Because MapperScannerConfigurer have not create MapperFactoryBean yet.
    @Resource
    private UserMapper userMapper;

    @Transactional
    public int getRowCount() {
        return userMapper.getRowCount();
    }

    @Transactional
    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }

}
