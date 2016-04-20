package com.dong.web.service;

import com.dong.web.dao.TestDao;
import com.dong.web.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {

    @Resource
    private TestDao testDao;

    public int getRowCount() {
        return testDao.getRowCount();
    }

    public List<User> getAllUsers() {
        return testDao.getAllUsers();
    }

}
