package oop_exercise;

public class TwoDshape {

	private double width;
	private double height;
	TwoDshape(){
		width=height=0;
	}
	
	TwoDshape(double w,double h){
		width=w;
		height=h;
	}
	
	TwoDshape(double x){
		width=height=x;
	}
	public double getWidth() {
		return width;
	}
//	public void setWidth(double width) {
//		width=width;
//	}
	public double getHeight() {
		return height;
	}
//	public void setHeight(double height) {
//		height=height;
//	}
	void showDim() {
		System.out.println("Width and Height are"+width+"and "+height);
	}
	
	
	
}
