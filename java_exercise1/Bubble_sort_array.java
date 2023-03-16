package java_exercise1;

import java.util.Random;

public class Bubble_sort_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array= {5,1,2,3,4};
		bubbleSort(array);
		Random rand=new Random();
		int num=rand.nextInt(10)+1;
//		System.out.println(num);
//		for(int i:array) {
//			System.out.print(i+" ");
//		}
		for (int i=0;i<array.length;i++) {
//			System.out.print(array[i]+" ");
		if(num==array[i]) {
				System.out.print("The key is found i["+i+"] : "+array[i]+ " = "+num);
				break;
			}else {
				System.out.println("The key is not found i["+i+"] : "+array[i]+" != "+num);
				break;
			}
		}
		}
	private static void bubbleSort(int[] array) {
		for(int i=0;i<array.length-1;i++) {
			for(int j=0;j<array.length-i-1;j++) {
				if(array[j]>array[j+1]) {
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}		
}
}
