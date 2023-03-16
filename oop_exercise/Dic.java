package oop_exercise;



public enum Dic {
	ONE(1,"ichi"),TWO(2,"ni"),THREE(3,"san"),FOUR(4,"yon"),FIVE(5,"go");
	
	int digit;
	String romaji;
	
	private Dic (int digit,String romaji) {
		this.digit=digit;
		this.romaji=romaji;
	}
	
	
	public int getDigit() {
		return digit;
	}
	public String getRomaji() {
		return romaji;
	}
	
	public static Dic getDic(int num) {
		switch(num) {
		case 1:
			return Dic.ONE;
		case 2:
			return Dic.TWO;
		case 3:
			return Dic.THREE;	
		case 4:
			return Dic.FOUR;
		case 5:
			return Dic.FIVE;	
		default:
				return null;
		}
		
	}
	public static void showEntry() {
		for(Dic num:Dic.values()) {
			System.out.println(num+"["+num.getDigit()+" "+num.getRomaji()+"]");
			
		}
		
	}
	
	
	

}
