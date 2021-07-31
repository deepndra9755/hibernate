package com.hibernate.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.GenericGenerators;
import org.hibernate.annotations.Parameter;

@Entity
public class CarProduction implements Serializable {
	@Id
//	@GenericGenerator(name = "ge",strategy ="increment")
//	@GeneratedValue(generator ="ge")  this is for increment generator
	
//	@GenericGenerator(name = "ge",strategy ="identity")
//	@GeneratedValue(generator ="ge") this is for identity
	
//	@GenericGenerator(name = "ge",strategy ="hilo",parameters = @Parameter(name="hilo_de",value ="DCOD"))
//	@GeneratedValue(generator ="ge") this is for hilo
	Integer id;
	
	@Column(name ="gair")
	Integer gair;
	
	@Column(name ="price")
	Float price;
	
	@Column(name ="Cname")
	String Cname;
	
	@Column(name ="Ctype")
	String Ctype;
	
	@Column(name ="average")
	String average;
	
	@Column(name ="company")
	String company;
	
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
