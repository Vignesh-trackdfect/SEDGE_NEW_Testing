package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import atu.testng.reports.logging.LogAs;
import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class LoginPageTest extends Keywords {

	
	public void loginPage(WebDriver driver,String URL ) {
		//String URL = TestNgXml.getdatafromExecution().get("LoginPageTest");
		
		String Username = Utils.getDataFromTestData("SEDGE", "Username");
		String Password = Utils.getDataFromTestData("SEDGE", "Password");

		String FileName=Utils.getDataFromTestData("LoginPage", "FileName");
		String filepath=System.getProperty("user.dir") + "\\testdata\\"+FileName+".csv";
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
		String CreateProjectBtn_Text_Exp=Utils.getDataFromTestData("DataAnalytics", "CreateProjectBtn_Txt_Exp");
		String CreateProjectBtn_Color_Exp=Utils.getDataFromTestData("DataAnalytics", "CreateProjectBtn_color_Exp");
		String CreateProject_Msg_Exp=Utils.getDataFromTestData("DataAnalytics", "Createroject_Msg_Exp");
		String Default_FileType_Exp=Utils.getDataFromTestData("DataAnalytics", "DefaultFileType_Exp");
		String Default_delimeter_Exp=Utils.getDataFromTestData("DataAnalytics", "DefaultDelimeter_Exp");
		String AddFileBtn_text_Exp=Utils.getDataFromTestData("DataAnalytics", "AddFile_Text_Exp");
		String AddFileBtn_color_Exp=Utils.getDataFromTestData("DataAnalytics", "AddFileBtn_Color");
		String CenterWidget_X_Exp=Utils.getDataFromTestData("DataAnalytics", "CenterWidget_X");
		String CenterWidget_Y_Exp=Utils.getDataFromTestData("DataAnalytics", "CenterWidget_Y");
		String RightWidget_X_Exp=Utils.getDataFromTestData("DataAnalytics", "RightWidget_X");
		String RightWidget_Y_Exp=Utils.getDataFromTestData("DataAnalytics", "RightWidget_Y");

		

//		WebDriverWait wait=new WebDriverWait(driver,100);
		navigateUrl(driver, URL);
		waitForElement(driver,SignIn_text);
		String text1=getText1(driver,SignIn_text);
		if(SignInTextExp.equals(text1)) {
			passReport(driver,SignInTextExp,text1);
		}else {
			failReport(driver,SignInTextExp,text1);
		}
		
		
		verifyElementIsPresent(driver,username_input);
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
		
		String SignInBtn_Act_Color=getTextBackgroundColor(driver,SignIn_Btn);
		colorValidation(driver,SignInBtnColorExp,SignInBtn_Act_Color,SignIn_Btn);
		
		click(driver,SignIn_Btn);
		
		if(isDisplayed(driver,HomePage)) {
			failReport(driver,"Application should not Login ","Application gets Login");
			Assert.fail();
		}else {
			passReport(driver,"Application should not Login","Application not Login");
		}
		
		verifyElementIsPresent1(driver,username_required_error);
		String UserNameErrorAct=getText1(driver,username_required_error);
		textValidation(driver,SignInError_1Exp,UserNameErrorAct,username_required_error);
		
		String usernameTextColorAct=getTextColor(driver,username_text);
		colorValidation(driver,SignInErrorColorExp,usernameTextColorAct,username_text);
		String usernameErrorColorAct=getTextColor(driver,username_required_error);
		colorValidation(driver,SignInErrorColorExp,usernameErrorColorAct,username_required_error);
		
		verifyElementIsPresent1(driver,Password_require_error);
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
			Assert.fail();
		}else {
			passReport(driver,"Application should not Login","Application not Login");
		}
		
		verifyElementIsPresent1(driver,Password_require_error);
		PasswordErrorAct=getText1(driver,Password_require_error);
		textValidation(driver,SignInError_1Exp,PasswordErrorAct,Password_require_error);

		passwordTextColorAct=getTextColor(driver,password_text);
		colorValidation(driver,SignInErrorColorExp,passwordTextColorAct,password_text);
		passwordErrorColorAct=getTextColor(driver,Password_require_error);
		colorValidation(driver,SignInErrorColorExp,passwordErrorColorAct,Password_require_error);
	    
	    click(driver,password_input);
		sendKeys(driver,password_input,"453656");
		
		// neeed to modify...

		verifyElementIsPresent1(driver,password_Hidden);
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
			Assert.fail();
		}else {
			passReport(driver,"Application should not Login","Application not Login");
		}
		
		verifyElementIsPresent(driver,username_required_error2);
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
			Assert.fail();
		}else {
			passReport(driver,"Application should not Login","Application not Login");
		}
		
		
		verifyElementIsPresent(driver,invalid_credentials);
		String invalidCredErrorActual=getText1(driver,invalid_credentials);
		textValidation(driver,InvalidCredErrorExp,invalidCredErrorActual,invalid_credentials);
 
        doubleClick(driver,username_input);
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
		
		verifyElementIsPresent1(driver,Data_Analytics_page_link);
		if(verifyElementIsPresent1(driver,Data_analytics_text)) {
			String dataAnalaytics_text_Act=getText1(driver,Data_analytics_text);
			textValidation(driver,dataAnalytics_txt_Exp,dataAnalaytics_text_Act,Data_analytics_text);
		}
		
		if(verifyElementIsPresent1(driver,Data_analytics_desc)) {
			String dataAnalaytics_desc_Act=getText1(driver,Data_analytics_desc);
			textValidation(driver,dataAnalytics_desc_Exp,dataAnalaytics_desc_Act,Data_analytics_desc);
		}
		

		verifyElementIsPresent1(driver,Help_Doc_dataAnalytics);
		verifyElementIsPresent1(driver,Video_tutorial_dataAnalytics);
		verifyElementIsPresent1(driver,dashboard_dataAnalytics);
//		 System.out.println(getText(driver,Data_analytics_text));
		 
		verifyElementIsPresent1(driver,Text_Analytics);
		if(verifyElementIsPresent1(driver,Text_Analytics_text)) {
			String textAnalaytics_text_Act=getText1(driver,Text_Analytics_text);
			textValidation(driver,testAnalytics_txt_Exp,textAnalaytics_text_Act,Text_Analytics_text);
		}
		
		if(verifyElementIsPresent1(driver,Text_Analytics_desc)) {
			String textAnalaytics_desc_Act=getText1(driver,Text_Analytics_desc);
			textValidation(driver,testAnalytics_des_Exp,textAnalaytics_desc_Act,Text_Analytics_desc);
		}
		
		
//		System.out.println(getText(driver,Text_Analytics_text));
		
		verifyElementIsPresent1(driver,Time_series);
		if(verifyElementIsPresent1(driver,Time_series_text)) {
			String timeSeries_text_Act=getText1(driver,Time_series_text);
			textValidation(driver,timeSeries_txt_Exp,timeSeries_text_Act,Time_series_text);
		}
		
		if(verifyElementIsPresent1(driver,Time_series_desc)) {
			String timeSeries_desc_Act=getText1(driver,Time_series_desc);
			textValidation(driver,timeSeries_des_Exp,timeSeries_desc_Act,Time_series_desc);
		}
		
		verifyElementIsPresent1(driver,Help_doc_TimeSeries);
//		System.out.println(getText(driver,Time_series_text));
		
		
		verifyElementIsPresent1(driver,OCR);
		if(verifyElementIsPresent1(driver,OCR_text)) {
			String OCR_text_Act=getText1(driver,OCR_text);
			textValidation(driver,OCR_txt_Exp,OCR_text_Act,OCR_text);
		}
		
		if(verifyElementIsPresent1(driver,OCR_desc)) {
			String OCR_desc_Act=getText1(driver,OCR_desc);
			textValidation(driver,OCR_des_Exp,OCR_desc_Act,OCR_desc);
		}
		
		verifyElementIsPresent1(driver,Help_doc_OCR);
//		System.out.println(getText(driver,OCR_text));


		click(driver,Data_Analytics_page_link);
		if(verifyElementIsPresent1(driver,Create_project)){
			passReport(driver,"Data analytics accessible & projects page Should Open ","Data analytics accessible & projects page Opened");
		 }else {
			 failReport(driver,"Data analytics accessible & projects page Should Open","Data analytics not accessible & projects page not Open");
			 Assert.fail();
		 }
        elementnotvisible(driver,Loading);
		String createProjectBtn_Txt_Act=getText1(driver,Create_project);
		textValidation(driver,CreateProjectBtn_Text_Exp,createProjectBtn_Txt_Act,Create_project);

		String createProjectBtn_Color_Act=getTextBackgroundColor(driver,Create_project);
		colorValidation(driver,CreateProjectBtn_Color_Exp,createProjectBtn_Color_Act,Create_project);
		
		
		mouseOverToElement(driver,Create_project);
		if(verifyElementIsPresent1(driver,Create_project_text)) {
			String createProject_Msg_Act=getText1(driver,Create_project_text);
			textValidation(driver,CreateProject_Msg_Exp,createProject_Msg_Act,Create_project_text);
		}		
		
		click(driver,Create_project);
		if(verifyElementIsPresent1(driver,file_upload_page)){
			passReport(driver,"Create Project Button accessible & File Upload page Should Open ","Create Project Button accessible & File Upload page Opened");
		 }else {
			 failReport(driver,"Create Project Button accessible & File Upload page Should Open","Create Project Button accessible & File Upload page not Opened");
//			 Assert.fail();
		 }
		
		verifyElementIsPresent1(driver,upload_your_file);
		verifyElementIsPresent1(driver,DB_connection);

		if(verifyElementIsPresent1(driver,filetype_value)) {
			String defaultFileType_Act=getText1(driver,filetype_value);
			textValidation(driver,Default_FileType_Exp,defaultFileType_Act,filetype_value);
		}
		

		if(verifyElementIsPresent1(driver,default_delimeter)) {
			String defaultDelemiter_Act=getText1(driver,default_delimeter);
			textValidation(driver,Default_delimeter_Exp,defaultDelemiter_Act,default_delimeter);
		}
			
		verifyElementIsPresent(driver,AddFiles);
		String AddFileBtn_Text_Act=getText1(driver,AddFiles);
		textValidation(driver,AddFileBtn_text_Exp,AddFileBtn_Text_Act,AddFiles);
 
		String AddFileBtn_Color_Act=getTextBackgroundColor(driver,AddFiles);
		colorValidation(driver,AddFileBtn_color_Exp,AddFileBtn_Color_Act,AddFiles);
		
		
		uploadfile(driver,filepath);

		String AddedFileName=getText(driver,FileName_text);
		if(AddedFileName.contains(FileName)) {
			passReport(driver,"Correct File Should Add, Expect Name : "+FileName ,"Correct File is Added, Actual name : "+AddedFileName);
		}else {
			failReport(driver,"Correct File Should Add, Expect Name : "+FileName,"Different File is Added, Actual name : "+AddedFileName);
		}
		
		verifyElementIsPresent(driver,Upload_Btn);
		click(driver,Upload_Btn);
		verifyElementIsPresent1(driver,upload_wait);
		elementnotvisible(driver,upload_wait);

		
		verifyElementIsPresent(driver,fileUploaded_1);
		verifyElementIsPresent(driver,fileUploaded_2);
		verifyElementIsPresent(driver,fileUploaded_3);

		elementnotvisible(driver,fileUploaded_2);
		
		verifyElementIsPresent(driver,Preview_text);
		verifyElementIsPresent(driver,DataSetTable);

        click(driver,Statistics_icon);
        wait(driver,"1");
        if(isDisplayed1(driver,targetNotSelectError)) {
       	    mouseOverToElement(driver,targetNotSelectError);
			passReport(driver,"Statistics should not accessible without selecting target" ,"Statistics not accessible without selecting target");
        	click(driver,closeTargeterror);
        }else {
			failReport(driver,"Statistics should not accessible without selecting target","Statistics is accessible without selecting target");
        }        
		
         wait(driver,"1");
    	 mouseOverToElement(driver,Visual_icon);
    	 if(!isDisplayed2(driver,accessible)) {
   			passReport(driver,"Visual Analytics should not accessible without selecting target" ,"Visual Analytics not accessible without selecting target");
    	 }else {        	            
   			failReport(driver,"Visual Analytics should not accessible without selecting target","Visual Analytics is accessible without selecting target");
    	 } 
    	 wait(driver,"2");
    	 mouseOverToElement(driver,predictive_analytics);
    	 if(!isDisplayed2(driver,accessible)) {
			passReport(driver,"Predictive Analytics should not accessible without selecting target" ,"Predictive Analytics not accessible without selecting target");
   		}else {  
  			failReport(driver,"Predictive Analytics should not accessible without selecting target","Predictive Analytics is accessible without selecting target");
   	   	}
        
        mouseOverToElement(driver,Preview);
		verifyElementIsPresent1(driver,Preview_option);
		verifyElementIsPresent1(driver,GDPR_option);
		click(driver,GDPR_option);
		if(isDisplayed1(driver,targetNotSelectError)) {
  			passReport(driver,"Validation should show when click GDPR without selection target" ,"Validation shows when click GDPR without selection target");
        	click3(driver,closeTargeterror);
        }else {
  			failReport(driver,"Validation should show when click GDPR without selection target","Validation not shows when click GDPR without selection target");
        }
		 
	    mouseOverToElement(driver,Preview);
	    wait(driver,"1");
		verifyElementIsPresent(driver,Sampling_option);

        click(driver,Sampling_option);
        elementnotvisible(driver,Loading);
        if(isDisplayed1(driver,ProfilingPage)) {
  			passReport(driver,"Sampling is clickable & Profile page Should Open" ,"Sampling is clickable & Profile page is Opened");
        }else {
  			failReport(driver,"Sampling is clickable & Profile page Should Open","Sampling is not clickable & Profile page is not Open");
        }

        verifyElementIsPresent(driver,target);
		verifyElementIsPresent(driver,sampling);
		verifyElementIsPresent(driver,dataProtection);
		verifyElementIsPresent(driver,machineLearnig);

		mouseOverToElement(driver,Statistics_icon);
		click(driver,statisctics);
		if(isDisplayed1(driver,targetNotSelectError)) {
			passReport(driver,"Validation should show when click Statistics without selection target" ,"Validation shows when click Statistics without selection target");
			click3(driver,closeTargeterror);
        }else {
  			failReport(driver,"Validation should show when click Statistics without selection target","Validation not shows when click Statistics without selection target");
        }
			 
		mouseOverToElement(driver,Statistics_icon);
		click(driver,statisticalTest);
		if(isDisplayed1(driver,targetNotSelectError)) {
			passReport(driver,"Validation should show when click Statistical Test without selection target" ,"Validation shows when click Statistical Test without selection target");
			click3(driver,closeTargeterror);
        }else {
  			failReport(driver,"Validation should show when click Statistical Test without selection target","Validation not shows when click Statistical Test without selection target");
        }
		mouseOverToElement(driver,targetDrop);
		click(driver,targetDrop);
		if(isDisplayed1(driver,dropdown_expand)) {
			passReport(driver,"Target dropdown Should expand with available columns" ,"Target dropdown is expanded with available columns");
		}else {
  			failReport(driver,"Target dropdown Should expand with available columns","Target dropdown not expanded with available columns");
  			Assert.fail();
        }
		
		ScrollBarValidation1(driver,dropdown_expand,"Target_Drop");
	        
		if(isDisplayed(driver,Date_Option_dropdown)) {
			click(driver,Date_Option_dropdown);
        	if(isDisplayed(driver,Date_target_error)) {
    			passReport(driver,"Validation Should show, 'Date column cannot be selected as target'" ,"Validation shows, 'Date column cannot be selected as target'");
	        	click(driver,Date_target_error);
        	}else {
      			failReport(driver,"Validation Should show, 'Date column cannot be selected as target'","Validation not shows, 'Date column cannot be selected as target'");
        	}
        }else {
    		fail(driver,"Date column not present in the List ");
        }

		click3(driver,targetDrop); 
		if(isDisplayed(driver,categorical)) {
				 
			List<WebElement> elements = driver.findElements(By.xpath("//span[@class='mat-option-text']//img[contains(@src,'Categorical')]//following::span[1]"));
				    boolean loop=true;
		            boolean loop1=true;
		            boolean loop2=true;
			        for (WebElement element : elements) {
			            String text = element.getText();
			      
			            if(text.contains("[")) {
			            	int startIndex = text.indexOf('[') + 1;
				            int endIndex = text.indexOf(']');
				            String numberString = text.substring(startIndex, endIndex);
				            int number = Integer.parseInt(numberString);
				            if (number > 200 && loop==true) {
				                element.click();
								wait(driver,"2");
				                if(isDisplayed1(driver,Unique_200_error)) {
				                	pass(driver," 'Kindly select column with unique class less than or equal to 200 as a target' , Validation message displayed  : "+text);
						        	click3(driver,Unique_200_error);
									wait(driver,"1");
									loop=false;
					        	}else {
					        		fail(driver," 'Kindly select column with unique class less than or equal to 200 as a target' Validation message not displayed : "+text);
					        	}
				            }else if(loop1) {
				            	element.click();
								wait(driver,"2");
				            	if(isDisplayed1(driver,target_Succes)) {
				                	pass(driver,"  Target  gets selected and message displayed \"target added successfully\" : "+text);
						        	click3(driver,target_Succes);
									wait(driver,"1");
									loop1=false;
					        	}else {
					        		fail(driver,"  Target not selected and message not displayed \"target added successfully\" : "+text);
					        	}
				            }
			            }else if(loop2) {
			            	element.click();
							wait(driver,"2");
			            	if(isDisplayed1(driver,target_Succes)) {
			                	pass(driver,"  Target  gets selected and message displayed \"target added successfully\" : "+text);
					        	click3(driver,target_Succes);
								wait(driver,"1");
								loop2=false;
				        	}else {
				        		fail(driver,"  Target not selected and message not displayed \"target added successfully\" : "+text);
				        	}
			            }
			           
			            if(isDisplayed(driver,targetDrop)) {
							 try{
								 click3(driver,targetDrop); 
							 }catch(Exception e) {
								 
							 }
						 }
			        } 
			        
			 }else {
				 fail(driver,"Categorical column not present in the List ");
			 }
			 
			 click3(driver,targetDrop); 
				 		 
			 if(isDisplayed(driver,Text_Option)) {
		        	click(driver,Text_Option);
		        	if(isDisplayed(driver,textError)) {
		    			passReport(driver,"Validation Should show, 'Text column cannot be selected as target'" ,"Validation shows, 'Text column cannot be selected as target'");
			        	click(driver,Date_target_error);
		        	}else {
		      			failReport(driver,"Validation Should show, 'Text column cannot be selected as target'","Validation not shows, 'Text column cannot be selected as target'");
		        	}
					 click3(driver,targetDrop); 
		        }else {
	        		fail(driver,"Text column not present in the List ");
		        }

			 if(isDisplayed(driver,Numerical_option)) {
				 
				    boolean loop=true;
		            boolean loop1=true;
		            boolean loop2=true;
				 List<WebElement> elements = driver.findElements(By.xpath("//span[@class='mat-option-text']//img[contains(@src,'Numerical')]//following::span[1]"));

			        for (WebElement element : elements) {
			            String text = element.getText();
			            if(text.contains("[")) {
			            	
			            	int startIndex = text.indexOf('[') + 1;
				            int endIndex = text.indexOf(']');
				            String numberString = text.substring(startIndex, endIndex);
				            int number = Integer.parseInt(numberString);
				            if (number > 200 && loop==true) {
				                element.click();
								wait(driver,"2");
				                if(isDisplayed(driver,Unique_200_error)) {
				                	pass(driver," 'Kindly select column with unique class less than or equal to 200 as a target' , Validation message displayed : "+text);
						        	click3(driver,Unique_200_error);
									wait(driver,"1");
									loop=false;
					        	}else {
					        		fail(driver," 'Kindly select column with unique class less than or equal to 200 as a target' Validation message not displayed : "+text);
					        	}
				            }else if(loop1){
				            	element.click();
								wait(driver,"2");
				            	if(isDisplayed(driver,target_Succes)) {
				                	pass(driver,"  Target  gets selected and message displayed \"target added successfully\" : "+text);
						        	click3(driver,target_Succes);
									wait(driver,"1");
									loop1=false;
					        	}else {
					        		fail(driver,"  Target not selected and message not displayed \"target added successfully\" : "+text);
					        	}
				            }
			            }else if(loop2){
			            	element.click();
							wait(driver,"2");
			            	if(isDisplayed(driver,target_Succes)) {
			                	pass(driver,"  Target  gets selected and message displayed \"target added successfully\"  : "+text);
					        	click3(driver,target_Succes);
								wait(driver,"1");
								loop2=false;
				        	}else {
				        		fail(driver,"  Target not selected and message not displayed \"target added successfully\" : "+text);
				        	}
			            }
					   click3(driver,targetDrop); 
			        } 
			 }else {
				 fail(driver,"Numerical column not present in the List ");
			 }
//			 
			 Actions act=new Actions(driver);
			 act.sendKeys(Keys.ESCAPE).build().perform();
			 mouseOverToElement(driver,Statistics_icon);
			 click(driver,Statistics_icon);
			 if(isDisplayed1(driver,statistics_page)) {
            	pass(driver,"Statistics is accessible after selecting target");
			 }else {
        		fail(driver,"Statistics is not accessible after selecting target");
			 }  
		    mouseOverToElement(driver,statisticalTest);
		    click(driver,statisticalTest);
		    if(isDisplayed1(driver,StatisticalTestPage)) {
            	pass(driver,"Statistical Test is accessible after selecting target");
	        }else {
        		fail(driver,"Statistical Test is not accessible after selecting target");
	        }  
		    
		    mouseOverToElement(driver,StatisticalTestPage);
		    wait(driver,"1");
		    mouseOverToElement(driver,visual_Analytics);
		    if(isDisplayed(driver,accessible)) {
    		   pass(driver,"Visual Analytics  accessible after selecting target");
		    }else {    
	    		fail(driver,"Visual Analytics not  accessible after selecting target");
		    } 
	        
    	   mouseOverToElement(driver,predictive_analytics);
    	   if(isDisplayed(driver,accessible)) {
    		   pass(driver,"Predictive Analytics  accessible after selecting target");
       	   }else { 
    		   fail(driver,"Predictive Analytics not accessible after selecting target");
       	   } 
	    	   
    	   click(driver,Visual_icon);
    	   elementnotvisible(driver,Loading);
		   if(isDisplayed(driver,DashProPage)) {
    		   pass(driver,"Visual Analytics  clickable and dash pro page displayed ");
    	   }else {  
    		   fail(driver,"Visual Analytics not clickable and dash pro page not  displayed ");
    	   }
	    	   
		   if(isDisplayed(driver,defaultTab1)) {
    		   pass(driver,"\"Tab1\" gets  created by default ");
    	   }else {        	     
    		   fail(driver,"\"Tab1\" not created by default ");
    	   }
	    		   
		   if(isDisplayed(driver,ADD_widget_rightTop)) {
    		    pass(driver,"Top right corner Add widget element is present ");
	   	        String[] postion= getPositionOfElement(driver,ADD_widget_rightTop);
	   	        String RightWidget_X_Act=postion[0];
	   	        String RightWidget_Y_Act=postion[1];
	   	        System.out.println(RightWidget_X_Exp+" "+RightWidget_Y_Exp);
	   	        if(RightWidget_X_Exp.equals(RightWidget_X_Act) && RightWidget_Y_Exp.equals(RightWidget_Y_Act)) {
	    			passReport(driver,"AddWidget Should Placed in the Top Right Position", "AddWidget Placed in the Top Right Position");
	   	        }else {
	      			failReport(driver,"AddWidget Should Placed in Top Right Position","AddWidget not Placed in Top Right Position");
	   	        }  	        
    	   	}else {    
    	   		fail(driver,"Top right corner Add widget element is not present ");
    	   	}
	    	   
		   	if(isDisplayed(driver,Add_widget_center)) {
	   			pass(driver,"Center Add widget element is present ");
	   	        String[] postion= getPositionOfElement(driver,Add_widget_center);
	   	        String CenterWidget_X_Act=postion[0];
	   	        String CenterWidget_Y_Act=postion[1];
	   	        System.out.println(CenterWidget_X_Exp+" "+CenterWidget_Y_Exp);
	   	        if(CenterWidget_X_Exp.equals(CenterWidget_X_Act) && CenterWidget_Y_Exp.equals(CenterWidget_Y_Act)) {
	    			passReport(driver,"AddWidget Should Placed in the Center", "AddWidget Placed in the Center");
	   	        }else {
	      			failReport(driver,"AddWidget Should Placed in the Center","AddWidget not Placed in the Center");
	   	        }

		   	}else { 
		   		fail(driver,"Center Add widget element is not present ");
		   	}
	    	  
		   	click(driver,Add_widget_center);
		   	if(isDisplayed(driver,WidgetPanel)) {
    		    pass(driver,"Add widgets is clickable and the widgetss  are displayed ");
		   	}else {       
		   		fail(driver,"Add widgets is not clickable and the widgetss  are not displayed");
		   	}
	    	   
		   	click(driver,predictive_analytics);
		   	if(isDisplayed(driver,PredectivePage)) {
    		    pass(driver,"Predictive Analytics  clickable and Predictive Analytics page displayed ");
		   	}else {        	 
		   		fail(driver,"Predictive Analytics not clickable and Predictive Analytics page not  displayed ");
		   	}
	}
	
}
