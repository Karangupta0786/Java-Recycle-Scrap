package com.ak.Scrapist.AK.service;

import com.ak.Scrapist.AK.model.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {

    ResponseEntity<User> createUser(User user);
    User getUserById(Long id);
    List<User> getAllUser();
}
