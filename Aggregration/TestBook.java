package Aggregration;

public class TestBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author author=new Author("Sayar Mya",65);
		Book b1=new Book("wind",author);
		Book b2=new Book("chicken",new Author("Sayar Mya",65));
		System.out.println(author.toString());
		System.out.println(b1);
		System.out.println(b2);
	}

}
