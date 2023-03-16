package oop_exercise;

public class Triangle extends TwoDshape{
		String style;
		Triangle(){
			super();
			style="none";
		}
		Triangle(String s,double w,double h){
			super(w,h);
			style=s;
		}
		Triangle(double x){
			super(x);
			style="filled";
		}
		double area() {
			return (getWidth()*getHeight())/2;
		}
		void showStyle() {
			System.out.println("Triangle is "+style);
		}
}
