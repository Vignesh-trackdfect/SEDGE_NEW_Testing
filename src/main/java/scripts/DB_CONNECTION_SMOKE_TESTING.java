package scripts;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import commonMethods.Keywords;
import commonMethods.Utils;

public class DB_CONNECTION_SMOKE_TESTING extends Keywords{

	public void dbConnection(WebDriver driver,int iteration) {
		
		LocalTime currentTime = LocalTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HHmmss");
		String formattedTime = currentTime.format(formatter);
		String ConnectionNameValue="Test_"+formattedTime;
		String CreateProjectBtn_Text_Exp=Utils.getDataFromTestData("DataAnalytics", "CreateProjectBtn_Txt_Exp");
		String CreateProjectBtn_Color_Exp=Utils.getDataFromTestData("DataAnalytics", "CreateProjectBtn_color_Exp");
		String CreateProject_Msg_Exp=Utils.getDataFromTestData("DataAnalytics", "Createroject_Msg_Exp");
		String DB_TypeText_Exp=Utils.getDataFromTestData("SmokeTesting_UI", "DB_TypeText_Exp");
		String Host_Name_text_Exp=Utils.getDataFromTestData("SmokeTesting_UI", "Host_Name_text_Exp");
		String PortName_text_Exp=Utils.getDataFromTestData("SmokeTesting_UI", "PortName_text_Exp");
		String DB_Url_text_Exp=Utils.getDataFromTestData("SmokeTesting_UI", "DB_Url_text_Exp");
		String ClassNameText_Exp=Utils.getDataFromTestData("SmokeTesting_UI", "ClassNameText_Exp");
		String UserNameText_Exp=Utils.getDataFromTestData("SmokeTesting_UI", "UserNameText_Exp");
		String PasswordText_Exp=Utils.getDataFromTestData("SmokeTesting_UI", "PasswordText_Exp");
		String DB_VersionText_Exp=Utils.getDataFromTestData("SmokeTesting_UI", "DB_VersionText_Exp");
		String Connect_btn_ExpText=Utils.getDataFromTestData("SmokeTesting_UI", "Connect_btn_ExpText");
		String Reset_btn_ExpText=Utils.getDataFromTestData("SmokeTesting_UI", "ResetBtnText");
		String Connect_btn_ExpColor=Utils.getDataFromTestData("SmokeTesting_UI", "Connect_btn_ExpColor");
		String DB_Connect_ErrorText=Utils.getDataFromTestData("SmokeTesting_UI", "DB_Connect_ErrorText");
		String Error_Color_TextExp=Utils.getDataFromTestData("SmokeTesting_UI", "Error_Color_Text");
		String Pass_Color_text=Utils.getDataFromTestData("SmokeTesting_UI", "Pass_Color_text");
		String SelectedText_ColorExp=Utils.getDataFromTestData("SmokeTesting_UI", "SelectedText_Color");
		String DatabaseTextExp=Utils.getDataFromTestData("SmokeTesting_UI", "DatabaseTextExp");
		String SchemasTextExp=Utils.getDataFromTestData("SmokeTesting_UI", "SchemasTextExp");
		String ConnectionNameTextExp=Utils.getDataFromTestData("SmokeTesting_UI", "ConnectionNameTextExp");
		String SaveConnetBtnTextExp=Utils.getDataFromTestData("SmokeTesting_UI", "SaveConnetBtnTextExp");
		String SQLEnabledColorExp=Utils.getDataFromTestData("SmokeTesting_UI", "SQLEnableButtonColor");
		
		//Iteration inputs
		String Select_DataBaseType=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input", "Select_DataBaseType");
		String HostName=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input", "HostName");
		String DB_UserName=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input", "DB_UserName");
		String DB_Password=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input", "DB_Password");
		String SelectSchema=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input", "SelectSchema");
		String SelectDataBase=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input", "SelectDataBase");
		String searchTableName=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input", "searchTableName");
		String ProjectName=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input", "ProjectName");
		
		//Iteration inputs
		
		waitForElement(driver,HomePage);
		waitForElement(driver,Data_Analytics_page_link);
		
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
		 }
        
//        waitForElement1(driver, file_upload_page);
        verifyElementIsPresent1(driver,upload_your_file);
        verifyElementIsPresent1(driver,DB_connection);
        click(driver,DB_connection);
        
        verifyElementIsPresent1(driver,upload_your_file);
		verifyElementIsPresent1(driver,DB_connection);

		click(driver,DB_connection);
		if(isDisplayed2(driver,New_Connection)){
			passReport(driver,"New Connection Page should display when click the DB Connection","New Connection Page displayed when click the DB Connection");
		 }else {
			 failReport(driver,"New Connection Page should display when click the DB Connection","New Connection Page not displayed when click the DB Connection");
		 }
		
		// Verifying all the elements present and validating the respective text start...
		verifyElementIsPresent1(driver,New_Connection); 
		verifyElementIsPresent1(driver,Existing_Connection);
		if(isDisplayed(driver,Existing_Connection_Tab)) {
			click(driver,New_Connection);
		}
		
		verifyElementIsPresent1(driver,DB_Type_Input);
		String DBType_Input_ActText=getText1(driver, DB_Type_Input_text);
		if(DB_TypeText_Exp.equals(DBType_Input_ActText)) {
			passReport(driver,"'"+DB_TypeText_Exp+"' should dislay in DataBase Type Input","'"+DBType_Input_ActText+"' is dislayed in DataBase Type Input");
		 }else {
			failReport(driver,"'"+DB_TypeText_Exp+"' should dislay in DataBase Type Input","'"+DBType_Input_ActText+"' is dislayed in DataBase Type Input");
		 }
        
        verifyElementIsPresent1(driver,HostName_Input);
		String HostName_Input_ActText=getText1(driver, HostName_Input_Text);
		if(Host_Name_text_Exp.equals(HostName_Input_ActText)) {
			passReport(driver,"'"+Host_Name_text_Exp+"' should dislay in Host Name Input","'"+HostName_Input_ActText+"' is dislayed in Host Name Input");
		 }else {
			failReport(driver,"'"+Host_Name_text_Exp+"' should dislay in Host Name Input","'"+HostName_Input_ActText+"' is dislayed in Host Name Input");
		 }
        
        verifyElementIsPresent1(driver,DB_Version_Input);
		String DB_Version_Input_ActText=getText1(driver, DB_Version_Input_Text);
		if(Host_Name_text_Exp.equals(HostName_Input_ActText)) {
			passReport(driver,"'"+DB_VersionText_Exp+"' should dislay in DB Version Input","'"+DB_Version_Input_ActText+"' is dislayed in DB Version Input");
		 }else {
			failReport(driver,"'"+DB_VersionText_Exp+"' should dislay in DB Version Input","'"+DB_Version_Input_ActText+"' is dislayed in DB Version Input");
		 }
        
        verifyElementIsPresent1(driver,DB_PortNumber);
		String DB_PortNumber_ActText=getText1(driver, DB_PortNumber_Text);
		if(PortName_text_Exp.equals(DB_PortNumber_ActText)) {
			passReport(driver,"'"+PortName_text_Exp+"' should dislay in Port Number Input","'"+DB_PortNumber_ActText+"' is dislayed in Port Number Input");
		 }else {
			failReport(driver,"'"+PortName_text_Exp+"' should dislay in Port Number Input","'"+DB_PortNumber_ActText+"' is dislayed in Port Number Input");
		 }
        
        verifyElementIsPresent1(driver,UserName_Input);
		String UserName_Input_ActText=getText1(driver, UserName_Input_Text);
		if(UserNameText_Exp.equals(UserName_Input_ActText)) {
			passReport(driver,"'"+UserNameText_Exp+"' should dislay in User Name Input","'"+UserName_Input_ActText+"' is dislayed in User Name Input");
		 }else {
			failReport(driver,"'"+UserNameText_Exp+"' should dislay in User Name Input","'"+UserName_Input_ActText+"' is dislayed in User Name Input");
		 }
        
        verifyElementIsPresent1(driver,Password_Input);
		String Password_Input_ActText=getText1(driver, Password_Input_Text);
		if(PasswordText_Exp.equals(Password_Input_ActText)) {
			passReport(driver,"'"+PasswordText_Exp+"' should dislay in Password Input","'"+Password_Input_ActText+"' is dislayed in Password Input");
		 }else {
			failReport(driver,"'"+PasswordText_Exp+"' should dislay in Password Input","'"+Password_Input_ActText+"' is dislayed in Password Input");
		 }
        
        verifyElementIsPresent1(driver,dbURL_Input);
		String dbURL_Input_ActText=getText1(driver, dbURL_Input_Text);
		if(DB_Url_text_Exp.equals(dbURL_Input_ActText)) {
			passReport(driver,"'"+DB_Url_text_Exp+"' should dislay in DataBase URL Input","'"+dbURL_Input_ActText+"' is dislayed in Password Input");
		 }else {
			failReport(driver,"'"+DB_Url_text_Exp+"' should dislay in DataBase URL Input","'"+dbURL_Input_ActText+"' is dislayed in Password Input");
		 }
        
        verifyElementIsPresent1(driver,dBClassName_Input);
		String dBClassName_Input_ActText=getText1(driver, dBClassName_InputText);
		if(ClassNameText_Exp.equals(dBClassName_Input_ActText)) {
			passReport(driver,"'"+ClassNameText_Exp+"' should dislay in Class Name Input","'"+dBClassName_Input_ActText+"' is dislayed in Class Name Input");
		 }else {
			failReport(driver,"'"+ClassNameText_Exp+"' should dislay in Class Name Input","'"+dBClassName_Input_ActText+"' is dislayed in Class Name Input");
		 }
		        
        verifyElementIsPresent1(driver,Connect_btn);
		String Connect_btn_ActText=getText1(driver, connect_btn_text);
		if(Connect_btn_ExpText.equals(Connect_btn_ActText)) {
			passReport(driver,"'"+Connect_btn_ExpText+"' should dislay in Connect button","'"+Connect_btn_ActText+"' is dislayed in Connect button");
		 }else {
			failReport(driver,"'"+Connect_btn_ExpText+"' should dislay in Connect button","'"+Connect_btn_ActText+"' is dislayed in Connect button");
		 }
		String connect_btn_ColorAct=getTextBackgroundColor(driver, Connect_btn);
		if(Connect_btn_ExpColor.equalsIgnoreCase(connect_btn_ColorAct)) {
			passReport(driver,"'"+Connect_btn_ExpColor+"' color should dislay in Connect button","'"+connect_btn_ColorAct+"' color is dislayed in Connect button");
		}else {
			failReport(driver,"'"+Connect_btn_ExpColor+"' color should dislay in Connect button","'"+connect_btn_ColorAct+"' color is dislayed in Connect button");
		}
		
		verifyElementIsPresent1(driver,Reset_Btn);
		String Reset_Btn_ActText=getText1(driver, Reset_Btn_text);
		if(Reset_btn_ExpText.equals(Reset_Btn_ActText)) {
			passReport(driver,"'"+Reset_btn_ExpText+"' should dislay in Reset button","'"+Reset_Btn_ActText+"' is dislayed in Reset button");
		}else {
			failReport(driver,"'"+Reset_btn_ExpText+"' should dislay in Reset button","'"+Reset_Btn_ActText+"' is dislayed in Reset button");
		}
		// Verifying all the elements present and validating the respective text start...

		
        click(driver,Connect_btn);
        if(isDisplayed2(driver,DB_ConnectionErrorText)) {
           String dberrorAct=getText1(driver,DB_ConnectionErrorText);
           if(dberrorAct.equals(DB_Connect_ErrorText)) {
   			  passReport(driver,DB_Connect_ErrorText+" : Error should display when click the Connect button Without giving Inputs",dberrorAct+" : Error displayed when click the Connect button Without giving Inputs"); 
           }else {
    		  failReport(driver,DB_Connect_ErrorText+" : Error should display when click the Connect button Without giving Inputs",dberrorAct+" : Error displayed when click the Connect button Without giving Inputs"); 
           }    		
        }else {
			failReport(driver,"When click the connect without giving the input values error should display","When click the connect without giving the input values error not displayed"); 
        }
        
        wait(driver,"1");
        String DBTypeTextColor=getTextColor(driver, DB_Type_Input_text);
        String HostTextColor=getTextColor(driver, HostName_Input_Text);
        String UserNameTextColor=getTextColor(driver, UserName_Input_Text);
        String PassTextColor=getTextColor(driver, Password_Input_Text);

        if(DBTypeTextColor.equalsIgnoreCase(Error_Color_TextExp)&&HostTextColor.equalsIgnoreCase(Error_Color_TextExp)&&UserNameTextColor.equalsIgnoreCase(Error_Color_TextExp)&&PassTextColor.equalsIgnoreCase(Error_Color_TextExp)) {
 			 passReport(driver,"All Fields should be highlighted in '"+Error_Color_TextExp+"' colour when click the Connect button Without giving Inputs","All Fields are highlighted in '"+DBTypeTextColor+"' colour when click the Connect button Without giving Inputs"); 
         }else {
  		     failReport(driver,"All Fields should be highlighted in '"+Error_Color_TextExp+"' colour when click the Connect button Without giving Inputs","All Fields are not highlighted in '"+Error_Color_TextExp+"' colour when click the Connect button Without giving Inputs"); 
         } 
        
        String portNumbertext1=getTextJavascript(driver, DB_PortNumber);
    	System.out.println(" port "+portNumbertext1);//deletethis
    	
    	String Classtext1=getTextJavascript(driver, dBClassName_Input);
    	System.out.println(" class "+Classtext1);//deletethis
    	
        click(driver,DB_Type_Input);
        if(isDisplayed2(driver,dropdown_Expand)) {
 			 passReport(driver,"Database type dropdown should be expand when click the Input","Database type dropdown expanded when click the Input"); 
        }else {
			 failReport(driver,"Database type dropdown should be expand when click the Input","Database type dropdown not expanded when click the Input"); 
        }
        ScrollBarValidation1(driver,dropdown_Expand,"DataBaseType");
        
        WebElement databaseSelect=driver.findElement(By.xpath("//mat-option[@role='option']//span[contains(text(),'"+Select_DataBaseType+"')]"));
  	    Actions action=new Actions(driver);
   	    action.moveToElement(databaseSelect).click().build().perform();
        wait(driver,"1");
   	    if(isDisplayed2(driver,dropdown_Expand)) {
			failReport(driver,"Database type dropdown should Close after selecting the value","Database type dropdown not Closed after selecting the value"); 
   	    }else {
			passReport(driver,"Database type dropdown should Close after selecting the value","Database type dropdown Closed after selecting the value"); 
   	    }
   	    
   	   click(driver,DB_Type_Input);
   	   waitForElement(driver,dropdown_Expand);
   	   String rgbFormat = databaseSelect.getCssValue("color");
   	   String selectedElement_ActColor = rgbToHex(rgbFormat);
   	   if(selectedElement_ActColor.equalsIgnoreCase(SelectedText_ColorExp)) {
			passReport(driver,"Selected database type should be highlighted in blue colour : "+SelectedText_ColorExp,"Selected database type highlighted in blue colour, Act Color : "+selectedElement_ActColor); 
   	   }else {
			failReport(driver,"Selected database type should be highlighted in blue colour : "+SelectedText_ColorExp,"Selected database type not highlighted in blue colour, Act Color : "+selectedElement_ActColor); 
   	   }
   	   action.moveToElement(databaseSelect).click().build().perform();
        
   	   String portNumbertext=getTextJavascript(driver, DB_PortNumber);
   	   System.out.println(" port "+portNumbertext);
   	   if(portNumbertext!=null) {
		  passReport(driver,"Port Number should generate after selection of database type","Port Number get generated after selection of database type, : "+portNumbertext); 
   	   }else {
 		  failReport(driver,"Port Number should generate after selection of database type","Port Number not generated after selection of database type "); 
   	   }
   	   
   	   String Classtext=getTextJavascript(driver, dBClassName_Input);
	   System.out.println(" class "+Classtext);
	   if(Classtext!=null) {
		  passReport(driver,"Class text should generate after selection of database type","Class text get generated after selection of database type, : "+Classtext); 
   	   }else {
 		  failReport(driver,"Class text should generate after selection of database type","Class text not generated after selection of database type "); 
   	   }
	   
   	   click(driver,HostName_Input);
   	   sendKeys(driver,HostName_Input,HostName);
   	   String hostNameColorAct=getTextColor(driver, HostName_Input_Text);
   	   if(hostNameColorAct.equalsIgnoreCase(Pass_Color_text)) {
 		  passReport(driver,"Hostname should highlighted in blue colour when enter values","Hostname highlighted in blue colour when enter values"); 
   	   }else {
  		  failReport(driver,"Hostname should highlighted in blue colour when enter values","Hostname not highlighted in blue colour when enter values");  
   	   }
	   
   	   click(driver,DB_PortNumber);
   	   String PortNumberColorAct=getTextColor(driver, DB_PortNumber_Text);
   	   if(PortNumberColorAct.equalsIgnoreCase(Pass_Color_text)) {
		  passReport(driver,"Port Number should highlighted in blue colour when click on it","Port Number highlighted in blue colour when click on it"); 
  	   }else {
 		  failReport(driver,"Port Number should highlighted in blue colour when click on it","Port Number not highlighted in blue colour when click on it");  
  	   }
	    
   	   click(driver,UserName_Input);
 	   sendKeys(driver,UserName_Input,DB_UserName);
 	   String UserNameColorAct=getTextColor(driver, UserName_Input_Text);
 	   if(UserNameColorAct.equalsIgnoreCase(Pass_Color_text)) {
		  passReport(driver,"UserName should highlighted in blue colour when enter values","User Name highlighted in blue colour when enter values"); 
 	   }else {
		  failReport(driver,"UserName should highlighted in blue colour when enter values","User Name not highlighted in blue colour when enter values");  
 	   }
	   
 	   click(driver,Password_Input);
	   sendKeys(driver,Password_Input,DB_Password);
	   String PasswordColorAct=getTextColor(driver, Password_Input_Text);
	   if(PasswordColorAct.equalsIgnoreCase(Pass_Color_text)) {
		  passReport(driver,"Password should highlighted in blue colour when enter values","Password highlighted in blue colour when enter values"); 
	   }else {
		  failReport(driver,"Password should highlighted in blue colour when enter values","Password not highlighted in blue colour when enter values");  
	   }
   	   
	   click(driver,Connect_btn);
	   if(verifyElementDisplayed(driver, DataBaseNameInput)) {
		   String DataBaseTextAct=getText1(driver,DataBaseNameInputText);
		   if(DatabaseTextExp.equals(DataBaseTextAct)) {
			   passReport(driver,"'"+DatabaseTextExp+"' Should display in DataBase Dropdown","'"+DataBaseTextAct+"' is displayed in DataBase Dropdown"); 
		   }else {
			   failReport(driver,"'"+DatabaseTextExp+"' Should display in DataBase Dropdown","'"+DataBaseTextAct+"' is displayed in DataBase Dropdown"); 
		   }
	   }
	   
	   if(verifyElementDisplayed(driver, SchemaNameInput)) {
		   String SchemaTextAct=getText1(driver,SchemaNameInputText);
		   if(SchemasTextExp.equals(SchemaTextAct)) {
			   passReport(driver,"'"+SchemasTextExp+"' Should display in Schema Dropdown","'"+SchemaTextAct+"' is displayed in Schema Dropdown"); 
		   }else {
			   failReport(driver,"'"+SchemasTextExp+"' Should display in Schema Dropdown","'"+SchemaTextAct+"' is displayed in Schema Dropdown"); 
		   }
	   }

	   if(verifyElementDisplayed(driver, ConnectionNameInput)) {
		   String ConnectionNameTextAct=getText1(driver,ConnectionNameInputText);
		   if(ConnectionNameTextExp.equals(ConnectionNameTextAct)) {
			   passReport(driver,"'"+ConnectionNameTextExp+"' Should display in Connection Name Input","'"+ConnectionNameTextAct+"' is displayed in Connection Name Input"); 
		   }else {
			   failReport(driver,"'"+ConnectionNameTextExp+"' Should display in Connection Name Input","'"+ConnectionNameTextAct+"' is displayed in Connection Name Input"); 
		   }
	   }
	   
	   if(verifyElementIsPresent(driver, SaveConnectionBtn)) {
		   String SaveConnectionBtn_ActText=getText1(driver,SaveConnectionBtnText);
		   if(SaveConnetBtnTextExp.equals(SaveConnectionBtn_ActText)) {
			   passReport(driver,"'"+SaveConnetBtnTextExp+"' Should display in Save Connection button","'"+SaveConnectionBtn_ActText+"' is displayed in Save Connection button"); 
		   }else {
			   failReport(driver,"'"+SaveConnetBtnTextExp+"' Should display in Save Connection button","'"+SaveConnectionBtn_ActText+"' is displayed in Save Connection button"); 
		   }   
		   String SaveConnectBtnColorAct=getTextBackgroundColor(driver,SaveConnectionBtn);
		   if(Connect_btn_ExpColor.equalsIgnoreCase(SaveConnectBtnColorAct)) {
			   passReport(driver,"'"+Connect_btn_ExpColor+"' Color Should display in Save Connection button","'"+SaveConnectBtnColorAct+"' Color is displayed in Save Connection button"); 
		   }else {
			   failReport(driver,"'"+Connect_btn_ExpColor+"' Color Should display in Save Connection button","'"+SaveConnectBtnColorAct+"' Color is displayed in Save Connection button"); 
		   } 
	   }
	   
       click(driver,DataBaseNameInput);
       if(isDisplayed2(driver,dropdown_Expand)) {
    	   passReport(driver,"DataBase dropdown should expand when clicking on it","DataBase dropdown expanded when clicking on it"); //testing
       }else {
  		  failReport(driver,"DataBase dropdown should expand when clicking on it","DataBase dropdown not expanded when clicking on it");   
       }
       ScrollBarValidation1(driver,dropdown_Expand,"DataBase");
       
       WebElement database=driver.findElement(By.xpath("//mat-option[@role='option']//span[contains(text(),'"+SelectDataBase+"')]"));
  	   action.moveToElement(database).click().build().perform();
       wait(driver,"1");
       elementnotvisible(driver,Loading);
       if(isDisplayed2(driver,dropdown_Expand)) {
			failReport(driver,"Database dropdown should Close after selecting the value","Database dropdown not Closed after selecting the value"); 
  	    }else {
  	    	passReport(driver,"Database dropdown should Close after selecting the value","Database dropdown Closed after selecting the value"); //testing
  	    }
       click(driver,DataBaseNameInput);
       waitForElement(driver,dropdown_Expand);
       String rgbFormat1 = database.getCssValue("color");
   	   String selectedElement_ActColor1 = rgbToHex(rgbFormat1);
   	   if(selectedElement_ActColor1.equalsIgnoreCase(SelectedText_ColorExp)) {
			passReport(driver,"Selected database should be highlighted in blue colour : "+SelectedText_ColorExp,"Selected database highlighted in blue colour, Act Color : "+selectedElement_ActColor1); 
   	   }else {
			failReport(driver,"Selected database should be highlighted in blue colour : "+SelectedText_ColorExp,"Selected database not highlighted in blue colour, Act Color : "+selectedElement_ActColor1); 
   	   }
   	   action.moveToElement(database).click().build().perform();
       
   	   click(driver,SchemaNameInput);
   	   if(isDisplayed2(driver,dropdown_Expand)) {
   		   passReport(driver,"Schema dropdown should expand when clicking on it","Schema dropdown expanded when clicking on it"); 
   	   }else {
   		   failReport(driver,"Schema dropdown should expand when clicking on it","Schema dropdown not expanded when clicking on it");   
   	   }
   	   ScrollBarValidation1(driver,dropdown_Expand,"Schema");
    
   	   WebElement schema=driver.findElement(By.xpath("//mat-option[@role='option']//span[contains(text(),'"+SelectSchema+"')]"));
	   action.moveToElement(schema).click().build().perform();
	   wait(driver,"1");
	   elementnotvisible(driver,Loading);
	   if(isDisplayed2(driver,dropdown_Expand)) {
			failReport(driver,"Schema dropdown should Close after selecting the value","Schema dropdown not Closed after selecting the value"); 
   		}else {
			passReport(driver,"Schema dropdown should Close after selecting the value","Schema dropdown Closed after selecting the value"); 
	    }
   	   
	   click(driver,SchemaNameInput);
       waitForElement(driver,dropdown_Expand);
       wait(driver,"1");
//       element=driver.findElement(By.xpath("//mat-option[@role='option']//span[contains(text(),'"+SelectSchema+"')]"));
       String rgbFormatSchema = schema.getCssValue("color");
   	   String selectedSchema_ActColor = rgbToHex(rgbFormatSchema);
   	   if(selectedSchema_ActColor.equalsIgnoreCase(SelectedText_ColorExp)) {
			passReport(driver,"Selected Schema should be highlighted in blue colour : "+SelectedText_ColorExp,"Selected Schema highlighted in blue colour, Act Color : "+selectedSchema_ActColor); 
   	   }else {
			failReport(driver,"Selected Schema should be highlighted in blue colour : "+SelectedText_ColorExp,"Selected Schema not highlighted in blue colour, Act Color : "+selectedSchema_ActColor); 
   	   }
   	   action.moveToElement(schema).click().build().perform();
   	   
   	   click(driver,ConnectionNameInput);
   	   wait(driver,"1");
   	   String connectTextColor=getTextColor(driver, ConnectionNameInputText);
   	   if(connectTextColor.equalsIgnoreCase(Pass_Color_text)) { 
		  passReport(driver,"Connection Name should highlighted in blue colour when click on it, Exp : "+Pass_Color_text,"Connection Name highlighted in blue colour when click on it :"+connectTextColor); 
 	   }else {
		  failReport(driver,"Connection Name should highlighted in blue colour when click on it : Exp : "+Pass_Color_text,"Connection Name not highlighted in blue colour when click on it :"+connectTextColor);  
 	   }
   	   sendKeys(driver,ConnectionNameInput,ConnectionNameValue);
   	   
   	   click(driver,SaveConnectionBtn);
   	   elementnotvisible1(driver, Loading);
   	   if(isDisplayed2(driver,Connectionfail)){
   		   click(driver,Existing_Connection);
   		   waitForElement(driver,ExistingConectionTab);
   		   elementnotvisible(driver, Connectionfail);
   		   wait(driver,"1");
   		   waitForElement(driver,deleteIcon_1);
   		   mouseOverToElement(driver, deleteIcon_1);
//   		   click(driver,deleteIcon_1);
   		   click(driver,deleteIcon_1);
   		   waitForElement(driver,deleteConfirmPopup);
   		   waitForElement(driver,deleteOkButton);
   		   click(driver,deleteOkButton);
   		   waitForElement(driver,deleteSuccessPopup);
   		   
   		   click(driver,New_Connection);
   		   waitForElement(driver,DB_Type_Input);
   		   click(driver,DB_Type_Input);
   		   waitForElement(driver,dropdown_Expand);
   		   databaseSelect=driver.findElement(By.xpath("//mat-option[@role='option']//span[contains(text(),'"+Select_DataBaseType+"')]"));
   		   action.moveToElement(databaseSelect).click().build().perform();
   		   click(driver,HostName_Input);
    	   sendKeys(driver,HostName_Input,HostName);
    	   click(driver,UserName_Input);
     	   sendKeys(driver,UserName_Input,DB_UserName);
     	   click(driver,Password_Input);
     	   sendKeys(driver,Password_Input,DB_Password);
     	   click(driver,Connect_btn);
     	   waitForElement(driver,DataBaseNameInput);
     	   click(driver,DataBaseNameInput);
     	   waitForElement(driver,dropdown_Expand);
     	   database=driver.findElement(By.xpath("//mat-option[@role='option']//span[contains(text(),'"+SelectDataBase+"')]"));
     	   action.moveToElement(database).click().build().perform();
           wait(driver,"1");
           elementnotvisible(driver,Loading);
           click(driver,SchemaNameInput);
           waitForElement(driver,dropdown_Expand);
           schema=driver.findElement(By.xpath("//mat-option[@role='option']//span[contains(text(),'"+SelectSchema+"')]"));
    	   action.moveToElement(schema).click().build().perform();
    	   wait(driver,"1");
    	   elementnotvisible(driver,Loading);
    	   click(driver,ConnectionNameInput);
    	   sendKeys(driver,ConnectionNameInput,ConnectionNameValue+"1");
    	   click(driver,SaveConnectionBtn);
    	   elementnotvisible(driver,Loading);
   	   }
   	   
   	   if(isDisplayed(driver,ConnectionSuccessPopup)) {
 		  passReport(driver,"'Saved Successfully' popup should show When Save the connection","'Saved Successfully' popup displayed When Save the connection");  
   	   }else {
  		  failReport(driver,"'Saved Successfully' popup should show When Save the connection","'Saved Successfully' popup not displayed When Save the connection");  
   	   }
   	   elementnotvisible(driver, Loading);
   	   if(isDisplayed(driver,ExistingConectionTab)) {
  		  passReport(driver,"Existing Conection Tab should display After saving the connection","Existing Conection Tab displayed After saving the connection");  
   	   }else {
   		  failReport(driver,"Existing Conection Tab should display After saving the connection","Existing Conection Tab not displayed After saving the connection");  
   	   }
   	   
   	  
   	   try {
		   WebElement EditConnection=driver.findElement(By.xpath("//td[contains(text(),'"+ConnectionNameValue+"')]//following::button[@title='Edit the connection']"));
		   if(EditConnection.isDisplayed()) {
	  		  passReport(driver,"'Edit the connection' option should Display in Existing Conection Tab ","'Edit the connection' option Displayed in Existing Conection Tab ");  
		   }else {
	  		  failReport(driver,"'Edit the connection' option should Display in Existing Conection Tab ","'Edit the connection' option not Displayed in Existing Conection Tab ");  
		   }
   	   	}catch(Exception e) {
		   fail(driver,"unable to find the 'Edit the connection' element");
   	   	}
   	  
   	   try {
		   WebElement DeleteConnection=driver.findElement(By.xpath("//td[contains(text(),'"+ConnectionNameValue+"')]//following::button[@title='Delete the connection']"));
		   if(DeleteConnection.isDisplayed()) {
	  		  passReport(driver,"'Delete the connection' option should Display in Existing Conection Tab ","'Delete the connection' option Displayed in Existing Conection Tab ");  
		   }else {
	  		  failReport(driver,"'Delete the connection' option should Display in Existing Conection Tab ","'Delete the connection' option not Displayed in Existing Conection Tab ");  
		   }
   	   	}catch(Exception e) {
		   fail(driver,"unable to find the 'Delete the connection' element");
   	   	}
   	   
   	   try {
		   WebElement connectDataBase=driver.findElement(By.xpath("//td[contains(text(),'"+ConnectionNameValue+"')]//following::button[@title='Connect to the database']"));
		   if(connectDataBase.isDisplayed()) {
	  		  passReport(driver,"'Connect to the database' option should Display in Existing Conection Tab ","'Connect to the database' option Displayed in Existing Conection Tab ");  
		   }else {
	  		  failReport(driver,"'Connect to the database' option should Display in Existing Conection Tab ","'Connect to the database' option not Displayed in Existing Conection Tab ");  
		   } 
		   connectDataBase.click();
		   wait(driver,"1");
   	   	}catch(Exception e) {
		   fail(driver,"unable to find the 'Connect to the database' element");
		   Assert.fail();
   	   	}  
   	   
   	     wait(driver,"1");
   	   	elementnotvisible(driver, Loading);
   		elementnotvisible(driver, Loading);
   	   	verifyElementDisplayed(driver, SQLEditorPage);
   	   	verifyElementDisplayed(driver, Organisation);
   	   	verifyElementDisplayed(driver, DataBaseSections);
   	   	verifyElementDisplayed(driver, TableSections);
   	   
   	   	try {
		   WebElement databaseSection=driver.findElement(By.xpath("//span[@ref='eValue']//span[contains(text(),'"+SelectDataBase+"')]"));
		   if(databaseSection.isDisplayed()) {
	  		  pass(driver,"Element '" +SelectDataBase+"' Section present is verified ");
		   }else {
			   fail(driver,"Element is Not Present : '"+SelectDataBase+"' Section");		   }
   	   	}catch(Exception e) {
			 fail(driver,"Unable to find : '"+SelectDataBase+"' Section");
   	   	}

   	   	if(isDisplayed(driver,SQLGeneratorSection)) {
   	   		passReport(driver,"SQLGeneratorSection Should present in the SQL Editor Page","SQLGeneratorSection is present in the SQL Editor Page");  
   	   	}else {
   	   		failReport(driver,"SQLGeneratorSection Should present in the SQL Editor Page","SQLGeneratorSection is not present in the SQL Editor Page");  
   	   	}
   	   	if(isDisplayed(driver,SQLGenerateArea)) {
   	   		passReport(driver,"SQL Query generator area Should present in the SQL Editor Page","SQL Query generator area is present in the SQL Editor Page");  
   	   	}else {
   	   		failReport(driver,"SQL Query generator area Should present in the SQL Editor Page","SQL Query generator area is not present in the SQL Editor Page");  
   	   	}
   	   	if(isDisplayed(driver,LanguageToSqlText)) {
   	   		passReport(driver,"'Natural language to SQL' text Should present in the SQLGeneratorSection","'Natural language to SQL' text is present in the SQLGeneratorSection");  
   	   	}else {
   	   		failReport(driver,"'Natural language to SQL' text Should present in the SQLGeneratorSection","'Natural language to SQL' text is not present in the SQLGeneratorSection");  
   	   	}
   	  
   	   	if(isDisplayed(driver,LanguageToSqlButton)) {
   	   		passReport(driver,"'Natural language to SQL Button' Should present in the SQLGeneratorSection","'Natural language to SQL Button' is present in the SQLGeneratorSection");  
   	   	}else {
   	   		failReport(driver,"'Natural language to SQL Button' Should present in the SQLGeneratorSection","'Natural language to SQL Button' is not present in the SQLGeneratorSection");  
   	   	}
   	  
   	   	if(isToggleEnable(driver,LanguageToSqlButton)) {
   	   		failReport(driver,"By Default, 'Natural language to SQL' toggle should be disable","By Default, 'Natural language to SQL' toggle is enabled");
   	   	}else {
   	   		passReport(driver,"By Default, 'Natural language to SQL' toggle should be disable","By Default, 'Natural language to SQL' toggle is disabled");
   	   	}
  
   	   	click(driver,LanguageToSqlButton);
   	   	wait(driver,"1");
   	   	String enableColor=getTextBackgroundColor(driver, LanguageToSqlButton);
   	   	if(enableColor.equalsIgnoreCase(SQLEnabledColorExp)) {
   	   		passReport(driver,"'Natural language to SQL' toggle should be enable after click on it","'Natural language to SQL' toggle enabled after click on it");
   	   	}else {
   	   		failReport(driver,"'Natural language to SQL' toggle should be enable after click on it","'Natural language to SQL' toggle not enabled after click on it");
   	   	}
   	
   	   	click(driver,LanguageToSqlButton);
   	    enableColor=getTextBackgroundColor(driver, LanguageToSqlButton);
   	   	wait(driver,"1");
   	   	if(!enableColor.equalsIgnoreCase(SQLEnabledColorExp)) {
   	   		passReport(driver,"'Natural language to SQL' toggle should be disable after click on it","'Natural language to SQL' toggle disabled after click on it");
   	   	}else {
   	   		failReport(driver,"'Natural language to SQL' toggle should be disable after click on it","'Natural language to SQL' toggle not disabled after click on it");
   	   	}
   	   	
   	   	if(isToggleAccessible(driver,FormateQuery)) {
	   		failReport(driver,"By Default, 'FormateQuery' should be InAccessible","By Default, 'FormateQuery' is Accessible");
	   	}else {
	   		passReport(driver,"By Default, 'FormateQuery' should be InAccessible","By Default, 'FormateQuery' is InAccessible");
	   	}
   	   	
   	   	if(isToggleAccessible(driver,ExportResult)) {
	   		failReport(driver,"By Default, 'ExportResult' should be InAccessible","By Default, 'FormateQuery' is Accessible");
	   	}else {
	   		passReport(driver,"By Default, 'ExportResult' should be InAccessible","By Default, 'FormateQuery' is InAccessible");
	   	}
   	   	
   	   	doubleClick(driver,TableSections);
   	   	if(isDisplayed(driver,TableList1)) {
	   		passReport(driver,"Tables section should expand and display the table list When expanding the tables","Tables section expanded and display the table list When expanding the tables");
   	   	}else {
	   		failReport(driver,"Tables section should expand and display the table list When expanding the tables","Tables section not expanded When expanding the tables");
   	   	}
   	
   	   	sendKeys(driver,SearchField,searchTableName);
   	   	wait(driver,"1");
   	   	String searchResultText=getText1(driver,SearchedTableList).trim();
   	   	System.out.println("tableList :"+searchTableName);
   	   	System.out.println("searchResultText :"+searchResultText);
   	   	
   	   	if(searchResultText.equals(searchTableName)) {
	   		passReport(driver,"Search Fields should work properly","Search Fields work properly");
   	   	}else {
	   		failReport(driver,"Search Fields should work properly","Search Fields not work properly");
   	   	}

   	   	click(driver,SearchedTableList);
   	   	String ExpectedQuery="Select * from "+searchTableName;
        String ActQuery=getText(driver,searchedQuery);
//        System.out.println("ActQuery :"+ActQuery);
        if(ActQuery.contains(ExpectedQuery)) {
        	passReport(driver,"Query should generate in the SQL generator box with Selected List Name","Query generated in the SQL generator box with Selected List Name");
        }else {
        	failReport(driver,"Query should generate in the SQL generator box with Selected List Name","Query not generated in the SQL generator box with Selected List Name");
        }
   	   	
        if(isToggleAccessible(driver,ExecuteQuery)) {
	   		passReport(driver,"'ExecuteQuery' should enable after selecting the list value","'ExecuteQuery' enabled after selecting the list value");
	   	}else {
	   		failReport(driver,"'ExecuteQuery' should enable after selecting the list value","'ExecuteQuery' not enabled after selecting the list value");
	   	}
        
        if(isToggleAccessible(driver,ClearQuery)) {
	   		passReport(driver,"'ClearQuery' should enable after selecting the list value","'ClearQuery' enabled after selecting the list value");
	   	}else {
	   		failReport(driver,"'ClearQuery' should enable after selecting the list value","'ClearQuery' not enabled after selecting the list value");
	   	}
      
        if(isToggleAccessible(driver,ProjectNameInputField)) {
	   		passReport(driver,"'ProjectNameInputField' should enable after selecting the list value","'ProjectNameInputField' enabled after selecting the list value");
	   	}else {
	   		failReport(driver,"'ProjectNameInputField' should enable after selecting the list value","'ProjectNameInputField' not enabled after selecting the list value");
	   	}
        
        if(isToggleAccessible(driver,FileNameInputField)) {
	   		passReport(driver,"'FileNameInputField' should enable after selecting the list value","'FileNameInputField' enabled after selecting the list value");
	   	}else {
	   		failReport(driver,"'FileNameInputField' should enable after selecting the list value","'FileNameInputField' not enabled after selecting the list value");
	   	}
        
        String projectNameGenerated=getTextJavascript(driver, ProjectNameInputField).trim();
        System.out.println("projectNmae :"+projectNameGenerated);
        if(projectNameGenerated!=null) {
	   		passReport(driver,"Project name should updated automatically when select file","Project name updated automatically when select file :'"+projectNameGenerated+"'");
        }else {
	   		failReport(driver,"Project name should updated automatically when select file","Project name not updated automatically when select file :'"+projectNameGenerated+"'");
        }
        String fileNameGenerated=getTextJavascript(driver, FileNameInputField).trim();
        System.out.println("fileNmae :"+fileNameGenerated);
        if(fileNameGenerated.equals(searchTableName)) {
	   		passReport(driver,"Selected File Name should updated automatically in FileName input","Selected File Name updated automatically in FileName input");
        }else {
	   		failReport(driver,"Selected File Name should updated automatically in FileName place","Selected File Name not updated automatically in FileName place");
        }
        
        click(driver,ExecuteQuery);
        elementnotvisible(driver, Loading);
        if(isDisplayed(driver,QueryResults)) {
	   		passReport(driver,"Query should execute after clicking the Execute Query button","Query executed after clicking the Execute Query button");
        }else {
	   		failReport(driver,"Query should execute after clicking the Execute Query button","Query not executed after clicking the Execute Query button");
        }
        verifyElementIsPresent(driver, SaveResultButton);
        verifyElementIsPresent(driver, CommandHistory);
        
        click(driver,ClearQuery);
        wait(driver,"1");
        String queryText=getText1(driver,searchedQuery);
		System.out.println("ActQuery :"+ActQuery);
        if(queryText.isEmpty()) {
	   		passReport(driver,"Query should clear after clicking the Clear Query button","Query cleared after clicking the Clear Query button");
        }else {
        	failReport(driver,"Query should clear after clicking the Clear Query button","Query not cleared after clicking the Clear Query button");
        }
		
        click(driver,SearchedTableList);
        waitForElement(driver, ProjectNameInputField);
        click(driver,ProjectNameInputField);
        clear1(driver,ProjectNameInputField);
        sendKeys(driver,ProjectNameInputField,"AB&#Abxcd");
        wait(driver,"2");
        click3(driver,FileNameInputField);
        click(driver,SaveResultButton);
        elementnotvisible(driver, Loading);
        if(isDisplayed(driver,ProjectNameErro1)&&isDisplayed(driver,ProjectNameErro2)) {
	   		passReport(driver,"'Supports alphanumeric and _ only' error should display properly when Save the file with Special character in Filename","'Supports alphanumeric and _ only' error displayed properly when Save the file with Special character in Filename");
        }else {
	   		failReport(driver,"'Supports alphanumeric and _ only' error should display properly when Save the file with Special character in Filename","'Supports alphanumeric and _ only' error not displayed properly when Save the file with Special character in Filename");
        }
        
        clearAndType1(driver,ProjectNameInputField,ProjectName);
        
        click(driver,FileNameInputField);
        clear1(driver,FileNameInputField);
        sendKeys(driver,FileNameInputField,"Ab&#Abdc");
        wait(driver,"1");
        click3(driver,ProjectNameInputField);
        click(driver,SaveResultButton);
        elementnotvisible(driver, Loading);
        if(isDisplayed(driver,ProjectNameErro1)&&isDisplayed(driver,FileNameError)) {
	   		passReport(driver,"'Supports alphanumeric and _ only' error should display properly when Save the file with Special character in Project Name","'Supports alphanumeric and _ only' error displayed properly when Save the file with Special character in Project Name");
        }else {
	   		failReport(driver,"'Supports alphanumeric and _ only' error should display properly when Save the file with Special character in Project Name","'Supports alphanumeric and _ only' error not displayed properly when Save the file with Special character in Projetc Name");
        }
        clearAndType1(driver,FileNameInputField,fileNameGenerated+"2");
        String tableFirstHeadingBefore=getText1(driver,heading1).trim();
        
        click(driver,SaveResultButton);
        elementnotvisible(driver, Loading);
        elementnotvisible(driver, Loading1);
        if(isDisplayed(driver,Preview_text)&&isDisplayed(driver,DataSetTable)) {
	   		passReport(driver,"File should be Saved and it should navigate to preview page","File Saved and it navigated to preview page");
	   		String tableFirstHeadingAft=getText1(driver,LoadTable).trim();
	        if(tableFirstHeadingBefore.equals(tableFirstHeadingAft)) {
		   		passReport(driver,"Preview page should be display with respective columns datatype","Preview page displayed with respective columns datatype");
	        }else {
	        	failReport(driver,"Preview page should be display with respective columns datatype","Preview page displayed with different columns datatype");
	        }
	        
        }else {
	   		failReport(driver,"File should be Saved and it should navigate to preview page","File not Saved and it not navigated to preview page");
        }

//        searchTableName=searchTableName.substring(0, 1).toUpperCase()+searchTableName.substring(1);
//        String FileName_Exp="File Name: "+searchTableName;
//        String FileName_Act=getText1(driver,FileNamePreviewPage).trim();
//        //new
//        if(FileName_Act.contains(".")) {
//        	FileName_Act=FileName_Act.substring(0, FileName_Act.indexOf("."));
//        	System.out.println("FileName_Act ..:"+FileName_Act);
//        }
//        //new
//        if(FileName_Exp.contains(FileName_Act)) {
//	   		pass(driver,"File name correctly displayed at bottom of page");
//        }else {
//	   		fail(driver,"File name not correctly displayed at bottom of page, ");
//        }
		
        if(isDisplayed(driver,FileNamePreviewPage)) {
        	pass(driver,"FileName is Displayed in the bottom of Preview Page");
        }else {
        	fail(driver,"FileName is not Displayed in the bottom of Preview Page");	
        }
        
        List<WebElement> headerList=getWebElements(driver, PreviewHeaderCount);
        List<WebElement> sortingList=getWebElements(driver, SortingIconsPreview);
      
        if(headerList.size()==sortingList.size()) {
        	pass(driver,"All the header value displayed with Sorting Icon in the Preview Page");
        }else {
        	fail(driver,"Some header Value displayed without Sorting Icon in the Preview Page");
        }
        
		
	}
}
