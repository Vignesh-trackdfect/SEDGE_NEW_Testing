package scripts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class TestCase_DP01 extends Keywords{
	
	
	boolean flag=true;
	public void TestCasesFull(WebDriver driver,int iteration) {
		//url 
		String URL = TestNgXml.getdatafromExecution().get("TestCase_DP01_Iteration_"+iteration);
		//url iteration
		//CommonData values
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
		
		String AxesColor_Exp=Utils.getDataFromTestData("Axes", "Axes_Color_Exp");
		String ApplyBtn_text_Exp=Utils.getDataFromTestData("Axes", "Apply_Btn_Txt");
		String ApplyBtn_color_Exp=Utils.getDataFromTestData("Axes", "Apply_Btn_Color");
		String Highlight_color_Exp=Utils.getDataFromTestData("Axes", "HighlightColor");
		String Y_axis_text_Exp=Utils.getDataFromTestData("Axes", "Y_Axis_text");
		String X_axis_text_Exp=Utils.getDataFromTestData("Axes", "X_Axis_text");
		String Agg_text_Exp=Utils.getDataFromTestData("Axes", "Agg_text");
		String GroupText_Exp=Utils.getDataFromTestData("Axes", "Group_text");
		String SelectedTextColorExp=Utils.getDataFromTestData("Axes", "selectedValueColor");
		
		String AxisTextColorExp=Utils.getDataFromTestData("AxisTitle", "AxisTextColor_Exp");
		String X_Title_Exp=Utils.getDataFromTestData("AxisTitle", "X_Title_text");
		String Y_Title_Exp=Utils.getDataFromTestData("AxisTitle", "Y_Title_text");
		String FontFamily_Exp=Utils.getDataFromTestData("AxisTitle", "FontFamily_text");
		String default_FontFamily=Utils.getDataFromTestData("AxisTitle", "default_FontFamily");
		String Title_font_txt_Exp=Utils.getDataFromTestData("AxisTitle", "Title_font_txt");
		String default_FontSize_Exp=Utils.getDataFromTestData("AxisTitle", "default_FontSize");
		String X_FontSize_txt_Exp=Utils.getDataFromTestData("AxisTitle", "X_FontSize_txt_Exp");
		String Y_FontSize_txt_Exp=Utils.getDataFromTestData("AxisTitle", "Y_FontSize_txt_Exp");
		String X_Rotation_txt_Exp=Utils.getDataFromTestData("AxisTitle", "X_rotation_Exp");
		String Y_Rotation_txt_Exp=Utils.getDataFromTestData("AxisTitle", "Y_rotation_Exp");
		String RotationInputColor_Exp=Utils.getDataFromTestData("AxisTitle", "RotationInput_Color");
		String defaultRotation=Utils.getDataFromTestData("AxisTitle", "default_Rotation_Value");
		String SwitchSliderText_Exp=Utils.getDataFromTestData("AxisTitle", "SwitchSliderText_Exp");
		String Highlight_Color_Exp=Utils.getDataFromTestData("AxisTitle", "HighlightColor_Exp");
		String Selected_Color_Exp=Utils.getDataFromTestData("AxisTitle", "SelectedColor_Exp");
		
		String ChartTitle_text_Exp=Utils.getDataFromTestData("ChartTitle", "ChartTitle_text");
		String ChartTitleColorExp=Utils.getDataFromTestData("ChartTitle", "ChartTitleColorExp");
		String BackgroundText_Exp=Utils.getDataFromTestData("ChartTitle", "BackgroundText_Exp");
		String DefaultBackgroundColor_Exp=Utils.getDataFromTestData("ChartTitle", "DefaultBackgroundColor");
		String FontColorText_Exp=Utils.getDataFromTestData("ChartTitle", "FontColorText_Exp");
		String DefaultFontColor_Exp=Utils.getDataFromTestData("ChartTitle", "DefaultFontColor");
		String FontFamily_text_Exp=Utils.getDataFromTestData("ChartTitle", "FontFamily_text");
		String Default_FontFamily=Utils.getDataFromTestData("ChartTitle", "default_FontFamily");
		String FontSizeText_Exp=Utils.getDataFromTestData("ChartTitle", "FontSizeText_Exp");
		String default_FontSizeChartTitle_Exp=Utils.getDataFromTestData("ChartTitle", "default_FontSize");
		String Highlight_ColorChartTitle_Exp=Utils.getDataFromTestData("ChartTitle", "HighlightColor_Exp");
		String Selected_ColorChartTitle_Exp=Utils.getDataFromTestData("ChartTitle", "SelectedColor_Exp");
		
		String ChartFormatColorExp=Utils.getDataFromTestData("ChartFormat_ChartStyle", "ChartFormatColorExp");
		String ChartStylingText_Exp=Utils.getDataFromTestData("ChartFormat_ChartStyle", "ChartStylingText_Exp");
		String ChartStylingColor_Exp=Utils.getDataFromTestData("ChartFormat_ChartStyle", "ChartStylingColor_Exp");
		String ChartThemeText_Exp=Utils.getDataFromTestData("ChartFormat_ChartStyle", "ChartThemeText_Exp");
		String X_ScrollText_Exp=Utils.getDataFromTestData("ChartFormat_ChartStyle", "X_ScrollText_Exp");
		String Y_ScrollText_Exp=Utils.getDataFromTestData("ChartFormat_ChartStyle", "Y_ScrollText_Exp");
		String Auto_ScrollText_Exp=Utils.getDataFromTestData("ChartFormat_ChartStyle", "Auto_ScrollText_Exp");
		String EnableGridText_Exp=Utils.getDataFromTestData("ChartFormat_ChartStyle", "EnableGridText_Exp");
		String EnableButtonColor=Utils.getDataFromTestData("ChartFormat_ChartStyle", "EnableButtonColor");
		String DefaultThemeValue_Exp=Utils.getDataFromTestData("ChartFormat_ChartStyle", "defaultThemeValue_Exp");
		String Highlight_ColorStyle_Exp=Utils.getDataFromTestData("ChartFormat_ChartStyle", "HighlightColor_Exp");
		String Selected_ColorStyle_Exp=Utils.getDataFromTestData("ChartFormat_ChartStyle", "SelectedColor_Exp");
		
//		String ChartFormatColorExp=Utils.getDataFromTestData("ChartFormat_ChartStyle", "ChartFormatColorExp");
		String DataLabelText_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DataLabelText_Exp");
		String DataLabelsColor_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DataLabelsColor_Exp");
		String EnableValueText_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "EnableValueText_Exp");
		String ValueFormatText_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "ValueFormatText_Exp");
		String SeperatorText_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "SeperatorText_Exp");
		String ValueFontSizeText_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "ValueFontSizeText_Exp");
		String RoundOffText_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "RoundOffText_Exp");
		String PositionText_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "PositionText_Exp");
		String BigNumberText_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "BigNumberText_Exp");
		String ShowAsPositiveText_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "ShowAsPositiveText_Exp");
		String ValueRotationText_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "ValueRotationText_Exp");
		String DefaultFormatValue_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DefaultFormatValue");
		String DefaultSeperatorValue_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DefaultSeperatorValue");
		String DefaultFontSizeValue_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DefaultFontSizeValue");
		String DefaultRoundOffValue_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DefaultRoundOffValue");
		String DefaultPositionValue_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DefaultPositionValue");
		String DefaultRotationValue_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DefaultRotationValue");
	
		String Others_text_Exp=Utils.getDataFromTestData("ChartFormat_Others", "Others_text_Exp");
		String Others_Color_Exp=Utils.getDataFromTestData("ChartFormat_Others", "Others_Color_Exp");
		String StatsLineText_Exp=Utils.getDataFromTestData("ChartFormat_Others", "StatsLineText_Exp");
		String default_StatslineValueExp=Utils.getDataFromTestData("ChartFormat_Others", "default_StatslineValue");
		String StatsLinePositionText_Exp=Utils.getDataFromTestData("ChartFormat_Others", "StatsLinePositionText_Exp");
		String StatsRoundOffText_Exp=Utils.getDataFromTestData("ChartFormat_Others", "StatsRoundOffText_Exp");
		String default_RoundOffValue_Exp=Utils.getDataFromTestData("ChartFormat_Others", "default_RoundOffValue");
		String default_StatslinePosition_Exp=Utils.getDataFromTestData("ChartFormat_Others", "default_StatslinePosition");
		String CursorText_Exp=Utils.getDataFromTestData("ChartFormat_Others", "CursorText_Exp");
		String StatsLineColorText_Exp=Utils.getDataFromTestData("ChartFormat_Others", "StatsLineColorText_Exp");
		String defaultStatsLineColor_Exp=Utils.getDataFromTestData("ChartFormat_Others", "defaultStatsLineColor");
		String ExportText_Exp=Utils.getDataFromTestData("ChartFormat_Others", "ExportText_Exp");
		
		//CommonData values
		
		
		//Iteration Inputs
		String Username=Utils.getDataFromTestDataIteration(iteration, "SEDGE", "Username");
		String Password=Utils.getDataFromTestDataIteration(iteration, "SEDGE", "Password");
		String FileName=Utils.getDataFromTestDataIteration(iteration,"SEDGE", "FileName");
		String filepath=System.getProperty("user.dir") + "\\testdata\\"+FileName+".csv";
		String TargetVariable=Utils.getDataFromTestDataIteration(iteration,"SEDGE", "TargetVariable");
		
		String Y_Axis_Type_1=Utils.getDataFromTestDataIteration(iteration,"AxesInput", "Y_Axis_Type");
		String X_Axis_Type_1=Utils.getDataFromTestDataIteration(iteration,"AxesInput", "X_Axis_Type");
		String X_Axis_Value_1=Utils.getDataFromTestDataIteration(iteration,"AxesInput", "X_Axis_Value");
		String Y_Axis_Value_1=Utils.getDataFromTestDataIteration(iteration,"AxesInput", "Y_Axis_Value");
		String limitValue=Utils.getDataFromTestDataIteration(iteration,"AxesInput", "LimitValue");
		
		String X_Title_new=Utils.getDataFromTestDataIteration(iteration,"AxisTitleInput", "X_Title_Input");
		String Y_Title_new=Utils.getDataFromTestDataIteration(iteration,"AxisTitleInput", "Y_Title_Input");
		String ChangeFontFamily=Utils.getDataFromTestDataIteration(iteration,"AxisTitleInput", "Change_FontFamily");
		String ChangeTotalFontSize=Utils.getDataFromTestDataIteration(iteration,"AxisTitleInput", "ChangeTotalFontSize");
		String change_X_label_FontSize=Utils.getDataFromTestDataIteration(iteration,"AxisTitleInput", "X_label_FontSize");
		String change_Y_label_FontSize=Utils.getDataFromTestDataIteration(iteration,"AxisTitleInput", "Y_label_FontSize");
		String X_Rotation_Input=Utils.getDataFromTestDataIteration(iteration,"AxisTitleInput", "X_Rotation_Value");
		String Y_Rotation_Input=Utils.getDataFromTestDataIteration(iteration,"AxisTitleInput", "Y_Rotation_Value");
		
		String ChangeFontFamilyChartTitle=Utils.getDataFromTestDataIteration(iteration,"ChartTitleInput", "Change_FontFamily");
		String ChangeFontSize=Utils.getDataFromTestDataIteration(iteration,"ChartTitleInput", "ChangeFontSize");
		String ChangeWidgetName=Utils.getDataFromTestDataIteration(iteration,"ChartTitleInput", "ChangeWidgetName");
		String TypeBackgroundColor1=Utils.getDataFromTestDataIteration(iteration,"ChartTitleInput", "TypeBackgroundColor1");
		String TypeTextColor1=Utils.getDataFromTestDataIteration(iteration,"ChartTitleInput", "TypeTextColor1");
		
		String Change_ChartTheme=Utils.getDataFromTestDataIteration(iteration,"ChartStyleInput", "Change_ChartTheme");
		String InValidChartTheme=Utils.getDataFromTestDataIteration(iteration,"ChartStyleInput", "InvalidChartTheme");
		String Y_Axis_Type=Utils.getDataFromTestDataIteration(iteration,"ChartStyleInput", "Y_Axis_Type");
		String X_Axis_Type=Utils.getDataFromTestDataIteration(iteration,"ChartStyleInput", "X_Axis_Type");
		String X_Axis_Value=Utils.getDataFromTestDataIteration(iteration,"ChartStyleInput", "X_Axis_Value");
		String Y_Axis_Value=Utils.getDataFromTestDataIteration(iteration,"ChartStyleInput", "Y_Axis_Value");

		String ChangeRotataionVal_Positive=Utils.getDataFromTestDataIteration(iteration,"DataLabelInput", "ChangeRotataionVal_Positive");
		String ChangeRotataionVal_Negative=Utils.getDataFromTestDataIteration(iteration,"DataLabelInput", "ChangeRotataionVal_Negative");
		String ChangeFontSizeValue=Utils.getDataFromTestDataIteration(iteration,"DataLabelInput", "ChangeFontSizeValue");
		String ChangeRoundOffValue=Utils.getDataFromTestDataIteration(iteration,"DataLabelInput", "ChangeRoundOffValue");
   
		String ChangeStatsLine=Utils.getDataFromTestDataIteration(iteration,"ChartFormat_OthersInput", "ChangeStatsLine");
		String ChangeRoundOffValueOthers=Utils.getDataFromTestDataIteration(iteration,"ChartFormat_OthersInput", "ChangeRoundOffValue");

		// Iteration Inputs
	    Actions act=new Actions(driver);
		
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
				            	act.moveToElement(element).build().perform();
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
				            	act.moveToElement(element).build().perform();
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
			            	act.moveToElement(element).build().perform();
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
			            click3(driver,targetDrop);
			        } 
			        
			 }else {
				 fail(driver,"Categorical column not present in the List ");
			 }
			 
			 click3(driver,targetDrop); 
				 		 
			 if(isDisplayed(driver,Text_Option)) {
		        	click(driver,Text_Option);
		        	if(isDisplayed(driver,textError)) {
		    			passReport(driver,"Validation Should show, 'Text column cannot be selected as target'" ,"Validation shows, 'Text column cannot be selected as target'");
			        	click3(driver,Date_target_error);
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
			 click3(driver,target);
			 selectTarget(driver,TargetVariable);
			 
			 
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
	    			passReport(driver,"AddWidget Should Placed in the Top Right Position, X="+RightWidget_X_Exp+" , Y="+RightWidget_Y_Exp, "AddWidget Placed in the Top Right Position, X="+RightWidget_X_Act+" , Y="+RightWidget_Y_Act);
	   	        }else {
	      			failReport(driver,"AddWidget Should Placed in Top Right Position, X="+RightWidget_X_Exp+" , Y="+RightWidget_Y_Exp,"AddWidget not Placed in Top Right Position, X="+RightWidget_X_Act+" , Y="+RightWidget_Y_Act);
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
	    			passReport(driver,"AddWidget Should Placed in the Center, X="+CenterWidget_X_Exp+" , Y="+CenterWidget_Y_Exp, "AddWidget Placed in the Center, X="+CenterWidget_X_Act+" , Y="+CenterWidget_Y_Act);
	   	        }else {
	      			failReport(driver,"AddWidget Should Placed in the Center, X="+CenterWidget_X_Exp+" , Y="+CenterWidget_Y_Exp,"AddWidget not Placed in the Center, X="+CenterWidget_X_Act+" , Y="+CenterWidget_Y_Act);
	   	        }

		   	}else { 
		   		fail(driver,"Center Add widget element is not present ");
		   	}
	    	
		   	click(driver,predictive_analytics);
		   	if(isDisplayed(driver,PredectivePage)) {
    		    pass(driver,"Predictive Analytics  clickable and Predictive Analytics page displayed ");
		   	}else {        	 
		   		fail(driver,"Predictive Analytics not clickable and Predictive Analytics page not  displayed ");
		   	}
		   	
		    click(driver,Visual_icon);
		    elementnotvisible(driver,Loading);
		    if(isDisplayed(driver,DashProPage)) {
    		   pass(driver,"Visual Analytics  clickable and dash pro page displayed ");
		    }else {  
    		   fail(driver,"Visual Analytics not clickable and dash pro page not  displayed ");
		    }  
		    
		    waitForElement(driver,ADD_widget_rightTop);
		    click(driver,ADD_widget_rightTop);
		    elementnotvisible(driver,Loading);
		   	if(isDisplayed(driver,WidgetPanel)) {
    		    pass(driver,"Add widgets is clickable and the widgetss  are displayed ");
		   	}else {       
		   		fail(driver,"Add widgets is not clickable and the widgetss  are not displayed");
		   	}
             
//           try {
//      	   elementScreenShot_new(driver,Allwidgets,"/Expected_screenshot/Widgets/AllWidgets");
//      	   elementScreenShot_new(driver,Allwidgets,"/Actual_screenshot/Widgets/AllWidgets");
//				imageComparison(driver, "/Widgets/AllWidgets", "/Widgets/AllWidgets");
//				wait(driver, "2");
//			} catch (Exception e1) {
//				fail(driver,"Unable to compare the Images for AllWidgets");
//			}
		    
		WidgetValidation(driver,Table_widget,"Table");
  	 	WidgetValidation(driver,Bar_widget,"Bar");
 	    WidgetValidation(driver,Pivot_widget,"Pivot");
 	    WidgetValidation(driver,Stacked_Bar_widget,"Stacked Bar");
 	    WidgetValidation(driver,Grouped_Bar_widget,"Grouped Bar");
 	    WidgetValidation(driver,Coloumn_widget,"Column");
 	    WidgetValidation(driver,Stacked_Column_widget,"Stacked Column");
 	    WidgetValidation(driver,Grouped_Column_widget,"Grouped Column");
 	    WidgetValidation(driver,Pie_widget,"Pie");
 	    WidgetValidation(driver,Donut_widget,"Donut");
 	    WidgetValidation(driver,SemiCircle_widget,"semi circle");
 	    WidgetValidation(driver,SunBurst_widget,"Sun burst");
 	    WidgetValidation(driver,WaterFall_widget,"Water Fall");
 	    WidgetValidation(driver,Network_widget,"Network");
 	    WidgetValidation(driver,Line_widget,"Line");
 	    WidgetValidation(driver,Area_widget,"Area");
 	    WidgetValidation(driver,Gantt_widget,"Gantt");
 	    WidgetValidation(driver,Scatter_widget,"Scatter");
 	    WidgetValidation(driver,Dumbel_plot_widget,"Dumbbell Plot");
 	    WidgetValidation(driver,Tree_map_widget,"Tree Map");
 	    WidgetValidation(driver,HeatMap_Legend_widget,"Heat Map Legend");
 	    WidgetValidation(driver,GroupandSorted_widget,"Grouped and Sorted");
 	    WidgetValidation(driver,Multiple_Axis_widget,"Multiple Axis");
 	    WidgetValidation(driver,Radar_Line_widget,"Radar Line");
 	    WidgetValidation(driver,Zoomable_Bubble_widget,"Zoomable Bubble");
 	    WidgetValidation(driver,Time_line_widget,"Time line");
 	    WidgetValidation(driver,Population_Pyramid_widget,"Population Pyramid");
 	    WidgetValidation(driver,Box_Plot_widget,"Box Plot");
 	    WidgetValidation(driver,Text_widget,"Text");
 	    WidgetValidation(driver,BarLine_Scatter_widget,"Bar with Line/Scatter");
 	    WidgetValidation(driver,Layered_Column_widget,"Layered Column");
 	    WidgetValidation(driver,Bullet_widget,"Bullet");
 	    WidgetValidation(driver,Circose_widget,"Circos");
 	    WidgetValidation(driver,Candle_stick_widget,"Candle stick");
 	    WidgetValidation(driver,MapWith_Bubble_widget,"Map with Bubble");
 	    WidgetValidation(driver,Word_Cloud_widget,"Word Cloud");
 	    WidgetValidation(driver,Summary_widget,"Summary");
 	    WidgetValidation(driver,Card_widget,"Card");
 	    WidgetValidation(driver,KPI_Card_widget,"KPI card");
 	    WidgetValidation(driver,Custom_Pivot_widget,"Custom pivot");
 	    WidgetValidation(driver,Sparkline_widget,"Sparkline");
      
		   	
		   	
//		    if(verifyElementIsPresent(driver,Bar_widget)) {
//	        	 if(flag==true) {
//					try {
//	//					elementScreenShot_new(driver,Bar_widget,"/Expected_screenshot/Widgets/Bar_widget");
//						elementScreenShot_new(driver,Bar_widget,"/Actual_screenshot/Widgets/Bar_widget");
//						imageComparison(driver, "/Widgets/Bar_widget", "/Widgets/Bar_widget");
//						wait(driver, "2");
//					} catch (Exception e1) {
//						fail(driver,"Unable to compare the Images for Bar_widget");
//					}
//	        	 }
//	        	mouseOverToElement(driver,Bar_widget);
//	        	if(isDisplayed(driver,WidgetText)) {
//	    		String Bar_widget_Act=getText1(driver,WidgetText);
//	   			passReport(driver,"Tooltip should display the name of the Bar Widget " ,"Tooltip displays the name of the Bar Widget");
//	       		textValidation(driver,"Bar",Bar_widget_Act,Bar_widget);
//	        	}else {
//	       			failReport(driver,"Tooltip should display the name of the Bar Widget ","Tooltip not display the name of the Bar Widget");
//	            	}
//	            }
	         
	     	 mouseOverToElement(driver,Widget);
	     	 if(isDisplayed(driver,WidgetText)) {
	    	    failReport(driver,"Tooltip Should get disappeared","Tooltip not disappeared");
	        	}else {
	        		passReport(driver,"Tooltip Should get disappeared" ,"Tooltip gets disappeared");
	        	}
	         
	     	 
	     	 click(driver,Bar_widget);
	     	 String widgetValue=getText1(driver,WidgetValue);
	     	 if(widgetValue.equals("Bar")) {
				passReport(driver,"Bar Should Clickable and Widget Value Display : Bar" ,"Bar widget is Clickbale and Widget Value : "+widgetValue);
	     	 }else {
	     	    failReport(driver,"Bar Should Clickable and Widget Value Display : Bar","Bar Widget not Clickable ");
	     	 }
	         
	     	 
	 		//Axes properties Validation Start
	     	 String AxesExpand=getAttribute1(driver,Axes_Expand,"class");
	     	 if(AxesExpand.contains("up")) {
				passReport(driver,"Bar Axes Should Expand" ,"Bar Axes is Expanded");
	     	 }else {
	     	    failReport(driver,"Bar Axes Should Expand","Bar Axes not Expanded");
	     	 }
	     	 
	 		String AxesTextColor_Act=getTextColor(driver,Axes);
			colorValidation(driver,AxesColor_Exp,AxesTextColor_Act,Axes);
	
			verifyElementIsPresent1(driver,Y_Axis_dropdown);
			if(verifyElementIsPresent1(driver,Y_Axis_text)) {
				String Y_axis_text_Act=getText1(driver,Y_Axis_text);
	       		textValidation(driver,Y_axis_text_Exp,Y_axis_text_Act,Y_Axis_text);
			}
			
			String defaultSelectValue_Y_Act=getText1(driver,Y_Axis_dropdown);
			if(defaultSelectValue_Y_Act.equals("Select")) {
				passReport(driver,"By Default 'Select' Should display as Y axis value" ,"By Default '"+defaultSelectValue_Y_Act+"' is displayed as Y axis value");
			}else {
	     	    failReport(driver,"By Default 'Select' Should display as Y axis value","By Default '"+defaultSelectValue_Y_Act+"' is displayed as Y axis value");
			}
			
			verifyElementIsPresent1(driver,X_Axis_dropdown);
			if(verifyElementIsPresent1(driver,X_Axis_text)) {
				String X_axis_text_Act=getText1(driver,X_Axis_text);
	       		textValidation(driver,X_axis_text_Exp,X_axis_text_Act,X_Axis_text);
			}
			String defaultSelectValue_X_Act=getText1(driver,X_Axis_dropdown);
			if(defaultSelectValue_X_Act.equals("Select")) {
				passReport(driver,"By Default 'Select' Should display as Y axis value" ,"By Default '"+defaultSelectValue_X_Act+"' is displayed as Y axis value");
			}else {
	     	    failReport(driver,"By Default 'Select' Should display as Y axis value","By Default '"+defaultSelectValue_X_Act+"' is displayed as Y axis value");
			}
			
			verifyElementIsPresent1(driver,aggregation);
			if(verifyElementIsPresent1(driver,aggText)) {
				String Agg_text_Act=getText1(driver,aggText);
	       		textValidation(driver,Agg_text_Exp,Agg_text_Act,aggText);
			}
			
			
			verifyElementIsPresent(driver,ApplyButton);
			String ApplyBtn_textAct=getText1(driver,ApplyButton);
			textValidation(driver,ApplyBtn_text_Exp,ApplyBtn_textAct,ApplyButton);
	
			String ApplyBtn_Color_Act=getTextBackgroundColor(driver,ApplyButton);
			colorValidation(driver,ApplyBtn_color_Exp,ApplyBtn_Color_Act,ApplyButton);
			//Axes properties Validation end
			
			//Click Apply button without select X and Y value , then Validating error start
			click(driver,ApplyButton);
			if(isDisplayed(driver,ApplyError1)) {
				passReport(driver,"'Kindly select X axis and Y axis ', Error should Display ","'Kindly select X axis and Y axis ', Error Displayed");
			}else {
	     	    failReport(driver,"'Kindly select X axis and Y axis ', Error Should Display ","Kindly select X axis and Y axis ', Error not Displyed");
			}
			//Click Apply button without select X and Y value , then Validating error End
	 
			
			click(driver,Y_Axis_dropdown);
			if(isDisplayed(driver,Y_Axis_dropdownResults)) {
				passReport(driver,"Y-Axis dropdown Should Expand ","Y-Axis Dropdown is Expanded");
			}else {
	     	    failReport(driver,"Y-Axis dropdown Should Expand ","Y-Axis dropdown not Expanded");
			}
			
//			verifyElementIsPresent1(driver,CategoricalImg);
//			verifyElementIsPresent1(driver,NumericalImg);
//			verifyElementIsPresent1(driver,DateImg);
//			verifyElementIsPresent1(driver,TextImg);
			
			ScrollBarValidation(driver,Y_Axis_dropdownResults,HighlightTextElement,"Y-Axis");
			
			//img[contains(@src, 'Numerical')]//ancestor::li/descendant::div[contains(@title,'calories_chicken')]
			mouseOverToElement(driver,fourthValue);
			String Highlight_Color_Act=getTextBackgroundColor(driver,fourthValue);
			colorValidation(driver,Highlight_color_Exp,Highlight_Color_Act,HighlightTextElement);
			
			click(driver,fourthValue);
			if(isDisplayed(driver,Y_Axis_dropdownResults)) {
				 failReport(driver,"Y-Axis dropdown Should Close after Selecting value ","Y-Axis dropdown not Closed after Selecting value ");
			}else {
				passReport(driver,"Y-Axis dropdown Should Close after Selecting value ","Y-Axis dropdown Closed after Selecting value ");
	
			}
			
			String selectYValue=getText1(driver,Y_Axis_dropdown);
			click(driver,Y_Axis_dropdown);
			waitForElement(driver,Y_Axis_dropdownResults);
			mouseOverToElement(driver,SecondValue);
			
			String selectedColorAct=getTextBackgroundColor(driver,ListSelected);
			String highlightText=getText1(driver,ListSelectedText);
			if((selectYValue.equals(highlightText))&&SelectedTextColorExp.equals(selectedColorAct)) {
				 passReport(driver,"Selected Value ("+selectYValue+") Should Highlight in Grey("+SelectedTextColorExp+") Color","Selected Value ("+highlightText+") Highlighted in Grey("+selectedColorAct+") Color");
			}else {
	     	    failReport(driver,"Selected Value ("+selectYValue+") Should Highlight in Grey("+SelectedTextColorExp+") Color",highlightText+" Value Highlighted in "+selectedColorAct+" Color");
			}
	//		colorValidation(driver,"#DDDDDD",selectedColorAct,ListSelected);
			act.sendKeys(Keys.ESCAPE).build().perform();
	
			
			//X-Axis check....
			click(driver,X_Axis_dropdown);
			if(isDisplayed(driver,X_Axis_dropdownResults)) {
				passReport(driver,"X-Axis dropdown Should Expand ","X-Axis Dropdown is Expanded");
			}else {
	     	    failReport(driver,"X-Axis dropdown Should Expand ","X-Axis dropdown not Expanded");
	
			}
			
//			verifyElementIsPresent1(driver,CategoricalImg);
//			verifyElementIsPresent1(driver,NumericalImg);
//			verifyElementIsPresent1(driver,DateImg);
//			verifyElementIsPresent1(driver,TextImg);
			
			ScrollBarValidation(driver,X_Axis_dropdownResults,HighlightTextElement,"X-Axis");
			mouseOverToElement(driver,ThirdValue);
			Highlight_Color_Act=getTextBackgroundColor(driver,ThirdValue);
			colorValidation(driver,Highlight_color_Exp,Highlight_Color_Act,highlightText);
			
			click(driver,fourthValue);
			if(isDisplayed(driver,X_Axis_dropdownResults)) {
				 failReport(driver,"X-Axis dropdown Should Close after Selecting value ","X-Axis dropdown not Closed after Selecting value ");
			}else {
				passReport(driver,"X-Axis dropdown Should Close after Selecting value ","X-Axis dropdown Closed after Selecting value ");
	
			}
			String selectXValue=getText1(driver,X_Axis_dropdown);
			click3(driver,X_Axis_dropdown);
			waitForElement(driver,X_Axis_dropdownResults);
			mouseOverToElement(driver,SecondValue);
			
			String selectedColorAct1=getTextBackgroundColor(driver,ListSelected);
			String highlightText1=getText1(driver,ListSelectedText);
			if((selectXValue.equals(highlightText1))&&SelectedTextColorExp.equals(selectedColorAct1)) {
				 passReport(driver,"Selected Value ("+selectXValue+") Should Highlight in Grey("+SelectedTextColorExp+") Color","Selected Value ("+highlightText1+") Should Highlight in Grey("+selectedColorAct1+") Color");
			}else {
	     	    failReport(driver,"Selected Value ("+selectXValue+") Should Highlight in Grey("+SelectedTextColorExp+") Color",highlightText1+" Value Highlighted in "+selectedColorAct1+"Color");
			}
			act.sendKeys(Keys.ESCAPE).build().perform();
	
			
			
			click3(driver,ApplyButton);
			if(isDisplayed(driver,ApplyError2)) {
				passReport(driver,"'Kindly check fields and select different values ', Error should Display ","'Kindly check fields and select different values ', Error Displayed");
			}else {
	     	    failReport(driver,"'Kindly check fields and select different values ', Error Should Display ","Kindly check fields and select different values ', Error not Displyed");
			}
			
			click3(driver,X_Axis_dropdown);
			click3(driver,select);
			click3(driver,ApplyButton);
			if(isDisplayed(driver,ApplyError1)) {
				passReport(driver,"'Kindly select X axis and Y axis ', Error should Display When only select the Y value ","'Kindly select X axis and Y axis ', Error Displayed");
			}else {
	     	    failReport(driver,"'Kindly select X axis and Y axis ', Error should Display When only select the Y value ","Kindly select X axis and Y axis ', Error not Displyed");
			}
			
			click3(driver,X_Axis_dropdown);
			click3(driver,categarical1);
			
	
	        //default Aggregation..
	        String defaultaggre=defaultSelectedValue(driver,aggregation);
	//        System.out.println("Default selected option: " + defaultaggre);
	        if(defaultaggre.equals("Count")) {
				passReport(driver,"Aggregation should display the default value as, 'Count' for Categorical","Aggregation displayed the default value as, "+defaultaggre+" for Categorical");
			}else {
	     	    failReport(driver,"Aggregation should display the default value as, 'Count' for Categorical ","Aggregation displayed the default value as, "+defaultaggre+"for Categorical");
			}
	        
			click3(driver,aggregation);
			 //aggregation validation
	        if(isDisplayed2(driver,sumDisabled)) {
				passReport(driver,"Sum should be disabled for Categorical value ","Sum disabled for Categorical value");
	        }else {
	     	    failReport(driver,"Sum should be disabled for Categorical value  ","Sum  enabled for Categorical value ");
	        }
	        
	        if(isDisplayed2(driver,AvgDisabled)) {
				passReport(driver,"Average should be disabled for Categorical value ","Average disabled for Categorical value");
	        }else {
	     	    failReport(driver,"Average should be disabled for Categorical value  ","Average  enabled for Categorical value ");
	        }
	        
	        if(isDisplayed2(driver,minDisabled)) {
				passReport(driver,"Minimum should be disabled for Categorical value ","Minimum disabled for Categorical value");
	        }else {
	     	    failReport(driver,"Minimum should be disabled for Categorical value  ","Minimum  enabled for Categorical value ");
	        }
	        
	        if(isDisplayed2(driver,maxDisabled)) {
				passReport(driver,"Maximum should be disabled for Categorical value ","Maximum disabled for Categorical value");
	        }else {
	     	    failReport(driver,"Maximum should be disabled for Categorical value  ","Maximum  enabled for Categorical value ");
	        }
	        
	        if(!isDisplayed2(driver,uniqueDisabled)) {
				passReport(driver,"Unique should be enabled for Categorical value ","Unique enabled for Categorical value");
	        }else {
	     	    failReport(driver,"Unique should be enabled for Categorical value  ","Unique  disabled for Categorical value ");
	        }
	        
	        if(!isDisplayed2(driver,countDisabled)) {
				passReport(driver,"Count should be enabled for Categorical value ","Count enabled for Categorical value");
	        }else {
	     	    failReport(driver,"Count should be enabled for Categorical value  ","Count  disabled for Categorical value ");
	        } 
	        
	        click3(driver,X_Axis_dropdown);
			click3(driver,numerical1);
			
			 //default Aggregation..
	        defaultaggre=defaultSelectedValue(driver,aggregation);
	//        System.out.println("Default selected option: " + defaultaggre);
	        if(defaultaggre.equals("Sum")) {
				passReport(driver,"Aggregation should display the default value as, 'Sum' for Numerical","Aggregation displayed the default value as, "+defaultaggre+" for Numerical");
			}else {
	     	    failReport(driver,"Aggregation should display the default value as, 'Sum' for Numerical ","Aggregation displayed the default value as, "+defaultaggre+"for Numerical");
			}
	        
			click3(driver,aggregation);
			
			if(!isDisplayed2(driver,sumDisabled)) {
				passReport(driver,"Sum should be enabled for Numerical value ","Sum enabled for Numerical value");
	        }else {
	     	    failReport(driver,"Sum should be enabled for Numerical value  ","Sum  disabled for Numerical value ");
	        }
	        
	        if(!isDisplayed2(driver,AvgDisabled)) {
				passReport(driver,"Average should be enabled for Numerical value ","Average enabled for Numerical value");
	        }else {
	     	    failReport(driver,"Average should be enabled for Numerical value  ","Average disabled for Numerical value ");
	        }
	        
	        if(!isDisplayed2(driver,minDisabled)) {
				passReport(driver,"Minimum should be enabled for Numerical value ","Minimum enabled for Numerical value");
	        }else {
	     	    failReport(driver,"Minimum should be enabled for Numerical value  ","Minimum disabled for Numerical value ");
	        }
	        
	        if(!isDisplayed2(driver,maxDisabled)) {
				passReport(driver,"Maximum should be enabled for Numerical value ","Maximum enabled for Numerical value");
	        }else {
	     	    failReport(driver,"Maximum should be enabled for Numerical value  ","Maximum disabled for Numerical value ");
	        }
	        
	        if(!isDisplayed2(driver,uniqueDisabled)) {
				passReport(driver,"Unique should be enabled for Numerical value ","Unique enabled for Numerical value");
	        }else {
	     	    failReport(driver,"Unique should be enabled for Numerical value  ","Unique  disabled for Numerical value ");
	        }
	        
	        if(!isDisplayed2(driver,countDisabled)) {
				passReport(driver,"Count should be enabled for Numerical value ","Count enabled for Numerical value");
	        }else {
	     	    failReport(driver,"Count should be enabled for Numerical value  ","Count  disabled for Numerical value ");
	        }
	        
	        // Need to modify the code to get the data from excel
	        click(driver,X_Axis_dropdown);
	        selectDropdownValue(driver,X_Axis_Type_1,X_Axis_Value_1);
	
			
			click(driver,Y_Axis_dropdown);
			click(driver,select);
			click(driver,ApplyButton);
			if(isDisplayed(driver,ApplyError1)) {
				passReport(driver,"'Kindly select X axis and Y axis ', Error should Display When only select the X value ","'Kindly select X axis and Y axis ', Error Displayed");
			}else {
	     	    failReport(driver,"'Kindly select X axis and Y axis ', Error should Display When only select the X value ","Kindly select X axis and Y axis ', Error not Displyed");
			}
			
			click(driver,Y_Axis_dropdown);
	        selectDropdownValue(driver,Y_Axis_Type_1,Y_Axis_Value_1);
	
				
			String defaultShowResult=defaultSelectedValue(driver,showResult);
	//        System.out.println("Default selected option: " + defaultShowResult);
	        if(defaultShowResult.equals("All")) {
				passReport(driver,"ShowResults should display the default value as, 'All' ","ShowResults displayed the default value as, "+defaultShowResult);
			}else {
	     	    failReport(driver,"ShowResults should display the default value as, 'All' ","ShowResults displayed the default value as, "+defaultShowResult);
			}
	        
			verifyElementIsPresent1(driver,All);
			verifyElementIsPresent1(driver,Limit);
			wait(driver,"1");
			click(driver,showResult);
			click(driver,All);
			wait(driver,"1");
			
			verifyElementIsPresent(driver,sortType);  
			verifyElementIsPresent(driver,sortBy);
			
			click(driver,sortType);
			click(driver,QuickSort);
			click(driver,sortBy);
			verifyElementIsPresent(driver,sortByDropdownExpand);
		    List<WebElement> SortByValues=getWebElements(driver,sortByValues);
		    int SortByValuesCount=SortByValues.size();
		    if(SortByValuesCount<=3) {
				passReport(driver,"Only X and Y value should display in the sortBy field for Quicksort condition","Only X and Y value displayed in the sortBy field for Quicksort condition");
		    }else {
				failReport(driver,"Only X and Y value should display in the sortBy field for Quicksort condition","All values displayed in the sortBy field for Quicksort condition");
		    }
		    
		    
		    click(driver,sortType);
			wait(driver,"1");
			click(driver,FieldSort);
			wait(driver,"1");
			click(driver,sortBy1);
			verifyElementIsPresent(driver,sortByDropdownExpand);
			List<WebElement> SortByValues1=getWebElements(driver,sortByValues1);
	        SortByValuesCount=SortByValues1.size();
	    	if(SortByValuesCount>3) {
				passReport(driver,"All values should display in the sortBy field for Fieldsort condition","All values displayed in the sortBy field for Fieldsort condition");
	    	}else {
				failReport(driver,"All values should display in the sortBy field for Fieldsort condition","Only X and Y value displayed in the sortBy field for Fieldsort condition");
	    	}
		    
	    	String defaultCategoricalSelect=getText1(driver,Cate_agg_fieldSortValue);
	    	if(defaultCategoricalSelect.equals("Count")) {
				passReport(driver,"'Count' should be selected as default for Categorical in Field sort ","'Count' is selected as default for Categorical in Field sort ");
	    	}else {
				failReport(driver,"'Count' should be selected as default for Categorical in Field sort ","'"+defaultCategoricalSelect+"' is selected as default for Categorical in Field sort ");
	    	}
			
	    	click(driver,Cat_agg_fieldSort);
	    	
	    	 if(isDisplayed2(driver,sumDisabledFieldsortCate)) {
	 			passReport(driver,"Sum should be disabled for Categorical value in Field sort ","Sum disabled for Categorical value in Field sort");
	         }else {
	      	    failReport(driver,"Sum should be disabled for Categorical value in Field sort ","Sum  enabled for Categorical value in Field sort");
	         }
	         
	         if(isDisplayed2(driver,AvgDisabledFieldsortCate)) {
	 			passReport(driver,"Average should be disabled for Categorical value in Field sort ","Average disabled for Categorical value in Field sort");
	         }else {
	      	    failReport(driver,"Average should be disabled for Categorical value in Field sort ","Average  enabled for Categorical value Field sort");
	         }
	         
	         if(isDisplayed2(driver,minDisabledFieldsortCate)) {
	 			passReport(driver,"Minimum should be disabled for Categorical value in Field sort  ","Minimum disabled for Categorical value in Field sort");
	         }else {
	      	    failReport(driver,"Minimum should be disabled for Categorical value in Field sort ","Minimum enabled for Categorical value in Field sort");
	         }
	         
	         if(isDisplayed2(driver,maxDisabledFieldsortCate)) {
	 			passReport(driver,"Maximum should be disabled for Categorical value in Field sort","Maximum disabled for Categorical value in Field sort");
	         }else {
	      	    failReport(driver,"Maximum should be disabled for Categorical value in Field sort ","Maximum enabled for Categorical value in Field sort");
	         }
	         
	         if(!isDisplayed2(driver,uniqueDisabledFieldsortCate)) {
	 			passReport(driver,"Unique should be enabled for Categorical value in Field sort ","Unique enabled for Categorical value in Field sort");
	         }else {
	      	    failReport(driver,"Unique should be enabled for Categorical value in Field sort ","Unique  disabled for Categorical value in Field sort");
	         }
	         
	         if(!isDisplayed2(driver,countDisabledFieldsortCate)) {
	 			passReport(driver,"Count should be enabled for Categorical value in Field sort ","Count enabled for Categorical value in Field sort");
	         }else {
	      	    failReport(driver,"Count should be enabled for Categorical value in Field sort ","Count  disabled for Categorical value in Field  sort");
	         } 
	    	
			 act.sendKeys(Keys.ESCAPE).build().perform();
	
			 String defaultNumericalSelect=getText1(driver,Num_agg_fieldSortValue);
		    	if(defaultNumericalSelect.equals("Sum")) {
					passReport(driver,"'Sum' should be selected as default for Numerical in Field sort ","'Sum' is selected as default for Numerical in Field sort ");
		    	}else {
					failReport(driver,"'Sum' should be selected as default for Numerical in Field sort ","'"+defaultNumericalSelect+"' is selected as default for Numerical in Field sort ");
		    	}
				
		    click3(driver,Num_agg_fieldSort);
		    	
		    if(!isDisplayed2(driver,sumDisabledFieldsortNum)) {
				passReport(driver,"Sum should be enabled for Numerical value in Field sort ","Sum enabled for Numerical value in Field sort");
	        }else {
	     	    failReport(driver,"Sum should be enabled for Numerical value in Field sort ","Sum  disabled for Numerical value in Field sort");
	        }
	        
	        if(!isDisplayed2(driver,AvgDisabledFieldsortNum)) {
				passReport(driver,"Average should be enabled for Numerical value in Field sort ","Average enabled for Numerical value in Field sort ");
	        }else {
	     	    failReport(driver,"Average should be enabled for Numerical value in Field sort ","Average disabled for Numerical value in Field sort ");
	        }
	        
	        if(!isDisplayed2(driver,minDisabledFieldsortNum)) {
				passReport(driver,"Minimum should be enabled for Numerical value in Field sort","Minimum enabled for Numerical value in Field sort");
	        }else {
	     	    failReport(driver,"Minimum should be enabled for Numerical value in Field sort ","Minimum disabled for Numerical value in Field sort");
	        }
	        
	        if(!isDisplayed2(driver,maxDisabledFieldsortNum)) {
				passReport(driver,"Maximum should be enabled for Numerical value in Field sort","Maximum enabled for Numerical value in Field sort");
	        }else {
	     	    failReport(driver,"Maximum should be enabled for Numerical value in Field sort ","Maximum disabled for Numerical value in Field sort ");
	        }
	        
	        if(!isDisplayed2(driver,uniqueDisabledFieldsortNum)) {
				passReport(driver,"Unique should be enabled for Numerical value in Field sort","Unique enabled for Numerical value in Field sort");
	        }else {
	     	    failReport(driver,"Unique should be enabled for Numerical value in Field sort ","Unique  disabled for Numerical value in Field sort");
	        }
	        
	        if(!isDisplayed2(driver,countDisabledFieldsortNum)) {
				passReport(driver,"Count should be enabled for Numerical value in Field sort ","Count enabled for Numerical value in Field sort");
	        }else {
	     	    failReport(driver,"Count should be enabled for Numerical value Field sort ","Count  disabled for Numerical value in Field sort");
	        }	
		    	
			 act.sendKeys(Keys.ESCAPE).build().perform();
	
			mouseOverAndClick(driver,sortType);
			click3(driver,QuickSort);
					
			String QuickSortByText=getText1(driver,quickSortBytext);
			mouseOverAndClick(driver,ApplyButton);
	
			verifyElementIsPresent(driver,Chart);
			List<WebElement> moveElements=driver.findElements(By.xpath("//*[name()='tspan']"));
			for(WebElement ele:moveElements) {
				Actions act3=new Actions(driver);
				act3.moveToElement(ele).build().perform();
			}
			
	        String Y_Selected=getText1(driver,Y_SelectedValue);
	        String X_Selected=getText1(driver,X_SelectedValue);
	       
	        int Y_number=getNumber(Y_Selected);
	        String Y_SelectedString=getStringValue(Y_Selected);
	        int X_number=getNumber(X_Selected);
	        String X_SelectedString=getStringValue(X_Selected);
	         
	        String Y_chartvalue=getText1(driver,Y_Value);
	        if(Y_chartvalue.equals(Y_SelectedString)) {
				passReport(driver,"Selected Y-Axis value Should display in Y-Axis in the chart : "+Y_SelectedString,"Selected Y-Axis value displayed in Y-Axis in the chart : "+Y_chartvalue);
	        }else {
	     	    failReport(driver,"Selected Y-Axis value Should display in Y-Axis in the chart : "+Y_SelectedString ,"Selected Y-Axis value not displayed in Y-Axis in the chart ");
	        }
	        
	        String X_chartvaluefull=getText1(driver,X_Value);
	        int startIndex = X_chartvaluefull.indexOf('(') + 1;
	        int endIndex = X_chartvaluefull.indexOf(')');
	        String X_chartvalue = X_chartvaluefull.substring(startIndex, endIndex);
	        
	        if(X_chartvalue.equals(X_SelectedString)) {
				passReport(driver,"Selected X-Axis value Should display in X-Axis in the chart : "+X_SelectedString,"Selected X-Axis value displayed in X-Axis in the chart : "+X_chartvalue);
	        }else {
	     	    failReport(driver,"Selected X-Axis value Should display in X-Axis in the chart : "+X_SelectedString ,"Selected X-Axis not displayed in X-Axis in the chart ");
	        }
	        
	        mouseOverAndClick(driver,ApplyButton);
			verifyElementIsPresent(driver,Chart);
	        if(isDisplayed(driver,minimize)) {
	        	click3(driver,minimize);
	        	wait(driver,"2");
	        }
	        mouseOverToElement(driver,DashProPage);
	    	wait(driver,"2");
	
	        List<WebElement> charts=getWebElements(driver,chartBars);
	        int chartCount=charts.size();
	        if(chartCount==Y_number) {
				passReport(driver,"For Show results 'All', Should display "+Y_number +" bar values in charts ","For Show results 'All', displayed "+chartCount +" bar values in charts ");
	        }else {
	     	    failReport(driver,"For Show results 'All', Should display "+Y_number +" bar values in charts ","For Show results 'All', not displayed "+Y_number +" bar values in charts, result: "+chartCount);
	        }
	        
	        graphOrderValidation(driver,charts,QuickSortByText);
	        
	        String sortValueBefore=getAttribute1(driver,AscDes,"value");
	        click3(driver,AscDescButton);
	        String sortValueAfter=getAttribute1(driver,AscDes,"value");
	        if(sortValueBefore.equals(sortValueAfter)) {
	     	    failReport(driver,"Ascending Descending button should works properly","Ascending Descending button not works properly");
	        }else {
	     	    passReport(driver,"Ascending Descending button should works properly","Ascending Descending button not works properly");
	        }
	        QuickSortByText=getText1(driver,quickSortBytext);
	        mouseOverAndClick(driver,ApplyButton);
	        wait(driver,"1");
			verifyElementIsPresent(driver,Chart);
			 if(isDisplayed(driver,minimize)) {
		        	mouseOverAndClick(driver,minimize);
		        	wait(driver,"1");
		       }
			 mouseOverToElement(driver,DashProPage);
		     wait(driver,"2");
	
			 
			List<WebElement> charts1=getWebElements(driver,chartBars);
		      
			graphOrderValidation(driver,charts1,QuickSortByText);
	        
		    click3(driver,sortBy);  
		    click(driver,xvalueQuicksortBy);
			mouseOverAndClick(driver,ApplyButton);
			wait(driver,"1");
			verifyElementIsPresent(driver,Chart); 
			QuickSortByText=getText1(driver,quickSortBytext);
			 if(isDisplayed(driver,minimize)) {
		        	mouseOverAndClick(driver,minimize);
		        	wait(driver,"1");
		       }
			 mouseOverToElement(driver,DashProPage);
		    wait(driver,"2");
	
			List<WebElement> charts2=getWebElements(driver,chartBars);
			
			graphOrderValidation(driver,charts2,QuickSortByText);
		        
	        click3(driver,AscDescButton);
	        QuickSortByText=getText1(driver,quickSortBytext);
	        mouseOverAndClick(driver,ApplyButton);
			wait(driver,"1");
	        verifyElementIsPresent(driver,Chart); 
	        if(isDisplayed(driver,minimize)) {
	        	mouseOverAndClick(driver,minimize);
	        	wait(driver,"1");
	       }
	        mouseOverToElement(driver,DashProPage);
	    	wait(driver,"2");
	
	        List<WebElement> charts3=getWebElements(driver,chartBars);
	       
			graphOrderValidation(driver,charts3,QuickSortByText);
	
		        
		    click3(driver,showResult);
	        click3(driver,Limit);
	        
			verifyElementIsPresent(driver,showRecordType);
			verifyElementIsPresent(driver,Top1);
			verifyElementIsPresent(driver,Bottom1);
			verifyElementIsPresent(driver,limitInput);
	
			String defaultRecordType=defaultSelectedValue(driver,showRecordType);
			if(defaultRecordType.equals("Top")) {
				passReport(driver,"ShowRecordType should display the default value as, 'Top' ","ShowRecordType displayed the default value as, "+defaultRecordType);
			}else {
				passReport(driver,"ShowRecordType should display the default value as, 'Top' ","ShowRecordType displayed the default value as, "+defaultRecordType);
			}
	        
			click3(driver,limitInput);
	        act.sendKeys(Keys.BACK_SPACE).build().perform();
	        act.sendKeys(Keys.BACK_SPACE).build().perform();
		    wait(driver,"1");
		    mouseOverAndClick(driver,ApplyButton);
			if(verifyElementIsPresent1(driver,Limit_Error)) {
				passReport(driver,"'Kindly provide the limit', Error should Display When limit not Given ","'Kindly provide the limit', Error Displayed When limit not Given");
			}else {
				failReport(driver,"'Kindly provide the limit', Error should Display When limit not Given","'Kindly provide the limit', Error not Displayed When limit not Given");
			}
		    wait(driver,"1");
			sendKeys(driver,limitInput,limitValue);
			wait(driver,"1");
			mouseOverAndClick(driver,ApplyButton);
			wait(driver,"1");
			verifyElementIsPresent(driver,Chart);  
			 if(isDisplayed(driver,minimize)) {
		        	mouseOverAndClick(driver,minimize);
		        	wait(driver,"1");
		       }
		        mouseOverToElement(driver,DashProPage);
		    	wait(driver,"2");
	
			List<WebElement> chartsLimit=getWebElements(driver,chartBars);
			String chartSiz= String.valueOf(chartsLimit.size());
		    if(chartSiz.equals(limitValue)) {
				passReport(driver,"The chart should  display according to limit selected","The chart displayed according to limit selected");
		    }else {
				failReport(driver,"The chart should  display according to limit selected","The chart not displayed according to limit selected");
		    }
			 
		    
	    	click(driver,Y_Axis_dropdown);
	    	if(isDisplayed(driver,selectDateValue)) {
			    String dateTypeText=getText1(driver,selectDateValue);
	    	    click(driver,selectDateValue);
				verifyElementIsPresent(driver,groupDropdown);
				verifyElementIsPresent(driver,GroupText);
		        String Grouptext_Act=getText1(driver,GroupText);
		        textValidation(driver,GroupText_Exp,Grouptext_Act,GroupText);
		        click(driver,groupDropdown);
				verifyElementIsPresent(driver,GroupDropdownExpand);
				click(driver,yearMonthDate);
				wait(driver,"1");
				if(isDisplayed2(driver,GroupDropdownExpand)) {
					 failReport(driver,"Group dropdown Should Close after Selecting value ","Group dropdown not Closed after Selecting value ");
				}else {
					passReport(driver,"Group dropdown Should Close after Selecting value ","Group dropdown Closed after Selecting value ");
				}
				
		        String selectedGrouptextAct=getText1(driver,groupDropdown);
				click(driver,groupDropdown);
				waitForElement(driver,GroupDropdownExpand);
		        mouseOverToElement(driver,yearMonth);
				String selectedColorActGroup=getTextBackgroundColor(driver,ListSelected);
				String highlightTextgroup=getText1(driver,ListSelected);
		
				if((selectedGrouptextAct.equals(highlightTextgroup))&&SelectedTextColorExp.equals(selectedColorActGroup)) {
					 passReport(driver,"Selected Value ("+selectedGrouptextAct+") Should Highlight in Grey("+SelectedTextColorExp+") Color","Selected Value ("+highlightTextgroup+") Should Highlight in Grey("+selectedColorActGroup+") Color");
				}else {
		   	    failReport(driver,"Selected Value ("+selectedGrouptextAct+") Should Highlight in Grey("+SelectedTextColorExp+") Color",highlightTextgroup+" Value Highlighted in "+selectedColorActGroup+"Color");
				}
				act.sendKeys(Keys.ESCAPE).build().perform();
				
				click(driver,showResult);
		        click(driver,All);
				wait(driver,"1");
				mouseOverAndClick(driver,ApplyButton);
				click3(driver,ApplyButton);
				wait(driver,"1");
				verifyElementIsPresent(driver,Chart); 
				QuickSortByText=getText1(driver,quickSortBytext);
				 if(isDisplayed(driver,minimize)) {
			        	mouseOverAndClick(driver,minimize);
			        	wait(driver,"1");
			       }
				 mouseOverToElement(driver,DashProPage);
				 wait(driver,"2");
				List<WebElement> DateChart=getWebElements(driver,chartBars);
		      
				graphOrderValidation(driver,DateChart,QuickSortByText);
				
		        click3(driver,AscDescButton);
		        mouseOverAndClick(driver,ApplyButton);
				wait(driver,"1");
		        verifyElementIsPresent(driver,Chart); 
		        
		        List<WebElement> moveElements1=driver.findElements(By.xpath("//*[name()='tspan']"));
				for(WebElement ele:moveElements1) {
					Actions act3=new Actions(driver);
					act3.moveToElement(ele).build().perform();
				}
		        
				String Y_chartvalue1=getText1(driver,Y_Value);
		        if(Y_chartvalue1.equals(dateTypeText)) {
					passReport(driver,"Date Should display in Y-Axis in the chart ","Date displayed in Y-Axis in the chart ");
		        }else {
		     	    failReport(driver,"Date Should display in Y-Axis in the chart  ","Date not displayed in Y-Axis in the chart ");
		        }
				
		        if(isDisplayed(driver,minimize)) {
		        	mouseOverAndClick(driver,minimize);
		        	wait(driver,"1");
		        }
	        	mouseOverToElement(driver,DashProPage);
		    	wait(driver,"2");
		        
		        List<WebElement> DateChart1=getWebElements(driver,chartBars);
				
				graphOrderValidation(driver,DateChart1,QuickSortByText);    
			        
	    	}else {
	    		act.sendKeys(Keys.ESCAPE).build().perform();
	    	}
		    	
		    click(driver,sortType);
	        click(driver,FieldSort);
	        
	        mouseOverAndClick(driver,ApplyButton);
	        
	        if(verifyElementIsPresent1(driver,sortError)) {
				passReport(driver,"'Kindly select any column to perform sort', Error should Display When sortBy not selected ","'Kindly select any column to perform sort', Error Displayed When sortBy not selected");
	        }else {
				failReport(driver,"'Kindly select any column to perform sort', Error should Display When sortBy not selected","'Kindly select any column to perform sort', Error not Displayed When sort not selected");
	        }
		    
	        click(driver,sortType);
	        click(driver,QuickSort);
	        
	        //**********Axes Validation End ***************
		
		   // *********** AxisTitle Validation Start *************
	        
	        verifyElementIsPresent(driver, AxisTitle);
			 click(driver,AxisTitle);
			 wait(driver,"1");
			 String AxisExpand=getAttribute1(driver,AxisTitleExpand,"class");
	     	 if(AxisExpand.contains("up")) {
				passReport(driver,"Axis Title Should Expand" ,"Axis Title is Expanded");
	     	 }else {
	     	    failReport(driver,"Axis Title Should Expand","Axis Title not Expand");
	     	    
	     	 }
	        
	     	String AxisTextColor_Act=getTextColor(driver,AxisTitleExpand);
	     	colorValidation(driver,AxisTextColorExp,AxisTextColor_Act,AxisTitle);
	     	
	     	if(verifyElementIsPresent1(driver,X_Title_text)) {
	     		String X_Title_Act=getText1(driver,X_Title_text);
	    		textValidation(driver,X_Title_Exp,X_Title_Act,X_Title_text);
	     	}
	     	 
	     	verifyElementIsPresent1(driver,X_Title_input);

	     	if(verifyElementIsPresent1(driver,Y_Title_text)) {
	     		String Y_Title_Act=getText1(driver,Y_Title_text);
	    		textValidation(driver,Y_Title_Exp,Y_Title_Act,Y_Title_text);
	     	}
	     	
	     	verifyElementIsPresent1(driver,Y_Title_input);
	     
	     	if(verifyElementIsPresent1(driver,fontFamilyText)){
	     		String FontFamily_Act=getText1(driver,fontFamilyText);
	    		textValidation(driver,FontFamily_Exp,FontFamily_Act,fontFamilyText);
	     	}
	     	
	     	if(verifyElementIsPresent1(driver,fontFamily_dropdown)) {
	     		
	     		String fontFamily_Value=getText1(driver,fontFamily_dropdown);
	     		System.out.println("FontFamily_Value : "+fontFamily_Value);
	     		if(fontFamily_Value.equals(default_FontFamily)) {
	    			passReport(driver,"By default, "+default_FontFamily+" should display in the Font Family input" ,"By default, "+fontFamily_Value+" displayed in the Font Family input");
	     		}else {
	         	    failReport(driver,"By default, "+default_FontFamily+" should display in the Font Family input","By default, "+fontFamily_Value+" displayed in the Font Family input");
	     		}
	     	}
	     	
	     	if(verifyElementIsPresent1(driver,titleFontSize)){
	     		String TitleFontSize_txt_Act=getText1(driver,titleFontSize);
	    		textValidation(driver,Title_font_txt_Exp,TitleFontSize_txt_Act,titleFontSize);
	     	}
	     	
	     	if(verifyElementIsPresent1(driver,titleFontSizeDropdown)) {
	     		
	     		String font_Size_Act=defaultSelectedValue(driver,titleFontSizeDropdown);
	     		System.out.println("Font_Size : "+font_Size_Act);
	     		if(font_Size_Act.equals(default_FontSize_Exp)) {
	    			passReport(driver,"By default, "+default_FontSize_Exp+" should display in the Font Size input" ,"By default, "+font_Size_Act+" displayed in the Font Size input");
	     		}else {
	         	    failReport(driver,"By default, "+default_FontSize_Exp+" should display in the Font Size input","By default, "+font_Size_Act+" displayed in the Font Size input");
	     		}
	     	}
	     	
	     	if(verifyElementIsPresent1(driver,X_axisFontSizeText)){
	     		String X_FontSize_txt_Act=getText1(driver,X_axisFontSizeText);
	    		textValidation(driver,X_FontSize_txt_Exp,X_FontSize_txt_Act,X_axisFontSizeText);
	     	}
	     	
	     	if(verifyElementIsPresent1(driver,X_axisFontSizeDropdown)) {
	     		
	     		String X_font_Size_Act=defaultSelectedValue(driver,X_axisFontSizeDropdown);
	     		System.out.println("X Font_Size : "+X_font_Size_Act);
	     		if(X_font_Size_Act.equals(default_FontSize_Exp)) {
	    			passReport(driver,"By default, "+default_FontSize_Exp+" should display in the X axis Font Size input" ,"By default, "+X_font_Size_Act+" displayed in the X axis Font Size input");
	     		}else {
	         	    failReport(driver,"By default, "+default_FontSize_Exp+" should display in the X axis Font Size input","By default, "+X_font_Size_Act+" displayed in the X axis Font Size input");
	     		}
	     	}
	     	
	     	if(verifyElementIsPresent1(driver,Y_axisFontSizeText)){
	     		String Y_FontSize_txt_Act=getText1(driver,Y_axisFontSizeText);
	    		textValidation(driver,Y_FontSize_txt_Exp,Y_FontSize_txt_Act,Y_axisFontSizeText);
	     	}
	     	
	     	if(verifyElementIsPresent1(driver,Y_axisFontSizeDropdown)) {
	     		
	     		String Y_font_Size_Act=defaultSelectedValue(driver,Y_axisFontSizeDropdown);
	     		System.out.println("Y Font_Size : "+Y_font_Size_Act);
	     		if(Y_font_Size_Act.equals(default_FontSize_Exp)) {
	    			passReport(driver,"By default, "+default_FontSize_Exp+" should display in the Y axis Font Size input" ,"By default, "+Y_font_Size_Act+" displayed in the Y axis Font Size input");
	     		}else {
	         	    failReport(driver,"By default, "+default_FontSize_Exp+" should display in the Y axis Font Size input","By default, "+Y_font_Size_Act+" displayed in the Y axis Font Size input");
	     		}
	     	}
	     	
	     	if(verifyElementIsPresent1(driver,X_RotationText)){
	     		String X_Rotation_txt_Act=getText1(driver,X_RotationText);
	    		textValidation(driver,X_Rotation_txt_Exp,X_Rotation_txt_Act,X_RotationText);
	     	}
	     	
	     	if(verifyElementIsPresent1(driver,X_RotationOutputValue)){
	     		String X_RotationValueAct=getText1(driver,X_RotationOutputValue);
	     		System.out.println("X rotation : "+X_RotationValueAct);
	     		if(X_RotationValueAct.equals(defaultRotation)) {
	    			passReport(driver,"By default, '"+defaultRotation+"' should display in the X axis Rotation output field","By default, '"+X_RotationValueAct+"' displayed in the X axis Rotation output field");
	     		}else {
	         	    failReport(driver,"By default, '"+defaultRotation+"' should display in the X axis Rotation output field","By default, '"+X_RotationValueAct+"' displayed in the X axis Rotation output field");
	     		}
	    		String X_Rotation_Color_Act=getTextBackgroundColor(driver,X_RotationOutputValue);
	    		colorValidation(driver,RotationInputColor_Exp,X_Rotation_Color_Act,X_RotationOutputValue);
	     	}
	     	
	     	if(verifyElementIsPresent1(driver,Y_RotationText)){
	     		String Y_Rotation_txt_Act=getText1(driver,Y_RotationText);
	    		textValidation(driver,Y_Rotation_txt_Exp,Y_Rotation_txt_Act,Y_RotationText);
	     	}
	     	
	     	if(verifyElementIsPresent1(driver,Y_RotationOutputValue)) {
	     		String Y_RotationValueAct=getText1(driver,Y_RotationOutputValue);
	     		System.out.println("Y rotation : "+Y_RotationValueAct);
	     		if(Y_RotationValueAct.equals(defaultRotation)) {
	    			passReport(driver,"By default, '"+defaultRotation+"' should display in the Y axis Rotation output field","By default, '"+Y_RotationValueAct+"' displayed in the Y axis Rotation output field");
	     		}else {
	         	    failReport(driver,"By default, '"+defaultRotation+"' should display in the Y axis Rotation output field","By default, '"+Y_RotationValueAct+"' displayed in the Y axis Rotation output field");
	     		}
	    		String Y_Rotation_Color_Act=getTextBackgroundColor(driver,Y_RotationOutputValue);
	    		colorValidation(driver,RotationInputColor_Exp,Y_Rotation_Color_Act,Y_RotationOutputValue);
	     	}
	     	
	     	
	     	clearAndType(driver,X_Title_input,X_Title_new);
	     	wait(driver,"1");
	     	clearAndType(driver,Y_Title_input,Y_Title_new);
	     	wait(driver,"1");
	     	click3(driver,ApplyButton);
			mouseOverAndClick(driver,ApplyButton);
	     	wait(driver,"1");
			waitForElement(driver,Chart);
			wait(driver,"1");
			List<WebElement>  moveElements1=driver.findElements(By.xpath("//*[name()='tspan']"));
				for(WebElement ele:moveElements1) {
					Actions act3=new Actions(driver);
					act3.moveToElement(ele).build().perform();
				}
				
			String Y_ChartText=getText1(driver,Y_Value);
			String X_ChartText=getText1(driver,X_Value);
		    
	     	if(Y_ChartText.equals(Y_Title_new)) {
	        	passReport(driver,"Given Y Title ("+Y_Title_new+") input value should display in the Y Axis chart" ,"Given Y Title ("+Y_ChartText+") input value displayed in the Y Axis chart");
	     	}else {
	        	failReport(driver,"Given Y Title ("+Y_Title_new+") input value should display in the Y Axis chart" ,"Y Title ("+Y_ChartText+") input value displayed in the Y Axis chart");
	     	}
	        
	     	if(X_ChartText.equals(X_Title_new)) {
	        	passReport(driver,"Given X Title ("+X_Title_new+") input value should display in the X Axis chart" ,"Given X Title ("+X_ChartText+") input value displayed in the X Axis chart");
	     	}else {
	        	failReport(driver,"Given X Title ("+X_Title_new+") input value should display in the X Axis chart" ,"X Title ("+X_ChartText+") input value displayed in the X Axis chart");
	     	}
	        
	     	String fontFamily_Value=getText1(driver,fontFamily_dropdown);
	     	click(driver,fontFamily_dropdown);
	     	
	     	if(verifyElementIsPresent1(driver,fontFamily_DropdownExpand)) {
	        	passReport(driver,"Font family dropdown should expand" ,"Font family dropdown expanded");
	        	mouseOverToElement(driver,SecondValue);
	        	wait(driver,"1");
	    		String mouseHighlightColor=getTextBackgroundColor(driver,SecondValue);
	    		colorValidation(driver,Highlight_Color_Exp,mouseHighlightColor,"HighlightText>*");

	    		String selectedColorAct2=getTextBackgroundColor(driver,ListSelected);
	    		String highlightText2=getText1(driver,listSelectedText1);
	    		if((fontFamily_Value.equals(highlightText2))&&Selected_Color_Exp.equals(selectedColorAct2)) {
	    			 passReport(driver,"Selected Value ("+fontFamily_Value+") Should Highlight in Grey("+Selected_Color_Exp+") Color","Selected Value ("+highlightText2+") Highlighted in Grey("+selectedColorAct2+") Color");
	    		}else {
	         	    failReport(driver,"Selected Value ("+fontFamily_Value+") Should Highlight in Grey("+Selected_Color_Exp+") Color",highlightText2+" Value Highlighted in "+selectedColorAct2+" Color");
	    		}
	    		
	         	ScrollBarValidation(driver,fontFamily_DropdownExpand,HighlightedFontFamily,"Font Family");
	         	
	         	List<WebElement> beforeSearchResults=getWebElements(driver,fontFamilyResults);
	         	int beforeSearchSize=beforeSearchResults.size();
	         	click(driver,dropdownInputsearchBox);
	         	sendKeys(driver,dropdownInputsearchBox,ChangeFontFamily);
	         	List<WebElement> afterSearchResults=getWebElements(driver,fontFamilyResults);
	         	int afterSearchSize=afterSearchResults.size();
	            String resultText=getText1(driver,fontFamilyFirstResult);
	            if((beforeSearchSize>afterSearchSize)&&resultText.equals(ChangeFontFamily)) {
	   			 passReport(driver,"Search input in the Font Family dropdown should works properly","Search input in the Font Family dropdown works properly");
	            }else {
	         	    failReport(driver,"Search input in the Font Family dropdown should works properly","Search input in the Font Family dropdown not works properly");
	            }
	         	
	           	selectFontFamily(driver,ChangeFontFamily);
	           	wait(driver,"1");
	    		mouseOverAndClick(driver,ApplyButton);
	         	wait(driver,"1");
	           	waitForElement(driver,Chart);
	    	    moveElements1=driver.findElements(By.xpath("//*[name()='tspan']"));
	    			for(WebElement ele:moveElements1) {
	    				Actions act3=new Actions(driver);
	    				act3.moveToElement(ele).build().perform();
	    			}
	    		String fontFamily_Y_Act=getFontFamily(driver,Y_Value);
	    		if(fontFamily_Y_Act.equals(ChangeFontFamily)) {
	   			       passReport(driver,"Selected fontFamily ("+ChangeFontFamily+") Should Update in Y Axis chart value","Selected fontFamily ("+fontFamily_Y_Act+") Updated in Y Axis chart value");
	    		}else {
	         	    failReport(driver,"Selected fontFamily ("+ChangeFontFamily+") Should Update in Y Axis chart value","FontFamily ("+fontFamily_Y_Act+") Updated in Y Axis chart value");
	    		}
	           	
	         	
	        }else {
	     	    failReport(driver,"Font family dropdown should expand","Font family dropdown not expanded");
	     	    Assert.fail();
	        }
	     	
			click(driver,titleFontSizeDropdown);
			selectOptionValue(driver,titleFontSizeDropdown,ChangeTotalFontSize);
			wait(driver,"1");
			mouseOverAndClick(driver,ApplyButton);
	     	wait(driver,"1");
	       	waitForElement(driver,Chart);
		    moveElements1=driver.findElements(By.xpath("//*[name()='tspan']"));
				for(WebElement ele:moveElements1) {
					Actions act3=new Actions(driver);
					act3.moveToElement(ele).build().perform();
				}
				
			String fontSize_Y_Act=getFontSize(driver,Y_Value);
			String fontSize_X_Act=getFontSize(driver,X_Value);
			if((ChangeTotalFontSize.equals(fontSize_Y_Act))&&ChangeTotalFontSize.equals(fontSize_X_Act)) {
				passReport(driver,"Selected fontSize ("+ChangeTotalFontSize+") Should Update in X and Y Axis title chart value","FontFamily Updated in X-Axis Title ("+fontSize_X_Act+") and Y-Axis Title("+fontSize_Y_Act+") chart value");
			}else {
				failReport(driver,"Selected fontSize ("+ChangeTotalFontSize+") Should Update in X and Y Axis title chart value","FontFamily Updated in X-Axis Title ("+fontSize_X_Act+") and Y-Axis Title("+fontSize_Y_Act+") chart value");
			}
			
			click(driver,X_axisFontSizeDropdown);
			selectOptionValue(driver,X_axisFontSizeDropdown,change_X_label_FontSize);
			wait(driver,"1");
			mouseOverAndClick(driver,ApplyButton);
	     	wait(driver,"1");
	       	waitForElement(driver,Chart);
	       	
	       	String fontSize_X_label_Act=getFontSize(driver,X_AxisLabel_chart);
	       	if(change_X_label_FontSize.equals(fontSize_X_label_Act)) {
			    passReport(driver,"Selected fontSize ("+change_X_label_FontSize+") Should Update in X Axis label chart value","Selected fontSize ("+fontSize_X_label_Act+") Updated in X Axis label chart value");
			}else {
	  	       failReport(driver,"Selected fontSize ("+change_X_label_FontSize+") Should Update in X Axis label chart value","FontFamily ("+fontSize_X_label_Act+") Updated in X Axis label chart value");
			}
		
	       	click(driver,Y_axisFontSizeDropdown);
			selectOptionValue(driver,Y_axisFontSizeDropdown,change_Y_label_FontSize);
			wait(driver,"1");
			mouseOverAndClick(driver,ApplyButton);
	     	wait(driver,"1");
	       	waitForElement(driver,Chart);
	       	String fontSize_Y_label_Act=getFontSize(driver,Y_AxisLabel_chart);
	    	if(change_Y_label_FontSize.equals(fontSize_Y_label_Act)) {
			    passReport(driver,"Selected fontSize ("+change_Y_label_FontSize+") Should Update in Y Axis label chart value","Selected fontSize ("+fontSize_Y_label_Act+") Updated in Y Axis label chart value");
			}else {
	  	       failReport(driver,"Selected fontSize ("+change_Y_label_FontSize+") Should Update in Y Axis label chart value","FontSize ("+fontSize_Y_label_Act+") Updated in Y Axis label chart value");
			}
	    	
	     	wait(driver,"1");
	     	moveSlider(driver,X_RotationInputSlider,X_RotationOutputValue,X_Rotation_Input);
	     	wait(driver,"1");
			mouseOverAndClick(driver,ApplyButton);
	     	wait(driver,"1");
	       	waitForElement(driver,Chart);
	     	
	       	String X_label_Rotation_Act=getRotationValue(driver,X_AxisLabel_chart);
	       	if(X_Rotation_Input.equals(X_label_Rotation_Act)) {
			    passReport(driver,"Selected Rotation Angle ("+X_Rotation_Input+") Should Update in X Axis label chart value","Selected Rotation Angle ("+X_label_Rotation_Act+") Updated in X Axis label chart value");
			}else {
	  	       failReport(driver,"Selected Rotation Angle ("+X_Rotation_Input+") Should Update in X Axis label chart value","Rotation Angle ("+X_label_Rotation_Act+") Updated in X Axis label chart value");
			}
	    	
	       	wait(driver,"1");
	     	moveSlider(driver,Y_RotationInputSlider,Y_RotationOutputValue,Y_Rotation_Input);
	     	wait(driver,"1");
			mouseOverAndClick(driver,ApplyButton);
	     	wait(driver,"1");
	       	waitForElement(driver,Chart);
	     	
	       	String Y_label_Rotation_Act=getRotationValue(driver,Y_AxisLabel_chart);
	       	if(Y_Rotation_Input.equals(Y_label_Rotation_Act)) {
			    passReport(driver,"Selected Rotation Angle ("+Y_Rotation_Input+") Should Update in Y Axis label chart value","Selected Rotation Angle ("+Y_label_Rotation_Act+") Updated in Y Axis label chart value");
			}else {
	  	       failReport(driver,"Selected Rotation Angle ("+Y_Rotation_Input+") Should Update in Y Axis label chart value","Rotation Angle ("+Y_label_Rotation_Act+") Updated in Y Axis label chart value");
			}
	       	
	       	if(verifyElementIsPresent1(driver,switchSliderText)){
	     		String SwitchSliderText_Act=getText1(driver,switchSliderText);
	    		textValidation(driver,SwitchSliderText_Exp,SwitchSliderText_Act,switchSliderText);
	     	}
	       	
	       	if(verifyElementIsPresent1(driver,switchSlider)){
	     		String sliderColor=getTextBackgroundColor(driver,switchSlider);
	       	    if(sliderColor.equalsIgnoreCase("#2196F3")) {
	       	       failReport(driver,"By default, start axis at 0 toggle should disabled.","By default, start axis at 0 toggle enabled.");
	       	    }else {
	    	       passReport(driver,"By default, start axis at 0 toggle should disabled.","By default, start axis at 0 toggle disabled.");
	       	    }
	       	    
	       	 if(sliderColor.equalsIgnoreCase("#2196F3")) {
	       		 click(driver,switchSlider);
	       	 }
	       	 
	       	mouseOverAndClick(driver,ApplyButton);
	     	wait(driver,"1");
	       	waitForElement(driver,Chart);
	       	    
	       	if(isDisplayed(driver,minimize)) {
	        	click3(driver,minimize);
	        }
	       	
	       	List<WebElement> yValues=getWebElements(driver,Y_AxisLabel_chart_Full);
	       	int lastsize=yValues.size()-1;
	       	String y_firstDesValue=driver.findElement(By.xpath("(//*[name()='g' and @transform and @aria-label]//*[name()='tspan'])["+lastsize+"]")).getText();
	       	String y_firstAscValue=getText1(driver,Y_AxisLabel_chart_1);
	       	
	       	String sortOrderType=getAttribute1(driver,AscDes,"value");
	        if(sortOrderType.equals("desc")) {
	        	if(!(y_firstAscValue.equals("0"))) {
	    			passReport(driver,"Y axis label value should not start from 0 in the chart when toogle is disabled","Y axis label value not start from 0 in the chart, when toogle is disabled");
	        	}else {
	         	    failReport(driver,"Y axis label value should not start from 0 in the chart when toogle is disabled","Y axis label value started from 0 in the chart when toogle is disabled");
	        	}	
	        }else {
	        	if(!(y_firstDesValue.equals("0"))) {
	    			passReport(driver,"Y axis label value should not start from 0 in the chart when toogle is disabled ","Y axis label value should not start from 0 in the chart when toogle is disabled");
	        	}else {
	         	    failReport(driver,"Y axis label value should not start from 0 in the chart when toogle is disabled","Y axis label value started from 0 in the chart when toogle is disabled");
	        	}
	        	
	        }
	       	
	       	String x_firstAscValue=getText1(driver,X_AxisLabel_chart_1);

	        	if(!(x_firstAscValue.equals("0"))) {
	    			passReport(driver,"X axis label value should not start from 0 in the chart when toogle is disabled","X axis label value started from '"+x_firstAscValue+"' in the chart, when toogle is disabled");
	        	}else {
	         	    failReport(driver,"X axis label value should not start from 0 in the chart when toogle is disabled","X axis label value started from '"+x_firstAscValue+"' in the chart when toogle is disabled");
	        	}	
	        
	        click(driver,switchSlider);
	    	mouseOverAndClick(driver,ApplyButton);
	     	wait(driver,"1");
	       	waitForElement(driver,Chart);
	       	    
	       	if(isDisplayed(driver,minimize)) {
	        	click3(driver,minimize);
	        }
	       	
	        yValues=getWebElements(driver,Y_AxisLabel_chart_Full);
	       	lastsize=yValues.size()-1;
	       	y_firstDesValue=driver.findElement(By.xpath("(//*[name()='g' and @transform and @aria-label]//*[name()='tspan'])["+lastsize+"]")).getText();
	       	y_firstAscValue=getText1(driver,Y_AxisLabel_chart_1);
	       	
	       	if(sortOrderType.equals("desc")) {
	        	if((y_firstAscValue.equals("0"))) {
	    			passReport(driver,"Y axis label value should start from 0 in the Asc chart when toogle is enabled","Y axis label value started from 0 in the Asc chart when toogle is enabled");
	        	}else {
	         	    failReport(driver,"Y axis label value should start from 0 in the Asc chart when toogle is enabled","Y axis label value not started from 0 in the Asc chart when toogle is enabled");
	        	}	
	        }else {
	        	if((y_firstDesValue.equals("0"))) {
	    			passReport(driver,"Y axis label value should start from 0 in the Dsc chart when toogle is enabled ","Y axis label value started from 0 in the chart when toogle is enabled ");
	        	}else {
	         	    failReport(driver,"Y axis label value should start from 0 in the Dsc chart when toogle is enabled ","Y axis label value not started from 0 in the chart when toogle is enabled ");
	        	}
	        	
	        }
	       	
	       	x_firstAscValue=getText1(driver,X_AxisLabel_chart_1);
	       	if((x_firstAscValue.equals("0"))) {
				passReport(driver,"X axis label value should start from 0 in the chart when toogle is enabled ","X axis label value started from 0 in the chart when toogle is enabled ");
	    	}else {
	     	    failReport(driver,"X axis label value should start from 0 in the chart when toogle is enabled ","axis label value not started from 0 in the chart when toogle is enabled ");
	    	}	
	         	
	     	}
	       	
	       	// ******************** AxisTitle Validation End *******************
	       	
	       // ******************** ChartTitle Validation Start *******************
	       	
	        verifyElementIsPresent(driver,chartTitle);
			 click(driver,chartTitle);
			 wait(driver,"1");
			 String CharttitleExpand=getAttribute1(driver,ChartTitleExpand,"class");
	     	 if(CharttitleExpand.contains("up")) {
				passReport(driver,"Chart Title Should Expand" ,"Chart Title is Expanded");
	     	 }else {
	     	    failReport(driver,"Chart Title Should Expand","Chart Title not Expand");
	     	    Assert.fail();
	     	 }
	        
	     	String chartTitleText_Act=getText1(driver,chartTitle);
			textValidation(driver,ChartTitle_text_Exp,chartTitleText_Act,chartTitle);
	     	String chartTitleTextColor_Act=getTextColor(driver,chartTitle);
	     	colorValidation(driver,ChartTitleColorExp,chartTitleTextColor_Act,chartTitle);
	     	
	     	if(verifyElementIsPresent1(driver,BackgroundText)) {
	     		String BackgroundText_Act=getText1(driver,BackgroundText);
	    		textValidation(driver,BackgroundText_Exp,BackgroundText_Act,BackgroundText);
	     	}
	     	
	        if(verifyElementIsPresent1(driver,BackgroundInput)) {

	     		String BackgroundInputText=getTextJavascript(driver,BackgroundInput);
	     		System.out.println("BackgroundInputText : "+BackgroundInputText);
	     		if(BackgroundInputText.equals(DefaultBackgroundColor_Exp)) {
	    			passReport(driver,"By default, "+DefaultBackgroundColor_Exp+" Value should select in the Background Input" ,"By default, '"+BackgroundInputText+"' Value selected in the Background Input");
	     		}else {
	         	    failReport(driver,"By default, "+DefaultBackgroundColor_Exp+" Value should select in the Background Input","By default, '"+BackgroundInputText+"' Value selected in the Background Input");
	     		}
	     	}
			 
	        if(verifyElementIsPresent1(driver,FontColorText)) {
	     		String FontColorText_Act=getText1(driver,FontColorText);
	    		textValidation(driver,FontColorText_Exp,FontColorText_Act,FontColorText);
	     	}
	        

	        if(verifyElementIsPresent1(driver,FontColorInput)) {

	     		String DefaultFontColor_Act=getTextJavascript(driver,FontColorInput);
	     		System.out.println("DefaultFontColor_Act : "+DefaultFontColor_Act);
	     		if(DefaultFontColor_Act.equals(DefaultFontColor_Exp)) {
	    			passReport(driver,"By default, "+DefaultFontColor_Exp+" Value should select in the FontColor Input" ,"By default, '"+DefaultFontColor_Act+"' Value selected in the FontColor Input ");
	     		}else {
	         	    failReport(driver,"By default, "+DefaultFontColor_Exp+" Value should select in the FontColor Input","By default, '"+DefaultFontColor_Act+"' Value selected in the FontColor Input ");
	     		}
	     	}
	        
	        if(verifyElementIsPresent1(driver,ChartFontFamilytext)) {
	     		String ChartFontFamilytext_Act=getText1(driver,ChartFontFamilytext);
	    		textValidation(driver,FontFamily_text_Exp,ChartFontFamilytext_Act,ChartFontFamilytext);
	     	}
	        
	        if(verifyElementIsPresent1(driver,ChartFontFamilyDropdown)) {

	     		String default_FontFamily_Act=getText1(driver,ChartFontFamilyDropdown);
	     		System.out.println("default_FontFamily_Act : "+default_FontFamily_Act);
	     		if(Default_FontFamily.equals(default_FontFamily_Act)) {
	     			passReport(driver,"By default, "+Default_FontFamily+" should selected in the Font Family input" ,"By default, '"+default_FontFamily_Act+"' selected in the Font Family input");
	     		}else {
	         	    failReport(driver,"By default, "+Default_FontFamily+" should selected in the Font Family input","By default, '"+default_FontFamily_Act+"' selected in the Font Family input");
	     		}
	     	}
	        
	        if(verifyElementIsPresent1(driver,ChartFontSizeText)) {
	     		String FontSizeText_Act=getText1(driver,ChartFontSizeText);
	    		textValidation(driver,FontSizeText_Exp,FontSizeText_Act,ChartFontSizeText);
	     	}
	        
	        if(verifyElementIsPresent1(driver,ChartFontSizedDropdown)) {

	     		String defaultFontSize_Act=getTextJavascript(driver,ChartFontSizedDropdown);
	     		System.out.println("defaultFontSize_Act : "+defaultFontSize_Act);
	     		if(default_FontSizeChartTitle_Exp.equals(defaultFontSize_Act)) {
	    			passReport(driver,"By default, '"+default_FontSizeChartTitle_Exp+"' Value should select in the Font Size Input" ,"By default, '"+defaultFontSize_Act+"' Value selected in the Font Size Input");
	     		}else {
	         	    failReport(driver,"By default, '"+default_FontSizeChartTitle_Exp+"' Value should select in the Font Size Input","By default, '"+defaultFontSize_Act+"' Value selected in the Font Size Input");
	     		}
	     	}
	        
	        // Background color Validation End
	        
	        click(driver,BackgroundInput);
	        if(isDisplayed(driver,ColorPickerOpen)) {
				passReport(driver,"The color pickers should opens promptly after clicking text box in background" ,"The color pickers opens promptly after clicking text box in background");
	        }else {
				failReport(driver,"The color pickers should opens promptly after clicking text box in background" ,"The color pickers not opens promptly after clicking text box in background");
	        }
	        
	        click(driver,BackgroundText);
	        wait(driver,"1");
	        if(isDisplayed2(driver,ColorPickerOpen)) {
				failReport(driver,"The color picker Should closes immediately when the user clicks outside its boundaries" ,"The color picker not closes immediately when the user clicks outside its boundaries");
	        }else {
				passReport(driver,"The color picker Should closes immediately when the user clicks outside its boundaries" ,"The color picker closes immediately when the user clicks outside its boundaries");
	        }
	        
	        for (int i=0;i<2;i++) {
	        	click3(driver,BackgroundInput);
	            if(isDisplayed(driver,ColorPickerOpen)) {
	    			passReport(driver,"The color pickers should opens properly for repeated Clicking" ,"The color pickers opens properly for repeated Clicking");
	            }else {
	    			failReport(driver,"The color pickers should opens properly for repeated Clicking" ,"The color pickers not opens properly for repeated Clicking");
	            }
	            click3(driver,BackgroundText);
	            wait(driver,"1");
	            if(isDisplayed2(driver,ColorPickerOpen)) {
	    			failReport(driver,"The color picker Should closes immediately for repeated Clicking" ,"The color picker not closes immediately for repeated Clicking");
	            }else {
	    			passReport(driver,"The color picker Should closes immediately for repeated Clicking" ,"The color picker closes immediately for repeated Clicking");
	            }
	        }
	        
	        
	        WebElement background=getWebElement(driver,BackgroundInput);
	        Actions action=new Actions(driver);
	        action.click(background).build().perform();
	        action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
	        sendKeys(driver,BackgroundInput,TypeBackgroundColor1);
	        click3(driver,BackgroundText);
	        String SelectedBackgroundColor=getTextBackgroundColor(driver, BackgroundInputPointer);
	        String AppliedChartTitleInputColor=getTextBackgroundColor(driver, ChartTitleInput);
	        System.out.println("SelectedBackgroundColor : "+SelectedBackgroundColor+"  ---> AppliedChartTitleInputColor : "+AppliedChartTitleInputColor);

	        if((SelectedBackgroundColor.equalsIgnoreCase(TypeBackgroundColor1))&&AppliedChartTitleInputColor.equalsIgnoreCase(TypeBackgroundColor1)) {
				passReport(driver,"While Manually Enter Color, ("+TypeBackgroundColor1+") Should update in the Background Color input and Chart Title Input" ,"While Manually Enter the Color, "+SelectedBackgroundColor+" updated in the Background Color input and "+AppliedChartTitleInputColor+" updated in the Chart Title Input");
	        }else {
				failReport(driver,"While Manually Enter Color, ("+TypeBackgroundColor1+") Should update in the Background Color input and Chart Title Input" ,"While Manually Enter the Color, "+SelectedBackgroundColor+" updated in the Background Color input and "+AppliedChartTitleInputColor+" updated in the Chart Title Input");
	        }
	        
	        action.click(background).build().perform();
	        action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
	        action.sendKeys(Keys.BACK_SPACE).build().perform();

	        click3(driver,BackgroundText);
	        String ResetBackgroundColor=getTextBackgroundColor(driver, BackgroundInputPointer);
	        String ResetChartTitleInputColor=getTextBackgroundColor(driver, ChartTitleInput);
	        System.out.println("ResetBackgroundColor : "+ResetBackgroundColor+"  ---> ResetChartTitleInputColor : "+ResetChartTitleInputColor);

	        if(ResetBackgroundColor.equals(DefaultBackgroundColor_Exp)) {
				passReport(driver,"After revert all color selections, the color picker should reset to the default color" ,"After revert all color selections, the color picker reset to the default color");
	        }else {
				failReport(driver,"After revert all color selections, the color picker should reset to the default color" ,"After revert all color selections, the color picker not reset to the default color");
	        }
	        
	        if(ResetChartTitleInputColor.equals(DefaultBackgroundColor_Exp)) {
				passReport(driver,"After revert all color selections, the Chart Title Input should reset to the default color" ,"After revert all color selections, the Chart Title Input reset to the default color");
	        }else {
				failReport(driver,"After revert all color selections, the Chart Title Input should reset to the default color" ,"After revert all color selections, the Chart Title Input not reset to the default color");
	        }
	        
	        click(driver,BackgroundInput);
	        waitForElement(driver,ColorPickerOpen);
	        verifyElementIsPresent1(driver,ThemeColor);
	        verifyElementIsPresent1(driver,History);
	        mouseOverToElement(driver,Color1);
	        mouseOverToElement(driver,Color1);
	        String mouseOverColorValue=getTextBackgroundColor(driver, Color1);
	        String mouseOverHistoryColor=getText1(driver,mouseOverColorHistory);
	        System.out.println("mouseOverColorValue : "+mouseOverColorValue+"  ---> mouseOverHistoryColor : "+mouseOverHistoryColor);
	        if(mouseOverColorValue.equals(mouseOverHistoryColor)) {
				passReport(driver,"Mouse over color value should be updated in the history" ,"Mouse over color value updated in the history");
	        }else {
				failReport(driver,"Mouse over color value should be updated in the history" ,"Mouse over color value not updated in the history");
	        }
	        
	        String SelectColorValue=getTextBackgroundColor(driver, Color2);
	        System.out.println("  ---> SelectColorValue : "+SelectColorValue); 
	        click(driver,Color2);
	        wait(driver,"1");
	        if(isDisplayed2(driver,ColorPickerOpen)) {
				failReport(driver,"The color picker Should closes immediately when the user select the color" ,"The color picker not closes immediately when the user select the color");
	        }else {
				passReport(driver,"The color picker Should closes immediately when the user select the color" ,"The color picker closes immediately when the user select the color");
	        }
	        String SelectedColorValue1=getTextJavascript(driver,BackgroundInput);
	 		System.out.println("SelectedColorValue1 : "+SelectedColorValue1);
	 		if(SelectedColorValue1.equals(SelectColorValue)) {
				passReport(driver,"Selected Color "+SelectColorValue+" Should updates in the Background Input","Selected Color "+SelectedColorValue1+" updated in the Background Input");
	 		}else {
				failReport(driver,"Selected Color "+SelectColorValue+" Should updates in the Background Input","Selected Color not updated in the Background Input");
	 		}
	        
	 		 String ChartTitleInputColor1=getTextBackgroundColor(driver, ChartTitleInput);
	         if(ChartTitleInputColor1.equals(SelectColorValue)) {
	 			passReport(driver,"Selected Color "+SelectColorValue+" Should updates in the Chart Title Input" ,"Selected Color "+ChartTitleInputColor1+" updated in the Chart Title Input");
	         }else {
	  			failReport(driver,"Selected Color "+SelectColorValue+" Should updates in the Chart Title Input" ,"Selected Color not updated in the Chart Title Input");
	         }
	 		
	         click3(driver,BackgroundInput);
	         waitForElement(driver,ColorPickerOpen);
	         
	         String SelectedColorHistory=getText1(driver,selectedColorHistory);
	         if(SelectedColorHistory.equals(SelectColorValue)) {
	  			passReport(driver,"Selected Color "+SelectColorValue+" should be updated in the history" ,"Selected Color "+SelectedColorHistory+" updated in the history");
	          }else {
	   			failReport(driver,"Selected Color "+SelectColorValue+" should be updated in the history" ,"Selected Color not updated in the history");
	          }
	         click3(driver,BackgroundText);
	         click3(driver,BackgroundInput);
	         action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
	         sendKeys(driver,BackgroundInput,TypeBackgroundColor1);
	         click3(driver,BackgroundText);
//	      Background color Validation  End
	 		
	         click(driver,SaveBtn_Chart);
	         if(verifyElementIsPresent1(driver,chartSaveError1)) {
	   			passReport(driver,"'Enter Widget Name' error should display When click Save button without giving the value" ,"'Enter Widget Name' error displayed When click Save button without giving the value");
	         }else {
	    		failReport(driver,"'Enter Widget Name' error should display When click Save button without giving the value" ,"'Enter Widget Name' error not displayed When click Save button without giving the value");
	         }
	         
//	      Font color Validation start...
	         
	        sendKeys(driver,ChartTitleInput,ChangeWidgetName);
	        String defaultChartTitletextColor=getTextColor(driver,ChartTitleInput);
	        System.out.println("defaultChartTitletextColor : -> "+defaultChartTitletextColor);
	        if(defaultChartTitletextColor.equalsIgnoreCase(DefaultFontColor_Exp)) {
				passReport(driver,"By Default, '"+DefaultFontColor_Exp+"' Should updated in the Chart Title input text " ,"By Default, '"+defaultChartTitletextColor+"' is updated in the Chart Title input text ");
	        }else {
				failReport(driver,"By Default, '"+DefaultFontColor_Exp+"' Should updated in the Chart Title input text " ,"By Default, '"+defaultChartTitletextColor+"' is updated in the Chart Title input text ");
	        }
	        
	        click(driver,FontColorInput);
	        if(isDisplayed(driver,ColorPickerOpen)) {
				passReport(driver,"The color pickers should opens promptly after clicking font color input" ,"The color pickers opens promptly after clicking font color input");
	        }else {
				failReport(driver,"The color pickers should opens promptly after clicking font color input" ,"The color pickers not opens promptly after clicking font color input");
	        }
	        
	        click(driver,FontColorText);
	        wait(driver,"1");
	        if(isDisplayed2(driver,ColorPickerOpen)) {
				failReport(driver,"The color picker Should closes immediately when the user clicks outside Font color boundaries" ,"The color picker not closes immediately when the user clicks outside Font color boundaries");
	        }else {
				passReport(driver,"The color picker Should closes immediately when the user clicks outside Font color boundaries" ,"The color picker closes immediately when the user clicks outside Font color boundaries");
	        }
	        click3(driver,FontColorInput);
	        action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
	        sendKeys(driver,FontColorInput,TypeTextColor1);
	        click3(driver,FontColorText);
	        String SelectedFontColor=getTextBackgroundColor(driver, FontColorInputPointer);
	        String AppliedChartTitleTextColor=getTextColor(driver, ChartTitleInput);
	        System.out.println("SelectedFontColor : "+SelectedFontColor+"  ---> AppliedChartTitleTextColor : "+AppliedChartTitleTextColor);
	 
	        if((SelectedFontColor.equalsIgnoreCase(TypeTextColor1))&&AppliedChartTitleTextColor.equalsIgnoreCase(TypeTextColor1)) {
				passReport(driver,"While Manually Enter Font Color, ("+TypeTextColor1+") Should update in the Font Color input and Chart Title Text" ,"While Manually Enter the Color, "+SelectedFontColor+" updated in the Font Color input and "+AppliedChartTitleTextColor+" updated in the Chart Title text");
	        }else {
				failReport(driver,"While Manually Enter Font Color, ("+TypeTextColor1+") Should update in the Font Color input and Chart Title Text" ,"While Manually Enter the Color, "+SelectedFontColor+" updated in the Font Color input and "+AppliedChartTitleTextColor+" updated in the Chart Title text");
	        }
	        
	        click3(driver,FontColorInput);
	        action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
	        action.sendKeys(Keys.BACK_SPACE).build().perform();

	        click3(driver,FontColorText);
	        String ResetFontColorColor=getTextBackgroundColor(driver, FontColorInputPointer);
	        String ResetChartTitleTextColor=getTextColor(driver, ChartTitleInput);
	        System.out.println("ResetFontColorColor : "+ResetFontColorColor+"  ---> ResetChartTitleTextColor : "+ResetChartTitleTextColor);

	        if(ResetFontColorColor.equalsIgnoreCase(DefaultFontColor_Exp)) {
				passReport(driver,"After revert all color selections, the Font Color Input should reset to the default color : "+DefaultFontColor_Exp ,"After revert all color selections, the Font Color Input reset to the default color : "+ResetFontColorColor);
	        }else {
				failReport(driver,"After revert all color selections, the Font Color Input should reset to the default color : "+DefaultFontColor_Exp ,"After revert all color selections, the Font Color Input not reset to the default color, actual result color : "+ResetFontColorColor);
	        }
	        
	        if(ResetChartTitleTextColor.equalsIgnoreCase(DefaultFontColor_Exp)) {
				passReport(driver,"After revert all color selections, the Chart Title Text should reset to the default color :"+DefaultFontColor_Exp ,"After revert all color selections, the Chart Title Text reset to the default color : "+ResetChartTitleTextColor);
	        }else {
				failReport(driver,"After revert all color selections, the Chart Title Text should reset to the default color"+DefaultFontColor_Exp ,"After revert all color selections, the Chart Title Text not reset to the default color, actual result color : "+ResetChartTitleTextColor);
	        }
	        
	        click(driver,FontColorInput);
	        waitForElement(driver,ColorPickerOpen);
	        verifyElementIsPresent1(driver,ThemeColor);
	        verifyElementIsPresent1(driver,History);
	        mouseOverToElement(driver,Color1);
	        mouseOverToElement(driver,Color1);
	        mouseOverColorValue=getTextBackgroundColor(driver, Color1);
	        mouseOverHistoryColor=getText1(driver,mouseOverColorHistory);
	        System.out.println("mouseOverColorValue : "+mouseOverColorValue+"  ---> mouseOverHistoryColor : "+mouseOverHistoryColor);
	        if(mouseOverColorValue.equals(mouseOverHistoryColor)) {
				passReport(driver,"Mouse over color value should be updated in the history" ,"Mouse over color value updated in the history");
	        }else {
				failReport(driver,"Mouse over color value should be updated in the history" ,"Mouse over color value not updated in the history");
	        }
	        
	        String SelectFontColorValue=getTextBackgroundColor(driver, Color2);
	        System.out.println("  ---> SelectFontColorValue : "+SelectFontColorValue); 
	        click(driver,Color2);
	        wait(driver,"1");
	        if(isDisplayed2(driver,ColorPickerOpen)) {
				failReport(driver,"The color picker Should closes immediately when the user select the color" ,"The color picker not closes immediately when the user select the color");
	        }else {
				passReport(driver,"The color picker Should closes immediately when the user select the color" ,"The color picker closes immediately when the user select the color");
	        }
	        
	        String SelectedFontColorValue1=getTextJavascript(driver,FontColorInput);
	 		System.out.println("SelectedFontColorValue1 : "+SelectedFontColorValue1);
	 		if(SelectedFontColorValue1.equals(SelectFontColorValue)) {
				passReport(driver,"Selected Background Color "+SelectFontColorValue+" Should updates in the Font Color Input","Selected Background Color "+SelectedFontColorValue1+" updated in the Font Color Input");
	 		}else {
				failReport(driver,"Selected Background Color "+SelectFontColorValue+" Should updates in the Font Color Input","Background Color "+SelectedFontColorValue1+" is updated in the Font Color Input");
	 		}
	        
	 		String ChartTitleTextColor1=getTextColor(driver, ChartTitleInput);
	        if(ChartTitleTextColor1.equals(SelectFontColorValue)) {
				passReport(driver,"Selected Background Color "+SelectFontColorValue+" Should updates in the Chart Title Text" ,"Selected Background Color "+ChartTitleTextColor1+" updated in the Chart Title Text");
	        }else {
	 			failReport(driver,"Selected Background Color "+SelectFontColorValue+" Should updates in the Chart Title Text" ,"Background Color "+ChartTitleTextColor1+" is updated in the Chart Title Text");
	        }
			
	        click3(driver,FontColorInput);
	        waitForElement(driver,ColorPickerOpen);
	        
	        String SelectedFontColorHistory=getText1(driver,selectedColorHistory);
	        if(SelectedFontColorHistory.equals(SelectFontColorValue)) {
	 			passReport(driver,"Selected Font Color "+SelectFontColorValue+" should be updated in the history" ,"Selected Font Color "+SelectedFontColorHistory+" updated in the history");
	         }else {
	  			failReport(driver,"Selected Font Color "+SelectFontColorValue+" should be updated in the history" ,"Selected Font Color not updated in the history");
	         }
	        click3(driver,FontColorText);
	        
//	      Font color Validation End...

//	      Font Family Validation start...
	        
	        String fontFamily_ValueChartTitle=getText1(driver,ChartFontFamilyDropdown);
	     	click(driver,ChartFontFamilyDropdown);
	     	
	     	if(verifyElementIsPresent1(driver,ChartFontFamilyDropdownExpand)) {
	        	passReport(driver,"Font family dropdown should expand" ,"Font family dropdown expanded");
	        	mouseOverToElement(driver,SecondValue);
	        	wait(driver,"1");
	    		String mouseHighlightColor=getTextBackgroundColor(driver,SecondValue);
	    		colorValidation(driver,Highlight_ColorChartTitle_Exp,mouseHighlightColor,"Mouse HighlightText>*");

	            mouseOverToElement(driver,ListSelected);
	            action.sendKeys(Keys.ARROW_UP).build().perform();
	    		String selectedColorActChartTitle=getTextBackgroundColor(driver,ListSelected);
	    		String highlightTextChartTitle=getText1(driver,listSelectedText1);
	    		if((fontFamily_ValueChartTitle.equals(highlightTextChartTitle))&&Selected_ColorChartTitle_Exp.equals(selectedColorActChartTitle)) {
	    			 passReport(driver,"Selected Value ("+fontFamily_ValueChartTitle+") Should Highlight in Grey("+Selected_ColorChartTitle_Exp+") Color","Selected Value ("+highlightTextChartTitle+") Highlighted in Grey("+selectedColorActChartTitle+") Color");
	    		}else {
	         	    failReport(driver,"Selected Value ("+fontFamily_ValueChartTitle+") Should Highlight in Grey("+Selected_ColorChartTitle_Exp+") Color",highlightTextChartTitle+" Value Highlighted in "+selectedColorActChartTitle+" Color");
	    		}
	    		
	            mouseOverToElement(driver,SecondValue);
	         	ScrollBarValidation(driver,ChartFontFamilyDropdownExpand,HighlightedFontFamily,"Font Family");
	         	
	         //	AlphabetOrderValidation(driver,chartFontFamilyResults);

	         	List<WebElement> beforeSearchResults=getWebElements(driver,chartFontFamilyResults);
	         	int beforeSearchSize=beforeSearchResults.size();
	         	verifyElementIsPresent1(driver,dropdownInputsearchBox);
	         	click(driver,dropdownInputsearchBox);
	         	sendKeys(driver,dropdownInputsearchBox,ChangeFontFamilyChartTitle);
	         	List<WebElement> afterSearchResults=getWebElements(driver,chartFontFamilyResults);
	         	int afterSearchSize=afterSearchResults.size();
	            String resultText=getText1(driver,fontFamilyFirstResult);
	            if((beforeSearchSize>afterSearchSize)&&resultText.equals(ChangeFontFamilyChartTitle)) {
	   			 passReport(driver,"Search input in the Font Family dropdown should works properly","Search input in the Font Family dropdown works properly");
	            }else {
	         	    failReport(driver,"Search input in the Font Family dropdown should works properly","Search input in the Font Family dropdown not works properly");
	            }
	         	
	           	selectFontFamily(driver,ChangeFontFamilyChartTitle);
	           	wait(driver,"1");
	           	if(isDisplayed2(driver,ChartFontFamilyDropdownExpand)) {
	           		failReport(driver,"Font Family dropdown should close after select the value","Font Family dropdown not closed after select the value");
	           	}else {
	      			 passReport(driver,"Font Family dropdown should close after select the value","Font Family dropdown closed after select the value");
	           	}
	         	wait(driver,"1");
	           	String selectedFontFamilyValue=getText1(driver,ChartFontFamilyDropdown); 
	           	if(selectedFontFamilyValue.equals(ChangeFontFamilyChartTitle)) {
				    passReport(driver,"Selected fontFamily ("+ChangeFontFamilyChartTitle+") Should Update in Font Family Input field","Selected fontFamily ("+selectedFontFamilyValue+") Updated in Font Family Input field");
	           	}else {
	           		failReport(driver,"Selected fontFamily ("+ChangeFontFamilyChartTitle+") Should Update in Font Family Input field","FontFamily ("+selectedFontFamilyValue+") Updated in Font Family Input field");
	           	}
	        	
	    		String fontFamily_ChartTitleText_Act=getFontFamily(driver,ChartTitleInput);
	    		if(fontFamily_ChartTitleText_Act.equals(ChangeFontFamilyChartTitle)) {
	   			    passReport(driver,"Selected fontFamily ("+ChangeFontFamilyChartTitle+") Should Update in Chart Title text","Selected fontFamily ("+fontFamily_ChartTitleText_Act+") Updated in Chart Title text");
	    		}else {
	         	    failReport(driver,"Selected fontFamily ("+ChangeFontFamilyChartTitle+") Should Update in Chart Title text","FontFamily ("+fontFamily_ChartTitleText_Act+") Updated in Chart Title text");
	    		}
	           	
	        }else {
	     	    failReport(driver,"Font family dropdown should expand","Font family dropdown not expanded");
	     	    Assert.fail();
	        }
	        
	        // Font Size Validation start....
	     	
	        String defaultFontSizeValue=getTextJavascript(driver,ChartFontSizedDropdown);
	        String ChartTitleFontSize_Actual=getFontSize(driver,ChartTitleInput);
	        if(ChartTitleFontSize_Actual.equals(defaultFontSizeValue)) {
				    passReport(driver,"By default font size ("+defaultFontSizeValue+") Should Update in Chart Title text","By default font size ("+ChartTitleFontSize_Actual+") Updated in Chart Title text");
			}else {
	     	    failReport(driver,"By default font size ("+defaultFontSizeValue+") Should Update in Chart Title text","Font Size ("+ChartTitleFontSize_Actual+") Updated in Chart Title text");
			}
	     	
	        selectOptionValue(driver,ChartFontSizedDropdown,ChangeFontSize);
	        
	        String selectedFontSizeValue=getTextJavascript(driver,ChartFontSizedDropdown);
	        if(selectedFontSizeValue.equals(ChangeFontSize)) {
			    passReport(driver,"Selected Font Size ("+ChangeFontSize+") Should Update in Font Size Input","Selected Font Size ("+selectedFontSizeValue+") Updated in Font Size Input");
			}else {
		 	    failReport(driver,"Selected Font Size ("+ChangeFontSize+") Should Update in Font Size Input","Font Size ("+selectedFontSizeValue+") Updated in Font Size Input");
			}
	        
	        String AppliedChartTitleFontSize_Actual=getFontSize(driver,ChartTitleInput);
	        if(AppliedChartTitleFontSize_Actual.equals(ChangeFontSize)) {
			    passReport(driver,"Selected Font Size ("+ChangeFontSize+") Should Update in Chart Title text","Selected Font Size ("+AppliedChartTitleFontSize_Actual+") Updated in Chart Title text");
			}else {
		 	    failReport(driver,"Selected Font Size ("+ChangeFontSize+") Should Update in Chart Title text","Font Size ("+AppliedChartTitleFontSize_Actual+") Updated in Chart Title text");
			}
	        
	        FontSizeOrderValidation(driver,FontSizeResults);
	        
	       	// ******** ChartTitle Validation End ***********************
	        
	        //********** ChartStyle Validation Start *************************
	        
	         waitForElement(driver,Bar_widget);
			 click(driver,Bar_widget);
		
	         verifyElementIsPresent(driver,Chart_FormatSec);
			 click(driver,Chart_FormatSec);
			 String ChartFormatOpenstatus=getAttribute1(driver, chartFormatExpand, "class");
			 if(ChartFormatOpenstatus.contains("up")) {
				passReport(driver,"Chart Format should expand when click the Chart Format" ,"Chart Format is expanded when clicking the Chart Format");
			 }else {
				failReport(driver,"Chart Format should expand" ,"Chart Format is not expanded when click the Chart Format");
				
			 }
			 //ChartFormatColorExp
			 String ChartFormatColor=getTextColor(driver, Chart_FormatSec);
			 if(ChartFormatColor.equalsIgnoreCase(ChartFormatColorExp)) {
				passReport(driver,"Chart Format should gets highlighted in blue color "+ChartFormatColorExp+" after it expands" ,"Chart Format gets highlighted in "+ChartFormatColor+" color after it expands");
			 }else {
				failReport(driver,"Chart Format should gets highlighted in blue color "+ChartFormatColorExp+" after it expands" ,"Chart Format gets highlighted in "+ChartFormatColor+" Color after it expands"); 
			 }
			 
			 if(verifyElementIsPresent(driver,ChartStyling)) {
				 String ChartStylingText_Act=getText1(driver,ChartStyling);
				 textValidation(driver, ChartStylingText_Exp, ChartStylingText_Act, ChartStyling);
				 String ChartStylingExpand=getAttribute1(driver, ChartStyling_Expand, "class");
				 if(ChartStylingExpand.contains("up")) {
					passReport(driver,"By default, Chart Styling should gets Expand" ,"By default, Chart Styling gets Expanded");
				 }else {
					failReport(driver,"By default, Chart Styling should gets Expand" ,"By default, Chart Styling not gets Expand");
					Assert.fail();
				 }
				
				 String ChartStylingColor_Act=getTextColor(driver, ChartStyling);
				 if(ChartStylingColor_Exp.equalsIgnoreCase(ChartStylingColor_Act)) {
					passReport(driver,"Chart Styling should gets highlighted in blue color "+ChartStylingColor_Exp ,"Chart Styling gets highlighted in "+ChartStylingColor_Act);
				 }else {
					failReport(driver,"Chart Styling should gets highlighted in blue color "+ChartStylingColor_Exp ,"Chart Styling gets highlighted in "+ChartStylingColor_Act); 
				 }
			 }
			 
	     	if(verifyElementIsPresent1(driver,ChartThemeText)) {
	     		String ChartThemeText_Act=getText1(driver,ChartThemeText);
	    		textValidation(driver,ChartThemeText_Exp,ChartThemeText_Act,ChartThemeText);
	     	}
	     	verifyElementIsPresent1(driver,ChartThemeInput);
	     	
	     	if(verifyElementIsPresent1(driver,X_ScrollText)) {
	     		String X_ScrollText_Act=getText1(driver,X_ScrollText);
	    		textValidation(driver,X_ScrollText_Exp,X_ScrollText_Act,X_ScrollText);
	     	}
	     	verifyElementIsPresent1(driver,X_ScrollInputSlider);

	     	if(verifyElementIsPresent1(driver,Y_ScrollText)) {
	     		String Y_ScrollText_Act=getText1(driver,Y_ScrollText);
	    		textValidation(driver,Y_ScrollText_Exp,Y_ScrollText_Act,Y_ScrollText);
	     	}
	     	verifyElementIsPresent1(driver,Y_ScrollInputSlider);

	     	if(verifyElementIsPresent1(driver,Auto_ScrollText)) {
	     		String Auto_ScrollText_Act=getText1(driver,Auto_ScrollText);
	    		textValidation(driver,Auto_ScrollText_Exp,Auto_ScrollText_Act,Auto_ScrollText);
	     	}
	     	verifyElementIsPresent1(driver,Auto_ScrollInputSlider);

	     	if(verifyElementIsPresent1(driver,EnableGridText)) {
	     		String EnableGridText_Act=getText1(driver,EnableGridText);
	    		textValidation(driver,EnableGridText_Exp,EnableGridText_Act,EnableGridText);
	     	}
	     	verifyElementIsPresent1(driver,EnableGrid_InputSlider);

	     	String defaultThemeValue_Act=getText1(driver,ChartThemeInput);
	     	if(defaultThemeValue_Act.equals(DefaultThemeValue_Exp)) {
				passReport(driver,"By default, Chart theme should selected the value as '"+DefaultThemeValue_Exp+"'" ,"By default, Chart theme selected the value as '"+defaultThemeValue_Act+"'");
	     	}else {
				failReport(driver,"By default, Chart theme should selected the value as '"+DefaultThemeValue_Exp+"'" ,"By default, Chart theme selected the value as '"+defaultThemeValue_Act+"'");
	     	}
	     	
	     	click(driver,ChartThemeInput);
	     	if(verifyElementIsPresent1(driver,ChartThemeResults)) {
				passReport(driver,"Chart theme dropdown Should open and display list of chart themes" ,"Chart theme dropdown opened and displayed list of chart themes");
				mouseOverToElement(driver,ThirdValue);
	        	wait(driver,"1");
	    		String mouseHighlightColor=getTextBackgroundColor(driver,ThirdValue);
	    		colorValidation(driver,Highlight_ColorStyle_Exp,mouseHighlightColor,"Mouse HighlightText>*");

	    		String selectedColorActStyle=getTextBackgroundColor(driver,ListSelected);
	    		String highlightTextStyle=getText1(driver,listSelectedText1);
	    		if((defaultThemeValue_Act.equals(highlightTextStyle))&&Selected_ColorStyle_Exp.equalsIgnoreCase(selectedColorActStyle)) {
	    			 passReport(driver,"Selected Value ("+defaultThemeValue_Act+") Should Highlight in Grey("+Selected_ColorStyle_Exp+") Color","Selected Value ("+highlightTextStyle+") Highlighted in Grey("+selectedColorActStyle+") Color");
	    		}else {
	         	    failReport(driver,"Selected Value ("+defaultThemeValue_Act+") Should Highlight in Grey("+Selected_ColorStyle_Exp+") Color",highlightTextStyle+" Value Highlighted in "+selectedColorActStyle+" Color");
	    		}
	    		
	         	ScrollBarValidation(driver,ChartThemeResults,HighlightedTheme,"Chart Theme");

	         	List<WebElement> beforeSearchResults=getWebElements(driver,chartThemeResultList);
	         	int beforeSearchSize=beforeSearchResults.size();
	         	verifyElementIsPresent1(driver,dropdownInputsearchBox);
	         	click(driver,dropdownInputsearchBox);
	         	sendKeys(driver,dropdownInputsearchBox,Change_ChartTheme);
	         	List<WebElement> afterSearchResults=getWebElements(driver,chartThemeResultList);
	         	int afterSearchSize=afterSearchResults.size();
	            String resultText=getText1(driver,chartThemeFirstResult);
	            if((beforeSearchSize>afterSearchSize)&&resultText.equals(Change_ChartTheme)) {
	   			  passReport(driver,"Search input in the Chart Theme dropdown should works properly","Search input in the Chart Theme dropdown works properly");
	            }else {
	              failReport(driver,"Search input in the Chart Theme dropdown should works properly","Search input in the Chart Theme dropdown not works properly");
	            }
	         	
	         	click3(driver,dropdownInputsearchBox);
	         	action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
	            sendKeys(driver,dropdownInputsearchBox,InValidChartTheme);
	            String inValidResult=getText1(driver,chartThemeFirstResult);
	            if(inValidResult.equals("No results found")) {
	     			 passReport(driver,"'No results found' should display when user enter incorrect chart theme","'No results found' displayed when user enter incorrect chart theme");
	            }else {
	    			 failReport(driver,"'No results found' should display when user enter incorrect chart theme","'No results found' not displayed when user enter incorrect chart theme");
	            }
	            
	            click3(driver,dropdownInputsearchBox);
	         	action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
	            sendKeys(driver,dropdownInputsearchBox,Change_ChartTheme);
	            selectChartTheme(driver,Change_ChartTheme);
	            wait(driver,"1");
	            if(isDisplayed2(driver,ChartThemeResults)) {
	   			  failReport(driver,"Chart theme dropdown Should close automatically after select the Theme","Chart theme dropdown not closed after select the Theme");
	            }else {
	     		  passReport(driver,"Chart theme dropdown Should close automatically after select the Theme","Chart theme dropdown closed automatically after select the Theme");
	            }
	            
	            String selectedThemeValue=getText1(driver,ChartThemeInput);
	            if(selectedThemeValue.equals(Change_ChartTheme)) {
	       		   passReport(driver,"Selected Theme value '"+Change_ChartTheme+"' should update in the Chart Theme Input","Selected Theme value '"+selectedThemeValue+"' updated in the Chart Theme Input");
	            }else {
	        	   failReport(driver,"Selected Theme value '"+Change_ChartTheme+"' should update in the Chart Theme Input","Theme value '"+selectedThemeValue+"' updated in the Chart Theme Input");
	            }
	            
	     	}else {
				 failReport(driver,"Chart theme dropdown Should open and display list of chart themes" ,"Chart theme dropdown not opened");
				 Assert.fail();
	     	}

	     	if(isToggleEnable(driver,AutoScroll_toggle)) {
	    		 passReport(driver,"By default, 'AutoScroll' toggle should enabled","By default, 'AutoScroll' toggle is enabled");
	    		 String toggleColorAct=getTextBackgroundColor(driver, Auto_ScrollInputSlider);
	    		 if(toggleColorAct.equalsIgnoreCase(EnableButtonColor)) {
	        		 passReport(driver,"AutoScroll toggle should display in "+EnableButtonColor+" color when it is enabled","AutoScroll toggle displayed in "+toggleColorAct+" color when it is enabled");
	    		 }else {
	        		 failReport(driver,"AutoScroll toggle should display in "+EnableButtonColor+" color when it is enabled","AutoScroll toggle displayed in "+toggleColorAct+" color when it is enabled");
	    		 }
	     	}else {
	   		     failReport(driver,"By default, 'AutoScroll' toggle should enabled","By default, 'AutoScroll' toggle is not enabled");
	     	}
	     	
	     	if(isToggleEnable(driver,X_Scroll_toggle) && isToggleEnable(driver,Y_Scroll_toggle)){
	  		    failReport(driver,"X Scroll and Y Scroll toggle should disable when AutoScroll toggle is enabled","X Scroll and Y Scroll toggle not disabled when AutoScroll toggle is enabled");
	     	}else {
	   		    passReport(driver,"X Scroll and Y Scroll toggle should disable when AutoScroll toggle is enabled","X Scroll and Y Scroll toggle disabled when AutoScroll toggle is enabled");
	     	}
	     	
	     	if(isToggleAccessible(driver,X_Scroll_toggle) && isToggleAccessible(driver,Y_Scroll_toggle)){
	  		    failReport(driver,"X Scroll and Y Scroll toggle should not accessible when AutoScroll toggle is enabled","X Scroll and Y Scroll toggle accessible when AutoScroll toggle is enabled");
	     	}else {
	   		    passReport(driver,"X Scroll and Y Scroll toggle should not accessible when AutoScroll toggle is enabled","X Scroll and Y Scroll toggle not accessible when AutoScroll toggle is enabled");
	     	}

	     	click(driver,Auto_ScrollInputSlider);
	     	if(isToggleEnable(driver,AutoScroll_toggle)){
	  		    failReport(driver,"'Auto Scroll' toggle should disable when click on it","'Auto Scroll' toggle not disabled when click on it");
	     	}else {
	   		    passReport(driver,"'Auto Scroll' toggle should disable when click on it","'Auto Scroll' toggle disabled when click on it");
	     	}
	     	
	     	if(isToggleAccessible(driver,X_Scroll_toggle) && isToggleAccessible(driver,Y_Scroll_toggle)){
	   		    passReport(driver,"X Scroll and Y Scroll toggle should be accessible when AutoScroll toggle is disabled","X Scroll and Y Scroll toggle accessible when AutoScroll toggle is disabled");
	     	}else {
	  		    failReport(driver,"X Scroll and Y Scroll toggle should be accessible when AutoScroll toggle is disabled","X Scroll and Y Scroll toggle not accessible when AutoScroll toggle is disabled");
	     	}
	     	
	     	click(driver,X_ScrollInputSlider);
	     	if(isToggleEnable(driver,X_Scroll_toggle)){
	     		passReport(driver,"X Scroll toggle should enable While click on it","X Scroll toggle enabled when click on it");
	     	}else {
	   		    failReport(driver,"X Scroll toggle should enable when click on it","X Scroll toggle not enabled when click on it");
	     	}
	     	
	     	click(driver,Y_ScrollInputSlider);
	     	if(isToggleEnable(driver,Y_Scroll_toggle)){
	     		passReport(driver,"Y Scroll toggle should enable While click on it","Y Scroll toggle enabled when click on it");
	     	}else {
	   		    failReport(driver,"Y Scroll toggle should enable when click on it","Y Scroll toggle not enabled when click on it");
	     	}
	     	
	     	click(driver,Auto_ScrollInputSlider);
	     	wait(driver,"1");
	     	
	     	if(isToggleEnable(driver,X_Scroll_toggle) && isToggleEnable(driver,Y_Scroll_toggle)){
	  		    failReport(driver,"X Scroll and Y Scroll toggle should automatically disable when enabling the AutoScroll toggle","X Scroll and Y Scroll toggle not automatically disabled when enabling the AutoScroll toggle");
	     	}else {
	   		    passReport(driver,"X Scroll and Y Scroll toggle should automatically disable when enabling the AutoScroll toggle","X Scroll and Y Scroll toggle automatically disabled when enabling the AutoScroll toggle");
	     	}
	     	
	     	if(isToggleEnable(driver,EnableGrid_toggle)) {
	      		 passReport(driver,"By default, 'Enable Grid' toggle should enabled","By default, 'Enable Grid' toggle is enabled");
	      		 String toggleColorAct=getTextBackgroundColor(driver, EnableGrid_InputSlider);
	      		 if(toggleColorAct.equalsIgnoreCase(EnableButtonColor)) {
	          		 passReport(driver,"'Enable Grid' toggle should display in "+EnableButtonColor+" color when it is enabled","'Enable grid' toggle displayed in "+toggleColorAct+" color when it is enabled");
	      		 }else {
	          		 failReport(driver,"'Enable Grid' toggle should display in "+EnableButtonColor+" color when it is enabled","'Enable grid' toggle displayed in "+toggleColorAct+" color when it is enabled");
	      		 }
	      		 
	      		 click(driver,EnableGrid_InputSlider);
	      		 if(isToggleEnable(driver,EnableGrid_toggle)){
	          		 failReport(driver,"'Enable Grid' toggle should disable when click on it ","'Enable Grid' toggle not disabled when click on it ");
	         	 }else {
	          		 passReport(driver,"'Enable Grid' toggle should disable when click on it ","'Enable Grid' toggle disabled when click on it ");
	         	}
	      		 
	       	 }else {
	     	    failReport(driver,"By default, 'Enable Grid' toggle should enabled","By default, 'Enable Grid' toggle is not enabled");
	       	 }
	     	
//	     	
	    	click(driver,Axes);
	     	waitForElement(driver,Axes_Expand_Check);
	     	waitForElement(driver,Y_Axis_dropdown);
	        click(driver,Y_Axis_dropdown);
	        waitForElement(driver,Y_Axis_dropdownResults);
	        selectDropdownValue(driver,Y_Axis_Type,Y_Axis_Value);
	        
	        waitForElement(driver,X_Axis_dropdown);
	        click(driver,X_Axis_dropdown);
	        waitForElement(driver,X_Axis_dropdownResults);
	        selectDropdownValue(driver,X_Axis_Type,X_Axis_Value);
	        wait(driver,"1");
	        mouseOverToElement(driver,ApplyButton);
	        click3(driver,ApplyButton);
	        waitForElement(driver,Chart);
	        
	        click(driver,Chart_FormatSec);
	        wait(driver,"1");
	        
	        if(isToggleEnable(driver,AutoScroll_toggle) && isToggleEnable(driver,Y_Scroll_toggle)){
	   		    passReport(driver,"By default, 'Y and Auto scroll' should gets enable when input had large number of records","By default, 'Y and Auto scroll' gets enabled when input had large number of records");
	     	}else {
	  		    failReport(driver,"By default, 'Y and Auto scroll' should gets enable when input had large number of records","By default, 'Y and Auto scroll' both not gets enabled when input had large number of records");
	     	}
	        
	        click(driver,ChartStyling);
	        String chartStyleClose_Act=getAttribute1(driver, ChartStyling_Expand, "class");
			 if(chartStyleClose_Act.contains("down")) {
				passReport(driver,"Chart styling should gets collapsed when click on it" ,"Chart styling gets collapsed when click on it");
			 }else {
				failReport(driver,"Chart styling should gets collapsed when click on it" ,"Chart styling not gets collapsed when click on it");
			 }
	       	
		//*********** ChartStyle validation end ************
			 
	   // ********** DataLabel Validation Start ***************
			 
			   verifyElementIsPresent(driver,DataLabels);
//				 scrollUsingElement(driver,DataLabels);
				 String DataLabelsText_Act=getText1(driver,DataLabels);
				 textValidation(driver, DataLabelText_Exp, DataLabelsText_Act, DataLabels);
				 String DataLabelsExpand=getAttribute1(driver, DataLabels_Expand, "class");
				 if(DataLabelsExpand.contains("up")) {
					passReport(driver,"By default, Data Labels should gets Expand" ,"By default, Data Labels gets Expanded");
				 }else {
					failReport(driver,"By default, Data Labels should gets Expand" ,"By default, Data Labels not gets Expand");
					click(driver,DataLabels);
				 }
				
				 String DataLabelsColor_Act=getTextColor(driver, DataLabels);
				 if(DataLabelsColor_Exp.equalsIgnoreCase(DataLabelsColor_Act)) {
					passReport(driver,"Data Labels should gets highlighted in blue color "+DataLabelsColor_Exp ,"Data Labels gets highlighted in "+DataLabelsColor_Act);
				 }else {
					failReport(driver,"Data Labels should gets highlighted in blue color "+DataLabelsColor_Exp ,"Data Labels gets highlighted in "+DataLabelsColor_Act); 
				 }
			 
			 
			 //Validation of the visibility of data label options start...
			 if (verifyElementIsPresent1(driver, EnableValue_text)) {
					String EnableValueText_Act = getText1(driver, EnableValue_text);
					textValidation(driver, EnableValueText_Exp, EnableValueText_Act, EnableValue_text);
			   	}
			 verifyElementIsPresent1(driver, EnableValue_Input);

	     	 if(verifyElementIsPresent1(driver,ValueFormat_text)) {
		     		String ValueFormatText_Act=getText1(driver,ValueFormat_text);
		    		textValidation(driver,ValueFormatText_Exp,ValueFormatText_Act,ValueFormat_text);
			   	}
		     verifyElementIsPresent1(driver,ValueFormatInput);
		     
		     if(verifyElementIsPresent1(driver,Seperator_text)) {
		     		String SeperatorText_Act=getText1(driver,Seperator_text);
		    		textValidation(driver,SeperatorText_Exp,SeperatorText_Act,Seperator_text);
			   	}
		     verifyElementIsPresent1(driver,SeperatorInput);
		     
		     if(verifyElementIsPresent1(driver,ValueFontSize_text)) {
		     		String ValueFontSizeText_Act=getText1(driver,ValueFontSize_text);
		    		textValidation(driver,ValueFontSizeText_Exp,ValueFontSizeText_Act,ValueFontSize_text);
			   	}
		     verifyElementIsPresent1(driver,ValueFontSizeInput);
		     
		     if(verifyElementIsPresent1(driver,RoundOffValue_text)) {
		     		String RoundOffText_Act=getText1(driver,RoundOffValue_text);
		    		textValidation(driver,RoundOffText_Exp,RoundOffText_Act,RoundOffValue_text);
			   	}
		     verifyElementIsPresent1(driver,RoundOffValueInput);
		     
		     if(verifyElementIsPresent1(driver,Position_text)) {
		     		String PositionText_Act=getText1(driver,Position_text);
		    		textValidation(driver,PositionText_Exp,PositionText_Act,Position_text);
			   	}
		     verifyElementIsPresent1(driver,PositionInput);
		     
		     if(verifyElementIsPresent1(driver,BigNumberSuffix_text)) {
		     		String BigNumberText_Act=getText1(driver,BigNumberSuffix_text);
		    		textValidation(driver,BigNumberText_Exp,BigNumberText_Act,BigNumberSuffix_text);
			   	}
		     verifyElementIsPresent1(driver,BigNumberInput);
		     
		     if(verifyElementIsPresent1(driver,ShowAsPositive_text)) {
		     		String ShowAsPositiveText_Act=getText1(driver,ShowAsPositive_text);
		    		textValidation(driver,ShowAsPositiveText_Exp,ShowAsPositiveText_Act,ShowAsPositive_text);
			   	}
		     verifyElementIsPresent1(driver,ShowPositive_Input);
		   
		     if(verifyElementIsPresent1(driver,ValueRotation_text)) {
		     		String ValueRotationText_Act=getText1(driver,ValueRotation_text);
		    		textValidation(driver,ValueRotationText_Exp,ValueRotationText_Act,ValueRotation_text);
			   	}
		     verifyElementIsPresent1(driver,ValueRotation_Input);
			 //Validation of the visibility of data label options End...
		     
		     //All options are inaccessible when the enable value toggle is disabled. Validation end
		     if(isToggleEnable(driver,EnableValue_Input)) {
		  		 failReport(driver,"By Default, Enable Value toggle should be disable","By Default, Enable Value toggle is enabled");
		  		 click3(driver,EnableValue_InputSlider);
		     }else {
		  		 passReport(driver,"By Default, Enable Value toggle should be disable","By Default, Enable Value toggle is disabled");
		     }
		     
		     if(isToggleAccessible(driver,ValueFormatInput)) {
		  		 failReport(driver,"'Value Format' Should be inaccessible when the 'Enable value' toggle is disabled.","'Value Format' is accessible when the 'Enable value' toggle is disabled.");
		     }else {
		  		 passReport(driver,"'Value Format' Should be inaccessible when the 'Enable value' toggle is disabled.","'Value Format' is inaccessible when the 'Enable value' toggle is disabled.");
		     }
		     
		     if(isToggleAccessible(driver,SeperatorInput)) {
		  		 failReport(driver,"'Seperator Input' Should be inaccessible when the 'Enable value' toggle is disabled.","'Seperator Input' is accessible when the 'Enable value' toggle is disabled.");
		     }else {
		  		 passReport(driver,"'Seperator Input' Should be inaccessible when the 'Enable value' toggle is disabled.","'Seperator Input' is inaccessible when the 'Enable value' toggle is disabled.");
		     }
		     
		     if(isToggleAccessible(driver,ValueFontSizeInput)) {
		  		 failReport(driver,"'ValueFontSize Input' Should be inaccessible when the 'Enable value' toggle is disabled.","'ValueFontSize Input' is accessible when the 'Enable value' toggle is disabled.");
		     }else {
		  		 passReport(driver,"'ValueFontSize Input' Should be inaccessible when the 'Enable value' toggle is disabled.","'ValueFontSize Input' is inaccessible when the 'Enable value' toggle is disabled.");
		     }
		     
		     if(isToggleAccessible(driver,RoundOffValueInput)) {
		  		 failReport(driver,"'RoundOffValue Input' Should be inaccessible when the 'Enable value' toggle is disabled.","'RoundOffValue Input' is accessible when the 'Enable value' toggle is disabled.");
		     }else {
		  		 passReport(driver,"'RoundOffValue Input' Should be inaccessible when the 'Enable value' toggle is disabled.","'RoundOffValue Input' is inaccessible when the 'Enable value' toggle is disabled.");
		     }
		     
		     if(isToggleAccessible(driver,PositionInput)) {
		  		 failReport(driver,"'Position Input' Should be inaccessible when the 'Enable value' toggle is disabled.","'Position Input' is accessible when the 'Enable value' toggle is disabled.");
		     }else {
		  		 passReport(driver,"'Position Input' Should be inaccessible when the 'Enable value' toggle is disabled.","'Position Input' is inaccessible when the 'Enable value' toggle is disabled.");
		     }
			 
		     if(isToggleAccessible(driver,BigNumberInput)) {
		  		 failReport(driver,"'BigNumber Suffix Input' Should be inaccessible when the 'Enable value' toggle is disabled.","'BigNumber Suffix Input' is accessible when the 'Enable value' toggle is disabled.");
		     }else {
		  		 passReport(driver,"'BigNumber Suffix Input' Should be inaccessible when the 'Enable value' toggle is disabled.","'BigNumber Suffix Input' is inaccessible when the 'Enable value' toggle is disabled.");
		     }
		     
		     if(isToggleAccessible(driver,ValueRotation_Input)) {
		  		 failReport(driver,"'ValueRotation_Input' Should be inaccessible when the 'Enable value' toggle is disabled.","'ValueRotation_Input' is accessible when the 'Enable value' toggle is disabled.");
		     }else {
		  		 passReport(driver,"'ValueRotation_Input' Should be inaccessible when the 'Enable value' toggle is disabled.","'ValueRotation_Input' is inaccessible when the 'Enable value' toggle is disabled.");
		     }
		     
		     if(isToggleAccessible(driver,ShowPositive_Input)) {
		    	 passReport(driver,"'Show As Positive Input' Should be accessible when the 'Enable value' toggle is disabled.","'Show As Positive Input' is accessible when the 'Enable value' toggle is disabled.");
		     }else {
		  		 failReport(driver,"'Show As Positive Input' Should be accessible when the 'Enable value' toggle is disabled.","'Show As Positive Input' is not accessible when the 'Enable value' toggle is disabled.");
		     }
		     
		     //All options are inaccessible when the enable value toggle is disabled. Validation end
		     
			 click(driver,EnableValue_InputSlider);
			 if(isToggleEnable(driver,EnableValue_Input)) {
		  		 passReport(driver,"'Enable Value' toggle should be enable after click on it","'Enable Value' toggle is enabled after click on it");
			 }else {
		  		 failReport(driver,"'Enable Value' toggle should be enable after click on it","'Enable Value' toggle is not enabled after click on it");
		  		 
			 }
			
			 mouseOverToElement(driver, ApplyButton);
	  		 click(driver,ApplyButton);
	  		 waitForElement(driver,Chart);
	  		 
	  		 //new
	  		 
  			 List<WebElement> chartValues=getWebElements(driver, ValueFormat_ChartValue);
  			 int chartValueSize=chartValues.size();
  			 WebElement lastChartValue=chartValues.get(chartValueSize-3);
	  		 
	  		 //isDisplayed(driver,ValueFormat_ChartValue
	  		 
	  		 if(lastChartValue.isDisplayed()) {
		  		 passReport(driver,"Values should be enabled in charts after enabling the 'Enable Value' toggle","Values enabled in charts after enabling the 'Enable Value' toggle"); 
	  		 }else {
		  		 failReport(driver,"Values should be enabled in charts after enabling the 'Enable Value' toggle","Values not enabled in charts after enabling the 'Enable Value' toggle"); 
	  		 }
	  		 
	  		//new
			 
	         if(isToggleAccessible(driver,ValueFormatInput)) {		
		  		 passReport(driver,"'Value Format Input' should be accessible after enabling the 'Enable Value' toggle","'Value Format Input' is accessible after enabling the 'Enable Value' toggle"); 
		  		 String defaultFormatValue_Act=defaultSelectedValue(driver, ValueFormatInput);
		  		 if(DefaultFormatValue_Exp.equals(defaultFormatValue_Act)) {
			  		 passReport(driver,"By default, '"+DefaultFormatValue_Exp+"' Should be selected in the Value Format Input","By default, '"+defaultFormatValue_Act+"' is selected in the Value Format Input"); 
		  		 }else {
			  		 failReport(driver,"By default, '"+DefaultFormatValue_Exp+"' Should be selected in the Value Format Input","By default, '"+defaultFormatValue_Act+"' is selected in the Value Format Input"); 
		  		 }
	         }else {
		  		 failReport(driver,"'Value Format Input' should be accessible after enabling the 'Enable Value' toggle","'Value Format Input' is not accessible after enabling the 'Enable Value' toggle");
		  		 Assert.fail();
	         }
	         
	         selectOptionValue(driver,ValueFormatInput,"value");
	         mouseOverToElement(driver, ApplyButton);
	  		 click(driver,ApplyButton);
	  		 waitForElement(driver,Chart);
	  		 
	  		 //new 
	  		 chartValues=getWebElements(driver, ValueFormat_ChartValue);
 			 chartValueSize=chartValues.size();
 			 lastChartValue=chartValues.get(chartValueSize-3);
	  		 //new
	  		 
	  		 String ValueTextAct=lastChartValue.getText();  //getText1(driver,ValueFormat_ChartValue);
	  		 if(ValueTextAct.endsWith("%")) {
		  		 failReport(driver,"'Value Format' should display in the chart for Value format selection","'Value Format' is not display in the chart for Value format selection");
	  		 }else {
		  		 passReport(driver,"'Value Format' should display in the chart for Value format selection","'Value Format' is displayed in the chart for Value format selection");
	  		 }
	  		 
	  		 selectOptionValue(driver,ValueFormatInput,"percentage");
	  		 mouseOverToElement(driver, ApplyButton);
	 		 click(driver,ApplyButton);
	 		 waitForElement(driver,Chart);
	 		 
	 		 //new 
	  		 chartValues=getWebElements(driver, ValueFormat_ChartValue);
 			 chartValueSize=chartValues.size();
 			 lastChartValue=chartValues.get(chartValueSize-3);
	  		 //new
	 		 
	 		 ValueTextAct= lastChartValue.getText();    //getText1(driver,ValueFormat_ChartValue);
	 		 if(ValueTextAct.contains("%")) {
		  		 passReport(driver,"'Percentage Format' should display in the chart for percentage format selection","'Percentage Format' displayed in the chart for Percentage format selection");
	 		 }else {
		  		 failReport(driver,"'Percentage Format' should display in the chart for percentage format selection","'Percentage Format' is not displayed in the chart for Percentage format selection");
	 		 }
	 		 
	 		 
	 		 if(isToggleAccessible(driver,SeperatorInput)) {	
	 			 failReport(driver,"'Seperator Input' should be inaccessible  when 'percentage' is selected in value format","'Seperator Input' is accessible  when 'percentage' is selected in value format");
		  		 Assert.fail();
	         }else {
	        	 passReport(driver,"'Seperator Input' should be inaccessible  when 'percentage' is selected in value format","'Seperator Input' is inaccessible  when 'percentage' is selected in value format"); 
	         }
	 		 
	 		 selectOptionValue(driver,ValueFormatInput,"value");
	         mouseOverToElement(driver, ApplyButton);
	  		 click(driver,ApplyButton);
	  		 if(isToggleAccessible(driver,SeperatorInput)) {	
	  			passReport(driver,"'Seperator Input' should be accessible  when 'value' is selected in value format","'Seperator Input' is accessible  when 'value' is selected in value format"); 
	  		 }else {
	  			failReport(driver,"'Seperator Input' should be accessible  when 'value' is selected in value format","'Seperator Input' is not accessible  when 'value' is selected in value format"); 
	  			Assert.fail();
	  		 }
	  		 verifyElementIsPresent1(driver, Thousand_Seperator);
	  		 verifyElementIsPresent1(driver, Houndred_Seperator);

	  		 String defaultSeperator_Act=defaultSelectedValue(driver,SeperatorInput);
	  		 if(DefaultSeperatorValue_Exp.equals(defaultSeperator_Act)) {
		  		 passReport(driver,"By default, '"+DefaultSeperatorValue_Exp+"' Should be selected in the Seperator Input","By default, '"+defaultSeperator_Act+"' is selected in the Seperator Input"); 
	  		 }else {
		  		 failReport(driver,"By default, '"+DefaultSeperatorValue_Exp+"' Should be selected in the Seperator Input","By default, '"+defaultSeperator_Act+"' is selected in the Seperator Input"); 
	  		 } 
	         
	  		click(driver,SeperatorInput);
	  		selectOptionValue(driver,SeperatorInput,"#,###");
	  		mouseOverToElement(driver, ApplyButton);
	 		click(driver,ApplyButton);
	 		waitForElement(driver,Chart);
	 		//new 
	  		 chartValues=getWebElements(driver, ValueFormat_ChartValue);
			 chartValueSize=chartValues.size();
			 lastChartValue=chartValues.get(chartValueSize-3);
	  		 //new
	 		
	 		String ChartValueTextAct=lastChartValue.getText();     //getText1(driver,ValueFormat_ChartValue);
	 		String ValueSeperatorFormat=validateNumberFormat(ChartValueTextAct);
	 		if(ValueSeperatorFormat.equals("#,###")) {
		  		 passReport(driver,"Thousand seperator should gets applied for chart enabled values","Thousand seperator gets applied for chart enabled values"); 
	 		}else {
		  		 failReport(driver,"Thousand seperator should gets applied for chart enabled values","Thousand seperator not applied for chart enabled values"); 
	 		}
	 		
	 		click(driver,SeperatorInput);
	 		selectOptionValue(driver,SeperatorInput,"#,##");
	  		mouseOverToElement(driver, ApplyButton);
	 		click(driver,ApplyButton);
	 		waitForElement(driver,Chart);
	 		 //new 
	  		 chartValues=getWebElements(driver, ValueFormat_ChartValue);
			 chartValueSize=chartValues.size();
			 lastChartValue=chartValues.get(chartValueSize-3);
	  		 //new
			 
			ChartValueTextAct=lastChartValue.getText();     //getText1(driver,ValueFormat_ChartValue);
	 		ValueSeperatorFormat=validateNumberFormat(ChartValueTextAct);
	 		if(ValueSeperatorFormat.equals("#,##")) {
		  		 passReport(driver,"Hundred Separator should gets applied for chart enabled values","Hundred Separator gets applied for chart enabled values"); 
	 		}else {
		  		 failReport(driver,"Hundred Separator should gets applied for chart enabled values","Hundred Separator not applied for chart enabled values"); 
	 		}
	 		
	 		if(isToggleAccessible(driver,ValueFontSizeInput)) {		
		  		 passReport(driver,"'Value FontSize  Input' should be accessible after enabling the 'Enable Value' toggle","'Value FontSize Input' is accessible after enabling the 'Enable Value' toggle"); 
		  		 String defaultFontSize_Act=defaultSelectedValue(driver, ValueFontSizeInput);
		  		 if(DefaultFontSizeValue_Exp.equals(defaultFontSize_Act)) {
			  		 passReport(driver,"By default, '"+DefaultFontSizeValue_Exp+"' Should be selected in the Value Font Size Input","By default, '"+defaultFontSize_Act+"' is selected in the Value Font Size Input"); 
		  		 }else {
			  		 failReport(driver,"By default, '"+DefaultFontSizeValue_Exp+"' Should be selected in the Value Font Size Input","By default, '"+defaultFontSize_Act+"' is selected in the Value Font Size Input"); 
		  		 }
	        }else {
		  		 failReport(driver,"'Value FontSize Input' should be accessible after enabling the 'Enable Value' toggle","'Value FontSize Input' is not accessible after enabling the 'Enable Value' toggle");
		  		 Assert.fail();
	        }
	        
	 		click(driver,ValueFontSizeInput);
	 		selectOptionValue(driver,ValueFontSizeInput,ChangeFontSizeValue);
	  		mouseOverToElement(driver, ApplyButton);
	 		click(driver,ApplyButton);
	 		waitForElement(driver,Chart);
	 		
	 		String ValueFontSizeAct=getFontSize(driver,ValueFormat_ChartValue);
	 		if(ValueFontSizeAct.equals(ChangeFontSizeValue)) {
		  		 passReport(driver,"The chart's value should be displayed with '"+ChangeFontSizeValue+"' font size.","The chart's value displayed with '"+ValueFontSizeAct+"' font size."); 
	 		}else {
		  		 failReport(driver,"The chart's value should be displayed with '"+ChangeFontSizeValue+"' font size.","The chart's value displayed with '"+ValueFontSizeAct+"' font size."); 
	 		}
	 		
	 		if(isToggleAccessible(driver,RoundOffValueInput)) {		
		  		 passReport(driver,"'RoundOff Value  Input' should be accessible after enabling the 'Enable Value' toggle","'RoundOff Value Input' is accessible after enabling the 'Enable Value' toggle"); 
		  		 String defaultRoundOffValue_Act=defaultSelectedValue(driver, RoundOffValueInput);
		  		 if(DefaultRoundOffValue_Exp.equals(defaultRoundOffValue_Act)) {
			  		 passReport(driver,"By default, '"+DefaultRoundOffValue_Exp+"' Should be selected in the RoundOff Value Input","By default, '"+defaultRoundOffValue_Act+"' is selected in the RoundOffValue Input"); 
		  		 }else {
			  		 failReport(driver,"By default, '"+DefaultRoundOffValue_Exp+"' Should be selected in the RoundOff Value Input","By default, '"+defaultRoundOffValue_Act+"' is selected in the RoundOffValue Input"); 
		  		 }
	 		}else {
		  		 failReport(driver,"'RoundOff Value Input' should be accessible after enabling the 'Enable Value' toggle","'RoundOff Value Input' is not accessible after enabling the 'Enable Value' toggle");
		  		 Assert.fail(); 
	 		}
	 		
	 	   click(driver,RoundOffValueInput);
	 	   wait(driver,"1");
		   selectByText(driver,RoundOffValueInput,ChangeRoundOffValue);
		   mouseOverToElement(driver, ApplyButton);
		   click(driver,ApplyButton);
		   waitForElement(driver,Chart);
		   //new 
	  		 chartValues=getWebElements(driver, ValueFormat_ChartValue);
			 chartValueSize=chartValues.size();
			 lastChartValue=chartValues.get(chartValueSize-3);
	  	   //new
		   
		   ChartValueTextAct=lastChartValue.getText();     //getText1(driver,ValueFormat_ChartValue);
		   String RoundOffValue_Act=String.valueOf(getRoundOffValue(ChartValueTextAct));
		   if(RoundOffValue_Act.equals(ChangeRoundOffValue)) {
		  	   passReport(driver,"The chart's value should be displayed with '"+ChangeRoundOffValue+"' RoundOff Value","The chart's value displayed with '"+RoundOffValue_Act+"' RoundOff Value"); 
		   }else {
		  	   failReport(driver,"The chart's value should be displayed with '"+ChangeRoundOffValue+"' RoundOff Value","The chart's value displayed with '"+RoundOffValue_Act+"' RoundOff Value"); 
		   }
		   
		   if(isToggleAccessible(driver,PositionInput)) {		
		  		 passReport(driver,"'Position Input' should be accessible after enabling the 'Enable Value' toggle","'Position Input' is accessible after enabling the 'Enable Value' toggle"); 
		  		 String defaultPosition_Act=defaultSelectedValue(driver, PositionInput);
		  		 if(DefaultPositionValue_Exp.equals(defaultPosition_Act)) {
			  		 passReport(driver,"By default, '"+DefaultPositionValue_Exp+"' Should be selected in the Position Input","By default, '"+defaultPosition_Act+"' is selected in the Position Input"); 
		  		 }else {
			  		 failReport(driver,"By default, '"+DefaultPositionValue_Exp+"' Should be selected in the Position Input","By default, '"+defaultPosition_Act+"' is selected in the Position Input"); 
		  		 }
			}else {
		  		 failReport(driver,"'Position Input' should be accessible after enabling the 'Enable Value' toggle","'Position Input' is not accessible after enabling the 'Enable Value' toggle");
		  		  
			}
		   
		   //  position check
		   
		   boolean chartValuePositionAct=validateElementPosition(driver,chartBar1,chartValue_Rotation,"center");
		   if(chartValuePositionAct==true) {
		  		passReport(driver,"By default, Chart value should display center the chartbar","By default, Chart value displayed center the chartbar"); 
		   }else {
			    failReport(driver,"By default, Chart value should display center the chartbar","By default, Chart value is not displayed center the chartbar"); 
		   }
		   
		   click(driver,PositionInput);
		   selectOptionValue(driver,PositionInput,"inside");
		   mouseOverToElement(driver, ApplyButton);
		   click(driver,ApplyButton);
		   waitForElement(driver,Chart);
		   chartValuePositionAct=validateElementPosition(driver,chartBar1,chartValue_Rotation,"inside");
		   if(chartValuePositionAct==true) {
		  		passReport(driver,"Chart value should display inside the chartbar","Chart value displayed inside the chartbar"); 
		   }else {
			   failReport(driver,"Chart value should display inside the chartbar","Chart value is not displayed inside the chartbar"); 
		   }

		   selectOptionValue(driver,PositionInput,"outside");
		   mouseOverToElement(driver, ApplyButton);
		   click(driver,ApplyButton);
		   waitForElement(driver,Chart);
		   chartValuePositionAct=validateElementPosition(driver,chartBar1,chartValue_Rotation,"outside");
		   if(chartValuePositionAct==true) {
		  		passReport(driver,"Chart value should display outside the chartbar","Chart value displayed outside the chartbar"); 
		   }else {
			   failReport(driver,"Chart value should display outside the chartbar","Chart value is not displayed outside the chartbar"); 
		   }
		   
		   selectOptionValue(driver,PositionInput,"center");
		   mouseOverToElement(driver, ApplyButton);
		   click(driver,ApplyButton);
		   waitForElement(driver,Chart);
		   
		   //   position check endd
		   
	 		selectOptionValue(driver,SeperatorInput,"#,###");
	 		
	 		if(isToggleAccessible(driver,BigNumberInput)) {
	 			 failReport(driver,"'Big Number Suffix' toggle should be Inaccessible while Seperator value is selected","'Big Number Suffix' toggle is accessible while Seperator value is selected");
		  		 Assert.fail(); 
	 		}else {
				 passReport(driver,"'Big Number Suffix' toggle should be Inaccessible while Seperator value is selected","'Big Number Suffix' toggle is Inaccessible while Seperator value is selected");
	 		}
	 		
	 		selectByText(driver,SeperatorInput,"Select");

	 		if(isToggleAccessible(driver,BigNumberInput)) {
				 passReport(driver,"'Big Number Suffix' toggle should be accessible while Seperator value is not selected","'Big Number Suffix' toggle is accessible while Seperator value is not selected");
			}else {
				 failReport(driver,"'Big Number Suffix' toggle should be accessible while Seperator value is not selected","'Big Number Suffix' toggle is Inaccessible while Seperator value is not selected");
		  		 Assert.fail(); 
			}
	 		
	 		selectOptionValue(driver,ValueFormatInput,"percentage");
	 		mouseOverToElement(driver, ApplyButton);
	 	    click(driver,ApplyButton);
	 	    if(isToggleAccessible(driver,BigNumberInput)) {
				 failReport(driver,"'Big Number Suffix' toggle should be Inaccessible while 'Percentage' is selected in the Value Format input","'Big Number Suffix' toggle is accessible while 'Percentage'  is selected in the Value Format input");
		  		 Assert.fail(); 
			}else {
				 passReport(driver,"'Big Number Suffix' toggle should be Inaccessible while 'Percentage' is selected in the Value Format input","'Big Number Suffix' toggle is Inaccessible while 'Percentage'  is selected in the Value Format input");
			}

	 	    selectOptionValue(driver,ValueFormatInput,"value");
	 	    mouseOverToElement(driver, ApplyButton);
	 	    click(driver,ApplyButton); 
	 	    if(isToggleAccessible(driver,BigNumberInput)) {
				 passReport(driver,"'Big Number Suffix' toggle should be accessible while 'Percentage' is not selected in the Value Format input","'Big Number Suffix' toggle is accessible while 'Percentage' is not selected in the Value Format input");
			}else {
				 failReport(driver,"'Big Number Suffix' toggle should be accessible while 'Percentage' is not selected in the Value Format input","'Big Number Suffix' toggle is Inaccessible while 'Percentage' is not selected in the Value Format input");
		  		 Assert.fail(); 
			}
	 	   
	 	    click(driver,BigNumberInputSlider);
	 	    if(isToggleEnable(driver,BigNumberInput)) {
				 passReport(driver,"'Big Number Suffix' toggle should be enable while click on it","'Big Number Suffix' toggle is enabled while click on it");
			}else {
				 failReport(driver,"'Big Number Suffix' toggle should be enable while click on it","'Big Number Suffix' toggle is not enabled while click on it");
		  		 Assert.fail(); 
			}
	 	    
	 	    mouseOverToElement(driver, ApplyButton);
	 	    click(driver,ApplyButton);
	 	    waitForElement(driver,Chart);
	 	    //new 
	  		 chartValues=getWebElements(driver, ValueFormat_ChartValue);
			 chartValueSize=chartValues.size();
			 lastChartValue=chartValues.get(chartValueSize-3);
	  		 //new
	 	    
			 ChartValueTextAct=lastChartValue.getText();     //getText1(driver,ValueFormat_ChartValue);
	 	    if(ChartValueTextAct.endsWith("K")) {
				 passReport(driver,"The big number suffix should be applied for enabled value in charts","The big number suffix is applied for enabled value in charts");
	 	    }else {
				 failReport(driver,"The big number suffix should be applied for enabled value in charts","The big number suffix is not applied for enabled value in charts");
	 	    }
	 	    
	 	    click(driver,BigNumberInputSlider);
	 	    if(isToggleEnable(driver,BigNumberInput)) {
				 failReport(driver,"'Big Number Suffix' toggle should be disable while disabling it","'Big Number Suffix' toggle is enabled while disabling it");
		  		 Assert.fail(); 
	 	    }else {
				 passReport(driver,"'Big Number Suffix' toggle should be disable while disabling it","'Big Number Suffix' toggle is disabled while disabling it");
			}
	 	    
	 	    mouseOverToElement(driver, ApplyButton);
		    click(driver,ApplyButton);
		    waitForElement(driver,Chart);
		    //new 
	  		 chartValues=getWebElements(driver, ValueFormat_ChartValue);
			 chartValueSize=chartValues.size();
			 lastChartValue=chartValues.get(chartValueSize-3);
	  		 //new
		    
			ChartValueTextAct=lastChartValue.getText();     //getText1(driver,ValueFormat_ChartValue);
		    if(ChartValueTextAct.endsWith("K")) {
				 failReport(driver,"The big number suffix should not be applied for enabled value in charts","The big number suffix is applied for enabled value in charts");
		    }else {
				 passReport(driver,"The big number suffix should not be applied for enabled value in charts","The big number suffix is not applied for enabled value in charts");
		    }
	 	    
		    //X_AxisLabel_chart_1
//		    waitForElement(driver,Axes);
//		    click(driver,Axes);
//			 if(!isDisplayed2(driver,Axes_Expand_Check)) {
//				 click(driver,Axes);
//			 }
			
			if(isToggleEnable(driver,ShowPositive_Input)) {
				 failReport(driver,"By default, 'Show As Positive' toggle should be disable","By default, 'Show As Positive' toggle is disabled");
		  		  
		    }else {
				 passReport(driver,"By default, 'Show As Positive' toggle should be disable","By default, 'Show As Positive' toggle is enabled");
			}
			
			String X_StartValue=getText1(driver,X_AxisLabel_chart_1);
			if(X_StartValue.contains("-")) {
				 passReport(driver,"Chart should start with negative value when 'Show positive' toogle is disabled","Chart started with negative value when 'Show positive' toogle is disabled");
			}else {
				 failReport(driver,"Chart should start with negative value when 'Show positive' toogle is disabled","Chart not started with negative value when 'Show positive' toogle is disabled");
			}
			
			click(driver,ShowPositive_InputSlider);
			if(isToggleEnable(driver,ShowPositive_Input)) {
				 passReport(driver,"'Show As Positive' toggle should be enable while enabling it","'Show As Positive' toggle is enabled while enabling it");
		    }else {
				 failReport(driver,"'Show As Positive' toggle should be enable while enabling it","'Show As Positive' toggle is not enabled while enabling it");
		  		 Assert.fail(); 
		    }
	 	    
			mouseOverToElement(driver,ApplyButton);
	       	click(driver,ApplyButton);
	       	wait(driver,"1");
	       	waitForElement(driver,Chart);
	       	
	       	X_StartValue=getText1(driver,X_AxisLabel_chart_1);
			if(X_StartValue.contains("-")) {
				 failReport(driver,"Chart should start with positive value when 'Show positive' toogle is enabled","Chart not started with positive value when 'Show positive' toogle is enabled");
			}else {
				 passReport(driver,"Chart should start with positive value when 'Show positive' toogle is enabled","Chart  started with positive value when 'Show positive' toogle is enabled");
			}
			
			if(isToggleAccessible(driver,ValueRotation_Input)) {
				 passReport(driver,"Value rotation should be accessible after enabling the 'Enable Value' toggle","Value rotation is accessible after enabling the 'Enable Value' toggle");
			}else {
				 failReport(driver,"Value rotation should be accessible after enabling the 'Enable Value' toggle","Value rotation is Inaccessible after enabling the 'Enable Value' toggle");
				 Assert.fail();
			}
			
			String defaultRotationValue_Act=getText1(driver,ValueRotation_Output);
			if(DefaultRotationValue_Exp.equals(defaultRotationValue_Act)) {
				 passReport(driver,"By default, '"+DefaultRotationValue_Exp+"' should display in value rotation output","By default, '"+defaultRotationValue_Act+"' is displayed in value rotation output");
			}else {
				 failReport(driver,"By default, '"+DefaultRotationValue_Exp+"' should display in value rotation output","By default, '"+defaultRotationValue_Act+"' is displayed in value rotation output");
			}
			
			moveSlider(driver,ValueRotation_Input,ValueRotation_Output,ChangeRotataionVal_Positive);
			mouseOverToElement(driver,ApplyButton);
	       	click(driver,ApplyButton);
	       	wait(driver,"1");
	       	waitForElement(driver,Chart);
	        String chartValueRotation_Act=getRotationValue(driver,chartValue_Rotation);
	        if(chartValueRotation_Act.equals(ChangeRotataionVal_Positive)) {
			    passReport(driver,"Selected positive Rotation Angle ("+ChangeRotataionVal_Positive+") Should Update in chart value","Rotation Angle ("+chartValueRotation_Act+") is Updated in chart value");
			}else {
	  	       	failReport(driver,"Selected positive Rotation Angle ("+ChangeRotataionVal_Positive+") Should Update in chart value","Rotation Angle ("+chartValueRotation_Act+") is Updated in chart value");
			}
	        
	        moveSlider(driver,ValueRotation_Input,ValueRotation_Output,ChangeRotataionVal_Negative);
			mouseOverToElement(driver,ApplyButton);
	       	click(driver,ApplyButton);
	       	wait(driver,"1");
	       	waitForElement(driver,Chart);
	        chartValueRotation_Act=getRotationValue(driver,chartValue_Rotation);
	        if(chartValueRotation_Act.equals(ChangeRotataionVal_Negative)) {
			    passReport(driver,"Selected Negative Rotation Angle ("+ChangeRotataionVal_Negative+") Should Update in chart value","Rotation Angle ("+chartValueRotation_Act+") is Updated in chart value");
			}else {
	  	       	failReport(driver,"Selected Negative Rotation Angle ("+ChangeRotataionVal_Negative+") Should Update in chart value","Rotation Angle ("+chartValueRotation_Act+") is Updated in chart value");
			}
	        
	        mouseOverToElement(driver, DataLabels);
	        click(driver,DataLabels);
	        
	        String DataLabelsClose_Act=getAttribute1(driver, DataLabels_Expand, "class");
			 if(DataLabelsClose_Act.contains("down")) {
				passReport(driver,"Data Labels should gets collapsed when click on it" ,"Data labels gets collapsed when click on it");
			 }else {
				failReport(driver,"Data Labels should gets collapsed when click on it" ,"Data Labels not gets collapsed when click on it");
			 }

			 //******************* DataLabel Validation End ***************
			 
			 // ******************* Others Validation *********************
			 
			 verifyElementIsPresent(driver,ChartFormat_Others);
			 scrollUsingElement(driver,ChartFormat_Others);
			 String Others_Text_Act=getText1(driver,ChartFormat_Others);
			 textValidation(driver, Others_text_Exp, Others_Text_Act, ChartFormat_Others);
			 String OthersExpand=getAttribute1(driver, ChartFormat_OthersExpand, "class");
			 if(OthersExpand.contains("up")) {
				passReport(driver,"By default, 'Others' should gets Expand" ,"By default, 'Others' gets Expanded");
			 }else {
				failReport(driver,"By default, 'Others' should gets Expand" ,"By default, 'Others' not gets Expand");
				click(driver,ChartFormat_Others);
			 }
			
			 String Others_Color_Act=getTextColor(driver, ChartFormat_Others);
			 if(Others_Color_Exp.equalsIgnoreCase(Others_Color_Act)) {
				passReport(driver,"'Others' should gets highlighted in blue color "+Others_Color_Exp ,"'Others' gets highlighted in "+Others_Color_Act);
			 }else {
				failReport(driver,"'Others' should gets highlighted in blue color "+Others_Color_Exp ,"'Others' gets highlighted in "+Others_Color_Act); 
			 }
			 
		    
		    //Validation of the visibility of Others options start...
			 if (verifyElementIsPresent1(driver, StatsLine_text)) {
					String StatsLinetext_Act = getText1(driver, StatsLine_text);
					textValidation(driver, StatsLineText_Exp, StatsLinetext_Act, StatsLine_text);
			   	}
			 verifyElementIsPresent1(driver, StatsLine_Input);
			 
			 if (verifyElementIsPresent1(driver, statsLinePosition_text)) {
					String StatsLinePositiontext_Act = getText1(driver, statsLinePosition_text);
					textValidation(driver, StatsLinePositionText_Exp, StatsLinePositiontext_Act, statsLinePosition_text);
			   	}
			 verifyElementIsPresent1(driver, statsLinePosition_Input);
			 
			 if (verifyElementIsPresent1(driver, statsLineRoundOffText)) {
					String StatsLineRoundOfftext_Act = getText1(driver, statsLineRoundOffText);
					textValidation(driver, StatsRoundOffText_Exp, StatsLineRoundOfftext_Act, statsLineRoundOffText);
			   	}
			 verifyElementIsPresent1(driver, statsLineRoundOff_Input);
			 
			 if (verifyElementIsPresent1(driver, Cursor_text)) {
					String CursorText_Act = getText1(driver, Cursor_text);
					textValidation(driver, CursorText_Exp, CursorText_Act, Cursor_text);
			   	}
			 verifyElementIsPresent1(driver, Cursor_Input);
			 
			 if (verifyElementIsPresent1(driver, Export_text)) {
					String ExportText_Act = getText1(driver, Export_text);
					textValidation(driver, ExportText_Exp, ExportText_Act, Export_text);
			   	}
			 verifyElementIsPresent1(driver, Export_Input);
			 
			 String default_StatslineValueAct=defaultSelectedValue(driver, StatsLine_Input);
	  		 if(default_StatslineValueExp.equals(default_StatslineValueAct)) {
		  		 passReport(driver,"By default, '"+default_StatslineValueExp+"' Should be selected in the StatusLine Input","By default, '"+default_StatslineValueAct+"' is selected in the StatusLine Input"); 
	  		 }else {
		  		 failReport(driver,"By default, '"+default_StatslineValueExp+"' Should be selected in the StatusLine Input","By default, '"+default_StatslineValueAct+"' is selected in the StatusLine Input"); 
	  		 }
		    
	  		 
	  		if(isToggleAccessible(driver,statsLinePosition_Input)) {		
		  		 failReport(driver,"'statsLinePosition Input' should be Inaccessible when no selection is made in the stats line field","'statsLinePosition Input' is accessible when no selection is made in the stats line field"); 
			}else {
		  		 passReport(driver,"'statsLinePosition Input' should be Inaccessible when no selection is made in the stats line field","'statsLinePosition Input' is Inaccessible when no selection is made in the stats line field"); 
			}
	  		
	  		if(isToggleAccessible(driver,statsLineRoundOff_Input)) {		
		  		 failReport(driver,"'statsLineRoundOff Input' should be Inaccessible when no selection is made in the stats line field","'statsLineRoundOff Input' is accessible when no selection is made in the stats line field"); 
			}else {
		  		 passReport(driver,"'statsLineRoundOff Input' should be Inaccessible when no selection is made in the stats line field","'statsLineRoundOff Input' is Inaccessible when no selection is made in the stats line field"); 
			}
	  		
	  		if(isToggleAccessible(driver,StatsLine_Input)) {		
		  		 passReport(driver,"'StatsLine Input' should be accessible","'StatsLine Input' is accessible"); 
			}else {
		  		 failReport(driver,"'StatsLine Input' should be accessible","'StatsLine Input' is not accessible"); 
			}
	  		
	  		if(elementIsVisible(driver, statsLineColorInput)) {
		  		 failReport(driver,"'StatsLineColor Input' should not be display without enable stats line","'StatsLineColor Input' is displayed without enable stats line"); 
	 		}else {
		  		 passReport(driver,"'StatsLineColor Input' should not be display without enable stats line","'StatsLineColor Input' is not displayed without enable stats line"); 
	 		}
	  		click(driver,StatsLine_Input);
	  		String[] statLineValue= {"q1","q3","mean","median","std deviation","min","max"};
	  		
//	  		if(iteration==1) {
//	  		for(int i=0;i<statLineValue.length;i++) {
//	  			selectOptionValue(driver,StatsLine_Input,statLineValue[i]);
//	  	  		mouseOverToElement(driver, ApplyButton);
//	  	  		click(driver,ApplyButton);
//	  	  		waitForElement(driver,Chart);
//	  	  		
////	  	  		takescreenshot(driver,"/Expected_screenshot/StatLineTest/StatLine_"+statLineValue[i]);
//	  	  		takescreenshot(driver,"/Actual_screenshot/StatLineTest/StatLine_"+statLineValue[i]);
//	  			try {
//	  				imageComparison(driver, "/StatLineTest/StatLine_"+statLineValue[i], "/StatLineTest/StatLine_"+statLineValue[i]);
//	  				wait(driver, "2");
//	  			} catch (IOException e1) {
//	  				e1.printStackTrace();
//	  			}
//	  		}
//	  		
//	  		}
	  		selectOptionValue(driver,StatsLine_Input,"q1");
	  		mouseOverToElement(driver, ApplyButton);
	  		click(driver,ApplyButton);
	  		waitForElement(driver,Chart);	
	  		
	  		if(elementIsVisible(driver, statsLineColorInput)) {
		  		 passReport(driver,"'StatsLineColor Input' should be display when selecting the StatsLine Value","'StatsLineColor Input' is displayed when selecting the StatsLine Value"); 
		  		 String defaultStatsLineColor_Act=getTextJavascript(driver, statsLineColorInput);
		  		 if(defaultStatsLineColor_Exp.equals(defaultStatsLineColor_Act)) {
			  		 passReport(driver,"By default, '"+defaultStatsLineColor_Exp+"' color should display in StatsLine Color Input","By default, '"+defaultStatsLineColor_Act+"' color is display in StatsLine Color Input"); 
		  		 }else {
			  		 failReport(driver,"By default, '"+defaultStatsLineColor_Exp+"' color should display in StatsLine Color Input","By default, '"+defaultStatsLineColor_Act+"' color is display in StatsLine Color Input"); 
		  		 }
		  		 
		  		 click(driver,statsLineColorInput);
		  		 if(verifyElementIsPresent1(driver, ColorPickerOpen)) {  
		  			 scrollUsingElement(driver, ColorPickerOpen);
			  		 passReport(driver,"Stats line color should be accessible and color pannel should get opened","Stats line color is accessible and color pannel get opened"); 
			  		 click(driver,statsLineColor_text);
			  		 wait(driver,"1");
			  		 if(isDisplayed2(driver,ColorPickerOpen)) {
			  			 failReport(driver, "Color pannel should get Closed when click outside the color input", "Color pannel not Closed when click outside the color input");
			  		 }else {
			  			 passReport(driver, "Color pannel should get Closed when click outside the color input", "Color pannel Closed when click outside the color input");
			  		 }
			  		 
		  		 }else {
		  			failReport(driver,"Stats line color should be accessible and color pannel should get opened","Stats line color is not accessible and color pannel not opened"); 
		  		 }
		  		 
	  		}else {
		  		 failReport(driver,"'StatsLineColor Input' should be display when selecting the StatsLine Value","'StatsLineColor Input' is not displayed when selecting the StatsLine Value"); 
	  		}
	  		
	  		String colorAct=getTextJavascript(driver, statsLineColorInput);
	  		mouseOverToElement(driver, ApplyButton);
	  		click(driver,ApplyButton);
	  		waitForElement(driver,Chart);
	  		
	  		if(isDisplayed2(driver,StrokeLine)) {
		  		 passReport(driver,"Selected stats line option should be applied in the charts","Selected stats line option is applied in the charts"); 
	  		}else {
		  		 failReport(driver,"Selected stats line option should be applied in the charts","Selected stats line option is not applied in the charts"); 
	  		}
	  		
	  		try {
	  			 WebElement firstElement=driver.findElement(By.xpath("//input[@id='RPE_WidgetName']//following::*[name()='g' and @stroke='"+colorAct+"']"));
		  		 passReport(driver,"Selected stats line option should be applied in the charts","Selected stats line option is applied in the charts"); 
	  		}catch(Exception e) {
		  		 failReport(driver,"Selected stats line option should be applied in the charts","Selected stats line option is not applied in the charts"); 
		  		 Assert.fail();
	  		}
	 		

	  		// Position Validation start....
	  		if(isToggleAccessible(driver,statsLinePosition_Input)) {		
		  		 passReport(driver,"'StatsLinePosition Input' should be accessible when selecting the StatsLine Value","'StatsLinePosition Input' accessible when selecting the StatsLine Value"); 
			}else {
		  		 failReport(driver,"'StatsLinePosition Input' should be accessible when selecting the StatsLine Value","'StatsLinePosition Input' Inaccessible when selecting the StatsLine Value"); 
			}
	  		
	  		 String default_StatslinePosition_Act=defaultSelectedValue(driver, statsLinePosition_Input);
	  		 if(default_StatslinePosition_Exp.equals(default_StatslinePosition_Act)) {
		  		 passReport(driver,"By default, '"+default_StatslinePosition_Exp+"' Should be selected in the StatusLine Position Input","By default, '"+default_StatslinePosition_Act+"' is selected in the StatusLine Position Input"); 
	  		 }else {
		  		 failReport(driver,"By default, '"+default_StatslinePosition_Exp+"' Should be selected in the StatusLine Position Input","By default, '"+default_StatslinePosition_Act+"' is selected in the StatusLine Position Input"); 
	  		 }

	  		 if(isDisplayed2(driver,StrokeLineBehind)) {
		  		 passReport(driver,"StrokeLine should display behind the chart bars","StrokeLine displayed behind the chart bars"); 
			 }else {
		  		 failReport(driver,"StrokeLine should display behind the chart bars","StrokeLine not displayed behind the chart bars"); 
			 }
			 
	   		 selectOptionValue(driver,statsLinePosition_Input,"above");
	   	     mouseOverToElement(driver, ApplyButton);
			 click(driver,ApplyButton);
			 waitForElement(driver,Chart);
			 
			 if(isDisplayed2(driver,StrokeLineAbove)) {
		  		 passReport(driver,"StrokeLine should display Above the chart bars","StrokeLine displayed Above the chart bars"); 
			 }else {
		  		 failReport(driver,"StrokeLine should display Above the chart bars","StrokeLine not displayed Above the chart bars");
			 }
			 
			 
	  		 //position Validation
	  		 
	  		if(isToggleAccessible(driver,statsLineRoundOff_Input)) {		
		  		 passReport(driver,"'StatsLineRoundOff Input' should be accessible when selecting the StatsLine Value","'StatsLineRoundOff Input' accessible when selecting the StatsLine Value"); 
			}else {
		  		 failReport(driver,"'StatsLineRoundOff Input' should be accessible when selecting the StatsLine Value","'StatsLineRoundOff Input' Inaccessible when selecting the StatsLine Value"); 
			}
	 		
	 		 String default_RoundOffValue_Act=defaultSelectedValue(driver, statsLineRoundOff_Input);
	 		 if(default_RoundOffValue_Exp.equals(default_RoundOffValue_Act)) {
		  		 passReport(driver,"By default, '"+default_RoundOffValue_Exp+"' Should be selected in the StatusLine RoundOff Input","By default, '"+default_RoundOffValue_Act+"' is selected in the StatusLine RoundOff Input"); 
	 		 }else {
		  		 failReport(driver,"By default, '"+default_RoundOffValue_Exp+"' Should be selected in the StatusLine RoundOff Input","By default, '"+default_RoundOffValue_Act+"' is selected in the StatusLine RoundOff Input"); 
	 		 }
	 		 
	 		 selectOptionValue(driver, statsLineRoundOff_Input, ChangeRoundOffValue);
	 		 colorAct=getTextJavascript(driver, statsLineColorInput);
	 		 mouseOverToElement(driver, ApplyButton);
	  		 click(driver,ApplyButton);
	  		 waitForElement(driver,Chart);
	 		 try {
	 			 WebElement roundOffElement=driver.findElement(By.xpath("//input[@id='RPE_WidgetName']//following::*[name()='g' and @fill='"+colorAct+"']"));
	 	 		 String roundOffString=roundOffElement.getText();
	 	 		 String roundOffStringValueAct=String.valueOf(getRoundOffValue(roundOffString));
	 	 		 if(roundOffStringValueAct.equals(ChangeRoundOffValue)) {
	 		  		 passReport(driver,"StatsLine value should display with '"+ChangeRoundOffValue+"' RoundOff Value","StatsLine value displayed with '"+roundOffStringValueAct+"' RoundOff Value : "+roundOffString);  
	 	 		 }else {
	 		  		 failReport(driver,"StatsLine value should display with '"+ChangeRoundOffValue+"' RoundOff Value","StatsLine value displayed with '"+roundOffStringValueAct+"' RoundOff Value : "+roundOffString);  
	 	 		 }
	 	 		 
	 		 }catch(Exception e) {
			  		 fail(driver,"Failed to get StatsLine Value");
	 		 }
	 		 
	 		 //cursor validation start....
	 		if(isToggleEnable(driver,Cursor_Input)) {		
		  		 passReport(driver,"'Cursor Input' should be enabled by default","'Cursor Input' is enabled by default"); 
			}else {
		  		 failReport(driver,"'Cursor Input' should be enabled by default","'Cursor Input' is disabled by default"); 
			}
	 		 mouseOverToElement(driver, ApplyButton);
	  		 click(driver,ApplyButton);
	  		 waitForElement(driver,Chart);
	 		 mouseOverToElement(driver, ChartGraph);
	 		
	 		 if(isDisplayed2(driver,MouseCursor)) {
		  		 passReport(driver,"Cursor should display in chart when cursor is enable","Cursor is displayed in chart when cursor is enable"); 
	 		 }else {
		  		 failReport(driver,"Cursor should display in chart when cursor is enable","Cursor is not displayed in chart when cursor is enable");  
	 		 }
	 		
	 		//
	 		click(driver,Cursor_InputClick);
	 		if(isToggleEnable(driver,Cursor_Input)) {		
		  		 failReport(driver,"'Cursor Input' should be disable while click on it","'Cursor Input' is enable while click on it"); 
			}else {
		  		 passReport(driver,"'Cursor Input' should be disable while click on it","'Cursor Input' is disable while click on it"); 
			}
	 		 mouseOverToElement(driver, ApplyButton);
	 		 click(driver,ApplyButton);
	 		 waitForElement(driver,Chart);
			 mouseOverToElement(driver, ChartGraph);
			 if(isDisplayed2(driver,MouseCursor)) {
		  		 failReport(driver,"Cursor should not display in chart when cursor is disable","Cursor is displayed in chart when cursor is disable"); 
	 		 }else {
		  		 passReport(driver,"Cursor should not display in chart when cursor is disable","Cursor is not displayed in chart when cursor is disable");  
	 		 }
	 		
			 //cursor validation End....
	 		
	 		if(isToggleEnable(driver,Export_Input)) {		
		  		 failReport(driver,"'Export Input' should be disable by default","'Export Input' enable by default");
		  		 click(driver,Export_InputClick);
			}else {
		  		 passReport(driver,"'Export Input' should be disable by default","'Export Input' disable by default"); 
			}
	 		
	 		mouseOverToElement(driver, ApplyButton);
	 		click(driver,ApplyButton);
	 		waitForElement(driver,Chart);
	 		if(isDisplayed2(driver,ExportChartOptions)) {
		  		 failReport(driver,"'Export Options' should not be displayed in charts when Export chart is disabled","'Export Options' is displayed in charts when Export chart is disabled"); 
			}else {
		  		 passReport(driver,"'Export Options' should not be displayed in charts when Export chart is disabled","'Export Options' not displayed in charts when Export chart is disabled"); 
			}
	 		
	 		click(driver,Export_InputClick);
	 		if(isToggleEnable(driver,Export_Input)) {		
		  		 passReport(driver,"'Export Input' should be enable while enabling it","'Export Input' is enabled while enabling it");
			}else {
		  		 failReport(driver,"'Export Input' should be enable while enabling it","'Export Input' not enabled while enabling it"); 
			}
	 		
	 		mouseOverToElement(driver, ApplyButton);
	 		click(driver,ApplyButton);
	 		waitForElement(driver,Chart);
	 		if(isDisplayed2(driver,ExportChartOptions)) {
		  		 passReport(driver,"'Export Options' should be displayed in charts when Export chart is enabled","'Export Options' is displayed in charts when Export chart is enabled"); 
		  		 mouseOverToElement(driver, ExportChartOptions);
		  		 if(isDisplayed2(driver,ExportOptionExpandList)) {
			  		passReport(driver,"'Export Options' should be expand when click on it","'Export Options' is expanded when click on it"); 
			  		if(isDisplayed2(driver,Export_Image)) {
				  		 passReport(driver,"'IMG' Option should be displayed When expand the charts Export","'IMG' Option is displayed When expand the charts Export"); 
				  		 mouseOverToElement(driver, Export_Image);
				  		 
				  		if(elementIsVisible(driver,Export_PNG)) {
					  		 passReport(driver,"'PNG' Option should be displayed When Mouse hover on IMG Option","'PNG' Option displayed When Mouse hover on IMG Option"); 
			  			}else {
					  		 failReport(driver,"'PNG' Option should be displayed When Mouse hover on IMG Option","'PNG' Option is not displayed When Mouse hover on IMG Option"); 
			  			}
				  		
				  		if(elementIsVisible(driver,Export_JPG)) {
					  		 passReport(driver,"'JPG' Option should be displayed When Mouse hover on IMG Option","'JPG' Option displayed When Mouse hover on IMG Option"); 
			  			}else {
					  		 failReport(driver,"'JPG' Option should be displayed When Mouse hover on IMG Option","'JPG' Option is not displayed When Mouse hover on IMG Option"); 
			  			}
				  		
				  		if(elementIsVisible(driver,Export_SVG)) {
					  		 passReport(driver,"'SVG' Option should be displayed When Mouse hover on IMG Option","'SVG' Option displayed When Mouse hover on IMG Option"); 
			  			}else {
					  		 failReport(driver,"'SVG' Option should be displayed When Mouse hover on IMG Option","'SVG' Option is not displayed When Mouse hover on IMG Option"); 
			  			}
			  		 }else {
				  		 failReport(driver,"'IMG' Option should be displayed When expand the charts Export","'IMG' Option is not displayed When expand the charts Export"); 
			  		 }
			  		 
			  		if(isDisplayed2(driver,Export_Data)) {
				  		 passReport(driver,"'Data' Option should be displayed When expand the charts Export","'Data' Option is displayed When expand the charts Export"); 
				  		 mouseOverToElement(driver, Export_Data);
				  		 verifyElementIsPresent1(driver, Export_JSON);
				  		 verifyElementIsPresent1(driver, Export_CSV);
				  		 verifyElementIsPresent1(driver, Export_XLSX);
				  		 verifyElementIsPresent1(driver, Export_HTML);

			  		 }else {
				  		 failReport(driver,"'Data' Option should be displayed When expand the charts Export","'Data' Option is not displayed When expand the charts Export"); 
			  		 }
			  		
			  		if(isDisplayed2(driver,Export_Print)) {
				  		 passReport(driver,"'Print' Option should be displayed When expand the charts Export","'Print' Option is displayed When expand the charts Export"); 			  		 
			  		 }else {
				  		 failReport(driver,"'Print' Option should be displayed When expand the charts Export","'Print' Option is not displayed When expand the charts Export"); 
			  		 }
			  		 
		  		 }else {
			  		 failReport(driver,"'Export Options' should be expand when click on it","'Export Options' is not expanded when click on it"); 
		  		 }
			}else {
		  		 failReport(driver,"'Export Options' should be displayed in charts when Export chart is enabled","'Export Options' not displayed in charts when Export chart is enabled"); 
			}

			 
			
		// Iteration Dynamic Values getDataFromTestDataIteration

	       	
		
		
	}
}
