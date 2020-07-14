package com.example.springsecuritysimplefactorauth;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class Start {

    public Start(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        User user = new User();
        user.setUsername("test");
        user.setPassword(passwordEncoder.encode("12345"));
        user.setRole("ROLE_ADMIN");
        userRepository.save(user);
    }
}
