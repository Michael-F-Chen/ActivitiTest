package com.ntc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

//    @RequestMapping("/")
//    public ModelAndView index() {
//        ModelAndView mv = new ModelAndView("test");
//        return mv;
//    }

    @RequestMapping("/")
    public String ind2ex() {
        return "test";
    }

}
