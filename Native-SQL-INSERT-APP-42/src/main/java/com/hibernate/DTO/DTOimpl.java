package com.hibernate.DTO;

import java.io.Serializable;

import javax.persistence.Column;

import lombok.Data;

@Data
public class DTOimpl implements Serializable {

	Integer pid;
	
	String customerNAME;
	
	String IFSC;
	
	Float Amount;
	
	Integer  ACnum;

	
}
