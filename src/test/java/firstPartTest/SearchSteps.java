package firstPartTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {
	
	

@Given("Admin without logged in and have the title for the book")
public void admin_without_logged_in_and_have_the_title_for_the_book() {
   
    
}

@Then("the book info will display by title")
public void the_book_info_will_display_by_title() {
    
    
}

@Given("Admin without logged in and have the author for the book")
public void admin_without_logged_in_and_have_the_author_for_the_book() {
    
    
}

@When("he entered the author {string}")
public void he_entered_the_author(String string) {
    

}

@Then("the book info will display by author")
public void the_book_info_will_display_by_author() {
   
    
}

@Given("Admin without logged in and have the isbn for the book")
public void admin_without_logged_in_and_have_the_isbn_for_the_book() {
    
   
}

@Then("the book info will display by isbn")
public void the_book_info_will_display_by_isbn() {

    
}

@Given("Admin with logged in and have any info for the book")
public void admin_with_logged_in_and_have_any_info_for_the_book() {
   
}

@When("he entered the any info {string},{string},{string}")
public void he_entered_the_any_info(String string, String string2, String string3) {
   
}

@Then("the book info will display by any info")
public void the_book_info_will_display_by_any_info() {
    
}

@Given("Admin with logged in and have any info for the book and no match")
public void admin_with_logged_in_and_have_any_info_for_the_book_and_no_match() {
    
}

@When("he entered the any info to search and nothing to show {string},{string},{string}")
public void he_entered_the_any_info_to_search_and_nothing_to_show(String string, String string2, String string3) {
   
}

@Then("the book info will not display")
public void the_book_info_will_not_display() {
   
}

@Given("Admin with logged in and have any info for  more than one  book")
public void admin_with_logged_in_and_have_any_info_for_more_than_one_book() {
    
}

@When("he entered the any info to search for more than one book {string},{string},{string}")
public void he_entered_the_any_info_to_search_for_more_than_one_book(String string, String string2, String string3) {
   
}

@Then("more than one book info will display")
public void more_than_one_book_info_will_display() {
    
}

	
	

}
