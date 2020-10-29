//package com.roomie.model;
//
//import javax.persistence.*;
//import java.sql.Date;
//import java.util.Objects;
//
//@Entity
//@Table(name = "registration", schema = "public", catalog = "postgres")
//public class RegistrationEntity {
//    private int id;
//    private String username;
//    private String password;
//    private Date birthday;
//    private String email;
//
//    @Id
//    @Column(name = "id")
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    @Basic
//    @Column(name = "username")
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    @Basic
//    @Column(name = "password")
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    @Basic
//    @Column(name = "birthday")
//    public Date getBirthday() {
//        return birthday;
//    }
//
//    public void setBirthday(Date birthday) {
//        this.birthday = birthday;
//    }
//
//    @Basic
//    @Column(name = "email")
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        RegistrationEntity that = (RegistrationEntity) o;
//        return id == that.id &&
//                Objects.equals(username, that.username) &&
//                Objects.equals(password, that.password) &&
//                Objects.equals(birthday, that.birthday) &&
//                Objects.equals(email, that.email);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, username, password, birthday, email);
//    }
//}
