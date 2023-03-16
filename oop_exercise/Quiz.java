package oop_exercise;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []array= {1,3,5,6,11,2,3};
		System.out.println(twoSum(array,17));
	}
	
	public static String twoSum(int []arr,int sum) {
		String ourResult="";
		boolean bol=true;
		while(bol) {
			for(int i=0;i<arr.length;i++) {
				for(int j=1;j<arr.length;j++) {
					if( arr[i]+arr[j] == sum) {
						ourResult =arr[i]+" and "+arr[j];
						return ourResult;
					}
				}
			}
			bol=false;
		}
		
		
		return ourResult;
	}

}



