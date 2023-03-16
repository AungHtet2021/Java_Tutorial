package java_exercise;

import java.util.Scanner;

public class Additon_Operator {

	public static void main(String[] args) {
		int num1,num2,sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number :");
		num1=sc.nextInt();
		System.out.println("Enter Second Number :");
		num2=sc.nextInt();
		
		sum=num1+num2;
		System.out.println("Total number is " +sum);

	}
}
