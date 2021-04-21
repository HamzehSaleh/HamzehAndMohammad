package firstPartTest;

import java.util.ArrayList;

import firstpart.AdminInfo;
import firstpart.AppClass;

public class LoginStepsData {
	public AppClass log;
	public ArrayList<AdminInfo> adminArray;
	public AdminInfo admin1;
	public AdminInfo admin2;
	public AdminInfo admin3;

	public LoginStepsData(ArrayList<AdminInfo> adminArray, AdminInfo admin1, AdminInfo admin2, AdminInfo admin3) {
		this.adminArray = adminArray;
		this.admin1 = admin1;
		this.admin2 = admin2;
		this.admin3 = admin3;
	}
}