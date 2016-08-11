package com.common;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenshot {
	
	/*private WebDriver driver;
	
	public TakeScreenshot(WebDriver driver){
		          this.driver= driver;
	}*/
	    
	public void take_Screenshot(WebDriver driver) throws IOException{
		        File  srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		        FileUtils.copyFile(srcfile, new File("C:\\Selenium2\\WorkSpace\\SeleniumDDF\\image.png"));
		        System.out.println("[taking a shot]");
	}

}
