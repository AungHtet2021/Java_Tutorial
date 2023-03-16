package rock_paper_scissor;

public abstract class Player {

	protected String name;
	protected int score;
	
	
	public Player() {
		
	}
	public Player(String name) {
		this.name=name;
		score=0;
	}
	
	public String getName() {
		return name;//this.name lal ya dl..
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getScore() {
		return this.score;
	}
	
	public void setScore(int score) {
		this.score=score;
	}
	
	
	
	
}
