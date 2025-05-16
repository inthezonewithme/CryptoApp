package com.jesse.cryptoapp.controller;


import com.jesse.cryptoapp.dto.SignupRequest;
import com.jesse.cryptoapp.model.User;
import com.jesse.cryptoapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/auth")
@RestController
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/signup")
    public ResponseEntity<User> register(@RequestBody SignupRequest signupRequest){

        User newUser = new User();
        newUser.setFullName(signupRequest.getFullName());
        newUser.setEmail(signupRequest.getEmail());
        newUser.setPassword(signupRequest.getPassword());



        return new ResponseEntity<>(userRepository.save(newUser), HttpStatus.CREATED);
    }

}
