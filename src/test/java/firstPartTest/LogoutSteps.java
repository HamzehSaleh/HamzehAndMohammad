package firstPartTest;

import java.util.Scanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutSteps {

	@Given("I navigate to the login page")
	public void i_navigate_to_the_login_page() {
		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
	}

	@Given("admin wants to logout")
	public void admin_wants_to_logout() {
		// Write code here that turns the phrase above into concrete actions
	//	throw new io.cucumber.java.PendingException();
	}

	@When("The admin choose to log out")
	public void the_admin_choose_to_log_out() {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		String s ;
		Scanner scanner = new Scanner(System.in);
		System.out.print("are you sure thant you want to logout?(yes,no)");
		s = scanner.nextLine() ;
		
	}

	@Then("logout successfully done")
	public void logout_successfully_done() {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		System.out.println("you logout successfully");
	}	
}
