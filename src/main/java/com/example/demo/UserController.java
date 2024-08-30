package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class UserController {
    private String name = "Nguyễn Văn A";
    private int age = 20;
    private int score = 1000;

    @GetMapping("/users")
    public User user() {
        return new User(name, age, score);
    }
}
