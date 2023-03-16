package Aggregration;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape st=new Shape();
		st.setColor("white");
		System.out.println(st);
		st.calculateArea();
		Circle cc=new Circle();
		cc.setColor("Red");
		cc.setRadius(5);
		System.out.println(cc);//toString method
		cc.calculateArea();
		Rectangle rr=new Rectangle();
		rr.setColor("green");
		rr.setWidth(2);
		rr.setHeight(2);
		System.out.println(rr);
		rr.calculateArea();
	}

}
