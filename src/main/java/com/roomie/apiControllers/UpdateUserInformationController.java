package com.roomie.apiControllers;


import com.roomie.model.UpdateSurvey;
import com.roomie.model.UpdateUserProfile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UpdateUserInformationController {
    @GetMapping("/UpdateUserProfile")
    public String addProfileInformation(Model model){
        model.addAttribute("updateUserProfile", new UpdateUserProfile());
        model.addAttribute("updateSurvey", new UpdateSurvey());
        return "UpdateUserProfile";
    }

    @PostMapping("/UpdateUserProfile")
    public String postProfileInformation(@ModelAttribute UpdateUserProfile updateUserProfile, Model model){
        model.addAttribute("userUserProfile", updateUserProfile);
        return "UserProfile";
    }
}


