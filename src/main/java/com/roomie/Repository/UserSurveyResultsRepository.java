package com.roomie.Repository;

import com.roomie.model.UserSurveyResults;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserSurveyResultsRepository extends CrudRepository<UserSurveyResults, Long> {

}
