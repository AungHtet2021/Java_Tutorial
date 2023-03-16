package oop_exercise;

import java.util.Scanner;

public class POS1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product1 p1=new Product1("noodle",200,50);
		Product1 p2=new Product1("coffee",300,30);
		DiscountPrice1 p3=new DiscountPrice1("rice",500,30);
		Product1 product[]= {p1,p2,p3};
		for(int i=0;i<product.length;i++) {
			System.out.print((i+1)+" : "+product[i].toString());
			if(product[i]instanceof DiscountPrice1) {
				DiscountPrice1 pp=(DiscountPrice1) product[i];
				pp.msg();
			}
			System.out.println();
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number ");
		int num=sc.nextInt();
		System.out.println("Enter qty");
		int qty=sc.nextInt();
		System.out.println(product[num-1].calculatePrice(qty));
		
	}

}

class Product1{
	protected String name;
	protected int unit_price;
	protected int stock;
	
	public Product1(String name, int unit_price, int stock) {
		super();
		this.name = name;
		this.unit_price = unit_price;
		this.stock = stock;
	}
	
	public String calculatePrice(int qty) {
		if(stock>=qty) {
			int price=qty*unit_price;
			stock-=qty;
			return ("total "+price+"kyats");
		}
		return ("Invalid number");
	}

	@Override
	public String toString() {
		return name + " " + unit_price ;
	}
}

class DiscountPrice1 extends Product1{
	private float dis=0.1f;
	public DiscountPrice1(String name, int unit_price, int stock) {
		super(name, unit_price, stock);
		// TODO Auto-generated constructor stub
	}

	public String calculatePrice(int qty) {
		if(stock>=qty) {
			float price=(unit_price*qty)-(unit_price*qty*dis);
			stock-=qty;
			return ("Total Cost "+price+" kyats");
			
		}
		return ("Invalid number");
	}
	
	public void msg() {
		System.out.println( " Got 10% discount");
	}
	
	
	
}

