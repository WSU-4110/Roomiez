package com.roomie.service;

import com.roomie.model.WallPost;
import com.roomie.web.WallPostDto;

public interface WallPostService {

    WallPost save(WallPostDto wallPostDto);

    WallPost get(Long id);
}
