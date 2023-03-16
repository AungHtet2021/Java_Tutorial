package Aggregration;

public class Circle extends Shape {
	int radius;
	private static final float PI=3.14f;
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius=radius;
	}
	
	public void calculateArea() {
		System.out.println("Circle area:"+(PI*radius*radius));
	}
	
	public String toString() {
		return "Circle[color="+getColor()+",radius"+radius+"]";
	}
}
