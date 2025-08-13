package com.webrtc_server.WebRTC.service;


import com.webrtc_server.WebRTC.model.entity.User;

import java.util.List;

public interface UserService {
    User create(User user);
    User findById(Long id);
    List<User> findAll();
}
