package oop_exercise;

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car c =new car();
		System.out.println("vehicle speed is "+c.Calculate());
	}

}

class vehicle{
	public double Calculate() {
		double speed,distance,time;
		distance=8;
		time=5;
		speed=distance/time;
		
		return speed;
	}
}

class car extends vehicle{
	public double Calculate() {
		double x;
		x=super.Calculate()	;// method overriding
		return x;
	}
}