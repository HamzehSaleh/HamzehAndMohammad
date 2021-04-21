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
	
	public static String user , pass ;
	public static int index ;
	
	public LoginStepsData AdminData = new LoginStepsData(new ArrayList <AdminInfo>(), new AdminInfo("hamzeh" , "111"),
			new AdminInfo("Mohammad" , "222"), new AdminInfo("haya" , "333"));

	public LoginSteps(AppClass log2) {
	AdminData.log = log2 ;
	AdminData.adminArray.add(AdminData.admin1);
	AdminData.adminArray.add(AdminData.admin2);
	AdminData.adminArray.add(AdminData.admin3);
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
	
		   for(int i=0 ; i<AdminData.adminArray.size() ; i++) {
			   String temp = AdminData.adminArray.get(i).getUserName();
			   if(temp.equalsIgnoreCase(user)) index = i ;
		   }
		   

	 
	}
	
	@Then("I have logged in")
	public void i_have_logged_in() {
	AdminData.log.checkout();
	assertTrue(AdminData.adminArray.get(index).getUserName().equalsIgnoreCase(user)) ;
    assertTrue(AdminData.adminArray.get(index).getPassword().equalsIgnoreCase(pass)) ;
	
	}
	

	
	

@Given("I have the username but i have a wrong password")
public void i_have_the_username_but_i_have_a_wrong_password() {

}

@When("I check if the password {string} is wrong")
public void i_check_if_the_password_is_wrong(String passa) {
	
	boolean f = true ;
	
	   for(int i=0 ; i<AdminData.adminArray.size() ; i++) {
	   String temp = AdminData.adminArray.get(i).getPassword();
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

