package java_exercise1;

import java.util.Scanner;

public class Body_Weight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Pound : ");
		int pound=sc.nextInt();
		System.out.println("Enter Your Feet : ");
		int feet=sc.nextInt();
		System.out.println("Enter Your Inches : ");
		int inches=sc.nextInt();
		Bodycheck body=new Bodycheck();
		body.pound=pound;
		body.feet=feet;
		body.inches=inches;
		body.kilogram();
		body.meter();
		body.BIM();
		
	}
}
 class Bodycheck{
	public int pound,feet,inches;

	float kg;
	float meter;
	
	
	void kilogram() {
		
		double kg=0.454 * pound;
		this.kg=(float)kg;
		
	}
	
	void meter() {
		
		double meter= (feet*12+inches)*0.0245;
		this.meter=(float)meter;
		
	}
	
	void BIM( ) {
		float bim=kg/meter*meter;
		if(bim<18) {
			System.out.println("Under Weight : "+bim);
		}
		else if(bim>24.9) {
			System.out.println("Over Weight : "+bim);
		}
		else {
			System.out.println("Healthy : "+bim);
		}
		
	}
	
}


