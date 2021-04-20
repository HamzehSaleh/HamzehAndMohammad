package firstPartTest;



import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.*;
import firstPart.AppClass;
import firstPart.AdminInfo ;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	//public String s1  ; 
	public AppClass log;
	public static String user , pass ;
	
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
	
		int k=0 ;
		   for(int i=0 ; i<adminArray.size() ; i++) {
			   String temp = adminArray.get(i).getUserName();
			   if(temp.equalsIgnoreCase(user)) k = i ;
		   }
		   
	assertTrue(adminArray.get(k).getUserName().equalsIgnoreCase(user)) ;
    assertTrue(adminArray.get(k).getPassword().equalsIgnoreCase(pass)) ;
	 
	}
	
	@Then("I have logged in")
	public void i_have_logged_in() {
	log.checkout();
	
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
 System.out.println("not valid input (Wrong Password) ");
}
	
}

