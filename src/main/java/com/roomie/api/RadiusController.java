package com.roomie.api;


import com.roomie.model.Radius;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RadiusController {

    @PostMapping("/SearchByLocation")
    public String addRadiusForm(@ModelAttribute Radius radius, Model model){
        model.addAttribute("radius", radius);
        return "SearchLocation";
    }

    @GetMapping("/SearchByLocation")
    public String addRadiusSubmit(Model model){
        model.addAttribute("radius", new Radius());
        return "SearchLocation";
    }
}
