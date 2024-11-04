package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import commonMethods.Keywords;
import commonMethods.Utils;

public class DASHPRO_ADMIN_SMOKE_TESTING extends Keywords{

	
	public void dashProAdmin(WebDriver driver,int iteration) {
		
		String PublishedChartColor=Utils.getDataFromTestData("SmokeTesting_UI", "ChartPublished_Flagg_Color");
		
		String ExportPdf_Title=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input", "ExportPdf_Title");
		String ExportPdf_Sub_Title=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input", "ExportPdf_Sub_Title");
		String ProjectName=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input", "ProjectName");
		String RenameProjectName=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input", "RenameProjectName");
		String Dataset_ShareEmailId=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input", "Dataset_ShareEmailId");

		String FileName=Utils.getDataFromTestData("SEDGE", "FileName1");
		String filepath=System.getProperty("user.dir") + "\\testdata\\"+FileName+".csv";
		
		Actions action=new Actions(driver);
		waitForElement(driver,ChartSec);
		mouseOverToElement(driver, chartBody);
  	  	waitForElement(driver,copyChart);
  	  	mouseOverToElement(driver,copyChart);
  	  	click(driver,copyChart);
  	  	if(isDisplayed(driver,chartBody2) || isDisplayed(driver,body2)) {
  	  		pass(driver,"Chart Copied Successfully After click on copy icon");
  	  	}else {
  	  		fail(driver,"Chart not Copied Successfully After click on copy icon");
  	  	}
		
  	   
  	    String CurrentTab_ID=getAttribute(driver, CurrentTab, "id");
  	    String CurrentTab_Text=getText1(driver, CurrentTabText);
  	    
  	    verifyElementDisplayed(driver, CurrentTabCheckBox);
  	    verifyElementDisplayed(driver, Chart1_Checkbox);
  	    verifyElementDisplayed(driver, Chart2_Checkbox);
  	  
  	    click(driver,Publish);
  	    if(isDisplayed(driver,Publish_Error)) {
  	    	pass(driver,"'Please select the Tab or widget' error displayed when click the Publish without selecting the tab or chart");
  	    }else {
  	    	fail(driver,"'Please select the Tab or widget' error not displayed when click the Publish without selecting the tab or chart");
  	    }
  	  
  	    elementnotvisible(driver,Publish_Error);
		mouseOverToElement(driver, Chart1_Checkbox);
		click(driver,Chart1_Checkbox);
		wait(driver,"1");
		if(isElementSelected(driver, Chart1_Checkbox)) {
			pass(driver,"Checkbox in the chart 1 selected after click on it");
		}else {
			fail(driver,"Checkbox in the chart 1 not selected after click on it");
		}
		
		click(driver,Publish);
		elementnotvisible1(driver, RPE_Loading);//Loading
		if(isDisplayed(driver,Publish_Success)) {
			pass(driver,"'Published successfully' message displayed after publish the selected chart ");
		}else {
			fail(driver,"'Published successfully' message not displayed after publish the selected chart ");
		}
		
		elementnotvisible(driver, Publish_Success);
		System.out.println("Publish Success Closed.....");
		String PublishFlagg=getWebElement(driver, Chart1_Flag).getCssValue("border-color");
		System.out.println("PublishFlagg : "+PublishFlagg);
		String rgb=RGB(PublishFlagg);
		String PublishedFlagColor_Act= rgbToHex1(rgb);
		System.out.println("PublishedChartColor : "+PublishedChartColor+",  PublishedFlagColor_Act : "+PublishedFlagColor_Act);
		if(isDisplayed(driver,Chart1_Flag) && PublishedFlagColor_Act.equalsIgnoreCase(PublishedChartColor)) {
			pass(driver,"Selected Chart flagged to red color after published on it");
		}else {
			fail(driver,"Selected Chart not flagged to red color after published on it");
		}
		
		
		String PublishFlagg2=getAttribute1(driver, Chart2_Flag,"class");
		if(!isDisplayed(driver,Chart2_Flag)&&PublishFlagg2.contains("display-none")) {
			pass(driver,"Non-selected Chart not flagged to red color after clicking the publish buttton");
		}else {
			fail(driver,"Non-selected Chart flagged to red color after clicking the publish buttton");
		}
		
		System.out.println("Flag checked...............single chart");
//		String rgb2=RGB(PublishFlagg2);
//		String PublishedFlagColor_Act2= rgbToHex1(rgb2);
//		if(!PublishedFlagColor_Act2.equalsIgnoreCase(PublishedChartColor)) {
//			pass(driver,"Non-selected Chart not flagged to red color after clicking the publish buttton");
//		}else {
//			fail(driver,"Non-selected Chart flagged to red color after clicking the publish buttton");
//		}
		
//		String Selected_ChartID=getAttribute1(driver, Chart1_, "data-gs-id");
//		String Non_Selected_ChartID=getAttribute1(driver, Chart2_, "data-gs-id");
		
		click(driver,Publish_Dashboard);
		wait(driver,"1");
		elementnotvisible1(driver, RPE_Loading);//Loading
		System.out.println("PublishedChartPage checking...............single chart");
		waitForElement(driver,PublishedChartPage);
		System.out.println("PublishedChartPage checked...............single chart");
		
		boolean PublishTabDisplay=false;
		try {
			WebElement selectedTab=driver.findElement(By.xpath("//li[contains(@id,'"+CurrentTab_ID+"')]//a"));
			if(selectedTab.isDisplayed()) {
				pass(driver,"Selected Chart's Tab is present in the Published Dashboard page");
				PublishTabDisplay=true;
			}else {
				fail(driver,"Selected Chart's Tab is not present in the Published Dashboard page");
			}
		}catch(Exception e) {
			fail(driver,"Selected Chart's Tab is not present in the Published Dashboard page "+e.getLocalizedMessage());
			System.out.println("tab checking failed...............single chart");
		}
		
		if(PublishTabDisplay==true) {
			 WebElement selectedTab=driver.findElement(By.xpath("//li[contains(@id,'"+CurrentTab_ID+"')]//a"));
			 String tabText=selectedTab.getText();
			 if(tabText.equals(CurrentTab_Text)) {
				 pass(driver,"Tab Name correctly displayed in the Published Dashboard page");
			 }else {
				 fail(driver,"Different Tab name diplayed in the Published Dashboard page");
			 }
			 
			 action.moveToElement(selectedTab).click().build().perform();
			 wait(driver,"1");
			 elementnotvisible1(driver, RPE_Loading);//Loading
			 System.out.println("tab clicked pass...............single chart");
			 boolean Chart1=false;
			 boolean Chart2=false;
			 if(isDisplayed(driver,PublishedChart_1)) {
				 Chart1=true;
				 pass(driver,"Selected Chart displayed in the Published Dashboard Page");
				 mouseOverToElement(driver, PublishedChart_1);
				 verifyElementDisplayed(driver, editeChart);
				 verifyElementDisplayed(driver, SortingSec);
				 verifyElementDisplayed(driver, deteleBtn_chart);
				 verifyElementDisplayed(driver, TableView_icon);
					 
			 }else {
				 fail(driver,"Selected Chart not displayed in the Published Dashboard Page");
			 }
		
			 if(!isDisplayed(driver,PublishedChart_2)) {
				 Chart2=true;
			 }else {
				 fail(driver,"Non-Selected Chart also diplayed in the published Dashboard page for single selection");
			 }
			 
			 if(Chart1==true && Chart2==true) {
				 pass(driver,"Publishing single Chart Working properly");
			 }else {
				 fail(driver,"Publishing single chart not working properly");
			 }
			 
			 try {
				 WebElement deleteTab=driver.findElement(By.xpath("//li[contains(@id,'"+CurrentTab_ID+"')]/i[@title='Delete Tab']"));
				 action.moveToElement(deleteTab).click().build().perform();
				 waitForElement(driver,DeleteTab);
				 click(driver,DeleteTab);
				 wait(driver,"1");
				 elementnotvisible1(driver, RPE_Loading);
				 
			 }catch(Exception e) {
				 fail(driver,"Unable to delete the Tab");
			 }
			 
		}
		
		verifyElementDisplayed(driver, ExportPDF);
		verifyElementDisplayed(driver, MYCharts);
		
		click(driver,MYCharts);
		elementnotvisible1(driver, RPE_Loading);
		waitForElement(driver, MY_ChartsPage);
		
		WebElement tabPerform=driver.findElement(By.xpath("//li[@id='"+CurrentTab_ID+"']"));
		action.moveToElement(tabPerform).click().build().perform();
		wait(driver,"1");
		elementnotvisible1(driver, RPE_Loading);
		
		//Tab Publishing Start.....
		
		waitForElement(driver,CurrentTabCheckBox);
		mouseOverAndClick(driver, CurrentTabCheckBox);
		wait(driver,"1");
		
		if(isElementSelected(driver, Chart1_Checkbox) && isElementSelected(driver, Chart2_Checkbox)) {
			pass(driver,"All the chart's Checkboxt Selected when click the Tab Checkbox");
		}else {
			fail(driver," All chart's Checkbox not Selected when click the Tab Checkbox");
		}
		
		mouseOverAndClick(driver, Chart1_Checkbox);
		wait(driver,"1");
		if(!isElementSelected(driver, Chart1_Checkbox)) {
			pass(driver,"Selected chart deselected Succesfully ");
			mouseOverAndClick(driver, Chart1_Checkbox);
			wait(driver,"1");
			if(isElementSelected(driver, Chart1_Checkbox)) {
				pass(driver,"Deselected Chart get selected after click on it");
			}else {
				fail(driver,"Deselected Chart not get selected after click on it");
			}
		}else {
			fail(driver,"Selected chart not deselected Succesfully");
		}
		
		click(driver,Publish);
		wait(driver,"2");
		if(isDisplayed(driver,Publish_Success)) {
			pass(driver,"'Published successfully' message displayed after publish the selected chart ");
		}else {
			fail(driver,"'Published successfully' message not displayed after publish the selected chart ");
		}
		
		elementnotvisible(driver, Publish_Success);
		System.out.println("Publish Success Closed.....");
		PublishFlagg=getWebElement(driver, Chart1_Flag).getCssValue("border-color");
		System.out.println("PublishFlagg : "+PublishFlagg);
		rgb=RGB(PublishFlagg);
		PublishedFlagColor_Act= rgbToHex1(rgb);
		System.out.println("PublishedChartColor : "+PublishedChartColor+",  PublishedFlagColor_Act : "+PublishedFlagColor_Act);

		PublishFlagg2=getWebElement(driver, Chart2_Flag).getCssValue("border-color");
		String rgb2=RGB(PublishFlagg2);
		String PublishedFlagColor_Act2= rgbToHex1(rgb2);
		
		if((isDisplayed(driver,Chart1_Flag) && PublishedFlagColor_Act2.equalsIgnoreCase(PublishedChartColor)) && (isDisplayed(driver,Chart2_Flag) && PublishedFlagColor_Act.equalsIgnoreCase(PublishedChartColor))) {
			pass(driver,"All the charts get Flagged to red color After Tab Publish");
		}else {
			fail(driver,"All the charts not get Flagged to red color After Tab Publish");
		}
		
		mouseOverAndClick(driver,Publish_Dashboard);
		wait(driver,"1");
		elementnotvisible1(driver, RPE_Loading);//Loading
		waitForElement(driver,PublishedChartPage);
		
		boolean PublishTabDisplay2=false;
		try {
			WebElement selectedTab=driver.findElement(By.xpath("//li[contains(@id,'"+CurrentTab_ID+"')]//a"));
			if(selectedTab.isDisplayed()) {
				pass(driver,"Selected Tab is present in the Published Dashboard page");
				PublishTabDisplay2=true;
			}else {
				fail(driver,"Selected Tab is not present in the Published Dashboard page");
			}
		}catch(Exception e) {
			fail(driver,"Selected Tab is not present in the Published Dashboard page "+e.getLocalizedMessage());
		}
		
		if(PublishTabDisplay2==true) {
			 WebElement selectedTab=driver.findElement(By.xpath("//li[contains(@id,'"+CurrentTab_ID+"')]//a"));
			 String tabText=selectedTab.getText();
			 if(tabText.equals(CurrentTab_Text)) {
				 pass(driver,"Tab Name correctly displayed in the Published Dashboard page");
			 }else {
				 fail(driver,"Different Tab name diplayed in the Published Dashboard page");
			 }
			 
			 action.moveToElement(selectedTab).click().build().perform();
			 wait(driver,"1");
			 elementnotvisible1(driver, RPE_Loading);//Loading
			 
			 boolean Chart1=false;
			 boolean Chart2=false;
			 if(isDisplayed(driver,PublishedChart_1)) {
				 Chart1=true;
				 pass(driver,"Chart1 displayed in the Published Dashboard Page for Tab Publish");
				 mouseOverToElement(driver, PublishedChart_1);
				 verifyElementDisplayed(driver, editeChart);
				 verifyElementDisplayed(driver, SortingSec);
				 verifyElementDisplayed(driver, deteleBtn_chart);
				 verifyElementDisplayed(driver, TableView_icon);
					 
			 }else {
				 fail(driver,"Chart1 not displayed in the Published Dashboard Page for Tab Publish");
			 }
			 
			 if(isDisplayed(driver,PublishedChart_2)) {
				 Chart2=true;
				 pass(driver,"Chart2 diplayed in the Published Dashboard Page for Tab Publish");
			 }else {
				 fail(driver,"Chart2 not diplayed in the Published Dashboard Page for Tab Publish");
			 }
			 
			 if(Chart1==true && Chart2==true) {
				 pass(driver,"Tab Publishing Working properly");
			 }else {
				 fail(driver,"Tab Publishing not working properly");
			 }
			 
			 try {
				 WebElement deleteTab=driver.findElement(By.xpath("//li[contains(@id,'"+CurrentTab_ID+"')]/i[@title='Delete Tab']"));
				 action.moveToElement(deleteTab).click().build().perform();
				 waitForElement(driver,DeleteTab);
				 click(driver,DeleteTab);
				 wait(driver,"1");
				 elementnotvisible1(driver, RPE_Loading);//Loading
				 
			 }catch(Exception e) {
				 fail(driver,"Unable to delete the Tab");
			 }
			 
		}
		
		//Tab Publishing completed.....
		
		mouseOverAndClick(driver,MYCharts);
		elementnotvisible1(driver, RPE_Loading);//Loading
		waitForElement(driver, MY_ChartsPage);
		
		tabPerform=driver.findElement(By.xpath("//li[@id='"+CurrentTab_ID+"']"));
		action.moveToElement(tabPerform).click().build().perform();
		wait(driver,"1");
		elementnotvisible1(driver, RPE_Loading);//Loading
		
		if(verifyElementDisplayed(driver, RefreshButton)) {
			mouseOverAndClick(driver, RefreshButton);
			if(isDisplayed(driver,Refreshing)) {
				pass(driver,"Page getting refreshing after click the Refresh button");
			}else {
				fail(driver,"Page not getting refreshing after click the Refresh button");
			}
			
			elementnotvisible1(driver, Refreshing);
			elementnotvisible1(driver, RPE_Loading);
			mouseOverToElement(driver, RefreshButton);
			if(isDisplayed(driver,Refreshed)) {
				pass(driver,"Latest Refreshed details displayed successfully");
			}else {
				fail(driver,"Latest Refreshed details not displayed ");
			}
			
		}
		
		elementnotvisible1(driver, RPE_Loading);
		tabPerform=driver.findElement(By.xpath("//li[@id='"+CurrentTab_ID+"']"));
		action.moveToElement(tabPerform).click().build().perform();
		wait(driver,"1");
		elementnotvisible1(driver, RPE_Loading);//Loading
		
		waitForElement(driver, ExportPDF);
		click(driver,ExportPDF);
		
		if(verifyElementDisplayed(driver, ExportPDF_Popup)) {
			waitForElement(driver, Title_Input);
			sendKeys(driver,Title_Input,ExportPdf_Title);
			waitForElement(driver, SubTitle_Input);
			sendKeys(driver,SubTitle_Input,ExportPdf_Sub_Title);
			click(driver,ExportBtn);
			waitForElement(driver,RPE_Loading);
			elementnotvisible1(driver, RPE_Loading);//Loading
			pass(driver,"Export PDF performed successfully");
		}
		
		mouseOverAndClick(driver, TabFilterActive);
		waitForElement(driver,DataSetTabVariable);
		String DataSetName=getText(driver, DataSetTabVariable);
		
		mouseOverAndClick(driver, DataExplorer);
		elementnotvisible1(driver, RPE_Loading);//Loading
		
		if(isDisplayed(driver,Data_analysis_projects)) {
			pass(driver,"Navigation from Dash Pro to Project page is Successfull");
			
		}else {
			fail(driver,"Navigation from Dash Pro to Project page is not Successfull");
		}
		waitForElement(driver,ProjectsSearch);
		click(driver,ProjectsSearch);
		sendKeys(driver,ProjectsSearch,ProjectName);
		wait(driver,"1");
		String FirstProjectNameExp=ProjectName.toLowerCase();
		if(isDisplayed(driver,FirstProjectName)) {
			String FirstSearchedProjectName=getText1(driver,FirstProjectName).toLowerCase();
			
			if(FirstSearchedProjectName.contains(FirstProjectNameExp)) {
				pass(driver,"Projects search Bar working Properly");
			}else {
				fail(driver,"Projects search Bar not working Properly");
			}
			
		}else {
			fail(driver,"No Projects available after searching the name");
		}
		
//		WebElement ProjectEle=driver.findElement(By.xpath("//table[@id='parentTable']//td//span[contains(text(),' "+FirstProjectNameExp+"')]"));
//		action.moveToElement(ProjectEle).build().perform();
		
		mouseOverToElement(driver, FirstProjectName);
		mouseOverAndClick(driver,RenameProject);
//		boolean renameClick=RenameClick(driver,FirstProjectNameExp);
		
        	if(isDisplayed(driver,RenameProjectNameInput)) { 
        		 
        		 clear1(driver,RenameProjectNameInput);
        		 click3(driver,Data_analysis_projects);
        		 elementnotvisible(driver, Loading);
        		 if(isDisplayed(driver,InvalidRenameError)) {
        			pass(driver,"Validation shows when rename without project name");
        			elementnotvisible(driver, InvalidRenameError);
        		 }else {
        			fail(driver,"Validation not shows when rename without project name");
        		 }
        		
//        		 boolean renameClick1=RenameClick(driver,FirstProjectNameExp);
        		 mouseOverAndClick(driver,RenameProject);
        		
        			    if(isDisplayed(driver,RenameProjectNameInput)) {
        			    	
        			    	click(driver,RenameProjectNameInput);
        			    	clear1(driver,RenameProjectNameInput);
        			    	
        			    	sendKeys(driver,RenameProjectNameInput,RenameProjectName);
        			    	click3(driver,Data_analysis_projects);
        			    	elementnotvisible(driver, Loading);
        			    	WebElement renamedElem=null;
        			    	try {
            			    	 renamedElem=driver.findElement(By.xpath("//table[@id='parentTable']//td//span[contains(text(),' "+RenameProjectName+"')]"));
        			    	}catch(Exception e) {
        			    		System.out.println("Renameed project not present....failed");
            	    		}
        			    	
        			    	if(renamedElem.isDisplayed()) {
        			    		pass(driver,"Renamed Project name sucessfully");
        			    		verifyElementDisplayed(driver, ProjectRenameSuccess);
        			    		boolean renameClick2=RenameClick(driver,RenameProjectName);
            			    	if(renameClick2==true) {
            			    		click(driver,RenameProjectNameInput);
            			    		clear1(driver,RenameProjectNameInput);
                			    	sendKeys(driver,RenameProjectNameInput,ProjectName);
                			    	click3(driver,Data_analysis_projects);
                			    	try {
                   			    	 renamedElem=driver.findElement(By.xpath("//table[@id='parentTable']//td//span[contains(text(),' "+ProjectName+"')]"));
                			    	}catch(Exception e) {
                			    		System.out.println("Rename the project name into original name....failed");
                			    	}
            			    	}
        			    	}else {
        			    		fail(driver,"Renamed Project name not sucessful");
        			    	}
        			    	
        			    }else {
        			    	fail(driver,"Rename input not present");
        			    }
        		 
        		
        	}else {
		    	fail(driver,"Rename input not present");
		    }
        	
        	WebElement ProjectExpEle=driver.findElement(By.xpath("(//table[@id='parentTable']//td//span[contains(text(),'"+ProjectName+"')]//ancestor::tr[1]//button//mat-icon)[1]"));
    		String ProjectExpCheck=ProjectExpEle.getAttribute("class");
    		if(!ProjectExpCheck.contains("arrow-up")) {
    			ProjectExpEle.click();
    			elementnotvisible1(driver, Loading);
    			ProjectExpCheck=ProjectExpEle.getAttribute("class");
    			if(ProjectExpCheck.contains("arrow-up")) {
    				pass(driver,"Project Expanded after click on it ");
    			}else {
    				fail(driver,"Project not Expanded after click on it ");
    			}
    		}
    		
    		boolean recentDataset=false;
    		try {
    			WebElement LastExecutedDataset=driver.findElement(By.xpath("//label[contains(text(),'"+DataSetName+"')]"));
    			if(LastExecutedDataset.isDisplayed()) {
    				pass(driver,"Recently saved dataset is diplayed inside the project");
    				recentDataset=true;
    			}else {
    				fail(driver,"Recently saved dataset is not diplayed inside the project");
    			}
    		}catch(Exception e) {
    			fail(driver,"Unable to find the Recently saved dataset inside the project : "+DataSetName);
    		}
        	
    		if(recentDataset==true) {
    			
    			verifyElementDisplayed(driver,UploadOption);
    			verifyElementDisplayed(driver,DeleteOption);
    			verifyElementDisplayed(driver,DownloadOption);
    			verifyElementDisplayed(driver,PipelineOption);
    			verifyElementDisplayed(driver,SharDatasetOption);
    			verifyElementDisplayed(driver,InformationOption);
    			
//    			verifyElementDisplayed(driver,UploadOption);
//    			verifyElementDisplayed(driver,UploadOption);
//    			verifyElementDisplayed(driver,UploadOption);

    			click(driver,DownloadOption);
    			elementnotvisible1(driver,Loading);
    			click(driver,PipelineOption);
    			elementnotvisible1(driver,Loading);
    			if(isDisplayed(driver,MyActivity)) {
    				pass(driver,"My Activity page is displayed after click on the Pipeline Activity");
    				click(driver,CloseMyActivity);
    				wait(driver,"1");
    				if(isDisplayed2(driver,MyActivity)) {
    					fail(driver,"My Activity page is not closed after click the close button");
    				}else {
    					pass(driver,"My Activity page is closed after click the close button");
    				}
    			}else {
    				fail(driver,"My Activity page is not displayed after click on the Pipeline Activity");	
    			}
    			
    			mouseOverAndClick(driver, FirstDatasetCheckbox);
    			
    			if(IsElementEnabled(driver,ShareOption)) {
    				pass(driver,"Share Option is enabled after select the dataset checkbox");
    				click(driver,ShareOption);
    				elementnotvisible(driver, Loading);
    				if(verifyElementDisplayed(driver, ShareListPage)) {
    					waitForElement(driver, ShareEmailInput);
    					sendKeys(driver, ShareEmailInput, Dataset_ShareEmailId);
    					wait(driver,"1");
    					click(driver,ShareButton);
    					verifyElementDisplayed(driver, ShareError);
    					mouseOverAndClick(driver, FirstCheckbox);
    					wait(driver,"1");
    					click(driver,ShareButton);
    					elementnotvisible(driver, Loading);
    					verifyElementDisplayed(driver, ShareSuccess);
    				}
    			}else {
    				fail(driver,"Share Option is not enabled after select the dataset checkbox");
    			}
  
    			ProjectExpEle=driver.findElement(By.xpath("(//table[@id='parentTable']//td//span[contains(text(),'"+ProjectName+"')]//ancestor::tr[1]//button//mat-icon)[1]"));
        		ProjectExpCheck=ProjectExpEle.getAttribute("class");
        		if(!ProjectExpCheck.contains("arrow-up")) {
        			ProjectExpEle.click();
        			elementnotvisible1(driver, Loading);
        			ProjectExpCheck=ProjectExpEle.getAttribute("class");
        			if(ProjectExpCheck.contains("arrow-up")) {
        				pass(driver,"Project Expanded after click on it ");
        			}else {
        				fail(driver,"Project not Expanded after click on it ");
        			}
        		}
        		
        		if(IsElementEnabled(driver, InformationOption)) {
        			pass(driver,"Information option get enabled after Share the file");
        			mouseOverToElement(driver, InformationOption);
        			if(isDisplayed(driver, InformationTooltiptext)) {
        				pass(driver,"Information tooltip text displayed when mouse hover on information option");
        			}else {
        				fail(driver,"Information tooltip text not displayed when mouse hover on information option");
        			}
        			
        		}else {
        			fail(driver,"Information option not get enabled after Share the file");
        		}
        		
        		click(driver,DashProOption);
        		elementnotvisible1(driver, Loading);
        		elementnotvisible1(driver, RPE_Loading);
        		if(isDisplayed(driver,DashProPage) && isDisplayed(driver, ADD_widget_rightTop)) {
        			pass(driver,"Navigation from Project page to Dashpro is Successfull");
        			
        			mouseOverAndClick(driver, DataExplorer);
        			elementnotvisible1(driver, Loading);//Loading
        			if(isDisplayed(driver,Data_analysis_projects)) {
        				pass(driver,"Navigation from Dash Pro to Project page is Successfull");
        			}else {
        				fail(driver,"Navigation from Dash Pro to Project page is not Successfull");
        			}
        			mouseOverToElement(driver, Data_analysis_projects);
        			wait(driver,"1");
        		}else {
        			fail(driver,"Navigation from Project page to Dashpro is Successfull");
        		}
        		
        		ProjectExpEle=driver.findElement(By.xpath("(//table[@id='parentTable']//td//span[contains(text(),'"+ProjectName+"')]//ancestor::tr[1]//button//mat-icon)[1]"));
         		ProjectExpCheck=ProjectExpEle.getAttribute("class");
         		if(!ProjectExpCheck.contains("arrow-up")) {
         			ProjectExpEle.click();
         			elementnotvisible1(driver, Loading);
         			ProjectExpCheck=ProjectExpEle.getAttribute("class");
         			if(ProjectExpCheck.contains("arrow-up")) {
         				pass(driver,"Project Expanded after click on it ");
         			}else {
         				fail(driver,"Project not Expanded after click on it ");
         			}
         		}
         		
         		if(verifyElementDisplayed(driver, UploadData)) {
         			
         			click(driver,UploadData);
         			elementnotvisible1(driver, Loading);
         			waitForElement1(driver,AddFiles);
         			uploadfile(driver,filepath);
         		}
         		
         		waitForElement1(driver,Upload_Btn);
        		click(driver,Upload_Btn);
        		elementnotvisible1(driver,upload_wait);
        		elementnotvisible1(driver,Loading);
        		verifyElementDisplayed(driver,fileUploaded_1);
        		verifyElementDisplayed(driver,fileUploaded_2);
        		verifyElementDisplayed(driver,fileUploaded_3);
//        		//elementnotvisible1(driver,fileUploaded_2);
        		elementnotvisible1(driver,Loading1);
        		
                if(isDisplayed(driver,Preview_text)) {
                	pass(driver,"Preview page is displayed after uploading the file");
                }else {
                	fail(driver,"Preview page is not displayed after uploading the file");
                }
         		
                
                mouseOverAndClick(driver, DataExplorer);
    			elementnotvisible1(driver, Loading);//Loading
    			if(isDisplayed(driver,Data_analysis_projects)) {
    				pass(driver,"Navigation from Dash Pro to Project page is Successfull");
    			}else {
    				fail(driver,"Navigation from Dash Pro to Project page is not Successfull");
    			}
                
    			mouseOverToElement(driver, Data_analysis_projects);
    			wait(driver,"1");
    			ProjectExpEle=driver.findElement(By.xpath("(//table[@id='parentTable']//td//span[contains(text(),'"+ProjectName+"')]//ancestor::tr[1]//button//mat-icon)[1]"));
         		ProjectExpCheck=ProjectExpEle.getAttribute("class");
         		if(!ProjectExpCheck.contains("arrow-up")) {
         			ProjectExpEle.click();
         			elementnotvisible1(driver, Loading);
         			ProjectExpCheck=ProjectExpEle.getAttribute("class");
         			if(ProjectExpCheck.contains("arrow-up")) {
         				pass(driver,"Project Expanded after click on it ");
         				scrollUsingElement(driver, UploadData);
         			}else {
         				fail(driver,"Project not Expanded after click on it ");
         			}
         		}
         		
         		boolean recentuploadFile=false;
        		try {
        			WebElement LatestUploadedData=driver.findElement(By.xpath("//label[contains(text(),'"+FileName+"')]"));
        			if(LatestUploadedData.isDisplayed()) {
        				pass(driver,"Recently uploaded datafile is diplayed inside the project");
        				recentuploadFile=true;
        			}else {
        				fail(driver,"Recently uploaded datafile is not diplayed inside the project");
        			}
        		}catch(Exception e) {
        			fail(driver,"Unable to find the Recently uploaded datafile inside the project : "+FileName);
        		}
    			
    			if(recentuploadFile==true) {
    				
    				mouseOverToElement(driver,UploadOption);
    				verifyElementDisplayed(driver, UploadTooltip);
    				click(driver,UploadOption);
    				elementnotvisible1(driver, Loading);
    				elementnotvisible1(driver, Loading1);
    				if(isDisplayed(driver,Preview_text)) {
                    	pass(driver,"Preview page is displayed after uploading the file");
                    }else {
                    	fail(driver,"Preview page is not displayed after uploading the file");
                    }
             		
                    
                    mouseOverAndClick(driver, DataExplorer);
        			elementnotvisible1(driver, Loading);//Loading
        			if(isDisplayed(driver,Data_analysis_projects)) {
        				pass(driver,"Navigation from Dash Pro to Project page is Successfull");
        			}else {
        				fail(driver,"Navigation from Dash Pro to Project page is not Successfull");
        			}
        			mouseOverToElement(driver, Data_analysis_projects);
        			wait(driver,"1");
        			ProjectExpEle=driver.findElement(By.xpath("(//table[@id='parentTable']//td//span[contains(text(),'"+ProjectName+"')]//ancestor::tr[1]//button//mat-icon)[1]"));
             		ProjectExpCheck=ProjectExpEle.getAttribute("class");
             		if(!ProjectExpCheck.contains("arrow-up")) {
             			ProjectExpEle.click();
             			elementnotvisible1(driver, Loading);
             			ProjectExpCheck=ProjectExpEle.getAttribute("class");
             			if(ProjectExpCheck.contains("arrow-up")) {
             				pass(driver,"Project Expanded after click on it ");
             				scrollUsingElement(driver, UploadData);
             			}else {
             				fail(driver,"Project not Expanded after click on it ");
             			}
             		}
             		
             		wait(driver,"1");
             		if(isDisplayed(driver, DashProOptionDisable)) {
             			pass(driver,"dashpro icon disabled in project page when no charts perform on file");
             		}else {
             			fail(driver,"dashpro icon enabled in project page when no charts perform on file");
             		}
             		
             		mouseOverToElement(driver, DeleteOption);
             		verifyElementDisplayed(driver, DeleteTooltip);
             		click(driver,DeleteOption);
             		verifyElementDisplayed(driver, deleteOkButton);
             		click(driver,deleteOkButton);
             		if(isDisplayed(driver,Loading)) {
             			elementnotvisible1(driver, Loading);
             		}
             		if(verifyElementDisplayed(driver, FileDeleteSuccess)) {
             			elementnotvisible1(driver, FileDeleteSuccess);
             		}
    			}
         		
    			ProjectExpEle=driver.findElement(By.xpath("(//table[@id='parentTable']//td//span[contains(text(),'"+ProjectName+"')]//ancestor::tr[1]//button//mat-icon)[1]"));
         		ProjectExpCheck=ProjectExpEle.getAttribute("class");
         		if(!ProjectExpCheck.contains("arrow-up")) {
         			ProjectExpEle.click();
         			elementnotvisible1(driver, Loading);
         			ProjectExpCheck=ProjectExpEle.getAttribute("class");
         			if(ProjectExpCheck.contains("arrow-up")) {
         				pass(driver,"Project Expanded after click on it ");
         				scrollUsingElement(driver, UploadData);
         			}else {
         				fail(driver,"Project not Expanded after click on it ");
         			}
         		}

         		mouseOverAndClick(driver,DataFileCheckbox);
         		if(IsElementEnabled(driver, MultipleDeleteBtn)) {
     				pass(driver,"Multiple delete button get enabled after selecting the dataset checkbox");
     				click(driver,MultipleDeleteBtn);
     				verifyElementDisplayed(driver, deleteOkButton);
             		click(driver,deleteOkButton);
             		elementnotvisible(driver, deleteOkButton);
             		elementnotvisible1(driver, Loading);
     				if(verifyElementDisplayed(driver, FileDeleteSuccess)) {
     					elementnotvisible1(driver, FileDeleteSuccess);
     				}
     			}else {
     				fail(driver,"Multiple delete button not get enabled after selecting the dataset checkbox");
     			}
         		
         		mouseOverAndClick(driver,MultipleProjectCheckbox);
         		if(IsElementEnabled(driver, MultipleProjectDelete)) {
     				pass(driver,"Multiple Project delete button get enabled after selecting the project checkbox");
     				click(driver,MultipleProjectDelete);
     				verifyElementDisplayed(driver, deleteOkButton);
             		click(driver,deleteOkButton);
     				elementnotvisible1(driver, Loading);
     				if(verifyElementDisplayed(driver, ProjectDeleteSuccess)){
     					elementnotvisible1(driver, ProjectDeleteSuccess);
     				}
     			}else {
     				fail(driver,"Multiple Project delete button not get enabled after selecting the project checkbox");
     			}
         		
         		//  ...................................End..............................
         		
//         		List<WebElement> multiProjectCheckbox=getWebElements(driver, MultipleProjectCheckbox);
//         		if(multiProjectCheckbox.size()>0 && multiProjectCheckbox!=null) {
//         			 for(WebElement multiProjectCheckbo:multiProjectCheckbox) {
//         				 action.moveToElement(multiProjectCheckbo).click().build().perform();
//         			  }
//         			
//         			if(IsElementEnabled(driver, MultipleProjectDelete)) {
//         				pass(driver,"Multiple Project delete button get enabled after selecting the project checkbox");
//         				click(driver,MultipleProjectDelete);
//         				verifyElementDisplayed(driver, deleteOkButton);
//                 		click(driver,deleteOkButton);
//         				elementnotvisible1(driver, Loading);
//         				verifyElementDisplayed(driver, ProjectDeleteSuccess);
//         			}else {
//         				fail(driver,"Multiple Project delete button not get enabled after selecting the project checkbox");
//         			}
//         		}
    			
    		}
		
	}
	
	public boolean RenameClick(WebDriver driver,String ProjectName) {
		Actions action=new Actions(driver);
		boolean renameClick=false;
        try {
        	WebElement RenameEle=driver.findElement(By.xpath("//table[@id='parentTable']//td//span[contains(text(),' "+ProjectName+"')]//ancestor::tr[1]//button[@mattooltip='Rename']"));
    		action.moveToElement(RenameEle).click().build().perform();
    		pass(driver,"Rename Project button clicked");
    		renameClick=true;
    		return renameClick;
		}catch(Exception e) {
			fail(driver,"Rename Project button not clicked");
			return renameClick;
		}
        
	}

	
}
