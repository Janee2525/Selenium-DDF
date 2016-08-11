import com.testdata.UImapReading;


import org.openqa.selenium.WebDriver;



public class loginPage {

private  WebDriver driver;
UImapReading loc = new UImapReading("//C:/Selenium2/WorkSpace/SeleniumPractice/locator.properties");

public loginPage(WebDriver driver){
	this.driver = driver;
}

	public void user_Signin(String userName, String pass) throws Exception{
		        driver.findElement(loc.getLocator("username_txt")).sendKeys(userName);
		       System.out.println("enter EMAIL_ADDRESS");
	            driver.findElement(loc.getLocator("password_txt")).sendKeys(pass);
		        System.out.println("enter PASSWORD");

	}
	public void click_Signin() throws Exception{
		       driver.findElement(loc.getLocator("signin_bttn")).click();
		      System.out.println("Click SIGININ_BUTTON");

	}

}
