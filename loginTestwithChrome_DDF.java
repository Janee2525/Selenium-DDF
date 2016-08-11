import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.testdata.Constant;
import com.testdata.excelReading;

public class loginTestwithChrome_DDF {
	
	private WebDriver driver;

    commonMethods common ;
    excelReading data = new excelReading();
    homePage home ;
    loginPage login;
    
    @BeforeMethod
    public void setUp() throws Exception{
    	 data.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
    	     common = new commonMethods(driver);
    	  
    	      driver= common.openBrowser("chrome");   
    	      common.goToUrl(Constant.URL);
    }
    @AfterMethod
    public void tearDown(){
    	   common.closeBrowser();
    }
    @Test
    public void loginwithValidAccount() throws Exception{
    	
    	System.out.println("Test Case_01_LoginwithValidAccount-DDF ");
  
    	home=new homePage(driver);
    	login= new loginPage(driver);
    	home.click_LogyourselfinLink();
    	common.verifyText("Welcome, Please Sign In");
    	login.user_Signin(excelReading.getCellData(1, 1), excelReading.getCellData(1, 2));
    	login.click_Signin();
    	common.verifyText("Welcome to iBusiness");
    	
    }
/*  @Test
    public void loginWithInvalidAccount(){
    	System.out.println("Test Case_01");
    	home=new homePage(driver);
    	login= new loginPage(driver);
    	home.clickLogyourselfinLink();
    	common.verifyText("Welcome, Please Sign In");
    //	login.userLogin("jackma@test.com", "test123");
    	login.clickSignin();
    	common.verifyText(" Error: No match for E-Mail Address and/or Password.");
    }*/
    
}
