package com.roomie.model;

import javax.persistence.*;

@Entity
@Table(name = "wallposts")
public class WallPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "wall_post")
    private String wallPost;

    public WallPost() {
    }

    public WallPost(String wallPost) {
        this.wallPost = wallPost;
    }

    public String getWallPost() {
        return wallPost;
    }

    public void setWallPost(String wallPost) {
        this.wallPost = wallPost;
    }
}
