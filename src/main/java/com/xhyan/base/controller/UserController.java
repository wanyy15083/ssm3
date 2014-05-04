package com.xhyan.base.controller;

import com.xhyan.base.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


/**
 * Created by xhyan on 14-5-4.
 */
@Controller
public class UserController
{
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    private String addUser(@Param("username")String username, @Param("password")String password, @Param("mail")String mail, ModelMap model)
    {
        model.addAttribute("username", username);
        model.addAttribute("password", password);
        model.addAttribute("mail", mail);
        return "user";
    }
}
