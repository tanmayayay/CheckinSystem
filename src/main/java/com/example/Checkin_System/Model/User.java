package com.example.Checkin_System.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "given_name", nullable = false)
    private String givenName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "military_id", unique = true, nullable = false)
    private String militaryId;

    @Column(name = "military_rank")
    private String militaryRank;

    @Column(name = "user_name", unique = true, nullable = false)
    private String userName;

    @Column(name = "password_hash", nullable = false)
    private String passwordHash;

    @Column(name = "profile_photo")
    private String profilePhoto;

    // Getters and Setters
    // Getters
    public int getId() {
        return id;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMilitaryId() {
        return militaryId;
    }

    public String getMilitaryRank() {
        return militaryRank;
    }

    public String getUserName() {
        return userName;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public String getProfilePhoto() {
        return profilePhoto;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMilitaryId(String militaryId) {
        this.militaryId = militaryId;
    }

    public void setMilitaryRank(String militaryRank) {
        this.militaryRank = militaryRank;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }
}