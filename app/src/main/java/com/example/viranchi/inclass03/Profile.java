package com.example.viranchi.inclass03;

import java.io.Serializable;

/**
 * Created by Viranchi on 17-09-2017.
 */

public class Profile implements Serializable{
    private String name;
    private String email;
    private String department;
    private String mood;
    private int imgAvatarId;
    private int imgMoodId;

    public Profile(String name, String email, String department, String mood, int imgAvatarId, int imgMoodId) {
        this.name = name;
        this.email = email;
        this.department = department;
        this.mood = mood;
        this.imgAvatarId = imgAvatarId;
        this.imgMoodId = imgMoodId;
    }

    public void setImgMoodId(int imgMoodId) {
        this.imgMoodId = imgMoodId;
    }

    public int getImgMoodId() {
        return imgMoodId;
    }

    public void setImgAvatarId(int imgAvatarId) {
        this.imgAvatarId = imgAvatarId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getDepartment() {
        return department;
    }

    public String getMood() {
        return mood;
    }

    public int getImgAvatarId() {
        return imgAvatarId;
    }

    public Profile() {
    }
}
