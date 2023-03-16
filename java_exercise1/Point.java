package java_exercise1;

 class Point {
	private int x;
	private int y;
	private String color;
	 
	Point(){
		x=y=0;
		color=null;
	}
	
	Point(int x,int y,String color){
		this.x=x;
		this.y=y;
		this.color=color;
	}
	
	public int getInt1() {
		return x;
	}
	public int getInt2() {
		return y;
	}
	public String toString() {
		return color;
	}
	public static boolean isVertical(int x1,int x2) {

		return x1==x2;
	}
	public static boolean isHorizontal(int y1,int y2) {
		return y1==y2;
	}
	
	
	
}