package api2;

import java.util.Scanner;

public class ApiDemoClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
		int num=Integer.parseInt(sc.next());
		System.out.println(5/num);
		}catch(NumberFormatException e) {
			System.out.println("cannot convert integer");
			e.printStackTrace()	;								// error line check
		}catch(ArithmeticException e) {
			System.out.println("Cannot divided by zero");
		}catch(Exception e) {
			System.out.println("Something worng");
		}
		

	}

}
