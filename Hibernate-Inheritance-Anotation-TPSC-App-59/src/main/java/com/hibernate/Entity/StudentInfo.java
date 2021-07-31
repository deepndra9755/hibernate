package com.hibernate.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import org.hibernate.annotations.Type;

import lombok.Data;
@Data
@Entity
@PrimaryKeyJoinColumn(name ="STD_Pid",referencedColumnName ="id")

@DiscriminatorValue(value ="std")

public class StudentInfo extends GEN_INFO implements Serializable {
	 @Column
	Integer roll;
	 @Column
	 @Type(type ="string")
	String Enroll;
	 @Column
	 @Type(type ="string")
	String branch;
	
	
		
}
