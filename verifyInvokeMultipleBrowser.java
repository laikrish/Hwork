package com.automation.test;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.baseTest.BaseTest;

import MultipleBrowser.InvokeMultipleBrowser;

public class verifyInvokeMultipleBrowser extends InvokeMultipleBrowser
{
	  WebDriver driver;
	
	  @Test
	  public void checkMultiBrowserCompatibility() throws Exception 
	  {

		  browsercall();
	  }
	  
	  @AfterTest
	  public void toClose()
	  {
		  driver.close();
	  }
}



