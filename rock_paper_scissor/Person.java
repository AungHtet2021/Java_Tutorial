package rock_paper_scissor;

import java.util.Scanner;

public class Person extends Player implements Actionable{         
    Difficulty difficulty=null;
//	Scanner sc=new Scanner(System.in);
	int choice;

	
	public Person(){
		setScore(0);
	}

	public Person(String name) {
		super(name);
	}
	
	public int getChoice() {
		return choice;
	}
	
	public void increaseScore(int score) {
		setScore(getScore()+1);//score=score+1;
	}
	
	public Difficulty acceptDifLevel(char dif) {
		
		
			if(dif=='e') {
				difficulty=Difficulty.EASY;
			}else if(dif=='m') {
				difficulty=Difficulty.MIDDLE;
			}else{
				System.out.println("Invalid keyword");
			}
		return difficulty;
		
}
	
	public boolean checkInput(char choice) {
	
			if(choice=='r') {
				this.choice=Constant.ROCK;
				return true;
			}else if(choice=='p') {
				this.choice=Constant.PAPER;
				return true;
			}else if(choice=='s'){
				this.choice=Constant.SCISSOR;
				return true;
			}
			else {
				System.out.println("Invalid keyword for r:p:s");
				return false;
			}
			
	}
	@Override
	public String toString() {
		return "Person [difficulty=" + difficulty + ", choice=" + choice + "]";
	}
	
	
}









