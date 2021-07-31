package com.hibernate.Entity;

import java.io.Serializable;

import java.sql.Timestamp;
import java.time.LocalDate;

public class BankAC implements Serializable {
	
	private Integer id;
	
	private Integer AccountNum;
	private LocalDate opendate;
	private String name;
	private java.util.Date lastUpdate;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAccountNum() {
		return AccountNum;
	}
	public void setAccountNum(Integer accountNum) {
		AccountNum = accountNum;
	}

	public LocalDate getOpendate() {
		return opendate;
	}
	public void setOpendate(LocalDate opendate) {
		this.opendate = opendate;
	}
	public java.util.Date getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(java.util.Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
