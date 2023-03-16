package oop_exercise;

import java.util.Scanner;

public class DicTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Dic.showEntry();

		
		
	int num2=0;
	int answer=5;
		
				System.out.println("Enter Number");
				Scanner sc=new Scanner(System.in);
				int num=sc.nextInt();
				Dice num1=Dice.getDice(num);
			
			while(num2!=answer) {
				if(num1==null)
			
				System.out.println("Invalid number");
			else 
				System.out.println(num1+" "+num1.getRomaji());
	}
			
}

}
