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

public class DASHPRO_KPI_CARD_TESTING extends Keywords{
	
	public void kpiCardTesting(WebDriver driver, int iteration,String Flag) {
		
		String TestcaseFileName="DASHPRO_KPI_CARD";
		String SheetName_Axes="KPI_CARD_AXES";
		String SheetName_Table_Format="KPI_CARD_TABLE_FORMAT";
		String TestcaseID_Flag="Flag";
		String TescasesID_Column="TEST CASE ID";
		//Yes/No Input for Testcases Id
		String TC_KPI_CARD_AXES_001=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ KPICARD_001",TestcaseID_Flag);
		String TC_KPI_CARD_AXES_002=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ KPICARD_002",TestcaseID_Flag);
		String TC_KPI_CARD_AXES_003=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ KPICARD_003",TestcaseID_Flag);
		String TC_KPI_CARD_AXES_004=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ KPICARD_004",TestcaseID_Flag);
		String TC_KPI_CARD_AXES_005=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ KPICARD_005",TestcaseID_Flag);
		String TC_KPI_CARD_AXES_006=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ KPICARD_006",TestcaseID_Flag);
		String TC_KPI_CARD_AXES_007=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ KPICARD_007",TestcaseID_Flag);
		String TC_KPI_CARD_AXES_008=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ KPICARD_008",TestcaseID_Flag);
		String TC_KPI_CARD_AXES_009=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ KPICARD_009",TestcaseID_Flag);
		String TC_KPI_CARD_AXES_010=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ KPICARD_010",TestcaseID_Flag);
		String TC_KPI_CARD_AXES_011=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ KPICARD_011",TestcaseID_Flag);
		String TC_KPI_CARD_AXES_012=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ KPICARD_012",TestcaseID_Flag);
		String TC_KPI_CARD_AXES_013=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ KPICARD_013",TestcaseID_Flag);
		String TC_KPI_CARD_AXES_014=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ KPICARD_014",TestcaseID_Flag);
		String TC_KPI_CARD_AXES_015=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ KPICARD_015",TestcaseID_Flag);
		String TC_KPI_CARD_AXES_016=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ KPICARD_016",TestcaseID_Flag);
		String TC_KPI_CARD_AXES_017=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ KPICARD_017",TestcaseID_Flag);
		String TC_KPI_CARD_AXES_018=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ KPICARD_018",TestcaseID_Flag);
		String TC_KPI_CARD_AXES_019=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ KPICARD_019",TestcaseID_Flag);
		String TC_KPI_CARD_AXES_020=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ KPICARD_020",TestcaseID_Flag);
		String TC_KPI_CARD_AXES_021=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ KPICARD_021",TestcaseID_Flag);
		String TC_KPI_CARD_AXES_022=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ KPICARD_022",TestcaseID_Flag);
		String TC_KPI_CARD_AXES_023=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ KPICARD_023",TestcaseID_Flag);
		String TC_KPI_CARD_AXES_024=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ KPICARD_024",TestcaseID_Flag);
		String TC_KPI_CARD_AXES_025=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ KPICARD_025",TestcaseID_Flag);
		String TC_KPI_CARD_AXES_026=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ KPICARD_026",TestcaseID_Flag);
		String TC_KPI_CARD_AXES_027=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ KPICARD_027",TestcaseID_Flag);
		String TC_KPI_CARD_AXES_028=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ KPICARD_028",TestcaseID_Flag);
		String TC_KPI_CARD_AXES_029=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ KPICARD_029",TestcaseID_Flag);
		String TC_KPI_CARD_AXES_030=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ KPICARD_030",TestcaseID_Flag);
		String TC_KPI_CARD_AXES_031=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ KPICARD_031",TestcaseID_Flag);
		String TC_KPI_CARD_AXES_032=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ KPICARD_032",TestcaseID_Flag);
		String TC_KPI_CARD_AXES_033=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ KPICARD_033",TestcaseID_Flag);
		String TC_KPI_CARD_AXES_034=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ KPICARD_034",TestcaseID_Flag);
		String TC_KPI_CARD_AXES_035=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ KPICARD_035",TestcaseID_Flag);
		String TC_KPI_CARD_AXES_036=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ KPICARD_036",TestcaseID_Flag);
		String TC_KPI_CARD_AXES_037=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ KPICARD_037",TestcaseID_Flag);
		String TC_KPI_CARD_AXES_038=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ KPICARD_038",TestcaseID_Flag);
		
		//Default 
		String AxesColor_Exp=Utils.getDataFromTestData("Axes", "Axes_Color_Exp");
		String DefaultPeriod_Value=Utils.getDataFromTestData("KPI_CARD", "DefaultPeriod_Value");
		String DefaultPeriod_CountValue=Utils.getDataFromTestData("KPI_CARD", "DefaultPeriod_CountValue");
		//defaultInput
		String DefaultFontFamily_TableFormat=Utils.getDataFromTestData("SmokeTesting_UI", "DefaultFontFamily_TableFormat");
		String DefaultFontSize_TableFormat=Utils.getDataFromTestData("SmokeTesting_UI", "DefaultFontSize_TableFormat");
		String DefaultHeaderColor_TableFormat=Utils.getDataFromTestData("SmokeTesting_UI", "DefaultHeaderColor_TableFormat");
       	String DefaultBodyFontSize_TableFormat=Utils.getDataFromTestData("SmokeTesting_UI", "DefaultBodyFontSize_TableFormat");
       	String DefaultBorderType_TableFormat=Utils.getDataFromTestData("SmokeTesting_UI", "DefaultBorderType_TableFormat");
       	String NegativeCellColor_TableFormat=Utils.getDataFromTestData("SmokeTesting_UI", "NegativeCellColor_TableFormat");
       	String AlignmentSelectedColor_TableFormat=Utils.getDataFromTestData("SmokeTesting_UI", "AlignmentSelectedColor_TableFormat");
     	String DefaultSeperator_TableFormat=Utils.getDataFromTestData("SmokeTesting_UI", "DefaultSeperator_TableFormat");
       	String DefaultRoundOff_TableFormat=Utils.getDataFromTestData("SmokeTesting_UI", "DefaultRoundOff_TableFormat");

		
		//Iteration inputs
		String Select_TimeLine_Value=Utils.getDataFromTestDataIteration(iteration,"KPI_Card_Widget_Testing", "Select_TimeLine_Value");
		String Select_KPI_Name_Value1=Utils.getDataFromTestDataIteration(iteration,"KPI_Card_Widget_Testing", "Select_KPI_Name_Value1");
		String Select_KPI_Name_Value2=Utils.getDataFromTestDataIteration(iteration,"KPI_Card_Widget_Testing", "Select_KPI_Name_Value2");
		String Select_KPI_Name_Value3=Utils.getDataFromTestDataIteration(iteration,"KPI_Card_Widget_Testing", "Select_KPI_Name_Value3");
		String Select_Groups_Value1=Utils.getDataFromTestDataIteration(iteration,"KPI_Card_Widget_Testing", "Select_Groups_Value1");
		String Select_Groups_Value2=Utils.getDataFromTestDataIteration(iteration,"KPI_Card_Widget_Testing", "Select_Groups_Value2");
		String Select_Groups_Value3=Utils.getDataFromTestDataIteration(iteration,"KPI_Card_Widget_Testing", "Select_Groups_Value3");
		String Select_PeriodValue=Utils.getDataFromTestDataIteration(iteration,"KPI_Card_Widget_Testing", "Select_PeriodValue");
		String PeriodCount_input=Utils.getDataFromTestDataIteration(iteration,"KPI_Card_Widget_Testing", "PeriodCount_input");

		//Chart title
 		String TypeBackgroundColor1_ChartTitle=Utils.getDataFromTestDataIteration(iteration,"KPI_Card_Widget_Testing", "TypeBackgroundColor1_ChartTitle");
 		String TypeTextColor1_ChartTitle=Utils.getDataFromTestDataIteration(iteration,"KPI_Card_Widget_Testing", "TypeTextColor1_ChartTitle");
 		String Change_FontFamily_ChartTitle=Utils.getDataFromTestDataIteration(iteration,"KPI_Card_Widget_Testing", "Change_FontFamily_ChartTitle");
 		String ChangeFontSize_ChartTitle=Utils.getDataFromTestDataIteration(iteration,"KPI_Card_Widget_Testing", "ChangeFontSize_ChartTitle");
 		String ChangeChartTitleName=Utils.getDataFromTestDataIteration(iteration,"KPI_Card_Widget_Testing", "ChangeChartTitleName");
		
		setTestCaseID(" ");
		Actions action=new Actions(driver);
		mouseOverToElement(driver, ADDTabPlus);
  	    mouseOverAndClick(driver, ADDTabPlus);
  	    wait(driver,"1");
  	    sendKeys(driver,newlyAddedTab,"KPI_CARD_TestTab");
  	    click(driver,DashProPage);
  	    elementnotvisible1(driver, RPE_Loading);
		waitForElement(driver,ADD_widget_rightTop);
	    click(driver,ADD_widget_rightTop);
	    elementnotvisible(driver,Loading);
	    elementnotvisible1(driver, RPE_Loading);
		waitForElement(driver,WidgetPanel);
		waitForElement(driver,Sparkline_widget);
		
		if(TC_KPI_CARD_AXES_001.equals("Yes")) {
			setTestCaseID("TC_KPI_CARD_ AXES_001");
			waitForElement(driver,KPI_Card_widget);
			verifyElementDisplayed(driver, KPI_Card_widget);
		}
		
		if(TC_KPI_CARD_AXES_002.equals("Yes")) {
			setTestCaseID("TC_KPI_CARD_ AXES_002");
			WidgetValidation(driver,KPI_Card_widget,"KPI card");
		}
		
		if(TC_KPI_CARD_AXES_003.equals("Yes")) {
			setTestCaseID("TC_KPI_CARD_ AXES_003");
			click(driver,KPI_Card_widget);
			if(isDisplayed2(driver,error)){
				 String errorWidget=getText1(driver,error);
				 if(errorWidget.contains("Please refer the logs in Logs")) {
					 fail(driver,"Error displayed When click KPI card Widget, Validation : "+errorWidget);
				 }else {
					 pass(driver,"Error displayed When click KPI card Widget, Validation : "+errorWidget);
				 }
				 elementnotvisible1(driver, error);
			 }else {
				 elementnotvisible(driver, Loading);
				 String widgetValue=getText1(driver,WidgetValue);
				 if(widgetValue.equals("KPI_card")) {
					 pass(driver,"'KPI card' displayed as the selected Widget after click on it");
				 }else {
					 fail(driver,"'KPI card' not displayed as the selected Widget after click on it");
				 } 
				 if(TC_KPI_CARD_AXES_004.equals("Yes")) {
					 setTestCaseID("TC_KPI_CARD_ AXES_004");
					 String AxesExpand=getAttribute1(driver,Axes_Expand,"class");
					 if(!AxesExpand.contains("up")) {
						 fail(driver,"By default, Axes Section is not Expanded");
					 }else {
						 pass(driver,"By default, Axes Section is Expanded");
						 String AxesTextColor_Act=getTextColor(driver,Axes);
						 if(AxesColor_Exp.equalsIgnoreCase(AxesTextColor_Act)) {
							 pass(driver," 'Axes' highlighted in blue color");
						 }else {
							 fail(driver," 'Axes' not highlighted in blue color");
						 }
						 if(TC_KPI_CARD_AXES_005.equals("Yes")) {
							 setTestCaseID("TC_KPI_CARD_ AXES_005");
							 String default_TimeLine_Act=getText1(driver,TimeLine_Input);
							 if(default_TimeLine_Act.equals("Select")) {
								 pass(driver,"By Default 'Select' is selected in the TimeLine value input");
							 }else {
								 fail(driver,"By Default 'Select' is not selected in the TimeLine value input");
							 }
						 }
						 
						 if(TC_KPI_CARD_AXES_006.equals("Yes")) {
							 setTestCaseID("TC_KPI_CARD_ AXES_006");
							 scrollUsingElement(driver, ApplyButton);
							 click(driver,ApplyButton);
							 if(isDisplayed2(driver,TimeLine_InputError)) {
								 pass(driver,"'Kindly select timeline column' error is displayed When Click Apply button without providing inputs");
							 }else {
								 fail(driver,"'Kindly select timeline column' error is not displayed When Click Apply button without providing inputs");
							 }	
							 elementnotvisible1(driver, TimeLine_InputError);
						 }
						 
						 if(TC_KPI_CARD_AXES_007.equals("Yes")) {
							 setTestCaseID("TC_KPI_CARD_ AXES_007");
							 if(IsElementEnabled(driver, TimeLine_Input)) {
								 click(driver,TimeLine_Input);
								 if(isDisplayed(driver,TimeLine_dropdownResultsExp)) {
									 pass(driver,"Time Line dropdown Expanded after click on it");
									 if(TC_KPI_CARD_AXES_008.equals("Yes")) {
										 setTestCaseID("TC_KPI_CARD_ AXES_008");
										 List<WebElement> displayedDataImage=getWebElements(driver, dataTypeImages);
										 boolean categorical=true;
										 for(WebElement dataImag:displayedDataImage) {
											 action.moveToElement(dataImag).build().perform();
											 String dataTypeDisplay=dataImag.getAttribute("src");
											 if(dataTypeDisplay.contains("Date")) {
												 
											 }else {
												 fail(driver,"Other than Date datatype column is displayed in the TimeLine dropdown");
												 categorical=false;
												 break;
											 }
										 }
										 if(categorical) {
											 pass(driver, "Only Date datatype column is displayed in the TimeLine dropdown");
										 }
									 }
									 
									 if(TC_KPI_CARD_AXES_009.equals("Yes")) {
										 setTestCaseID("TC_KPI_CARD_ AXES_009");
										 List<WebElement> displayedDataImage=getWebElements(driver, dataTypeImages);
										 List<WebElement> AvailableColumnList=getWebElements(driver, AvailableList_Dropdown);
										 int AvailableColumnListSize=AvailableColumnList.size()-1;
										 if(AvailableColumnListSize==displayedDataImage.size()) {
											 pass(driver,"All the available columns are displayed with data Type icon in the TimeLine dropdown");
										 }else {
											 fail(driver,"Some columns are not correctly displayed with data Type icon in the TimeLine dropdown");
										 }
									 }
									 
									 if(TC_KPI_CARD_AXES_010.equals("Yes")) {
										 setTestCaseID("TC_KPI_CARD_ AXES_010");
										 if(verifyElementDisplayed(driver, dropdownInputsearchBox)) {
											 if(TC_KPI_CARD_AXES_011.equals("Yes")) {
												 setTestCaseID("TC_KPI_CARD_ AXES_011");
												 sendKeys(driver,dropdownInputsearchBox,"sdgffh");
												 if(isDisplayed(driver, NoResultsFound)) {
													 pass(driver,"'No results found' displayed when user enter incorrect value in TimeLine search input");
												 }else {
													 fail(driver,"'No results found' not displayed when user enter incorrect value in TimeLine search input");
												 }
												 clear2(driver,dropdownInputsearchBox);
												 sendKeys(driver,dropdownInputsearchBox,Select_TimeLine_Value);
												 String resultText=getText1(driver,FirstSearchedvalue);
												 if(resultText.contains(Select_TimeLine_Value)) {
													 pass(driver,"Search input in the TimeLine dropdown works properly for valid inputs");
												 }else {
													 fail(driver,"Search input in the TimeLine dropdown not works properly for valid inputs");
												 }
												 
												 if(TC_KPI_CARD_AXES_012.equals("Yes")) {
													 setTestCaseID("TC_KPI_CARD_ AXES_012");
													 selectDropdownValue1(driver,Select_TimeLine_Value);
													 wait(driver,"1");
													 String selectedValue1=getText1(driver,TimeLine_Input);
													 if(selectedValue1.equals(Select_TimeLine_Value)) {
														 pass(driver,"Selected Columnn displayed in the TimeLine input successfully");
													 }else {
														 fail(driver,"Selected Columnn not displayed in the TimeLine input successfully");
													 }
													 
													 if(isDisplayed2(driver,TimeLine_dropdownResultsExp)) {
														 fail(driver,"TimeLine dropdown not closed after selecting the Value ");
													 }else {
														 pass(driver,"Categories dropdown Closed after selecting the Value ");
													 }
												 }
											 }
											 
										 }
									 }
									 
								 }else {
									 fail(driver,"Time Line dropdown not Expanded after click on it");
								 }
							 }else {
								 fail(driver,"TimeLine Input is not Accessible");
							 }
						 }//click TimeLine
						 
						 if(TC_KPI_CARD_AXES_013.equals("Yes")) {
							 setTestCaseID("TC_KPI_CARD_ AXES_013");
						 	String default_KPI_Name_Act=getText1(driver,KPI_Name_Input);
						 	if(default_KPI_Name_Act.equals("")) {
						 		pass(driver,"By Default no value selected in the KPI Name input");
						 	}else {
						 		fail(driver,"By Default value selected in the KPI Name input , Act text : "+default_KPI_Name_Act);
						 	}
						 }
						 
						 if(IsElementEnabled(driver, KPI_Name_Input)) {
							 if(TC_KPI_CARD_AXES_014.equals("Yes")) {
								 setTestCaseID("TC_KPI_CARD_ AXES_014");
								 click(driver,KPI_Name_Input);
								 if(isDisplayed(driver,KPI_Name_dropdownResults)) {
									 pass(driver,"KPI Name dropdown expanded when click on it");
									 if(TC_KPI_CARD_AXES_015.equals("Yes")) {
										 setTestCaseID("TC_KPI_CARD_ AXES_015");
										 List<WebElement> displayedDataImage=getWebElements(driver, dataTypeImages);
										 boolean KPI_Name=true;
										 for(WebElement dataImag:displayedDataImage) {
											 action.moveToElement(dataImag).build().perform();
											 String dataTypeDisplay=dataImag.getAttribute("src");
											 if(dataTypeDisplay.contains("Date") || dataTypeDisplay.contains("Categorical") || dataTypeDisplay.contains("Numerical") || dataTypeDisplay.contains("Text") ) {
												 
											 }else {
												 fail(driver,"Other than Numerical, Date, Text and Categorical datatype column is displayed in the KPI Name dropdown");
												 KPI_Name=false;
												 break;
											 }
										 }
										 if(KPI_Name) {
											 pass(driver, "Only Numerical, Date, Text and Categorical datatype column is displayed in the KPI Name dropdown");
										 } 
									 }
									 
									 if(TC_KPI_CARD_AXES_017.equals("Yes")) {
										 setTestCaseID("TC_KPI_CARD_ AXES_017");
										 List<WebElement> displayedDataImage=getWebElements(driver, dataTypeImages);
										 List<WebElement> AvailableColumnList=getWebElements(driver, AvailableList_Dropdown);
										 if(AvailableColumnList.size()==displayedDataImage.size()) {
											 pass(driver,"All the available columns are displayed with data Type icon in the KPI Name dropdown");
										 }else {
											 fail(driver,"Some columns are not correctly displayed with data Type icon in the KPI Name dropdown");
										 }
									 }
									 
									 if(TC_KPI_CARD_AXES_018.equals("Yes")) {
										 setTestCaseID("TC_KPI_CARD_ AXES_018");
										 if(isDisplayed2(driver,CategoricalColumnAxisDropdown)) {
											 String Categorical1=getText1(driver,CategoricalColumnAxisDropdown);
											 if(Categorical1.contains("(")) {
												 pass(driver,"Unique values are displayed in the Categorical Column in the KPI Name dropdown");
											 }else {
												 fail(driver,"Unique values are not displayed in the Categorical Column in the KPI Name dropdown");
											 }
										 }
											
										 if(isDisplayed2(driver,TextColumnAxisDropdown)) {
											 String Text1=getText1(driver,TextColumnAxisDropdown);
											 if(Text1.contains("(")) {
												 pass(driver,"Unique values are displayed in the Text Column in the KPI Name dropdown");
											 }else {
												 fail(driver,"Unique values are not displayed in the Text Column in the KPI Name dropdown");
											 }
										 }
									 }
									 
									 if(TC_KPI_CARD_AXES_016.equals("Yes")) {
										 setTestCaseID("TC_KPI_CARD_ AXES_016");
										 if(verifyElementDisplayed(driver, dropdownInputsearchBox)) {
											 if(TC_KPI_CARD_AXES_019.equals("Yes")) {
												 setTestCaseID("TC_KPI_CARD_ AXES_019");
												 sendKeys(driver,dropdownInputsearchBox,"afghjku");
												 if(isDisplayed2(driver,NoResultsFound)) {
													 pass(driver,"'No Results found' message is displayed in while searching invalid value in the KPI Name dropdown input");
												 }else {
													 fail(driver,"'No Results found' message is not displayed in while searching invalid value in the KPI Name dropdown input");
												 }
												 clear2(driver,dropdownInputsearchBox);
												 sendKeys(driver, dropdownInputsearchBox, Select_KPI_Name_Value1);
												 String firstValue_=getText1(driver,FirstSearchedvalue);
												 if(firstValue_.contains(Select_KPI_Name_Value1)) {
													 pass(driver,"Searched Value correctly displayed first in the KPI Name dropdown");
												 }else {
													 fail(driver,"Searched Value not correctly displayed first in the KPI Name dropdown");
												 }
												 if(TC_KPI_CARD_AXES_020.equals("Yes")) {
													 setTestCaseID("TC_KPI_CARD_ AXES_020");
													 selectDropdownValue1(driver,Select_KPI_Name_Value1);
													 wait(driver,"1");
													 
													 String selectedValue1=getText1(driver,KPI_Name_Input);
													 if(selectedValue1.contains(Select_KPI_Name_Value1)) {
														 pass(driver,"Selected Columnn displayed in the KPI Name input successfully");
													 }else {
														 fail(driver,"Selected Columnn not displayed in the KPI Name input successfully");
													 }
												 }
												 clear2(driver,dropdownInputsearchBox);
											 }
										 }
									 }
									 
									 if(TC_KPI_CARD_AXES_022.equals("Yes")) {
										 setTestCaseID("TC_KPI_CARD_ AXES_022");
										 List<WebElement> AvailableColumnList=getWebElements(driver, AvailableList_Dropdown);
										 List<WebElement> AvailableAggList=getWebElements(driver, Aggregation_SelectOption);
										 if(AvailableColumnList.size()==AvailableAggList.size()) {
											  pass(driver,"All the available columns are displayed with Aggregation Select Input in the KPI Name dropdown");
										 }else {
											  fail(driver,"Some columns are not correctly displayed with Aggregtaion Select Input in the KPI Name dropdown");
										 }
									 }
									 
									 if(TC_KPI_CARD_AXES_023.equals("Yes")) {
										 setTestCaseID("TC_KPI_CARD_ AXES_023");
										 if(isDisplayed(driver,Cate_agg_fieldSortValue)) {
											 String defaultCategoricalSelect=defaultSelectedValue(driver,Cate_agg_fieldSortValue);
											 if(defaultCategoricalSelect.equals("Count")) {
												 pass(driver,"'Count' is selected as default for Categorical KPI Name dropdown");
											 }else {
												 fail(driver,"'Count' is not selected as default for Categorical KPI Name dropdown ");
											 }
										 }
										 
										 if(isDisplayed(driver,Num_agg_fieldSortValue)) {
											 String defaultNumericalSelect=defaultSelectedValue(driver,Num_agg_fieldSortValue);
									 		 if(defaultNumericalSelect.equals("Sum")) {
									 			pass(driver,"'Sum' is selected as default for Numerical in KPI Name dropdown ");
									     	 }else {
									 			fail(driver,"'Sum' is not selected as default for Numerical in KPI Name dropdown");
									     	 }
										 }
									 }
									 
									 if(TC_KPI_CARD_AXES_021.equals("Yes")) {
										 setTestCaseID("TC_KPI_CARD_ AXES_021");
										 selectDropdownValue1(driver,Select_KPI_Name_Value2);
										 selectDropdownValue1(driver,Select_KPI_Name_Value3);
										 mouseOverAndClick(driver, KPI_Name_text);
										 wait(driver,"1");
										 if(isDisplayed2(driver, KPI_Name_dropdownResults)) {
											 fail(driver,"KPI Name dropdown not closed when click outside it boundaries");
										 }else {
											 pass(driver,"KPI Name dropdown closed when click outside it boundaries");
										 }
										 List<WebElement> selectedKPI=getWebElements(driver, KPI_Selectedvalues);
										 if(selectedKPI.size()>2) {
											 pass(driver,"KPI Name input allows multiple input selection");
										 }else {
											 fail(driver,"KPI Name input multiple values selection is not successfull");
										 }
									 }
									 Escape(driver);
								 }else {
									 fail(driver,"KPI Name dropdown not expanded when click on it");
								 }							 
							 }
						 }else {
							 fail(driver,"KPI Name input is not Accessible ");
						 }
						 						 
						 if(TC_KPI_CARD_AXES_024.equals("Yes")) {
							 setTestCaseID("TC_KPI_CARD_ AXES_024");
							 String default_Group_Act=getText1(driver,Group_Select_Input);
						 	 if(default_Group_Act.equals("")) {
						 		pass(driver,"By Default no value selected in the Group input");
						 	 }else {
						 		fail(driver,"By Default value selected in the Group input , Act text : "+default_Group_Act);
						 	 }
						 }
						 
						 if(IsElementEnabled(driver, Group_Select_Input)) {
							 if(TC_KPI_CARD_AXES_025.equals("Yes")) {
								 setTestCaseID("TC_KPI_CARD_ AXES_025");
								 click(driver,Group_Select_Input);
								 if(isDisplayed(driver,Group_DropdownResults)) {
									 pass(driver,"Group dropdown expanded when click on it");
									 if(TC_KPI_CARD_AXES_026.equals("Yes")) {
										 setTestCaseID("TC_KPI_CARD_ AXES_026");
										 List<WebElement> displayedDataImage=getWebElements(driver, dataTypeImages);
										 boolean GroupInput=true;
										 for(WebElement dataImag:displayedDataImage) {
											 action.moveToElement(dataImag).build().perform();
											 String dataTypeDisplay=dataImag.getAttribute("src");
											 if(dataTypeDisplay.contains("Date") || dataTypeDisplay.contains("Categorical") || dataTypeDisplay.contains("Numerical") || dataTypeDisplay.contains("Text") ) {
												 
											 }else {
												 fail(driver,"Other than Numerical, Date, Text and Categorical datatype column is displayed in the Groups dropdown");
												 GroupInput=false;
												 break;
											 }
										 }
										 if(GroupInput) {
											 pass(driver, "Only Numerical, Date, Text and Categorical datatype column is displayed in the Groups dropdown");
										 } 
									 }
									 if(TC_KPI_CARD_AXES_028.equals("Yes")) {
										 setTestCaseID("TC_KPI_CARD_ AXES_028");
										 List<WebElement> displayedDataImage=getWebElements(driver, dataTypeImages);
										 List<WebElement> AvailableColumnList=getWebElements(driver, AvailableList_Dropdown);
										 if(AvailableColumnList.size()==displayedDataImage.size()) {
											 pass(driver,"All the available columns are displayed with data Type icon in the Groups dropdown");
										 }else {
											 fail(driver,"Some columns are not correctly displayed with data Type icon in the Groups dropdown");
										 }
									 }
									 
									 if(TC_KPI_CARD_AXES_029.equals("Yes")) {
										 setTestCaseID("TC_KPI_CARD_ AXES_029");
										 if(isDisplayed2(driver,CategoricalColumnAxisDropdown)) {
											 String Categorical1=getText1(driver,CategoricalColumnAxisDropdown);
											 if(Categorical1.contains("(")) {
												 pass(driver,"Unique values are displayed in the Categorical Column in the Groups dropdown");
											 }else {
												 fail(driver,"Unique values are not displayed in the Categorical Column in the Groups dropdown");
											 }
										 }
										 	
										 if(isDisplayed2(driver,TextColumnAxisDropdown)) {
											 String Text1=getText1(driver,TextColumnAxisDropdown);
											 if(Text1.contains("(")) {
												 pass(driver,"Unique values are displayed in the Text Column in the Groups dropdown");
											 }else {
												 fail(driver,"Unique values are not displayed in the Text Column in the Groups dropdown");
											 }
										 }
									 }
									 
									 if(TC_KPI_CARD_AXES_027.equals("Yes")) {
										 setTestCaseID("TC_KPI_CARD_ AXES_027");
										 if(isDisplayed2(driver, dropdownInputsearchBox)) {
											 pass(driver,"Search input is displayed in the Groups dropdown");
											 if(TC_KPI_CARD_AXES_030.equals("Yes")) {
												 setTestCaseID("TC_KPI_CARD_ AXES_030");
												 sendKeys(driver,dropdownInputsearchBox,"afghjku");
												 if(isDisplayed2(driver,NoResultsFound)) {
													 pass(driver,"'No Results found' message is displayed in while searching invalid value in the Groups dropdown input");
												 }else {
													 fail(driver,"'No Results found' message is not displayed in while searching invalid value in the Groups dropdown input");
												 }
												 clear2(driver,dropdownInputsearchBox);
												 sendKeys(driver, dropdownInputsearchBox, Select_Groups_Value1);
												 String firstValue_=getText1(driver,FirstSearchedvalue);
												 if(firstValue_.contains(Select_Groups_Value1)) {
													 pass(driver,"Searched Value correctly displayed first in the Groups dropdown");
												 }else {
													 fail(driver,"Searched Value not correctly displayed first in the Groups dropdown");
												 }
												 clear2(driver,dropdownInputsearchBox);
											 }
											 if(TC_KPI_CARD_AXES_031.equals("Yes")) {
												 setTestCaseID("TC_KPI_CARD_ AXES_031");
												 selectDropdownValue1(driver,Select_Groups_Value1);
												 wait(driver,"1");
												 String selectedValue1=getText1(driver,Group_Select_Input);
												 if(selectedValue1.contains(Select_Groups_Value1)) {
													 pass(driver,"Selected Columnn displayed in the Groups input successfully");
												 }else {
													 fail(driver,"Selected Columnn not displayed in the Groups input successfully");
												 }
											 }
										 }else {
											 fail(driver,"Search input is not displayed in the Groups dropdown");
										 }
									 }
									 
									 if(TC_KPI_CARD_AXES_032.equals("Yes")) {
										 setTestCaseID("TC_KPI_CARD_ AXES_032");
										 selectDropdownValue1(driver,Select_Groups_Value2);
										 selectDropdownValue1(driver,Select_Groups_Value3);
										 wait(driver,"1");
										 List<WebElement> selectedGroups=getWebElements(driver, Groups_Selectedvalues);
										 if(selectedGroups.size()>1) {
											 pass(driver,"Groups input allows multiple input selection");
										 }else {
											 fail(driver,"Groups input multiple value selection is not successfull");
										 }
										 mouseOverAndClick(driver, KPI_Name_text);
										 wait(driver,"1");
										 if(isDisplayed2(driver, Group_DropdownResults)) {
											 fail(driver,"Groups dropdown not closed when click outside it boundaries");
										 }else {
											 pass(driver,"Groups dropdown closed when click outside it boundaries");
										 }
									 }
								 }else {
									 fail(driver,"Group dropdown not expanded when click on it");
								 }
							 }
						 }else {
							 fail(driver,"Group Input is not Accessible");
						 }
						
						 if(TC_KPI_CARD_AXES_033.equals("Yes")) {
							 setTestCaseID("TC_KPI_CARD_ AXES_033");
							 String default_Periods=defaultSelectedValue(driver, Period_input);
							 if(default_Periods.equals(DefaultPeriod_Value)) {
								 pass(driver,"By default '"+DefaultPeriod_Value+"' is selected in the Periods input");
							 }else {
								 fail(driver,"By default '"+DefaultPeriod_Value+"' is not selected in the Periods input ");
							 }
						 }
						 
						 if(IsElementEnabled(driver, Period_input)) {
							 if(TC_KPI_CARD_AXES_034.equals("Yes")) {
								 setTestCaseID("TC_KPI_CARD_ AXES_034");
								 click(driver,Period_input);
								 verifyElementIsPresent1(driver, Period_InputOption);
							 }
							 if(TC_KPI_CARD_AXES_035.equals("Yes")) {
								 setTestCaseID("TC_KPI_CARD_ AXES_035");
								 selectByText(driver, Period_input, Select_PeriodValue);
							 }
							 
						 }else {
							 fail(driver,"Period input is not Accessible");
						 }
						 
						 if(TC_KPI_CARD_AXES_036.equals("Yes")) {
							 setTestCaseID("TC_KPI_CARD_ AXES_036");
							 String default_PeriodCount=getTextJavascript(driver, Period_Count_Input);
							 if(default_PeriodCount.equals(DefaultPeriod_CountValue)) {
								 pass(driver,"By default '"+DefaultPeriod_CountValue+"' is displayed in the Periods count input");
							 }else {
								 fail(driver,"By default '"+DefaultPeriod_CountValue+"' is not displayed in the Periods count input ");
							 }
						 }
						 
						 if(IsElementEnabled(driver, Period_Count_Input)) {
							 if(TC_KPI_CARD_AXES_037.equals("Yes")) {
								 setTestCaseID("TC_KPI_CARD_ AXES_037");
								 clear1(driver,Period_Count_Input);
								 scrollUsingElement(driver, ApplyButton);
								 click(driver,ApplyButton);
								 if(isDisplayed2(driver,PeriodCountError)) {
									 pass(driver,"'Kindly provide period atleast greater than 1' error is displayed when click Apply button without given period count value");
									 elementnotvisible1(driver, PeriodCountError);
								 }else {
									 fail(driver,"'Kindly provide period atleast greater than 1' error is not displayed when click Apply button without given period count value");
								 }
							 }
							 
							 if(TC_KPI_CARD_AXES_038.equals("Yes")) {
								 setTestCaseID("TC_KPI_CARD_ AXES_038");
								 clearAndType1(driver, Period_Count_Input, PeriodCount_input);
								 wait(driver,"1");
								 String text=getTextJavascript(driver, Period_Count_Input);
								 if(text.equals(PeriodCount_input)) {
									 pass(driver,"Value successfully entered in the input");
								 }
							 }
							 
						 }else {
							 fail(driver,"Period count input is not accessible");
						 }
						 setTestCaseID("");
						 scrollUsingElement(driver, ApplyButton);
						 click(driver,ApplyButton);
						 elementnotvisible1(driver, RPE_Loading);
						 if(isDisplayed2(driver, TableHeadingFirst)){
							 pass(driver,"Chart is Displayed after selecting the inputs");
						 }else {
							 fail(driver,"Chart is not displayed after selecting the inputs");
						 }
						 System.out.println("Axes end..........");
					 }// Axess Expand
				 }//Axess Expand condition check
				 System.out.println("Chart Title Start..........");
				 setTestCaseID("");
			     // ******************** ChartTitle Validation Start *******************
				 String KPI_Card_Chart_Title= getCellValue("TestExecution","Testcase_Selection","KPI_Card_Chart_Title",Flag);
				 if(KPI_Card_Chart_Title.equals("Yes")) {
					 CHART_TITLE chartTitle=new CHART_TITLE();
					 chartTitle.chartTitleTest(driver, TypeBackgroundColor1_ChartTitle, TypeTextColor1_ChartTitle, Change_FontFamily_ChartTitle, ChangeFontSize_ChartTitle,ChangeChartTitleName);       	
				 }
		        // ******************** ChartTitle Validation End *******************
				 setTestCaseID("");
				// ******************** Table Format Validation Start *******************
		        String KPI_Card_Table_Format= getCellValue("TestExecution","Testcase_Selection","KPI_Card_Table_Format",Flag);
		        if(KPI_Card_Table_Format.equals("Yes")) {
		        	
		  		  String TC_KPI_CARD_TABLE_FORMAT_001=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_001",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_002=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_002",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_003=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_003",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_004=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_004",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_005=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_005",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_006=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_006",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_007=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_007",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_008=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_008",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_009=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_009",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_010=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_010",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_011=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_011",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_012=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_012",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_013=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_013",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_014=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_014",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_015=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_015",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_016=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_016",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_017=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_017",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_018=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_018",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_019=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_019",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_020=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_020",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_021=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_021",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_022=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_022",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_023=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_023",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_024=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_024",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_025=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_025",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_026=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_026",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_027=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_027",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_028=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_028",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_029=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_029",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_030=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_030",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_031=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_031",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_032=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_032",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_033=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_033",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_034=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_034",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_035=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_035",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_036=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_036",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_037=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_037",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_038=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_038",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_039=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_039",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_040=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_040",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_041=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_041",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_042=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_042",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_043=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_043",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_044=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_044",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_045=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_045",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_046=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_046",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_047=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_047",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_048=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_048",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_049=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_049",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_050=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_050",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_051=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_051",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_052=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_052",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_053=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_053",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_054=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_054",TestcaseID_Flag);
		  		  String TC_KPI_CARD_TABLE_FORMAT_055=getTestcaseID_Flag(TestcaseFileName,SheetName_Table_Format,TescasesID_Column,"TC_ KPICARD_TABLE FORMAT_055",TestcaseID_Flag);
		  		  
		  		  
		  		  String Select_Table_Theme_Input=Utils.getDataFromTestDataIteration(iteration,"KPI_Card_Widget_Testing", "Select_Table_Theme_Input");
		  		  String Select_FontFamily_Value=Utils.getDataFromTestDataIteration(iteration,"KPI_Card_Widget_Testing", "Select_FontFamily_Value");
		  		  String Select_HeaderFontSize_TableFormat=Utils.getDataFromTestDataIteration(iteration,"KPI_Card_Widget_Testing", "Select_HeaderFontSize_TableFormat");
		  		  String ChangeHeaderColor_TableFormat=Utils.getDataFromTestDataIteration(iteration,"KPI_Card_Widget_Testing", "ChangeHeaderColor_TableFormat");
		  		  String Select_BodyFontSize_TableFormat=Utils.getDataFromTestDataIteration(iteration,"KPI_Card_Widget_Testing", "Select_BodyFontSize_TableFormat");
		  		  String Select_Border_Value_TableFormat=Utils.getDataFromTestDataIteration(iteration,"KPI_Card_Widget_Testing", "Select_Border_Value_TableFormat");
		  		  String Change_Seperator_Option=Utils.getDataFromTestDataIteration(iteration,"KPI_Card_Widget_Testing", "Change_Seperator_Option");
		  		  String Change_RoundOff_Option=Utils.getDataFromTestDataIteration(iteration,"KPI_Card_Widget_Testing", "Change_RoundOff_Option");
		  		  
		  		  setTestCaseID("");
		  		  if(verifyElementDisplayed(driver, TableFormat_Sec)) {
		  			  click(driver,TableFormat_Sec);
		  			  wait(driver,"1");
		  			  String TableFormatSecExpand=getAttribute1(driver,TableFormatExpand,"class");
		  			  if(!TableFormatSecExpand.contains("up")) {
		  				  fail(driver,"Table Format Section is not expanded When Click on it");
		  			  }else {
		  				  pass(driver,"Table Format Section is expanded When Click on it");
		  				  if(TC_KPI_CARD_TABLE_FORMAT_001.equals("Yes")) {
		  					  setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_001");
		  					  String TableThemeAct="";
		  					  List<WebElement> ThemeResultValues=getWebElements(driver, Table_Theme_Results);
		  					  for(WebElement ThemeResultValue:ThemeResultValues) {
		  						  if(ThemeResultValue.isSelected()) {
		  							  String SelectedClass=ThemeResultValue.getAttribute("value");
		  							  System.out.println("SelectedClassValue "+SelectedClass);
		  							  TableThemeAct=SelectedClass;
		  						  }
		  					  }
		  					  System.out.println("TableThemeAct : "+TableThemeAct);
		  					  if(TableThemeAct.equals("")) {
		  						  pass(driver,"By default, Table theme value is selected as 'Default'");
		  					  }else {
		  						  fail(driver,"By default, Table theme value is not selected as 'Default'");
		  					  }  
		  				  }
		  				  
		  				  setTestCaseID("TS_KPI_CARD_ TABLE_FORMAT_001");
		  				  if(IsElementEnabled(driver, Table_Theme_Input)) {
		  					 if(TC_KPI_CARD_TABLE_FORMAT_002.equals("Yes")) {
			  					  setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_002");
			  					  click(driver,Table_Theme_Input);
			  					  verifyElementIsPresent(driver, Table_Theme_Results);
			  					  List<WebElement> ThemeResultValues=getWebElements(driver, Table_Theme_Results);
			  					  int tablethemesize=ThemeResultValues.size();
			  					  if(tablethemesize==9) {
			  						  pass(driver,"All the table theme lists are present in the Table Theme dropdown ");
			  					  }else {
			  						  fail(driver,"Some table theme lists are present in the Table Theme dropdown ");
			  					  }
			  				  }
			  				  
			  				  if(TC_KPI_CARD_TABLE_FORMAT_003.equals("Yes")) {
			  					  setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_003");
			  					  selectByText(driver,Table_Theme_Input,Select_Table_Theme_Input);
			  					  wait(driver,"1");
			  					  String AfterSelectThemeValue="";
			  					  List<WebElement> ThemeResultValues=getWebElements(driver, Table_Theme_Results);
			  					  for(WebElement ThemeResultValue:ThemeResultValues) {
		 							 if(ThemeResultValue.isSelected()) {
		 								 String SelectedClass=ThemeResultValue.getAttribute("value");
		 								 AfterSelectThemeValue=SelectedClass;
		 							 }
		 							
			  					  }
			  					  try {
		 							Select_Table_Theme_Input=Select_Table_Theme_Input.replace(" ", "");
			  					  }catch(Exception e) {
		 							 
			  					  }
			  					  Select_Table_Theme_Input=Select_Table_Theme_Input.toLowerCase();
			  					  if(AfterSelectThemeValue.contains(Select_Table_Theme_Input)) {
		 							 pass(driver,"Selected Value '"+Select_Table_Theme_Input+"' is updated in the Table Theme Input");
			  					  }else {
		 							 fail(driver,"Selected Value '"+Select_Table_Theme_Input+"' is not updated in the Table Theme Input");
			  					  }
		 						 
			  					  scrollUsingElement(driver, ApplyButton);
			  					  click(driver, ApplyButton); //click Apply change
			  					  elementnotvisible1(driver, RPE_Loading);
			  					  String tableAppliedTheme=getAttribute1(driver, TableChart, "class");
			  					  if(tableAppliedTheme.contains(Select_Table_Theme_Input)) {
			  						  pass(driver,"Selected theme value applied in the Chart");
			  					  }else {
			  						  fail(driver,"Selected theme value not applied in the Chart");
			  					  }
			  				  }
		  				  }else {
		  					  fail(driver,"Table Theme input is not Accessible");
		  				  }
		  				  
		  				  setTestCaseID("TS_KPI_CARD_ TABLE_FORMAT_002");
		  				  if(verifyElementDisplayed(driver, ODDEven_toggleTableFormat1)) {
		  					if(TC_KPI_CARD_TABLE_FORMAT_004.equals("Yes")) {
			  					  setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_004");
			  					  if(isToggleEnable(driver,OddEven_toggle_TableFormat)) {
		 							 pass(driver,"By default, 'Odd/Even Colors' input toggle is displayed as ON");
		 							 scrollUsingElement(driver, ApplyButton);
		 							 click(driver, ApplyButton); 
		 							 elementnotvisible1(driver, RPE_Loading);
		 							 waitForElement(driver,Table_firstRow);
		 							 String firstRowBackgroundColor=getTextBackgroundColor(driver, Table_firstRow);
		 							 String secondRowBackgroundColor=getTextBackgroundColor(driver, Table_SecondRow);
		 							 if(firstRowBackgroundColor.equalsIgnoreCase(secondRowBackgroundColor)) {
		 								 fail(driver,"Odd/Even Colors is not applied in the Table When the toggle is in 'ON' Condition");
		 							 }else {
		 								 pass(driver,"Odd/Even Colors is applied in the Table When the toggle is in 'ON' Condition");
		 							 }
		 							 
		 							if(TC_KPI_CARD_TABLE_FORMAT_005.equals("Yes")) {
				 						setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_005");
				 						String toggleONColor=getTextBackgroundColor(driver, ODDEven_toggleTableFormat1);
				 						 if(toggleONColor.equalsIgnoreCase("#2196F3")) {
				 							 pass(driver,"Toggle is displayed in blue color when it is ON condition");
				 						 }else {
				 							 fail(driver,"Toggle is not displayed in blue color when it is ON condition");
				 						 }
		 							}
		 							 
		 						 }else {
		 							 fail(driver,"By default, 'Odd/Even Colors' input toggle is displayed as ON");
		 						 }
		  					 }
		  				  }
		  				  
		  				  setTestCaseID("TS_KPI_CARD_ TABLE_FORMAT_002");
		  				  if(IsElementEnabled(driver, OddEven_toggle_TableFormat)) {
		  					if(TC_KPI_CARD_TABLE_FORMAT_006.equals("Yes")) {
		  						setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_006");
		  						click(driver,ODDEven_toggleTableFormat1);
		  						wait(driver,"1");
		  						if(isToggleEnable(driver,OddEven_toggle_TableFormat)) {
		  							fail(driver,"'Odd/Even Colors' input toggle is not changed to 'OFF' when click on it");
		  						}else {
		  							pass(driver,"'Odd/Even Colors' input toggle is changed to 'OFF' when click on it");
		  							scrollUsingElement(driver, ApplyButton);
		  							wait(driver,"1");
		  							click(driver, ApplyButton);
		  							elementnotvisible1(driver, RPE_Loading);
		  							String firstRowBackgroundColor=getTextBackgroundColor(driver, Table_firstRow);
		  							String secondRowBackgroundColor=getTextBackgroundColor(driver, Table_SecondRow);
		  							if(firstRowBackgroundColor.equalsIgnoreCase(secondRowBackgroundColor)) {
		  								pass(driver,"Odd/Even Colors is not applied in the Table When the toggle is in 'OFF' Condition");
		  							}else {
		  								fail(driver,"Odd/Even Colors is applied in the Table When the toggle is in 'OFF' Condition");
		  							} 
		  						}
		  					}
		  				  }else {
		  					  fail(driver,"Odd/Even toggle is not Accessible");
		  				  }
		  				  
		  				  setTestCaseID("TS_KPI_CARD_ TABLE_FORMAT_003");
		  				  if(verifyElementDisplayed(driver, FontFamily_Input_TableFormat)) {
		  					 if(TC_KPI_CARD_TABLE_FORMAT_007.equals("Yes")) {
			  					  setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_007");
			  					  String FontFamilyAct_TableFormat=getText1(driver,FontFamily_Input_TableFormat);
			  					  if(FontFamilyAct_TableFormat.equals(DefaultFontFamily_TableFormat)) {
		 							 pass(driver,"By default, '"+DefaultFontFamily_TableFormat+"' is selected in the Font Family input");
			  					  }else {
		 							 fail(driver,"By default, '"+DefaultFontFamily_TableFormat+"' is not selected in the Font Family input");
			  					  }
			  				  }
		  					 
		  					  setTestCaseID("TS_KPI_CARD_ TABLE_FORMAT_003");
		  					  if(IsElementEnabled(driver, FontFamily_Input_TableFormat)) {
		  						  if(TC_KPI_CARD_TABLE_FORMAT_008.equals("Yes")) {
				  					  setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_008");
				  					  click(driver,FontFamily_Input_TableFormat);
				  					  if(isDisplayed(driver,FontFamilyExpand_TableFormat)) {
				  						  pass(driver,"FontFamily dropdown is expanded with results after click on it");
				  						  if(TC_KPI_CARD_TABLE_FORMAT_012.equals("Yes")) {
						  					  setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_012");
						  					  ScrollBarValidation1(driver,FontFamilyExpand_TableFormat,"Font_family_KPI_Card");
				  						  }
				  						  if(TC_KPI_CARD_TABLE_FORMAT_009.equals("Yes")) {
						  					  setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_009");
						  					  if(isDisplayed(driver,SearchInput_FontFamilyDropdown)) {
						  						  pass(driver,"Search Input is present in the Fontfamily dropdown");
						  						  if(TC_KPI_CARD_TABLE_FORMAT_010.equals("Yes")) {
								  					  setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_010");
								  					  sendKeys(driver,dropdownInputsearchBox,"afghjku");
								  					  if(isDisplayed2(driver,NoResultsFound)) {
								  						  pass(driver,"'No Results found' message is displayed in while searching invalid value in the Font Family dropdown");
								  					  }else {
								  						  fail(driver,"'No Results found' message is not displayed in while searching invalid value in the Font Family dropdown");
								  					  }
								  					  clear1(driver,dropdownInputsearchBox);
						  						  }
						  						  if(TC_KPI_CARD_TABLE_FORMAT_011.equals("Yes")) {
								  					  setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_011");
								  					  sendKeys(driver,SearchInput_FontFamilyDropdown,Select_FontFamily_Value);
								  					  wait(driver,"1");
								  					  String FirstFontFamilyResult=getText1(driver,FontFamilyResult1);
								  					  if(FirstFontFamilyResult.equals(Select_FontFamily_Value)) {
								  						  pass(driver,"Seach functions works properly in the font family results");
								  					  }else {
								  						  fail(driver,"Seach functions not working properly in the font family results");
								  					  }
						  						  }
						  					  }else {
						  						  fail(driver,"Search Input is not present in the Fontfamily dropdown");  
						  					  }
				  						  }
			 							
				  						  if(TC_KPI_CARD_TABLE_FORMAT_013.equals("Yes")) {
						  					  	setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_013");
						  					  	selectFontFamily(driver,Select_FontFamily_Value);
						  					  	if(isDisplayed2(driver,FontFamilyExpand_TableFormat)) {
						  					  		fail(driver,"Font Family dropdown is not closed after selecting value");
						  					  	}else {
						  					  		pass(driver,"Font Family dropdown is closed after selecting value");
						  					  	}
						  					  	String FontFamilyResutValue=getText1(driver,FontFamily_Input_TableFormat);
						  					  	if(FontFamilyResutValue.equals(Select_FontFamily_Value)) {
						 							pass(driver,"Selected Font Family Value is updadted in the FontFamily Input");
						  					  	}else {
						 							fail(driver,"Selected Font Family Value is not updated in the FontFamily Input");
						  					  	}
						 							
						  					  	scrollUsingElement(driver, ApplyButton);
						  					  	click(driver, ApplyButton);
						  					  	elementnotvisible1(driver, RPE_Loading);
						  					  	waitForElement(driver,TableChart);
						  					  	String FonFamilyApplied_Table=getFontFamily(driver,TableChart);
						  					  	if(FonFamilyApplied_Table.contains(Select_FontFamily_Value)) {
						  					  		pass(driver,"Selected Font Family is applied in the table chart, Exp : "+Select_FontFamily_Value+", Act : "+FonFamilyApplied_Table);
						  					  	}else {
						  					  		fail(driver,"Selected Font Family is not applied in the table chart, Exp : "+Select_FontFamily_Value+", Act : "+FonFamilyApplied_Table);
						  					  	}
				  						  }
				  					  }else {
				  						  fail(driver,"FontFamily dropdown is not expanded with results after click on it");
				  					  }
		  						  }
		  					  }else {
		  						  fail(driver,"Font Family input is not Accessible");
		  					  }
		  				  }
		  				  
		  				  setTestCaseID("TS_KPI_CARD_ TABLE_FORMAT_004");
	  					  if(verifyElementDisplayed(driver, FontSizeInput_TableFormat)) {
	  						  if(TC_KPI_CARD_TABLE_FORMAT_014.equals("Yes")) {
	  							  setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_014");
	  							  String defaultFontSizeHeader=getTextJavascript(driver, FontSizeInput_TableFormat);
	  					  			//System.out.println("defaultFontSizeHeader : "+defaultFontSizeHeader);
	  							  if(DefaultFontSize_TableFormat.equals(defaultFontSizeHeader)) {
	  								  pass(driver,"Predefined fontsize value '"+DefaultFontSize_TableFormat+"' is updated by default in the Header Font Size input");
	  							  }else {
	  								  fail(driver,"Predefined fontsize value '"+DefaultFontSize_TableFormat+"' is not updated by default in the Header Font Size input");
	  							  }
	  						  }
	  						  
	  						  if(TC_KPI_CARD_TABLE_FORMAT_015.equals("Yes")) {
	  							  setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_015");
	  							  if(IsElementEnabled(driver, FontSizeInput_TableFormat)) {
	  								   pass(driver,"Font Size input is accessible");
	  								   click(driver,FontSizeInput_TableFormat);
	  								   if(verifyElementIsPresent1(driver, FontSize__Results)) {
	  									 List<WebElement> fonSizeResults=getWebElements(driver, FontSize__Results);
	  									 int fonSizeResultsCount=fonSizeResults.size();
	  									 if(fonSizeResultsCount==54) {
	  										 pass(driver,"All the Font Size Values is present ");
	  									 }else {
	  										 fail(driver,"Some Font Size Values is not present ");
	  									 }
	  								   }
	  								   
	  								   if(TC_KPI_CARD_TABLE_FORMAT_016.equals("Yes")) {
	  		  							  setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_016");
	  		  							  selectByText(driver,FontSizeInput_TableFormat,Select_HeaderFontSize_TableFormat);
	  		  							  wait(driver,"1");
	  		  							  String selectedFontSizeResult=getTextJavascript(driver, FontSizeInput_TableFormat);
	  		  							  if(selectedFontSizeResult.equals(Select_HeaderFontSize_TableFormat)) {
	  		  								  pass(driver,"Selected Font size value updated in the Header FontSize input");
	  		  								  scrollUsingElement(driver, ApplyButton);
	  		  								  click(driver, ApplyButton);
	  		  								  elementnotvisible1(driver, RPE_Loading);
	  		  								  waitForElement(driver,TableChart);
	  		  								  String AppliedFontSize_TableHeader=getFontSize(driver, TableHeaderRow);
	  		  								  if(AppliedFontSize_TableHeader.equals(Select_HeaderFontSize_TableFormat)) {
		  			 							pass(driver,"Selected Font Size is updated in the Header rows in the resulting Table");
	  		  								  }else {
		  			 							fail(driver,"Selected Font Size is not updated in the Header rows in the resulting Table");
	  		  								  }
	  		  							  }else {
	  		  								  fail(driver,"Selected Font size value is not updated in the Header FontSize input");
	  		  							  }
	  			 						 
	  								   }
	  								   
	  							  }else {
	  								  fail(driver,"Font Size input is not accessible");
	  							  }
	  						  }
	  					  }
		  				  
	  					  setTestCaseID("TS_KPI_CARD_ TABLE_FORMAT_005");
	  					  if(verifyElementDisplayed(driver, HeaderColorInput_TableFormat)) {
	  						if(TC_KPI_CARD_TABLE_FORMAT_019.equals("Yes")) {
	  							setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_019");
	  							String defaultHeaderColorAct=getTextJavascript(driver,HeaderColorInput_TableFormat);
	  							System.out.println("defaultHeaderColorAct : "+defaultHeaderColorAct);
	  							if(DefaultHeaderColor_TableFormat.equalsIgnoreCase(defaultHeaderColorAct)) {
		 							pass(driver,"By default '"+DefaultHeaderColor_TableFormat+"' color is selected in the Header Color Input");
	  							}else {
		 							fail(driver,"By default '"+DefaultHeaderColor_TableFormat+"' color is not selected in the Header Color Input");
	 							}		 
	  						}
	  						
	  						if(TC_KPI_CARD_TABLE_FORMAT_017.equals("Yes")) {
	  							setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_017");
	  							click(driver,HeaderColorInput_TableFormat);
	  							if(isDisplayed(driver,ColorPickerOpen)) {
	  								pass(driver,"Color picker results opened after click on the Header Color Input");
	  								if(TC_KPI_CARD_TABLE_FORMAT_018.equals("Yes")) {
	  		  							setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_018");
	  		  							click(driver,HeaderColorText_TableFormat);
	  		  							wait(driver,"1");
	  		  							if(isDisplayed2(driver,ColorPickerOpen)) {
	  		  								fail(driver,"Color picker is not closed when clicking outside its boundaries");
	  		  							}else {
	  		  								pass(driver,"Color picker is closed when clicking outside its boundaries");
	  		  							}	
	  								}
		 							
	  							}else {
	  								fail(driver,"Color picker results not opened after click on the Header Color Input");
	  							}
	  						}
	  						  
	  						if(TC_KPI_CARD_TABLE_FORMAT_020.equals("Yes")) {
	  							setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_020");
	  							click(driver,HeaderColorInput_TableFormat);
	  							action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
	  							sendKeys(driver,HeaderColorInput_TableFormat,ChangeHeaderColor_TableFormat);
	  							wait(driver,"1");
	  							click3(driver,HeaderColorText_TableFormat);
	  							String SelectedHeaderColorValue=getTextBackgroundColor(driver, HeaderColorInput_Pointer);
	  							if(SelectedHeaderColorValue.equalsIgnoreCase(ChangeHeaderColor_TableFormat)) {
	  								pass(driver,"Manually Entered Color Value is updated in the Header Color input..");
	  								
	  								if(TC_KPI_CARD_TABLE_FORMAT_022.equals("Yes")) {
	  		  							setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_022");
	  		  							scrollUsingElement(driver, ApplyButton);
	  		  							click(driver, ApplyButton);
	  		  							elementnotvisible1(driver, RPE_Loading);
	  		  							String Applied_Table_HeaderColor=getTextColor(driver, TableHeadingCell);
	  		  							if(Applied_Table_HeaderColor.equalsIgnoreCase(ChangeHeaderColor_TableFormat)) {
	  		  								pass(driver,"Manually Entered Color Value is updated in the Table Header values");
	  		  							}else {
	  		  								fail(driver,"Manually Entered Color Value is not updated in the Table Header values");
	  		  							}
	  								}
	  								
	  								
	  							}else {
	  								fail(driver,"Manually Entered Color Value is not updated in the Header Color input..");
	  							}
	  						}
	  						
	  						if(TC_KPI_CARD_TABLE_FORMAT_021.equals("Yes")) {
	  							setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_021");
	  							click(driver,HeaderColorInput_TableFormat);
		 						 waitForElement(driver,ColorPickerOpen);
		 						 mouseOverToElement(driver,Color2);
		 						 mouseOverToElement(driver, mouseOverColorHistory);
		 						// mouseOverToElement(driver,Color2);
		 						 wait(driver,"1");
		 						 String mouseOverHistoryColor=getText1(driver,mouseOverColorHistory);
		 						 doubleClick(driver,mouseOverColorHistory);
		 						 wait(driver,"1");
		 						 action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		 						 
		 						 wait(driver,"1");
		 						 doubleClick(driver,HeaderColorInput_TableFormat);
		 						 wait(driver,"1");
		 						 action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		 						 wait(driver,"1");
		 						 click(driver,HeaderColorText_TableFormat);
		 						 String AfterPasteBackgroundColor=getTextBackgroundColor(driver, HeaderColorInput_Pointer);
		 						 if(AfterPasteBackgroundColor.equalsIgnoreCase(mouseOverHistoryColor)) {
		 							 pass(driver,"Copy Paste Color value is working fine in Heade Color Input");
		 						 }else {
		 							 fail(driver,"Copy Paste Color value is not working fine in Header Color Input");
		 						 }
	  						}
	  					  }
		  				  
	  					  setTestCaseID("TS_KPI_CARD_ TABLE_FORMAT_006");
	  					  if(verifyElementDisplayed(driver, WrapHeaded_toggle_TableFormat)) {
	  						  if(TC_KPI_CARD_TABLE_FORMAT_023.equals("Yes")) {
	  							  setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_023");
	  							  if(isToggleEnable(driver,WrapHeaders_Input_TableFormat)) {
		 							fail(driver,"Wrap header toggle is not displayed in 'OFF' by default");
	  							  }else {
		 							pass(driver,"Wrap header toggle is displayed in 'OFF' by default");
		 							String TableHeaderWrapOFF_Act=getAttribute1(driver, TableHeadingCell, "class");
		 							if(TableHeaderWrapOFF_Act.contains("header-wrap-text")) {
		 								fail(driver,"Table Header values are wrapped when the toggle is in the OFF Condition");
		 							}else {
		 								pass(driver,"Table Header values are not wrapped when the toggle is in the OFF Condition");
		 							}
	  							  }
	  						  }
	  						  setTestCaseID("TS_KPI_CARD_ TABLE_FORMAT_005");
	  						  if(IsElementEnabled(driver, WrapHeaders_Input_TableFormat)) {
	  							if(TC_KPI_CARD_TABLE_FORMAT_024.equals("Yes")) {
	  								setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_024");
	  								click(driver,WrapHeaded_toggle_TableFormat);
	  								wait(driver,"1");
	  								if(isToggleEnable(driver,WrapHeaders_Input_TableFormat)) {
	  									pass(driver,"Wrap header toggle is displayed in 'ON' After click on it");
	  									scrollUsingElement(driver, ApplyButton);
			 							click(driver, ApplyButton);
			 							elementnotvisible1(driver, RPE_Loading);
			 							String TableHeaderWrapON_Act=getAttribute1(driver, TableHeadingCell, "class");
			 							if(TableHeaderWrapON_Act.contains("header-wrap-text")) {
			 								pass(driver,"Table Header values are wrapped when the toggle is in the ON Condition");
			 							}else {
			 								fail(driver,"Table Header values are not wrapped when the toggle is in the ON Condition");
			 							}
			 							
			 							if(TC_KPI_CARD_TABLE_FORMAT_025.equals("Yes")) {
			  								setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_025");
			 							 	String toggleONColor=getTextBackgroundColor(driver, WrapHeaded_toggle_TableFormat);
			 							 	if(toggleONColor.equalsIgnoreCase("#2196F3")) {
			 							 		pass(driver,"Wrap Header Toggle is displayed in blue color when it is ON condition");
			 							 	}else {
			 							 		fail(driver,"Wrap Header Toggle is not displayed in blue color when it is ON condition");
			 							 	}	
			 							}
	  								}else {
	  									fail(driver,"Wrap header toggle is not displayed in 'ON' After click on it");
	  								}
		  							  
	  							}
	  						  }else {
	  							  fail(driver,"Wrap Header toggle is not Accessible");
	  						  }
	  					  }
	  					  
	  					  setTestCaseID("TS_KPI_CARD_ TABLE_FORMAT_007");
	  					  if(verifyElementDisplayed(driver, BodyFontSize_Input_TableFormat)) {
	  						  if(TC_KPI_CARD_TABLE_FORMAT_026.equals("Yes")) {
	  							  setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_026");
	  							  String defaultBodyFontSize_Act=getTextJavascript(driver,BodyFontSize_Input_TableFormat);
	  							  if(defaultBodyFontSize_Act.equals(DefaultBodyFontSize_TableFormat)) {
	  								  pass(driver,"By defualt, '"+DefaultBodyFontSize_TableFormat+"' is displayed in the Body Font Size Input");
	  							  }else {
	  								  fail(driver,"By default,'"+DefaultBodyFontSize_TableFormat+"' is not displayed in the Body Font Size Input");
	  							  }
	  						  }
	  						  
	  						  if(TC_KPI_CARD_TABLE_FORMAT_027.equals("Yes")) {
	  							  setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_027");
	  							  if(IsElementEnabled(driver, BodyFontSize_Input_TableFormat)) {
	  								  pass(driver,"Body Font Size Input is Accessible");
	  								  click(driver,BodyFontSize_Input_TableFormat);
	  								  List<WebElement> BodyfonSizeResults=getWebElements(driver, BodyFontSize_Results_TableFormat);
	  								  int BodyfonSizeResultsCount=BodyfonSizeResults.size();
	  								  String StartingFontSizeValue=BodyfonSizeResults.get(1).getText();
		 							 //new modification
	  								  int EndFontSizeValueNum=BodyfonSizeResults.size()-1;
	  								  String EndFontSizeValue=BodyfonSizeResults.get(EndFontSizeValueNum).getText();
		 							 //new modification
	  								  
	  								  if(BodyfonSizeResultsCount==54&&StartingFontSizeValue.equals("8")&&EndFontSizeValue.equals("60")) {
		 								 pass(driver,"All the Font Size Values is present ");
	  								  }else {
		 								 fail(driver,"Some Font Size Values is not present ");
	  								  }
	  								  
	  								 if(TC_KPI_CARD_TABLE_FORMAT_028.equals("Yes")) {
	  		  							  setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_028");
	  		  							  selectByText(driver,BodyFontSize_Input_TableFormat,Select_BodyFontSize_TableFormat);
	  			 						  wait(driver,"1");
	  			 						  String selectedBodyFontSize=getTextJavascript(driver,BodyFontSize_Input_TableFormat);
	  			 						  if(selectedBodyFontSize.equals(Select_BodyFontSize_TableFormat)) {
	  			 						 	 pass(driver,"Selcted Font Size value updated in the Body Font Size Input");
	  			 						 	 scrollUsingElement(driver, ApplyButton);
		  			 						 click(driver, ApplyButton);
		  			 						 elementnotvisible1(driver, RPE_Loading);
		  			 						 waitForElement(driver,Pivot_ChartBody);
		  			 						 String AppliedTable_BodyFontSize=getFontSize(driver, Pivot_ChartBody);
		  			 						 if(AppliedTable_BodyFontSize.equals(Select_BodyFontSize_TableFormat)) {
		  			 							 pass(driver,"Selected Font Size '"+Select_BodyFontSize_TableFormat+"' value Applied in the Table Body values");
		  			 						 }else {
		  			 							 fail(driver,"Selected Font Size '"+Select_BodyFontSize_TableFormat+"' value not Applied in the Table Body values, Act result: "+AppliedTable_BodyFontSize);
		  			 						 }
	  			 						  }else {
	  			 							 fail(driver,"Selcted Font Size value not updated in the Body Font Size Input");
	  			 						  }
	  								 }
	  								  
	  							  }else {
	  								  fail(driver,"Body Font Size Input is not Accessible");
	  							  }
	  						  }
	  					  }
	  					  
	  					  setTestCaseID("TS_KPI_CARD_ TABLE_FORMAT_008");
	  					  if(verifyElementDisplayed(driver, BorderInput_TableFormat)) {
	  						  if(TC_KPI_CARD_TABLE_FORMAT_029.equals("Yes")) {
	  							  setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_029");
	  							  String DefaultBorderType=defaultSelectedValue(driver,BorderInput_TableFormat);
	  							  if(DefaultBorderType_TableFormat.equals(DefaultBorderType)) {
	  								  pass(driver,"By default, '"+DefaultBorderType_TableFormat+"' is displayed in the Border Input Field");
	  							  }else {
	  								  fail(driver,"By default, '"+DefaultBorderType_TableFormat+"' is not displayed in the Border Input Field");
	  							  }
	  						  }
	  						  
	  						  if(IsElementEnabled(driver, BorderInput_TableFormat)) {
	  							  if(TC_KPI_CARD_TABLE_FORMAT_030.equals("Yes")) {
		  							  setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_030");
		  							  click(driver,BorderInput_TableFormat);
		  							  String[] bordersValuesExp= {"Default","None","Double","Dashed","Solid","Dotted"};//need to change
		  							  boolean AllBorders=true;
		  							  List<WebElement> BorderResults=getWebElements(driver, BorderResults_TableFormat);
		  							  List<String> BorderResultValuesAct=new ArrayList<String>();
		  							  for(WebElement BorderResult:BorderResults) {
			 							String bordervalue=BorderResult.getText();
			 							BorderResultValuesAct.add(bordervalue);
		  							  }
			 						
		  							  for(int j=0;j<bordersValuesExp.length;j++) {
			 							String Exp=bordersValuesExp[j];
			 							if(!BorderResultValuesAct.contains(Exp)) {
			 								AllBorders=false;
			 								fail(driver,Exp+" is not available in Border input options");
			 							}
		  							  }
		  							  if(AllBorders==true) {
			 							pass(driver,"All the Border input option are present");
		  							  }else {
			 							fail(driver,"Some Border input option are not present");
		  							  }
	  							  }
	  							  
	  							  if(TC_KPI_CARD_TABLE_FORMAT_031.equals("Yes")) {
		  							  setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_031");
		  							  selectByText(driver,BorderInput_TableFormat,Select_Border_Value_TableFormat);
		  							  String selectedBorder=defaultSelectedValue(driver,BorderInput_TableFormat);
		  							  System.out.println("selectedBorder : "+selectedBorder);
		  							  if(selectedBorder.equals(Select_Border_Value_TableFormat)) {
		  								  pass(driver,"Selcted Border value updated in the Border Input");
		  								  scrollUsingElement(driver, ApplyButton);
			  							  click(driver, ApplyButton);
			  							  elementnotvisible1(driver, RPE_Loading);
			  							  waitForElement(driver,ResultTableBody);
			  							  String BorderValidationClass="table"+Select_Border_Value_TableFormat.toLowerCase()+"border";
			  							  String AppliedBorder_Table=getAttribute1(driver, TableChart, "class");
			  							  if(AppliedBorder_Table.contains(BorderValidationClass)) {
			  								  pass(driver,"Selected Border '"+Select_Border_Value_TableFormat+"' value Applied in the Table Border");
			  							  }else {
			  								  fail(driver,"Selected Border '"+Select_Border_Value_TableFormat+"' value not Applied in the Table Border");
			  							  } 
		  							  }else {
		  								  fail(driver,"Selcted Border value not updated in the Border Input");
		  							  }
	  							  }
	  							  
	  							  
	  						  }else {
	  							  fail(driver,"Border Input is not Accessible ");
	  						  }
	  					  }
	  					  
	  					  setTestCaseID("TS_KPI_CARD_ TABLE_FORMAT_009");
	  					  if(verifyElementDisplayed(driver, NegativeHighlight_toggle)) {
	  						  if(TC_KPI_CARD_TABLE_FORMAT_032.equals("Yes")) {
	  							  setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_032");
	  							  if(isToggleEnable(driver,NegativeHighlight_Input)) {
		 							fail(driver,"By default, Negaitve Highlight Toggle is not displayed in 'OFF' Condition");
	  							  }else {
		 							pass(driver,"By default, Negaitve Highlight Toggle is displayed in 'OFF' Condition");
	  							  }
	  						  }
	  						  
	  						  if(IsElementEnabled(driver, NegativeHighlight_Input)) {
	  							  if(TC_KPI_CARD_TABLE_FORMAT_033.equals("Yes")) {
	  								  setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_033");
	  								  click(driver,NegativeHighlight_toggle);
	  								  wait(driver,"1");
	  								  if(isToggleEnable(driver,NegativeHighlight_Input)) {
	  									  pass(driver,"Negaitve Highlight Toggle is enabled when click on it");
	  									  String NegativetoggleONColor=getTextBackgroundColor(driver, NegativeHighlight_toggle);
	  									  if(NegativetoggleONColor.equalsIgnoreCase("#2196F3")) {
			 								pass(driver,"NegativeHighlight Toggle is displayed in blue color when it is ON condition");
	  									  }else {
			 								fail(driver,"NegativeHighlight Toggle is not displayed in blue color when it is ON condition");
	  									  }
			 							
	  									  if(TC_KPI_CARD_TABLE_FORMAT_034.equals("Yes")) {
	  										  setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_034");
	  										 scrollUsingElement(driver, ApplyButton);
			 								 click(driver, ApplyButton);
			 								 elementnotvisible1(driver, RPE_Loading);
			 								 waitForElement(driver,ResultTableBody);
			 								 boolean negativecell=false;
			 								 String comp_id="";
			 								 String Col_Id="";
			 								 List<WebElement> resultTableCells=getWebElements(driver, TableCell);
			 								 for(WebElement resultTableCell:resultTableCells) {
			 									 Col_Id=resultTableCell.getAttribute("col-id");
			 									String ResultCellvalue=resultTableCell.getText();
			 									if(ResultCellvalue.startsWith("-")&&ResultCellvalue.length()>2) {
			 										comp_id=resultTableCell.getAttribute("comp-id");
			 										negativecell=true;
			 										break;
			 									}
			 								 }
			 								
			 								 if(negativecell==true) {
			 									WebElement negativeCellValue=driver.findElement(By.xpath("//div[@id='RPE_Preview']//div[@role='gridcell' and @comp-id='"+comp_id+"']"));
			 									action.moveToElement(negativeCellValue).build().perform();
			 									String rgbFormatNegativeCell = negativeCellValue.getCssValue("background-color");
			 									String NegativeCellBackColorAct = rgbToHex(rgbFormatNegativeCell);
			 									String colIndex=negativeCellValue.getAttribute("aria-colindex");
			 									String colID=negativeCellValue.getAttribute("col-id");
			 									if(NegativeCellBackColorAct.equalsIgnoreCase(NegativeCellColor_TableFormat)) {
			 										pass(driver,"Negative value cell is highlighted when the Negative highlight toggle is 'ON' condition");
			 									}else {
			 										fail(driver,"Negative value cell is not highlighted when the Negative highlight toggle is 'ON' condition, colIndex : "+colIndex+" , colID : "+colID+", Act Color : "+NegativeCellBackColorAct);
			 									}
			 									
			 								 }else {
			 									pass(driver,"Negative Highlight validation failed, because Negative Value is not present in the Table");
			 								 }
			 								
			 								 boolean PositiveCellHighlight=false;
			 								 if(isDisplayed2(driver,NegativeHighlightCell)) {
			 									List<WebElement> HighlightedCells=getWebElements(driver, NegativeHighlightCell);
			 									for(WebElement HighlightedCell:HighlightedCells) {
			 										String HighlightedCellText=HighlightedCell.getText();
			 										if(!HighlightedCellText.startsWith("-")) {
			 											action.moveToElement(HighlightedCell).build().perform();
			 											PositiveCellHighlight=true;
			 											break;
			 										}
			 									}
			 									
			 									if(PositiveCellHighlight==true) {
			 										fail(driver,"Postive Cell Values also highlighted when Negative highlight toggle is 'ON' condition");
			 									}else {
			 										pass(driver,"Postive Cell Values are not highlighted when Negative highlight toggle is 'ON' condition");
			 									}
			 								 }
	  									  }
			 							
	  								  }else {
			 							fail(driver,"Negaitve Highlight Toggle is not enabled when click on it");
	  								  }
	  							  }
	  						  }else {
	  							  fail(driver,"Highlight Negative toggle is not Accessible");
	  						  }
	  					  }
	  					  
	  					  setTestCaseID("TS_KPI_CARD_ TABLE_FORMAT_010");
	  					  if(verifyElementDisplayed(driver, Alignment_TableFormat)) {
	  						  if(TC_KPI_CARD_TABLE_FORMAT_035.equals("Yes")) {
	  							  setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_035");
	  							  if(isDisplayed2(driver,Allignment_active)) {
	  								  String aligned=getAttribute1(driver, Allignment_active, "data-align");
	  								  fail(driver,aligned+" Alignment is selected by default");
	  							  }else{
	  								  pass(driver,"No Alignment is selected by default");
	  							  }
	  						  }
	  						  
	  						  if(TC_KPI_CARD_TABLE_FORMAT_036.equals("Yes")) {
	  							  setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_036");
	  							  List<WebElement> AllCellElements=getWebElements(driver,TableCell);
	  							  Pattern numericalPattern = Pattern.compile("^\\d+(\\.\\d+)?$");
	  							  Pattern datePattern = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");

	  							  boolean TextDefaultAlign=true;
	  							  boolean NumericalDefaultAlign=true;
	  							  String FailedStringCell="";
	  							  String FailedNumericCell="";
 						        
	  							  for (WebElement cell : AllCellElements) {
	  								  String cellText = cell.getText();
	  								  String textAlign = cell.getCssValue("text-align");
	  								  String ColumnValue=cell.getAttribute("col-id");

	  								  if (datePattern.matcher(cellText).matches() || cellText.equals("") || cellText.isEmpty() || cellText.startsWith("-")) {
	  									  continue;
	  								  } else if (numericalPattern.matcher(cellText).matches()&&!ColumnValue.equals("ag-Grid-AutoColumn")) {
 						                if (!textAlign.contains("right")) {
 						                	String FailedNum=ColumnValue+" : "+cellText;
 						                    NumericalDefaultAlign=false;
 						                    FailedNumericCell=FailedNumericCell+", "+FailedNum;
 						                }
	  								  } else {
 						                // Check if text cells are left-aligned
 						                if (!textAlign.contains("left")) {
 						                	String FailedText=ColumnValue+" : "+cellText;
 						                   // System.out.println("Text cell not left-aligned: " + FailedText);
 						                    TextDefaultAlign=false;
 						                    FailedStringCell=FailedStringCell+", "+FailedText;
 						                }
	  								  }
	  							  }
 						        
	  							  if(TextDefaultAlign==false) {
 						        	fail(driver,"Some Text cell values are not aligned left by default :"+FailedStringCell);
	  							  }else {
 						        	pass(driver,"All the text cell values are aligned left by default ");
	  							  }
 						        
	  							  if(NumericalDefaultAlign==false) {
 						        	fail(driver,"Some Numerical cell values are not aligned right by default :"+FailedNumericCell);
	  							  }else {
 						        	pass(driver,"All the Numerical cell values are aligned right by default ");
	  							  }
	  						  }
	  						  
	  						  if(TC_KPI_CARD_TABLE_FORMAT_037.equals("Yes")) {
	  							  setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_037");
	  							  if(IsElementEnabled(driver, AlignmentRight_TableFormat)) {
	  								  pass(driver,"Right Allignment is Accessible");
	  								  click(driver,AlignmentRight_TableFormat);
	  								  scrollUsingElement(driver, ApplyButton);
	  								  click(driver, ApplyButton);
	  								  elementnotvisible1(driver, RPE_Loading);
	  								  String SelectedAlignmentColorAct=getTextBackgroundColor(driver, AlignmentRight_TableFormat);
	  								  if(AlignmentSelectedColor_TableFormat.equalsIgnoreCase(SelectedAlignmentColorAct)) {
	 									pass(driver,"Right Alignment highlighted in grey color When click on it ");
	  								  }else {
	 									fail(driver,"Right Alignment not highlighted in grey color When click on it ");
	  								  }
	 								
	  								  List<WebElement> AllCellElements=getWebElements(driver,TableCell);
	  								  boolean AllRightAlignment=true;
	  								  String FailedRightAllign="";
	  								  System.out.println("Cells  Right-aligned Validation  : ***********");
	  								  for (WebElement cell : AllCellElements) {
	  									  String textAlign = cell.getCssValue("text-align");
	 									
	  									  if(!textAlign.contains("right")) {
	  										  AllRightAlignment=false;
	  										  String ColunName=cell.getAttribute("col-id");
	  										  String cellResult=ColunName+" : "+cell.getText();
	  										  System.out.print(cellResult+" ");
	  										  FailedRightAllign=FailedRightAllign+", "+cellResult;
	  									  }
	  								  }
	  								  //	System.out.println("Cells  Right-aligned  Validation end : ***********");
	  								  if(AllRightAlignment==false) {
	  									  fail(driver,"Some cell valuse are not aligned right when 'Right alignment' is selected  : "+FailedRightAllign);
	  								  }else {
	  									  pass(driver,"All the Cell Values are aligned right when 'Right alignment' is seleted ");
	  								  }
	  							  }else {
	  								  fail(driver,"Right Allignment is not Accessible");
	  							  }
	  						  }
	  						  
	  						  if(TC_KPI_CARD_TABLE_FORMAT_038.equals("Yes")) {
	  							  setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_038");
	  							  if(IsElementEnabled(driver, Alignmentcenter_TableFormat)) {
	  								  pass(driver,"Center Allignment is Accessible");
	  								  click(driver,Alignmentcenter_TableFormat);
	  								  scrollUsingElement(driver, ApplyButton);
	  								  click(driver, ApplyButton);
	  								  elementnotvisible1(driver, RPE_Loading);
	  								  String SelectedAlignmentColorAct=getTextBackgroundColor(driver, Alignmentcenter_TableFormat);
	  								  if(AlignmentSelectedColor_TableFormat.equalsIgnoreCase(SelectedAlignmentColorAct)) {
	 									pass(driver,"Center Alignment highlighted in grey color When click on it ");
	  								  }else {
	 									fail(driver,"Center Alignment not highlighted in grey color When click on it ");
	  								  }
	 								
	  								  List<WebElement> AllCellElements=getWebElements(driver,TableCell);
	  								  boolean AllCenterAlignment=true;
	  								  String FailedCenterAllign="";
	  								  System.out.println("Cells  Center-aligned Validation  : ***********");
	  								  for (WebElement cell : AllCellElements) {
	 									String textAlign = cell.getCssValue("text-align");
	 									
	 									if(!textAlign.contains("center")) {
	 										AllCenterAlignment=false;
	 										String ColunName=cell.getAttribute("col-id");
	 										String cellResult=ColunName+" : "+cell.getText();
	 										System.out.print(cellResult);
	 										FailedCenterAllign=FailedCenterAllign+", "+cellResult;
	 									}
	  								  }
	  								  //	System.out.println("Cells  Center-aligned  Validation end : ***********");
	  								  if(AllCenterAlignment==false) {
	 									fail(driver,"Some cell valuse are not aligned center when 'Center alignment' is selected  : "+FailedCenterAllign);
	  								  }else {
	 									pass(driver,"All the Cell Values are aligned center when 'Center alignment' is seleted ");
	  								  }
	  							  }else {
	  								  fail(driver,"Center Allignment is not Accessible");
	  							  }
	  						  }
	  						  
	  						  if(TC_KPI_CARD_TABLE_FORMAT_039.equals("Yes")) {
	  							  setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_039");
	  							  if(IsElementEnabled(driver, AlignmentLeft_TableFormat)) {
	  								  pass(driver,"Left Allignment is Accessible");
	  								  click(driver,AlignmentLeft_TableFormat);
	  								  scrollUsingElement(driver, ApplyButton);
	  								  click(driver, ApplyButton);
	  								  elementnotvisible1(driver, RPE_Loading);
	  								  String SelectedAlignmentColorAct=getTextBackgroundColor(driver, AlignmentLeft_TableFormat);
	  								  System.out.println("SelectedAlignmentColorAct : "+SelectedAlignmentColorAct);
	  								  if(AlignmentSelectedColor_TableFormat.equalsIgnoreCase(SelectedAlignmentColorAct)) {
	  									  pass(driver,"Left Alignment highlighted in grey color When click on it ");
	  								  }else {
	  									  fail(driver,"Left Alignment not highlighted in grey color When click on it ");
	  								  }
	 								
	  								  List<WebElement> AllCellElements=getWebElements(driver,TableCell);
	  								  boolean AllLeftAlignment=true;
	  								  String FailedLeftAllign="";
	  								  for (WebElement cell : AllCellElements) {
	 									String textAlign = cell.getCssValue("text-align");
	 									if(!textAlign.contains("left")) {
	 										AllLeftAlignment=false;
	 										System.out.print(cell.getText());
	 										String ColunName=cell.getAttribute("col-id");
	 										String cellResult=ColunName+" : "+cell.getText();
	 										FailedLeftAllign=FailedLeftAllign+", "+cellResult;
	 									}
	  								  }
	  								  if(AllLeftAlignment==false) {
	  									  fail(driver,"Some cell valuse are not aligned left when 'Left alignment' is selected  : "+FailedLeftAllign);
	  								  }else {
	  									  pass(driver,"All the Cell Values are aligned left when 'Left alignment' is seleted ");
	  								  }
	  							  }else {
	  								  fail(driver,"Left Allignment is not Accessible");
	  							  }
	  						  }
	  					  }
	  					  
	  					  setTestCaseID("TS_KPI_CARD_ TABLE_FORMAT_011");
	  					  if(verifyElementDisplayed(driver, SeperatorInput_TableFormat)) {
	  						  if(TC_KPI_CARD_TABLE_FORMAT_040.equals("Yes")) {
	  							  setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_040");
	  							  String defaultSeperatorSelect=defaultSelectedValue(driver, SeperatorInput_TableFormat);
	  							  // System.out.println("defaultSeperatorSelect : "+defaultSeperatorSelect);
	  							  if(defaultSeperatorSelect.equals("")||defaultSeperatorSelect.equals(DefaultSeperator_TableFormat)) {
									 pass(driver,"By default, 'Select' is displayed in the seperater input");
	  							  }else {
									 fail(driver,"By default, 'Select' is not displayed in the seperater input");
	  							  }
	  						  }
	  						  
	  						  if(TC_KPI_CARD_TABLE_FORMAT_041.equals("Yes")) {
	  							  setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_041");
	  							  click(driver,SeperatorInput_TableFormat);
	  							  verifyElementIsPresent(driver, SeparatorOption1);
	  							  verifyElementIsPresent(driver, SeperatorOption2);
	  						  }
	  						  
	  						  if(TC_KPI_CARD_TABLE_FORMAT_042.equals("Yes")) {
	  							  setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_042");
	  							  selectByText(driver, SeperatorInput_TableFormat, Change_Seperator_Option);
	  							  wait(driver,"1");
	  							  String AfterSelectSeperatorValue=getTextJavascript(driver, SeperatorInput_TableFormat);
	  							  System.out.println("AfterSelectSeperatorValue : "+AfterSelectSeperatorValue);
	  							  if(AfterSelectSeperatorValue.equals(Change_Seperator_Option)) {
									 pass(driver,"Selected seperator value is correctly displayed in the Seperator Input");
	  							  }else {
									 fail(driver,"Selected seperator value is not correctly displayed in the Seperator Input");
	  							  }
	  							  
	  							  if(TC_KPI_CARD_TABLE_FORMAT_043.equals("Yes")) {
		  							  setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_043");
		  							  if(verifyElementDisplayed(driver, SeperatorSelectedColumnBox)) {
		  								  if(isDisplayed2(driver,AppliedSeperatorColoumn)) {
											 fail(driver,"By default, column value selected in the Seperator column box");
		  								  }else {
											 pass(driver,"By default, No column value selected in the Seperator column box");
		  								  }
		  							  }
		  							  
	  							  }
	  							  
	  							  if(TC_KPI_CARD_TABLE_FORMAT_044.equals("Yes")) {
		  							  setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_044");
		  							  click(driver,SeperatorSelectedColumnBox);
		  							  List<WebElement> availableSeperatorColoumnList=getWebElements(driver, SepertorAvailableColumns);
		  							  List<String> availableNumList=new ArrayList<String>();
		  							  for(WebElement ele:availableSeperatorColoumnList) {
										 String listtext=ele.getText();
										 availableNumList.add(listtext);
		  							  }
										
		  							  int availableSeperatorColoumnCount=availableSeperatorColoumnList.size();
		  							  
		  							  click(driver,SeperatorText_TableFormat);
		  							  mouseOverToElement(driver, SelectAllCheckBox_Seperator);
		  							  mouseOverAndClick(driver, SelectAllCheckBox_Seperator);
		  							  if(isElementSelected(driver,SelectAllCheckBox_Seperator)) {
										 pass(driver,"'Select All checkbox' in the seperator is selected after clicking it");
										 List<WebElement> selectedList=getWebElements(driver, AppliedSeperatorColoumn);
										 int selectedListCout=selectedList.size();
										 if(availableSeperatorColoumnCount==selectedListCout) {
											 pass(driver,"All the available Columns are displayed in the Seperator Column input box when click the 'Select All' Checkbox ");
										 }else {
											 fail(driver,"Some available Columns are not displayed in the Seperator Column input box when click the 'Select All' Checkbox ");
										 }
										 
										 scrollUsingElement(driver, ApplyButton);
										 wait(driver,"1");
										 click(driver, ApplyButton);
										 elementnotvisible1(driver, RPE_Loading);
										 waitForElement(driver,TableCell);
										 boolean seperatorCheck=true;
										 String FailResultSeperator="";
										 for(String availabelList:availableNumList) {
											 List<WebElement> AllCellElements1=getWebElements(driver,TableCell);
											 Pattern numericalPattern1 = Pattern.compile("^(\\d{1,3}(,\\d{3})*|\\d{1,2}(,\\d{2}){2,})(\\.\\d+)?$");
											 Pattern datePattern = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");
										        
											 for (WebElement cell : AllCellElements1) {
												 String cellHeader=cell.getAttribute("col-id");
												 if(cellHeader.contains(availabelList)) {
													 String cellText = cell.getText();
													 int Explength=5;
													 if(cellText.contains(".")) {
														 Explength=10;
													 }
													 String Col_ID=cell.getAttribute("col-id");
													 if (datePattern.matcher(cellText).matches() || cellText.equals("") || cellText.isEmpty()) {
														 continue;
													 } else if (numericalPattern1.matcher(cellText).matches() && cellText.length()>=Explength) {
											            	
														 String cellFormat=SeperatorValidationTable(cellText);
														 if(!cellFormat.equals(Change_Seperator_Option)) {
															 seperatorCheck=false;
															 FailResultSeperator=FailResultSeperator+" || Column : "+Col_ID+", cellValue : "+cellText;
														 }	
													 } 
												 }
											 }
										 }
											
										 if(seperatorCheck==true) {
											 pass(driver,"Seperator correctly applied in all the cell values..");
										 }else {
											 fail(driver,"Seperator not correctly applied in this cell : "+FailResultSeperator);
										 }
										 
		  							  }else {
		  								  fail(driver,"'Select All checkbox' in the seperator is not selected after clicking it");
		  							  }
		  							  
		  							  if(TC_KPI_CARD_TABLE_FORMAT_045.equals("Yes")) {
			  							  setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_045");
			  							  while(isDisplayed2(driver,RemoveOption_Sepreator)) {
											  WebElement RemoveSelectList=getWebElement(driver,RemoveOption_Sepreator);
											  action.moveToElement(RemoveSelectList).click().build().perform();
											  wait(driver,"1");
										  }
										 
			  							  if(isElementSelected(driver,SelectAllCheckBox_Seperator)) {
											 fail(driver,"'Select All checkbox' in the seperator is not Deselected when remove the selected options");
			  							  }else {
											 pass(driver,"'Select All checkbox' in the seperator is Deselected when remove the selected options");
			  							  }
		  							  }
		  							  
		  							  if(TC_KPI_CARD_TABLE_FORMAT_046.equals("Yes")) {
			  							  setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_046");
			  							  if(!isDisplayed2(driver,AppliedSeperatorColoumn)) {
											 click(driver,SeperatorSelectedColumnBox);
											 List<WebElement> availableSeperatorList=getWebElements(driver, SepertorAvailableColumns);
											 for(WebElement ele:availableSeperatorList) {
												 action.moveToElement(ele).click().build().perform();
											 }
											 Escape(driver);
											 wait(driver,"1");
			  							  }
			  							  mouseOverAndClick(driver, SelectAllCheckBox_Seperator);
			  							  wait(driver,"1");
			  							  if(isDisplayed2(driver,AppliedSeperatorColoumn)) {
											 fail(driver,"Column Names displayed in the seperator selected column After deSelecting 'Select All checkbox' ");
			  							  }else {
											 pass(driver,"Column Names not displayed in the seperator selected column After deSelecting 'Select All checkbox' ");
			  							  }
		  							  }
	  							  }	
	  						  }
	  					  }
	  					  
	  					  setTestCaseID("TS_KPI_CARD_ TABLE_FORMAT_012");
	  					  if(verifyElementDisplayed(driver, SeperatorInput_TableFormat)) {
	  						  if(TC_KPI_CARD_TABLE_FORMAT_047.equals("Yes")) {
	  							  setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_047");
	  							  String defaultRoundOffSelect=defaultSelectedValue(driver, RoundOffInput_TableFormat);
								  System.out.println("defaultRoundOffSelect : "+defaultRoundOffSelect);
								  if(defaultRoundOffSelect.equals("")||defaultRoundOffSelect.equals(DefaultRoundOff_TableFormat)) {
									 pass(driver,"By default, 'Select' is displayed in the RoundOff input");
								  }else {
									 fail(driver,"By default, 'Select' is not displayed in the RoundOff input");
								  }
	  						  }
	  						  
	  						  if(TC_KPI_CARD_TABLE_FORMAT_048.equals("Yes")) {
	  							  setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_048");
	  							  click(driver,RoundOffInput_TableFormat);
	  							  List<WebElement> RoundOffInputValues=getWebElements(driver, RountOffValueOptions_TableFormat);
	  							  int RoundOffInputValuesCount=RoundOffInputValues.size();
	  							  String StartRoundOffInputValue=RoundOffInputValues.get(1).getText();
	  							  //new modification
	  							  int RoundOffInputValuelast=RoundOffInputValues.size()-1;
	  							  String EndRoundOffInputValue=RoundOffInputValues.get(RoundOffInputValuelast).getText();
	  							  //new modification
	  							  if(RoundOffInputValuesCount==7&&StartRoundOffInputValue.equals("0")&&EndRoundOffInputValue.equals("5")) {
									 pass(driver,"All the RoundOff Value options are present ");
	  							  }else {
									 fail(driver,"Some RoundOff Value options are not present ");
	  							  }
	  						  }
	  						  
	  						  if(TC_KPI_CARD_TABLE_FORMAT_049.equals("Yes")) {
	  							  setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_049");
	  							  selectByText(driver, RoundOffInput_TableFormat, Change_RoundOff_Option);
	  							  wait(driver,"1");
	  							  String AfterSelectRoundOffValue=getTextJavascript(driver, RoundOffInput_TableFormat);
	  							  System.out.println("AfterSelectRoundOffValue : "+AfterSelectRoundOffValue);
	  							  if(AfterSelectRoundOffValue.equals(Change_RoundOff_Option)) {
									 pass(driver,"Selected RoundOff value is correctly displayed in the RoundOff Input");
	  							  }else {
									 fail(driver,"Selected RoundOff value is not correctly displayed in the RoundOff Input, Exp : "+Change_RoundOff_Option+" Act : "+AfterSelectRoundOffValue);
	  							  }
	  							  
	  							  if(TC_KPI_CARD_TABLE_FORMAT_050.equals("Yes")) {
		  							  setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_050");
		  							  if(verifyElementDisplayed(driver, RoundOffSelectColumnBox)) {
										 if(isDisplayed2(driver,AppliedRoundOffColumns)) {
											 fail(driver,"By default, column value selected in the RoundOff column box");
										 }else {
											 pass(driver,"By default, No column value selected in the RoundOff column box");
										 }
		  							  }
	  							  }
	  							  
	  							  if(TC_KPI_CARD_TABLE_FORMAT_051.equals("Yes")) {
		  							  setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_051");
		  							  if(verifyElementDisplayed(driver, RoundOffSelectColumnBox)) {
		  								 click(driver,RoundOffSelectColumnBox);
										 wait(driver,"1");
										 List<WebElement> availableRoundOffColoumnList=getWebElements(driver, AvailableRoundOffSelectColumn);
										 List<String> availableNumList=new ArrayList<String>();
										 for(WebElement ele:availableRoundOffColoumnList) {
											 String listtext=ele.getText();
											 availableNumList.add(listtext);
										 }
										 int availableRoundOffColoumnCount=availableRoundOffColoumnList.size();
										 click3(driver,SeperatorText_TableFormat);
										 mouseOverToElement(driver, SelectAllCheckbox_RoundOff);
										 mouseOverAndClick(driver, SelectAllCheckbox_RoundOff);
										 
										 if(isElementSelected(driver,SelectAllCheckbox_RoundOff)) {
											 pass(driver,"'Select All checkbox' in the RoundOff is selected after clicking it");
											 List<WebElement> selectedList=getWebElements(driver, AppliedRoundOffColumns);
											 int selectedListCout=selectedList.size();
											 if(availableRoundOffColoumnCount==selectedListCout) {
												 pass(driver,"All the available Columns are displayed in the RoundOff Column input box when click the 'Select All' Checkbox ");
											 }else {
												 fail(driver,"Some available Columns are not displayed in the RoundOff Column input box when click the 'Select All' Checkbox ");
											 }
												
											 scrollUsingElement(driver, ApplyButton);
											 wait(driver,"1");
											 click(driver, ApplyButton);
											 elementnotvisible1(driver, RPE_Loading);
											 waitForElement(driver,TableCell);
											 boolean RoundOffCheck1=true;
											 String FailResultRoundOff1="";
											 for(String availabelList:availableNumList) {
												 List<WebElement> AllCellElements1=getWebElements(driver,TableCell);
													
												 Pattern numericalPattern1 = Pattern.compile("^(\\d{1,3}(,\\d{3})*|\\d{1,2}(,\\d{2}){2,})(\\.\\d+)?$");
												 Pattern datePattern = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$"); // need to delete Pattern
												
												 for (WebElement cell : AllCellElements1) {
													 String cellText = cell.getText();
													 String cellHeader=cell.getAttribute("col-id");
													 if(cellHeader.contains(availabelList)) {
														 String Col_ID=cell.getAttribute("col-id");
														 if (datePattern.matcher(cellText).matches() || cellText.equals("") || cellText.isEmpty()||cellText.equals("0")) {
															 continue;
														 } else if (numericalPattern1.matcher(cellText).matches()) {
															 int CellRoundOffValueNum=getRoundOffValue(cellText);
															 String CellRoundOffValue=String.valueOf(CellRoundOffValueNum);
															 if(!CellRoundOffValue.equals(Change_RoundOff_Option)) {
																 RoundOffCheck1=false;
																 FailResultRoundOff1=FailResultRoundOff1+" || Column : "+Col_ID+", cellValue : "+cellText;
															 }	
														 } 
													 }   
												 }	
											 }
											 if(RoundOffCheck1==true) {
												 pass(driver,"RoundOff correctly Applied for all the cells");
											 }else {
												 fail(driver,"RoundOff not correctly Applied in this cell : "+FailResultRoundOff1);
											 }
										 }else {
											 fail(driver,"'Select All checkbox' in the RoundOff is not selected after clicking it");
										 }
										 
										 if(TC_KPI_CARD_TABLE_FORMAT_052.equals("Yes")) {
				  							  setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_052");
				  							  while(isDisplayed2(driver,RemoveOption_RoundOff)) {
												  WebElement RemoveSelectList=getWebElement(driver,RemoveOption_RoundOff);
												  action.moveToElement(RemoveSelectList).click().build().perform();
												  wait(driver,"1");
											  }
											 
				  							  if(isElementSelected(driver,SelectAllCheckbox_RoundOff)) {
												 fail(driver,"'Select All checkbox' in the RoundOff is not Deselected when remove the selected options");
				  							  }else {
												 pass(driver,"'Select All checkbox' in the RoundOff is Deselected when remove the selected options");
				  							  }
										 }
										 
										 if(TC_KPI_CARD_TABLE_FORMAT_053.equals("Yes")) {
											 setTestCaseID("TC_KPI_CARD_ TABLE_FORMAT_053");
											 if(!isDisplayed2(driver,AppliedRoundOffColumns)) {
												 click(driver,RoundOffSelectColumnBox);
												 List<WebElement> availableRoundOffList=getWebElements(driver, AvailableRoundOffSelectColumn);
												 for(WebElement ele:availableRoundOffList) {
													 action.moveToElement(ele).click().build().perform();
												 }
												 Escape(driver);
												 wait(driver,"1");
											 }
											 mouseOverAndClick(driver, SelectAllCheckbox_RoundOff);
											 wait(driver,"1");
											 if(isDisplayed2(driver,AppliedRoundOffColumns)) {
												 fail(driver,"Column Names displayed in the RoundOff selected column After deSelecting 'Select All checkbox' ");
											 }else {
												 pass(driver,"Column Names not displayed in the RoundOff selected column After deSelecting 'Select All checkbox' ");
											 }
										 }
		  							  }
	  							  }
	  						  }
	  					  }
		  			  }//Table Format Expand..
		  		  }
		      	}
		    //Table Format End..
				 
		         setTestCaseID("");
		 		 verifyElementDisplayed(driver, SaveBtn_Chart);
		 		 verifyElementDisplayed(driver, cancel_chart);
		 		 
		 		 clearAndType(driver,ChartTitleInput,ChangeChartTitleName);
		 		 click(driver,SaveBtn_Chart);
		 		 elementnotvisible1(driver, RPE_Loading);
		 		 if(!isDisplayed2(driver,chartSaveError1) && isDisplayed(driver,SavedChartTitleInput)) {
		 			 pass(driver,"Chart Saved Successfully");
		 			 String AfterSaveChartTitleName=getText1(driver, SavedChartTitleName);
			 		 if(AfterSaveChartTitleName.equalsIgnoreCase(ChangeChartTitleName)) {
			 			 pass(driver,"Same Chart Title name displayed after saved the chart ");
			 		 }else {
			 			 fail(driver,"Different Chart Title name displayed after saved the chart ");
			 		 }
		 		 }else {
		 			 fail(driver,"Chart not Saved Successfully");
		 		 }	
			 }
		}
		
		
		
	}
	
}
