package scripts;

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

public class Chart_Styling_Test extends Keywords{

	public void chartStyling(WebDriver driver,String URL) {
		//String URL = TestNgXml.getdatafromExecution().get("ChartStyle");
		String Username = Utils.getDataFromTestData("SEDGE", "Username");
		String Password = Utils.getDataFromTestData("SEDGE", "Password");
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
		String Highlight_Color_Exp=Utils.getDataFromTestData("ChartFormat_ChartStyle", "HighlightColor_Exp");
		String Selected_Color_Exp=Utils.getDataFromTestData("ChartFormat_ChartStyle", "SelectedColor_Exp");
		String Change_ChartTheme=Utils.getDataFromTestData("ChartFormat_ChartStyle", "Change_ChartTheme");
		String InValidChartTheme=Utils.getDataFromTestData("ChartFormat_ChartStyle", "InvalidChartTheme");

		String Y_Axis_Type=Utils.getDataFromTestData("ChartFormat_ChartStyle", "Y_Axis_Type");
		String X_Axis_Type=Utils.getDataFromTestData("ChartFormat_ChartStyle", "X_Axis_Type");
		String X_Axis_Value=Utils.getDataFromTestData("ChartFormat_ChartStyle", "X_Axis_Value");
		String Y_Axis_Value=Utils.getDataFromTestData("ChartFormat_ChartStyle", "Y_Axis_Value");
		String SelectTargetValue=Utils.getDataFromTestData("ChartFormat_ChartStyle", "TargetValue");

		
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
		
		 
		 //Chart_Styling test Validation starts here Chart_FormatSec
		 verifyElementIsPresent(driver,Chart_FormatSec);
		 click(driver,Chart_FormatSec);
		 String ChartFormatOpenstatus=getAttribute1(driver, chartFormatExpand, "class");
		 if(ChartFormatOpenstatus.contains("up")) {
			passReport(driver,"Chart Format should expand when click the Chart Format" ,"Chart Format is expanded when clicking the Chart Format");
		 }else {
			failReport(driver,"Chart Format should expand" ,"Chart Format is not expanded when click the Chart Format");
			Assert.fail();
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
    		colorValidation(driver,Highlight_Color_Exp,mouseHighlightColor,"Mouse HighlightText>*");

    		String selectedColorAct=getTextBackgroundColor(driver,ListSelected);
    		String highlightText=getText1(driver,listSelectedText1);
    		if((defaultThemeValue_Act.equals(highlightText))&&Selected_Color_Exp.equalsIgnoreCase(selectedColorAct)) {
    			 passReport(driver,"Selected Value ("+defaultThemeValue_Act+") Should Highlight in Grey("+Selected_Color_Exp+") Color","Selected Value ("+highlightText+") Highlighted in Grey("+selectedColorAct+") Color");
    		}else {
         	    failReport(driver,"Selected Value ("+defaultThemeValue_Act+") Should Highlight in Grey("+Selected_Color_Exp+") Color",highlightText+" Value Highlighted in "+selectedColorAct+" Color");
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
     	
     	click(driver,Axes);
     	waitForElement1(driver,Axes_Expand_Check);
     	waitForElement1(driver,Y_Axis_dropdown);
        click(driver,Y_Axis_dropdown);
        waitForElement(driver,Y_Axis_dropdownResults);
        selectDropdownValue(driver,Y_Axis_Type,Y_Axis_Value);
        
        waitForElement1(driver,X_Axis_dropdown);
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
		 
		 
	}
}
