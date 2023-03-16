package java_exercise1;

import java.util.Random;
import java.util.Scanner;

public class Card {
	public static final String[] NUMBERS= {"1","2","3","4","5","6","7","8","9","10","J","Q","K"};
	public static final String[] SUITS= {"Club","Heart","Diamond","SPADE"};
	
	private String suit1;
	private int num1;
	private String suit2;
	private int num2;
	
	public Card() {
		
	}

	public Card(String suit1, int num1) {
		super();
		this.suit1 = suit1;
		this.num1 = num1;
	}
	
	Random rand=new Random();
	int suitNum=rand.nextInt(SUITS.length);
	int number=rand.nextInt(13)+1;
	
	public String getSuit() {
		
		if(suitNum==0) {
			suit2=SUITS[0];
		}
		else if(suitNum==1) {
			suit2=SUITS[1];
		}
		else if(suitNum==2) {
			suit2=SUITS[2];
		}
		else if(suitNum==3)	{
			suit2=SUITS[3];
		}
		return suit2;
	}
	
	public int getInt() {
		if(number==1) {
			num2=1;
		}
		else if(number==2) {
			num2=2;
		}
		else if(number==3) {
			num2=3;
		}
		else if(number==4) {
			num2=4;
		}
		else if(number==5) {
			num2=5;
		}
		else if(number==6) {
			num2=6;
		}
		else if(number==7) {
			num2=7;
		}
		else if(number==8) {
			num2=8;
		}
		else if(number==9) {
			num2=9;
		}
		else if(number==10) {
			num2=10;
		}
		else if(number==11) {
			num2=11;
		}
		else if(number==12) {
			num2=12;
		}
		else if(number==13) {
			num2=13;
		}
		return num2;
	}
	
	public void playCard(Card card) {
		String result;
		System.out.println("player 1 "+card.suit1);
		System.out.println("player 1 "+card.num1);
		System.out.println("player2 "+getSuit());
		System.out.println("player2 "+getInt());
		if(card.suit1.equals(getSuit())) {
			result=(card.num1>num2)?"player 1 winner":"player 2 winner";
			System.out.println(result);
		}else {
			System.out.println("tied");
		}
		
	
	}
	
	
	
	
	
	
//	public void rand() {
//		System.out.println(suitNum);
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * private String suit1; private int num1;
	 * 
	 * public Card() { // TODO Auto-generated constructor stub }
	 */
//	public Card(int suit,int num){
//		Random rand=new Random();
//		int i=rand.nextInt(SUITS.length);
//		this.suit=SUITS[i];
//		int num1=rand.nextInt(100)+1;
//		this.num1=num1;
//	}
	/*
	 * public String getSuit1() { return suit1; } public int getNum1() { return
	 * num1; }
	 * 
	 * public String toString() { return "suit"+suit1; }
	 * 
	 * 
	 * public void card1() { Random rand=new Random(); int
	 * i=rand.nextInt(SUITS.length); System.out.println(SUITS[i]); // Random
	 * rand=new Random(); this.suit1=SUITS[i]; int num1=rand.nextInt(13)+1; //
	 * System.out.println(num1); this.num1=num1;
	 * 
	 * }
	 * 
	 * public void card2() { Random rand=new Random(); int
	 * i1=rand.nextInt(SUITS.length); System.out.println(SUITS[i1]); int
	 * num2=rand.nextInt(13)+1; System.out.println(num2); }
	 * 
	 * 
	 * 
	 * public static String[] getSuits() { return SUITS; }
	 */
//	@Override
//	public String toString() {
//		return "Card [suit=" + suit + ", num=" + num + "]";
//	}

	
	
}
