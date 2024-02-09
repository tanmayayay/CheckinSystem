package com.example.Checkin_System.Service;

import com.example.Checkin_System.Model.User;
import com.example.Checkin_System.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public User findByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }


    public User registerUser(User user) {
        // Additional logic can be added here (e.g., validation, encoding passwords)
        return userRepository.save(user);
    }



    // Additional service methods as needed
}
