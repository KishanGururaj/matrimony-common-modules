package com.wolken.wolkenapp.service;

import com.wolken.wolkenapp.dto.UpdateDTO;
import com.wolken.wolkenapp.entity.CandidatesEntity;

public interface UpdateService {
	public CandidatesEntity validateAndGet(String emailId);

	public String validateAndUpdate(UpdateDTO updateDTO);

}
