package com.hibernate.Entity;

import java.io.Serializable;

public class CarProduction implements Serializable {
	String id;
	Integer gair;
	CompositePNL idd;
	String Cname;
	public CompositePNL getIdd() {
		return idd;
	}

	public void setIdd(CompositePNL idd) {
		this.idd = idd;
	}

	String Ctype;
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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "CarProduction [id=" + id + ", gair=" + gair + ", Cname=" + Cname + ", Ctype=" + Ctype + ", company="
				+ company + "]";
	}
	
	
}
