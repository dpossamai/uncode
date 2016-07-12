package com.sec21.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
public class Player implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private int age;
	private Date birthday;
	private int power;
	private int tecnique;
	
	public Player(){
		
	}

	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "NM_NAME")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "AGE")
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Column(name="DT_BIRTHDAY")
	public Date getBirthday() {
		return birthday;
	}
	
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	@Column(name="POWER")
	public int getPower() {
		return power;
	}
	
	public void setPower(int power) {
		this.power = power;
	}
	
	@Column(name="TECNIQUE")
	public int getTecnique() {
		return tecnique;
	}
	
	public void setTecnique(int tecnique) {
		this.tecnique = tecnique;
	}
	
}
