package ch1104;

public enum Ex0401Genre {
	ROMANCE("로맨스"),
	ACTION("액션"), 
	HORROR("공포");
	
	private final String KOR;
	
	Ex0401Genre(String KOR){
		this.KOR = KOR;
	}
	
	public String getString() {
		return KOR;
	}

}
