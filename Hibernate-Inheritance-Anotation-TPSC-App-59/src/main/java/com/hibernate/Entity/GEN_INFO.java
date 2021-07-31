package com.hibernate.Entity;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.hibernate.annotations.Type;

import lombok.Data;
@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name ="basic",length =10,discriminatorType =DiscriminatorType.STRING)

public abstract class GEN_INFO {
	@Id
	@GeneratedValue
	Integer id;
    @Column
    @Type(type ="string")
	String name;
    @Column
    @Type(type ="string")
	String address;
    @Column
   
	Integer mobile;
		
}
