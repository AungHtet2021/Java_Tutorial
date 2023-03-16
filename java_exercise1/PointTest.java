package java_exercise1;

public class PointTest {

	public static void main(String[] args) {
		Point P1=new Point(8,6,"red");
		Point P2=new Point(8,1,"blue");
		
		int x1=P1.getInt1();
		int y1=P1.getInt2();
		int x2=P2.getInt1();
		int y2=P2.getInt2();

		Boolean result=Point.isVertical(x1,x2);
		System.out.println("Is it Vertical line? " +result);
		Boolean result1=Point.isVertical(y1,y2);
		System.out.println("Is it Horizontal line? " +result1);
		System.out.println(P1.toString());

	}

}
