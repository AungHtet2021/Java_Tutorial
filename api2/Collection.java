package api2;


import java.util.*;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	List list=new ArrayList<>();
//	list.add(5);
//	list.add("hellow");
//	System.out.println(list);
		
		//integer datatype declare loat obj pyit lox list ka
		//Generic nae write tr
		List <Integer>list= Arrays.asList(4,5,6,7); 
		int total=0;
//		for (int i=0;i<list.size();i++) {
//			total+=list.get(i);
//		}
		for(int num:list) {
			total+=num;
		}
		System.out.println(total);
	}

}
