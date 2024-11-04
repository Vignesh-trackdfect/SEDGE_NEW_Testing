package scripts;

import org.openqa.selenium.WebDriver;

import commonMethods.Keywords;
import commonMethods.Utils;

public class PROJECT_SELECTION extends Keywords{

	public void projectSelection(WebDriver driver,int iteration) {

		String ProjectName=Utils.getDataFromTestDataIteration(iteration,"SEDGE", "SearchFile");

		waitForElement(driver,Data_Analytics_page_link);
		click(driver,Data_Analytics_page_link);
		elementnotvisible1(driver, Loading);
		waitForElement(driver,ProjectsSearch);
		click(driver,ProjectsSearch);
		sendKeys(driver,ProjectsSearch,ProjectName);
		elementnotvisible1(driver, Loading);
		mouseOverAndClick(driver, Expand_Button);
		elementnotvisible1(driver, Loading);
		waitForElement(driver, DashPro_icon_File);
		click(driver,DashPro_icon_File);
		elementnotvisible1(driver, Loading);
		waitForElement1(driver, visual_Analytics);
		mouseOverToElement(driver,visual_Analytics);
    	wait(driver,"1");
	    mouseOverAndClick(driver, DashPro_Option);
	    elementnotvisible1(driver,Loading);
	    waitForElementtopresent(driver,RPE_Loading);
	    if(isDisplayed(driver,RPE_Loading)) {
	    	elementnotvisible1(driver, RPE_Loading);
	    }
		
	}
}
