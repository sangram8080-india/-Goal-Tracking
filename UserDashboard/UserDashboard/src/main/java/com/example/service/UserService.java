package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.repo.UserRepository;

@Service
public class UserService 
{
    @Autowired
    private UserRepository userRepository;

    public User signUp(User user) 
    {
        return userRepository.save(user);
    }

    public User signIn(String email, String password)
    {
    	User user=userRepository.findByEmail(email);
    	if(user!=null) {
    		user.getPassword().equals(password);
    		System.out.println("login successfully");
    	}else {
    		try {
    		throw new RuntimeException("Invalid credentials");
    		}catch (Exception e) {
				// TODO: handle exception
    			
    			System.out.println(e.getMessage());
			}
    	}
    	return user;
    	
//        return userRepository.findByEmail(email)
//                             .filter(user -> user.getPassword().equals(password))
//                             .orElseThrow(() -> new RuntimeException("Invalid credentials"));
    }
    
    public User findByEmail(String email) {
   
    		


    	
		return userRepository.findByEmail(email);
    	
    }
}
