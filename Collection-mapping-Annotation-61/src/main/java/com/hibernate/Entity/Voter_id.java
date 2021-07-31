package com.hibernate.Entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;

import lombok.Data;

@Entity
@Data
public class Voter_id implements Serializable {

	
	@Id
	@GeneratedValue
	private Integer id;
	@Column
	private String voterID;
	@Column
	private String address;
//	@Column
//	private Long Mob;
	@Column
	private Integer age;
     
	@Column(name ="mobil")
	@ElementCollection
	@CollectionTable(name ="Mobile_num",joinColumns =@JoinColumn(name="idd",referencedColumnName ="id") )
    List<Integer> mobile;
	
}
