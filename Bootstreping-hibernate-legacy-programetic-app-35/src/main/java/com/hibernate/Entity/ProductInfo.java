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
public class ProductInfo  implements Serializable {
	
@Id
@GeneratedValue(generator = "increment")
Integer pid;
@Column
String pname;
@Column
String SerialNum;
@Column
Float prise;
@Column
@GenericGenerator(name = "ff", strategy = "identity")
Integer pnum;
}
