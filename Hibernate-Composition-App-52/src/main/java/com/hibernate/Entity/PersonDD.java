package com.hibernate.Entity;

import java.io.Serializable;

import javax.persistence.Entity;

import lombok.Data;

public class PersonDD implements Serializable {
    Integer id;
	Integer roll;
	String Enroll;
	String branch;
	BasicInfo basic;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getRoll() {
		return roll;
	}
	public void setRoll(Integer roll) {
		this.roll = roll;
	}
	public String getEnroll() {
		return Enroll;
	}
	public void setEnroll(String enroll) {
		Enroll = enroll;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public BasicInfo getBasic() {
		return basic;
	}
	public void setBasic(BasicInfo basic) {
		this.basic = basic;
	}
	
}
