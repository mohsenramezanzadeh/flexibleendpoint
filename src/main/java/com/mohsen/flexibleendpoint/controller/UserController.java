package com.mohsen.flexibleendpoint.controller;

import com.mohsen.flexibleendpoint.repository.entity.User;
import com.mohsen.flexibleendpoint.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> getAll() {
        List<User> response = userService.getAll();
        return ResponseEntity.ok(response);
    }
}
