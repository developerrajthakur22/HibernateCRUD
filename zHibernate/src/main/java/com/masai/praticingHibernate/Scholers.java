package com.masai.praticingHibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Scholers {
    
	@Id
	private int id;
	private String name;
	private int classID;

	public Scholers() {
		super();
	}

	public Scholers(int id, String name, int classID) {
		super();
		this.id = id;
		this.name = name;
		this.classID = classID;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getClassID() {
		return classID;
	}

	public void setClassID(int classID) {
		this.classID = classID;
	}

	@Override
	public String toString() {
		return "Scholers [id=" + id + ", name=" + name + ", classID=" + classID + "]";
	}

}
