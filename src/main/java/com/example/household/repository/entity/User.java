package com.example.household.repository.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
//@Table
@Data
public class User {

    @Id
    private int id;

    private String email;

    private String password;

    private Date createdDate;

    private Date updatedDate;
}
