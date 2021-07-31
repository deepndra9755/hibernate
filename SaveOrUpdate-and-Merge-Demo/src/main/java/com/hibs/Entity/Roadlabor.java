package com.hibs.Entity;

import java.io.Serializable;

public class Roadlabor implements Serializable {
	

String name;
String last;
Integer custID;
Float sallary;
String position;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLast() {
	return last;
}
public void setLast(String last) {
	this.last = last;
}
public Integer getCustID() {
	return custID;
}
public void setCustID(Integer custID) {
	this.custID = custID;
}
public Float getSallary() {
	return sallary;
}
public void setSallary(Float sallary) {
	this.sallary = sallary;
}
public String getPosition() {
	return position;
}
public void setPosition(String position) {
	this.position = position;
}
@Override
public String toString() {
	return "Roadlabor [name=" + name + ", last=" + last + ", custID=" + custID + ", sallary=" + sallary + ", position="
			+ position + "]";
}

}

