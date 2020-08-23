package com.example.garden.entity;

import javax.persistence.*;

@Entity
@Table(name = "user_profile")
public class UserProfile {

    public UserProfile() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String secondName;
    private String mail;
    private String password;
    private String social;
    private String phone;
    private String userStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSocial() {
        return social;
    }

    public void setSocial(String social) {
        this.social = social;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    @Override
    public String toString() {
        return "{id = " + id + "; " +
                "firstName = " + firstName + "; " +
                "secondName = " + secondName + "; " +
                "mail = " + mail + "; " +
                "social = " + social + "; " +
                "phone = " + phone + ";} ";

    }
}
