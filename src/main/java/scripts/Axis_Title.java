package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class Axis_Title extends Keywords{

	public void axisTitle(WebDriver driver,String URL) {
		String Username = Utils.getDataFromTestData("SEDGE", "Username");
		String Password = Utils.getDataFromTestData("SEDGE", "Password");
		String AxisTextColorExp=Utils.getDataFromTestData("AxisTitle", "AxisTextColor_Exp");
		String X_Title_Exp=Utils.getDataFromTestData("AxisTitle", "X_Title_text");
		String Y_Title_Exp=Utils.getDataFromTestData("AxisTitle", "Y_Title_text");
		String FontFamily_Exp=Utils.getDataFromTestData("AxisTitle", "FontFamily_text");
		String default_FontFamily=Utils.getDataFromTestData("AxisTitle", "default_FontFamily");
		String Title_font_txt_Exp=Utils.getDataFromTestData("AxisTitle", "Title_font_txt");
		String default_FontSize_Exp=Utils.getDataFromTestData("AxisTitle", "default_FontSize");
		String X_FontSize_txt_Exp=Utils.getDataFromTestData("AxisTitle", "X_FontSize_txt_Exp");
		String Y_FontSize_txt_Exp=Utils.getDataFromTestData("AxisTitle", "Y_FontSize_txt_Exp");
		String X_Rotation_txt_Exp=Utils.getDataFromTestData("AxisTitle", "X_rotation_Exp");
		String Y_Rotation_txt_Exp=Utils.getDataFromTestData("AxisTitle", "Y_rotation_Exp");
		String RotationInputColor_Exp=Utils.getDataFromTestData("AxisTitle", "RotationInput_Color");
		String defaultRotation=Utils.getDataFromTestData("AxisTitle", "default_Rotation_Value");
		String SwitchSliderText_Exp=Utils.getDataFromTestData("AxisTitle", "SwitchSliderText_Exp");
		String X_Title_new=Utils.getDataFromTestData("AxisTitle", "X_Title_Input");
		String Y_Title_new=Utils.getDataFromTestData("AxisTitle", "Y_Title_Input");
		String Highlight_Color_Exp=Utils.getDataFromTestData("AxisTitle", "HighlightColor_Exp");
		String Selected_Color_Exp=Utils.getDataFromTestData("AxisTitle", "SelectedColor_Exp");
		String ChangeFontFamily=Utils.getDataFromTestData("AxisTitle", "Change_FontFamily");
		String ChangeTotalFontSize=Utils.getDataFromTestData("AxisTitle", "ChangeTotalFontSize");
		String change_X_label_FontSize=Utils.getDataFromTestData("AxisTitle", "X_label_FontSize");
		String change_Y_label_FontSize=Utils.getDataFromTestData("AxisTitle", "Y_label_FontSize");
		String X_Rotation_Input=Utils.getDataFromTestData("AxisTitle", "X_Rotation_Value");
		String Y_Rotation_Input=Utils.getDataFromTestData("AxisTitle", "Y_Rotation_Value");

		String Y_Axis_Type=Utils.getDataFromTestData("AxisTitle", "Y_Axis_Type");
		String X_Axis_Type=Utils.getDataFromTestData("AxisTitle", "X_Axis_Type");
		String X_Axis_Value=Utils.getDataFromTestData("AxisTitle", "X_Axis_Value");
		String Y_Axis_Value=Utils.getDataFromTestData("AxisTitle", "Y_Axis_Value");
		String SelectTargetValue=Utils.getDataFromTestData("AxisTitle", "TargetValue");


		String FileName=Utils.getDataFromTestData("SEDGE", "FileName1");
		String filepath=System.getProperty("user.dir") + "\\testdata\\"+FileName+".csv";
	
		navigateUrl(driver, URL);
		waitForElement1(driver,username_input);
		sendKeys(driver,username_input,Username);
		
		waitForElement1(driver,password_input);
		sendKeys(driver,password_input,Password);
		
        click(driver,SignIn_Btn);
		waitForElement1(driver,HomePage);

		waitForElement1(driver,Data_Analytics_page_link);
        click(driver,Data_Analytics_page_link);
        waitForElement1(driver,Create_project);
        elementnotvisible(driver,Loading);
        click(driver,Create_project);
        
        waitForElement1(driver,AddFiles);
		uploadfile(driver,filepath);

		String AddedFileName=getText(driver,FileName_text);
		if(AddedFileName.contains(FileName)) {
			passReport(driver,"Correct File Should Add, Expect Name : "+FileName ,"Correct File is Added, Actual name : "+AddedFileName);
		}else {
			failReport(driver,"Correct File Should Add, Expect Name : "+FileName,"Different File is Added, Actual name : "+AddedFileName);
		}
		
		waitForElement1(driver,Upload_Btn);
		click(driver,Upload_Btn);
//		waitForElement(driver,upload_wait);
		elementnotvisible(driver,upload_wait);
		waitForElement1(driver,fileUploaded_1);
		waitForElement1(driver,fileUploaded_2);
		waitForElement1(driver,fileUploaded_3);
		elementnotvisible(driver,fileUploaded_2);
		
        mouseOverToElement(driver,Preview);
		waitForElement(driver,Sampling_option);
		click(driver,Sampling_option);
		elementnotvisible(driver,Loading);
		waitForElement1(driver,ProfilingPage);
		waitForElement(driver,targetDrop);
		mouseOverToElement(driver,targetDrop);
		wait(driver,"1");
		click(driver,targetDrop);
		waitForElement1(driver,dropdown_expand);
		
		selectTarget(driver,SelectTargetValue);
		 
		 Actions act=new Actions(driver);
		 act.sendKeys(Keys.ESCAPE).build().perform();
		 waitForElement(driver,Statistics_icon);
		 click3(driver,Statistics_icon);
		 wait(driver,"2");
		 waitForElement(driver,Visual_icon);
         click3(driver,Visual_icon);
 		 elementnotvisible(driver,Loading);
		 waitForElement1(driver,DashProPage);
		 wait(driver,"3");
		 waitForElement1(driver,ADD_widget_rightTop);
         click(driver,ADD_widget_rightTop);
		 wait(driver,"3");
         waitForElement1(driver,WidgetPanel);
		 wait(driver,"1");
         waitForElement1(driver,Bar_widget);
		 click(driver,Bar_widget);
		 waitForElement1(driver,Y_Axis_dropdown);
		 click(driver,Y_Axis_dropdown);
		 waitForElement1(driver,Y_Axis_dropdownResults);
	     selectDropdownValue(driver,Y_Axis_Type,Y_Axis_Value);
		 wait(driver,"1");
		 
		 String Y_selectdropdownText=getText1(driver,Y_Axis_dropdown);
		 
		 if(Y_selectdropdownText.contains("(")) {
			 Y_selectdropdownText=getStringValue(Y_selectdropdownText);
		 }
		 Y_selectdropdownText=Y_selectdropdownText.trim();
		 
		 
		 waitForElement1(driver,X_Axis_dropdown);
		 click(driver,X_Axis_dropdown);
		 waitForElement1(driver,X_Axis_dropdownResults);
	     selectDropdownValue(driver,X_Axis_Type,X_Axis_Value);
		 wait(driver,"1");
		 String X_selectdropdownText=getText1(driver,X_Axis_dropdown);
		 if(X_selectdropdownText.contains("(")) {
			 X_selectdropdownText=getStringValue(X_selectdropdownText);
		 }
		 X_selectdropdownText=X_selectdropdownText.trim();
		 String aggValue=defaultSelectedValue(driver,aggregation);
		 
		 String sortOrderType=getAttribute1(driver,AscDes,"value");
		 
		 waitForElement(driver,ApplyButton);
		 mouseOverAndClick(driver,ApplyButton);
		 wait(driver,"1");
	     waitForElement(driver,Chart);
	     List<WebElement> moveElements=driver.findElements(By.xpath("//*[name()='tspan']"));
			for(WebElement ele:moveElements) {
				Actions act3=new Actions(driver);
				act3.moveToElement(ele).build().perform();
			}
			
		String Y_ChartText=getText1(driver,Y_Value);
        String X_ChartText=getText1(driver,X_Value);
	    
        if(Y_ChartText.equals(Y_selectdropdownText)) {
        	passReport(driver,"Selected Y Value should display in the Y Axis chart" ,"Selected Y Value displayed in the Y Axis chart");
        }else {
     	    failReport(driver,"Selected Y Value should display in the Y Axis chart","Selected Y Value not display in the Y Axis chart");
        }

        if((X_ChartText.contains(X_selectdropdownText))&& X_ChartText.contains(aggValue)) {
        	passReport(driver,"Selected X Value with agg should display in the X Axis chart" ,"Selected X Value with agg displayed in the X Axis chart");
        }else {
     	    failReport(driver,"Selected X Value with agg should display in the X Axis chart","Selected X Value with agg not display in the X Axis chart");
        }

		 
		 click(driver,AxisTitle);
		 wait(driver,"1");
		 String AxisExpand=getAttribute1(driver,AxisTitleExpand,"class");
     	 if(AxisExpand.contains("up")) {
			passReport(driver,"Axis Title Should Expand" ,"Axis Title is Expanded");
     	 }else {
     	    failReport(driver,"Axis Title Should Expand","Axis Title not Expand");
     	    Assert.fail();
     	 }
         
     	String AxisTextColor_Act=getTextColor(driver,AxisTitleExpand);
     	colorValidation(driver,AxisTextColorExp,AxisTextColor_Act,AxisTitle);
     	
     	if(verifyElementIsPresent1(driver,X_Title_text)) {
     		String X_Title_Act=getText1(driver,X_Title_text);
    		textValidation(driver,X_Title_Exp,X_Title_Act,X_Title_text);
     	}
     	 
     	if(verifyElementIsPresent1(driver,X_Title_input)) {
//     		WebElement element = driver.findElement(By.xpath("//input[@id='RPE_Xtitle']"));
//            String X_Title_inputAct = (String)((JavascriptExecutor)driver).executeScript("return arguments[0].value;", element);

     		String X_Title_inputAct=getTextJavascript(driver,X_Title_input);
     		System.out.println("X Title : "+X_Title_inputAct);
     		if(X_ChartText.equals(X_Title_inputAct)) {
    			passReport(driver,"By default, the Selected X-axis column name should display in the X-axis title input" ,"By default, the Selected X-axis column name displayed in the X-axis title input");
     		}else {
         	    failReport(driver,"By default, the Selected X-axis column name should display in the X-axis title input","By default, the Selected X-axis column name not displayed in the X-axis title input");
     		}	
     	}
     	
     	if(verifyElementIsPresent1(driver,Y_Title_text)) {
     		String Y_Title_Act=getText1(driver,Y_Title_text);
    		textValidation(driver,Y_Title_Exp,Y_Title_Act,Y_Title_text);
     	}
     	
     	if(verifyElementIsPresent1(driver,Y_Title_input)) {
     		
//     		WebElement element = driver.findElement(By.xpath("//input[@id='RPE_Ytitle']"));
//            String Y_Title_inputAct = (String)((JavascriptExecutor)driver).executeScript("return arguments[0].value;", element);

     		String Y_Title_inputAct=getTextJavascript(driver,Y_Title_input);
     		System.out.println("Y Title : "+Y_Title_inputAct);
     		if(Y_ChartText.equals(Y_Title_inputAct)) {
    			passReport(driver,"By default, the Selected Y-axis value should display in the Y-axis title input" ,"By default, the Selected Y-axis column name displayed in the Y-axis title input");
     		}else {
         	    failReport(driver,"By default, the Selected Y-axis value should display in the Y-axis title input","By default, the Selected Y-axis column name not displayed in the Y-axis title input");
     		}
     	}
     	
     	if(verifyElementIsPresent1(driver,fontFamilyText)){
     		String FontFamily_Act=getText1(driver,fontFamilyText);
    		textValidation(driver,FontFamily_Exp,FontFamily_Act,fontFamilyText);
     	}
     	
     	if(verifyElementIsPresent1(driver,fontFamily_dropdown)) {
     		
     		String fontFamily_Value=getText1(driver,fontFamily_dropdown);
     		System.out.println("FontFamily_Value : "+fontFamily_Value);
     		if(fontFamily_Value.equals(default_FontFamily)) {
    			passReport(driver,"By default, "+default_FontFamily+" should display in the Font Family input" ,"By default, "+fontFamily_Value+" displayed in the Font Family input");
     		}else {
         	    failReport(driver,"By default, "+default_FontFamily+" should display in the Font Family input","By default, "+fontFamily_Value+" displayed in the Font Family input");
     		}
     	}
     	
     	if(verifyElementIsPresent1(driver,titleFontSize)){
     		String TitleFontSize_txt_Act=getText1(driver,titleFontSize);
    		textValidation(driver,Title_font_txt_Exp,TitleFontSize_txt_Act,titleFontSize);
     	}
     	
     	if(verifyElementIsPresent1(driver,titleFontSizeDropdown)) {
     		
     		String font_Size_Act=defaultSelectedValue(driver,titleFontSizeDropdown);
     		System.out.println("Font_Size : "+font_Size_Act);
     		if(font_Size_Act.equals(default_FontSize_Exp)) {
    			passReport(driver,"By default, "+default_FontSize_Exp+" should display in the Font Size input" ,"By default, "+font_Size_Act+" displayed in the Font Size input");
     		}else {
         	    failReport(driver,"By default, "+default_FontSize_Exp+" should display in the Font Size input","By default, "+font_Size_Act+" displayed in the Font Size input");
     		}
     	}
     	
     	if(verifyElementIsPresent1(driver,X_axisFontSizeText)){
     		String X_FontSize_txt_Act=getText1(driver,X_axisFontSizeText);
    		textValidation(driver,X_FontSize_txt_Exp,X_FontSize_txt_Act,X_axisFontSizeText);
     	}
     	
     	if(verifyElementIsPresent1(driver,X_axisFontSizeDropdown)) {
     		
     		String X_font_Size_Act=defaultSelectedValue(driver,X_axisFontSizeDropdown);
     		System.out.println("X Font_Size : "+X_font_Size_Act);
     		if(X_font_Size_Act.equals(default_FontSize_Exp)) {
    			passReport(driver,"By default, "+default_FontSize_Exp+" should display in the X axis Font Size input" ,"By default, "+X_font_Size_Act+" displayed in the X axis Font Size input");
     		}else {
         	    failReport(driver,"By default, "+default_FontSize_Exp+" should display in the X axis Font Size input","By default, "+X_font_Size_Act+" displayed in the X axis Font Size input");
     		}
     	}
     	
     	if(verifyElementIsPresent1(driver,Y_axisFontSizeText)){
     		String Y_FontSize_txt_Act=getText1(driver,Y_axisFontSizeText);
    		textValidation(driver,Y_FontSize_txt_Exp,Y_FontSize_txt_Act,Y_axisFontSizeText);
     	}
     	
     	if(verifyElementIsPresent1(driver,Y_axisFontSizeDropdown)) {
     		
     		String Y_font_Size_Act=defaultSelectedValue(driver,Y_axisFontSizeDropdown);
     		System.out.println("Y Font_Size : "+Y_font_Size_Act);
     		if(Y_font_Size_Act.equals(default_FontSize_Exp)) {
    			passReport(driver,"By default, "+default_FontSize_Exp+" should display in the Y axis Font Size input" ,"By default, "+Y_font_Size_Act+" displayed in the Y axis Font Size input");
     		}else {
         	    failReport(driver,"By default, "+default_FontSize_Exp+" should display in the Y axis Font Size input","By default, "+Y_font_Size_Act+" displayed in the Y axis Font Size input");
     		}
     	}
     	
     	if(verifyElementIsPresent1(driver,X_RotationText)){
     		String X_Rotation_txt_Act=getText1(driver,X_RotationText);
    		textValidation(driver,X_Rotation_txt_Exp,X_Rotation_txt_Act,X_RotationText);
     	}
     	
     	if(verifyElementIsPresent1(driver,X_RotationOutputValue)){
     		String X_RotationValueAct=getText1(driver,X_RotationOutputValue);
     		System.out.println("X rotation : "+X_RotationValueAct);
     		if(X_RotationValueAct.equals(defaultRotation)) {
    			passReport(driver,"By default, '"+defaultRotation+"' should display in the X axis Rotation output field","By default, '"+X_RotationValueAct+"' displayed in the X axis Rotation output field");
     		}else {
         	    failReport(driver,"By default, '"+defaultRotation+"' should display in the X axis Rotation output field","By default, '"+X_RotationValueAct+"' displayed in the X axis Rotation output field");
     		}
    		String X_Rotation_Color_Act=getTextBackgroundColor(driver,X_RotationOutputValue);
    		colorValidation(driver,RotationInputColor_Exp,X_Rotation_Color_Act,X_RotationOutputValue);
     	}
     	
     	if(verifyElementIsPresent1(driver,Y_RotationText)){
     		String Y_Rotation_txt_Act=getText1(driver,Y_RotationText);
    		textValidation(driver,Y_Rotation_txt_Exp,Y_Rotation_txt_Act,Y_RotationText);
     	}
     	
     	if(verifyElementIsPresent1(driver,Y_RotationOutputValue)) {
     		String Y_RotationValueAct=getText1(driver,Y_RotationOutputValue);
     		System.out.println("Y rotation : "+Y_RotationValueAct);
     		if(Y_RotationValueAct.equals(defaultRotation)) {
    			passReport(driver,"By default, '"+defaultRotation+"' should display in the Y axis Rotation output field","By default, '"+Y_RotationValueAct+"' displayed in the Y axis Rotation output field");
     		}else {
         	    failReport(driver,"By default, '"+defaultRotation+"' should display in the Y axis Rotation output field","By default, '"+Y_RotationValueAct+"' displayed in the Y axis Rotation output field");
     		}
    		String Y_Rotation_Color_Act=getTextBackgroundColor(driver,Y_RotationOutputValue);
    		colorValidation(driver,RotationInputColor_Exp,Y_Rotation_Color_Act,Y_RotationOutputValue);
     	}
     	
     	
     	clearAndType(driver,X_Title_input,X_Title_new);
     	wait(driver,"1");
     	clearAndType(driver,Y_Title_input,Y_Title_new);
     	wait(driver,"1");
     	mouseOverToElement(driver,ApplyButton);
     	click3(driver,ApplyButton);
		
     	wait(driver,"1");
		waitForElement(driver,Chart);
		wait(driver,"1");
	    List<WebElement> moveElements1=driver.findElements(By.xpath("//*[name()='tspan']"));
			for(WebElement ele:moveElements1) {
				Actions act3=new Actions(driver);
				act3.moveToElement(ele).build().perform();
			}
			
		Y_ChartText=getText1(driver,Y_Value);
        X_ChartText=getText1(driver,X_Value);
	    
     	if(Y_ChartText.equals(Y_Title_new)) {
        	passReport(driver,"Given Y Title ("+Y_Title_new+") input value should display in the Y Axis chart" ,"Given Y Title ("+Y_ChartText+") input value displayed in the Y Axis chart");
     	}else {
        	failReport(driver,"Given Y Title ("+Y_Title_new+") input value should display in the Y Axis chart" ,"Y Title ("+Y_ChartText+") input value displayed in the Y Axis chart");
     	}
        
     	if(X_ChartText.equals(X_Title_new)) {
        	passReport(driver,"Given X Title ("+X_Title_new+") input value should display in the X Axis chart" ,"Given X Title ("+X_ChartText+") input value displayed in the X Axis chart");
     	}else {
        	failReport(driver,"Given X Title ("+X_Title_new+") input value should display in the X Axis chart" ,"X Title ("+X_ChartText+") input value displayed in the X Axis chart");
     	}
        
     	String fontFamily_Value=getText1(driver,fontFamily_dropdown);
     	click(driver,fontFamily_dropdown);
     	
     	if(verifyElementIsPresent1(driver,fontFamily_DropdownExpand)) {
        	passReport(driver,"Font family dropdown should expand" ,"Font family dropdown expanded");
        	mouseOverToElement(driver,SecondValue);
        	wait(driver,"1");
    		String mouseHighlightColor=getTextBackgroundColor(driver,SecondValue);
    		colorValidation(driver,Highlight_Color_Exp,mouseHighlightColor,"HighlightText>*");

    		String selectedColorAct=getTextBackgroundColor(driver,ListSelected);
    		String highlightText=getText1(driver,listSelectedText1);
    		if((fontFamily_Value.equals(highlightText))&&Selected_Color_Exp.equals(selectedColorAct)) {
    			 passReport(driver,"Selected Value ("+fontFamily_Value+") Should Highlight in Grey("+Selected_Color_Exp+") Color","Selected Value ("+highlightText+") Highlighted in Grey("+selectedColorAct+") Color");
    		}else {
         	    failReport(driver,"Selected Value ("+fontFamily_Value+") Should Highlight in Grey("+Selected_Color_Exp+") Color",highlightText+" Value Highlighted in "+selectedColorAct+" Color");
    		}
    		
         	ScrollBarValidation(driver,fontFamily_DropdownExpand,HighlightedFontFamily,"Font Family");
         	
         	List<WebElement> beforeSearchResults=getWebElements(driver,fontFamilyResults);
         	int beforeSearchSize=beforeSearchResults.size();
         	click(driver,dropdownInputsearchBox);
         	sendKeys(driver,dropdownInputsearchBox,ChangeFontFamily);
         	List<WebElement> afterSearchResults=getWebElements(driver,fontFamilyResults);
         	int afterSearchSize=afterSearchResults.size();
            String resultText=getText1(driver,fontFamilyFirstResult);
            if((beforeSearchSize>afterSearchSize)&&resultText.equals(ChangeFontFamily)) {
   			 passReport(driver,"Search input in the Font Family dropdown should works properly","Search input in the Font Family dropdown works properly");
            }else {
         	    failReport(driver,"Search input in the Font Family dropdown should works properly","Search input in the Font Family dropdown not works properly");
            }
         	
           	selectFontFamily(driver,ChangeFontFamily);
           	wait(driver,"1");
    		mouseOverAndClick(driver,ApplyButton);
         	wait(driver,"1");
           	waitForElement(driver,Chart);
    	    moveElements1=driver.findElements(By.xpath("//*[name()='tspan']"));
    			for(WebElement ele:moveElements1) {
    				Actions act3=new Actions(driver);
    				act3.moveToElement(ele).build().perform();
    			}
    		String fontFamily_Y_Act=getFontFamily(driver,Y_Value);
    		if(fontFamily_Y_Act.equals(ChangeFontFamily)) {
   			       passReport(driver,"Selected fontFamily ("+ChangeFontFamily+") Should Update in Y Axis chart value","Selected fontFamily ("+fontFamily_Y_Act+") Updated in Y Axis chart value");
    		}else {
         	    failReport(driver,"Selected fontFamily ("+ChangeFontFamily+") Should Update in Y Axis chart value","FontFamily ("+fontFamily_Y_Act+") Updated in Y Axis chart value");
    		}
           	
         	
        }else {
     	    failReport(driver,"Font family dropdown should expand","Font family dropdown not expanded");
     	    Assert.fail();
        }
     	
		click(driver,titleFontSizeDropdown);
		selectOptionValue(driver,titleFontSizeDropdown,ChangeTotalFontSize);
		wait(driver,"1");
		mouseOverAndClick(driver,ApplyButton);
     	wait(driver,"1");
       	waitForElement(driver,Chart);
	    moveElements1=driver.findElements(By.xpath("//*[name()='tspan']"));
			for(WebElement ele:moveElements1) {
				Actions act3=new Actions(driver);
				act3.moveToElement(ele).build().perform();
			}
			
		String fontSize_Y_Act=getFontSize(driver,Y_Value);
		String fontSize_X_Act=getFontSize(driver,X_Value);
		if((ChangeTotalFontSize.equals(fontSize_Y_Act))&&ChangeTotalFontSize.equals(fontSize_X_Act)) {
			passReport(driver,"Selected fontSize ("+ChangeTotalFontSize+") Should Update in X and Y Axis title chart value","FontFamily Updated in X-Axis Title ("+fontSize_X_Act+") and Y-Axis Title("+fontSize_Y_Act+") chart value");
		}else {
			failReport(driver,"Selected fontSize ("+ChangeTotalFontSize+") Should Update in X and Y Axis title chart value","FontFamily Updated in X-Axis Title ("+fontSize_X_Act+") and Y-Axis Title("+fontSize_Y_Act+") chart value");
		}
		
		click(driver,X_axisFontSizeDropdown);
		selectOptionValue(driver,X_axisFontSizeDropdown,change_X_label_FontSize);
		wait(driver,"1");
		mouseOverAndClick(driver,ApplyButton);
     	wait(driver,"1");
       	waitForElement(driver,Chart);
       	
       	String fontSize_X_label_Act=getFontSize(driver,X_AxisLabel_chart);
       	if(change_X_label_FontSize.equals(fontSize_X_label_Act)) {
		    passReport(driver,"Selected fontSize ("+change_X_label_FontSize+") Should Update in X Axis label chart value","Selected fontSize ("+fontSize_X_label_Act+") Updated in X Axis label chart value");
		}else {
  	       failReport(driver,"Selected fontSize ("+change_X_label_FontSize+") Should Update in X Axis label chart value","FontFamily ("+fontSize_X_label_Act+") Updated in X Axis label chart value");
		}
	
       	click(driver,Y_axisFontSizeDropdown);
		selectOptionValue(driver,Y_axisFontSizeDropdown,change_Y_label_FontSize);
		wait(driver,"1");
		mouseOverAndClick(driver,ApplyButton);
     	wait(driver,"1");
       	waitForElement(driver,Chart);
       	String fontSize_Y_label_Act=getFontSize(driver,Y_AxisLabel_chart);
    	if(change_Y_label_FontSize.equals(fontSize_Y_label_Act)) {
		    passReport(driver,"Selected fontSize ("+change_Y_label_FontSize+") Should Update in Y Axis label chart value","Selected fontSize ("+fontSize_Y_label_Act+") Updated in Y Axis label chart value");
		}else {
  	       failReport(driver,"Selected fontSize ("+change_Y_label_FontSize+") Should Update in Y Axis label chart value","FontSize ("+fontSize_Y_label_Act+") Updated in Y Axis label chart value");
		}
    	
     	wait(driver,"1");
     	moveSlider(driver,X_RotationInputSlider,X_RotationOutputValue,X_Rotation_Input);
     	wait(driver,"1");
		mouseOverAndClick(driver,ApplyButton);
     	wait(driver,"1");
       	waitForElement(driver,Chart);
     	
       	String X_label_Rotation_Act=getRotationValue(driver,X_AxisLabel_chart);
       	if(X_Rotation_Input.equals(X_label_Rotation_Act)) {
		    passReport(driver,"Selected Rotation Angle ("+X_Rotation_Input+") Should Update in X Axis label chart value","Selected Rotation Angle ("+X_label_Rotation_Act+") Updated in X Axis label chart value");
		}else {
  	       failReport(driver,"Selected Rotation Angle ("+X_Rotation_Input+") Should Update in X Axis label chart value","Rotation Angle ("+X_label_Rotation_Act+") Updated in X Axis label chart value");
		}
    	
       	wait(driver,"1");
     	moveSlider(driver,Y_RotationInputSlider,Y_RotationOutputValue,Y_Rotation_Input);
     	wait(driver,"1");
		mouseOverAndClick(driver,ApplyButton);
     	wait(driver,"1");
       	waitForElement(driver,Chart);
     	
       	String Y_label_Rotation_Act=getRotationValue(driver,Y_AxisLabel_chart);
       	if(Y_Rotation_Input.equals(Y_label_Rotation_Act)) {
		    passReport(driver,"Selected Rotation Angle ("+Y_Rotation_Input+") Should Update in Y Axis label chart value","Selected Rotation Angle ("+Y_label_Rotation_Act+") Updated in Y Axis label chart value");
		}else {
  	       failReport(driver,"Selected Rotation Angle ("+Y_Rotation_Input+") Should Update in Y Axis label chart value","Rotation Angle ("+Y_label_Rotation_Act+") Updated in Y Axis label chart value");
		}
       	
       	if(verifyElementIsPresent1(driver,switchSliderText)){
     		String SwitchSliderText_Act=getText1(driver,switchSliderText);
    		textValidation(driver,SwitchSliderText_Exp,SwitchSliderText_Act,switchSliderText);
     	}
       	
       	if(verifyElementIsPresent1(driver,switchSlider)){
     		String sliderColor=getTextBackgroundColor(driver,switchSlider);
       	    if(sliderColor.equalsIgnoreCase("#2196F3")) {
       	       failReport(driver,"By default, start axis at 0 toggle should disabled.","By default, start axis at 0 toggle enabled.");
       	    }else {
    	       passReport(driver,"By default, start axis at 0 toggle should disabled.","By default, start axis at 0 toggle disabled.");
       	    }
       	    
       	 if(sliderColor.equalsIgnoreCase("#2196F3")) {
       		 click(driver,switchSlider);
       	 }
       	 
       	mouseOverAndClick(driver,ApplyButton);
     	wait(driver,"1");
       	waitForElement(driver,Chart);
       	    
       	if(isDisplayed(driver,minimize)) {
        	click3(driver,minimize);
        }
       	
       	List<WebElement> yValues=getWebElements(driver,Y_AxisLabel_chart_Full);
       	int lastsize=yValues.size()-1;
       	String y_firstDesValue=driver.findElement(By.xpath("(//*[name()='g' and @transform and @aria-label]//*[name()='tspan'])["+lastsize+"]")).getText();
       	String y_firstAscValue=getText1(driver,Y_AxisLabel_chart_1);
       	
        if(sortOrderType.equals("desc")) {
        	if(!(y_firstAscValue.equals("0"))) {
    			passReport(driver,"Y axis label value should not start from 0 in the chart when toogle is disabled","Y axis label value not start from 0 in the chart, when toogle is disabled");
        	}else {
         	    failReport(driver,"Y axis label value should not start from 0 in the chart when toogle is disabled","Y axis label value started from 0 in the chart when toogle is disabled");
        	}	
        }else {
        	if(!(y_firstDesValue.equals("0"))) {
    			passReport(driver,"Y axis label value should not start from 0 in the chart when toogle is disabled ","Y axis label value should not start from 0 in the chart when toogle is disabled");
        	}else {
         	    failReport(driver,"Y axis label value should not start from 0 in the chart when toogle is disabled","Y axis label value started from 0 in the chart when toogle is disabled");
        	}
        	
        }
       	
       	String x_firstAscValue=getText1(driver,X_AxisLabel_chart_1);

        	if(!(x_firstAscValue.equals("0"))) {
    			passReport(driver,"X axis label value should not start from 0 in the chart when toogle is disabled","X axis label value started from '"+x_firstAscValue+"' in the chart, when toogle is disabled");
        	}else {
         	    failReport(driver,"X axis label value should not start from 0 in the chart when toogle is disabled","X axis label value started from '"+x_firstAscValue+"' in the chart when toogle is disabled");
        	}	
        
      
        
        click(driver,switchSlider);
    	mouseOverAndClick(driver,ApplyButton);
     	wait(driver,"1");
       	waitForElement(driver,Chart);
       	    
       	if(isDisplayed(driver,minimize)) {
        	click3(driver,minimize);
        }
       	
        yValues=getWebElements(driver,Y_AxisLabel_chart_Full);
       	lastsize=yValues.size()-1;
       	y_firstDesValue=driver.findElement(By.xpath("(//*[name()='g' and @transform and @aria-label]//*[name()='tspan'])["+lastsize+"]")).getText();
       	y_firstAscValue=getText1(driver,Y_AxisLabel_chart_1);
       	
       	if(sortOrderType.equals("desc")) {
        	if((y_firstAscValue.equals("0"))) {
    			passReport(driver,"Y axis label value should start from 0 in the Asc chart when toogle is enabled","Y axis label value started from 0 in the Asc chart when toogle is enabled");
        	}else {
         	    failReport(driver,"Y axis label value should start from 0 in the Asc chart when toogle is enabled","Y axis label value not started from 0 in the Asc chart when toogle is enabled");
        	}	
        }else {
        	if((y_firstDesValue.equals("0"))) {
    			passReport(driver,"Y axis label value should start from 0 in the Dsc chart when toogle is enabled ","Y axis label value started from 0 in the chart when toogle is enabled ");
        	}else {
         	    failReport(driver,"Y axis label value should start from 0 in the Dsc chart when toogle is enabled ","Y axis label value not started from 0 in the chart when toogle is enabled ");
        	}
        	
        }
       	
       	x_firstAscValue=getText1(driver,X_AxisLabel_chart_1);
       	if((x_firstAscValue.equals("0"))) {
			passReport(driver,"X axis label value should start from 0 in the chart when toogle is enabled ","X axis label value started from 0 in the chart when toogle is enabled ");
    	}else {
     	    failReport(driver,"X axis label value should start from 0 in the chart when toogle is enabled ","axis label value not started from 0 in the chart when toogle is enabled ");
    	}	
         	
     	}
       	
       	
       		
	}
       
}
