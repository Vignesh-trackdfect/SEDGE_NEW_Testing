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

public class Chart_Title_Test extends Keywords{

	
	public void chartTitleTest(WebDriver driver, String URL) {
		String Username = Utils.getDataFromTestData("SEDGE", "Username");
		String Password = Utils.getDataFromTestData("SEDGE", "Password");
		String ChartTitle_text_Exp=Utils.getDataFromTestData("ChartTitle", "ChartTitle_text");
		String ChartTitleColorExp=Utils.getDataFromTestData("ChartTitle", "ChartTitleColorExp");
		String BackgroundText_Exp=Utils.getDataFromTestData("ChartTitle", "BackgroundText_Exp");
		String DefaultBackgroundColor_Exp=Utils.getDataFromTestData("ChartTitle", "DefaultBackgroundColor");
		String FontColorText_Exp=Utils.getDataFromTestData("ChartTitle", "FontColorText_Exp");
		String DefaultFontColor_Exp=Utils.getDataFromTestData("ChartTitle", "DefaultFontColor");
		String FontFamily_text_Exp=Utils.getDataFromTestData("ChartTitle", "FontFamily_text");
		String Default_FontFamily=Utils.getDataFromTestData("ChartTitle", "default_FontFamily");
		String FontSizeText_Exp=Utils.getDataFromTestData("ChartTitle", "FontSizeText_Exp");
		String default_FontSize_Exp=Utils.getDataFromTestData("ChartTitle", "default_FontSize");
		String TypeBackgroundColor1=Utils.getDataFromTestData("ChartTitle", "TypeBackgroundColor1");
		String TypeTextColor1=Utils.getDataFromTestData("ChartTitle", "TypeTextColor1");
		String Highlight_Color_Exp=Utils.getDataFromTestData("ChartTitle", "HighlightColor_Exp");
		String Selected_Color_Exp=Utils.getDataFromTestData("ChartTitle", "SelectedColor_Exp");
		String ChangeFontFamily=Utils.getDataFromTestData("ChartTitle", "Change_FontFamily");
		String ChangeFontSize=Utils.getDataFromTestData("ChartTitle", "ChangeFontSize");
		String ChangeWidgetName=Utils.getDataFromTestData("ChartTitle", "ChangeWidgetName");
		String SelectTargetValue=Utils.getDataFromTestData("ChartTitle", "TargetValue");

		String FileName=Utils.getDataFromTestData("SEDGE", "FileName1");
		String filepath=System.getProperty("user.dir") + "\\testdata\\"+FileName+".csv";//DefaultBackgroundColor
		
		navigateUrl(driver, URL);
		waitForElement1(driver,username_input);
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
		 
		// Chart Title TestCases validation start... 
		 
		 verifyElementIsPresent(driver,chartTitle);
		 click(driver,chartTitle);
		 wait(driver,"1");
		 String CharttitleExpand=getAttribute1(driver,ChartTitleExpand,"class");
     	 if(CharttitleExpand.contains("up")) {
			passReport(driver,"Chart Title Should Expand" ,"Chart Title is Expanded");
     	 }else {
     	    failReport(driver,"Chart Title Should Expand","Chart Title not Expand");
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
     		if(default_FontSize_Exp.equals(defaultFontSize_Act)) {
    			passReport(driver,"By default, '"+default_FontSize_Exp+"' Value should select in the Font Size Input" ,"By default, '"+defaultFontSize_Act+"' Value selected in the Font Size Input");
     		}else {
         	    failReport(driver,"By default, '"+default_FontSize_Exp+"' Value should select in the Font Size Input","By default, '"+defaultFontSize_Act+"' Value selected in the Font Size Input");
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
//      Background color Validation  End
 		
         click(driver,SaveBtn_Chart);
         if(verifyElementIsPresent1(driver,chartSaveError1)) {
   			passReport(driver,"'Enter Widget Name' error should display When click Save button without giving the value" ,"'Enter Widget Name' error displayed When click Save button without giving the value");
         }else {
    		failReport(driver,"'Enter Widget Name' error should display When click Save button without giving the value" ,"'Enter Widget Name' error not displayed When click Save button without giving the value");
         }
         
//      Font color Validation start...
         
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
        
//      Font color Validation End...

//      Font Family Validation start...
        
        String fontFamily_Value=getText1(driver,ChartFontFamilyDropdown);
     	click(driver,ChartFontFamilyDropdown);
     	
     	if(verifyElementIsPresent1(driver,ChartFontFamilyDropdownExpand)) {
        	passReport(driver,"Font family dropdown should expand" ,"Font family dropdown expanded");
        	mouseOverToElement(driver,SecondValue);
        	wait(driver,"1");
    		String mouseHighlightColor=getTextBackgroundColor(driver,SecondValue);
    		colorValidation(driver,Highlight_Color_Exp,mouseHighlightColor,"Mouse HighlightText>*");

            mouseOverToElement(driver,ListSelected);
            action.sendKeys(Keys.ARROW_UP).build().perform();
    		String selectedColorAct=getTextBackgroundColor(driver,ListSelected);
    		String highlightText=getText1(driver,listSelectedText1);
    		if((fontFamily_Value.equals(highlightText))&&Selected_Color_Exp.equals(selectedColorAct)) {
    			 passReport(driver,"Selected Value ("+fontFamily_Value+") Should Highlight in Grey("+Selected_Color_Exp+") Color","Selected Value ("+highlightText+") Highlighted in Grey("+selectedColorAct+") Color");
    		}else {
         	    failReport(driver,"Selected Value ("+fontFamily_Value+") Should Highlight in Grey("+Selected_Color_Exp+") Color",highlightText+" Value Highlighted in "+selectedColorAct+" Color");
    		}
    		
            mouseOverToElement(driver,SecondValue);
         	ScrollBarValidation(driver,ChartFontFamilyDropdownExpand,HighlightedFontFamily,"Font Family");
         	
         	//AlphabetOrderValidation(driver,chartFontFamilyResults);

         	List<WebElement> beforeSearchResults=getWebElements(driver,chartFontFamilyResults);
         	int beforeSearchSize=beforeSearchResults.size();
         	verifyElementIsPresent1(driver,dropdownInputsearchBox);
         	click(driver,dropdownInputsearchBox);
         	sendKeys(driver,dropdownInputsearchBox,ChangeFontFamily);
         	List<WebElement> afterSearchResults=getWebElements(driver,chartFontFamilyResults);
         	int afterSearchSize=afterSearchResults.size();
            String resultText=getText1(driver,fontFamilyFirstResult);
            if((beforeSearchSize>afterSearchSize)&&resultText.equals(ChangeFontFamily)) {
   			 passReport(driver,"Search input in the Font Family dropdown should works properly","Search input in the Font Family dropdown works properly");
            }else {
         	    failReport(driver,"Search input in the Font Family dropdown should works properly","Search input in the Font Family dropdown not works properly");
            }
         	
           	selectFontFamily(driver,ChangeFontFamily);
           	wait(driver,"1");
           	if(isDisplayed2(driver,ChartFontFamilyDropdownExpand)) {
           		failReport(driver,"Font Family dropdown should close after select the value","Font Family dropdown not closed after select the value");
           	}else {
      			 passReport(driver,"Font Family dropdown should close after select the value","Font Family dropdown closed after select the value");
           	}
         	wait(driver,"1");
           	String selectedFontFamilyValue=getText1(driver,ChartFontFamilyDropdown); 
           	if(selectedFontFamilyValue.equals(ChangeFontFamily)) {
			    passReport(driver,"Selected fontFamily ("+ChangeFontFamily+") Should Update in Font Family Input field","Selected fontFamily ("+selectedFontFamilyValue+") Updated in Font Family Input field");
           	}else {
           		failReport(driver,"Selected fontFamily ("+ChangeFontFamily+") Should Update in Font Family Input field","FontFamily ("+selectedFontFamilyValue+") Updated in Font Family Input field");
           	}
        	
    		String fontFamily_ChartTitleText_Act=getFontFamily(driver,ChartTitleInput);
    		if(fontFamily_ChartTitleText_Act.equals(ChangeFontFamily)) {
   			    passReport(driver,"Selected fontFamily ("+ChangeFontFamily+") Should Update in Chart Title text","Selected fontFamily ("+fontFamily_ChartTitleText_Act+") Updated in Chart Title text");
    		}else {
         	    failReport(driver,"Selected fontFamily ("+ChangeFontFamily+") Should Update in Chart Title text","FontFamily ("+fontFamily_ChartTitleText_Act+") Updated in Chart Title text");
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
        
        String beforeChartTitleInputColor=getTextJavascript(driver,BackgroundInput);
        String beforeChartTitleTextColor=getTextJavascript(driver,FontColorInput);
        String beforeChartTitleFontFamily=getText1(driver,ChartFontFamilyDropdown);
        String beforeChartTitleFontSize=getTextJavascript(driver,ChartFontSizedDropdown);
        
        click(driver,SaveBtn_Chart);
		if(isDisplayed(driver,chartSaveError2)) {
			passReport(driver,"'Please Choose Chart or Table', Error should Display ","'Please Choose Chart or Table', Error Displayed");
		}else {
     	    failReport(driver,"'Please Choose Chart or Table', Error Should Display ","'Please Choose Chart or Table', Error not Displyed");
		}
		
		click(driver,Axes);
		waitForElement(driver,Y_Axis_dropdown);
		click(driver,Y_Axis_dropdown);
		waitForElement(driver,Y_Axis_dropdownResults);
		click(driver,ThirdValue);
		
		waitForElement(driver,X_Axis_dropdown);
		click(driver,X_Axis_dropdown);
		waitForElement(driver,X_Axis_dropdownResults);
		click(driver,fourthValue);
		wait(driver,"1");
		mouseOverAndClick(driver,ApplyButton);
		click3(driver,ApplyButton);
		waitForElement(driver,Chart);
		 
		click(driver,chartTitle);
        click(driver,SaveBtn_Chart);

        if(verifyElementIsPresent1(driver,savedChart)) {
			passReport(driver,"Chart Should Save Successfully","Chart Saved Successfully");
        }else {
     	    failReport(driver,"Chart Should Save Successfully","Chart not Saved Successfully");
        }

        String savedChartTitleInputColor=getTextBackgroundColor(driver,SavedChartTitleInput);
        String savedChartTitleTextColor=getTextColor(driver,SavedChartTitleInput);
        String savedChartTitleFontFamily=getFontFamily(driver,SavedChartTitleInput);
        String savedChartTitleFontSize=getFontSize(driver,SavedChartTitleInput);
        
        if(beforeChartTitleInputColor.equalsIgnoreCase(savedChartTitleInputColor)) {
			passReport(driver,"Selected Background Color ("+beforeChartTitleInputColor+") Should update after saving the Chart","Selected Background Color ("+savedChartTitleInputColor+") updated after saving the Chart");
        }else {
			failReport(driver,"Selected Background Color ("+beforeChartTitleInputColor+") Should update after saving the Chart","Background Color ("+savedChartTitleInputColor+") is updated after saving the Chart");
        }
        
        if(beforeChartTitleTextColor.equalsIgnoreCase(savedChartTitleTextColor)) {
			passReport(driver,"Selected Font Color ("+beforeChartTitleTextColor+") Should update after saving the Chart","Selected Font Color ("+savedChartTitleTextColor+") updated after saving the Chart");
        }else {
			failReport(driver,"Selected Font Color ("+beforeChartTitleTextColor+") Should update after saving the Chart","Font Color ("+savedChartTitleTextColor+") is updated after saving the Chart");
        }
        
        if(beforeChartTitleFontFamily.equalsIgnoreCase(savedChartTitleFontFamily)) {
			passReport(driver,"Selected Font Family ("+beforeChartTitleFontFamily+") Should update after saving the Chart","Selected Font Family ("+savedChartTitleFontFamily+") updated after saving the Chart");
        }else {
			failReport(driver,"Selected Font Family ("+beforeChartTitleFontFamily+") Should update after saving the Chart","Font Family ("+savedChartTitleFontFamily+") is updated after saving the Chart");
        }
        
        if(beforeChartTitleFontSize.equalsIgnoreCase(savedChartTitleFontSize)) {
			passReport(driver,"Selected Font Size ("+beforeChartTitleFontSize+") Should update after saving the Chart","Selected Font Size ("+savedChartTitleFontSize+") updated after saving the Chart");
        }else {
			failReport(driver,"Selected Font Size ("+beforeChartTitleFontSize+") Should update after saving the Chart","Font Size ("+savedChartTitleFontSize+") is updated after saving the Chart");
        }

        mouseOverToElement(driver, SavedChartTitleInput);
        mouseOverAndClick(driver, editeChart); 
        waitForElement(driver,WidgetPanel);
        waitForElement(driver,chartTitle);
        click(driver,chartTitle);
        
        CharttitleExpand=getAttribute1(driver,ChartTitleExpand,"class");
    	 if(CharttitleExpand.contains("up")) {
			passReport(driver,"Chart Title Should Expand" ,"Chart Title is Expanded");
    	 }else {
    	    failReport(driver,"Chart Title Should Expand","Chart Title not Expand");
    	    Assert.fail();
    	 }
    	 
    	 String afterEditChartTitleInputColor=getTextJavascript(driver,BackgroundInput);
         String afterEditChartTitleTextColor=getTextJavascript(driver,FontColorInput);
         String afterEditChartTitleFontFamily=getText1(driver,ChartFontFamilyDropdown);
         String afterEditChartTitleFontSize=getTextJavascript(driver,ChartFontSizedDropdown);
         
         if(beforeChartTitleInputColor.equalsIgnoreCase(afterEditChartTitleInputColor)) {
 			passReport(driver,"After Saved the chart when edite the chart, the background color should be same, Exp: "+beforeChartTitleInputColor,"After Saved the chart when edite the chart, the background color is same, Act: "+afterEditChartTitleInputColor);
         }else {
  			failReport(driver,"After Saved the chart when edite the chart, the background color should be same, Exp: "+beforeChartTitleInputColor,"After Saved the chart when edite the chart, the background color is not same, Act: "+afterEditChartTitleInputColor);
         }
         
         if(beforeChartTitleTextColor.equalsIgnoreCase(afterEditChartTitleTextColor)) {
  			passReport(driver,"After Saved the chart when edite the chart, the Font color should be same, Exp: "+beforeChartTitleTextColor,"After Saved the chart when edite the chart, the Font color is same, Act: "+afterEditChartTitleTextColor);
          }else {
   			failReport(driver,"After Saved the chart when edite the chart, the Font color should be same, Exp: "+beforeChartTitleTextColor,"After Saved the chart when edite the chart, the Font color is not same, Act: "+afterEditChartTitleTextColor);
          }
         
         if(beforeChartTitleFontFamily.equalsIgnoreCase(afterEditChartTitleFontFamily)) {
   			passReport(driver,"After Saved the chart when edite the chart, the Font Family should be same, Exp: "+beforeChartTitleFontFamily,"After Saved the chart when edite the chart, the Font Family is same, Act: "+afterEditChartTitleFontFamily);
         }else {
			failReport(driver,"After Saved the chart when edite the chart, the Font Family should be same, Exp: "+beforeChartTitleFontFamily,"After Saved the chart when edite the chart, the Font Family is not same, Act: "+afterEditChartTitleFontFamily);
         }
         
         if(beforeChartTitleFontSize.equalsIgnoreCase(afterEditChartTitleFontSize)) {
			passReport(driver,"After Saved the chart when edite the chart, the Font Size should be same, Exp: "+beforeChartTitleFontSize,"After Saved the chart when edite the chart, the Font Size is same, Act: "+afterEditChartTitleFontSize);
          }else {
 			failReport(driver,"After Saved the chart when edite the chart, the Font Size should be same, Exp: "+beforeChartTitleFontSize,"After Saved the chart when edite the chart, the Font Size is not same, Act: "+afterEditChartTitleFontSize);
          }
         
         click(driver,cancel_chart);
         waitForElement(driver, SavedChartTitleInput);
         mouseOverAndClick(driver, SavedChartTitleInput);
         mouseOverAndClick(driver, deteleBtn_chart);
         
         if(verifyElementIsPresent1(driver, deleteWidgetPopup)) {
 			passReport(driver,"'Delete Widget' Alert popup should display" ,"'Delete Widget' Alert popup displayed");
 			verifyElementIsPresent1(driver, deleteWidgetDesc);
 			verifyElementIsPresent1(driver, deleteCancelButton);
 			verifyElementIsPresent1(driver, deleteConfirmButton);
 			click(driver,deleteConfirmButton);
 			wait(driver,"1");
 			if(isDisplayed(driver,SavedChartTitleInput)) {
 	  			failReport(driver,"Chart Should delete successfully" ,"Chart not deleted successfully");
 			}else {
 	  			passReport(driver,"Chart Should delete successfully" ,"Chart deleted successfully");
 			}

         }else {
  			failReport(driver,"'Delete Widget' Alert popup should display" ,"'Delete Widget' Alert popup not displayed");
         }
         
	}
}