package java_exercise;

public class Factorial {

	public static void main(String[] args) {
		int i;
		int num=1;
		for( i=5;i>=1;i--){
		System.out.print( i+"\t");
		num=num*i;
		}
		System.out.print(num);
	}

}
