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

public class StudentInfoCC extends GEN_INFOCC implements Serializable {
	 @Column
	Integer roll;
	 @Column
	 @Type(type ="string")
	String Enroll;
	 @Column
	 @Type(type ="string")
	String branch;
	
	
		
}
