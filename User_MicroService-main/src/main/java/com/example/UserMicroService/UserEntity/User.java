package com.example.UserMicroService.UserEntity;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
	
	  @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private UUID id;

	    private String fullName;

	    @Column(unique = true, nullable = false)
	    @NotBlank(message = "Email is required")
	    @Email(message = "Email should be valid")
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
	    
	    private LocalDateTime createdAt;

	    private LocalDateTime updatedAt;

}
