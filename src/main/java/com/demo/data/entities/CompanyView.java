package com.demo.data.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CompanyView implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "state")
	private String state;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
