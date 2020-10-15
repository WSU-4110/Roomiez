package com.roomie.api;

import com.roomie.model.Login;
import com.roomie.model.Radius;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping("/LogIn")
    public String addRadiusSubmit(Model model){
        model.addAttribute("login", new Login());
        return "LogIn";
    }

    @PostMapping("/LogIn")
    public String addRadiusForm(@ModelAttribute Login login, Model model){
        model.addAttribute("login", login);
        return "UserHomePage";
    }

}
