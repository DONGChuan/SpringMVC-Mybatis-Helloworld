package com.dong.web.service;

import com.dong.web.dao.UserDao;
import com.dong.web.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Resource
    private UserDao userDao;

    public int getRowCount() {
        return userDao.getRowCount();
    }

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

}
