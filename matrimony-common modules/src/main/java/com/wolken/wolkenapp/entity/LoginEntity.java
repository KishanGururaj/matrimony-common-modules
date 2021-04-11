package com.wolken.wolkenapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name="matrimony_table")
public class LoginEntity {
	@Id
	@Column(name="candidate_id")
	private int id;
	@Column(name="candidate_name")
	private String userName;
	@Column(name="candidate_password")
	private String password;
}

