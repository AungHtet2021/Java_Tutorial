package oop_exercise;

public class StackObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=1;
		Stack s=new Stack();
		while(s.push(number)) {
			
			System.out.println("Number Pushed is "+number);
			number++;
			
		}
		System.out.println();
		boolean item=true;
		while(item) {
			number=s.pop()	;
			if(number!=-1)
			System.out.println("Number poped is "+number);
			else
				item=false;
		
		}
		
	}

}
