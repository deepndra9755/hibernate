package com.hibs.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Proxy;

import com.hibs.proxy.Myproxy;

@Entity
@Proxy(lazy=true,proxyClass =com.hibs.proxy.Myproxy.class)
public  final class MaskShop implements Serializable,Myproxy{
	private Integer id;
	
	private String pcode;

	private String masktype;

	private String provenBy;

	@Id
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(length = 24)
	public String getPcode() {
		return pcode;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

	@Column
	public String getMasktype() {
		return masktype;
	}

	public void setMasktype(String masktype) {
		this.masktype = masktype;
	}

	@Column
	public String getProvenBy() {
		return provenBy;
	}

	public void setProvenBy(String provenBy) {
		this.provenBy = provenBy;
	}

	@Override
	public String toString() {
		return "MaskShop [id=" + id + ", pcode=" + pcode + ", masktype=" + masktype + ", provenBy=" + provenBy + "]";
	}

}
