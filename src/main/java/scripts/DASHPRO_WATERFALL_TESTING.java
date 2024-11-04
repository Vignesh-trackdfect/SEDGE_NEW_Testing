package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import commonMethods.Keywords;
import commonMethods.Utils;

public class DASHPRO_WATERFALL_TESTING extends Keywords{

	public void waterfallTesting(WebDriver driver, int iteration,String Flag) {
		
		String TestcaseFileName="DASHPRO_WATERFALL";
		String SheetName_Axes="WATERFALL";
		String SheetName_Axis_Title="AXIS TITLE";
		String SheetName_Chart_Style="WATERFALL_CHARTSTYLING";
		String SheetName_Data_Style="WATERFALL_DATALABELS";
		String TestcaseID_Flag="Flag";
		String TescasesID_Column="TEST CASE ID";
		//Yes/No Input for Testcases Id
		String TC_WATERFALL_001=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_WATERFALL_001",TestcaseID_Flag);
		String TC_WATERFALL_002=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_WATERFALL_002",TestcaseID_Flag);
		String TC_WATERFALL_003=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_WATERFALL_003",TestcaseID_Flag);
		String TC_WATERFALL_004=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_WATERFALL_004",TestcaseID_Flag);
		String TC_WATERFALL_005=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_WATERFALL_005",TestcaseID_Flag);
		String TC_WATERFALL_006=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_WATERFALL_006",TestcaseID_Flag);
		String TC_WATERFALL_007=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_WATERFALL_007",TestcaseID_Flag);
		String TC_WATERFALL_008=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_WATERFALL_008",TestcaseID_Flag);
		String TC_WATERFALL_009=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_WATERFALL_009",TestcaseID_Flag);
		String TC_WATERFALL_010=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_WATERFALL_010",TestcaseID_Flag);
		String TC_WATERFALL_011=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_WATERFALL_011",TestcaseID_Flag);
		String TC_WATERFALL_012=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_WATERFALL_012",TestcaseID_Flag);
		String TC_WATERFALL_013=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_WATERFALL_013",TestcaseID_Flag);
		String TC_WATERFALL_014=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_WATERFALL_014",TestcaseID_Flag);
		String TC_WATERFALL_015=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_WATERFALL_015",TestcaseID_Flag);
		String TC_WATERFALL_016=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_WATERFALL_016",TestcaseID_Flag);
		String TC_WATERFALL_017=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_WATERFALL_017",TestcaseID_Flag);
		String TC_WATERFALL_018=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_WATERFALL_018",TestcaseID_Flag);
		String TC_WATERFALL_019=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_WATERFALL_019",TestcaseID_Flag);
		String TC_WATERFALL_020=getTestcaseID_Flag(TestcaseFileName,SheetName_Axes,TescasesID_Column,"TC_WATERFALL_020",TestcaseID_Flag);

		//Default Inputs
		String default_FontFamily=Utils.getDataFromTestData("AxisTitle", "default_FontFamily");
		String default_FontSize_Exp=Utils.getDataFromTestData("AxisTitle", "default_FontSize");
		String defaultRotation=Utils.getDataFromTestData("AxisTitle", "default_Rotation_Value");
		String DefaultThemeValue_Exp=Utils.getDataFromTestData("ChartFormat_ChartStyle", "defaultThemeValue_Exp");
		String Default_Grid_distance_Column=Utils.getDataFromTestData("SmokeTesting_UI", "Default_Grid_distance_Column");
		
		//Data Labels
		String DataLabelsColor_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DataLabelsColor_Exp");
		String DefaultFormatValue_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DefaultFormatValue");
		String DefaultSeperatorValue_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DefaultSeperatorValue");
		String DefaultFontSizeValue_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DefaultFontSizeValue");
		String DefaultRoundOffValue_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DefaultRoundOffValue");
				
		String DefaultPositionValue_Exp=Utils.getDataFromTestData("SmokeTesting_UI", "DefaultPostion_Column_DataLabel");
		String DefaultRotationValue_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DefaultRotationValue");
		
		//Iteration Inputs
		//Axes
		String Select_X_Axis_Value=Utils.getDataFromTestDataIteration(iteration,"WaterFall_Widget_Testing", "Select_X_Axis_Value");
		String Select_Y_Axis_Value=Utils.getDataFromTestDataIteration(iteration,"WaterFall_Widget_Testing", "Select_Y_Axis_Value");
		//Axis Title
		String Change_X_Title_Name=Utils.getDataFromTestDataIteration(iteration,"WaterFall_Widget_Testing", "Change_X_Title_Name");
		String Change_Y_Title_Name=Utils.getDataFromTestDataIteration(iteration,"WaterFall_Widget_Testing", "Change_Y_Title_Name");
		String ChangeFontFamily_AxisTitle=Utils.getDataFromTestDataIteration(iteration,"WaterFall_Widget_Testing", "ChangeFontFamily_AxisTitle");
		String ChangeTitleFontSize_AxisTitle=Utils.getDataFromTestDataIteration(iteration,"WaterFall_Widget_Testing", "ChangeTitleFontSize_AxisTitle");
		String Change_X_label_FontSize=Utils.getDataFromTestDataIteration(iteration,"WaterFall_Widget_Testing", "Change_X_label_FontSize");
		String Change_Y_label_FontSize=Utils.getDataFromTestDataIteration(iteration,"WaterFall_Widget_Testing", "Change_Y_label_FontSize");
		String Change_X_Rotation_Input=Utils.getDataFromTestDataIteration(iteration,"WaterFall_Widget_Testing", "Change_X_Rotation_Input");
		String Change_Y_Rotation_Input=Utils.getDataFromTestDataIteration(iteration,"WaterFall_Widget_Testing", "Change_Y_Rotation_Input");
		//Chart Style
		String Change_ChartTheme_ChartStyle=Utils.getDataFromTestDataIteration(iteration,"WaterFall_Widget_Testing", "Change_ChartTheme_ChartStyle");
		String Change_Grid_Distance=Utils.getDataFromTestDataIteration(iteration,"WaterFall_Widget_Testing", "Change_Grid_Distance");
		//Data Labels
		String ChangeFontSizeValue_DataLabel=Utils.getDataFromTestDataIteration(iteration,"WaterFall_Widget_Testing", "ChangeFontSizeValue_DataLabel");
		String ChangeRoundOffValue_DataLabel=Utils.getDataFromTestDataIteration(iteration,"WaterFall_Widget_Testing", "ChangeRoundOffValue_DataLabel");
		String ChangeRotataionVal_DataLabel=Utils.getDataFromTestDataIteration(iteration,"WaterFall_Widget_Testing", "ChangeRotataionVal_DataLabel");

		setTestCaseID(" ");
		Actions action=new Actions(driver);
		mouseOverToElement(driver, ADDTabPlus);
  	    mouseOverAndClick(driver, ADDTabPlus);
  	    wait(driver,"1");
  	    sendKeys(driver,newlyAddedTab,"WaterFallTestTab");
  	    click(driver,DashProPage);
  	    elementnotvisible1(driver, RPE_Loading);
		waitForElement(driver,ADD_widget_rightTop);
	    click(driver,ADD_widget_rightTop);
	    elementnotvisible(driver,Loading);
	    elementnotvisible1(driver, RPE_Loading);
		waitForElement(driver,WidgetPanel);
		waitForElement(driver,Sparkline_widget);
		
		
		if(TC_WATERFALL_001.equals("Yes")) {
			setTestCaseID("TC_WATERFALL_001");
			waitForElement(driver,WaterFall_widget);
			verifyElementDisplayed(driver, WaterFall_widget);
		}
		
		
		if(TC_WATERFALL_002.equals("Yes")) {
			setTestCaseID("TC_WATERFALL_002");
			WidgetValidation(driver,WaterFall_widget,"Water Fall");
		}
		
		if(TC_WATERFALL_003.equals("Yes")) {
			setTestCaseID("TC_WATERFALL_003");
			click(driver,WaterFall_widget);
			if(isDisplayed2(driver,error)){
				 String errorWidget=getText1(driver,error);
				 if(errorWidget.contains("Please refer the logs in Logs")) {
					 fail(driver,"Error displayed When click WaterFall Widget, Validation : "+errorWidget);
				 }else {
					 pass(driver,"Error displayed When click WaterFall Widget, Validation : "+errorWidget);
				 }
				 elementnotvisible1(driver, error);
			 }else {
				 
				 elementnotvisible(driver, Loading);
				 String widgetValue=getText1(driver,WidgetValue);
				 if(widgetValue.equals("Water Fall")) {
					 pass(driver,"'Water Fall' displayed as the selected Widget after click on it");
				 }else {
					 fail(driver,"'Water Fall' not displayed as the selected Widget after click on it");
				 } 
					
				 
				 if(TC_WATERFALL_004.equals("Yes")) {
					 setTestCaseID("TC_WATERFALL_004");
					 String AxesExpand=getAttribute1(driver,Axes_Expand,"class");
					 if(AxesExpand.contains("up")) {
						 pass(driver,"By default, Axes Section is Expanded");				 
					 }else {
						 fail(driver,"By default, Axes Section is not Expanded");
							  //click(driver,Axes_Expand);
					 }
				 }
					
				 
				 if(TC_WATERFALL_005.equals("Yes")) {
					 setTestCaseID("TC_WATERFALL_005");
					 scrollUsingElement(driver, ApplyButton);
					 click(driver,ApplyButton);
					 if(isDisplayed2(driver,ApplyError1)) {
						 pass(driver,"'Kindly select X axis and Y axis' error is displayed When Click Apply button without selecting any X and Y Value");
					 }else {
						 fail(driver,"'Kindly select X axis and Y axis' error is not displayed When Click Apply button without selecting X and Y Value");
					 }	
				 }
					
				 
				 if(TC_WATERFALL_006.equals("Yes")) {
					 setTestCaseID("TC_WATERFALL_006");
					 if(verifyElementDisplayed(driver, X_Axis_Input)) {
						 click(driver,X_Axis_Input);
						 if(isDisplayed2(driver,X_Axis_dropdownResultsExp)) {
							 pass(driver,"X Axis dropdown is expanded after click on it ");
							 
							 
							 if(TC_WATERFALL_007.equals("Yes")) {
								 setTestCaseID("TC_WATERFALL_007");
								 List<WebElement> displayedDataImage=getWebElements(driver, dataTypeImages);
								 boolean categorical=true;
								 for(WebElement dataImag:displayedDataImage) {
									 String dataTypeDisplay=dataImag.getAttribute("src");
									 if(!dataTypeDisplay.contains("Categorical")) {
										 fail(driver,"Other than Categorical datatype column is displayed in the X Axis dropdown");
										 categorical=false;
										 break;
									 }
								 }
								 if(categorical) {
									 pass(driver, "Only Categorical datatype column is displayed in the X Axis dropdown");
								 }
							 }
							 
							 
							 if(TC_WATERFALL_008.equals("Yes")) {
								 setTestCaseID("TC_WATERFALL_008");
								 if(isDisplayed2(driver,CategoricalColumnAxisDropdown)) {
									 String Categorical1=getText1(driver,CategoricalColumnAxisDropdown);
									 if(Categorical1.contains("(")) {
										 pass(driver,"Unique values are displayed in the Categorical Column in the X Axis dropdown");
									 }else {
										 fail(driver,"Unique values are not displayed in the Categorical Column in the X Axis dropdown");
									 }
								 }
							 }
							 
							 
							 if(TC_WATERFALL_009.equals("Yes")) {
								 setTestCaseID("TC_WATERFALL_009");
								 List<WebElement> displayedDataImage=getWebElements(driver, dataTypeImages);
								 List<WebElement> AvailableColumnList=getWebElements(driver, AvailableList_Dropdown);
								 if(AvailableColumnList.size()-1==displayedDataImage.size()) {
									 pass(driver,"All the available columns are displayed with data Type icon in the X Axis dropdown");
								 }else {
									 fail(driver,"Some columns are not correctly displayed with data Type icon in the X Axis dropdown");
								 }
							 }
							 
							 
							 if(TC_WATERFALL_010.equals("Yes")) {
								 setTestCaseID("TC_WATERFALL_010");
								 if(verifyElementDisplayed(driver, dropdownInputsearchBox)) {
									 
									 if(TC_WATERFALL_011.equals("Yes")) {
										 setTestCaseID("TC_WATERFALL_011");
										 sendKeys(driver, dropdownInputsearchBox, Select_X_Axis_Value);
										 List<WebElement> AvailableColumnList=getWebElements(driver, AvailableList_Dropdown);
										 String firstValue_=getText1(driver,FirstSearchedvalue);
										 if(firstValue_.contains(Select_X_Axis_Value) && AvailableColumnList.size()==1) {
											 pass(driver,"Searched Value correctly displayed first in the X Axis dropdown");
										 }else {
											 fail(driver,"Searched Value not correctly displayed first in the X Axis dropdown");
										 }
									 }
								 }
							 }
							 
							 if(TC_WATERFALL_012.equals("Yes")) {
								 setTestCaseID("TC_WATERFALL_012");
								 selectDropdownValue1(driver,Select_X_Axis_Value);
								 wait(driver,"1");
								 String selectedValue1=getText1(driver,X_Axis_Input);
								 if(selectedValue1.contains(Select_X_Axis_Value)) {
									 pass(driver,"Selected Columnn displayed in the X Axis input successfully");
								 }else {
									 fail(driver,"Selected Columnn not displayed in the X Axis input successfully");
								 }
								 
								 
								 if(TC_WATERFALL_013.equals("Yes")) {
									 setTestCaseID("TC_WATERFALL_013");
									 scrollUsingElement(driver, ApplyButton);
									 click(driver,ApplyButton);
									 if(isDisplayed2(driver,ApplyError1)) {
										 pass(driver,"'Kindly select X axis and Y axis' error is displayed When Click Apply button Only selecting X Value");
									 }else {
										 fail(driver,"'Kindly select X axis and Y axis' error is not displayed When Click Apply button Only selecting X Value");
									 }	
								 }
							 }
						 }else {
							 fail(driver,"X Axis dropdown not expanded after click on it");
						 }
					 }
				 }
				 
				 
				 if(TC_WATERFALL_014.equals("Yes")) {
					 setTestCaseID("TC_WATERFALL_014");
					 if(verifyElementDisplayed(driver, Y_Axis_Input)) {
						 click(driver,Y_Axis_Input);
						 if(isDisplayed2(driver,Y_Axis_dropdownResultsExp)) {
							 pass(driver,"Y Axis dropdown is expanded after click on it ");
							 
							 if(TC_WATERFALL_015.equals("Yes")) {
								 setTestCaseID("TC_WATERFALL_015");
								 List<WebElement> displayedDataImage=getWebElements(driver, dataTypeImages);
								 boolean Numerical=true;
								 for(WebElement dataImag:displayedDataImage) {
									 String dataTypeDisplay=dataImag.getAttribute("src");
									 if(!dataTypeDisplay.contains("Numerical")) {
										 fail(driver,"Other than Numerical datatype column is displayed in the Y Axis dropdown");
										 Numerical=false;
										 break;
									 }
								 }
								 if(Numerical) {
									 pass(driver, "Only Numerical datatype column is displayed in the Y Axis dropdown");
								 }
							 }
							 
							 if(TC_WATERFALL_016.equals("Yes")) {
								 setTestCaseID("TC_WATERFALL_016");
								 if(verifyElementDisplayed(driver, dropdownInputsearchBox)) {
									 if(TC_WATERFALL_017.equals("Yes")) {
										 setTestCaseID("TC_WATERFALL_017");
										 sendKeys(driver, dropdownInputsearchBox, Select_Y_Axis_Value);
										 List<WebElement> AvailableColumnList=getWebElements(driver, AvailableList_Dropdown);
										 String firstValue_=getText1(driver,FirstSearchedvalue);
										 if(firstValue_.contains(Select_Y_Axis_Value) && AvailableColumnList.size()==1) {
											 pass(driver,"Searched Value correctly displayed first in the Y Axis dropdown");
										 }else {
											 fail(driver,"Searched Value not correctly displayed first in the Y Axis dropdown");
										 }
									 }
								 }
							 }
							 
							 
							 if(TC_WATERFALL_018.equals("Yes")) {
								 setTestCaseID("TC_WATERFALL_018");
								 selectDropdownValue1(driver,Select_Y_Axis_Value);
								 wait(driver,"1");
								 String selectedValue1=getText1(driver,Y_Axis_Input);
								 if(selectedValue1.contains(Select_Y_Axis_Value)) {
									 pass(driver,"Selected Columnn displayed in the Y Axis input successfully");
								 }else {
									 fail(driver,"Selected Columnn not displayed in the Y Axis input successfully");
								 }
								 
								 
								 if(TC_WATERFALL_019.equals("Yes")) {
									 setTestCaseID("TC_WATERFALL_019");
									 click(driver,X_Axis_Input);
									 click(driver,SelectOption);
									 scrollUsingElement(driver, ApplyButton);
									 click(driver,ApplyButton);
									 if(isDisplayed2(driver,ApplyError1)) {
										 pass(driver,"'Kindly select X axis and Y axis' error is displayed When Click Apply button Only selecting X Value");
									 }else {
										 fail(driver,"'Kindly select X axis and Y axis' error is not displayed When Click Apply button Only selecting X Value");
									 }
									 elementnotvisible1(driver, error);
									 click(driver,X_Axis_Input);
									 selectDropdownValue1(driver,Select_X_Axis_Value);
								 }
							 }
							 
						 }else {
							 fail(driver,"Y Axis dropdown is not expanded after click on it ");
						 }
					 }
				 }
				 
				 if(TC_WATERFALL_020.equals("Yes")) {
					 setTestCaseID("TC_WATERFALL_020");
					 scrollUsingElement(driver, ApplyButton);
					 click(driver,ApplyButton);
					 if(isDisplayed2(driver,error)){
						 fail(driver,"Error displayed When click Apply Button after selecting X and Y Values, Validation : "+getText1(driver,error));
						 elementnotvisible1(driver, error);
					 }else {
						 verifyElementDisplayed(driver, Chart);
					 }
				 }
				 
				 // ******************** Axis Title Validation Start *******************
				 String WaterFall_Axis_Title= getCellValue("TestExecution","Testcase_Selection","WaterFall_Axis_Title",Flag);
			     if(WaterFall_Axis_Title.equals("Yes")) {
			    	//Yes/No Input for Testcases Id
			 		 String TC_WATERFALL_AXIS_TITLE_001=getTestcaseID_Flag(TestcaseFileName,SheetName_Axis_Title,TescasesID_Column,"TC_ WATER FALL_001",TestcaseID_Flag);
			 		 String TC_WATERFALL_AXIS_TITLE_002=getTestcaseID_Flag(TestcaseFileName,SheetName_Axis_Title,TescasesID_Column,"TC_ WATER FALL_002",TestcaseID_Flag);
			 		 String TC_WATERFALL_AXIS_TITLE_003=getTestcaseID_Flag(TestcaseFileName,SheetName_Axis_Title,TescasesID_Column,"TC_ WATER FALL_003",TestcaseID_Flag);
			 		 String TC_WATERFALL_AXIS_TITLE_004=getTestcaseID_Flag(TestcaseFileName,SheetName_Axis_Title,TescasesID_Column,"TC_ WATER FALL_004",TestcaseID_Flag);
			 		 String TC_WATERFALL_AXIS_TITLE_005=getTestcaseID_Flag(TestcaseFileName,SheetName_Axis_Title,TescasesID_Column,"TC_ WATER FALL_005",TestcaseID_Flag);
			 		 String TC_WATERFALL_AXIS_TITLE_006=getTestcaseID_Flag(TestcaseFileName,SheetName_Axis_Title,TescasesID_Column,"TC_ WATER FALL_006",TestcaseID_Flag);
			 		 String TC_WATERFALL_AXIS_TITLE_007=getTestcaseID_Flag(TestcaseFileName,SheetName_Axis_Title,TescasesID_Column,"TC_ WATER FALL_007",TestcaseID_Flag);
			 		 String TC_WATERFALL_AXIS_TITLE_008=getTestcaseID_Flag(TestcaseFileName,SheetName_Axis_Title,TescasesID_Column,"TC_ WATER FALL_008",TestcaseID_Flag);
			 		 String TC_WATERFALL_AXIS_TITLE_009=getTestcaseID_Flag(TestcaseFileName,SheetName_Axis_Title,TescasesID_Column,"TC_ WATER FALL_009",TestcaseID_Flag);
			 		 String TC_WATERFALL_AXIS_TITLE_010=getTestcaseID_Flag(TestcaseFileName,SheetName_Axis_Title,TescasesID_Column,"TC_ WATER FALL_010",TestcaseID_Flag);
			 		 String TC_WATERFALL_AXIS_TITLE_011=getTestcaseID_Flag(TestcaseFileName,SheetName_Axis_Title,TescasesID_Column,"TC_ WATER FALL_011",TestcaseID_Flag);
			 		 String TC_WATERFALL_AXIS_TITLE_012=getTestcaseID_Flag(TestcaseFileName,SheetName_Axis_Title,TescasesID_Column,"TC_ WATER FALL_012",TestcaseID_Flag);
			 		 String TC_WATERFALL_AXIS_TITLE_013=getTestcaseID_Flag(TestcaseFileName,SheetName_Axis_Title,TescasesID_Column,"TC_ WATER FALL_013",TestcaseID_Flag);
			 		 String TC_WATERFALL_AXIS_TITLE_014=getTestcaseID_Flag(TestcaseFileName,SheetName_Axis_Title,TescasesID_Column,"TC_ WATER FALL_014",TestcaseID_Flag);
			 		 String TC_WATERFALL_AXIS_TITLE_015=getTestcaseID_Flag(TestcaseFileName,SheetName_Axis_Title,TescasesID_Column,"TC_ WATER FALL_015",TestcaseID_Flag);
			 		 String TC_WATERFALL_AXIS_TITLE_016=getTestcaseID_Flag(TestcaseFileName,SheetName_Axis_Title,TescasesID_Column,"TC_ WATER FALL_016",TestcaseID_Flag);
			 		 String TC_WATERFALL_AXIS_TITLE_017=getTestcaseID_Flag(TestcaseFileName,SheetName_Axis_Title,TescasesID_Column,"TC_ WATER FALL_017",TestcaseID_Flag);
			 		 String TC_WATERFALL_AXIS_TITLE_018=getTestcaseID_Flag(TestcaseFileName,SheetName_Axis_Title,TescasesID_Column,"TC_ WATER FALL_018",TestcaseID_Flag);
			 		 String TC_WATERFALL_AXIS_TITLE_019=getTestcaseID_Flag(TestcaseFileName,SheetName_Axis_Title,TescasesID_Column,"TC_ WATER FALL_019",TestcaseID_Flag);
			 		 String TC_WATERFALL_AXIS_TITLE_020=getTestcaseID_Flag(TestcaseFileName,SheetName_Axis_Title,TescasesID_Column,"TC_ WATER FALL_020",TestcaseID_Flag);
			 		 String TC_WATERFALL_AXIS_TITLE_021=getTestcaseID_Flag(TestcaseFileName,SheetName_Axis_Title,TescasesID_Column,"TC_ WATER FALL_021",TestcaseID_Flag);
			 		 String TC_WATERFALL_AXIS_TITLE_022=getTestcaseID_Flag(TestcaseFileName,SheetName_Axis_Title,TescasesID_Column,"TC_ WATER FALL_022",TestcaseID_Flag);
			 		 String TC_WATERFALL_AXIS_TITLE_023=getTestcaseID_Flag(TestcaseFileName,SheetName_Axis_Title,TescasesID_Column,"TC_ WATER FALL_023",TestcaseID_Flag);

			 		 if(TC_WATERFALL_AXIS_TITLE_001.equals("Yes")) {
			 			setTestCaseID("TC_WATERFALL_AXIS_TITLE_001");
			 			if(verifyElementDisplayed(driver, AxisTitle)) {
			 				click(driver,AxisTitle);
				 			wait(driver,"1");
				 			String AxisExpand=getAttribute1(driver,AxisTitleExpand,"class");
				 			if(AxisExpand.contains("up")) {
			     	  			pass(driver,"Axis Title section is Expanded after click on it");
			     	  			
			     	  			if(TC_WATERFALL_AXIS_TITLE_002.equals("Yes")) {
						 			setTestCaseID("TC_WATERFALL_AXIS_TITLE_002");
						 			
						 			verifyElementDisplayed(driver, X_Title_text);
					     	      	verifyElementDisplayed(driver,X_Title_input);
					     	      	verifyElementDisplayed(driver, Y_Title_text);
					     	      	verifyElementDisplayed(driver,Y_Title_input);
					     	  	
					     	      	clearAndType(driver,X_Title_input,Change_X_Title_Name);
					     	       	clearAndType(driver,Y_Title_input,Change_Y_Title_Name);
					     	       	
					     	        wait(driver,"1");
					     	       	scrollUsingElement(driver, ApplyButton);
					     	  		click(driver,ApplyButton);
					     	  		elementnotvisible1(driver, RPE_Loading);
					     	  		verifyElementDisplayed(driver,Chart_Section);
					     	  		
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
			     	  			
			     	  			setTestCaseID("TS_WATERFALL003");
			     	  			if(verifyElementDisplayed(driver, fontFamily_dropdown)) {
			     	  				if(TC_WATERFALL_AXIS_TITLE_003.equals("Yes")) {
							 			setTestCaseID("TC_WATERFALL_AXIS_TITLE_003");
							 			String fontFamily_Value=getText1(driver,fontFamily_dropdown);
					     	       		System.out.println("FontFamily_Value : "+fontFamily_Value);
					     	       		if(fontFamily_Value.equals(default_FontFamily)) {
					     	      			pass(driver,"By default, "+default_FontFamily+" displayed in the Font Family input");
					     	       		}else {
					     	           	    fail(driver,"By default, "+default_FontFamily+" is not displayed in the Font Family input");
					     	       		}
				     	  			}
				     	  			
			     	  				if(TC_WATERFALL_AXIS_TITLE_004.equals("Yes")) {
							 			setTestCaseID("TC_WATERFALL_AXIS_TITLE_004");
							 			click(driver,fontFamily_dropdown);
							 			if(isDisplayed(driver,fontFamily_DropdownExpand)) {
						     	        	pass(driver,"Font family dropdown is expanded after click on it");
						     	        	if(TC_WATERFALL_AXIS_TITLE_005.equals("Yes")) {
									 			setTestCaseID("TC_WATERFALL_AXIS_TITLE_005");
									 			ScrollBarValidation1(driver,fontFamily_DropdownExpand,"Font_Family_WaterFall");
						     	        	}
						     	        	
						     	        	if(TC_WATERFALL_AXIS_TITLE_006.equals("Yes")) {
									 			setTestCaseID("TC_WATERFALL_AXIS_TITLE_006");
									 			selectFontFamily(driver,ChangeFontFamily_AxisTitle);
							     	           	wait(driver,"1");
							     	           	scrollUsingElement(driver, ApplyButton);
							     	    		click(driver,ApplyButton);
							     	    		elementnotvisible1(driver, RPE_Loading);
							     	    		verifyElementDisplayed(driver,Chart_Section);
							     	    		String fontFamily_Y_Act=getFontFamily(driver,Y_Value);
							     	    		if(fontFamily_Y_Act.equals(ChangeFontFamily_AxisTitle)) {
							     	   			     pass(driver,"Selected fontFamily ("+ChangeFontFamily_AxisTitle+") Updated in Y Axis chart value");
							     	    		}else {
							     	         	    fail(driver,"Selected FontFamily ("+ChangeFontFamily_AxisTitle+") is not Updated in Y Axis chart value");
							     	    		} 
						     	        	}
						     	        	
							 			}else {
							 				fail(driver,"Font family dropdown is not expanded after click on it");
							 			}
			     	  				}
			     	  			}
			     	  			
			     	  			setTestCaseID("TS_WATERFALL004");
			     	  			if(verifyElementDisplayed(driver, titleFontSizeDropdown)) {
			     	  				if(TC_WATERFALL_AXIS_TITLE_007.equals("Yes")) {
							 			setTestCaseID("TC_WATERFALL_AXIS_TITLE_007");
							 			String font_Size_Act=defaultSelectedValue(driver,titleFontSizeDropdown);
					     	       		//System.out.println("Font_Size : "+font_Size_Act);
					     	       		if(font_Size_Act.equals(default_FontSize_Exp)) {
					     	      			pass(driver,"By default, "+default_FontSize_Exp+" displayed in the Title Font Size input");
					     	       		}else {
					     	           	    fail(driver,"By default, "+default_FontSize_Exp+" is not displayed in the Title Font Size input");
					     	       		}
			     	  				}
			     	  				
			     	  				if(TC_WATERFALL_AXIS_TITLE_008.equals("Yes")) {
							 			setTestCaseID("TC_WATERFALL_AXIS_TITLE_008");
							 			click(driver,titleFontSizeDropdown);
							 			verifyElementIsPresent1(driver, TitleFontSizeOptions);
			     	  				}
			     	  				
			     	  				if(TC_WATERFALL_AXIS_TITLE_009.equals("Yes")) {
							 			setTestCaseID("TC_WATERFALL_AXIS_TITLE_009");
							 			selectOptionValue(driver,titleFontSizeDropdown,ChangeTitleFontSize_AxisTitle);
						     	  		wait(driver,"1");
						     	  		scrollUsingElement(driver, ApplyButton);
						     	  		click(driver,ApplyButton);
						     	  		elementnotvisible1(driver, RPE_Loading);
						     	  		verifyElementDisplayed(driver,Chart_Section);
						     	  		String fontSize_Y_Act=getFontSize(driver,Y_Value);
						     	  		String fontSize_X_Act=getFontSize(driver,X_Value);
						     	  		if((ChangeTitleFontSize_AxisTitle.equals(fontSize_Y_Act))&&ChangeTitleFontSize_AxisTitle.equals(fontSize_X_Act)) {
						     	  			pass(driver,"Given Title Font Size Updated in X-Axis Title and Y-Axis Title chart value");
						     	  		}else {
						     	  			fail(driver,"Given Title Font Size '"+ChangeTitleFontSize_AxisTitle+"' not Updated in X-Axis Title or Y-Axis Title chart value");
						     	  		}
			     	  				}
			     	  			}
			     	  			
			     	  			if(TC_WATERFALL_AXIS_TITLE_010.equals("Yes")) {
						 			setTestCaseID("TC_WATERFALL_AXIS_TITLE_010");
						 			if(verifyElementDisplayed(driver,X_axisFontSizeDropdown)) {
					     	       		String X_font_Size_Act=defaultSelectedValue(driver,X_axisFontSizeDropdown);
					     	       		System.out.println("X Font_Size : "+X_font_Size_Act);
					     	       		if(X_font_Size_Act.equals(default_FontSize_Exp)) {
					     	      			pass(driver,"By default, "+default_FontSize_Exp+" displayed in the X axis Font Size input");
					     	       		}else {
					     	           	    fail(driver,"By default, "+default_FontSize_Exp+" is not displayed in the X axis Font Size input");
					     	       		}
					     	       	}
			     	  			}
			     	  			if(TC_WATERFALL_AXIS_TITLE_011.equals("Yes")) {
						 			setTestCaseID("TC_WATERFALL_AXIS_TITLE_011");
						 			click(driver,X_axisFontSizeDropdown);
						 			verifyElementIsPresent1(driver, X_axisFontSizeDropdownOptions);
			     	  			}
			     	  			if(TC_WATERFALL_AXIS_TITLE_012.equals("Yes")) {
						 			setTestCaseID("TC_WATERFALL_AXIS_TITLE_012");
						 			selectOptionValue(driver,X_axisFontSizeDropdown,Change_X_label_FontSize);
					     	  		scrollUsingElement(driver, ApplyButton);
					     	  		click(driver,ApplyButton);
					     	  		elementnotvisible1(driver, RPE_Loading);
					     	  		verifyElementDisplayed(driver,Chart_Section);
					     	     	String fontSize_X_label_Act=getFontSize(driver,X_AxisLabel_chartNew);
					     	     	if(Change_X_label_FontSize.equals(fontSize_X_label_Act)) {
					     	     		pass(driver,"Selected fontSize ("+Change_X_label_FontSize+") Updated in X Axis label chart value");
					     	  		}else {
					     	  			fail(driver,"Selected fontSize  ("+Change_X_label_FontSize+") not Updated in X Axis label chart value");
					     	  		}
			     	  			}
			     	  			
			     	  			if(TC_WATERFALL_AXIS_TITLE_013.equals("Yes")) {
						 			setTestCaseID("TC_WATERFALL_AXIS_TITLE_013");
						 			if(verifyElementDisplayed(driver,Y_axisFontSizeDropdown)) {
					     	       		String Y_font_Size_Act=defaultSelectedValue(driver,Y_axisFontSizeDropdown);
					     	       		//System.out.println("Y Font_Size : "+Y_font_Size_Act);
					     	       		if(Y_font_Size_Act.equals(default_FontSize_Exp)) {
					     	      			pass(driver,"By default, "+default_FontSize_Exp+" displayed in the Y axis Font Size input");
					     	       		}else {
					     	           	    fail(driver,"By default, "+default_FontSize_Exp+" is not displayed in the Y axis Font Size input");
					     	       		}
					     	       	}
			     	  			}
			     	  			if(TC_WATERFALL_AXIS_TITLE_014.equals("Yes")) {
						 			setTestCaseID("TC_WATERFALL_AXIS_TITLE_014");
						 			 click(driver,Y_axisFontSizeDropdown);
						 			 verifyElementIsPresent1(driver, Y_axisFontSizeDropdownOptions);
			     	  			}
			     	  			if(TC_WATERFALL_AXIS_TITLE_015.equals("Yes")) {
						 			setTestCaseID("TC_WATERFALL_AXIS_TITLE_015");
						 			selectOptionValue(driver,Y_axisFontSizeDropdown,Change_Y_label_FontSize);
					     	  		scrollUsingElement(driver, ApplyButton);
					     	  		click(driver,ApplyButton);
					     	  		elementnotvisible1(driver, RPE_Loading);
					     	  		verifyElementDisplayed(driver,Chart_Section);
					     	     	String fontSize_Y_label_Act=getFontSize(driver,Column_Y_Labels_Chart);
					     	      	if(Change_Y_label_FontSize.equals(fontSize_Y_label_Act)) {
					     	  		    pass(driver,"Selected fontSize ("+Change_Y_label_FontSize+") Updated in Y Axis label chart value");
					     	  		}else {
					     	    	    fail(driver,"Selected fontSize ("+Change_Y_label_FontSize+") not Updated in Y Axis label chart value, Act : "+fontSize_Y_label_Act);
					     	  		}
			     	  			}
			     	  			
			     	  			setTestCaseID("TS_WATERFALL005");
			     	  			if(verifyElementDisplayed(driver, X_RotationInputSlider)) {
			     	  				if(TC_WATERFALL_AXIS_TITLE_016.equals("Yes")) {
							 			setTestCaseID("TC_WATERFALL_AXIS_TITLE_016");
							 			String X_RotationValueAct=getText1(driver,X_RotationOutputValue);
					     	       		System.out.println("X rotation : "+X_RotationValueAct);
					     	       		if(X_RotationValueAct.equals(defaultRotation)) {
					     	       			pass(driver,"By default, '"+defaultRotation+"' displayed in the X axis Rotation output field");
					     	       		}else {
					     	       			fail(driver,"By default, '"+defaultRotation+"' is not displayed in the X axis Rotation output field");
					     	       		}
			     	  				}
			     	  				if(TC_WATERFALL_AXIS_TITLE_017.equals("Yes")) {
							 			setTestCaseID("TC_WATERFALL_AXIS_TITLE_017");
							 			if(isToggleAccessible(driver, X_RotationInputSlider)) {
						     	       		pass(driver,"X Rotation input is Accessible");
						     	       		waitForElement(driver, X_RotationInputSlider);
						     	       		moveSlider(driver,X_RotationInputSlider,X_RotationOutputValue,Change_X_Rotation_Input);
						     	       		scrollUsingElement(driver, ApplyButton);
						     	       		click(driver,ApplyButton);
						     	       		elementnotvisible1(driver, RPE_Loading);
						     	       		verifyElementDisplayed(driver,Chart_Section);
						     	       		
						     	       		String X_label_Rotation_Act=getRotationValue(driver,X_AxisLabel_chartNew);
						     	       		if(Change_X_Rotation_Input.equals(X_label_Rotation_Act)) {
						     	       			pass(driver,"Selected X Rotation Angle ("+Change_X_Rotation_Input+") Updated in X Axis label chart value");
							     	  		}else {
							     	  			fail(driver,"Selected X Rotation Angle ("+Change_X_Rotation_Input+") is not Updated in X Axis label chart value");
							     	  		}
						     	       		
						     	       		if(TC_WATERFALL_AXIS_TITLE_018.equals("Yes")) {
						     	       			setTestCaseID("TC_WATERFALL_AXIS_TITLE_018");
						     	       			String Y_label_Rotation_Act1=getRotationValue(driver,Column_Y_Labels_Chart);
						     	       			if(Change_X_Rotation_Input.equals(Y_label_Rotation_Act1)) {
						     	       				fail(driver,"Selected X Rotation Angle ("+Change_X_Rotation_Input+") Updated in Y Axis label chart value");
						     	       			}else {
						     	       				pass(driver,"Selected X Rotation Angle ("+Change_X_Rotation_Input+") is not Updated in Y Axis label chart value");
						     	       			}
						     	       		}
								 			
						     	       	}else {
						     	       		fail(driver,"X Rotation input is not Accessible");
						     	       	}
			     	  				}
			     	  			}
			     	  			
			     	  			
			     	  			setTestCaseID("TS_WATERFALL006");
			     	  			if(verifyElementDisplayed(driver, Y_RotationInputSlider)) {
			     	  				if(TC_WATERFALL_AXIS_TITLE_019.equals("Yes")) {
							 			setTestCaseID("TC_WATERFALL_AXIS_TITLE_019");
							 			String Y_RotationValueAct=getText1(driver,Y_RotationOutputValue);
					     	       		System.out.println("Y rotation : "+Y_RotationValueAct);
					     	       		if(Y_RotationValueAct.equals(defaultRotation)) {
					     	      			pass(driver,"By default, '"+defaultRotation+"' displayed in the Y axis Rotation output field");
					     	       		}else {
					     	           	    fail(driver,"By default, '"+defaultRotation+"' displayed in the Y axis Rotation output field");
					     	       		}
			     	  				}
			     	  				
			     	  				if(TC_WATERFALL_AXIS_TITLE_020.equals("Yes")) {
							 			setTestCaseID("TC_WATERFALL_AXIS_TITLE_020");
							 			if(isToggleAccessible(driver, Y_RotationInputSlider)) {
						     	       		pass(driver,"Y Rotation input is Accessible");
						     	       		waitForElement(driver, Y_RotationInputSlider);
						     	       		moveSlider(driver,Y_RotationInputSlider,Y_RotationOutputValue,Change_Y_Rotation_Input);
						     	        	if(TC_WATERFALL_AXIS_TITLE_022.equals("Yes")) {
						     	        		setTestCaseID("TC_WATERFALL_AXIS_TITLE_022");
						     	        		scrollUsingElement(driver, ApplyButton);
							     	       		click(driver,ApplyButton);
							     	       		elementnotvisible1(driver, RPE_Loading);
							     	       		verifyElementDisplayed(driver,Chart_Section);
							     	       		String Y_label_Rotation_Act=getRotationValue(driver,Column_Y_Labels_Chart);
							     	       		if(Change_Y_Rotation_Input.equals(Y_label_Rotation_Act)) {
							     	       			pass(driver,"Selected Rotation Angle ("+Change_Y_Rotation_Input+") Updated in Y Axis label chart value");
							     	       		}else {
							     	       			fail(driver,"Selected Rotation Angle ("+Change_Y_Rotation_Input+") is not Updated in Y Axis label chart value");
							     	       		}
							     	       		
						     	        	}
								 			
						     	        	if(TC_WATERFALL_AXIS_TITLE_021.equals("Yes")) {
						     	        		setTestCaseID("TC_WATERFALL_AXIS_TITLE_021");
						     	        		String X_label_Rotation_Act1=getRotationValue(driver,X_AxisLabel_chartNew);
						     	     	     	if(Change_Y_Rotation_Input.equals(X_label_Rotation_Act1)) {
						     	     	 	    	 fail(driver,"Selected Y Rotation Angle ("+Change_Y_Rotation_Input+") Updated in X Axis label chart value");
						     	     	  		}else {
						     	     	  			pass(driver,"Selected Y Rotation Angle ("+Change_Y_Rotation_Input+") is not Updated in X Axis label chart value");
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
			     
			  // ******************** Chart Style Validation Start *******************
				 String WaterFall_ChartFormat_Chart_Style= getCellValue("TestExecution","Testcase_Selection","WaterFall_ChartFormat_Chart_Style",Flag);
			     if(WaterFall_ChartFormat_Chart_Style.equals("Yes")) {
			    	 
			    	//Yes/No Input for Testcases Id
			 		String TC_WATERFALL_CHART_STYLE_001=getTestcaseID_Flag(TestcaseFileName,SheetName_Chart_Style,TescasesID_Column,"TC_ Water Fall_001",TestcaseID_Flag);
			 		String TC_WATERFALL_CHART_STYLE_002=getTestcaseID_Flag(TestcaseFileName,SheetName_Chart_Style,TescasesID_Column,"TC_ Water Fall_002",TestcaseID_Flag);
			 		String TC_WATERFALL_CHART_STYLE_003=getTestcaseID_Flag(TestcaseFileName,SheetName_Chart_Style,TescasesID_Column,"TC_ Water Fall_003",TestcaseID_Flag);
			 		String TC_WATERFALL_CHART_STYLE_004=getTestcaseID_Flag(TestcaseFileName,SheetName_Chart_Style,TescasesID_Column,"TC_ Water Fall_004",TestcaseID_Flag);
			 		String TC_WATERFALL_CHART_STYLE_005=getTestcaseID_Flag(TestcaseFileName,SheetName_Chart_Style,TescasesID_Column,"TC_ Water Fall_005",TestcaseID_Flag);
			 		String TC_WATERFALL_CHART_STYLE_006=getTestcaseID_Flag(TestcaseFileName,SheetName_Chart_Style,TescasesID_Column,"TC_ Water Fall_006",TestcaseID_Flag);
			 		String TC_WATERFALL_CHART_STYLE_007=getTestcaseID_Flag(TestcaseFileName,SheetName_Chart_Style,TescasesID_Column,"TC_ Water Fall_007",TestcaseID_Flag);
			 		String TC_WATERFALL_CHART_STYLE_008=getTestcaseID_Flag(TestcaseFileName,SheetName_Chart_Style,TescasesID_Column,"TC_ Water Fall_008",TestcaseID_Flag);
			 		String TC_WATERFALL_CHART_STYLE_009=getTestcaseID_Flag(TestcaseFileName,SheetName_Chart_Style,TescasesID_Column,"TC_ Water Fall_009",TestcaseID_Flag);
			 		String TC_WATERFALL_CHART_STYLE_010=getTestcaseID_Flag(TestcaseFileName,SheetName_Chart_Style,TescasesID_Column,"TC_ Water Fall_010",TestcaseID_Flag);
			 		String TC_WATERFALL_CHART_STYLE_011=getTestcaseID_Flag(TestcaseFileName,SheetName_Chart_Style,TescasesID_Column,"TC_ Water Fall_011",TestcaseID_Flag);
			 		String TC_WATERFALL_CHART_STYLE_012=getTestcaseID_Flag(TestcaseFileName,SheetName_Chart_Style,TescasesID_Column,"TC_ Water Fall_012",TestcaseID_Flag);
			 		String TC_WATERFALL_CHART_STYLE_013=getTestcaseID_Flag(TestcaseFileName,SheetName_Chart_Style,TescasesID_Column,"TC_ Water Fall_013",TestcaseID_Flag);
			 		String TC_WATERFALL_CHART_STYLE_014=getTestcaseID_Flag(TestcaseFileName,SheetName_Chart_Style,TescasesID_Column,"TC_ Water Fall_014",TestcaseID_Flag);
			 		String TC_WATERFALL_CHART_STYLE_015=getTestcaseID_Flag(TestcaseFileName,SheetName_Chart_Style,TescasesID_Column,"TC_ Water Fall_015",TestcaseID_Flag);
			 		String TC_WATERFALL_CHART_STYLE_016=getTestcaseID_Flag(TestcaseFileName,SheetName_Chart_Style,TescasesID_Column,"TC_ Water Fall_016",TestcaseID_Flag);
			 		String TC_WATERFALL_CHART_STYLE_017=getTestcaseID_Flag(TestcaseFileName,SheetName_Chart_Style,TescasesID_Column,"TC_ Water Fall_017",TestcaseID_Flag);
			 		String TC_WATERFALL_CHART_STYLE_018=getTestcaseID_Flag(TestcaseFileName,SheetName_Chart_Style,TescasesID_Column,"TC_ Water Fall_018",TestcaseID_Flag);
			 		String TC_WATERFALL_CHART_STYLE_019=getTestcaseID_Flag(TestcaseFileName,SheetName_Chart_Style,TescasesID_Column,"TC_ Water Fall_019",TestcaseID_Flag);
			 		
			 		if(TC_WATERFALL_CHART_STYLE_001.equals("Yes")) {
			 			setTestCaseID("TC_WATERFALL_ CHART_STYLE_001");
			   	    	verifyElementDisplayed(driver,Chart_FormatSec);
			   			click(driver,Chart_FormatSec);
			   			String ChartFormatOpenstatus=getAttribute1(driver, chartFormatExpand, "class");
			   			if(ChartFormatOpenstatus.contains("up")) {
			   	  			pass(driver,"Chart Format is expanded when clicking the Chart Format");
			   	  			if(TC_WATERFALL_CHART_STYLE_002.equals("Yes")) {
			   	  				setTestCaseID("TC_WATERFALL_ CHART_STYLE_002");
			   	  				String ChartStylingExpand=getAttribute1(driver, ChartStyling_Expand, "class");
			   	  				if(ChartStylingExpand.contains("up")) {
			   	  					pass(driver,"By default, Chart Styling gets Expanded");
			   	  				}else {
			   	  					fail(driver,"By default, Chart Styling not gets Expand");
			   	  					click(driver,ChartStyling_Expand);
			   	  				}
			   	  			}
			   	  			
			   	  			if(TC_WATERFALL_CHART_STYLE_003.equals("Yes")) {
			   	  				setTestCaseID("TC_WATERFALL_ CHART_STYLE_003");
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
			   	  			
			   	  			if(TC_WATERFALL_CHART_STYLE_004.equals("Yes")) {
			   	  				setTestCaseID("TC_WATERFALL_ CHART_STYLE_004");
			   	  				String defaultThemeValue_Act=getText1(driver,ChartThemeInput);
			   	  				if(defaultThemeValue_Act.equals(DefaultThemeValue_Exp)) {
			   	  					pass(driver,"By default, Chart theme selected the value as '"+DefaultThemeValue_Exp+"'");
			   	  				}else {
			   	  					fail(driver,"By default, '"+DefaultThemeValue_Exp+"' value not selected in the  Chart theme input");
			   	  				}
			   	  			}
			   	  			
			   	  			if(TC_WATERFALL_CHART_STYLE_005.equals("Yes")) {
			   	  				setTestCaseID("TC_WATERFALL_ CHART_STYLE_005");
			   	  				click(driver,ChartThemeInput);
			   	  				if(verifyElementDisplayed(driver,ChartThemeResults)) {
			   	  					if(TC_WATERFALL_CHART_STYLE_007.equals("Yes")) {
			   	  						setTestCaseID("TC_WATERFALL_ CHART_STYLE_007");
			   	  						ScrollBarValidation1(driver,ChartThemeResults,"Chart_Theme_WaterFall");
			   	  					}
			   	  					setTestCaseID("");
			   	  					if(verifyElementDisplayed(driver, dropdownInputsearchBox)) {
			   	  						if(TC_WATERFALL_CHART_STYLE_006.equals("Yes")) {
			   	  							setTestCaseID("TC_WATERFALL_ CHART_STYLE_006");
			   	  							click(driver,dropdownInputsearchBox);
			   	  							sendKeys(driver,dropdownInputsearchBox,"sdgffh");
			   	  							String inValidResult=getText1(driver,chartThemeFirstResult);
			   	  							if(inValidResult.equals("No results found")) {
			   	  								pass(driver,"'No results found' displayed when user enter incorrect chart theme");
			   	  							}else {
			   	  								fail(driver,"'No results found' not displayed when user enter incorrect chart theme");
			   	  							}
			   	  							clear1(driver,dropdownInputsearchBox);
			   	  							sendKeys(driver,dropdownInputsearchBox,Change_ChartTheme_ChartStyle);
			   	  							List<WebElement> afterSearchResults=getWebElements(driver,chartThemeResultList);
			   	  							String resultText=getText1(driver,chartThemeFirstResult);
			   	  							if((afterSearchResults.size()==1)&&resultText.equals(Change_ChartTheme_ChartStyle)) {
			   	  								pass(driver,"Search input in the Chart Theme dropdown works properly");
			   	  							}else {
			   	  								fail(driver,"Search input in the Chart Theme dropdown not works properly");
			   	  							}
			   	  						}
			   	  					}
			   	  					
			   	  					if(TC_WATERFALL_CHART_STYLE_008.equals("Yes")) {
			   	  						setTestCaseID("TC_WATERFALL_ CHART_STYLE_008");
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
			   	  				}
			   	  			}
			   	  			
			   	  			setTestCaseID("TS_ Water Fall_004");
			   	  			if(verifyElementDisplayed(driver, X_ScrollInputSlider)) {
			   	  				if(TC_WATERFALL_CHART_STYLE_009.equals("Yes")) {
			   	  					setTestCaseID("TC_WATERFALL_ CHART_STYLE_009");
			   	  					if(isToggleEnable(driver,X_Scroll_toggle)) {
			   	  						fail(driver,"X Scroll toggle not disabled by default ");
			   	  					}else {
			   	  						pass(driver,"X Scroll toggle disabled by default ");
			   	  					}
			   	  				}
			   	  				
			   	  				if(TC_WATERFALL_CHART_STYLE_010.equals("Yes")) {
			   	  					setTestCaseID("TC_WATERFALL_ CHART_STYLE_010");
			   	  					click(driver,X_ScrollInputSlider);
			   	  					if(isToggleEnable(driver,X_Scroll_toggle)){
			   	  						pass(driver,"X Scroll toggle enabled when click on it");
			   	  					}else {
			   	  						fail(driver,"X Scroll toggle not enabled when click on it");
			   	  					}
			   	  					
			   	  					scrollUsingElement(driver, ApplyButton);
			   	  					click(driver,ApplyButton);
			   	  					elementnotvisible1(driver, Loading);
			   	  					elementnotvisible1(driver, RPE_Loading);
			   	  					verifyElementDisplayed(driver,Chart_Section);
				     			
			   	  					if(isDisplayed(driver,X_Scroll_Bar)) {
			   	  						pass(driver,"X Scroll Bar is displayed in the chart after enabling it");
			   	  					}else {
			   	  						fail(driver,"X Scroll Bar is not displayed in the chart after enabling it");
			   	  					}
			   	  				}
			   	  			}
			   	  			setTestCaseID("TS_ Water Fall_004");
			   	  			if(verifyElementDisplayed(driver, Y_ScrollInputSlider)) {
			   	  				if(TC_WATERFALL_CHART_STYLE_011.equals("Yes")) {
			   	  					setTestCaseID("TC_WATERFALL_ CHART_STYLE_011");
			   	  					if(isToggleEnable(driver,Y_Scroll_toggle)) {
			   	  						fail(driver,"Y Scroll toggle not disabled by default ");
			   	  					}else {
			   	  						pass(driver,"Y Scroll toggle disabled by default ");
			   	  					}
			   	  				}
			   	  				
			   	  				if(TC_WATERFALL_CHART_STYLE_012.equals("Yes")) {
			   	  					setTestCaseID("TC_WATERFALL_ CHART_STYLE_012");
			   	  					click(driver,Y_ScrollInputSlider);
			   	  					wait(driver,"1");
			   	  					if(isToggleEnable(driver,Y_Scroll_toggle)){
			   	  						pass(driver,"Y Scroll toggle enabled when enabling it");
			   	  					}else {
			   	  						fail(driver,"Y Scroll toggle not enabled when enabling it");
			   	  					}
			   	  					
			   	  					scrollUsingElement(driver, ApplyButton);
			   	  					click(driver,ApplyButton);
			   	  					elementnotvisible1(driver, Loading);
			   	  					elementnotvisible1(driver, RPE_Loading);
			   	  					verifyElementDisplayed(driver,Chart_Section);
			   	  					
			   	  					if(isDisplayed(driver,Y_Scroll_Bar)) {
			   	  						pass(driver,"Y Scroll Bar is displayed in the chart after enabling it");
			   	  					}else {
			   	  						fail(driver,"Y Scroll Bar is not displayed in the chart after enabling it");
			   	  					}
			   	  				}
			   	  			}
			   	  			
			   	  			setTestCaseID("TS_ Water Fall_005");
			   	  			if(verifyElementDisplayed(driver, EnableGrid_InputSlider)) {
			   	  				if(TC_WATERFALL_CHART_STYLE_013.equals("Yes")) {
			   	  					setTestCaseID("TC_WATERFALL_ CHART_STYLE_013");
			   	  					if(isToggleEnable(driver,EnableGrid_toggle)) {
			   	  						pass(driver,"By default, 'Enable Grid' toggle is enabled");
				     				 
			   	  						scrollUsingElement(driver, ApplyButton);
			   	  						click(driver,ApplyButton);
				     	  				elementnotvisible1(driver, Loading);
				     	  				elementnotvisible1(driver, RPE_Loading);
				     	  				verifyElementDisplayed(driver,Chart_Section);
				     	  			
				     	  				if(isDisplayed(driver,Grid_Stacked_Column)) {
				     	  					pass(driver,"Grid is displayed in the chart when it is enable");
				     	  				}else {
				     	  					fail(driver,"Grid is not displayed in the chart when it is enable");
				     	  				}
			   	  					}else {
			   	  						fail(driver,"By default, 'Enable Grid' toggle is not enabled");
				   	  				}
			   	  				}
			   	  				if(TC_WATERFALL_CHART_STYLE_014.equals("Yes")) {
			   	  					setTestCaseID("TC_WATERFALL_ CHART_STYLE_014");
			   	  					click(driver,EnableGrid_InputSlider);
			   	  					wait(driver,"1");
			   	  					if(isToggleEnable(driver,EnableGrid_toggle)){
			   	  						fail(driver,"'Enable Grid' toggle not disabled when click on it ");
			   	  					}else {
			   	  						pass(driver,"'Enable Grid' toggle disabled when click on it ");
			   	  					}
			   	  					
			   	  					scrollUsingElement(driver, ApplyButton);
			   	  					click(driver,ApplyButton);
			   	  					elementnotvisible1(driver, Loading);
			   	  					elementnotvisible1(driver, RPE_Loading);
			   	  					verifyElementDisplayed(driver,Chart_Section);
			     	  			
			   	  					if(isDisplayed(driver,Grid_Stacked_Column)) {
			   	  						fail(driver,"Grid is displayed in the chart when it is disable");
			   	  					}else {
			   	  						pass(driver,"Grid is not displayed in the chart when it is disable");
			   	  					}
			   	  				}
			   	  			}
			   	  			setTestCaseID("TS_ Water Fall_005");
			   	  			if(verifyElementDisplayed(driver, Grid_Distance_Input)) {
			   	  				if(TC_WATERFALL_CHART_STYLE_015.equals("Yes")) {
			   	  					setTestCaseID("TC_WATERFALL_ CHART_STYLE_015");
			   	  					String defaultGrid_distance_Act=defaultSelectedValue(driver,Grid_Distance_Input);
			   	  					if(Default_Grid_distance_Column.equals(defaultGrid_distance_Act)) {
			   	  						pass(driver,"By default "+Default_Grid_distance_Column+" is displayed in the Grid Distance Input");
			   	  					}else {
			   	  						fail(driver,"By default "+Default_Grid_distance_Column+" is not displayed in the Grid Distance Input");
			   	  					}
			   	  				}
			   	  				
			   	  				if(TC_WATERFALL_CHART_STYLE_016.equals("Yes")) {
			   	  					setTestCaseID("TC_WATERFALL_ CHART_STYLE_016");
			   	  					if(isToggleAccessible(driver, Grid_Distance_Input)) {
			   	  						pass(driver,"Grid_Distance_Input is Accessible");
			   	  						if(TC_WATERFALL_CHART_STYLE_017.equals("Yes")) {
			   	  							setTestCaseID("TC_WATERFALL_ CHART_STYLE_017");
			   	  							click(driver,Grid_Distance_Input);
			   	  							verifyElementIsPresent1(driver, Grid_Distance_Results);
			   	  						}
			   	  						
			   	  						if(TC_WATERFALL_CHART_STYLE_018.equals("Yes")) {
			   	  							setTestCaseID("TC_WATERFALL_ CHART_STYLE_018");
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
			   	  			}
			   	  			
			   	  			if(TC_WATERFALL_CHART_STYLE_019.equals("Yes")) {
			   	  				setTestCaseID("TC_WATERFALL_ CHART_STYLE_019");
			   	  				click(driver,ChartStyling);
			   	  				wait(driver,"1");
			   	  				String chartStyleClose_Act=getAttribute1(driver, ChartStyling_Expand, "class");
			   	  				if(chartStyleClose_Act.contains("down")) {
			   	  					pass(driver,"Chart styling gets collapsed when click on it");
			   	  				}else {
			   	  					fail(driver,"Chart styling not gets collapsed when click on it");
			   	  				}
			   	  			}
			   			}else {
			   	  			fail(driver,"Chart Format is not expanded when click the Chart Format");
			   			}
			 		}
			    	 
			     }// Chart Style Endd...
			     
			     // ******************** Chart Style Validation End *******************
			     setTestCaseID("");
			     // ******************** Data Labels Validation Start *******************
				 String WaterFall_ChartFormat_Data_Labels= getCellValue("TestExecution","Testcase_Selection","WaterFall_ChartFormat_Data_Labels",Flag);
			     if(WaterFall_ChartFormat_Data_Labels.equals("Yes")) {
			    	 
			    	//Yes/No Input for Testcases Id
			 		String TC_WATERFALL_DATA_LABEL_001=getTestcaseID_Flag(TestcaseFileName,SheetName_Data_Style,TescasesID_Column,"TC_ Water Fall_001",TestcaseID_Flag);
			 		String TC_WATERFALL_DATA_LABEL_002=getTestcaseID_Flag(TestcaseFileName,SheetName_Data_Style,TescasesID_Column,"TC_ Water Fall_002",TestcaseID_Flag);
			 		String TC_WATERFALL_DATA_LABEL_003=getTestcaseID_Flag(TestcaseFileName,SheetName_Data_Style,TescasesID_Column,"TC_ Water Fall_003",TestcaseID_Flag);
			 		String TC_WATERFALL_DATA_LABEL_004=getTestcaseID_Flag(TestcaseFileName,SheetName_Data_Style,TescasesID_Column,"TC_ Water Fall_004",TestcaseID_Flag);
			 		String TC_WATERFALL_DATA_LABEL_005=getTestcaseID_Flag(TestcaseFileName,SheetName_Data_Style,TescasesID_Column,"TC_ Water Fall_005",TestcaseID_Flag);
			 		String TC_WATERFALL_DATA_LABEL_006=getTestcaseID_Flag(TestcaseFileName,SheetName_Data_Style,TescasesID_Column,"TC_ Water Fall_006",TestcaseID_Flag);
			 		String TC_WATERFALL_DATA_LABEL_007=getTestcaseID_Flag(TestcaseFileName,SheetName_Data_Style,TescasesID_Column,"TC_ Water Fall_007",TestcaseID_Flag);
			 		String TC_WATERFALL_DATA_LABEL_008=getTestcaseID_Flag(TestcaseFileName,SheetName_Data_Style,TescasesID_Column,"TC_ Water Fall_008",TestcaseID_Flag);
			 		String TC_WATERFALL_DATA_LABEL_009=getTestcaseID_Flag(TestcaseFileName,SheetName_Data_Style,TescasesID_Column,"TC_ Water Fall_009",TestcaseID_Flag);
			 		String TC_WATERFALL_DATA_LABEL_010=getTestcaseID_Flag(TestcaseFileName,SheetName_Data_Style,TescasesID_Column,"TC_ Water Fall_010",TestcaseID_Flag);
			 		String TC_WATERFALL_DATA_LABEL_011=getTestcaseID_Flag(TestcaseFileName,SheetName_Data_Style,TescasesID_Column,"TC_ Water Fall_011",TestcaseID_Flag);
			 		String TC_WATERFALL_DATA_LABEL_012=getTestcaseID_Flag(TestcaseFileName,SheetName_Data_Style,TescasesID_Column,"TC_ Water Fall_012",TestcaseID_Flag);
			 		String TC_WATERFALL_DATA_LABEL_013=getTestcaseID_Flag(TestcaseFileName,SheetName_Data_Style,TescasesID_Column,"TC_ Water Fall_013",TestcaseID_Flag);
			 		String TC_WATERFALL_DATA_LABEL_014=getTestcaseID_Flag(TestcaseFileName,SheetName_Data_Style,TescasesID_Column,"TC_ Water Fall_014",TestcaseID_Flag);
			 		String TC_WATERFALL_DATA_LABEL_015=getTestcaseID_Flag(TestcaseFileName,SheetName_Data_Style,TescasesID_Column,"TC_ Water Fall_015",TestcaseID_Flag);
			 		String TC_WATERFALL_DATA_LABEL_016=getTestcaseID_Flag(TestcaseFileName,SheetName_Data_Style,TescasesID_Column,"TC_ Water Fall_016",TestcaseID_Flag);
			 		String TC_WATERFALL_DATA_LABEL_017=getTestcaseID_Flag(TestcaseFileName,SheetName_Data_Style,TescasesID_Column,"TC_ Water Fall_017",TestcaseID_Flag);
			 		String TC_WATERFALL_DATA_LABEL_018=getTestcaseID_Flag(TestcaseFileName,SheetName_Data_Style,TescasesID_Column,"TC_ Water Fall_018",TestcaseID_Flag);
			 		String TC_WATERFALL_DATA_LABEL_019=getTestcaseID_Flag(TestcaseFileName,SheetName_Data_Style,TescasesID_Column,"TC_ Water Fall_019",TestcaseID_Flag);
			 		String TC_WATERFALL_DATA_LABEL_020=getTestcaseID_Flag(TestcaseFileName,SheetName_Data_Style,TescasesID_Column,"TC_ Water Fall_020",TestcaseID_Flag);
			 		String TC_WATERFALL_DATA_LABEL_021=getTestcaseID_Flag(TestcaseFileName,SheetName_Data_Style,TescasesID_Column,"TC_ Water Fall_021",TestcaseID_Flag);
			 		String TC_WATERFALL_DATA_LABEL_022=getTestcaseID_Flag(TestcaseFileName,SheetName_Data_Style,TescasesID_Column,"TC_ Water Fall_022",TestcaseID_Flag);
			 		String TC_WATERFALL_DATA_LABEL_023=getTestcaseID_Flag(TestcaseFileName,SheetName_Data_Style,TescasesID_Column,"TC_ Water Fall_023",TestcaseID_Flag);
			 		String TC_WATERFALL_DATA_LABEL_024=getTestcaseID_Flag(TestcaseFileName,SheetName_Data_Style,TescasesID_Column,"TC_ Water Fall_024",TestcaseID_Flag);
			 		String TC_WATERFALL_DATA_LABEL_025=getTestcaseID_Flag(TestcaseFileName,SheetName_Data_Style,TescasesID_Column,"TC_ Water Fall_025",TestcaseID_Flag);
			 		String TC_WATERFALL_DATA_LABEL_026=getTestcaseID_Flag(TestcaseFileName,SheetName_Data_Style,TescasesID_Column,"TC_ Water Fall_026",TestcaseID_Flag);
			 		String TC_WATERFALL_DATA_LABEL_027=getTestcaseID_Flag(TestcaseFileName,SheetName_Data_Style,TescasesID_Column,"TC_ Water Fall_027",TestcaseID_Flag);
			 		String TC_WATERFALL_DATA_LABEL_028=getTestcaseID_Flag(TestcaseFileName,SheetName_Data_Style,TescasesID_Column,"TC_ Water Fall_028",TestcaseID_Flag);

			 		if(!WaterFall_ChartFormat_Chart_Style.equals("Yes")) {
			 			click(driver,Chart_FormatSec);
			 		}
			 		
			 		
			 		if(TC_WATERFALL_DATA_LABEL_001.equals("Yes")) {
   	  					setTestCaseID("TC_WATERFALL_ DATA_LABEL_001");
   	  					String DataLabelsExpand=getAttribute1(driver, DataLabels_Expand, "class");
   	  					if(DataLabelsExpand.contains("up")) {
   	  						pass(driver,"By default, Data Labels gets Expanded");
   	  					}else {
   	  						fail(driver,"By default, Data Labels not gets Expand");
   	  						click(driver,DataLabels);
   	  					}
			 		}
			 		
			 		if(TC_WATERFALL_DATA_LABEL_002.equals("Yes")) {
   	  					setTestCaseID("TC_WATERFALL_ DATA_LABEL_002");
   	  					verifyElementDisplayed(driver,EnableValue_text);
   	  					verifyElementIsPresent1(driver, EnableValue_InputSlider);

   	  					verifyElementDisplayed(driver,Seperator_text);
   	  					verifyElementIsPresent1(driver,SeperatorInput);
   	  	  		
   	  					verifyElementDisplayed(driver,ValueFontSize_text);
   	  					verifyElementIsPresent1(driver,ValueFontSizeInput);
   	  	       
   	  					verifyElementDisplayed(driver,RoundOffValue_text);
   	  					verifyElementIsPresent1(driver,RoundOffValueInput);
   	  	       
   	  					verifyElementDisplayed(driver,Position_text);
   	  					verifyElementIsPresent1(driver,PositionInput);
   	  	       
   	  					verifyElementDisplayed(driver,BigNumberSuffix_text);
   	  					verifyElementIsPresent1(driver,BigNumberInput);
   	  	       
   	  					verifyElementDisplayed(driver,ValueRotation_text);
   	  					verifyElementIsPresent1(driver,ValueRotation_Input);
   	  					
			 		}
			 		
			 		if(TC_WATERFALL_DATA_LABEL_003.equals("Yes")) {
   	  					setTestCaseID("TC_WATERFALL_ DATA_LABEL_003");
   	  					if(isToggleEnable(driver,EnableValue_Input)) {
   	  						fail(driver,"By Default, Enable Value toggle is enabled");
   	  					}else {
   	  						pass(driver,"By Default, Enable Value toggle is disabled");
   	  						if(TC_WATERFALL_DATA_LABEL_004.equals("Yes")) {
   	  							setTestCaseID("TC_WATERFALL_ DATA_LABEL_004");
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
   	  						
   	  						if(TC_WATERFALL_DATA_LABEL_005.equals("Yes")) {
   	  							setTestCaseID("TC_WATERFALL_ DATA_LABEL_005");
   	  							click(driver,EnableValue_InputSlider);
   	  							if(isToggleEnable(driver,EnableValue_Input)) {
   	  								pass(driver,"'Enable Value' toggle is enabled after click on it");
   	  							}else {
   	  								fail(driver,"'Enable Value' toggle is not enabled after click on it");
   	  			  	  		 
   	  							}
   	  							scrollUsingElement(driver, ApplyButton);
   	  							click(driver,ApplyButton);
   	  							elementnotvisible1(driver, RPE_Loading);
   	  							verifyElementDisplayed(driver,Chart_Section);
   	  			  		 
   	  							if(isDisplayed(driver,EnableValue)) {
   	  								pass(driver,"Values enabled in charts after enabling the 'Enable Value' toggle"); 
   	  							}else {
   	  								fail(driver,"Values not enabled in charts after enabling the 'Enable Value' toggle"); 
   	  							}
   	  			  		 
   	  							if(TC_WATERFALL_DATA_LABEL_006.equals("Yes")) {
   	  								setTestCaseID("TC_WATERFALL_ DATA_LABEL_006");
   	  								String defaultSeperator_Act=defaultSelectedValue(driver,SeperatorInput);
   	  								if(DefaultSeperatorValue_Exp.equals(defaultSeperator_Act)) {
   	  									pass(driver,"By default, '"+DefaultSeperatorValue_Exp+"' is selected in the Seperator Input"); 
   	  								}else {
   	  									fail(driver,"By default, '"+DefaultSeperatorValue_Exp+"' is not selected in the Seperator Input"); 
   	  								} 
   	  							}
   	  							
   	  							if(TC_WATERFALL_DATA_LABEL_007.equals("Yes")) {
   	  								setTestCaseID("TC_WATERFALL_ DATA_LABEL_007");
   	  								if(isToggleAccessible(driver,SeperatorInput)) {	
   	  									pass(driver,"'Seperator Input' is accessible"); 
   	  									click(driver,SeperatorInput);
   	  									verifyElementIsPresent1(driver, Thousand_Seperator);
   	  									verifyElementIsPresent1(driver, Houndred_Seperator);
   	  								
   	  									if(TC_WATERFALL_DATA_LABEL_008.equals("Yes")) {
   	  										setTestCaseID("TC_WATERFALL_ DATA_LABEL_008");
   	  										selectOptionValue(driver,SeperatorInput,"#,###");
   	  										scrollUsingElement(driver, ApplyButton);
   	  										click(driver,ApplyButton);
   	  										elementnotvisible1(driver, RPE_Loading);
   	  										verifyElementDisplayed(driver,Chart_Section);
   	  						  	
   	  										String ChartValueTextAct= getText(driver,EnableValue);//getText1(driver,ValueFormat_ChartValue);
   	  										if(!ChartValueTextAct.contains(".") && ChartValueTextAct.length()>3) {
   	  											String ValueSeperatorFormat=validateNumberFormat(ChartValueTextAct);
   	  											if(ChartValueTextAct.length()>3 &&!ChartValueTextAct.equals("0")) {
   	  												if(ValueSeperatorFormat.equals("#,###")) {
   	  													pass(driver,"Thousand seperator gets applied for chart enabled values"); 
   	  												}else {
   	  													fail(driver,"Thousand seperator not applied for chart enabled values"); 
   	  												}
   	  											}else {
   	  												pass(driver,"Unable to Validate the 'Thousand seperator' for this value : "+ChartValueTextAct); 
   	  											}
   	  										}
   	  									}
   	  									
   	  									if(TC_WATERFALL_DATA_LABEL_009.equals("Yes")) {
   	  										setTestCaseID("TC_WATERFALL_ DATA_LABEL_009");
   	  										selectOptionValue(driver,SeperatorInput,"#,##");
   	  										scrollUsingElement(driver, ApplyButton);
   	  										click(driver,ApplyButton);
   	  										elementnotvisible1(driver, RPE_Loading);
   	  										verifyElementDisplayed(driver,Chart_Section);
   	  						  		
   	  										String ChartValueTextAct=getText(driver,EnableValue);     //getText1(driver,ValueFormat_ChartValue);
   	  										if(!ChartValueTextAct.contains(".") && ChartValueTextAct.length()>3) {
   	  											String ValueSeperatorFormat=validateNumberFormat(ChartValueTextAct);
   	  											if(ChartValueTextAct.length()>3) {
   	  												if(ValueSeperatorFormat.equals("#,##")) {
   	  													pass(driver,"Hundred Separator gets applied for chart enabled values"); 
   	  												}else {
   	  													fail(driver,"Hundred Separator not applied for chart enabled values"); 
   	  												}
   	  											}else {
   	  												pass(driver,"Unable to Validate the 'Hundred seperator' for this value : "+ChartValueTextAct); 
   	  											}
   	  										}
   	  									}
   	  								}else {
   	  									fail(driver,"'Seperator Input' is not accessible"); 
   	  								}
   	  							}
   	  							
   	  							
   	  							if(TC_WATERFALL_DATA_LABEL_010.equals("Yes")) {
	  								setTestCaseID("TC_WATERFALL_ DATA_LABEL_010");
	  								String defaultFontSize_Act=defaultSelectedValue(driver, ValueFontSizeInput);
	   	  							if(DefaultFontSizeValue_Exp.equals(defaultFontSize_Act)) {
	   	  								pass(driver,"By default, '"+DefaultFontSizeValue_Exp+"' is selected in the Value Font Size Input"); 
	   	  							}else {
	   	  								fail(driver,"By default, '"+DefaultFontSizeValue_Exp+"' is not selected in the Value Font Size Input"); 
	   	  							}
   	  							}
   	  							
   	  							if(TC_WATERFALL_DATA_LABEL_011.equals("Yes")) {
   	  								setTestCaseID("TC_WATERFALL_ DATA_LABEL_011");
   	  								if(isToggleAccessible(driver,ValueFontSizeInput)) {		
   	  									pass(driver,"'Value FontSize Input' is accessible after enabling the 'Enable Value' toggle"); 
   	  									if(TC_WATERFALL_DATA_LABEL_012.equals("Yes")) {
   	  										setTestCaseID("TC_WATERFALL_ DATA_LABEL_012");
   	  										click(driver,ValueFontSizeInput);
   	  										verifyElementIsPresent1(driver, ValueFontSizeOptions);
   	  									}
   	  									
   	  									if(TC_WATERFALL_DATA_LABEL_013.equals("Yes")) {
	  										setTestCaseID("TC_WATERFALL_ DATA_LABEL_013");
   	  										selectOptionValue(driver,ValueFontSizeInput,ChangeFontSizeValue_DataLabel);
   	  										scrollUsingElement(driver, ApplyButton);   
   	  										click(driver,ApplyButton);
   	  										elementnotvisible1(driver, RPE_Loading);
   	  										verifyElementDisplayed(driver,Chart_Section);
   	  					  		
   	  										String ValueFontSizeAct=getFontSize(driver,EnableValue);
   	  										if(ValueFontSizeAct.equals(ChangeFontSizeValue_DataLabel)) {
   	  											pass(driver,"The chart's value displayed with Selected '"+ChangeFontSizeValue_DataLabel+"' font size."); 
   	  										}else {
   	  											fail(driver,"The chart's value not displayed with Selected '"+ChangeFontSizeValue_DataLabel+"' font size."); 
   	  										}
   	  									}
   	  								}else {
   	  									fail(driver,"'Value FontSize Input' is not accessible after enabling the 'Enable Value' toggle");
   	  								}
   	  							}
   	  							
   	  							if(TC_WATERFALL_DATA_LABEL_014.equals("Yes")) {
   	  								setTestCaseID("TC_WATERFALL_ DATA_LABEL_014");
   	  								String defaultRoundOffValue_Act=defaultSelectedValue(driver, RoundOffValueInput);
   	  								if(DefaultRoundOffValue_Exp.equals(defaultRoundOffValue_Act)) {
   	  									pass(driver,"By default, '"+DefaultRoundOffValue_Exp+"' is selected in the RoundOffValue Input"); 
   	  								}else {
   	  									fail(driver,"By default, '"+DefaultRoundOffValue_Exp+"' is not selected in the RoundOffValue Input"); 
   	  								}
   	  							}
   	  							
   	  							if(TC_WATERFALL_DATA_LABEL_015.equals("Yes")) {
	  								setTestCaseID("TC_WATERFALL_ DATA_LABEL_015");
	  								if(isToggleAccessible(driver,RoundOffValueInput)) {		
	  						  	  		 pass(driver,"'RoundOff Value Input' is accessible "); 
	  						  	  		 click(driver,RoundOffValueInput);
	  						  	  		 verifyElementIsPresent1(driver, RoundOffValueOptions);
	  						  	  		 if(TC_WATERFALL_DATA_LABEL_016.equals("Yes")) {
	  						  	  			 setTestCaseID("TC_WATERFALL_ DATA_LABEL_016");
	  						  	  			 selectByText(driver,RoundOffValueInput,ChangeRoundOffValue_DataLabel);
	  						  	  			 scrollUsingElement(driver, ApplyButton);
	  						  	  			 click(driver,ApplyButton);
	  						  	  			 elementnotvisible1(driver, RPE_Loading);
	  						  	  			 verifyElementDisplayed(driver,Chart_Section);
	  						    	   
	  						  	  			 String ChartValueTextAct=getText(driver,EnableValue); 
	  						  	  			 String RoundOffValue_Act=String.valueOf(getRoundOffValue(ChartValueTextAct));
	  						  	  			 if(RoundOffValue_Act.equals(ChangeRoundOffValue_DataLabel)) {
	  						  	  				 pass(driver,"The chart's value displayed with Selected '"+ChangeRoundOffValue_DataLabel+"' RoundOff Value"); 
	  						  	  			 }else {
	  						  	  				 fail(driver,"The chart's value not displayed with Selected '"+ChangeRoundOffValue_DataLabel+"' RoundOff Value"); 
	  						  	  			 }
	  						  	  		 }
	  						  		}else {
	  						  	  		 fail(driver,"'RoundOff Value Input' is not accessible");
	  						  		}
   	  							}
   	  							
   	  							if(TC_WATERFALL_DATA_LABEL_017.equals("Yes")) {
	  								setTestCaseID("TC_WATERFALL_ DATA_LABEL_017");
	  								
	  								String defaultPosition_Act=defaultSelectedValue(driver, PositionInput);
	  						  	   	if(DefaultPositionValue_Exp.equals(defaultPosition_Act)) {
	  						  		   pass(driver,"By default, '"+DefaultPositionValue_Exp+"' is selected in the Position Input"); 
	  						  	   	}else {
	  						  		   fail(driver,"By default, '"+DefaultPositionValue_Exp+"' is not selected in the Position Input"); 
	  						  	   	}

	  						  	   	boolean chartValuePositionAct=validateElementPosition2(driver,charts_Bar,EnableValue,DefaultPositionValue_Exp.toLowerCase());
	  						  	   	if(chartValuePositionAct==true) {
	  						  	  		pass(driver,"By default, Chart value displayed "+DefaultPositionValue_Exp.toLowerCase()+" the chartbar for position selected as '"+DefaultPositionValue_Exp.toLowerCase()+"' condition"); 
	  						  	   	}else {
	  						  	  		fail(driver,"By default, Chart value is not displayed "+DefaultPositionValue_Exp.toLowerCase()+" the chartbar for position selected as '"+DefaultPositionValue_Exp.toLowerCase()+"' condition"); 
	  						  	   	}
   	  							}
   	  							
   	  							if(TC_WATERFALL_DATA_LABEL_018.equals("Yes")) {
   	  								setTestCaseID("TC_WATERFALL_ DATA_LABEL_018");
   	  								if(isToggleAccessible(driver,PositionInput)) {		
   	  									pass(driver,"'Position Input' is accessible after enabling the 'Enable Value' toggle"); 
   	  									if(TC_WATERFALL_DATA_LABEL_019.equals("Yes")) {
   	  										setTestCaseID("TC_WATERFALL_ DATA_LABEL_019");
   	  										selectOptionValue(driver,PositionInput,"center");
   	  										scrollUsingElement(driver, ApplyButton);
   	  										click(driver,ApplyButton);
   	  										elementnotvisible1(driver, RPE_Loading);
   	  										verifyElementDisplayed(driver,Chart_Section);   	  						  	   
   	  						  	 
   	  										boolean chartValuePositionAct=validateElementPosition2(driver,charts_Bar,EnableValue,"center");
   	  										if(chartValuePositionAct==true) {
   	  											pass(driver,"Chart value displayed center the chartbar for position selected as 'center' condition"); 
   	  										}else {
   	  											fail(driver,"Chart value is not displayed center the chartbar for position selected as 'center' condition"); 
   	  										}
   	  									}
   	  									
   	  									if(TC_WATERFALL_DATA_LABEL_020.equals("Yes")) {
   	  										setTestCaseID("TC_WATERFALL_ DATA_LABEL_020");
   	  										selectOptionValue(driver,PositionInput,"outside");
   	  										scrollUsingElement(driver, ApplyButton);
   	  										click(driver,ApplyButton);
   	  										verifyElementDisplayed(driver,Chart_Section);
   	  								
   	  										boolean chartValuePositionAct=validateElementPosition2(driver,charts_Bar,EnableValue,"outside");
   	  										if(chartValuePositionAct==true) {
   	  											pass(driver,"Chart value displayed outside the chartbar for position selected as 'outside' condition"); 
   	  										}else {
   	  											fail(driver,"Chart value is not displayed outside the chartbar for position selected as 'outside' condition"); 
   	  										}
   	  									}
   	  								}else {
   	  									fail(driver,"'Position Input' is not accessible after enabling the 'Enable Value' toggle");
   	  								}
   	  							}
   	  							
   	  							if(TC_WATERFALL_DATA_LABEL_021.equals("Yes")) {
	  								setTestCaseID("TC_WATERFALL_ DATA_LABEL_021");
	  								selectOptionValue(driver,SeperatorInput,"#,###");
	  						  		if(isToggleAccessible(driver,BigNumberInput)) {
	  						  			 fail(driver,"'Big Number Suffix' toggle is accessible while Seperator value is selected");
	  						  		}else {
	  						  			 pass(driver,"'Big Number Suffix' toggle is Inaccessible while Seperator value is selected");
	  						  		}
   	  							}
   	  							
   	  							if(TC_WATERFALL_DATA_LABEL_022.equals("Yes")) {
   	  								setTestCaseID("TC_WATERFALL_ DATA_LABEL_022");
   	  								selectByText(driver,SeperatorInput,"Select");
//   	  								scrollUsingElement(driver, ApplyButton);
//   	  								click(driver,ApplyButton);
//   	  								elementnotvisible1(driver, RPE_Loading);
   	  								if(isToggleAccessible(driver,BigNumberInput)) {
   	  									pass(driver,"'Big Number Suffix' toggle is accessible while Seperator value is not selected");
   	  									if(TC_WATERFALL_DATA_LABEL_023.equals("Yes")) {
   	  										setTestCaseID("TC_WATERFALL_ DATA_LABEL_023");
   	  									    if(isToggleEnable(driver,BigNumberInput)) {
   	  										    fail(driver,"By default, 'BigNumber Suffix' toggle is enabled");
   	  									    }else {
   	  									    	pass(driver,"By default, 'BigNumber Suffix' toggle is disabled");
   	  									    	
   	  									    	if(TC_WATERFALL_DATA_LABEL_024.equals("Yes")) {
   	  									    		setTestCaseID("TC_WATERFALL_ DATA_LABEL_024");
   	  									    		click(driver,BigNumberInputSlider);
   	  									    		if(isToggleEnable(driver,BigNumberInput)) {
   	  									    			pass(driver,"'Big Number Suffix' toggle is enabled while click on it");
   	  									    			selectByText(driver,RoundOffValueInput,"Select");
   	  									    			scrollUsingElement(driver, ApplyButton);
   	  									    			click(driver,ApplyButton);
   	  									    			elementnotvisible1(driver, RPE_Loading);
   	  						  				    
   	  									    			String ChartValueTextAct=getText1(driver,EnableValue);     
   	  									    			if(ChartValueTextAct.length()>3 &&!ChartValueTextAct.equals("0")) {
   	  									    				if(ChartValueTextAct.endsWith("K") || ChartValueTextAct.endsWith("k")) {
   	  									    					pass(driver,"The big number suffix is applied for enabled value in charts");
   	  									    				}else {
   	  									    					fail(driver,"The big number suffix is not applied for enabled value in charts");
   	  									    				}
   	  									    			}
   	  						  					
   	  									    		}else {
   	  									    			fail(driver,"'Big Number Suffix' toggle is not enabled while click on it");
   	  									    		}
   	  									    	}
   	  									   
   	  									    }
   	  									}
   	  								}else {
   	  									fail(driver,"'Big Number Suffix' toggle is Inaccessible while Seperator value is not selected");
   	  								}
   	  							}
   	  							
   	  							if(TC_WATERFALL_DATA_LABEL_025.equals("Yes")) {
   	  								setTestCaseID("TC_WATERFALL_ DATA_LABEL_025");
   	  								String defaultRotationValue_Act=getText1(driver,ValueRotation_Output);
   	  								if(DefaultRotationValue_Exp.equals(defaultRotationValue_Act)) {
   	  									pass(driver,"By default, '"+DefaultRotationValue_Exp+"' is displayed in value rotation output");
   	  								}else {
   	  									fail(driver,"By default, '"+DefaultRotationValue_Exp+"' is not displayed in value rotation output");
   	  								}
   	  							}
   	  							
   	  							if(TC_WATERFALL_DATA_LABEL_026.equals("Yes")) {
	  								setTestCaseID("TC_WATERFALL_ DATA_LABEL_026");
	  								if(IsElementEnabled(driver, ValueRotation_Input)) {
	  									pass(driver,"'Value rotation input' is Accessible");
	  									if(TC_WATERFALL_DATA_LABEL_027.equals("Yes")) {
	  		  								setTestCaseID("TC_WATERFALL_ DATA_LABEL_027");
	  		  								
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
	  		  				        
	  									}
	  									
	  								}else {
	  									fail(driver,"'Value rotation input' is not Accessible");
	  								}
   	  							}
   	  						}//clicked Enable Value
   	  					}
			 		}
			 		
			 		if(TC_WATERFALL_DATA_LABEL_028.equals("Yes")) {
			 			 setTestCaseID("TC_WATERFALL_ DATA_LABEL_028");
			 			 mouseOverToElement(driver, DataLabels);
			 	       	 click(driver,DataLabels);
			 	        
			 	       	 String DataLabelsClose_Act=getAttribute1(driver, DataLabels_Expand, "class");
			 	  		 if(DataLabelsClose_Act.contains("down")) {
			 	  		 	pass(driver,"Data labels gets collapsed when click on it");
			 	  		 }else {
			 	  		 	fail(driver,"Data Labels not gets collapsed when click on it");
			 	  		}
			 		}
			 		
			     }//Data Label End
			     
			  // ******************** Data Labels Validation End *******************
			     
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
  		sendKeys(driver,ChartTitleInput,"WaterFallTest");
  		click(driver,SaveBtn_Chart);
  		elementnotvisible1(driver, RPE_Loading);
  		if(!isDisplayed2(driver,chartSaveError1) && isDisplayed(driver,SavedChartTitleInput)) {
  			pass(driver,"Chart Saved Successfully");
  		}else {
  			fail(driver,"Chart not Saved Successfully");
  		}	
 	      
  		String AfterSaveChartTitleName=getText1(driver, SavedChartTitleName);
  		if(AfterSaveChartTitleName.equals("WaterFallTest")) {
  			pass(driver,"Same Chart Title name displayed after saved the chart ");
  		}else {
  			fail(driver,"Different Chart Title name displayed after saved the chart ");
  		}
	}
	
}
