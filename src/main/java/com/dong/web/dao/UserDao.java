package com.dong.web.dao;

import com.dong.web.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    int getRowCount();

    List<User> getAllUsers();

}
