package com.kooujin.course.services;

import com.kooujin.course.entities.User;
import com.kooujin.course.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public Object findById(Long id) {
        Optional<User> user =  userRepository.findById(id);
        return user.get();
    }
}
