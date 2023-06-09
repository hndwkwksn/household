package com.example.household.controller.form;

import lombok.Data;

import java.util.Date;

@Data
public class UserForm {

    private int id;

    private String email;

    private String password;

    private Date createdDate;

    private Date updatedDate;
}
