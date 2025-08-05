package com.example.UserMicroService.UserDto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import lombok.Data;

@Data
public class UserDto {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private UUID id;

	 
	    private String fullName;

	    @Column(unique = true, nullable = false)
	    private Email email;

	    @Column(unique = true, nullable = false)
	    private String phone;

	    private String password;

	    private String gender;

	    private LocalDate dateOfBirth;

	    private String country;

	    private String state;

	    private String city;

	    private String pincode;

	    private Boolean isKycVerified;

	    private String profilePictureUrl;
	    
	    private Enum status;

	    private String referralCode;
	    
	    private String userType;
	    
	    private LocalDateTime lastLoginTime;
	    
	    private String emailVerified;
	    
	    private String phoneVerified;
	    
	    	

}
