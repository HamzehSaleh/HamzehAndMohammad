package firstPartTest;

public class bookClass {
	private String title ;
	private String author ;
	private String sign ;
	private String isbn ;
	

	
  public bookClass()
  {
	  
  }


	
  public bookClass(String title ,String author ,String sign ,String isbn )
  {
	  this.title=title ;
	  this.author=author ;
	  this.sign=sign; 
	  this.isbn =isbn ; 
	  
  }


	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuther() {
		return author;
	}
	public void setAuther(String author) {
		this.author = author;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
}
