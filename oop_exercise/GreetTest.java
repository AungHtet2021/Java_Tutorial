package oop_exercise;

import java.util.Scanner;

interface Greeting{
	public void greet();
}

 class Myanmar implements Greeting{
	 @Override
	public void greet() {
	System.out.println("Mingalar par");	
	}
}
 class English implements Greeting{

	@Override
	public void greet() {
		System.out.println("Hello,How are you??");
		
	}
	 
 }
public class GreetTest {

	public static void main(String[] args) {
		System.out.println("1.English \t 2.Myanmar");
		System.out.println("Enter language");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		Greeting greet = null;
		if(num==1) {
			greet=new English();
		}
		else if(num==2) {
		greet=new Myanmar();}
		greet.greet();

}
}



