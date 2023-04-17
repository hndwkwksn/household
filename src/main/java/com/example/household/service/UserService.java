package com.example.household.service;

import com.example.household.controller.form.UserForm;
import com.example.household.repository.UserRepository;
import com.example.household.repository.entity.User;
import com.example.household.util.CipherUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
    /*
    * ユーザー情報を取得
    * パスワードは暗号化
    */
    public User select(UserForm reqUser) {

        // パスワードを暗号化
        String encPassword = CipherUtil.encrypt(reqUser.getPassword());
        String password = reqUser.getPassword();

        String email = reqUser.getEmail();

        User user = userRepository.findByEmailAndPassword(email, password);

        return user;
    }
}
