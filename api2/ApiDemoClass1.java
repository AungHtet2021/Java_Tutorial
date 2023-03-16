package api2;

import java.util.Scanner;

public class ApiDemoClass1 {

	enum Size{
		SMALL,MEDIUM,LARGE
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Boolean flag=false;
		do{System.out.println("Enter Pizza size");
		
		String size=sc.nextLine().toUpperCase();
		Size ss=null;
		try {					
		 ss=Size.valueOf(size);
		System.out.println(ss.ordinal()+" "+ss);
		flag=false;
		}catch(IllegalArgumentException e) { 		//general so yin Exception nae ll ya dl
			System.err.println("Input wrong");
			flag=true;
		}
		}while(flag);
	
		
		System.out.println("Bye Bye");

		
		}
		
		

}
