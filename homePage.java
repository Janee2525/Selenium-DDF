import com.testdata.UImapReading;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class homePage {
	
	private WebDriver driver;
	  commonMethods cm = new commonMethods( driver);
	 UImapReading loc = new UImapReading("//C:/Selenium2/WorkSpace/SeleniumPractice/locator.properties");
	
	public homePage(WebDriver driver){
		this.driver = driver;
	}

	public void click_LogyourselfinLink() throws Exception{
		       driver.findElement(loc.getLocator("logyourselfin_link")).click();
		       System.out.println("Click YOURSELFLOGIN_LINK");
		
	}

}


