package oop_exercise;

import java.util.Scanner;

public class POS {
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product P =new Product("coffee",200,50);
		Product P1=new Product("noddle",300,100);
		DiscountProduct P2=new DiscountProduct("bread",350,150);
		Product products[]= {P,P1,P2}	;
		for(int i=0;i<products.length;i++) {
			System.out.print((i+1)+"."+products[i].toString());
			if(products[i]instanceof DiscountProduct) {
				DiscountProduct pp=(DiscountProduct) products[i];  //downcasting Polymophsim
				
				pp.msg();
			}
			System.out.println();
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number :");
		int no=sc.nextInt();
		System.out.println("Enter qty :");
		int qty=sc.nextInt();
		System.out.println(products[no-1].calculatePrice(qty));
	}

}

class Product{
	protected  String name;
	protected int unit_price;
	protected int stock;

public Product(String name,int unit_price,int stock) {
	super();
	this.name=name;
	this.unit_price=unit_price;
	this.stock=stock;
}

public String calculatePrice(int qty) {
	if(stock>=qty) {
		int price=qty*unit_price;
		stock-=qty;
		return ("total"+price);
	}
	return ("invalid number");
}
	
public String toString() {
	return name+" "+unit_price;
}
}

class DiscountProduct extends Product{
	private float dis_amount=0.1f;

	public DiscountProduct(String name, int unit_price, int stock) {
		super(name, unit_price, stock);
		
	}
	
	// Method Overriding
	public String calculatePrice(int qty) {
		if(stock>=qty) {
			float price=(qty*unit_price)-((qty*unit_price)*dis_amount);
			stock-=qty;
			return ("total "+price);
		}
		return ("invalid number");
	
	}
	public void msg() {
		System.out.println("   got discount");
	}
	
}









