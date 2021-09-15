package com.example.shadingjdbc.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.shadingjdbc.dao.UserMapper;
import com.example.shadingjdbc.model.User;
import com.example.shadingjdbc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void insert(User entity) {
        userMapper.insert(entity);
    }

    @Override
    public User findById(Long id) {
        return userMapper.selectById(id);
    }

    @Override
    public List<User> findAll() {
        return userMapper.selectList(Wrappers.<User>lambdaQuery());
    }

    @Override
    public List<User> queryList(Page<User> page, Integer enable) {
        return userMapper.selectPageByEnable(page, enable).getRecords();
    }

}
