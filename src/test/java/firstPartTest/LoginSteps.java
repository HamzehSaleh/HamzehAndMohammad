package firstPartTest;



import static org.junit.Assert.assertTrue;

import java.util.Scanner;

import firstPart.AppClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	//public String s1  ;
	
	public AppClass log;
	public static String user , pass , s;

	AdminInfo admin = new AdminInfo();
	
	public LoginSteps(AppClass log2) {
		log = log2 ;
	}
	
	
	
	
	@Given("I have the username {string}")
	public void i_have_the_username(String username) {
	  
		//user=  log.inputUser(username);  
		
		user = username ;
		System.out.println("+++ " +user);
		admin.setUser_name(username);
	}

	
	
	
	@Given("I have the password {string}")
	public void i_have_the_password(String password) {
	  
		//pass= log.inputPass(password);
		pass = password ;
		System.out.println("+++ " +pass);
		admin.setPassword(password);
	}

	String []user_n = {"hamzeh","mohammad","haya"};
	String []pass_n = {"hhh","123","haya"};
	
	
	@When("I check if the user name and password are correct")
	public void i_check_if_the_user_name_and_password_are_correct() {
	 
		assertTrue(user.equalsIgnoreCase(admin.getUser_name()));
		assertTrue(pass.equalsIgnoreCase(admin.getPassword())) ;
	
	}
	
	@Then("I have logged in")
	public void i_have_logged_in() {
	log.checkout();
	
	}
	
	//////////////////////
	
	

@Given("I have the username but i have a wrong password")
public void i_have_the_username_but_i_have_a_wrong_password() {
   
	//System.out.print("please enter the pass: ");
	//Scanner scanner = new Scanner(System.in);
	//s = scanner.nextLine() ;
	
	// log.inputPass(s);
}

@When("I check if the password {string} is wrong")
public void i_check_if_the_password_is_wrong(String passa) {
	
 s="123";
 assertTrue(s.equalsIgnoreCase(passa)) ;

}

@Then("Not valid information")
public void not_valid_information() {
 System.out.println("not valid input");
}
	
}

