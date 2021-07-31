package com.core.Demo;

import java.util.HashMap;
import java.util.Map;

public class HashcodeDemo {
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return  1220;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashcodeDemo obj=new HashcodeDemo();
		System.identityHashCode(obj);
		System.out.println(obj.hashCode());
	    	
		
		Map<HashcodeDemo,Integer> map = new HashMap<>();
		map.put(obj, 1);
		
		for(Map.Entry<HashcodeDemo,Integer> en : map.entrySet()) {
			System.out.println(en.hashCode());
			System.out.println(en.getKey().hashCode());
			
		}
		
 
	}

}
