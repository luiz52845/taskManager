package com.taskmanager.taskmanager.Repository;

import com.taskmanager.taskmanager.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository <User, Long>{
    User findByUsername(String username);
}
