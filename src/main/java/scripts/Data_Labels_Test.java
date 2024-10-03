package scripts;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class Data_Labels_Test extends Keywords {

	public void dataLabels_Test(WebDriver driver,String URL) {
		String Username = Utils.getDataFromTestData("SEDGE", "Username");
		String Password = Utils.getDataFromTestData("SEDGE", "Password");
		String ChartFormatColorExp=Utils.getDataFromTestData("ChartFormat_ChartStyle", "ChartFormatColorExp");
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
		String ChangeFontSizeValue=Utils.getDataFromTestData("ChartFormat_DataLabel", "ChangeFontSizeValue");
		String DefaultRoundOffValue_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DefaultRoundOffValue");
		String ChangeRoundOffValue=Utils.getDataFromTestData("ChartFormat_DataLabel", "ChangeRoundOffValue");
		String DefaultPositionValue_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DefaultPositionValue");
		String DefaultRotationValue_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DefaultRotationValue");
		String ChangeRotataionVal_Positive=Utils.getDataFromTestData("ChartFormat_DataLabel", "ChangeRotataionVal_Positive");
		String ChangeRotataionVal_Negative=Utils.getDataFromTestData("ChartFormat_DataLabel", "ChangeRotataionVal_Negative");

		
		String Y_Axis_Type=Utils.getDataFromTestData("ChartFormat_DataLabel", "Y_Axis_Type");
		String Y_Axis_Value=Utils.getDataFromTestData("ChartFormat_DataLabel", "Y_Axis_Value");
		String X_Axis_Type_1=Utils.getDataFromTestData("ChartFormat_DataLabel", "X_Axis_Type1");
		String X_Axis_Value_1=Utils.getDataFromTestData("ChartFormat_DataLabel", "X_Axis_Value1");
		String X_Axis_Type_Neg=Utils.getDataFromTestData("ChartFormat_DataLabel", "X_Axis_Type_Neg");
		String X_Axis_Value_Neg=Utils.getDataFromTestData("ChartFormat_DataLabel", "X_Axis_Value_Neg");
		String SelectTargetValue=Utils.getDataFromTestData("ChartFormat_DataLabel", "TargetValue");
		
		String FileName=Utils.getDataFromTestData("SEDGE", "FileName1");
		String filepath=System.getProperty("user.dir") + "\\testdata\\"+FileName+".csv";
		Actions action=new Actions(driver);
		navigateUrl(driver, URL);
		waitForElement(driver,username_input);
		sendKeys(driver,username_input,Username);
		
		waitForElement1(driver,password_input);
		sendKeys(driver,password_input,Password);
		
        click(driver,SignIn_Btn);
		waitForElement1(driver,HomePage);

		waitForElement1(driver,Data_Analytics_page_link);
        click(driver,Data_Analytics_page_link);
        
        waitForElement1(driver,Create_project);
        elementnotvisible(driver,Loading);
        click(driver,Create_project);
        
        waitForElement1(driver,AddFiles);
		uploadfile(driver,filepath);

		String AddedFileName=getText(driver,FileName_text);
		//need to change
		if(AddedFileName.contains(FileName)) {
			passReport(driver,"Correct File Should Add, Expect Name : "+FileName ,"Correct File is Added, Actual name : "+AddedFileName);
		}else {
			failReport(driver,"Correct File Should Add, Expect Name : "+FileName,"Different File is Added, Actual name : "+AddedFileName);
		}
		
		waitForElement1(driver,Upload_Btn);
		click(driver,Upload_Btn);
//		waitForElement(driver,upload_wait);
		elementnotvisible(driver,upload_wait);

		
		waitForElement1(driver,fileUploaded_1);
		waitForElement1(driver,fileUploaded_2);
		waitForElement1(driver,fileUploaded_3);

		elementnotvisible(driver,fileUploaded_2);
		
        mouseOverToElement(driver,Preview);
		waitForElement(driver,Sampling_option);
		click(driver,Sampling_option);
		elementnotvisible(driver,Loading);
		waitForElement1(driver,ProfilingPage);
		waitForElement(driver,targetDrop);
		mouseOverToElement(driver,targetDrop);
		wait(driver,"1");
		click(driver,targetDrop);
		waitForElement1(driver,dropdown_expand);

		selectTarget(driver,SelectTargetValue);
		 Actions act=new Actions(driver);
		 act.sendKeys(Keys.ESCAPE).build().perform();
		 waitForElement(driver,Statistics_icon);
		 click3(driver,Statistics_icon);
		 wait(driver,"2");
		 waitForElement(driver,Visual_icon);
         click3(driver,Visual_icon);
         elementnotvisible(driver,Loading);
		 waitForElement1(driver,DashProPage);
		 wait(driver,"3");
		 waitForElement1(driver,ADD_widget_rightTop);
         click(driver,ADD_widget_rightTop);
		 wait(driver,"3");
         waitForElement1(driver,WidgetPanel);
		 wait(driver,"1");
         waitForElement1(driver,Bar_widget);
		 click(driver,Bar_widget);
		
		 waitForElement(driver,Axes);
		 if(!isDisplayed2(driver,Axes_Expand_Check)) {
			 click(driver,Axes);
		 }
		 
     	waitForElement1(driver,Axes_Expand_Check);
     	waitForElement1(driver,Y_Axis_dropdown);
        click(driver,Y_Axis_dropdown);
        waitForElement(driver,Y_Axis_dropdownResults);
        selectDropdownValue(driver,Y_Axis_Type,Y_Axis_Value);
        
        waitForElement1(driver,X_Axis_dropdown);
        click(driver,X_Axis_dropdown);
        waitForElement(driver,X_Axis_dropdownResults);
        selectDropdownValue(driver,X_Axis_Type_1,X_Axis_Value_1);
        wait(driver,"1");
        mouseOverToElement(driver,ApplyButton);
        click3(driver,ApplyButton);
        waitForElement(driver,Chart);
		 
		 //Data_Labels test Validation starts here Chart_FormatSec
		 verifyElementIsPresent(driver,Chart_FormatSec);
		 click(driver,Chart_FormatSec);
		 String ChartFormatOpenstatus=getAttribute1(driver, chartFormatExpand, "class");
		 if(ChartFormatOpenstatus.contains("up")) {
			passReport(driver,"Chart Format should expand when click the Chart Format" ,"Chart Format is expanded when clicking the Chart Format");
		 }else {
			failReport(driver,"Chart Format should expand when click the Chart Format" ,"Chart Format is not expanded when click the Chart Format");
			Assert.fail();
		 }
		//ChartFormatColorExp
		 String ChartFormatColor=getTextColor(driver, Chart_FormatSec);
		 if(ChartFormatColor.equalsIgnoreCase(ChartFormatColorExp)) {
			passReport(driver,"Chart Format should gets highlighted in blue color "+ChartFormatColorExp+" after it expands" ,"Chart Format gets highlighted in "+ChartFormatColor+" color after it expands");
		 }else {
			failReport(driver,"Chart Format should gets highlighted in blue color "+ChartFormatColorExp+" after it expands" ,"Chart Format gets highlighted in "+ChartFormatColor+" Color after it expands"); 
		 }
		 
		 if(verifyElementIsPresent(driver,DataLabels)) {
			 scrollUsingElement(driver,DataLabels);
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
	  		 mouseOverToElement(driver, ApplyButton);
	  		 click(driver,ApplyButton);
	  		 waitForElement1(driver,Chart);
	  		 if(isDisplayed(driver,ValueFormat_ChartValue)) {
		  		 passReport(driver,"Values should be enabled in charts after enabling the 'Enable Value' toggle","Values enabled in charts after enabling the 'Enable Value' toggle"); 
	  		 }else {
		  		 failReport(driver,"Values should be enabled in charts after enabling the 'Enable Value' toggle","Values not enabled in charts after enabling the 'Enable Value' toggle"); 
	  		 }
	  		 
		 }else {
	  		 failReport(driver,"'Enable Value' toggle should be enable after click on it","'Enable Value' toggle is not enabled after click on it");
	  		 Assert.fail();
		 }
		 
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
  		 String ValueTextAct=getText1(driver,ValueFormat_ChartValue);
  		 if(ValueTextAct.endsWith("%")) {
	  		 failReport(driver,"'Value Format' should display in the chart for Value format selection","'Value Format' is not display in the chart for Value format selection");
  		 }else {
	  		 passReport(driver,"'Value Format' should display in the chart for Value format selection","'Value Format' is displayed in the chart for Value format selection");
  		 }
  		 
  		 selectOptionValue(driver,ValueFormatInput,"percentage");
  		 mouseOverToElement(driver, ApplyButton);
 		 click(driver,ApplyButton);
 		 waitForElement(driver,Chart);
 		 ValueTextAct=getText1(driver,ValueFormat_ChartValue);
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
 		
 		String ChartValueTextAct=getText1(driver,ValueFormat_ChartValue);
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
 		
 		ChartValueTextAct=getText1(driver,ValueFormat_ChartValue);
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
 		
	   ChartValueTextAct=getText1(driver,ValueFormat_ChartValue);
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
	  		 Assert.fail(); 
		}
	   
	   // need to Add position check
	   
	   boolean chartValuePositionAct=validateElementPosition(driver,chartBar1,chartValue_Rotation,"center");
	   if(chartValuePositionAct==true) {
	  		passReport(driver,"By default, Chart value should display center the chartbar","By default, Chart value displayed center the chartbar"); 
	   }else {
	  		passReport(driver,"By default, Chart value should display center the chartbar","By default, Chart value is not displayed center the chartbar"); 
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
	  		passReport(driver,"Chart value should display inside the chartbar","Chart value is not displayed inside the chartbar"); 
	   }

	   selectOptionValue(driver,PositionInput,"outside");
	   mouseOverToElement(driver, ApplyButton);
	   click(driver,ApplyButton);
	   waitForElement(driver,Chart);
	   chartValuePositionAct=validateElementPosition(driver,chartBar1,chartValue_Rotation,"outside");
	   if(chartValuePositionAct==true) {
	  		passReport(driver,"Chart value should display outside the chartbar","Chart value displayed outside the chartbar"); 
	   }else {
	  		passReport(driver,"Chart value should display outside the chartbar","Chart value is not displayed outside the chartbar"); 
	   }
	   
	   selectOptionValue(driver,PositionInput,"center");
	   mouseOverToElement(driver, ApplyButton);
	   click(driver,ApplyButton);
	   waitForElement(driver,Chart);
	   
	   // need to Add position check
	   
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
 	    ChartValueTextAct=getText1(driver,ValueFormat_ChartValue);
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
	    ChartValueTextAct=getText1(driver,ValueFormat_ChartValue);
	    if(ChartValueTextAct.endsWith("K")) {
			 failReport(driver,"The big number suffix should not be applied for enabled value in charts","The big number suffix is applied for enabled value in charts");
	    }else {
			 passReport(driver,"The big number suffix should not be applied for enabled value in charts","The big number suffix is not applied for enabled value in charts");
	    }
 	    
	    //X_AxisLabel_chart_1
	    waitForElement(driver,Axes);
	    click(driver,Axes);
		 if(!isDisplayed2(driver,Axes_Expand_Check)) {
			 click(driver,Axes);
		 }
	
		 
    	waitForElement1(driver,X_Axis_dropdown);
    	click(driver,X_Axis_dropdown);
    	waitForElement(driver,X_Axis_dropdownResults);
    	selectDropdownValue(driver,X_Axis_Type_Neg,X_Axis_Value_Neg);
    	wait(driver,"1");
    	selectOptionValue(driver, aggregation, "min");
       	mouseOverToElement(driver,ApplyButton);
       	click(driver,ApplyButton);
       	waitForElement(driver,Chart);
		click(driver,Chart_FormatSec);
		
		if(isToggleEnable(driver,ShowPositive_Input)) {
			 failReport(driver,"By default, 'Show As Positive' toggle should be disable","By default, 'Show As Positive' toggle is disabled");
	  		 Assert.fail(); 
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
		 
		
	}
}
