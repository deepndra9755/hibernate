package com.hibernate.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import org.hibernate.annotations.Type;

import lombok.Data;
@Data
@Entity
@DiscriminatorValue(value ="std")

public class StudentInfo extends BasicIn implements Serializable {
	 @Column
	Integer roll;
	 @Column
	 @Type(type ="string")
	String Enroll;
	 @Column
	 @Type(type ="string")
	String branch;
	
	
		
}
