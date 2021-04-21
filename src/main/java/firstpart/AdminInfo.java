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

	public String getPassword() {
		return password;
	}

	
	

}
