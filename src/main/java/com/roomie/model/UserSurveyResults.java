package com.roomie.model;

import javax.persistence.*;

@Entity
@Table(name = "user_survey")
public class UserSurveyResults {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "whatdescribesyou")
    private String whatDescribesYou;

    @Column(name = "extrovertedorintroverted")
    private String extrovertedOrIntroverted;

    @Column(name = "invitefriendsover")
    private String inviteFriendsOver;

    @Column(name = "cleaninghabits")
    private String cleaningHabits;

    @Column(name = "doyousmoke")
    private String doYouSmoke;

    @Column(name = "doesroommatesmoke")
    private String doesRoommateSmoke;

    @Column(name = "doyoudrink")
    private String doYouDrink;

    @Column(name = "doesroommatedrink")
    private String doesRoommateDrink;

    @Column(name = "sleepschedule")
    private String sleepSchedule;

    @Column(name = "cookinghabit")
    private String cookingHabit;

    @Column(name = "musictaste")
    private String musicTaste;

    @Column(name = "havepets")
    private String havePets;

    @Column(name = "workfromhome")
    private String workFromHome;

    @Column(name = "petpeeves")
    private String petPeeves;

    @Column(name = "whatareyoulookingfor")
    private String whatAreYouLookingFor;


    public UserSurveyResults() {
    }

    public UserSurveyResults(String whatDescribesYou, String extrovertedOrIntroverted, String inviteFriendsOver, String cleaningHabits, String doYouSmoke, String doesRoommateSmoke, String doYouDrink, String doesRoommateDrink, String sleepSchedule, String cookingHabit, String musicTaste, String havePets, String workFromHome, String petPeeves, String whatAreYouLookingFor) {
        this.whatDescribesYou = whatDescribesYou;
        this.extrovertedOrIntroverted = extrovertedOrIntroverted;
        this.inviteFriendsOver = inviteFriendsOver;
        this.cleaningHabits = cleaningHabits;
        this.doYouSmoke = doYouSmoke;
        this.doesRoommateSmoke = doesRoommateSmoke;
        this.doYouDrink = doYouDrink;
        this.doesRoommateDrink = doesRoommateDrink;
        this.sleepSchedule = sleepSchedule;
        this.cookingHabit = cookingHabit;
        this.musicTaste = musicTaste;
        this.havePets = havePets;
        this.workFromHome = workFromHome;
        this.petPeeves = petPeeves;
        this.whatAreYouLookingFor = whatAreYouLookingFor;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWhatDescribesYou() {
        return whatDescribesYou;
    }

    public void setWhatDescribesYou(String whatDescribesYou) {
        this.whatDescribesYou = whatDescribesYou;
    }

    public String getExtrovertedOrIntroverted() {
        return extrovertedOrIntroverted;
    }

    public void setExtrovertedOrIntroverted(String extrovertedOrIntroverted) {
        this.extrovertedOrIntroverted = extrovertedOrIntroverted;
    }

    public String getInviteFriendsOver() {
        return inviteFriendsOver;
    }

    public void setInviteFriendsOver(String inviteFriendsOver) {
        this.inviteFriendsOver = inviteFriendsOver;
    }

    public String getCleaningHabits() {
        return cleaningHabits;
    }

    public void setCleaningHabits(String cleaningHabits) {
        this.cleaningHabits = cleaningHabits;
    }

    public String getDoYouSmoke() {
        return doYouSmoke;
    }

    public void setDoYouSmoke(String doYouSmoke) {
        this.doYouSmoke = doYouSmoke;
    }

    public String getDoesRoommateSmoke() {
        return doesRoommateSmoke;
    }

    public void setDoesRoommateSmoke(String doesRoommateSmoke) {
        this.doesRoommateSmoke = doesRoommateSmoke;
    }

    public String getDoYouDrink() {
        return doYouDrink;
    }

    public void setDoYouDrink(String doYouDrink) {
        this.doYouDrink = doYouDrink;
    }

    public String getDoesRoommateDrink() {
        return doesRoommateDrink;
    }

    public void setDoesRoommateDrink(String doesRoommateDrink) {
        this.doesRoommateDrink = doesRoommateDrink;
    }

    public String getSleepSchedule() {
        return sleepSchedule;
    }

    public void setSleepSchedule(String sleepSchedule) {
        this.sleepSchedule = sleepSchedule;
    }

    public String getCookingHabit() {
        return cookingHabit;
    }

    public void setCookingHabit(String cookingHabit) {
        this.cookingHabit = cookingHabit;
    }

    public String getMusicTaste() {
        return musicTaste;
    }

    public void setMusicTaste(String musicTaste) {
        this.musicTaste = musicTaste;
    }

    public String getHavePets() {
        return havePets;
    }

    public void setHavePets(String havePets) {
        this.havePets = havePets;
    }

    public String getWorkFromHome() {
        return workFromHome;
    }

    public void setWorkFromHome(String workFromHome) {
        this.workFromHome = workFromHome;
    }

    public String getPetPeeves() {
        return petPeeves;
    }

    public void setPetPeeves(String petPeeves) {
        this.petPeeves = petPeeves;
    }

    public String getWhatAreYouLookingFor() {
        return whatAreYouLookingFor;
    }

    public void setWhatAreYouLookingFor(String whatAreYouLookingFor) {
        this.whatAreYouLookingFor = whatAreYouLookingFor;
    }
}
