package com.roomie.service;

import com.roomie.Repository.UpdateUserProfileInformationRepository;
import com.roomie.model.UpdateUserProfileInformation;
import com.roomie.web.UpdateUserProfileInformationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpdateUserProfileInformationImpl implements UpdateUserProfileInformationService{

    @Autowired
    private UpdateUserProfileInformationRepository updateUserProfileInformationRepository;

    private UpdateUserProfileInformationImpl(UpdateUserProfileInformationRepository updateUserProfileInformationRepository){
        super();
        this.updateUserProfileInformationRepository = updateUserProfileInformationRepository;
    }

    @Override
    public UpdateUserProfileInformation save(UpdateUserProfileInformationDto updateUserProfileInformationDto){
        UpdateUserProfileInformation updateUserProfileInformation = new UpdateUserProfileInformation(
        updateUserProfileInformationDto.getHeadLine(), updateUserProfileInformationDto.getProfession(),
        updateUserProfileInformationDto.getSocialMedia(), updateUserProfileInformationDto.getAge(),
        updateUserProfileInformationDto.getCurrentCity(), updateUserProfileInformationDto.getLanguage(),
        updateUserProfileInformationDto.getImportantThing());
        return updateUserProfileInformationRepository.save(updateUserProfileInformation);
    }

    @Override
    public UpdateUserProfileInformation get(Long id){
        return updateUserProfileInformationRepository.findById(id).get();
    }
}
