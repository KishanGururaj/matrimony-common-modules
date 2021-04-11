package com.wolken.wolkenapp.dto;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class LoginDTO {
	private int id;
	private String userName;
	private String password;
}
