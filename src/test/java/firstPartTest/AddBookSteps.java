package firstPartTest;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Scanner;

import firstPart.AppClass;
import firstPart.bookClass ;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddBookSteps {
	
	ArrayList<bookClass> bookArray = new ArrayList<bookClass>(); 
	bookClass newBook = new bookClass();
	AppClass log = new AppClass() ;
	boolean flag = false ;

	
	@Given("Admin logged in and have the information for the book")
	public void admin_logged_in_and_have_the_information_for_the_book() {
	 
		flag = true ;
		assertTrue(log.islogIn(flag));
		
	}

	@When("he entered the title {string}" )
	public void he_entered_the_title(String title) {
	  	
		newBook.setTitle(title);
	}

	@When("he entered the auther {string}")
	public void he_entered_the_auther(String author) {
	
		newBook.setAuther(author);
	}

	@When("he entered the sign {string}")
	public void he_entered_the_sign(String sign) {
	
		newBook.setSign(sign);
	}

	@When("he entered the isbn {string}")
	public void he_entered_the_isbn(String isbn) {	  
		newBook.setIsbn(isbn);
	}

	@Then("the book is added")
	public void the_book_is_added() {
	  
		newBook.toString();
		bookArray.add(newBook);
	
		System.out.println("the book added");
	}
	
	@Given("the admin is not logged in")
    public void the_admin_is_not_logged_in() {


    }

    @When("the admin try to add book")
    public void the_admin_try_to_add_book() {
   
    	

    }

    @Then("book does not added")
    public void book_does_not_added() {
        // Write code here that turns the phrase above into concrete actions
       System.out.println("you can't add Books when you are not logged in ");
	
}
}
