package firstPartTest;



import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.*;

import firstpart.AdminInfo;
import firstpart.AppClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	private static final Logger logger = Logger.getLogger(LoginSteps.class.getName());
	
	//public String s1  ; 
	public AppClass log;
	public static String user , pass ;
	public static int index ;
	
	ArrayList <AdminInfo> adminArray = new ArrayList <AdminInfo>() ; 

	AdminInfo admin1 = new AdminInfo("hamzeh" , "111");
	AdminInfo admin2 = new AdminInfo("Mohammad" , "222");
	AdminInfo admin3 = new AdminInfo("haya" , "333");
	
	public LoginSteps(AppClass log2) {
	log = log2 ;
	adminArray.add(admin1);
	adminArray.add(admin2);
	adminArray.add(admin3);
}


	
	@Given("I have the username {string}")
	public void i_have_the_username(String username) {
		
		user = username;
		
	}

	
	@Given("I have the password {string}")
	public void i_have_the_password(String password) {
	
	pass = password ;
	
	}

	
	@When("I check if the user name and password are correct")
	public void i_check_if_the_user_name_and_password_are_correct() {
	
		   for(int i=0 ; i<adminArray.size() ; i++) {
			   String temp = adminArray.get(i).getUserName();
			   if(temp.equalsIgnoreCase(user)) index = i ;
		   }
		   

	 
	}
	
	@Then("I have logged in")
	public void i_have_logged_in() {
	log.checkout();
	assertTrue(adminArray.get(index).getUserName().equalsIgnoreCase(user)) ;
    assertTrue(adminArray.get(index).getPassword().equalsIgnoreCase(pass)) ;
	
	}
	

	
	

@Given("I have the username but i have a wrong password")
public void i_have_the_username_but_i_have_a_wrong_password() {

}

@When("I check if the password {string} is wrong")
public void i_check_if_the_password_is_wrong(String passa) {
	
	boolean f = true ;
	
	   for(int i=0 ; i<adminArray.size() ; i++) {
	   String temp = adminArray.get(i).getPassword();
	   if(temp.equalsIgnoreCase(passa)) f = false ;
   }
   
   if (f) {
	   assertTrue(true) ;	  
	   }
 

}

@Then("Not valid information")
public void not_valid_information() {
	logger.log(Level.INFO , "not valid input (Wrong Password)");
}
	
}

