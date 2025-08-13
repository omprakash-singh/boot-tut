package com.webrtc_server.WebRTC.controller;

import com.webrtc_server.WebRTC.model.dto.UserRequest;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {

    @PostMapping
    public ResponseEntity<?> create( @RequestBody @Valid UserRequest dto) {


      return ResponseEntity.ok(null);
    }
}
