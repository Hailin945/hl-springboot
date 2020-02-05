package com.hl.springboot.druid.user.dao;

import com.hl.springboot.druid.user.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Hailin
 * @date 2020/2/4
 */
@Mapper
public interface UserMapper {

    @Select("SELECT * FROM user")
    List<User> list();
}
