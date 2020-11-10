package com.roomie.model;

import javax.persistence.*;

@Entity
@Table(name = "user_profile")
public class UpdateUserProfileInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "headline")
    private String headLine;

    @Column(name = "profession")
    private String profession;

    @Column(name = "socialmedia")
    private String socialMedia;

    @Column(name = "age")
    private String age;

    @Column(name = "currentcity")
    private String currentCity;

    @Column(name = "language")
    private String language;

    @Column(name = "importantthing")
    private String importantThing;

    public UpdateUserProfileInformation() {
    }

    public UpdateUserProfileInformation(String headLine, String profession, String socialMedia,
                                        String age, String currentCity, String language, String importantThing) {
        this.headLine = headLine;
        this.profession = profession;
        this.socialMedia = socialMedia;
        this.age = age;
        this.currentCity = currentCity;
        this.language = language;
        this.importantThing = importantThing;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHeadLine() {
        return headLine;
    }

    public void setHeadLine(String headLine) {
        this.headLine = headLine;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getSocialMedia() {
        return socialMedia;
    }

    public void setSocialMedia(String socialMedia) {
        this.socialMedia = socialMedia;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCurrentCity() {
        return currentCity;
    }

    public void setCurrentCity(String currentCity) {
        this.currentCity = currentCity;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getImportantThing() {
        return importantThing;
    }

    public void setImportantThing(String importantThing) {
        this.importantThing = importantThing;
    }
}
