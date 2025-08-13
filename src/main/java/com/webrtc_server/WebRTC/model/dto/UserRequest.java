package com.webrtc_server.WebRTC.model.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {

   private Long id;

    @NotBlank(message = "Enter your name.")
    private String name;


    @Email(message = "Invalid email format")
    @NotBlank(message = "Email is required")
    private String email;



}
