package com.example.household.controller;

import com.example.household.repository.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class HomeController {

    /*
    * ホーム画面表示
    */
    @GetMapping
    public ModelAndView home(ModelAndView mav,
                             HttpSession session) {

        User user = (User) session.getAttribute("loginUser");

        mav.setViewName("/home");
        mav.addObject("user", user);

        return mav;
    }
}
