package ch0901;

//업캐스팅

public class Ex01Upcasting {
	
	public static void main(String[] args) {
		Book book = null;
		book = new Book();
		
		book.setTitle("자바 기본문법");
		System.out.println(book.getTitle());
		
		book = new EBook();			//업캐스팅
		
		//EBook eb = new EBook();
		//book = eb;
		
		book.setFontColor("블랙");
		System.out.println(book.getFontColor());
		book.setTitle("자바 자료구조");
		System.out.println(book.getTitle());
		
		book = new AudioBook();
		book.setTitle("abcde");
		System.out.println(book.getTitle());
		
		book.setVolume(50);
		System.out.println(book.getVolume());
		
	}

}

class Book{
	private String title;
	private String fontColor;
	private int volume;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setFontColor(String fontColor) {
		this.fontColor = fontColor;
	}
	
	public String getFontColor() {
		return fontColor;
	}
	
	public void setVolume(int volume) {
		this.volume	= volume;
	}
	
	public int getVolume() {
		return volume;
	}
}

class EBook extends Book{
	private String fontColor;
	
	@Override
	public String getFontColor() {
		return fontColor;
	}
	@Override
	public void setFontColor(String fontColor) {
		this.fontColor = "[이북]" + fontColor;
	}
	
	@Override
	public void setTitle(String title) {
		title = "[EBOOK]" + title;
		super.setTitle(title);
		
	}
}

class AudioBook extends Book {
	
	@Override
	public void setTitle(String title) {
		title = "[오디오]" + title;
		super.setTitle(title);	
	}
	@Override
	public void setVolume(int volume) {
		super.setVolume(volume);
		
	}
}
/*
문제 1.
book.setFontColor("블랙") 코드에서 컴파일 오류가 나지 않도록 수정해 주세요.
문제 2.
Book의 자식 클래스인 AudioBook 클래스를 추가해 주세요.
업캐스팅을 이용해 AudioBook 클래스의 특정 메소드를 호출하는 코드를 작성하세요. 
*/
//protect 문제 , 왜 안바뀌는지