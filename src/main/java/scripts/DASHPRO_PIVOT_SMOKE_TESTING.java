package scripts;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class DASHPRO_PIVOT_SMOKE_TESTING extends Keywords{

	public void pivot_testing(WebDriver driver,int iteration,String Flag) {
		 
		String TableFormatExpandColor=Utils.getDataFromTestData("SmokeTesting_UI", "TableFormatExpandColor");
		String DefaultFontFamily_TableFormat=Utils.getDataFromTestData("SmokeTesting_UI", "DefaultFontFamily_TableFormat");
		String DefaultFontSize_TableFormat=Utils.getDataFromTestData("SmokeTesting_UI", "DefaultFontSize_TableFormat");
		String DefaultHeaderColor_TableFormat=Utils.getDataFromTestData("SmokeTesting_UI", "DefaultHeaderColor_TableFormat");
       	String DefaultBodyFontSize_TableFormat=Utils.getDataFromTestData("SmokeTesting_UI", "DefaultBodyFontSize_TableFormat");
       	String Default_PanelFontSize_TableFormat=Utils.getDataFromTestData("SmokeTesting_UI", "Default_PanelFontSize_TableFormat");
       	String DefaultBorderType_TableFormat=Utils.getDataFromTestData("SmokeTesting_UI", "DefaultBorderType_TableFormat");
       	String NegativeCellColor_TableFormat=Utils.getDataFromTestData("SmokeTesting_UI", "NegativeCellColor_TableFormat");
       	String AlignmentSelectedColor_TableFormat=Utils.getDataFromTestData("SmokeTesting_UI", "AlignmentSelectedColor_TableFormat");
       	String DefaultGrandTotalColor_TableFormat=Utils.getDataFromTestData("SmokeTesting_UI", "DefaultGrandTotalColor_TableFormat");
       	String DefaultSeperator_TableFormat=Utils.getDataFromTestData("SmokeTesting_UI", "DefaultSeperator_TableFormat");
       	String DefaultRoundOff_TableFormat=Utils.getDataFromTestData("SmokeTesting_UI", "DefaultRoundOff_TableFormat");

       	
		//Iteration Inputs
		String SelectColumn_Drag_EmptyRowGroup=Utils.getDataFromTestDataIteration(iteration,"Pivot_Widget_Testing", "SelectColumn_Drag_EmptyRowGroup");
		String SelectColumn_Drag_ExistingRowGroup=Utils.getDataFromTestDataIteration(iteration,"Pivot_Widget_Testing", "SelectColumn_Drag_ExistingRowGroup");
		String SelectColumn_Drag_MultipleColumn=Utils.getDataFromTestDataIteration(iteration,"Pivot_Widget_Testing", "SelectColumn_Drag_MultipleColumn");
		String SelectColumn_Drag_EmptyValues=Utils.getDataFromTestDataIteration(iteration,"Pivot_Widget_Testing", "SelectColumn_Drag_EmptyValues");
		String SelectColumn_Drag_ExistingValues=Utils.getDataFromTestDataIteration(iteration,"Pivot_Widget_Testing", "SelectColumn_Drag_ExistingValues");
		String Chang_Aggregation_Values=Utils.getDataFromTestDataIteration(iteration,"Pivot_Widget_Testing", "Chang_Aggregation_Values");
		String SelectColumn_Drag_EmptyColumnLabels=Utils.getDataFromTestDataIteration(iteration,"Pivot_Widget_Testing", "SelectColumn_Drag_EmptyColumnLabels");
		String SelectColumn_Drag_ExistingColumnLabels=Utils.getDataFromTestDataIteration(iteration,"Pivot_Widget_Testing", "SelectColumn_Drag_ExistingColumnLabels");
		String PinMultipleColumn_Input=Utils.getDataFromTestDataIteration(iteration,"Pivot_Widget_Testing", "PinMultipleColumn_Input");
		String Column_RenameInput=Utils.getDataFromTestDataIteration(iteration,"Pivot_Widget_Testing", "Column_RenameInput");
		
		//Chart title
		String TypeBackgroundColor1=Utils.getDataFromTestDataIteration(iteration,"Pivot_Widget_Testing", "TypeBackgroundColor1");
		String TypeTextColor1=Utils.getDataFromTestDataIteration(iteration,"Pivot_Widget_Testing", "TypeTextColor1");
		String Change_FontFamily_ChartTitle=Utils.getDataFromTestDataIteration(iteration,"Pivot_Widget_Testing", "Change_FontFamily_ChartTitle");
		String ChangeFontSize_ChartTitle=Utils.getDataFromTestDataIteration(iteration,"Pivot_Widget_Testing", "ChangeFontSize_ChartTitle");
		String ChangeChartTitleName=Utils.getDataFromTestDataIteration(iteration,"Pivot_Widget_Testing", "ChangeChartTitleName");
			
		//Table Format
		String Select_TableTheme_Value=Utils.getDataFromTestDataIteration(iteration,"Pivot_Widget_Testing", "Select_TableTheme_Value");
		String Select_FontFamily_TableFormat=Utils.getDataFromTestDataIteration(iteration,"Pivot_Widget_Testing", "Select_FontFamily_TableFormat");
		String Select_HeaderFontSize_TableFormat=Utils.getDataFromTestDataIteration(iteration,"Pivot_Widget_Testing", "Select_HeaderFontSize_TableFormat");
		String ChangeHeaderColor_TableFormat=Utils.getDataFromTestDataIteration(iteration,"Pivot_Widget_Testing", "ChangeHeaderColor_TableFormat");
		String Select_BodyFontSize_TableFormat=Utils.getDataFromTestDataIteration(iteration,"Pivot_Widget_Testing", "Select_BodyFontSize_TableFormat");
		String Select_PanelFontSize_TableFormat=Utils.getDataFromTestDataIteration(iteration,"Pivot_Widget_Testing", "Select_PanelFontSize_TableFormat");
		String Select_Border_Value_TableFormat=Utils.getDataFromTestDataIteration(iteration,"Pivot_Widget_Testing", "Select_Border_Value_TableFormat");
		String Change_Seperator_Option=Utils.getDataFromTestDataIteration(iteration,"Pivot_Widget_Testing", "Change_Seperator_Option");
		String Select_Seperator_Column=Utils.getDataFromTestDataIteration(iteration,"Pivot_Widget_Testing", "Select_Seperator_Column");
		String Change_RoundOff_Option=Utils.getDataFromTestDataIteration(iteration,"Pivot_Widget_Testing", "Change_RoundOff_Option");
		String Select_RoundOff_Column=Utils.getDataFromTestDataIteration(iteration,"Pivot_Widget_Testing", "Select_RoundOff_Column");

		
		Actions action=new Actions(driver);
		mouseOverToElement(driver, ADDTabPlus);
  	    mouseOverAndClick(driver, ADDTabPlus);
  	    wait(driver,"1");
  	    sendKeys(driver,newlyAddedTab,"PivotTestTab1");
  	    click(driver,DashProPage);
  	    elementnotvisible1(driver, RPE_Loading);
		waitForElement(driver,ADD_widget_rightTop);
	    click(driver,ADD_widget_rightTop);
	    elementnotvisible(driver,Loading);
	    elementnotvisible1(driver, RPE_Loading);
		waitForElement(driver,WidgetPanel);
		waitForElement(driver,Pivot_widget);
		WidgetValidation(driver,Pivot_widget,"Pivot");
		click(driver,Pivot_widget);
		elementnotvisible(driver, Loading);
		elementnotvisible1(driver, RPE_Loading);
		String widgetValue=getText1(driver,WidgetValue);
	 	if(widgetValue.equals("Pivot")) {
			pass(driver,"'Pivot' displayed as the selected Widget ");
	 	}else {
	 		fail(driver,"'Pivot' not displayed as the selected Widget ");
	 	}
	 	
	    if(isDisplayed(driver,Pivot_Column_Panel)) {
	    	pass(driver,"Pivot panels are visible by default when the pivot chart is loaded");
	    }else {
	    	fail(driver,"Pivot panels are not visible by default when the pivot chart is loaded");
	    }
	 	
	 	verifyElementDisplayed(driver, Column_Icon_Pivot);
	 	click(driver,Column_Icon_Pivot);
	 	wait(driver,"1");
	 	if(!isDisplayed(driver,Pivot_Column_Panel)) {
	    	pass(driver,"Pivot panel is closed when click on the Column icon");
	    }else {
	    	fail(driver,"Pivot panel is not closed when click on the Column icon");
	    }
	 	
	 	click(driver,Column_Icon_Pivot);
	 	wait(driver,"1");
	 	if(isDisplayed(driver,Pivot_Column_Panel)) {
	    	pass(driver,"Pivot panel is displayed Again click on the Column icon");
	    }else {
	    	fail(driver,"Pivot panel is not displayed Again click on the Column icon");
	    }
	 	
	 	if(isDisplayed(driver,ColumnList_Sec_Pivot) && isDisplayed(driver,ColumnValues_List)) {
	 		pass(driver,"Column Lists are displayed in the pivot panel ");
	 	}else {
	 		fail(driver,"Column Lists are not displayed in the pivot panel ");
	 	}
	    
	 	if(isDisplayed(driver,Row_Groups_Pivot)) {
	 		pass(driver,"Row Groups displayed in the pivot panel ");
	 	}else {
	 		fail(driver,"Row Groups not displayed in the pivot panel ");
	 	}
	 	
	 	if(isDisplayed(driver,Values_Pivot)) {
	 		pass(driver,"Values displayed in the pivot panel ");
	 	}else {
	 		fail(driver,"Values not displayed in the pivot panel ");
	 	}
	    
	 	if(isDisplayed(driver,ColumnLabels_Pivot)) {
	 		pass(driver,"Column Labels displayed in the pivot panel ");
	 	}else {
	 		fail(driver,"Column Labels not displayed in the pivot panel ");
	 	}
	 	
	 	ScrollBarValidation1(driver,ColumnList_Sec_Pivot,"Column List in Pivot");
	 	
	    if(verifyElementDisplayed(driver, DragAndDrop_ColumnList)) {
	    	List<WebElement> ColumnListAct=getWebElements(driver, ColumnValues_List);
	    	List<WebElement> DragAndDropColumnListAct=getWebElements(driver, DragAndDrop_ColumnList);
	    	int ColumnListCount=0;
		    int DragAndDropCount=0;
		    for(WebElement ColumList:ColumnListAct) {
			   try {
				   if(ColumList.isDisplayed()) {
					   ColumnListCount++;
				   }
			   }catch(Exception e) {
				   
			   }
		    }
		    for(WebElement DragAndDropList:DragAndDropColumnListAct) {
			   try {
				   if(DragAndDropList.isDisplayed()) {
					   DragAndDropCount++;
				   }
			   }catch(Exception e) {
				   
			   }
		    }
		    
		    if(ColumnListCount==DragAndDropCount) {
		    	pass(driver,"Drag And Drop icon displayed in All available Column list");
		    }else {
		    	fail(driver,"Drag And Drop icon not displayed in some Column list");
		    }
	    }
	    
	    if(verifyElementDisplayed(driver, CheckBox_ColumnList)) {
	    	List<WebElement> ColumnListAct=getWebElements(driver, ColumnValues_List);
	    	List<WebElement> CheckBox_ColumnListAct=getWebElements(driver, CheckBox_ColumnList);
	    	int ColumnListCount=0;
		    int CheckBoxCount=0;
		    for(WebElement ColumList:ColumnListAct) {
			   try {
				   if(ColumList.isDisplayed()) {
					   ColumnListCount++;
				   }
			   }catch(Exception e) {
				   
			   }
		    }
		    for(WebElement CheckBoxList:CheckBox_ColumnListAct) {
			   try {
				   if(CheckBoxList.isDisplayed()) {
					   CheckBoxCount++;
				   }
			   }catch(Exception e) {
				   
			   }
		    }
		    
		    if(ColumnListCount==CheckBoxCount) {
		    	pass(driver,"CheckBox is displayed in All available Column list");
		    }else {
		    	fail(driver,"CheckBox is not displayed in some Column list");
		    }
	    }
	    
	    click(driver,ApplyButton);
	    if(isDisplayed(driver,error)) {
	    	pass(driver,"Error is displayed when click Apply button without Selecting Any Column");
	    }else {
	    	fail(driver,"Error is not displayed when click Apply button without Selecting Any Column");
	    }
	    
	    if(!isDisplayed(driver,List_RowGroup)) {
	    	pass(driver,"Row groups shows empty by default when the pivot chart is loaded");
	    }else {
	    	fail(driver,"Row group is not empty by default when the pivot chart is loaded");
	    }
	    
	    if(!isDisplayed(driver,List_Values)) {
	    	pass(driver,"Values shows empty by default when the pivot chart is loaded");
	    }else {
	    	fail(driver,"Values is not empty by default when the pivot chart is loaded");
	    }
	    
	    if(!isDisplayed(driver,List_ColumnLabels)) {
	    	pass(driver,"Column Labels shows empty by default when the pivot chart is loaded");
	    }else {
	    	fail(driver,"Column Labels is not empty by default when the pivot chart is loaded");
	    }
	    
	    //Validating Drag and Drop from column to empty row group Start
	    verifyElementDisplayed(driver, SearchInput_Pivot);
	    click(driver,SearchInput_Pivot);
	    sendKeys(driver,SearchInput_Pivot,SelectColumn_Drag_EmptyRowGroup);
	    wait(driver,"1");
	    WebElement Rowgroup=getWebElement(driver,Row_Groups_text);
	    try {
	    	WebElement searchedElement=driver.findElement(By.xpath("//span[text()='"+SelectColumn_Drag_EmptyRowGroup+"']//ancestor::div[1]/span[contains(@class,'column-drag-handle')]"));
	    	action.moveToElement(searchedElement).build().perform();
	    	action.clickAndHold(searchedElement).moveToElement(Rowgroup).release().build().perform();
	    	wait(driver,"1");
	    	boolean drag=false;
	    	if(isDisplayed(driver,List_RowGroup)) {
	    		List<WebElement> rowGroupElements=getWebElements(driver, List_RowGroup);
	    		for(WebElement rowGroupElement:rowGroupElements) {
	    			String rowGroupElementText=rowGroupElement.getText();
	    			if(rowGroupElementText.equals(SelectColumn_Drag_EmptyRowGroup)) {
	    				drag=true;
	    				break;
	    			}
	    		}
	    		
	    		if(drag==true) {
	    			pass(driver,SelectColumn_Drag_EmptyRowGroup+" Column dragged inot Row Groups");
	    		}else {
	    			fail(driver,SelectColumn_Drag_EmptyRowGroup+" Column not dragged inot Row Groups");
	    		}
	    	}else {
	    		fail(driver,SelectColumn_Drag_EmptyRowGroup+" Column not dragged into Row Groups");
	    	}
	    }catch(Exception e) {
	    	fail(driver,"Unable to Validate the Column drag and drop to the Empty Row Groups ");
	    	e.printStackTrace();
	    }
	  //Validating Drag and Drop from column to empty Row group End
	    
	  //Validating Drag and Drop from column to Existing Row group Start
	    clear1(driver,SearchInput_Pivot);
	    sendKeys(driver,SearchInput_Pivot,SelectColumn_Drag_ExistingRowGroup);
	    Rowgroup=getWebElement(driver,Row_Groups_text);
	    
	    try {
	    	WebElement searchedElement=driver.findElement(By.xpath("//span[text()='"+SelectColumn_Drag_ExistingRowGroup+"']//ancestor::div[1]/span[contains(@class,'column-drag-handle')]"));
	    	action.moveToElement(searchedElement).build().perform();
	    	action.clickAndHold(searchedElement).moveToElement(Rowgroup).release().build().perform();
	    	wait(driver,"1");
	    	boolean drag=false;
    		List<WebElement> rowGroupElements=getWebElements(driver, List_RowGroup);
    		for(WebElement rowGroupElement:rowGroupElements) {
    			String rowGroupElementText=rowGroupElement.getText();
    			if(rowGroupElementText.equals(SelectColumn_Drag_ExistingRowGroup)) {
    				drag=true;
    				break;
    			}
    		}
    		if(drag==true) {
    			pass(driver,SelectColumn_Drag_ExistingRowGroup+" Column dragged inot Row Groups");
    		}else {
    			fail(driver,SelectColumn_Drag_ExistingRowGroup+" Column not dragged inot Row Groups");
    		}
	    }catch(Exception e) {
	    	fail(driver,"Unable to Validate the Column drag and drop to the Existing Row Groups ");
	    	e.printStackTrace();
	    }
	  //Validating Drag and Drop from column to Existing Row group End
	    
	   //Validating Drag and Drop multiple Column from column to Existing Row group Start
	    clear1(driver,SearchInput_Pivot);
	    sendKeys(driver,SearchInput_Pivot,SelectColumn_Drag_MultipleColumn);
	    Rowgroup=getWebElement(driver,Row_Groups_text); 
	    try {
	    	WebElement searchedElement=driver.findElement(By.xpath("//span[text()='"+SelectColumn_Drag_MultipleColumn+"']//ancestor::div[1]/span[contains(@class,'column-drag-handle')]"));
	    	action.moveToElement(searchedElement).build().perform();
	    	action.clickAndHold(searchedElement).moveToElement(Rowgroup).release().build().perform();
	    	wait(driver,"1");
	    	boolean drag=false;
    		List<WebElement> rowGroupElements=getWebElements(driver, List_RowGroup);
    		for(WebElement rowGroupElement:rowGroupElements) {
    			String rowGroupElementText=rowGroupElement.getText();
    			if(rowGroupElementText.equals(SelectColumn_Drag_MultipleColumn)) {
    				drag=true;
    				break;
    			}
    		}
    		
    		if(drag==true) {
    			pass(driver,SelectColumn_Drag_MultipleColumn+" Column dragged into Row Groups (Multiple Column Validation)");
    		}else {
    			fail(driver,SelectColumn_Drag_MultipleColumn+" Column not dragged into Row Groups (Multiple Column Validation)");
    		}
	    }catch(Exception e) {
	    	fail(driver,"Unable to Validate the multiple Column drag and drop to the Existing Row Groups ");
	    	e.printStackTrace();
	    }
	  //Validating Drag and Drop multiple Column from column to Existing Row group End
	    
	  //Validating the Order of the Dragged Value in the Row Group Start
	    String[] dragedText={SelectColumn_Drag_MultipleColumn,SelectColumn_Drag_ExistingRowGroup,SelectColumn_Drag_EmptyRowGroup};
	    List<WebElement> rowGroupElements=getWebElements(driver, List_RowGroup);
	    boolean dragOrder=true;
	    for(int i=0;i<rowGroupElements.size();i++) {
	    	String rowGroupElementText=rowGroupElements.get(i).getText();
	    	if(!dragedText[i].equals(rowGroupElementText)) {
	    		dragOrder=false;
	    	}
	    }
	    
	    if(dragOrder==true) {
	    	pass(driver,"Columns are draged in the correct order ");
	    }else {
	    	fail(driver,"Columns are not draged in the correct order ");
	    }
	  //Validating the Order of the Dragged Value in the Row Group End
	    
	  //Validating the Drag one column value in the Row Group and Drop into another column in the Row Group
	    String BeforeDragFirstText=getText1(driver,ColumnList1_RowGroup);
	    WebElement firstRowGroupEle=getWebElement(driver,Drag_RowGroupList1);
	    WebElement secondRowGroupEle=getWebElement(driver,Drag_RowGroupList2);
	    action.moveToElement(firstRowGroupEle).build().perform();
	    action.clickAndHold(firstRowGroupEle).moveToElement(secondRowGroupEle).build().perform();
	    action.release().build().perform();
	    wait(driver,"1");
	    String AfterDragFirstText=getText1(driver,ColumnList1_RowGroup);
	    if(BeforeDragFirstText.equals(AfterDragFirstText)) {
	    	fail(driver,"Dragging a column from one row group and dropping it onto another column within the same row group is failed");
	    }else {
	    	pass(driver,"Dragging a column from one row group and dropping it onto another column within the same row group is passed");
	    }
	  //Validating the Drag one column value in the Row Group and Drop into another column in the Row Group
	    
	  //Validating the Scrollbar in the Row Group
	    ScrollBarValidation1(driver, Row_Groups_Pivot, "Row_Groups");
	    
	  //DeSelecting the Column From Row Group Start
	    clear1(driver,SearchInput_Pivot);
	    sendKeys(driver,SearchInput_Pivot,SelectColumn_Drag_EmptyRowGroup);
	    mouseOverAndClick(driver,FirstCheckBox);
	    wait(driver,"1");
	    rowGroupElements=getWebElements(driver, List_RowGroup);
	    boolean deselect=true;
	    for(int i=0;i<rowGroupElements.size();i++) {
	    	String rowGroupElementText=rowGroupElements.get(i).getText();
	    	if(rowGroupElementText.equals(SelectColumn_Drag_EmptyRowGroup)) {
	    		deselect=false;
	    	}
	    }
	    
	    if(deselect==true) {
	    	pass(driver,SelectColumn_Drag_EmptyRowGroup+" Column removed from Row Group After deselcting it");
	    }else {
	    	fail(driver,SelectColumn_Drag_EmptyRowGroup+" Column not removed from Row Group After deselcting it");
	    }
	    //DeSelecting the Column From Row Group end
	    
	  //Drag Columns into Empty Values Start
	    clear1(driver,SearchInput_Pivot);
	    sendKeys(driver,SearchInput_Pivot,SelectColumn_Drag_EmptyValues);
	    WebElement firstSearchedColumn=getWebElement(driver, FirstDrag);
	    WebElement ValuesElement=getWebElement(driver, Values_Text);
	    action.moveToElement(firstSearchedColumn).build().perform();
	    action.clickAndHold(firstSearchedColumn).moveToElement(ValuesElement).build().perform();
	    action.release().build().perform();
	    wait(driver,"1");
	    if(isDisplayed(driver, List_Values)) {
	    	 String valuesSelectedText=getText1(driver, List_Values);
	    	 if(valuesSelectedText.contains(SelectColumn_Drag_EmptyValues)) {
	    		 pass(driver,SelectColumn_Drag_EmptyValues+" Column is draged into the Empty 'Values' in pivot");
	    	 }else {
	    		 fail(driver,SelectColumn_Drag_EmptyValues+" Column is not draged into the Empty 'Values' in pivot");
	    	 }
	    }else {
   		    fail(driver,SelectColumn_Drag_EmptyValues+" Column is not draged into the Empty 'Values' in pivot");
	    }
		//Drag Columns into Empty Values End
	    
	   	//Drag Columns into Existing Values Start
	    clear1(driver,SearchInput_Pivot);
	    wait(driver,"1");
	    sendKeys(driver,SearchInput_Pivot,SelectColumn_Drag_ExistingValues);
	    wait(driver,"1");
	    firstSearchedColumn=getWebElement(driver, FirstDrag);
	    ValuesElement=getWebElement(driver, Values_Text);
	    action.moveToElement(firstSearchedColumn).build().perform();
	    action.clickAndHold(firstSearchedColumn).moveToElement(ValuesElement).build().perform();
	    action.release().build().perform();
	    String valuesSelectedText=getText1(driver, List_Values);
   	 	if(valuesSelectedText.contains(SelectColumn_Drag_ExistingValues)) {
   	 		pass(driver,SelectColumn_Drag_ExistingValues+" Column is draged into the Existing 'Values' in pivot");
   	 	}else {
   	 		fail(driver,SelectColumn_Drag_ExistingValues+" Column is not draged into the Existing 'Values' in pivot");
   	 	}
   		//Drag Columns into Existing Values End
	    
   	   //Drag from Row Groups to Values Start
   	 	clear1(driver,SearchInput_Pivot);
	    String FirstText_RowGroup=getText1(driver,ColumnList1_RowGroup);
	    firstRowGroupEle=getWebElement(driver,Drag_RowGroupList1);
	    ValuesElement=getWebElement(driver, Values_Text);
	    action.moveToElement(firstRowGroupEle).build().perform();
	    action.clickAndHold(firstRowGroupEle).moveToElement(ValuesElement).build().perform();
	    action.release().build().perform();
	    wait(driver,"1");
	    valuesSelectedText=getText1(driver, List_Values);
	    if(valuesSelectedText.contains(FirstText_RowGroup)) {
	    	pass(driver,"Column Drag and Drop from 'Row Group' to 'Values' is passed");
	    }else {
	    	fail(driver,"Column Drag and Drop from 'Row Group' to 'Values' is Failed");
	    }
	   //Drag from Row Groups to Values End
	  
	  //Validating the Drag one column value in the Values and Drop into another column in the Values
	    String BeforeDragFirstText_Values=getText1(driver,List_Values);
	    WebElement FirstEle_Values=getWebElement(driver,Drag_ValuesList1);
	    WebElement SecondEle_Values=getWebElement(driver,Drag_ValuesList2);
	    action.moveToElement(FirstEle_Values).build().perform();
	    action.clickAndHold(FirstEle_Values).moveToElement(SecondEle_Values).build().perform();
	    action.release().build().perform();
	    wait(driver,"1");
	    String AfterDragFirstText_Values=getText1(driver,ColumnList1_RowGroup);
	    if(BeforeDragFirstText_Values.equals(AfterDragFirstText_Values)) {
	    	fail(driver,"Dragging one column from Values and dropping it onto another column in the 'Values' is failed");
	    }else {
	    	pass(driver,"Dragging one column from Values and dropping it onto another column in the 'Values' is passed");
	    }
	    //Validating the Drag one column value in the Values and Drop into another column in the Values
	   
	    ScrollBarValidation1(driver, Values_Pivot, "Values");
	    
	    //Sorting Validation in the Row Group Start
	    FirstText_RowGroup=getText1(driver,ColumnList1_RowGroup);
	    if(verifyElementDisplayed(driver, SortingOption_RowGroupList)) {
	    	String beforeClickSort=getAttribute1(driver, SortingType_RowGroup, "ref");
	    	if(beforeClickSort.equals("eSortNone")) {
	    		pass(driver,"By default, Sorting Option displayed with 'No Sorting' in the Row Group");
	    	}else {
	    		fail(driver,"By default, Sorting Option not displayed with 'No Sorting' in the Row Group");
	    	}
	    	mouseOverAndClick(driver,SortingOption_RowGroupList);
	    	wait(driver,"1");
	    	String afterClickSort=getAttribute1(driver, SortingType_RowGroup, "ref");
	    	if(afterClickSort.equals("eSortAsc")) {
	    		pass(driver,"Sorting Option Changed to 'Ascending' in the Row group while click on it");
	    		try {
	    			WebElement tableHeadSort=driver.findElement(By.xpath("//span[contains(text(),'"+FirstText_RowGroup+"')]//ancestor::div[contains(@class,'RPE_Previewtableheadercolor')][1]//span[@ref='eSortIndicator']/span[not(contains(@class,'ag-hidden'))]"));
	    			String SortAct=tableHeadSort.getAttribute("ref");
	    			if(SortAct.equals(afterClickSort)) {
	    				pass(driver,"'Ascending' sort is applied in the Chart ");
	    			}else {
	    				fail(driver,"'Ascending' sort is not applied in the Chart ");
	    			}
	    		
	    		}catch(Exception e) {
	    			fail(driver,"Unable to Validate the Sort applied in the chart");
	    		}
	    	}else {
	    		fail(driver,"Sorting Option not Changed to 'Ascending' in the Row group while click on it");
	    	}
	    	
	    	mouseOverAndClick(driver,SortingOption_RowGroupList);
	    	wait(driver,"1");
	    	String afterClickSort2=getAttribute1(driver, SortingType_RowGroup, "ref");
	    	if(afterClickSort2.equals("eSortDesc")) {
	    		pass(driver,"Sorting Option Changed to 'Descending' in the Row group while click on it");
	    		try {
	    			WebElement tableHeadSort=driver.findElement(By.xpath("//span[contains(text(),'"+FirstText_RowGroup+"')]//ancestor::div[contains(@class,'RPE_Previewtableheadercolor')][1]//span[@ref='eSortIndicator']/span[not(contains(@class,'ag-hidden'))]"));
	    			String SortAct=tableHeadSort.getAttribute("ref");
	    			if(SortAct.equals(afterClickSort2)) {
	    				pass(driver,"'Descending' sort is applied in the Chart ");
	    			}else {
	    				fail(driver,"'Descending' sort is not applied in the Chart ");
	    			}
	    		
	    		}catch(Exception e) {
	    			fail(driver,"Unable to Validate the Sort applied in the chart");
	    		}
	    	}else {
	    		fail(driver,"Sorting Option not Changed to 'Descending' in the Row group while click on it");
	    	}
	    	
	    	mouseOverAndClick(driver,SortingOption_RowGroupList);
	    	wait(driver,"1");
	    	String afterClickSort3=getAttribute1(driver, SortingType_RowGroup, "ref");
	    	if(afterClickSort3.equals("eSortNone")) {
	    		pass(driver,"Sorting Option Changed to 'SortNone' in the Row group while click on it");
	    		try {
	    			WebElement tableHeadSort=driver.findElement(By.xpath("//span[contains(text(),'"+FirstText_RowGroup+"')]//ancestor::div[contains(@class,'RPE_Previewtableheadercolor')][1]//span[@ref='eSortIndicator']/span[not(contains(@class,'ag-hidden'))]"));
	    			String SortAct=tableHeadSort.getAttribute("ref");
	    			if(SortAct.equals(afterClickSort3)) {
	    				pass(driver,"'SortNone' is applied in the Chart ");
	    			}else {
	    				fail(driver,"'SortNone' is not applied in the Chart ");
	    			}
	    		
	    		}catch(Exception e) {
	    			fail(driver,"Unable to Validate the Sort applied in the chart");
	    		}
	    	}else {
	    		fail(driver,"Sorting Option not Changed to 'SortNone' in the Row group while click on it");
	    	}
	    	
	    	
	    }
	    //Sorting Validation in the Row Group End
	    
	    // Validation of aggregation in the Values 
	    
	    String firstColumn_Values=getText(driver,List_Values);
	    if(firstColumn_Values.contains("sum")) {
	    	pass(driver,"By default 'Sum' is applied as the aggregation in the Values");
	    }else {
	    	fail(driver,"By default 'Sum' is not applied as the aggregation in the Values");
	    }
	    
	    if(firstColumn_Values.contains("(")) {
	        int startIndex = firstColumn_Values.indexOf('(') + 1;
	        int endIndex = firstColumn_Values.indexOf(')');
	        firstColumn_Values = firstColumn_Values.substring(startIndex, endIndex);
	        System.out.println("firstColumn_Values : "+firstColumn_Values);
	    }
	    
	    click(driver,List_Values);
	    if(isDisplayed(driver,AggregationDropdown)) {
	    	pass(driver,"Aggregation selection dropdown expanded after click the Column in the Values");
	    	try {
	    		WebElement selectAgg=driver.findElement(By.xpath("//div[@aria-label='Aggregation Function']/div//div[text()='"+Chang_Aggregation_Values+"']"));
	    		action.moveToElement(selectAgg).click().build().perform();
	    		pass(driver,Chang_Aggregation_Values+" Selected as the Aggregation in the Values");
	    		if(!isDisplayed2(driver,AggregationDropdown)) {
	    			pass(driver,"Aggregation selection dropdown closed after selecting the Value");
	    		}else {
	    			fail(driver,"Aggregation selection dropdown not closed after selecting the Value");
	    		}
	    	}catch(Exception e) {
	    		fail(driver,"Unable to Select the Aggregation Value : "+Chang_Aggregation_Values);
	    	}
	    	
	    	try {
	    		wait(driver,"1");
	    		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//div[@id='RPE_Preview']//span[contains(text(),'"+firstColumn_Values+"')]//ancestor::div[contains(@class,'RPE_Previewtableheadercolor')][1]//span[@ref='eText']
	    		WebElement HeaderColumn=driver.findElement(By.xpath("//div[@id='RPE_Preview']//span[contains(text(),'"+firstColumn_Values+"')]//ancestor::div[@role='columnheader'][1]//span[@ref='eText']"));
	    		String HeaderColumnText=HeaderColumn.getText();
	    		int endIndex = HeaderColumnText.indexOf('(');
	    		HeaderColumnText=HeaderColumnText.substring(0,endIndex);
	    		if(HeaderColumnText.equalsIgnoreCase(Chang_Aggregation_Values)) {
	    			pass(driver,Chang_Aggregation_Values+" Aggregation is updated in the Header in the Chart");
	    		}else {
	    			fail(driver,Chang_Aggregation_Values+" Aggregation is not updated in the Header in the Chart");
	    		}
	    	}catch(Exception e) {
	    		fail(driver,"Unable to Validate the Aggregation Value updated in the Chart ");
	    		e.printStackTrace();
	    	}
	    	
	    }else {
	    	fail(driver,"Aggregation selection dropdown not expanded after click the Column in the Values");
	    }
	    // Validation of aggregation in the Values End
	    
	    //Drag Column from Values to Row Group Start
	    WebElement FirstValues_Drag=getWebElement(driver, Drag_ValuesList1);
	    Rowgroup=getWebElement(driver,Row_Groups_text); 
	    action.moveToElement(FirstValues_Drag).build().perform();
	    action.clickAndHold(FirstValues_Drag).moveToElement(Rowgroup).build().perform();
	    action.release().build().perform();
	    wait(driver,"1");
	    FirstText_RowGroup=getText1(driver, ColumnList1_RowGroup);
	    if(FirstText_RowGroup.equals(firstColumn_Values)) {
	    	pass(driver,"Columns Drag and Drop from 'Values' to Row Groups is passed");
	    }else {
	    	fail(driver,"Columns Drag and Drop from 'Values' to Row Groups is Failed");
	    }
	    //Drag Column from Values to Row Group End
	    
	    //Removing the Column from the Values by deSelect the Column Start
	    firstColumn_Values=getText(driver,List_Values);
	    if(firstColumn_Values.contains("(")) {
	        int startIndex = firstColumn_Values.indexOf('(') + 1;
	        int endIndex = firstColumn_Values.indexOf(')');
	        firstColumn_Values = firstColumn_Values.substring(startIndex, endIndex);
	    }
	    clear1(driver,SearchInput_Pivot);
	    sendKeys(driver,SearchInput_Pivot,firstColumn_Values);
	    wait(driver,"1");
	    mouseOverAndClick(driver,FirstCheckBox);
	    wait(driver,"1");
	    String FirstText_Values=getText1(driver, List_Values);
	    if(!FirstText_Values.contains(firstColumn_Values)) {
	    	pass(driver,"Column removed from 'Values' when deSelect it ");
	    }else {
	    	fail(driver,"Column not removed from 'Values' when deSelect it ");
	    }
	    //Removing the Column from the Values by deSelect the Column End 
	    
	    //Drag Columns into Empty Column Labels Start
	    clear1(driver,SearchInput_Pivot);
	    sendKeys(driver,SearchInput_Pivot,SelectColumn_Drag_EmptyColumnLabels);
	    wait(driver,"1");
	    firstSearchedColumn=getWebElement(driver, FirstDrag);
	    WebElement ColumnLabelsElement=getWebElement(driver, ColumnLabels_Text);
	    action.moveToElement(firstSearchedColumn).build().perform();
	    action.clickAndHold(firstSearchedColumn).moveToElement(ColumnLabelsElement).build().perform();
	    action.release().build().perform();
	    wait(driver,"1");
	    if(isDisplayed(driver, List_ColumnLabels)) {
	    	 String SelectedText_ColumnLabel=getText1(driver, List_ColumnLabels);
	    	 if(SelectedText_ColumnLabel.equals(SelectColumn_Drag_EmptyColumnLabels)) {
	    		 pass(driver,SelectColumn_Drag_EmptyColumnLabels+" Column is draged into the Empty 'Column Labels' in pivot");
	    	 }else {
	    		 fail(driver,SelectColumn_Drag_EmptyColumnLabels+" Column is not draged into the Empty 'Column Labels' in pivot");
	    	 }
	    }else {
   		    fail(driver,SelectColumn_Drag_EmptyColumnLabels+" Column is not draged into the Empty 'Column Labels' in pivot");
	    }
		//Drag Columns into Empty Column Labels End
	    
	   //Drag Columns into Existing Column Labels Start
	    clear1(driver,SearchInput_Pivot);
	    wait(driver,"1");
	    sendKeys(driver,SearchInput_Pivot,SelectColumn_Drag_ExistingColumnLabels);
	    wait(driver,"1");
	    firstSearchedColumn=getWebElement(driver, FirstDrag);
	    ColumnLabelsElement=getWebElement(driver, ColumnLabels_Text);
	    action.moveToElement(firstSearchedColumn).build().perform();
	    action.clickAndHold(firstSearchedColumn).moveToElement(ColumnLabelsElement).build().perform();
	    action.release().build().perform();
	    String SelectedText_ColumnLabel=getText1(driver, List_ColumnLabels);
   	 	if(SelectedText_ColumnLabel.contains(SelectColumn_Drag_ExistingColumnLabels)) {
   	 		pass(driver,SelectColumn_Drag_ExistingColumnLabels+" Column is draged into the Existing 'Column Labels' in pivot");
   	 	}else {
   	 		fail(driver,SelectColumn_Drag_ExistingColumnLabels+" Column is not draged into the Existing 'Column Labels' in pivot");
   	 	}
   		//Drag Columns into Existing Values End
	    
   	    //Drag from Row Groups to Column Labels Start
   	 	clear1(driver,SearchInput_Pivot);
	    FirstText_RowGroup=getText1(driver,ColumnList1_RowGroup);
	    firstRowGroupEle=getWebElement(driver,Drag_RowGroupList1);
	    ColumnLabelsElement=getWebElement(driver, ColumnLabels_Text);
	    action.moveToElement(firstRowGroupEle).build().perform();
	    action.clickAndHold(firstRowGroupEle).moveToElement(ColumnLabelsElement).build().perform();
	    action.release().build().perform();
	    wait(driver,"1");
	    SelectedText_ColumnLabel=getText1(driver, List_ColumnLabels);
	    if(SelectedText_ColumnLabel.equals(FirstText_RowGroup)) {
	    	pass(driver,"Column Drag and Drop from 'Row Group' to 'Column Labels' is passed");
	    }else {
	    	fail(driver,"Column Drag and Drop from 'Row Group' to 'Column Labels' is Failed");
	    }
	    //Drag from Row Groups to Column Labels End
   	 	
	   //Drag from Values to Column Labels Start
	    firstColumn_Values=getText(driver,List_Values);
	    if(firstColumn_Values.contains("(")) {
	        int startIndex = firstColumn_Values.indexOf('(') + 1;
	        int endIndex = firstColumn_Values.indexOf(')');
	        firstColumn_Values = firstColumn_Values.substring(startIndex, endIndex);
	    }
	    WebElement FirstDrag_Values=getWebElement(driver, Drag_ValuesList1);
	    ColumnLabelsElement=getWebElement(driver, ColumnLabels_Text);
	    action.moveToElement(FirstDrag_Values).build().perform();
	    action.clickAndHold(FirstDrag_Values).moveToElement(ColumnLabelsElement).build().perform();
	    action.release().build().perform();
	    wait(driver,"1");
	    SelectedText_ColumnLabel=getText1(driver, List_ColumnLabels);
	    if(SelectedText_ColumnLabel.equals(firstColumn_Values)) {
	    	pass(driver,"Column Drag and Drop from 'Values' to 'Column Labels' is passed");
	    }else {
	    	fail(driver,"Column Drag and Drop from 'Values' to 'Column Labels' is Failed");
	    }
	    //Drag from Values to Column Labels End
   	 	
	   //Validating the Drag one column value in the Column Labels and Drop into another column in the Column Labels
	    String BeforeDragFirstText_ColumnLabels=getText1(driver,List_ColumnLabels);
	    WebElement FirstEle_ColumnLabels=getWebElement(driver,Drag_ColumnLabelsList1);
	    WebElement SecondEle_ColumnLabels=getWebElement(driver,Drag_ColumnLabelsList2);
	    action.moveToElement(FirstEle_ColumnLabels).build().perform();
	    action.clickAndHold(FirstEle_ColumnLabels).moveToElement(SecondEle_ColumnLabels).build().perform();
	    action.release().build().perform();
	    wait(driver,"1");
	    String AfterDragFirstText_ColumnLabels=getText1(driver,List_ColumnLabels);
	    if(BeforeDragFirstText_ColumnLabels.equals(AfterDragFirstText_ColumnLabels)) {
	    	fail(driver,"Dragging one column from Column Labels and dropping it onto another column in the 'Column Labels' is failed");
	    }else {
	    	pass(driver,"Dragging one column from Column Labels and dropping it onto another column in the 'Column Labels' is passed");
	    }
	    //Validating the Drag one column value in the Column Labels and Drop into another column in the Column Labels 
	   
	    ScrollBarValidation1(driver, ColumnLabels_Pivot, "Column_Labels");
	    
	   //Removing the Column from the Column Labels by deSelect the Column Start
	    String FirstText_ColumnLabel=getText1(driver, List_ColumnLabels);
	    clear1(driver,SearchInput_Pivot);
	    sendKeys(driver,SearchInput_Pivot,FirstText_ColumnLabel);
	    wait(driver,"1");
	    mouseOverAndClick(driver,FirstCheckBox);
	    wait(driver,"1");
	    String FirstText_ColumnLabelAfter=getText1(driver, List_ColumnLabels);
	    if(!FirstText_ColumnLabelAfter.equals(FirstText_ColumnLabel)) {
	    	pass(driver,"Column removed from 'Column Lables' when deSelect it ");
	    }else {
	    	fail(driver,"Column not removed from 'Column Labels' when deSelect it ");
	    }
	    //Removing the Column from the Column Labels by deSelect the Column End 
   	 	
	  //Drag from Column Labels to  Values Start
	    FirstText_ColumnLabel=getText1(driver, List_ColumnLabels);
	    WebElement FirstDrag_ColumnValues=getWebElement(driver, Drag_ColumnLabelsList1);
	    WebElement Values_Section=getWebElement(driver, Values_Text);
	    action.moveToElement(FirstDrag_ColumnValues).build().perform();
	    action.clickAndHold(FirstDrag_ColumnValues).moveToElement(Values_Section).build().perform();
	    action.release().build().perform();
	    wait(driver,"1");
	    FirstText_Values=getText1(driver, List_Values);
	    if(FirstText_Values.contains(FirstText_ColumnLabel)) {
	    	pass(driver,"Column Drag and Drop from 'Column Labels' to 'Values' is passed");
	    }else {
	    	fail(driver,"Column Drag and Drop from 'Column Labels' to 'Values' is Failed");
	    }
	    //Drag from Column Labels to  Values End
	 
	  //Drag from Column Labels to Row Group Start
	    FirstText_ColumnLabel=getText1(driver, List_ColumnLabels);
	    FirstDrag_ColumnValues=getWebElement(driver, Drag_ColumnLabelsList1);
	    WebElement RowGroup_Section=getWebElement(driver, Row_Groups_text);
	    action.moveToElement(FirstDrag_ColumnValues).build().perform();
	    action.clickAndHold(FirstDrag_ColumnValues).moveToElement(RowGroup_Section).build().perform();
	    action.release().build().perform();
	    wait(driver,"1");
	    FirstText_RowGroup=getText1(driver, List_RowGroup);
	    if(FirstText_RowGroup.equals(FirstText_ColumnLabel)) {
	    	pass(driver,"Column Drag and Drop from 'Column Labels' to 'Row Group' is passed");
	    }else {
	    	fail(driver,"Column Drag and Drop from 'Column Labels' to 'Row Group' is Failed");
	    }
	    //Drag from Column Labels to Row Group End
		    
	    // Validating the Cancel button working in the Column Labels
	    if(verifyElementDisplayed(driver, CancelButton_ColumnLabels)) {
	    	String FirstText_BeforeRemove=getText1(driver, List_ColumnLabels);
	    	mouseOverAndClick(driver, CancelButton_ColumnLabels);
	    	wait(driver,"1");
	    	if(isDisplayed(driver,List_ColumnLabels)) {
	    		String SecondText_BeforeRemove=getText1(driver, List_ColumnLabels);
		    	if(FirstText_BeforeRemove.equals(SecondText_BeforeRemove)) {
		    		fail(driver,"Column not removed from 'Column Labels' after click the Cancel button");
		    	}else {
		    		pass(driver,"Column removed from 'Column Labels' after click the Cancel button");
		    	}
	    	}else {
	    		pass(driver,"Column removed from 'Column Labels' after click the Cancel button");
	    	}
	    	
	    }
	    //Validating the Cancel button working in the Column Labels
   	 	
	    // Validating the Cancel button working in the Row Group
	    if(verifyElementDisplayed(driver, CancelButton_RowGroups)) {
	    	String FirstText_BeforeRemove=getText1(driver, List_RowGroup);
	    	mouseOverAndClick(driver, CancelButton_RowGroups);
	    	wait(driver,"1");
	    	if(isDisplayed(driver,List_RowGroup)) {
	    		String SecondText_BeforeRemove=getText1(driver, List_RowGroup);
		    	if(FirstText_BeforeRemove.equals(SecondText_BeforeRemove)) {
		    		fail(driver,"Column not removed from 'Row Group' after click the Cancel button");
		    	}else {
		    		pass(driver,"Column removed from 'Row Group' after click the Cancel button");
		    	}
	    	}else {
	    		pass(driver,"Column not removed from 'Row Group' after click the Cancel button");
	    	}
	    	
	    }
	    //Validating the Cancel button working in the Row Group
	    
	
	  //Drag one new column into Values for multiple column pin Validation
	    clear1(driver,SearchInput_Pivot);
	    wait(driver,"1");
	    sendKeys(driver,SearchInput_Pivot,PinMultipleColumn_Input);
	    wait(driver,"1");
	    firstSearchedColumn=getWebElement(driver, FirstDrag);
	    ValuesElement=getWebElement(driver, Values_Text);
	    action.moveToElement(firstSearchedColumn).build().perform();
	    action.clickAndHold(firstSearchedColumn).moveToElement(ValuesElement).build().perform();
	    action.release().build().perform();
	    wait(driver,"1");
	    //Drag one new column into Values for multiple column pin Validation
	    
	    
	    //Column Pin Left Validation
	    if(verifyElementIsPresent1(driver,SecondHeader_PivotChart)) {
	    	mouseOverToElement(driver, SecondHeader_PivotChart);
	    	String CurrentHeaderId=getAttribute1(driver, SecondHeader_PivotChart, "col-id");
	    	
	    	wait(driver,"1");
	    	mouseOverAndClick(driver, SecondHeaderMenuOption);
	    	if(isDisplayed(driver,MenuList_Open)) {
	    		pass(driver,"Column Menu Options opened When Click the menu in the header");
		    	if(verifyElementDisplayed(driver, PinColumn_Option)) {
		    		mouseOverToElement(driver, PinColumn_Option);
		    		wait(driver,"1");
//		    		String PinColumnExpand=getAttribute(driver, PinColumn_Option, "aria-expanded");
//		    		if(PinColumnExpand.equals("true")) {
//		    			pass(driver,"Column Pin Options are displayed When mouse hover on the Pin Column option");
//		    		}else {
//		    			fail(driver,"Column Pin Options are not displayed When mouse hover on the Pin Column option");
//		    		}
		    		if(verifyElementDisplayed(driver, PinLeftOption)) {
		    			mouseOverAndClick(driver, PinLeftOption);
		    			wait(driver,"1");
		    			if(!isDisplayed(driver, MenuList_Open)) {
		    				pass(driver,"Column menu Options Closed after selecting the Pin Left Option");
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
	    //Column Pin Left Validation End
	    
	  //Column Pin Right Validation Start
	    if(verifyElementIsPresent1(driver,SecondHeader_PivotChart)) {
	    	mouseOverToElement(driver, SecondHeader_PivotChart);
	    	String CurrentHeaderId=getAttribute1(driver, SecondHeader_PivotChart, "col-id");
	    	wait(driver,"1");
	    	mouseOverAndClick(driver, SecondHeaderMenuOption);
	    	if(isDisplayed(driver,MenuList_Open)) {
	    		pass(driver,"Column Menu Options opened When Click the menu in the header");
		    	if(verifyElementDisplayed(driver, PinColumn_Option)) {
		    		mouseOverToElement(driver, PinColumn_Option);
		    		wait(driver,"1");
//		    		String PinColumnExpand=getAttribute(driver, PinColumn_Option, "aria-expanded");
//		    		if(PinColumnExpand.equals("true")) {
//		    			pass(driver,"Column Pin Options are displayed When mouse hover on the Pin Column option");
//		    		}else {
//		    			fail(driver,"Column Pin Options are not displayed When mouse hover on the Pin Column option");
//		    		}
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
	    
	  //Multiple Column Pin Left Validation Start
	    if(verifyElementIsPresent1(driver,SecondHeader_PivotChart)) {
	    	mouseOverToElement(driver, SecondHeader_PivotChart);
	    	//String CurrentHeaderId=getAttribute1(driver, SecondHeader_PivotChart, "col-id");
	    	wait(driver,"1");
	    	mouseOverAndClick(driver, SecondHeaderMenuOption);
	    	if(isDisplayed(driver,MenuList_Open)) {
	    		pass(driver,"Column Menu Options opened When Click the menu in the header");
		    	if(verifyElementDisplayed(driver, PinColumn_Option)) {
		    		mouseOverToElement(driver, PinColumn_Option);
		    		wait(driver,"1");
//		    		String PinColumnExpand=getAttribute(driver, PinColumn_Option, "aria-expanded");
//		    		if(PinColumnExpand.equals("true")) {
//		    			pass(driver,"Column Pin Options are displayed When mouse hover on the Pin Column option");
//		    		}else {
//		    			fail(driver,"Column Pin Options are not displayed When mouse hover on the Pin Column option");
//		    		}
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
		    			if(pinnedLeftColumnSize==2) {
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
	    
	  //Multiple Column Pin Right Validation Start
	    if(verifyElementIsPresent1(driver,SecondHeader_PivotChart)) {
	    	mouseOverToElement(driver, SecondHeader_PivotChart);
	    	//String CurrentHeaderId=getAttribute1(driver, SecondHeader_PivotChart, "col-id");
	    	wait(driver,"1");
	    	mouseOverAndClick(driver, SecondHeaderMenuOption);
	    	if(isDisplayed(driver,MenuList_Open)) {
	    		pass(driver,"Column Menu Options opened When Click the menu in the header");
		    	if(verifyElementDisplayed(driver, PinColumn_Option)) {
		    		mouseOverToElement(driver, PinColumn_Option);
		    		wait(driver,"1");
//		    		String PinColumnExpand=getAttribute(driver, PinColumn_Option, "aria-expanded");
//		    		if(PinColumnExpand.equals("true")) {
//		    			pass(driver,"Column Pin Options are displayed When mouse hover on the Pin Column option");
//		    		}else {
//		    			fail(driver,"Column Pin Options are not displayed When mouse hover on the Pin Column option");
//		    		}
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
	    
	    //Validation Pinning columns to both the left and right simultaneously.
	    String firstHeaderPosition=getAttribute1(driver, FirstHeader_position, "class");
	    String secondHeaderPosition=getAttribute1(driver, SecondHeader_position, "class");
	    if(firstHeaderPosition.contains("left")&&secondHeaderPosition.contains("right")) {
	    	pass(driver,"Pinning columns to both the left and right simultaneously is passed");
	    }else {
	    	fail(driver,"Pinning columns to both the left and right simultaneously is Failed");
	    }
	    //Validation Pinning columns to both the left and right simultaneously.
	    
	    // Unpinning a column from the left Start
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
	    //Unpinning a column from the left End
	    

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
	    	fail(driver,"AutoSize this Column not applied properly in the Column");
	    }else {
	    	pass(driver,"AutoSize this Column applied properly in the Column , AfterAutoSizeColumnWidth : "+AfterAutoSizeColumn1);
	    }
	  //AutoSize this Column end
	    
	  //AutoSize All Column Start
	    double beforeAutoSizeAllColumn2=getCssWidth(driver,SecondHeader_PivotChart);
	    double beforeAutoSizeAllColumn1=getCssWidth(driver,FirstHeader_PivotChart);
	    mouseOverToElement(driver, FirstHeader_PivotChart);
	    mouseOverAndClick(driver, FirstHeaderMenuOption);
	    waitForElement(driver, MenuList_Open);
	    waitForElement(driver,AutoSizeAllColumnOption);
	    mouseOverAndClick(driver, AutoSizeAllColumnOption);
	    if(!isDisplayed(driver, MenuList_Open)) {
			//pass(driver,"Column menu Options Closed after selecting the Autosize all Column Option");
		}else {
			fail(driver,"Column menu Options not Closed after selecting the Autosize all Column Option");
			Escape(driver);
		}
	    
	    double afterAutoSizeAllColumn2=getCssWidth(driver,SecondHeader_PivotChart);
	    double afterAutoSizeAllColumn1=getCssWidth(driver,FirstHeader_PivotChart);
	    if((beforeAutoSizeAllColumn2==afterAutoSizeAllColumn2 && afterAutoSizeAllColumn2!=0) && (beforeAutoSizeAllColumn1==afterAutoSizeAllColumn1)) {
	    	fail(driver,"AutoSize all Column not applied properly in the Column");
	    }else {
	    	pass(driver,"AutoSize all Column applied properly in the Column");
	    }
	  //AutoSize All Column end
	    
	    mouseOverToElement(driver, FirstHeader_PivotChart);
		String BeforeRenameColumnName=getText1(driver, FirstHeaderText_PivotChart);
		String BeforeRenameCell_Id=getAttribute1(driver, FirstHeader_PivotChart, "col-id");
		
		mouseOverAndClick(driver, FirstHeaderMenuOption);
	    waitForElement(driver, MenuList_Open);
	    waitForElement(driver,ChangeHeaderOption);
	    mouseOverAndClick(driver,ChangeHeaderOption);
		waitForElement(driver,RenameInput);
		click(driver,RenameInput);
		clear1(driver,RenameInput);
	    sendKeys(driver,RenameInput,Column_RenameInput);
	    click(driver,Rename_Yes_Button);
		wait(driver,"1");
		String AfterRenameColumnName=getText1(driver, FirstHeaderText_PivotChart);
		try {
			WebElement SecondHeadCellTextElement=driver.findElement(By.xpath("//div[@id='RPE_Preview']//div[@col-id='"+BeforeRenameCell_Id+"' and @role='columnheader']//span[@ref='eText']"));
		    AfterRenameColumnName=SecondHeadCellTextElement.getText();
		}catch(Exception e) {
			
		}
		
	    if(AfterRenameColumnName.contains(Column_RenameInput)) {
	    	pass(driver,"Column Renamed Successfully , BeforeRenameColumnName : "+BeforeRenameColumnName+", AfterRenameColumnName : "+AfterRenameColumnName);
	    }else {
	    	fail(driver,"Column not renamed Successfully , BeforeRenameColumnName : "+BeforeRenameColumnName+", AfterRenameColumnName : "+AfterRenameColumnName);
	    }
	    //Column Rename End
	    
	    //Column Sorting order Validation Start
	    String defaultSortFirst=getAttribute1(driver, FirstHeader_Sort, "ref");
	    if(defaultSortFirst.equals("eSortNone")) {
	    	pass(driver,"By default, SortNone is displayed in the ColumnHeader");
	    }else {
	    	fail(driver,"By default, SortNone is not applied in the ColumnHeader");
	    }
	    
	    mouseOverAndClick(driver, FirstHeader_PivotChart);
	    wait(driver,"1");
	    String afterFirstClickSort=getAttribute1(driver, FirstHeader_Sort, "ref");
	    if(afterFirstClickSort.equals("eSortAsc")) {
	    	pass(driver,"'Ascending' sort icon is displayed in the Column Header after click on it '");
	    	try {
//	    		WebElement FirstCell=driver.findElement(By.xpath("//div[@id='RPE_Preview']//div[@aria-rowindex='2']//div[@aria-colindex='1' and @col-id='ag-Grid-AutoColumn']"));
//	    		String FirstText=FirstCell.getText();
//	    		WebElement SecondCell=driver.findElement(By.xpath("//div[@id='RPE_Preview']//div[@aria-rowindex='3']//div[@aria-colindex='1' and @col-id='ag-Grid-AutoColumn']"));
//	    		String SecondText=SecondCell.getText();
	    		String FirstText=getText1(driver, FirstCell).toLowerCase();
	    		String SecondText=getText1(driver, SecondCell).toLowerCase();

	    		if(SecondText.compareTo(FirstText)>0) {
	    			pass(driver,"Column Values Are updated in the 'Ascending' order");
	    		}else {
	    			fail(driver,"Column Values Are not updated in the 'Ascending' order");
	    		}
	    	}catch(Exception e) {
	    		fail(driver,"Unable to Validate the Sorting order of the cell values ");
	    	}
	    }else {
	    	fail(driver,"'Ascending' sort icon is not displayed in the Column Header after click on it '");
	    }
	    
	    mouseOverAndClick(driver, FirstHeader_PivotChart);
	    wait(driver,"1");
	    String afterSecondClickSort=getAttribute1(driver, FirstHeader_Sort, "ref");
	    if(afterSecondClickSort.equals("eSortDesc")) {
	    	pass(driver,"'Descending' sort icon is displayed in the Column Header after click on it '");
	    	try {
//	    		WebElement FirstCell=driver.findElement(By.xpath("//div[@id='RPE_Preview']//div[@aria-rowindex='2']//div[@aria-colindex='1' and @col-id='ag-Grid-AutoColumn']"));
//	    		String FirstText=FirstCell.getText();
//	    		WebElement SecondCell=driver.findElement(By.xpath("//div[@id='RPE_Preview']//div[@aria-rowindex='3']//div[@aria-colindex='1' and @col-id='ag-Grid-AutoColumn']"));
//	    		String SecondText=SecondCell.getText();
	    		String FirstText=getText1(driver, FirstCell).toLowerCase();
	    		String SecondText=getText1(driver, SecondCell).toLowerCase();

	    		if(SecondText.compareTo(FirstText)<0) {
	    			pass(driver,"Column Values Are updated in the 'Descending' order");
	    		}else {
	    			fail(driver,"Column Values Are not updated in the 'Descending' order");
	    		}
	    	}catch(Exception e) {
	    		fail(driver,"Unable to Validate the Sorting order of the cell values ");
	    	}
	    }else {
	    	fail(driver,"'Descending' sort icon is not displayed in the Column Header after click on it '");
	    }
	    
	    mouseOverAndClick(driver, FirstHeader_PivotChart);
	    wait(driver,"1");
	    String lastSortFirst=getAttribute1(driver, FirstHeader_Sort, "ref");
	    if(lastSortFirst.equals("eSortNone")) {
	    	pass(driver,"'SortNone' sort icon is displayed in the Column Header after click on it '");
	    }else {
	    	fail(driver,"'SortNone' sort icon is displayed in the Column Header after click on it '");
	    }
	  //Column Sorting order Validation Start
	    
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
	    
	  //Validating the Entire  Column highlighted when mouse over on Header cell
	    mouseOverToElement(driver, FirstHeader_PivotChart);
	    String FirstCellHighlight=getAttribute1(driver, FirstCell, "class");
	    String SecondCellHighlight=getAttribute1(driver, SecondCell, "class");

	    if(FirstCellHighlight.contains("hover") && SecondCellHighlight.contains("hover")) {
	    	pass(driver,"Entire Column gets highlighted when mouse hover on the Header cell in the Column");
	    }else {
	    	fail(driver,"Entire Column not gets highlighted when mouse hover on the Header cell in the Column");
	    }
	  //Validating the Entire  Column highlighted when mouse over on Header cell
	    
	    mouseOverToElement(driver, FirstHeader_PivotChart);
	    mouseOverAndClick(driver, FirstHeaderMenuOption);
	    waitForElement(driver, MenuList_Open);
	    waitForElement(driver,ResetColumnOption);
	    click(driver,ResetColumnOption);
	    if(!isDisplayed(driver, MenuList_Open)) {
			//pass(driver,"Column menu Options Closed after selecting the Reset Column Option");
		}else {
			fail(driver,"Column menu Options not Closed after selecting the Reset Column Option");
			Escape(driver);
		}
	    wait(driver,"1");
	    if(!isDisplayed2(driver,FirstHeader_PivotChart)) {
	    	pass(driver,"Chart Successfully Reset after click on Reset Columns");
	    }else {
	    	fail(driver,"Chart not Successfully Reset after click on Reset Columns");
	    }
	    
	    clear1(driver,SearchInput_Pivot);
	    wait(driver,"1");
	    sendKeys(driver,SearchInput_Pivot,SelectColumn_Drag_EmptyRowGroup);
	    wait(driver,"1");
	    WebElement firstSearchedColumn1=getWebElement(driver, FirstDrag);
	    WebElement ValuesElement1=getWebElement(driver, Row_Groups_text);
	    action.moveToElement(firstSearchedColumn1).build().perform();
	    action.clickAndHold(firstSearchedColumn1).moveToElement(ValuesElement1).build().perform();
	    action.release().build().perform();
	    
	    clear1(driver,SearchInput_Pivot);
	    wait(driver,"1");
	    sendKeys(driver,SearchInput_Pivot,SelectColumn_Drag_ExistingRowGroup);
	    wait(driver,"1");
	    firstSearchedColumn1=getWebElement(driver, FirstDrag);
	    ValuesElement1=getWebElement(driver, Values_Text);
	    action.moveToElement(firstSearchedColumn1).build().perform();
	    action.clickAndHold(firstSearchedColumn1).moveToElement(ValuesElement1).build().perform();
	    action.release().build().perform();
	    
	    clear1(driver,SearchInput_Pivot);
	    wait(driver,"1");
	    sendKeys(driver,SearchInput_Pivot,SelectColumn_Drag_MultipleColumn);
	    wait(driver,"1");
	    firstSearchedColumn1=getWebElement(driver, FirstDrag);
	    ValuesElement1=getWebElement(driver, ColumnLabels_Text);
	    action.moveToElement(firstSearchedColumn1).build().perform();
	    action.clickAndHold(firstSearchedColumn1).moveToElement(ValuesElement1).build().perform();
	    action.release().build().perform();
	    clear1(driver,SearchInput_Pivot);
 
	    
	    // ******************** ChartTitle Validation Start *******************
        String Pivot_ChartTitle= getCellValue("TestExecution","Testcase_Selection","Pivot_ChartTitle",Flag);
        if(Pivot_ChartTitle.equals("Yes")) {
         click3(driver,chartTitle);
       	 CHART_TITLE chartTitle=new CHART_TITLE();
            chartTitle.chartTitleTest(driver, TypeBackgroundColor1, TypeTextColor1, Change_FontFamily_ChartTitle, ChangeFontSize_ChartTitle,ChangeChartTitleName);       	
        }
       // ******************** ChartTitle Validation End *******************
      	
        // ******************** Table Format Validation Start *******************
        String Pivot_TableFormat= getCellValue("TestExecution","Testcase_Selection","Pivot_TableFormat",Flag);
        if(Pivot_TableFormat.equals("Yes")) {
        	
        	
        	 verifyElementDisplayed(driver, TableFormat_Sec);
 	       	 click(driver,TableFormat_Sec);
 	         wait(driver,"1");
 			 String TableFormatSecExpand=getAttribute1(driver,TableFormatExpand,"class");
 	    	 if(TableFormatSecExpand.contains("up")) {
 				pass(driver,"Table Format Section is expanded When Click on it");
 	    	 }else {
 	    	    fail(driver,"Table Format Section is not expanded When Click on it");
 	    	 }
 	    	 String TableFormateSec_Act=getTextColor(driver, TableFormat_Sec);
	    	// System.out.println("TableFormateSec_Act : "+TableFormateSec_Act);
			 if(TableFormatExpandColor.equalsIgnoreCase(TableFormateSec_Act)) {
				 pass(driver,"TableFormat is highlighted in blue color after expand it");
			 }else {
				 fail(driver,"TableFormat is not highlighted in blue color after expand it");
			 }
 	    	 
			 setTestCaseID("TC_PIVOT_TABLE_FORMAT_001");
 			 verifyElementDisplayed(driver, Table_Theme_Input);
 			 verifyElementDisplayed(driver, TableThemeText);
 			 if(isToggleAccessible(driver,Table_Theme_Input)) {
				 pass(driver,"Table theme input is Accessible");
			 }else {
				 fail(driver,"Table theme input is not Accessible");
			 }
			 
 			 
 			 String TableThemeAct="";
			 List<WebElement> ThemeResultValues=getWebElements(driver, Table_Theme_Results);
			 int tablethemesize=ThemeResultValues.size();
			 for(WebElement ThemeResultValue:ThemeResultValues) {
				 if(ThemeResultValue.isSelected()) {
					 
					 String SelectedClass=ThemeResultValue.getAttribute("value");
					// System.out.println("SelectedClassValue "+SelectedClass);
					 TableThemeAct=SelectedClass;
				 }
			 }
			 setTestCaseID("TC_PIVOT_TABLE_FORMAT_002");
			 //System.out.println("TableThemeAct : "+TableThemeAct);
			 if(TableThemeAct.equals("") ||TableThemeAct.equalsIgnoreCase("Default") ) {
				 pass(driver,"By default, Table theme value is selected as 'Default'");
			 }else {
				 fail(driver,"By default, Table theme value is not selected as 'Default'");
			 }
 			 
			 setTestCaseID("TC_PIVOT_TABLE_FORMAT_003");
			 mouseOverToElement(driver, Table_Theme_Input);
			 click(driver,Table_Theme_Input);
			 verifyElementIsPresent(driver, Table_Theme_Results);
			 
			 
			 if(tablethemesize==9) {
				 pass(driver,"All the table theme lists are present in the Table Theme dropdown ");
			 }else {
				 fail(driver,"Some table theme lists are present in the Table Theme dropdown ");
			 }
			 
			 setTestCaseID("TC_PIVOT_TABLE_FORMAT_005");
			 selectByText(driver,Table_Theme_Input,Select_TableTheme_Value);
			 wait(driver,"1");
			 String AfterSelectThemeValue="";
			 ThemeResultValues=getWebElements(driver, Table_Theme_Results);
			
			 for(WebElement ThemeResultValue:ThemeResultValues) {
				 if(ThemeResultValue.isSelected()) {
					 String SelectedClass=ThemeResultValue.getAttribute("value");
					 //System.out.println("SelectedClassValue "+SelectedClass);
					 AfterSelectThemeValue=SelectedClass;
				 }
				
			 }
			 try {
				 Select_TableTheme_Value=Select_TableTheme_Value.replace(" ", "");
			 }catch(Exception e) {
				 
			 }
//			 setTestCaseID("TC_PIVOT_TABLE_FORMAT_009");
			 Select_TableTheme_Value=Select_TableTheme_Value.toLowerCase();
			 if(AfterSelectThemeValue.contains(Select_TableTheme_Value)) {
				 pass(driver,"Selected Value '"+Select_TableTheme_Value+"' is updated in the Table Theme Input");
			 }else {
				 fail(driver,"Selected Value '"+Select_TableTheme_Value+"' is not updated in the Table Theme Input");
			 }
			 
//			 setTestCaseID("TC_PIVOT_TABLE_FORMAT_010");
			 scrollUsingElement(driver, ApplyButton);
			 click(driver, ApplyButton); //click Apply change
			 elementnotvisible1(driver, RPE_Loading);
			 String tableAppliedTheme=getAttribute1(driver, TableChart, "class");
			 if(tableAppliedTheme.contains(Select_TableTheme_Value)) {
				 pass(driver,"Selected theme value applied in the Chart");
			 }else {
				 fail(driver,"Selected theme value not applied in the Chart");
			 }
			 
			 setTestCaseID("TC_PIVOT_TABLE_FORMAT_007");
			 verifyElementDisplayed(driver, ODDEven_toggleTableFormat1);
			 verifyElementDisplayed(driver, OddEven_text_TableFormat);
			 
			 if(isToggleEnable(driver,OddEven_toggle_TableFormat)) {
				 pass(driver,"By default, 'Odd/Even Colors' input toggle is displayed as ON");
			 }else {
				 fail(driver,"By default, 'Odd/Even Colors' input toggle is displayed as ON");
			 }
			 
			 setTestCaseID("TC_PIVOT_TABLE_FORMAT_008");
			 String toggleONColor=getTextBackgroundColor(driver, ODDEven_toggleTableFormat1);
			 if(toggleONColor.equalsIgnoreCase("#2196F3")) {
				 pass(driver,"Toggle is displayed in blue color when it is ON condition");
			 }else {
				 fail(driver,"Toggle is not displayed in blue color when it is ON condition");
			 }
			 
			 //setTestCaseID("");
			 scrollUsingElement(driver, ApplyButton);
			 click(driver, ApplyButton); //click Apply change
			 elementnotvisible1(driver, RPE_Loading);
			 waitForElement(driver,Table_firstRow);
			 
			 String firstRowBackgroundColor=getTextBackgroundColor(driver, Table_firstRow);
			// System.out.println("firstRowBackgroundColor : "+ firstRowBackgroundColor);
			 String secondRowBackgroundColor=getTextBackgroundColor(driver, Table_SecondRow);
			// System.out.println("secondRowBackgroundColor : "+ secondRowBackgroundColor);
			 if(firstRowBackgroundColor.equalsIgnoreCase(secondRowBackgroundColor)) {
				 fail(driver,"Odd/Even Colors is not applied in the Table When the toggle is in 'ON' Condition");
			 }else {
				 pass(driver,"Odd/Even Colors is applied in the Table When the toggle is in 'ON' Condition");
			 }
			 
			 setTestCaseID("TC_PIVOT_TABLE_FORMAT_009");
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
			 firstRowBackgroundColor=getTextBackgroundColor(driver, Table_firstRow);
			 //System.out.println("firstRowBackgroundColor : "+ firstRowBackgroundColor);
			 secondRowBackgroundColor=getTextBackgroundColor(driver, Table_SecondRow);
			// System.out.println("secondRowBackgroundColor : "+ secondRowBackgroundColor);
			 if(firstRowBackgroundColor.equalsIgnoreCase(secondRowBackgroundColor)) {
				 pass(driver,"Odd/Even Colors is not applied in the Table When the toggle is in 'OFF' Condition");
			 }else {
				 fail(driver,"Odd/Even Colors is applied in the Table When the toggle is in 'OFF' Condition");
			 }
			 
			 setTestCaseID("-");
			 click(driver,ODDEven_toggleTableFormat1);
			 wait(driver,"1");
			 if(isToggleEnable(driver,OddEven_toggle_TableFormat)) {
				 pass(driver,"'Odd/Even Colors' input toggle is changed to 'ON' when again click on it");
			 }else {
				 fail(driver,"'Odd/Even Colors' input toggle is not changed to 'ON' when again click on it");
			 }
			 
			 setTestCaseID("-");
			 action.sendKeys(Keys.SPACE).build().perform();
			 wait(driver,"1");
			 if(!isToggleEnable(driver,OddEven_toggle_TableFormat)) {
				 pass(driver,"'Odd/Even Colors' input toggle Switched to OFF condition when click Space in the keyboard ");
			 }else {
				 fail(driver,"'Odd/Even Colors' input toggle not Switched to OFF condition when click Space in the keyboard ");
			 }
			 
			 action.sendKeys(Keys.SPACE).build().perform();
			 wait(driver,"1");
			 if(isToggleEnable(driver,OddEven_toggle_TableFormat)) {
				 pass(driver,"'Odd/Even Colors' input toggle Switched to ON condition when again click Space in the keyboard ");
			 }else {
				 fail(driver,"'Odd/Even Colors' input toggle not Switched to ON condition when again click Space in the keyboard ");
			 }
			 
			 setTestCaseID("TC_PIVOT_TABLE_FORMAT_010");
			 verifyElementDisplayed(driver, FontFamily_Input_TableFormat);
			 verifyElementDisplayed(driver, FontFamilyText_TableFormat);
			 if(isToggleAccessible(driver,FontFamily_Input_TableFormat)) {
				 pass(driver,"Font Family Input is Accessible");
			 }else {
				 fail(driver,"Font Family Input is not Accessible");
			 }
			 
		     String FontFamilyAct_TableFormat=getText1(driver,FontFamily_Input_TableFormat);
			 if(FontFamilyAct_TableFormat.equals(DefaultFontFamily_TableFormat)) {
				 pass(driver,"By default, '"+DefaultFontFamily_TableFormat+"' is selected in the Font Family input");
			 }else {
				 fail(driver,"By default, '"+DefaultFontFamily_TableFormat+"' is not selected in the Font Family input");
			 }
			 
			 setTestCaseID("TC_PIVOT_TABLE_FORMAT_011");
			 click(driver,FontFamily_Input_TableFormat);
			 if(isDisplayed(driver,FontFamilyExpand_TableFormat)) {
				pass(driver,"FontFamily dropdown is expanded with results after click on it");
			 }else {
				fail(driver,"FontFamily dropdown is not expanded with results after click on it");
			 }
			 
			 setTestCaseID("TC_PIVOT_TABLE_FORMAT_016");
			 click(driver,FontFamilyText_TableFormat);
			 wait(driver,"1");
			 if(isDisplayed2(driver, FontFamilyExpand_TableFormat)) {
				fail(driver,"FontFamily dropdown is not Closed when click outside of it");
			 }else {
				pass(driver,"FontFamily dropdown is Closed when click outside of it");
			 }
			 
			 click(driver,FontFamily_Input_TableFormat);
			 waitForElement(driver,FontFamilyExpand_TableFormat);
			 setTestCaseID("TC_PIVOT_TABLE_FORMAT_014");
			 ScrollBarValidation1(driver,FontFamilyExpand_TableFormat,"Font_family_");
			 setTestCaseID("TC_PIVOT_TABLE_FORMAT_012");
			 if(isDisplayed(driver,SearchInput_FontFamilyDropdown)) {
				pass(driver,"Search Input is present in the Fontfamily dropdown");
				click(driver,SearchInput_FontFamilyDropdown);
				sendKeys(driver,SearchInput_FontFamilyDropdown,Select_FontFamily_TableFormat);
				wait(driver,"1");
				String FirstFontFamilyResult=getText1(driver,FontFamilyResult1);
				if(FirstFontFamilyResult.equals(Select_FontFamily_TableFormat)) {
					pass(driver,"Seach functions works properly in the font family results");
				}else {
					fail(driver,"Seach functions not working properly in the font family results");
				}
				
			 }else {
				fail(driver,"Search Input is not present in the Fontfamily dropdown");
			 }
			
			 setTestCaseID("TC_PIVOT_TABLE_FORMAT_016");
			 String FirstFontFamilyResult=getText1(driver,FontFamilyResult1);
			 click(driver,FontFamilyResult1);
			 wait(driver,"1");
			 if(isDisplayed2(driver,FontFamilyExpand_TableFormat)) {
				fail(driver,"Font Family dropdown is not closed after selecting value");
			 }else {
				pass(driver,"Font Family dropdown is closed after selecting value");
			 }
				
			 setTestCaseID("TC_PIVOT_TABLE_FORMAT_015");
			 String FontFamilyResutValue=getText1(driver,FontFamily_Input_TableFormat);
			 if(FontFamilyResutValue.equals(Select_FontFamily_TableFormat)) {
				pass(driver,"Selected Font Family Value is updadted in the FontFamily Input");
			 }else {
				fail(driver,"Selected Font Family Value is not updated in the FontFamily Input");
			 }
				
			 //setTestCaseID("TC_PIVOT_TABLE_FORMAT_031");
			 scrollUsingElement(driver, ApplyButton);
			 wait(driver,"1");
			 click(driver, ApplyButton);
			 elementnotvisible1(driver, RPE_Loading);
			 waitForElement(driver,TableChart);
			 String FonFamilyApplied_Table=getFontFamily(driver,TableChart);
			 if(FonFamilyApplied_Table.equals(FontFamilyResutValue)) {
				pass(driver,"Selected Font Family is applied in the table chart");
			 }else {
				fail(driver,"Selected Font Family is not applied in the table chart");
			 }
			 
			 setTestCaseID("TC_PIVOT_TABLE_FORMAT_017");
			 verifyElementDisplayed(driver, FontSizeInput_TableFormat);
			 verifyElementDisplayed(driver, FontSizeText_TableFormat);
			 if(isToggleAccessible(driver,FontSizeInput_TableFormat)) {
				pass(driver,"Header Font Size input is Accessible");
			 }else {
				fail(driver,"Header Font Size input is not Accessible");
			 }
		 
			// setTestCaseID("TC_PIVOT_TABLE_FORMAT_034");
			 String defaultFontSizeHeader=getTextJavascript(driver, FontSizeInput_TableFormat);
			 System.out.println("defaultFontSizeHeader : "+defaultFontSizeHeader);
			 if(DefaultFontSize_TableFormat.equals(defaultFontSizeHeader)) {
				pass(driver,"Predefined fontsize value '"+DefaultFontSize_TableFormat+"' is updated by default in the Header Font Size input");
			 }else {
				fail(driver,"Predefined fontsize value '"+DefaultFontSize_TableFormat+"' is not updated by default in the Header Font Size input");
			 }
			 
			 
			 setTestCaseID("TC_PIVOT_TABLE_FORMAT_018");
			 click(driver,FontSizeInput_TableFormat);
			 List<WebElement> fonSizeResults=getWebElements(driver, FontSize__Results);
			 int fonSizeResultsCount=fonSizeResults.size();
			 if(fonSizeResultsCount==54) {
				pass(driver,"All the Font Size Values is present ");
			 }else {
				fail(driver,"Some Font Size Values is not present ");
			 }
			 
			 setTestCaseID("TC_PIVOT_TABLE_FORMAT_019");
			 click3(driver,FontSizeText_TableFormat);
			 System.out.println("Select_HeaderFontSize_TableFormat : "+Select_HeaderFontSize_TableFormat);
			 selectByText(driver,FontSizeInput_TableFormat,Select_HeaderFontSize_TableFormat);
			 wait(driver,"1");
			 
			 setTestCaseID("TC_PIVOT_TABLE_FORMAT_020");
			 String selectedFontSizeResult=getTextJavascript(driver, FontSizeInput_TableFormat);
			 System.out.println("selectedFontSizeResult : "+selectedFontSizeResult);
			 if(selectedFontSizeResult.equals(Select_HeaderFontSize_TableFormat)) {
				pass(driver,"Selected Font size value updated in the Header FontSize input");
			 }else {
				fail(driver,"Selected Font size value is not updated in the Header FontSize input");
			 }
			 
			 setTestCaseID("TC_PIVOT_TABLE_FORMAT_021");
			 scrollUsingElement(driver, ApplyButton);
			 wait(driver,"1");
			 click(driver, ApplyButton);
			 elementnotvisible1(driver, RPE_Loading);
			 waitForElement(driver,TableChart);
			 String AppliedFontSize_TableHeader=getFontSize(driver, TableHeaderRow);
			 if(AppliedFontSize_TableHeader.equals(Select_HeaderFontSize_TableFormat)) {
				pass(driver,"Selected Font Size is updated in the Header rows in the resulting Table");
			 }else {
				fail(driver,"Selected Font Size is not updated in the Header rows in the resulting Table");
			 }
			 
			 setTestCaseID("TC_PIVOT_TABLE_FORMAT_022");
			 verifyElementDisplayed(driver, HeaderColorInput_TableFormat);
			 verifyElementDisplayed(driver, HeaderColorText_TableFormat);
			 
			 if(isToggleAccessible(driver,HeaderColorInput_TableFormat)) {
				pass(driver,"Header Color input is Accessible");
			 }else {
				fail(driver,"Header Color input is not Accessible");
			 }
			 
			 setTestCaseID("TC_PIVOT_TABLE_FORMAT_024");
			 String defaultHeaderColorAct=getTextJavascript(driver,HeaderColorInput_TableFormat);
			 System.out.println("defaultHeaderColorAct : "+defaultHeaderColorAct);
			 if(DefaultHeaderColor_TableFormat.equalsIgnoreCase(defaultHeaderColorAct)) {
				pass(driver,"By default '"+DefaultHeaderColor_TableFormat+"' color is selected in the Header Color Input");
			 }else {
				fail(driver,"By default '"+DefaultHeaderColor_TableFormat+"' color is not selected in the Header Color Input");
			 }
			
			 setTestCaseID("TC_PIVOT_TABLE_FORMAT_023");
			 click(driver,HeaderColorInput_TableFormat);
			 if(isDisplayed(driver,ColorPickerOpen)) {
				pass(driver,"Color picker results opened after click on the Header Color Input");
				mouseOverToElement(driver, Color1);
				mouseOverToElement(driver, mouseOverColorHistory);
				mouseOverToElement(driver, Color1);
				String MouseHoveredColor=getText1(driver,mouseOverColorHistory);
				click(driver,Color1);
				wait(driver,"1");
				//setTestCaseID("TC_PIVOT_TABLE_FORMAT_046");
				if(isDisplayed2(driver,ColorPickerOpen)) {
					fail(driver,"Color picker is not closed after selcting the color");
				}else {
					pass(driver,"Color picker is closed after selecting the color");
				}
				
				String ColorInputValueAfter=getTextJavascript(driver,HeaderColorInput_TableFormat);
				if(ColorInputValueAfter.equalsIgnoreCase(MouseHoveredColor)) {
					pass(driver,"Selected Color Value is updated in the Header Color Input");
				}else {
					fail(driver,"Selected Color Value is not updated in the Header Color Input");
				}
				
				scrollUsingElement(driver, ApplyButton);
				click(driver, ApplyButton);
				elementnotvisible1(driver, RPE_Loading);
				String TableHeaderColor=getTextColor(driver, TableHeadingCell);
				if(TableHeaderColor.equalsIgnoreCase(MouseHoveredColor)) {
					pass(driver,"Selected Color Value is applied in Table Header value");
				}else {
					fail(driver,"Selected Color Value is not applied in Table Header value");
				}
				
			 }else {
				//setTestCaseID("TC_PIVOT_TABLE_FORMAT_044");
				fail(driver,"Color picker results not opened after click on the Header Color Input");
			 }
			
			 setTestCaseID("TC_PIVOT_TABLE_FORMAT_025");
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
	       
			 scrollUsingElement(driver, ApplyButton);
			 wait(driver,"1");
			 click(driver, ApplyButton);
			 elementnotvisible1(driver, RPE_Loading);
			 String Applied_Table_HeaderColor=getTextColor(driver, TableHeadingCell);
			 if(Applied_Table_HeaderColor.equalsIgnoreCase(ChangeHeaderColor_TableFormat)) {
				pass(driver,"Manually Entered Color Value is updated in the Table Header values");
			 }else {
				fail(driver,"Manually Entered Color Value is not updated in the Table Header values");
			 }
			 
			 setTestCaseID("TC_PIVOT_TABLE_FORMAT_026");
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
			 setTestCaseID("TC_PIVOT_TABLE_FORMAT_027");
			 clear1(driver,HeaderColorInput_TableFormat);
			 wait(driver,"1");
			 String AfterRevertColor=getTextJavascript(driver, HeaderColorInput_TableFormat);
			 if(AfterRevertColor.equalsIgnoreCase(DefaultHeaderColor_TableFormat)) {
				pass(driver,"Default color is displayed after revert the color value");
			 }else {
				fail(driver,"Default color is not displayed after revert the color value");
			 }
			 
			 setTestCaseID("TC_PIVOT_TABLE_FORMAT_028");
			 verifyElementDisplayed(driver, WrapHeaded_toggle_TableFormat);
			 verifyElementDisplayed(driver, WrapHeaders_Text_TableFormat);
			 
			 if(isToggleAccessible(driver,WrapHeaders_Input_TableFormat)) {
				 pass(driver,"Wrap Header input toggle is Accessible");
			 }else {
				 fail(driver,"Wrap Header input toggle is not Accessible");
			 }
			 
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
			 
			 setTestCaseID("TC_PIVOT_TABLE_FORMAT_029");
			 click(driver,WrapHeaded_toggle_TableFormat);
			 wait(driver,"1");
			 scrollUsingElement(driver, ApplyButton);
			 click(driver, ApplyButton);
			 elementnotvisible1(driver, RPE_Loading);
			 if(isToggleEnable(driver,WrapHeaders_Input_TableFormat)) {
				pass(driver,"Wrap header toggle is displayed in 'ON' After click on it");
				String TableHeaderWrapON_Act=getAttribute1(driver, TableHeadingCell, "class");
				if(TableHeaderWrapON_Act.contains("header-wrap-text")) {
					pass(driver,"Table Header values are wrapped when the toggle is in the ON Condition");
				}else {
					fail(driver,"Table Header values are not wrapped when the toggle is in the ON Condition");
				}
			 }else {
				fail(driver,"Wrap header toggle is not displayed in 'ON' After click on it");
			 }
			 
			 setTestCaseID("TC_PIVOT_TABLE_FORMAT_030");
			 click(driver,WrapHeaded_toggle_TableFormat);
			 wait(driver,"1");
			 scrollUsingElement(driver, ApplyButton);
			 click(driver, ApplyButton);
			 elementnotvisible1(driver, RPE_Loading);
			 if(isToggleEnable(driver,WrapHeaders_Input_TableFormat)) {
				fail(driver,"Wrap header toggle is not displayed in 'OFF' When again click on it");
			 }else {
				pass(driver,"Wrap header toggle is displayed in 'OFF' When again click on it");
			 }
			
			 setTestCaseID("TC_PIVOT_TABLE_FORMAT_031");
			 verifyElementDisplayed(driver, Hide_Agg_Heade_toggle);
			 verifyElementDisplayed(driver, Hide_Agg_Header_text);
			 
			 if(isToggleAccessible(driver,Hide_Agg_Header_inputToggle)) {
				pass(driver,"Hide Aggregation Header Input toggle is Accessible");
			 }else {
				fail(driver,"Hide Aggregation Header Input toggle is not Accessible");
			 }
			 
			 firstColumn_Values=getText1(driver,List_Values);
			 if(firstColumn_Values.contains("(")) {
		        int startIndex = firstColumn_Values.indexOf('(') + 1;
		        int endIndex = firstColumn_Values.indexOf(')');
		        firstColumn_Values = firstColumn_Values.substring(startIndex, endIndex);
		        System.out.println("firstColumn_Values : "+firstColumn_Values);
			 }
			 
			 //setTestCaseID("TC_PIVOT_TABLE_FORMAT_053");
			 if(isToggleEnable(driver,Hide_Agg_Header_inputToggle)) {
				fail(driver,"Hide Aggregation Header toggle is not displayed in 'OFF' by default");
			 }else {
				pass(driver,"Hide Aggregation Header toggle is displayed in 'OFF' by default");
				
				try {
					WebElement aggHeader=driver.findElement(By.xpath("//div[@id='RPE_Preview']//div [@col-id='"+firstColumn_Values+"']//div[@ref='eHeaderCompWrapper']//span[@ref='eText']"));
					String aggHeaderText=aggHeader.getText();
					if(aggHeaderText.contains("(")) {
						pass(driver,"Header text contains Aggregation when the Hide Aggregation Header toggle is 'OFF'");
					}else {
						fail(driver,"Header text not contains Aggregation when the Hide Aggregation Header toggle is 'OFF'");
					}
				}catch(Exception e) {
					
				}
			 }
			 
			 setTestCaseID("TC_PIVOT_TABLE_FORMAT_032");
			 click(driver,Hide_Agg_Heade_toggle);
			 wait(driver,"1");
			 scrollUsingElement(driver, ApplyButton);
			 click(driver, ApplyButton);
			 elementnotvisible1(driver, RPE_Loading);
			 if(isToggleEnable(driver,Hide_Agg_Header_inputToggle)) {
				pass(driver,"Hide Aggregation Header toggle  is displayed in 'ON' After click on it");
				try {
					WebElement aggHeader=driver.findElement(By.xpath("//div[@id='RPE_Preview']//div [@col-id='"+firstColumn_Values+"']//div[@ref='eHeaderCompWrapper']//span[@ref='eText']"));
					String aggHeaderText=aggHeader.getText();
					if(!aggHeaderText.contains("(")) {
						pass(driver,"Header text not contains Aggregation when the Hide Aggregation Header toggle is 'ON'");
					}else {
						fail(driver,"Header text contains Aggregation when the Hide Aggregation Header toggle is 'ON'");
					}
				}catch(Exception e) {
					
				}
				
				 setTestCaseID("TC_PIVOT_TABLE_FORMAT_033");
				String HideAggtoggleONColor=getTextBackgroundColor(driver, ODDEven_toggleTableFormat1);
				if(HideAggtoggleONColor.equalsIgnoreCase("#2196F3")) {
					 pass(driver,"Hide Aggregation Header Toggle is displayed in blue color when it is ON condition");
			 	}else {
					 fail(driver,"Hide Aggregation Header Toggle is not displayed in blue color when it is ON condition");
			 	}
				
			 }else {
				// setTestCaseID("TC_PIVOT_TABLE_FORMAT_056");
				fail(driver,"Hide Aggregation Header toggle is not displayed in 'ON' After click on it");
			 }
			 
			 setTestCaseID("-");
			 click(driver,Hide_Agg_Heade_toggle);
			 wait(driver,"1");
			 if(isToggleEnable(driver,Hide_Agg_Header_inputToggle)) {
				fail(driver,"Hide Aggregation Header toggle  is not changed to 'OFF' Again click on it"); 
			 }else {
				pass(driver,"Hide Aggregation Header toggle  is changed to 'OFF' Again click on it");  
			 }
			 
			 setTestCaseID("-");
			 action.sendKeys(Keys.SPACE).build().perform();
			 wait(driver,"1");
			 if(isToggleEnable(driver,Hide_Agg_Header_inputToggle)) {
				 pass(driver,"Hide Aggregation Header toggle Switched to ON condition when click Space in the keyboard ");
			 }else {
				 fail(driver,"Hide Aggregation Header toggle not Switched to ON condition when click Space in the keyboard ");
			 }
			 
			 action.sendKeys(Keys.SPACE).build().perform();
			 wait(driver,"1");
			 if(!isToggleEnable(driver,Hide_Agg_Header_inputToggle)) {
				 pass(driver,"Hide Aggregation Header toggle Switched to OFF condition when click Space in the keyboard ");
			 }else {
				 fail(driver,"Hide Aggregation Header toggle not Switched to OFF condition when click Space in the keyboard ");
			 }
			 
			 setTestCaseID("TC_PIVOT_TABLE_FORMAT_035");
			 verifyElementDisplayed(driver, BodyFontSize_Input_TableFormat);
			 verifyElementDisplayed(driver, BodyFontSize_text_TableFormat);
			 
			 if(isToggleAccessible(driver,BodyFontSize_Input_TableFormat)) {
				 pass(driver,"Body Font Size Input is Accessible");
			 }else {
				 fail(driver,"Body Font Size Input is not Accessible");
			 }
			 
			 setTestCaseID("TC_PIVOT_TABLE_FORMAT_034");
			 String defaultBodyFontSize_Act=getTextJavascript(driver,BodyFontSize_Input_TableFormat);
			 if(defaultBodyFontSize_Act.equals(DefaultBodyFontSize_TableFormat)) {
				pass(driver,"By defualt, '"+DefaultBodyFontSize_TableFormat+"' is displayed in the Body Font Size Input");
			 }else {
				fail(driver,"By default,'"+DefaultBodyFontSize_TableFormat+"' is not displayed in the Body Font Size Input");
			 }
			 
			 setTestCaseID("TC_PIVOT_TABLE_FORMAT_036");
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
			 
			 setTestCaseID("TC_PIVOT_TABLE_FORMAT_037");
			 click3(driver,BodyFontSize_text_TableFormat);
			 wait(driver,"1");
			 selectByText(driver,BodyFontSize_Input_TableFormat,Select_BodyFontSize_TableFormat);
			 wait(driver,"1");
			// setTestCaseID("TC_PIVOT_TABLE_FORMAT_068");
			 String selectedBodyFontSize=getTextJavascript(driver,BodyFontSize_Input_TableFormat);
			 if(selectedBodyFontSize.equals(Select_BodyFontSize_TableFormat)) {
				 pass(driver,"Selcted Font Size value updated in the Body Font Size Input");
			 }else {
				 fail(driver,"Selcted Font Size value not updated in the Body Font Size Input");
			 }
			
			 setTestCaseID("TC_PIVOT_TABLE_FORMAT_038");
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
			 
			 setTestCaseID("TC_PIVOT_TABLE_FORMAT_040");
			 verifyElementDisplayed(driver, PanelFontSize_Input);
			 verifyElementDisplayed(driver, PanelFontSize_Text);
			 
			 if(isToggleAccessible(driver,PanelFontSize_Input)) {
				 pass(driver,"Panel Font Size Input is Accessible");
			 }else {
				 fail(driver,"Panel Font Size Input is not Accessible");
			 }
			 
			 setTestCaseID("TC_PIVOT_TABLE_FORMAT_039");
			 String defaultPanelFontSize_Act=getTextJavascript(driver,PanelFontSize_Input);
			 if(defaultPanelFontSize_Act.equals(Default_PanelFontSize_TableFormat)) {
				pass(driver,"By defualt, '"+Default_PanelFontSize_TableFormat+"' is displayed in the Panel Font Size Input");
			 }else {
				fail(driver,"By default,'"+Default_PanelFontSize_TableFormat+"' is not displayed in the Panel Font Size Input");
			 }
			 
			 setTestCaseID("TC_PIVOT_TABLE_FORMAT_041");
			 click(driver,PanelFontSize_Input);
			 List<WebElement> PanelfonSizeResults=getWebElements(driver, PanelFontSize_InuptResults);
			 int PanelfonSizeResultsCount=PanelfonSizeResults.size();
			 String StartingPanelFontSizeValue=PanelfonSizeResults.get(1).getText();
			 //new modification
			 int EndPanelFontSizeValueNum=PanelfonSizeResults.size()-1;
			 String EndPanelFontSizeValue=PanelfonSizeResults.get(EndPanelFontSizeValueNum).getText();
			 //new modification
			
			 if(PanelfonSizeResultsCount==54&&StartingPanelFontSizeValue.equals("8")&&EndPanelFontSizeValue.equals("60")) {
				 pass(driver,"All the Font Size Values is present in the Panel Font Size Input ");
			 }else {
				 fail(driver,"Some Font Size Values is not present in the Panel Font Size Input ");
			 }
			
			 setTestCaseID("TC_PIVOT_TABLE_FORMAT_042");
			 click(driver,PanelFontSize_Text);
			 selectByText(driver,PanelFontSize_Input,Select_PanelFontSize_TableFormat);
			 wait(driver,"1");
			// setTestCaseID("TC_PIVOT_TABLE_FORMAT_075");
			 String selectedPanelFontSize=getTextJavascript(driver,PanelFontSize_Input);
			 if(selectedPanelFontSize.equals(Select_PanelFontSize_TableFormat)) {
				 pass(driver,"Selcted Font Size value '"+Select_PanelFontSize_TableFormat+"' updated in the Panel Font Size Input");
			 }else {
				 fail(driver,"Selcted Font Size value '"+Select_PanelFontSize_TableFormat+"' not updated in the Panel Font Size Input");
			 }
			
			 setTestCaseID("TC_PIVOT_TABLE_FORMAT_043");
			 scrollUsingElement(driver, ApplyButton);
			 click(driver, ApplyButton);
			 elementnotvisible1(driver, RPE_Loading);
			 waitForElement(driver,Pivot_Column_Panel);
			 String Applied_PanelFontSize=getFontSize(driver, Pivot_Column_Panel);
			 if(Applied_PanelFontSize.equals(Select_PanelFontSize_TableFormat)) {
				 pass(driver,"Selected Font Size '"+Select_PanelFontSize_TableFormat+"' value Applied in the Panle ");
			 }else {
				 fail(driver,"Selected Font Size '"+Select_PanelFontSize_TableFormat+"' value not Applied in the Panel, Act result: "+Applied_PanelFontSize);
			 }
			 
			 setTestCaseID("TC_PIVOT_TABLE_FORMAT_045");
			 verifyElementDisplayed(driver, BorderInput_TableFormat);
			 verifyElementDisplayed(driver, Border_text_TableFormat);
			 
			 if(isToggleAccessible(driver,BorderInput_TableFormat)) {
					pass(driver,"Border Input is Accessible");
			 }else {
				fail(driver,"Border Input is not Accessible");
			 }
		 
			 setTestCaseID("TC_PIVOT_TABLE_FORMAT_044");
			 String DefaultBorderType=defaultSelectedValue(driver,BorderInput_TableFormat);
			// System.out.println("DefaultBorderType : "+DefaultBorderType+"  , Exp : "+DefaultBorderType_TableFormat);
			 if(DefaultBorderType_TableFormat.equals(DefaultBorderType)) {
				pass(driver,"By default, '"+DefaultBorderType_TableFormat+"' is displayed in the Border Input Field");
			 }else {
				fail(driver,"By default, '"+DefaultBorderType_TableFormat+"' is not displayed in the Border Input Field");
			 }
			 
			 setTestCaseID("TC_PIVOT_TABLE_FORMAT_046");
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
			 
			setTestCaseID("TC_PIVOT_TABLE_FORMAT_047");
			click3(driver,Border_text_TableFormat);
			selectByText(driver,BorderInput_TableFormat,Select_Border_Value_TableFormat);
			wait(driver,"1");
			
			setTestCaseID("TC_PIVOT_TABLE_FORMAT_048");
			String selectedBorder=defaultSelectedValue(driver,BorderInput_TableFormat);
			System.out.println("selectedBorder : "+selectedBorder);
			if(selectedBorder.equals(Select_Border_Value_TableFormat)) {
				pass(driver,"Selcted Border value updated in the Border Input");
			}else {
				fail(driver,"Selcted Border value not updated in the Border Input");
			}
			
			//setTestCaseID("TC_PIVOT_TABLE_FORMAT_085");
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
			
			 setTestCaseID("TC_PIVOT_TABLE_FORMAT_049");
			 verifyElementDisplayed(driver, NegativeHighlight_toggle);
			 verifyElementDisplayed(driver, NegativeHighlight_text);

			 if(isToggleAccessible(driver,NegativeHighlight_Input)) {
				 pass(driver,"Negative Highlight Toggle is Accessible");
			 }else {
				 fail(driver,"Negative Highlight Toggle is not Accessible");
			 }
			 
			// setTestCaseID("TC_PIVOT_TABLE_FORMAT_0");
			 if(isToggleEnable(driver,NegativeHighlight_Input)) {
				fail(driver,"By default, Negaitve Highlight Toggle is not displayed in 'OFF' Condition");
			 }else {
				pass(driver,"By default, Negaitve Highlight Toggle is displayed in 'OFF' Condition");
			 }
			
			 setTestCaseID("TC_PIVOT_TABLE_FORMAT_050");
			 click(driver,NegativeHighlight_toggle);
			 wait(driver,"1");
			 if(isToggleEnable(driver,NegativeHighlight_Input)) {
				pass(driver,"Negaitve Highlight Toggle is displayed in 'ON' Condition when click on it");
				 String NegativetoggleONColor=getTextBackgroundColor(driver, NegativeHighlight_toggle);
				 setTestCaseID("TC_PIVOT_TABLE_FORMAT_051");
				 if(NegativetoggleONColor.equalsIgnoreCase("#2196F3")) {
					 pass(driver,"NegativeHighlight Toggle is displayed in blue color when it is ON condition");
				 }else {
					 fail(driver,"NegativeHighlight Toggle is not displayed in blue color when it is ON condition");
				 }
			 }else {
				fail(driver,"Negaitve Highlight Toggle is not displayed in 'ON' Condition when click on it");
			 }
			
			 setTestCaseID("TC_PIVOT_TABLE_FORMAT_052");
			 scrollUsingElement(driver, ApplyButton);
			 click(driver, ApplyButton);
			 elementnotvisible1(driver, RPE_Loading);
			 waitForElement(driver,ResultTableBody);
			 boolean negativecell=false;
			 String comp_id="";
			 
			 List<WebElement> resultTableCells=getWebElements(driver, TableCell);
			 for(WebElement resultTableCell:resultTableCells) {
				String ResultCellvalue=resultTableCell.getText();
				if(ResultCellvalue.startsWith("-")) {
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
			 setTestCaseID("-");
			 click(driver,NegativeHighlight_toggle);
			 if(isToggleEnable(driver,NegativeHighlight_Input)) {
				fail(driver,"Negaitve Highlight Toggle is not displayed in 'OFF' Condition when disabling it");
			 }else {
				pass(driver,"Negaitve Highlight Toggle is displayed in 'OFF' Condition when disabling it");
				scrollUsingElement(driver, ApplyButton);
				click(driver, ApplyButton);
				elementnotvisible1(driver, RPE_Loading);
				waitForElement(driver,ResultTableBody);
				if(isDisplayed2(driver,NegativeHighlightCell)) {
					fail(driver,"Some Cell values highlighed when Negaitve Highlight Toggle is in 'OFF' Condition");
				}else {
					pass(driver,"All Cell values are not highlighed when Negaitve Highlight Toggle is in 'OFF' Condition");
				}
			 }
			 
			  setTestCaseID("TC_PIVOT_TABLE_FORMAT_053");
			  verifyElementDisplayed(driver, AlignmentText_TableFormat);
			  verifyElementDisplayed(driver, Alignment_TableFormat);
				 
			  setTestCaseID("TC_PIVOT_TABLE_FORMAT_055");
			  click(driver,AlignmentLeft_TableFormat);
			  scrollUsingElement(driver, ApplyButton);
			  click(driver, ApplyButton);
			  elementnotvisible1(driver, RPE_Loading);
			  String SelectedAlignmentColorAct=getTextBackgroundColor(driver, AlignmentLeft_TableFormat);
			 // System.out.println("SelectedAlignmentColorAct : "+SelectedAlignmentColorAct);
			  if(AlignmentSelectedColor_TableFormat.equalsIgnoreCase(SelectedAlignmentColorAct)) {
				  pass(driver,"Left Alignment highlighted in grey color When click on it ");
			  }else {
				  fail(driver,"Left Alignment not highlighted in grey color When click on it ");
			  }
				
			  List<WebElement>AllCellElements=getWebElements(driver,TableCell);
			  boolean AllLeftAlignment=true;
			  String FailedLeftAllign="";
		//		System.out.println("Cells left-aligned Validation  : ***********");
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
			//System.out.println("Cells left-aligned  Validation end : ***********");
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
			  setTestCaseID("TC_PIVOT_TABLE_FORMAT_056");
			//  setTestCaseID("TC_PIVOT_TABLE_FORMAT_093");
			  verifyElementDisplayed(driver, Alignmentcenter_TableFormat);
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
			  
			  setTestCaseID("TC_PIVOT_TABLE_FORMAT_057");
			  verifyElementDisplayed(driver, AlignmentRight_TableFormat);

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
			  
			  //setTestCaseID("TC_PIVOT_TABLE_FORMAT_096");
//			  mouseOverAndClick(driver, FirstHeader_PivotChart);
//			  wait(driver,"1");
//			  AllCellElements=getWebElements(driver,TableCell);
//			  AllRightAlignment=true;
//			  FailedRightAllign="";
//			  System.out.println("Cells  Right-aligned Validation  : ***********");
//			  for (WebElement cell : AllCellElements) {
//				  String textAlign = cell.getCssValue("text-align");
//					
//				  if(!textAlign.contains("right")) {
//					  AllRightAlignment=false;
//					  String ColunName=cell.getAttribute("col-id");
//					  String cellResult=ColunName+" : "+cell.getText();
//					  System.out.print(cellResult+" ");
//					  FailedRightAllign=FailedRightAllign+", "+cellResult;
//				  }
//			  }
//			//	System.out.println("Cells  Right-aligned  Validation end : ***********");
//			  if(AllRightAlignment==false) {
//					fail(driver,"Some cell valuse are not aligned right when 'Right alignment' is selected  and sorting is performed: "+FailedRightAllign);
//			  }else {
//					pass(driver,"All the Cell Values are aligned right when 'Right alignment' is seleted and sorting is performed");
//			  }
			  
			  click(driver,AlignmentRight_TableFormat);
			  wait(driver,"1");
			  SelectedAlignmentColorAct=getTextBackgroundColor(driver, AlignmentRight_TableFormat);
			  if(AlignmentSelectedColor_TableFormat.equalsIgnoreCase(SelectedAlignmentColorAct)) {
				  fail(driver,"Right Alignment highlighted in grey color When deselect on it ");
			  }else {
				  pass(driver,"Right Alignment not highlighted in grey color When deselect on it ");
			  }
			
			 
			  setTestCaseID("TC_PIVOT_TABLE_FORMAT_058");
			  verifyElementDisplayed(driver, RowTotal_toggle_TableFormat);
			  verifyElementDisplayed(driver, RowTotal_text_TableFormat);
			  setTestCaseID("TC_PIVOT_TABLE_FORMAT_059");
			  if(isToggleEnable(driver,RowTotal_Input_TableFormat)) {
				  fail(driver,"Row Total Toggle is not displayed in 'OFF' Condition by default"); 
			  }else {
				  pass(driver,"Row Total Toggle is displayed in 'OFF' Condition by default");
			  }
			  setTestCaseID("TC_PIVOT_TABLE_FORMAT_060");
			  if(isToggleAccessible(driver, RowTotal_Input_TableFormat)) {
				  pass(driver,"Row Total toggle is accessible");
				  setTestCaseID("TC_PIVOT_TABLE_FORMAT_061");
				  click(driver,RowTotal_toggle_TableFormat);
				  wait(driver,"1");
				  if(isToggleEnable(driver,RowTotal_Input_TableFormat)) {
					  pass(driver,"Row Total Toggle is displayed in 'ON' Condition When enabling it");
				  }else {
					  fail(driver,"Row Total Toggle is not displayed in 'ON' Condition When enabling it");
				  }
				  setTestCaseID("TC_PIVOT_TABLE_FORMAT_062");
				  if(isToggleEnable(driver, GrandTotal_Input_Toggle)) {
					  pass(driver,"Grand total toggle is automatically 'ON' when Row Total Toggle is ON");
				  }else {
					  fail(driver,"Grand total toggle is not automatically 'ON' when Row Total Toggle is ON"); 
				  }
				  setTestCaseID("TC_PIVOT_TABLE_FORMAT_063");
				  scrollUsingElement(driver, ApplyButton);
				  wait(driver,"1");
				  click(driver, ApplyButton);
				  elementnotvisible1(driver, RPE_Loading);
				  waitForElement(driver,TableCell);
				  if(isDisplayed(driver,Grand_Total_Cell_Chart)) {
					  pass(driver,"Grand Total Column is displayed in the Chart when enable the toggle ");
				  }else {
					  fail(driver,"Grand Total Column is not displayed in the Chart when enable the toggle ");
				  }
				  
				  setTestCaseID("TC_PIVOT_TABLE_FORMAT_071");
				  verifyElementDisplayed(driver, HighlightGrandTotal_Input);
				  verifyElementDisplayed(driver, HighlightGrandTotal_Text);
				  
				  String DefaultGrandTotalColorAct=getTextJavascript(driver, HighlightGrandTotal_Input);
				  //System.out.println("DefaultRowTotalColorAct : "+DefaultRowTotalColorAct);
				  if(DefaultGrandTotalColor_TableFormat.equalsIgnoreCase(DefaultGrandTotalColorAct)) {
					  pass(driver,"By default, '"+DefaultGrandTotalColor_TableFormat+"' color is displayed in the Grand total color input");
				  }else {
					  fail(driver,"By default, '"+DefaultGrandTotalColor_TableFormat+"' color is not displayed in the Grand total color input");
				  }
				  
				  String TableAppliedGrantTotalColor=getTextBackgroundColor(driver, Grand_Total_Cell_Chart);
				  if(DefaultGrandTotalColor_TableFormat.equalsIgnoreCase(TableAppliedGrantTotalColor)) {
					  pass(driver,"By deafult, Grant Row total cells displayed with deafult selected color, Exp : "+DefaultGrandTotalColor_TableFormat+", Act : "+ TableAppliedGrantTotalColor);
				  }else {
					  fail(driver,"By deafult, Grant Row total cells not displayed with deafult selected color, Exp : "+DefaultGrandTotalColor_TableFormat+", Act : "+ TableAppliedGrantTotalColor);
				  }
				  
				  setTestCaseID("TC_PIVOT_TABLE_FORMAT_072");
				  click(driver,HighlightGrandTotal_Input);
				  if(isDisplayed(driver,ColorPickerOpen)) {
						pass(driver,"The color pickers opened promptly after clicking HighLight Grand RowTotal Input");
						mouseOverToElement(driver, Color1);
						String mouseOveredColorText=getText1(driver,mouseOverColorHistory);
						if(mouseOveredColorText!=null) {
							mouseOverToElement(driver, mouseOverColorHistory);
							wait(driver,"1");
							setTestCaseID("TC_PIVOT_TABLE_FORMAT_074");
							mouseOverToElement(driver, Color1);
							doubleClick(driver,mouseOverColorHistory);
							action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
					        doubleClick(driver,HighlightGrandTotal_Input);
					        wait(driver,"1");
					        action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
					        wait(driver,"1");
							String AfterCopyPasteColor=getTextJavascript(driver, HighlightGrandTotal_Input);
							System.out.println("AAfterCopyPasteColor : "+AfterCopyPasteColor);
							if(mouseOveredColorText.equals(AfterCopyPasteColor)) {
								pass(driver,"Copy paste color value works properly in Highlight Grand Row Toatal Input");
							}else {
								fail(driver,"Copy paste color value not working properly in Highlight Grand Row Toatal Input");
							}
							
						}else {
							fail(driver,"MouseOveredColor Value not displayed in the history");
						}
						
			        }else {
						fail(driver,"The color pickers not opened promptly after clicking HighLight RowTotal Input");
			        }
					
				    setTestCaseID("TC_PIVOT_TABLE_FORMAT_073");
				    click(driver,HighlightGrandTotal_Input);
				    waitForElement(driver,ColorPickerOpen);
				    mouseOverToElement(driver, Color1);
				    wait(driver,"1");
				    mouseOverAndClick(driver,Color1);
					wait(driver,"1");
					if(isDisplayed2(driver,ColorPickerOpen)){
						fail(driver,"Colorpicker not closed promptly After selecting the color");
					}else {
						pass(driver,"Colorpicker closed promptly After selecting the color");
					}
					
					String SelectedColorInput=getTextJavascript(driver, HighlightGrandTotal_Input);
					scrollUsingElement(driver, ApplyButton);
					wait(driver,"1");
					click(driver, ApplyButton);
					elementnotvisible1(driver, RPE_Loading);
					waitForElement(driver, Grand_Total_Cell_Chart);
				    TableAppliedGrantTotalColor=getTextBackgroundColor(driver, Grand_Total_Cell_Chart);
					if(TableAppliedGrantTotalColor.equalsIgnoreCase(SelectedColorInput)) {
						pass(driver,"Selected Color is applied in the Grand total Row cells");
					}else {
						fail(driver,"Selected Color is not applied in the Grand total Row cells");
					}
				  
					clear1(driver,HighlightGrandTotal_Input);
					wait(driver,"1");
					AfterRevertColor=getTextJavascript(driver, HighlightGrandTotal_Input);
					if(AfterRevertColor.equalsIgnoreCase(DefaultGrandTotalColor_TableFormat)) {
						pass(driver,"Default color is displayed after revert the color value");
						scrollUsingElement(driver, ApplyButton);
						wait(driver,"1");
						click(driver, ApplyButton);
						elementnotvisible1(driver, RPE_Loading);
						waitForElement(driver, Grand_Total_Cell_Chart);
					    TableAppliedGrantTotalColor=getTextBackgroundColor(driver, Grand_Total_Cell_Chart);
						if(TableAppliedGrantTotalColor.equalsIgnoreCase(DefaultGrandTotalColor_TableFormat)) {
							pass(driver,"Default color is applied in the Grand total Row cells after revert the color");
						}else {
							fail(driver,"Default color is not applied in the Grand total Row cells after revert the color");
						}
						
					}else {
						fail(driver,"Default color is not displayed after revert the color value");
					}
					
				  
				  setTestCaseID("TC_PIVOT_TABLE_FORMAT_068");
				  if(isToggleAccessible(driver, Valuewise_Input_Toggle)) {
					  fail(driver,"Values wise toggle is Accessible when Values column having only one value");
				  }else {
					  pass(driver,"Values wise toggle is not Accessible when Values column having only one value");
				  }
				  
				  clear1(driver,SearchInput_Pivot);
				  wait(driver,"1");
				  sendKeys(driver,SearchInput_Pivot,SelectColumn_Drag_ExistingValues);
				  wait(driver,"1");
				  firstSearchedColumn1=getWebElement(driver, FirstDrag);
				  ValuesElement1=getWebElement(driver, Values_Text);
				  action.moveToElement(firstSearchedColumn1).build().perform();
				  action.clickAndHold(firstSearchedColumn1).moveToElement(ValuesElement1).build().perform();
				  action.release().build().perform();
				  clear1(driver,SearchInput_Pivot);
			 
				  wait(driver,"1");
				  if(isToggleAccessible(driver, Valuewise_Input_Toggle)) {
					  pass(driver,"Values wise toggle is Accessible when Values column having more than one value");
				  }else {
					  fail(driver,"Values wise toggle is not Accessible when Values column having more than one value");
				  }
				  setTestCaseID("TC_PIVOT_TABLE_FORMAT_069");
				  click(driver,Valueswise_toggle);
				  wait(driver,"1");
				  if(isToggleEnable(driver, Valuewise_Input_Toggle)) {
					  pass(driver,"Values wise toggle is Enabled after click on it");
				  }else {
					  fail(driver,"Values wise toggle is not Enabled after click on it");
				  }
				  
				  setTestCaseID("TC_PIVOT_TABLE_FORMAT_070");
				  scrollUsingElement(driver, ApplyButton);
				  wait(driver,"1");
				  click(driver, ApplyButton);
				  elementnotvisible1(driver, RPE_Loading);
				  waitForElement(driver,TableCell);
				  if(isDisplayed(driver,HorizontalScroll2)) {
					  HorizontalScrollFull(driver,HorizontalScroll2);
				  }
				  if(isDisplayed(driver,ValuewiseTotal_Cell)) {
					  pass(driver,"Value wise total is applied in the chart when the toggle is 'ON' ");
				  }else {
					  fail(driver,"Value wise total is not applied in the chart when the toggle is 'ON' ");
				  }
				  
				  setTestCaseID("TC_PIVOT_TABLE_FORMAT_071");
				  verifyElementDisplayed(driver, Highlights_ValuewiseTotalInput);
				  verifyElementDisplayed(driver, Highlighs_ValuesTotalText);
				  
				  String DefaultValuesTotalColorAct=getTextJavascript(driver, Highlights_ValuewiseTotalInput);
				  //System.out.println("DefaultRowTotalColorAct : "+DefaultRowTotalColorAct);
				  if(DefaultGrandTotalColor_TableFormat.equalsIgnoreCase(DefaultValuesTotalColorAct)) {
					  pass(driver,"By default, '"+DefaultGrandTotalColor_TableFormat+"' color is displayed in the Value wise total color input");
				  }else {
					  fail(driver,"By default, '"+DefaultGrandTotalColor_TableFormat+"' color is not displayed in the Value wise total color input");
				  }
				  
				  String TableAppliedValueTotalColor=getTextBackgroundColor(driver, ValuewiseTotal_Cell);
				  if(DefaultGrandTotalColor_TableFormat.equalsIgnoreCase(TableAppliedValueTotalColor)) {
					  pass(driver,"By deafult, Values total cells displayed with deafult selected color, Exp : "+DefaultGrandTotalColor_TableFormat+", Act : "+ TableAppliedValueTotalColor);
				  }else {
					  fail(driver,"By deafult, Values total cells not displayed with deafult selected color, Exp : "+DefaultGrandTotalColor_TableFormat+", Act : "+ TableAppliedValueTotalColor);
				  }
				  
				  setTestCaseID("TC_PIVOT_TABLE_FORMAT_072");
				  click(driver,Highlights_ValuewiseTotalInput);
				  if(isDisplayed(driver,ColorPickerOpen)) {
						pass(driver,"The color pickers opened promptly after clicking HighLight Values Total Input");
						mouseOverToElement(driver, Color1);
						String mouseOveredColorText=getText1(driver,mouseOverColorHistory);
						if(mouseOveredColorText!=null) {
							mouseOverToElement(driver, mouseOverColorHistory);
							wait(driver,"1");
							setTestCaseID("TC_PIVOT_TABLE_FORMAT_073");
							mouseOverToElement(driver, Color1);
							doubleClick(driver,mouseOverColorHistory);
							action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
					        doubleClick(driver,Highlights_ValuewiseTotalInput);
					        wait(driver,"1");
					        action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
					        wait(driver,"1");
							String AfterCopyPasteColor=getTextJavascript(driver, Highlights_ValuewiseTotalInput);
							System.out.println("AAfterCopyPasteColor : "+AfterCopyPasteColor);
							if(mouseOveredColorText.equals(AfterCopyPasteColor)) {
								pass(driver,"Copy paste color value works properly in Highlight Values Total Input");
							}else {
								fail(driver,"Copy paste color value not working properly in Highlight Values Total Input");
							}
							
						}else {
							fail(driver,"MouseOveredColor Value not displayed in the history");
						}
						
			        }else {
						fail(driver,"The color pickers not opened promptly after clicking Highlight Values Total Input");
			        }
					
//				    click(driver,HighlightGrandTotal_Text);
//				    wait(driver,"1");
				  setTestCaseID("TC_PIVOT_TABLE_FORMAT_074");
				    click(driver,Highlights_ValuewiseTotalInput);
				    waitForElement(driver,ColorPickerOpen);
				    mouseOverToElement(driver, Color1);
				    wait(driver,"1");
				    mouseOverAndClick(driver,Color1);
					wait(driver,"1");
					if(isDisplayed2(driver,ColorPickerOpen)){
						fail(driver,"Colorpicker not closed promptly After selecting the color");
					}else {
						pass(driver,"Colorpicker closed promptly After selecting the color");
					}
					
					String SelectedColorInput1=getTextJavascript(driver, Highlights_ValuewiseTotalInput);
					scrollUsingElement(driver, ApplyButton);
					wait(driver,"1");
					click(driver, ApplyButton);
					elementnotvisible1(driver, RPE_Loading);
					if(isDisplayed(driver,HorizontalScroll2)) {
						  HorizontalScrollFull(driver,HorizontalScroll2);
					}
					waitForElement(driver, ValuewiseTotal_Cell);
				    TableAppliedGrantTotalColor=getTextBackgroundColor(driver, ValuewiseTotal_Cell);
					if(TableAppliedGrantTotalColor.equalsIgnoreCase(SelectedColorInput1)) {
						pass(driver,"Selected Color is applied in the Values total cells");
					}else {
						fail(driver,"Selected Color is not applied in the Values total cells");
					}
				  
					clear1(driver,Highlights_ValuewiseTotalInput);
					wait(driver,"1");
					AfterRevertColor=getTextJavascript(driver, Highlights_ValuewiseTotalInput);
					if(AfterRevertColor.equalsIgnoreCase(DefaultGrandTotalColor_TableFormat)) {
						pass(driver,"Default color is displayed after revert the color value in the Values total input");
						scrollUsingElement(driver, ApplyButton);
						wait(driver,"1");
						click(driver, ApplyButton);
						elementnotvisible1(driver, RPE_Loading);
						if(isDisplayed(driver,HorizontalScroll2)) {
							  HorizontalScrollFull(driver,HorizontalScroll2);
						}
						waitForElement(driver, ValuewiseTotal_Cell);
					    TableAppliedGrantTotalColor=getTextBackgroundColor(driver, ValuewiseTotal_Cell);
						if(TableAppliedGrantTotalColor.equalsIgnoreCase(DefaultGrandTotalColor_TableFormat)) {
							pass(driver,"Default color is applied in the Values total cells after revert the color");
						}else {
							fail(driver,"Default color is not applied in the Values total cells after revert the color");
						}
						
					}else {
						fail(driver,"Default color is not displayed after revert the color value in the Values total input");
					}
				  
				  click(driver,Valueswise_toggle);
				  wait(driver,"1");
				  if(isToggleEnable(driver, Valuewise_Input_Toggle)) {
					  fail(driver,"Values wise toggle is not changed to 'OFF' again click on it");
				  }else {
					  pass(driver,"Values wise toggle is changed to 'OFF' again click on it");
				  }
				  
				  scrollUsingElement(driver, ApplyButton);
				  wait(driver,"1");
				  click(driver, ApplyButton);
				  elementnotvisible1(driver, RPE_Loading);
				  waitForElement(driver,TableCell);
				  if(isDisplayed(driver,HorizontalScroll2)) {
					  HorizontalScrollFull(driver,HorizontalScroll2);
				  }
				  if(isDisplayed(driver,ValuewiseTotal_Cell)) {
					  fail(driver,"Value wise total is not removed in the chart when disable the toggle");
				  }else {
					  pass(driver,"Value wise total is removed in the chart when disable the toggle");
				  }
				  
				  
			  }else {
				  fail(driver,"Row Total toggle is not accessible");
			  }
			  
			  setTestCaseID("TC_PIVOT_TABLE_FORMAT_065");
			  verifyElementDisplayed(driver, ColumnTotal_toggle_TableFormat);
			  verifyElementDisplayed(driver, ColumnTotal_text_TableFormat);
			  
			  if(isToggleAccessible(driver, ColumnTotal_Input_TableFormat)) {
				  pass(driver,"Column Total Input is Accessible");
			  }else {
				  fail(driver,"Column Total Input is not Accessible");
			  }
			  
			  //setTestCaseID("TC_PIVOT_TABLE_FORMAT_066");
			  if(isToggleEnable(driver,ColumnTotal_Input_TableFormat)) {
				  fail(driver,"Column Total Toggle is not displayed in 'OFF' Condition by default");
			  }else {
				  pass(driver,"Column Total Toggle is displayed in 'OFF' Condition by default");
			  }
			  
			  setTestCaseID("TC_PIVOT_TABLE_FORMAT_066");
			  click(driver,ColumnTotal_toggle_TableFormat);
			  wait(driver,"1");
			  if(isToggleEnable(driver,ColumnTotal_Input_TableFormat)) {
				  pass(driver,"Column Total Toggle is displayed in 'ON' Condition When enabling it");
			  }else {
				  fail(driver,"Column Total Toggle is not displayed in 'ON' Condition When enabling it");
			  }
			  setTestCaseID("TC_PIVOT_TABLE_FORMAT_067");
			  scrollUsingElement(driver, ApplyButton);
			  click(driver, ApplyButton);
			  elementnotvisible1(driver, RPE_Loading);
			  waitForElement(driver, TableCell);
			  
			  if(isDisplayed(driver,GrandTotalColumns)) {
				  pass(driver,"Column total is displayed in the chart when the toggle is 'ON' condition");
			  }else {
				  fail(driver,"Column total is not displayed in the chart when the toggle is 'ON' condition");
			  }
			  
			  setTestCaseID("TC_PIVOT_TABLE_FORMAT_071");
			  verifyElementDisplayed(driver, HighlightColumnTotal_Input);
			  verifyElementDisplayed(driver, HighlightColumnTotal_Text);
			  
			  String DefaultColumnTotalColorAct=getTextJavascript(driver, HighlightColumnTotal_Input);
			  //System.out.println("DefaultRowTotalColorAct : "+DefaultRowTotalColorAct);
			  if(DefaultGrandTotalColor_TableFormat.equalsIgnoreCase(DefaultColumnTotalColorAct)) {
				  pass(driver,"By default, '"+DefaultGrandTotalColor_TableFormat+"' color is displayed in the Column total color input");
			  }else {
				  fail(driver,"By default, '"+DefaultGrandTotalColor_TableFormat+"' color is not displayed in the Column total color input");
			  }
			  
			  String TableAppliedColumnTotalColor=getTextBackgroundColor(driver, GrandTotalColumns);
			  if(DefaultGrandTotalColor_TableFormat.equalsIgnoreCase(TableAppliedColumnTotalColor)) {
				  pass(driver,"By deafult, Column total cells displayed with deafult selected color, Exp : "+DefaultGrandTotalColor_TableFormat+", Act : "+ TableAppliedColumnTotalColor);
			  }else {
				  fail(driver,"By deafult, Column total cells not displayed with deafult selected color, Exp : "+DefaultGrandTotalColor_TableFormat+", Act : "+ TableAppliedColumnTotalColor);
			  }
			  
			  setTestCaseID("TC_PIVOT_TABLE_FORMAT_072");
			  click(driver,HighlightColumnTotal_Input);
			  if(isDisplayed(driver,ColorPickerOpen)) {
					pass(driver,"The color pickers opened promptly after clicking HighLight Column Total Input");
					mouseOverToElement(driver, Color1);
					String mouseOveredColorText=getText1(driver,mouseOverColorHistory);
					if(mouseOveredColorText!=null) {
						mouseOverToElement(driver, mouseOverColorHistory);
						wait(driver,"1");
						setTestCaseID("TC_PIVOT_TABLE_FORMAT_073");
						mouseOverToElement(driver, Color1);
						doubleClick(driver,mouseOverColorHistory);
						action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
				        doubleClick(driver,HighlightColumnTotal_Input);
				        wait(driver,"1");
				        action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
				        wait(driver,"1");
						String AfterCopyPasteColor=getTextJavascript(driver, HighlightColumnTotal_Input);
						System.out.println("AAfterCopyPasteColor : "+AfterCopyPasteColor);
						if(mouseOveredColorText.equals(AfterCopyPasteColor)) {
							pass(driver,"Copy paste color value works properly in Highlight Column Total Input");
						}else {
							fail(driver,"Copy paste color value not working properly in Highlight Column Total Input");
						}
						
					}else {
						fail(driver,"MouseOveredColor Value not displayed in the history");
					}
					
		        }else {
					fail(driver,"The color pickers not opened promptly after clicking Highlight Column Total Input");
		        }
			    setTestCaseID("TC_PIVOT_TABLE_FORMAT_074");
//			    click(driver,HighlightColumnTotal_Text);
//			    wait(driver,"1");
			    click(driver,HighlightColumnTotal_Input);
			    waitForElement(driver,ColorPickerOpen);
			    mouseOverToElement(driver, Color1);
			    wait(driver,"1");
			    mouseOverAndClick(driver,Color1);
				wait(driver,"1");
				if(isDisplayed2(driver,ColorPickerOpen)){
					fail(driver,"Colorpicker not closed promptly After selecting the color");
				}else {
					pass(driver,"Colorpicker closed promptly After selecting the color");
				}
				
				String SelectedColorInput1=getTextJavascript(driver, HighlightColumnTotal_Input);
				scrollUsingElement(driver, ApplyButton);
				wait(driver,"1");
				click(driver, ApplyButton);
				elementnotvisible1(driver, RPE_Loading);
//				if(isDisplayed(driver,HorizontalScroll2)) {
//					  HorizontalScrollFull(driver,HorizontalScroll2);
//				}
				waitForElement(driver, GrandTotalColumns);
			    TableAppliedColumnTotalColor=getTextBackgroundColor(driver, GrandTotalColumns);
				if(TableAppliedColumnTotalColor.equalsIgnoreCase(SelectedColorInput1)) {
					pass(driver,"Selected Color is applied in the Column total cells");
				}else {
					fail(driver,"Selected Color is not applied in the Column total cells");
				}
			  
				clear1(driver,HighlightColumnTotal_Input);
				wait(driver,"1");
				AfterRevertColor=getTextJavascript(driver, HighlightColumnTotal_Input);
				if(AfterRevertColor.equalsIgnoreCase(DefaultGrandTotalColor_TableFormat)) {
					pass(driver,"Default color is displayed after revert the color value in the Column total input");
					scrollUsingElement(driver, ApplyButton);
					wait(driver,"1");
					click(driver, ApplyButton);
					elementnotvisible1(driver, RPE_Loading);
//					if(isDisplayed(driver,HorizontalScroll2)) {
//						  HorizontalScrollFull(driver,HorizontalScroll2);
//					}
					waitForElement(driver, GrandTotalColumns);
				    TableAppliedColumnTotalColor=getTextBackgroundColor(driver, GrandTotalColumns);
					if(TableAppliedColumnTotalColor.equalsIgnoreCase(DefaultGrandTotalColor_TableFormat)) {
						pass(driver,"Default color is applied in the Column total cells after revert the color");
					}else {
						fail(driver,"Default color is not applied in the Column total cells after revert the color");
					}
					
				}else {
					fail(driver,"Default color is not displayed after revert the color value in the Column total input");
				}
				
				
			  click(driver,ColumnTotal_toggle_TableFormat);
			  wait(driver,"1");
			  if(isToggleEnable(driver,ColumnTotal_Input_TableFormat)) {
				  fail(driver,"Column Total Toggle is not displayed in 'OFF' Condition When disabling it");
			  }else {
				  pass(driver,"Column Total Toggle is displayed in 'OFF' Condition When disabling it");
			  }
			  
			  scrollUsingElement(driver, ApplyButton);
			  click(driver, ApplyButton);
			  elementnotvisible1(driver, RPE_Loading);
			  waitForElement(driver, TableCell);
			  
			  if(isDisplayed(driver,GrandTotalColumns)) {
				  fail(driver,"Column total is displayed in the chart when the toggle is 'OFF' condition");
			  }else {
				  pass(driver,"Column total is not displayed in the chart when the toggle is 'OFF' condition");
			  }
			  
			  setTestCaseID("TC_PIVOT_TABLE_FORMAT_076");
			  verifyElementDisplayed(driver, ExpandedRowGroup_Toggle);
			  verifyElementDisplayed(driver, ExpandedRowGroup_text);
			  
			  clear1(driver,SearchInput_Pivot);
			  wait(driver,"1");
			  sendKeys(driver,SearchInput_Pivot,SelectColumn_Drag_ExistingValues);
			  wait(driver,"1");
			  firstSearchedColumn1=getWebElement(driver, FirstDrag);
			  ValuesElement1=getWebElement(driver, Row_Groups_text);
			  action.moveToElement(firstSearchedColumn1).build().perform();
			  action.clickAndHold(firstSearchedColumn1).moveToElement(ValuesElement1).build().perform();
			  action.release().build().perform();
			  setTestCaseID("TC_PIVOT_TABLE_FORMAT_077");
			  if(isToggleEnable(driver, ExpandedRowGroup_Input_Toggle)) {
				  pass(driver,"By default, Expand Row Group toggle is enabled");
			  }else {
				  fail(driver,"By default, Expand Row Group toggle is not enabled");
			  }
			  
			  scrollUsingElement(driver, ApplyButton);
			  wait(driver,"1");
			  click(driver, ApplyButton);
			  elementnotvisible1(driver, RPE_Loading);
			  waitForElement(driver,Table_firstRow);
			
			  String RowExpand=getAttribute1(driver, Table_firstRow, "aria-expanded");
			  
			  if(RowExpand.equals("true")) {
				  pass(driver,"Row group value is expanded in the chart while the toggle is 'ON' Condition");
			  }else {
				  fail(driver,"Row group value is not expanded in the chart while the toggle is 'ON' Condition");
			  }
			  setTestCaseID("TC_PIVOT_TABLE_FORMAT_080");
			  verifyElementDisplayed(driver, CollapseRowGroup_toggle);
			  verifyElementDisplayed(driver, CollapseRowGroup_Text);
			  if(isToggleEnable(driver, CollapseRowGroup_Input_toggle)) {
				  fail(driver,"Collapse Row Group Toggle is enabled by default when the Expand row group toggle is enabled");
			  }else{
				  pass(driver,"Collapse Row Group Toggle is disabled by default when the Expand row group toggle is enabled");
			  }
			  setTestCaseID("TC_PIVOT_TABLE_FORMAT_081");
			  click(driver,ExpandedRowGroup_Toggle);
			  wait(driver,"1");
			  if(!isToggleEnable(driver, ExpandedRowGroup_Input_Toggle)) {
				  pass(driver,"Expand Row Group toggle is disabled when click on it");
			  }else {
				  fail(driver,"Expand Row Group toggle is not disabled when click on it");
			  }
			  setTestCaseID("TC_PIVOT_TABLE_FORMAT_082");
			  if(isToggleEnable(driver, CollapseRowGroup_Input_toggle)) {
				  pass(driver,"Collapse Row Group Toggle is enabled automatically when disable the Expand row group toggle");
			  }else{
				  fail(driver,"Collapse Row Group Toggle is not enabled automatically when disable the Expand row group toggle");
			  }
			  
			  scrollUsingElement(driver, ApplyButton);
			  wait(driver,"1");
			  click(driver, ApplyButton);
			  elementnotvisible1(driver, RPE_Loading);
			  waitForElement(driver,Table_firstRow);
			  
			  String RowExpandAfter=getAttribute1(driver, Table_firstRow, "aria-expanded");
			  
			  if(RowExpandAfter.equals("false")) {
				  pass(driver,"Row group value is collapsed in the chart while the Collapse toggle is 'ON' Condition");
			  }else {
				  fail(driver,"Row group value is not collapsed in the chart while the Collapse toggle is 'ON' Condition");
			  }
			  
			  setTestCaseID("TC_PIVOT_TABLE_FORMAT_083");
			  verifyElementDisplayed(driver, ExpandColumnGroup_toggle);
			  verifyElementDisplayed(driver, ExpandColumnGroup_Text);
			  if(!isToggleEnable(driver, ExpandColumnGroup_Input_toggle)) {
				  pass(driver,"By default, Expand Column Group toggle is disabled");
			  }else{
				  fail(driver,"By default, Expand Column Group toggle is not disabled");
			  }
			  
			  if(isDisplayed(driver,CancelButton_Values)) {
				  mouseOverAndClick(driver, CancelButton_Values);
			  }
			  clear1(driver,SearchInput_Pivot);
			  wait(driver,"1");
			  sendKeys(driver,SearchInput_Pivot,SelectColumn_Drag_EmptyColumnLabels);
			  wait(driver,"1");
			  firstSearchedColumn1=getWebElement(driver, FirstDrag);
			  ValuesElement1=getWebElement(driver, ColumnLabels_Text);
			  action.moveToElement(firstSearchedColumn1).build().perform();
			  action.clickAndHold(firstSearchedColumn1).moveToElement(ValuesElement1).build().perform();
			  action.release().build().perform();
			  
			  scrollUsingElement(driver, ApplyButton);
			  wait(driver,"1");
			  click(driver, ApplyButton);
			  elementnotvisible1(driver, RPE_Loading);
			  waitForElement(driver,ColumnHeaderExpand);
			  setTestCaseID("TC_PIVOT_TABLE_FORMAT_084");
			  String ColumnCellExpand=getAttribute1(driver, ColumnHeaderExpand, "aria-expanded");
			  if(ColumnCellExpand.equals("false")) {
				  pass(driver,"Column group value not expanded when the Expand column toggle is disabled ");
			  }else {
				  fail(driver,"Column group value is expanded when the Expand column toggle is disabled ");
			  }
			  
			  setTestCaseID("TC_PIVOT_TABLE_FORMAT_085");
			  click(driver,ExpandColumnGroup_toggle);
			  wait(driver,"1");
			  if(isToggleEnable(driver, ExpandColumnGroup_Input_toggle)) {
				  pass(driver,"Expand Column Group toggle is enabled when click on it");
			  }else{
				  fail(driver,"Expand Column Group toggle is not enabled when click on it");
			  }
			  
			  setTestCaseID("TC_PIVOT_TABLE_FORMAT_086");
			  scrollUsingElement(driver, ApplyButton);
			  wait(driver,"1");
			  click(driver, ApplyButton);
			  elementnotvisible1(driver, RPE_Loading);
			  waitForElement(driver,ColumnHeaderExpand);
			  ColumnCellExpand=getAttribute1(driver, ColumnHeaderExpand, "aria-expanded");
			  if(ColumnCellExpand.equals("true")) {
				  pass(driver,"Column group value expanded when the Expand column toggle is enabled ");
			  }else {
				  fail(driver,"Column group value is not expanded when the Expand column toggle is enabled ");
			  }
			  
			  setTestCaseID("TC_PIVOT_TABLE_FORMAT_087");
			  verifyElementDisplayed(driver, CollapseColumnGroup_toggle);
			  verifyElementDisplayed(driver, CollapseColumnGroup_Text);
			  if(!isToggleEnable(driver, CollapseColumnGroup_Input_toggle)) {
				  pass(driver,"Collapse Column Group toggle is disabled when the Expand column toggle is enabled");
			  }else{
				  fail(driver,"Collapse Column Group toggle is not disabled when the Expand column toggle is enabled");
			  }
			  
			  setTestCaseID("TC_PIVOT_TABLE_FORMAT_088");
			  click(driver,CollapseColumnGroup_toggle);
			  wait(driver,"1");
			  if(isToggleEnable(driver, CollapseColumnGroup_Input_toggle)) {
				  pass(driver,"Collapse Column Group toggle is enabled when click on it");
			  }else{
				  fail(driver,"Collapse Column Group toggle is not enabled when click on it");
			  }
			  
			  setTestCaseID("TC_PIVOT_TABLE_FORMAT_090");
			  if(!isToggleEnable(driver, ExpandColumnGroup_Input_toggle)) {
				  pass(driver,"Expand Column Group toggle is disabled automatically when enable the Collapse Column Group toggle");
			  }else{
				  fail(driver,"Expand Column Group toggle is not disabled automatically when enable the Collapse Column Group toggle");
			  }
			  setTestCaseID("TC_PIVOT_TABLE_FORMAT_089");
			  scrollUsingElement(driver, ApplyButton);
			  wait(driver,"1");
			  click(driver, ApplyButton);
			  elementnotvisible1(driver, RPE_Loading);
			  waitForElement(driver,ColumnHeaderExpand);
			  ColumnCellExpand=getAttribute1(driver, ColumnHeaderExpand, "aria-expanded");
			  if(ColumnCellExpand.equals("false")) {
				  pass(driver,"Column group value collapsed when the Collapse column toggle is enabled ");
			  }else {
				  fail(driver,"Column group value is not collapsed when the Collapse column toggle is enabled ");
			  }
			  
			  //sepearator
			  mouseOverAndClick(driver, SelectAll_pivotColumn);
			  wait(driver,"1");
			  mouseOverAndClick(driver, SelectAll_pivotColumn);
			  wait(driver,"1");
			  mouseOverAndClick(driver, SelectAll_pivotColumn);
			  wait(driver,"1");
			  setTestCaseID("TC_PIVOT_TABLE_FORMAT_091");
			  verifyElementIsPresent(driver, SeperatorInput_TableFormat);
			  String defaultSeperatorSelect=defaultSelectedValue(driver, SeperatorInput_TableFormat);
			 // System.out.println("defaultSeperatorSelect : "+defaultSeperatorSelect);
			  if(defaultSeperatorSelect.equals("")||defaultSeperatorSelect.equals(DefaultSeperator_TableFormat)) {
					pass(driver,"By default, 'Select' is displayed in the seperater input");
			  }else {
					fail(driver,"By default, 'Select' is not displayed in the seperater input");
			  }
				
			  setTestCaseID("TC_PIVOT_TABLE_FORMAT_092");
			  click(driver,SeperatorInput_TableFormat);
			  verifyElementIsPresent(driver, SeparatorOption1);
			  verifyElementIsPresent(driver, SeperatorOption2);
		        
			  setTestCaseID("TC_PIVOT_TABLE_FORMAT_093");
			  selectByText(driver, SeperatorInput_TableFormat, Change_Seperator_Option);
			  wait(driver,"1");
			  String AfterSelectSeperatorValue=getTextJavascript(driver, SeperatorInput_TableFormat);
			  System.out.println("AfterSelectSeperatorValue : "+AfterSelectSeperatorValue);
			  if(AfterSelectSeperatorValue.equals(Change_Seperator_Option)) {
			    	pass(driver,"Selected seperator value is correctly displayed in the Seperator Input");
			  }else {
			    	fail(driver,"Selected seperator value is not correctly displayed in the Seperator Input");
			  }
			    
			  setTestCaseID("TC_PIVOT_TABLE_FORMAT_094");
			  if(isDisplayed(driver,SeperatorSelectedColumnBox)) {
					pass(driver,"Seperator Selected Column box is displayed after selecting the seperator value");
			  }else {
					fail(driver,"Seperator Selected Column box is displayed after selecting the seperator value");
			  }
			  
			  if(isDisplayed(driver,SelectAllOption_Seperator)) {
					pass(driver,"Select All Checkbox is displayed after selecting the seperter value");
					if(!isElementSelected(driver,SelectAllCheckBox_Seperator)) {
						pass(driver,"By default Select All checkbox is not selected");
						if(isDisplayed2(driver,AppliedSeperatorColoumn)) {
							fail(driver,"Column Names displayed in the seperator selected column when the 'Select All checkbox' is not selected");
						}else {
							pass(driver,"Column Names not displayed in the seperator selected column when the 'Select All checkbox' is not selected");
						}
						
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
							setTestCaseID("TC_PIVOT_TABLE_FORMAT_097");
					        click(driver,SelectAllCheckBox_Seperator);
					        wait(driver,"1");
					        if(isDisplayed2(driver,AppliedSeperatorColoumn)) {
								fail(driver,"Column Names displayed in the seperator selected column After deSelecting 'Select All checkbox' ");
							}else {
								pass(driver,"Column Names not displayed in the seperator selected column After deSelecting 'Select All checkbox' ");
								setTestCaseID("TC_PIVOT_TABLE_FORMAT_096");
								click(driver,SeperatorSelectedColumnBox);
								sendKeys(driver,SearchSeperatorColumnInput,Select_Seperator_Column);
								WebElement searchedColumn=driver.findElement(By.xpath("//li//div[@title='"+Select_Seperator_Column+"']"));
								searchedColumn.click();
								wait(driver,"1");
								String SelectedSeperatorColumnName=getAttribute1(driver, AppliedSeperatorColoumn, "data-value");
								if(SelectedSeperatorColumnName.equals(Select_Seperator_Column)) {
									pass(driver,"Selected Column Name updated in the Seperator column input box");
									scrollUsingElement(driver, ApplyButton);
									wait(driver,"1");
									click(driver, ApplyButton);
									elementnotvisible1(driver, RPE_Loading);
									waitForElement(driver,TableCell);
									List<WebElement> AllCellElements2=driver.findElements(By.xpath("//div[@id='RPE_Preview']//div[contains(@col-id,'"+Select_Seperator_Column+"') and @role='gridcell']"));
									
									Pattern numericalPattern1 = Pattern.compile("^(\\d{1,3}(,\\d{3})*|\\d{1,2}(,\\d{2}){2,})(\\.\\d+)?$");
									Pattern  datePattern = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");
							        
							        boolean seperatorCheck2=true;
							        String FailResultSeperator2="";
							        
							        for (WebElement cell : AllCellElements2) {
							            String cellText = cell.getText();
			                            String Col_ID=cell.getAttribute("col-id");
			                            int Explength=5;
							            if(cellText.contains(".")) {
							            	Explength=10;
							            }
							            if (datePattern.matcher(cellText).matches() || cellText.equals("") || cellText.isEmpty()) {
							                continue;
							            } else if (numericalPattern1.matcher(cellText).matches()&& cellText.length()>=Explength) {
							            	
							            	String cellFormat=SeperatorValidationTable(cellText);
							            	
							            	if(!cellFormat.equals(Change_Seperator_Option)) {
							            		seperatorCheck2=false;
							            		FailResultSeperator2=FailResultSeperator2+" || Column : "+Col_ID+", cellValue : "+cellText;
							            	}
							            	
							            } 
							        }
							        
							        if(seperatorCheck2==true) {
							        	pass(driver,"Seperator correctly applied in all the cell values..");
							        }else {
					            		fail(driver,"Seperator not correctly applied in this cell : "+FailResultSeperator2);
							        }
							        
											
								}else {
									fail(driver,"Selected Column Name not updated in the Seperator column input box");
								}
								
							}
//							SeperatorValidationTable
							
						}else {
							fail(driver,"'Select All checkbox' in the seperator is not selected after clicking it");
						}
						
					}else {
						fail(driver,"By default Select All checkbox is selected");
					}
				}else {
					fail(driver,"Select All Checkbox is not displayed after selecting the seperter value");
				}
			    
				wait(driver,"1");
				selectByText(driver, SeperatorInput_TableFormat, DefaultSeperator_TableFormat);
				wait(driver,"1");
				click(driver, ApplyButton);
				elementnotvisible1(driver, RPE_Loading);
				waitForElement(driver,TableCell);

				
				//roundOff
				setTestCaseID("TC_PIVOT_TABLE_FORMAT_098");
				verifyElementIsPresent(driver, RoundOffInput_TableFormat);
				String defaultRoundOffSelect=defaultSelectedValue(driver, RoundOffInput_TableFormat);
				System.out.println("defaultRoundOffSelect : "+defaultRoundOffSelect);
				if(defaultRoundOffSelect.equals("")||defaultRoundOffSelect.equals(DefaultRoundOff_TableFormat)) {
					pass(driver,"By default, 'Select' is displayed in the RoundOff input");
				}else {
					fail(driver,"By default, 'Select' is not displayed in the RoundOff input");
				}
				
				setTestCaseID("TC_PIVOT_TABLE_FORMAT_099");
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
				
				setTestCaseID("TC_PIVOT_TABLE_FORMAT_100");
				selectByText(driver, RoundOffInput_TableFormat, Change_RoundOff_Option);
			    wait(driver,"1");
			    String AfterSelectRoundOffValue=getTextJavascript(driver, RoundOffInput_TableFormat);
			    System.out.println("AfterSelectRoundOffValue : "+AfterSelectRoundOffValue);
			    if(AfterSelectRoundOffValue.equals(Change_RoundOff_Option)) {
			    	pass(driver,"Selected RoundOff value is correctly displayed in the RoundOff Input");
			    }else {
			    	fail(driver,"Selected RoundOff value is not correctly displayed in the RoundOff Input, Exp : "+Change_RoundOff_Option+" Act : "+AfterSelectRoundOffValue);
			    }
			    setTestCaseID("TC_PIVOT_TABLE_FORMAT_101");
			    if(isDisplayed(driver,RoundOffSelectColumnBox)) {
					pass(driver,"RoundOff Selected Column box is displayed after selecting the RoundOff value");
				}else {
					fail(driver,"RoundOff Selected Column box is displayed after selecting the RoundOff value");
				}
			    
			    if(isDisplayed(driver,SelectAllCheckbox_RoundOff)) {
			    	pass(driver,"Select All Checkbox is displayed after selecting the RoundOff value");
			    	setTestCaseID("TC_PIVOT_TABLE_FORMAT_102");
			    	if(!isElementSelected(driver,SelectAllCheckbox_RoundOff)) {
			    		pass(driver,"By default Select All checkbox is not selected in RoundOff");
						if(isDisplayed2(driver,AppliedRoundOffColumns)) {
							fail(driver,"Column Names displayed in the RoundOff selected column when the 'Select All checkbox' is not selected");
						}else {
							pass(driver,"Column Names not displayed in the RoundOff selected column when the 'Select All checkbox' is not selected");
						}
			    		
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
						setTestCaseID("TC_PIVOT_TABLE_FORMAT_103");
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
							            if (datePattern.matcher(cellText).matches() || cellText.equals("") || cellText.isEmpty() || cellText.equals("0")) {
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
								//fail(driver,"RoundOff not correctly Applied in this cell : "+FailResultRoundOff1);
							}
	                       
						setTestCaseID("TC_PIVOT_TABLE_FORMAT_104");
						click(driver,SelectAllCheckbox_RoundOff);
				        wait(driver,"1");
				        if(isDisplayed2(driver,AppliedRoundOffColumns)) {
							fail(driver,"Column Names displayed in the RoundOff selected column After deSelecting 'Select All checkbox' ");
						}else {
							pass(driver,"Column Names not displayed in the RoundOff selected column After deSelecting 'Select All checkbox' ");
							scrollUsingElement(driver, ApplyButton);
							wait(driver,"1");
							click(driver, ApplyButton);
							elementnotvisible1(driver, RPE_Loading);
							click(driver,RoundOffSelectColumnBox);
							sendKeys(driver,SearchRoundOffColumnInput,Select_RoundOff_Column);
							WebElement searchedColumn=driver.findElement(By.xpath("//li//div[@title='"+Select_RoundOff_Column+"']"));
							searchedColumn.click();
							wait(driver,"1");
							String SelectedRoundOffColumnName=getAttribute1(driver, AppliedRoundOffColumns, "data-value");
							if(SelectedRoundOffColumnName.equals(Select_RoundOff_Column)) {
								
								pass(driver,"Selected Column Name updated in the RoundOff column input box");
								scrollUsingElement(driver, ApplyButton);
								wait(driver,"1");
								click(driver, ApplyButton);
								elementnotvisible1(driver, RPE_Loading);
								waitForElement(driver,TableCell);
								List<WebElement> AllCellElements2=driver.findElements(By.xpath("//div[@id='RPE_Preview']//div[@col-id='"+Select_RoundOff_Column+"' and @role='gridcell']"));
								
								Pattern numericalPattern1 = Pattern.compile("^(\\d{1,3}(,\\d{3})*|\\d{1,2}(,\\d{2}){2,})(\\.\\d+)?$");
						        Pattern datePattern = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");
								
						        boolean RoundOffCheck2=true;
						        String FailResultRoundOff2="";
						        
								for (WebElement cell : AllCellElements2) {
						            String cellText = cell.getText();
		                            String Col_ID=cell.getAttribute("col-id");
						            if (datePattern.matcher(cellText).matches() || cellText.equals("") || cellText.isEmpty()|| cellText.equals("0")) {
						                continue;
						            } else if (numericalPattern1.matcher(cellText).matches()) {
						            	
						            	int CellRoundOffValueNum=getRoundOffValue(cellText);
						            	String CellRoundOffValue=String.valueOf(CellRoundOffValueNum);
						            	
						            	if(!CellRoundOffValue.equals(Change_RoundOff_Option)) {
						            		RoundOffCheck2=false;
						            		FailResultRoundOff2=FailResultRoundOff2+" || Column : "+Col_ID+", cellValue : "+cellText;
						            	}
						            	
						            }
						        }
								
									if(RoundOffCheck2==true) {
										pass(driver,"RoundOff correctly Applied for all the cells");
									}else {
										fail(driver,"RoundOff not correctly Applied in this cell : "+RoundOffCheck2);
									}
									
									
								}else {
									fail(driver,"Selected Column Name not updated in the RoundOff column input box");
								}
								
							}
						
						}else {
							fail(driver,"'Select All checkbox' in the RoundOff is not selected after clicking it");
						}
			    	}else {
			    		fail(driver,"By default Select All checkbox is selected in RoundOff");
			    	}
			    }else {
			    	fail(driver,"Select All Checkbox is not displayed after selecting the RoundOff value");
			    }
				
				
				
			  
			 setTestCaseID(" ");
			 
        }
       // ******************** Table Format Validation End *******************
      	
        
        
	    click(driver,ChartTitleInput);
 		clear(driver,ChartTitleInput);
       	sendKeys(driver,ChartTitleInput,ChangeChartTitleName);
       	waitForElement(driver, SaveBtn_Chart);
       	click(driver,SaveBtn_Chart);
       	elementnotvisible1(driver, RPE_Loading);
       	if(!isDisplayed2(driver,chartSaveError1) && isDisplayed(driver,SavedChartTitleInput)) {
       		pass(driver,"Chart Saved Successfully");
       	}else {
       		fail(driver,"Chart not Saved Successfully");
       	}	
	    
	}
	
}
