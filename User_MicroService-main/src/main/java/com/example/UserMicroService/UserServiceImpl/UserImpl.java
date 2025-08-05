package com.example.UserMicroService.UserServiceImpl;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.UserMicroService.UserDto.UserDto;
import com.example.UserMicroService.UserEntity.User;
import com.example.UserMicroService.UserRepository.UserRepository;
import com.example.UserMicroService.UserService.UserService;


@Service
public class UserImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public void userRegister(UserDto dto) {
		User userDetails=new User();
		userDetails.setFullName(dto.getFullName());
		userDetails.setEmail(dto.getEmail());
		userDetails.setPhone(dto.getPhone());
		userDetails.setPassword(dto.getPassword());
		userDetails.setEmailVerified(dto.getEmailVerified());
		userDetails.setGender(dto.getGender());
		userDetails.setDateOfBirth(dto.getDateOfBirth());
		userDetails.setCountry(dto.getCountry());
		userDetails.setIsKycVerified(dto.getIsKycVerified());
		userDetails.setProfilePictureUrl(dto.getProfilePictureUrl());
		userDetails.setStatus(dto.getStatus());
		userDetails.setReferralCode(dto.getReferralCode());
		userDetails.setLastLoginTime(dto.getLastLoginTime());
		userDetails.setEmailVerified(dto.getEmailVerified());
		userDetails.setPhoneVerified(dto.getPhoneVerified());
		
		
		userRepository.save(userDetails);		
		
		
		
		
	}

}
