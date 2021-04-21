package firstpart;

public class BookClass {
	String title ;
	String author ;
	String sign ;
	String isbn ;
	
	public BookClass()
	  {
		  
	  }
	
	AdminInfo myAdmin = new AdminInfo() ;
  

		
	  public BookClass(String title ,String author ,String sign ,String isbn )
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
	
	public int sumOfIsbn(String isbn, int counter, int sum) {
		int mult;
		for (int i=0 ; i<10 ; i++ ) {
			mult = isbn.charAt(i) * counter ;
			sum += mult ; 
			counter -- ;
		}
		return sum;
	}
	
	 
	
 // this line for test 
	
	public String toString() {
		
		return "Book Info is: \n " + "The Title: "  + title + " , " + "The Author: " + author  + " , "+ "The Signture: " + isbn ;
	}
}
