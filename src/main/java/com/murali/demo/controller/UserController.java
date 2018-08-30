package com.murali.demo.controller;

import com.murali.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping("/")
    public String userForm(Model model) {
        model.addAttribute("user", new User());
        return "index";
    }

    @PostMapping("/user")
    public String userFormSubmit(@ModelAttribute User user) {
        return "cv";
    }

}
