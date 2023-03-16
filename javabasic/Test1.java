package javabasic;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int charCount=0,wordCount=1;
		System.out.println("Enter String : ");
		String str=sc.nextLine();
		int size=str.length();
		System.out.println("Length of String : "+size);
		for(int index=0;index<size;index++) {
			if(str.charAt(index)!=' ') 
				charCount++;
				if(str.charAt(index)==' ')
					wordCount++;
			}
		System.out.println("Count Char : " +charCount);
		System.out.println("Word Count : "+wordCount);
		System.out.println("UpperCaser : "+str.toUpperCase());
		}

}
