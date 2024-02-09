package com.example.Checkin_System.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "CheckIns")
public class CheckIn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "location", nullable = false)
    private String location;

    @Column(name = "checkin_time", nullable = false)
    private Timestamp checkinTime;

    @ManyToOne
    @JoinColumn(name = "user_name", referencedColumnName = "user_name", nullable = false, foreignKey = @ForeignKey(name = "FK_CheckIns_Users"))
    private User user;



    // Getters and Setters
    // Getters
    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public Timestamp getCheckinTime() {
        return checkinTime;
    }

    public User getUser() {
        return user;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setCheckinTime(Timestamp checkinTime) {
        this.checkinTime = checkinTime;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
