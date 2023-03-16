package java_exercise;

public class Ternary_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age1,age2,sum;age1=16;age2=18;
		sum=(age1>age2)?age1:age2;
		System.out.println(sum);
		if(sum>=18) {
			System.out.println("You have to vote...");
		}
		else {
			System.out.println("You are too young to vote...");
		}
	}

}
