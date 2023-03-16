package api2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printAverage(100,0); // (1) 
		System.out.println("Exit main()."); // (2) 
		} 
		public static void printAverage(int totalSum, int totalNumber) { 
		int average = computeAverage(totalSum, totalNumber); 
		System.out.println("Averge"+totalSum+"/"+totalNumber+"="+average);
		
		System.out.println("Exit printAverage().");  
		} 
		public static int computeAverage(int sum, int number) { 
		System.out.println("Computing average."); // (6) 
		return sum/number; // (7) 
		
	}

}
