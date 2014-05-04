package com.xhyan.base.controller;

import com.xhyan.base.model.User;
import com.xhyan.base.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created by xhyan on 14-5-4.
 */
@Controller
@RequestMapping("/")
@ContextConfiguration(value = "classpath:/conf/spring-config.xml")
public class UserController
{
    @Autowired
    User user;
    @Autowired
    UserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    private String addUser(@Param("username")String username, @Param("password")String password, @Param("mail")String mail, ModelMap model)
    {

        user.setUsername(username);
        user.setPassword(password);
        user.setMail(mail);
        userService.insertUser(user);
        System.out.println("添加用户成功！！");
        model.addAttribute("username", username);
        model.addAttribute("password", password);
        model.addAttribute("mail", mail);
        return "user";
    }
}
