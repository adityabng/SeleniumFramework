package dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo2 {
	
	
	@DataProvider
	public Object[][] getNames(){
		Object[][] obj = new Object[3][1];
		
		obj[0][0] = "abc";
		obj[1][0] = "pqr";
		obj[2][0] = "xyz";
		
		return obj;
	}

	
	@Test(dataProvider = "getNames")
	public void getEmployees(String username){
		System.out.println("printing username :"+username);
	}

}
