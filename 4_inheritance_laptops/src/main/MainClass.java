package main;

import laptop.BusinessLaptop;
import laptop.GamingLaptop;
import laptop.Laptop;

public class MainClass {

	public static void main(String[] args) {
		Laptop gamingLaptop = new GamingLaptop();
		BusinessLaptop businessLaptop = new BusinessLaptop();

		gamingLaptop.bootUp();
		//businessLaptop.bootUp();
		((BusinessLaptop) gamingLaptop).test();
		
	}

}
