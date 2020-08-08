package com.qf.controller;

import com.qf.dao.UserMapper;
import com.qf.pojo.User;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RequestMapping("user")
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("findbyIdAndPwd")
    public String findbyIdAndPwd(String idcard, String pwd, HttpServletRequest request){
        int i = userService.findbyIdAndPwd(idcard, pwd);
        if(i > 0){
            User user = new User();
            user.setIdcard(idcard);
            user.setPwd(pwd);
            HttpSession session = request.getSession();
            session.setAttribute("user",user);
            return "success";
        }
        return "failed";
    }
    @RequestMapping("findbyIdcard")
    public String findbyIdcard(String idcard){
        int i = userService.findbyIdcard(idcard);
        if(i > 0){
            return "success";
        }
        return "failed";
    }
    @RequestMapping("adduser")
    public String adduser(User user){
        int i = userService.adduser(user);
        if(i > 0){
            return "success";
        }
        return "failed";
    }
}
