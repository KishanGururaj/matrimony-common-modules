package com.wolken.wolkenapp.dto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Component
@EqualsAndHashCode
public class CandidatesDTO {
	private String candidateName;
	private String candidateEmailId;
	private long candidatePhoneNo;
	private String candidateDob;
	private String candidateGender;
	
	private String candidatePassword;
	private String candidateConfirmPassword;
	

}
