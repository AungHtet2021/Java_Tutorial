package Aggregration;

public class Rectangle extends Shape{
	int width;
	int height;
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width=width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height=height;
	}
	
	public void calculateArea() {
		System.out.println("Rectangle area:"+(width*height));
	}
	public String toString() {
		return "Rectangle [color="+color+",width="+getWidth()+",height"+height+"]";
		
	}
}








