package com.roomie.apiControllers;

import com.roomie.model.Login;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping("/LogIn")
    public String addLoginSubmit(Model model){
        model.addAttribute("login", new Login());
        return "LogIn";
    }

    @PostMapping("/LogIn")
    public String addLoginForm(@ModelAttribute Login login, Model model){
        model.addAttribute("login", login);
        return "PotentialMatches";
    }

}
