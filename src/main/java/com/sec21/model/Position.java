package com.sec21.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Position implements Serializable{

	private static final long serialVersionUID = 1L;

	private int id;
	private String name;
	
	
	public Position(){
		
	}

	@Id
	@Column(name="ID")
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	@Column(name="NM_NAME")
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
}
