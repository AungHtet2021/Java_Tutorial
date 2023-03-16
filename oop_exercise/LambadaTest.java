package oop_exercise;

import java.util.function.Consumer;

interface A1{
//	public int method(int a ,int b);
//	public void method();
	
//	public int  method1(int a,int b);
//	public int  method2(int a,int b);
}
interface Calculator{
	public String add(int a,int b);
}
public class LambadaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//return pyan
		/*
		 * A1 obj=(a,b)->(a*b); System.out.println(obj.method(4, 5));
		 */
		// void return ma pyan
		/*
		 * A1 obj=()->System.out.println("hello world"); obj.method() ;
		 */
		//Anonymous inner class
	
//		  A1 obj=new A1() {
//		  public int method1(int a,int b) {
//			 return (a+b);
//		  }
//		  public int  method2(int a,int b) {
//			 return (a+b);
//		  }
//		  
//		  };
//		  System.out.println(obj.method1(5,8));
//		  System.out.println(obj.method2(10,8));
		
//ANONYMOUS		 
		
//		Calculator c = new Calculator() {
//			public String add(int a, int b) {
//				return "Result " + (a + b);
//			}
//		};
//		System.out.println(c.add(5, 8));
		 
//LAMBDA		
		//return
//		Calculator c1=(a,b)->"result is "+(a*b);
//		System.out.println(c1.add(10,10));
//		
//		Calculator c2=(x,y)->"result is  " +(x+y);
//		System.out.println(c2.add(1,2));
	
//DEFAULT LAMBDA
		//void
		Consumer<Integer> cc=(a)->System.out.println(a);
		cc.accept(5);
		
		
	
	
	}

}
