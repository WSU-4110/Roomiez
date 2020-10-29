package com.roomie.apiControllers;

import com.roomie.model.Login;
import com.roomie.model.UpdateSurvey;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UpdateSurveyController {

    @GetMapping("/UpdateUserProfile")
    public String addUserInformation(Model model){
        model.addAttribute("updateSurvey", new UpdateSurvey());
        return "UpdateUserProfile";
    }

    @PostMapping("/UpdateUserProfile")
    public String postUserInformation(@ModelAttribute UpdateSurvey updateSurvey, Model model){
        model.addAttribute("updateSurvey", updateSurvey);
        return "UserProfile";
    }
}
