package com.atguigu.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewTestController {
    @GetMapping("/atguigu")
    public String gotoguigu(Model model) {
        model.addAttribute("msg", "欢迎您");
        model.addAttribute("link", "http://www.baidu.com");
        return "success";
    }
}
