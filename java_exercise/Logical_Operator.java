package java_exercise;

import java.io.IOException;

public class Logical_Operator {

	public static void main(String[] args) throws IOException {
		
		char ch;
		System.out.println("Enter Character = ");
		ch=(char)System.in.read();
		if( ch =='a' || ch == 'e'|| ch == 'i' || ch =='o'|| ch=='u' ) {
			System.out.println(ch+" is a vowel...");
		}else {
			System.out.println(ch+" is not a vowel..");
		}
		
		
	}

}
