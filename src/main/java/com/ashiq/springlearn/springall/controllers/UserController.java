package com.ashiq.springlearn.springall.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashiq.springlearn.springall.entity.User;
import com.ashiq.springlearn.springall.model.OTP;
import com.ashiq.springlearn.springall.repos.UserRepo;
import com.ashiq.springlearn.springall.util.OTPManager;

@RestController
public class UserController {
	@Autowired
	private UserRepo userRepo;
	@PostMapping("users/register")
	public OTP register(@RequestBody @Valid User user){
		userRepo.save(user);
		
		return new OTP(OTPManager.getOTP());
		
	}
	
	@GetMapping("users/{mobilenumber}")
	public User getUserInfo(@PathVariable String mobilenumber) {
		User temp = userRepo.findByMobilenumber(mobilenumber);
		//List<User> users = userRepo.findAll();
		//return users.get(0);
		return temp;
		
	}
	
	
	@GetMapping("users/validate")
	public void validate() {
		
	}
	
	
	
	

}