package com.roomie.apiControllers;


import com.roomie.model.UpdateUserProfileInformation;
import com.roomie.model.UserSurveyResults;
import com.roomie.service.UpdateUserProfileInformationService;
import com.roomie.service.UserSurveyResultsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/surveyResults")
public class SurveyResultsController {

    private UserSurveyResultsService userSurveyResultsService;
    private UpdateUserProfileInformationService updateUserProfileInformationService;

    public SurveyResultsController(UserSurveyResultsService userSurveyResultsService, UpdateUserProfileInformationService updateUserProfileInformationService) {
        this.userSurveyResultsService = userSurveyResultsService;
        this.updateUserProfileInformationService = updateUserProfileInformationService;
    }



    @GetMapping
    public String getSurveyStuff(Model model){
        UserSurveyResults surveyResults = userSurveyResultsService.get((long) 7);
        model.addAttribute("results", surveyResults);
        UpdateUserProfileInformation basicInfoResults = updateUserProfileInformationService.get((long) 3);
        model.addAttribute("basicinforesults", basicInfoResults);
        return "UserHomePage";
    }


}
