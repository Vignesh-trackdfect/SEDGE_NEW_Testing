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

public class DASHPRO_SPARKLINE_TESTING extends Keywords{

	public void sparkLine_testing(WebDriver driver,int iteration,String Flag) {
		
		//Axes
		String AxesColor_Exp=Utils.getDataFromTestData("Axes", "Axes_Color_Exp");
		//TableFormat
		String DefaultFontFamily_TableFormat=Utils.getDataFromTestData("SmokeTesting_UI", "DefaultFontFamily_TableFormat");
		String DefaultFontSize_TableFormat=Utils.getDataFromTestData("SmokeTesting_UI", "DefaultFontSize_TableFormat");
		String DefaultHeaderColor_TableFormat=Utils.getDataFromTestData("SmokeTesting_UI", "DefaultHeaderColor_TableFormat");
       	String DefaultBodyFontSize_TableFormat=Utils.getDataFromTestData("SmokeTesting_UI", "DefaultBodyFontSize_TableFormat");
       	String DefaultBorderType_TableFormat=Utils.getDataFromTestData("SmokeTesting_UI", "DefaultBorderType_TableFormat");
       	String NegativeCellColor_TableFormat=Utils.getDataFromTestData("SmokeTesting_UI", "NegativeCellColor_TableFormat");
       	String AlignmentSelectedColor_TableFormat=Utils.getDataFromTestData("SmokeTesting_UI", "AlignmentSelectedColor_TableFormat");
       	String DefaultSeperator_TableFormat=Utils.getDataFromTestData("SmokeTesting_UI", "DefaultSeperator_TableFormat");
       	String DefaultRoundOff_TableFormat=Utils.getDataFromTestData("SmokeTesting_UI", "DefaultRoundOff_TableFormat");

		//Iteration Inputs
		//Axes
		String Select_Date_Value=Utils.getDataFromTestDataIteration(iteration,"SparkLine_Widget_Testing", "Select_Date_Value");
		String Select_Date_GroupValue=Utils.getDataFromTestDataIteration(iteration,"SparkLine_Widget_Testing", "Select_Date_GroupValue");
		String Select_Categories_Value1=Utils.getDataFromTestDataIteration(iteration,"SparkLine_Widget_Testing", "Select_Categories_Value1");
		String Select_Categories_Value2=Utils.getDataFromTestDataIteration(iteration,"SparkLine_Widget_Testing", "Select_Categories_Value2");
		String Select_Categories_Value3=Utils.getDataFromTestDataIteration(iteration,"SparkLine_Widget_Testing", "Select_Categories_Value3");
		String Select_Numericals_Value1=Utils.getDataFromTestDataIteration(iteration,"SparkLine_Widget_Testing", "Select_Numericals_Value1");
		String Select_Numericals_Value2=Utils.getDataFromTestDataIteration(iteration,"SparkLine_Widget_Testing", "Select_Numericals_Value2");
		String Select_Aggregation_Value1=Utils.getDataFromTestDataIteration(iteration,"SparkLine_Widget_Testing", "Select_Aggregation_Value1");
		String Select_Aggregation_Value2=Utils.getDataFromTestDataIteration(iteration,"SparkLine_Widget_Testing", "Select_Aggregation_Value2");
		String Select_ChartType_Value1=Utils.getDataFromTestDataIteration(iteration,"SparkLine_Widget_Testing", "Select_ChartType_Value1");
		String Select_ChartType_Value2=Utils.getDataFromTestDataIteration(iteration,"SparkLine_Widget_Testing", "Select_ChartType_Value2");
		String Change_Periods_Value=Utils.getDataFromTestDataIteration(iteration,"SparkLine_Widget_Testing", "Change_Periods_Value");
		String Select_Seperator_TableFormat=Utils.getDataFromTestDataIteration(iteration,"SparkLine_Widget_Testing", "Select_Seperator_TableFormat");

		//Table Format
		String Select_TableTheme=Utils.getDataFromTestDataIteration(iteration,"SparkLine_Widget_Testing", "Select_TableTheme");
		String Select_FontFamily_TableFormat=Utils.getDataFromTestDataIteration(iteration,"SparkLine_Widget_Testing", "Select_FontFamily_TableFormat");
		String Select_FontSize_TableFormat=Utils.getDataFromTestDataIteration(iteration,"SparkLine_Widget_Testing", "Select_FontSize_TableFormat");
		String Change_HeaderColor_TableFormat=Utils.getDataFromTestDataIteration(iteration,"SparkLine_Widget_Testing", "Change_HeaderColor_TableFormat");
		String Select_BodyFontSize_TableFomat=Utils.getDataFromTestDataIteration(iteration,"SparkLine_Widget_Testing", "Select_BodyFontSize_TableFomat");
		String Select_Border_TableFormat=Utils.getDataFromTestDataIteration(iteration,"SparkLine_Widget_Testing", "Select_Border_TableFormat");
		String Select_RoundOffValue_TableFormat=Utils.getDataFromTestDataIteration(iteration,"SparkLine_Widget_Testing", "Select_RoundOffValue_TableFormat");
		
		//Table Format
		String Select_ChartTheme_ColorStyling=Utils.getDataFromTestDataIteration(iteration,"SparkLine_Widget_Testing", "Select_ChartTheme_ColorStyling");
		String Select_Seperator_SparkLine=Utils.getDataFromTestDataIteration(iteration,"SparkLine_Widget_Testing", "Select_Seperator_SparkLine");
		String Select_RoundOff_SparkLine=Utils.getDataFromTestDataIteration(iteration,"SparkLine_Widget_Testing", "Select_RoundOff_SparkLine");
		String Change_FontColor_SparkLine=Utils.getDataFromTestDataIteration(iteration,"SparkLine_Widget_Testing", "Change_FontColor_SparkLine");
		String Change_FirstPOIColor_SparkLine=Utils.getDataFromTestDataIteration(iteration,"SparkLine_Widget_Testing", "Change_FirstPOIColor_SparkLine");
		String Change_MinPOIColor_SparkLine=Utils.getDataFromTestDataIteration(iteration,"SparkLine_Widget_Testing", "Change_MinPOIColor_SparkLine");
		String Change_LastPOIColor_SparkLine=Utils.getDataFromTestDataIteration(iteration,"SparkLine_Widget_Testing", "Change_LastPOIColor_SparkLine");
		String Change_MaxPOIColor_SparkLine=Utils.getDataFromTestDataIteration(iteration,"SparkLine_Widget_Testing", "Change_MaxPOIColor_SparkLine");

		
		String TestcaseFileName="DASHPRO_SPARKLINE";
		String SheetName_Axes="SPARKLINE";
		String SheetName_TableFormat="TABLE FORMAT";
		String SheetName_SparkLineFormat="SPARKLINE FORMAT";
		String TestcaseID_Flag="Flag"; 
		String TescasesID_Column="TEST CASE ID";
		//Yes/No Input for Testcases Id
		String TC_Sparkline_001=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ Sparkline_001",TestcaseID_Flag);
		String TC_Sparkline_002=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ Sparkline_002",TestcaseID_Flag);
		String TC_Sparkline_003=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ Sparkline_003",TestcaseID_Flag);
		String TC_Sparkline_004=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ Sparkline_004",TestcaseID_Flag);
		String TC_Sparkline_005=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ Sparkline_005",TestcaseID_Flag);
		String TC_Sparkline_006=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ Sparkline_006",TestcaseID_Flag);
		String TC_Sparkline_007=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ Sparkline_007",TestcaseID_Flag);
		String TC_Sparkline_008=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ Sparkline_008",TestcaseID_Flag);
		String TC_Sparkline_009=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ Sparkline_009",TestcaseID_Flag);
		String TC_Sparkline_010=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ Sparkline_010",TestcaseID_Flag);
		String TC_Sparkline_011=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ Sparkline_011",TestcaseID_Flag);
		String TC_Sparkline_012=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ Sparkline_012",TestcaseID_Flag);
		String TC_Sparkline_013=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ Sparkline_013",TestcaseID_Flag);
		String TC_Sparkline_014=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ Sparkline_014",TestcaseID_Flag);
		String TC_Sparkline_015=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ Sparkline_015",TestcaseID_Flag);
		String TC_Sparkline_016=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ Sparkline_016",TestcaseID_Flag);
		String TC_Sparkline_017=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ Sparkline_017",TestcaseID_Flag);
		String TC_Sparkline_018=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ Sparkline_018",TestcaseID_Flag);
		String TC_Sparkline_019=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ Sparkline_019",TestcaseID_Flag);
		String TC_Sparkline_020=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ Sparkline_020",TestcaseID_Flag);
		String TC_Sparkline_021=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ Sparkline_021",TestcaseID_Flag);
		String TC_Sparkline_022=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ Sparkline_022",TestcaseID_Flag);
		String TC_Sparkline_023=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ Sparkline_023",TestcaseID_Flag);
		String TC_Sparkline_024=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ Sparkline_024",TestcaseID_Flag);
		String TC_Sparkline_025=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ Sparkline_025",TestcaseID_Flag);
		String TC_Sparkline_026=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ Sparkline_026",TestcaseID_Flag);
		String TC_Sparkline_027=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ Sparkline_027",TestcaseID_Flag);
		String TC_Sparkline_028=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ Sparkline_028",TestcaseID_Flag);

	
		setTestCaseID(" ");
		Actions action=new Actions(driver);
		mouseOverToElement(driver, ADDTabPlus);
  	    mouseOverAndClick(driver, ADDTabPlus);
  	    wait(driver,"1");
  	    sendKeys(driver,newlyAddedTab,"SparkLineTestTab");
  	    click(driver,DashProPage);
  	    elementnotvisible1(driver, RPE_Loading);
		waitForElement(driver,ADD_widget_rightTop);
	    click(driver,ADD_widget_rightTop);
	    elementnotvisible(driver,Loading);
	    elementnotvisible1(driver, RPE_Loading);
		waitForElement(driver,WidgetPanel);
		
		setTestCaseID("TC_Sparkline_001");
		if(TC_Sparkline_001.equals("Yes")) {
			waitForElement(driver,Sparkline_widget);
			verifyElementDisplayed(driver, Sparkline_widget);
			WidgetValidation(driver,Sparkline_widget,"Sparkline");

		}
		
		setTestCaseID("TC_Sparkline_002");
		if(TC_Sparkline_002.equals("Yes")) {
			click(driver,Sparkline_widget);
			if(isDisplayed2(driver,error)){
				 String errorWidget=getText1(driver,error);
				 if(errorWidget.contains("Please refer the logs in Logs")) {
					 fail(driver,"Error displayed When click SparkLine Widget, Validation : "+errorWidget);
				 }else {
					 pass(driver,"Error displayed When click SparkLine Widget, Validation : "+errorWidget);
				 }
				 elementnotvisible1(driver, error);
			 }else {
				  elementnotvisible(driver, Loading);
				  elementnotvisible1(driver, RPE_Loading);
				  String widgetValue=getText1(driver,WidgetValue);
				  if(widgetValue.equals("Sparkline")) {
			 		pass(driver,"Sparkline displayed as the selected Widget after click on it");
				  }else {
			 		fail(driver,"Sparkline not displayed as the selected Widget after click on it");
				  } 
				  
				  setTestCaseID("TC_Sparkline_003");
				  if(TC_Sparkline_003.equals("Yes")) {
					  String AxesExpand=getAttribute1(driver,Axes_Expand,"class");
					  if(AxesExpand.contains("up")) {
						  pass(driver,"By default, Axes Section is Expanded");
						  String AxesTextColor_Act=getTextColor(driver,Axes);
						  if(AxesColor_Exp.equalsIgnoreCase(AxesTextColor_Act)) {
							  pass(driver," 'Axes' highlighted in blue color");
						  }else {
							  fail(driver," 'Axes' not highlighted in blue color");
						  }
					  }else {
						  fail(driver,"By default, Axes Section is not Expanded");
					  }
				  }
				  
				  setTestCaseID("TC_Sparkline_004");
				  if(TC_Sparkline_004.equals("Yes")) {
					  verifyElementDisplayed(driver, Date_Input_Sparkline);
					  verifyElementDisplayed(driver, Date_text_Sparkline);
					  
					  verifyElementDisplayed(driver, Categories_input_Sparkline);
					  verifyElementDisplayed(driver, Categories_text_Sparkline);
					  
					  verifyElementDisplayed(driver, PeriodInput);
					  verifyElementDisplayed(driver, Period_text_Sparkline);
					  
					  verifyElementDisplayed(driver, Numericals_Input_Sparkline);
					  verifyElementDisplayed(driver, Numericals_text_Sparkline);
				  }
				  
				  setTestCaseID("TC_Sparkline_005");
				  if(TC_Sparkline_005.equals("Yes")) {
					  scrollUsingElement(driver, ApplyButton);
					  click(driver,ApplyButton);
					  if(isDisplayed(driver,Date_error_Sparkline)) {
						  pass(driver,"'Kindly select a date column' Error displayed when click Apply button without providing inputs");
						  elementnotvisible1(driver, Date_error_Sparkline);
					  }else {
						  fail(driver,"'Kindly select a date column' Error not displayed when click Apply button without providing inputs");
					  }
				  }
				  
				  setTestCaseID("TC_Sparkline_006");
				  if(TC_Sparkline_006.equals("Yes")) {
					  if(isDisplayed(driver, Date_Input_Sparkline)) {
							click(driver,Date_Input_Sparkline);
							if(isDisplayed(driver,Date_dropdownResultsExp_Sparkline)) {
								pass(driver,"Date dropdown Expanded after click on it");
								setTestCaseID("TC_Sparkline_007");
								if(TC_Sparkline_007.equals("Yes")) {
									List<WebElement> displayedDataImage=getWebElements(driver, dataTypeImages);
									setTestCaseID("TC_Sparkline_007");
									boolean dateColumn=true;
									for(WebElement dataImag:displayedDataImage) {
										String dataTypeDisplay=dataImag.getAttribute("src");
										if(!dataTypeDisplay.contains("Date")) {
											fail(driver,"Other than Date datatype column is displayed in the Date dropdown");
											dateColumn=false;
											break;
										}
									}
									
									if(dateColumn==true) {
										pass(driver,"Only Date dataType column is displayed in the Date Dropdown");
									}
									
								}
								
								setTestCaseID("");
								ScrollBarValidation1(driver, Date_dropdownResultsExp_Sparkline, "Date_Dropdown_SparkLine");
								if(verifyElementDisplayed(driver, dropdownInputsearchBox)) {
									click(driver,dropdownInputsearchBox);
									sendKeys(driver,dropdownInputsearchBox,"afghjku");
									if(isDisplayed2(driver,NoResultsFound)) {
										pass(driver,"'No Results found' message is displayed in while searching invalid value in the Date dropdown input");
									}else {
										fail(driver,"'No Results found' message is not displayed in while searching invalid value in the Date dropdown input");
									}
									
									clear1(driver,dropdownInputsearchBox);
									wait(driver,"1");
									if(isDisplayed2(driver,NoResultsFound)){
										fail(driver,"Column List are not displayed after clear the search input in the Date dropdown");
									}else {
										pass(driver,"Column List are displayed after clear the search input in the Date dropdown");
									}
									
									sendKeys(driver,dropdownInputsearchBox,Select_Date_Value);
									wait(driver,"1");
									String firstValue_X=getText1(driver,FirstSearchedvalue);
									if(firstValue_X.contains(Select_Date_Value)) {
										pass(driver,"Searched Value correctly displayed in the Date dropdown");
									}else {
										fail(driver,"Searched Value not correctly displayed in the Date dropdown");
									}
									
								}
								
								setTestCaseID("TC_Sparkline_008");
								if(TC_Sparkline_008.equals("Yes")) {
									selectDropdownValue1(driver,Select_Date_Value);
									if(isDisplayed2(driver,Date_dropdownResultsExp_Sparkline)) {
										fail(driver,"Date Value dropdown not closed after selecting the Value");
									}else {
										pass(driver,"Date Value dropdown closed automatically after selecting the Value");
										String seletcedValue=getText1(driver,Date_Input_Sparkline);
										if(seletcedValue.contains(Select_Date_Value)) {
											pass(driver,"Selected value displayed in the Date Input after click it");
										}else {
											fail(driver,"Selected value not displayed in the Date Input after click it");
										}
									}
									
								}
								
								setTestCaseID("TC_Sparkline_009");
								if(TC_Sparkline_009.equals("Yes")) {
									 if(isDisplayed(driver,groupDropdown)) {
										  pass(driver,"Group input is displayed after selecting the Value in DateInput");
										  setTestCaseID("TC_Sparkline_010");
										  if(TC_Sparkline_010.equals("Yes")) {
											  scrollUsingElement(driver, ApplyButton);
											  click(driver,ApplyButton);
											  if(isDisplayed(driver,GroupInputError_Sparkline)) {
												  pass(driver,"'Kindly select atleast one column for categories' Error displayed when click Apply button without providing Group input");
												  elementnotvisible1(driver, GroupInputError_Sparkline);
											  }else {
												  fail(driver,"'Kindly select atleast one column for categories' Error not displayed when click Apply button without providing Group input");
											  }
										  }
										  
										  setTestCaseID("TC_Sparkline_011");
										  if(TC_Sparkline_011.equals("Yes")) {
											  click(driver,groupDropdown);
											  if(verifyElementDisplayed(driver, GroupDropdownExpand)){
												  setTestCaseID("TC_Sparkline_012");
												  if(TC_Sparkline_012.equals("Yes")) {
													  selectDropdownValue1(driver,Select_Date_GroupValue);
													  if(isDisplayed2(driver,GroupDropdownExpand)) {
														  fail(driver,"Date Group dropdown not closed after selecting the Value");
													  }else {
														  pass(driver,"Date Group dropdown closed automatically after selecting the Value");
														  String seletcedValue=getText1(driver,groupDropdown);
														  if(seletcedValue.contains(Select_Date_GroupValue)) {
															  pass(driver,"Selected value displayed in the Date Group Input after click it");
														  }else {
															  fail(driver,"Selected value not displayed in the Date Group Input after click it");
														  }
													  } 
												  }
											  }
										  }
										  
									 }else {
										 fail(driver,"Group input is not displayed after selecting the Value in DateInput");
									 }
								}
								
							}else {
								fail(driver,"Date dropdown not Expanded after click on it");
							}
						}else {
							fail(driver,"Date input is not available, unable to validate the Date input functionality");
						}
				  }
				  
				  setTestCaseID("TC_Sparkline_013");
				  if(TC_Sparkline_013.equals("Yes")) {
					  scrollUsingElement(driver, ApplyButton);
					  click(driver,ApplyButton);
					  if(isDisplayed(driver,GroupInputError_Sparkline)) {
						  pass(driver,"'Kindly select atleast one column for categories' Error displayed when click Apply button without providing Categories input");
						  elementnotvisible1(driver, GroupInputError_Sparkline);
					  }else {
						  fail(driver,"'Kindly select atleast one column for categories' Error not displayed when click Apply button without providing Categories input");
					  }
				  }
				  
				  setTestCaseID("TC_Sparkline_014"); 
				  if(TC_Sparkline_014.equals("Yes")) {
					  if(isDisplayed(driver,Categories_input_Sparkline)) {
						  click(driver,Categories_input_Sparkline);
						  if(isDisplayed(driver,Categories_DropdownExpand_Sparkline)) {
							  pass(driver,"Categories dropdown Expanded after click on it");
							  setTestCaseID("TC_Sparkline_015"); 
							  if(TC_Sparkline_015.equals("Yes")) {
								  List<WebElement> displayedDataImage=getWebElements(driver, dataTypeImages);
								  List<WebElement> AvailableColumnList=getWebElements(driver, AvailableList_Dropdown);
								  if(AvailableColumnList.size()==displayedDataImage.size()) {
									  pass(driver,"All the available columns are displayed with data Type icon in the Categories dropdown");
								  }else {
									  fail(driver,"Some columns are not correctly displayed with data Type icon in the Categories dropdown");
								  }
								  boolean categoryType=true;
								  for(WebElement dataImag:displayedDataImage) {
									  String dataTypeDisplay=dataImag.getAttribute("src");
									  if(!dataTypeDisplay.contains("Categorical")) {
										  fail(driver,"Other than Categorical column is displayed in the Categories dropdown");
										  categoryType=false;
										  break;
									  }	
								  }
								  
								  if(categoryType==true) {
									  pass(driver,"Only Categorical column is displayed in the Categories dropdown");
								  }	
							  }
							  
							  setTestCaseID("TC_Sparkline_016"); 
							  if(TC_Sparkline_016.equals("Yes")) {
								  List<WebElement> AvailableColumnList_Axis=getWebElements(driver, AvailableList_Dropdown);
								  int columnListCount=AvailableColumnList_Axis.size();
								  
								  if(columnListCount>10) {
									  columnListCount=10;
								  }
								  for (int k=0;k<columnListCount;k++) {
									  WebElement availableColumn=AvailableColumnList_Axis.get(k);
									  action.moveToElement(availableColumn).click().build().perform();
								  }
									
								  if(isDisplayed2(driver,error)) {
									  fail(driver,"Error displayed when Selecting multiple value in the Categories dropdown");
								  }else {
									  pass(driver,"Error not displayed when Selecting multiple value in the Categories dropdown");
								  }
								  
								  setTestCaseID("TC_Sparkline_017");
								  if(TC_Sparkline_017.equals("Yes")) {
									  ScrollBarValidation1(driver, Categories_input_Sparkline, "Categories_Input");
								  }
								  
								  setTestCaseID("TC_Sparkline_018");
								  if(TC_Sparkline_018.equals("Yes")) {
									  List<WebElement> selectedList=getWebElements(driver, Selected_CategoricalValues);
									  WebElement firstele=selectedList.get(0);
									  String BeforeDragFirst=getText1(driver, Selected_CategoricalValues);
									  action.moveToElement(firstele).build().perform();
									  wait(driver,"1");
									  action.clickAndHold(firstele).build().perform();
									  wait(driver,"1");
									  action.moveByOffset(150, 5).build().perform();
									  wait(driver,"1");
									  action.release().build().perform();
									  String AfterDragFirst=getText1(driver, Selected_CategoricalValues);
									  if(BeforeDragFirst.equals(AfterDragFirst)) {
										  fail(driver,"Dragging not performed successfully in the Categories input");
									  }else {
										  pass(driver,"Dragging performed successfully in the Categories input");
									  }
									  
									  while(isDisplayed2(driver,RemoveOption)) {
										  WebElement RemoveSelectList=getWebElement(driver,RemoveOption);
										  action.moveToElement(RemoveSelectList).click().build().perform();
										  wait(driver,"1");
									  }

									  if(!isDisplayed2(driver,Selected_CategoricalValues)) {
										  pass(driver,"All the column Values are removed from the Categories input after removing all the value");
									  }else {
										  fail(driver,"Some Column Value not removed from the Categories input after removing all the value");
									  }
									  
								  }
								  
							  }else {
								  //If user provide No for Testcase_16 then testcase_17 and testcase_18 also will not execute eventhough it was in Yes position.
								  //Because Testcase_17, 18 are based on testcase_16.
								 System.out.println("Testcase_16, 17, 18 not executed...."); 
							  }
							  
							  //In TestcaseID_16 I have selection multiple values upto maximum 10 and validating whether the error is displayed not. 
							  //And then TestcaseID_18 I have removing all the selected Values and Validating it is removed or not.
							  // But if use provide no for Testcases_18 the selected 10 values not remove. Because after removing all these value only I can select 3 values from input sheet.
							  if(isDisplayed2(driver,Selected_CategoricalValues)) {
								  while(isDisplayed2(driver,RemoveOption)) {
									  WebElement RemoveSelectList=getWebElement(driver,RemoveOption);
									  action.moveToElement(RemoveSelectList).click().build().perform();
									  wait(driver,"1");
								  }
							  }
							  setTestCaseID("TC_Sparkline_016A"); 
							  //Now I am selecting 3 values from input sheet.
							  click(driver,Categories_input_Sparkline);
							  waitForElement(driver,Categories_DropdownExpand_Sparkline);
							  selectDropdownValue1(driver,Select_Categories_Value1);
							  selectDropdownValue1(driver,Select_Categories_Value2);
							  selectDropdownValue1(driver,Select_Categories_Value3);
							  wait(driver,"1");
							  List<WebElement> selectedList=getWebElements(driver,Selected_CategoricalValues);
							  if(selectedList.size()==3) {
								  pass(driver,"Selected 3 Values updated in the Categories input");
							  }else {
								  fail(driver,"Selected 3 Values not updated in the Categories input");
							  } 
							  setTestCaseID("");
							  click(driver,Categories_text_Sparkline);
							  wait(driver,"1");
							  if(isDisplayed2(driver,Categories_DropdownExpand_Sparkline)) {
								  fail(driver,"Categories Dropdown not closed when click outside it");
							  }
							  
						  }else {
								fail(driver,"Categories dropdown not Expanded after click on it");
						  }
					  }else {
						  fail(driver,"Categories input is not available, unable to validate the Categories input functionality");
					  }
				  }
				  
				  setTestCaseID("TC_Sparkline_019");
				  if(TC_Sparkline_019.equals("Yes")) {
					  scrollUsingElement(driver, ApplyButton);
					  click(driver,ApplyButton);
					  if(isDisplayed(driver,Numerical_InputError)) {
						  pass(driver,"'Kindly select atleast one column for numericals' Error displayed when click Apply button without providing numerical input");
						  elementnotvisible1(driver, Numerical_InputError);
					  }else {
						  fail(driver,"'Kindly select atleast one column for numericals' Error not displayed when click Apply button without providing Numerical input");
					  }
				  }
				  
				  setTestCaseID("TC_Sparkline_020"); 
				  if(TC_Sparkline_020.equals("Yes")) {
					  if(isDisplayed(driver,Numericals_Input_Sparkline)) {
						  click(driver,Numericals_Input_Sparkline);
						  if(isDisplayed(driver,Numericals_DropdownExpand_Sparkline)) {
							  pass(driver,"Numerical dropdown Expanded after click on it");
							  setTestCaseID("TC_Sparkline_021"); 
							  if(TC_Sparkline_021.equals("Yes")) {
								  List<WebElement> displayedDataImage=getWebElements(driver, dataTypeImages);
								  List<WebElement> AvailableColumnList=getWebElements(driver, AvailableList_Dropdown);
								  List<WebElement> AvailableAggList=getWebElements(driver, Aggregation_SelectOption);
								  List<WebElement> AvailableChartTypeList=getWebElements(driver, ChartType_selectOption);
								  if(AvailableColumnList.size()==displayedDataImage.size()) {
									  pass(driver,"All the available columns are displayed with data Type icon in the Numerical dropdown");
								  }else {
									  fail(driver,"Some columns are not correctly displayed with data Type icon in the Numerical dropdown");
								  }
								  boolean NumericalType=true;
								  for(WebElement dataImag:displayedDataImage) {
									  String dataTypeDisplay=dataImag.getAttribute("src");
									  if(!dataTypeDisplay.contains("Numerical")) {
										  fail(driver,"Other than Numerical column is displayed in the Numerical dropdown");
										  NumericalType=false;
										  break;
									  }	
								  }
								  
								  if(NumericalType==true) {
									  pass(driver,"Only Numerical column is displayed in the Numerical dropdown");
								  }	
								  
								  if(AvailableColumnList.size()==AvailableChartTypeList.size()) {
									  pass(driver,"All the available columns are displayed with Chart Type Select Input in the Numerical dropdown");
								  }else {
									  fail(driver,"Some columns are not correctly displayed with Chart Type Select Input in the Numerical dropdown");
								  }
								  
								  if(AvailableColumnList.size()==AvailableAggList.size()) {
									  pass(driver,"All the available columns are displayed with Aggregation Select Input in the Numerical dropdown");
								  }else {
									  fail(driver,"Some columns are not correctly displayed with Aggregtaion Select Input in the Numerical dropdown");
								  }
							  }
							  
							  setTestCaseID("TC_Sparkline_022"); 
							  if(TC_Sparkline_022.equals("Yes")) {
								  if(isDisplayed(driver,Aggregation_SelectOption)) {
									  String default_Agg_Num=defaultSelectedValue(driver, Aggregation_SelectOption);
									  if(default_Agg_Num.equals("Sum")) {
										  pass(driver,"'Sum' is selected as default Aggregation in Numerical dropdown");
									  }else {
										  fail(driver,"'Sum' is not selected as default Aggregation in Numerical dropdown");
									  }
									  
									  mouseOverAndClick(driver, Aggregation_SelectOption);	
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
									  mouseOverAndClick(driver, Aggregation_SelectOption);
									  
								  }else {
									  fail(driver,"Aggregation not Available, Unable Validate the Aggregation");
								  }
							  }
							  
							  setTestCaseID("TC_Sparkline_023");
							  if(TC_Sparkline_023.equals("Yes")) {
								  try {
									  WebElement firstNum=driver.findElement(By.xpath("//select[contains(@id,'"+Select_Numericals_Value1+"_agg_select')]"));
									  selectByText_WebElement(driver,firstNum,Select_Aggregation_Value1);
									  wait(driver,"1");
									  firstNum=driver.findElement(By.xpath("//select[contains(@id,'"+Select_Numericals_Value1+"_agg_select')]"));
									  String AggregationValue=SelectedValue_WebElement(driver,firstNum);
									  if(AggregationValue.equals(Select_Aggregation_Value1)) {
										  pass(driver,"Selected aggregation is applied in the Agg input for "+Select_Numericals_Value1);
									  }else {
										  fail(driver,"Selected Aggregation not applied in the Agg input for "+Select_Numericals_Value1);
									  }
								  }catch(Exception e) {
									  fail(driver,"Unable to select the Aggregation for "+Select_Numericals_Value1);
								  }									 
								
								  try {
									  WebElement second=driver.findElement(By.xpath("//select[contains(@id,'"+Select_Numericals_Value2+"_agg_select')]"));
									  selectByText_WebElement(driver,second,Select_Aggregation_Value2);
									  wait(driver,"1");
									  second=driver.findElement(By.xpath("//select[contains(@id,'"+Select_Numericals_Value2+"_agg_select')]"));
									  String AggregationValue=SelectedValue_WebElement(driver,second);
									  if(AggregationValue.equals(Select_Aggregation_Value2)) {
										  pass(driver,"Selected aggregation is applied in the Agg input for "+Select_Numericals_Value2);
									  }else {
										  fail(driver,"Selected Aggregation not applied in the Agg input for "+Select_Numericals_Value2);
									  }
								  }catch(Exception e) {
									  fail(driver,"Unable to select the Aggregation for "+Select_Numericals_Value2);
								  }	
							  }
							  
							  setTestCaseID("TC_Sparkline_024");
							  if(TC_Sparkline_024.equals("Yes")) {
								  try {
									  WebElement firstNum=driver.findElement(By.xpath("//select[contains(@id,'"+Select_Numericals_Value1+"_stype_select')]"));
									  selectByText_WebElement(driver,firstNum,Select_ChartType_Value1);
									  wait(driver,"1");
									  firstNum=driver.findElement(By.xpath("//select[contains(@id,'"+Select_Numericals_Value1+"_stype_select')]"));
									  String ChartTypeValue=SelectedValue_WebElement(driver,firstNum);
									  if(ChartTypeValue.equals(Select_ChartType_Value1)) {
										  pass(driver,"Selected ChartType is applied in the ChartType input for "+Select_Numericals_Value1);
									  }else {
										  fail(driver,"Selected ChartType not applied in the ChartType input for "+Select_Numericals_Value1);
									  }
								  }catch(Exception e) {
									  fail(driver,"Unable to select the ChartType for "+Select_Numericals_Value1);
								  }	
								  
								  try {
									  WebElement secondNum=driver.findElement(By.xpath("//select[contains(@id,'"+Select_Numericals_Value2+"_stype_select')]"));
									  selectByText_WebElement(driver,secondNum,Select_ChartType_Value2);
									  wait(driver,"1");
									  secondNum=driver.findElement(By.xpath("//select[contains(@id,'"+Select_Numericals_Value2+"_stype_select')]"));
									  String ChartTypeValue=SelectedValue_WebElement(driver,secondNum);
									  if(ChartTypeValue.equals(Select_ChartType_Value2)) {
										  pass(driver,"Selected ChartType is applied in the ChartType input for "+Select_Numericals_Value2);
									  }else {
										  fail(driver,"Selected ChartType not applied in the ChartType input for "+Select_Numericals_Value2);
									  }
								  }catch(Exception e) {
									  fail(driver,"Unable to select the ChartType for "+Select_Numericals_Value2);
								  }	
							  }
							  setTestCaseID("");
							  //Here selecting the Two Numerical Column from the input sheet
							  selectDropdownValue1(driver, Select_Numericals_Value1);
							  wait(driver,"1");
							  String firstValue=getText1(driver, Selected_NumericalValue);
							  if(firstValue.contains(Select_Numericals_Value1)) {
								  pass(driver,Select_Numericals_Value1+" value is updated in the Numerical input after select it");
							  }else {
								  fail(driver,Select_Numericals_Value1+" value is not updated in the Numerical input after select it");
							  }
							  
							  selectDropdownValue1(driver, Select_Numericals_Value2);
							  wait(driver,"1");
							  String secondValue=getText1(driver, Selected_numericalValue2);
							  if(secondValue.contains(Select_Numericals_Value2)) {
								  pass(driver,Select_Numericals_Value2+" value is updated in the Numerical input after select it");
							  }else {
								  fail(driver,Select_Numericals_Value2+" value is not updated in the Numerical input after select it");
							  }
							  click(driver,Numericals_text_Sparkline);
							  wait(driver,"1");
							  setTestCaseID("TC_Sparkline_025");
							  if(TC_Sparkline_025.equals("Yes")) {
								  List<WebElement> selectedList=getWebElements(driver, Selected_NumericalValue);
						  		  WebElement firstele=selectedList.get(0);
						  		  String BeforeDragFirst=getText1(driver, Selected_NumericalValue);
						  		  action.moveToElement(firstele).build().perform();
						  		  wait(driver,"1");
						  		  action.clickAndHold(firstele).build().perform();
						  		  wait(driver,"1");
						  		  action.moveByOffset(200, 5).build().perform();
						  		  wait(driver,"1");
						  		  action.release().build().perform();
						  		  String AfterDragFirst=getText1(driver, Selected_NumericalValue);
						  		  if(BeforeDragFirst.equals(AfterDragFirst)) {
						  			  fail(driver,"Dragging not performed successfully in the Numerical input");
						  		  }else {
						  			  pass(driver,"Dragging performed successfully in the Numerical input");
						  		  }
							  }
							  
						  }else {
							  fail(driver,"Numerical dropdown not Expanded after click on it");
						  }
					  }
				  }
				  
				  setTestCaseID("TC_Sparkline_026");
				  if(TC_Sparkline_026.equals("Yes")) {
					  scrollUsingElement(driver,ApplyButton);
					  click(driver,ApplyButton);
					  elementnotvisible1(driver, RPE_Loading);
					  if(isDisplayed2(driver,error)){
						  String errorWidget=getText1(driver,error);
						  fail(driver,"Error displayed When click Apply Button on 'SparkLine' Widget, Validation : "+errorWidget);
						  elementnotvisible1(driver, error);
					  }else if(isDisplayed(driver,SparkLineChart)) {
						  pass(driver,"Chart is Displayed in the SparkLine Widget");
						  List<WebElement> headers=getWebElements(driver, SparkLineTable_Headers);
						  boolean firstCategory=false;
						  boolean secondCategory=false;
						  boolean thirdCategory=false;
						  for(int i=0;i<headers.size();i++) {
							  WebElement ele=headers.get(i);
							  String eleHeader=ele.getAttribute("col-id");
							  if(Select_Categories_Value1.contains(eleHeader)) {
								  firstCategory=true;
							  }
							  if(Select_Categories_Value2.contains(eleHeader)) {
								  secondCategory=true;
							  }
							  
							  if(Select_Categories_Value3.contains(eleHeader)) {
								  thirdCategory=true;
							  }
						  }
						  
						  if(firstCategory==true) {
							  pass(driver,"Selected '"+Select_Categories_Value1+"' categories value applied in the Chart header");
						  }else {
							  fail(driver,"Selected '"+Select_Categories_Value1+"' categories value not applied in the Chart header");
						  }
						  
						  if(secondCategory==true) {
							  pass(driver,"Selected '"+Select_Categories_Value2+"' categories value applied in the Chart header");
						  }else {
							  fail(driver,"Selected '"+Select_Categories_Value2+"' categories value not applied in the Chart header");
						  }
						  
						  if(thirdCategory==true) {
							  pass(driver,"Selected '"+Select_Categories_Value3+"' categories value applied in the Chart header");
						  }else {
							  fail(driver,"Selected '"+Select_Categories_Value3+"' categories value not applied in the Chart header");
						  }
						  
						  List<WebElement> headersNumerical=getWebElements(driver, SparkLineTable_NumericHead);
						  boolean firstNum=false;
						  boolean secondNum=false;
						  for(int i=0;i<headersNumerical.size();i++) {
							  WebElement ele=headersNumerical.get(i);
							  action.moveToElement(ele).build().perform();
							  String Ele_text=ele.getText();
							  if(Ele_text.contains(Select_Numericals_Value1)) {
								  firstNum=true;
							  }
							  if(Ele_text.contains(Select_Numericals_Value2)) {
								  secondNum=true;
							  }
							  
						  }
						  
						  if(firstNum==true) {
							  pass(driver,"Selected '"+Select_Numericals_Value1+"' Numerical value applied in the Chart");
						  }else {
							  fail(driver,"Selected '"+Select_Numericals_Value1+"' Numerical value applied in the Chart");
						  }
						  
						  if(secondNum==true) {
							  pass(driver,"Selected '"+Select_Numericals_Value2+"' Numerical value applied in the Chart");
						  }else {
							  fail(driver,"Selected '"+Select_Numericals_Value2+"' Numerical value applied in the Chart");
						  }
						  
					  }
				  }
				  
				  setTestCaseID("TC_Sparkline_027");
				  if(TC_Sparkline_027.equals("Yes")) {
					  String defaultPeriodValue=getAttribute1(driver, PeriodInput, "value");
					  if(defaultPeriodValue.equals("5")) {
						  pass(driver,"By default, '5' is displayed in the Periods input");
					  }else {
						  fail(driver,"By default, '5' is not displayed in the Periods input");
					  }
				  }
				  
				  setTestCaseID("TC_Sparkline_028");
				  if(TC_Sparkline_028.equals("Yes")) {
					  clear1(driver,PeriodInput);
					  sendKeys(driver, PeriodInput, Change_Periods_Value);
					  scrollUsingElement(driver,ApplyButton);
					  click(driver,ApplyButton);
					  elementnotvisible1(driver, RPE_Loading);
					  if(isDisplayed2(driver,error)){
						  String errorWidget=getText1(driver,error);
						  fail(driver,"Error displayed When click Apply Button on 'SparkLine' Widget, Validation : "+errorWidget);
						  elementnotvisible1(driver, error);
					  }else if(isDisplayed(driver,SparkLineChart)) {
						  String headerchart=getAttribute1(driver, Periods_Header, "col-id");
						  if(headerchart.contains(" "+Change_Periods_Value)) {
							  pass(driver,"Changed periods value '"+Change_Periods_Value+"' applied in the chart");
						  }else {
							  fail(driver,"Changed periods value '"+Change_Periods_Value+"' not applied in the chart");
						  }
					  }
					  
				  }
				 
			 }
		}
      
    	//*********************** SparkLine Table Format validation Start ****************** 
		
		String SparkLine_Table_Format= getCellValue("TestExecution","Testcase_Selection","SparkLine_Table_Format",Flag);
        if(SparkLine_Table_Format.equals("Yes")) {
        	
        	String TC_SPARKLINE_TABLE_FORMAT_001=getTestcaseID_Flag(TestcaseFileName,SheetName_TableFormat,TescasesID_Column,"TC_ SPARKLINE_TABLE_FORMAT_001",TestcaseID_Flag);
        	String TC_SPARKLINE_TABLE_FORMAT_002=getTestcaseID_Flag(TestcaseFileName,SheetName_TableFormat,TescasesID_Column,"TC_ SPARKLINE_TABLE_FORMAT_002",TestcaseID_Flag);
        	String TC_SPARKLINE_TABLE_FORMAT_003=getTestcaseID_Flag(TestcaseFileName,SheetName_TableFormat,TescasesID_Column,"TC_ SPARKLINE_TABLE_FORMAT_003",TestcaseID_Flag);
        	String TC_SPARKLINE_TABLE_FORMAT_004=getTestcaseID_Flag(TestcaseFileName,SheetName_TableFormat,TescasesID_Column,"TC_ SPARKLINE_TABLE_FORMAT_004",TestcaseID_Flag);
        	String TC_SPARKLINE_TABLE_FORMAT_005=getTestcaseID_Flag(TestcaseFileName,SheetName_TableFormat,TescasesID_Column,"TC_ SPARKLINE_TABLE_FORMAT_005",TestcaseID_Flag);
        	String TC_SPARKLINE_TABLE_FORMAT_006=getTestcaseID_Flag(TestcaseFileName,SheetName_TableFormat,TescasesID_Column,"TC_ SPARKLINE_TABLE_FORMAT_006",TestcaseID_Flag);
        	String TC_SPARKLINE_TABLE_FORMAT_007=getTestcaseID_Flag(TestcaseFileName,SheetName_TableFormat,TescasesID_Column,"TC_ SPARKLINE_TABLE_FORMAT_007",TestcaseID_Flag);
        	String TC_SPARKLINE_TABLE_FORMAT_008=getTestcaseID_Flag(TestcaseFileName,SheetName_TableFormat,TescasesID_Column,"TC_ SPARKLINE_TABLE_FORMAT_008",TestcaseID_Flag);
        	String TC_SPARKLINE_TABLE_FORMAT_009=getTestcaseID_Flag(TestcaseFileName,SheetName_TableFormat,TescasesID_Column,"TC_ SPARKLINE_TABLE_FORMAT_009",TestcaseID_Flag);
        	String TC_SPARKLINE_TABLE_FORMAT_010=getTestcaseID_Flag(TestcaseFileName,SheetName_TableFormat,TescasesID_Column,"TC_ SPARKLINE_TABLE_FORMAT_010",TestcaseID_Flag);
        	String TC_SPARKLINE_TABLE_FORMAT_011=getTestcaseID_Flag(TestcaseFileName,SheetName_TableFormat,TescasesID_Column,"TC_ SPARKLINE_TABLE_FORMAT_011",TestcaseID_Flag);
        	String TC_SPARKLINE_TABLE_FORMAT_012=getTestcaseID_Flag(TestcaseFileName,SheetName_TableFormat,TescasesID_Column,"TC_ SPARKLINE_TABLE_FORMAT_012",TestcaseID_Flag);
        	String TC_SPARKLINE_TABLE_FORMAT_013=getTestcaseID_Flag(TestcaseFileName,SheetName_TableFormat,TescasesID_Column,"TC_ SPARKLINE_TABLE_FORMAT_013",TestcaseID_Flag);
        	String TC_SPARKLINE_TABLE_FORMAT_014=getTestcaseID_Flag(TestcaseFileName,SheetName_TableFormat,TescasesID_Column,"TC_ SPARKLINE_TABLE_FORMAT_014",TestcaseID_Flag);
        	String TC_SPARKLINE_TABLE_FORMAT_015=getTestcaseID_Flag(TestcaseFileName,SheetName_TableFormat,TescasesID_Column,"TC_ SPARKLINE_TABLE_FORMAT_015",TestcaseID_Flag);
        	String TC_SPARKLINE_TABLE_FORMAT_016=getTestcaseID_Flag(TestcaseFileName,SheetName_TableFormat,TescasesID_Column,"TC_ SPARKLINE_TABLE_FORMAT_016",TestcaseID_Flag);
        	String TC_SPARKLINE_TABLE_FORMAT_017=getTestcaseID_Flag(TestcaseFileName,SheetName_TableFormat,TescasesID_Column,"TC_ SPARKLINE_TABLE_FORMAT_017",TestcaseID_Flag);
        	String TC_SPARKLINE_TABLE_FORMAT_018=getTestcaseID_Flag(TestcaseFileName,SheetName_TableFormat,TescasesID_Column,"TC_ SPARKLINE_TABLE_FORMAT_018",TestcaseID_Flag);
        	String TC_SPARKLINE_TABLE_FORMAT_019=getTestcaseID_Flag(TestcaseFileName,SheetName_TableFormat,TescasesID_Column,"TC_ SPARKLINE_TABLE_FORMAT_019",TestcaseID_Flag);
        	String TC_SPARKLINE_TABLE_FORMAT_020=getTestcaseID_Flag(TestcaseFileName,SheetName_TableFormat,TescasesID_Column,"TC_ SPARKLINE_TABLE_FORMAT_020",TestcaseID_Flag);
        	String TC_SPARKLINE_TABLE_FORMAT_021=getTestcaseID_Flag(TestcaseFileName,SheetName_TableFormat,TescasesID_Column,"TC_ SPARKLINE_TABLE_FORMAT_021",TestcaseID_Flag);
        	String TC_SPARKLINE_TABLE_FORMAT_022=getTestcaseID_Flag(TestcaseFileName,SheetName_TableFormat,TescasesID_Column,"TC_ SPARKLINE_TABLE_FORMAT_022",TestcaseID_Flag);
        	String TC_SPARKLINE_TABLE_FORMAT_023=getTestcaseID_Flag(TestcaseFileName,SheetName_TableFormat,TescasesID_Column,"TC_ SPARKLINE_TABLE_FORMAT_023",TestcaseID_Flag);
        	String TC_SPARKLINE_TABLE_FORMAT_024=getTestcaseID_Flag(TestcaseFileName,SheetName_TableFormat,TescasesID_Column,"TC_ SPARKLINE_TABLE_FORMAT_024",TestcaseID_Flag);
        	String TC_SPARKLINE_TABLE_FORMAT_025=getTestcaseID_Flag(TestcaseFileName,SheetName_TableFormat,TescasesID_Column,"TC_ SPARKLINE_TABLE_FORMAT_025",TestcaseID_Flag);
        	String TC_SPARKLINE_TABLE_FORMAT_026=getTestcaseID_Flag(TestcaseFileName,SheetName_TableFormat,TescasesID_Column,"TC_ SPARKLINE_TABLE_FORMAT_026",TestcaseID_Flag);
        	String TC_SPARKLINE_TABLE_FORMAT_027=getTestcaseID_Flag(TestcaseFileName,SheetName_TableFormat,TescasesID_Column,"TC_ SPARKLINE_TABLE_FORMAT_027",TestcaseID_Flag);
        	String TC_SPARKLINE_TABLE_FORMAT_028=getTestcaseID_Flag(TestcaseFileName,SheetName_TableFormat,TescasesID_Column,"TC_ SPARKLINE_TABLE_FORMAT_028",TestcaseID_Flag);
        	String TC_SPARKLINE_TABLE_FORMAT_029=getTestcaseID_Flag(TestcaseFileName,SheetName_TableFormat,TescasesID_Column,"TC_ SPARKLINE_TABLE_FORMAT_029",TestcaseID_Flag);
        	String TC_SPARKLINE_TABLE_FORMAT_030=getTestcaseID_Flag(TestcaseFileName,SheetName_TableFormat,TescasesID_Column,"TC_ SPARKLINE_TABLE_FORMAT_030",TestcaseID_Flag);
        	String TC_SPARKLINE_TABLE_FORMAT_031=getTestcaseID_Flag(TestcaseFileName,SheetName_TableFormat,TescasesID_Column,"TC_ SPARKLINE_TABLE_FORMAT_031",TestcaseID_Flag);
        	String TC_SPARKLINE_TABLE_FORMAT_032=getTestcaseID_Flag(TestcaseFileName,SheetName_TableFormat,TescasesID_Column,"TC_ SPARKLINE_TABLE_FORMAT_032",TestcaseID_Flag);
        	String TC_SPARKLINE_TABLE_FORMAT_033=getTestcaseID_Flag(TestcaseFileName,SheetName_TableFormat,TescasesID_Column,"TC_ SPARKLINE_TABLE_FORMAT_033",TestcaseID_Flag);
        	String TC_SPARKLINE_TABLE_FORMAT_034=getTestcaseID_Flag(TestcaseFileName,SheetName_TableFormat,TescasesID_Column,"TC_ SPARKLINE_TABLE_FORMAT_034",TestcaseID_Flag);
        	String TC_SPARKLINE_TABLE_FORMAT_035=getTestcaseID_Flag(TestcaseFileName,SheetName_TableFormat,TescasesID_Column,"TC_ SPARKLINE_TABLE_FORMAT_035",TestcaseID_Flag);
        	String TC_SPARKLINE_TABLE_FORMAT_036=getTestcaseID_Flag(TestcaseFileName,SheetName_TableFormat,TescasesID_Column,"TC_ SPARKLINE_TABLE_FORMAT_036",TestcaseID_Flag);
        	String TC_SPARKLINE_TABLE_FORMAT_037=getTestcaseID_Flag(TestcaseFileName,SheetName_TableFormat,TescasesID_Column,"TC_ SPARKLINE_TABLE_FORMAT_037",TestcaseID_Flag);
        	String TC_SPARKLINE_TABLE_FORMAT_038=getTestcaseID_Flag(TestcaseFileName,SheetName_TableFormat,TescasesID_Column,"TC_ SPARKLINE_TABLE_FORMAT_038",TestcaseID_Flag);
        	String TC_SPARKLINE_TABLE_FORMAT_039=getTestcaseID_Flag(TestcaseFileName,SheetName_TableFormat,TescasesID_Column,"TC_ SPARKLINE_TABLE_FORMAT_039",TestcaseID_Flag);
        	String TC_SPARKLINE_TABLE_FORMAT_040=getTestcaseID_Flag(TestcaseFileName,SheetName_TableFormat,TescasesID_Column,"TC_ SPARKLINE_TABLE_FORMAT_040",TestcaseID_Flag);
        	String TC_SPARKLINE_TABLE_FORMAT_041=getTestcaseID_Flag(TestcaseFileName,SheetName_TableFormat,TescasesID_Column,"TC_ SPARKLINE_TABLE_FORMAT_041",TestcaseID_Flag);
        	String TC_SPARKLINE_TABLE_FORMAT_042=getTestcaseID_Flag(TestcaseFileName,SheetName_TableFormat,TescasesID_Column,"TC_ SPARKLINE_TABLE_FORMAT_042",TestcaseID_Flag);
        	String TC_SPARKLINE_TABLE_FORMAT_043=getTestcaseID_Flag(TestcaseFileName,SheetName_TableFormat,TescasesID_Column,"TC_ SPARKLINE_TABLE_FORMAT_043",TestcaseID_Flag);
        	
        	setTestCaseID("");
        	verifyElementDisplayed(driver, TableFormat_Sec);
	       	click(driver,TableFormat_Sec);
	        wait(driver,"1");
	        String TableFormatSecExpand=getAttribute1(driver,TableFormatExpand,"class");
	        if(TableFormatSecExpand.contains("up")) {
	        	pass(driver,"Table Format Section is expanded When Click on it");
	        }else {
	        	fail(driver,"Table Format Section is not expanded When Click on it");
	        }
	    	 
	        setTestCaseID("TS_TABLE FORMAT_001");
	        verifyElementDisplayed(driver, TableThemeText);
	        if(verifyElementDisplayed(driver, Table_Theme_Input)) {
	        	setTestCaseID("TC_SPARKLINE_ TABLE_FORMAT_001");
	        	if(TC_SPARKLINE_TABLE_FORMAT_001.equals("Yes")) {
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
	        	
	        	setTestCaseID("TC_SPARKLINE_ TABLE_FORMAT_002");
	        	if(TC_SPARKLINE_TABLE_FORMAT_002.equals("Yes")) {
	        		click(driver,Table_Theme_Input);
	        		verifyElementIsPresent1(driver, Table_Theme_Results);
	        		
	        	}
	        	
	        	setTestCaseID("TC_SPARKLINE_ TABLE_FORMAT_003");
	        	//Here selecting the Table theme value from the input sheet and validate it is selected 
	        	if(TC_SPARKLINE_TABLE_FORMAT_003.equals("Yes")) {
	        		selectByText(driver,Table_Theme_Input,Select_TableTheme);
	   			 	wait(driver,"1");
	   			 	String AfterSelectThemeValue="";
	   			 	List<WebElement> ThemeResultValues=getWebElements(driver, Table_Theme_Results);
	   			
	   			 	for(WebElement ThemeResultValue:ThemeResultValues) {
	   			 		if(ThemeResultValue.isSelected()) {
	   			 			String SelectedClass=ThemeResultValue.getAttribute("value");
	   			 			System.out.println("SelectedClassValue "+SelectedClass);
	   			 			AfterSelectThemeValue=SelectedClass;
	   			 		}
	   			 	}
	   			 
	   			 	try {
	   			 	    Select_TableTheme=Select_TableTheme.replace(" ", "");
	   			 	}catch(Exception e) {
	   				 
	   			 	}
	   			 
	   			 	if(AfterSelectThemeValue.contains(Select_TableTheme.toLowerCase())) {
	   			 		pass(driver,"Selected Value '"+Select_TableTheme+"' is updated in the Table Theme Input");
	   			 	}else {
	   			 		fail(driver,"Selected Value '"+Select_TableTheme+"' is not updated in the Table Theme Input");
	   			 	}
	   			 	
	   			 	scrollUsingElement(driver, ApplyButton);
	   			 	click(driver, ApplyButton); //click Apply change
	   			 	elementnotvisible1(driver, RPE_Loading);
	   			 	waitForElement(driver,Table_firstRow);
				 
	   			 	String tableAppliedTheme=getAttribute1(driver, TableChart, "class");
	   			 	if(tableAppliedTheme.contains(Select_TableTheme)) {
	   			 		pass(driver,"Selected theme value applied in the Chart");
	   			 	}else {
	   			 		fail(driver,"Selected theme value not applied in the Chart");
	   			 	}
	        	}
	        	
	        }
    		setTestCaseID("TS_TABLE FORMAT_002");
        	if(isDisplayed2(driver,ODDEven_toggleTableFormat1)) {
        		setTestCaseID("TC_SPARKLINE_ TABLE_FORMAT_004");
	        	if(TC_SPARKLINE_TABLE_FORMAT_004.equals("Yes")) {
	        		if(isToggleEnable(driver,OddEven_toggle_TableFormat)) {
	   				    pass(driver,"By default, 'Odd/Even Colors' input toggle is displayed as ON");
	   				    scrollUsingElement(driver, ApplyButton);
	   				    click(driver, ApplyButton); //click Apply change
	   				    elementnotvisible1(driver, RPE_Loading);
	   				    waitForElement(driver,Table_firstRow);
	   				    String firstRowBackgroundColor=getTextBackgroundColor(driver, Table_firstRow);
	   				    String secondRowBackgroundColor=getTextBackgroundColor(driver, Table_SecondRow);
	   				    if(firstRowBackgroundColor.equalsIgnoreCase(secondRowBackgroundColor)) {
	   				    	fail(driver,"Odd/Even Colors is not applied in the Table When the toggle is in 'ON' Condition");
	   				    }else {
	   				    	pass(driver,"Odd/Even Colors is applied in the Table When the toggle is in 'ON' Condition");
	   				    }
	        		}else {
	   				 	fail(driver,"By default, 'Odd/Even Colors' input toggle is displayed as ON");
	   			 	}
	        	}
		        	
        		setTestCaseID("TC_SPARKLINE_ TABLE_FORMAT_005");
	        	if(TC_SPARKLINE_TABLE_FORMAT_005.equals("Yes")) {
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
        		fail(driver,"Odd/Even toggle is not available, unable perform the Odd/Even toggle validaion");
        	}
	        	
        	setTestCaseID("TS_TABLE FORMAT_003");
        	if(isDisplayed2(driver,FontFamily_Input_TableFormat)) {
        		verifyElementDisplayed(driver, FontFamily_Input_TableFormat);
        		verifyElementDisplayed(driver, FontFamilyText_TableFormat);
        		
        		setTestCaseID("TC_SPARKLINE_ TABLE_FORMAT_006");
	        	if(TC_SPARKLINE_TABLE_FORMAT_006.equals("Yes")) {
	        		String FontFamilyAct_TableFormat=getText1(driver,FontFamily_Input_TableFormat);
	   			 	System.out.println("FontFamilyAct_TableFormat : "+FontFamilyAct_TableFormat);
	   			 	if(FontFamilyAct_TableFormat.equals(DefaultFontFamily_TableFormat)) {
	   			 		pass(driver,"By default, '"+DefaultFontFamily_TableFormat+"' is selected in the Font Family input");
	   			 	}else {
	   			 		fail(driver,"By default, '"+DefaultFontFamily_TableFormat+"' is not selected in the Font Family input");
	   			 	}
	        	}
        		
	        	setTestCaseID("TC_SPARKLINE_ TABLE_FORMAT_007");
	        	//User should select 'Yes' for Testcase_07 then only use able to validate the testcases-08 TO 10
	        	if(TC_SPARKLINE_TABLE_FORMAT_007.equals("Yes")) {
	        		click(driver,FontFamily_Input_TableFormat);
	    			if(isDisplayed2(driver,FontFamilyExpand_TableFormat)) {
	    				pass(driver,"FontFamily dropdown is expanded with results after click on it");
	    				
	    				setTestCaseID("TC_SPARKLINE_ TABLE_FORMAT_010");
	    				if(TC_SPARKLINE_TABLE_FORMAT_010.equals("Yes")) {
	    					ScrollBarValidation1(driver, FontFamilyExpand_TableFormat, "FontFamily_SparkLine_TableFormat");
	    				}
	    				
	    				setTestCaseID("TC_SPARKLINE_ TABLE_FORMAT_008");
	    				if(isDisplayed2(driver, SearchInput_FontFamilyDropdown)) {
	    					setTestCaseID("TC_SPARKLINE_ TABLE_FORMAT_009");
	    					if(TC_SPARKLINE_TABLE_FORMAT_009.equals("Yes")) {
	    						pass(driver,"Search Input is present in the Fontfamily dropdown");
	    						click(driver,SearchInput_FontFamilyDropdown);
	    						sendKeys(driver,SearchInput_FontFamilyDropdown,"sdagreg");
	    						wait(driver,"1");
	    						if(isDisplayed2(driver, NoResultsFound)) {
	    							pass(driver,"'No results found' is displayed for invalid inputs");
	    						}else {
	    							fail(driver,"'No results found' is not displayed for invalid inputs");
	    						}
	    						clear1(driver,SearchInput_FontFamilyDropdown);
	    					}
	    					
	    					setTestCaseID("TC_SPARKLINE_ TABLE_FORMAT_008");
	    					if(TC_SPARKLINE_TABLE_FORMAT_008.equals("Yes")) {
	    						sendKeys(driver,SearchInput_FontFamilyDropdown,Select_FontFamily_TableFormat);
	    						wait(driver,"1");
	    						String FirstFontFamilyResult=getText1(driver,FontFamilyResult1);
	    						if(FirstFontFamilyResult.equals(Select_FontFamily_TableFormat)) {
	    							pass(driver,"Search functions works properly in the font family results");
	    						}else {
	    							fail(driver,"Search functions not working properly in the font family results");
	    						}
	    						
	    						selectFontFamily(driver,Select_FontFamily_TableFormat);
	    						scrollUsingElement(driver, ApplyButton);
	    						click(driver, ApplyButton);
	    						elementnotvisible1(driver, RPE_Loading);
	    						waitForElement(driver,TableChart);
	    						String FonFamilyApplied_Table=getFontFamily(driver,TableChart);
	    						System.out.println("FonFamilyApplied_Table : "+FonFamilyApplied_Table);
	    						if(FonFamilyApplied_Table.contains(Select_FontFamily_TableFormat)) {
	    							pass(driver,"Selected Font Family is applied in the table chart");
	    						}else {
	    							fail(driver,"Selected Font Family is not applied in the table chart, Exp : "+Select_FontFamily_TableFormat+", Act : "+FonFamilyApplied_Table);
	    						}
	    						
	    					}
	    				}else {
	    					fail(driver,"Search input is not present, unable to Validate the Search input functionality");
	    				}
	    				
	    			}else {
	    				fail(driver,"FontFamily dropdown is not expanded with results after click on it");
	    			}
	        	}
        	}else {
        		fail(driver,"Font Family input is not available, unable to perform the Validations");
        	}
        	
        	setTestCaseID("TS_TABLE FORMAT_004");
        	if(isDisplayed2(driver,FontSizeInput_TableFormat)) {
        		setTestCaseID("TC_SPARKLINE_ TABLE_FORMAT_011");
				if(TC_SPARKLINE_TABLE_FORMAT_011.equals("Yes")) {
					String defaultFontSizeHeader=getTextJavascript(driver, FontSizeInput_TableFormat);
					System.out.println("defaultFontSizeHeader : "+defaultFontSizeHeader);
					if(DefaultFontSize_TableFormat.equals(defaultFontSizeHeader)) {
						pass(driver,"Predefined fontsize value '"+DefaultFontSize_TableFormat+"' is updated by default in the Font Size input");
					}else {
						fail(driver,"Predefined fontsize value '"+DefaultFontSize_TableFormat+"' is not updated by default in the Font Size input");
					}
				}
				
				setTestCaseID("TC_SPARKLINE_ TABLE_FORMAT_012");
				if(TC_SPARKLINE_TABLE_FORMAT_012.equals("Yes")) {
					if(isToggleAccessible(driver,FontSizeInput_TableFormat)) {
						pass(driver,"Header Font Size input is Accessible");
						click(driver,FontSizeInput_TableFormat);
						List<WebElement> fonSizeResults=getWebElements(driver, FontSize__Results);
						int fonSizeResultsCount=fonSizeResults.size();
						if(fonSizeResultsCount==54) {
							pass(driver,"All the Font Size Values is present ");
						}else {
							fail(driver,"Some Font Size Values is not present ");
						}
						
						setTestCaseID("TC_SPARKLINE_ TABLE_FORMAT_013");
						if(TC_SPARKLINE_TABLE_FORMAT_013.equals("Yes")) {
							selectByText(driver,FontSizeInput_TableFormat,Select_FontSize_TableFormat);
							wait(driver,"1");
							String selectedFontSizeResult=getTextJavascript(driver, FontSizeInput_TableFormat);
							System.out.println("selectedFontSizeResult : "+selectedFontSizeResult);
							if(selectedFontSizeResult.equals(Select_FontSize_TableFormat)) {
								pass(driver,"Selected Font size value updated in the Header FontSize input");
							}else {
								fail(driver,"Selected Font size value is not updated in the Header FontSize input");
							}
							
							scrollUsingElement(driver, ApplyButton);
							wait(driver,"1");
							click(driver, ApplyButton);
							elementnotvisible1(driver, RPE_Loading);
							waitForElement(driver,TableChart);
							String AppliedFontSize_TableHeader=getFontSize(driver, TableHeaderRow);
							if(AppliedFontSize_TableHeader.equals(Select_FontSize_TableFormat)) {
								pass(driver,"Selected Font Size is updated in the Header rows in the resulting Table");
							}else {
								fail(driver,"Selected Font Size is not updated in the Header rows in the resulting Table");
							}
						}
						
					}else {
						fail(driver,"Header Font Size input is not Accessible");
					}
				}
				
        	}else {
        		fail(driver,"Font Size Input is not present, unable perform font family validation");
        	}
        	
        	setTestCaseID("TS_TABLE FORMAT_005");
        	if(isDisplayed2(driver,HeaderColorInput_TableFormat)) {
        		setTestCaseID("TC_SPARKLINE_ TABLE_FORMAT_014");
				if(TC_SPARKLINE_TABLE_FORMAT_014.equals("Yes")) {
					String defaultHeaderColorAct=getTextJavascript(driver,HeaderColorInput_TableFormat);
					System.out.println("defaultHeaderColorAct : "+defaultHeaderColorAct);
					if(DefaultHeaderColor_TableFormat.equalsIgnoreCase(defaultHeaderColorAct)) {
						pass(driver,"By default '"+DefaultHeaderColor_TableFormat+"' color is selected in the Header Color Input");
					}else {
						fail(driver,"By default '"+DefaultHeaderColor_TableFormat+"' color is not selected in the Header Color Input");
					}
				}
        		
				setTestCaseID("TC_SPARKLINE_ TABLE_FORMAT_015");
				if(TC_SPARKLINE_TABLE_FORMAT_015.equals("Yes")) {
					click(driver,HeaderColorInput_TableFormat);
					action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
					sendKeys(driver,HeaderColorInput_TableFormat,Change_HeaderColor_TableFormat);
					wait(driver,"1");
					click(driver,HeaderColorText_TableFormat);
					String SelectedHeaderColorValue=getTextBackgroundColor(driver, HeaderColorInput_Pointer);
					if(SelectedHeaderColorValue.equalsIgnoreCase(Change_HeaderColor_TableFormat)) {
						pass(driver,"Manually Entered Color Value is updated in the Header Color input..");
					}else {
						fail(driver,"Manually Entered Color Value is not updated in the Header Color input..");
					}
			       
					setTestCaseID("TC_SPARKLINE_ TABLE_FORMAT_017");
					if(TC_SPARKLINE_TABLE_FORMAT_017.equals("Yes")) {
						scrollUsingElement(driver, ApplyButton);
						wait(driver,"1");
						click(driver, ApplyButton);
						elementnotvisible1(driver, RPE_Loading);
						String Applied_Table_HeaderColor=getTextColor(driver, SparkLineTable_Headers);
						if(Applied_Table_HeaderColor.equalsIgnoreCase(Change_HeaderColor_TableFormat)) {
							pass(driver,"Manually Entered Color Value is updated in the Table Header values");
						}else {
							fail(driver,"Manually Entered Color Value is not updated in the Table Header values");
						}
					}
					
				}
        		
				setTestCaseID("TC_SPARKLINE_ TABLE_FORMAT_016");
				if(TC_SPARKLINE_TABLE_FORMAT_016.equals("Yes")) {
					click(driver,HeaderColorInput_TableFormat);
					if(isDisplayed(driver,ColorPickerOpen)) {
						mouseOverToElement(driver, Color1);
						mouseOverToElement(driver, mouseOverColorHistory);
						String mouseOverHistoryColor=getText1(driver,mouseOverColorHistory);
						doubleClick(driver,mouseOverColorHistory);
						wait(driver,"1");
						action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
						wait(driver,"1");
						doubleClick(driver,HeaderColorInput_TableFormat);
						wait(driver,"1");
						action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
						click(driver,HeaderColorText_TableFormat);
						wait(driver,"1");
						String AfterPasteBackgroundColor=getTextBackgroundColor(driver, HeaderColorInput_Pointer);
						if(AfterPasteBackgroundColor.equalsIgnoreCase(mouseOverHistoryColor)) {
							pass(driver,"Copy Paste Color value is working fine in Header Color Input");
						}else {
							fail(driver,"Copy Paste Color value is not working fine in Header Color Input");
						}
					
						setTestCaseID("TC_SPARKLINE_ TABLE_FORMAT_017");
						if(TC_SPARKLINE_TABLE_FORMAT_017.equals("Yes")) {
							scrollUsingElement(driver, ApplyButton);
							wait(driver,"1");
							click(driver, ApplyButton);
							elementnotvisible1(driver, RPE_Loading);
							String Applied_Table_HeaderColor=getTextColor(driver, SparkLineTable_Headers);
							if(Applied_Table_HeaderColor.equalsIgnoreCase(mouseOverHistoryColor)) {
								pass(driver,"Copy pasted Color Value is updated in the Table Header values");
							}else {
								fail(driver,"Copy pasted Color Value is not updated in the Table Header values");
							}
						}
					}else {
						fail(driver,"Color picker results not opened after click on the Header Color Input");
					}
				}
        		
        	}else {
        		fail(driver,"Font Color Input is not present, unbale to perform Font color Validation");
        	}
        	
        	setTestCaseID("TS_TABLE FORMAT_006");
        	if(isDisplayed2(driver,WrapHeaded_toggle_TableFormat)) {
        		setTestCaseID("TC_SPARKLINE_ TABLE_FORMAT_018");
				if(TC_SPARKLINE_TABLE_FORMAT_018.equals("Yes")) {
					if(isToggleEnable(driver,WrapHeaders_Input_TableFormat)) {
						fail(driver,"Wrap header toggle is not displayed in 'OFF' by default");
					}else {
						pass(driver,"Wrap header toggle is displayed in 'OFF' by default");
						String TableHeaderWrapOFF_Act=getAttribute1(driver, SparkLineTable_Headers, "class");
						if(TableHeaderWrapOFF_Act.contains("header-wrap-text")) {
							fail(driver,"Table Header values are wrapped when the toggle is in the OFF Condition");
						}else {
							pass(driver,"Table Header values are not wrapped when the toggle is in the OFF Condition");
						}
					}
				}
				
				setTestCaseID("TC_SPARKLINE_ TABLE_FORMAT_019");
				if(TC_SPARKLINE_TABLE_FORMAT_019.equals("Yes")) {
					click(driver,WrapHeaded_toggle_TableFormat);
					wait(driver,"1");
					if(isToggleEnable(driver,WrapHeaders_Input_TableFormat)) {
						pass(driver,"Wrap header toggle is displayed in 'ON' After click on it");
						scrollUsingElement(driver, ApplyButton);
						click(driver, ApplyButton);
						elementnotvisible1(driver, RPE_Loading);
						String TableHeaderWrapON_Act=getAttribute1(driver, SparkLineTable_Headers, "class");
						if(TableHeaderWrapON_Act.contains("header-wrap-text")) {
							pass(driver,"Table Header values are wrapped when the toggle is in the ON Condition");
						}else {
							fail(driver,"Table Header values are not wrapped when the toggle is in the ON Condition");
						}
					}else {
						fail(driver,"Wrap header toggle is not displayed in 'ON' After click on it");
					}
				}
        	}else {
        		fail(driver,"Wrap Headers toggle is not present, unbale to perform validations");
        	}
        	
        	setTestCaseID("TS_TABLE FORMAT_007");
        	if(isDisplayed2(driver,BodyFontSize_Input_TableFormat)) {
        		setTestCaseID("TC_SPARKLINE_ TABLE_FORMAT_020");
				if(TC_SPARKLINE_TABLE_FORMAT_020.equals("Yes")) {
					String defaultBodyFontSize_Act=getTextJavascript(driver,BodyFontSize_Input_TableFormat);
	    			if(defaultBodyFontSize_Act.equals(DefaultBodyFontSize_TableFormat)) {
	    				pass(driver,"By defualt, '"+DefaultBodyFontSize_TableFormat+"' is displayed in the Body Font Size Input");
	    			}else {
	    				fail(driver,"By default,'"+DefaultBodyFontSize_TableFormat+"' is not displayed in the Body Font Size Input");
	    			}
				}
        		
				setTestCaseID("TC_SPARKLINE_ TABLE_FORMAT_021");
				if(TC_SPARKLINE_TABLE_FORMAT_021.equals("Yes")) {
					if(isToggleAccessible(driver,BodyFontSize_Input_TableFormat)) {
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
						
						setTestCaseID("TC_SPARKLINE_ TABLE_FORMAT_022");
						if(TC_SPARKLINE_TABLE_FORMAT_022.equals("Yes")) {
							selectByText(driver,BodyFontSize_Input_TableFormat,Select_BodyFontSize_TableFomat);
							wait(driver,"1");
							String selectedBodyFontSize=getTextJavascript(driver,BodyFontSize_Input_TableFormat);
							if(selectedBodyFontSize.equals(Select_BodyFontSize_TableFomat)) {
								pass(driver,"Selcted Font Size value updated in the Body Font Size Input");
							}else {
								fail(driver,"Selcted Font Size value not updated in the Body Font Size Input");
							}
							
							scrollUsingElement(driver, ApplyButton);
							click(driver, ApplyButton);
							elementnotvisible1(driver, RPE_Loading);
							waitForElement(driver,ResultTableBody);
							String AppliedTable_BodyFontSize=getFontSize(driver, FirstRowCells);
							if(AppliedTable_BodyFontSize.equals(Select_BodyFontSize_TableFomat)) {
								pass(driver,"Selected Font Size '"+Select_BodyFontSize_TableFomat+"' value Applied in the Table Body values");
							}else {
								fail(driver,"Selected Font Size '"+Select_BodyFontSize_TableFomat+"' value not Applied in the Table Body values, Act result: "+AppliedTable_BodyFontSize);
							}
						}
						
					}else {
						fail(driver,"Body Font Size Input is not Accessible");
					}
				}
        	}else {
        		fail(driver,"Body font size input is not present, unbale to perform the validation");
        	}
        	
        	setTestCaseID("TS_TABLE FORMAT_008");
        	if(isDisplayed2(driver,BorderInput_TableFormat)) {
        		setTestCaseID("TC_SPARKLINE_ TABLE_FORMAT_023");
				if(TC_SPARKLINE_TABLE_FORMAT_023.equals("Yes")) {
					String DefaultBorderType=defaultSelectedValue(driver,BorderInput_TableFormat);
					System.out.println("DefaultBorderType : "+DefaultBorderType+"  , Exp : "+DefaultBorderType_TableFormat);
					if(DefaultBorderType_TableFormat.equals(DefaultBorderType)) {
						pass(driver,"By default, 'Default' is displayed in the Border Input Field");
					}else {
						fail(driver,"By default, 'Default' is not displayed in the Border Input Field");
					}
				}
				
				setTestCaseID("TC_SPARKLINE_ TABLE_FORMAT_024");
				if(TC_SPARKLINE_TABLE_FORMAT_024.equals("Yes")) {
					click(driver,BorderInput_TableFormat);
					verifyElementIsPresent1(driver, BorderResults_TableFormat);
				}
				
				setTestCaseID("TC_SPARKLINE_ TABLE_FORMAT_025");
				if(TC_SPARKLINE_TABLE_FORMAT_025.equals("Yes")) {
					selectByText(driver,BorderInput_TableFormat,Select_Border_TableFormat);
					wait(driver,"1");
					
					String selectedBorder=defaultSelectedValue(driver,BorderInput_TableFormat);
					System.out.println("selectedBorder : "+selectedBorder);
					if(selectedBorder.equals(Select_Border_TableFormat)) {
						pass(driver,"Selcted Border value updated in the Border Input");
					}else {
						fail(driver,"Selcted Border value not updated in the Border Input");
					}
					
					scrollUsingElement(driver, ApplyButton);
					click(driver, ApplyButton);
					elementnotvisible1(driver, RPE_Loading);
					waitForElement(driver,ResultTableBody);
					String BorderValidationClass="table"+Select_Border_TableFormat.toLowerCase()+"border";
					String AppliedBorder_Table=getAttribute1(driver, TableChart, "class");
					if(AppliedBorder_Table.contains(BorderValidationClass)) {
						pass(driver,"Selected Border '"+Select_Border_TableFormat+"' value Applied in the Table Border");
					}else {
						fail(driver,"Selected Border '"+Select_Border_TableFormat+"' value not Applied in the Table Border");
					}
				}
        	}else {
        		fail(driver,"Border Input is not present, unable to perform Validations");
        	}
        	
        	setTestCaseID("TS_TABLE FORMAT_009");
        	if(isDisplayed2(driver,NegativeHighlight_toggle)) {
        		setTestCaseID("TC_SPARKLINE_ TABLE_FORMAT_026");
				if(TC_SPARKLINE_TABLE_FORMAT_026.equals("Yes")) {
					if(isToggleEnable(driver,NegativeHighlight_Input)) {
						fail(driver,"By default, Negaitve Highlight Toggle is not displayed in 'OFF' Condition");
					}else {
						pass(driver,"By default, Negaitve Highlight Toggle is displayed in 'OFF' Condition");
					}
				}
        		
				setTestCaseID("TC_SPARKLINE_ TABLE_FORMAT_027");
				if(TC_SPARKLINE_TABLE_FORMAT_027.equals("Yes")) {
					click(driver,NegativeHighlight_toggle);
					if(isToggleEnable(driver,NegativeHighlight_Input)) {
						pass(driver,"Negaitve Highlight Toggle is displayed in 'ON' Condition when click on it");
						setTestCaseID("TC_SPARKLINE_ TABLE_FORMAT_028");
						if(TC_SPARKLINE_TABLE_FORMAT_028.equals("Yes")) {
							scrollUsingElement(driver, ApplyButton);
							click(driver, ApplyButton);
							elementnotvisible1(driver, RPE_Loading);
							waitForElement(driver,ResultTableBody);
							boolean negativecell=false;							
							List<WebElement> resultTableCells=getWebElements(driver, TableCell);
							for(WebElement resultTableCell:resultTableCells) {
								String ResultCellvalue=resultTableCell.getText();
								if(ResultCellvalue.startsWith("-") && ResultCellvalue.length()>2) {
									action.moveToElement(resultTableCell).build().perform();
									String rgbFormatNegativeCell = resultTableCell.getCssValue("background-color");
									String NegativeCellBackColorAct = rgbToHex(rgbFormatNegativeCell);
									if(NegativeCellBackColorAct.equalsIgnoreCase(NegativeCellColor_TableFormat)) {
										pass(driver,"Negative value cell is highlighted when the Negative highlight toggle is 'ON' condition");
									}else {
										fail(driver,"Negative value cell is not highlighted when the Negative highlight toggle is 'ON' condition");
									}
									negativecell=true;
									break;
								}
							}
							
							if(!negativecell==true) {
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
						fail(driver,"Negaitve Highlight Toggle is not displayed in 'ON' Condition when click on it");
					}
				}
        	}else {
        		fail(driver,"Negative highlights toggle is not present, unable to perform Validation");
        	}
        	
        	setTestCaseID("TS_TABLE FORMAT_010");
        	if(isDisplayed2(driver,AlignmentLeft_TableFormat)) {
        		setTestCaseID("TC_SPARKLINE_ TABLE_FORMAT_029");
				if(TC_SPARKLINE_TABLE_FORMAT_029.equals("Yes")) {
					if(isDisplayed2(driver, Allignment_active)) {
						fail(driver,"By default Alignment is selected");
					}else {
						pass(driver,"By default Alignment is not selected");
					}
				}
        		
				setTestCaseID("TC_SPARKLINE_ TABLE_FORMAT_030");
				if(TC_SPARKLINE_TABLE_FORMAT_030.equals("Yes")) {
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
			            } else if (numericalPattern.matcher(cellText).matches()) {
			                if (!textAlign.contains("right")) {
			                	String FailedNum=ColumnValue+" : "+cellText;
			                    //System.out.println("Numerical cell not right-aligned: " + FailedNum);
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
				
				setTestCaseID("TC_SPARKLINE_ TABLE_FORMAT_031");
				if(TC_SPARKLINE_TABLE_FORMAT_031.equals("Yes")) {
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
				//	System.out.println("Cells left-aligned Validation  : ***********");
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
				//	System.out.println("Cells left-aligned  Validation end : ***********");
					if(AllLeftAlignment==false) {
						fail(driver,"Some cell valuse are not aligned left when 'Left alignment' is selected  : "+FailedLeftAllign);
					}else {
						pass(driver,"All the Cell Values are aligned left when 'Left alignment' is seleted ");
					}
					
					click(driver,AlignmentLeft_TableFormat);
					wait(driver,"1");
					SelectedAlignmentColorAct=getTextBackgroundColor(driver, AlignmentLeft_TableFormat);
					if(AlignmentSelectedColor_TableFormat.equalsIgnoreCase(SelectedAlignmentColorAct)) {
						fail(driver,"Left Alignment highlighted in grey color When deselect on it ");
					}else {
						pass(driver,"Left Alignment not highlighted in grey color When deselect on it ");
					}
					
				    // Center
					click(driver,Alignmentcenter_TableFormat);
					scrollUsingElement(driver, ApplyButton);
					click(driver, ApplyButton);
					elementnotvisible1(driver, RPE_Loading);
					SelectedAlignmentColorAct=getTextBackgroundColor(driver, Alignmentcenter_TableFormat);
					if(AlignmentSelectedColor_TableFormat.equalsIgnoreCase(SelectedAlignmentColorAct)) {
						pass(driver,"Center Alignment highlighted in grey color When click on it ");
					}else {
						fail(driver,"Center Alignment not highlighted in grey color When click on it ");
					}
					
					AllCellElements=getWebElements(driver,TableCell);
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
					click(driver,Alignmentcenter_TableFormat);
					wait(driver,"1");
					SelectedAlignmentColorAct=getTextBackgroundColor(driver, Alignmentcenter_TableFormat);
					if(AlignmentSelectedColor_TableFormat.equalsIgnoreCase(SelectedAlignmentColorAct)) {
						fail(driver,"Center Alignment highlighted in grey color When deselect on it ");
					}else {
						pass(driver,"Center Alignment not highlighted in grey color When deselect on it ");
					}
					
					//Right 
					click(driver,AlignmentRight_TableFormat);
					scrollUsingElement(driver, ApplyButton);
					click(driver, ApplyButton);
					elementnotvisible1(driver, RPE_Loading);
					SelectedAlignmentColorAct=getTextBackgroundColor(driver, AlignmentRight_TableFormat);
					if(AlignmentSelectedColor_TableFormat.equalsIgnoreCase(SelectedAlignmentColorAct)) {
						pass(driver,"Right Alignment highlighted in grey color When click on it ");
					}else {
						fail(driver,"Right Alignment not highlighted in grey color When click on it ");
					}
					
					AllCellElements=getWebElements(driver,TableCell);
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
					click(driver,AlignmentRight_TableFormat);
					wait(driver,"1");
					SelectedAlignmentColorAct=getTextBackgroundColor(driver, AlignmentRight_TableFormat);
					if(AlignmentSelectedColor_TableFormat.equalsIgnoreCase(SelectedAlignmentColorAct)) {
						fail(driver,"Right Alignment highlighted in grey color When deselect on it ");
					}else {
						pass(driver,"Right Alignment not highlighted in grey color When deselect on it ");
					}
				}
        	}else {
        		fail(driver,"Allignment not present, unable to perform Validation");
        	}
        	
        	setTestCaseID("TS_TABLE FORMAT_011");
        	if(isDisplayed2(driver,SeperatorInput_TableFormat)) {
        		setTestCaseID("TC_SPARKLINE_ TABLE_FORMAT_032");
				if(TC_SPARKLINE_TABLE_FORMAT_032.equals("Yes")) {
					String defaultSeperatorSelect=defaultSelectedValue(driver, SeperatorInput_TableFormat);
					System.out.println("defaultSeperatorSelect : "+defaultSeperatorSelect);
					if(defaultSeperatorSelect.equals("")||defaultSeperatorSelect.equals(DefaultSeperator_TableFormat)) {
						pass(driver,"By default, 'Select' is displayed in the seperater input");
					}else {
						fail(driver,"By default, 'Select' is not displayed in the seperater input");
					}
				}
        		
				setTestCaseID("TC_SPARKLINE_ TABLE_FORMAT_033");
				if(TC_SPARKLINE_TABLE_FORMAT_033.equals("Yes")) {
					click(driver,SeperatorInput_TableFormat);
				    verifyElementIsPresent(driver, SeparatorOption1);
				    verifyElementIsPresent(driver, SeperatorOption2);
				    
				    setTestCaseID("TC_SPARKLINE_ TABLE_FORMAT_034");
					if(TC_SPARKLINE_TABLE_FORMAT_034.equals("Yes")) {
						selectByText(driver, SeperatorInput_TableFormat, Select_Seperator_TableFormat);
					    wait(driver,"1");
					    String AfterSelectSeperatorValue=getTextJavascript(driver, SeperatorInput_TableFormat);
					    System.out.println("AfterSelectSeperatorValue : "+AfterSelectSeperatorValue);
					    if(AfterSelectSeperatorValue.equals(Select_Seperator_TableFormat)) {
					    	pass(driver,"Selected seperator value is correctly displayed in the Seperator Input");
					    }else {
					    	fail(driver,"Selected seperator value is not correctly displayed in the Seperator Input");
					    }
					    
					    setTestCaseID("TC_SPARKLINE_ TABLE_FORMAT_035");
						if(TC_SPARKLINE_TABLE_FORMAT_035.equals("Yes")) {
							if(verifyElementDisplayed(driver,SelectAllOption_Seperator)) {
								if(!isElementSelected(driver,SelectAllCheckBox_Seperator)) {
									pass(driver,"By default Select All checkbox is not selected");
									if(isDisplayed2(driver,AppliedSeperatorColoumn)) {
										fail(driver,"Column Names displayed in the seperator selected column when the 'Select All checkbox' is not selected");
									}else {
										pass(driver,"Column Names not displayed in the seperator selected column when the 'Select All checkbox' is not selected");
									}
								}else {
									fail(driver,"By default Select All checkbox is selected");
								}
							}
						}
						
						 setTestCaseID("TC_SPARKLINE_ TABLE_FORMAT_036");
						 if(TC_SPARKLINE_TABLE_FORMAT_036.equals("Yes")) {
							 click(driver,SeperatorSelectedColumnBox);
							 List<WebElement> availableSeperatorColoumnList=getWebElements(driver, SepertorAvailableColumns);
							 List<String> AvailableNumericals=new ArrayList<>();
							 for(WebElement list:availableSeperatorColoumnList) {
									String listText=list.getText();
									AvailableNumericals.add(listText);
							 }
							 int availableSeperatorColoumnCount=availableSeperatorColoumnList.size();
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
								 click(driver, ApplyButton);
								 elementnotvisible1(driver, RPE_Loading);
								 waitForElement(driver,TableCell);
								 List<WebElement> AllCellElements1=getWebElements(driver,TableCell);
									
								 Pattern numericalPattern1 = Pattern.compile("^(\\d{1,3}(,\\d{3})*|\\d{1,2}(,\\d{2}){2,})(\\.\\d+)?$");
								 Pattern datePattern = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");
							        
								 boolean seperatorCheck=true;
								 String FailResultSeperator="";
							        
								 for (WebElement cell : AllCellElements1) {
									 String Col_ID=cell.getAttribute("col-id");
									 String cellText = cell.getText();
									 boolean found = false;
									 for (String listItem : AvailableNumericals) {
										 if (Col_ID.contains(listItem)) {  
											 found = true;
											 break;  // Exit the loop once a match is found
										 }
									 }
									 if(found) {
										 int Explength=6;
										 if(cellText.contains(".")) {
											 Explength=10;
										 }
										 if (datePattern.matcher(cellText).matches() || cellText.equals("") || cellText.isEmpty() || cellText.equals("0")) {
											 continue;
										 } else if (numericalPattern1.matcher(cellText).matches()) {
											 if(!cellText.contains(",")&&cellText.length()>=Explength) {
												 seperatorCheck=false;
												 FailResultSeperator=FailResultSeperator+" || Column : "+Col_ID+", cellValue : "+cellText;
												 continue;
											 }
											 if(cellText.length()>=Explength) {
												 String cellFormat=SeperatorValidationTable(cellText);
												 if(!cellFormat.equals(Select_Seperator_TableFormat)) {
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
							        
								 setTestCaseID("TC_SPARKLINE_ TABLE_FORMAT_037");
								 if(TC_SPARKLINE_TABLE_FORMAT_037.equals("Yes")) {
									 click(driver,SelectAllCheckBox_Seperator);
									 wait(driver,"1");
									 if(isDisplayed2(driver,AppliedSeperatorColoumn)) {
										 fail(driver,"Column Names displayed in the seperator selected column After deSelecting 'Select All checkbox' ");
									 }else {
										 pass(driver,"Column Names not displayed in the seperator selected column After deSelecting 'Select All checkbox' ");
									 }
								 }
							 }else {
								 fail(driver,"'Select All checkbox' in the seperator is not selected after clicking it");
							 }		
						 }
					}
				}
        	}else {
        		fail(driver,"Seperator input is not present,, unable to perform validation");
        	}
        	
        	setTestCaseID("TS_TABLE FORMAT_012");
        	if(isDisplayed2(driver,RoundOffInput_TableFormat)) {
        		setTestCaseID("TC_SPARKLINE_ TABLE_FORMAT_038");
				if(TC_SPARKLINE_TABLE_FORMAT_038.equals("Yes")) {
					String defaultRoundOffSelect=defaultSelectedValue(driver, RoundOffInput_TableFormat);
					System.out.println("defaultRoundOffSelect : "+defaultRoundOffSelect);
					if(defaultRoundOffSelect.equals("")||defaultRoundOffSelect.equals(DefaultRoundOff_TableFormat)) {
						pass(driver,"By default, 'Select' is displayed in the RoundOff input");
					}else {
						fail(driver,"By default, 'Select' is not displayed in the RoundOff input");
					}
				}
				
				setTestCaseID("TC_SPARKLINE_ TABLE_FORMAT_039");
				if(TC_SPARKLINE_TABLE_FORMAT_039.equals("Yes")) {
					click(driver,RoundOffInput_TableFormat);
					List<WebElement> RoundOffInputValues=getWebElements(driver, RountOffValueOptions_TableFormat);
					int RoundOffInputValuesCount=RoundOffInputValues.size();
					String StartRoundOffInputValue=RoundOffInputValues.get(1).getText();
					int RoundOffInputValuelast=RoundOffInputValues.size()-1;
					String EndRoundOffInputValue=RoundOffInputValues.get(RoundOffInputValuelast).getText();
					
					if(RoundOffInputValuesCount==7&&StartRoundOffInputValue.equals("0")&&EndRoundOffInputValue.equals("5")) {
						pass(driver,"All the RoundOff Value options are present ");
					}else {
						fail(driver,"Some RoundOff Value options are not present ");
					}
					
					setTestCaseID("TC_SPARKLINE_ TABLE_FORMAT_040");
					if(TC_SPARKLINE_TABLE_FORMAT_040.equals("Yes")) {
						selectByText(driver, RoundOffInput_TableFormat, Select_RoundOffValue_TableFormat);
					    wait(driver,"1");
					    String AfterSelectRoundOffValue=getTextJavascript(driver, RoundOffInput_TableFormat);
					    System.out.println("AfterSelectRoundOffValue : "+AfterSelectRoundOffValue);
					    if(AfterSelectRoundOffValue.equals(Select_RoundOffValue_TableFormat)) {
					    	pass(driver,"Selected RoundOff value is correctly displayed in the RoundOff Input");
					    }else {
					    	fail(driver,"Selected RoundOff value is not correctly displayed in the RoundOff Input");
					    }
						
					    if(isDisplayed(driver,RoundOffSelectColumnBox)) {
							pass(driver,"RoundOff Selected Column box is displayed after selecting the RoundOff value");
						}else {
							fail(driver,"RoundOff Selected Column box is displayed after selecting the RoundOff value");
						}
					    
					    
						if(verifyElementDisplayed(driver,SelectAllCheckbox_RoundOff)) {
							setTestCaseID("TC_SPARKLINE_ TABLE_FORMAT_041");
							if(TC_SPARKLINE_TABLE_FORMAT_041.equals("Yes")) {
								if(!isElementSelected(driver,SelectAllCheckbox_RoundOff)) {
									pass(driver,"By default Select All checkbox is not selected in RoundOff");
									if(isDisplayed2(driver,AppliedRoundOffColumns)) {
										fail(driver,"Column Names displayed in the RoundOff selected column when the 'Select All checkbox' is not selected");
									}else {
										pass(driver,"Column Names not displayed in the RoundOff selected column when the 'Select All checkbox' is not selected");
									}
								}
							}
							
							setTestCaseID("TC_SPARKLINE_ TABLE_FORMAT_042");
							if(TC_SPARKLINE_TABLE_FORMAT_042.equals("Yes")) {
								click(driver,RoundOffSelectColumnBox);
					    		wait(driver,"1");
								List<WebElement> availableRoundOffColoumnList=getWebElements(driver, AvailableRoundOffSelectColumn);
								List<String> AvailableNumericals=new ArrayList<>();
								for(WebElement list:availableRoundOffColoumnList) {
									String listText=list.getText();
									AvailableNumericals.add(listText);
								}
								int availableRoundOffColoumnCount=availableRoundOffColoumnList.size();
								click(driver,SeperatorText_TableFormat);
								wait(driver,"1");
								mouseOverToElement(driver, SelectAllCheckbox_RoundOff);
								mouseOverAndClick(driver, SelectAllCheckbox_RoundOff);
								wait(driver,"1");
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
			                        List<WebElement> AllCellElements1=getWebElements(driver,TableCell);
									
									Pattern numericalPattern1 = Pattern.compile("^(\\d{1,3}(,\\d{3})*|\\d{1,2}(,\\d{2}){2,})(\\.\\d+)?$");
							        Pattern datePattern = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$"); // need to delete Pattern
									
							        boolean RoundOffCheck1=true;
							        String FailResultRoundOff1="";
							        
									for (WebElement cell : AllCellElements1) {
			                            String Col_ID=cell.getAttribute("col-id");
			                            boolean found = false;
			                            for (String listItem : AvailableNumericals) {
			                                if (Col_ID.contains(listItem)) {  
			                                    found = true;
			                                    break;  // Exit the loop once a match is found
			                                }
			                            }
			                            
			                            if(found) {
			                            	String cellText = cell.getText();
			                            	if (datePattern.matcher(cellText).matches() || cellText.equals("") || cellText.isEmpty() || cellText.equals("0")) {
								                continue;
								            } else if (numericalPattern1.matcher(cellText).matches()) {
								            	
								            	int CellRoundOffValueNum=getRoundOffValue(cellText);
								            	String CellRoundOffValue=String.valueOf(CellRoundOffValueNum);
								            	if(!CellRoundOffValue.equals(Select_RoundOffValue_TableFormat)) {
								            		RoundOffCheck1=false;
								            		FailResultRoundOff1=FailResultRoundOff1+" || Column : "+Col_ID+", cellValue : "+cellText;
								            	}
								            } 
			                            }
							        }
									
									if(RoundOffCheck1==true) {
										pass(driver,"RoundOff correctly Applied for all the cells");
									}else {
										fail(driver,"RoundOff not correctly Applied in this cell : "+FailResultRoundOff1);
									}
									
									setTestCaseID("TC_SPARKLINE_ TABLE_FORMAT_043");
									if(TC_SPARKLINE_TABLE_FORMAT_043.equals("Yes")) {
										click(driver,SelectAllCheckbox_RoundOff);
								        wait(driver,"1");
								        if(isDisplayed2(driver,AppliedRoundOffColumns)) {
											fail(driver,"Column Names displayed in the RoundOff selected column After deSelecting 'Select All checkbox' ");
										}else {
											pass(driver,"Column Names not displayed in the RoundOff selected column After deSelecting 'Select All checkbox' ");
										}
									}
									
								}else {
									fail(driver,"'Select All checkbox' in the RoundOff is not selected after clicking it");
								}
							}
							
						}
					
					}
				}
				
        	}else {
        		fail(driver,"RoundOff Input is not present, unable to perform Validation");
        	}
        	setTestCaseID("");
        	click(driver,TableFormat_Sec);
	        wait(driver,"1");
	        TableFormatSecExpand=getAttribute1(driver,TableFormatExpand,"class");
	        if(!TableFormatSecExpand.contains("up")) {
	        	pass(driver,"Table Format Section is closed When Click on it");
	        }else {
	        	fail(driver,"Table Format Section is not Closed When Click on it");
	        }
        	
        	
        }
		
      //*********************** SparkLine Table Format validation End ****************** 
        
      //*********************** SparkLine Format validation End ****************** 
        
        String SparkLine_Format= getCellValue("TestExecution","Testcase_Selection","SparkLine_Format",Flag);
        if(SparkLine_Format.equals("Yes")) {
        	
        	String TC_SPARKLINE_FORMAT_001=getTestcaseID_Flag(TestcaseFileName,SheetName_SparkLineFormat,TescasesID_Column,"TC_ SPARKLINE_001",TestcaseID_Flag);
        	String TC_SPARKLINE_FORMAT_002=getTestcaseID_Flag(TestcaseFileName,SheetName_SparkLineFormat,TescasesID_Column,"TC_ SPARKLINE_002",TestcaseID_Flag);
        	String TC_SPARKLINE_FORMAT_003=getTestcaseID_Flag(TestcaseFileName,SheetName_SparkLineFormat,TescasesID_Column,"TC_ SPARKLINE_003",TestcaseID_Flag);
        	String TC_SPARKLINE_FORMAT_004=getTestcaseID_Flag(TestcaseFileName,SheetName_SparkLineFormat,TescasesID_Column,"TC_ SPARKLINE_004",TestcaseID_Flag);
        	String TC_SPARKLINE_FORMAT_005=getTestcaseID_Flag(TestcaseFileName,SheetName_SparkLineFormat,TescasesID_Column,"TC_ SPARKLINE_005",TestcaseID_Flag);
        	String TC_SPARKLINE_FORMAT_006=getTestcaseID_Flag(TestcaseFileName,SheetName_SparkLineFormat,TescasesID_Column,"TC_ SPARKLINE_006",TestcaseID_Flag);
        	String TC_SPARKLINE_FORMAT_007=getTestcaseID_Flag(TestcaseFileName,SheetName_SparkLineFormat,TescasesID_Column,"TC_ SPARKLINE_007",TestcaseID_Flag);
        	String TC_SPARKLINE_FORMAT_008=getTestcaseID_Flag(TestcaseFileName,SheetName_SparkLineFormat,TescasesID_Column,"TC_ SPARKLINE_008",TestcaseID_Flag);
        	String TC_SPARKLINE_FORMAT_009=getTestcaseID_Flag(TestcaseFileName,SheetName_SparkLineFormat,TescasesID_Column,"TC_ SPARKLINE_009",TestcaseID_Flag);
        	String TC_SPARKLINE_FORMAT_010=getTestcaseID_Flag(TestcaseFileName,SheetName_SparkLineFormat,TescasesID_Column,"TC_ SPARKLINE_010",TestcaseID_Flag);
        	String TC_SPARKLINE_FORMAT_011=getTestcaseID_Flag(TestcaseFileName,SheetName_SparkLineFormat,TescasesID_Column,"TC_ SPARKLINE_011",TestcaseID_Flag);
        	String TC_SPARKLINE_FORMAT_012=getTestcaseID_Flag(TestcaseFileName,SheetName_SparkLineFormat,TescasesID_Column,"TC_ SPARKLINE_012",TestcaseID_Flag);
        	String TC_SPARKLINE_FORMAT_013=getTestcaseID_Flag(TestcaseFileName,SheetName_SparkLineFormat,TescasesID_Column,"TC_ SPARKLINE_013",TestcaseID_Flag);
        	String TC_SPARKLINE_FORMAT_014=getTestcaseID_Flag(TestcaseFileName,SheetName_SparkLineFormat,TescasesID_Column,"TC_ SPARKLINE_014",TestcaseID_Flag);
        	String TC_SPARKLINE_FORMAT_015=getTestcaseID_Flag(TestcaseFileName,SheetName_SparkLineFormat,TescasesID_Column,"TC_ SPARKLINE_015",TestcaseID_Flag);
        	String TC_SPARKLINE_FORMAT_016=getTestcaseID_Flag(TestcaseFileName,SheetName_SparkLineFormat,TescasesID_Column,"TC_ SPARKLINE_016",TestcaseID_Flag);
        	String TC_SPARKLINE_FORMAT_017=getTestcaseID_Flag(TestcaseFileName,SheetName_SparkLineFormat,TescasesID_Column,"TC_ SPARKLINE_017",TestcaseID_Flag);
        	String TC_SPARKLINE_FORMAT_018=getTestcaseID_Flag(TestcaseFileName,SheetName_SparkLineFormat,TescasesID_Column,"TC_ SPARKLINE_018",TestcaseID_Flag);
        	String TC_SPARKLINE_FORMAT_019=getTestcaseID_Flag(TestcaseFileName,SheetName_SparkLineFormat,TescasesID_Column,"TC_ SPARKLINE_019",TestcaseID_Flag);
        	String TC_SPARKLINE_FORMAT_020=getTestcaseID_Flag(TestcaseFileName,SheetName_SparkLineFormat,TescasesID_Column,"TC_ SPARKLINE_020",TestcaseID_Flag);
        	String TC_SPARKLINE_FORMAT_021=getTestcaseID_Flag(TestcaseFileName,SheetName_SparkLineFormat,TescasesID_Column,"TC_ SPARKLINE_021",TestcaseID_Flag);
        	String TC_SPARKLINE_FORMAT_022=getTestcaseID_Flag(TestcaseFileName,SheetName_SparkLineFormat,TescasesID_Column,"TC_ SPARKLINE_022",TestcaseID_Flag);
        	String TC_SPARKLINE_FORMAT_023=getTestcaseID_Flag(TestcaseFileName,SheetName_SparkLineFormat,TescasesID_Column,"TC_ SPARKLINE_023",TestcaseID_Flag);
        	String TC_SPARKLINE_FORMAT_024=getTestcaseID_Flag(TestcaseFileName,SheetName_SparkLineFormat,TescasesID_Column,"TC_ SPARKLINE_024",TestcaseID_Flag);
        	String TC_SPARKLINE_FORMAT_025=getTestcaseID_Flag(TestcaseFileName,SheetName_SparkLineFormat,TescasesID_Column,"TC_ SPARKLINE_025",TestcaseID_Flag);
        	String TC_SPARKLINE_FORMAT_026=getTestcaseID_Flag(TestcaseFileName,SheetName_SparkLineFormat,TescasesID_Column,"TC_ SPARKLINE_026",TestcaseID_Flag);
        	String TC_SPARKLINE_FORMAT_027=getTestcaseID_Flag(TestcaseFileName,SheetName_SparkLineFormat,TescasesID_Column,"TC_ SPARKLINE_027",TestcaseID_Flag);
        	String TC_SPARKLINE_FORMAT_028=getTestcaseID_Flag(TestcaseFileName,SheetName_SparkLineFormat,TescasesID_Column,"TC_ SPARKLINE_028",TestcaseID_Flag);
        	String TC_SPARKLINE_FORMAT_029=getTestcaseID_Flag(TestcaseFileName,SheetName_SparkLineFormat,TescasesID_Column,"TC_ SPARKLINE_029",TestcaseID_Flag);

  
        	setTestCaseID("TC_SPARKLINE_FORMAT_001");
        	if(TC_SPARKLINE_FORMAT_001.equals("Yes")) {
        		click(driver,SparkLine_FormatSec);
    	        wait(driver,"1");
    	        String SparklinFormatSecExpand=getAttribute1(driver,SparkLine_Expand,"class");
    	        if(SparklinFormatSecExpand.contains("up")) {
    	        	pass(driver,"SparkLine Format Section is expanded When Click on it");
    	        	
    	        	setTestCaseID("Ts_SPARKLINE_FORMAT_002");
    	        	if(verifyElementDisplayed(driver, ColorStyling)) {
    	        		setTestCaseID("TC_SPARKLINE_FORMAT_002");
    	            	if(TC_SPARKLINE_FORMAT_002.equals("Yes")) {
    	            		String ColorStylingSecExpand=getAttribute1(driver,ColorStylingExpand,"class");
    	            		if(ColorStylingSecExpand.contains("up")) {
    	            			pass(driver,"Color Styling is Expanded by default");
    	            		}else {
    	            			fail(driver,"Color Stylinng is not expanded by default");
    	            			click(driver,ColorStyling);
    	            		}
    	            	}
    	            	setTestCaseID("TC_SPARKLINE_FORMAT_003");
    	            	if(TC_SPARKLINE_FORMAT_003.equals("Yes")) {
    	            		verifyElementDisplayed(driver, Chart_Theme_ColorStyling);
    	            		verifyElementDisplayed(driver, ChartTheme_Text);
    	            	}
    	            	
    	            	if(isDisplayed(driver, Chart_Theme_ColorStyling)) {
    	            		setTestCaseID("TC_SPARKLINE_FORMAT_004");
    	            		if(TC_SPARKLINE_FORMAT_004.equals("Yes")) {
    	            			String defaultChartTheme=getText(driver,Chart_Theme_ColorStyling);
    	            			if(defaultChartTheme.equals("Default")) {
    	            				pass(driver,"By default, 'Default' is selected in the Chart Theme input");
    	            			}else {
    	            				fail(driver,"By default, 'Default' is not selected in the Chart Theme input");
    	            			}
    	            		}
    	            		
    	            		setTestCaseID("TC_SPARKLINE_FORMAT_005");
    	            		if(TC_SPARKLINE_FORMAT_005.equals("Yes")) {
    	            			click(driver,Chart_Theme_ColorStyling);
    	            			if(verifyElementDisplayed(driver, ChartTheme_Results_ColorStyle)) {
    	            				setTestCaseID("TC_SPARKLINE_FORMAT_008");
    	            				if(TC_SPARKLINE_FORMAT_008.equals("Yes")) {
    	            					ScrollBarValidation1(driver, ChartTheme_Results_ColorStyle, "ChartTheme_SparkLine_Format");
    	            				}
    	            				setTestCaseID("TC_SPARKLINE_FORMAT_006");
    	            				if(verifyElementDisplayed(driver, dropdownInputsearchBox)) {
    	            					setTestCaseID("TC_SPARKLINE_FORMAT_007");
        	            				if(TC_SPARKLINE_FORMAT_007.equals("Yes")) {
        	            					click(driver,dropdownInputsearchBox);
        									sendKeys(driver,dropdownInputsearchBox,"afghjku");
        									if(isDisplayed2(driver,NoResultsFound)) {
        										pass(driver,"'No Results found' message is displayed in while searching invalid value in the Chart Theme dropdown input");
        									}else {
        										fail(driver,"'No Results found' message is not displayed in while searching invalid value in the Chart Theme dropdown input");
        									}
        									
        									clear1(driver,dropdownInputsearchBox);
        									wait(driver,"1");
        									if(isDisplayed2(driver,NoResultsFound)){
        										fail(driver,"Column List are not displayed after clear the search input in the Chart Theme dropdown");
        									}else {
        										pass(driver,"Column List are displayed after clear the search input in the Chart Theme dropdown");
        									}
        	            				}
        	            				
        	            				setTestCaseID("TC_SPARKLINE_FORMAT_006");
        	            				if(TC_SPARKLINE_FORMAT_006.equals("Yes")) {
        	            					sendKeys(driver,dropdownInputsearchBox,Select_ChartTheme_ColorStyling);
        	            					String FirstResult=getAttribute1(driver,FirstSearchedvalue,"title");
        		    						if(FirstResult.equals(Select_ChartTheme_ColorStyling)) {
        		    							pass(driver,"Search functions works properly in the Chart Theme results");
        		    						}else {
        		    							fail(driver,"Search functions not working properly in the Chart Theme results");
        		    						}
        	            				}
    	            				}
    	            				
    	            				setTestCaseID("TC_SPARKLINE_FORMAT_009");
    	            				if(TC_SPARKLINE_FORMAT_009.equals("Yes")) {
    	            					selectChartTheme(driver, Select_ChartTheme_ColorStyling);
    	            					scrollUsingElement(driver, ApplyButton);
    	            	   			 	click(driver, ApplyButton); 
    	            	   			 	elementnotvisible1(driver, RPE_Loading);
    	            	   			 	//bending
    	            				}
    	            				
    	            			}
    	            		}
    	            	}else {
    	            		fail(driver,"Chart Theme is not present");
    	            	}
    	        	}
    	        	setTestCaseID("TS_SPARKLINE_FORMAT_003");
    	        	if(verifyElementDisplayed(driver, EnableValue_SparkLine)) {
    	        		setTestCaseID("TC_SPARKLINE_FORMAT_010");
        				if(TC_SPARKLINE_FORMAT_010.equals("Yes")) {
        					if(isToggleEnable(driver, EnableValue_Inputtoggle_SparkLine)) {
        						fail(driver,"By default, 'Enable Value' toggle is enabled");
        					}else {
        						pass(driver,"By default, 'Enable Value' toggle is disabled");
        						setTestCaseID("TC_SPARKLINE_FORMAT_011");
                				if(TC_SPARKLINE_FORMAT_011.equals("Yes")) {
                					if(IsElementEnabled(driver, SeperatorInput_SparkLine)) {
                						fail(driver,"Seperator input is Accessible when the Enable value toggle is disabled");
                					}else {
                						pass(driver,"Seperator input is not Accessible when the Enable value toggle is disabled");
                					}
                					
                					if(IsElementEnabled(driver, RoundOffInput_SparkLine)) {
                						fail(driver,"RoundOff input is Accessible when the Enable value toggle is disabled");
                					}else {
                						pass(driver,"RoundOff input is not Accessible when the Enable value toggle is disabled");
                					}
                					
                					if(IsElementEnabled(driver, BigNumberSuffix_InputToggle)) {
                						fail(driver,"BigNumber Suffix input is Accessible when the Enable value toggle is disabled");
                					}else {
                						pass(driver,"BigNumber Suffix input is not Accessible when the Enable value toggle is disabled");
                					}
                					
                					if(isDisplayed(driver, LabelFormatingDisabled)) {
                						pass(driver,"Label Formating input is not Accessible when the Enable value toggle is disabled");
                					}else {
                						fail(driver,"Label Formating input is Accessible when the Enable value toggle is disabled");
                					}
                					
                				}
        						
        					}
        				}
        				
        				setTestCaseID("TC_SPARKLINE_FORMAT_012");
        				if(TC_SPARKLINE_FORMAT_012.equals("Yes")) {
        					click(driver,EnableValue_Toggle_SparkLine);
        					if(isToggleEnable(driver, EnableValue_Inputtoggle_SparkLine)) {
        						pass(driver,"Enable Value toggle is enabled When click on it");
        						
        						setTestCaseID("TC_SPARKLINE_FORMAT_013");
                				if(TC_SPARKLINE_FORMAT_013.equals("Yes")) {
                					String defaultSeperatorSparkLine=defaultSelectedValue(driver, SeperatorInput_SparkLine);
                					if(defaultSeperatorSparkLine.equals("")||defaultSeperatorSparkLine.equals("Select")) {
                						pass(driver,"By default, Select is displayed in the Seperator input");
                					}else {
                						fail(driver,"By default, Select is not displayed in the Seperator input");
                					}
                				}
                				
                				setTestCaseID("TC_SPARKLINE_FORMAT_014");
                				if(TC_SPARKLINE_FORMAT_014.equals("Yes")) {
                					if(isToggleAccessible(driver, SeperatorInput_SparkLine)) {
                						pass(driver,"Seperator input is Accessible");
                					}else {
                						fail(driver,"Seperator input is not Accessible");
                					}
                				}
                				
                				setTestCaseID("TC_SPARKLINE_FORMAT_015");
                				if(TC_SPARKLINE_FORMAT_015.equals("Yes")) {
                					selectByText(driver, SeperatorInput_SparkLine, Select_Seperator_SparkLine);
                					wait(driver,"1");
                					String SeperatorSelected=defaultSelectedValue(driver, SeperatorInput_SparkLine);
                					if(SeperatorSelected.equals(Select_Seperator_SparkLine)) {
                						pass(driver,Select_Seperator_SparkLine+" is selected Successfully in the Seperator input");
                					}else {
                						fail(driver,Select_Seperator_SparkLine+" is not selected Successfully in the Seperator input");
                					}
                					
                					//Chart Validation unable to perform...
                				}
        						
        						
                				setTestCaseID("TC_SPARKLINE_FORMAT_016");
                				if(TC_SPARKLINE_FORMAT_016.equals("Yes")) {
                					String defaultRoundOfffSparkLine=defaultSelectedValue(driver, RoundOffInput_SparkLine);
                					if(defaultRoundOfffSparkLine.equals("")||defaultRoundOfffSparkLine.equals("Select")) {
                						pass(driver,"By default, Select is displayed in the RoundOff input");
                					}else {
                						fail(driver,"By default, Select is not displayed in the RoundOff input");
                					}
                				}
                				setTestCaseID("TC_SPARKLINE_FORMAT_017");
                				if(TC_SPARKLINE_FORMAT_017.equals("Yes")) {
                					if(isToggleAccessible(driver, RoundOffInput_SparkLine)) {
                						pass(driver,"RoundOff input is Accessible");
                					}else {
                						fail(driver,"RoundOff input is not Accessible");
                					}
                				}
                				
                				setTestCaseID("TC_SPARKLINE_FORMAT_018");
                				if(TC_SPARKLINE_FORMAT_018.equals("Yes")) {
                					selectByText(driver, RoundOffInput_SparkLine, Select_RoundOff_SparkLine);
                					wait(driver,"1");
                					String RoundOffSelected=defaultSelectedValue(driver, RoundOffInput_SparkLine);
                					if(RoundOffSelected.equals(Select_RoundOff_SparkLine)) {
                						pass(driver,Select_RoundOff_SparkLine+" is selected Successfully in the RoundOff input");
                					}else {
                						fail(driver,Select_RoundOff_SparkLine+" is not selected Successfully in the RoundOff input");
                					}
                					
                					//Chart Validation unable to perform..
                				}
                				
                				setTestCaseID("TC_SPARKLINE_FORMAT_019");
                				if(TC_SPARKLINE_FORMAT_019.equals("Yes")) {
                					selectByText(driver, SeperatorInput_SparkLine, Select_Seperator_SparkLine);
                					click(driver,ApplyButton);
                					elementnotvisible1(driver, RPE_Loading);
                					if(isToggleEnable(driver, BigNumberSuffix_InputToggle)) {
                						fail(driver,"BigNumber Suffix toggle is accessible When the Seperator is selected");
                					}else {
                						pass(driver,"BigNumber Suffix toggle is not accessible when the Seperator is selected");
                					}
                				}
                				
                				setTestCaseID("TC_SPARKLINE_FORMAT_020");
                				if(TC_SPARKLINE_FORMAT_020.equals("Yes")) {
                					selectByText(driver, SeperatorInput_SparkLine, "Select");
                					click(driver,ApplyButton);
                					elementnotvisible1(driver, RPE_Loading);
                					if(isToggleAccessible(driver, BigNumberSuffix_InputToggle)) {
                						pass(driver,"BigNumber Suffix toggle is accessible When the Seperator is not selected");
                						setTestCaseID("TC_SPARKLINE_FORMAT_021");
                        				if(TC_SPARKLINE_FORMAT_021.equals("Yes")) {
                        					click(driver,BigNumberSuffix_toggle);
                        					wait(driver,"1");
                        					if(isToggleEnable(driver, BigNumberSuffix_InputToggle)) {
                        						pass(driver,"BigNumber Suffix toggle is enabled Successfully after click on it");
                        					}else {
                        						fail(driver,"BigNumber Suffix toggle is not enabled Successfully after click on it");
                        					}
                        					
                        					//Unable to perform sparkline chart Validation
                        				}
                						
                					}else {
                						fail(driver,"BigNumber Suffix toggle is not accessible when the Seperator is not selected");
                					}
                				}
                				
                				setTestCaseID("TC_SPARKLINE_FORMAT_022");
                				if(TC_SPARKLINE_FORMAT_022.equals("Yes")) {
                					if(isToggleAccessible(driver, LabelFormating_SparkLine)) {
                						pass(driver,"Label Formating is Accessble When the enable Value toggle is enabled");
                					}else {
                						fail(driver,"Label Formating is not Accessble When the enable Value toggle is enabled");
                					}
                				}
                				setTestCaseID("TC_SPARKLINE_FORMAT_023");
                				if(TC_SPARKLINE_FORMAT_023.equals("Yes")) {
                					if(verifyElementDisplayed(driver, Bold_LabelFormating)) {
                						click(driver,Bold_LabelFormating);
                						wait(driver,"1");
                						String boldSelected=getAttribute1(driver, Bold_LabelFormating, "class");
                						if(boldSelected.contains("active")) {
                							pass(driver,"Bold is selected When Click on it");
                						}else {
                							fail(driver,"Bold is not Selected When click on it");
                						}
                						//Unable to perform SparkLine Chart validation
                					}
                					
                					if(verifyElementDisplayed(driver, Italic_LabelFormating)) {
                						click(driver,Italic_LabelFormating);
                						wait(driver,"1");
                						String ItalicSelected=getAttribute1(driver, Italic_LabelFormating, "class");
                						if(ItalicSelected.contains("active")) {
                							pass(driver,"Italic is selected When Click on it");
                						}else {
                							fail(driver,"Italic is not Selected When click on it");
                						}
                						//Unable to perform SparkLine Chart validation
                					}
                				}
                				
        					}else {
        						fail(driver,"Enable Value toggle is not enabled When click on it");
        					}
        				}
    	        	}
    	        
    	        	setTestCaseID("TC_SPARKLINE_FORMAT_024");
    				if(TC_SPARKLINE_FORMAT_024.equals("Yes")) {
    					if(verifyElementDisplayed(driver, FontColor_Input)) {
        	        		String defaultFontColorAct=getTextJavascript(driver,FontColor_Input);
        					System.out.println("defaultHeaderColorAct : "+defaultFontColorAct);
        					if(defaultFontColorAct.equalsIgnoreCase("#000000")) {
        						pass(driver,"By default '#000000' color is selected in the Header Color Input");
        					}else {
        						fail(driver,"By default '#000000' color is not selected in the Header Color Input");
        					}
        					
        					click(driver,FontColor_Input);
        					action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        					sendKeys(driver,FontColor_Input,Change_FontColor_SparkLine);
        					wait(driver,"1");
        					String SelectedFontColorValue=getTextBackgroundColor(driver, FontColor_InputPointer);
        					if(SelectedFontColorValue.equalsIgnoreCase(Change_FontColor_SparkLine)) {
        						pass(driver,"Manually Entered Color Value is updated in the Font Color input..");
        					}else {
        						fail(driver,"Manually Entered Color Value is not updated in the Font Color input..");
        					}
        					//unable to perform chart validation
        	        	}
    				}
    	        	
    				setTestCaseID("TC_SPARKLINE_FORMAT_025");
    				if(TC_SPARKLINE_FORMAT_025.equals("Yes")) {
    					if(isToggleEnable(driver, Cursor_inputToggle_SparkLine)) {
    						fail(driver, "By default Cursor input toggle is enabled");
    					}else {
    						pass(driver,"By default Cursor input toggle is disabled");
    					}
    					
    					//Unable to perform the SparkLine chart validations
    				}
    				setTestCaseID("TC_SPARKLINE_FORMAT_027");
    				if(TC_SPARKLINE_FORMAT_027.equals("Yes")) {
    					click(driver,Cursor_Toggle_SparkLine);
    					if(isToggleEnable(driver, Cursor_inputToggle_SparkLine)) {
    						pass(driver, "Cursor input toggle is enabled when click on it");
    					}else {
    						fail(driver,"Cursor input toggle is not enabled when click on it");
    					}
    					
    					//unable to perform sparkLine chart validation
    				}
    	        	
    				if(isDisplayed(driver,PointOfInterest_sec)) {
    					setTestCaseID("TC_SPARKLINE_FORMAT_028");
        				if(TC_SPARKLINE_FORMAT_028.equals("Yes")) {
        					if(verifyElementDisplayed(driver, FirstPOI_ColorInput)) {
        						String defaultColor=getTextJavascript(driver,FirstPOI_ColorInput);
        						if(defaultColor.equalsIgnoreCase("#ccffcc")) {
        							pass(driver,"By default, '#ccffcc' is displayed in First color input");
        						}else {
        							fail(driver,"By default, '#ccffcc' is not displayed in First color input");
        						}
        					}
        					
        					if(verifyElementDisplayed(driver, MinPOI_ColorInput)) {
        						String defaultColor=getTextJavascript(driver,MinPOI_ColorInput);
        						if(defaultColor.equalsIgnoreCase("#ccffcc")) {
        							pass(driver,"By default, '#ccffcc' is displayed in Min color input");
        						}else {
        							fail(driver,"By default, '#ccffcc' is not displayed in Min color input");
        						}
        					}
        					
        					if(verifyElementDisplayed(driver, LastPOI_ColorInput)) {
        						String defaultColor=getTextJavascript(driver,LastPOI_ColorInput);
        						if(defaultColor.equalsIgnoreCase("#ccffcc")) {
        							pass(driver,"By default, '#ccffcc' is displayed in Last color input");
        						}else {
        							fail(driver,"By default, '#ccffcc' is not displayed in Last color input");
        						}
        					}
        					
        					if(verifyElementDisplayed(driver, MaxPOI_ColorInput)) {
        						String defaultColor=getTextJavascript(driver,MaxPOI_ColorInput);
        						if(defaultColor.equalsIgnoreCase("#ccffcc")) {
        							pass(driver,"By default, '#ccffcc' is displayed in Max color input");
        						}else {
        							fail(driver,"By default, '#ccffcc' is not displayed in Max color input");
        						}
        					}
        					
        				}
        				
        				setTestCaseID("TC_SPARKLINE_FORMAT_029");
        				if(TC_SPARKLINE_FORMAT_029.equals("Yes")) {
        					if(isDisplayed2(driver,FirstPOI_ColorInput)) {
        						click(driver,FirstPOI_ColorInput);
            					action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
            					sendKeys(driver,FirstPOI_ColorInput,Change_FirstPOIColor_SparkLine);
            					wait(driver,"1");
            					String SelectedColorValue=getTextBackgroundColor(driver, FirstPOI_ColorPointer);
            					if(SelectedColorValue.equalsIgnoreCase(Change_FirstPOIColor_SparkLine)) {
            						pass(driver,"Manually Entered Color Value is updated in the First Color input..");
            					}else {
            						fail(driver,"Manually Entered Color Value is not updated in the First Color input..");
            					}
            					Escape(driver);
        					}else {
        						fail(driver,"First Color input is not present");
        					}
        					
        					if(isDisplayed2(driver,MinPOI_ColorInput)) {
        						click(driver,MinPOI_ColorInput);
        						wait(driver,"1");
            					action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
            					wait(driver,"1");
            					sendKeys(driver,MinPOI_ColorInput,Change_MinPOIColor_SparkLine);
            					wait(driver,"1");
            					String SelectedColorValue=getTextBackgroundColor(driver, MinPOI_ColorInputPointer);
            					if(SelectedColorValue.equalsIgnoreCase(Change_MinPOIColor_SparkLine)) {
            						pass(driver,"Manually Entered Color Value is updated in the Min Color input..");
            					}else {
            						fail(driver,"Manually Entered Color Value is not updated in the Min Color input..");
            					}
            					Escape(driver);
        					}else {
        						fail(driver,"Min Color input is not present");
        					}
        					
        					if(isDisplayed2(driver,LastPOI_ColorInput)) {
        						click(driver,LastPOI_ColorInput);
            					action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
            					sendKeys(driver,LastPOI_ColorInput,Change_LastPOIColor_SparkLine);
            					wait(driver,"1");
            					String SelectedColorValue=getTextBackgroundColor(driver, LastPOI_ColorInputPointer);
            					if(SelectedColorValue.equalsIgnoreCase(Change_LastPOIColor_SparkLine)) {
            						pass(driver,"Manually Entered Color Value is updated in the Last Color input..");
            					}else {
            						fail(driver,"Manually Entered Color Value is not updated in the Last Color input..");
            					}
            					Escape(driver);
        					}else {
        						fail(driver,"Last Color input is not present");
        					}
        					
        					if(isDisplayed2(driver,MaxPOI_ColorInput)) {
        						click(driver,MaxPOI_ColorInput);
        						wait(driver,"1");
            					action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
            					wait(driver,"1");
            					sendKeys(driver,MaxPOI_ColorInput,Change_MaxPOIColor_SparkLine);
            					wait(driver,"1");
            					String SelectedColorValue=getTextBackgroundColor(driver, MaxPOI_ColorInputPointer);
            					if(SelectedColorValue.equalsIgnoreCase(Change_MaxPOIColor_SparkLine)) {
            						pass(driver,"Manually Entered Color Value is updated in the Max Color input..");
            					}else {
            						fail(driver,"Manually Entered Color Value is not updated in the Max Color input..");
            					}
        					}else {
        						fail(driver,"Max Color input is not present");
        					}
        					
        					//unable to perform SparkLine Format Chart validation
        				}
        				
        				
    				}else {
    					fail(driver,"Point of interest section not present unable to perform Validation");
    				}
    				
    	        }else {
    	        	fail(driver,"SparkLine Format Section is not expanded When Click on it");
    	        }
        	}		  
        }
		
        
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
 		 sendKeys(driver,ChartTitleInput,"SparkLine Chart test");
 		 click(driver,SaveBtn_Chart);
 		 elementnotvisible1(driver, RPE_Loading);
 		 if(!isDisplayed2(driver,chartSaveError1) && isDisplayed(driver,SavedChartTitleInput)) {
 			 pass(driver,"Chart Saved Successfully");
 		 }else {
 			 fail(driver,"Chart not Saved Successfully");
 		 }	
      
 		 String AfterSaveChartTitleName=getText1(driver, SavedChartTitleName);
 		 if(AfterSaveChartTitleName.equalsIgnoreCase("SparkLine Chart test")) {
 			 pass(driver,"Same Chart Title name displayed after saved the chart ");
 		 }else {
 			 fail(driver,"Different Chart Title name displayed after saved the chart ");
 		 }
		
	}
}
