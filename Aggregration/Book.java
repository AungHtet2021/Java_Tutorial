package Aggregration;

public class Book {

	private String b_name;
	private Author a;
	
	public Book() {
		this.b_name=null;
		this.a=null;
	}
	
	public Book(String b_name,Author a) {
		this.b_name=b_name;
		this.a=a;
	}
	
	public String toString() {
		return "Book name is "+b_name+".\n"+a;
	}
	
}
