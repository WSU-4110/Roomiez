package com.roomie.web;

public class NewUserRegistrationDto {

    private String username;
    private String email;
    private String password;
    private String birthday;
    private String gender;

    public NewUserRegistrationDto() {
    }

    public NewUserRegistrationDto(String username, String email, String password, String birthday) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.birthday = birthday;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
