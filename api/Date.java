package api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		
		LocalDate now= LocalDate.now();
//		LocalDate d1=LocalDate.of(2000, 05, 05);
		LocalDate d2=LocalDate.parse("1995-01-21");
		System.out.println(d2);
//		Month m=d1.getMonth();
		System.out.println(now);
//		
		LocalDate birth=LocalDate.of(1995, 01, 21);
		Period e=Period.between(birth, now);
		System.out.println(e);
		
//		LocalTime t=LocalTime.now();
//		System.out.println(t);
//		
//		LocalDateTime t1=LocalDateTime.now();
//		;
//		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("YYYY MMMM");
//		System.out.println(t1.format(formatter));
//		
//		LocalDate t2=LocalDate.of(1995, 01, 21);
//		System.out.println(t2);
		
//		Period e=Period.between(t1, t2);
//		System.out.println(e);
		
//		int array[]= {1,2,3,5,6,7,9,6,5,4}	;
//		System.out.println(Arrays.binarySearch(array,7));
		
//		int arr[]=new int[5];
//		Arrays.fill(arr, 1);
//		int[] arr1=Arrays.copyOf(arr, 10);
//		System.out.println(Arrays.toString(arr1));
		
		
//		int arr[]=new int [5];
//		Arrays.fill(arr, 2);
//		int []arr1=Arrays.copyOf(arr, 15);
//		System.out.println(Arrays.toString(arr1));
//		System.out.println(Arrays.toString(arr1));
		
//		int arr[]= {2,3,4,5,6,7,8,9};
//		int []arr1=Arrays.copyOfRange(arr, 2, 4);
//		System.out.println(Arrays.toString(arr1));
		
//		int arr[]= {4,5,6,2,7,8,9};
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		
		int arr[]= {1,2,3,4,5,6};
		int arr1[]= {2,3,4,5,6,1};
		
		String array[]= {"east,west,north,south"};

		System.out.println(Arrays.toString(array));
		
		
	}



}
