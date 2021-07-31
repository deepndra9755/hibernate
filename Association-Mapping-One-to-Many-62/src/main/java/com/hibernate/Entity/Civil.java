package com.hibernate.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;




@Data
public class Civil implements Serializable {

	
	Integer id; 

	String name;

String address;

String city; 

String sallary;

String job;

String DEPARTMENT; 

String depIDl;
}
