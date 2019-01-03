package com.mealplanner.app.controller;


import com.mealplanner.app.model.User;
import com.mealplanner.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {

    @Autowired
    private UserService userService;

    @GetMapping("/registration")
    public String registrationPage(Model model) {
        model.addAttribute("newUser", new User());
        return "registration";
    }

    @PostMapping("/registration")
    public String registerUser(@ModelAttribute User user) {
        userService.save(user);
        return "login";
    }
}
