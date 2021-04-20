package firstpart;

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
	public void setUserName(String userN) {
		this.userName = userN;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
