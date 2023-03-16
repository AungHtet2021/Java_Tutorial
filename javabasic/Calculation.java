package javabasic;
public class Calculation {
	
	
	public static void main(String[] args) {
		Total.num1=20;
		Total.num2=30;
		Total.addition();
		int sum=Total.substraction(20,30);
		System.out.println("Substraction=" +sum);
		Total obj=new Total();
		obj.multiplication(2, 2);
	}

}

class Total{
	static int  num1,num2; // class variable
	static void addition()  // class method 
	{
		int sum=num1+num2;
		System.out.println("Addition = " +sum);
	}
	static int substraction(int a,int b) {
		int sub=a-b;
		return sub;
	}
	void multiplication(int n1,int n2) {
		int mul=n1*n2;
		System.out.println("Multiplication = " +mul);
	}
}

















