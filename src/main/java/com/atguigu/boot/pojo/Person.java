package com.atguigu.boot.pojo;

import lombok.Data;

@Data
public class Person {
    private String username;
    private String password;
    private Pet pet;
}
