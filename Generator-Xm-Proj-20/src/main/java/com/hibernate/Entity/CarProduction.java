package com.hibernate.Entity;

import java.io.Serializable;

public class CarProduction implements Serializable {
	String id;
	Integer gair;
	Float price;
	String Cname;
	String Ctype;
	String average;
	String company;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getGair() {
		return gair;
	}
	public void setGair(Integer gair) {
		this.gair = gair;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	public String getCtype() {
		return Ctype;
	}
	public void setCtype(String ctype) {
		Ctype = ctype;
	}
	public String getAverage() {
		return average;
	}
	public void setAverage(String average) {
		this.average = average;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "CarProduction [id=" + id + ", gair=" + gair + ", price=" + price + ", Cname=" + Cname + ", Ctype="
				+ Ctype + ", average=" + average + ", company=" + company + "]";
	}

	
	

}
