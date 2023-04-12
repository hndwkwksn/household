package com.example.household.controller;

import com.example.household.controller.form.UserForm;
import com.example.household.repository.entity.User;
import com.example.household.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    UserService userService;

    /*
     * ログイン画面表示
     */
    @GetMapping("/login")
    public ModelAndView login(ModelAndView mav,
                              UserForm userForm) {

        mav.setViewName("/login");

        mav.addObject("userForm", userForm);

        return mav;
    }
    
    /*
    * ログイン処理
    */
    @PostMapping("/user/login")
    public ModelAndView doLogin(UserForm userForm,
                                HttpSession session) {

        User user = userService.select(userForm);

        session.setAttribute("loginUser", user);

        return new ModelAndView("/");
    }
}
