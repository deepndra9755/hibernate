package com.hibernate.Entity;
import java.util.Set;

import lombok.Data;
@Data
public class Apartment {
	Integer id;
	String  Ownername;
	String  address;
	Integer mobile;
	Integer houseNum;
	Set<Interial> interia;
}
