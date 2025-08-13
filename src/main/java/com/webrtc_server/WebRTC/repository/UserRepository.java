package com.webrtc_server.WebRTC.repository;

import com.webrtc_server.WebRTC.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}