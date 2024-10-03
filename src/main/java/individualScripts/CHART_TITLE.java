package individualScripts;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import commonMethods.Keywords;
import commonMethods.Utils;

public class CHART_TITLE extends Keywords{

	public  void chartTitleTest(WebDriver driver,String TypeBackgroundColor1,String TypeTextColor1,String Change_FontFamily_ChartStyle,String ChangeFontSize_ChartStyle,String ChangeChartTitleName) {
		
		//Chart title
		String ChartTitleColorExp=Utils.getDataFromTestData("ChartTitle", "ChartTitleColorExp");
		String DefaultBackgroundColor_Exp=Utils.getDataFromTestData("ChartTitle", "DefaultBackgroundColor");
		String DefaultFontColor_Exp=Utils.getDataFromTestData("ChartTitle", "DefaultFontColor");
		String Default_FontFamily=Utils.getDataFromTestData("ChartTitle", "default_FontFamily");
		String default_FontSizeChartTitle_Exp=Utils.getDataFromTestData("ChartTitle", "default_FontSize");
		String Highlight_color_Exp=Utils.getDataFromTestData("Axes", "HighlightColor");
	
		// ******************** ChartTitle Validation Start *******************

		 Actions action=new Actions(driver);
		 setTestCaseID("TC_CHART_TITLE_001");
         verifyElementDisplayed(driver,chartTitle);
		 click(driver,chartTitle);
		 wait(driver,"1");
		 String CharttitleExpand=getAttribute1(driver,ChartTitleExpand,"class");
    	 if(CharttitleExpand.contains("up")) {
			pass(driver,"Chart Title is Expanded after click on it");
    	 }else {
			fail(driver,"Chart Title is not Expanded after click on it");
    	 }
       
    	 wait(driver,"1");
    	 String chartTitleTextColor_Act=getTextColor(driver,chartTitle);
    	 if(ChartTitleColorExp.equalsIgnoreCase(chartTitleTextColor_Act)) {
    		 pass(driver,"Chart title highlighted in blue color after expand it");
    	 }else {
    		fail(driver,"Chart title not highlighted in blue color after expand it");
    	 }
    	 
    	 verifyElementDisplayed(driver,BackgroundText);
    	 verifyElementDisplayed(driver,FontColorText);
    	 verifyElementDisplayed(driver,ChartFontFamilytext);
    	 verifyElementDisplayed(driver,ChartFontSizeText);
    	// verifyElementDisplayed(driver,BackgroundInput);
    	 
    	 //verifyElementDisplayed(driver, BackgroundText);
         verifyElementDisplayed(driver,BackgroundInput);
         setTestCaseID("TC_CHART_TITLE_004");
         String BackgroundInputText=getTextJavascript(driver,BackgroundInput);
         System.out.println("BackgroundInputText : "+BackgroundInputText);
         if(BackgroundInputText.equals(DefaultBackgroundColor_Exp)) {
        	 pass(driver,"By default, '"+DefaultBackgroundColor_Exp+"' Value selected in the Background Input");
         }else {
    	    fail(driver,"By default, '"+DefaultBackgroundColor_Exp+"' Value not selected in the Background Input");
         }
         
      // Background color Validation start
         setTestCaseID("TC_CHART_TITLE_002");
         click(driver,BackgroundInput);
         if(isDisplayed(driver,ColorPickerOpen)) {
  			pass(driver,"The color pickers opens promptly after clicking text box in background");
         }else {
  			fail(driver,"The color pickers not opens promptly after clicking text box in background");
         }
         
         setTestCaseID("TC_CHART_TITLE_003");
         click(driver,BackgroundText);
         wait(driver,"1");
         if(isDisplayed2(driver,ColorPickerOpen)) {
  			fail(driver,"The color picker not closes immediately when the user clicks outside its boundaries");
         }else {
  			pass(driver,"The color picker closes immediately when the user clicks outside its boundaries");
         }
         
         setTestCaseID("TC_CHART_TITLE_010");
         for (int i=0;i<2;i++) {
         	click3(driver,BackgroundInput);
             if(isDisplayed(driver,ColorPickerOpen)) {
          	   	pass(driver,"The color pickers opens properly for repeated Clicking");
             }else {
     				fail(driver,"The color pickers not opens properly for repeated Clicking");
             }
             click3(driver,BackgroundText);
             wait(driver,"1");
             if(isDisplayed2(driver,ColorPickerOpen)) {
     				fail(driver,"The color picker not closes immediately for repeated Clicking");
             }else {
     				pass(driver,"The color picker closes immediately for repeated Clicking");
             }
         }
         
         
         setTestCaseID("TC_CHART_TITLE_005");
         WebElement background=getWebElement(driver,BackgroundInput);
         action.click(background).build().perform();
         action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
         sendKeys(driver,BackgroundInput,TypeBackgroundColor1);
         click3(driver,BackgroundText);
         String SelectedBackgroundColor=getTextBackgroundColor(driver, BackgroundInputPointer);
         String AppliedChartTitleInputColor=getTextBackgroundColor(driver, ChartTitleInput);
         System.out.println("SelectedBackgroundColor : "+SelectedBackgroundColor+"  ---> AppliedChartTitleInputColor : "+AppliedChartTitleInputColor);

         if((SelectedBackgroundColor.equalsIgnoreCase(TypeBackgroundColor1))&&AppliedChartTitleInputColor.equalsIgnoreCase(TypeBackgroundColor1)) {
  			pass(driver,"While Manually Enter the Color, "+TypeBackgroundColor1+" updated in the Background Color input and Chart Title Input");
         }else {
  			fail(driver,"While Manually Enter the Color, "+TypeBackgroundColor1+" not updated correctly in the Background Color input and Chart Title Input");
         }
         
         setTestCaseID("TC_CHART_TITLE_006");
         action.click(background).build().perform();
         action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
         action.sendKeys(Keys.BACK_SPACE).build().perform();

         click3(driver,BackgroundText);
         String ResetBackgroundColor=getTextBackgroundColor(driver, BackgroundInputPointer);
         String ResetChartTitleInputColor=getTextBackgroundColor(driver, ChartTitleInput);
         System.out.println("ResetBackgroundColor : "+ResetBackgroundColor+"  ---> ResetChartTitleInputColor : "+ResetChartTitleInputColor);

         if(ResetBackgroundColor.equals(DefaultBackgroundColor_Exp)) {
  			pass(driver,"After revert all color selections, the color picker reset to the default color");
         }else {
  			fail(driver,"After revert all color selections, the color picker not reset to the default color");
         }
         
         if(ResetChartTitleInputColor.equals(DefaultBackgroundColor_Exp)) {
  			pass(driver,"After revert all color selections, the Chart Title Input reset to the default color");
         }else {
  			fail(driver,"After revert all color selections, the Chart Title Input not reset to the default color");
         }
         
         setTestCaseID("TC_CHART_TITLE_008");
         click(driver,BackgroundInput);
         waitForElement(driver,ColorPickerOpen);
         verifyElementIsPresent1(driver,ThemeColor);
         verifyElementIsPresent1(driver,History);
         mouseOverToElement(driver,Color1);
         mouseOverToElement(driver,Color1);
         String mouseOverColorValue=getTextBackgroundColor(driver, Color1);
         String mouseOverHistoryColor=getText1(driver,mouseOverColorHistory);
//         System.out.println("mouseOverColorValue : "+mouseOverColorValue+"  ---> mouseOverHistoryColor : "+mouseOverHistoryColor);
         if(mouseOverColorValue.equals(mouseOverHistoryColor)) {
  			pass(driver,"Mouse over color value updated in the history");
         }else {
  			fail(driver,"Mouse over color value not updated in the history");
         }
         
         String SelectColorValue=getTextBackgroundColor(driver, Color2);
         System.out.println("  ---> SelectColorValue : "+SelectColorValue); 
         click(driver,Color2);
         wait(driver,"1");
         if(isDisplayed2(driver,ColorPickerOpen)) {
  			fail(driver,"The color picker not closes immediately when the user select the color");
         }else {
  			pass(driver,"The color picker closes immediately when the user select the color");
         }
         String SelectedColorValue1=getTextJavascript(driver,BackgroundInput);
  		System.out.println("SelectedColorValue1 : "+SelectedColorValue1);
  		if(SelectedColorValue1.equals(SelectColorValue)) {
  			pass(driver,"Selected Color updated in the Background Input");
  		}else {
  			fail(driver,"Selected Color not updated in the Background Input");
  		}
         
  		 String ChartTitleInputColor1=getTextBackgroundColor(driver, ChartTitleInput);
          if(ChartTitleInputColor1.equals(SelectColorValue)) {
  			pass(driver,"Selected Color "+SelectColorValue+" updated in the Chart Title Input");
          }else {
   			fail(driver,"Selected Color not updated in the Chart Title Input");
          }
  		
          click3(driver,BackgroundInput);
          waitForElement(driver,ColorPickerOpen);
          
          String SelectedColorHistory=getText1(driver,selectedColorHistory);
          if(SelectedColorHistory.equals(SelectColorValue)) {
   			pass(driver,"Selected Color "+SelectedColorHistory+" updated in the history");
           }else {
    			fail(driver,"Selected Color not updated in the history");
           }
          
          setTestCaseID("TC_CHART_TITLE_007");
          mouseOverToElement(driver,Color2);
          wait(driver,"1");
          mouseOverHistoryColor=getText1(driver,mouseOverColorHistory);
          doubleClick(driver,mouseOverColorHistory);
          wait(driver,"1");
          action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
          click(driver,BackgroundText);
          wait(driver,"1");
          doubleClick(driver,BackgroundInput);
          wait(driver,"1");
          action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
          wait(driver,"1");
          click(driver,BackgroundText);
          String AfterPasteBackgroundColor=getTextBackgroundColor(driver, BackgroundInputPointer);
          if(AfterPasteBackgroundColor.equalsIgnoreCase(mouseOverHistoryColor)) {
         	pass(driver,"Copy Paste Color value is working fine in Background Input");
          }else {
         	fail(driver,"Copy Paste Color value is not working fine in Background Input");
          }
          
          click3(driver,BackgroundText);
          click(driver,BackgroundInput);
          action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
          sendKeys(driver,BackgroundInput,TypeBackgroundColor1);
          click3(driver,BackgroundText);
//       Background color Validation  End
  		
         // setTestCaseID("");
         //verifyElementDisplayed(driver, FontColorText);
          verifyElementDisplayed(driver,FontColorInput);
          String DefaultFontColor_Act=getTextJavascript(driver,FontColorInput);
          System.out.println("DefaultFontColor_Act : "+DefaultFontColor_Act);
          if(DefaultFontColor_Act.equals(DefaultFontColor_Exp)) {
        	  pass(driver,"By default, '"+DefaultFontColor_Exp+"' Value selected in the FontColor Input ");
          }else {
        	  fail(driver,"By default, '"+DefaultFontColor_Exp+"' Value not selected in the FontColor Input ");
          }
        
         click(driver,SaveBtn_Chart);
         if(verifyElementIsPresent1(driver,chartSaveError1)) {
   			pass(driver,"'Enter Widget Name' error displayed When click Save button without giving the value");
         }else {
         	fail(driver,"'Enter Widget Name' error not displayed When click Save button without giving the value");
         }
         
//      Font color Validation start...
         
        sendKeys(driver,ChartTitleInput,ChangeChartTitleName);
        String defaultChartTitletextColor=getTextColor(driver,ChartTitleInput);
        System.out.println("defaultChartTitletextColor : -> "+defaultChartTitletextColor);
        if(defaultChartTitletextColor.equalsIgnoreCase(DefaultFontColor_Exp)) {
 			pass(driver,"By Default, '"+DefaultFontColor_Exp+"' is updated in the Chart Title input text ");
        }else {
 			fail(driver,"By Default, '"+DefaultFontColor_Exp+"' is not updated in the Chart Title input text ");
        }
        
        click(driver,FontColorInput);
        if(isDisplayed(driver,ColorPickerOpen)) {
 			pass(driver,"The color pickers opens promptly after clicking font color input");
        }else {
 			fail(driver,"The color pickers not opens promptly after clicking font color input");
        }
        
        click(driver,FontColorText);
        wait(driver,"1");
        if(isDisplayed2(driver,ColorPickerOpen)) {
 			fail(driver,"The color picker not closes immediately when the user clicks outside Font color boundaries");
        }else {
 			pass(driver,"The color picker closes immediately when the user clicks outside Font color boundaries");
        }
        click(driver,FontColorInput);
        wait(driver,"1");
        action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        sendKeys(driver,FontColorInput,TypeTextColor1);
        click3(driver,FontColorText);
        String SelectedFontColor=getTextBackgroundColor(driver, FontColorInputPointer);
        String AppliedChartTitleTextColor=getTextColor(driver, ChartTitleInput);
        System.out.println("SelectedFontColor : "+SelectedFontColor+"  ---> AppliedChartTitleTextColor : "+AppliedChartTitleTextColor);

        if((SelectedFontColor.equalsIgnoreCase(TypeTextColor1))&&AppliedChartTitleTextColor.equalsIgnoreCase(TypeTextColor1)) {
 			pass(driver,"While Manually Enter the Color, "+TypeTextColor1+" updated in the Font Color input and Chart Title text");
        }else {
 			fail(driver,"While Manually Enter the Color, "+TypeTextColor1+" not updated in the Font Color input and Chart Title text");
        }
        
        click(driver,FontColorInput);
        wait(driver,"1");
        action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        action.sendKeys(Keys.BACK_SPACE).build().perform();
        wait(driver,"1");
        click(driver,FontColorText);
        String ResetFontColorColor=getTextBackgroundColor(driver, FontColorInputPointer);
        String ResetChartTitleTextColor=getTextColor(driver, ChartTitleInput);
        System.out.println("ResetFontColorColor : "+ResetFontColorColor+"  ---> ResetChartTitleTextColor : "+ResetChartTitleTextColor);

        if(ResetFontColorColor.equalsIgnoreCase(DefaultFontColor_Exp)) {
 			pass(driver,"After revert all color selections, the Font Color Input reset to the default color ");
        }else {
 			fail(driver,"After revert all color selections, the Font Color Input not reset to the default color ");
        }
        
        if(ResetChartTitleTextColor.equalsIgnoreCase(DefaultFontColor_Exp)) {
 			pass(driver,"After revert all color selections, the Chart Title Text reset to the default color ");
        }else {
 			fail(driver,"After revert all color selections, the Chart Title Text not reset to the default color ");
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
 			pass(driver,"Mouse over color value updated in the history");
        }else {
 			fail(driver,"Mouse over color value not updated in the history");
        }
        
        String SelectFontColorValue=getTextBackgroundColor(driver, Color2);
        System.out.println("  ---> SelectFontColorValue : "+SelectFontColorValue); 
        click(driver,Color2);
        wait(driver,"1");
        if(isDisplayed2(driver,ColorPickerOpen)) {
 			fail(driver,"The color picker not closes immediately when the user select the color");
        }else {
 			pass(driver,"The color picker closes immediately when the user select the color");
        }
        
        String SelectedFontColorValue1=getTextJavascript(driver,FontColorInput);
 		System.out.println("SelectedFontColorValue1 : "+SelectedFontColorValue1);
 		if(SelectedFontColorValue1.equals(SelectFontColorValue)) {
 			pass(driver,"Selected Background Color "+SelectFontColorValue+" updated in the Font Color Input");
 		}else {
 			fail(driver,"Selected Background Color "+SelectFontColorValue+" not updated in the Font Color Input");
 		}
        
 		String ChartTitleTextColor1=getTextColor(driver, ChartTitleInput);
        if(ChartTitleTextColor1.equals(SelectFontColorValue)) {
 			pass(driver,"Selected Background Color "+SelectFontColorValue+" updated in the Chart Title Text");
        }else {
 			fail(driver,"Selected Background Color "+SelectFontColorValue+" not updated in the Chart Title Text");
        }
 		
        click3(driver,FontColorInput);
        waitForElement(driver,ColorPickerOpen);
        
        String SelectedFontColorHistory=getText1(driver,selectedColorHistory);
        if(SelectedFontColorHistory.equals(SelectFontColorValue)) {
 			pass(driver,"Selected Font Color "+SelectFontColorValue+" updated in the history");
         }else {
  			fail(driver,"Selected Font Color not updated in the history");
         }
        click3(driver,FontColorText);
        
//      Font color Validation End...
         setTestCaseID("TC_CHART_TITLE_011");
         //verifyElementDisplayed(driver, ChartFontFamilytext);
         if(verifyElementDisplayed(driver,ChartFontFamilyDropdown)) {
        	 setTestCaseID("TC_CHART_TITLE_012");
    		String default_FontFamily_Act=getText1(driver,ChartFontFamilyDropdown);
    		System.out.println("default_FontFamily_Act : "+default_FontFamily_Act);
    		if(Default_FontFamily.equals(default_FontFamily_Act)) {
    			pass(driver,"By default, '"+Default_FontFamily+"' selected in the Font Family input");
    		}else {
        	    fail(driver,"By default, '"+Default_FontFamily+"' not selected in the Font Family input");
    		}
         }

         //Font Family Validation start...
         setTestCaseID("TC_CHART_TITLE_013");
        // String fontFamily_ValueChartTitle=getText1(driver,ChartFontFamilyDropdown);
     	 click(driver,ChartFontFamilyDropdown);
     	 setTestCaseID("TC_CHART_TITLE_015");
     	 if(verifyElementDisplayed(driver,ChartFontFamilyDropdownExpand)) {
        	pass(driver,"Font family dropdown expanded after click on it");
        	mouseOverToElement(driver,SecondValue);
        	wait(driver,"1");
    		String mouseHighlightColor=getTextBackgroundColor(driver,SecondValue);
    		if(Highlight_color_Exp.equalsIgnoreCase(mouseHighlightColor)) {
    			pass(driver,"Mouse hovered color value highlighted in blue color");
    		}else {
    			fail(driver,"Mouse hovered color value not highlighted in blue color");
    		}

    		
    		ScrollBarValidation1(driver,ChartFontFamilyDropdownExpand,"Font Family");
     	
    		//AlphabetOrderValidation(driver,chartFontFamilyResults);
    		setTestCaseID("TC_CHART_TITLE_016");
	     	List<WebElement> beforeSearchResults=getWebElements(driver,chartFontFamilyResults);
	     	int beforeSearchSize=beforeSearchResults.size();
	     	verifyElementDisplayed(driver, dropdownInputsearchBox);
	     	click(driver,dropdownInputsearchBox);
	     	sendKeys(driver,dropdownInputsearchBox,Change_FontFamily_ChartStyle);
	     	List<WebElement> afterSearchResults=getWebElements(driver,chartFontFamilyResults);
	     	int afterSearchSize=afterSearchResults.size();
	         String resultText=getText1(driver,fontFamilyFirstResult);
	         if((beforeSearchSize>afterSearchSize)&&resultText.equals(Change_FontFamily_ChartStyle)) {
	 		   pass(driver,"Search input in the Font Family dropdown works properly");
	         }else {
	     	    fail(driver,"Search input in the Font Family dropdown not works properly");
	         }
	     	
	         setTestCaseID("TC_CHART_TITLE_014");
	       	selectFontFamily(driver,Change_FontFamily_ChartStyle);
	       	wait(driver,"1");
	       	if(isDisplayed2(driver,ChartFontFamilyDropdownExpand)) {
	       		fail(driver,"Font Family dropdown not closed after select the value");
	       	}else {
	  			 pass(driver,"Font Family dropdown closed after select the value");
	       	}
	     	wait(driver,"1");
	     	setTestCaseID("TC_CHART_TITLE_018");
	       	String selectedFontFamilyValue=getText1(driver,ChartFontFamilyDropdown); 
	       	if(selectedFontFamilyValue.equals(Change_FontFamily_ChartStyle)) {
	 		    pass(driver,"Selected fontFamily Updated in Font Family Input field");
	       	}else {
	       		fail(driver,"Selected fontFamily not Updated in Font Family Input field");
	       	}
	        	
	       	setTestCaseID("TC_CHART_TITLE_019");
    		String fontFamily_ChartTitleText_Act=getFontFamily(driver,ChartTitleInput);
    		if(fontFamily_ChartTitleText_Act.equals(Change_FontFamily_ChartStyle)) {
   			    pass(driver,"Selected fontFamily  Updated in Chart Title text");
    		}else {
         	    fail(driver,"Selected fontFamily not Updated in Chart Title text");
    		}
    		
        }else {
     	    fail(driver,"Font family dropdown not expanded");
        }
        
     	 
     	 setTestCaseID("TC_CHART_TITLE_020");
         //verifyElementDisplayed(driver, ChartFontSizeText);
         verifyElementDisplayed(driver,ChartFontSizedDropdown);
    	 setTestCaseID("TC_CHART_TITLE_021");
         String defaultFontSize_Act=getTextJavascript(driver,ChartFontSizedDropdown);
         System.out.println("defaultFontSize_Act : "+defaultFontSize_Act);
         if(default_FontSizeChartTitle_Exp.equals(defaultFontSize_Act)) {
        	 pass(driver,"By default, '"+default_FontSizeChartTitle_Exp+"' Value selected in the Font Size Input");
         }else {
        	 fail(driver,"By default, '"+default_FontSizeChartTitle_Exp+"' Value not selected in the Font Size Input");
         }
        
       // Font Size Validation start....
         setTestCaseID("TC_CHART_TITLE_025");
       String defaultFontSizeValue=getTextJavascript(driver,ChartFontSizedDropdown);
       String ChartTitleFontSize_Actual=getFontSize(driver,ChartTitleInput);
       if(ChartTitleFontSize_Actual.equals(defaultFontSizeValue)) {
			 pass(driver,"By default font size  Updated in Chart Title text");
		}else {
    	    fail(driver,"By default font size not Updated in Chart Title text");
		}
       
       setTestCaseID("TC_CHART_TITLE_022");
       click(driver,ChartFontSizedDropdown);
       
       setTestCaseID("TC_CHART_TITLE_023");
       selectOptionValue(driver,ChartFontSizedDropdown,ChangeFontSize_ChartStyle);
       wait(driver,"1");
       setTestCaseID("TC_CHART_TITLE_029");
       String selectedFontSizeValue=getTextJavascript(driver,ChartFontSizedDropdown);
       if(selectedFontSizeValue.equals(ChangeFontSize_ChartStyle)) {
		    pass(driver,"Selected Font Size Updated in Font Size Input");
		}else {
	 	    fail(driver,"Font Size not Updated in Font Size Input");
		}
       setTestCaseID("TC_CHART_TITLE_030");
       String AppliedChartTitleFontSize_Actual=getFontSize(driver,ChartTitleInput);
       if(AppliedChartTitleFontSize_Actual.equals(ChangeFontSize_ChartStyle)) {
		    pass(driver,"Selected Font Size Updated in Chart Title text");
		}else {
	 	    fail(driver,"Selected Font Size not Updated in Chart Title text");
		}
       
       FontSizeOrderValidation(driver,FontSizeResults);
       
      	// ******** ChartTitle Validation End ***********************
       setTestCaseID("");
	}
	
	
	
}
