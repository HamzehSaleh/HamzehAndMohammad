package firstpart;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppClass {

	 String pass ;
	
private static final Logger logger = Logger.getLogger(AppClass.class.getName());
	
	public String inputUser(String str ) {
	
	Scanner scanner = new Scanner(System.in);
		logger.log(Level.INFO , "please enter your username: ");
   str = scanner.nextLine() ;
    return str ;
	    
	}
	
	public String inputPass(String strString) {
	Scanner scanner = new Scanner(System.in);
		logger.log(Level.INFO  , "please enter your password: ");
	    strString = scanner.nextLine();
	    pass = strString;
		    return strString ;
	}
	
	public void checkout() {
		logger.log(Level.INFO ,"Logged in (Valid Admin)" );
	}
	
	public void add() {
		logger.log(Level.INFO ,"Logged in (Valid Admin) you can add books now ");
	}
	
	
	public void notvalid(){
		logger.log(Level.INFO ,"not valid password");
		}
	
	public boolean islogIn(boolean log ){
		return log ;
	}
	
}
