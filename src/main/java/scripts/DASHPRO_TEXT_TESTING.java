package scripts;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import commonMethods.Keywords;
import commonMethods.Utils;

public class DASHPRO_TEXT_TESTING extends Keywords{

	public void text_widget_testing(WebDriver driver,int iteration,String Flag) {

		String Default_ColorGradient_Text=Utils.getDataFromTestData("SmokeTesting_UI", "Default_ColorGradient_Text");
		String Default_Label_FontColor_Text=Utils.getDataFromTestData("SmokeTesting_UI", "Default_Label_FontColor_Text");
		String Default_FontFamily_TextWidget=Utils.getDataFromTestData("SmokeTesting_UI", "Default_FontFamily_TextWidget");
		
		String Highlight_color_Exp=Utils.getDataFromTestData("Axes", "HighlightColor");

		//Iteration Data
		String Input_Value_Type_TEXTChart=Utils.getDataFromTestDataIteration(iteration,"Text_Widget_Input", "Input_Value_Type_TEXTChart");
		String Change_Gradient_Color1=Utils.getDataFromTestDataIteration(iteration,"Text_Widget_Input", "Change_Gradient_Color1");
		String Change_Gradient_Color2=Utils.getDataFromTestDataIteration(iteration,"Text_Widget_Input", "Change_Gradient_Color2");
		
		//Chart title
		String TypeBackgroundColor1_ChartTitle=Utils.getDataFromTestDataIteration(iteration,"Text_Widget_Input", "TypeBackgroundColor1_ChartTitle");
		String TypeTextColor1_ChartTitle=Utils.getDataFromTestDataIteration(iteration,"Text_Widget_Input", "TypeTextColor1_ChartTitle");
		String Change_FontFamily_ChartTitle=Utils.getDataFromTestDataIteration(iteration,"Text_Widget_Input", "Change_FontFamily_ChartTitle");
		String ChangeFontSize_ChartTitle=Utils.getDataFromTestDataIteration(iteration,"Text_Widget_Input", "ChangeFontSize_ChartTitle");
		String ChangeChartTitleName=Utils.getDataFromTestDataIteration(iteration,"Text_Widget_Input", "ChangeChartTitleName");
			
		//ChartFormat_Label
		String Vertical_Position_Select=Utils.getDataFromTestDataIteration(iteration,"Text_Widget_Input", "Vertical_Position_Select");
		String Horizontal_Position_Select=Utils.getDataFromTestDataIteration(iteration,"Text_Widget_Input", "Horizontal_Position_Select");
		String Change_FontColor_Label=Utils.getDataFromTestDataIteration(iteration,"Text_Widget_Input", "Change_FontColor_Label");
		String ChangeFontFamily_Label=Utils.getDataFromTestDataIteration(iteration,"Text_Widget_Input", "ChangeFontFamily_Label");
		String Change_FontSize_Label=Utils.getDataFromTestDataIteration(iteration,"Text_Widget_Input", "Change_FontSize_Label");

		setTestCaseID(" ");
		Actions action=new Actions(driver);
		mouseOverToElement(driver, ADDTabPlus);
  	    mouseOverAndClick(driver, ADDTabPlus);
  	    wait(driver,"1");
  	    sendKeys(driver,newlyAddedTab,"TextWidgetTestTab");
  	    click(driver,DashProPage);
  	    elementnotvisible1(driver, RPE_Loading);
		waitForElement(driver,ADD_widget_rightTop);
	    click(driver,ADD_widget_rightTop);
	    elementnotvisible(driver,Loading);
	    elementnotvisible1(driver, RPE_Loading);
		waitForElement(driver,WidgetPanel);
		waitForElement(driver,Sparkline_widget);
		waitForElement(driver,Text_widget);
		verifyElementDisplayed(driver, Text_widget);
		WidgetValidation(driver,Text_widget,"Text");
		click(driver,Text_widget);
		
		setTestCaseID("TC_TEXT_001");
		verifyElementDisplayed(driver,TextTypeInput_Chart);
		click(driver,TypeInput_TextChart);
		sendKeys(driver,TypeInput_TextChart,Input_Value_Type_TEXTChart);
		scrollUsingElement(driver,ApplyButton);
		click(driver,ApplyButton);
		if(isDisplayed2(driver,error)){
			 String errorWidget=getText1(driver,error);
    		 if(errorWidget.contains("Please refer the logs in Logs")) {
    			 fail(driver,"Error displayed When click Apply Button on 'Text' Widget, Validation : "+errorWidget);
    		 }else {
    			 pass(driver,"Error displayed When click Apply Button on 'Text' Widget, Validation : "+errorWidget);
    		 }
    		 elementnotvisible1(driver, error);
		 }
		
		String AfterApply_Text=getText(driver, TypeInput_TextChart);
		if(AfterApply_Text.equals(Input_Value_Type_TEXTChart)) {
			pass(driver,"User entered Value is correctly displayed in the Chart");
		}else {
			fail(driver,"User entered Value is not correctly displayed in the Chart");
		}
		
		setTestCaseID("");
		verifyElementDisplayed(driver, GradientColor_Input1);
		verifyElementDisplayed(driver, GradientColor_Input2);
		setTestCaseID("TC_TEXT_003");
        String defaultGradientColor=getTextBackgroundColor(driver, Gradient_InputPointer1);
        if(Default_ColorGradient_Text.equalsIgnoreCase(defaultGradientColor)) {
        	pass(driver,"By default, "+Default_ColorGradient_Text+" is Displayed in the Gradient Color Input1");
        }else {
        	fail(driver,"By default, "+Default_ColorGradient_Text+" is not Displyed in the Gradient Color Input1");
        }
        
        String defaultGradientColor2=getTextBackgroundColor(driver, Gradient_InputPointer2);
        if(Default_ColorGradient_Text.equalsIgnoreCase(defaultGradientColor2)) {
        	pass(driver,"By default, "+Default_ColorGradient_Text+" is Displayed in the Gradient Color Input2");
        }else {
        	fail(driver,"By default, "+Default_ColorGradient_Text+" is not Displyed in the Gradient Color Input2");
        }
        
        //Validating the Default Gradient Color in the Chart
        WebElement gradientElement = getWebElement(driver, TextTypeInput_Chart);
        String backgroundImage = gradientElement.getCssValue("background-image");
        String  Default_RGB=convertHexToRGB(Default_ColorGradient_Text);
        String expectedGradient = "linear-gradient(45deg, " + Default_RGB + ", " + Default_RGB + ")";
        if (backgroundImage.contains(expectedGradient)) {
        	pass(driver,"Default Gradient color is correctly applied in the Chart ");
            System.out.println("Default Gradient color is correctly applied in the Chart : " + backgroundImage);
        } else {
        	fail(driver,"Default Gradient color is not correctly applied in the Chart ");
            System.out.println("Default Gradient color does not correctly in the Chart : " + backgroundImage);
        }
        
        setTestCaseID("TC_TEXT_002");
        click(driver,GradientColor_Input1);
        if(isDisplayed(driver,ColorPickerOpen)) {
 			pass(driver,"The color pickers opens promptly after clicking the Gradient Color Input 1");
        }else {
 			fail(driver,"The color pickers not opens promptly after clicking the Gradient Color Input 1");
        }
        wait(driver,"1");
        mouseOverAndClick(driver,Color_Gradient_text);
        wait(driver,"1");
        if(!isDisplayed(driver,ColorPickerOpen)) {
 			pass(driver,"The color pickers Closed promptly after clicking outside the Gradient Color Input 1");
        }else {
 			fail(driver,"The color pickers not Closed promptly after clicking outside the Gradient Color Input 1");
        }

        
        setTestCaseID("TC_TEXT_005");
        click(driver,GradientColor_Input1);
        wait(driver,"1");
        action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        sendKeys(driver,GradientColor_Input1,Change_Gradient_Color1);
        click3(driver,Color_Gradient_text);
        String GradientColor_1=getTextBackgroundColor(driver, Gradient_InputPointer1);
       
        if((GradientColor_1.equalsIgnoreCase(Change_Gradient_Color1))) {
 			pass(driver,"Manually Enter the Color, "+Change_Gradient_Color1+" updated in the Gradient Color Input 1");
        }else {
 			fail(driver,"Manually Enter the Color, "+Change_Gradient_Color1+" not updated in the Gradient Color Input 1");
        }
        
        click(driver,GradientColor_Input2);
        wait(driver,"1");
        action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        sendKeys(driver,GradientColor_Input2,Change_Gradient_Color2);
        click3(driver,Color_Gradient_text);
        String GradientColor_2=getTextBackgroundColor(driver, Gradient_InputPointer2);

        if((GradientColor_2.equalsIgnoreCase(Change_Gradient_Color2))) {
 			pass(driver,"Manually Enter the Color, "+Change_Gradient_Color2+" updated in the Gradient Color Input 2");
        }else {
 			fail(driver,"Manually Enter the Color, "+Change_Gradient_Color2+" not updated in the Gradient Color Input 2");
        }
		
        scrollUsingElement(driver,ApplyButton);
		click(driver,ApplyButton);
        
		 //Validating the Default Gradient Color in the Chart
        WebElement gradientElement1 = getWebElement(driver, TextTypeInput_Chart);
        String backgroundImage1 = gradientElement1.getCssValue("background-image");
        String  Change_RGB1=convertHexToRGB(Change_Gradient_Color1);
        String  Change_RGB2=convertHexToRGB(Change_Gradient_Color2);
        String expectedGradient1 = "linear-gradient(45deg, " + Change_RGB1 + ", " + Change_RGB2 + ")";
        System.out.println("expectedGradient1 : "+expectedGradient1);
        if (backgroundImage1.contains(expectedGradient1)) {
        	pass(driver,"Manually Entered Gradient Color is correctly applied in the Chart");
            System.out.println("Manually Entered Gradient Color is correctly applied in the Chart: " + backgroundImage1);
        } else {
        	fail(driver,"Manually Entered Gradient Color is not correctly applied in the Chart");
            System.out.println("Manually Entered Gradient Color is not correctly applied in the Chart : " + backgroundImage1);
        }
        
        setTestCaseID("TC_TEXT_004");
        click(driver,GradientColor_Input1);
        wait(driver,"1");
        action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        action.sendKeys(Keys.BACK_SPACE).build().perform();
        wait(driver,"1");
        click(driver,Color_Gradient_text);
        String AfterRever_GradientColor_1=getTextBackgroundColor(driver, Gradient_InputPointer1);

        if((AfterRever_GradientColor_1.equalsIgnoreCase(Default_ColorGradient_Text))) {
 			pass(driver,"After revert all color selection default Color is updated in the Gradient Color Input 1");
        }else {
 			fail(driver,"After revert all color selection default Color is not updated in the Gradient Color Input 1");
        }
        setTestCaseID("");
        click(driver,GradientColor_Input1);
        waitForElement(driver,ColorPickerOpen);
        verifyElementIsPresent1(driver,ThemeColor);
        verifyElementIsPresent1(driver,History);
        mouseOverToElement(driver,Color2);
        wait(driver,"1");
        mouseOverToElement(driver,mouseOverColorHistory);
        wait(driver,"1");
        mouseOverToElement(driver,Color2);
        String mouseOverHistoryColor=getText1(driver,mouseOverColorHistory);
        doubleClick(driver,mouseOverColorHistory);
        wait(driver,"1");
        action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
        doubleClick(driver,GradientColor_Input1);
        wait(driver,"1");
        action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
        wait(driver,"1");
        click3(driver,Color_Gradient_text);
        String AfterPasteBackgroundColor=getTextBackgroundColor(driver, Gradient_InputPointer1);
        if(AfterPasteBackgroundColor.equalsIgnoreCase(mouseOverHistoryColor)) {
        	pass(driver,"Copy Paste Color value is working fine in Gradient Color Input 1");
        }else {
        	fail(driver,"Copy Paste Color value is not working fine in Gradient Color Input 1");
        }
        
        setTestCaseID("TC_TEXT_004");
        click(driver,GradientColor_Input2);
        wait(driver,"1");
        action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        action.sendKeys(Keys.BACK_SPACE).build().perform();
        wait(driver,"1");
        click3(driver,Color_Gradient_text);
        String AfterRever_GradientColor_2=getTextBackgroundColor(driver, Gradient_InputPointer2);

        if((AfterRever_GradientColor_2.equalsIgnoreCase(Default_ColorGradient_Text))) {
 			pass(driver,"After revert all color selection default Color is updated in the Gradient Color Input 2");
        }else {
 			fail(driver,"After revert all color selection default Color is not updated in the Gradient Color Input 2");
        }
        setTestCaseID("");
        click(driver,GradientColor_Input2);
        waitForElement(driver,ColorPickerOpen);
        verifyElementIsPresent1(driver,ThemeColor);
        verifyElementIsPresent1(driver,History);
        mouseOverToElement(driver,Color2);
        wait(driver,"1");
        mouseOverToElement(driver,mouseOverColorHistory);
        wait(driver,"1");
        mouseOverToElement(driver,Color2);
        mouseOverHistoryColor=getText1(driver,mouseOverColorHistory);
        doubleClick(driver,mouseOverColorHistory);
        wait(driver,"1");
        action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
        doubleClick(driver,GradientColor_Input2);
        wait(driver,"1");
        action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
        wait(driver,"1");
        click3(driver,Color_Gradient_text);
        AfterPasteBackgroundColor=getTextBackgroundColor(driver, Gradient_InputPointer2);
        if(AfterPasteBackgroundColor.equalsIgnoreCase(mouseOverHistoryColor)) {
        	pass(driver,"Copy Paste Color value is working fine in Gradient Color Input 2");
        }else {
        	fail(driver,"Copy Paste Color value is not working fine in Gradient Color Input 2");
        }
        
        setTestCaseID("");
        verifyElementDisplayed(driver, Border_Radiun_Toggle);
        verifyElementDisplayed(driver, Border_Radius_text);
        setTestCaseID("TC_TEXT_006");
        if(isToggleEnable(driver, Border_Radius_Input)) {
        	fail(driver,"By default, Border Radius toggle is enabled");
        }else {
        	pass(driver,"By default Border Radius Toggle is disabled");
        }
        setTestCaseID("TC_TEXT_007");
        click(driver,Border_Radiun_Toggle);
        if(isToggleEnable(driver, Border_Radius_Input)) {
        	pass(driver,"Border Radius toggle is enabled when enabling it");
        }else {
        	fail(driver,"Border Radius toggle is not enabled when enabling it");
        }

        // ******************** ChartTitle Validation Start *******************
	 	String Text_Chart_Title= getCellValue("TestExecution","Testcase_Selection","Text_Chart_Title",Flag);
        if(Text_Chart_Title.equals("Yes")) {
       	   CHART_TITLE chartTitle=new CHART_TITLE();
            chartTitle.chartTitleTest(driver, TypeBackgroundColor1_ChartTitle, TypeTextColor1_ChartTitle, Change_FontFamily_ChartTitle, ChangeFontSize_ChartTitle,ChangeChartTitleName);       	
        }
       // ******************** ChartTitle Validation End *******************
        setTestCaseID("");
	 	
        click(driver,Chart_FormatSec);
   		//*********************** Chart Format Validation Start ***********************
    	String Text_ChartFormat_As_Label= getCellValue("TestExecution","Testcase_Selection","Text_ChartFormat_As_Label",Flag);
        if(Text_ChartFormat_As_Label.equals("Yes")) {
   	      	 String ChartFormatOpenstatus=getAttribute1(driver, chartFormatExpand, "class");
   	  		 if(ChartFormatOpenstatus.contains("up")) {
   	  			pass(driver,"Chart Format is expanded when clicking the Chart Format");
   	  		 }else {
   	  			fail(driver,"Chart Format is not expanded when click the Chart Format");
   	  			
   	  		 }
   	  		 setTestCaseID("TC_CHARTFORMAT_ LABEL_001");
   	  		 verifyElementDisplayed(driver, Position_Input_Label);
   	  		 String defaultPositionAct=defaultSelectedValue(driver, Position_Input_Label);
   	  		 if(defaultPositionAct.equals("Left")) {
   	  			 pass(driver,"By default Left is selected in the Position Input");
   	  		 }else {
   	  			 fail(driver,"By default Left is not selected in the Position Input, Act : "+defaultPositionAct);
   	  		 }
   	  		 
   	  		 setTestCaseID("TC_CHARTFORMAT_ LABEL_002");
   	  		 if(isToggleAccessible(driver, Position_Input_Label)) {
   	  			 pass(driver,"Position Input toggle is Accessible");
   	  		 }else {
   	  			 fail(driver,"Position Input toggle is not Accessible");
   	  		 }
   	  		 
   	    	 setTestCaseID("TC_CHARTFORMAT_ LABEL_003");
   	  		 try {
   	  			 	String script = "document.querySelector('#RPE_LabelPosition optgroup[label="+Vertical_Position_Select+"] option[value="+Horizontal_Position_Select+"]').selected = true;";
		 			((JavascriptExecutor) driver).executeScript(script);
		 			pass(driver,"Position Value selected Successfully "+Vertical_Position_Select+" "+Horizontal_Position_Select);
   	  		 }catch(Exception e) {
   	  			 fail(driver,"Unable to select the Value , "+Vertical_Position_Select+" "+Horizontal_Position_Select);
   	  		 }
   	  		 
   	  		 scrollUsingElement(driver,ApplyButton);
			 click(driver,ApplyButton);
			 wait(driver,"1");
   	  		 WebElement ChartText=getWebElement(driver, TypeInput_TextChart);
   	  		 String Applied_Vertical_Act=ChartText.getCssValue("align-items");
   	  		 String Applied_HoriZontal_Act=ChartText.getCssValue("text-align");
   	  		 if(Applied_Vertical_Act.equalsIgnoreCase(Vertical_Position_Select) && Applied_HoriZontal_Act.equalsIgnoreCase(Horizontal_Position_Select)) {
   	  			 pass(driver,"Selected "+Vertical_Position_Select+" "+Horizontal_Position_Select+" position is applied correctly in the chart");
   	  		 }else {
   	  			 fail(driver,"Selected "+Vertical_Position_Select+" "+Horizontal_Position_Select+" position is not applied correctly in the chart"); 
   	  		 }
   	  		 
   	  		 setTestCaseID("TC_CHARTFORMAT_ LABEL_005");
   	  		 verifyElementDisplayed(driver, FontColor_Input_Label);
   	  		 verifyElementDisplayed(driver, Font_Color_text_Label);

   	  		 String defaultFontColor_Act=getTextBackgroundColor(driver, FontColor_Input_Pointer);
   	  		 if(defaultFontColor_Act.equalsIgnoreCase(Default_Label_FontColor_Text)) {
   	  			 pass(driver,"By default "+Default_Label_FontColor_Text+" is displayed in the Font Color Input");
   	  		 }else {
   	  			 fail(driver,"By default "+Default_Label_FontColor_Text+" is not displayed in the Font Color Input"); 
   	  		 }
   	  		 
   	  		 setTestCaseID("");
   	  		 click(driver,FontColor_Input_Label);
   	  		 wait(driver,"1");
	   	  	 action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
	         sendKeys(driver,FontColor_Input_Label,Change_FontColor_Label);
	         click3(driver,Font_Color_text_Label);
	         String FontColor_Act=getTextBackgroundColor(driver, FontColor_Input_Pointer);
	
	         if((FontColor_Act.equalsIgnoreCase(Change_FontColor_Label))) {
	  			pass(driver,"Manually Enter the Color, "+Change_FontColor_Label+" updated in the Font Color Input");
	         }else {
	  			fail(driver,"Manually Enter the Color, "+Change_FontColor_Label+" not updated in the Font Color Input");
	         }
 		
	         scrollUsingElement(driver,ApplyButton);
	 		 click(driver,ApplyButton);
	         
   	  		 String AppliedFontColor_act=getTextColor(driver, TypeInput_TextChart);
   	  		 if(AppliedFontColor_act.equalsIgnoreCase(Change_FontColor_Label)) {
   	  			 pass(driver,"Selected "+Change_FontColor_Label+" color is applied in the text in the chart");
   	  		 }else {
   	  			 fail(driver,"Selected "+Change_FontColor_Label+" color is not applied in the text in the chart");
   	  		 }
   	  		 
   	  	     setTestCaseID("TC_CHARTFORMAT_ LABEL_006");
   	  	     click(driver,FontColor_Input_Label);
   	         wait(driver,"1");
   	         action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
   	         action.sendKeys(Keys.BACK_SPACE).build().perform();
   	         wait(driver,"1");
   	         click3(driver,Font_Color_text_Label);
   	         String AfterRever_FontColor=getTextBackgroundColor(driver, FontColor_Input_Pointer);

   	         if((AfterRever_FontColor.equalsIgnoreCase(Default_Label_FontColor_Text))) {
   	 			 pass(driver,"After revert all color selection default Color is updated in the Font Color Input");
   	         }else {
   	 			 fail(driver,"After revert all color selection default Color is not updated in the Font Color Input");
   	         }
   	         setTestCaseID("");
   	          click3(driver,Font_Color_text_Label);
	   	      click(driver,FontColor_Input_Label);
	          waitForElement(driver,ColorPickerOpen);
	          verifyElementIsPresent1(driver,ThemeColor);
	          verifyElementIsPresent1(driver,History);
	          mouseOverToElement(driver,Color6);
	          wait(driver,"1");
	          mouseOverToElement(driver,mouseOverColorHistory);
	          wait(driver,"1");
	          mouseOverToElement(driver,Color6);
	          mouseOverHistoryColor=getText1(driver,mouseOverColorHistory);
	          doubleClick(driver,mouseOverColorHistory);
	          wait(driver,"1");
	          action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
	          doubleClick(driver,FontColor_Input_Label);
	          wait(driver,"1");
	          action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
	          wait(driver,"1");
	          click3(driver,Font_Color_text_Label);
	          AfterPasteBackgroundColor=getTextBackgroundColor(driver, FontColor_Input_Pointer);
	          if(AfterPasteBackgroundColor.equalsIgnoreCase(mouseOverHistoryColor)) {
	          	pass(driver,"Copy Paste Color value is working fine in Font Color Input");
	          }else {
	          	fail(driver,"Copy Paste Color value is not working fine in Font Color Input");
	          }
	          
	          setTestCaseID("TC_CHARTFORMAT_ LABEL_007");
	          verifyElementDisplayed(driver, FontFamily_Input_Label);
	          if(isToggleAccessible(driver, FontFamily_Input_Label)) {
	        	  pass(driver,"Font Family Input is Accessible");
	          }else {
	        	  fail(driver,"Font Family Input is not Accessible");
	          }
	          setTestCaseID("TC_CHARTFORMAT_ LABEL_008");
	          String defaultFontFamily_text=getText1(driver, FontFamily_Input_Label);
	          if(Default_FontFamily_TextWidget.equals(defaultFontFamily_text)) {
	        	  pass(driver,"By default, "+Default_FontFamily_TextWidget+" is displayed in the Font Family Input");
	          }else {
	        	  fail(driver,"By default, "+Default_FontFamily_TextWidget+" is not displayed in the Font Family Input");
	          }
   	  		  
	         setTestCaseID("TC_CHARTFORMAT_ LABEL_009");
   	  	     click(driver,FontFamily_Input_Label);
   	     	 if(verifyElementDisplayed(driver,Font_Family_Results_Label)) {
   	        	pass(driver,"Font family dropdown expanded after click on it");
   	           setTestCaseID("");
   	        	mouseOverToElement(driver,SecondValue);
   	        	wait(driver,"1");
   	    		String mouseHighlightColor=getTextBackgroundColor(driver,SecondValue);
   	    		if(Highlight_color_Exp.equalsIgnoreCase(mouseHighlightColor)) {
   	    			pass(driver,"Mouse hovered color value highlighted in blue color");
   	    		}else {
   	    			fail(driver,"Mouse hovered color value not highlighted in blue color");
   	    		}

   	    		ScrollBarValidation1(driver,Font_Family_Results_Label,"Font_Family_text_Widget");
   	     	
   	    	    setTestCaseID("TC_CHARTFORMAT_ LABEL_010");
   		     	List<WebElement> beforeSearchResults=getWebElements(driver,chartFontFamilyResults);
   		     	int beforeSearchSize=beforeSearchResults.size();
   		     	verifyElementDisplayed(driver, dropdownInputsearchBox);
   		     	click(driver,dropdownInputsearchBox);
   		     	sendKeys(driver,dropdownInputsearchBox,ChangeFontFamily_Label);
   		     	List<WebElement> afterSearchResults=getWebElements(driver,chartFontFamilyResults);
   		     	int afterSearchSize=afterSearchResults.size();
   		        String resultText=getText1(driver,fontFamilyFirstResult);
   		        if((beforeSearchSize>afterSearchSize)&&resultText.equals(ChangeFontFamily_Label)) {
   		 		  pass(driver,"Search input in the Font Family dropdown works properly");
   		        }else {
   		     	   fail(driver,"Search input in the Font Family dropdown not works properly");
   		        }
   		     	
   		        setTestCaseID("TC_CHARTFORMAT_ LABEL_011");
   		       	selectFontFamily(driver,ChangeFontFamily_Label);
   		       	wait(driver,"1");
   		       	if(isDisplayed2(driver,Font_Family_Results_Label)) {
   		       		fail(driver,"Font Family dropdown not closed after select the value");
   		       	}else {
   		  			 pass(driver,"Font Family dropdown closed after select the value");
   		       	}
   		     	wait(driver,"1");
   		        setTestCaseID("TC_CHARTFORMAT_ LABEL_012");
   		       	String selectedFontFamilyValue=getText1(driver,FontFamily_Input_Label); 
   		       	if(selectedFontFamilyValue.equals(ChangeFontFamily_Label)) {
   		 		    pass(driver,"Selected fontFamily Updated in Font Family Input field");
   		       	}else {
   		       		fail(driver,"Selected fontFamily not Updated in Font Family Input field");
   		       	}
   		        	
   		        setTestCaseID("TC_CHARTFORMAT_ LABEL_013");
   		        scrollUsingElement(driver,ApplyButton);
	 		    click(driver,ApplyButton);
	            
	 		    String Applied_FontFamily_text=getFontFamily(driver, TypeInput_TextChart);
	 		    if(ChangeFontFamily_Label.equals(Applied_FontFamily_text)) {
	 		    	pass(driver,"Selected "+ChangeFontFamily_Label+" FontFamily is updated in the Text Chart");
	 		    }else {
	 		    	fail(driver,"Selected "+ChangeFontFamily_Label+" FontFamily is not updated in the Text Chart");
	 		    }
   	    		
   	        }else {
   	     	    fail(driver,"Font family dropdown not expanded");
   	        }
   	        
	         setTestCaseID("TC_CHARTFORMAT_ LABEL_014");
	         verifyElementDisplayed(driver,FontSize_Input_Label);
	         if(isToggleAccessible(driver, FontSize_Input_Label)) {
	        	 pass(driver,"Font Size dropdown is Accessible");
	         }else {
	        	 fail(driver,"Font Size dropdown is not Accessible");
	         }
	         
	         setTestCaseID("TC_CHARTFORMAT_ LABEL_015");
	         String defaultFontSize_Act=defaultSelectedValue(driver, FontSize_Input_Label);
	         System.out.println("defaultFontSize_Act : "+defaultFontSize_Act);
	         if(defaultFontSize_Act.equals("16")) {
	        	 pass(driver,"By default, '16' Value selected in the Font Size Input");
	         }else {
	        	 fail(driver,"By default, '16' Value not selected in the Font Size Input");
	         }
	        
	       // Font Size Validation start....
	         String ChartTitleFontSize_Actual=getFontSize(driver,TypeInput_TextChart);
	         if(ChartTitleFontSize_Actual.equals(defaultFontSize_Act)) {
				  pass(driver,"By default font size Updated in Text chart");
			 }else {
				 fail(driver,"By default font size is not Updated in Text chart");
			 }
	       
	         setTestCaseID("TC_CHARTFORMAT_ LABEL_016");
	         click(driver,FontSize_Input_Label);
      		 selectOptionValue(driver,FontSize_Input_Label,Change_FontSize_Label);
      		 wait(driver,"1");
      		 String selectedFontSizeValue=getTextJavascript(driver,FontSize_Input_Label);
      		 if(selectedFontSizeValue.equals(Change_FontSize_Label)) {
			    pass(driver,"Selected Font Size Updated in Font Size Input");
      		 }else {
		 	    fail(driver,"Font Size not Updated in Font Size Input");
      		 }
      		 
      		 setTestCaseID("TC_CHARTFORMAT_ LABEL_017");
      		 scrollUsingElement(driver,ApplyButton);
 		     click(driver,ApplyButton);
 		     wait(driver,"1");
      		 String AppliedChartTitleFontSize_Actual=getFontSize(driver,TypeInput_TextChart);
      		 if(AppliedChartTitleFontSize_Actual.equals(Change_FontSize_Label)) {
			    pass(driver,"Selected Font Size '"+Change_FontSize_Label+"' Updated in Text Chart");
      		 }else {
		 	    fail(driver,"Selected Font Size '"+Change_FontSize_Label+"' not Updated in Text Chart, Act : "+AppliedChartTitleFontSize_Actual);
      		 }
	       
      		 setTestCaseID("TC_CHARTFORMAT_ LABEL_018");
	         verifyElementDisplayed(driver, Bold_Label_Formating);//#cccccc
	         click(driver,Bold_Label_Formating);
	         wait(driver,"1");
	         String Bold_backgroundColor=getTextBackgroundColor(driver, Bold_Label_Formating);
	         if(Bold_backgroundColor.equalsIgnoreCase("#cccccc")) {
	        	 pass(driver,"Bold is highlighted in grey color after selecting it");
	         }else {
	        	 fail(driver,"Bold is not highlighted in grey color after selecting it");
	         }
	          
	         scrollUsingElement(driver,ApplyButton);
 		     click(driver,ApplyButton);
 		     wait(driver,"1");
 		     
 		     WebElement Textchart_Value=getWebElement(driver, TypeInput_TextChart);
 		     String ChartText_FormatValue=Textchart_Value.getCssValue("font-weight");
 		     if(ChartText_FormatValue.equals("bold") || ChartText_FormatValue.equals("700")) {
 		    	 pass(driver,"Bold is applied in the Text chart");
 		     }else {
 		    	fail(driver,"Bold is not applied in the Text chart");
 		     }
	          
 		     verifyElementDisplayed(driver, Italic_Label_Formating);//#cccccc
	         click(driver,Italic_Label_Formating);
	         wait(driver,"1");
	         String Italic_backgroundColor=getTextBackgroundColor(driver, Italic_Label_Formating);
	         if(Italic_backgroundColor.equalsIgnoreCase("#cccccc")) {
	        	 pass(driver,"Italic is highlighted in grey color after selecting it");
	         }else {
	        	 fail(driver,"Italic is not highlighted in grey color after selecting it");
	         }
	          
	         scrollUsingElement(driver,ApplyButton);
		     click(driver,ApplyButton);
		     wait(driver,"1");
		     Textchart_Value=getWebElement(driver, TypeInput_TextChart);
		     ChartText_FormatValue=Textchart_Value.getCssValue("font-style");
		     if(ChartText_FormatValue.equals("italic")) {
		    	 pass(driver,"Italic is applied in the Text chart");
		     }else {
		    	fail(driver,"Italic is not applied in the Text chart");
		     }
	          
		     setTestCaseID("TC_CHARTFORMAT_ LABEL_017");
		     click(driver,Chart_FormatSec);
		     ChartFormatOpenstatus=getAttribute1(driver, chartFormatExpand, "class");
   	  		 if(!ChartFormatOpenstatus.contains("up")) {
   	  			pass(driver,"Chart Format is Collapsed when clicking the Chart Format");
   	  		 }else {
    	  		fail(driver,"Chart Format is not Collapsed when clicking the Chart Format");
   	  		 }
        }
        //***************** Chart Format Validation End ***********************
        
         setTestCaseID("");
   	     click(driver,ChartTitleInput);
		 clear(driver,ChartTitleInput);
 		 verifyElementDisplayed(driver, SaveBtn_Chart);
 		 verifyElementDisplayed(driver, cancel_chart);
 		 click(driver,SaveBtn_Chart);
 		 if(isDisplayed(driver,chartSaveError1)) {
 			 pass(driver,"'Enter Widget Name' error displayed when save the chart without given chart title name");
 		 }else {
 			 fail(driver,"'Enter Widget Name' error not displayed when save the chart without given chart title name");
 		 }
 		 elementnotvisible(driver, chartSaveError1);
 		 sendKeys(driver,ChartTitleInput,ChangeChartTitleName);
 		 click(driver,SaveBtn_Chart);
 		 elementnotvisible1(driver, RPE_Loading);
 		 if(!isDisplayed2(driver,chartSaveError1) && isDisplayed(driver,SavedChartTitleInput)) {
 			 pass(driver,"Chart Saved Successfully");
 		 }else {
 			 fail(driver,"Chart not Saved Successfully");
 		 }	
	      
 		 String AfterSaveChartTitleName=getText1(driver, SavedChartTitleName);
 		 if(AfterSaveChartTitleName.equals(ChangeChartTitleName)) {
 			 pass(driver,"Same Chart Title name displayed after saved the chart ");
 		 }else {
 			 fail(driver,"Different Chart Title name displayed after saved the chart ");
 		 }
        
        
	}
}
