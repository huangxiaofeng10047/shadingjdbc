package com.example.shadingjdbc.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.shadingjdbc.model.User;

import java.util.List;

public interface UserService extends IService<User> {
    void insert(User user);

    User findById(Long id);

    List<User> findAll();

    List<User> queryList(Page<User> page, Integer enable);
}
