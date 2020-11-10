package com.roomie.Repository;

import com.roomie.model.UpdateUserProfileInformation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UpdateUserProfileInformationRepository extends CrudRepository<UpdateUserProfileInformation, Long> {

}
