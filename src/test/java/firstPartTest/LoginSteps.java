package firstPartTest;



import static org.junit.Assert.assertTrue;

import java.util.Scanner;

import firstPart.AppClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	public AppClass log;
	public static String user , pass , s;
	
	public LoginSteps(AppClass log2) {
		log = log2 ;
	}
	
	@Given("I have the username {string}")
	public void i_have_the_username(String username) {
	  
		log.inputUser(username);
		user = username ;
	}

	@Given("I have the password {string}")
	public void i_have_the_password(String password) {
	  
		log.inputPass(password);
		pass = password ;
	}

	@When("I check if the user name and password are correct")
	public void i_check_if_the_user_name_and_password_are_correct() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		assertTrue(user.equalsIgnoreCase("hamzeh"));
		assertTrue(pass.equalsIgnoreCase("hhh")) ;
	}
	
	@Then("I have logged in")
	public void i_have_logged_in() {
	log.checkout();
	}
	
	//////////////////////
	
	

@Given("I have the username but i have a wrong password")
public void i_have_the_username_but_i_have_a_wrong_password() {
   
	System.out.print("please enter the pass: ");
	Scanner scanner = new Scanner(System.in);
	s = scanner.nextLine() ;
	
	// log.inputPass(s);
}

@When("I check if the password {string} is wrong")
public void i_check_if_the_password_is_wrong(String passa) {

 assertTrue(s.equalsIgnoreCase(passa)) ;

}

@Then("Not valid information")
public void not_valid_information() {
 System.out.println("not valid input");
}
	
}

