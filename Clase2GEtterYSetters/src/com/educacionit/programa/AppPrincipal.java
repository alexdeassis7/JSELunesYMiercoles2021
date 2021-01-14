package com.educacionit.programa;

import com.educacionit.modelos.Passenger;

public class AppPrincipal {

	public static void main(String[] args) {
		
		Passenger p1 = new Passenger(1);
		Passenger p2 = new Passenger(2 ,3);
		Passenger p3 = new Passenger(5);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		
		//System.out.println("getBolsos():"+p1.getBolsos());
		//p1.setBolsos(4);
	//	System.out.println("getBolsos():"+p1.getBolsos());
		
	
		
	}

}
