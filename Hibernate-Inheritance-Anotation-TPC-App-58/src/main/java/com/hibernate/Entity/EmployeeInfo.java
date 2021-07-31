package com.hibernate.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import org.hibernate.annotations.Type;

import lombok.Data;
@Data
@Entity
@DiscriminatorValue(value ="emps")
public class EmployeeInfo extends BasicIn implements Serializable {
   
	 @Column
	Float sallary;
	 @Column
	 @Type(type ="string")
	String department;
	 @Column
	 @Type(type ="string")
	String jobtype;
	
		
}
