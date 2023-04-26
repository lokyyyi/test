package ch1003;

public class Ex03test {
	
	public static void main(String[] args) {
		Name a = new Name();
		a.setAuthor("D");
		System.out.println(a.getAuthor());
	}

}

class Name {
	private String author;
	
	
	public static boolean checkName(String author) {
		
		class Author{
			private String author;
			public Author(String author) {
				this.author = author;
			}
			
			public boolean checkAlphabet() {
				for (int i=0; i<author.length(); i++) {
					char ch = author.charAt(i);
					if (!(ch >= 'A' && ch <= 'Z')) {
						if (ch != ' ')
							return false;
					}
				}
				return true;
			}
		}
		Author obj = new Author(author);
		
		return obj.checkAlphabet();
	}
	
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		if(!Name.checkName(author))
			return;
		this.author = author;
	}
}	
/*
문제 1.
로컬 클래스를 사용하여 저자 이름 유효성 검사 메소드를 코딩하세요.
저자 이름은 영문 대문자, 공백만 가능합니다.
*/