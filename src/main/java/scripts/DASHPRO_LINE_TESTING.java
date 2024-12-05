package scripts;

import java.util.List;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import commonMethods.Keywords;
import commonMethods.Utils;

public class DASHPRO_LINE_TESTING extends Keywords{

	public void line_widget_testing(WebDriver driver,int iteration,String Flag) {
		
		//Axes input
		String AxesColor_Exp=Utils.getDataFromTestData("Axes", "Axes_Color_Exp");
		String Highlight_color_Exp=Utils.getDataFromTestData("Axes", "HighlightColor");
		
		//Axis title
		String AxisTextColorExp=Utils.getDataFromTestData("AxisTitle", "AxisTextColor_Exp");
		String default_FontFamily=Utils.getDataFromTestData("AxisTitle", "default_FontFamily");
		String default_FontSize_Exp=Utils.getDataFromTestData("AxisTitle", "default_FontSize");
		String RotationInputColor_Exp=Utils.getDataFromTestData("AxisTitle", "RotationInput_Color");
		String Highlight_Color_Exp=Utils.getDataFromTestData("AxisTitle", "HighlightColor_Exp");
		String Selected_Color_Exp=Utils.getDataFromTestData("AxisTitle", "SelectedColor_Exp");
				
		String defaultRotation=Utils.getDataFromTestData("SmokeTesting_UI", "DefaultRotation_Column_AxisTitle_X");
		String defaultRotationY=Utils.getDataFromTestData("AxisTitle", "default_Rotation_Value");

		//Chart Style
		String ChartFormatColorExp=Utils.getDataFromTestData("ChartFormat_ChartStyle", "ChartFormatColorExp");
		String ChartStylingColor_Exp=Utils.getDataFromTestData("ChartFormat_ChartStyle", "ChartStylingColor_Exp");
		String DefaultThemeValue_Exp=Utils.getDataFromTestData("ChartFormat_ChartStyle", "defaultThemeValue_Exp");
		String Highlight_ColorStyle_Exp=Utils.getDataFromTestData("ChartFormat_ChartStyle", "HighlightColor_Exp");
		String Default_Grid_distance_Column=Utils.getDataFromTestData("SmokeTesting_UI", "Default_Grid_distance_Column");

		//Data Labels
		String DefaultFormatValue_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DefaultFormatValue");
		String DefaultSeperatorValue_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DefaultSeperatorValue");
		String DefaultFontSizeValue_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DefaultFontSizeValue");
		String DefaultRoundOffValue_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DefaultRoundOffValue");
		String DefaultRotationValue_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DefaultRotationValue");
					
		//Deviations
		String Default_Value_FontSize_Deviation=Utils.getDataFromTestData("SmokeTesting_UI", "Default_Value_FontSize_Deviation");
		String Default_Percentage_FontSize_Deviation=Utils.getDataFromTestData("SmokeTesting_UI", "Default_Percentage_FontSize_Deviation");
		String Default_Label_FontSize_Deviation=Utils.getDataFromTestData("SmokeTesting_UI", "Default_Label_FontSize_Deviation");
		String Default_FontFamily_Deviation=Utils.getDataFromTestData("SmokeTesting_UI", "Default_FontFamily_Deviation");
		String Default_Alignment_Deviation=Utils.getDataFromTestData("SmokeTesting_UI", "Default_Alignment_Deviation");

		//Other
		String default_StatslineValueExp=Utils.getDataFromTestData("ChartFormat_Others", "default_StatslineValue");
		String defaultStatsLineColor_Exp=Utils.getDataFromTestData("ChartFormat_Others", "defaultStatsLineColor");
		String default_StatslinePosition_Exp=Utils.getDataFromTestData("ChartFormat_Others", "default_StatslinePosition");
		String default_RoundOffValue_Exp=Utils.getDataFromTestData("ChartFormat_Others", "default_RoundOffValue");
				
		
		//Iteration Inputs
		//Axes
		String Select_Axis_Same_Value=Utils.getDataFromTestDataIteration(iteration,"Line_Widget_Input", "Select_Axis_Same_Value");
		String X_Axis_dataType=Utils.getDataFromTestDataIteration(iteration,"Line_Widget_Input", "X_Axis_dataType");
		String Select_X_Axis_Value=Utils.getDataFromTestDataIteration(iteration,"Line_Widget_Input", "Select_X_Axis_Value");
		String SelectGroupValue_Date=Utils.getDataFromTestDataIteration(iteration,"Line_Widget_Input", "SelectGroupValue_Date");

		String Y_Axis_dataType1=Utils.getDataFromTestDataIteration(iteration,"Line_Widget_Input", "Y_Axis_dataType1");
		String Select_Y_Axis_Value1=Utils.getDataFromTestDataIteration(iteration,"Line_Widget_Input", "Select_Y_Axis_Value1");
		String Y_Axis_dataType2=Utils.getDataFromTestDataIteration(iteration,"Line_Widget_Input", "Y_Axis_dataType2");
		String Select_Y_Axis_Value2=Utils.getDataFromTestDataIteration(iteration,"Line_Widget_Input", "Select_Y_Axis_Value2");
		String Y_Axis_dataType3=Utils.getDataFromTestDataIteration(iteration,"Line_Widget_Input", "Y_Axis_dataType3");
		String Select_Y_Axis_Value3=Utils.getDataFromTestDataIteration(iteration,"Line_Widget_Input", "Select_Y_Axis_Value3");
		String ChartTitle_Name=Utils.getDataFromTestDataIteration(iteration,"Line_Widget_Input", "ChartTitle_Name");

		//Axis Title Input
		String Change_X_Title_Name=Utils.getDataFromTestDataIteration(iteration,"Line_Widget_Input", "Change_X_Title_Name");
		String Change_Y_Title_Name=Utils.getDataFromTestDataIteration(iteration,"Line_Widget_Input", "Change_Y_Title_Name");
		String ChangeFontFamily_AxisTitle=Utils.getDataFromTestDataIteration(iteration,"Line_Widget_Input", "ChangeFontFamily_AxisTitle");
		String ChangeTitleFontSize_AxisTitle=Utils.getDataFromTestDataIteration(iteration,"Line_Widget_Input", "ChangeTitleFontSize_AxisTitle");
		String Change_X_label_FontSize=Utils.getDataFromTestDataIteration(iteration,"Line_Widget_Input", "Change_X_label_FontSize");
		String Change_Y_label_FontSize=Utils.getDataFromTestDataIteration(iteration,"Line_Widget_Input", "Change_Y_label_FontSize");
		String X_Rotation_Input=Utils.getDataFromTestDataIteration(iteration,"Line_Widget_Input", "X_Rotation_Input");
		String Y_Rotation_Input=Utils.getDataFromTestDataIteration(iteration,"Line_Widget_Input", "Y_Rotation_Input");

		//Chart title
		String TypeBackgroundColor1=Utils.getDataFromTestDataIteration(iteration,"Line_Widget_Input", "TypeBackgroundColor1");
		String TypeTextColor1=Utils.getDataFromTestDataIteration(iteration,"Line_Widget_Input", "TypeTextColor1");
		String Change_FontFamily_ChartTitle=Utils.getDataFromTestDataIteration(iteration,"Line_Widget_Input", "Change_FontFamily_ChartTitle");
		String ChangeFontSize_ChartTitle=Utils.getDataFromTestDataIteration(iteration,"Line_Widget_Input", "ChangeFontSize_ChartTitle");
		String ChangeChartTitleName=Utils.getDataFromTestDataIteration(iteration,"Line_Widget_Input", "ChangeChartTitleName");
				
		//Chart Style
		String Change_ChartTheme_ChartStyle=Utils.getDataFromTestDataIteration(iteration,"Line_Widget_Input", "Change_ChartTheme_ChartStyle");
		String Change_Line_Style_ChartStyle=Utils.getDataFromTestDataIteration(iteration,"Line_Widget_Input", "Change_Line_Style_ChartStyle");
		String Change_StrokeWidth_ChartStyle=Utils.getDataFromTestDataIteration(iteration,"Line_Widget_Input", "Change_StrokeWidth_ChartStyle");
		String Change_Grid_Distance=Utils.getDataFromTestDataIteration(iteration,"Line_Widget_Input", "Change_Grid_Distance");

		//Data Label
		String ChangeFontSizeValue_DataLabel=Utils.getDataFromTestDataIteration(iteration,"Line_Widget_Input", "ChangeFontSizeValue_DataLabel");
		String ChangeRoundOffValue_DataLabel=Utils.getDataFromTestDataIteration(iteration,"Line_Widget_Input", "ChangeRoundOffValue_DataLabel");
		String ChangeRotataionVal_Positive_DataLabel=Utils.getDataFromTestDataIteration(iteration,"Line_Widget_Input", "ChangeRotataionVal_Positive_DataLabel");
		String ChangeRotataionVal_Negative_DataLabel=Utils.getDataFromTestDataIteration(iteration,"Line_Widget_Input", "ChangeRotataionVal_Negative_DataLabel");
			
		//Legends
		String Legends_Color_Exp=Utils.getDataFromTestDataIteration(iteration,"Line_Widget_Input", "LegendsColor_Exp");
		String DefaultLegend_Position=Utils.getDataFromTestDataIteration(iteration,"Line_Widget_Input", "DefaultLegend_Position");
		String Change_LegendPositon=Utils.getDataFromTestDataIteration(iteration,"Line_Widget_Input", "Change_LegendPositon");
		String Default_Legend_FontSize=Utils.getDataFromTestDataIteration(iteration,"Line_Widget_Input", "Default_Legend_FontSize");
		String Change_Legend_FontSize=Utils.getDataFromTestDataIteration(iteration,"Line_Widget_Input", "Change_Legend_FontSize");
				
		//Deviation
		String Change_Value_FontSize_Deviation=Utils.getDataFromTestDataIteration(iteration,"Line_Widget_Input", "Change_Value_FontSize_Deviation");
		String Change_Percentage_FontSize_Deviation=Utils.getDataFromTestDataIteration(iteration,"Line_Widget_Input", "Change_Percentage_FontSize_Deviation");
		String Change_Label_FontSize_Deviation=Utils.getDataFromTestDataIteration(iteration,"Line_Widget_Input", "Change_Label_FontSize_Deviation");
		String Change_FontFamily_Deviation=Utils.getDataFromTestDataIteration(iteration,"Line_Widget_Input", "Change_FontFamily_Deviation");
		String Change_Seperator_Deviation=Utils.getDataFromTestDataIteration(iteration,"Line_Widget_Input", "Change_Seperator_Deviation");
		String Change_RoundOff_Deviation=Utils.getDataFromTestDataIteration(iteration,"Line_Widget_Input", "Change_RoundOff_Deviation");

		//Others
		String ChangeStatsLine_Color=Utils.getDataFromTestDataIteration(iteration,"Line_Widget_Input", "ChangeStatsLine_Color");
		String ChangeRoundOff_StatsLine=Utils.getDataFromTestDataIteration(iteration,"Line_Widget_Input", "ChangeRoundOff_StatsLine");
		String Custom_StatsLine_Input=Utils.getDataFromTestDataIteration(iteration,"Line_Widget_Input", "Custom_StatsLine_Input");
		String SelectStatsLine_Column=Utils.getDataFromTestDataIteration(iteration,"Line_Widget_Input", "SelectStatsLine_Column");

		
		setTestCaseID(" ");
		Actions action=new Actions(driver);
		mouseOverToElement(driver, ADDTabPlus);
  	    mouseOverAndClick(driver, ADDTabPlus);
  	    wait(driver,"1");
  	    sendKeys(driver,newlyAddedTab,"LineWidgetTestTab");
  	    click(driver,DashProPage);
  	    elementnotvisible1(driver, RPE_Loading);
		waitForElement(driver,ADD_widget_rightTop);
	    click(driver,ADD_widget_rightTop);
	    elementnotvisible(driver,Loading);
	    elementnotvisible1(driver, RPE_Loading);
		waitForElement(driver,WidgetPanel);
		waitForElement(driver,Sparkline_widget);
		
		setTestCaseID("TC_LINE_AXES_001");
		waitForElement(driver,Line_widget);
		verifyElementDisplayed(driver, Line_widget);
		setTestCaseID("TC_LINE_AXES_002");
		WidgetValidation(driver,Line_widget,"Line");
		setTestCaseID("TC_LINE_AXES_003");
		click(driver,Line_widget);
		elementnotvisible(driver, Loading);
		elementnotvisible1(driver, RPE_Loading);
		String widgetValue=getText1(driver,WidgetValue);
	 	if(widgetValue.equals("Line")) {
			pass(driver,"Line displayed as the selected Widget after click on it");
	 	}else {
	 		fail(driver,"Line not displayed as the selected Widget after click on it");
	 	}
	 	
	 	setTestCaseID("");
	 	verifyElementDisplayed(driver, Axes);
	 	String AxesExpand=getAttribute1(driver,Axes_Expand,"class");
    	if(AxesExpand.contains("up")) {
    		 pass(driver,"By default Column Axes Section is Expanded");
    	}else {
    		 fail(driver,"By default Column Axes Section is not Expanded");
    	}
    	 
		String AxesTextColor_Act=getTextColor(driver,Axes);
		if(AxesColor_Exp.equalsIgnoreCase(AxesTextColor_Act)) {
			pass(driver," 'Axes' highlighted in blue color");
		}else {
			fail(driver," 'Axes' not highlighted in blue color");
		}
	 	
	 	verifyElementDisplayed(driver,X_Axis_Input);
		verifyElementDisplayed(driver,X_Axis_text_);
		setTestCaseID("TC_LINE_AXES_005");
		String defaultSelectValue_X_Act=getText1(driver,X_Axis_Input);
		if(defaultSelectValue_X_Act.equals("Select")) {
			pass(driver,"By Default 'Select' is selected in the X axis value input dropdown ");
		}else {
			fail(driver,"By Default 'Select' is not selected in the X axis value input dropdown ");
		}
		
		verifyElementDisplayed(driver,Y_Axis_Input_Group);
		verifyElementDisplayed(driver,Y_Axis_Text_Group);
		
		setTestCaseID("TC_LINE_AXES_004");
		scrollUsingElement(driver, ApplyButton);
		click(driver,ApplyButton);
		if(isDisplayed(driver,ApplyError1)) {
			pass(driver,"'Kindly select X axis and Y axis ' Error displayed when click Apply button without providing inputs");
			elementnotvisible1(driver, ApplyError1);
		}else {
			fail(driver,"'Kindly select X axis and Y axis ' Error not displayed when click Apply button without providing inputs");
		}
		setTestCaseID("TC_LINE_AXES_006");
		click(driver,X_Axis_Input);
		if(isDisplayed(driver,X_Axis_dropdownResultsExp)) {
			pass(driver,"X-Axis dropdown Expanded after click on it");
			setTestCaseID("TC_LINE_AXES_010");
			List<WebElement> displayedDataImage=getWebElements(driver, dataTypeImages);
			List<WebElement> AvailableColumnList=getWebElements(driver, AvailableList);
			int AvailableColumnListSize=AvailableColumnList.size()-1;
			if(AvailableColumnListSize==displayedDataImage.size()) {
				pass(driver,"All the available columns are displayed with data Type icon in the X_Axis dropdown");
			}else {
				fail(driver,"Some columns are not correctly displayed with data Type icon in the X_Axis dropdown");
			}
			setTestCaseID("TC_LINE_AXES_007");
			for(WebElement dataImag:displayedDataImage) {
				String dataTypeDisplay=dataImag.getAttribute("src");
				if(dataTypeDisplay.contains("Date") || dataTypeDisplay.contains("Categorical") || dataTypeDisplay.contains("Numerical") || dataTypeDisplay.contains("Text")) {
					
				}else {
					fail(driver,"Other than Date,Categorical,Numerical and Text datatype column is displayed in the X_Axis dropdown");
					break;
				}
				
			}
			setTestCaseID("TC_LINE_AXES_008");
			if(isDisplayed2(driver,CategoricalColumnAxisDropdown)) {
				String Categorical1=getText1(driver,CategoricalColumnAxisDropdown);
				if(Categorical1.contains("(")) {
					pass(driver,"Unique values are displayed in the Categorical Column in the X_Axis dropdown");
				}else {
					fail(driver,"Unique values are not displayed in the Categorical Column in the X_Axis dropdown");
				}
			}
			
			if(isDisplayed2(driver,TextColumnAxisDropdown)) {
				String Text1=getText1(driver,TextColumnAxisDropdown);
				if(Text1.contains("(")) {
					pass(driver,"Unique values are displayed in the Text Column in the X_Axis dropdown");
				}else {
					fail(driver,"Unique values are not displayed in the Text Column in the X_Axis dropdown");
				}
			}
			setTestCaseID("TC_LINE_AXES_013");
			ScrollBarValidation1(driver,X_Axis_dropdownResultsExp,"X-Axis");
			setTestCaseID("TC_LINE_AXES_014");
			mouseOverToElement(driver,SecondValue);
			String Highlight_Color_Act=getTextBackgroundColor(driver,SecondValue);
			if(Highlight_color_Exp.equalsIgnoreCase(Highlight_Color_Act)) {
				pass(driver," Mouse hovered Column Value highlighted in blue color in the X_Axis dropdown");
			}else {
				fail(driver," Mouse hovered Column Value not highlighted in blue color in the X_Axis dropdown, Exp : "+Highlight_color_Exp+" Act : "+Highlight_Color_Act);
			}
			
			setTestCaseID("TC_LINE_AXES_009");
			if(verifyElementDisplayed(driver, dropdownInputsearchBox)) {
				click(driver,dropdownInputsearchBox);
				setTestCaseID("");
				sendKeys(driver,dropdownInputsearchBox,"afghjku");
				if(isDisplayed2(driver,NoResultsFound)) {
					pass(driver,"'No Results found' message is displayed in while searching invalid value in the X_Axis dropdown input");
				}else {
					fail(driver,"'No Results found' message is not displayed in while searching invalid value in the X_Axis dropdown input");
				}
				
				clear1(driver,dropdownInputsearchBox);
				wait(driver,"1");
				if(isDisplayed2(driver,NoResultsFound)){
					fail(driver,"Column List are not displayed after clear the search input in the X_Axis dropdown");
				}else {
					pass(driver,"Column List are displayed after clear the search input in the X_Axis dropdown");
				}
				setTestCaseID("TC_LINE_AXES_012");
				sendKeys(driver,dropdownInputsearchBox,Select_Axis_Same_Value);
				wait(driver,"1");
				String firstValue_X=getText1(driver,FirstSearchedvalue);
				if(firstValue_X.contains(Select_Axis_Same_Value)) {
					pass(driver,"Searched Value correctly displayed in the X_Axis dropdown");
					action.sendKeys(Keys.ENTER).build().perform();
					wait(driver,"1");
					
					if(isDisplayed2(driver,X_Axis_dropdownResultsExp)) {
						fail(driver,"X_Axis Value dropdown not closed after perform 'Enter' action");
					}else {
						pass(driver,"X_Axis Value dropdown closed automatically after perform 'Enter' action");
						setTestCaseID("TC_LINE_AXES_011");
						String seletcedValue=getText1(driver,X_Axis_Input);
						if(seletcedValue.contains(Select_Axis_Same_Value)) {
							pass(driver,"Selected value displayed in the X_Axis Input after click Enter");
						}else {
							fail(driver,"Selected value not displayed in the X_Axis Input after click Enter");
						}
					}
					
				}else {
					fail(driver,"Searched Value not correctly displayed in the X_Axis dropdown");
				}
				
			}
			
			
		}else {
			fail(driver,"X-Axis dropdown not Expanded after click on it");
		}
		setTestCaseID("");
		click(driver,X_Axis_text_);
		click(driver,X_Axis_Input);
		waitForElement(driver,X_Axis_dropdownResultsExp);
		String selectedColorAct=getTextBackgroundColor(driver,ListSelected);
		System.out.println("Highlight_color_Exp : "+Highlight_color_Exp+"selectedColorAct : "+selectedColorAct);
		String highlightText=getText1(driver,ListSelectedText);
		if((highlightText.contains(Select_Axis_Same_Value))&&Highlight_color_Exp.equalsIgnoreCase(selectedColorAct)) {
			pass(driver,"Selected Value ("+Select_Axis_Same_Value+") highlighted in blue color");
		}else {
			fail(driver,"Selected Value ("+Select_Axis_Same_Value+") not highlighted in blue color");
		}
		setTestCaseID("");
		selectDropdownValue1(driver,Select_Axis_Same_Value);
		wait(driver,"1");
		if(isDisplayed2(driver,X_Axis_dropdownResultsExp)) {
			fail(driver,"X_Axis Value dropdown not closed after selecting the value");
		}else {
			pass(driver,"X_Axis Value dropdown closed automatically after selecting the value");
		}
		
		setTestCaseID("TC_LINE_AXES_028");
		scrollUsingElement(driver, ApplyButton);
		click(driver,ApplyButton);
		if(isDisplayed(driver,ApplyError1)) {
			pass(driver,"'Kindly select X axis and Y axis ' Error displayed when click Apply button only providing X_Axis Value");
			elementnotvisible1(driver, ApplyError1);
		}else {
			fail(driver,"'Kindly select X axis and Y axis ' Error not displayed when click Apply button only providing X_Axis Value");
		}

		setTestCaseID("TC_LINE_AXES_016");
		click(driver,Y_Axis_Input_Group);
		if(isDisplayed(driver,Y_Axis_DropdownExpand)) {
			pass(driver,"Y-Axis dropdown Expanded after click on it");
			if(isDisplayed(driver,Cate_agg_fieldSortValue)) {
				setTestCaseID("");
	    		mouseOverAndClick(driver, Cate_agg_fieldSortValue);
	    		
		    	//mouseOverAndClick(driver,Cat_agg_fieldSort);
		    	if(isDisplayed2(driver,sumDisabledFieldsortCate)) {
		 			pass(driver,"Sum disabled for Categorical value in Y Axis dropdown");
		         }else {
		 			fail(driver,"Sum not disabled for Categorical value in Y Axis dropdown");
		         }
		         
		         if(isDisplayed2(driver,AvgDisabledFieldsortCate)) {
		 			pass(driver,"Average disabled for Categorical value in Y Axis dropdown");
		         }else {
			 		fail(driver,"Average not disabled for Categorical value Y Axis dropdown");
		         }
		         
		         if(isDisplayed2(driver,minDisabledFieldsortCate)) {
		 			pass(driver,"Minimum disabled for Categorical value in Y Axis dropdown");
		         }else {
		 			fail(driver,"Minimum not disabled for Categorical value Y Axis dropdown");
		         }
		         
		         if(isDisplayed2(driver,maxDisabledFieldsortCate)) {
		 			pass(driver,"Maximum disabled for Categorical value in Y Axis dropdown");
		         }else {
		 			fail(driver,"Maximum not disabled for Categorical value in Y Axis dropdown");
		         }
		         
		         if(!isDisplayed2(driver,uniqueDisabledFieldsortCate)) {
		 			pass(driver,"Unique enabled for Categorical value in Y Axis dropdown");
		         }else {
		 			fail(driver,"Unique not enabled for Categorical value in Y Axis dropdown");
		         }
		         
		         if(!isDisplayed2(driver,countDisabledFieldsortCate)) {
			 		pass(driver,"Count enabled for Categorical value in Y Axis dropdown");
		         }else {
				 	fail(driver,"Count not enabled for Categorical value in Y Axis dropdown");
		         } 
		         mouseOverAndClick(driver, Cate_agg_fieldSortValue);
		         //action.sendKeys(Keys.ESCAPE).build().perform();
	    	}else {
	    		fail(driver,"Categorical Sort by agg Value not present in the dropdown");
	    	}
	    	
	    	 wait(driver,"1");
	    	 if(isDisplayed(driver,Num_agg_fieldSortValue)) {
	    		 setTestCaseID("");
	    		 
		 	     //click3(driver,Num_agg_fieldSort);
		 	    	
		 	     if(!isDisplayed2(driver,sumDisabledFieldsortNum)) {
		 			pass(driver,"Sum enabled for Numerical value in Y Axis dropdown");
		         }else {
			 		fail(driver,"Sum not enabled for Numerical value in Y Axis dropdown");
		         }
		         
		         if(!isDisplayed2(driver,AvgDisabledFieldsortNum)) {
		 			pass(driver,"Average enabled for Numerical value in Y Axis dropdown");
		         }else {
		 			fail(driver,"Average not enabled for Numerical value in Y Axis dropdown");
		         }
		         
		         if(!isDisplayed2(driver,minDisabledFieldsortNum)) {
		 			pass(driver,"Minimum enabled for Numerical value in Y Axis dropdown");
		         }else {
			 		fail(driver,"Minimum not enabled for Numerical value in Y Axis dropdown");
		         }
		         
		         if(!isDisplayed2(driver,maxDisabledFieldsortNum)) {
		 			pass(driver,"Maximum enabled for Numerical value in Y Axis dropdown");
		         }else {
		 			fail(driver,"Maximum not enabled for Numerical value in Y Axis dropdown");
		         }
		         
		         if(!isDisplayed2(driver,uniqueDisabledFieldsortNum)) {
		 			pass(driver,"Unique enabled for Numerical value in Y Axis dropdown");
		         }else {
		 			fail(driver,"Unique not enabled for Numerical value in Y Axis dropdown");
		         }
		         
		         if(!isDisplayed2(driver,countDisabledFieldsortNum)) {
		 			pass(driver,"Count enabled for Numerical value in Y Axis dropdown");
		         }else {
		 			fail(driver,"Count not enabled for Numerical value in Y Axis dropdown");
		         }	
		         mouseOverAndClick(driver, Num_agg_fieldSortValue);
		 		 //action.sendKeys(Keys.ESCAPE).build().perform();
	    	 }else {
		    	  fail(driver,"Numerical Sort by agg Value not present in the dropdown");
		     }
	    	 setTestCaseID("TC_LINE_AXES_020");
			List<WebElement> displayedDataImage=getWebElements(driver, dataTypeImages);
			List<WebElement> AvailableColumnList=getWebElements(driver, AvailableList);
			List<WebElement> AvailableAggSelect=getWebElements(driver, AggSelect_X_Axis_dropdown);
			int AvailableColumnListSize=AvailableColumnList.size();
			if(AvailableColumnListSize==displayedDataImage.size()) {
				pass(driver,"All the available columns are displayed with data Type icon in the Y_Axis dropdown");
			}else {
				fail(driver,"Some columns are not correctly displayed with data Type icon in the Y_Axis dropdown");
			}
			setTestCaseID("TC_LINE_AXES_032");
			if(AvailableColumnListSize==AvailableAggSelect.size()) {
				pass(driver,"All the available columns are displayed with Agg Select Option in the Y_Axis dropdown");
			}else {
				fail(driver,"Some columns are not correctly displayed with Agg Select Option in the Y_Axis dropdown");
			}
			setTestCaseID("TC_LINE_AXES_017");
			for(WebElement dataImag:displayedDataImage) {
				String dataTypeDisplay=dataImag.getAttribute("src");
				if(dataTypeDisplay.contains("Date") || dataTypeDisplay.contains("Categorical") || dataTypeDisplay.contains("Numerical") || dataTypeDisplay.contains("Text")) {
					
				}else {
					fail(driver,"Other than Date,Categorical,Numerical and Text datatype column is displayed in the Y_Axis dropdown");
					break;
				}
				
			}
			setTestCaseID("TC_LINE_AXES_018");
			if(isDisplayed2(driver,CategoricalColumnAxisDropdown)) {
				String Categorical1=getText1(driver,CategoricalColumnAxisDropdown);
				if(Categorical1.contains("(")) {
					pass(driver,"Unique values are displayed in the Categorical Column in the Y_Axis dropdown");
				}else {
					fail(driver,"Unique values are not displayed in the Categorical Column in the Y_Axis dropdown");
				}
			}else {
				fail(driver,"Categorical Column Not present in the list");
			}
			
			if(isDisplayed2(driver,TextColumnAxisDropdown)) {
				String Text1=getText1(driver,TextColumnAxisDropdown);
				if(Text1.contains("(")) {
					pass(driver,"Unique values are displayed in the Text Column in the Y_Axis dropdown");
				}else {
					fail(driver,"Unique values are not displayed in the Text Column in the Y_Axis dropdown");
				}
			}else {
				pass(driver,"Text Column Not present in the list");
			}
			setTestCaseID("TC_LINE_AXES_031");
			if(isDisplayed(driver, Categorical_Agg_X_Axis_dropdown)) {
				String default_Agg_Categorical=defaultSelectedValue(driver, Categorical_Agg_X_Axis_dropdown);
				if(default_Agg_Categorical.equals("Count")) {
					pass(driver,"'Count' is selected as default Agg for 'Categorical' in Y Axis dropdown");
				}else {
					fail(driver,"'Count' is not selected as default Agg for 'Categorical' in Y Axis dropdown");
				}
			}else {
				fail(driver,"Categorical Aggregation Option Not present in the list");
			}
			
			if(isDisplayed(driver, Date_Agg_X_Axis_dropdown)) {
				String default_Agg_Date=defaultSelectedValue(driver, Date_Agg_X_Axis_dropdown);
				if(default_Agg_Date.equals("Count")) {
					pass(driver,"'Count' is selected as default Agg for 'Date' in Y Axis dropdown");
				}else {
					fail(driver,"'Count' is not selected as default Agg for 'Date' in Y Axis dropdown");
				}
			}else {
				fail(driver,"Date Aggregation Option Not present in the list");
			}
			
			if(isDisplayed(driver, Text_Agg_X_Axis_dropdown)) {
				String default_Agg_Text=defaultSelectedValue(driver, Text_Agg_X_Axis_dropdown);
				if(default_Agg_Text.equals("Count")) {
					pass(driver,"'Count' is selected as default Agg for 'Text' in Y Axis dropdown");
				}else {
					fail(driver,"'Count' is not selected as default Agg for 'Text' in Y Axis dropdown");
				}
			}else {
				pass(driver,"Text Aggregation Option Not present in the list");
			}
			setTestCaseID("TC_LINE_AXES_030");
			if(isDisplayed(driver, Numerical_Agg_X_Axis_dropdown)) {
				String default_Agg_Num=defaultSelectedValue(driver, Numerical_Agg_X_Axis_dropdown);
				if(default_Agg_Num.equals("Sum")) {
					pass(driver,"'Sum' is selected as default Agg for 'Numerical' in Y Axis dropdown");
				}else {
					fail(driver,"'Sum' is not selected as default Agg for 'Numerical' in Y Axis dropdown");
				}
			}else {
				fail(driver,"Numerical Aggregation Option Not present in the list");
			}
			
			setTestCaseID("TC_LINE_AXES_019");
			if(verifyElementDisplayed(driver, dropdownInputsearchBox)) {
				setTestCaseID("TC_LINE_AXES_023");
				sendKeys(driver,dropdownInputsearchBox,"afghjku");
				if(isDisplayed2(driver,NoResultsFound)) {
					pass(driver,"'No Results found' message is displayed in while searching invalid value in the Y_Axis dropdown input");
				}else {
					fail(driver,"'No Results found' message is not displayed in while searching invalid value in the Y_Axis dropdown input");
				}
				
				//WebElement searchInput=getWebElement(driver, dropdownInputsearchBox);
				action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
				action.sendKeys(Keys.BACK_SPACE).build().perform();
				//clear1(driver,dropdownInputsearchBox);
				wait(driver,"1");
				if(isDisplayed2(driver,NoResultsFound)){
					fail(driver,"Column List are not displayed after clear the search input in the Y_Axis dropdown");
				}else {
					pass(driver,"Column List are displayed after clear the search input in the Y_Axis dropdown");
				}
				setTestCaseID("TC_LINE_AXES_022");
				sendKeys(driver,dropdownInputsearchBox,Select_Axis_Same_Value);
				waitForElement(driver, FirstSearchedvalue);
				String firstValue_Y=getText1(driver,FirstSearchedvalue);
				if(firstValue_Y.contains(Select_Axis_Same_Value)) {
					pass(driver,"Searched Value correctly displayed in the Y_Axis dropdown");
					String firstSeachedValue_Agg=defaultSelectedValue(driver, Agg_FirstSearchedValue);
					action.sendKeys(Keys.ENTER).build().perform();
					wait(driver,"1");
					setTestCaseID("TC_LINE_AXES_021");
					if(isDisplayed(driver,Selected_Y_Axis_Value)) {
						pass(driver," Value is updated in the Y Axis input after click Enter");
						String updatedText=getAttribute1(driver,Selected_Y_Axis_Value,"title");
						if(updatedText.contains(Select_Axis_Same_Value) && updatedText.contains(firstSeachedValue_Agg)) {
							pass(driver,"Searched Value updated with Aggregation in the Y Axis Input");
						}else {
							fail(driver,"Searched Value not updated with Aggregation in the Y Axis Input, Act : "+updatedText);
						}
						setTestCaseID("");
						click(driver,Y_Axis_Text_Group);
						wait(driver,"1");
						if(!isDisplayed2(driver,Y_Axis_DropdownExpand)) {
							pass(driver,"X Axis dropdown closed when click outside the dropdown");
						}else {
							fail(driver,"X Axis dropdown not closed when click outside the dropdown");
						}
						
						setTestCaseID("");
						click(driver,Y_Axis_Input_Group);
						waitForElement(driver,Y_Axis_DropdownExpand);
						
						selectedColorAct=getTextBackgroundColor(driver,ListSelected);
						System.out.println("Highlight_color_Exp : "+Highlight_color_Exp+"selectedColorAct : "+selectedColorAct);
						highlightText=getText1(driver,ListSelectedText);
						if((highlightText.contains(Select_Axis_Same_Value))&&Highlight_color_Exp.equalsIgnoreCase(selectedColorAct)) {
							pass(driver,"Selected Value ("+Select_Axis_Same_Value+") highlighted in blue color");
						}else {
							fail(driver,"Selected Value ("+Select_Axis_Same_Value+") not highlighted in blue color");
						}
						
						setTestCaseID("");
						click(driver,Y_Axis_Text_Group);
						wait(driver,"1");
						if(!isDisplayed2(driver,X_Axis_DropdownExpand)) {
							//pass(driver,"Y Axis dropdown closed when click outside the dropdown");
						}else {
							fail(driver,"Y Axis dropdown not closed when click outside the dropdown");
						}
						
						setTestCaseID("TC_LINE_AXES_026");
						scrollUsingElement(driver, ApplyButton);
						click(driver,ApplyButton);
						if(isDisplayed(driver,ApplyError2)) {
							pass(driver,"'Kindly check fields and select different values' Error displayed when click Apply button with same X_Axis and Y_Axis Value");
							elementnotvisible1(driver, ApplyError2);
						}else {
							fail(driver,"'Kindly check fields and select different values' Error not displayed when click Apply button with same X_Axis and Y_Axis Value");
						}
						setTestCaseID("");
						click(driver,X_Axis_Input);
						waitForElement(driver,SelectOption);
						click(driver,SelectOption);
						wait(driver,"1");
						
						setTestCaseID("TC_LINE_AXES_027");
						scrollUsingElement(driver, ApplyButton);
						click(driver,ApplyButton);
						if(isDisplayed(driver,ApplyError1)) {
							pass(driver,"'Kindly select X axis and Y axis ' Error displayed when click Apply button only providing Y_Axis Value");
							elementnotvisible1(driver, ApplyError1);
						}else {
							fail(driver,"'Kindly select X axis and Y axis ' Error not displayed when click Apply button only providing Y_Axis Value");
						}
						
						mouseOverAndClick(driver, removeOptionSearched_Value);
						wait(driver,"1");
						if(!isDisplayed2(driver,Selected_X_Axis_Value)) {
							pass(driver,"Searched Value in the Y Axis input is removed after click the remove icon");
						}else {
							fail(driver,"Searched Value in the Y Axis input is not removed after click the remove icon");
						}
						
					}else {
						fail(driver,"Searched Value is not updated in the Y Axis input after click Enter");
					}

				}else {
					fail(driver,"Searched Value not correctly displayed in the Y_Axis dropdown");
				}
				
			}
			
			click(driver,X_Axis_Input);
			waitForElement(driver,SelectOption);
			click(driver,SelectOption);
			wait(driver,"1");
			
			setTestCaseID("TC_LINE_AXES_024");
			click(driver,Y_Axis_Input_Group);
			waitForElement(driver,Y_Axis_DropdownExpand);
			ScrollBarValidation1(driver,Y_Axis_DropdownExpand,"Y-Axis");
			
			
			setTestCaseID("TC_LINE_AXES_029");
			List<WebElement> AvailableColumnList_X_Axis=getWebElements(driver, AvailableList);
			int columnListCount=AvailableColumnList_X_Axis.size();
			if(columnListCount>10) {
				for (int k=0;k<=10;k++) {
					WebElement availableColumn=AvailableColumnList_X_Axis.get(k);
					action.moveToElement(availableColumn).click().build().perform();
					wait(driver,"1");
				}
				
				if(isDisplayed(driver,X_Axis_Limit_Error)) {
					pass(driver,"'Kindly select less than or equal to 10 column for Y axis' error displayed when Selecting more than 10 value in the Y Axis dropdown");
				}else {
					fail(driver,"'Kindly select less than or equal to 10 column for Y axis' error not displayed when Selecting more than 10 value in the Y Axis dropdown");
				}
			}
			setTestCaseID("");
			click(driver,X_Axis_text_);
			wait(driver,"1");
			if(!isDisplayed2(driver,Y_Axis_DropdownExpand)) {
				//pass(driver,"Y Axis dropdown closed when click outside the dropdown");
			}else {
				fail(driver,"Y Axis dropdown not closed when click outside the dropdown");
			}
			
			elementnotvisible1(driver, X_Axis_Limit_Error);
			
			while(isDisplayed(driver,removeOptionSearched_Value)) {
				WebElement RemoveSelectList=getWebElement(driver,removeOptionSearched_Value);
				action.moveToElement(RemoveSelectList).click().build().perform();
				wait(driver,"1");
			}

			if(!isDisplayed2(driver,Selected_Y_Axis_Value)) {
				pass(driver,"All the column Values are removed from the Y Axis input after removing all the value");
			}else {
				fail(driver,"Some Column Value not removed from the Y Axis input after removing all the value");
			}
			
		}else {
			fail(driver,"Y-Axis dropdown not Expanded after click on it");
		}
		
		click(driver,X_Axis_Input);
		waitForElement(driver,X_Axis_dropdownResultsExp);
		selectDropdownValue(driver,X_Axis_dataType,Select_X_Axis_Value);
		String selectedY_text=getText(driver,Y_Axis_dropdown);
		//new lines
		if(X_Axis_dataType.equals("Date")) {
			setTestCaseID("TC_LINE_AXES_039");
			verifyElementDisplayed(driver,GroupText);
			if(isDisplayed(driver,groupDropdown)) {
				pass(driver,"Group selection input option is displayed While select Date datatype in X_axis");
				click(driver,groupDropdown);
				if(verifyElementDisplayed(driver, GroupDropdownExpand)){
					selectGroupDateValue(driver,SelectGroupValue_Date);
					wait(driver,"1");
					if(isDisplayed2(driver,GroupDropdownExpand)) {
						 fail(driver,"Group dropdown not closed after Selecting value ");
					}else {
						pass(driver,"Group dropdown Closed after Selecting value ");
					}
				}
				
			}else {
				fail(driver,"Group selection input option is not displayed While select Date datatype in X_axis");
			}
		}
		
		click(driver,Y_Axis_Input_Group);
		if(isDisplayed(driver,Y_Axis_DropdownExpand)) {
			if(isDisplayed(driver,NumericalColumnOption)) {
				
				mouseOverAndClick(driver, NumericalColumnOption);
				click(driver,Y_Axis_Text_Group);
				wait(driver,"1");
				if(!isDisplayed2(driver,Y_Axis_DropdownExpand)) {
					//pass(driver,"X Axis dropdown closed when click outside the dropdown");
				}else {
					fail(driver,"X Axis dropdown not closed when click outside the dropdown");
				}
				setTestCaseID("TC_LINE_AXES_033");
				if(isDisplayed(driver,GroupInput_Numeric)) {
					pass(driver,"Group Selection Input is displayed for Selection one numerical in Y axis");
					setTestCaseID("TC_LINE_AXES_034");
					click(driver,GroupInput_Numeric);
					if(isDisplayed(driver, GroupDropdown_Numeric_Expand)) {
						pass(driver,"Group dropdown is expanded after click on it");
						setTestCaseID("TC_LINE_AXES_035");
						ScrollBarValidation1(driver,GroupDropdown_Numeric_Expand,"Numeric group");
						setTestCaseID("TC_LINE_AXES_037");
						List<WebElement> displayedDataImage=getWebElements(driver, dataTypeImages);
						for(WebElement dataImag:displayedDataImage) {
							String dataTypeDisplay=dataImag.getAttribute("src");
							if(!dataTypeDisplay.contains("Categorical")) {
								fail(driver,"Other than Categorical datatype column is displayed in the Group dropdown");
								break;
							}
						}
						
					
						List<WebElement> AvailableColumnList=getWebElements(driver, AvailableList);
						for(WebElement AvailableColumn:AvailableColumnList) {
							String columnText=AvailableColumn.getText();
							int columnNum=getNumber(columnText);
							setTestCaseID("TC_LINE_AXES_036");
							if(columnNum>15) {
								if(!selectedY_text.contains(columnText)) {
									action.moveToElement(AvailableColumn).click().build().perform();
									wait(driver,"1");
									if(isDisplayed2(driver,GroupDropdown_Numeric_Expand)) {
										fail(driver,"Group dropdown not closed after selecting the value");
									}else {
										pass(driver,"Group dropdown closed after selecting the value");
									}
									
									click(driver,ApplyButton);
									elementnotvisible1(driver, RPE_Loading);
									if(isDisplayed(driver,GroupError)) {
										pass(driver,"Error displayed when select the group value with more than 15 unique value");
									}else {
										fail(driver,"Error not displayed when select the group value with more than 15 unique value");
									}
									
									click(driver,GroupInput_Numeric);
									waitForElement(driver, GroupDropdown_Numeric_Expand);
									break;
								}
							}
						}
						setTestCaseID("TC_LINE_AXES_038");
						AvailableColumnList=getWebElements(driver, AvailableList);
						for(WebElement AvailableColumn:AvailableColumnList) {
							String columnText=AvailableColumn.getText();
							int columnNum=getNumber(columnText);
							if(columnNum<15) {
								if(!selectedY_text.contains(columnText)&&!columnText.equalsIgnoreCase("Select")) {
									action.moveToElement(AvailableColumn).click().build().perform();
									wait(driver,"1");
									if(isDisplayed2(driver,GroupDropdown_Numeric_Expand)) {
										fail(driver,"Group dropdown not closed after selecting the value");
									}else {
										pass(driver,"Group dropdown closed after selecting the value");
									}
									click(driver,ApplyButton);
									elementnotvisible1(driver, RPE_Loading);
									if(isDisplayed(driver,ChartGraph)) {
										pass(driver,"Graph displayed for group value with less than 15 unique value");
									}else {
										fail(driver,"Graph not displayed for group value with less than 15 unique value");
									}
									click(driver,GroupInput_Numeric);
									waitForElement(driver, GroupDropdown_Numeric_Expand);
									break;
								}
							}
							
						}
						mouseOverAndClick(driver, SecondValue);
						if(isDisplayed2(driver,GroupDropdown_Numeric_Expand)) {
							fail(driver,"Group dropdown not closed after selecting the value");
						}else {
							pass(driver,"Group dropdown closed after selecting the value");
						}
						setTestCaseID("");
						click(driver,GroupInput_Numeric);
						waitForElement(driver, GroupDropdown_Numeric_Expand);
						String selectedGrouoColorAct=getTextBackgroundColor(driver,SecondValue);
						if(Highlight_color_Exp.equalsIgnoreCase(selectedGrouoColorAct)) {
							pass(driver,"Selected Value highlighted in blue color");
						}else {
							fail(driver,"Selected Value not highlighted in blue color");
						}
						setTestCaseID("");
						mouseOverAndClick(driver, SecondValue);
						if(isDisplayed2(driver,GroupDropdown_Numeric_Expand)) {
							fail(driver,"Group dropdown not closed after selecting the value");
						}else {
							//pass(driver,"Group dropdown closed after selecting the value");
						}
					}else {
						fail(driver,"Group dropdown is not expanded after click on it");
					}
				}else {
					fail(driver,"Group Selection Input is not displayed for Selection one numerical in x axis");
				}
				setTestCaseID("");

				mouseOverAndClick(driver, removeOptionSearched_Value);
				wait(driver,"1");
				if(!isDisplayed2(driver,Selected_Y_Axis_Value)) {
					pass(driver,"Searched Value in the Y Axis input is removed after click the remove icon");
				}else {
					fail(driver,"Searched Value in the Y Axis input is not removed after click the remove icon");
				}
			
				
			}else {
				fail(driver,"Numeric column not present in the Y Axis dropdown");
			}
			
		}else {
			fail(driver,"Y-Axis dropdown not Expanded after click on it");
		}
		setTestCaseID("");
		int numCount=0;
		if(Y_Axis_dataType1.equals("Numerical")) {
			numCount++;
		}
		
		if(Y_Axis_dataType2.equals("Numerical")) {
			numCount++;
		}
		
		if(Y_Axis_dataType3.equals("Numerical")) {
			numCount++;
		}
		
		click(driver,Y_Axis_Input_Group);
		waitForElement(driver, Y_Axis_DropdownExpand);
		selectDropdownValue(driver,Y_Axis_dataType1,Select_Y_Axis_Value1);
		selectDropdownValue(driver,Y_Axis_dataType2,Select_Y_Axis_Value2);
		selectDropdownValue(driver,Y_Axis_dataType3,Select_Y_Axis_Value3);
		
		click(driver,Y_Axis_Text_Group);
		wait(driver,"1");
		if(!isDisplayed2(driver,Y_Axis_DropdownExpand)) {
			pass(driver,"Y Axis dropdown closed when click outside the dropdown");
		}else {
			fail(driver,"Y Axis dropdown not closed when click outside the dropdown");
		}
		setTestCaseID("");
		if(numCount>1) {
			if(!isDisplayed2(driver,GroupInput_Numeric)) {
				pass(driver,"Group Selection Input is not displayed for Selecting more than one numerical in Y axis");
			}else {
				fail(driver,"Group Selection Input is displayed for Selecting more than one numerical in Y axis");
			}
		}
		
		setTestCaseID("");
		if(!Y_Axis_dataType1.equals("Numerical") || !Y_Axis_dataType2.equals("Numerical") || !Y_Axis_dataType3.equals("Numerical")) {
			if(!isDisplayed2(driver,GroupInput_Numeric)) {
				pass(driver,"Group Selection Input is not displayed for Selecting Categorical/Text/Date in Y axis");
			}else {
				fail(driver,"Group Selection Input is displayed for Selecting Categorical/Text/Date in Y axis");
			}
		}
		setTestCaseID("");
		scrollUsingElement(driver, ApplyButton);
		click(driver,ApplyButton);
		elementnotvisible1(driver, RPE_Loading);
		if(isDisplayed(driver,ChartGraph)) {
			pass(driver,"Graph displayed after selecting the X axis and Y Axis Value");
		}else {
			fail(driver,"Graph not displayed after selecting the X axis and Y Axis Value");
		}
		
		
		 // *********** AxisTitle Validation Start *************
        
        String Line_Axis_Title= getCellValue("TestExecution","Testcase_Selection","Line_Axis_Title",Flag);
        
        if(Line_Axis_Title.equals("Yes")) {
 	 		setTestCaseID("TC_LINE_AXIS_001");
 	      	 verifyElementDisplayed(driver, AxisTitle);
 	  		 click(driver,AxisTitle);
 	  		 wait(driver,"1");
 	  		 String AxisExpand=getAttribute1(driver,AxisTitleExpand,"class");
 	      	 if(AxisExpand.contains("up")) {
 	  			pass(driver,"Axis Title section is Expanded after click on it");
 	      	 }else {
 	  			fail(driver,"Axis Title section is not Expanded after click on it");
 	      	 }
 	      	setTestCaseID("");
 	      	String AxisTextColor_Act=getTextColor(driver,AxisTitleExpand);
 	      	if(AxisTextColorExp.equalsIgnoreCase(AxisTextColor_Act)) {
 	      		pass(driver,"Axis Title displayed in blue color after select on it");
 	      	}else {
 	      		fail(driver,"Axis Title displayed in blue color after select on it");
 	      	}
 	      	
 	      	setTestCaseID("TC_LINE_AXIS_002");

 	      	verifyElementDisplayed(driver, X_Title_text);
 	      	verifyElementDisplayed(driver,X_Title_input);
 	
 	      	verifyElementDisplayed(driver, Y_Title_text);
 	      	verifyElementDisplayed(driver,Y_Title_input);
 	  	
 	      	clearAndType(driver,X_Title_input,Change_X_Title_Name);
 	       	clearAndType(driver,Y_Title_input,Change_Y_Title_Name);
 	       	wait(driver,"1");
 	       	scrollUsingElement(driver, ApplyButton);
 	  		click(driver,ApplyButton);
 	  		elementnotvisible1(driver, RPE_Loading);
 	  		verifyElementDisplayed(driver,Chart_Section);
 	  		List<WebElement>  moveElements1=driver.findElements(By.xpath("//div[@id='RPE_Preview']//*[name()='tspan']"));
 	  		for(WebElement ele:moveElements1) {
 	  			Actions act3=new Actions(driver);
 	  			try {
 	  				act3.moveToElement(ele).build().perform();
 	  			}catch(Exception e) {
 	  				
 	  			}
 	  		}
 	  		
 	  		String Y_ChartText=getText1(driver,Y_Value);
 	  		String X_ChartText=getText1(driver,X_Chart_Value);
 	  		if(X_ChartText.equals(Change_X_Title_Name)) {
 	          	pass(driver,"Given X Title ("+Change_X_Title_Name+") input value updated in the X Axis chart");
 	       	}else {
 	          	fail(driver,"Given X Title ("+Change_X_Title_Name+") input value not updated in the X Axis chart");
 	       	}
 	       	
 	  		if(Y_ChartText.equals(Change_Y_Title_Name)) {
 	          	pass(driver,"Given Y Title ("+Change_Y_Title_Name+") input value updated in the Y Axis chart");
 	       	}else {
 	          	fail(driver,"Y Title ("+Change_Y_Title_Name+") input value not updated in the Y Axis chart");
 	       	}
 	         
 	  		setTestCaseID("TC_LINE_AXIS_003");
 	      	verifyElementDisplayed(driver,fontFamilyText);
 	      	if(verifyElementDisplayed(driver,fontFamily_dropdown)) {
 	       		
 	       		String fontFamily_Value=getText1(driver,fontFamily_dropdown);
 	       		System.out.println("FontFamily_Value : "+fontFamily_Value);
 	       		if(fontFamily_Value.equals(default_FontFamily)) {
 	      			pass(driver,"By default, "+default_FontFamily+" displayed in the Font Family input");
 	       		}else {
 	           	    fail(driver,"By default, "+default_FontFamily+" is not displayed in the Font Family input");
 	       		}
 	       	}
 	     
 	      	setTestCaseID("TC_LINE_AXIS_004");
 	     	String fontFamily_Value=getText1(driver,fontFamily_dropdown);
 	     	click(driver,fontFamily_dropdown);
 	     	
 	     	if(isDisplayed(driver,fontFamily_DropdownExpand)) {
 	        	pass(driver,"Font family dropdown is expanded after click on it");
 	        	mouseOverToElement(driver,SecondValue);
 	        	wait(driver,"1");
 	    		String mouseHighlightColor=getTextBackgroundColor(driver,SecondValue);
 	    		if(Highlight_Color_Exp.equalsIgnoreCase(mouseHighlightColor)) {
 	    			pass(driver,"Mouse hovered value highlighted in blue color");
 	    		}else {
 	    			fail(driver,"Mouse hovered value not highlighted in blue color");
 	    		}
 	    		setTestCaseID("TC_LINE_AXIS_006");
 	    		ScrollBarValidation1(driver,fontFamily_DropdownExpand,"Font Family");
 	    		setTestCaseID("");
 	    		String selectedColorAct2=getTextBackgroundColor(driver,ListSelected);
 	    		String highlightText2=getText1(driver,listSelectedText1);
 	    		if((fontFamily_Value.equals(highlightText2))&&Selected_Color_Exp.equals(selectedColorAct2)) {
 	    			 pass(driver,"Selected Value Highlighted in Grey Color");
 	    		}else {
 	         	    fail(driver,"Selected Value not Value Highlighted in Grey Color");
 	    		}
 	    		//setTestCaseID("");
 	    		setTestCaseID("TC_LINE_AXIS_005");
 	         	click(driver,dropdownInputsearchBox);
 	         	sendKeys(driver,dropdownInputsearchBox,"dfsaght");
 	         	if(isDisplayed2(driver,NoResultsFound)) {
 	         		pass(driver,"'No Results found' is displayed when search invalid font family value");
 	         	}else {
 	         		fail(driver,"'No Results found' is not displayed when search invalid font family value");
 	         	}
 	         	
 	         	clear1(driver,dropdownInputsearchBox);
 	         	wait(driver,"1");
 	         	sendKeys(driver,dropdownInputsearchBox,ChangeFontFamily_AxisTitle);
 	            String resultText=getText1(driver,fontFamilyFirstResult);
 	            if(resultText.equals(ChangeFontFamily_AxisTitle)) {
 	   			 pass(driver,"Search input in the Font Family dropdown works properly");
 	            }else {
 	         	    fail(driver,"Search input in the Font Family dropdown not works properly");
 	            }
 	           	selectFontFamily(driver,ChangeFontFamily_AxisTitle);
 	           	wait(driver,"1");
 	           	scrollUsingElement(driver, ApplyButton);
 	    		click(driver,ApplyButton);
 	    		elementnotvisible1(driver, RPE_Loading);
 	    		verifyElementDisplayed(driver,Chart_Section);
 	    	    moveElements1=driver.findElements(By.xpath("//div[@id='RPE_Preview']//*[name()='tspan']"));
 	    			for(WebElement ele:moveElements1) {
 	    				Actions act3=new Actions(driver);
 	    				try {
 	    					act3.moveToElement(ele).build().perform();
 	    				}catch(Exception e) {
 	    					
 	    				}
 	    			}
 	    		setTestCaseID("TC_LINE_AXIS_007");
 	    		String fontFamily_Y_Act=getFontFamily(driver,Y_Value);
 	    		if(fontFamily_Y_Act.equals(ChangeFontFamily_AxisTitle)) {
 	   			     pass(driver,"Selected fontFamily ("+ChangeFontFamily_AxisTitle+") Updated in Y Axis chart value");
 	    		}else {
 	         	    fail(driver,"Selected FontFamily ("+ChangeFontFamily_AxisTitle+") is not Updated in Y Axis chart value");
 	    		}
 	           	
 	        }else {
 	     	    fail(driver,"Font family dropdown is not expanded after click on it");
 	        }
 	     	
 	     	
 	     	setTestCaseID("TC_LINE_AXIS_008");
 	       	verifyElementDisplayed(driver,titleFontSize);
 	       	if(verifyElementDisplayed(driver,titleFontSizeDropdown)) {
 	       		
 	       		String font_Size_Act=defaultSelectedValue(driver,titleFontSizeDropdown);
 	       		//System.out.println("Font_Size : "+font_Size_Act);
 	       		if(font_Size_Act.equals(default_FontSize_Exp)) {
 	      			pass(driver,"By default, "+default_FontSize_Exp+" displayed in the Title Font Size input");
 	       		}else {
 	           	    fail(driver,"By default, "+default_FontSize_Exp+" is not displayed in the Title Font Size input");
 	       		}
 	       	}
 	        setTestCaseID("TC_LINE_AXIS_009");
 	       	click(driver,titleFontSizeDropdown);
 	        setTestCaseID("TC_LINE_AXIS_011");
 	  		selectOptionValue(driver,titleFontSizeDropdown,ChangeTitleFontSize_AxisTitle);
 	  		wait(driver,"1");
 	  		scrollUsingElement(driver, ApplyButton);
 	  		click(driver,ApplyButton);
 	  		elementnotvisible1(driver, RPE_Loading);
 	  		verifyElementDisplayed(driver,Chart_Section);
 	  		
 	  	    moveElements1=driver.findElements(By.xpath("//div[@id='RPE_Preview']//*[name()='tspan']"));
 	  		for(WebElement ele:moveElements1) {
 	  			Actions act3=new Actions(driver);
 	  			try {
 	  				act3.moveToElement(ele).build().perform();
 	  			}catch(Exception e) {
 	  				
 	  			}
 	  		}
 	  			
 	  		String fontSize_Y_Act=getFontSize(driver,Y_Value);
 	  		String fontSize_X_Act=getFontSize(driver,X_Chart_Value);
 	  		if((ChangeTitleFontSize_AxisTitle.equals(fontSize_Y_Act))&&ChangeTitleFontSize_AxisTitle.equals(fontSize_X_Act)) {
 	  			pass(driver,"Given Title Font Size Updated in X-Axis Title and Y-Axis Title chart value");
 	  		}else {
 	  			fail(driver,"Given Title Font Size not Updated in any one of X-Axis Title and Y-Axis Title chart value");
 	  		}
 	  		
 	  		setTestCaseID("TC_LINE_AXIS_012");
 	       	verifyElementDisplayed(driver,X_axisFontSizeText);
 	       	if(verifyElementDisplayed(driver,X_axisFontSizeDropdown)) {
 	       		String X_font_Size_Act=defaultSelectedValue(driver,X_axisFontSizeDropdown);
 	       		System.out.println("X Font_Size : "+X_font_Size_Act);
 	       		if(X_font_Size_Act.equals(default_FontSize_Exp)) {
 	      			pass(driver,"By default, "+default_FontSize_Exp+" displayed in the X axis Font Size input");
 	       		}else {
 	           	    fail(driver,"By default, "+default_FontSize_Exp+" is not displayed in the X axis Font Size input");
 	       		}
 	       	}
 	       	setTestCaseID("TC_LINE_AXIS_013");
 	       	click(driver,X_axisFontSizeDropdown);
 	       setTestCaseID("TC_LINE_AXIS_015");
 	  		selectOptionValue(driver,X_axisFontSizeDropdown,Change_X_label_FontSize);
 	  		scrollUsingElement(driver, ApplyButton);
 	  		click(driver,ApplyButton);
 	  		elementnotvisible1(driver, RPE_Loading);
 	  		verifyElementDisplayed(driver,Chart_Section);
 	  		
 	     	String fontSize_X_label_Act=getFontSize(driver,X_AxisLabel_chartNew);
 	     	if(Change_X_label_FontSize.equals(fontSize_X_label_Act)) {
 	     		pass(driver,"Selected fontSize ("+Change_X_label_FontSize+") Updated in X Axis label chart value");
 	  		}else {
 	  			fail(driver,"Selected fontSize  ("+Change_X_label_FontSize+") not Updated in X Axis label chart value");
 	  		}
 	       	
 	     	setTestCaseID("TC_LINE_AXIS_016");
 	       	verifyElementDisplayed(driver, Y_axisFontSizeText);
 	       	if(verifyElementDisplayed(driver,Y_axisFontSizeDropdown)) {
 	       		String Y_font_Size_Act=defaultSelectedValue(driver,Y_axisFontSizeDropdown);
 	       		System.out.println("Y Font_Size : "+Y_font_Size_Act);
 	       		if(Y_font_Size_Act.equals(default_FontSize_Exp)) {
 	      			pass(driver,"By default, "+default_FontSize_Exp+" displayed in the Y axis Font Size input");
 	       		}else {
 	           	    fail(driver,"By default, "+default_FontSize_Exp+" is not displayed in the Y axis Font Size input");
 	       		}
 	       	}
 	       	setTestCaseID("TC_LINE_AXIS_017");
 	        click(driver,Y_axisFontSizeDropdown);
 	        setTestCaseID("TC_LINE_AXIS_019");
 	  		selectOptionValue(driver,Y_axisFontSizeDropdown,Change_Y_label_FontSize);
 	  		scrollUsingElement(driver, ApplyButton);
 	  		click(driver,ApplyButton);
 	  		elementnotvisible1(driver, RPE_Loading);
 	  		verifyElementDisplayed(driver,Chart_Section);
 	  		
 	  		List<WebElement> moveElements=driver.findElements(By.xpath("//div[@id='RPE_Preview']//*[name()='tspan']"));
// 			for(WebElement ele:moveElements) {
// 				Actions act3=new Actions(driver);
// 				try {
// 					act3.moveToElement(ele).build().perform();
// 				}catch(Exception e) {
// 					
// 				}
// 			}
 	     	String fontSize_Y_label_Act=getFontSize(driver,Y_AxisLabel_chart_Values);
 	      	if(Change_Y_label_FontSize.equals(fontSize_Y_label_Act)) {
 	  		    pass(driver,"Selected fontSize ("+Change_Y_label_FontSize+") Updated in Y Axis label chart value");
 	  		}else {
 	    	    fail(driver,"Selected fontSize ("+Change_Y_label_FontSize+") not Updated in Y Axis label chart value, Act : "+fontSize_Y_label_Act);
 	  		}
 	      	setTestCaseID("");
 	       	verifyElementDisplayed(driver, X_RotationText);
 	       	verifyElementDisplayed(driver,X_RotationOutputValue);
 	        setTestCaseID("TC_LINE_AXIS_021");
 	       	if(isToggleAccessible(driver, X_RotationInputSlider)) {
 	       		pass(driver,"X Rotation input is Accessible");
 	       	}else {
 	       		fail(driver,"X Rotation input is not Accessible");
 	       	}
 	       	
 	        setTestCaseID("TC_LINE_AXIS_020");
 	   		String X_RotationValueAct=getText1(driver,X_RotationOutputValue);
 	   		System.out.println("X rotation : "+X_RotationValueAct);
 	   		if(X_RotationValueAct.equals(defaultRotation)) {
 	  			pass(driver,"By default, '"+defaultRotation+"' displayed in the X axis Rotation output field");
 	   		}else {
 	       	    fail(driver,"By default, '"+defaultRotation+"' is not displayed in the X axis Rotation output field");
 	   		}
 	   		setTestCaseID("");
 	  		String X_Rotation_Color_Act=getTextBackgroundColor(driver,X_RotationOutputValue);
 	  		if(RotationInputColor_Exp.equalsIgnoreCase(X_Rotation_Color_Act)) {
 	  			pass(driver,"X rotation output highlighted in blue color");
 	  		}else {
 	  			fail(driver,"X rotation output not highlighted in blue color");
 	  		}
 	  	   // setTestCaseID("");
 	     	waitForElement(driver, X_RotationInputSlider);
 	       	moveSlider(driver,X_RotationInputSlider,X_RotationOutputValue,X_Rotation_Input);
 	       	scrollUsingElement(driver, ApplyButton);
 	  		click(driver,ApplyButton);
 	  		elementnotvisible1(driver, RPE_Loading);
 	  		verifyElementDisplayed(driver,Chart_Section);
 	  		moveElements=driver.findElements(By.xpath("//div[@id='RPE_Preview']//*[name()='tspan']"));
 			for(WebElement ele:moveElements) {
 				Actions act3=new Actions(driver);
 				try {
 					act3.moveToElement(ele).build().perform();
 				}catch(Exception e) {
 					
 				}
 			}
 			setTestCaseID("TC_LINE_AXIS_024");
 	     	String X_label_Rotation_Act=getRotationValue(driver,X_AxisLabel_chartNew);
 	     	if(X_Rotation_Input.equals(X_label_Rotation_Act)) {
 	 	    	 pass(driver,"Selected X Rotation Angle ("+X_Rotation_Input+") Updated in X Axis label chart value");
 	  		}else {
 	  			fail(driver,"Selected X Rotation Angle ("+X_Rotation_Input+") is not Updated in X Axis label chart value");
 	  		}
       	
 	      
 	     	setTestCaseID("TC_LINE_AXIS_023");
 	  		String Y_label_Rotation_Act1=getRotationValue(driver,Y_AxisLabel_chart_Values);
 	     	if(X_Rotation_Input.equals(Y_label_Rotation_Act1)) {
 	  		    fail(driver,"Selected X Rotation Angle ("+X_Rotation_Input+") Updated in Y Axis label chart value");
 	  		}else {
 	  			pass(driver,"Selected X Rotation Angle ("+X_Rotation_Input+") is not Updated in Y Axis label chart value");
 	  		}
 	     	setTestCaseID("TC_LINE_AXIS_025");
 	       	verifyElementDisplayed(driver, Y_RotationText);
 	       	if(verifyElementDisplayed(driver,Y_RotationOutputValue)) {
 	       		String Y_RotationValueAct=getText1(driver,Y_RotationOutputValue);
 	       		System.out.println("Y rotation : "+Y_RotationValueAct);
 	       		if(Y_RotationValueAct.equals(defaultRotationY)) {
 	      			pass(driver,"By default, '"+defaultRotationY+"' displayed in the Y axis Rotation output field");
 	       		}else {
 	           	    fail(driver,"By default, '"+defaultRotationY+"' displayed in the Y axis Rotation output field");
 	       		}
 	       		setTestCaseID("");
 	      		String Y_Rotation_Color_Act=getTextBackgroundColor(driver,Y_RotationOutputValue);
 	      		if(RotationInputColor_Exp.equalsIgnoreCase(Y_Rotation_Color_Act)) {
 	      			pass(driver,"Y rotation output highlighted in blue color");
 	      		}else {
 	      			fail(driver,"Y rotation output not highlighted in blue color");
 	      		}
 	       	}
 	       	
 	       
 	        waitForElement(driver, Y_RotationInputSlider);
 	       	moveSlider(driver,Y_RotationInputSlider,Y_RotationOutputValue,Y_Rotation_Input);
 	       	scrollUsingElement(driver, ApplyButton);
 	  		click(driver,ApplyButton);
 	  		elementnotvisible1(driver, RPE_Loading);
 	  		verifyElementDisplayed(driver,Chart_Section);
 	  		
// 	  		moveElements=driver.findElements(By.xpath("//div[@id='RPE_Preview']//*[name()='tspan']"));
// 			for(WebElement ele:moveElements) {
// 				Actions act3=new Actions(driver);
// 				try {
// 					act3.moveToElement(ele).build().perform();
// 				}catch(Exception e) {
// 					
// 				}
// 			}
 	  		setTestCaseID("TC_LINE_AXIS_027");
 	     	String Y_label_Rotation_Act=getRotationValue(driver,Y_AxisLabel_chart_Values);
 	     	if(Y_Rotation_Input.equals(Y_label_Rotation_Act)) {
 	  		    pass(driver,"Selected Rotation Angle ("+Y_Rotation_Input+") Updated in Y Axis label chart value");
 	  		}else {
 	  			fail(driver,"Selected Rotation Angle ("+Y_Rotation_Input+") is not Updated in Y Axis label chart value");
 	  		}
 	     	
 	     	setTestCaseID("TC_LINE_AXIS_026");
 	     	String X_label_Rotation_Act1=getRotationValue(driver,X_AxisLabel_chartNew);
 	     	if(Y_Rotation_Input.equals(X_label_Rotation_Act1)) {
 	 	    	 fail(driver,"Selected Y Rotation Angle ("+Y_Rotation_Input+") Updated in X Axis label chart value");
 	  		}else {
 	  			pass(driver,"Selected Y Rotation Angle ("+Y_Rotation_Input+") is not Updated in X Axis label chart value");
 	  		}
 	     	setTestCaseID("TC_LINE_AXIS_028");
 	     	String x_firstAscValue=getText1(driver,X_AxisLabel_chartNew2);
 	     	Pattern numericalPattern = Pattern.compile("^-?\\d+(\\.\\d+)?$");
 	     	if(numericalPattern.matcher(x_firstAscValue).matches()) {
 	     		if(!x_firstAscValue.equals("0")) {
 	 	     		verifyElementDisplayed(driver, switchSliderText);
 	 	 	     	if(verifyElementDisplayed(driver,switchSlider)){
 	 		 	   		if(isToggleEnable(driver, switchSliderInput)) {
 	 		 	   			fail(driver,"By default Start axis at 0 toggle enabled");
 	 		 	   		}else {
 	 		 	   			pass(driver,"By default Start axis at 0 toggle disabled");
 	 		 	   		}
 	 		 	         	    
 	 		 	   		click(driver,switchSlider);
 	 		            scrollUsingElement(driver, ApplyButton);
 	 		   		  	click(driver,ApplyButton);
 	 		 	  		elementnotvisible1(driver, RPE_Loading);
 	 		 	  		verifyElementDisplayed(driver,Chart_Section);
 	 		 	     	    
 	 		      	    x_firstAscValue=getText1(driver,Column_X_Labels_Chart);
 	 		 	      	if((x_firstAscValue.equals("0"))) {
 	 		 	  			pass(driver,"X axis label value started from '0' in the chart, After enbling the 'Start axis at 0' toggle");
 	 		 	      	}else {
 	 		 	  			pass(driver,"X axis label value not started from '0' in the chart, After enbling the 'Start axis at 0' toggle");
 	 		 	      	}	
 	 		 	      	
 	 		 	   		String y_firstAscValue=getText1(driver,Column_Y_Labels_Chart);
 	 		 	     	
 	 					if((y_firstAscValue.equals("0"))) {
 	 						pass(driver,"Y axis label value started from '0' in the chart, After enbling the 'Start axis at 0' toggle");
 	 					}else {
 	 						pass(driver,"Y axis label value not started from '0' in the chart, After enbling the 'Start axis at 0' toggle");
 	 					}	
 	 	 	     	}
 	 	     	}
 	     	}
 	     	
 	     }
 	 	 setTestCaseID("");
        
    	// ******************** AxisTitle Validation End *******************

 	   // ******************** ChartTitle Validation Start *******************
     	   String Line_Chart_Title= getCellValue("TestExecution","Testcase_Selection","Line_Chart_Title",Flag);
	       if(Line_Chart_Title.equals("Yes")) {
	      	 	CHART_TITLE chartTitle=new CHART_TITLE();
	           chartTitle.chartTitleTest(driver, TypeBackgroundColor1, TypeTextColor1, Change_FontFamily_ChartTitle, ChangeFontSize_ChartTitle,ChangeChartTitleName);       	
	       }
       // ******************** ChartTitle Validation End *******************
          
	 	
       //********** ChartStyle Validation Start *************************
       
    	 setTestCaseID("TC_LINE_CHART_STYLE_001");
    	 verifyElementDisplayed(driver,Chart_FormatSec);
		 click(driver,Chart_FormatSec);
	
   	     String Line_ChartFormat_Chart_Style= getCellValue("TestExecution","Testcase_Selection","Line_ChartFormat_Chart_Style",Flag);
         if(Line_ChartFormat_Chart_Style.equals("Yes")) {
       	 
        	 String ChartFormatOpenstatus=getAttribute1(driver, chartFormatExpand, "class");
  	  		 if(ChartFormatOpenstatus.contains("up")) {
  	  			pass(driver,"Chart Format is expanded when clicking the Chart Format");
  	  		 }else {
  	  			fail(driver,"Chart Format is not expanded when click the Chart Format");
  	  			
  	  		 }
  	  		 setTestCaseID("");
  	  		 //ChartFormatColorExp
  	  		 String ChartFormatColor=getTextColor(driver, Chart_FormatSec);
  	  		 if(ChartFormatColor.equalsIgnoreCase(ChartFormatColorExp)) {
  	  			pass(driver,"Chart Format gets highlighted in blue Color after it expands");
  	  		 }else {
  	  			fail(driver,"Chart Format not highlighted in blue Color after it expands"); 
  	  		 }
  	  		 
  	  		 setTestCaseID("TC_LINE_CHART_STYLE_002");
  	  		 verifyElementDisplayed(driver,ChartStyling); 
   			 String ChartStylingColor_Act=getTextColor(driver, ChartStyling);
   			 if(ChartStylingColor_Exp.equalsIgnoreCase(ChartStylingColor_Act)) {
   				pass(driver,"Chart Styling gets highlighted in blue color ");
   			 }else {
   				fail(driver,"Chart Styling not highlighted in blue color"); 
   			 }
   	  		 
    			 String ChartStylingExpand=getAttribute1(driver, ChartStyling_Expand, "class");
    			 if(ChartStylingExpand.contains("up")) {
    				pass(driver,"By default, Chart Styling gets Expanded");
    			 }else {
    				fail(driver,"By default, Chart Styling not gets Expand");
    			 }
    			
    			 setTestCaseID("TC_LINE_CHART_STYLE_003");
    			 verifyElementDisplayed(driver,ChartThemeText);
    			 verifyElementDisplayed(driver,ChartThemeInput);
    			   	
    			 verifyElementDisplayed(driver,LineStyle_text);
    			 verifyElementDisplayed(driver,LineStyle_Input);

    			 verifyElementDisplayed(driver,StrokeWidth_Input);
    			 verifyElementDisplayed(driver,StrokeWidth_text);

    			 verifyElementDisplayed(driver,X_ScrollText);
    			 verifyElementDisplayed(driver,X_ScrollInputSlider);
    			
    			 verifyElementDisplayed(driver,Y_ScrollText);
    			 verifyElementDisplayed(driver,Y_ScrollInputSlider);
    			
    			 verifyElementDisplayed(driver,EnableGridText);
    			 verifyElementDisplayed(driver,EnableGrid_InputSlider);
    			 
    			 verifyElementDisplayed(driver,Grid_Distance_Input);

    			 setTestCaseID("TC_LINE_CHART_STYLE_004");
    			 String defaultThemeValue_Act=getText1(driver,ChartThemeInput);
    			 if(defaultThemeValue_Act.equals(DefaultThemeValue_Exp)) {
    				 pass(driver,"By default, Chart theme selected the value as '"+DefaultThemeValue_Exp+"'");
    			 }else {
    				 fail(driver,"By default, '"+DefaultThemeValue_Exp+"' value not selected in the  Chart theme input");
    			 }
    			 setTestCaseID("TC_LINE_CHART_STYLE_005");
    			 click(driver,ChartThemeInput);
    			 if(verifyElementDisplayed(driver,ChartThemeResults)) {
    				 pass(driver,"Chart theme dropdown opened and displayed list of chart themes");
    				 mouseOverToElement(driver,ThirdValue);
    				 wait(driver,"1");
    				 setTestCaseID("TC_LINE_CHART_STYLE_008");
    				 String mouseHighlightColor=getTextBackgroundColor(driver,ThirdValue);
    				 if(Highlight_ColorStyle_Exp.equalsIgnoreCase(mouseHighlightColor)) {
    					 pass(driver,"Mouse hovered value highlighted in blue color");
    				 }else {
    					 fail(driver,"Mouse hovered value not highlighted in blue color");
    				 }
    			
    				 setTestCaseID("TC_LINE_CHART_STYLE_009");
    				 ScrollBarValidation1(driver,ChartThemeResults,"Chart Theme");
    			
    				 setTestCaseID("");
    				 verifyElementIsPresent1(driver,dropdownInputsearchBox);
    				 click(driver,dropdownInputsearchBox);
    				 setTestCaseID("TC_LINE_CHART_STYLE_007");
    				 sendKeys(driver,dropdownInputsearchBox,"sdgffh");
    				 String inValidResult=getText1(driver,chartThemeFirstResult);
    				 if(inValidResult.equals("No results found")) {
    					 pass(driver,"'No results found' displayed when user enter incorrect chart theme");
    				 }else {
    					 fail(driver,"'No results found' not displayed when user enter incorrect chart theme");
    				 }
    			       	
    				 setTestCaseID("");
    				 clear1(driver,dropdownInputsearchBox);
    				 setTestCaseID("TC_LINE_CHART_STYLE_006");
    				 sendKeys(driver,dropdownInputsearchBox,Change_ChartTheme_ChartStyle);
    				 String resultText=getText1(driver,chartThemeFirstResult);
    				 if(resultText.equals(Change_ChartTheme_ChartStyle)) {
    					 pass(driver,"Search input in the Chart Theme dropdown works properly");
    				 }else {
    					 fail(driver,"Search input in the Chart Theme dropdown not works properly");
    				 }
    			     
    				 setTestCaseID("TC_LINE_CHART_STYLE_010");
    				 selectChartTheme(driver,Change_ChartTheme_ChartStyle);
    				 wait(driver,"1");
    				 if(isDisplayed2(driver,ChartThemeResults)) {
    					 fail(driver,"Chart theme dropdown not closed after select the Theme");
    				 }else {
    					 pass(driver,"Chart theme dropdown closed automatically after select the Theme");
    				 }
    				 String selectedThemeValue=getText1(driver,ChartThemeInput);
	   				 if(selectedThemeValue.equals(Change_ChartTheme_ChartStyle)) {
	   					 pass(driver,"Selected Theme value  updated in the Chart Theme Input");
	   				 }else {
	   					 fail(driver,"Selected Theme value not updated in the Chart Theme Input");
	   				 }  
    				 
    				setTestCaseID("");
    				click(driver,ChartThemeInput);
    				waitForElement(driver,chartThemeResultList);
    				wait(driver,"1");
    				selectedColorAct=getTextBackgroundColor(driver,ListSelected);
    				System.out.println("Highlight_color_Exp : "+Highlight_color_Exp+"selectedColorAct : "+selectedColorAct);
    				highlightText=getText1(driver,ListSelectedText2);
    				if((highlightText.contains(Change_ChartTheme_ChartStyle))&&Highlight_color_Exp.equalsIgnoreCase(selectedColorAct)) {
    					pass(driver,"Selected Value ("+Change_ChartTheme_ChartStyle+") highlighted in blue color");
    				}else {
    					fail(driver,"Selected Value ("+Change_ChartTheme_ChartStyle+") not highlighted in blue color");
    				}
    				 mouseOverAndClick(driver, ChartThemeText);
    				
    			 }else {
    				 fail(driver,"Chart theme dropdown not opened after click on it");
    			 }
    			
    			 setTestCaseID("TC_LINE_CHART_STYLE_011");
    			 String DefaultLineSelected=defaultSelectedValue(driver, LineStyle_Input);
    			 if(DefaultLineSelected.equals("_______")) {
    				 pass(driver,"By default, '_______' is selected in the Line Style Input");
    			 }else {
    				 fail(driver,"By default, '_______' is not selected in the Line Style Input");
    			 }
    			 
    			 setTestCaseID("TC_LINE_CHART_STYLE_012");
    			 click(driver,LineStyle_Input);
    			 setTestCaseID("TC_LINE_CHART_STYLE_013");
    			 List<WebElement> Line_Style_AvailbleOption=getWebElements(driver, LineStyle_Options);
    			 int Line_Style_Size=Line_Style_AvailbleOption.size();
    			 if(Line_Style_Size==4) {
    				 pass(driver,"4 types of Line are present in the Line Style Select input");
    			 }else {
    				 fail(driver,"4 types of Line are not present in the Line Style Select input");
    			 }
    			 
    			 setTestCaseID("TC_LINE_CHART_STYLE_014");
    			 selectByText(driver, LineStyle_Input, Change_Line_Style_ChartStyle);
    			 setTestCaseID("");
    			 scrollUsingElement(driver, ApplyButton);
    			 click(driver,ApplyButton);
    			 elementnotvisible1(driver, RPE_Loading);
    			 verifyElementDisplayed(driver,Chart_Section);
    			 
    			 String chartLine=getAttribute(driver, LineStyleAppliedChart, "stroke-dasharray");
    			 
    			 String ExpectedLine=LineStyleValidation(Change_Line_Style_ChartStyle);
    			 
    			 setTestCaseID("TC_LINE_CHART_STYLE_015");
    			 if(ExpectedLine.equals(chartLine)) {
    				 pass(driver,"Selected Line Style '"+Change_Line_Style_ChartStyle+"' is applied in the chart");
    			 }else {
    				 fail(driver,"Selected Line Style '"+Change_Line_Style_ChartStyle+"' is not applied in the chart");
    			 }
    			 
    			 setTestCaseID("TC_LINE_CHART_STYLE_016");
    			 String DefaultStrokeWidth=defaultSelectedValue(driver, StrokeWidth_Input);
    			 if(DefaultStrokeWidth.equals("1")) {
    				 pass(driver,"Default stroke width is selected as '1' in the input");
    			 }else {
    				 fail(driver,"Default stroke width is not selected as '1' in the input");
    			 }
    			 
    			 setTestCaseID("TC_LINE_CHART_STYLE_017");
    			 click(driver,StrokeWidth_Input);
    			 setTestCaseID("TC_LINE_CHART_STYLE_019");
    			 List<WebElement> StrokeWidth_AvailbleOption=getWebElements(driver, StrokeWidthOptions);
    			 int StrokeWidth_Size=StrokeWidth_AvailbleOption.size();
    			 if(StrokeWidth_Size==4) {
    				 pass(driver,"'1-4' number of Strokes available in the Stroke width select input");
    			 }else {
    				 fail(driver,"'1-4' number of Strokes not available in the Stroke width select input");
    			 }
    			 
    			 setTestCaseID("TC_LINE_CHART_STYLE_020");
    			 selectByText(driver, StrokeWidth_Input, Change_StrokeWidth_ChartStyle);
    			 setTestCaseID("");
    			 scrollUsingElement(driver, ApplyButton);
    			 click(driver,ApplyButton);
    			 elementnotvisible1(driver, RPE_Loading);
    			 verifyElementDisplayed(driver,Chart_Section);
    			 setTestCaseID("TC_LINE_CHART_STYLE_021");
    			 String chartLineWidth=getAttribute(driver, LineStyleAppliedChart, "stroke-width");
    			 if(chartLineWidth.equals(Change_StrokeWidth_ChartStyle)) {
    				 pass(driver,"Selected StrokeWidth '"+Change_StrokeWidth_ChartStyle+"' is applied in the chart");
    			 }else {
    				 fail(driver,"Selected StrokeWidth '"+Change_StrokeWidth_ChartStyle+"' is not applied in the chart");
    			 }
    			 
    			 setTestCaseID("TC_LINE_CHART_STYLE_022");
				 if(isToggleEnable(driver,X_Scroll_toggle)) {
					 fail(driver,"By default, X Scroll toggle not disabled");
				 }else {
					 pass(driver,"By default, X Scroll toggle is disabled");
				 }
			  		   
				 if(isToggleEnable(driver,Y_Scroll_toggle)) {
					 fail(driver,"By default, Y Scroll toggle not disabled");
				 }else {
					 pass(driver,"By default, Y Scroll toggle is disabled");
				 }
    			  		  
				 setTestCaseID("TC_LINE_CHART_STYLE_023");
    			 click(driver,X_ScrollInputSlider);
    			 if(isToggleEnable(driver,X_Scroll_toggle)){
    				 pass(driver,"X Scroll toggle enabled when click on it");
    			 }else {
    				 fail(driver,"X Scroll toggle not enabled when click on it");
    			 }
    			   	
    			
 				 click(driver,Y_ScrollInputSlider);
 				 wait(driver,"1");
 				 if(isToggleEnable(driver,Y_Scroll_toggle)){
 					 pass(driver,"Y Scroll toggle enabled when enabling it");
 				 }else {
 					 fail(driver,"Y Scroll toggle not enabled when enabling it");
 				 }
     			  	
    			 scrollUsingElement(driver, ApplyButton);
    			 click(driver,ApplyButton);
    			 elementnotvisible1(driver, Loading);
    			 elementnotvisible1(driver, RPE_Loading);
    			 verifyElementDisplayed(driver,Chart_Section);
    			
    			 if(isDisplayed(driver,X_Scroll_Bar)) {
    				 pass(driver,"X Scroll Bar is displayed in the chart after enabling it");
    			 }else {
    				 fail(driver,"X Scroll Bar is not displayed in the chart after enabling it");
    			 }
    			 
				 if(isDisplayed(driver,Y_Scroll_Bar)) {
					 pass(driver,"Y Scroll Bar is displayed in the chart after enabling it");
				 }else {
					 fail(driver,"Y Scroll Bar is not displayed in the chart after enabling it");
				 }
    			 
    			 setTestCaseID("TC_LINE_CHART_STYLE_025");
    			 if(isToggleEnable(driver,EnableGrid_toggle)) {
    				 pass(driver,"By default, 'Enable Grid' toggle is enabled");
    				 
    				 scrollUsingElement(driver, ApplyButton);
    	  			 click(driver,ApplyButton);
    	  			 elementnotvisible1(driver, Loading);
    	  			 elementnotvisible1(driver, RPE_Loading);
    	  			 verifyElementDisplayed(driver,Chart_Section);
    	  			
    	  			 if(isDisplayed(driver,Grid_Stacked_Column)) {
    	  				 pass(driver,"Grid is displayed in the chart when it is enable");
    	  			 }else {
    	  				 fail(driver,"Grid is not displayed in the chart when it is enable");
    	  			 }
    				
    	  			 setTestCaseID("TC_LINE_CHART_STYLE_026");
    				 click(driver,EnableGrid_InputSlider);
    				 wait(driver,"1");
    				 if(isToggleEnable(driver,EnableGrid_toggle)){
    					 fail(driver,"'Enable Grid' toggle not disabled when click on it ");
    				 }else {
    					 pass(driver,"'Enable Grid' toggle disabled when click on it ");
    				 }
    			    		
    				 
    				 scrollUsingElement(driver, ApplyButton);
    	  			 click(driver,ApplyButton);
    	  			 elementnotvisible1(driver, Loading);
    	  			 elementnotvisible1(driver, RPE_Loading);
    	  			 verifyElementDisplayed(driver,Chart_Section);
    	  			
    	  			 if(isDisplayed(driver,Grid_Stacked_Column)) {
    	  				 fail(driver,"Grid is displayed in the chart when it is disable");
    	  			 }else {
    	  				 pass(driver,"Grid is not displayed in the chart when it is disable");
    	  			 }
    	  		     //click(driver,EnableGrid_InputSlider);
    			 }else {
    				 fail(driver,"By default, 'Enable Grid' toggle is not enabled");
    			 }
    		
    			 setTestCaseID("");
    			 String defaultGrid_distance_Act=defaultSelectedValue(driver,Grid_Distance_Input);
    			 if(Default_Grid_distance_Column.equals(defaultGrid_distance_Act)) {
    				 pass(driver,"By default "+Default_Grid_distance_Column+" is displayed in the Grid Distance Input");
    			 }else {
    				 fail(driver,"By default "+Default_Grid_distance_Column+" is not displayed in the Grid Distance Input");
    			 }
    			 
    			 setTestCaseID("");
    			 if(isToggleAccessible(driver, Grid_Distance_Input)) {
    				 pass(driver,"Grid_Distance_Input is Accessible");
    			 }else {
    				 fail(driver,"Grid_Distance_Input is not Accessible");
    			 }
    			 
    			 selectByText(driver, Grid_Distance_Input, Change_Grid_Distance);
    			 wait(driver,"1");
    			 String afterselectGrid=defaultSelectedValue(driver, Grid_Distance_Input);
    			 if(afterselectGrid.equals(Change_Grid_Distance)) {
    				 pass(driver,"Selected Value is displayed in the Grid_Distance_Input");
    			 }else {
    				 fail(driver,"Selected Value is not displayed in the Grid_Distance_Input");
    			 }

    			 setTestCaseID("TC_LINE_CHART_STYLE_027");
    			 click(driver,ChartStyling);
    			 wait(driver,"1");
    			 String chartStyleClose_Act=getAttribute1(driver, ChartStyling_Expand, "class");
    			 if(chartStyleClose_Act.contains("down")) {
    				 pass(driver,"Chart styling gets collapsed when click on it");
    			 }else {
    				 fail(driver,"Chart styling not gets collapsed when click on it");
    			 }
    			 
//    			 setTestCaseID("");
//    			 if(X_Axis_dataType.equals("Date")) {
//    				 if(isDisplayed2(driver, ZoomRange_Select_Toggle)) {
//    					 pass(driver,"Zoom Range Toggle is displayed when 'Date' variable selected in the X Axis");
//    					 
//        				 if(isToggleEnable(driver, ZoomRange_toggle)) {
//        					 pass(driver,"Zoom Range Toggle is enabled by default");
//        				 }else {
//        					 fail(driver,"Zoom Range Toggle is not enabled by default");
//        				 }
//        				 
//        				 if(isDisplayed(driver,ZoomOption_Chart)) {
//        					 pass(driver,"Zoom Options is displayed in the chart when the toggle is enabled");
//        				 }else {
//        					 fail(driver,"Zoom Options is not displayed in the chart when the toggle is enabled");
//        				 }
//    				 }else {
//    					 fail(driver,"Zoom Range Toggle is not displayed when 'Date' variable selected in the X Axis");
//    				 }
//    				 
//    				 
//    			 }
    			 
  	  		 
         }
  		 //*********** ChartStyle validation end ************
         
         
       // ********** DataLabel Validation Start ***************
         String Line_ChartFormat_Data_Labels= getCellValue("TestExecution","Testcase_Selection","Line_ChartFormat_Data_Labels",Flag);
         if(Line_ChartFormat_Data_Labels.equals("Yes")) {
        	 setTestCaseID("TC_LINE_DATA_LABELS_001");
         	 verifyElementDisplayed(driver,DataLabels);
     		 scrollUsingElement(driver,DataLabels);
     		 String DataLabelsExpand=getAttribute1(driver, DataLabels_Expand, "class");
     		 if(DataLabelsExpand.contains("up")) {
     			pass(driver,"By default, Data Labels gets Expanded");
     		 }else {
     			fail(driver,"By default, Data Labels not gets Expand");
     			//click(driver,DataLabels);
     		 }
     		 
     		 //Validation of the visibility of data label options start...
     		 verifyElementDisplayed(driver,EnableValue_text);
     		 verifyElementDisplayed(driver, EnableValue_InputSlider);

     		 verifyElementDisplayed(driver,ValueFormat_text);
     		 verifyElementDisplayed(driver,ValueFormatInput);
          
     		 verifyElementDisplayed(driver,Seperator_text);
     		 verifyElementDisplayed(driver,SeperatorInput);
     		
     		 verifyElementDisplayed(driver,ValueFontSize_text);
     		 verifyElementDisplayed(driver,ValueFontSizeInput);
          
     		 verifyElementDisplayed(driver,RoundOffValue_text);
     		 verifyElementDisplayed(driver,RoundOffValueInput);
          
     		 verifyElementDisplayed(driver,BigNumberSuffix_text);
     		 verifyElementDisplayed(driver,BigNumberInput);
          
     		 verifyElementDisplayed(driver,ShowAsPositive_text);
     		 verifyElementDisplayed(driver,ShowPositive_Input);
        
     		 verifyElementDisplayed(driver,IgnoreZero_text);
     		 verifyElementDisplayed(driver,IgnoreZero_Input_toggle);
       
     		 verifyElementDisplayed(driver,ValueRotation_text);
     		 verifyElementDisplayed(driver,ValueRotation_Input);
     		 //Validation of the visibility of data label options End...
     	     
     	     //All options are inaccessible when the enable value toggle is disabled. Validation end
     		 setTestCaseID("TC_LINE_DATA_LABELS_002");
     	     if(isToggleEnable(driver,EnableValue_Input)) {
     	  		 fail(driver,"By Default, Enable Value toggle is enabled");
     	     }else {
     	  		 pass(driver,"By Default, Enable Value toggle is disabled");
     	  		 
     	  		setTestCaseID("TC_LINE_DATA_LABELS_003");
     	  		 if(IsElementEnabled(driver,ValueFormatInput)) {
     		  		 fail(driver,"'Value Format' is accessible when the 'Enable value' toggle is disabled.");
     		     }else {
     		  		 pass(driver,"'Value Format' is inaccessible when the 'Enable value' toggle is disabled.");
     		     }
     		     
     		     if(IsElementEnabled(driver,SeperatorInput)) {
     		  		 fail(driver,"'Seperator Input' is accessible when the 'Enable value' toggle is disabled.");
     		     }else {
     		  		 pass(driver,"'Seperator Input' is inaccessible when the 'Enable value' toggle is disabled.");
     		     }
     		     
     		     if(IsElementEnabled(driver,ValueFontSizeInput)) {
     		  		 fail(driver,"'ValueFontSize Input' is accessible when the 'Enable value' toggle is disabled.");
     		     }else {
     		  		 pass(driver,"'ValueFontSize Input' is inaccessible when the 'Enable value' toggle is disabled.");
     		     }
     		     
     		     if(IsElementEnabled(driver,RoundOffValueInput)) {
     		  		 fail(driver,"'RoundOffValue Input' is accessible when the 'Enable value' toggle is disabled.");
     		     }else {
     		  		 pass(driver,"'RoundOffValue Input' is inaccessible when the 'Enable value' toggle is disabled.");
     		     }
     		     
     		     if(IsElementEnabled(driver,BigNumberInput)) {
     		  		 fail(driver,"'BigNumber Suffix Input' is accessible when the 'Enable value' toggle is disabled.");
     		     }else {
     		  		 pass(driver,"'BigNumber Suffix Input' is inaccessible when the 'Enable value' toggle is disabled.");
     		     }
     		     
     		     if(IsElementEnabled(driver,ValueRotation_Input)) {
     		  		 fail(driver,"'ValueRotation_Input' is accessible when the 'Enable value' toggle is disabled.");
     		     }else {
     		  		 pass(driver,"'ValueRotation_Input' is inaccessible when the 'Enable value' toggle is disabled.");
     		     }
     		     
     		     if(IsElementEnabled(driver,ShowPositive_Input)) {
     		    	 pass(driver,"'Show As Positive Input' is accessible when the 'Enable value' toggle is disabled.");
     		     }else {
     		  		 fail(driver,"'Show As Positive Input' is not accessible when the 'Enable value' toggle is disabled.");
     		     }
     		     
     		     if(IsElementEnabled(driver,IgnoreZero_toggle)) {
    		    	 pass(driver,"'Ignore Zeros' toggle is accessible when the 'Enable value' toggle is disabled.");
    		     }else {
    		  		 fail(driver,"'Ignore Zeros' toggle is not accessible when the 'Enable value' toggle is disabled.");
    		     }
     	  		 
     	     }
     	     //All options are inaccessible when the enable value toggle is disabled. Validation end
     	     
     	     setTestCaseID("TC_LINE_DATA_LABELS_004");
     		 click(driver,EnableValue_InputSlider);
     		 if(isToggleEnable(driver,EnableValue_Input)) {
     	  		 pass(driver,"'Enable Value' toggle is enabled after click on it");
     		 }else {
     	  		 fail(driver,"'Enable Value' toggle is not enabled after click on it");
     	  		 
     		 }
     		
     		 scrollUsingElement(driver, ApplyButton);
     		 click(driver,ApplyButton);
     		 elementnotvisible1(driver, RPE_Loading);
     		 verifyElementDisplayed(driver,Chart_Section);
     		 
     		 if(isDisplayed(driver,EnableValue)) {
     			 pass(driver,"Values enabled in charts after enabling the 'Enable Value' toggle"); 
     		 }else {
     	  		 fail(driver,"Values not enabled in charts after enabling the 'Enable Value' toggle"); 
     		 }
     		 
     		 setTestCaseID("TC_LINE_DATA_LABELS_005");
     		 if(isToggleAccessible(driver,ValueFormatInput)) {		
     	  		 pass(driver,"'Value Format Input' is accessible after enabling the 'Enable Value' toggle"); 
     		 }else {
     	  		 fail(driver,"'Value Format Input' is not accessible after enabling the 'Enable Value' toggle");
     		 }
     		 
     		 setTestCaseID("TC_LINE_DATA_LABELS_006");
     		 String defaultFormatValue_Act=defaultSelectedValue(driver, ValueFormatInput);
       		 if(DefaultFormatValue_Exp.equals(defaultFormatValue_Act)) {
     	  		 pass(driver,"By default, '"+DefaultFormatValue_Exp+"' is selected in the Value Format Input"); 
       		 }else {
     	  		 fail(driver,"By default, '"+DefaultFormatValue_Exp+"' is not selected in the Value Format Input"); 
       		 }
     		 
       		 setTestCaseID("TC_LINE_DATA_LABELS_007");
       		 click(driver,ValueFormatInput);
       		 verifyElementIsPresent1(driver, Value_ValueFormat);
       		 verifyElementIsPresent1(driver, Percentage_ValueFormat);
	
       		 setTestCaseID("TC_LINE_DATA_LABELS_008");
     		 selectOptionValue(driver,ValueFormatInput,"value");
     		 scrollUsingElement(driver, ApplyButton);
     		 click(driver,ApplyButton);
     		 elementnotvisible1(driver, RPE_Loading);
     		 verifyElementDisplayed(driver,Chart_Section);
     		
     		 String ValueTextAct=getText(driver,EnableValue);   
     		 if(ValueTextAct.endsWith("%")) {
     	  		 fail(driver,"'Value Format' is not display in the chart for 'Value' format selection");
     		 }else {
     	  		 pass(driver,"'Value Format' is displayed in the chart for 'Value' format selection");
     		 }
     		 
     		 selectOptionValue(driver,ValueFormatInput,"percentage");
     		 wait(driver,"1");
     		 scrollUsingElement(driver, ApplyButton);
     		 click(driver,ApplyButton);
     		 elementnotvisible1(driver, RPE_Loading);
     		 setTestCaseID("TC_LINE_DATA_LABELS_011");
     		 if(isToggleAccessible(driver,SeperatorInput)) {	
     			 fail(driver,"'Seperator Input' is accessible  when 'Percentage' is selected in value format");	  		
     		 }else {
     			 pass(driver,"'Seperator Input' is inaccessible  when 'Percentage' is selected in value format");
     		 }
     		 setTestCaseID("TC_LINE_DATA_LABELS_008");
     		 scrollUsingElement(driver, ApplyButton);
     		 click(driver,ApplyButton);
     		 elementnotvisible1(driver, RPE_Loading);
     		 verifyElementDisplayed(driver,Chart_Section);
     		 
     		 ValueTextAct=getText(driver,EnableValue);  
     		 if(ValueTextAct.contains("%")) {
     	  		 pass(driver,"Enabled Value in chart  is displayed in percentage when 'Percentage' is selected");
     		 }else {
     	  		 fail(driver,"Enabled Value in chart is not displayed in percentage when 'Percentage' is selected");
     		 }
     		 
     		 setTestCaseID("TC_LINE_DATA_LABELS_009");
     		 selectOptionValue(driver,ValueFormatInput,"value");
     		 scrollUsingElement(driver, ApplyButton);
     		 click(driver,ApplyButton);
     		 elementnotvisible1(driver, RPE_Loading);
     		 if(isToggleAccessible(driver,SeperatorInput)) {	
     			pass(driver,"'Seperator Input' is accessible  when 'value' is selected in value format"); 
     		 }else {
     			fail(driver,"'Seperator Input' is not accessible  when 'value' is selected in value format"); 
     		 }
     		 
     		 verifyElementIsPresent1(driver, Thousand_Seperator);
     		 verifyElementIsPresent1(driver, Houndred_Seperator);

     		 setTestCaseID("");
     		 String defaultSeperator_Act=defaultSelectedValue(driver,SeperatorInput);
     		 if(DefaultSeperatorValue_Exp.equals(defaultSeperator_Act)) {
     	  		 pass(driver,"By default, '"+DefaultSeperatorValue_Exp+"' is selected in the Seperator Input"); 
     		 }else {
     	  		 fail(driver,"By default, '"+DefaultSeperatorValue_Exp+"' is not selected in the Seperator Input"); 
     		 } 
            
     		 setTestCaseID("TC_LINE_DATA_LABELS_010");
     		click(driver,SeperatorInput);
     		selectOptionValue(driver,SeperatorInput,"#,###");
     		scrollUsingElement(driver, ApplyButton);
     		click(driver,ApplyButton);
     		elementnotvisible1(driver, RPE_Loading);
     		verifyElementDisplayed(driver,Chart_Section);
     		
//     		//new 
//     		 chartValues=getWebElements(driver, ValueFormat_ChartValue);
//     		 chartValueSize=chartValues.size();
//     		 lastChartValue=chartValues.get(chartValueSize-3);
//     		 //new
     		
     		String ChartValueTextAct= getText(driver,EnableValue);//getText1(driver,ValueFormat_ChartValue);
     		if(!ChartValueTextAct.contains(".") && ChartValueTextAct.length()>3) {
     			String ValueSeperatorFormat=validateNumberFormat(ChartValueTextAct);
     			if(ChartValueTextAct.length()>3) {
     				if(ValueSeperatorFormat.equals("#,###")) {
     	  	  	  		 pass(driver,"Thousand seperator gets applied for chart enabled values"); 
     	  	  		}else {
     	  	  	  		 fail(driver,"Thousand seperator not applied for chart enabled values"); 
     	  	  		}
     			}
     		}
     		
     		click(driver,SeperatorInput);
     		selectOptionValue(driver,SeperatorInput,"#,##");
     		scrollUsingElement(driver, ApplyButton);
     		click(driver,ApplyButton);
     		elementnotvisible1(driver, RPE_Loading);
     		verifyElementDisplayed(driver,Chart_Section);
     		
     		ChartValueTextAct=getText(driver,EnableValue);     //getText1(driver,ValueFormat_ChartValue);
     		if(!ChartValueTextAct.contains(".") && ChartValueTextAct.length()>3) {
     			String ValueSeperatorFormat=validateNumberFormat(ChartValueTextAct);
     			if(ChartValueTextAct.length()>3) {
     				if(ValueSeperatorFormat.equals("#,##")) {
     	  	  	  		 pass(driver,"Hundred Separator gets applied for chart enabled values"); 
     	  	  		}else {
     	  	  	  		 fail(driver,"Hundred Separator not applied for chart enabled values"); 
     	  	  		}
     			}
     	  		
     		}
     		
     		 setTestCaseID("TC_LINE_DATA_LABELS_012");
     		String defaultFontSize_Act=defaultSelectedValue(driver, ValueFontSizeInput);
     		if(DefaultFontSizeValue_Exp.equals(defaultFontSize_Act)) {
     			pass(driver,"By default, '"+DefaultFontSizeValue_Exp+"' is selected in the Value Font Size Input"); 
     		}else {
     			fail(driver,"By default, '"+DefaultFontSizeValue_Exp+"' is not selected in the Value Font Size Input"); 
     		}
      		 
     		setTestCaseID("TC_LINE_DATA_LABELS_013");
     		if(IsElementEnabled(driver,ValueFontSizeInput)) {		
     	  		 pass(driver,"'Value FontSize Input' is accessible after enabling the 'Enable Value' toggle"); 
     	  		 setTestCaseID("TC_LINE_DATA_LABELS_014");
     	  		 click(driver,ValueFontSizeInput);
         		
     	  		 setTestCaseID("TC_LINE_DATA_LABELS_015");
     	  		 selectOptionValue(driver,ValueFontSizeInput,ChangeFontSizeValue_DataLabel);
     	  		 scrollUsingElement(driver, ApplyButton);   
     	  		 click(driver,ApplyButton);
     	  		 elementnotvisible1(driver, RPE_Loading);
     	  		 verifyElementDisplayed(driver,Chart_Section);
     	  		 String ValueFontSizeAct=getFontSize(driver,EnableValue);
     	  		 if(ValueFontSizeAct.equals(ChangeFontSizeValue_DataLabel)) {
     	  			 pass(driver,"The chart's value displayed with Selected '"+ChangeFontSizeValue_DataLabel+"' font size."); 
     	  		 }else {
     	  			 fail(driver,"The chart's value not displayed with Selected '"+ChangeFontSizeValue_DataLabel+"' font size."); 
     	  		 }
     	  		 selectOptionValue(driver,ValueFontSizeInput,DefaultFontSizeValue_Exp);
     		}else {
     	  		 fail(driver,"'Value FontSize Input' is not accessible after enabling the 'Enable Value' toggle");
     		}
     		
     		setTestCaseID("");
     		String defaultRoundOffValue_Act=defaultSelectedValue(driver, RoundOffValueInput);
      		if(DefaultRoundOffValue_Exp.equals(defaultRoundOffValue_Act)) {
     	  		 pass(driver,"By default, '"+DefaultRoundOffValue_Exp+"' is selected in the RoundOffValue Input"); 
      		}else {
     	  		 fail(driver,"By default, '"+DefaultRoundOffValue_Exp+"' is not selected in the RoundOffValue Input"); 
      		}
      		
      		setTestCaseID("TC_LINE_DATA_LABELS_016");
     		if(IsElementEnabled(driver,RoundOffValueInput)) {		
     	  		 pass(driver,"'RoundOff Value Input' is accessible after enabling the 'Enable Value' toggle"); 
     	  		 setTestCaseID("TC_LINE_DATA_LABELS_017");
     	  		 click(driver,RoundOffValueInput);
     	  		 wait(driver,"1");
     	  		 selectByText(driver,RoundOffValueInput,ChangeRoundOffValue_DataLabel);
     	  		 scrollUsingElement(driver, ApplyButton);
     	  		 click(driver,ApplyButton);
     	  		 elementnotvisible1(driver, RPE_Loading);
     	  		 verifyElementDisplayed(driver,Chart_Section);
     	  		 ChartValueTextAct=getText1(driver,EnableValue);   
     	  		 String RoundOffValue_Act=String.valueOf(getRoundOffValue(ChartValueTextAct));
     	  		 if(RoundOffValue_Act.equals(ChangeRoundOffValue_DataLabel)) {
     	  			 pass(driver,"The chart's value displayed with Selected '"+ChangeRoundOffValue_DataLabel+"' RoundOff Value"); 
     	  		 }else {
     	  			 fail(driver,"The chart's value not displayed with Selected '"+ChangeRoundOffValue_DataLabel+"' RoundOff Value"); 
     	  		 }
     	  		 selectByText(driver,RoundOffValueInput,"Select");
     		}else {
     	  		 fail(driver,"'RoundOff Value Input' is not accessible after enabling the 'Enable Value' toggle");
     		}
      		
     	    setTestCaseID("TC_LINE_DATA_LABELS_018");
     	    selectOptionValue(driver,SeperatorInput,"#,###");
     		if(IsElementEnabled(driver,BigNumberInput)) {
     			 fail(driver,"'Big Number Suffix' toggle is accessible while Seperator value is selected");
     		}else {
     			 pass(driver,"'Big Number Suffix' toggle is Inaccessible while Seperator value is selected");
     		}
     		
     		setTestCaseID("TC_LINE_DATA_LABELS_019");
     		selectOptionValue(driver,ValueFormatInput,"percentage");
     		scrollUsingElement(driver, ApplyButton);
     		click(driver,ApplyButton);
     		elementnotvisible1(driver, RPE_Loading);
     	    if(IsElementEnabled(driver,BigNumberInput)) {
     			 fail(driver,"'Big Number Suffix' toggle is accessible while 'Percentage'  is selected in the Value Format input");
     		}else {
     			 pass(driver,"'Big Number Suffix' toggle is Inaccessible while 'Percentage'  is selected in the Value Format input");
     		}

     	    setTestCaseID("");
     	    selectOptionValue(driver,ValueFormatInput,"value");
     	    scrollUsingElement(driver, ApplyButton);
     	    click(driver,ApplyButton);
     	    elementnotvisible1(driver, RPE_Loading);
     	    if(IsElementEnabled(driver,BigNumberInput)) {
     	    	pass(driver,"'Big Number Suffix' toggle is accessible while Seperator value is not selected");
     	    }else {
     	    	fail(driver,"'Big Number Suffix' toggle is Inaccessible while Seperator value is not selected");
     	    }
     	    
     	    selectByText(driver,SeperatorInput,"Select");
     	    scrollUsingElement(driver, ApplyButton);
     	    click(driver,ApplyButton);
     	    elementnotvisible1(driver, RPE_Loading);
     	    
     	    if(IsElementEnabled(driver,BigNumberInput)) {
     			 pass(driver,"'Big Number Suffix' toggle is accessible while 'Percentage' is not selected in the Value Format input");
     			 setTestCaseID("TC_LINE_DATA_LABELS_020");
     			 click(driver,BigNumberInputSlider);
     			 if(isToggleEnable(driver,BigNumberInput)) {
     				 pass(driver,"'Big Number Suffix' toggle is enabled while click on it");
     				 scrollUsingElement(driver, ApplyButton);
     				 click(driver,ApplyButton);
     				 elementnotvisible1(driver, RPE_Loading);
     				 ChartValueTextAct=getText(driver,EnableValue);    
     				 if( ChartValueTextAct.length()>3) {
     					 if(ChartValueTextAct.endsWith("K") || ChartValueTextAct.endsWith("k")) {
     						 pass(driver,"The big number suffix is applied for enabled value in charts");
     					 }else {
     						 fail(driver,"The big number suffix is not applied for enabled value in charts, Act Value : "+ChartValueTextAct);
     					 }
     				 }
     			 }else {
     				 fail(driver,"'Big Number Suffix' toggle is not enabled while click on it");
     			 }
     			 click(driver,BigNumberInputSlider);
     			 if(isToggleEnable(driver,BigNumberInput)) {
     				 fail(driver,"'Big Number Suffix' toggle is enabled while disabling it");
     			 }else {
     				 pass(driver,"'Big Number Suffix' toggle is disabled while disabling it");
     				 scrollUsingElement(driver, ApplyButton);
     				 click(driver,ApplyButton);
     				 elementnotvisible1(driver, RPE_Loading);
     				 ChartValueTextAct=getText(driver,EnableValue);   
     				 if(ChartValueTextAct.endsWith("K") || ChartValueTextAct.endsWith("k")) {
     					 fail(driver,"The big number suffix is applied for enabled value in charts after disabling the toggle");
     				 }else {
     					 pass(driver,"The big number suffix is not applied for enabled value in charts after disabling the toggle");
     				 }
     			 }
     	    }else {
     			fail(driver,"'Big Number Suffix' toggle is Inaccessible while 'Percentage' is not selected in the Value Format input");
     		}
     	   
     	    setTestCaseID("TC_LINE_DATA_LABELS_021");
     	    if(isToggleEnable(driver,IgnoreZero_toggle)) {
   			 	fail(driver,"By default, 'Ignore Zero' toggle is enabled");
     	    }else {
   			 	pass(driver,"By default, 'Ignore Zero' toggle is disabled");
   			 	setTestCaseID("TC_LINE_DATA_LABELS_022");
   			 	click(driver,IgnoreZero_Input_toggle);
   			 	wait(driver,"1");
   			 	if(isToggleEnable(driver,IgnoreZero_toggle)) {
   			 		pass(driver,"'Ignore Zero' toggle is enabled");
   			 		boolean valueZero=true;
   			 		List<WebElement> EnabledChartValues=getWebElements(driver,EnableValue);
   			 		try {
   			 			for(WebElement EnabledChartValue:EnabledChartValues) {
   			 				action.moveToElement(EnabledChartValue).build().perform();
   			 				String ValueDisplayed=EnabledChartValue.getText();
   			 				if(ValueDisplayed.equals("0")) {
   			 					valueZero=false;
   			 					break;
   			 				}
   			 			}
   			 		}catch(Exception e) {
   			 			
   			 		}
   			 		setTestCaseID("TC_LINE_DATA_LABELS_023");
   			 		if(valueZero==true){
   			 			pass(driver,"'0' is Ignored in the Enabled chart Value when the toggle is enabled");
   			 		}else {
   			 			fail(driver,"'0' is not Ignored in the Enabled chart Value when the toggle is enabled");
   			 		}
   			 	}else {
   			 		fail(driver,"'Ignore Zero' toggle is disabled");
   			 	}
     	    }
     	    
     	    Pattern numericalPattern = Pattern.compile("^\\d+(\\.\\d+)?$");
     	    setTestCaseID("TC_LINE_DATA_LABELS_024");
     		if(isToggleEnable(driver,ShowPositive_Input)) {
     			 fail(driver,"By default, 'Show As Positive' toggle is enabled");
     	    }else {
     			 pass(driver,"By default, 'Show As Positive' toggle is disabled");
     			 setTestCaseID("TC_LINE_DATA_LABELS_025");
     			 click(driver,ShowPositive_InputSlider);
     			 if(isToggleEnable(driver,ShowPositive_Input)) {
         			 pass(driver,"'Show As Positive' toggle is enabled while enabling it");
         			 scrollUsingElement(driver, ApplyButton);
         			 click(driver,ApplyButton);
         			 elementnotvisible1(driver, RPE_Loading);
              		 String	X_StartValue=getText1(driver,Column_X_Labels_Chart);
              		 if(numericalPattern.matcher(X_StartValue).matches()) {
              			if(X_StartValue.startsWith("-")) {
                 			fail(driver,"Chart not started with positive value when 'Show positive' toogle is enabled");
                 		 }else {
            				pass(driver,"Chart started with positive value when 'Show positive' toogle is enabled");
                 		 }
              		 }
         	    }else {
         			 fail(driver,"'Show As Positive' toggle is not enabled while enabling it");
         	    } 
     		}
     	    
     	    setTestCaseID("TC_LINE_DATA_LABELS_026");
     		if(IsElementEnabled(driver,ValueRotation_Input)) {
     			 pass(driver,"Value rotation is accessible after enabling the 'Enable Value' toggle");
     			 String defaultRotationValue_Act=getText1(driver,ValueRotation_Output);
     			 if(DefaultRotationValue_Exp.equals(defaultRotationValue_Act)) {
     				 pass(driver,"By default, '"+DefaultRotationValue_Exp+"' is displayed in value rotation output");
     			 }else {
     				 fail(driver,"By default, '"+DefaultRotationValue_Exp+"' is not displayed in value rotation output");
     			 }
         		
     			 setTestCaseID("TC_LINE_DATA_LABELS_027");
     			 moveSlider(driver,ValueRotation_Input,ValueRotation_Output,ChangeRotataionVal_Positive_DataLabel);
     			 scrollUsingElement(driver, ApplyButton);
     			 click(driver,ApplyButton);
     			 elementnotvisible1(driver, RPE_Loading);
     			 wait(driver,"1");
     			 String chartValueRotation_Act=getRotationValue(driver,EnableValue);
     			 if(chartValueRotation_Act.equals(ChangeRotataionVal_Positive_DataLabel)) {
     				 pass(driver,"Selected positive Rotation Angle ("+ChangeRotataionVal_Positive_DataLabel+") is Updated in chart value");
     			 }else {
     				 fail(driver,"Selected positive Rotation Angle ("+ChangeRotataionVal_Positive_DataLabel+") is not Updated in chart value");
     			 }
               
     			 moveSlider(driver,ValueRotation_Input,ValueRotation_Output,ChangeRotataionVal_Negative_DataLabel);
                 scrollUsingElement(driver, ApplyButton);
                 click(driver,ApplyButton);
                 elementnotvisible1(driver, RPE_Loading);
                 wait(driver,"1");
                 chartValueRotation_Act=getRotationValue(driver,EnableValue);
                 if(chartValueRotation_Act.equals(ChangeRotataionVal_Negative_DataLabel)) {
                	 pass(driver,"Selected Negative Rotation Angle ("+ChangeRotataionVal_Negative_DataLabel+") is Updated in chart value");
                 }else {
                	 fail(driver,"Selected Negative Rotation Angle ("+ChangeRotataionVal_Negative_DataLabel+") is not Updated in chart value");
                 }
     		}else {
     			fail(driver,"Value rotation is Inaccessible after enabling the 'Enable Value' toggle");
     		}
     		
          	setTestCaseID("");
   	        mouseOverToElement(driver, DataLabels);
   	       	click(driver,DataLabels);
   	       	String DataLabelsClose_Act=getAttribute1(driver, DataLabels_Expand, "class");
   	  		if(DataLabelsClose_Act.contains("down")) {
   	  			pass(driver,"Data labels gets collapsed when click on it");
   	  		}else {
   	  			fail(driver,"Data Labels not gets collapsed when click on it");
   	  		}
          }
         // ******************** DataLabel Validation End **********************//
		
         // ******************** Legend Validation Start **********************//
         setTestCaseID("");
		 String Line_ChartFormat_Legends= getCellValue("TestExecution","Testcase_Selection","Line_ChartFormat_Legends",Flag);
         if(Line_ChartFormat_Legends.equals("Yes")) {
        	 setTestCaseID("");
        	 verifyElementDisplayed(driver,Legend_);
    		 scrollUsingElement(driver,Legend_);
    		 String LegendSecExpand=getAttribute1(driver, Legends_Expand, "class");
    		 if(LegendSecExpand.contains("up")) {
    			pass(driver,"By default, Legends gets Expanded");
    			
    			
    		 }else {
    			fail(driver,"By default, Legends not gets Expanded");
    			//click(driver,DataLabels);
    		 }
    		
    		 setTestCaseID("");
    		 String LegendsColor_Act=getTextColor(driver, Legend_);
    		 if(Legends_Color_Exp.equalsIgnoreCase(LegendsColor_Act)) {
    			pass(driver,"Legends gets displayed in blue color");
    		 }else {
    			fail(driver,"Legends not displayed in blue color"); 
    		 }
    		 setTestCaseID("TC_LINE_LEGENDS_001");
    		 verifyElementDisplayed(driver,Legend_Text);
    		 verifyElementDisplayed(driver, Legend_InputToggle);

    		 verifyElementDisplayed(driver,LegendPosition_Text);
    		 verifyElementDisplayed(driver,LegendPosition_Input);
         
    		 verifyElementDisplayed(driver,LegendFontSize_Text);
    		 verifyElementDisplayed(driver,LegendFontSize_Input);
    		 
    		 setTestCaseID("TC_LINE_LEGENDS_002");
    		 if(isToggleEnable(driver, Legend_Input)) {
    			 pass(driver,"By default, Legend Toggle is enabled ");
    		 }else {
    			 fail(driver,"By default, Legend Toggle is not enabled ");
    		 }
           	
    		 setTestCaseID("TC_LINE_LEGENDS_004");
    		 click(driver,Legend_InputToggle);
    		 wait(driver,"1");
    		 if(!isToggleEnable(driver, Legend_Input)) {
    			 pass(driver,"'Legend toggle is deSelected when click on it");
    			 setTestCaseID("TC_LINE_LEGENDS_003");
    			 wait(driver,"1");
    			 if(IsElementEnabled(driver, LegendPosition_Input)) {
    				 fail(driver,"Legend Position Input is Accessible when the 'Legend' toggle is disabled");
    			 }else {
    				 pass(driver,"Legend Position Input is InAccessible when the 'Legend' toggle is disabled");
    			 }
    			 
    			 if(IsElementEnabled(driver, LegendFontSize_Input)) {
    				 fail(driver,"Legend FontSize Input is Accessible when the 'Legend' toggle is disabled");
    			 }else {
    				 pass(driver,"Legend FontSize Input is InAccessible when the 'Legend' toggle is disabled");
    			 }
    			 setTestCaseID("");
    			 scrollUsingElement(driver, ApplyButton);
    			 click(driver,ApplyButton);
    			 elementnotvisible1(driver, RPE_Loading);
    			 verifyElementDisplayed(driver,Chart_Section);
    			 setTestCaseID("TC_LINE_LEGENDS_004");
    			 if(!isDisplayed(driver, Legend_Chart)) {
    				 pass(driver,"Legend is not displayed in chart when it is disable");
    			 }else {
    				 fail(driver,"Legend is displayed in chart when it is disable");
    			 }
    		 }else {
    			 fail(driver,"'Legend toggle is not deSelected when click on it"); 
    		 }
    		 setTestCaseID("");
    		 click(driver,Legend_InputToggle);
    		 wait(driver,"1");
    		 if(isToggleEnable(driver, Legend_Input)) {
    			 pass(driver,"Legend Toggle is enabled when click on it ");
    			 scrollUsingElement(driver, ApplyButton);
    			 click(driver,ApplyButton);
    			 elementnotvisible1(driver, RPE_Loading);
    			 verifyElementDisplayed(driver,Chart_Section);
    			
    			 if(isDisplayed(driver, Legend_Chart)) {
    				 pass(driver,"Legend is displayed in chart when it is enabled");
    			 }else {
    				 fail(driver,"Legend is not displayed in chart when it is enabled");
    			 }
    			 setTestCaseID("TC_LINE_LEGENDS_006");
    			 if(IsElementEnabled(driver, LegendPosition_Input)) {
    				 pass(driver,"Legend Position Input is Accessible when the Legend Toggle is Enable");
    				 setTestCaseID("TC_LINE_LEGENDS_005");
    				 String defaultPosition_Legend=defaultSelectedValue(driver, LegendPosition_Input);
    				 if(DefaultLegend_Position.equals(defaultPosition_Legend)) {
    					 pass(driver,"By default, '"+DefaultLegend_Position+"' is selected in the Legend Positon input");
    				 }else {
    					 fail(driver,"By default, '"+DefaultLegend_Position+"' is not selected in the Legend Positon input");
    				 }
    				 
    				String defaultLegend_chart= getRelativePosition(driver,Legend_Chart_ValueNew,Chart_Section_Display);
    				if(defaultLegend_chart.equals(DefaultLegend_Position)) {
    					pass(driver,"By default, the legend is displayed in '"+DefaultLegend_Position+"' in the chart");
    				}else {
    					fail(driver,"By default, the legend is not displayed in '"+DefaultLegend_Position+"' in the chart");
    				}
    				setTestCaseID("TC_LINE_LEGENDS_007");
    				selectByText(driver, LegendPosition_Input, Change_LegendPositon);
    				scrollUsingElement(driver, ApplyButton);
    				click(driver,ApplyButton);
    				elementnotvisible1(driver, RPE_Loading);
    				verifyElementDisplayed(driver,Chart_Section);
    				
    				String LegendPosition_chart= getRelativePosition(driver,Legend_Chart_Value,Chart_Section_Display);
    				if(Change_LegendPositon.equals(LegendPosition_chart)) {
    					pass(driver,"Legend is displayed in selected '"+Change_LegendPositon+"' position in the chart ");
    				}else {
    					fail(driver,"Legend is not displayed in selected '"+Change_LegendPositon+"' position in the chart ");
    				}
    			 }else {
    				 fail(driver,"Legend Position Input is InAccessible when the Legend Toggle is Enable");
    			 }
    			 setTestCaseID("TC_LINE_LEGENDS_009");
    			 if(IsElementEnabled(driver, LegendFontSize_Input)) {
    				 pass(driver,"Legend FontSize Input is Accessible when the Legend Toggle is Enable");
    				 setTestCaseID("TC_LINE_LEGENDS_008");
    				 String defaultFontSize_Legend=defaultSelectedValue(driver, LegendFontSize_Input);
    				 if(Default_Legend_FontSize.equals(defaultFontSize_Legend)) {
    					 pass(driver,"By default, '"+Default_Legend_FontSize+"' is selected in the Legend Font Size input");
    				 }else {
    					 fail(driver,"By default, '"+Default_Legend_FontSize+"' is not selected in the Legend Font Size input");
    				 }
    				 
    				String defaultFontSizeLegend_chart=getFontSize(driver, Legend_Chart_Value);
    				if(Default_Legend_FontSize.equals(defaultFontSizeLegend_chart)) {
    					pass(driver,"By default, '"+Default_Legend_FontSize+"' fontsize is applied in the Legend in the chart");
    				}else {
    					fail(driver,"By default, '"+Default_Legend_FontSize+"' fontsize is not applied in the Legend in the chart");
    				}
    				setTestCaseID("TC_LINE_LEGENDS_010");
    				selectByText(driver, LegendFontSize_Input, Change_Legend_FontSize);
    				scrollUsingElement(driver, ApplyButton);
    				click(driver,ApplyButton);
    				elementnotvisible1(driver, RPE_Loading);
    				verifyElementDisplayed(driver,Chart_Section);
    				
    				String FontSizeLegend_chart=getFontSize(driver, Legend_Chart_Value);
    				if(Change_Legend_FontSize.equals(FontSizeLegend_chart)) {
    					pass(driver,"Selected'"+Change_Legend_FontSize+"' fontsize is applied in the Legend in the chart");
    				}else {
    					fail(driver,"Selected '"+Change_Legend_FontSize+"' fontsize is not applied in the Legend in the chart");
    				}
    			 }else {
    				 fail(driver,"Legend FontSize Input is InAccessible when the Legend Toggle is Enable");
    			 }
    		 }else {
    			 fail(driver,"Legend Toggle is not enabled when click on it ");
    		 }
    		 setTestCaseID("");
    		 selectByText(driver, LegendPosition_Input, "Bottom");
    		 setTestCaseID("TC_LINE_LEGENDS_011");
    		 mouseOverToElement(driver, Legend_);
    		 click(driver,Legend_);
    		 String LegendClose_Act=getAttribute1(driver, Legends_Expand, "class");
    		 if(LegendClose_Act.contains("down")) {
    			 pass(driver,"Legends gets collapsed when click on it");
    		 }else {
    			 fail(driver,"Legends not gets collapsed when click on it");
    		 }
         }
		// ******************* Legends Validation End *********************
         
         
     	// ********** Deviation Validation Start ***************
         setTestCaseID("");
         String Line_ChartFormat_Deviations= getCellValue("TestExecution","Testcase_Selection","Line_ChartFormat_Deviations",Flag);
         if(Line_ChartFormat_Deviations.equals("Yes")) {
        	 if(X_Axis_dataType.equals("Date")) {
        		 setTestCaseID("TC_LINE_DEVIATION_002");
            	 if(isDisplayed(driver,Deviation_Active)) {
            		 pass(driver,"Deviations is Accessble when 'Date' variable selected in the X axis input");
            		 
            		 setTestCaseID("TC_LINE_DEVIATION_001");
                	 verifyElementDisplayed(driver, Deviation_Input_toggle);
                	 verifyElementDisplayed(driver, Value_FontSize_Deviation);
                	 verifyElementDisplayed(driver, Label_FontSize_Deviation);
                	 verifyElementDisplayed(driver, Percentage_FontSize_Deviation);
                	 verifyElementDisplayed(driver, Deviation_FontFamily);
                	 verifyElementDisplayed(driver, Deviation_Alignment);
                	 verifyElementDisplayed(driver, Overlap_Input_toggle_deviation);
                	 verifyElementDisplayed(driver, Seperator_Input_deviation);
                	 verifyElementDisplayed(driver, BigNumber_Suffix_Inputtoggle_deviation);
                	 verifyElementDisplayed(driver, RoundOff_Input_Deviation);
                	 verifyElementDisplayed(driver, Order_Deviation);
                	 
                	 setTestCaseID("TC_LINE_DEVIATION_004");
                	 if(isToggleEnable(driver, Deviation_toggle)) {
                		 fail(driver,"By default, Deviation toggle is enabled ");
                	 }else {
                		 pass(driver,"By default, Deviation toggle is disabled");
                		 setTestCaseID("TC_LINE_DEVIATION_005");
                		 if(!isDisplayed2(driver, Deviation_Input_Area_Disable)) {
                			 fail(driver,"Input box is Accessible when the Deviation toggle is disabled");
                		 }else {
                			 pass(driver,"Input box is inaccessible when the Deviation toggle is disabled");
                		 }
                	 }
                	 
                	 setTestCaseID("TC_LINE_DEVIATION_006");
                	 click(driver,Deviation_Input_toggle);
                	 wait(driver,"1");
                	 if(isToggleEnable(driver, Deviation_toggle)) {
                		 pass(driver,"Deviation toggle is enabled when enabling it");
                	 }else {
                		 fail(driver,"Deviation toggle is not enabled when enabling it");
                	 }
                	 
                	 if(IsElementEnabled(driver, Value_FontSize_Deviation)) {
                		 pass(driver,"'Value Font Size Input' is accessible when the Deviation toggle is enabled");
                	 }else {
                		 fail(driver,"'Value Font Size Input' is not accessible when the Deviation toggle is enabled");
                	 }
                	 if(IsElementEnabled(driver, Label_FontSize_Deviation)) {
                		 pass(driver,"'Label Font Size Input' is accessible when the Deviation toggle is enabled");
                	 }else {
                		 fail(driver,"'Label Font Size Input' is not accessible when the Deviation toggle is enabled");
                	 }
                	 
                	 if(IsElementEnabled(driver, Percentage_FontSize_Deviation)) {
                		 pass(driver,"'Percentage Font Size Input' is accessible when the Deviation toggle is enabled");
                	 }else {
                		 fail(driver,"'Percentage Font Size Input' is not accessible when the Deviation toggle is enabled");
                	 }
                	 
                	 if(IsElementEnabled(driver, Deviation_FontFamily)) {
                		 pass(driver,"'Deviation Font Family Input' is accessible when the Deviation toggle is enabled");
                	 }else {
                		 fail(driver,"'Deviation Font Family Input' is not accessible when the Deviation toggle is enabled");
                	 }
                	 
                	 if(IsElementEnabled(driver, Deviation_Alignment)) {
                		 pass(driver,"'Deviation Alignment Input' is accessible when the Deviation toggle is enabled");
                	 }else {
                		 fail(driver,"'Deviation Alignment Input' is not accessible when the Deviation toggle is enabled");
                	 }
                	 
                	 if(IsElementEnabled(driver, Overlap_toggle_deviation)) {
                		 pass(driver,"'Overlap Input toggle' is accessible when the Deviation toggle is enabled");
                	 }else {
                		 fail(driver,"'Overlap Input toggle' is not accessible when the Deviation toggle is enabled");
                	 }
                	 
                	 if(IsElementEnabled(driver, Seperator_Input_deviation)) {
                		 pass(driver,"'Seperator Input' is accessible when the Deviation toggle is enabled");
                	 }else {
                		 fail(driver,"'Seperator Input' is not accessible when the Deviation toggle is enabled");
                	 }
                	 
                	 if(IsElementEnabled(driver, BigNumber_Suffix_toggle_deviation)) {
                		 pass(driver,"'Bignumber suffix Input toggle' is accessible when the Deviation toggle is enabled");
                	 }else {
                		 fail(driver,"'Bignumber suffix Input toggle' is not accessible when the Deviation toggle is enabled");
                	 }
                	 
                	 if(IsElementEnabled(driver, RoundOff_Input_Deviation)) {
                		 pass(driver,"'RoundOff Input' is accessible when the Deviation toggle is enabled");
                	 }else {
                		 fail(driver,"'RoundOff Input' is not accessible when the Deviation toggle is enabled");
                	 }
                	 
                	 if(IsElementEnabled(driver, Order_Deviation)) {
                		 pass(driver,"'Order Input' is accessible when the Deviation toggle is enabled");
                	 }else {
                		 fail(driver,"'Order Input' is not accessible when the Deviation toggle is enabled");
                	 }
                	 
                	 setTestCaseID("TC_LINE_DEVIATION_007");
                	 if(isDisplayed(driver,Selected_deviations)) {
                		 pass(driver,"Inputs are displayed in the input box when the Deviation toggle is enabled");
                	 }else {
                		 fail(driver,"Inputs are not displayed in the input box when the Deviation toggle is enabled"); 
                	 }
                	 setTestCaseID("");
                	 scrollUsingElement(driver, ApplyButton);
        			 click(driver,ApplyButton);
        			 elementnotvisible1(driver, RPE_Loading);
        			 verifyElementDisplayed(driver,Chart_Section);
                	 if(isDisplayed(driver, Deviation_Chart)) {
                		 setTestCaseID("TC_LINE_DEVIATION_008");
                		 boolean chartValuePositionAct=validateElementPosition2(driver,LineChart_Area,Deviation_Chart,"outside");
          	   			 if(chartValuePositionAct==true) {
          	   				 pass(driver,"Deviation is displayed in the top of the Chart area"); 
          	   			 }else {
          	   				 fail(driver,"Deviation is not displayed in the top of the Chart area"); 
          	   			 }
          	   			 
          	   			 setTestCaseID("TC_LINE_DEVIATION_009");
          	   			 if(isDisplayed2(driver, Deviation_LastValue)) {
          	   				 boolean chartValuePositionAct1=validateElementPosition2(driver,LineChart_Area,Deviation_LastValue,"outside");
          	   				 if(chartValuePositionAct1==true) {
          	   					 pass(driver,"Deviation LastValue is displayed in the top of the Chart area"); 
          	   				 }else {
          	   					 fail(driver,"Deviation LastValue is not displayed in the top of the Chart area"); 
          	   				 }
          	   			 }
          	   			 
          	   			 List<WebElement> deviationValues=getWebElements(driver, Deviation_Values);
          	   			 int lastdeviation=deviationValues.size()-1;
          	   			 String deviationLastValue=deviationValues.get(lastdeviation).getText();
          	   			 double deviationLast=Double.parseDouble(deviationLastValue);
          	   			 String deviationLastBeforeValue=deviationValues.get(lastdeviation-1).getText();
          	   			 double deviationLastBefore=Double.parseDouble(deviationLastBeforeValue);

          	   			 List<WebElement> percentValues=getWebElements(driver, Deviation_PercentageValue);
          	   			 int percentLastSize=percentValues.size()-1;
          	   			 WebElement percentLast=percentValues.get(percentLastSize);
          	   			 String percentColor=percentLast.getCssValue("color");
          	   			 percentColor=rgbToHex(percentColor);
          	   			 
          	   			 System.out.println("percentColor : "+percentColor);
          	   			 if(deviationLast>deviationLastBefore) {
          	   				 setTestCaseID("TC_LINE_DEVIATION_010");
          	   				 if(percentColor.equalsIgnoreCase("#00FF00")) {
          	   					 pass(driver,"Growth arrow is up and green color when last value is greater than previous value");
          	   				 }else {
          	   					 fail(driver,"Growth arrow is not up and not green color when last value is greater than previous value"); 
          	   				 }
          	   			 }else if (deviationLast<deviationLastBefore) {
          	   				 setTestCaseID("TC_LINE_DEVIATION_011");
    	      	   			 if(percentColor.equalsIgnoreCase("#FF0000")) {
    	  	   					 pass(driver,"Growth arrow is down and red color when last value is less than previous value");
    	  	   				 }else {
    	  	   					 fail(driver,"Growth arrow is not down and not red color when last value is less than previous value"); 
    	  	   				 }
          	   			 }else {
          	   				 setTestCaseID("TC_LINE_DEVIATION_012");
          	   				 if(percentColor.equalsIgnoreCase("#ffb000") || percentColor.equalsIgnoreCase("yellow")) {
    	 	   					 pass(driver,"Growth arrow is netural and yellow color when last value is equal to previous value");
    	 	   				 }else {
    	 	   					 fail(driver,"Growth arrow is not netural and not yellow color when last value is equalt to previous value"); 
    	 	   				 }
          	   			 }
          	   			 
          	   			 setTestCaseID("TC_LINE_DEVIATION_013");
          	   			 String defaultValueFontSize_dev_Act=defaultSelectedValue(driver, Value_FontSize_Deviation);
          	   			 if(defaultValueFontSize_dev_Act.equals(Default_Value_FontSize_Deviation)) {
          	   				 pass(driver,"By default, '"+Default_Value_FontSize_Deviation+"' is selected in the Value Font Size Input");
          	   			 }else {
          	   				 fail(driver,"By default, '"+Default_Value_FontSize_Deviation+"' is not selected in the Value Font Size Input, Act : "+defaultValueFontSize_dev_Act);
          	   			 }
          	   			 
          	   			 setTestCaseID("TC_LINE_DEVIATION_014");
          	   			 selectByText(driver, Value_FontSize_Deviation, Change_Value_FontSize_Deviation);
          	   			 scrollUsingElement(driver, ApplyButton);
          	   			 click(driver,ApplyButton);
          	   			 elementnotvisible1(driver, RPE_Loading);
          	   			 verifyElementDisplayed(driver,Chart_Section);
          	   			 
          	   			 setTestCaseID("TC_LINE_DEVIATION_015");
          	   			 String Value_Chart_FontSize=getFontSize(driver, Deviation_Values);
          	   			 if(Value_Chart_FontSize.equals(Change_Value_FontSize_Deviation)) {
          	   				 pass(driver,"Selected Fontsize "+Change_Value_FontSize_Deviation+" is applied in the Value in the chart");
          	   			 }else {
          	   				 fail(driver,"Selected Fontsize "+Change_Value_FontSize_Deviation+" is not applied in the Value in the chart");
          	   			 }
          	   			 
          	   			 setTestCaseID("TC_LINE_DEVIATION_016");
          	   			 String defaultPercentFontSize_dev_Act=defaultSelectedValue(driver, Percentage_FontSize_Deviation);
          	   			 if(defaultPercentFontSize_dev_Act.equals(Default_Percentage_FontSize_Deviation)) {
          	   				 pass(driver,"By default, '"+Default_Percentage_FontSize_Deviation+"' is selected in the Percentage Font Size Input");
          	   			 }else {
          	   				 fail(driver,"By default, '"+Default_Percentage_FontSize_Deviation+"' is not selected in the Percentage Font Size Input, Act : "+defaultPercentFontSize_dev_Act);
          	   			 }
          	   			 
          	   			 setTestCaseID("TC_LINE_DEVIATION_017");
          	   			 selectByText(driver, Percentage_FontSize_Deviation, Change_Percentage_FontSize_Deviation);
          	   			 scrollUsingElement(driver, ApplyButton);
          	   			 click(driver,ApplyButton);
          	   			 elementnotvisible1(driver, RPE_Loading);
          	   			 verifyElementDisplayed(driver,Chart_Section);
     	   			 
          	   			 setTestCaseID("TC_LINE_DEVIATION_018");
          	   			 String Percentage_Chart_FontSize=getFontSize(driver, Deviation_PercentageValue);
          	   			 if(Percentage_Chart_FontSize.equals(Change_Percentage_FontSize_Deviation)) {
          	   				 pass(driver,"Selected Fontsize "+Change_Percentage_FontSize_Deviation+" is applied in the Percentage Value in the chart");
          	   			 }else {
          	   				 fail(driver,"Selected Fontsize "+Change_Percentage_FontSize_Deviation+" is not applied in the Percentage Value in the chart");
          	   			 }
          	   			 
          	   			
          	   			 setTestCaseID("TC_LINE_DEVIATION_019");
          	   			 String defaultLabelFontSize_dev_Act=defaultSelectedValue(driver, Label_FontSize_Deviation);
          	   			 if(defaultLabelFontSize_dev_Act.equals(Default_Label_FontSize_Deviation)) {
          	   				 pass(driver,"By default, '"+Default_Label_FontSize_Deviation+"' is selected in the Label Font Size Input");
          	   			 }else {
          	   				 fail(driver,"By default, '"+Default_Label_FontSize_Deviation+"' is not selected in the Label Font Size Input, Act : "+defaultLabelFontSize_dev_Act);
          	   			 }
          	   			 
          	   			 setTestCaseID("TC_LINE_DEVIATION_020");
          	   			 selectByText(driver, Label_FontSize_Deviation, Change_Label_FontSize_Deviation);
          	   			 scrollUsingElement(driver, ApplyButton);
          	   			 click(driver,ApplyButton);
          	   			 elementnotvisible1(driver, RPE_Loading);
          	   			 verifyElementDisplayed(driver,Chart_Section);
     	   			 
          	   			 setTestCaseID("TC_LINE_DEVIATION_021");
          	   			 String Label_Chart_FontSize=getFontSize(driver, Deviation_LabelValue);
          	   			 if(Label_Chart_FontSize.equals(Change_Label_FontSize_Deviation)) {
          	   				 pass(driver,"Selected Fontsize "+Change_Label_FontSize_Deviation+" is applied in the Label Value in the chart");
          	   			 }else {
          	   				 fail(driver,"Selected Fontsize "+Change_Label_FontSize_Deviation+" is not applied in the Label Value in the chart");
          	   			 }
          	   			 
          	   			 setTestCaseID("TC_LINE_DEVIATION_022");
          	   			 String defaultFontFamily_Dev_Act=getText1(driver, Deviation_FontFamily);
          	   			 if(Default_FontFamily_Deviation.equals(defaultFontFamily_Dev_Act)) {
          	   				 pass(driver,"By default, "+Default_FontFamily_Deviation+" is Selected in the Font Family Input");
          	   			 }else {
          	   				 fail(driver,"By default, "+Default_FontFamily_Deviation+" is not Selected in the Font Family Input");
          	   			 }
          	   			 
          	   			 setTestCaseID("TC_LINE_DEVIATION_023");
          	   			 mouseOverAndClick(driver, Deviation_FontFamily);
          	   			 waitForElement(driver, Devialtion_FontFamilyResults);
          	   			 selectFontFamily(driver,Change_FontFamily_Deviation);
          	   			 wait(driver,"1");
          	   			 scrollUsingElement(driver, ApplyButton);
          	   			 click(driver,ApplyButton);
          	   			 elementnotvisible1(driver, RPE_Loading);
          	   			 verifyElementDisplayed(driver,Chart_Section);
          	   			 
          	   			 setTestCaseID("TC_LINE_DEVIATION_024");
          	   			 String Deviation_Chart_FontFamily_Act=getFontFamily(driver, Deviation_FontFamilyChart);
          	   			 if(Deviation_Chart_FontFamily_Act.equals(Change_FontFamily_Deviation)) {
          	   				 pass(driver,"Selected Font Family "+Change_FontFamily_Deviation+" applied in the deviation in the chart");
          	   			 }else {
          	   				 fail(driver,"Selected Font Family "+Change_FontFamily_Deviation+" not applied in the deviation in the chart");
          	   			 }
          	   			 
          	   			 setTestCaseID("TC_LINE_DEVIATION_025");
          	   			 String defaultAlignment_Act=getAttribute1(driver, DefaultAlignment_dev, "data-align");
          	   			 if(Default_Alignment_Deviation.equals(defaultAlignment_Act)) {
          	   				 pass(driver,"By default, "+Default_Alignment_Deviation+" is selected in the Alignment Input");
    	      	   			 String defaultAlignment_Chart_Act=getAlignment(driver,Deviation_FontFamilyChart);
    	      	   			 if(defaultAlignment_Chart_Act.equals(Default_Alignment_Deviation)) {
    	      	   				 pass(driver,"By default, Deviation Value aligned in "+Default_Alignment_Deviation+" in chart");
    	      	   			 }else {
    	      	   				 fail(driver,"By default, Deviation Value not aligned in "+Default_Alignment_Deviation+" in chart");
    	      	   			 }
          	   			 }else {
          	   				 fail(driver,"By default, "+Default_Alignment_Deviation+" is not selected in the Alignment Input, Act : "+defaultAlignment_Act);
          	   			 }
          	   			 
          	   			 setTestCaseID("TC_LINE_DEVIATION_026");
          	   			 if(IsElementEnabled(driver, Deviation_Alignment_Left)) {
          	   				 pass(driver,"Left Alignment Option is Accessible");
          	   				 click(driver,Deviation_Alignment_Left);
    	      	   			 scrollUsingElement(driver, ApplyButton);
    	     	   			 click(driver,ApplyButton);
    	     	   			 elementnotvisible1(driver, RPE_Loading);
    	     	   			 verifyElementDisplayed(driver,Chart_Section);
    	     	   			 String Alignment_Chart_Act=getAlignment(driver,Deviation_FontFamilyChart);
    	      	   			 if(Alignment_Chart_Act.equals("left")) {
    	      	   				 pass(driver,"Deviation Value aligned in left in the chart when select the Left Alignmnet");
    	      	   			 }else {
    	      	   				 fail(driver,"Deviation Value not aligned in left in the chart when select the Left Alignment");
    	      	   			 }
          	   				 
          	   			 }else {
          	   				 fail(driver,"Left Alignment Option is not Accessible");
          	   			 }
    	      	   		 if(IsElementEnabled(driver, Deviation_Alignment_Right)) {
    	  	   				 pass(driver,"Right Alignment Option is Accessible");
    	  	   				 click(driver,Deviation_Alignment_Right);
    	      	   			 scrollUsingElement(driver, ApplyButton);
    	     	   			 click(driver,ApplyButton);
    	     	   			 elementnotvisible1(driver, RPE_Loading);
    	     	   			 waitForElement(driver,Chart_Section);
    	     	   			 String Alignment_Chart_Act=getAlignment(driver,Deviation_FontFamilyChart);
    	      	   			 if(Alignment_Chart_Act.equals("right")) {
    	      	   				 pass(driver,"Deviation Value aligned in right in the chart when select the Right Alignmnet");
    	      	   			 }else {
    	      	   				 fail(driver,"Deviation Value not aligned in right in the chart when select the Right Alignment");
    	      	   			 }
    	  	   				 
    	  	   			 }else {
    	  	   				 fail(driver,"Right Alignment Option is not Accessible");
    	  	   			 }
          	   			 
    	      	   		 
    	      	   		 setTestCaseID("TC_LINE_DEVIATION_027");
    	      	   		 if(!isToggleEnable(driver, Overlap_toggle_deviation)) {
    	      	   			 pass(driver,"By default, Overlap toggle is disabled");
    	      	   		 }else {
    	      	   			 fail(driver,"By default, Overlap toggle is enabled");
    	      	   		 }
    	      	   		 
    	      	   		 setTestCaseID("TC_LINE_DEVIATION_028");
    	      	   		 if(isToggleAccessible(driver, Overlap_toggle_deviation)) {
    	      	   			 pass(driver,"Overlap toggle is Accessible");
    	      	   		 }else {
    	      	   			 fail(driver,"Overlap toggle is not Accessible");
    	      	   		 }
          	   			 
    	      	   		 setTestCaseID("TC_LINE_DEVIATION_029");
    	      	   		 click(driver,Overlap_Input_toggle_deviation);
    	      	   		 wait(driver,"1");
    	      	   		 if(isToggleEnable(driver, Overlap_toggle_deviation)){
    	      	   			 pass(driver,"Overlap toggle is enabled when enabling it");
    	      	   			 scrollUsingElement(driver, ApplyButton);
    	      	   			 click(driver,ApplyButton);
    	      	   			 elementnotvisible1(driver, RPE_Loading);
    	      	   			 waitForElement(driver,Chart_Section);
    	      	   			 
    	      	   			 boolean chartValuePositionAct2=validateElementPosition2(driver,LineChart_Area,Deviation_Chart,"inside");
    	      	   			 if(chartValuePositionAct2==true) {
    	      	   				 pass(driver,"Deviation is Overlaped in the chart when the toggle is enabled"); 
    	      	   			 }else {
    	      	   				 fail(driver,"Deviation is not Overlaped in the chart when the toggle is enabled"); 
    	      	   			 }
    	      	   			 
    	      	   		 }else {
    	      	   			 fail(driver,"Overlap toggle is not enabled when enabling it");
    	      	   		 }
    	      	   		 
    	      	   		 setTestCaseID("TC_LINE_DEVIATION_030");
    	      	   		 click(driver,Overlap_Input_toggle_deviation);
    	      	   		 wait(driver,"1");
    	      	   		 if(!isToggleEnable(driver, Overlap_toggle_deviation)){
    	      	   			 pass(driver,"Overlap toggle is disabled when disabling it");
    	      	   		 }else {
    	      	   			 fail(driver,"Overlap toggle is not disabled when disabling it"); 
    	      	   		 }
    	      	   		 
    	      	   		 setTestCaseID("TC_LINE_DEVIATION_034");
    	      	   		 if(IsElementEnabled(driver, Seperator_Input_deviation)) {
    	      	   			 pass(driver,"Seperator Input is Accessible");
    	      	   		 }else {
    	      	   			 fail(driver,"Seperator Input is not Accessible");
    	      	   		 }
    	      	   		 
    	      	   		 setTestCaseID("TC_LINE_DEVIATION_035");
    	      	   		 selectByText(driver, Seperator_Input_deviation, Change_Seperator_Deviation);
    	      	   		 scrollUsingElement(driver, ApplyButton);
    	      	   		 click(driver,ApplyButton);
    	      	   		 elementnotvisible1(driver, RPE_Loading);
    	      	   		 waitForElement(driver,Chart_Section);
    	      	   		 
    	      	   		 String DeviationChartValueTextAct= getText1(driver,Deviation_Values);
    		    		 if((!DeviationChartValueTextAct.contains(".") && DeviationChartValueTextAct.length()>3)||(DeviationChartValueTextAct.length()>8)) {
    		    			 String ValueSeperatorFormat=SeperatorValidationTable(DeviationChartValueTextAct);
    		    	    		if(ValueSeperatorFormat.equals(Change_Seperator_Deviation)) {
    		    	    	  		 pass(driver,"selected seperator "+Change_Seperator_Deviation+" gets applied for Deviation values"); 
    		    	    		}else {
    		    	    	  		 fail(driver,"Selected seperator "+Change_Seperator_Deviation+" not applied for Deviation values"); 
    		    	    		}
    					  }
    		    		
    		    		 setTestCaseID("TC_LINE_DEVIATION_031");
    		    		 if(isDisplayed(driver,BigNumber_Toggle_Disabled)) {
    		    			 pass(driver,"BigNumber Suffix toggle is not accessible when seperator is selected");
    		    		 }else {
    		    			 fail(driver,"BigNumber Suffix toggle is accessible when seperator is selected");
    		    		 }
    		    		 
    		    		 setTestCaseID("TC_LINE_DEVIATION_032");
    		    		 selectByText(driver, Seperator_Input_deviation, "Select");
    		    		 wait(driver,"1");
    		    		 if(isToggleAccessible(driver, BigNumber_Suffix_toggle_deviation)) {
    		    			 pass(driver,"BigNumber Suffix toggle is accessible when seperator is not selected");
    		    		 }else {
    		    			 fail(driver,"BigNumber Suffix toggle is not accessible when seperator is not selected");
    		    		 }
    		    		 
    		    		 setTestCaseID("TC_LINE_DEVIATION_033");
    		    		 click(driver,BigNumber_Suffix_Inputtoggle_deviation);
    		    		 wait(driver,"1");
    		    		 if(isToggleEnable(driver, BigNumber_Suffix_toggle_deviation)) {
    		    			 pass(driver,"BigNumber Suffix toggle is enabled when enabling it");
    		    		 }else {
    		    			 fail(driver,"BigNumber Suffix toggle is not enabled when enabling it");
    		    		 }
    		    		 scrollUsingElement(driver, ApplyButton);
    	      	   		 click(driver,ApplyButton);
    	      	   		 elementnotvisible1(driver, RPE_Loading);
    	      	   		 waitForElement(driver,Chart_Section);
    	      	   		 
    	      	   		 String DeviationChartValueTextAct1= getText1(driver,Deviation_Values);
    	      	   		 if((!DeviationChartValueTextAct1.contains(".") && DeviationChartValueTextAct1.length()>3)||(DeviationChartValueTextAct1.length()>8)) {
    	      	   			 if(DeviationChartValueTextAct1.endsWith("k")||DeviationChartValueTextAct1.endsWith("K")) {
    	    	    	  		 pass(driver,"BigNumber Suffix gets applied for Deviation values when the toggle is enabled"); 
    	      	   			 }else {
    	    	    	  		 fail(driver,"BigNumber Suffix not applied for Deviation values when the toggle is enabled"); 
    	      	   			 }
    	      	   		 }
    		    		 
    	      	   		 setTestCaseID("");
    	      	   		 click(driver,BigNumber_Suffix_Inputtoggle_deviation);
    	      	   		 wait(driver,"1");
    	      	   		 if(!isToggleEnable(driver, BigNumber_Suffix_toggle_deviation)) {
    	      	   			 pass(driver,"BigNumber Suffix toggle is disabled when disabling it");
    	      	   		 }else {
    	      	   			 fail(driver,"BigNumber Suffix toggle is not disabled when disabling it");
    	      	   		 }
    		    		 
    	      	   		 setTestCaseID("TC_LINE_DEVIATION_037");
    		      	   	 selectByText(driver, RoundOff_Input_Deviation, Change_RoundOff_Deviation);
    		      	     scrollUsingElement(driver, ApplyButton);
    	      	   		 click(driver,ApplyButton);
    	      	   		 elementnotvisible1(driver, RPE_Loading);
    	      	   		 waitForElement(driver,Chart_Section);
    	      	   		 
    	      	   		 String DeviationChartValueAct=getText1(driver,Deviation_Values);    
    	      	   		 String RoundOffValue_Act=String.valueOf(getRoundOffValue(DeviationChartValueAct));
    	      	   		 if(RoundOffValue_Act.equals(Change_RoundOff_Deviation)) {
    	      	   			 pass(driver,"Selected roundOff '"+Change_RoundOff_Deviation+"' is Applied in the Deviation chart Value"); 
    	      	   		 }else {
    	      	   			 fail(driver,"Selected roundOff '"+Change_RoundOff_Deviation+"' is not Applied in the Deviation chart Value"); 
    	      	   		 }
    	      	   		 
    	      	   		 setTestCaseID("TC_LINE_DEVIATION_038");
    	      	   		 if(isDisplayed(driver, Order_Value)) {
    	      	   			 pass(driver,"Value is Displayed in the Order input");
    	      	   		 }else {
    	      	   			 fail(driver,"Value is not Displayed in the Order Input");
    	      	   		 }
    	      	   		 
    		      	   	 if(isDisplayed(driver, Order_Label)) {
    	      	   			 pass(driver,"Label is Displayed in the Order input");
    	      	   		 }else {
    	      	   			 fail(driver,"Label is not Displayed in the Order Input");
    	      	   		 }
    	      	   		 
    		      	   	 setTestCaseID("TC_LINE_DEVIATION_039");
    		      	   	 WebElement OrderElement=getWebElement(driver, Order_Deviation1);
    		      	     elementScreenShot_new(driver,Order_Deviation,"/Expected_screenshot/SmokeTesting/Order_Deviation");
    		 	         action.moveToElement(OrderElement).clickAndHold().build().perform();
    		 	         action.moveByOffset(0, 20).build().perform();
    		 	         action.release().build().perform();
    		 	         wait(driver,"1");
    		 			 elementScreenShot_new(driver,Order_Deviation,"/Actual_screenshot/SmokeTesting/Order_Deviation");

    		 	         try {
    		 	        	boolean orderDiff=imageComparison2(driver, "/SmokeTesting/Order_Deviation", "/SmokeTesting/Order_Deviation");
    		 				wait(driver, "2");
    		 				if(orderDiff==false) {
    		 					pass(driver,"Order is changed in the Order Input when dragging the values");
    		 				}else {
    		 					fail(driver,"Order is not changed in the Order Input when dragging the values");
    		 				}
    		 			 } catch (Exception e1) {
    		 				fail(driver,"Unable to compare the Order Input images");
    		 			 }
                	 }else {
                		 setTestCaseID("TC_LINE_DEVIATION_008");
                		 fail(driver,"Deviation not displayed in the chart when the toggle is enabled"); 
                	 }
                	
                	 setTestCaseID("TC_LINE_DEVIATION_040");
    	    		 mouseOverToElement(driver, Deviations_Section);
    	    		 click(driver,Deviations_Section);
    	    		 String DeviationClose_Act=getAttribute1(driver, Deviation_Expand, "class");
    	    		 if(DeviationClose_Act.contains("down")) {
    	    			 pass(driver,"Deviation gets collapsed when click on it");
    	    		 }else {
    	    			 fail(driver,"Deviation not gets collapsed when click on it");
    	    		 }
            	 }else {
            		 fail(driver,"Deviations is not Accessble when 'Date' variable selected in the X axis input");
            	 }
             }else {
            	 setTestCaseID("TC_LINE_DEVIATION_003");
            	 if(isDisplayed(driver,Deviation_Active)) {
            		 fail(driver,"Deviations is Accessble when Other than 'Date' variable selected in the X axis input");
            	 }else {
            		 pass(driver,"Deviations is not Accessble when Other than 'Date' variable selected in the X axis input");
            	 }
             }
         }
         
         // ******************* Others Validation Start *********************
		 String Line_ChartFormat_Others= getCellValue("TestExecution","Testcase_Selection","Line_ChartFormat_Others",Flag);
         if(Line_ChartFormat_Others.equals("Yes")) {
        	 setTestCaseID("");
        	 verifyElementDisplayed(driver,ChartFormat_Others);
    		 scrollUsingElement(driver,ChartFormat_Others);
    		 String OthersExpand=getAttribute1(driver, ChartFormat_OthersExpand, "class");
    		 if(OthersExpand.contains("up")) {
    			pass(driver,"By default, 'Others' gets Expanded");
    		 }else {
    			fail(driver,"By default, 'Others' not gets Expand");
    		 }
    		 
    		 setTestCaseID("TC_LINE_OTHERS_001");
    		 verifyElementDisplayed(driver,StatsLine_text);
    		 verifyElementIsPresent1(driver, StatsLine_Input);
    		 
    		 verifyElementDisplayed(driver,statsLinePosition_text);
    		 verifyElementIsPresent1(driver, statsLinePosition_Input);
    	
    		 verifyElementDisplayed(driver,statsLineRoundOffText);
    		 verifyElementIsPresent1(driver, statsLineRoundOff_Input);
    		
    		 verifyElementDisplayed(driver,Cursor_text);
    		 verifyElementIsPresent1(driver, Cursor_Input);
    		
    		 verifyElementDisplayed(driver,Export_text);
    		 verifyElementIsPresent1(driver, Export_Input);
    		 
    		 setTestCaseID("TC_LINE_OTHERS_002");
    		 String default_StatslineValueAct=defaultSelectedValue(driver, StatsLine_Input);
      		 if(default_StatslineValueExp.equals(default_StatslineValueAct)) {
    	  		pass(driver,"By default, '"+default_StatslineValueExp+"' is selected in the StatusLine Input"); 
    	  		if(isToggleAccessible(driver,statsLinePosition_Input)) {
    		  		 fail(driver,"'statsLinePosition Input' is accessible when no selection is made in the stats line field"); 
    			}else {
    		  		 pass(driver,"'statsLinePosition Input' is Inaccessible when no selection is made in the stats line field"); 
    			}
    	 		
    	 		if(isToggleAccessible(driver,statsLineRoundOff_Input)) {		
    		  		 fail(driver,"'statsLineRoundOff Input' is accessible when no selection is made in the stats line field"); 
    			}else {
    		  		 pass(driver,"'statsLineRoundOff Input' is Inaccessible when no selection is made in the stats line field"); 
    			}
    	 		
    	 		if(isDisplayed2(driver, statsLineColorInput)) {
    		  		 fail(driver,"'StatsLineColor Input' is displayed without enable stats line"); 
    	 		}else {
    		  		 pass(driver,"'StatsLineColor Input' is not displayed without enable stats line"); 
    	 		}
    	 		
      		 }else {
    	  		 fail(driver,"By default, '"+default_StatslineValueExp+"' is not selected in the StatusLine Input"); 
      		 }
      		 
      		 setTestCaseID("TC_LINE_OTHERS_003");
      		 if(IsElementEnabled(driver, StatsLine_Input)) {
      			 pass(driver,"StatusLine Input is Accessible");
      		 }else {
      			fail(driver,"StatusLine Input is not Accessible");
      		 }
      		 
      		 click(driver,StatsLine_Input);
      		 selectOptionValue(driver,StatsLine_Input,"q1");
      		 setTestCaseID("");
      		 verifyElementIsPresent1(driver, StatsLineColumnInput);
      		 String Default_StatsLineColumnValue=defaultSelectedValue(driver, StatsLineColumnInput);
      		 if(Default_StatsLineColumnValue.equals("Select")) {
      			 pass(driver,"By default, 'Select' is displayed in the StatsLine Column Input");
      		 }else {
      			fail(driver,"By default, 'Select' is not displayed in the StatsLine Column Input");
      		 }
      		
      		 scrollUsingElement(driver, ApplyButton);
      		 click(driver,ApplyButton);
      		 setTestCaseID("TC_LINE_OTHERS_004");
      		 if(isDisplayed(driver,StatsLineColumn_Error)) {
	  			pass(driver,"'Kindly select column to perform stats line' error displayed when statsLine Column input not given");
      		 }else {
	  			fail(driver,"'Kindly select column to perform stats line' error not displayed when statsLine Column input not given");
      		 }
      		 setTestCaseID("TC_LINE_OTHERS_005");
      		 if(isToggleAccessible(driver, StatsLineColumnInput)) {
	  	    	pass(driver,"StatsLine Column Input is Accessible");
      		 }else {
	  	    	fail(driver,"StatsLine Column Input is not Accessible");
      		 }
      		 
      		 setTestCaseID("TC_LINE_OTHERS_006");
      		 click(driver,statsLineCOlumn_Select_Input);
      		 boolean stastsLineOption=true;
      		 List<WebElement> statsLineColumnAvailable=getWebElements(driver, StatsLineColumnOptionsDisplayed);
      		 int statsLineColumnAvailableSize=statsLineColumnAvailable.size()-1;
      		 if(statsLineColumnAvailableSize==3) {
      			 for(WebElement statsLineColumn:statsLineColumnAvailable) {
      				 String statsLineColumnText=statsLineColumn.getText();
      				 if(!statsLineColumnText.equals("Select")) {
      					 if(statsLineColumnText.equals(Select_Y_Axis_Value1) || statsLineColumnText.equals(Select_Y_Axis_Value2) || statsLineColumnText.equals(Select_Y_Axis_Value3)) {
  	  	    			
      					 }else {
      						 stastsLineOption=false;
      					 }
      				 }
      			 }
  	  	    
      			 if(stastsLineOption==false) {
      				 fail(driver,"Other than Y axis selected columns value displayed in statsline column field");
      			 }else {
      				 pass(driver,"Y axis selected columns only displayed in statsline column field");
      			 }
      		 }else {
      			 fail(driver,"StasLine Column options Count mistmatched with selected Y axis Count");
      		 }
      		 setTestCaseID("TC_LINE_OTHERS_007");
      		 selectOptionValue(driver,StatsLineColumnInput,SelectStatsLine_Column);
	  	    
      		 click(driver,StatsLine_Input);
      		 String[] statLineValue= {"q1","q3","mean","median","std deviation","min","max"};
      		 for(int i=0;i<statLineValue.length;i++) {
    	  	  	try {
    	  	  		selectOptionValue(driver,StatsLine_Input,statLineValue[i]);
    	  	  		wait(driver,"1");
    	  	  		String selectedStatsLine=getTextJavascript(driver, StatsLine_Input);
    	  	  		scrollUsingElement(driver, ApplyButton);
    	  	  		click(driver,ApplyButton);
    	  	  		elementnotvisible1(driver, RPE_Loading);
    	  	  		verifyElementDisplayed(driver,Chart_Section);
    			
    	  	  		if(isDisplayed(driver,StatsLine_Chart)) {
    	  	  			pass(driver,"StatsLine is displayed in the chart for the Condition : "+selectedStatsLine);
    	  	  		}else {
    	  	  			fail(driver,"StatsLine is not displayed in the chart for the Condition : "+selectedStatsLine);
    	  	  		}
      			} catch (Exception e1) {
      				
      			}
      		 }
      		 
      		 setTestCaseID("");
      		 selectOptionValue(driver,StatsLine_Input,"custom");
      		 if(isDisplayed(driver,StatsLine_NumInput)) {
      			pass(driver,"StatsLine Number Input is displayed when select the 'Custom' Value ");
      			scrollUsingElement(driver, ApplyButton);
      	  		click(driver,ApplyButton);
      	  		if(isDisplayed(driver,StatsLine_Error)) {
      	  			pass(driver,"'Kindly enter custom value for stats line' error displayed when input not given");
      	  		}else {
      	  			fail(driver,"'Kindly enter custom value for stats line' error not displayed when input not given");
      	  		}
      	  		
      	  		sendKeys(driver,StatsLine_NumInput,Custom_StatsLine_Input);
      	  		scrollUsingElement(driver, ApplyButton);
    	  		click(driver,ApplyButton);
    	  		elementnotvisible1(driver, RPE_Loading);
    	  		verifyElementDisplayed(driver,Chart_Section);
    	  		
    	  		if(isDisplayed(driver,StatsLine_Chart)) {
      	  			pass(driver,"StatsLine is displayed in the chart for the Custom Condition ");
      	  		}else {
      	  			fail(driver,"StatsLine is not displayed in the chart for the Custom Condition");
      	  		}
      	  		
      		 }else {
      			fail(driver,"StatsLine Number Input is not displayed when select the 'Custom' Value ");
      		 }
      		 
      		 if(isToggleAccessible(driver,statsLineRoundOff_Input)) {		
    	  		 fail(driver,"'statsLineRoundOff Input' is accessible when 'Custom' is selected in the stats line field"); 
      		 }else {
    	  		 pass(driver,"'statsLineRoundOff Input' is InAccessible when 'Custom' is selected in the stats line field"); 
      		 }
     		
      		 selectOptionValue(driver,StatsLine_Input,"q3");
      		 scrollUsingElement(driver, ApplyButton);
      		 click(driver,ApplyButton);
      		 elementnotvisible1(driver, RPE_Loading);
      		
      		 setTestCaseID("TC_LINE_OTHERS_013");
      		 if(isDisplayed(driver, statsLineColorInput)) {
    	  		 pass(driver,"'StatsLineColor Input' is displayed when selecting the StatsLine Value"); 
    	  		setTestCaseID("TC_LINE_OTHERS_014");
    	  		 String defaultStatsLineColor_Act=getTextJavascript(driver, statsLineColorInput);
    	  		 if(defaultStatsLineColor_Exp.equals(defaultStatsLineColor_Act)) {
    		  		 pass(driver,"By default, '"+defaultStatsLineColor_Exp+"' color is display in StatsLine Color Input"); 
    	  		 }else {
    		  		 fail(driver,"By default, '"+defaultStatsLineColor_Exp+"' color is not display in StatsLine Color Input"); 
    	  		 }
    	  		 setTestCaseID("");
    	  		 click(driver,statsLineColorInput);
    	  		 if(isDisplayed(driver, ColorPickerOpen)) {  
    	  			 scrollUsingElement(driver, ColorPickerOpen);
    		  		 pass(driver,"Stats line color is accessible and color picker get opened"); 
    		  		 click(driver,statsLineColor_text);
    		  		 wait(driver,"1");
    		  		 if(isDisplayed2(driver,ColorPickerOpen)) {
    		  			 fail(driver, "Color picker not Closed when click outside the color input");
    		  		 }else {
    		  			 pass(driver, "Color picker Closed when click outside the color input");
    		  		 }
    		  		 
    	  		 }else {
    		  		 fail(driver,"Stats line color is not accessible and color picker not opened"); 
    	  		 }
    	  		 doubleClick(driver,statsLineColorInput);
    	  		 action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
    	  		 sendKeys(driver,statsLineColorInput,ChangeStatsLine_Color);
    	  		 wait(driver,"1");
    	  		 scrollUsingElement(driver, ApplyButton);
    	  		 click(driver,ApplyButton);
    	  		 elementnotvisible1(driver, RPE_Loading);
    	  		 verifyElementDisplayed(driver,Chart_Section);
    	  		 
    	  		 setTestCaseID("TC_LINE_OTHERS_015");
    	  		 if(verifyElementDisplayed(driver, StatsLine_Chart)){
    	  			String ChartStatsLineColorRGB=getWebElement(driver, StatsLine_Chart).getCssValue("stroke");  
    	  			String appliedStatsLineColor=rgbToHex1(ChartStatsLineColorRGB);
    	  			if(appliedStatsLineColor.equalsIgnoreCase(ChangeStatsLine_Color)) {
    					 pass(driver,"Selected Color '"+ChangeStatsLine_Color+"' is applied in the displayed StatsLine in the chart");
      				}else {
    					 fail(driver,"Selected Color '"+ChangeStatsLine_Color+"' is not applied in the displayed StatsLine in the chart");
      				}
    	  		 }
    	  		 
      		 }else {
    	  		 fail(driver,"'StatsLineColor Input' is not displayed when selecting the StatsLine Value"); 
      		 }
      		
      		 setTestCaseID("TC_LINE_OTHERS_009");
      		 // Position Validation start....
      		 if(isToggleAccessible(driver,statsLinePosition_Input)) {		
    	  		 pass(driver,"'StatsLinePosition Input' accessible when selecting the StatsLine Value"); 
      		 }else {
      			 fail(driver,"'StatsLinePosition Input' Inaccessible when selecting the StatsLine Value"); 
      		 }
      		 setTestCaseID("TC_LINE_OTHERS_008");
      		 String default_StatslinePosition_Act=defaultSelectedValue(driver, statsLinePosition_Input);
      		 if(default_StatslinePosition_Exp.equals(default_StatslinePosition_Act)) {
    	  		 pass(driver,"By default, '"+default_StatslinePosition_Exp+"' is selected in the StatusLine Position Input"); 
    	  		 if(isDisplayed2(driver,StrokeLineBehindNew)) {
    		  		 pass(driver,"StrokeLine displayed '"+default_StatslinePosition_Exp+"' the chart bars for the default selected Position "); 
    			 }else {
    		  		 fail(driver,"StrokeLine not displayed '"+default_StatslinePosition_Exp+"' the chart bars for the default selected Position "); 
    			 }
      		 }else {
    	  		 fail(driver,"By default, '"+default_StatslinePosition_Exp+"' is not selected in the StatusLine Position Input"); 
      		 }
      		 setTestCaseID("TC_LINE_OTHERS_010");
       		 selectOptionValue(driver,statsLinePosition_Input,"above");
       		 scrollUsingElement(driver, ApplyButton);
    		 click(driver,ApplyButton);
    		 elementnotvisible1(driver, RPE_Loading);
    		 verifyElementDisplayed(driver,Chart_Section);
    		 if(!isDisplayed2(driver,StrokeLineBehindNew) && isDisplayed(driver, StrokeLine)) {
    	  		 pass(driver,"StrokeLine displayed Above the chart bars after selected the Position as 'Above'"); 
    		 }else {
    	  		 fail(driver,"StrokeLine not displayed Above the chart bars after selected the Position as 'Above'"); 
    		 }
      		 //position Validation End
    		 
    		 setTestCaseID("TC_LINE_OTHERS_011");
    		 //RoundOff Validation Start
      		 if(isToggleAccessible(driver,statsLineRoundOff_Input)) {		
    	  		 pass(driver,"'StatsLineRoundOff Input' accessible when selecting the StatsLine Value"); 
      		 }else {
    	  		 fail(driver,"'StatsLineRoundOff Input' Inaccessible when selecting the StatsLine Value"); 
      		 }
      		 setTestCaseID("");
     		 String default_RoundOffValue_Act=defaultSelectedValue(driver, statsLineRoundOff_Input);
     		 if(default_RoundOffValue_Exp.equals(default_RoundOffValue_Act)) {
    	  		 pass(driver,"By default, '"+default_RoundOffValue_Exp+"' is selected in the StatusLine RoundOff Input"); 
     		 }else {
    	  		 fail(driver,"By default, '"+default_RoundOffValue_Exp+"' is not selected in the StatusLine RoundOff Input"); 
     		 }
     		 setTestCaseID("TC_LINE_OTHERS_012");
     		 selectOptionValue(driver, statsLineRoundOff_Input, ChangeRoundOff_StatsLine);
     		 scrollUsingElement(driver, ApplyButton);
      		 click(driver,ApplyButton);
      		 elementnotvisible1(driver, RPE_Loading);
      		 verifyElementDisplayed(driver,Chart_Section);
      		 
     		 if(verifyElementDisplayed(driver, StatsLineRoundOff_Chart)) {
     			 String StatsLineString=getText(driver, StatsLineRoundOff_Chart);
     			 String roundOffStringValueAct=String.valueOf(getRoundOffValue(StatsLineString));
     			 if(roundOffStringValueAct.equals(ChangeRoundOff_StatsLine)) {
    		  		 pass(driver,"StatsLine value displayed with selected '"+ChangeRoundOff_StatsLine+"' RoundOff Value ");  
    	 		 }else {
    		  		 fail(driver,"StatsLine value not displayed with selected '"+ChangeRoundOff_StatsLine+"' RoundOff Value "); 
    	 		 }
     		 }
     		 //RoundOff Validation End
     		 
     		 //cursor validation start....
     		 setTestCaseID("TC_LINE_OTHERS_016");
     		 if(isToggleEnable(driver,Cursor_Input)) {		
     			 pass(driver,"'Cursor Input' is enabled by default"); 
     			 mouseOverToElement(driver, ChartGraph);
         		 if(isDisplayed2(driver,MouseCursor)) {
       	  		 	pass(driver,"Cursor is displayed in chart when cursor is enable"); 
         		 }else {
       	  		 	fail(driver,"Cursor is not displayed in chart when cursor is enable");  
         		 }
         		 
         		 setTestCaseID("TC_LINE_OTHERS_017");
        		 click(driver,Cursor_InputClick);
        		 if(isToggleEnable(driver,Cursor_Input)) {		
        			 fail(driver,"'Cursor Input' is enable while click on it"); 
        		 }else {
        			 pass(driver,"'Cursor Input' is disable while click on it"); 
        			 scrollUsingElement(driver, ApplyButton);
             		 click(driver,ApplyButton);
             		 elementnotvisible1(driver, RPE_Loading);
             		 waitForElement(driver,Chart);
             		 mouseOverToElement(driver, ChartGraph);
             		 if(isDisplayed2(driver,MouseCursor)) {
           	  		 	fail(driver,"Cursor is displayed in chart when cursor is disable"); 
             		 }else {
           	  		 	pass(driver,"Cursor is not displayed in chart when cursor is disable");  
             		 }
        		 }
     		 }else {
   	  		 	fail(driver,"'Cursor Input' is disabled by default"); 
     		 }
     		 //cursor validation End....
     	
     		 setTestCaseID("TC_LINE_OTHERS_018");
     		 if(isToggleEnable(driver,Export_Input)) {		
     			 fail(driver,"'Export Input' enable by default");
     		 }else {
     			 pass(driver,"'Export Input' disable by default"); 
     			 if(isDisplayed2(driver,ExportChartOptions)) {
        			 fail(driver,"'Export Options' is displayed in charts when Export chart is disabled"); 
        		 }else {
        			 pass(driver,"'Export Options' not displayed in charts when Export chart is disabled"); 
        		 }
     			 
     			 setTestCaseID("TC_LINE_OTHERS_019");
     			 if(IsElementEnabled(driver, Export_InputClick)) {
     				click(driver,Export_InputClick);
     				if(isToggleEnable(driver,Export_Input)) {		
     					pass(driver,"'Export Input' is enabled while enabling it");
     					scrollUsingElement(driver, ApplyButton);
     					click(driver,ApplyButton);
     					elementnotvisible1(driver, RPE_Loading);
     					verifyElementDisplayed(driver,Chart_Section);
     					if(isDisplayed2(driver,ExportChartOptions)) {
     		     			 pass(driver,"'Export Options' is displayed in charts when Export chart is enabled"); 
     		     			 mouseOverToElement(driver, ExportChartOptions);
     		     			 if(isDisplayed2(driver,ExportOptionExpandList)) {
     		     				 pass(driver,"'Export Options' is expanded when click on it"); 
     		     				 if(isDisplayed2(driver,Export_Image)) {
     		     					 pass(driver,"'IMG' Option is displayed When expand the charts Export"); 
     		     					 mouseOverToElement(driver, Export_Image);
     		 			  		 
     		     					 if(elementIsVisible(driver,Export_PNG)) {
     		     						 pass(driver,"'PNG' Option displayed When Mouse hover on IMG Option"); 
     		     					 }else {
     		     						 fail(driver,"'PNG' Option is not displayed When Mouse hover on IMG Option"); 
     		     					 }
     		 			  		
     		     					 if(elementIsVisible(driver,Export_JPG)) {
     		     						 pass(driver,"'JPG' Option displayed When Mouse hover on IMG Option"); 
     		     					 }else {
     		     						 fail(driver,"'JPG' Option is not displayed When Mouse hover on IMG Option"); 
     		     					 }
     		 			  		
     		     					 if(elementIsVisible(driver,Export_SVG)) {
     		     						 pass(driver,"'SVG' Option displayed When Mouse hover on IMG Option"); 
     		     					 }else {
     		     						 fail(driver,"'SVG' Option is not displayed When Mouse hover on IMG Option"); 
     		     					 }
     		     				 }else {
     		     					 fail(driver,"'IMG' Option is not displayed When expand the charts Export"); 
     		     				 }
     		 		  		 
     		     				 if(isDisplayed2(driver,Export_Data)) {
     		     					 pass(driver,"'Data' Option is displayed When expand the charts Export"); 
     		     					 mouseOverToElement(driver, Export_Data);
     		     					 verifyElementIsPresent1(driver, Export_JSON);
     		     					 verifyElementIsPresent1(driver, Export_CSV);
     		     					 verifyElementIsPresent1(driver, Export_XLSX);
     		     					 verifyElementIsPresent1(driver, Export_HTML);

     		     				 }else {
     		     					 fail(driver,"'Data' Option is not displayed When expand the charts Export"); 
     		     				 }
     		 		  		
     		     				 if(isDisplayed2(driver,Export_Print)) {
     		     					 pass(driver,"'Print' Option is displayed When expand the charts Export"); 			  		 
     		     				 }else {
     		     					 fail(driver,"'Print' Option is not displayed When expand the charts Export"); 
     		     				 }
     		     			 }else {
     		     				 fail(driver,"'Export Options' is not expanded when click on it"); 
     		     			 }
     		     		 }else {
     		     			 fail(driver,"'Export Options' not displayed in charts when Export chart is enabled"); 
     		     		 }
     				}else {
     					fail(driver,"'Export Input' not enabled while enabling it"); 
     				} 
     			 }else {
     				 fail(driver,"Export input is not accessible");
     			 }
     		 }
         }
		 
  	     // ******************* Others Validation End *********************
         setTestCaseID("");
  		 clearAndType(driver,ChartTitleInput,ChartTitle_Name);
  		 click(driver,SaveBtn_Chart);
  		 elementnotvisible1(driver, RPE_Loading);
  		 if(!isDisplayed2(driver,chartSaveError1) && isDisplayed(driver,SavedChartTitleInput)) {
    		pass(driver,"Chart Saved Successfully");
    		String AfterSaveChartTitleName=getText1(driver, SavedChartTitleName);
    		if(AfterSaveChartTitleName.equals(ChartTitle_Name)) {
    			pass(driver,"Same Chart Title name displayed after saved the chart ");
    		}else {
    			fail(driver,"Different Chart Title name displayed after saved the chart ");
    		}
  		 }else {
    		fail(driver,"Chart not Saved Successfully");
  		 }	
	}	
		
}
