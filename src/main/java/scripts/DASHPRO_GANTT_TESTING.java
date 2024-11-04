package scripts;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import commonMethods.Keywords;
import commonMethods.Utils;

public class DASHPRO_GANTT_TESTING extends Keywords {

	public void gantt_widget_testing(WebDriver driver,int iteration,String Flag) {
		
		//Axes input
		String AxesColor_Exp=Utils.getDataFromTestData("Axes", "Axes_Color_Exp");
		String Highlight_color_Exp=Utils.getDataFromTestData("Axes", "HighlightColor");
		
		//Axis title
		String default_FontFamily=Utils.getDataFromTestData("AxisTitle", "default_FontFamily");
		String default_FontSize_Exp=Utils.getDataFromTestData("AxisTitle", "default_FontSize");
		String RotationInputColor_Exp=Utils.getDataFromTestData("AxisTitle", "RotationInput_Color");
		String defaultRotation=Utils.getDataFromTestData("AxisTitle", "default_Rotation_Value");

		//Chart Style
		String ChartFormatColorExp=Utils.getDataFromTestData("ChartFormat_ChartStyle", "ChartFormatColorExp");
		String ChartStylingColor_Exp=Utils.getDataFromTestData("ChartFormat_ChartStyle", "ChartStylingColor_Exp");
		String DefaultThemeValue_Exp=Utils.getDataFromTestData("ChartFormat_ChartStyle", "defaultThemeValue_Exp");
		String Highlight_ColorStyle_Exp=Utils.getDataFromTestData("ChartFormat_ChartStyle", "HighlightColor_Exp");
		
		//Data Labels
		String DefaultFontSizeValue_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DefaultFontSizeValue");
		String DefaultRotationValue_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DefaultRotationValue");
				
		//Iteration
		//Axes
		String Select_Axis_Same_Value=Utils.getDataFromTestDataIteration(iteration,"GANTT_Widget_Input", "Select_Axis_Same_Value");
		String Select_Y_Axis_Value=Utils.getDataFromTestDataIteration(iteration,"GANTT_Widget_Input", "Select_Y_Axis_Value");
		String Select_X_Axis_Value=Utils.getDataFromTestDataIteration(iteration,"GANTT_Widget_Input", "Select_X_Axis_Value");
		String StartDate_Value=Utils.getDataFromTestDataIteration(iteration,"GANTT_Widget_Input", "StartDate_Value");
		String Duration_Value=Utils.getDataFromTestDataIteration(iteration,"GANTT_Widget_Input", "Duration_Value");
		String EndDate_Value=Utils.getDataFromTestDataIteration(iteration,"GANTT_Widget_Input", "EndDate_Value");

		//Axis Title Input
		String Change_X_Title_Name=Utils.getDataFromTestDataIteration(iteration,"GANTT_Widget_Input", "Change_X_Title_Name");
		String Change_Y_Title_Name=Utils.getDataFromTestDataIteration(iteration,"GANTT_Widget_Input", "Change_Y_Title_Name");
		String ChangeFontFamily_AxisTitle=Utils.getDataFromTestDataIteration(iteration,"GANTT_Widget_Input", "ChangeFontFamily_AxisTitle");
		String ChangeTitleFontSize_AxisTitle=Utils.getDataFromTestDataIteration(iteration,"GANTT_Widget_Input", "ChangeTitleFontSize_AxisTitle");
		String Change_X_label_FontSize=Utils.getDataFromTestDataIteration(iteration,"GANTT_Widget_Input", "Change_X_label_FontSize");
		String Change_Y_label_FontSize=Utils.getDataFromTestDataIteration(iteration,"GANTT_Widget_Input", "Change_Y_label_FontSize");
		String X_Rotation_Input=Utils.getDataFromTestDataIteration(iteration,"GANTT_Widget_Input", "X_Rotation_Input");
		String Y_Rotation_Input=Utils.getDataFromTestDataIteration(iteration,"GANTT_Widget_Input", "Y_Rotation_Input");

		//Chart title
		String TypeBackgroundColor1_ChartTitle=Utils.getDataFromTestDataIteration(iteration,"GANTT_Widget_Input", "TypeBackgroundColor1_ChartTitle");
		String TypeTextColor1_ChartTitle=Utils.getDataFromTestDataIteration(iteration,"GANTT_Widget_Input", "TypeTextColor1_ChartTitle");
		String Change_FontFamily_ChartTitle=Utils.getDataFromTestDataIteration(iteration,"GANTT_Widget_Input", "Change_FontFamily_ChartTitle");
		String ChangeFontSize_ChartTitle=Utils.getDataFromTestDataIteration(iteration,"GANTT_Widget_Input", "ChangeFontSize_ChartTitle");
		String ChangeChartTitleName=Utils.getDataFromTestDataIteration(iteration,"GANTT_Widget_Input", "ChangeChartTitleName");
	
		//Chart Style
		String Change_ChartTheme_ChartStyle=Utils.getDataFromTestDataIteration(iteration,"GANTT_Widget_Input", "Change_ChartTheme_ChartStyle");
				
		//Data Label
		String ChangeFontSizeValue_DataLabel=Utils.getDataFromTestDataIteration(iteration,"GANTT_Widget_Input", "ChangeFontSizeValue_DataLabel");
		String ChangeFontFamily_DataLabel=Utils.getDataFromTestDataIteration(iteration,"GANTT_Widget_Input", "ChangeFontFamily_DataLabel");
		String ChangeRotataionVal_Positive_DataLabel=Utils.getDataFromTestDataIteration(iteration,"Line_Widget_Input", "ChangeRotataionVal_Positive_DataLabel");
		String ChangeRotataionVal_Negative_DataLabel=Utils.getDataFromTestDataIteration(iteration,"Line_Widget_Input", "ChangeRotataionVal_Negative_DataLabel");
				
		
		setTestCaseID(" ");
		Actions action=new Actions(driver);
		mouseOverToElement(driver, ADDTabPlus);
  	    mouseOverAndClick(driver, ADDTabPlus);
  	    wait(driver,"1");
  	    sendKeys(driver,newlyAddedTab,"GanttWidgetTestTab");
  	    click(driver,DashProPage);
  	    elementnotvisible1(driver, RPE_Loading);
		waitForElement(driver,ADD_widget_rightTop);
	    click(driver,ADD_widget_rightTop);
	    elementnotvisible(driver,Loading);
	    elementnotvisible1(driver, RPE_Loading);
		waitForElement(driver,WidgetPanel);
		waitForElement(driver,Sparkline_widget);
		
		setTestCaseID("TC_GANTT_AXES_001");
		waitForElement(driver,Gantt_widget);
		verifyElementDisplayed(driver, Gantt_widget);
		setTestCaseID("TC_GANTT_AXES_002");
		WidgetValidation(driver,Gantt_widget,"Gantt");
		setTestCaseID("TC_GANTT_AXES_003");
		click(driver,Gantt_widget);
		if(!isDisplayed(driver,error)) {
			elementnotvisible(driver, Loading);
			elementnotvisible1(driver, RPE_Loading);
			String widgetValue=getText1(driver,WidgetValue);
		 	if(widgetValue.equals("Gantt")) {
				pass(driver,"Gantt displayed as the selected Widget after click on it");
		 	}else {
		 		fail(driver,"Gantt not displayed as the selected Widget after click on it");
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
		 	
		 	
			verifyElementDisplayed(driver,Y_Axis_dropdown);
			verifyElementDisplayed(driver,Y_Axis_text);
			
			verifyElementDisplayed(driver,X_Axis_dropdown);
			verifyElementDisplayed(driver,X_Axis_text); 
			
			setTestCaseID("TC_GANTT_AXES_004");
			String defaultSelectValue_Y_Act=getText1(driver,Y_Axis_dropdown);
			if(defaultSelectValue_Y_Act.equals("Select")) {
				pass(driver,"By Default 'Select' is selected in the Y axis value input dropdown ");
			}else {
				fail(driver,"By Default 'Select' is not selected in the Y axis value input dropdown ");
			}
			
			String defaultSelectValue_X_Act=getText1(driver,X_Axis_dropdown);
			if(defaultSelectValue_X_Act.equals("Select")) {
				pass(driver,"By Default 'Select' is selected in the X axis value input dropdown ");
			}else {
				fail(driver,"By Default 'Select' is not selected in the X axis value input dropdown ");
			}
			
			scrollUsingElement(driver, ApplyButton);
			click(driver,ApplyButton);
			if(isDisplayed(driver,ApplyError1)) {
				pass(driver,"'Kindly select X axis and Y axis ' Error displayed when click Apply button without providing inputs");
			}else {
				fail(driver,"'Kindly select X axis and Y axis ' Error not displayed when click Apply button without providing inputs");
			}
			
			setTestCaseID("TC_GANTT_AXES_006");
			click(driver,Y_Axis_dropdown);
			if(isDisplayed(driver,Y_Axis_dropdownResults)) {
				pass(driver,"Y-Axis dropdown Expanded after click on it");
			}else {
				fail(driver,"Y-Axis dropdown not Expanded after click on it");
			}
			
			List<WebElement> displayedDataImage=getWebElements(driver, dataTypeImages);
			List<WebElement> AvailableColumnList=getWebElements(driver, AvailableList_Dropdown);
			int AvailableColumnListSize=AvailableColumnList.size()-1;
			if(AvailableColumnListSize==displayedDataImage.size()) {
				pass(driver,"All the available columns are displayed with data Type icon in the Y_Axis dropdown");
			}else {
				fail(driver,"Some columns are not correctly displayed with data Type icon in the Y_Axis dropdown");
			}
			
			for(WebElement dataImag:displayedDataImage) {
				String dataTypeDisplay=dataImag.getAttribute("src");
				if(dataTypeDisplay.contains("Categorical")) {
					
				}else {
					fail(driver,"Other than Categorical datatype Value is displayed in the Y_Axis dropdown");
					break;
				}
				
			}
			
			if(isDisplayed2(driver,CategoricalColumnAxisDropdown)) {
				String Categorical1=getText1(driver,CategoricalColumnAxisDropdown);
				if(Categorical1.contains("(")) {
					pass(driver,"Unique values are displayed in the Categorical Column in the Y_Axis dropdown");
				}else {
					fail(driver,"Unique values are not displayed in the Categorical Column in the Y_Axis dropdown");
				}
			}
			
			setTestCaseID("");
			ScrollBarValidation1(driver,Y_Axis_dropdownResults,"Y-Axis");
			mouseOverToElement(driver,SecondValue);
			String Highlight_Color_Act=getTextBackgroundColor(driver,SecondValue);
			if(Highlight_color_Exp.equalsIgnoreCase(Highlight_Color_Act)) {
				pass(driver," Mouse hovered Column Value highlighted in blue color in the Y_Axis dropdown");
			}else {
				fail(driver," Mouse hovered Column Value not highlighted in blue color in the Y_Axis dropdown, Exp : "+Highlight_color_Exp+" Act : "+Highlight_Color_Act);
			}
			
			setTestCaseID("TC_GANTT_AXES_007");
			if(verifyElementDisplayed(driver, dropdownInputsearchBox)) {
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
					if(isDisplayed2(driver,Y_Axis_dropdownResults)) {
						fail(driver,"Y_Axis Value dropdown not closed after perform 'Enter' action");
					}else {
						pass(driver,"Y_Axis Value dropdown closed automatically after perform 'Enter' action");
						String seletcedValue=getText1(driver,Y_Axis_dropdown);
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
			click(driver,Y_Axis_dropdown);
			waitForElement(driver,Y_Axis_dropdownResults);
			wait(driver,"1");
			String selectedColorAct=getTextBackgroundColor(driver,ListSelected);
			System.out.println("Highlight_color_Exp : "+Highlight_color_Exp+"selectedColorAct : "+selectedColorAct);
			String highlightText=getText1(driver,ListSelectedText);
			if((highlightText.contains(Select_Axis_Same_Value))&&Highlight_color_Exp.equalsIgnoreCase(selectedColorAct)) {
				pass(driver,"Selected Value ("+Select_Axis_Same_Value+") highlighted in blue color");
			}else {
				fail(driver,"Selected Value ("+Select_Axis_Same_Value+") not highlighted in blue color");
			}
			
			selectDropdownValue1(driver,Select_Axis_Same_Value);
			wait(driver,"1");
			if(isDisplayed2(driver,Y_Axis_dropdownResults)) {
				fail(driver,"Y_Axis Value dropdown not closed after selecting the value");
			}else {
				pass(driver,"Y_Axis Value dropdown closed automatically after selecting the value");
			}
			setTestCaseID("");
			scrollUsingElement(driver, ApplyButton);
			click(driver,ApplyButton);
			if(isDisplayed(driver,ApplyError1)) {
				pass(driver,"'Kindly select X axis and Y axis ' Error displayed when click Apply button only providing Y_Axis Value");
			}else {
				fail(driver,"'Kindly select X axis and Y axis ' Error not displayed when click Apply button only providing Y_Axis Value");
			}
			
			click(driver,Y_Axis_dropdown);
			waitForElement(driver,SelectOption);
			click(driver,SelectOption);
			wait(driver,"1");
			
			setTestCaseID("TC_GANTT_AXES_006");
			click(driver,X_Axis_dropdown);
			if(isDisplayed(driver,X_Axis_dropdownResults)) {
				pass(driver,"X-Axis dropdown Expanded after click on it");
			}else {
				fail(driver,"X-Axis dropdown not Expanded after click on it");
			}
			
			verifyElementDisplayed(driver, dropdownInputsearchBox);
			click(driver,dropdownInputsearchBox);
			
			displayedDataImage=getWebElements(driver, dataTypeImages);
			AvailableColumnList=getWebElements(driver, AvailableList_Dropdown);
			AvailableColumnListSize=AvailableColumnList.size()-1;
			if(AvailableColumnListSize==displayedDataImage.size()) {
				pass(driver,"All the available columns are displayed with data Type icon in the X_Axis dropdown");
			}else {
				fail(driver,"Some columns are not correctly displayed with data Type icon in the X_Axis dropdown");
			}
			
			for(WebElement dataImag:displayedDataImage) {
				String dataTypeDisplay=dataImag.getAttribute("src");
				if(dataTypeDisplay.contains("Categorical")) {
					
				}else {
					fail(driver,"Other than Categorical datatype column is displayed in the X_Axis dropdown");
					break;
				}
			}
			
			if(isDisplayed2(driver,CategoricalColumnAxisDropdown)) {
				String Categorical1=getText1(driver,CategoricalColumnAxisDropdown);
				if(Categorical1.contains("(")) {
					pass(driver,"Unique values are displayed in the Categorical Column in the X_Axis dropdown");
				}else {
					fail(driver,"Unique values are not displayed in the Categorical Column in the X_Axis dropdown");
				}
			}
			setTestCaseID("");
			ScrollBarValidation1(driver,X_Axis_dropdownResults,"X-Axis");
			mouseOverToElement(driver,SecondValue);
			Highlight_Color_Act=getTextBackgroundColor(driver,SecondValue);
			if(Highlight_color_Exp.equalsIgnoreCase(Highlight_Color_Act)) {
				pass(driver," Mouse hovered Column Value highlighted in blue color in the X_Axis dropdown");
			}else {
				fail(driver," Mouse hovered Column Value not highlighted in blue color in the X_Axis dropdown, Exp : "+Highlight_color_Exp+" Act : "+Highlight_Color_Act);
			}
			setTestCaseID("TC_GANTT_AXES_007");
			if(verifyElementDisplayed(driver, dropdownInputsearchBox)) {
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
					if(isDisplayed2(driver,X_Axis_dropdownResults)) {
						fail(driver,"X_Axis Value dropdown not closed after perform 'Enter' action");
					}else {
						pass(driver,"X_Axis Value dropdown closed automatically after perform 'Enter' action");
						String seletcedValue=getText1(driver,X_Axis_dropdown);
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
			click(driver,X_Axis_dropdown);
			waitForElement(driver,X_Axis_dropdownResults);
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
			if(isDisplayed2(driver,X_Axis_dropdownResults)) {
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
			
			setTestCaseID("TC_GANTT_AXES_005");
			click(driver,Y_Axis_dropdown);
			waitForElement(driver,Y_Axis_dropdownResults);
			selectDropdownValue1(driver,Select_Axis_Same_Value);
			wait(driver,"1");
			scrollUsingElement(driver, ApplyButton);
			click(driver,ApplyButton);
			if(isDisplayed(driver,ApplyError2)) {
				pass(driver,"'Kindly check fields and select different values' Error displayed when click Apply button with same X_Axis and Y_Axis Value");
			}else {
				fail(driver,"'Kindly check fields and select different values' Error not displayed when click Apply button with same X_Axis and Y_Axis Value");
			}

			setTestCaseID("TC_GANTT_AXES_008");
			click(driver,Y_Axis_dropdown);
			waitForElement(driver,Y_Axis_dropdownResults);
			selectDropdownValue1(driver,Select_Y_Axis_Value);
			
			click(driver,X_Axis_dropdown);
			waitForElement(driver,X_Axis_dropdownResults);
			selectDropdownValue1(driver,Select_X_Axis_Value);
			scrollUsingElement(driver, ApplyButton);
			click(driver,ApplyButton);
			if(isDisplayed(driver,error)) {
				 String errorWidget=getText1(driver,error);
	    		 if(errorWidget.contains("Kindly select start date")) {
	    			 pass(driver,"'Kindly select Start date' error is displayed When Click Apply button Only providing X and Y Axis Value");
	    		 }else {
	    			 fail(driver,"'Kindly select Start date' error is not displayed When Click Apply button Only providing X and Y Axis Value");
	    		 }
	    		 elementnotvisible1(driver, error);
			}else {
   			 	fail(driver,"'Kindly select Start date' error is not displayed When Click Apply button Only providing X and Y Axis Value");
			}
			
			setTestCaseID("");
			verifyElementDisplayed(driver, Start_Date_Input); 
			String defaultStartDateValue=getText1(driver,Start_Date_Input);
			if(defaultStartDateValue.equals("Select")) {
				pass(driver,"By Default 'Select' is selected in the Start_date input dropdown ");
			}else {
				fail(driver,"By Default 'Select' is not selected in the Start_date input dropdown ");
			}
			
			click(driver,Start_Date_Input);
			if(isDisplayed(driver,Start_Date_DropdownExpand)) {
				pass(driver,"Start Date dropdown Expanded after click on it");
			}else {
				fail(driver,"Start Date dropdown not Expanded after click on it");
			}
			displayedDataImage=getWebElements(driver, dataTypeImages);
			List<WebElement>  AvailableStartColumnList=getWebElements(driver, AvailableList_Dropdown);
			for(WebElement dataImag:displayedDataImage) {
				String dataTypeDisplay=dataImag.getAttribute("src");
				if(dataTypeDisplay.contains("Date")) {
					
				}else {
					fail(driver,"Other than Date datatype column is displayed in the Start Date dropdown");
					break;
				}
			}
			
			mouseOverToElement(driver,SecondValue);
			Highlight_Color_Act=getTextBackgroundColor(driver,SecondValue);
			if(Highlight_color_Exp.equalsIgnoreCase(Highlight_Color_Act)) {
				pass(driver," Mouse hovered Column Value highlighted in blue color in the Start_Date dropdown");
			}else {
				fail(driver," Mouse hovered Column Value not highlighted in blue color in the Start_Date dropdown, Exp : "+Highlight_color_Exp+" Act : "+Highlight_Color_Act);
			}
			
			if(verifyElementDisplayed(driver, dropdownInputsearchBox)) {
				click(driver,dropdownInputsearchBox);
				sendKeys(driver,dropdownInputsearchBox,"afghjku");
				if(isDisplayed2(driver,NoResultsFound)) {
					pass(driver,"'No Results found' message is displayed in while searching invalid value in the Start_Date dropdown input");
				}else {
					fail(driver,"'No Results found' message is not displayed in while searching invalid value in the Start_Date dropdown input");
				}
				
				clear1(driver,dropdownInputsearchBox);
				wait(driver,"1");
				if(isDisplayed2(driver,NoResultsFound)){
					fail(driver,"Column List are not displayed after clear the search input in the Start_Date dropdown");
				}else {
					pass(driver,"Column List are displayed after clear the search input in the Start_Date dropdown");
				}
				
				sendKeys(driver,dropdownInputsearchBox,StartDate_Value);
				wait(driver,"1");
				String firstValue_Y=getText1(driver,FirstSearchedvalue);
				if(firstValue_Y.contains(StartDate_Value)) {
					pass(driver,"Searched Value correctly displayed in the Start_Date dropdown");
				}else {
					fail(driver,"Searched Value not correctly displayed in the Start_Date dropdown");
				}
			}
			
			selectDropdownValue1(driver,StartDate_Value);
			wait(driver,"1");
			if(isDisplayed2(driver,Start_Date_DropdownExpand)) {
				fail(driver,"Start_Date dropdown not closed after selecting the value");
			}else {
				pass(driver,"Start_Date dropdown closed automatically after selecting the value");
			}
			
			scrollUsingElement(driver, ApplyButton);
			click(driver,ApplyButton);
			if(isDisplayed(driver,error)) {
				 String errorWidget=getText1(driver,error);
	    		 if(errorWidget.contains("Kindly select duration or end date to perform gantt chart")) {
	    			 pass(driver,"'Kindly select duration or end date to perform gantt chart' error is displayed When Duration and End Date Value are not Selected");
	    		 }else {
	    			 fail(driver,"'Kindly select duration or end date to perform gantt chart' error is not displayed When Duration and End Date Value are not Selected");
	    		 }
	    		 elementnotvisible1(driver, error);
			}else {
    			 fail(driver,"'Kindly select duration or end date to perform gantt chart' error is not displayed When Duration and End Date Value are not Selected");
			}
				
			verifyElementDisplayed(driver, Duration_Input);
			String defaultDurationValue=getText1(driver,Duration_Input);
			if(defaultDurationValue.equals("Select")) {
				pass(driver,"By Default 'Select' is selected in the Duration input dropdown ");
			}else {
				fail(driver,"By Default 'Select' is not selected in the Duration input dropdown ");
			}
			click(driver,Duration_Input);
			if(isDisplayed(driver,Duration_DropdownExpand)) {
				pass(driver,"Duration dropdown Expanded after click on it");
			}else {
				fail(driver,"Duration dropdown not Expanded after click on it");
			}
				
			displayedDataImage=getWebElements(driver, dataTypeImages);
			for(WebElement dataImag:displayedDataImage) {
				String dataTypeDisplay=dataImag.getAttribute("src");
				if(dataTypeDisplay.contains("Numerical")) {
					
				}else {
					fail(driver,"Other than Numerical datatype column is displayed in the Start Date dropdown");
					break;
				}
			}
			
			mouseOverToElement(driver,SecondValue);
			Highlight_Color_Act=getTextBackgroundColor(driver,SecondValue);
			if(Highlight_color_Exp.equalsIgnoreCase(Highlight_Color_Act)) {
				pass(driver," Mouse hovered Column Value highlighted in blue color in the Duration dropdown");
			}else {
				fail(driver," Mouse hovered Column Value not highlighted in blue color in the Duration dropdown, Exp : "+Highlight_color_Exp+" Act : "+Highlight_Color_Act);
			}
			
			if(verifyElementDisplayed(driver, dropdownInputsearchBox)) {
				click(driver,dropdownInputsearchBox);
				sendKeys(driver,dropdownInputsearchBox,"afghjku");
				if(isDisplayed2(driver,NoResultsFound)) {
					pass(driver,"'No Results found' message is displayed in while searching invalid value in the Duration dropdown input");
				}else {
					fail(driver,"'No Results found' message is not displayed in while searching invalid value in the Duration dropdown input");
				}
				
				clear1(driver,dropdownInputsearchBox);
				wait(driver,"1");
				if(isDisplayed2(driver,NoResultsFound)){
					fail(driver,"Column List are not displayed after clear the search input in the Duration dropdown");
				}else {
					pass(driver,"Column List are displayed after clear the search input in the Duration dropdown");
				}
				
				sendKeys(driver,dropdownInputsearchBox,Duration_Value);
				wait(driver,"1");
				String firstValue_Y=getText1(driver,FirstSearchedvalue);
				if(firstValue_Y.contains(Duration_Value)) {
					pass(driver,"Searched Value correctly displayed in the Duration dropdown");
				}else {
					fail(driver,"Searched Value not correctly displayed in the Duration dropdown");
				}
			}
			selectDropdownValue1(driver,Duration_Value);
			
			if(isDisplayed2(driver,Duration_DropdownExpand)) {
				fail(driver,"Duration dropdown not closed after selecting the value");
			}else {
				pass(driver,"Duration dropdown closed automatically after selecting the value");
			}
			
			
			if(AvailableStartColumnList.size()>2) {
				scrollUsingElement(driver, ApplyButton);
				click(driver,ApplyButton);
				if(isDisplayed(driver,error)) {
					 String errorWidget=getText1(driver,error);
		    		 if(errorWidget.contains("Kindly select end date")) {
		    			 pass(driver,"'Kindly select end date' error is displayed When End Date Value is not Selected");
		    		 }else {
		    			 fail(driver,"'Kindly select end date' error is not displayed When End Date Value is not Selected");
		    		 }
		    		 elementnotvisible1(driver, error);
				}else {
	    			 fail(driver,"'Kindly select end date' error is not displayed When End Date Value is not Selected");
				}
			}
			
			
			scrollUsingElement(driver, ApplyButton);
			click(driver,ApplyButton);
			elementnotvisible1(driver, RPE_Loading);
			setTestCaseID("TC_GANTT_AXES_009");
			if(isDisplayed(driver,error)) {
				fail(driver,"Error Displayed when click Apply button after providing all the Inputs");
			}
			
			verifyElementDisplayed(driver,Chart_Section);
			
			// *********** AxisTitle Validation Start *************
			setTestCaseID("");
     		String Gantt_Axis_Title= getCellValue("TestExecution","Testcase_Selection","Gantt_Axis_Title",Flag);
     	 	if(Gantt_Axis_Title.equals("Yes")) {
     	 		setTestCaseID("TC_GANTT_AXIS_001");
     	 		verifyElementDisplayed(driver, AxisTitle);
     	 		click(driver,AxisTitle);
     	 		wait(driver,"1");
     	 		String AxisExpand=getAttribute1(driver,AxisTitleExpand,"class");
     	 		if(AxisExpand.contains("up")) {
     	  			pass(driver,"Axis Title section is Expanded after click on it");
     	 		}else {
     	  			fail(driver,"Axis Title section is not Expanded after click on it");
     	 		}
      	 		
     	 		setTestCaseID("TC_GANTT_AXIS_002");
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
     	         
     	  		setTestCaseID("TC_GANTT_AXIS_003");
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
     	     
     	      	setTestCaseID("TC_GANTT_AXIS_004");
     	     	click(driver,fontFamily_dropdown);
     	     	
     	     	if(isDisplayed(driver,fontFamily_DropdownExpand)) {
     	        	pass(driver,"Font family dropdown is expanded after click on it");
     	    		setTestCaseID("TC_GANTT_AXIS_006");
     	    		ScrollBarValidation1(driver,fontFamily_DropdownExpand,"Font Family");
	    		    //setTestCaseID("");
     	         	List<WebElement> beforeSearchResults=getWebElements(driver,fontFamilyResults);
     	         	int beforeSearchSize=beforeSearchResults.size();
     	         	setTestCaseID("TC_GANTT_AXIS_005");
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
     	            
     	            setTestCaseID("TC_GANTT_AXIS_007");
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
     	    		
     	        }else {
     	     	    fail(driver,"Font family dropdown is not expanded after click on it");
     	        }
     	     	
     	     	setTestCaseID("TC_GANTT_AXIS_008");
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
     	        setTestCaseID("TC_GANTT_AXIS_009");
     	       	click(driver,titleFontSizeDropdown);
     	        setTestCaseID("TC_GANTT_AXIS_011");
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
     	  		
     	  		setTestCaseID("TC_GANTT_AXIS_012");
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
     	        setTestCaseID("TC_GANTT_AXIS_013");
     	       	click(driver,X_axisFontSizeDropdown);
     	        setTestCaseID("TC_GANTT_AXIS_015");
     	  		selectOptionValue(driver,X_axisFontSizeDropdown,Change_X_label_FontSize);
     	  		scrollUsingElement(driver, ApplyButton);
     	  		click(driver,ApplyButton);
     	  		elementnotvisible1(driver, RPE_Loading);
     	  		verifyElementDisplayed(driver,Chart_Section);
     	  		//waitForElement(driver, ChartBarDisplayCount);
     	     	String fontSize_X_label_Act=getFontSize(driver,Gantt_X_Axis_Label);
     	     	if(Change_X_label_FontSize.equals(fontSize_X_label_Act)) {
     	     		pass(driver,"Selected fontSize ("+Change_X_label_FontSize+") Updated in X Axis label chart value");
     	  		}else {
     	  			fail(driver,"Selected fontSize  ("+Change_X_label_FontSize+") not Updated in X Axis label chart value");
     	  		}
     	       	
     	     	setTestCaseID("TC_GANTT_AXIS_016");
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
     	       	setTestCaseID("TC_GANTT_AXIS_017");
     	        click(driver,Y_axisFontSizeDropdown);
     	        setTestCaseID("TC_GANTT_AXIS_019");
     	  		selectOptionValue(driver,Y_axisFontSizeDropdown,Change_Y_label_FontSize);
     	  		scrollUsingElement(driver, ApplyButton);
     	  		click(driver,ApplyButton);
     	  		elementnotvisible1(driver, RPE_Loading);
     	  		verifyElementDisplayed(driver,Chart_Section);
     	  		List<WebElement> moveElements=driver.findElements(By.xpath("//div[@id='RPE_Preview']//*[name()='tspan']"));
     	  		String fontSize_Y_label_Act=getFontSize(driver,Gantt_Y_Axis_Label);
     	      	if(Change_Y_label_FontSize.equals(fontSize_Y_label_Act)) {
     	  		    pass(driver,"Selected fontSize ("+Change_Y_label_FontSize+") Updated in Y Axis label chart value");
     	  		}else {
     	    	    fail(driver,"Selected fontSize ("+Change_Y_label_FontSize+") not Updated in Y Axis label chart value, Act : "+fontSize_Y_label_Act);
     	  		}
     	      	
      	        setTestCaseID("TC_GANTT_AXIS_020");
     	       	verifyElementDisplayed(driver, X_RotationText);
     	       	verifyElementDisplayed(driver,X_RotationOutputValue);
     	      	
     	   		String X_RotationValueAct=getText1(driver,X_RotationOutputValue);
     	   		System.out.println("X rotation : "+X_RotationValueAct);
     	   		if(X_RotationValueAct.equals(defaultRotation)) {
     	  			pass(driver,"By default, '"+defaultRotation+"' displayed in the X axis Rotation output field");
     	   		}else {
     	       	    fail(driver,"By default, '"+defaultRotation+"' is not displayed in the X axis Rotation output field");
     	   		}
     	   		
	     	   	setTestCaseID("TC_GANTT_AXIS_021");
	 	       	if(isToggleAccessible(driver, X_RotationInputSlider)) {
	 	       		pass(driver,"X Rotation input is Accessible");
	 	       	}else {
	 	       		fail(driver,"X Rotation input is not Accessible");
	 	       	}
	 	        setTestCaseID("");
     	  		String X_Rotation_Color_Act=getTextBackgroundColor(driver,X_RotationOutputValue);
     	  		if(RotationInputColor_Exp.equalsIgnoreCase(X_Rotation_Color_Act)) {
     	  			pass(driver,"X rotation output highlighted in blue color");
     	  		}else {
     	  			fail(driver,"X rotation output not highlighted in blue color");
     	  		}
     	  		setTestCaseID("TC_GANTT_AXIS_022");
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
     			setTestCaseID("TC_GANTT_AXIS_024");
     	     	String X_label_Rotation_Act=getRotationValue(driver,Gantt_X_Axis_Label);
     	     	if(X_Rotation_Input.equals(X_label_Rotation_Act)) {
     	 	    	 pass(driver,"Selected X Rotation Angle ("+X_Rotation_Input+") Updated in X Axis label chart value");
     	  		}else {
     	  			fail(driver,"Selected X Rotation Angle ("+X_Rotation_Input+") is not Updated in X Axis label chart value");
     	  		}
           	
     	     	setTestCaseID("TC_GANTT_AXIS_023");
     	  		String Y_label_Rotation_Act1=getRotationValue(driver,Gantt_Y_Axis_Label);
     	     	if(X_Rotation_Input.equals(Y_label_Rotation_Act1)) {
     	  		    fail(driver,"Selected X Rotation Angle ("+X_Rotation_Input+") Updated in Y Axis label chart value");
     	  		}else {
     	  			pass(driver,"Selected X Rotation Angle ("+X_Rotation_Input+") is not Updated in Y Axis label chart value");
     	  		}
     	     	
     	     	setTestCaseID("TC_GANTT_AXIS_025");
     	       	verifyElementDisplayed(driver, Y_RotationText);
     	       	verifyElementDisplayed(driver,Y_RotationOutputValue);
 	       		String Y_RotationValueAct=getText1(driver,Y_RotationOutputValue);
 	       		System.out.println("Y rotation : "+Y_RotationValueAct);
 	       		if(Y_RotationValueAct.equals(defaultRotation)) {
 	      			pass(driver,"By default, '"+defaultRotation+"' displayed in the Y axis Rotation output field");
 	       		}else {
 	           	    fail(driver,"By default, '"+defaultRotation+"' displayed in the Y axis Rotation output field");
 	       		}
 	         	setTestCaseID("");
 	      		String Y_Rotation_Color_Act=getTextBackgroundColor(driver,Y_RotationOutputValue);
 	      		if(RotationInputColor_Exp.equalsIgnoreCase(Y_Rotation_Color_Act)) {
 	      			pass(driver,"Y rotation output highlighted in blue color");
 	      		}else {
 	      			fail(driver,"Y rotation output not highlighted in blue color");
 	      		}
 	      		setTestCaseID("");
 	      		if(isToggleAccessible(driver, Y_RotationInputSlider)) {
	 	       		pass(driver,"Y Rotation input is Accessible");
	 	       	}else {
	 	       		fail(driver,"Y Rotation input is not Accessible");
	 	       	}
 	      		
 	      		
 	      		setTestCaseID("TC_GANTT_AXIS_026");
     	        waitForElement(driver, Y_RotationInputSlider);
     	       	moveSlider(driver,Y_RotationInputSlider,Y_RotationOutputValue,Y_Rotation_Input);
     	       	scrollUsingElement(driver, ApplyButton);
     	  		click(driver,ApplyButton);
     	  		elementnotvisible1(driver, RPE_Loading);
     	  		verifyElementDisplayed(driver,Chart_Section);
     	
     	  		
     	     	String Y_label_Rotation_Act=getRotationValue(driver,Gantt_Y_Axis_Label);
     	     	if(Y_Rotation_Input.equals(Y_label_Rotation_Act)) {
     	  		    pass(driver,"Selected Rotation Angle ("+Y_Rotation_Input+") Updated in Y Axis label chart value");
     	  		}else {
     	  			fail(driver,"Selected Rotation Angle ("+Y_Rotation_Input+") is not Updated in Y Axis label chart value");
     	  		}
     	     	
     	     	setTestCaseID("TC_GANTT_AXIS_027");
     	     	String X_label_Rotation_Act1=getRotationValue(driver,Gantt_X_Axis_Label);
     	     	if(Y_Rotation_Input.equals(X_label_Rotation_Act1)) {
     	 	    	 fail(driver,"Selected Y Rotation Angle ("+Y_Rotation_Input+") Updated in X Axis label chart value");
     	  		}else {
     	  			pass(driver,"Selected Y Rotation Angle ("+Y_Rotation_Input+") is not Updated in X Axis label chart value");
     	  		}
     	     	
     	     }
     	 	 setTestCaseID("");
     		// ******************** AxisTitle Validation End *******************
		 	
     	  // ******************** ChartTitle Validation Start *******************
 	 	   String Gantt_Chart_Title= getCellValue("TestExecution","Testcase_Selection","Gantt_Chart_Title",Flag);
           if(Gantt_Chart_Title.equals("Yes")) {
          	   CHART_TITLE chartTitle=new CHART_TITLE();
               chartTitle.chartTitleTest(driver, TypeBackgroundColor1_ChartTitle, TypeTextColor1_ChartTitle, Change_FontFamily_ChartTitle, ChangeFontSize_ChartTitle,ChangeChartTitleName);       	
           }
          // ******************** ChartTitle Validation End *******************
           setTestCaseID("");
 	 	
           //********** ChartStyle Validation Start *************************
            verifyElementDisplayed(driver,Chart_FormatSec);
   		    click(driver,Chart_FormatSec);
   		
        	String Gantt_ChartFormat_Chart_Style= getCellValue("TestExecution","Testcase_Selection","Gantt_ChartFormat_Chart_Style",Flag);
            if(Gantt_ChartFormat_Chart_Style.equals("Yes")) {
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
	   	  		 setTestCaseID("TC_GANTT_CHART_STYLE_001");
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
     			 
     			 setTestCaseID("TC_GANTT_CHART_STYLE_002");
     			 verifyElementDisplayed(driver,ChartThemeText);
     			 verifyElementDisplayed(driver,ChartThemeInput);
     			   	
     			 verifyElementDisplayed(driver,X_ScrollText);
     			 verifyElementDisplayed(driver,X_ScrollInputSlider);
     			
     			 verifyElementDisplayed(driver,Y_ScrollText);
     			 verifyElementDisplayed(driver,Y_ScrollInputSlider);
     			
     			 verifyElementDisplayed(driver,EnableGridText);
     			 verifyElementDisplayed(driver,EnableGrid_InputSlider);

     			 setTestCaseID("TC_GANTT_CHART_STYLE_003");
     			 String defaultThemeValue_Act=getText1(driver,ChartThemeInput);
     			 if(defaultThemeValue_Act.equals(DefaultThemeValue_Exp)) {
     				 pass(driver,"By default, Chart theme selected the value as '"+DefaultThemeValue_Exp+"'");
     			 }else {
     				 fail(driver,"By default, '"+DefaultThemeValue_Exp+"' value not selected in the  Chart theme input");
     			 }
     			 setTestCaseID("TC_GANTT_CHART_STYLE_004");
     			 click(driver,ChartThemeInput);
     			 if(verifyElementDisplayed(driver,ChartThemeResults)) {
     				 pass(driver,"Chart theme dropdown opened and displayed list of chart themes");
     				 setTestCaseID("");
     				 mouseOverToElement(driver,ThirdValue);
     				 wait(driver,"1");
     				 String mouseHighlightColor=getTextBackgroundColor(driver,ThirdValue);
     				 if(Highlight_ColorStyle_Exp.equalsIgnoreCase(mouseHighlightColor)) {
     					 pass(driver,"Mouse hovered value highlighted in blue color");
     				 }else {
     					 fail(driver,"Mouse hovered value not highlighted in blue color");
     				 }
     			
     				 setTestCaseID("");
     				 ScrollBarValidation1(driver,ChartThemeResults,"Chart Theme");
     			
     				 List<WebElement> beforeSearchResults=getWebElements(driver,chartThemeResultList);
     				 int beforeSearchSize=beforeSearchResults.size();
     				 setTestCaseID("TC_GANTT_CHART_STYLE_005");
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
     			 
     			 setTestCaseID("TC_GANTT_CHART_STYLE_006");
 				 if(isToggleEnable(driver,X_Scroll_toggle)) {
 					 fail(driver,"By default, X scroll is not disabled");
 				 }else {
 					 pass(driver,"By default, X scroll is disabled");
 				 }
 			  		   
 				 if(isToggleEnable(driver,Y_Scroll_toggle)) {
 					 fail(driver,"By default, Y scroll is not disabled");
 				 }else {
 					 pass(driver,"By default, Y scroll is disabled");
 				 }
     			  	
     			 setTestCaseID("");
     			 if(isToggleAccessible(driver,X_Scroll_toggle)){
     				 pass(driver,"X Scroll toggle is accessible");
     			 }else {
     				 fail(driver,"X Scroll toggle is not accessible");
     			 }
     			 if(isToggleAccessible(driver,Y_Scroll_toggle)){
     				 pass(driver,"Y Scroll toggle is accessible");
     			 }else {
     				 fail(driver,"Y Scroll toggle is not accessible");
     			 }
     			 
     			 setTestCaseID("TC_GANTT_CHART_STYLE_007");
 				 click(driver,X_ScrollInputSlider);
 				 if(isToggleEnable(driver, X_Scroll_toggle)) {
 					pass(driver,"X Scroll toggle enabled when enabling it");
 				 }else {
 					fail(driver,"X Scroll toggle not enabled when enabling it");
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
 				 if(isDisplayed(driver,X_Scroll_Bar1)) {
    				 pass(driver,"X Scroll Bar is displayed in the chart after enabling it");
    			 }else {
    				 fail(driver,"X Scroll Bar is not displayed in the chart after enabling it");
    			 }
 				 if(isDisplayed(driver,Y_Scroll_Bar1)) {
 					 pass(driver,"Y Scroll Bar is displayed in the chart after enabling it");
 				 }else {
 					 fail(driver,"Y Scroll Bar is not displayed in the chart after enabling it");
 				 }
     			 
 				 setTestCaseID("TC_GANTT_CHART_STYLE_008");
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
     				
     	  			 setTestCaseID("TC_GANTT_CHART_STYLE_009");
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
     			 }else {
     				 fail(driver,"By default, 'Enable Grid' toggle is not enabled");
     			 }
     		
     			 setTestCaseID("TC_GANTT_CHART_STYLE_010");
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
            String Gantt_ChartFormat_Data_Label= getCellValue("TestExecution","Testcase_Selection","Gantt_ChartFormat_Data_Label",Flag);
            if(Gantt_ChartFormat_Data_Label.equals("Yes")) {
           	     setTestCaseID("");
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
        		 setTestCaseID("TC_GANTT_DATA_LABELS_001");
        		 verifyElementDisplayed(driver,EnableValue_text);
        		 verifyElementIsPresent1(driver, EnableValue_InputSlider);

        		 verifyElementDisplayed(driver,ValueFontSize_text);
        		 verifyElementIsPresent1(driver,ValueFontSizeInput);
             
        		 verifyElementDisplayed(driver,ValueRotation_text);
        		 verifyElementIsPresent1(driver,ValueRotation_Input);
        		 
        		 verifyElementDisplayed(driver,FontFamily_Text);
        		 verifyElementDisplayed(driver,FontFamily_Input_DataLabel);
        		 
        		 //Validation of the visibility of data label options End...
        	     
        	     //All options are inaccessible when the enable value toggle is disabled. Validation end
        		 setTestCaseID("TC_GANTT_DATA_LABELS_002");
        	     if(isToggleEnable(driver,EnableValue_Input)) {
        	  		 fail(driver,"By Default, Enable Value toggle is enabled");
        	     }else {
        	  		 pass(driver,"By Default, Enable Value toggle is disabled");
        	  		 
        	  		 setTestCaseID("TC_GANTT_DATA_LABELS_003");
        		     if(IsElementEnabled(driver,ValueFontSizeInput)) {
        		  		 fail(driver,"'ValueFontSize Input' is accessible when the 'Enable value' toggle is disabled.");
        		     }else {
        		  		 pass(driver,"'ValueFontSize Input' is inaccessible when the 'Enable value' toggle is disabled.");
        		     }
        		     
        		     if(IsElementEnabled(driver,ValueRotation_Input)) {
        		  		 fail(driver,"'ValueRotation_Input' is accessible when the 'Enable value' toggle is disabled.");
        		     }else {
        		  		 pass(driver,"'ValueRotation_Input' is inaccessible when the 'Enable value' toggle is disabled.");
        		     }
        		     
        		     if(isToggleEnable(driver,FontFamily_Input_DataLabel)) {
        		  		 fail(driver,"'Font Family Input' is accessible when the 'Enable value' toggle is disabled.");
        		     }else {
        		  		 pass(driver,"'Font Family Input' is inaccessible when the 'Enable value' toggle is disabled.");
        		     }
        	  		 
        	     }
        	     //All options are inaccessible when the enable value toggle is disabled. Validation end
        	     
        	     setTestCaseID("TC_GANTT_DATA_LABELS_004");
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
        		 
        		 setTestCaseID("TC_GANTT_DATA_LABELS_005");
        		 String defaultFontSize_Act=defaultSelectedValue(driver, ValueFontSizeInput);
        		 if(DefaultFontSizeValue_Exp.equals(defaultFontSize_Act)) {
        			pass(driver,"By default, '"+DefaultFontSizeValue_Exp+"' is selected in the Value Font Size Input"); 
        		 }else {
        			fail(driver,"By default, '"+DefaultFontSizeValue_Exp+"' is not selected in the Value Font Size Input"); 
        		 }
         		 
        		 setTestCaseID("TC_GANTT_DATA_LABELS_006");
        		 if(isToggleAccessible(driver,ValueFontSizeInput)) {		
        	  		 pass(driver,"'Value FontSize Input' is accessible after enabling the 'Enable Value' toggle"); 
        		 }else {
        			fail(driver,"'Value FontSize Input' is not accessible after enabling the 'Enable Value' toggle");
        		 }
        		
        		 setTestCaseID("TC_GANTT_DATA_LABELS_007");
        		 click(driver,ValueFontSizeInput);
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
        		
        		 setTestCaseID("TC_GANTT_DATA_LABELS_008");
        		 String fontFamily_Value=getText1(driver,FontFamily_Input_DataLabel);
        		 if(fontFamily_Value.equals(default_FontFamily)) {
        			 pass(driver,"By default, "+default_FontFamily+" displayed in the Font Family input");
        		 }else {
        			 fail(driver,"By default, "+default_FontFamily+" is not displayed in the Font Family input");
        		 }
        		 
     	      	 setTestCaseID("");
     	     	 click(driver,FontFamily_Input_DataLabel);
     	     	 if(isDisplayed(driver,FontFamily_Results)) {
     	        	pass(driver,"Font family dropdown is expanded after click on it");
     	    		ScrollBarValidation1(driver,FontFamily_Results,"Font_Family_DataLabel");
	    		    //setTestCaseID("");
     	         	List<WebElement> beforeSearchResults=getWebElements(driver,FontFamiy_Results_List);
     	         	int beforeSearchSize=beforeSearchResults.size();
     	         	setTestCaseID("TC_GANTT_DATA_LABELS_009");
     	         	click(driver,dropdownInputsearchBox);
     	         	sendKeys(driver,dropdownInputsearchBox,"dfsaght");
     	         	if(isDisplayed2(driver,NoResultsFound)) {
     	         		pass(driver,"'No Results found' is displayed when search invalid font family value");
     	         	}else {
     	         		fail(driver,"'No Results found' is not displayed when search invalid font family value");
     	         	}
     	         	
     	         	clear1(driver,dropdownInputsearchBox);
     	         	wait(driver,"1");
     	         	sendKeys(driver,dropdownInputsearchBox,ChangeFontFamily_DataLabel);
     	         	List<WebElement> afterSearchResults=getWebElements(driver,FontFamiy_Results_List);
     	         	int afterSearchSize=afterSearchResults.size();
     	            String resultText=getText1(driver,fontFamilyFirstResult);
     	            if((beforeSearchSize>afterSearchSize)&&resultText.equals(ChangeFontFamily_DataLabel)) {
     	   			 pass(driver,"Search input in the Font Family dropdown works properly");
     	            }else {
     	         	    fail(driver,"Search input in the Font Family dropdown not works properly");
     	            }
     	            
     	            setTestCaseID("TC_GANTT_DATA_LABELS_010");
     	           	selectFontFamily(driver,ChangeFontFamily_DataLabel);
     	           	wait(driver,"1");
     	           	scrollUsingElement(driver, ApplyButton);
     	    		click(driver,ApplyButton);
     	    		elementnotvisible1(driver, RPE_Loading);//
     	    		waitForElement(driver, Chart_Section);
     	    	   
     	    		String enabledValue=getFontFamily(driver,EnableValue);
     	    		if(enabledValue.equals(ChangeFontFamily_DataLabel)) {
     	   			     pass(driver,"Selected fontFamily ("+ChangeFontFamily_DataLabel+") Updated in Enable Value in the chart");
     	    		}else {
     	         	    fail(driver,"Selected FontFamily ("+ChangeFontFamily_DataLabel+") is not Updated in Enable Value in the chart");
     	    		}
     	        }else {
     	     	    fail(driver,"Font family dropdown is not expanded after click on it");
     	        }
        		
     	     	setTestCaseID("TC_GANTT_DATA_LABELS_011");
        		if(isToggleAccessible(driver,ValueRotation_Input)) {
        			 pass(driver,"Value rotation is accessible after enabling the 'Enable Value' toggle");
        		}else {
        			 fail(driver,"Value rotation is Inaccessible after enabling the 'Enable Value' toggle");
        		}
        		
        		String defaultRotationValue_Act=getText1(driver,ValueRotation_Output);
        		if(DefaultRotationValue_Exp.equals(defaultRotationValue_Act)) {
        			 pass(driver,"By default, '"+DefaultRotationValue_Exp+"' is displayed in value rotation output");
        		}else {
        			 fail(driver,"By default, '"+DefaultRotationValue_Exp+"' is not displayed in value rotation output");
        		}
        		
        		setTestCaseID("TC_GANTT_DATA_LABELS_012");
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
   		
            
            // ******************* Others Validation Start *********************
   		 	String Gantt_ChartFormat_Others= getCellValue("TestExecution","Testcase_Selection","Gantt_ChartFormat_Others",Flag);
            if(Gantt_ChartFormat_Others.equals("Yes")) {
        	   	setTestCaseID("");
           	 	verifyElementDisplayed(driver,ChartFormat_Others);
       		 	scrollUsingElement(driver,ChartFormat_Others);
       		 	String OthersExpand=getAttribute1(driver, ChartFormat_OthersExpand, "class");
       		 	if(OthersExpand.contains("up")) {
       			 pass(driver,"By default, 'Others' gets Expanded");
       		 	}else {
       		 		fail(driver,"By default, 'Others' not gets Expand");
       		 	}
       		 
       		 	setTestCaseID("TC_GANTT_OTHERS_001");
       		 	verifyElementDisplayed(driver,Cursor_text);
       		 	verifyElementIsPresent1(driver, Cursor_Input);
       		
       		 	verifyElementDisplayed(driver,Export_text);
       		 	verifyElementIsPresent1(driver, Export_Input);
       		 
        		 //cursor validation start....
       		 	setTestCaseID("TC_GANTT_OTHERS_002");
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
        		 if(isDisplayed2(driver,MouseCursor)) {
      	  		 	pass(driver,"Cursor is displayed in chart when cursor is enable"); 
        		 }else {
      	  		 	fail(driver,"Cursor is not displayed in chart when cursor is enable");  
        		 }
      		
        		 //
        		 setTestCaseID("TC_GANTT_OTHERS_003");
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
        	
        		 setTestCaseID("TC_GANTT_OTHERS_004");
        		 if(isToggleEnable(driver,Export_Input)) {		
        			 fail(driver,"'Export Input' enable by default");
        		 }else {
        			 pass(driver,"'Export Input' disable by default"); 
        		 }
         		
        		 scrollUsingElement(driver, ApplyButton);
        		 click(driver,ApplyButton);
        		 elementnotvisible1(driver, RPE_Loading);
        		 verifyElementDisplayed(driver,Chart_Section);
   		
        		 if(isDisplayed2(driver,ExportChartOptions)) {
        			 fail(driver,"'Export Options' is displayed in charts when Export chart is disabled"); 
        		 }else {
        			 pass(driver,"'Export Options' not displayed in charts when Export chart is disabled"); 
        		 }
        		 setTestCaseID("TC_GANTT_OTHERS_005");
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
     	 	 
		}else {
			String errorWidget=getText1(driver,error);
   		 	if(errorWidget.contains("Please refer the logs in Logs")) {
   		 		fail(driver,"Error displayed When click on 'Gantt' Widget Unable to perform Chart Validation, Error : "+errorWidget);
   		 	}else {
   		 		pass(driver,"Error displayed When click on 'Gantt' Widget Unable to perform Chart Validation, Error : "+errorWidget);
   		 	}
			 elementnotvisible1(driver, error);
		}
			
	}
}
