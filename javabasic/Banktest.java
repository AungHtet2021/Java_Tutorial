package javabasic;

public class Banktest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//
		Person p1=new Person("mya",500);
		Person p2=new Person("kyaw",200);
		Person p3=new Person("hla",100);
		Person []persons= {p1,p2,p3};
		int total=0;
		for(Person p:persons) {
			total+=p.getAmount();
		}
		System.out.println(total);
		
		System.out.println(p1.getAmount()*Person.interest);
		

	
	}
	

}
