package Quiz;

public  enum Award {
		
	GOLD(400),SILVER(300),BRONZE(200),NONE(0);
	
	int score;
	Award (int score){
		this.score=score;
	}
	
	public static Award getAward() {
		return null;
	}
	
}
