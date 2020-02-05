package com.hl.springboot.druid.user.controller;

import com.hl.springboot.druid.user.pojo.User;
import com.hl.springboot.druid.user.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Hailin
 * @date 2020/2/4
 */
@RestController
@RequestMapping("/v1.0.0/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping
    public List<User> list() {
        return userService.list();
    }
}
