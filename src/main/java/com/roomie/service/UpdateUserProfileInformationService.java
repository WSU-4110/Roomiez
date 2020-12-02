package com.roomie.service;

import com.roomie.model.UpdateUserProfileInformation;
import com.roomie.web.UpdateUserProfileInformationDto;

public interface UpdateUserProfileInformationService {

    UpdateUserProfileInformation save(UpdateUserProfileInformationDto updateUserProfileInformationDto);

    UpdateUserProfileInformation get(Long id);

    UpdateUserProfileInformation getByUserId(Long userId);
}
