package Quiz;

public class Question {
	private String[] question=new String[8];
	private char[]	ans=new char[8];
	
	Question(String[] questions,char[] answer) {
		this.question=questions;
		this.ans=answer;
	}
	
	public int questioncount() {
		return question.length;
	}
	
	public char[] getAns() {
		return this.ans;
	}
	
}
