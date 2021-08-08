package com.hibernate.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name ="sallac")
@Data
public class EmpDetali {
@Id
Integer Id;
@Column
String name;
@Column
String last;
@Column
String sall;
@Column
String post;
}
