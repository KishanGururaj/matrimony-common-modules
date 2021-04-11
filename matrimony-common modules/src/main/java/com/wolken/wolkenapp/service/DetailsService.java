package com.wolken.wolkenapp.service;

import java.util.List;

import com.wolken.wolkenapp.dto.DetailsDTO;
import com.wolken.wolkenapp.entity.DetailsEntity;
import com.wolken.wolkenapp.exception.CandidatesGenderException;

public interface DetailsService {
	public String validateAndAddDetails(DetailsDTO detailsDTO );

	public List<DetailsEntity> validateAndGetDetailsByGender(String gender);

}
