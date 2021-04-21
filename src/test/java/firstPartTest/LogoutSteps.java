package firstPartTest;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import firstpart.AdminInfo;
import firstpart.AppClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutSteps {
	private static final Logger logger = Logger.getLogger(LogoutSteps.class.getName());
  AdminInfo f = new AdminInfo();
  
	@Given("I navigate to the login page")
	public void i_navigate_to_the_login_page() {

	}

	@Given("admin wants to logout")
	public void admin_wants_to_logout() {
     
	}

	@When("The admin choose to log out")
	public void the_admin_choose_to_log_out() {

	}

	@Then("logout successfully done")
	public void logout_successfully_done() {
	logger.log(Level.INFO , "you logout successfully");
		
	}	
}
