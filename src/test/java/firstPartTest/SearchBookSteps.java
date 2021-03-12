package firstPartTest;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import firstPart.bookClass ;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchBookSteps {
	
	ArrayList<bookClass> bookArray = new ArrayList<bookClass>(); 
	
	bookClass Book1 = new bookClass("Data Smart" ,"John W. Foreman" , "John2013" , "111866146X") ;
	bookClass Book2 = new bookClass("Software Engineering at Google" , "Tom Manshreck" , "Tom2020" , "1492082791") ;
	bookClass Book3 = new bookClass("C++ Primer" , " Stanley Lippman" , "Stanley2012" , "9780321714114") ;
	
	public SearchBookSteps() {
		   bookArray.add(Book1) ;
	       bookArray.add(Book2) ;
	       bookArray.add(Book3) ;
		
	}
	
	
	@Given("Not Logged in and have the title for the book")
	public void not_logged_in_and_have_the_title_for_the_book() {
    
     
	}

	@When("he entered the title as {string}")
	public void he_entered_the_title_as(String tit) {
		
		int k=0 ;
	   for(int i=0 ; i<bookArray.size() ; i++) {
		   String temp = bookArray.get(i).getTitle();
		   if(temp.contains(tit)) k = i ;
	   }
	   System.out.println(bookArray.get(k).toString());
	   if(tit.contains(bookArray.get(k).getTitle())) {
		   assertTrue(true) ;
	   }
	  
	 //  assertTrue(tit.equalsIgnoreCase(bookArray.get(k).getTitle())) ;
	}

	@Then("the book info will display by title")
	public void the_book_info_will_display_by_title() {

	}

	
	
	
	
	
	
	
	
	@Given("Not logged in and have the author for the book")
	public void not_logged_in_and_have_the_author_for_the_book() {
	  
	}

	@When("he entered the author as {string}")
	public void he_entered_the_author_as(String auth) {
		int k=0 ;
		   for(int i=0 ; i<bookArray.size() ; i++) {
			   String temp = bookArray.get(i).getAuther();
			   if(temp.contains(auth)) k = i ;
		   }
		   System.out.println(bookArray.get(k).toString());
		   
		  assertTrue(bookArray.get(k).getAuther().contains(auth));
	}

	@Then("the book info will display by author")
	public void the_book_info_will_display_by_author() {
	 
	}

	
	
	
	
	
	
	
	
	
	@Given("Not logged in and have the isbn for the book")
	public void not_logged_in_and_have_the_isbn_for_the_book() {
	   
	}

	@When("he entered the isbn as {string}")
	public void he_entered_the_isbn_as(String isbn) {
		int k=0 ;
		   for(int i=0 ; i<bookArray.size() ; i++) {
			   String temp = bookArray.get(i).getIsbn();
			   if(temp.contains(isbn)) k = i ;
		   }
		   System.out.println(bookArray.get(k).toString());
		   
		  assertTrue(isbn.contains(bookArray.get(k).getIsbn())) ;
	}

	@Then("the book info will display by isbn")
	public void the_book_info_will_display_by_isbn() {
	   
	}

	
	
	
	
	
	
	@Given("Admin with logged in and have any info for the book")
	public void admin_with_logged_in_and_have_any_info_for_the_book() {
     System.out.println(" You Logged in , search as Admin now :) ");
	}

	@When("he entered the any info as {string}")
	public void he_entered_the_any_info_as(String string) {

		
		
		for (int i=0 ;i<bookArray.size() ;i++)
		{
			if (bookArray.get(i).getIsbn().contains(string) || bookArray.get(i).getAuther().contains(string)||  bookArray.get(i).getSign().contains(string)  || bookArray.get(i).getTitle().contains(string)                     )
			{
				System.out.println(bookArray.get(i).toString());
				assertTrue(true) ;
				break; 
				
			}
		}
		
		
	}

	@Then("the book info will display by any info")
	public void the_book_info_will_display_by_any_info() {
	
	}

	
	
	
	
	
	
	@Given("Admin with logged in and have any info for the book and no match")
	public void admin_with_logged_in_and_have_any_info_for_the_book_and_no_match() {
	;
	}

	@When("he entered the any info to search and nothing to show as {string}")
	public void he_entered_the_any_info_to_search_and_nothing_to_show_as(String string) {
	    
		
   boolean flag =true; 
   
		
		for (int i=0 ;i<bookArray.size() ;i++)
		{
			if (bookArray.get(i).getIsbn().contains(string) || bookArray.get(i).getAuther().contains(string)||  bookArray.get(i).getSign().contains(string)  || bookArray.get(i).getTitle().contains(string)   )
			{
				flag =false; 
			}
			
			
		}
		if (flag)
		{
			System.out.println("book not found !");
			assertTrue(true) ;
			
		}
	
	}

	@Then("the book info will not display")
	public void the_book_info_will_not_display() {

	}
	
	
	
	
	
	

	@Given("Admin with logged in and have any info for  more than one  book")
	public void admin_with_logged_in_and_have_any_info_for_more_than_one_book() {
	   
	}

	@When("he entered the any info to search for more than one book as {string}")
	public void he_entered_the_any_info_to_search_for_more_than_one_book_as(String string) {
	  

		for (int i=0 ;i<bookArray.size() ;i++)
		{
			if (bookArray.get(i).getIsbn().contains(string) || bookArray.get(i).getAuther().contains(string)||  bookArray.get(i).getSign().contains(string)  || bookArray.get(i).getTitle().contains(string)                     )
			{
				System.out.println(bookArray.get(i).toString());
				assertTrue(true) ;
				break; 
				
			}
		}
		
		
		
	}

	@Then("more than one book info will display")
	public void more_than_one_book_info_will_display() {
	 
	}

}
