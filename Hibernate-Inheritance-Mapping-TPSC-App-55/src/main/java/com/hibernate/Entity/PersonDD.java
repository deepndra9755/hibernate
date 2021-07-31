package com.hibernate.Entity;

import java.io.Serializable;

import javax.persistence.Entity;

import lombok.Data;
@Data
public class PersonDD extends BasicInfo implements Serializable {
   
   
	Integer roll;
	String Enroll;
	String branch;
	
		
}
