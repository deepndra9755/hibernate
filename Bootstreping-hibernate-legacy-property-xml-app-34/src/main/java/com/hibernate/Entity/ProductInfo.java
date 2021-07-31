package com.hibernate.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
public class ProductInfo  implements Serializable {
	

Integer pid;

String pname;

String SerialNum;

Float prise;
Integer pnum;
}
