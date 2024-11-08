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

public class DASHPRO_COLUMN_SMOKE_TESTING extends Keywords{

	public void column_testing(WebDriver driver,int iteration,String Flag) {
		
		//Axes input
		String AxesColor_Exp=Utils.getDataFromTestData("Axes", "Axes_Color_Exp");
		String ApplyBtn_color_Exp=Utils.getDataFromTestData("Axes", "Apply_Btn_Color");
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
		String Default_X_Label_Position_Column=Utils.getDataFromTestData("SmokeTesting_UI", "Default_X_Label_Position_Column");
		String Default_Grid_distance_Column=Utils.getDataFromTestData("SmokeTesting_UI", "Default_Grid_distance_Column");

		//Data Labels
		String DataLabelsColor_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DataLabelsColor_Exp");
		String DefaultFormatValue_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DefaultFormatValue");
		String DefaultSeperatorValue_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DefaultSeperatorValue");
		String DefaultFontSizeValue_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DefaultFontSizeValue");
		String DefaultRoundOffValue_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DefaultRoundOffValue");
		
		String DefaultPositionValue_Exp=Utils.getDataFromTestData("SmokeTesting_UI", "DefaultPostion_Column_DataLabel");
		String DefaultRotationValue_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DefaultRotationValue");

		//Other
		String Others_Color_Exp=Utils.getDataFromTestData("ChartFormat_Others", "Others_Color_Exp");
		String default_StatslineValueExp=Utils.getDataFromTestData("ChartFormat_Others", "default_StatslineValue");
		String defaultStatsLineColor_Exp=Utils.getDataFromTestData("ChartFormat_Others", "defaultStatsLineColor");
		String default_StatslinePosition_Exp=Utils.getDataFromTestData("ChartFormat_Others", "default_StatslinePosition");
		String default_RoundOffValue_Exp=Utils.getDataFromTestData("ChartFormat_Others", "default_RoundOffValue");
		
		
		//Iteration Inputs
		//Axes
		String Select_Axis_Same_Value=Utils.getDataFromTestDataIteration(iteration,"Column_Widget_Testing", "Select_Axis_Same_Value");
		String X_Axis_dataType=Utils.getDataFromTestDataIteration(iteration,"Column_Widget_Testing", "X_Axis_dataType");
		String Select_X_Axis_Value=Utils.getDataFromTestDataIteration(iteration,"Column_Widget_Testing", "Select_X_Axis_Value");
		String Y_Axis_dataType=Utils.getDataFromTestDataIteration(iteration,"Column_Widget_Testing", "Y_Axis_dataType");
		String Select_Y_Axis_Value=Utils.getDataFromTestDataIteration(iteration,"Column_Widget_Testing", "Select_Y_Axis_Value");
		String Limit_Input_Axes=Utils.getDataFromTestDataIteration(iteration,"Column_Widget_Testing", "Limit_Input_Axes");
		String Select_SortBy_Value=Utils.getDataFromTestDataIteration(iteration,"Column_Widget_Testing", "Select_SortBy_Value");
		String SelectGroupValue_Date=Utils.getDataFromTestDataIteration(iteration,"Column_Widget_Testing", "SelectGroupValue_Date");
//			
		//Axis Title Input
		String Change_X_Title_Name=Utils.getDataFromTestDataIteration(iteration,"Column_Widget_Testing", "Change_X_Title_Name");
		String Change_Y_Title_Name=Utils.getDataFromTestDataIteration(iteration,"Column_Widget_Testing", "Change_Y_Title_Name");
		String ChangeFontFamily_AxisTitle=Utils.getDataFromTestDataIteration(iteration,"Column_Widget_Testing", "ChangeFontFamily_AxisTitle");
		String ChangeTitleFontSize_AxisTitle=Utils.getDataFromTestDataIteration(iteration,"Column_Widget_Testing", "ChangeTitleFontSize_AxisTitle");
		String Change_X_label_FontSize=Utils.getDataFromTestDataIteration(iteration,"Column_Widget_Testing", "Change_X_label_FontSize");
		String Change_Y_label_FontSize=Utils.getDataFromTestDataIteration(iteration,"Column_Widget_Testing", "Change_Y_label_FontSize");
		String X_Rotation_Input=Utils.getDataFromTestDataIteration(iteration,"Column_Widget_Testing", "X_Rotation_Input");
		String Y_Rotation_Input=Utils.getDataFromTestDataIteration(iteration,"Column_Widget_Testing", "Y_Rotation_Input");

		//Chart title
		String TypeBackgroundColor1=Utils.getDataFromTestDataIteration(iteration,"Column_Widget_Testing", "TypeBackgroundColor1");
		String TypeTextColor1=Utils.getDataFromTestDataIteration(iteration,"Column_Widget_Testing", "TypeTextColor1");
		String Change_FontFamily_ChartTitle=Utils.getDataFromTestDataIteration(iteration,"Column_Widget_Testing", "Change_FontFamily_ChartTitle");
		String ChangeFontSize_ChartTitle=Utils.getDataFromTestDataIteration(iteration,"Column_Widget_Testing", "ChangeFontSize_ChartTitle");
		String ChangeChartTitleName=Utils.getDataFromTestDataIteration(iteration,"Column_Widget_Testing", "ChangeChartTitleName");
		//Chart Style
		String Change_ChartTheme_ChartStyle=Utils.getDataFromTestDataIteration(iteration,"Column_Widget_Testing", "Change_ChartTheme_ChartStyle");
		String Change_X_Label_Position_Style=Utils.getDataFromTestDataIteration(iteration,"Column_Widget_Testing", "Change_X_Label_Position_Style");
		String Change_Grid_Distance=Utils.getDataFromTestDataIteration(iteration,"Column_Widget_Testing", "Change_Grid_Distance");

		//Data Label
		String ChangeFontSizeValue_DataLabel=Utils.getDataFromTestDataIteration(iteration,"Column_Widget_Testing", "ChangeFontSizeValue_DataLabel");
		String ChangeRoundOffValue_DataLabel=Utils.getDataFromTestDataIteration(iteration,"Column_Widget_Testing", "ChangeRoundOffValue_DataLabel");
		String ChangeRotataionVal_Positive_DataLabel=Utils.getDataFromTestDataIteration(iteration,"Column_Widget_Testing", "ChangeRotataionVal_Positive_DataLabel");
		String ChangeRotataionVal_Negative_DataLabel=Utils.getDataFromTestDataIteration(iteration,"Column_Widget_Testing", "ChangeRotataionVal_Negative_DataLabel");
		
		//Others
		String ChangeStatsLine_Color=Utils.getDataFromTestDataIteration(iteration,"Column_Widget_Testing", "ChangeStatsLine_Color");
		String ChangeRoundOff_StatsLine=Utils.getDataFromTestDataIteration(iteration,"Column_Widget_Testing", "ChangeRoundOff_StatsLine");
		String Custom_StatsLine_Input=Utils.getDataFromTestDataIteration(iteration,"Column_Widget_Testing", "Custom_StatsLine_Input");

		
		setTestCaseID(" ");
		Actions action=new Actions(driver);
		mouseOverToElement(driver, ADDTabPlus);
  	    mouseOverAndClick(driver, ADDTabPlus);
  	    wait(driver,"1");
  	    sendKeys(driver,newlyAddedTab,"ColumnTestTab1");
  	    click(driver,DashProPage);
  	    elementnotvisible1(driver, RPE_Loading);
		waitForElement(driver,ADD_widget_rightTop);
	    click(driver,ADD_widget_rightTop);
	    elementnotvisible(driver,Loading);
	    elementnotvisible1(driver, RPE_Loading);
		waitForElement(driver,WidgetPanel);
		waitForElement(driver,Sparkline_widget);
		
		setTestCaseID("TC_COLUMN_001");
		waitForElement(driver,Coloumn_widget);
		verifyElementDisplayed(driver, Coloumn_widget);
		setTestCaseID("TC_COLUMN_002");
		WidgetValidation(driver,Coloumn_widget,"Column");
		setTestCaseID("TC_COLUMN_004");
		click(driver,Coloumn_widget);
		elementnotvisible(driver, Loading);
		elementnotvisible1(driver, RPE_Loading);
		setTestCaseID("TC_COLUMN_003");
		String widgetValue=getText1(driver,WidgetValue);
	 	if(widgetValue.equals("Column")) {
			pass(driver,"Column displayed as the selected Widget ");
	 	}else {
	 		fail(driver,"Column not displayed as the selected Widget ");
	 	}
		
	 	setTestCaseID("TC_COLUMN_005");
	 	verifyElementDisplayed(driver, Axes);
	 	String AxesExpand=getAttribute1(driver,Axes_Expand,"class");
    	if(AxesExpand.contains("up")) {
    		 pass(driver,"By default Column Axes Section is Expanded");
    	}else {
    		 fail(driver,"By default Column Axes Section is not Expanded");
    	}
    	 
		String AxesTextColor_Act=getTextColor(driver,Axes); // #873b10
		if(AxesColor_Exp.equalsIgnoreCase(AxesTextColor_Act)) {
			pass(driver," 'Axes' highlighted in blue color");
		}else {
			fail(driver," 'Axes' not highlighted in blue color");
		}
		
		setTestCaseID("TC_COLUMN_007");
		verifyElementDisplayed(driver,X_Axis_Input);
		String defaultSelectValue_Y_Act=getText1(driver,X_Axis_Input);
		if(defaultSelectValue_Y_Act.equals("Select")) {
			pass(driver,"By Default 'Select' is selected in the X axis value input dropdown ");
		}else {
			fail(driver,"By Default 'Select' is not selected in the X axis value input dropdown ");
		}
		
		setTestCaseID("TC_COLUMN_019");
		verifyElementDisplayed(driver,Y_Axis_Input);
		String defaultSelectValue_X_Act=getText1(driver,Y_Axis_Input);
		if(defaultSelectValue_X_Act.equals("Select")) {
			pass(driver,"By Default 'Select' is selected in the Y axis value input dropdown ");
		}else {
			fail(driver,"By Default 'Select' is not selected in the Y axis value input dropdown ");
		}
		setTestCaseID("");
		verifyElementDisplayed(driver,aggregation);
		verifyElementDisplayed(driver,aggText);
			
		verifyElementDisplayed(driver,ApplyButton);
		String ApplyBtn_Color_Act=getTextBackgroundColor(driver,ApplyButton);
		if(ApplyBtn_color_Exp.equalsIgnoreCase(ApplyBtn_Color_Act)) {
			pass(driver,"Apply button displayed with blue color");
		}else {
			fail(driver,"Apply button not displayed with blue color, Exp : "+ApplyBtn_color_Exp+" Act : "+ApplyBtn_Color_Act);
		}
		
		setTestCaseID("TC_COLUMN_006");
		scrollUsingElement(driver, ApplyButton);
		click(driver,ApplyButton);
		if(isDisplayed(driver,ApplyError1)) {
			pass(driver,"'Kindly select X axis and Y axis ' Error displayed when click Apply button without providing inputs");
		}else {
			fail(driver,"'Kindly select X axis and Y axis ' Error not displayed when click Apply button without providing inputs");
		}
		
		setTestCaseID("TC_COLUMN_008");
		click(driver,X_Axis_Input);
		if(isDisplayed(driver,X_Axis_dropdownResultsExp)) {
			pass(driver,"X-Axis dropdown Expanded after click on it");
		}else {
			fail(driver,"X-Axis dropdown not Expanded after click on it");
		}
		
		setTestCaseID("TC_COLUMN_011");
		List<WebElement> displayedDataImage=getWebElements(driver, dataTypeImages);
		List<WebElement> AvailableColumnList=getWebElements(driver, AvailableList);
		int AvailableColumnListSize=AvailableColumnList.size()-1;
		if(AvailableColumnListSize==displayedDataImage.size()) {
			pass(driver,"All the available columns are displayed with data Type icon in the X_Axis dropdown");
		}else {
			fail(driver,"Some columns are not correctly displayed with data Type icon in the X_Axis dropdown");
		}
		
		setTestCaseID("TC_COLUMN_009");
		for(WebElement dataImag:displayedDataImage) {
			String dataTypeDisplay=dataImag.getAttribute("src");
			if(dataTypeDisplay.contains("Date") || dataTypeDisplay.contains("Categorical") || dataTypeDisplay.contains("Numerical") || dataTypeDisplay.contains("Text")) {
				
			}else {
				fail(driver,"Other than Date,Categorical,Numerical and Text datatype column is displayed in the X_Axis dropdown");
				break;
			}
			
		}
		
		setTestCaseID("TC_COLUMN_010");
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
		
		setTestCaseID("TC_COLUMN_017");
		ScrollBarValidation1(driver,X_Axis_dropdownResultsExp,"X-Axis");
		//ScrollBarValidation(driver,Y_Axis_dropdownResults,HighlightTextElement,"Y-Axis");
		setTestCaseID("TC_COLUMN_012");
		mouseOverToElement(driver,SecondValue);
		String Highlight_Color_Act=getTextBackgroundColor(driver,SecondValue);
		if(Highlight_color_Exp.equalsIgnoreCase(Highlight_Color_Act)) {
			pass(driver," Mouse hovered Column Value highlighted in blue color in the X_Axis dropdown");
		}else {
			fail(driver," Mouse hovered Column Value not highlighted in blue color in the X_Axis dropdown, Exp : "+Highlight_color_Exp+" Act : "+Highlight_Color_Act);
		}
		
		if(verifyElementDisplayed(driver, dropdownInputsearchBox)) {
			setTestCaseID("TC_COLUMN_015");
			click(driver,dropdownInputsearchBox);
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
			
			setTestCaseID("TC_COLUMN_013");
			sendKeys(driver,dropdownInputsearchBox,Select_Axis_Same_Value);
			wait(driver,"1");
			String firstValue_Y=getText1(driver,FirstSearchedvalue);
			if(firstValue_Y.contains(Select_Axis_Same_Value)) {
				pass(driver,"Searched Value correctly displayed in the X_Axis dropdown");
				action.sendKeys(Keys.ENTER).build().perform();
				wait(driver,"1");
				if(isDisplayed2(driver,X_Axis_dropdownResultsExp)) {
					fail(driver,"X_Axis Value dropdown not closed after perform 'Enter' action");
				}else {
					pass(driver,"X_Axis Value dropdown closed automatically after perform 'Enter' action");
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
		
		setTestCaseID("TC_COLUMN_016");
		click(driver,X_Axis_text_);
		click(driver,X_Axis_Input);
		waitForElement(driver,X_Axis_dropdownResultsExp);
		wait(driver,"1");
		String selectedColorAct=getTextBackgroundColor(driver,ListSelected);
		System.out.println("Highlight_color_Exp : "+Highlight_color_Exp+"selectedColorAct : "+selectedColorAct);
		String highlightText=getText1(driver,ListSelectedText);
		if((highlightText.contains(Select_Axis_Same_Value))&&Highlight_color_Exp.equalsIgnoreCase(selectedColorAct)) {
			pass(driver,"Selected Value ("+Select_Axis_Same_Value+") highlighted in blue color");
		}else {
			fail(driver,"Selected Value ("+Select_Axis_Same_Value+") not highlighted in blue color");
		}
		
		setTestCaseID("TC_COLUMN_018");
		selectDropdownValue1(driver,Select_Axis_Same_Value);
		wait(driver,"1");
		if(isDisplayed2(driver,X_Axis_dropdownResultsExp)) {
			fail(driver,"X_Axis Value dropdown not closed after selecting the value");
		}else {
			pass(driver,"X_Axis Value dropdown closed automatically after selecting the value");
		}
		
		setTestCaseID("TC_COLUMN_034");
		scrollUsingElement(driver, ApplyButton);
		click(driver,ApplyButton);
		if(isDisplayed(driver,ApplyError1)) {
			pass(driver,"'Kindly select X axis and Y axis ' Error displayed when click Apply button only providing X_Axis Value");
		}else {
			fail(driver,"'Kindly select X axis and Y axis ' Error not displayed when click Apply button only providing X_Axis Value");
		}
		
		setTestCaseID("TC_COLUMN_035");
		String defaultaggre=defaultSelectedValue(driver,aggregation);
        if(defaultaggre.equals("Sum")) {
        	pass(driver,"'Sum' is selected as default aggrigation");
		}else {
			fail(driver,"'Sum' is not selected as default aggrigation");
		}
        
        setTestCaseID("");
        click(driver,X_Axis_Input);
		waitForElement(driver,SelectOption);
		click(driver,SelectOption);
		wait(driver,"1");
		
		setTestCaseID("TC_COLUMN_020");
		click(driver,Y_Axis_Input);
		if(isDisplayed(driver,Y_Axis_dropdownResultsExp)) {
			pass(driver,"Y-Axis dropdown Expanded after click on it");
		}else {
			fail(driver,"Y-Axis dropdown not Expanded after click on it");
		}
		
		
		verifyElementDisplayed(driver, dropdownInputsearchBox);
		click(driver,dropdownInputsearchBox);
		
		setTestCaseID("TC_COLUMN_025");
		displayedDataImage=getWebElements(driver, dataTypeImages);
		AvailableColumnList=getWebElements(driver, AvailableList);
		AvailableColumnListSize=AvailableColumnList.size()-1;
		if(AvailableColumnListSize==displayedDataImage.size()) {
			pass(driver,"All the available columns are displayed with data Type icon in the Y_Axis dropdown");
		}else {
			fail(driver,"Some columns are not correctly displayed with data Type icon in the Y_Axis dropdown");
		}
		
		setTestCaseID("TC_COLUMN_021");
		for(WebElement dataImag:displayedDataImage) {
			String dataTypeDisplay=dataImag.getAttribute("src");
			if(dataTypeDisplay.contains("Date") || dataTypeDisplay.contains("Categorical") || dataTypeDisplay.contains("Numerical") || dataTypeDisplay.contains("Text")) {
				
			}else {
				fail(driver,"Other than Date,Categorical,Numerical and Text datatype column is displayed in the Y_Axis dropdown");
				break;
			}
			
		}
		
		setTestCaseID("TC_COLUMN_022");
		if(isDisplayed2(driver,CategoricalColumnAxisDropdown)) {
			String Categorical1=getText1(driver,CategoricalColumnAxisDropdown);
			if(Categorical1.contains("(")) {
				pass(driver,"Unique values are displayed in the Categorical Column in the Y_Axis dropdown");
			}else {
				fail(driver,"Unique values are not displayed in the Categorical Column in the Y_Axis dropdown");
			}
		}
		
		if(isDisplayed2(driver,TextColumnAxisDropdown)) {
			String Text1=getText1(driver,TextColumnAxisDropdown);
			if(Text1.contains("(")) {
				pass(driver,"Unique values are displayed in the Text Column in the Y_Axis dropdown");
			}else {
				fail(driver,"Unique values are not displayed in the Text Column in the Y_Axis dropdown");
			}
		}
		
		setTestCaseID("TC_COLUMN_029");
		ScrollBarValidation1(driver,Y_Axis_dropdownResultsExp,"Y-Axis");
		
		setTestCaseID("TC_COLUMN_023");
		mouseOverToElement(driver,SecondValue);
		Highlight_Color_Act=getTextBackgroundColor(driver,SecondValue);
		if(Highlight_color_Exp.equalsIgnoreCase(Highlight_Color_Act)) {
			pass(driver," Mouse hovered Column Value highlighted in blue color in the Y_Axis dropdown");
		}else {
			fail(driver," Mouse hovered Column Value not highlighted in blue color in the Y_Axis dropdown, Exp : "+Highlight_color_Exp+" Act : "+Highlight_Color_Act);
		}
		
		setTestCaseID("TC_COLUMN_024");
		if(verifyElementDisplayed(driver, dropdownInputsearchBox)) {
			setTestCaseID("TC_COLUMN_028");
			click(driver,dropdownInputsearchBox);
			sendKeys(driver,dropdownInputsearchBox,"afghjku");
			if(isDisplayed2(driver,NoResultsFound)) {
				pass(driver,"'No Results found' message is displayed in while searching invalid value in the Y_Axis dropdown input");
			}else {
				fail(driver,"'No Results found' message is not displayed in while searching invalid value in the Y_Axis dropdown input");
			}
			
			clear1(driver,dropdownInputsearchBox);
			wait(driver,"1");
			if(isDisplayed2(driver,NoResultsFound)){
				fail(driver,"Column List are not displayed after clear the search input in the Y_Axis dropdown");
			}else {
				pass(driver,"Column List are displayed after clear the search input in the Y_Axis dropdown");
			}
			
			setTestCaseID("TC_COLUMN_026");
			sendKeys(driver,dropdownInputsearchBox,Select_Axis_Same_Value);
			wait(driver,"1");
			String firstValue_Y=getText1(driver,FirstSearchedvalue);
			if(firstValue_Y.contains(Select_Axis_Same_Value)) {
				pass(driver,"Searched Value correctly displayed in the Y_Axis dropdown");
				action.sendKeys(Keys.ENTER).build().perform();
				wait(driver,"1");
				if(isDisplayed2(driver,Y_Axis_dropdownResultsExp)) {
					fail(driver,"Y_Axis Value dropdown not closed after perform 'Enter' action");
				}else {
					pass(driver,"Y_Axis Value dropdown closed automatically after perform 'Enter' action");
					String seletcedValue=getText1(driver,Y_Axis_Input);
					if(seletcedValue.contains(Select_Axis_Same_Value)) {
						pass(driver,"Selected value displayed in the Y_Axis Input after click Enter");
					}else {
						fail(driver,"Selected value not displayed in the Y_Axis Input after click Enter");
					}
				}
				
			}else {
				fail(driver,"Searched Value not correctly displayed in the Y_Axis dropdown");
			}
		}
		
		setTestCaseID("TC_COLUMN_030");
		click(driver,Y_Axis_text_);
		click(driver,Y_Axis_Input);
		waitForElement(driver,Y_Axis_dropdownResultsExp);
		wait(driver,"1");
		selectedColorAct=getTextBackgroundColor(driver,ListSelected);
		System.out.println("Highlight_color_Exp : "+Highlight_color_Exp+"selectedColorAct : "+selectedColorAct);
		highlightText=getText1(driver,ListSelectedText);
		if((highlightText.contains(Select_Axis_Same_Value))&&Highlight_color_Exp.equalsIgnoreCase(selectedColorAct)) {
			pass(driver,"Selected Value ("+Select_Axis_Same_Value+") highlighted in blue color");
		}else {
			fail(driver,"Selected Value ("+Select_Axis_Same_Value+") not highlighted in blue color");
		}
		
		setTestCaseID("TC_COLUMN_031");
		selectDropdownValue1(driver,Select_Axis_Same_Value);
		wait(driver,"1");
		if(isDisplayed2(driver,Y_Axis_dropdownResultsExp)) {
			fail(driver,"Y_Axis Value dropdown not closed after selecting the value");
		}else {
			pass(driver,"Y_Axis Value dropdown closed automatically after selecting the value");
		}
		
		setTestCaseID("TC_COLUMN_033");
		scrollUsingElement(driver, ApplyButton);
		click(driver,ApplyButton);
		if(isDisplayed(driver,ApplyError1)) {
			pass(driver,"'Kindly select X axis and Y axis ' Error displayed when click Apply button only providing Y_Axis Value");
		}else {
			fail(driver,"'Kindly select X axis and Y axis ' Error not displayed when click Apply button only providing Y_Axis Value");
		}
		
		setTestCaseID("TC_COLUMN_032");
		click(driver,X_Axis_Input);
		waitForElement(driver,X_Axis_dropdownResultsExp);
		selectDropdownValue1(driver,Select_Axis_Same_Value);
		wait(driver,"1");
		scrollUsingElement(driver, ApplyButton);
		click(driver,ApplyButton);
		if(isDisplayed(driver,ApplyError2)) {
			pass(driver,"'Kindly check fields and select different values' Error displayed when click Apply button with same X_Axis and Y_Axis Value");
		}else {
			fail(driver,"'Kindly check fields and select different values' Error not displayed when click Apply button with same X_Axis and Y_Axis Value");
		}
		
		setTestCaseID("");
		click(driver,X_Axis_Input);
		waitForElement(driver,X_Axis_dropdownResultsExp);
		selectDropdownValue(driver,X_Axis_dataType,Select_X_Axis_Value);
		//new lines
		setTestCaseID("TC_COLUMN_062");
		if(X_Axis_dataType.equals("Date")) {
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
				fail(driver,"Group selection input option is not displayed While select Date datatype in Y_axis");
			}
		}
		setTestCaseID("");
		waitForElement(driver,Y_Axis_Input);
		click(driver,Y_Axis_Input);
		waitForElement(driver,Y_Axis_dropdownResultsExp);
		selectDropdownValue(driver,Y_Axis_dataType,Select_Y_Axis_Value);
		
		setTestCaseID("TC_COLUMN_036");
		click(driver,aggregation);
		verifyElementIsPresent1(driver, Sum);
		verifyElementIsPresent1(driver, Count);
		verifyElementIsPresent1(driver, Average);
		verifyElementIsPresent1(driver, Min);
		verifyElementIsPresent1(driver, Max);
		verifyElementIsPresent1(driver, Unique);

		setTestCaseID("TC_COLUMN_037");
		DASHPRO_BAR_SMOKE_TESTING bar=new DASHPRO_BAR_SMOKE_TESTING();
		if(Y_Axis_dataType.contains("Categorical") || Y_Axis_dataType.contains("Text") || Y_Axis_dataType.contains("Date")) {
			bar.aggregationValidation1(driver);
		}else {
			bar.aggregationValidation2(driver);
		}
		setTestCaseID("");
		scrollUsingElement(driver, ApplyButton);
		click(driver,ApplyButton);
		elementnotvisible1(driver, Loading);
		elementnotvisible1(driver, RPE_Loading);
		
		if(isDisplayed(driver,Chart_Section)) {
			pass(driver,"Chart is displayed after selecting X and Y axis value");
		}else {
			fail(driver,"Chart is not displayed after selecting X and Y axis value");
		}
		
		setTestCaseID("TC_COLUMN_038");
		String defaultShowResult=defaultSelectedValue(driver,showResult);
        if(defaultShowResult.equals("All")) {
        	pass(driver,"'All' is selected by default in the Showresults input");
		}else {
        	fail(driver,"'All' is not selected by default in the Showresults input");
		}
        setTestCaseID("TC_COLUMN_039");
        click(driver,showResult);
		verifyElementIsPresent1(driver,All);
		verifyElementIsPresent1(driver,Limit);
		wait(driver,"1");
		
		setTestCaseID("TC_COLUMN_040");
		String X_Selected=getText1(driver,X_Axis_Input);
		if(X_Axis_dataType.contains("Categorical") || X_Axis_dataType.contains("Text")) {
			
			int X_number=getNumber(X_Selected);
	        String X_SelectedString=getStringValue(X_Selected);
	        
			scrollUsingElement(driver, ApplyButton);
			click(driver,ApplyButton);
			elementnotvisible1(driver, RPE_Loading);
			verifyElementDisplayed(driver,Chart);
	        if(isDisplayed(driver,minimize)) {
	        	click(driver,minimize);
	        }
	        
	        mouseOverToElement(driver,DashProPage);
	    	wait(driver,"2");

	        List<WebElement> charts=getWebElements(driver,chartBars);
	        int chartCount=charts.size();
	        if(X_number!=0) {
	        	if(chartCount==X_number) {
		        	pass(driver,"For Show results 'All' bar displayed count matched with selected X_Axis count value");
		        }else {
		        	fail(driver,"For Show results 'All' bar displayed count mismatched with selected X_Axis count value, Exp : "+X_number+" Act : "+chartCount);
		        }
	        }
	        
		}
		setTestCaseID("TC_COLUMN_041");
		//verifyElementDisplayed(driver,Chart_Section);
		List<WebElement> DefaultCharts=getWebElements(driver,chartBars);
		int defaultSizeChart=DefaultCharts.size();
		click(driver,showResult);
		selectByText(driver, showResult, "Limit");
        
		verifyElementIsPresent1(driver,showRecordType);
		verifyElementIsPresent1(driver,Top1);
		verifyElementIsPresent1(driver,Bottom1);
		verifyElementIsPresent1(driver,limitInput);
		setTestCaseID("TC_COLUMN_042");
		String defaultShowRecordType=defaultSelectedValue(driver,showRecordType);
        if(defaultShowRecordType.equals("Top")) {
        	pass(driver,"'Top' is selected by default in the showRecordType input");
		}else {
        	fail(driver,"'Top' is not selected by default in the showRecordType input");
		}
        
        setTestCaseID("TC_COLUMN_045");
		clear1(driver,limitInput);
		scrollUsingElement(driver, ApplyButton);
		click(driver,ApplyButton);
		
		if(isDisplayed(driver,Limit_Error)) {
			pass(driver,"'Kindly provide the limit', Error displayed when click the Apply button without providing the limit value");
		}else {
			fail(driver,"'Kindly provide the limit', Error not displayed when click the Apply button without providing the limit value");
		}
		setTestCaseID("TC_COLUMN_043");
		if(defaultSizeChart>1) {
			setTestCaseID("TC_COLUMN_046");
			click3(driver,limitInput);
			sendKeys(driver,limitInput,Limit_Input_Axes);
			scrollUsingElement(driver, ApplyButton);
			click(driver,ApplyButton);
			elementnotvisible1(driver, RPE_Loading);
			verifyElementDisplayed(driver,Chart);
	        if(isDisplayed(driver,minimize)) {
	        	click(driver,minimize);
	        }
	        
	        
	        mouseOverToElement(driver,DashProPage);
	    	wait(driver,"2");
	        int limit_Number=Integer.parseInt(Limit_Input_Axes);
	        List<WebElement> charts=getWebElements(driver,chartBars);
	        int chartCount=charts.size();
	        if(chartCount==limit_Number) {
	        	pass(driver,"For Selected Limit Value, bar displayed count matched with Limit count value");
	        }else {
	        	fail(driver,"For Selected Limit Value, bar displayed count mismatched with Limit count value, Exp : "+limit_Number+" Act : "+chartCount);
	        }
			
	        elementScreenShot_new(driver,Chart,"/Expected_screenshot/SmokeTesting/barChart_Top");
	        
	        setTestCaseID("TC_COLUMN_044");
			selectByText(driver, showRecordType, "Bottom");
			wait(driver,"1");
			clear1(driver,limitInput);
			sendKeys(driver,limitInput,Limit_Input_Axes);
			scrollUsingElement(driver, ApplyButton);
			click(driver,ApplyButton);
			elementnotvisible1(driver, RPE_Loading);
			verifyElementDisplayed(driver,Chart);
	        if(isDisplayed(driver,minimize)) {
	        	click(driver,minimize);
	        }
			
			elementScreenShot_new(driver,Chart,"/Actual_screenshot/SmokeTesting/barChart_Bottom");

	        try {
	        	boolean chartDiff=imageComparison2(driver, "/SmokeTesting/barChart_Top", "/SmokeTesting/barChart_Bottom");
				wait(driver, "2");
				if(chartDiff==false) {
					pass(driver,"'Bottom' in the Show recordType working properly");
				}else {
					fail(driver,"'Bottom' in the Show recordType not working properly");
				}
			} catch (Exception e1) {
				fail(driver,"Unable to compare the Images Top and Bottom charts images");
			}
	        
		}
		
		
        selectByText(driver,showResult,"All");
        setTestCaseID("TC_COLUMN_047");
		verifyElementIsPresent1(driver,sortType);  
		verifyElementIsPresent1(driver,sortBy);
		
		setTestCaseID("TC_COLUMN_048");
		String defaultSortType=defaultSelectedValue(driver,sortType);
        if(defaultSortType.equals("Quick Sort")) {
        	pass(driver,"'Quick Sort' is selected by default in the sortType input");
		}else {
        	fail(driver,"'Quick Sort' is not selected by default in the sortType input");
		}
       // setTestCaseID("TC_COLUMN_049");
		click(driver,sortType);
		selectByText(driver,sortType,"Quick Sort");
		click(driver,sortBy);
		setTestCaseID("TC_COLUMN_049");
		if(verifyElementDisplayed(driver,sortByDropdownExpand)) {
			setTestCaseID("TC_COLUMN_051");
			List<WebElement> SortByValues=getWebElements(driver,sortByValues);
		    int SortByValuesCount=SortByValues.size();
		    if(SortByValuesCount<=3) {
		    	pass(driver,"Only X and Y values are displayed in the sortBy field for Quicksort condition");
		    }else {
		    	fail(driver,"Other than X and Y values are displayed in the sortBy field for Quicksort condition");
		    }
		    
		}
	    
		setTestCaseID("TC_COLUMN_053");
		selectByText(driver,sortType,"Field Sort");
		click(driver,sortBy1);
		if(verifyElementDisplayed(driver,sortByDropdownExpand)) {
			
			List<WebElement> SortByValues1=getWebElements(driver,sortByValues1);
	        int SortByValuesCount=SortByValues1.size();
	    	if(SortByValuesCount<=3) {
		    	fail(driver,"Only X and Y values are displayed in the sortBy field for Fieldsort condition");
	    	}else {
		    	pass(driver,"All values are displayed in the sortBy field for Fieldsort condition");
		    	wait(driver,"1");
		    	
		    	setTestCaseID("TC_COLUMN_054");
		    	if(isDisplayed(driver,Cate_agg_fieldSortValue)) {
		    		mouseOverAndClick(driver, Cate_agg_fieldSortValue);
		    		String defaultCategoricalSelect=defaultSelectedValue(driver,Cate_agg_fieldSortValue);
			    	if(defaultCategoricalSelect.equals("Count")) {
			    		pass(driver,"'Count' is selected as default for Categorical in Field sort ");
			    	}else {
			    		fail(driver,"'Count' is not selected as default for Categorical in Field sort ");
			    	}
			    	
			    	//mouseOverAndClick(driver,Cat_agg_fieldSort);
			    	if(isDisplayed2(driver,sumDisabledFieldsortCate)) {
			 			pass(driver,"Sum disabled for Categorical value in Field sort");
			         }else {
			 			fail(driver,"Sum not disabled for Categorical value in Field sort");
			         }
			         
			         if(isDisplayed2(driver,AvgDisabledFieldsortCate)) {
			 			pass(driver,"Average disabled for Categorical value in Field sort");
			         }else {
				 		fail(driver,"Average not disabled for Categorical value in Field sort");
			         }
			         
			         if(isDisplayed2(driver,minDisabledFieldsortCate)) {
			 			pass(driver,"Minimum disabled for Categorical value in Field sort");
			         }else {
			 			fail(driver,"Minimum not disabled for Categorical value in Field sort");
			         }
			         
			         if(isDisplayed2(driver,maxDisabledFieldsortCate)) {
			 			pass(driver,"Maximum disabled for Categorical value in Field sort");
			         }else {
			 			fail(driver,"Maximum not disabled for Categorical value in Field sort");
			         }
			         
			         if(!isDisplayed2(driver,uniqueDisabledFieldsortCate)) {
			 			pass(driver,"Unique enabled for Categorical value in Field sort");
			         }else {
			 			fail(driver,"Unique not enabled for Categorical value in Field sort");
			         }
			         
			         if(!isDisplayed2(driver,countDisabledFieldsortCate)) {
				 		pass(driver,"Count enabled for Categorical value in Field sort");
			         }else {
					 	fail(driver,"Count not enabled for Categorical value in Field sort");
			         } 
			         mouseOverAndClick(driver, Cate_agg_fieldSortValue);
			         //action.sendKeys(Keys.ESCAPE).build().perform();
		    	}else {
		    		fail(driver,"Categorical Sort by agg Value not present in the dropdown");
		    	}
		    	
		    	 wait(driver,"1");
		    	 if(isDisplayed(driver,Num_agg_fieldSortValue)) {
		    		 mouseOverAndClick(driver, Num_agg_fieldSortValue);
		    		 String defaultNumericalSelect=defaultSelectedValue(driver,Num_agg_fieldSortValue);
			 		 if(defaultNumericalSelect.equals("Sum")) {
			 			pass(driver,"'Sum' is selected as default for Numerical in Field sort ");
			     	 }else {
			 			fail(driver,"'Sum' is not selected as default for Numerical in Field sort ");
			     	 }
			 	     //click3(driver,Num_agg_fieldSort);
			 	    	
			 	     if(!isDisplayed2(driver,sumDisabledFieldsortNum)) {
			 			pass(driver,"Sum enabled for Numerical value in Field sort");
			         }else {
				 		fail(driver,"Sum not enabled for Numerical value in Field sort");
			         }
			         
			         if(!isDisplayed2(driver,AvgDisabledFieldsortNum)) {
			 			pass(driver,"Average enabled for Numerical value in Field sort ");
			         }else {
			 			fail(driver,"Average not enabled for Numerical value in Field sort ");
			         }
			         
			         if(!isDisplayed2(driver,minDisabledFieldsortNum)) {
			 			pass(driver,"Minimum enabled for Numerical value in Field sort");
			         }else {
				 		fail(driver,"Minimum not enabled for Numerical value in Field sort");
			         }
			         
			         if(!isDisplayed2(driver,maxDisabledFieldsortNum)) {
			 			pass(driver,"Maximum enabled for Numerical value in Field sort");
			         }else {
			 			fail(driver,"Maximum not enabled for Numerical value in Field sort");
			         }
			         
			         if(!isDisplayed2(driver,uniqueDisabledFieldsortNum)) {
			 			pass(driver,"Unique enabled for Numerical value in Field sort");
			         }else {
			 			fail(driver,"Unique not enabled for Numerical value in Field sort");
			         }
			         
			         if(!isDisplayed2(driver,countDisabledFieldsortNum)) {
			 			pass(driver,"Count enabled for Numerical value in Field sort");
			         }else {
			 			fail(driver,"Count not enabled for Numerical value in Field sort");
			         }	
			         mouseOverAndClick(driver, Num_agg_fieldSortValue);
			 		 //action.sendKeys(Keys.ESCAPE).build().perform();
		    	 }else {
			    	  fail(driver,"Numerical Sort by agg Value not present in the dropdown");
			     }
		    	 setTestCaseID("TC_COLUMN_055");
		 		ScrollBarValidation1(driver, ListFieldSection, "Field Sort");
		 		setTestCaseID("TC_COLUMN_056");
		 		if(verifyElementDisplayed(driver, inputFieldSort)) {
		 			
		 			List<WebElement> AllList=getWebElements(driver, ListFieldsort);
		 			int lastindex=AllList.size()-1;
		 			String lastText=AllList.get(lastindex).getText();
		 			click(driver,inputFieldSort);
		 			setTestCaseID("TC_COLUMN_059");
		 			sendKeys(driver, inputFieldSort, "dgrehtj");
		 			if(isDisplayed(driver,NoResultsFound)) {
		 				pass(driver,"No results found is displayed for invalid input");
		 			}else {
		 				fail(driver,"No results found is not displayed for invalid input");
		 			}
		 			clear1(driver,inputFieldSort);
		 			wait(driver,"1");
		 			setTestCaseID("TC_COLUMN_057");
		 			sendKeys(driver, inputFieldSort, lastText);
		 			String firstList=getText1(driver, FirstField);
		 			if(firstList.equals(lastText)) {
		 				pass(driver,"Search input inside the field sort working properly");
		 			}else {
		 				fail(driver,"Search input inside the field sort not working properly");
		 			}
		 			
		 			setTestCaseID("TC_COLUMN_058");
		 			action.sendKeys(Keys.ENTER).build().perform();
		 			wait(driver,"1");
		 			String appliedSort=getText1(driver, sortedInput);
		 			if(!appliedSort.equalsIgnoreCase("Select")) {
		 				pass(driver,"Column Value selected when click Enter in the field sort");
		 			}else {
		 				fail(driver,"Column Value not selected when click Enter in the field sort");
		 			}
		 			
		 		}
		 		
	    	}
	    	
		}
		setTestCaseID("TC_COLUMN_060");
		mouseOverAndClick(driver,sortType);
		selectByText(driver,sortType,"Quick Sort");
		click(driver,quickSortBytext);
		waitForElement(driver,SelectOption);
		click(driver,SelectOption);
		scrollUsingElement(driver, ApplyButton);
		click(driver,ApplyButton);
		
		if(isDisplayed(driver,sortError)) {
			pass(driver,"'Kindly select any column to perform sort', Error Displayed When sortBy input not selected");
		}else {
			fail(driver,"'Kindly select any column to perform sort', Error not Displayed When sortBy input not selected");
		}
		
		setTestCaseID("TC_COLUMN_061");
		click(driver,quickSortBytext);
		WebElement selectSort=driver.findElement(By.xpath("//ul//span[text()='"+Select_SortBy_Value+"']"));
		selectSort.click();
		String QuickSortByText=getText1(driver,quickSortBytext);
		scrollUsingElement(driver, ApplyButton);
		click(driver,ApplyButton);
		
		elementnotvisible1(driver, RPE_Loading);
		verifyElementIsPresent(driver,Chart);
		if(isDisplayed(driver,minimize)) {
        	click(driver,minimize);
        	elementnotvisible(driver,Loading);
        }
		
	
		List<WebElement> moveElements=driver.findElements(By.xpath("//div[@id='RPE_Preview']//*[name()='tspan']"));
		for(WebElement ele:moveElements) {
			Actions act3=new Actions(driver);
			try {
				act3.moveToElement(ele).build().perform();
			}catch(Exception e) {
				
			}
		}
		
		List<WebElement> charts=getWebElements(driver,chartBars);
		
        X_Selected=getText1(driver,X_Axis_Input);
        String Y_Selected=getText1(driver,Y_Axis_Input);
        
        System.out.println("X_Selected : "+X_Selected);
        System.out.println("Y_Selected : "+Y_Selected);
        String aggreagtionSelected=defaultSelectedValue(driver,aggregation);
        
        String X_SelectedString=getStringValue(X_Selected);
        String Y_SelectedString=getStringValue(Y_Selected);
         
        String Y_chartvalue=getText1(driver,Y_Value);
        if(Y_chartvalue.contains(Y_SelectedString)&& Y_chartvalue.contains(aggreagtionSelected)) {
			pass(driver,"Selected Y-Axis value with aggretaion displayed in Y-Axis in the chart ");
        }else {
     	    fail(driver,"Selected Y-Axis value with aggretaion not displayed in Y-Axis in the chart");
        }
        
        String X_chartvaluefull=getText1(driver,X_Chart_Value);
      
        if(X_chartvaluefull.equals(X_SelectedString)) {
			pass(driver,"Selected X-Axis value displayed in X-Axis in the chart ");
        }else {
     	    fail(driver,"Selected X-Axis value not displayed in X-Axis in the chart,Exp : "+X_SelectedString+" Act : "+X_chartvaluefull);
        }
		
        if(isDisplayed(driver,minimize)) {
        	click(driver,minimize);
        	elementnotvisible(driver,Loading);
        }
        
        if(defaultSizeChart>1) {
        	try {
        		graphOrderValidation2(driver,charts,QuickSortByText);
        	}catch(Exception e) {
        		System.out.println("Grpah Validation Failed");
        		e.printStackTrace();
        	}
        }
        setTestCaseID("TC_COLUMN_063");
        String sortValueBefore=getAttribute1(driver,AscDes,"value");
        click(driver,AscDescButton);
        String sortValueAfter=getAttribute1(driver,AscDes,"value");
        if(sortValueBefore.equals(sortValueAfter)) {
     	    fail(driver,"Ascending Descending not changed while click Asc/Desc button");
        }else {
     	    pass(driver,"Ascending Descending changed while click Asc/Desc button");
        }
        
        QuickSortByText=getText1(driver,quickSortBytext);
        scrollUsingElement(driver, ApplyButton);
		click(driver,ApplyButton);
		elementnotvisible1(driver, RPE_Loading);
		verifyElementIsPresent(driver,Chart);
		if(isDisplayed(driver,minimize)) {
	        	mouseOverAndClick(driver,minimize);
	        	wait(driver,"1");
		}
		mouseOverToElement(driver,DashProPage);
		wait(driver,"1");
		List<WebElement> charts1=getWebElements(driver,chartBars);
		if(defaultSizeChart>1) {
			graphOrderValidation2(driver,charts1,QuickSortByText);
		}
		// *********** Axes Validation End *************
		
		// *********** AxisTitle Validation Start *************
		String Column_Axis_Title= getCellValue("TestExecution","Testcase_Selection","Column_Axis_Title",Flag);
	   
	 	if(Column_Axis_Title.equals("Yes")) {
		   
			 setTestCaseID("TC_COLUMN_AXIS_001");
	      	 verifyElementDisplayed(driver, AxisTitle);
	  		 click(driver,AxisTitle);
	  		 wait(driver,"1");
	  		 String AxisExpand=getAttribute1(driver,AxisTitleExpand,"class");
	      	 if(AxisExpand.contains("up")) {
	  			pass(driver,"Axis Title section is Expanded after click on it");
	      	 }else {
	  			fail(driver,"Axis Title section is not Expanded after click on it");
	      	 }
	         
	      	setTestCaseID("TC_COLUMN_AXIS_002");
	      	String AxisTextColor_Act=getTextColor(driver,AxisTitleExpand);
	      	if(AxisTextColorExp.equalsIgnoreCase(AxisTextColor_Act)) {
	      		pass(driver,"Axis Title displayed in blue color after select on it");
	      	}else {
	      		fail(driver,"Axis Title displayed in blue color after select on it");
	      	}
	      	
	      	setTestCaseID("TC_COLUMN_AXIS_003");
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
	  		waitForElement(driver, chartBars);
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
	         
	      	
	  		setTestCaseID("TC_COLUMN_AXIS_004");
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
	     
	        setTestCaseID("TC_COLUMN_AXIS_005");
	     	String fontFamily_Value=getText1(driver,fontFamily_dropdown);
	     	click(driver,fontFamily_dropdown);
	     	
	     	if(isDisplayed(driver,fontFamily_DropdownExpand)) {
	        	pass(driver,"Font family dropdown is expanded after click on it");
	        	mouseOverToElement(driver,SecondValue);
	        	wait(driver,"1");
	        	setTestCaseID("TC_COLUMN_AXIS_008");
	    		String mouseHighlightColor=getTextBackgroundColor(driver,SecondValue);
	    		if(Highlight_Color_Exp.equalsIgnoreCase(mouseHighlightColor)) {
	    			pass(driver,"Mouse hovered value highlighted in blue color");
	    		}else {
	    			fail(driver,"Mouse hovered value not highlighted in blue color");
	    		}
	
	    		setTestCaseID("TC_COLUMN_AXIS_007");
	    		ScrollBarValidation1(driver,fontFamily_DropdownExpand,"Font Family");
	    		setTestCaseID("TC_COLUMN_AXIS_008");
	    		String selectedColorAct2=getTextBackgroundColor(driver,ListSelected);
	    		String highlightText2=getText1(driver,listSelectedText1);
	    		if((fontFamily_Value.equals(highlightText2))&&Selected_Color_Exp.equals(selectedColorAct2)) {
	    			 pass(driver,"Selected Value Highlighted in Grey Color");
	    		}else {
	         	    fail(driver,"Selected Value not Value Highlighted in Grey Color");
	    		}
	    		
	    		setTestCaseID("TC_COLUMN_AXIS_006");
	         	List<WebElement> beforeSearchResults=getWebElements(driver,fontFamilyResults);
	         	int beforeSearchSize=beforeSearchResults.size();
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
	         	List<WebElement> afterSearchResults=getWebElements(driver,fontFamilyResults);
	         	int afterSearchSize=afterSearchResults.size();
	            String resultText=getText1(driver,fontFamilyFirstResult);
	            if((beforeSearchSize>afterSearchSize)&&resultText.equals(ChangeFontFamily_AxisTitle)) {
	   			 pass(driver,"Search input in the Font Family dropdown works properly");
	            }else {
	         	    fail(driver,"Search input in the Font Family dropdown not works properly");
	            }
	            setTestCaseID("TC_COLUMN_AXIS_009");
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
	    		String fontFamily_Y_Act=getFontFamily(driver,Y_Value);
	    		if(fontFamily_Y_Act.equals(ChangeFontFamily_AxisTitle)) {
	   			     pass(driver,"Selected fontFamily ("+ChangeFontFamily_AxisTitle+") Updated in Y Axis chart value");
	    		}else {
	         	    fail(driver,"Selected FontFamily ("+ChangeFontFamily_AxisTitle+") is not Updated in Y Axis chart value");
	    		}
	           	
	        }else {
	     	    fail(driver,"Font family dropdown is not expanded after click on it");
	        }
	      	
	      	
	     	setTestCaseID("TC_COLUMN_AXIS_010");
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
	       	
	       	setTestCaseID("TC_COLUMN_AXIS_011");
	       	click(driver,titleFontSizeDropdown);
	       	setTestCaseID("TC_COLUMN_AXIS_014");
	  		selectOptionValue(driver,titleFontSizeDropdown,ChangeTitleFontSize_AxisTitle);
	  		wait(driver,"1");
	  		scrollUsingElement(driver, ApplyButton);
	  		click(driver,ApplyButton);
	  		elementnotvisible1(driver, RPE_Loading);
	  		verifyElementDisplayed(driver,Chart_Section);
	  		//waitForElement(driver, ChartBarDisplayCount);
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
	  		
	  		setTestCaseID("TC_COLUMN_AXIS_015");
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
	       	setTestCaseID("TC_COLUMN_AXIS_016");
	       	click(driver,X_axisFontSizeDropdown);
	  		selectOptionValue(driver,X_axisFontSizeDropdown,Change_X_label_FontSize);
	  		scrollUsingElement(driver, ApplyButton);
	  		click(driver,ApplyButton);
	  		elementnotvisible1(driver, RPE_Loading);
	  		verifyElementDisplayed(driver,Chart_Section);
	  		//waitForElement(driver, ChartBarDisplayCount);
	  		setTestCaseID("TC_COLUMN_AXIS_019");
	     	String fontSize_X_label_Act=getFontSize(driver,X_AxisLabel_chartNew);
	     	if(Change_X_label_FontSize.equals(fontSize_X_label_Act)) {
	     		pass(driver,"Selected fontSize ("+Change_X_label_FontSize+") Updated in X Axis label chart value");
	  		}else {
	  			fail(driver,"Selected fontSize  ("+Change_X_label_FontSize+") not Updated in X Axis label chart value");
	  		}
	       	
	     	setTestCaseID("TC_COLUMN_AXIS_020");
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
	       	
	       	setTestCaseID("TC_COLUMN_AXIS_021");
	        click(driver,Y_axisFontSizeDropdown);
	  		selectOptionValue(driver,Y_axisFontSizeDropdown,Change_Y_label_FontSize);
	  		scrollUsingElement(driver, ApplyButton);
	  		click(driver,ApplyButton);
	  		elementnotvisible1(driver, RPE_Loading);
	  		verifyElementDisplayed(driver,Chart_Section);
	  		//waitForElement(driver, ChartBarDisplayCount);
	  		setTestCaseID("TC_COLUMN_AXIS_024");
	  		moveElements=driver.findElements(By.xpath("//div[@id='RPE_Preview']//*[name()='tspan']"));
			for(WebElement ele:moveElements) {
				Actions act3=new Actions(driver);
				try {
					act3.moveToElement(ele).build().perform();
				}catch(Exception e) {
					
				}
			}
	     	String fontSize_Y_label_Act=getFontSize(driver,Y_AxisLabel_chart);
	      	if(Change_Y_label_FontSize.equals(fontSize_Y_label_Act)) {
	  		    pass(driver,"Selected fontSize ("+Change_Y_label_FontSize+") Updated in Y Axis label chart value");
	  		}else {
	    	    fail(driver,"Selected fontSize ("+Change_Y_label_FontSize+") not Updated in Y Axis label chart value");
	  		}
	      	
	      	setTestCaseID("TC_COLUMN_AXIS_025");
	       	verifyElementDisplayed(driver, X_RotationText);
	       	verifyElementDisplayed(driver,X_RotationOutputValue);
	       	setTestCaseID("TC_COLUMN_AXIS_026");
	       	if(isToggleAccessible(driver, X_RotationInputSlider)) {
	       		pass(driver,"X Rotation input is Accessible");
	       	}else {
	       		fail(driver,"X Rotation input is not Accessible");
	       	}
	       	
	       	setTestCaseID("TC_COLUMN_AXIS_027");
	   		String X_RotationValueAct=getText1(driver,X_RotationOutputValue);
	   		System.out.println("X rotation : "+X_RotationValueAct);
	   		if(X_RotationValueAct.equals(defaultRotation)) {
	  			pass(driver,"By default, '"+defaultRotation+"' displayed in the X axis Rotation output field");
	   		}else {
	       	    fail(driver,"By default, '"+defaultRotation+"' is not displayed in the X axis Rotation output field");
	   		}
	  		String X_Rotation_Color_Act=getTextBackgroundColor(driver,X_RotationOutputValue);
	  		if(RotationInputColor_Exp.equalsIgnoreCase(X_Rotation_Color_Act)) {
	  			pass(driver,"X rotation output highlighted in blue color");
	  		}else {
	  			fail(driver,"X rotation output not highlighted in blue color");
	  		}
	       	
		  	setTestCaseID("TC_COLUMN_AXIS_029");
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
	  		//waitForElement(driver, ChartBarDisplayCount);
	  		setTestCaseID("TC_COLUMN_AXIS_028");
	  		String Y_label_Rotation_Act1=getRotationValue(driver,Y_AxisLabel_chart);
	     	if(X_Rotation_Input.equals(Y_label_Rotation_Act1)) {
	  		    fail(driver,"Selected X Rotation Angle ("+X_Rotation_Input+") Updated in Y Axis label chart value");
	  		}else {
	  			pass(driver,"Selected X Rotation Angle ("+X_Rotation_Input+") is not Updated in Y Axis label chart value");
	  		}
	  		
	     	setTestCaseID("TC_COLUMN_AXIS_029");
	     	String X_label_Rotation_Act=getRotationValue(driver,X_AxisLabel_chartNew);
	     	if(X_Rotation_Input.equals(X_label_Rotation_Act)) {
	 	    	 pass(driver,"Selected X Rotation Angle ("+X_Rotation_Input+") Updated in X Axis label chart value");
	  		}else {
	  			fail(driver,"Selected X Rotation Angle ("+X_Rotation_Input+") is not Updated in X Axis label chart value");
	  		}
      	
	     	setTestCaseID("TC_COLUMN_AXIS_030");
	       	verifyElementDisplayed(driver, Y_RotationText);
	       	if(verifyElementDisplayed(driver,Y_RotationOutputValue)) {
	       		String Y_RotationValueAct=getText1(driver,Y_RotationOutputValue);
	       		System.out.println("Y rotation : "+Y_RotationValueAct);
	       		if(Y_RotationValueAct.equals(defaultRotationY)) {
	      			pass(driver,"By default, '"+defaultRotationY+"' displayed in the Y axis Rotation output field");
	       		}else {
	           	    fail(driver,"By default, '"+defaultRotationY+"' displayed in the Y axis Rotation output field");
	       		}
	      		String Y_Rotation_Color_Act=getTextBackgroundColor(driver,Y_RotationOutputValue);
	      		if(RotationInputColor_Exp.equalsIgnoreCase(Y_Rotation_Color_Act)) {
	      			pass(driver,"Y rotation output highlighted in blue color");
	      		}else {
	      			fail(driver,"Y rotation output not highlighted in blue color");
	      		}
	       	}
	       	
       	
	       	setTestCaseID("TC_COLUMN_AXIS_031");
	        waitForElement(driver, Y_RotationInputSlider);
	       	moveSlider(driver,Y_RotationInputSlider,Y_RotationOutputValue,Y_Rotation_Input);
	       	scrollUsingElement(driver, ApplyButton);
	  		click(driver,ApplyButton);
	  		elementnotvisible1(driver, RPE_Loading);
	  		verifyElementDisplayed(driver,Chart_Section);
	  		//waitForElement(driver, ChartBarDisplayCount);
	  		moveElements=driver.findElements(By.xpath("//div[@id='RPE_Preview']//*[name()='tspan']"));
			for(WebElement ele:moveElements) {
				Actions act3=new Actions(driver);
				try {
					act3.moveToElement(ele).build().perform();
				}catch(Exception e) {
					
				}
			}
	     	String Y_label_Rotation_Act=getRotationValue(driver,Y_AxisLabel_chart);
	     	if(Y_Rotation_Input.equals(Y_label_Rotation_Act)) {
	  		    pass(driver,"Selected Rotation Angle ("+Y_Rotation_Input+") Updated in Y Axis label chart value");
	  		}else {
	  			fail(driver,"Selected Rotation Angle ("+Y_Rotation_Input+") is not Updated in Y Axis label chart value");
	  		}
	     	
	     	setTestCaseID("TC_COLUMN_AXIS_032");
	     	String X_label_Rotation_Act1=getRotationValue(driver,X_AxisLabel_chartNew);
	     	if(Y_Rotation_Input.equals(X_label_Rotation_Act1)) {
	 	    	 fail(driver,"Selected Y Rotation Angle ("+Y_Rotation_Input+") Updated in X Axis label chart value");
	  		}else {
	  			pass(driver,"Selected Y Rotation Angle ("+Y_Rotation_Input+") is not Updated in X Axis label chart value");
	  		}
      	
	       	setTestCaseID("TC_COLUMN_AXIS_033");
	       	verifyElementDisplayed(driver, switchSliderText);
	     	if(verifyElementDisplayed(driver,switchSlider)){
	   		String sliderColor=getTextBackgroundColor(driver,switchSlider);
	   		
	   		if(isToggleEnable(driver, switchSliderInput)) {
	   			fail(driver,"By default Start axis at 0 toggle enabled");
	   		}else {
	   			pass(driver,"By default Start axis at 0 toggle disabled");
	   			String x_firstAscValue=getText1(driver,X_AxisLabel_chartNew);
	   			if(!(x_firstAscValue.equals("0"))) {
	      			pass(driver,"X axis label value not started from '0' in the chart, When 'Start axis at 0' toggle is disabled");
	          	}else {
	      			pass(driver,"X axis label value started from '0' in the chart, When 'Start axis at 0' toggle is disabled");
	          	}
	   			
	   			List<WebElement> yValues=getWebElements(driver,Y_AxisLabel_chart_Values);
	       		int lastsize=yValues.size()-1;
	       		String y_firstDesValue=yValues.get(lastsize).getText();
	       		String y_firstAscValue=getText1(driver,Y_AxisLabel_chart_1new);
	         	
	       		String sortOrderType=getAttribute1(driver,AscDes,"value");
	       		if(sortOrderType.equals("desc")) {
	       			if(!(y_firstAscValue.equals("0"))) {
	       				pass(driver,"Y axis label value not start from 0 in the chart, when toogle is disabled");
	       			}else {
	       				pass(driver,"Y axis label value started from 0 in the chart when toogle is disabled");
	       			}	
	       		}else {
	       			if(!(y_firstDesValue.equals("0"))) {
	       				pass(driver,"Y axis label value not start from 0 in the chart, when toogle is disabled");
	       			}else {
	       				pass(driver,"Y axis label value started from 0 in the chart when toogle is disabled");
	       			}
	          	
	       		}
	   		}
	         	    
	   		click(driver,switchSlider);
           	scrollUsingElement(driver, ApplyButton);
  		  	click(driver,ApplyButton);
	  		elementnotvisible1(driver, RPE_Loading);
	  		verifyElementDisplayed(driver,Chart_Section);
	  		//waitForElement(driver, ChartBarDisplayCount);
	     	    
     	    String x_firstAscValue=getText1(driver,Column_X_Labels_Chart);
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
	 	setTestCaseID("");
		// ******************** AxisTitle Validation End *******************
	   
	   // ******************** ChartTitle Validation Start *******************
      	 String Column_Chart_Title= getCellValue("TestExecution","Testcase_Selection","Column_Chart_Title",Flag);
        if(Column_Chart_Title.equals("Yes")) {
       	 	CHART_TITLE chartTitle=new CHART_TITLE();
            chartTitle.chartTitleTest(driver, TypeBackgroundColor1, TypeTextColor1, Change_FontFamily_ChartTitle, ChangeFontSize_ChartTitle,ChangeChartTitleName);       	
        }
       // ******************** ChartTitle Validation End *******************
	   
	   
	 //********** ChartStyle Validation Start *************************
       
	    setTestCaseID("TC_COLUMN_CHART_STYLE_001");
        verifyElementDisplayed(driver,Chart_FormatSec);
		click(driver,Chart_FormatSec);
		
     	String Column_Chart_Style= getCellValue("TestExecution","Testcase_Selection","Column_Chart_Style",Flag);
        if(Column_Chart_Style.equals("Yes")) {
        	setTestCaseID("TC_COLUMN_CHART_STYLE_002");
	      	 String ChartFormatOpenstatus=getAttribute1(driver, chartFormatExpand, "class");
	  		 if(ChartFormatOpenstatus.contains("up")) {
	  			pass(driver,"Chart Format is expanded when clicking the Chart Format");
	  		 }else {
	  			fail(driver,"Chart Format is not expanded when click the Chart Format");
	  			
	  		 }
	  		 //ChartFormatColorExp
	  		 String ChartFormatColor=getTextColor(driver, Chart_FormatSec);
	  		 if(ChartFormatColor.equalsIgnoreCase(ChartFormatColorExp)) {
	  			pass(driver,"Chart Format gets highlighted in blue Color after it expands");
	  		 }else {
	  			fail(driver,"Chart Format not highlighted in blue Color after it expands"); 
	  		 }
	  		 
	  		 verifyElementDisplayed(driver,ChartStyling); 
	  		 setTestCaseID("TC_COLUMN_CHART_STYLE_003");
 			 String ChartStylingColor_Act=getTextColor(driver, ChartStyling);
 			 if(ChartStylingColor_Exp.equalsIgnoreCase(ChartStylingColor_Act)) {
 				pass(driver,"Chart Styling gets highlighted in blue color ");
 			 }else {
 				fail(driver,"Chart Styling not highlighted in blue color"); 
 			 }
 	  		 setTestCaseID("TC_COLUMN_CHART_STYLE_004");

  			 String ChartStylingText_Act=getText1(driver,ChartStyling);
  			 String ChartStylingExpand=getAttribute1(driver, ChartStyling_Expand, "class");
  			 if(ChartStylingExpand.contains("up")) {
  				pass(driver,"By default, Chart Styling gets Expanded");
  			 }else {
  				fail(driver,"By default, Chart Styling not gets Expand");
  			 }
  			
  			 setTestCaseID("TC_COLUMN_CHART_STYLE_005");
  			 verifyElementDisplayed(driver,ChartThemeText);
  			 verifyElementDisplayed(driver,ChartThemeInput);
  			   	
  			 verifyElementDisplayed(driver,X_ScrollText);
  			 verifyElementDisplayed(driver,X_ScrollInputSlider);
  			
  			 verifyElementDisplayed(driver,Y_ScrollText);
  			 verifyElementDisplayed(driver,Y_ScrollInputSlider);
  			
  			 verifyElementDisplayed(driver,Auto_ScrollText);
  			 verifyElementDisplayed(driver,Auto_ScrollInputSlider);
  			
  			 verifyElementDisplayed(driver,EnableGridText);
  			 verifyElementDisplayed(driver,EnableGrid_InputSlider);
  			 
  			 verifyElementDisplayed(driver,X_Label_Position_Input);
  			 verifyElementDisplayed(driver,Grid_Distance_Input);

  			 setTestCaseID("TC_COLUMN_CHART_STYLE_006");
  			 String defaultThemeValue_Act=getText1(driver,ChartThemeInput);
  			 if(defaultThemeValue_Act.equals(DefaultThemeValue_Exp)) {
  				 pass(driver,"By default, Chart theme selected the value as '"+DefaultThemeValue_Exp+"'");
  			 }else {
  				 fail(driver,"By default, '"+DefaultThemeValue_Exp+"' value not selected in the  Chart theme input");
  			 }
  			 setTestCaseID("TC_COLUMN_CHART_STYLE_007");
  			 click(driver,ChartThemeInput);
  			 if(verifyElementDisplayed(driver,ChartThemeResults)) {
  				 pass(driver,"Chart theme dropdown opened and displayed list of chart themes");
  				 mouseOverToElement(driver,ThirdValue);
  				 wait(driver,"1");
  				 setTestCaseID("TC_COLUMN_CHART_STYLE_010");
  				 String mouseHighlightColor=getTextBackgroundColor(driver,ThirdValue);
  				 if(Highlight_ColorStyle_Exp.equalsIgnoreCase(mouseHighlightColor)) {
  					 pass(driver,"Mouse hovered value highlighted in blue color");
  				 }else {
  					 fail(driver,"Mouse hovered value not highlighted in blue color");
  				 }
  			
  				 setTestCaseID("TC_COLUMN_CHART_STYLE_011");
  				 ScrollBarValidation1(driver,ChartThemeResults,"Chart Theme");
  			
  				 List<WebElement> beforeSearchResults=getWebElements(driver,chartThemeResultList);
  				 int beforeSearchSize=beforeSearchResults.size();
  				 setTestCaseID("TC_COLUMN_CHART_STYLE_008");
  				 verifyElementIsPresent1(driver,dropdownInputsearchBox);
  				 click(driver,dropdownInputsearchBox);
  				 setTestCaseID("TC_COLUMN_CHART_STYLE_009");
  				 sendKeys(driver,dropdownInputsearchBox,"sdgffh");
  				 String inValidResult=getText1(driver,chartThemeFirstResult);
  				 if(inValidResult.equals("No results found")) {
  					 pass(driver,"'No results found' displayed when user enter incorrect chart theme");
  				 }else {
  					 fail(driver,"'No results found' not displayed when user enter incorrect chart theme");
  				 }
  			       	
  				 setTestCaseID("TC_COLUMN_CHART_STYLE_008");
  				 clear1(driver,dropdownInputsearchBox);
  				 sendKeys(driver,dropdownInputsearchBox,Change_ChartTheme_ChartStyle);
  				 List<WebElement> afterSearchResults=getWebElements(driver,chartThemeResultList);
  				 int afterSearchSize=afterSearchResults.size();
  				 String resultText=getText1(driver,chartThemeFirstResult);
  				 if((beforeSearchSize>afterSearchSize)&&resultText.equals(Change_ChartTheme_ChartStyle)) {
  					 pass(driver,"Search input in the Chart Theme dropdown works properly");
  				 }else {
  					 fail(driver,"Search input in the Chart Theme dropdown not works properly");
  				 }
  			     
  				 setTestCaseID("TC_COLUMN_CHART_STYLE_013");
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
  				 
  				setTestCaseID("TC_COLUMN_CHART_STYLE_012");
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
  			
  			 setTestCaseID("TC_COLUMN_CHART_STYLE_014");
  			 if(isToggleEnable(driver,AutoScroll_toggle)) {
  				 pass(driver,"By default, 'AutoScroll' toggle is enabled");
  				 setTestCaseID("TC_COLUMN_CHART_STYLE_015");
  				 if(isToggleEnable(driver,X_Scroll_toggle)) {
  					 fail(driver,"X Scroll toggle not disabled when AutoScroll toggle is enabled , X Value : "+X_Selected);
  				 }else {
  					 pass(driver,"X Scroll toggle disabled when AutoScroll toggle is enabled");
  				 }
  			  		   
  				 if(isToggleEnable(driver,Y_Scroll_toggle)) {
  					 fail(driver,"Y Scroll toggle not disabled when AutoScroll toggle is enabled for the Y_Value : "+Y_Selected);
  				 }else {
  					 pass(driver,"Y Scroll toggle disabled when AutoScroll toggle is enabled for the Y_Value : "+Y_Selected);
  				 }
  			  		   
  			 }else {
  				 fail(driver,"By default, 'AutoScroll' toggle is not enabled");
  			 }
  			   	
  			 setTestCaseID("TC_COLUMN_CHART_STYLE_016");
  			 if(isToggleAccessible(driver,X_Scroll_toggle) && isToggleAccessible(driver,Y_Scroll_toggle)){
  				 fail(driver,"X Scroll and Y Scroll toggle accessible when AutoScroll toggle is enabled");
  			 }else {
  				 pass(driver,"X Scroll and Y Scroll toggle not accessible when AutoScroll toggle is enabled");
  			 }
  			 
  			 setTestCaseID("TC_COLUMN_CHART_STYLE_016");
  			 click(driver,Auto_ScrollInputSlider);
  			 if(isToggleEnable(driver,AutoScroll_toggle)){
  				 fail(driver,"'Auto Scroll' toggle not disabled when click on it");
  			 }else {
  				 pass(driver,"'Auto Scroll' toggle disabled when click on it");
  			 }
  			   	
  			 if(isToggleAccessible(driver,X_Scroll_toggle) && isToggleAccessible(driver,Y_Scroll_toggle)){
  				 pass(driver,"X Scroll and Y Scroll toggle accessible when AutoScroll toggle is disabled");
  			 }else {
  				 fail(driver,"X Scroll and Y Scroll toggle not accessible when AutoScroll toggle is disabled");
  			 }
  			   	
//  			 click(driver,X_ScrollInputSlider);
//  			 if(isToggleEnable(driver,X_Scroll_toggle)){
//  				 pass(driver,"X Scroll toggle enabled when click on it");
//  			 }else {
//  				 fail(driver,"X Scroll toggle not enabled when click on it");
//  			 }
  			   	
  			 boolean X_ScrollEnable=false;
  			 if(isToggleEnable(driver,X_Scroll_toggle)){
  				X_ScrollEnable=true;
  			 }else {
  				 click(driver,X_ScrollInputSlider);
  				 wait(driver,"1");
  				 if(isToggleEnable(driver,X_Scroll_toggle)){
  					 pass(driver,"X Scroll toggle enabled when enabling it");
  					X_ScrollEnable=true;
  				 }else {
  					 fail(driver,"X Scroll toggle not enabled when enabling it");
  				 }
  			 }
  			 
  			 boolean Y_ScrollEnable=false;
   			 if(isToggleEnable(driver,Y_Scroll_toggle)){
   				 //pass(driver,"Y Scroll toggle enabled when click on it");
   				 Y_ScrollEnable=true;
   			 }else {
   				 //fail(driver,"Y Scroll toggle not enabled when click on it");
   				 click(driver,Y_ScrollInputSlider);
   				 wait(driver,"1");
   				 if(isToggleEnable(driver,Y_Scroll_toggle)){
   					 pass(driver,"Y Scroll toggle enabled when enabling it");
   					 Y_ScrollEnable=true;
   				 }else {
   					 fail(driver,"Y Scroll toggle not enabled when enabling it");
   				 }
   			 }
   			   	
  			 scrollUsingElement(driver, ApplyButton);
  			 click(driver,ApplyButton);
  			 elementnotvisible1(driver, Loading);
  			 elementnotvisible1(driver, RPE_Loading);
  			 verifyElementDisplayed(driver,Chart_Section);
  			
  			 if(X_ScrollEnable==true) {
  				if(isDisplayed(driver,X_Scroll_Bar)) {
  	  				 pass(driver,"X Scroll Bar is displayed in the chart after enabling it");
  	  			 }else {
  	  				 fail(driver,"X Scroll Bar is not displayed in the chart after enabling it");
  	  			 }
  			 }
  			 
  			 if(Y_ScrollEnable==true) {
  				 if(isDisplayed(driver,Y_Scroll_Bar)) {
  					 pass(driver,"Y Scroll Bar is displayed in the chart after enabling it");
  				 }else {
  					 fail(driver,"Y Scroll Bar is not displayed in the chart after enabling it");
  				 }
  			 }
  			 
  			 click(driver,Auto_ScrollInputSlider);
  			 wait(driver,"1");
  			   	
  			 if(isToggleEnable(driver,X_Scroll_toggle) && isToggleEnable(driver,Y_Scroll_toggle)){
  				 fail(driver,"X Scroll and Y Scroll toggle not automatically disabled when enabling the AutoScroll toggle");
  			 }else {
  				 pass(driver,"X Scroll and Y Scroll toggle automatically disabled when enabling the AutoScroll toggle");
  			 }
  			   	
  			setTestCaseID("TC_COLUMN_CHART_STYLE_018");
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
  				
  				 setTestCaseID("TC_COLUMN_CHART_STYLE_019");
  				 click(driver,EnableGrid_InputSlider);
  				 wait(driver,"1");
  				 if(isToggleEnable(driver,EnableGrid_toggle)){
  					 fail(driver,"'Enable Grid' toggle not disabled when click on it ");
  				 }else {
  					 pass(driver,"'Enable Grid' toggle disabled when click on it ");
  				 }
  			    		
  				 setTestCaseID("TC_COLUMN_CHART_STYLE_020");
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
  	  		     click(driver,EnableGrid_InputSlider);
  			 }else {
  				 fail(driver,"By default, 'Enable Grid' toggle is not enabled");
  			 }
  		
  			 setTestCaseID("TC_COLUMN_CHART_STYLE_021");
  			 String default_XLabelPositionAct=defaultSelectedValue(driver,X_Label_Position_Input);
  			 if(Default_X_Label_Position_Column.equals(default_XLabelPositionAct)) {
  				 pass(driver,"By default "+Default_X_Label_Position_Column+" is displayed in the X Label Position input");
  			 }else {
  				 fail(driver,"By default "+Default_X_Label_Position_Column+" is not displayed in the X Label Position input");
  			 }
  			 
  			setTestCaseID("TC_COLUMN_CHART_STYLE_022");
  			 if(isToggleAccessible(driver, X_Label_Position_Input)) {
  				 pass(driver,"X_Label_Position_Input is Accessible");
  			 }else {
  				 fail(driver,"X_Label_Position_Input is not Accessible");
  			 }
  			 
  			 setTestCaseID("TC_COLUMN_CHART_STYLE_023");
  			 click(driver,X_Label_Position_Input);
  			
  			setTestCaseID("TC_COLUMN_CHART_STYLE_024");
  			 selectByText(driver, X_Label_Position_Input, Change_X_Label_Position_Style);
  			 wait(driver,"1");
  			 String afterselect=defaultSelectedValue(driver, X_Label_Position_Input);
  			 if(afterselect.equals(Change_X_Label_Position_Style)) {
  				 pass(driver,"Selected X_Label_Position Value is updated correctly");
   			 }else {
   				 fail(driver,"Selected X_Label_Position Value is not updated correctly");
   			 }
  			 
  			 setTestCaseID("TC_COLUMN_CHART_STYLE_027");
  			 String defaultGrid_distance_Act=defaultSelectedValue(driver,Grid_Distance_Input);
  			 if(Default_Grid_distance_Column.equals(defaultGrid_distance_Act)) {
  				 pass(driver,"By default "+Default_Grid_distance_Column+" is displayed in the Grid Distance Input");
  			 }else {
  				 fail(driver,"By default "+Default_Grid_distance_Column+" is not displayed in the Grid Distance Input");
  			 }
  			 
  			 setTestCaseID("TC_COLUMN_CHART_STYLE_028");
  			 if(isToggleAccessible(driver, Grid_Distance_Input)) {
 				 pass(driver,"Grid_Distance_Input is Accessible");
 			 }else {
 				 fail(driver,"Grid_Distance_Input is not Accessible");
 			 }
  			 setTestCaseID("TC_COLUMN_CHART_STYLE_029");
  			 click(driver,Grid_Distance_Input);
  			 
  			 selectByText(driver, Grid_Distance_Input, Change_Grid_Distance);
  			 wait(driver,"1");
  			 setTestCaseID("TC_COLUMN_CHART_STYLE_030");
  			 String afterselectGrid=defaultSelectedValue(driver, Grid_Distance_Input);
  			 if(afterselectGrid.equals(Change_Grid_Distance)) {
  				 pass(driver,"Selected Value is displayed in the Grid_Distance_Input");
  			 }else {
  				 fail(driver,"Selected Value is not displayed in the Grid_Distance_Input");
  			 }

  			 setTestCaseID("TC_COLUMN_CHART_STYLE_031");
  			 click(driver,ChartStyling);
  			 wait(driver,"1");
  			 String chartStyleClose_Act=getAttribute1(driver, ChartStyling_Expand, "class");
  			 if(chartStyleClose_Act.contains("down")) {
  				 pass(driver,"Chart styling gets collapsed when click on it");
  			 }else {
  				 fail(driver,"Chart styling not gets collapsed when click on it");
  			 }
	  		 
       }
		 //*********** ChartStyle validation end ************
	
       // ********** DataLabel Validation Start ***************
      String Column_Data_Labels= getCellValue("TestExecution","Testcase_Selection","Column_Data_Labels",Flag);
      if(Column_Data_Labels.equals("Yes")) {
    	 setTestCaseID("TC_COLUMN_DATA_LABEL_001");
      	 verifyElementDisplayed(driver,DataLabels);
  		 scrollUsingElement(driver,DataLabels);
  		 String DataLabelsExpand=getAttribute1(driver, DataLabels_Expand, "class");
  		 if(DataLabelsExpand.contains("up")) {
  			pass(driver,"By default, Data Labels gets Expanded");
  		 }else {
  			fail(driver,"By default, Data Labels not gets Expand");
  			//click(driver,DataLabels);
  		 }
  	     setTestCaseID("TC_COLUMN_DATA_LABEL_002");
  		 String DataLabelsColor_Act=getTextColor(driver, DataLabels);
  		 if(DataLabelsColor_Exp.equalsIgnoreCase(DataLabelsColor_Act)) {
  			pass(driver,"Data Labels gets displayed in blue color");
  		 }else {
  			fail(driver,"Data Labels not displayed in blue color"); 
  		 }
  		 
  		 //Validation of the visibility of data label options start...
  		 setTestCaseID("TC_COLUMN_DATA_LABEL_003");
  		 verifyElementDisplayed(driver,EnableValue_text);
  		 verifyElementIsPresent1(driver, EnableValue_InputSlider);

  		 verifyElementDisplayed(driver,ValueFormat_text);
  		 verifyElementIsPresent1(driver,ValueFormatInput);
       
  		 verifyElementDisplayed(driver,Seperator_text);
  		 verifyElementIsPresent1(driver,SeperatorInput);
  		
  		 verifyElementDisplayed(driver,ValueFontSize_text);
  		 verifyElementIsPresent1(driver,ValueFontSizeInput);
       
  		 verifyElementDisplayed(driver,RoundOffValue_text);
  		 verifyElementIsPresent1(driver,RoundOffValueInput);
       
  		 verifyElementDisplayed(driver,Position_text);
  		 verifyElementIsPresent1(driver,PositionInput);
       
  		 verifyElementDisplayed(driver,BigNumberSuffix_text);
  		 verifyElementIsPresent1(driver,BigNumberInput);
       
  		 verifyElementDisplayed(driver,ShowAsPositive_text);
  		 verifyElementIsPresent1(driver,ShowPositive_Input);
     
  		 verifyElementDisplayed(driver,ValueRotation_text);
  		 verifyElementIsPresent1(driver,ValueRotation_Input);
  		 
  		 //Validation of the visibility of data label options End...
  	     
  	     //All options are inaccessible when the enable value toggle is disabled. Validation end
  		 setTestCaseID("TC_COLUMN_DATA_LABEL_004");
  	     if(isToggleEnable(driver,EnableValue_Input)) {
  	  		 fail(driver,"By Default, Enable Value toggle is enabled");
  	     }else {
  	  		 pass(driver,"By Default, Enable Value toggle is disabled");
  	  		 
  	    	 setTestCaseID("TC_COLUMN_DATA_LABEL_005");
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
  		     
  		     if(IsElementEnabled(driver,PositionInput)) {
  		  		 fail(driver,"'Position Input' is accessible when the 'Enable value' toggle is disabled.");
  		     }else {
  		  		 pass(driver,"'Position Input' is inaccessible when the 'Enable value' toggle is disabled.");
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
  	  		 
  	     }
  	     
  	     //All options are inaccessible when the enable value toggle is disabled. Validation end
  	     setTestCaseID("TC_COLUMN_DATA_LABEL_006");
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
  		// waitForElement(driver, ChartBarDisplayCount);/
  		 
  		 if(isDisplayed(driver,EnableValue)) {
  			 pass(driver,"Values enabled in charts after enabling the 'Enable Value' toggle"); 
  		 }else {
  	  		 fail(driver,"Values not enabled in charts after enabling the 'Enable Value' toggle"); 
  		 }
  		 
  		setTestCaseID("TC_COLUMN_DATA_LABEL_007");
  		 if(isToggleAccessible(driver,ValueFormatInput)) {		
  	  		 pass(driver,"'Value Format Input' is accessible after enabling the 'Enable Value' toggle"); 
  		 }else {
  	  		 fail(driver,"'Value Format Input' is not accessible after enabling the 'Enable Value' toggle");
  		 }
  		 
  		setTestCaseID("TC_COLUMN_DATA_LABEL_008");
  		 String defaultFormatValue_Act=defaultSelectedValue(driver, ValueFormatInput);
    		 if(DefaultFormatValue_Exp.equals(defaultFormatValue_Act)) {
  	  		 pass(driver,"By default, '"+DefaultFormatValue_Exp+"' is selected in the Value Format Input"); 
    		 }else {
  	  		 fail(driver,"By default, '"+DefaultFormatValue_Exp+"' is not selected in the Value Format Input"); 
    		 }
  		 
		 setTestCaseID("TC_COLUMN_DATA_LABEL_009");
		 click(driver,ValueFormatInput);
		 verifyElementIsPresent1(driver, Value_ValueFormat);
   		 verifyElementIsPresent1(driver, Percentage_ValueFormat);
	
		 setTestCaseID("TC_COLUMN_DATA_LABEL_010");
  		 selectOptionValue(driver,ValueFormatInput,"value");
  		 
  		 scrollUsingElement(driver, ApplyButton);
  		 click(driver,ApplyButton);
  		 elementnotvisible1(driver, RPE_Loading);
  		 verifyElementDisplayed(driver,Chart_Section);
  		// waitForElement(driver, ChartBarDisplayCount);
  		 
  		
  		 String ValueTextAct=getText(driver,EnableValue);       //lastChartValue.getText();  //getText1(driver,ValueFormat_ChartValue);
  		 
  		 if(ValueTextAct.endsWith("%")) {
  	  		 fail(driver,"'Value Format' is not display in the chart for 'Value' format selection");
  		 }else {
  	  		 pass(driver,"'Value Format' is displayed in the chart for 'Value' format selection");
  		 }
  		 
  		 setTestCaseID("TC_COLUMN_DATA_LABEL_011");
  		 selectOptionValue(driver,ValueFormatInput,"percentage");
  		 wait(driver,"1");
  		 scrollUsingElement(driver, ApplyButton);
		 click(driver,ApplyButton);
		 elementnotvisible1(driver, RPE_Loading);
  		 setTestCaseID("TC_COLUMN_DATA_LABEL_016");
  		 if(isToggleAccessible(driver,SeperatorInput)) {	
  			 fail(driver,"'Seperator Input' is accessible  when 'Percentage' is selected in value format");	  		
  		 }else {
  			 pass(driver,"'Seperator Input' is inaccessible  when 'Percentage' is selected in value format");
  		 }
  		 
  		 scrollUsingElement(driver, ApplyButton);
  		 click(driver,ApplyButton);
  		 elementnotvisible1(driver, RPE_Loading);
  		 verifyElementDisplayed(driver,Chart_Section);
  		 //waitForElement(driver, ChartBarDisplayCount);

  		 ValueTextAct=getText(driver,EnableValue);  
  		 if(ValueTextAct.contains("%")) {
  	  		 pass(driver,"Enabled Value in chart  is displayed in percentage when 'Percentage' is selected");
  		 }else {
  	  		 fail(driver,"Enabled Value in chart is not displayed in percentage when 'Percentage' is selected");
  		 }
  		 
  		 setTestCaseID("TC_COLUMN_DATA_LABEL_013");
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

  		setTestCaseID("TC_COLUMN_DATA_LABEL_012");
  		 String defaultSeperator_Act=defaultSelectedValue(driver,SeperatorInput);
  		 if(DefaultSeperatorValue_Exp.equals(defaultSeperator_Act)) {
  	  		 pass(driver,"By default, '"+DefaultSeperatorValue_Exp+"' is selected in the Seperator Input"); 
  		 }else {
  	  		 fail(driver,"By default, '"+DefaultSeperatorValue_Exp+"' is not selected in the Seperator Input"); 
  		 } 
         
  		setTestCaseID("TC_COLUMN_DATA_LABEL_014");
  		click(driver,SeperatorInput);
  		selectOptionValue(driver,SeperatorInput,"#,###");
  		scrollUsingElement(driver, ApplyButton);
  		click(driver,ApplyButton);
  		elementnotvisible1(driver, RPE_Loading);
  		verifyElementDisplayed(driver,Chart_Section);
  		//waitForElement(driver, ChartBarDisplayCount);
  		
//  		//new 
//  		 chartValues=getWebElements(driver, ValueFormat_ChartValue);
//  		 chartValueSize=chartValues.size();
//  		 lastChartValue=chartValues.get(chartValueSize-3);
//  		 //new
  		
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
  		
  		
  		setTestCaseID("TC_COLUMN_DATA_LABEL_015");
  		click(driver,SeperatorInput);
  		selectOptionValue(driver,SeperatorInput,"#,##");
  		scrollUsingElement(driver, ApplyButton);
  		click(driver,ApplyButton);
  		elementnotvisible1(driver, RPE_Loading);
  		verifyElementDisplayed(driver,Chart_Section);
  		//waitForElement(driver, ChartBarDisplayCount);
  		
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
  		
  		
  	
  		setTestCaseID("TC_COLUMN_DATA_LABEL_017");
  		String defaultFontSize_Act=defaultSelectedValue(driver, ValueFontSizeInput);
  		if(DefaultFontSizeValue_Exp.equals(defaultFontSize_Act)) {
  			pass(driver,"By default, '"+DefaultFontSizeValue_Exp+"' is selected in the Value Font Size Input"); 
  		}else {
  			fail(driver,"By default, '"+DefaultFontSizeValue_Exp+"' is not selected in the Value Font Size Input"); 
  		}
   		 
  		setTestCaseID("TC_COLUMN_DATA_LABEL_018");
  		if(isToggleAccessible(driver,ValueFontSizeInput)) {		
  	  		 pass(driver,"'Value FontSize Input' is accessible after enabling the 'Enable Value' toggle"); 
  	  		 
  		}else {
  	  		 fail(driver,"'Value FontSize Input' is not accessible after enabling the 'Enable Value' toggle");
  		}
  		
  		setTestCaseID("TC_COLUMN_DATA_LABEL_019");
  		click(driver,ValueFontSizeInput);
  		
  		setTestCaseID("TC_COLUMN_DATA_LABEL_022");
  		selectOptionValue(driver,ValueFontSizeInput,ChangeFontSizeValue_DataLabel);
  		scrollUsingElement(driver, ApplyButton);   
  		click(driver,ApplyButton);
  		elementnotvisible1(driver, RPE_Loading);
  		verifyElementDisplayed(driver,Chart_Section);
  		//waitForElement(driver, ChartBarDisplayCount);
  		
  		String ValueFontSizeAct=getFontSize(driver,EnableValue);
  		if(ValueFontSizeAct.equals(ChangeFontSizeValue_DataLabel)) {
  	  		 pass(driver,"The chart's value displayed with Selected '"+ChangeFontSizeValue_DataLabel+"' font size."); 
  		}else {
  	  		 fail(driver,"The chart's value not displayed with Selected '"+ChangeFontSizeValue_DataLabel+"' font size."); 
  		}
  		
  		setTestCaseID("TC_COLUMN_DATA_LABEL_023");
  		String defaultRoundOffValue_Act=defaultSelectedValue(driver, RoundOffValueInput);
   		if(DefaultRoundOffValue_Exp.equals(defaultRoundOffValue_Act)) {
  	  		 pass(driver,"By default, '"+DefaultRoundOffValue_Exp+"' is selected in the RoundOffValue Input"); 
   		}else {
  	  		 fail(driver,"By default, '"+DefaultRoundOffValue_Exp+"' is not selected in the RoundOffValue Input"); 
   		}
   		
   		setTestCaseID("TC_COLUMN_DATA_LABEL_024");
  		if(isToggleAccessible(driver,RoundOffValueInput)) {		
  	  		 pass(driver,"'RoundOff Value Input' is accessible after enabling the 'Enable Value' toggle"); 
  		}else {
  	  		 fail(driver,"'RoundOff Value Input' is not accessible after enabling the 'Enable Value' toggle");
  		}
   		
  		setTestCaseID("TC_COLUMN_DATA_LABEL_025");
  	    click(driver,RoundOffValueInput);
  	    wait(driver,"1");
  	    selectByText(driver,RoundOffValueInput,ChangeRoundOffValue_DataLabel);
  	    scrollUsingElement(driver, ApplyButton);
  	    click(driver,ApplyButton);
  	    elementnotvisible1(driver, RPE_Loading);
  	    verifyElementDisplayed(driver,Chart_Section);
  		//waitForElement(driver, ChartBarDisplayCount);
  	   
  	   ChartValueTextAct=getText(driver,EnableValue);    //getText1(driver,ValueFormat_ChartValue);
  	   String RoundOffValue_Act=String.valueOf(getRoundOffValue(ChartValueTextAct));
  	   if(RoundOffValue_Act.equals(ChangeRoundOffValue_DataLabel)) {
  	  	   pass(driver,"The chart's value displayed with Selected '"+ChangeRoundOffValue_DataLabel+"' RoundOff Value"); 
  	   }else {
  	  	   fail(driver,"The chart's value not displayed with Selected '"+ChangeRoundOffValue_DataLabel+"' RoundOff Value"); 
  	   }
  	   
  	   setTestCaseID("TC_COLUMN_DATA_LABEL_027");
  	   selectByText(driver,RoundOffValueInput,"Select");
  	   if(isToggleAccessible(driver,PositionInput)) {		
  	  		 pass(driver,"'Position Input' is accessible after enabling the 'Enable Value' toggle"); 
  		}else {
  	  		 fail(driver,"'Position Input' is not accessible after enabling the 'Enable Value' toggle");
  		}
  	   
  	   setTestCaseID("TC_COLUMN_DATA_LABEL_026");
  	   String defaultPosition_Act=defaultSelectedValue(driver, PositionInput);
  	   if(DefaultPositionValue_Exp.equals(defaultPosition_Act)) {
  		   pass(driver,"By default, '"+DefaultPositionValue_Exp+"' is selected in the Position Input"); 
  	   }else {
  		   fail(driver,"By default, '"+DefaultPositionValue_Exp+"' is not selected in the Position Input"); 
  	   }
  	   
  	   setTestCaseID("TC_COLUMN_DATA_LABEL_028");
  	   if(isDisplayed(driver,minimize)) {
     	   click(driver,minimize);
       }
  	   wait(driver,"1");
  	   List<WebElement> moveBars=getWebElements(driver, charts_Bar);
  	   for(WebElement ele:moveBars) {
  			Actions act3=new Actions(driver);
  			try {
  				act3.moveToElement(ele).build().perform();
  			}catch(Exception e) {
  				
  			}
  	   }
  	   
  	   boolean chartValuePositionAct=validateElementPosition2(driver,Displayed_FirstColumnBatr,EnableValue,"inside");
  	   if(chartValuePositionAct==true) {
  	  		pass(driver,"By default, Chart value displayed inside the chartbar for position selected as 'inside' condition"); 
  	   }else {
  	  		fail(driver,"By default, Chart value is not displayed inside the chartbar for position selected as 'inside' condition"); 
  	   }
  	   
       setTestCaseID("TC_COLUMN_DATA_LABEL_029");
  	   click(driver,PositionInput);
  	   selectOptionValue(driver,PositionInput,"center");
  	   scrollUsingElement(driver, ApplyButton);
  	   click(driver,ApplyButton);
  	   elementnotvisible1(driver, RPE_Loading);
  	   verifyElementDisplayed(driver,Chart_Section);
	  	 if(isDisplayed(driver,minimize)) {
	   	   click(driver,minimize);
	     }
	   wait(driver,"1");
  	 //  waitForElement(driver, ChartBarDisplayCount);
  	   
  	   moveBars=getWebElements(driver, charts_Bar);
  	   for(WebElement ele:moveBars) {
  			Actions act3=new Actions(driver);
  			try {
  				act3.moveToElement(ele).build().perform();
  			}catch(Exception e) {
  				
  			}
  	   }
  	   
  	   wait(driver,"1");
  	   chartValuePositionAct=validateElementPosition2(driver,Displayed_FirstColumnBatr,EnableValue,"center");
  	   if(chartValuePositionAct==true) {
  	  		pass(driver,"Chart value displayed center the chartbar for position selected as 'center' condition"); 
  	   }else {
  	  		fail(driver,"Chart value is not displayed center the chartbar for position selected as 'center' condition"); 
  	   }

  	   setTestCaseID("TC_COLUMN_DATA_LABEL_030");
  	   selectOptionValue(driver,PositionInput,"outside");
  	   scrollUsingElement(driver, ApplyButton);
  	   click(driver,ApplyButton);
  	   verifyElementDisplayed(driver,Chart_Section);
	  	 if(isDisplayed(driver,minimize)) {
	   	     click(driver,minimize);
	     }
	   wait(driver,"1");
//  	   moveBars=getWebElements(driver, charts_Bar);
//	   for(WebElement ele:moveBars) {
//			Actions act3=new Actions(driver);
//			try {
//				act3.moveToElement(ele).build().perform();
//			}catch(Exception e) {
//				
//			}
//	   }
	   
	   //changed...
	   chartValuePositionAct=validateElementPosition2(driver,charts_Bar,EnableValue,"outside");
	   if(chartValuePositionAct==true) {
	  		pass(driver,"Chart value displayed outside the chartbar for position selected as 'outside' condition"); 
	   }else {
	  		fail(driver,"Chart value is not displayed outside the chartbar for position selected as 'outside' condition"); 
	   }

  	  // waitForElement(driver, ChartBarDisplayCount);
  	   // position check endd
  	   
	   setTestCaseID("TC_COLUMN_DATA_LABEL_031");
  	    selectOptionValue(driver,SeperatorInput,"#,###");
  		
  		if(isToggleAccessible(driver,BigNumberInput)) {
  			 fail(driver,"'Big Number Suffix' toggle is accessible while Seperator value is selected");
  		}else {
  			 pass(driver,"'Big Number Suffix' toggle is Inaccessible while Seperator value is selected");
  		}
  		
  		setTestCaseID("TC_COLUMN_DATA_LABEL_032");
  		selectOptionValue(driver,ValueFormatInput,"percentage");
  		scrollUsingElement(driver, ApplyButton);
  		click(driver,ApplyButton);
  		elementnotvisible1(driver, RPE_Loading);
  		//waitForElement(driver, ChartBarDisplayCount);
  		
  	    if(isToggleAccessible(driver,BigNumberInput)) {
  			 fail(driver,"'Big Number Suffix' toggle is accessible while 'Percentage'  is selected in the Value Format input");
  		}else {
  			 pass(driver,"'Big Number Suffix' toggle is Inaccessible while 'Percentage'  is selected in the Value Format input");
  		}

  	    setTestCaseID("TC_COLUMN_DATA_LABEL_033");
  	    selectOptionValue(driver,ValueFormatInput,"value");
  	    scrollUsingElement(driver, ApplyButton);
	    click(driver,ApplyButton);
	    elementnotvisible1(driver, RPE_Loading);
		selectByText(driver,SeperatorInput,"Select");
		scrollUsingElement(driver, ApplyButton);
  	    click(driver,ApplyButton);
  	    elementnotvisible1(driver, RPE_Loading);
		if(isToggleAccessible(driver,BigNumberInput)) {
			 pass(driver,"'Big Number Suffix' toggle is accessible while Seperator value is not selected");
		}else {
			 fail(driver,"'Big Number Suffix' toggle is Inaccessible while Seperator value is not selected");
		}
  	    
  	    
  	    if(isToggleAccessible(driver,BigNumberInput)) {
  			 pass(driver,"'Big Number Suffix' toggle is accessible while 'Percentage' is not selected in the Value Format input");
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
  	  						 fail(driver,"The big number suffix is not applied for enabled value in charts");
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
  					 //waitForElement(driver, ChartBarDisplayCount);
  				    
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
  	   
  	  Pattern numericalPattern = Pattern.compile("^\\d+(\\.\\d+)?$");
  	    setTestCaseID("TC_COLUMN_DATA_LABEL_034"); 
  		if(isToggleEnable(driver,ShowPositive_Input)) {
  			 fail(driver,"By default, 'Show As Positive' toggle is enabled");
  	    }else {
  			 pass(driver,"By default, 'Show As Positive' toggle is disabled");
  			 String X_StartValue=getText1(driver,Column_X_Labels_Chart);
  			 if(X_StartValue.startsWith("-")) {
  				 pass(driver,"Chart started with negative value when 'Show positive' toogle is disabled");
  			 }else {
  				 pass(driver,"Chart not started with negative value when 'Show positive' toogle is disabled");
  			 }
  		}
  		setTestCaseID("TC_COLUMN_DATA_LABEL_035");
  		click(driver,ShowPositive_InputSlider);
  		if(isToggleEnable(driver,ShowPositive_Input)) {
  			 pass(driver,"'Show As Positive' toggle is enabled while enabling it");
  			 scrollUsingElement(driver, ApplyButton);
  			 click(driver,ApplyButton);
  			 elementnotvisible1(driver, RPE_Loading);
  			// waitForElement(driver, ChartBarDisplayCount);
  		     	
       		 String	X_StartValue=getText1(driver,Column_X_Labels_Chart);
       		 if(numericalPattern.matcher(X_StartValue).matches()) {
       			if(X_StartValue.startsWith("-")) {
          			 pass(driver,"Chart not started with positive value when 'Show positive' toogle is enabled");
          		 }else {
     				pass(driver,"Chart  started with positive value when 'Show positive' toogle is enabled");
          		 }
       		 }
       		 
  	    }else {
  			 fail(driver,"'Show As Positive' toggle is not enabled while enabling it");
  	    }
  	    
  		setTestCaseID("TC_COLUMN_DATA_LABEL_036");
  		if(isToggleAccessible(driver,ValueRotation_Input)) {
  			 pass(driver,"Value rotation is accessible after enabling the 'Enable Value' toggle");
  		}else {
  			 fail(driver,"Value rotation is Inaccessible after enabling the 'Enable Value' toggle");
  		}
  		
  		//setTestCaseID("TC_COLUMN_DATA_LABEL_036");
  		String defaultRotationValue_Act=getText1(driver,ValueRotation_Output);
  		if(DefaultRotationValue_Exp.equals(defaultRotationValue_Act)) {
  			 pass(driver,"By default, '"+DefaultRotationValue_Exp+"' is displayed in value rotation output");
  		}else {
  			 fail(driver,"By default, '"+DefaultRotationValue_Exp+"' is not displayed in value rotation output");
  		}
  		
  		setTestCaseID("TC_COLUMN_DATA_LABEL_037");
  		moveSlider(driver,ValueRotation_Input,ValueRotation_Output,ChangeRotataionVal_Positive_DataLabel);
  		scrollUsingElement(driver, ApplyButton);
  		click(driver,ApplyButton);
  		elementnotvisible1(driver, RPE_Loading);
       	wait(driver,"1");
       //	waitForElement(driver, ChartBarDisplayCount);
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
       //	waitForElement(driver, ChartBarDisplayCount);
       	chartValueRotation_Act=getRotationValue(driver,EnableValue);
       	if(chartValueRotation_Act.equals(ChangeRotataionVal_Negative_DataLabel)) {
  		    pass(driver,"Selected Negative Rotation Angle ("+ChangeRotataionVal_Negative_DataLabel+") is Updated in chart value");
  		}else {
  	       	fail(driver,"Selected Negative Rotation Angle ("+ChangeRotataionVal_Negative_DataLabel+") is not Updated in chart value");
  		}
    
	       	setTestCaseID("TC_COLUMN_DATA_LABEL_038");
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
        
      String Column_ChartFormat_Others= getCellValue("TestExecution","Testcase_Selection","Column_ChartFormat_Others",Flag);

      if(Column_ChartFormat_Others.equals("Yes")) {
    	  setTestCaseID("TC_COLUMN_OTHERS_001");
     	 verifyElementDisplayed(driver,ChartFormat_Others);
 		 scrollUsingElement(driver,ChartFormat_Others);
 		 String OthersExpand=getAttribute1(driver, ChartFormat_OthersExpand, "class");
 		 if(OthersExpand.contains("up")) {
 			pass(driver,"By default, 'Others' gets Expanded");
 		 }else {
 			fail(driver,"By default, 'Others' not gets Expand");
 		 }
 		setTestCaseID("TC_COLUMN_OTHERS_002");
 		 String Others_Color_Act=getTextColor(driver, ChartFormat_Others);
 		 if(Others_Color_Exp.equalsIgnoreCase(Others_Color_Act)) {
 			pass(driver,"'Others' gets displayed in blue color");
 		 }else {
 			fail(driver,"'Others' not displayed in blue color");
 		 }
 		
 		setTestCaseID("TC_COLUMN_OTHERS_003");
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
 		 
 		setTestCaseID("TC_COLUMN_OTHERS_004");
 		 String default_StatslineValueAct=defaultSelectedValue(driver, StatsLine_Input);
   		 if(default_StatslineValueExp.equals(default_StatslineValueAct)) {
 	  		 pass(driver,"By default, '"+default_StatslineValueExp+"' is selected in the StatusLine Input"); 
 	  		 
 	  		setTestCaseID("TC_COLUMN_OTHERS_005");
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
 	 		
 	 		setTestCaseID("TC_COLUMN_OTHERS_015");
 	 		if(isDisplayed2(driver, statsLineColorInput)) {
 		  		 fail(driver,"'StatsLineColor Input' is displayed without enable stats line"); 
 	 		}else {
 		  		 pass(driver,"'StatsLineColor Input' is not displayed without enable stats line"); 
 	 		}
 	 		
   		 }else {
 	  		 fail(driver,"By default, '"+default_StatslineValueExp+"' is not selected in the StatusLine Input"); 
   		 }
   		setTestCaseID("TC_COLUMN_OTHERS_006");
   		 click(driver,StatsLine_Input);
   		 String[] statLineValue= {"q1","q3","mean","median","std deviation","min","max"};
   		
   		setTestCaseID("TC_COLUMN_OTHERS_008");
   		for(int i=0;i<statLineValue.length;i++) {
   			
 	  	  	try {
 	  	  		selectOptionValue(driver,StatsLine_Input,statLineValue[i]);
 	  	  		wait(driver,"1");
 	  	  		String selectedStatsLine=getTextJavascript(driver, StatsLine_Input);
 	  	  		scrollUsingElement(driver, ApplyButton);
 	  	  		click(driver,ApplyButton);
 	  	  		elementnotvisible1(driver, RPE_Loading);
 	  	  		verifyElementDisplayed(driver,Chart_Section);
 	  	  		//waitForElement(driver, ChartBarDisplayCount);
 			
 	  	  		if(isDisplayed(driver,StatsLine_Chart)) {
 	  	  			pass(driver,"StatsLine is displayed in the chart for the Condition : "+selectedStatsLine);
 	  	  		}else {
 	  	  			fail(driver,"StatsLine is not displayed in the chart for the Condition : "+selectedStatsLine);
 	  	  		}
   			} catch (Exception e1) {
   				
   			}
   		}
   		 
   		 
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
 	  		//waitForElement(driver, ChartBarDisplayCount);
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
  		
   		selectOptionValue(driver,StatsLine_Input,"q1");
   		scrollUsingElement(driver, ApplyButton);
   		click(driver,ApplyButton);
   		elementnotvisible1(driver, RPE_Loading);
   		setTestCaseID("TC_COLUMN_OTHERS_017");
   		if(isDisplayed(driver, statsLineColorInput)) {
 	  		 pass(driver,"'StatsLineColor Input' is displayed when selecting the StatsLine Value"); 
 	  		setTestCaseID("TC_COLUMN_OTHERS_016");
 	  		 String defaultStatsLineColor_Act=getTextJavascript(driver, statsLineColorInput);
 	  		 if(defaultStatsLineColor_Exp.equals(defaultStatsLineColor_Act)) {
 		  		 pass(driver,"By default, '"+defaultStatsLineColor_Exp+"' color is display in StatsLine Color Input"); 
 	  		 }else {
 		  		 fail(driver,"By default, '"+defaultStatsLineColor_Exp+"' color is not display in StatsLine Color Input"); 
 	  		 }
 	  		 
 	  		 setTestCaseID("TC_COLUMN_OTHERS_018");
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
 	  		 
 	  		 if(verifyElementDisplayed(driver, StatsLine_Chart)){
 	  			String ChartStatsLineColorRGB=getWebElement(driver, StatsLine_Chart).getCssValue("stroke");  
 	  			String appliedStatsLineColor=rgbToHex1(ChartStatsLineColorRGB);
 	  			if(appliedStatsLineColor.equalsIgnoreCase(ChangeStatsLine_Color)) {
 					 pass(driver,"Selected Color '"+ChangeStatsLine_Color+"' is applied in the displayed StatsLine in the chart");
   				}else {
 					 fail(driver,"Selected Color '"+ChangeStatsLine_Color+"' is not applied in the displayed StatsLine in the chart");
   				}
 	  		 }
 	  		 
 	  		 clear1(driver,statsLineColorInput);
 	  		 wait(driver,"1");
 	  		 String StatsColorAfterClear=getTextJavascript(driver, statsLineColorInput);
 	  		 if(StatsColorAfterClear.equalsIgnoreCase(defaultStatsLineColor_Exp)) {
 	  			 pass(driver," Default color is displayed after revert the color ");
 	  			 scrollUsingElement(driver, ApplyButton);
 		  		 click(driver,ApplyButton);
 		  		 elementnotvisible1(driver, RPE_Loading);
 		  		 verifyElementDisplayed(driver,Chart_Section);
 		  		 if(verifyElementDisplayed(driver, StatsLine_Chart)){
 		  			String ChartStatsLineColorRGB=getWebElement(driver, StatsLine_Chart).getCssValue("stroke");  
 		  			String appliedStatsLineColor=rgbToHex1(ChartStatsLineColorRGB);
 		  			if(appliedStatsLineColor.equalsIgnoreCase(defaultStatsLineColor_Exp)) {
 						 pass(driver,defaultStatsLineColor_Exp+" is applied in the displayed StatsLine in the chart after revert the Color");
 	  				}else {
 						 fail(driver,defaultStatsLineColor_Exp+" is not applied in the displayed StatsLine in the chart after revert the Color");
 	  				}
 		  		 }
 		  		 
 	  		 }else {
 	  			 fail(driver," Default color is not displayed after revert the color ");
 	  		 }
 	  		 
  		}else {
 	  		 fail(driver,"'StatsLineColor Input' is not displayed when selecting the StatsLine Value"); 
  		}
   		setTestCaseID("TC_COLUMN_OTHERS_010");
   		// Position Validation start....
   		if(isToggleAccessible(driver,statsLinePosition_Input)) {		
 	  		 pass(driver,"'StatsLinePosition Input' accessible when selecting the StatsLine Value"); 
 		}else {
 	  		 fail(driver,"'StatsLinePosition Input' Inaccessible when selecting the StatsLine Value"); 
 		}
   		setTestCaseID("TC_COLUMN_OTHERS_009");
   		 String default_StatslinePosition_Act=defaultSelectedValue(driver, statsLinePosition_Input);
   		 if(default_StatslinePosition_Exp.equals(default_StatslinePosition_Act)) {
 	  		 pass(driver,"By default, '"+default_StatslinePosition_Exp+"' is selected in the StatusLine Position Input"); 
 	  		 if(isDisplayed2(driver,StrokeLineBehind)) {
 		  		 pass(driver,"StrokeLine displayed '"+default_StatslinePosition_Exp+"' the chart bars for the default selected Position "); 
 			 }else {
 		  		 fail(driver,"StrokeLine not displayed '"+default_StatslinePosition_Exp+"' the chart bars for the default selected Position "); 
 			 }
   		 }else {
 	  		 fail(driver,"By default, '"+default_StatslinePosition_Exp+"' is not selected in the StatusLine Position Input"); 
   		 }

   		setTestCaseID("TC_COLUMN_OTHERS_011");
		 selectOptionValue(driver,statsLinePosition_Input,"above");
		 scrollUsingElement(driver, ApplyButton);
 		 click(driver,ApplyButton);
 		 elementnotvisible1(driver, RPE_Loading);
 		 verifyElementDisplayed(driver,Chart_Section);
 		 
 		 if(isDisplayed2(driver,StrokeLineAbove)) {
 	  		 pass(driver,"StrokeLine displayed Above the chart bars after selected the Position as 'Above'"); 
 		 }else {
 	  		 fail(driver,"StrokeLine not displayed Above the chart bars after selected the Position as 'Above'"); 
 		 }
   		 //position Validation End
 		 
 		 
 		setTestCaseID("TC_COLUMN_OTHERS_013");
 		 //RoundOff Validation Start
   		 if(isToggleAccessible(driver,statsLineRoundOff_Input)) {		
 	  		 pass(driver,"'StatsLineRoundOff Input' accessible when selecting the StatsLine Value"); 
   		 }else {
 	  		 fail(driver,"'StatsLineRoundOff Input' Inaccessible when selecting the StatsLine Value"); 
   		 }
   		setTestCaseID("TC_COLUMN_OTHERS_012");
  		 String default_RoundOffValue_Act=defaultSelectedValue(driver, statsLineRoundOff_Input);
  		 if(default_RoundOffValue_Exp.equals(default_RoundOffValue_Act)) {
 	  		 pass(driver,"By default, '"+default_RoundOffValue_Exp+"' is selected in the StatusLine RoundOff Input"); 
  		 }else {
 	  		 fail(driver,"By default, '"+default_RoundOffValue_Exp+"' is not selected in the StatusLine RoundOff Input"); 
  		 }
  		 
  		setTestCaseID("TC_COLUMN_OTHERS_014");
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

  		setTestCaseID("TC_COLUMN_OTHERS_019");
  	     //cursor validation start....
		 if(isToggleEnable(driver,Cursor_Input)) {		
	  		 pass(driver,"'Cursor Input' is enabled by default"); 
		 }else {
	  		 fail(driver,"'Cursor Input' is disabled by default"); 
		 }
		 scrollUsingElement(driver, ApplyButton);
 		 click(driver,ApplyButton);
 		 elementnotvisible1(driver, RPE_Loading);
 		 waitForElement(driver,Chart);
		 mouseOverToElement(driver, ChartGraph);
		 setTestCaseID("TC_COLUMN_OTHERS_020");
		 if(isDisplayed2(driver,MouseCursor)) {
	  		 pass(driver,"Cursor is displayed in chart when cursor is enable"); 
		 }else {
	  		 fail(driver,"Cursor is not displayed in chart when cursor is enable");  
		 }
		
		//
		 setTestCaseID("TC_COLUMN_OTHERS_021");
		click(driver,Cursor_InputClick);
		if(isToggleEnable(driver,Cursor_Input)) {		
	  		 fail(driver,"'Cursor Input' is enable while click on it"); 
		}else {
	  		 pass(driver,"'Cursor Input' is disable while click on it"); 
		}
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
		 //cursor validation End....
  	
		 setTestCaseID("TC_COLUMN_OTHERS_022");
   		if(isToggleEnable(driver,Export_Input)) {		
  	  		 fail(driver,"'Export Input' enable by default");
  		}else {
  	  		 pass(driver,"'Export Input' disable by default"); 
  		}
   		
   		scrollUsingElement(driver, ApplyButton);
   		click(driver,ApplyButton);
   		elementnotvisible1(driver, RPE_Loading);
   		verifyElementDisplayed(driver,Chart_Section);
 		
 		 setTestCaseID("TC_COLUMN_OTHERS_023");
   		if(isDisplayed2(driver,ExportChartOptions)) {
  	  		 fail(driver,"'Export Options' is displayed in charts when Export chart is disabled"); 
  		}else {
  	  		 pass(driver,"'Export Options' not displayed in charts when Export chart is disabled"); 
  		}
   		
   		click(driver,Export_InputClick);
   		if(isToggleEnable(driver,Export_Input)) {		
  	  		 pass(driver,"'Export Input' is enabled while enabling it");
  		}else {
  	  		 fail(driver,"'Export Input' not enabled while enabling it"); 
  		}
   		
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
      }
		 
	     // ******************* Others Validation End *********************
		  
        
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
	    	  
     	mouseOverToElement(driver, SavedChartTitleInput);
     	if(Column_ChartFormat_Others.equals("Yes")) {
     		if(isDisplayed2(driver,ExportOption_SavedChart)) {
         		pass(driver,"Export option get enabled after save chart");
         	}else {
         		fail(driver,"Export option not get enabled after save chart");
         	}
     	}
     	
        
		
		
	}
	
}
