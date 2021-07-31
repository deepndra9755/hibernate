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
	
	public ProductInfo()
	{
	System.out.println("constructor "+this.getClass());	
	}
@Id
@GeneratedValue
Integer pid;
@Column
String pname;
@Column
String SerialNum;
@Column
Float prise;
@Column
Integer pnum;
}
