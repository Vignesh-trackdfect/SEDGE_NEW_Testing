package individualScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import commonMethods.Keywords;
import commonMethods.Utils;

public class STATISTICS_SMOKE_TESTING extends Keywords{

	public void statisticsTest(WebDriver driver,int iteration ) {
		
		Actions action=new Actions(driver);
		String ExpressionHistoryBtnEnable=Utils.getDataFromTestData("SmokeTesting_UI", "ExpHistoryBtnColorEnabel");
		String TargetValue=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input", "TargetValue");
		String FunctionSearchName=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input", "FunctionSearchName");
		String ColumnNameInput_Smoke_131=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input", "ColumnNameInput_Smoke_131");
		
		waitForElement(driver,Statistics_icon);
		click(driver,Statistics_icon);
		if(isDisplayed(driver,targetNotSelectError)) {
			mouseOverToElement(driver,Preview);
		    wait(driver,"1");
			waitForElement(driver,Sampling_option);
	        click(driver,Sampling_option);
	        elementnotvisible(driver,Loading);
	        waitForElement(driver,target);
	        click(driver,target);
	        selectTarget(driver,TargetValue);
	        wait(driver,"2");
	        if(isDisplayed(driver,target_Succes)) {
            	pass(driver,"\"Target added successfully\" popup displayed after selecting the target");
        	}else {
        		fail(driver,"\"Target added successfully\" popup not displayed after selecting the target");
        	}
	        
	        mouseOverToElement(driver, Statistics_icon);
	        click(driver,Statistics_icon);
	        
		}
     	 
		if(isDisplayed1(driver,statistics_page)) {
    		   pass(driver,"Statistics is accessible after selecting target");
    		   if(isDisplayed(driver, NumericalTab)) {
    			   pass(driver,"Numerical top functions opened");
    			   verifyElementIsPresent1(driver, absIcon);
    			   verifyElementIsPresent1(driver, CeilIcon);
    			   verifyElementIsPresent1(driver, FloorIcon);
    			   verifyElementIsPresent1(driver, UnitConverterIcon);
    			   verifyElementIsPresent1(driver, NumHexIcon);
    			   verifyElementIsPresent1(driver, RoundIcon);
    			   verifyElementIsPresent1(driver, NumCatIcon);
    			   verifyElementIsPresent1(driver, ExtractNumIcon);
    		   }else {
    			   fail(driver,"Numerical top functions not opened");
    		   }
    		   
    		   	verifyElementIsPresent1(driver, statisticsTestHead);
    		    verifyElementIsPresent1(driver, SelectAllCheckbox);
    		    verifyElementIsPresent1(driver, FullScreenInStatistics);
    		    verifyElementIsPresent1(driver, HideIgnoredIcon);
    		    String HiddenIconStatus=getAttribute1(driver, HideIgnoredIcon, "aria-checked");
             if(HiddenIconStatus.equals("false")) {  
        		   passReport(driver,"'Hidden ignored columns toggle' should get disabled by default","'Hidden ignored columns toggle' disabled by default"); 
             }else {
       		   failReport(driver,"'Hidden ignored columns toggle' should get disabled by default","'Hidden ignored columns toggle' enabled by default"); 
             }
             
             click(driver,HideIgnoredIcon);
             wait(driver,"1");
             HiddenIconStatus=getAttribute1(driver, HideIgnoredIcon, "aria-checked");
             if(HiddenIconStatus.equals("true")) { 
             	passReport(driver,"'Hidden ignored columns toggle' should get enable after click on it","'Hidden ignored columns toggle' enabled after click on it"); 
             }else {
             	failReport(driver,"'Hidden ignored columns toggle' should get enable after click on it","'Hidden ignored columns toggle' not enabled after click on it");                 	
             }
    		    
		   if(isDisplayed(driver,statisticsSection)) {
			   pass(driver,"statistics Section is displayed in Statistics page after clicking Statistics");
			   ScrollBarValidation1(driver, statisticsSection, "statisticsSection");
			   
			   List<WebElement> Header_statitics=getWebElements(driver, Headers_statistics);
			   List<WebElement> Sorting_statitics=getWebElements(driver, Sorting_Statistics);
			   int sortCount=0;
			   int headCount=0;
			   for(WebElement head:Header_statitics) {
				   try {
					   action.moveToElement(head).build().perform();
					   if(head.isDisplayed()) {
						   headCount++;
					   }
				   }catch(Exception e) {
					   
				   }
			   }
			   
			   for(WebElement sort:Sorting_statitics) {
				   try {
					   action.moveToElement(sort).build().perform();
					   if(sort.isDisplayed()) {
						   sortCount++;
					   }
				   }catch(Exception e) {
					   
				   }
			   }
			   
			   mouseOverToElement(driver, Headers_statistics);
			   if(headCount==sortCount) {
				   pass(driver,"Header Row Sort icon validation passed in the Statistics section");
			   }else {
				   fail(driver,"Header Row Sort icon validation failed in the Statistics section");
			   }

     	   }else {
     		   fail(driver,"statistics Section is not displayed in Statistics page after clicking Statistics");
     	   }
    		   
//     	   if(isDisplayed(driver,DataTableSection)) {
//     		   verifyElementIsPresent1(driver, DataTableText);
//     		   pass(driver,"DataTable Section is displayed in Statistics page after clicking Statistics");
//     		   
//     		   if(isDisplayed(driver, Sorting_Factors)) {
//     			   pass(driver,"Sorting Icon displayed for the 'Factors' heading in the Data Table Section");
//     		   }else {
//     			   fail(driver,"Sorting Icon not displayed for the 'Factors' heading in the Data Table Section");
//     		   }
//     		   
// 	   	   }else {
//     	   		fail(driver,"DataTable Section is not displayed in Statistics page after clicking Statistics");
// 	   	   }
     	   
     	   if(isDisplayed(driver,GraphSheetScetion)) {
     		   verifyElementIsPresent1(driver, GraphSheetHeading);
     		   verifyElementIsPresent1(driver, Transformations);
     		   verifyElementIsPresent1(driver, PreviewSectionHead);   
     		   pass(driver,"GraphSheet Section is displayed in Statistics page after clicking Statistics");
 	   	   }else {
     	   		fail(driver,"GraphSheet Section is not displayed in Statistics page after clicking Statistics");
 	   	   }
     	   
     	   if(isDisplayed(driver,variableImportSect)) {
     		   pass(driver,"'variable of Importance' section is displayed in Statistics page after clicking Statistics");
     		   verifyElementIsPresent1(driver, variableImportance);
 	   	   }else {
     	   		fail(driver,"'variable of Importance' section is not displayed in Statistics page after clicking Statistics");
 	   	   }
     	   
     	   
            String fourthValue=getText1(driver,fourthColumnValue);
   		    if(verifyElementIsPresent1(driver, SearchBarStatistics)) {
   		    	sendKeys(driver,SearchBarStatistics,fourthValue);
   		    	String firstDisplayedValue=getText1(driver,firstColumnValue);
   		    	System.out.println("firstDisplayedValue : "+firstDisplayedValue);
   		    	System.out.println("fourthValue : "+fourthValue);
   		    	if(fourthValue.equals(firstDisplayedValue)) {
   		    		pass(driver,"Searched bar worked statistics section");
   		    	}else {
   		    		fail(driver,"Searched bar not worked statistics section");
   		    	}
   		    	clear1(driver, SearchBarStatistics);
   		    }
   		    
   		    if(isDisplayed2(driver,CategoricalType)) {
   		    	click(driver,CategoricalType);
   		    	elementnotvisible(driver, Loading);
   		    	String selectedColumn=getText1(driver,CategoricalType);
   		    	if(isDisplayed(driver,DataTableSection)) {
   		    		String dataTabelValue=getText1(driver,DataLabelValue).trim();
   		    		System.out.println("dataTabelValue : "+dataTabelValue);

   		    		if(isDisplayed(driver,deleteDataLabel)) {
   		    			pass(driver,"Delete button in Data Label displayed for Categorical Value");
   		    		}else {
   		    			fail(driver,"Delete button in Data Label not displayed for Categorical Value");
   		    		}
   		    		if(isDisplayed(driver,mergeSelectRow)) {
   		    			pass(driver,"Merge Select row in Data Label displayed for Categorical Value");
   		    		}else {
   		    			fail(driver,"Merge Select row in Data Label not displayed for Categorical Value");
   		    		}
   		    		if(isDisplayed(driver,mergeUnSelect)) {
   		    			pass(driver,"Merge Unselect row in Data Label displayed for Categorical Value");
   		    		}else {
   		    			fail(driver,"Merge Unselect row in Data Label not displayed for Categorical Value");
   		    		}
   		    		if(isDisplayed(driver,clearRows)) {
   		    			pass(driver,"Clear rows in Data Label displayed for Categorical Value");
   		    		}else {
   		    			fail(driver,"Clear rows in Data Label not displayed for Categorical Value");
   		    		}
   		    		if(isDisplayed(driver,fullScreenData)) {
   		    			pass(driver,"Full Screen in DataLabel displayed for Categorical Value");
   		    		}else {
   		    			fail(driver,"Full Screen in DataLabel not displayed for Categorical Value");
   		    		}
   		    		
   		    		if(dataTabelValue.equals(selectedColumn)) {
   		    			pass(driver,"Data Label opened with selected categorical value");
   		    		}else {
   		    			fail(driver,"Data Label opened with different categorical value");
   		    		}
   		    		ScrollBarValidation1(driver, DataTableSection, "DataLabel Section");
   		    	}else {
   		    		fail(driver,"Data Label not opened while selecting the categorical value");
   		    	}
   		    	if(isDisplayed(driver,GraphSheetScetion)) {
   		    		if(isDisplayed(driver,graph)) {
   		    			String graphValue=getText1(driver,GraphSectionValue).trim();
       		    		System.out.println("graphValue : "+graphValue);
       		    		if(isDisplayed(driver,ChartContextGrpah)) {
       		    			pass(driver,"Chart Context Menu in Graph section displayed for categorical value");
       		    		}else {
       		    			fail(driver,"Chart Context Menu in Graph section not displayed for categorical value");
       		    		}
       		    		if(graphValue.equals(selectedColumn)) {
       		    			pass(driver,"Graph opened with selected categorical value");
       		    		}else {
       		    			fail(driver,"Graph opened with different categorical value");
       		    		}
   		    		}else {
   		    			fail(driver,"Graph not loaded...");
   		    		}
   		    		
   		    	}else {
   		    		fail(driver,"Graphsheet section not opened while selecting the categorical value");
   		    	}
   		    	
   		    	if(isDisplayed(driver,variableImportSect)) {
		    			pass(driver,"Variable of importance opened while selecting the categorical value");
		    			if(isDisplayed(driver,ChartContextVariable)) {
   		    			pass(driver,"Chart Context Menu in Variable section displayed for categorical value");
   		    		}else {
   		    			fail(driver,"Chart Context Menu in Variable section not displayed for categorical value");
   		    		}
		    			verifyElementIsPresent1(driver, variableImportance);
   		    	}else {
   		    		fail(driver,"Variable of importance not opened while selecting the categorical value");
   		    	}
   		    }
   		    
   		  if(isDisplayed2(driver,DateType)) {
   			click(driver,DateType);
   			elementnotvisible(driver, Loading);
		    	String selectedColumnDate=getText1(driver,DateType);
		    	if(isDisplayed(driver,DataTableSection)) {
		    		String dataTabelValue2=getText1(driver,DataLabelValue).trim();
		    		System.out.println("dataTabelValue2 : "+dataTabelValue2);
		    		
		    		if(isDisplayed(driver,deleteDataLabel)) {
		    			pass(driver,"Delete button in Data Label displayed for Date Value");
		    		}else {
		    			fail(driver,"Delete button in Data Label not displayed for Date Value");
		    		}
		    		if(isDisplayed(driver,mergeSelectRow)) {
		    			pass(driver,"Merge Select row in Data Label displayed for Date Value");
		    		}else {
		    			fail(driver,"Merge Select row in Data Label not displayed for Date Value");
		    		}
		    		if(isDisplayed(driver,mergeUnSelect)) {
		    			pass(driver,"Merge Unselect row in Data Label displayed for Date Value");
		    		}else {
		    			fail(driver,"Merge Unselect row in Data Label not displayed for Date Value");
		    		}
		    		if(isDisplayed(driver,clearRows)) {
		    			pass(driver,"Clear rows in Data Label displayed for Date Value");
		    		}else {
		    			fail(driver,"Clear rows in Data Label not displayed for Date Value");
		    		}
		    		if(isDisplayed(driver,fullScreenData)) {
		    			pass(driver,"Full Screen in DataLabel displayed for Date Value");
		    		}else {
		    			fail(driver,"Full Screen in DataLabel not displayed for Date Value");
		    		}
		    
		    		if(dataTabelValue2.equals(selectedColumnDate)) {
		    			pass(driver,"Data Label opened with selected Date value");
		    		}else {
		    			fail(driver,"Data Label opened with different Date value");
		    		}
		    		
		    		if(isDisplayed(driver,Pagination)) {
		    			pass(driver,"Pagination is displayed");
		    			String currentPage=getText1(driver,Currentpage);
		    			if(currentPage.contains("1")) {
		    				pass(driver,"By default first page selected in pagination");
		    			}else {
		    				fail(driver,"By default "+currentPage+" page selected in pagination");
		    			}
		    			List<WebElement> pageList=getWebElements(driver, PaginationLists);
		    			int pageSizeAct=pageList.size();
		    			if(pageSizeAct>5) {
		    				elementScreenShot_new(driver,DataTableSection,"/Expected_screenshot/SmokeTesting/dataLabelSec");
		    				click(driver,nextPage);
		    				String currentPageAct=getText1(driver,Currentpage);
		    				if(currentPageAct.equals(currentPage)) {
		    					pass(driver,"Page changed after clicking next page button");
		    				}else {
		    					fail(driver,"Page not changed after clicking next page button");
		    				}
		    				elementScreenShot_new(driver,DataTableSection,"/Actual_screenshot/SmokeTesting/dataLabelSec");
		    				boolean pageChange;
							try {
								pageChange = imageComparison2(driver, "/SmokeTesting/dataLabelSec", "/SmokeTesting/dataLabelSec");
								if(pageChange==false) {
	  		    					pass(driver,"Page values changed after cliking next page");
	  		    				}else {
	  		    					fail(driver,"Page values not changed after cliking next page");
	  		    				}
							} catch (Exception e) {
								// TODO Auto-generated catch block
								
							}
		    				
		    				
		    			}
		    		}else {
		    			fail(driver,"Pagination is not displayed");
		    		}
		    		
		    		click(driver,FirstColoumnDataLabel);
		    		click(driver,deleteDataLabel);
		    		elementnotvisible(driver, Loading);
		    		if(isDisplayed(driver, deleteSuccessDataLabel)) {
		    			pass(driver,"Selected row deleted Successfully");
		    			elementnotvisible(driver, deleteSuccessDataLabel);
		    		}else {
		    			fail(driver,"Selected row not deleted Successfully");
		    		}
		    		
		    		click(driver,FirstColoumnDataLabel);
		    		click(driver,mergeSelectRow);
		    		waitForElement(driver, mergeConfirmPopup);
		    		waitForElement(driver, valueReplaceInput);
		    		sendKeys(driver,valueReplaceInput,"2015-05-23 00:04:00");
		    		waitForElement(driver, ApplyBtnMerge);
		    		click(driver,ApplyBtnMerge);
		    		elementnotvisible(driver, Loading);
		    		if(isDisplayed(driver, mergeSuccessDataLabel)) {
		    			pass(driver,"Selected row merged Successfully");
		    			elementnotvisible(driver, mergeSuccessDataLabel);
		    		}else {
		    			fail(driver,"Selected row not merged Successfully");
		    		}
		    		
		    		click(driver,FirstColoumnDataLabel);
		    		click(driver,mergeUnSelect);
		    		waitForElement(driver, mergeConfirmPopup);
		    		waitForElement(driver, valueReplaceInput);
		    		sendKeys(driver,valueReplaceInput,"2015-05-23 00:00:00");
		    		waitForElement(driver, ApplyBtnMerge);
		    		click(driver,ApplyBtnMerge);
		    		elementnotvisible(driver, Loading);
		    		if(isDisplayed(driver, mergeSuccessDataLabel)) {
		    			pass(driver,"Selected row Unmerged Successfully");
		    			elementnotvisible(driver, mergeSuccessDataLabel);
		    		}else {
		    			fail(driver,"Selected row not Unmerged Successfully");
		    		}
		    		
		    		click(driver,FirstColoumnDataLabel);
		    		click(driver,clearRows);
		    		elementnotvisible(driver, Loading);//new line
		    		if(isDisplayed(driver,NotificationMessage)) {
		    			String notifyText=getText1(driver,NotificationMessage);
		    			if(isDisplayed2(driver, mergeSuccessDataLabel)) {
			    			pass(driver,"Selected row cleared Successfully");
			    			elementnotvisible(driver, mergeSuccessDataLabel);
			    		}else {
			    			pass(driver,"Selected row not cleared Successfully, Message Displayed : "+notifyText);
			    		}
		    		}else {
		    			fail(driver,"Selected row not cleared Successfully");
		    		}
		    		
		    		
		    		
		    		
		    	}else {
		    		fail(driver,"Data Label not opened while selecting the Date value");
		    	}
		    	
		    	if(isDisplayed(driver,GraphSheetScetion)) {
		    		if(isDisplayed(driver,graph)) {
	  		    		String graphValue=getText1(driver,GraphSectionValue).trim();
	  		    		System.out.println("graphValue : "+graphValue);
	  		    		if(isDisplayed(driver,ChartContextGrpah)) {
	  		    			pass(driver,"Chart Context Menu in Graph section displayed for Date value");
	  		    		}else {
	  		    			fail(driver,"Chart Context Menu in Graph section not displayed for Date value");
	  		    		}

		    		}else {
		    			fail(driver,"Graph not loaded...");
		    		}
	    		}else {
		    		fail(driver,"Data Label not opened while selecting the Date value");
		    	}
		    	  
		    	if(isDisplayed(driver,variableImportSect)) {
		    			pass(driver,"Variable of importance opened while selecting the Date value");
		    			if(isDisplayed(driver,ChartContextVariable)) {
		    			pass(driver,"Chart Context Menu in Variable section displayed for Date value");
		    		}else {
		    			fail(driver,"Chart Context Menu in Variable section not displayed for Date value");
		    		}
		    		 verifyElementIsPresent1(driver, variableImportance);
		    	}else {
		    		fail(driver,"Variable of importance not opened while selecting the Date value");
		    	}
		    	
   		  }
   		    
   		    //-------
   		  if(isDisplayed2(driver,NumericalType)) {
 		    	click(driver,NumericalType);
 		    	elementnotvisible(driver, Loading);
 		    	String selectedColumnNumeric=getText1(driver,NumericalType);
 		    	if(isDisplayed(driver,AdvancedStatisticsSec)) {
 		    		String AdvancedStatisticsValue=getText1(driver,DataLabelValue).trim();
 		    		System.out.println("AdvancedStatisticsValue2 : "+AdvancedStatisticsValue);
 		    		if(AdvancedStatisticsValue.equals(selectedColumnNumeric)) {
 		    			pass(driver,"Advanced Statistics opened with selected Numeric value");
 		    		}else {
 		    			fail(driver,"Advanced Statistics opened with different Numeric value");
 		    		}
 		    		if(isDisplayed(driver,OutlierDelete)){
 		    			pass(driver,"Outlier delete icon displayed for numerical selection");
 		    		}else {
 		    			fail(driver,"Outlier delete icon not displayed for numerical selection");
 		    		}
 		    		if(isDisplayed(driver,helpDocIcon)){
 		    			pass(driver,"Help Doc icon displayed for numerical selection");
 		    		}else {
 		    			fail(driver,"Help Doc icon not displayed for numerical selection");
 		    		}
 		    		if(isDisplayed(driver,fullScreenData)){
 		    			pass(driver,"Full Screen icon displayed for numerical selection");
 		    		}else {
 		    			fail(driver,"Full Screen icon not displayed for numerical selection");
 		    		}
	    		    	if(isDisplayed(driver,ChartContextAdvanced)){
			    			pass(driver,"Chart Context Menu icon displayed for numerical selection");
			    		}else {
			    			fail(driver,"Chart Context Menu icon not displayed for numerical selection");
			    		}
	    		    	
 		    	}else {
 		    		fail(driver,"Advanced Statistics not opened while selecting the Numeric value");
 		    	}
   		  
 		    	if(isDisplayed(driver,GraphSheetScetion)) {
 		    		if(isDisplayed(driver,graph)) {
	    		    		String graphValue=getText1(driver,GraphSectionValue).trim();
	    		    		System.out.println("graphValue2 : "+graphValue);
	    		    		if(graphValue.equals(selectedColumnNumeric)) {
	    		    			pass(driver,"Graph opened with selected Numeric value");
	    		    		}else {
	    		    			fail(driver,"Graph opened with different Numeric value");
	    		    		}
	    		    		if(isDisplayed(driver,ChangeNumberBins)) {
	    		    			pass(driver,"Change number bins displayed for Numerical selection");
	    		    			mouseOverToElement(driver, ChangeNumberBins);
	    		    			verifyElementDisplayed(driver, ChangeBinsTooltiptext);
	    		    		}else {
	    		    			fail(driver,"Change number bins not displayed for Numerical selection");
	    		    		}
	    		    		
	    		    		if(!TargetValue.equalsIgnoreCase(selectedColumnNumeric)) {
	    		    			if(isDisplayed(driver,StackTargetVariable)) {
		    		    			pass(driver,"Stack with Target Variable displayed for Select numerical variable (Not selected in target)");
		    		    			mouseOverToElement(driver, StackTargetVariable);
		    		    			verifyElementDisplayed(driver, StackWithTargetVariable);
		    		    		}else {
		    		    			fail(driver,"Stack with Target Variable not displayed for Select numerical variable (Not selected in target)");
		    		    		}
	    		    		}else {
	    		    			if(isDisplayed(driver,StackTargetVariable)) {
		    		    			fail(driver,"Stack with Target Variable displayed for Select numerical variable (Selected in target)");
		    		    		}else {
		    		    			pass(driver,"Stack with Target Variable not displayed for Select numerical variable (Selected in target)");
		    		    		}
	    		    		}
	    		    		
	    		    		if(isDisplayed(driver,ShowEmptyBins)) {
	    		    			pass(driver,"Show Empty Bin displayed for Numerical selection");
	    		    		}else {
	    		    			fail(driver,"Show Empty Bin not displayed for Numerical selection");
	    		    		}
	    		    		if(isDisplayed(driver,ChartContextGrpah)) {
		  		    			pass(driver,"Chart Context Menu in Graph section displayed for Numerical value");
		  		    		}else {
		  		    			fail(driver,"Chart Context Menu in Graph section not displayed for Numerical value");
		  		    		}
	    		    		
 		    		}else {
 		    			fail(driver,"Graph not loaded...for "+selectedColumnNumeric);
 		    		}
 		    	}else {
 		    		fail(driver,"Data Label not opened while selecting the Numeric value");
 		    	}
 		    	
 		    	if(isDisplayed(driver,variableImportSect)) {
		    			pass(driver,"Variable of importance opened while selecting the Numeric value");
		    			if(isDisplayed(driver,refreshOptionVariable)) {
		    				pass(driver,"Refresh button present in variables of Importance section");
		    				click(driver,refreshOptionVariable);
		    				if(isDisplayed(driver,refreshing)) {
		    					pass(driver,"Refresh in varible of importance section working properly");
		    				}else {
		    					fail(driver,"Refresh in varible of importance section not working properly");
		    				}
		    				
		    			}else {
		    				fail(driver,"Refresh button not present in variables of Importance section");
		    			}
		    			if(isDisplayed(driver,ContextmenuOptionVariable)) {
		    				pass(driver,"Context menu option present in variables of Importance section");
		    			}else {
		    				fail(driver,"Context menu option not present in variables of Importance section");
		    			}
		    		
 		    	}else {
 		    		fail(driver,"Variable of importance not opened while selecting the Numeric value");
 		    	}
 		    	verifyElementIsPresent1(driver, RowsBottom);
 		    	verifyElementIsPresent1(driver, ColumnsBottom);
 		    	
 		    	click(driver,OutlierDelete);
 		    	elementnotvisible(driver, Loading);
 		    	if(isDisplayed(driver,OutlierDeletePopup)) {
 		    		String deletePopupText=getText1(driver, OutlierDeletePopup);
 		    		if(deletePopupText.equals("Outliers deleted successfully")) {
 		    			pass(driver,"Outliers deleted successfully");
 		    		}else {
 		    			fail(driver,"Outlier not deleted successfully.. Popup displayed : "+deletePopupText);
 		    		}
 		    	}else {
 		    		fail(driver,"Popup not displayed after click the Outlier delete button");
 		    	}
 		    	
 		    }
   		  
   		  //------------
   		  //*********************************
   		 if(isDisplayed2(driver,TextType)) {
		    	click(driver,TextType);
		    	elementnotvisible(driver, Loading);
		    	String selectedColumnText=getText1(driver,TextType);
		    	String dataTabelValueText=getText1(driver,DataLabelValue).trim();
	    		System.out.println("dataTabelValuetext : "+dataTabelValueText);
	    		if(dataTabelValueText.equals(selectedColumnText)) {
	    			pass(driver,"Data Label displayed selected Text value");
	    		}else {
	    			fail(driver,"Data Label displayed different Text value");
	    		}
		    		if(isDisplayed(driver,GridViewIcon)){
		    			pass(driver,"Grid View icon displayed for Text selection");
		    		}else {
		    			fail(driver,"Grid View icon not displayed for Text selection");
		    		}
		    		if(isDisplayed(driver,ChartViewIcon)){
		    			pass(driver,"Chart View icon displayed for Text selection");
		    		}else {
		    			fail(driver,"Chart View icon not displayed for Text selection");
		    		}
		    		
		    	 if(isDisplayed(driver,RadialChartView)) {
		    		 
		    		if(isDisplayed(driver,ChartContextDataLabel)){
		    			pass(driver,"Chart Context Menu icon displayed for Text selection");
		    		}else {
		    			fail(driver,"Chart Context Menu icon not displayed for Text selection");
		    		}
		    		click(driver,GridViewIcon);
		    		if(isDisplayed(driver,DataTableSection)) {
		    			pass(driver,"Grid view of the text column opened");
		    			if(isDisplayed(driver,searchBarInDataLabel)) {
		    				pass(driver,"Search bar displayed in the grid view for Text");
		    			}else {
		    				fail(driver,"Search bar not displayed in the grid view for Text");
		    			}
		    		}else {
		    			fail(driver,"Grid view of the text column not opened");
		    		}
		    		
		    		click(driver,ChartViewIcon);
		    		if(isDisplayed(driver,RadialChartView)) {
		    			pass(driver,"Chart view displayed while selecting the chart view");
		    		}else {
		    			fail(driver,"Chart view not displayed while selecting the chart view");
		    		}
		    		
		    	}else {
		    		fail(driver,"Data Table Section with chart view not loaded while selecting the Text value");
		    	}
		    	
		    	
		    	if(isDisplayed(driver,GraphSheetScetion)) {
		    		if(isDisplayed(driver,textGrpah)) {
		    			
	    		    		if(isDisplayed(driver,ChartContextText)) {
	    		    			pass(driver,"Chart Context Menu in Graph section displayed for Text value");
	    		    		}else {
	    		    			fail(driver,"Chart Context Menu in Graph section not displayed for Text value");
	    		    		}
	    		    		
	    		    		if(isDisplayed(driver,N_Grams)) {
	    		    			pass(driver,"N_Grams in Graph section displayed for Numerical selection");
	    		    		}else {
	    		    			fail(driver,"N_Grams in Graph section not displayed for Numerical selection");
	    		    		}
	    		    		
		    		}else {
		    			fail(driver,"Graph not loaded...for "+selectedColumnText);
		    		}
		    	}else {
		    		fail(driver,"Data Label not opened while selecting the Numeric value");
		    	}
		    	
		    	if(isDisplayed(driver,variableImportSect)) {
		    			pass(driver,"Variable of importance opened while selecting the Numeric value");
		    	}else {
		    		fail(driver,"Variable of importance not opened while selecting the Numeric value");
		    	}
		    	
		    	click(driver,OutlierDelete);
		    	if(isDisplayed(driver,outlierDeleteSuccess)) {
		    		pass(driver,"Outlier deleted successfully..");
		    	}else {
		    		fail(driver,"Outlier not deleted successfully..");
		    	}
		    	
		    }
   		 
   		 //***************************
   		  
   		 click(driver,Transformations);
   		 elementnotvisible(driver, Loading);
   		 elementnotvisible(driver, Loading1);
   		 if(isDisplayed(driver,FunctuionsListSec)) {
   			 pass(driver,"List functions displayed after clicking Transformation");
   			 verifyElementIsPresent1(driver, FunctuionsListSec);
   			 verifyElementIsPresent1(driver, eyeIcon);
   			 List<WebElement> FunctionsValueList=getWebElements(driver, FunctuionsListSec);
   			 List<WebElement> Home_IconsList=getWebElements(driver,eyeIcon);
   			 if(FunctionsValueList.size()==Home_IconsList.size()) { 
   				 pass(driver,"All the function lists are displayed with 'Example Home icon'");  // new validation
   			 }else {
   				 fail(driver,"Some function lists are not displayed with 'Example Home icon'");
   			 }
   			 
   			 if(isDisplayed(driver,searchFunction)) {
   	    		pass(driver,"Search bar displayed in Functions section");
   			 }else {
   	    		fail(driver,"Search bar not displayed in Functions section");
   			 }
   		 }else {
   	    	fail(driver,"List functions not displayed after clicking Transformation");
   		 }
   		
   		 if(isDisplayed(driver, ColumnSection)) {
   	    	pass(driver,"Column functions displayed after clicking Transformation");
   	    	verifyElementIsPresent1(driver, ColumnText);
   	    	if(isDisplayed(driver,searchColumn)) {
   	    		pass(driver,"Search bar displayed in Column section");
   			 }else {
   	    		fail(driver,"Search bar not displayed in Column section");
   			 }
   		 }else {
   	    	fail(driver,"Column functions not displayed after clicking Transformation");
   		 }
   		
   		 boolean HelpFrame=false;
   		 
		try {
			wait(driver,"2");
			WebElement ele=driver.findElement(By.xpath("//iframe[contains(@src,'https://help.sedge.ai/Data%20analytics.html')]"));
			wait(driver,"1");
  			driver.switchTo().frame(ele);
  			if(isDisplayed(driver,HelpDocSec)) {
   	   			pass(driver,"HelpDocumentation section is displayed after clicking Transformation");
   	   		}else {
   	   			fail(driver,"HelpDocumentation section is not displayed after clicking Transformation"); 
   	   		}
  			HelpFrame=true;
  		 }catch(Exception e) {
  			fail(driver,"Unable to validate HelpDocumentation section in Transformation "+e.getLocalizedMessage());  
  		 }
		
   		 driver.switchTo().defaultContent();
   		 wait(driver,"1");
   		 if(isDisplayed(driver,ExpressionHistory)) {
   			  if(isToggleAccessible(driver,ExpressionHistory)) {
   				  fail(driver,"Expression History is enabled by default");
   			  }else {
   				  pass(driver,"Expression History is disabled by default");
   			  }
   		 }else {
   			fail(driver,"Expression History is not displayed after clicking Transformation");
   		 }
     	   
   		 if(isDisplayed(driver,ClearButton)) {
    			pass(driver,"Clear Button is displayed after clicking Transformation");
    		 }else {
    			fail(driver,"Clear Button is not displayed after clicking Transformation");
    		 }
   		 if(isDisplayed(driver,TestButton)) {
    			pass(driver,"Test Button is displayed after clicking Transformation");
    		 }else {
    			fail(driver,"Test Button is not displayed after clicking Transformation");
    		 }
   		 if(isDisplayed(driver,ApplyButtonTrans)) {
    			pass(driver,"Apply Button is displayed after clicking Transformation");
    		 }else {
    			fail(driver,"Apply Button is not displayed after clicking Transformation");
    		 }
   
   		 ScrollBarValidation1(driver, FunctionList, "FunctionList");
   		 click(driver,searchFunction);
   		 sendKeys(driver,searchFunction,FunctionSearchName);
   		 wait(driver,"1");
   		 String firstDisplayedFunction=getText1(driver,FirstFunction);
   		 System.out.println("firstDisplayedFunctionAct : "+firstDisplayedFunction);
   		 System.out.println("firstDisplayedFunctionExp : "+FunctionSearchName);
    		
   		 if(firstDisplayedFunction.equals(FunctionSearchName)) {
   			pass(driver,"Search bar in Functions works properly");	
   		 }else {
   			fail(driver,"Search bar in Functions not works properly"); 
   		 }
   		 
   		 String helpDocHeading1=getText1(driver,FirstFunction);
   		 System.out.println("helpDocHeading1 search : "+helpDocHeading1);
   		 click(driver,FirstFunction);
   		 wait(driver,"1");
//		 String helpDocHeading=getText1(driver,HelpDocSecHeading);
   		 try {
   			 if(HelpFrame==true) {
   	   			WebElement ele=driver.findElement(By.xpath("//iframe[contains(@src,'https://help.sedge.ai/Data%20analytics.html')]"));
   				driver.switchTo().frame(ele);
   				wait(driver,"1");
   				WebElement searchedFuncHelpDoc=driver.findElement(By.xpath("//section[@id='transformations']//h3[contains(text(),'"+FunctionSearchName+"')]"));
      			 if(searchedFuncHelpDoc.isDisplayed()) {
      				 pass(driver,"Searched function details displayed in the Help Document Section");
      			 }else {
      				 fail(driver,"Searched function details not displayed in the Help Document Section");//new validation
      			 }
   			 }else {
   				fail(driver,"Unable to find the searched Function in HelpDocument Section");
   			 }
   			 
   			
   		 }catch(Exception e) {
   			 fail(driver,"Unable to find the searched Function in HelpDocument Section");
   		 }
   		 driver.switchTo().defaultContent();
   		 //new
		 waitForElement(driver, displayedLine);
   		 String displayedSyntaxAct=getText1(driver,displayedLine);
   		 System.out.println("displayedSyntaxAct : "+displayedSyntaxAct);
//				System.out.println("SyntaxExp : "+Syntax);
   		 if(displayedSyntaxAct.contains(helpDocHeading1.toLowerCase())) {
				pass(driver,"Searched function syntax displayed in Code Mirror tab");
   		 }else {
				fail(driver,"Searched function syntax not displayed in Code Mirror tab");
   		 }
			//new
   		
   		 click(driver,TestButton);
   		 if(isDisplayed(driver,TransformationError)) {
				pass(driver,"'Provide a valid input column name' error displayed");
   		 }else {
				fail(driver,"'Provide a valid input column name' error not displayed");
   		 }
			
   		ScrollBarValidation1(driver, ColumnList, "ColumnList");
   		 if(isDisplayed(driver,NumericalColumnTrans)) {
   			 String numericalTextExp=getText1(driver,NumericalText);
   			 click(driver,searchColumn);
      		 sendKeys(driver,searchColumn,numericalTextExp);
      		 wait(driver,"1");
      		 String searchedColumnAct=getText1(driver,firstColumn_Value);
      		 if(numericalTextExp.equals(searchedColumnAct)) {
      			 pass(driver,"Search bar in the column working properly");
      		 }else {
      			 fail(driver,"Search bar in the column not working properly");
      		 }
      		 click(driver,firstColumn_Value);
      		 wait(driver,"1");
      		 displayedSyntaxAct=getText1(driver,displayedLine);
      		 if(displayedSyntaxAct.contains(numericalTextExp)) {
      			 pass(driver,"Searched column is applied in the Synatx while click on it");
      		 }else {
      			 fail(driver,"Searched column is not applied in the Synatx while click on it ");
      		 }
      		 click(driver,TestButton);
      		 elementnotvisible(driver, Loading);
      		 if(isDisplayed(driver,AsciiError)) {
      			 pass(driver,"'Kindly choose a categorical column for 'ascii' function' error displayed when selecting the Numerical value");
      		 }else {
      			 fail(driver,"'Kindly choose a categorical column for 'ascii' function' error not displayed when selecting the Numerical value");
      		 }
      		 
      		 click(driver,ClearButton);
      		 wait(driver,"1");
      		 String clearedText=getText1(driver,displayedLine);
      		 if(clearedText.isEmpty()) {
      			 pass(driver,"Syntax cleared after clicking the clear button");
      		 }else {
      			 fail(driver,"Syntax not cleared after clicking the clear button");
      		 }
      		 
   		 }
   		 
   		 	click(driver,searchFunction);
   		 	sendKeys(driver,searchFunction,FunctionSearchName);
   		 	wait(driver,"1");
   		 	click(driver,FirstFunction);
   		 	
	      		 click(driver,searchColumn);
	      		 sendKeys(driver,searchColumn,ColumnNameInput_Smoke_131);
	      		 wait(driver,"1");
	      		 String searchedColumnAct=getText1(driver,firstColumn_Value);
	      		 if(ColumnNameInput_Smoke_131.equals(searchedColumnAct)) {
					pass(driver,"Search bar in the column working properly");
	      		 }else {
					fail(driver,"Search bar in the column not working properly");
	      		 }
	      		 if(isDisplayed(driver,firstColumnImage)) {
					pass(driver,"Search Column value displayed with data type");
	      		 }else {
					fail(driver,"Search Column value data type not displayed");
	      		 }
				
	      		 click(driver,firstColumn_Value);
	      		 wait(driver,"1");
	      		 String displayedSyntexText=getText1(driver,displayedLine);
	      		 if(displayedSyntexText.contains(ColumnNameInput_Smoke_131)) {
	      			 pass(driver,"Searched column value applied in syntax while click on it");
	      		 }else {
	      			 fail(driver,"Searched column value not applied in syntax while click on it");
	      		 }
   			 
	      		 click(driver,TestButton);
	      		 elementnotvisible(driver, Loading);
	      		 if(isDisplayed(driver,AsciiSuccess)) {
	      			 pass(driver,"'Expression is valid' success message displayed for categorical value");
	      		 }else {
	      			 fail(driver,"'Expression is valid' success message is not displayed for categorical value");
	      		 }
   		 
	      		 elementnotvisible1(driver, AsciiSuccess);
	      		 String ExpHistoryBtnColorAct=getTextBackgroundColor(driver, ExpressionHistory);
	      		 System.out.println("ExpHistoryBtnColorAct : "+ExpHistoryBtnColorAct);
	      		 if(ExpressionHistoryBtnEnable.equalsIgnoreCase(ExpHistoryBtnColorAct)) {
	      			 pass(driver,"Expression history Button get enabled in blue color");
	      		 }else {
	      			 fail(driver,"Expression history Button not enabled in blue color");
	      		 }
   		 
	      		 click(driver,ApplyButtonTrans);
	      		 elementnotvisible1(driver, Loading);
	      		 elementnotvisible1(driver, Loading1);
	      		 if(isDisplayed(driver,previewTabDisplay)) {
	      			 pass(driver,"Synatex applied successfully and preview tab displayed");
	      			 List<WebElement> headerPreview=getWebElements(driver, PreviewHeader_Statistics);
	      			 List<WebElement> SortingPreview=getWebElements(driver, PreviewSorting_Statistics);
	      			 int sortCount=0;
	      			 int headCount=0;
	     		     for(WebElement head:headerPreview) {
	     		       action.moveToElement(head).build().perform();
	     			   if(head.isDisplayed()) {
	     				  headCount++;
	     			   }
	     		     }
	     		     for(WebElement sort:SortingPreview) {
	     		       action.moveToElement(sort).build().perform();
	     			   if(sort.isDisplayed()) {
	     				   sortCount++;
	     			   }
	     		     }
	     		     
	     		     mouseOverToElement(driver, PreviewHeader_Statistics);
	      			 if(headCount==sortCount) {
	      				 pass(driver,"Sorting Icon displayed in all the headers in the preview in Statistics Page");
	      			 }else {
	      				 fail(driver,"Sorting Icon not displayed in some headers in the preview in Statistics Page");
	      			 }
	      			 
	      			 
	      		 }else {
	      			 fail(driver,"Syntex not applied successfully"); 
	      		 }
	      		 
	      		 click(driver,Transformations);
	      		 elementnotvisible(driver, Loading);
	      		 elementnotvisible(driver, Loading1);
	      		 click(driver,searchFunction);
	      		 sendKeys(driver,searchFunction,FunctionSearchName);
	      		 click(driver,FirstFunction);
	      		 click(driver,searchColumn);
	      		 sendKeys(driver,searchColumn,ColumnNameInput_Smoke_131);
	      		 click(driver,firstColumn_Value);
	      		 click(driver,ApplyButtonTrans);
	      		 elementnotvisible(driver, Loading);
	      		 if(isDisplayed(driver,NewColumnError)) {
	      			 pass(driver,"'NewColumn' already exists error displayed");
	      		 }else {
	      			 fail(driver,"'NewColumn' already exists error not displayed");
	      		 }
	      		 
	      		 click(driver,ExpressionHistory);
	      		 wait(driver,"1");
	      		 if(isDisplayed(driver,ExpressionList)) {
	      			 pass(driver,"'Expression history' tab displayed successfully");
	      		 }else {
	      			 fail(driver,"'Expression history' tab not displayed");
	      		 }
	      		 
	      		 click(driver,ExpressHistoryTabClose);
	      		 wait(driver,"1");
	      		 if(!isDisplayed(driver,ExpressHistoryTabClose)) {
	      			pass(driver,"'Expression history' tab closed successfully");
	      		 }else {
	      			fail(driver,"'Expression history' tab not closed successfully");
	      		 }
	      
	      		 click(driver,ClearButton);
	      		 wait(driver,"1");
	      		 displayedSyntexText=getText1(driver,displayedLine);
	      		 if(displayedSyntexText.isEmpty()) {
	      			 pass(driver,"Syntex cleared succesfully while clicking the clear button");
	      		 }else {
	      			 fail(driver,"Syntex not cleared succesfully while clicking the clear button");
	      		 }
	      		 
	      		 click(driver,PreviewSectionHead);
	      		 elementnotvisible(driver, Loading);
	      		 if(isDisplayed(driver,PreviewTable)) {
	      			 pass(driver,"Preview tab open and table is displayed in the preview tab");
	      		 }else {
	      			 fail(driver,"Table is not displayed in preview tab");
	      		 }
	      		 
	      		 ScrollBarValidation1(driver, PreviewTableValue, "Table in Preview Tab");
	      		 
    	   }else {
    		   fail(driver,"Statistics page is not displayed after clicking Statistics element");
    	   }  
		
		
		
	}
	
}
