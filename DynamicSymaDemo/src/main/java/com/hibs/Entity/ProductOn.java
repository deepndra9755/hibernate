package com.hibs.Entity;

import java.io.Serializable;

public class ProductOn implements Serializable {

private Integer num;
private String name;
private Integer code;
private String company;
private String type;
public Integer getNum() {
	return num;
}
public void setNum(Integer num) {
	this.num = num;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getCode() {
	return code;
}
public void setCode(Integer code) {
	this.code = code;
}

public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
@Override
public String toString() {
	return "ProductOn [num=" + num + ", name=" + name + ", code=" + code + ", company=" + company + ", type=" + type
			+ "]";
}


}
