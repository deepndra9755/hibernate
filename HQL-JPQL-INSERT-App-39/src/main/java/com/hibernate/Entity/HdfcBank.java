package com.hibernate.Entity;

public class HdfcBank {

	Integer pid;

	String customer;

	String IFSCcode;

	Float Amount;

	Integer  AccountNum;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getIFSCcode() {
		return IFSCcode;
	}

	public void setIFSCcode(String iFSCcode) {
		IFSCcode = iFSCcode;
	}

	public Float getAmount() {
		return Amount;
	}

	public void setAmount(Float amount) {
		Amount = amount;
	}

	public Integer getAccountNum() {
		return AccountNum;
	}

	public void setAccountNum(Integer accountNum) {
		AccountNum = accountNum;
	}

	@Override
	public String toString() {
		return "HdfcBank [pid=" + pid + ", customer=" + customer + ", IFSCcode=" + IFSCcode + ", Amount=" + Amount
				+ ", AccountNum=" + AccountNum + "]";
	}

		
}
