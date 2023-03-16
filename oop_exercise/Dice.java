package oop_exercise;

public enum Dice {
		ONE(1,"ichi"),TWO(2,"ni"),THREE(3,"san"),FOUR(4,"yon"),FIVE(5,"go");
	 int digit;
	 String romaji;
	// enum always private
	private Dice(int digit,String romaji){
		this.digit=digit;
		this.romaji=romaji;
		}
	
	public int getDigit() {
		return digit;
	}
	public String getRomaji() {
		return romaji;
	}
	
	public static Dice getDice(int num) {
		switch(num) {
		case 1:
			return Dice.ONE;
		case 2:
			return Dice.TWO;
		case 3:
			return Dice.THREE;
		case 4:
			return Dice.FOUR;
		case 5:
			return Dice.FIVE;
			default:
				return null;
		}
		
	}
	
	public static void showEntry() {
		for(Dice num:Dice.values()) {
			System.out.println(num.name()+"\t"+"["+num.getDigit()+" "+num.getRomaji()+"]");
		}
	}
	
}
