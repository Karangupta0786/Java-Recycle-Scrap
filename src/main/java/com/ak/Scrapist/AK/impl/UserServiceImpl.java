package com.ak.Scrapist.AK.impl;

import com.ak.Scrapist.AK.jdbc.UserRepository;
import com.ak.Scrapist.AK.model.User;
import com.ak.Scrapist.AK.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public ResponseEntity<User> createUser(User user) {
        return ResponseEntity.ok(userRepository.save(user));
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(null);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }
}
