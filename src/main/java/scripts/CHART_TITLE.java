package scripts;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import commonMethods.Keywords;
import commonMethods.Utils;

public class CHART_TITLE extends Keywords{

	public void chartTitleTest(WebDriver driver,String TypeBackgroundColor1,String TypeTextColor1,String Change_FontFamily_ChartStyle,String ChangeFontSize_ChartStyle,String ChangeChartTitleName) {
		System.out.println("**Chart title Started**");
		String TestcaseFileName="DASHPRO_CHART_TITLE";
		String SheetName="CHART_TITLE";
		String TestcaseID_Flag="Flag";
		String TescasesID_Column="TEST CASE ID";
		//Yes/No Input for Testcases Id
		String TC_CHART_TITLE_001=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_CHART_TITLE_001",TestcaseID_Flag);
		String TC_CHART_TITLE_002=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_CHART_TITLE_002",TestcaseID_Flag);
		String TC_CHART_TITLE_003=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_CHART_TITLE_003",TestcaseID_Flag);
		String TC_CHART_TITLE_004=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_CHART_TITLE_004",TestcaseID_Flag);
		String TC_CHART_TITLE_005=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_CHART_TITLE_005",TestcaseID_Flag);
		String TC_CHART_TITLE_006=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_CHART_TITLE_006",TestcaseID_Flag);
		String TC_CHART_TITLE_007=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_CHART_TITLE_007",TestcaseID_Flag);
		String TC_CHART_TITLE_008=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_CHART_TITLE_008",TestcaseID_Flag);
		String TC_CHART_TITLE_009=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_CHART_TITLE_009",TestcaseID_Flag);
		String TC_CHART_TITLE_010=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_CHART_TITLE_010",TestcaseID_Flag);
		String TC_CHART_TITLE_011=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_CHART_TITLE_011",TestcaseID_Flag);
		String TC_CHART_TITLE_012=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_CHART_TITLE_012",TestcaseID_Flag);
		String TC_CHART_TITLE_013=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_CHART_TITLE_013",TestcaseID_Flag);
		String TC_CHART_TITLE_014=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_CHART_TITLE_014",TestcaseID_Flag);
		String TC_CHART_TITLE_015=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_CHART_TITLE_015",TestcaseID_Flag);
		String TC_CHART_TITLE_016=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_CHART_TITLE_016",TestcaseID_Flag);
		String TC_CHART_TITLE_017=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_CHART_TITLE_017",TestcaseID_Flag);
		String TC_CHART_TITLE_018=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_CHART_TITLE_018",TestcaseID_Flag);
		String TC_CHART_TITLE_019=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_CHART_TITLE_019",TestcaseID_Flag);
		String TC_CHART_TITLE_020=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_CHART_TITLE_020",TestcaseID_Flag);
		String TC_CHART_TITLE_021=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_CHART_TITLE_021",TestcaseID_Flag);
		String TC_CHART_TITLE_022=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_CHART_TITLE_022",TestcaseID_Flag);
		String TC_CHART_TITLE_023=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_CHART_TITLE_023",TestcaseID_Flag);
		String TC_CHART_TITLE_024=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_CHART_TITLE_024",TestcaseID_Flag);
		System.out.println("**Chart title Input End**");
		//Chart title
		String DefaultBackgroundColor_Exp=Utils.getDataFromTestData("ChartTitle", "DefaultBackgroundColor");
		String DefaultFontColor_Exp=Utils.getDataFromTestData("ChartTitle", "DefaultFontColor");
		String Default_FontFamily=Utils.getDataFromTestData("ChartTitle", "default_FontFamily");
		String default_FontSizeChartTitle_Exp=Utils.getDataFromTestData("ChartTitle", "default_FontSize");
	
		Actions action=new Actions(driver);
		setTestCaseID("");
		sendKeys(driver,ChartTitleInput,ChangeChartTitleName);
		if(TC_CHART_TITLE_001.equals("Yes")) {
			setTestCaseID("TC_CHART_TITLE_001");
			if(verifyElementDisplayed(driver,chartTitle)) {
				click(driver,chartTitle);
				wait(driver,"1");
				String CharttitleExpand=getAttribute1(driver,ChartTitleExpand,"class");
				if(!CharttitleExpand.contains("up")) {
					fail(driver,"Chart Title is not Expanded after click on it");
				}else {
					pass(driver,"Chart Title is Expanded after click on it");
					if(TC_CHART_TITLE_002.equals("Yes")) {
						setTestCaseID("TC_CHART_TITLE_002");
						verifyElementDisplayed(driver,BackgroundText);
						verifyElementDisplayed(driver,BackgroundInput);
						
						verifyElementDisplayed(driver,FontColorText);
						verifyElementDisplayed(driver,FontColorInput);
						
						verifyElementDisplayed(driver,ChartFontFamilytext);
						verifyElementDisplayed(driver,ChartFontFamilyDropdown);
						
						verifyElementDisplayed(driver,ChartFontSizeText);
						verifyElementDisplayed(driver,ChartFontSizeInput);
					}
					setTestCaseID("TS_CHART_TITLE_002");
					if(isDisplayed2(driver,BackgroundInput)) {
						if(TC_CHART_TITLE_004.equals("Yes")) {
							setTestCaseID("TC_CHART_TITLE_004");
							String BackgroundInputText=getTextJavascript(driver,BackgroundInput);
							System.out.println("BackgroundInputText : "+BackgroundInputText);
							if(BackgroundInputText.equals(DefaultBackgroundColor_Exp)) {
								pass(driver,"By default, '"+DefaultBackgroundColor_Exp+"' Value selected in the Background Input");
							}else {
								fail(driver,"By default, '"+DefaultBackgroundColor_Exp+"' Value not selected in the Background Input");
							}
						}
						
						if(TC_CHART_TITLE_003.equals("Yes")) {
							setTestCaseID("TC_CHART_TITLE_003");
							click(driver,BackgroundInput);
							if(isDisplayed(driver,ColorPickerOpen)) {
					  			pass(driver,"The color pickers opens promptly after clicking text box in background");
					  			
					  			if(TC_CHART_TITLE_006.equals("Yes")) {
									setTestCaseID("TC_CHART_TITLE_006");
									WebElement background=getWebElement(driver,BackgroundInput);
									action.click(background).build().perform();
									action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
									action.sendKeys(Keys.BACK_SPACE).build().perform();
									wait(driver,"1");
									String ResetBackgroundColor=getTextBackgroundColor(driver, BackgroundInputPointer);
									String ResetChartTitleInputColor=getTextBackgroundColor(driver, ChartTitleInput);
									System.out.println("ResetBackgroundColor : "+ResetBackgroundColor+"  ---> ResetChartTitleInputColor : "+ResetChartTitleInputColor);
									if(ResetBackgroundColor.equals(DefaultBackgroundColor_Exp)) {
										pass(driver,"After revert all color selections, the color picker reset to the default color");
									}else {
										fail(driver,"After revert all color selections, the color picker not reset to the default color");
									}
					  			}
					  			
					  			if(TC_CHART_TITLE_007.equals("Yes")) {
									setTestCaseID("TC_CHART_TITLE_007");
									mouseOverAndClick(driver, BackgroundInput);
									wait(driver,"1");
									mouseOverToElement(driver,Color2);
									wait(driver,"1");
									doubleClick(driver,mouseOverColorHistory);
									String mouseOverHistoryColor=getText1(driver,mouseOverColorHistory);
									wait(driver,"1");
									action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
									//click3(driver,BackgroundText);
									wait(driver,"1");
									doubleClick(driver,BackgroundInput);
									wait(driver,"1");
									action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
									wait(driver,"1");
									click(driver,BackgroundText);
									wait(driver,"1");
									String AfterPasteBackgroundColor=getTextBackgroundColor(driver, BackgroundInputPointer);
									if(AfterPasteBackgroundColor.equalsIgnoreCase(mouseOverHistoryColor)) {
										pass(driver,"Copy Paste Color value is working fine in Background Input");
									}else {
										fail(driver,"Copy Paste Color value is not working fine in Background Input");
									}
					  			}
					  			
					  			if(TC_CHART_TITLE_008.equals("Yes")) {
									setTestCaseID("TC_CHART_TITLE_008");
									mouseOverAndClick(driver, BackgroundInput);
									waitForElement(driver,ColorPickerOpen);
									verifyElementIsPresent1(driver,ThemeColor);
									verifyElementIsPresent1(driver,History);
									mouseOverToElement(driver,Color1);
									mouseOverToElement(driver,Color1);
									String mouseOverColorValue=getTextBackgroundColor(driver, Color1);
									String mouseOverHistoryColor=getText1(driver,mouseOverColorHistory);
//							         System.out.println("mouseOverColorValue : "+mouseOverColorValue+"  ---> mouseOverHistoryColor : "+mouseOverHistoryColor);
									if(mouseOverColorValue.equals(mouseOverHistoryColor)) {
										pass(driver,"Mouse over color value updated in the history");
									}else {
										fail(driver,"Mouse over color value not updated in the history");
									}
					  			}
					  			
					  			if(TC_CHART_TITLE_009.equals("Yes")) {
									setTestCaseID("TC_CHART_TITLE_009");
									mouseOverAndClick(driver, BackgroundInput);
									wait(driver,"1");
									waitForElement(driver,ColorPickerOpen);
									String SelectColorValue=getTextBackgroundColor(driver, Color2);
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
							  		String AppliedChartTitleInputColor=getTextBackgroundColor(driver, ChartTitleInput);
							  		if(SelectedColorValue1.equals(AppliedChartTitleInputColor)) {
							  			pass(driver,"Selected Color updated in the Background Chart Title");
							  		}else {
							  			fail(driver,"Selected Color not updated in the Background Chart Title");
							  		}
							  		
								}
					  			
					  			if(TC_CHART_TITLE_005.equals("Yes")) {
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
								}
							}else {
					  			fail(driver,"The color pickers not opens promptly after clicking text box in background");
							}
						}
					}else {
						fail(driver,"Background input is not present");
					}
					Escape(driver);
					setTestCaseID("TS_CHART_TITLE_003");
					if(isDisplayed2(driver,FontColorInput)) {
						if(TC_CHART_TITLE_004.equals("Yes")) {
							setTestCaseID("TC_CHART_TITLE_004");
							 String DefaultFontColor_Act=getTextJavascript(driver,FontColorInput);
							 System.out.println("DefaultFontColor_Act : "+DefaultFontColor_Act);
							 if(DefaultFontColor_Act.equals(DefaultFontColor_Exp)) {
								 pass(driver,"By default, '"+DefaultFontColor_Exp+"' Value selected in the FontColor Input ");
							 }else {
								 fail(driver,"By default, '"+DefaultFontColor_Exp+"' Value not selected in the FontColor Input ");
							 }
						}
						
						if(TC_CHART_TITLE_010.equals("Yes")) {
							setTestCaseID("TC_CHART_TITLE_010");
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
						}
					}else {
						fail(driver,"Font Color input is not present");
					}
					Escape(driver);
					
					setTestCaseID("TS_CHART_TITLE_004");
					if(isDisplayed2(driver,ChartFontFamilyDropdown)) {
						if(TC_CHART_TITLE_012.equals("Yes")) {
							setTestCaseID("TC_CHART_TITLE_012");
							String default_FontFamily_Act=getText1(driver,ChartFontFamilyDropdown);
							System.out.println("default_FontFamily_Act : "+default_FontFamily_Act);
							if(Default_FontFamily.equals(default_FontFamily_Act)) {
								pass(driver,"By default, '"+Default_FontFamily+"' selected in the Font Family input");
							}else {
								fail(driver,"By default, '"+Default_FontFamily+"' not selected in the Font Family input");
							}
						}
						
						if(TC_CHART_TITLE_011.equals("Yes")) {
							setTestCaseID("TC_CHART_TITLE_011");
							if(IsElementEnabled(driver, ChartFontFamilyDropdown)) {
								pass(driver,"Font Family input is accessible");
								if(TC_CHART_TITLE_013.equals("Yes")) {
									setTestCaseID("TC_CHART_TITLE_013");
									click(driver,ChartFontFamilyDropdown);
							     	if(verifyElementDisplayed(driver,ChartFontFamilyDropdownExpand)) {
							        	pass(driver,"Font family dropdown expanded after click on it");
							        	if(TC_CHART_TITLE_014.equals("Yes")) {
											setTestCaseID("TC_CHART_TITLE_014");
											ScrollBarValidation1(driver,ChartFontFamilyDropdownExpand,"Font Family");
							        	}
							        	
							        	if(TC_CHART_TITLE_015.equals("Yes")) {
											setTestCaseID("TC_CHART_TITLE_015");
											if(verifyElementDisplayed(driver, dropdownInputsearchBox)) {
												click(driver,dropdownInputsearchBox);
												List<WebElement> beforeSearchResults=getWebElements(driver,chartFontFamilyResults);
												int beforeSearchSize=beforeSearchResults.size();
										     	sendKeys(driver,dropdownInputsearchBox,Change_FontFamily_ChartStyle);
										     	List<WebElement> afterSearchResults=getWebElements(driver,chartFontFamilyResults);
										     	int afterSearchSize=afterSearchResults.size();
										     	String resultText=getText1(driver,fontFamilyFirstResult);
										     	if((beforeSearchSize>afterSearchSize)&&resultText.equals(Change_FontFamily_ChartStyle)) {
										     		pass(driver,"Search input in the Font Family dropdown works properly");
										     	}else {
										     		fail(driver,"Search input in the Font Family dropdown not works properly");
										     	}
											}
							        	}
							        	
							        	if(TC_CHART_TITLE_016.equals("Yes")) {
											setTestCaseID("TC_CHART_TITLE_016");
											selectFontFamily(driver,Change_FontFamily_ChartStyle);
									       	wait(driver,"1");
									       	if(isDisplayed2(driver,ChartFontFamilyDropdownExpand)) {
									       		fail(driver,"Font Family dropdown not closed after select the value");
									       	}else {
									  			 pass(driver,"Font Family dropdown closed after select the value");
									       	}
											
									       	if(TC_CHART_TITLE_017.equals("Yes")) {
												setTestCaseID("TC_CHART_TITLE_017");
												String selectedFontFamilyValue=getText1(driver,ChartFontFamilyDropdown); 
										       	if(selectedFontFamilyValue.equals(Change_FontFamily_ChartStyle)) {
										 		    pass(driver,"Selected fontFamily Updated in Font Family Input field");
										       	}else {
										       		fail(driver,"Selected fontFamily not Updated in Font Family Input field");
										       	}
									       	}
									       	
									    	if(TC_CHART_TITLE_018.equals("Yes")) {
												setTestCaseID("TC_CHART_TITLE_018");
												String fontFamily_ChartTitleText_Act=getFontFamily(driver,ChartTitleInput);
									    		if(fontFamily_ChartTitleText_Act.equals(Change_FontFamily_ChartStyle)) {
									   			    pass(driver,"Selected fontFamily  Updated in Chart Title text");
									    		}else {
									         	    fail(driver,"Selected fontFamily not Updated in Chart Title text");
									    		}
									    	}
							        	}
							     	}else {
							     		fail(driver,"Font family dropdown not expanded after click on it");
							     	}
								}
							}else {
								fail(driver,"Font Family input is not accessible");
							}
						}
					}else {
						fail(driver,"Font Family input not present");
					}
					
					setTestCaseID("TS_CHART_TITLE_005");
					if(isDisplayed2(driver,ChartFontSizeInput)) {
						if(TC_CHART_TITLE_020.equals("Yes")) {
							setTestCaseID("TC_CHART_TITLE_020");
							String defaultFontSize_Act=getTextJavascript(driver,ChartFontSizedDropdown);
					         System.out.println("defaultFontSize_Act : "+defaultFontSize_Act);
					         if(default_FontSizeChartTitle_Exp.equals(defaultFontSize_Act)) {
					        	 pass(driver,"By default, '"+default_FontSizeChartTitle_Exp+"' Value selected in the Font Size Input");
					         }else {
					        	 fail(driver,"By default, '"+default_FontSizeChartTitle_Exp+"' Value not selected in the Font Size Input");
					         }
						}
						if(TC_CHART_TITLE_019.equals("Yes")) {
							setTestCaseID("TC_CHART_TITLE_019");
							if(IsElementEnabled(driver, ChartFontSizeInput)) {
								pass(driver,"Font Size input is accessible");
								if(TC_CHART_TITLE_021.equals("Yes")) {
									setTestCaseID("TC_CHART_TITLE_021");
									click(driver,ChartFontSizeInput);
									verifyElementIsPresent1(driver, FontSizeResults);
								}
								if(TC_CHART_TITLE_022.equals("Yes")) {
									setTestCaseID("TC_CHART_TITLE_022");
								    selectOptionValue(driver,ChartFontSizedDropdown,ChangeFontSize_ChartStyle);
								    if(TC_CHART_TITLE_023.equals("Yes")) {
										setTestCaseID("TC_CHART_TITLE_023");
										wait(driver,"1");
										String selectedFontSizeValue=getTextJavascript(driver,ChartFontSizedDropdown);
										if(selectedFontSizeValue.equals(ChangeFontSize_ChartStyle)) {
											pass(driver,"Selected Font Size Updated in Font Size Input");
										}else {
											fail(driver,"Font Size not Updated in Font Size Input");
										}
								    }
								    
								    if(TC_CHART_TITLE_024.equals("Yes")) {
										setTestCaseID("TC_CHART_TITLE_024");
										 String AppliedChartTitleFontSize_Actual=getFontSize(driver,ChartTitleInput);
										 if(AppliedChartTitleFontSize_Actual.equals(ChangeFontSize_ChartStyle)) {
											 pass(driver,"Selected Font Size Updated in Chart Title text");
										 }else {
											 fail(driver,"Selected Font Size not Updated in Chart Title text");
										 }
								    }
								}
								
							}else {
								fail(driver,"Font Size input is not accessible");
							}
						}
					}else {
						fail(driver,"Font Size input not present");
					}
				}
		    	 
			}
		}
	
       setTestCaseID("");
	}
	
	
	
}
