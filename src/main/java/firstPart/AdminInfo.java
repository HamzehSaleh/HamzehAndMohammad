package firstPart;

public class AdminInfo {
	private String userName ;
	private String password ;
	
	public AdminInfo() {
		
	}
	
	public AdminInfo(String user , String pass) {
		this.userName = user ;
		this.password = pass ;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String user_name) {
		this.userName = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
