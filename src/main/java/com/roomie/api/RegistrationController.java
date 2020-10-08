package com.roomie.api;


import com.roomie.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

    //This will submit user registration info
    //Post to show registration
    @Controller
    public class RegistrationController {

        @GetMapping("/Registration")
        public String getRegistrationForm (Model model){
            model.addAttribute("registration", new Registration());
            return "Registration";
        }

        @PostMapping("/Registration")
        public String postRegistrationForm(@ModelAttribute Registration registration, Model model){
            model.addAttribute("registration", registration);
            return "ShowRegistration";
        }

    }


