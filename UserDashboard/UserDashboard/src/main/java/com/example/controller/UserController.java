package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<User> signUp(@RequestBody User user) {
        return ResponseEntity.ok(userService.signUp(user));
    }

    @PostMapping("/signin")
    public ResponseEntity<User> signIn(@RequestParam String email, @RequestParam String password) {
       User user =userService.signIn(email, password);
    	
    	return new ResponseEntity<User>(user,HttpStatus.OK);
    }
    

    @PostMapping("/forgot-password")
    public ResponseEntity<String> forgotPassword(@RequestParam String email) {
        // Mock response
        return ResponseEntity.ok("Password reset link has been sent to " + email);
    }
    @PostMapping("/search")
    public ResponseEntity<User> search(@RequestParam String email){
    	
    	User user1=userService.findByEmail(email);
    	return new ResponseEntity<User>(user1,HttpStatus.ACCEPTED);
    }
}
