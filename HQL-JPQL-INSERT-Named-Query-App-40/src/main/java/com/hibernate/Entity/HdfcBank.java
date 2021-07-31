package com.hibernate.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "HdfcBank")
public class HdfcBank {

	@Id
	Integer pid;

	@Column
	String customer;
	@Column
	String IFSCcode;
	@Column
	Float Amount;
	@Column
	Integer AccountNum;

}
