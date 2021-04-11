package com.wolken.wolkenapp.dao;

import com.wolken.wolkenapp.dto.UpdateDTO;
import com.wolken.wolkenapp.entity.CandidatesEntity;
import com.wolken.wolkenapp.entity.LoginEntity;

public interface LoginDAO {

	public LoginEntity login(String  userName);

	public CandidatesEntity getByEmailId(String emailId);

	public String updateDetails(UpdateDTO updateDTO);

}
