package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import commonMethods.Keywords;
import commonMethods.Utils;

public class DASHPRO_RADAR_LINE_TESTING extends Keywords{

	public void radarLineTesting(WebDriver driver,int iteration, String Flag) {
		
		String TestcaseFileName="DASHPRO_RADAR_LINE";
		String SheetName_Axes="RADARLINE_AXES";
		String SheetName_AxisTitle="RADARLINE_AXISTITLE";
		String SheetName_ChartStyle="RADARLINE_CHART_STYLE";
		String SheetName_Legend="RADARLINE_LEGEND";
		String SheetName_Others="RADARLINE_OTHERS";
		String TestcaseID_Flag="Flag";
		String TescasesID_Column="TEST CASE ID";
		//Yes/No Input for Testcases Id
		String TC_RADAR_LINE_001=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ RADAR LINE_001",TestcaseID_Flag);
		String TC_RADAR_LINE_002=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ RADAR LINE_002",TestcaseID_Flag);
		String TC_RADAR_LINE_003=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ RADAR LINE_003",TestcaseID_Flag);
		String TC_RADAR_LINE_004=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ RADAR LINE_004",TestcaseID_Flag);
		String TC_RADAR_LINE_005=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ RADAR LINE_005",TestcaseID_Flag);
		String TC_RADAR_LINE_006=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ RADAR LINE_006",TestcaseID_Flag);
		String TC_RADAR_LINE_007=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ RADAR LINE_007",TestcaseID_Flag);
		String TC_RADAR_LINE_008=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ RADAR LINE_008",TestcaseID_Flag);
		String TC_RADAR_LINE_009=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ RADAR LINE_009",TestcaseID_Flag);
		String TC_RADAR_LINE_010=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ RADAR LINE_010",TestcaseID_Flag);
		String TC_RADAR_LINE_011=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ RADAR LINE_011",TestcaseID_Flag);
		String TC_RADAR_LINE_012=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ RADAR LINE_012",TestcaseID_Flag);
		String TC_RADAR_LINE_013=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ RADAR LINE_013",TestcaseID_Flag);
		String TC_RADAR_LINE_014=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ RADAR LINE_014",TestcaseID_Flag);
		String TC_RADAR_LINE_015=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ RADAR LINE_015",TestcaseID_Flag);
		String TC_RADAR_LINE_016=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ RADAR LINE_016",TestcaseID_Flag);
		String TC_RADAR_LINE_017=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ RADAR LINE_017",TestcaseID_Flag);
		String TC_RADAR_LINE_018=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ RADAR LINE_018",TestcaseID_Flag);
		String TC_RADAR_LINE_019=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ RADAR LINE_019",TestcaseID_Flag);
		String TC_RADAR_LINE_020=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ RADAR LINE_020",TestcaseID_Flag);
		String TC_RADAR_LINE_021=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ RADAR LINE_021",TestcaseID_Flag);
		String TC_RADAR_LINE_022=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ RADAR LINE_022",TestcaseID_Flag);
		String TC_RADAR_LINE_023=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ RADAR LINE_023",TestcaseID_Flag);
		String TC_RADAR_LINE_024=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ RADAR LINE_024",TestcaseID_Flag);
		String TC_RADAR_LINE_025=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ RADAR LINE_025",TestcaseID_Flag);
		String TC_RADAR_LINE_026=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ RADAR LINE_026",TestcaseID_Flag);
		String TC_RADAR_LINE_027=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ RADAR LINE_027",TestcaseID_Flag);
		String TC_RADAR_LINE_028=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ RADAR LINE_028",TestcaseID_Flag);
		String TC_RADAR_LINE_029=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ RADAR LINE_029",TestcaseID_Flag);
		String TC_RADAR_LINE_030=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ RADAR LINE_030",TestcaseID_Flag);
		String TC_RADAR_LINE_031=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ RADAR LINE_031",TestcaseID_Flag);
		String TC_RADAR_LINE_032=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ RADAR LINE_032",TestcaseID_Flag);
		String TC_RADAR_LINE_033=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ RADAR LINE_033",TestcaseID_Flag);
		String TC_RADAR_LINE_034=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ RADAR LINE_034",TestcaseID_Flag);
		String TC_RADAR_LINE_035=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ RADAR LINE_035",TestcaseID_Flag);
		String TC_RADAR_LINE_036=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ RADAR LINE_036",TestcaseID_Flag);
		String TC_RADAR_LINE_037=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ RADAR LINE_037",TestcaseID_Flag);
		String TC_RADAR_LINE_038=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ RADAR LINE_038",TestcaseID_Flag);
		String TC_RADAR_LINE_039=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ RADAR LINE_039",TestcaseID_Flag);
		String TC_RADAR_LINE_040=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ RADAR LINE_040",TestcaseID_Flag);
		String TC_RADAR_LINE_041=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ RADAR LINE_041",TestcaseID_Flag);
		String TC_RADAR_LINE_042=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ RADAR LINE_042",TestcaseID_Flag);
		String TC_RADAR_LINE_043=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ RADAR LINE_043",TestcaseID_Flag);

		//DefaultValue 
		String Highlight_color_Exp=Utils.getDataFromTestData("Axes", "HighlightColor");
		String default_FontFamily=Utils.getDataFromTestData("AxisTitle", "default_FontFamily");
		String default_FontSize_Exp=Utils.getDataFromTestData("AxisTitle", "default_FontSize");
		String DefaultThemeValue_Exp=Utils.getDataFromTestData("ChartFormat_ChartStyle", "defaultThemeValue_Exp");
		String Default_Legend_Position=Utils.getDataFromTestData("SmokeTesting_UI", "Default_Legend_Position");
		String Default_Legend_FontSize=Utils.getDataFromTestData("SmokeTesting_UI", "Default_Legend_FontSize");
		
		//Iteration inputs
		String Select_Category_Value=Utils.getDataFromTestDataIteration(iteration,"RadarLine_Widget_Testing", "Select_Category_Value");
		String Select_Group_Value=Utils.getDataFromTestDataIteration(iteration,"RadarLine_Widget_Testing", "Select_Group_Value");
		String Category_DataType=Utils.getDataFromTestDataIteration(iteration,"RadarLine_Widget_Testing", "Category_DataType");
		String Select_Y_Axis_Value=Utils.getDataFromTestDataIteration(iteration,"RadarLine_Widget_Testing", "Select_Y_Axis_Value");
		String Select_Y_Axis_AggregationValue=Utils.getDataFromTestDataIteration(iteration,"RadarLine_Widget_Testing", "Select_Y_Axis_AggregationValue");
		String Select_SortBy_Value=Utils.getDataFromTestDataIteration(iteration,"RadarLine_Widget_Testing", "Select_SortBy_Value");
		
		//Axis Title
		String Change_X_Title_Name=Utils.getDataFromTestDataIteration(iteration,"RadarLine_Widget_Testing", "Change_X_Title_Name");
		String Change_Y_Title_Name=Utils.getDataFromTestDataIteration(iteration,"RadarLine_Widget_Testing", "Change_Y_Title_Name");
		String ChangeFontFamily_AxisTitle=Utils.getDataFromTestDataIteration(iteration,"RadarLine_Widget_Testing", "ChangeFontFamily_AxisTitle");
		String ChangeTitleFontSize_AxisTitle=Utils.getDataFromTestDataIteration(iteration,"RadarLine_Widget_Testing", "ChangeTitleFontSize_AxisTitle");
		String Change_X_label_FontSize=Utils.getDataFromTestDataIteration(iteration,"RadarLine_Widget_Testing", "Change_X_label_FontSize");
		String Change_Y_label_FontSize=Utils.getDataFromTestDataIteration(iteration,"RadarLine_Widget_Testing", "Change_Y_label_FontSize");
		//Chart Style
		String Change_ChartTheme_ChartStyle=Utils.getDataFromTestDataIteration(iteration,"RadarLine_Widget_Testing", "Change_ChartTheme_ChartStyle");
		//Legend
		String Change_Legend_FontSize=Utils.getDataFromTestDataIteration(iteration,"RadarLine_Widget_Testing", "Change_Legend_FontSize");

		setTestCaseID(" ");
		Actions action=new Actions(driver);
		mouseOverToElement(driver, ADDTabPlus);
  	    mouseOverAndClick(driver, ADDTabPlus);
  	    wait(driver,"1");
  	    sendKeys(driver,newlyAddedTab,"RadarLineTestTab");
  	    click(driver,DashProPage);
  	    elementnotvisible1(driver, RPE_Loading);
		waitForElement(driver,ADD_widget_rightTop);
	    click(driver,ADD_widget_rightTop);
	    elementnotvisible(driver,Loading);
	    elementnotvisible1(driver, RPE_Loading);
		waitForElement(driver,WidgetPanel);
		waitForElement(driver,Sparkline_widget);
		
		if(TC_RADAR_LINE_001.equals("Yes")) {
			setTestCaseID("TC_RADAR_LINE_001");
			waitForElement(driver,Radar_Line_widget);
			verifyElementDisplayed(driver, Radar_Line_widget);
		}
		
		if(TC_RADAR_LINE_002.equals("Yes")) {
			setTestCaseID("TC_RADAR_LINE_002");
			WidgetValidation(driver,Radar_Line_widget,"Radar Line");
		}
		
		if(TC_RADAR_LINE_003.equals("Yes")) {
			setTestCaseID("TC_RADAR_LINE_003");
			click(driver,Radar_Line_widget);
			if(isDisplayed2(driver,error)){
				 String errorWidget=getText1(driver,error);
				 if(errorWidget.contains("Please refer the logs in Logs")) {
					 fail(driver,"Error displayed When click RadarLine Widget, Validation : "+errorWidget);
				 }else {
					 pass(driver,"Error displayed When click RadarLine Widget, Validation : "+errorWidget);
				 }
				 elementnotvisible1(driver, error);
			 }else {
				 elementnotvisible(driver, Loading);
				 String widgetValue=getText1(driver,WidgetValue);
				 if(widgetValue.equals("Radar Line")) {
					 pass(driver,"'Radar Line' displayed as the selected Widget after click on it");
				 }else {
					 fail(driver,"'Radar Line' not displayed as the selected Widget after click on it");
				 }
				 
				 String AxesExpand=getAttribute1(driver,Axes_Expand,"class");
				 if(!AxesExpand.contains("up")) {
					 fail(driver,"By default, Axes Section is not Expanded");
				 }else {
					 pass(driver,"By default, Axes Section is Expanded");
					 
					 if(TC_RADAR_LINE_004.equals("Yes")) {
						 setTestCaseID("TC_RADAR_LINE_004");
						 scrollUsingElement(driver, ApplyButton);
						 click(driver,ApplyButton);
						 if(isDisplayed2(driver,CategoryError)) {
							 pass(driver,"'Kindly select Category  and Y axis' error is displayed When Click Apply button without providing inputs");
						 }else {
							 fail(driver,"'Kindly select Category  and Y axis' error is not displayed When Click Apply button without providing inputs");
						 }	
						 elementnotvisible1(driver, CategoryError);
					 }
					 
					 if(TC_RADAR_LINE_005.equals("Yes")) {
						 setTestCaseID("TC_RADAR_LINE_005");
						 String default_Categories_Act=getText1(driver,Category_Input);
						 if(default_Categories_Act.equals("Select")) {
							 pass(driver,"By Default 'Select' is selected in the Category value input");
						 }else {
							 fail(driver,"By Default 'Select' is not selected in the Category axis value input");
						 }
					 }
					 
					 if(TC_RADAR_LINE_006.equals("Yes")) {
						 setTestCaseID("TC_RADAR_LINE_006");
						 if(verifyElementDisplayed(driver, Category_Input)) {
							 click(driver,Category_Input);
							 if(isDisplayed2(driver,Category_dropdownExpand)) {
								 pass(driver,"Category dropdown is expanded after click on it ");
								 if(TC_RADAR_LINE_007.equals("Yes")) {
									 setTestCaseID("TC_RADAR_LINE_007");
									 List<WebElement> displayedDataImage=getWebElements(driver, dataTypeImages);
									 boolean categorical=true;
									 for(WebElement dataImag:displayedDataImage) {
										 action.moveToElement(dataImag).build().perform();
										 String dataTypeDisplay=dataImag.getAttribute("src");
										 if(dataTypeDisplay.contains("Categorical")||dataTypeDisplay.contains("Date")||dataTypeDisplay.contains("Text")||dataTypeDisplay.contains("Numerical")) {
											 
										 }else {
											 fail(driver,"Other than Categorical,Date, Numerical and Text datatype column is displayed in the Category dropdown");
											 categorical=false;
											 break;
										 }
									 }
									 if(categorical) {
										 pass(driver, "Only Categorical, Date, Text and Numerical datatype column is displayed in the Category dropdown");
									 } 
								 }
								 
								 if(TC_RADAR_LINE_008.equals("Yes")) {
									 setTestCaseID("TC_RADAR_LINE_008");
									 if(isDisplayed2(driver,CategoricalColumnAxisDropdown)) {
										 String Categorical1=getText1(driver,CategoricalColumnAxisDropdown);
										 if(Categorical1.contains("(")) {
											 pass(driver,"Unique values are displayed in the Categorical Column in the Category dropdown");
										 }else {
											 fail(driver,"Unique values are not displayed in the Categorical Column in the Category dropdown");
										 }
									 }
									 
									 if(isDisplayed2(driver,TextColumnAxisDropdown)) {
										 String Text1=getText1(driver,TextColumnAxisDropdown);
										 if(Text1.contains("(")) {
											 pass(driver,"Unique values are displayed in the Text Column in the Category dropdown");
										 }else {
											 fail(driver,"Unique values are not displayed in the Text Column in the Category dropdown");
										 }
									 } 
								 }
								 
								 if(TC_RADAR_LINE_009.equals("Yes")) {
									 setTestCaseID("TC_RADAR_LINE_009");
									 List<WebElement> displayedDataImage=getWebElements(driver, dataTypeImages);
									 List<WebElement> AvailableColumnList=getWebElements(driver, AvailableList_Dropdown);
									 if(AvailableColumnList.size()-1==displayedDataImage.size()) {
										 pass(driver,"All the available columns are displayed with data Type icon in the Category dropdown");
									 }else {
										 fail(driver,"Some columns are not correctly displayed with data Type icon in the Category dropdown");
									 }
								 }
								 
								 if(TC_RADAR_LINE_012.equals("Yes")) {
									 setTestCaseID("TC_RADAR_LINE_012");
									 ScrollBarValidation1(driver,Category_dropdownExpand,"Category_dropdown");
								 }
								 if(TC_RADAR_LINE_013.equals("Yes")) {
									 setTestCaseID("TC_RADAR_LINE_013");
									 mouseOverToElement(driver,SecondValue);
									 String Highlight_Color_Act=getTextBackgroundColor(driver,SecondValue);
									 if(Highlight_color_Exp.equalsIgnoreCase(Highlight_Color_Act)) {
										 pass(driver," Mouse hovered Column Value highlighted in blue color in the Category dropdown");
									 }else {
										 fail(driver," Mouse hovered Column Value not highlighted in blue color in the Category dropdown, Exp : "+Highlight_color_Exp+" Act : "+Highlight_Color_Act);
									 }
								 }
								 
								 if(TC_RADAR_LINE_011.equals("Yes")) {
									 setTestCaseID("TC_RADAR_LINE_011");
									 if(verifyElementDisplayed(driver, dropdownInputsearchBox)) {
										 sendKeys(driver, dropdownInputsearchBox, Select_Category_Value);
										 List<WebElement> AvailableColumnList=getWebElements(driver, AvailableList_Dropdown);
										 String firstValue_=getText1(driver,FirstSearchedvalue);
										 if(firstValue_.contains(Select_Category_Value) && AvailableColumnList.size()==1) {
											 pass(driver,"Searched Value correctly displayed first in the Category dropdown");
										 }else {
											 fail(driver,"Searched Value not correctly displayed first in the Category dropdown");
										 }
									 }
									 if(TC_RADAR_LINE_010.equals("Yes")) {
										 setTestCaseID("TC_RADAR_LINE_010");
										 selectDropdownValue1(driver,Select_Category_Value);
										 wait(driver,"1");
										 String selectedValue1=getText1(driver,Category_Input);
										 if(selectedValue1.contains(Select_Category_Value)) {
											 pass(driver,"Selected Columnn displayed in the Category input successfully");
										 }else {
											 fail(driver,"Selected Columnn not displayed in the Category input successfully");
										 }
										 
										 if(TC_RADAR_LINE_014.equals("Yes")) {
											 setTestCaseID("TC_RADAR_LINE_014");
											 if(Category_DataType.equals("Date")) {
												 if(isDisplayed(driver,groupDropdown)) {
													 pass(driver,"Group selection input option is displayed While select Date datatype in Category input");
													 click(driver,groupDropdown);
													 if(verifyElementDisplayed(driver, GroupDropdownExpand)){
														 selectGroupDateValue(driver,Select_Group_Value);
														 wait(driver,"1");
														 if(isDisplayed2(driver,GroupDropdownExpand)) {
															 fail(driver,"Group dropdown not closed after Selecting value ");
														 }else {
															 pass(driver,"Group dropdown Closed after Selecting value ");
														 }
													 }
														
												 }else {
													 fail(driver,"Group selection input option is not displayed While select Date datatype in Category input");
												 }
											 }
										 }
										 
										 if(TC_RADAR_LINE_027.equals("Yes")) {
											 setTestCaseID("TC_RADAR_LINE_027");
											 scrollUsingElement(driver, ApplyButton);
											 click(driver,ApplyButton);
											 if(isDisplayed(driver,CategoryError)) {
												 pass(driver,"'Kindly select X axis and Y axis ' Error displayed when click Apply button only providing Y_Axis Value");
												 elementnotvisible1(driver, CategoryError);
											 }else {
												 fail(driver,"'Kindly select X axis and Y axis ' Error not displayed when click Apply button only providing Y_Axis Value");
											 }
										 }
									 }
								 }
								 
							 }else {
								 fail(driver,"Category dropdown not expanded after click on it");
							 } 
						 }
					 }
					 
					 
					 if(TC_RADAR_LINE_015.equals("Yes")) {
						 setTestCaseID("TC_RADAR_LINE_015");
						 if(verifyElementDisplayed(driver, Y_Axis_Input_Group)) {
							 click(driver,Y_Axis_Input_Group);
							 if(isDisplayed2(driver,Y_Axis_DropdownExpand)) {
								 pass(driver,"Y Axis dropdown is expanded after click on it ");
								 if(TC_RADAR_LINE_016.equals("Yes")) {
									 setTestCaseID("TC_RADAR_LINE_016");
									 List<WebElement> displayedDataImage=getWebElements(driver, dataTypeImages);
									 boolean Y_Axis=true;
									 for(WebElement dataImag:displayedDataImage) {
										 action.moveToElement(dataImag).build().perform();
										 String dataTypeDisplay=dataImag.getAttribute("src");//!dataTypeDisplay.contains("Text") need to add.
										 if(dataTypeDisplay.contains("Categorical")||dataTypeDisplay.contains("Date")||dataTypeDisplay.contains("Text")||dataTypeDisplay.contains("Numerical")) {
											 
										 }else {
											 fail(driver,"Other than Categorical,Date,Numerical and Text datatype column is displayed in the Y axis dropdown");
											 Y_Axis=false;
											 break;
										 }
									 }
									 if(Y_Axis) {
										 pass(driver, "Only Categorical,Date,Numerical and Text datatype column is displayed in the Y Axis dropdown");
									 } 
								 }
								 
								 if(TC_RADAR_LINE_017.equals("Yes")) {
									 setTestCaseID("TC_RADAR_LINE_017");
									 if(isDisplayed2(driver,CategoricalColumnAxisDropdown)) {
										 String Categorical1=getText1(driver,CategoricalColumnAxisDropdown);
										 if(Categorical1.contains("(")) {
											 pass(driver,"Unique values are displayed in the Categorical Column in the Y Axis dropdown");
										 }else {
											 fail(driver,"Unique values are not displayed in the Categorical Column in the Y Axis dropdown");
										 }
									 }
									 
									 if(isDisplayed2(driver,TextColumnAxisDropdown)) {
										 String Text1=getText1(driver,TextColumnAxisDropdown);
										 if(Text1.contains("(")) {
											 pass(driver,"Unique values are displayed in the Text Column in the Y Axis dropdown");
										 }else {
											 fail(driver,"Unique values are not displayed in the Text Column in the Y Axis dropdown");
										 }
									 } 
								 }
								 
								 if(TC_RADAR_LINE_018.equals("Yes")) {
									 setTestCaseID("TC_RADAR_LINE_018");
									 List<WebElement> displayedDataImage=getWebElements(driver, dataTypeImages);
									 List<WebElement> AvailableColumnList=getWebElements(driver, AvailableList_Dropdown);
									 if(AvailableColumnList.size()==displayedDataImage.size()) {
										 pass(driver,"All the available columns are displayed with data Type icon in the Y axis dropdown");
									 }else {
										 fail(driver,"Some columns are not correctly displayed with data Type icon in the Y Axis dropdown");
									 }
								 }
								 
								 if(TC_RADAR_LINE_021.equals("Yes")) {
									 setTestCaseID("TC_RADAR_LINE_021");
									 ScrollBarValidation1(driver,Y_Axis_DropdownExpand,"Y_Axis_dropdown");
								 }
								 if(TC_RADAR_LINE_022.equals("Yes")) {
									 setTestCaseID("TC_RADAR_LINE_022");
									 mouseOverToElement(driver,SecondValue);
									 String Highlight_Color_Act=getTextBackgroundColor(driver,SecondValue);
									 if(Highlight_color_Exp.equalsIgnoreCase(Highlight_Color_Act)) {
										 pass(driver," Mouse hovered Column Value highlighted in blue color in the Y_Axis dropdown");
									 }else {
										 fail(driver," Mouse hovered Column Value not highlighted in blue color in the Y_Axis dropdown, Exp : "+Highlight_color_Exp+" Act : "+Highlight_Color_Act);
									 }
								 }
								 
								 if(TC_RADAR_LINE_023.equals("Yes")) {
									 setTestCaseID("TC_RADAR_LINE_023");
									 mouseOverToElement(driver, Num_agg_fieldSortValue);
						    		 String defaultNumericalSelect=defaultSelectedValue(driver,Num_agg_fieldSortValue);
							 		 if(defaultNumericalSelect.equals("Sum")) {
							 			pass(driver,"'Sum' is selected as default for Numerical in Y Axis dropdown ");
							     	 }else {
							 			fail(driver,"'Sum' is not selected as default for Numerical in Y Axis dropdown");
							     	 }
								 }
								 
								 if(TC_RADAR_LINE_024.equals("Yes")) {
									 setTestCaseID("TC_RADAR_LINE_024");
									 mouseOverToElement(driver, Cate_agg_fieldSortValue);
									 String defaultCategoricalSelect=defaultSelectedValue(driver,Cate_agg_fieldSortValue);
									 if(defaultCategoricalSelect.equals("Count")) {
										 pass(driver,"'Count' is selected as default for Categorical in Y axis dropdown");
									 }else {
										 fail(driver,"'Count' is not selected as default for Categorical Y axis dropdown ");
									 }
								 }
								 
								 if(TC_RADAR_LINE_025.equals("Yes")) {
									 setTestCaseID("TC_RADAR_LINE_025");
									 mouseOverAndClick(driver, FirstAggg);
									 verifyElementIsPresent1(driver, SumAgg);
									 verifyElementIsPresent1(driver, CountAgg);
									 verifyElementIsPresent1(driver, AverageAgg);
									 verifyElementIsPresent1(driver, MinAgg);
									 verifyElementIsPresent1(driver, MaxAgg);
									 verifyElementIsPresent1(driver, UniqueAgg);
								 }
								 
								 
								 if(TC_RADAR_LINE_026.equals("Yes")) {
									 setTestCaseID("TC_RADAR_LINE_026");
									 selectDropdownValue1(driver,Select_Category_Value);
									 mouseOverAndClick(driver, Y_Axis_Text_Group);
									 scrollUsingElement(driver, ApplyButton);
									 click(driver,ApplyButton);
									 if(isDisplayed(driver,error)) {
										 fail(driver," Error displayed when click Apply button with same inputs");
										 elementnotvisible1(driver, error);
									 }else {
										 pass(driver," Error not displayed when click Apply button with same inputs");
										 verifyElementDisplayed(driver, ChartGraph);
									 }
									 mouseOverAndClick(driver, RemoveValuesInput);
								 }
								 
								 if(TC_RADAR_LINE_028.equals("Yes")) {
									 setTestCaseID("TC_RADAR_LINE_028");
									 click(driver,Category_Input);
									 waitForElement(driver,Category_dropdownExpand);
									 click(driver,SelectOption);
									 click(driver,Y_Axis_Input_Group);
									 waitForElement(driver,Y_Axis_DropdownExpand);
									 selectDropdownValue1(driver,Select_Category_Value);
									 mouseOverAndClick(driver, Y_Axis_Text_Group);
									 scrollUsingElement(driver, ApplyButton);
									 click(driver,ApplyButton);
									 if(isDisplayed(driver,CategoryError)) {
										 pass(driver,"'Kindly select Category  and Y axis ' Error displayed when click Apply button only providing Y Axis inputs");
										 elementnotvisible1(driver, CategoryError);
									 }else {
										 fail(driver,"'Kindly select Category  and Y axis ' Error not displayed when click Apply button only providing Y Axis inputs");
									 }
									 mouseOverAndClick(driver, RemoveValuesInput);
									 click(driver,Category_Input);
									 waitForElement(driver,Category_dropdownExpand);
									 selectDropdownValue1(driver,Select_Category_Value);
								 }
								 
								 if(TC_RADAR_LINE_029.equals("Yes")) {
									 setTestCaseID("TC_RADAR_LINE_029");
									 click(driver,Y_Axis_Input_Group);
									 List<WebElement> AvailableColumnList_Y_Axis=getWebElements(driver, AvailableList);
									 int columnListCount=AvailableColumnList_Y_Axis.size();
										if(columnListCount>5) {
											for (int k=0;k<=5;k++) {
												WebElement availableColumn=AvailableColumnList_Y_Axis.get(k);
												action.moveToElement(availableColumn).click().build().perform();
											}
											mouseOverAndClick(driver, Y_Axis_Text_Group);
											scrollUsingElement(driver, ApplyButton);
											click(driver,ApplyButton);
											
											if(isDisplayed(driver,Y_Axis_Limit_Error)) {
												pass(driver,"'Kindly select less than or equal to 5 column for Y axis' error displayed when Selecting more than 5 value in the Y Axis dropdown");
											}else {
												fail(driver,"'Kindly select less than or equal to 5 column for Y axis' error not displayed when Selecting more than 5 value in the Y Axis dropdown");
											}
										}
										while(isDisplayed(driver,RemoveValuesInput)) {
											WebElement RemoveSelectList=getWebElement(driver,RemoveValuesInput);
											action.moveToElement(RemoveSelectList).click().build().perform();
											wait(driver,"1");
										}
										elementnotvisible1(driver, Y_Axis_Limit_Error);
								 }
								 if(TC_RADAR_LINE_020.equals("Yes")) {
									 setTestCaseID("TC_RADAR_LINE_020");
									 click(driver,Y_Axis_Input_Group);
									 if(verifyElementDisplayed(driver, dropdownInputsearchBox)) {
										 sendKeys(driver, dropdownInputsearchBox, Select_Y_Axis_Value);
										 List<WebElement> AvailableColumnList=getWebElements(driver, AvailableList_Dropdown);
										 String firstValue_=getText1(driver,FirstSearchedvalue);
										 if(firstValue_.contains(Select_Y_Axis_Value) && AvailableColumnList.size()==1) {
											 pass(driver,"Searched Value correctly displayed first in the Y Axis dropdown");
										 }else {
											 fail(driver,"Searched Value not correctly displayed first in the Y Axis dropdown");
										 }
									 }
									 
									 if(TC_RADAR_LINE_030.equals("Yes")) {
										 setTestCaseID("TC_RADAR_LINE_030");
										 try {
											 WebElement agg=driver.findElement(By.xpath("//select[contains(@id,'"+Select_Y_Axis_Value.trim()+"_')]"));
											 Select aggselect=new Select(agg);
											 aggselect.selectByVisibleText(Select_Y_Axis_AggregationValue);
											 pass(driver,"Select the Dropdown by text "+Select_Y_Axis_AggregationValue);
										 }catch(Exception e) {
											 fail(driver,"Unable to Select the Dropdown by text "+Select_Y_Axis_AggregationValue);
										 }										 
									 }
									 
									 if(TC_RADAR_LINE_019.equals("Yes")) {
										 setTestCaseID("TC_RADAR_LINE_019");
										 selectDropdownValue1(driver,Select_Y_Axis_Value);
										 wait(driver,"1");
										 String selectedValue1=getText1(driver,Y_Axis_Input_Group);
										 if(selectedValue1.contains(Select_Y_Axis_Value)) {
											 pass(driver,"Selected Columnn displayed in the Y Axis input successfully");
										 }else {
											 fail(driver,"Selected Columnn not displayed in the Y Axis input successfully");
										 }
										 
										 if(TC_RADAR_LINE_030.equals("Yes")) {
											 setTestCaseID("TC_RADAR_LINE_030");
											 if(Select_Y_Axis_AggregationValue.equals("Average")) {
												 Select_Y_Axis_AggregationValue="Avg";
											 }
											 if(selectedValue1.contains(Select_Y_Axis_AggregationValue)) {
												 pass(driver,"Selected aggregation displayed in the Y Axis input successfully");
											 }else {
												 fail(driver,"Selected aggregation not displayed in the Y Axis input successfully, Exp : "+Select_Y_Axis_AggregationValue+", Act Text : "+selectedValue1);
											 }
										 }
										 mouseOverAndClick(driver, Y_Axis_Text_Group);
										 scrollUsingElement(driver, ApplyButton);
										 click(driver,ApplyButton);
										 if(isDisplayed(driver,error)) {
											 fail(driver,"Error displayed when click apply button after providing the input values");
										 }else {
											 verifyElementDisplayed(driver, ChartGraph);
										 }
										 
									 }
								 }
							 }else {
								 fail(driver,"Y Axis dropdown is expanded after click on it ");
							 }
						 }
					 }//Y axis Completed
					 
					 if(TC_RADAR_LINE_031.equals("Yes")) {
						 setTestCaseID("TC_RADAR_LINE_031");
						 verifyElementDisplayed(driver, sortType);
						 
						 if(TC_RADAR_LINE_032.equals("Yes")) {
							 setTestCaseID("TC_RADAR_LINE_032");
							 String defaultSortType=defaultSelectedValue(driver,sortType);
							 if(defaultSortType.equals("Quick Sort")) {
								 pass(driver,"'Quick Sort' is selected by default in the sortType input");
							 }else {
								 fail(driver,"'Quick Sort' is not selected by default in the sortType input");
							 }
						 }
						 
						 if(TC_RADAR_LINE_033.equals("Yes")) {
							 setTestCaseID("TC_RADAR_LINE_033");
							 click(driver,sortType);
							 verifyElementIsPresent1(driver, QuickSort);
							 verifyElementIsPresent1(driver, FieldSort);
						 }
						 
						 if(TC_RADAR_LINE_034.equals("Yes")) {
							 setTestCaseID("TC_RADAR_LINE_034");
							 selectByText(driver,sortType,"Quick Sort");
							 click(driver,sortBy);
							 if(verifyElementDisplayed(driver,sortByDropdownExpand)) {
								 List<WebElement> SortByValues=getWebElements(driver,sortByValues);
								 int SortByValuesCount=SortByValues.size();
								 if(SortByValuesCount<=3) {
									 pass(driver,"Only Category and Y values are displayed in the sortBy field for Quicksort condition");
								 }else {
									 fail(driver,"Other Category X and Y values are displayed in the sortBy field for Quicksort condition");
								 }
								    
							 }
						 }
						 
						 if(TC_RADAR_LINE_035.equals("Yes")) {
							 setTestCaseID("TC_RADAR_LINE_035");
							 selectByText(driver,sortType,"Field Sort");
							 click(driver,sortBy1);
							 if(verifyElementDisplayed(driver,sortByDropdownExpand)) {
								 List<WebElement> SortByValues1=getWebElements(driver,sortByValues1);
								 int SortByValuesCount=SortByValues1.size();
								 if(SortByValuesCount<=3) {
									 fail(driver,"Only X and Y values are displayed in the sortBy field for Fieldsort condition");
								 }else {
									 pass(driver,"All values are displayed in the sortBy field for Fieldsort condition");
								 }
								 
								 if(TC_RADAR_LINE_036.equals("Yes")) {
									 setTestCaseID("TC_RADAR_LINE_036");
									 wait(driver,"1");
									 if(isDisplayed(driver,Cate_agg_fieldSortValue)) {
										 mouseOverToElement(driver, Cate_agg_fieldSortValue);
										 String defaultCategoricalSelect=defaultSelectedValue(driver,Cate_agg_fieldSortValue);
										 if(defaultCategoricalSelect.equals("Count")) {
											 pass(driver,"'Count' is selected as default for Categorical in Field sort ");
										 }else {
											 fail(driver,"'Count' is not selected as default for Categorical in Field sort ");
										 }
									 }
									 
									 if(isDisplayed(driver,Num_agg_fieldSortValue)) {
										 mouseOverToElement(driver, Num_agg_fieldSortValue);
										 String defaultNumericalSelect=defaultSelectedValue(driver,Num_agg_fieldSortValue);
										 if(defaultNumericalSelect.equals("Sum")) {
											 pass(driver,"'Sum' is selected as default for Numerical in Field sort ");
										 }else {
											 fail(driver,"'Sum' is not selected as default for Numerical in Field sort ");
										 }
									 }
								 }
								 if(TC_RADAR_LINE_041.equals("Yes")) {
									 setTestCaseID("TC_RADAR_LINE_041");
									 ScrollBarValidation1(driver, ListFieldSection, "Field_Sort"); 
								 }
								 
								 if(TC_RADAR_LINE_037.equals("Yes")) {
									 setTestCaseID("TC_RADAR_LINE_037");
									 if(verifyElementDisplayed(driver, inputFieldSort)) {
										 if(TC_RADAR_LINE_040.equals("Yes")) {
											 setTestCaseID("TC_RADAR_LINE_040");
											 click(driver,inputFieldSort);
											 sendKeys(driver, inputFieldSort, "dgrehtj");
											 if(isDisplayed(driver,NoResultsFound)) {
												 pass(driver,"No results found is displayed for invalid input");
											 }else {
												 fail(driver,"No results found is not displayed for invalid input");
											 }
											 clear1(driver,inputFieldSort);
											 
										 }
										 if(TC_RADAR_LINE_038.equals("Yes")) {
											 setTestCaseID("TC_RADAR_LINE_038");
											 List<WebElement> AllList=getWebElements(driver, ListFieldsort);
											 int lastindex=AllList.size()-1;
											 String lastText=AllList.get(lastindex).getText();
											 sendKeys(driver, inputFieldSort, lastText);
											 String firstList=getText1(driver, FirstField);
											 if(firstList.equals(lastText)) {
												 pass(driver,"Search input inside the field sort working properly");
											 }else {
												 fail(driver,"Search input inside the field sort not working properly");
											 }
											 
											 if(TC_RADAR_LINE_039.equals("Yes")) {
												 setTestCaseID("TC_RADAR_LINE_039");
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
								 }
								 
							 }//field dropdown expand
						 }
						 
						 if(TC_RADAR_LINE_042.equals("Yes")) {
							 setTestCaseID("TC_RADAR_LINE_042");
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
						 }
						 if(TC_RADAR_LINE_043.equals("Yes")) {
							 setTestCaseID("TC_RADAR_LINE_043");
							 click(driver,quickSortBytext);
							 WebElement selectSort=driver.findElement(By.xpath("//ul//span[text()='"+Select_SortBy_Value+"']"));
							 selectSort.click();
							 String QuickSortByText=getText1(driver,quickSortBytext);
							 scrollUsingElement(driver, ApplyButton);
							 click(driver,ApplyButton);
							 elementnotvisible1(driver, RPE_Loading);
							 verifyElementDisplayed(driver, ChartGraph);
						 }
					 }
				 }//axes expand by default
				 
				// ******************** Axis Title Validation Start *******************
				 String Radar_Line_Axis_Title= getCellValue("TestExecution","Testcase_Selection","Radar_Line_Axis_Title",Flag);
			     if(Radar_Line_Axis_Title.equals("Yes")) {
			    	 
			    	 String TC_RADAR_LINE_AXIS_TITLE_001=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ RADAR LINE_001",TestcaseID_Flag);
			    	 String TC_RADAR_LINE_AXIS_TITLE_002=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ RADAR LINE_002",TestcaseID_Flag);
			    	 String TC_RADAR_LINE_AXIS_TITLE_003=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ RADAR LINE_003",TestcaseID_Flag);
			    	 String TC_RADAR_LINE_AXIS_TITLE_004=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ RADAR LINE_004",TestcaseID_Flag);
			    	 String TC_RADAR_LINE_AXIS_TITLE_005=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ RADAR LINE_005",TestcaseID_Flag);
			    	 String TC_RADAR_LINE_AXIS_TITLE_006=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ RADAR LINE_006",TestcaseID_Flag);
			    	 String TC_RADAR_LINE_AXIS_TITLE_007=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ RADAR LINE_007",TestcaseID_Flag);
			    	 String TC_RADAR_LINE_AXIS_TITLE_008=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ RADAR LINE_008",TestcaseID_Flag);
			    	 String TC_RADAR_LINE_AXIS_TITLE_009=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ RADAR LINE_009",TestcaseID_Flag);
			    	 String TC_RADAR_LINE_AXIS_TITLE_010=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ RADAR LINE_010",TestcaseID_Flag);
			    	 String TC_RADAR_LINE_AXIS_TITLE_011=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ RADAR LINE_011",TestcaseID_Flag);
			    	 String TC_RADAR_LINE_AXIS_TITLE_012=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ RADAR LINE_012",TestcaseID_Flag);
			    	 String TC_RADAR_LINE_AXIS_TITLE_013=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ RADAR LINE_013",TestcaseID_Flag);
			    	 String TC_RADAR_LINE_AXIS_TITLE_014=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ RADAR LINE_014",TestcaseID_Flag);
			    	 String TC_RADAR_LINE_AXIS_TITLE_015=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ RADAR LINE_015",TestcaseID_Flag);

			    	 if(TC_RADAR_LINE_AXIS_TITLE_001.equals("Yes")) {
						 setTestCaseID("TC_RADAR_LINE_ AXIS_TITLE_001");
						 if(verifyElementDisplayed(driver, AxisTitle)) {
							 click(driver,AxisTitle);
							 wait(driver,"1");
							 String AxisExpand=getAttribute1(driver,AxisTitleExpand,"class");
							 if(AxisExpand.contains("up")) {
								 pass(driver,"Axis Title section is Expanded after click on it");
								 if(TC_RADAR_LINE_AXIS_TITLE_002.equals("Yes")) {
									 setTestCaseID("TC_RADAR_LINE_ AXIS_TITLE_002");
									 verifyElementDisplayed(driver, X_Title_text);
									 verifyElementDisplayed(driver,X_Title_input);
									 verifyElementDisplayed(driver, Y_Title_text);
									 verifyElementDisplayed(driver,Y_Title_input);
						     	  	
									 clearAndType(driver,X_Title_input,Change_X_Title_Name);
									 clearAndType(driver,Y_Title_input,Change_Y_Title_Name);
									 scrollUsingElement(driver, ApplyButton);
									 click(driver,ApplyButton);
									 elementnotvisible1(driver, RPE_Loading);
									 verifyElementDisplayed(driver,ChartGraph);
						     	  		
									 String Y_ChartText=getText1(driver,Y_Value_RadarChart);
									 String X_ChartText=getText1(driver,X_Value_RadarChart);
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
								 }
								 
								 setTestCaseID("TS_RADAR_LINE_ AXIS_TITLE_003");
								 if(verifyElementDisplayed(driver, fontFamily_dropdown)) {
									 if(TC_RADAR_LINE_AXIS_TITLE_003.equals("Yes")) {
										 setTestCaseID("TC_RADAR_LINE_ AXIS_TITLE_003");
										 String fontFamily_Value=getText1(driver,fontFamily_dropdown);
										 System.out.println("FontFamily_Value : "+fontFamily_Value);
										 if(fontFamily_Value.equals(default_FontFamily)) {
											 pass(driver,"By default, "+default_FontFamily+" displayed in the Font Family input");
										 }else {
											 fail(driver,"By default, "+default_FontFamily+" is not displayed in the Font Family input");
										 }
									 }
					     	  			
									 if(TC_RADAR_LINE_AXIS_TITLE_004.equals("Yes")) {
										 setTestCaseID("TC_RADAR_LINE_ AXIS_TITLE_004");
										 click(driver,fontFamily_dropdown);
										 if(isDisplayed(driver,fontFamily_DropdownExpand)) {
											 pass(driver,"Font family dropdown is expanded after click on it");
											 if(TC_RADAR_LINE_AXIS_TITLE_005.equals("Yes")) {
												 setTestCaseID("TC_RADAR_LINE_ AXIS_TITLE_005");
												 ScrollBarValidation1(driver,fontFamily_DropdownExpand,"Font_Family_RadarLine");
											 }
							     	        	
											 if(TC_RADAR_LINE_AXIS_TITLE_006.equals("Yes")) {
												 setTestCaseID("TC_RADAR_LINE_ AXIS_TITLE_006");
												 selectFontFamily(driver,ChangeFontFamily_AxisTitle);
												 wait(driver,"1");
												 scrollUsingElement(driver, ApplyButton);
												 click(driver,ApplyButton);
												 elementnotvisible1(driver, RPE_Loading);
												 if(verifyElementDisplayed(driver,ChartGraph)) {
													 String fontFamily_Y_Act=getFontFamily(driver,Y_Value_RadarChart);
													 if(fontFamily_Y_Act.equals(ChangeFontFamily_AxisTitle)) {
							     	   			     	pass(driver,"Selected fontFamily ("+ChangeFontFamily_AxisTitle+") Updated in Y Axis chart value");
													 }else {
														 fail(driver,"Selected FontFamily ("+ChangeFontFamily_AxisTitle+") is not Updated in Y Axis chart value");
													 } 
												 }
											 }
										 }else {
											 fail(driver,"Font family dropdown is not expanded after click on it");
										 }
									 }
								 }
								 
								 setTestCaseID("TS_RADAR_LINE_ AXIS_TITLE_004");
								 if(verifyElementDisplayed(driver, titleFontSizeDropdown)) {
									 if(TC_RADAR_LINE_AXIS_TITLE_007.equals("Yes")) {
										 setTestCaseID("TC_RADAR_LINE_ AXIS_TITLE_007");
										 String font_Size_Act=defaultSelectedValue(driver,titleFontSizeDropdown);
										 //System.out.println("Font_Size : "+font_Size_Act);
										 if(font_Size_Act.equals(default_FontSize_Exp)) {
											 pass(driver,"By default, "+default_FontSize_Exp+" displayed in the Title Font Size input");
										 }else {
											 fail(driver,"By default, "+default_FontSize_Exp+" is not displayed in the Title Font Size input");
										 }
									 }
									 
									 if(TC_RADAR_LINE_AXIS_TITLE_008.equals("Yes")) {
										 setTestCaseID("TC_RADAR_LINE_ AXIS_TITLE_008");
										 click(driver,titleFontSizeDropdown);
										 verifyElementIsPresent1(driver, TitleFontSizeOptions);
									 }
									 
									 if(TC_RADAR_LINE_AXIS_TITLE_009.equals("Yes")) {
										 setTestCaseID("TC_RADAR_LINE_ AXIS_TITLE_009");
										 selectByText(driver, titleFontSizeDropdown, ChangeTitleFontSize_AxisTitle);
										 wait(driver,"1");
										 scrollUsingElement(driver, ApplyButton);
										 click(driver,ApplyButton);
										 elementnotvisible1(driver, RPE_Loading);
										 if(verifyElementDisplayed(driver,ChartGraph)) {
											 String fontSize_Y_Act=getFontSize(driver,Y_Value_RadarChart);
											 String fontSize_X_Act=getFontSize(driver,X_Value_RadarChart);
											 if((ChangeTitleFontSize_AxisTitle.equals(fontSize_Y_Act))&&ChangeTitleFontSize_AxisTitle.equals(fontSize_X_Act)) {
												 pass(driver,"Given Title Font Size Updated in X-Axis Title and Y-Axis Title chart value");
											 }else {
												 fail(driver,"Given Title Font Size '"+ChangeTitleFontSize_AxisTitle+"' not Updated in X-Axis Title or Y-Axis Title chart value");
											 }
										 }
										 
									 }
								 }
								 
								 setTestCaseID("TS_RADAR_LINE_ AXIS_TITLE_005");
								 if(verifyElementDisplayed(driver, X_axisFontSizeDropdown)) {
									 if(TC_RADAR_LINE_AXIS_TITLE_010.equals("Yes")) {
										 setTestCaseID("TC_RADAR_LINE_ AXIS_TITLE_010");
										 String X_font_Size_Act=defaultSelectedValue(driver,X_axisFontSizeDropdown);
										 System.out.println("X Font_Size : "+X_font_Size_Act);
										 if(X_font_Size_Act.equals(default_FontSize_Exp)) {
											 pass(driver,"By default, "+default_FontSize_Exp+" displayed in the X axis Font Size input");
										 }else {
											 fail(driver,"By default, "+default_FontSize_Exp+" is not displayed in the X axis Font Size input");
										 }
									 }
									 
									 if(TC_RADAR_LINE_AXIS_TITLE_011.equals("Yes")) {
										 setTestCaseID("TC_RADAR_LINE_ AXIS_TITLE_011");
										 click(driver,X_axisFontSizeDropdown);
										 verifyElementIsPresent1(driver, X_axisFontSizeDropdownOptions);
									 }
									 
									 if(TC_RADAR_LINE_AXIS_TITLE_012.equals("Yes")) {
										 setTestCaseID("TC_RADAR_LINE_ AXIS_TITLE_012");
										 selectByText(driver,X_axisFontSizeDropdown,Change_X_label_FontSize);
										 scrollUsingElement(driver, ApplyButton);
										 click(driver,ApplyButton);
										 elementnotvisible1(driver, RPE_Loading);
										 if(verifyElementDisplayed(driver,ChartGraph)) {
											 if(isDisplayed2(driver,X_Axis_Label_RadarLineChart)) {
												 String fontSize_X_label_Act=getFontSize(driver,X_Axis_Label_RadarLineChart);
												 if(Change_X_label_FontSize.equals(fontSize_X_label_Act)) {
													 pass(driver,"Selected fontSize ("+Change_X_label_FontSize+") Updated in X Axis label chart value");
												 }else {
													 fail(driver,"Selected fontSize  ("+Change_X_label_FontSize+") not Updated in X Axis label chart value");
												 }
											 }
										 }else {
											 fail(driver,"X Axis Label value not present in the Chart");
										 }
									 }
								 }
								 
								 setTestCaseID("TS_RADAR_LINE_ AXIS_TITLE_006");
								 if(verifyElementDisplayed(driver, Y_axisFontSizeDropdown)) {
									 if(TC_RADAR_LINE_AXIS_TITLE_013.equals("Yes")) {
										 setTestCaseID("TC_RADAR_LINE_ AXIS_TITLE_013");
										 String Y_font_Size_Act=defaultSelectedValue(driver,Y_axisFontSizeDropdown);
										 if(Y_font_Size_Act.equals(default_FontSize_Exp)) {
					     	      			pass(driver,"By default, "+default_FontSize_Exp+" displayed in the Y axis Font Size input");
										 }else {
					     	           	    fail(driver,"By default, "+default_FontSize_Exp+" is not displayed in the Y axis Font Size input");
										 }
									 }
									 
									 if(TC_RADAR_LINE_AXIS_TITLE_014.equals("Yes")) {
										 setTestCaseID("TC_RADAR_LINE_ AXIS_TITLE_014");
										 click(driver,Y_axisFontSizeDropdown);
							 			 verifyElementIsPresent1(driver, Y_axisFontSizeDropdownOptions);
									 }
									 
									 if(TC_RADAR_LINE_AXIS_TITLE_015.equals("Yes")) {
										 setTestCaseID("TC_RADAR_LINE_ AXIS_TITLE_015");
										 selectByText(driver,Y_axisFontSizeDropdown,Change_Y_label_FontSize);
										 scrollUsingElement(driver, ApplyButton);
										 click(driver,ApplyButton);
										 elementnotvisible1(driver, RPE_Loading);
										 if(verifyElementDisplayed(driver,ChartGraph)) {
											 String fontSize_Y_label_Act=getFontSize(driver,X_AxisLabel_chartNew2);
											 if(Change_Y_label_FontSize.equals(fontSize_Y_label_Act)) {
												 pass(driver,"Selected fontSize ("+Change_Y_label_FontSize+") Updated in Y Axis label chart value");
											 }else {
							     	    	    fail(driver,"Selected fontSize ("+Change_Y_label_FontSize+") not Updated in Y Axis label chart value, Act : "+fontSize_Y_label_Act);
											 }
										 }
									 }
								 }
							 }else {
								 fail(driver,"Axis Title section is not Expanded after click on it");
							 }
						 }
			    	 }
			    	 			    	 
			     }
			    // ******************** Axis Title Validation Start *******************
			     
			     setTestCaseID("");
			   // ******************** Chart Style Validation Start *******************
				 String Radar_Line_ChartFormat_Chart_Style= getCellValue("TestExecution","Testcase_Selection","Radar_Line_ChartFormat_Chart_Style",Flag);
			     if(Radar_Line_ChartFormat_Chart_Style.equals("Yes")) {
			    	 
			    	 String TC_RADAR_LINE_CHART_STYLE_001=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ RADAR LINE_001",TestcaseID_Flag);
			    	 String TC_RADAR_LINE_CHART_STYLE_002=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ RADAR LINE_002",TestcaseID_Flag);
			    	 String TC_RADAR_LINE_CHART_STYLE_003=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ RADAR LINE_003",TestcaseID_Flag);
			    	 String TC_RADAR_LINE_CHART_STYLE_004=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ RADAR LINE_004",TestcaseID_Flag);
			    	 String TC_RADAR_LINE_CHART_STYLE_005=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ RADAR LINE_005",TestcaseID_Flag);
			    	 String TC_RADAR_LINE_CHART_STYLE_006=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ RADAR LINE_006",TestcaseID_Flag);
			    	 String TC_RADAR_LINE_CHART_STYLE_007=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ RADAR LINE_007",TestcaseID_Flag);
			    	 String TC_RADAR_LINE_CHART_STYLE_008=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ RADAR LINE_008",TestcaseID_Flag);
			    	 String TC_RADAR_LINE_CHART_STYLE_009=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ RADAR LINE_009",TestcaseID_Flag);
			    	 String TC_RADAR_LINE_CHART_STYLE_010=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ RADAR LINE_010",TestcaseID_Flag);
			    	 String TC_RADAR_LINE_CHART_STYLE_011=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ RADAR LINE_011",TestcaseID_Flag);
			    	 String TC_RADAR_LINE_CHART_STYLE_012=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ RADAR LINE_012",TestcaseID_Flag);
			    	 String TC_RADAR_LINE_CHART_STYLE_013=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ RADAR LINE_013",TestcaseID_Flag);
			    	 String TC_RADAR_LINE_CHART_STYLE_014=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ RADAR LINE_014",TestcaseID_Flag);
			    	 String TC_RADAR_LINE_CHART_STYLE_015=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ RADAR LINE_015",TestcaseID_Flag);
			    	 String TC_RADAR_LINE_CHART_STYLE_016=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ RADAR LINE_015",TestcaseID_Flag);
			    	 String TC_RADAR_LINE_CHART_STYLE_017=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ RADAR LINE_015",TestcaseID_Flag);

			    	 if(TC_RADAR_LINE_CHART_STYLE_001.equals("Yes")) {
			    		 setTestCaseID("TC_RADAR_LINE_ CHART_STYLE_001");
			    		 verifyElementDisplayed(driver,Chart_FormatSec);
			    		 click(driver,Chart_FormatSec);
			    		 String ChartFormatOpenstatus=getAttribute1(driver, chartFormatExpand, "class");
			    		 if(ChartFormatOpenstatus.contains("up")) {
		   	  				pass(driver,"Chart Format is expanded when clicking the Chart Format");
		   	  				if(TC_RADAR_LINE_CHART_STYLE_002.equals("Yes")) {
		   	  					setTestCaseID("TC_RADAR_LINE_ CHART_STYLE_002");
		   	  					String ChartStylingExpand=getAttribute1(driver, ChartStyling_Expand, "class");
		   	  					if(!ChartStylingExpand.contains("up")) {
		   	  						fail(driver,"By default, Chart Styling not gets Expand");
		   	  					}else {
		   	  						pass(driver,"By default, Chart Styling gets Expanded");
		   	  						if(TC_RADAR_LINE_CHART_STYLE_003.equals("Yes")) {
		   	  							setTestCaseID("TC_RADAR_LINE_ CHART_STYLE_003");
		   	  							verifyElementDisplayed(driver,ChartThemeText);
		   	  							verifyElementDisplayed(driver,ChartThemeInput);
				     			   	
		   	  							verifyElementDisplayed(driver,X_ScrollText);
		   	  							verifyElementDisplayed(driver,X_ScrollInputSlider);
				     			
		   	  							verifyElementDisplayed(driver,Y_ScrollText);
		   	  							verifyElementDisplayed(driver,Y_ScrollInputSlider);
				     			
		   	  							verifyElementDisplayed(driver,EnableGridText);
		   	  							verifyElementDisplayed(driver,EnableGrid_InputSlider);
		   	  						}
		   	  						
		   	  						if(TC_RADAR_LINE_CHART_STYLE_004.equals("Yes")) {
		   	  							setTestCaseID("TC_RADAR_LINE_ CHART_STYLE_004");
		   	  							String defaultThemeValue_Act=getText1(driver,ChartThemeInput);
		   	  							if(defaultThemeValue_Act.equals(DefaultThemeValue_Exp)) {
		   	  								pass(driver,"By default, Chart theme selected the value as '"+DefaultThemeValue_Exp+"'");
		   	  							}else {
		   	  								fail(driver,"By default, '"+DefaultThemeValue_Exp+"' value not selected in the  Chart theme input");
		   	  							}
		   	  						}
		   	  						
		   	  						if(TC_RADAR_LINE_CHART_STYLE_005.equals("Yes")) {
		   	  							setTestCaseID("TC_RADAR_LINE_ CHART_STYLE_005");
		   	  							click(driver,ChartThemeInput);
		   	  							if(verifyElementDisplayed(driver,ChartThemeResults)) {
		   	  								if(TC_RADAR_LINE_CHART_STYLE_008.equals("Yes")) {
		   	  									setTestCaseID("TC_RADAR_LINE_ CHART_STYLE_008");
		   	  									mouseOverToElement(driver,SecondValue);
		   	  									String Highlight_Color_Act=getTextBackgroundColor(driver,SecondValue);
		   	  									if(Highlight_color_Exp.equalsIgnoreCase(Highlight_Color_Act)) {
		   	  										pass(driver," Mouse hovered Column Value highlighted in blue color in the FontFamily dropdown");
		   	  									}else {
		   	  										fail(driver," Mouse hovered Column Value not highlighted in blue color in the FontFamily dropdown, Exp : "+Highlight_color_Exp+" Act : "+Highlight_Color_Act);
		   	  									}
		   	  								}
		   	  								if(TC_RADAR_LINE_CHART_STYLE_009.equals("Yes")) {
		   	  									setTestCaseID("TC_RADAR_LINE_ CHART_STYLE_009");
		   	  									ScrollBarValidation1(driver,ChartThemeResults,"Chart_Theme_RadarLine");
		   	  								}
		   	  								setTestCaseID(" ");
		   	  								if(verifyElementDisplayed(driver, dropdownInputsearchBox)) {
		   	  									if(TC_RADAR_LINE_CHART_STYLE_007.equals("Yes")) {
		   	  										setTestCaseID("TC_RADAR_LINE_ CHART_STYLE_007");
		   	  										click(driver,dropdownInputsearchBox);
		   	  										sendKeys(driver,dropdownInputsearchBox,"sdgffh");
		   	  										String inValidResult=getText1(driver,chartThemeFirstResult);
		   	  										if(inValidResult.equals("No results found")) {
		   	  											pass(driver,"'No results found' displayed when user enter incorrect chart theme");
		   	  										}else {
		   	  											fail(driver,"'No results found' not displayed when user enter incorrect chart theme");
		   	  										}
		   	  										clear1(driver,dropdownInputsearchBox);
		   	  									}
		   	  									if(TC_RADAR_LINE_CHART_STYLE_006.equals("Yes")) {
		   	  										setTestCaseID("TC_RADAR_LINE_ CHART_STYLE_006");
		   	  										sendKeys(driver,dropdownInputsearchBox,Change_ChartTheme_ChartStyle);
		   	  										List<WebElement> afterSearchResults=getWebElements(driver,chartThemeResultList);
		   	  										String resultText=getText1(driver,chartThemeFirstResult);
		   	  										if((afterSearchResults.size()==1)&&resultText.equals(Change_ChartTheme_ChartStyle)) {
		   	  											pass(driver,"Search input in the Chart Theme dropdown works properly");
		   	  										}else {
		   	  											fail(driver,"Search input in the Chart Theme dropdown not works properly");
		   	  										}
		   	  									}
		   	  									
		   	  									if(TC_RADAR_LINE_CHART_STYLE_010.equals("Yes")) {
		   	  										setTestCaseID("TC_RADAR_LINE_ CHART_STYLE_010");
		   	  										selectChartTheme(driver,Change_ChartTheme_ChartStyle);
		   	  										wait(driver,"1");
		   	  										if(isDisplayed2(driver,ChartThemeResults)) {
		   	  											fail(driver,"Chart theme dropdown not closed after select the Theme");
		   	  										}else {
		   	  											pass(driver,"Chart theme dropdown closed automatically after select the Theme");
		   	  										}
		   	  										String selectedThemeValue=getText1(driver,ChartThemeInput);
		   	  										if(selectedThemeValue.equals(Change_ChartTheme_ChartStyle)) {
		   	  											pass(driver,"Selected Theme value updated in the Chart Theme Input");
		   	  										}else {
		   	  											fail(driver,"Selected Theme value not updated in the Chart Theme Input");
		   	  										}  
		   	  									}
		   	  								}
		   	  							}
		   	  						}
		   	  						
		   	  						setTestCaseID("TS_ RADAR LINE_004");
		   	  						if(isDisplayed2(driver, X_ScrollInputSlider)) {
		   	  							if(TC_RADAR_LINE_CHART_STYLE_011.equals("Yes")) {
		   	  								setTestCaseID("TC_RADAR_LINE_ CHART_STYLE_011");
		   	  								if(isToggleEnable(driver,X_Scroll_toggle)) {
		   	  									fail(driver,"X Scroll toggle not disabled by default ");
		   	  								}else {
		   	  									pass(driver,"X Scroll toggle disabled by default ");
		   	  									if(!isDisplayed2(driver,X_Scroll_Bar)) {
		   	  										pass(driver,"X Scroll Bar is not displayed in the chart by default");
		   	  									}else {
		   	  										fail(driver,"X Scroll Bar is displayed in the chart by default");
		   	  									}
		   	  								}
		   	  							}
		   	  							
		   	  							if(TC_RADAR_LINE_CHART_STYLE_012.equals("Yes")) {
		   	  								setTestCaseID("TC_RADAR_LINE_ CHART_STYLE_012");
		   	  								click(driver,X_ScrollInputSlider);
		   	  								if(isToggleEnable(driver,X_Scroll_toggle)){
		   	  									pass(driver,"X Scroll toggle enabled when click on it");
		   	  									scrollUsingElement(driver, ApplyButton);
		   	  									click(driver,ApplyButton);
		   	  									elementnotvisible1(driver, Loading);
		   	  									elementnotvisible1(driver, RPE_Loading);
		   	  									verifyElementDisplayed(driver,ChartGraph);
		   	  									if(isDisplayed(driver,X_Scroll_Bar)) {
		   	  										pass(driver,"X Scroll Bar is displayed in the chart after enabling it");
		   	  									}else {
		   	  										fail(driver,"X Scroll Bar is not displayed in the chart after enabling it");
		   	  									}
		   	  								}else {
		   	  									fail(driver,"X Scroll toggle not enabled when click on it");
		   	  								}
		   	  							}
		   	  							
	   	  							}else {
	   	  								fail(driver,"X Scroll toggle is not present");
		   	  						}
		   	  						
		   	  						setTestCaseID("TS_ RADAR LINE_004");
		   	  						if(isDisplayed2(driver, Y_ScrollInputSlider)) {
		   	  							if(TC_RADAR_LINE_CHART_STYLE_013.equals("Yes")) {
		   	  								setTestCaseID("TC_RADAR_LINE_ CHART_STYLE_013");
		   	  								if(isToggleEnable(driver,Y_Scroll_toggle)) {
		   	  									fail(driver,"Y Scroll toggle not disabled by default ");
		   	  								}else {
		   	  									pass(driver,"Y Scroll toggle disabled by default ");
		   	  									if(!isDisplayed2(driver,Y_Scroll_Bar)) {
		   	  										pass(driver,"Y Scroll Bar is not displayed in the chart by default");
		   	  									}else {
		   	  										fail(driver,"Y Scroll Bar is displayed in the chart by default");
		   	  									}
		   	  								}
		   	  							}
		   	  							
		   	  							if(TC_RADAR_LINE_CHART_STYLE_014.equals("Yes")) {
		   	  								setTestCaseID("TC_RADAR_LINE_ CHART_STYLE_014");
		   	  								click(driver,Y_ScrollInputSlider);
		   	  								wait(driver,"1");
		   	  								if(isToggleEnable(driver,Y_Scroll_toggle)){
		   	  									pass(driver,"Y Scroll toggle enabled when enabling it");
		   	  									scrollUsingElement(driver, ApplyButton);
		   	  									click(driver,ApplyButton);
		   	  									elementnotvisible1(driver, RPE_Loading);
		   	  									verifyElementDisplayed(driver,ChartGraph);
		   	  									if(isDisplayed(driver,Y_Scroll_Bar)) {
		   	  										pass(driver,"Y Scroll Bar is displayed in the chart after enabling it");
		   	  									}else {
		   	  										fail(driver,"Y Scroll Bar is not displayed in the chart after enabling it");
		   	  									}
		   	  								}else {
		   	  									fail(driver,"Y Scroll toggle not enabled when enabling it");
		   	  								}
		   	  							}
	   	  							
		   	  						}else {
	   	  								fail(driver,"Y Scroll toggle is not present");
		   	  						}
		   	  						
		   	  						setTestCaseID("TS_ RADAR LINE_005");
		   	  						if(isDisplayed2(driver, EnableGrid_InputSlider)) {
		   	  							if(TC_RADAR_LINE_CHART_STYLE_015.equals("Yes")) {
		   	  								setTestCaseID("TC_RADAR_LINE_ CHART_STYLE_015");
		   	  								if(isToggleEnable(driver,EnableGrid_toggle)) {
		   	  									pass(driver,"By default, 'Enable Grid' toggle is enabled");
		   	  									if(isDisplayed(driver,Grid_Chart_RadarLine)) {
		   	  										pass(driver,"Grid is displayed in the chart when it is enable");
		   	  									}else {
		   	  										fail(driver,"Grid is not displayed in the chart when it is enable");
		   	  									}
		   	  								}else {
		   	  									fail(driver,"By default, 'Enable Grid' toggle is not enabled");
		   	  								}	
		   	  							}
		   	  							
		   	  							if(TC_RADAR_LINE_CHART_STYLE_016.equals("Yes")) {
		   	  								setTestCaseID("TC_RADAR_LINE_ CHART_STYLE_016");
		   	  								click(driver,EnableGrid_InputSlider);
		   	  								wait(driver,"1");
		   	  								if(isToggleEnable(driver,EnableGrid_toggle)){
		   	  									fail(driver,"'Enable Grid' toggle not disabled when click on it ");
		   	  								}else {
		   	  									pass(driver,"'Enable Grid' toggle disabled when click on it ");
		   	  									scrollUsingElement(driver, ApplyButton);
		   	  									click(driver,ApplyButton);
		   	  									elementnotvisible1(driver, Loading);
		   	  									elementnotvisible1(driver, RPE_Loading);
		   	  									verifyElementDisplayed(driver,ChartGraph);
		   	  									if(isDisplayed(driver,Grid_Chart_RadarLine)) {
		   	  										fail(driver,"Grid is displayed in the chart when it is disable");
		   	  									}else {
		   	  										pass(driver,"Grid is not displayed in the chart when it is disable");
		   	  									}
		   	  								}
		   	  							}
		   	  						}else {
		   	  							fail(driver,"Enable Grid toggle is not present");
		   	  						}
		   	  						
		   	  						if(TC_RADAR_LINE_CHART_STYLE_017.equals("Yes")) {
		   	  							setTestCaseID("TC_RADAR_LINE_ CHART_STYLE_017");
		   	  							click(driver,ChartStyling);
		   	  							wait(driver,"1");
		   	  							String chartStyleClose_Act=getAttribute1(driver, ChartStyling_Expand, "class");
		   	  							if(chartStyleClose_Act.contains("down")) {
		   	  								pass(driver,"Chart styling gets collapsed when click on it");
		   	  							}else {
		   	  								fail(driver,"Chart styling not gets collapsed when click on it");
		   	  							}
		   	  						}
		   	  					}//chart style expand
		   	  				}	
			    		 }else {
			    		   fail(driver,"Chart Format is not expanded when clicking the Chart Format");
			    		 }
			    	 }
			    	 
			     }
			   // ******************** Chart Style Validation Start *******************
			     setTestCaseID("");
			  // ********************Legend Validation Start *******************
				 String Radar_Line_ChartFormat_Legend= getCellValue("TestExecution","Testcase_Selection","Radar_Line_ChartFormat_Legend",Flag);
			     if(Radar_Line_ChartFormat_Legend.equals("Yes")) {

			    	 String TC_RADAR_LINE_LEGEND_001=getTestcaseID_Flag(TestcaseFileName,SheetName_Legend,TescasesID_Column,"TC_ RADAR LINE_001",TestcaseID_Flag);
			    	 String TC_RADAR_LINE_LEGEND_002=getTestcaseID_Flag(TestcaseFileName,SheetName_Legend,TescasesID_Column,"TC_ RADAR LINE_002",TestcaseID_Flag);
			    	 String TC_RADAR_LINE_LEGEND_003=getTestcaseID_Flag(TestcaseFileName,SheetName_Legend,TescasesID_Column,"TC_ RADAR LINE_003",TestcaseID_Flag);
			    	 String TC_RADAR_LINE_LEGEND_004=getTestcaseID_Flag(TestcaseFileName,SheetName_Legend,TescasesID_Column,"TC_ RADAR LINE_004",TestcaseID_Flag);
			    	 String TC_RADAR_LINE_LEGEND_005=getTestcaseID_Flag(TestcaseFileName,SheetName_Legend,TescasesID_Column,"TC_ RADAR LINE_005",TestcaseID_Flag);
			    	 String TC_RADAR_LINE_LEGEND_006=getTestcaseID_Flag(TestcaseFileName,SheetName_Legend,TescasesID_Column,"TC_ RADAR LINE_006",TestcaseID_Flag);
			    	 String TC_RADAR_LINE_LEGEND_007=getTestcaseID_Flag(TestcaseFileName,SheetName_Legend,TescasesID_Column,"TC_ RADAR LINE_007",TestcaseID_Flag);
			    	 String TC_RADAR_LINE_LEGEND_008=getTestcaseID_Flag(TestcaseFileName,SheetName_Legend,TescasesID_Column,"TC_ RADAR LINE_008",TestcaseID_Flag);
			    	 String TC_RADAR_LINE_LEGEND_009=getTestcaseID_Flag(TestcaseFileName,SheetName_Legend,TescasesID_Column,"TC_ RADAR LINE_009",TestcaseID_Flag);
			    	 String TC_RADAR_LINE_LEGEND_010=getTestcaseID_Flag(TestcaseFileName,SheetName_Legend,TescasesID_Column,"TC_ RADAR LINE_010",TestcaseID_Flag);
			    	 String TC_RADAR_LINE_LEGEND_011=getTestcaseID_Flag(TestcaseFileName,SheetName_Legend,TescasesID_Column,"TC_ RADAR LINE_011",TestcaseID_Flag);
			    	 String TC_RADAR_LINE_LEGEND_012=getTestcaseID_Flag(TestcaseFileName,SheetName_Legend,TescasesID_Column,"TC_ RADAR LINE_012",TestcaseID_Flag);
			    	 String TC_RADAR_LINE_LEGEND_013=getTestcaseID_Flag(TestcaseFileName,SheetName_Legend,TescasesID_Column,"TC_ RADAR LINE_013",TestcaseID_Flag);
			    	 String TC_RADAR_LINE_LEGEND_014=getTestcaseID_Flag(TestcaseFileName,SheetName_Legend,TescasesID_Column,"TC_ RADAR LINE_014",TestcaseID_Flag);

			    	 if(verifyElementDisplayed(driver, Legend_)) {
			    		 if(TC_RADAR_LINE_LEGEND_001.equals("Yes")) {
				    		 setTestCaseID("TC_RADAR_LINE_ LEGEND_001");
				    		 String LegendSecExpand=getAttribute1(driver, Legends_Expand, "class");
				    		 if(!LegendSecExpand.contains("up")) {
				    			 fail(driver,"By default, Legends not gets Expanded");
				    		 }else {
				    			 pass(driver,"By default, Legends gets Expanded");
				    			 if(TC_RADAR_LINE_LEGEND_002.equals("Yes")) {
						    		 setTestCaseID("TC_RADAR_LINE_ LEGEND_002");
						    		 verifyElementDisplayed(driver,Legend_Text);
						    		 verifyElementDisplayed(driver, Legend_InputToggle);

						    		 verifyElementDisplayed(driver,LegendPosition_Text);
						    		 verifyElementDisplayed(driver,LegendPosition_Input);
						         
						    		 verifyElementDisplayed(driver,LegendFontSize_Text);
						    		 verifyElementDisplayed(driver,LegendFontSize_Input);
				    			 }
				    			 
				    			 if(TC_RADAR_LINE_LEGEND_003.equals("Yes")) {
						    		 setTestCaseID("TC_RADAR_LINE_ LEGEND_003");
						    		 if(!isToggleEnable(driver, Legend_Input)) {
						    			 fail(driver,"By default, Legend Toggle is not selected ");
						    		 }else {
						    			 pass(driver,"By default, Legend Toggle is selected ");
						    			 if(isDisplayed2(driver,Legend_Chart)) {
						    				 pass(driver,"Legend Values is displayed in the chart by default");
						    			 }else {
						    				 fail(driver,"Legend Values is not displayed in the chart by default");
						    			 }
						    		 }
				    			 }
				    			 
				    			 if(TC_RADAR_LINE_LEGEND_005.equals("Yes")) {
						    		 setTestCaseID("TC_RADAR_LINE_ LEGEND_005");
						    		 click(driver,Legend_InputToggle);
						    		 wait(driver,"1");
						    		 if(!isToggleEnable(driver, Legend_Input)) {
						    			 pass(driver,"'Legend toggle is deSelected when click on it");
						    			 scrollUsingElement(driver, ApplyButton);
						    			 click(driver,ApplyButton);
						    			 elementnotvisible1(driver, RPE_Loading);
						    			 verifyElementDisplayed(driver,ChartGraph);
						    			 if(!isDisplayed(driver, Legend_Chart)) {
						    				 pass(driver,"Legend is not displayed in chart when it is disable");
						    			 }else {
						    				 fail(driver,"Legend is displayed in chart when it is disable");
						    			 }
						    			 if(TC_RADAR_LINE_LEGEND_004.equals("Yes")) {
								    		 setTestCaseID("TC_RADAR_LINE_ LEGEND_004");
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
						    			 }
						    			 
						    		 }else {
						    			 fail(driver,"'Legend toggle is not deSelected when click on it"); 
						    		 }
				    			 }
				    			 
				    			 setTestCaseID("");
				    			 if(TC_RADAR_LINE_LEGEND_005.equals("Yes")) {
				    				 click(driver,Legend_InputToggle);
						    		 wait(driver,"1");
						    		 if(isToggleEnable(driver, Legend_Input)) {
						    			 pass(driver,"'Legend toggle is enabled when enabling it");
						    		 }else {
						    			 fail(driver,"'Legend toggle is not enabled when enabling it");
						    		 }
						    		 scrollUsingElement(driver, ApplyButton);
					    			 click(driver,ApplyButton);
					    			 elementnotvisible1(driver, RPE_Loading);
				    			 }
				    			 
				    			 if(TC_RADAR_LINE_LEGEND_006.equals("Yes")) {
						    		 setTestCaseID("TC_RADAR_LINE_ LEGEND_006");
						    		 if(IsElementEnabled(driver, LegendPosition_Input)) {
					    				 pass(driver,"Legend Position Input is Accessible when the Legend Toggle is Enable");
					    				 click(driver,LegendPosition_Input);
					    				 verifyElementIsPresent1(driver, LegendPosition_Options);
					    				 if(TC_RADAR_LINE_LEGEND_007.equals("Yes")) {
								    		 setTestCaseID("TC_RADAR_LINE_ LEGEND_007");
								    		 String defaultPosition_Legend=defaultSelectedValue(driver, LegendPosition_Input);
						    				 if(Default_Legend_Position.equals(defaultPosition_Legend)) {
						    					 pass(driver,"By default, '"+Default_Legend_Position+"' is selected in the Legend Positon input");
						    				 }else {
						    					 fail(driver,"By default, '"+Default_Legend_Position+"' is not selected in the Legend Positon input");
						    				 }
						    				 scrollUsingElement(driver, ApplyButton);
							    			 click(driver,ApplyButton);
							    			 elementnotvisible1(driver, RPE_Loading);
						    				String defaultLegend_chart= getRelativePosition(driver,Legend_Chart_Value,Chart_Section_Display);
						    				if(defaultLegend_chart.equals(Default_Legend_Position)) {
						    					pass(driver,"By default, the legend is displayed in '"+Default_Legend_Position+"' in the chart");
						    				}else {
						    					fail(driver,"By default, the legend is not displayed in '"+Default_Legend_Position+"' in the chart");
						    				}
					    				 }
					    				 
					    				 if(TC_RADAR_LINE_LEGEND_008.equals("Yes")) {
								    		 setTestCaseID("TC_RADAR_LINE_ LEGEND_008");
								    		 selectByText(driver, LegendPosition_Input, "Top");
								    		 scrollUsingElement(driver, ApplyButton);
								    		 click(driver,ApplyButton);
								    		 elementnotvisible1(driver, RPE_Loading);
								    		 if(verifyElementDisplayed(driver,ChartGraph)) {
								    			 String LegendPosition_chart= getRelativePosition(driver,Legend_Chart_Value,X_Value_RadarChart);
								    			 if(LegendPosition_chart.equals("Top")) {
								    				 pass(driver,"Legend is displayed in 'Top' position in the chart ");
								    			 }else {
								    				 fail(driver,"Legend is not displayed in 'Top' position in the chart , LegendPosition_chart : "+LegendPosition_chart);
								    			 } 
								    		 }
					    				 }
					    				
					    				 if(TC_RADAR_LINE_LEGEND_009.equals("Yes")) {
								    		 setTestCaseID("TC_RADAR_LINE_ LEGEND_009");
								    		 selectByText(driver, LegendPosition_Input, "Right");
								    		 scrollUsingElement(driver, ApplyButton);
								    		 click(driver,ApplyButton);
								    		 elementnotvisible1(driver, RPE_Loading);
								    		 if(verifyElementDisplayed(driver,ChartGraph)) {
								    			 String LegendPosition_chart= getRelativePosition(driver,Legend_Chart_Value,X_Value_RadarChart);
								    			 if(LegendPosition_chart.equals("Right")) {
								    				 pass(driver,"Legend is displayed in 'Right' position in the chart ");
								    			 }else {
								    				 fail(driver,"Legend is not displayed in 'Right' position in the chart ,LegendPosition_chart : "+LegendPosition_chart);
								    			 } 
								    		 }
					    				 }
					    				 
					    				 if(TC_RADAR_LINE_LEGEND_010.equals("Yes")) {
								    		 setTestCaseID("TC_RADAR_LINE_ LEGEND_010");
								    		 selectByText(driver, LegendPosition_Input, "Left");
								    		 scrollUsingElement(driver, ApplyButton);
								    		 click(driver,ApplyButton);
								    		 elementnotvisible1(driver, RPE_Loading);
								    		 if(verifyElementDisplayed(driver,ChartGraph)) {
								    			 String LegendPosition_chart= getRelativePosition(driver,Legend_Chart_Value,X_Value_RadarChart);
								    			 if(LegendPosition_chart.equals("Left")) {
								    				 pass(driver,"Legend is displayed in 'Left' position in the chart ");
								    			 }else {
								    				 fail(driver,"Legend is not displayed in 'Left' position in the chart, LegendPosition_chart : "+LegendPosition_chart);
								    			 } 
								    		 }
					    				 }
					    			 }else {
					    				 fail(driver,"Legend Position Input is InAccessible when the Legend Toggle is Enable");
					    			 }
				    			 }
				    			 
				    			 setTestCaseID("TS_RADAR_LINE_ LEGEND_004");
				    			 if(isDisplayed(driver, LegendFontSize_Input)) {
				    				 if(TC_RADAR_LINE_LEGEND_011.equals("Yes")) {
							    		 setTestCaseID("TC_RADAR_LINE_ LEGEND_011");
							    		 String defaultFontSize_Legend=defaultSelectedValue(driver, LegendFontSize_Input);
					    				 if(Default_Legend_FontSize.equals(defaultFontSize_Legend)) {
					    					 pass(driver,"By default, '"+Default_Legend_FontSize+"' is selected in the Legend Font Size input");
					    				 }else {
					    					 fail(driver,"By default, '"+Default_Legend_FontSize+"' is not selected in the Legend Font Size input");
					    				 }
					    			 }
				    				 
				    				 if(TC_RADAR_LINE_LEGEND_012.equals("Yes")) {
							    		 setTestCaseID("TC_RADAR_LINE_ LEGEND_012");
							    		 if(IsElementEnabled(driver, LegendFontSize_Input)) {
						    				 pass(driver,"Legend FontSize Input is Accessible when the Legend Toggle is Enable");
						    				 click(driver,LegendFontSize_Input);
						    				 if(TC_RADAR_LINE_LEGEND_013.equals("Yes")) {
									    		 setTestCaseID("TC_RADAR_LINE_ LEGEND_013");
									    		 selectByText(driver, LegendFontSize_Input, Change_Legend_FontSize);
									    		 scrollUsingElement(driver, ApplyButton);
									    		 click(driver,ApplyButton);
									    		 elementnotvisible1(driver, RPE_Loading);
									    		 if(verifyElementDisplayed(driver,ChartGraph)) {
									    			 String FontSizeLegend_chart=getFontSize(driver, Legend_Chart_Value);
										    		 if(Change_Legend_FontSize.equals(FontSizeLegend_chart)) {
										    			 pass(driver,"Selected'"+Change_Legend_FontSize+"' fontsize is applied in the Legend in the chart");
										    		 }else {
										    			 fail(driver,"Selected '"+Change_Legend_FontSize+"' fontsize is not applied in the Legend in the chart");
										    		 }
									    		 }
						    				 }
						    				 
							    		 }else {
							    			 fail(driver,"Legend FontSize Input is not Accessible when the Legend Toggle is Enable");
							    		 }
				    				 }
				    				 
				    			 }else {
				    				 fail(driver,"Legend Font Size is not present");
				    			 }
				    			 
				    			 
				    			 if(TC_RADAR_LINE_LEGEND_014.equals("Yes")) {
						    		 setTestCaseID("TC_RADAR_LINE_ LEGEND_014");
						    		 mouseOverAndClick(driver, Legend_);
						    		 String LegendClose_Act=getAttribute1(driver, Legends_Expand, "class");
						    		 if(LegendClose_Act.contains("down")) {
						    			 pass(driver,"Legends gets collapsed when click on it");
						    		 }else {
						    			 fail(driver,"Legends not gets collapsed when click on it");
						    		 }
				    			 }
				    		 }	
				    	 }
			    	 }
			    	 
			     }
			  // ******************** Legend Validation Start *******************
			     
			  // ********************Others Validation Start *******************
				 String Radar_Line_ChartFormat_Others= getCellValue("TestExecution","Testcase_Selection","Radar_Line_ChartFormat_Others",Flag);
			     if(Radar_Line_ChartFormat_Others.equals("Yes")) {
			    	 String TC_RADAR_LINE_OTHERS_001=getTestcaseID_Flag(TestcaseFileName,SheetName_Others,TescasesID_Column,"TC_ RADAR LINE_001",TestcaseID_Flag);
			    	 String TC_RADAR_LINE_OTHERS_002=getTestcaseID_Flag(TestcaseFileName,SheetName_Others,TescasesID_Column,"TC_ RADAR LINE_002",TestcaseID_Flag);
			    	 String TC_RADAR_LINE_OTHERS_003=getTestcaseID_Flag(TestcaseFileName,SheetName_Others,TescasesID_Column,"TC_ RADAR LINE_003",TestcaseID_Flag);
			    	 String TC_RADAR_LINE_OTHERS_004=getTestcaseID_Flag(TestcaseFileName,SheetName_Others,TescasesID_Column,"TC_ RADAR LINE_004",TestcaseID_Flag);
			    	 String TC_RADAR_LINE_OTHERS_005=getTestcaseID_Flag(TestcaseFileName,SheetName_Others,TescasesID_Column,"TC_ RADAR LINE_005",TestcaseID_Flag);
			    	 String TC_RADAR_LINE_OTHERS_006=getTestcaseID_Flag(TestcaseFileName,SheetName_Others,TescasesID_Column,"TC_ RADAR LINE_006",TestcaseID_Flag);

			    	 
			    	 if(verifyElementDisplayed(driver, ChartFormat_Others)) {
			    		 if(TC_RADAR_LINE_OTHERS_001.equals("Yes")) {
				    		 setTestCaseID("TC_RADAR_LINE_ OTHERS_001");
				    		 String OthersExpand=getAttribute1(driver, ChartFormat_OthersExpand, "class");
				    		 if(!OthersExpand.contains("up")) {
				    			fail(driver,"By default, 'Others' not gets Expand");
				    		 }else {
				    			pass(driver,"By default, 'Others' gets Expanded");
				    			if(TC_RADAR_LINE_OTHERS_002.equals("Yes")) {
						    		 setTestCaseID("TC_RADAR_LINE_ OTHERS_002");
						    		 verifyElementDisplayed(driver,Cursor_text);
						    		 verifyElementIsPresent1(driver, Cursor_Input);
						    		
						    		 verifyElementDisplayed(driver,Export_text);
						    		 verifyElementIsPresent1(driver, Export_Input);
				    			}
				    			
				    			setTestCaseID("TS_RADAR_LINE_ OTHERS_002");
				    			if(isDisplayed2(driver,Export_InputClick)) {
				    				if(TC_RADAR_LINE_OTHERS_003.equals("Yes")) {
							    		 setTestCaseID("TC_RADAR_LINE_ OTHERS_003");
							    		 if(isToggleEnable(driver,Export_Input)) {		
							     	  		 fail(driver,"'Export Input' enable by default");
							    		 }else {
							    			 pass(driver,"'Export Input' disable by default"); 
							    		 }
							      		
							      		 if(isDisplayed2(driver,ExportChartOptions)) {
							     	  		 fail(driver,"'Export Options' is displayed in charts when Export chart is disabled"); 
							     		 }else {
							     	  		 pass(driver,"'Export Options' not displayed in charts when Export chart is disabled"); 
							     		 }
					    			}
				    				
				    				if(TC_RADAR_LINE_OTHERS_004.equals("Yes")) {
							    		 setTestCaseID("TC_RADAR_LINE_ OTHERS_004");
							    		 click(driver,Export_InputClick);
							    		 if(!isToggleEnable(driver,Export_Input)) {		
							    			 fail(driver,"'Export Input' not enabled while enabling it"); 
							    		 }else {
							    			 pass(driver,"'Export Input' is enabled while enabling it");
							    			 scrollUsingElement(driver, ApplyButton);
								    		 click(driver,ApplyButton);
								    		 elementnotvisible1(driver, RPE_Loading);
								    		 if(verifyElementDisplayed(driver,Chart_Section)) {
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
							    		 }
				    				}
				    				
				    			}else {
				    				fail(driver,"Export toggle is not present");
				    			}
				    			
				    			
				    			setTestCaseID("TS_RADAR_LINE_ OTHERS_002");
				    			if(isDisplayed2(driver,Cursor_InputClick)) {
				    				if(TC_RADAR_LINE_OTHERS_005.equals("Yes")) {
							    		 setTestCaseID("TC_RADAR_LINE_ OTHERS_005");
							    		 if(!isToggleEnable(driver,Cursor_Input)) {		
							    			 fail(driver,"'Cursor Input toggle' is disabled by default"); 
								   		 }else {
								   	  		 pass(driver,"'Cursor Input toggle' is enabled by default"); 
								   	  		 mouseOverToElement(driver, ChartGraph);
								   	  		 if(isDisplayed2(driver,MouseCursor)) {
								   	  			 pass(driver,"Cursor is displayed in chart when cursor is enable"); 
								   	  		 }else {
								   	  			 fail(driver,"Cursor is not displayed in chart when cursor is enable");  
								   	  		 }
								   		 }
				    				}
				    				
				    				if(TC_RADAR_LINE_OTHERS_006.equals("Yes")) {
							    		 setTestCaseID("TC_RADAR_LINE_ OTHERS_006");
							    		 click(driver,Cursor_InputClick);
							    		 if(isToggleEnable(driver,Cursor_Input)) {		
							   	  		 	fail(driver,"'Cursor Input' is not disable while click on it"); 
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
				    				}
				    				
				    			}else {
				    				fail(driver,"Cursor toggle is not present");
				    			}
				    			
				    			
				    		 }
				    		 
			    		 }
			    	 }
			     }
			  // ********************Others Validation End *******************
			 }
		}//click widget
		
	}
	
}
