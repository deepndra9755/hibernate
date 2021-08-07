package com.hibernate.Entity;

import java.io.Serializable;

public class CompositePNL implements Serializable {
	Float price;
	String average;
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public String getAverage() {
		return average;
	}
	public void setAverage(String average) {
		this.average = average;
	}
}
