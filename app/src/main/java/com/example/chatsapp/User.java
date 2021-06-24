package com.example.chatsapp;

public class User {
    private String uid,name,profileImage,phoneNumber;

    public User(){
        
    }

    public User(String uid, String name, String profileImage, String phoneNumber) {
        this.uid = uid;
        this.name = name;
        this.profileImage = profileImage;
        this.phoneNumber = phoneNumber;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
