package com.example.household.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    /*
    * ログイン画面表示
    */
    @GetMapping
    public ModelAndView login(ModelAndView mav) {

        mav.setViewName("/login");

        return mav;
    }
}
