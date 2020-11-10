package com.roomie.apiControllers;


import com.roomie.model.UserSurveyResults;
import com.roomie.service.UserSurveyResultsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/surveyResults")
public class SurveyResultsController {

    private UserSurveyResultsService userSurveyResultsService;

    public SurveyResultsController(UserSurveyResultsService userSurveyResultsService) {
        this.userSurveyResultsService = userSurveyResultsService;
    }

    @GetMapping
    public String getSurveyStuff(Model model){
        UserSurveyResults surveyResults = userSurveyResultsService.get((long) 1);
        model.addAttribute("results", surveyResults);
        return "UserHomePage";
    }
}
