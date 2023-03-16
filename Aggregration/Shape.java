package Aggregration;

public class Shape {
	
	String color;
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	
	public void calculateArea() {
		System.out.println("Shape area : 0.0");
	}
	
	public String toString() {
		return "Shape [color="+getColor()+"]";
	}
	
}
