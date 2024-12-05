package scripts;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import commonMethods.Keywords;
import commonMethods.Utils;

public class DASHPRO_TREE_MAP_TESTING extends Keywords{

	public void treeMap_Testing(WebDriver driver,int iteration, String Flag) {
		
		String TestcaseFileName="DASHPRO_TREE_MAP";
		String SheetName_Axes="TREE_MAP_AXES";
		String SheetName_ChartStyle="TREE_MAP_CHARTSTYLE";
		String SheetName_DataLabels="TREE_MAP_DATA_LABELS";
		String SheetName_Others="TREE_MAP_OTHERS";
		String TestcaseID_Flag="Flag";
		String TescasesID_Column="TEST CASE ID";
		//Yes/No Input for Testcases Id
		String TC_TREEMAP_AXES_001=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ TREEMAP_001",TestcaseID_Flag);
		String TC_TREEMAP_AXES_002=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ TREEMAP_002",TestcaseID_Flag);
		String TC_TREEMAP_AXES_003=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ TREEMAP_003",TestcaseID_Flag);
		String TC_TREEMAP_AXES_004=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ TREEMAP_004",TestcaseID_Flag);
		String TC_TREEMAP_AXES_005=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ TREEMAP_005",TestcaseID_Flag);
		String TC_TREEMAP_AXES_006=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ TREEMAP_006",TestcaseID_Flag);
		String TC_TREEMAP_AXES_007=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ TREEMAP_007",TestcaseID_Flag);
		String TC_TREEMAP_AXES_008=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ TREEMAP_008",TestcaseID_Flag);
		String TC_TREEMAP_AXES_009=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ TREEMAP_009",TestcaseID_Flag);
		String TC_TREEMAP_AXES_010=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ TREEMAP_010",TestcaseID_Flag);
		String TC_TREEMAP_AXES_011=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ TREEMAP_011",TestcaseID_Flag);
		String TC_TREEMAP_AXES_012=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ TREEMAP_012",TestcaseID_Flag);
		String TC_TREEMAP_AXES_013=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ TREEMAP_013",TestcaseID_Flag);
		String TC_TREEMAP_AXES_014=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ TREEMAP_014",TestcaseID_Flag);
		String TC_TREEMAP_AXES_015=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ TREEMAP_015",TestcaseID_Flag);
		String TC_TREEMAP_AXES_016=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ TREEMAP_016",TestcaseID_Flag);
		String TC_TREEMAP_AXES_017=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ TREEMAP_017",TestcaseID_Flag);
		String TC_TREEMAP_AXES_018=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ TREEMAP_018",TestcaseID_Flag);
		String TC_TREEMAP_AXES_019=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ TREEMAP_019",TestcaseID_Flag);
		String TC_TREEMAP_AXES_020=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ TREEMAP_020",TestcaseID_Flag);
		String TC_TREEMAP_AXES_021=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ TREEMAP_021",TestcaseID_Flag);
		String TC_TREEMAP_AXES_022=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ TREEMAP_022",TestcaseID_Flag);
		String TC_TREEMAP_AXES_023=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ TREEMAP_023",TestcaseID_Flag);
		String TC_TREEMAP_AXES_024=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ TREEMAP_024",TestcaseID_Flag);
		String TC_TREEMAP_AXES_025=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ TREEMAP_025",TestcaseID_Flag);
		 //Data Labels
		 String DefaultFontSizeValue_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DefaultFontSizeValue");
		 String DefaultRoundOffValue_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DefaultRoundOffValue");
		 String DefaultRotationValue_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DefaultRotationValue");
	
		//Iteration inputs
		String Select_Categories_Value=Utils.getDataFromTestDataIteration(iteration,"Tree_Map_Widget_Testing", "Select_Categories_Value");
		String Select_Series_Value=Utils.getDataFromTestDataIteration(iteration,"Tree_Map_Widget_Testing", "Select_Series_Value");
		String Select_Agg_Value=Utils.getDataFromTestDataIteration(iteration,"Tree_Map_Widget_Testing", "Select_Agg_Value");
			
		//Chart title
 		String TypeBackgroundColor1_ChartTitle=Utils.getDataFromTestDataIteration(iteration,"Tree_Map_Widget_Testing", "TypeBackgroundColor1_ChartTitle");
 		String TypeTextColor1_ChartTitle=Utils.getDataFromTestDataIteration(iteration,"Tree_Map_Widget_Testing", "TypeTextColor1_ChartTitle");
 		String Change_FontFamily_ChartTitle=Utils.getDataFromTestDataIteration(iteration,"Tree_Map_Widget_Testing", "Change_FontFamily_ChartTitle");
 		String ChangeFontSize_ChartTitle=Utils.getDataFromTestDataIteration(iteration,"Tree_Map_Widget_Testing", "ChangeFontSize_ChartTitle");
 		String ChangeChartTitleName=Utils.getDataFromTestDataIteration(iteration,"Tree_Map_Widget_Testing", "ChangeChartTitleName");
 	
 		//Data Labels
 		String ChangeFontSizeValue_DataLabel=Utils.getDataFromTestDataIteration(iteration,"Tree_Map_Widget_Testing", "ChangeFontSizeValue_DataLabel");
 		String ChangeRoundOffValue_DataLabel=Utils.getDataFromTestDataIteration(iteration,"Tree_Map_Widget_Testing", "ChangeRoundOffValue_DataLabel");
 		String ChangeRotataionVal_DataLabel=Utils.getDataFromTestDataIteration(iteration,"Tree_Map_Widget_Testing", "ChangeRotataionVal_DataLabel");
 		
		setTestCaseID(" ");
		Actions action=new Actions(driver);
		mouseOverToElement(driver, ADDTabPlus);
  	    mouseOverAndClick(driver, ADDTabPlus);
  	    wait(driver,"1");
  	    sendKeys(driver,newlyAddedTab,"TreeMapWidgetTest");
  	    click(driver,DashProPage);
  	    elementnotvisible1(driver, RPE_Loading);
		waitForElement(driver,ADD_widget_rightTop);
	    click(driver,ADD_widget_rightTop);
	    elementnotvisible(driver,Loading);
	    elementnotvisible1(driver, RPE_Loading);
		waitForElement(driver,WidgetPanel);
		waitForElement(driver,Sparkline_widget);
		
		
		if(TC_TREEMAP_AXES_001.equals("Yes")) {
			setTestCaseID("TC_TREEMAP_AXES_001");
			waitForElement(driver,Tree_map_widget);
			verifyElementDisplayed(driver, Tree_map_widget);
		}
		
		if(TC_TREEMAP_AXES_002.equals("Yes")) {
			setTestCaseID("TC_TREEMAP_AXES_002");
			WidgetValidation(driver,Tree_map_widget,"Tree Map");
		}
		
		if(TC_TREEMAP_AXES_003.equals("Yes")) {
			setTestCaseID("TC_TREEMAP_AXES_003");
			click(driver,Tree_map_widget);
			if(isDisplayed2(driver,error)){
				 String errorWidget=getText1(driver,error);
				 if(errorWidget.contains("Please refer the logs in Logs")) {
					 fail(driver,"Error displayed When click Tree Map Widget, Validation : "+errorWidget);
				 }else {
					 pass(driver,"Error displayed When click Tree Map Widget, Validation : "+errorWidget);
				 }
				 elementnotvisible1(driver, error);
			 }else {
				 elementnotvisible1(driver, Loading);
				 String widgetValue=getText1(driver,WidgetValue);
				 if(widgetValue.equals("Tree Map")) {
					 pass(driver,"'Tree Map' displayed as the selected Widget after click on it");
				 }else {
					 fail(driver,"'Tree Map' not displayed as the selected Widget after click on it");
				 }
				 
				 if(TC_TREEMAP_AXES_004.equals("Yes")) {
					 setTestCaseID("TC_TREEMAP_AXES_004");
					 String AxesExpand=getAttribute1(driver,Axes_Expand,"class");
					 if(!AxesExpand.contains("up")) {
						 fail(driver,"By default, Axes Section is not Expanded");
					 }else {
						 pass(driver,"By default, Axes Section is Expanded");
						 if(TC_TREEMAP_AXES_005.equals("Yes")) {
							 setTestCaseID("TC_TREEMAP_AXES_005");
							 scrollUsingElement(driver, ApplyButton);
							 click(driver,ApplyButton);
							 if(isDisplayed2(driver,CategoryError_Network)) {
								 pass(driver,"'Kindly select atleast one category' error is displayed When Click Apply button without providing inputs");
							 }else {
								 fail(driver,"'Kindly select atleast one category' error is not displayed When Click Apply button without providing inputs");
							 }	
							 elementnotvisible1(driver, CategoryError_Network);
						 }
						 
						 if(TC_TREEMAP_AXES_006.equals("Yes")) {
							 setTestCaseID("TC_TREEMAP_AXES_006");
							 if(IsElementEnabled(driver, Categories_Input)) {
								 click(driver,Categories_Input);
								 if(isDisplayed2(driver,Categories_DropdownExpand)) {
									 pass(driver,"Categories dropdown is expanded after click on it ");
									 if(TC_TREEMAP_AXES_007.equals("Yes")) {
										 setTestCaseID("TC_TREEMAP_AXES_007");
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
									 
									 if(TC_TREEMAP_AXES_008.equals("Yes")) {
										 setTestCaseID("TC_TREEMAP_AXES_008");
										 String Categorical1=getText1(driver,CategoricalColumnAxisDropdown);
										 if(Categorical1.contains("(")) {
											 pass(driver,"Unique values are displayed in the Categorical Column in the Categories dropdown");
										 }else {
											 fail(driver,"Unique values are not displayed in the Categorical Column in the Categories dropdown");
										 }
									 }
									 
									 if(TC_TREEMAP_AXES_013.equals("Yes")) {
										 setTestCaseID("TC_TREEMAP_AXES_013");
										 ScrollBarValidation1(driver,Categories_DropdownExpand,"Categories_dropdown");
									 }
									 
									 if(TC_TREEMAP_AXES_012.equals("Yes")) {
										 setTestCaseID("TC_TREEMAP_AXES_012");
										 List<WebElement> AvailableList_Categories_Axis=getWebElements(driver, AvailableList_Dropdown);
										 int columnListCount=AvailableList_Categories_Axis.size();
											if(columnListCount>10) {
												for (int k=0;k<=10;k++) {
													WebElement availableColumn=AvailableList_Categories_Axis.get(k);
													action.moveToElement(availableColumn).click().build().perform();
												}
												mouseOverAndClick(driver, CategoriesText);
												scrollUsingElement(driver, ApplyButton);
												click(driver,ApplyButton);
												if(isDisplayed(driver,Categories_Limit_Error)) {
													pass(driver,"'Kindly select less than or equal to 10 column for Categories' error displayed when Selecting more than 10 value in the categories dropdown");
												}else {
													fail(driver,"'Kindly select less than or equal to 10 column for Categories' error not displayed when Selecting more than 10 value in the categories dropdown");
												}
											}
											while(isDisplayed(driver,RemoveOption)) {
												WebElement RemoveSelectList=getWebElement(driver,RemoveOption);
												action.moveToElement(RemoveSelectList).click().build().perform();
												wait(driver,"1");
											}
											elementnotvisible1(driver, Categories_Limit_Error);
									 }
									 
									 if(TC_TREEMAP_AXES_009.equals("Yes")) {
										 setTestCaseID("TC_TREEMAP_AXES_009");
										 click(driver,Categories_Input);
										 if(isDisplayed2(driver, Categories_DropdownExpand)) {
											 if(verifyElementDisplayed(driver, dropdownInputsearchBox)) {
												 if(TC_TREEMAP_AXES_010.equals("Yes")) {
													 setTestCaseID("TC_TREEMAP_AXES_010");
													 sendKeys(driver,dropdownInputsearchBox,"sdgffh");
													 if(isDisplayed(driver, NoResultsFound)) {
														 pass(driver,"'No results found' displayed when user enter incorrect value in categories search input");
													 }else {
														 fail(driver,"'No results found' not displayed when user enter incorrect value in categories search input");
													 }
													 clear2(driver,dropdownInputsearchBox);
												 }
												 
												 if(TC_TREEMAP_AXES_011.equals("Yes")) {
													 setTestCaseID("TC_TREEMAP_AXES_011");
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
									 }
									 
									 if(TC_TREEMAP_AXES_014.equals("Yes")) {
										 setTestCaseID("TC_TREEMAP_AXES_014");
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
										 
										 if(TC_TREEMAP_AXES_015.equals("Yes")) {
											 setTestCaseID("TC_TREEMAP_AXES_015");
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
									 fail(driver,"Categories dropdown is not expanded after click on it ");
								 }
								 Escape(driver);
							 }else {
								 fail(driver,"Categories input not accessible");
							 }
						 }
						 setTestCaseID("");
						 if(IsElementEnabled(driver, Series_Input)) {
							 if(TC_TREEMAP_AXES_016.equals("Yes")) {
								 setTestCaseID("TC_TREEMAP_AXES_016");
								 String default_Series_Act=getText1(driver,Series_Input);
								 if(default_Series_Act.equals("Select")) {
									 pass(driver,"By Default 'Select' is selected in the Series value input");
								 }else {
									 fail(driver,"By Default 'Select' is not selected in the Series value input");
								 }
							 }
							 
							 if(TC_TREEMAP_AXES_017.equals("Yes")) {
								 setTestCaseID("TC_TREEMAP_AXES_017");
					 			 click(driver,Series_Input);
							 	 if(isDisplayed2(driver,Series_DropdownExpand)) {
							 		 pass(driver,"Series dropdown is expanded after click on it ");
							 		 if(TC_TREEMAP_AXES_018.equals("Yes")) {
										 setTestCaseID("TC_TREEMAP_AXES_018");
										 List<WebElement> displayedDataImage=getWebElements(driver, dataTypeImages);
										 boolean Numerical=true;
										 for(WebElement dataImag:displayedDataImage) {
											 action.moveToElement(dataImag).build().perform();
											 String dataTypeDisplay=dataImag.getAttribute("src");
											 if(dataTypeDisplay.contains("Numerical")) {
												 
											 }else {
												 fail(driver,"Other than Numerical datatype column is displayed in the Series dropdown");
												 Numerical=false;
												 break;
											 }
										 }
										 if(Numerical) {
											 pass(driver, "Only Numerical datatype column is displayed in the Series dropdown");
										 } 
							 		 }
							 		 
							 		 if(TC_TREEMAP_AXES_019.equals("Yes")) {
										 setTestCaseID("TC_TREEMAP_AXES_019");
										 sendKeys(driver,dropdownInputsearchBox,"afghjku");
										 if(isDisplayed2(driver,NoResultsFound)) {
											 pass(driver,"'No Results found' message is displayed in while searching invalid value in the Series dropdown input");
										 }else {
											 fail(driver,"'No Results found' message is not displayed in while searching invalid value in the Series dropdown input");
										 }
										 clear2(driver,dropdownInputsearchBox);
							 		 }
							 		 
							 		 if(TC_TREEMAP_AXES_020.equals("Yes")) {
										 setTestCaseID("TC_TREEMAP_AXES_020");
										 sendKeys(driver, dropdownInputsearchBox, Select_Series_Value);
										 String firstValue_=getText1(driver,FirstSearchedvalue);
										 if(firstValue_.contains(Select_Series_Value)) {
											 pass(driver,"Searched Value correctly displayed first in the Series dropdown");
										 }else {
											 fail(driver,"Searched Value not correctly displayed first in the Series dropdown");
										 }
							 		 }
							 		 
							 		 if(TC_TREEMAP_AXES_021.equals("Yes")) {
										 setTestCaseID("TC_TREEMAP_AXES_021");
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
							 	 Escape(driver);
							 }
						 }else {
							 fail(driver,"Series input not accessible");
						 }
						 setTestCaseID("");
						 if(IsElementEnabled(driver, Agg_Input)) {
							 pass(driver,"Aggregation input is enabled");
							 if(TC_TREEMAP_AXES_022.equals("Yes")) {
								 setTestCaseID("TC_TREEMAP_AXES_022");
								 String defaultAgg=defaultSelectedValue(driver, Agg_Input);
								 if(defaultAgg.equalsIgnoreCase("Sum")) {
									 pass(driver,"By default Sum is selected in the Aggregation input");
								 }else {
									 fail(driver,"By default Sum is not selected in the Aggregation input, Act : "+defaultAgg);
								 }
							 }
							 
							 if(TC_TREEMAP_AXES_023.equals("Yes")) {
								 setTestCaseID("TC_TREEMAP_AXES_023");
								 click(driver,Agg_Input);
								 verifyElementIsPresent1(driver, Sum);
								 verifyElementIsPresent1(driver, Count);
								 verifyElementIsPresent1(driver, Average);
								 verifyElementIsPresent1(driver, Min);
								 verifyElementIsPresent1(driver, Max);
								 verifyElementIsPresent1(driver, Unique);
							 }
							 if(TC_TREEMAP_AXES_024.equals("Yes")) {
								 setTestCaseID("TC_TREEMAP_AXES_024");
								 DASHPRO_BAR_SMOKE_TESTING bar=new DASHPRO_BAR_SMOKE_TESTING();
								 bar.aggregationValidation2(driver);
								 selectByText(driver, Agg_Input, Select_Agg_Value);	
							 }
						 }else {
							 fail(driver,"Aggregation input is not enabled");
						 }
						 
						 if(TC_TREEMAP_AXES_025.equals("Yes")) {
							 setTestCaseID("TC_TREEMAP_AXES_025");
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
						 
					 } //axes expanded
				 }//axes check
				 
				// ******************** Axes Validation End *******************
				setTestCaseID("");
		       // ******************** ChartTitle Validation Start *******************
				 String TreeMap_Chart_Title= getCellValue("TestExecution","Testcase_Selection","TreeMap_Chart_Title",Flag);
				 if(TreeMap_Chart_Title.equals("Yes")) {
					 CHART_TITLE chartTitle=new CHART_TITLE();
					 chartTitle.chartTitleTest(driver, TypeBackgroundColor1_ChartTitle, TypeTextColor1_ChartTitle, Change_FontFamily_ChartTitle, ChangeFontSize_ChartTitle,ChangeChartTitleName);       	
				 }
              // ******************** ChartTitle Validation End *******************
			  setTestCaseID("");
			  // ******************** Chart Style Validation Start ******************* 
			  String TreeMap_ChartFormat_Chart_Style= getCellValue("TestExecution","Testcase_Selection","TreeMap_ChartFormat_Chart_Style",Flag);
			  if(TreeMap_ChartFormat_Chart_Style.equals("Yes")) {
				  String TC_TREE_MAP_CHART_STYLE_001=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_TREEMAP_001",TestcaseID_Flag);
				  String TC_TREE_MAP_CHART_STYLE_002=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_TREEMAP_002",TestcaseID_Flag);
				  String TC_TREE_MAP_CHART_STYLE_003=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_TREEMAP_003",TestcaseID_Flag);
				  String TC_TREE_MAP_CHART_STYLE_004=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_TREEMAP_004",TestcaseID_Flag);
				  String TC_TREE_MAP_CHART_STYLE_005=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_TREEMAP_005",TestcaseID_Flag);
				  String TC_TREE_MAP_CHART_STYLE_006=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_TREEMAP_006",TestcaseID_Flag);
				  String TC_TREE_MAP_CHART_STYLE_007=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_TREEMAP_007",TestcaseID_Flag);
				  String TC_TREE_MAP_CHART_STYLE_008=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_TREEMAP_008",TestcaseID_Flag);
				  String TC_TREE_MAP_CHART_STYLE_009=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_TREEMAP_009",TestcaseID_Flag);
				  String TC_TREE_MAP_CHART_STYLE_010=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_TREEMAP_010",TestcaseID_Flag);
				  String TC_TREE_MAP_CHART_STYLE_011=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_TREEMAP_011",TestcaseID_Flag);
				  String TC_TREE_MAP_CHART_STYLE_012=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_TREEMAP_012",TestcaseID_Flag);
				  String TC_TREE_MAP_CHART_STYLE_013=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_TREEMAP_013",TestcaseID_Flag);

				  String DefaultThemeValue_Exp=Utils.getDataFromTestData("ChartFormat_ChartStyle", "defaultThemeValue_Exp");
				  String Change_ChartTheme_ChartStyle=Utils.getDataFromTestDataIteration(iteration,"Tree_Map_Widget_Testing", "Change_ChartTheme_ChartStyle");
					
				  if(TC_TREE_MAP_CHART_STYLE_001.equals("Yes")) {
					  setTestCaseID("TC_TREE_MAP_ CHART_STYLE_001");
					  verifyElementDisplayed(driver,Chart_FormatSec);
					  click(driver,Chart_FormatSec);
					  String ChartFormatOpenstatus=getAttribute1(driver, chartFormatExpand, "class");
					  if(ChartFormatOpenstatus.contains("up")) {
						  pass(driver,"Chart Format is expanded when clicking the Chart Format");
						  if(TC_TREE_MAP_CHART_STYLE_002.equals("Yes")) {
							  setTestCaseID("TC_TREE_MAP_ CHART_STYLE_002");
							  String ChartStylingExpand=getAttribute1(driver, ChartStyling_Expand, "class");
							  if(!ChartStylingExpand.contains("up")) {
								  fail(driver,"By default, Chart Styling not gets Expand");
							  }else {
								  pass(driver,"By default, Chart Styling gets Expanded");
								  setTestCaseID("TS_TREEMAP_002");
								  if(IsElementEnabled(driver, ChartThemeInput)){
									  pass(driver,"Chart theme is Enabled");
									  if(TC_TREE_MAP_CHART_STYLE_003.equals("Yes")) {
										  setTestCaseID("TC_TREE_MAP_ CHART_STYLE_003");
										  String defaultThemeValue_Act=getText1(driver,ChartThemeInput);
										  if(defaultThemeValue_Act.equals(DefaultThemeValue_Exp)) {
											  pass(driver,"By default, Chart theme selected the value as '"+DefaultThemeValue_Exp+"'");
										  }else {
											  fail(driver,"By default, '"+DefaultThemeValue_Exp+"' value not selected in the  Chart theme input");
										  }
									  }
									  
									  if(TC_TREE_MAP_CHART_STYLE_004.equals("Yes")) {
										  setTestCaseID("TC_TREE_MAP_ CHART_STYLE_004");
										  click(driver,ChartThemeInput);
										  if(verifyElementDisplayed(driver,ChartThemeResults)) {
											  if(TC_TREE_MAP_CHART_STYLE_005.equals("Yes")) {
												  setTestCaseID("TC_TREE_MAP_ CHART_STYLE_005");
												  if(verifyElementDisplayed(driver, dropdownInputsearchBox)) {
													  if(TC_TREE_MAP_CHART_STYLE_006.equals("Yes")) {
														  setTestCaseID("TC_TREE_MAP_ CHART_STYLE_006");
														  sendKeys(driver,dropdownInputsearchBox,"sdgffh");
														  if(isDisplayed(driver, NoResultsFound)) {
															  pass(driver,"'No results found' displayed when user enter incorrect chart theme");
														  }else {
															  fail(driver,"'No results found' not displayed when user enter incorrect chart theme");
														  }
														  clear1(driver,dropdownInputsearchBox);
													  }
													  
													  if(TC_TREE_MAP_CHART_STYLE_007.equals("Yes")) {
														  setTestCaseID("TC_TREE_MAP_ CHART_STYLE_007");
														  sendKeys(driver,dropdownInputsearchBox,Change_ChartTheme_ChartStyle);
														  String resultText=getText1(driver,chartThemeFirstResult);
														  if(resultText.equals(Change_ChartTheme_ChartStyle)) {
															  pass(driver,"Search input in the Chart Theme dropdown works properly");
														  }else {
															  fail(driver,"Search input in the Chart Theme dropdown not works properly");
														  }
													  }
												  }
											  }
											  
											  if(TC_TREE_MAP_CHART_STYLE_008.equals("Yes")) {
												  setTestCaseID("TC_TREE_MAP_ CHART_STYLE_008");
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
								  }else {
									  fail(driver,"Chart theme is not Enabled");
								  }
								  
								  setTestCaseID("TS_TREEMAP_003");
								  if(IsElementEnabled(driver, X_Scroll_toggle)){
									  if(TC_TREE_MAP_CHART_STYLE_009.equals("Yes")) {
										  setTestCaseID("TC_TREE_MAP_ CHART_STYLE_009");
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
									  
									  if(TC_TREE_MAP_CHART_STYLE_010.equals("Yes")) {
										  setTestCaseID("TC_TREE_MAP_ CHART_STYLE_010");
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
									  fail(driver,"X Scroll toggle is not Accessible");
								  }
								  
								  setTestCaseID("TS_TREEMAP_004");
								  if(IsElementEnabled(driver, Y_Scroll_toggle)){
									  if(TC_TREE_MAP_CHART_STYLE_011.equals("Yes")) {
										  setTestCaseID("TC_TREE_MAP_ CHART_STYLE_011");
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
									  
									  if(TC_TREE_MAP_CHART_STYLE_012.equals("Yes")) {
										  setTestCaseID("TC_TREE_MAP_ CHART_STYLE_012");
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
								  }
								 
								  if(TC_TREE_MAP_CHART_STYLE_013.equals("Yes")) {
									  setTestCaseID("TC_TREE_MAP_ CHART_STYLE_013");
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
						  }
		   	  				
					  }else {
						 fail(driver,"Chart Format is not expanded when clicking the Chart Format");
					  }
				  }
			  }
			  // ******************** Chart Style Validation End ******************* 
			  
			  setTestCaseID("");
			// ******************** DataLabels Validation Start *******************
			 String TreeMap_ChartFormat_Data_Labels= getCellValue("TestExecution","Testcase_Selection","TreeMap_ChartFormat_Data_Labels",Flag);
			 if(TreeMap_ChartFormat_Data_Labels.equals("Yes")) {
			     String TC_TREEMAP_DATA_LABELS_001=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_TREEMAP_001",TestcaseID_Flag);
			     String TC_TREEMAP_DATA_LABELS_002=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_TREEMAP_002",TestcaseID_Flag);
			     String TC_TREEMAP_DATA_LABELS_003=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_TREEMAP_003",TestcaseID_Flag);
			     String TC_TREEMAP_DATA_LABELS_004=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_TREEMAP_004",TestcaseID_Flag);
			     String TC_TREEMAP_DATA_LABELS_005=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_TREEMAP_005",TestcaseID_Flag);
			     String TC_TREEMAP_DATA_LABELS_006=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_TREEMAP_006",TestcaseID_Flag);
			     String TC_TREEMAP_DATA_LABELS_007=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_TREEMAP_007",TestcaseID_Flag);
			     String TC_TREEMAP_DATA_LABELS_008=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_TREEMAP_008",TestcaseID_Flag);
			     String TC_TREEMAP_DATA_LABELS_009=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_TREEMAP_009",TestcaseID_Flag);
			     String TC_TREEMAP_DATA_LABELS_010=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_TREEMAP_010",TestcaseID_Flag);
			     String TC_TREEMAP_DATA_LABELS_011=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_TREEMAP_011",TestcaseID_Flag);
			     String TC_TREEMAP_DATA_LABELS_012=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_TREEMAP_012",TestcaseID_Flag);
			     String TC_TREEMAP_DATA_LABELS_013=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_TREEMAP_013",TestcaseID_Flag);
			     String TC_TREEMAP_DATA_LABELS_014=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_TREEMAP_014",TestcaseID_Flag);

			     if(!TreeMap_ChartFormat_Chart_Style.equals("Yes")) {
					 verifyElementDisplayed(driver,Chart_FormatSec);
	    		     click(driver,Chart_FormatSec);
				 }
			     
			     if(TC_TREEMAP_DATA_LABELS_001.equals("Yes")) {
		    		 setTestCaseID("TC_TREEMAP_ DATA_LABELS_001");
		    		 String DataLabelsExpand=getAttribute1(driver, DataLabels_Expand, "class");
		    		 if(!DataLabelsExpand.contains("up")) {
		    			 fail(driver,"By default, Data labels not gets Expanded");
		    		 }else {
		    			 pass(driver,"By default, Data labels gets Expanded");
		    			 if(TC_TREEMAP_DATA_LABELS_002.equals("Yes")) {
				    		 setTestCaseID("TC_TREEMAP_ DATA_LABELS_002");
				    		 verifyElementDisplayed(driver, ValueFontSize_text);
				    		 verifyElementDisplayed(driver, ValueFontSizeInput);

				    		 verifyElementDisplayed(driver, RoundOffValue_text);
				    		 verifyElementDisplayed(driver, RoundOffValueInput);
				    		 
				    		 verifyElementDisplayed(driver, BigNumberSuffix_text);
				    		 verifyElementDisplayed(driver, BigNumberInputSlider);
				    		 
				    		 verifyElementDisplayed(driver, ValueRotation_text);
				    		 verifyElementDisplayed(driver, ValueRotation_Input);
		    			 }
		    			 
		    			 if(TC_TREEMAP_DATA_LABELS_003.equals("Yes")) {
				    		 setTestCaseID("TC_TREEMAP_ DATA_LABELS_003");
				    		 String defaultFontSize_Act=defaultSelectedValue(driver, ValueFontSizeInput);
				    		 if(DefaultFontSizeValue_Exp.equals(defaultFontSize_Act)) {
				    			 pass(driver,"By default, '"+DefaultFontSizeValue_Exp+"' is selected in the Value Font Size Input"); 
				    		 }else {
				    			 fail(driver,"By default, '"+DefaultFontSizeValue_Exp+"' is not selected in the Value Font Size Input"); 
				    		 }
		    			 }
		    			 
		    			 if(TC_TREEMAP_DATA_LABELS_004.equals("Yes")) {
				    		 setTestCaseID("TC_TREEMAP_ DATA_LABELS_004");
			    			 if(IsElementEnabled(driver, ValueFontSizeInput)) {
			    				 pass(driver,"Value Font Size input is accessible");
			    				 if(TC_TREEMAP_DATA_LABELS_005.equals("Yes")) {
						    		 setTestCaseID("TC_TREEMAP_ DATA_LABELS_005");
						    		 click(driver,ValueFontSizeInput);
						    		 verifyElementIsPresent1(driver, ValueFontSizeOptions);
			    				 }
			    				 
			    				 if(TC_TREEMAP_DATA_LABELS_006.equals("Yes")) {
						    		 setTestCaseID("TC_TREEMAP_ DATA_LABELS_006");
						    		 selectOptionValue(driver,ValueFontSizeInput,ChangeFontSizeValue_DataLabel);
						    		 scrollUsingElement(driver, ApplyButton);   
						    		 click(driver,ApplyButton);
						    		 elementnotvisible1(driver, RPE_Loading);
						    		 if(verifyElementDisplayed(driver,Chart_Section)) {
						    			 String ValueFontSizeAct=getFontSize(driver,EnableValue);
						    			 if(ValueFontSizeAct.equals(ChangeFontSizeValue_DataLabel)) {
						    				 pass(driver,"The chart's value displayed with Selected '"+ChangeFontSizeValue_DataLabel+"' font size."); 
						    			 }else {
						    				 fail(driver,"The chart's value not displayed with Selected '"+ChangeFontSizeValue_DataLabel+"' font size."); 
						    			 }
						    		 }
						    		 
			    				 }
			    				 
			    			 }else {
			    				 fail(driver,"Value Font Size input not accessible");
			    			 }
	    				 }
	    				 
		    			 if(TC_TREEMAP_DATA_LABELS_007.equals("Yes")) {
				    		 setTestCaseID("TC_TREEMAP_ DATA_LABELS_007");
				    		 String defaultRoundOffValue_Act=defaultSelectedValue(driver, RoundOffValueInput);
				    		 if(DefaultRoundOffValue_Exp.equals(defaultRoundOffValue_Act)) {
				    			 pass(driver,"By default, '"+DefaultRoundOffValue_Exp+"' is selected in the RoundOffValue Input"); 
				    		 }else {
				    			 fail(driver,"By default, '"+DefaultRoundOffValue_Exp+"' is not selected in the RoundOffValue Input"); 
				    		 }
		    			 }
		    			 
		    			 if(TC_TREEMAP_DATA_LABELS_008.equals("Yes")) {
				    		 setTestCaseID("TC_TREEMAP_ DATA_LABELS_008");
				    		 if(isToggleAccessible(driver,RoundOffValueInput)) {		
				    			 pass(driver,"'RoundOff Value Input' is accessible ");
				    			 click(driver,RoundOffValueInput);
				    			 verifyElementIsPresent1(driver, RoundOffValueOptions);
				    			 if(TC_TREEMAP_DATA_LABELS_009.equals("Yes")) {
						    		 setTestCaseID("TC_TREEMAP_ DATA_LABELS_009");
						    		 selectByText(driver,RoundOffValueInput,ChangeRoundOffValue_DataLabel);
						    		 scrollUsingElement(driver, ApplyButton);
						    		 click(driver,ApplyButton);
						    		 elementnotvisible1(driver, RPE_Loading);
						    		 if(verifyElementDisplayed(driver,Chart_Section)) {
						    			 mouseOverToElement(driver, dataLableValue_);
						    			 String ChartValueTextAct=getText1(driver,dataLableValue_Tooltip); 
						    			 if(ChartValueTextAct.contains("…") ||ChartValueTextAct.equals("") ) {
						    				 pass(driver,"Unable to validate the Roundoff value for the enabled Value : "+ChartValueTextAct); 
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
						    					 fail(driver,"The chart's value not displayed with Selected '"+ChangeRoundOffValue_DataLabel+"' RoundOff Value , ActText : "+ChartValueTextAct); 
						    				 } 
						    			 }
						    		 }
						    		 
				    			 }
				    			 
				    		 }else {
				    			 fail(driver,"'RoundOff Value Input' is not accessible "); 
				    		 }
		    			 }
		    			 
		    			 if(TC_TREEMAP_DATA_LABELS_010.equals("Yes")) {
				    		 setTestCaseID("TC_TREEMAP_ DATA_LABELS_010");
				    		 if(isToggleEnable(driver, BigNumberInput)) {
         						fail(driver,"BigNumber Suffix toggle is enabled by default");
         					 }else {
         						pass(driver,"BigNumber Suffix toggle is disabled by default");
         					 }
		    			 }
		    			 
		    			 if(TC_TREEMAP_DATA_LABELS_011.equals("Yes")) {
				    		 setTestCaseID("TC_TREEMAP_ DATA_LABELS_011");
				    		 if(IsElementEnabled(driver, BigNumberInput)) {
				    			 click(driver,BigNumberInputSlider);
	         					 wait(driver,"1");
	         					 if(isToggleEnable(driver, BigNumberInput)) {
	         					 	pass(driver,"BigNumber Suffix toggle is enabled Successfully after click on it");
	         					 	scrollUsingElement(driver, ApplyButton);
	         					 	click(driver,ApplyButton);
	         					 	elementnotvisible1(driver, RPE_Loading);
	         					 	if(verifyElementDisplayed(driver,Chart_Section)) {
	         					 		mouseOverToElement(driver, dataLableValue_);
	         					 		String ChartValueTextAct=getText1(driver,dataLableValue_Tooltip); 
	         					 		if(ChartValueTextAct.contains("…") ||ChartValueTextAct.equals("") ) {
	         					 			pass(driver,"Unable to validate the BigNumber Suffix value for the enabled Value : "+ChartValueTextAct); 
	         					 		}else {
						    				 if(ChartValueTextAct.endsWith("K")||ChartValueTextAct.endsWith("k")) {
						    					 pass(driver,"Big Number Suffix applied in the chart value properly"); 
						    				 }else {
						    					 fail(driver,"Big number Suffix value not applied properly in the chart value , ActText : "+ChartValueTextAct); 
						    				 } 
	         					 		}
	         					 	}
	         					 	
	         					 }else {
	         						fail(driver,"BigNumber Suffix toggle is not enabled Successfully after click on it");
	         					 }
				    		 }else {
				    			 fail(driver,"BigNumber Suffix toggle is not Accessible");
				    		 }
		    			 }
		    			 
		    			 if(TC_TREEMAP_DATA_LABELS_012.equals("Yes")) {
				    		 setTestCaseID("TC_TREEMAP_ DATA_LABELS_012");
				    		 String defaultRotationValue_Act=getText1(driver,ValueRotation_Output);
				    		 if(DefaultRotationValue_Exp.equals(defaultRotationValue_Act)) {
				    			 pass(driver,"By default, '"+DefaultRotationValue_Exp+"' is displayed in value rotation output");
				    		 }else {
				    			 fail(driver,"By default, '"+DefaultRotationValue_Exp+"' is not displayed in value rotation output");
				    		 } 
		    			 }
		    			 
		    			 
		    			 if(TC_TREEMAP_DATA_LABELS_013.equals("Yes")) {
				    		 setTestCaseID("TC_TREEMAP_ DATA_LABELS_013");
				    		 if(IsElementEnabled(driver, ValueRotation_Input)) {
				    			 moveSlider(driver,ValueRotation_Input,ValueRotation_Output,ChangeRotataionVal_DataLabel);
				    			 scrollUsingElement(driver, ApplyButton);
				    			 click(driver,ApplyButton);
				    			 elementnotvisible1(driver, RPE_Loading);
				    			 String chartValueRotation_Act=getRotationValue(driver,EnableValue);
				    			 if(chartValueRotation_Act.equals(ChangeRotataionVal_DataLabel)) {
				    				 pass(driver,"Selected positive Rotation Angle ("+ChangeRotataionVal_DataLabel+") is Updated in chart value");
				    			 }else {
				    				 fail(driver,"Selected positive Rotation Angle ("+ChangeRotataionVal_DataLabel+") is not Updated in chart value");
				    			 }
				    		 }else {
				    			 fail(driver,"Value Rotation input is not accessible");
				    		 }
		    			 }
		    			 
		    			 if(TC_TREEMAP_DATA_LABELS_014.equals("Yes")) {
				    		 setTestCaseID("TC_TREEMAP_ DATA_LABELS_014");
				    		 mouseOverToElement(driver, DataLabels);
				 	       	 click(driver,DataLabels);
				 	       	 String DataLabelsClose_Act=getAttribute1(driver, DataLabels_Expand, "class");
				 	  		 if(DataLabelsClose_Act.contains("down")) {
				 	  		 	pass(driver,"Data labels gets collapsed when click on it");
				 	  		 }else {
				 	  		 	fail(driver,"Data Labels not gets collapsed when click on it");
				 	  		 }
		    			 }
		    			 
		    		 }//DataLabel expand
			     }
			 }
			// ********************Data Label Validation End *******************
			  setTestCaseID("");
			// ********************Others Validation Start *******************
			  String TreeMap_ChartFormat_Others= getCellValue("TestExecution","Testcase_Selection","TreeMap_ChartFormat_Others",Flag);
			  if(TreeMap_ChartFormat_Others.equals("Yes")) {
			     String TC_TREEMAP_OTHERS_001=getTestcaseID_Flag(TestcaseFileName,SheetName_Others,TescasesID_Column,"TC_TREEMAP_001",TestcaseID_Flag);
			     String TC_TREEMAP_OTHERS_002=getTestcaseID_Flag(TestcaseFileName,SheetName_Others,TescasesID_Column,"TC_TREEMAP_002",TestcaseID_Flag);
			     String TC_TREEMAP_OTHERS_003=getTestcaseID_Flag(TestcaseFileName,SheetName_Others,TescasesID_Column,"TC_TREEMAP_003",TestcaseID_Flag);
			     String TC_TREEMAP_OTHERS_004=getTestcaseID_Flag(TestcaseFileName,SheetName_Others,TescasesID_Column,"TC_TREEMAP_004",TestcaseID_Flag);
			     String TC_TREEMAP_OTHERS_005=getTestcaseID_Flag(TestcaseFileName,SheetName_Others,TescasesID_Column,"TC_TREEMAP_005",TestcaseID_Flag);
			     String TC_TREEMAP_OTHERS_006=getTestcaseID_Flag(TestcaseFileName,SheetName_Others,TescasesID_Column,"TC_TREEMAP_006",TestcaseID_Flag);
			      
			     if(!TreeMap_ChartFormat_Chart_Style.equals("Yes") &&!TreeMap_ChartFormat_Data_Labels.equals("Yes") ) {
					 verifyElementDisplayed(driver,Chart_FormatSec);
	    		     click(driver,Chart_FormatSec);
				 }
			     setTestCaseID("TS_TREEMAP_ OTHERS_001");
			     if(verifyElementDisplayed(driver, ChartFormat_Others)) {
		    		 if(TC_TREEMAP_OTHERS_001.equals("Yes")) {
		    			 setTestCaseID("TC_TREEMAP_ OTHERS_001");
		    			 String OthersExpand=getAttribute1(driver, ChartFormat_OthersExpand, "class");
			    		 if(!OthersExpand.contains("up")) {
			    			fail(driver,"By default, 'Others' not gets Expand");
			    		 }else {
			    			pass(driver,"By default, 'Others' gets Expanded");
			    			if(TC_TREEMAP_OTHERS_002.equals("Yes")) {
				    			 setTestCaseID("TC_TREEMAP_ OTHERS_002");
				    			 verifyElementDisplayed(driver,Cursor_text);
					    		 verifyElementIsPresent1(driver, Cursor_Input);
					    		
					    		 verifyElementDisplayed(driver,Export_text);
					    		 verifyElementIsPresent1(driver, Export_Input);
			    			}
			    			
			    			setTestCaseID("TS_TREEMAP_ OTHERS_002");
			    			if(IsElementEnabled(driver,Export_Input)) {
			    				if(TC_TREEMAP_OTHERS_003.equals("Yes")) {
						    		 setTestCaseID("TC_TREEMAP_ OTHERS_003");
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
			    				
			    				if(TC_TREEMAP_OTHERS_004.equals("Yes")) {
						    		 setTestCaseID("TC_TREEMAP_ OTHERS_004");
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
			    				fail(driver,"Export toggle is not Accessible");
			    			}
			    			
			    			
			    			setTestCaseID("TC_TREEMAP_ OTHERS_003");
			    			if(IsElementEnabled(driver,Cursor_Input)) {
			    				if(TC_TREEMAP_OTHERS_005.equals("Yes")) {
						    		 setTestCaseID("TC_TREEMAP_ OTHERS_005");
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
			    				
			    				if(TC_TREEMAP_OTHERS_006.equals("Yes")) {
						    		 setTestCaseID("TC_TREEMAP_ OTHERS_006");
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
			    				fail(driver,"Cursor toggle is not Accessible");
			    			}
			    		 }
		    		 }
			     }
			  }
			// ********************Others Validation End *******************	 
				 
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
	    		pass(driver,"Same Chart Title name displayed after saved the chart ");
	  		 }else {
	    		fail(driver,"Different Chart Title name displayed after saved the chart ");
	  		 }
			  
			}
		}// Clicking the Widget
		
	}
	
}
