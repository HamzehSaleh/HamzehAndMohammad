package firstPartTest;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Scanner;

import firstPart.AppClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddBookSteps {
	ArrayList<bookClass> bookArray = new ArrayList<bookClass>(); 
	bookClass newBook = new bookClass();
	AppClass log = new AppClass() ;
	boolean flag = false ;
	
	public AddBookSteps( bookClass b1) {
		newBook = b1 ;
	}
	
	@Given("Admin logged in and have the information for the book")
	public void admin_logged_in_and_have_the_information_for_the_book() {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new io.cucumber.java.PendingException();
		flag = true ;
		assertTrue(log.islogIn(flag));
		
	}

	@When("he entered the title")
	public void he_entered_the_title() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		Scanner scanner = new Scanner(System.in);
		System.out.print("please enter the title: ");
		String s1 = scanner.nextLine() ;
		newBook.setTitle(s1);
	}

	@When("he entered the auther")
	public void he_entered_the_auther() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		Scanner scanner = new Scanner(System.in);
		System.out.print("please enter the ayther: ");
		String s1 = scanner.nextLine() ;
		newBook.setAuther(s1);
	}

	@When("he entered the sign")
	public void he_entered_the_sign() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		Scanner scanner = new Scanner(System.in);
		System.out.print("please enter the signuter: ");
		String s1 = scanner.nextLine() ;
		newBook.setSign(s1);
	}

	@When("he entered the isbn")
	public void he_entered_the_isbn() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		Scanner scanner = new Scanner(System.in);
		System.out.print("please enter the ISBN: ");
		String s1 = scanner.nextLine() ;
		newBook.setIsbn(s1);
	}

	@Then("the book is added")
	public void the_book_is_added() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();

		System.out.println(newBook.getTitle());
		System.out.println(newBook.getAuther());
		System.out.println(newBook.getSign());
		System.out.println(newBook.getIsbn());
		bookArray.add(newBook);
	
		System.out.println("the book added");
	}
}
