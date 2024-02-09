package com.example.Checkin_System.Repository;

import com.example.Checkin_System.Model.CheckIn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CheckInRepository extends JpaRepository<CheckIn, Long> {
    // Find CheckIns by username using a join
}

