package scripts;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import commonMethods.Keywords;
import commonMethods.Utils;

public class DASHPRO_NETWORK_TESTING extends Keywords{

	public void network_Testing(WebDriver driver,int iteration, String Flag) {
		
		String TestcaseFileName="DASHPRO_NETWORK";
		String SheetName_Axes="NETWORK_AXES";
		String SheetName_ChartStyle="NETWORK_CHART_STYLING";
		String SheetName_DataLabels="NETWORK_DATA_LABELS";
		String SheetName_Legend="NETWORK_LEGEND";
		String SheetName_Others="NETWORK_OTHERS";
		String TestcaseID_Flag="Flag";
		String TescasesID_Column="TEST CASE ID";
		//Yes/No Input for Testcases Id
		String TC_NETWORK_AXES_001=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ NETWORK_001",TestcaseID_Flag);
		String TC_NETWORK_AXES_002=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ NETWORK_002",TestcaseID_Flag);
		String TC_NETWORK_AXES_003=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ NETWORK_003",TestcaseID_Flag);
		String TC_NETWORK_AXES_004=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ NETWORK_004",TestcaseID_Flag);
		String TC_NETWORK_AXES_005=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ NETWORK_005",TestcaseID_Flag);
		String TC_NETWORK_AXES_006=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ NETWORK_006",TestcaseID_Flag);
		String TC_NETWORK_AXES_007=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ NETWORK_007",TestcaseID_Flag);
		String TC_NETWORK_AXES_008=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ NETWORK_008",TestcaseID_Flag);
		String TC_NETWORK_AXES_009=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ NETWORK_009",TestcaseID_Flag);
		String TC_NETWORK_AXES_010=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ NETWORK_010",TestcaseID_Flag);
		String TC_NETWORK_AXES_011=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ NETWORK_011",TestcaseID_Flag);
		String TC_NETWORK_AXES_012=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ NETWORK_012",TestcaseID_Flag);
		String TC_NETWORK_AXES_013=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ NETWORK_013",TestcaseID_Flag);
		String TC_NETWORK_AXES_014=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ NETWORK_014",TestcaseID_Flag);
		String TC_NETWORK_AXES_015=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ NETWORK_015",TestcaseID_Flag);
		String TC_NETWORK_AXES_016=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ NETWORK_016",TestcaseID_Flag);
		String TC_NETWORK_AXES_017=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ NETWORK_017",TestcaseID_Flag);
		String TC_NETWORK_AXES_018=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ NETWORK_018",TestcaseID_Flag);
		String TC_NETWORK_AXES_019=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ NETWORK_019",TestcaseID_Flag);
		String TC_NETWORK_AXES_020=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ NETWORK_020",TestcaseID_Flag);
		String TC_NETWORK_AXES_021=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ NETWORK_021",TestcaseID_Flag);
		String TC_NETWORK_AXES_022=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ NETWORK_022",TestcaseID_Flag);
		String TC_NETWORK_AXES_023=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ NETWORK_023",TestcaseID_Flag);
		String TC_NETWORK_AXES_024=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ NETWORK_024",TestcaseID_Flag);
		String TC_NETWORK_AXES_025=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ NETWORK_025",TestcaseID_Flag);
		String TC_NETWORK_AXES_026=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ NETWORK_026",TestcaseID_Flag);
		String TC_NETWORK_AXES_027=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ NETWORK_027",TestcaseID_Flag);
		String TC_NETWORK_AXES_028=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ NETWORK_028",TestcaseID_Flag);

		//Iteration inputs
		String Select_Categories_Value=Utils.getDataFromTestDataIteration(iteration,"Network_Widget_Testing", "Select_Categories_Value");
		String Select_Series_Value=Utils.getDataFromTestDataIteration(iteration,"Network_Widget_Testing", "Select_Series_Value");
		String Select_Agg_Value=Utils.getDataFromTestDataIteration(iteration,"Network_Widget_Testing", "Select_Agg_Value");
		//Chart title
 		String TypeBackgroundColor1_ChartTitle=Utils.getDataFromTestDataIteration(iteration,"Network_Widget_Testing", "TypeBackgroundColor1_ChartTitle");
 		String TypeTextColor1_ChartTitle=Utils.getDataFromTestDataIteration(iteration,"Network_Widget_Testing", "TypeTextColor1_ChartTitle");
 		String Change_FontFamily_ChartTitle=Utils.getDataFromTestDataIteration(iteration,"Network_Widget_Testing", "Change_FontFamily_ChartTitle");
 		String ChangeFontSize_ChartTitle=Utils.getDataFromTestDataIteration(iteration,"Network_Widget_Testing", "ChangeFontSize_ChartTitle");
 		String ChangeChartTitleName=Utils.getDataFromTestDataIteration(iteration,"Network_Widget_Testing", "ChangeChartTitleName");
		
		setTestCaseID(" ");
		Actions action=new Actions(driver);
		mouseOverToElement(driver, ADDTabPlus);
  	    mouseOverAndClick(driver, ADDTabPlus);
  	    wait(driver,"1");
  	    sendKeys(driver,newlyAddedTab,"NetworkWidgetTest");
  	    click(driver,DashProPage);
  	    elementnotvisible1(driver, RPE_Loading);
		waitForElement(driver,ADD_widget_rightTop);
	    click(driver,ADD_widget_rightTop);
	    elementnotvisible(driver,Loading);
	    elementnotvisible1(driver, RPE_Loading);
		waitForElement(driver,WidgetPanel);
		waitForElement(driver,Sparkline_widget);
		
		if(TC_NETWORK_AXES_001.equals("Yes")) {
			setTestCaseID("TC_NETWORK_AXES_001");
			waitForElement(driver,Network_widget);
			verifyElementDisplayed(driver, Network_widget);
		}
		
		if(TC_NETWORK_AXES_002.equals("Yes")) {
			setTestCaseID("TC_NETWORK_AXES_002");
			WidgetValidation(driver,Network_widget,"Network");
		}
		
		
		if(TC_NETWORK_AXES_003.equals("Yes")) {
			setTestCaseID("TC_NETWORK_AXES_003");
			click(driver,Network_widget);
			if(isDisplayed2(driver,error)){
				 String errorWidget=getText1(driver,error);
				 if(errorWidget.contains("Please refer the logs in Logs")) {
					 fail(driver,"Error displayed When click Network Widget, Validation : "+errorWidget);
				 }else {
					 pass(driver,"Error displayed When click Network Widget, Validation : "+errorWidget);
				 }
				 elementnotvisible1(driver, error);
			 }else {
				 elementnotvisible(driver, Loading);
				 String widgetValue=getText1(driver,WidgetValue);
				 if(widgetValue.equals("Network")) {
					 pass(driver,"'Network' displayed as the selected Widget after click on it");
				 }else {
					 fail(driver,"'Network' not displayed as the selected Widget after click on it");
				 }
				 
				 String AxesExpand=getAttribute1(driver,Axes_Expand,"class");
				 if(!AxesExpand.contains("up")) {
					 fail(driver,"By default, Axes Section is not Expanded");
				 }else {
					 pass(driver,"By default, Axes Section is Expanded");
					 
					 if(TC_NETWORK_AXES_004.equals("Yes")) {
						 setTestCaseID("TC_NETWORK_AXES_004");
						 scrollUsingElement(driver, ApplyButton);
						 click(driver,ApplyButton);
						 if(isDisplayed2(driver,CategoryError_Network)) {
							 pass(driver,"'Kindly select atleast one category' error is displayed When Click Apply button without providing inputs");
						 }else {
							 fail(driver,"'Kindly select atleast one category' error is not displayed When Click Apply button without providing inputs");
						 }	
						 elementnotvisible1(driver, CategoryError_Network);
					 }
					 
					 if(TC_NETWORK_AXES_005.equals("Yes")) {
						 setTestCaseID("TC_NETWORK_AXES_005");
						 if(verifyElementDisplayed(driver, Categories_Input)) {
							 click(driver,Categories_Input);
							 if(isDisplayed2(driver,Categories_DropdownExpand)) {
								 pass(driver,"Categories dropdown is expanded after click on it ");
								 if(TC_NETWORK_AXES_006.equals("Yes")) {
									 setTestCaseID("TC_NETWORK_AXES_006");
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
								 
								 if(TC_NETWORK_AXES_007.equals("Yes")) {
									 setTestCaseID("TC_NETWORK_AXES_007");
									 if(isDisplayed2(driver,CategoricalColumnAxisDropdown)) {
										 String Categorical1=getText1(driver,CategoricalColumnAxisDropdown);
										 if(Categorical1.contains("(")) {
											 pass(driver,"Unique values are displayed in the Categorical Column in the Categories dropdown");
										 }else {
											 fail(driver,"Unique values are not displayed in the Categorical Column in the Categories dropdown");
										 }
									 } 
								 }
								 
								 if(TC_NETWORK_AXES_009.equals("Yes")) {
									 setTestCaseID("TC_NETWORK_AXES_009");
									 List<WebElement> displayedDataImage=getWebElements(driver, dataTypeImages);
									 List<WebElement> AvailableColumnList=getWebElements(driver, AvailableList_Dropdown);
									 if(AvailableColumnList.size()==displayedDataImage.size()) {
										 pass(driver,"All the available columns are displayed with data Type icon in the Categories dropdown");
									 }else {
										 fail(driver,"Some columns are not correctly displayed with data Type icon in the Categories dropdown");
									 }
								 }
								 
								 if(TC_NETWORK_AXES_013.equals("Yes")) {
									 setTestCaseID("TC_NETWORK_AXES_013");
									 ScrollBarValidation1(driver,Categories_DropdownExpand,"Categories_dropdown");
								 }
								 
								 if(TC_NETWORK_AXES_008.equals("Yes")) {
									 setTestCaseID("TC_NETWORK_AXES_008");
									 if(verifyElementDisplayed(driver, dropdownInputsearchBox)) {
										 if(TC_NETWORK_AXES_012.equals("Yes")) {
											 setTestCaseID("TC_NETWORK_AXES_012");
											 sendKeys(driver,dropdownInputsearchBox,"afghjku");
											 if(isDisplayed2(driver,NoResultsFound)) {
												 pass(driver,"'No Results found' message is displayed in while searching invalid value in the Categories dropdown input");
											 }else {
												 fail(driver,"'No Results found' message is not displayed in while searching invalid value in the Categories dropdown input");
											 }
											 clear2(driver,dropdownInputsearchBox);
										 }
										 
										 if(TC_NETWORK_AXES_011.equals("Yes")) {
											 setTestCaseID("TC_NETWORK_AXES_011");
											 sendKeys(driver, dropdownInputsearchBox, Select_Categories_Value);
											 String firstValue_=getText1(driver,FirstSearchedvalue);
											 if(firstValue_.contains(Select_Categories_Value)) {
												 pass(driver,"Searched Value correctly displayed first in the Categories dropdown");
											 }else {
												 fail(driver,"Searched Value not correctly displayed first in the Categories dropdown");
											 }
										 }
									 }
									 
								 }
								 
								 if(TC_NETWORK_AXES_010.equals("Yes")) {
									 setTestCaseID("TC_NETWORK_AXES_010");
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
									 
								 }
								 
								 if(TC_NETWORK_AXES_023.equals("Yes")) {
									 setTestCaseID("TC_NETWORK_AXES_023");
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
								 
							 }else {
								 fail(driver,"Categories dropdown is not expanded after click on it ");
							 }
							 
						 }
					 }
					
					 setTestCaseID("");
					 if(verifyElementDisplayed(driver, Series_Input)) {
						 if(TC_NETWORK_AXES_014.equals("Yes")) {
							 setTestCaseID("TC_NETWORK_AXES_014");
							 String default_Series_Act=getText1(driver,Series_Input);
							 if(default_Series_Act.equals("Select")) {
								 pass(driver,"By Default 'Select' is selected in the Series value input");
							 }else {
								 fail(driver,"By Default 'Select' is not selected in the Series value input");
							 }
							 
						 }
						 
						 if(TC_NETWORK_AXES_015.equals("Yes")) {
							 setTestCaseID("TC_NETWORK_AXES_015");
							 click(driver,Series_Input);
							 if(isDisplayed2(driver,Series_DropdownExpand)) {
								 pass(driver,"Series dropdown is expanded after click on it ");
								 if(TC_NETWORK_AXES_016.equals("Yes")) {
									 setTestCaseID("TC_NETWORK_AXES_016");
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
								 
								 if(TC_NETWORK_AXES_018.equals("Yes")) {
									 setTestCaseID("TC_NETWORK_AXES_018");
									 List<WebElement> displayedDataImage=getWebElements(driver, dataTypeImages);
									 List<WebElement> AvailableColumnList=getWebElements(driver, AvailableList_Dropdown);
									 if(AvailableColumnList.size()-1==displayedDataImage.size()) {
										 pass(driver,"All the available columns are displayed with data Type icon in the Series dropdown");
									 }else {
										 fail(driver,"Some columns are not correctly displayed with data Type icon in the Series dropdown");
									 }
								 }
								 
								 if(TC_NETWORK_AXES_022.equals("Yes")) {
									 setTestCaseID("TC_NETWORK_AXES_022");
									 ScrollBarValidation1(driver,Series_DropdownExpand,"Series_dropdown");
								 }
								 
								 if(TC_NETWORK_AXES_017.equals("Yes")) {
									 setTestCaseID("TC_NETWORK_AXES_017");
								 	if(verifyElementDisplayed(driver, dropdownInputsearchBox)) {
								 		 if(TC_NETWORK_AXES_021.equals("Yes")) {
											 setTestCaseID("TC_NETWORK_AXES_021");
											 sendKeys(driver,dropdownInputsearchBox,"afghjku");
											 if(isDisplayed2(driver,NoResultsFound)) {
												 pass(driver,"'No Results found' message is displayed in while searching invalid value in the Series dropdown input");
											 }else {
												 fail(driver,"'No Results found' message is not displayed in while searching invalid value in the Series dropdown input");
											 }
											 clear2(driver,dropdownInputsearchBox);
										 }
										 
										 if(TC_NETWORK_AXES_020.equals("Yes")) {
											 setTestCaseID("TC_NETWORK_AXES_020");
											 sendKeys(driver, dropdownInputsearchBox, Select_Series_Value);
											 String firstValue_=getText1(driver,FirstSearchedvalue);
											 if(firstValue_.contains(Select_Series_Value)) {
												 pass(driver,"Searched Value correctly displayed first in the Series dropdown");
											 }else {
												 fail(driver,"Searched Value not correctly displayed first in the Series dropdown");
											 }
										 }
								 	}								 	
								 }
								 
								 if(TC_NETWORK_AXES_019.equals("Yes")) {
									 setTestCaseID("TC_NETWORK_AXES_019");
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
								 
								 if(TC_NETWORK_AXES_024.equals("Yes")) {
									 setTestCaseID("TC_NETWORK_AXES_024");
									 if(isDisplayed2(driver,RemoveOption)) {
										 mouseOverAndClick(driver, RemoveOption);
									 }
									 if(!TC_NETWORK_AXES_019.equals("Yes")) {
										 click(driver,Series_Input);
										 waitForElement(driver, Series_DropdownExpand);
										 selectDropdownValue1(driver,Select_Series_Value);
									 }
									 
									 scrollUsingElement(driver, ApplyButton);
									 click(driver,ApplyButton);
									 if(isDisplayed(driver,error)) {
										 String errortext=getText1(driver,error);
										 if(!errortext.contains("Kindly select atleast one category")) {
											 fail(driver,"'Kindly select atleast one category' error not displayed when click Apply button, only providing Series input");
										 }else {
											 pass(driver,"'Kindly select atleast one category' Error displayed when click Apply button only providing Series input");
										 }
										 elementnotvisible1(driver, error);
									 }else {
										 fail(driver," Error not displayed when click Apply button, only providing Series input");
									 }
									 
									 click(driver,Categories_Input);
									 waitForElement(driver, Categories_DropdownExpand);
									 selectDropdownValue1(driver,Select_Categories_Value);
									 click(driver,CategoriesText);
									 wait(driver,"1");
									 if(isDisplayed2(driver,Categories_DropdownExpand)) {
										 fail(driver,"Categories dropdown not closed when click outside the dropdown ");
									 }
								 }
								 
							 }else {
								 fail(driver,"Series dropdown is not expanded after click on it ");
							 }
						 }
					 }//Series Validations 
					 
					 setTestCaseID("TS_ NETWORK_005");
					 if(verifyElementDisplayed(driver, Agg_Input)) {
						 if(TC_NETWORK_AXES_025.equals("Yes")) {
							 setTestCaseID("TC_NETWORK_AXES_025");
							 String defaultAgg=defaultSelectedValue(driver, Agg_Input);
							 if(defaultAgg.equalsIgnoreCase("Sum")) {
								 pass(driver,"By default Sum is selected in the Aggregation input");
							 }else {
								 fail(driver,"By default Sum is not selected in the Aggregation input, Act : "+defaultAgg);
							 }
						 }
						 
						 if(TC_NETWORK_AXES_026.equals("Yes")) {
							 setTestCaseID("TC_NETWORK_AXES_026");
							 click(driver,Agg_Input);
							 verifyElementIsPresent1(driver, Sum);
							 verifyElementIsPresent1(driver, Count);
							 verifyElementIsPresent1(driver, Average);
							 verifyElementIsPresent1(driver, Min);
							 verifyElementIsPresent1(driver, Max);
							 verifyElementIsPresent1(driver, Unique);
						 }
						 if(TC_NETWORK_AXES_027.equals("Yes")) {
							 setTestCaseID("TC_NETWORK_AXES_027");
				 			 DASHPRO_BAR_SMOKE_TESTING bar=new DASHPRO_BAR_SMOKE_TESTING();
							 bar.aggregationValidation2(driver);
							 selectByText(driver, Agg_Input, Select_Agg_Value);						 		
						 }
					 }
					 
					 if(TC_NETWORK_AXES_028.equals("Yes")) {
						 setTestCaseID("TC_NETWORK_AXES_028");
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
				// ******************** Axes Validation End *******************
				 
				// ******************** ChartTitle Validation Start *******************
	         	 String Network_Chart_Title= getCellValue("TestExecution","Testcase_Selection","Network_Chart_Title",Flag);
	             if(Network_Chart_Title.equals("Yes")) {
	          	 	CHART_TITLE chartTitle=new CHART_TITLE();
	                chartTitle.chartTitleTest(driver, TypeBackgroundColor1_ChartTitle, TypeTextColor1_ChartTitle, Change_FontFamily_ChartTitle, ChangeFontSize_ChartTitle,ChangeChartTitleName);       	
	            }
	          // ******************** ChartTitle Validation End *******************
				 
				 setTestCaseID("");
				// ******************** Chart Style Validation Start *******************
				 String Network_ChartFormat_Chart_Style= getCellValue("TestExecution","Testcase_Selection","Network_ChartFormat_Chart_Style",Flag);
				 if(Network_ChartFormat_Chart_Style.equals("Yes")) {
					String TC_NETWORK_CHART_STYLE_001=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_NETWORK_001",TestcaseID_Flag);
					String TC_NETWORK_CHART_STYLE_002=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_NETWORK_002",TestcaseID_Flag);
					String TC_NETWORK_CHART_STYLE_003=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_NETWORK_003",TestcaseID_Flag);
					String TC_NETWORK_CHART_STYLE_004=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_NETWORK_004",TestcaseID_Flag);
					String TC_NETWORK_CHART_STYLE_005=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_NETWORK_005",TestcaseID_Flag);
					String TC_NETWORK_CHART_STYLE_006=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_NETWORK_006",TestcaseID_Flag);
					String TC_NETWORK_CHART_STYLE_007=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_NETWORK_007",TestcaseID_Flag);
					String TC_NETWORK_CHART_STYLE_008=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_NETWORK_008",TestcaseID_Flag);
					String TC_NETWORK_CHART_STYLE_009=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_NETWORK_009",TestcaseID_Flag);
					String TC_NETWORK_CHART_STYLE_010=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_NETWORK_010",TestcaseID_Flag);

					String DefaultThemeValue_Exp=Utils.getDataFromTestData("ChartFormat_ChartStyle", "defaultThemeValue_Exp");
					String Change_ChartTheme_ChartStyle=Utils.getDataFromTestDataIteration(iteration,"Network_Widget_Testing", "Change_ChartTheme_ChartStyle");
					
					if(TC_NETWORK_CHART_STYLE_001.equals("Yes")) {
			    		 setTestCaseID("TC_NETWORK_ CHART_STYLE_001");
			    		 verifyElementDisplayed(driver,Chart_FormatSec);
			    		 click(driver,Chart_FormatSec);
			    		 String ChartFormatOpenstatus=getAttribute1(driver, chartFormatExpand, "class");
			    		 if(ChartFormatOpenstatus.contains("up")) {
		   	  				pass(driver,"Chart Format is expanded when clicking the Chart Format");
		   	  				if(TC_NETWORK_CHART_STYLE_002.equals("Yes")) {
		   	  					setTestCaseID("TC_NETWORK_ CHART_STYLE_002");
		   	  					String ChartStylingExpand=getAttribute1(driver, ChartStyling_Expand, "class");
		   	  					if(!ChartStylingExpand.contains("up")) {
		   	  						fail(driver,"By default, Chart Styling not gets Expand");
		   	  					}else {
		   	  						pass(driver,"By default, Chart Styling gets Expanded");
		   	  						if(TC_NETWORK_CHART_STYLE_003.equals("Yes")) {
		   	  							setTestCaseID("TC_NETWORK_ CHART_STYLE_003");
		   	  							verifyElementDisplayed(driver,ChartThemeText);
		   	  							verifyElementDisplayed(driver,ChartThemeInput);
		   	  						}
		   	  						if(!isDisplayed(driver,ChartThemeInput)) {
		   	  							fail(driver,"Chart theme input is not present");
		   	  						}else {
		   	  							if(TC_NETWORK_CHART_STYLE_004.equals("Yes")) {
		   	  								setTestCaseID("TC_NETWORK_ CHART_STYLE_004");
		   	  								String defaultThemeValue_Act=getText1(driver,ChartThemeInput);
		   	  								if(defaultThemeValue_Act.equals(DefaultThemeValue_Exp)) {
		   	  									pass(driver,"By default, Chart theme selected the value as '"+DefaultThemeValue_Exp+"'");
		   	  								}else {
		   	  									fail(driver,"By default, '"+DefaultThemeValue_Exp+"' value not selected in the  Chart theme input");
		   	  								}
		   	  							}
		   	  							
		   	  							if(TC_NETWORK_CHART_STYLE_005.equals("Yes")) {
		   	  								setTestCaseID("TC_NETWORK_ CHART_STYLE_005");
		   	  								click(driver,ChartThemeInput);
		   	  								if(verifyElementDisplayed(driver,ChartThemeResults)) {
		   	  									
		   	  									if(TC_NETWORK_CHART_STYLE_006.equals("Yes")) {
		   	  										setTestCaseID("TC_NETWORK_ CHART_STYLE_006");
		   	  										if(verifyElementDisplayed(driver, dropdownInputsearchBox)) {
		   	  											if(TC_NETWORK_CHART_STYLE_007.equals("Yes")) {
		   	  												setTestCaseID("TC_NETWORK_ CHART_STYLE_007");
		   	  												sendKeys(driver,dropdownInputsearchBox,"sdgffh");
		   	  												if(isDisplayed(driver, NoResultsFound)) {
		   	  													pass(driver,"'No results found' displayed when user enter incorrect chart theme");
		   	  												}else {
		   	  													fail(driver,"'No results found' not displayed when user enter incorrect chart theme");
		   	  												}
		   	  												clear1(driver,dropdownInputsearchBox);
		   	  											}
		   	  											
		   	  											if(TC_NETWORK_CHART_STYLE_008.equals("Yes")) {
		   	  												setTestCaseID("TC_NETWORK_ CHART_STYLE_008");
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
		   	  									
		   	  									if(TC_NETWORK_CHART_STYLE_009.equals("Yes")) {
	  												setTestCaseID("TC_NETWORK_ CHART_STYLE_009");
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
		   	  									
		   	  								}//chart theme results 
	   	  								
		   	  							}
		   	  							
		   	  						}
		   	  						
		   	  						if(TC_NETWORK_CHART_STYLE_010.equals("Yes")) {
										setTestCaseID("TC_NETWORK_ CHART_STYLE_010");
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
				 String Network_ChartFormat_Data_Labels= getCellValue("TestExecution","Testcase_Selection","Network_ChartFormat_Data_Labels",Flag);
				 if(Network_ChartFormat_Data_Labels.equals("Yes")) {
					 
					 String TC_NETWORK_DATA_LABELS_001=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_NETWORK_001",TestcaseID_Flag);
					 String TC_NETWORK_DATA_LABELS_002=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_NETWORK_002",TestcaseID_Flag);
					 String TC_NETWORK_DATA_LABELS_003=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_NETWORK_003",TestcaseID_Flag);
					 String TC_NETWORK_DATA_LABELS_004=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_NETWORK_004",TestcaseID_Flag);
					 String TC_NETWORK_DATA_LABELS_005=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_NETWORK_005",TestcaseID_Flag);
					 String TC_NETWORK_DATA_LABELS_006=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_NETWORK_006",TestcaseID_Flag);
					 String TC_NETWORK_DATA_LABELS_007=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_NETWORK_007",TestcaseID_Flag);
					 String TC_NETWORK_DATA_LABELS_008=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_NETWORK_008",TestcaseID_Flag);
					 String TC_NETWORK_DATA_LABELS_009=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_NETWORK_009",TestcaseID_Flag);
					 String TC_NETWORK_DATA_LABELS_010=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_NETWORK_010",TestcaseID_Flag);
					 String TC_NETWORK_DATA_LABELS_011=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_NETWORK_011",TestcaseID_Flag);
					 String TC_NETWORK_DATA_LABELS_012=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_NETWORK_012",TestcaseID_Flag);
					 String TC_NETWORK_DATA_LABELS_013=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_NETWORK_013",TestcaseID_Flag);
					 String TC_NETWORK_DATA_LABELS_014=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_NETWORK_014",TestcaseID_Flag);
					 String TC_NETWORK_DATA_LABELS_015=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_NETWORK_015",TestcaseID_Flag);
					 String TC_NETWORK_DATA_LABELS_016=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_NETWORK_016",TestcaseID_Flag);
					 String TC_NETWORK_DATA_LABELS_017=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_NETWORK_017",TestcaseID_Flag);
					 String TC_NETWORK_DATA_LABELS_018=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_NETWORK_018",TestcaseID_Flag);

					 //Data Labels
					 String DefaultSeperatorValue_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DefaultSeperatorValue");
					 String DefaultFontSizeValue_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DefaultFontSizeValue");
					 String DefaultRoundOffValue_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DefaultRoundOffValue");
					 String DefaultRotationValue_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DefaultRotationValue");
					 //Iteration inputs
					 String Change_Seperator_Option=Utils.getDataFromTestDataIteration(iteration,"Network_Widget_Testing", "Change_Seperator_Option");
					 String ChangeFontSizeValue_DataLabel=Utils.getDataFromTestDataIteration(iteration,"Network_Widget_Testing", "ChangeFontSizeValue_DataLabel");
					 String ChangeRoundOffValue_DataLabel=Utils.getDataFromTestDataIteration(iteration,"Network_Widget_Testing", "ChangeRoundOffValue_DataLabel");
					 String ChangeRotataionVal_DataLabel=Utils.getDataFromTestDataIteration(iteration,"Network_Widget_Testing", "ChangeRotataionVal_DataLabel");
					 
					 if(!Network_ChartFormat_Chart_Style.equals("Yes")) {
						 verifyElementDisplayed(driver,Chart_FormatSec);
		    		     click(driver,Chart_FormatSec);
					 }
					 
					 if(TC_NETWORK_DATA_LABELS_001.equals("Yes")) {
			    		 setTestCaseID("TC_NETWORK_ DATA_LABELS_001");
			    		 String DataLabelsExpand=getAttribute1(driver, DataLabels_Expand, "class");
			    		 if(!DataLabelsExpand.contains("up")) {
			    			 fail(driver,"By default, Data labels not gets Expanded");
			    		 }else {
			    			 pass(driver,"By default, Data labels gets Expanded");
			    			 if(TC_NETWORK_DATA_LABELS_002.equals("Yes")) {
					    		 setTestCaseID("TC_NETWORK_ DATA_LABELS_002");
					    		 verifyElementDisplayed(driver, EnableValue_text);
					    		 verifyElementDisplayed(driver, EnableValue_InputSlider);

					    		 verifyElementDisplayed(driver, Seperator_text);
					    		 verifyElementDisplayed(driver, SeperatorInput);

					    		 verifyElementDisplayed(driver, ValueFontSize_text);
					    		 verifyElementDisplayed(driver, ValueFontSizeInput);

					    		 verifyElementDisplayed(driver, RoundOffValue_text);
					    		 verifyElementDisplayed(driver, RoundOffValueInput);
			    			 }
			    			 
			    			 if(TC_NETWORK_DATA_LABELS_003.equals("Yes")) {
					    		 setTestCaseID("TC_NETWORK_ DATA_LABELS_003");
					    		 if(isToggleEnable(driver,EnableValue_Input)) {
	   	  							fail(driver,"By Default, Enable Value toggle is enabled");
					    		 }else {
	   	  							pass(driver,"By Default, Enable Value toggle is disabled");
	   	  							if(TC_NETWORK_DATA_LABELS_004.equals("Yes")) {
	   	  								setTestCaseID("TC_NETWORK_ DATA_LABELS_004");
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
	   	  								
	   	  								if(IsElementEnabled(driver,ValueRotation_Input)) {
	   	  									fail(driver,"'ValueRotation_Input' is accessible when the 'Enable value' toggle is disabled.");
	   	  								}else {
	   	  									pass(driver,"'ValueRotation_Input' is inaccessible when the 'Enable value' toggle is disabled.");
	   	  								}
	   	  							}
	   	  							
	   	  							if(TC_NETWORK_DATA_LABELS_005.equals("Yes")) {
	   	  								setTestCaseID("TC_NETWORK_ DATA_LABELS_005");
	   	  								click(driver,EnableValue_InputSlider);
	   	  								if(!isToggleEnable(driver,EnableValue_Input)) {
	   	  									fail(driver,"'Enable Value' toggle is not enabled after click on it");
	   	  								}else {
	   	  									pass(driver,"'Enable Value' toggle is enabled after click on it");
	   	  									scrollUsingElement(driver, ApplyButton);
	   	  									click(driver,ApplyButton);
	   	  									elementnotvisible1(driver, RPE_Loading);
	   	  									if(verifyElementDisplayed(driver,Chart_Section)) {
	   	  										if(isDisplayed(driver,EnableValue)) {
	   	  											pass(driver,"Values enabled in charts after enabling the 'Enable Value' toggle"); 
	   	  										}else {
	   	  											fail(driver,"Values not enabled in charts after enabling the 'Enable Value' toggle"); 
	   	  										}
	   	  									}
	   	  									
	   	  								   if(TC_NETWORK_DATA_LABELS_006.equals("Yes")) {
	   	  									   setTestCaseID("TC_NETWORK_ DATA_LABELS_006");
	   	  									   String defaultSeperator_Act=defaultSelectedValue(driver,SeperatorInput);
	   	   	  									if(DefaultSeperatorValue_Exp.equals(defaultSeperator_Act)) {
	   	   	  										pass(driver,"By default, '"+DefaultSeperatorValue_Exp+"' is selected in the Seperator Input"); 
	   	   	  									}else {
	   	   	  										fail(driver,"By default, '"+DefaultSeperatorValue_Exp+"' is not selected in the Seperator Input"); 
	   	   	  									} 
	   	  								   }
	   	  								   
	   	  								   if(TC_NETWORK_DATA_LABELS_007.equals("Yes")) {
	   	  									   setTestCaseID("TC_NETWORK_ DATA_LABELS_007");
	   	  									   if(isToggleAccessible(driver,SeperatorInput)) {	
	   	   	  										pass(driver,"'Seperator Input' is accessible"); 
	   	   	  										click(driver,SeperatorInput);
	   	   	  										verifyElementIsPresent1(driver, Thousand_Seperator);
	   	   	  										verifyElementIsPresent1(driver, Houndred_Seperator);
	   	   	  										if(TC_NETWORK_DATA_LABELS_008.equals("Yes")) {
	   	   	  											setTestCaseID("TC_NETWORK_ DATA_LABELS_008");
	   	   	  											selectOptionValue(driver,SeperatorInput,Change_Seperator_Option);
	   	   	  											scrollUsingElement(driver, ApplyButton);
	   	   	  											click(driver,ApplyButton);
	   	   	  											elementnotvisible1(driver, RPE_Loading);
	   	   	  											if(verifyElementDisplayed(driver,Chart_Section)) {
	   	   	  												String ChartValueTextAct= getText1(driver,EnableValue);
	   	   	  												if(!ChartValueTextAct.contains(".") && ChartValueTextAct.length()>3) {
	   	   	  													String ValueSeperatorFormat=validateNumberFormat(ChartValueTextAct);
	   	   	  													if(ChartValueTextAct.length()>3 &&!ChartValueTextAct.equals("0")) {
	   	   	  														if(ValueSeperatorFormat.equals(Change_Seperator_Option)) {
	   	   	  															pass(driver,Change_Seperator_Option+" seperator gets applied for chart enabled values"); 
	   	   	  														}else {
	   	   	  															fail(driver,Change_Seperator_Option+" seperator not applied for chart enabled values"); 
	   	   	  														}
	   	   	  													}else {
	   	   	  														pass(driver,"Unable to Validate the '"+Change_Seperator_Option+" seperator' for this value : "+ChartValueTextAct); 
	   	   	  													}
	   	   	  												}
	   	   	  											}
	   	   	  										}
	   	  									   }else {
	   	   	  										fail(driver,"'Seperator Input' is not accessible"); 
	   	  									   }
	   	  								   }
	   	  								   
	   	  								   if(TC_NETWORK_DATA_LABELS_009.equals("Yes")) {
	   	  									   setTestCaseID("TC_NETWORK_ DATA_LABELS_009");
	   	  									   String defaultFontSize_Act=defaultSelectedValue(driver, ValueFontSizeInput);
	   		   	  								if(DefaultFontSizeValue_Exp.equals(defaultFontSize_Act)) {
	   		   	  									pass(driver,"By default, '"+DefaultFontSizeValue_Exp+"' is selected in the Value Font Size Input"); 
	   		   	  								}else {
	   		   	  									fail(driver,"By default, '"+DefaultFontSizeValue_Exp+"' is not selected in the Value Font Size Input"); 
	   		   	  								}
	   	  								   }
	   	  								   
	   	  								   if(TC_NETWORK_DATA_LABELS_010.equals("Yes")) {
	   	  									   setTestCaseID("TC_NETWORK_ DATA_LABELS_010");
	   	  									   if(isToggleAccessible(driver,ValueFontSizeInput)) {		
	   	   	  										pass(driver,"'Value FontSize Input' is accessible after enabling the 'Enable Value' toggle");
	   	   	  										if(TC_NETWORK_DATA_LABELS_011.equals("Yes")) {
	   	   	  											setTestCaseID("TC_NETWORK_ DATA_LABELS_011");
	   	   	  											click(driver,ValueFontSizeInput);
	   	   	  											verifyElementIsPresent1(driver, ValueFontSizeOptions);
	   	   	  										}
	   	   	  										
	   	   	  										if(TC_NETWORK_DATA_LABELS_012.equals("Yes")) {
	   	   	  											setTestCaseID("TC_NETWORK_ DATA_LABELS_012");
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
	   	  										   fail(driver,"'Value FontSize Input' is not accessible after enabling the 'Enable Value' toggle");
	   	  									   }
	   	  								   }
	   	  								   
	   	  								   if(TC_NETWORK_DATA_LABELS_013.equals("Yes")) {
	   	  									   setTestCaseID("TC_NETWORK_ DATA_LABELS_013");
	   	  									   String defaultRoundOffValue_Act=defaultSelectedValue(driver, RoundOffValueInput);
	   	   	  									if(DefaultRoundOffValue_Exp.equals(defaultRoundOffValue_Act)) {
	   	   	  										pass(driver,"By default, '"+DefaultRoundOffValue_Exp+"' is selected in the RoundOffValue Input"); 
	   	   	  									}else {
	   	   	  										fail(driver,"By default, '"+DefaultRoundOffValue_Exp+"' is not selected in the RoundOffValue Input"); 
	   	   	  									}
	   	  								   }
	   	  								   
	   	  								   if(TC_NETWORK_DATA_LABELS_014.equals("Yes")) {
	   	  									   setTestCaseID("TC_NETWORK_ DATA_LABELS_014");
	   	  									   if(isToggleAccessible(driver,RoundOffValueInput)) {		
	   	  										   pass(driver,"'RoundOff Value Input' is accessible "); 
	   	  										   click(driver,RoundOffValueInput);
	   	  										   verifyElementIsPresent1(driver, RoundOffValueOptions);
	   	  										   if(TC_NETWORK_DATA_LABELS_015.equals("Yes")) {
	   	  											   setTestCaseID("TC_NETWORK_ DATA_LABELS_015");
	   	  											   selectByText(driver,RoundOffValueInput,ChangeRoundOffValue_DataLabel);
	   	  											   scrollUsingElement(driver, ApplyButton);
	   	  											   click(driver,ApplyButton);
	   	  											   elementnotvisible1(driver, RPE_Loading);
	   	  											   if(verifyElementDisplayed(driver,Chart_Section)) {
	   	  												   String ChartValueTextAct=getText1(driver,EnableValue); 
	   	  												   if(ChartValueTextAct.contains("…") ||ChartValueTextAct.equals("") ) {
	   	  													  pass(driver,"Unable to validate the Roundoff value for the enabled Value : "+ChartValueTextAct); 
	   	  												   }else {
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
	   	  										   fail(driver,"'RoundOff Value Input' is not accessible");
	   	  									   }
	   	  								   }
	   	  								   
	   	  								   if(TC_NETWORK_DATA_LABELS_016.equals("Yes")) {
	   	  									   setTestCaseID("TC_NETWORK_ DATA_LABELS_016");
	   	  									   String defaultRotationValue_Act=getText1(driver,ValueRotation_Output);
	   	  									   if(DefaultRotationValue_Exp.equals(defaultRotationValue_Act)) {
	   	  										   pass(driver,"By default, '"+DefaultRotationValue_Exp+"' is displayed in value rotation output");
	   	  									   }else {
	   	  										   fail(driver,"By default, '"+DefaultRotationValue_Exp+"' is not displayed in value rotation output");
	   	  									   } 
	   	  								   }
	   	  								   
	   	  								   if(TC_NETWORK_DATA_LABELS_017.equals("Yes")) {
	   	  									   setTestCaseID("TC_NETWORK_ DATA_LABELS_017");
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
	   	  								   }
	   	  								}
	   	  							}
					    		 }
			    			 }
			    			
			    			 if(TC_NETWORK_DATA_LABELS_018.equals("Yes")) {
			    				 setTestCaseID("TC_NETWORK_ DATA_LABELS_018");
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
				// ******************** DataLabels Validation End *******************
				 setTestCaseID("");
				// ******************** Legend Validation Start *******************
				 String Network_ChartFormat_Legends= getCellValue("TestExecution","Testcase_Selection","Network_ChartFormat_Legends",Flag);
				 if(Network_ChartFormat_Legends.equals("Yes")) {
					 
					String TC_NETWORK_LEGEND_001=getTestcaseID_Flag(TestcaseFileName,SheetName_Legend,TescasesID_Column,"TC_NETWORK_LEGEND_001",TestcaseID_Flag);
					String TC_NETWORK_LEGEND_002=getTestcaseID_Flag(TestcaseFileName,SheetName_Legend,TescasesID_Column,"TC_NETWORK_LEGEND_002",TestcaseID_Flag);
					String TC_NETWORK_LEGEND_003=getTestcaseID_Flag(TestcaseFileName,SheetName_Legend,TescasesID_Column,"TC_NETWORK_LEGEND_003",TestcaseID_Flag);
					String TC_NETWORK_LEGEND_004=getTestcaseID_Flag(TestcaseFileName,SheetName_Legend,TescasesID_Column,"TC_NETWORK_LEGEND_004",TestcaseID_Flag);
					String TC_NETWORK_LEGEND_005=getTestcaseID_Flag(TestcaseFileName,SheetName_Legend,TescasesID_Column,"TC_NETWORK_LEGEND_005",TestcaseID_Flag);
					String TC_NETWORK_LEGEND_006=getTestcaseID_Flag(TestcaseFileName,SheetName_Legend,TescasesID_Column,"TC_NETWORK_LEGEND_006",TestcaseID_Flag);
					String TC_NETWORK_LEGEND_007=getTestcaseID_Flag(TestcaseFileName,SheetName_Legend,TescasesID_Column,"TC_NETWORK_LEGEND_007",TestcaseID_Flag);
					String TC_NETWORK_LEGEND_008=getTestcaseID_Flag(TestcaseFileName,SheetName_Legend,TescasesID_Column,"TC_NETWORK_LEGEND_008",TestcaseID_Flag);
					String TC_NETWORK_LEGEND_009=getTestcaseID_Flag(TestcaseFileName,SheetName_Legend,TescasesID_Column,"TC_NETWORK_LEGEND_009",TestcaseID_Flag);
					String TC_NETWORK_LEGEND_010=getTestcaseID_Flag(TestcaseFileName,SheetName_Legend,TescasesID_Column,"TC_NETWORK_LEGEND_010",TestcaseID_Flag);
					String TC_NETWORK_LEGEND_011=getTestcaseID_Flag(TestcaseFileName,SheetName_Legend,TescasesID_Column,"TC_NETWORK_LEGEND_011",TestcaseID_Flag);
					String TC_NETWORK_LEGEND_012=getTestcaseID_Flag(TestcaseFileName,SheetName_Legend,TescasesID_Column,"TC_NETWORK_LEGEND_012",TestcaseID_Flag);
					
					String Default_Legend_Position=Utils.getDataFromTestData("SmokeTesting_UI", "Default_Legend_Position");
					String Default_Legend_FontSize=Utils.getDataFromTestData("SmokeTesting_UI", "Default_Legend_FontSize");

					String Change_Legend_FontSize=Utils.getDataFromTestDataIteration(iteration,"Network_Widget_Testing", "Change_Legend_FontSize");

					if(!Network_ChartFormat_Data_Labels.equals("Yes") && !Network_ChartFormat_Chart_Style.equals("Yes")) {
						 verifyElementDisplayed(driver,Chart_FormatSec);
		    		     click(driver,Chart_FormatSec);
					 }
				 
					if(verifyElementDisplayed(driver, Legend_)) {
						if(TC_NETWORK_LEGEND_001.equals("Yes")) {
		    				 setTestCaseID("TC_NETWORK_LEGEND_001");
		    				 String LegendSecExpand=getAttribute1(driver, Legends_Expand, "class");
				    		 if(!LegendSecExpand.contains("up")) {
				    			 fail(driver,"By default, Legends not gets Expanded");
				    		 }else {
				    			 pass(driver,"By default, Legends gets Expanded");
				    			 if(TC_NETWORK_LEGEND_002.equals("Yes")) {
				    				 setTestCaseID("TC_NETWORK_LEGEND_002");
				    				 verifyElementDisplayed(driver,Legend_Text);
						    		 verifyElementDisplayed(driver, Legend_InputToggle);

						    		 verifyElementDisplayed(driver,LegendPosition_Text);
						    		 verifyElementDisplayed(driver,LegendPosition_Input);
						         
						    		 verifyElementDisplayed(driver,LegendFontSize_Text);
						    		 verifyElementDisplayed(driver,LegendFontSize_Input);
				    			 }
				    			 
				    			 if(TC_NETWORK_LEGEND_003.equals("Yes")) {
				    				 setTestCaseID("TC_NETWORK_LEGEND_003");
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
				    			 
				    			 if(TC_NETWORK_LEGEND_004.equals("Yes")) {
				    				 setTestCaseID("TC_NETWORK_LEGEND_004");
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
						    			
						    			 click(driver,Legend_InputToggle);
						    			 if(isToggleEnable(driver, Legend_Input)) {
							    			 pass(driver,"'Legend toggle is enabled when again click on it");
						    			 }else {
						    				 fail(driver,"'Legend toggle is not enabled when again click on it");
						    			 }
						    		 }else {
						    			 fail(driver,"'Legend toggle is not deSelected when click on it"); 
						    		 }
				    			 }
				    			 
				    			 if(TC_NETWORK_LEGEND_005.equals("Yes")) {
				    				 setTestCaseID("TC_NETWORK_LEGEND_005");
				    				 String defaultPosition_Legend=defaultSelectedValue(driver, LegendPosition_Input);
				    				 if(Default_Legend_Position.equals(defaultPosition_Legend)) {
				    					 pass(driver,"By default, '"+Default_Legend_Position+"' is selected in the Legend Positon input");
				    				 }else {
				    					 fail(driver,"By default, '"+Default_Legend_Position+"' is not selected in the Legend Positon input");
				    				 }
				    				 scrollUsingElement(driver, ApplyButton);
					    			 click(driver,ApplyButton);
					    			 elementnotvisible1(driver, RPE_Loading);
					    			 String defaultLegend_chart= getRelativePosition(driver,Legend_Chart_ValueNew,Network_Chart);
					    			 if(defaultLegend_chart.equals(Default_Legend_Position)) {
				    					pass(driver,"By default, the legend is displayed in '"+Default_Legend_Position+"' in the chart");
					    			 }else {
				    					fail(driver,"By default, the legend is not displayed in '"+Default_Legend_Position+"' in the chart");
					    			 }
				    			 }
				    			 
				    			 if(TC_NETWORK_LEGEND_006.equals("Yes")) {
				    				 setTestCaseID("TC_NETWORK_LEGEND_006");
				    				 if(IsElementEnabled(driver, LegendPosition_Input)) {
					    				 pass(driver,"Legend Position Input is Accessible when the Legend Toggle is Enable");
					    				 click(driver,LegendPosition_Input);
					    				 verifyElementIsPresent1(driver, LegendPosition_Options);
					    				 if(TC_NETWORK_LEGEND_007.equals("Yes")) {
						    				 setTestCaseID("TC_NETWORK_LEGEND_007");
						    				 selectByText(driver, LegendPosition_Input, "Top");
								    		 scrollUsingElement(driver, ApplyButton);
								    		 click(driver,ApplyButton);
								    		 elementnotvisible1(driver, RPE_Loading);
								    		 if(verifyElementDisplayed(driver,ChartGraph)) {
								    			 String LegendPosition_chart= getRelativePosition(driver,Legend_Chart_ValueNew,Network_Chart);
								    			 if(LegendPosition_chart.equals("Top")) {
								    				 pass(driver,"Legend is displayed in 'Top' position in the chart ");
								    			 }else {
								    				 fail(driver,"Legend is not displayed in 'Top' position in the chart ");
								    			 } 
								    		 }
								    		 
								    		 selectByText(driver, LegendPosition_Input, "Right");
								    		 scrollUsingElement(driver, ApplyButton);
								    		 click(driver,ApplyButton);
								    		 elementnotvisible1(driver, RPE_Loading);
								    		 if(verifyElementDisplayed(driver,ChartGraph)) {
								    			 String LegendPosition_chart= getRelativePosition(driver,Legend_Chart_ValueNew,Network_Chart);
								    			 if(LegendPosition_chart.equals("Right")) {
								    				 pass(driver,"Legend is displayed in 'Right' position in the chart ");
								    			 }else {
								    				 fail(driver,"Legend is not displayed in 'Right' position in the chart ");
								    			 } 
								    		 }
								    		 
								    		 selectByText(driver, LegendPosition_Input, "Left");
								    		 scrollUsingElement(driver, ApplyButton);
								    		 click(driver,ApplyButton);
								    		 elementnotvisible1(driver, RPE_Loading);
								    		 if(verifyElementDisplayed(driver,ChartGraph)) {
								    			 String LegendPosition_chart= getRelativePosition(driver,Legend_Chart_ValueNew,Network_Chart);
								    			 if(LegendPosition_chart.equals("Left")) {
								    				 pass(driver,"Legend is displayed in 'Left' position in the chart ");
								    			 }else {
								    				 fail(driver,"Legend is not displayed in 'Left' position in the chart");
								    			 } 
								    		 }
					    				 }
					    				 
				    				 }else {
				    					 fail(driver,"Legend Position Input is not Accessible when the Legend Toggle is Enable");
				    				 }
				    			 }
				    			 
				    			 if(TC_NETWORK_LEGEND_009.equals("Yes")) {
				    				 setTestCaseID("TC_NETWORK_LEGEND_009");
				    				 String defaultFontSize_Legend=defaultSelectedValue(driver, LegendFontSize_Input);
				    				 if(Default_Legend_FontSize.equals(defaultFontSize_Legend)) {
				    					 pass(driver,"By default, '"+Default_Legend_FontSize+"' is selected in the Legend Font Size input");
				    				 }else {
				    					 fail(driver,"By default, '"+Default_Legend_FontSize+"' is not selected in the Legend Font Size input");
				    				 }
				    			 }
				    			 
				    			 if(TC_NETWORK_LEGEND_008.equals("Yes")) {
				    				 setTestCaseID("TC_NETWORK_LEGEND_008");
				    				 if(IsElementEnabled(driver, LegendFontSize_Input)) {
					    				 pass(driver,"Legend FontSize Input is Accessible when the Legend Toggle is Enable");
					    				 click(driver,LegendFontSize_Input);
					    				 verifyElementIsPresent1(driver, LegendFontSize_InputOptions);
					    				 if(TC_NETWORK_LEGEND_010.equals("Yes")) {
						    				 setTestCaseID("TC_NETWORK_LEGEND_010");
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
				    			 
				    			 if(TC_NETWORK_LEGEND_011.equals("Yes")) {
				    				 setTestCaseID("TC_NETWORK_LEGEND_011");
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
				// ******************** Legend Validation End *******************
				 setTestCaseID("");
				// ******************** Others Validation Start *******************
				 String Network_ChartFormat_Others= getCellValue("TestExecution","Testcase_Selection","Network_ChartFormat_Others",Flag);
				 if(Network_ChartFormat_Others.equals("Yes")) {
					 
			    	 String TC_NETWORK_OTHERS_001=getTestcaseID_Flag(TestcaseFileName,SheetName_Others,TescasesID_Column,"TC_NETWORK_001",TestcaseID_Flag);
			    	 String TC_NETWORK_OTHERS_002=getTestcaseID_Flag(TestcaseFileName,SheetName_Others,TescasesID_Column,"TC_NETWORK_002",TestcaseID_Flag);
			    	 String TC_NETWORK_OTHERS_003=getTestcaseID_Flag(TestcaseFileName,SheetName_Others,TescasesID_Column,"TC_NETWORK_003",TestcaseID_Flag);
			    	 String TC_NETWORK_OTHERS_004=getTestcaseID_Flag(TestcaseFileName,SheetName_Others,TescasesID_Column,"TC_NETWORK_004",TestcaseID_Flag);
			    	 String TC_NETWORK_OTHERS_005=getTestcaseID_Flag(TestcaseFileName,SheetName_Others,TescasesID_Column,"TC_NETWORK_005",TestcaseID_Flag);

			    	 if(!Network_ChartFormat_Data_Labels.equals("Yes") && !Network_ChartFormat_Chart_Style.equals("Yes") && !Network_ChartFormat_Legends.equals("Yes")) {
						 verifyElementDisplayed(driver,Chart_FormatSec);
		    		     click(driver,Chart_FormatSec);
					 }
			    	 
			    	 if(verifyElementDisplayed(driver, ChartFormat_Others)) {
			    		 if(TC_NETWORK_OTHERS_001.equals("Yes")) {
		    				 setTestCaseID("TC_NETWORK_OTHERS_001");
		    				 String OthersExpand=getAttribute1(driver, ChartFormat_OthersExpand, "class");
				    		 if(!OthersExpand.contains("up")) {
				    			fail(driver,"By default, 'Others' not gets Expand");
				    		 }else {
				    			pass(driver,"By default, 'Others' gets Expanded");
				    			if(TC_NETWORK_OTHERS_002.equals("Yes")) {
				    				 setTestCaseID("TC_NETWORK_OTHERS_002");
				    				 verifyElementDisplayed(driver,Export_text);
						    		 verifyElementIsPresent1(driver, Export_Input);
				    			}
				    			
				    			if(TC_NETWORK_OTHERS_003.equals("Yes")) {
				    				 setTestCaseID("TC_NETWORK_OTHERS_003");
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
				    			
				    			if(TC_NETWORK_OTHERS_004.equals("Yes")) {
				    				 setTestCaseID("TC_NETWORK_OTHERS_004");
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
				    			
				    			if(TC_NETWORK_OTHERS_005.equals("Yes")) {
				    				 setTestCaseID("TC_NETWORK_OTHERS_005");
				    				 mouseOverAndClick(driver, ChartFormat_Others);
						    		 String LegendClose_Act=getAttribute1(driver, ChartFormat_OthersExpand, "class");
						    		 if(LegendClose_Act.contains("down")) {
						    			 pass(driver,"Others section gets collapsed when click on it");
						    		 }else {
						    			 fail(driver,"Others section not gets collapsed when click on it");
						    		 }
				    			}
				    			
				    		 }
				    	 }
			    	 }
				 }
				// ******************** Others Validation End *******************
				 
			 }//Click Network, widget displayed
			
			
		}//click Network
		
		 setTestCaseID("");
   	     click(driver,ChartTitleInput);
 		 clearAndType1(driver,ChartTitleInput,"NetworkTest");
 		 click(driver,SaveBtn_Chart);
 		 elementnotvisible1(driver, RPE_Loading);
 		 if(!isDisplayed2(driver,chartSaveError1) && isDisplayed(driver,SavedChartTitleInput)) {
 			 pass(driver,"Chart Saved Successfully");
 		 }else {
 			 fail(driver,"Chart not Saved Successfully");
 		 }	
	      
 		 String AfterSaveChartTitleName=getText1(driver, SavedChartTitleName);
 		 if(AfterSaveChartTitleName.equals("NetworkTest")) {
 			// pass(driver,"Same Chart Title name displayed after saved the chart ");
 		 }else {
 			 fail(driver,"Different Chart Title name displayed after saved the chart ");
 		 }
		
	}
}
