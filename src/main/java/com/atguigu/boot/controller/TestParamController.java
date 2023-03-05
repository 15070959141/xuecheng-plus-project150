package com.atguigu.boot.controller;

import com.atguigu.boot.pojo.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TestParamController {
    @GetMapping("/car/{id}/yonhu/{username}")
    public Map<String, Object> getCar(@PathVariable("id") Integer id,
                                      @PathVariable("username") String name,
                                      @PathVariable Map<String, String> pv,
                                      @RequestHeader("User-Agent") String userAgent,
                                      @RequestHeader Map<String, String> header) {
        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        map.put("name", name);
        map.put("pv", pv);
        map.put("userAgent", userAgent);
        map.put("header", header);
        return map;
    }

    @PostMapping("/save")
    public Map<String, Object> getMap(@RequestBody String requestbody) {
        Map<String, Object> map = new HashMap<>();
        map.put("requestBody", requestbody);
        return map;
    }

    @GetMapping("/car/{path}")
    public Map getPath(@MatrixVariable("price") Integer price,
                       @MatrixVariable("names") List<String> names,
                       @PathVariable("path") String path) {
        Map<String, Object> map = new HashMap<>();
        map.put("price", price);
        map.put("names", names);
        map.put("path", path);

        return map;
    }

    @GetMapping("/boss/{boosId}/{empId}")
    public Map getPath(@MatrixVariable(value = "age", pathVar = "boosId") Integer boosAge,
                       @MatrixVariable(value = "age", pathVar = "empId") Integer empAge
    ) {
        Map<String, Object> map = new HashMap<>();
        map.put("boosAge", boosAge);
        map.put("empAge", empAge);

        return map;
    }

    @PostMapping("/testconverter")
    public Person testconverter(Person person) {
        return person;
    }
}
