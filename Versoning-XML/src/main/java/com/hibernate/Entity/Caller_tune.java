package com.hibernate.Entity;

import java.io.Serializable;

public class Caller_tune implements Serializable {
	
private Integer sid;
private String SimOwner;
private String lastNm;
private String location;
Integer cou;
public Integer getSid() {
	return sid;
}
public void setSid(Integer sid) {
	this.sid = sid;
}
public String getSimOwner() {
	return SimOwner;
}

public void setSimOwner(String simOwner) {
	SimOwner = simOwner;
}
public String getLastNm() {
	return lastNm;
}
public Integer getCou() {
	return cou;
}
public void setCou(Integer cou) {
	this.cou = cou;
}
public void setLastNm(String lastNm) {
	this.lastNm = lastNm;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}

}
