package com.sec21.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="TEAM")
public class Team {

	private Integer id;
	private String name;
	private String emblem;
	
	public Team(){
		
	}
	
	public Team(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	@NotNull
	@Size(min=6, max=20)
	@Column(name = "NM_NAME", nullable = false)
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "NM_EMBLEM", nullable = false)
	public String getEmblem() {
		return emblem;
	}

	public void setEmblem(String emblem) {
		this.emblem = emblem;
	}
	
}
