package com.myproject.microservicesproject.controller;

import com.myproject.microservicesproject.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HomeController {

    @RequestMapping("/")
    public String HomeController() {
        return "Hello World";
    }

    @RequestMapping("/user")
    public User user(){
        User user = new User();
        user.setId("1");
        user.setName("Shabbir");
        user.setEmailId("shabbir@gamil.com");

        return user;
    }
}
