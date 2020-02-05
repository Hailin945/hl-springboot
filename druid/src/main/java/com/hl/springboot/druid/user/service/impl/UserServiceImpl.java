package com.hl.springboot.druid.user.service.impl;

import com.hl.springboot.druid.user.dao.UserMapper;
import com.hl.springboot.druid.user.pojo.User;
import com.hl.springboot.druid.user.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Hailin
 * @date 2020/2/4
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> list() {
        return userMapper.list();
    }
}
