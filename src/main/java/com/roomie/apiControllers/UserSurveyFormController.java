package com.roomie.apiControllers;

import com.roomie.Repository.UserSurveyResultsRepository;
import com.roomie.model.UserSurveyResults;
import com.roomie.service.NewUserService;
import com.roomie.service.UserSurveyResultsService;
import com.roomie.web.NewUserRegistrationDto;
import com.roomie.web.UserSurveyResultsDto;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/surveyForm")
public class UserSurveyFormController {

    private UserSurveyResultsService userSurveyResultsService;

    public UserSurveyFormController(UserSurveyResultsService userSurveyResultsService) {
        this.userSurveyResultsService = userSurveyResultsService;
    }

    @ModelAttribute
    public UserSurveyResultsDto userSurveyResultsDto() {
        return new UserSurveyResultsDto();
    }


    @GetMapping
    public String showUpdateSurveyResults(Model model){
        model.addAttribute("update", new UserSurveyResultsDto());
        return "updateUserProfile";
    }

    @PostMapping
    public String postUpdateSurveyResults(@ModelAttribute("update") UserSurveyResultsDto userSurveyResultsDto){
        userSurveyResultsService.save(userSurveyResultsDto);
        return "redirect:/surveyForm?success";
    }



}





