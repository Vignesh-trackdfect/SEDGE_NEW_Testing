package scripts;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import commonMethods.Keywords;
import commonMethods.Utils;

public class DASHPRO_HEAT_MAP_LEGEND_TESTING extends Keywords{

	public void heatMapLegendTesting(WebDriver driver, int iteration, String Flag) {
		
		String TestcaseFileName="DASHPRO_HEAT_MAP_LEGEND";
		String SheetName_Axes="HEAT_MAP_LEGEND_AXES";
		String SheetName_AxisTitle="HEAT_MAP_LEGEND_AXIS_TITLE";
		String SheetName_ChartStyle="HEAT_MAP_LEGEND_CHART_STYLE";
		String SheetName_DataLabels="HEAT_MAP_LEGEND_DATA_LABELS";
		String SheetName_Others="HEAT_MAP_LEGEND_OTHERS";
		String TestcaseID_Flag="Flag";
		String TescasesID_Column="TEST CASE ID";
		//Yes/No Input for Testcases Id
		String TC_HEATMAPLEGEND_AXES_001=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ HEATMAPLEGEND_001",TestcaseID_Flag);
		String TC_HEATMAPLEGEND_AXES_002=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ HEATMAPLEGEND_002",TestcaseID_Flag);
		String TC_HEATMAPLEGEND_AXES_003=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ HEATMAPLEGEND_003",TestcaseID_Flag);
		String TC_HEATMAPLEGEND_AXES_004=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ HEATMAPLEGEND_004",TestcaseID_Flag);
		String TC_HEATMAPLEGEND_AXES_005=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ HEATMAPLEGEND_005",TestcaseID_Flag);
		String TC_HEATMAPLEGEND_AXES_006=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ HEATMAPLEGEND_006",TestcaseID_Flag);
		String TC_HEATMAPLEGEND_AXES_007=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ HEATMAPLEGEND_007",TestcaseID_Flag);
		String TC_HEATMAPLEGEND_AXES_008=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ HEATMAPLEGEND_008",TestcaseID_Flag);
		String TC_HEATMAPLEGEND_AXES_009=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ HEATMAPLEGEND_009",TestcaseID_Flag);
		String TC_HEATMAPLEGEND_AXES_010=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ HEATMAPLEGEND_010",TestcaseID_Flag);
		String TC_HEATMAPLEGEND_AXES_011=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ HEATMAPLEGEND_011",TestcaseID_Flag);
		String TC_HEATMAPLEGEND_AXES_012=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ HEATMAPLEGEND_012",TestcaseID_Flag);
		String TC_HEATMAPLEGEND_AXES_013=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ HEATMAPLEGEND_013",TestcaseID_Flag);
		String TC_HEATMAPLEGEND_AXES_014=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ HEATMAPLEGEND_014",TestcaseID_Flag);
		String TC_HEATMAPLEGEND_AXES_015=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ HEATMAPLEGEND_015",TestcaseID_Flag);
		String TC_HEATMAPLEGEND_AXES_016=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ HEATMAPLEGEND_016",TestcaseID_Flag);
		String TC_HEATMAPLEGEND_AXES_017=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ HEATMAPLEGEND_017",TestcaseID_Flag);
		String TC_HEATMAPLEGEND_AXES_018=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ HEATMAPLEGEND_018",TestcaseID_Flag);
		String TC_HEATMAPLEGEND_AXES_019=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ HEATMAPLEGEND_019",TestcaseID_Flag);
		String TC_HEATMAPLEGEND_AXES_020=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ HEATMAPLEGEND_020",TestcaseID_Flag);
		String TC_HEATMAPLEGEND_AXES_021=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ HEATMAPLEGEND_021",TestcaseID_Flag);
		String TC_HEATMAPLEGEND_AXES_022=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ HEATMAPLEGEND_022",TestcaseID_Flag);
		String TC_HEATMAPLEGEND_AXES_023=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ HEATMAPLEGEND_023",TestcaseID_Flag);
		String TC_HEATMAPLEGEND_AXES_024=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ HEATMAPLEGEND_024",TestcaseID_Flag);
		String TC_HEATMAPLEGEND_AXES_025=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ HEATMAPLEGEND_025",TestcaseID_Flag);
		String TC_HEATMAPLEGEND_AXES_026=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ HEATMAPLEGEND_026",TestcaseID_Flag);
		String TC_HEATMAPLEGEND_AXES_027=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ HEATMAPLEGEND_027",TestcaseID_Flag);
		String TC_HEATMAPLEGEND_AXES_028=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ HEATMAPLEGEND_028",TestcaseID_Flag);
		String TC_HEATMAPLEGEND_AXES_029=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ HEATMAPLEGEND_029",TestcaseID_Flag);
		String TC_HEATMAPLEGEND_AXES_030=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ HEATMAPLEGEND_030",TestcaseID_Flag);
		String TC_HEATMAPLEGEND_AXES_031=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ HEATMAPLEGEND_031",TestcaseID_Flag);
		String TC_HEATMAPLEGEND_AXES_032=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ HEATMAPLEGEND_032",TestcaseID_Flag);
		String TC_HEATMAPLEGEND_AXES_033=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ HEATMAPLEGEND_033",TestcaseID_Flag);
		String TC_HEATMAPLEGEND_AXES_034=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ HEATMAPLEGEND_034",TestcaseID_Flag);
		String TC_HEATMAPLEGEND_AXES_035=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ HEATMAPLEGEND_035",TestcaseID_Flag);
		String TC_HEATMAPLEGEND_AXES_036=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ HEATMAPLEGEND_036",TestcaseID_Flag);
		String TC_HEATMAPLEGEND_AXES_037=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ HEATMAPLEGEND_037",TestcaseID_Flag);
		String TC_HEATMAPLEGEND_AXES_038=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ HEATMAPLEGEND_038",TestcaseID_Flag);
		String TC_HEATMAPLEGEND_AXES_039=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ HEATMAPLEGEND_039",TestcaseID_Flag);
		String TC_HEATMAPLEGEND_AXES_040=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ HEATMAPLEGEND_040",TestcaseID_Flag);
		String TC_HEATMAPLEGEND_AXES_041=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ HEATMAPLEGEND_041",TestcaseID_Flag);
		String TC_HEATMAPLEGEND_AXES_042=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ HEATMAPLEGEND_042",TestcaseID_Flag);
		String TC_HEATMAPLEGEND_AXES_043=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_ HEATMAPLEGEND_043",TestcaseID_Flag);

		//Default inputs
		String AxesColor_Exp=Utils.getDataFromTestData("Axes", "Axes_Color_Exp");
		String default_FontFamily=Utils.getDataFromTestData("AxisTitle", "default_FontFamily");
		String default_FontSize_Exp=Utils.getDataFromTestData("AxisTitle", "default_FontSize");
		String Highlight_color_Exp=Utils.getDataFromTestData("Axes", "HighlightColor");
		String defaultRotation=Utils.getDataFromTestData("SmokeTesting_UI", "DefaultRotation_Column_AxisTitle_X");
		String defaultRotationY=Utils.getDataFromTestData("AxisTitle", "default_Rotation_Value");
		String RotationInputColor_Exp=Utils.getDataFromTestData("AxisTitle", "RotationInput_Color");
		String Default_Color_Range_Input1_Color=Utils.getDataFromTestData("Heat_Map_Legend", "Default_Color_Range_Input1_Color");
		String Default_Color_Range_Input2_Color=Utils.getDataFromTestData("Heat_Map_Legend", "Default_Color_Range_Input2_Color");
		//Data Labels
		String DefaultSeperatorValue_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DefaultSeperatorValue");
		String DefaultFontSizeValue_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DefaultFontSizeValue");
		String DefaultRoundOffValue_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DefaultRoundOffValue");
		String DefaultRotationValue_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DefaultRotationValue");
		
		//Iteration inputs
		//Axes
		String Select_X_Axis_Value=Utils.getDataFromTestDataIteration(iteration,"Heat_Map_Legend_Widget_Testing", "Select_X_Axis_Value");
		String Select_Y_Axis_Value=Utils.getDataFromTestDataIteration(iteration,"Heat_Map_Legend_Widget_Testing", "Select_Y_Axis_Value");
		String Select_Series_Value=Utils.getDataFromTestDataIteration(iteration,"Heat_Map_Legend_Widget_Testing", "Select_Series_Value");
		String Select_Agg_Value=Utils.getDataFromTestDataIteration(iteration,"Heat_Map_Legend_Widget_Testing", "Select_Agg_Value");

		//Chart Title
		String TypeBackgroundColor1_ChartTitle=Utils.getDataFromTestDataIteration(iteration,"Heat_Map_Legend_Widget_Testing", "TypeBackgroundColor1_ChartTitle");
		String TypeTextColor1_ChartTitle=Utils.getDataFromTestDataIteration(iteration,"Heat_Map_Legend_Widget_Testing", "TypeTextColor1_ChartTitle");
		String Change_FontFamily_ChartTitle=Utils.getDataFromTestDataIteration(iteration,"Heat_Map_Legend_Widget_Testing", "Change_FontFamily_ChartTitle");
		String ChangeFontSize_ChartTitle=Utils.getDataFromTestDataIteration(iteration,"Heat_Map_Legend_Widget_Testing", "ChangeFontSize_ChartTitle");
		String ChangeChartTitleName=Utils.getDataFromTestDataIteration(iteration,"Heat_Map_Legend_Widget_Testing", "ChangeChartTitleName");
		 
		//chart style
		String Color_Range_Input1_Value=Utils.getDataFromTestDataIteration(iteration,"Heat_Map_Legend_Widget_Testing", "Color_Range_Input1_Value");
		String Color_Range_Input2_Value=Utils.getDataFromTestDataIteration(iteration,"Heat_Map_Legend_Widget_Testing", "Color_Range_Input2_Value");

		//Data Labels
		String ChangeFontSizeValue_DataLabel=Utils.getDataFromTestDataIteration(iteration,"Heat_Map_Legend_Widget_Testing", "ChangeFontSizeValue_DataLabel");
		String ChangeRoundOffValue_DataLabel=Utils.getDataFromTestDataIteration(iteration,"Heat_Map_Legend_Widget_Testing", "ChangeRoundOffValue_DataLabel");
		String ChangeRotataionVal_DataLabel=Utils.getDataFromTestDataIteration(iteration,"Heat_Map_Legend_Widget_Testing", "ChangeRotataionVal_DataLabel");
		
		setTestCaseID(" ");
		Actions action=new Actions(driver);
		mouseOverToElement(driver, ADDTabPlus);
  	    mouseOverAndClick(driver, ADDTabPlus);
  	    wait(driver,"1");
  	    sendKeys(driver,newlyAddedTab,"HeatMapLegendTestTab");
  	    click(driver,DashProPage);
  	    elementnotvisible1(driver, RPE_Loading);
		waitForElement(driver,ADD_widget_rightTop);
	    click(driver,ADD_widget_rightTop);
	    elementnotvisible(driver,Loading);
	    elementnotvisible1(driver, RPE_Loading);
		waitForElement(driver,WidgetPanel);
		waitForElement(driver,Sparkline_widget);
		
		if(TC_HEATMAPLEGEND_AXES_001.equals("Yes")) {
			setTestCaseID("TC_HEAT_MAP_LEGEND _AXES_001");
			waitForElement(driver,HeatMap_Legend_widget);
			verifyElementDisplayed(driver, HeatMap_Legend_widget);
		}
		
		if(TC_HEATMAPLEGEND_AXES_002.equals("Yes")) {
			setTestCaseID("TC_HEAT_MAP_LEGEND _AXES_002");
			WidgetValidation(driver,HeatMap_Legend_widget,"Heat Map Legend");
		}
		
		if(TC_HEATMAPLEGEND_AXES_003.equals("Yes")) {
			setTestCaseID("TC_HEAT_MAP_LEGEND _AXES_003");
			click(driver,HeatMap_Legend_widget);
			if(isDisplayed2(driver,error)){
				 String errorWidget=getText1(driver,error);
				 if(errorWidget.contains("Please refer the logs in Logs")) {
					 fail(driver,"Error displayed When click Heat Map Legend Widget, Validation : "+errorWidget);
				 }else {
					 pass(driver,"Error displayed When click Heat Map Legend Widget, Validation : "+errorWidget);
				 }
				 elementnotvisible1(driver, error);
			 }else {
				 elementnotvisible1(driver, Loading);
				 String widgetValue=getText1(driver,WidgetValue);
				 if(widgetValue.equals("Heat Map Legend")) {
					 pass(driver,"'Heat Map Legend' displayed as the selected Widget after click on it");
				 }else {
					 fail(driver,"'Heat Map Legend' not displayed as the selected Widget after click on it");
				 }
				 
				 if(TC_HEATMAPLEGEND_AXES_004.equals("Yes")) {
					 setTestCaseID("TC_HEAT_MAP_LEGEND _AXES_004");
					 String AxesExpand=getAttribute1(driver,Axes_Expand,"class");
					 if(!AxesExpand.contains("up")) {
						 fail(driver,"By default, Axes Section is not Expanded");
					 }else {
						 pass(driver,"By default, Axes Section is Expanded");
						 if(TC_HEATMAPLEGEND_AXES_005.equals("Yes")) {
							 setTestCaseID("TC_HEAT_MAP_LEGEND _AXES_005");
							 String default_Categories_Act=getText1(driver,X_Axis_Input);
							 if(default_Categories_Act.equals("Select")) {
								 pass(driver,"By Default 'Select' is selected in the X Axis value input");
							 }else {
								 fail(driver,"By Default 'Select' is not selected in the X Axis value input");
							 }
						 }
						 
						 if(TC_HEATMAPLEGEND_AXES_006.equals("Yes")) {
							 setTestCaseID("TC_HEAT_MAP_LEGEND _AXES_006");
							 String default_Categories_Act=getText1(driver,Y_Axis_Input);
							 if(default_Categories_Act.equals("Select")) {
								 pass(driver,"By Default 'Select' is selected in the Y Axis value input");
							 }else {
								 fail(driver,"By Default 'Select' is not selected in the Y Axis value input");
							 }
						 }
						 
						 if(TC_HEATMAPLEGEND_AXES_007.equals("Yes")) {
							 setTestCaseID("TC_HEAT_MAP_LEGEND _AXES_007");
							 scrollUsingElement(driver, ApplyButton);
							 click(driver,ApplyButton);
							 if(isDisplayed2(driver,ApplyError1)) {
								 pass(driver,"'Kindly select X axis and Y axis' error is displayed When Click Apply button without providing any inputs");
							 }else {
								 fail(driver,"'Kindly select X axis and Y axis' error is not displayed When Click Apply button without providing any inputs");
							 }	
							 elementnotvisible1(driver, ApplyError1);
						 }
						 
						 if(TC_HEATMAPLEGEND_AXES_008.equals("Yes")) {
							 setTestCaseID("TC_HEAT_MAP_LEGEND _AXES_008");
							 if(IsElementEnabled(driver, X_Axis_Input)) {
								 click(driver,X_Axis_Input);
								 if(isDisplayed2(driver,X_Axis_dropdownResultsExp)) {
									 pass(driver,"X Axis dropdown is expanded after click on it ");
									 if(TC_HEATMAPLEGEND_AXES_009.equals("Yes")) {
										 setTestCaseID("TC_HEAT_MAP_LEGEND _AXES_009");
										 List<WebElement> displayedDataImage=getWebElements(driver, dataTypeImages);
										 boolean categorical=true;
										 for(WebElement dataImag:displayedDataImage) {
											 action.moveToElement(dataImag).build().perform();
											 String dataTypeDisplay=dataImag.getAttribute("src");
											 if(dataTypeDisplay.contains("Categorical")) {
												 
											 }else {
												 fail(driver,"Other than Categorical datatype column is displayed in the X Axis dropdown");
												 categorical=false;
												 break;
											 }
										 }
										 if(categorical) {
											 pass(driver, "Only Categorical datatype column is displayed in the X Axis dropdown");
										 } 
									 }
									 
									 if(TC_HEATMAPLEGEND_AXES_010.equals("Yes")) {
										 setTestCaseID("TC_HEAT_MAP_LEGEND _AXES_010");
										 if(isDisplayed2(driver,CategoricalColumnAxisDropdown)) {
											 String Categorical1=getText1(driver,CategoricalColumnAxisDropdown);
											 if(Categorical1.contains("(")) {
												 pass(driver,"Unique values are displayed in the Categorical Column in the X Axis dropdown");
											 }else {
												 fail(driver,"Unique values are not displayed in the Categorical Column in the X Axis dropdown");
											 }
										 }
										 
										 if(isDisplayed2(driver,TextColumnAxisDropdown)) {
											 String Text1=getText1(driver,TextColumnAxisDropdown);
											 if(Text1.contains("(")) {
												 pass(driver,"Unique values are displayed in the Text Column in the X Axis dropdown");
											 }else {
												 fail(driver,"Unique values are not displayed in the Text Column in the X Axis dropdown");
											 }
										 } 
									 }
									 
									 if(TC_HEATMAPLEGEND_AXES_011.equals("Yes")) {
										 setTestCaseID("TC_HEAT_MAP_LEGEND _AXES_011");
										 List<WebElement> displayedDataImage=getWebElements(driver, dataTypeImages);
										 List<WebElement> AvailableColumnList=getWebElements(driver, AvailableList_Dropdown);
										 if(AvailableColumnList.size()-1==displayedDataImage.size()) {
											 pass(driver,"All the available columns are displayed with data Type icon in the X Axis dropdown");
										 }else {
											 fail(driver,"Some columns are not correctly displayed with data Type icon in the X Axis dropdown");
										 }
									 }
									 
									 if(TC_HEATMAPLEGEND_AXES_017.equals("Yes")) {
										 setTestCaseID("TC_HEAT_MAP_LEGEND _AXES_017");
										 ScrollBarValidation1(driver,X_Axis_dropdownResultsExp,"X_Axis_dropdown");
									 }
									 
									 if(TC_HEATMAPLEGEND_AXES_012.equals("Yes")) {
										 setTestCaseID("TC_HEAT_MAP_LEGEND _AXES_012");
										 if(verifyElementDisplayed(driver, dropdownInputsearchBox)) {
											 if(TC_HEATMAPLEGEND_AXES_013.equals("Yes")) {
												 setTestCaseID("TC_HEAT_MAP_LEGEND _AXES_013");
												 sendKeys(driver,dropdownInputsearchBox,"sdgffh");
												 if(isDisplayed(driver, NoResultsFound)) {
													 pass(driver,"'No results found' displayed when user enter incorrect value in X Axis search input");
												 }else {
													 fail(driver,"'No results found' not displayed when user enter incorrect value in X Axis search input");
												 }
												 clear2(driver,dropdownInputsearchBox);
											 }
											 
											 if(TC_HEATMAPLEGEND_AXES_014.equals("Yes")) {
												 setTestCaseID("TC_HEAT_MAP_LEGEND _AXES_014");
												 sendKeys(driver,dropdownInputsearchBox,Select_X_Axis_Value);
												 String resultText=getText1(driver,FirstSearchedvalue);
												 if(resultText.contains(Select_X_Axis_Value)) {
													 pass(driver,"Search input in the X Axis dropdown works properly for valid inputs");
												 }else {
													 fail(driver,"Search input in the X Axis dropdown not works properly for valid inputs");
												 }
												 if(TC_HEATMAPLEGEND_AXES_015.equals("Yes")) {
													 setTestCaseID("TC_HEAT_MAP_LEGEND _AXES_015");
													 action.sendKeys(Keys.ENTER).build().perform();
													 wait(driver,"1");
													 String seletcedValue=getText1(driver,X_Axis_Input);
													 if(seletcedValue.contains(Select_X_Axis_Value)) {
														 pass(driver,"Selected value displayed in the X_Axis Input after click Enter");
													 }else {
														 fail(driver,"Selected value not displayed in the X_Axis Input after click Enter");
													 }
													 if(TC_HEATMAPLEGEND_AXES_018.equals("Yes")) {
														 setTestCaseID("TC_HEAT_MAP_LEGEND _AXES_018");
														 if(isDisplayed2(driver,X_Axis_dropdownResultsExp)) {
															 fail(driver,"X_Axis Value dropdown not closed after perform 'Enter' action");
														 }else {
															 pass(driver,"X_Axis Value dropdown closed automatically after perform 'Enter' action");
														 }
													 }
													
												 }
											 }
										 }
									 }
									 
									 if(TC_HEATMAPLEGEND_AXES_016.equals("Yes")) {
										 setTestCaseID("TC_HEAT_MAP_LEGEND _AXES_016");
										 if(!isDisplayed2(driver, X_Axis_dropdownResultsExp)) {
											 click(driver,X_Axis_Input);
											 waitForElement(driver,X_Axis_dropdownResultsExp);
										 }
										 selectDropdownValue1(driver,Select_X_Axis_Value);
										 wait(driver,"1");
										 String seletcedValue=getText1(driver,X_Axis_Input);
										 if(seletcedValue.contains(Select_X_Axis_Value)) {
											 pass(driver,"Selected value displayed in the X_Axis Input after Selecting the Value");
										 }else {
											 fail(driver,"Selected value not displayed in the X_Axis Input after Selecting the value");
										 }
										 if(TC_HEATMAPLEGEND_AXES_018.equals("Yes")) {
											 setTestCaseID("TC_HEAT_MAP_LEGEND _AXES_018");
											 if(isDisplayed2(driver,X_Axis_dropdownResultsExp)) {
												 fail(driver,"X_Axis Value dropdown not closed after selecting the value");
											 }else {
												 pass(driver,"X_Axis Value dropdown closed automatically after Selecting the value");
											 }
										 }
									 }
									 
									 if(TC_HEATMAPLEGEND_AXES_032.equals("Yes")) {
										 setTestCaseID("TC_HEAT_MAP_LEGEND _AXES_032");
										 scrollUsingElement(driver, ApplyButton);
										 click(driver,ApplyButton);
										 if(isDisplayed2(driver,ApplyError1)) {
											 pass(driver,"'Kindly select X axis and Y axis' error is displayed When Click Apply button by giving input in the X axis field only");
										 }else {
											 fail(driver,"'Kindly select X axis and Y axis' error is not displayed When Click Apply button by giving input in the X axis field only");
										 }	
										 elementnotvisible1(driver, ApplyError1);
									 }
									 
								 }else {
									 fail(driver,"X Axis dropdown is not expanded after click on it ");
								 }
								 
								 
								 
								 
							 }else {
								 fail(driver,"X Axis Input is not Accessible");
							 }
						 }
						 
						 if(TC_HEATMAPLEGEND_AXES_019.equals("Yes")) {
							 setTestCaseID("TC_HEAT_MAP_LEGEND _AXES_019");
							 if(IsElementEnabled(driver, Y_Axis_Input)) {
								 click(driver,Y_Axis_Input);
								 if(isDisplayed2(driver,Y_Axis_dropdownResultsExp)) {
									 pass(driver,"Y Axis dropdown is expanded after click on it ");
									 if(TC_HEATMAPLEGEND_AXES_020.equals("Yes")) {
										 setTestCaseID("TC_HEAT_MAP_LEGEND _AXES_020");
										 List<WebElement> displayedDataImage=getWebElements(driver, dataTypeImages);
										 boolean categorical=true;
										 for(WebElement dataImag:displayedDataImage) {
											 action.moveToElement(dataImag).build().perform();
											 String dataTypeDisplay=dataImag.getAttribute("src");
											 if(dataTypeDisplay.contains("Categorical")) {
												 
											 }else {
												 fail(driver,"Other than Categorical datatype column is displayed in the Y Axis dropdown");
												 categorical=false;
												 break;
											 }
										 }
										 if(categorical) {
											 pass(driver, "Only Categorical datatype column is displayed in the Y Axis dropdown");
										 } 
									 }
									 
									 if(TC_HEATMAPLEGEND_AXES_021.equals("Yes")) {
										 setTestCaseID("TC_HEAT_MAP_LEGEND _AXES_021");
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
									 if(TC_HEATMAPLEGEND_AXES_025.equals("Yes")) {
										 setTestCaseID("TC_HEAT_MAP_LEGEND _AXES_025");
										 List<WebElement> displayedDataImage=getWebElements(driver, dataTypeImages);
										 List<WebElement> AvailableColumnList=getWebElements(driver, AvailableList_Dropdown);
										 if(AvailableColumnList.size()-1==displayedDataImage.size()) {
											 pass(driver,"All the available columns are displayed with data Type icon in the Y Axis dropdown");
										 }else {
											 fail(driver,"Some columns are not correctly displayed with data Type icon in the Y Axis dropdown");
										 }
									 }
									 
									 if(TC_HEATMAPLEGEND_AXES_028.equals("Yes")) {
										setTestCaseID("TC_HEAT_MAP_LEGEND _AXES_028");
									 	ScrollBarValidation1(driver,Y_Axis_dropdownResultsExp,"Y_Axis_dropdown");
									 }
									 
									 if(TC_HEATMAPLEGEND_AXES_022.equals("Yes")) {
										 setTestCaseID("TC_HEAT_MAP_LEGEND _AXES_022");
										 if(verifyElementDisplayed(driver, dropdownInputsearchBox)) {
											 if(TC_HEATMAPLEGEND_AXES_023.equals("Yes")) {
												 setTestCaseID("TC_HEAT_MAP_LEGEND _AXES_023");
												 sendKeys(driver,dropdownInputsearchBox,"sdgffh");
												 if(isDisplayed(driver, NoResultsFound)) {
													 pass(driver,"'No results found' displayed when user enter incorrect value in Y Axis search input");
												 }else {
													 fail(driver,"'No results found' not displayed when user enter incorrect value in Y Axis search input");
												 }
												 clear2(driver,dropdownInputsearchBox);
											 }
											 
											 if(TC_HEATMAPLEGEND_AXES_024.equals("Yes")) {
												 setTestCaseID("TC_HEAT_MAP_LEGEND _AXES_024");
												 sendKeys(driver,dropdownInputsearchBox,Select_Y_Axis_Value);
												 String resultText=getText1(driver,FirstSearchedvalue);
												 if(resultText.contains(Select_Y_Axis_Value)) {
													 pass(driver,"Search input in the Y Axis dropdown works properly for valid inputs");
												 }else {
													 fail(driver,"Search input in the Y Axis dropdown not works properly for valid inputs");
												 }
												 if(TC_HEATMAPLEGEND_AXES_026.equals("Yes")) {
													 setTestCaseID("TC_HEAT_MAP_LEGEND _AXES_026");
													 action.sendKeys(Keys.ENTER).build().perform();
													 wait(driver,"1");
													 String seletcedValue=getText1(driver,Y_Axis_Input);
													 if(seletcedValue.contains(Select_Y_Axis_Value)) {
														 pass(driver,"Selected value displayed in the Y_Axis Input after click Enter");
													 }else {
														 fail(driver,"Selected value not displayed in the Y_Axis Input after click Enter");
													 }
													 if(TC_HEATMAPLEGEND_AXES_029.equals("Yes")) {
														 setTestCaseID("TC_HEAT_MAP_LEGEND _AXES_029");
														 if(isDisplayed2(driver,Y_Axis_dropdownResultsExp)) {
															 fail(driver,"Y_Axis Value dropdown not closed after perform 'Enter' action");
														 }else {
															 pass(driver,"Y_Axis Value dropdown closed automatically after perform 'Enter' action"); 
														 } 
													 }
												 }
											 }
										 }
									 }
									 
									 if(TC_HEATMAPLEGEND_AXES_027.equals("Yes")) {
										 setTestCaseID("TC_HEAT_MAP_LEGEND _AXES_027");
										 if(!isDisplayed2(driver, Y_Axis_dropdownResultsExp)) {
											 click(driver,Y_Axis_Input);
											 waitForElement(driver,Y_Axis_dropdownResultsExp);
										 }
										 selectDropdownValue1(driver,Select_Y_Axis_Value);
										 wait(driver,"1");
										 String seletcedValue=getText1(driver,Y_Axis_Input);
										 if(seletcedValue.contains(Select_Y_Axis_Value)) {
											 pass(driver,"Selected value displayed in the Y_Axis Input after Selecting the Value");
										 }else {
											 fail(driver,"Selected value not displayed in the Y_Axis Input after Selecting the value");
										 }
										 if(TC_HEATMAPLEGEND_AXES_029.equals("Yes")) {
											 setTestCaseID("TC_HEAT_MAP_LEGEND _AXES_029");
											 if(isDisplayed2(driver,Y_Axis_dropdownResultsExp)) {
												 fail(driver,"Y_Axis Value dropdown not closed after selecting the value");
											 }else {
												 pass(driver,"Y_Axis Value dropdown closed automatically after Selecting the value");
											 }
										 }
									 }
									 
									 if(TC_HEATMAPLEGEND_AXES_031.equals("Yes")) {
										 setTestCaseID("TC_HEAT_MAP_LEGEND _AXES_031");
										 click(driver,X_Axis_Input);
										 waitForElement(driver,X_Axis_dropdownResultsExp);
										 waitForElement(driver,SelectOption);
										 click(driver,SelectOption);
										 wait(driver,"1");
										 scrollUsingElement(driver, ApplyButton);
										 click(driver,ApplyButton);
										 if(isDisplayed2(driver,ApplyError1)) {
											 pass(driver,"'Kindly select X axis and Y axis' error is displayed When Click Apply button by giving input in the Y axis field only");
										 }else {
											 fail(driver,"'Kindly select X axis and Y axis' error is not displayed When Click Apply button by giving input in the Y axis field only");
										 }	
										 elementnotvisible1(driver, ApplyError1);
										 click(driver,X_Axis_Input);
										 waitForElement(driver,X_Axis_dropdownResultsExp);
										 selectDropdownValue1(driver,Select_X_Axis_Value);
									 }
									 
									 if(TC_HEATMAPLEGEND_AXES_030.equals("Yes")) {
										 setTestCaseID("TC_HEAT_MAP_LEGEND _AXES_030");
										 click(driver,Y_Axis_Input);
										 waitForElement(driver,Y_Axis_dropdownResultsExp);
										 selectDropdownValue1(driver,Select_X_Axis_Value);
										 wait(driver,"1");
										 scrollUsingElement(driver, ApplyButton);
										 click(driver,ApplyButton);
										 if(isDisplayed2(driver,ApplyError2)) {
											 pass(driver,"'Kindly check fields and select different values' error is displayed When Click Apply button by giving Same value in X and Y inputs");
										 }else {
											 fail(driver,"'Kindly check fields and select different values' error is not displayed When Click Apply button by giving Same value in X and Y inputs");
										 }	
										 elementnotvisible1(driver, ApplyError2);
										 click(driver,Y_Axis_Input);
										 waitForElement(driver,Y_Axis_dropdownResultsExp);
										 selectDropdownValue1(driver,Select_Y_Axis_Value);
									 }
									 
								 }else {
									 fail(driver,"Y Axis dropdown is not expanded after click on it ");
								 }
							 }else {
								 fail(driver,"Y Axis input is not accessible");
							 }
						 }
						 
						 if(TC_HEATMAPLEGEND_AXES_033.equals("Yes")) {
							 setTestCaseID("TC_HEAT_MAP_LEGEND _AXES_033");
							 String default_Categories_Act=getText1(driver,Series_Input);
							 if(default_Categories_Act.equals("Select")) {
								 pass(driver,"By Default 'Select' is selected in the Series input");
							 }else {
								 fail(driver,"By Default 'Select' is not selected in the Series input");
							 }
						 }
						 
						 if(TC_HEATMAPLEGEND_AXES_034.equals("Yes")) {
							 setTestCaseID("TC_HEAT_MAP_LEGEND _AXES_034");
							 if(IsElementEnabled(driver, Series_Input)) {
								 click(driver,Series_Input);
								 if(isDisplayed2(driver,Series_DropdownExpand)) {
									 pass(driver,"Series dropdown is expanded after click on it ");
									 if(TC_HEATMAPLEGEND_AXES_035.equals("Yes")) {
										 setTestCaseID("TC_HEAT_MAP_LEGEND _AXES_035");
										 List<WebElement> displayedDataImage=getWebElements(driver, dataTypeImages);
										 boolean numerical=true;
										 for(WebElement dataImag:displayedDataImage) {
											 action.moveToElement(dataImag).build().perform();
											 String dataTypeDisplay=dataImag.getAttribute("src");
											 if(dataTypeDisplay.contains("Numerical")) {
												 
											 }else {
												 fail(driver,"Other than Numerical datatype column is displayed in the Series dropdown");
												 numerical=false;
												 break;
											 }
										 }
										 if(numerical) {
											 pass(driver, "Only Numerical datatype column is displayed in the Series dropdown");
										 } 
									 }
									 
									 if(TC_HEATMAPLEGEND_AXES_036.equals("Yes")) {
										 setTestCaseID("TC_HEAT_MAP_LEGEND _AXES_036");
										 if(verifyElementDisplayed(driver, dropdownInputsearchBox)) {
											 if(TC_HEATMAPLEGEND_AXES_037.equals("Yes")) {
												 setTestCaseID("TC_HEAT_MAP_LEGEND _AXES_037");
												 sendKeys(driver,dropdownInputsearchBox,"sdgffh");
												 if(isDisplayed(driver, NoResultsFound)) {
													 pass(driver,"'No results found' displayed when user enter incorrect value in Series search input");
												 }else {
													 fail(driver,"'No results found' not displayed when user enter incorrect value in Series search input");
												 }
												 clear2(driver,dropdownInputsearchBox);
											 }
											 
											 if(TC_HEATMAPLEGEND_AXES_038.equals("Yes")) {
												 setTestCaseID("TC_HEAT_MAP_LEGEND _AXES_038");
												 sendKeys(driver,dropdownInputsearchBox,Select_Series_Value);
												 String resultText=getText1(driver,FirstSearchedvalue);
												 if(resultText.contains(Select_Series_Value)) {
													 pass(driver,"Search input in the Series dropdown works properly for valid inputs");
												 }else {
													 fail(driver,"Search input in the Series dropdown not works properly for valid inputs");
												 }
											 }
										 }
									 }
									 
									 if(TC_HEATMAPLEGEND_AXES_039.equals("Yes")) {
										 setTestCaseID("TC_HEAT_MAP_LEGEND _AXES_039");
										 selectDropdownValue1(driver,Select_Series_Value);
										 wait(driver,"1");
										 String seletcedValue=getText1(driver,Series_Input);
										 if(seletcedValue.contains(Select_Series_Value)) {
											 pass(driver,"Selected value displayed in the Series Input after Selecting the Value");
										 }else {
											 fail(driver,"Selected value not displayed in the Series Input after Selecting the value");
										 }
									 }
								 }else {
									fail(driver,"Series dropdown is not expanded after click on it ");
								 }
							 }else {
								 fail(driver,"Series Input is not Accessible");
							 }
						 }
						 
						 setTestCaseID("TS_HEAT_MAP_LEGEND _AXES_004");
						 if(verifyElementDisplayed(driver, Agg_Input)) {
							 if(TC_HEATMAPLEGEND_AXES_040.equals("Yes")) {
								 setTestCaseID("TC_HEAT_MAP_LEGEND _AXES_040");
								 String defaultaggre=defaultSelectedValue(driver,Agg_Input);
								 if(defaultaggre.equals("Sum")) {
									 pass(driver,"'Sum' is selected as default aggregation");
								 }else {
									 fail(driver,"'Sum' is not selected as default aggregation");
								 }
							 }
							 setTestCaseID("TS_HEAT_MAP_LEGEND _AXES_004");
							 if(IsElementEnabled(driver, Agg_Input)) {
								 if(TC_HEATMAPLEGEND_AXES_041.equals("Yes")) {
									 setTestCaseID("TC_HEAT_MAP_LEGEND _AXES_041");
									 click(driver,Agg_Input);
									 verifyElementIsPresent1(driver, Sum);
									 verifyElementIsPresent1(driver, Count);
									 verifyElementIsPresent1(driver, Average);
									 verifyElementIsPresent1(driver, Min);
									 verifyElementIsPresent1(driver, Max);
									 verifyElementIsPresent1(driver, Unique);
								 } 
								 
								 if(TC_HEATMAPLEGEND_AXES_042.equals("Yes")) {
									 setTestCaseID("TC_HEAT_MAP_LEGEND _AXES_042");
									 DASHPRO_BAR_SMOKE_TESTING bar=new DASHPRO_BAR_SMOKE_TESTING();
									 bar.aggregationValidation2(driver);
									 selectByText(driver, Agg_Input, Select_Agg_Value);
								 }
							 }else {
								fail(driver,"Aggreagtion input is not accessible"); 
							 }
						 }
						 
						 if(TC_HEATMAPLEGEND_AXES_043.equals("Yes")) {
							 setTestCaseID("TC_HEAT_MAP_LEGEND _AXES_043");
							 scrollUsingElement(driver, ApplyButton);
							 click(driver,ApplyButton);
							 elementnotvisible1(driver, RPE_Loading);
							 if(isDisplayed2(driver, error)) {
								 String errorText=getText1(driver,error);
								 if(errorText.contains("Top 3000 records/groups from the data have been used for plotting")) {
									 verifyElementDisplayed(driver, ChartGraph);
								 }else {
									 fail(driver,"Error displayed When click apply button after providing all the inputs");
								 }
							 }else {
								 verifyElementDisplayed(driver, ChartGraph);
							 }
						 }
					 }// Axes expanded
				 }
				 
				 setTestCaseID("");
				 // ******************** Axis Title Validation Start ******************* 
				 String Heat_Map_Legend_Axis_Title= getCellValue("TestExecution","Testcase_Selection","Heat_Map_Legend_Axis_Title",Flag);
				 if(Heat_Map_Legend_Axis_Title.equals("Yes")) {
					 String TC_HEATMAPLEGEND_AXIS_TITLE_001=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ HEATMAPLEGEND_001",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_AXIS_TITLE_002=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ HEATMAPLEGEND_002",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_AXIS_TITLE_003=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ HEATMAPLEGEND_003",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_AXIS_TITLE_004=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ HEATMAPLEGEND_004",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_AXIS_TITLE_005=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ HEATMAPLEGEND_005",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_AXIS_TITLE_006=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ HEATMAPLEGEND_006",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_AXIS_TITLE_007=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ HEATMAPLEGEND_007",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_AXIS_TITLE_008=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ HEATMAPLEGEND_008",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_AXIS_TITLE_009=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ HEATMAPLEGEND_009",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_AXIS_TITLE_010=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ HEATMAPLEGEND_010",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_AXIS_TITLE_011=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ HEATMAPLEGEND_011",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_AXIS_TITLE_012=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ HEATMAPLEGEND_012",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_AXIS_TITLE_013=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ HEATMAPLEGEND_013",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_AXIS_TITLE_014=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ HEATMAPLEGEND_014",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_AXIS_TITLE_015=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ HEATMAPLEGEND_015",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_AXIS_TITLE_016=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ HEATMAPLEGEND_016",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_AXIS_TITLE_017=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ HEATMAPLEGEND_017",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_AXIS_TITLE_018=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ HEATMAPLEGEND_018",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_AXIS_TITLE_019=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ HEATMAPLEGEND_019",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_AXIS_TITLE_020=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ HEATMAPLEGEND_020",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_AXIS_TITLE_021=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ HEATMAPLEGEND_021",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_AXIS_TITLE_022=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ HEATMAPLEGEND_022",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_AXIS_TITLE_023=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ HEATMAPLEGEND_023",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_AXIS_TITLE_024=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ HEATMAPLEGEND_024",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_AXIS_TITLE_025=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ HEATMAPLEGEND_025",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_AXIS_TITLE_026=getTestcaseID_Flag(TestcaseFileName,SheetName_AxisTitle,TescasesID_Column,"TC_ HEATMAPLEGEND_026",TestcaseID_Flag);
					 
					//Axis Title
					String Change_X_Title_Name=Utils.getDataFromTestDataIteration(iteration,"Heat_Map_Legend_Widget_Testing", "Change_X_Title_Name");
					String Change_Y_Title_Name=Utils.getDataFromTestDataIteration(iteration,"Heat_Map_Legend_Widget_Testing", "Change_Y_Title_Name");
					String ChangeFontFamily_AxisTitle=Utils.getDataFromTestDataIteration(iteration,"Heat_Map_Legend_Widget_Testing", "ChangeFontFamily_AxisTitle");
					String ChangeTitleFontSize_AxisTitle=Utils.getDataFromTestDataIteration(iteration,"Heat_Map_Legend_Widget_Testing", "ChangeTitleFontSize_AxisTitle");
					String Change_X_label_FontSize=Utils.getDataFromTestDataIteration(iteration,"Heat_Map_Legend_Widget_Testing", "Change_X_label_FontSize");
					String Change_Y_label_FontSize=Utils.getDataFromTestDataIteration(iteration,"Heat_Map_Legend_Widget_Testing", "Change_Y_label_FontSize");
					String Change_X_Rotation_Input=Utils.getDataFromTestDataIteration(iteration,"Heat_Map_Legend_Widget_Testing", "Change_X_Rotation_Input");
					String Change_Y_Rotation_Input=Utils.getDataFromTestDataIteration(iteration,"Heat_Map_Legend_Widget_Testing", "Change_Y_Rotation_Input");
					 
					 if(TC_HEATMAPLEGEND_AXIS_TITLE_001.equals("Yes")) {
						 setTestCaseID("TC_HEATMAPLEGEND_ AXIS_TITLE_001");
						 if(verifyElementDisplayed(driver, AxisTitle)) {
							 click(driver,AxisTitle);
							 wait(driver,"1");
							 String AxisExpand=getAttribute1(driver,AxisTitleExpand,"class");
							 if(AxisExpand.contains("up")) {
								 pass(driver,"Axis Title section is Expanded after click on it");
								 if(TC_HEATMAPLEGEND_AXIS_TITLE_002.equals("Yes")) {
									 setTestCaseID("TC_HEATMAPLEGEND_ AXIS_TITLE_002");
									 String AxesTextColor_Act=getTextColor(driver,AxisTitle);
									 if(AxesColor_Exp.equalsIgnoreCase(AxesTextColor_Act)) {
										 pass(driver," 'Axis Title' highlighted in blue color");
									 }else {
										 fail(driver," 'Axis Title' not highlighted in blue color");
									 }
								 }
								 
								 if(TC_HEATMAPLEGEND_AXIS_TITLE_003.equals("Yes")) {
									 setTestCaseID("TC_HEATMAPLEGEND_ AXIS_TITLE_003");
									 clearAndType(driver,X_Title_input,Change_X_Title_Name);
									 clearAndType(driver,Y_Title_input,Change_Y_Title_Name);
									 scrollUsingElement(driver, ApplyButton);
									 click(driver,ApplyButton);
									 elementnotvisible1(driver, RPE_Loading);
									 if(verifyElementDisplayed(driver,ChartGraph)) {
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
								 }
								 
								 setTestCaseID("TS_HEATMAPLEGEND_ AXIS_TITLE_002");
								 if(verifyElementDisplayed(driver, fontFamily_dropdown)) {
									 if(TC_HEATMAPLEGEND_AXIS_TITLE_004.equals("Yes")) {
										 setTestCaseID("TC_HEATMAPLEGEND_ AXIS_TITLE_004");
										 String fontFamily_Value=getText1(driver,fontFamily_dropdown);
										 System.out.println("FontFamily_Value : "+fontFamily_Value);
										 if(fontFamily_Value.equals(default_FontFamily)) {
											 pass(driver,"By default, "+default_FontFamily+" displayed in the Font Family input");
										 }else {
											 fail(driver,"By default, "+default_FontFamily+" is not displayed in the Font Family input");
										 }
									 }
									 
									 if(TC_HEATMAPLEGEND_AXIS_TITLE_005.equals("Yes")) {
										 setTestCaseID("TC_HEATMAPLEGEND_ AXIS_TITLE_005");
										 if(IsElementEnabled(driver, fontFamily_dropdown)) {
											 click(driver,fontFamily_dropdown);
											 if(isDisplayed(driver,fontFamily_DropdownExpand)) {
												 pass(driver,"Font family dropdown is expanded after click on it");
												 if(TC_HEATMAPLEGEND_AXIS_TITLE_007.equals("Yes")) {
													 setTestCaseID("TC_HEATMAPLEGEND_ AXIS_TITLE_007");
													 ScrollBarValidation1(driver,fontFamily_DropdownExpand,"Font_Family_");
												 }
												 if(TC_HEATMAPLEGEND_AXIS_TITLE_006.equals("Yes")) {
													 setTestCaseID("TC_HEATMAPLEGEND_ AXIS_TITLE_006");
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
												 
												 if(TC_HEATMAPLEGEND_AXIS_TITLE_008.equals("Yes")) {
													 setTestCaseID("TC_HEATMAPLEGEND_ AXIS_TITLE_008");
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
												 
												 
												 if(TC_HEATMAPLEGEND_AXIS_TITLE_009.equals("Yes")) {
													 setTestCaseID("TC_HEATMAPLEGEND_ AXIS_TITLE_009");
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
														 String fontFamily_Y_Act=getFontFamily(driver,Y_Value_RadarChart);
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
												 fail(driver,"Font family dropdown is not expanded after click on it");
											 }
										 }else {
											 fail(driver,"Font Family input is not Accessible");
										 }
									 }
								 }
								 
								 setTestCaseID("TS_HEATMAPLEGEND_ AXIS_TITLE_003");
								 if(verifyElementDisplayed(driver, titleFontSizeDropdown)) {
									 if(TC_HEATMAPLEGEND_AXIS_TITLE_010.equals("Yes")) {
										 setTestCaseID("TC_HEATMAPLEGEND_ AXIS_TITLE_010");
										 String font_Size_Act=defaultSelectedValue(driver,titleFontSizeDropdown);
										 //System.out.println("Font_Size : "+font_Size_Act);
										 if(font_Size_Act.equals(default_FontSize_Exp)) {
											 pass(driver,"By default, "+default_FontSize_Exp+" displayed in the Title Font Size input");
										 }else {
											 fail(driver,"By default, "+default_FontSize_Exp+" is not displayed in the Title Font Size input");
										 }
									 }
									 setTestCaseID("TS_HEATMAPLEGEND_ AXIS_TITLE_003");
									 if(IsElementEnabled(driver, titleFontSizeDropdown)) {
										 if(TC_HEATMAPLEGEND_AXIS_TITLE_011.equals("Yes")) {
											 setTestCaseID("TC_HEATMAPLEGEND_ AXIS_TITLE_011");
											 click(driver,titleFontSizeDropdown);
											 verifyElementIsPresent1(driver, TitleFontSizeOptions);
										 }
										 
										 if(TC_HEATMAPLEGEND_AXIS_TITLE_012.equals("Yes")) {
											 setTestCaseID("TC_HEATMAPLEGEND_ AXIS_TITLE_012");
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
									 }else {
										 fail(driver,"Title Font Size input is not Accessible");
									 }
								 }
								 
								 setTestCaseID("TS_HEATMAPLEGEND_ AXIS_TITLE_004");
								 if(verifyElementDisplayed(driver, X_axisFontSizeDropdown)) {
									 if(TC_HEATMAPLEGEND_AXIS_TITLE_013.equals("Yes")) {
										 setTestCaseID("TC_HEATMAPLEGEND_ AXIS_TITLE_013");
										 String X_font_Size_Act=defaultSelectedValue(driver,X_axisFontSizeDropdown);
										 System.out.println("X Font_Size : "+X_font_Size_Act);
										 if(X_font_Size_Act.equals(default_FontSize_Exp)) {
											 pass(driver,"By default, "+default_FontSize_Exp+" displayed in the X axis Font Size input");
										 }else {
											 fail(driver,"By default, "+default_FontSize_Exp+" is not displayed in the X axis Font Size input");
										 }
									 }
									 
									 setTestCaseID("TS_HEATMAPLEGEND_ AXIS_TITLE_004");
									 if(IsElementEnabled(driver, X_axisFontSizeDropdown)) {
										 if(TC_HEATMAPLEGEND_AXIS_TITLE_014.equals("Yes")) {
											 setTestCaseID("TC_HEATMAPLEGEND_ AXIS_TITLE_014");
											 click(driver,X_axisFontSizeDropdown);
											 verifyElementIsPresent1(driver, X_axisFontSizeDropdownOptions);
										 }
										 
										 if(TC_HEATMAPLEGEND_AXIS_TITLE_015.equals("Yes")) {
											 setTestCaseID("TC_HEATMAPLEGEND_ AXIS_TITLE_015");
											 selectByText(driver,X_axisFontSizeDropdown,Change_X_label_FontSize);
											 scrollUsingElement(driver, ApplyButton);
											 click(driver,ApplyButton);
											 elementnotvisible1(driver, RPE_Loading);
											 if(verifyElementDisplayed(driver,ChartGraph)) {
												 if(isDisplayed2(driver,X_AxisLabel_chart)) {
													 String fontSize_X_label_Act=getFontSize(driver,X_AxisLabel_chart);
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
										 fail(driver,"X axis Label FontSize is not Accessible");
									 }
								 }
								 
								 setTestCaseID("TS_HEATMAPLEGEND_ AXIS_TITLE_005");
								 if(verifyElementDisplayed(driver, Y_axisFontSizeDropdown)) {
									 if(TC_HEATMAPLEGEND_AXIS_TITLE_016.equals("Yes")) {
										 setTestCaseID("TC_HEATMAPLEGEND_ AXIS_TITLE_016");
										 String Y_font_Size_Act=defaultSelectedValue(driver,Y_axisFontSizeDropdown);
										 if(Y_font_Size_Act.equals(default_FontSize_Exp)) {
					     	      			pass(driver,"By default, "+default_FontSize_Exp+" displayed in the Y axis Font Size input");
										 }else {
					     	           	    fail(driver,"By default, "+default_FontSize_Exp+" is not displayed in the Y axis Font Size input");
										 }
									 }
									 
									 setTestCaseID("TS_HEATMAPLEGEND_ AXIS_TITLE_005");
									 if(IsElementEnabled(driver, Y_axisFontSizeDropdown)) {
										 if(TC_HEATMAPLEGEND_AXIS_TITLE_017.equals("Yes")) {
											 setTestCaseID("TC_HEATMAPLEGEND_ AXIS_TITLE_017");
											 click(driver,Y_axisFontSizeDropdown);
								 			 verifyElementIsPresent1(driver, Y_axisFontSizeDropdownOptions);
										 }
										 
										 if(TC_HEATMAPLEGEND_AXIS_TITLE_018.equals("Yes")) {
											 setTestCaseID("TC_HEATMAPLEGEND_ AXIS_TITLE_018");
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
								 
								 
								 setTestCaseID("TS_HEATMAPLEGEND_ AXIS_TITLE_006");
								 if(verifyElementDisplayed(driver, X_RotationInputSlider)) {
									 if(TC_HEATMAPLEGEND_AXIS_TITLE_019.equals("Yes")) {
										 setTestCaseID("TC_HEATMAPLEGEND_ AXIS_TITLE_019");
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
									 
									 if(TC_HEATMAPLEGEND_AXIS_TITLE_020.equals("Yes")) {
										 setTestCaseID("TC_HEATMAPLEGEND_ AXIS_TITLE_020");
										 if(IsElementEnabled(driver, X_RotationInputSlider)) {
											 pass(driver,"X Rotation input is Accessible");
											 moveSlider(driver,X_RotationInputSlider,X_RotationOutputValue,Change_X_Rotation_Input);
											 scrollUsingElement(driver, ApplyButton);
											 click(driver,ApplyButton);
											 elementnotvisible1(driver, RPE_Loading);
											 if(TC_HEATMAPLEGEND_AXIS_TITLE_021.equals("Yes")) {
												 setTestCaseID("TC_HEATMAPLEGEND_ AXIS_TITLE_021");
												 String Y_label_Rotation_Act1=getRotationValue(driver,Column_Y_Labels_Chart);
												 if(Change_X_Rotation_Input.equals(Y_label_Rotation_Act1)) {
													 fail(driver,"Selected X Rotation Angle ("+Change_X_Rotation_Input+") Updated in Y Axis label chart value");
												 }else {
													 pass(driver,"Selected X Rotation Angle ("+Change_X_Rotation_Input+") is not Updated in Y Axis label chart value");
												 }
											 }
											 if(TC_HEATMAPLEGEND_AXIS_TITLE_022.equals("Yes")) {
												 setTestCaseID("TC_HEATMAPLEGEND_ AXIS_TITLE_022");
												 String X_label_Rotation_Act=getRotationValue(driver,X_AxisLabel_chart);
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
								 
								 setTestCaseID("TS_HEATMAPLEGEND_ AXIS_TITLE_007");
								 if(verifyElementDisplayed(driver, Y_RotationInputSlider)) {
									 if(TC_HEATMAPLEGEND_AXIS_TITLE_023.equals("Yes")) {
										 setTestCaseID("TC_HEATMAPLEGEND_ AXIS_TITLE_023");
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
									 
									 if(TC_HEATMAPLEGEND_AXIS_TITLE_024.equals("Yes")) {
										 setTestCaseID("TC_HEATMAPLEGEND_ AXIS_TITLE_024");
										 if(IsElementEnabled(driver, Y_RotationInputSlider)) {
											 pass(driver,"Y Rotation input is Accessible");
											 moveSlider(driver,Y_RotationInputSlider,Y_RotationOutputValue,Change_Y_Rotation_Input);
											 scrollUsingElement(driver, ApplyButton);
											 click(driver,ApplyButton);
											 elementnotvisible1(driver, RPE_Loading);
											 if(TC_HEATMAPLEGEND_AXIS_TITLE_025.equals("Yes")) {
												 setTestCaseID("TC_HEATMAPLEGEND_ AXIS_TITLE_025");
												 String X_label_Rotation_Act1=getRotationValue(driver,X_AxisLabel_chart);
												 if(Change_Y_Rotation_Input.equals(X_label_Rotation_Act1)) {
													 fail(driver,"Selected Y Rotation Angle ("+Change_Y_Rotation_Input+") Updated in X Axis label chart value");
												 }else {
													 pass(driver,"Selected Y Rotation Angle ("+Change_Y_Rotation_Input+") is not Updated in X Axis label chart value");
												 }
											 }
											 if(TC_HEATMAPLEGEND_AXIS_TITLE_026.equals("Yes")) {
												 setTestCaseID("TC_HEATMAPLEGEND_ AXIS_TITLE_026");
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
							 }else {
								 fail(driver,"Axis Title section is not Expanded after click on it");
							 }
						 }
					 }
				 }
				 // ******************** Axis Title Validation End ******************* 
				 setTestCaseID("");
				 // ******************** Chart Title Validation Start ******************* 
				 String Heat_Map_Legend_Chart_Title= getCellValue("TestExecution","Testcase_Selection","Heat_Map_Legend_Chart_Title",Flag);
				 if(Heat_Map_Legend_Chart_Title.equals("Yes")) {
					 CHART_TITLE chartTitle=new CHART_TITLE();
					 chartTitle.chartTitleTest(driver, TypeBackgroundColor1_ChartTitle, TypeTextColor1_ChartTitle, Change_FontFamily_ChartTitle, ChangeFontSize_ChartTitle,ChangeChartTitleName);
				 }
				 // ******************** Chart Title Validation End ******************* 
				 
				 // ******************** Chart Style Validation Start ******************* 
				 String Heat_Map_Legend_Chart_Style= getCellValue("TestExecution","Testcase_Selection","Heat_Map_Legend_Chart_Style",Flag);
				 if(Heat_Map_Legend_Chart_Style.equals("Yes")) {
					 String TC_HEATMAPLEGEND_CHART_STYLE_001=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_HEATMAPLEGEND_001",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_CHART_STYLE_002=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_HEATMAPLEGEND_002",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_CHART_STYLE_003=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_HEATMAPLEGEND_003",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_CHART_STYLE_004=getTestcaseID_Flag(TestcaseFileName,SheetName_ChartStyle,TescasesID_Column,"TC_HEATMAPLEGEND_004",TestcaseID_Flag);
					
					 setTestCaseID("");
					 if(verifyElementDisplayed(driver,Chart_FormatSec)) {
						 click(driver,Chart_FormatSec);
						 String ChartFormatOpenstatus=getAttribute1(driver, chartFormatExpand, "class");
						 if(ChartFormatOpenstatus.contains("up")) {
		   	  				pass(driver,"Chart Format is expanded when clicking the Chart Format");
		   	  				String ChartStylingExpand=getAttribute1(driver, ChartStyling_Expand, "class");
		   	  				if(!ChartStylingExpand.contains("up")) {
		   	  					fail(driver,"By default, Chart Styling not gets Expanded");
		   	  				}else {
		   	  					pass(driver,"By default, Chart Styling gets Expanded");
		   	  					
		   	  					if(TC_HEATMAPLEGEND_CHART_STYLE_001.equals("Yes")) {
		   	  						setTestCaseID("TC_HEATMAPLEGEND_ CHART_STYLE_001");
		   	  					    if(verifyElementDisplayed(driver, ColorRangeInput1)) {
		   	  					    	String BackgroundInputText=getTextJavascript(driver,ColorRangeInput1);
		   	  					    	//System.out.println("BackgroundInputText : "+BackgroundInputText);
		   	  					    	if(BackgroundInputText.equalsIgnoreCase(Default_Color_Range_Input1_Color)) {
		   	  					    		pass(driver,"By default, '"+Default_Color_Range_Input1_Color+"' Value selected in the Color range first input field");
		   	  					    	}else {
		   	  					    		fail(driver,"By default, '"+Default_Color_Range_Input1_Color+"' Value not selected in the Color range first input field");
		   	  					    	}
		   	  					    }
		   	  					    if(verifyElementDisplayed(driver, ColorRangeInput2)) {
		   	  					    	String BackgroundInputText=getTextJavascript(driver,ColorRangeInput2);
		   	  					    	//System.out.println("BackgroundInputText : "+BackgroundInputText);
		   	  					    	if(BackgroundInputText.equalsIgnoreCase(Default_Color_Range_Input2_Color)) {
		   	  					    		pass(driver,"By default, '"+Default_Color_Range_Input2_Color+"' Value selected in the Color range second input field");
		   	  					    	}else {
		   	  					    		fail(driver,"By default, '"+Default_Color_Range_Input2_Color+"' Value not selected in the Color range second input field");
		   	  					    	}
		   	  					    }
		   	  					}
		   	  					
		   	  					if(TC_HEATMAPLEGEND_CHART_STYLE_002.equals("Yes")) {
		   	  						setTestCaseID("TC_HEATMAPLEGEND_ CHART_STYLE_002");
		   	  						click(driver,ColorRangeInput1);
		   	  						if(isDisplayed(driver,ColorPickerOpen)) {
		   	  							pass(driver,"The color pickers opens promptly after clicking the Color range first input");
		   	  							mouseOverToElement(driver,Color2);
		   	  							wait(driver,"1");
		   	  							doubleClick(driver,mouseOverColorHistory);
		   	  							String mouseOverHistoryColor=getText1(driver,mouseOverColorHistory);
		   	  							wait(driver,"1");
		   	  							action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		   	  							wait(driver,"1");
		   	  							doubleClick(driver,ColorRangeInput1);
		   	  							wait(driver,"1");
		   	  							action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		   	  							wait(driver,"1");
		   	  							click(driver,ColorRangeText);
		   	  							wait(driver,"1");
		   	  							String AfterPasteBackgroundColor=getTextBackgroundColor(driver, ColorRangeInput1Pointer);
		   	  							if(AfterPasteBackgroundColor.equalsIgnoreCase(mouseOverHistoryColor)) {
		   	  								pass(driver,"Copy Paste Color value is working fine in the Color Range First Input");
		   	  							}else {
		   	  								fail(driver,"Copy Paste Color value is not working fine in the Color Range First Input");
		   	  							}
		   	  						}else {
		   	  							fail(driver,"The color pickers not opens promptly after clicking the Color range first input");
		   	  						}
		   	  						
		   	  						click(driver,ColorRangeInput2);
		   	  						if(isDisplayed(driver,ColorPickerOpen)) {
		   	  							pass(driver,"The color pickers opens promptly after clicking the Color range second input");
		   	  							mouseOverToElement(driver,Color2);
		   	  							wait(driver,"1");
		   	  							doubleClick(driver,mouseOverColorHistory);
		   	  							String mouseOverHistoryColor=getText1(driver,mouseOverColorHistory);
		   	  							wait(driver,"1");
		   	  							action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		   	  							wait(driver,"1");
		   	  							doubleClick(driver,ColorRangeInput2);
		   	  							wait(driver,"1");
		   	  							action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		   	  							wait(driver,"1");
		   	  							click(driver,ColorRangeText);
		   	  							wait(driver,"1");
		   	  							String AfterPasteBackgroundColor=getTextBackgroundColor(driver, ColorRangeInput2Pointer);
		   	  							if(AfterPasteBackgroundColor.equalsIgnoreCase(mouseOverHistoryColor)) {
		   	  								pass(driver,"Copy Paste Color value is working fine in the Color Range Second Input");
		   	  							}else {
		   	  								fail(driver,"Copy Paste Color value is not working fine in the Color Range Second Input");
		   	  							}
		   	  						}else {
		   	  							fail(driver,"The color pickers not opens promptly after clicking the Color range Second input");
		   	  						}
		   	  						
		   	  						WebElement colorRangeInput1=getWebElement(driver,ColorRangeInput1);
		   	  						action.click(colorRangeInput1).build().perform();
		   	  						action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		   	  						sendKeys(driver,ColorRangeInput1,Color_Range_Input1_Value);
		   	  						click3(driver,ColorRangeText);
		   	  						String SelectedColor=getTextBackgroundColor(driver, ColorRangeInput1Pointer);
		   	  						if(SelectedColor.equalsIgnoreCase(Color_Range_Input1_Value)) {
		   	  							pass(driver,"Manually entered color is updated in the Color Range First input");
		   	  						}else {
		   	  							fail(driver,"Manually entered color is not updated in the Color Range First input");
		   	  						}
		   	  						
		   	  						WebElement colorRangeInput2=getWebElement(driver,ColorRangeInput2);
		   	  						action.click(colorRangeInput2).build().perform();
		   	  						action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		   	  						sendKeys(driver,ColorRangeInput2,Color_Range_Input2_Value);
	   	  							click3(driver,ColorRangeText);
	   	  							String SelectedColor2=getTextBackgroundColor(driver, ColorRangeInput2Pointer);
	   	  							if(SelectedColor2.equalsIgnoreCase(Color_Range_Input2_Value)) {
	   	  								pass(driver,"Manually entered color is updated in the Color Range Second input");
	   	  							}else {
	   	  								fail(driver,"Manually entered color is not updated in the Color Range Second input");
	   	  							}
	   	  							
	   	  							scrollUsingElement(driver, ApplyButton);
	   	  							click(driver,ApplyButton);
	   	  							elementnotvisible1(driver, RPE_Loading);
	   	  							if(verifyElementDisplayed(driver,ChartGraph)) {
	   	  								String firstColorChart=getAttribute1(driver, ColorRange1_Chart, "stop-color");
	   	  								String secondColorChart=getAttribute1(driver, ColorRange2_Chart, "stop-color");
	   	  								if(firstColorChart.equalsIgnoreCase(Color_Range_Input1_Value)) {
	   	  									pass(driver,"Manually entered color range first input color is updated in chart");
	   	  								}else {
	   	  									fail(driver,"Manually entered color range first input color is not updated in chart");
	   	  								}
	   	  								
	   	  								if(secondColorChart.equalsIgnoreCase(Color_Range_Input2_Value)) {
	   	  									pass(driver,"Manually entered color range second input color is updated in chart");
	   	  								}else {
	   	  									fail(driver,"Manually entered color range second input color is not updated in chart");
	   	  								}
	   	  							}
		   	  					}
		   	  					
		   	  					if(TC_HEATMAPLEGEND_CHART_STYLE_003.equals("Yes")) {
		   	  						setTestCaseID("TC_HEATMAPLEGEND_ CHART_STYLE_003");
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
		   	  					
		   	  					if(TC_HEATMAPLEGEND_CHART_STYLE_004.equals("Yes")) {
		   	  						setTestCaseID("TC_HEATMAPLEGEND_ CHART_STYLE_004");
		   	  						if(IsElementEnabled(driver, X_Scroll_toggle)) {
		   	  							click(driver,X_ScrollInputSlider);
		   	  							if(isToggleEnable(driver,X_Scroll_toggle)){
		   	  								pass(driver,"X Scroll toggle enabled when click on it");
		   	  								scrollUsingElement(driver, ApplyButton);
		   	  								click(driver,ApplyButton);
		   	  								elementnotvisible1(driver, RPE_Loading);
		   	  								if(verifyElementDisplayed(driver,Chart_Section)) {
		   	  									if(isDisplayed(driver,X_Scroll_Bar)) {
		   	  										pass(driver,"X Scroll Bar is displayed in the chart after enabling it");
		   	  									}else {
		   	  										fail(driver,"X Scroll Bar is not displayed in the chart after enabling it");
		   	  									}
		   	  								}
		   	  							}else {
		   	  								fail(driver,"X Scroll toggle not enabled when click on it");
		   	  							}
		   	  						}else {
		   	  							fail(driver,"X Scroll is not Accessible");
		   	  						}
		   	  						
		   	  						if(IsElementEnabled(driver, Y_Scroll_toggle)) {
		   	  							click(driver,Y_ScrollInputSlider);
		   	  							wait(driver,"1");
		   	  							if(isToggleEnable(driver,Y_Scroll_toggle)){
		   	  								pass(driver,"Y Scroll toggle enabled when enabling it");
		   	  								scrollUsingElement(driver, ApplyButton);
		   	  								click(driver,ApplyButton);
		   	  								elementnotvisible1(driver, RPE_Loading);
		   	  								if(verifyElementDisplayed(driver,Chart_Section)) {
		   	  									if(isDisplayed(driver,Y_Scroll_Bar)) {
		   	  										pass(driver,"Y Scroll Bar is displayed in the chart after enabling it");
		   	  									}else {
		   	  										fail(driver,"Y Scroll Bar is not displayed in the chart after enabling it");
		   	  									}
		   	  								}
		   	  							}else {
		   	  								fail(driver,"Y Scroll toggle not enabled when enabling it");
		   	  							}
		   	  						}else {
		   	  							fail(driver,"Y Scroll is not Accessible");
		   	  						}
		   	  					}
		   	  				}
						 }else {
							 fail(driver,"Chart Format is not expanded when clicking the Chart Format");
						 }
					 }//chart Format present.. 
					 
				 }
				// ******************** Chart Style Validation End ******************* 
				 
				// ******************** Data Label Validation Start ******************* 
				 String Heat_Map_Legend_Data_Label= getCellValue("TestExecution","Testcase_Selection","Heat_Map_Legend_Data_Label",Flag);
				 if(Heat_Map_Legend_Data_Label.equals("Yes")) {
					 String TC_HEATMAPLEGEND_DATA_LABELS_001=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_ HEATMAPLEGEND_001",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_DATA_LABELS_002=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_ HEATMAPLEGEND_002",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_DATA_LABELS_003=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_ HEATMAPLEGEND_003",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_DATA_LABELS_004=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_ HEATMAPLEGEND_004",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_DATA_LABELS_005=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_ HEATMAPLEGEND_005",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_DATA_LABELS_006=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_ HEATMAPLEGEND_006",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_DATA_LABELS_007=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_ HEATMAPLEGEND_007",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_DATA_LABELS_008=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_ HEATMAPLEGEND_008",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_DATA_LABELS_009=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_ HEATMAPLEGEND_009",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_DATA_LABELS_010=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_ HEATMAPLEGEND_010",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_DATA_LABELS_011=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_ HEATMAPLEGEND_011",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_DATA_LABELS_012=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_ HEATMAPLEGEND_012",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_DATA_LABELS_013=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_ HEATMAPLEGEND_013",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_DATA_LABELS_014=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_ HEATMAPLEGEND_014",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_DATA_LABELS_015=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_ HEATMAPLEGEND_015",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_DATA_LABELS_016=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_ HEATMAPLEGEND_016",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_DATA_LABELS_017=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_ HEATMAPLEGEND_017",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_DATA_LABELS_018=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_ HEATMAPLEGEND_018",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_DATA_LABELS_019=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_ HEATMAPLEGEND_019",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_DATA_LABELS_020=getTestcaseID_Flag(TestcaseFileName,SheetName_DataLabels,TescasesID_Column,"TC_ HEATMAPLEGEND_020",TestcaseID_Flag);
					 setTestCaseID("");
					 if(!Heat_Map_Legend_Chart_Style.equals("Yes")) {
						 click(driver,Chart_FormatSec);
					 }
					 
					 if(TC_HEATMAPLEGEND_DATA_LABELS_001.equals("Yes")) {
						 setTestCaseID("TC_HEATMAPLEGEND_ DATA_LABELS_001");
						 String DataLabelsExpand=getAttribute1(driver, DataLabels_Expand, "class");
						 if(DataLabelsExpand.contains("up")) {
							 pass(driver,"By default, Data Labels gets Expanded");
						 }else {
							 fail(driver,"By default, Data Labels not gets Expand");
							 click(driver,DataLabels);
						 }
					 }
					 
					 if(TC_HEATMAPLEGEND_DATA_LABELS_002.equals("Yes")) {
						 setTestCaseID("TC_HEATMAPLEGEND_ DATA_LABELS_002");
						 verifyElementDisplayed(driver,EnableValue_text);
						 verifyElementIsPresent1(driver, EnableValue_InputSlider);

						 verifyElementDisplayed(driver,Seperator_text);
						 verifyElementDisplayed(driver,SeperatorInput);
	   	  	  		
						 verifyElementDisplayed(driver,ValueFontSize_text);
						 verifyElementDisplayed(driver,ValueFontSizeInput);
	   	  	       
						 verifyElementDisplayed(driver,RoundOffValue_text);
						 verifyElementDisplayed(driver,RoundOffValueInput);
	   	  	       
						 verifyElementDisplayed(driver,BigNumberSuffix_text);
						 verifyElementDisplayed(driver,BigNumberInputSlider);
	   	  	       
						 verifyElementDisplayed(driver,ValueRotation_text);
						 verifyElementDisplayed(driver,ValueRotation_Input);
					 }
					 
					 if(TC_HEATMAPLEGEND_DATA_LABELS_003.equals("Yes")) {
						 setTestCaseID("TC_HEATMAPLEGEND_ DATA_LABELS_003");
						 if(isToggleEnable(driver,EnableValue_Input)) {
							 fail(driver,"By Default, Enable Value toggle is enabled");
						 }else {
							 pass(driver,"By Default, Enable Value toggle is disabled");
							 if(TC_HEATMAPLEGEND_DATA_LABELS_004.equals("Yes")) {
								 setTestCaseID("TC_HEATMAPLEGEND_ DATA_LABELS_004");
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
							 
							 if(TC_HEATMAPLEGEND_DATA_LABELS_005.equals("Yes")) {
								 setTestCaseID("TC_HEATMAPLEGEND_ DATA_LABELS_005");
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
									 
									 if(TC_HEATMAPLEGEND_DATA_LABELS_006.equals("Yes")) {
										 setTestCaseID("TC_HEATMAPLEGEND_ DATA_LABELS_006");
										 String defaultSeperator_Act=defaultSelectedValue(driver,SeperatorInput);
										 if(DefaultSeperatorValue_Exp.equals(defaultSeperator_Act)) {
											 pass(driver,"By default, '"+DefaultSeperatorValue_Exp+"' is selected in the Seperator Input"); 
										 }else {
   	  										 fail(driver,"By default, '"+DefaultSeperatorValue_Exp+"' is not selected in the Seperator Input"); 
										 } 
									 }
									 
									 if(TC_HEATMAPLEGEND_DATA_LABELS_007.equals("Yes")) {
										 setTestCaseID("TC_HEATMAPLEGEND_ DATA_LABELS_007");
										 if(IsElementEnabled(driver,SeperatorInput)) {	
											 pass(driver,"'Seperator Input' is accessible"); 
											 click(driver,SeperatorInput);
											 verifyElementIsPresent1(driver, Thousand_Seperator);
											 verifyElementIsPresent1(driver, Houndred_Seperator);
											 if(TC_HEATMAPLEGEND_DATA_LABELS_008.equals("Yes")) {
												 setTestCaseID("TC_HEATMAPLEGEND_ DATA_LABELS_008");
												 selectOptionValue(driver,SeperatorInput,"#,###");
												 scrollUsingElement(driver, ApplyButton);
												 click(driver,ApplyButton);
												 elementnotvisible1(driver, RPE_Loading);
												 verifyElementDisplayed(driver,Chart_Section);
	   	  						  	
												 String ChartValueTextAct= getText(driver,EnableValue);//getText1(driver,ValueFormat_ChartValue);
												 if(!ChartValueTextAct.contains("…")&&ChartValueTextAct.length()>3) {
													 if(!ChartValueTextAct.equals("0")) {
														 String ValueSeperatorFormat=validateNumberFormat(ChartValueTextAct);
														 if(ValueSeperatorFormat.equals("#,###")) {
															 pass(driver,"Thousand seperator gets applied for chart enabled values"); 
														 }else {
															 fail(driver,"Thousand seperator not applied for chart enabled values"); 
   	  													}
													 }else {
														 pass(driver,"Unable to Validate the 'Thousand seperator' for this value : "+ChartValueTextAct); 
													 }
												 }else {
													 pass(driver,"Unable to Validate the 'Thousand seperator' for this value : "+ChartValueTextAct); 
												 }
											 }
											 if(TC_HEATMAPLEGEND_DATA_LABELS_009.equals("Yes")) {
												 setTestCaseID("TC_HEATMAPLEGEND_ DATA_LABELS_009");
												 selectOptionValue(driver,SeperatorInput,"#,##");
												 scrollUsingElement(driver, ApplyButton);
												 click(driver,ApplyButton);
												 elementnotvisible1(driver, RPE_Loading);
												 verifyElementDisplayed(driver,Chart_Section);
		   	  						  		
												 String ChartValueTextAct=getText(driver,EnableValue);     //getText1(driver,ValueFormat_ChartValue);
												 if(!ChartValueTextAct.contains("…")&&ChartValueTextAct.length()>3&& !ChartValueTextAct.equals("0")) {
													 String ValueSeperatorFormat=validateNumberFormat(ChartValueTextAct);
													 if(ValueSeperatorFormat.equals("#,##")) {
														 pass(driver,"Hundred Separator gets applied for chart enabled values"); 
													 }else {
														 fail(driver,"Hundred Separator not applied for chart enabled values"); 
													 }
												 }else {
													 pass(driver,"Unable to Validate the 'Hundred seperator' for this value : "+ChartValueTextAct);
												 }
											 }
										 }else {
											 fail(driver,"'Seperator Input' is not accessible"); 
										 }
									 }
									 
									 if(TC_HEATMAPLEGEND_DATA_LABELS_010.equals("Yes")) {
										 setTestCaseID("TC_HEATMAPLEGEND_ DATA_LABELS_010");
										 String defaultFontSize_Act=defaultSelectedValue(driver, ValueFontSizeInput);
										 if(DefaultFontSizeValue_Exp.equals(defaultFontSize_Act)) {
											 pass(driver,"By default, '"+DefaultFontSizeValue_Exp+"' is selected in the Value Font Size Input"); 
										 }else {
											 fail(driver,"By default, '"+DefaultFontSizeValue_Exp+"' is not selected in the Value Font Size Input"); 
										 }
									 }
									 
									 if(TC_HEATMAPLEGEND_DATA_LABELS_011.equals("Yes")) {
										 setTestCaseID("TC_HEATMAPLEGEND_ DATA_LABELS_011");
										 if(!IsElementEnabled(driver,ValueFontSizeInput)) {		
											 fail(driver,"'Value FontSize Input' is not accessible after enabling the 'Enable Value' toggle");
										 }else {
											 pass(driver,"'Value FontSize Input' is accessible after enabling the 'Enable Value' toggle"); 
											 if(TC_HEATMAPLEGEND_DATA_LABELS_012.equals("Yes")) {
												 setTestCaseID("TC_HEATMAPLEGEND_ DATA_LABELS_012");
												 click(driver,ValueFontSizeInput);
												 verifyElementIsPresent1(driver, ValueFontSizeOptions);
											 }
											 
											 if(TC_HEATMAPLEGEND_DATA_LABELS_013.equals("Yes")) {
												 setTestCaseID("TC_HEATMAPLEGEND_ DATA_LABELS_013");
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
										 }
									 }
									 
									 if(TC_HEATMAPLEGEND_DATA_LABELS_014.equals("Yes")) {
										 setTestCaseID("TC_HEATMAPLEGEND_ DATA_LABELS_014");
										 String defaultRoundOffValue_Act=defaultSelectedValue(driver, RoundOffValueInput);
										 if(DefaultRoundOffValue_Exp.equals(defaultRoundOffValue_Act)) {
   	  										pass(driver,"By default, '"+DefaultRoundOffValue_Exp+"' is selected in the RoundOffValue Input"); 
										 }else {
											 fail(driver,"By default, '"+DefaultRoundOffValue_Exp+"' is not selected in the RoundOffValue Input"); 
										 }
									 }
									 
									 if(TC_HEATMAPLEGEND_DATA_LABELS_015.equals("Yes")) {
										 setTestCaseID("TC_HEATMAPLEGEND_ DATA_LABELS_015");
										 if(IsElementEnabled(driver,RoundOffValueInput)) {		
		  						  	  		 pass(driver,"'RoundOff Value Input' is accessible "); 
		  						  	  		 click(driver,RoundOffValueInput);
		  						  	  		 verifyElementIsPresent1(driver, RoundOffValueOptions);
		  						  	  		 if(TC_HEATMAPLEGEND_DATA_LABELS_016.equals("Yes")) {
		  						  	  			 setTestCaseID("TC_HEATMAPLEGEND_ DATA_LABELS_016");
		  						  	  			 selectByText(driver,RoundOffValueInput,ChangeRoundOffValue_DataLabel);
		  						  	  			 scrollUsingElement(driver, ApplyButton);
		  						  	  			 click(driver,ApplyButton);
		  						  	  			 elementnotvisible1(driver, RPE_Loading);
		  						  	  			 if(verifyElementDisplayed(driver,Chart_Section)) {
		  						  	  				 String ChartValueTextAct=getText1(driver,EnableValue); 
		  						  	  				 if(ChartValueTextAct.contains("…")) {
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
											 fail(driver,"'RoundOff Value Input' is not accessible ");
										 }
									 }
									 
									 if(TC_HEATMAPLEGEND_DATA_LABELS_017.equals("Yes")) {
										 setTestCaseID("TC_HEATMAPLEGEND_ DATA_LABELS_017");
										 selectOptionValue(driver,SeperatorInput,"#,###");
										 if(isToggleAccessible(driver,BigNumberInput)) {
											 fail(driver,"'Big Number Suffix' toggle is accessible while Seperator value is selected");
										 }else {
											 pass(driver,"'Big Number Suffix' toggle is Inaccessible while Seperator value is selected");
										 }
									 }
									 
									 if(TC_HEATMAPLEGEND_DATA_LABELS_018.equals("Yes")) {
										 setTestCaseID("TC_HEATMAPLEGEND_ DATA_LABELS_018");
										 selectByText(driver,SeperatorInput,"Select");
										 if(isToggleAccessible(driver,BigNumberInput)) {
											 pass(driver,"'Big Number Suffix' toggle is accessible while Seperator value is not selected");
											 click(driver,BigNumberInputSlider);
											 if(isToggleEnable(driver,BigNumberInput)) {
												 pass(driver,"'Big Number Suffix' toggle is enabled while click on it");
//												 selectByText(driver,RoundOffValueInput,"Select");
												 scrollUsingElement(driver, ApplyButton);
												 click(driver,ApplyButton);
												 elementnotvisible1(driver, RPE_Loading);
  						  				    
												 String ChartValueTextAct=getText1(driver,EnableValue);     
												 if(!ChartValueTextAct.contains("…")&&ChartValueTextAct.length()>3 &&!ChartValueTextAct.equals("0")) {
													 if(ChartValueTextAct.endsWith("K") || ChartValueTextAct.endsWith("k")) {
														 pass(driver,"The big number suffix is applied for enabled value in charts");
													 }else {
														 fail(driver,"The big number suffix is not applied for enabled value in charts");
													 }
												 }else {
													 pass(driver,"Unable to Validate the bigNumber suffix for the value : "+ChartValueTextAct);
												 }
											 }else {
												 fail(driver,"'Big Number Suffix' toggle is not enabled while click on it");
											 }
		   	  									
										 }else {
											 fail(driver,"'Big Number Suffix' toggle is not accessible while Seperator value is not selected");
										 }
									 }
									 
									 if(TC_HEATMAPLEGEND_DATA_LABELS_019.equals("Yes")) {
										 setTestCaseID("TC_HEATMAPLEGEND_ DATA_LABELS_019");
										 String defaultRotationValue_Act=getText1(driver,ValueRotation_Output);
										 if(DefaultRotationValue_Exp.equals(defaultRotationValue_Act)) {
											 pass(driver,"By default, '"+DefaultRotationValue_Exp+"' is displayed in value rotation output");
										 }else {
   	  										fail(driver,"By default, '"+DefaultRotationValue_Exp+"' is not displayed in value rotation output");
										 }
									 }
									 
									 if(TC_HEATMAPLEGEND_DATA_LABELS_020.equals("Yes")) {
										 setTestCaseID("TC_HEATMAPLEGEND_ DATA_LABELS_020");
										 if(IsElementEnabled(driver, ValueRotation_Input)) {
											 pass(driver,"'Value rotation input' is Accessible");
											 moveSlider(driver,ValueRotation_Input,ValueRotation_Output,ChangeRotataionVal_DataLabel);
											 scrollUsingElement(driver, ApplyButton);
											 click(driver,ApplyButton);
											 elementnotvisible1(driver, RPE_Loading);
											 wait(driver,"1");
											 String chartValueRotation_Act=getRotationValue(driver,EnableValue);
											 if(chartValueRotation_Act.equals(ChangeRotataionVal_DataLabel)) {
												 pass(driver,"Selected positive Rotation Angle ("+ChangeRotataionVal_DataLabel+") is Updated in chart value");
											 }else {
												 fail(driver,"Selected positive Rotation Angle ("+ChangeRotataionVal_DataLabel+") is not Updated in chart value");
											 }
										 }else {
											 fail(driver,"'Value rotation input' is not Accessible");
										 }
									 }
								 }
							 }//Click Enable value toggle 
						 }
					 }
				 }
				 // ******************** Data Label Validation End ******************* 
				 setTestCaseID("");
				 // ******************** Others Validation Start ******************* 
				 String Heat_Map_Legend_Others= getCellValue("TestExecution","Testcase_Selection","Heat_Map_Legend_Others",Flag);
				 if(Heat_Map_Legend_Others.equals("Yes")) {
					 String TC_HEATMAPLEGEND_OTHERS_001=getTestcaseID_Flag(TestcaseFileName,SheetName_Others,TescasesID_Column,"TC_ HEATMAPLEGEND_001",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_OTHERS_002=getTestcaseID_Flag(TestcaseFileName,SheetName_Others,TescasesID_Column,"TC_ HEATMAPLEGEND_002",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_OTHERS_003=getTestcaseID_Flag(TestcaseFileName,SheetName_Others,TescasesID_Column,"TC_ HEATMAPLEGEND_003",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_OTHERS_004=getTestcaseID_Flag(TestcaseFileName,SheetName_Others,TescasesID_Column,"TC_ HEATMAPLEGEND_004",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_OTHERS_005=getTestcaseID_Flag(TestcaseFileName,SheetName_Others,TescasesID_Column,"TC_ HEATMAPLEGEND_005",TestcaseID_Flag);
					 String TC_HEATMAPLEGEND_OTHERS_006=getTestcaseID_Flag(TestcaseFileName,SheetName_Others,TescasesID_Column,"TC_ HEATMAPLEGEND_006",TestcaseID_Flag);

					 if(!Heat_Map_Legend_Data_Label.equals("Yes") && !Heat_Map_Legend_Chart_Style.equals("Yes")) {
						 verifyElementDisplayed(driver,Chart_FormatSec);
		    		     click(driver,Chart_FormatSec);
					 }
					 
					 String OthersExpand=getAttribute1(driver, ChartFormat_OthersExpand, "class");
		    		 if(!OthersExpand.contains("up")) {
		    			fail(driver,"By default, 'Others' not gets Expand");
		    		 }else {
		    			pass(driver,"By default, 'Others' gets Expanded");
		    			if(IsElementEnabled(driver,Cursor_Input)) {
		    				 if(TC_HEATMAPLEGEND_OTHERS_001.equals("Yes")) {
		    					 setTestCaseID("TC_HEATMAPLEGEND_ OTHERS_001");
		    					 if(!isToggleEnable(driver,Cursor_Input)) {		
		    						 fail(driver,"'Cursor Input toggle' is disabled by default"); 
		    					 }else {
		    						 pass(driver,"'Cursor Input toggle' is enabled by default"); 
		    						 if(TC_HEATMAPLEGEND_OTHERS_002.equals("Yes")) {
				    					 setTestCaseID("TC_HEATMAPLEGEND_OTHERS_002");
				    					 mouseOverToElement(driver, ChartGraph);
			    						 if(isDisplayed2(driver,MouseCursor)) {
			    							 pass(driver,"Cursor is displayed in chart when cursor is enable"); 
			    						 }else {
			    							 fail(driver,"Cursor is not displayed in chart when cursor is enable");  
			    						 }
		    						 }
		    						
		    					 }
		    				 }
			    				
		    				 if(TC_HEATMAPLEGEND_OTHERS_003.equals("Yes")) {
		    					 setTestCaseID("TC_HEATMAPLEGEND_OTHERS_003");
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
		    			 
		    			if(TC_HEATMAPLEGEND_OTHERS_004.equals("Yes")) {
	    					 setTestCaseID("TC_HEATMAPLEGEND_OTHERS_004");
	    					 if(isToggleEnable(driver,Export_Input)) {		
				     	  		 fail(driver,"'Export Input' enable by default");
				    		 }else {
				    			 pass(driver,"'Export Input' disable by default"); 
				    			 if(isDisplayed2(driver,ExportChartOptions)) {
					     	  		 fail(driver,"'Export Options' is displayed in charts when Export chart is disabled"); 
					     		 }else {
					     	  		 pass(driver,"'Export Options' not displayed in charts when Export chart is disabled"); 
					     		 }
				    			 
				    			 if(TC_HEATMAPLEGEND_OTHERS_005.equals("Yes")) {
			    					 setTestCaseID("TC_HEATMAPLEGEND_OTHERS_005");
			    					 if(IsElementEnabled(driver, Export_Input)) {
			    						 pass(driver,"Export toggle is Accessible");
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
			    						 fail(driver,"Export toggle is not Accessible");
			    					 }
				    			 }
				    		 }
		    			}
		    		 }
				 }
				// ******************** Others Validation End ******************* 
				 
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
		}
		
		
	}
	
}
