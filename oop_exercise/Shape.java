package oop_exercise;

public class Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t1=new Triangle();
		Triangle t2=new Triangle("Outlined",8,12);
		Triangle t3=new Triangle(4);
		
		
		
		System.out.println("Info for t1:");
		t1.showDim();
		t1.showStyle();
		System.out.println("Area is "+t1.area());
		System.out.println();
		
		System.out.println("Info for t2: ");
		t2.showDim();
		t2.showStyle();
		System.out.println("Area is "+t2.area());
		System.out.println();
		
		System.out.println("Info for t3:");
		t3.showDim();
		t3.showStyle();
		System.out.println("Area is "+t3.area());
		
	}
}
