package com.example.Checkin_System.Controller;

import com.example.Checkin_System.Model.CheckIn;
import com.example.Checkin_System.Model.User;
import com.example.Checkin_System.Service.CheckInService;
import com.example.Checkin_System.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class controller {


    @Autowired
    private UserService userService;
    @Autowired
    private CheckInService checkInService;


    @GetMapping("/")
    public String home() {
        return "Welcome to the application!";
    }
    @GetMapping("/allUsers")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.findAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/allCheckIns")
    public ResponseEntity<List<CheckIn>> getAllCheckIns() {
        List<CheckIn> checkIns = checkInService.findAllCheckIns();
        if (checkIns.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(checkIns, HttpStatus.OK);
    }

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        User registeredUser = userService.registerUser(user);
        return new ResponseEntity<>(registeredUser, HttpStatus.CREATED);
    }
}
