package firstPartTest;

public class bookClass {
	String title ;
	String author ;
	String sign ;
	String isbn ;
	
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
	
	   //public void ArrayFill(bookClass book , ArrayList<bookClass> bookArray)
	 //  {
	    //	bookArray.add(book);
	   // }
	
	public String toString() {
		String s = "Book Info is: " + title + " , " + author  + " , "+ sign + " , " + isbn ;
		
		return s ;
	}
}
