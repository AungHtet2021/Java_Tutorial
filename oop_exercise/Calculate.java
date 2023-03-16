package oop_exercise;

import java.util.Scanner;

public class Calculate {

	static int addition(int n1,int n2) {
		return n1+n2;
	}
	
	static double addition(double a,double b) {
		return a+b;
	}
	
	static void addition() {
		int sum=0;
		String status="yes";
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("enter number");
			sum+=sc.nextInt()	;
			System.out.println("do you want to input another(yes or no)");
			status=sc.next();
			
		}while(status.equals("yes"));
		System.out.println(sum);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("n1+n2:"+addition(12,13));
		System.out.println("a+b:"+addition(12.25,2.8));
		addition();
	}

}
