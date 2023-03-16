package java_exercise;

import java.util.Scanner;

public class If_else {

	public static void main(String[] args) {
//		int mark1=38, mark2=50, mark3=86,mark;
		int mark;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter your score = ");
		mark=s.nextInt();
		if(mark<40) {
			System.out.println("You fail...");
		}
		else if (mark>=40 && mark<80){
			System.out.println("You pass without distinction... ");
		}
		else {
			System.out.println("You pass with distinction...");
		}
}
}
