package ch1003;

public class Ex0301test {
	
	public static void main(String[] args) {
		Name1 a = new Name1();
		a.setAuthor("sex");
		System.out.println(a.getAuthor());
		
	}

}

class Name1 {
	private String author;
	
	public static boolean checkName(String author) {
		
		class Author {
			private String author;
			public Author(String author) {
				this.author = author;
			}
			
			public boolean checkAlphabet() {
				for (int i=0; i<author.length(); i++) {
					char ch = author.charAt(i);
					if (!(ch >= 'a' && ch <= 'z')) {
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
		if(!Name1.checkName(author))
			return;
		this.author = author;
	}
}