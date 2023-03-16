package java_exercise;

import java.util.Scanner;

public class Do_while_guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,answer;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 to 10 :");
		do {
			num=sc.nextInt();
			answer=5;
			if(num==answer)
				System.out.println("Correct..");
			else {
				System.out.println("Not correct...");
				if(num>answer) 
					System.out.println("higher...");
				
				else
					System.out.println("lower...");
			}
}
		while(num!=answer);
		System.out.println("You Win..");
		


	
	
	
}
}
