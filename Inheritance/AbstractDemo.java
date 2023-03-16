package Inheritance;



public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Shape c=new Circle1("Red",1.1f);
				Shape r=new Rectangle("Blue",2.2f,1.1f);
				Shape t=new Triangle("Red",1.1f,2.0f);
				Shape []shapes= {c,r,t};
				for(Shape s:shapes) {
					s.calculateArea();
				}
				System.out.println(t.toString());
				System.out.println(c);
				System.out.println(r);
				
	}

}

abstract class Shape{
	private String color;
	public  abstract void calculateArea();
	public Shape() {
		
	}
	public Shape(String color) {
		super();
		this.setColor(color);
	}
	
	public String toString() {
		return "Shape[color="+getColor()+"]";
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}

abstract class Circle extends Shape{
	float radius;

	public Circle(String color,float radius) {
		super(color);
		this.radius=radius;
	}
	
	public String toString() {
		return "Circle [radius="+radius+"]";
	}
}

class Circle1 extends Circle{
	public Circle1(String color,float radius) {
		super(color,radius);
	}
	public void calculateArea() {
		System.out.println("Area:"+(3.14*super.radius*super.radius)+" "+ getColor());
	}
}

class Rectangle extends Shape{
	private float length;
	private float width;
	public Rectangle(String color,float length,float width) {
		super(color);
		this.length=length;
		this.width=width;
	}
	
	@Override
	public void calculateArea() {
		System.out.println("Area:"+(length*width)+" "+getColor());
		
	}
	
	public String toString() {
		return "Rectangle [length="+length+",width="+width+"]";
	}
}

class Triangle extends Shape{
	private float base;
	private float height;
	
	public Triangle (String color,float base,float height) {
		super(color);
		this.base=base;
		this.height=height;
	}
	@Override
	public void calculateArea() {
		System.out.println("Area:"+(0.5*base*height));
		
	}
	
	public String toString() {
		return "Triangle[base="+base+",height"+height+"]";
	}
	
}



