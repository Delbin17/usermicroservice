package com.example.UserMicroService.UserService;

import org.jvnet.hk2.annotations.Service;

import com.example.UserMicroService.UserDto.UserDto;
import com.example.UserMicroService.UserEntity.User;


public interface UserService {
	
	 void userRegister(UserDto user);

}
