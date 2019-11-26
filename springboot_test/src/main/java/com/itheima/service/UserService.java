package com.itheima.service;

import com.itheima.mapper.UserMapper;
import com.itheima.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author JinLu
 * @date 2019/11/25 21:25
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User queryById(Long id) {
        //根据id查询
        return userMapper.selectByPrimaryKey(id);
    }

    @Transactional
    public void saveUser(User user) {
        System.out.println("新增用户...");
        userMapper.insertSelective(user);

    }
}
