package com.mohsen.flexibleendpoint.service;

import com.mohsen.flexibleendpoint.repository.UserRepository;
import com.mohsen.flexibleendpoint.repository.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<User> getAll() {
        return userRepository.findAll();
    }
}
