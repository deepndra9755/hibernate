package com.hibs.Entity;

import java.io.Serializable;

public class Product implements Serializable
{
private Integer pid;
private Float bill;
private String cname;
private String address;
private Integer discount;
public Integer getPid() {
	return pid;
}
public void setPid(Integer pid) {
	this.pid = pid;
}
public Float getBill() {
	return bill;
}
public void setBill(Float bill) {
	this.bill = bill;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Integer getDiscount() {
	return discount;
}
public void setDiscount(Integer discount) {
	this.discount = discount;
}
@Override
public String toString() {
	return "Product [pid=" + pid + ", bill=" + bill + ", cname=" + cname + ", address=" + address + ", discount="
			+ discount + "]";
}

}
