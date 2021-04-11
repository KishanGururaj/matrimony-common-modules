package com.wolken.wolkenapp.service;

import com.wolken.wolkenapp.dto.LoginDTO;

public interface LoginService {
	public String validateAndLogin(LoginDTO dto);
}
