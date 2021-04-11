package com.wolken.wolkenapp.dto;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class DetailsDTO {
 private String candidateFullName;
 private String candidateCaste;
 private long candidateSalary;
 private String candidateDesire;
 private String candidateGender;

}
