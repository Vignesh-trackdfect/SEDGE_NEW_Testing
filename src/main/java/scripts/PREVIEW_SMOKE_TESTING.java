package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import commonMethods.Keywords;
import commonMethods.Utils;

public class PREVIEW_SMOKE_TESTING extends Keywords{
	
	public void previewPageTest(WebDriver driver,int iteration) {
		
		String TargetValue=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input", "TargetValue");
		
		waitForElement(driver,Preview_text);
		waitForElement(driver,DataSetTable);
		
//		waitForElement(driver,Statistics_icon);
//		click(driver,Statistics_icon);
//	    wait(driver,"1");
//	    if(isDisplayed(driver,targetNotSelectError)) {
//       	    mouseOverToElement(driver,targetNotSelectError);
//			pass(driver,"Statistics not accessible without selecting target");
//			click3(driver,closeTargeterror);
//	    }else {
//			fail(driver,"Statistics is accessible without selecting target");
//        }        
//			
//	    wait(driver,"1");
//	    mouseOverToElement(driver,Visual_icon);
//	    if(!isDisplayed2(driver,accessible)) {
//   			pass(driver,"Visual Analytics not accessible without selecting target");
//	    }else {        	            
//   			fail(driver,"Visual Analytics is accessible without selecting target");
//	    } 
//	    wait(driver,"2");
//	    mouseOverToElement(driver,predictive_analytics);
//	    if(!isDisplayed2(driver,accessible)) {
//  			pass(driver,"Predictive Analytics not accessible without selecting target");
//   	   	}else {  
//  			fail(driver,"Predictive Analytics is accessible without selecting target");
//   	   	}
//	        
//        mouseOverToElement(driver,Preview);
//		verifyElementIsPresent1(driver,Preview_option);
//		verifyElementIsPresent1(driver,GDPR_option);
//		click(driver,GDPR_option);
//		if(isDisplayed(driver,targetNotSelectError)) {
//  			pass(driver,"Validation shows when click GDPR without selection target");
//        	click3(driver,closeTargeterror);
//		}else {
//  			fail(driver,"Validation not shows when click GDPR without selection target");
//        } 
//		mouseOverToElement(driver,Statistics_icon);
//		click(driver,statisctics);
//		if(isDisplayed(driver,targetNotSelectError)) {
//			pass(driver,"Validation shows when click Statistics without selection target");
//			click3(driver,closeTargeterror);
//        }else {
//  			fail(driver,"Validation not shows when click Statistics without selection target");
//        }
//				 
//		mouseOverToElement(driver,Statistics_icon);
//		click(driver,statisticalTest);
//		if(isDisplayed(driver,targetNotSelectError)) {
//			pass(driver,"Validation shows when click Statistical Test without selection target");
//			click3(driver,closeTargeterror);
//        }else {
//  			fail(driver,"Validation not shows when click Statistical Test without selection target");
//        }
		
	    mouseOverToElement(driver,Preview);
	    wait(driver,"1");
		verifyElementIsPresent(driver,Sampling_option);

        click(driver,Sampling_option);
        elementnotvisible1(driver,Loading);
        if(isDisplayed1(driver,ProfilingPage)) {
  			pass(driver,"Sampling is clickable & Profile page is Opened");
  			mouseOverToElement(driver, ProfilingPage);
        }else {
  			fail(driver,"Sampling is not clickable & Profile page is not Open");
        }

        // this is for new release....
		if(isDisplayed(driver,DefaultSelectedtarget)) {
			String defaultSelectedTargetValue=getText1(driver, DefaultSelectedtarget);
			pass(driver,"By default, Target Variable is selected, Selected value : "+defaultSelectedTargetValue);
			if(isDisplayed(driver,target_Succes)) {
            	pass(driver,"'Target added successfully' message is displayed for the default target selection");
	        	click3(driver,target_Succes);
        	}else {
            	fail(driver,"'Target added successfully' message is not displayed for the default target selection");
        	}
			
			verifyElementDisplayed(driver,target);
			mouseOverToElement(driver,targetDrop);
			click(driver,targetDrop);
			if(isDisplayed1(driver,dropdown_expand)) {
				pass(driver,"Target dropdown is expanded with available columns");
			}else {
	  			fail(driver,"Target dropdown not expanded with available columns");
	        }
			
			try {
				WebElement targetElement=driver.findElement(By.xpath("//span[text()='"+defaultSelectedTargetValue+"']/ancestor::mat-option[1]//img[@alt='datatype']"));
				String dataType=targetElement.getAttribute("src");
				if(dataType.contains("Categorical")) {
					pass(driver,"By default Selected target variable is Categorical dataType");
				}else {
					fail(driver,"By default Selected target variable is not Categorical dataType");
				}
				targetElement.click();
			}catch(Exception e) {
				fail(driver,"Unable to Validate the dataType for the default selected target");
			}
			
			if(defaultSelectedTargetValue.contains("[")) {
         		int startIndex = defaultSelectedTargetValue.indexOf('[') + 1;
         		int endIndex = defaultSelectedTargetValue.indexOf(']');
	            String numberString = defaultSelectedTargetValue.substring(startIndex, endIndex);
	            int number = Integer.parseInt(numberString);
	            if(number>1 && number<200) {
	            	pass(driver,"By default selected target variable is more than 1 and less than 200 unique value");
	            }else {
	            	fail(driver,"By default selected target variable is not more than 1 and less than 200 unique value");
	            }
			 }else {
				 fail(driver,"Unable to Validate the unique Value for the default selected Target");
			 }
			 
			
		}else {
			fail(driver,"By default, Target Variable is not selected");
		}
        
        verifyElementDisplayed(driver,sampling);
        verifyElementDisplayed(driver,dataProtection);
        verifyElementDisplayed(driver,machineLearnig);
			
        click(driver,targetDrop);
        waitForElement(driver, dropdown_expand);
		ScrollBarValidation1(driver,dropdown_expand,"Target_Drop");
		   
		if(isDisplayed(driver,Date_Option_dropdown)) {
			click(driver,Date_Option_dropdown);
        	if(isDisplayed(driver,Date_target_error)) {
    			pass(driver,"Validation shows, 'Date column cannot be selected as target'");
	        	click3(driver,Date_target_error);
        	}else {
	      		fail(driver,"Validation not shows, 'Date column cannot be selected as target'");
        	}
        }else {
    		pass(driver,"Date column not present in the List ");
        }

		click3(driver,targetDrop); 
		if(isDisplayed(driver,categorical)) { 
		   List<WebElement> elements = getWebElements(driver,CategoricalValues);
			   boolean loop=true;
			   boolean loop1=true;
			   boolean loop2=true;
			   for (WebElement element : elements) {
		            String text = element.getText();
			      
		            if(text.contains("[")) {
		            		int startIndex = text.indexOf('[') + 1;
		            		int endIndex = text.indexOf(']');
				            String numberString = text.substring(startIndex, endIndex);
				            int number = Integer.parseInt(numberString);
				            if (number > 200 && loop==true) {
				                element.click();
								wait(driver,"2");
				                if(isDisplayed(driver,Unique_200_error)) {
				                	pass(driver," 'Kindly select column with unique class less than or equal to 200 as a target' , Validation message displayed  : "+text);
						        	click3(driver,Unique_200_error);
									wait(driver,"1");
									loop=false;
					        	}else {
					        		fail(driver," 'Kindly select column with unique class less than or equal to 200 as a target' Validation message not displayed : "+text);
					        	}
				                mouseOverToElement(driver, targetDrop);
				                wait(driver,"1");
				                click3(driver,targetDrop); 
				                wait(driver,"1");
				            }else if(number < 200 && loop1) {
				            	element.click();
								wait(driver,"2");
				            	if(isDisplayed(driver,target_Succes)) {
				                	pass(driver,"  Target  gets selected and message displayed \"target added successfully\" : "+text);
						        	click3(driver,target_Succes);
									wait(driver,"1");
									loop1=false;
					        	}else {
					        		fail(driver,"  Target not selected and message not displayed \"target added successfully\" : "+text);
					        	}
				            	
				            	mouseOverToElement(driver, targetDrop);
				                wait(driver,"1");
				                click3(driver,targetDrop); 
				                wait(driver,"1");
				            	
				            }
			            }else if(!text.contains("[") && loop2) {
			            	element.click();
							wait(driver,"1");
			            	if(isDisplayed(driver,target_Succes)) {
			                	pass(driver,"  Target  gets selected and message displayed \"target added successfully\" : "+text);
					        	click3(driver,target_Succes);
								wait(driver,"1");
								loop2=false;
				        	}else {
				        		fail(driver,"  Target not selected and message not displayed \"target added successfully\" : "+text);
				        	}
			            }
		            mouseOverToElement(driver, targetDrop);
	                wait(driver,"1");
	                click3(driver,targetDrop); 
	                wait(driver,"1");
			        } 
			        
		 }else {
			 pass(driver,"Categorical column not present in the List ");
		 }
				 
		click3(driver,targetDrop); 
		if(isDisplayed2(driver,Text_Option)) {
    		click(driver,Text_Option);
        	if(isDisplayed(driver,textError)) {
    			passReport(driver,"Validation Should show, 'Text column cannot be selected as target'" ,"Validation shows, 'Text column cannot be selected as target'");
	        	click3(driver,Date_target_error);
        	}else {
      			failReport(driver,"Validation Should show, 'Text column cannot be selected as target'","Validation not shows, 'Text column cannot be selected as target'");
        	}
			 click3(driver,targetDrop); 
    	}else {
			pass(driver,"Text column not present in the List ");
        }

		if(isDisplayed2(driver,Numerical_option)) {
				 
		    boolean loop=true;
            boolean loop1=true;
            boolean loop2=true;
            List<WebElement> elements = getWebElements(driver, NumericalValues);

	        for (WebElement element : elements) {
	            String text = element.getText();
	            if(text.contains("[")) {
	            	
	            	int startIndex = text.indexOf('[') + 1;
		            int endIndex = text.indexOf(']');
		            String numberString = text.substring(startIndex, endIndex);
		            int number = Integer.parseInt(numberString);
		            if (number > 200 && loop==true) {
		                element.click();
						wait(driver,"2");
		                if(isDisplayed(driver,Unique_200_error)) {
		                	pass(driver," 'Kindly select column with unique class less than or equal to 200 as a target' , Validation message displayed : "+text);
				        	click3(driver,Unique_200_error);
							wait(driver,"1");
							loop=false;
			        	}else {
			        		fail(driver," 'Kindly select column with unique class less than or equal to 200 as a target' Validation message not displayed : "+text);
			        	}
		                mouseOverToElement(driver, targetDrop);
		                wait(driver,"1");
		                click3(driver,targetDrop); 
		                wait(driver,"1");
		            }else if(number < 200 && loop1){
		            	element.click();
						wait(driver,"2");
		            	if(isDisplayed(driver,target_Succes)) {
		                	pass(driver,"  Target  gets selected and message displayed \"target added successfully\" : "+text);
				        	click3(driver,target_Succes);
							wait(driver,"1");
							loop1=false;
			        	}else {
			        		fail(driver,"  Target not selected and message not displayed \"target added successfully\" : "+text);
			        	}
		            	mouseOverToElement(driver, targetDrop);
		                wait(driver,"1");
		                click3(driver,targetDrop); 
		                wait(driver,"1");
		            }
	            }else if(!text.contains("[") && loop2){
	            	element.click();
					wait(driver,"2");
	            	if(isDisplayed(driver,target_Succes)) {
	                	pass(driver,"  Target  gets selected and message displayed \"target added successfully\"  : "+text);
			        	click3(driver,target_Succes);
						wait(driver,"1");
						loop2=false;
		        	}else {
		        		fail(driver,"  Target not selected and message not displayed \"target added successfully\" : "+text);
		        	}
	            }
	            mouseOverToElement(driver, targetDrop);
                wait(driver,"1");
                click3(driver,targetDrop); 
                wait(driver,"1");
	        } 
		 }else {
			 pass(driver,"Numerical column not present in the List ");
		 }
		 
			
		click3(driver,targetDrop);
		selectTarget(driver,TargetValue);
		wait(driver,"2");
	 
	   String selectTargettext=getText1(driver,selectedTarget).trim();
	   elementnotvisible(driver, Loading);
	   elementnotvisible(driver, Loading1);
       String targetPanelText=getText1(driver,TargetPanelResultText).trim();
       System.out.println("targetPanelText: "+targetPanelText);
       if(isDisplayed2(driver,TargetPanel)&&selectTargettext.equals(targetPanelText)) {
	   	  pass(driver,"The graph displayed in target section according to target");
       }else {
		   fail(driver,"The graph not displayed in target section according to target");
       }
       
       if(selectTargettext.contains("[")) {
    	   int index = selectTargettext.indexOf('[');
    	   //System.out.println("Index of [ >"+index);
    	   selectTargettext= selectTargettext.substring(0,index);
    	 
       }
       selectTargettext=selectTargettext.toLowerCase();
       
       waitForElement(driver,featureSection);
       click(driver,featureSection);
       elementnotvisible1(driver, Loading1);
       verifyElementIsPresent1(driver, featurePanel);
       waitForElement(driver, HeaderRow_Features);
       
       List<WebElement> header_Feature=getWebElements(driver, HeadersCount_feature);
       List<WebElement> Sort_Feature=getWebElements(driver, SortingCount_feature);
       int sortCount=0;
       int headerCount=0;
       for(WebElement header:header_Feature) {
    	   if(header.isDisplayed()) {
    		   String headerText=header.getText();
    		   if(!headerText.equals("Details")) {
    			   headerCount++;
        	   }
		   }
    	   
       }
	   for(WebElement sort:Sort_Feature) {
		   if(sort.isDisplayed()) {
			   sortCount++;
		   }
	   }
       if(headerCount==sortCount) {
    	   pass(driver,"Header Row Sort icon validation passed in the features page");
       }else {
    	   fail(driver,"Header Row Sort icon validation Failed in the features page");
       }
       
       if(isDisplayed(driver,HighlightedTarget)) {
    	   String highlightedText=getText1(driver,HighlightedTarget).trim();
    	   if(highlightedText.equalsIgnoreCase(selectTargettext)) {
 		   	  passReport(driver,"Selected target '"+selectTargettext+"' should highlighted in green color","'"+highlightedText+"' highlighted in green color");
 		   	  
    	   }else {
  		   	  failReport(driver,"Selected target '"+selectTargettext+"' should highlighted in green color","'"+highlightedText+"' highlighted in green color"); 
    	   }
       }else {
		   fail(driver,"Target element not highlighted in green color..");
       }
       
       mouseOverToElement(driver, HighlightedTarget);
       click(driver,HighlightedTarget);
       if(isDisplayed(driver,IgnoreIcon)) {
	   	  	passReport(driver,"Ignore icon should be enable in features section","Ignore icon enabled in features section"); 
       }else {
	   	  	failReport(driver,"Ignore icon should be enable in features section","Ignore icon not enabled in features section"); 
       }
    
       click(driver,IgnoreIcon);
       if(isDisplayed(driver,IgnoreError)) {
	   	  	pass(driver,"'Target column cannot be ignored' error is displayed"); 
       }else {
    	   	fail(driver,"'Target column cannot be ignored' error not displayed");  
       }
       
       selectCheckBox(driver,Checkbox1);
       deSelectCheckBox(driver,Checkbox1);
       
       String firstText=getText1(driver,featureValue1).trim();
       if(firstText.equals(selectTargettext)) {
    	   mouseOverToElement(driver, featureValue2);
    	   click(driver,featureValue2);
       }else {
    	   mouseOverToElement(driver, featureValue1);
    	   click(driver,featureValue1);
       }
       
       click(driver,IgnoreIcon);
       wait(driver,"1");
       if(isDisplayed(driver,IgnoreSuccess)) {
		   pass(driver,"'Selected column has been ignored or psuedonymized' success message displayed"); 
       }else {
		   fail(driver,"'Selected column has been ignored or psuedonymized' success message not displayed"); 
       }
		
   	   mouseOverToElement(driver,Statistics_icon);
   	   mouseOverAndClick(driver,Statistics_icon);
   	   elementnotvisible(driver, Loading);
   	   
   	   if(isDisplayed1(driver,statistics_page)) {
		   pass(driver,"Statistics is accessible after selecting target");
   	   }else {
		   fail(driver,"Statistics is not accessible after selecting target");
   	   }  
   	   
   	   mouseOverToElement(driver,Statistics_icon);
	   mouseOverAndClick(driver,statisticalTest);
	   if(isDisplayed1(driver,StatisticalTestPage)) {
		   pass(driver,"Statistical Test is accessible after selecting target");
	   }else {
		   fail(driver,"Statistical Test is not accessible after selecting target");
	   }  
	   
	   mouseOverToElement(driver,StatisticalTestPage);
	   wait(driver,"1");
	   mouseOverToElement(driver,visual_Analytics);
	   if(isDisplayed(driver,accessible)) {
		   pass(driver,"Visual Analytics accessible after selecting target");
	   }else {    
		   fail(driver,"Visual Analytics not accessible after selecting target");
	   } 
     
	   mouseOverToElement(driver,predictive_analytics);
	   if(isDisplayed(driver,accessible)) {
		   pass(driver,"Predictive Analytics accessible after selecting target");
	   }else { 
		   fail(driver,"Predictive Analytics not accessible after selecting target");
	   } 
   	   
	   
		 
	}

}
