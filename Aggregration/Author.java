package Aggregration;

public class Author {

	private String name;
	private int age;
	
	public Author() { //default constructor
		this.name=null;
		this.age=0;
	}
	
	public Author(String name,int age) { // two arguments constructor
		this.name=name;
		this.age=age;
	}
	
	public String toString() {
		return "Author name is "+name+" and age is " +age+" ";
	}
	
	
}
