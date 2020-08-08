package com.qf.service.impl;

import com.qf.dao.UserMapper;
import com.qf.pojo.User;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int findbyIdAndPwd(String idcard, String pwd) {
        User user = new User();
        user.setIdcard(idcard);
        user.setPwd(pwd);
        User user1 = userMapper.selectByCardAndPwd(user);
        if (user1 != null && user1 != null) {
            return 1;
        }
        return 0;
    }

    @Override
    public int findbyIdcard(String idcard) {
        User user = new User();
        user.setIdcard(idcard);
        User user1 = userMapper.selectByCardAndPwd(user);
        if (user1 != null) {
            return 1;
        }
        return 0;
    }

    @Override
    public int adduser(User user) {
        return userMapper.insertSelective(user);
    }
}
