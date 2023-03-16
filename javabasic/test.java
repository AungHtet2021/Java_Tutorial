package javabasic;
import java.io.*;
import java.util.Scanner;
public class test {
public static void main(String[] args) throws IOException 
	{
	
		
//		System.out.println("Enter int");
//		char a=(char)System.in.read();
//		System.out.println(a);
		
//		switch(num) {
//		case 1 : System.out.println("Green");
//		break;
//		case 2 : System.out.println("Red");
//		break;
//		case 3 : System.out.println("Yellow");
//		break;
//	    default : System.out.println("error...");
//		}
	
//	for(int j=1;j<=3;j++)
//	{
//	for(int i=1;i<=12;i++) {
//		System.out.println( j+" x " +i+ " = " +j*+i);
//	}
//	
//		System.out.println("----------");
//	}
//	
//	String studName,classNo;
//	int age;
//	Scanner sc =new Scanner(System.in);
//	System.out.println("Enter StudName : ");
//	studName=sc.nextLine();
//	System.out.println("Enter classno : ");
//	classNo=sc.nextLine();
//	System.out.println("Enter Age : ");
//	age=sc.nextInt();
//	System.out.println("Student Data");
//	System.out.println("StudName\t : " +studName);
//	System.out.println("ClassNo\t\t : " +classNo);
//	System.out.println("StudName\t : " +age);
//	
	
	int num=0,answer=5;
	Scanner s=new Scanner(System.in);
	while(num!=answer) {
		System.out.println("Can you guess the number 1 to 10:");
		num=s.nextInt();
		if(num==answer)
			System.out.println("Right...");
		else {
			System.out.println("Wrong Try Again");
			if(num<answer)
				System.out.println("Too Low..");
			else
				System.out.println("Too Hight..");
		}
		}
	
//	int num,answer=5;
//	Scanner sc = new Scanner(System.in);
//	do {
//		System.out.println("Type any number:");
//		num = sc.nextInt();
//	}while(num!=answer);
//		System.out.println("Congratulation you won...");
	
//	int num1=0;
//	while(num1<=100) {
//		System.out.println("Value of Variable is :"+num1);
//		if(num1==5) {
//			break;}
//		num1++;
//	}
//	System.out.println("Out of While loop body...");
	
//	int i;
//	for(i=1;i<=100;i++) {
//		if(i%2==0)
//			continue;
//		System.out.println(i);
//	}


//	for (int j=5;j>=1;j--) {
//	for (int i = j; i>=1; i--) {
//		System.out.print(i);
//	}
//	
//	System.out.print("\n");
//	}
	
//	int num,answer;
//	
//	Scanner sc = new Scanner(System.in);
//	System.out.println("PL enter 1 to 10");
//	do {
//	
//	num=sc.nextInt();
//	answer=5;
//	if(num==answer)
//		System.out.println("Right..");
//	else { 
//		System.out.println("Wrong Try Again");
//		if(num<answer)
//			System.out.println("Too Low...");
//		else
//			System.out.println("Too High...");}
//	}
//	while(num!=answer);
//	System.out.println("You Win..");
	
//	int []number= {1,4,4,7,9,8,6};
//	for(int i=0;i<number.length;i++) {
//	System.out.println("number["+i+"] : "+number[i]);
//	}	
//	
//	int []num=new int[10];
//	Scanner sc=new Scanner(System.in);
//	for(int i=0;i<10;i++) {
//		System.out.println("Enter Number:");
//		num[i]=sc.nextInt();
//		}
//	for(int i=0;i<10;i++) {
//		System.out.println("number["+i+"] : "+num[i]);
//	}
	
//	int []array= {1,3,6,7,3,9,7,8,3};
//	for(int i=0;i<array.length;i++) {
//		System.out.println("array["+i+"]:"+array[i]);
//	}
//	
//	int []number=new int[10];
//	Scanner sc=new Scanner(System.in);
//	System.out.println("enter number : ");
//	for(int i=0;i<10;i++) {
//	
//		number[i]=sc.nextInt();
//		
//	}
//	for (int i=0;i<10;i++) {
//		System.out.println("Number["+i+"] : "+number[i]);
//	}
	
//	int []arr= {34,2,4,6,8,9,6};
//	int Searchvalue=0;
//	boolean found =false;
//	for (int i=0;i<arr.length;i++)
//	
//	{
//		if(Searchvalue==arr[i]) {
//			found=true;
//			break;
//		}
//		
//	}//end loop
//	if(found)
//	System.out.println("found");
//	else
//		System.out.println("not found");
	
}
}


































