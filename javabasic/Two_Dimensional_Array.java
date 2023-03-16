package javabasic;

public class Two_Dimensional_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int table [][]=new int [4][2];
//		for(int i=0;i<4;i++) {
//			for(int j=0;j<2;j++) {
//				System.out.print(table[i][j]=i*i);;
//			}
//			System.out.println();
//		}
//		for(int i=0;i<4;i++) {
//			for(int j=0;j<2;j++) {
//				System.out.print(table[i][j]);
//			}
//			System.out.println();
//		}
//	
		
		
		int []nums= {2,34,56,4,7,8,9,3};
		int Searchvalue=4;
		for(int i=0;i<8;i++) {
			if(Searchvalue==nums[i]) {
				System.out.println("Value found");
				break;
			}
			else {
				System.out.println("not found");
				break;
			}
		}
		
		
		
	
		
		
		
		
		
}
}
