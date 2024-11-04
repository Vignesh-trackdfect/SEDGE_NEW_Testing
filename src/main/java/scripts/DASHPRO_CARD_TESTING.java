package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import commonMethods.Keywords;
import commonMethods.Utils;

public class DASHPRO_CARD_TESTING extends Keywords{

	public void card_testing(WebDriver driver,int iteration,String Flag) {
		
		String Default_Position_Card_Widget=Utils.getDataFromTestData("SmokeTesting_UI", "Default_Position_Card_Widget");
		String Default_Size_Card_Widget=Utils.getDataFromTestData("SmokeTesting_UI", "Default_Size_Card_Widget");

		//Iteration Inputs
		//Card
		String Card_Column_DataType_1=Utils.getDataFromTestDataIteration(iteration,"Card_Widget_Testing", "Card_Column_DataType_1");
		String Select_Card_Column_Value1=Utils.getDataFromTestDataIteration(iteration,"Card_Widget_Testing", "Select_Card_Column_Value1");
		String Select_Card_Column_Value2=Utils.getDataFromTestDataIteration(iteration,"Card_Widget_Testing", "Select_Card_Column_Value2");
		String Select_Card_Column_Value3=Utils.getDataFromTestDataIteration(iteration,"Card_Widget_Testing", "Select_Card_Column_Value3");
		String Select_Agg_Value1=Utils.getDataFromTestDataIteration(iteration,"Card_Widget_Testing", "Select_Agg_Value1");
		String Select_Agg_Value2=Utils.getDataFromTestDataIteration(iteration,"Card_Widget_Testing", "Select_Agg_Value2");
		String Select_Agg_Value3=Utils.getDataFromTestDataIteration(iteration,"Card_Widget_Testing", "Select_Agg_Value3");
		String Type_Goal_Value=Utils.getDataFromTestDataIteration(iteration,"Card_Widget_Testing", "Type_Goal_Value");
		String Type_Prefix_Value=Utils.getDataFromTestDataIteration(iteration,"Card_Widget_Testing", "Type_Prefix_Value");
		String Card_Icon_Select=Utils.getDataFromTestDataIteration(iteration,"Card_Widget_Testing", "Card_Icon_Select");
		String Select_Position=Utils.getDataFromTestDataIteration(iteration,"Card_Widget_Testing", "Select_Position");
		String Select_Size=Utils.getDataFromTestDataIteration(iteration,"Card_Widget_Testing", "Select_Size");
		
		//Yes/No Input for Testcases Id
		String TC_CARD_001=getTestcaseID_Flag("DASHPRO_CARD","CARD","TEST CASE ID","TC_CARD_001","Flag");
		String TC_CARD_002=getTestcaseID_Flag("DASHPRO_CARD","CARD","TEST CASE ID","TC_CARD_002","Flag");
		String TC_CARD_003=getTestcaseID_Flag("DASHPRO_CARD","CARD","TEST CASE ID","TC_CARD_003","Flag");
		String TC_CARD_004=getTestcaseID_Flag("DASHPRO_CARD","CARD","TEST CASE ID","TC_CARD_004","Flag");
		String TC_CARD_005=getTestcaseID_Flag("DASHPRO_CARD","CARD","TEST CASE ID","TC_CARD_005","Flag");
		String TC_CARD_006=getTestcaseID_Flag("DASHPRO_CARD","CARD","TEST CASE ID","TC_CARD_006","Flag");
		String TC_CARD_007=getTestcaseID_Flag("DASHPRO_CARD","CARD","TEST CASE ID","TC_CARD_007","Flag");
		String TC_CARD_008=getTestcaseID_Flag("DASHPRO_CARD","CARD","TEST CASE ID","TC_CARD_008","Flag");
		String TC_CARD_009=getTestcaseID_Flag("DASHPRO_CARD","CARD","TEST CASE ID","TC_CARD_009","Flag");
		String TC_CARD_010=getTestcaseID_Flag("DASHPRO_CARD","CARD","TEST CASE ID","TC_CARD_010","Flag");
		String TC_CARD_011=getTestcaseID_Flag("DASHPRO_CARD","CARD","TEST CASE ID","TC_CARD_011","Flag");
		String TC_CARD_012=getTestcaseID_Flag("DASHPRO_CARD","CARD","TEST CASE ID","TC_CARD_012","Flag");

		

		setTestCaseID(" ");
		Actions action=new Actions(driver);
		mouseOverToElement(driver, ADDTabPlus);
  	    mouseOverAndClick(driver, ADDTabPlus);
  	    wait(driver,"1");
  	    sendKeys(driver,newlyAddedTab,"CardWidgetTestTab");
  	    click(driver,DashProPage);
  	    elementnotvisible1(driver, RPE_Loading);
		waitForElement(driver,ADD_widget_rightTop);
	    click(driver,ADD_widget_rightTop);
	    elementnotvisible(driver,Loading);
	    elementnotvisible1(driver, RPE_Loading);
		waitForElement(driver,WidgetPanel);
		waitForElement(driver,Sparkline_widget);
		
       
    	setTestCaseID("TC_CARD_001");
		waitForElement(driver,Card_widget);
		verifyElementDisplayed(driver, Card_widget);
    
    	setTestCaseID("TC_CARD_002");
		WidgetValidation(driver,Card_widget,"Card");
      
    	setTestCaseID("TC_CARD_003");
		click(driver,Card_widget);
		elementnotvisible(driver, Loading);
		elementnotvisible1(driver, RPE_Loading);
		String widgetValue=getText1(driver,WidgetValue);
	 	if(widgetValue.equals("Card")) {
			pass(driver,"Card displayed as the selected Widget after click on it");
	 	}else {
	 		fail(driver,"Card not displayed as the selected Widget after click on it");
	 	}
      
    	setTestCaseID("TC_CARD_004");
	 	if(!isDisplayed(driver,Formula_Selected_Area)) {
	 		mouseOverAndClick(driver, Plus_button);
	 		if(isDisplayed(driver,Card_SelectError)) {
	 			pass(driver,"'Kindly select any column to perform Card' error displayed When Click the '+' button without select any Value");
	 			elementnotvisible1(driver, Card_SelectError);
	 		}else {
	 			fail(driver,"'Kindly select any column to perform Card' error not displayed When Click the '+' button without select any Value");
	 		}
	 		
	 		scrollUsingElement(driver,ApplyButton);
			click(driver,ApplyButton);
			
			if(isDisplayed(driver,Card_ApplyError)) {
	 			pass(driver,"'Kindly add column to perform Card' error displayed When Click the Apply button without select any Value");
	 			elementnotvisible1(driver, Card_ApplyError);
	 		}else {
	 			fail(driver,"'Kindly add column to perform Card' error not displayed When Click the Apply button without select any Value");
	 		}
	 	
	 	}else {
	 		setTestCaseID("");
	 		fail(driver,"Column Added in the Formula by default");
	 	}
        
    	setTestCaseID("TC_CARD_005");
	 	verifyElementDisplayed(driver, CardColumnSelect_Input);
	 	String DefaultSelectedValue=getText1(driver, CardColumnSelect_Input);
	 	if(DefaultSelectedValue.equals("Select")) {
	 		pass(driver,"By default, 'Select' is selected in the Card Column Input");
	 	}else {
	 		fail(driver,"By default, 'Select' is not selected in the Card Column Input, Act : "+DefaultSelectedValue);
	 	}
       
    	setTestCaseID("TC_CARD_006");
	 	click(driver,CardColumnSelect_Input);
	 	if(isDisplayed(driver,CardColumnSelect_dropdownResults)) {
	 		pass(driver,"Card column field dropdown get expanded when click the input");
	 	}else {
	 		fail(driver,"Card column field dropdown not get expanded when click the input");
	 	}
       
 		setTestCaseID("TC_CARD_009");
 		List<WebElement> displayedDataImage=getWebElements(driver, dataTypeImages);
		List<WebElement> AvailableColumnList=getWebElements(driver, AvailableList);
		int AvailableColumnListSize=AvailableColumnList.size()-1;
		if(AvailableColumnListSize==displayedDataImage.size()) {
			pass(driver,"All the available columns are displayed with data Type icon in the Card Column dropdown");
		}else {
			fail(driver,"Some columns are not correctly displayed with data Type icon in the Card Column dropdown");
		}
		
		setTestCaseID("TC_CARD_007");
		boolean dataType=true;
		for(WebElement dataImag:displayedDataImage) {
			String dataTypeDisplay=dataImag.getAttribute("src");
			if(dataTypeDisplay.contains("Date") || dataTypeDisplay.contains("Categorical") || dataTypeDisplay.contains("Numerical") || dataTypeDisplay.contains("Text")) {
				
			}else {
				fail(driver,"Other than Date,Categorical,Numerical and Text datatype column is displayed in the Card Column dropdown");
				dataType=false;
				break;
			}
		}
		
		if(dataType==true) {
			pass(driver,"Only Date,Categorical,Numerical and Text datatype column is displayed in the Card Column dropdown");
		}
		
		setTestCaseID("");
		if(isDisplayed2(driver,CategoricalColumnAxisDropdown)) {
			String Categorical1=getText1(driver,CategoricalColumnAxisDropdown);
			if(Categorical1.contains("(")) {
				pass(driver,"Unique values are displayed in the Categorical Column in the Card Column dropdown");
			}else {
				fail(driver,"Unique values are not displayed in the Categorical Column in the Card Column dropdown");
			}
		}
		
		if(isDisplayed2(driver,TextColumnAxisDropdown)) {
			String Text1=getText1(driver,TextColumnAxisDropdown);
			if(Text1.contains("(")) {
				pass(driver,"Unique values are displayed in the Text Column in the Card Column dropdown");
			}else {
				fail(driver,"Unique values are not displayed in the Text Column in the Card Column dropdown");
			}
		}
 		
 		setTestCaseID("TC_CARD_012");
		ScrollBarValidation1(driver,CardColumnSelect_dropdownResults,"Card_Column");
		
 		setTestCaseID("TC_CARD_008");
		if(verifyElementDisplayed(driver, dropdownInputsearchBox)) {
			click(driver,dropdownInputsearchBox);
			setTestCaseID("TC_CARD_010");
			sendKeys(driver,dropdownInputsearchBox,"afghjku");
			if(isDisplayed2(driver,NoResultsFound)) {
				pass(driver,"'No Results found' message is displayed in while searching invalid value in the Card Column dropdown input");
			}else {
				fail(driver,"'No Results found' message is not displayed in while searching invalid value in Card Column dropdown input");
			}
			
			clear1(driver,dropdownInputsearchBox);
			wait(driver,"1");
			if(isDisplayed2(driver,NoResultsFound)){
				fail(driver,"Column List are not displayed after clear the search input in the Card Column dropdown");
			}else {
				pass(driver,"Column List are displayed after clear the search input in the Card Column dropdown");
			}
			setTestCaseID("TC_CARD_011");
			sendKeys(driver,dropdownInputsearchBox,Select_Card_Column_Value1);
			wait(driver,"1");
			String firstValue_X=getText1(driver,FirstSearchedvalue);
			if(firstValue_X.contains(Select_Card_Column_Value1)) {
				pass(driver,"Searched Value correctly displayed in the Card Column dropdown");
				action.sendKeys(Keys.ENTER).build().perform();
				wait(driver,"1");
				if(isDisplayed2(driver,CardColumnSelect_dropdownResults)) {
					fail(driver,"Card Column Value dropdown not closed after perform 'Enter' action");
				}else {
					pass(driver,"Card Column dropdown closed automatically after perform 'Enter' action");
					String seletcedValue=getText1(driver,CardColumnSelect_Input);
					if(seletcedValue.contains(Select_Card_Column_Value1)) {
						pass(driver,"Selected value displayed in the Card Column Input after click Enter");
					}else {
						fail(driver,"Selected value not displayed in the Card Column Input after click Enter");
					}
				}
			}else {
				fail(driver,"Searched Value not correctly displayed in the Card Column dropdown");
			}
		}
		
		setTestCaseID("TC_CARD_013");
		//Getting the Default Value of the Aggregation and compare the Value with Expected Value
		String default_Agg_Seleted=defaultSelectedValue(driver,Aggregation_Input);
		if(default_Agg_Seleted.equals("Count")) {
			pass(driver,"By default Count is selected in the Aggregation input");
		}else {
			fail(driver,"By default Count is not Selected in the Aggregation input");
		}
		
		setTestCaseID("");
		// Here Selecting one Column Value based on the input sheet. For the first time, i used to select the Column Value with its dataType
		// Because after selecting the first Value, I am checking the aggregation values are present based on the first Column DataType.
		// For Example if the DataType is Categorical, Date and Text then Validating some agg values only enabled. If it is Numerical then all the agg values should be enabled.
		// For Validating the Card Chart, in this script I used 3 inputs from excel sheet, but first time only I used the Data Type for the Aggregation Validation("TC_CARD_015") purpose.
		click(driver,CardColumnSelect_Input);
		waitForElement1(driver, CardColumnSelect_dropdownResults);
		selectDropdownValue(driver,Card_Column_DataType_1,Select_Card_Column_Value1);
		wait(driver,"1");
		if(isDisplayed2(driver,CardColumnSelect_dropdownResults)) {
			fail(driver,"Card Dropdown not closed after selecting the Value");
		}
		
		setTestCaseID("TC_CARD_014");
		//Clicking the the Aggregation and Checking the Options are present
		click(driver,Aggregation_Input);
		verifyElementIsPresent1(driver, Sum_AggCard);
		verifyElementIsPresent1(driver, Count_AggCard);
		verifyElementIsPresent1(driver, Average_AggCard);
		verifyElementIsPresent1(driver, Min_AggCard);
		verifyElementIsPresent1(driver, Max_AggCard);
		verifyElementIsPresent1(driver, Unique_AggCard);

		setTestCaseID("TC_CARD_015");
		//Validating the Aggregation Value based on the Column selected DataType. For this I have already created separate method in Bar widget script, here I am reusing the method.
		DASHPRO_BAR_SMOKE_TESTING bar=new DASHPRO_BAR_SMOKE_TESTING();
		if(Card_Column_DataType_1.contains("Categorical") || Card_Column_DataType_1.contains("Text") || Card_Column_DataType_1.contains("Date")) {
			bar.aggregationValidation1(driver);
		}else {
			bar.aggregationValidation2(driver);
		}
		
		setTestCaseID("");
		//Selecting Agg value from input sheet
		selectByText(driver, Aggregation_Input, Select_Agg_Value1);
		wait(driver,"1");
		//Getting the Value which selected in the Aggregation. In the Formula we need to validate that the selected agg is applied in the table.
		// But we selecting the Aggregation using text, but in table it display the value of the element, so that here taking the value.
		String SelectedAgg=getSelectedValue(driver,Aggregation_Input,"value");
	
		setTestCaseID("TC_CARD_016");
		//Clicking the Plus '+' button and Validating the if any error displayed after clicking the '+' button
		mouseOverAndClick(driver, Plus_button);
 		if(isDisplayed(driver,error)) {
 			fail(driver,"Error displayed when click the Add button '+' after selecting the Column Value");
 		}
 		
 		setTestCaseID("TC_CARD_017");
 		//Validating the Formula table is displayed are not after Adding the Column. If displayed then Validate the Table Values with selected Value
 		if(isDisplayed(driver, Formula_Selected_Area)) {
 			pass(driver,"Formula Table displayed after Adding the Column Value");
 			//Validating the Formula cell is displayed and selected Value is available with Aggregation
 			setTestCaseID("TC_CARD_018");
 			if(isDisplayed(driver,FirstFormulaCell)) {
 				String FormulaCellValue=getText1(driver,FirstFormulaCell);
 				if(FormulaCellValue.contains(Select_Card_Column_Value1)) {
 					pass(driver,"Selected Column Value is correctly displayed in the Formula Cell");
 				}else {
 					fail(driver,"Selected Column Value is not correctly displayed in the Formula Cell");
 				}
 				
 				if(FormulaCellValue.contains(SelectedAgg)) {
 					pass(driver,"Selected Agg Value is correctly displayed in the Formula Cell");
 				}else {
 					fail(driver,"Selected Agg Value is not correctly displayed in the Formula Cell");
 				}
 				
 			}else {
 				fail(driver,"Formula cell is not displayed After selecting the Column");
 			}
 			
 			setTestCaseID("TC_CARD_018");
 			//Validating the Selected Column Value is displayed in the Label Cell with Aggrrgation Value
 			if(isDisplayed(driver,FirstLabelCell)) {
 				String LabelCellValue=getText1(driver,FirstLabelCell);
 				if(LabelCellValue.contains(Select_Card_Column_Value1)) {
 					pass(driver,"Selected Column Value is correctly displayed in the Label Cell");
 				}else {
 					fail(driver,"Selected Column Value is not correctly displayed in the Label Cell");
 				}
 				
 				if(LabelCellValue.contains(SelectedAgg)) {
 					pass(driver,"Selected Agg Value is correctly displayed in the Label Cell");
 				}else {
 					fail(driver,"Selected Agg Value is not correctly displayed in the Label Cell");
 				}
 				
 			}else {
 				fail(driver,"Label cell is not displayed After selecting the Column");
 			}
 			
 		}else {
 			fail(driver,"Formula Table not displayed after Adding the Column Value");
 		}
		
 		setTestCaseID("");
 		scrollUsingElement(driver,ApplyButton);
		click(driver,ApplyButton);
		elementnotvisible1(driver, RPE_Loading);
		setTestCaseID("TC_CARD_019");
		if(isDisplayed2(driver,error)){
			 String errorWidget=getText1(driver,error);
    		 if(errorWidget.contains("Please refer the logs in Logs")) {
    			 fail(driver,"Error displayed When click Apply Button on 'Card' Widget, Validation : "+errorWidget);
    		 }else {
    			 pass(driver,"Error displayed When click Apply Button on 'Card' Widget, Validation : "+errorWidget);
    		 }
    		 elementnotvisible1(driver, error);
		}else if(isDisplayed(driver,Card_Chart)) {
			pass(driver,"Chart is Displayed in the Card Widget after selecting the Card value");
			
			//Getting the lable text from the Chart and Validating it matched with selected value
			if(verifyElementDisplayed(driver, LabelValue_Chart)) {
				String appliedLabel_Chart=getText1(driver, LabelValue_Chart);
				if(appliedLabel_Chart.contains(Select_Card_Column_Value1)&&appliedLabel_Chart.contains(SelectedAgg)) {
					pass(driver,"Selected Column with Aggregation is correctly displayed in the Chart ");
				}else {
					fail(driver,"Selected Column with Aggregation is not correctly displayed in the Chart ");
				}
			}
		}
		
		setTestCaseID("TC_CARD_021");
		//Again selecting the same Column Value to validate the 'Formula already exists' error
		click(driver,CardColumnSelect_Input);
		waitForElement1(driver, CardColumnSelect_dropdownResults);
		selectDropdownValue(driver,Card_Column_DataType_1,Select_Card_Column_Value1);
		wait(driver,"1");
		if(isDisplayed2(driver,CardColumnSelect_dropdownResults)) {
			fail(driver,"Card Dropdown not closed after selecting the Value");
		}
		selectByText(driver, Aggregation_Input, Select_Agg_Value1);
		wait(driver,"1");
		mouseOverAndClick(driver, Plus_button);
 		if(isDisplayed(driver,DuplicateFormulaError)) {
 			pass(driver,"'Formula already exists' error is diapleyd When Add the Same Column Value");
 		}else {
 			fail(driver,"'Formula already exists' error is not diapleyd When Add the Same Column Value");
 		}
 		
 		
 		//Now Selecting the Two more Column From the input sheet to validate the drag and scroll functionality
 		setTestCaseID("");
 		//Selecting the 2nd Column Value with Aggregation
 		click(driver,CardColumnSelect_Input);
		waitForElement1(driver, CardColumnSelect_dropdownResults);
		selectDropdownValue1(driver,Select_Card_Column_Value2);
		wait(driver,"1");
		if(isDisplayed2(driver,CardColumnSelect_dropdownResults)) {
			fail(driver,"Card Dropdown not closed after selecting the Value");
		}
	    
		selectByText(driver, Aggregation_Input, Select_Agg_Value2);
		String SelectedAgg2=getSelectedValue(driver,Aggregation_Input,"value");
		mouseOverAndClick(driver, Plus_button);
 		if(isDisplayed(driver,error)) {
 			fail(driver,"Error displayed when click the Add button '+' after selecting the Column Value");
 		}
 		
 		//After Selecting the Second value, verify it is Applied in the Formula Cell in the table
 		if(isDisplayed(driver,SecondFormulaCell)) {
			String FormulaCellValue=getText1(driver,SecondFormulaCell);
			if(FormulaCellValue.contains(Select_Card_Column_Value2)) {
				pass(driver,"Selected Column Value 2 is correctly displayed in the Formula Cell 2");
			}else {
				fail(driver,"Selected Column Value 2 is not correctly displayed in the Formula Cell 2");
			}
			
			if(FormulaCellValue.contains(SelectedAgg2)) {
				pass(driver,"Selected Agg Value 2 is correctly displayed in the Formula Cell 2");
			}else {
				fail(driver,"Selected Agg Value 2 is not correctly displayed in the Formula Cell 2");
			}
			
		}else {
			fail(driver,"Formula cell 2 is not displayed After selecting the Column 2");
		}
		
		//After Selecting the Second value, verify it is Applied in the Label Cell in table
		if(isDisplayed(driver,SecodnLabelCell)) {
			String LabelCellValue=getText1(driver,SecodnLabelCell);
			if(LabelCellValue.contains(Select_Card_Column_Value2)) {
				pass(driver,"Selected Column Value 2 is correctly displayed in the Label Cell 2");
			}else {
				fail(driver,"Selected Column Value 2 is not correctly displayed in the Label Cell 2");
			}
			
			if(LabelCellValue.contains(SelectedAgg2)) {
				pass(driver,"Selected Agg Value 2 is correctly displayed in the Label Cell 2");
			}else {
				fail(driver,"Selected Agg Value 2 is not correctly displayed in the Label Cell 2");
			}
			
		}else {
			fail(driver,"Label cell 2 is not displayed After selecting the Column 2");
		}
		
		//Selecting the 3rd Column Value with Aggregation
 		click(driver,CardColumnSelect_Input);
		waitForElement1(driver, CardColumnSelect_dropdownResults);
		selectDropdownValue1(driver,Select_Card_Column_Value3);
		wait(driver,"1");
		if(isDisplayed2(driver,CardColumnSelect_dropdownResults)) {
			fail(driver,"Card Dropdown not closed after selecting the Value");
		}
	    
		selectByText(driver, Aggregation_Input, Select_Agg_Value3);
		String SelectedAgg3=getSelectedValue(driver,Aggregation_Input,"value");
		mouseOverAndClick(driver, Plus_button);
 		if(isDisplayed(driver,error)) {
 			fail(driver,"Error displayed when click the Add button '+' after selecting the Column Value");
 		}
 		
 		//After Selecting the Third value, verify it is Applied in the Formula Cell in the table
 		if(isDisplayed(driver,ThirdFormulaCell)) {
			String FormulaCellValue=getText1(driver,ThirdFormulaCell);
			if(FormulaCellValue.contains(Select_Card_Column_Value3)) {
				pass(driver,"Selected Column Value 3 is correctly displayed in the Formula Cell 3");
			}else {
				fail(driver,"Selected Column Value 3 is not correctly displayed in the Formula Cell 3");
			}
			
			if(FormulaCellValue.contains(SelectedAgg3)) {
				pass(driver,"Selected Agg Value 3 is correctly displayed in the Formula Cell 3");
			}else {
				fail(driver,"Selected Agg Value 3 is not correctly displayed in the Formula Cell 3");
			}
		}else {
			fail(driver,"Formula cell 3 is not displayed After selecting the Column 3");
		}
		
		//After Selecting the Third value, verify it is Applied in the Label Cell in table
		if(isDisplayed(driver,ThirdLabelCell)) {
			String LabelCellValue=getText1(driver,ThirdLabelCell);
			if(LabelCellValue.contains(Select_Card_Column_Value3)) {
				pass(driver,"Selected Column Value 3 is correctly displayed in the Label Cell 3");
			}else {
				fail(driver,"Selected Column Value 3 is not correctly displayed in the Label Cell 3");
			}
			
			if(LabelCellValue.contains(SelectedAgg3)) {
				pass(driver,"Selected Agg Value 3 is correctly displayed in the Label Cell 3");
			}else {
				fail(driver,"Selected Agg Value 3 is not correctly displayed in the Label Cell 3");
			}
			
		}else {
			fail(driver,"Label cell 3 is not displayed After selecting the Column 3");
		}
		
		//After Selecting the 2nd and 3rd Value, Verify the Chart plotted
		scrollUsingElement(driver,ApplyButton);
		click(driver,ApplyButton);
		elementnotvisible1(driver, RPE_Loading);
		//setTestCaseID("TC_CARD_019");
		if(isDisplayed2(driver,error)){
			 String errorWidget=getText1(driver,error);
    		 if(errorWidget.contains("Please refer the logs in Logs")) {
    			 fail(driver,"Error displayed When click Apply Button on 'Card' Widget, Validation : "+errorWidget);
    		 }else {
    			 pass(driver,"Error displayed When click Apply Button on 'Card' Widget, Validation : "+errorWidget);
    		 }
    		 elementnotvisible1(driver, error);
		}else if(isDisplayed(driver,Card_Chart)) {
			pass(driver,"Chart is Displayed in the Card Widget after selecting the Card value");
			
			//Getting the label text from the Chart and Validating it matched with selected 2nd and 3rd Value
			if(verifyElementDisplayed(driver, LabelValue2_Chart)) {
				String appliedLabel_Chart=getText1(driver, LabelValue2_Chart);
				if(appliedLabel_Chart.contains(Select_Card_Column_Value2)&&appliedLabel_Chart.contains(SelectedAgg2)) {
					pass(driver,"Selected Column 2 with Aggregation is correctly displayed in the Chart ");
				}else {
					fail(driver,"Selected Column 2 with Aggregation is not correctly displayed in the Chart ");
				}
			}
			
			if(verifyElementDisplayed(driver, LabelValue3_Chart)) {
				String appliedLabel_Chart=getText1(driver, LabelValue3_Chart);
				if(appliedLabel_Chart.contains(Select_Card_Column_Value3)&&appliedLabel_Chart.contains(SelectedAgg3)) {
					pass(driver,"Selected Column 3 with Aggregation is correctly displayed in the Chart ");
				}else {
					fail(driver,"Selected Column 3 with Aggregation is not correctly displayed in the Chart ");
				}
			}
		}
 		
		//Validating the Scroll Bar working in the Formula Table
		ScrollBarValidation1(driver, FormulaTable, "Formula Table");
		setTestCaseID("TC_CARD_020");
		verifyElementDisplayed(driver, Drag_Icon_Table);
		//Validating the Drag Functionality Working. Before drag taking one screenshot and after after taking one screenshot and comparing both screenshot.
		WebElement firstCell=getWebElement(driver, FirstFormulaCell);
		WebElement SecondCell=getWebElement(driver, SecondFormulaCell);
		//Taking the initial screenshot of the Formula table before Drag
		elementScreenShot_new(driver,FormulaTable,"/Expected_screenshot/SmokeTesting/Table_BeforeSwap");
		//Taking the initial screenshot of the Card Chart before Drag
		elementScreenShot_new(driver,Card_Chart,"/Expected_screenshot/SmokeTesting/CardChart_BeforeSwap");
		action.moveToElement(firstCell).clickAndHold().build().perform();
		action.moveToElement(SecondCell).release().build().perform();
		wait(driver,"1");
		//Taking the screenshot of the Formula Table after Drag
		elementScreenShot_new(driver,FormulaTable,"/Actual_screenshot/SmokeTesting/Table_AfterSwap");
		try {
        	boolean DragDiff=imageComparison2(driver, "/SmokeTesting/Table_BeforeSwap", "/SmokeTesting/Table_AfterSwap");
			wait(driver, "2");
			if(DragDiff==false) {
				pass(driver,"Drag and Drop is working properly in the Formula Table Cell");
			}else {
				fail(driver,"Drag and Drop is not working properly in the Formula Table Cell");
			}
		} catch (Exception e1) {
			fail(driver,"Unable to compare the Formula Table images");
		}
		
		scrollUsingElement(driver,ApplyButton);
		click(driver,ApplyButton);
		elementnotvisible1(driver, RPE_Loading);
		//Taking the screenshot of the Card Chart after Drag
		elementScreenShot_new(driver,Card_Chart,"/Actual_screenshot/SmokeTesting/CardChart_AfterSwap");
		//Compare the screenshots of the Chart before and after swap
		try {
        	boolean DragDiff=imageComparison2(driver, "/SmokeTesting/CardChart_BeforeSwap", "/SmokeTesting/CardChart_AfterSwap");
			wait(driver, "2");
			if(DragDiff==false) {
				pass(driver,"Drag and drop of fromula cell is applied in the Chart");
			}else {
				fail(driver,"Drag and drop of fromula cell is applied in the Chart");
			}
		} catch (Exception e1) {
			fail(driver,"Unable to compare the Chart Table images");
		}
		
		
		
		//Validating the Goal toggle is displayed
		setTestCaseID("TC_CARD_022");
		verifyElementDisplayed(driver, Goal_text);
		verifyElementDisplayed(driver, Goal_Toggle);
			
		//	Validating the Goal toggle is disabled by default 
		setTestCaseID("TC_CARD_023");
		if(isToggleEnable(driver, Goal_Input_Toggle)) {
			fail(driver,"By default, Goal toggle is enabled");
		}else {
			pass(driver,"By default, Goal toggle is disabled");
		}
			
        //Clicking the Goal Toggle and Validating it is enabled.  
		setTestCaseID("TC_CARD_024");
		click(driver,Goal_Toggle);
		wait(driver,"1");
		if(isToggleEnable(driver, Goal_Input_Toggle)) {
			pass(driver,"Goal toggle is enabled after click on it");
		}else {
			fail(driver,"Goal toggle is not enabled after click on it");
		}
		
		//Horizontal_Scroll
		setTestCaseID("");
		// Verify the horizontal scroll present, if present then validate it is working.
		if(verifyElementDisplayed(driver, Horizontal_Scroll)) {
			HorizontalScrollFull(driver, Horizontal_Scroll);
		}
		//Verifying the Goal is displayed in the Table After enabled it,
		setTestCaseID("TC_CARD_025");
		if(isDisplayed(driver,GoalHeaderCell_Table)) {
			pass(driver,"Goal is displayed in the table after enabling the goal toggle");
		}else {
			fail(driver,"Goal is not displayed in the table after enabling the goal toggle");
		}
		
		if(isDisplayed(driver,InverseHeaderCell_Table)) {
			pass(driver,"Inverse is displayed in the table after enabling the goal toggle");
		}else {
			fail(driver,"Inverse is not displayed in the table after enabling the goal toggle");
		}
		
		setTestCaseID("TC_CARD_026");
		click(driver,First_GoalCell);
		sendKeys(driver,FirstGoalCell_Input,"aadccd");
		scrollUsingElement(driver,ApplyButton);
		click(driver,ApplyButton);
		if(isDisplayed(driver,Goal_text_Error)) {
			pass(driver,"'Please provide number for target' error is displayed When given the text value in the Goal Input");
			elementnotvisible1(driver, error);
		}else {
			fail(driver,"'Please provide number for target' error is not displayed When given the text value in the Goal Input");
		}
		
		setTestCaseID("TC_CARD_025");
		click(driver,First_GoalCell);
		sendKeys(driver,FirstGoalCell_Input,Type_Goal_Value);
		scrollUsingElement(driver,ApplyButton);
		click(driver,ApplyButton);
		elementnotvisible1(driver, RPE_Loading);
		if(isDisplayed(driver,error)) {
			fail(driver,"Error displayed when given number value in the Goal Input");
		}
		
		if(isDisplayed(driver,Goal_Value_Chart)) {
			String ExpectedGoalColor="";
			double ExpectedValue;
			pass(driver,"Goal Value is displayed in the Chart");
			String GoalResultAct=getText1(driver,Goal_Result_Value);
			if(GoalResultAct.contains("(")) {
				int startIndex=GoalResultAct.indexOf("(");
				GoalResultAct=GoalResultAct.substring(startIndex, GoalResultAct.length()-1);
			}
			String ActGoalColor=getAttribute1(driver, Goal_Result_Value, "class");
			try {
				double inputValue=Double.parseDouble(Type_Goal_Value);
				String ChartValue=getText1(driver, FormulaValue_Chart);
				double ChartValueAct=Double.parseDouble(ChartValue);
				if (inputValue > ChartValueAct) {
			        ExpectedGoalColor = "red";
			        ExpectedValue = ((inputValue - ChartValueAct) / inputValue) * 100;
			    } else {
			        ExpectedGoalColor = "green";
			        ExpectedValue = ((ChartValueAct - inputValue) / inputValue) * 100;
			    }

			    // Format the ExpectedValue to 2 decimal places
			    String GoalResultExpValue = String.format("%.2f", ExpectedValue);

			    // Extract the percentage from the GoalResultAct string (e.g., "Goal : 20 (^83.24%)")
			    String actualPercentage = GoalResultAct.replaceAll("[^\\d.]", ""); // Removes non-numeric characters

			    // Check if the expected goal result matches the actual result
			    if (actualPercentage.equals(GoalResultExpValue)) {
			        pass(driver, "Goal Result is calculated correctly, Expected: " + GoalResultExpValue + ", Actual: " + actualPercentage);
			    } else {
			        fail(driver, "Goal Result is not calculated correctly, Expected: " + GoalResultExpValue + ", Actual: " + actualPercentage);
			    }

			    // Validate the goal color
			    if (ActGoalColor.equalsIgnoreCase(ExpectedGoalColor)) {
			        pass(driver, "Goal is correctly displayed in " + ExpectedGoalColor + " color");
			    } else {
			        fail(driver, "Goal is not correctly displayed in " + ExpectedGoalColor + " color");
			    }
				
			}catch(Exception e) {
				System.out.println("Unable to Validate the Calculation...");
				e.printStackTrace();
			}
			
			if(isDisplayed(driver,InversionToggle)) {
				pass(driver,"Inversion toggle is available in the Formula table");
				click(driver,InversionToggle);
				scrollUsingElement(driver,ApplyButton);
				click(driver,ApplyButton);
				elementnotvisible1(driver, RPE_Loading);
				String ActGoalInversionColor=getAttribute1(driver, Goal_Result_Value, "class");
				if(ActGoalInversionColor.equals(ExpectedGoalColor)) {
					fail(driver,"Inversion is not applied in the Goal result chart ");
				}else {
					pass(driver,"Inversion is applied correctly in the Goal result chart");
				}
			
			}else {
				fail(driver,"Inversion toggle is not available in the Formula table");
			}
			
		}else {
			fail(driver,"Goal Value is not displayed in the Chart");
		}
		
		
		
		//Validating the Prefix toggle is displayed
		setTestCaseID("TC_CARD_027");
		verifyElementDisplayed(driver, Prefix_text);
		verifyElementDisplayed(driver, Prefix_Toggle);
		
		//Validating the Prefix toggle is disabled by default 
		setTestCaseID("TC_CARD_028");
		if(isToggleEnable(driver, Prefix_Input_Toggle)) {
			fail(driver,"By default, Prefix toggle is enabled");
		}else {
			pass(driver,"By default, Prefix toggle is disabled");
		}
		
		//Clicking the Prefix Toggle and Validating it is enabled.  
		setTestCaseID("TC_CARD_028");
		click(driver,Prefix_Toggle);
		wait(driver,"1");
		if(isToggleEnable(driver, Prefix_Input_Toggle)) {
			pass(driver,"Prefix toggle is enabled after click on it");
		}else {
			fail(driver,"Prefix toggle is not enabled after click on it");
		}
		
		//Horizontal_Scroll
		setTestCaseID("");
		// Verify the horizontal scroll present, if present then validate it is working.
		if(isDisplayed(driver, Horizontal_Scroll)) {
			HorizontalScrollFull(driver, Horizontal_Scroll);
		}
		
		//Verifying the Goal is displayed in the Table After enabled it,
		setTestCaseID("TC_CARD_029");
		if(isDisplayed(driver,PrefixHeaderCell_Table)) {
			pass(driver,"Prefix is displayed in the table after enabling the prefix toggle");
		}else {
			fail(driver,"Prefix is not displayed in the table after enabling the prefix toggle");
		}
		
		click(driver,First_PrefixCell);
		sendKeys(driver,FirstPrefixCell_Input,Type_Prefix_Value);
		scrollUsingElement(driver,ApplyButton);
		click(driver,ApplyButton);
		elementnotvisible1(driver, RPE_Loading);
		if(isDisplayed(driver,error)) {
			fail(driver,"Error displayed When click apply button after providing the Prefix value");
		}else {
			if(verifyElementDisplayed(driver, Card_Chart)) {
				String  chartValue=getText1(driver, FormulaValue_Chart);
				if(chartValue.contains(Type_Prefix_Value)) {
					pass(driver,"Prefix Value is applied in the Chart");
				}else {
					fail(driver,"Prefix value is not applied in the Chart");
				}
			}
		}
		
		
		//
		setTestCaseID("TC_CARD_030");
		verifyElementDisplayed(driver, CardIcon_text);
		verifyElementDisplayed(driver, CardIcon_Inputs);
		
		//Validating the dragging functionality of the CardIcons
		setTestCaseID("TC_CARD_031");
		WebElement drgaIcon=driver.findElement(By.xpath("//div[@class='RPE_Cardicon']//i[contains(@class,'"+Card_Icon_Select+"')]"));
		WebElement chartCard=getWebElement(driver, FormulaValue_Chart);
		action.clickAndHold(drgaIcon).build().perform();
		action.moveToElement(chartCard).release().build().perform();
		wait(driver,"1");
		if(isDisplayed(driver,Icon_Chart)) {
			pass(driver,"Icon drag and dropped successfully in the chart");
		}else {
			fail(driver,"Icon not drag and dropped successfully in the chart");
		}
		
		//
		setTestCaseID("TC_CARD_032");
		if(verifyElementDisplayed(driver, Card_Position_Input)) {
			String defaultPositionAct=defaultSelectedValue(driver, Card_Position_Input);
			if(defaultPositionAct.equals(Default_Position_Card_Widget)) {
				pass(driver,"By default '"+Default_Position_Card_Widget+"' is displayed in the Position input");
			}else {
				fail(driver,"By default '"+Default_Position_Card_Widget+"' is not displayed in the Position input, Act : "+defaultPositionAct);
			}
			
			setTestCaseID("TC_CARD_033");
			mouseOverAndClick(driver, Card_Position_Input);
			verifyElementIsPresent1(driver, Card_Position_Options);
			
			setTestCaseID("TC_CARD_034");
			verifyElementIsPresent1(driver, Card_Position_Top);
			verifyElementIsPresent1(driver, Card_Position_Center);
			verifyElementIsPresent1(driver, Card_Position_Bottom);
			
			setTestCaseID("TC_CARD_035");
			if(isToggleAccessible(driver, Card_Position_Input)) {
				pass(driver,"Card Position input is accessible");
				//Select the postion value from excel sheet. In the input sheet i have provided the dropdown list to select the postion . 
				//I have provided the value of the Options instead of text. So that used the SelectByValue method
				selectByValue(driver, Card_Position_Input, Select_Position);
				scrollUsingElement(driver,ApplyButton);
				click(driver,ApplyButton);
				elementnotvisible1(driver, RPE_Loading);
				
				if(verifyElementDisplayed(driver, Card_Chart)) {
					String IconPosition=getAttribute1(driver, Card_Icon_Chart, "style");
					if(IconPosition.contains(Select_Position.toLowerCase())) {
						pass(driver,"Selected Position is applied correctly in the chart");
					}else {
						fail(driver,"Selected Position is not applied correctly in the chart");
					}
				}
			}else {
				fail(driver,"Card Position input is not accessible");
			}
		}
		
		setTestCaseID("TC_CARD_037");
		if(verifyElementDisplayed(driver, CardSize_input)) {
			String defaultSizeAct=defaultSelectedValue(driver, CardSize_input);
			if(defaultSizeAct.equals(Default_Size_Card_Widget)) {
				pass(driver,"By default '"+Default_Size_Card_Widget+"' is displayed in the Size input");
			}else {
				fail(driver,"By default '"+Default_Size_Card_Widget+"' is not displayed in the Size input, Act : "+defaultSizeAct);
			}
			
			setTestCaseID("TC_CARD_038");
			mouseOverAndClick(driver,CardSize_input);
			verifyElementIsPresent1(driver, CardSize_Options);
			
			setTestCaseID("TC_CARD_039");
			selectByText(driver, CardSize_input, Select_Size);
			scrollUsingElement(driver,ApplyButton);
			click(driver,ApplyButton);
			elementnotvisible1(driver, RPE_Loading);
			if(verifyElementDisplayed(driver, Card_Chart)) {
				String IconPosition=getFontSize(driver, Card_Icon_Chart);
				if(IconPosition.equals(Select_Size)) {
					pass(driver,"Selected Size is applied correctly in the chart");
				}else {
					fail(driver,"Selected Size is not applied correctly in the chart");
				}
			}
		}
		
		
		
	}
	
}
