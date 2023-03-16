package java_exercise;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String fname;
		System.out.println("Enter Your Favourite Fruit : ");
		fname = sc.nextLine();
		char fruit=fname.charAt(0);
//		System.out.println(fruit);
		switch(fruit) {
		case 'a' :
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' :System.out.println(fname+" " +fruit+" is a vowel...");
		break;
		default:System.out.println( fname+" " +fruit+ " is not a vowel...");
		break;
		}
}
}
