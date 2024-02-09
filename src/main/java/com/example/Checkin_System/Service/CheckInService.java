package com.example.Checkin_System.Service;

import com.example.Checkin_System.Model.CheckIn;
import com.example.Checkin_System.Model.User;
import com.example.Checkin_System.Repository.CheckInRepository;
import com.example.Checkin_System.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckInService {

    private final CheckInRepository checkInRepository;

    @Autowired
    public CheckInService(CheckInRepository checkInRepository, UserRepository userRepository) {
        this.checkInRepository = checkInRepository;
    }




    public List<CheckIn> findAllCheckIns() {
        return checkInRepository.findAll();
    }

    // Additional service methods as needed
}
