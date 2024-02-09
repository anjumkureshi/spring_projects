package com.ir.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sample {

	@Id
	private Integer sid;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
}
