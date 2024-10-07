package individualScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import commonMethods.Keywords;
import commonMethods.Utils;

public class DASHPRO_BARWITHLINE_TESTING extends Keywords{

	public void barWithLine_testing(WebDriver driver,int iteration,String Flag,boolean AllTestcase) {
		
		//Axes input
		String Highlight_color_Exp=Utils.getDataFromTestData("Axes", "HighlightColor");
		
		//Axis title
		String AxisTextColorExp=Utils.getDataFromTestData("AxisTitle", "AxisTextColor_Exp");
		String default_FontFamily=Utils.getDataFromTestData("AxisTitle", "default_FontFamily");
		String default_FontSize_Exp=Utils.getDataFromTestData("AxisTitle", "default_FontSize");
		String RotationInputColor_Exp=Utils.getDataFromTestData("AxisTitle", "RotationInput_Color");
		String Highlight_Color_Exp=Utils.getDataFromTestData("AxisTitle", "HighlightColor_Exp");

		String defaultRotation_X=Utils.getDataFromTestData("SmokeTesting_UI", "DefaultRotation_Column_AxisTitle_X");
		String defaultRotation_Y=Utils.getDataFromTestData("AxisTitle", "default_Rotation_Value");
		
		//Chart Style
		String ChartFormatColorExp=Utils.getDataFromTestData("ChartFormat_ChartStyle", "ChartFormatColorExp");
		String ChartStylingColor_Exp=Utils.getDataFromTestData("ChartFormat_ChartStyle", "ChartStylingColor_Exp");
		String DefaultThemeValue_Exp=Utils.getDataFromTestData("ChartFormat_ChartStyle", "defaultThemeValue_Exp");
		String Highlight_ColorStyle_Exp=Utils.getDataFromTestData("ChartFormat_ChartStyle", "HighlightColor_Exp");
		String Default_Line_Stroke_Exp=Utils.getDataFromTestData("SmokeTesting_UI", "Default_LineStroke_BarWithLine");	
		String Default_Line_Bullet_Exp=Utils.getDataFromTestData("SmokeTesting_UI", "Default_LineBullet_BarWithLine");	

		//Iteration Inputs
		//Axes
		String Select_Line_OR_Scatter=Utils.getDataFromTestDataIteration(iteration,"BarWithLine_Widget_Testing", "Select_Line_OR_Scatter");
		String Select_Axis_Same_Value=Utils.getDataFromTestDataIteration(iteration,"BarWithLine_Widget_Testing", "Select_Axis_Same_Value");
		String X_Axis_dataType=Utils.getDataFromTestDataIteration(iteration,"BarWithLine_Widget_Testing", "X_Axis_dataType");
		String Select_X_Axis_Value=Utils.getDataFromTestDataIteration(iteration,"BarWithLine_Widget_Testing", "Select_X_Axis_Value");
		String Y_Axis_dataType=Utils.getDataFromTestDataIteration(iteration,"BarWithLine_Widget_Testing", "Y_Axis_dataType");
		String Select_Y_Axis_Value=Utils.getDataFromTestDataIteration(iteration,"BarWithLine_Widget_Testing", "Select_Y_Axis_Value");
		String Limit_Input_Axes=Utils.getDataFromTestDataIteration(iteration,"BarWithLine_Widget_Testing", "Limit_Input_Axes");
		String Select_SortBy_Value=Utils.getDataFromTestDataIteration(iteration,"BarWithLine_Widget_Testing", "Select_SortBy_Value");
		String SelectGroupValue_Date=Utils.getDataFromTestDataIteration(iteration,"BarWithLine_Widget_Testing", "SelectGroupValue_Date");
		String Series_Value1=Utils.getDataFromTestDataIteration(iteration,"BarWithLine_Widget_Testing", "Series_Value1");
		String Series_Value2=Utils.getDataFromTestDataIteration(iteration,"BarWithLine_Widget_Testing", "Series_Value2");

		//Axis Title Input
		String Change_X_Title_Name=Utils.getDataFromTestDataIteration(iteration,"BarWithLine_Widget_Testing", "Change_X_Title_Name");
		String Change_Y_Title_Name=Utils.getDataFromTestDataIteration(iteration,"BarWithLine_Widget_Testing", "Change_Y_Title_Name");
		String Change_Y1_Title_Name=Utils.getDataFromTestDataIteration(iteration,"BarWithLine_Widget_Testing", "Change_Y1_Title_Name");
		String ChangeFontFamily_AxisTitle=Utils.getDataFromTestDataIteration(iteration,"BarWithLine_Widget_Testing", "ChangeFontFamily_AxisTitle");
		String ChangeTitleFontSize_AxisTitle=Utils.getDataFromTestDataIteration(iteration,"BarWithLine_Widget_Testing", "ChangeTitleFontSize_AxisTitle");
		String Change_X_label_FontSize=Utils.getDataFromTestDataIteration(iteration,"BarWithLine_Widget_Testing", "Change_X_label_FontSize");
		String Change_Y_label_FontSize=Utils.getDataFromTestDataIteration(iteration,"BarWithLine_Widget_Testing", "Change_Y_label_FontSize");
		String X_Rotation_Input=Utils.getDataFromTestDataIteration(iteration,"BarWithLine_Widget_Testing", "X_Rotation_Input");
		String Y_Rotation_Input=Utils.getDataFromTestDataIteration(iteration,"BarWithLine_Widget_Testing", "Y_Rotation_Input");

		//Chart title
		String TypeBackgroundColor1_ChartTitle=Utils.getDataFromTestDataIteration(iteration,"BarWithLine_Widget_Testing", "TypeBackgroundColor1_ChartTitle");
		String TypeTextColor1_ChartTitle=Utils.getDataFromTestDataIteration(iteration,"BarWithLine_Widget_Testing", "TypeTextColor1_ChartTitle");
		String Change_FontFamily_ChartTitle=Utils.getDataFromTestDataIteration(iteration,"BarWithLine_Widget_Testing", "Change_FontFamily_ChartTitle");
		String ChangeFontSize_ChartTitle=Utils.getDataFromTestDataIteration(iteration,"BarWithLine_Widget_Testing", "ChangeFontSize_ChartTitle");
		String ChangeChartTitleName=Utils.getDataFromTestDataIteration(iteration,"BarWithLine_Widget_Testing", "ChangeChartTitleName");
	
		//Chart Style
		String Change_ChartTheme_ChartStyle=Utils.getDataFromTestDataIteration(iteration,"BarWithLine_Widget_Testing", "Change_ChartTheme_ChartStyle");
		String Change_Line_Stroke_Color_Chart_Style=Utils.getDataFromTestDataIteration(iteration,"BarWithLine_Widget_Testing", "Change_Line_Stroke_Color_Chart_Style");
		String Change_Line_Bullet_Color_Chart_Style=Utils.getDataFromTestDataIteration(iteration,"BarWithLine_Widget_Testing", "Change_Line_Bullet_Color_Chart_Style");
		String Change_Bullet_Type_Chart_Style=Utils.getDataFromTestDataIteration(iteration,"BarWithLine_Widget_Testing", "Change_Bullet_Type_Chart_Style");
		String Change_Stroke_Width_Chart_Style=Utils.getDataFromTestDataIteration(iteration,"BarWithLine_Widget_Testing", "Change_Stroke_Width_Chart_Style");
//		String Change_ChartTheme_ChartStyle=Utils.getDataFromTestDataIteration(iteration,"BarWithLine_Widget_Testing", "Change_ChartTheme_ChartStyle");
//		String Change_ChartTheme_ChartStyle=Utils.getDataFromTestDataIteration(iteration,"BarWithLine_Widget_Testing", "Change_ChartTheme_ChartStyle");
		
		
		setTestCaseID(" ");
		Actions action=new Actions(driver);
		mouseOverToElement(driver, ADDTabPlus);
  	    mouseOverAndClick(driver, ADDTabPlus);
  	    wait(driver,"1");
  	    sendKeys(driver,newlyAddedTab,"BarWithLineTestTab1");
  	    click(driver,DashProPage);
  	    elementnotvisible1(driver, RPE_Loading);
		waitForElement(driver,ADD_widget_rightTop);
	    click(driver,ADD_widget_rightTop);
	    elementnotvisible(driver,Loading);
	    elementnotvisible1(driver, RPE_Loading);
		waitForElement(driver,WidgetPanel);
		waitForElement(driver,Sparkline_widget);
		
		setTestCaseID("TC_BARWITHLINE_ AXES_001");
		waitForElement(driver,BarLine_Scatter_widget);
		verifyElementDisplayed(driver, BarLine_Scatter_widget);
		setTestCaseID("TC_BARWITHLINE_ AXES_002");
		WidgetValidation(driver,BarLine_Scatter_widget,"Bar with Line/Scatter");
		setTestCaseID("TC_BARWITHLINE_ AXES_003");
		click(driver,BarLine_Scatter_widget);
		elementnotvisible(driver, Loading);
		elementnotvisible1(driver, RPE_Loading);
		String widgetValue=getText1(driver,WidgetValue);
	 	if(widgetValue.equals("Bar with Line/Scatter")) {
			pass(driver,"'Bar with Line/Scatter' displayed as the selected Widget ");
	 	}else {
	 		fail(driver,"'Bar with Line/Scatter' not displayed as the selected Widget ");
	 	}
	 	setTestCaseID("TC_BARWITHLINE_ AXES_004");
	 	verifyElementDisplayed(driver, Axes);
	 	String AxesExpand=getAttribute1(driver,Axes_Expand,"class");
    	if(AxesExpand.contains("up")) {
    		 pass(driver,"By default Column Axes Section is Expanded");
    	}else {
    		 fail(driver,"By default Column Axes Section is not Expanded");
    	}
    	
    	verifyElementDisplayed(driver, LineOption);
    	verifyElementDisplayed(driver, ScatterOption);
    	
    	if(Select_Line_OR_Scatter.contains("Line")) {
			mouseOverAndClick(driver,LineOption);
		}else if(Select_Line_OR_Scatter.contains("Scatter")) {
			mouseOverAndClick(driver,ScatterOption);
		}else {
			fail(driver,"InValid value to select the Option");
		}
    	
    	
    	setTestCaseID("TC_BARWITHLINE_ AXES_005");
		verifyElementDisplayed(driver,X_Axis_Input);
		String defaultSelectValue_Y_Act=getText1(driver,X_Axis_Input);
		if(defaultSelectValue_Y_Act.equals("Select")) {
			pass(driver,"By Default 'Select' is selected in the X axis value input dropdown ");
		}else {
			fail(driver,"By Default 'Select' is not selected in the X axis value input dropdown ");
		}
		
		
		verifyElementDisplayed(driver,Y_Axis_Input);
		String defaultSelectValue_X_Act=getText1(driver,Y_Axis_Input);
		if(defaultSelectValue_X_Act.equals("Select")) {
			pass(driver,"By Default 'Select' is selected in the Y axis value input dropdown ");
		}else {
			fail(driver,"By Default 'Select' is not selected in the Y axis value input dropdown ");
		}
	
		scrollUsingElement(driver, ApplyButton);
		click(driver,ApplyButton);
		if(isDisplayed(driver,ApplyError1)) {
			pass(driver,"'Kindly select X axis and Y axis ' Error displayed when click Apply button without providing inputs");
		}else {
			fail(driver,"'Kindly select X axis and Y axis ' Error not displayed when click Apply button without providing inputs");
		}
    	
    	setTestCaseID("");
		click(driver,X_Axis_Input);
		if(isDisplayed(driver,X_Axis_dropdownResultsExp)) {
			pass(driver,"X-Axis dropdown Expanded after click on it");
		}else {
			fail(driver,"X-Axis dropdown not Expanded after click on it");
		}
		
		setTestCaseID("TC_BARWITHLINE_ AXES_010");
		List<WebElement> displayedDataImage=getWebElements(driver, dataTypeImages);
		List<WebElement> AvailableColumnList=getWebElements(driver, AvailableList);
		int AvailableColumnListSize=AvailableColumnList.size()-1;
		if(AvailableColumnListSize==displayedDataImage.size()) {
			pass(driver,"All the available columns are displayed with data Type icon in the X_Axis dropdown");
		}else {
			fail(driver,"Some columns are not correctly displayed with data Type icon in the X_Axis dropdown");
		}
		
		setTestCaseID("TC_BARWITHLINE_ AXES_007");
		for(WebElement dataImag:displayedDataImage) {
			String dataTypeDisplay=dataImag.getAttribute("src");
			if(dataTypeDisplay.contains("Date") || dataTypeDisplay.contains("Categorical") || dataTypeDisplay.contains("Numerical") || dataTypeDisplay.contains("Text")) {
				
			}else {
				fail(driver,"Other than Date,Categorical,Numerical and Text datatype column is displayed in the X_Axis dropdown");
				break;
			}
			
		}
		
		setTestCaseID("TC_BARWITHLINE_ AXES_008");
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
		
		setTestCaseID("");
		ScrollBarValidation1(driver,X_Axis_dropdownResultsExp,"X-Axis");
		setTestCaseID("TC_BARWITHLINE_ AXES_009");
		if(verifyElementDisplayed(driver, dropdownInputsearchBox)) {
			setTestCaseID("TC_BARWITHLINE_ AXES_011");
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
		
		setTestCaseID("");
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
		
		setTestCaseID("");
		selectDropdownValue1(driver,Select_Axis_Same_Value);
		wait(driver,"1");
		if(isDisplayed2(driver,X_Axis_dropdownResultsExp)) {
			fail(driver,"X_Axis Value dropdown not closed after selecting the value");
		}else {
			pass(driver,"X_Axis Value dropdown closed automatically after selecting the value");
		}
		
		scrollUsingElement(driver, ApplyButton);
		click(driver,ApplyButton);
		if(isDisplayed(driver,ApplyError1)) {
			pass(driver,"'Kindly select X axis and Y axis ' Error displayed when click Apply button only providing X_Axis Value");
		}else {
			fail(driver,"'Kindly select X axis and Y axis ' Error not displayed when click Apply button only providing X_Axis Value");
		}
		
		
        
        setTestCaseID("");
        click(driver,X_Axis_Input);
		waitForElement(driver,SelectOption);
		click(driver,SelectOption);
		wait(driver,"1");
		
		click(driver,Y_Axis_Input);
		if(isDisplayed(driver,Y_Axis_dropdownResultsExp)) {
			pass(driver,"Y-Axis dropdown Expanded after click on it");
		}else {
			fail(driver,"Y-Axis dropdown not Expanded after click on it");
		}
		
		setTestCaseID("TC_BARWITHLINE_ AXES_015");
		displayedDataImage=getWebElements(driver, dataTypeImages);
		AvailableColumnList=getWebElements(driver, AvailableList);
		AvailableColumnListSize=AvailableColumnList.size()-1;
		if(AvailableColumnListSize==displayedDataImage.size()) {
			pass(driver,"All the available columns are displayed with data Type icon in the Y_Axis dropdown");
		}else {
			fail(driver,"Some columns are not correctly displayed with data Type icon in the Y_Axis dropdown");
		}
		
		setTestCaseID("TC_BARWITHLINE_ AXES_012");
		for(WebElement dataImag:displayedDataImage) {
			String dataTypeDisplay=dataImag.getAttribute("src");
			if(dataTypeDisplay.contains("Date") || dataTypeDisplay.contains("Categorical") || dataTypeDisplay.contains("Numerical") || dataTypeDisplay.contains("Text")) {
				
			}else {
				fail(driver,"Other than Date,Categorical,Numerical and Text datatype column is displayed in the Y_Axis dropdown");
				break;
			}
			
		}
		
		setTestCaseID("TC_BARWITHLINE_ AXES_013");
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
		
		setTestCaseID("");
		ScrollBarValidation1(driver,Y_Axis_dropdownResultsExp,"Y-Axis");
		setTestCaseID("TC_BARWITHLINE_ AXES_014");
		if(verifyElementDisplayed(driver, dropdownInputsearchBox)) {
			setTestCaseID("TC_BARWITHLINE_ AXES_016");
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
		
		setTestCaseID("");
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
		
		selectDropdownValue1(driver,Select_Axis_Same_Value);
		wait(driver,"1");
		if(isDisplayed2(driver,Y_Axis_dropdownResultsExp)) {
			fail(driver,"Y_Axis Value dropdown not closed after selecting the value");
		}else {
			pass(driver,"Y_Axis Value dropdown closed automatically after selecting the value");
		}
		
		scrollUsingElement(driver, ApplyButton);
		click(driver,ApplyButton);
		if(isDisplayed(driver,ApplyError1)) {
			pass(driver,"'Kindly select X axis and Y axis ' Error displayed when click Apply button only providing Y_Axis Value");
		}else {
			fail(driver,"'Kindly select X axis and Y axis ' Error not displayed when click Apply button only providing Y_Axis Value");
		}
		
		setTestCaseID("TC_BARWITHLINE_ AXES_006");
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
		
		setTestCaseID("TC_BARWITHLINE_ AXES_036");
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
		
		setTestCaseID("TC_BARWITHLINE_ AXES_017");
		verifyElementDisplayed(driver,aggregation);
		verifyElementDisplayed(driver,aggText);
	
		String defaultaggre=defaultSelectedValue(driver,aggregation);
        if(defaultaggre.equals("Sum")) {
        	pass(driver,"'Sum' is selected as default aggrigation");
		}else {
			fail(driver,"'Sum' is not selected as default aggrigation");
		}
        setTestCaseID("TC_BARWITHLINE_ AXES_018");
		verifyElementIsPresent1(driver, Sum);
		verifyElementIsPresent1(driver, Count);
		verifyElementIsPresent1(driver, Average);
		verifyElementIsPresent1(driver, Min);
		verifyElementIsPresent1(driver, Max);
		verifyElementIsPresent1(driver, Unique);

		setTestCaseID("TC_BARWITHLINE_ AXES_019");
		DASHPRO_BAR_SMOKE_TESTING bar=new DASHPRO_BAR_SMOKE_TESTING();
		if(Y_Axis_dataType.contains("Categorical") || Y_Axis_dataType.contains("Text") || Y_Axis_dataType.contains("Date")) {
			bar.aggregationValidation1(driver);
		}else {
			bar.aggregationValidation2(driver);
		}
		
		setTestCaseID("");
		verifyElementDisplayed(driver, Series_Select_Input);
		click(driver,Series_Select_Input);
		if(isDisplayed(driver,Series_Select_DropdownExpand)) {
			pass(driver,"Series dropdown Expanded after click on it");
		}else {
			fail(driver,"Series dropdown not Expanded after click on it");
		}
		
		setTestCaseID("TC_BARWITHLINE_ AXES_023");
		displayedDataImage=getWebElements(driver, dataTypeImages);
		AvailableColumnList=getWebElements(driver, AvailableList);
		if(AvailableColumnList.size()==displayedDataImage.size()) {
			pass(driver,"All the available columns are displayed with data Type icon in the Series dropdown");
		}else {
			fail(driver,"Some columns are not correctly displayed with data Type icon in the Series dropdown");
		}
		
		setTestCaseID("TC_BARWITHLINE_ AXES_020");
		for(WebElement dataImag:displayedDataImage) {
			String dataTypeDisplay=dataImag.getAttribute("src");
			if(dataTypeDisplay.contains("Date") || dataTypeDisplay.contains("Categorical") || dataTypeDisplay.contains("Numerical") || dataTypeDisplay.contains("Text")) {
				
			}else {
				fail(driver,"Other than Date,Categorical,Numerical and Text datatype column is displayed in the Series dropdown");
				break;
			}
			
		}
		
		setTestCaseID("TC_BARWITHLINE_ AXES_021");
		if(isDisplayed2(driver,CategoricalColumnAxisDropdown)) {
			String Categorical1=getText1(driver,CategoricalColumnAxisDropdown);
			if(Categorical1.contains("(")) {
				pass(driver,"Unique values are displayed in the Categorical Column in the Series dropdown");
			}else {
				fail(driver,"Unique values are not displayed in the Categorical Column in the Series dropdown");
			}
		}
		
		if(isDisplayed2(driver,TextColumnAxisDropdown)) {
			String Text1=getText1(driver,TextColumnAxisDropdown);
			if(Text1.contains("(")) {
				pass(driver,"Unique values are displayed in the Text Column in the Series dropdown");
			}else {
				fail(driver,"Unique values are not displayed in the Text Column in the Series dropdown");
			}
		}
		
		setTestCaseID("");
		ScrollBarValidation1(driver,Series_Select_DropdownExpand,"Series");
		
		setTestCaseID("TC_BARWITHLINE_ AXES_022");
		verifyElementDisplayed(driver, dropdownInputsearchBox);
		
		if(isDisplayed(driver,Cate_agg_fieldSortValue)) {
			setTestCaseID("TC_BARWITHLINE_ AXES_026");
    		mouseOverAndClick(driver, Cate_agg_fieldSortValue);
    		String defaultCategoricalSelect=defaultSelectedValue(driver,Cate_agg_fieldSortValue);
	    	if(defaultCategoricalSelect.equals("Count")) {
	    		pass(driver,"'Count' is selected as default for Categorical in Series dropdown");
	    	}else {
	    		fail(driver,"'Count' is not selected as default for Categorical Series dropdown ");
	    	}
	    	
	    	
	    	if(isDisplayed2(driver,sumDisabledFieldsortCate)) {
	 			pass(driver,"Sum disabled for Categorical value in Series dropdown");
	         }else {
	 			fail(driver,"Sum not disabled for Categorical value in Series dropdown");
	         }
	         
	         if(isDisplayed2(driver,AvgDisabledFieldsortCate)) {
	 			pass(driver,"Average disabled for Categorical value in Series dropdown");
	         }else {
		 		fail(driver,"Average not disabled for Categorical value Series dropdown");
	         }
	         
	         if(isDisplayed2(driver,minDisabledFieldsortCate)) {
	 			pass(driver,"Minimum disabled for Categorical value in Series dropdown");
	         }else {
	 			fail(driver,"Minimum not disabled for Categorical value Series dropdown");
	         }
	         
	         if(isDisplayed2(driver,maxDisabledFieldsortCate)) {
	 			pass(driver,"Maximum disabled for Categorical value in Series dropdown");
	         }else {
	 			fail(driver,"Maximum not disabled for Categorical value in Series dropdown");
	         }
	         
	         if(!isDisplayed2(driver,uniqueDisabledFieldsortCate)) {
	 			pass(driver,"Unique enabled for Categorical value in Series dropdown");
	         }else {
	 			fail(driver,"Unique not enabled for Categorical value in Series dropdown");
	         }
	         
	         if(!isDisplayed2(driver,countDisabledFieldsortCate)) {
		 		pass(driver,"Count enabled for Categorical value in Series dropdown");
	         }else {
			 	fail(driver,"Count not enabled for Categorical value in Series dropdown");
	         } 
	         mouseOverAndClick(driver, Cate_agg_fieldSortValue);
	         //action.sendKeys(Keys.ESCAPE).build().perform();
    	}else {
    		fail(driver,"Categorical Sort by agg Value not present in the dropdown");
    	}
    	
    	 wait(driver,"1");
    	 if(isDisplayed(driver,Num_agg_fieldSortValue)) {
    		 setTestCaseID("TC_BARWITHLINE_ AXES_027");
    		 mouseOverAndClick(driver, Num_agg_fieldSortValue);
    		 String defaultNumericalSelect=defaultSelectedValue(driver,Num_agg_fieldSortValue);
	 		 if(defaultNumericalSelect.equals("Sum")) {
	 			pass(driver,"'Sum' is selected as default for Numerical in Series dropdown ");
	     	 }else {
	 			fail(driver,"'Sum' is not selected as default for Numerical in Series dropdown");
	     	 }
	 	     	
	 	     if(!isDisplayed2(driver,sumDisabledFieldsortNum)) {
	 			pass(driver,"Sum enabled for Numerical value in Series dropdown");
	         }else {
		 		fail(driver,"Sum not enabled for Numerical value in Series dropdown");
	         }
	         
	         if(!isDisplayed2(driver,AvgDisabledFieldsortNum)) {
	 			pass(driver,"Average enabled for Numerical value in Series dropdown");
	         }else {
	 			fail(driver,"Average not enabled for Numerical value in Series dropdown");
	         }
	         
	         if(!isDisplayed2(driver,minDisabledFieldsortNum)) {
	 			pass(driver,"Minimum enabled for Numerical value in Series dropdown");
	         }else {
		 		fail(driver,"Minimum not enabled for Numerical value in Series dropdown");
	         }
	         
	         if(!isDisplayed2(driver,maxDisabledFieldsortNum)) {
	 			pass(driver,"Maximum enabled for Numerical value in Series dropdown");
	         }else {
	 			fail(driver,"Maximum not enabled for Numerical value in Series dropdown");
	         }
	         
	         if(!isDisplayed2(driver,uniqueDisabledFieldsortNum)) {
	 			pass(driver,"Unique enabled for Numerical value in Series dropdown");
	         }else {
	 			fail(driver,"Unique not enabled for Numerical value in Series dropdown");
	         }
	         
	         if(!isDisplayed2(driver,countDisabledFieldsortNum)) {
	 			pass(driver,"Count enabled for Numerical value in Series dropdown");
	         }else {
	 			fail(driver,"Count not enabled for Numerical value in Series dropdown");
	         }	
	         mouseOverAndClick(driver, Num_agg_fieldSortValue);
	 		 //action.sendKeys(Keys.ESCAPE).build().perform();
    	 }else {
	    	  fail(driver,"Numerical Sort by agg Value not present in the dropdown");
	     }
		
		
		setTestCaseID("TC_BARWITHLINE_ AXES_025");
		List<WebElement> AvailableColumnList_X_Axis=getWebElements(driver, AvailableList);
		int columnListCount=AvailableColumnList_X_Axis.size();
		if(columnListCount>10) {
			for (int k=0;k<=10;k++) {
				WebElement availableColumn=AvailableColumnList_X_Axis.get(k);
				action.moveToElement(availableColumn).click().build().perform();
			}
			
			if(isDisplayed(driver,Series_Limit_Error)) {
				pass(driver,"'Kindly select less than or equal to 10 column in series' error displayed when Selecting more than 10 value in the series dropdown");
			}else {
				fail(driver,"'Kindly select less than or equal to 10 column in series' error not displayed when Selecting more than 10 value in the series dropdown");
			}
		}
		setTestCaseID("");
		click(driver,X_Axis_text_);
		wait(driver,"1");
		if(!isDisplayed2(driver,Series_Select_DropdownExpand)) {
			pass(driver,"Series dropdown closed when click outside the dropdown");
		}else {
			fail(driver,"Series dropdown not closed when click outside the dropdown");
		}
		
		elementnotvisible1(driver, Series_Limit_Error);
		
		while(isDisplayed(driver,RemoveOption_SeriesDropdown)) {
			WebElement RemoveSelectList=getWebElement(driver,RemoveOption_SeriesDropdown);
			action.moveToElement(RemoveSelectList).click().build().perform();
			wait(driver,"1");
		}

		if(!isDisplayed2(driver,Selected_Series_value)) {
			pass(driver,"All the column Values are removed from the series input after removing all the value");
		}else {
			fail(driver,"Some Column Value not removed from the series input after removing all the value");
		}
		
		setTestCaseID("TC_BARWITHLINE_ AXES_024");
		click(driver,Series_Select_Input);
		waitForElement(driver,Series_Select_DropdownExpand);
		selectDropdownValue1(driver,Series_Value1);
		selectDropdownValue1(driver,Series_Value2);
		click(driver,X_Axis_text_);
		
		setTestCaseID("");
		scrollUsingElement(driver, ApplyButton);
		click(driver,ApplyButton);
		elementnotvisible1(driver, Loading);
		elementnotvisible1(driver, RPE_Loading);
		
		if(isDisplayed(driver,Chart_Section)) {
			pass(driver,"Chart is displayed after selecting X and Y axis value with 2 series Value");
		}else {
			fail(driver,"Chart is not displayed after selecting X and Y axis value with 2 series Value");
		}
    	
		setTestCaseID("TC_BARWITHLINE_ AXES_028");
		String defaultShowResult=defaultSelectedValue(driver,showResult);
        if(defaultShowResult.equals("All")) {
        	pass(driver,"'All' is selected by default in the Showresults input");
		}else {
        	fail(driver,"'All' is not selected by default in the Showresults input");
		}
        setTestCaseID("TC_BARWITHLINE_ AXES_029");
        click(driver,showResult);
		verifyElementIsPresent1(driver,All);
		verifyElementIsPresent1(driver,Limit);
		wait(driver,"1");
		
		setTestCaseID("TC_BARWITHLINE_ AXES_030");
		String X_Selected=getText1(driver,X_Axis_Input);
		if(X_Axis_dataType.contains("Categorical") || X_Axis_dataType.contains("Text")) {
			
			int X_number=getNumber(X_Selected);
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
		
		setTestCaseID("TC_BARWITHLINE_ AXES_031");
		List<WebElement> DefaultCharts=getWebElements(driver,chartBars);
		int defaultSizeChart=DefaultCharts.size();
		click(driver,showResult);
		selectByText(driver, showResult, "Limit");
        
		verifyElementIsPresent1(driver,showRecordType);
		verifyElementIsPresent1(driver,Top1);
		verifyElementIsPresent1(driver,Bottom1);
		verifyElementIsPresent1(driver,limitInput);
		
		setTestCaseID("TC_BARWITHLINE_ AXES_032");
		String defaultShowRecordType=defaultSelectedValue(driver,showRecordType);
        if(defaultShowRecordType.equals("Top")) {
        	pass(driver,"'Top' is selected by default in the showRecordType input");
		}else {
        	fail(driver,"'Top' is not selected by default in the showRecordType input");
		}
        
        setTestCaseID("TC_BARWITHLINE_ AXES_034");
		clear1(driver,limitInput);
		scrollUsingElement(driver, ApplyButton);
		click(driver,ApplyButton);
		
		if(isDisplayed(driver,Limit_Error)) {
			pass(driver,"'Kindly provide the limit', Error displayed when click the Apply button without providing the limit value");
		}else {
			fail(driver,"'Kindly provide the limit', Error not displayed when click the Apply button without providing the limit value");
		}
		
		if(defaultSizeChart>2) {
			click3(driver,limitInput);
			sendKeys(driver,limitInput,Limit_Input_Axes);
			scrollUsingElement(driver, ApplyButton);
			click(driver,ApplyButton);
			elementnotvisible1(driver, RPE_Loading);
			verifyElementDisplayed(driver,Chart);
	        if(isDisplayed(driver,minimize)) {
	        	click(driver,minimize);
	        }
	        
	        setTestCaseID("TC_BARWITHLINE_ AXES_035");
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
			
	        elementScreenShot_new(driver,Chart,"/Expected_screenshot/SmokeTesting/barWithLineChart_Top");
	        setTestCaseID("TC_BARWITHLINE_ AXES_033");
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
			
			elementScreenShot_new(driver,Chart,"/Actual_screenshot/SmokeTesting/barWithLineChart_Bottom");

	        try {
	        	boolean chartDiff=imageComparison2(driver, "/SmokeTesting/barWithLineChart_Top", "/SmokeTesting/barWithLineChart_Bottom");
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
        setTestCaseID("TC_BARWITHLINE_ AXES_037");
        verifyElementIsPresent1(driver,sortType);  
		verifyElementIsPresent1(driver,sortBy);
		setTestCaseID("TC_BARWITHLINE_ AXES_038");
		String defaultSortType=defaultSelectedValue(driver,sortType);
        if(defaultSortType.equals("Quick Sort")) {
        	pass(driver,"'Quick Sort' is selected by default in the sortType input");
		}else {
        	fail(driver,"'Quick Sort' is not selected by default in the sortType input");
		}
        
        setTestCaseID("TC_BARWITHLINE_ AXES_039");
		click(driver,sortType);
		selectByText(driver,sortType,"Quick Sort");
		click(driver,sortBy);
		if(verifyElementDisplayed(driver,sortByDropdownExpand)) {
			List<WebElement> SortByValues=getWebElements(driver,sortByValues);
		    int SortByValuesCount=SortByValues.size();
		    if(SortByValuesCount<=3) {
		    	pass(driver,"Only X and Y values are displayed in the sortBy field for Quicksort condition");
		    }else {
		    	fail(driver,"Other than X and Y values are displayed in the sortBy field for Quicksort condition");
		    }
		    
		}
		
		setTestCaseID("TC_BARWITHLINE_ AXES_040");
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
		    	setTestCaseID("TC_BARWITHLINE_ AXES_041");
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
		    	 setTestCaseID("");
		 		ScrollBarValidation1(driver, ListFieldSection, "Field_Sort_BarWithLine");
		 		setTestCaseID("TC_BARWITHLINE_ AXES_042");
		 		if(verifyElementDisplayed(driver, inputFieldSort)) {
		 			setTestCaseID("TC_BARWITHLINE_ AXES_044");
		 			List<WebElement> AllList=getWebElements(driver, ListFieldsort);
		 			int lastindex=AllList.size()-1;
		 			String lastText=AllList.get(lastindex).getText();
		 			click(driver,inputFieldSort);
		 			sendKeys(driver, inputFieldSort, "dgrehtj");
		 			if(isDisplayed(driver,NoResultsFound)) {
		 				pass(driver,"No results found is displayed for invalid input");
		 			}else {
		 				fail(driver,"No results found is not displayed for invalid input");
		 			}
		 			clear1(driver,inputFieldSort);
		 			wait(driver,"1");
		 			setTestCaseID("TC_BARWITHLINE_ AXES_043");
		 			sendKeys(driver, inputFieldSort, lastText);
		 			String firstList=getText1(driver, FirstField);
		 			if(firstList.equals(lastText)) {
		 				pass(driver,"Search input inside the field sort working properly");
		 			}else {
		 				fail(driver,"Search input inside the field sort not working properly");
		 			}
		 			
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
		setTestCaseID("TC_BARWITHLINE_ AXES_045");
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
		
		setTestCaseID("TC_BARWITHLINE_ AXES_046");
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
		
		X_Selected=getText1(driver,X_Axis_Input);
        String Y_Selected=getText1(driver,Y_Axis_Input);
         
        System.out.println("X_Selected : "+X_Selected);
        System.out.println("Y_Selected : "+Y_Selected);
        String aggreagtionSelected=defaultSelectedValue(driver,aggregation);
        
        String Y_SelectedString=getStringValue(Y_Selected);
        String X_SelectedString=getStringValue(X_Selected);
         
        String Y_chartvalue=getText1(driver,Y_Value);
        if(Y_chartvalue.contains(Y_SelectedString) && Y_chartvalue.contains(aggreagtionSelected) ) {
			pass(driver,"Selected Y-Axis value with Aggregation displayed in Y-Axis in the chart");
        }else {
     	    fail(driver,"Selected Y-Axis value with Aggregation not displayed in Y-Axis in the chart,Exp : "+aggreagtionSelected+"("+Y_SelectedString+") Act : "+Y_chartvalue);
        }
        
        String X_chartvalue=getText1(driver,X_Value);
      
        if(X_chartvalue.equals(X_SelectedString)) {
			pass(driver,"Selected X-Axis value displayed in X-Axis in the chart ");
        }else {
     	    fail(driver,"Selected X-Axis value not displayed in X-Axis in the chart, Exp : "+X_SelectedString+",  Act : "+X_chartvalue);
        }
        
        //Axe
       
     // *********** AxisTitle Validation Start *************
 		String BarWithLine_Axis_Title= getCellValue("TestExecution","Testcase_Selection","BarWithLine_Axis_Title",Flag);
 		if(BarWithLine_Axis_Title.equals("Yes") && AllTestcase==true) {
 			 setTestCaseID("TC_BARWITHLINE_ AXIS_TITLE_001");
 			 verifyElementDisplayed(driver, AxisTitle);
 			 click(driver,AxisTitle);
 			 wait(driver,"1");
 			 String AxisExpand=getAttribute1(driver,AxisTitleExpand,"class");
 	     	 if(AxisExpand.contains("up")) {
 				pass(driver,"Axis Title section is Expanded after click on it");
 	     	 }else {
 	 			fail(driver,"Axis Title section is not Expanded after click on it");
 	     	 }
 	        
 	     	String AxisTextColor_Act=getTextColor(driver,AxisTitleExpand);
 	     	if(AxisTextColorExp.equalsIgnoreCase(AxisTextColor_Act)) {
 	     		pass(driver,"Axis Title displayed in blue color after select on it");
 	     	}else {
 	     		fail(driver,"Axis Title displayed in blue color after select on it");
 	     	}
 	     	
 	     	setTestCaseID("TC_BARWITHLINE_ AXIS_TITLE_002");
 	     	verifyElementDisplayed(driver, X_Title_text);
 	     	verifyElementDisplayed(driver,X_Title_input);

 	     	verifyElementDisplayed(driver, Y_Title_text);
 	     	verifyElementDisplayed(driver,Y_Title_input);
 		
 	     	verifyElementDisplayed(driver, Y1_Title_Text);
 	     	verifyElementDisplayed(driver,Y1_Title_Input);
 		
 	     	clearAndType(driver,X_Title_input,Change_X_Title_Name);
 	       	clearAndType(driver,Y_Title_input,Change_Y_Title_Name);
 	        clearAndType(driver,Y1_Title_Input,Change_Y1_Title_Name);
 	       	wait(driver,"1");
 	       	scrollUsingElement(driver, ApplyButton);
 	  		click(driver,ApplyButton);
 	  		elementnotvisible1(driver, RPE_Loading);
 	  		verifyElementDisplayed(driver,Chart_Section);
 	  		waitForElement(driver, chartBars);
 	  		
 	  		//this lines for to find the Xpath for the X Title in the Chart
 	  		List<WebElement>  moveElements1=driver.findElements(By.xpath("//div[@id='RPE_Preview']//*[name()='tspan']"));
 	  		for(WebElement ele:moveElements1) {
 	  			Actions act3=new Actions(driver);
 	  			try {
 	  				act3.moveToElement(ele).build().perform();
 	  			}catch(Exception e) {
 	  				
 	  			}
 	  		}
 	    	//this lines for getting the Xpath for the X Title in the Chart
 	  		
 	  		String Y_ChartText=getText1(driver,Y_Value);
 	  		String X_ChartText=getText1(driver,X_Chart_Value);
 	  		String Y1_ChartText=getText1(driver, Y1_Value_Chart);
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
 	  		
 	  		if(Y1_ChartText.equals(Change_Y1_Title_Name)) {
 	          	pass(driver,"Given Y1 Title ("+Change_Y1_Title_Name+") input value updated in the Y1 Axis chart");
 	       	}else {
 	          	fail(driver,"Y1 Title ("+Change_Y1_Title_Name+") input value not updated in the Y1 Axis chart");
 	       	}
 	  		
 	  		
 	  		setTestCaseID("TC_BARWITHLINE_ AXIS_TITLE_003");
 	      	verifyElementDisplayed(driver,fontFamilyText);
 	      	verifyElementDisplayed(driver,fontFamily_dropdown);
       		String fontFamily_Value=getText1(driver,fontFamily_dropdown);
       		System.out.println("FontFamily_Value : "+fontFamily_Value);
       		if(fontFamily_Value.equals(default_FontFamily)) {
      			pass(driver,"By default, "+default_FontFamily+" displayed in the Font Family input");
       		}else {
           	    fail(driver,"By default, "+default_FontFamily+" is not displayed in the Font Family input");
       		}
 	       	
 	     
       		setTestCaseID("");
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
 	    		setTestCaseID("");
 	    		ScrollBarValidation1(driver,fontFamily_DropdownExpand,"Font Family");
 	    		
 	    		setTestCaseID("TC_BARWITHLINE_ AXIS_TITLE_004");
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
 	            setTestCaseID("TC_BARWITHLINE_ AXIS_TITLE_005");
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
 	    		
 	    		String fontFamily_X_Act=getFontFamily(driver,X_Chart_Value);
 	    		if(fontFamily_X_Act.equals(ChangeFontFamily_AxisTitle)) {
 	   			     pass(driver,"Selected fontFamily ("+ChangeFontFamily_AxisTitle+") Updated in X Axis chart value");
 	    		}else {
 	         	    fail(driver,"Selected FontFamily ("+ChangeFontFamily_AxisTitle+") is not Updated in X Axis chart value");
 	    		}
 	    		
 	    		String fontFamily_Y1_Act=getFontFamily(driver,Y1_Value_Chart);
 	    		if(fontFamily_Y1_Act.equals(ChangeFontFamily_AxisTitle)) {
 	   			     pass(driver,"Selected fontFamily ("+ChangeFontFamily_AxisTitle+") Updated in Y1 Axis chart value");
 	    		}else {
 	         	    fail(driver,"Selected FontFamily ("+ChangeFontFamily_AxisTitle+") is not Updated in Y1 Axis chart value");
 	    		}
 	    		
 	           	
 	        }else {
 	     	    fail(driver,"Font family dropdown is not expanded after click on it");
 	        }
 	     	
 	     	
 	     	setTestCaseID("TC_BARWITHLINE_ AXIS_TITLE_006");
 	       	verifyElementDisplayed(driver,titleFontSize);
 	       	verifyElementDisplayed(driver,titleFontSizeDropdown);
       		String font_Size_Act=defaultSelectedValue(driver,titleFontSizeDropdown);
       		if(font_Size_Act.equals(default_FontSize_Exp)) {
      			pass(driver,"By default, "+default_FontSize_Exp+" displayed in the Title Font Size input");
       		}else {
           	    fail(driver,"By default, "+default_FontSize_Exp+" is not displayed in the Title Font Size input");
       		}
 	       	
 	        setTestCaseID("TC_BARWITHLINE_ AXIS_TITLE_007");
 	       	click(driver,titleFontSizeDropdown);
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
 	  		String fontSize_Y1_Act=getFontSize(driver,Y1_Value_Chart);
 	  		if(ChangeTitleFontSize_AxisTitle.equals(fontSize_X_Act)) {
 	  			pass(driver,"Given Title Font Size Updated in X-Axis Title chart value");
 	  		}else {
 	  			fail(driver,"Given Title Font Size not Updated in X-Axis Title chart value");
 	  		}
 	  		
 	  		if((ChangeTitleFontSize_AxisTitle.equals(fontSize_Y_Act))) {
 	  			pass(driver,"Given Title Font Size Updated in Y-Axis Title chart value");
 	  		}else {
 	  			fail(driver,"Given Title Font Size not Updated in Y-Axis Title chart value");
 	  		}
 	  		if((ChangeTitleFontSize_AxisTitle.equals(fontSize_Y1_Act))) {
 	  			pass(driver,"Given Title Font Size Updated in Y1-Axis Title chart value");
 	  		}else {
 	  			fail(driver,"Given Title Font Size not Updated in Y1-Axis Title chart value");
 	  		}
 	  		
 	  		setTestCaseID("TC_BARWITHLINE_ AXIS_TITLE_008");
 	       	verifyElementDisplayed(driver,X_axisFontSizeText);
 	       	verifyElementDisplayed(driver,X_axisFontSizeDropdown);
       		String X_font_Size_Act=defaultSelectedValue(driver,X_axisFontSizeDropdown);
       		System.out.println("X Font_Size : "+X_font_Size_Act);
       		if(X_font_Size_Act.equals(default_FontSize_Exp)) {
      			pass(driver,"By default, "+default_FontSize_Exp+" displayed in the X axis Font Size input");
       		}else {
           	    fail(driver,"By default, "+default_FontSize_Exp+" is not displayed in the X axis Font Size input");
       		}
       	
       		setTestCaseID("TC_BARWITHLINE_ AXIS_TITLE_009");
 	       	click(driver,X_axisFontSizeDropdown);
 	  		selectOptionValue(driver,X_axisFontSizeDropdown,Change_X_label_FontSize);
 	  		scrollUsingElement(driver, ApplyButton);
 	  		click(driver,ApplyButton);
 	  		elementnotvisible1(driver, RPE_Loading);
 	  		verifyElementDisplayed(driver,Chart_Section);
 	     	String fontSize_X_label_Act=getFontSize(driver,X_Label_Value_Chart);
 	     	if(Change_X_label_FontSize.equals(fontSize_X_label_Act)) {
 	     		pass(driver,"Selected fontSize ("+Change_X_label_FontSize+") Updated in X Axis label chart value");
 	  		}else {
 	  			fail(driver,"Selected fontSize  ("+Change_X_label_FontSize+") not Updated in X Axis label chart value");
 	  		}
 	       	
 	     	setTestCaseID("TC_BARWITHLINE_ AXIS_TITLE_010");
 	       	verifyElementDisplayed(driver, Y_axisFontSizeText);
 	       	verifyElementDisplayed(driver,Y_axisFontSizeDropdown);
       		String Y_font_Size_Act=defaultSelectedValue(driver,Y_axisFontSizeDropdown);
       		System.out.println("Y Font_Size : "+Y_font_Size_Act);
       		if(Y_font_Size_Act.equals(default_FontSize_Exp)) {
      			pass(driver,"By default, "+default_FontSize_Exp+" displayed in the Y axis Font Size input");
       		}else {
           	    fail(driver,"By default, "+default_FontSize_Exp+" is not displayed in the Y axis Font Size input");
       		}
 	       	
       		setTestCaseID("TC_BARWITHLINE_ AXIS_TITLE_011");
 	        click(driver,Y_axisFontSizeDropdown);
 	  		selectOptionValue(driver,Y_axisFontSizeDropdown,Change_Y_label_FontSize);
 	  		scrollUsingElement(driver, ApplyButton);
 	  		click(driver,ApplyButton);
 	  		elementnotvisible1(driver, RPE_Loading);
 	  		verifyElementDisplayed(driver,Chart_Section);
 	     	String fontSize_Y_label_Act=getFontSize(driver,Y_Label_Value_Chart);
 	      	if(Change_Y_label_FontSize.equals(fontSize_Y_label_Act)) {
 	  		    pass(driver,"Selected fontSize ("+Change_Y_label_FontSize+") Updated in Y Axis label chart value");
 	  		}else {
 	    	    fail(driver,"Selected fontSize ("+Change_Y_label_FontSize+") not Updated in Y Axis label chart value, Act : "+fontSize_Y_label_Act);
 	  		}
 	      	
 	      	setTestCaseID("TC_BARWITHLINE_ AXIS_TITLE_013");
 	       	verifyElementDisplayed(driver, X_RotationText);
 	       	verifyElementDisplayed(driver,X_RotationOutputValue);
 	       	if(isToggleAccessible(driver, X_RotationInputSlider)) {
 	       		pass(driver,"X Rotation input is Accessible");
 	       	}else {
 	       		fail(driver,"X Rotation input is not Accessible");
 	       	}
 	       	
 	       setTestCaseID("TC_BARWITHLINE_ AXIS_TITLE_012");
 	   		String X_RotationValueAct=getText1(driver,X_RotationOutputValue);
 	   		System.out.println("X rotation : "+X_RotationValueAct);
 	   		if(X_RotationValueAct.equals(defaultRotation_X)) {
 	  			pass(driver,"By default, '"+defaultRotation_X+"' displayed in the X axis Rotation output field");
 	   		}else {
 	       	    fail(driver,"By default, '"+defaultRotation_X+"' is not displayed in the X axis Rotation output field");
 	   		}
 	  		String X_Rotation_Color_Act=getTextBackgroundColor(driver,X_RotationOutputValue);
 	  		if(RotationInputColor_Exp.equalsIgnoreCase(X_Rotation_Color_Act)) {
 	  			pass(driver,"X rotation output highlighted in blue color");
 	  		}else {
 	  			fail(driver,"X rotation output not highlighted in blue color");
 	  		}
 	  	    setTestCaseID("");
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
 			setTestCaseID("TC_BARWITHLINE_ AXIS_TITLE_016");
 	     	String X_label_Rotation_Act=getRotationValue(driver,X_Label_Value_Chart);
 	     	if(X_Rotation_Input.equals(X_label_Rotation_Act)) {
 	 	    	 pass(driver,"Selected X Rotation Angle ("+X_Rotation_Input+") Updated in X Axis label chart value");
 	  		}else {
 	  			fail(driver,"Selected X Rotation Angle ("+X_Rotation_Input+") is not Updated in X Axis label chart value");
 	  		}
       	
 	     	setTestCaseID("TC_BARWITHLINE_ AXIS_TITLE_015");
 	  		String Y_label_Rotation_Act1=getRotationValue(driver,Y_Label_Value_Chart);
 	     	if(X_Rotation_Input.equals(Y_label_Rotation_Act1)) {
 	  		    fail(driver,"Selected X Rotation Angle ("+X_Rotation_Input+") Updated in Y Axis label chart value");
 	  		}else {
 	  			pass(driver,"Selected X Rotation Angle ("+X_Rotation_Input+") is not Updated in Y Axis label chart value");
 	  		}
 	     	
 	     	
 	     	setTestCaseID("TC_BARWITHLINE_ AXIS_TITLE_017");
 	       	verifyElementDisplayed(driver, Y_RotationText);
 	       	verifyElementDisplayed(driver,Y_RotationOutputValue);
       		String Y_RotationValueAct=getText1(driver,Y_RotationOutputValue);
       		System.out.println("Y rotation : "+Y_RotationValueAct);
       		if(Y_RotationValueAct.equals(defaultRotation_Y)) {
      			pass(driver,"By default, '"+defaultRotation_Y+"' displayed in the Y axis Rotation output field");
       		}else {
           	    fail(driver,"By default, '"+defaultRotation_Y+"' displayed in the Y axis Rotation output field");
       		}
      		String Y_Rotation_Color_Act=getTextBackgroundColor(driver,Y_RotationOutputValue);
      		if(RotationInputColor_Exp.equalsIgnoreCase(Y_Rotation_Color_Act)) {
      			pass(driver,"Y rotation output highlighted in blue color");
      		}else {
      			fail(driver,"Y rotation output not highlighted in blue color");
      		}
 	       	
 	       	
 	        setTestCaseID("");
 	        waitForElement(driver, Y_RotationInputSlider);
 	       	moveSlider(driver,Y_RotationInputSlider,Y_RotationOutputValue,Y_Rotation_Input);
 	       	scrollUsingElement(driver, ApplyButton);
 	  		click(driver,ApplyButton);
 	  		elementnotvisible1(driver, RPE_Loading);
 	  		verifyElementDisplayed(driver,Chart_Section);
 	  		setTestCaseID("TC_BARWITHLINE_ AXIS_TITLE_018");
 	     	String Y_label_Rotation_Act=getRotationValue(driver,Y_Label_Value_Chart);
 	     	if(Y_Rotation_Input.equals(Y_label_Rotation_Act)) {
 	  		    pass(driver,"Selected Rotation Angle ("+Y_Rotation_Input+") Updated in Y Axis label chart value");
 	  		}else {
 	  			fail(driver,"Selected Rotation Angle ("+Y_Rotation_Input+") is not Updated in Y Axis label chart value");
 	  		}
 	     	
 	     	setTestCaseID("TC_BARWITHLINE_ AXIS_TITLE_019");
 	     	String X_label_Rotation_Act1=getRotationValue(driver,X_Label_Value_Chart);
 	     	if(Y_Rotation_Input.equals(X_label_Rotation_Act1)) {
 	 	    	 fail(driver,"Selected Y Rotation Angle ("+Y_Rotation_Input+") Updated in X Axis label chart value");
 	  		}else {
 	  			pass(driver,"Selected Y Rotation Angle ("+Y_Rotation_Input+") is not Updated in X Axis label chart value");
 	  		}
 	     	
 	     	
 	     	setTestCaseID("TC_BARWITHLINE_ AXIS_TITLE_020");
 	       	verifyElementDisplayed(driver, switchSliderText);
 	     	if(verifyElementDisplayed(driver,switchSlider)){
	 	   		if(isToggleEnable(driver, switchSliderInput)) {
	 	   			fail(driver,"By default Start axis at 0 toggle enabled");
	 	   		}else {
	 	   			pass(driver,"By default Start axis at 0 toggle disabled");
	 	   		}	    
	 	   		//Clicking the Start Axis At 0 toggle to enable it
	 	   		click(driver,switchSlider);
	 	   		wait(driver,"1");
		 	   	if(isToggleEnable(driver, switchSliderInput)) {
	 	   			pass(driver,"Start axis at 0 toggle is enabled when enabling it");
	 	   		}else {
	 	   			fail(driver,"Start axis at 0 toggle is not enabled when enabling it");
	 	   		}	
	            scrollUsingElement(driver, ApplyButton);
	   		  	click(driver,ApplyButton);
	 	  		elementnotvisible1(driver, RPE_Loading);
	 	  		verifyElementDisplayed(driver,Chart_Section);
	 	  		
	 	  		//Taking both Right And Side axis first Value, then Comparing both values if both equal to 0 then we can validate the Start Axis At 0 working fine
	      	    String First_Start_Value_Left=getText1(driver,Y_Label_Value_Chart);
	      	    String First_Start_Value_Right=getText1(driver,Y_Labe_Value_Chart_Right);

	 	      	if(First_Start_Value_Left.equals("0") && First_Start_Value_Right.equals("0") ) {
	 	  			pass(driver,"Axis Started from '0' correctly when the toggle is enabled");
	 	      	}else {
	 	  			fail(driver,"Axis not Started from '0' correctly when the toggle is enabled");
	 	      	}	
 	       }
 	     	
 	       setTestCaseID("TC_BARWITHLINE_ AXIS_TITLE_021");
 	       verifyElementDisplayed(driver, Synchronise_Text);
 	       verifyElementDisplayed(driver,Synchronise_Axis_Toggle);
 	       if(isToggleEnable(driver, Synchronise_Axis)) {
	   			fail(driver,"By default Synchronise Axis toggle enabled");
	   	   }else {
	   			pass(driver,"By default Synchronise Axis toggle disabled");
	   	   }	
 	       
 	       click(driver,Synchronise_Axis_Toggle);
 	       wait(driver,"1");
 	       if(isToggleEnable(driver, Synchronise_Axis)) {
	   			pass(driver,"Synchronise Axis toggle is enabled when enabling it");
	   	   }else {
	   			fail(driver,"Synchronise Axis toggle is not enabled when enabling it");
	   	   }
           scrollUsingElement(driver, ApplyButton);
           click(driver,ApplyButton);
           elementnotvisible1(driver, RPE_Loading);
           verifyElementDisplayed(driver,Chart_Section);
	     	    
           // Taking Both Side Axis Values in the Chart And then Comparing both side Values to verify both are equal when the Synchronise Axis toggle is enabled
           List<WebElement> RightSideLabels=getWebElements(driver,Y_Labe_Value_Chart_Right);
           List<WebElement> LeftSideLabels=getWebElements(driver,Y_Label_Value_Chart);
           //Intially set as True on boolean value and in the loop if any one value not equal, then set the boolean value false. 
           boolean Synchronise=true;
           for(int k=0;k<RightSideLabels.size();k++) {
        	   String rightSideText=RightSideLabels.get(k).getText();
        	   String leftSideText=LeftSideLabels.get(k).getText();
        	   if(!rightSideText.equals(leftSideText)) {
        		   //Checking the each value in the right side value with respect to left  side, if any one of the Value not equal, fails the report and stop checking the loop
        		   fail(driver,"Synchronise Axis toggle is not working properly , RightSide Value : "+rightSideText+", leftSideValue : "+leftSideText);
        		   Synchronise=false;
        		   break;
        	   }
           }
           
           //After the loop, if the boolean value still true, then we can validate, it is pass.
           if(Synchronise==true) {
        	   pass(driver,"Synchronise Axis toggle is working properly When it is enabled");
           }
 	     	
 		}
         // ******************** AxisTitle Validation End *******************
     	
	 	// ******************** ChartTitle Validation Start *******************
	      String BarWithLine_Chart_Title= getCellValue("TestExecution","Testcase_Selection","BarWithLine_Chart_Title",Flag);
	      if(BarWithLine_Chart_Title.equals("Yes") && AllTestcase==true) {
	     	 	CHART_TITLE chartTitle=new CHART_TITLE();
	            chartTitle.chartTitleTest(driver, TypeBackgroundColor1_ChartTitle, TypeTextColor1_ChartTitle, Change_FontFamily_ChartTitle, ChangeFontSize_ChartTitle,ChangeChartTitleName);       	
	      }
	    // ******************** ChartTitle Validation End *******************
	    
	  //********** ChartStyle Validation Start *************************
        
	    setTestCaseID("TC_BARWITHLINE_ CHART_STYLE_001");
	    //verifying the Chart Format displayed and Clicking the Chart Format
        verifyElementDisplayed(driver,Chart_FormatSec);
		click(driver,Chart_FormatSec);
		
		//Taking the Input Condition from execution excel sheet for whether the BarWithLine Chart Style is Yes/No for execution.
     	String BarWithLine_Chart_Style= getCellValue("TestExecution","Testcase_Selection","BarWithLine_Chart_Style",Flag);
     	//If we provide Yes, then execute the code of the Chart Style Validation which developed inside the If condition 
        if(BarWithLine_Chart_Style.equals("Yes")&&AllTestcase==true) {
        	
        	//Validating Chart Format is expanded or not 
	      	 String ChartFormatOpenstatus=getAttribute1(driver, chartFormatExpand, "class");
	  		 if(ChartFormatOpenstatus.contains("up")) {
	  			pass(driver,"Chart Format is expanded when clicking the Chart Format");
	  		 }else {
	  			fail(driver,"Chart Format is not expanded when click the Chart Format");
	  			
	  		 }
	  		 
	  		 //Validating the Chart Format is blue Color or not after expanding it.
	  		 String ChartFormatColor=getTextColor(driver, Chart_FormatSec);
	  		 if(ChartFormatColor.equalsIgnoreCase(ChartFormatColorExp)) {
	  			pass(driver,"Chart Format gets highlighted in blue Color after it expands");
	  		 }else {
	  			fail(driver,"Chart Format not highlighted in blue Color after it expands"); 
	  		 }
	  		 
	  		 setTestCaseID("TC_BARWITHLINE_ CHART_STYLE_002");
	  		 verifyElementDisplayed(driver,ChartStyling); 
	  		 
	  		 String ChartStylingExpand=getAttribute1(driver, ChartStyling_Expand, "class");
  			 if(ChartStylingExpand.contains("up")) {
  				pass(driver,"By default, Chart Styling gets Expanded");
  			 }else {
  				fail(driver,"By default, Chart Styling not gets Expand");
  			 }
  			 
 			 String ChartStylingColor_Act=getTextColor(driver, ChartStyling);
 			 if(ChartStylingColor_Exp.equalsIgnoreCase(ChartStylingColor_Act)) {
 				pass(driver,"Chart Styling gets highlighted in blue color ");
 			 }else {
 				fail(driver,"Chart Styling not highlighted in blue color"); 
 			 }

 			 setTestCaseID("TC_BARWITHLINE_ CHART_STYLE_003");
  			 verifyElementDisplayed(driver,ChartThemeText);
  			 verifyElementDisplayed(driver,ChartThemeInput);
  			   	
  			 verifyElementDisplayed(driver,Line_Stroke_text);
 			 verifyElementDisplayed(driver,Line_Stroke_Input);
 			  
 			 verifyElementDisplayed(driver,Line_bullet_Text);
 			 verifyElementDisplayed(driver,Line_bullet_Input);
 			  
 			 verifyElementDisplayed(driver,BulletType_Text);
 			 verifyElementDisplayed(driver,BulletType_Input);
 			 
 			 verifyElementDisplayed(driver,Stroke_Width_text);
 			 verifyElementDisplayed(driver,Stroke_Width_Input);
 			 
 			 verifyElementDisplayed(driver,Line_Style_text);
 			 verifyElementDisplayed(driver,Line_Style_Input);
 			 
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
  			 
  			 
  			 setTestCaseID("TC_BARWITHLINE_ CHART_STYLE_004");
  			 String defaultThemeValue_Act=getText1(driver,ChartThemeInput);
  			 if(defaultThemeValue_Act.equals(DefaultThemeValue_Exp)) {
  				 pass(driver,"By default, Chart theme selected the value as '"+DefaultThemeValue_Exp+"'");
  			 }else {
  				 fail(driver,"By default, '"+DefaultThemeValue_Exp+"' value not selected in the  Chart theme input");
  			 }
  			 setTestCaseID("");
  			 click(driver,ChartThemeInput);
  			 if(verifyElementDisplayed(driver,ChartThemeResults)) {
  				 pass(driver,"Chart theme dropdown opened and displayed list of chart themes");
  				 mouseOverToElement(driver,ThirdValue);
  				 wait(driver,"1");
  				 setTestCaseID("");
  				 String mouseHighlightColor=getTextBackgroundColor(driver,ThirdValue);
  				 if(Highlight_ColorStyle_Exp.equalsIgnoreCase(mouseHighlightColor)) {
  					 pass(driver,"Mouse hovered value highlighted in blue color");
  				 }else {
  					 fail(driver,"Mouse hovered value not highlighted in blue color");
  				 }
  			
  				 setTestCaseID("");
  				 ScrollBarValidation1(driver,ChartThemeResults,"Chart_Theme_BarWithChart");
  			
  				 List<WebElement> beforeSearchResults=getWebElements(driver,chartThemeResultList);
  				 int beforeSearchSize=beforeSearchResults.size();
  				 setTestCaseID("TC_BARWITHLINE_ CHART_STYLE_005");
  				 verifyElementIsPresent1(driver,dropdownInputsearchBox);
  				 click(driver,dropdownInputsearchBox);
  				 sendKeys(driver,dropdownInputsearchBox,"sdgffh");
  				 String inValidResult=getText1(driver,chartThemeFirstResult);
  				 if(inValidResult.equals("No results found")) {
  					 pass(driver,"'No results found' displayed when user enter incorrect chart theme");
  				 }else {
  					 fail(driver,"'No results found' not displayed when user enter incorrect chart theme");
  				 }
  			       
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
  			     
  				 setTestCaseID("");
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
  			 
  			 setTestCaseID("TC_BARWITHLINE_ CHART_STYLE_007");
  			 String defaultLineStroke_Act=getTextBackgroundColor(driver, Line_Stroke_Pointer);
   	  		 if(defaultLineStroke_Act.equalsIgnoreCase(Default_Line_Stroke_Exp)) {
   	  			 pass(driver,"By default "+Default_Line_Stroke_Exp+" is displayed in the Line Stroke Input");
   	  		 }else {
   	  			 fail(driver,"By default "+Default_Line_Stroke_Exp+" is not displayed in the Line Stroke Input"); 
   	  		 }
   	  		 
   	  	     setTestCaseID("TC_BARWITHLINE_ CHART_STYLE_008");
   	  		 click(driver,Line_Stroke_Input);
   	  		 wait(driver,"1");
	   	  	 action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
	         sendKeys(driver,Line_Stroke_Input,Change_Line_Stroke_Color_Chart_Style);
	         click(driver,Line_Stroke_text);
	         String Line_Stroke_Act=getTextBackgroundColor(driver, Line_Stroke_Pointer);
	
	         if((Line_Stroke_Act.equalsIgnoreCase(Change_Line_Stroke_Color_Chart_Style))) {
	  			pass(driver,"Manually Enter the Color, "+Change_Line_Stroke_Color_Chart_Style+" updated in the Line Stroke Input");
	         }else {
	  			fail(driver,"Manually Enter the Color, "+Change_Line_Stroke_Color_Chart_Style+" not updated in the Line Stroke Input");
	         }
 		
	         scrollUsingElement(driver,ApplyButton);
	 		 click(driver,ApplyButton);
	         
   	  		 String AppliedLineStroke_act=getTextColor(driver, Line_Stroke_Chart);
   	  		 if(AppliedLineStroke_act.equalsIgnoreCase(Change_Line_Stroke_Color_Chart_Style)) {
   	  			 pass(driver,"Selected "+Change_Line_Stroke_Color_Chart_Style+" color is applied in Line Stroke in the chart");
   	  		 }else {
   	  			 fail(driver,"Selected "+Change_Line_Stroke_Color_Chart_Style+" color is not applied in Line Stroke in the chart");
   	  		 }
   	  		 
   	  	     setTestCaseID("");
   	  	     click(driver,Line_Stroke_Input);
   	         wait(driver,"1");
   	         action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
   	         action.sendKeys(Keys.BACK_SPACE).build().perform();
   	         wait(driver,"1");
   	         click(driver,Line_Stroke_text);
   	         String AfterRever_LineStroke=getTextBackgroundColor(driver, Line_Stroke_Pointer);
   	         if((AfterRever_LineStroke.equalsIgnoreCase(Default_Line_Stroke_Exp))) {
   	 			 pass(driver,"After revert all color selection default Color is updated in the Line Stroke Input");
   	         }else {
   	 			 fail(driver,"After revert all color selection default Color is not updated in the Line Stroke Input");
   	         }
   	         setTestCaseID("");
   	         click3(driver,Line_Stroke_text);
   	         click(driver,Line_Stroke_Input);
   	         waitForElement(driver,ColorPickerOpen);
   	         verifyElementIsPresent1(driver,ThemeColor);
   	         verifyElementIsPresent1(driver,History);
   	         mouseOverToElement(driver,Color6);
   	         wait(driver,"1");
   	         mouseOverToElement(driver,mouseOverColorHistory);
   	         wait(driver,"1");
   	         mouseOverToElement(driver,Color6);
   	         String mouseOverHistoryColor=getText1(driver,mouseOverColorHistory);
   	         doubleClick(driver,mouseOverColorHistory);
   	         wait(driver,"1");
   	         action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
   	         doubleClick(driver,Line_Stroke_Input);
   	         wait(driver,"1");
   	         action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
   	         wait(driver,"1");
   	         click(driver,Line_Stroke_text);
   	         String AfterPasteBackgroundColor=getTextBackgroundColor(driver, Line_Stroke_Pointer);
   	         if(AfterPasteBackgroundColor.equalsIgnoreCase(mouseOverHistoryColor)) {
	          	pass(driver,"Copy Paste Color value is working fine in Line Stroke Input");
   	         }else {
	          	fail(driver,"Copy Paste Color value is not working fine in Line Stroke Input");
   	         }
  			 
   	         setTestCaseID("TC_BARWITHLINE_ CHART_STYLE_009");
  			 String defaultLineBullet_Act=getTextBackgroundColor(driver, Line_bullet_Input_Pointer);
   	  		 if(defaultLineBullet_Act.equalsIgnoreCase(Default_Line_Bullet_Exp)) {
   	  			 pass(driver,"By default "+Default_Line_Bullet_Exp+" is displayed in the Line Bullet Input");
   	  		 }else {
   	  			 fail(driver,"By default "+Default_Line_Bullet_Exp+" is not displayed in the Line Bullet Input"); 
   	  		 }
   	  		 
   	  	     setTestCaseID("TC_BARWITHLINE_ CHART_STYLE_010");
   	  		 click(driver,Line_bullet_Input);
   	  		 wait(driver,"1");
	   	  	 action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
	         sendKeys(driver,Line_bullet_Input,Change_Line_Bullet_Color_Chart_Style);
	         click(driver,Line_Stroke_text);
	         String Line_Bullet_Act=getTextBackgroundColor(driver, Line_bullet_Input_Pointer);
	
	         if((Line_Bullet_Act.equalsIgnoreCase(Change_Line_Bullet_Color_Chart_Style))) {
	  			pass(driver,"Manually Enter the Color, "+Change_Line_Bullet_Color_Chart_Style+" updated in the Line Bullet Input");
	         }else {
	  			fail(driver,"Manually Enter the Color, "+Change_Line_Bullet_Color_Chart_Style+" not updated in the Line Bullet Input");
	         }
 		
	         scrollUsingElement(driver,ApplyButton);
	 		 click(driver,ApplyButton);
	         
//   	  		 String AppliedLineStroke_act=getTextColor(driver, Line_Stroke_Chart);
//   	  		 if(AppliedLineStroke_act.equalsIgnoreCase(Change_Line_Stroke_Color_Chart_Style)) {
//   	  			 pass(driver,"Selected "+Change_Line_Stroke_Color_Chart_Style+" color is applied in Line Stroke in the chart");
//   	  		 }else {
//   	  			 fail(driver,"Selected "+Change_Line_Stroke_Color_Chart_Style+" color is not applied in Line Stroke in the chart");
//   	  		 }
//   	  		 
//   	  	     setTestCaseID("");
//   	  	     click(driver,Line_Stroke_Input);
//   	         wait(driver,"1");
//   	         action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
//   	         action.sendKeys(Keys.BACK_SPACE).build().perform();
//   	         wait(driver,"1");
//   	         click(driver,Line_Stroke_text);
//   	         String AfterRever_LineStroke=getTextBackgroundColor(driver, Line_Stroke_Pointer);
//   	         if((AfterRever_LineStroke.equalsIgnoreCase(Default_Line_Stroke_Exp))) {
//   	 			 pass(driver,"After revert all color selection default Color is updated in the Line Stroke Input");
//   	         }else {
//   	 			 fail(driver,"After revert all color selection default Color is not updated in the Line Stroke Input");
//   	         }
//   	         setTestCaseID("");
//   	         click3(driver,Line_Stroke_text);
//   	         click(driver,Line_Stroke_Input);
//   	         waitForElement(driver,ColorPickerOpen);
//   	         verifyElementIsPresent1(driver,ThemeColor);
//   	         verifyElementIsPresent1(driver,History);
//   	         mouseOverToElement(driver,Color6);
//   	         wait(driver,"1");
//   	         mouseOverToElement(driver,mouseOverColorHistory);
//   	         wait(driver,"1");
//   	         mouseOverToElement(driver,Color6);
//   	         String mouseOverHistoryColor=getText1(driver,mouseOverColorHistory);
//   	         doubleClick(driver,mouseOverColorHistory);
//   	         wait(driver,"1");
//   	         action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
//   	         doubleClick(driver,Line_Stroke_Input);
//   	         wait(driver,"1");
//   	         action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
//   	         wait(driver,"1");
//   	         click(driver,Line_Stroke_text);
//   	         String AfterPasteBackgroundColor=getTextBackgroundColor(driver, Line_Stroke_Pointer);
//   	         if(AfterPasteBackgroundColor.equalsIgnoreCase(mouseOverHistoryColor)) {
//	          	pass(driver,"Copy Paste Color value is working fine in Line Stroke Input");
//   	         }else {
//	          	fail(driver,"Copy Paste Color value is not working fine in Line Stroke Input");
//   	         }
//  			 
//  			 
//  			 
//  			 
//  			 
//  			 
//  			 
//  			 
//  			 
//  			 
//  			 
//  			 
//  			 
//  			 
//  			 
//  			 
//  			 
//  			 
//  			 
//  			 
//  			 
//  			 
//  			 
//  			 
//  			//Testing 
// 			//String X_Selected=getText1(driver,X_Axis_Input);
// 	        String Y_Selected=getText1(driver,Y_SelectedValue);
// 	        
// 	        setTestCaseID("TC_GROUP_BAR_098");
//  			 if(isToggleEnable(driver,AutoScroll_toggle)) {
//  				 pass(driver,"By default, 'AutoScroll' toggle is enabled");
//  				 setTestCaseID("TC_GROUP_BAR_099");
//  				 
//  				 if(isToggleEnable(driver,X_Scroll_toggle)) {
//  					 fail(driver,"X Scroll toggle not disabled when AutoScroll toggle is enabled for the X Value : "+Select_X_Axis_Value1+", "+Select_X_Axis_Value2+", "+Select_X_Axis_Value1);
//  				 }else {
//  					 pass(driver,"X Scroll toggle disabled when AutoScroll toggle is enabled");
//  				 }
//  			  		   
//  				 if(isToggleEnable(driver,Y_Scroll_toggle)) {
//  					 fail(driver,"Y Scroll toggle not disabled when AutoScroll toggle is enabled for the Y_Value : "+Y_Selected);
//  				 }else {
//  					 pass(driver,"Y Scroll toggle disabled when AutoScroll toggle is enabled for the Y_Value : "+Y_Selected);
//  				 }
//  			  		   
//  			 }else {
//  				 fail(driver,"By default, 'AutoScroll' toggle is not enabled");
//  			 }
//  			   	
//  			 setTestCaseID("TC_GROUP_BAR_100");
//  			 if(isToggleAccessible(driver,X_Scroll_toggle) && isToggleAccessible(driver,Y_Scroll_toggle)){
//  				 fail(driver,"X Scroll and Y Scroll toggle accessible when AutoScroll toggle is enabled");
//  			 }else {
//  				 pass(driver,"X Scroll and Y Scroll toggle not accessible when AutoScroll toggle is enabled");
//  			 }
//  			 
//  			 setTestCaseID("");
//  			 click(driver,Auto_ScrollInputSlider);
//  			 if(isToggleEnable(driver,AutoScroll_toggle)){
//  				 fail(driver,"'Auto Scroll' toggle not disabled when click on it");
//  			 }else {
//  				 pass(driver,"'Auto Scroll' toggle disabled when click on it");
//  			 }
//  			   	
//  			 if(isToggleAccessible(driver,X_Scroll_toggle) && isToggleAccessible(driver,Y_Scroll_toggle)){
//  				 pass(driver,"X Scroll and Y Scroll toggle accessible when AutoScroll toggle is disabled");
//  			 }else {
//  				 fail(driver,"X Scroll and Y Scroll toggle not accessible when AutoScroll toggle is disabled");
//  			 }
//  			   	
//  			setTestCaseID("TC_GROUP_BAR_101");
//  			 boolean X_ScrollEnable=false;
//  			 if(isToggleEnable(driver,X_Scroll_toggle)){
//  				// pass(driver,"X Scroll toggle enabled when click on it");
//  				X_ScrollEnable=true;
//  			 }else {
//  				click(driver,X_ScrollInputSlider);
//  				if(isToggleEnable(driver, X_Scroll_toggle)) {
//  					pass(driver,"X Scroll toggle enabled when enabling it");
//  					 X_ScrollEnable=true;
//  				}else {
//  					fail(driver,"X Scroll toggle not enabled when enabling it");
//  				}
//  			 }
//  			   	
//  			 boolean Y_ScrollEnable=false;
//   			 if(isToggleEnable(driver,Y_Scroll_toggle)){
//   				 //pass(driver,"Y Scroll toggle enabled when click on it");
//   				 Y_ScrollEnable=true;
//   			 }else {
//   				 //fail(driver,"Y Scroll toggle not enabled when click on it");
//   				 click(driver,Y_ScrollInputSlider);
//   				 wait(driver,"1");
//   				 if(isToggleEnable(driver,Y_Scroll_toggle)){
//   					 pass(driver,"Y Scroll toggle enabled when enabling it");
//   					 Y_ScrollEnable=true;
//   				 }else {
//   					 fail(driver,"Y Scroll toggle not enabled when enabling it");
//   				 }
//   			 }
//   			   	
//  			   	
//  			 scrollUsingElement(driver, ApplyButton);
//  			 click(driver,ApplyButton);
//  			 elementnotvisible1(driver, Loading);
//  			 elementnotvisible1(driver, RPE_Loading);
//  			 verifyElementDisplayed(driver,Chart_Section);
//  			// waitForElement(driver, ChartBarDisplayCount);
//  			
//  			 if(X_ScrollEnable==true) {
//  				if(isDisplayed(driver,X_Scroll_Bar1)) {
//     				 pass(driver,"X Scroll Bar is displayed in the chart after enabling it");
//     			 }else {
//     				 fail(driver,"X Scroll Bar is not displayed in the chart after enabling it");
//     			 }
//  			 }
//  			 
//  			 
//  			 if(Y_ScrollEnable==true) {
//  				 if(isDisplayed(driver,Y_Scroll_Bar1)) {
//  					 pass(driver,"Y Scroll Bar is displayed in the chart after enabling it");
//  				 }else {
//  					 fail(driver,"Y Scroll Bar is not displayed in the chart after enabling it");
//  				 }
//  			 }
//  			 
//  			 
//  			 click(driver,Auto_ScrollInputSlider);
//  			 wait(driver,"1");
//  			   	
//  			 if(isToggleEnable(driver,X_Scroll_toggle) && isToggleEnable(driver,Y_Scroll_toggle)){
//  				 fail(driver,"X Scroll and Y Scroll toggle not automatically disabled when enabling the AutoScroll toggle");
//  			 }else {
//  				 pass(driver,"X Scroll and Y Scroll toggle automatically disabled when enabling the AutoScroll toggle");
//  			 }
//  			   	
//  			setTestCaseID("TC_GROUP_BAR_102");
//  			 if(isToggleEnable(driver,EnableGrid_toggle)) {
//  				 pass(driver,"By default, 'Enable Grid' toggle is enabled");
//  				 
//  				 scrollUsingElement(driver, ApplyButton);
//  	  			 click(driver,ApplyButton);
//  	  			 elementnotvisible1(driver, Loading);
//  	  			 elementnotvisible1(driver, RPE_Loading);
//  	  			 verifyElementDisplayed(driver,Chart_Section);
//  	  			
//  	  			 if(isDisplayed(driver,Grid_Stacked_Column)) {
//  	  				 pass(driver,"Grid is displayed in the chart when it is enable");
//  	  			 }else {
//  	  				 fail(driver,"Grid is not displayed in the chart when it is enable");
//  	  			 }
//  				
//  	  			setTestCaseID("TC_GROUP_BAR_103");
//  				 click(driver,EnableGrid_InputSlider);
//  				 wait(driver,"1");
//  				 if(isToggleEnable(driver,EnableGrid_toggle)){
//  					 fail(driver,"'Enable Grid' toggle not disabled when click on it ");
//  				 }else {
//  					 pass(driver,"'Enable Grid' toggle disabled when click on it ");
//  				 }
//  			    		
//  				 scrollUsingElement(driver, ApplyButton);
//  	  			 click(driver,ApplyButton);
//  	  			 elementnotvisible1(driver, Loading);
//  	  			 elementnotvisible1(driver, RPE_Loading);
//  	  			 verifyElementDisplayed(driver,Chart_Section);
//  	  			
//  	  			 if(isDisplayed(driver,Grid_Stacked_Column)) {
//  	  				 fail(driver,"Grid is displayed in the chart when it is disable");
//  	  			 }else {
//  	  				 pass(driver,"Grid is not displayed in the chart when it is disable");
//  	  			 }
//  	  		     click(driver,EnableGrid_InputSlider);
//  			 }else {
//  				 fail(driver,"By default, 'Enable Grid' toggle is not enabled");
//  			 }
//  		
//  			 setTestCaseID("TC_GROUP_BAR_104");
//  			 click(driver,ChartStyling);
//  			 wait(driver,"1");
//  			 String chartStyleClose_Act=getAttribute1(driver, ChartStyling_Expand, "class");
//  			 if(chartStyleClose_Act.contains("down")) {
//  				 pass(driver,"Chart styling gets collapsed when click on it");
//  			 }else {
//  				 fail(driver,"Chart styling not gets collapsed when click on it");
//  			 }
	  		 
       }
		 //*********** ChartStyle validation end ************
        
        
	      
	      
        
    	
	}
}
