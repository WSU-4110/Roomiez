package com.roomie.service;

import com.roomie.Repository.NewUserRepository;
import com.roomie.Repository.UserSurveyResultsRepository;
import com.roomie.model.NewUser;
import com.roomie.model.UserSurveyResults;
import com.roomie.web.NewUserRegistrationDto;
import com.roomie.web.UserSurveyResultsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSurveyResultsImpl implements UserSurveyResultsService {

    @Autowired
    private UserSurveyResultsRepository userSurveyResultsRepository;

    private UserSurveyResultsImpl(UserSurveyResultsRepository userSurveyResultsRepository){
        super();
        this.userSurveyResultsRepository = userSurveyResultsRepository;
    }

    @Override
    public UserSurveyResults save(UserSurveyResultsDto userSurveyResultsDto){
        UserSurveyResults userSurveyResults = new UserSurveyResults(userSurveyResultsDto.getWhatDescribesYou(),
                userSurveyResultsDto.getExtrovertedOrIntroverted(), userSurveyResultsDto.getInviteFriendsOver(),
                userSurveyResultsDto.getCleaningHabits(), userSurveyResultsDto.getDoYouSmoke(),
                userSurveyResultsDto.getDoesRoommateSmoke(), userSurveyResultsDto.getDoYouDrink(),
                userSurveyResultsDto.getDoesRoommateDrink(), userSurveyResultsDto.getSleepSchedule(),
                userSurveyResultsDto.getCookingHabit(), userSurveyResultsDto.getMusicTaste(),
                userSurveyResultsDto.getHavePets(), userSurveyResultsDto.getWorkFromHome(),
                userSurveyResultsDto.getPetPeeves(), userSurveyResultsDto.getWhatAreYouLookingFor());
                return userSurveyResultsRepository.save(userSurveyResults);
    }

    @Override
    public UserSurveyResults get(Long id){
//        UserSurveyResults userSurveyResults = new UserSurveyResults();
//        userSurveyResults.setHavePets("yes");
        return userSurveyResultsRepository.findById(id).get();
    }
}




