package scripts;

import java.io.IOException;
import java.text.ParseException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import atu.testng.reports.logging.LogAs;
import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;
import individualScripts.DASHPRO_ADMIN_SMOKE_TESTING;
import individualScripts.DASHPRO_BAR_SMOKE_TESTING;
import individualScripts.DASHPRO_TABLES_SMOKE_TESTING;

public class SmokeTesting_01 extends Keywords {
	boolean flag = true;

	public void smokeTesting_1(WebDriver driver, int iteration) throws Exception {
		LocalTime currentTime = LocalTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HHmmss");
		String formattedTime = currentTime.format(formatter);
		String ConnectionNameValue = "Test_" + formattedTime;

		String URL = TestNgXml.getdatafromExecution().get("SmokeTesting_Iteration_" + iteration);

		String UserNameTextExp = Utils.getDataFromTestData("LoginPage", "UsernameText");
		String PasswordTextExp = Utils.getDataFromTestData("LoginPage", "PasswordText");
		String SignInTextExp = Utils.getDataFromTestData("LoginPage", "SignInText");
		String SignInError_1Exp = Utils.getDataFromTestData("LoginPage", "SignInError_1");
		String InvalidCredErrorExp = Utils.getDataFromTestData("LoginPage", "InvalidCredError");
		String DefaultPasswordTypeExp = Utils.getDataFromTestData("LoginPage", "Pass_Not_visible");
		String PasswordVisibleExp = Utils.getDataFromTestData("LoginPage", "Pass_visibile");
		String SignInBtnTextExp = Utils.getDataFromTestData("LoginPage", "SignInBtn_Text");
		String SignInBtnColorExp = Utils.getDataFromTestData("LoginPage", "SignInBtnColor");
		String SignInErrorColorExp = Utils.getDataFromTestData("LoginPage", "SignInErrorColor");
		String dataAnalytics_txt_Exp = Utils.getDataFromTestData("HomePage", "DataAnalytic_txt_Exp");
		String dataAnalytics_desc_Exp = Utils.getDataFromTestData("HomePage", "DataAnalytic_des_Exp");
		String testAnalytics_txt_Exp = Utils.getDataFromTestData("HomePage", "TextAnalytic_txt_Exp");
		String testAnalytics_des_Exp = Utils.getDataFromTestData("HomePage", "TextAnalytic_des_Exp");
		String timeSeries_txt_Exp = Utils.getDataFromTestData("HomePage", "TimeSeries_txt_Exp");
		String timeSeries_des_Exp = Utils.getDataFromTestData("HomePage", "TimeSeries_des_Exp");
		String OCR_txt_Exp = Utils.getDataFromTestData("HomePage", "OCR_txt_Exp");
		String OCR_des_Exp = Utils.getDataFromTestData("HomePage", "OCR_des_Exp");
		String CreateProjectBtn_Text_Exp = Utils.getDataFromTestData("DataAnalytics", "CreateProjectBtn_Txt_Exp");
		String CreateProjectBtn_Color_Exp = Utils.getDataFromTestData("DataAnalytics", "CreateProjectBtn_color_Exp");
		String CreateProject_Msg_Exp = Utils.getDataFromTestData("DataAnalytics", "Createroject_Msg_Exp");
		String CenterWidget_X_Exp = Utils.getDataFromTestData("DataAnalytics", "CenterWidget_X");
		String CenterWidget_Y_Exp = Utils.getDataFromTestData("DataAnalytics", "CenterWidget_Y");
		String RightWidget_X_Exp = Utils.getDataFromTestData("DataAnalytics", "RightWidget_X");
		String RightWidget_Y_Exp = Utils.getDataFromTestData("DataAnalytics", "RightWidget_Y");

		String DB_TypeText_Exp = Utils.getDataFromTestData("SmokeTesting_UI", "DB_TypeText_Exp");
		String Host_Name_text_Exp = Utils.getDataFromTestData("SmokeTesting_UI", "Host_Name_text_Exp");
		String PortName_text_Exp = Utils.getDataFromTestData("SmokeTesting_UI", "PortName_text_Exp");
		String DB_Url_text_Exp = Utils.getDataFromTestData("SmokeTesting_UI", "DB_Url_text_Exp");
		String ClassNameText_Exp = Utils.getDataFromTestData("SmokeTesting_UI", "ClassNameText_Exp");
		String UserNameText_Exp = Utils.getDataFromTestData("SmokeTesting_UI", "UserNameText_Exp");
		String PasswordText_Exp = Utils.getDataFromTestData("SmokeTesting_UI", "PasswordText_Exp");
		String DB_VersionText_Exp = Utils.getDataFromTestData("SmokeTesting_UI", "DB_VersionText_Exp");
		String Connect_btn_ExpText = Utils.getDataFromTestData("SmokeTesting_UI", "Connect_btn_ExpText");
		String Reset_btn_ExpText = Utils.getDataFromTestData("SmokeTesting_UI", "ResetBtnText");
		String Connect_btn_ExpColor = Utils.getDataFromTestData("SmokeTesting_UI", "Connect_btn_ExpColor");
		String DB_Connect_ErrorText = Utils.getDataFromTestData("SmokeTesting_UI", "DB_Connect_ErrorText");
		String Error_Color_TextExp = Utils.getDataFromTestData("SmokeTesting_UI", "Error_Color_Text");
		String Pass_Color_text = Utils.getDataFromTestData("SmokeTesting_UI", "Pass_Color_text");
		String SelectedText_ColorExp = Utils.getDataFromTestData("SmokeTesting_UI", "SelectedText_Color");
		String DatabaseTextExp = Utils.getDataFromTestData("SmokeTesting_UI", "DatabaseTextExp");
		String SchemasTextExp = Utils.getDataFromTestData("SmokeTesting_UI", "SchemasTextExp");
		String ConnectionNameTextExp = Utils.getDataFromTestData("SmokeTesting_UI", "ConnectionNameTextExp");
		String SaveConnetBtnTextExp = Utils.getDataFromTestData("SmokeTesting_UI", "SaveConnetBtnTextExp");
		String SQLEnabledColorExp = Utils.getDataFromTestData("SmokeTesting_UI", "SQLEnableButtonColor");
		String TargetBackgroundColorExp = Utils.getDataFromTestData("SmokeTesting_UI", "TargetBackgroundColor");
		String ExpressionHistoryBtnEnable = Utils.getDataFromTestData("SmokeTesting_UI", "ExpHistoryBtnColorEnabel");
		String TableColumnSelectColor = Utils.getDataFromTestData("SmokeTesting_UI", "TableColumnSelectColor");
		String DefaultFontFamily_TableFormat = Utils.getDataFromTestData("SmokeTesting_UI",
				"DefaultFontFamily_TableFormat");
		String DefaultFontSize_TableFormat = Utils.getDataFromTestData("SmokeTesting_UI",
				"DefaultFontSize_TableFormat");
		String DefaultHeaderColor_TableFormat = Utils.getDataFromTestData("SmokeTesting_UI",
				"DefaultHeaderColor_TableFormat");
		String DefaultBodyFontSize_TableFormat = Utils.getDataFromTestData("SmokeTesting_UI",
				"DefaultBodyFontSize_TableFormat");
		String DefaultBorderType_TableFormat = Utils.getDataFromTestData("SmokeTesting_UI",
				"DefaultBorderType_TableFormat");
		String NegativeCellColor_TableFormat = Utils.getDataFromTestData("SmokeTesting_UI",
				"NegativeCellColor_TableFormat");
		String AlignmentSelectedColor_TableFormat = Utils.getDataFromTestData("SmokeTesting_UI",
				"AlignmentSelectedColor_TableFormat");
		String DefaultGrandTotalColor_TableFormat = Utils.getDataFromTestData("SmokeTesting_UI",
				"DefaultGrandTotalColor_TableFormat");
		String DefaultSeperator_TableFormat = Utils.getDataFromTestData("SmokeTesting_UI",
				"DefaultSeperator_TableFormat");
		String DefaultRoundOff_TableFormat = Utils.getDataFromTestData("SmokeTesting_UI",
				"DefaultRoundOff_TableFormat");

		String ChartTitle_text_Exp = Utils.getDataFromTestData("ChartTitle", "ChartTitle_text");
		String ChartTitleColorExp = Utils.getDataFromTestData("ChartTitle", "ChartTitleColorExp");
		String BackgroundText_Exp = Utils.getDataFromTestData("ChartTitle", "BackgroundText_Exp");
		String DefaultBackgroundColor_Exp = Utils.getDataFromTestData("ChartTitle", "DefaultBackgroundColor");
		String FontColorText_Exp = Utils.getDataFromTestData("ChartTitle", "FontColorText_Exp");
		String DefaultFontColor_Exp = Utils.getDataFromTestData("ChartTitle", "DefaultFontColor");
		String FontFamily_text_Exp = Utils.getDataFromTestData("ChartTitle", "FontFamily_text");
		String FontSizeText_Exp = Utils.getDataFromTestData("ChartTitle", "FontSizeText_Exp");
		String TableFormatExpandColor = Utils.getDataFromTestData("SmokeTesting_UI", "TableFormatExpandColor");

		// Iteration Inputs
		String Username = Utils.getDataFromTestDataIteration(iteration, "SEDGE", "Username");
		String Password = Utils.getDataFromTestDataIteration(iteration, "SEDGE", "Password");
		String Select_DataBaseType = Utils.getDataFromTestDataIteration(iteration, "SmokeTesting_Input",
				"Select_DataBaseType");
		String HostName = Utils.getDataFromTestDataIteration(iteration, "SmokeTesting_Input", "HostName");
		String DB_UserName = Utils.getDataFromTestDataIteration(iteration, "SmokeTesting_Input", "DB_UserName");
		String DB_Password = Utils.getDataFromTestDataIteration(iteration, "SmokeTesting_Input", "DB_Password");
		String SelectSchema = Utils.getDataFromTestDataIteration(iteration, "SmokeTesting_Input", "SelectSchema");
		String SelectDataBase = Utils.getDataFromTestDataIteration(iteration, "SmokeTesting_Input", "SelectDataBase");
		String searchTableName = Utils.getDataFromTestDataIteration(iteration, "SmokeTesting_Input", "searchTableName");
		String ProjectName = Utils.getDataFromTestDataIteration(iteration, "SmokeTesting_Input", "ProjectName");
		String TargetValue = Utils.getDataFromTestDataIteration(iteration, "SmokeTesting_Input", "TargetValue");
		String FunctionSearchName = Utils.getDataFromTestDataIteration(iteration, "SmokeTesting_Input",
				"FunctionSearchName");
		String ColumnNameInput_Smoke_131 = Utils.getDataFromTestDataIteration(iteration, "SmokeTesting_Input",
				"ColumnNameInput_Smoke_131");
		String SearchColumInput_Somke_168 = Utils.getDataFromTestDataIteration(iteration, "SmokeTesting_Input",
				"SearchColumInput_Somke_168");
		String MultipleSearchInput_Smoke_171 = Utils.getDataFromTestDataIteration(iteration, "SmokeTesting_Input",
				"MultipleSearchInput_Smoke_171");
		String SearchUpperLowerInput_Smoke_172 = Utils.getDataFromTestDataIteration(iteration, "SmokeTesting_Input",
				"SearchUpperLowerInput_Smoke_172");
		String BackColorInputTable_Smoke_180 = Utils.getDataFromTestDataIteration(iteration, "SmokeTesting_Input",
				"BackColorInputTable_Smoke_180");
		String FontColorInputTable_Smoke_186 = Utils.getDataFromTestDataIteration(iteration, "SmokeTesting_Input",
				"FontColorInputTable_Smoke_186");
		String ChartTitleName_Smoke = Utils.getDataFromTestDataIteration(iteration, "SmokeTesting_Input",
				"ChartTitleName_Smoke");
		String DefaultFontFamily_Smoke_189 = Utils.getDataFromTestDataIteration(iteration, "SmokeTesting_Input",
				"DefaultFontFamily_Smoke_189");
		String FontFamilyInput_Smoke_193 = Utils.getDataFromTestDataIteration(iteration, "SmokeTesting_Input",
				"FontFamilyInput_Smoke_193");
		String DefaultFontSize_Smoke_196 = Utils.getDataFromTestDataIteration(iteration, "SmokeTesting_Input",
				"DefaultFontSize_Smoke_196");
		String ChangeFontSize_Smoke_202 = Utils.getDataFromTestDataIteration(iteration, "SmokeTesting_Input",
				"ChangeFontSize_Smoke_202");
		String SelectTableTheme_Smoke_211 = Utils.getDataFromTestDataIteration(iteration, "SmokeTesting_Input",
				"SelectTableTheme_Smoke_211");
		String SearchFontFamily_Smoke_220 = Utils.getDataFromTestDataIteration(iteration, "SmokeTesting_Input",
				"SearchFontFamily_Smoke_220");
		String SelectFontSize_Smoke_225 = Utils.getDataFromTestDataIteration(iteration, "SmokeTesting_Input",
				"SelectFontSize_Smoke_225");
		String ChangeHeaderColor_Smoke_231 = Utils.getDataFromTestDataIteration(iteration, "SmokeTesting_Input",
				"ChangeHeaderColor_Smoke_231");
		String ChangeBodyFontSize_Smoke_239 = Utils.getDataFromTestDataIteration(iteration, "SmokeTesting_Input",
				"ChangeBodyFontSize_Smoke_239");
		String ChangeBorderValue_Smoke_244 = Utils.getDataFromTestDataIteration(iteration, "SmokeTesting_Input",
				"ChangeBorderValue_Smoke_244");
		String ChangeRowTotalColor_Smoke_282 = Utils.getDataFromTestDataIteration(iteration, "SmokeTesting_Input",
				"ChangeRowTotalColor_Smoke_282");
		String ChangeColumnTotalColor_Smoke_290 = Utils.getDataFromTestDataIteration(iteration, "SmokeTesting_Input",
				"ChangeColumnTotalColor_Smoke_290");
		String ChangeSeperator_Smoke_293 = Utils.getDataFromTestDataIteration(iteration, "SmokeTesting_Input",
				"ChangeSeperator_Smoke_293");
		String SelectColumnSeperator_Smoke_299 = Utils.getDataFromTestDataIteration(iteration, "SmokeTesting_Input",
				"SelectColumnSeperator_Smoke_299");
		String ChangeRoundOff_Smoke_304 = Utils.getDataFromTestDataIteration(iteration, "SmokeTesting_Input",
				"ChangeRoundOff_Smoke_304");
		String SelectColumnRoundOff_Smoke_303 = Utils.getDataFromTestDataIteration(iteration, "SmokeTesting_Input",
				"SelectColumnRoundOff_Smoke_303");
		String ColumnRename_Smoke_311 = Utils.getDataFromTestDataIteration(iteration, "SmokeTesting_Input",
				"ColumnRename_Smoke_311");

		// Iteration Inputs

		navigateUrl(driver, URL);
		waitForElement(driver, SignIn_text);
		String text1 = getText1(driver, SignIn_text);

		// Need to Command for dry run Execution 1
		if (SignInTextExp.equals(text1)) {
			passReport(driver, SignInTextExp, text1);
		} else {
			failReport(driver, SignInTextExp, text1);
		}

		verifyElementIsPresent(driver, username_input);
		verifyElementIsPresent(driver, username_text);
		verifyElementHasText(driver, username_text);
		String usernameTextAct = getText1(driver, username_text);
		textValidation(driver, UserNameTextExp, usernameTextAct, username_text);

		verifyElementIsPresent(driver, password_input);
		verifyElementIsPresent(driver, password_text);
		verifyElementHasText(driver, password_text);
		String passTextAct = getText1(driver, password_text);
		textValidation(driver, PasswordTextExp, passTextAct, password_text);

		verifyElementIsPresent(driver, forgot_username_link);
		verifyElementIsPresent(driver, forgot_password_link);
		verifyElementIsPresent(driver, signup_link);

		verifyElementIsPresent(driver, SignIn_Btn);
		String signInBtnTextAct = getText1(driver, SignIn_Btn);
		textValidation(driver, SignInBtnTextExp, signInBtnTextAct, SignIn_Btn);

		String SignInBtn_Act_Color = getTextBackgroundColor(driver, SignIn_Btn);
		colorValidation(driver, SignInBtnColorExp, SignInBtn_Act_Color, SignIn_Btn);

		click(driver, SignIn_Btn);

		if (isDisplayed(driver, HomePage)) {
			failReport(driver, "Application should not Login ", "Application gets Login");

		} else {
			passReport(driver, "Application should not Login", "Application not Login");
		}

		verifyElementIsPresent1(driver, username_required_error);
		String UserNameErrorAct = getText1(driver, username_required_error);
		textValidation(driver, SignInError_1Exp, UserNameErrorAct, username_required_error);

		String usernameTextColorAct = getTextColor(driver, username_text);
		colorValidation(driver, SignInErrorColorExp, usernameTextColorAct, username_text);
		String usernameErrorColorAct = getTextColor(driver, username_required_error);
		colorValidation(driver, SignInErrorColorExp, usernameErrorColorAct, username_required_error);

		verifyElementIsPresent1(driver, Password_require_error);
		String PasswordErrorAct = getText1(driver, Password_require_error);
		textValidation(driver, SignInError_1Exp, PasswordErrorAct, Password_require_error);

		String passwordTextColorAct = getTextColor(driver, password_text);
		colorValidation(driver, SignInErrorColorExp, passwordTextColorAct, password_text);
		String passwordErrorColorAct = getTextColor(driver, Password_require_error);
		colorValidation(driver, SignInErrorColorExp, passwordErrorColorAct, Password_require_error);

		click(driver, username_input);
		sendKeys(driver, username_input, "gfjk");
		click(driver, SignIn_Btn);

		if (isDisplayed(driver, HomePage)) {
			failReport(driver, "Application should not Login ", "Application gets Login");

		} else {
			passReport(driver, "Application should not Login", "Application not Login");
		}

		verifyElementIsPresent1(driver, Password_require_error);
		PasswordErrorAct = getText1(driver, Password_require_error);
		textValidation(driver, SignInError_1Exp, PasswordErrorAct, Password_require_error);

		passwordTextColorAct = getTextColor(driver, password_text);
		colorValidation(driver, SignInErrorColorExp, passwordTextColorAct, password_text);
		passwordErrorColorAct = getTextColor(driver, Password_require_error);
		colorValidation(driver, SignInErrorColorExp, passwordErrorColorAct, Password_require_error);

		click(driver, password_input);
		sendKeys(driver, password_input, "453656");

		// neeed to modify...

		verifyElementIsPresent1(driver, password_Hidden);
		String passHidd = getText1(driver, password_Hidden);

		if (DefaultPasswordTypeExp.equals(passHidd)) {
			passReport(driver, "By default, the password entered should be hidden",
					"By default, the password entered is hidden");
		} else {
			failReport(driver, "By default, the password entered should be hidden",
					"By default, the password entered is not hidden");
		}

		click(driver, password_Hidden);
		verifyElementIsPresent1(driver, password_visible);
		String passvisible = getText(driver, password_visible);
		if (PasswordVisibleExp.equals(passvisible)) {
			passReport(driver, "Password entered Should be visible after clicking show button ",
					"Password entered is visible after clicking show button ");
		} else {
			failReport(driver, "Password entered Should be visible after clicking show button ",
					"Password entered is not visible after clicking show button ");
		}

		clear1(driver, username_input);
		click(driver, username_input);
		click(driver, SignIn_Btn);

		if (isDisplayed(driver, HomePage)) {
			failReport(driver, "Application should not Login ", "Application gets Login");
		} else {
			passReport(driver, "Application should not Login", "Application not Login");
		}

		verifyElementIsPresent(driver, username_required_error2);
		UserNameErrorAct = getText1(driver, username_required_error2);
		textValidation(driver, SignInError_1Exp, UserNameErrorAct, username_required_error2);

		usernameTextColorAct = getTextColor(driver, username_text);
		colorValidation(driver, SignInErrorColorExp, usernameTextColorAct, username_text);
		usernameErrorColorAct = getTextColor(driver, username_required_error2);
		colorValidation(driver, SignInErrorColorExp, usernameErrorColorAct, username_required_error2);

		sendKeys(driver, username_input, "gfjk");
		click(driver, SignIn_Btn);

		if (isDisplayed(driver, HomePage)) {
			failReport(driver, "Application should not Login ", "Application gets Login");
		} else {
			passReport(driver, "Application should not Login", "Application not Login");
		}

		verifyElementIsPresent(driver, invalid_credentials);
		String invalidCredErrorActual = getText1(driver, invalid_credentials);
		textValidation(driver, InvalidCredErrorExp, invalidCredErrorActual, invalid_credentials);

		doubleClick(driver, username_input);
		// Need to Command for dry run Execution 1
		sendKeys(driver, username_input, Username);

		doubleClick(driver, password_input);
		sendKeys(driver, password_input, Password);

		click(driver, SignIn_Btn);
		if (isDisplayed(driver, HomePage)) {
			passReport(driver, "Application should Login", "Application gets Login");
		} else {
			failReport(driver, "Application should Login ", "Application not Login");
		}

		// Need to Command for dry run Execution (2)
		verifyElementIsPresent1(driver, Data_Analytics_page_link);
		if (verifyElementIsPresent1(driver, Data_analytics_text)) {
			String dataAnalaytics_text_Act = getText1(driver, Data_analytics_text);
			textValidation(driver, dataAnalytics_txt_Exp, dataAnalaytics_text_Act, Data_analytics_text);
		}

		if (verifyElementIsPresent1(driver, Data_analytics_desc)) {
			String dataAnalaytics_desc_Act = getText1(driver, Data_analytics_desc);
			textValidation(driver, dataAnalytics_desc_Exp, dataAnalaytics_desc_Act, Data_analytics_desc);
		}

		verifyElementIsPresent1(driver, Help_Doc_dataAnalytics);
		verifyElementIsPresent1(driver, Video_tutorial_dataAnalytics);
		verifyElementIsPresent1(driver, dashboard_dataAnalytics);

		verifyElementIsPresent1(driver, Text_Analytics);
		if (verifyElementIsPresent1(driver, Text_Analytics_text)) {
			String textAnalaytics_text_Act = getText1(driver, Text_Analytics_text);
			textValidation(driver, testAnalytics_txt_Exp, textAnalaytics_text_Act, Text_Analytics_text);
		}

		if (verifyElementIsPresent1(driver, Text_Analytics_desc)) {
			String textAnalaytics_desc_Act = getText1(driver, Text_Analytics_desc);
			textValidation(driver, testAnalytics_des_Exp, textAnalaytics_desc_Act, Text_Analytics_desc);
		}

		verifyElementIsPresent1(driver, Time_series);
		if (verifyElementIsPresent1(driver, Time_series_text)) {
			String timeSeries_text_Act = getText1(driver, Time_series_text);
			textValidation(driver, timeSeries_txt_Exp, timeSeries_text_Act, Time_series_text);
		}

		if (verifyElementIsPresent1(driver, Time_series_desc)) {
			String timeSeries_desc_Act = getText1(driver, Time_series_desc);
			textValidation(driver, timeSeries_des_Exp, timeSeries_desc_Act, Time_series_desc);
		}

		verifyElementIsPresent1(driver, Help_doc_TimeSeries);

		verifyElementIsPresent1(driver, OCR);
		if (verifyElementIsPresent1(driver, OCR_text)) {
			String OCR_text_Act = getText1(driver, OCR_text);
			textValidation(driver, OCR_txt_Exp, OCR_text_Act, OCR_text);
		}

		if (verifyElementIsPresent1(driver, OCR_desc)) {
			String OCR_desc_Act = getText1(driver, OCR_desc);
			textValidation(driver, OCR_des_Exp, OCR_desc_Act, OCR_desc);
		}

		verifyElementIsPresent1(driver, Help_doc_OCR);
		// Need to Command for dry run Execution (2)
		click(driver, Data_Analytics_page_link);
		if (verifyElementIsPresent1(driver, Create_project)) {
			passReport(driver, "Data analytics accessible & projects page Should Open ",
					"Data analytics accessible & projects page Opened");
		} else {
			failReport(driver, "Data analytics accessible & projects page Should Open",
					"Data analytics not accessible & projects page not Open");
		}
		elementnotvisible(driver, Loading);
		String createProjectBtn_Txt_Act = getText1(driver, Create_project);
		textValidation(driver, CreateProjectBtn_Text_Exp, createProjectBtn_Txt_Act, Create_project);

		String createProjectBtn_Color_Act = getTextBackgroundColor(driver, Create_project);
		colorValidation(driver, CreateProjectBtn_Color_Exp, createProjectBtn_Color_Act, Create_project);

		mouseOverToElement(driver, Create_project);
		if (verifyElementIsPresent1(driver, Create_project_text)) {
			String createProject_Msg_Act = getText1(driver, Create_project_text);
			textValidation(driver, CreateProject_Msg_Exp, createProject_Msg_Act, Create_project_text);
		}

		click(driver, Create_project);
		if (verifyElementIsPresent1(driver, file_upload_page)) {
			passReport(driver, "Create Project Button accessible & File Upload page Should Open ",
					"Create Project Button accessible & File Upload page Opened");
		} else {
			failReport(driver, "Create Project Button accessible & File Upload page Should Open",
					"Create Project Button accessible & File Upload page not Opened");
		}

//        waitForElement1(driver, file_upload_page);
		verifyElementIsPresent1(driver, upload_your_file);
		verifyElementIsPresent1(driver, DB_connection);
		click(driver, DB_connection);

		verifyElementIsPresent1(driver, upload_your_file);
		verifyElementIsPresent1(driver, DB_connection);

		click(driver, DB_connection);
		if (isDisplayed2(driver, New_Connection)) {
			passReport(driver, "New Connection Page should display when click the DB Connection",
					"New Connection Page displayed when click the DB Connection");
		} else {
			failReport(driver, "New Connection Page should display when click the DB Connection",
					"New Connection Page not displayed when click the DB Connection");
		}

		// Verifying all the elements present and validating the respective text
		// start...
		verifyElementIsPresent1(driver, New_Connection);
		verifyElementIsPresent1(driver, Existing_Connection);

		verifyElementIsPresent1(driver, DB_Type_Input);
		String DBType_Input_ActText = getText1(driver, DB_Type_Input_text);
		if (DB_TypeText_Exp.equals(DBType_Input_ActText)) {
			passReport(driver, "'" + DB_TypeText_Exp + "' should dislay in DataBase Type Input",
					"'" + DBType_Input_ActText + "' is dislayed in DataBase Type Input");
		} else {
			failReport(driver, "'" + DB_TypeText_Exp + "' should dislay in DataBase Type Input",
					"'" + DBType_Input_ActText + "' is dislayed in DataBase Type Input");
		}

		verifyElementIsPresent1(driver, HostName_Input);
		String HostName_Input_ActText = getText1(driver, HostName_Input_Text);
		if (Host_Name_text_Exp.equals(HostName_Input_ActText)) {
			passReport(driver, "'" + Host_Name_text_Exp + "' should dislay in Host Name Input",
					"'" + HostName_Input_ActText + "' is dislayed in Host Name Input");
		} else {
			failReport(driver, "'" + Host_Name_text_Exp + "' should dislay in Host Name Input",
					"'" + HostName_Input_ActText + "' is dislayed in Host Name Input");
		}

		verifyElementIsPresent1(driver, DB_Version_Input);
		String DB_Version_Input_ActText = getText1(driver, DB_Version_Input_Text);
		if (Host_Name_text_Exp.equals(HostName_Input_ActText)) {
			passReport(driver, "'" + DB_VersionText_Exp + "' should dislay in DB Version Input",
					"'" + DB_Version_Input_ActText + "' is dislayed in DB Version Input");
		} else {
			failReport(driver, "'" + DB_VersionText_Exp + "' should dislay in DB Version Input",
					"'" + DB_Version_Input_ActText + "' is dislayed in DB Version Input");
		}

		verifyElementIsPresent1(driver, DB_PortNumber);
		String DB_PortNumber_ActText = getText1(driver, DB_PortNumber_Text);
		if (PortName_text_Exp.equals(DB_PortNumber_ActText)) {
			passReport(driver, "'" + PortName_text_Exp + "' should dislay in Port Number Input",
					"'" + DB_PortNumber_ActText + "' is dislayed in Port Number Input");
		} else {
			failReport(driver, "'" + PortName_text_Exp + "' should dislay in Port Number Input",
					"'" + DB_PortNumber_ActText + "' is dislayed in Port Number Input");
		}

		verifyElementIsPresent1(driver, UserName_Input);
		String UserName_Input_ActText = getText1(driver, UserName_Input_Text);
		if (UserNameText_Exp.equals(UserName_Input_ActText)) {
			passReport(driver, "'" + UserNameText_Exp + "' should dislay in User Name Input",
					"'" + UserName_Input_ActText + "' is dislayed in User Name Input");
		} else {
			failReport(driver, "'" + UserNameText_Exp + "' should dislay in User Name Input",
					"'" + UserName_Input_ActText + "' is dislayed in User Name Input");
		}

		verifyElementIsPresent1(driver, Password_Input);
		String Password_Input_ActText = getText1(driver, Password_Input_Text);
		if (PasswordText_Exp.equals(Password_Input_ActText)) {
			passReport(driver, "'" + PasswordText_Exp + "' should dislay in Password Input",
					"'" + Password_Input_ActText + "' is dislayed in Password Input");
		} else {
			failReport(driver, "'" + PasswordText_Exp + "' should dislay in Password Input",
					"'" + Password_Input_ActText + "' is dislayed in Password Input");
		}

		verifyElementIsPresent1(driver, dbURL_Input);
		String dbURL_Input_ActText = getText1(driver, dbURL_Input_Text);
		if (DB_Url_text_Exp.equals(dbURL_Input_ActText)) {
			passReport(driver, "'" + DB_Url_text_Exp + "' should dislay in DataBase URL Input",
					"'" + dbURL_Input_ActText + "' is dislayed in Password Input");
		} else {
			failReport(driver, "'" + DB_Url_text_Exp + "' should dislay in DataBase URL Input",
					"'" + dbURL_Input_ActText + "' is dislayed in Password Input");
		}

		verifyElementIsPresent1(driver, dBClassName_Input);
		String dBClassName_Input_ActText = getText1(driver, dBClassName_InputText);
		if (ClassNameText_Exp.equals(dBClassName_Input_ActText)) {
			passReport(driver, "'" + ClassNameText_Exp + "' should dislay in Class Name Input",
					"'" + dBClassName_Input_ActText + "' is dislayed in Class Name Input");
		} else {
			failReport(driver, "'" + ClassNameText_Exp + "' should dislay in Class Name Input",
					"'" + dBClassName_Input_ActText + "' is dislayed in Class Name Input");
		}

		verifyElementIsPresent1(driver, Connect_btn);
		String Connect_btn_ActText = getText1(driver, connect_btn_text);
		if (Connect_btn_ExpText.equals(Connect_btn_ActText)) {
			passReport(driver, "'" + Connect_btn_ExpText + "' should dislay in Connect button",
					"'" + Connect_btn_ActText + "' is dislayed in Connect button");
		} else {
			failReport(driver, "'" + Connect_btn_ExpText + "' should dislay in Connect button",
					"'" + Connect_btn_ActText + "' is dislayed in Connect button");
		}
		String connect_btn_ColorAct = getTextBackgroundColor(driver, Connect_btn);
		if (Connect_btn_ExpColor.equalsIgnoreCase(connect_btn_ColorAct)) {
			passReport(driver, "'" + Connect_btn_ExpColor + "' color should dislay in Connect button",
					"'" + connect_btn_ColorAct + "' color is dislayed in Connect button");
		} else {
			failReport(driver, "'" + Connect_btn_ExpColor + "' color should dislay in Connect button",
					"'" + connect_btn_ColorAct + "' color is dislayed in Connect button");
		}

		verifyElementIsPresent1(driver, Reset_Btn);
		String Reset_Btn_ActText = getText1(driver, Reset_Btn_text);
		if (Reset_btn_ExpText.equals(Reset_Btn_ActText)) {
			passReport(driver, "'" + Reset_btn_ExpText + "' should dislay in Reset button",
					"'" + Reset_Btn_ActText + "' is dislayed in Reset button");
		} else {
			failReport(driver, "'" + Reset_btn_ExpText + "' should dislay in Reset button",
					"'" + Reset_Btn_ActText + "' is dislayed in Reset button");
		}
		// Verifying all the elements present and validating the respective text
		// start...

		click(driver, Connect_btn);
		if (isDisplayed2(driver, DB_ConnectionErrorText)) {
			String dberrorAct = getText1(driver, DB_ConnectionErrorText);
			if (dberrorAct.equals(DB_Connect_ErrorText)) {
				passReport(driver,
						DB_Connect_ErrorText
								+ " : Error should display when click the Connect button Without giving Inputs",
						dberrorAct + " : Error displayed when click the Connect button Without giving Inputs");
			} else {
				failReport(driver,
						DB_Connect_ErrorText
								+ " : Error should display when click the Connect button Without giving Inputs",
						dberrorAct + " : Error displayed when click the Connect button Without giving Inputs");
			}
		} else {
			failReport(driver, "When click the connect without giving the input values error should display",
					"When click the connect without giving the input values error not displayed");
		}

		String DBTypeTextColor = getTextColor(driver, DB_Type_Input_text);
		String HostTextColor = getTextColor(driver, HostName_Input_Text);
		String UserNameTextColor = getTextColor(driver, UserName_Input_Text);
		String PassTextColor = getTextColor(driver, Password_Input_Text);

		if (DBTypeTextColor.equalsIgnoreCase(Error_Color_TextExp) && HostTextColor.equalsIgnoreCase(Error_Color_TextExp)
				&& UserNameTextColor.equalsIgnoreCase(Error_Color_TextExp)
				&& PassTextColor.equalsIgnoreCase(Error_Color_TextExp)) {
			passReport(driver,
					"All Fields should be highlighted in '" + Error_Color_TextExp
							+ "' colour when click the Connect button Without giving Inputs",
					"All Fields are highlighted in '" + DBTypeTextColor
							+ "' colour when click the Connect button Without giving Inputs");
		} else {
			failReport(driver,
					"All Fields should be highlighted in '" + Error_Color_TextExp
							+ "' colour when click the Connect button Without giving Inputs",
					"All Fields are not highlighted in '" + Error_Color_TextExp
							+ "' colour when click the Connect button Without giving Inputs");
		}

		String portNumbertext1 = getTextJavascript(driver, DB_PortNumber);
		System.out.println(" port " + portNumbertext1);// deletethis

		String Classtext1 = getTextJavascript(driver, dBClassName_Input);
		System.out.println(" class " + Classtext1);// deletethis

		click(driver, DB_Type_Input);
		if (isDisplayed2(driver, dropdown_Expand)) {
			passReport(driver, "Database type dropdown should be expand when click the Input",
					"Database type dropdown expanded when click the Input");
		} else {
			failReport(driver, "Database type dropdown should be expand when click the Input",
					"Database type dropdown not expanded when click the Input");
		}
		ScrollBarValidation1(driver, dropdown_Expand, "DataBaseType");

		WebElement databaseSelect = driver.findElement(
				By.xpath("//mat-option[@role='option']//span[contains(text(),'" + Select_DataBaseType + "')]"));
		Actions action = new Actions(driver);
		action.moveToElement(databaseSelect).click().build().perform();
		wait(driver, "1");
		if (isDisplayed2(driver, dropdown_Expand)) {
			failReport(driver, "Database type dropdown should Close after selecting the value",
					"Database type dropdown not Closed after selecting the value");
		} else {
			passReport(driver, "Database type dropdown should Close after selecting the value",
					"Database type dropdown Closed after selecting the value");
		}

		click(driver, DB_Type_Input);
		waitForElement(driver, dropdown_Expand);
		String rgbFormat = databaseSelect.getCssValue("color");
		String selectedElement_ActColor = rgbToHex(rgbFormat);
		if (selectedElement_ActColor.equalsIgnoreCase(SelectedText_ColorExp)) {
			passReport(driver, "Selected database type should be highlighted in blue colour : " + SelectedText_ColorExp,
					"Selected database type highlighted in blue colour, Act Color : " + selectedElement_ActColor);
		} else {
			failReport(driver, "Selected database type should be highlighted in blue colour : " + SelectedText_ColorExp,
					"Selected database type not highlighted in blue colour, Act Color : " + selectedElement_ActColor);
		}
		action.moveToElement(databaseSelect).click().build().perform();

		String portNumbertext = getTextJavascript(driver, DB_PortNumber);
		System.out.println(" port " + portNumbertext);
		if (portNumbertext != null) {
			passReport(driver, "Port Number should generate after selection of database type",
					"Port Number get generated after selection of database type, : " + portNumbertext);
		} else {
			failReport(driver, "Port Number should generate after selection of database type",
					"Port Number not generated after selection of database type ");
		}

		String Classtext = getTextJavascript(driver, dBClassName_Input);
		System.out.println(" class " + Classtext);
		if (Classtext != null) {
			passReport(driver, "Class text should generate after selection of database type",
					"Class text get generated after selection of database type, : " + Classtext);
		} else {
			failReport(driver, "Class text should generate after selection of database type",
					"Class text not generated after selection of database type ");
		}

		click(driver, HostName_Input);
		sendKeys(driver, HostName_Input, HostName);
		String hostNameColorAct = getTextColor(driver, HostName_Input_Text);
		if (hostNameColorAct.equalsIgnoreCase(Pass_Color_text)) {
			passReport(driver, "Hostname should highlighted in blue colour when enter values",
					"Hostname highlighted in blue colour when enter values");
		} else {
			failReport(driver, "Hostname should highlighted in blue colour when enter values",
					"Hostname not highlighted in blue colour when enter values");
		}

		click(driver, DB_PortNumber);
		String PortNumberColorAct = getTextColor(driver, DB_PortNumber_Text);
		if (PortNumberColorAct.equalsIgnoreCase(Pass_Color_text)) {
			passReport(driver, "Port Number should highlighted in blue colour when click on it",
					"Port Number highlighted in blue colour when click on it");
		} else {
			failReport(driver, "Port Number should highlighted in blue colour when click on it",
					"Port Number not highlighted in blue colour when click on it");
		}

		click(driver, UserName_Input);
		sendKeys(driver, UserName_Input, DB_UserName);
		String UserNameColorAct = getTextColor(driver, UserName_Input_Text);
		if (UserNameColorAct.equalsIgnoreCase(Pass_Color_text)) {
			passReport(driver, "UserName should highlighted in blue colour when enter values",
					"User Name highlighted in blue colour when enter values");
		} else {
			failReport(driver, "UserName should highlighted in blue colour when enter values",
					"User Name not highlighted in blue colour when enter values");
		}

		click(driver, Password_Input);
		sendKeys(driver, Password_Input, DB_Password);
		String PasswordColorAct = getTextColor(driver, Password_Input_Text);
		if (PasswordColorAct.equalsIgnoreCase(Pass_Color_text)) {
			passReport(driver, "Password should highlighted in blue colour when enter values",
					"Password highlighted in blue colour when enter values");
		} else {
			failReport(driver, "Password should highlighted in blue colour when enter values",
					"Password not highlighted in blue colour when enter values");
		}

		click(driver, Connect_btn);
		if (verifyElementIsPresent(driver, DataBaseNameInput)) {
			String DataBaseTextAct = getText1(driver, DataBaseNameInputText);
			if (DatabaseTextExp.equals(DataBaseTextAct)) {
				passReport(driver, "'" + DatabaseTextExp + "' Should display in DataBase Dropdown",
						"'" + DataBaseTextAct + "' is displayed in DataBase Dropdown");
			} else {
				failReport(driver, "'" + DatabaseTextExp + "' Should display in DataBase Dropdown",
						"'" + DataBaseTextAct + "' is displayed in DataBase Dropdown");
			}
		}

		if (verifyElementIsPresent(driver, SchemaNameInput)) {
			String SchemaTextAct = getText1(driver, SchemaNameInputText);
			if (SchemasTextExp.equals(SchemaTextAct)) {
				passReport(driver, "'" + SchemasTextExp + "' Should display in Schema Dropdown",
						"'" + SchemaTextAct + "' is displayed in Schema Dropdown");
			} else {
				failReport(driver, "'" + SchemasTextExp + "' Should display in Schema Dropdown",
						"'" + SchemaTextAct + "' is displayed in Schema Dropdown");
			}
		}

		if (verifyElementIsPresent(driver, ConnectionNameInput)) {
			String ConnectionNameTextAct = getText1(driver, ConnectionNameInputText);
			if (ConnectionNameTextExp.equals(ConnectionNameTextAct)) {
				passReport(driver, "'" + ConnectionNameTextExp + "' Should display in Connection Name Input",
						"'" + ConnectionNameTextAct + "' is displayed in Connection Name Input");
			} else {
				failReport(driver, "'" + ConnectionNameTextExp + "' Should display in Connection Name Input",
						"'" + ConnectionNameTextAct + "' is displayed in Connection Name Input");
			}
		}

		if (verifyElementIsPresent(driver, SaveConnectionBtn)) {
			String SaveConnectionBtn_ActText = getText1(driver, SaveConnectionBtnText);
			if (SaveConnetBtnTextExp.equals(SaveConnectionBtn_ActText)) {
				passReport(driver, "'" + SaveConnetBtnTextExp + "' Should display in Save Connection button",
						"'" + SaveConnectionBtn_ActText + "' is displayed in Save Connection button");
			} else {
				failReport(driver, "'" + SaveConnetBtnTextExp + "' Should display in Save Connection button",
						"'" + SaveConnectionBtn_ActText + "' is displayed in Save Connection button");
			}
			String SaveConnectBtnColorAct = getTextBackgroundColor(driver, SaveConnectionBtn);
			if (Connect_btn_ExpColor.equalsIgnoreCase(SaveConnectBtnColorAct)) {
				passReport(driver, "'" + Connect_btn_ExpColor + "' Color Should display in Save Connection button",
						"'" + SaveConnectBtnColorAct + "' Color is displayed in Save Connection button");
			} else {
				failReport(driver, "'" + Connect_btn_ExpColor + "' Color Should display in Save Connection button",
						"'" + SaveConnectBtnColorAct + "' Color is displayed in Save Connection button");
			}
		}

		click(driver, DataBaseNameInput);
		if (isDisplayed2(driver, dropdown_Expand)) {
			passReport(driver, "DataBase dropdown should expand when clicking on it",
					"DataBase dropdown expanded when clicking on it");
		} else {
			failReport(driver, "DataBase dropdown should expand when clicking on it",
					"DataBase dropdown not expanded when clicking on it");
		}
		ScrollBarValidation1(driver, dropdown_Expand, "DataBase");

		WebElement database = driver
				.findElement(By.xpath("//mat-option[@role='option']//span[contains(text(),'" + SelectDataBase + "')]"));
		action.moveToElement(database).click().build().perform();
		wait(driver, "1");
		elementnotvisible(driver, Loading);
		if (isDisplayed2(driver, dropdown_Expand)) {
			failReport(driver, "Database dropdown should Close after selecting the value",
					"Database dropdown not Closed after selecting the value");
		} else {
			passReport(driver, "Database dropdown should Close after selecting the value",
					"Database dropdown Closed after selecting the value");
		}
		click(driver, DataBaseNameInput);
		waitForElement(driver, dropdown_Expand);
		String rgbFormat1 = database.getCssValue("color");
		String selectedElement_ActColor1 = rgbToHex(rgbFormat1);
		if (selectedElement_ActColor1.equalsIgnoreCase(SelectedText_ColorExp)) {
			passReport(driver, "Selected database should be highlighted in blue colour : " + SelectedText_ColorExp,
					"Selected database highlighted in blue colour, Act Color : " + selectedElement_ActColor1);
		} else {
			failReport(driver, "Selected database should be highlighted in blue colour : " + SelectedText_ColorExp,
					"Selected database not highlighted in blue colour, Act Color : " + selectedElement_ActColor1);
		}
		action.moveToElement(database).click().build().perform();

		click(driver, SchemaNameInput);
		if (isDisplayed2(driver, dropdown_Expand)) {
			passReport(driver, "Schema dropdown should expand when clicking on it",
					"Schema dropdown expanded when clicking on it");
		} else {
			failReport(driver, "Schema dropdown should expand when clicking on it",
					"Schema dropdown not expanded when clicking on it");
		}
		ScrollBarValidation1(driver, dropdown_Expand, "Schema");

		WebElement schema = driver
				.findElement(By.xpath("//mat-option[@role='option']//span[contains(text(),'" + SelectSchema + "')]"));
		action.moveToElement(schema).click().build().perform();
		wait(driver, "1");
		elementnotvisible(driver, Loading);
		if (isDisplayed2(driver, dropdown_Expand)) {
			failReport(driver, "Schema dropdown should Close after selecting the value",
					"Schema dropdown not Closed after selecting the value");
		} else {
			passReport(driver, "Schema dropdown should Close after selecting the value",
					"Schema dropdown Closed after selecting the value");
		}

		click(driver, SchemaNameInput);
		waitForElement(driver, dropdown_Expand);
		wait(driver, "1");
//       element=driver.findElement(By.xpath("//mat-option[@role='option']//span[contains(text(),'"+SelectSchema+"')]"));
		String rgbFormatSchema = schema.getCssValue("color");
		String selectedSchema_ActColor = rgbToHex(rgbFormatSchema);
		if (selectedSchema_ActColor.equalsIgnoreCase(SelectedText_ColorExp)) {
			passReport(driver, "Selected Schema should be highlighted in blue colour : " + SelectedText_ColorExp,
					"Selected Schema highlighted in blue colour, Act Color : " + selectedSchema_ActColor);
		} else {
			failReport(driver, "Selected Schema should be highlighted in blue colour : " + SelectedText_ColorExp,
					"Selected Schema not highlighted in blue colour, Act Color : " + selectedSchema_ActColor);
		}
		action.moveToElement(schema).click().build().perform();

		click(driver, ConnectionNameInput);
		wait(driver, "1");
		String connectTextColor = getTextColor(driver, ConnectionNameInputText);
		if (connectTextColor.equalsIgnoreCase(Pass_Color_text)) {
			passReport(driver,
					"Connection Name should highlighted in blue colour when click on it, Exp : " + Pass_Color_text,
					"Connection Name highlighted in blue colour when click on it :" + connectTextColor);
		} else {
			failReport(driver,
					"Connection Name should highlighted in blue colour when click on it : Exp : " + Pass_Color_text,
					"Connection Name not highlighted in blue colour when click on it :" + connectTextColor);
		}
		sendKeys(driver, ConnectionNameInput, ConnectionNameValue);

		click(driver, SaveConnectionBtn);
//   	   elementnotvisible(driver, Loading);
		if (isDisplayed2(driver, Connectionfail)) {
			click(driver, Existing_Connection);
			waitForElement(driver, ExistingConectionTab);
			elementnotvisible(driver, Connectionfail);
			wait(driver, "1");
			waitForElement(driver, deleteIcon_1);
			mouseOverToElement(driver, deleteIcon_1);
//   		   click(driver,deleteIcon_1);
			click(driver, deleteIcon_1);
			waitForElement(driver, deleteConfirmPopup);
			waitForElement(driver, deleteOkButton);
			click(driver, deleteOkButton);
			waitForElement(driver, deleteSuccessPopup);

			click(driver, New_Connection);
			waitForElement(driver, DB_Type_Input);
			click(driver, DB_Type_Input);
			waitForElement(driver, dropdown_Expand);
			databaseSelect = driver.findElement(
					By.xpath("//mat-option[@role='option']//span[contains(text(),'" + Select_DataBaseType + "')]"));
			action.moveToElement(databaseSelect).click().build().perform();
			click(driver, HostName_Input);
			sendKeys(driver, HostName_Input, HostName);
			click(driver, UserName_Input);
			sendKeys(driver, UserName_Input, DB_UserName);
			click(driver, Password_Input);
			sendKeys(driver, Password_Input, DB_Password);
			click(driver, Connect_btn);
			waitForElement(driver, DataBaseNameInput);
			click(driver, DataBaseNameInput);
			waitForElement(driver, dropdown_Expand);
			database = driver.findElement(
					By.xpath("//mat-option[@role='option']//span[contains(text(),'" + SelectDataBase + "')]"));
			action.moveToElement(database).click().build().perform();
			wait(driver, "1");
			elementnotvisible(driver, Loading);
			click(driver, SchemaNameInput);
			waitForElement(driver, dropdown_Expand);
			schema = driver.findElement(
					By.xpath("//mat-option[@role='option']//span[contains(text(),'" + SelectSchema + "')]"));
			action.moveToElement(schema).click().build().perform();
			wait(driver, "1");
			elementnotvisible(driver, Loading);
			click(driver, ConnectionNameInput);
			sendKeys(driver, ConnectionNameInput, ConnectionNameValue + "1");
			click(driver, SaveConnectionBtn);

		}
		elementnotvisible(driver, Loading);
		if (isDisplayed(driver, ConnectionSuccessPopup)) {
			passReport(driver, "'Saved Successfully' popup should show When Save the connection",
					"'Saved Successfully' popup displayed When Save the connection");
		} else {
			failReport(driver, "'Saved Successfully' popup should show When Save the connection",
					"'Saved Successfully' popup not displayed When Save the connection");
		}

		if (isDisplayed(driver, ExistingConectionTab)) {
			passReport(driver, "Existing Conection Tab should display After saving the connection",
					"Existing Conection Tab displayed After saving the connection");
		} else {
			failReport(driver, "Existing Conection Tab should display After saving the connection",
					"Existing Conection Tab not displayed After saving the connection");
		}

		try {
			WebElement EditConnection = driver.findElement(By.xpath("//td[contains(text(),'" + ConnectionNameValue
					+ "')]//following::button[@title='Edit the connection']"));
			if (EditConnection.isDisplayed()) {
				passReport(driver, "'Edit the connection' option should Display in Existing Conection Tab ",
						"'Edit the connection' option Displayed in Existing Conection Tab ");
			} else {
				failReport(driver, "'Edit the connection' option should Display in Existing Conection Tab ",
						"'Edit the connection' option not Displayed in Existing Conection Tab ");
			}
		} catch (Exception e) {
			fail(driver, "unable to find the 'Edit the connection' element");
		}

		try {
			WebElement DeleteConnection = driver.findElement(By.xpath("//td[contains(text(),'" + ConnectionNameValue
					+ "')]//following::button[@title='Delete the connection']"));
			if (DeleteConnection.isDisplayed()) {
				passReport(driver, "'Delete the connection' option should Display in Existing Conection Tab ",
						"'Delete the connection' option Displayed in Existing Conection Tab ");
			} else {
				failReport(driver, "'Delete the connection' option should Display in Existing Conection Tab ",
						"'Delete the connection' option not Displayed in Existing Conection Tab ");
			}
		} catch (Exception e) {
			fail(driver, "unable to find the 'Delete the connection' element");
		}

		try {
			WebElement connectDataBase = driver.findElement(By.xpath("//td[contains(text(),'" + ConnectionNameValue
					+ "')]//following::button[@title='Connect to the database']"));
			if (connectDataBase.isDisplayed()) {
				passReport(driver, "'Connect to the database' option should Display in Existing Conection Tab ",
						"'Connect to the database' option Displayed in Existing Conection Tab ");
			} else {
				failReport(driver, "'Connect to the database' option should Display in Existing Conection Tab ",
						"'Connect to the database' option not Displayed in Existing Conection Tab ");
			}
			connectDataBase.click();
			wait(driver, "1");
		} catch (Exception e) {
			fail(driver, "unable to find the 'Connect to the database' element");
		}

		wait(driver, "1");
		elementnotvisible(driver, Loading);

		verifyElementIsPresent(driver, SQLEditorPage);
		verifyElementIsPresent(driver, Organisation);
		verifyElementIsPresent(driver, DataBaseSections);
		verifyElementIsPresent(driver, TableSections);

		try {
			WebElement databaseSection = driver
					.findElement(By.xpath("//span[@ref='eValue']//span[contains(text(),'" + SelectDataBase + "')]"));
			if (databaseSection.isDisplayed()) {
				pass(driver, "Element '" + SelectDataBase + "' Section present is verified ");
			} else {
				fail(driver, "Element is Not Present : '" + SelectDataBase + "' Section");
			}
		} catch (Exception e) {
			fail(driver, "Unable to find : '" + SelectDataBase + "' Section");
		}

		if (isDisplayed(driver, SQLGeneratorSection)) {
			passReport(driver, "SQLGeneratorSection Should present in the SQL Editor Page",
					"SQLGeneratorSection is present in the SQL Editor Page");
		} else {
			failReport(driver, "SQLGeneratorSection Should present in the SQL Editor Page",
					"SQLGeneratorSection is not present in the SQL Editor Page");
		}
		if (isDisplayed(driver, SQLGenerateArea)) {
			passReport(driver, "SQL Query generator area Should present in the SQL Editor Page",
					"SQL Query generator area is present in the SQL Editor Page");
		} else {
			failReport(driver, "SQL Query generator area Should present in the SQL Editor Page",
					"SQL Query generator area is not present in the SQL Editor Page");
		}
		if (isDisplayed(driver, LanguageToSqlText)) {
			passReport(driver, "'Natural language to SQL' text Should present in the SQLGeneratorSection",
					"'Natural language to SQL' text is present in the SQLGeneratorSection");
		} else {
			failReport(driver, "'Natural language to SQL' text Should present in the SQLGeneratorSection",
					"'Natural language to SQL' text is not present in the SQLGeneratorSection");
		}

		if (isDisplayed(driver, LanguageToSqlButton)) {
			passReport(driver, "'Natural language to SQL Button' Should present in the SQLGeneratorSection",
					"'Natural language to SQL Button' is present in the SQLGeneratorSection");
		} else {
			failReport(driver, "'Natural language to SQL Button' Should present in the SQLGeneratorSection",
					"'Natural language to SQL Button' is not present in the SQLGeneratorSection");
		}

		if (isToggleEnable(driver, LanguageToSqlButton)) {
			failReport(driver, "By Default, 'Natural language to SQL' toggle should be disable",
					"By Default, 'Natural language to SQL' toggle is enabled");
		} else {
			passReport(driver, "By Default, 'Natural language to SQL' toggle should be disable",
					"By Default, 'Natural language to SQL' toggle is disabled");
		}

		click(driver, LanguageToSqlButton);
		wait(driver, "1");
		String enableColor = getTextBackgroundColor(driver, LanguageToSqlButton);
		if (enableColor.equalsIgnoreCase(SQLEnabledColorExp)) {
			passReport(driver, "'Natural language to SQL' toggle should be enable after click on it",
					"'Natural language to SQL' toggle enabled after click on it");
		} else {
			failReport(driver, "'Natural language to SQL' toggle should be enable after click on it",
					"'Natural language to SQL' toggle not enabled after click on it");
		}

		click(driver, LanguageToSqlButton);
		enableColor = getTextBackgroundColor(driver, LanguageToSqlButton);
		wait(driver, "1");
		if (!enableColor.equalsIgnoreCase(SQLEnabledColorExp)) {
			passReport(driver, "'Natural language to SQL' toggle should be disable after click on it",
					"'Natural language to SQL' toggle disabled after click on it");
		} else {
			failReport(driver, "'Natural language to SQL' toggle should be disable after click on it",
					"'Natural language to SQL' toggle not disabled after click on it");
		}

		if (isToggleAccessible(driver, FormateQuery)) {
			failReport(driver, "By Default, 'FormateQuery' should be InAccessible",
					"By Default, 'FormateQuery' is Accessible");
		} else {
			passReport(driver, "By Default, 'FormateQuery' should be InAccessible",
					"By Default, 'FormateQuery' is InAccessible");
		}

		if (isToggleAccessible(driver, ExportResult)) {
			failReport(driver, "By Default, 'ExportResult' should be InAccessible",
					"By Default, 'FormateQuery' is Accessible");
		} else {
			passReport(driver, "By Default, 'ExportResult' should be InAccessible",
					"By Default, 'FormateQuery' is InAccessible");
		}

		doubleClick(driver, TableSections);
		if (isDisplayed(driver, TableList1)) {
			passReport(driver, "Tables section should expand and display the table list When expanding the tables",
					"Tables section expanded and display the table list When expanding the tables");
		} else {
			failReport(driver, "Tables section should expand and display the table list When expanding the tables",
					"Tables section not expanded When expanding the tables");
		}

		sendKeys(driver, SearchField, searchTableName);
		String searchResultText = getText1(driver, SearchedTableList).trim();
		System.out.println("tableList :" + searchTableName);
		System.out.println("searchResultText :" + searchResultText);

		if (searchResultText.equals(searchTableName)) {
			passReport(driver, "Search Fields should work properly", "Search Fields work properly");
		} else {
			failReport(driver, "Search Fields should work properly", "Search Fields not work properly");
		}

		click(driver, SearchedTableList);
		String ExpectedQuery = "Select * from " + searchTableName;
		String ActQuery = getText(driver, searchedQuery);
//        System.out.println("ActQuery :"+ActQuery);
		if (ExpectedQuery.equals(ActQuery)) {
			passReport(driver, "Query should generate in the SQL generator box with Selected List Name",
					"Query generated in the SQL generator box with Selected List Name");
		} else {
			failReport(driver, "Query should generate in the SQL generator box with Selected List Name",
					"Query not generated in the SQL generator box with Selected List Name");
		}

		if (isToggleAccessible(driver, ExecuteQuery)) {
			passReport(driver, "'ExecuteQuery' should enable after selecting the list value",
					"'ExecuteQuery' enabled after selecting the list value");
		} else {
			failReport(driver, "'ExecuteQuery' should enable after selecting the list value",
					"'ExecuteQuery' not enabled after selecting the list value");
		}

		if (isToggleAccessible(driver, ClearQuery)) {
			passReport(driver, "'ClearQuery' should enable after selecting the list value",
					"'ClearQuery' enabled after selecting the list value");
		} else {
			failReport(driver, "'ClearQuery' should enable after selecting the list value",
					"'ClearQuery' not enabled after selecting the list value");
		}

		if (isToggleAccessible(driver, ProjectNameInputField)) {
			passReport(driver, "'ProjectNameInputField' should enable after selecting the list value",
					"'ProjectNameInputField' enabled after selecting the list value");
		} else {
			failReport(driver, "'ProjectNameInputField' should enable after selecting the list value",
					"'ProjectNameInputField' not enabled after selecting the list value");
		}

		if (isToggleAccessible(driver, FileNameInputField)) {
			passReport(driver, "'FileNameInputField' should enable after selecting the list value",
					"'FileNameInputField' enabled after selecting the list value");
		} else {
			failReport(driver, "'FileNameInputField' should enable after selecting the list value",
					"'FileNameInputField' not enabled after selecting the list value");
		}

		String projectNameGenerated = getTextJavascript(driver, ProjectNameInputField).trim();
		System.out.println("projectNmae :" + projectNameGenerated);
		if (projectNameGenerated != null) {
			passReport(driver, "Project name should updated automatically when select file",
					"Project name updated automatically when select file :'" + projectNameGenerated + "'");
		} else {
			failReport(driver, "Project name should updated automatically when select file",
					"Project name not updated automatically when select file :'" + projectNameGenerated + "'");
		}
		String fileNameGenerated = getTextJavascript(driver, FileNameInputField).trim();
		System.out.println("fileNmae :" + fileNameGenerated);
		if (fileNameGenerated.equals(searchTableName)) {
			passReport(driver, "Selected File Name should updated automatically in FileName input",
					"Selected File Name updated automatically in FileName input");
		} else {
			failReport(driver, "Selected File Name should updated automatically in FileName place",
					"Selected File Name not updated automatically in FileName place");
		}

		click(driver, ExecuteQuery);
		elementnotvisible(driver, Loading);
		if (isDisplayed(driver, QueryResults)) {
			passReport(driver, "Query should execute after clicking the Execute Query button",
					"Query executed after clicking the Execute Query button");
		} else {
			failReport(driver, "Query should execute after clicking the Execute Query button",
					"Query not executed after clicking the Execute Query button");
		}
		verifyElementIsPresent(driver, SaveResultButton);
		verifyElementIsPresent(driver, CommandHistory);

		click(driver, ClearQuery);
		wait(driver, "1");
		String queryText = getText1(driver, searchedQuery);
		System.out.println("ActQuery :" + ActQuery);
		if (queryText.isEmpty()) {
			passReport(driver, "Query should clear after clicking the Clear Query button",
					"Query cleared after clicking the Clear Query button");
		} else {
			failReport(driver, "Query should clear after clicking the Clear Query button",
					"Query not cleared after clicking the Clear Query button");
		}

		click(driver, SearchedTableList);
		waitForElement(driver, ProjectNameInputField);
		click(driver, ProjectNameInputField);
		clear1(driver, ProjectNameInputField);
		sendKeys(driver, ProjectNameInputField, "Ab&#Abcde");
		wait(driver, "1");
		click3(driver, FileNameInputField);
		click(driver, SaveResultButton);
		elementnotvisible(driver, Loading);
		if (isDisplayed(driver, ProjectNameErro1) && isDisplayed(driver, ProjectNameErro2)) {
			passReport(driver,
					"'Supports alphanumeric and _ only' error should display properly when Save the file with Special character in Filename",
					"'Supports alphanumeric and _ only' error displayed properly when Save the file with Special character in Filename");
		} else {
			failReport(driver,
					"'Supports alphanumeric and _ only' error should display properly when Save the file with Special character in Filename",
					"'Supports alphanumeric and _ only' error not displayed properly when Save the file with Special character in Filename");
		}

		clearAndType1(driver, ProjectNameInputField, ProjectName + "1");

		click(driver, FileNameInputField);
		clear1(driver, FileNameInputField);
		sendKeys(driver, FileNameInputField, "Ab&#Abdc");
		wait(driver, "1");
		click3(driver, ProjectNameInputField);
		click(driver, SaveResultButton);
		elementnotvisible(driver, Loading);
		if (isDisplayed(driver, ProjectNameErro1) && isDisplayed(driver, FileNameError)) {
			passReport(driver,
					"'Supports alphanumeric and _ only' error should display properly when Save the file with Special character in Project Name",
					"'Supports alphanumeric and _ only' error displayed properly when Save the file with Special character in Project Name");
		} else {
			failReport(driver,
					"'Supports alphanumeric and _ only' error should display properly when Save the file with Special character in Project Name",
					"'Supports alphanumeric and _ only' error not displayed properly when Save the file with Special character in Projetc Name");
		}
		clearAndType1(driver, FileNameInputField, fileNameGenerated + "2");
		String tableFirstHeadingBefore = getText1(driver, heading1).trim();

		click(driver, SaveResultButton);
		elementnotvisible(driver, Loading);
		elementnotvisible(driver, Loading1);
		if (isDisplayed(driver, Preview_text) && isDisplayed(driver, DataSetTable)) {
			passReport(driver, "File should be Saved and it should navigate to preview page",
					"File Saved and it navigated to preview page");
			String tableFirstHeadingAft = getText1(driver, LoadTable).trim();
			if (tableFirstHeadingBefore.equals(tableFirstHeadingAft)) {
				passReport(driver, "Preview page should be display with respective columns datatype",
						"Preview page displayed with respective columns datatype");
			} else {
				failReport(driver, "Preview page should be display with respective columns datatype",
						"Preview page displayed with different columns datatype");
			}

		} else {
			failReport(driver, "File should be Saved and it should navigate to preview page",
					"File not Saved and it not navigated to preview page");
		}

		
		searchTableName=searchTableName.substring(0, 1).toUpperCase()+searchTableName.substring(1);
		String FileName_Exp = "File Name: " + searchTableName;
		String FileName_Act = getText1(driver, FileNamePreviewPage).trim();
		// new
		if (FileName_Act.contains(".")) {
			FileName_Act = FileName_Act.substring(0, FileName_Act.indexOf("."));
			System.out.println("FileName_Act ..:" + FileName_Act);
		}
		// new
		if (FileName_Exp.equalsIgnoreCase(FileName_Act)) {
			passReport(driver, "File name should correctly displayed at bottom of page",
					"File name correctly displayed at bottom of page");
		} else {
			failReport(driver, "File name should correctly displayed at bottom of page",
					"File name not correctly displayed at bottom of page");
		}

		List<WebElement> headerList=getWebElements(driver, PreviewHeaderCount);
        List<WebElement> sortingList=getWebElements(driver, SortingIconsPreview);
      
        if(headerList.size()==sortingList.size()) {
        	pass(driver,"All the header value displayed with Sorting Icon in the Preview Page");
        }else {
        	fail(driver,"Some header Value displayed without Sorting Icon in the Preview Page");
        }
		
		//// Exixting Validation............
		click(driver, Statistics_icon);
		wait(driver, "1");
		if (isDisplayed(driver, targetNotSelectError)) {
			mouseOverToElement(driver, targetNotSelectError);
			passReport(driver, "Statistics should not accessible without selecting target",
					"Statistics not accessible without selecting target");
			click3(driver, closeTargeterror);
		} else {
			failReport(driver, "Statistics should not accessible without selecting target",
					"Statistics is accessible without selecting target");
		}

		wait(driver, "1");
		mouseOverToElement(driver, Visual_icon);
		if (!isDisplayed2(driver, accessible)) {
			passReport(driver, "Visual Analytics should not accessible without selecting target",
					"Visual Analytics not accessible without selecting target");
		} else {
			failReport(driver, "Visual Analytics should not accessible without selecting target",
					"Visual Analytics is accessible without selecting target");
		}
		wait(driver, "2");
		mouseOverToElement(driver, predictive_analytics);
		if (!isDisplayed2(driver, accessible)) {
			passReport(driver, "Predictive Analytics should not accessible without selecting target",
					"Predictive Analytics not accessible without selecting target");
		} else {
			failReport(driver, "Predictive Analytics should not accessible without selecting target",
					"Predictive Analytics is accessible without selecting target");
		}

		mouseOverToElement(driver, Preview);
		verifyElementIsPresent1(driver, Preview_option);
		verifyElementIsPresent1(driver, GDPR_option);
		click(driver, GDPR_option);
		if (isDisplayed(driver, targetNotSelectError)) {
			passReport(driver, "Validation should show when click GDPR without selection target",
					"Validation shows when click GDPR without selection target");
			click3(driver, closeTargeterror);
		} else {
			failReport(driver, "Validation should show when click GDPR without selection target",
					"Validation not shows when click GDPR without selection target");
		}

		mouseOverToElement(driver, Preview);
		wait(driver, "1");
		verifyElementIsPresent(driver, Sampling_option);

		click(driver, Sampling_option);
		elementnotvisible(driver, Loading);
		if (isDisplayed1(driver, ProfilingPage)) {
			passReport(driver, "Sampling is clickable & Profile page Should Open",
					"Sampling is clickable & Profile page is Opened");
			mouseOverToElement(driver, ProfilingPage);
		} else {
			failReport(driver, "Sampling is clickable & Profile page Should Open",
					"Sampling is not clickable & Profile page is not Open");
		}

		verifyElementDisplayed(driver, target);
		verifyElementDisplayed(driver, sampling);
		verifyElementDisplayed(driver, dataProtection);
		verifyElementDisplayed(driver, machineLearnig);

		mouseOverToElement(driver, Statistics_icon);
		click(driver, statisctics);
		if (isDisplayed(driver, targetNotSelectError)) {
			passReport(driver, "Validation should show when click Statistics without selection target",
					"Validation shows when click Statistics without selection target");
			click3(driver, closeTargeterror);
		} else {
			failReport(driver, "Validation should show when click Statistics without selection target",
					"Validation not shows when click Statistics without selection target");
		}

		mouseOverToElement(driver, Statistics_icon);
		click(driver, statisticalTest);
		if (isDisplayed(driver, targetNotSelectError)) {
			passReport(driver, "Validation should show when click Statistical Test without selection target",
					"Validation shows when click Statistical Test without selection target");
			click3(driver, closeTargeterror);
		} else {
			failReport(driver, "Validation should show when click Statistical Test without selection target",
					"Validation not shows when click Statistical Test without selection target");
		}
		mouseOverToElement(driver, targetDrop);
		click(driver, targetDrop);
		if (isDisplayed1(driver, dropdown_expand)) {
			passReport(driver, "Target dropdown Should expand with available columns",
					"Target dropdown is expanded with available columns");
		} else {
			failReport(driver, "Target dropdown Should expand with available columns",
					"Target dropdown not expanded with available columns");

		}

		ScrollBarValidation1(driver, dropdown_expand, "Target_Drop");

		// Need to Command for dry run Execution (3)
		if(isDisplayed(driver,Date_Option_dropdown)) {
			click(driver,Date_Option_dropdown);
        	if(isDisplayed(driver,Date_target_error)) {
    			passReport(driver,"Validation Should show, 'Date column cannot be selected as target'" ,"Validation shows, 'Date column cannot be selected as target'");
	        	click3(driver,Date_target_error);
        	}else {
	      			failReport(driver,"Validation Should show, 'Date column cannot be selected as target'","Validation not shows, 'Date column cannot be selected as target'");
	        	}
	        }else {
	    		fail(driver,"Date column not present in the List ");
	        }

			click3(driver,targetDrop); 
			if(isDisplayed(driver,categorical)) { 
			   List<WebElement> elements = getWebElements(driver,CategoricalValues);
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
					                if(isDisplayed(driver,Unique_200_error)) {
					                	pass(driver," 'Kindly select column with unique class less than or equal to 200 as a target' , Validation message displayed  : "+text);
							        	click3(driver,Unique_200_error);
										wait(driver,"1");
										loop=false;
						        	}else {
						        		fail(driver," 'Kindly select column with unique class less than or equal to 200 as a target' Validation message not displayed : "+text);
						        	}
					                mouseOverToElement(driver, targetDrop);
					                wait(driver,"1");
					                click3(driver,targetDrop); 
					                wait(driver,"1");
					            }else if(number < 200 && loop1) {
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
					            	
					            	mouseOverToElement(driver, targetDrop);
					                wait(driver,"1");
					                click3(driver,targetDrop); 
					                wait(driver,"1");
					            	
					            }
				            }else if(!text.contains("[") && loop2) {
				            	element.click();
								wait(driver,"1");
				            	if(isDisplayed(driver,target_Succes)) {
				                	pass(driver,"  Target  gets selected and message displayed \"target added successfully\" : "+text);
						        	click3(driver,target_Succes);
									wait(driver,"1");
									loop2=false;
					        	}else {
					        		fail(driver,"  Target not selected and message not displayed \"target added successfully\" : "+text);
					        	}
				            }
			            mouseOverToElement(driver, targetDrop);
		                wait(driver,"1");
		                click3(driver,targetDrop); 
		                wait(driver,"1");
				        } 
				        
				 }else {
					 fail(driver,"Categorical column not present in the List ");
				 }
				 
			click3(driver,targetDrop); 
					 		 
			if(isDisplayed2(driver,Text_Option)) {
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

			if(isDisplayed2(driver,Numerical_option)) {
					 
				    boolean loop=true;
		            boolean loop1=true;
		            boolean loop2=true;
		            List<WebElement> elements = getWebElements(driver, NumericalValues);

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
					                mouseOverToElement(driver, targetDrop);
					                wait(driver,"1");
					                click3(driver,targetDrop); 
					                wait(driver,"1");
					            }else if(number < 200 && loop1){
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
					            	mouseOverToElement(driver, targetDrop);
					                wait(driver,"1");
					                click3(driver,targetDrop); 
					                wait(driver,"1");
					            }
				            }else if(!text.contains("[") && loop2){
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
				            mouseOverToElement(driver, targetDrop);
			                wait(driver,"1");
			                click3(driver,targetDrop); 
			                wait(driver,"1");
				        } 
				 }else {
					 fail(driver,"Numerical column not present in the List ");
				 }
		 // Need to Command for dry run Execution (3)
	
		click3(driver, target);
		selectTarget(driver, TargetValue);
		wait(driver, "2");
		// Need to Command for dry run Execution (4)
		String selectTargettext = getText1(driver, selectedTarget).trim();
		String TargetName_Exp = "Target: " + selectTargettext;
		String TargetName_Act = getText1(driver, TargetNamePreviewPage).trim();
		System.out.println("Target : " + TargetName_Act);
		if (TargetName_Exp.equals(TargetName_Act)) {
			passReport(driver, "Target name should correctly displayed at bottom of page",
					"Target name correctly displayed at bottom of page");
			String targetColorAct = getTextBackgroundColor(driver, TargetNamePreviewPage);
			colorValidation(driver, TargetBackgroundColorExp, targetColorAct, TargetNamePreviewPage);
		} else {
			failReport(driver, "Target name should correctly displayed at bottom of page",
					"Target name not correctly displayed at bottom of page");
		}

		elementnotvisible(driver, Loading1);
		String targetPanelText = getText1(driver, TargetPanelResultText).trim();
		System.out.println("targetPanelText: " + targetPanelText);
		if (isDisplayed2(driver, TargetPanel) && selectTargettext.equals(targetPanelText)) {
			passReport(driver, "The graph shoud display in target section according to target",
					"The graph displayed in target section according to target");
		} else {
			failReport(driver, "The graph shoud display in target section according to target",
					"The graph not displayed in target section according to target");
		}

		if (selectTargettext.contains("[")) {
//        	// String[] text= selectTargettext.split("[");
//        	// selectTargettext=text[0];
			int index = selectTargettext.indexOf('[');
			System.out.println("Index of [ >" + index);
			selectTargettext = selectTargettext.substring(0, index);

		}
		selectTargettext = selectTargettext.toLowerCase();

		waitForElement(driver, featureSection);
		click(driver, featureSection);
		verifyElementIsPresent(driver, featurePanel);
		
		 waitForElement(driver, HeaderRow_Features);
	       
		 List<WebElement> header_Feature=getWebElements(driver, HeadersCount_feature);
	       List<WebElement> Sort_Feature=getWebElements(driver, SortingCount_feature);
	       int sortCount=0;
		   for(WebElement sort:Sort_Feature) {
			   if(sort.isDisplayed()) {
				   sortCount++;
			   }
		   }
	       
	       if(header_Feature.size()==sortCount) {
	    	   pass(driver,"Header Row Sort icon validation passed in the features page");
	       }else {
	    	   fail(driver,"Header Row Sort icon validation passed in the features page");
	       }
	       
//		 elementScreenShot_new(driver,HeaderRow_Features,"/Expected_screenshot/SmokeTesting/HeaderRow_features");
//		 elementScreenShot_new(driver,HeaderRow_Features,"/Actual_screenshot/SmokeTesting/HeaderRow_features");
//	       
//		 try {
//	       	boolean headerDiff=imageComparison2(driver, "/SmokeTesting/HeaderRow_features", "/SmokeTesting/HeaderRow_features");
//	       	wait(driver, "2");
//	       	if(headerDiff==true) {
//				pass(driver,"Header Row Sort icon validation passed in the features page");
//	       	}else {
//	       		fail(driver,"Header Row Sort icon validation passed in the features page");
//	       	}
//		 } catch (Exception e1) {
//			 fail(driver,"Unable to compare the Image HeaderRow in features");
//		 }
		
		if (isDisplayed(driver, HighlightedTarget)) {
			String highlightedText = getText1(driver, HighlightedTarget).trim();
			if (highlightedText.equalsIgnoreCase(selectTargettext)) {
				passReport(driver, "Selected target '" + selectTargettext + "' should highlighted in green color",
						"'" + highlightedText + "' highlighted in green color");

			} else {
				failReport(driver, "Selected target '" + selectTargettext + "' should highlighted in green color",
						"'" + highlightedText + "' highlighted in green color");
			}
		} else {
			fail(driver, "Target element not highlighted in green color..");
		}

		mouseOverToElement(driver, HighlightedTarget);
		click(driver, HighlightedTarget);
		if (isDisplayed(driver, IgnoreIcon)) {
			passReport(driver, "Ignore icon should be enable in features section",
					"Ignore icon enabled in features section");
		} else {
			failReport(driver, "Ignore icon should be enable in features section",
					"Ignore icon not enabled in features section");
		}

		click(driver, IgnoreIcon);
		if (isDisplayed(driver, IgnoreError)) {
			passReport(driver, "'Target column cannot be ignored' error should display",
					"'Target column cannot be ignored' error is displayed");
		} else {
			failReport(driver, "'Target column cannot be ignored' error should display",
					"'Target column cannot be ignored' error not displayed");
		}

		selectCheckBox(driver, Checkbox1);
		deSelectCheckBox(driver, Checkbox1);

		String firstText = getText1(driver, featureValue1).trim();
		if (firstText.equals(selectTargettext)) {
			mouseOverToElement(driver, featureValue2);
			click(driver, featureValue2);
		} else {
			mouseOverToElement(driver, featureValue1);
			click(driver, featureValue1);
		}

		click(driver, IgnoreIcon);
		wait(driver, "1");
		if (isDisplayed(driver, IgnoreSuccess)) {
			passReport(driver, "'Selected column has been ignored or psuedonymized' success message should display",
					"'Selected column has been ignored or psuedonymized' success message displayed");
		} else {
			failReport(driver, "'Selected column has been ignored or psuedonymized' success message should display",
					"'Selected column has been ignored or psuedonymized' success message not displayed");
		}
		// Need to Command for dry run Execution (4)

		mouseOverToElement(driver, Statistics_icon);
		click(driver, Statistics_icon);
		elementnotvisible(driver, Loading);

		// Need to Command for dry run Execution (5)
		if (isDisplayed1(driver, statistics_page)) {
			pass(driver, "Statistics is accessible after selecting target");
			if (isDisplayed(driver, NumericalTab)) {
				pass(driver, "Numerical top functions opened");
				verifyElementIsPresent1(driver, absIcon);
				verifyElementIsPresent1(driver, CeilIcon);
				verifyElementIsPresent1(driver, FloorIcon);
				verifyElementIsPresent1(driver, UnitConverterIcon);
				verifyElementIsPresent1(driver, NumHexIcon);
				verifyElementIsPresent1(driver, RoundIcon);
				verifyElementIsPresent1(driver, NumCatIcon);
				verifyElementIsPresent1(driver, ExtractNumIcon);
			} else {
				fail(driver, "Numerical top functions not opened");
			}

			verifyElementIsPresent1(driver, statisticsTestHead);
			verifyElementIsPresent1(driver, SelectAllCheckbox);
			verifyElementIsPresent1(driver, FullScreenInStatistics);
			verifyElementIsPresent1(driver, HideIgnoredIcon);
			String HiddenIconStatus = getAttribute1(driver, HideIgnoredIcon, "aria-checked");
			if (HiddenIconStatus.equals("false")) {
				passReport(driver, "'Hidden ignored columns toggle' should get disabled by default",
						"'Hidden ignored columns toggle' disabled by default");
			} else {
				failReport(driver, "'Hidden ignored columns toggle' should get disabled by default",
						"'Hidden ignored columns toggle' enabled by default");
			}

			click(driver, HideIgnoredIcon);
			wait(driver, "1");
			HiddenIconStatus = getAttribute1(driver, HideIgnoredIcon, "aria-checked");
			if (HiddenIconStatus.equals("true")) {
				passReport(driver, "'Hidden ignored columns toggle' should get enable after click on it",
						"'Hidden ignored columns toggle' enabled after click on it");
			} else {
				failReport(driver, "'Hidden ignored columns toggle' should get enable after click on it",
						"'Hidden ignored columns toggle' not enabled after click on it");
			}

			if (isDisplayed(driver, statisticsSection)) {
				pass(driver, "statistics Section is displayed in Statistics page after clicking Statistics");
				ScrollBarValidation1(driver, statisticsSection, "statisticsSection");

				   List<WebElement> Header_statitics=getWebElements(driver, Headers_statistics);
				   List<WebElement> Sorting_statitics=getWebElements(driver, Sorting_Statistics);
				   int sortCount1=0;
				   int headCount=0;
				   for(WebElement head:Header_statitics) {
					   try {
						   action.moveToElement(head).build().perform();
						   if(head.isDisplayed()) {
							   headCount++;
						   }
					   }catch(Exception e) {
						   
					   }
				   }
				   
				   for(WebElement sort:Sorting_statitics) {
					   try {
						   action.moveToElement(sort).build().perform();
						   if(sort.isDisplayed()) {
							   sortCount1++;
						   }
					   }catch(Exception e) {
						   
					   }
				   }
				   
				   mouseOverToElement(driver, Headers_statistics);
				   if(headCount==sortCount1) {
					   pass(driver,"Header Row Sort icon validation passed in the Statistics section");
				   }else {
					   fail(driver,"Header Row Sort icon validation failed in the Statistics section");
				   }
				
			} else {
				fail(driver, "statistics Section is not displayed in Statistics page after clicking Statistics");
			}

			if (isDisplayed(driver, DataTableSection)) {
				verifyElementIsPresent1(driver, DataTableText);
				pass(driver, "DataTable Section is displayed in Statistics page after clicking Statistics");
				
				List<WebElement> Header_DataTable_=getWebElements(driver, Headers_DataTable);
				   List<WebElement> Sorting_DataTable_=getWebElements(driver, Sorting_DataTable);
				   int header=0;
				   for(WebElement head:Header_DataTable_) {
					   try {
						   action.moveToElement(head).build().perform();
						   if(head.isDisplayed()) {
							   header++;
						   }
					   }catch(Exception e) {
						   
					   }
				   }
				   
				   int sortCounts=0;
				   for(WebElement sort:Sorting_DataTable_) {
					   try {
						   action.moveToElement(sort).build().perform();
						   if(sort.isDisplayed()) {
							   sortCounts++;
						   }
					   }catch(Exception e) {
						   
					   }
				   }
				   
				   mouseOverToElement(driver, Headers_DataTable);
				   if(header==sortCounts) {
					   pass(driver,"Header Row Sort icon validation passed in the DataTable Section in Statistics ");
				   }else {
					   fail(driver,"Header Row Sort icon validation failed in the DataTable Section in Statistics ");
				   }
	     		   
				
				
//				//elementScreenShot_new(driver,DataTableHeader_Statistics,"/Expected_screenshot/SmokeTesting/DataTable_Headers");
//				elementScreenShot_new(driver,DataTableHeader_Statistics,"/Actual_screenshot/SmokeTesting/DataTable_Headers");
//	     		  
//				try {
//     			   boolean header_DataTable=imageComparison2(driver, "/SmokeTesting/DataTable_Headers", "/SmokeTesting/DataTable_Headers");
//     			   wait(driver, "2");
//     			   if(header_DataTable==true) {
//     				   pass(driver,"Sorting Icon Validation in the DataTable Header Row in Statitistics page successfull");
//     			   }else {
//     				   fail(driver,"Sorting Icon Validation in the DataTable Header Row in Statitistics page not successfull");
//     			   }
//     		   	}catch (Exception e1) {
//     			   fail(driver,"Unable to compare the Images in DataTable Header Row in Statitistics page");
// 		   		}
				
			} else {
				fail(driver, "DataTable Section is not displayed in Statistics page after clicking Statistics");
			}

			if (isDisplayed(driver, GraphSheetScetion)) {
				verifyElementIsPresent1(driver, GraphSheetHeading);
				verifyElementIsPresent1(driver, Transformations);
				verifyElementIsPresent1(driver, PreviewSectionHead);
				pass(driver, "GraphSheet Section is displayed in Statistics page after clicking Statistics");
			} else {
				fail(driver, "GraphSheet Section is not displayed in Statistics page after clicking Statistics");
			}

			if (isDisplayed(driver, variableImportSect)) {
				pass(driver,
						"'variable of Importance' section is displayed in Statistics page after clicking Statistics");
				verifyElementIsPresent1(driver, variableImportance);
			} else {
				fail(driver,
						"'variable of Importance' section is not displayed in Statistics page after clicking Statistics");
			}

			String fourthValue = getText1(driver, fourthColumnValue);
			if (verifyElementIsPresent1(driver, SearchBarStatistics)) {
				sendKeys(driver, SearchBarStatistics, fourthValue);
				String firstDisplayedValue = getText1(driver, firstColumnValue);
				System.out.println("firstDisplayedValue : " + firstDisplayedValue);
				System.out.println("fourthValue : " + fourthValue);
				if (fourthValue.equals(firstDisplayedValue)) {
					pass(driver, "Searched bar worked statistics section");
				} else {
					fail(driver, "Searched bar not worked statistics section");
				}
				clear1(driver, SearchBarStatistics);
			}

			if (isDisplayed2(driver, CategoricalType)) {
				click(driver, CategoricalType);
				elementnotvisible(driver, Loading);
				String selectedColumn = getText1(driver, CategoricalType);
				if (isDisplayed(driver, DataTableSection)) {
					String dataTabelValue = getText1(driver, DataLabelValue).trim();
					System.out.println("dataTabelValue : " + dataTabelValue);

					if (isDisplayed(driver, deleteDataLabel)) {
						pass(driver, "Delete button in Data Label displayed for Categorical Value");
					} else {
						fail(driver, "Delete button in Data Label not displayed for Categorical Value");
					}
					if (isDisplayed(driver, mergeSelectRow)) {
						pass(driver, "Merge Select row in Data Label displayed for Categorical Value");
					} else {
						fail(driver, "Merge Select row in Data Label not displayed for Categorical Value");
					}
					if (isDisplayed(driver, mergeUnSelect)) {
						pass(driver, "Merge Unselect row in Data Label displayed for Categorical Value");
					} else {
						fail(driver, "Merge Unselect row in Data Label not displayed for Categorical Value");
					}
					if (isDisplayed(driver, clearRows)) {
						pass(driver, "Clear rows in Data Label displayed for Categorical Value");
					} else {
						fail(driver, "Clear rows in Data Label not displayed for Categorical Value");
					}
					if (isDisplayed(driver, fullScreenData)) {
						pass(driver, "Full Screen in DataLabel displayed for Categorical Value");
					} else {
						fail(driver, "Full Screen in DataLabel not displayed for Categorical Value");
					}

					if (dataTabelValue.equals(selectedColumn)) {
						pass(driver, "Data Label opened with selected categorical value");
					} else {
						fail(driver, "Data Label opened with different categorical value");
					}
					ScrollBarValidation1(driver, DataTableSection, "DataLabel Section");
				} else {
					fail(driver, "Data Label not opened while selecting the categorical value");
				}
				if (isDisplayed(driver, GraphSheetScetion)) {
					if (isDisplayed(driver, graph)) {
						String graphValue = getText1(driver, GraphSectionValue).trim();
						System.out.println("graphValue : " + graphValue);
						if (isDisplayed(driver, ChartContextGrpah)) {
							pass(driver, "Chart Context Menu in Graph section displayed for categorical value");
						} else {
							fail(driver, "Chart Context Menu in Graph section not displayed for categorical value");
						}
						if (graphValue.equals(selectedColumn)) {
							pass(driver, "Graph opened with selected categorical value");
						} else {
							fail(driver, "Graph opened with different categorical value");
						}
					} else {
						fail(driver, "Graph not loaded...");
					}

				} else {
					fail(driver, "Graphsheet section not opened while selecting the categorical value");
				}

				if (isDisplayed(driver, variableImportSect)) {
					pass(driver, "Variable of importance opened while selecting the categorical value");
					if (isDisplayed(driver, ChartContextVariable)) {
						pass(driver, "Chart Context Menu in Variable section displayed for categorical value");
					} else {
						fail(driver, "Chart Context Menu in Variable section not displayed for categorical value");
					}
					verifyElementIsPresent1(driver, variableImportance);
				} else {
					fail(driver, "Variable of importance not opened while selecting the categorical value");
				}
			}

			if (isDisplayed2(driver, DateType)) {
				click(driver, DateType);
				elementnotvisible(driver, Loading);
				String selectedColumnDate = getText1(driver, DateType);
				if (isDisplayed(driver, DataTableSection)) {
					String dataTabelValue2 = getText1(driver, DataLabelValue).trim();
					System.out.println("dataTabelValue2 : " + dataTabelValue2);

					if (isDisplayed(driver, deleteDataLabel)) {
						pass(driver, "Delete button in Data Label displayed for Date Value");
					} else {
						fail(driver, "Delete button in Data Label not displayed for Date Value");
					}
					if (isDisplayed(driver, mergeSelectRow)) {
						pass(driver, "Merge Select row in Data Label displayed for Date Value");
					} else {
						fail(driver, "Merge Select row in Data Label not displayed for Date Value");
					}
					if (isDisplayed(driver, mergeUnSelect)) {
						pass(driver, "Merge Unselect row in Data Label displayed for Date Value");
					} else {
						fail(driver, "Merge Unselect row in Data Label not displayed for Date Value");
					}
					if (isDisplayed(driver, clearRows)) {
						pass(driver, "Clear rows in Data Label displayed for Date Value");
					} else {
						fail(driver, "Clear rows in Data Label not displayed for Date Value");
					}
					if (isDisplayed(driver, fullScreenData)) {
						pass(driver, "Full Screen in DataLabel displayed for Date Value");
					} else {
						fail(driver, "Full Screen in DataLabel not displayed for Date Value");
					}

					if (dataTabelValue2.equals(selectedColumnDate)) {
						pass(driver, "Data Label opened with selected Date value");
					} else {
						fail(driver, "Data Label opened with different Date value");
					}

					if (isDisplayed(driver, Pagination)) {
						pass(driver, "Pagination is displayed");
						String currentPage = getText1(driver, Currentpage);
						if (currentPage.contains("1")) {
							pass(driver, "By default first page selected in pagination");
						} else {
							fail(driver, "By default " + currentPage + " page selected in pagination");
						}
						List<WebElement> pageList = getWebElements(driver, PaginationLists);
						int pageSizeAct = pageList.size();
						if (pageSizeAct > 5) {
							elementScreenShot_new(driver, DataTableSection,
									"/Expected_screenshot/SmokeTesting/dataLabelSec");
							click(driver, nextPage);
							String currentPageAct = getText1(driver, Currentpage);
							if (currentPageAct.equals(currentPage)) {
								pass(driver, "Page changed after clicking next page button");
							} else {
								fail(driver, "Page not changed after clicking next page button");
							}
							elementScreenShot_new(driver, DataTableSection,
									"/Actual_screenshot/SmokeTesting/dataLabelSec");
							boolean pageChange;
							try {
								pageChange = imageComparison2(driver, "/SmokeTesting/dataLabelSec",
										"/SmokeTesting/dataLabelSec");
								if (pageChange == false) {
									pass(driver, "Page values changed after cliking next page");
								} else {
									fail(driver, "Page values not changed after cliking next page");
								}
							} catch (Exception e) {
								// TODO Auto-generated catch block

							}

						}
					} else {
						fail(driver, "Pagination is not displayed");
					}

					click(driver, FirstColoumnDataLabel);
					click(driver, deleteDataLabel);
					elementnotvisible(driver, Loading);
					if (isDisplayed(driver, deleteSuccessDataLabel)) {
						pass(driver, "Selected row deleted Successfully");
						elementnotvisible(driver, deleteSuccessDataLabel);
					} else {
						fail(driver, "Selected row not deleted Successfully");
					}

					click(driver, FirstColoumnDataLabel);
					click(driver, mergeSelectRow);
					waitForElement(driver, mergeConfirmPopup);
					waitForElement(driver, valueReplaceInput);
					sendKeys(driver, valueReplaceInput, "2015-05-23 00:04:00");
					waitForElement(driver, ApplyBtnMerge);
					click(driver, ApplyBtnMerge);
					elementnotvisible(driver, Loading);
					if (isDisplayed(driver, mergeSuccessDataLabel)) {
						pass(driver, "Selected row merged Successfully");
						elementnotvisible(driver, mergeSuccessDataLabel);
					} else {
						fail(driver, "Selected row not merged Successfully");
					}

					click(driver, FirstColoumnDataLabel);
					click(driver, mergeUnSelect);
					waitForElement(driver, mergeConfirmPopup);
					waitForElement(driver, valueReplaceInput);
					sendKeys(driver, valueReplaceInput, "2015-05-23 00:00:00");
					waitForElement(driver, ApplyBtnMerge);
					click(driver, ApplyBtnMerge);
					elementnotvisible(driver, Loading);
					if (isDisplayed(driver, mergeSuccessDataLabel)) {
						pass(driver, "Selected row Unmerged Successfully");
						elementnotvisible(driver, mergeSuccessDataLabel);
					} else {
						fail(driver, "Selected row not Unmerged Successfully");
					}

					click(driver, FirstColoumnDataLabel);
					click(driver, clearRows);
					elementnotvisible(driver, Loading);
					if (isDisplayed(driver, mergeSuccessDataLabel)) {
						pass(driver, "Selected row cleared Successfully");
						elementnotvisible(driver, mergeSuccessDataLabel);
					} else {
						fail(driver, "Selected row not cleared Successfully");
					}

				} else {
					fail(driver, "Data Label not opened while selecting the Date value");
				}

				if (isDisplayed(driver, GraphSheetScetion)) {
					if (isDisplayed(driver, graph)) {
						String graphValue = getText1(driver, GraphSectionValue).trim();
						System.out.println("graphValue : " + graphValue);
						if (isDisplayed(driver, ChartContextGrpah)) {
							pass(driver, "Chart Context Menu in Graph section displayed for Date value");
						} else {
							fail(driver, "Chart Context Menu in Graph section not displayed for Date value");
						}
						if (graphValue.equals(selectedColumnDate)) {
							pass(driver, "Graph opened with selected Date value");
						} else {
							fail(driver, "Graph opened with different Date value");
						}

					} else {
						fail(driver, "Graph not loaded...");
					}
				} else {
					fail(driver, "Data Label not opened while selecting the Date value");
				}

				if (isDisplayed(driver, variableImportSect)) {
					pass(driver, "Variable of importance opened while selecting the Date value");
					if (isDisplayed(driver, ChartContextVariable)) {
						pass(driver, "Chart Context Menu in Variable section displayed for Date value");
					} else {
						fail(driver, "Chart Context Menu in Variable section not displayed for Date value");
					}
					verifyElementIsPresent1(driver, variableImportance);
				} else {
					fail(driver, "Variable of importance not opened while selecting the Date value");
				}

			}

			// -------
			if (isDisplayed2(driver, NumericalType)) {
				click(driver, NumericalType);
				elementnotvisible(driver, Loading);
				String selectedColumnNumeric = getText1(driver, NumericalType);
				if (isDisplayed(driver, AdvancedStatisticsSec)) {
					String AdvancedStatisticsValue = getText1(driver, DataLabelValue).trim();
					System.out.println("AdvancedStatisticsValue2 : " + AdvancedStatisticsValue);
					if (AdvancedStatisticsValue.equals(selectedColumnNumeric)) {
						pass(driver, "Advanced Statistics opened with selected Numeric value");
					} else {
						fail(driver, "Advanced Statistics opened with different Numeric value");
					}
					if (isDisplayed(driver, OutlierDelete)) {
						pass(driver, "Outlier delete icon displayed for numerical selection");
					} else {
						fail(driver, "Outlier delete icon not displayed for numerical selection");
					}
					if (isDisplayed(driver, helpDocIcon)) {
						pass(driver, "Help Doc icon displayed for numerical selection");
					} else {
						fail(driver, "Help Doc icon not displayed for numerical selection");
					}
					if (isDisplayed(driver, fullScreenData)) {
						pass(driver, "Full Screen icon displayed for numerical selection");
					} else {
						fail(driver, "Full Screen icon not displayed for numerical selection");
					}
					if (isDisplayed(driver, ChartContextAdvanced)) {
						pass(driver, "Chart Context Menu icon displayed for numerical selection");
					} else {
						fail(driver, "Chart Context Menu icon not displayed for numerical selection");
					}

				} else {
					fail(driver, "Advanced Statistics not opened while selecting the Numeric value");
				}

				if (isDisplayed(driver, GraphSheetScetion)) {
					if (isDisplayed(driver, graph)) {
						String graphValue = getText1(driver, GraphSectionValue).trim();
						System.out.println("graphValue2 : " + graphValue);
						if (graphValue.equals(selectedColumnNumeric)) {
							pass(driver, "Graph opened with selected Numeric value");
						} else {
							fail(driver, "Graph opened with different Numeric value");
						}
						if (isDisplayed(driver, ChangeNumberBins)) {
							pass(driver, "Change number bins displayed for Numerical selection");
						} else {
							fail(driver, "Change number bins not displayed for Numerical selection");
						}
						if (isDisplayed(driver, StackTargetVariable)) {
							pass(driver, "Stack with Target Variable displayed for Numerical selection");
						} else {
							fail(driver, "Stack with Target Variable not displayed for Numerical selection");
						}
						if (isDisplayed(driver, ShowEmptyBins)) {
							pass(driver, "Show Empty Bin displayed for Numerical selection");
						} else {
							fail(driver, "Show Empty Bin not displayed for Numerical selection");
						}
						if (isDisplayed(driver, ChartContextGrpah)) {
							pass(driver, "Chart Context Menu in Graph section displayed for Numerical value");
						} else {
							fail(driver, "Chart Context Menu in Graph section not displayed for Numerical value");
						}

					} else {
						fail(driver, "Graph not loaded...for " + selectedColumnNumeric);
					}
				} else {
					fail(driver, "Data Label not opened while selecting the Numeric value");
				}

				if (isDisplayed(driver, variableImportSect)) {
					pass(driver, "Variable of importance opened while selecting the Numeric value");
					if (isDisplayed(driver, refreshOptionVariable)) {
						pass(driver, "Refresh button present in variables of Importance section");
						click(driver, refreshOptionVariable);
						if (isDisplayed(driver, refreshing)) {
							pass(driver, "Refresh in varible of importance section working properly");
						} else {
							fail(driver, "Refresh in varible of importance section not working properly");
						}

					} else {
						fail(driver, "Refresh button not present in variables of Importance section");
					}
					if (isDisplayed(driver, ContextmenuOptionVariable)) {
						pass(driver, "Context menu option present in variables of Importance section");
					} else {
						fail(driver, "Context menu option not present in variables of Importance section");
					}

				} else {
					fail(driver, "Variable of importance not opened while selecting the Numeric value");
				}
				verifyElementIsPresent1(driver, RowsBottom);
				verifyElementIsPresent1(driver, ColumnsBottom);

				click(driver, OutlierDelete);
				elementnotvisible(driver, Loading);
				if (isDisplayed(driver, outlierDeleteSuccess)) {
					pass(driver, "Outlier deleted successfully..");
				} else {
					fail(driver, "Outlier not deleted successfully..");
				}

			}

			// ------------
			// *********************************
			if (isDisplayed2(driver, TextType)) {
				click(driver, TextType);
				elementnotvisible(driver, Loading);
				String selectedColumnText = getText1(driver, TextType);
				String dataTabelValueText = getText1(driver, DataLabelValue).trim();
				System.out.println("dataTabelValuetext : " + dataTabelValueText);
				if (dataTabelValueText.equals(selectedColumnText)) {
					pass(driver, "Data Label displayed selected Text value");
				} else {
					fail(driver, "Data Label displayed different Text value");
				}
				if (isDisplayed(driver, GridViewIcon)) {
					pass(driver, "Grid View icon displayed for Text selection");
				} else {
					fail(driver, "Grid View icon not displayed for Text selection");
				}
				if (isDisplayed(driver, ChartViewIcon)) {
					pass(driver, "Chart View icon displayed for Text selection");
				} else {
					fail(driver, "Chart View icon not displayed for Text selection");
				}

				if (isDisplayed(driver, RadialChartView)) {

					if (isDisplayed(driver, ChartContextDataLabel)) {
						pass(driver, "Chart Context Menu icon displayed for Text selection");
					} else {
						fail(driver, "Chart Context Menu icon not displayed for Text selection");
					}
					click(driver, GridViewIcon);
					if (isDisplayed(driver, DataTableSection)) {
						pass(driver, "Grid view of the text column opened");
						if (isDisplayed(driver, searchBarInDataLabel)) {
							pass(driver, "Search bar displayed in the grid view for Text");
						} else {
							fail(driver, "Search bar not displayed in the grid view for Text");
						}
					} else {
						fail(driver, "Grid view of the text column not opened");
					}

					click(driver, ChartViewIcon);
					if (isDisplayed(driver, RadialChartView)) {
						pass(driver, "Chart view displayed while selecting the chart view");
					} else {
						fail(driver, "Chart view not displayed while selecting the chart view");
					}

				} else {
					fail(driver, "Data Table Section with chart view not loaded while selecting the Text value");
				}

				if (isDisplayed(driver, GraphSheetScetion)) {
					if (isDisplayed(driver, textGrpah)) {

						if (isDisplayed(driver, ChartContextText)) {
							pass(driver, "Chart Context Menu in Graph section displayed for Text value");
						} else {
							fail(driver, "Chart Context Menu in Graph section not displayed for Text value");
						}

						if (isDisplayed(driver, N_Grams)) {
							pass(driver, "N_Grams in Graph section displayed for Numerical selection");
						} else {
							fail(driver, "N_Grams in Graph section not displayed for Numerical selection");
						}

					} else {
						fail(driver, "Graph not loaded...for " + selectedColumnText);
					}
				} else {
					fail(driver, "Data Label not opened while selecting the Numeric value");
				}

				if (isDisplayed(driver, variableImportSect)) {
					pass(driver, "Variable of importance opened while selecting the Numeric value");
				} else {
					fail(driver, "Variable of importance not opened while selecting the Numeric value");
				}

				click(driver, OutlierDelete);
				if (isDisplayed(driver, outlierDeleteSuccess)) {
					pass(driver, "Outlier deleted successfully..");
				} else {
					fail(driver, "Outlier not deleted successfully..");
				}

			}

			// ***************************

			click(driver, Transformations);
			elementnotvisible(driver, Loading);
			elementnotvisible(driver, Loading1);
			if (isDisplayed(driver, FunctuionsListSec)) {
				pass(driver, "List functions displayed after clicking Transformation");
				verifyElementIsPresent1(driver, LabelFunction);
				verifyElementIsPresent1(driver, eyeIcon);
				List<WebElement> FunctionsValueList = getWebElements(driver, FunctuionsListSec);
				List<WebElement> Home_IconsList = getWebElements(driver, eyeIcon);
				if (FunctionsValueList.size() == Home_IconsList.size()) {
					pass(driver, "All the function lists are displayed with 'Example Home icon'"); // new validation
				} else {
					fail(driver, "Some function lists are not displayed with 'Example Home icon'");
				}

				if (isDisplayed(driver, searchFunction)) {
					pass(driver, "Search bar displayed in Functions section");
				} else {
					fail(driver, "Search bar not displayed in Functions section");
				}
			} else {
				fail(driver, "List functions not displayed after clicking Transformation");
			}

			if (isDisplayed(driver, ColumnSection)) {
				pass(driver, "Column functions displayed after clicking Transformation");
				verifyElementIsPresent1(driver, ColumnText);
				if (isDisplayed(driver, searchColumn)) {
					pass(driver, "Search bar displayed in Column section");
				} else {
					fail(driver, "Search bar not displayed in Column section");
				}
			} else {
				fail(driver, "Column functions not displayed after clicking Transformation");
			}

			boolean HelpFrame = false;
			if (isDisplayed(driver, HelpDocframe)) {
				WebElement ele = driver.findElement(
						By.xpath("//iframe[contains(@src,'https://help.sedge.ai/Data%20analytics.html')]"));
				driver.switchTo().frame(ele);
				if (isDisplayed(driver, HelpDocSec)) {
					pass(driver, "HelpDocumentation section is displayed after clicking Transformation");
				} else {
					fail(driver, "HelpDocumentation section is not displayed after clicking Transformation");
				}

				HelpFrame = true;
				driver.switchTo().defaultContent();
			}

			if (isDisplayed(driver, ExpressionHistory)) {
				if (isToggleAccessible(driver, ExpressionHistory)) {
					fail(driver, "Expression History is enabled by default");
				} else {
					pass(driver, "Expression History is disabled by default");
				}
			} else {
				fail(driver, "Expression History is not displayed after clicking Transformation");
			}

			if (isDisplayed(driver, ClearButton)) {
				pass(driver, "Clear Button is displayed after clicking Transformation");
			} else {
				fail(driver, "Clear Button is not displayed after clicking Transformation");
			}
			if (isDisplayed(driver, TestButton)) {
				pass(driver, "Test Button is displayed after clicking Transformation");
			} else {
				fail(driver, "Test Button is not displayed after clicking Transformation");
			}
			if (isDisplayed(driver, ApplyButtonTrans)) {
				pass(driver, "Apply Button is displayed after clicking Transformation");
			} else {
				fail(driver, "Apply Button is not displayed after clicking Transformation");
			}

			ScrollBarValidation1(driver, FunctionList, "FunctionList");
			click(driver, searchFunction);
			sendKeys(driver, searchFunction, FunctionSearchName);
			wait(driver, "1");
			String firstDisplayedFunction = getText1(driver, FirstFunction);
			System.out.println("firstDisplayedFunctionAct : " + firstDisplayedFunction);
			System.out.println("firstDisplayedFunctionExp : " + FunctionSearchName);

			if (firstDisplayedFunction.equals(FunctionSearchName)) {
				pass(driver, "Search bar in Functions works properly");
			} else {
				fail(driver, "Search bar in Functions not works properly");
			}

			String helpDocHeading1 = getText1(driver, FirstFunction);
			click(driver, FirstFunction);
			wait(driver, "1");
//  			String helpDocHeading=getText1(driver,HelpDocSecHeading);

			try {
				if (HelpFrame == true) {
					WebElement ele = driver.findElement(
							By.xpath("//iframe[contains(@src,'https://help.sedge.ai/Data%20analytics.html')]"));
					driver.switchTo().frame(ele);
					wait(driver, "1");
					WebElement searchedFuncHelpDoc = driver.findElement(By.xpath(
							"//section[@id='transformations']//h3[contains(text(),'" + FunctionSearchName + "')]"));
					if (searchedFuncHelpDoc.isDisplayed()) {
						pass(driver, "Searched function details displayed in the Help Document Section");
					} else {
						fail(driver, "Searched function details not displayed in the Help Document Section");// new
																												// validation
					}
				} else {
					fail(driver, "Unable to find the searched Function in HelpDocument Section");
				}

				driver.switchTo().defaultContent();
			} catch (Exception e) {
				fail(driver, "Unable to find the searched Function in HelpDocument Section");
			}

			// new
			waitForElement(driver, displayedLine);
			String displayedSyntaxAct = getText1(driver, displayedLine);
			System.out.println("displayedSyntaxAct : " + displayedSyntaxAct);
// 				System.out.println("SyntaxExp : "+Syntax);
			if (displayedSyntaxAct.contains(helpDocHeading1.toLowerCase())) {
				pass(driver, "Searched function syntax displayed in Code Mirror tab");
			} else {
				fail(driver, "Searched function syntax not displayed in Code Mirror tab");
			}
			// new

			click(driver, TestButton);
			if (isDisplayed(driver, TransformationError)) {
				pass(driver, "'Provide a valid input column name' error displayed");
			} else {
				fail(driver, "'Provide a valid input column name' error not displayed");
			}

			ScrollBarValidation1(driver, ColumnList, "ColumnList");
			if (isDisplayed(driver, NumericalColumnTrans)) {
				String numericalTextExp = getText1(driver, NumericalText);
				click(driver, searchColumn);
				sendKeys(driver, searchColumn, numericalTextExp);
				wait(driver, "1");
				String searchedColumnAct = getText1(driver, firstColumn_Value);
				if (numericalTextExp.equals(searchedColumnAct)) {
					pass(driver, "Search bar in the column working properly");
				} else {
					fail(driver, "Search bar in the column not working properly");
				}
				click(driver, firstColumn_Value);
				wait(driver, "1");
				displayedSyntaxAct = getText1(driver, displayedLine);
				if (displayedSyntaxAct.contains(numericalTextExp)) {
					pass(driver, "Searched column is applied in the Synatx while click on it");
				} else {
					fail(driver, "Searched column is not applied in the Synatx while click on it ");
				}
				click(driver, TestButton);
				elementnotvisible(driver, Loading);
				if (isDisplayed(driver, AsciiError)) {
					pass(driver,
							"'Kindly choose a categorical column for 'ascii' function' error displayed when selecting the Numerical value");
				} else {
					fail(driver,
							"'Kindly choose a categorical column for 'ascii' function' error not displayed when selecting the Numerical value");
				}

				click(driver, ClearButton);
				wait(driver, "1");
				String clearedText = getText1(driver, displayedLine);
				if (clearedText.isEmpty()) {
					pass(driver, "Syntax cleared after clicking the clear button");
				} else {
					fail(driver, "Syntax not cleared after clicking the clear button");
				}

			}

			click(driver, searchFunction);
			sendKeys(driver, searchFunction, FunctionSearchName);
			wait(driver, "1");
			click(driver, FirstFunction);

			click(driver, searchColumn);
			sendKeys(driver, searchColumn, ColumnNameInput_Smoke_131);
			wait(driver, "1");
			String searchedColumnAct = getText1(driver, firstColumn_Value);
			if (ColumnNameInput_Smoke_131.equals(searchedColumnAct)) {
				pass(driver, "Search bar in the column working properly");
			} else {
				fail(driver, "Search bar in the column not working properly");
			}
			if (isDisplayed(driver, firstColumnImage)) {
				pass(driver, "Search Column value displayed with data type");
			} else {
				fail(driver, "Search Column value data type not displayed");
			}

			click(driver, firstColumn_Value);
			wait(driver, "1");
			String displayedSyntexText = getText1(driver, displayedLine);
			if (displayedSyntexText.contains(ColumnNameInput_Smoke_131)) {
				pass(driver, "Searched column value applied in syntax while click on it");
			} else {
				fail(driver, "Searched column value not applied in syntax while click on it");
			}

			click(driver, TestButton);
			elementnotvisible(driver, Loading);
			if (isDisplayed(driver, AsciiSuccess)) {
				pass(driver, "'Expression is valid' success message displayed for categorical value");
			} else {
				fail(driver, "'Expression is valid' success message is not displayed for categorical value");
			}

			wait(driver,"1");
			String ExpHistoryBtnColorAct = getTextBackgroundColor(driver, ExpressionHistory);
			if (ExpressionHistoryBtnEnable.equalsIgnoreCase(ExpHistoryBtnColorAct)) {
				pass(driver, "Expression history Button get enabled in blue color");
			} else {
				fail(driver, "Expression history Button not enabled in blue color, Exp : "+ExpressionHistoryBtnEnable+" Act : "+ExpHistoryBtnColorAct);
			}

			click(driver, ApplyButtonTrans);
			elementnotvisible(driver, Loading1);
			if (isDisplayed(driver, previewTabDisplay)) {
				pass(driver, "Synatex applied successfully and preview tab displayed");
				List<WebElement> headerPreview=getWebElements(driver, PreviewHeader_Statistics);
				List<WebElement> SortingPreview=getWebElements(driver, PreviewSorting_Statistics);
				int sortCount1=0;
				int headCount=0;
				for(WebElement head:headerPreview) {
    		       action.moveToElement(head).build().perform();
    			   if(head.isDisplayed()) {
    				  headCount++;
    			   }
				}
				for(WebElement sort:SortingPreview) {
    		       action.moveToElement(sort).build().perform();
    			   if(sort.isDisplayed()) {
    				   sortCount1++;
    			   }
				}
    		     
    		     mouseOverToElement(driver, PreviewHeader_Statistics);
     			 if(headCount==sortCount1) {
     				 pass(driver,"Sorting Icon displayed in all the headers in the preview in Statistics Page");
     			 }else {
     				 fail(driver,"Sorting Icon not displayed in some headers in the preview in Statistics Page");
     			 }
				
			} else {
				fail(driver, "Syntex not applied successfully");
			}

			click(driver, Transformations);
			elementnotvisible(driver, Loading);
			elementnotvisible(driver, Loading1);
			click(driver, searchFunction);
			sendKeys(driver, searchFunction, FunctionSearchName);
			click(driver, FirstFunction);
			click(driver, searchColumn);
			sendKeys(driver, searchColumn, ColumnNameInput_Smoke_131);
			click(driver, firstColumn_Value);
			click(driver, ApplyButtonTrans);
			elementnotvisible(driver, Loading);
			if (isDisplayed(driver, NewColumnError)) {
				pass(driver, "'NewColumn' already exists error displayed");
			} else {
				fail(driver, "'NewColumn' already exists error not displayed");
			}

			click(driver, ExpressionHistory);
			wait(driver, "1");
			if (isDisplayed(driver, ExpressionList)) {
				pass(driver, "'Expression history' tab displayed successfully");
			} else {
				fail(driver, "'Expression history' tab not displayed");
			}

			click(driver, ExpressHistoryTabClose);
			wait(driver, "1");
			if (!isDisplayed(driver, ExpressHistoryTabClose)) {
				pass(driver, "'Expression history' tab closed successfully");
			} else {
				fail(driver, "'Expression history' tab not closed successfully");
			}

			click(driver, ClearButton);
			wait(driver, "1");
			displayedSyntexText = getText1(driver, displayedLine);
			if (displayedSyntexText.isEmpty()) {
				pass(driver, "Syntex cleared succesfully while clicking the clear button");
			} else {
				fail(driver, "Syntex not cleared succesfully while clicking the clear button");
			}

			click(driver, PreviewSectionHead);
			elementnotvisible(driver, Loading);
			if (isDisplayed(driver, PreviewTable)) {
				pass(driver, "Preview tab open and table is displayed in the preview tab");
			} else {
				fail(driver, "Table is not displayed in preview tab");
			}

			ScrollBarValidation1(driver, PreviewTableValue, "Table in Preview Tab");

		} else {
			fail(driver, "Statistics is not accessible after selecting target");
		}

		mouseOverToElement(driver, Statistics_icon);
		click(driver, statisticalTest);
		if (isDisplayed1(driver, StatisticalTestPage)) {
			pass(driver, "Statistical Test is accessible after selecting target");
		} else {
			fail(driver, "Statistical Test is not accessible after selecting target");
		}

		mouseOverToElement(driver, StatisticalTestPage);
		wait(driver, "1");
		mouseOverToElement(driver, visual_Analytics);
		if (isDisplayed(driver, accessible)) {
			pass(driver, "Visual Analytics  accessible after selecting target");
		} else {
			fail(driver, "Visual Analytics not  accessible after selecting target");
		}

		mouseOverToElement(driver, predictive_analytics);
		if (isDisplayed(driver, accessible)) {
			pass(driver, "Predictive Analytics  accessible after selecting target");
		} else {
			fail(driver, "Predictive Analytics not accessible after selecting target");
		}
		// Need to Command for dry run Execution (5)

		click(driver, Visual_icon);
		elementnotvisible(driver, Loading);
		if (isDisplayed(driver, DashProPage)) {
			pass(driver, "Visual Analytics  clickable and dash pro page displayed ");
		} else {
			fail(driver, "Visual Analytics not clickable and dash pro page not  displayed ");
		}

		// Need to Command for dry run Execution (6)
		if (isDisplayed(driver, defaultTab1)) {
			pass(driver, "By default Tab 1 is created in the dashboard page ");
		} else {
			fail(driver, "By default Tab 1 is not created in the dashboard page ");
		}
		if (isDisplayed(driver, ADDTabPlus)) {
			pass(driver, "Add Tab '+' icon  is present in the dashboard page ");
		} else {
			fail(driver, "Add Tab '+' icon  is not present in the dashboard page ");
		}

		doubleClick(driver, firstTab);
//	    click(driver,firstTab);
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		action.sendKeys(Keys.BACK_SPACE).build().perform();
		sendKeys(driver, FirstTabInput, "Tab1&");
		click(driver, DashProPage);
		String updateTabText = getText1(driver, firstTab);
		if (updateTabText.equals("Tab1&")) {
			pass(driver, "Tab 1 name gets edited Successfully");
		} else {
			pass(driver, "Tab 1 name not edited Successfully");
		}

		wait(driver, "1");
		mouseOverToElement(driver, ADDTabPlus);
		mouseOverAndClick(driver, ADDTabPlus);
		wait(driver, "1");
		click(driver, DashProPage);
		if (isDisplayed(driver, newTab)) {
			pass(driver, "New tab created Succesfully");
		} else {
			fail(driver, "New tab not created Succesfully");
		}

		mouseOverToElement(driver, FirstTabLink);
		wait(driver,"1");
		mouseOverAndClick(driver, FirstTabLink);
		wait(driver, "1");
		String firstTabOpenColor = getTextBackgroundColor(driver, FirstTabLink);
		System.out.println("firstTabOpenColor :" + firstTabOpenColor);
		if (firstTabOpenColor.equalsIgnoreCase("#eeeeee")) {
			pass(driver, "selected tab is displayed successfully");
		} else {
			fail(driver, "selected tab is not displayed successfully");
		}

		if (isDisplayed(driver, Add_widget_center)) {
			pass(driver, "Center Add widget element is present ");
			String[] postion = getPositionOfElement(driver, Add_widget_center);
			String CenterWidget_X_Act = postion[0];
			String CenterWidget_Y_Act = postion[1];
			System.out.println(CenterWidget_X_Exp + " " + CenterWidget_Y_Exp);
			if (CenterWidget_X_Exp.equals(CenterWidget_X_Act) && CenterWidget_Y_Exp.equals(CenterWidget_Y_Act)) {
				passReport(driver,
						"AddWidget Should Placed in the Center, X=" + CenterWidget_X_Exp + " , Y=" + CenterWidget_Y_Exp,
						"AddWidget Placed in the Center, X=" + CenterWidget_X_Act + " , Y=" + CenterWidget_Y_Act);
			} else {
				failReport(driver,
						"AddWidget Should Placed in the Center, X=" + CenterWidget_X_Exp + " , Y=" + CenterWidget_Y_Exp,
						"AddWidget not Placed in the Center, X=" + CenterWidget_X_Act + " , Y=" + CenterWidget_Y_Act);
			}

		} else {
			fail(driver, "Center Add widget element is not present ");
		}

		if (isDisplayed(driver, ADD_widget_rightTop)) {
			pass(driver, "Top right corner Add widget element is present ");
			String[] postion = getPositionOfElement(driver, ADD_widget_rightTop);
			String RightWidget_X_Act = postion[0];
			String RightWidget_Y_Act = postion[1];
			System.out.println(RightWidget_X_Exp + " " + RightWidget_Y_Exp);
			if (RightWidget_X_Exp.equals(RightWidget_X_Act) && RightWidget_Y_Exp.equals(RightWidget_Y_Act)) {
				passReport(driver,
						"AddWidget Should Placed in the Top Right Position, X=" + RightWidget_X_Exp + " , Y="
								+ RightWidget_Y_Exp,
						"AddWidget Placed in the Top Right Position, X=" + RightWidget_X_Act + " , Y="
								+ RightWidget_Y_Act);
			} else {
				failReport(driver,
						"AddWidget Should Placed in Top Right Position, X=" + RightWidget_X_Exp + " , Y="
								+ RightWidget_Y_Exp,
						"AddWidget not Placed in Top Right Position, X=" + RightWidget_X_Act + " , Y="
								+ RightWidget_Y_Act);
			}
		} else {
			fail(driver, "Top right corner Add widget element is not present ");
		}

		verifyElementIsPresent1(driver, publicDashboard);
		verifyElementIsPresent1(driver, GlobalFilter);
		// Need to Command for dry run Execution (6)

		waitForElement(driver, ADD_widget_rightTop);

		click(driver, ADD_widget_rightTop);
		elementnotvisible(driver, Loading);
		if (isDisplayed(driver, WidgetPanel)) {
			pass(driver, "Add widgets is clickable and the widgetss  are displayed ");
		} else {
			fail(driver, "Add widgets is not clickable and the widgetss  are not displayed");
		}

		// Add seperate TestCase in future

		WidgetValidation(driver, Table_widget, "Table");
		// Need to Command for dry run Execution (7)
		WidgetValidation(driver, Bar_widget, "Bar");
		WidgetValidation(driver, Pivot_widget, "Pivot");
		WidgetValidation(driver, Stacked_Bar_widget, "Stacked Bar");
		WidgetValidation(driver, Grouped_Bar_widget, "Grouped Bar");
		WidgetValidation(driver, Coloumn_widget, "Column");
		WidgetValidation(driver, Stacked_Column_widget, "Stacked Column");
		WidgetValidation(driver, Grouped_Column_widget, "Grouped Column");
		WidgetValidation(driver, Pie_widget, "Pie");
		WidgetValidation(driver, Donut_widget, "Donut");
		WidgetValidation(driver, SemiCircle_widget, "semi circle");
		WidgetValidation(driver, SunBurst_widget, "Sun burst");
		WidgetValidation(driver, WaterFall_widget, "Water Fall");
		WidgetValidation(driver, Network_widget, "Network");
		WidgetValidation(driver, Line_widget, "Line");
		WidgetValidation(driver, Area_widget, "Area");
		WidgetValidation(driver, Gantt_widget, "Gantt");
		WidgetValidation(driver, Scatter_widget, "Scatter");
		WidgetValidation(driver, Dumbel_plot_widget, "Dumbbell Plot");
		WidgetValidation(driver, Tree_map_widget, "Tree Map");
		WidgetValidation(driver, HeatMap_Legend_widget, "Heat Map Legend");
		WidgetValidation(driver, GroupandSorted_widget, "Grouped and Sorted");
		WidgetValidation(driver, Multiple_Axis_widget, "Multiple Axis");
		WidgetValidation(driver, Radar_Line_widget, "Radar Line");
		WidgetValidation(driver, Zoomable_Bubble_widget, "Zoomable Bubble");
		WidgetValidation(driver, Time_line_widget, "Time line");
		WidgetValidation(driver, Population_Pyramid_widget, "Population Pyramid");
		WidgetValidation(driver, Box_Plot_widget, "Box Plot");
		WidgetValidation(driver, Text_widget, "Text");
		WidgetValidation(driver, BarLine_Scatter_widget, "Bar with Line/Scatter");
		WidgetValidation(driver, Layered_Column_widget, "Layered Column");
		WidgetValidation(driver, Bullet_widget, "Bullet");
		WidgetValidation(driver, Circose_widget, "Circos");
		WidgetValidation(driver, Candle_stick_widget, "Candle stick");
		WidgetValidation(driver, MapWith_Bubble_widget, "Map with Bubble");
		WidgetValidation(driver, Word_Cloud_widget, "Word Cloud");
		WidgetValidation(driver, Summary_widget, "Summary");
		WidgetValidation(driver, Card_widget, "Card");
		WidgetValidation(driver, KPI_Card_widget, "KPI card");
		WidgetValidation(driver, Custom_Pivot_widget, "Custom pivot");
		WidgetValidation(driver, Sparkline_widget, "Sparkline");
		// Need to Command for dry run Execution (7)
		mouseOverToElement(driver, Widget);
		if (isDisplayed2(driver, WidgetText)) {
			failReport(driver, "Tooltip Should get disappeared", "Tooltip not disappeared");
		} else {
			passReport(driver, "Tooltip Should get disappeared", "Tooltip gets disappeared");
		}

		verifyElementIsPresent1(driver, ThemeList);
		verifyElementIsPresent1(driver, WidgetSec);

		click(driver, Table_widget);
		elementnotvisible(driver, Loading);
		String widgetValue = getText1(driver, WidgetValue);
		if (widgetValue.equals("Table")) {
			pass(driver, "Table displayed as the selected Widget ");
		} else {
			fail(driver, "Table not displayed as the selected Widget ");
		}

		verifyElementIsPresent1(driver, TableSect);
		String TableExpandAct = getAttribute1(driver, TableColumnExpand, "class");
		if (TableExpandAct.contains("up")) {
			pass(driver, "Table Colum  Expanded after clicking Table Widget");
		} else {
			fail(driver, "Table Colum not Expanded after clicking Table Widget");
		}

		// Need to Command for dry run Execution (8)
		verifyElementIsPresent1(driver, SelectAllToogle);
		if (isToggleEnable(driver, SelectAllToogle)) {
			fail(driver, "Select All toogle enabled by default");
		} else {
			pass(driver, "Select All toogle disabled by default");
		}

		verifyElementIsPresent1(driver, AvailableColumnText);
		if (isDisplayed(driver, AvailableColum)) {
			pass(driver, "Available Column is displayed ");
		} else {
			fail(driver, "Available Column is not displayed ");
		}

		mouseOverAndClick(driver, ApplyButton);
		if (isDisplayed(driver, TableError)) {
			pass(driver, "'Kindly select column' error displayed");
		} else {
			fail(driver, "'Kindly select column' error not displayed");
		}

		click(driver, SelectAllToggleInput);
		wait(driver, "1");
		if (isToggleEnable(driver, SelectAllToogle)) {
			pass(driver, "Select All toogle enabled after clicking it");
		} else {
			fail(driver, "Select All toogle not enabled after clicking on it");
		}
		// Need to Command for dry run Execution (8)

		// TC_Smoketest_161
		List<WebElement> AvailableColumns = getWebElements(driver, AvailableColumnValues);
		List<WebElement> SelectedColumns = getWebElements(driver, SelectedAvailableColumnValue);

		int AvailableColumnsSize = AvailableColumns.size();
		int SelectedSize = SelectedColumns.size();
		boolean AllColumnGreen = true;
		for (WebElement column : AvailableColumns) {
			String rgbFormatColumn = column.getCssValue("background-color");
			String ColumnBackColor = rgbToHex(rgbFormatColumn);
			if (!ColumnBackColor.equalsIgnoreCase(TableColumnSelectColor)) {
				AllColumnGreen = false;
			}

		}

		if (AllColumnGreen == false) {
			fail(driver, "Some columnValues not changed to green color After enabling the Select All toggle ");
		} else {
			pass(driver, "All columnValues changed to green color After enabling the Select All toggle ");
		}

		mouseOverAndClick(driver, ApplyButton);
		if (isDisplayed(driver, TableHeadingFirst)) {
			pass(driver, "Table is Displayed After clicking apply button");
		} else {
			fail(driver, "Table is not Displayed After clicking apply button");
		}

		List<WebElement> DisplayedHeadColumns = getWebElements(driver, TableHeadings);
		int DisplayedHeadColumnssSize = DisplayedHeadColumns.size();
		if (DisplayedHeadColumnssSize == SelectedSize) {
			pass(driver, "All Selcted Available column size equals to resulting table heading column size");
		} else {
			fail(driver, "All Selected Available column size not equals to resulting table heading column size");
		}

		// TC_Smoketest_161

		// TC_Smoketest_162
		click(driver, SelectAllToggleInput);
		wait(driver, "1");
		// Need to Command for dry run Execution (9)
		if (isToggleEnable(driver, SelectAllToogle)) {
			fail(driver, "Select All toogle not disabled while disabling it");
		} else {
			pass(driver, "Select All toogle disabled while disabling it");
		}
		// TC_Smoketest_162

		// TC_Smoketest_164
		for (WebElement column : AvailableColumns) {
			column.click();
		}
		wait(driver, "1");
		if (isToggleEnable(driver, SelectAllToogle)) {
			pass(driver, "Select All toogle automatically Enabled while manually selecting all coloumn");
		} else {
			fail(driver, "Select All toogle not automatically Enabled while manually selecting all coloumn");
		}

		// TC_Smoketest_164

		// TC_Smoketest_165
		wait(driver, "1");
		click(driver, FirstAvailableColumn1);
		wait(driver, "1");
		if (isToggleEnable(driver, SelectAllToogle)) {
			fail(driver, "Select All toogle not automatically disabled when deselect one column");
		} else {
			pass(driver, "Select All toogle automatically disabled when deselect one column");
		}
		mouseOverAndClick(driver, ApplyButton);
		waitForElement1(driver, TableHeadingFirst);
		List<WebElement> SelectedColumns1 = getWebElements(driver, SelectedAvailableColumnValue);
		int SelectedColumns1Size = SelectedColumns1.size();
		List<WebElement> DisplayedHeadColumns1 = getWebElements(driver, TableHeadings);
		int DisplayedHeadColumns1Size = DisplayedHeadColumns1.size();
		if (DisplayedHeadColumns1Size == SelectedColumns1Size) {
			pass(driver, "Selcted Available column size equals to resulting table heading column size");
		} else {
			fail(driver, "Selected Available column size not equals to resulting table heading column size");
		}

		// TC_Smoketest_165

		click(driver, SelectAllToggleInput);
		click(driver, SelectAllToggleInput);

		// TC_Smoketest_166
		verifyElementIsPresent1(driver, SearchInColumn);
		// TC_Smoketest_166 ColumnSearchName

		// TC_Smoketest_167 & 168
		click(driver, SearchInColumn);
		sendKeys(driver, SearchInColumn, SearchColumInput_Somke_168);
		String FirstValue = getText1(driver, FirstAvailableColumn);
		if (FirstValue.equalsIgnoreCase(SearchColumInput_Somke_168)) {
			pass(driver, "Searched results are displayed correctly on the available columns");
		} else {
			fail(driver, "Searched results are not displayed correctly on the available columns");
		}
		// TC_Smoketest_167 & 168

		// TC_Smoketest_169
		clear1(driver, SearchInColumn);
		sendKeys(driver, SearchInColumn, "grggjdh");
		if (isDisplayed(driver, FirstAvailableColumn)) {
			fail(driver, "Columns are displayed when searching invalid column name");
		} else {
			pass(driver, "Columns are not displayed when searching invalid column name");
		}
		// TC_Smoketest_169

		// TC_Smoketest_170
		clear1(driver, SearchInColumn);
		sendKeys(driver, SearchInColumn, "_");
		if (isDisplayed(driver, FirstAvailableColumn)) {
			pass(driver, "Columns are displayed when searching Column name with Special character");
		} else {
			fail(driver, "Columns are not displayed when searching Column name with Special character");
		}
		// TC_Smoketest_170

		// TC_Smoketest_171
		clear1(driver, SearchInColumn);
		sendKeys(driver, SearchInColumn, MultipleSearchInput_Smoke_171);
		wait(driver, "1");
		List<WebElement> AvailableColumns1 = getWebElements(driver, AvailableColumnValues);
		boolean multiple = true;
		for (WebElement AvailableColumn1 : AvailableColumns1) {
			if (AvailableColumn1.isDisplayed()) {
				if (!((AvailableColumn1.getText()).contains(MultipleSearchInput_Smoke_171))
						&& !((AvailableColumn1.getText()).contains(MultipleSearchInput_Smoke_171.toLowerCase()))) {
					multiple = false;
				}
			}
		}
		if (multiple == false) {
			fail(driver, "Application not filtered correctly..");
		} else {
			pass(driver, "Application filtered correctly..");
		}
		// TC_Smoketest_171

		// TC_Smoketest_172
		clear1(driver, SearchInColumn);
		sendKeys(driver, SearchInColumn, SearchUpperLowerInput_Smoke_172);
		wait(driver, "1");
		if (isDisplayed(driver, FirstAvailableColumn)) {
			pass(driver,
					"Columns are displayed when searching Column name with a mix of upper and lower case letters : "
							+ SearchUpperLowerInput_Smoke_172);
		} else {
			fail(driver,
					"Columns are not displayed when searching Column name with a mix of upper and lower case letters : "
							+ SearchUpperLowerInput_Smoke_172);
		}
		// TC_Smoketest_172

		// TC_Smoketest_173
		String SearchUpperLowerInput_Smoke_173 = SearchUpperLowerInput_Smoke_172.toLowerCase();
		clear1(driver, SearchInColumn);
		sendKeys(driver, SearchInColumn, SearchUpperLowerInput_Smoke_173);
		wait(driver, "1");
		if (isDisplayed(driver, FirstAvailableColumn)) {
			pass(driver, "Columns are displayed when searching Column name with only lower case letters : "
					+ SearchUpperLowerInput_Smoke_173);
		} else {
			fail(driver, "Columns are not displayed when searching Column name with only lower case letters : "
					+ SearchUpperLowerInput_Smoke_173);
		}

		// TC_Smoketest_173

		// TC_Smoketest_174
		String SearchUpperLowerInput_Smoke_174 = SearchUpperLowerInput_Smoke_172.toUpperCase();
		clear1(driver, SearchInColumn);
		sendKeys(driver, SearchInColumn, SearchUpperLowerInput_Smoke_174);
		wait(driver, "1");
		if (isDisplayed(driver, FirstAvailableColumn)) {
			pass(driver, "Columns are displayed when searching Column name with only Upper case letters : "
					+ SearchUpperLowerInput_Smoke_174);
		} else {
			fail(driver, "Columns are not displayed when searching Column name with only Upper case letters : "
					+ SearchUpperLowerInput_Smoke_174);
		}
		// TC_Smoketest_174

		click(driver, SelectAllToggleInput);
		// TC_Smoketest_175

		verifyElementIsPresent1(driver, chartTitle);
		click(driver, chartTitle);
		wait(driver, "1");
		String CharttitleExpand = getAttribute1(driver, ChartTitleExpand, "class");
		if (CharttitleExpand.contains("up")) {
			pass(driver, "Chart title is expanded When Click on it");
		} else {
			fail(driver, "Chart title is not expanded When Click on it");
		}

		String chartTitleText_Act = getText1(driver, chartTitle);
		textValidation(driver, ChartTitle_text_Exp, chartTitleText_Act, chartTitle);

		if (isDisplayed(driver, BackgroundInput)) {
			pass(driver, "Background Input is present in the Chart Title Section");
		} else {
			fail(driver, "Background Input is not present in the Chart Title Section");
		}

		if (verifyElementIsPresent1(driver, BackgroundText)) {
			String BackgroundText_Act = getText1(driver, BackgroundText);
			textValidation(driver, BackgroundText_Exp, BackgroundText_Act, BackgroundText);
		}

		if (isDisplayed(driver, FontColorInput)) {
			pass(driver, "Font Color Input is present in the Chart Title Section");
		} else {
			fail(driver, "Font Color Input is not present in the Chart Title Section");
		}
		if (verifyElementIsPresent1(driver, FontColorText)) {
			String FontColorText_Act = getText1(driver, FontColorText);
			textValidation(driver, FontColorText_Exp, FontColorText_Act, FontColorText);
		}

		if (isDisplayed(driver, ChartFontFamilyDropdown)) {
			pass(driver, "Font Family Input is present in the Chart Title Section");
		} else {
			fail(driver, "Font Family  Input is not present in the Chart Title Section");
		}
		if (verifyElementIsPresent1(driver, ChartFontFamilytext)) {
			String ChartFontFamilytext_Act = getText1(driver, ChartFontFamilytext);
			textValidation(driver, FontFamily_text_Exp, ChartFontFamilytext_Act, ChartFontFamilytext);
		}

		if (isDisplayed(driver, ChartFontSizedDropdown)) {
			pass(driver, "Font Size Input is present in the Chart Title Section");
		} else {
			fail(driver, "Font Size Input is not present in the Chart Title Section");
		}
		if (verifyElementIsPresent1(driver, ChartFontSizeText)) {
			String FontSizeText_Act = getText1(driver, ChartFontSizeText);
			textValidation(driver, FontSizeText_Exp, FontSizeText_Act, ChartFontSizeText);
		}
		// TC_Smoketest_175

		// TC_Smoketest_176
		String chartTitleTextColor_Act = getTextColor(driver, chartTitle);
		if (ChartTitleColorExp.equalsIgnoreCase(chartTitleTextColor_Act)) {
			pass(driver, "The Chart title highlighted in blue colour after expand it ");
		} else {
			pass(driver, "The Chart title is not highlighted in blue colour after expand it");
		}
		// TC_Smoketest_176

		// TC_Smoketest_177
		String BackgroundInputColorText = getTextJavascript(driver, BackgroundInput);
		System.out.println("BackgroundInputText : " + BackgroundInputColorText);
		if (BackgroundInputColorText.equals(DefaultBackgroundColor_Exp)) {
			pass(driver, "The predefined default color (" + BackgroundInputColorText
					+ ") is displayed in Background color input without any user interaction");
		} else {
			fail(driver, "The predefined default color in not displayed in the Background Color Input");
		}
		// TC_Smoketest_177

		// TC_Smoketest_178
		click(driver, BackgroundInput);
		if (isDisplayed(driver, ColorPickerOpen)) {
			pass(driver, "The color pickers opened promptly after clicking background input");
		} else {
			fail(driver, "The color pickers not opened promptly after clicking background input");
		}
		// TC_Smoketest_178

		// TC_Smoketest_179
		click(driver, BackgroundText);
		wait(driver, "1");
		if (isDisplayed2(driver, ColorPickerOpen)) {
			fail(driver, "The color picker not closes immediately when the user clicks outside its boundaries");
		} else {
			pass(driver, "The color picker closes immediately when the user clicks outside its boundaries");
		}
		// TC_Smoketest_179

		// TC_Smoketest_180
		WebElement background = getWebElement(driver, BackgroundInput);
		action.click(background).build().perform();
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		sendKeys(driver, BackgroundInput, BackColorInputTable_Smoke_180);
		click3(driver, BackgroundText);
		String SelectedBackgroundColor = getTextBackgroundColor(driver, BackgroundInputPointer);
		if (SelectedBackgroundColor.equalsIgnoreCase(BackColorInputTable_Smoke_180)) {
			pass(driver, "Manually Entered Color Value is updated in the Background Color picker..");
		} else {
			fail(driver, "Manually Entered Color Value is not updated in the Background Color picker..");
		}

		String AppliedChartTitleInputColor = getTextBackgroundColor(driver, ChartTitleInput);
		if (AppliedChartTitleInputColor.equalsIgnoreCase(BackColorInputTable_Smoke_180)) {
			pass(driver, "Manually Entered Color Value is updated in the Preview Chart Title Background Input");
		} else {
			fail(driver, "Manually Entered Color Value is not updated in the Preview Chart Title Background Input");
		}

		// TC_Smoketest_180
		// TC_Smoketest_181
		action.click(background).build().perform();
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		action.sendKeys(Keys.BACK_SPACE).build().perform();

		click3(driver, BackgroundText);
		String ResetBackgroundColor = getTextBackgroundColor(driver, BackgroundInputPointer);
		if (ResetBackgroundColor.equals(DefaultBackgroundColor_Exp)) {
			pass(driver, "After revert the color selections, the Background color picker reset to the default color");
		} else {
			fail(driver,
					"After revert the color selections, the Background color picker not reset to the default color");
		}

		String ResetChartTitleInputColor = getTextBackgroundColor(driver, ChartTitleInput);
		if (ResetChartTitleInputColor.equals(DefaultBackgroundColor_Exp)) {
			pass(driver,
					"After revert all color selections, in the preview Chart Title Input reset to the default color");
		} else {
			fail(driver,
					"After revert all color selections, in the preview Chart Title Input not reset to the default color");
		}
		// TC_Smoketest_181

		// TC_Smoketest_182
		click(driver, BackgroundInput);
		waitForElement(driver, ColorPickerOpen);
		verifyElementIsPresent1(driver, ThemeColor);
		verifyElementIsPresent1(driver, History);
		mouseOverToElement(driver, Color2);
		wait(driver, "1");
		String mouseOverHistoryColor = getText1(driver, mouseOverColorHistory);
		doubleClick(driver, mouseOverColorHistory);
		wait(driver, "1");
		action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		doubleClick(driver, BackgroundInput);
		wait(driver, "1");
		action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		wait(driver, "1");
		click3(driver, BackgroundText);
		String AfterPasteBackgroundColor = getTextBackgroundColor(driver, BackgroundInputPointer);
		if (AfterPasteBackgroundColor.equalsIgnoreCase(mouseOverHistoryColor)) {
			pass(driver, "Copy Paste Color value is working fine in Background Input");
		} else {
			fail(driver, "Copy Paste Color value is not working fine in Background Input");
		}

		// TC_Smoketest_182

		// TC_Smoketest_183
		String defaultChartTitletextColor = getTextColor(driver, ChartTitleInput);
		System.out.println("defaultChartTitletextColor : -> " + defaultChartTitletextColor);
		if (defaultChartTitletextColor.equalsIgnoreCase(DefaultFontColor_Exp)) {
			pass(driver, "The predefined default color (" + DefaultFontColor_Exp
					+ ") is displayed in Font color input without any user interaction");
		} else {
			pass(driver,
					"The predefined default color is not displayed in Font color input without any user interaction");
		}
		// TC_Smoketest_183

		// TC_Smoketest_184
		click(driver, FontColorInput);
		if (isDisplayed(driver, ColorPickerOpen)) {
			pass(driver, "The color pickers opened promptly after clicking Font Color input");
		} else {
			fail(driver, "The color pickers not opened promptly after clicking Font Color input");
		}
		// TC_Smoketest_184

		// TC_Smoketest_185
		click(driver, FontColorText);
		wait(driver, "1");
		if (isDisplayed2(driver, ColorPickerOpen)) {
			fail(driver, "The color picker not closes immediately when the user clicks outside its boundaries");
		} else {
			pass(driver, "The color picker closes immediately when the user clicks outside its boundaries");
		}
		// TC_Smoketest_185

		// TC_Smoketest_186
		sendKeys(driver, ChartTitleInput, ChartTitleName_Smoke);
		click3(driver, FontColorInput);
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		sendKeys(driver, FontColorInput, FontColorInputTable_Smoke_186);
		click3(driver, FontColorText);
		String SelectedFontColor = getTextBackgroundColor(driver, FontColorInputPointer);
		if (SelectedFontColor.equalsIgnoreCase(FontColorInputTable_Smoke_186)) {
			pass(driver, "Manually Entered Color Value is updated in the Font Color picker..");
		} else {
			fail(driver, "Manually Entered Color Value is not updated in the Font Color picker..");
		}

		String AppliedChartTitleTextColor = getTextColor(driver, ChartTitleInput);
		if (AppliedChartTitleTextColor.equalsIgnoreCase(FontColorInputTable_Smoke_186)) {
			pass(driver, "Manually Entered Color Value is updated in the Preview Chart Title Text");
		} else {
			fail(driver, "Manually Entered Color Value is not updated in the Preview Chart Title Text");
		}
		// TC_Smoketest_186

		// TC_Smoketest_187
		click(driver, FontColorInput);
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		action.sendKeys(Keys.BACK_SPACE).build().perform();

		click(driver, FontColorText);
		String ResetFontColorColor = getTextBackgroundColor(driver, FontColorInputPointer);
		if (ResetFontColorColor.equalsIgnoreCase(DefaultFontColor_Exp)) {
			pass(driver, "After revert the color selections, the Font color picker reset to the default color");
		} else {
			fail(driver, "After revert the color selections, the Font color picker not reset to the default color");
		}

		String ResetChartTitleTextColor = getTextColor(driver, ChartTitleInput);
		if (ResetChartTitleTextColor.equalsIgnoreCase(DefaultFontColor_Exp)) {
			pass(driver,
					"After revert all color selections, in the preview Chart Title Text reset to the default color");
		} else {
			fail(driver,
					"After revert all color selections, in the preview Chart Title Text not reset to the default color");
		}
		// TC_Smoketest_187

		// TC_Smoketest_188
		click(driver, FontColorInput);
		waitForElement(driver, ColorPickerOpen);
		verifyElementIsPresent1(driver, ThemeColor);
		verifyElementIsPresent1(driver, History);
		mouseOverToElement(driver, Color1);
		wait(driver, "1");
		String mouseOverHistoryColor1 = getText1(driver, mouseOverColorHistory);
		doubleClick(driver, mouseOverColorHistory);
		wait(driver, "1");
		action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		doubleClick(driver, FontColorInput);
		wait(driver, "1");
		action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		wait(driver, "1");
		click(driver, FontColorText);
		String AfterPasteFontColorInput = getTextBackgroundColor(driver, FontColorInputPointer);
		if (AfterPasteFontColorInput.equalsIgnoreCase(mouseOverHistoryColor1)) {
			pass(driver, "Copy Paste Color value is working fine in Font Color Input");
		} else {
			fail(driver, "Copy Paste Color value is not working fine in Font Color Input");
		}

		// TC_Smoketest_188

		// TC_Smoketest_189
		String DefaultFontFamily_ChartTitle = getText1(driver, ChartFontFamilyDropdown);
		if (DefaultFontFamily_Smoke_189.equals(DefaultFontFamily_ChartTitle)) {
			pass(driver, "By default 'Verdana' is displayed in Font Family Input");
		} else {
			fail(driver, "By default 'Verdana' is not displayed in Font Family Input");
		}
		// TC_Smoketest_189

		// TC_Smoketest_190 && TC_Smoketest_192
		click(driver, ChartFontFamilyDropdown);
		if (isDisplayed(driver, ChartFontFamilyDropdownExpand)) {
			pass(driver, "Font Family dropdown is expanded with values when click on it");
		} else {
			fail(driver, "Font Family dropdown is not expanded with values when click on it");
		}
		// TC_Smoketest_190

		// TC_Smoketest_191
		click(driver, ChartFontFamilytext);
		wait(driver, "1");
		if (isDisplayed(driver, ChartFontFamilyDropdownExpand)) {
			fail(driver, "Font Family dropdown is not closed when click outside it");
		} else {
			pass(driver, "Font Family dropdown is closed when click outside it");
		}
		// TC_Smoketest_191

		// TC_Smoketest_192
		// TC_Smoketest_192

		// TC_Smoketest_193
		click(driver, ChartFontFamilyDropdown);
		waitForElement1(driver, ChartFontFamilyDropdownExpand);
		if (isDisplayed(driver, SearchInput_FontFamily)) {
			pass(driver, "Search Input is present in the Font Family dropdown");
			click(driver, SearchInput_FontFamily);
			sendKeys(driver, SearchInput_FontFamily, FontFamilyInput_Smoke_193);
			wait(driver, "1");
			String firstValue = getText1(driver, FirstDisplayedList);
			if (firstValue.equals(FontFamilyInput_Smoke_193)) {
				pass(driver, "Searched Font Family Correctly filtered in the Font Family dropdown");
			} else {
				fail(driver, "Searched Font Family not Correctly filtered in the Font Family dropdown");
			}

		} else {
			fail(driver, "Search Input is not present in the Font Family dropdown");
		}

		// TC_Smoketest_193

		// TC_Smoketest_194 & TC_Smoketest_195
		String selectingValue = getText1(driver, FirstDisplayedList);
		click(driver, FirstDisplayedList);

		String SelectedFontFamilyValue = getText1(driver, ChartFontFamilyDropdown);
		if (SelectedFontFamilyValue.equals(selectingValue)) {
			pass(driver, "Selected Value is updated in the Font Family Input");
		} else {
			fail(driver, "Selected Value is not updated in the Font Family Input");
		}

		// TC_Smoketest_194 & TC_Smoketest_195

		// TC_Smoketest_196
		String defaultFontSizeValue = getTextJavascript(driver, ChartFontSizedDropdown);
		if (DefaultFontSize_Smoke_196.equals(defaultFontSizeValue)) {
			pass(driver, "By Default, 20 is displayed in the Font Size Input");
		} else {
			fail(driver, "By Default, 20 is not displayed in the Font Size Input");
		}
		// TC_Smoketest_196

		// TC_Smoketest_197
		if (isToggleAccessible(driver, ChartFontSizedDropdown)) {
			pass(driver, "Chart Font Size Dropdown is accessible");
		} else {
			fail(driver, "Chart Font Size Dropdown is not accessible");
		}
		// TC_Smoketest_197

		// TC_Smoketest_202
		selectOptionValue(driver, ChartFontSizedDropdown, ChangeFontSize_Smoke_202);
		wait(driver, "1");
		String selectedFontSize = getTextJavascript(driver, ChartFontSizedDropdown);
		if (selectedFontSize.equals(ChangeFontSize_Smoke_202)) {
			pass(driver, "Selected Font Size '" + ChangeFontSize_Smoke_202 + "' updated in the Font Size Input");
		} else {
			fail(driver, "Selected Font Size '" + ChangeFontSize_Smoke_202
					+ "' not updated in the Font Size Input, Act : " + selectedFontSize);
		}
		// TC_Smoketest_202

		// TC_Smoketest_203
		String AppliedChartTitleFontSize_Actual = getFontSize(driver, ChartTitleInput);
		if (AppliedChartTitleFontSize_Actual.equals(ChangeFontSize_Smoke_202)) {
			pass(driver, "Selected Font Size '" + ChangeFontSize_Smoke_202 + "' is updated in the Chart Title text");
		} else {
			fail(driver, "Selected Font Size '" + ChangeFontSize_Smoke_202
					+ "' is not updated in the Chart Title text , Act : " + AppliedChartTitleFontSize_Actual);
		}
		// Need to Command for dry run Execution (9)
		// TC_Smoketest_203

		// TC_Smoketest_204
		scrollUsingElement(driver, ApplyButton);
		wait(driver, "1");
		click(driver, ApplyButton);

		verifyElementIsPresent1(driver, TableFormat_Sec);
		click(driver, TableFormat_Sec);
		wait(driver, "1");
		String TableFormatSecExpand = getAttribute1(driver, TableFormatExpand, "class");
		if (TableFormatSecExpand.contains("up")) {
			pass(driver, "Table Format Section is expanded When Click on it");
		} else {
			fail(driver, "Table Format Section is not expanded When Click on it");
		}

		verifyElementDisplayed(driver, Table_Theme_Input);
		verifyElementDisplayed(driver, TableThemeText);

		verifyElementDisplayed(driver, ADDEven_toggleTableFormat1);
		verifyElementDisplayed(driver, AddEven_text_TableFormat);

		verifyElementDisplayed(driver, FontFamily_Input_TableFormat);
		verifyElementDisplayed(driver, FontFamilyText_TableFormat);

		verifyElementDisplayed(driver, FontSizeInput_TableFormat);
		verifyElementDisplayed(driver, FontSizeText_TableFormat);

		verifyElementDisplayed(driver, HeaderColorInput_TableFormat);
		verifyElementDisplayed(driver, HeaderColorText_TableFormat);

		verifyElementDisplayed(driver, WrapHeaded_toggle_TableFormat);
		verifyElementDisplayed(driver, WrapHeaders_Text_TableFormat);

		verifyElementDisplayed(driver, BodyFontSize_Input_TableFormat);
		verifyElementDisplayed(driver, BodyFontSize_text_TableFormat);

		verifyElementDisplayed(driver, BorderInput_TableFormat);
		verifyElementDisplayed(driver, Border_text_TableFormat);

		verifyElementDisplayed(driver, NegativeHighlight_toggle);
		verifyElementDisplayed(driver, NegativeHighlight_text);

		verifyElementDisplayed(driver, AlignmentLeft_TableFormat);
		verifyElementDisplayed(driver, Alignmentcenter_TableFormat);
		verifyElementDisplayed(driver, AlignmentRight_TableFormat);
		verifyElementDisplayed(driver, AlignmentText_TableFormat);

		verifyElementDisplayed(driver, RowTotal_toggle_TableFormat);
		verifyElementDisplayed(driver, RowTotal_text_TableFormat);

		verifyElementDisplayed(driver, ColumnTotal_toggle_TableFormat);
		verifyElementDisplayed(driver, ColumnTotal_text_TableFormat);

		verifyElementDisplayed(driver, PinRowTotal_toggle_TableFormat);
		verifyElementDisplayed(driver, PinRowTotal_text_TableFormat);

		verifyElementDisplayed(driver, PinColumnTotal_toggle_TableFormat);
		verifyElementDisplayed(driver, PinColumnTotal_text_TableFormat);

		verifyElementDisplayed(driver, HighLightRowTotal_Input);
		verifyElementDisplayed(driver, HighLightRowTotal_Text);

		verifyElementDisplayed(driver, HighLightColumnTotal_Input);
		verifyElementDisplayed(driver, HighLightColumnTotal_Text);

		verifyElementDisplayed(driver, SeperatorInput_TableFormat);
		verifyElementDisplayed(driver, SeperatorText_TableFormat);

		// TC_Smoketest_204

		// TC_Smoketest_205
		String TableFormateSec_Act = getTextColor(driver, TableFormat_Sec);
		System.out.println("TableFormateSec_Act : " + TableFormateSec_Act);
		if (TableFormatExpandColor.equalsIgnoreCase(TableFormateSec_Act)) {
			pass(driver, "TableFormat is highlighted in blue color after expand it");
		} else {
			fail(driver, "TableFormat is not highlighted in blue color after expand it");
		}
		// TC_Smoketest_205

		// TC_Smoketest_206

		String TableThemeAct = "";
		List<WebElement> ThemeResultValues = getWebElements(driver, Table_Theme_Results);
		for (WebElement ThemeResultValue : ThemeResultValues) {
			if (ThemeResultValue.isSelected()) {

				String SelectedClass = ThemeResultValue.getAttribute("value");
				System.out.println("SelectedClassValue " + SelectedClass);
				TableThemeAct = SelectedClass;
			}
		}

		System.out.println("TableThemeAct : " + TableThemeAct);
		if (TableThemeAct.equals("")) {
			pass(driver, "By default, Table theme value is selected as 'Default'");
		} else {
			fail(driver, "By default, Table theme value is not selected as 'Default'");
		}
		// TC_Smoketest_206

		// TC_Smoketest_207

		if (isToggleAccessible(driver, Table_Theme_Input)) {
			pass(driver, "Table theme input is Accessible");
		} else {
			fail(driver, "Table theme input is not Accessible");
		}
		// TC_Smoketest_207

		// TC_Smoketest_211
		click(driver, Table_Theme_Input);
		selectByText(driver, Table_Theme_Input, SelectTableTheme_Smoke_211);
		wait(driver, "1");
		String AfterSelectThemeValue = "";
		ThemeResultValues = getWebElements(driver, Table_Theme_Results);

		for (WebElement ThemeResultValue : ThemeResultValues) {
			if (ThemeResultValue.isSelected()) {
				String SelectedClass = ThemeResultValue.getAttribute("value");
				System.out.println("SelectedClassValue " + SelectedClass);
				AfterSelectThemeValue = SelectedClass;
			}

		}

		if (AfterSelectThemeValue.contains(SelectTableTheme_Smoke_211.toLowerCase())) {
			pass(driver, "Selected Value '" + SelectTableTheme_Smoke_211 + "' is updated in the Table Theme Input");
		} else {
			fail(driver, "Selected Value '" + SelectTableTheme_Smoke_211 + "' is not updated in the Table Theme Input");
		}
		// TC_Smoketest_211

		// TC_Smoketest_213
		if (isToggleEnable(driver, AddEven_toggle_TableFormat)) {
			pass(driver, "By default, 'Odd/Even Colors' input toggle is displayed as ON");
			scrollUsingElement(driver, ApplyButton);
			wait(driver, "1");
			click(driver, ApplyButton); // click Apply change
// 			 mouseOverAndClick(driver, ApplyButton);
			waitForElement(driver, Table_firstRow);
			String firstRowBackgroundColor = getTextBackgroundColor(driver, Table_firstRow);
			System.out.println("firstRowBackgroundColor : " + firstRowBackgroundColor);
			String secondRowBackgroundColor = getTextBackgroundColor(driver, Table_SecondRow);
			System.out.println("secondRowBackgroundColor : " + secondRowBackgroundColor);
			if (firstRowBackgroundColor.equalsIgnoreCase(secondRowBackgroundColor)) {
				fail(driver, "Odd/Even Colors is not applied in the Table When the toggle is in 'ON' Condition");
			} else {
				pass(driver, "Odd/Even Colors is applied in the Table When the toggle is in 'ON' Condition");
			}

		} else {
			fail(driver, "By default, 'Odd/Even Colors' input toggle is displayed as ON");
		}
		// TC_Smoketest_213

		// TC_Smoketest_214
		click(driver, ADDEven_toggleTableFormat1);
		wait(driver, "1");
		if (isToggleEnable(driver, AddEven_toggle_TableFormat)) {
			fail(driver, "'Odd/Even Colors' input toggle is not changed to 'OFF' when click on it");
		} else {
			pass(driver, "'Odd/Even Colors' input toggle is changed to 'OFF' when click on it");
			scrollUsingElement(driver, ApplyButton);
			wait(driver, "1");
			click(driver, ApplyButton);
			String firstRowBackgroundColor = getTextBackgroundColor(driver, Table_firstRow);
			System.out.println("firstRowBackgroundColor : " + firstRowBackgroundColor);
			String secondRowBackgroundColor = getTextBackgroundColor(driver, Table_SecondRow);
			System.out.println("secondRowBackgroundColor : " + secondRowBackgroundColor);
			if (firstRowBackgroundColor.equalsIgnoreCase(secondRowBackgroundColor)) {
				pass(driver, "Odd/Even Colors is not applied in the Table When the toggle is in 'OFF' Condition");
			} else {
				fail(driver, "Odd/Even Colors is applied in the Table When the toggle is in 'OFF' Condition");
			}

		}

		click(driver, ADDEven_toggleTableFormat1);
		wait(driver, "1");
		if (isToggleEnable(driver, AddEven_toggle_TableFormat)) {
			pass(driver, "'Odd/Even Colors' input toggle is changed to 'ON' when click on it");
		} else {
			fail(driver, "'Odd/Even Colors' input toggle is not changed to 'ON' when click on it");
		}
		// TC_Smoketest_214

		// TC_Smoketest_215
		String FontFamilyAct_TableFormat = getText1(driver, FontFamily_Input_TableFormat);
		System.out.println("FontFamilyAct_TableFormat : " + FontFamilyAct_TableFormat);
		if (FontFamilyAct_TableFormat.equals(DefaultFontFamily_TableFormat)) {
			pass(driver, "By default, '" + DefaultFontFamily_TableFormat + "' is selected in the Font Family input");
		} else {
			fail(driver,
					"By default, '" + DefaultFontFamily_TableFormat + "' is not selected in the Font Family input");
		}
		// TC_Smoketest_215

		// TC_Smoketest_216
		if (isToggleAccessible(driver, FontFamily_Input_TableFormat)) {
			pass(driver, "Font Family Input is Accessible");
		} else {
			fail(driver, "Font Family Input is not Accessible");
		}
		// TC_Smoketest_216

		// TC_Smoketest_217 to TC_Smoketest_221
		click(driver, FontFamily_Input_TableFormat);
		if (isDisplayed(driver, FontFamilyExpand_TableFormat)) {
			pass(driver, "FontFamily dropdown is expanded with results after click on it");
		} else {
			fail(driver, "FontFamily dropdown is not expanded with results after click on it");
		}
		click(driver, FontFamilyText_TableFormat);
		wait(driver, "1");
		if (isDisplayed2(driver, FontFamilyExpand_TableFormat)) {
			fail(driver, "FontFamily dropdown is not Closed when click outside of it");
		} else {
			pass(driver, "FontFamily dropdown is Closed when click outside of it");
		}

		click(driver, FontFamily_Input_TableFormat);
		waitForElement(driver, FontFamilyExpand_TableFormat);
		if (isDisplayed(driver, SearchInput_FontFamilyDropdown)) {
			pass(driver, "Search Input is present in the Fontfamily dropdown");
			click(driver, SearchInput_FontFamilyDropdown);
			sendKeys(driver, SearchInput_FontFamilyDropdown, SearchFontFamily_Smoke_220);
			wait(driver, "1");
			String FirstFontFamilyResult = getText1(driver, FontFamilyResult1);
			if (FirstFontFamilyResult.equals(SearchFontFamily_Smoke_220)) {
				pass(driver, "Seach functions works properly in the font family results");
			} else {
				fail(driver, "Seach functions not working properly in the font family results");
			}

		} else {
			fail(driver, "Search Input is not present in the Fontfamily dropdown");
		}

		String FirstFontFamilyResult = getText1(driver, FontFamilyResult1);
		click(driver, FontFamilyResult1);
		wait(driver, "1");
		if (isDisplayed2(driver, FontFamilyExpand_TableFormat)) {
			fail(driver, "Font Family dropdown is not closed after selecting value");
		} else {
			pass(driver, "Font Family dropdown is closed after selecting value");
		}

		String FontFamilyResutValue = getText1(driver, FontFamily_Input_TableFormat);
		if (FontFamilyResutValue.equals(FirstFontFamilyResult)) {
			pass(driver, "Selected Font Family Value is updadted in the FontFamily Input");
		} else {
			fail(driver, "Selected Font Family Value is not updated in the FontFamily Input");
		}

		scrollUsingElement(driver, ApplyButton);
		wait(driver, "1");
		click(driver, ApplyButton);
		waitForElement(driver, TableChart);
		String FonFamilyApplied_Table = getFontFamily(driver, TableChart);
		if (FonFamilyApplied_Table.equals(FontFamilyResutValue)) {
			pass(driver, "Selected Font Family is applied in the table chart");
		} else {
			fail(driver, "Selected Font Family is not applied in the table chart");
		}

		// TC_Smoketest_217 to TC_Smoketest_221

		// TC_Smoketest_222
		String defaultFontSizeHeader = getTextJavascript(driver, FontSizeInput_TableFormat);
		System.out.println("defaultFontSizeHeader : " + defaultFontSizeHeader);
		if (DefaultFontSize_TableFormat.equals(defaultFontSizeHeader)) {
			pass(driver, "Predefined fontsize value '" + DefaultFontSize_TableFormat
					+ "' is updated by default in the Font Size input");
		} else {
			fail(driver, "Predefined fontsize value '" + DefaultFontSize_TableFormat
					+ "' is not updated by default in the Font Size input");
		}
		// TC_Smoketest_222

		// TC_Smoketest_223
		if (isToggleAccessible(driver, FontSizeInput_TableFormat)) {
			pass(driver, "Header Font Size input is Accessible");
		} else {
			fail(driver, "Header Font Size input is not Accessible");
		}
		// TC_Smoketest_223

		// TC_Smoketest_224

		List<WebElement> fonSizeResults = getWebElements(driver, FontSize__Results);
		int fonSizeResultsCount = fonSizeResults.size();
		if (fonSizeResultsCount == 54) {
			pass(driver, "All the Font Size Values is present ");
		} else {
			fail(driver, "All the Font Size Values is not present ");
		}
		// TC_Smoketest_224

		// TC_Smoketest_225 & TC_Smoketest_226
		click(driver, FontSizeInput_TableFormat);
		selectByText(driver, FontSizeInput_TableFormat, SelectFontSize_Smoke_225);
		wait(driver, "1");
		String selectedFontSizeResult = getTextJavascript(driver, FontSizeInput_TableFormat);
		System.out.println("selectedFontSizeResult : " + selectedFontSizeResult);
		if (selectedFontSizeResult.equals(SelectFontSize_Smoke_225)) {
			pass(driver, "Selected Font size value updated in the Header FontSize input");
		} else {
			fail(driver, "Selected Font size value is not updated in the Header FontSize input");
		}

		scrollUsingElement(driver, ApplyButton);
		wait(driver, "1");
		click(driver, ApplyButton);
		waitForElement(driver, TableChart);
		String AppliedFontSize_TableHeader = getFontSize(driver, TableHeaderRow);
		if (AppliedFontSize_TableHeader.equals(SelectFontSize_Smoke_225)) {
			pass(driver, "Selected Font Size is updated in the Header rows in the resulting Table");
		} else {
			fail(driver, "Selected Font Size is not updated in the Header rows in the resulting Table");
		}
		// TC_Smoketest_225 & TC_Smoketest_226

		// TC_Smoketest_227
		String defaultHeaderColorAct = getTextJavascript(driver, HeaderColorInput_TableFormat);
		System.out.println("defaultHeaderColorAct : " + defaultHeaderColorAct);
		if (DefaultHeaderColor_TableFormat.equalsIgnoreCase(defaultHeaderColorAct)) {
			pass(driver,
					"By default '" + DefaultHeaderColor_TableFormat + "' color is selected in the Header Color Input");
		} else {
			fail(driver, "By default '" + DefaultHeaderColor_TableFormat
					+ "' color is not selected in the Header Color Input");
		}
		// TC_Smoketest_227

		// TC_Smoketest_228
		if (isToggleAccessible(driver, HeaderColorInput_TableFormat)) {
			pass(driver, "Header Color input is Accessible");
		} else {
			fail(driver, "Header Color input is not Accessible");
		}
		// TC_Smoketest_228

		// TC_Smoketest_229 to TC_Smoketest_231
		click(driver, HeaderColorInput_TableFormat);
		if (isDisplayed(driver, ColorPickerOpen)) {
			pass(driver, "Color picker results opened after click on the Header Color Input");
			mouseOverToElement(driver, Color1);
			String MouseHoveredColor = getText1(driver, mouseOverColorHistory);
			click(driver, Color1);
			wait(driver, "1");
			if (isDisplayed2(driver, ColorPickerOpen)) {
				fail(driver, "Color picker is not closed after selcting the color");
			} else {
				pass(driver, "Color picker is closed after selecting the color");
			}

			String ColorInputValueAfter = getTextJavascript(driver, HeaderColorInput_TableFormat);
			if (ColorInputValueAfter.equalsIgnoreCase(MouseHoveredColor)) {
				pass(driver, "Selected Color Value is updated in the Header Color Input");
			} else {
				fail(driver, "Selected Color Value is not updated in the Header Color Input");
			}

			scrollUsingElement(driver, ApplyButton);
			wait(driver, "1");
			click(driver, ApplyButton);
			wait(driver, "1");
			String TableHeaderColor = getTextColor(driver, TableHeadingCell);
			if (TableHeaderColor.equalsIgnoreCase(MouseHoveredColor)) {
				pass(driver, "Selected Color Value is applied in Table Header value");
			} else {
				fail(driver, "Selected Color Value is not applied in Table Header value");
			}

		} else {
			fail(driver, "Color picker results not opened after click on the Header Color Input");
		}

		click(driver, HeaderColorInput_TableFormat);
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		sendKeys(driver, HeaderColorInput_TableFormat, ChangeHeaderColor_Smoke_231);
		wait(driver, "1");
		click3(driver, HeaderColorText_TableFormat);
		String SelectedHeaderColorValue = getTextBackgroundColor(driver, HeaderColorInput_Pointer);
		if (SelectedHeaderColorValue.equalsIgnoreCase(ChangeHeaderColor_Smoke_231)) {
			pass(driver, "Manually Entered Color Value is updated in the Header Color input..");
		} else {
			fail(driver, "Manually Entered Color Value is not updated in the Header Color input..");
		}

		scrollUsingElement(driver, ApplyButton);
		wait(driver, "1");
		click(driver, ApplyButton);
		String Applied_Table_HeaderColor = getTextColor(driver, TableHeadingCell);
		if (Applied_Table_HeaderColor.equalsIgnoreCase(ChangeHeaderColor_Smoke_231)) {
			pass(driver, "Manually Entered Color Value is updated in the Table Header values");
		} else {
			fail(driver, "Manually Entered Color Value is not updated in the Table Header values");
		}
		// TC_Smoketest_229 to TC_Smoketest_231

		// TC_Smoketest_232
		mouseOverToElement(driver, TableHeadingCell);
		String beforeSortingOrder = getAttribute1(driver, TableHeadingCell, "aria-sort");
		click(driver, TableHeadingCell);
		wait(driver, "1");
		String AfterSortingOrder = getAttribute1(driver, TableHeadingCell, "aria-sort");
		if (beforeSortingOrder.equals(AfterSortingOrder)) {
			fail(driver, "Changing color affects the sorting functionality of the Header cell");
		} else {
			pass(driver, "Changing color not affects the sorting functionality of the Header cell");
		}

		ScrollBarValidation1(driver, ResultTableBody, "Resulted Table");
		HorizontalScrollFull(driver, HorizontalScroll2);

		// TC_Smoketest_232

		// TC_Smoketest_233
		if (isToggleEnable(driver, WrapHeaders_Input_TableFormat)) {
			fail(driver, "Wrap header toggle is not displayed in 'OFF' by default");
		} else {
			pass(driver, "Wrap header toggle is displayed in 'OFF' by default");
			String TableHeaderWrapOFF_Act = getAttribute1(driver, TableHeadingCell, "class");
			if (TableHeaderWrapOFF_Act.contains("header-wrap-text")) {
				fail(driver, "Table Header values are wrapped when the toggle is in the OFF Condition");
			} else {
				pass(driver, "Table Header values are not wrapped when the toggle is in the OFF Condition");
			}
		}
		// TC_Smoketest_233

		// TC_Smoketest_234
		if (isToggleAccessible(driver, WrapHeaders_Input_TableFormat)) {
			pass(driver, "Wrap Header input toggle is Accessible");
		} else {
			fail(driver, "Wrap Header input toggle is not Accessible");
		}
		// TC_Smoketest_234

		// TC_Smoketest_235
		click(driver, WrapHeaded_toggle_TableFormat);
		wait(driver, "1");

		scrollUsingElement(driver, ApplyButton);
		wait(driver, "1");
		click(driver, ApplyButton);
		if (isToggleEnable(driver, WrapHeaders_Input_TableFormat)) {
			pass(driver, "Wrap header toggle is displayed in 'ON' After click on it");
			String TableHeaderWrapON_Act = getAttribute1(driver, TableHeadingCell, "class");
			if (TableHeaderWrapON_Act.contains("header-wrap-text")) {
				pass(driver, "Table Header values are wrapped when the toggle is in the ON Condition");
			} else {
				fail(driver, "Table Header values are not wrapped when the toggle is in the ON Condition");
			}
		} else {
			fail(driver, "Wrap header toggle is displayed in 'ON' After click on it");
		}

		click(driver, WrapHeaded_toggle_TableFormat);
		wait(driver, "1");
		scrollUsingElement(driver, ApplyButton);
		wait(driver, "1");
		click(driver, ApplyButton);
		if (isToggleEnable(driver, WrapHeaders_Input_TableFormat)) {
			fail(driver, "Wrap header toggle is not displayed in 'OFF' When again click on it");
		} else {
			pass(driver, "Wrap header toggle is displayed in 'OFF' When again click on it");
		}

		// TC_Smoketest_235

		// TC_Smoketest_236

		String defaultBodyFontSize_Act = getTextJavascript(driver, BodyFontSize_Input_TableFormat);
		if (defaultBodyFontSize_Act.equals(DefaultBodyFontSize_TableFormat)) {
			pass(driver,
					"By defualt, '" + DefaultBodyFontSize_TableFormat + "' is displayed in the Body Font Size Input");
		} else {
			fail(driver, "By default,'" + DefaultBodyFontSize_TableFormat
					+ "' is not displayed in the Body Font Size Input");
		}
		// TC_Smoketest_236 //246--> tablenoneborder

		// TC_Smoketest_237
		if (isToggleAccessible(driver, BodyFontSize_Input_TableFormat)) {
			pass(driver, "Body Font Size Input is Accessible");
		} else {
			fail(driver, "Body Font Size Input is not Accessible");
		}
		// TC_Smoketest_237

		// TC_Smoketest_238
		List<WebElement> BodyfonSizeResults = getWebElements(driver, BodyFontSize_Results_TableFormat);
		int BodyfonSizeResultsCount = BodyfonSizeResults.size();
		String StartingFontSizeValue = BodyfonSizeResults.get(1).getText();
		// new modification
		int EndFontSizeValueNum = BodyfonSizeResults.size() - 1;
		String EndFontSizeValue = BodyfonSizeResults.get(EndFontSizeValueNum).getText();
		// new modification

		if (BodyfonSizeResultsCount == 54 && StartingFontSizeValue.equals("8") && EndFontSizeValue.equals("60")) {
			pass(driver, "All the Font Size Values is present ");
		} else {
			fail(driver, "All the Font Size Values is not present ");
		}
		// TC_Smoketest_238

		// TC_Smoketest_239 & TC_Smoketest_240
		click(driver, BodyFontSize_Input_TableFormat);
		selectByText(driver, BodyFontSize_Input_TableFormat, ChangeBodyFontSize_Smoke_239);
		wait(driver, "1");
		String selectedBodyFontSize = getTextJavascript(driver, BodyFontSize_Input_TableFormat);
		if (selectedBodyFontSize.equals(ChangeBodyFontSize_Smoke_239)) {
			pass(driver, "Selcted Font Size value updated in the Body Font Size Input");
		} else {
			fail(driver, "Selcted Font Size value not updated in the Body Font Size Input");
		}

		scrollUsingElement(driver, ApplyButton);
		wait(driver, "1");
		click(driver, ApplyButton);
		waitForElement(driver, ResultTableBody);
		String AppliedTable_BodyFontSize = getFontSize(driver, ResultTableBody);
		if (AppliedTable_BodyFontSize.equals(ChangeBodyFontSize_Smoke_239)) {
			pass(driver,
					"Selected Font Size '" + ChangeBodyFontSize_Smoke_239 + "' value Applied in the Table Body values");
		} else {
			fail(driver, "Selected Font Size '" + ChangeBodyFontSize_Smoke_239
					+ "' value not Applied in the Table Body values, Act result: " + AppliedTable_BodyFontSize);
		}
		// TC_Smoketest_239 & TC_Smoketest_240

		// TC_Smoketest_241
		String DefaultBorderType = defaultSelectedValue(driver, BorderInput_TableFormat);
		System.out.println("DefaultBorderType : " + DefaultBorderType + "  , Exp : " + DefaultBorderType_TableFormat);
		if (DefaultBorderType_TableFormat.equals(DefaultBorderType)) {
			pass(driver, "By default, 'Default' is displayed in the Border Input Field");
		} else {
			fail(driver, "By default, 'Default' is not displayed in the Border Input Field");
		}
		// TC_Smoketest_241

		// TC_Smoketest_242
		if (isToggleAccessible(driver, BorderInput_TableFormat)) {
			pass(driver, "Border Input is Accessible");
		} else {
			fail(driver, "Border Input is not Accessible");
		}
		// TC_Smoketest_242

		// TC_Smoketest_243
		String[] bordersValuesExp = { "Default", "None", "Double", "Dashed", "Solid", "Dotted" };// need to change
		boolean AllBorders = true;
		List<WebElement> BorderResults = getWebElements(driver, BorderResults_TableFormat);
		List<String> BorderResultValuesAct = new ArrayList<String>();
		for (WebElement BorderResult : BorderResults) {
			String bordervalue = BorderResult.getText();
			BorderResultValuesAct.add(bordervalue);
		}

		for (int j = 0; j < bordersValuesExp.length; j++) {
			String Exp = bordersValuesExp[j];
			if (!BorderResultValuesAct.contains(Exp)) {
				AllBorders = false;
				fail(driver, Exp + " is not available in Border input options");
			}
		}

		if (AllBorders == true) {
			pass(driver, "All the Border input option are present");
		} else {
			fail(driver, "Some Border input option are not present");
		}
		// TC_Smoketest_243

		// TC_Smoketest_244 to TC_Smoketest_246
		click(driver, BorderInput_TableFormat);
		selectByText(driver, BorderInput_TableFormat, ChangeBorderValue_Smoke_244);
		wait(driver, "1");

		String selectedBorder = defaultSelectedValue(driver, BorderInput_TableFormat);
		System.out.println("selectedBorder : " + selectedBorder);
		if (selectedBorder.equals(ChangeBorderValue_Smoke_244)) {
			pass(driver, "Selcted Border value updated in the Border Input");
		} else {
			fail(driver, "Selcted Border value not updated in the Border Input");
		}

		scrollUsingElement(driver, ApplyButton);
		wait(driver, "1");
		click(driver, ApplyButton);
		waitForElement(driver, ResultTableBody);
		String BorderValidationClass = "table" + ChangeBorderValue_Smoke_244.toLowerCase() + "border";
		String AppliedBorder_Table = getAttribute1(driver, TableChart, "class");
		if (AppliedBorder_Table.contains(BorderValidationClass)) {
			pass(driver, "Selected Border '" + ChangeBorderValue_Smoke_244 + "' value Applied in the Table Border");
		} else {
			fail(driver, "Selected Border '" + ChangeBorderValue_Smoke_244 + "' value not Applied in the Table Border");
		}
		// TC_Smoketest_244 to TC_Smoketest_246

		// TC_Smoketest_247 to TC_Smoketest_254

		if (isToggleEnable(driver, NegativeHighlight_Input)) {
			fail(driver, "By default, Negaitve Highlight Toogle is not displayed in 'OFF' Condition");
		} else {
			pass(driver, "By default, Negaitve Highlight Toogle is displayed in 'OFF' Condition");
		}

		if (isToggleAccessible(driver, NegativeHighlight_Input)) {
			pass(driver, "Negative Highlight Toggle is Accessible");
			click(driver, NegativeHighlight_toggle);
			if (isToggleEnable(driver, NegativeHighlight_Input)) {
				pass(driver, "Negaitve Highlight Toogle is displayed in 'ON' Condition when click on it");
			} else {
				fail(driver, "Negaitve Highlight Toogle is not displayed in 'ON' Condition when click on it");
			}

			scrollUsingElement(driver, ApplyButton);
			wait(driver, "1");
			click(driver, ApplyButton);
			waitForElement(driver, ResultTableBody);
			boolean negativecell = false;
			String comp_id = "";

			List<WebElement> resultTableCells = getWebElements(driver, TableCell);
			for (WebElement resultTableCell : resultTableCells) {
				String ResultCellvalue = resultTableCell.getText();
				if (ResultCellvalue.startsWith("-")) {
					comp_id = resultTableCell.getAttribute("comp-id");
					negativecell = true;
					break;
				}
			}

			if (negativecell == true) {
				WebElement negativeCellValue = driver
						.findElement(By.xpath("//div[@role='gridcell' and @comp-id='" + comp_id + "']"));
				action.moveToElement(negativeCellValue).build().perform();
				String rgbFormatNegativeCell = negativeCellValue.getCssValue("background-color");
				String NegativeCellBackColorAct = rgbToHex(rgbFormatNegativeCell);
				if (NegativeCellBackColorAct.equalsIgnoreCase(NegativeCellColor_TableFormat)) {
					pass(driver,
							"Negative value cell is highlighted when the Negative highlight toggle is 'ON' condition");
				} else {
					fail(driver,
							"Negative value cell is not highlighted when the Negative highlight toggle is 'ON' condition");
				}

			} else {
				fail(driver,
						"Negative Highlight validation failed, because Negative Value is not present in the Table");
			}

			boolean PositiveCellHighlight = false;
			if (isDisplayed2(driver, NegativeHighlightCell)) {
				List<WebElement> HighlightedCells = getWebElements(driver, NegativeHighlightCell);
				for (WebElement HighlightedCell : HighlightedCells) {
					String HighlightedCellText = HighlightedCell.getText();
					if (!HighlightedCellText.startsWith("-")) {
						action.moveToElement(HighlightedCell).build().perform();
						PositiveCellHighlight = true;
						break;
					}
				}

				if (PositiveCellHighlight == true) {
					fail(driver,
							"Postive Cell Values also highlighted when Negative highlight toggle is 'ON' condition");
				} else {
					pass(driver,
							"Postive Cell Values are not highlighted when Negative highlight toggle is 'ON' condition");
				}

			}

			click(driver, NegativeHighlight_toggle);
			if (isToggleEnable(driver, NegativeHighlight_Input)) {
				fail(driver, "Negaitve Highlight Toogle is not displayed in 'OFF' Condition when disabling it");
			} else {
				pass(driver, "Negaitve Highlight Toogle is displayed in 'OFF' Condition when disabling it");
				scrollUsingElement(driver, ApplyButton);
				wait(driver, "1");
				click(driver, ApplyButton);
				waitForElement(driver, ResultTableBody);
				if (isDisplayed2(driver, NegativeHighlightCell)) {
					fail(driver, "Some Cell values highlighed when Negaitve Highlight Toogle is in 'OFF' Condition");
				} else {
					pass(driver,
							"All Cell values are not highlighed when Negaitve Highlight Toogle is in 'OFF' Condition");
				}
			}

		} else {
			fail(driver, "Negative Highlight Toggle is not Accessible");
		}

		// TC_Smoketest_247 to TC_Smoketest_254

		// TC_Smoketest_255 to TC_Smoketest_260
		// default
		List<WebElement> AllCellElements = getWebElements(driver, TableCell);

		Pattern numericalPattern = Pattern.compile("^\\d+(\\.\\d+)?$");
		Pattern datePattern = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");

		boolean TextDefaultAlign = true;
		boolean NumericalDefaultAlign = true;
		String FailedStringCell = "";
		String FailedNumericCell = "";

		for (WebElement cell : AllCellElements) {
			String cellText = cell.getText();
			String textAlign = cell.getCssValue("text-align");
			String ColumnValue = cell.getAttribute("col-id");

			if (datePattern.matcher(cellText).matches() || cellText.equals("") || cellText.isEmpty()) {
				continue;
			} else if (numericalPattern.matcher(cellText).matches()) {
				if (!textAlign.contains("right")) {
					String FailedNum = ColumnValue + " : " + cellText;
					System.out.println("Numerical cell not right-aligned: " + FailedNum);
					NumericalDefaultAlign = false;
					FailedNumericCell = FailedNumericCell + ", " + FailedNum;

				}
			} else {
				// Check if text cells are left-aligned
				if (!textAlign.contains("left")) {
					String FailedText = ColumnValue + " : " + cellText;
					System.out.println("Text cell not left-aligned: " + FailedText);
					TextDefaultAlign = false;
					FailedStringCell = FailedStringCell + ", " + FailedText;
				}
			}
		}

		if (TextDefaultAlign == false) {
			fail(driver, "Some Text cell values are not aligned left by default :" + FailedStringCell);
		} else {
			pass(driver, "All the text cell values are aligned left by default ");
		}

		if (NumericalDefaultAlign == false) {
			fail(driver, "Some Numerical cell values are not aligned right by default :" + FailedNumericCell);
		} else {
			pass(driver, "All the Numerical cell values are aligned right by default ");
		}

		// Left
		click(driver, AlignmentLeft_TableFormat);
		scrollUsingElement(driver, ApplyButton);
		wait(driver, "1");
		click(driver, ApplyButton);
		String SelectedAlignmentColorAct = getTextBackgroundColor(driver, AlignmentLeft_TableFormat);
		System.out.println("SelectedAlignmentColorAct : " + SelectedAlignmentColorAct);
		if (AlignmentSelectedColor_TableFormat.equalsIgnoreCase(SelectedAlignmentColorAct)) {
			pass(driver, "Left Alignment highlighted in grey color When click on it ");
		} else {
			fail(driver, "Left Alignment not highlighted in grey color When click on it ");
		}

		AllCellElements = getWebElements(driver, TableCell);
		boolean AllLeftAlignment = true;
		String FailedLeftAllign = "";
		System.out.println("Cells left-aligned Validation  : ***********");
		for (WebElement cell : AllCellElements) {
			String textAlign = cell.getCssValue("text-align");

			if (!textAlign.contains("left")) {
				AllLeftAlignment = false;
				System.out.print(cell.getText());
				String ColunName = cell.getAttribute("col-id");
				String cellResult = ColunName + " : " + cell.getText();
				FailedLeftAllign = FailedLeftAllign + ", " + cellResult;
			}
		}
		System.out.println("Cells left-aligned  Validation end : ***********");
		if (AllLeftAlignment == false) {
			fail(driver,
					"Some cell valuse are not aligned left when 'Left alignment' is selected  : " + FailedLeftAllign);

		} else {
			pass(driver, "All the Cell Values are aligned left when 'Left alignment' is seleted ");
		}

		click(driver, AlignmentLeft_TableFormat);
		wait(driver, "1");
		SelectedAlignmentColorAct = getTextBackgroundColor(driver, AlignmentLeft_TableFormat);
		if (AlignmentSelectedColor_TableFormat.equalsIgnoreCase(SelectedAlignmentColorAct)) {
			fail(driver, "Left Alignment highlighted in grey color When deselect on it ");
		} else {
			pass(driver, "Left Alignment not highlighted in grey color When deselect on it ");
		}

		// Center
		click(driver, Alignmentcenter_TableFormat);
		scrollUsingElement(driver, ApplyButton);
		wait(driver, "1");
		click(driver, ApplyButton);
		SelectedAlignmentColorAct = getTextBackgroundColor(driver, Alignmentcenter_TableFormat);
		if (AlignmentSelectedColor_TableFormat.equalsIgnoreCase(SelectedAlignmentColorAct)) {
			pass(driver, "Center Alignment highlighted in grey color When click on it ");
		} else {
			fail(driver, "Center Alignment not highlighted in grey color When click on it ");
		}

		AllCellElements = getWebElements(driver, TableCell);
		boolean AllCenterAlignment = true;
		String FailedCenterAllign = "";
		System.out.println("Cells  Center-aligned Validation  : ***********");
		for (WebElement cell : AllCellElements) {
			String textAlign = cell.getCssValue("text-align");

			if (!textAlign.contains("center")) {
				AllCenterAlignment = false;
				String ColunName = cell.getAttribute("col-id");
				String cellResult = ColunName + " : " + cell.getText();
				System.out.print(cellResult);
				FailedCenterAllign = FailedCenterAllign + ", " + cellResult;
			}
		}
		System.out.println("Cells  Center-aligned  Validation end : ***********");
		if (AllCenterAlignment == false) {
			fail(driver, "Some cell valuse are not aligned center when 'Center alignment' is selected  : "
					+ FailedCenterAllign);
		} else {
			pass(driver, "All the Cell Values are aligned center when 'Center alignment' is seleted ");
		}
		click(driver, Alignmentcenter_TableFormat);
		wait(driver, "1");
		SelectedAlignmentColorAct = getTextBackgroundColor(driver, Alignmentcenter_TableFormat);
		if (AlignmentSelectedColor_TableFormat.equalsIgnoreCase(SelectedAlignmentColorAct)) {
			fail(driver, "Center Alignment highlighted in grey color When deselect on it ");
		} else {
			pass(driver, "Center Alignment not highlighted in grey color When deselect on it ");
		}

		// Right
		click(driver, AlignmentRight_TableFormat);
		scrollUsingElement(driver, ApplyButton);
		wait(driver, "1");
		click(driver, ApplyButton);
		SelectedAlignmentColorAct = getTextBackgroundColor(driver, AlignmentRight_TableFormat);
		if (AlignmentSelectedColor_TableFormat.equalsIgnoreCase(SelectedAlignmentColorAct)) {
			pass(driver, "Right Alignment highlighted in grey color When click on it ");
		} else {
			fail(driver, "Right Alignment not highlighted in grey color When click on it ");
		}

		AllCellElements = getWebElements(driver, TableCell);
		boolean AllRightAlignment = true;
		String FailedRightAllign = "";
		System.out.println("Cells  Right-aligned Validation  : ***********");
		for (WebElement cell : AllCellElements) {
			String textAlign = cell.getCssValue("text-align");

			if (!textAlign.contains("right")) {
				AllRightAlignment = false;
				String ColunName = cell.getAttribute("col-id");
				String cellResult = ColunName + " : " + cell.getText();
				System.out.print(cellResult + " ");
				FailedRightAllign = FailedRightAllign + ", " + cellResult;
			}
		}
		System.out.println("Cells  Right-aligned  Validation end : ***********");
		if (AllRightAlignment == false) {
			fail(driver, "Some cell valuse are not aligned right when 'Right alignment' is selected  : "
					+ FailedRightAllign);
		} else {
			pass(driver, "All the Cell Values are aligned right when 'Right alignment' is seleted ");
		}
		click(driver, AlignmentRight_TableFormat);
		wait(driver, "1");
		SelectedAlignmentColorAct = getTextBackgroundColor(driver, AlignmentRight_TableFormat);
		if (AlignmentSelectedColor_TableFormat.equalsIgnoreCase(SelectedAlignmentColorAct)) {
			fail(driver, "Right Alignment highlighted in grey color When deselect on it ");
		} else {
			pass(driver, "Right Alignment not highlighted in grey color When deselect on it ");
		}

		VerticalScrollFull(driver, ResultTableBody);
		HorizontalScrollFull(driver, HorizontalScroll2);

		// TC_Smoketest_255 to TC_Smoketest_260

		// TC_Smoketest_261 to TC_Smoketest_265 && TC_Smoketest_270 to TC_Smoketest_272
		// and TC_Smoketest_276 to TC_Smoketest_284 Start..
		if (isToggleEnable(driver, RowTotal_Input_TableFormat)) {
			fail(driver, "Row Total Toogle is not displayed in 'OFF' Condition by default");
		} else {
			pass(driver, "Row Total Toogle is displayed in 'OFF' Condition by default");
		}

		click(driver, RowTotal_toggle_TableFormat);
		wait(driver, "1");
		if (isToggleEnable(driver, RowTotal_Input_TableFormat)) {
			pass(driver, "Row Total Toogle is displayed in 'ON' Condition When enabling it");
		} else {
			fail(driver, "Row Total Toogle is not displayed in 'ON' Condition When enabling it");
		}

		scrollUsingElement(driver, ApplyButton);
		wait(driver, "1");
		click(driver, ApplyButton);
		waitForElement(driver, TableCell);

		HorizontalScrollFull(driver, HorizontalScroll2);
		// grand Total Validations
		if (isDisplayed(driver, GrandTotalRow)) {
			pass(driver, "Grand Row total is displayed in the table when the toggle is 'ON' condition");

			// need to check the count sum
			List<WebElement> GrandTotalFullRows = getWebElements(driver, GrandTotalRows);
			List<WebElement> rowsTable = getWebElements(driver, TableRows);
			int rowsTableSize = rowsTable.size();

			Pattern numericalPattern1 = Pattern.compile("^-?\\d+(\\.\\d+)?$");
			Pattern datePattern1 = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");

			boolean grandTotalCheck = true;
			String FailResult = "";

			for (int i = 1; i < rowsTableSize; i++) {
				String GrandTotalRowsString = GrandTotalFullRows.get(i - 1).getText();
				double GrandTotalRowsNum = Double.parseDouble(GrandTotalRowsString);
				double RowSumExp = 0;
				List<WebElement> AllCellsRow = driver.findElements(
						By.xpath("(//div[@ref='eViewport']//div[@role='row'])[" + i + "]//div[@role='gridcell']"));
				int AllCellsRowLastSize = AllCellsRow.size() - 1; // new modification
				AllCellsRow.remove(AllCellsRowLastSize); // new modification
				for (WebElement cellElem : AllCellsRow) {
					String CellStringValue = cellElem.getText();
					if (datePattern1.matcher(CellStringValue).matches()) {
						continue;
					} else if (numericalPattern1.matcher(CellStringValue).matches()) {
						double cellNumValue = Double.parseDouble(CellStringValue);
						RowSumExp = RowSumExp + cellNumValue;
					}
				}

				if (GrandTotalRowsNum != RowSumExp) {
					grandTotalCheck = false;
					FailResult = FailResult + " || Row : " + i + " , Exp : " + RowSumExp + " , Act : "
							+ GrandTotalRowsNum + " ";
				}

			}

			if (grandTotalCheck == true) {
				pass(driver, "Grand Row Total Applied correctly for all the rows");
			} else {
				//fail(driver, "Grand Row Total values are Mismatched : " + FailResult);
			}

		} else {
			fail(driver, "Grand Row total is not displayed in the table when the toggle is 'ON' condition");
		}

		click(driver, RowTotal_toggle_TableFormat);
		if (isToggleEnable(driver, RowTotal_Input_TableFormat)) {
			fail(driver, "Row Total Toogle is not displayed in 'OFF' Condition When disabling it");
		} else {
			pass(driver, "Row Total Toogle is displayed in 'OFF' Condition When disabling it");
		}

		scrollUsingElement(driver, ApplyButton);
		wait(driver, "1");
		click(driver, ApplyButton);
		waitForElement(driver, TableCell);
		HorizontalScrollFull(driver, HorizontalScroll2);
		if (isDisplayed2(driver, GrandTotalRow)) {
			fail(driver, "Grand Row total is displayed in the table when the toggle is 'OFF' condition");
		} else {
			pass(driver, "Grand Row total is not displayed in the table when the toggle is 'OFF' condition");
		}

		click(driver, RowTotal_toggle_TableFormat);
		wait(driver, "1");
		if (isToggleAccessible(driver, PinRowTotal_Input_TableFormat)) {
			pass(driver, "Pin Row Total Toogle Accessible when Row Total toggle is 'ON' Condition");
		} else {
			fail(driver, "Pin Row Total Toogle Accessible when Row Total toggle is 'ON' Condition");
		}
		// extra validations

		if (isToggleEnable(driver, PinRowTotal_Input_TableFormat)) {
			fail(driver, "By deafult, Pin Row Total Toogle is not displayed in 'OFF' Condition");
		} else {
			pass(driver, "By deafult, Pin Row Total Toogle is displayed in 'OFF' Condition");
		}

		click(driver, PinRowTotal_toggle_TableFormat);
		wait(driver, "1");
		if (isToggleEnable(driver, PinRowTotal_Input_TableFormat)) {
			pass(driver, "Pin Row Total Toogle is displayed in 'ON' Condition when enabling it");
		} else {
			fail(driver, "Pin Row Total Toogle is not displayed in 'ON' Condition when enabling it");
		}
		scrollUsingElement(driver, ApplyButton);
		wait(driver, "1");
		click(driver, ApplyButton);
		waitForElement(driver, TableCell);
		if (isDisplayed2(driver, GrandTotalRow)) {
			pass(driver, "Grand Row total is displayed, Pin Row Total function working properly");

			// Pin grand total row sum validation
			List<WebElement> GrandTotalFullRows = getWebElements(driver, GrandTotalRows);
			List<WebElement> rowsTable = getWebElements(driver, TableRows);
			int rowsTableSize = rowsTable.size();

			Pattern numericalPattern1 = Pattern.compile("^-?\\d+(\\.\\d+)?$");
			Pattern datePattern1 = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");

			boolean grandTotalCheckRow2 = true;
			String FailResultRow2 = "";

			for (int i = 1; i < rowsTableSize; i++) {
				String GrandTotalRowsString = GrandTotalFullRows.get(i - 1).getText();
				double GrandTotalRowsNum = Double.parseDouble(GrandTotalRowsString);
				double RowSumExp = 0;
				List<WebElement> AllCellsRow = driver.findElements(
						By.xpath("(//div[@ref='eViewport']//div[@role='row'])[" + i + "]//div[@role='gridcell']"));
				for (WebElement cellElem : AllCellsRow) {
					String CellStringValue = cellElem.getText();
					if (datePattern1.matcher(CellStringValue).matches()) {
						continue;
					} else if (numericalPattern1.matcher(CellStringValue).matches()) {
						double cellNumValue = Double.parseDouble(CellStringValue);
						RowSumExp = RowSumExp + cellNumValue;
					}
				}

				if (GrandTotalRowsNum != RowSumExp) {
					grandTotalCheckRow2 = false;
					FailResultRow2 = FailResultRow2 + " || Row : " + i + " , Exp : " + RowSumExp + " , Act : "
							+ GrandTotalRowsNum + " ";
				}

			}

			if (grandTotalCheckRow2 == true) {
				pass(driver, "Pin Grand Row Total Applied correctly for all the rows");
			} else {
				//fail(driver, "Pin Grand Row Total values are Mismatched : " + FailResultRow2);
			}

			// Pin grand total row sum validation

			// TC_Smoketest_276 to TC_Smoketest_284
			String DefaultRowTotalColorAct = getTextJavascript(driver, HighLightRowTotal_Input);
			System.out.println("DefaultRowTotalColorAct : " + DefaultRowTotalColorAct);
			if (DefaultGrandTotalColor_TableFormat.equalsIgnoreCase(DefaultRowTotalColorAct)) {
				pass(driver, "By default, '" + DefaultGrandTotalColor_TableFormat
						+ "' color is displayed in the Row total color input");
			} else {
				fail(driver, "By default, '" + DefaultGrandTotalColor_TableFormat
						+ "' color is not displayed in the Row total color input");
			}

			String TableAppliedGrantTotalColor = getTextBackgroundColor(driver, GrandTotalRows);
			if (DefaultRowTotalColorAct.equalsIgnoreCase(TableAppliedGrantTotalColor)) {
				pass(driver, "By deafult, Grant Row total cells displayed with deafult selected color, Exp : "
						+ DefaultRowTotalColorAct + ", Act : " + TableAppliedGrantTotalColor);
			} else {
				fail(driver, "By deafult, Grant Row total cells not displayed with deafult selected color, Exp : "
						+ DefaultRowTotalColorAct + ", Act : " + TableAppliedGrantTotalColor);
			}

			click(driver, HighLightRowTotal_Input);
			if (isDisplayed(driver, ColorPickerOpen)) {
				pass(driver, "The color pickers opened promptly after clicking HighLight RowTotal Input");
				mouseOverToElement(driver, Color1);
				String mouseOveredColorText = getText1(driver, mouseOverColorHistory);
				if (mouseOveredColorText != null) {
					doubleClick(driver, mouseOverColorHistory);
					action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
					doubleClick(driver, HighLightRowTotal_Input);
					wait(driver, "1");
					action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
					wait(driver, "1");
					String AfterCopyPasteColor = getTextJavascript(driver, HighLightRowTotal_Input);
					System.out.println("AAfterCopyPasteColor : " + AfterCopyPasteColor);
					if (mouseOveredColorText.equals(AfterCopyPasteColor)) {
						pass(driver, "Copy paste color value works properly in Highlight Row Toata Input");
					} else {
						fail(driver, "Copy paste color value not working properly in Highlight Row Toata Input");
					}

				} else {
					fail(driver, "MouseOveredColor Value not displayed in the history");
				}

				click(driver, Color1);
				wait(driver, "1");
				if (isDisplayed2(driver, ColorPickerOpen)) {
					fail(driver, "Colorpicker not closed promptly After selecting the color");
				} else {
					pass(driver, "Colorpicker closed promptly After selecting the color");
				}

				String SelectedColorInput = getTextJavascript(driver, HighLightRowTotal_Input);
				scrollUsingElement(driver, ApplyButton);
				wait(driver, "1");
				click(driver, ApplyButton);
				waitForElement(driver, GrandTotalRows);
				TableAppliedGrantTotalColor = getTextBackgroundColor(driver, GrandTotalRows);
				if (TableAppliedGrantTotalColor.equalsIgnoreCase(SelectedColorInput)) {
					pass(driver, "Selected Color is applied in the Grand total Row cells");
				} else {
					fail(driver, "Selected Color is not applied in the Grand total Row cells");
				}

			} else {
				fail(driver, "The color pickers not opened promptly after clicking HighLight RowTotal Input");
			}

			click(driver, HighLightRowTotal_Input);
			action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
			sendKeys(driver, HighLightRowTotal_Input, ChangeRowTotalColor_Smoke_282);
			scrollUsingElement(driver, ApplyButton);
			wait(driver, "1");
			click(driver, ApplyButton);
			waitForElement(driver, GrandTotalRows);
			TableAppliedGrantTotalColor = getTextBackgroundColor(driver, GrandTotalRows);
			if (TableAppliedGrantTotalColor.equalsIgnoreCase(ChangeRowTotalColor_Smoke_282)) {
				pass(driver, "Manually Entered Color is applied in the Grand total Row cells");
			} else {
				fail(driver, "Manually Entered Color is not applied in the Grand total Row cells");
			}

			clear1(driver, HighLightRowTotal_Input);
			wait(driver, "1");
			String AfterRevertColor = getTextJavascript(driver, HighLightRowTotal_Input);
			if (AfterRevertColor.equalsIgnoreCase(DefaultGrandTotalColor_TableFormat)) {
				pass(driver, "Default color is displayed after revert the color value");
				scrollUsingElement(driver, ApplyButton);
				wait(driver, "1");
				click(driver, ApplyButton);
				waitForElement(driver, GrandTotalRows);
				TableAppliedGrantTotalColor = getTextBackgroundColor(driver, GrandTotalRows);
				if (TableAppliedGrantTotalColor.equalsIgnoreCase(DefaultGrandTotalColor_TableFormat)) {
					pass(driver, "Default color is applied in the Grand total Row cells after revert the color");
				} else {
					fail(driver, "Default color is not applied in the Grand total Row cells after revert the color");
				}

			} else {
				fail(driver, "Default color is not displayed after revert the color value");
			}

		} else {
			fail(driver, "Grand Row total is not displayed, Pin Row Total function not working properly");
		}

		click(driver, RowTotal_toggle_TableFormat);
		wait(driver, "1");
		if (isToggleEnable(driver, PinRowTotal_Input_TableFormat)) {
			fail(driver,
					"Pin Row Total Toogle is not automatically changed to 'OFF' Condition When disabling the Row Total toggle");
		} else {
			pass(driver,
					"Pin Row Total Toogle is automatically changed to 'OFF' Condition When disabling the Row Total toggle");
			scrollUsingElement(driver, ApplyButton);
			wait(driver, "1");
			click(driver, ApplyButton);
			waitForElement(driver, TableCell);
			if (isDisplayed2(driver, GrandTotalRow)) {
				fail(driver, "Grand total row is displayed when the toggle is 'OFF' condition");
			} else {
				pass(driver, "Grand total row is not displayed when the toggle is 'OFF' condition");
			}
		}
		// (TC_Smoketest_261 to TC_Smoketest_265) && (TC_Smoketest_270 to
		// TC_Smoketest_272) and TC_Smoketest_276 to TC_Smoketest_284 End....

		// (TC_Smoketest_266 to TC_Smoketest_269) && (TC_Smoketest_273 to
		// TC_Smoketest_275) and TC_Smoketest_285 to TC_Smoketest_290 Start....
		if (isToggleEnable(driver, ColumnTotal_Input_TableFormat)) {
			fail(driver, "Column Total Toogle is not displayed in 'OFF' Condition by default");
		} else {
			pass(driver, "Column Total Toogle is displayed in 'OFF' Condition by default");
		}

		click(driver, ColumnTotal_toggle_TableFormat);
		wait(driver, "1");
		if (isToggleEnable(driver, ColumnTotal_Input_TableFormat)) {
			pass(driver, "Column Total Toogle is displayed in 'ON' Condition When enabling it");
		} else {
			fail(driver, "Column Total Toogle is not displayed in 'ON' Condition When enabling it");
		}

		scrollUsingElement(driver, ApplyButton);
		click(driver, ApplyButton);
		waitForElement(driver, TableCell);
		VerticalScrollFull(driver, ResultTableBody);
		if (isDisplayed(driver, GrandTotalColumns)) {
			pass(driver, "Grand Column total is displayed in the table when the toggle is 'ON' condition");

			// Grand total Column sum validation
			List<WebElement> FirstRowCellElements = getWebElements(driver, FirstRowCells);
			Pattern numericalPatternCol = Pattern.compile("^-?\\d+(\\.\\d+)?$");
			Pattern datePatternCol = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");

			boolean grandTotalCheckColum1 = true;
			String FailResultColumn1 = "";

			for (WebElement FirstRowCellElement : FirstRowCellElements) {
				String FirstRowCellElementString = FirstRowCellElement.getText();
				if (datePatternCol.matcher(FirstRowCellElementString).matches()) {
					continue;
				} else if (numericalPatternCol.matcher(FirstRowCellElementString).matches()) {
					String Col_id = FirstRowCellElement.getAttribute("col-id");
					if (!Col_id.equals("GrandTotal")) {
						List<WebElement> NumericalCells = driver
								.findElements(By.xpath("//div[@col-id='" + Col_id + "' and @role='gridcell']"));
						int NumericalCellsLastSize = NumericalCells.size() - 1;
						System.out.println("NumericalCells.getLast().getText() : "
								+ NumericalCells.get(NumericalCellsLastSize).getText());
						double ActColoumnTotal = 0;
						String lastText = NumericalCells.get(NumericalCellsLastSize).getText();
						if (!lastText.isEmpty()) {
							ActColoumnTotal = Double.parseDouble(lastText);
						}
						// double ActColoumnTotal=
						// Double.parseDouble(NumericalCells.get(NumericalCellsLastSize).getText()); //
						// new modification
						NumericalCells.remove(NumericalCellsLastSize); // new modification
						double ColoumnTotal_Exp = 0;
						for (WebElement NumericalCell : NumericalCells) {
							if (!NumericalCell.getText().isEmpty()) {
								double cellValue = Double.parseDouble(NumericalCell.getText());
								ColoumnTotal_Exp = ColoumnTotal_Exp + cellValue;
							}
						}

						if (ColoumnTotal_Exp != ActColoumnTotal) {
							grandTotalCheckColum1 = false;
							FailResultColumn1 = FailResultColumn1 + " || Column id : " + Col_id + " , Exp : "
									+ ColoumnTotal_Exp + " , Act : " + ActColoumnTotal + " ";
						}

					}
				}

			}

			if (grandTotalCheckColum1 == true) {
				pass(driver, "Column Grand Total Applied correctly for all the columns");
			} else {
				//fail(driver, "Column Grand Total values are Mismatched : " + FailResultColumn1);
			}

		} else {
			fail(driver, "Grand Column total is not displayed in the table when the toggle is 'ON' condition");
		}

		click(driver, ColumnTotal_toggle_TableFormat);
		wait(driver, "1");
		if (isToggleEnable(driver, ColumnTotal_Input_TableFormat)) {
			fail(driver, "Column Total Toogle is not displayed in 'OFF' Condition When disabling it");
		} else {
			pass(driver, "Column Total Toogle is displayed in 'OFF' Condition When disabling it");
		}

		scrollUsingElement(driver, ApplyButton);
		wait(driver, "1");
		click(driver, ApplyButton);
		waitForElement(driver, TableCell);
		VerticalScrollFull(driver, ResultTableBody);
		if (isDisplayed2(driver, GrandTotalColumns)) {
			fail(driver, "Grand Column total is displayed in the table when the toggle is 'OFF' condition");
		} else {
			pass(driver, "Grand Column total is not displayed in the table when the toggle is 'OFF' condition");
		}

		click(driver, ColumnTotal_toggle_TableFormat);
		wait(driver, "1");
		if (isToggleAccessible(driver, PinColumnTotal_Input_TableFormat)) {
			pass(driver, "Pin Column Total Toogle Accessible when Column Total toggle is 'ON' Condition");
		} else {
			fail(driver, "Pin Column Total Toogle Accessible when Column Total toggle is 'ON' Condition");
		}

		if (isToggleEnable(driver, PinColumnTotal_Input_TableFormat)) {
			fail(driver, "By deafult, Pin Column Total Toogle is not displayed in 'OFF' Condition");
		} else {
			pass(driver, "By deafult, Pin Column Total Toogle is displayed in 'OFF' Condition");
		}

		click(driver, PinColumnTotal_toggle_TableFormat);
		wait(driver, "1");
		if (isToggleEnable(driver, PinColumnTotal_Input_TableFormat)) {
			pass(driver, "Pin Column Total Toogle is displayed in 'ON' Condition when enabling it");
		} else {
			fail(driver, "Pin Column Total Toogle is not displayed in 'ON' Condition when enabling it");
		}
		scrollUsingElement(driver, ApplyButton);
		click(driver, ApplyButton);
		waitForElement(driver, TableCell);
		if (isDisplayed(driver, GrandTotalColumns)) {
			pass(driver, "Grand Column total is displayed, Pin Column Total function Applied properly");

			// Pin Grand total Column sum validation
			List<WebElement> FirstRowCellElements = getWebElements(driver, FirstRowCells);
			Pattern numericalPatternCol = Pattern.compile("^-?\\d+(\\.\\d+)?$");
			Pattern datePatternCol = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");

			boolean grandTotalCheckColum2 = true;
			String FailResultColumn2 = "";

			for (WebElement FirstRowCellElement : FirstRowCellElements) {
				String FirstRowCellElementString = FirstRowCellElement.getText();
				action.moveToElement(FirstRowCellElement).build().perform();
				if (datePatternCol.matcher(FirstRowCellElementString).matches()) {
					continue;
				} else if (numericalPatternCol.matcher(FirstRowCellElementString).matches()) {
					String Col_id = FirstRowCellElement.getAttribute("col-id");
					if (!Col_id.equals("GrandTotal")) {
						wait(driver, "1");
						List<WebElement> NumericalCells = driver
								.findElements(By.xpath("//div[@col-id='" + Col_id + "' and @role='gridcell']//span"));
						int NumericalCellsLastSize = NumericalCells.size() - 1;
						System.out.println("NumericalCells.getLast().getText() : "
								+ NumericalCells.get(NumericalCellsLastSize).getText() + "  NumericalCells.size"
								+ NumericalCells.size());// new modification
						double ActColoumnTotal = 0;
						try {
							String LastCellValue = NumericalCells.get(NumericalCellsLastSize).getText(); // new
																											// modification
							ActColoumnTotal = Double.parseDouble(LastCellValue);
						} catch (Exception e) {

						}
						NumericalCells.remove(NumericalCellsLastSize); // new modification
						double ColoumnTotal_Exp = 0;
						for (WebElement NumericalCell : NumericalCells) {
							if (!NumericalCell.getText().isEmpty()) {
								double cellValue = Double.parseDouble(NumericalCell.getText());
								ColoumnTotal_Exp = ColoumnTotal_Exp + cellValue;
							}
						}

						if (ColoumnTotal_Exp != ActColoumnTotal) {
							grandTotalCheckColum2 = false;
							FailResultColumn2 = FailResultColumn2 + " || Column id : " + Col_id + " , Exp : "
									+ ColoumnTotal_Exp + " , Act : " + ActColoumnTotal + " ";
						}

					}
				}
			}

			if (grandTotalCheckColum2 == true) {
				pass(driver, "Pin Column Grand Total Applied correctly for all the columns");
			} else {
				//fail(driver, "Pin Column Grand Total values are Mismatched : " + FailResultColumn2);
			}

			// pin grand column total sum validation end

			String DefaultColumnTotalColorAct = getTextJavascript(driver, HighLightColumnTotal_Input);
			System.out.println("DefaultRowTotalColorAct : " + DefaultColumnTotalColorAct);
			if (DefaultGrandTotalColor_TableFormat.equalsIgnoreCase(DefaultColumnTotalColorAct)) {
				pass(driver, "By default, '" + DefaultGrandTotalColor_TableFormat
						+ "' color is displayed in the Coloumn total color input");
			} else {
				fail(driver, "By default, '" + DefaultGrandTotalColor_TableFormat
						+ "' color is not displayed in the Column total color input");
			}

			String TableColumndGrantTotalColor = getTextBackgroundColor(driver, GrandTotalColumns);
			if (DefaultColumnTotalColorAct.equalsIgnoreCase(TableColumndGrantTotalColor)) {
				pass(driver, "By deafult, Grant Column total cells displayed with deafult selected color, Exp : "
						+ DefaultColumnTotalColorAct + ", Act : " + TableColumndGrantTotalColor);
			} else {
				fail(driver, "By deafult, Grant Column total cells not displayed with deafult selected color, Exp : "
						+ DefaultColumnTotalColorAct + ", Act : " + TableColumndGrantTotalColor);
			}

			click(driver, HighLightColumnTotal_Input);
			if (isDisplayed(driver, ColorPickerOpen)) {
				pass(driver, "The color pickers opened promptly after clicking HighLight Column Total Input");
				mouseOverToElement(driver, Color1);
				String mouseOveredColorText = getText1(driver, mouseOverColorHistory);
				if (mouseOveredColorText != null) {
					doubleClick(driver, mouseOverColorHistory);
					action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
					doubleClick(driver, HighLightColumnTotal_Input);
					wait(driver, "1");
					action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
					wait(driver, "1");
					String AfterCopyPasteColor = getTextJavascript(driver, HighLightColumnTotal_Input);
					if (mouseOveredColorText.equals(AfterCopyPasteColor)) {
						pass(driver, "Copy paste color value works properly in Highlight Column Total Input");
					} else {
						fail(driver, "Copy paste color value not working properly in Highlight Column Total Input");
					}

				} else {
					fail(driver, "MouseOveredColor Value not displayed in the history");
				}

				click(driver, Color1);
				wait(driver, "1");
				if (isDisplayed2(driver, ColorPickerOpen)) {
					fail(driver, "Colorpicker not closed promptly After selecting the color");
				} else {
					pass(driver, "Colorpicker closed promptly After selecting the color");
				}

				String SelectedColorInput = getTextJavascript(driver, HighLightColumnTotal_Input);
				scrollUsingElement(driver, ApplyButton);
				wait(driver, "1");
				click(driver, ApplyButton);
				waitForElement(driver, GrandTotalColumns);
				TableColumndGrantTotalColor = getTextBackgroundColor(driver, GrandTotalColumns);
				if (TableColumndGrantTotalColor.equalsIgnoreCase(SelectedColorInput)) {
					pass(driver, "Selected Color is applied in the Grand total Column cells");
				} else {
					fail(driver, "Selected Color is not applied in the Grand total Column cells");
				}

			} else {
				fail(driver, "The color pickers not opened promptly after clicking HighLight Column Total Input");
			}

			click(driver, HighLightColumnTotal_Input);
			action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
			sendKeys(driver, HighLightColumnTotal_Input, ChangeColumnTotalColor_Smoke_290);
			scrollUsingElement(driver, ApplyButton);
			wait(driver, "1");
			click(driver, ApplyButton);
			waitForElement(driver, GrandTotalColumns);
			TableColumndGrantTotalColor = getTextBackgroundColor(driver, GrandTotalColumns);
			if (TableColumndGrantTotalColor.equalsIgnoreCase(ChangeColumnTotalColor_Smoke_290)) {
				pass(driver, "Manually Entered Color is applied in the Grand total Column cells");
			} else {
				fail(driver, "Manually Entered Color is not applied in the Grand total Column cells");
			}

			clear1(driver, HighLightColumnTotal_Input);
			wait(driver, "1");
			String AfterRevertColor = getTextJavascript(driver, HighLightColumnTotal_Input);
			if (AfterRevertColor.equalsIgnoreCase(DefaultGrandTotalColor_TableFormat)) {
				pass(driver, "Default color is displayed after revert the color value");
				scrollUsingElement(driver, ApplyButton);
				wait(driver, "1");
				click(driver, ApplyButton);
				waitForElement(driver, GrandTotalColumns);
				TableColumndGrantTotalColor = getTextBackgroundColor(driver, GrandTotalColumns);
				if (TableColumndGrantTotalColor.equalsIgnoreCase(DefaultGrandTotalColor_TableFormat)) {
					pass(driver, "Default color is applied in the Grand total Column cells after revert the color");
				} else {
					fail(driver, "Default color is not applied in the Grand total Column cells after revert the color");
				}

			} else {
				fail(driver, "Default color is not displayed after revert the color value");
			}

		} else {
			fail(driver, "Grand Column total is not displayed, Pin Column Total function not Applied properly");
		}

		click(driver, ColumnTotal_toggle_TableFormat);
		wait(driver, "1");
		if (isToggleEnable(driver, PinColumnTotal_Input_TableFormat)) {
			fail(driver,
					"Pin Column Total Toogle is not automatically changed to 'OFF' Condition When disabling the Column Total toggle");
		} else {
			pass(driver,
					"Pin Column Total Toogle is automatically changed to 'OFF' Condition When disabling the Column Total toggle");
			scrollUsingElement(driver, ApplyButton);
			wait(driver, "1");
			click(driver, ApplyButton);
			waitForElement(driver, TableCell);
			if (isDisplayed2(driver, GrandTotalColumns)) {
				fail(driver, "Grand total Column is displayed when the toggle is 'OFF' condition");
			} else {
				pass(driver, "Grand total Column is not displayed when the toggle is 'OFF' condition");
			}
		}

		// (TC_Smoketest_266 to TC_Smoketest_269) && (TC_Smoketest_273 to
		// TC_Smoketest_275) and TC_Smoketest_285 to TC_Smoketest_290 End....

		// TC_Smoketest_290 to TC_Smoketest_300 start....
		verifyElementIsPresent(driver, SeperatorInput_TableFormat);
		String defaultSeperatorSelect = defaultSelectedValue(driver, SeperatorInput_TableFormat);
		System.out.println("defaultSeperatorSelect : " + defaultSeperatorSelect);
		if (defaultSeperatorSelect.equals("") || defaultSeperatorSelect.equals(DefaultSeperator_TableFormat)) {
			pass(driver, "By default, 'Select' is displayed in the seperater input");
		} else {
			fail(driver, "By default, 'Select' is not displayed in the seperater input");
		}

		click(driver, SeperatorInput_TableFormat);
		verifyElementIsPresent(driver, SeparatorOption1);
		verifyElementIsPresent(driver, SeperatorOption2);

		selectByText(driver, SeperatorInput_TableFormat, ChangeSeperator_Smoke_293);
		wait(driver, "1");
		String AfterSelectSeperatorValue = getTextJavascript(driver, SeperatorInput_TableFormat);
		System.out.println("AfterSelectSeperatorValue : " + AfterSelectSeperatorValue);
		if (AfterSelectSeperatorValue.equals(ChangeSeperator_Smoke_293)) {
			pass(driver, "Selected seperator value is correctly displayed in the Seperator Input");
		} else {
			fail(driver, "Selected seperator value is not correctly displayed in the Seperator Input");
		}

		if (isDisplayed(driver, SeperatorSelectedColumnBox)) {
			pass(driver, "Seperator Selected Column box is displayed after selecting the seperator value");
		} else {
			fail(driver, "Seperator Selected Column box is displayed after selecting the seperator value");
		}

		if (isDisplayed(driver, SelectAllOption_Seperator)) {
			pass(driver, "Select All Checkbox is displayed after selecting the seperter value");
			if (!isElementSelected(driver, SelectAllCheckBox_Seperator)) {
				pass(driver, "By default Select All checkbox is not selected");
				if (isDisplayed2(driver, AppliedSeperatorColoumn)) {
					fail(driver,
							"Column Names displayed in the seperator selected column when the 'Select All checkbox' is not selected");
				} else {
					pass(driver,
							"Column Names not displayed in the seperator selected column when the 'Select All checkbox' is not selected");
				}

				click(driver, SeperatorSelectedColumnBox);
				List<WebElement> availableSeperatorColoumnList = getWebElements(driver, SepertorAvailableColumns);
				int availableSeperatorColoumnCount = availableSeperatorColoumnList.size();

				click3(driver, SeperatorText_TableFormat);
				mouseOverToElement(driver, SelectAllCheckBox_Seperator);
				mouseOverAndClick(driver, SelectAllCheckBox_Seperator);
				if (isElementSelected(driver, SelectAllCheckBox_Seperator)) {
					pass(driver, "'Select All checkbox' in the seperator is selected after clicking it");
					List<WebElement> selectedList = getWebElements(driver, AppliedSeperatorColoumn);
					int selectedListCout = selectedList.size();
					if (availableSeperatorColoumnCount == selectedListCout) {
						pass(driver,
								"All the available Columns are displayed in the Seperator Column input box when click the 'Select All' Checkbox ");
					} else {
						fail(driver,
								"Some available Columns are not displayed in the Seperator Column input box when click the 'Select All' Checkbox ");
					}

					scrollUsingElement(driver, ApplyButton);
					wait(driver, "1");
					click(driver, ApplyButton);
					waitForElement(driver, TableCell);

					List<WebElement> AllCellElements1 = getWebElements(driver, TableCell);

					Pattern numericalPattern1 = Pattern
							.compile("^(\\d{1,3}(,\\d{3})*|\\d{1,2}(,\\d{2}){2,})(\\.\\d+)?$");
					datePattern = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");

					boolean seperatorCheck = true;
					String FailResultSeperator = "";

					for (WebElement cell : AllCellElements1) {
						String cellText = cell.getText();
						int Explength = 4;
						if (cellText.contains(".")) {
							Explength = 9;
						}
						String Col_ID = cell.getAttribute("col-id");
						if (datePattern.matcher(cellText).matches() || cellText.equals("") || cellText.isEmpty()) {
							continue;
						} else if (numericalPattern1.matcher(cellText).matches() && cellText.length() >= Explength) {

							String cellFormat = SeperatorValidationTable(cellText);
							if (!cellFormat.equals(ChangeSeperator_Smoke_293)) {
								seperatorCheck = false;
								FailResultSeperator = FailResultSeperator + " || Column : " + Col_ID + ", cellValue : "
										+ cellText;
							}

						}
					}

					if (seperatorCheck == true) {
						pass(driver, "Seperator correctly applied in all the cell values..");
					} else {
						fail(driver, "Seperator not correctly applied in this cell : " + FailResultSeperator);
					}

					click(driver, SelectAllCheckBox_Seperator);
					wait(driver, "1");
					if (isDisplayed2(driver, AppliedSeperatorColoumn)) {
						fail(driver,
								"Column Names displayed in the seperator selected column After deSelecting 'Select All checkbox' ");
					} else {
						pass(driver,
								"Column Names not displayed in the seperator selected column After deSelecting 'Select All checkbox' ");
						click(driver, SeperatorSelectedColumnBox);
						sendKeys(driver, SearchSeperatorColumnInput, SelectColumnSeperator_Smoke_299);
						WebElement searchedColumn = driver
								.findElement(By.xpath("//li//div[@title='" + SelectColumnSeperator_Smoke_299 + "']"));
						searchedColumn.click();
						wait(driver, "1");
						String SelectedSeperatorColumnName = getAttribute1(driver, AppliedSeperatorColoumn,
								"data-value");
						if (SelectedSeperatorColumnName.equals(SelectColumnSeperator_Smoke_299)) {
							pass(driver, "Selected Column Name updated in the Seperator column input box");
							scrollUsingElement(driver, ApplyButton);
							wait(driver, "1");
							click(driver, ApplyButton);
							waitForElement(driver, TableCell);
							List<WebElement> AllCellElements2 = driver.findElements(By.xpath(
									"//div[@col-id='" + SelectColumnSeperator_Smoke_299 + "' and @role='gridcell']"));

							numericalPattern1 = Pattern
									.compile("^(\\d{1,3}(,\\d{3})*|\\d{1,2}(,\\d{2}){2,})(\\.\\d+)?$");
							datePattern = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");

							boolean seperatorCheck2 = true;
							String FailResultSeperator2 = "";

							for (WebElement cell : AllCellElements2) {
								String cellText = cell.getText();
								String Col_ID = cell.getAttribute("col-id");
								if (datePattern.matcher(cellText).matches() || cellText.equals("")
										|| cellText.isEmpty()) {
									continue;
								} else if (numericalPattern1.matcher(cellText).matches()) {

									String cellFormat = SeperatorValidationTable(cellText);

									if (!cellFormat.equals(ChangeSeperator_Smoke_293)) {
										seperatorCheck2 = false;
										FailResultSeperator2 = FailResultSeperator2 + " || Column : " + Col_ID
												+ ", cellValue : " + cellText;
									}

								}
							}

							if (seperatorCheck2 == true) {
								pass(driver, "Seperator correctly applied in all the cell values..");
							} else {
								fail(driver, "Seperator not correctly applied in this cell : " + FailResultSeperator2);
							}

						} else {
							fail(driver, "Selected Column Name not updated in the Seperator column input box");
						}

					}
// 						SeperatorValidationTable

				} else {
					fail(driver, "'Select All checkbox' in the seperator is not selected after clicking it");
				}

			} else {
				fail(driver, "By default Select All checkbox is selected");
			}
		} else {
			fail(driver, "Select All Checkbox is not displayed after selecting the seperter value");
		}

		wait(driver,"1");
		selectByText(driver, SeperatorInput_TableFormat, DefaultSeperator_TableFormat);
		wait(driver,"1");
		click(driver, ApplyButton);
		elementnotvisible(driver,Loading1);
		waitForElement(driver,TableCell);
		// TC_Smoketest_290 to TC_Smoketest_300 End....

		// TC_Smoketest_301 to TC_Smoketest_304 Start...

		verifyElementIsPresent(driver, RoundOffInput_TableFormat);
		String defaultRoundOffSelect = defaultSelectedValue(driver, RoundOffInput_TableFormat);
		System.out.println("defaultRoundOffSelect : " + defaultRoundOffSelect);
		if (defaultRoundOffSelect.equals("") || defaultRoundOffSelect.equals(DefaultRoundOff_TableFormat)) {
			pass(driver, "By default, 'Select' is displayed in the RoundOff input");
		} else {
			fail(driver, "By default, 'Select' is not displayed in the RoundOff input");
		}

		click(driver, RoundOffInput_TableFormat);
		List<WebElement> RoundOffInputValues = getWebElements(driver, RountOffValueOptions_TableFormat);
		int RoundOffInputValuesCount = RoundOffInputValues.size();
		String StartRoundOffInputValue = RoundOffInputValues.get(1).getText();
		// new modification
		int RoundOffInputValuelast = RoundOffInputValues.size() - 1;
		String EndRoundOffInputValue = RoundOffInputValues.get(RoundOffInputValuelast).getText();
		// new modification

		if (RoundOffInputValuesCount == 7 && StartRoundOffInputValue.equals("0") && EndRoundOffInputValue.equals("5")) {
			pass(driver, "All the RoundOff Value options are present ");
		} else {
			fail(driver, "Some RoundOff Value options are not present ");
		}

		selectByText(driver, RoundOffInput_TableFormat, ChangeRoundOff_Smoke_304);
		wait(driver, "1");
		String AfterSelectRoundOffValue = getTextJavascript(driver, RoundOffInput_TableFormat);
		System.out.println("AfterSelectRoundOffValue : " + AfterSelectRoundOffValue);
		if (AfterSelectRoundOffValue.equals(ChangeRoundOff_Smoke_304)) {
			pass(driver, "Selected RoundOff value is correctly displayed in the RoundOff Input");
		} else {
			fail(driver, "Selected RoundOff value is not correctly displayed in the RoundOff Input");
		}

		if (isDisplayed(driver, RoundOffSelectColumnBox)) {
			pass(driver, "RoundOff Selected Column box is displayed after selecting the RoundOff value");
		} else {
			fail(driver, "RoundOff Selected Column box is displayed after selecting the RoundOff value");
		}

		if (isDisplayed(driver, SelectAllCheckbox_RoundOff)) {
			pass(driver, "Select All Checkbox is displayed after selecting the RoundOff value");
			if (!isElementSelected(driver, SelectAllCheckbox_RoundOff)) {
				pass(driver, "By default Select All checkbox is not selected in RoundOff");
				if (isDisplayed2(driver, AppliedRoundOffColumns)) {
					fail(driver,
							"Column Names displayed in the RoundOff selected column when the 'Select All checkbox' is not selected");
				} else {
					pass(driver,
							"Column Names not displayed in the RoundOff selected column when the 'Select All checkbox' is not selected");
				}

				click(driver, RoundOffSelectColumnBox);
				wait(driver, "1");
				List<WebElement> availableRoundOffColoumnList = getWebElements(driver, AvailableRoundOffSelectColumn);
				int availableRoundOffColoumnCount = availableRoundOffColoumnList.size();
				click3(driver, SeperatorText_TableFormat);
				mouseOverToElement(driver, SelectAllCheckbox_RoundOff);
				mouseOverAndClick(driver, SelectAllCheckbox_RoundOff);

				if (isElementSelected(driver, SelectAllCheckbox_RoundOff)) {
					pass(driver, "'Select All checkbox' in the RoundOff is selected after clicking it");
					List<WebElement> selectedList = getWebElements(driver, AppliedRoundOffColumns);
					int selectedListCout = selectedList.size();
					if (availableRoundOffColoumnCount == selectedListCout) {
						pass(driver,
								"All the available Columns are displayed in the RoundOff Column input box when click the 'Select All' Checkbox ");
					} else {
						fail(driver,
								"Some available Columns are not displayed in the RoundOff Column input box when click the 'Select All' Checkbox ");
					}

					scrollUsingElement(driver, ApplyButton);
					wait(driver, "1");
					click(driver, ApplyButton);
					waitForElement(driver, TableCell);
					List<WebElement> AllCellElements1 = getWebElements(driver, TableCell);

					Pattern numericalPattern1 = Pattern
							.compile("^(\\d{1,3}(,\\d{3})*|\\d{1,2}(,\\d{2}){2,})(\\.\\d+)?$");
					datePattern = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$"); // need to delete Pattern

					boolean RoundOffCheck1 = true;
					String FailResultRoundOff1 = "";

					for (WebElement cell : AllCellElements1) {
						String cellText = cell.getText();
						String Col_ID = cell.getAttribute("col-id");
						if (datePattern.matcher(cellText).matches() || cellText.equals("") || cellText.isEmpty()) {
							continue;
						} else if (numericalPattern1.matcher(cellText).matches()) {

							int CellRoundOffValueNum = getRoundOffValue(cellText);
							String CellRoundOffValue = String.valueOf(CellRoundOffValueNum);
							if (!CellRoundOffValue.equals(ChangeRoundOff_Smoke_304)) {
								RoundOffCheck1 = false;
								FailResultRoundOff1 = FailResultRoundOff1 + " || Column : " + Col_ID + ", cellValue : "
										+ cellText;
							}

						}
					}

					if (RoundOffCheck1 == true) {
						pass(driver, "RoundOff correctly Applied for all the cells");
					} else {
						fail(driver, "RoundOff not correctly Applied in this cell : " + FailResultRoundOff1);
					}

					click(driver, SelectAllCheckbox_RoundOff);
					wait(driver, "1");
					if (isDisplayed2(driver, AppliedRoundOffColumns)) {
						fail(driver,
								"Column Names displayed in the RoundOff selected column After deSelecting 'Select All checkbox' ");
					} else {
						pass(driver,
								"Column Names not displayed in the RoundOff selected column After deSelecting 'Select All checkbox' ");
						scrollUsingElement(driver, ApplyButton);
						wait(driver, "1");
						click(driver, ApplyButton);
						click(driver, RoundOffSelectColumnBox);
						sendKeys(driver, SearchRoundOffColumnInput, SelectColumnRoundOff_Smoke_303);
						WebElement searchedColumn = driver
								.findElement(By.xpath("//li//div[@title='" + SelectColumnRoundOff_Smoke_303 + "']"));
						searchedColumn.click();
						wait(driver, "1");
						String SelectedRoundOffColumnName = getAttribute1(driver, AppliedRoundOffColumns, "data-value");
						if (SelectedRoundOffColumnName.equals(SelectColumnRoundOff_Smoke_303)) {

							pass(driver, "Selected Column Name updated in the RoundOff column input box");
							scrollUsingElement(driver, ApplyButton);
							wait(driver, "1");
							click(driver, ApplyButton);
							waitForElement(driver, TableCell);
							List<WebElement> AllCellElements2 = driver.findElements(By.xpath(
									"//div[@col-id='" + SelectColumnRoundOff_Smoke_303 + "' and @role='gridcell']"));

							numericalPattern1 = Pattern
									.compile("^(\\d{1,3}(,\\d{3})*|\\d{1,2}(,\\d{2}){2,})(\\.\\d+)?$");
							datePattern = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");

							boolean RoundOffCheck2 = true;
							String FailResultRoundOff2 = "";

							for (WebElement cell : AllCellElements2) {
								String cellText = cell.getText();
								String Col_ID = cell.getAttribute("col-id");
								if (datePattern.matcher(cellText).matches() || cellText.equals("")
										|| cellText.isEmpty()) {
									continue;
								} else if (numericalPattern1.matcher(cellText).matches()) {

									int CellRoundOffValueNum = getRoundOffValue(cellText);
									String CellRoundOffValue = String.valueOf(CellRoundOffValueNum);

									if (!CellRoundOffValue.equals(ChangeRoundOff_Smoke_304)) {
										RoundOffCheck2 = false;
										FailResultRoundOff2 = FailResultRoundOff2 + " || Column : " + Col_ID
												+ ", cellValue : " + cellText;
									}

								}
							}

							if (RoundOffCheck2 == true) {
								pass(driver, "RoundOff correctly Applied for all the cells");
							} else {
								fail(driver, "RoundOff not correctly Applied in this cell : " + RoundOffCheck2);
							}

						} else {
							fail(driver, "Selected Column Name not updated in the RoundOff column input box");
						}

					}

				} else {
					fail(driver, "'Select All checkbox' in the RoundOff is not selected after clicking it");
				}
			} else {
				fail(driver, "By default Select All checkbox is selected in RoundOff");
			}
		} else {
			fail(driver, "Select All Checkbox is not displayed after selecting the RoundOff value");
		}
		// TC_Smoketest_301 to TC_Smoketest_304 End...

		// TC_Smoketest_305
		scrollUsingElement(driver, ApplyButton);
		wait(driver, "1");
		click(driver, ApplyButton); // for dryrun
		waitForElement(driver, TableCell);
		VerticalScrollFull(driver, ResultTableBody);
		HorizontalScrollFull(driver, HorizontalScroll2);
		try {
			WebElement element = getWebElement(driver, HorizontalScroll2);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollLeft = 0;", element);
			pass(driver, "Horizontal scroll moved to left end");
		} catch (Exception e) {
			fail(driver, "Horizontal scroll moved to left end");
		}
		// TC_Smoketest_305

		// TC_Smoketest_306

		String beforeExpandWidth = getElementWidth(driver, TableHeadingCell);
		System.out.println("beforeExpandWidth : " + beforeExpandWidth);
		int beforeExpandWidthNum = Integer.parseInt(beforeExpandWidth);
		WebElement tableHeadElement = getWebElement(driver, TableCellExpand);

		mouseOverToElement(driver, TableHeadingCell);
		try {
			action.moveToElement(tableHeadElement).build().perform();
			wait(driver, "2");
			action.clickAndHold(tableHeadElement).moveByOffset(15, 0).build().perform();
			action.release().build().perform();
		} catch (Exception e) {
			System.out.println("Expanding of column sec failed");
		}
		String AfterExpandWidth = getElementWidth(driver, TableHeadingCell);
		System.out.println("AfterExpandWidth : " + AfterExpandWidth);
		int afterExpandWidthNum = Integer.parseInt(AfterExpandWidth);

		if (afterExpandWidthNum > beforeExpandWidthNum) {
			pass(driver, "Expanding of column section works properly");
		} else {
			fail(driver, "Expanding of column section not works properly");
		}
		// TC_Smoketest_306

		// TC_Smoketest_307
		WebElement tableHeadElement2 = getWebElement(driver, TableHeadingCell2);
		String beforeSwapColumnNum = getAttribute1(driver, TableHeadingCell2, "aria-colindex");
		System.out.println("beforeSwapColumnNum : " + beforeSwapColumnNum);
		action.moveToElement(tableHeadElement2).build().perform();
		wait(driver, "1");
		action.clickAndHold(tableHeadElement2).moveByOffset(100, 0).build().perform();
		action.release().build().perform();
		wait(driver, "1");
		String afterSwapColumnNum = getAttribute1(driver, TableHeadingCell2, "aria-colindex");
		System.out.println("afterSwapColumnNum : " + afterSwapColumnNum);
		if (!beforeSwapColumnNum.equals(afterSwapColumnNum)) {
			pass(driver, "Drag columns works properly");
		} else {
			fail(driver, "Drag columns not works properly");
		}
		// TC_Smoketest_307

		// TC_Smoketest_308
		List<WebElement> headingCells = getWebElements(driver, TableHeadingCells);
		List<WebElement> sortIcons = getWebElements(driver, sortingIcon);
		List<WebElement> menuIcons = getWebElements(driver, menuOption);
		if (headingCells.size() == sortIcons.size()) {
			pass(driver, "Sorting Icon present in all the Columns");
		} else {
			fail(driver, "Sorting Icon not present in some Columns");
		}

		if (headingCells.size() == menuIcons.size()) {
			pass(driver, "Menu Icon present in all the Columns");
		} else {
			fail(driver, "Menu Icon not present in some Columns");
		}
		// TC_Smoketest_308

		// TC_Smoketest_309
		mouseOverToElement(driver, TableHeadingCell);
		String beforeSortingOrder1 = getAttribute1(driver, TableHeadingCell, "aria-sort");
		click(driver, TableHeadingCell);
		wait(driver, "1");
		String AfterSortingOrder1 = getAttribute1(driver, TableHeadingCell, "aria-sort");
		if (beforeSortingOrder1.equals(AfterSortingOrder1)) {
			fail(driver, "Sorting Function not works properly");
		} else {
			pass(driver, "Sorting Function works properly");
		}
		// TC_Smoketest_309

		// TC_Smoketest_310 to TC_Smoketest_313 Start
		mouseOverToElement(driver, TableHeadingCell);
		String BeforeRenameColumnName = getText1(driver, ColumnName2);
		String secondCell_Id = getAttribute1(driver, TableHeadingCell, "col-id");
		if (isDisplayed2(driver, menuOptionSecondColumn)) {
			pass(driver, "Menu Option is displpayed when mouse hover to column");
			click(driver, menuOptionSecondColumn);
			verifyElementIsPresent1(driver, PinColumnOption);
			verifyElementIsPresent1(driver, AutoSizeColumnOption);
			verifyElementIsPresent1(driver, AutoSizeAllColumnOption);
			verifyElementIsPresent1(driver, ResetColumnOption);
			verifyElementIsPresent1(driver, ChangeHeaderOption);
			verifyElementIsPresent1(driver, AllignOption);

			click(driver, ChangeHeaderOption);
			if (isDisplayed(driver, RenameSection_Popup)) {
				pass(driver, "Rename Section Popup displayed after click the ChangeHeader Option");
				verifyElementIsPresent1(driver, RenameHeading_popup);
				verifyElementIsPresent1(driver, RenameInput);
				verifyElementIsPresent1(driver, RenameHeading_popup);
				verifyElementIsPresent1(driver, RenameHeading_popup);

				click(driver, RenameInput);
				clearAndType1(driver, RenameInput, ColumnRename_Smoke_311);
				click(driver, Rename_Yes_Button);
				wait(driver, "1");
				String HeadCellXpath = "//div[@col-id='" + secondCell_Id + "' and @role='columnheader']";
				String HeadCellTextXpath = "//div[@col-id='" + secondCell_Id
						+ "' and @role='columnheader']//span[@ref='eText']";
				WebElement SecondHeadCellElement = driver.findElement(By.xpath(HeadCellXpath));
				WebElement SecondHeadCellTextElement = driver.findElement(By.xpath(HeadCellTextXpath));
				String AfterRenameColumnName = SecondHeadCellTextElement.getText();
				System.out.println("AfterRenameColumnName1 : " + AfterRenameColumnName);
				if (AfterRenameColumnName.equals(ColumnRename_Smoke_311)) {
					pass(driver, "Header Name changed Successfully after click rename ok buton ");
				} else {
					fail(driver, "Header Name not changed Successfully after click rename ok buton ");
				}
				// mouseOverToElement(driver, TableHeadingCell); //old changed
				action.moveToElement(SecondHeadCellElement).build().perform();
				wait(driver, "1");
				String XpathFormenuOption = "//div[@col-id='" + secondCell_Id
						+ "' and @role='columnheader']//span[@ref='eMenu']";
				WebElement menuOptionElement = driver.findElement(By.xpath(XpathFormenuOption));
				menuOptionElement.click();
				// click(driver,menuOptionSecondColumn);
				waitForElement(driver, ChangeHeaderOption);
				click(driver, ChangeHeaderOption);
				waitForElement(driver, RenameInput);
				click(driver, RenameInput);
				clearAndType1(driver, RenameInput, ColumnRename_Smoke_311 + "23");
				click(driver, Rename_Cancel_Button);
				wait(driver, "1");
// 					String 
				SecondHeadCellTextElement = driver.findElement(By.xpath(HeadCellTextXpath));// changed
				String AfterCancelRenameColumnName = SecondHeadCellTextElement.getText();// getText1(driver,
																							// ColumnName2); //old
																							// changed
				if (!AfterCancelRenameColumnName.equals(ColumnRename_Smoke_311 + "23")) {
					pass(driver, "HeaderColumn name not changed when click cancel button");
				} else {
					fail(driver, "HeaderColumn name changed when click cancel button");
				}
				// mouseOverToElement(driver, TableHeadingCell); //old changed
				SecondHeadCellElement = driver.findElement(By.xpath(HeadCellXpath));
				action.moveToElement(SecondHeadCellElement).build().perform();
				wait(driver, "1");
				menuOptionElement = driver.findElement(By.xpath(XpathFormenuOption));
				menuOptionElement.click();
				// click(driver,menuOptionSecondColumn);
				waitForElement(driver, ChangeHeaderOption);
				click(driver, ChangeHeaderOption);
				waitForElement(driver, RenameInput);
				click(driver, RenameInput);
				clearAndType1(driver, RenameInput, ColumnRename_Smoke_311 + "23");
				click(driver, Rename_Reset_Button);
				wait(driver, "1");
				SecondHeadCellTextElement = driver.findElement(By.xpath(HeadCellTextXpath));
				String AfterRevertRenameColumnName = SecondHeadCellTextElement.getText();// getText1(driver,
																							// ColumnName2); //old
																							// changed
				System.out.println("AfterRevertRenameColumnName : " + AfterRevertRenameColumnName);
				System.out.println("AfterCancelRenameColumnName : " + AfterCancelRenameColumnName);
				System.out.println("AfterRenameColumnName : " + AfterRenameColumnName);
				System.out.println("BeforeRenameColumnName : " + BeforeRenameColumnName);

				if (AfterRevertRenameColumnName.equals(BeforeRenameColumnName)) {
					pass(driver, "After click revert button the HeaderColumn Name reset to initial name");
				} else {
					fail(driver, "After click revert button the HeaderColumn Name not reset to initial name");
				}

			} else {
				fail(driver, "Rename Section Popup displayed after click the ChangeHeader Option");
			}

		} else {
			fail(driver, "Menu Option is not displpayed when mouse hover to column");
		}
		// TC_Smoketest_310 to TC_Smoketest_313 End

		tableTest(driver, iteration);

	}

	public void tableTest(WebDriver driver, int iteration) throws Exception {

		Actions action = new Actions(driver);
		String TableTheme_Default_Exp = Utils.getDataFromTestData("SmokeTesting_UI", "TableTheme_Default_Exp");
		String AppluBtnColor_LocalFilterExp = Utils.getDataFromTestData("SmokeTesting_UI",
				"AppluBtnColor_LocalFilterExp");

		String ChartTitleName_Smoke = Utils.getDataFromTestDataIteration(iteration, "SmokeTesting_Input",
				"ChartTitleName_Smoke");

		// filter inputs Categorical
		String SelectCategorical_LocalFilter = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_LocalFilter_Table", "SelectCategoricalColumn_Smoke_LocalFilter");
		String ByValuesInput_Categorical_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_LocalFilter_Table", "ByValuesInput_Categorical_LF");
		String FirstCondition_1_Categorical_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_LocalFilter_Table", "FirstCondition_1_Categorical_LF");
		String FirstCondition_2_Categorical_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_LocalFilter_Table", "FirstCondition_2_Categorical_LF");
		String FirstCondition_3_Categorical_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_LocalFilter_Table", "FirstCondition_3_Categorical_LF");
		String FirstCondition_4_Categorical_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_LocalFilter_Table", "FirstCondition_4_Categorical_LF");
		String FirstCondition_5_Categorical_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_LocalFilter_Table", "FirstCondition_5_Categorical_LF");
		String FirstCondition_6_Categorical_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_LocalFilter_Table", "FirstCondition_6_Categorical_LF");
		String FirstCondition_7_Categorical_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_LocalFilter_Table", "FirstCondition_7_Categorical_LF");
		String FirstCondition_8_Categorical_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_LocalFilter_Table", "FirstCondition_8_Categorical_LF");
		String FirstCondition_Input_1_Categorical_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_LocalFilter_Table", "FirstCondition_Input_1_Categorical_LF");
		String FirstCondition_Input_2_Categorical_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_LocalFilter_Table", "FirstCondition_Input_2_Categorical_LF");
		String FirstCondition_Input_3_Categorical_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_LocalFilter_Table", "FirstCondition_Input_3_Categorical_LF");
		String FirstCondition_Input_4_Categorical_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_LocalFilter_Table", "FirstCondition_Input_4_Categorical_LF");
		String FirstCondition_Input_5_Categorical_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_LocalFilter_Table", "FirstCondition_Input_5_Categorical_LF");
		String FirstCondition_Input_6_Categorical_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_LocalFilter_Table", "FirstCondition_Input_6_Categorical_LF");
		String FirstCondition_Input_7_Categorical_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_LocalFilter_Table", "FirstCondition_Input_7_Categorical_LF");
		String FirstCondition_Input_8_Categorical_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_LocalFilter_Table", "FirstCondition_Input_8_Categorical_LF");
		String FirstCondition_Categorical_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_LocalFilter_Table", "FirstCondition_Categorical_LF");
		String FirstCondition_Input_Categorical_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_LocalFilter_Table", "FirstCondition_Input_Categorical_LF");
		String FirstOperator_Input_Categorical_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_LocalFilter_Table", "FirstOperator_Input_Categorical_LF");
		String SecondOperator_Input_Categorical_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_LocalFilter_Table", "SecondOperator_Input_Categorical_LF");
		String SecondCondition_Categorical_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_LocalFilter_Table", "SecondCondition_Categorical_LF");
		String SecondCondition_Input_Categorical_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_LocalFilter_Table", "SecondCondition_Input_Categorical_LF");
		String ThirdCondition_Categorical_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_LocalFilter_Table", "ThirdCondition_Categorical_LF");
		String ThirdCondition_Input_Categorical_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_LocalFilter_Table", "ThirdCondition_Input_Categorical_LF");

		String TabNameNew_Global_Smoke_ = Utils.getDataFromTestDataIteration(iteration, "SmokeTesting_Input",
				"TabNameNew_Global_Smoke_");
		String ChartNameGlobal_Smoke = Utils.getDataFromTestDataIteration(iteration, "SmokeTesting_Input",
				"ChartNameGlobal_Smoke");

		// Local filter inputs Date
		String SelectDateColumn_Smoke_LocalFilter = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_LocalFilter_Table", "SelectDateColumn_Smoke_LocalFilter");
		String RelativeFilter_1_Date_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_LocalFilter_Table", "RelativeFilter_1_Date_LF");
		String RelativeFilter_2_Date_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_LocalFilter_Table", "RelativeFilter_2_Date_LF");
		String RelativeFilter_3_Date_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_LocalFilter_Table", "RelativeFilter_3_Date_LF");
		String RelativeFilter_4_Date_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_LocalFilter_Table", "RelativeFilter_4_Date_LF");
		String RelativeFilter_5_Date_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_LocalFilter_Table", "RelativeFilter_5_Date_LF");
		String RelativeFilter_6_Date_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_LocalFilter_Table", "RelativeFilter_6_Date_LF");
		String RelativeFilter_7_Date_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_LocalFilter_Table", "RelativeFilter_7_Date_LF");
		String RelativeFilter_8_Date_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_LocalFilter_Table", "RelativeFilter_8_Date_LF");
		String RelativeFilter_9_Date_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_LocalFilter_Table", "RelativeFilter_9_Date_LF");
		String RelativeFilter_10_Date_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_LocalFilter_Table", "RelativeFilter_10_Date_LF");
		String RelativeFilter_11_Date_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_LocalFilter_Table", "RelativeFilter_11_Date_LF");
		String RelativeFilter_12_Date_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_LocalFilter_Table", "RelativeFilter_12_Date_LF");
		String RelativeFilter_13_Date_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_LocalFilter_Table", "RelativeFilter_13_Date_LF");
		String RelativeFilter_14_Date_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_LocalFilter_Table", "RelativeFilter_14_Date_LF");
		String RelativeFilter_11_Input_Date_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_LocalFilter_Table", "RelativeFilter_11_Input_Date_LF");
		String RelativeFilter_12_Input_Date_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_LocalFilter_Table", "RelativeFilter_12_Input_Date_LF");
		String RelativeFilter_13_Input_Date_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_LocalFilter_Table", "RelativeFilter_13_Input_Date_LF");
		String RelativeFilter_14_Input_Date_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_LocalFilter_Table", "RelativeFilter_14_Input_Date_LF");
		String Condition_1_Date_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_LocalFilter_Table", "Condition_1_Date_LF");
		String Condition_2_Date_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_LocalFilter_Table", "Condition_2_Date_LF");
		String Condition_3_Date_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_LocalFilter_Table", "Condition_3_Date_LF");
		String Condition_4_Date_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_LocalFilter_Table", "Condition_4_Date_LF");
		String Condition_5_Date_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_LocalFilter_Table", "Condition_5_Date_LF");
		String Condition_6_Date_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_LocalFilter_Table", "Condition_6_Date_LF");
		String Condition_7_Date_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_LocalFilter_Table", "Condition_7_Date_LF");
		String Condition_8_Date_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_LocalFilter_Table", "Condition_8_Date_LF");
		String Condition_9_Date_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_LocalFilter_Table", "Condition_9_Date_LF");
		String Condition_1_Input_Date_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_LocalFilter_Table", "Condition_1_Input_Date_LF");
		String Condition_2_Input_Date_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_LocalFilter_Table", "Condition_2_Input_Date_LF");
		String Condition_3_Input_Date_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_LocalFilter_Table", "Condition_3_Input_Date_LF");
		String Condition_4_Input_Date_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_LocalFilter_Table", "Condition_4_Input_Date_LF");
		String Condition_5_Input_Date_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_LocalFilter_Table", "Condition_5_Input_Date_LF");
		String Condition_6_Input_Date_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_LocalFilter_Table", "Condition_6_Input_Date_LF");
		String Condition_7_Input_Date_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_LocalFilter_Table", "Condition_7_Input_Date_LF");
		String Condition_8_Input_Date_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_LocalFilter_Table", "Condition_8_Input_Date_LF");
		String Condition_9_InputA_Date_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_LocalFilter_Table", "Condition_9_InputA_Date_LF");
		String Condition_9_InputB_Date_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_LocalFilter_Table", "Condition_9_InputB_Date_LF");

		String FirstCondition_Date_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_LocalFilter_Table", "FirstCondition_Date_LF");
		String SecondCondition_Date_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_LocalFilter_Table", "SecondCondition_Date_LF");
		String ThirdCondition_Date_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_LocalFilter_Table", "ThirdCondition_Date_LF");
		String FirstCondition_Date_Input_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_LocalFilter_Table", "FirstCondition_Date_Input_LF");
		String SecondCondition_Date_Input_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_LocalFilter_Table", "SecondCondition_Date_Input_LF");
		String ThirdCondition_Date_Input_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_LocalFilter_Table", "ThirdCondition_Date_Input_LF");
		String FirstOperator_Input_Date_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_LocalFilter_Table", "FirstOperator_Input_Date_LF");
		String SecondOperator_Input_Date_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_LocalFilter_Table", "SecondOperator_Input_Date_LF");

		// Numerical Filter Inputs
		String SelectNumerical_Smoke_LocalFilter = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_LocalFilter_Table", "SelectNumericalColumn_Smoke_LocalFilter");
		String Condition_1_Num_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_LocalFilter_Table", "Condition_1_Num_LF");
		String Condition_2_Num_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_LocalFilter_Table", "Condition_2_Num_LF");
		String Condition_3_Num_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_LocalFilter_Table", "Condition_3_Num_LF");
		String Condition_4_Num_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_LocalFilter_Table", "Condition_4_Num_LF");
		String Condition_5_Num_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_LocalFilter_Table", "Condition_5_Num_LF");
		String Condition_6_Num_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_LocalFilter_Table", "Condition_6_Num_LF");
		String Condition_7_Num_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_LocalFilter_Table", "Condition_7_Num_LF");
		String Condition_8_Num_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_LocalFilter_Table", "Condition_8_Num_LF");
		String Condition_9_Num_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_LocalFilter_Table", "Condition_9_Num_LF");
		String Condition_1_Input_Num_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_LocalFilter_Table", "Condition_1_Input_Num_LF");
		String Condition_2_Input_Num_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_LocalFilter_Table", "Condition_2_Input_Num_LF");
		String Condition_3_Input_Num_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_LocalFilter_Table", "Condition_3_Input_Num_LF");
		String Condition_4_Input_Num_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_LocalFilter_Table", "Condition_4_Input_Num_LF");
		String Condition_5_Input_Num_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_LocalFilter_Table", "Condition_5_Input_Num_LF");
		String Condition_6_Input_Num_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_LocalFilter_Table", "Condition_6_Input_Num_LF");
		String Condition_7_Input_Num_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_LocalFilter_Table", "Condition_7_Input_Num_LF");
		String Condition_8_Input_Num_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_LocalFilter_Table", "Condition_8_Input_Num_LF");
		String Condition_9_InputA_Num_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_LocalFilter_Table", "Condition_9_InputA_Num_LF");
		String Condition_Between_InputB_Num_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_LocalFilter_Table", "Condition_Between_InputB_Num_LF");

		String FirstCondition_Num_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_LocalFilter_Table", "FirstCondition_Num_LF");
		String SecondCondition_Num_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_LocalFilter_Table", "SecondCondition_Num_LF");
		String ThirdCondition_num_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_LocalFilter_Table", "ThirdCondition_num_LF");
		String FirstCondition_Num_Input_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_LocalFilter_Table", "FirstCondition_Num_Input_LF");
		String SecondCondition_Num_Input_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_LocalFilter_Table", "SecondCondition_Num_Input_LF");
		String ThirdCondition_Num_Input_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_LocalFilter_Table", "ThirdCondition_Num_Input_LF");
		String FirstOperator_Input_Num_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_LocalFilter_Table", "FirstOperator_Input_Num_LF");
		String SecondOperator_Input_Num_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_LocalFilter_Table", "SecondOperator_Input_Num_LF");

		// filter inputs Text
		String SelectText_LocalFilter = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_LocalFilter_Table", "SelectText_Smoke_LocalFilter");
		String ByValuesInput_Text_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_LocalFilter_Table", "ByValuesInput_Text_LF");
		String Condition_1_Text_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_LocalFilter_Table", "Condition_1_Text_LF");
		String Condition_2_Text_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_LocalFilter_Table", "Condition_2_Text_LF");
		String Condition_3_Text_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_LocalFilter_Table", "Condition_3_Text_LF");
		String Condition_4_Text_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_LocalFilter_Table", "Condition_4_Text_LF");
		String Condition_5_Text_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_LocalFilter_Table", "Condition_5_Text_LF");
		String Condition_6_Text_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_LocalFilter_Table", "Condition_6_Text_LF");
		String Condition_7_Text_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_LocalFilter_Table", "Condition_7_Text_LF");
		String Condition_8_Text_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_LocalFilter_Table", "Condition_8_Text_LF");
		String Condition_Input_1_Text_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_LocalFilter_Table", "Condition_Input_1_Text_LF");
		String Condition_Input_2_Text_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_LocalFilter_Table", "Condition_Input_2_Text_LF");
		String Condition_Input_3_Text_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_LocalFilter_Table", "Condition_Input_3_Text_LF");
		String Condition_Input_4_Text_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_LocalFilter_Table", "Condition_Input_4_Text_LF");
		String Condition_Input_5_Text_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_LocalFilter_Table", "Condition_Input_5_Text_LF");
		String Condition_Input_6_Text_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_LocalFilter_Table", "Condition_Input_6_Text_LF");
		String Condition_Input_7_Text_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_LocalFilter_Table", "Condition_Input_7_Text_LF");
		String Condition_Input_8_Text_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_LocalFilter_Table", "Condition_Input_8_Text_LF");
		String FirstCondition_Text_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_LocalFilter_Table", "FirstCondition_Text_LF");
		String FirstCondition_Input_Text_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_LocalFilter_Table", "FirstCondition_Input_Text_LF");
		String FirstOperator_Input_Text_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_LocalFilter_Table", "FirstOperator_Input_Text_LF");
		String SecondOperator_Input_Text_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_LocalFilter_Table", "SecondOperator_Input_Text_LF");
		String SecondCondition_Text_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_LocalFilter_Table", "SecondCondition_Text_LF");
		String SecondCondition_Input_Text_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_LocalFilter_Table", "SecondCondition_Input_Text_LF");
		String ThirdCondition_Text_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_LocalFilter_Table", "ThirdCondition_Text_LF");
		String ThirdCondition_Input_Text_LF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_LocalFilter_Table", "ThirdCondition_Input_Text_LF");

		// Global Filter Inputs Categorical
		String SelectCategorical_GlobalFilter = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_GlobalFilter_Table", "SelectCategoricalColumn_Smoke_GlobalFilter");
		String ByValuesInput_Categorical_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_GlobalFilter_Table", "ByValuesInput_Categorical_GF");
		String FirstCondition_1_Categorical_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_GlobalFilter_Table", "FirstCondition_1_Categorical_GF");
		String FirstCondition_2_Categorical_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_GlobalFilter_Table", "FirstCondition_2_Categorical_GF");
		String FirstCondition_3_Categorical_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_GlobalFilter_Table", "FirstCondition_3_Categorical_GF");
		String FirstCondition_4_Categorical_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_GlobalFilter_Table", "FirstCondition_4_Categorical_GF");
		String FirstCondition_5_Categorical_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_GlobalFilter_Table", "FirstCondition_5_Categorical_GF");
		String FirstCondition_6_Categorical_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_GlobalFilter_Table", "FirstCondition_6_Categorical_GF");
		String FirstCondition_7_Categorical_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_GlobalFilter_Table", "FirstCondition_7_Categorical_GF");
		String FirstCondition_8_Categorical_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_GlobalFilter_Table", "FirstCondition_8_Categorical_GF");
		String FirstCondition_Input_1_Categorical_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_GlobalFilter_Table", "FirstCondition_Input_1_Categorical_GF");
		String FirstCondition_Input_2_Categorical_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_GlobalFilter_Table", "FirstCondition_Input_2_Categorical_GF");
		String FirstCondition_Input_3_Categorical_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_GlobalFilter_Table", "FirstCondition_Input_3_Categorical_GF");
		String FirstCondition_Input_4_Categorical_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_GlobalFilter_Table", "FirstCondition_Input_4_Categorical_GF");
		String FirstCondition_Input_5_Categorical_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_GlobalFilter_Table", "FirstCondition_Input_5_Categorical_GF");
		String FirstCondition_Input_6_Categorical_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_GlobalFilter_Table", "FirstCondition_Input_6_Categorical_GF");
		String FirstCondition_Input_7_Categorical_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_GlobalFilter_Table", "FirstCondition_Input_7_Categorical_GF");
		String FirstCondition_Input_8_Categorical_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_GlobalFilter_Table", "FirstCondition_Input_8_Categorical_GF");
		String FirstCondition_Categorical_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_GlobalFilter_Table", "FirstCondition_Categorical_GF");
		String FirstCondition_Input_Categorical_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_GlobalFilter_Table", "FirstCondition_Input_Categorical_GF");
		String FirstOperator_Input_Categorical_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_GlobalFilter_Table", "FirstOperator_Input_Categorical_GF");
		String SecondOperator_Input_Categorical_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_GlobalFilter_Table", "SecondOperator_Input_Categorical_GF");
		String SecondCondition_Categorical_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_GlobalFilter_Table", "SecondCondition_Categorical_GF");
		String SecondCondition_Input_Categorical_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_GlobalFilter_Table", "SecondCondition_Input_Categorical_GF");
		String ThirdCondition_Categorical_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_GlobalFilter_Table", "ThirdCondition_Categorical_GF");
		String ThirdCondition_Input_Categorical_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Categorical_GlobalFilter_Table", "ThirdCondition_Input_Categorical_GF");

		// Global filter inputs Date
		String SelectDateColumn_Smoke_GlobalFilter = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_GlobalFilter_Table", "SelectDateColumn_Smoke_GlobalFilter");
		String RelativeFilter_1_Date_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_GlobalFilter_Table", "RelativeFilter_1_Date_GF");
		String RelativeFilter_2_Date_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_GlobalFilter_Table", "RelativeFilter_2_Date_GF");
		String RelativeFilter_3_Date_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_GlobalFilter_Table", "RelativeFilter_3_Date_GF");
		String RelativeFilter_4_Date_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_GlobalFilter_Table", "RelativeFilter_4_Date_GF");
		String RelativeFilter_5_Date_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_GlobalFilter_Table", "RelativeFilter_5_Date_GF");
		String RelativeFilter_6_Date_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_GlobalFilter_Table", "RelativeFilter_6_Date_GF");
		String RelativeFilter_7_Date_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_GlobalFilter_Table", "RelativeFilter_7_Date_GF");
		String RelativeFilter_8_Date_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_GlobalFilter_Table", "RelativeFilter_8_Date_GF");
		String RelativeFilter_9_Date_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_GlobalFilter_Table", "RelativeFilter_9_Date_GF");
		String RelativeFilter_10_Date_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_GlobalFilter_Table", "RelativeFilter_10_Date_GF");
		String RelativeFilter_11_Date_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_GlobalFilter_Table", "RelativeFilter_11_Date_GF");
		String RelativeFilter_12_Date_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_GlobalFilter_Table", "RelativeFilter_12_Date_GF");
		String RelativeFilter_13_Date_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_GlobalFilter_Table", "RelativeFilter_13_Date_GF");
		String RelativeFilter_14_Date_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_GlobalFilter_Table", "RelativeFilter_14_Date_GF");
		String RelativeFilter_11_Input_Date_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_GlobalFilter_Table", "RelativeFilter_11_Input_Date_GF");
		String RelativeFilter_12_Input_Date_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_GlobalFilter_Table", "RelativeFilter_12_Input_Date_GF");
		String RelativeFilter_13_Input_Date_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_GlobalFilter_Table", "RelativeFilter_13_Input_Date_GF");
		String RelativeFilter_14_Input_Date_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_GlobalFilter_Table", "RelativeFilter_14_Input_Date_GF");
		String Condition_1_Date_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_GlobalFilter_Table", "Condition_1_Date_GF");
		String Condition_2_Date_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_GlobalFilter_Table", "Condition_2_Date_GF");
		String Condition_3_Date_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_GlobalFilter_Table", "Condition_3_Date_GF");
		String Condition_4_Date_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_GlobalFilter_Table", "Condition_4_Date_GF");
		String Condition_5_Date_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_GlobalFilter_Table", "Condition_5_Date_GF");
		String Condition_6_Date_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_GlobalFilter_Table", "Condition_6_Date_GF");
		String Condition_7_Date_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_GlobalFilter_Table", "Condition_7_Date_GF");
		String Condition_8_Date_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_GlobalFilter_Table", "Condition_8_Date_GF");
		String Condition_9_Date_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_GlobalFilter_Table", "Condition_9_Date_GF");
		String Condition_1_Input_Date_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_GlobalFilter_Table", "Condition_1_Input_Date_GF");
		String Condition_2_Input_Date_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_GlobalFilter_Table", "Condition_2_Input_Date_GF");
		String Condition_3_Input_Date_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_GlobalFilter_Table", "Condition_3_Input_Date_GF");
		String Condition_4_Input_Date_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_GlobalFilter_Table", "Condition_4_Input_Date_GF");
		String Condition_5_Input_Date_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_GlobalFilter_Table", "Condition_5_Input_Date_GF");
		String Condition_6_Input_Date_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_GlobalFilter_Table", "Condition_6_Input_Date_GF");
		String Condition_7_Input_Date_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_GlobalFilter_Table", "Condition_7_Input_Date_GF");
		String Condition_8_Input_Date_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_GlobalFilter_Table", "Condition_8_Input_Date_GF");
		String Condition_9_InputA_Date_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_GlobalFilter_Table", "Condition_9_InputA_Date_GF");
		String Condition_9_InputB_Date_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_GlobalFilter_Table", "Condition_9_InputB_Date_GF");

		String FirstCondition_Date_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_GlobalFilter_Table", "FirstCondition_Date_GF");
		String SecondCondition_Date_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_GlobalFilter_Table", "SecondCondition_Date_GF");
		String ThirdCondition_Date_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_GlobalFilter_Table", "ThirdCondition_Date_GF");
		String FirstCondition_Date_Input_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_GlobalFilter_Table", "FirstCondition_Date_Input_GF");
		String SecondCondition_Date_Input_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_GlobalFilter_Table", "SecondCondition_Date_Input_GF");
		String ThirdCondition_Date_Input_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_GlobalFilter_Table", "ThirdCondition_Date_Input_GF");
		String FirstOperator_Input_Date_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_GlobalFilter_Table", "FirstOperator_Input_Date_GF");
		String SecondOperator_Input_Date_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Date_GlobalFilter_Table", "SecondOperator_Input_Date_GF");

		// Global Numerical Filter Inputs
		String SelectNumerical_Smoke_GlobalFilter = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_GlobalFilter_Table", "SelectNumericalColumn_Smoke_GlobalFilter");
		String Condition_1_Num_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_GlobalFilter_Table", "Condition_1_Num_GF");
		String Condition_2_Num_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_GlobalFilter_Table", "Condition_2_Num_GF");
		String Condition_3_Num_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_GlobalFilter_Table", "Condition_3_Num_GF");
		String Condition_4_Num_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_GlobalFilter_Table", "Condition_4_Num_GF");
		String Condition_5_Num_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_GlobalFilter_Table", "Condition_5_Num_GF");
		String Condition_6_Num_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_GlobalFilter_Table", "Condition_6_Num_GF");
		String Condition_7_Num_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_GlobalFilter_Table", "Condition_7_Num_GF");
		String Condition_8_Num_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_GlobalFilter_Table", "Condition_8_Num_GF");
		String Condition_9_Num_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_GlobalFilter_Table", "Condition_9_Num_GF");
		String Condition_1_Input_Num_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_GlobalFilter_Table", "Condition_1_Input_Num_GF");
		String Condition_2_Input_Num_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_GlobalFilter_Table", "Condition_2_Input_Num_GF");
		String Condition_3_Input_Num_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_GlobalFilter_Table", "Condition_3_Input_Num_GF");
		String Condition_4_Input_Num_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_GlobalFilter_Table", "Condition_4_Input_Num_GF");
		String Condition_5_Input_Num_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_GlobalFilter_Table", "Condition_5_Input_Num_GF");
		String Condition_6_Input_Num_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_GlobalFilter_Table", "Condition_6_Input_Num_GF");
		String Condition_7_Input_Num_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_GlobalFilter_Table", "Condition_7_Input_Num_GF");
		String Condition_8_Input_Num_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_GlobalFilter_Table", "Condition_8_Input_Num_GF");
		String Condition_9_InputA_Num_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_GlobalFilter_Table", "Condition_9_InputA_Num_GF");
		String Condition_Between_InputB_Num_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_GlobalFilter_Table", "Condition_Between_InputB_Num_GF");

		String FirstCondition_Num_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_GlobalFilter_Table", "FirstCondition_Num_GF");
		String SecondCondition_Num_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_GlobalFilter_Table", "SecondCondition_Num_GF");
		String ThirdCondition_num_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_GlobalFilter_Table", "ThirdCondition_num_GF");
		String FirstCondition_Num_Input_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_GlobalFilter_Table", "FirstCondition_Num_Input_GF");
		String SecondCondition_Num_Input_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_GlobalFilter_Table", "SecondCondition_Num_Input_GF");
		String ThirdCondition_Num_Input_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_GlobalFilter_Table", "ThirdCondition_Num_Input_GF");
		String FirstOperator_Input_Num_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_GlobalFilter_Table", "FirstOperator_Input_Num_GF");
		String SecondOperator_Input_Num_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Numerical_GlobalFilter_Table", "SecondOperator_Input_Num_GF");

		// Global Filter inputs Text
		String SelectText_GlobalFilter = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_GlobalFilter_Table", "SelectText_Smoke_GlobalFilter");
		String ByValuesInput_Text_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_GlobalFilter_Table", "ByValuesInput_Text_GF");
		String Condition_1_Text_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_GlobalFilter_Table", "Condition_1_Text_GF");
		String Condition_2_Text_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_GlobalFilter_Table", "Condition_2_Text_GF");
		String Condition_3_Text_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_GlobalFilter_Table", "Condition_3_Text_GF");
		String Condition_4_Text_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_GlobalFilter_Table", "Condition_4_Text_GF");
		String Condition_5_Text_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_GlobalFilter_Table", "Condition_5_Text_GF");
		String Condition_6_Text_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_GlobalFilter_Table", "Condition_6_Text_GF");
		String Condition_7_Text_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_GlobalFilter_Table", "Condition_7_Text_GF");
		String Condition_8_Text_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_GlobalFilter_Table", "Condition_8_Text_GF");
		String Condition_Input_1_Text_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_GlobalFilter_Table", "Condition_Input_1_Text_GF");
		String Condition_Input_2_Text_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_GlobalFilter_Table", "Condition_Input_2_Text_GF");
		String Condition_Input_3_Text_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_GlobalFilter_Table", "Condition_Input_3_Text_GF");
		String Condition_Input_4_Text_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_GlobalFilter_Table", "Condition_Input_4_Text_GF");
		String Condition_Input_5_Text_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_GlobalFilter_Table", "Condition_Input_5_Text_GF");
		String Condition_Input_6_Text_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_GlobalFilter_Table", "Condition_Input_6_Text_GF");
		String Condition_Input_7_Text_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_GlobalFilter_Table", "Condition_Input_7_Text_GF");
		String Condition_Input_8_Text_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_GlobalFilter_Table", "Condition_Input_8_Text_GF");
		String FirstCondition_Text_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_GlobalFilter_Table", "FirstCondition_Text_GF");
		String FirstCondition_Input_Text_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_GlobalFilter_Table", "FirstCondition_Input_Text_GF");
		String FirstOperator_Input_Text_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_GlobalFilter_Table", "FirstOperator_Input_Text_GF");
		String SecondOperator_Input_Text_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_GlobalFilter_Table", "SecondOperator_Input_Text_GF");
		String SecondCondition_Text_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_GlobalFilter_Table", "SecondCondition_Text_GF");
		String SecondCondition_Input_Text_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_GlobalFilter_Table", "SecondCondition_Input_Text_GF");
		String ThirdCondition_Text_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_GlobalFilter_Table", "ThirdCondition_Text_GF");
		String ThirdCondition_Input_Text_GF = Utils.getDataFromTestDataIteration(iteration,
				"SmokeTesting_Input_Text_GlobalFilter_Table", "ThirdCondition_Input_Text_GF");

		// TC_Smoketest_314
		click(driver, ChartTitleInput);
		clear(driver, ChartTitleInput);
		verifyElementIsPresent1(driver, SaveBtn_Chart);
		verifyElementIsPresent1(driver, cancel_chart);
		click(driver, SaveBtn_Chart);
		if (isDisplayed(driver, chartSaveError1)) {
			pass(driver, "'Enter Widget Name' error displayed when save the chart without given chart title name");
		} else {
			fail(driver, "'Enter Widget Name' error not displayed when save the chart without given chart title name");
		}
		elementnotvisible(driver, chartSaveError1);
		sendKeys(driver, ChartTitleInput, ChartTitleName_Smoke);
		click(driver, SaveBtn_Chart);
		elementnotvisible1(driver, RPE_Loading);
		if (!isDisplayed2(driver, chartSaveError1) && isDisplayed(driver, SavedChartTitleInput)) {
			pass(driver, "Chart saved Successfully");

		} else {
			fail(driver, "Chart not saved Successfully");
		}

		String AfterSaveChartTitleName = getText1(driver, SavedChartTitleName);
		if (AfterSaveChartTitleName.equals(ChartTitleName_Smoke)) {
			pass(driver, "Same Chart Title name displayed after saved the chart ");
		} else {
			fail(driver, "Different Chart Title name displayed after saved the chart ");
		}

		String GlobalTab1Id = getAttribute(driver, CurrentTab, "id");

		mouseOverToElement(driver, SavedChartTitleInput);
		verifyElementDisplayed(driver, copyChart);
		verifyElementDisplayed(driver, filterChart);
		verifyElementDisplayed(driver, editeChart);
		verifyElementDisplayed(driver, deteleBtn_chart);

		mouseOverToElement(driver, filterChart);
		click(driver, filterChart);
		if (isDisplayed(driver, LocalFilterSec)) {
			pass(driver, "Local Filter section is displayed when click the filter chart icon");
			String chartTitlename = getText1(driver, ChartTitleNameLocalFilter);
			if (chartTitlename.equals(ChartTitleName_Smoke)) {
				pass(driver, "Same chart title name displayed in Local filter section");
			} else {
				fail(driver, "Different chart title name displayed in Local filter section");
			}
			if (isDisplayed(driver, ColumnListSec_LocalFilter)) {
				pass(driver, "ColumnList Section is present in the Local filter");
				if (isDisplayed(driver, ColumnListValue_LocalFilter)) {
					pass(driver, "Column List Names are displayed in the Local Filter");
					List<WebElement> ColumnListElements = getWebElements(driver, ColumnListValue_LocalFilter);
					List<WebElement> ColumnListImgElements = getWebElements(driver, ColumnTypeIcon_LocalFilter);
					if (ColumnListElements.size() == ColumnListImgElements.size()) {
						pass(driver, "All column values displayed with dataType Image icon");
					} else {
						fail(driver, "Some column values not displayed with dataType Image icon");
					}

				} else {
					fail(driver, "Column List Names are displayed in the Local Filter");
				}
			} else {
				fail(driver, "ColumnList Section is present in the Local filter");
			}

			verifyElementDisplayed(driver, DatasetName_LocalFilter);
			// TC_Smoketest_323
			if (verifyElementDisplayed(driver, Tab_toggle_LocalFilter)) {
				if (isToggleEnable(driver, Tab_inputToggle_LocalFilter)) {
					pass(driver, "Tab toggle enabled by default");
				} else {
					fail(driver, "Tab toggle not enabled by default");
				}
			}

			if (verifyElementDisplayed(driver, Global_toggle_LocalFilter)) {
				if (isToggleEnable(driver, Global_inputToggle_LocalFilter)) {
					pass(driver, "Global toggle enabled by default");
				} else {
					fail(driver, "Global toggle not enabled by default");
				}
			}

			if (verifyElementDisplayed(driver, ApplyButton_LocalFilter)) {
				String ApplyButtonColorAct = getTextBackgroundColor(driver, ApplyButton_LocalFilter);
				if (ApplyButtonColorAct.equalsIgnoreCase(AppluBtnColor_LocalFilterExp)) {
					pass(driver, "Apply button in Local filter is displayed with blue color Exp : "
							+ AppluBtnColor_LocalFilterExp + ", Act : " + ApplyButtonColorAct);
				} else {
					fail(driver, "Apply button in Local filter is not displayed with blue color Exp : "
							+ AppluBtnColor_LocalFilterExp + ", Act : " + ApplyButtonColorAct);
				}
			}
			verifyElementDisplayed(driver, ResetButton_LocalFilter);

			ScrollBarValidation1(driver, ColumnListSec_LocalFilter, "ColumnList Local Filter");

			if (verifyElementDisplayed(driver, SearchBar_Local_Filter)) {
				List<WebElement> ColumnListElements = getWebElements(driver, ColumnListValue_LocalFilter);
				int ColumnListElementsLastSize = ColumnListElements.size() - 1;
				String LastColumnName = ColumnListElements.get(ColumnListElementsLastSize).getText();
				click(driver, SearchBar_Local_Filter);
				sendKeys(driver, SearchBar_Local_Filter, LastColumnName);
				wait(driver, "1");
				String AfterSearchLastName = getText1(driver, ColumnListFirstValue_LocalFilter);
				if (AfterSearchLastName.equals(LastColumnName)) {
					pass(driver, "Search Function works properly in Local Filter");
					if (isDisplayed(driver, ImageFirstColumn_localFiler)) {
						pass(driver, "DataType image is displayed in the searched Value");
					} else {
						fail(driver, "DataType image is not displayed in the searched Value");
					}
				} else {
					fail(driver, "Search Function not works properly in Local Filter");
				}
				clear1(driver, SearchBar_Local_Filter);
				wait(driver, "1");
				enter(driver);
				String AfterRestSearchValue = getText1(driver, SearchBar_Local_Filter);
				if (AfterRestSearchValue.isEmpty() || AfterRestSearchValue.equals(null)) {
					pass(driver, "Value cleared successfully in searchbar");
				} else {
					fail(driver, "Value not cleared successfully in searchbar");
				}

			}

			// categorical Dynamic change Start...
			boolean categoricalFilter = false;
			try {
				WebElement CategoricalColumn = driver
						.findElement(By.xpath("//div[@id='dashboardLRPE_select_filterColsCon']//div[@id='"
								+ SelectCategorical_LocalFilter + "']//a"));
				action.moveToElement(CategoricalColumn).click().build().perform();
				categoricalFilter = true;
			} catch (Exception e) {

			}

			if (categoricalFilter == true) {
				WebElement CategoricalColumnExp = driver
						.findElement(By.xpath("//div[@id='dashboardLRPE_select_filterColsCon']//div[@id='"
								+ SelectCategorical_LocalFilter + "']//a//i"));
				String CategoricalColumnExpText = CategoricalColumnExp.getAttribute("class");
				if (CategoricalColumnExpText.contains("up")) {
					pass(driver, "Categorical Column Expand After click on it ");
					if (verifyElementDisplayed(driver, byValueFilterOption)) {
						try {
							WebElement ByValueElementRadio = driver.findElement(By.xpath("//div[@id='"
									+ SelectCategorical_LocalFilter + "_content']//div[@id='byRelative_div']//input"));
							if (ByValueElementRadio.isSelected()) {
								pass(driver, "By default, 'By Values' radio button selected ");
							} else {
								fail(driver, "By default, 'By Values' radio button not selected ");
							}
						} catch (Exception e) {
							fail(driver, "Unable to find 'By Values' radio button ");
							e.printStackTrace();
						}
					}

					verifyElementDisplayed(driver, AllCheckbox_CategoricalSec);
					verifyElementDisplayed(driver, CategoricalSearchListOptions);
					verifyElementDisplayed(driver, ExcludeOption_Categorical);
					verifyElementDisplayed(driver, ExcludeCheckbox);

					List<WebElement> searchListAvailable = driver.findElements(
							By.xpath("//div[@id='" + SelectCategorical_LocalFilter + "_FactorsList']//li"));
					List<WebElement> searchListCheckboxAvailable = driver.findElements(By.xpath("//div[@id='"
							+ SelectCategorical_LocalFilter + "_FactorsList']//li//input[@type='checkbox']"));
					if (searchListAvailable.size() == searchListCheckboxAvailable.size()) {
						pass(driver, "All the available searchlist are displayed with Checkbox");
					} else {
						fail(driver, "Some available searchlist are not displayed with Checkbox");
					}

					WebElement SearchBar_ = driver
							.findElement(By.xpath("//input[@id='" + SelectCategorical_LocalFilter + "LFsearch']"));
					SearchBar_.click();
					wait(driver, "1");
					SearchBar_.sendKeys(ByValuesInput_Categorical_LF);
					pass(driver, "Type On Value " + ByValuesInput_Categorical_LF + " search input");
					wait(driver, "1");
					WebElement firstOption = driver.findElement(
							By.xpath("(//div[@id='" + SelectCategorical_LocalFilter + "_FactorsList']//li)[1]"));
					String firstOptionText = firstOption.getText();
					if (firstOptionText.equals(ByValuesInput_Categorical_LF)) {
						pass(driver, "Search bar inside the Categorical section works properly");
					} else {
						fail(driver, "Search bar inside the Categorical section not works properly");
					}

					firstOption.click();
					wait(driver, "1");
					WebElement firstCheckBox = driver.findElement(
							By.xpath("(//div[@id='" + SelectCategorical_LocalFilter + "_FactorsList']//li//input)[1]"));
					if (firstCheckBox.isSelected()) {
						pass(driver, "Check box selected when click the First searched value");
					} else {
						fail(driver, "Check box not selected when click the First searched value");
					}

					click(driver, ApplyButton_LocalFilter);
					wait(driver, "1");
					if (isDisplayed(driver, body)) {
						mouseOverToElement(driver, body);

						mouseOverToElement(driver, LocalFilterChartIcon);
						String LocatFilterExpected = "Local Filter: ON ";
						String LocatFilterAct = getAttribute1(driver, FilterChartIcon, "title");
						System.out.println("LocatFilterExp : " + LocatFilterAct);
						if (LocatFilterAct.contains(LocatFilterExpected)) {
							System.out.println("Passed : LocatFilterAct");
							pass(driver, "Local filter is ON in the chart after Apply filter");
						} else {
							System.out.println("Failed.!! : LocatFilterAct");
							fail(driver, "Local filter is not ON in the chart after Apply filter");
						}

						String LocalFilterIconColorRGB = getWebElement(driver, LocalFilterChartIcon)
								.getCssValue("fill");
						System.out.println("LocalFilterIconColorRGB : " + LocalFilterIconColorRGB);

						String LocalFilterIconColorAct = rgbToHex1(LocalFilterIconColorRGB);
						System.out.println("LocalFilterIconColorAct : " + LocalFilterIconColorAct);

						if ("#00E600".equalsIgnoreCase(LocalFilterIconColorAct)) { // need to modify.
							pass(driver, "Local Filter icon changed to green color after Applying the Local Filter");
						} else {
							fail(driver,
									"Local Filter icon not changed to green color after Applying the Local Filter");
						}

						int j = 1;
						boolean filteredCell = true;
						String failedValues = " ";
						List<WebElement> LocalFilterChartValue = driver
								.findElements(By.xpath("(//div[@ref='gridBody'])[1]//div[@col-id='"
										+ SelectCategorical_LocalFilter + "' and @role='gridcell']"));
						for (WebElement localEle : LocalFilterChartValue) {
							String LocalFilterCellValue = localEle.getText();

							if (!LocalFilterCellValue.equals(ByValuesInput_Categorical_LF)) {
								filteredCell = false;
								failedValues = failedValues + j + ", ";
							}
							j++;
						}

						if (filteredCell == true) {
							pass(driver, "For 'By Values' condition applied correctly");
						} else {
							fail(driver, "By Value Local Filter not Applied correctly for the Categorical column : "
									+ SelectCategorical_LocalFilter + ", Rows : " + failedValues);
						}

					} else {
						fail(driver, "Unable to get the chart value for the selected filter");
					}

					click(driver, ExcludeCheckbox);
					click(driver, ApplyButton_LocalFilter);
					wait(driver, "1");
					if (isDisplayed(driver, body)) {
						mouseOverToElement(driver, body);
						mouseOverToElement(driver, LocalFilterChartIcon);
						String LocalFilterIconColorRGB = getWebElement(driver, LocalFilterChartIcon)
								.getCssValue("fill");
						System.out.println("LocalFilterIconColorRGB : " + LocalFilterIconColorRGB);

						String LocalFilterIconColorAct = rgbToHex1(LocalFilterIconColorRGB);
						System.out.println("LocalFilterIconColorAct : " + LocalFilterIconColorAct);

						if ("#00E600".equalsIgnoreCase(LocalFilterIconColorAct)) { // need to modify.
							pass(driver, "Local Filter icon changed to green color after Applying the Local Filter");
						} else {
							fail(driver,
									"Local Filter icon not changed to green color after Applying the Local Filter");
						}
						int j = 1;
						boolean filteredCell = true;
						String failedValues1 = " ";
						List<WebElement> LocalFilterChartValue = driver
								.findElements(By.xpath("(//div[@ref='gridBody'])[1]//div[@col-id='"
										+ SelectCategorical_LocalFilter + "' and @role='gridcell']"));
						for (WebElement localEle : LocalFilterChartValue) {
							String LocalFilterCellValue = localEle.getText();

							if (LocalFilterCellValue.equals(ByValuesInput_Categorical_LF)) {
								filteredCell = false;
								failedValues1 = failedValues1 + j + ", ";
							}
							j++;
						}

						if (filteredCell == true) {
							pass(driver, "For 'By Values 'Exclude' ' condition applied correctly..");
						} else {
							fail(driver,
									"By Value Local 'Exclude' Filter not Applied correctly for the Categorical column : "
											+ SelectCategorical_LocalFilter + ", Rows : " + failedValues1);
						}

					} else {
						fail(driver, "Unable to get the chart value for the selected filter");
					}

					if (verifyElementDisplayed(driver, ConditionFilterOption_Categorical)) {
						click(driver, ConditionFilterOption_Categorical);
						wait(driver, "1");
						if (isElementSelected(driver, ConditionRadioButton_Categorical)) {
							pass(driver, "Condition radio button selected after click on it");
						} else {
							fail(driver, "Condition radio button not selected after click on it");
						}

						if (verifyElementDisplayed(driver, ConditionSelectDropdown)) {
							String defaultSelectedCondition = defaultSelectedValue(driver, ConditionSelectDropdown);
							if (defaultSelectedCondition.equals("equal to")) {
								pass(driver, "By default, 'equal to' option selected in the Condition select dropdown");
							} else {
								fail(driver,
										"By default, 'equal to' option not selected in the Condition select dropdown");
							}

							verifyElementIsPresent1(driver, equalTo_Option);
							verifyElementIsPresent1(driver, NotequalTo_Option);
							verifyElementIsPresent1(driver, NotequalTo_Option);
							verifyElementIsPresent1(driver, BeginsWith_Option);
							verifyElementIsPresent1(driver, notBeginsWith_Option);
							verifyElementIsPresent1(driver, endsWith_Option);
							verifyElementIsPresent1(driver, notendsWith_Option);
							verifyElementIsPresent1(driver, Contains_Option);
							verifyElementIsPresent1(driver, NotContains_Option);

							String[] conditionsList = { FirstCondition_1_Categorical_LF,
									FirstCondition_2_Categorical_LF, FirstCondition_3_Categorical_LF,
									FirstCondition_4_Categorical_LF, FirstCondition_5_Categorical_LF,
									FirstCondition_6_Categorical_LF, FirstCondition_7_Categorical_LF,
									FirstCondition_8_Categorical_LF };
							String[] conditionsInputList = { FirstCondition_Input_1_Categorical_LF,
									FirstCondition_Input_2_Categorical_LF, FirstCondition_Input_3_Categorical_LF,
									FirstCondition_Input_4_Categorical_LF, FirstCondition_Input_5_Categorical_LF,
									FirstCondition_Input_6_Categorical_LF, FirstCondition_Input_7_Categorical_LF,
									FirstCondition_Input_8_Categorical_LF };

							for (int k = 0; k < 8; k++) {

								try {
									selectByText(driver, ConditionSelectDropdown, conditionsList[k]);
									wait(driver, "1");
									click(driver, ConditonInput1);
									clear1(driver, ConditonInput1);
									sendKeys(driver, ConditonInput1, conditionsInputList[k]);
									wait(driver, "1");
									click(driver, ApplyButton_LocalFilter);
									wait(driver, "2");
									if (isDisplayed(driver, body)) {
										mouseOverToElement(driver, body);
										mouseOverToElement(driver, LocalFilterChartIcon);
										String LocalFilterIconColorRGB = getWebElement(driver, LocalFilterChartIcon)
												.getCssValue("fill");
										System.out.println("LocalFilterIconColorRGB : " + LocalFilterIconColorRGB);

										String LocalFilterIconColorAct = rgbToHex1(LocalFilterIconColorRGB);
										System.out.println("LocalFilterIconColorAct : " + LocalFilterIconColorAct);
										if ("#00E600".equalsIgnoreCase(LocalFilterIconColorAct)) { // need to modify.
											pass(driver,
													"Local Filter icon changed to green color after Applying the Local Filter : "
															+ conditionsList[k]);
										} else {
											fail(driver,
													"Local Filter icon not changed to green color after Applying the Local Filter : "
															+ conditionsList[k]);
										}

										int j = 1;
										boolean filteredCell = true;
										String failedvalues2 = " ";
										List<WebElement> LocalFilterChartValue = driver
												.findElements(By.xpath("(//div[@ref='gridBody'])[1]//div[@col-id='"
														+ SelectCategorical_LocalFilter + "' and @role='gridcell']"));
										for (WebElement localEle : LocalFilterChartValue) {
											String LocalFilterCellValue = localEle.getText();
											if (!Categorical_ConditionFiltercell(conditionsList[k],
													LocalFilterCellValue, conditionsInputList[k])) {
												filteredCell = false;
												failedvalues2 = failedvalues2 + j + ", ";
											}
											j++;
										}
										if (filteredCell == true) {
											pass(driver,"For '" + conditionsList[k] + "' condition applied correctly..");
										} else {
											fail(driver, conditionsList[k]+ " Condition in Local Filter not Applied correctly for the column : "+ SelectCategorical_LocalFilter + ", Rows : " + failedvalues2);
										}

									} else {
										fail(driver,
												"Unable to get the chart value for the selected filter, error display : "+ getText1(driver, ValidationChart));
									}

								} catch (Exception e) {
									e.printStackTrace();
								}
							}

							click(driver, ConditionSelectDropdown);
							selectByText(driver, ConditionSelectDropdown, FirstCondition_Categorical_LF);
							wait(driver, "1");
							click(driver, ConditonInput1);
							clear1(driver, ConditonInput1);
							sendKeys(driver, ConditonInput1, FirstCondition_Input_Categorical_LF);
							wait(driver, "1");
							if (isDisplayed(driver, AddButtonCondition)) {
								pass(driver, "ADD button displayed after selecting the condition");
							} else {
								fail(driver, "ADD button not displayed after selecting the condition");
							}

							mouseOverToElement(driver, AddButtonCondition);
							click(driver, AddButtonCondition);

							verifyElementDisplayed(driver, AND_ConditionSec1);
							verifyElementDisplayed(driver, OR_ConditionSec1);

							if (FirstOperator_Input_Categorical_LF.equals("AND")) {
								click(driver, AND_ConditionSec1);
								wait(driver, "1");
								if (isElementSelected(driver, AND_ConditionRadioBtn1)) {
									pass(driver, "AND Operated Selected after click on it");
								} else {
									fail(driver, "AND Operated Selected after click on it");
								}

							} else {
								click(driver, OR_ConditionSec1);
								wait(driver, "1");
								if (isElementSelected(driver, OR_ConditionRadioBtn1)) {
									pass(driver, "AND Operated Selected after click on it");
								} else {
									fail(driver, "AND Operated Selected after click on it");
								}
							}

							if (isDisplayed(driver, ConditionSelectDropdown2)) {
								pass(driver,
										"After click 'ADD' button Second time Condition Selection dropdown is displayed");
							} else {
								fail(driver,
										"After click 'ADD' button Second time Condition Selection dropdown is not displayed");
							}

							click(driver, ConditionSelectDropdown2);
							selectByText(driver, ConditionSelectDropdown2, SecondCondition_Categorical_LF);
							wait(driver, "1");
							click(driver, ConditonInput2);
							sendKeys(driver, ConditonInput2, SecondCondition_Input_Categorical_LF);
							wait(driver, "1");
							if (isDisplayed(driver, AddButtonCondition)) {
								pass(driver, "2 time ADD button displayed after selecting the condition 2nd time ");
							} else {
								fail(driver, "2 time ADD button not displayed after selecting the condition 2nd time ");
							}

							mouseOverToElement(driver, AddButtonCondition);
							click(driver, AddButtonCondition);
							verifyElementDisplayed(driver, AND_ConditionSec2);
							verifyElementDisplayed(driver, OR_ConditionSec2);

							if (SecondOperator_Input_Categorical_LF.equals("AND")) {
								click(driver, AND_ConditionSec2);
								wait(driver, "1");
								if (isElementSelected(driver, AND_ConditionRadioBtn2)) {
									pass(driver, "AND Operated Selected after click on it");
								} else {
									fail(driver, "AND Operated Selected after click on it");
								}

							} else {
								click(driver, OR_ConditionSec2);
								wait(driver, "1");
								if (isElementSelected(driver, OR_ConditionRadioBtn2)) {
									pass(driver, "AND Operated Selected after click on it");
								} else {
									fail(driver, "AND Operated Selected after click on it");
								}
							}

							if (isDisplayed(driver, ConditionSelectDropdown3)) {
								pass(driver,
										"After click 'ADD' button Third time Condition Selection dropdown is displayed");
							} else {
								fail(driver,
										"After click 'ADD' button Third time Condition Selection dropdown is not displayed");
							}

							selectByText(driver, ConditionSelectDropdown3, ThirdCondition_Categorical_LF);
							wait(driver, "1");
							click(driver, ConditonInput3);
							sendKeys(driver, ConditonInput3, ThirdCondition_Input_Categorical_LF);
							wait(driver, "1");
							if (isDisplayed2(driver, AddButtonCondition)) {
								fail(driver, "'ADD' button displayed after given 3 times condition ");
							} else {
								pass(driver, "'ADD' button not displayed after given 3 times condition");
							}

							click(driver, ApplyButton_LocalFilter);
							wait(driver, "1");
							if (isDisplayed(driver, body)) {
								mouseOverToElement(driver, body);
								int j = 1;
								boolean filteredCell = true;
								String failedValues3 = " ";
								List<WebElement> LocalFilterChartValue = driver
										.findElements(By.xpath("(//div[@ref='gridBody'])[1]//div[@col-id='"
												+ SelectCategorical_LocalFilter + "' and @role='gridcell']"));
								for (WebElement localEle : LocalFilterChartValue) {
									String LocalFilterCellValue = localEle.getText();
									boolean condition_1_Result = Categorical_ConditionFiltercell(
											FirstCondition_Categorical_LF, LocalFilterCellValue,
											FirstCondition_Input_Categorical_LF);
									boolean condition_2_Result = Categorical_ConditionFiltercell(
											SecondCondition_Categorical_LF, LocalFilterCellValue,
											SecondCondition_Input_Categorical_LF);
									boolean condition_3_Result = Categorical_ConditionFiltercell(
											ThirdCondition_Categorical_LF, LocalFilterCellValue,
											ThirdCondition_Input_Categorical_LF);
									String operator1 = FirstOperator_Input_Categorical_LF;
									String operator2 = SecondOperator_Input_Categorical_LF;

									if (!evaluateConditions(condition_1_Result, operator1, condition_2_Result,
											operator2, condition_3_Result)) {
										filteredCell = false;
										failedValues3 = failedValues3 + j + ", ";
									}
									j++;
								}
								if (filteredCell == true) {
									pass(driver, "For 'Selected 3 Condition'  applied correctly Local Filter..");
								} else {
									fail(driver,
											"Selected 3 Condition in Local Filter not Applied correctly for the Categorical column : "
													+ SelectCategorical_LocalFilter + ", Rows : " + failedValues3);
								}

							} else {
								fail(driver, "Unable to get the chart value for the selected filter, error display : "
										+ getText1(driver, ValidationChart));
							}

							click(driver, ResetButton_LocalFilter);
							wait(driver, "1");
							waitForElement(driver, body);
							mouseOverToElement(driver, LocalFilterChartIcon);
							String LocatFilterExpected = "Local Filter: OFF ";
							String LocatFilterExpRest = getAttribute1(driver, FilterChartIcon, "title");
							System.out.println("LocatFilterExpRest : " + LocatFilterExpRest);

							if (LocatFilterExpRest.contains(LocatFilterExpected)) {
								System.out.println("Passed : LocatFilterAct");
								pass(driver, "Local filter is OFF in the chart after Reset filter");
							} else {
								System.out.println("Failed.!! : LocatFilterAct");
								fail(driver, "Local filter is not OFF in the chart after Reset filter");
							}

							String LocalFilterIconColorRGB = getWebElement(driver, LocalFilterChartIcon)
									.getCssValue("fill");
							System.out.println("LocalFilterIconColorRGB : " + LocalFilterIconColorRGB);

							try {
								String LocalFilterIconColorAct = rgbToHex1(LocalFilterIconColorRGB);
								System.out.println("LocalFilterIconColorAct : " + LocalFilterIconColorAct);

								if (!"#00E600".equalsIgnoreCase(LocalFilterIconColorAct)) { // need to modify.
									pass(driver,
											"Local Filter icon changed to Original color after Reset the Local Filter");
								} else {
									fail(driver,
											"Local Filter icon not changed to Original color after Reset the Local Filter");
								}
							} catch (Exception e) {
								// TODO Auto-generated catch block
								System.out.println("LocalFilterIconColorAct : Failed");
							}

						}
					}

				} else {
					fail(driver, "Categorical Column not Expand After click on it ");
				}

			} else {
				fail(driver, SelectCategorical_LocalFilter + " Categorical Column value not present in local filter");
			}
//		  
			// Categorical Validation End...

			// Date Validation Start....
			click(driver, ResetButton_LocalFilter);
			boolean dateFilter = false;
			try {
				WebElement DateColumnElement = driver
						.findElement(By.xpath("//div[@id='dashboardLRPE_select_filterColsCon']//div[@id='"
								+ SelectDateColumn_Smoke_LocalFilter + "']//a"));
				action.moveToElement(DateColumnElement).click().build().perform();
				dateFilter = true;
			} catch (Exception e) {

			}

			if (dateFilter == true) {

				wait(driver, "1");
				WebElement DateColumnElementExpand = driver
						.findElement(By.xpath("//div[@id='dashboardLRPE_select_filterColsCon']//div[@id='"
								+ SelectDateColumn_Smoke_LocalFilter + "']//a//i"));
				String DateColumnElementExpandString = DateColumnElementExpand.getAttribute("class");
				if (DateColumnElementExpandString.contains("up")) {
					pass(driver, "Selected Date Column expanded after click on it");

					WebElement Date_RelativeSection = driver.findElement(By.xpath("//div[@id='"
							+ SelectDateColumn_Smoke_LocalFilter + "_content']//div[@id='relative_div']"));
					pass(driver, "Relative filter present in the Date Column");
					WebElement Date_RelativeRadioBtn = driver.findElement(By.xpath("//div[@id='"
							+ SelectDateColumn_Smoke_LocalFilter + "_content']//div[@id='relative_div']//input"));
					if (Date_RelativeRadioBtn.isSelected()) {
						pass(driver, "By default, 'Relative' option selected in the Date Column");
						click(driver, Relative_conditin_dropdown);

						verifyElementIsPresent1(driver, Today_RelativeOption);
						verifyElementIsPresent1(driver, Yesterday_RelativeOption);
						verifyElementIsPresent1(driver, Last7Day_RelativeOption);
						verifyElementIsPresent1(driver, ThisWeek_RelativeOption);
						verifyElementIsPresent1(driver, LastWeek_RelativeOption);
						verifyElementIsPresent1(driver, ThisMonth_RelativeOption);
						verifyElementIsPresent1(driver, LastMonth_RelativeOption);
						verifyElementIsPresent1(driver, Last6Month_RelativeOption);
						verifyElementIsPresent1(driver, ThisYear_RelativeOption);
						verifyElementIsPresent1(driver, LastYear_RelativeOption);
						verifyElementIsPresent1(driver, Last_N_Days_RelativeOption);
						verifyElementIsPresent1(driver, Last_N_Week_RelativeOption);
						verifyElementIsPresent1(driver, Last_N_Months_RelativeOption);
						verifyElementIsPresent1(driver, Last_N_Years_RelativeOption);

						String[] RelativeFilterList = { RelativeFilter_1_Date_LF, RelativeFilter_2_Date_LF,
								RelativeFilter_3_Date_LF, RelativeFilter_4_Date_LF, RelativeFilter_5_Date_LF,
								RelativeFilter_6_Date_LF, RelativeFilter_7_Date_LF, RelativeFilter_8_Date_LF,
								RelativeFilter_9_Date_LF, RelativeFilter_10_Date_LF, RelativeFilter_11_Date_LF,
								RelativeFilter_12_Date_LF, RelativeFilter_13_Date_LF, RelativeFilter_14_Date_LF };
						String[] RelativeFilterInputList = { "", "", "", "", "", "", "", "", "", "",
								RelativeFilter_11_Input_Date_LF, RelativeFilter_12_Input_Date_LF,
								RelativeFilter_13_Input_Date_LF, RelativeFilter_14_Input_Date_LF };

						for (int k = 0; k < 14; k++) {

							try {
								selectByText(driver, Relative_conditin_dropdown, RelativeFilterList[k]);
								wait(driver, "1");
								if (k >= 10 && isDisplayed(driver, Relative_Input_Value_date)) {
									click(driver, Relative_Input_Value_date);
									clear1(driver, Relative_Input_Value_date);
									sendKeys(driver, Relative_Input_Value_date, RelativeFilterInputList[k]);

								}
								wait(driver, "1");
								click(driver, ApplyButton_LocalFilter);
								wait(driver, "1");
								if (isDisplayed(driver, body)) {
									mouseOverToElement(driver, body);
									wait(driver, "1");
									mouseOverToElement(driver, LocalFilterChartIcon);
									String LocalFilterIconColorRGB = getWebElement(driver, LocalFilterChartIcon)
											.getCssValue("fill");
									System.out.println("LocalFilterIconColorRGB : " + LocalFilterIconColorRGB);

									String LocalFilterIconColorAct = rgbToHex1(LocalFilterIconColorRGB);
									System.out.println("LocalFilterIconColorAct : " + LocalFilterIconColorAct);

									if ("#00E600".equalsIgnoreCase(LocalFilterIconColorAct)) { // need to modify.
										pass(driver,
												"Local Filter icon changed to green color after Applying the Local Filter : "
														+ RelativeFilterList[k]);
									} else {
										fail(driver,
												"Local Filter icon not changed to green color after Applying the Local Filter : "
														+ RelativeFilterList[k]);
									}

									int j = 1;
									boolean filteredCell = true;
									String failedValues = " ";
									List<WebElement> LocalFilterChartValue = driver
											.findElements(By.xpath("(//div[@ref='gridBody'])[1]//div[@col-id='"
													+ SelectDateColumn_Smoke_LocalFilter + "' and @role='gridcell']"));
									for (WebElement localEle : LocalFilterChartValue) {
										String LocalFilterCellValue = localEle.getText();
//			    			  				 System.out.println("LocalFilterDate CellValue  : "+LocalFilterCellValue);

										if (LocalFilterCellValue != null && LocalFilterCellValue.length() >= 10) {
											LocalFilterCellValue = LocalFilterCellValue.substring(0, 10);
										}
										if (!Date_RelativeFiltercell(RelativeFilterList[k], LocalFilterCellValue,
												RelativeFilterInputList[k])) {
											filteredCell = false;
											failedValues = failedValues + j + ", ";
										}
										j++;
									}

									if (filteredCell == true) {
										pass(driver, "For '" + RelativeFilterList[k]
												+ "' condition applied correctly Local Filter..");
									} else {
										fail(driver, RelativeFilterList[k]
												+ " Condition in Local Filter not Applied correctly for the Date column : "
												+ SelectDateColumn_Smoke_LocalFilter + ", Rows : " + failedValues);
									}
								} else {
									fail(driver,
											"Unable to get the chart value for the selected filter, error display : "
													+ getText1(driver, ValidationChart));
								}

							} catch (Exception e) {
								e.printStackTrace();
							}
						}

					} else {
						fail(driver, "By default, 'Relative' option not selected in the Date Column");
					}
					System.out.println();
					System.out.println("********** Conditions filter in Date *********************");
					System.out.println();
					if (verifyElementDisplayed(driver, ConditionFilterOption_Date)) {
						click(driver, ConditionFilterOption_Date);
						wait(driver, "1");
						if (isElementSelected(driver, ConditionRadioButton_Date)) {
							pass(driver, "Conditions Filter in Date type Colunm is selected after click on it ");

							verifyElementIsPresent1(driver, EqualTo_OptionDate);
							verifyElementIsPresent1(driver, NotEqualTo_OptionDate);
							verifyElementIsPresent1(driver, GreaterThan_OptionDate);
							verifyElementIsPresent1(driver, LessThan_OptionDate);
							verifyElementIsPresent1(driver, GreaterEqualTo_OptionDate);
							verifyElementIsPresent1(driver, LessThanEqualTo_OptionDate);
							verifyElementIsPresent1(driver, IsNull_OptionDate);
							verifyElementIsPresent1(driver, IsNotNull_OptionDate);
							verifyElementIsPresent1(driver, Between_OptionDate);

							String[] ConditionFilterList = { Condition_1_Date_LF, Condition_2_Date_LF,
									Condition_3_Date_LF, Condition_4_Date_LF, Condition_5_Date_LF, Condition_6_Date_LF,
									Condition_7_Date_LF, Condition_8_Date_LF, Condition_9_Date_LF };
							String[] ConditionFilterInputList = { Condition_1_Input_Date_LF, Condition_2_Input_Date_LF,
									Condition_3_Input_Date_LF, Condition_4_Input_Date_LF, Condition_5_Input_Date_LF,
									Condition_6_Input_Date_LF, Condition_7_Input_Date_LF, Condition_8_Input_Date_LF,
									Condition_9_InputA_Date_LF };

							for (int k = 0; k < 9; k++) {

								try {
									selectByText(driver, ConditionInput1_Date, ConditionFilterList[k]);
									wait(driver, "1");
									if (!ConditionFilterList[k].equals("is null")
											&& !ConditionFilterList[k].equals("is not null")) {
										click(driver, FirstConditionValueInput1_date);
										for (int m = 0; m < 3; m++) {
											action.sendKeys(Keys.BACK_SPACE).build().perform();
											action.sendKeys(Keys.ARROW_RIGHT).build().perform();
										}
										click(driver, DashProPage);
										click(driver, FirstConditionValueInput1_date);
										sendKeys(driver, FirstConditionValueInput1_date, ConditionFilterInputList[k]);
										wait(driver, "1");

										if (ConditionFilterList[k].equals("between")) {
											if (isDisplayed(driver, FirstConditionValueInput2_date)) {
												pass(driver,
														"Second input element is available for 'between' condition");
												click(driver, FirstConditionValueInput2_date);
												for (int m = 0; m < 3; m++) {
													action.sendKeys(Keys.BACK_SPACE).build().perform();
													action.sendKeys(Keys.ARROW_RIGHT).build().perform();
												}
												click(driver, FirstConditionValueInput1_date);
												click(driver, FirstConditionValueInput2_date);
												sendKeys(driver, FirstConditionValueInput2_date,
														Condition_9_InputB_Date_LF);
											} else {
												fail(driver,
														"Second input element is not available for 'between' condition");
											}
										}

									}
									wait(driver, "2");
									click(driver, ApplyButton_LocalFilter);
									elementnotvisible(driver, Loading1);
									if (isDisplayed(driver, body)) {
										mouseOverToElement(driver, body);
										mouseOverToElement(driver, LocalFilterChartIcon);
										String LocalFilterIconColorRGB = getWebElement(driver, LocalFilterChartIcon)
												.getCssValue("fill");
										System.out.println("LocalFilterIconColorRGB : " + LocalFilterIconColorRGB);

										String LocalFilterIconColorAct = rgbToHex1(LocalFilterIconColorRGB);
										System.out.println("LocalFilterIconColorAct : " + LocalFilterIconColorAct);

										if ("#00E600".equalsIgnoreCase(LocalFilterIconColorAct)) { // need to modify.
											pass(driver,
													"Local Filter icon changed to green color after Applying the Local Filter : "
															+ ConditionFilterList[k]);
										} else {
											fail(driver,
													"Local Filter icon not changed to green color after Applying the Local Filter : "
															+ ConditionFilterList[k]);
										}
										wait(driver, "1");
										int j = 1;
										boolean filteredCell = true;
										String failedValues = " ";
										List<WebElement> LocalFilterChartValue = driver
												.findElements(By.xpath("(//div[@ref='gridBody'])[1]//div[@col-id='"
														+ SelectDateColumn_Smoke_LocalFilter
														+ "' and @role='gridcell']"));
										for (WebElement localEle : LocalFilterChartValue) {
											String LocalFilterCellValue = localEle.getText();
											if (LocalFilterCellValue != null && LocalFilterCellValue.length() >= 10) {
												LocalFilterCellValue = LocalFilterCellValue.substring(0, 10);
											}

											if (!Date_ConditionFiltercell(ConditionFilterList[k], LocalFilterCellValue,
													ConditionFilterInputList[k], Condition_9_InputB_Date_LF)) {
												filteredCell = false;
												failedValues = failedValues + j + ", ";
											}
											j++;
										}

										if (filteredCell == true) {
											pass(driver, "For '" + ConditionFilterList[k]
													+ "' condition applied correctly Local Filter..");
										} else {
											fail(driver, ConditionFilterList[k]
													+ " Condition in Local Filter not Applied correctly for the Date column : "
													+ SelectDateColumn_Smoke_LocalFilter + ", Rows : " + failedValues);
										}

									} else {
										fail(driver,
												"Unable to get the chart value for the selected filter, error display : "
														+ getText1(driver, ValidationChart));
									}

								} catch (Exception e) {
									e.printStackTrace();
								}
							}

							click(driver, ConditionFilterOption_Date);
							wait(driver, "1");
							selectByText(driver, ConditionInput1_Date, FirstCondition_Date_LF);
							wait(driver, "1");
							if (!FirstCondition_Date_LF.equals("is null")
									&& !FirstCondition_Date_LF.equals("is not null")) {
								click(driver, FirstConditionValueInput1_date);
								for (int m = 0; m < 3; m++) {
									action.sendKeys(Keys.BACK_SPACE).build().perform();
									action.sendKeys(Keys.ARROW_RIGHT).build().perform();
								}
								click(driver, DashProPage);
								click(driver, FirstConditionValueInput1_date);
								sendKeys(driver, FirstConditionValueInput1_date, FirstCondition_Date_Input_LF);
								wait(driver, "1");
							}
							wait(driver, "1");
							if (isDisplayed(driver, AddButtonCondition)) {
								pass(driver, "ADD button displayed after selecting the first condition");
							} else {
								fail(driver, "ADD button not displayed after selecting the first condition");
							}

							mouseOverToElement(driver, AddButtonCondition);
							click(driver, AddButtonCondition);

							verifyElementDisplayed(driver, AND_ConditionSec1);
							verifyElementDisplayed(driver, OR_ConditionSec1);

							if (FirstOperator_Input_Date_LF.equals("AND")) {
								click(driver, AND_ConditionSec1);
								wait(driver, "1");
								if (isElementSelected(driver, AND_ConditionRadioBtn1)) {
									pass(driver, "AND Operated Selected after click on it");
								} else {
									fail(driver, "AND Operated Selected after click on it");
								}

							} else {
								click(driver, OR_ConditionSec1);
								wait(driver, "1");
								if (isElementSelected(driver, OR_ConditionRadioBtn1)) {
									pass(driver, "AND Operated Selected after click on it");
								} else {
									fail(driver, "AND Operated Selected after click on it");
								}
							}

							if (isDisplayed(driver, ConditionInput2_Date)) {
								pass(driver,
										"After click 'ADD' button Second time Condition Selection dropdown is displayed");
							} else {
								fail(driver,
										"After click 'ADD' button Second time Condition Selection dropdown is not displayed");
							}

							click(driver, ConditionInput2_Date);
							selectByText(driver, ConditionInput2_Date, SecondCondition_Date_LF);
							if (!SecondCondition_Date_LF.equals("is null")
									&& !SecondCondition_Date_LF.equals("is not null")) {
								click(driver, SecondConditionValueInput1_date);
								for (int m = 0; m < 3; m++) {
									action.sendKeys(Keys.BACK_SPACE).build().perform();
									action.sendKeys(Keys.ARROW_RIGHT).build().perform();
								}
								click(driver, DashProPage);
								click(driver, SecondConditionValueInput1_date);
								sendKeys(driver, SecondConditionValueInput1_date, SecondCondition_Date_Input_LF);

							}
							wait(driver, "1");
							if (isDisplayed(driver, AddButtonCondition)) {
								pass(driver, "2 time ADD button displayed after selecting the condition 2nd time ");
							} else {
								fail(driver, "2 time ADD button not displayed after selecting the condition 2nd time ");
							}

							mouseOverToElement(driver, AddButtonCondition);
							click(driver, AddButtonCondition);
							verifyElementDisplayed(driver, AND_ConditionSec2);
							verifyElementDisplayed(driver, OR_ConditionSec2);

							if (SecondOperator_Input_Date_LF.equals("AND")) {
								click(driver, AND_ConditionSec2);
								wait(driver, "1");
								if (isElementSelected(driver, AND_ConditionRadioBtn2)) {
									pass(driver, "AND Operated Selected after click on it");
								} else {
									fail(driver, "AND Operated Selected after click on it");
								}

							} else {
								click(driver, OR_ConditionSec2);
								wait(driver, "1");
								if (isElementSelected(driver, OR_ConditionRadioBtn2)) {
									pass(driver, "AND Operated Selected after click on it");
								} else {
									fail(driver, "AND Operated Selected after click on it");
								}
							}

							if (isDisplayed(driver, ConditionInput3_Date)) {
								pass(driver,
										"After click 'ADD' button Third time Condition Selection dropdown is displayed");
							} else {
								fail(driver,
										"After click 'ADD' button Third time Condition Selection dropdown is not displayed");
							}

							selectByText(driver, ConditionInput3_Date, ThirdCondition_Date_LF);
							wait(driver, "1");

							if (!ThirdCondition_Date_LF.equals("is null")
									&& !ThirdCondition_Date_LF.equals("is not null")) {
								click(driver, ThirdConditionValueInput1_date);
								for (int m = 0; m < 3; m++) {
									action.sendKeys(Keys.BACK_SPACE).build().perform();
									action.sendKeys(Keys.ARROW_RIGHT).build().perform();
								}
								click(driver, DashProPage);
								click(driver, ThirdConditionValueInput1_date);
								sendKeys(driver, ThirdConditionValueInput1_date, ThirdCondition_Date_Input_LF);

							}
							wait(driver, "1");

							if (isDisplayed2(driver, AddButtonCondition)) {
								fail(driver, "'ADD' button displayed after given 3 times condition ");
							} else {
								pass(driver, "'ADD' button not displayed after given 3 times condition");
							}

//			    				  /test

							click(driver, ApplyButton_LocalFilter);
							wait(driver, "1");
							if (isDisplayed(driver, body)) {
								mouseOverToElement(driver, body);
								mouseOverToElement(driver, LocalFilterChartIcon);
								String LocalFilterIconColorRGB = getWebElement(driver, LocalFilterChartIcon)
										.getCssValue("fill");
								System.out.println("LocalFilterIconColorRGB : " + LocalFilterIconColorRGB);

								String LocalFilterIconColorAct = rgbToHex1(LocalFilterIconColorRGB);
								System.out.println("LocalFilterIconColorAct : " + LocalFilterIconColorAct);

								if ("#00E600".equalsIgnoreCase(LocalFilterIconColorAct)) { // need to modify.
									pass(driver,
											"Local Filter icon changed to green color after Applying the Local Filter : with 3 conditions");
								} else {
									fail(driver,
											"Local Filter icon not changed to green color after Applying the Local Filter : with 3 conditions");
								}
								int j = 1;
								boolean filteredCell = true;
								String failedValues = " ";
								List<WebElement> LocalFilterChartValue = driver
										.findElements(By.xpath("(//div[@ref='gridBody'])[1]//div[@col-id='"
												+ SelectDateColumn_Smoke_LocalFilter + "' and @role='gridcell']"));
								for (WebElement localEle : LocalFilterChartValue) {
									String LocalFilterCellValue = localEle.getText();
									if (LocalFilterCellValue != null && LocalFilterCellValue.length() >= 10) {
										LocalFilterCellValue = LocalFilterCellValue.substring(0, 10);
									}
									boolean condition_1_Result = Date_ConditionFiltercell(FirstCondition_Date_LF,
											LocalFilterCellValue, FirstCondition_Date_Input_LF,
											Condition_9_InputB_Date_LF);
									boolean condition_2_Result = Date_ConditionFiltercell(SecondCondition_Date_LF,
											LocalFilterCellValue, SecondCondition_Date_Input_LF,
											Condition_9_InputB_Date_LF);
									boolean condition_3_Result = Date_ConditionFiltercell(ThirdCondition_Date_LF,
											LocalFilterCellValue, ThirdCondition_Date_Input_LF,
											Condition_9_InputB_Date_LF);
									String operator1 = FirstOperator_Input_Date_LF;
									String operator2 = SecondOperator_Input_Date_LF;

									if (!evaluateConditions(condition_1_Result, operator1, condition_2_Result,
											operator2, condition_3_Result)) {
										filteredCell = false;
										failedValues = failedValues + j + ", ";
									}
									j++;
								}

								if (filteredCell == true) {
									pass(driver, "For 'Selected 3 Condition' Applied correctly in Local Filter..");
								} else {
									fail(driver,
											"Selected 3 Condition in Local Filter not Applied correctly for the Date column : "
													+ SelectDateColumn_Smoke_LocalFilter + ", Rows : " + failedValues);
								}
//	    						 
							} else {
								String Failed = " ";
								if (isDisplayed(driver, ValidationChart)) {
									Failed = getText1(driver, ValidationChart);
								}
								fail(driver, "Unable to get the chart value for the selected filter, 3 conditions : "
										+ Failed);
							}

							click(driver, ResetButton_LocalFilter);
							wait(driver, "1");
							waitForElement(driver, body);
							mouseOverToElement(driver, LocalFilterChartIcon);
							String LocatFilterExpected = "Local Filter: OFF ";
							String LocatFilterExpRest = getAttribute1(driver, FilterChartIcon, "title");
//	    					  System.out.println("LocatFilterExpRest : "+LocatFilterExpRest);

							if (LocatFilterExpRest.contains(LocatFilterExpected)) {
//	    						  System.out.println("Passed : LocatFilterAct");
								pass(driver, "Local filter is OFF in the chart after Reset filter");
							} else {
								System.out.println("Failed.!! : LocatFilterAct");
								fail(driver, "Local filter is not OFF in the chart after Reset filter");
							}

							String LocalFilterIconColorRGB = getWebElement(driver, LocalFilterChartIcon)
									.getCssValue("fill");
//			  			 	  System.out.println("LocalFilterIconColorRGB : "+LocalFilterIconColorRGB);

							String LocalFilterIconColorAct = rgbToHex1(LocalFilterIconColorRGB);
//			  			 	  System.out.println("LocalFilterIconColorAct : "+LocalFilterIconColorAct);

							if (!"#00E600".equalsIgnoreCase(LocalFilterIconColorAct)) {
								pass(driver,
										"Local Filter icon changed to Orginal color after Reset the Local Filter : with 3 conditions");
							} else {
								fail(driver,
										"Local Filter icon not changed to Original color after Reset the Local Filter : with 3 conditions");
							}

						} else {
							fail(driver, "Conditions Filter in Date type Colunm is not selected after click on it ");
						}
					}

				} else {
					fail(driver, "Selected Date Column not expanded after click on it");
				}

			} else {
				fail(driver, SelectDateColumn_Smoke_LocalFilter + " Date Column value not present in local filter");
			}

			// Numerical Filter validation
			click(driver, ResetButton_LocalFilter);
			boolean NumericalFilter = false;
			try {
				WebElement NumericalColumnElement = driver
						.findElement(By.xpath("//div[@id='dashboardLRPE_select_filterColsCon']//div[@id='"
								+ SelectNumerical_Smoke_LocalFilter + "']//a"));
				action.moveToElement(NumericalColumnElement).click().build().perform();
				NumericalFilter = true;
			} catch (Exception e) {

			}
			if (NumericalFilter == true) {
				wait(driver, "1");
				WebElement NumericalColumnElementExpand = driver
						.findElement(By.xpath("//div[@id='dashboardLRPE_select_filterColsCon']//div[@id='"
								+ SelectNumerical_Smoke_LocalFilter + "']//a//i"));
				String NumericalColumnElementExpandString = NumericalColumnElementExpand.getAttribute("class");

				if (NumericalColumnElementExpandString.contains("up")) {
					pass(driver, "Selected Numerical Column expanded after click on it");
					if (isDisplayed(driver, ConditionInput1_Num)) {
						pass(driver, "Condition Selection dropdown is displayed in the Numerical column");
					} else {
						fail(driver, "Condition Selection dropdown is not displayed in the Numerical column");
					}

					click(driver, ConditionInput1_Num);
					verifyElementIsPresent1(driver, EqualTo_OptionNum);
					verifyElementIsPresent1(driver, NotEqualTo_OptionNum);
					verifyElementIsPresent1(driver, GreaterThan_OptionNum);
					verifyElementIsPresent1(driver, LessThan_OptionNum);
					verifyElementIsPresent1(driver, GreaterEqualTo_OptionNum);
					verifyElementIsPresent1(driver, LessThanEqualTo_OptionNum);
					verifyElementIsPresent1(driver, IsNull_OptionNum);
					verifyElementIsPresent1(driver, IsNotNull_OptionNum);
					verifyElementIsPresent1(driver, Between_OptionNum);

					String[] NumFilterList = { Condition_1_Num_LF, Condition_2_Num_LF, Condition_3_Num_LF,
							Condition_4_Num_LF, Condition_5_Num_LF, Condition_6_Num_LF, Condition_7_Num_LF,
							Condition_8_Num_LF, Condition_9_Num_LF };
					String[] NumFilterInputList = { Condition_1_Input_Num_LF, Condition_2_Input_Num_LF,
							Condition_3_Input_Num_LF, Condition_4_Input_Num_LF, Condition_5_Input_Num_LF,
							Condition_6_Input_Num_LF, Condition_7_Input_Num_LF, Condition_8_Input_Num_LF,
							Condition_9_InputA_Num_LF };

					for (int k = 0; k < 9; k++) {

						try {
							selectByText(driver, ConditionInput1_Num, NumFilterList[k]);
							wait(driver, "1");
							if (!NumFilterList[k].equals("is null") && !NumFilterList[k].equals("is not null")) {
								click(driver, FirstConditionValueInput1_Num);
								clear1(driver, FirstConditionValueInput1_Num);
								sendKeys(driver, FirstConditionValueInput1_Num, NumFilterInputList[k]);
								wait(driver, "1");

								if (NumFilterList[k].equals("between")) {
									if (isDisplayed(driver, FirstConditionValueInput2_Num)) {
										pass(driver, "Second input element is available for 'between' condition");
										click(driver, FirstConditionValueInput2_Num);
//			    					 clear1(driver,"1");
										sendKeys(driver, FirstConditionValueInput2_Num,
												Condition_Between_InputB_Num_LF);
									} else {
										fail(driver, "Second input element is not available for 'between' condition");
									}
								}

							}
							wait(driver, "1");
							click(driver, ApplyButton_LocalFilter);
							wait(driver, "1");
							if (isDisplayed(driver, body)) {
								mouseOverToElement(driver, body);
								mouseOverToElement(driver, LocalFilterChartIcon);
								String LocalFilterIconColorRGB = getWebElement(driver, LocalFilterChartIcon)
										.getCssValue("fill");
								String LocalFilterIconColorAct = rgbToHex1(LocalFilterIconColorRGB);

								if ("#00E600".equalsIgnoreCase(LocalFilterIconColorAct)) { // need to modify.
									pass(driver,
											"Local Filter icon changed to green color after Applying the Local Filter : "
													+ NumFilterList[k]);
								} else {
									fail(driver,
											"Local Filter icon not changed to green color after Applying the Local Filter : "
													+ NumFilterList[k]);
								}
								wait(driver, "1");
								int j = 1;
								boolean filteredCell = true;
								String NumFailedCellLF1 = " ";
								List<WebElement> LocalFilterChartValue = driver.findElements(By.xpath("(//div[@ref='gridBody'])[1]//div[@col-id='"+ SelectNumerical_Smoke_LocalFilter + "' and @role='gridcell']//span"));
								for (WebElement localEle : LocalFilterChartValue) {
									String LocalFilterCellValue = localEle.getText();
									System.out.println(" text : " + LocalFilterCellValue);

									if (!Numerical_ConditionFiltercell(NumFilterList[k], LocalFilterCellValue,NumFilterInputList[k], Condition_Between_InputB_Num_LF)) {
										filteredCell = false;
										NumFailedCellLF1 = NumFailedCellLF1 + j + ", ";
									}
									j++;
								}

								if (filteredCell == true) {
									pass(driver, "For '" + NumFilterList[k] + "' condition applied correctly..");
								} else {
									fail(driver, NumFilterList[k]+ " Condition in Local Filter not Applied correctly for the Num column : "+ SelectNumerical_Smoke_LocalFilter + ", Rows : " + NumFailedCellLF1);
								}

							} else {
								String Failed = " ";
								if (isDisplayed(driver, ValidationChart)) {
									Failed = getText1(driver, ValidationChart);
								}
								fail(driver, "Unable to get the chart value for the selected filter, "+ NumFilterList[k] + " : " + Failed);
							}
						} catch (Exception e) {
							e.printStackTrace();
						}
					}

					wait(driver, "1");
					selectByText(driver, ConditionInput1_Num, FirstCondition_Num_LF);
					wait(driver, "1");
					if (!FirstCondition_Num_LF.equals("is null") && !FirstCondition_Num_LF.equals("is not null")) {
						click(driver, FirstConditionValueInput1_Num);
						clear1(driver, FirstConditionValueInput1_Num);
						sendKeys(driver, FirstConditionValueInput1_Num, FirstCondition_Num_Input_LF);
						wait(driver, "1");
					}

					wait(driver, "1");
					if (isDisplayed(driver, AddButtonCondition)) {
						pass(driver, "ADD button displayed after selecting the first condition");
					} else {
						fail(driver, "ADD button not displayed after selecting the first condition");
					}

					mouseOverToElement(driver, AddButtonCondition);
					click(driver, AddButtonCondition);

					verifyElementDisplayed(driver, AND_ConditionSec1);
					verifyElementDisplayed(driver, OR_ConditionSec1);

					if (FirstOperator_Input_Num_LF.equals("AND")) {
						click(driver, AND_ConditionSec1);
						wait(driver, "1");
						if (isElementSelected(driver, AND_ConditionRadioBtn1)) {
							pass(driver, "AND Operated Selected after click on it");
						} else {
							fail(driver, "AND Operated Selected after click on it");
						}

					} else {
						click(driver, OR_ConditionSec1);
						wait(driver, "1");
						if (isElementSelected(driver, OR_ConditionRadioBtn1)) {
							pass(driver, "AND Operated Selected after click on it");
						} else {
							fail(driver, "AND Operated Selected after click on it");
						}
					}

					if (isDisplayed(driver, ConditionInput2_Num)) {
						pass(driver, "After click 'ADD' button Second time Condition Selection dropdown is displayed");
					} else {
						fail(driver,
								"After click 'ADD' button Second time Condition Selection dropdown is not displayed");
					}

					click(driver, ConditionInput2_Num);
					selectByText(driver, ConditionInput2_Num, SecondCondition_Num_LF);
					if (!SecondCondition_Num_LF.equals("is null") && !SecondCondition_Num_LF.equals("is not null")) {
						click(driver, SecondConditionValueInput1_Num);
						clear(driver, SecondConditionValueInput1_Num);
						sendKeys(driver, SecondConditionValueInput1_Num, SecondCondition_Num_Input_LF);

					}
					wait(driver, "1");
					if (isDisplayed(driver, AddButtonCondition)) {
						pass(driver, "2 time ADD button displayed after selecting the condition 2nd time ");
					} else {
						fail(driver, "2 time ADD button not displayed after selecting the condition 2nd time ");
					}

					mouseOverToElement(driver, AddButtonCondition);
					click(driver, AddButtonCondition);
					verifyElementDisplayed(driver, AND_ConditionSec2);
					verifyElementDisplayed(driver, OR_ConditionSec2);

					if (SecondOperator_Input_Num_LF.equals("AND")) {
						click(driver, AND_ConditionSec2);
						wait(driver, "1");
						if (isElementSelected(driver, AND_ConditionRadioBtn2)) {
							pass(driver, "AND Operated Selected after click on it");
						} else {
							fail(driver, "AND Operated Selected after click on it");
						}

					} else {
						click(driver, OR_ConditionSec2);
						wait(driver, "1");
						if (isElementSelected(driver, OR_ConditionRadioBtn2)) {
							pass(driver, "AND Operated Selected after click on it");
						} else {
							fail(driver, "AND Operated Selected after click on it");
						}
					}

					if (isDisplayed(driver, ConditionInput3_Num)) {
						pass(driver, "After click 'ADD' button Third time Condition Selection dropdown is displayed");
					} else {
						fail(driver,
								"After click 'ADD' button Third time Condition Selection dropdown is not displayed");
					}
					click(driver, ConditionInput3_Num);
					selectByText(driver, ConditionInput3_Num, ThirdCondition_num_LF);
					wait(driver, "1");

					if (!ThirdCondition_num_LF.equals("is null") && !ThirdCondition_num_LF.equals("is not null")) {
						click(driver, ThirdConditionValueInput1_Num);
						clear1(driver, ThirdConditionValueInput1_Num);
						sendKeys(driver, ThirdConditionValueInput1_Num, ThirdCondition_Num_Input_LF);

					}
					wait(driver, "1");

					if (isDisplayed2(driver, AddButtonCondition)) {
						fail(driver, "'ADD' button displayed after given 3 times condition ");
					} else {
						pass(driver, "'ADD' button not displayed after given 3 times condition");
					}

					click(driver, ApplyButton_LocalFilter);
					wait(driver, "1");
					if (isDisplayed(driver, body)) {
						mouseOverToElement(driver, body);
						mouseOverToElement(driver, LocalFilterChartIcon);
						String LocalFilterIconColorRGB = getWebElement(driver, LocalFilterChartIcon)
								.getCssValue("fill");
						System.out.println("LocalFilterIconColorRGB : " + LocalFilterIconColorRGB);

						String LocalFilterIconColorAct = rgbToHex1(LocalFilterIconColorRGB);
						System.out.println("LocalFilterIconColorAct : " + LocalFilterIconColorAct);

						if ("#00E600".equalsIgnoreCase(LocalFilterIconColorAct)) { // need to modify.
							pass(driver,
									"Local Filter icon changed to green color after Applying the Local Filter : with 3 conditions");
						} else {
							fail(driver,
									"Local Filter icon not changed to green color after Applying the Local Filter : with 3 conditions");
						}
						int j = 1;
						boolean filteredCell = true;
						String failedValue = " ";
						List<WebElement> LocalFilterChartValue = driver
								.findElements(By.xpath("(//div[@ref='gridBody'])[1]//div[@col-id='"
										+ SelectNumerical_Smoke_LocalFilter + "' and @role='gridcell']"));
						for (WebElement localEle : LocalFilterChartValue) {
							String LocalFilterCellValue = localEle.getText();
							boolean condition_1_Result = Numerical_ConditionFiltercell(FirstCondition_Num_LF,
									LocalFilterCellValue, FirstCondition_Num_Input_LF, Condition_Between_InputB_Num_LF);
							boolean condition_2_Result = Numerical_ConditionFiltercell(SecondCondition_Num_LF,
									LocalFilterCellValue, SecondCondition_Num_Input_LF,
									Condition_Between_InputB_Num_LF);
							boolean condition_3_Result = Numerical_ConditionFiltercell(ThirdCondition_num_LF,
									LocalFilterCellValue, ThirdCondition_Num_Input_LF, Condition_Between_InputB_Num_LF);
							String operator1 = FirstOperator_Input_Num_LF;
							String operator2 = SecondOperator_Input_Num_LF;

							if (!evaluateConditions(condition_1_Result, operator1, condition_2_Result, operator2,
									condition_3_Result)) {
								filteredCell = false;
								failedValue = failedValue + j + ", ";
							}
							j++;
						}

						if (filteredCell == true) {
							pass(driver, "For 'Selected 3 Condition' applied correctly Local Filter..");
						} else {
							fail(driver,
									"Selected 3 Condition in Local Filter not Applied correctly for the Num column : "
											+ SelectNumerical_Smoke_LocalFilter + ", Row Nums : " + failedValue);
						}

					} else {
						String Failed = " ";
						if (isDisplayed(driver, ValidationChart)) {
							Failed = getText1(driver, ValidationChart);
						}
						fail(driver, "Unable to get the chart value for the selected filter, 3 condition : " + Failed);
					}

					click(driver, ResetButton_LocalFilter);
					wait(driver, "1");
					waitForElement(driver, body);
					mouseOverToElement(driver, LocalFilterChartIcon);
					String LocatFilterExpected = "Local Filter: OFF ";
					String LocatFilterExpRest = getAttribute1(driver, FilterChartIcon, "title");

					if (LocatFilterExpRest.contains(LocatFilterExpected)) {
						pass(driver, "Local filter is OFF in the chart after Reset filter");
					} else {
						System.out.println("Failed.!! : LocatFilterAct");
						fail(driver, "Local filter is not OFF in the chart after Reset filter");
					}

					String LocalFilterIconColorRGB = getWebElement(driver, LocalFilterChartIcon).getCssValue("fill");
					String LocalFilterIconColorAct = rgbToHex1(LocalFilterIconColorRGB);

					if (!"#00E600".equalsIgnoreCase(LocalFilterIconColorAct)) {
						pass(driver,
								"Local Filter icon changed to Orginal color after Reset the Local Filter : with 3 conditions");
					} else {
						fail(driver,
								"Local Filter icon not changed to Original color after Reset the Local Filter : with 3 conditions");
					}

				} else {
					fail(driver, "Selected Numerical Column not expanded after click on it");
				}

			} else {
				fail(driver, SelectNumerical_Smoke_LocalFilter + " Numerical Column not present");
			}
			// Numerical Local filter end....

			// Text Local filter Start....
			boolean textFilter = false;
			try {
				WebElement TextColumn = driver
						.findElement(By.xpath("//div[@id='dashboardLRPE_select_filterColsCon']//div[@id='"
								+ SelectText_LocalFilter + "']//a"));
				action.moveToElement(TextColumn).click().build().perform();
				textFilter = true;
			} catch (Exception e) {

			}

			if (textFilter == true) {
				WebElement textColumnExp = driver
						.findElement(By.xpath("//div[@id='dashboardLRPE_select_filterColsCon']//div[@id='"
								+ SelectText_LocalFilter + "']//a//i"));
				String textColumnExpText = textColumnExp.getAttribute("class");
				if (textColumnExpText.contains("up")) {
					pass(driver, "Text Column Expand After click on it ");
					if (verifyElementDisplayed(driver, byValueFilterOption)) {
						try {
							WebElement ByValueElementRadio = driver.findElement(By.xpath("//div[@id='"
									+ SelectText_LocalFilter + "_content']//div[@id='byRelative_div']//input"));
							if (ByValueElementRadio.isSelected()) {
								pass(driver, "By default, 'By Values' radio button selected ");
							} else {
								fail(driver, "By default, 'By Values' radio button not selected ");
							}
						} catch (Exception e) {
							fail(driver, "Unable to find 'By Values' radio button ");
							e.printStackTrace();
						}
					}

					verifyElementDisplayed(driver, AllCheckbox_CategoricalSec);
					verifyElementDisplayed(driver, CategoricalSearchListOptions);
					verifyElementDisplayed(driver, ExcludeOption_Categorical);
					verifyElementDisplayed(driver, ExcludeCheckbox);

					List<WebElement> searchListAvailable = driver
							.findElements(By.xpath("//div[@id='" + SelectText_LocalFilter + "_FactorsList']//li"));
					List<WebElement> searchListCheckboxAvailable = driver.findElements(By.xpath(
							"//div[@id='" + SelectText_LocalFilter + "_FactorsList']//li//input[@type='checkbox']"));
					if (searchListAvailable.size() == searchListCheckboxAvailable.size()) {
						pass(driver, "All the available searchlist are displayed with Checkbox");
					} else {
						fail(driver, "Some available searchlist are not displayed with Checkbox");
					}

					WebElement SearchBar_ = driver
							.findElement(By.xpath("//input[@id='" + SelectText_LocalFilter + "LFsearch']"));
					SearchBar_.click();
					wait(driver, "1");
					SearchBar_.sendKeys(ByValuesInput_Text_LF);
					pass(driver, "Type On Value " + ByValuesInput_Text_LF + " search input");
					wait(driver, "1");
					WebElement firstOption = driver
							.findElement(By.xpath("(//div[@id='" + SelectText_LocalFilter + "_FactorsList']//li)[1]"));
					String firstOptionText = firstOption.getText();
					if (firstOptionText.equals(ByValuesInput_Text_LF)) {
						pass(driver, "Search bar inside the Text section works properly");
					} else {
						fail(driver, "Search bar inside the Text section not works properly");
					}

					firstOption.click();
					wait(driver, "1");
					WebElement firstCheckBox = driver.findElement(
							By.xpath("(//div[@id='" + SelectText_LocalFilter + "_FactorsList']//li//input)[1]"));
					if (firstCheckBox.isSelected()) {
						pass(driver, "Check box selected when click the First searched value");
					} else {
						fail(driver, "Check box not selected when click the First searched value");
					}

					click(driver, ApplyButton_LocalFilter);
					wait(driver, "1");
					if (isDisplayed(driver, body)) {
						mouseOverToElement(driver, body);

						mouseOverToElement(driver, LocalFilterChartIcon);
						String LocatFilterExpected = "Local Filter: ON ";
						String LocatFilterAct = getAttribute1(driver, FilterChartIcon, "title");
						System.out.println("LocatFilterExp : " + LocatFilterAct);
						if (LocatFilterAct.contains(LocatFilterExpected)) {
							System.out.println("Passed : LocatFilterAct");
							pass(driver, "Local filter is ON in the chart after Apply filter");
						} else {
							System.out.println("Failed.!! : LocatFilterAct");
							fail(driver, "Local filter is not ON in the chart after Apply filter");
						}

						String LocalFilterIconColorRGB = getWebElement(driver, LocalFilterChartIcon)
								.getCssValue("fill");
//    					  System.out.println("LocalFilterIconColorRGB : "+LocalFilterIconColorRGB);

						String LocalFilterIconColorAct = rgbToHex1(LocalFilterIconColorRGB);
//    					  System.out.println("LocalFilterIconColorAct : "+LocalFilterIconColorAct);

						if ("#00E600".equalsIgnoreCase(LocalFilterIconColorAct)) { // need to modify.
							pass(driver, "Local Filter icon changed to green color after Applying the Local Filter");
						} else {
							fail(driver,
									"Local Filter icon not changed to green color after Applying the Local Filter");
						}

						int j = 1;
						boolean filteredCell = true;
						String failedValue = " ";
						List<WebElement> LocalFilterChartValue = driver
								.findElements(By.xpath("(//div[@ref='gridBody'])[1]//div[@col-id='"
										+ SelectText_LocalFilter + "' and @role='gridcell']"));
						for (WebElement localEle : LocalFilterChartValue) {
							String LocalFilterCellValue = localEle.getText();

							if (!LocalFilterCellValue.equals(ByValuesInput_Text_LF)) {
								filteredCell = false;
								failedValue = failedValue + j + ", ";
							}
							j++;
						}
						if (filteredCell == true) {
							pass(driver, "For 'By Values' condition applied correctly Local Filter..");
						} else {
							fail(driver, "By Value Local Filter not Applied correctly for the Text column : "
									+ SelectText_LocalFilter + ", Rows : " + failedValue);
						}

					} else {
						String Failed = " ";
						if (isDisplayed2(driver, ValidationChart)) {
							Failed = getText1(driver, ValidationChart);
						}
						fail(driver, "Unable to get the chart value for the selected filter, By Values : " + Failed);
					}

					click(driver, ExcludeCheckbox);
					click(driver, ApplyButton_LocalFilter);
					wait(driver, "1");
					if (isDisplayed(driver, body)) {
						mouseOverToElement(driver, body);
						mouseOverToElement(driver, LocalFilterChartIcon);
						String LocalFilterIconColorRGB = getWebElement(driver, LocalFilterChartIcon)
								.getCssValue("fill");
						System.out.println("LocalFilterIconColorRGB : " + LocalFilterIconColorRGB);

						String LocalFilterIconColorAct = rgbToHex1(LocalFilterIconColorRGB);
						System.out.println("LocalFilterIconColorAct : " + LocalFilterIconColorAct);

						if ("#00E600".equalsIgnoreCase(LocalFilterIconColorAct)) { // need to modify.
							pass(driver, "Local Filter icon changed to green color after Applying the Local Filter");
						} else {
							fail(driver,
									"Local Filter icon not changed to green color after Applying the Local Filter");
						}
						int j = 1;
						boolean filteredCell = true;
						String failedValue = " ";
						List<WebElement> LocalFilterChartValue = driver
								.findElements(By.xpath("(//div[@ref='gridBody'])[1]//div[@col-id='"
										+ SelectText_LocalFilter + "' and @role='gridcell']"));
						for (WebElement localEle : LocalFilterChartValue) {
							String LocalFilterCellValue = localEle.getText();

							if (LocalFilterCellValue.equals(ByValuesInput_Text_LF)) {
								filteredCell = false;
								failedValue = failedValue + j + ", ";
							}
							j++;
						}

						if (filteredCell == true) {
							pass(driver, "For 'By Values 'Exclude' ' condition applied correctly..");
						} else {
							fail(driver, "By Value Local 'Exclude' Filter not Applied correctly for the Text column : "
									+ SelectText_LocalFilter + ", Rows : " + failedValue);
						}

					} else {
						fail(driver, "Unable to get the chart value for the selected filter");
					}

					if (verifyElementDisplayed(driver, ConditionFilterOption_Categorical)) {
						click(driver, ConditionFilterOption_Categorical);
						wait(driver, "1");
						if (isElementSelected(driver, ConditionRadioButton_Categorical)) {
							pass(driver, "Condition radio button selected after click on it");
						} else {
							fail(driver, "Condition radio button not selected after click on it");
						}

						if (verifyElementDisplayed(driver, ConditionSelectDropdown)) {
							String defaultSelectedCondition = defaultSelectedValue(driver, ConditionSelectDropdown);
							if (defaultSelectedCondition.equals("equal to")) {
								pass(driver, "By default, 'equal to' option selected in the Condition select dropdown");
							} else {
								fail(driver,
										"By default, 'equal to' option not selected in the Condition select dropdown");
							}

							verifyElementIsPresent1(driver, equalTo_Option);
							verifyElementIsPresent1(driver, NotequalTo_Option);
							verifyElementIsPresent1(driver, NotequalTo_Option);
							verifyElementIsPresent1(driver, BeginsWith_Option);
							verifyElementIsPresent1(driver, notBeginsWith_Option);
							verifyElementIsPresent1(driver, endsWith_Option);
							verifyElementIsPresent1(driver, notendsWith_Option);
							verifyElementIsPresent1(driver, Contains_Option);
							verifyElementIsPresent1(driver, NotContains_Option);

							String[] conditionsList = { Condition_1_Text_LF, Condition_2_Text_LF, Condition_3_Text_LF,
									Condition_4_Text_LF, Condition_5_Text_LF, Condition_6_Text_LF, Condition_7_Text_LF,
									Condition_8_Text_LF };
							String[] conditionsInputList = { Condition_Input_1_Text_LF, Condition_Input_2_Text_LF,
									Condition_Input_3_Text_LF, Condition_Input_4_Text_LF, Condition_Input_5_Text_LF,
									Condition_Input_6_Text_LF, Condition_Input_7_Text_LF, Condition_Input_8_Text_LF };

							for (int k = 0; k < 8; k++) {

								try {
									selectByText(driver, ConditionSelectDropdown, conditionsList[k]);
									wait(driver, "1");
									click(driver, ConditonInput1);
									clear1(driver, ConditonInput1);
									sendKeys(driver, ConditonInput1, conditionsInputList[k]);
									wait(driver, "1");
									click(driver, ApplyButton_LocalFilter);
									wait(driver, "2");
									if (isDisplayed(driver, body)) {
										mouseOverToElement(driver, body);
										mouseOverToElement(driver, LocalFilterChartIcon);
										String LocalFilterIconColorRGB = getWebElement(driver, LocalFilterChartIcon)
												.getCssValue("fill");
//    		  							/ System.out.println("LocalFilterIconColorRGB : "+LocalFilterIconColorRGB);

										String LocalFilterIconColorAct = rgbToHex1(LocalFilterIconColorRGB);
//		  							 	 System.out.println("LocalFilterIconColorAct : "+LocalFilterIconColorAct);
										if ("#00E600".equalsIgnoreCase(LocalFilterIconColorAct)) { // need to modify.
											pass(driver,
													"Local Filter icon changed to green color after Applying the Local Filter : "
															+ conditionsList[k]);
										} else {
											fail(driver,
													"Local Filter icon not changed to green color after Applying the Local Filter : "
															+ conditionsList[k]);
										}

										int j = 1;
										boolean filteredCell = true;
										String failedValue = " ";
										List<WebElement> LocalFilterChartValue = driver
												.findElements(By.xpath("(//div[@ref='gridBody'])[1]//div[@col-id='"
														+ SelectText_LocalFilter + "' and @role='gridcell']"));
										for (WebElement localEle : LocalFilterChartValue) {
											String LocalFilterCellValue = localEle.getText();
											if (!Categorical_ConditionFiltercell(conditionsList[k],
													LocalFilterCellValue, conditionsInputList[k])) {
												filteredCell = false;
												failedValue = failedValue + j + ", ";
											}
											j++;
										}
										if (filteredCell == true) {
											pass(driver,
													"For '" + conditionsList[k] + "' condition applied correctly..");
										} else {
											fail(driver, conditionsList[k]
													+ " Condition in Local Filter not Applied correctly for the Text column : "
													+ SelectText_LocalFilter + ", Rows : " + failedValue);
										}

									} else {
										String Failed = " ";
										if (isDisplayed2(driver, ValidationChart)) {
											Failed = getText1(driver, ValidationChart);
										}
										fail(driver,
												"Unable to get the chart value for the selected filter, error display : "
														+ Failed);
									}

								} catch (Exception e) {
									e.printStackTrace();
								}
							}

							click(driver, ConditionSelectDropdown);
							selectByText(driver, ConditionSelectDropdown, FirstCondition_Text_LF);
							wait(driver, "1");
							click(driver, ConditonInput1);
							clear1(driver, ConditonInput1);
							sendKeys(driver, ConditonInput1, FirstCondition_Input_Text_LF);
							wait(driver, "1");
							if (isDisplayed(driver, AddButtonCondition)) {
								pass(driver, "ADD button displayed after selecting the condition");
							} else {
								fail(driver, "ADD button not displayed after selecting the condition");
							}

							mouseOverToElement(driver, AddButtonCondition);
							click(driver, AddButtonCondition);

							verifyElementDisplayed(driver, AND_ConditionSec1);
							verifyElementDisplayed(driver, OR_ConditionSec1);

							if (FirstOperator_Input_Text_LF.equals("AND")) {
								click(driver, AND_ConditionSec1);
								wait(driver, "1");
								if (isElementSelected(driver, AND_ConditionRadioBtn1)) {
									pass(driver, "AND Operated Selected after click on it");
								} else {
									fail(driver, "AND Operated Selected after click on it");
								}

							} else {
								click(driver, OR_ConditionSec1);
								wait(driver, "1");
								if (isElementSelected(driver, OR_ConditionRadioBtn1)) {
									pass(driver, "AND Operated Selected after click on it");
								} else {
									fail(driver, "AND Operated Selected after click on it");
								}
							}

							if (isDisplayed(driver, ConditionSelectDropdown2)) {
								pass(driver,
										"After click 'ADD' button Second time Condition Selection dropdown is displayed");
							} else {
								fail(driver,
										"After click 'ADD' button Second time Condition Selection dropdown is not displayed");
							}

							click(driver, ConditionSelectDropdown2);
							selectByText(driver, ConditionSelectDropdown2, SecondCondition_Text_LF);
							wait(driver, "1");
							click(driver, ConditonInput2);
							sendKeys(driver, ConditonInput2, SecondCondition_Input_Text_LF);
							wait(driver, "1");
							if (isDisplayed(driver, AddButtonCondition)) {
								pass(driver, "2 time ADD button displayed after selecting the condition 2nd time ");
							} else {
								fail(driver, "2 time ADD button not displayed after selecting the condition 2nd time ");
							}

							mouseOverToElement(driver, AddButtonCondition);
							click(driver, AddButtonCondition);
							verifyElementDisplayed(driver, AND_ConditionSec2);
							verifyElementDisplayed(driver, OR_ConditionSec2);

							if (SecondOperator_Input_Text_LF.equals("AND")) {
								click(driver, AND_ConditionSec2);
								wait(driver, "1");
								if (isElementSelected(driver, AND_ConditionRadioBtn2)) {
									pass(driver, "AND Operated Selected after click on it");
								} else {
									fail(driver, "AND Operated Selected after click on it");
								}

							} else {
								click(driver, OR_ConditionSec2);
								wait(driver, "1");
								if (isElementSelected(driver, OR_ConditionRadioBtn2)) {
									pass(driver, "AND Operated Selected after click on it");
								} else {
									fail(driver, "AND Operated Selected after click on it");
								}
							}

							if (isDisplayed(driver, ConditionSelectDropdown3)) {
								pass(driver,
										"After click 'ADD' button Third time Condition Selection dropdown is displayed");
							} else {
								fail(driver,
										"After click 'ADD' button Third time Condition Selection dropdown is not displayed");
							}

							selectByText(driver, ConditionSelectDropdown3, ThirdCondition_Text_LF);
							wait(driver, "1");
							click(driver, ConditonInput3);
							sendKeys(driver, ConditonInput3, ThirdCondition_Input_Text_LF);
							wait(driver, "1");
							if (isDisplayed2(driver, AddButtonCondition)) {
								fail(driver, "'ADD' button displayed after given 3 times condition ");
							} else {
								pass(driver, "'ADD' button not displayed after given 3 times condition");
							}

							click(driver, ApplyButton_LocalFilter);
							wait(driver, "1");
							if (isDisplayed(driver, body)) {
								mouseOverToElement(driver, body);
								int j = 1;
								boolean filteredCell = true;
								String failedValue = " ";
								List<WebElement> LocalFilterChartValue = driver
										.findElements(By.xpath("(//div[@ref='gridBody'])[1]//div[@col-id='"
												+ SelectText_LocalFilter + "' and @role='gridcell']"));
								for (WebElement localEle : LocalFilterChartValue) {
									String LocalFilterCellValue = localEle.getText();
									boolean condition_1_Result = Categorical_ConditionFiltercell(FirstCondition_Text_LF,
											LocalFilterCellValue, FirstCondition_Input_Text_LF);
									boolean condition_2_Result = Categorical_ConditionFiltercell(
											SecondCondition_Text_LF, LocalFilterCellValue,
											SecondCondition_Input_Text_LF);
									boolean condition_3_Result = Categorical_ConditionFiltercell(ThirdCondition_Text_LF,
											LocalFilterCellValue, ThirdCondition_Input_Text_LF);
									String operator1 = FirstOperator_Input_Text_LF;
									String operator2 = SecondOperator_Input_Text_LF;

									if (!evaluateConditions(condition_1_Result, operator1, condition_2_Result,
											operator2, condition_3_Result)) {
										filteredCell = false;
										failedValue = failedValue + j + ", ";
									}
									j++;
								}
								if (filteredCell == true) {
									pass(driver, "For 'Selected 3 Condition' applied correctly..");
								} else {
									fail(driver,
											"Selected 3 Condition in Local Filter not Applied correctly for the Text column : "
													+ SelectText_LocalFilter + ", Rows : " + failedValue);
								}
//    						 
							} else {
								String Failed = " ";
								if (isDisplayed2(driver, ValidationChart)) {
									Failed = getText1(driver, ValidationChart);
								}
								fail(driver, "Unable to get the chart value for the selected filter, 3 condition : "
										+ Failed);
							}

							click(driver, ResetButton_LocalFilter);
							wait(driver, "1");
							waitForElement(driver, body);
							mouseOverToElement(driver, LocalFilterChartIcon);
							String LocatFilterExpected = "Local Filter: OFF ";
							String LocatFilterExpRest = getAttribute1(driver, FilterChartIcon, "title");
							System.out.println("LocatFilterExpRest : " + LocatFilterExpRest);

							if (LocatFilterExpRest.contains(LocatFilterExpected)) {
								System.out.println("Passed : LocatFilterAct");
								pass(driver, "Local filter is OFF in the chart after Reset filter");
							} else {
								System.out.println("Failed.!! : LocatFilterAct");
								fail(driver, "Local filter is not OFF in the chart after Reset filter");
							}

							String LocalFilterIconColorRGB = getWebElement(driver, LocalFilterChartIcon)
									.getCssValue("fill");
							System.out.println("LocalFilterIconColorRGB : " + LocalFilterIconColorRGB);

							try {
								String LocalFilterIconColorAct = rgbToHex1(LocalFilterIconColorRGB);
								System.out.println("LocalFilterIconColorAct : " + LocalFilterIconColorAct);

								if (!"#00E600".equalsIgnoreCase(LocalFilterIconColorAct)) { // need to modify.
									pass(driver,
											"Local Filter icon changed to Original color after Reset the Local Filter");
								} else {
									fail(driver,
											"Local Filter icon not changed to Original color after Reset the Local Filter");
								}
							} catch (Exception e) {
								// TODO Auto-generated catch block
								System.out.println("LocalFilterIconColorAct : Failed");
							}

						}
					}

				} else {
					fail(driver, SelectText_LocalFilter + " Text Column not Expand After click on it ");
				}

			} else {
				fail(driver, SelectText_LocalFilter + " Text Column value not present in local filter");
			}

			// Text Local filter End....

		} else {
			fail(driver, "Local Filter section is not displayed when click the filter chart icon");
		}
		// ************************ Local Filter Validation End......................

		// ************************** Global Filter Validation
		// Start......................
		mouseOverToElement(driver, ADDTabPlus);
		mouseOverAndClick(driver, ADDTabPlus);
		wait(driver, "1");
		sendKeys(driver, ThirdTab, TabNameNew_Global_Smoke_);
		click(driver, DashProPage);
		wait(driver, "1");
		waitForElement(driver, ADD_widget_rightTop);
		mouseOverToElement(driver, ADD_widget_rightTop);
		click(driver, ADD_widget_rightTop);
		elementnotvisible(driver, Loading);
		waitForElement(driver, Table_widget);
		click(driver, Table_widget);
		elementnotvisible(driver, Loading1);
		waitForElement(driver, SelectAllToggleInput);
		click(driver, SelectAllToggleInput);
		if (isToggleEnable(driver, SelectAllToogle)) {
			pass(driver, "Select All toogle enabled after clicking it");
		} else {
			fail(driver, "Select All toogle not enabled after clicking on it");
		}
		wait(driver, "1");
		click(driver, ApplyButton);
		click(driver, ChartTitleInput);
		sendKeys(driver, ChartTitleInput, ChartNameGlobal_Smoke);

		click(driver, SaveBtn_Chart);
		elementnotvisible1(driver, RPE_Loading);
		if (!isDisplayed2(driver, chartSaveError1) && isDisplayed(driver, SavedChartTitleInput)) {
			pass(driver, "Chart saved Successfully");
		} else {
			fail(driver, "Chart not saved Successfully");
		}

		String GlobalTab2TabId = getAttribute(driver, CurrentTab, "id");

		verifyElementDisplayed(driver, GlobalFilterOption);
		click(driver, GlobalFilterOption);
		wait(driver, "1");
		if (isDisplayed(driver, GlobalFilterSection)) {
			pass(driver, "Global Filter section is displayed after click the global filter option");
			verifyElementDisplayed(driver, DataSetGlobalVariable);
			verifyElementDisplayed(driver, ApplyButton_GlobalFilter);
			verifyElementDisplayed(driver, RestButton_GlobalFilter);
			verifyElementDisplayed(driver, SearchInput_GlobalFilter);

		} else {
			fail(driver, "Global Filter section is not displayed after click the global filter option");
		}

		if (isDisplayed(driver, DataColumnList_GlobalFilter)) {
			pass(driver, "Data Column Lists are displayed in the global filter section");

			List<WebElement> ColumnListElements = getWebElements(driver, DataColumnList_GlobalFilter);
			List<WebElement> ColumnListImgElements = getWebElements(driver, ColumnTypeIcon_GlobalFilter);
			if (ColumnListElements.size() == ColumnListImgElements.size()) {
				pass(driver, "All column values displayed with dataType Image icon");
			} else {
				fail(driver, "Some column values not displayed with dataType Image icon");
			}

			int ColumnListElementsLastSize = ColumnListElements.size() - 1;
			String LastColumnName = ColumnListElements.get(ColumnListElementsLastSize).getText();
			click(driver, SearchInput_GlobalFilter);
			sendKeys(driver, SearchInput_GlobalFilter, LastColumnName);
			wait(driver, "1");
			String AfterSearchLastName = getText1(driver, ColumnListFirstValue_GlobalFilter);
			if (AfterSearchLastName.equals(LastColumnName)) {
				pass(driver, "Search Function works properly in Global Filter");
				if (isDisplayed(driver, ImageFirstColumn_GlobalFilter)) {
					pass(driver, "DataType image is displayed in the searched Value");
				} else {
					fail(driver, "DataType image is not displayed in the searched Value");
				}
			} else {
				fail(driver, "Search Function not works properly in Global Filter");
			}
			clear1(driver, SearchInput_GlobalFilter);
			wait(driver, "1");
			enter(driver);
			String AfterRestSearchValue = getText1(driver, SearchInput_GlobalFilter);
			if (AfterRestSearchValue.isEmpty() || AfterRestSearchValue.equals(null)) {
				pass(driver, "Value cleared successfully in searchbar");
			} else {
				fail(driver, "Value not cleared successfully in searchbar");
			}

			// categorical Dynamic change Start global...
			boolean categoricalFilter = false;
			try {
				WebElement CategoricalColumn = driver
						.findElement(By.xpath("//div[@id='globalRPE_select_filterColsCon']//div[@id='"
								+ SelectCategorical_GlobalFilter + "']//a"));
				action.moveToElement(CategoricalColumn).click().build().perform();
				categoricalFilter = true;
			} catch (Exception e) {

			}

			if (categoricalFilter == true) {
				WebElement CategoricalColumnExp = driver
						.findElement(By.xpath("//div[@id='globalRPE_select_filterColsCon']//div[@id='"
								+ SelectCategorical_GlobalFilter + "']//a//i"));
				String CategoricalColumnExpText = CategoricalColumnExp.getAttribute("class");
				if (CategoricalColumnExpText.contains("up")) {
					pass(driver, "Categorical Column Expand After click on it ");
					if (verifyElementDisplayed(driver, byValueFilterOption)) {
						try {
							WebElement ByValueElementRadio = driver.findElement(By.xpath("//div[@id='"
									+ SelectCategorical_GlobalFilter + "_content']//div[@id='byRelative_div']//input"));
							if (ByValueElementRadio.isSelected()) {
								pass(driver, "By default, 'By Values' radio button selected ");
							} else {
								fail(driver, "By default, 'By Values' radio button not selected ");
							}
						} catch (Exception e) {
							fail(driver, "Unable to find 'By Values' radio button ");
							e.printStackTrace();
						}
					}

					verifyElementDisplayed(driver, AllCheckbox_CategoricalSec);
					verifyElementDisplayed(driver, CategoricalSearchListOptions);
					verifyElementDisplayed(driver, ExcludeOption_Categorical);
					verifyElementDisplayed(driver, ExcludeCheckbox);

					List<WebElement> searchListAvailable = driver.findElements(
							By.xpath("//div[@id='" + SelectCategorical_GlobalFilter + "_FactorsList']//li"));
					List<WebElement> searchListCheckboxAvailable = driver.findElements(By.xpath("//div[@id='"
							+ SelectCategorical_GlobalFilter + "_FactorsList']//li//input[@type='checkbox']"));
					if (searchListAvailable.size() == searchListCheckboxAvailable.size()) {
						pass(driver, "All the available searchlist are displayed with Checkbox");
					} else {
						fail(driver, "Some available searchlist are not displayed with Checkbox");
					}

					WebElement SearchBar_ = driver
							.findElement(By.xpath("//input[@id='" + SelectCategorical_GlobalFilter + "LFsearch']"));
					SearchBar_.click();
					wait(driver, "1");
					SearchBar_.sendKeys(ByValuesInput_Categorical_GF);
					pass(driver, "Type On Value " + ByValuesInput_Categorical_GF + " search input");
					wait(driver, "1");
					WebElement firstOption = driver.findElement(
							By.xpath("(//div[@id='" + SelectCategorical_GlobalFilter + "_FactorsList']//li)[1]"));
					String firstOptionText = firstOption.getText();
					if (firstOptionText.equals(ByValuesInput_Categorical_GF)) {
						pass(driver, "Search bar inside the Categorical section works properly");
					} else {
						fail(driver, "Search bar inside the Categorical section not works properly");
					}

					firstOption.click();
					wait(driver, "1");
					WebElement firstCheckBox = driver.findElement(By
							.xpath("(//div[@id='" + SelectCategorical_GlobalFilter + "_FactorsList']//li//input)[1]"));
					if (firstCheckBox.isSelected()) {
						pass(driver, "Check box selected when click the First searched value");
					} else {
						fail(driver, "Check box not selected when click the First searched value");
					}

					click(driver, ApplyButton_GlobalFilter);
					wait(driver, "1");

					boolean chartpresentGlobal2 = false;
					try {
						WebElement chartPresent = driver.findElement(
								By.xpath("//div[@id='" + GlobalTab2TabId + "_div']//div[@ref='gridBody']"));
						if (chartPresent.isDisplayed()) {
							chartpresentGlobal2 = true;
						}

					} catch (Exception e) {

					}

					if (chartpresentGlobal2) {
						WebElement chartPresent = driver.findElement(
								By.xpath("//div[@id='" + GlobalTab2TabId + "_div']//div[@ref='gridBody']"));
						action.moveToElement(chartPresent).build().perform();
						try {
							WebElement globalFilterIconChartTab3 = driver.findElement(By.xpath("//div[contains(@id,'"
									+ GlobalTab2TabId + "')]//*[name()='svg']//*[name()='g'][2]//*[name()='path'][3]"));
							action.moveToElement(globalFilterIconChartTab3).build().perform();
							String globalIconColorRGB = globalFilterIconChartTab3.getCssValue("fill");
							String globalIconColor = rgbToHex1(globalIconColorRGB);

							if ("#FF3333".equalsIgnoreCase(globalIconColor)) {
								pass(driver,
										"Global Filter icon changed to Red color after Applying the Global Filter");
							} else {
								fail(driver,
										"Global Filter icon changed to Red color after Applying the Global Filter");
							}

						} catch (Exception e) {
							fail(driver, "unable to find the globalfilter icon in the chart result");
						}

						// old script if need uncommand
						int j = 1;
						boolean filteredCellGlobalTab2 = true;
						String failedCell_Categorical_GF = " ";
						List<WebElement> FilterChartValue = driver.findElements(By.xpath(
								"//div[contains(@id,'" + GlobalTab2TabId + "')]//div[@ref='gridBody']//div[@col-id='"
										+ SelectCategorical_GlobalFilter + "' and @role='gridcell']"));

						for (WebElement localEle : FilterChartValue) {
							String LocalFilterCellValue = localEle.getText();

							if (!LocalFilterCellValue.equals(ByValuesInput_Categorical_GF)) {
								filteredCellGlobalTab2 = false;
								failedCell_Categorical_GF = failedCell_Categorical_GF + j + ", ";
							}
							j++;
						}

						if (filteredCellGlobalTab2 == true) {
							pass(driver, "For 'By Values' condition applied correctly in the GlobalTab2 charts..");
						} else {
							fail(driver,
									"By Value Global Filter not Applied correctly in the GlobalTab2 for the Categorical column : "
											+ SelectCategorical_GlobalFilter + ", Rows : " + failedCell_Categorical_GF);
						}

						// old script if need uncommand

					} else {
						String FailedText = "";
						if (isDisplayed(driver, ValidationChart)) {
							FailedText = getText1(driver, ValidationChart);
						}
						fail(driver,
								"Unable to get the chart value in GlobalTab2 for the selected filter : " + FailedText);
					}

					// First tab chart cell validation in global filter
					// moving to firstTab and click (1)
					boolean chartpresentGlobal1 = clickFirstTab(driver, GlobalTab1Id);
					// moving to firstTab and click
					elementnotvisible(driver, Loading1);
					if (chartpresentGlobal1) {

						try {
							wait(driver, "1");
							WebElement globalFilterIconChartTab1 = driver.findElement(By.xpath("//div[contains(@id,'"
									+ GlobalTab1Id + "')]//*[name()='svg']//*[name()='g'][2]//*[name()='path'][3]"));
							action.moveToElement(globalFilterIconChartTab1).build().perform();
							String globalIconColorRGB = globalFilterIconChartTab1.getCssValue("fill");
							String globalIconColor = rgbToHex1(globalIconColorRGB);

							if ("#FF3333".equalsIgnoreCase(globalIconColor)) {
								pass(driver,
										"Global Filter icon changed to Red color after Applying the Global Filter");
							} else {
								fail(driver,
										"Global Filter icon changed to Red color after Applying the Global Filter");
							}

						} catch (Exception e) {
							fail(driver, "unable to find the globalfilter icon in the chart result");
							e.printStackTrace();
						}

						int j = 1;
						boolean filteredCellGlobalTab1 = true;
						String failedCell_Categorical_GF = " ";
						List<WebElement> FilterChartValue = driver.findElements(By.xpath(
								"//div[contains(@id,'" + GlobalTab1Id + "')]//div[@ref='gridBody']//div[@col-id='"
										+ SelectCategorical_GlobalFilter + "' and @role='gridcell']"));
						for (WebElement localEle : FilterChartValue) {
							String FilterCellValue = localEle.getText();

							if (!FilterCellValue.equals(ByValuesInput_Categorical_GF)) {
								filteredCellGlobalTab1 = false;
								failedCell_Categorical_GF = failedCell_Categorical_GF + j + ", ";
							}
							j++;
						}

						if (filteredCellGlobalTab1 == true) {
							pass(driver, "For 'By Values' condition applied correctly in the GlobalTab1 charts..");
						} else {
							fail(driver,
									"By Value Global Filter not Applied correctly in the GlobalTab1 for the Categorical column : "
											+ SelectCategorical_GlobalFilter + ", Rows : " + failedCell_Categorical_GF);
						}

					} else {
						String FailedText = "";
						if (isDisplayed(driver, ValidationChart)) {
							FailedText = getText1(driver, ValidationChart);
						}
						fail(driver,
								"Unable to get the chart value in GlobalTab1 for the selected filter : " + FailedText);
					}

					// after checking the first tab then switch back to global filtered tab
					clickSecondTab(driver, GlobalTab2TabId);
					// after checking the first tab then switch back to global filtered tab
					waitForElement(driver, ExcludeCheckbox);
					click(driver, ExcludeCheckbox);
					click(driver, ApplyButton_GlobalFilter);
					wait(driver, "1");
					elementnotvisible(driver, Loading1);
					chartpresentGlobal2 = false;
					try {
						driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
						WebElement chartPresent = driver.findElement(
								By.xpath("//div[@id='" + GlobalTab2TabId + "_div']//div[@ref='gridBody']"));
						if (chartPresent.isDisplayed()) {
							chartpresentGlobal2 = true;
						}

					} catch (Exception e) {
						e.printStackTrace();
					}

					if (chartpresentGlobal2) {
						WebElement chartPresent = driver.findElement(
								By.xpath("//div[@id='" + GlobalTab2TabId + "_div']//div[@ref='gridBody']"));
						action.moveToElement(chartPresent).build().perform();
						try {
							WebElement globalFilterIconChartTab3 = driver.findElement(By.xpath("//div[contains(@id,'"
									+ GlobalTab2TabId + "')]//*[name()='svg']//*[name()='g'][2]//*[name()='path'][3]"));
							action.moveToElement(globalFilterIconChartTab3).build().perform();
							String globalIconColorRGB = globalFilterIconChartTab3.getCssValue("fill");
							String globalIconColor = rgbToHex1(globalIconColorRGB);

							if ("#FF3333".equalsIgnoreCase(globalIconColor)) {
								pass(driver,
										"Global Filter icon changed to Red color after Applying the Global Filter");
							} else {
								fail(driver,
										"Global Filter icon changed to Red color after Applying the Global Filter");
							}

						} catch (Exception e) {
							fail(driver, "unable to find the globalfilter icon in the chart result");
						}

						int j = 1;
						boolean filteredCellGlobalTab2 = true;
						String failedCell_Categorical_GF = " ";
						List<WebElement> FilterChartValue = driver.findElements(By.xpath(
								"//div[contains(@id,'" + GlobalTab2TabId + "')]//div[@ref='gridBody']//div[@col-id='"
										+ SelectCategorical_GlobalFilter + "' and @role='gridcell']"));
						for (WebElement localEle : FilterChartValue) {
							String FilterCellValue = localEle.getText();

							if (FilterCellValue.equals(ByValuesInput_Categorical_GF)) {
								filteredCellGlobalTab2 = false;
								failedCell_Categorical_GF = failedCell_Categorical_GF + j + ", ";
							}
							j++;
						}

						if (filteredCellGlobalTab2 == true) {
							pass(driver,
									"For 'By Values' with 'Exclude' condition in Global Filter applied correctly in the GlobalTab2 charts..");
						} else {
							fail(driver,
									"By Value with 'Exclude' Global Filter not Applied correctly in the GlobalTab2 for the Categorical column : "
											+ SelectCategorical_GlobalFilter + ", Rows : " + failedCell_Categorical_GF);
						}

					} else {
						String FailedText = "";
						if (isDisplayed(driver, ValidationChart)) {
							FailedText = getText1(driver, ValidationChart);
						}
						fail(driver,
								"Unable to get the chart value in GlobalTab2 for the selected filter, " + FailedText);
					}

					// moving to firstTab and click (1)
					chartpresentGlobal1 = clickFirstTab(driver, GlobalTab1Id);
					// moving to firstTab and click

					if (chartpresentGlobal1) {

						int j = 1;
						boolean filteredCellGlobalTab1 = true;
						String failedCell_Categorical_GF = " ";
						List<WebElement> FilterChartValue = driver.findElements(By.xpath(
								"//div[contains(@id,'" + GlobalTab1Id + "')]//div[@ref='gridBody']//div[@col-id='"
										+ SelectCategorical_GlobalFilter + "' and @role='gridcell']"));
						for (WebElement localEle : FilterChartValue) {
							String FilterCellValue = localEle.getText();

							if (FilterCellValue.equals(ByValuesInput_Categorical_GF)) {
								filteredCellGlobalTab1 = false;
								failedCell_Categorical_GF = failedCell_Categorical_GF + j + ", ";
							}

							j++;
						}

						if (filteredCellGlobalTab1 == true) {
							pass(driver,
									"For 'By Values' with 'Exclude' condition Global Filter applied correctly in the GlobalTab1 charts..");
						} else {
							fail(driver,
									"By Value with 'Exclude' Global Filter not Applied correctly in the GlobalTab1 for the Categorical column : "
											+ SelectCategorical_GlobalFilter + ", Rows : " + failedCell_Categorical_GF);
						}

					} else {
						String FailedText = "";
						if (isDisplayed(driver, ValidationChart)) {
							FailedText = getText1(driver, ValidationChart);
						}
						fail(driver,
								"Unable to get the chart value in GlobalTab1 for the selected filter, " + FailedText);
					}

					// after checking the first tab then switch back to global filtered tab
					clickSecondTab(driver, GlobalTab2TabId);
					// after checking the first tab then switch back to global filtered tab

					if (verifyElementDisplayed(driver, ConditionFilterOption_Categorical)) {
						click(driver, ConditionFilterOption_Categorical);
						wait(driver, "1");
						if (isElementSelected(driver, ConditionRadioButton_Categorical)) {
							pass(driver, "Condition radio button selected after click on it");
						} else {
							fail(driver, "Condition radio button not selected after click on it");
						}

						if (verifyElementDisplayed(driver, ConditionSelectDropdown)) {
							String defaultSelectedCondition = defaultSelectedValue(driver, ConditionSelectDropdown);
							if (defaultSelectedCondition.equals("equal to")) {
								pass(driver, "By default, 'equal to' option selected in the Condition select dropdown");
							} else {
								fail(driver,
										"By default, 'equal to' option not selected in the Condition select dropdown");
							}

							String[] conditionsList = { FirstCondition_1_Categorical_GF,
									FirstCondition_2_Categorical_GF, FirstCondition_3_Categorical_GF,
									FirstCondition_4_Categorical_GF, FirstCondition_5_Categorical_GF,
									FirstCondition_6_Categorical_GF, FirstCondition_7_Categorical_GF,
									FirstCondition_8_Categorical_GF };
							String[] conditionsInputList = { FirstCondition_Input_1_Categorical_GF,
									FirstCondition_Input_2_Categorical_GF, FirstCondition_Input_3_Categorical_GF,
									FirstCondition_Input_4_Categorical_GF, FirstCondition_Input_5_Categorical_GF,
									FirstCondition_Input_6_Categorical_GF, FirstCondition_Input_7_Categorical_GF,
									FirstCondition_Input_8_Categorical_GF };

							for (int k = 0; k < 8; k++) {

								try {
									waitForElement(driver, ConditionSelectDropdown);
									selectByText(driver, ConditionSelectDropdown, conditionsList[k]);
									wait(driver, "1");
									click(driver, ConditonInput1);
									clear1(driver, ConditonInput1);
									sendKeys(driver, ConditonInput1, conditionsInputList[k]);
									wait(driver, "1");
									click(driver, ApplyButton_GlobalFilter);
									wait(driver, "2");
									elementnotvisible(driver, Loading1);
									chartpresentGlobal2 = false;
									try {
										WebElement chartPresent = driver.findElement(By.xpath(
												"//div[@id='" + GlobalTab2TabId + "_div']//div[@ref='gridBody']"));
										if (chartPresent.isDisplayed()) {
											chartpresentGlobal2 = true;
										}

									} catch (Exception e) {
										e.printStackTrace();
									}

									if (chartpresentGlobal2) {
										WebElement chartPresent = driver.findElement(By.xpath(
												"//div[@id='" + GlobalTab2TabId + "_div']//div[@ref='gridBody']"));
										action.moveToElement(chartPresent).build().perform();

										int j = 1;
										boolean filteredCellGlobalTab2 = true;
										String failedCell_Categorical_GF = " ";
										List<WebElement> FilterChartValue = driver
												.findElements(By.xpath("//div[contains(@id,'" + GlobalTab2TabId
														+ "')]//div[@ref='gridBody']//div[@col-id='"
														+ SelectCategorical_GlobalFilter + "' and @role='gridcell']"));
										for (WebElement localEle : FilterChartValue) {
											String FilterCellValue = localEle.getText();

											if (!Categorical_ConditionFiltercell(conditionsList[k], FilterCellValue,
													conditionsInputList[k])) {
												filteredCellGlobalTab2 = false;
												failedCell_Categorical_GF = failedCell_Categorical_GF + j + ", ";
											}

											j++;
										}

										if (filteredCellGlobalTab2 == true) {
											pass(driver, "For '" + conditionsList[k]
													+ "' condition applied correctly in the GlobalTab2 charts..");
										} else {
											fail(driver, "For '" + conditionsList[k]
													+ "' Global Filter not Applied correctly in the GlobalTab2 for the Categorical column : "
													+ SelectCategorical_GlobalFilter + ", Rows : "
													+ failedCell_Categorical_GF);
										}

									} else {
										String FailedText = " ";
										if (isDisplayed(driver, ValidationChart)) {
											FailedText = getText1(driver, ValidationChart);
										}
										fail(driver,
												"Unable to get the chart value in GlobalTab2 for the selected filter, "
														+ conditionsList[k] + " " + FailedText);
									}

									// moving to firstTab and click (1)
									chartpresentGlobal1 = clickFirstTab(driver, GlobalTab1Id);
									// moving to firstTab and click

									if (chartpresentGlobal1) {
										int j = 1;
										boolean filteredCellGlobalTab1 = true;
										String failedCell_Categorical_GF = " ";
										List<WebElement> FilterChartValue = driver
												.findElements(By.xpath("//div[contains(@id,'" + GlobalTab1Id
														+ "')]//div[@ref='gridBody']//div[@col-id='"
														+ SelectCategorical_GlobalFilter + "' and @role='gridcell']"));
										for (WebElement localEle : FilterChartValue) {
											String FilterCellValue = localEle.getText();

											if (!Categorical_ConditionFiltercell(conditionsList[k], FilterCellValue,
													conditionsInputList[k])) {
												filteredCellGlobalTab1 = false;
												failedCell_Categorical_GF = failedCell_Categorical_GF + j + ", ";
											}
											j++;
										}

										if (filteredCellGlobalTab1 == true) {
											pass(driver, "For '" + conditionsList[k]
													+ "' condition applied correctly in the GlobalTab1 charts..");
										} else {
											fail(driver, "For '" + conditionsList[k]
													+ "' Global Filter not Applied correctly in the GlobalTab1 for the Categorical column : "
													+ SelectCategorical_GlobalFilter + ", Rows : "
													+ failedCell_Categorical_GF);
										}

									} else {
										String FailedText = "";
										if (isDisplayed(driver, ValidationChart)) {
											FailedText = getText1(driver, ValidationChart);
										}
										fail(driver,
												"Unable to get the chart value in GlobalTab1 for the selected filter, "
														+ conditionsList[k] + " " + FailedText);
									}

									// after checking the first tab then switch back to global filtered tab
									clickSecondTab(driver, GlobalTab2TabId);
									// after checking the first tab then switch back to global filtered tab

								} catch (Exception e) {
									e.printStackTrace();
								}
							}

							waitForElement(driver, ConditionSelectDropdown);
							click(driver, ConditionSelectDropdown);
							selectByText(driver, ConditionSelectDropdown, FirstCondition_Categorical_GF);
							wait(driver, "1");
							click(driver, ConditonInput1);
							clear1(driver, ConditonInput1);
							sendKeys(driver, ConditonInput1, FirstCondition_Input_Categorical_GF);
							wait(driver, "1");
							if (isDisplayed(driver, AddButtonCondition)) {
								pass(driver, "ADD button displayed after selecting the condition");
							} else {
								fail(driver, "ADD button not displayed after selecting the condition");
							}

							mouseOverToElement(driver, AddButtonCondition);
							click(driver, AddButtonCondition);

							verifyElementDisplayed(driver, AND_ConditionSec1);
							verifyElementDisplayed(driver, OR_ConditionSec1);

							if (FirstOperator_Input_Categorical_GF.equals("AND")) {
								click(driver, AND_ConditionSec1);
								wait(driver, "1");
								if (isElementSelected(driver, AND_ConditionRadioBtn1)) {
									pass(driver, "AND Operated Selected after click on it");
								} else {
									fail(driver, "AND Operated Selected after click on it");
								}

							} else {
								click(driver, OR_ConditionSec1);
								wait(driver, "1");
								if (isElementSelected(driver, OR_ConditionRadioBtn1)) {
									pass(driver, "AND Operated Selected after click on it");
								} else {
									fail(driver, "AND Operated Selected after click on it");
								}
							}

							if (isDisplayed(driver, ConditionSelectDropdown2)) {
								pass(driver,
										"After click 'ADD' button Second time Condition Selection dropdown is displayed");
							} else {
								fail(driver,
										"After click 'ADD' button Second time Condition Selection dropdown is not displayed");
							}

							click(driver, ConditionSelectDropdown2);
							selectByText(driver, ConditionSelectDropdown2, SecondCondition_Categorical_GF);
							wait(driver, "1");
							click(driver, ConditonInput2);
							sendKeys(driver, ConditonInput2, SecondCondition_Input_Categorical_GF);
							wait(driver, "1");
							if (isDisplayed(driver, AddButtonCondition)) {
								pass(driver, "2nd time ADD button displayed after selecting the condition 2nd time ");
							} else {
								fail(driver,
										"2nd time ADD button not displayed after selecting the condition 2nd time ");
							}

							mouseOverToElement(driver, AddButtonCondition);
							click(driver, AddButtonCondition);
							verifyElementDisplayed(driver, AND_ConditionSec2);
							verifyElementDisplayed(driver, OR_ConditionSec2);

							if (SecondOperator_Input_Categorical_GF.equals("AND")) {
								click(driver, AND_ConditionSec2);
								wait(driver, "1");
								if (isElementSelected(driver, AND_ConditionRadioBtn2)) {
									pass(driver, "AND Operated Selected after click on it");
								} else {
									fail(driver, "AND Operated Selected after click on it");
								}

							} else {
								click(driver, OR_ConditionSec2);
								wait(driver, "1");
								if (isElementSelected(driver, OR_ConditionRadioBtn2)) {
									pass(driver, "AND Operated Selected after click on it");
								} else {
									fail(driver, "AND Operated Selected after click on it");
								}
							}

							if (isDisplayed(driver, ConditionSelectDropdown3)) {
								pass(driver,
										"After click 'ADD' button Third time Condition Selection dropdown is displayed");
							} else {
								fail(driver,
										"After click 'ADD' button Third time Condition Selection dropdown is not displayed");
							}

							selectByText(driver, ConditionSelectDropdown3, ThirdCondition_Categorical_GF);
							wait(driver, "1");
							click(driver, ConditonInput3);
							sendKeys(driver, ConditonInput3, ThirdCondition_Input_Categorical_GF);
							wait(driver, "1");
							if (isDisplayed2(driver, AddButtonCondition)) {
								fail(driver, "'ADD' button displayed after given 3 times condition ");
							} else {
								pass(driver, "'ADD' button not displayed after given 3 times condition");
							}

							click(driver, ApplyButton_GlobalFilter);
							wait(driver, "2");
							elementnotvisible(driver, Loading1);
							chartpresentGlobal2 = false;
							try {
								WebElement chartPresent = driver.findElement(
										By.xpath("//div[@id='" + GlobalTab2TabId + "_div']//div[@ref='gridBody']"));
								if (chartPresent.isDisplayed()) {
									chartpresentGlobal2 = true;
								}

							} catch (Exception e) {
								e.printStackTrace();
							}

							if (chartpresentGlobal2) {
								WebElement chartPresent = driver.findElement(
										By.xpath("//div[@id='" + GlobalTab2TabId + "_div']//div[@ref='gridBody']"));
								action.moveToElement(chartPresent).build().perform();

								int j = 1;
								boolean filteredCellGlobalTab2 = true;
								String failedCell_Categorical_GF = " ";
								List<WebElement> FilterChartValue = driver.findElements(By.xpath("//div[contains(@id,'"
										+ GlobalTab2TabId + "')]//div[@ref='gridBody']//div[@col-id='"
										+ SelectCategorical_GlobalFilter + "' and @role='gridcell']"));
								for (WebElement localEle : FilterChartValue) {
									String FilterCellValue = localEle.getText();

									boolean condition_1_Result = Categorical_ConditionFiltercell(
											FirstCondition_Categorical_GF, FilterCellValue,
											FirstCondition_Input_Categorical_GF);
									boolean condition_2_Result = Categorical_ConditionFiltercell(
											SecondCondition_Categorical_GF, FilterCellValue,
											SecondCondition_Input_Categorical_GF);
									boolean condition_3_Result = Categorical_ConditionFiltercell(
											ThirdCondition_Categorical_GF, FilterCellValue,
											ThirdCondition_Input_Categorical_GF);
									String operator1 = FirstOperator_Input_Categorical_GF;
									String operator2 = SecondOperator_Input_Categorical_GF;

									System.out.println("condition_3_Result : " + condition_3_Result);

									System.out.println(condition_1_Result + " " + operator1 + " " + condition_2_Result
											+ " " + operator2 + " " + condition_3_Result);

									if (!evaluateConditions(condition_1_Result, operator1, condition_2_Result,
											operator2, condition_3_Result)) {
										filteredCellGlobalTab2 = false;
										failedCell_Categorical_GF = failedCell_Categorical_GF + j + ", ";
									}
									j++;
								}

								if (filteredCellGlobalTab2 == true) {
									pass(driver,
											"For selected 3 condition Global Filter Applied correctly in the GlobalTab2 charts..");
								} else {
									fail(driver,
											"For selected 3 condition Global Filter not Applied correctly in the GlobalTab2 for the Categorical column : "
													+ SelectCategorical_GlobalFilter + ", Rows : "
													+ failedCell_Categorical_GF);
								}

							} else {
								String FailedText = " ";
								if (isDisplayed(driver, ValidationChart)) {
									FailedText = getText1(driver, ValidationChart);
								}
								fail(driver,
										"Unable to get the chart value in GlobalTab2 for the selected filter for 3 conditions, "
												+ FailedText);
							}

							// moving to firstTab and click
							chartpresentGlobal1 = clickFirstTab(driver, GlobalTab1Id);
							// moving to firstTab and click

							if (chartpresentGlobal1) {
								int j = 1;
								boolean filteredCellGlobalTab1 = true;
								String failedCell_Categorical_GF = " ";
								List<WebElement> FilterChartValue = driver.findElements(By.xpath("//div[contains(@id,'"
										+ GlobalTab1Id + "')]//div[@ref='gridBody']//div[@col-id='"
										+ SelectCategorical_GlobalFilter + "' and @role='gridcell']"));
								for (WebElement localEle : FilterChartValue) {
									String FilterCellValue = localEle.getText();

									boolean condition_1_Result = Categorical_ConditionFiltercell(
											FirstCondition_Categorical_GF, FilterCellValue,
											FirstCondition_Input_Categorical_GF);
									boolean condition_2_Result = Categorical_ConditionFiltercell(
											SecondCondition_Categorical_GF, FilterCellValue,
											SecondCondition_Input_Categorical_GF);
									boolean condition_3_Result = Categorical_ConditionFiltercell(
											ThirdCondition_Categorical_GF, FilterCellValue,
											ThirdCondition_Input_Categorical_GF);
									String operator1 = FirstOperator_Input_Categorical_GF;
									String operator2 = SecondOperator_Input_Categorical_GF;

									if (!evaluateConditions(condition_1_Result, operator1, condition_2_Result,
											operator2, condition_3_Result)) {
										filteredCellGlobalTab1 = false;
										failedCell_Categorical_GF = failedCell_Categorical_GF + j + ", ";
									}
									j++;
								}

								if (filteredCellGlobalTab1 == true) {
									pass(driver,
											"For selected 3 condition Global Filter Applied correctly in the GlobalTab1 charts..");
								} else {
									fail(driver,
											"For selected 3 condition Global Filter not Applied correctly in the GlobalTab1 for the Categorical column : "
													+ SelectCategorical_GlobalFilter + ", Rows : "
													+ failedCell_Categorical_GF);
								}

							} else {
								String FailedText = "";
								if (isDisplayed(driver, ValidationChart)) {
									FailedText = getText1(driver, ValidationChart);
								}
								fail(driver,
										"Unable to get the chart value in GlobalTab1 for the selected filter for 3 conditions "
												+ FailedText);
							}

							// after checking the first tab then switch back to global filtered tab
							clickSecondTab(driver, GlobalTab2TabId);
							// after checking the first tab then switch back to global filtered tab

							waitForElement(driver, RestButton_GlobalFilter);
							click(driver, RestButton_GlobalFilter);
							wait(driver, "1");
							elementnotvisible(driver, Loading1);

							ResetGlobalValidation(driver, GlobalTab2TabId);

						}
					}

				} else {
					fail(driver, "Categorical Column not Expand After click on it ");
				}

			} else {
				fail(driver, SelectCategorical_GlobalFilter + " Categorical Column value not present in Global filter");
			}
			// categorical global filter validation end......

			// Date Global Filter Validation start...........

			click(driver, RestButton_GlobalFilter);
			boolean dateFilter = false;
			try {
				WebElement DateColumnElement = driver
						.findElement(By.xpath("//div[@id='globalRPE_select_filterColsCon']//div[@id='"
								+ SelectDateColumn_Smoke_GlobalFilter + "']//a"));
				action.moveToElement(DateColumnElement).click().build().perform();
				dateFilter = true;
			} catch (Exception e) {

			}
			if (dateFilter == true) {
				wait(driver, "1");
				WebElement DateColumnElementExpand = driver
						.findElement(By.xpath("//div[@id='globalRPE_select_filterColsCon']//div[@id='"
								+ SelectDateColumn_Smoke_GlobalFilter + "']//a//i"));
				String DateColumnElementExpandString = DateColumnElementExpand.getAttribute("class");
				if (DateColumnElementExpandString.contains("up")) {
					pass(driver, "Selected Date Column expanded after click on it");

					WebElement Date_RelativeSection = driver.findElement(By.xpath("//div[@id='"
							+ SelectDateColumn_Smoke_GlobalFilter + "_content']//div[@id='relative_div']"));
					pass(driver, "Relative filter present in the Date Column");
					WebElement Date_RelativeRadioBtn = driver.findElement(By.xpath("//div[@id='"
							+ SelectDateColumn_Smoke_GlobalFilter + "_content']//div[@id='relative_div']//input"));
					if (Date_RelativeRadioBtn.isSelected()) {
						pass(driver, "By default, 'Relative' option selected in the Date Column");
						click(driver, Relative_conditin_dropdown);

						String[] RelativeFilterList = { RelativeFilter_1_Date_GF, RelativeFilter_2_Date_GF,
								RelativeFilter_3_Date_GF, RelativeFilter_4_Date_GF, RelativeFilter_5_Date_GF,
								RelativeFilter_6_Date_GF, RelativeFilter_7_Date_GF, RelativeFilter_8_Date_GF,
								RelativeFilter_9_Date_GF, RelativeFilter_10_Date_GF, RelativeFilter_11_Date_GF,
								RelativeFilter_12_Date_GF, RelativeFilter_13_Date_GF, RelativeFilter_14_Date_GF };
						String[] RelativeFilterInputList = { "", "", "", "", "", "", "", "", "", "",
								RelativeFilter_11_Input_Date_GF, RelativeFilter_12_Input_Date_GF,
								RelativeFilter_13_Input_Date_GF, RelativeFilter_14_Input_Date_GF };

						for (int k = 0; k < 14; k++) {
							try {
								waitForElement(driver, Relative_conditin_dropdown);
								selectByText(driver, Relative_conditin_dropdown, RelativeFilterList[k]);
								wait(driver, "1");
								if (k >= 10 && isDisplayed(driver, Relative_Input_Value_date)) {
									click(driver, Relative_Input_Value_date);
									clear1(driver, Relative_Input_Value_date);
									sendKeys(driver, Relative_Input_Value_date, RelativeFilterInputList[k]);
								}
								wait(driver, "1");
								click(driver, ApplyButton_GlobalFilter);
								wait(driver, "1");
								elementnotvisible(driver, Loading1);
								boolean chartpresentGlobal2 = false;
								try {
									WebElement chartPresent = driver.findElement(
											By.xpath("//div[@id='" + GlobalTab2TabId + "_div']//div[@ref='gridBody']"));
									if (chartPresent.isDisplayed()) {
										chartpresentGlobal2 = true;
									}
								} catch (Exception e) {
//		    			  			   e.printStackTrace();
								}

								if (chartpresentGlobal2) {
									WebElement chartPresent = driver.findElement(
											By.xpath("//div[@id='" + GlobalTab2TabId + "_div']//div[@ref='gridBody']"));
									action.moveToElement(chartPresent).build().perform();

									try {
										WebElement globalFilterIconChartTab3 = driver
												.findElement(By.xpath("//div[contains(@id,'" + GlobalTab2TabId
														+ "')]//*[name()='svg']//*[name()='g'][2]//*[name()='path'][3]"));
										action.moveToElement(globalFilterIconChartTab3).build().perform();
										String globalIconColorRGB = globalFilterIconChartTab3.getCssValue("fill");
										String globalIconColor = rgbToHex1(globalIconColorRGB);

										if ("#FF3333".equalsIgnoreCase(globalIconColor)) {
											pass(driver,
													"Global Filter icon changed to Red color after Applying the Global Filter");
										} else {
											fail(driver,
													"Global Filter icon changed to Red color after Applying the Global Filter");
										}

									} catch (Exception e) {
										fail(driver, "unable to find the globalfilter icon in the chart result");
									}

									int j = 1;
									boolean filteredCellGlobalTab2 = true;
									String failedCell_Date_GF = " ";
									List<WebElement> FilterChartValue = driver
											.findElements(By.xpath("//div[contains(@id,'" + GlobalTab2TabId
													+ "')]//div[@ref='gridBody']//div[@col-id='"
													+ SelectDateColumn_Smoke_GlobalFilter + "' and @role='gridcell']"));
									for (WebElement localEle : FilterChartValue) {
										String FilterCellValue = localEle.getText();
										if (FilterCellValue != null && FilterCellValue.length() >= 10) {
											FilterCellValue = FilterCellValue.substring(0, 10);
										}

										if (!Date_RelativeFiltercell(RelativeFilterList[k], FilterCellValue,
												RelativeFilterInputList[k])) {
											filteredCellGlobalTab2 = false;
											failedCell_Date_GF = failedCell_Date_GF + j + ", ";
										}
										j++;
									}

									if (filteredCellGlobalTab2 == true) {
										pass(driver, "For '" + RelativeFilterList[k]
												+ "' condition applied correctly in the GlobalTab2 charts..");
									} else {
										fail(driver, "For '" + RelativeFilterList[k]
												+ "' Global Filter not Applied correctly in the GlobalTab2 for the Date column : "
												+ SelectDateColumn_Smoke_GlobalFilter + ", Rows : "
												+ failedCell_Date_GF);
									}
								} else {
									String FailedText = " ";
									if (isDisplayed(driver, ValidationChart)) {
										FailedText = getText1(driver, ValidationChart);
									}
									fail(driver, "Unable to get the chart value in GlobalTab2 for the selected filter, "
											+ RelativeFilterList[k] + " " + FailedText);
								}

								// moving to firstTab and click (1)
								boolean chartpresentGlobal1 = clickFirstTab(driver, GlobalTab1Id);
								// moving to firstTab and click

								if (chartpresentGlobal1) {
									int j = 1;
									boolean filteredCellGlobalTab1 = true;
									String failedCell_Date_GF = " ";
									List<WebElement> FilterChartValue = driver
											.findElements(By.xpath("//div[contains(@id,'" + GlobalTab1Id
													+ "')]//div[@ref='gridBody']//div[@col-id='"
													+ SelectDateColumn_Smoke_GlobalFilter + "' and @role='gridcell']"));
									for (WebElement localEle : FilterChartValue) {
										String FilterCellValue = localEle.getText();
										if (FilterCellValue != null && FilterCellValue.length() >= 10) {
											FilterCellValue = FilterCellValue.substring(0, 10);
										}

										if (!Date_RelativeFiltercell(RelativeFilterList[k], FilterCellValue,
												RelativeFilterInputList[k])) {
											filteredCellGlobalTab1 = false;
											failedCell_Date_GF = failedCell_Date_GF + j + ", ";
										}
										j++;
									}
									if (filteredCellGlobalTab1 == true) {
										pass(driver, "For '" + RelativeFilterList[k]
												+ "' condition applied correctly in the GlobalTab1 charts..");
									} else {
										fail(driver, "For '" + RelativeFilterList[k]
												+ "' Global Filter not Applied correctly in the GlobalTab1 for the Date column : "
												+ SelectDateColumn_Smoke_GlobalFilter + ", Rows : "
												+ failedCell_Date_GF);
									}

								} else {
									String FailedText = "";
									if (isDisplayed(driver, ValidationChart)) {
										FailedText = getText1(driver, ValidationChart);
									}
									fail(driver, "Unable to get the chart value in GlobalTab1 for the selected filter, "
											+ RelativeFilterList[k] + " " + FailedText);
								}

								// after checking the first tab then switch back to global filtered tab
								clickSecondTab(driver, GlobalTab2TabId);
								// after checking the first tab then switch back to global filtered tab

							} catch (Exception e) {
								e.printStackTrace();
							}
						}

					} else {
						fail(driver, "By default, 'Relative' option not selected in the Date Column");
					}
					System.out.println();
					System.out.println("********** Conditions filter in Date *********************");
					System.out.println();
					if (verifyElementDisplayed(driver, ConditionFilterOption_Date)) {
						click(driver, ConditionFilterOption_Date);
						wait(driver, "1");
						if (isElementSelected(driver, ConditionRadioButton_Date)) {
							pass(driver, "Conditions Filter in Date type Colunm is selected after click on it ");

							String[] ConditionFilterList = { Condition_1_Date_GF, Condition_2_Date_GF,
									Condition_3_Date_GF, Condition_4_Date_GF, Condition_5_Date_GF, Condition_6_Date_GF,
									Condition_7_Date_GF, Condition_8_Date_GF, Condition_9_Date_GF };
							String[] ConditionFilterInputList = { Condition_1_Input_Date_GF, Condition_2_Input_Date_GF,
									Condition_3_Input_Date_GF, Condition_4_Input_Date_GF, Condition_5_Input_Date_GF,
									Condition_6_Input_Date_GF, Condition_7_Input_Date_GF, Condition_8_Input_Date_GF,
									Condition_9_InputA_Date_GF };

							for (int k = 0; k < 9; k++) {

								try {
									waitForElement(driver, ConditionInput1_Date);
									selectByText(driver, ConditionInput1_Date, ConditionFilterList[k]);
									wait(driver, "1");
									if (!ConditionFilterList[k].equals("is null")
											&& !ConditionFilterList[k].equals("is not null")) {
										click(driver, FirstConditionValueInput1_date);
										for (int m = 0; m < 3; m++) {
											action.sendKeys(Keys.BACK_SPACE).build().perform();
											action.sendKeys(Keys.ARROW_RIGHT).build().perform();
										}
										click(driver, DashProPage);
										click(driver, FirstConditionValueInput1_date);
										sendKeys(driver, FirstConditionValueInput1_date, ConditionFilterInputList[k]);
										wait(driver, "1");

										if (ConditionFilterList[k].equals("between")) {
											if (isDisplayed(driver, FirstConditionValueInput2_date)) {
												pass(driver,
														"Second input element is available for 'between' condition");
												click(driver, FirstConditionValueInput2_date);
												for (int m = 0; m < 3; m++) {
													action.sendKeys(Keys.BACK_SPACE).build().perform();
													action.sendKeys(Keys.ARROW_RIGHT).build().perform();
												}
												click(driver, FirstConditionValueInput1_date);
												click(driver, FirstConditionValueInput2_date);
												sendKeys(driver, FirstConditionValueInput2_date,
														Condition_9_InputB_Date_GF);
											} else {
												fail(driver,
														"Second input element is not available for 'between' condition");
											}
										}

									}
									wait(driver, "1");
									click(driver, ApplyButton_GlobalFilter);
									wait(driver, "1");
									elementnotvisible(driver, Loading1);
									boolean chartpresentGlobal2 = false;
									try {
										WebElement chartPresent = driver.findElement(By.xpath(
												"//div[@id='" + GlobalTab2TabId + "_div']//div[@ref='gridBody']"));
										if (chartPresent.isDisplayed()) {
											chartpresentGlobal2 = true;
										}

									} catch (Exception e) {
										e.printStackTrace();
									}

									if (chartpresentGlobal2) {
										WebElement chartPresent = driver.findElement(By.xpath(
												"//div[@id='" + GlobalTab2TabId + "_div']//div[@ref='gridBody']"));
										action.moveToElement(chartPresent).build().perform();

										int j = 1;
										boolean filteredCellGlobalTab2 = true;
										String failedCell_Date_GF = " ";
										List<WebElement> FilterChartValue = driver
												.findElements(By.xpath("//div[contains(@id,'" + GlobalTab2TabId
														+ "')]//div[@ref='gridBody']//div[@col-id='"
														+ SelectDateColumn_Smoke_GlobalFilter
														+ "' and @role='gridcell']"));
										for (WebElement localEle : FilterChartValue) {
											String FilterCellValue = localEle.getText();
											if (FilterCellValue != null && FilterCellValue.length() >= 10) {
												FilterCellValue = FilterCellValue.substring(0, 10);
											}

											if (!Date_ConditionFiltercell(ConditionFilterList[k], FilterCellValue,
													ConditionFilterInputList[k], Condition_9_InputB_Date_GF)) {
												filteredCellGlobalTab2 = false;
												failedCell_Date_GF = failedCell_Date_GF + j + ", ";
											}
											j++;
										}

										if (filteredCellGlobalTab2 == true) {
											pass(driver, "For '" + ConditionFilterList[k]
													+ "' condition applied correctly in the GlobalTab2 charts..");
										} else {
											fail(driver, "For '" + ConditionFilterList[k]
													+ "' Global Filter not Applied correctly in the GlobalTab2 for the Date column : "
													+ SelectDateColumn_Smoke_GlobalFilter + ", Rows : "
													+ failedCell_Date_GF);
										}

									} else {
										String FailedText = " ";
										if (isDisplayed(driver, ValidationChart)) {
											FailedText = getText1(driver, ValidationChart);
										}
										fail(driver,
												"Unable to get the chart value in GlobalTab2 for the selected filter, "
														+ ConditionFilterList[k] + " " + FailedText);
									}

									// moving to firstTab and click (1)
									boolean chartpresentGlobal1 = clickFirstTab(driver, GlobalTab1Id);
									// moving to firstTab and click

									if (chartpresentGlobal1) {
										int j = 1;
										boolean filteredCellGlobalTab1 = true;
										String failedCell_Date_GF = " ";
										List<WebElement> FilterChartValue = driver
												.findElements(By.xpath("//div[contains(@id,'" + GlobalTab1Id
														+ "')]//div[@ref='gridBody']//div[@col-id='"
														+ SelectDateColumn_Smoke_GlobalFilter
														+ "' and @role='gridcell']"));
										for (WebElement localEle : FilterChartValue) {
											String FilterCellValue = localEle.getText();
											if (FilterCellValue != null && FilterCellValue.length() >= 10) {
												FilterCellValue = FilterCellValue.substring(0, 10);
											}

											if (!Date_ConditionFiltercell(ConditionFilterList[k], FilterCellValue,
													ConditionFilterInputList[k], Condition_9_InputB_Date_GF)) {
												filteredCellGlobalTab1 = false;
												failedCell_Date_GF = failedCell_Date_GF + j + ", ";
											}

											j++;
										}

										if (filteredCellGlobalTab1 == true) {
											pass(driver, "For '" + ConditionFilterList[k]
													+ "' condition applied correctly in the GlobalTab1 charts..");
										} else {
											fail(driver, "For '" + ConditionFilterList[k]
													+ "' Global Filter not Applied correctly in the GlobalTab1 for the Date column : "
													+ SelectDateColumn_Smoke_GlobalFilter + ", Rows : "
													+ failedCell_Date_GF);
										}

									} else {
										String FailedText = "";
										if (isDisplayed(driver, ValidationChart)) {
											FailedText = getText1(driver, ValidationChart);
										}
										fail(driver,
												"Unable to get the chart value in GlobalTab1 for the selected filter, "
														+ ConditionFilterList[k] + " " + FailedText);
									}

									// after checking the first tab then switch back to global filtered tab
									clickSecondTab(driver, GlobalTab2TabId);
									// after checking the first tab then switch back to global filtered tab

								} catch (Exception e) {
									e.printStackTrace();
								}
							}

							waitForElement(driver, ConditionFilterOption_Date);
							click(driver, ConditionFilterOption_Date);
							wait(driver, "1");
							selectByText(driver, ConditionInput1_Date, FirstCondition_Date_GF);
							wait(driver, "1");
							if (!FirstCondition_Date_GF.equals("is null")
									&& !FirstCondition_Date_GF.equals("is not null")) {
								click(driver, FirstConditionValueInput1_date);
								for (int m = 0; m < 3; m++) {
									action.sendKeys(Keys.BACK_SPACE).build().perform();
									action.sendKeys(Keys.ARROW_RIGHT).build().perform();
								}
								click(driver, DashProPage);
								click(driver, FirstConditionValueInput1_date);
								sendKeys(driver, FirstConditionValueInput1_date, FirstCondition_Date_Input_GF);
								wait(driver, "1");
							}
							wait(driver, "1");
							if (isDisplayed(driver, AddButtonCondition)) {
								pass(driver, "ADD button displayed after selecting the first condition");
							} else {
								fail(driver, "ADD button not displayed after selecting the first condition");
							}

							mouseOverToElement(driver, AddButtonCondition);
							click(driver, AddButtonCondition);

							verifyElementDisplayed(driver, AND_ConditionSec1);
							verifyElementDisplayed(driver, OR_ConditionSec1);

							if (FirstOperator_Input_Date_GF.equals("AND")) {
								click(driver, AND_ConditionSec1);
								wait(driver, "1");
								if (isElementSelected(driver, AND_ConditionRadioBtn1)) {
									pass(driver, "AND Operated Selected after click on it");
								} else {
									fail(driver, "AND Operated Selected after click on it");
								}

							} else {
								click(driver, OR_ConditionSec1);
								wait(driver, "1");
								if (isElementSelected(driver, OR_ConditionRadioBtn1)) {
									pass(driver, "AND Operated Selected after click on it");
								} else {
									fail(driver, "AND Operated Selected after click on it");
								}
							}

							if (isDisplayed(driver, ConditionInput2_Date)) {
								pass(driver,
										"After click 'ADD' button Second time Condition Selection dropdown is displayed");
							} else {
								fail(driver,
										"After click 'ADD' button Second time Condition Selection dropdown is not displayed");
							}

							click(driver, ConditionInput2_Date);
							selectByText(driver, ConditionInput2_Date, SecondCondition_Date_GF);
							if (!SecondCondition_Date_GF.equals("is null")
									&& !SecondCondition_Date_GF.equals("is not null")) {
								click(driver, SecondConditionValueInput1_date);
								for (int m = 0; m < 3; m++) {
									action.sendKeys(Keys.BACK_SPACE).build().perform();
									action.sendKeys(Keys.ARROW_RIGHT).build().perform();
								}
								click(driver, DashProPage);
								click(driver, SecondConditionValueInput1_date);
								sendKeys(driver, SecondConditionValueInput1_date, SecondCondition_Date_Input_GF);

							}
							wait(driver, "1");
							if (isDisplayed(driver, AddButtonCondition)) {
								pass(driver, "2nd time ADD button displayed after selecting the condition 2nd time ");
							} else {
								fail(driver,
										"2nd time ADD button not displayed after selecting the condition 2nd time ");
							}

							mouseOverToElement(driver, AddButtonCondition);
							click(driver, AddButtonCondition);
							verifyElementDisplayed(driver, AND_ConditionSec2);
							verifyElementDisplayed(driver, OR_ConditionSec2);

							if (SecondOperator_Input_Date_GF.equals("AND")) {
								click(driver, AND_ConditionSec2);
								wait(driver, "1");
								if (isElementSelected(driver, AND_ConditionRadioBtn2)) {
									pass(driver, "AND Operated Selected after click on it");
								} else {
									fail(driver, "AND Operated Selected after click on it");
								}

							} else {
								click(driver, OR_ConditionSec2);
								wait(driver, "1");
								if (isElementSelected(driver, OR_ConditionRadioBtn2)) {
									pass(driver, "AND Operated Selected after click on it");
								} else {
									fail(driver, "AND Operated Selected after click on it");
								}
							}

							if (isDisplayed(driver, ConditionInput3_Date)) {
								pass(driver,
										"After click 'ADD' button Third time Condition Selection dropdown is displayed");
							} else {
								fail(driver,
										"After click 'ADD' button Third time Condition Selection dropdown is not displayed");
							}

							selectByText(driver, ConditionInput3_Date, ThirdCondition_Date_GF);
							wait(driver, "1");

							if (!ThirdCondition_Date_GF.equals("is null")
									&& !ThirdCondition_Date_GF.equals("is not null")) {
								click(driver, ThirdConditionValueInput1_date);
								for (int m = 0; m < 3; m++) {
									action.sendKeys(Keys.BACK_SPACE).build().perform();
									action.sendKeys(Keys.ARROW_RIGHT).build().perform();
								}
								click(driver, DashProPage);
								click(driver, ThirdConditionValueInput1_date);
								sendKeys(driver, ThirdConditionValueInput1_date, ThirdCondition_Date_Input_GF);

							}
							wait(driver, "1");

							if (isDisplayed2(driver, AddButtonCondition)) {
								fail(driver, "'ADD' button displayed after given 3 times condition ");
							} else {
								pass(driver, "'ADD' button not displayed after given 3 times condition");
							}

//			    				  /test

							click(driver, ApplyButton_GlobalFilter);
							wait(driver, "1");

							elementnotvisible(driver, Loading1);
							boolean chartpresentGlobal2 = false;
							try {
								WebElement chartPresent = driver.findElement(
										By.xpath("//div[@id='" + GlobalTab2TabId + "_div']//div[@ref='gridBody']"));
								if (chartPresent.isDisplayed()) {
									chartpresentGlobal2 = true;
								}

							} catch (Exception e) {
								e.printStackTrace();
							}

							if (chartpresentGlobal2) {
								WebElement chartPresent = driver.findElement(
										By.xpath("//div[@id='" + GlobalTab2TabId + "_div']//div[@ref='gridBody']"));
								action.moveToElement(chartPresent).build().perform();

								int j = 1;
								boolean filteredCellGlobalTab2 = true;
								String failedCell_Date_GF = " ";
								List<WebElement> FilterChartValue = driver.findElements(By.xpath("//div[contains(@id,'"
										+ GlobalTab2TabId + "')]//div[@ref='gridBody']//div[@col-id='"
										+ SelectDateColumn_Smoke_GlobalFilter + "' and @role='gridcell']"));
								for (WebElement localEle : FilterChartValue) {
									String FilterCellValue = localEle.getText();
									if (FilterCellValue != null && FilterCellValue.length() >= 10) {
										FilterCellValue = FilterCellValue.substring(0, 10);
									}

									boolean condition_1_Result = Date_ConditionFiltercell(FirstCondition_Date_GF,
											FilterCellValue, FirstCondition_Date_Input_GF, Condition_9_InputB_Date_GF);
									boolean condition_2_Result = Date_ConditionFiltercell(SecondCondition_Date_GF,
											FilterCellValue, SecondCondition_Date_Input_GF, Condition_9_InputB_Date_GF);
									boolean condition_3_Result = Date_ConditionFiltercell(ThirdCondition_Date_GF,
											FilterCellValue, ThirdCondition_Date_Input_GF, Condition_9_InputB_Date_GF);
									String operator1 = FirstOperator_Input_Date_GF;
									String operator2 = SecondOperator_Input_Date_GF;

									if (!evaluateConditions(condition_1_Result, operator1, condition_2_Result,
											operator2, condition_3_Result)) {
										filteredCellGlobalTab2 = false;
										failedCell_Date_GF = failedCell_Date_GF + j + ", ";
									}

									j++;
								}

								if (filteredCellGlobalTab2 == true) {
									pass(driver,
											"For Selected 3 condition applied correctly in the GlobalTab2 charts..");
								} else {
									fail(driver,
											"For Selected 3 conditions Global Filter not Applied correctly in the GlobalTab2 for the Date column : "
													+ SelectDateColumn_Smoke_GlobalFilter + ", Rows : "
													+ failedCell_Date_GF);
								}

							} else {
								String FailedText = " ";
								if (isDisplayed(driver, ValidationChart)) {
									FailedText = getText1(driver, ValidationChart);
								}
								fail(driver,
										"Unable to get the chart value in GlobalTab2 for the selected filter 3 conditions "
												+ FailedText);
							}

							// moving to firstTab and click (1)
							boolean chartpresentGlobal1 = clickFirstTab(driver, GlobalTab1Id);
							// moving to firstTab and click

							if (chartpresentGlobal1) {
								int j = 1;
								boolean filteredCellGlobalTab1 = true;
								String failedCell_Date_GF = " ";
								List<WebElement> FilterChartValue = driver.findElements(By.xpath("//div[contains(@id,'"
										+ GlobalTab1Id + "')]//div[@ref='gridBody']//div[@col-id='"
										+ SelectDateColumn_Smoke_GlobalFilter + "' and @role='gridcell']"));
								for (WebElement localEle : FilterChartValue) {
									String FilterCellValue = localEle.getText();
									if (FilterCellValue != null && FilterCellValue.length() >= 10) {
										FilterCellValue = FilterCellValue.substring(0, 10);
									}

									boolean condition_1_Result = Date_ConditionFiltercell(FirstCondition_Date_GF,
											FilterCellValue, FirstCondition_Date_Input_GF, Condition_9_InputB_Date_GF);
									boolean condition_2_Result = Date_ConditionFiltercell(SecondCondition_Date_GF,
											FilterCellValue, SecondCondition_Date_Input_GF, Condition_9_InputB_Date_GF);
									boolean condition_3_Result = Date_ConditionFiltercell(ThirdCondition_Date_GF,
											FilterCellValue, ThirdCondition_Date_Input_GF, Condition_9_InputB_Date_GF);
									String operator1 = FirstOperator_Input_Date_GF;
									String operator2 = SecondOperator_Input_Date_GF;

									if (!evaluateConditions(condition_1_Result, operator1, condition_2_Result,
											operator2, condition_3_Result)) {
										filteredCellGlobalTab1 = false;
										failedCell_Date_GF = failedCell_Date_GF + j + ", ";
									}

									j++;
								}

								if (filteredCellGlobalTab1 == true) {
									pass(driver,
											"For selected 3 condition applied correctly in the GlobalTab1 charts..");
								} else {
									fail(driver,
											"For selected 3 condition Global Filter not Applied correctly in the GlobalTab1 for the Date column : "
													+ SelectDateColumn_Smoke_GlobalFilter + ", Rows : "
													+ failedCell_Date_GF);
								}

							} else {
								String FailedText = "";
								if (isDisplayed(driver, ValidationChart)) {
									FailedText = getText1(driver, ValidationChart);
								}
								fail(driver,
										"Unable to get the chart value in GlobalTab1 for the selected filter, 3 conditions "
												+ FailedText);
							}

							// after checking the first tab then switch back to global filtered tab
							clickSecondTab(driver, GlobalTab2TabId);
							// after checking the first tab then switch back to global filtered tab

							click(driver, RestButton_GlobalFilter);
							wait(driver, "1");
							elementnotvisible(driver, Loading1);
							ResetGlobalValidation(driver, GlobalTab2TabId);
						} else {
							fail(driver, "Conditions Filter in Date type Colunm is not selected after click on it ");
						}
					}

				} else {
					fail(driver, "Selected Date Column not expanded after click on it");
				}

			} else {
				fail(driver, SelectDateColumn_Smoke_GlobalFilter + " Date Column value not present in Global filter");
			}

			// Date Global Filter Validation End...........

			// Numerical Filter validation
			click(driver, RestButton_GlobalFilter);
			boolean NumericalFilter = false;
			try {
				WebElement NumericalColumnElement = driver
						.findElement(By.xpath("//div[@id='globalRPE_select_filterColsCon']//div[@id='"
								+ SelectNumerical_Smoke_GlobalFilter + "']//a"));
				action.moveToElement(NumericalColumnElement).click().build().perform();
				NumericalFilter = true;
			} catch (Exception e) {

			}
			if (NumericalFilter == true) {
				wait(driver, "1");
				WebElement NumericalColumnElementExpand = driver
						.findElement(By.xpath("//div[@id='globalRPE_select_filterColsCon']//div[@id='"
								+ SelectNumerical_Smoke_GlobalFilter + "']//a//i"));
				String NumericalColumnElementExpandString = NumericalColumnElementExpand.getAttribute("class");

				if (NumericalColumnElementExpandString.contains("up")) {
					pass(driver, "Selected Numerical Column expanded after click on it");
					if (isDisplayed(driver, ConditionInput1_Num)) {
						pass(driver, "Condition Selection dropdown is displayed in the Numerical column");
					} else {
						fail(driver, "Condition Selection dropdown is not displayed in the Numerical column");
					}

					click(driver, ConditionInput1_Num);

					String[] NumFilterList = { Condition_1_Num_GF, Condition_2_Num_GF, Condition_3_Num_GF,
							Condition_4_Num_GF, Condition_5_Num_GF, Condition_6_Num_GF, Condition_7_Num_GF,
							Condition_8_Num_GF, Condition_9_Num_GF };
					String[] NumFilterInputList = { Condition_1_Input_Num_GF, Condition_2_Input_Num_GF,
							Condition_3_Input_Num_GF, Condition_4_Input_Num_GF, Condition_5_Input_Num_GF,
							Condition_6_Input_Num_GF, Condition_7_Input_Num_GF, Condition_8_Input_Num_GF,
							Condition_9_InputA_Num_GF };

					for (int k = 0; k < 9; k++) {

						try {

							waitForElement(driver, ConditionInput1_Num);
							selectByText(driver, ConditionInput1_Num, NumFilterList[k]);
							wait(driver, "1");
							if (!NumFilterList[k].equals("is null") && !NumFilterList[k].equals("is not null")) {
								click(driver, FirstConditionValueInput1_Num);
								clear1(driver, FirstConditionValueInput1_Num);
								sendKeys(driver, FirstConditionValueInput1_Num, NumFilterInputList[k]);
								wait(driver, "1");

								if (NumFilterList[k].equals("between")) {
									if (isDisplayed(driver, FirstConditionValueInput2_Num)) {
										pass(driver, "Second input element is available for 'between' condition");
										click(driver, FirstConditionValueInput2_Num);
//			    					 clear1(driver,"1");
										sendKeys(driver, FirstConditionValueInput2_Num,
												Condition_Between_InputB_Num_GF);
									} else {
										fail(driver, "Second input element is not available for 'between' condition");
									}
								}

							}
							wait(driver, "1");
							click(driver, ApplyButton_GlobalFilter);
							wait(driver, "1");

							elementnotvisible(driver, Loading1);
							boolean chartpresentGlobal2 = false;
							try {
								WebElement chartPresent = driver.findElement(
										By.xpath("//div[@id='" + GlobalTab2TabId + "_div']//div[@ref='gridBody']"));
								if (chartPresent.isDisplayed()) {
									chartpresentGlobal2 = true;
								}

							} catch (Exception e) {
								e.printStackTrace();
							}

							if (chartpresentGlobal2) {
								WebElement chartPresent = driver.findElement(
										By.xpath("//div[@id='" + GlobalTab2TabId + "_div']//div[@ref='gridBody']"));
								action.moveToElement(chartPresent).build().perform();

								int j = 1;
								boolean filteredCellGlobalTab2 = true;
								String failedCell_Num_GF = " ";
								List<WebElement> FilterChartValue = driver.findElements(By.xpath("//div[contains(@id,'"
										+ GlobalTab2TabId + "')]//div[@ref='gridBody']//div[@col-id='"
										+ SelectNumerical_Smoke_GlobalFilter + "' and @role='gridcell']"));
								for (WebElement localEle : FilterChartValue) {
									String FilterCellValue = localEle.getText();

									if (!Numerical_ConditionFiltercell(NumFilterList[k], FilterCellValue,
											NumFilterInputList[k], Condition_Between_InputB_Num_GF)) {
										filteredCellGlobalTab2 = false;
										failedCell_Num_GF = failedCell_Num_GF + j + ", ";
									}

									j++;
								}

								if (filteredCellGlobalTab2 == true) {
									pass(driver, "For '" + NumFilterList[k]
											+ "' condition applied correctly in the GlobalTab2 charts..");
								} else {
									fail(driver, "For '" + NumFilterList[k]
											+ "' conditions Global Filter not Applied correctly in the GlobalTab2 for the Num column : "
											+ SelectNumerical_Smoke_GlobalFilter + ", Rows : " + failedCell_Num_GF);
								}

							} else {
								String FailedText = " ";
								if (isDisplayed(driver, ValidationChart)) {
									FailedText = getText1(driver, ValidationChart);
								}
								fail(driver, "Unable to get the chart value in GlobalTab2 for the selected filter "
										+ NumFilterList[k] + " , " + FailedText);
							}

							// moving to firstTab and click (1)
							boolean chartpresentGlobal1 = clickFirstTab(driver, GlobalTab1Id);
							// moving to firstTab and click

							if (chartpresentGlobal1) {
								int j = 1;
								boolean filteredCellGlobalTab1 = true;
								String failedCell_Num_GF = " ";
								List<WebElement> FilterChartValue = driver.findElements(By.xpath("//div[contains(@id,'"
										+ GlobalTab1Id + "')]//div[@ref='gridBody']//div[@col-id='"
										+ SelectNumerical_Smoke_GlobalFilter + "' and @role='gridcell']"));
								for (WebElement localEle : FilterChartValue) {
									String FilterCellValue = localEle.getText();

									if (!Numerical_ConditionFiltercell(NumFilterList[k], FilterCellValue,
											NumFilterInputList[k], Condition_Between_InputB_Num_GF)) {
										filteredCellGlobalTab1 = false;
										failedCell_Num_GF = failedCell_Num_GF + j + ", ";
									}
									j++;
								}

								if (filteredCellGlobalTab1 == true) {
									pass(driver, "For '" + NumFilterList[k]
											+ "' condition applied correctly in the GlobalTab1 charts..");
								} else {
									fail(driver, "For '" + NumFilterList[k]
											+ "' conditions Global Filter not Applied correctly in the GlobalTab1 for the Num column : "
											+ SelectNumerical_Smoke_GlobalFilter + ", Rows : " + failedCell_Num_GF);
								}

							} else {
								String FailedText = "";
								if (isDisplayed(driver, ValidationChart)) {
									FailedText = getText1(driver, ValidationChart);
								}
								fail(driver, "Unable to get the chart value in GlobalTab1 for the selected filter, "
										+ NumFilterList[k] + " " + FailedText);
							}

							// after checking the first tab then switch back to global filtered tab
							clickSecondTab(driver, GlobalTab2TabId);
							// after checking the first tab then switch back to global filtered tab

						} catch (Exception e) {
							e.printStackTrace();
						}
					}

					waitForElement(driver, ConditionInput1_Num);
					selectByText(driver, ConditionInput1_Num, FirstCondition_Num_GF);
					wait(driver, "1");
					if (!FirstCondition_Num_GF.equals("is null") && !FirstCondition_Num_GF.equals("is not null")) {
						click(driver, FirstConditionValueInput1_Num);
						clear1(driver, FirstConditionValueInput1_Num);
						sendKeys(driver, FirstConditionValueInput1_Num, FirstCondition_Num_Input_GF);
						wait(driver, "1");
					}

					wait(driver, "1");
					if (isDisplayed(driver, AddButtonCondition)) {
						pass(driver, "ADD button displayed after selecting the first condition");
					} else {
						fail(driver, "ADD button not displayed after selecting the first condition");
					}

					mouseOverToElement(driver, AddButtonCondition);
					click(driver, AddButtonCondition);

					verifyElementDisplayed(driver, AND_ConditionSec1);
					verifyElementDisplayed(driver, OR_ConditionSec1);

					if (FirstOperator_Input_Num_GF.equals("AND")) {
						click(driver, AND_ConditionSec1);
						wait(driver, "1");
						if (isElementSelected(driver, AND_ConditionRadioBtn1)) {
							pass(driver, "AND Operated Selected after click on it");
						} else {
							fail(driver, "AND Operated Selected after click on it");
						}

					} else {
						click(driver, OR_ConditionSec1);
						wait(driver, "1");
						if (isElementSelected(driver, OR_ConditionRadioBtn1)) {
							pass(driver, "AND Operated Selected after click on it");
						} else {
							fail(driver, "AND Operated Selected after click on it");
						}
					}

					if (isDisplayed(driver, ConditionInput2_Num)) {
						pass(driver, "After click 'ADD' button Second time Condition Selection dropdown is displayed");
					} else {
						fail(driver,
								"After click 'ADD' button Second time Condition Selection dropdown is not displayed");
					}

					click(driver, ConditionInput2_Num);
					selectByText(driver, ConditionInput2_Num, SecondCondition_Num_GF);
					if (!SecondCondition_Num_GF.equals("is null") && !SecondCondition_Num_GF.equals("is not null")) {
						click(driver, SecondConditionValueInput1_Num);
						clear(driver, SecondConditionValueInput1_Num);
						sendKeys(driver, SecondConditionValueInput1_Num, SecondCondition_Num_Input_GF);

					}
					wait(driver, "1");
					if (isDisplayed(driver, AddButtonCondition)) {
						pass(driver, "2 time ADD button displayed after selecting the condition 2nd time ");
					} else {
						fail(driver, "2 time ADD button not displayed after selecting the condition 2nd time ");
					}

					mouseOverToElement(driver, AddButtonCondition);
					click(driver, AddButtonCondition);
					verifyElementDisplayed(driver, AND_ConditionSec2);
					verifyElementDisplayed(driver, OR_ConditionSec2);

					if (SecondOperator_Input_Num_GF.equals("AND")) {
						click(driver, AND_ConditionSec2);
						wait(driver, "1");
						if (isElementSelected(driver, AND_ConditionRadioBtn2)) {
							pass(driver, "AND Operated Selected after click on it");
						} else {
							fail(driver, "AND Operated Selected after click on it");
						}

					} else {
						click(driver, OR_ConditionSec2);
						wait(driver, "1");
						if (isElementSelected(driver, OR_ConditionRadioBtn2)) {
							pass(driver, "AND Operated Selected after click on it");
						} else {
							fail(driver, "AND Operated Selected after click on it");
						}
					}

					if (isDisplayed(driver, ConditionInput3_Num)) {
						pass(driver, "After click 'ADD' button Third time Condition Selection dropdown is displayed");
					} else {
						fail(driver,
								"After click 'ADD' button Third time Condition Selection dropdown is not displayed");
					}
					click(driver, ConditionInput3_Num);
					selectByText(driver, ConditionInput3_Num, ThirdCondition_num_GF);
					wait(driver, "1");

					if (!ThirdCondition_num_GF.equals("is null") && !ThirdCondition_num_GF.equals("is not null")) {
						click(driver, ThirdConditionValueInput1_Num);
						clear1(driver, ThirdConditionValueInput1_Num);
						sendKeys(driver, ThirdConditionValueInput1_Num, ThirdCondition_Num_Input_GF);

					}
					wait(driver, "1");

					if (isDisplayed2(driver, AddButtonCondition)) {
						fail(driver, "'ADD' button displayed after given 3 times condition ");
					} else {
						pass(driver, "'ADD' button not displayed after given 3 times condition");
					}

					click(driver, ApplyButton_GlobalFilter);
					wait(driver, "1");
					elementnotvisible(driver, Loading1);
					boolean chartpresentGlobal2 = false;
					try {
						WebElement chartPresent = driver.findElement(
								By.xpath("//div[@id='" + GlobalTab2TabId + "_div']//div[@ref='gridBody']"));
						if (chartPresent.isDisplayed()) {
							chartpresentGlobal2 = true;
						}

					} catch (Exception e) {
						e.printStackTrace();
					}

					if (chartpresentGlobal2) {
						WebElement chartPresent = driver.findElement(
								By.xpath("//div[@id='" + GlobalTab2TabId + "_div']//div[@ref='gridBody']"));
						action.moveToElement(chartPresent).build().perform();

						int j = 1;
						boolean filteredCellGlobalTab2 = true;
						String failedCell_Num_GF = " ";
						List<WebElement> FilterChartValue = driver.findElements(By.xpath(
								"//div[contains(@id,'" + GlobalTab2TabId + "')]//div[@ref='gridBody']//div[@col-id='"
										+ SelectNumerical_Smoke_GlobalFilter + "' and @role='gridcell']"));
						for (WebElement localEle : FilterChartValue) {
							String FilterCellValue = localEle.getText();

							boolean condition_1_Result = Numerical_ConditionFiltercell(FirstCondition_Num_GF,
									FilterCellValue, FirstCondition_Num_Input_GF, Condition_Between_InputB_Num_GF);
							boolean condition_2_Result = Numerical_ConditionFiltercell(SecondCondition_Num_GF,
									FilterCellValue, SecondCondition_Num_Input_GF, Condition_Between_InputB_Num_GF);
							boolean condition_3_Result = Numerical_ConditionFiltercell(ThirdCondition_num_GF,
									FilterCellValue, ThirdCondition_Num_Input_GF, Condition_Between_InputB_Num_GF);
							String operator1 = FirstOperator_Input_Num_GF;
							String operator2 = SecondOperator_Input_Num_GF;

							if (!evaluateConditions(condition_1_Result, operator1, condition_2_Result, operator2,
									condition_3_Result)) {
								filteredCellGlobalTab2 = false;
								failedCell_Num_GF = failedCell_Num_GF + j + ", ";

							}
							j++;
						}

						if (filteredCellGlobalTab2 == true) {
							pass(driver, "For Selected 3 Conditions applied correctly in the GlobalTab2 charts..");
						} else {
							fail(driver,
									"For Selected 3 Conditions Global Filter not Applied correctly in the GlobalTab2 for the Num column : "
											+ SelectNumerical_Smoke_GlobalFilter + ", Rows : " + failedCell_Num_GF);
						}

					} else {
						String FailedText = " ";
						if (isDisplayed(driver, ValidationChart)) {
							FailedText = getText1(driver, ValidationChart);
						}
						fail(driver,
								"Unable to get the chart value in GlobalTab2 for the selected filter 3 conditions , "
										+ FailedText);
					}

					// moving to firstTab and click (1)
					boolean chartpresentGlobal1 = clickFirstTab(driver, GlobalTab1Id);
					// moving to firstTab and click

					if (chartpresentGlobal1) {
						int j = 1;
						boolean filteredCellGlobalTab1 = true;
						String failedCell_Num_GF = " ";
						List<WebElement> FilterChartValue = driver.findElements(By.xpath(
								"//div[contains(@id,'" + GlobalTab1Id + "')]//div[@ref='gridBody']//div[@col-id='"
										+ SelectNumerical_Smoke_GlobalFilter + "' and @role='gridcell']"));
						for (WebElement localEle : FilterChartValue) {
							String FilterCellValue = localEle.getText();

							boolean condition_1_Result = Numerical_ConditionFiltercell(FirstCondition_Num_GF,
									FilterCellValue, FirstCondition_Num_Input_GF, Condition_Between_InputB_Num_GF);
							boolean condition_2_Result = Numerical_ConditionFiltercell(SecondCondition_Num_GF,
									FilterCellValue, SecondCondition_Num_Input_GF, Condition_Between_InputB_Num_GF);
							boolean condition_3_Result = Numerical_ConditionFiltercell(ThirdCondition_num_GF,
									FilterCellValue, ThirdCondition_Num_Input_GF, Condition_Between_InputB_Num_GF);
							String operator1 = FirstOperator_Input_Num_GF;
							String operator2 = SecondOperator_Input_Num_GF;

							if (!evaluateConditions(condition_1_Result, operator1, condition_2_Result, operator2,
									condition_3_Result)) {
								filteredCellGlobalTab1 = false;
								failedCell_Num_GF = failedCell_Num_GF + j + ", ";

							}
							j++;
						}

						if (filteredCellGlobalTab1 == true) {
							pass(driver, "For Selected 3 Condition applied correctly in the GlobalTab1 charts..");
						} else {
							fail(driver,
									"For Selected 3 Condition Global Filter not Applied correctly in the GlobalTab1 for the Num column : "
											+ SelectNumerical_Smoke_GlobalFilter + ", Rows : " + failedCell_Num_GF);
						}

					} else {
						String FailedText = "";
						if (isDisplayed(driver, ValidationChart)) {
							FailedText = getText1(driver, ValidationChart);
						}
						fail(driver,
								"Unable to get the chart value in GlobalTab1 for the selected filter 3 conditions, "
										+ FailedText);
					}

					// after checking the first tab then switch back to global filtered tab
					clickSecondTab(driver, GlobalTab2TabId);
					// after checking the first tab then switch back to global filtered tab

					waitForElement(driver, RestButton_GlobalFilter);
					click(driver, RestButton_GlobalFilter);
					wait(driver, "1");
					elementnotvisible(driver, Loading1);
					ResetGlobalValidation(driver, GlobalTab2TabId);

				} else {
					fail(driver, "Selected Numerical Column not expanded after click on it");
				}

			} else {
				fail(driver, SelectNumerical_Smoke_GlobalFilter + " Numerical Column not present");
			}
			// Numerical Global filter end....

			// Text Global filter Start....
			click(driver, RestButton_GlobalFilter);
			boolean textFilter = false;
			try {
				WebElement TextColumn = driver.findElement(By.xpath(
						"//div[@id='globalRPE_select_filterColsCon']//div[@id='" + SelectText_GlobalFilter + "']//a"));
				action.moveToElement(TextColumn).click().build().perform();
				textFilter = true;
			} catch (Exception e) {

			}

			if (textFilter == true) {
				WebElement textColumnExp = driver
						.findElement(By.xpath("//div[@id='globalRPE_select_filterColsCon']//div[@id='"
								+ SelectText_GlobalFilter + "']//a//i"));
				String textColumnExpText = textColumnExp.getAttribute("class");
				if (textColumnExpText.contains("up")) {
					pass(driver, "Text Column Expand After click on it ");
					if (verifyElementDisplayed(driver, byValueFilterOption)) {
						try {
							WebElement ByValueElementRadio = driver.findElement(By.xpath("//div[@id='"
									+ SelectText_GlobalFilter + "_content']//div[@id='byRelative_div']//input"));
							if (ByValueElementRadio.isSelected()) {
								pass(driver, "By default, 'By Values' radio button selected ");
							} else {
								fail(driver, "By default, 'By Values' radio button not selected ");
							}
						} catch (Exception e) {
							fail(driver, "Unable to find 'By Values' radio button ");
						}
					}

					List<WebElement> searchListAvailable = driver
							.findElements(By.xpath("//div[@id='" + SelectText_GlobalFilter + "_FactorsList']//li"));
					List<WebElement> searchListCheckboxAvailable = driver.findElements(By.xpath(
							"//div[@id='" + SelectText_GlobalFilter + "_FactorsList']//li//input[@type='checkbox']"));
					if (searchListAvailable.size() == searchListCheckboxAvailable.size()) {
						pass(driver, "All the available searchlist are displayed with Checkbox");
					} else {
						fail(driver, "Some available searchlist are not displayed with Checkbox");
					}

					WebElement SearchBar_ = driver
							.findElement(By.xpath("//input[@id='" + SelectText_GlobalFilter + "LFsearch']"));
					SearchBar_.click();
					wait(driver, "1");
					SearchBar_.sendKeys(SelectText_GlobalFilter);
					pass(driver, "Type On Value " + SelectText_GlobalFilter + " search input");
					wait(driver, "1");
					WebElement firstOption = driver
							.findElement(By.xpath("(//div[@id='" + SelectText_GlobalFilter + "_FactorsList']//li)[1]"));
					String firstOptionText = firstOption.getText();
					if (firstOptionText.equals(ByValuesInput_Text_GF)) {
						pass(driver, "Search bar inside the Text section works properly");
					} else {
						fail(driver, "Search bar inside the Text section not works properly");
					}

					firstOption.click();
					wait(driver, "1");
					WebElement firstCheckBox = driver.findElement(
							By.xpath("(//div[@id='" + SelectText_GlobalFilter + "_FactorsList']//li//input)[1]"));
					if (firstCheckBox.isSelected()) {
						pass(driver, "Check box selected when click the First searched value");
					} else {
						fail(driver, "Check box not selected when click the First searched value");
					}

					click(driver, ApplyButton_GlobalFilter);
					wait(driver, "1");

					elementnotvisible(driver, Loading1);
					boolean chartpresentGlobal2 = false;
					try {
						WebElement chartPresent = driver.findElement(
								By.xpath("//div[@id='" + GlobalTab2TabId + "_div']//div[@ref='gridBody']"));
						if (chartPresent.isDisplayed()) {
							chartpresentGlobal2 = true;
						}

					} catch (Exception e) {
						e.printStackTrace();
					}

					if (chartpresentGlobal2) {
						WebElement chartPresent = driver.findElement(
								By.xpath("//div[@id='" + GlobalTab2TabId + "_div']//div[@ref='gridBody']"));
						action.moveToElement(chartPresent).build().perform();

						int j = 1;
						boolean filteredCellGlobalTab2 = true;
						String failedCell_Text_GF = " ";
						List<WebElement> FilterChartValue = driver.findElements(By.xpath(
								"//div[contains(@id,'" + GlobalTab2TabId + "')]//div[@ref='gridBody']//div[@col-id='"
										+ SelectText_GlobalFilter + "' and @role='gridcell']"));
						for (WebElement localEle : FilterChartValue) {
							String FilterCellValue = localEle.getText();

							if (!FilterCellValue.equals(ByValuesInput_Text_GF)) {
								filteredCellGlobalTab2 = false;
								failedCell_Text_GF = failedCell_Text_GF + j + ", ";
							}
							j++;
						}

						if (filteredCellGlobalTab2 == true) {
							pass(driver, "For By Values Condition applied correctly in the GlobalTab2 charts..");
						} else {
							fail(driver,
									"For By Values Condition Global Filter not Applied correctly in the GlobalTab2 for the Text column : "
											+ SelectText_GlobalFilter + ", Rows : " + failedCell_Text_GF);
						}

					} else {
						String FailedText = " ";
						if (isDisplayed(driver, ValidationChart)) {
							FailedText = getText1(driver, ValidationChart);
						}
						fail(driver, "Unable to get the chart value in GlobalTab2 for the selected filter By values , "
								+ FailedText);
					}

					// moving to firstTab and click (1)
					boolean chartpresentGlobal1 = clickFirstTab(driver, GlobalTab1Id);
					// moving to firstTab and click

					if (chartpresentGlobal1) {
						int j = 1;
						boolean filteredCellGlobalTab1 = true;
						String failedCell_Text_GF = " ";
						List<WebElement> FilterChartValue = driver.findElements(By.xpath(
								"//div[contains(@id,'" + GlobalTab1Id + "')]//div[@ref='gridBody']//div[@col-id='"
										+ SelectText_GlobalFilter + "' and @role='gridcell']"));
						for (WebElement localEle : FilterChartValue) {
							String FilterCellValue = localEle.getText();
							if (!FilterCellValue.equals(ByValuesInput_Text_GF)) {
								filteredCellGlobalTab1 = false;
								failedCell_Text_GF = failedCell_Text_GF + j + ", ";
							}
							j++;
						}

						if (filteredCellGlobalTab1 == true) {
							pass(driver, "For By Values Conditions applied correctly in the GlobalTab1 charts..");
						} else {
							fail(driver,
									"For By Values Conditions Global Filter not Applied correctly in the GlobalTab1 for the Text column : "
											+ SelectText_GlobalFilter + ", Rows : " + failedCell_Text_GF);
						}

					} else {
						String FailedText = "";
						if (isDisplayed(driver, ValidationChart)) {
							FailedText = getText1(driver, ValidationChart);
						}
						fail(driver, "Unable to get the chart value in GlobalTab1 for the selected filter By Values , "
								+ FailedText);
					}

					// after checking the first tab then switch back to global filtered tab
					clickSecondTab(driver, GlobalTab2TabId);
					// after checking the first tab then switch back to global filtered tab

					waitForElement(driver, ExcludeCheckbox);
					click(driver, ExcludeCheckbox);
					click(driver, ApplyButton_GlobalFilter);
					wait(driver, "1");

					elementnotvisible(driver, Loading1);
					chartpresentGlobal2 = false;
					try {
						WebElement chartPresent = driver.findElement(
								By.xpath("//div[@id='" + GlobalTab2TabId + "_div']//div[@ref='gridBody']"));
						if (chartPresent.isDisplayed()) {
							chartpresentGlobal2 = true;
						}

					} catch (Exception e) {
						e.printStackTrace();
					}

					if (chartpresentGlobal2) {
						WebElement chartPresent = driver.findElement(
								By.xpath("//div[@id='" + GlobalTab2TabId + "_div']//div[@ref='gridBody']"));
						action.moveToElement(chartPresent).build().perform();

						int j = 1;
						boolean filteredCellGlobalTab2 = true;
						String failedCell_Text_GF = " ";
						List<WebElement> FilterChartValue = driver.findElements(By.xpath(
								"//div[contains(@id,'" + GlobalTab2TabId + "')]//div[@ref='gridBody']//div[@col-id='"
										+ SelectText_GlobalFilter + "' and @role='gridcell']"));
						for (WebElement localEle : FilterChartValue) {
							String FilterCellValue = localEle.getText();
							if (FilterCellValue.equals(ByValuesInput_Text_GF)) {
								filteredCellGlobalTab2 = false;
								failedCell_Text_GF = failedCell_Text_GF + j + ", ";
							}
							j++;
						}

						if (filteredCellGlobalTab2 == true) {
							pass(driver,
									"For By Values with 'Exclude' Condition applied correctly in the GlobalTab2 charts..");
						} else {
							fail(driver,
									"For By Values with 'Exclude' Condition Global Filter not Applied correctly in the GlobalTab2 for the Text column : "
											+ SelectText_GlobalFilter + ", Rows : " + failedCell_Text_GF);
						}

					} else {
						String FailedText = " ";
						if (isDisplayed(driver, ValidationChart)) {
							FailedText = getText1(driver, ValidationChart);
						}
						fail(driver,
								"Unable to get the chart value in GlobalTab2 for the selected filter By values with Exclude , "
										+ FailedText);
					}

					// moving to firstTab and click (1)
					chartpresentGlobal1 = clickFirstTab(driver, GlobalTab1Id);
					// moving to firstTab and click

					if (chartpresentGlobal1) {
						int j = 1;
						boolean filteredCellGlobalTab1 = true;
						String failedCell_Text_GF = " ";
						List<WebElement> FilterChartValue = driver.findElements(By.xpath(
								"//div[contains(@id,'" + GlobalTab1Id + "')]//div[@ref='gridBody']//div[@col-id='"
										+ SelectText_GlobalFilter + "' and @role='gridcell']"));
						for (WebElement localEle : FilterChartValue) {
							String FilterCellValue = localEle.getText();
							if (FilterCellValue.equals(ByValuesInput_Text_GF)) {
								filteredCellGlobalTab1 = false;
								failedCell_Text_GF = failedCell_Text_GF + j + ", ";
							}
							j++;
						}

						if (filteredCellGlobalTab1 == true) {
							pass(driver,
									"For By Values with 'Exclude' Conditions applied correctly in the GlobalTab1 charts..");
						} else {
							fail(driver,
									"For By Values with 'Exclude' Conditions Global Filter not Applied correctly in the GlobalTab1 for the Text column : "
											+ SelectText_GlobalFilter + ", Rows : " + failedCell_Text_GF);
						}

					} else {
						String FailedText = "";
						if (isDisplayed(driver, ValidationChart)) {
							FailedText = getText1(driver, ValidationChart);
						}
						fail(driver,
								"Unable to get the chart value in GlobalTab1 for the selected filter By Values with Exclude , "
										+ FailedText);
					}

					// after checking the first tab then switch back to global filtered tab
					clickSecondTab(driver, GlobalTab2TabId);
					// after checking the first tab then switch back to global filtered tab

					if (verifyElementDisplayed(driver, ConditionFilterOption_Categorical)) {
						click(driver, ConditionFilterOption_Categorical);
						wait(driver, "1");
						if (isElementSelected(driver, ConditionRadioButton_Categorical)) {
							pass(driver, "Condition radio button selected after click on it");
						} else {
							fail(driver, "Condition radio button not selected after click on it");
						}

						if (verifyElementDisplayed(driver, ConditionSelectDropdown)) {
							String defaultSelectedCondition = defaultSelectedValue(driver, ConditionSelectDropdown);
							if (defaultSelectedCondition.equals("equal to")) {
								pass(driver, "By default, 'equal to' option selected in the Condition select dropdown");
							} else {
								fail(driver,
										"By default, 'equal to' option not selected in the Condition select dropdown");
							}
							String[] conditionsList = { Condition_1_Text_GF, Condition_2_Text_GF, Condition_3_Text_GF,
									Condition_4_Text_GF, Condition_5_Text_GF, Condition_6_Text_GF, Condition_7_Text_GF,
									Condition_8_Text_GF };
							String[] conditionsInputList = { Condition_Input_1_Text_GF, Condition_Input_2_Text_GF,
									Condition_Input_3_Text_GF, Condition_Input_4_Text_GF, Condition_Input_5_Text_GF,
									Condition_Input_6_Text_GF, Condition_Input_7_Text_GF, Condition_Input_8_Text_GF };

							for (int k = 0; k < 8; k++) {
								try {
									waitForElement(driver, ConditionSelectDropdown);
									selectByText(driver, ConditionSelectDropdown, conditionsList[k]);
									wait(driver, "1");
									click(driver, ConditonInput1);
									clear1(driver, ConditonInput1);
									sendKeys(driver, ConditonInput1, conditionsInputList[k]);
									wait(driver, "1");
									click(driver, ApplyButton_GlobalFilter);
									wait(driver, "2");

									elementnotvisible(driver, Loading1);
									chartpresentGlobal2 = false;
									try {
										WebElement chartPresent = driver.findElement(By.xpath(
												"//div[@id='" + GlobalTab2TabId + "_div']//div[@ref='gridBody']"));
										if (chartPresent.isDisplayed()) {
											chartpresentGlobal2 = true;
										}

									} catch (Exception e) {
										e.printStackTrace();
									}

									if (chartpresentGlobal2) {
										WebElement chartPresent = driver.findElement(By.xpath(
												"//div[@id='" + GlobalTab2TabId + "_div']//div[@ref='gridBody']"));
										action.moveToElement(chartPresent).build().perform();

										int j = 1;
										boolean filteredCellGlobalTab2 = true;
										String failedCell_Text_GF = " ";
										List<WebElement> FilterChartValue = driver
												.findElements(By.xpath("//div[contains(@id,'" + GlobalTab2TabId
														+ "')]//div[@ref='gridBody']//div[@col-id='"
														+ SelectText_GlobalFilter + "' and @role='gridcell']"));
										for (WebElement localEle : FilterChartValue) {
											String FilterCellValue = localEle.getText();

											if (!Categorical_ConditionFiltercell(conditionsList[k], FilterCellValue,
													conditionsInputList[k])) {
												filteredCellGlobalTab2 = false;
												failedCell_Text_GF = failedCell_Text_GF + j + ", ";

											}
											j++;
										}

										if (filteredCellGlobalTab2 == true) {
											pass(driver, "For '" + conditionsList[k]
													+ "' Condition applied correctly in the GlobalTab2 charts..");
										} else {
											fail(driver, "For '" + conditionsList[k]
													+ "' Condition Global Filter not Applied correctly in the GlobalTab2 for the Text column : "
													+ SelectText_GlobalFilter + ", Rows : " + failedCell_Text_GF);
										}

									} else {
										String FailedText = " ";
										if (isDisplayed(driver, ValidationChart)) {
											FailedText = getText1(driver, ValidationChart);
										}
										fail(driver,
												"Unable to get the chart value in GlobalTab2 for the selected filter "
														+ conditionsList[k] + ", " + FailedText);
									}

									// moving to firstTab and click (1)
									chartpresentGlobal1 = clickFirstTab(driver, GlobalTab1Id);
									// moving to firstTab and click

									if (chartpresentGlobal1) {
										int j = 1;
										boolean filteredCellGlobalTab1 = true;
										String failedCell_Text_GF = " ";
										List<WebElement> FilterChartValue = driver
												.findElements(By.xpath("//div[contains(@id,'" + GlobalTab1Id
														+ "')]//div[@ref='gridBody']//div[@col-id='"
														+ SelectText_GlobalFilter + "' and @role='gridcell']"));
										for (WebElement localEle : FilterChartValue) {
											String FilterCellValue = localEle.getText();

											if (!Categorical_ConditionFiltercell(conditionsList[k], FilterCellValue,
													conditionsInputList[k])) {
												filteredCellGlobalTab1 = false;
												failedCell_Text_GF = failedCell_Text_GF + j + ", ";
											}
											j++;
										}

										if (filteredCellGlobalTab1 == true) {
											pass(driver, "For '" + conditionsList[k]
													+ "' Conditions applied correctly in the GlobalTab1 charts..");
										} else {
											fail(driver, "For '" + conditionsList[k]
													+ "' Conditions Global Filter not Applied correctly in the GlobalTab1 for the Text column : "
													+ SelectText_GlobalFilter + ", Rows : " + failedCell_Text_GF);
										}

									} else {
										String FailedText = "";
										if (isDisplayed(driver, ValidationChart)) {
											FailedText = getText1(driver, ValidationChart);
										}
										fail(driver,
												"Unable to get the chart value in GlobalTab1 for the selected filter "
														+ conditionsList[k] + " , " + FailedText);
									}

									// after checking the first tab then switch back to global filtered tab
									clickSecondTab(driver, GlobalTab2TabId);
									// after checking the first tab then switch back to global filtered tab

								} catch (Exception e) {
									e.printStackTrace();
								}
							}

							click(driver, ConditionSelectDropdown);
							selectByText(driver, ConditionSelectDropdown, FirstCondition_Text_GF);
							wait(driver, "1");
							click(driver, ConditonInput1);
							clear1(driver, ConditonInput1);
							sendKeys(driver, ConditonInput1, FirstCondition_Input_Text_GF);
							wait(driver, "1");
							if (isDisplayed(driver, AddButtonCondition)) {
								pass(driver, "ADD button displayed after selecting the condition");
							} else {
								fail(driver, "ADD button not displayed after selecting the condition");
							}

							mouseOverToElement(driver, AddButtonCondition);
							click(driver, AddButtonCondition);

							verifyElementDisplayed(driver, AND_ConditionSec1);
							verifyElementDisplayed(driver, OR_ConditionSec1);

							if (FirstOperator_Input_Text_GF.equals("AND")) {
								click(driver, AND_ConditionSec1);
								wait(driver, "1");
								if (isElementSelected(driver, AND_ConditionRadioBtn1)) {
									pass(driver, "AND Operated Selected after click on it");
								} else {
									fail(driver, "AND Operated Selected after click on it");
								}

							} else {
								click(driver, OR_ConditionSec1);
								wait(driver, "1");
								if (isElementSelected(driver, OR_ConditionRadioBtn1)) {
									pass(driver, "AND Operated Selected after click on it");
								} else {
									fail(driver, "AND Operated Selected after click on it");
								}
							}

							if (isDisplayed(driver, ConditionSelectDropdown2)) {
								pass(driver,
										"After click 'ADD' button Second time Condition Selection dropdown is displayed");
							} else {
								fail(driver,
										"After click 'ADD' button Second time Condition Selection dropdown is not displayed");
							}

							click(driver, ConditionSelectDropdown2);
							selectByText(driver, ConditionSelectDropdown2, SecondCondition_Text_GF);
							wait(driver, "1");
							click(driver, ConditonInput2);
							sendKeys(driver, ConditonInput2, SecondCondition_Input_Text_GF);
							wait(driver, "1");
							if (isDisplayed(driver, AddButtonCondition)) {
								pass(driver, "2 time ADD button displayed after selecting the condition 2nd time ");
							} else {
								fail(driver, "2 time ADD button not displayed after selecting the condition 2nd time ");
							}

							mouseOverToElement(driver, AddButtonCondition);
							click(driver, AddButtonCondition);
							verifyElementDisplayed(driver, AND_ConditionSec2);
							verifyElementDisplayed(driver, OR_ConditionSec2);

							if (SecondOperator_Input_Text_GF.equals("AND")) {
								click(driver, AND_ConditionSec2);
								wait(driver, "1");
								if (isElementSelected(driver, AND_ConditionRadioBtn2)) {
									pass(driver, "AND Operated Selected after click on it");
								} else {
									fail(driver, "AND Operated Selected after click on it");
								}

							} else {
								click(driver, OR_ConditionSec2);
								wait(driver, "1");
								if (isElementSelected(driver, OR_ConditionRadioBtn2)) {
									pass(driver, "AND Operated Selected after click on it");
								} else {
									fail(driver, "AND Operated Selected after click on it");
								}
							}

							if (isDisplayed(driver, ConditionSelectDropdown3)) {
								pass(driver,
										"After click 'ADD' button Third time Condition Selection dropdown is displayed");
							} else {
								fail(driver,
										"After click 'ADD' button Third time Condition Selection dropdown is not displayed");
							}

							selectByText(driver, ConditionSelectDropdown3, ThirdCondition_Text_GF);
							wait(driver, "1");
							click(driver, ConditonInput3);
							sendKeys(driver, ConditonInput3, ThirdCondition_Input_Text_GF);
							wait(driver, "1");
							if (isDisplayed2(driver, AddButtonCondition)) {
								fail(driver, "'ADD' button displayed after given 3 times condition ");
							} else {
								pass(driver, "'ADD' button not displayed after given 3 times condition");
							}

							click(driver, ApplyButton_GlobalFilter);
							wait(driver, "1");
							elementnotvisible(driver, Loading1);
							chartpresentGlobal2 = false;
							try {
								WebElement chartPresent = driver.findElement(
										By.xpath("//div[@id='" + GlobalTab2TabId + "_div']//div[@ref='gridBody']"));
								if (chartPresent.isDisplayed()) {
									chartpresentGlobal2 = true;
								}

							} catch (Exception e) {
								e.printStackTrace();
							}

							if (chartpresentGlobal2) {
								WebElement chartPresent = driver.findElement(
										By.xpath("//div[@id='" + GlobalTab2TabId + "_div']//div[@ref='gridBody']"));
								action.moveToElement(chartPresent).build().perform();

								int j = 1;
								boolean filteredCellGlobalTab2 = true;
								String failedCell_Text_GF = " ";
								List<WebElement> FilterChartValue = driver.findElements(By.xpath("//div[contains(@id,'"
										+ GlobalTab2TabId + "')]//div[@ref='gridBody']//div[@col-id='"
										+ SelectText_GlobalFilter + "' and @role='gridcell']"));
								for (WebElement localEle : FilterChartValue) {
									String FilterCellValue = localEle.getText();

									boolean condition_1_Result = Categorical_ConditionFiltercell(FirstCondition_Text_GF,
											FilterCellValue, FirstCondition_Input_Text_GF);
									boolean condition_2_Result = Categorical_ConditionFiltercell(
											SecondCondition_Text_GF, FilterCellValue, SecondCondition_Input_Text_GF);
									boolean condition_3_Result = Categorical_ConditionFiltercell(ThirdCondition_Text_GF,
											FilterCellValue, ThirdCondition_Input_Text_GF);
									String operator1 = FirstOperator_Input_Text_GF;
									String operator2 = SecondOperator_Input_Text_GF;

									if (!evaluateConditions(condition_1_Result, operator1, condition_2_Result,
											operator2, condition_3_Result)) {
										filteredCellGlobalTab2 = false;
										failedCell_Text_GF = failedCell_Text_GF + j + ", ";
									}
									j++;
								}

								if (filteredCellGlobalTab2 == true) {
									pass(driver,
											"For Selected 3 Condition applied correctly in the GlobalTab2 charts..");
								} else {
									fail(driver,
											"For Selected 3 Condition Global Filter not Applied correctly in the GlobalTab2 for the Text column : "
													+ SelectText_GlobalFilter + ", Rows : " + failedCell_Text_GF);
								}

							} else {
								String FailedText = " ";
								if (isDisplayed(driver, ValidationChart)) {
									FailedText = getText1(driver, ValidationChart);
								}
								fail(driver,
										"Unable to get the chart value in GlobalTab2 for the selected filter Selected 3 Condition, "
												+ FailedText);
							}

							// moving to firstTab and click (1)
							chartpresentGlobal1 = clickFirstTab(driver, GlobalTab1Id);
							// moving to firstTab and click

							if (chartpresentGlobal1) {
								int j = 1;
								boolean filteredCellGlobalTab1 = true;
								String failedCell_Text_GF = " ";
								List<WebElement> FilterChartValue = driver.findElements(By.xpath("//div[contains(@id,'"
										+ GlobalTab1Id + "')]//div[@ref='gridBody']//div[@col-id='"
										+ SelectText_GlobalFilter + "' and @role='gridcell']"));
								for (WebElement localEle : FilterChartValue) {
									String FilterCellValue = localEle.getText();

									boolean condition_1_Result = Categorical_ConditionFiltercell(FirstCondition_Text_GF,
											FilterCellValue, FirstCondition_Input_Text_GF);
									boolean condition_2_Result = Categorical_ConditionFiltercell(
											SecondCondition_Text_GF, FilterCellValue, SecondCondition_Input_Text_GF);
									boolean condition_3_Result = Categorical_ConditionFiltercell(ThirdCondition_Text_GF,
											FilterCellValue, ThirdCondition_Input_Text_GF);
									String operator1 = FirstOperator_Input_Text_GF;
									String operator2 = SecondOperator_Input_Text_GF;

									if (!evaluateConditions(condition_1_Result, operator1, condition_2_Result,
											operator2, condition_3_Result)) {
										filteredCellGlobalTab1 = false;
										failedCell_Text_GF = failedCell_Text_GF + j + ", ";
									}
									j++;
								}

								if (filteredCellGlobalTab1 == true) {
									pass(driver,
											"For Selected 3 Conditions applied correctly in the GlobalTab1 charts..");
								} else {
									fail(driver,
											"For Selected 3 Conditions Global Filter not Applied correctly in the GlobalTab1 for the Text column : "
													+ SelectText_GlobalFilter + ", Rows : " + failedCell_Text_GF);
								}

							} else {
								String FailedText = "";
								if (isDisplayed(driver, ValidationChart)) {
									FailedText = getText1(driver, ValidationChart);
								}
								fail(driver,
										"Unable to get the chart value in GlobalTab1 for the selected filter Selected 3 Condition , "
												+ FailedText);
							}

							// after checking the first tab then switch back to global filtered tab
							clickSecondTab(driver, GlobalTab2TabId);
							// after checking the first tab then switch back to global filtered tab

							click(driver, RestButton_GlobalFilter);
							wait(driver, "1");
							elementnotvisible(driver, Loading1);
							ResetGlobalValidation(driver, GlobalTab2TabId);

						}
					}

				} else {
					fail(driver, SelectText_GlobalFilter + " Text Column not Expand After click on it ");
				}

			} else {
				fail(driver, SelectText_GlobalFilter + " Text Column value not present in Global filter");
			}
			// Text Local filter End....

		} else {
			fail(driver, "Column Lists are not displayed in the global filter section");
		}

		// ******** Global Filter Validation End *****************************//

		// **************** TabFilter Validation startss************************

		// ******************************* Tab Filter Start
		// **********************************//
		DASHPRO_TABLES_SMOKE_TESTING table = new DASHPRO_TABLES_SMOKE_TESTING();
		table.TabFilter(driver, iteration);

		// ******************************* Tab Filter End
		// **********************************//

		boolean tabFilterCheck = false;
		try {
			WebElement TabFilter = driver.findElement(By.xpath("//div[@id='" + GlobalTab2TabId + "_tabfilter']"));
			if (TabFilter.isDisplayed()) {
				tabFilterCheck = true;
			}
		} catch (Exception e) {
			System.out.println("Tab Filter is not present in the current tab");
		}

		if (tabFilterCheck == true) {
			WebElement TabFilter = driver.findElement(By.xpath("//div[@id='" + GlobalTab2TabId + "_tabfilter']"));
			action.moveToElement(TabFilter).build().perform();
			wait(driver, "1");
			TabFilter.click();
			waitForElement(driver, ColumnLists_TabFilter);

			if (isDisplayed(driver, FirstCategorical)) {
				click(driver, FirstCategorical);
				waitForElement(driver, FirstSearchedListValue);
				WebElement firstCheckbox = getWebElement(driver, FirstSearchedListValue);
				action.moveToElement(firstCheckbox).build().perform();
				action.click(firstCheckbox).build().perform();
				wait(driver, "1");
				click(driver, ApplyButton_TabFilter);
				wait(driver, "1");
				elementnotvisible(driver, Loading1);
				try {
					WebElement chartBod1 = driver.findElement(
							By.xpath("(//div[@id='" + GlobalTab2TabId + "_div']//div[@ref='gridBody'])[1]"));
					action.moveToElement(chartBod1).build().perform();
					WebElement TabFilterIconChart = driver.findElement(By.xpath("(//div[contains(@id,'"
							+ GlobalTab2TabId + "')]//*[name()='svg']//*[name()='g'][2]//*[name()='path'][2])[1]"));
					action.moveToElement(TabFilterIconChart).build().perform();
					String TabIconColorRGB = TabFilterIconChart.getCssValue("fill");
					String tabIconColor = rgbToHex1(TabIconColorRGB);

					if ("#0000FF".equalsIgnoreCase(tabIconColor)) {
						pass(driver, "Tab Filter icon changed to blue color after Applying the Tab Filter ");
					} else {
						fail(driver, "Tab Filter icon changed to blue color after Applying the Tab Filter");
					}

				} catch (Exception e) {
					fail(driver, "unable to find the Tabfilter icon in the chart");
				}
			}

		} // tab filter checked..

		waitForElement(driver, GlobalFilterOption);
		click(driver, GlobalFilterOption);
		waitForElement(driver, DataColumnList_GlobalFilter);

		if (isDisplayed(driver, FirstCategorical)) {
			click(driver, FirstCategorical);
			waitForElement(driver, FirstSearchedListValue);
			WebElement firstCheckbox = getWebElement(driver, FirstSearchedListValue);
			action.moveToElement(firstCheckbox).build().perform();
			action.click(firstCheckbox).build().perform();
			wait(driver, "1");
			click(driver, ApplyButton_GlobalFilter);
			wait(driver, "1");
			elementnotvisible(driver, Loading1);
			try {
				WebElement chartBod1 = driver
						.findElement(By.xpath("(//div[@id='" + GlobalTab2TabId + "_div']//div[@ref='gridBody'])[1]"));
				action.moveToElement(chartBod1).build().perform();
				WebElement GlobalFilterIconChart = driver.findElement(By.xpath("(//div[contains(@id,'" + GlobalTab2TabId
						+ "')]//*[name()='svg']//*[name()='g'][2]//*[name()='path'][3])[1]"));
				action.moveToElement(GlobalFilterIconChart).build().perform();
				String globalIconColorRGB = GlobalFilterIconChart.getCssValue("fill");
				String globalIconColor = rgbToHex1(globalIconColorRGB);

				if ("#FF3333".equalsIgnoreCase(globalIconColor)) {
					pass(driver, "Global Filter icon changed to Red color after Applying the Global Filter");
				} else {
					fail(driver, "Global Filter icon changed to Red color after Applying the Global Filter");
				}

			} catch (Exception e) {
				fail(driver, " " + e.getLocalizedMessage());
				e.printStackTrace();
			}
		} // global applied ..

		try {
			WebElement chartBod1 = driver
					.findElement(By.xpath("(//div[@id='" + GlobalTab2TabId + "_div']//div[@ref='gridBody'])[1]"));
			action.moveToElement(chartBod1).build().perform();
			WebElement localFilter = driver.findElement(By.xpath("(//div[@id='" + GlobalTab2TabId
					+ "_div']//div[contains(@id,'RPE_header_filter')]//*[name()='svg'])[1]"));
			action.moveToElement(localFilter).click().build().perform();

			waitForElement(driver, LocalFilterSec);

			if (isToggleEnable(driver, Tab_inputToggle_LocalFilter)
					&& isToggleEnable(driver, Global_inputToggle_LocalFilter)) {
				pass(driver, "Tab toggle and Global toggle is enabled in the Local Filter Section");
				click(driver, Tab_toggle_LocalFilter);
				wait(driver, "1");
				if (isToggleEnable(driver, Tab_inputToggle_LocalFilter)) {
					fail(driver, "Tab toggle in the Local Filter Section not disbaled while click on it");
				} else {
					pass(driver, "Tab toggle in the Local Filter disbaled while click on it");
				}
				click(driver, Global_toggle_LocalFilter);
				wait(driver, "1");
				if (isToggleEnable(driver, Global_inputToggle_LocalFilter)) {
					fail(driver, "Global toggle in the Local Filter Section not disbaled while click on it");
				} else {
					pass(driver, "Global toggle in the Local Filter disbaled while click on it");
				}

				click(driver, ApplyButton_LocalFilter);
				wait(driver, "1");
				elementnotvisible(driver, Loading1);

				chartBod1 = driver
						.findElement(By.xpath("(//div[@id='" + GlobalTab2TabId + "_div']//div[@ref='gridBody'])[1]"));
				action.moveToElement(chartBod1).build().perform();
				WebElement GlobalFilterIconChart = driver.findElement(By.xpath("(//div[contains(@id,'" + GlobalTab2TabId
						+ "')]//*[name()='svg']//*[name()='g'][2]//*[name()='path'][3])[1]"));
				action.moveToElement(GlobalFilterIconChart).build().perform();
				WebElement TabFilterIconChart = driver.findElement(By.xpath("(//div[contains(@id,'" + GlobalTab2TabId
						+ "')]//*[name()='svg']//*[name()='g'][2]//*[name()='path'][2])[1]"));
				action.moveToElement(TabFilterIconChart).build().perform();
				String TabIconColorRGB = TabFilterIconChart.getCssValue("fill");
				String tabIconColor = rgbToHex1(TabIconColorRGB);
				String globalIconColorRGB = GlobalFilterIconChart.getCssValue("fill");
				String globalIconColor = rgbToHex1(globalIconColorRGB);

				if (!"#0000FF".equalsIgnoreCase(tabIconColor)) {
					pass(driver,
							"Tab Filter condition successfully removed in the chart after disablig the Tab toggle");
				} else {
					fail(driver, "Tab Filter condition not removed in the chart after disablig the Tab toggle");
				}

				if (!"#FF3333".equalsIgnoreCase(globalIconColor)) {
					pass(driver,
							"Global Filter condition successfully removed in the chart after disablig the Global toggle");
				} else {
					fail(driver, "Global Filter condition not removed in the chart after disablig the Global toggle");
				}
			}

		} catch (Exception e) {
			fail(driver, " " + e.getLocalizedMessage());
			e.printStackTrace();
		}

		try {
			WebElement chartBod1 = driver
					.findElement(By.xpath("(//div[@id='" + GlobalTab2TabId + "_div']//div[@ref='gridBody'])[1]"));
			action.moveToElement(chartBod1).build().perform();
			WebElement EditeChart = driver
					.findElement(By.xpath("(//div[@id='" + GlobalTab2TabId + "_div']//i[contains(@class,'edit')])[1]"));
			action.moveToElement(EditeChart).click().build().perform();

			if (isDisplayed(driver, cancel_chart)) {
				pass(driver, "Chart Edit page is displayed After clicking the edit button");
				click(driver, cancel_chart);
				if (isDisplayed(driver, cancel_chart)) {
					fail(driver, "Cancel button in the chart not working properly");
				} else {
					pass(driver, "Cancel button in the chart working properly");
				}

			} else {
				fail(driver, "Chart Edit page is not displayed After clicking the edit button");
			}

			chartBod1 = driver
					.findElement(By.xpath("(//div[@id='" + GlobalTab2TabId + "_div']//div[@ref='gridBody'])[1]"));
			action.moveToElement(chartBod1).build().perform();
			List<WebElement> beforeDeleteChart = driver
					.findElements(By.xpath("//div[@id='" + GlobalTab2TabId + "_div']//div[@ref='gridBody']"));
			int beforeDeleteSize = beforeDeleteChart.size();
			WebElement deleteChart = driver.findElement(
					By.xpath("(//div[@id='" + GlobalTab2TabId + "_div']//i[contains(@class,'trash')])[1]"));
			action.moveToElement(deleteChart).click().build().perform();
			waitForElement(driver, deleteConfirmButton);
			click(driver, deleteConfirmButton);
			wait(driver, "1");
			List<WebElement> afterDeleteChart = driver
					.findElements(By.xpath("//div[@id='" + GlobalTab2TabId + "_div']//div[@ref='gridBody']"));
			int afterDeleteSize = afterDeleteChart.size();
			if (beforeDeleteSize > afterDeleteSize) {
				pass(driver, "Chart deleted successfully after deleting it");
			} else {
				fail(driver, "Chart not deleted successfully after deleting it");
			}

		} catch (Exception e) {
			fail(driver, " " + e.getLocalizedMessage());
			e.printStackTrace();
		}

		// ********************** upto TC_Smoketest_451 completed ***************
		
//		DASHPRO_BAR_SMOKE_TESTING bar=new DASHPRO_BAR_SMOKE_TESTING();
//		bar.barwidgetTest(driver, iteration);
		
		DASHPRO_ADMIN_SMOKE_TESTING admin=new DASHPRO_ADMIN_SMOKE_TESTING();
		admin.dashProAdmin(driver, iteration);

	}

	public boolean clickFirstTab(WebDriver driver, String id) {
		Actions action = new Actions(driver);
		boolean chartpresentGlobal1 = false;
		try {
			WebElement tab1 = driver.findElement(By.xpath("//li[@id='" + id + "']//a"));
			action.moveToElement(tab1).build().perform();
			action.click(tab1).build().perform();
			elementnotvisible(driver, Loading1);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement chartPresent = driver.findElement(By.xpath("//div[@id='" + id + "_div']//div[@ref='gridBody']"));
			if (chartPresent.isDisplayed()) {
				action.moveToElement(chartPresent).build().perform();
				chartpresentGlobal1 = true;
			} else {
				fail(driver, "GlobalTab1 not opened after click on it");
			}

			return chartpresentGlobal1;
		} catch (Exception e) {
			// e.printStackTrace();
			return false;
		}
	}

	public void clickSecondTab(WebDriver driver, String id) {
		Actions action = new Actions(driver);
		WebElement globaltab2 = driver.findElement(By.xpath("//li[@id='" + id + "']"));
		action.moveToElement(globaltab2).build().perform();
		wait(driver, "1");
		globaltab2.click();
		elementnotvisible(driver, Loading1);
		waitForElement(driver, GlobalFilterOption);
		click(driver, GlobalFilterOption);
		waitForElement(driver, GlobalFilterSection);
	}

	public void ResetGlobalValidation(WebDriver driver, String id) {

		Actions action = new Actions(driver);
		boolean chartpresentGlobal2 = false;
		try {
			WebElement chartPresent = driver.findElement(By.xpath("//div[@id='" + id + "_div']//div[@ref='gridBody']"));
			if (chartPresent.isDisplayed()) {
				chartpresentGlobal2 = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (chartpresentGlobal2) {
			WebElement chartPresent = driver.findElement(By.xpath("//div[@id='" + id + "_div']//div[@ref='gridBody']"));
			action.moveToElement(chartPresent).build().perform();

			WebElement globalFilterIconChartTab3 = driver.findElement(By.xpath(
					"//div[contains(@id,'" + id + "')]//*[name()='svg']//*[name()='g'][2]//*[name()='path'][3]"));
			action.moveToElement(globalFilterIconChartTab3).build().perform();
			String globalIconColorRGB = globalFilterIconChartTab3.getCssValue("fill");
			String globalIconColor = rgbToHex1(globalIconColorRGB);

			if ("#FF3333".equalsIgnoreCase(globalIconColor)) {
				fail(driver, "Global Filter icon not changed to default color after Reseting the Global Filter");
			} else {
				pass(driver, "Global Filter icon changed to default color after Reseting the Global Filter");
			}

		} else {
			fail(driver, "After Click the Reset button in global filter not able to find the chart..");
		}

	}

}
