package oop_exercise;


interface Makingsound{
	public void sound();
}
class Dog  implements Makingsound{
	public void method1() {
		System.out.println("woke woke");
	}
	@Override
	public void sound() {
		method1();
	}
	
}
class Phone implements Makingsound{
	public void method1() {
		System.out.println("Ring Ring");
	}
	@Override
	public void sound() {
		method1();
	}
	
}
class Person implements Makingsound{
	public void method1() {
		System.out.println("hello");
	}
	@Override
	public void sound() {
		method1();
	}
	
}

public class MakingSoundTest {

	public static void main(String[] args) {
			Dog d=new Dog();
			Phone p=new Phone();
			Person p1=new Person();
			
			Makingsound ss[]= {d,p,p1}	;
//			for(int i=0;i<ss.length;i++) {
//				ss[i].sound();
//			}
			for(Makingsound s:ss) {
				s.sound();
			}
		

	}

}



