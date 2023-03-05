package com.atguigu.boot.controller;

import com.atguigu.boot.pojo.Person;
import com.atguigu.boot.pojo.Pet;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ResponseTestController {
    @GetMapping("/testPerson")
    @ResponseBody
    public Person getPerson() {
        Person person = new Person();
        person.setUsername("sc");
        person.setPassword("123321");
        person.setPet(new Pet("阿猫", 3));

        return person;
    }
}
