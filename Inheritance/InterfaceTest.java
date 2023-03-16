package Inheritance;

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person();
		Dog g=new Dog();
		Cat c=new Cat();
		Phone phone=new Phone();
		Things []tt= {p,g,c,phone};
		for(Things t:tt) {
			t.makeSound();
		}
	}

}


interface Things{
	void makeSound();
	}

class Person implements Things{
	public void speak() {
		System.out.println(this.getClass().getSimpleName()+"->Hello World");
	}
	
	public void makeSound() {
		this.speak();
	}
}

class Dog implements Things{
	public void bark() {
		System.out.println(this.getClass().getSimpleName()+"->Woke woke");
		
	}
	
	public void makeSound() {
		this.bark();
	}
}

class Cat implements Things{
	public void hungry() {
		System.out.println(this.getClass().getSimpleName()+"->mewo mewo");
	}
	
	public void makeSound() {
		this.hungry();
	}
}

class Phone implements Things{
	public void ringUp() {
		System.out.println(this.getClass().getSimpleName()+"->Cling Cling");
	}
	
	public void makeSound() {
		this.ringUp();
	}
}










