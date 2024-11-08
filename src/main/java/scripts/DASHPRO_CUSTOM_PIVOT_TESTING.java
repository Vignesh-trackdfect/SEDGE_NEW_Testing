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

public class DASHPRO_CUSTOM_PIVOT_TESTING extends Keywords{

	public void custom_pivot_testing(WebDriver driver,int iteration,String Flag) {
		
		String TestcaseFileName="DASHPRO_CUSTOM_PIVOT";
		String SheetName="CUSTOM_PIVOT_AXES";
		String Table_FormatSheetName="TABLE_FORMAT";
		String TestcaseID_Flag="Flag";
		String TescasesID_Column="TEST CASE ID";
		//Yes/No Input for Testcases Id
		String TC_CUSTOM_PIVOT_001=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _001",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_002=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _002",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_003=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _003",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_004=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _004",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_005=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _005",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_006=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _006",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_007=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _007",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_008=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _008",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_009=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _009",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_010=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _010",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_011=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _011",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_012=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _012",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_013=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _013",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_014=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _014",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_015=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _015",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_016=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _016",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_017=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _017",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_018=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _018",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_019=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _019",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_020=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _020",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_021=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _021",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_022=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _022",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_023=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _023",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_024=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _024",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_025=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _025",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_026=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _026",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_027=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _027",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_028=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _028",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_029=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _029",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_030=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _030",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_031=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _031",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_032=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _032",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_033=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _033",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_034=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _034",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_035=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _035",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_036=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _036",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_037=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _037",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_038=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _038",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_039=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _039",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_040=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _040",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_041=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _041",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_042=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _042",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_043=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _043",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_044=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _044",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_045=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _045",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_046=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _046",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_047=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _047",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_048=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _048",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_049=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _049",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_050=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _050",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_051=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _051",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_052=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _052",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_053=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _053",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_054=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _054",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_055=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _055",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_056=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _056",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_057=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _057",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_058=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _058",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_059=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _059",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_060=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _060",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_061=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _061",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_062=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _062",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_063=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _063",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_064=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _064",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_065=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _065",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_066=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _066",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_067=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _067",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_068=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _068",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_069=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _069",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_070=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _070",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_071=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _071",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_072=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _072",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_073=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _073",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_074=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _074",TestcaseID_Flag);
		String TC_CUSTOM_PIVOT_075=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_ CUSTOM PIVOT _075",TestcaseID_Flag);
			
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

		
		//Iteration Inputs
		//Axes
		String Select_Groups_Column1=Utils.getDataFromTestDataIteration(iteration,"Custom_Pivot_Widget_Testing", "Select_Groups_Column1");
		String Select_Groups_Column2=Utils.getDataFromTestDataIteration(iteration,"Custom_Pivot_Widget_Testing", "Select_Groups_Column2");
		String Select_Groups_Column3=Utils.getDataFromTestDataIteration(iteration,"Custom_Pivot_Widget_Testing", "Select_Groups_Column3");
		String Select_Values_Column1=Utils.getDataFromTestDataIteration(iteration,"Custom_Pivot_Widget_Testing", "Select_Values_Column1");
		String Select_Values_Column2=Utils.getDataFromTestDataIteration(iteration,"Custom_Pivot_Widget_Testing", "Select_Values_Column2");
		String Select_From_Value=Utils.getDataFromTestDataIteration(iteration,"Custom_Pivot_Widget_Testing", "Select_From_Value");
		String Select_To_Value=Utils.getDataFromTestDataIteration(iteration,"Custom_Pivot_Widget_Testing", "Select_To_Value");
		String Column_Rename_Input=Utils.getDataFromTestDataIteration(iteration,"Custom_Pivot_Widget_Testing", "Column_Rename_Input");
		String Column_Value_Deselect=Utils.getDataFromTestDataIteration(iteration,"Custom_Pivot_Widget_Testing", "Column_Value_Deselect");
		
		//TableFormat
		String Select_Table_Theme_Input=Utils.getDataFromTestDataIteration(iteration,"Custom_Pivot_Widget_Testing", "Select_Table_Theme_Input");
		String Select_FontFamily_Value=Utils.getDataFromTestDataIteration(iteration,"Custom_Pivot_Widget_Testing", "Select_FontFamily_Value");
		String Select_HeaderFontSize_TableFormat=Utils.getDataFromTestDataIteration(iteration,"Custom_Pivot_Widget_Testing", "Select_HeaderFontSize_TableFormat");
		String ChangeHeaderColor_TableFormat=Utils.getDataFromTestDataIteration(iteration,"Custom_Pivot_Widget_Testing", "ChangeHeaderColor_TableFormat");
		String Select_BodyFontSize_TableFormat=Utils.getDataFromTestDataIteration(iteration,"Custom_Pivot_Widget_Testing", "Select_BodyFontSize_TableFormat");
		String Select_Border_Value_TableFormat=Utils.getDataFromTestDataIteration(iteration,"Custom_Pivot_Widget_Testing", "Select_Border_Value_TableFormat");
		String Change_Seperator_Option=Utils.getDataFromTestDataIteration(iteration,"Custom_Pivot_Widget_Testing", "Change_Seperator_Option");
		String Change_RoundOff_Option=Utils.getDataFromTestDataIteration(iteration,"Custom_Pivot_Widget_Testing", "Change_RoundOff_Option");

		setTestCaseID(" ");
		Actions action=new Actions(driver);
		mouseOverToElement(driver, ADDTabPlus);
  	    mouseOverAndClick(driver, ADDTabPlus);
  	    wait(driver,"1");
  	    sendKeys(driver,newlyAddedTab,"CustomPivotTestTab1");
  	    click(driver,DashProPage);
  	    elementnotvisible1(driver, RPE_Loading);
		waitForElement(driver,ADD_widget_rightTop);
	    click(driver,ADD_widget_rightTop);
	    elementnotvisible(driver,Loading);
	    elementnotvisible1(driver, RPE_Loading);
		waitForElement(driver,WidgetPanel);
		waitForElement(driver,Sparkline_widget);
		
		setTestCaseID("TC_CUSTOM_PIVOT_001");
		if(TC_CUSTOM_PIVOT_001.equals("Yes")) {
			waitForElement(driver,Custom_Pivot_widget);
			verifyElementDisplayed(driver, Custom_Pivot_widget);
		}
		
		setTestCaseID("TC_CUSTOM_PIVOT_002");
		if(TC_CUSTOM_PIVOT_002.equals("Yes")) {
			WidgetValidation(driver,Custom_Pivot_widget,"Custom pivot");
		}
		
		setTestCaseID("TC_CUSTOM_PIVOT_003");
		if(TC_CUSTOM_PIVOT_003.equals("Yes")) {
			click(driver,Custom_Pivot_widget);
			elementnotvisible(driver, Loading);
			String widgetValue=getText1(driver,WidgetValue);
			if(widgetValue.equals("Custom pivot")) {
				pass(driver,"Custom pivot displayed as the selected Widget after click on it");
			}else {
				fail(driver,"Custom pivot not displayed as the selected Widget after click on it");
			} 
			
			String AxesExpand=getAttribute1(driver,Axes_Expand,"class");
			if(AxesExpand.contains("up")) {
				  pass(driver,"By default, Axes Section is Expanded");				 
			}else {
				  fail(driver,"By default, Axes Section is not Expanded");
				  click(driver,Axes_Expand);
			}
			
			setTestCaseID("TC_CUSTOM_PIVOT_004");
			if(TC_CUSTOM_PIVOT_004.equals("Yes")) {
				scrollUsingElement(driver, ApplyButton);
				click(driver,ApplyButton);
				if(isDisplayed2(driver,CustomPivotError)) {
					pass(driver,"'Kindly select atleast one column for groups' error is displayed When Click Apply button without selecting any value");
				}else {
					fail(driver,"'Kindly select atleast one column for groups' error is not displayed When Click Apply button without selecting any value");
				}
			}
			
			setTestCaseID("TC_CUSTOM_PIVOT_025");
			if(TC_CUSTOM_PIVOT_025.equals("Yes")) {
				if(isDisplayed2(driver,Values_Input_CustomPivot)) {
				   click(driver,Values_Input_CustomPivot);
				   if(isDisplayed(driver,Values_DropdownResults_CustomPivot)) {
					   click(driver,SecondValue);
					   click(driver,Groups_Text);
					   scrollUsingElement(driver, ApplyButton);
					   click(driver,ApplyButton);
					   if(isDisplayed2(driver,CustomPivotError)) {
							pass(driver,"'Kindly select atleast one column for groups' error is displayed When Click Apply button only providing Values input");
						}else {
							fail(driver,"'Kindly select atleast one column for groups' error is not displayed When Click Apply button Only providing Values ipnut");
						}
					    mouseOverAndClick(driver, RemoveOption);
					   
				   }else {
					   fail(driver,"Dropdown not expanded after click on it, unable to perform validation");
				   }
				}else {
					fail(driver,"Values input not present, unable to perform Validation");
				}
			}
			
			setTestCaseID("TS_CUSTOM_PIVOT_005");
			if(verifyElementDisplayed(driver, Groups_Input_CustomPivot)) {
				setTestCaseID("TC_CUSTOM_PIVOT_005");
				if(TC_CUSTOM_PIVOT_005.equals("Yes")) {
					String GroupdefaultValue=getText1(driver,Groups_Input_CustomPivot);
					if(GroupdefaultValue.equals("")||GroupdefaultValue.isEmpty()) {
						pass(driver,"By default, no column Selected in the Groups input Field");
					}else {
						fail(driver,"By default, column Selected in the Groups input Field");
					}
				}
				
				setTestCaseID("TC_CUSTOM_PIVOT_006");
				if(TC_CUSTOM_PIVOT_006.equals("Yes")) {
					click(driver,Groups_Input_CustomPivot);
					if(isDisplayed2(driver,Groups_DropdownResults_CustomPivot)) {
						pass(driver,"Group dropdown is expanded When Click on it");
						setTestCaseID("TC_CUSTOM_PIVOT_007");
						if(TC_CUSTOM_PIVOT_007.equals("Yes")) {
							List<WebElement> displayedDataImage=getWebElements(driver, dataTypeImages);
							for(WebElement dataImag:displayedDataImage) {
								String dataTypeDisplay=dataImag.getAttribute("src");
								if(dataTypeDisplay.contains("Date") || dataTypeDisplay.contains("Categorical") || dataTypeDisplay.contains("Numerical") || dataTypeDisplay.contains("Text")) {
								
								}else {
									fail(driver,"Other than Date,Categorical,Numerical and Text datatype column is displayed in the Groups dropdown");
									break;
								}
							}
						}
						
						setTestCaseID("TC_CUSTOM_PIVOT_010");
						if(TC_CUSTOM_PIVOT_010.equals("Yes")) {
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
						
						setTestCaseID("TC_CUSTOM_PIVOT_009");
						if(TC_CUSTOM_PIVOT_009.equals("Yes")) {
							List<WebElement> displayedDataImage=getWebElements(driver, dataTypeImages);
							List<WebElement> AvailableColumnList=getWebElements(driver, AvailableList);
							if(AvailableColumnList.size()==displayedDataImage.size()) {
								pass(driver,"All the available columns are displayed with data Type icon in the Groups dropdown");
							}else {
								fail(driver,"Some columns are not correctly displayed with data Type icon in the Groups dropdown");
							}
						}
						
						 setTestCaseID("TC_CUSTOM_PIVOT_013");
						 if(TC_CUSTOM_PIVOT_013.equals("Yes")) {
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
								  fail(driver,"Error displayed when Selecting multiple value in the Group dropdown");
							  }else {
								  pass(driver,"Error not displayed when Selecting multiple value in the Group dropdown");
							  }
							  
							  while(isDisplayed2(driver,RemoveOption)) {
								  WebElement RemoveSelectList=getWebElement(driver,RemoveOption);
								  action.moveToElement(RemoveSelectList).click().build().perform();
								  wait(driver,"1");
							  }

							  if(!isDisplayed2(driver,SelectedGroupValue)) {
								  pass(driver,"All the column Values are removed from the Groups input after removing all the value");
							  }else {
								  fail(driver,"Some Column Value not removed from the Groups input after removing all the value");
							  }
						 }
						
						setTestCaseID("TC_CUSTOM_PIVOT_008");
						if(TC_CUSTOM_PIVOT_008.equals("Yes")) {
							click(driver,Groups_Input_CustomPivot);
							if(verifyElementDisplayed(driver, dropdownInputsearchBox)) {
								setTestCaseID("TC_CUSTOM_PIVOT_011");
								 if(TC_CUSTOM_PIVOT_011.equals("Yes")) {
									 sendKeys(driver, dropdownInputsearchBox, Select_Groups_Column1);
									 String firstValue_=getText1(driver,FirstSearchedvalue);
									 if(firstValue_.contains(Select_Groups_Column1)) {
										 pass(driver,"Searched Value correctly displayed in the Groups dropdown");
									 }else {
										 fail(driver,"Searched Value not correctly displayed in the Groups dropdown");
									 }
									 
									 clear2(driver,dropdownInputsearchBox);
								 }
							}
						}
						 setTestCaseID("TC_CUSTOM_PIVOT_012");
						 if(TC_CUSTOM_PIVOT_012.equals("Yes")) {
							 selectDropdownValue1(driver,Select_Groups_Column1);
							 wait(driver,"1");
							 String selectedValue1=getText1(driver,SelectedGroupValue);
							 if(selectedValue1.contains(Select_Groups_Column1)) {
								 pass(driver,"Selected Columnn displayed in the Group input successfully");
							 }else {
								 fail(driver,"Selected Columnn not displayed in the Group input successfully");
							 }
							 
							 selectDropdownValue1(driver,Select_Groups_Column2);
							 selectDropdownValue1(driver,Select_Groups_Column3);
							 click(driver,Groups_Text);
							 wait(driver,"1");
							 if(isDisplayed2(driver, Groups_DropdownResults_CustomPivot)) {
								 fail(driver,"Groups dropdown not closed when select outside it");
							 }else {
								 pass(driver,"Groups dropdown closed when select outside it");
							 }
						 }
					}else {
						fail(driver,"Group dropdown is not expanded When Click on it");
					}
				}
			}
			
			setTestCaseID("TS_CUSTOM_PIVOT_006");
			if(verifyElementDisplayed(driver, Values_Input_CustomPivot)) {
				setTestCaseID("TC_CUSTOM_PIVOT_014");
				if(TC_CUSTOM_PIVOT_014.equals("Yes")) {
					String ValuesInputDefault=getText1(driver,Values_Input_CustomPivot);
					if(ValuesInputDefault.equals("")||ValuesInputDefault.isEmpty()) {
						pass(driver,"By default, no column Selected in the Values input Field");
					}else {
						fail(driver,"By default, column Selected in the Values input Field");
					}
				}
				
				setTestCaseID("TC_CUSTOM_PIVOT_015");
				if(TC_CUSTOM_PIVOT_015.equals("Yes")) {
					click(driver,Values_Input_CustomPivot);
					if(isDisplayed2(driver,Values_DropdownResults_CustomPivot)) {
						pass(driver,"Values Dropdown is expanded after click on it ");
						setTestCaseID("TC_CUSTOM_PIVOT_016");
						if(TC_CUSTOM_PIVOT_016.equals("Yes")) {
							List<WebElement> displayedDataImage=getWebElements(driver, dataTypeImages);
							for(WebElement dataImag:displayedDataImage) {
								String dataTypeDisplay=dataImag.getAttribute("src");
								if(dataTypeDisplay.contains("Date") || dataTypeDisplay.contains("Categorical") || dataTypeDisplay.contains("Numerical") || dataTypeDisplay.contains("Text")) {
								
								}else {
									fail(driver,"Other than Date,Categorical,Numerical and Text datatype column is displayed in the Values dropdown");
									break;
								}
							}
						}
						
						setTestCaseID("TC_CUSTOM_PIVOT_017");
						if(TC_CUSTOM_PIVOT_017.equals("Yes")) {
							if(isDisplayed2(driver,CategoricalColumnAxisDropdown)) {
								String Categorical1=getText1(driver,CategoricalColumnAxisDropdown);
								if(Categorical1.contains("(")) {
									pass(driver,"Unique values are displayed in the Categorical Column in the Values dropdown");
								}else {
									fail(driver,"Unique values are not displayed in the Categorical Column in the Values dropdown");
								}
							}
							
							if(isDisplayed2(driver,TextColumnAxisDropdown)) {
								String Text1=getText1(driver,TextColumnAxisDropdown);
								if(Text1.contains("(")) {
									pass(driver,"Unique values are displayed in the Text Column in the Values dropdown");
								}else {
									fail(driver,"Unique values are not displayed in the Text Column in the Values dropdown");
								}
							}
						}
						
						setTestCaseID("TC_CUSTOM_PIVOT_019");
						if(TC_CUSTOM_PIVOT_019.equals("Yes")) {
							List<WebElement> displayedDataImage=getWebElements(driver, dataTypeImages);
							List<WebElement> AvailableColumnList=getWebElements(driver, AvailableList);
							if(AvailableColumnList.size()==displayedDataImage.size()) {
								pass(driver,"All the available columns are displayed with data Type icon in the Values dropdown");
							}else {
								fail(driver,"Some columns are not correctly displayed with data Type icon in the Values dropdown");
							}
						}
						
						setTestCaseID("TC_CUSTOM_PIVOT_024");
						if(TC_CUSTOM_PIVOT_024.equals("Yes")) {
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
								  fail(driver,"Error displayed when Selecting multiple value in the Values dropdown");
							  }else {
								  pass(driver,"Error not displayed when Selecting multiple value in the Values dropdown");
							  }
							  
							  while(isDisplayed2(driver,RemoveValuesInput)) {
								  WebElement RemoveSelectList=getWebElement(driver,RemoveValuesInput);
								  action.moveToElement(RemoveSelectList).click().build().perform();
								  wait(driver,"1");
							  }

							  if(!isDisplayed2(driver,SelectedValuesInput)) {
								  pass(driver,"All the column Values are removed from the Values input after removing all the value");
							  }else {
								  fail(driver,"Some Column Value not removed from the Values input after removing all the value");
							  }
						}
						
						setTestCaseID("TC_CUSTOM_PIVOT_018");
						if(TC_CUSTOM_PIVOT_018.equals("Yes")) {
							click(driver,Values_Input_CustomPivot);
							if(verifyElementDisplayed(driver, dropdownInputsearchBox)) {
								setTestCaseID("TC_CUSTOM_PIVOT_023");
								 if(TC_CUSTOM_PIVOT_023.equals("Yes")) {
									 sendKeys(driver, dropdownInputsearchBox, "dafrfsef");
									 if(isDisplayed2(driver,NoResultsFound)) {
										 pass(driver,"'No Results found' message is displayed in while searching invalid value in the Values dropdown input");
									 }else {
										 fail(driver,"'No Results found' message is not displayed in while searching invalid value in the Values dropdown input");
									 }
									 clear2(driver,dropdownInputsearchBox);
								 }
								 
								 setTestCaseID("TC_CUSTOM_PIVOT_022");
								 if(TC_CUSTOM_PIVOT_022.equals("Yes")) {
									 sendKeys(driver, dropdownInputsearchBox, Select_Values_Column1);
									 String firstValue_=getText1(driver,FirstSearchedvalue);
									 if(firstValue_.contains(Select_Values_Column1)) {
										 pass(driver,"Searched Value correctly displayed in the Values dropdown");
										 setTestCaseID("TC_CUSTOM_PIVOT_020");
										 if(TC_CUSTOM_PIVOT_020.equals("Yes")) {
											 action.sendKeys(Keys.ENTER).build().perform();
											 String seletcedValue=getText1(driver,Values_Input_CustomPivot);
											 if(seletcedValue.contains(Select_Values_Column1)) {
												pass(driver,"searched columns get selected in Values when press'Enter key'");
											 }else {
												fail(driver,"searched columns not get selected in Values when press'Enter key'");
											 }
										 }
										 clear2(driver,dropdownInputsearchBox);
										 setTestCaseID("TC_CUSTOM_PIVOT_021");
										 if(TC_CUSTOM_PIVOT_021.equals("Yes")) {
											 sendKeys(driver, dropdownInputsearchBox, Select_Values_Column2);
											 selectDropdownValue1(driver,Select_Values_Column2);
											 String seletcedValue=getText1(driver,Values_Input_CustomPivot);
											 if(seletcedValue.contains(Select_Values_Column2)) {
												pass(driver,"Columns get selected in Values when click on searched columns");
											 }else {
												fail(driver,"Columns not get selected in Values when click on searched columns");
											 }
										 }
										 clear2(driver,dropdownInputsearchBox);
									 }else {
										 fail(driver,"Searched Value not correctly displayed in the Values dropdown");
									 }
								 }
							}
						}
						
						setTestCaseID("TC_CUSTOM_PIVOT_026");
						if(TC_CUSTOM_PIVOT_026.equals("Yes")) {
							List<WebElement> displayedAggregation=getWebElements(driver, AggregationInput);
							List<WebElement> AvailableColumnList=getWebElements(driver, AvailableList);
							if(AvailableColumnList.size()==displayedAggregation.size()) {
								pass(driver,"Aggregation options are available for all columns");
							}else {
								fail(driver,"Aggregation options are not available for all columns");
							}
						}
						
						setTestCaseID("TC_CUSTOM_PIVOT_027");
						if(TC_CUSTOM_PIVOT_027.equals("Yes")) {
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
						click(driver,Groups_Text);
						scrollUsingElement(driver,ApplyButton);
						click(driver,ApplyButton);
						elementnotvisible1(driver, RPE_Loading);
						if(isDisplayed2(driver,error)){
			    			 String errorWidget=getText1(driver,error);
				    		 if(errorWidget.contains("Please refer the logs in Logs")) {
				    			 fail(driver,"Error displayed When click Apply Button on 'Custom Pivot' Widget, Validation : "+errorWidget);
				    		 }else {
				    			 pass(driver,"Error displayed When click Apply Button on 'Custom Pivot' Widget, Validation : "+errorWidget);
				    		 }
				    		 elementnotvisible1(driver, error);
			    		 }else if(isDisplayed(driver,Tables_Chart)) {
							pass(driver,"Chart is Displayed in the Custom Pivot Widget");
						}
					}else {
						fail(driver,"Values dropdown is not expanded after click on it");
					}
				}
			}
			
			setTestCaseID("TS_CUSTOM_PIVOT_007");
			if(verifyElementDisplayed(driver, Sum_Toggle)) {
				setTestCaseID("TC_CUSTOM_PIVOT_028");
				if(TC_CUSTOM_PIVOT_028.equals("Yes")) {
					if(isToggleEnable(driver, Sum_InputToggle)) {
						fail(driver,"By default, Sum toggle is enabled");
					}else {
						pass(driver,"By default, Sum toggle is disabled");
					}
				}
				
				setTestCaseID("TC_CUSTOM_PIVOT_029");
				if(TC_CUSTOM_PIVOT_029.equals("Yes")) {
					click(driver,Sum_Toggle);
					wait(driver,"1");
					if(isToggleEnable(driver, Sum_InputToggle)) {
						pass(driver,"Sum toggle is enabled when click on it");
						scrollUsingElement(driver,ApplyButton);
						click(driver,ApplyButton);
						elementnotvisible1(driver, RPE_Loading);
						waitForElement(driver,Tables_Chart);
						if(isDisplayed(driver,TotalRow_Chart)) {
							pass(driver,"Total Column is displayed in the chart After enable the Sum toggle");
							List<WebElement> totalColumnsList=getWebElements(driver,TotalRow_Chart);
							boolean SumResult=true;
							String SumFails="";
							for(int a=1;a<=totalColumnsList.size();a++) {
								try {
									WebElement firstValues=driver.findElement(By.xpath("(//div[@col-id='"+Select_Values_Column1+"_sum' and @role='gridcell'])["+a+"]"));
									WebElement SecondValues=driver.findElement(By.xpath("(//div[@col-id='"+Select_Values_Column2+"_sum' and @role='gridcell'])["+a+"]"));
									String TotalString=totalColumnsList.get(a-1).getText();
									String FirstValueString=firstValues.getText();
									String SecondValueString=SecondValues.getText();
									int firstnum=Integer.parseInt(FirstValueString);
									int secondnum=Integer.parseInt(SecondValueString);
									int totalAct=Integer.parseInt(TotalString);
									int TotalExp=firstnum+secondnum;
									if(TotalExp!=totalAct) {
										SumResult=false;
										SumFails=SumFails+" RowNum : "+a+", Exp : "+TotalExp+", Act : "+totalAct+" ; ";
									}
								
								}catch(Exception e) {
									
								}
							}
							
							if(SumResult) {
								pass(driver,"Sum Values are correctly calculated in the chart");
							}else {
								fail(driver,"Sum Value Calculation Fialed in some Rows => "+SumFails);						
							}
						}else {
							fail(driver,"Total Column is not displayed in the chart After enable the Sum toggle");
						}
						
					}else {
						fail(driver,"Sum toggle is not enabled when click on it");
					}
				}
			}
			
			setTestCaseID("TS_CUSTOM_PIVOT_008");
			if(verifyElementDisplayed(driver, Difference_Toggle)) {
				setTestCaseID("TC_CUSTOM_PIVOT_030");
				if(TC_CUSTOM_PIVOT_030.equals("Yes")) {
					if(isToggleEnable(driver, Difference_InputToggle)) {
						fail(driver,"By default, Difference toggle is enabled");
					}else {
						pass(driver,"By default, Difference toggle is disabled");
					}
				}
				
				setTestCaseID("TC_CUSTOM_PIVOT_031");
				if(TC_CUSTOM_PIVOT_031.equals("Yes")) {
					click(driver,Difference_Toggle);
					if(isToggleEnable(driver, Difference_InputToggle)) {
						pass(driver,"Difference toggle is enabled When click on it");
						setTestCaseID("TC_CUSTOM_PIVOT_032");
						if(TC_CUSTOM_PIVOT_032.equals("Yes")) {
							if(isToggleEnable(driver, Sum_InputToggle)) {
								fail(driver,"Sum Toggle is not disabled automatically while enabling the Difference toggle");
							}else {
								pass(driver,"Sum Toggle is disabled automatically while enabling the Difference toggle");
							}
						}
						
						setTestCaseID("TC_CUSTOM_PIVOT_033");
						if(TC_CUSTOM_PIVOT_033.equals("Yes")) {
							if(verifyElementDisplayed(driver, From_input_Difference)) {
								String defaultFrom=getText1(driver, From_input_Difference);
								if(defaultFrom.equals("Select")) {
									pass(driver,"By default, 'Select' is dispalyed in 'From' input");
								}else {
									fail(driver,"By default, 'Select' is not dispalyed in 'From' input");
								}
							}
							
							if(verifyElementDisplayed(driver, To_input_Difference)) {
								String defaultTo=getText1(driver, To_input_Difference);
								if(defaultTo.equals("Select")) {
									pass(driver,"By default, 'Select' is dispalyed in 'To' input");
								}else {
									fail(driver,"By default, 'Select' is not dispalyed in 'To' input");
								}
							}
							
							setTestCaseID("TC_CUSTOM_PIVOT_034");
							if(TC_CUSTOM_PIVOT_034.equals("Yes")) {
								click(driver,From_input_Difference);
								if(isDisplayed2(driver,From_DropdownResults)) {
									pass(driver,"From dropdown Expanded with results after click on it");
									List<WebElement> displayedDataImage=getWebElements(driver, dataTypeImages);
									boolean numerical=true;
									for(WebElement dataImag:displayedDataImage) {
										String dataTypeDisplay=dataImag.getAttribute("src");
										if(!dataTypeDisplay.contains("Numerical")) {
											fail(driver,"Other than Numerical datatype column is displayed in the From dropdown");
											numerical=false;
										}
									}
									if(numerical) {
										pass(driver,"Only Numerical dataType Column is Displayed in the From dropdown");
									}
									 click(driver,SelectOption);
									 wait(driver,"1");
									 if(isDisplayed2(driver,From_DropdownResults)){
										 fail(driver,"From dropdown Results is not closed automaticaly after selecting the Value");
									 }else {
										 pass(driver,"From dropdown Results is closed automaticaly after selecting the Value");
									 }
								}else {
									fail(driver,"From dropdown is not Expanded with results after click on it");
								}
								
								click(driver,To_input_Difference);
								if(isDisplayed2(driver,To_DropdownResults)) {
									pass(driver,"To dropdown Expanded with results after click on it");
									List<WebElement> displayedDataImage=getWebElements(driver, dataTypeImages);
									boolean numerical=true;
									for(WebElement dataImag:displayedDataImage) {
										String dataTypeDisplay=dataImag.getAttribute("src");
										if(!dataTypeDisplay.contains("Numerical")) {
											fail(driver,"Other than Numerical datatype column is displayed in the To dropdown");
											numerical=false;
										}
									}
									if(numerical) {
										pass(driver,"Only Numerical dataType Column is Displayed in the To dropdown");
									}
									 click(driver,SelectOption);
									 wait(driver,"1");
									 if(isDisplayed2(driver,To_DropdownResults)){
										 fail(driver,"To dropdown Results is not closed automaticaly after selecting the Value");
									 }else {
										 pass(driver,"To dropdown Results is closed automaticaly after selecting the Value");
									 }
									
								}else {
									fail(driver,"To dropdown is not Expanded with results after click on it");
								}
							}
							
							setTestCaseID("TC_CUSTOM_PIVOT_035");
							if(TC_CUSTOM_PIVOT_035.equals("Yes")) {
								while(isDisplayed2(driver,RemoveValuesInput)) {
									WebElement RemoveSelectList=getWebElement(driver,RemoveValuesInput);
									action.moveToElement(RemoveSelectList).click().build().perform();
									wait(driver,"1");
								}
								click(driver,Values_Input_CustomPivot);
								waitForElement(driver, Values_DropdownResults_CustomPivot);
								List<WebElement> displayedDataImage=getWebElements(driver, dataTypeImages);
								for(WebElement dataImag:displayedDataImage) {
									String dataTypeDisplay=dataImag.getAttribute("src");
									if(!dataTypeDisplay.contains("Numerical")) {
										dataImag.click();
										break;
									}
								}
								click3(driver,Groups_Text);
								wait(driver,"1");
								click(driver,From_input_Difference);
								if(isDisplayed2(driver,From_DropdownResults)) {
									List<WebElement> FromResult=getWebElements(driver, From_DropdownResults);
									if(FromResult.size()==1 && FromResult.get(0).getText().equals("Select")) {
										pass(driver,"Only 'Select' is displayed in the From dropdown when non-numerical column is selected in 'Values'");
									}else {
										fail(driver,"Other than Select values is displayed in From dropdown when non-numerical column is selected in 'Values'");
									}
									click3(driver,Groups_Text);
								}else {
									fail(driver,"From dropdown results not displayed");
								}
								
								click(driver,To_input_Difference);
								if(isDisplayed2(driver,To_DropdownResults)) {
									List<WebElement> ToResult=getWebElements(driver, To_DropdownResults);
									if(ToResult.size()==1 && ToResult.get(0).getText().equals("Select")) {
										pass(driver,"Only 'Select' is displayed in the To dropdown when non-numerical column is selected in 'Values'");
									}else {
										fail(driver,"Other than Select values is displayed in To dropdown when non-numerical column is selected in 'Values'");
									}
									click3(driver,Groups_Text);
								}else {
									fail(driver,"To dropdown results not displayed");
								}
								setTestCaseID("");
								while(isDisplayed2(driver,RemoveValuesInput)) {
									WebElement RemoveSelectList=getWebElement(driver,RemoveValuesInput);
									action.moveToElement(RemoveSelectList).click().build().perform();
									wait(driver,"1");
								}
								
								click(driver,Values_Input_CustomPivot);
								waitForElement(driver, Values_DropdownResults_CustomPivot);
								selectDropdownValue1(driver,Select_Values_Column1);
								selectDropdownValue1(driver,Select_Values_Column2);
								click3(driver,Groups_Text);
							}
							
							setTestCaseID("TC_CUSTOM_PIVOT_036");
							if(TC_CUSTOM_PIVOT_036.equals("Yes")) {
								scrollUsingElement(driver,ApplyButton);
								click(driver,ApplyButton);
								if(isDisplayed(driver,FromTo_Error)) {
									pass(driver,"'Kindly select from column to find difference' error is diplayed when click Apply button Without providing the inputs in FROM and TO");
								}else {
									fail(driver,"'Kindly select from column to find difference' error is not diplayed when click Apply button Without providing the inputs in FROM and TO");
								}
							}
							
							setTestCaseID("TC_CUSTOM_PIVOT_037");
							if(TC_CUSTOM_PIVOT_037.equals("Yes")) {
								click(driver,To_input_Difference);
								waitForElement(driver, To_DropdownResults);
								selectDropdownValue1(driver, Select_To_Value);
								scrollUsingElement(driver,ApplyButton);
								click(driver,ApplyButton);
								if(isDisplayed(driver,FromTo_Error)) {
									pass(driver,"'Kindly select from column to find difference' error is diplayed when click Apply button Without providing the inputs in FROM");
								}else {
									fail(driver,"'Kindly select from column to find difference' error is not diplayed when click Apply button Without providing the inputs in FROM");
								}
							}
							
							setTestCaseID("TC_CUSTOM_PIVOT_038");
							if(TC_CUSTOM_PIVOT_038.equals("Yes")) {
								click(driver,To_input_Difference);
								waitForElement(driver, To_DropdownResults);
								click(driver,SelectOption);
								click(driver,From_input_Difference);
								waitForElement(driver, From_DropdownResults);
								selectDropdownValue1(driver, Select_From_Value);
								scrollUsingElement(driver,ApplyButton);
								click(driver,ApplyButton);
								if(isDisplayed(driver, To_Error_Diff)) {
									pass(driver,"'Kindly select to column to find difference' error is diplayed when click Apply button Without providing the inputs in TO");
								}else {
									fail(driver,"'Kindly select to column to find difference' error is not diplayed when click Apply button Without providing the inputs in TO");
								}
							}
							
							setTestCaseID("TC_CUSTOM_PIVOT_039");
							if(TC_CUSTOM_PIVOT_039.equals("Yes")) {
								if(!TC_CUSTOM_PIVOT_038.equals("Yes")) {
									click(driver,From_input_Difference);
									waitForElement(driver, From_DropdownResults);
									selectDropdownValue1(driver, Select_From_Value);
								}
								click(driver,To_input_Difference);
								waitForElement(driver, To_DropdownResults);
								selectDropdownValue1(driver, Select_From_Value);
								scrollUsingElement(driver,ApplyButton);
								click(driver,ApplyButton);
								if(isDisplayed(driver,Same_FromTo_Input_Error)) {
									pass(driver,"'Kindly check and select different columns for from and to' error displayed when provide the same input value in From and To fields");
								}else {
									fail(driver,"'Kindly check and select different columns for from and to' error is not displayed when provide the same input value in From and To fields");
								}
							}
							
							setTestCaseID("");
							if(!TC_CUSTOM_PIVOT_038.equals("Yes")) {
								click(driver,From_input_Difference);
								waitForElement(driver, From_DropdownResults);
								selectDropdownValue1(driver, Select_From_Value);
							}
							click(driver,To_input_Difference);
							waitForElement(driver, To_DropdownResults);
							selectDropdownValue1(driver, Select_To_Value);
							scrollUsingElement(driver,ApplyButton);
							click(driver,ApplyButton);
							elementnotvisible1(driver, RPE_Loading);
							if(isDisplayed(driver,Difference_Column_Chart)) {
								pass(driver,"Difference Column is displayed in the chart After enable the Sum toggle");
								List<WebElement> totalColumnsList=getWebElements(driver,Difference_Column_Chart);
								boolean Differenece=true;
								String DifferenecFails="";
								
								for(int a=1;a<=totalColumnsList.size();a++) {
									try {
										WebElement firstValues=driver.findElement(By.xpath("(//div[@col-id='"+Select_From_Value+"_sum' and @role='gridcell'])["+a+"]"));
										WebElement SecondValues=driver.findElement(By.xpath("(//div[@col-id='"+Select_To_Value+"_sum' and @role='gridcell'])["+a+"]"));
										String TotalString=totalColumnsList.get(a-1).getText();
										String FirstValueString=firstValues.getText();
										String SecondValueString=SecondValues.getText();
										int firstnum=Integer.parseInt(FirstValueString);
										int secondnum=Integer.parseInt(SecondValueString);
										int Diff_Act=Integer.parseInt(TotalString);
										int Diff_Exp=firstnum-secondnum;
										
										if(Diff_Exp!=Diff_Act) {
											Differenece=false;
											DifferenecFails=DifferenecFails+" RowNum : "+a+", Exp : "+Diff_Exp+", Act : "+Diff_Act+" ; ";
										}
									
									}catch(Exception e) {
										e.printStackTrace();
									}
								}
								
								if(Differenece) {
									pass(driver,"Difference Values are correctly calculated in the chart");
								}else {
									fail(driver,"Difference Value Calculation Fialed in some Rows => "+DifferenecFails);						
								}
							}else {
								fail(driver,"Difference Column is not displayed in the chart After enable the Sum toggle");
							}
						}
					}else {
						fail(driver,"Difference toggle is not enabled when click on it");
					}
				}
			}
			
			setTestCaseID("TC_CUSTOM_PIVOT_040");
			if(TC_CUSTOM_PIVOT_040.equals("Yes")) {
				//Column Pin Left Validation
			    if(isDisplayed(driver,SecondHeader_PivotChart)) {
			    	mouseOverToElement(driver, SecondHeader_PivotChart);
			    	String CurrentHeaderId=getAttribute1(driver, SecondHeader_PivotChart, "col-id");
			    	
			    	wait(driver,"1");
			    	mouseOverAndClick(driver, SecondHeaderMenuOption);
			    	if(isDisplayed(driver,MenuList_Open)) {
			    		pass(driver,"Column Menu Options opened When Click the menu in the header");
				    	if(verifyElementDisplayed(driver, PinColumn_Option)) {
				    		mouseOverToElement(driver, PinColumn_Option);
				    		wait(driver,"1");
				    		if(verifyElementDisplayed(driver, PinLeftOption)) {
				    			mouseOverAndClick(driver, PinLeftOption);
				    			wait(driver,"1");
				    			if(!isDisplayed(driver, MenuList_Open)) {
				    				//pass(driver,"Column menu Options Closed after selecting the Pin Left Option");
				    			}else {
				    				fail(driver,"Column menu Options not Closed after selecting the Pin Left Option");
				    				Escape(driver);
				    			}
				    			
				    			try {                                                  //div[contains(@class,'RPE_Previewtableheader') and @col-id='"+CurrentHeaderId+"']/ancestor::div[@role='presentation'][1]
				    				WebElement TestHeader=driver.findElement(By.xpath("//div[@id='RPE_Preview']//div[@role='columnheader' and @col-id='"+CurrentHeaderId+"']/ancestor::div[@role='presentation'][1]"));
					    			String pinColumnPosition=TestHeader.getAttribute("class");
					    			if(pinColumnPosition.contains("left")) {
					    				pass(driver,"Column Pinned to left after click the Pin Column Left");
					    			}else {
					    				fail(driver,"Column not Pinned to left after click the Pin Column Left");
					    			}
				    			}catch(Exception e) {
				    				fail(driver,"Unable to Validate the postion of the Header Cell");
				    				e.printStackTrace();
				    			}
				    		}
				    	}
			    	}else {
			    		fail(driver,"Column Menu Options not opened When Click the menu in the header");
			    	}
			    }else {
			    	fail(driver,"Unable to Validate the Pin Row left Validation because no Second header is present");
			    }
			}
			setTestCaseID("TC_CUSTOM_PIVOT_041");
			if(TC_CUSTOM_PIVOT_041.equals("Yes")) {
				  //Column Pin Right Validation Start
			    if(isDisplayed2(driver,SecondHeader_PivotChart)) {
			    	mouseOverToElement(driver, SecondHeader_PivotChart);
			    	String CurrentHeaderId=getAttribute1(driver, SecondHeader_PivotChart, "col-id");
			    	wait(driver,"1");
			    	mouseOverAndClick(driver, SecondHeaderMenuOption);
			    	if(isDisplayed(driver,MenuList_Open)) {
			    		pass(driver,"Column Menu Options opened When Click the menu in the header");
				    	if(verifyElementDisplayed(driver, PinColumn_Option)) {
				    		mouseOverToElement(driver, PinColumn_Option);
				    		wait(driver,"1");
				    		if(verifyElementDisplayed(driver, PinRightOption)) {
				    			mouseOverAndClick(driver, PinRightOption);
				    			wait(driver,"1");
				    			if(!isDisplayed(driver, MenuList_Open)) {
				    				pass(driver,"Column menu Options Closed after selecting the Pin Right Option");
				    			}else {
				    				fail(driver,"Column menu Options not Closed after selecting the Pin Right Option");
				    				Escape(driver);
				    			}
				    			try {
				    				WebElement TestHeader=driver.findElement(By.xpath("//div[contains(@class,'RPE_Previewtableheader') and @col-id='"+CurrentHeaderId+"']/ancestor::div[@role='presentation'][1]"));
					    			String pinColumnPosition=TestHeader.getAttribute("class");
					    			if(pinColumnPosition.contains("right")) {
					    				pass(driver,"Column Pinned to right after click the Pin Column right");
					    			}else {
					    				fail(driver,"Column not Pinned to right after click the Pin Column right");
					    			}
				    			}catch(Exception e) {
				    				fail(driver,"Unable to Validate the postion of the Header Cell");
				    				e.printStackTrace();
				    			}
				    		}
				    	}
			    		
			    	}else {
			    		fail(driver,"Column Menu Options not opened When Click the menu in the header");
			    	}
			    	
			    }else {
			    	fail(driver,"Unable to Validate the Pin Row Right Validation because no Second header is present");
			    }
			    //Column Pin Right Validation End
			}
			
			setTestCaseID("TC_CUSTOM_PIVOT_042");
			if(TC_CUSTOM_PIVOT_042.equals("Yes")) {
				 //Multiple Column Pin Left Validation Start
			    if(isDisplayed2(driver,SecondHeader_PivotChart)) {
			    	mouseOverToElement(driver, SecondHeader_PivotChart);
			    	//String CurrentHeaderId=getAttribute1(driver, SecondHeader_PivotChart, "col-id");
			    	wait(driver,"1");
			    	mouseOverAndClick(driver, SecondHeaderMenuOption);
			    	if(isDisplayed(driver,MenuList_Open)) {
			    		pass(driver,"Column Menu Options opened When Click the menu in the header");
				    	if(verifyElementDisplayed(driver, PinColumn_Option)) {
				    		mouseOverToElement(driver, PinColumn_Option);
				    		wait(driver,"1");
				    		if(verifyElementDisplayed(driver, PinLeftOption)) {
				    			mouseOverAndClick(driver, PinLeftOption);
				    			wait(driver,"1");
				    			if(!isDisplayed(driver, MenuList_Open)) {
				    				pass(driver,"Column menu Options Closed after selecting the Pin Left Option");
				    			}else {
				    				fail(driver,"Column menu Options not Closed after selecting the Pin Left Option");
				    				Escape(driver);
				    			}
				    			
				    			List<WebElement> pinnedLeftColumn=getWebElements(driver, Multiple_PinColumnLeft);
				    			int pinnedLeftColumnSize=pinnedLeftColumn.size();
				    			if(pinnedLeftColumnSize>1) {
				    				pass(driver,"Multiple Column pin to Left is Passed");
				    			}else {
				    				fail(driver,"Multiple Column pin to Left is Failed");
				    			}
				    		}
				    	}
			    		
			    	}else {
			    		fail(driver,"Column Menu Options not opened When Click the menu in the header");
			    	}
			    }else {
			    	fail(driver,"Unable to Validate the Pin Multiple Column left Validation because no Second header is present");
			    }
			  //Multiple Column Pin Left Validation Start
			}
			
			setTestCaseID("TC_CUSTOM_PIVOT_043");
			if(TC_CUSTOM_PIVOT_043.equals("Yes")) {
				//Multiple Column Pin Right Validation Start
			    if(isDisplayed(driver,SecondHeader_PivotChart)) {
			    	mouseOverToElement(driver, SecondHeader_PivotChart);
			    	wait(driver,"1");
			    	mouseOverAndClick(driver, SecondHeaderMenuOption);
			    	if(isDisplayed(driver,MenuList_Open)) {
			    		pass(driver,"Column Menu Options opened When Click the menu in the header");
				    	if(verifyElementDisplayed(driver, PinColumn_Option)) {
				    		mouseOverToElement(driver, PinColumn_Option);
				    		wait(driver,"1");
				    		if(verifyElementDisplayed(driver, PinRightOption)) {
				    			mouseOverAndClick(driver, PinRightOption);
				    			wait(driver,"1");
				    			if(!isDisplayed(driver, MenuList_Open)) {
				    				pass(driver,"Column menu Options Closed after selecting the Pin Right Option");
				    			}else {
				    				fail(driver,"Column menu Options not Closed after selecting the Pin Right Option");
				    				Escape(driver);
				    			}
				    			
				    			List<WebElement> pinnedLeftColumn=getWebElements(driver, Multiple_PinColumnRight);
				    			int pinnedLeftColumnSize=pinnedLeftColumn.size();
				    			if(pinnedLeftColumnSize==2) {
				    				pass(driver,"Multiple Column pin to Right is Passed");
				    			}else {
				    				fail(driver,"Multiple Column pin to Right is Failed");
				    			}
				    		}
				    	}
			    		
			    	}else {
			    		fail(driver,"Column Menu Options not opened When Click the menu in the header");
			    	}
			    }else {
			    	fail(driver,"Unable to Validate the Pin Multiple Column Right Validation because no Second header is present");
			    }
			   //Multiple Column Pin Right Validation Start
			}
			
			setTestCaseID("TC_CUSTOM_PIVOT_044");
			if(TC_CUSTOM_PIVOT_044.equals("Yes")) {
				 //Validation Pinning columns to both the left and right simultaneously.
				
				if(!TC_CUSTOM_PIVOT_040.equals("Yes")) {
			    	mouseOverToElement(driver, SecondHeader_PivotChart);
			    	wait(driver,"1");
			    	mouseOverAndClick(driver, SecondHeaderMenuOption);
			    	waitForElement(driver,PinColumn_Option);
			    	mouseOverToElement(driver, PinColumn_Option);
			    	waitForElement(driver,PinLeftOption);
			    	mouseOverAndClick(driver, PinLeftOption);
			    	wait(driver,"1");
				}
				    	
				if(!TC_CUSTOM_PIVOT_041.equals("Yes")) {
			    	mouseOverToElement(driver, SecondHeader_PivotChart);
			    	wait(driver,"1");
			    	mouseOverAndClick(driver, SecondHeaderMenuOption);
			    	waitForElement(driver,PinColumn_Option);
			    	mouseOverToElement(driver, PinColumn_Option);
			    	waitForElement(driver,PinRightOption);
			    	mouseOverAndClick(driver, PinRightOption);
			    	wait(driver,"1");
				}
				
			     if(isDisplayed2(driver, PinnedRightColumns)&& isDisplayed2(driver, PinnedLeft_Column)) {
			    	 pass(driver,"Pinning columns to both the left and right simultaneously is passed");
			     }else {
			    	fail(driver,"Pinning columns to both the left and right simultaneously is Failed");
			     }
			    //Validation Pinning columns to both the left and right simultaneously.
			}
			
			setTestCaseID("TC_CUSTOM_PIVOT_045");
			if(TC_CUSTOM_PIVOT_045.equals("Yes")) {
				if(isDisplayed2(driver,Multiple_PinColumnLeft)) {
					while(isDisplayed2(driver,Multiple_PinColumnLeft)) {
				    	mouseOverToElement(driver, Multiple_PinColumnLeft);
				    	mouseOverAndClick(driver, LeftPinnedColumn_Menu);
				    	waitForElement(driver, PinColumn_Option);
				    	mouseOverToElement(driver, PinColumn_Option);
				    	mouseOverAndClick(driver, NoPinOption);
				    	wait(driver,"1");
				    	if(!isDisplayed(driver, MenuList_Open)) {
							//pass(driver,"Column menu Options Closed after selecting the No Pin Option");
						}else {
							fail(driver,"Column menu Options not Closed after selecting the No Pin Option");
							Escape(driver);
						}
				    	wait(driver,"1");
				    }
				    
				    if(!isDisplayed(driver,Multiple_PinColumnLeft)) {
				    	pass(driver,"Unpinning a column from the left is Passed");
				    }else {
				    	fail(driver,"Unpinning a column from the left is Failed");
				    }
				}else {
					pass(driver,"Unable to perform unpin column from left, No left pinned column present");
				} 
			}
			
			setTestCaseID("TC_CUSTOM_PIVOT_046");
			if(TC_CUSTOM_PIVOT_046.equals("Yes")) {
				if(isDisplayed2(driver,Multiple_PinColumnRight)) {
					 // Unpinning a column from the Right Start
				    while(isDisplayed2(driver,Multiple_PinColumnRight)) {
				    	mouseOverToElement(driver, Multiple_PinColumnRight);
				    	mouseOverAndClick(driver, RightPinnedColumn_Menu);
				    	waitForElement(driver, PinColumn_Option);
				    	mouseOverToElement(driver, PinColumn_Option);
				    	mouseOverAndClick(driver, NoPinOption);
				    	wait(driver,"1");
				    	if(!isDisplayed(driver, MenuList_Open)) {
							//pass(driver,"Column menu Options Closed after selecting the No Pin Option");
						}else {
							fail(driver,"Column menu Opitons not Closed after selecting the No Pin Option");
							Escape(driver);
						}
				    	wait(driver,"1");
				    }
				    
				    if(!isDisplayed(driver,Multiple_PinColumnRight)) {
				    	pass(driver,"Unpinning a column from the Right is Passed");
				    }else {
				    	fail(driver,"Unpinning a column from the Right is Failed");
				    }
				    //Unpinning a column from the Right End
				}else {
					pass(driver,"Unable to perform unpin column from right, No right pinned column present");
				} 
			}
			
			setTestCaseID("TC_CUSTOM_PIVOT_047");
			if(TC_CUSTOM_PIVOT_047.equals("Yes")) {
				 //AutoSize this Column 
			    double beforeAutoSizeColumn1=getCssWidth(driver,FirstHeader_PivotChart);
			    mouseOverToElement(driver, FirstHeader_PivotChart);
			    mouseOverAndClick(driver, FirstHeaderMenuOption);
			    waitForElement(driver, MenuList_Open);
			    waitForElement(driver,AutoSizeThisColumnOption);
			    mouseOverAndClick(driver, AutoSizeThisColumnOption);
			    if(!isDisplayed(driver, MenuList_Open)) {
					//pass(driver,"Column menu Options Closed after selecting the Autosize this Column Option");
				}else {
					fail(driver,"Column menu Options not Closed after selecting the Autosize this Column Option");
					Escape(driver);
				}
			    double AfterAutoSizeColumn1=getCssWidth(driver,FirstHeader_PivotChart);
			    if(beforeAutoSizeColumn1==AfterAutoSizeColumn1 && AfterAutoSizeColumn1!=0) {
			    	fail(driver,"AutoSize a single Column not working properly in the Column");
			    }else {
			    	pass(driver,"AutoSize a single Column working properly in the Column , AfterAutoSizeColumnWidth : "+AfterAutoSizeColumn1);
			    }
			  //AutoSize this Column end
			}
			
			setTestCaseID("TC_CUSTOM_PIVOT_048");
			if(TC_CUSTOM_PIVOT_048.equals("Yes")) {
				if(!TC_CUSTOM_PIVOT_047.equals("Yes")) {
					mouseOverToElement(driver, FirstHeader_PivotChart);
				    mouseOverAndClick(driver, FirstHeaderMenuOption);
				    waitForElement(driver, MenuList_Open);
				    waitForElement(driver,AutoSizeThisColumnOption);
				    mouseOverAndClick(driver, AutoSizeThisColumnOption);
				}
				elementScreenShot_new(driver,Tables_Chart,"/Expected_screenshot/SmokeTesting/BeforeReset_TC_48");
				mouseOverToElement(driver, FirstHeader_PivotChart);
			    mouseOverAndClick(driver, FirstHeaderMenuOption);
			    waitForElement(driver, MenuList_Open);
			    waitForElement(driver, ResetColumnOption);
			    mouseOverAndClick(driver,ResetColumnOption);
			    elementnotvisible1(driver, RPE_Loading);
			    elementScreenShot_new(driver,Tables_Chart,"/Actual_screenshot/SmokeTesting/AfterReset_TC_48");
			    setTestCaseID("TC_CUSTOM_PIVOT_049");
				if(TC_CUSTOM_PIVOT_049.equals("Yes")) {
					 try {
						 boolean chartDiff=imageComparison2(driver, "/SmokeTesting/BeforeReset_TC_48", "/SmokeTesting/AfterReset_TC_48");
						 wait(driver, "2");
						 if(chartDiff==false) {
							pass(driver,"After resetting, columns restores their initial visibility");
						 }else {
							fail(driver,"After resetting, columns are not restores their initial visibility");
						 }
					 } catch (Exception e1) {
						 fail(driver,"Unable to compare the Images Reset column images");
					 }
				}
			}
			
			setTestCaseID("TC_CUSTOM_PIVOT_050");
			if(TC_CUSTOM_PIVOT_050.equals("Yes")) {
				mouseOverToElement(driver, SecondHeader_PivotChart);
		    	mouseOverAndClick(driver, SecondHeaderMenuOption);
		    	waitForElement(driver,PinColumn_Option);
		    	mouseOverToElement(driver, PinColumn_Option);
		    	waitForElement(driver,PinRightOption);
		    	mouseOverAndClick(driver, PinRightOption);
		    	elementnotvisible1(driver, RPE_Loading);
		    	elementScreenShot_new(driver,Tables_Chart,"/Expected_screenshot/SmokeTesting/BeforeReset_TC_50");
		    	mouseOverToElement(driver, SecondHeader_PivotChart);
			    mouseOverAndClick(driver, SecondHeaderMenuOption);
			    waitForElement(driver, MenuList_Open);
			    waitForElement(driver, ResetColumnOption);
			    mouseOverAndClick(driver,ResetColumnOption);
			    elementnotvisible1(driver, RPE_Loading);
			    elementScreenShot_new(driver,Tables_Chart,"/Actual_screenshot/SmokeTesting/AfterReset_TC_50");
			    try {
					 boolean chartDiff=imageComparison2(driver, "/SmokeTesting/BeforeReset_TC_50", "/SmokeTesting/AfterReset_TC_50");
					 wait(driver, "2");
					 if(chartDiff==false) {
						pass(driver,"After resetting, columns restores their initial pinned state.");
					 }else {
						fail(driver,"After resetting, columns are not restores their initial pinned state.");
					 }
			    } catch (Exception e1) {
					 fail(driver,"Unable to compare the Images Reset column images");
			    }
			}
			
			setTestCaseID("TC_CUSTOM_PIVOT_051");
			if(TC_CUSTOM_PIVOT_051.equals("Yes")) {
				mouseOverToElement(driver, FirstHeader_PivotChart);
				String BeforeRenameColumnName=getText1(driver, FirstHeaderText_PivotChart);
				String BeforeRenameCell_Id=getAttribute1(driver, FirstHeader_PivotChart, "col-id");
				
				mouseOverAndClick(driver, FirstHeaderMenuOption);
			    waitForElement(driver, MenuList_Open);
			    waitForElement(driver,ChangeHeaderOption);
			    mouseOverAndClick(driver,ChangeHeaderOption);
			    
			    if(TC_CUSTOM_PIVOT_052.equals("Yes")) {
			    	setTestCaseID("TC_CUSTOM_PIVOT_052");
			    	verifyElementDisplayed(driver, Rename_Yes_Button);
			    }
			    if(TC_CUSTOM_PIVOT_053.equals("Yes")) {
			    	setTestCaseID("TC_CUSTOM_PIVOT_053");
			    	verifyElementDisplayed(driver, Rename_Cancel_Button);
			    }
			    if(TC_CUSTOM_PIVOT_054.equals("Yes")) {
			    	setTestCaseID("TC_CUSTOM_PIVOT_054");
			    	verifyElementDisplayed(driver, Rename_Reset_Button);
			    }
			    
			    if(TC_CUSTOM_PIVOT_055.equals("Yes")) {
			    	setTestCaseID("TC_CUSTOM_PIVOT_055");
			    	waitForElement(driver,RenameInput);
					click(driver,RenameInput);
					clear1(driver,RenameInput);
				    sendKeys(driver,RenameInput,Column_Rename_Input);
				    click(driver,Rename_Yes_Button);
					wait(driver,"1");
					String AfterRenameColumnName=getText1(driver, FirstHeaderText_PivotChart);
					try {
						WebElement SecondHeadCellTextElement=driver.findElement(By.xpath("//div[@id='RPE_Preview']//div[@col-id='"+BeforeRenameCell_Id+"' and @role='columnheader']//span[@ref='eText']"));
					    AfterRenameColumnName=SecondHeadCellTextElement.getText();
					}catch(Exception e) {
						
					}
					
				    if(AfterRenameColumnName.contains(Column_Rename_Input)) {
				    	pass(driver,"Column Renamed Successfully , BeforeRenameColumnName : "+BeforeRenameColumnName+", AfterRenameColumnName : "+AfterRenameColumnName);
				    }else {
				    	fail(driver,"Column not renamed Successfully , BeforeRenameColumnName : "+BeforeRenameColumnName+", AfterRenameColumnName : "+AfterRenameColumnName);
				    }
			    }
			    //Column Rename End
			}
			
			
			if(TC_CUSTOM_PIVOT_056.equals("Yes")) {
			 	 setTestCaseID("TC_CUSTOM_PIVOT_056");
				 String defaultSortFirst=getAttribute1(driver, FirstHeader_Sort, "ref");
			     if(defaultSortFirst.equals("eSortNone")) {
			    	pass(driver,"By default, SortNone is displayed in the ColumnHeader");
			     }else {
			    	fail(driver,"By default, SortNone is not applied in the ColumnHeader");
			     }   
			}
			
			if(TC_CUSTOM_PIVOT_059.equals("Yes")) {
			 	 setTestCaseID("TC_CUSTOM_PIVOT_059");
			 	 verifyElementDisplayed(driver, Sorting_Icon);
			}
			
			if(TC_CUSTOM_PIVOT_057.equals("Yes")) {
			 	 setTestCaseID("TC_CUSTOM_PIVOT_057");
			 	 mouseOverAndClick(driver, FirstHeader_PivotChart);
			 	 wait(driver,"1");
			 	 String FirstText=getText1(driver, FirstCell);
			 	 String SecondText=getText1(driver, SecondCell);

	    		 if(SecondText.compareTo(FirstText)>0 ||SecondText.compareTo(FirstText)==0) {
	    			pass(driver,"Column Values Are updated in the 'Ascending' order");
	    		 }else {
	    			fail(driver,"Column Values Are not updated in the 'Ascending' order");
	    		 }
	    		 
	    		 if(TC_CUSTOM_PIVOT_060.equals("Yes")) {
	    			 setTestCaseID("TC_CUSTOM_PIVOT_060");
	    			 String afterFirstClickSort=getAttribute1(driver, FirstHeader_Sort, "ref");
				 	 if(afterFirstClickSort.equals("eSortAsc")) {
				 		 pass(driver,"'Ascending' sort icon is displayed in the Column Header after click on it '");
				 	 }else {
				 		 fail(driver,"'Ascending' sort icon is not displayed in the Column Header after click on it '");
				 	 }
	    		 }
			 	
			}
			
			if(TC_CUSTOM_PIVOT_058.equals("Yes")) {
			 	 setTestCaseID("TC_CUSTOM_PIVOT_058");
			 	 if(!TC_CUSTOM_PIVOT_058.equals("Yes")) {
			 		mouseOverAndClick(driver, FirstHeader_PivotChart);
			 	 }
			 	mouseOverAndClick(driver, FirstHeader_PivotChart);
			    wait(driver,"1");
			    String FirstText=getText1(driver, FirstCell);
	    		String SecondText=getText1(driver, SecondCell);
	    		if(SecondText.compareTo(FirstText)<0 || SecondText.compareTo(FirstText)==0) {
	    			pass(driver,"Column Values Are updated in the 'Descending' order");
	    		}else {
	    			fail(driver,"Column Values Are not updated in the 'Descending' order");
	    		}
	    		if(TC_CUSTOM_PIVOT_060.equals("Yes")) {
	    			setTestCaseID("TC_CUSTOM_PIVOT_060");
	    			String afterSecondClickSort=getAttribute1(driver, FirstHeader_Sort, "ref");
				    if(afterSecondClickSort.equals("eSortDesc")) {
				    	pass(driver,"'Descending' sort icon is displayed in the Column Header after click on it '");
				    }else {
				    	fail(driver,"'Descending' sort icon is not displayed in the Column Header after click on it '");
				    }
	    		}
			}
			
			if(TC_CUSTOM_PIVOT_061.equals("Yes")) {
			 	 setTestCaseID("TC_CUSTOM_PIVOT_061");
				//Validating the Entire row and Column highlighted when mouse over on one cell
				mouseOverToElement(driver, FirstCell);
				wait(driver,"1");
				String firstRowHighlight=getAttribute1(driver, First_Row, "class");
				if(firstRowHighlight.contains("hover")) {
					pass(driver,"Entire row gets highlighted when mouse hover on the first cell in the row");
				}else {
					fail(driver,"Entire row not gets highlighted when mouse hover on the first cell in the row");
				}
				String secondCellHighlight=getAttribute1(driver, SecondCell, "class");
				if(secondCellHighlight.contains("hover")) {
					pass(driver,"Entire Column gets highlighted when mouse hover on the first cell in the Column");
				}else {
					fail(driver,"Entire Column not gets highlighted when mouse hover on the first cell in the Column");
				}
				//Validating the Entire row and Column highlighted when mouse over on one cell
			}
			
			if(TC_CUSTOM_PIVOT_062.equals("Yes")) {
			 	 setTestCaseID("TC_CUSTOM_PIVOT_062");
			 	 //AutoSize this Column Start
			 	 double beforeAutoSizeColumn1=getCssWidth(driver,FirstHeader_PivotChart);
			 	 mouseOverToElement(driver, FirstHeader_PivotChart);
			 	 mouseOverAndClick(driver, FirstHeaderMenuOption);
			 	 waitForElement(driver, MenuList_Open);
			 	 verifyElementDisplayed(driver, AutoSizeThisColumnOption);
			 	 if(TC_CUSTOM_PIVOT_063.equals("Yes")) {
				 	 setTestCaseID("TC_CUSTOM_PIVOT_063");
				 	 mouseOverAndClick(driver, AutoSizeThisColumnOption);
				 	 if(!isDisplayed(driver, MenuList_Open)) {
				 		 //pass(driver,"Column menu Options Closed after selecting the Autosize this Column Option");
				 	 }else {
				 		 fail(driver,"Column menu Options not Closed after selecting the Autosize this Column Option");
				 		 Escape(driver);
				 	 }
				 	 double AfterAutoSizeColumn1=getCssWidth(driver,FirstHeader_PivotChart);
				 	 if(beforeAutoSizeColumn1==AfterAutoSizeColumn1 && AfterAutoSizeColumn1!=0) {
				 		 fail(driver,"AutoSize this Column not applied properly in the Column");
				 	 }else {
				 		 pass(driver,"AutoSize this Column applied properly in the Column , AfterAutoSizeColumnWidth : "+AfterAutoSizeColumn1);
				 	 }
			 	 }
			}//AutoSize this Column end
			
			if(TC_CUSTOM_PIVOT_064.equals("Yes")) {
			 	 setTestCaseID("TC_CUSTOM_PIVOT_064");
			 	//AutoSize All Column Start
			 	 double beforeAutoSizeAllColumn2=getCssWidth(driver,SecondHeader_PivotChart);
			 	 mouseOverToElement(driver, FirstHeader_PivotChart);
			 	 mouseOverAndClick(driver, FirstHeaderMenuOption);
			 	 waitForElement(driver, MenuList_Open);
			 	 verifyElementDisplayed(driver, AutoSizeAllColumnOption);
			 	 if(TC_CUSTOM_PIVOT_065.equals("Yes")) {
				 	 setTestCaseID("TC_CUSTOM_PIVOT_065");
				 	 mouseOverAndClick(driver, AutoSizeAllColumnOption);
				 	 if(!isDisplayed(driver, MenuList_Open)) {
				 		 //pass(driver,"Column menu Options Closed after selecting the Autosize all Column Option");
				 	 }else {
				 		 fail(driver,"Column menu Options not Closed after selecting the Autosize all Column Option");
				 		 Escape(driver);
				 	 }
				 	 double afterAutoSizeAllColumn2=getCssWidth(driver,SecondHeader_PivotChart);
				 	 if(beforeAutoSizeAllColumn2==afterAutoSizeAllColumn2 && afterAutoSizeAllColumn2!=0) {
				    	fail(driver,"AutoSize all Column not applied properly in the Column");
				 	 }else {
				    	pass(driver,"AutoSize all Column applied properly in the Column");
				 	 }
			 	 }   
			}//AutoSize All Column end
			
			
			if(TC_CUSTOM_PIVOT_067.equals("Yes")) {
			 	setTestCaseID("TC_CUSTOM_PIVOT_067");
			 	List<WebElement> AllCellElements=getWebElements(driver,TableCell);
				Pattern numericalPattern = Pattern.compile("^\\d+(\\.\\d+)?$");
		        Pattern datePattern = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");

		        boolean TextDefaultAlign=true;
		        String FailedStringCell="";		        
		        for (WebElement cell : AllCellElements) {
		            String cellText = cell.getText();
		            String textAlign = cell.getCssValue("text-align");
		            String ColumnValue=cell.getAttribute("col-id");
		          //  System.out.println("textAlign : "+textAlign);
		            if (datePattern.matcher(cellText).matches() || cellText.equals("") || cellText.isEmpty()|| cellText.startsWith("-") || cellText.equals("0")) {
		                continue;
		            } else if (numericalPattern.matcher(cellText).matches()) {
		                
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
			}

			if(TC_CUSTOM_PIVOT_066.equals("Yes")) {
			 	 setTestCaseID("TC_CUSTOM_PIVOT_066");
			 	 mouseOverToElement(driver, FirstHeader_PivotChart);
			 	 mouseOverAndClick(driver, FirstHeaderMenuOption);
			 	 waitForElement(driver, MenuList_Open);
			 	 if(verifyElementDisplayed(driver, Align_Option)) {
			 		if(TC_CUSTOM_PIVOT_068.equals("Yes")) {
					 	 setTestCaseID("TC_CUSTOM_PIVOT_068");
					 	 mouseOverAndClick(driver, Align_Option);
					 	 mouseOverAndClick(driver, RightAlign_Option);
					 	 wait(driver,"1");
					 	 WebElement first=getWebElement(driver, FirstCell);
					 	 String firstAlign=first.getCssValue("text-align");
					 	 if(firstAlign.equals("right")) {
					 		 pass(driver,"Cell values Aligned Right after selecting the right Align Option");
					 	 }else {
					 		fail(driver,"Cell values not Aligned Right after selecting the right Align Option");
					 	 }
					 	 
					 	 if(!isDisplayed(driver, MenuList_Open)) {
					 		mouseOverToElement(driver, FirstHeader_PivotChart);
						 	mouseOverAndClick(driver, FirstHeaderMenuOption);
						 	waitForElement(driver, MenuList_Open);
						 	mouseOverAndClick(driver, ResetColumnOption);
						 	Escape(driver);
						 	 first=getWebElement(driver, FirstCell);
						 	 firstAlign=first.getCssValue("text-align");
						 	 if(firstAlign.equals("right")) {
						 		 fail(driver,"Cell values Alignment not reset to initial position after clicking the ResetColumn option");
						 	 }else {
						 		 pass(driver,"Cell values Alignment reset to initial position after clicking the ResetColumn option");
						 	 }
					 	 }
			 		}
			 	 }
			 	  
			}
			
			if(TC_CUSTOM_PIVOT_069.equals("Yes")) {
			 	 setTestCaseID("TC_CUSTOM_PIVOT_069");
			 	 mouseOverToElement(driver, FirstHeader_PivotChart);
			 	 mouseOverAndClick(driver, FirstHeaderMenuOption);
			 	 waitForElement(driver, MenuList_Open);
			 	 if(verifyElementDisplayed(driver, Columns_option)) {
			 		 mouseOverAndClick(driver, Columns_option);
			 		 if(TC_CUSTOM_PIVOT_070.equals("Yes")) {
			 			setTestCaseID("TC_CUSTOM_PIVOT_070");
			 			List<WebElement> listAvailable=getWebElements(driver, Available_List_Column);
			 			List<WebElement> CheckboxAvailable=getWebElements(driver, Available_CheckBox_Columns);
			 			if(listAvailable.size()==CheckboxAvailable.size()) {
			 				boolean allSelected=true;
			 				for(WebElement ele:CheckboxAvailable) {
			 					if(!ele.isSelected()) {
			 						allSelected=false;
			 						break;
			 					}
			 				}
			 				if(allSelected==true) {
			 					pass(driver,"All the available column checkbox are selected by default ");
			 				}else {
			 					fail(driver,"All the available column checkbox are not selected by default ");
			 				}
			 			}else {
			 				fail(driver,"Displayed Checkbox count mismtched with Displayed Column Lists");
			 			}
			 		 }
			 		 
			 		if(TC_CUSTOM_PIVOT_072.equals("Yes")) {
			 			setTestCaseID("TC_CUSTOM_PIVOT_072");
			 			if(verifyElementDisplayed(driver, SearchInput_Columns)) {
			 				sendKeys(driver, SearchInput_Columns, "dasfns");
			 				if(isDisplayed2(driver,Available_List_Column)) {
			 					fail(driver,"Column List are displayed for Invalid search");
			 				}else {
			 					pass(driver,"Column List are not displayed for Invalid search");
			 				}
			 				
			 				clear2(driver,SearchInput_Columns);
			 				if(isDisplayed2(driver,Available_List_Column)) {
			 					pass(driver,"After clear the value in the input, Column lists are displayed");
			 				}else {
			 					fail(driver,"After clear the value in the input, Column lists are not displayed");
			 				}
			 				
			 				sendKeys(driver, SearchInput_Columns, Select_Values_Column2);
			 				wait(driver,"1");
			 				List<WebElement> listAvailable=getWebElements(driver, Available_List_Column);
			 				try {
			 					String firstText=listAvailable.get(0).getText();
				 				if(firstText.contains(Select_Values_Column2)&&listAvailable.size()==1) {
				 					pass(driver,"Search Input in the columns working properly for the Valid input");
				 				}else {
				 					fail(driver,"Search Input in the columns not working properly for the Valid input");
				 				}
				 			    clear2(driver,SearchInput_Columns);
			 				}catch(Exception e) {
			 					
			 				}
			 			}
			 		}
			 		
			 		if(TC_CUSTOM_PIVOT_071.equals("Yes")) {
			 			setTestCaseID("TC_CUSTOM_PIVOT_071");
			 			try {
			 				WebElement checkBox=driver.findElement(By.xpath("//div[@ref='primaryColsListPanel']//div[contains(@aria-label,'"+Column_Value_Deselect+"')]//input[@ref='eInput']"));
			 				action.moveToElement(checkBox).click().build().perform();
			 				elementnotvisible1(driver, RPE_Loading);
			 				List<WebElement>  TableHeadings=getWebElements(driver, HeaderRows_TabelChart);
			 				boolean deslectHead=true;
			 				for(WebElement ele:TableHeadings) {
			 					String eleHead=ele.getAttribute("col-id");
			 					if(eleHead.startsWith(Column_Value_Deselect)) {
			 						fail(driver,Column_Value_Deselect+ " column displayed in the Table after deselect it");
			 						deslectHead=false;
			 						break;
			 					}
			 				}
			 				if(deslectHead==true) {
			 					pass(driver,Column_Value_Deselect+ " column not displayed in the Table after deselect it");
			 				}
			 				
			 				checkBox=driver.findElement(By.xpath("//div[@ref='primaryColsListPanel']//div[contains(@aria-label,'"+Column_Value_Deselect+"')]//input[@ref='eInput']"));
			 				action.moveToElement(checkBox).click().build().perform();
			 				elementnotvisible1(driver, RPE_Loading);
			 				TableHeadings=getWebElements(driver, HeaderRows_TabelChart);
			 				boolean selectHead=false;
			 				for(WebElement ele:TableHeadings) {
			 					String eleHead=ele.getAttribute("col-id");
			 					if(eleHead.startsWith(Column_Value_Deselect)) {
			 						pass(driver,Column_Value_Deselect+ " Deslected column displayed in the Table after select it");
			 						selectHead=true;
			 						break;
			 					}
			 				}
			 				if(selectHead==false) {
			 					fail(driver,Column_Value_Deselect+" column not displayed in the Table after select it");
			 				}
			 				
			 			}catch(Exception e) {
			 				fail(driver,"Failure to validate the TC_CUSTOM_PIVOT_071 "+e.getLocalizedMessage());
			 			}
			 		}
			 		
			 		mouseOverAndClick(driver, DashProPage);
			 		if(!isDisplayed(driver, MenuList_Open)) {
	    				//pass(driver,"Column menu Options Closed when click outside it");
	    			}else {
	    				fail(driver,"Column menu Options not Closed when click outside it");
	    				Escape(driver);
	    			}
			 	 } 
			}
			
			
			if(TC_CUSTOM_PIVOT_073.equals("Yes")) {
			 	 setTestCaseID("TC_CUSTOM_PIVOT_073");
			 	 mouseOverToElement(driver, FirstHeader_PivotChart);
			 	 String col_Id=getAttribute1(driver, FirstHeader_PivotChart, "col-id");
			 	 mouseOverAndClick(driver, FirstHeaderMenuOption);
			 	 waitForElement(driver, MenuList_Open);
			 	 if(verifyElementDisplayed(driver, Filter_option)) {
			 		mouseOverAndClick(driver, Filter_option);
			 		if(TC_CUSTOM_PIVOT_074.equals("Yes")) {
					 	 setTestCaseID("TC_CUSTOM_PIVOT_074");
					 	 List<WebElement> listAvailable=getWebElements(driver, AvailableList_Filter);
					 	 List<WebElement> CheckboxAvailable=getWebElements(driver, AvailableCheckBox_Filter);
					 	 if(listAvailable.size()==CheckboxAvailable.size()) {
					 		 boolean allSelected=true;
					 		 for(WebElement ele:CheckboxAvailable) {
					 			 if(!ele.isSelected()) {
					 				 allSelected=false;
					 				 break;
					 			 }
					 		 }
					 		 if(allSelected==true) {
					 			 pass(driver,"All the available Values checkbox are selected by default ");
					 		 }else {
					 			 fail(driver,"All the available Values checkbox are not selected by default ");
					 		 }
					 	 }else {
					 		 fail(driver,"Displayed Checkbox count mismtched with Displayed Filter Lists");
					 	 }
			 		}
			 		
			 		if(TC_CUSTOM_PIVOT_075.equals("Yes")) {
					 	setTestCaseID("TC_CUSTOM_PIVOT_075");
					 	String FirstText=getText1(driver,FirstCell);//new line...
					 	sendKeys(driver,Search_input_Filter,FirstText);
					 	wait(driver,"1");
					 	List<WebElement> lists=getWebElements(driver,AvailableList_Filter);
					 	//String lastHead=lists.get(lists.size()-1).getText();
					 	WebElement lastEle=lists.get(lists.size()-1);
					 	action.moveToElement(lastEle).click().build().perform();
					 	pass(driver,"Deselected  : "+FirstText);
		 				elementnotvisible1(driver, RPE_Loading);
		 				List<WebElement>  TableCells=driver.findElements(By.xpath("//div[@id='RPE_Preview']//div[@col-id='"+col_Id+"' and @role='gridcell']"));
		 				boolean filtered=true;
		 				for(WebElement ele:TableCells) {
		 					String eleHead=ele.getText();
		 					if(eleHead.equals(FirstText)) {
		 						fail(driver,FirstText+ " Value not displayed in the Table after deselect it in the filter");
		 						filtered=false;
		 						break;
		 					}
		 				}
		 				if(filtered==true) {
		 					pass(driver,FirstText+ " Value displayed in the Table after deselect it in the filter");
		 				}
		 				
		 				lists=getWebElements(driver,AvailableList_Filter);
					 	lastEle=lists.get(lists.size()-1);
					 	action.moveToElement(lastEle).click().build().perform();
					 	pass(driver,"Selected : "+FirstText);
		 				elementnotvisible1(driver, RPE_Loading);
		 				
		 				TableCells=driver.findElements(By.xpath("//div[@id='RPE_Preview']//div[@col-id='"+col_Id+"' and @role='gridcell']"));
		 				boolean Unfiltered=false;
		 				for(WebElement ele:TableCells) {
		 					String eleHead=ele.getText();
		 					if(eleHead.equals(FirstText)) {
		 						pass(driver,FirstText+ " selected Value displayed in the Table after select it in the filter");
		 						Unfiltered=true;
		 						break;
		 					}
		 				}
		 				if(Unfiltered==false) {
		 					fail(driver,FirstText+" Value not displayed in the Table after select it");
		 				}
			 		}
			 	 } 
			}
			
			//******************** Axes Validation End ****************
			
			// ******************** Table Format Validation Start *******************
	        String Custom_Pivot_Table_Format= getCellValue("TestExecution","Testcase_Selection","Custom_Pivot_Table_Format",Flag);
	        if(Custom_Pivot_Table_Format.equals("Yes")) {
	        
//				//Yes/No Input for Testcases Id
	        	String TC_CUSTOM_PIVOT_TABLE_FORMAT_001=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_001",TestcaseID_Flag);
        		String TC_CUSTOM_PIVOT_TABLE_FORMAT_002=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_002",TestcaseID_Flag);
	        	String TC_CUSTOM_PIVOT_TABLE_FORMAT_003=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_003",TestcaseID_Flag);
	        	String TC_CUSTOM_PIVOT_TABLE_FORMAT_004=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_004",TestcaseID_Flag);
	        	String TC_CUSTOM_PIVOT_TABLE_FORMAT_005=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_005",TestcaseID_Flag);
	        	String TC_CUSTOM_PIVOT_TABLE_FORMAT_006=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_006",TestcaseID_Flag);
	        	String TC_CUSTOM_PIVOT_TABLE_FORMAT_007=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_007",TestcaseID_Flag);
	        	String TC_CUSTOM_PIVOT_TABLE_FORMAT_008=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_008",TestcaseID_Flag);
	        	String TC_CUSTOM_PIVOT_TABLE_FORMAT_009=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_009",TestcaseID_Flag);
	        	String TC_CUSTOM_PIVOT_TABLE_FORMAT_010=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_010",TestcaseID_Flag);
	        	String TC_CUSTOM_PIVOT_TABLE_FORMAT_011=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_011",TestcaseID_Flag);
	        	String TC_CUSTOM_PIVOT_TABLE_FORMAT_012=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_012",TestcaseID_Flag);
	        	String TC_CUSTOM_PIVOT_TABLE_FORMAT_013=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_013",TestcaseID_Flag);
	        	String TC_CUSTOM_PIVOT_TABLE_FORMAT_014=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_014",TestcaseID_Flag);
	        	String TC_CUSTOM_PIVOT_TABLE_FORMAT_015=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_015",TestcaseID_Flag);
	        	String TC_CUSTOM_PIVOT_TABLE_FORMAT_016=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_016",TestcaseID_Flag);
	        	String TC_CUSTOM_PIVOT_TABLE_FORMAT_017=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_017",TestcaseID_Flag);
	        	String TC_CUSTOM_PIVOT_TABLE_FORMAT_018=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_018",TestcaseID_Flag);
	        	String TC_CUSTOM_PIVOT_TABLE_FORMAT_019=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_019",TestcaseID_Flag);
	        	String TC_CUSTOM_PIVOT_TABLE_FORMAT_020=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_020",TestcaseID_Flag);
	        	String TC_CUSTOM_PIVOT_TABLE_FORMAT_021=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_021",TestcaseID_Flag);
	        	String TC_CUSTOM_PIVOT_TABLE_FORMAT_022=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_022",TestcaseID_Flag);
	        	String TC_CUSTOM_PIVOT_TABLE_FORMAT_023=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_023",TestcaseID_Flag);
	        	String TC_CUSTOM_PIVOT_TABLE_FORMAT_024=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_024",TestcaseID_Flag);
	        	String TC_CUSTOM_PIVOT_TABLE_FORMAT_025=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_025",TestcaseID_Flag);
	        	String TC_CUSTOM_PIVOT_TABLE_FORMAT_026=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_026",TestcaseID_Flag);
	        	String TC_CUSTOM_PIVOT_TABLE_FORMAT_027=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_027",TestcaseID_Flag);
	        	String TC_CUSTOM_PIVOT_TABLE_FORMAT_028=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_028",TestcaseID_Flag);
	        	String TC_CUSTOM_PIVOT_TABLE_FORMAT_029=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_029",TestcaseID_Flag);
	        	String TC_CUSTOM_PIVOT_TABLE_FORMAT_030=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_030",TestcaseID_Flag);
	        	String TC_CUSTOM_PIVOT_TABLE_FORMAT_031=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_031",TestcaseID_Flag);
	        	String TC_CUSTOM_PIVOT_TABLE_FORMAT_032=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_032",TestcaseID_Flag);
	        	String TC_CUSTOM_PIVOT_TABLE_FORMAT_033=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_033",TestcaseID_Flag);
	        	String TC_CUSTOM_PIVOT_TABLE_FORMAT_034=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_034",TestcaseID_Flag);
	        	String TC_CUSTOM_PIVOT_TABLE_FORMAT_035=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_035",TestcaseID_Flag);
	        	String TC_CUSTOM_PIVOT_TABLE_FORMAT_036=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_036",TestcaseID_Flag);
	        	String TC_CUSTOM_PIVOT_TABLE_FORMAT_037=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_037",TestcaseID_Flag);
	        	String TC_CUSTOM_PIVOT_TABLE_FORMAT_038=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_038",TestcaseID_Flag);
	        	String TC_CUSTOM_PIVOT_TABLE_FORMAT_039=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_039",TestcaseID_Flag);
	        	String TC_CUSTOM_PIVOT_TABLE_FORMAT_040=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_040",TestcaseID_Flag);
	        	String TC_CUSTOM_PIVOT_TABLE_FORMAT_041=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_041",TestcaseID_Flag);
	        	String TC_CUSTOM_PIVOT_TABLE_FORMAT_042=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_042",TestcaseID_Flag);
	        	String TC_CUSTOM_PIVOT_TABLE_FORMAT_043=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_043",TestcaseID_Flag);
	        	String TC_CUSTOM_PIVOT_TABLE_FORMAT_044=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_044",TestcaseID_Flag);
	        	String TC_CUSTOM_PIVOT_TABLE_FORMAT_045=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_045",TestcaseID_Flag);
	        	String TC_CUSTOM_PIVOT_TABLE_FORMAT_046=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_046",TestcaseID_Flag);
	        	String TC_CUSTOM_PIVOT_TABLE_FORMAT_047=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_047",TestcaseID_Flag);
	        	String TC_CUSTOM_PIVOT_TABLE_FORMAT_048=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_048",TestcaseID_Flag);
	        	String TC_CUSTOM_PIVOT_TABLE_FORMAT_049=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_049",TestcaseID_Flag);
	        	String TC_CUSTOM_PIVOT_TABLE_FORMAT_050=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_050",TestcaseID_Flag);
	        	String TC_CUSTOM_PIVOT_TABLE_FORMAT_051=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_051",TestcaseID_Flag);
	        	String TC_CUSTOM_PIVOT_TABLE_FORMAT_052=getTestcaseID_Flag(TestcaseFileName,Table_FormatSheetName,TescasesID_Column,"TC_ CUSTOM PIVOT_TABLE FORMAT_052",TestcaseID_Flag);

	        	setTestCaseID("");
	        	if(verifyElementDisplayed(driver, TableFormat_Sec)) {
	        		click(driver,TableFormat_Sec);
	        		wait(driver,"1");
	        		String TableFormatSecExpand=getAttribute1(driver,TableFormatExpand,"class");
	        		if(TableFormatSecExpand.contains("up")) {
		 				pass(driver,"Table Format Section is expanded When Click on it");
		 				setTestCaseID("TS_CUSTOM_PIVOT _TABLE_FORMAT_001");
		 				if(verifyElementDisplayed(driver, Table_Theme_Input)) {
		 					if(TC_CUSTOM_PIVOT_TABLE_FORMAT_001.equals("Yes")) {
		 						setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_001");
		 						 String TableThemeAct="";
		 						 List<WebElement> ThemeResultValues=getWebElements(driver, Table_Theme_Results);
		 						 for(WebElement ThemeResultValue:ThemeResultValues) {
		 							 if(ThemeResultValue.isSelected()) {
		 								 
		 								 String SelectedClass=ThemeResultValue.getAttribute("value");
		 								// System.out.println("SelectedClassValue "+SelectedClass);
		 								 TableThemeAct=SelectedClass;
		 							 }
		 						 }
		 						 //System.out.println("TableThemeAct : "+TableThemeAct);
		 						 if(TableThemeAct.equals("") ||TableThemeAct.equalsIgnoreCase("Default") ) {
		 							 pass(driver,"By default, Table theme value is selected as 'Default'");
		 						 }else {
		 							 fail(driver,"By default, Table theme value is not selected as 'Default'");
		 						 }
			 				}
		 					
		 					if(TC_CUSTOM_PIVOT_TABLE_FORMAT_002.equals("Yes")) {
		 						setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_002");
		 						mouseOverToElement(driver, Table_Theme_Input);
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
		 					
		 					if(TC_CUSTOM_PIVOT_TABLE_FORMAT_003.equals("Yes")) {
		 						setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_003");
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
		 				}
		 				
		 				setTestCaseID("TS_CUSTOM_PIVOT _TABLE_FORMAT_002");
		 				if(verifyElementDisplayed(driver, ODDEven_toggleTableFormat1)) {
		 					if(TC_CUSTOM_PIVOT_TABLE_FORMAT_004.equals("Yes")) {
		 						setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_004");
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
		 							 
		 							if(TC_CUSTOM_PIVOT_TABLE_FORMAT_005.equals("Yes")) {
				 						setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_005");
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
		 					
		 					if(TC_CUSTOM_PIVOT_TABLE_FORMAT_006.equals("Yes")) {
		 						 setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_006");
		 						 click(driver,ODDEven_toggleTableFormat1);
		 						 wait(driver,"1");
		 						 if(isToggleEnable(driver,OddEven_toggle_TableFormat)) {
		 							 fail(driver,"'Odd/Even Colors' input toggle is not changed to 'OFF' when click on it");
		 						 }else {
		 							 pass(driver,"'Odd/Even Colors' input toggle is changed to 'OFF' when click on it");
		 						 }
		 						 
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
		 				
		 				
		 				setTestCaseID("TS_CUSTOM_PIVOT _TABLE_FORMAT_003");
		 				if(verifyElementDisplayed(driver, FontFamily_Input_TableFormat)) {
		 					if(TC_CUSTOM_PIVOT_TABLE_FORMAT_007.equals("Yes")) {
		 						 setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_007");
		 						 String FontFamilyAct_TableFormat=getText1(driver,FontFamily_Input_TableFormat);
		 						 if(FontFamilyAct_TableFormat.equals(DefaultFontFamily_TableFormat)) {
		 							 pass(driver,"By default, '"+DefaultFontFamily_TableFormat+"' is selected in the Font Family input");
		 						 }else {
		 							 fail(driver,"By default, '"+DefaultFontFamily_TableFormat+"' is not selected in the Font Family input");
		 						 }
		 					}
		 					
		 					if(TC_CUSTOM_PIVOT_TABLE_FORMAT_008.equals("Yes")) {
		 						 setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_008");
		 						 click(driver,FontFamily_Input_TableFormat);
		 						 if(isDisplayed(driver,FontFamilyExpand_TableFormat)) {
		 							pass(driver,"FontFamily dropdown is expanded with results after click on it");
		 							if(TC_CUSTOM_PIVOT_TABLE_FORMAT_011.equals("Yes")) {
				 						 setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_011");
				 						 ScrollBarValidation1(driver,FontFamilyExpand_TableFormat,"Font_family_Custom_Pivot");
		 							}
		 							
		 							if(TC_CUSTOM_PIVOT_TABLE_FORMAT_010.equals("Yes")) {
				 						 setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_010");
				 						 if(isDisplayed(driver,SearchInput_FontFamilyDropdown)) {
				 							click(driver,SearchInput_FontFamilyDropdown);
				 							sendKeys(driver,SearchInput_FontFamilyDropdown,"adfaerf");
				 							wait(driver,"1");
				 							if(isDisplayed2(driver,NoResultsFound)) {
				 								pass(driver,"No Results found is displayed when search invalid inputs in the Font family Dropdown");
				 							}else {
				 								fail(driver,"No Results found is not displayed when search invalid inputs in the Font family Dropdown");
				 							}
				 							clear1(driver,SearchInput_FontFamilyDropdown);
				 						 }else {
				 							fail(driver,"Search Input is not present in the Fontfamily dropdown");
				 						 } 
		 							}
		 							if(TC_CUSTOM_PIVOT_TABLE_FORMAT_009.equals("Yes")) {
				 						 setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_009");
				 						 if(isDisplayed(driver,SearchInput_FontFamilyDropdown)) {
				 							pass(driver,"Search Input is present in the Fontfamily dropdown");
				 							click(driver,SearchInput_FontFamilyDropdown);
				 							sendKeys(driver,SearchInput_FontFamilyDropdown,Select_FontFamily_Value);
				 							wait(driver,"1");
				 							String FirstFontFamilyResult=getText1(driver,FontFamilyResult1);
				 							if(FirstFontFamilyResult.equals(Select_FontFamily_Value)) {
				 								pass(driver,"Seach functions works properly in the font family results");
				 							}else {
				 								fail(driver,"Seach functions not working properly in the font family results");
				 							}
				 							
				 						 }else {
				 							fail(driver,"Search Input is not present in the Fontfamily dropdown");
				 						 }
		 							}
		 							
		 							if(TC_CUSTOM_PIVOT_TABLE_FORMAT_012.equals("Yes")) {
				 						 setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_012");
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
		 					
		 				}
		 				
		 				setTestCaseID("TS_CUSTOM_PIVOT _TABLE_FORMAT_004");
		 				if(verifyElementDisplayed(driver, FontSizeInput_TableFormat)) {
		 					if(TC_CUSTOM_PIVOT_TABLE_FORMAT_013.equals("Yes")) {
		 						 setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_013");
		 					 	 String defaultFontSizeHeader=getTextJavascript(driver, FontSizeInput_TableFormat);
		 					 	 System.out.println("defaultFontSizeHeader : "+defaultFontSizeHeader);
		 					 	 if(DefaultFontSize_TableFormat.equals(defaultFontSizeHeader)) {
		 					 		pass(driver,"Predefined fontsize value '"+DefaultFontSize_TableFormat+"' is updated by default in the Header Font Size input");
		 					 	 }else {
		 					 		fail(driver,"Predefined fontsize value '"+DefaultFontSize_TableFormat+"' is not updated by default in the Header Font Size input");
		 					 	 }
		 					}
		 					
		 					if(TC_CUSTOM_PIVOT_TABLE_FORMAT_014.equals("Yes")) {
		 						 setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_014");
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
		 						 }else {
		 							fail(driver,"Header Font Size input is not Accessible");
		 						 }
		 					}
		 					if(TC_CUSTOM_PIVOT_TABLE_FORMAT_015.equals("Yes")) {
		 						 setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_015");
		 						 selectByText(driver,FontSizeInput_TableFormat,Select_HeaderFontSize_TableFormat);
		 						 wait(driver,"1");
		 						 String selectedFontSizeResult=getTextJavascript(driver, FontSizeInput_TableFormat);
		 						 if(selectedFontSizeResult.equals(Select_HeaderFontSize_TableFormat)) {
		 							pass(driver,"Selected Font size value updated in the Header FontSize input");
		 						 }else {
		 							fail(driver,"Selected Font size value is not updated in the Header FontSize input");
		 						 }
		 						 
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
		 					}
		 				}
		 				
		 				setTestCaseID("TS_CUSTOM_PIVOT _TABLE_FORMAT_005");
		 				if(verifyElementDisplayed(driver, HeaderColorInput_TableFormat)) {
		 					if(TC_CUSTOM_PIVOT_TABLE_FORMAT_018.equals("Yes")) {
		 						 setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_018");
		 						 String defaultHeaderColorAct=getTextJavascript(driver,HeaderColorInput_TableFormat);
		 						 System.out.println("defaultHeaderColorAct : "+defaultHeaderColorAct);
		 						 if(DefaultHeaderColor_TableFormat.equalsIgnoreCase(defaultHeaderColorAct)) {
		 							pass(driver,"By default '"+DefaultHeaderColor_TableFormat+"' color is selected in the Header Color Input");
		 						 }else {
		 							fail(driver,"By default '"+DefaultHeaderColor_TableFormat+"' color is not selected in the Header Color Input");
		 						 } 
		 					}
		 					
		 					if(TC_CUSTOM_PIVOT_TABLE_FORMAT_016.equals("Yes")) {
		 						 setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_016");
		 						 click(driver,HeaderColorInput_TableFormat);
		 						 if(isDisplayed(driver,ColorPickerOpen)) {
		 							pass(driver,"Color picker results opened after click on the Header Color Input");
				 					if(TC_CUSTOM_PIVOT_TABLE_FORMAT_017.equals("Yes")) {
				 						 setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_017");
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
		 					
		 					if(TC_CUSTOM_PIVOT_TABLE_FORMAT_019.equals("Yes")) {
		 						 setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_019");
		 						 click(driver,HeaderColorInput_TableFormat);
		 						 action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		 						 sendKeys(driver,HeaderColorInput_TableFormat,ChangeHeaderColor_TableFormat);
		 						 wait(driver,"1");
		 						 click3(driver,HeaderColorText_TableFormat);
		 						 String SelectedHeaderColorValue=getTextBackgroundColor(driver, HeaderColorInput_Pointer);
		 						 if(SelectedHeaderColorValue.equalsIgnoreCase(ChangeHeaderColor_TableFormat)) {
		 							pass(driver,"Manually Entered Color Value is updated in the Header Color input..");
		 						 }else {
		 							fail(driver,"Manually Entered Color Value is not updated in the Header Color input..");
		 						 }
		 				       
		 						if(TC_CUSTOM_PIVOT_TABLE_FORMAT_021.equals("Yes")) {
			 						 setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_021");
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
		 					}
		 				
		 					if(TC_CUSTOM_PIVOT_TABLE_FORMAT_020.equals("Yes")) {
		 						 setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_020");
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
		 				
		 				setTestCaseID("TS_CUSTOM_PIVOT _TABLE_FORMAT_006");
		 				if(verifyElementDisplayed(driver, WrapHeaded_toggle_TableFormat)) {
		 					if(TC_CUSTOM_PIVOT_TABLE_FORMAT_022.equals("Yes")) {
		 						 setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_022");
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
		 					
		 					if(TC_CUSTOM_PIVOT_TABLE_FORMAT_023.equals("Yes")) {
		 						 setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_023");
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
		 							
		 							if(TC_CUSTOM_PIVOT_TABLE_FORMAT_024.equals("Yes")) {
				 						 setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_024");
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
		 				}
		 				
		 				
		 				setTestCaseID("TS_CUSTOM_PIVOT _TABLE_FORMAT_007");
		 				if(verifyElementDisplayed(driver, BodyFontSize_Input_TableFormat)) {
		 					if(TC_CUSTOM_PIVOT_TABLE_FORMAT_025.equals("Yes")) {
		 						 setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_025");
		 						 String defaultBodyFontSize_Act=getTextJavascript(driver,BodyFontSize_Input_TableFormat);
		 						 if(defaultBodyFontSize_Act.equals(DefaultBodyFontSize_TableFormat)) {
		 							pass(driver,"By defualt, '"+DefaultBodyFontSize_TableFormat+"' is displayed in the Body Font Size Input");
		 						 }else {
		 							fail(driver,"By default,'"+DefaultBodyFontSize_TableFormat+"' is not displayed in the Body Font Size Input");
		 						 }
		 					}
		 					
		 					if(TC_CUSTOM_PIVOT_TABLE_FORMAT_026.equals("Yes")) {
		 						 setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_026");
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
		 						 }else {
		 							 fail(driver,"Body Font Size Input is not Accessible");
		 						 }
		 					}
		 					
		 					if(TC_CUSTOM_PIVOT_TABLE_FORMAT_027.equals("Yes")) {
		 						 setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_027");
		 						 selectByText(driver,BodyFontSize_Input_TableFormat,Select_BodyFontSize_TableFormat);
		 						 wait(driver,"1");
		 						 String selectedBodyFontSize=getTextJavascript(driver,BodyFontSize_Input_TableFormat);
		 						 if(selectedBodyFontSize.equals(Select_BodyFontSize_TableFormat)) {
		 							 pass(driver,"Selcted Font Size value updated in the Body Font Size Input");
		 						 }else {
		 							 fail(driver,"Selcted Font Size value not updated in the Body Font Size Input");
		 						 }
		 						
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
		 					}
		 				}
		 				
		 				setTestCaseID("TS_CUSTOM_PIVOT _TABLE_FORMAT_008");
		 				if(verifyElementDisplayed(driver, BorderInput_TableFormat)) {
		 					if(TC_CUSTOM_PIVOT_TABLE_FORMAT_028.equals("Yes")) {
		 						 setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_028");
		 						 String DefaultBorderType=defaultSelectedValue(driver,BorderInput_TableFormat);
		 						 if(DefaultBorderType_TableFormat.equals(DefaultBorderType)) {
		 							pass(driver,"By default, '"+DefaultBorderType_TableFormat+"' is displayed in the Border Input Field");
		 						 }else {
		 							fail(driver,"By default, '"+DefaultBorderType_TableFormat+"' is not displayed in the Border Input Field");
		 						 }
		 					}
		 					
		 					if(TC_CUSTOM_PIVOT_TABLE_FORMAT_029.equals("Yes")) {
		 						 setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_029");
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
		 					
		 					if(TC_CUSTOM_PIVOT_TABLE_FORMAT_030.equals("Yes")) {
		 						setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_030");
		 						selectByText(driver,BorderInput_TableFormat,Select_Border_Value_TableFormat);
		 						String selectedBorder=defaultSelectedValue(driver,BorderInput_TableFormat);
		 						System.out.println("selectedBorder : "+selectedBorder);
		 						if(selectedBorder.equals(Select_Border_Value_TableFormat)) {
		 							pass(driver,"Selcted Border value updated in the Border Input");
		 						}else {
		 							fail(driver,"Selcted Border value not updated in the Border Input");
		 						}
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
		 					}
		 				}
		 				
		 				
		 				setTestCaseID("TS_CUSTOM_PIVOT _TABLE_FORMAT_009");
		 				if(verifyElementDisplayed(driver, NegativeHighlight_toggle)) {
		 					if(TC_CUSTOM_PIVOT_TABLE_FORMAT_031.equals("Yes")) {
		 						setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_031");
		 						 if(isToggleEnable(driver,NegativeHighlight_Input)) {
		 							fail(driver,"By default, Negaitve Highlight Toggle is not displayed in 'OFF' Condition");
		 						 }else {
		 							pass(driver,"By default, Negaitve Highlight Toggle is displayed in 'OFF' Condition");
		 						 }
		 					}
		 					
		 					if(TC_CUSTOM_PIVOT_TABLE_FORMAT_032.equals("Yes")) {
		 						setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_032");
		 						click(driver,NegativeHighlight_toggle);
		 						wait(driver,"1");
		 						if(isToggleEnable(driver,NegativeHighlight_Input)) {
		 							pass(driver,"Negaitve Highlight Toggle is displayed in 'ON' Condition when click on it");
		 							String NegativetoggleONColor=getTextBackgroundColor(driver, NegativeHighlight_toggle);
		 							if(NegativetoggleONColor.equalsIgnoreCase("#2196F3")) {
		 								pass(driver,"NegativeHighlight Toggle is displayed in blue color when it is ON condition");
		 							}else {
		 								fail(driver,"NegativeHighlight Toggle is not displayed in blue color when it is ON condition");
		 							}
		 							
		 							if(TC_CUSTOM_PIVOT_TABLE_FORMAT_033.equals("Yes")) {
		 								setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_033");
		 								scrollUsingElement(driver, ApplyButton);
		 								 click(driver, ApplyButton);
		 								 elementnotvisible1(driver, RPE_Loading);
		 								 waitForElement(driver,ResultTableBody);
		 								 boolean negativecell=false;
		 								 String comp_id="";
		 								 
		 								 List<WebElement> resultTableCells=getWebElements(driver, TableCell);
		 								 for(WebElement resultTableCell:resultTableCells) {
		 									String Col_Id=resultTableCell.getAttribute("col-id");
		 									String ResultCellvalue=resultTableCell.getText();
		 									if(ResultCellvalue.startsWith("-")) {
		 										comp_id=resultTableCell.getAttribute("col-id");
		 										negativecell=true;
		 										break;
		 									}
		 								 }
		 								
		 								 if(negativecell==true) {
		 									WebElement negativeCellValue=driver.findElement(By.xpath("//div[@id='RPE_Preview']//div[@role='gridcell' and @col-id='"+comp_id+"']"));
		 									action.moveToElement(negativeCellValue).build().perform();
		 									String rgbFormatNegativeCell = negativeCellValue.getCssValue("background-color");
		 									String NegativeCellBackColorAct = rgbToHex(rgbFormatNegativeCell);
		 									if(NegativeCellBackColorAct.equalsIgnoreCase(NegativeCellColor_TableFormat)) {
		 										pass(driver,"Negative value cell is highlighted when the Negative highlight toggle is 'ON' condition");
		 									}else {
		 										fail(driver,"Negative value cell is not highlighted when the Negative highlight toggle is 'ON' condition");
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
		 							fail(driver,"Negaitve Highlight Toggle is not displayed in 'ON' Condition when click on it");
		 						}
		 					}
		 				}
		 				
		 				setTestCaseID("TS_CUSTOM_PIVOT _TABLE_FORMAT_010");
		 				if(verifyElementDisplayed(driver, Alignment_TableFormat)) {
		 					if(TC_CUSTOM_PIVOT_TABLE_FORMAT_034.equals("Yes")) {
 								setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_034");
 								if(isDisplayed2(driver,Allignment_active)) {
 									String aligned=getAttribute1(driver, Allignment_active, "data-align");
 									fail(driver,aligned+" Alignment is selected by default");
 								}else{
 									pass(driver,"No Alignment is selected by default");
 								}
		 					}
		 					
		 					if(TC_CUSTOM_PIVOT_TABLE_FORMAT_035.equals("Yes")) {
 								setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_035");
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
 						                    NumericalDefaultAlign=false;
 						                    FailedNumericCell=FailedNumericCell+", "+FailedNum;
 						                }
 						            } else {
 						                // Check if text cells are left-aligned
 						                if (!textAlign.contains("left")&& (!ColumnValue.contains(Select_Values_Column1))&& (!ColumnValue.contains(Select_Values_Column2))) {
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
		 					
		 					if(TC_CUSTOM_PIVOT_TABLE_FORMAT_036.equals("Yes")) {
 								setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_036");
 								//Right 
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
		 					}
		 					
		 					if(TC_CUSTOM_PIVOT_TABLE_FORMAT_037.equals("Yes")) {
 								setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_037");
 								 // Center
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
		 					}
		 					
		 					if(TC_CUSTOM_PIVOT_TABLE_FORMAT_038.equals("Yes")) {
 								setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_038");
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
		 					}
		 				}
		 				
		 				setTestCaseID("TS_CUSTOM_PIVOT _TABLE_FORMAT_011");
		 				if(verifyElementDisplayed(driver, SeperatorInput_TableFormat)) {
		 					if(TC_CUSTOM_PIVOT_TABLE_FORMAT_039.equals("Yes")) {
 								 setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_039");
 								 String defaultSeperatorSelect=defaultSelectedValue(driver, SeperatorInput_TableFormat);
 								 // System.out.println("defaultSeperatorSelect : "+defaultSeperatorSelect);
 								 if(defaultSeperatorSelect.equals("")||defaultSeperatorSelect.equals(DefaultSeperator_TableFormat)) {
 									 pass(driver,"By default, 'Select' is displayed in the seperater input");
 								 }else {
 									 fail(driver,"By default, 'Select' is not displayed in the seperater input");
 								 }
		 					}
		 					
		 					if(TC_CUSTOM_PIVOT_TABLE_FORMAT_040.equals("Yes")) {
								 setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_040");
								 click(driver,SeperatorInput_TableFormat);
								 verifyElementIsPresent(driver, SeparatorOption1);
								 verifyElementIsPresent(driver, SeperatorOption2);
		 					}
		 					
		 					if(TC_CUSTOM_PIVOT_TABLE_FORMAT_041.equals("Yes")) {
								 setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_041");
								 selectByText(driver, SeperatorInput_TableFormat, Change_Seperator_Option);
								 wait(driver,"1");
								 String AfterSelectSeperatorValue=getTextJavascript(driver, SeperatorInput_TableFormat);
								 System.out.println("AfterSelectSeperatorValue : "+AfterSelectSeperatorValue);
								 if(AfterSelectSeperatorValue.equals(Change_Seperator_Option)) {
									 pass(driver,"Selected seperator value is correctly displayed in the Seperator Input");
								 }else {
									 fail(driver,"Selected seperator value is not correctly displayed in the Seperator Input");
								 }
								 
								 if(TC_CUSTOM_PIVOT_TABLE_FORMAT_042.equals("Yes")) {
									 setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_042");
									 if(verifyElementDisplayed(driver, SeperatorSelectedColumnBox)) {
										 if(isDisplayed2(driver,AppliedSeperatorColoumn)) {
											 fail(driver,"By default, column value selected in the Seperator column box");
										 }else {
											 pass(driver,"By default, No column value selected in the Seperator column box");
										 }
									 }
								 }
								 if(TC_CUSTOM_PIVOT_TABLE_FORMAT_043.equals("Yes")) {
									 setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_043");
									 if(verifyElementDisplayed(driver, SelectAllCheckBox_Seperator)) {
										 click(driver,SeperatorSelectedColumnBox);
										 List<WebElement> availableSeperatorColoumnList=getWebElements(driver, SepertorAvailableColumns);
										 List<String> availableNumList=new ArrayList<String>();
										 for(WebElement ele:availableSeperatorColoumnList) {
											 String listtext=ele.getText();
											 availableNumList.add(listtext);
										 }
											
										 int availableSeperatorColoumnCount=availableSeperatorColoumnList.size();
										 setTestCaseID("TC_PIVOT_TABLE_FORMAT_095");
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
										 
										 if(TC_CUSTOM_PIVOT_TABLE_FORMAT_044.equals("Yes")) {
											 setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_044");
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
										 
										 
										 if(TC_CUSTOM_PIVOT_TABLE_FORMAT_045.equals("Yes")) {
											 setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_045");
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
		 				}
		 				
		 				setTestCaseID("TS_CUSTOM_PIVOT _TABLE_FORMAT_012");
		 				if(verifyElementDisplayed(driver, RoundOffInput_TableFormat)) {
		 					 if(TC_CUSTOM_PIVOT_TABLE_FORMAT_046.equals("Yes")) {
								 setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_046");
								 String defaultRoundOffSelect=defaultSelectedValue(driver, RoundOffInput_TableFormat);
								 System.out.println("defaultRoundOffSelect : "+defaultRoundOffSelect);
								 if(defaultRoundOffSelect.equals("")||defaultRoundOffSelect.equals(DefaultRoundOff_TableFormat)) {
									 pass(driver,"By default, 'Select' is displayed in the RoundOff input");
								 }else {
									 fail(driver,"By default, 'Select' is not displayed in the RoundOff input");
								 }
		 					 }
		 					
		 					if(TC_CUSTOM_PIVOT_TABLE_FORMAT_047.equals("Yes")) {
								 setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_047");
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
		 					
		 					if(TC_CUSTOM_PIVOT_TABLE_FORMAT_048.equals("Yes")) {
								 setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_048");
								 selectByText(driver, RoundOffInput_TableFormat, Change_RoundOff_Option);
								 wait(driver,"1");
								 String AfterSelectRoundOffValue=getTextJavascript(driver, RoundOffInput_TableFormat);
								 System.out.println("AfterSelectRoundOffValue : "+AfterSelectRoundOffValue);
								 if(AfterSelectRoundOffValue.equals(Change_RoundOff_Option)) {
									 pass(driver,"Selected RoundOff value is correctly displayed in the RoundOff Input");
								 }else {
									 fail(driver,"Selected RoundOff value is not correctly displayed in the RoundOff Input, Exp : "+Change_RoundOff_Option+" Act : "+AfterSelectRoundOffValue);
								 }
								 
								 if(TC_CUSTOM_PIVOT_TABLE_FORMAT_049.equals("Yes")) {
									 setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_049");
									 if(verifyElementDisplayed(driver, RoundOffSelectColumnBox)) {
										 if(isDisplayed2(driver,AppliedRoundOffColumns)) {
											 fail(driver,"By default, column value selected in the RoundOff column box");
										 }else {
											 pass(driver,"By default, No column value selected in the RoundOff column box");
										 }
									 }
								 }
								 
								 if(TC_CUSTOM_PIVOT_TABLE_FORMAT_050.equals("Yes")) {
									 setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_050");
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
											 
										 if(TC_CUSTOM_PIVOT_TABLE_FORMAT_051.equals("Yes")) {
											 setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_0511");
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
										 
										 
										 if(TC_CUSTOM_PIVOT_TABLE_FORMAT_052.equals("Yes")) {
											 setTestCaseID("TC_CUSTOM_PIVOT_ TABLE_FORMAT_052");
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
	        		}else {
	        			fail(driver,"Table Format Section is not expanded When Click on it");
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
	 		 sendKeys(driver,ChartTitleInput,"Custom Pivot Chart test");
	 		 click(driver,SaveBtn_Chart);
	 		 elementnotvisible1(driver, RPE_Loading);
	 		 if(!isDisplayed2(driver,chartSaveError1) && isDisplayed(driver,SavedChartTitleInput)) {
	 			 pass(driver,"Chart Saved Successfully");
	 		 }else {
	 			 fail(driver,"Chart not Saved Successfully");
	 		 }	
	      
	 		 String AfterSaveChartTitleName=getText1(driver, SavedChartTitleName);
	 		 if(AfterSaveChartTitleName.equalsIgnoreCase("Custom Pivot Chart test")) {
	 			 pass(driver,"Same Chart Title name displayed after saved the chart ");
	 		 }else {
	 			 fail(driver,"Different Chart Title name displayed after saved the chart ");
	 		 }
	        
		}// Custom Pivot Click ..
		
		
		
	}
}
