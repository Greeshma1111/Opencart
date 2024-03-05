package testCases;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.Loginpage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class Tc_002_logintest extends BaseClass
{
	@Test(groups= {"sanity","master"})
	public void logintest()
	{
		try {
		HomePage hp=new HomePage(driver);
		hp.clickmyaccount();
		hp.clicklogin();
		
		Loginpage lp=new Loginpage(driver);
		lp.setemail(rb.getString("email"));
		lp.setpassword(rb.getString("password"));
		lp.clicklogin();
		
		
		MyAccountPage mac= new MyAccountPage(driver);
		boolean status=mac.isMyAccountPageExists();
		
		Assert.assertEquals(status, true);
		}
		catch(Exception e) 
		{
			Assert.assertTrue(false);
		}
	}


}
