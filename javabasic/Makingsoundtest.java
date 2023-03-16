package javabasic;

public class Makingsoundtest {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		Phone p=new Phone();
		Person1 p1=new Person1();
		MakingSound []per= {d,p,p1}	;
		for(MakingSound ss:per) {
			ss.makesound();
		}
		

	}

}

interface MakingSound{
	public void makesound();
}
class Dog implements MakingSound{
	public void bark() {
		System.out.println("woke woke");
	}
	public void makesound() {
		bark();
	}
}
class Phone implements MakingSound{
	public void ring() {
		System.out.println("ring ring");
	}
	public void makesound() {
		ring();
	}
}
class Person1 implements MakingSound{
	public void voice() {
		System.out.println("hello hello");
	}
	public void makesound() {
		voice();
	}
}






