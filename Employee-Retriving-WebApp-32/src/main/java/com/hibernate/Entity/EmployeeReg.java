package com.hibernate.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
@Entity
@Data
public class EmployeeReg implements Serializable {
	
@Id
@GeneratedValue
Integer id;
@Column
String name;
@Column
String last;
@Column
Float sallary;
@Column
String depid;
@Column
Integer pf;
}
