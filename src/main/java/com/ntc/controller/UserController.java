package com.ntc.controller;

import org.activiti.engine.IdentityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    
    @Autowired
    private IdentityService identityService;

    @RequestMapping("/login")
    public String login(String name, String passwd, HttpSession session) {
        long l =  identityService.createUserQuery().count();
        boolean success = identityService.checkPassword(name, passwd);
        if(success) {
            session.setAttribute("user", name);
            return "main";
        } else {
            return "login";
        }
    }
}
