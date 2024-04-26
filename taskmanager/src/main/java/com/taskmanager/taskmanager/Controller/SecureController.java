package com.taskmanager.taskmanager.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecureController {

    @GetMapping("/user/tasks")
    public String userTasks() {
        return "user-tasks";
    }

    @GetMapping("/admin/tasks")
    public String adminTasks() {
        return "admin-tasks";
    }
}