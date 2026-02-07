package com.myproject.microservicesproject.controller;

import ch.qos.logback.core.model.Model;
import com.myproject.microservicesproject.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class HomeController {

    @RequestMapping("/")
    public String HomeController() {
        return "Hello World";
    }

    @GetMapping("/user")
    public User user(){
        User user = new User();
        user.setId("1");
        user.setName("Shabbir");
        user.setEmailId("shabbir@gamil.com");

        return user;
    }

    @GetMapping("/{id}")
    public String pathVariable(@PathVariable String id){
        return "Path variable is" + id;
    }

    @GetMapping("/requestParam")
    public String requsetParams(@RequestParam String name,
                                @RequestParam(required = false, defaultValue = "") String emailId){
        return "Request param is " + name + " and EmailId is" + emailId;
    }
}
