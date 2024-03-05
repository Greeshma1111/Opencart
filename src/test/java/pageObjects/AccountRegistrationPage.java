package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
		}
//ELEMENTS
	@FindBy(name="firstname")WebElement txtFirstname;
	@FindBy(name="lastname")WebElement txtLastname;
	@FindBy(name="email")WebElement txtEmail;
	@FindBy(name="telephone")WebElement txtTelephone;
	@FindBy(name="password")WebElement txtPassword;
	@FindBy(name="confirm")WebElement txtConfirmPassword;
	@FindBy(name="agree")WebElement chkdPolicy;
	@FindBy(xpath="//input[@value='Continue']") WebElement btnContinue;
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")WebElement msgConfirmation;
	
	
	public void setFirstName(String fname) 
	{
		txtFirstname.sendKeys(fname);
	}
	
	public void setLastName(String lname) 
	{
		txtLastname.sendKeys(lname);
	}
	
	public void setEmail(String email) 
	{
		txtEmail.sendKeys(email);
	}
	
	public void setTelephone(String tel) 
	{
		txtTelephone.sendKeys(tel);
	}
	
	public void setPassword(String psw) 
	{
		txtPassword.sendKeys(psw);
	}
	
	public void setConfirmPassword(String conpsw) 
	{
		txtConfirmPassword.sendKeys(conpsw);
	}
	
	public void setPrivatepolicy() 
	{
		chkdPolicy.click();
	}
	
     public void clickcontinue()
     {
    	
    	//sol1
 		btnContinue.click();
 		
 		/*//sol2
 		btnContinue.submit();
 		
 		//sol3
 		Actions act=new Actions(driver);
 		act.moveToElement(btnContinue).click().perform();
 		
 		//sol4
 		JavascriptExecutor js=(JavascriptExecutor)driver;
 		js.executeScript("argument[0].click();",btnContinue );
 		
 		//sol5
 		btnContinue.sendKeys(Keys.RETURN);
 		
 		//sol6
 		
 		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
 		mywait.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();*/
 		
 	}
 	
 	public String getconfirmationmsg()
 	{
 		try {
 		return(msgConfirmation.getText());
 		}
 		catch(Exception e)
 		{
 			return(e.getMessage());
 		}
 	}
 	
 	
 	
      







}





