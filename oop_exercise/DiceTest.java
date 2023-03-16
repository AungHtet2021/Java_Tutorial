package oop_exercise;

import java.util.Scanner;

public class DiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dice.showEntry();
		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		Dice obj=Dice.getDice(num);
		if(obj==null) System.out.println("Invalid number");
		else System.out.println(obj+" "+obj.getRomaji());
		
	}

}
