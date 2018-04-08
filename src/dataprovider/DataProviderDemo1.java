package dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo1 {
	
	
	@DataProvider
	public Object[][] getNames(){
		String a = "Aditya";
		String b = "Deepak";
		String a1 = "123";
		String b1 = "789";
		return new Object[][]{{a,a1},{b,b1}};
	}

	
	@Test(dataProvider = "getNames")
	public void getEmployees(String username, String password){
		System.out.println("printing username :"+username+" printing password "+password);
	}
}
