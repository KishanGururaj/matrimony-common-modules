package com.wolken.wolkenapp.dto;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class UpdateDTO {
	private String candidateEmailId;
	private String candidateName;
	private String candidateGender;
	private String candidateDob;
	private long candidatePhoneNo;
}
