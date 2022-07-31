package com.jenkins.driver;

import java.util.Scanner;

public class MainDriver {
	
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int a,b,res;
		a = sc.nextInt();
		b=sc.nextInt();
		
		Calculator cl = new Calculator();
		
		System.out.println(cl.add(a, b));
		System.out.println(cl.substract(a, b));
		System.out.println(cl.multiply(a, b));
		System.out.println(cl.divide(a, b));
		
	}
	
	

}
