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

public class DASHPRO_MULTIPLE_AXIS_TESTING extends Keywords{
	
	public void multipleAxisTesting(WebDriver driver, int iteration, String Flag) {
		
		String TestcaseFileName="DASHPRO_MULTIPLE_AXIS";
		String SheetName_Axes="MULTIPLE_AXIS_AXES";
		String SheetName_AxisTitle="MULTIPLE_AXIS_AXIS_TITLE";
		String SheetName_ChartStyle="MULTIPLE_AXIS_CHART_STYLE";
		String SheetName_DataLabels="MULTIPLE_AXIS_DATA_LABELS";
//		String SheetName_Others="";
		String TestcaseID_Flag="Flag";
		String TescasesID_Column="TEST CASE ID";
		//Yes/No Input for Testcases Id
		String TC_MUTLIPLE_AXIS_AXES_001=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_001",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_002=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_002",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_003=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_003",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_004=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_004",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_005=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_005",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_006=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_006",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_007=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_007",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_008=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_008",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_009=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_009",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_010=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_010",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_011=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_011",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_012=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_012",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_013=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_013",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_014=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_014",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_015=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_015",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_016=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_016",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_017=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_017",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_018=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_018",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_019=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_019",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_020=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_020",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_021=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_021",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_022=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_022",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_023=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_023",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_024=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_024",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_025=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_025",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_026=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_026",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_027=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_027",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_028=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_028",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_029=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_029",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_030=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_030",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_031=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_031",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_032=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_032",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_033=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_033",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_034=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_034",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_035=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_035",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_036=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_036",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_037=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_037",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_038=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_038",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_039=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_039",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_040=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_040",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_041=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_041",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_042=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_042",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_043=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_043",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_044=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_044",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_045=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_045",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_046=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_046",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_047=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_047",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_048=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_048",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_049=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_049",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_050=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_050",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_051=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_051",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_052=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_052",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_053=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_053",TestcaseID_Flag);
		String TC_MUTLIPLE_AXIS_AXES_054=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ MULTIPLEAXIS_054",TestcaseID_Flag);

		//Default inputs
		String AxesColor_Exp=Utils.getDataFromTestData("Axes", "Axes_Color_Exp");
		String default_FontFamily=Utils.getDataFromTestData("AxisTitle", "default_FontFamily");
		String default_FontSize_Exp=Utils.getDataFromTestData("AxisTitle", "default_FontSize");
		String Highlight_color_Exp=Utils.getDataFromTestData("Axes", "HighlightColor");
		String defaultRotation=Utils.getDataFromTestData("SmokeTesting_UI", "DefaultRotation_Column_AxisTitle_X");
		String defaultRotationY=Utils.getDataFromTestData("AxisTitle", "default_Rotation_Value");
		String RotationInputColor_Exp=Utils.getDataFromTestData("AxisTitle", "RotationInput_Color");
		String Default_Grid_distance_Column=Utils.getDataFromTestData("SmokeTesting_UI", "Default_Grid_distance_Column");
		String DefaultThemeValue_Exp=Utils.getDataFromTestData("ChartFormat_ChartStyle", "defaultThemeValue_Exp");
		String Highlight_ColorStyle_Exp=Utils.getDataFromTestData("ChartFormat_ChartStyle", "HighlightColor_Exp");

		//Iteration inputs
		//Axes
		String Categorical_DataType=Utils.getDataFromTestDataIteration(iteration,"Multiple_Axis_Widget_Testing", "Categorical_DataType");
		String Select_Category_Value=Utils.getDataFromTestDataIteration(iteration,"Multiple_Axis_Widget_Testing", "Select_Category_Value");
		String Select_Y_Axis_Value1=Utils.getDataFromTestDataIteration(iteration,"Multiple_Axis_Widget_Testing", "Select_Y_Axis_Value1");
		String Select_Y_Axis_Value2=Utils.getDataFromTestDataIteration(iteration,"Multiple_Axis_Widget_Testing", "Select_Y_Axis_Value2");
		String Select_Y_Axis_Value3=Utils.getDataFromTestDataIteration(iteration,"Multiple_Axis_Widget_Testing", "Select_Y_Axis_Value3");
		String Select_Aggregation_Value=Utils.getDataFromTestDataIteration(iteration,"Multiple_Axis_Widget_Testing", "Select_Aggregation_Value");
		String Select_SortBy_Value=Utils.getDataFromTestDataIteration(iteration,"Multiple_Axis_Widget_Testing", "Select_SortBy_Value");
		String SelectGroupValue_Date=Utils.getDataFromTestDataIteration(iteration,"Multiple_Axis_Widget_Testing", "SelectGroupValue_Date");
		String Select_Same_InputValue=Utils.getDataFromTestDataIteration(iteration,"Multiple_Axis_Widget_Testing", "Select_Same_InputValue");
		
		//Chart Title
		String TypeBackgroundColor1_ChartTitle=Utils.getDataFromTestDataIteration(iteration,"Multiple_Axis_Widget_Testing", "TypeBackgroundColor1_ChartTitle");
		String TypeTextColor1_ChartTitle=Utils.getDataFromTestDataIteration(iteration,"Multiple_Axis_Widget_Testing", "TypeTextColor1_ChartTitle");
		String Change_FontFamily_ChartTitle=Utils.getDataFromTestDataIteration(iteration,"Multiple_Axis_Widget_Testing", "Change_FontFamily_ChartTitle");
		String ChangeFontSize_ChartTitle=Utils.getDataFromTestDataIteration(iteration,"Multiple_Axis_Widget_Testing", "ChangeFontSize_ChartTitle");
		String ChangeChartTitleName=Utils.getDataFromTestDataIteration(iteration,"Multiple_Axis_Widget_Testing", "ChangeChartTitleName");
		
		setTestCaseID(" ");
		Actions action=new Actions(driver);
		mouseOverToElement(driver, ADDTabPlus);
  	    mouseOverAndClick(driver, ADDTabPlus);
  	    wait(driver,"1");
  	    sendKeys(driver,newlyAddedTab,"MultipleAxisTestTab");
  	    click(driver,DashProPage);
  	    elementnotvisible1(driver, RPE_Loading);
		waitForElement(driver,ADD_widget_rightTop);
	    click(driver,ADD_widget_rightTop);
	    elementnotvisible(driver,Loading);
	    elementnotvisible1(driver, RPE_Loading);
		waitForElement(driver,WidgetPanel);
		waitForElement(driver,Sparkline_widget);
		
		if(TC_MUTLIPLE_AXIS_AXES_001.equals("Yes")){
			setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_001");
			waitForElement(driver,Multiple_Axis_widget);
			verifyElementDisplayed(driver, Multiple_Axis_widget);
		}
		
		if(TC_MUTLIPLE_AXIS_AXES_002.equals("Yes")){
			setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_002");
			WidgetValidation(driver,Multiple_Axis_widget,"Multiple Axis");
			if(TC_MUTLIPLE_AXIS_AXES_003.equals("Yes")){
				setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_003");
				mouseOverToElement(driver, DashProPage);
				if(isDisplayed2(driver, WidgetText)) {
					fail(driver,"Tooltip displayed when the mouse cursor is moved away from the widget.");
				}else {
					pass(driver,"Tooltip displayed when the mouse cursor is moved away from the widget.");
				}
			}
		}
		
		if(TC_MUTLIPLE_AXIS_AXES_004.equals("Yes")){
			setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_004");
			click(driver,Multiple_Axis_widget);
			if(isDisplayed2(driver,error)){
				 String errorWidget=getText1(driver,error);
				 if(errorWidget.contains("Please refer the logs in Logs")) {
					 fail(driver,"Error displayed When Click Multiple Axis Widget, Validation : "+errorWidget);
				 }else {
					 pass(driver,"Error displayed When Click Multiple Axis Widget, Validation : "+errorWidget);
				 }
				 elementnotvisible1(driver, error);
			 }else {
				 elementnotvisible1(driver, Loading);
				 String widgetValue=getText1(driver,WidgetValue);
				 if(widgetValue.equals("Multiple Axis")) {
					 pass(driver,"'Multiple Axis' displayed as the selected Widget after click on it");
				 }else {
					 fail(driver,"'Multiple Axis' not displayed as the selected Widget after click on it");
				 }
				 
				 String AxesExpand=getAttribute1(driver,Axes_Expand,"class");
				 if(!AxesExpand.contains("up")) {
					 fail(driver,"By default, Axes Section is not Expanded");
				 }else {
					 pass(driver,"By default, Axes Section is Expanded");
					 if(TC_MUTLIPLE_AXIS_AXES_005.equals("Yes")){
						 setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_005");
						 scrollUsingElement(driver, ApplyButton);
						 click(driver,ApplyButton);
						 if(isDisplayed2(driver,Axes_applyError)) {
							 pass(driver,"'Kindly select category axis and y axis' error is displayed When Click Apply button without providing any inputs");
						 }else {
							 fail(driver,"'Kindly select category axis and y axis' error is not displayed When Click Apply button without providing any inputs");
						 }	
						 elementnotvisible1(driver, Axes_applyError);
					 }
					 
					 if(TC_MUTLIPLE_AXIS_AXES_006.equals("Yes")){
						 setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_006");
						 String default_Categories_Act=getText1(driver,Category_Input);
						 if(default_Categories_Act.equals("Select")) {
							 pass(driver,"By Default 'Select' is selected in the Category input");
						 }else {
							 fail(driver,"By Default 'Select' is not selected in the Category input");
						 }
					 }
					 
					 if(TC_MUTLIPLE_AXIS_AXES_007.equals("Yes")){
						 setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_007");
						 if(IsElementEnabled(driver, Category_Input)) {
							 click(driver,Category_Input);
							 if(isDisplayed2(driver, Category_dropdownExpand)) {
								 pass(driver,"Category dropdown is expanded when click the input");
								 if(TC_MUTLIPLE_AXIS_AXES_008.equals("Yes")){
									 setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_008");
									 List<WebElement> displayedDataImage=getWebElements(driver, dataTypeImages);
									 boolean categorical=true;
									 for(WebElement dataImag:displayedDataImage) {
										 action.moveToElement(dataImag).build().perform();
										 String dataTypeDisplay=dataImag.getAttribute("src");
										 if(dataTypeDisplay.contains("Categorical")||dataTypeDisplay.contains("Text")||dataTypeDisplay.contains("Numerical")||dataTypeDisplay.contains("Date")) {
											 
										 }else {
											 fail(driver,"Other than Categorical, Numerical, Text and Date datatype column is displayed in the Category dropdown");
											 categorical=false;
											 break;
										 }
									 }
									 if(categorical) {
										 pass(driver, "Only Categorical, Numerical, Text and Date datatype column is displayed in the category dropdown");
									 } 
								 }
								 
								 if(TC_MUTLIPLE_AXIS_AXES_009.equals("Yes")){
									 setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_009");
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
								 
								 if(TC_MUTLIPLE_AXIS_AXES_011.equals("Yes")){
									 setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_011");
									 List<WebElement> displayedDataImage=getWebElements(driver, dataTypeImages);
									 List<WebElement> AvailableColumnList=getWebElements(driver, AvailableList_Dropdown);
									 if(AvailableColumnList.size()-1==displayedDataImage.size()) {
										 pass(driver,"All the available columns are displayed with data Type icon in the Category dropdown");
									 }else {
										 fail(driver,"Some columns are not correctly displayed with data Type icon in the Category dropdown");
									 }
								 }
								 
								 if(TC_MUTLIPLE_AXIS_AXES_015.equals("Yes")){
									 setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_015");
									 ScrollBarValidation1(driver,Category_dropdownExpand,"Category_dropdown_MultipleAxis");
								 }
								 
								 if(TC_MUTLIPLE_AXIS_AXES_010.equals("Yes")){
									 setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_010");
									 if(verifyElementDisplayed(driver, dropdownInputsearchBox)) {
										 if(TC_MUTLIPLE_AXIS_AXES_014.equals("Yes")){
											 setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_014");
											 sendKeys(driver,dropdownInputsearchBox,"sdgffh");
											 if(isDisplayed(driver, NoResultsFound)) {
												 pass(driver,"'No results found' displayed when user enter incorrect value in Category search input");
											 }else {
												 fail(driver,"'No results found' not displayed when user enter incorrect value in Category search input");
											 }
											 clear2(driver,dropdownInputsearchBox);
										 }
										 
										 if(TC_MUTLIPLE_AXIS_AXES_013.equals("Yes")){
											 setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_013");
											 sendKeys(driver,dropdownInputsearchBox,Select_Same_InputValue);
											 String resultText=getText1(driver,FirstSearchedvalue);
											 if(resultText.contains(Select_Same_InputValue)) {
												 pass(driver,"Search input in the X Axis dropdown works properly for valid inputs");
											 }else {
												 fail(driver,"Search input in the X Axis dropdown not works properly for valid inputs");
											 }
										 }
									 }
								 }
								 
								 if(TC_MUTLIPLE_AXIS_AXES_012.equals("Yes")){
									 setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_012");
									 selectDropdownValue1(driver,Select_Same_InputValue);
									 wait(driver,"1");
									 String seletcedValue=getText1(driver,Category_Input);
									 if(seletcedValue.contains(Select_Same_InputValue)) {
										 pass(driver,"Selected value displayed in the Category Input after Selecting the Value");
									 }else {
										 fail(driver,"Selected value not displayed in the Category Input after Selecting the value");
									 }
									 if(isDisplayed2(driver,Category_dropdownExpand)) {
										 fail(driver,"Category dropdown not closed after selecting the value");
									 }else {
										 pass(driver,"Category dropdown closed automatically after Selecting the value");
									 }
								 }
								 
								 if(TC_MUTLIPLE_AXIS_AXES_016.equals("Yes")){
									 setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_016");
									 scrollUsingElement(driver, ApplyButton);
									 click(driver,ApplyButton);
									 if(isDisplayed2(driver,Axes_applyError)) {
										 pass(driver,"'Kindly select category axis and y axis' error is displayed When Click Apply button only selected Category input value");
									 }else {
										 fail(driver,"'Kindly select category axis and y axis' error is not displayed When Click Apply button only Selected Category input value");
									 }	
									 elementnotvisible1(driver, Axes_applyError);
								 }
								 
							 }else {
								 fail(driver,"Category dropdown is not expanded when click on it");
							 }
						 }else {
							 fail(driver,"Category Input is not Accessible");
						 }
					 }
					 
					 
					 if(TC_MUTLIPLE_AXIS_AXES_017.equals("Yes")){
						 setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_017");
						 if(isDisplayed2(driver,defaultInputValue)) {
							 String defaultText=getText1(driver,defaultInputValue);
							 fail(driver,"By default , Value ("+defaultText+") is selected in the Y Axis input when no selection is made");
						 }else {
							 pass(driver,"By default, no value is displayed in the Y Axis input when no selection is made");
						 }
					 }
					 
					 if(TC_MUTLIPLE_AXIS_AXES_027.equals("Yes")){
						 setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_027");
						 if(IsElementEnabled(driver, Y_Axis_Input_Group)) {
							 click(driver,Y_Axis_Input_Group);
							 if(verifyElementDisplayed(driver, Y_Axis_DropdownExpand)) {
								 selectDropdownValue1(driver, Select_Same_InputValue);
								 click(driver,Y_Axis_Text_Group);
								 wait(driver,"1");
								 if(isDisplayed2(driver, Y_Axis_DropdownExpand)) {
									 fail(driver,"Y Axis dropdown is not closed when click outside it");
								 }else {
									 //pass(driver,"Y Axis dropdown is closed when click outside it");
								 }
								 scrollUsingElement(driver, ApplyButton);
								 click(driver,ApplyButton);
								 if(isDisplayed(driver, error)) {
									 elementnotvisible1(driver, error);
									 fail(driver,"Error displayed when select same column value in the Category and Y Axis inputs");
								 }else {
									 pass(driver,"Error not displayed when select same column value in the Category and Y Axis inputs");
									 elementnotvisible1(driver, RPE_Loading);
									 if(isDisplayed2(driver, Chart_Section)) {
										 pass(driver,"Chart is displayed when given same value in both inputs");
									 }else {
										 fail(driver,"Chart is not displayed when given same value in both inputs");
									 }
								 }
								 Escape(driver);
								 mouseOverAndClick(driver, RemoveValuesInput);
							 }
						 }else {
							 fail(driver,"Y Axis input is not Accessible");
						 }
					 }
					 
					 
					 if(TC_MUTLIPLE_AXIS_AXES_018.equals("Yes")){
						 setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_018");
						 if(IsElementEnabled(driver, Y_Axis_Input_Group)) {
							 click(driver,Y_Axis_Input_Group);
							 if(isDisplayed2(driver,Y_Axis_DropdownExpand)) {
								 pass(driver,"Y Axis dropdown expanded when click on it");
								 if(TC_MUTLIPLE_AXIS_AXES_019.equals("Yes")){
									 setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_019");
									 List<WebElement> displayedDataImage=getWebElements(driver, dataTypeImages);
									 boolean categorical=true;
									 for(WebElement dataImag:displayedDataImage) {
										 action.moveToElement(dataImag).build().perform();
										 String dataTypeDisplay=dataImag.getAttribute("src");
										 if(dataTypeDisplay.contains("Categorical")||dataTypeDisplay.contains("Numerical")||dataTypeDisplay.contains("Text")||dataTypeDisplay.contains("Date")) {
											 
										 }else {
											 fail(driver,"Other than Categorical,Numerical,Text and Data datatype column is displayed in the Y Axis dropdown");
											 categorical=false;
											 break;
										 }
									 }
									 if(categorical) {
										 pass(driver, "Only Categorical,Numerical,Text and Data datatype column is displayed in the Y Axis dropdown");
									 } 
								 }
								 
								 if(TC_MUTLIPLE_AXIS_AXES_020.equals("Yes")){
									 setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_020");
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
								 
								 if(TC_MUTLIPLE_AXIS_AXES_022.equals("Yes")){
									 setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_022");
									 List<WebElement> displayedDataImage=getWebElements(driver, dataTypeImages);
									 List<WebElement> AvailableColumnList=getWebElements(driver, AvailableList_Dropdown);
									 if(AvailableColumnList.size()==displayedDataImage.size()) {
										 pass(driver,"All the available columns are displayed with data Type icon in the Y Axis dropdown");
									 }else {
										 fail(driver,"Some columns are not correctly displayed with data Type icon in the Y Axis dropdown");
									 }
								 }
								 if(TC_MUTLIPLE_AXIS_AXES_025.equals("Yes")){
									 setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_025");
									 ScrollBarValidation1(driver,Y_Axis_DropdownExpand,"Y_Axis_dropdown");
								 }
								 if(TC_MUTLIPLE_AXIS_AXES_026.equals("Yes")){
									 setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_026");
									 mouseOverToElement(driver, fourthValue);
									 if(isDisplayed2(driver, TooltipFourthValue)) {
										 pass(driver,"Tooltip is displayed when mouse over to the value in the dropdown");
									 }else {
										 fail(driver,"Tooltip is not displayed when mouse over to the value in the dropdown");
									 }
								 }
								 
								 if(TC_MUTLIPLE_AXIS_AXES_029.equals("Yes")){
									 setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_029");
									 List<WebElement> AvailableColumnList_Y_Axis=getWebElements(driver, AvailableList_Dropdown);
									 int columnListCount=AvailableColumnList_Y_Axis.size();
									 if(columnListCount>3) {
										 for (int k=0;k<=3;k++) {
											 WebElement availableColumn=AvailableColumnList_Y_Axis.get(k);
											 action.moveToElement(availableColumn).click().build().perform();
										 }
										 mouseOverAndClick(driver, Y_Axis_Text_Group);
										 scrollUsingElement(driver, ApplyButton);
										 click(driver,ApplyButton);
										 if(isDisplayed(driver,Y_Axis_LimitError)) {
											 pass(driver,"'Kindly select less than or equal to 3 column for Y axis' error displayed when Selecting more than 3 value in the Y Axis dropdown");
										 }else {
											 fail(driver,"'Kindly select less than or equal to 3 column for Y axis' error not displayed when Selecting more than 3 value in the Y Axis dropdown");
										 }
									 }
									 Escape(driver);
									 while(isDisplayed(driver,RemoveValuesInput)) {
										 WebElement RemoveSelectList=getWebElement(driver,RemoveValuesInput);
										 action.moveToElement(RemoveSelectList).click().build().perform();
										 wait(driver,"1");
									 }
									 if(isDisplayed2(driver, RemoveValuesInput)) {
										 fail(driver,"Selected Values are not removed while removing it");
									 }
									 click(driver,Y_Axis_Input_Group);
									 waitForElement(driver, Y_Axis_DropdownExpand);
									 elementnotvisible1(driver, Y_Axis_Limit_Error);
									 
								 }
								 
								 
								 if(TC_MUTLIPLE_AXIS_AXES_021.equals("Yes")){
									 setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_021");
									 if(verifyElementDisplayed(driver, dropdownInputsearchBox)) {
										 if(TC_MUTLIPLE_AXIS_AXES_024.equals("Yes")){
											 setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_024");
											 sendKeys(driver,dropdownInputsearchBox,"sdgffh");
											 if(isDisplayed(driver, NoResultsFound)) {
												 pass(driver,"'No results found' displayed when user enter incorrect value in Y Axis search input");
											 }else {
												 fail(driver,"'No results found' not displayed when user enter incorrect value in Y Axis search input");
											 }
											 clear2(driver,dropdownInputsearchBox);
											 sendKeys(driver,dropdownInputsearchBox,Select_Y_Axis_Value1);
											 String resultText=getText1(driver,FirstSearchedvalue);
											 if(resultText.contains(Select_Y_Axis_Value1)) {
												 pass(driver,"Search input in the Y Axis dropdown works properly for valid inputs");
											 }else {
												 fail(driver,"Search input in the Y Axis dropdown not works properly for valid inputs");
											 }
											 clear2(driver,dropdownInputsearchBox);
										 }
									 }
								 }
								 
								 setTestCaseID("TS_MUTLIPLE_AXIS_ AXES_005");
								 if(isDisplayed2(driver,Aggregation_SelectOption)) {
									 if(TC_MUTLIPLE_AXIS_AXES_030.equals("Yes")){
										 setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_030");
										 if(isDisplayed2(driver,Num_agg_fieldSortValue)) {
											 String defaultNumericalSelect=defaultSelectedValue(driver,Num_agg_fieldSortValue);
									 		 if(defaultNumericalSelect.equals("Sum")) {
									 			pass(driver,"'Sum' is selected as default for Numerical in Field sort ");
									     	 }else {
									 			fail(driver,"'Sum' is not selected as default for Numerical in Field sort ");
									     	 } 
										 }
									 }
									 
									 if(TC_MUTLIPLE_AXIS_AXES_031.equals("Yes")) {
										 setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_031");
										 if(isDisplayed2(driver, Cate_agg_fieldSortValue)) {
											 String defaultCategoricalSelect=defaultSelectedValue(driver,Cate_agg_fieldSortValue);
											 if(defaultCategoricalSelect.equals("Count")) {
									    		pass(driver,"'Count' is selected as default for Categorical in Y axis dropdown");
											 }else {
									    		fail(driver,"'Count' is not selected as default for Categorical Y axis dropdown ");
											 }
										 }
									 }
									 
									 if(TC_MUTLIPLE_AXIS_AXES_032.equals("Yes")) {
										 setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_032");
										 mouseOverAndClick(driver,Aggregation_SelectOption);
										 String firstValue=getAttribute1(driver, dataTypeImages, "src");
										 if(firstValue.contains("Categorical") || firstValue.contains("Text") || firstValue.contains("Date")) {
											 if(isDisplayed2(driver,sumDisabledFieldsortCate)) {
										 			pass(driver,"Sum disabled for Categorical value in Y Axis dropdown");
										         }else {
										 			fail(driver,"Sum not disabled for Categorical value in Y Axis dropdown");
										         }
										         
										         if(isDisplayed2(driver,AvgDisabledFieldsortCate)) {
										 			pass(driver,"Average disabled for Categorical value in Y Axis dropdown");
										         }else {
											 		fail(driver,"Average not disabled for Categorical value Y Axis dropdown");
										         }
										         
										         if(isDisplayed2(driver,minDisabledFieldsortCate)) {
										 			pass(driver,"Minimum disabled for Categorical value in Y Axis dropdown");
										         }else {
										 			fail(driver,"Minimum not disabled for Categorical value Y Axis dropdown");
										         }
										         
										         if(isDisplayed2(driver,maxDisabledFieldsortCate)) {
										 			pass(driver,"Maximum disabled for Categorical value in Y Axis dropdown");
										         }else {
										 			fail(driver,"Maximum not disabled for Categorical value in Y Axis dropdown");
										         }
										         
										         if(!isDisplayed2(driver,uniqueDisabledFieldsortCate)) {
										 			pass(driver,"Unique enabled for Categorical value in Y Axis dropdown");
										         }else {
										 			fail(driver,"Unique not enabled for Categorical value in Y Axis dropdown");
										         }
										         
										         if(!isDisplayed2(driver,countDisabledFieldsortCate)) {
											 		pass(driver,"Count enabled for Categorical value in Y Axis dropdown");
										         }else {
												 	fail(driver,"Count not enabled for Categorical value in Y Axis dropdown");
										         } 
										 }else {
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
										 }
										 mouseOverAndClick(driver,Aggregation_SelectOption);
										 if(TC_MUTLIPLE_AXIS_AXES_033.equals("Yes")) {
											 setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_033");
											 try {
												 WebElement selectY_Element=driver.findElement(By.xpath("//span[contains(text(),'"+Select_Y_Axis_Value1+"')]/ancestor::li//select"));
												 action.moveToElement(selectY_Element).click().build().perform();
												 selectByText_WebElement(driver, selectY_Element, Select_Aggregation_Value);
												 pass(driver,Select_Aggregation_Value+" value selected in the Aggregation");
											 }catch(Exception e) {
												 fail(driver," Failed to select the aggregation Value");
											 }
										 }
									 }
								 }else {
									 fail(driver,"Aggregation input is not Available");
								 }
								 
								 if(TC_MUTLIPLE_AXIS_AXES_023.equals("Yes")){
									 setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_023");
									 selectDropdownValue1(driver,Select_Y_Axis_Value1);
									 wait(driver,"1");
									 String seletcedValue=getText1(driver,defaultInputValue);
									 if(seletcedValue.contains(Select_Y_Axis_Value1)) {
										 pass(driver,"Selected value displayed in the Y_Axis Input after Selecting the Value");
									 }else {
										 fail(driver,"Selected value not displayed in the Y_Axis Input after Selecting the value");
									 }
									 selectDropdownValue1(driver,Select_Y_Axis_Value2);
									 selectDropdownValue1(driver,Select_Y_Axis_Value3);
									 click(driver,Y_Axis_Text_Group);
									 wait(driver,"1");
									 if(isDisplayed2(driver, Y_Axis_DropdownExpand)) {
										 fail(driver,"Y Axis dropdown is not closed when click outside it");
									 }else {
										// pass(driver,"Y Axis dropdown is closed when click outside it");
									 }
									 
									 if(TC_MUTLIPLE_AXIS_AXES_028.equals("Yes")){
										 setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_028");
										 click(driver,Category_Input);
										 waitForElement(driver,SelectOption);
										 click(driver,SelectOption);
										 scrollUsingElement(driver, ApplyButton);
										 click(driver,ApplyButton);
										 if(isDisplayed2(driver,Axes_applyError)) {
											 pass(driver,"'Kindly select category axis and y axis' error is displayed When Click Apply button only selected Y Axis input value");
										 }else {
											 fail(driver,"'Kindly select category axis and y axis' error is not displayed When Click Apply button only Selected Y Axis input value");
										 }	
										 click(driver,Category_Input);
										 waitForElement(driver,Category_dropdownExpand);
										 selectDropdownValue1(driver, Select_Same_InputValue);
										 elementnotvisible1(driver, Axes_applyError);
									 }
								 }
							 }else {
								 fail(driver,"Y Axis dropdown is not expanded when click on it");
							 }
						 }else {
							 fail(driver,"Y Axis input is not accessible");
						 }
					 }
					 
					 if(TC_MUTLIPLE_AXIS_AXES_034.equals("Yes")){
						 setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_034");
						 scrollUsingElement(driver, ApplyButton);
						 click(driver,ApplyButton);
						 elementnotvisible1(driver, RPE_Loading);
						 if(verifyElementDisplayed(driver, Chart_Section)) {
							 if(isDisplayed2(driver, Y_Chart_Values)) {
								 List<WebElement> Y_ValuesDisplayed=getWebElements(driver, Y_Chart_Values);
								 if(Y_ValuesDisplayed.size()==3) {
									 pass(driver,"Selected 3 Y Axis is displayed in the chart");
								 }else {
									 fail(driver,"Selected 3 Y-Axis is not displayed in the chart");
								 }
							 }else {
								 fail(driver,"Y axis value not displayed in the chart");
							 }
							 
							 if(isDisplayed2(driver, X_Value_RadarChart)) {
								 String categoryValueChart=getText1(driver, X_Value_RadarChart);
								 if(Select_Same_InputValue.contains(categoryValueChart)) {
									 pass(driver,"Selected Category Value displayed in X Axis in the Chart");
								 }else {
									 fail(driver,"Selected Category Value not displayed in X Axis in the Chart, Act Value : "+categoryValueChart);
								 }
							 }else {
								 fail(driver,"Selected Category Value not displayed in X Axis in the Chart");
							 }
						 }
					 }
					 
					 if(TC_MUTLIPLE_AXIS_AXES_035.equals("Yes")){
						 setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_035");
						 if(isDisplayed2(driver, sortType)) {
							 pass(driver,"Sort type input is displayed after selecting the Y Value");
							 if(TC_MUTLIPLE_AXIS_AXES_036.equals("Yes")){
								 setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_036");
								 String defaultSortType=defaultSelectedValue(driver,sortType);
								 if(defaultSortType.equals("Quick Sort")) {
									 pass(driver,"'Quick Sort' is selected by default in the sortType input");
								 }else {
									 fail(driver,"'Quick Sort' is not selected by default in the sortType input");
								 }
							 }
							 
							 if(TC_MUTLIPLE_AXIS_AXES_037.equals("Yes")){
								 setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_037");
								 click(driver,sortType);
								 verifyElementIsPresent1(driver, QuickSort);
								 verifyElementIsPresent1(driver, FieldSort);
							 }
							 
							 if(TC_MUTLIPLE_AXIS_AXES_038.equals("Yes")){
								 setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_038");
								 selectByText(driver,sortType,"Quick Sort");
								 if(verifyElementDisplayed(driver, sortBy)) {
									 click(driver,sortBy);
									 if(isDisplayed2(driver, sortByDropdownExpand)) {
										 pass(driver,"Sort by dropdown is expanded when click on it ");
										 if(TC_MUTLIPLE_AXIS_AXES_039.equals("Yes")){
											 setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_039");
											 if(isDisplayed2(driver,inputFieldSort)) {
												 pass(driver,"Search input is present in the Sort By input dropdown");
											 }else {
												 fail(driver,"Search input is not present in the Sort By input dropdown");
											 }
										 }
										 
										 if(TC_MUTLIPLE_AXIS_AXES_040.equals("Yes")){
											 setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_040");
											 List<WebElement> SortByValues=getWebElements(driver,sortByValues);
											 int SortByValuesCount=SortByValues.size();
											 if(SortByValuesCount==5) {
												 pass(driver,"Only Category and Y values are displayed in the sortBy field for Quicksort condition");
											 }else {
												 fail(driver,"Other Category X and Y values are displayed in the sortBy field for Quicksort condition");
											 }
										 }
										 Escape(driver);
									 }else {
										 fail(driver,"Sort by dropdown is not expanded when click on it ");
									 }
								 }
							 }
							 
							 
							 if(TC_MUTLIPLE_AXIS_AXES_041.equals("Yes")){
								 setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_041");
								 selectByText(driver,sortType,"Field Sort");
								 click(driver,sortBy1);
								 setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_038");
								 if(isDisplayed2(driver, sortByDropdownExpand)) {
									 setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_041");
									 List<WebElement> SortByValues1=getWebElements(driver,sortByValues1);
									 int SortByValuesCount=SortByValues1.size();
									 if(SortByValuesCount<=5) {
										 fail(driver,"Only Category and Y values are displayed in the sortBy field for Fieldsort condition");
									 }else {
										 pass(driver,"All values are displayed in the sortBy field for Fieldsort condition");
									 }
									 
									 if(TC_MUTLIPLE_AXIS_AXES_043.equals("Yes")){
										 setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_043");
										 ScrollBarValidation1(driver, ListFieldSection, "Field_Sort_Multiple_Axis"); 
									 }
									 if(TC_MUTLIPLE_AXIS_AXES_042.equals("Yes")){
										 setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_042");
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
									 
									 setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_039");
									 if(isDisplayed2(driver,inputFieldSort)) {
										 if(TC_MUTLIPLE_AXIS_AXES_047.equals("Yes")){
											 setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_047");
											 //click(driver,inputFieldSort);
											 sendKeys(driver, inputFieldSort, "dgrehtj");
											 if(isDisplayed(driver,NoResultsFound)) {
												 pass(driver,"No results found is displayed for invalid input");
											 }else {
												 fail(driver,"No results found is not displayed for invalid input");
											 }
											 clear1(driver,inputFieldSort);
										 }
										 if(TC_MUTLIPLE_AXIS_AXES_044.equals("Yes")){
											 setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_044");
											 sendKeys(driver, inputFieldSort, Select_Category_Value);
											 String firstList=getText1(driver, FirstField);
											 if(firstList.equals(Select_Category_Value)) {
												 pass(driver,"Search input inside the field sort working properly");
											 }else {
												 fail(driver,"Search input inside the field sort not working properly");
											 }
											 if(TC_MUTLIPLE_AXIS_AXES_045.equals("Yes")){
												 setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_045");
												 selectDropdownValue1(driver, Select_Category_Value);
												 String appliedSort=getText1(driver, sortedInput);
												 if(appliedSort.contains(Select_Category_Value)) {
													 pass(driver,"Column Value selected when click the Value in the field sort");
												 }else {
													 fail(driver,"Column Value not selected when click the Value in the field sort");
												 }
											 }
											 
											 if(TC_MUTLIPLE_AXIS_AXES_046.equals("Yes")){
												 setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_046");
												 clearAndType1(driver, inputFieldSort, Select_Y_Axis_Value1);
												 action.sendKeys(Keys.ENTER).build().perform();
												 wait(driver,"1");
												 String appliedSort=getText1(driver, sortedInput);
												 if(appliedSort.contains(Select_Y_Axis_Value1)) {
													 pass(driver,"Column Value selected when click Enter in the field sort");
												 }else {
													 fail(driver,"Column Value not selected when click Enter in the field sort");
												 }
											 }
										 }
									 }else {
										 fail(driver,"Search input is not present in the sortby dropdown");
									 }
									 
								 }else {
									 fail(driver,"Sort by dropdown is not expanded after click on it when Field sort is selected");
								 }
							 }
							 
							 
							 if(TC_MUTLIPLE_AXIS_AXES_048.equals("Yes")){
								 setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_048");
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
								 elementnotvisible1(driver, sortError);
							 }
							 
							 if(TC_MUTLIPLE_AXIS_AXES_049.equals("Yes")){
								  setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_049");
								 try {
									 click(driver,quickSortBytext);
									 WebElement selectSort=driver.findElement(By.xpath("//ul//span[text()='"+Select_SortBy_Value+"']"));
									 selectSort.click();
									 //String QuickSortByText=getText1(driver,quickSortBytext);
									 scrollUsingElement(driver, ApplyButton);
									 click(driver,ApplyButton);
									 elementnotvisible1(driver, RPE_Loading);
									 if(isDisplayed2(driver,error)) {
										 fail(driver,"Error displayed When click Apply button after providing the inputs values");
									 }else {
										 verifyElementDisplayed(driver, ChartGraph);
									 }
									
								 }catch(Exception e) {
									 fail(driver,"Failed to select the Sort field Value  :"+e.getLocalizedMessage());
								 }
							 }
							 
						 }else {
							 fail(driver,"Sort type input is not displayed after selecting the Y Value");
						 }
					 }
					 
					 if(TC_MUTLIPLE_AXIS_AXES_050.equals("Yes")){
						 setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_050");
						 click(driver,Category_Input);
						 waitForElement(driver,Category_dropdownExpand);
						 selectDropdownValue(driver,Categorical_DataType,Select_Category_Value);
						 if(Categorical_DataType.equals("Date")) {
							 verifyElementDisplayed(driver,GroupText);
							 if(isDisplayed(driver,groupDropdown)) {
								 pass(driver,"Group selection input option is displayed While select Date datatype in Category input");
								 if(TC_MUTLIPLE_AXIS_AXES_051.equals("Yes")){
									 setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_051");
									 String default_Categories_Act=getText1(driver,groupDropdown);
									 if(default_Categories_Act.equals("Select")) {
										 pass(driver,"By Default 'Select' is selected in the Group input");
									 }else {
										 fail(driver,"By Default 'Select' is not selected in the Group input");
									 }
								 }
								 
								 if(TC_MUTLIPLE_AXIS_AXES_052.equals("Yes")){
									 setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_052");
									 scrollUsingElement(driver, ApplyButton);
									 click(driver,ApplyButton);
									 if(isDisplayed(driver,date_Group_Error)) {
										 pass(driver,"'Kindly select group' error is displayed When click apply button without providing Group input value");
									 }else {
										 fail(driver,"'Kindly select group' error is not displayed When click apply button without providing Group input value");
									 }
								 }
								 
								 if(TC_MUTLIPLE_AXIS_AXES_053.equals("Yes")){
									 setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_053");
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
								 }
									
							 }else {
								 fail(driver,"Group selection input option is not displayed While select Date datatype in Y_axis");
							 }
						 }
					 }
					 
					 if(TC_MUTLIPLE_AXIS_AXES_054.equals("Yes")){
						  setTestCaseID("TC_MUTLIPLE_AXIS_ AXES_054");
						  if(verifyElementDisplayed(driver, AscDescButton)) {
							  List<WebElement> charts=getWebElements(driver,ChartPoints);
							  String sortByValue=getText1(driver,quickSortBytext);
							  scrollUsingElement(driver, ApplyButton);
							  click(driver,ApplyButton);
							  elementnotvisible1(driver, RPE_Loading);
							  if(verifyElementDisplayed(driver, ChartGraph)) {
								  try {
									  graphOrderValidation2(driver,charts,sortByValue);
								  }catch(Exception e) {
									  System.out.println("Grpah Validation Failed");
									  e.printStackTrace();
								  }
							  }
							  
							  String sortValueBefore=getAttribute1(driver,AscDes,"value");
							  click(driver,AscDescButton);
							  String sortValueAfter=getAttribute1(driver,AscDes,"value");
							  if(sortValueBefore.equals(sortValueAfter)) {
								  fail(driver,"Ascending Descending not changed while click Asc/Desc button");
							  }else {
								  pass(driver,"Ascending Descending changed while click Asc/Desc button");
								  scrollUsingElement(driver, ApplyButton);
								  click(driver,ApplyButton);
								  elementnotvisible1(driver, RPE_Loading);
								  if(verifyElementDisplayed(driver, ChartGraph)) {
									  charts=getWebElements(driver,ChartPoints);
									  try {
										  graphOrderValidation2(driver,charts,sortByValue);
									  }catch(Exception e) {
										  System.out.println("Grpah Validation Failed");
										  e.printStackTrace();
									  }
								  }
							  }
						  }
					 }
				 }//Axes expanded
				 
				 setTestCaseID("");
				 // ******************** Axis Title Validation Start ******************* 
				 String Multiple_Axis_Axis_Title= getCellValue("TestExecution","Testcase_Selection","Multiple_Axis_Axis_Title",Flag);
				 if(Multiple_Axis_Axis_Title.equals("Yes")) {
					 String TC_MUTLIPLE_AXIS_AXIS_TITLE_001=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ MULTIPLE AXIS_001",TestcaseID_Flag);
					 String TC_MUTLIPLE_AXIS_AXIS_TITLE_002=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ MULTIPLE AXIS_002",TestcaseID_Flag);
					 String TC_MUTLIPLE_AXIS_AXIS_TITLE_003=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ MULTIPLE AXIS_003",TestcaseID_Flag);
					 String TC_MUTLIPLE_AXIS_AXIS_TITLE_004=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ MULTIPLE AXIS_004",TestcaseID_Flag);
					 String TC_MUTLIPLE_AXIS_AXIS_TITLE_005=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ MULTIPLE AXIS_005",TestcaseID_Flag);
					 String TC_MUTLIPLE_AXIS_AXIS_TITLE_006=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ MULTIPLE AXIS_006",TestcaseID_Flag);
					 String TC_MUTLIPLE_AXIS_AXIS_TITLE_007=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ MULTIPLE AXIS_007",TestcaseID_Flag);
					 String TC_MUTLIPLE_AXIS_AXIS_TITLE_008=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ MULTIPLE AXIS_008",TestcaseID_Flag);
					 String TC_MUTLIPLE_AXIS_AXIS_TITLE_009=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ MULTIPLE AXIS_009",TestcaseID_Flag);
					 String TC_MUTLIPLE_AXIS_AXIS_TITLE_010=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ MULTIPLE AXIS_010",TestcaseID_Flag);
					 String TC_MUTLIPLE_AXIS_AXIS_TITLE_011=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ MULTIPLE AXIS_011",TestcaseID_Flag);
					 String TC_MUTLIPLE_AXIS_AXIS_TITLE_012=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ MULTIPLE AXIS_012",TestcaseID_Flag);
					 String TC_MUTLIPLE_AXIS_AXIS_TITLE_013=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ MULTIPLE AXIS_013",TestcaseID_Flag);
					 String TC_MUTLIPLE_AXIS_AXIS_TITLE_014=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ MULTIPLE AXIS_014",TestcaseID_Flag);
					 String TC_MUTLIPLE_AXIS_AXIS_TITLE_015=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ MULTIPLE AXIS_015",TestcaseID_Flag);
					 String TC_MUTLIPLE_AXIS_AXIS_TITLE_016=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ MULTIPLE AXIS_016",TestcaseID_Flag);
					 String TC_MUTLIPLE_AXIS_AXIS_TITLE_017=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ MULTIPLE AXIS_017",TestcaseID_Flag);
					 String TC_MUTLIPLE_AXIS_AXIS_TITLE_018=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ MULTIPLE AXIS_018",TestcaseID_Flag);
					 String TC_MUTLIPLE_AXIS_AXIS_TITLE_019=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ MULTIPLE AXIS_019",TestcaseID_Flag);
					 String TC_MUTLIPLE_AXIS_AXIS_TITLE_020=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ MULTIPLE AXIS_020",TestcaseID_Flag);
					 String TC_MUTLIPLE_AXIS_AXIS_TITLE_021=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ MULTIPLE AXIS_021",TestcaseID_Flag);
					 String TC_MUTLIPLE_AXIS_AXIS_TITLE_022=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ MULTIPLE AXIS_022",TestcaseID_Flag);
					 String TC_MUTLIPLE_AXIS_AXIS_TITLE_023=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ MULTIPLE AXIS_023",TestcaseID_Flag);
					 String TC_MUTLIPLE_AXIS_AXIS_TITLE_024=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ MULTIPLE AXIS_024",TestcaseID_Flag);
					 String TC_MUTLIPLE_AXIS_AXIS_TITLE_025=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ MULTIPLE AXIS_025",TestcaseID_Flag);
					 String TC_MUTLIPLE_AXIS_AXIS_TITLE_026=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ MULTIPLE AXIS_026",TestcaseID_Flag);
					 String TC_MUTLIPLE_AXIS_AXIS_TITLE_027=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ MULTIPLE AXIS_027",TestcaseID_Flag);
					
					 //Axis Title
					 String Change_X_Title_Name=Utils.getDataFromTestDataIteration(iteration,"Multiple_Axis_Widget_Testing", "Change_X_Title_Name");
					 String Change_Y_Title_Name=Utils.getDataFromTestDataIteration(iteration,"Multiple_Axis_Widget_Testing", "Change_Y_Title_Name");
					 String Change_Y1_Title_Name=Utils.getDataFromTestDataIteration(iteration,"Multiple_Axis_Widget_Testing", "Change_Y1_Title_Name");
					 String Change_Y2_Title_Name=Utils.getDataFromTestDataIteration(iteration,"Multiple_Axis_Widget_Testing", "Change_Y2_Title_Name");
					 String ChangeFontFamily_AxisTitle=Utils.getDataFromTestDataIteration(iteration,"Multiple_Axis_Widget_Testing", "ChangeFontFamily_AxisTitle");
					 String ChangeTitleFontSize_AxisTitle=Utils.getDataFromTestDataIteration(iteration,"Multiple_Axis_Widget_Testing", "ChangeTitleFontSize_AxisTitle");
					 String Change_X_label_FontSize=Utils.getDataFromTestDataIteration(iteration,"Multiple_Axis_Widget_Testing", "Change_X_label_FontSize");
					 String Change_Y_label_FontSize=Utils.getDataFromTestDataIteration(iteration,"Multiple_Axis_Widget_Testing", "Change_Y_label_FontSize");
					 String Change_X_Rotation_Input=Utils.getDataFromTestDataIteration(iteration,"Multiple_Axis_Widget_Testing", "Change_X_Rotation_Input");
					 String Change_Y_Rotation_Input=Utils.getDataFromTestDataIteration(iteration,"Multiple_Axis_Widget_Testing", "Change_Y_Rotation_Input");
					
					 if(TC_MUTLIPLE_AXIS_AXIS_TITLE_001.equals("Yes")) {
						 setTestCaseID("TC_MUTLIPLE_AXIS_ AXIS_TITLE_001");
						 if(verifyElementDisplayed(driver, AxisTitle)) {
							 click(driver,AxisTitle);
							 wait(driver,"1");
							 String AxisExpand=getAttribute1(driver,AxisTitleExpand,"class");
							 if(AxisExpand.contains("up")) {
								 pass(driver,"Axis Title section is Expanded after click on it");
								 
								 if(TC_MUTLIPLE_AXIS_AXIS_TITLE_002.equals("Yes")) {
									 setTestCaseID("TC_MUTLIPLE_AXIS_ AXIS_TITLE_002");
									 String AxesTextColor_Act=getTextColor(driver,AxisTitle);
									 if(AxesColor_Exp.equalsIgnoreCase(AxesTextColor_Act)) {
										 pass(driver," 'Axis Title' highlighted in blue color");
									 }else {
										 fail(driver," 'Axis Title' not highlighted in blue color");
									 }
								 }
								 
								 if(TC_MUTLIPLE_AXIS_AXIS_TITLE_003.equals("Yes")) {
									 setTestCaseID("TC_MUTLIPLE_AXIS_ AXIS_TITLE_003");
									 clearAndType(driver,X_Title_input,Change_X_Title_Name);
									 clearAndType(driver,Y_Title_input,Change_Y_Title_Name);
									 clearAndType(driver,Y1_Title_Input,Change_Y1_Title_Name);
									 clearAndType(driver,Y2_Title_Input,Change_Y2_Title_Name);
									 scrollUsingElement(driver, ApplyButton);
									 click(driver,ApplyButton);
									 elementnotvisible1(driver, RPE_Loading);
									 if(verifyElementDisplayed(driver,ChartGraph)) {
										 List<WebElement> Y_values_Chart=getWebElements(driver, Y_Chart_Values);
										 String Y_Title_ValueChart=Y_values_Chart.get(0).getText();
										 String Y1_Title_ValueChart=Y_values_Chart.get(2).getText();
										 String Y2_Title_ValueChart=Y_values_Chart.get(1).getText();
										 String X_ChartText=getText1(driver,X_Value_RadarChart);
										 if(X_ChartText.equals(Change_X_Title_Name)) {
											 pass(driver,"Given X Title ("+Change_X_Title_Name+") input value updated in the X Axis chart");
										 }else {
											 fail(driver,"Given X Title ("+Change_X_Title_Name+") input value not updated in the X Axis chart");
										 }
							     	       	
										 if(Y_Title_ValueChart.equals(Change_Y_Title_Name)) {
											 pass(driver,"Given Y Title ("+Change_Y_Title_Name+") input value updated in the Y Axis chart");
										 }else {
											 fail(driver,"Y Title ("+Change_Y_Title_Name+") input value not updated in the Y Axis chart");
										 }
										 
										 if(Y1_Title_ValueChart.equals(Change_Y1_Title_Name)) {
											 pass(driver,"Given Y1 Title ("+Change_Y1_Title_Name+") input value updated in the Y1 Axis chart");
										 }else {
											 fail(driver,"Y1 Title ("+Change_Y1_Title_Name+") input value not updated in the Y1 Axis chart");
										 }
										 
										 if(Y2_Title_ValueChart.equals(Change_Y2_Title_Name)) {
											 pass(driver,"Given Y2 Title ("+Change_Y2_Title_Name+") input value updated in the Y2 Axis chart");
										 }else {
											 fail(driver,"Y2 Title ("+Change_Y2_Title_Name+") input value not updated in the Y2 Axis chart");
										 }
									 }
								 }
								 
								 setTestCaseID("TS_MUTLIPLE_AXIS_ AXIS_TITLE_002");
								 if(verifyElementDisplayed(driver, fontFamily_dropdown)) {
									 if(TC_MUTLIPLE_AXIS_AXIS_TITLE_004.equals("Yes")) {
										 setTestCaseID("TC_MUTLIPLE_AXIS_ AXIS_TITLE_004");
										 String fontFamily_Value=getText1(driver,fontFamily_dropdown);
										 System.out.println("FontFamily_Value : "+fontFamily_Value);
										 if(fontFamily_Value.equals(default_FontFamily)) {
											 pass(driver,"By default, "+default_FontFamily+" displayed in the Font Family input");
										 }else {
											 fail(driver,"By default, "+default_FontFamily+" is not displayed in the Font Family input");
										 }
									 }
									 
									 if(TC_MUTLIPLE_AXIS_AXIS_TITLE_005.equals("Yes")) {
										 setTestCaseID("TC_MUTLIPLE_AXIS_ AXIS_TITLE_005");
										 if(IsElementEnabled(driver, fontFamily_dropdown)) {
											 click(driver,fontFamily_dropdown);
											 if(isDisplayed(driver,fontFamily_DropdownExpand)) {
												 pass(driver,"Font family dropdown is expanded after click on it");
												 if(TC_MUTLIPLE_AXIS_AXIS_TITLE_007.equals("Yes")) {
													 setTestCaseID("TC_MUTLIPLE_AXIS_ AXIS_TITLE_007");
													 ScrollBarValidation1(driver,fontFamily_DropdownExpand,"Font_Family_Multiple_Axis");
												 }
												 
												 if(TC_MUTLIPLE_AXIS_AXIS_TITLE_006.equals("Yes")) {
													 setTestCaseID("TC_MUTLIPLE_AXIS_ AXIS_TITLE_006");
													 if(verifyElementDisplayed(driver, dropdownInputsearchBox)) {
														 sendKeys(driver,dropdownInputsearchBox,"sdgffh");
														 if(isDisplayed(driver, NoResultsFound)) {
															 pass(driver,"'No results found' displayed when user enter incorrect value in Font Family search input");
														 }else {
															 fail(driver,"'No results found' not displayed when user enter incorrect value in Font Family search input");
														 }
														 clear2(driver,dropdownInputsearchBox);
														 sendKeys(driver,dropdownInputsearchBox,ChangeFontFamily_AxisTitle);
														 String resultText=getText1(driver,fontFamilyFirstResult);
														 if(resultText.contains(ChangeFontFamily_AxisTitle)) {
															 pass(driver,"Search input in the Font Family dropdown works properly for valid inputs");
														 }else {
															 fail(driver,"Search input in the Font Family dropdown not works properly for valid inputs");
														 } 
													 }
												 }
												 
												 if(TC_MUTLIPLE_AXIS_AXIS_TITLE_008.equals("Yes")) {
													 setTestCaseID("TC_MUTLIPLE_AXIS_ AXIS_TITLE_008");
													 selectFontFamily(driver,ChangeFontFamily_AxisTitle);
													 wait(driver,"1");
													 click(driver,fontFamily_dropdown);
													 waitForElement(driver,fontFamily_DropdownExpand);
													 wait(driver,"1");
													 String selectedColorAct=getTextBackgroundColor(driver,ListSelected);
													 //System.out.println("Highlight_color_Exp : "+Highlight_color_Exp+"selectedColorAct : "+selectedColorAct);
													 String highlightText=getText1(driver,listSelectedText1);
													 if((highlightText.contains(ChangeFontFamily_AxisTitle))&&Highlight_color_Exp.equalsIgnoreCase(selectedColorAct)) {
														pass(driver,"Selected Value ("+ChangeFontFamily_AxisTitle+") highlighted in blue color");
													 }else {
														fail(driver,"Selected Value ("+ChangeFontFamily_AxisTitle+") not highlighted in blue color");
													 }
												 }
												 
												 if(TC_MUTLIPLE_AXIS_AXIS_TITLE_009.equals("Yes")) {
													 setTestCaseID("TC_MUTLIPLE_AXIS_ AXIS_TITLE_009");
													 selectFontFamily(driver,ChangeFontFamily_AxisTitle);
													 wait(driver,"1");
													 String fontFamily_Act=getText1(driver,fontFamily_dropdown);
													 if(fontFamily_Act.equals(ChangeFontFamily_AxisTitle)) {
														 pass(driver,"Selected Font Family is updated in the FontFmaily input");
													 }else {
														 fail(driver,"Selected Font Family is not updated in the FontFmaily input");
													 }
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
														 
														 String fontFamily_X_Act=getFontFamily(driver,X_Value_RadarChart);
														 if(fontFamily_X_Act.equals(ChangeFontFamily_AxisTitle)) {
								     	   			     	pass(driver,"Selected fontFamily ("+ChangeFontFamily_AxisTitle+") Updated in X Axis chart value");
														 }else {
															 fail(driver,"Selected FontFamily ("+ChangeFontFamily_AxisTitle+") is not Updated in X Axis chart value");
														 } 
													 }
												 }
											 }else {
												 fail(driver,"Font Family dropdown is not expanded after click on it");
											 }
										 }else {
											 fail(driver,"Font Family dropdown is not Accessible");
										 }
									 }
								 }
								 
								 setTestCaseID("TS_MUTLIPLE_AXIS_ AXIS_TITLE_003");
								 if(verifyElementDisplayed(driver, titleFontSizeDropdown)) {
									 if(TC_MUTLIPLE_AXIS_AXIS_TITLE_010.equals("Yes")) {
										 setTestCaseID("TC_MUTLIPLE_AXIS_ AXIS_TITLE_010");
										 String font_Size_Act=defaultSelectedValue(driver,titleFontSizeDropdown);
										 //System.out.println("Font_Size : "+font_Size_Act);
										 if(font_Size_Act.equals(default_FontSize_Exp)) {
											 pass(driver,"By default, "+default_FontSize_Exp+" displayed in the Title Font Size input");
										 }else {
											 fail(driver,"By default, "+default_FontSize_Exp+" is not displayed in the Title Font Size input");
										 }
									 }
									 
									 setTestCaseID("TC_MUTLIPLE_AXIS_ AXIS_TITLE_003");
									 if(IsElementEnabled(driver, titleFontSizeDropdown)) {
										 if(TC_MUTLIPLE_AXIS_AXIS_TITLE_011.equals("Yes")) {
											 setTestCaseID("TC_MUTLIPLE_AXIS_ AXIS_TITLE_011");
											 click(driver,titleFontSizeDropdown);
											 verifyElementIsPresent1(driver, TitleFontSizeOptions);
										 }
										 
										 if(TC_MUTLIPLE_AXIS_AXIS_TITLE_012.equals("Yes")) {
											 setTestCaseID("TC_MUTLIPLE_AXIS_ AXIS_TITLE_012");
											 selectByText(driver, titleFontSizeDropdown, ChangeTitleFontSize_AxisTitle);
											 wait(driver,"1");
											 scrollUsingElement(driver, ApplyButton);
											 click(driver,ApplyButton);
											 elementnotvisible1(driver, RPE_Loading);
											 if(verifyElementDisplayed(driver,ChartGraph)) {
												 String fontSize_Y_Act=getFontSize(driver,Y_Value);
												 String fontSize_X_Act=getFontSize(driver,X_Value_RadarChart);
												 if((ChangeTitleFontSize_AxisTitle.equals(fontSize_Y_Act))&&ChangeTitleFontSize_AxisTitle.equals(fontSize_X_Act)) {
													 pass(driver,"Given Title Font Size Updated in X-Axis Title and Y-Axis Title chart value");
												 }else {
													 fail(driver,"Given Title Font Size '"+ChangeTitleFontSize_AxisTitle+"' not Updated in X-Axis Title or Y-Axis Title chart value");
												 }
											 }
											 
										 }
										 
									 }else {
										 fail(driver,"Title Font Size input is not Accessible");
									 }
								 }
								 
								 setTestCaseID("TS_MUTLIPLE_AXIS_ AXIS_TITLE_004");
								 if(verifyElementDisplayed(driver, X_axisFontSizeDropdown)) {
									 if(TC_MUTLIPLE_AXIS_AXIS_TITLE_013.equals("Yes")) {
										 setTestCaseID("TC_MUTLIPLE_AXIS_ AXIS_TITLE_013");
										 String X_font_Size_Act=defaultSelectedValue(driver,X_axisFontSizeDropdown);
										 System.out.println("X Font_Size : "+X_font_Size_Act);
										 if(X_font_Size_Act.equals(default_FontSize_Exp)) {
											 pass(driver,"By default, "+default_FontSize_Exp+" displayed in the X axis Font Size input");
										 }else {
											 fail(driver,"By default, "+default_FontSize_Exp+" is not displayed in the X axis Font Size input");
										 }
									 }
									 
									 setTestCaseID("TS_MUTLIPLE_AXIS_ AXIS_TITLE_004");
									 if(IsElementEnabled(driver, X_axisFontSizeDropdown)) {
										 
										 if(TC_MUTLIPLE_AXIS_AXIS_TITLE_014.equals("Yes")) {
											 setTestCaseID("TC_MUTLIPLE_AXIS_ AXIS_TITLE_014");
											 click(driver,X_axisFontSizeDropdown);
											 verifyElementIsPresent1(driver, X_axisFontSizeDropdownOptions);
										 }
										 
										 if(TC_MUTLIPLE_AXIS_AXIS_TITLE_015.equals("Yes")) {
											 setTestCaseID("TC_MUTLIPLE_AXIS_ AXIS_TITLE_015");
											 selectByText(driver,X_axisFontSizeDropdown,Change_X_label_FontSize);
											 scrollUsingElement(driver, ApplyButton);
											 click(driver,ApplyButton);
											 elementnotvisible1(driver, RPE_Loading);
											 if(verifyElementDisplayed(driver,ChartGraph)) {
												 if(isDisplayed2(driver,X_AxisValues_MultipleAxis)) {
													 String fontSize_X_label_Act=getFontSize(driver,X_AxisValues_MultipleAxis);
													 if(Change_X_label_FontSize.equals(fontSize_X_label_Act)) {
														 pass(driver,"Selected fontSize ("+Change_X_label_FontSize+") Updated in X Axis label chart value");
													 }else {
														 fail(driver,"Selected fontSize  ("+Change_X_label_FontSize+") not Updated in X Axis label chart value");
													 }
												 }else {
													 fail(driver,"X Axis values not present in the Chart");
												 }
											 }
										 }
									 }else {
										 fail(driver,"X Axis Font Size Input not Accessible");
									 }
								 }
								 
								 setTestCaseID("TS_MUTLIPLE_AXIS_ AXIS_TITLE_005");
								 if(verifyElementDisplayed(driver, Y_axisFontSizeDropdown)) {
									 if(TC_MUTLIPLE_AXIS_AXIS_TITLE_016.equals("Yes")) {
										 setTestCaseID("TC_MUTLIPLE_AXIS_ AXIS_TITLE_016");
										 String Y_font_Size_Act=defaultSelectedValue(driver,Y_axisFontSizeDropdown);
										 if(Y_font_Size_Act.equals(default_FontSize_Exp)) {
					     	      			pass(driver,"By default, "+default_FontSize_Exp+" displayed in the Y axis Font Size input");
										 }else {
					     	           	    fail(driver,"By default, "+default_FontSize_Exp+" is not displayed in the Y axis Font Size input");
										 }
									 }
									 
									 setTestCaseID("TS_MUTLIPLE_AXIS_ AXIS_TITLE_005");
									 if(IsElementEnabled(driver, Y_axisFontSizeDropdown)) {
										 if(TC_MUTLIPLE_AXIS_AXIS_TITLE_017.equals("Yes")) {
											 setTestCaseID("TC_MUTLIPLE_AXIS_ AXIS_TITLE_017");
											 click(driver,Y_axisFontSizeDropdown);
								 			 verifyElementIsPresent1(driver, Y_axisFontSizeDropdownOptions);
										 }
										 
										 if(TC_MUTLIPLE_AXIS_AXIS_TITLE_018.equals("Yes")) {
											 setTestCaseID("TC_MUTLIPLE_AXIS_ AXIS_TITLE_018");
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
										 fail(driver,"Y axis Label FontSize is not Accessible");
									 }
								 }
								 
								 setTestCaseID("TS_MUTLIPLE_AXIS_ AXIS_TITLE_006");
								 if(verifyElementDisplayed(driver, X_RotationInputSlider)) {
									 if(TC_MUTLIPLE_AXIS_AXIS_TITLE_019.equals("Yes")) {
										 setTestCaseID("TC_MUTLIPLE_AXIS_ AXIS_TITLE_019");
										 String X_RotationValueAct=getText1(driver,X_RotationOutputValue);
										 System.out.println("X rotation : "+X_RotationValueAct);
										 if(X_RotationValueAct.equals(defaultRotation)) {
											 pass(driver,"By default, '"+defaultRotation+"' displayed in the X axis Rotation output field");
										 }else {
											 fail(driver,"By default, '"+defaultRotation+"' is not displayed in the X axis Rotation output field");
										 }
										 
										 String X_Rotation_Color_Act=getTextBackgroundColor(driver,X_RotationOutputValue);
										 if(RotationInputColor_Exp.equalsIgnoreCase(X_Rotation_Color_Act)) {
											 pass(driver,"X rotation output highlighted in blue color");
										 }else {
											 fail(driver,"X rotation output not highlighted in blue color");
										 }
									 }
									 
									 
									 if(TC_MUTLIPLE_AXIS_AXIS_TITLE_020.equals("Yes")) {
										 setTestCaseID("TC_MUTLIPLE_AXIS_ AXIS_TITLE_020");
										 if(IsElementEnabled(driver, X_RotationInputSlider)) {
											 pass(driver,"X Rotation input is Accessible");
											 moveSlider(driver,X_RotationInputSlider,X_RotationOutputValue,Change_X_Rotation_Input);
											 scrollUsingElement(driver, ApplyButton);
											 click(driver,ApplyButton);
											 elementnotvisible1(driver, RPE_Loading);
											 if(TC_MUTLIPLE_AXIS_AXIS_TITLE_021.equals("Yes")) {
												 setTestCaseID("TC_MUTLIPLE_AXIS_ AXIS_TITLE_021");
												 String Y_label_Rotation_Act1=getRotationValue(driver,Column_Y_Labels_Chart);
												 if(Change_X_Rotation_Input.equals(Y_label_Rotation_Act1)) {
													 fail(driver,"Selected X Rotation Angle ("+Change_X_Rotation_Input+") Updated in Y Axis label chart value");
												 }else {
													 pass(driver,"Selected X Rotation Angle ("+Change_X_Rotation_Input+") is not Updated in Y Axis label chart value");
												 }
											 }
											 if(TC_MUTLIPLE_AXIS_AXIS_TITLE_022.equals("Yes")) {
												 setTestCaseID("TC_MUTLIPLE_AXIS_ AXIS_TITLE_022");
												 String X_label_Rotation_Act=getRotationValue(driver,X_AxisValues_MultipleAxis);
												 if(Change_X_Rotation_Input.equals(X_label_Rotation_Act)) {
													 pass(driver,"Selected X Rotation Angle ("+Change_X_Rotation_Input+") Updated in X Axis label chart value");
												 }else {
													 fail(driver,"Selected X Rotation Angle ("+Change_X_Rotation_Input+") is not Updated in X Axis label chart value");
												 }
											 }
										 }else {
											 fail(driver,"X Rotation input is not Accessible");
										 }
									 }
								 }
								 
								 setTestCaseID("TS_MUTLIPLE_AXIS_ AXIS_TITLE_007");
								 if(verifyElementDisplayed(driver, Y_RotationInputSlider)) {
									 if(TC_MUTLIPLE_AXIS_AXIS_TITLE_023.equals("Yes")) {
										 setTestCaseID("TC_MUTLIPLE_AXIS_ AXIS_TITLE_023");
										 String Y_RotationValueAct=getText1(driver,Y_RotationOutputValue);
										 System.out.println("Y rotation : "+Y_RotationValueAct);
										 if(Y_RotationValueAct.equals(defaultRotationY)) {
											 pass(driver,"By default, '"+defaultRotationY+"' displayed in the Y axis Rotation output field");
										 }else {
											 fail(driver,"By default, '"+defaultRotationY+"' not displayed in the Y axis Rotation output field");
										 }
										 
										 String X_Rotation_Color_Act=getTextBackgroundColor(driver,Y_RotationOutputValue);
										 if(RotationInputColor_Exp.equalsIgnoreCase(X_Rotation_Color_Act)) {
											 pass(driver,"Y rotation output highlighted in blue color");
										 }else {
											 fail(driver,"Y rotation output not highlighted in blue color");
										 }
									 }
									 
									 if(TC_MUTLIPLE_AXIS_AXIS_TITLE_024.equals("Yes")) {
										 setTestCaseID("TC_MUTLIPLE_AXIS_ AXIS_TITLE_024");
										 if(IsElementEnabled(driver, Y_RotationInputSlider)) {
											 pass(driver,"Y Rotation input is Accessible");
											 moveSlider(driver,Y_RotationInputSlider,Y_RotationOutputValue,Change_Y_Rotation_Input);
											 scrollUsingElement(driver, ApplyButton);
											 click(driver,ApplyButton);
											 elementnotvisible1(driver, RPE_Loading);
											 if(TC_MUTLIPLE_AXIS_AXIS_TITLE_025.equals("Yes")) {
												 setTestCaseID("TC_MUTLIPLE_AXIS_ AXIS_TITLE_025");
												 String X_label_Rotation_Act1=getRotationValue(driver,X_AxisValues_MultipleAxis);
												 if(Change_Y_Rotation_Input.equals(X_label_Rotation_Act1)) {
													 fail(driver,"Selected Y Rotation Angle ("+Change_Y_Rotation_Input+") Updated in X Axis label chart value");
												 }else {
													 pass(driver,"Selected Y Rotation Angle ("+Change_Y_Rotation_Input+") is not Updated in X Axis label chart value");
												 }
											 }
											 
											 if(TC_MUTLIPLE_AXIS_AXIS_TITLE_026.equals("Yes")) {
												 setTestCaseID("TC_MUTLIPLE_AXIS_ AXIS_TITLE_026");
												 String Y_label_Rotation_Act=getRotationValue(driver,Column_Y_Labels_Chart);
												 if(Change_Y_Rotation_Input.equals(Y_label_Rotation_Act)) {
													 pass(driver,"Selected Rotation Angle ("+Change_Y_Rotation_Input+") Updated in Y Axis label chart value");
												 }else {
													 fail(driver,"Selected Rotation Angle ("+Change_Y_Rotation_Input+") is not Updated in Y Axis label chart value");
												 }
											 }
										 }else {
											 fail(driver,"Y Rotation input is not Accessible");
										 }
									 }
								 }
								 
								 if(TC_MUTLIPLE_AXIS_AXIS_TITLE_027.equals("Yes")) {
									 setTestCaseID("TC_MUTLIPLE_AXIS_ AXIS_TITLE_027");
									 if(verifyElementDisplayed(driver,switchSlider)){		   		
										 if(isToggleEnable(driver, switchSliderInput)) {
											 fail(driver,"By default Start axis at 0 toggle enabled");
										 }else {
											 pass(driver,"By default Start axis at 0 toggle disabled");
											 if(IsElementEnabled(driver, switchSliderInput)) {
												 click(driver,switchSlider);
												 scrollUsingElement(driver, ApplyButton);
												 click(driver,ApplyButton);
												 elementnotvisible1(driver, RPE_Loading);
												 if(verifyElementDisplayed(driver,Chart_Section)) {
													 String x_firstAscValue=getText1(driver,X_AxisValues_MultipleAxis);
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
												 
											 }else {
												 fail(driver,"Start Axis at 0 input toggle is not accessible");
											 }
										 }
									 }
								 }
								 
							 }else {
								 fail(driver,"Axis Title section is not Expanded after click on it");
							 }
						 }
					 }// Axis title click
				 }
				// ******************** Axis Title Validation End ******************* 
				 
				 setTestCaseID("");
				 // ******************** Chart Title Validation Start ******************* 
				 String Multiple_Axis_Chart_Title= getCellValue("TestExecution","Testcase_Selection","Multiple_Axis_Chart_Title",Flag);
				 if(Multiple_Axis_Chart_Title.equals("Yes")) {
					 CHART_TITLE chartTitle=new CHART_TITLE();
					 chartTitle.chartTitleTest(driver, TypeBackgroundColor1_ChartTitle, TypeTextColor1_ChartTitle, Change_FontFamily_ChartTitle, ChangeFontSize_ChartTitle,ChangeChartTitleName);
				 }
				 // ******************** Chart Title Validation End ******************* 
				 
				 setTestCaseID("");
				 // ******************** Chart Style Validation Start ******************* 
				 String Multiple_Axis_Chart_Style= getCellValue("TestExecution","Testcase_Selection","Multiple_Axis_Chart_Style",Flag);
				 if(Multiple_Axis_Chart_Style.equals("Yes")) {
					 String TC_MUTLIPLE_AXIS_CHART_STYLE_001=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ MULTIPLE AXIS_001",TestcaseID_Flag);
					 String TC_MUTLIPLE_AXIS_CHART_STYLE_002=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ MULTIPLE AXIS_002",TestcaseID_Flag);
					 String TC_MUTLIPLE_AXIS_CHART_STYLE_003=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ MULTIPLE AXIS_003",TestcaseID_Flag);
					 String TC_MUTLIPLE_AXIS_CHART_STYLE_004=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ MULTIPLE AXIS_004",TestcaseID_Flag);
					 String TC_MUTLIPLE_AXIS_CHART_STYLE_005=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ MULTIPLE AXIS_005",TestcaseID_Flag);
					 String TC_MUTLIPLE_AXIS_CHART_STYLE_006=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ MULTIPLE AXIS_006",TestcaseID_Flag);
					 String TC_MUTLIPLE_AXIS_CHART_STYLE_007=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ MULTIPLE AXIS_007",TestcaseID_Flag);
					 String TC_MUTLIPLE_AXIS_CHART_STYLE_008=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ MULTIPLE AXIS_008",TestcaseID_Flag);
					 String TC_MUTLIPLE_AXIS_CHART_STYLE_009=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ MULTIPLE AXIS_009",TestcaseID_Flag);
					 String TC_MUTLIPLE_AXIS_CHART_STYLE_010=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ MULTIPLE AXIS_010",TestcaseID_Flag);
					 String TC_MUTLIPLE_AXIS_CHART_STYLE_011=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ MULTIPLE AXIS_011",TestcaseID_Flag);
					 String TC_MUTLIPLE_AXIS_CHART_STYLE_012=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ MULTIPLE AXIS_012",TestcaseID_Flag);
					 String TC_MUTLIPLE_AXIS_CHART_STYLE_013=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ MULTIPLE AXIS_013",TestcaseID_Flag);
					 String TC_MUTLIPLE_AXIS_CHART_STYLE_014=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ MULTIPLE AXIS_014",TestcaseID_Flag);
				 	 String TC_MUTLIPLE_AXIS_CHART_STYLE_015=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ MULTIPLE AXIS_015",TestcaseID_Flag);
				 	 String TC_MUTLIPLE_AXIS_CHART_STYLE_016=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ MULTIPLE AXIS_016",TestcaseID_Flag);
				 	 String TC_MUTLIPLE_AXIS_CHART_STYLE_017=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ MULTIPLE AXIS_017",TestcaseID_Flag);
				 	 String TC_MUTLIPLE_AXIS_CHART_STYLE_018=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_ MULTIPLE AXIS_018",TestcaseID_Flag);
				 	
				 	 //Iteration inputs
			    	 String Change_ChartTheme_ChartStyle=Utils.getDataFromTestDataIteration(iteration,"Multiple_Axis_Widget_Testing", "Change_ChartTheme_ChartStyle");
			 		 String Change_Grid_Distance=Utils.getDataFromTestDataIteration(iteration,"Multiple_Axis_Widget_Testing", "Change_Grid_Distance");
				 	 
				 	 if(TC_MUTLIPLE_AXIS_CHART_STYLE_001.equals("Yes")) {
						setTestCaseID("TC_MUTLIPLE_AXIS_ CHART_STYLE_001");
						if(verifyElementDisplayed(driver,Chart_FormatSec)) {
							click(driver,Chart_FormatSec);
							String ChartFormatOpenstatus=getAttribute1(driver, chartFormatExpand, "class");
							if(ChartFormatOpenstatus.contains("up")) {
								pass(driver,"Chart Format is expanded when clicking the Chart Format");
								if(TC_MUTLIPLE_AXIS_CHART_STYLE_002.equals("Yes")) {
									setTestCaseID("TC_MUTLIPLE_AXIS_ CHART_STYLE_002");
									String ChartStylingExpand=getAttribute1(driver, ChartStyling_Expand, "class");
				   	  				if(!ChartStylingExpand.contains("up")) {
				   	  					fail(driver,"By default, Chart Styling not gets Expanded");
				   	  				}else {
				   	  					pass(driver,"By default, Chart Styling gets Expanded");
				   	  					if(TC_MUTLIPLE_AXIS_CHART_STYLE_003.equals("Yes")) {
				   	  						setTestCaseID("TC_MUTLIPLE_AXIS_ CHART_STYLE_003");
				   	  						verifyElementDisplayed(driver,ChartThemeText);
				   	  						verifyElementDisplayed(driver,ChartThemeInput);
		   	  	    			   	
				   	  						verifyElementDisplayed(driver,X_ScrollText);
				   	  						verifyElementDisplayed(driver,X_ScrollInputSlider);
				   	  						
				   	  						verifyElementDisplayed(driver,Y_ScrollText);
		   	  								verifyElementDisplayed(driver,Y_ScrollInputSlider);
		   	  	    			
		   	  								verifyElementDisplayed(driver,EnableGridText);
		   	  								verifyElementDisplayed(driver,EnableGrid_InputSlider);
		   	  	    			
		   	  								verifyElementDisplayed(driver,Grid_Distance_Input);
				   	  					}
				   	  					
				   	  					setTestCaseID("TS_MUTLIPLE_AXIS_ CHART_STYLE_003");
				   	  					if(isDisplayed(driver,ChartThemeInput)) {
				   	  						if(TC_MUTLIPLE_AXIS_CHART_STYLE_004.equals("Yes")) {
				   	  							setTestCaseID("TC_MUTLIPLE_AXIS_ CHART_STYLE_004");
				   	  							String defaultThemeValue_Act=getText1(driver,ChartThemeInput);
				   	  							if(defaultThemeValue_Act.equals(DefaultThemeValue_Exp)) {
				   	  								pass(driver,"By default, Chart theme selected the value as '"+DefaultThemeValue_Exp+"'");
				   	  							}else {
				   	  								fail(driver,"By default, '"+DefaultThemeValue_Exp+"' value not selected in the Chart theme input");
				   	  							}
				   	  						}
				   	  					
				   	  						setTestCaseID("TS_MUTLIPLE_AXIS_ CHART_STYLE_003");
				   	  						if(IsElementEnabled(driver, ChartThemeInput)) {
				   	  							if(TC_MUTLIPLE_AXIS_CHART_STYLE_005.equals("Yes")) {
				   	  								setTestCaseID("TC_MUTLIPLE_AXIS_ CHART_STYLE_005");
				   	  								click(driver,ChartThemeInput);
				   	  								if(isDisplayed2(driver,ChartThemeResults)) {
				   	  									pass(driver,"Chart Theme results dropdown is displayed after click on it");
				   	  									
				   	  									if(TC_MUTLIPLE_AXIS_CHART_STYLE_007.equals("Yes")) {
				   	  										setTestCaseID("TC_MUTLIPLE_AXIS_ CHART_STYLE_007");
				   	  										mouseOverToElement(driver,ThirdListValue);
				   	  										wait(driver,"1");
				   	  										String textAct=getText1(driver,ThirdListValue);
				   	  										String titleValue=getAttribute1(driver, ThirdListValue, "title");
				   	  										if(titleValue.equals(textAct)) {
				   	  											pass(driver,"Tooltip correctly displayed when mouse hover the chart theme value");
				   	  										}else {
				   	  											fail(driver,"Tooltip not correctly displayed when mouse hover the chart theme value");
				   	  										}
				   	  										
				   	  										String mouseHighlightColor=getTextBackgroundColor(driver,ThirdValue);
				   	  										if(Highlight_ColorStyle_Exp.equalsIgnoreCase(mouseHighlightColor)) {
				   	  											pass(driver,"Mouse hovered value highlighted in blue color");
				   	  										}else {
				   	  											fail(driver,"Mouse hovered value not highlighted in blue color");
				   	  										}
				   	  									}
				   	  									
				   	  									if(TC_MUTLIPLE_AXIS_CHART_STYLE_008.equals("Yes")) {
				   	  										setTestCaseID("TC_MUTLIPLE_AXIS_ CHART_STYLE_008");
				   	  										ScrollBarValidation1(driver,ChartThemeResults,"Chart_Theme");
				   	  									}
				   	  									
				   	  									if(TC_MUTLIPLE_AXIS_CHART_STYLE_006.equals("Yes")) {
				   	  										setTestCaseID("TC_MUTLIPLE_AXIS_ CHART_STYLE_006");
				   	  										sendKeys(driver,dropdownInputsearchBox,"sdgffh");
				   	  										String inValidResult=getText1(driver,chartThemeFirstResult);
				   	  										if(inValidResult.equals("No results found")) {
				   	  											pass(driver,"'No results found' displayed when user enter incorrect chart theme");
				   	  										}else {
				   	  											fail(driver,"'No results found' not displayed when user enter incorrect chart theme");
				   	  										}
				   	  										clear2(driver,dropdownInputsearchBox);
				   	  										sendKeys(driver,dropdownInputsearchBox,Change_ChartTheme_ChartStyle);
				   	  										String resultText=getText1(driver,chartThemeFirstResult);
				   	  										if(resultText.equals(Change_ChartTheme_ChartStyle)) {
				   	  											pass(driver,"Search input in the Chart Theme dropdown works properly");
				   	  										}else {
				   	  											fail(driver,"Search input in the Chart Theme dropdown not works properly");
				   	  										}
				   	  									}
				   	  									
				   	  									if(TC_MUTLIPLE_AXIS_CHART_STYLE_009.equals("Yes")) {
				   	  										setTestCaseID("TC_MUTLIPLE_AXIS_ CHART_STYLE_009");
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
				   	  								}else {
				   	  									fail(driver,"Chart Theme results dropdown is not displayed after click in it ");
				   	  								}
				   	  							}
				   	  						
				   	  						}else {
				   	  							fail(driver,"Chart theme input is not accessible");
				   	  						}
				   	  					}else {
				   	  						fail(driver,"Chart theme input not present unbale to perform validations");
				   	  					}
				   	  					
				   	  					if(TC_MUTLIPLE_AXIS_CHART_STYLE_010.equals("Yes")) {
	  										setTestCaseID("TC_MUTLIPLE_AXIS_ CHART_STYLE_010");
	  										if(isToggleEnable(driver,Y_Scroll_toggle)) {
	  											fail(driver,"By default Y Scroll toggle enabled ");
	  											if(isDisplayed(driver,Y_Scroll_Bar)) {
	  												fail(driver,"By default, Y Scroll Bar is displayed in the chart ");
	  											}else {
	  												pass(driver,"By default, Y Scroll Bar is not displayed in the chart");
	  											}
	  										}else {
	  											pass(driver,"By default Y Scroll toggle is disabled");
	  										}
	  										if(isToggleEnable(driver,X_Scroll_toggle)) {
	  											fail(driver,"By default X Scroll toggle is enabled ");
	  											if(isDisplayed(driver,X_Scroll_Bar)) {
	  												fail(driver,"By default, X Scroll Bar is displayed in the chart ");
	  											}else {
	  												pass(driver,"By default, X Scroll Bar is not displayed in the chart ");
	  											}
	  										}else {
	  											pass(driver,"By default X Scroll toggle not enabled ");
	  										}
				   	  					}
				   	  					
				   	  					if(TC_MUTLIPLE_AXIS_CHART_STYLE_011.equals("Yes")) {
				   	  						setTestCaseID("TC_MUTLIPLE_AXIS_ CHART_STYLE_011");
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
				   	  					
				   	  					setTestCaseID("TS_MUTLIPLE_AXIS_ CHART_STYLE_005");
				   	  					if(isDisplayed2(driver, EnableGrid_InputSlider)) {
				   	  						if(TC_MUTLIPLE_AXIS_CHART_STYLE_012.equals("Yes")) {
				   	  							setTestCaseID("TC_MUTLIPLE_AXIS_ CHART_STYLE_012");
				   	  							if(isToggleEnable(driver,EnableGrid_toggle)) {
				   	  								pass(driver,"By default, 'Enable Grid' toggle is enabled");
				   	  								if(isDisplayed(driver,Grid_Chart)) {
				   	  									pass(driver,"Grid is displayed in the chart when it is enable");
				   	  								}else {
				   	  									fail(driver,"Grid is not displayed in the chart when it is enable");
				   	  								}
				   	  								
				   	  								if(TC_MUTLIPLE_AXIS_CHART_STYLE_013.equals("Yes")) {
				   	  									setTestCaseID("TC_MUTLIPLE_AXIS_ CHART_STYLE_013");
				   	  									if(IsElementEnabled(driver, EnableGrid_toggle)) {
				   	  										click(driver,EnableGrid_InputSlider);
				   	  										wait(driver,"1");
				   	  										if(isToggleEnable(driver,EnableGrid_toggle)){
				   	  											fail(driver,"'Enable Grid' toggle not disabled when click on it ");
				   	  										}else {
				   	  											pass(driver,"'Enable Grid' toggle disabled when click on it ");
			   	  												scrollUsingElement(driver, ApplyButton);
			   	  												click(driver,ApplyButton);
			   	  												elementnotvisible1(driver, RPE_Loading);
			   	  												waitForElement(driver, Chart_Section);
			   	  												if(isDisplayed(driver,Grid_Chart)) {
			   	  													fail(driver,"Grid is displayed in the chart when it is disable");
			   	  												}else {
			   	  													pass(driver,"Grid is not displayed in the chart when it is disable");
			   	  												}
				   	  										}
				   	  										
				   	  									}else {
				   	  										fail(driver,"Enable Grid input is not Accessible");
				   	  									}
				   	  								}
				   	  							}else {
				   	  								fail(driver,"By default, 'Enable Grid' toggle is not enabled");
				   	  							}
				   	  						}
				   	  					}else {
				   	  						fail(driver,"Enable grid input is not present");
				   	  					}
				   	  					
				   	  					setTestCaseID("TS_MUTLIPLE_AXIS_ CHART_STYLE_006");
				   	  					if(isDisplayed2(driver, Grid_Distance_Input)) {
				   	  						if(TC_MUTLIPLE_AXIS_CHART_STYLE_014.equals("Yes")) {
				   	  							setTestCaseID("TC_MUTLIPLE_AXIS_ CHART_STYLE_014");
				   	  							String defaultGrid_distance_Act=defaultSelectedValue(driver,Grid_Distance_Input);
				   	  							if(Default_Grid_distance_Column.equals(defaultGrid_distance_Act)) {
				   	  								pass(driver,"By default "+Default_Grid_distance_Column+" is displayed in the Grid Distance Input");
				   	  							}else {
				   	  								fail(driver,"By default "+Default_Grid_distance_Column+" is not displayed in the Grid Distance Input");
				   	  							}
				   	  						}
				   	  						
				   	  						if(TC_MUTLIPLE_AXIS_CHART_STYLE_015.equals("Yes")) {
				   	  							setTestCaseID("TC_MUTLIPLE_AXIS_ CHART_STYLE_015");
				   	  							if(IsElementEnabled(driver, Grid_Distance_Input)) {
				   	  								pass(driver,"Grid Distance input is accessible");
				   	  								if(TC_MUTLIPLE_AXIS_CHART_STYLE_016.equals("Yes")) {
				   	  									setTestCaseID("TC_MUTLIPLE_AXIS_ CHART_STYLE_016");
				   	  									click(driver,Grid_Distance_Input);
				   	  									verifyElementIsPresent1(driver, Grid_Distance_Results);
				   	  								}
				   	  								
				   	  								if(TC_MUTLIPLE_AXIS_CHART_STYLE_017.equals("Yes")) {
				   	  									setTestCaseID("TC_MUTLIPLE_AXIS_ CHART_STYLE_017");
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
				   	  								fail(driver,"Grid distance input is not Accessible");
				   	  							}
				   	  						}
				   	  					}else {
				   	  						fail(driver,"Grid distance is not present ");
				   	  					}
				   	  					
				   	  					if(TC_MUTLIPLE_AXIS_CHART_STYLE_018.equals("Yes")) {
				   	  						setTestCaseID("TC_MUTLIPLE_AXIS_ CHART_STYLE_018");
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
				 }
				// ******************** Chart Style Validation End ******************* 
				 
				setTestCaseID("");
			    // ******************** Data Labels Validation Start ******************* 
				String Multiple_Axis_Data_Labels= getCellValue("TestExecution","Testcase_Selection","Multiple_Axis_Data_Labels",Flag);
				if(Multiple_Axis_Data_Labels.equals("Yes")) {
					String TC_MUTLIPLE_AXIS_DATA_LABELS_001=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_MULTIPLE AXIS_001",TestcaseID_Flag);
					String TC_MUTLIPLE_AXIS_DATA_LABELS_002=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_MULTIPLE AXIS_002",TestcaseID_Flag);
					String TC_MUTLIPLE_AXIS_DATA_LABELS_003=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_MULTIPLE AXIS_003",TestcaseID_Flag);
					String TC_MUTLIPLE_AXIS_DATA_LABELS_004=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_MULTIPLE AXIS_004",TestcaseID_Flag);
					String TC_MUTLIPLE_AXIS_DATA_LABELS_005=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_MULTIPLE AXIS_005",TestcaseID_Flag);
					String TC_MUTLIPLE_AXIS_DATA_LABELS_006=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_MULTIPLE AXIS_006",TestcaseID_Flag);
					String TC_MUTLIPLE_AXIS_DATA_LABELS_007=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_MULTIPLE AXIS_007",TestcaseID_Flag);
					String TC_MUTLIPLE_AXIS_DATA_LABELS_008=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_MULTIPLE AXIS_008",TestcaseID_Flag);
					String TC_MUTLIPLE_AXIS_DATA_LABELS_009=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_MULTIPLE AXIS_009",TestcaseID_Flag);
					String TC_MUTLIPLE_AXIS_DATA_LABELS_010=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_MULTIPLE AXIS_010",TestcaseID_Flag);
					String TC_MUTLIPLE_AXIS_DATA_LABELS_011=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_MULTIPLE AXIS_011",TestcaseID_Flag);
					String TC_MUTLIPLE_AXIS_DATA_LABELS_012=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_MULTIPLE AXIS_012",TestcaseID_Flag);
					String TC_MUTLIPLE_AXIS_DATA_LABELS_013=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_MULTIPLE AXIS_013",TestcaseID_Flag);
					String TC_MUTLIPLE_AXIS_DATA_LABELS_014=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_MULTIPLE AXIS_014",TestcaseID_Flag);
					String TC_MUTLIPLE_AXIS_DATA_LABELS_015=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_MULTIPLE AXIS_015",TestcaseID_Flag);
					String TC_MUTLIPLE_AXIS_DATA_LABELS_016=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_MULTIPLE AXIS_016",TestcaseID_Flag);
					String TC_MUTLIPLE_AXIS_DATA_LABELS_017=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_MULTIPLE AXIS_017",TestcaseID_Flag);
					String TC_MUTLIPLE_AXIS_DATA_LABELS_018=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_MULTIPLE AXIS_018",TestcaseID_Flag);
					String TC_MUTLIPLE_AXIS_DATA_LABELS_019=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_MULTIPLE AXIS_019",TestcaseID_Flag);
					String TC_MUTLIPLE_AXIS_DATA_LABELS_020=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_MULTIPLE AXIS_020",TestcaseID_Flag);
					String TC_MUTLIPLE_AXIS_DATA_LABELS_021=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_MULTIPLE AXIS_021",TestcaseID_Flag);
					String TC_MUTLIPLE_AXIS_DATA_LABELS_022=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_MULTIPLE AXIS_022",TestcaseID_Flag);
					String TC_MUTLIPLE_AXIS_DATA_LABELS_023=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_MULTIPLE AXIS_023",TestcaseID_Flag);
					String TC_MUTLIPLE_AXIS_DATA_LABELS_024=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_MULTIPLE AXIS_024",TestcaseID_Flag);
					
					if(!Multiple_Axis_Chart_Style.equals("Yes")) {
						verifyElementDisplayed(driver,Chart_FormatSec);
						click(driver,Chart_FormatSec);
					}
					
					String DataLabelsExpand=getAttribute1(driver, DataLabels_Expand, "class");
					if(!DataLabelsExpand.contains("up")) {
						fail(driver,"By default, Data labels not gets Expanded");
					}else {
						pass(driver,"By default, Data labels gets Expanded");
						if(TC_MUTLIPLE_AXIS_DATA_LABELS_001.equals("Yes")) {
							setTestCaseID("TC_MUTLIPLE_AXIS_ DATA_LABELS_001");
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
			              
							verifyElementDisplayed(driver,BigNumberSuffix_text);
							verifyElementDisplayed(driver,BigNumberInput);
			            
							verifyElementDisplayed(driver,ValueRotation_text);
							verifyElementDisplayed(driver,ValueRotation_Input);
							
							verifyElementDisplayed(driver,IgnoreZero_text);
							verifyElementDisplayed(driver,IgnoreZero_Input_toggle);
						}
						setTestCaseID("TS_MUTLIPLE_AXIS_ DATA_LABELS_002");
						if(isDisplayed2(driver, EnableValue_InputSlider)) {
							if(TC_MUTLIPLE_AXIS_DATA_LABELS_002.equals("Yes")) {
								setTestCaseID("TC_MUTLIPLE_AXIS_ DATA_LABELS_002");
								
								
								
							}
							
						}else {
							
						}
						
						
					}
				}
				 
				 
				 
			 }
		}//clicking the Widget
		
	}
}
