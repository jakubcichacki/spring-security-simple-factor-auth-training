package com.example.springsecuritysimplefactorauth;

import com.example.springsecuritysimplefactorauth.entity.User;
import com.example.springsecuritysimplefactorauth.repository.UserRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class Start {

    public Start(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        User user1 = new User();
        user1.setUsername("test_admin");
        user1.setPassword(passwordEncoder.encode("12345"));
        user1.setRole("ROLE_ADMIN");
        userRepository.save(user1);

        User user2 = new User();
        user2.setUsername("test_user");
        user2.setPassword(passwordEncoder.encode("pass123"));
        user2.setRole("ROLE_USER");
        userRepository.save(user2);
    }
}
