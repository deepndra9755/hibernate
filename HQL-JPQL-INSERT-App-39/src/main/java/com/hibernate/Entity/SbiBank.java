package com.hibernate.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

public class SbiBank  implements Serializable {
	
	public SbiBank()
	{
	System.out.println("constructor "+this.getClass());	
	}

Integer pid;

String customerNAME;

String IFSC;

Float Amount;

Integer  ACnum;

public Integer getPid() {
	return pid;
}

public void setPid(Integer pid) {
	this.pid = pid;
}

public String getCustomerNAME() {
	return customerNAME;
}

public void setCustomerNAME(String customerNAME) {
	this.customerNAME = customerNAME;
}

public String getIFSC() {
	return IFSC;
}

public void setIFSC(String iFSC) {
	IFSC = iFSC;
}

public Float getAmount() {
	return Amount;
}

public void setAmount(Float amount) {
	Amount = amount;
}

public Integer getACnum() {
	return ACnum;
}

public void setACnum(Integer aCnum) {
	ACnum = aCnum;
}

@Override
public String toString() {
	return "SbiBank [pid=" + pid + ", customerNAME=" + customerNAME + ", IFSC=" + IFSC + ", Amount=" + Amount
			+ ", ACnum=" + ACnum + "]";
}

}
