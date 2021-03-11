package firstPartTest;

public class AdminInfo {
	String user_name ;
	String password ;
	
	public AdminInfo() {
		
	}
	
	public AdminInfo(String user , String pass) {
		this.user_name = user ;
		this.password = pass ;
	}
	
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
