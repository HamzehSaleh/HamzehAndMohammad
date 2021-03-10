package firstPartTest;

import java.util.ArrayList;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class SearchSteps {
	
	

ArrayList<bookClass> bookArray = new ArrayList<bookClass>(); 

//bookClass Book1  = new bookClass("Data","Mohammad","10","12345");
//bookClass Book2 = new bookClass("Algo","Hamzeh","11","12346");
//bookClass Book3 = new bookClass("C++","Haya ","12","12347");
   

   String []title_array = {"Data","Algo","C++"};
   String []author = {"Mohammad","Hamzeh","Haya"};
   String []sign = {"10","12","13"};
   String []isbn = {"12345","12346","12347"};
  


	
	@Given("Admin without logged in and have the title for the book")
	public void admin_without_logged_in_and_have_the_title_for_the_book() {
	    
		System.out.println(" Test  in 1 ");
	}

	@When("he entered the title as {string}")
	public void he_entered_the_title_as(String title ) {
	   
		System.out.println(" Test in 2   ");
		
		
		int k=0 ;
		for (int i=0; i<3 ;i++) {
			if (title_array[i].equals(title))
				k=i ;
			
		}
		System.out.println(" Test   ... " +title_array[k]+" "+ author[k]+"  "+sign[k]+"  "+isbn[k]+"  ");
		
	}

	@Then("the book info will display by title")
	public void the_book_info_will_display_by_title() {
		System.out.println(" Test in 3  ");
	}

	
	
	
	
	
	
	
	
	
	
	@Given("Admin without logged in and have the author for the book")
	public void admin_without_logged_in_and_have_the_author_for_the_book() {
	
	}

	@When("he entered the author as {string}")
	public void he_entered_the_author_as(String string) {
	    
	}

	@Then("the book info will display by author")
	public void the_book_info_will_display_by_author() {
	  
	}
	
	
	
	
	
	
	
	
	

	@Given("Admin without logged in and have the isbn for the book")
	public void admin_without_logged_in_and_have_the_isbn_for_the_book() {
	   
	}

	@When("he entered the isbn as {string}")
	public void he_entered_the_isbn_as(String string) {
	 
	}

	@Then("the book info will display by isbn")
	public void the_book_info_will_display_by_isbn() {
	  
	}
	
	
	
	
	
	
	
	

	@Given("Admin with logged in and have any info for the book")
	public void admin_with_logged_in_and_have_any_info_for_the_book() {
	  
	}

	@When("he entered the any info {string}")
	public void he_entered_the_any_info(String string) {
	  
	}

	@Then("the book info will display by any info")
	public void the_book_info_will_display_by_any_info() {
	  
	}
	
	
	
	
	
	
	
	

	@Given("Admin with logged in and have any info for the book and no match")
	public void admin_with_logged_in_and_have_any_info_for_the_book_and_no_match() {
	   
	}

	@When("he entered the any info to search and nothing to show {string}")
	public void he_entered_the_any_info_to_search_and_nothing_to_show(String string) {
	  
	}

	@Then("the book info will not display")
	public void the_book_info_will_not_display() {
	  
	}

	
	
	
	
	
	
	
	
	@Given("Admin with logged in and have any info for  more than one  book")
	public void admin_with_logged_in_and_have_any_info_for_more_than_one_book() {
	  
	}

	@When("he entered the any info to search for more than one book {string}")
	public void he_entered_the_any_info_to_search_for_more_than_one_book(String string) {
	  
	}

	@Then("more than one book info will display")
	public void more_than_one_book_info_will_display() {
	   
	}

	
	
	
	

}
