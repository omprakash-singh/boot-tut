package com.webrtc_server.WebRTC.service.impl;

import com.webrtc_server.WebRTC.model.entity.User;
import com.webrtc_server.WebRTC.repository.UserRepository;
import com.webrtc_server.WebRTC.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User create(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(()-> new RuntimeException("user not find."));
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
