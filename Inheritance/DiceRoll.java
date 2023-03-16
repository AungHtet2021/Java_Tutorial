package Inheritance;

import java.util.Random;
import java.util.Scanner;

public class DiceRoll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter bet:");
		int bet=sc.nextInt()	;
		System.out.println("Enter Guess no:");
		int no=sc.nextInt()	;
		int compensation=0;
		Dice2 d1=new Dice2();
		d1.setColor("White");
//		System.out.println(d1.getDot().getNum());
		if(no==d1.getDot().getNum())compensation++;
		System.out.println(d1);
		Dice2 d2=new Dice2();
		d2.setColor("Black");
		d2.setDot();
		if(no==d2.getDot().getNum())compensation++;
		System.out.println(d2);
		Dice2 d3=new Dice2();
		d3.setColor("Gray")	;
		d3.setDot();
		if(no==d3.getDot().getNum())compensation++;
		System.out.println(d3);
		System.out.println("Bet:Compensation");
		System.out.println(bet+":"+(compensation*bet));
		
	}

}

class Dice2{
	private String color;
	
	enum Dot{
		ONE(1),TWO(2),THREE(3),FOUR(4),FIVE(5),SIX(6);
		
		int num;
		Dot(int num){
			this.num=num;
		}
		public Dot getD(int digit) {
			switch(digit) {
			case 1:
				return ONE;
			case 2:
				return TWO;
			case 3:
				return THREE;
			case 4:
				return FOUR;
			case 5:
				return FIVE;
			case 6:
				return SIX;	
				default:return null;
			}
		}
		
		public int getNum() {
			return num;
		}
		
	}
	
	private Dot d=Dot.FOUR;
	
	public void setColor(String color) {
		this.color=color;
	}
	
	public void setDot() {
		Random r=new Random();
		int no=r.nextInt(6)+1;
		d=d.getD(no);
	}
	
	public Dot getDot() {
		return d;
	}
	
	public String toString() {
		return color+":"+d.name();
	}
	
}













