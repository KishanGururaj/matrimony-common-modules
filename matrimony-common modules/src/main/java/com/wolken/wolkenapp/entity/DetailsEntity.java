package com.wolken.wolkenapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Component
@Table(name="candidate_details_table")
public class DetailsEntity {
	@Id
	@Column(name="candidate_name")
	private String candidateFullName;
	@Column(name="candidate_caste")
	private String candidateCaste;
	@Column(name="candidate_salary")
	 private long candidateSalary;
	@Column(name="candidate_desire")
	 private String candidateDesire;
	@Column(name="candidate_gender")
	private String candidateGender;

}
