package com.hibs.Entity;

import java.io.Serializable;

public class Civil implements Serializable {
	
	Integer id;
	String name;
	String sallary;
	String address;
	String city;
	String job;
	String department;

	
	
	@Override
	public String toString() {
		return "Civil [id=" + id + ", name=" + name + ", sallary=" + sallary + ", address=" + address + ", city=" + city
				+ ", job=" + job + ", department=" + department + ", depIDl=" + depIDl + "]";
	}
	public String getSallary() {
		return sallary;
	}
	public void setSallary(String sallary) {
		this.sallary = sallary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	String depIDl;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}

	public String getDepIDl() {
		return depIDl;
	}
	public void setDepIDl(String depIDl) {
		this.depIDl = depIDl;
	}

}
