package com.hibernate.Entity;

import java.io.Serializable;

import java.sql.Timestamp;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;
@Entity
public class BankAC implements Serializable {
	
	@Id
	@GeneratedValue(generator ="increment")
	private Integer id;
	@Column
	private Integer AccountNum;
	@Column
	@CreationTimestamp
	private LocalDate opendate;
    @Column
	private String name;
	@UpdateTimestamp
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
