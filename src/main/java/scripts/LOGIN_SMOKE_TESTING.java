package scripts;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class LOGIN_SMOKE_TESTING extends Keywords{

	
	public void loginPage(WebDriver driver,int iteration,String URL) {
		
		//String URL =Url; //TestNgXml.getdatafromExecution().get("SmokeTesting_Iteration_"+iteration);
		String UserNameTextExp=Utils.getDataFromTestData("LoginPage", "UsernameText");
		String PasswordTextExp=Utils.getDataFromTestData("LoginPage", "PasswordText");
		String SignInTextExp=Utils.getDataFromTestData("LoginPage", "SignInText");
		String SignInError_1Exp=Utils.getDataFromTestData("LoginPage", "SignInError_1");
		String InvalidCredErrorExp=Utils.getDataFromTestData("LoginPage", "InvalidCredError");
		String DefaultPasswordTypeExp=Utils.getDataFromTestData("LoginPage", "Pass_Not_visible");
		String PasswordVisibleExp=Utils.getDataFromTestData("LoginPage", "Pass_visibile");
		String SignInBtnTextExp=Utils.getDataFromTestData("LoginPage", "SignInBtn_Text");
		String SignInBtnColorExp=Utils.getDataFromTestData("LoginPage", "SignInBtnColor");
		String SignInErrorColorExp=Utils.getDataFromTestData("LoginPage", "SignInErrorColor");
		String dataAnalytics_txt_Exp=Utils.getDataFromTestData("HomePage", "DataAnalytic_txt_Exp");
		String dataAnalytics_desc_Exp=Utils.getDataFromTestData("HomePage", "DataAnalytic_des_Exp");
		String testAnalytics_txt_Exp=Utils.getDataFromTestData("HomePage", "TextAnalytic_txt_Exp");
		String testAnalytics_des_Exp=Utils.getDataFromTestData("HomePage", "TextAnalytic_des_Exp");
		String timeSeries_txt_Exp=Utils.getDataFromTestData("HomePage", "TimeSeries_txt_Exp");
		String timeSeries_des_Exp=Utils.getDataFromTestData("HomePage", "TimeSeries_des_Exp");
		String OCR_txt_Exp=Utils.getDataFromTestData("HomePage", "OCR_txt_Exp");
		String OCR_des_Exp=Utils.getDataFromTestData("HomePage", "OCR_des_Exp");
		
		//Iteration inputs
		String Username=Utils.getDataFromTestDataIteration(iteration, "SEDGE", "Username");
		String Password=Utils.getDataFromTestDataIteration(iteration, "SEDGE", "Password");
		//Iteration inputs
		
		navigateUrl(driver,URL);
		
		
		waitForElement(driver,SignIn_text);
		String text1=getText1(driver,SignIn_text);
		
		//setTestCaseID("TC_001");
		// Need to Command for dry run Execution 1
		if(SignInTextExp.equals(text1)) {
			passReport(driver,SignInTextExp,text1);//testing
		}else {
			failReport(driver,SignInTextExp,text1);
		}
		
		//setTestCaseID("TC_002");
		verifyElementIsPresent(driver,username_input);
		
		//setTestCaseID("TC_003");
		verifyElementIsPresent(driver,username_text);
		verifyElementHasText(driver,username_text);
		String usernameTextAct=getText1(driver,username_text);
		textValidation(driver,UserNameTextExp,usernameTextAct,username_text);
		
		verifyElementIsPresent(driver,password_input);
		verifyElementIsPresent(driver,password_text);
		verifyElementHasText(driver,password_text);
		String passTextAct=getText1(driver,password_text);
		textValidation(driver,PasswordTextExp,passTextAct,password_text);
		
		verifyElementIsPresent(driver,forgot_username_link);
		verifyElementIsPresent(driver,forgot_password_link);
		verifyElementIsPresent(driver,signup_link);

		verifyElementIsPresent(driver,SignIn_Btn);
		String signInBtnTextAct=getText1(driver,SignIn_Btn);
		textValidation(driver,SignInBtnTextExp,signInBtnTextAct,SignIn_Btn);
		
		//setTestCaseID("TC_004");
		String SignInBtn_Act_Color=getTextBackgroundColor(driver,SignIn_Btn);
		colorValidation(driver,SignInBtnColorExp,SignInBtn_Act_Color,SignIn_Btn);
		
		click(driver,SignIn_Btn);
		//setTestCaseID("");
		if(isDisplayed(driver,HomePage)) {
			failReport(driver,"Application should not Login ","Application gets Login");
			
		}else {
			passReport(driver,"Application should not Login","Application not Login");//testing
		}
		
		verifyElementDisplayed(driver,username_required_error);
		String UserNameErrorAct=getText1(driver,username_required_error);
		textValidation(driver,SignInError_1Exp,UserNameErrorAct,username_required_error);
		
		String usernameTextColorAct=getTextColor(driver,username_text);
		colorValidation(driver,SignInErrorColorExp,usernameTextColorAct,username_text);
		String usernameErrorColorAct=getTextColor(driver,username_required_error);
		colorValidation(driver,SignInErrorColorExp,usernameErrorColorAct,username_required_error);
		
		verifyElementDisplayed(driver,Password_require_error);
		String PasswordErrorAct=getText1(driver,Password_require_error);
		textValidation(driver,SignInError_1Exp,PasswordErrorAct,Password_require_error);

		String passwordTextColorAct=getTextColor(driver,password_text);
		colorValidation(driver,SignInErrorColorExp,passwordTextColorAct,password_text);
		String passwordErrorColorAct=getTextColor(driver,Password_require_error);
		colorValidation(driver,SignInErrorColorExp,passwordErrorColorAct,Password_require_error);
		
		click(driver,username_input);
		sendKeys(driver,username_input,"gfjk");
		click(driver,SignIn_Btn);
		if(isDisplayed(driver,HomePage)) {
			failReport(driver,"Application should not Login ","Application gets Login");
			
		}else {
			passReport(driver,"Application should not Login","Application not Login");//testing
		}
		
		verifyElementDisplayed(driver,Password_require_error);
		PasswordErrorAct=getText1(driver,Password_require_error);
		textValidation(driver,SignInError_1Exp,PasswordErrorAct,Password_require_error);

		passwordTextColorAct=getTextColor(driver,password_text);
		colorValidation(driver,SignInErrorColorExp,passwordTextColorAct,password_text);
		passwordErrorColorAct=getTextColor(driver,Password_require_error);
		colorValidation(driver,SignInErrorColorExp,passwordErrorColorAct,Password_require_error);
	    
	    click(driver,password_input);
		sendKeys(driver,password_input,"453656");
		
		// neeed to modify...

		verifyElementDisplayed(driver,password_Hidden);
		String passHidd=getText1(driver,password_Hidden);
	
		if(DefaultPasswordTypeExp.equals(passHidd)) {
			passReport(driver,"By default, the password entered should be hidden","By default, the password entered is hidden");
		}else {
			failReport(driver,"By default, the password entered should be hidden","By default, the password entered is not hidden");
		}
		
	    click(driver,password_Hidden);
	    verifyElementIsPresent1(driver,password_visible);
	    String passvisible=getText(driver,password_visible);
		if(PasswordVisibleExp.equals(passvisible)) {
			passReport(driver,"Password entered Should be visible after clicking show button ","Password entered is visible after clicking show button ");
		}else {
			failReport(driver,"Password entered Should be visible after clicking show button ","Password entered is not visible after clicking show button ");
		}
		
		clear1(driver,username_input);	
		click(driver,username_input);
		click(driver,SignIn_Btn);
		
		if(isDisplayed(driver,HomePage)) {
			failReport(driver,"Application should not Login ","Application gets Login");
			
		}else {
			passReport(driver,"Application should not Login","Application not Login");//testing
		}
		
		verifyElementDisplayed(driver,username_required_error2);
		UserNameErrorAct=getText1(driver,username_required_error2);
		textValidation(driver,SignInError_1Exp,UserNameErrorAct,username_required_error2);
		
		usernameTextColorAct=getTextColor(driver,username_text);
		colorValidation(driver,SignInErrorColorExp,usernameTextColorAct,username_text);
		usernameErrorColorAct=getTextColor(driver,username_required_error2);
		colorValidation(driver,SignInErrorColorExp,usernameErrorColorAct,username_required_error2);
		
		sendKeys(driver,username_input,"gfjk");
		click(driver,SignIn_Btn);
		
		if(isDisplayed(driver,HomePage)) {
			failReport(driver,"Application should not Login ","Application gets Login");
			
		}else {
			passReport(driver,"Application should not Login","Application not Login");
		}
		
		
		verifyElementDisplayed(driver,invalid_credentials);
//		String invalidCredErrorActual=getText1(driver,invalid_credentials);
//		textValidation(driver,InvalidCredErrorExp,invalidCredErrorActual,invalid_credentials);
 
        doubleClick(driver,username_input);
		// Need to Command for dry run Execution 1
		sendKeys(driver,username_input,Username);
		
		doubleClick(driver,password_input);
		sendKeys(driver,password_input,Password);
			
		 click(driver,SignIn_Btn);
		 if(isDisplayed(driver,HomePage)) {
			 passReport(driver,"Application should Login","Application gets Login");
		 }else {
			 failReport(driver,"Application should Login ","Application not Login");
			 Assert.fail();
		 }
		
		// Need to Command for dry run Execution (2)
		verifyElementDisplayed(driver,Data_Analytics_page_link);
		if(verifyElementDisplayed(driver,Data_analytics_text)) {
			String dataAnalaytics_text_Act=getText1(driver,Data_analytics_text);
			textValidation(driver,dataAnalytics_txt_Exp,dataAnalaytics_text_Act,Data_analytics_text);
		}
		
		if(verifyElementDisplayed(driver,Data_analytics_desc)) {
			String dataAnalaytics_desc_Act=getText1(driver,Data_analytics_desc);
			textValidation(driver,dataAnalytics_desc_Exp,dataAnalaytics_desc_Act,Data_analytics_desc);
		}
		

		verifyElementDisplayed(driver,Help_Doc_dataAnalytics);
		verifyElementDisplayed(driver,Video_tutorial_dataAnalytics);
		verifyElementDisplayed(driver,dashboard_dataAnalytics);
		 
		verifyElementDisplayed(driver,Text_Analytics);
		if(verifyElementDisplayed(driver,Text_Analytics_text)) {
			String textAnalaytics_text_Act=getText1(driver,Text_Analytics_text);
			textValidation(driver,testAnalytics_txt_Exp,textAnalaytics_text_Act,Text_Analytics_text);
		}
		
		if(verifyElementDisplayed(driver,Text_Analytics_desc)) {
			String textAnalaytics_desc_Act=getText1(driver,Text_Analytics_desc);
			textValidation(driver,testAnalytics_des_Exp,textAnalaytics_desc_Act,Text_Analytics_desc);
		}
		
		
		verifyElementDisplayed(driver,Time_series);
		if(verifyElementDisplayed(driver,Time_series_text)) {
			String timeSeries_text_Act=getText1(driver,Time_series_text);
			textValidation(driver,timeSeries_txt_Exp,timeSeries_text_Act,Time_series_text);
		}
		
		if(verifyElementDisplayed(driver,Time_series_desc)) {
			String timeSeries_desc_Act=getText1(driver,Time_series_desc);
			textValidation(driver,timeSeries_des_Exp,timeSeries_desc_Act,Time_series_desc);
		}
		
		verifyElementDisplayed(driver,Help_doc_TimeSeries);		
		
		verifyElementDisplayed(driver,OCR);
		if(verifyElementDisplayed(driver,OCR_text)) {
			String OCR_text_Act=getText1(driver,OCR_text);
			textValidation(driver,OCR_txt_Exp,OCR_text_Act,OCR_text);
		}
		
		if(verifyElementDisplayed(driver,OCR_desc)) {
			String OCR_desc_Act=getText1(driver,OCR_desc);
			textValidation(driver,OCR_des_Exp,OCR_desc_Act,OCR_desc);
		}
		
		verifyElementDisplayed(driver,Help_doc_OCR);
	}
	
	
}
