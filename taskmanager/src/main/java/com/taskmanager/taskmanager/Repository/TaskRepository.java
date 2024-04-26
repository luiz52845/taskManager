package com.taskmanager.taskmanager.Repository;

import com.taskmanager.taskmanager.Entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository <Task, Long> {
}
