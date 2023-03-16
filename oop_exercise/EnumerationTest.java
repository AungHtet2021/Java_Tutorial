package oop_exercise;



enum TrafficLight{
		RED,YELLOW,GREEN;
}


public class EnumerationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrafficLight t1=TrafficLight.RED;
		System.out.println(t1.name());
		System.out.println(t1.ordinal());
		TrafficLight t2=TrafficLight.valueOf("GREEN");
		System.out.println(t2.name()+" "+t2.ordinal());
		TrafficLight []lights=TrafficLight.values()	;
		for(TrafficLight l:lights){
			System.out.println(l.ordinal()+" "+l);
		}
	}

}
