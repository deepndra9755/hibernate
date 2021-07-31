package com.hibernate.closeing;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

import com.hibs.utility.HBNutility;
@WebListener
public class SesionCloseing implements ServletRequestListener {
@Override
public void requestDestroyed(ServletRequestEvent sre) {
	
HBNutility.CloseSES();
}

}
