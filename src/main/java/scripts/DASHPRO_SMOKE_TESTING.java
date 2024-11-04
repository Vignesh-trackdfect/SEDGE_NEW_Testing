package scripts;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import commonMethods.Keywords;
import commonMethods.Utils;

public class DASHPRO_SMOKE_TESTING extends Keywords{

	public void dashProPage(WebDriver driver,int iteration) {
		
		String CenterWidget_X_Exp=Utils.getDataFromTestData("DataAnalytics", "CenterWidget_X");
		String CenterWidget_Y_Exp=Utils.getDataFromTestData("DataAnalytics", "CenterWidget_Y");
		String RightWidget_X_Exp=Utils.getDataFromTestData("DataAnalytics", "RightWidget_X");
		String RightWidget_Y_Exp=Utils.getDataFromTestData("DataAnalytics", "RightWidget_Y");
		String TargetValue=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input", "TargetValue");
		Actions action=new Actions(driver);
		waitForElement(driver,visual_Analytics);
		mouseOverToElement(driver,visual_Analytics);
    	if(!isDisplayed(driver,accessible)) {
    		mouseOverToElement(driver,Preview);
		    wait(driver,"1");
			waitForElement(driver,Sampling_option);
	        click(driver,Sampling_option);
	        elementnotvisible(driver,Loading);
	        waitForElement(driver,targetDrop);
	        mouseOverToElement(driver,targetDrop);
			click(driver,targetDrop);
	        selectTarget(driver,TargetValue);
	        wait(driver,"2");
	        if(isDisplayed(driver,target_Succes)) {
            	pass(driver,"\"Target added successfully\" popup displayed after selecting the target");
        	}else {
        		fail(driver,"\"Target added successfully\" popup not displayed after selecting the target");
        	}
	        
	        mouseOverToElement(driver,Statistics_icon);
			click(driver,Statistics_icon);
			wait(driver,"1");
	        mouseOverToElement(driver, Visual_icon);
	        click(driver,Visual_icon);
    	} 
    	
    	mouseOverToElement(driver,visual_Analytics);
    	wait(driver,"1");
	    mouseOverAndClick(driver, DashPro_Option);
	    elementnotvisible1(driver,Loading);
	    waitForElementtopresent(driver,RPE_Loading);
	    if(isDisplayed(driver,RPE_Loading)) {
	    	elementnotvisible1(driver, RPE_Loading);
	    }
	    wait(driver,"1");
	    if(isDisplayed(driver,DashProPage)) {
		   pass(driver,"Visual Analytics  clickable and dash pro page displayed ");
		   
		   if(isDisplayed(driver,defaultTab1)) {
		    	pass(driver,"By default Tab 1 is created in the dashboard page ");
		    }else {
		    	fail(driver,"By default Tab 1 is not created in the dashboard page ");
		    }
		    if(isDisplayed(driver,ADDTabPlus)) {
		    	pass(driver,"Add Tab '+' icon  is present in the dashboard page ");
		    }else {
		    	fail(driver,"Add Tab '+' icon  is not present in the dashboard page ");
		    }
		    
		    mouseOverToElement(driver, firstTab);
		    click(driver,firstTab);
		    doubleClick(driver,firstTab);
//		    click(driver,firstTab);
		    action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		    action.sendKeys(Keys.BACK_SPACE).build().perform();
		    sendKeys(driver,FirstTabInput,"Tab1&");
		    click(driver,DashProPage);
		    String updateTabText=getText1(driver,firstTab);
		    if(updateTabText.equals("Tab1&")) {
		    	pass(driver,"Tab 1 name gets edited Successfully");
		    }else {
		    	pass(driver,"Tab 1 name not edited Successfully");
		    }
		    wait(driver,"1");
		    mouseOverToElement(driver, ADDTabPlus);
		    mouseOverAndClick(driver, ADDTabPlus);
//		    click(driver,ADDTabPlus);
		    click(driver,DashProPage);
		    if(isDisplayed(driver,newTab)) {
		    	pass(driver,"New tab created Succesfully");
		    }else {
		    	fail(driver,"New tab not created Succesfully");
		    }
		    
		    mouseOverToElement(driver, FirstTabLink);
		    wait(driver,"1");
		    mouseOverAndClick(driver,FirstTabLink);
		    wait(driver,"1");
		    String firstTabOpenColor=getTextBackgroundColor(driver, FirstTabLink);
		    System.out.println("firstTabOpenColor :"+firstTabOpenColor);
		    if(firstTabOpenColor.equalsIgnoreCase("#eeeeee")) {
		    	pass(driver,"selected tab is displayed successfully");
		    }else {
		    	fail(driver,"selected tab is not displayed successfully");
		    }
		    
			if(isDisplayed(driver,Add_widget_center)) {
	   			pass(driver,"Center Add widget element is present ");
	   	        String[] postion= getPositionOfElement(driver,Add_widget_center);
	   	        String CenterWidget_X_Act=postion[0];
	   	        String CenterWidget_Y_Act=postion[1];
	   	        System.out.println(CenterWidget_X_Exp+" "+CenterWidget_Y_Exp);
	   	        if(CenterWidget_X_Exp.equals(CenterWidget_X_Act) && CenterWidget_Y_Exp.equals(CenterWidget_Y_Act)) {
	    			passReport(driver,"AddWidget Should Placed in the Center, X="+CenterWidget_X_Exp+" , Y="+CenterWidget_Y_Exp, "AddWidget Placed in the Center, X="+CenterWidget_X_Act+" , Y="+CenterWidget_Y_Act);
	   	        }else {
	   	        	passReport(driver,"AddWidget Should Placed in the Center, X="+CenterWidget_X_Exp+" , Y="+CenterWidget_Y_Exp,"AddWidget not Placed in the Center, X="+CenterWidget_X_Act+" , Y="+CenterWidget_Y_Act);
	   	        }

		   	}else { 
		   		fail(driver,"Center Add widget element is not present ");
		   	}
		    
		    if(isDisplayed(driver,ADD_widget_rightTop)) {
			    pass(driver,"Top right corner Add widget element is present ");
	   	        String[] postion= getPositionOfElement(driver,ADD_widget_rightTop);
	   	        String RightWidget_X_Act=postion[0];
	   	        String RightWidget_Y_Act=postion[1];
	   	        System.out.println(RightWidget_X_Exp+" "+RightWidget_Y_Exp);
	   	        if(RightWidget_X_Exp.equals(RightWidget_X_Act) && RightWidget_Y_Exp.equals(RightWidget_Y_Act)) {
	    			passReport(driver,"AddWidget Should Placed in the Top Right Position, X="+RightWidget_X_Exp+" , Y="+RightWidget_Y_Exp, "AddWidget Placed in the Top Right Position, X="+RightWidget_X_Act+" , Y="+RightWidget_Y_Act);
	   	        }else {
	   	        	passReport(driver,"AddWidget Should Placed in Top Right Position, X="+RightWidget_X_Exp+" , Y="+RightWidget_Y_Exp,"AddWidget not Placed in Top Right Position, X="+RightWidget_X_Act+" , Y="+RightWidget_Y_Act);
	   	        }  	        
		   	}else {    
		   		fail(driver,"Top right corner Add widget element is not present ");
		   	}
	    	   
		    verifyElementIsPresent1(driver, publicDashboard);
		    verifyElementIsPresent1(driver, GlobalFilter); 
		  
	    }else {  
		   fail(driver,"Visual Analytics not clickable and dash pro page not  displayed ");
	    }  
	}
	
}
