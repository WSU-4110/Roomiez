package com.roomie.service;

import com.roomie.Repository.WallPostRepository;
import com.roomie.model.WallPost;
import com.roomie.web.WallPostDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WallPostImpl implements WallPostService{

    @Autowired
    private WallPostRepository wallPostRepository;

    public WallPostImpl(WallPostRepository wallPostRepository) {
        this.wallPostRepository = wallPostRepository;
    }

    @Override
    public WallPost save(WallPostDto wallPostDto) {
        WallPost wallPost = new WallPost(wallPostDto.getWallPost());
        return wallPostRepository.save(wallPost);
    }

    @Override
    public WallPost get(Long id) {
        return wallPostRepository.findById(id).get();
    }
}
