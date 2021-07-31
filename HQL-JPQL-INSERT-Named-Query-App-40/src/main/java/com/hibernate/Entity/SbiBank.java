package com.hibernate.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table
@NamedQuery(name ="HQL_INSERT_CUST", query = "INSERT INTO com.hibernate.Entity.SbiBank(pid,customerNAME,IFSC,Amount,ACnum)Select e.pid,e.customer,e.IFSCcode,e.Amount,e.AccountNum from com.hibernate.Entity.HdfcBank as e where e.Amount>:amt")

public class SbiBank  implements Serializable {
	
	
@Id
Integer pid;
@Column
String customerNAME;
@Column
String IFSC;
@Column
Float Amount;
@Column
Integer  ACnum;

}
