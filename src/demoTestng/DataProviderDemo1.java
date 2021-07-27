package demoTestng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo1 {
	@DataProvider
	public String[][] data()
	{
		String val[][]=new String[3][2];
		val[0][0]="userA";
		val[0][1]="A";
		val[1][0]="userB";
		val[1][1]="B";
		val[2][0]="userC";
		val[2][1]="C";
		return val;
	}
	@Test(dataProvider="data")

		public void tc(String user,String pass) {
			System.out.println(user+" "+pass);
		}
	}
	
