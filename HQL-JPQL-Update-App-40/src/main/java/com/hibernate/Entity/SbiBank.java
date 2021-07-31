package com.hibernate.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
@Entity
@Table
@Data
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
