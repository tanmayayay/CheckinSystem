package com.example.Checkin_System.Repository;

import com.example.Checkin_System.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    // Example custom query to find a User by userName
    User findByUserName(String userName);

}
