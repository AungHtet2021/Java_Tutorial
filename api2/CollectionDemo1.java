package api2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Student{
	int id;
	String name;
	String Result;
	int total;
	public Student(int id, String name, String result, int total) {
		super();
		this.id = id;
		this.name = name;
		this.Result = result;
		this.total = total;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getResult() {
		return Result;
	}

	public void setResult(String result) {
		this.Result = result;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", result=" + Result + ", total=" + total + "]";
	}


	
	
	
}


public class CollectionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List <Student> stds=new ArrayList<>();
//		stds.add(new Student(1,"Aye Aye","pass",200));
//		stds.add(new Student(1,"Kyaw Kyaw","fail",200));
//		stds.add(new Student(1,"Mg Mg","pass",200));
//		
//		for(Student std:stds) {
//			if(std.getResult().equals("pass")) {
//				System.out.println(std.getName());
//			}
//		}
		
		Map<Integer, Student> map=new HashMap<>();
		map.put(1, new Student(1,"Aye Aye","pass",200));
		map.put(2,new Student(1,"Kyaw Kyaw","fail",200));
		map.put(3,new Student(1,"Mg Mg","pass",200));
//		System.out.println(map.get(2));
		
//		Set <Integer>set=new HashSet<>();
//		set.add(1);
//		set.add(1);
//		set.add(2);
//		System.out.println(set);
		
		Set set=map.entrySet()	;
		Iterator it=set.iterator();
		while(it.hasNext()) {
			Entry <Integer,Student>entry=(Entry<Integer,Student>)it.next();
			
			Student obj=entry.getValue();
			if(obj.getResult().equals("fail")) {
				System.out.println(entry.getKey()+" "+ obj.getName());
			}
//			System.out.println("Key is "+entry.getKey()+"\n"+"Value is"+entry.getValue());
		}
		
		
		
	}

}


