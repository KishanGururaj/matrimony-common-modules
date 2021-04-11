package com.wolken.wolkenapp.dao;

import com.wolken.wolkenapp.entity.CandidatesEntity;

public interface CandidatesDAO {
	public String save(CandidatesEntity candidatesEntity);

	public CandidatesEntity getUserName(String candidateName);

}
