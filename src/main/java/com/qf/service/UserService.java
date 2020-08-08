package com.qf.service;

import com.qf.pojo.User;

public interface UserService {
    int findbyIdAndPwd(String idcard, String pwd);

    int findbyIdcard(String idcard);

    int adduser(User user);
}
