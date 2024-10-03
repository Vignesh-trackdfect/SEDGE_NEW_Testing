package scripts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class Chart_Format_Others extends Keywords {

	
	public void chart_Format_Others(WebDriver driver,String URL) {
		String Username = Utils.getDataFromTestData("SEDGE", "Username");
		String Password = Utils.getDataFromTestData("SEDGE", "Password");
		
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
		String ChangeStatsLine=Utils.getDataFromTestData("ChartFormat_Others", "ChangeStatsLine");
		String ChangeRoundOffValue=Utils.getDataFromTestData("ChartFormat_Others", "ChangeRoundOffValue");

		
		String Y_Axis_Type=Utils.getDataFromTestData("ChartFormat_Others", "Y_Axis_Type");
		String Y_Axis_Value=Utils.getDataFromTestData("ChartFormat_Others", "Y_Axis_Value");
		String X_Axis_Type_1=Utils.getDataFromTestData("ChartFormat_Others", "X_Axis_Type1");
		String X_Axis_Value_1=Utils.getDataFromTestData("ChartFormat_Others", "X_Axis_Value1");
		String SelectTargetValue=Utils.getDataFromTestData("ChartFormat_Others", "TargetValue");
		
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
//		 
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
        
        //Chart_Format_Others Validations start...
        verifyElementIsPresent(driver,Chart_FormatSec);
		click(driver,Chart_FormatSec);
		
		String ChartFormatOpenstatus=getAttribute1(driver, chartFormatExpand, "class");
	    if(ChartFormatOpenstatus.contains("up")) {
			passReport(driver,"Chart Format should expand when click the Chart Format" ,"Chart Format is expanded when clicking the Chart Format");
	    }else {
			failReport(driver,"Chart Format should expand when click the Chart Format" ,"Chart Format is not expanded when click the Chart Format");
			Assert.fail();
	    }
	    
	    if(verifyElementIsPresent(driver,ChartFormat_Others)) {
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
  		
  		for(int i=0;i<statLineValue.length;i++) {
  			selectOptionValue(driver,StatsLine_Input,statLineValue[i]);
  	  		mouseOverToElement(driver, ApplyButton);
  	  		click(driver,ApplyButton);
  	  		waitForElement(driver,Chart);
  	  		
//  	  		takescreenshot(driver,"/Expected_screenshot/StatLineTest/StatLine_"+statLineValue[i]);
  	  		takescreenshot(driver,"/Actual_screenshot/StatLineTest/StatLine_"+statLineValue[i]);
  			try {
  				imageComparison(driver, "/StatLineTest/StatLine_"+statLineValue[i], "/StatLineTest/StatLine_"+statLineValue[i]);
  				wait(driver, "2");
  			} catch (IOException e1) {
  				e1.printStackTrace();
  			}
  		}
  		
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
		  		 passReport(driver,"Stats line color should be accessible and color pannel should get opened","Stats line color is not accessible and color pannel not opened"); 
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
 		
 		
	}
////div[contains(@class,'previewBlock')]//*[name()='g' and contains(@role,'item')][1]//following::*[name()='g' and @stroke-width='2' and @fill='none']
}
