package com.hibernate.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name ="person_info")
public class PersonDD implements Serializable {
    @Id
    @GeneratedValue
	Integer id;
    @Column
    @Embedded
	BasicInfo basic;
	Integer roll;
    @Column
	String Enroll;
    @Column
	String branch;
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getRoll() {
		return roll;
	}
	public void setRoll(Integer roll) {
		this.roll = roll;
	}
	public String getEnroll() {
		return Enroll;
	}
	public void setEnroll(String enroll) {
		Enroll = enroll;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public BasicInfo getBasic() {
		return basic;
	}
	public void setBasic(BasicInfo basic) {
		this.basic = basic;
	}
	@Override
	public String toString() {
		return "PersonDD [id=" + id + ", roll=" + roll + ", Enroll=" + Enroll + ", branch=" + branch + ", basic="
				+ basic + "]";
	}
	
}
