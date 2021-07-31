package com.hibernate.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.FilterDefs;
import org.hibernate.annotations.ParamDef;
import org.hibernate.annotations.Parameter;

import lombok.Data;


@Data
@Entity
@FilterDef(name ="SELECTATION_CIVIL",parameters = {@ParamDef(type ="string",name ="param1")})
@Filter(name ="SELECTATION_CIVIL",condition ="address not in(:param1)")
public class Civil implements Serializable {

	@Id
	Integer id; 
     @Column
	String name;
     @Column
String address;
     @Column
String city; 
     @Column
String sallary;
     @Column
String job;
     @Column
String DEPARTMENT; 
     @Column
String depIDl;
}
