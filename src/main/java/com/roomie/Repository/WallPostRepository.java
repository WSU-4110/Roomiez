package com.roomie.Repository;

import com.roomie.model.UserSurveyResults;
import com.roomie.model.WallPost;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WallPostRepository extends CrudRepository<WallPost, Long> {



}
