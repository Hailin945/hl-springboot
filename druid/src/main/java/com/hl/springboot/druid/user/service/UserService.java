package com.hl.springboot.druid.user.service;

import com.hl.springboot.druid.user.pojo.User;

import java.util.List;

/**
 * @author Hailin
 * @date 2020/2/4
 */
public interface UserService {

    List<User> list();
}
