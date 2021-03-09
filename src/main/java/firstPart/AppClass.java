package firstPart;

import java.util.Scanner;

public class AppClass {

String user , pass ;
	
	public String inputUser(String s1 ) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("please enter your username: ");
	    s1 = scanner.nextLine() ;
	    user = s1 ;
	    return s1 ;
	    
	}
	
	public String inputPass(String s2) {
		Scanner scanner = new Scanner(System.in);
		 System.out.print("please enter your password: ");
		    s2 = scanner.nextLine();
		    pass = s2 ;
		    return s2 ;
	}
	
	public void checkout() {
		System.out.println("Logged in");
	}
	
	public void notvalid() {
		
		System.out.println("not valid password");
	}
	
	public boolean islogIn(boolean log ){
		 
		return log ;
	}
	
}
