package com.hibernate.Entity;
import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
public class BasicInfo {
	
	String name;
	String address;
	Integer mobile;
	
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "BasicInfo [name=" + name + ", address=" + address + ", mobile=" + mobile + "]";
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
	public Integer getMobile() {
		return mobile;
	}
	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}
	
}
