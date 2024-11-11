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
//		String SheetName_AxisTitle="";
//		String SheetName_ChartStyle="";
//		String SheetName_Legend="";
//		String SheetName_Others="";
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

		//Iteration inputs
		String Select_Categories_Value=Utils.getDataFromTestDataIteration(iteration,"Network_Widget_Testing", "Select_Categories_Value");
		
		
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
									 if(AvailableColumnList.size()-1==displayedDataImage.size()) {
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
											 List<WebElement> AvailableColumnList=getWebElements(driver, AvailableList_Dropdown);
											 String firstValue_=getText1(driver,FirstSearchedvalue);
											 if(firstValue_.contains(Select_Categories_Value) && AvailableColumnList.size()==1) {
												 pass(driver,"Searched Value correctly displayed first in the Categories dropdown");
											 }else {
												 fail(driver,"Searched Value not correctly displayed first in the Categories dropdown");
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
						 
						 
					 }
					 
					 
					 
					 
					 
				 }
				 
			 }
			
			
		}
		
	}
}
