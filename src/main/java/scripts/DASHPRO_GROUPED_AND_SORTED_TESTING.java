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

public class DASHPRO_GROUPED_AND_SORTED_TESTING extends Keywords{

	public void groupedAndSortedTesting(WebDriver driver,int iteration, String Flag) {
		
		String TestcaseFileName="DASHPRO_GROUP_AND_SORTED";
		String SheetName_Axes="GROUPED_AND_SORTED_AXES";
		String SheetName_AxisTitle="GROUPED_AND_SORTED_AXIS_TITLE";
		String SheetName_ChartStyle="GROUPED_AND_SORTED_CHART_STYLE";
		String SheetName_DataLabels="GROUPED_AND_SORTED_DATA_LABEL";
		String SheetName_Others="GROUPED_AND_SORTED_OTHERS";
		String TestcaseID_Flag="Flag";
		String TescasesID_Column="TEST CASE ID";
		//Yes/No Input for Testcases Id
		String TC_GROUPEDANDSORTED_001=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ GROUPEDANDSORTED_001",TestcaseID_Flag);
		String TC_GROUPEDANDSORTED_002=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ GROUPEDANDSORTED_002",TestcaseID_Flag);
		String TC_GROUPEDANDSORTED_003=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ GROUPEDANDSORTED_003",TestcaseID_Flag);
		String TC_GROUPEDANDSORTED_004=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ GROUPEDANDSORTED_004",TestcaseID_Flag);
		String TC_GROUPEDANDSORTED_005=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ GROUPEDANDSORTED_005",TestcaseID_Flag);
		String TC_GROUPEDANDSORTED_006=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ GROUPEDANDSORTED_006",TestcaseID_Flag);
		String TC_GROUPEDANDSORTED_007=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ GROUPEDANDSORTED_007",TestcaseID_Flag);
		String TC_GROUPEDANDSORTED_008=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ GROUPEDANDSORTED_008",TestcaseID_Flag);
		String TC_GROUPEDANDSORTED_009=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ GROUPEDANDSORTED_009",TestcaseID_Flag);
		String TC_GROUPEDANDSORTED_010=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ GROUPEDANDSORTED_010",TestcaseID_Flag);
		String TC_GROUPEDANDSORTED_011=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ GROUPEDANDSORTED_011",TestcaseID_Flag);
		String TC_GROUPEDANDSORTED_012=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ GROUPEDANDSORTED_012",TestcaseID_Flag);
		String TC_GROUPEDANDSORTED_013=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ GROUPEDANDSORTED_013",TestcaseID_Flag);
		String TC_GROUPEDANDSORTED_014=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ GROUPEDANDSORTED_014",TestcaseID_Flag);
		String TC_GROUPEDANDSORTED_015=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ GROUPEDANDSORTED_015",TestcaseID_Flag);
		String TC_GROUPEDANDSORTED_016=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ GROUPEDANDSORTED_016",TestcaseID_Flag);
		String TC_GROUPEDANDSORTED_017=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ GROUPEDANDSORTED_017",TestcaseID_Flag);
		String TC_GROUPEDANDSORTED_018=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ GROUPEDANDSORTED_018",TestcaseID_Flag);
		String TC_GROUPEDANDSORTED_019=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ GROUPEDANDSORTED_019",TestcaseID_Flag);
		String TC_GROUPEDANDSORTED_020=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ GROUPEDANDSORTED_020",TestcaseID_Flag);
		String TC_GROUPEDANDSORTED_021=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ GROUPEDANDSORTED_021",TestcaseID_Flag);
		String TC_GROUPEDANDSORTED_022=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ GROUPEDANDSORTED_022",TestcaseID_Flag);
		String TC_GROUPEDANDSORTED_023=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ GROUPEDANDSORTED_023",TestcaseID_Flag);
		String TC_GROUPEDANDSORTED_024=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ GROUPEDANDSORTED_024",TestcaseID_Flag);
		String TC_GROUPEDANDSORTED_025=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ GROUPEDANDSORTED_025",TestcaseID_Flag);
		String TC_GROUPEDANDSORTED_026=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ GROUPEDANDSORTED_026",TestcaseID_Flag);
		String TC_GROUPEDANDSORTED_027=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ GROUPEDANDSORTED_027",TestcaseID_Flag);
		String TC_GROUPEDANDSORTED_028=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ GROUPEDANDSORTED_028",TestcaseID_Flag);
		String TC_GROUPEDANDSORTED_029=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ GROUPEDANDSORTED_029",TestcaseID_Flag);
		String TC_GROUPEDANDSORTED_030=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ GROUPEDANDSORTED_030",TestcaseID_Flag);
		String TC_GROUPEDANDSORTED_031=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ GROUPEDANDSORTED_031",TestcaseID_Flag);
		String TC_GROUPEDANDSORTED_032=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ GROUPEDANDSORTED_032",TestcaseID_Flag);
		String TC_GROUPEDANDSORTED_033=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ GROUPEDANDSORTED_033",TestcaseID_Flag);
		String TC_GROUPEDANDSORTED_034=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ GROUPEDANDSORTED_034",TestcaseID_Flag);
		String TC_GROUPEDANDSORTED_035=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ GROUPEDANDSORTED_035",TestcaseID_Flag);
		String TC_GROUPEDANDSORTED_036=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ GROUPEDANDSORTED_036",TestcaseID_Flag);
		String TC_GROUPEDANDSORTED_037=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ GROUPEDANDSORTED_037",TestcaseID_Flag);

		//Default inputs
		String AxesColor_Exp=Utils.getDataFromTestData("Axes", "Axes_Color_Exp");
		String default_FontFamily=Utils.getDataFromTestData("AxisTitle", "default_FontFamily");
		String Highlight_color_Exp=Utils.getDataFromTestData("Axes", "HighlightColor");
		String default_FontSize_Exp=Utils.getDataFromTestData("AxisTitle", "default_FontSize");
		String RotationInputColor_Exp=Utils.getDataFromTestData("AxisTitle", "RotationInput_Color");
		String defaultRotation=Utils.getDataFromTestData("AxisTitle", "default_Rotation_Value");
		String DefaultThemeValue_Exp=Utils.getDataFromTestData("ChartFormat_ChartStyle", "defaultThemeValue_Exp");
		String Highlight_ColorStyle_Exp=Utils.getDataFromTestData("ChartFormat_ChartStyle", "HighlightColor_Exp");
		String Default_X_Label_Position_Column=Utils.getDataFromTestData("SmokeTesting_UI", "Default_X_Label_Position_Column");
		String Default_Grid_distance_Column=Utils.getDataFromTestData("SmokeTesting_UI", "Default_Grid_distance_Column");
		String DefaultFormatValue_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DefaultFormatValue");
		String DefaultSeperatorValue_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DefaultSeperatorValue");
		String DefaultFontSizeValue_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DefaultFontSizeValue");
		String DefaultRoundOffValue_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DefaultRoundOffValue");
		String DefaultRotationValue_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DefaultRotationValue");
		String DefaultPositionValue_DataLabel=Utils.getDataFromTestData("Grouped_And_Sorted", "DefaultPositionValue_DataLabel");
		
		//Iteration inputs
		String Select_Categories_Value=Utils.getDataFromTestDataIteration(iteration,"Grouped_And_Sorted_Widget_Testing", "Select_Categories_Value");
		String Select_Series_Value=Utils.getDataFromTestDataIteration(iteration,"Grouped_And_Sorted_Widget_Testing", "Select_Series_Value");
		String Select_Agg_Value=Utils.getDataFromTestDataIteration(iteration,"Grouped_And_Sorted_Widget_Testing", "Select_Agg_Value");
		String Select_SortBy_Value=Utils.getDataFromTestDataIteration(iteration,"Grouped_And_Sorted_Widget_Testing", "Select_SortBy_Value");
		
		//Chart title
 		String TypeBackgroundColor1_ChartTitle=Utils.getDataFromTestDataIteration(iteration,"Grouped_And_Sorted_Widget_Testing", "TypeBackgroundColor1_ChartTitle");
 		String TypeTextColor1_ChartTitle=Utils.getDataFromTestDataIteration(iteration,"Grouped_And_Sorted_Widget_Testing", "TypeTextColor1_ChartTitle");
 		String Change_FontFamily_ChartTitle=Utils.getDataFromTestDataIteration(iteration,"Grouped_And_Sorted_Widget_Testing", "Change_FontFamily_ChartTitle");
 		String ChangeFontSize_ChartTitle=Utils.getDataFromTestDataIteration(iteration,"Grouped_And_Sorted_Widget_Testing", "ChangeFontSize_ChartTitle");
 		String ChangeChartTitleName=Utils.getDataFromTestDataIteration(iteration,"Grouped_And_Sorted_Widget_Testing", "ChangeChartTitleName");
	 	
		setTestCaseID(" ");
		Actions action=new Actions(driver);
		mouseOverToElement(driver, ADDTabPlus);
  	    mouseOverAndClick(driver, ADDTabPlus);
  	    wait(driver,"1");
  	    sendKeys(driver,newlyAddedTab,"GroupedAndSorted_Test");
  	    click(driver,DashProPage);
  	    elementnotvisible1(driver, RPE_Loading);
		waitForElement(driver,ADD_widget_rightTop);
	    click(driver,ADD_widget_rightTop);
	    elementnotvisible(driver,Loading);
	    elementnotvisible1(driver, RPE_Loading);
		waitForElement(driver,WidgetPanel);
		waitForElement(driver,Sparkline_widget);
		
		if(TC_GROUPEDANDSORTED_001.equals("Yes")) {
			setTestCaseID("TC_GROUPEDANDSORTED_ AXES_001");
			waitForElement(driver,GroupandSorted_widget);
			verifyElementDisplayed(driver, GroupandSorted_widget);
		}
		
		if(TC_GROUPEDANDSORTED_002.equals("Yes")) {
			setTestCaseID("TC_GROUPEDANDSORTED_ AXES_002");
			WidgetValidation(driver,GroupandSorted_widget,"Grouped and Sorted");
		}
		
		if(TC_GROUPEDANDSORTED_003.equals("Yes")) {
			setTestCaseID("TC_GROUPEDANDSORTED_ AXES_003");
			click(driver,GroupandSorted_widget);
			if(isDisplayed2(driver,error)){
				 String errorWidget=getText1(driver,error);
				 if(errorWidget.contains("Please refer the logs in Logs")) {
					 fail(driver,"Error displayed When click Grouped and Sorted Widget, Validation : "+errorWidget);
				 }else {
					 pass(driver,"Error displayed When click Grouped and Sorted Widget, Validation : "+errorWidget);
				 }
				 elementnotvisible1(driver, error);
			 }else {
				 elementnotvisible1(driver, Loading);
				 String widgetValue=getText1(driver,WidgetValue);
				 if(widgetValue.equals("Grouped and Sorted")) {
					 pass(driver,"'Grouped and Sorted' displayed as the selected Widget after click on it");
				 }else {
					 fail(driver,"'Grouped and Sorted' not displayed as the selected Widget after click on it, Act text : "+widgetValue);
				 }
				 
				 if(TC_GROUPEDANDSORTED_004.equals("Yes")) {
					 setTestCaseID("TC_GROUPEDANDSORTED_ AXES_004");
					 String AxesExpand=getAttribute1(driver,Axes_Expand,"class");
					 if(!AxesExpand.contains("up")) {
						 fail(driver,"By default, Axes Section is not Expanded");
					 }else{
						 pass(driver,"By default, Axes Section is Expanded");
						 String AxesTextColor_Act=getTextColor(driver,Axes);
						 if(AxesColor_Exp.equalsIgnoreCase(AxesTextColor_Act)) {
							 pass(driver," 'Axes' highlighted in blue color");
						 }else {
							 fail(driver," 'Axes' not highlighted in blue color");
						 }
						 
						 if(TC_GROUPEDANDSORTED_005.equals("Yes")) {
							 setTestCaseID("TC_GROUPEDANDSORTED_ AXES_005");
							 String default_Series_Act=getText1(driver,Series_Input);
							 if(default_Series_Act.equals("Select")) {
								 pass(driver,"By Default 'Select' is selected in the Series value input");
							 }else {
								 fail(driver,"By Default 'Select' is not selected in the Series value input");
							 }
						 }
						 
						 if(TC_GROUPEDANDSORTED_006.equals("Yes")) {
							 setTestCaseID("TC_GROUPEDANDSORTED_ AXES_006");
							 scrollUsingElement(driver, ApplyButton);
							 click(driver,ApplyButton);
							 if(isDisplayed2(driver,Categories_error)) {
								 pass(driver,"'Kindly select atleast one column for categories' error is displayed When Click Apply button without providing inputs");
							 }else {
								 fail(driver,"'Kindly select atleast one category' error is not displayed When Click Apply button without providing inputs");
							 }	
							 elementnotvisible1(driver, Categories_error);
						 }
						
						 if(TC_GROUPEDANDSORTED_007.equals("Yes")) {
							 setTestCaseID("TC_GROUPEDANDSORTED_ AXES_007");
							 if(IsElementEnabled(driver, Categories_Input)) {
								 click(driver,Categories_Input);
								 if(isDisplayed2(driver,Categories_DropdownExpand)) {
									 pass(driver,"Categories dropdown is expanded after click on it ");
									 if(TC_GROUPEDANDSORTED_008.equals("Yes")) {
										 setTestCaseID("TC_GROUPEDANDSORTED_ AXES_008");
										 List<WebElement> displayedDataImage=getWebElements(driver, dataTypeImages);
										 boolean categorical=true;
										 for(WebElement dataImag:displayedDataImage) {
											 action.moveToElement(dataImag).build().perform();
											 String dataTypeDisplay=dataImag.getAttribute("src");
											 if(dataTypeDisplay.contains("Categorical")) {
												 
											 }else {
												 fail(driver,"Other than Categorical datatype column is displayed in the Categories dropdown");
												 categorical=false;
												 break;
											 }
										 }
										 if(categorical) {
											 pass(driver, "Only Categorical datatype column is displayed in the Categories dropdown");
										 }
									 }
									 
									 if(TC_GROUPEDANDSORTED_009.equals("Yes")) {
										 setTestCaseID("TC_GROUPEDANDSORTED_ AXES_009");
										 String Categorical1=getText1(driver,CategoricalColumnAxisDropdown);
										 if(Categorical1.contains("(")) {
											 pass(driver,"Unique values are displayed in the Categorical Column in the Categories dropdown");
										 }else {
											 fail(driver,"Unique values are not displayed in the Categorical Column in the Categories dropdown");
										 }
									 }
									 
									 if(TC_GROUPEDANDSORTED_012.equals("Yes")){
										 setTestCaseID("TC_GROUPEDANDSORTED_ AXES_012");
										 List<WebElement> AvailableList_Categories_Axis=getWebElements(driver, AvailableList_Dropdown);
										 int columnListCount=AvailableList_Categories_Axis.size();
											if(columnListCount>5) {
												for (int k=0;k<=5;k++) {
													WebElement availableColumn=AvailableList_Categories_Axis.get(k);
													action.moveToElement(availableColumn).click().build().perform();
												}
												mouseOverAndClick(driver, CategoriesText);
												scrollUsingElement(driver, ApplyButton);
												click(driver,ApplyButton);
												if(isDisplayed(driver,Categories_Limit5_Error)) {
													pass(driver,"'Kindly select less than or equal to 5 column for categories' error displayed when Selecting more than 10 value in the categories dropdown");
												}else {
													fail(driver,"'Kindly select less than or equal to 5 column for categories' error not displayed when Selecting more than 10 value in the categories dropdown");
												}
											}
											while(isDisplayed(driver,RemoveOption)) {
												WebElement RemoveSelectList=getWebElement(driver,RemoveOption);
												action.moveToElement(RemoveSelectList).click().build().perform();
												wait(driver,"1");
											}
											elementnotvisible1(driver, Categories_Limit5_Error);										 
									 }
									 
									 setTestCaseID("");
									 click(driver,Categories_Input);
									 if(isDisplayed2(driver, Categories_DropdownExpand)) {
										 if(verifyElementDisplayed(driver, dropdownInputsearchBox)) {
											 if(TC_GROUPEDANDSORTED_010.equals("Yes")){
												 setTestCaseID("TC_GROUPEDANDSORTED_ AXES_010");
												 sendKeys(driver,dropdownInputsearchBox,"sdgffh");
												 if(isDisplayed(driver, NoResultsFound)) {
													 pass(driver,"'No results found' displayed when user enter incorrect value in categories search input");
												 }else {
													 fail(driver,"'No results found' not displayed when user enter incorrect value in categories search input");
												 }
												 clear2(driver,dropdownInputsearchBox);
											 }
											 
											 if(TC_GROUPEDANDSORTED_011.equals("Yes")){
												 setTestCaseID("TC_GROUPEDANDSORTED_ AXES_011");
												 sendKeys(driver,dropdownInputsearchBox,Select_Categories_Value);
												 String resultText=getText1(driver,FirstSearchedvalue);
												 if(resultText.contains(Select_Categories_Value)) {
													 pass(driver,"Search input in the categories dropdown works properly");
												 }else {
													 fail(driver,"Search input in the categories dropdown not works properly");
												 }
											 }
										 }
									 }else {
										 fail(driver,"Categories dropdown is not expanded after click on it ");
									 }
										 
									 if(TC_GROUPEDANDSORTED_013.equals("Yes")){
										 setTestCaseID("TC_GROUPEDANDSORTED_ AXES_013");
										 if(!isDisplayed2(driver, Categories_DropdownExpand)) {
											 click(driver,Categories_Input);
											 waitForElement(driver, Categories_DropdownExpand);
										 }
										 selectDropdownValue1(driver,Select_Categories_Value);
										 wait(driver,"1");
										 String selectedValue1=getText1(driver,Categories_Input);
										 if(selectedValue1.contains(Select_Categories_Value)) {
											 pass(driver,"Selected Columnn displayed in the Categories input successfully");
										 }else {
											 fail(driver,"Selected Columnn not displayed in the Categories input successfully");
										 }
										 click(driver,CategoriesText);
										 wait(driver,"1");
										 if(isDisplayed2(driver,Categories_DropdownExpand)) {
											 fail(driver,"Categories dropdown not closed when click outside the dropdown ");
										 }else {
											 pass(driver,"Categories dropdown Closed when click outside the dropdown ");
										 }
										 
										 if(TC_GROUPEDANDSORTED_014.equals("Yes")){
											 setTestCaseID("TC_GROUPEDANDSORTED_ AXES_014");
											 scrollUsingElement(driver, ApplyButton);
											 click(driver,ApplyButton);
											 if(isDisplayed(driver,error)) {
												 String errortext=getText1(driver,error);
												 if(!errortext.contains("Kindly select Series")) {
													 fail(driver,"'Kindly select Series' error not displayed when click Apply button, only providing Categories input");
												 }else {
													 pass(driver,"'Kindly select Series' Error displayed when click Apply button only providing Categories input");
												 }
												 elementnotvisible1(driver, error);
											 }else {
												 fail(driver," Error not displayed when click Apply button, only providing Categories input");
											 } 
										 }
									 }
								 }else {
									 fail(driver,"Categories dropdown is not expanded after click on it");
								 }
							 }else {
								 fail(driver,"Categories Input not Accessible");
							 }
						 }
						 
						 if(TC_GROUPEDANDSORTED_015.equals("Yes")){
							 setTestCaseID("TC_GROUPEDANDSORTED_ AXES_015");
							 if(IsElementEnabled(driver, Series_Input)) {
								 click(driver,Series_Input);
							 	 if(isDisplayed2(driver,Series_DropdownExpand)) {
							 		 pass(driver,"Series dropdown is expanded after click on it ");
							 		 if(TC_GROUPEDANDSORTED_016.equals("Yes")){
										 setTestCaseID("TC_GROUPEDANDSORTED_ AXES_016");
										 List<WebElement> displayedDataImage=getWebElements(driver, dataTypeImages);
										 boolean Numerical=true;
										 for(WebElement dataImag:displayedDataImage) {
											 action.moveToElement(dataImag).build().perform();
											 String dataTypeDisplay=dataImag.getAttribute("src");
											 if(dataTypeDisplay.contains("Date") || dataTypeDisplay.contains("Categorical") || dataTypeDisplay.contains("Numerical") || dataTypeDisplay.contains("Text") ) {
												 
											 }else {
												 fail(driver,"Other than Numerical, Date, Text and Categorical datatype column is displayed in the Series dropdown");
												 Numerical=false;
												 break;
											 }
										 }
										 if(Numerical) {
											 pass(driver, "Only Numerical, Date, Text and Categorical datatype column is displayed in the Series dropdown");
										 } 
							 		 }
							 		 
							 		if(TC_GROUPEDANDSORTED_017.equals("Yes")){
										 setTestCaseID("TC_GROUPEDANDSORTED_ AXES_017");
										 sendKeys(driver,dropdownInputsearchBox,"afghjku");
										 if(isDisplayed2(driver,NoResultsFound)) {
											 pass(driver,"'No Results found' message is displayed in while searching invalid value in the Series dropdown input");
										 }else {
											 fail(driver,"'No Results found' message is not displayed in while searching invalid value in the Series dropdown input");
										 }
										 clear2(driver,dropdownInputsearchBox);
							 		}
							 		
							 		if(TC_GROUPEDANDSORTED_018.equals("Yes")){
										 setTestCaseID("TC_GROUPEDANDSORTED_ AXES_018");
										 sendKeys(driver, dropdownInputsearchBox, Select_Series_Value);
										 String firstValue_=getText1(driver,FirstSearchedvalue);
										 if(firstValue_.contains(Select_Series_Value)) {
											 pass(driver,"Searched Value correctly displayed first in the Series dropdown");
										 }else {
											 fail(driver,"Searched Value not correctly displayed first in the Series dropdown");
										 }
							 		}
							 		
							 		if(TC_GROUPEDANDSORTED_019.equals("Yes")){
										 setTestCaseID("TC_GROUPEDANDSORTED_ AXES_019");
										 selectDropdownValue1(driver,Select_Series_Value);
										 wait(driver,"1");
										 if(isDisplayed2(driver,Series_DropdownExpand)) {
											 fail(driver,"Series dropdown not closed after selecting the value ");
										 }else {
											 pass(driver,"Series dropdown Closed after selecting the value");
										 }
										 
										 String selectedValue1=getText1(driver,Series_Input);
										 if(selectedValue1.contains(Select_Series_Value)) {
											 pass(driver,"Selected Columnn displayed in the Series input successfully");
										 }else {
											 fail(driver,"Selected Columnn not displayed in the Series input successfully");
										 }
							 		}
							 		
							 	 }else {
							 		fail(driver,"Series dropdown is not expanded after click on it ");
							 	 }
							 }else {
								 fail(driver,"Series input is not Accessible");
							 }
						 }
						 
						 setTestCaseID("");
						 if(IsElementEnabled(driver, Agg_Input)) {
							 pass(driver,"Aggregation input is enabled");
							 if(TC_GROUPEDANDSORTED_020.equals("Yes")){
								 setTestCaseID("TC_GROUPEDANDSORTED_ AXES_020");
								 String defaultAgg=defaultSelectedValue(driver, Agg_Input);
								 if(defaultAgg.equalsIgnoreCase("Sum")) {
									 pass(driver,"By default Sum is selected in the Aggregation input");
								 }else {
									 fail(driver,"By default Sum is not selected in the Aggregation input, Act : "+defaultAgg);
								 }
							 }
							 
							 if(TC_GROUPEDANDSORTED_021.equals("Yes")){
								 setTestCaseID("TC_GROUPEDANDSORTED_ AXES_021");
								 click(driver,Agg_Input);
								 verifyElementIsPresent1(driver, Sum);
								 verifyElementIsPresent1(driver, Count);
								 verifyElementIsPresent1(driver, Average);
								 verifyElementIsPresent1(driver, Min);
								 verifyElementIsPresent1(driver, Max);
								 verifyElementIsPresent1(driver, Unique);
							 }
							 
							 if(TC_GROUPEDANDSORTED_022.equals("Yes")){
								 setTestCaseID("TC_GROUPEDANDSORTED_ AXES_022");
								 DASHPRO_BAR_SMOKE_TESTING bar=new DASHPRO_BAR_SMOKE_TESTING();
								 bar.aggregationValidation2(driver);
								 selectByText(driver, Agg_Input, Select_Agg_Value);	
							 }
						 }else {
							 fail(driver,"Aggregation input is not Accessible");
						 }
						 
						 if(TC_GROUPEDANDSORTED_023.equals("Yes")){
							 setTestCaseID("TC_GROUPEDANDSORTED_ AXES_023");
							 if(isDisplayed2(driver,sortType)) {
								 pass(driver,"Sort Type input displayed after selecting the Categories and Series input");
								 if(TC_GROUPEDANDSORTED_024.equals("Yes")){
									 setTestCaseID("TC_GROUPEDANDSORTED_ AXES_024");
									 String defaultSortType=defaultSelectedValue(driver,sortType);
									 if(defaultSortType.equals("Quick Sort")) {
										 pass(driver,"'Quick Sort' is selected by default in the sortType input");
									 }else {
										 fail(driver,"'Quick Sort' is not selected by default in the sortType input");
									 }
								 }
								 
								 if(TC_GROUPEDANDSORTED_025.equals("Yes")){
									 setTestCaseID("TC_GROUPEDANDSORTED_ AXES_025");
									 click(driver,sortType);
									 verifyElementIsPresent1(driver, QuickSort);
									 verifyElementIsPresent1(driver, FieldSort);
								 }
								 
								 if(TC_GROUPEDANDSORTED_026.equals("Yes")){
									 setTestCaseID("TC_GROUPEDANDSORTED_ AXES_026");
									 click(driver,sortBy);
									 if(isDisplayed2(driver,sortByDropdownExpand)) {
										pass(driver,"Sort by dropdown get expanded after click on it");	
										if(TC_GROUPEDANDSORTED_027.equals("Yes")){
											 setTestCaseID("TC_GROUPEDANDSORTED_ AXES_027");
											 verifyElementDisplayed(driver, inputFieldSort);
										}
										if(TC_GROUPEDANDSORTED_028.equals("Yes")){
											 setTestCaseID("TC_GROUPEDANDSORTED_ AXES_028");
											 List<WebElement> SortByValues=getWebElements(driver,sortByValues);
											 int SortByValuesCount=SortByValues.size();
											 if(SortByValuesCount<=3) {
												 pass(driver,"Only X and Y values are displayed in the sortBy field for Quicksort condition");
											 }else {
												 fail(driver,"Other than X and Y values are displayed in the sortBy field for Quicksort condition");
											 }
										}
									 }else {
										fail(driver,"Sort by dropdown not get expanded after click on it");
									 }
								 }
								 
								 if(TC_GROUPEDANDSORTED_029.equals("Yes")){
									 setTestCaseID("TC_GROUPEDANDSORTED_ AXES_029");
									 selectByText(driver,sortType,"Field Sort");
									 click(driver,sortBy1);
									 if(verifyElementDisplayed(driver,sortByDropdownExpand)) {
										 List<WebElement> SortByValues1=getWebElements(driver,sortByValues1);
										 int SortByValuesCount=SortByValues1.size();
										 if(SortByValuesCount<=3) {
											 fail(driver,"Only Categories and Series values are displayed in the sortBy field for Fieldsort condition");
										 }else {
											 pass(driver,"All values are displayed in the sortBy field for Fieldsort condition");
											 wait(driver,"1");
										 }
										 
										 if(TC_GROUPEDANDSORTED_030.equals("Yes")){
											 setTestCaseID("TC_GROUPEDANDSORTED_ AXES_030");
											 if(isDisplayed2(driver,Aggregation_FieldSort)) {
												 pass(driver,"Aggregation enabled in the Field sort dropdown");
											 }else {
												 fail(driver,"Aggregation not enabled in the Field sort dropdown");
											 }
										 }
										 if(TC_GROUPEDANDSORTED_031.equals("Yes")){
											 setTestCaseID("TC_GROUPEDANDSORTED_ AXES_031");
											 ScrollBarValidation1(driver, ListFieldSection, "Field Sort");
										 }
										 
										 setTestCaseID("TC_GROUPEDANDSORTED_ AXES_027");
										 if(isDisplayed2(driver,inputFieldSort)) {
											 if(TC_GROUPEDANDSORTED_035.equals("Yes")){
												 setTestCaseID("TC_GROUPEDANDSORTED_ AXES_035");
												 click(driver,inputFieldSort);
												 sendKeys(driver, inputFieldSort, "dgrehtj");
												 if(isDisplayed(driver,NoResultsFound)) {
													 pass(driver,"No results found is displayed for invalid input");
												 }else {
													 fail(driver,"No results found is not displayed for invalid input");
												 }
												 clear1(driver,inputFieldSort);
											 }
											 
											 if(TC_GROUPEDANDSORTED_032.equals("Yes")){
												 setTestCaseID("TC_GROUPEDANDSORTED_ AXES_032");
												 sendKeys(driver, inputFieldSort, Select_Series_Value);
												 String firstList=getText1(driver, FirstField);
												 if(firstList.contains(Select_Series_Value) && isDisplayed2(driver,Aggregation_FieldSort)) {
													 pass(driver,"Searched value correctly displayed with Aggregation in the Field sort dropdown");
												 }else {
													 fail(driver,"Searched value not correctly displayed with Aggregation in the Field sort dropdown");
												 }
										 		 	
												 if(TC_GROUPEDANDSORTED_033.equals("Yes")){
													 setTestCaseID("TC_GROUPEDANDSORTED_ AXES_033");
													 action.sendKeys(Keys.ENTER).build().perform();
													 wait(driver,"1");
													 String appliedSort=getText1(driver, sortedInput);
													 if(appliedSort.contains(Select_Series_Value)) {
														 pass(driver,"Column Value selected when click Enter in the field sort");
													 }else {
														 fail(driver,"Column Value not selected when click Enter in the field sort");
													 }
												 }
												 
												 if(TC_GROUPEDANDSORTED_034.equals("Yes")){
													 setTestCaseID("TC_GROUPEDANDSORTED_ AXES_034");
													 clearAndType1(driver, inputFieldSort, Select_Categories_Value);
													 wait(driver,"1");
													 click(driver,FirstField);
													 String appliedSort=getText1(driver, sortedInput);
													 if(appliedSort.contains(Select_Categories_Value)) {
														 pass(driver,"Column Value selected when click the Value in the field sort");
													 }else {
														 fail(driver,"Column Value not selected when click the Value in the field sort");
													 }
												 }
											 }
										 }else {
											 fail(driver,"Search input is not present in the Field dropdown");
										 }
									 }
								 }
								 if(TC_GROUPEDANDSORTED_036.equals("Yes")){
									 setTestCaseID("TC_GROUPEDANDSORTED_ AXES_036");
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
									 try {
										 click(driver,quickSortBytext);
										 WebElement selectSort=driver.findElement(By.xpath("//ul//span[text()='"+Select_SortBy_Value+"']"));
										 selectSort.click();
									 }catch(Exception e) {
										 fail(driver,"Failed to select the Sort field Value  :"+e.getLocalizedMessage());
									 }
									 
								 }
								 
							 }else {
								 fail(driver,"Sort Type input not displayed after selecting the Categories and Series input");
							 }
						 }
						 
						 if(TC_GROUPEDANDSORTED_037.equals("Yes")){
							 setTestCaseID("TC_GROUPEDANDSORTED_ AXES_037");
							 scrollUsingElement(driver, ApplyButton);
							 click(driver,ApplyButton);
							 elementnotvisible1(driver, RPE_Loading);
							 if(isDisplayed(driver,error)) {
								 fail(driver,"Error displayed when click Apply button after providing Categories and Series value");
								 elementnotvisible1(driver, error);
							 }else {
								 verifyElementDisplayed(driver, ChartGraph);
							 }
						 }
					 }
				 }// axes expand
				 
				 setTestCaseID("");
				// ******************** Axis Title Validation Start *******************
				 String Grouped_And_Sorted_Axis_Title= getCellValue("TestExecution","Testcase_Selection","Grouped_And_Sorted_Axis_Title",Flag);
			     if(Grouped_And_Sorted_Axis_Title.equals("Yes")) {
			    	//Yes/No Input for Testcases Id
			 		String TC_GROUPEDANDSORTED_AXIS_TITLE_001=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ GROUPEDANDSORTED_001",TestcaseID_Flag);
			 		String TC_GROUPEDANDSORTED_AXIS_TITLE_002=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ GROUPEDANDSORTED_002",TestcaseID_Flag);
			 		String TC_GROUPEDANDSORTED_AXIS_TITLE_003=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ GROUPEDANDSORTED_003",TestcaseID_Flag);
			 		String TC_GROUPEDANDSORTED_AXIS_TITLE_004=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ GROUPEDANDSORTED_004",TestcaseID_Flag);
			 		String TC_GROUPEDANDSORTED_AXIS_TITLE_005=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ GROUPEDANDSORTED_005",TestcaseID_Flag);
			 		String TC_GROUPEDANDSORTED_AXIS_TITLE_006=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ GROUPEDANDSORTED_006",TestcaseID_Flag);
			 		String TC_GROUPEDANDSORTED_AXIS_TITLE_007=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ GROUPEDANDSORTED_007",TestcaseID_Flag);
			 		String TC_GROUPEDANDSORTED_AXIS_TITLE_008=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ GROUPEDANDSORTED_008",TestcaseID_Flag);
			 		String TC_GROUPEDANDSORTED_AXIS_TITLE_009=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ GROUPEDANDSORTED_009",TestcaseID_Flag);
			 		String TC_GROUPEDANDSORTED_AXIS_TITLE_010=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ GROUPEDANDSORTED_010",TestcaseID_Flag);
			 		String TC_GROUPEDANDSORTED_AXIS_TITLE_011=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ GROUPEDANDSORTED_011",TestcaseID_Flag);
			 		String TC_GROUPEDANDSORTED_AXIS_TITLE_012=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ GROUPEDANDSORTED_012",TestcaseID_Flag);
			 		String TC_GROUPEDANDSORTED_AXIS_TITLE_013=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ GROUPEDANDSORTED_013",TestcaseID_Flag);
			 		String TC_GROUPEDANDSORTED_AXIS_TITLE_014=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ GROUPEDANDSORTED_014",TestcaseID_Flag);
			 		String TC_GROUPEDANDSORTED_AXIS_TITLE_015=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ GROUPEDANDSORTED_015",TestcaseID_Flag);
			 		String TC_GROUPEDANDSORTED_AXIS_TITLE_016=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ GROUPEDANDSORTED_016",TestcaseID_Flag);
			 		String TC_GROUPEDANDSORTED_AXIS_TITLE_017=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ GROUPEDANDSORTED_017",TestcaseID_Flag);
			 		String TC_GROUPEDANDSORTED_AXIS_TITLE_018=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ GROUPEDANDSORTED_018",TestcaseID_Flag);
			 		String TC_GROUPEDANDSORTED_AXIS_TITLE_019=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ GROUPEDANDSORTED_019",TestcaseID_Flag);
			 		String TC_GROUPEDANDSORTED_AXIS_TITLE_020=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ GROUPEDANDSORTED_020",TestcaseID_Flag);
			 		String TC_GROUPEDANDSORTED_AXIS_TITLE_021=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ GROUPEDANDSORTED_021",TestcaseID_Flag);
			 		String TC_GROUPEDANDSORTED_AXIS_TITLE_022=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ GROUPEDANDSORTED_022",TestcaseID_Flag);
			 		String TC_GROUPEDANDSORTED_AXIS_TITLE_023=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ GROUPEDANDSORTED_023",TestcaseID_Flag);
			 		String TC_GROUPEDANDSORTED_AXIS_TITLE_024=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ GROUPEDANDSORTED_024",TestcaseID_Flag);
			 		String TC_GROUPEDANDSORTED_AXIS_TITLE_025=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ GROUPEDANDSORTED_025",TestcaseID_Flag);
			 		String TC_GROUPEDANDSORTED_AXIS_TITLE_026=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ GROUPEDANDSORTED_026",TestcaseID_Flag);

			 		//Axis Title
					String Change_X_Title_Name=Utils.getDataFromTestDataIteration(iteration,"Grouped_And_Sorted_Widget_Testing", "Change_X_Title_Name");
					String Change_Y_Title_Name=Utils.getDataFromTestDataIteration(iteration,"Grouped_And_Sorted_Widget_Testing", "Change_Y_Title_Name");
					String ChangeFontFamily_AxisTitle=Utils.getDataFromTestDataIteration(iteration,"Grouped_And_Sorted_Widget_Testing", "ChangeFontFamily_AxisTitle");
					String ChangeTitleFontSize_AxisTitle=Utils.getDataFromTestDataIteration(iteration,"Grouped_And_Sorted_Widget_Testing", "ChangeTitleFontSize_AxisTitle");
					String Change_X_label_FontSize=Utils.getDataFromTestDataIteration(iteration,"Grouped_And_Sorted_Widget_Testing", "Change_X_label_FontSize");
					String Change_Y_label_FontSize=Utils.getDataFromTestDataIteration(iteration,"Grouped_And_Sorted_Widget_Testing", "Change_Y_label_FontSize");
					String Change_X_Rotation_Input=Utils.getDataFromTestDataIteration(iteration,"Grouped_And_Sorted_Widget_Testing", "Change_X_Rotation_Input");
					String Change_Y_Rotation_Input=Utils.getDataFromTestDataIteration(iteration,"Grouped_And_Sorted_Widget_Testing", "Change_Y_Rotation_Input");

			 		if(TC_GROUPEDANDSORTED_AXIS_TITLE_001.equals("Yes")){
						 setTestCaseID("TC_GROUPEDANDSORTED_ AXIS_TITLE_001");
						 if(verifyElementDisplayed(driver, AxisTitle)) {
							 click(driver,AxisTitle);
							 wait(driver,"1");
							 String AxisExpand=getAttribute1(driver,AxisTitleExpand,"class");
							 if(AxisExpand.contains("up")) {
								 pass(driver,"Axis Title section is Expanded after click on it");
								 if(TC_GROUPEDANDSORTED_AXIS_TITLE_002.equals("Yes")){
									 setTestCaseID("TC_GROUPEDANDSORTED_ AXIS_TITLE_002");
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
						     	  		
									 String Y_ChartText=getText1(driver,Y_Value);
									 String X_ChartText=getText1(driver,X_Value);
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
								 
								 setTestCaseID("TS_GROUPEDANDSORTED_ AXIS_TITLE_002");
								 if(verifyElementDisplayed(driver, fontFamily_dropdown)) {
									 if(TC_GROUPEDANDSORTED_AXIS_TITLE_003.equals("Yes")){
										 setTestCaseID("TC_GROUPEDANDSORTED_ AXIS_TITLE_003");
										 String fontFamily_Value=getText1(driver,fontFamily_dropdown);
										 System.out.println("FontFamily_Value : "+fontFamily_Value);
										 if(fontFamily_Value.equals(default_FontFamily)) {
											 pass(driver,"By default, "+default_FontFamily+" displayed in the Font Family input");
										 }else {
											 fail(driver,"By default, "+default_FontFamily+" is not displayed in the Font Family input");
										 }
									 }
									 
									 setTestCaseID("TS_GROUPEDANDSORTED_ AXIS_TITLE_002");
									 if(IsElementEnabled(driver, fontFamily_dropdown)) {
										 if(TC_GROUPEDANDSORTED_AXIS_TITLE_004.equals("Yes")){
											 setTestCaseID("TC_GROUPEDANDSORTED_ AXIS_TITLE_004");
											 click(driver,fontFamily_dropdown);
											 if(isDisplayed(driver,fontFamily_DropdownExpand)) {
												 pass(driver,"Font family dropdown is expanded after click on it");
												 if(TC_GROUPEDANDSORTED_AXIS_TITLE_006.equals("Yes")){
													 setTestCaseID("TC_GROUPEDANDSORTED_ AXIS_TITLE_006");
													 ScrollBarValidation1(driver,fontFamily_DropdownExpand,"Font_Family_");
												 }
												 
												 if(TC_GROUPEDANDSORTED_AXIS_TITLE_005.equals("Yes")){
													 setTestCaseID("TC_GROUPEDANDSORTED_ AXIS_TITLE_005");
													 if(verifyElementDisplayed(driver,dropdownInputsearchBox)) {
														 sendKeys(driver,dropdownInputsearchBox,"sdgffh");
														 String inValidResult=getText1(driver,fontFamilyFirstResult);
														 if(inValidResult.equals("No results found")) {
															 pass(driver,"'No results found' displayed when user enter incorrect Font Family");
														 }else {
		   	  												fail(driver,"'No results found' not displayed when user enter incorrect Font Family");
														 }
														 clear1(driver,dropdownInputsearchBox);
														 sendKeys(driver,dropdownInputsearchBox,ChangeFontFamily_AxisTitle);
														 String resultText=getText1(driver,fontFamilyFirstResult);
														 if(resultText.equals(ChangeFontFamily_AxisTitle)) {
															 pass(driver,"Search input in the Font Family dropdown works properly for valid input");
														 }else {
															 fail(driver,"Search input in the Font Family dropdown not works properly for valid input");
														 }
													 }
												 }
												 
												 if(TC_GROUPEDANDSORTED_AXIS_TITLE_007.equals("Yes")){
													 setTestCaseID("TC_GROUPEDANDSORTED_ AXIS_TITLE_007");
													 selectFontFamily(driver,ChangeFontFamily_AxisTitle);
													 wait(driver,"1");
													 click(driver,fontFamily_dropdown);
													 if(isDisplayed(driver,fontFamily_DropdownExpand)) {
														 String selectedColorAct2=getTextBackgroundColor(driver,ListSelected);
														 String highlightText2=getText1(driver,listSelectedText1);
														 if((ChangeFontFamily_AxisTitle.equals(highlightText2))&&Highlight_color_Exp.equalsIgnoreCase(selectedColorAct2)) {
															 pass(driver,"Selected Value Highlighted in blue Color");
														 }else {
															 fail(driver,"Selected Value not Value Highlighted in blue Color ");
														 }
													 }else {
														 fail(driver,"Font Family dropdown not expanded when click on it, unable to Validate the Selected Value Color ");
													 }
												 }
												 
												 if(TC_GROUPEDANDSORTED_AXIS_TITLE_008.equals("Yes")){
													 setTestCaseID("TC_GROUPEDANDSORTED_ AXIS_TITLE_008");
													 selectFontFamily(driver,ChangeFontFamily_AxisTitle);
													 wait(driver,"1");
													 scrollUsingElement(driver, ApplyButton);
													 click(driver,ApplyButton);
													 elementnotvisible1(driver, RPE_Loading);
													 if(verifyElementDisplayed(driver,ChartGraph)) {
														 String fontFamily_Y_Act=getFontFamily(driver,Y_Value);
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
									 }else {
										 fail(driver,"FontFamil input not Accessible");
									 }
								 }
								 
								 setTestCaseID("TS_GROUPEDANDSORTED_ AXIS_TITLE_003");
								 if(verifyElementDisplayed(driver, titleFontSizeDropdown)) {
									 if(TC_GROUPEDANDSORTED_AXIS_TITLE_009.equals("Yes")){
										 setTestCaseID("TC_GROUPEDANDSORTED_ AXIS_TITLE_009");
										 String font_Size_Act=defaultSelectedValue(driver,titleFontSizeDropdown);
										 if(font_Size_Act.equals(default_FontSize_Exp)) {
											 pass(driver,"By default, "+default_FontSize_Exp+" displayed in the Title Font Size input");
										 }else {
											 fail(driver,"By default, "+default_FontSize_Exp+" is not displayed in the Title Font Size input");
										 } 
									 }
									 
									 if(IsElementEnabled(driver, titleFontSizeDropdown)) {
										 if(TC_GROUPEDANDSORTED_AXIS_TITLE_010.equals("Yes")){
											 setTestCaseID("TC_GROUPEDANDSORTED_ AXIS_TITLE_010");
											 click(driver,titleFontSizeDropdown);
											 verifyElementIsPresent1(driver, TitleFontSizeOptions);
										 }
										 
										 if(TC_GROUPEDANDSORTED_AXIS_TITLE_011.equals("Yes")){
											 setTestCaseID("TC_GROUPEDANDSORTED_ AXIS_TITLE_011");
											 selectByText(driver, titleFontSizeDropdown, ChangeTitleFontSize_AxisTitle);
											 wait(driver,"1");
											 scrollUsingElement(driver, ApplyButton);
											 click(driver,ApplyButton);
											 elementnotvisible1(driver, RPE_Loading);
											 if(verifyElementDisplayed(driver,ChartGraph)) {
												 String fontSize_Y_Act=getFontSize(driver,Y_Value);
												 String fontSize_X_Act=getFontSize(driver,X_Value);
												 if((ChangeTitleFontSize_AxisTitle.equals(fontSize_Y_Act))&&ChangeTitleFontSize_AxisTitle.equals(fontSize_X_Act)) {
													 pass(driver,"Given Title Font Size Updated in X-Axis Title and Y-Axis Title chart value");
												 }else {
													 fail(driver,"Given Title Font Size '"+ChangeTitleFontSize_AxisTitle+"' not Updated in X-Axis Title or Y-Axis Title chart value");
												 }
											 }
										 }
										 
									 }else {
										 fail(driver,"Title Font Size Input Not Accessible");
									 } 
								 }
								 
								 setTestCaseID("TS_GROUPEDANDSORTED_ AXIS_TITLE_004");
								 if(verifyElementDisplayed(driver, X_axisFontSizeDropdown)) {
									 if(TC_GROUPEDANDSORTED_AXIS_TITLE_012.equals("Yes")){
										 setTestCaseID("TC_GROUPEDANDSORTED_ AXIS_TITLE_012");
										 String X_font_Size_Act=defaultSelectedValue(driver,X_axisFontSizeDropdown);
										 System.out.println("X Font_Size : "+X_font_Size_Act);
										 if(X_font_Size_Act.equals(default_FontSize_Exp)) {
											 pass(driver,"By default, "+default_FontSize_Exp+" displayed in the X axis Font Size input");
										 }else {
											 fail(driver,"By default, "+default_FontSize_Exp+" is not displayed in the X axis Font Size input");
										 }
									 }
									 
									 setTestCaseID("TS_GROUPEDANDSORTED_ AXIS_TITLE_004");
									 if(IsElementEnabled(driver, X_axisFontSizeDropdown)) {
										 if(TC_GROUPEDANDSORTED_AXIS_TITLE_013.equals("Yes")){
											 setTestCaseID("TC_GROUPEDANDSORTED_ AXIS_TITLE_013");
											 click(driver,X_axisFontSizeDropdown);
											 verifyElementIsPresent1(driver, X_axisFontSizeDropdownOptions);
										 }
										 
										 if(TC_GROUPEDANDSORTED_AXIS_TITLE_014.equals("Yes")){
											 setTestCaseID("TC_GROUPEDANDSORTED_ AXIS_TITLE_014");
											 selectByText(driver,X_axisFontSizeDropdown,Change_X_label_FontSize);
											 scrollUsingElement(driver, ApplyButton);
											 click(driver,ApplyButton);
											 elementnotvisible1(driver, RPE_Loading);
											 if(verifyElementDisplayed(driver,ChartGraph)) {
												 if(isDisplayed2(driver,X_AxisLabel_chartNew2)) {
													 String fontSize_X_label_Act=getFontSize(driver,X_AxisLabel_chartNew2);
													 if(Change_X_label_FontSize.equals(fontSize_X_label_Act)) {
														 pass(driver,"Selected fontSize ("+Change_X_label_FontSize+") Updated in X Axis label chart value");
													 }else {
														 fail(driver,"Selected fontSize  ("+Change_X_label_FontSize+") not Updated in X Axis label chart value");
													 }
												 }else {
													 fail(driver,"X Axis Label value not present in the Chart");
												 }
											 }
										 }
									 }else {
										 fail(driver,"X-axis Label Font Size input is not accessible");
									 }
								 }
								 
								 setTestCaseID("TS_GROUPEDANDSORTED_ AXIS_TITLE_005");
								 if(verifyElementDisplayed(driver, Y_axisFontSizeDropdown)) {
									 if(TC_GROUPEDANDSORTED_AXIS_TITLE_015.equals("Yes")){
										 setTestCaseID("TC_GROUPEDANDSORTED_ AXIS_TITLE_015");
										 String Y_font_Size_Act=defaultSelectedValue(driver,Y_axisFontSizeDropdown);
										 if(Y_font_Size_Act.equals(default_FontSize_Exp)) {
					     	      			pass(driver,"By default, "+default_FontSize_Exp+" displayed in the Y axis Font Size input");
										 }else {
					     	           	    fail(driver,"By default, "+default_FontSize_Exp+" is not displayed in the Y axis Font Size input");
										 }
									 }
									 
									 if(IsElementEnabled(driver, Y_axisFontSizeDropdown)) {
										 if(TC_GROUPEDANDSORTED_AXIS_TITLE_016.equals("Yes")){
											 setTestCaseID("TC_GROUPEDANDSORTED_ AXIS_TITLE_016");
											 click(driver,Y_axisFontSizeDropdown);
								 			 verifyElementIsPresent1(driver, Y_axisFontSizeDropdownOptions);
										 }
										 
										 if(TC_GROUPEDANDSORTED_AXIS_TITLE_017.equals("Yes")){
											 setTestCaseID("TC_GROUPEDANDSORTED_ AXIS_TITLE_017");
											 selectByText(driver,Y_axisFontSizeDropdown,Change_Y_label_FontSize);
											 scrollUsingElement(driver, ApplyButton);
											 click(driver,ApplyButton);
											 elementnotvisible1(driver, RPE_Loading);
											 if(verifyElementDisplayed(driver,ChartGraph)) {
												 String fontSize_Y_label_Act=getFontSize(driver,Column_Y_Labels_Chart);
												 if(Change_Y_label_FontSize.equals(fontSize_Y_label_Act)) {
													 pass(driver,"Selected fontSize ("+Change_Y_label_FontSize+") Updated in Y Axis label chart value");
												 }else {
								     	    	    fail(driver,"Selected fontSize ("+Change_Y_label_FontSize+") not Updated in Y Axis label chart value, Act : "+fontSize_Y_label_Act);
												 }
											 }
										 }
									 }else {
										 fail(driver,"Y-axis Label Font Size input is not accessible");
									 }
								 }
								 
								 
								 setTestCaseID("TS_GROUPEDANDSORTED_ AXIS_TITLE_006");
								 if(verifyElementDisplayed(driver, X_RotationInputSlider)) {
									 if(TC_GROUPEDANDSORTED_AXIS_TITLE_018.equals("Yes")){
										 setTestCaseID("TC_GROUPEDANDSORTED_ AXIS_TITLE_018");
										 String X_RotationValueAct=getText1(driver,X_RotationOutputValue);
										 if(X_RotationValueAct.equals("-90")) {
											 pass(driver,"By default, '-90' displayed in the X axis Rotation output field");
											 String X_label_Rotation_Act=getRotationValue(driver,X_AxisLabel_chartNew2);
											 if(X_label_Rotation_Act.equals("-90")) {
												 pass(driver,"By default, X Axis label chart value displayed in '-90' angle");
											 }else {
												 fail(driver,"By default, X Axis label chart value is not displayed in '-90' angle");
											 }
											 
										 }else {
											 fail(driver,"By default, '-90' is not displayed in the X axis Rotation output field");
										 }
										 
										 String X_Rotation_Color_Act=getTextBackgroundColor(driver,X_RotationOutputValue);
										 if(RotationInputColor_Exp.equalsIgnoreCase(X_Rotation_Color_Act)) {
											 pass(driver,"X rotation output highlighted in blue color");
										 }else {
											 fail(driver,"X rotation output not highlighted in blue color");
										 }
									 }
									 
									 if(TC_GROUPEDANDSORTED_AXIS_TITLE_019.equals("Yes")){
										 setTestCaseID("TC_GROUPEDANDSORTED_ AXIS_TITLE_019");
										 if(IsElementEnabled(driver, X_RotationInputSlider)) {
											 pass(driver,"X Rotation Input is Accessible");
											 waitForElement(driver, X_RotationInputSlider);
											 moveSlider(driver,X_RotationInputSlider,X_RotationOutputValue,Change_X_Rotation_Input);
											 scrollUsingElement(driver, ApplyButton);
											 click(driver,ApplyButton);
											 elementnotvisible1(driver, RPE_Loading);
											 if(TC_GROUPEDANDSORTED_AXIS_TITLE_020.equals("Yes")){
												 setTestCaseID("TC_GROUPEDANDSORTED_ AXIS_TITLE_020");
												 String Y_label_Rotation_Act1=getRotationValue(driver,Column_Y_Labels_Chart);
												 if(Change_X_Rotation_Input.equals(Y_label_Rotation_Act1)) {
													 fail(driver,"Selected X Rotation Angle ("+Change_X_Rotation_Input+") Updated in Y Axis label chart value");
												 }else {
													 pass(driver,"Selected X Rotation Angle ("+Change_X_Rotation_Input+") is not Updated in Y Axis label chart value");
												 }
											 }
											 
											 if(TC_GROUPEDANDSORTED_AXIS_TITLE_021.equals("Yes")){
												 setTestCaseID("TC_GROUPEDANDSORTED_ AXIS_TITLE_021");
												 String X_label_Rotation_Act=getRotationValue(driver,X_AxisLabel_chartNew2);
												 if(Change_X_Rotation_Input.equals(X_label_Rotation_Act)) {
													 pass(driver,"Selected X Rotation Angle ("+Change_X_Rotation_Input+") Updated in X Axis label chart value");
												 }else {
													 fail(driver,"Selected X Rotation Angle ("+Change_X_Rotation_Input+") is not Updated in X Axis label chart value");
												 }
											 }
										 }else {
											 fail(driver,"X Rotation Input is not Accessible");
										 }
									 }
								 }
								 
								 setTestCaseID("TS_GROUPEDANDSORTED_ AXIS_TITLE_007");
								 if(verifyElementDisplayed(driver, Y_RotationInputSlider)) {
									 if(TC_GROUPEDANDSORTED_AXIS_TITLE_022.equals("Yes")){
										 setTestCaseID("TC_GROUPEDANDSORTED_ AXIS_TITLE_022");
										 String Y_RotationValueAct=getText1(driver,Y_RotationOutputValue);
										 System.out.println("Y rotation : "+Y_RotationValueAct);
										 if(Y_RotationValueAct.equals(defaultRotation)) {
											 pass(driver,"By default, '"+defaultRotation+"' displayed in the Y axis Rotation output field");
										 }else {
											 fail(driver,"By default, '"+defaultRotation+"' displayed in the Y axis Rotation output field");
										 }
										 String Y_Rotation_Color_Act=getTextBackgroundColor(driver,Y_RotationOutputValue);
										 if(RotationInputColor_Exp.equalsIgnoreCase(Y_Rotation_Color_Act)) {
											 pass(driver,"Y rotation output highlighted in blue color");
										 }else {
											 fail(driver,"Y rotation output not highlighted in blue color");
										 }
									 }
									 
									 if(TC_GROUPEDANDSORTED_AXIS_TITLE_023.equals("Yes")){
										 setTestCaseID("TC_GROUPEDANDSORTED_ AXIS_TITLE_023");
										 if(IsElementEnabled(driver, Y_RotationInputSlider)) {
											 pass(driver,"Y Rotation Input is Accessible");
											 moveSlider(driver,Y_RotationInputSlider,Y_RotationOutputValue,Change_Y_Rotation_Input);
											 scrollUsingElement(driver, ApplyButton);
											 click(driver,ApplyButton);
											 elementnotvisible1(driver, RPE_Loading);
											 verifyElementDisplayed(driver,Chart_Section);
											 if(TC_GROUPEDANDSORTED_AXIS_TITLE_024.equals("Yes")){
												 setTestCaseID("TC_GROUPEDANDSORTED_ AXIS_TITLE_024");
												 String X_label_Rotation_Act1=getRotationValue(driver,X_AxisLabel_chartNew2);
												 if(Change_Y_Rotation_Input.equals(X_label_Rotation_Act1)) {
													 fail(driver,"Selected Y Rotation Angle ("+Change_Y_Rotation_Input+") Updated in X Axis label chart value");
												 }else {
													 pass(driver,"Selected Y Rotation Angle ("+Change_Y_Rotation_Input+") is not Updated in X Axis label chart value");
												 }
											 }
											 
											 if(TC_GROUPEDANDSORTED_AXIS_TITLE_025.equals("Yes")){
												 setTestCaseID("TC_GROUPEDANDSORTED_ AXIS_TITLE_025");
												 String Y_label_Rotation_Act=getRotationValue(driver,Column_Y_Labels_Chart);
												 if(Change_Y_Rotation_Input.equals(Y_label_Rotation_Act)) {
													 pass(driver,"Selected Rotation Angle ("+Change_Y_Rotation_Input+") Updated in Y Axis label chart value");
												 }else {
													 fail(driver,"Selected Rotation Angle ("+Change_Y_Rotation_Input+") is not Updated in Y Axis label chart value");
												 }
											 }
										 }else {
											 fail(driver,"Y Rotation Input is not Accessible");
										 }
									 }
								 }
								 
								 setTestCaseID("TS_GROUPEDANDSORTED_ AXIS_TITLE_008");
								 if(verifyElementDisplayed(driver, switchSlider)) {
									 if(TC_GROUPEDANDSORTED_AXIS_TITLE_026.equals("Yes")){
										 setTestCaseID("TC_GROUPEDANDSORTED_ AXIS_TITLE_026");
										 if(isToggleEnable(driver, switchSliderInput)) {
											 fail(driver,"By default Start axis at 0 toggle enabled");
										 }else {
											 pass(driver,"By default Start axis at 0 toggle disabled");
										 }	
										 
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
						   		  		 
						   		  		 String x_firstAscValue=getText1(driver,X_AxisLabel_chartNew2);
						   		  		 Pattern numericalPattern = Pattern.compile("^-?\\d+(\\.\\d+)?$");
						   		  		 if(numericalPattern.matcher(x_firstAscValue).matches()) {
						 	     		     if(x_firstAscValue.equals("0")) { 
						 	     		    	pass(driver,"X axis label value started from '0' in the chart, After enbling the 'Start axis at 0' toggle"); 
						 	     		     }else {
						 	     		    	fail(driver,"X axis label value not started from '0' in the chart, After enbling the 'Start axis at 0' toggle");
						 	     		     }
						   		  		 }
						   		  		 
						   		  		 String y_firstAscValue=getText1(driver,Column_Y_Labels_Chart);
						   		  		 if(numericalPattern.matcher(y_firstAscValue).matches()) {
						   		  			 if(y_firstAscValue.equals("0")) { 
						   		  				 pass(driver,"Y axis label value started from '0' in the chart, After enbling the 'Start axis at 0' toggle"); 
						   		  			 }else {
						   		  				 fail(driver,"Y axis label value not started from '0' in the chart, After enbling the 'Start axis at 0' toggle");
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
	            //*************** AXIS TITLE Validation End ***************
			     setTestCaseID("");
			     // ******************** ChartTitle Validation Start *******************
				 String Grouped_And_Sorted_Chart_Title= getCellValue("TestExecution","Testcase_Selection","Grouped_And_Sorted_Chart_Title",Flag);
				 if(Grouped_And_Sorted_Chart_Title.equals("Yes")) {
					
					 CHART_TITLE chartTitle=new CHART_TITLE();
					 chartTitle.chartTitleTest(driver, TypeBackgroundColor1_ChartTitle, TypeTextColor1_ChartTitle, Change_FontFamily_ChartTitle, ChangeFontSize_ChartTitle,ChangeChartTitleName);       	
				 }
               // ******************** ChartTitle Validation End *******************
			     
			     setTestCaseID("");
			   //*************** Chart Style Validation Start ***************
			     String Grouped_And_Sorted_Chart_Style= getCellValue("TestExecution","Testcase_Selection","Grouped_And_Sorted_Chart_Style",Flag);
			     if(Grouped_And_Sorted_Chart_Style.equals("Yes")) {
			    	 
			    	 String TC_GROUPEDANDSORTED_CHART_STYLE_001=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ GROUPEDANDSORTED_001",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_CHART_STYLE_002=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ GROUPEDANDSORTED_002",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_CHART_STYLE_003=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ GROUPEDANDSORTED_003",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_CHART_STYLE_004=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ GROUPEDANDSORTED_004",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_CHART_STYLE_005=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ GROUPEDANDSORTED_005",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_CHART_STYLE_006=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ GROUPEDANDSORTED_006",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_CHART_STYLE_007=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ GROUPEDANDSORTED_007",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_CHART_STYLE_008=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ GROUPEDANDSORTED_008",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_CHART_STYLE_009=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ GROUPEDANDSORTED_009",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_CHART_STYLE_010=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ GROUPEDANDSORTED_010",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_CHART_STYLE_011=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ GROUPEDANDSORTED_011",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_CHART_STYLE_012=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ GROUPEDANDSORTED_012",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_CHART_STYLE_013=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ GROUPEDANDSORTED_013",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_CHART_STYLE_014=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ GROUPEDANDSORTED_014",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_CHART_STYLE_015=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ GROUPEDANDSORTED_015",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_CHART_STYLE_016=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ GROUPEDANDSORTED_016",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_CHART_STYLE_017=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ GROUPEDANDSORTED_017",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_CHART_STYLE_018=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ GROUPEDANDSORTED_018",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_CHART_STYLE_019=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ GROUPEDANDSORTED_019",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_CHART_STYLE_020=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ GROUPEDANDSORTED_020",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_CHART_STYLE_021=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ GROUPEDANDSORTED_021",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_CHART_STYLE_022=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ GROUPEDANDSORTED_022",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_CHART_STYLE_023=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ GROUPEDANDSORTED_023",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_CHART_STYLE_024=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ GROUPEDANDSORTED_024",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_CHART_STYLE_025=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ GROUPEDANDSORTED_025",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_CHART_STYLE_026=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ GROUPEDANDSORTED_026",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_CHART_STYLE_027=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ GROUPEDANDSORTED_027",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_CHART_STYLE_028=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ GROUPEDANDSORTED_028",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_CHART_STYLE_029=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ GROUPEDANDSORTED_029",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_CHART_STYLE_030=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ GROUPEDANDSORTED_030",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_CHART_STYLE_031=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ GROUPEDANDSORTED_031",TestcaseID_Flag);

			    	 //Iteration inputs
			    	 String Change_ChartTheme_ChartStyle=Utils.getDataFromTestDataIteration(iteration,"Grouped_And_Sorted_Widget_Testing", "Change_ChartTheme_ChartStyle");
			 		 String Change_Grid_Distance=Utils.getDataFromTestDataIteration(iteration,"Grouped_And_Sorted_Widget_Testing", "Change_Grid_Distance");
	
			    	 
			    	 if(TC_GROUPEDANDSORTED_CHART_STYLE_001.equals("Yes")) {
			    		 setTestCaseID("TC_GROUPEDANDSORTED_ CHART_STYLE_001");
			    		 if(verifyElementDisplayed(driver,Chart_FormatSec)) {
			    			 click(driver,Chart_FormatSec);
			    			 String ChartFormatOpenstatus=getAttribute1(driver, chartFormatExpand, "class");
				    		 if(ChartFormatOpenstatus.contains("up")) {
			   	  				pass(driver,"Chart Format is expanded when clicking the Chart Format");
			   	  				if(TC_GROUPEDANDSORTED_CHART_STYLE_002.equals("Yes")) {
			   	  					setTestCaseID("TC_GROUPEDANDSORTED_ CHART_STYLE_002");
			   	  					String TextColor_Act=getTextColor(driver,Chart_FormatSec);
			   	  					if(AxesColor_Exp.equalsIgnoreCase(TextColor_Act)) {
			   	  						pass(driver," 'Chart Format' highlighted in blue color");
			   	  					}else {
			   	  						fail(driver," 'Chart Format' not highlighted in blue color");
			   	  					}
			   	  				}
			   	  				if(TC_GROUPEDANDSORTED_CHART_STYLE_003.equals("Yes")) {
			   	  					setTestCaseID("TC_GROUPEDANDSORTED_ CHART_STYLE_003");
			   	  					String TextColor_Act=getTextColor(driver,ChartStyling);
			   	  					if(AxesColor_Exp.equalsIgnoreCase(TextColor_Act)) {
			   	  						pass(driver," 'Chart Styling' highlighted in blue color");
			   	  					}else {
			   	  						fail(driver," 'Chart Styling' not highlighted in blue color");
			   	  					}
			   	  				}
			   	  				if(TC_GROUPEDANDSORTED_CHART_STYLE_004.equals("Yes")) {
			   	  					setTestCaseID("TC_GROUPEDANDSORTED_ CHART_STYLE_004");
			   	  					String ChartStylingExpand=getAttribute1(driver, ChartStyling_Expand, "class");
			   	  					if(!ChartStylingExpand.contains("up")) {
			   	  						fail(driver,"By default, Chart Styling not gets Expand");
			   	  					}else {
			   	  						pass(driver,"By default, Chart Styling gets Expanded");
			   	  						if(TC_GROUPEDANDSORTED_CHART_STYLE_005.equals("Yes")) {
			   	  							setTestCaseID("TC_GROUPEDANDSORTED_ CHART_STYLE_005");
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
			   	  						}
			   	  						
			   	  						setTestCaseID("TS_GROUPEDANDSORTED_ CHART_STYLE_003");
			                            if(isDisplayed(driver,ChartThemeInput)) {
			                            	if(TC_GROUPEDANDSORTED_CHART_STYLE_006.equals("Yes")) {
				   	  							setTestCaseID("TC_GROUPEDANDSORTED_ CHART_STYLE_006");
				   	  							String defaultThemeValue_Act=getText1(driver,ChartThemeInput);
				   	  							if(defaultThemeValue_Act.equals(DefaultThemeValue_Exp)) {
				   	  								pass(driver,"By default, Chart theme selected the value as '"+DefaultThemeValue_Exp+"'");
				   	  							}else {
				   	  								fail(driver,"By default, '"+DefaultThemeValue_Exp+"' value not selected in the  Chart theme input");
				   	  							}
				   	  						}
			                            	
			                            	setTestCaseID("TS_GROUPEDANDSORTED_ CHART_STYLE_003");
			                            	if(IsElementEnabled(driver, ChartThemeInput)) {
			                            		if(TC_GROUPEDANDSORTED_CHART_STYLE_007.equals("Yes")) {
					   	  							setTestCaseID("TC_GROUPEDANDSORTED_ CHART_STYLE_007");
					   	  							click(driver,ChartThemeInput);
					   	  							if(isDisplayed2(driver,ChartThemeResults)) {
					   	  								pass(driver,"Chart Theme results dropdown is displayed after click on it");
					   	  								if(TC_GROUPEDANDSORTED_CHART_STYLE_010.equals("Yes")) {
					   	  									setTestCaseID("TC_GROUPEDANDSORTED_ CHART_STYLE_010");
					   	  									mouseOverToElement(driver,ThirdValue);
					   	  									wait(driver,"1");
					   	  									String mouseHighlightColor=getTextBackgroundColor(driver,ThirdValue);
					   	  									if(Highlight_ColorStyle_Exp.equalsIgnoreCase(mouseHighlightColor)) {
					   	  										pass(driver,"Mouse hovered value highlighted in blue color");
					   	  									}else {
					   	  										fail(driver,"Mouse hovered value not highlighted in blue color");
					   	  									}
					   	  								}
					   	  								
					   	  								if(TC_GROUPEDANDSORTED_CHART_STYLE_011.equals("Yes")) {
					   	  									setTestCaseID("TC_GROUPEDANDSORTED_ CHART_STYLE_011");
					   	  									ScrollBarValidation1(driver,ChartThemeResults,"Chart Theme");
					   	  								}
					   	  								
					   	  								setTestCaseID("TC_GROUPEDANDSORTED_ CHART_STYLE_008");
					   	  								if(isDisplayed2(driver,dropdownInputsearchBox)) {
					   	  									if(TC_GROUPEDANDSORTED_CHART_STYLE_008.equals("Yes")) {
					   	  										setTestCaseID("TC_GROUPEDANDSORTED_ CHART_STYLE_008");
					   	  										sendKeys(driver,dropdownInputsearchBox,"sdgffh");
					   	  										String inValidResult=getText1(driver,chartThemeFirstResult);
					   	  										if(inValidResult.equals("No results found")) {
					   	  											pass(driver,"'No results found' displayed when user enter incorrect chart theme");
					   	  										}else {
					   	  											fail(driver,"'No results found' not displayed when user enter incorrect chart theme");
					   	  										}
					   	  										clear1(driver,dropdownInputsearchBox);
					   	  									}
					   	  									if(TC_GROUPEDANDSORTED_CHART_STYLE_009.equals("Yes")) {
					   	  										setTestCaseID("TC_GROUPEDANDSORTED_ CHART_STYLE_009");
					   	  										sendKeys(driver,dropdownInputsearchBox,Change_ChartTheme_ChartStyle);
					   	  										String resultText=getText1(driver,chartThemeFirstResult);
					   	  										if(resultText.equals(Change_ChartTheme_ChartStyle)) {
					   	  											pass(driver,"Search input in the Chart Theme dropdown works properly");
					   	  										}else {
					   	  											fail(driver,"Search input in the Chart Theme dropdown not works properly");
					   	  										}
					   	  									}
					   	  									
					   	  								}else {
					   	  									fail(driver,"Search input not present in the Chart Theme dropdown");
					   	  								}
					   	  								
					   	  								if(TC_GROUPEDANDSORTED_CHART_STYLE_013.equals("Yes")) {
					   	  									setTestCaseID("TC_GROUPEDANDSORTED_ CHART_STYLE_013");
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
					   	  								}
					   	  								
					   	  								if(TC_GROUPEDANDSORTED_CHART_STYLE_012.equals("Yes")) {
					   	  									setTestCaseID("TC_GROUPEDANDSORTED_ CHART_STYLE_012");
					   	  									click(driver,ChartThemeInput);
					   	  									waitForElement(driver,chartThemeResultList);
					   	  									wait(driver,"1");
					   	  									String selectedColorAct=getTextBackgroundColor(driver,ListSelected);
					   	  									System.out.println("Highlight_color_Exp : "+Highlight_color_Exp+"selectedColorAct : "+selectedColorAct);
					   	  									String highlightText=getText1(driver,ListSelectedText2);
					   	  									if((highlightText.contains(Change_ChartTheme_ChartStyle))&&Highlight_color_Exp.equalsIgnoreCase(selectedColorAct)) {
					   	  										pass(driver,"Selected Value ("+Change_ChartTheme_ChartStyle+") highlighted in blue color");
					   	  									}else {
					   	  										fail(driver,"Selected Value ("+Change_ChartTheme_ChartStyle+") not highlighted in blue color");
					   	  									}
					   	  									mouseOverAndClick(driver, ChartThemeText);
					   	  								}
					   	  							}else {
					   	  								fail(driver,"Chart Theme results dropdown is not displayed after click on it");
					   	  							}
			                            		}
			                            	}else {
			                            		fail(driver,"Chart Theme input is not Accessible");
			                            	}
			                            	
			                            }else {
			                            	fail(driver,"Chart theme input not present unbale to perform validations");
			                            }
			   	  						
			   	  						if(TC_GROUPEDANDSORTED_CHART_STYLE_014.equals("Yes")) {
			   	  							setTestCaseID("TC_GROUPEDANDSORTED_ CHART_STYLE_014");
			   	  							if(isToggleEnable(driver,AutoScroll_toggle)) {
			   	  								pass(driver,"By default, 'AutoScroll' toggle is enabled");
			   	  								
			   	  								if(TC_GROUPEDANDSORTED_CHART_STYLE_015.equals("Yes")) {
			   	  									setTestCaseID("TC_GROUPEDANDSORTED_ CHART_STYLE_015");
			   	  									if(isToggleAccessible(driver,Y_Scroll_toggle)) {
			   	  										fail(driver,"Y Scroll toggle is Accessible when the AutoScroll toggle is enabled");
			   	  									}else {
			   	  										pass(driver,"Y Scroll toggle is not Accessible when the AutoScroll toggle is enabled ");
			   	  									}
			   	  									
			   	  									if(isToggleAccessible(driver,X_Scroll_toggle)) {
			   	  										fail(driver,"X Scroll toggle is Accessible when the AutoScroll toggle is enabled");
			   	  									}else {
			   	  										pass(driver,"X Scroll toggle is not Accessible when the AutoScroll toggle is enabled ");
			   	  									}
			   	  								}
			   	  								
			   	  								if(TC_GROUPEDANDSORTED_CHART_STYLE_016.equals("Yes")) {
			   	  									setTestCaseID("TC_GROUPEDANDSORTED_ CHART_STYLE_016");
			   	  									click(driver,Auto_ScrollInputSlider);
			   	  									if(isToggleEnable(driver,AutoScroll_toggle)){
			   	  										fail(driver,"'Auto Scroll' toggle not disabled when click on it");
			   	  									}else {
			   	  										pass(driver,"'Auto Scroll' toggle disabled when click on it");
			   	  										if(isToggleAccessible(driver,Y_Scroll_toggle)&&isToggleAccessible(driver,X_Scroll_toggle)) {
			   	  											pass(driver,"X Scroll and Y Scroll toggle is Accessible when the AutoScroll toggle is disabled");
			   	  											List<WebElement> X_Values=getWebElements(driver, X_AxisLabel_chartFull);
			   	  											if(X_Values.size()>15) {
			   	  												if(TC_GROUPEDANDSORTED_CHART_STYLE_017.equals("Yes")) {
			   	  													setTestCaseID("TC_GROUPEDANDSORTED_ CHART_STYLE_017");
			   	  													if(isToggleEnable(driver,Y_Scroll_toggle)) {
			   	  														pass(driver,"By default Y Scroll toggle enabled for the larger value selection ");
			   	  														if(isDisplayed(driver,Y_Scroll_Bar)) {
				   	  							   			 				pass(driver,"By default, Y Scroll Bar is displayed in the chart for the larger value selection");
				   	  							   			 			}else {
				   	  							   			 				fail(driver,"By default, Y Scroll Bar is not displayed in the chart for the larger value selection");
				   	  							   			 			}
			   	  													}else {
			   	  														fail(driver,"By default Y Scroll toggle not enabled for the larger value selection ");
			   	  													}
			   	  													if(isToggleEnable(driver,X_Scroll_toggle)) {
			   	  														pass(driver,"By default X Scroll toggle enabled for the larger value selection ");
			   	  														if(isDisplayed(driver,X_Scroll_Bar)) {
			   	  							   			 					pass(driver,"By default, X Scroll Bar is displayed in the chart for the larger value selection");
			   	  							   			 				}else {
			   	  							   			 					fail(driver,"By default, X Scroll Bar is not displayed in the chart for the larger value selection");
			   	  							   			 				}
			   	  													}else {
			   	  														fail(driver,"By default X Scroll toggle not enabled for the larger value selection ");
			   	  													}
			   	  												}
			   	  											}else {
			   	  												//setTestCaseID("TC_GROUPEDANDSORTED_ CHART_STYLE_017");
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
			   	  							   			 		elementnotvisible1(driver, RPE_Loading);
			   	  							   			 		waitForElement(driver,Chart_Section);
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
		   	  												}
			   	  										}else {
			   	  											fail(driver,"X Scroll and Y Scroll toggle is not Accessible when the AutoScroll toggle is disabled ");
			   	  										}
			   	  									}
			   	  								}
			   	  							}else {
			   	  								fail(driver,"By default, 'AutoScroll' toggle is not enabled");
			   	  							}
			   	  						}
			   	  						
			   	  						if(TC_GROUPEDANDSORTED_CHART_STYLE_018.equals("Yes")) {
			   	  							setTestCaseID("TC_GROUPEDANDSORTED_ CHART_STYLE_018");
			   	  							if(isToggleEnable(driver,EnableGrid_toggle)) {
			   	  								pass(driver,"By default, 'Enable Grid' toggle is enabled");
			   	  								if(isDisplayed(driver,Grid_Stacked_Column)) {
			   	  									pass(driver,"Grid is displayed in the chart when it is enable");
			   	  								}else {
			   	  									fail(driver,"Grid is not displayed in the chart when it is enable");
			   	  								}
			   	  								
			   	  								if(IsElementEnabled(driver, EnableGrid_toggle)) {
			   	  									if(TC_GROUPEDANDSORTED_CHART_STYLE_019.equals("Yes")) {
			   	  										setTestCaseID("TC_GROUPEDANDSORTED_ CHART_STYLE_019");
			   	  										click(driver,EnableGrid_InputSlider);
			   	  										wait(driver,"1");
			   	  										if(isToggleEnable(driver,EnableGrid_toggle)){
			   	  											fail(driver,"'Enable Grid' toggle not disabled when click on it ");
			   	  										}else {
			   	  											pass(driver,"'Enable Grid' toggle disabled when click on it ");
			   	  											if(TC_GROUPEDANDSORTED_CHART_STYLE_020.equals("Yes")) {
			   	  												setTestCaseID("TC_GROUPEDANDSORTED_ CHART_STYLE_020");
			   	  												scrollUsingElement(driver, ApplyButton);
			   	  												click(driver,ApplyButton);
			   	  												elementnotvisible1(driver, RPE_Loading);
			   	  												waitForElement(driver, Chart_Section);
			   	  												if(isDisplayed(driver,Grid_Stacked_Column)) {
			   	  													fail(driver,"Grid is displayed in the chart when it is disable");
			   	  												}else {
			   	  													pass(driver,"Grid is not displayed in the chart when it is disable");
			   	  												}
			   	  											}
			   	  										}
			   	  									}
			   	  								}else {
			   	  									fail(driver,"Enable grid input is not Accessible");
			   	  								}
			   	  								
			   	  							}else {
			   	  								fail(driver,"By default, 'Enable Grid' toggle is not enabled");
			   	  							}
			   	  						}
			   	  						
			   	  						if(TC_GROUPEDANDSORTED_CHART_STYLE_021.equals("Yes")) {
			   	  							setTestCaseID("TC_GROUPEDANDSORTED_ CHART_STYLE_021");
			   	  							String default_XLabelPositionAct=defaultSelectedValue(driver,X_Label_Position_Input);
			   	  							if(Default_X_Label_Position_Column.equals(default_XLabelPositionAct)) {
			   	  								pass(driver,"By default "+Default_X_Label_Position_Column+" is displayed in the X Label Position input");
			   	  							}else {
			   	  								fail(driver,"By default "+Default_X_Label_Position_Column+" is not displayed in the X Label Position input");
			   	  							}
			   	  						}
			   	  						
			   	  						if(TC_GROUPEDANDSORTED_CHART_STYLE_022.equals("Yes")) {
			   	  							setTestCaseID("TC_GROUPEDANDSORTED_ CHART_STYLE_022");
			   	  							if(IsElementEnabled(driver, X_Label_Position_Input)) {
			   	  								pass(driver,"X_Label_Position_Input is Accessible");
			   	  								if(TC_GROUPEDANDSORTED_CHART_STYLE_023.equals("Yes")) {
			   	  									setTestCaseID("TC_GROUPEDANDSORTED_ CHART_STYLE_023");
			   	  									click(driver,X_Label_Position_Input);
			   	  									verifyElementIsPresent1(driver, X_Label_Position_Options);
			   	  								}
			   	  								
			   	  								if(TC_GROUPEDANDSORTED_CHART_STYLE_024.equals("Yes")) {
			   	  									setTestCaseID("TC_GROUPEDANDSORTED_ CHART_STYLE_024");
			   	  									selectByText(driver, X_Label_Position_Input, "Center");
			   	  									wait(driver,"1");
			   	  									String afterselect=defaultSelectedValue(driver, X_Label_Position_Input);
			   	  									if(afterselect.equalsIgnoreCase("Center")) {
			   	  										pass(driver,"Selected 'Center' Position Value is updated the input field correctly");
			   	  									}else {
			   	  										fail(driver,"Selected 'Center' Position Value is not updated in the input field correctly");
			   	  									}
			   	  								}
			   	  								
			   	  								if(TC_GROUPEDANDSORTED_CHART_STYLE_025.equals("Yes")) {
			   	  									setTestCaseID("TC_GROUPEDANDSORTED_ CHART_STYLE_025");
			   	  									selectByText(driver, X_Label_Position_Input, "Left");
			   	  									wait(driver,"1");
			   	  									String afterselect=defaultSelectedValue(driver, X_Label_Position_Input);
			   	  									if(afterselect.equalsIgnoreCase("Left")) {
			   	  										pass(driver,"Selected 'Left' Position Value is updated the input field correctly");
			   	  									}else {
			   	  										fail(driver,"Selected 'Left' Position Value is not updated in the input field correctly");
			   	  									}
			   	  								}
			   	  								
			   	  								if(TC_GROUPEDANDSORTED_CHART_STYLE_026.equals("Yes")) {
			   	  									setTestCaseID("TC_GROUPEDANDSORTED_ CHART_STYLE_026");
			   	  									selectByText(driver, X_Label_Position_Input, "Right");
			   	  									wait(driver,"1");
			   	  									String afterselect=defaultSelectedValue(driver, X_Label_Position_Input);
			   	  									if(afterselect.equalsIgnoreCase("Right")) {
			   	  										pass(driver,"Selected 'Right' Position Value is updated the input field correctly");
			   	  									}else {
			   	  										fail(driver,"Selected 'Right' Position Value is not updated in the input field correctly");
			   	  									}
			   	  								}
			   	  							
			   	  							}else {
			   	  								fail(driver,"X_Label_Position_Input is not Accessible");
			   	  							}
			   	  						}
			   	  						
			   	  						if(TC_GROUPEDANDSORTED_CHART_STYLE_027.equals("Yes")) {
			   	  							setTestCaseID("TC_GROUPEDANDSORTED_ CHART_STYLE_027");
			   	  							String defaultGrid_distance_Act=defaultSelectedValue(driver,Grid_Distance_Input);
			   	  							if(Default_Grid_distance_Column.equals(defaultGrid_distance_Act)) {
			   	  								pass(driver,"By default "+Default_Grid_distance_Column+" is displayed in the Grid Distance Input");
			   	  							}else {
			   	  								fail(driver,"By default "+Default_Grid_distance_Column+" is not displayed in the Grid Distance Input");
			   	  							}
			   	  						}
			   	  					
			   	  						if(TC_GROUPEDANDSORTED_CHART_STYLE_028.equals("Yes")) {
			   	  							setTestCaseID("TC_GROUPEDANDSORTED_ CHART_STYLE_028");
			   	  							if(IsElementEnabled(driver, Grid_Distance_Input)) {
			   	  								pass(driver,"Grid_Distance_Input is Accessible");
			   	  								if(TC_GROUPEDANDSORTED_CHART_STYLE_029.equals("Yes")) {
			   	  									setTestCaseID("TC_GROUPEDANDSORTED_ CHART_STYLE_029");
			   	  									click(driver,Grid_Distance_Input);
			   	  									verifyElementIsPresent1(driver, Grid_Distance_Results);
			   	  								}
			   	  								
			   	  								if(TC_GROUPEDANDSORTED_CHART_STYLE_030.equals("Yes")) {
			   	  									setTestCaseID("TC_GROUPEDANDSORTED_ CHART_STYLE_030");
			   	  									selectByText(driver, Grid_Distance_Input, Change_Grid_Distance);
			   	  									wait(driver,"1");
			   	  									String afterselectGrid=defaultSelectedValue(driver, Grid_Distance_Input);
			   	  									if(afterselectGrid.equals(Change_Grid_Distance)) {
			   	  										pass(driver,"Selected Value is displayed in the Grid_Distance_Input");
			   	  									}else {
			   	  										fail(driver,"Selected Value is not displayed in the Grid_Distance_Input");
			   	  									}
			   	  								}
			   	  								
			   	  							}else {
			   	  								fail(driver,"Grid_Distance_Input is not Accessible");
			   	  							}
			   	  						}
			   	  						
			   	  						
			   	  						if(TC_GROUPEDANDSORTED_CHART_STYLE_031.equals("Yes")) {
			   	  							setTestCaseID("TC_GROUPEDANDSORTED_ CHART_STYLE_031");
			   	  							click(driver,ChartStyling);
			   	  							wait(driver,"1");
			   	  							String chartStyleClose_Act=getAttribute1(driver, ChartStyling_Expand, "class");
			   	  							if(chartStyleClose_Act.contains("down")) {
			   	  								pass(driver,"Chart styling gets collapsed when click on it");
			   	  							}else {
			   	  								fail(driver,"Chart styling not gets collapsed when click on it");
			   	  							}
			   	  						}
			   	  					}
			   	  				}// Chart Style Expanded
				    		 }else {
				    			 fail(driver,"Chart Format is not expanded when clicking the chart Format");
				    		 }
				    		 
			    		 }//Chart Format verify
			    	 }// Chart Format condition
			     }
			     //*************** Chart Style Validation End ***************
			      setTestCaseID("");
			     //*************** Data Label Validation Start ***************
			     String Grouped_And_Sorted_Data_Labels= getCellValue("TestExecution","Testcase_Selection","Grouped_And_Sorted_Data_Labels",Flag);
			     if(Grouped_And_Sorted_Data_Labels.equals("Yes")) {
			    	 String TC_GROUPEDANDSORTED_DATA_LABEL_001=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TS_GROUPEDADSORTED_001",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_DATA_LABEL_002=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TS_GROUPEDADSORTED_002",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_DATA_LABEL_003=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TS_GROUPEDADSORTED_003",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_DATA_LABEL_004=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TS_GROUPEDADSORTED_004",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_DATA_LABEL_005=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TS_GROUPEDADSORTED_005",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_DATA_LABEL_006=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TS_GROUPEDADSORTED_006",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_DATA_LABEL_007=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TS_GROUPEDADSORTED_007",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_DATA_LABEL_008=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TS_GROUPEDADSORTED_008",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_DATA_LABEL_009=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TS_GROUPEDADSORTED_009",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_DATA_LABEL_010=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TS_GROUPEDADSORTED_010",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_DATA_LABEL_011=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TS_GROUPEDADSORTED_011",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_DATA_LABEL_012=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TS_GROUPEDADSORTED_012",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_DATA_LABEL_013=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TS_GROUPEDADSORTED_013",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_DATA_LABEL_014=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TS_GROUPEDADSORTED_014",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_DATA_LABEL_015=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TS_GROUPEDADSORTED_015",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_DATA_LABEL_016=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TS_GROUPEDADSORTED_016",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_DATA_LABEL_017=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TS_GROUPEDADSORTED_017",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_DATA_LABEL_018=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TS_GROUPEDADSORTED_018",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_DATA_LABEL_019=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TS_GROUPEDADSORTED_019",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_DATA_LABEL_020=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TS_GROUPEDADSORTED_020",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_DATA_LABEL_021=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TS_GROUPEDADSORTED_021",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_DATA_LABEL_022=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TS_GROUPEDADSORTED_022",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_DATA_LABEL_023=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TS_GROUPEDADSORTED_023",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_DATA_LABEL_024=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TS_GROUPEDADSORTED_024",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_DATA_LABEL_025=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TS_GROUPEDADSORTED_025",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_DATA_LABEL_026=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TS_GROUPEDADSORTED_026",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_DATA_LABEL_027=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TS_GROUPEDADSORTED_027",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_DATA_LABEL_028=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TS_GROUPEDADSORTED_028",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_DATA_LABEL_029=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TS_GROUPEDADSORTED_029",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_DATA_LABEL_030=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TS_GROUPEDADSORTED_030",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_DATA_LABEL_031=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TS_GROUPEDADSORTED_031",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_DATA_LABEL_032=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TS_GROUPEDADSORTED_032",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_DATA_LABEL_033=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TS_GROUPEDADSORTED_033",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_DATA_LABEL_034=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TS_GROUPEDADSORTED_034",TestcaseID_Flag);

			    	 //Iteration inputs
			    	 String ChangeFontSizeValue_DataLabel=Utils.getDataFromTestDataIteration(iteration,"Grouped_And_Sorted_Widget_Testing", "ChangeFontSizeValue_DataLabel");
			    	 String ChangeRoundOffValue_DataLabel=Utils.getDataFromTestDataIteration(iteration,"Grouped_And_Sorted_Widget_Testing", "ChangeRoundOffValue_DataLabel");
			    	 String ChangeRotataionVal_DataLabel=Utils.getDataFromTestDataIteration(iteration,"Grouped_And_Sorted_Widget_Testing", "ChangeRotataionVal_DataLabel");
			    	 
			    	 if(!Grouped_And_Sorted_Chart_Style.equals("Yes")) {
						 verifyElementDisplayed(driver,Chart_FormatSec);
		    		     click(driver,Chart_FormatSec);
					 }
			    	 
			    	 if(TC_GROUPEDANDSORTED_DATA_LABEL_001.equals("Yes")) {
			    		 setTestCaseID("TC_GROUPEDANDSORTED_ DATA_LABEL_001");
			    		 String DataLabelsExpand=getAttribute1(driver, DataLabels_Expand, "class");
			    		 if(!DataLabelsExpand.contains("up")) {
			    			 fail(driver,"By default, Data labels not gets Expanded");
			    		 }else {
			    			 pass(driver,"By default, Data labels gets Expanded");
			    			 if(TC_GROUPEDANDSORTED_DATA_LABEL_002.equals("Yes")) {
					    		 setTestCaseID("TC_GROUPEDANDSORTED_ DATA_LABEL_002");
					    		 String TextColor_Act=getTextColor(driver,DataLabels);
								 if(AxesColor_Exp.equalsIgnoreCase(TextColor_Act)) {
									 pass(driver," 'Data Label' highlighted in blue color");
								 }else {
									 fail(driver," 'Data Label' not highlighted in blue color");
								 }
			    			 }
			    			 
			    			 if(TC_GROUPEDANDSORTED_DATA_LABEL_003.equals("Yes")) {
					    		 setTestCaseID("TC_GROUPEDANDSORTED_ DATA_LABEL_003");
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
				              
				         		 verifyElementDisplayed(driver,Position_text);
				         		 verifyElementDisplayed(driver,PositionInput);
				              
				         		 verifyElementDisplayed(driver,BigNumberSuffix_text);
				         		 verifyElementDisplayed(driver,BigNumberInput);
				            
				         		 verifyElementDisplayed(driver,ValueRotation_text);
				         		 verifyElementDisplayed(driver,ValueRotation_Input);
			    			 }
			    			 
			    			 if(TC_GROUPEDANDSORTED_DATA_LABEL_004.equals("Yes")) {
					    		 setTestCaseID("TC_GROUPEDANDSORTED_ DATA_LABEL_004");
					    		 if(!isToggleEnable(driver,EnableValue_Input)) {
				         	  		 fail(driver,"By Default, Enable Value toggle is not enabled");
				         	     }else {
				         	  		 pass(driver,"By Default, Enable Value toggle is enabled");
				         	  		 if(isDisplayed(driver,EnableValue)) {
				            			 pass(driver,"Values enabled in charts after enabling the 'Enable Value' toggle"); 
				            		 }else {
				            	  		 fail(driver,"Values not enabled in charts after enabling the 'Enable Value' toggle"); 
				            		 }
				         	  		 if(TC_GROUPEDANDSORTED_DATA_LABEL_005.equals("Yes")) {
							    		 setTestCaseID("TC_GROUPEDANDSORTED_ DATA_LABEL_005");
							    		 if(IsElementEnabled(driver,ValueFormatInput)) {
					         		  		 pass(driver,"'Value Format' is accessible when the 'Enable value' toggle is enabled.");
					         		     }else {
					         		  		 fail(driver,"'Value Format' is inaccessible when the 'Enable value' toggle is enabled.");
					         		     }
					         		     
					         		     if(IsElementEnabled(driver,SeperatorInput)) {
					         		  		 pass(driver,"'Seperator Input' is accessible when the 'Enable value' toggle is enabled.");
					         		     }else {
					         		  		 fail(driver,"'Seperator Input' is inaccessible when the 'Enable value' toggle is enabled.");
					         		     }
					         		     
					         		     if(IsElementEnabled(driver,ValueFontSizeInput)) {
					         		  		 pass(driver,"'ValueFontSize Input' is accessible when the 'Enable value' toggle is enabled.");
					         		     }else {
					         		  		 fail(driver,"'ValueFontSize Input' is inaccessible when the 'Enable value' toggle is enabled.");
					         		     }
					         		     
					         		     if(IsElementEnabled(driver,RoundOffValueInput)) {
					         		  		 pass(driver,"'RoundOffValue Input' is accessible when the 'Enable value' toggle is enabled.");
					         		     }else {
					         		  		 fail(driver,"'RoundOffValue Input' is inaccessible when the 'Enable value' toggle is enabled.");
					         		     }
					         		     
					         		     if(IsElementEnabled(driver,PositionInput)) {
					         		  		 pass(driver,"'Position Input' is accessible when the 'Enable value' toggle is enabled.");
					         		     }else {
					         		  		 fail(driver,"'Position Input' is inaccessible when the 'Enable value' toggle is enabled.");
					         		     }
					         			 
					         		     if(IsElementEnabled(driver,BigNumberInput)) {
					         		  		 pass(driver,"'BigNumber Suffix Input' is accessible when the 'Enable value' toggle is enabled.");
					         		     }else {
					         		  		 fail(driver,"'BigNumber Suffix Input' is inaccessible when the 'Enable value' toggle is enabled.");
					         		     }
					         		     
					         		     if(IsElementEnabled(driver,ValueRotation_Input)) {
					         		  		 pass(driver,"'ValueRotation_Input' is accessible when the 'Enable value' toggle is enabled.");
					         		     }else {
					         		  		 fail(driver,"'ValueRotation_Input' is inaccessible when the 'Enable value' toggle is enabled.");
					         		     }
				         	  		 }
				         	  		 
				         	  		 if(TC_GROUPEDANDSORTED_DATA_LABEL_008.equals("Yes")) {
							    		 setTestCaseID("TC_GROUPEDANDSORTED_ DATA_LABEL_008");
							    		 String defaultFormatValue_Act=defaultSelectedValue(driver, ValueFormatInput);
						           		 if(DefaultFormatValue_Exp.equals(defaultFormatValue_Act)) {
						         	  		 pass(driver,"By default, '"+DefaultFormatValue_Exp+"' is selected in the Value Format Input"); 
						           		 }else {
						         	  		 fail(driver,"By default, '"+DefaultFormatValue_Exp+"' is not selected in the Value Format Input"); 
						           		 }
				         	  		 }
				         	  		 
				         	  		 if(TC_GROUPEDANDSORTED_DATA_LABEL_007.equals("Yes")) {
							    		 setTestCaseID("TC_GROUPEDANDSORTED_ DATA_LABEL_007");
							    		 if(IsElementEnabled(driver, ValueFormatInput)) {
							    			 pass(driver,"Value Format input is Accessible");
							    			 if(TC_GROUPEDANDSORTED_DATA_LABEL_009.equals("Yes")) {
									    		 setTestCaseID("TC_GROUPEDANDSORTED_ DATA_LABEL_009");
									    		 click(driver,ValueFormatInput);
									    		 verifyElementIsPresent1(driver, Value_ValueFormat);
									    		 verifyElementIsPresent1(driver, Percentage_ValueFormat);
							    			 }
							    			 
							    			 if(TC_GROUPEDANDSORTED_DATA_LABEL_010.equals("Yes")) {
									    		 setTestCaseID("TC_GROUPEDANDSORTED_ DATA_LABEL_010");
									    		 selectOptionValue(driver,ValueFormatInput,"value");
								         		 scrollUsingElement(driver, ApplyButton);
								         		 click(driver,ApplyButton);
								         		 elementnotvisible1(driver, RPE_Loading);
								         		 waitForElement(driver,Chart_Section);
								         		 if(isDisplayed2(driver,EnableValue_)) {
								         			mouseOverToElement(driver, EnableValue_);
								         			String ChartValueTextAct=getText1(driver,dataLableValue_Tooltip); 
								         			if(ChartValueTextAct.contains("…") ||ChartValueTextAct.equals("") ) {
									    				 pass(driver,"Unable to validate the Value Format for the enabled Value : "+ChartValueTextAct); 
								         			}else {
								         				try {
									    					 int start=ChartValueTextAct.indexOf(":");
									    					 int end=ChartValueTextAct.length();
									    					 ChartValueTextAct=ChartValueTextAct.substring(start+1, end);
									    				 }catch(Exception e) {
									    					 
									    				 }
								         				if(ChartValueTextAct.endsWith("%")) {
									         				fail(driver,"'Value Format' is not display correctly in the chart for 'Value' format selection");                 
									         			}else {
									         				pass(driver,"'Value Format' is displayed correctly in the chart for 'Value' format selection");
									         			}
								         			}
								         			
								         		 }else {
								         			 fail(driver,"Enable value is not displayed in the chart");
								         		 }
							    			 }
							    			 
							    			 if(TC_GROUPEDANDSORTED_DATA_LABEL_011.equals("Yes")) {
									    		 setTestCaseID("TC_GROUPEDANDSORTED_ DATA_LABEL_011");
									    		 selectOptionValue(driver,ValueFormatInput,"percentage");
								         		 scrollUsingElement(driver, ApplyButton);
								         		 click(driver,ApplyButton);
								         		 elementnotvisible1(driver, RPE_Loading);
								         		 waitForElement(driver,Chart_Section);
								         		 if(isDisplayed2(driver,EnableValue_)) {
								         			mouseOverToElement(driver, EnableValue_);
								         			String ChartValueTextAct=getText1(driver,dataLableValue_Tooltip); 
								         			if(ChartValueTextAct.contains("…") ||ChartValueTextAct.equals("") ) {
									    				 pass(driver,"Unable to validate the Value Format for the enabled Value : "+ChartValueTextAct); 
								         			}else {
								         				try {
									    					 int start=ChartValueTextAct.indexOf(":");
									    					 int end=ChartValueTextAct.length();
									    					 ChartValueTextAct=ChartValueTextAct.substring(start+1, end);
									    				 }catch(Exception e) {
									    					 
									    				 }
								         				if(ChartValueTextAct.endsWith("%")) {
								         					pass(driver,"Enabled Value in chart  is displayed in percentage when 'Percentage' is selected");
								                		 }else {
								                	  		 fail(driver,"Enabled Value in chart is not displayed in percentage when 'Percentage' is selected");
								                		 }
								         			}
								         			
								         		 }else {
								         			 fail(driver,"Enable value is not displayed in the chart");
								         		 }
								         		 
								         		if(TC_GROUPEDANDSORTED_DATA_LABEL_016.equals("Yes")) {
										    		 setTestCaseID("TC_GROUPEDANDSORTED_ DATA_LABEL_016");
										    		 if(isToggleAccessible(driver,SeperatorInput)) {	
									         			 fail(driver,"'Seperator Input' is accessible  when 'Percentage' is selected in value format");	  		
									         		 }else {
									         			 pass(driver,"'Seperator Input' is inaccessible  when 'Percentage' is selected in value format");
									         		 }
								         		}
								         		
								         		selectOptionValue(driver,ValueFormatInput,"value");
								         		scrollUsingElement(driver, ApplyButton);
								         		click(driver,ApplyButton);
							    			 }
							    		 }else {
							    			 fail(driver,"Value Format input is not Accessible");
							    		 }
				         	  		 }
				         	  		 
				         	  		if(TC_GROUPEDANDSORTED_DATA_LABEL_012.equals("Yes")) {
				         	  			setTestCaseID("TC_GROUPEDANDSORTED_ DATA_LABEL_012");
				         	  			String defaultSeperator_Act=defaultSelectedValue(driver,SeperatorInput);
				         	  			if(DefaultSeperatorValue_Exp.equals(defaultSeperator_Act)) {
				         	  				pass(driver,"By default, '"+DefaultSeperatorValue_Exp+"' is selected in the Seperator Input"); 
				         	  			}else {
				         	  				fail(driver,"By default, '"+DefaultSeperatorValue_Exp+"' is not selected in the Seperator Input"); 
				         	  			} 
				         	  		}
				         	  		
				         	  		if(TC_GROUPEDANDSORTED_DATA_LABEL_013.equals("Yes")) {
				         	  			setTestCaseID("TC_GROUPEDANDSORTED_ DATA_LABEL_013");
				         	  			if(IsElementEnabled(driver, SeperatorInput)) {
				         	  				pass(driver,"Seperator input is Accessible");
				         	  				click(driver,SeperatorInput);
				         	  				verifyElementIsPresent1(driver, Thousand_Seperator);
				         	  				verifyElementIsPresent1(driver, Houndred_Seperator);
				         	  				
				         	  				if(TC_GROUPEDANDSORTED_DATA_LABEL_014.equals("Yes")) {
						         	  			setTestCaseID("TC_GROUPEDANDSORTED_ DATA_LABEL_014");
						         	  			selectOptionValue(driver,SeperatorInput,"#,###");
						                 		scrollUsingElement(driver, ApplyButton);
						                 		click(driver,ApplyButton);
						                 		elementnotvisible1(driver, RPE_Loading);
						                 		waitForElement(driver,Chart_Section);
						                 		if(isDisplayed2(driver,EnableValue_)) {
								         			mouseOverToElement(driver, EnableValue_);
								         			String ChartValueTextAct=getText1(driver,dataLableValue_Tooltip); 
								         			if(ChartValueTextAct.contains("…") ||ChartValueTextAct.equals("") ) {
									    				 pass(driver,"Unable to validate the Seperator for the enabled Value : "+ChartValueTextAct); 
								         			}else {
								         				try {
									    					 int start=ChartValueTextAct.indexOf(":");
									    					 int end=ChartValueTextAct.length();
									    					 ChartValueTextAct=ChartValueTextAct.substring(start+1, end);
									    				 }catch(Exception e) {
									    					 
									    				 }
								         				String ValueSeperatorFormat=validateNumberFormat(ChartValueTextAct);
								         				if(ValueSeperatorFormat.equals("#,###")) {
						                 	  	  	  		 pass(driver,"Thousand seperator gets applied for chart enabled values"); 
						                 	  	  		}else {
						                 	  	  	  		 fail(driver,"Thousand seperator not applied for chart enabled values, Act value : "+ChartValueTextAct); 
						                 	  	  		}
								         			}
								         			
								         		 }else {
								         			 fail(driver,"Enable value is not displayed in the chart");
								         		 }
				         	  				}
				         	  				
				         	  				if(TC_GROUPEDANDSORTED_DATA_LABEL_015.equals("Yes")) {
						         	  			setTestCaseID("TC_GROUPEDANDSORTED_ DATA_LABEL_015");
						         	  			selectOptionValue(driver,SeperatorInput,"#,##");
						                 		scrollUsingElement(driver, ApplyButton);
						                 		click(driver,ApplyButton);
						                 		elementnotvisible1(driver, RPE_Loading);
						                 		waitForElement(driver,Chart_Section);
						                 		if(isDisplayed2(driver,EnableValue_)) {
								         			mouseOverToElement(driver, EnableValue_);
								         			String ChartValueTextAct=getText1(driver,dataLableValue_Tooltip); 
								         			if(ChartValueTextAct.contains("…") ||ChartValueTextAct.equals("") ) {
									    				 pass(driver,"Unable to validate the Seperator for the enabled Value : "+ChartValueTextAct); 
								         			}else {
								         				try {
									    					 int start=ChartValueTextAct.indexOf(":");
									    					 int end=ChartValueTextAct.length();
									    					 ChartValueTextAct=ChartValueTextAct.substring(start+1, end);
									    				 }catch(Exception e) {
									    					 
									    				 }
								         				String ValueSeperatorFormat=validateNumberFormat(ChartValueTextAct);
								         				if(ValueSeperatorFormat.equals("#,##")) {
								         					pass(driver,"Hundred seperator gets applied for chart enabled values"); 
						                 	  	  		}else {
						                 	  	  			fail(driver,"Hundred seperator not applied for chart enabled values, Act value : "+ChartValueTextAct); 
						                 	  	  		}
								         			}
								         			
								         		 }else {
								         			 fail(driver,"Enable value is not displayed in the chart");
								         		 }
				         	  				}
				         	  				
				         	  			}else {
				         	  			   fail(driver,"Seperator input is not Accessible");
				         	  			}
				         	  		}
				         	  		
				         	  		if(TC_GROUPEDANDSORTED_DATA_LABEL_017.equals("Yes")) {
				         	  			setTestCaseID("TC_GROUPEDANDSORTED_ DATA_LABEL_017");
				         	  			String defaultFontSize_Act=defaultSelectedValue(driver, ValueFontSizeInput);
				                 		if(DefaultFontSizeValue_Exp.equals(defaultFontSize_Act)) {
				                 			pass(driver,"By default, '"+DefaultFontSizeValue_Exp+"' is selected in the Value Font Size Input"); 
				                 		}else {
				                 			fail(driver,"By default, '"+DefaultFontSizeValue_Exp+"' is not selected in the Value Font Size Input"); 
				                 		}
				         	  		}
				         	  		
				         	  		if(TC_GROUPEDANDSORTED_DATA_LABEL_018.equals("Yes")) {
				         	  			setTestCaseID("TC_GROUPEDANDSORTED_ DATA_LABEL_018");
				         	  			if(IsElementEnabled(driver, ValueFontSizeInput)){
				         	  				pass(driver,"Value Font Size input is Accessible");
				         	  				if(TC_GROUPEDANDSORTED_DATA_LABEL_019.equals("Yes")) {
						         	  			setTestCaseID("TC_GROUPEDANDSORTED_ DATA_LABEL_019");
						         	  			click(driver,ValueFontSizeInput);
						         	  			verifyElementIsPresent1(driver, ValueFontSizeOptions);
				         	  				}
				         	  				
				         	  				if(TC_GROUPEDANDSORTED_DATA_LABEL_020.equals("Yes")) {
						         	  			setTestCaseID("TC_GROUPEDANDSORTED_ DATA_LABEL_020");
						         	  			selectOptionValue(driver,ValueFontSizeInput,ChangeFontSizeValue_DataLabel);
						                 		scrollUsingElement(driver, ApplyButton);   
						                 		click(driver,ApplyButton);
						                 		elementnotvisible1(driver, RPE_Loading);
						                 		waitForElement(driver,Chart_Section);
						                 		String ValueFontSizeAct=getFontSize(driver,EnableValue);
						                 		if(ValueFontSizeAct.equals(ChangeFontSizeValue_DataLabel)) {
						                 	  		 pass(driver,"The chart's value displayed with Selected '"+ChangeFontSizeValue_DataLabel+"' font size."); 
						                 		}else {
						                 	  		 fail(driver,"The chart's value not displayed with Selected '"+ChangeFontSizeValue_DataLabel+"' font size."); 
						                 		}
				         	  				}
				         	  			}else {
				         	  				fail(driver,"Value Font Size input is not Accessible");
				         	  			}
				         	  		}
				         	  		
				         	  		if(TC_GROUPEDANDSORTED_DATA_LABEL_021.equals("Yes")) {
				         	  			setTestCaseID("TC_GROUPEDANDSORTED_ DATA_LABEL_021");
				         	  			String defaultRoundOffValue_Act=defaultSelectedValue(driver, RoundOffValueInput);
				                  		if(DefaultRoundOffValue_Exp.equals(defaultRoundOffValue_Act)) {
				                 	  		 pass(driver,"By default, '"+DefaultRoundOffValue_Exp+"' is selected in the RoundOffValue Input"); 
				                  		}else {
				                 	  		 fail(driver,"By default, '"+DefaultRoundOffValue_Exp+"' is not selected in the RoundOffValue Input"); 
				                  		}
				         	  		}
				         	  		
				         	  		if(TC_GROUPEDANDSORTED_DATA_LABEL_022.equals("Yes")) {
				         	  			setTestCaseID("TC_GROUPEDANDSORTED_ DATA_LABEL_022");
				         	  			if(IsElementEnabled(driver, RoundOffValueInput)) {
				         	  				pass(driver,"RoundOff value Input is Accessible");
				         	  				click(driver,RoundOffValueInput);
				         	  				verifyElementIsPresent1(driver, RoundOffValueOptions);
				         	  				if(TC_GROUPEDANDSORTED_DATA_LABEL_023.equals("Yes")) {
						         	  			setTestCaseID("TC_GROUPEDANDSORTED_ DATA_LABEL_023");
						         	  			selectByText(driver,RoundOffValueInput,ChangeRoundOffValue_DataLabel);
						                 	    scrollUsingElement(driver, ApplyButton);
						                 	    click(driver,ApplyButton);
						                 	    elementnotvisible1(driver, RPE_Loading);
						                 	    waitForElement(driver,Chart_Section);
						                 	    if(isDisplayed2(driver,EnableValue_)) {
								         			mouseOverToElement(driver, EnableValue_);
								         			String ChartValueTextAct=getText1(driver,dataLableValue_Tooltip); 
								         			if(ChartValueTextAct.contains("…") ||ChartValueTextAct.equals("") ) {
									    				 pass(driver,"Unable to validate the RoundOff for the enabled Value : "+ChartValueTextAct); 
								         			}else {
								         				try {
									    					 int start=ChartValueTextAct.indexOf(":");
									    					 int end=ChartValueTextAct.length();
									    					 ChartValueTextAct=ChartValueTextAct.substring(start+1, end);
									    				 }catch(Exception e) {
									    					 
									    				 }
								         				String RoundOffValue_Act=String.valueOf(getRoundOffValue(ChartValueTextAct));
								         				if(RoundOffValue_Act.equals(ChangeRoundOffValue_DataLabel)) {
								         					pass(driver,"The chart's value displayed with Selected '"+ChangeRoundOffValue_DataLabel+"' RoundOff Value"); 
								         				}else {
								                 	  	   	fail(driver,"The chart's value not displayed with Selected '"+ChangeRoundOffValue_DataLabel+"' RoundOff Value"); 
								         				}
								         			}
								         		 }else {
								         			 fail(driver,"Enable value is not displayed in the chart");
								         		 }
				         	  				}
				         	  			}else {
				         	  				fail(driver,"RoundOff value Input is not Accessible");
				         	  			}
				         	  		}
				         	  		
				         	  		if(TC_GROUPEDANDSORTED_DATA_LABEL_024.equals("Yes")) {
				         	  			setTestCaseID("TC_GROUPEDANDSORTED_ DATA_LABEL_024");
				         	  			String defaultPosition_Act=defaultSelectedValue(driver, PositionInput);
				         	  			if(defaultPosition_Act.equalsIgnoreCase(DefaultPositionValue_DataLabel)) {
				                  		   pass(driver,"By default, 'Outside' is selected in the Position Input"); 
				                  		   boolean chartValuePositionAct=validateElementPosition(driver,Chart_Column,EnableValue_,DefaultPositionValue_DataLabel);
				                  		   if(chartValuePositionAct==true) {
				                   	  			pass(driver,"By default, Chart value displayed "+DefaultPositionValue_DataLabel+" the chartbar for position selected as '"+DefaultPositionValue_DataLabel+"' condition"); 
				                  		   }else {
				                   	  			fail(driver,"By default, Chart value is not displayed "+DefaultPositionValue_DataLabel+" the chartbar for position selected as '"+DefaultPositionValue_DataLabel+"' condition"); 
				                  		   }
				         	  			}else {
				                  		   fail(driver,"By default, '"+DefaultPositionValue_DataLabel+"' is not selected in the Position Input");
				         	  			}
				         	  		}
				         	  		
				         	  		if(TC_GROUPEDANDSORTED_DATA_LABEL_025.equals("Yes")) {
				         	  			setTestCaseID("TC_GROUPEDANDSORTED_ DATA_LABEL_025");
				         	  			if(IsElementEnabled(driver, PositionInput)) {
				         	  				pass(driver,"Position input is Acessible");
				         	  				if(TC_GROUPEDANDSORTED_DATA_LABEL_026.equals("Yes")) {
						         	  			setTestCaseID("TC_GROUPEDANDSORTED_ DATA_LABEL_026");
						         	  			selectByText(driver, PositionInput, "Inside");
						         	  			scrollUsingElement(driver, ApplyButton);
						         	  			click(driver,ApplyButton);
						         	  			elementnotvisible1(driver, RPE_Loading);
						         	  			waitForElement(driver,Chart_Section);
						          	      	   	boolean chartValuePositionAct=validateElementPosition2(driver,Chart_Column,EnableValue_,"Inside");
						          	      	   	if(chartValuePositionAct==true) {
						          	      	  		pass(driver,"Chart value displayed Inside the chartbar for position selected as 'Inside' condition"); 
						          	      	   	}else {
						          	      	  		fail(driver,"Chart value is not displayed Inside the chartbar for position selected as 'Inside' condition"); 
						          	      	   	}
				         	  				}
				         	  				
				         	  				if(TC_GROUPEDANDSORTED_DATA_LABEL_027.equals("Yes")) {
						         	  			setTestCaseID("TC_GROUPEDANDSORTED_ DATA_LABEL_027");
						         	  			selectByText(driver, PositionInput, "Center");
						         	  			scrollUsingElement(driver, ApplyButton);
						         	  			click(driver,ApplyButton);
						         	  			elementnotvisible1(driver, RPE_Loading);
						         	  			waitForElement(driver,Chart_Section);
						          	      	   	boolean chartValuePositionAct=validateElementPosition(driver,Chart_Column,EnableValue_,"Center");
						          	      	   	if(chartValuePositionAct==true) {
						          	      	  		pass(driver,"Chart value displayed Center the chartbar for position selected as 'Center' condition"); 
						          	      	   	}else {
						          	      	  		fail(driver,"Chart value is not displayed Center the chartbar for position selected as 'Center' condition"); 
						          	      	   	}
				         	  				}
				         	  				
				         	  				if(TC_GROUPEDANDSORTED_DATA_LABEL_028.equals("Yes")) {
						         	  			setTestCaseID("TC_GROUPEDANDSORTED_ DATA_LABEL_028");
						         	  			selectByText(driver, PositionInput, "Outside");
						         	  			scrollUsingElement(driver, ApplyButton);
						         	  			click(driver,ApplyButton);
						         	  			elementnotvisible1(driver, RPE_Loading);
						         	  			waitForElement(driver,Chart_Section);
						          	      	   	boolean chartValuePositionAct=validateElementPosition(driver,Chart_Column,EnableValue_,"Outside");
						          	      	   	if(chartValuePositionAct==true) {
						          	      	  		pass(driver,"Chart value displayed Outside the chartbar for position selected as 'Outside' condition"); 
						          	      	   	}else {
						          	      	  		fail(driver,"Chart value is not displayed Outside the chartbar for position selected as 'Outside' condition"); 
						          	      	   	}
				         	  				}
				         	  				
				         	  			}else {
				         	  				fail(driver,"Position input is not Acessible");
				         	  			}
				         	  		}
				         	  		
				         	  		if(TC_GROUPEDANDSORTED_DATA_LABEL_029.equals("Yes")) {
				         	  			setTestCaseID("TC_GROUPEDANDSORTED_ DATA_LABEL_029");
				         	  			selectByText(driver,SeperatorInput,"#,###");
				         	  			wait(driver,"1");
				         	  			if(IsElementEnabled(driver, BigNumberInput)) {
				         	  				fail(driver,"'Big Number Suffix' toggle is accessible while Seperator is selected");
				         	  			}else {
				         	  				pass(driver,"'Big Number Suffix' toggle is not accessible while Seperator is selected");
				         	  			}
				         	  			selectByText(driver,SeperatorInput,"Select");
				         	  			
				         	  		}
				         	  		
				         	  		if(TC_GROUPEDANDSORTED_DATA_LABEL_030.equals("Yes")) {
							    		 setTestCaseID("TC_GROUPEDANDSORTED_ DATA_LABEL_030");
							    		 selectOptionValue(driver,ValueFormatInput,"percentage");
							    		 scrollUsingElement(driver, ApplyButton);
							    		 click(driver,ApplyButton);
							    		 wait(driver,"1");
							    		 if(isToggleAccessible(driver,BigNumberInput)) {
							    			 fail(driver,"'Big Number Suffix' toggle is accessible while 'Percentage' is selected");
							    		 }else {
							    			 pass(driver,"'Big Number Suffix' toggle is Inaccessible while 'Percentage' is selected");
							    		 }
							    		 selectOptionValue(driver,ValueFormatInput,"value");
							    		 scrollUsingElement(driver, ApplyButton);
							    		 click(driver,ApplyButton);
					         		}
				         	  		
				         	  		if(TC_GROUPEDANDSORTED_DATA_LABEL_031.equals("Yes")) {
							    		 setTestCaseID("TC_GROUPEDANDSORTED_ DATA_LABEL_031");
							    		 if(IsElementEnabled(driver, BigNumberInput)) {
							    			 click(driver,BigNumberInputSlider);
							    			 if(isToggleEnable(driver,BigNumberInput)) {
					         					 pass(driver,"'Big Number Suffix' toggle is enabled while click on it");
					         					 scrollUsingElement(driver, ApplyButton);
					         					 click(driver,ApplyButton);
					         					 elementnotvisible1(driver, RPE_Loading);
					         					 waitForElement(driver,Chart_Section);
					         					 if(isDisplayed2(driver,EnableValue_)) {
								         			mouseOverToElement(driver, EnableValue_);
								         			String ChartValueTextAct=getText1(driver,dataLableValue_Tooltip); 
								         			if(ChartValueTextAct.contains("…") ||ChartValueTextAct.equals("") ) {
									    				 pass(driver,"Unable to validate the BigNumber Suffix for the enabled Value : "+ChartValueTextAct); 
								         			}else {
								         				try {
									    					 int start=ChartValueTextAct.indexOf(":");
									    					 int end=ChartValueTextAct.length();
									    					 ChartValueTextAct=ChartValueTextAct.substring(start+1, end);
									    				 }catch(Exception e) {
									    					 
									    				 }
								         				
								         				if(ChartValueTextAct.endsWith("K")||ChartValueTextAct.endsWith("k")) {
								         					pass(driver,"BigNumber Suffix applied in the enabled chart value"); 
								         				}else {
								         					fail(driver,"BigNumber Suffix is not applied in the enabled chart value, Act Value : "+ChartValueTextAct);
								         				}
								         			}
								         		 }else {
								         			 fail(driver,"Enable value is not displayed in the chart");
								         		 }
							    			 }else {
							    				 fail(driver,"'Big Number Suffix' toggle is not enabled while click on it");
							    			 }
							    			 
							    		 }else {
							    			 fail(driver,"Big Number Suffix toggle is not Accessible");
							    		 }
				         	  		}
				         	  		
				         	  		
				         	  		if(TC_GROUPEDANDSORTED_DATA_LABEL_032.equals("Yes")) {
				         	  			setTestCaseID("TC_GROUPEDANDSORTED_ DATA_LABEL_032");
				         	  			String defaultRotationValue_Act=getText1(driver,ValueRotation_Output);
				                 		if(DefaultRotationValue_Exp.equals(defaultRotationValue_Act)) {
				                 			 pass(driver,"By default, '"+DefaultRotationValue_Exp+"' is displayed in value rotation output");
				                 		}else {
				                 			 fail(driver,"By default, '"+DefaultRotationValue_Exp+"' is not displayed in value rotation output");
				                 		}
				         	  		}
				         	  		
				         	  		if(TC_GROUPEDANDSORTED_DATA_LABEL_033.equals("Yes")) {
				         	  			setTestCaseID("TC_GROUPEDANDSORTED_ DATA_LABEL_033");
				         	  			if(IsElementEnabled(driver, ValueRotation_Input)) {
				         	  				moveSlider(driver,ValueRotation_Input,ValueRotation_Output,ChangeRotataionVal_DataLabel);
				         	         		scrollUsingElement(driver, ApplyButton);
				         	         		click(driver,ApplyButton);
				         	         		elementnotvisible1(driver, RPE_Loading);
				         	              	wait(driver,"1");
				         	              	String chartValueRotation_Act=getRotationValue(driver,EnableValue_);
				         	              	if(chartValueRotation_Act.equals(ChangeRotataionVal_DataLabel)) {
				         	         		    pass(driver,"Selected Rotation Angle ("+ChangeRotataionVal_DataLabel+") is Updated in chart value");
				         	         		}else {
				         	         	       	fail(driver,"Selected Rotation Angle ("+ChangeRotataionVal_DataLabel+") is not Updated in chart value");
				         	         		}
				         	  				
				         	  			}else {
				         	  				fail(driver,"Value Rotation input is not Accessible");
				         	  			}
				         	  		}
				         	  		 
				         	  		if(TC_GROUPEDANDSORTED_DATA_LABEL_006.equals("Yes")) {
				         	  			setTestCaseID("TC_GROUPEDANDSORTED_ DATA_LABEL_006");
				         	  			click(driver,EnableValue_InputSlider);
				         	  			if(isToggleEnable(driver,EnableValue_Input)) {
				                	  		 fail(driver,"Enable value toggle is not disabled when click on it");
				                	     }else {
				                	    	 pass(driver,"Enable value toggle is disabled when click on it");
				                	  		 
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
				                	     }
				         	  		}
				         	  		
				         	     }//Enable Value enabled
			    			 }
			    			 
			    			 if(TC_GROUPEDANDSORTED_DATA_LABEL_034.equals("Yes")) {
			    				 setTestCaseID("TC_GROUPEDANDSORTED_ DATA_LABEL_034");
			    				 mouseOverToElement(driver, DataLabels);
			    				 click(driver,DataLabels);
			    				 String DataLabelsClose_Act=getAttribute1(driver, DataLabels_Expand, "class");
	    	       	  			 if(DataLabelsClose_Act.contains("down")) {
	    	       	  				 pass(driver,"Data labels gets collapsed when click on it");
	    	       	  			 }else {
	    	       	  				 fail(driver,"Data Labels not gets collapsed when click on it");
	    	       	  			 }
			    			 }
			    		 }
			    	 }
			     }
				 // **************** Data Label Validation End ***************
				 
			     setTestCaseID("");
			     //*************** Data Label Validation Start ***************
			     String Grouped_And_Sorted_Others= getCellValue("TestExecution","Testcase_Selection","Grouped_And_Sorted_Others",Flag);
			     if(Grouped_And_Sorted_Others.equals("Yes")) {
			    	 String TC_GROUPEDANDSORTED_OTHERS_001=getTestcaseID_Flag(TestcaseFileName,SheetName_Others,TescasesID_Column,"TC_ GROUPEDANDSORTED_001",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_OTHERS_002=getTestcaseID_Flag(TestcaseFileName,SheetName_Others,TescasesID_Column,"TC_ GROUPEDANDSORTED_002",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_OTHERS_003=getTestcaseID_Flag(TestcaseFileName,SheetName_Others,TescasesID_Column,"TC_ GROUPEDANDSORTED_003",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_OTHERS_004=getTestcaseID_Flag(TestcaseFileName,SheetName_Others,TescasesID_Column,"TC_ GROUPEDANDSORTED_004",TestcaseID_Flag);
			    	 String TC_GROUPEDANDSORTED_OTHERS_005=getTestcaseID_Flag(TestcaseFileName,SheetName_Others,TescasesID_Column,"TC_ GROUPEDANDSORTED_005",TestcaseID_Flag);
			    	 
			    	 if(!Grouped_And_Sorted_Chart_Style.equals("Yes") && !Grouped_And_Sorted_Data_Labels.equals("Yes")) {
						 verifyElementDisplayed(driver,Chart_FormatSec);
		    		     click(driver,Chart_FormatSec);
					 }
			    	 
			    	 String OthersExpand=getAttribute1(driver, ChartFormat_OthersExpand, "class");
		    		 if(!OthersExpand.contains("up")) {
		    			fail(driver,"By default, 'Others' not gets Expand");
		    		 }else {
		    			pass(driver,"By default, 'Others' gets Expanded");
		    			setTestCaseID("TS_GROUPEDANDSORTED_ OTHERS_001");
		    			if(isDisplayed2(driver,Cursor_InputClick)) {
		    				if(TC_GROUPEDANDSORTED_OTHERS_001.equals("Yes")) {
					    		 setTestCaseID("TC_GROUPEDANDSORTED_ OTHERS_001");
					    		 if(!isToggleEnable(driver,Cursor_Input)) {		
					    			 fail(driver,"'Cursor Input toggle' is disabled by default"); 
						   		 }else {
						   	  		 pass(driver,"'Cursor Input toggle' is enabled by default"); 
						   	  		 if(TC_GROUPEDANDSORTED_OTHERS_002.equals("Yes")) {
						   	  			 setTestCaseID("TC_GROUPEDANDSORTED_ OTHERS_002");
						   	  			 mouseOverToElement(driver, ChartGraph);
						   	  			 if(isDisplayed2(driver,MouseCursor)) {
						   	  				 pass(driver,"Cursor is displayed in chart when cursor is enable"); 
						   	  			 }else {
						   	  				 fail(driver,"Cursor is not displayed in chart when cursor is enable");  
						   	  			 }
						   	  		 }
						   	  		
						   	  		 if(TC_GROUPEDANDSORTED_OTHERS_003.equals("Yes")) {
						   	  			 setTestCaseID("TC_GROUPEDANDSORTED_ OTHERS_003");
						   	  			 if(IsElementEnabled(driver, Cursor_Input)) {
						   	  				 click(driver,Cursor_InputClick);
						   	  				 if(isToggleEnable(driver,Cursor_Input)) {		
						   	  					 fail(driver,"'Cursor Input' is not disabled while click on it"); 
						   	  				 }else {
						   	  					 pass(driver,"'Cursor Input' is disabled while click on it"); 
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
						   	  				 fail(driver,"Cursor input is not Accessible");
						   	  			 }
						   	  		 }
						   		 }
		    				}
		    			}else {
		    				fail(driver,"Cursor input is not present, unable to perform Validation");
		    			}
		    			
		    			setTestCaseID("TS_GROUPEDANDSORTED_ OTHERS_002");
		    			if(isDisplayed2(driver,Export_InputClick)) {
		    				if(TC_GROUPEDANDSORTED_OTHERS_004.equals("Yes")) {
				   	  			 setTestCaseID("TC_GROUPEDANDSORTED_ OTHERS_004");
				   	  			 if(isToggleEnable(driver,Export_Input)) {		
				   	  				 fail(driver,"'Export Input' enable by default");
				   	  			 }else {
				   	  				 pass(driver,"'Export Input' disable by default"); 
				   	  				 if(isDisplayed2(driver,ExportChartOptions)) {
				   	  					 fail(driver,"'Export Options' is displayed in charts when Export chart is disabled"); 
				   	  				 }else {
				   	  					 pass(driver,"'Export Options' not displayed in charts when Export chart is disabled"); 
				   	  				 }
				   	  			 }
		    				}
		    				
		    				if(TC_GROUPEDANDSORTED_OTHERS_005.equals("Yes")) {
				   	  			 setTestCaseID("TC_GROUPEDANDSORTED_ OTHERS_005");
				   	  			 if(IsElementEnabled(driver, Export_Input)) {
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
				   	  				 
				   	  			 }else {
				   	  				 fail(driver,"Export Input toggle is not Accessible");
				   	  			 }
		    				}
		    			}else {
		    				fail(driver,"Export input toggle is not present, unable to perform Validation");
		    			}
		    		 }
			     }
			     
			     setTestCaseID("");
		    	 click(driver,ChartTitleInput);
				 clearAndType1(driver,ChartTitleInput,ChangeChartTitleName);		  		 
		  		 click(driver,SaveBtn_Chart);
		  		 elementnotvisible1(driver, RPE_Loading);
		  		 if(!isDisplayed2(driver,chartSaveError1) && isDisplayed(driver,SavedChartTitleInput)) {
		    		pass(driver,"Chart Saved Successfully");
		  		 }else {
		    		fail(driver,"Chart not Saved Successfully");
		  		 }	
			      
		  		 String AfterSaveChartTitleName=getText1(driver, SavedChartTitleName);
		  		 if(AfterSaveChartTitleName.equals(ChangeChartTitleName)) {
		    		//pass(driver,"Same Chart Title name displayed after saved the chart ");
		  		 }else {
		    		fail(driver,"Different Chart Title name displayed after saved the chart ");
		  		 }
			     
			 }// click Group and Sorted Widget
		} 
		
		
	}
	
}
