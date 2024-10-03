package individualScripts;

import org.openqa.selenium.WebDriver;

import commonMethods.Keywords;
import commonMethods.Utils;

public class LOGIN extends Keywords{

	public void login(WebDriver driver,int iteration,String URL) {
	       //Iteration inputs
			String Username=Utils.getDataFromTestDataIteration(iteration, "SEDGE", "Username");
			String Password=Utils.getDataFromTestDataIteration(iteration, "SEDGE", "Password");
			//Iteration inputs
			//URL="facebook.com";
			navigateUrl(driver,URL);
			waitForElement(driver,SignIn_text);
			
			//setTestCaseID("TC_001");
			click(driver,username_input);
			//setTestCaseID("TC_002");
			sendKeys(driver,username_input,Username);
			
			//setTestCaseID("TC_003");
			click(driver,password_input);
			sendKeys(driver,password_input,Password);
				
			click(driver,SignIn_Btn);
			//setTestCaseID("TC_004");
			if(isDisplayed(driver,HomePage)) {
				pass(driver,"Application gets Login");
			}else {
				fail(driver,"Application not Login");
				 
			}
			
			verifyElementDisplayed(driver,Data_Analytics_page_link);
			
			
	}
}
