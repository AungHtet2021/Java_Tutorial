package javabasic;

import java.io.*;
import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) throws IOException
	{
//		int num1=10,num2=20,sum;
//		sum=num1+num2;
//		System.out.println("Total Number is "+sum);
		
		int num1=30,num2=40,num3=83;
		int num;
		Scanner sc =new Scanner(System.in);
		System.out.println("Please Enter Your Score...");
		num =sc.nextInt();
		
		if (num >=80) 
		{
		System.out.println("You have to pass with distinction....");
		} else if (num >=40) {
			      System.out.println("You have to pass...");
		}  else {
			      System.out.println("You fail...");
		}	
			
		 
		
//	Ternery Operator
//		  int age1, age2,max; age1=13; age2=14;
//		  
//		  max=(age1>age2)?age1:age2;
//		  if(max>=18) {
//		  System.out.println("You have to vote...."); 
//		  }
//		  else {
//		  System.out.println("You are too young to vote....");
//		  }
	
//	if else if ladder	 
//		  char  answer='K';
//		  System.out.println("Can you guess the letter...");
//		  char ch=(char)System.in.read();
////		  System.out.println(ch);
//		  if(ch==answer) {
//				System.out.println("right");
//		  }
//		  else {
//				System.out.println("wrong");
//			    if(ch<answer)
//					System.out.println("Too Low...");
//				else
//					System.out.println("Too Hight...");
//				}
	
////	logical operator	
//		char ch;
//		ch= (char)System.in.read();
//		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
//			System.out.println( ch+" is a vowel...");
//		}
//		else{
//			System.out.println(ch+" is not a vowel...");
//		}
	
	
		 }
}























































