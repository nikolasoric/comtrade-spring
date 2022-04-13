package com.comtrade.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Language {
	@Id
	private int id;
	private String name;
	private String message;
	
	public Language() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Language(int id, String name, String message) {
		super();
		this.id = id;
		this.name = name;
		this.message = message;
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
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Language [id=" + id + ", name=" + name + ", message=" + message + "]";
	}
}
