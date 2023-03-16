package project;

import java.util.Scanner;

public class Shop1 {
	
	public static final String TEXT_BLACK="\u001B[30m";
	public static final String TEXT_RED="\u001B[31m";
	public static final String TEXT_GREEN="\u001B[32m";
	public static final String TEXT_YELLOW="\u001B[33m";
	public static final String TEXT_BLUE="\u001B[34m";
	public static final String TEXT_PURPLE="\u001B[35m";
	public static final String TEXT_CYAN="\u001B[36m";
	public static final String TEXT_WHITE="\u001B[37m";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Total=0;
		double Cash=0;
		double refund=0;
		
		System.out.println(TEXT_BLUE+"WELCOME USER");
		System.out.println(TEXT_CYAN+"Available Items IPAD,LAPTOP,MOUSE");
		System.out.println(TEXT_GREEN+"Enter Your Selected Item");
		Scanner sc=new Scanner(System.in);
		String Selected_Item=sc.nextLine();
		System.out.println(TEXT_PURPLE+"Enter Quantity:");
		Scanner q=new Scanner(System.in);
		
		int  Quantity=q.nextInt()	;
		if(Selected_Item.equalsIgnoreCase("IPAD")) {
			Total=698*Quantity;
		}else if(Selected_Item.equalsIgnoreCase("LAPTOP")) {
			Total=980*Quantity;
		}else if(Selected_Item.equalsIgnoreCase("MOUSE")) {
			Total=23*Quantity;
		}
		else {
			System.out.println("Dear customer ,Something Wrong");
		}
		System.out.println(TEXT_CYAN+"Total Cost is"+Total);
		System.out.println("Enter Cash");
		Scanner c=new Scanner(System.in);
		Cash =c.nextDouble();
		if(Cash>Total) {
			refund=Cash-Total;
			System.out.println(TEXT_RED+"Refund is="+refund);
			
		}
		else if(Total==Cash) {
			System.out.println(TEXT_RED+"Refund is =0");
			
		}
		else {
			System.out.println(TEXT_RED+"Dear Customer Your Cash is Not Enough");
			
		}
		
		System.out.println(TEXT_GREEN+"Please Rate Our Shop");
		System.out.println(TEXT_GREEN+"Range May Between 1-5");
		Scanner r=new Scanner(System.in);
		int Rate=r.nextInt()	;
		user_rating(Rate);
		System.out.println(TEXT_CYAN+"\t Thank You Come Again");
		}
	public static void user_rating(int Rate) {
		for (int i=0;i<Rate;i++) {
			System.out.println(TEXT_PURPLE+"*\t");
		}
		System.out.println("\n");
	}

}
