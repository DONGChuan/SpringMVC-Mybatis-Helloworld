package com.dong.web.mapper;

import com.dong.web.model.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    /**
     * XML-based and annotation based mapper
     */

    int getRowCount();

    @Select("select * from tb_user")
    List<User> getAllUsers();

}
