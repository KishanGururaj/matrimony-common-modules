package com.wolken.wolkenapp.dao;

import java.util.List;

import com.wolken.wolkenapp.entity.DetailsEntity;

public interface DetailsDAO {

	String update(DetailsEntity entity);

	List<DetailsEntity> getDetailsByGender(String gender);

}
