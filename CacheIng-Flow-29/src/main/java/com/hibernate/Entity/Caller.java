package com.hibernate.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

import org.hibernate.annotations.Type;
@Entity
public class Caller implements Serializable {
@Id
@GeneratedValue(generator = "increment")
private	Integer sid;
@Column
@Type(type ="string")
private String SimOwner;
@Column
@Type(type ="string")
private String lastNm;
@Column
@Type(type ="string")
private String location;
@Column
private Integer count;
public Integer getSid() {
	return sid;
}
public void setSid(Integer sid) {
	this.sid = sid;
}
public String getSimOwner() {
	return SimOwner;
	// https://mvnrepository.com/artifact/com.zaxxer/HikariCP
	//implementation group: 'com.zaxxer', name: 'HikariCP', version: '4.0.3'

}

public void setSimOwner(String simOwner) {
	SimOwner = simOwner;
}
public String getLastNm() {
	return lastNm;
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
public Integer getCount() {
	return count;
}
public void setCount(Integer count) {
	this.count = count;
}
@Override
public String toString() {
	return "Caller [sid=" + sid + ", SimOwner=" + SimOwner + ", lastNm=" + lastNm + ", location=" + location
			+ ", count=" + count + "]";
}


}

