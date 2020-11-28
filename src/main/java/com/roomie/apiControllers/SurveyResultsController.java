package com.roomie.apiControllers;


import com.roomie.model.UpdateUserProfileInformation;
import com.roomie.model.UserSurveyResults;
import com.roomie.model.WallPost;
import com.roomie.service.UpdateUserProfileInformationService;
import com.roomie.service.UserSurveyResultsService;
import com.roomie.service.WallPostService;
import com.roomie.web.WallPostDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/surveyResults")
public class SurveyResultsController {

    private UserSurveyResultsService userSurveyResultsService;
    private UpdateUserProfileInformationService updateUserProfileInformationService;
    private WallPostService wallPostService;


    public SurveyResultsController(UserSurveyResultsService userSurveyResultsService,
                                   UpdateUserProfileInformationService updateUserProfileInformationService,
                                   WallPostService wallPostService) {
        this.userSurveyResultsService = userSurveyResultsService;
        this.updateUserProfileInformationService = updateUserProfileInformationService;
        this.wallPostService = wallPostService;
    }



    @PostMapping
    public String postWallPost(@ModelAttribute("wallpost") WallPostDto wallPostDto){
        wallPostService.save(wallPostDto);
        return "redirect:/surveyResults?success?";
    }


    @GetMapping
    public String getSurveyStuff(Model model){
        UserSurveyResults surveyResults = userSurveyResultsService.get((long) 7);
        model.addAttribute("results", surveyResults);

        UpdateUserProfileInformation basicInfoResults = updateUserProfileInformationService.get((long) 3);
        model.addAttribute("basicinforesults", basicInfoResults);

        model.addAttribute("wallpost",new WallPostDto());

        WallPost wallPost = wallPostService.get((long) 10);
        model.addAttribute("wallpostresults", wallPost);


        return "UserHomePage";
    }


}






