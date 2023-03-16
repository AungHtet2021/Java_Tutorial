package Quiz;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] questions= {"javascript is concerning with java?\n A.True\t B.false",
								"The structure of stack is\n A.LIFO\tB.lILO\tC.FLIO\tD.TOLI",
								"The structure of stack is\n A.LIFO\tB.lILO\tC.FLIO\tD.TOLI",
								"The structure of stack is\n A.LIFO\tB.lILO\tC.FLIO\tD.TOLI",
								"javascript is concerning with java?\n A.True\t B.false",
								"javascript is concerning with java?\n A.True\t B.false",
								"javascript is concerning with java?\n A.True\t B.false",
								"javascript is concerning with java?\n A.True\t B.false"};
		char[] answers= {'A','B','D','C','A','B','B','A'};
								
		for(int i=0;i<questions.length;i++) {
			System.out.println(questions[i]);
		}
		
		Question que=new Question(questions,answers);
		Scanner sc=new Scanner(System.in);
		char ch[]=new char[8];
		for(int i=0;i<que.questioncount();i++) {
//			System.out.println((i+1)+" "+que.getQuestion(i));
			ch[i]=sc.nextLine().toUpperCase().charAt(0);
		}
		
		
		
		
		
	}

}
