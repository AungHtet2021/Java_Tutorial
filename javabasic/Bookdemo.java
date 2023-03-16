package javabasic;

public class Bookdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book B[]=new Book[3];
		B[0]=new Book("twin","U phone",2009);
		B[1]=new Book("sky","U lynn",2008);
		B[2]=new Book("blue","U kaung",2007);
		
		for(int i=0;i<B.length;i++) {
			B[i].show();
		}
		
	}

}

class Book{
	private String title;
	private String author;
	private int pubdate;
	
	 Book(String t,String a ,int p) {
		title=t;
		author=a;
		pubdate=p;
	}
	
	void show() {
		System.out.print(title+"  "+author+"  "+pubdate);
//		System.out.print(author);
//		System.out.print(pubdate);
		System.out.println();
	}
	
	
}




















