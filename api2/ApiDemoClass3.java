package api2;

import java.util.Scanner;

public class ApiDemoClass3 {

	public static void main(String[] args) throws Between1to10Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 to 10");
	
		int num=sc.nextInt()	;
		if(num>=10 | num<=1) {
			throw new Between1to10Exception("out of range");
		}
		System.out.println(num);
}
}
class Between1to10Exception extends Exception{
	Between1to10Exception(String msg){
		System.err.println(msg);
	}
}

	
	
	
	