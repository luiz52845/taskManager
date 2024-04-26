package com.taskmanager.taskmanager.Service;

import com.taskmanager.taskmanager.Entity.User;
import com.taskmanager.taskmanager.Repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    // private final PasswordEncoder passwordEncoder;

    //  public User saveUser(User user) {
    //     user.setPassword(passwordEncoder.encode(user.getPassword()));
    //     return userRepository.save(user);
    // }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
