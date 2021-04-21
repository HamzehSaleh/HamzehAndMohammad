package firstpart;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppClass {

	 String pass ;
	
private static final Logger logger = Logger.getLogger(AppClass.class.getName());
	
	
	public void checkout() {
		logger.log(Level.INFO ,"Logged in (Valid Admin)" );
	}
	
	public void add() {
		logger.log(Level.INFO ,"Logged in (Valid Admin) you can add books now ");
	}
	
	
	public boolean islogIn(boolean log ){
		return log ;
	}
	
}
