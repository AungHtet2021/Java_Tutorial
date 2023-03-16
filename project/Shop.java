package project;

import java.util.Arrays;
import java.util.Scanner;

public class Shop {

	static double Total;
	static double refund;
	static double Cash;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome User");
		System.out.println("Availabe Items: 1.IPAD 2.LAPTOP 3.MOUSE");
		
		String []Items=new String[3];
		Items[0]="IPAD";
		Items[1]="LAPTOP";
		Items[2]="MOUSE";
//		System.out.println(Arrays.toString(Items));
		System.out.println("Enter Your Selected Item: 1 OR 2 OR 3");
		
		Scanner sc=new Scanner(System.in);
		
		int Selected_Item=sc.nextInt();
		int Real_Selected=Selected_Item-1;
		
		System.out.println("Enter Quantity");
		Scanner q=new Scanner(System.in);
		
		int Quantity=q.nextInt();
		
		if(Real_Selected==0) {
			Total=698*Quantity;
		}
		else if(Real_Selected==1) {
			Total=980*Quantity;
		}
		else if(Real_Selected==2) {
			Total=23*Quantity;
		}
		else {
			System.out.println("Dear Customer something wrong");
		}
		
		System.out.println("Total Cost "+ Total+"$");
		System.out.println("Enter Cash");
		Scanner c=new Scanner(System.in);
		Cash=c.nextDouble()	;
		if(Cash>Total) {
			refund=Cash-Total;
			System.out.println("Refund is="+refund+"$");
		}
		else if(Total==Cash) {
			System.out.println("Refund is=0");
		}else {
			System.out.println("Dear Customer Your Cash is Not Enough");
		}
		System.out.println("Please Rate Our Shop");
		System.out.println("Range May Between 1-5");
		Scanner r=new Scanner(System.in);
		
		int Rate=r.nextInt();
		user_rating(Rate);
		System.out.println("\t Thank You Come Again");
		}
	
	public static void user_rating(int Rate) {
		for(int i=0;i<Rate;i++) {
			System.out.print("*\t");
		}
		System.out.println("\n");
	}
	

}
