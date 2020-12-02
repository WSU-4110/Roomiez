package com.roomie.service;

import com.roomie.model.NewUser;
import com.roomie.model.UserSurveyResults;
import com.roomie.web.NewUserRegistrationDto;
import com.roomie.web.UserSurveyResultsDto;

public interface UserSurveyResultsService {

    UserSurveyResults save(UserSurveyResultsDto userSurveyResultsDto);

    UserSurveyResults get(Long id);

}


