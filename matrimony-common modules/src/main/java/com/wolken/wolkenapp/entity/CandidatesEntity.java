package com.wolken.wolkenapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Entity
@Getter
@Setter
@ToString
@Component
@Table(name="matrimony_table")
public class CandidatesEntity {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="candidate_id")
	private int id;
	@Column(name="candidate_name")
	private String candidateName;
	@Column(name="candidate_email_id")
	private String candidateEmailId;
	@Column(name="candidate_phone_no")
	private long candidatePhoneNo;
	@Column(name="candidate_dob")
	private String candidateDob;
	@Column(name="candidate_gender")
	private String candidateGender;
	@Column(name="candidate_password")
	private String candidatePassword;
	@Transient
	private String candidateConfirmPassword;

}
