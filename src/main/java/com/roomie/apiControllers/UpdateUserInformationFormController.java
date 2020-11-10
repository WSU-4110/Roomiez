package com.roomie.apiControllers;

import com.roomie.service.UpdateUserProfileInformationService;
import com.roomie.web.UpdateUserProfileInformationDto;
import com.roomie.web.UserSurveyResultsDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/aboutmeForm")
public class UpdateUserInformationFormController {

    private UpdateUserProfileInformationService updateUserProfileInformationService;

    public UpdateUserInformationFormController(UpdateUserProfileInformationService updateUserProfileInformationService) {
        this.updateUserProfileInformationService = updateUserProfileInformationService;
    }

    @ModelAttribute
    public UpdateUserProfileInformationDto updateUserProfileInformationDto(){
        return new UpdateUserProfileInformationDto();
    }

    @GetMapping
    public String showUpdatedInformation(Model model){
        model.addAttribute("updateinfo", new UpdateUserProfileInformationDto());
        model.addAttribute("update", new UserSurveyResultsDto());
        return "updateUserProfile";
    }

    @PostMapping
    public String postUpdateInformationResults(@ModelAttribute("updateinfo") UpdateUserProfileInformationDto updateUserProfileInformationDto){
        updateUserProfileInformationService.save(updateUserProfileInformationDto);
        return "redirect:/aboutmeForm?success";
    }
}
