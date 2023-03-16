package java_exercise;

import java.util.Scanner;

public class For_guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,answer;
		Scanner sc =new Scanner(System.in);
		System.out.println("Pl enter 1 to 10 : ");
		int tryCount = 0;
		for (int i=1;i<=5;i++){
			
			num=sc.nextInt();
			  tryCount++;
		      answer=7;
		if(num==answer) {
			System.out.println("Corret!..You Win..");
			System.out.println("It took you "+tryCount+" times");
			break;
			}
		else 
		{
			System.out.println("Wrong...");
			if(num>answer)
			System.out.println("high");
			else 
				System.out.println("low");
		}
		}
		
}
}
