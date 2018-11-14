package com.mealplanner.app.controller;


import com.mealplanner.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/registration")
    public String registrationPage(Model model) {
        return "registration";
    }

    @PostMapping("registration")
    public String registerUser() {
        return "login";
    }
}
