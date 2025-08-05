package com.example.UserMicroService.UserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.UserMicroService.UserDto.UserDto;
import com.example.UserMicroService.UserService.UserService;

@Controller
@RequestMapping("/User")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/registeruser")
	public ResponseEntity<String> createUser(@RequestBody UserDto dto){
		userService.userRegister(dto);
		
		return ResponseEntity.status(HttpStatus.CREATED).body("user registered Succesfulllly");
		
	}
	
	

}
