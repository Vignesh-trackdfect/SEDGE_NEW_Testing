package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import atu.testng.reports.logging.LogAs;
import commonMethods.Keywords;
import commonMethods.TestNgXml;
import commonMethods.Utils;

public class BAR_WIDGET_Test extends Keywords{

	
	boolean flag=true;
	public void barWidgetTest(WebDriver driver,String URL) {
		String Username = Utils.getDataFromTestData("SEDGE", "Username");
		String Password = Utils.getDataFromTestData("SEDGE", "Password");
		String Table_Widget_Exp=Utils.getDataFromTestData("Widgets", "Table_Widget_Exp");
		String Pivot_widget_Exp=Utils.getDataFromTestData("Widgets", "Pivot_widget_Exp");
		String Bar_widget_Exp=Utils.getDataFromTestData("Widgets", "Bar_widget_Exp");
		String Stacked_Bar_widget_Exp=Utils.getDataFromTestData("Widgets", "Stacked_Bar_widget_Exp");
		String Grouped_Bar_widget_Exp=Utils.getDataFromTestData("Widgets", "Grouped_Bar_widget_Exp");
		String Coloumn_widget_Exp=Utils.getDataFromTestData("Widgets", "Coloumn_widget_Exp");
		String Stacked_Column_widget_Exp=Utils.getDataFromTestData("Widgets", "Stacked_Column_widget_Exp");
		String Grouped_Column_widget_Exp=Utils.getDataFromTestData("Widgets", "Grouped_Column_widget_Exp");
		String Pie_widget_Exp=Utils.getDataFromTestData("Widgets", "Pie_widget_Exp");
		String Donut_widget_Exp=Utils.getDataFromTestData("Widgets", "Donut_widget_Exp");
		String SemiCircle_widget_Exp=Utils.getDataFromTestData("Widgets", "SemiCircle_widget_Exp");
		String SunBurst_widget_Exp=Utils.getDataFromTestData("Widgets", "SunBurst_widget_Exp");
		String WaterFall_widget_Exp=Utils.getDataFromTestData("Widgets", "WaterFall_widget_Exp");
		String Network_widget_Exp=Utils.getDataFromTestData("Widgets", "Network_widget_Exp");
		String Line_widget_Exp=Utils.getDataFromTestData("Widgets", "Line_widget_Exp");
		String Area_widget_Exp=Utils.getDataFromTestData("Widgets", "Area_widget_Exp");
		String Gantt_widget_Exp=Utils.getDataFromTestData("Widgets", "Gantt_widget_Exp");
		String Scatter_widget_Exp=Utils.getDataFromTestData("Widgets", "Scatter_widget_Exp");
		String Dumbel_plot_widget_Exp=Utils.getDataFromTestData("Widgets", "Dumbel_plot_widget_Exp");
		String Tree_map_widget_Exp=Utils.getDataFromTestData("Widgets", "Tree_map_widget_Exp");
		String HeatMap_Legend_widget_Exp=Utils.getDataFromTestData("Widgets", "HeatMap_Legend_widget_Exp");
		String GroupandSorted_widget_Exp=Utils.getDataFromTestData("Widgets", "GroupandSorted_widget_Exp");
		String Multiple_Axis_widget_Exp=Utils.getDataFromTestData("Widgets", "Multiple_Axis_widget_Exp");
		String Radar_Line_widget_Exp=Utils.getDataFromTestData("Widgets", "Radar_Line_widget_Exp");
		String Zoomable_Bubble_widget_Exp=Utils.getDataFromTestData("Widgets", "Zoomable_Bubble_widget_Exp");
		String Time_line_widget_Exp=Utils.getDataFromTestData("Widgets", "Time_line_widget_Exp");
		String Population_Pyramid_widget_Exp=Utils.getDataFromTestData("Widgets", "Population_Pyramid_widget_Exp");
		String Box_Plot_widget_Exp=Utils.getDataFromTestData("Widgets", "Box_Plot_widget_Exp");
		String Text_widget_Exp=Utils.getDataFromTestData("Widgets", "Text_widget_Exp");
		String BarLine_Scatter_widget_Exp=Utils.getDataFromTestData("Widgets", "BarLine_Scatter_widget_Exp");
		String Layered_Column_widget_Exp=Utils.getDataFromTestData("Widgets", "Layered_Column_widget_Exp");
		String Bullet_widget_Exp=Utils.getDataFromTestData("Widgets", "Bullet_widget_Exp");
		String Circose_widget_Exp=Utils.getDataFromTestData("Widgets", "Circose_widget_Exp");
		String Candle_stick_widget_Exp=Utils.getDataFromTestData("Widgets", "Candle_stick_widget_Exp");
		String MapWith_Bubble_widget_Exp=Utils.getDataFromTestData("Widgets", "MapWith_Bubble_widget_Exp");
		String Word_Cloud_widget_Exp=Utils.getDataFromTestData("Widgets", "Word_Cloud_widget_Exp");
		String Summary_widget_Exp=Utils.getDataFromTestData("Widgets", "Summary_widget_Exp");
		String Card_widget_Exp=Utils.getDataFromTestData("Widgets", "Card_widget_Exp");
		String KPI_Card_widget_Exp=Utils.getDataFromTestData("Widgets", "KPI_Card_widget_Exp");
		String Custom_Pivot_widget_Exp=Utils.getDataFromTestData("Widgets", "Custom_Pivot_widget_Exp");
		String Sparkline_widget_Exp=Utils.getDataFromTestData("Widgets", "Sparkline_widget_Exp");
		
		String AxesColor_Exp=Utils.getDataFromTestData("Axes", "Axes_Color_Exp");
		String ApplyBtn_text_Exp=Utils.getDataFromTestData("Axes", "Apply_Btn_Txt");
		String ApplyBtn_color_Exp=Utils.getDataFromTestData("Axes", "Apply_Btn_Color");
		String Highlight_color_Exp=Utils.getDataFromTestData("Axes", "HighlightColor");
		String Y_axis_text_Exp=Utils.getDataFromTestData("Axes", "Y_Axis_text");
		String X_axis_text_Exp=Utils.getDataFromTestData("Axes", "X_Axis_text");
		String Agg_text_Exp=Utils.getDataFromTestData("Axes", "Agg_text");
		String GroupText_Exp=Utils.getDataFromTestData("Axes", "Group_text");
		String limitValue=Utils.getDataFromTestData("Axes", "LimitValue");
		String SelectedTextColorExp=Utils.getDataFromTestData("Axes", "selectedValueColor");
		
		String Y_Axis_Type_1=Utils.getDataFromTestData("Axes", "Y_Axis_Type");
		String X_Axis_Type_1=Utils.getDataFromTestData("Axes", "X_Axis_Type");
		String X_Axis_Value_1=Utils.getDataFromTestData("Axes", "X_Axis_Value");
		String Y_Axis_Value_1=Utils.getDataFromTestData("Axes", "Y_Axis_Value");
		String SelectTargetValue=Utils.getDataFromTestData("Axes", "TargetValue");


//		System.out.println("Limit : "+limitValue);
		
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
		 waitForElement(driver,target_Succes);
		 waitForElement(driver,Statistics_icon);
		 click(driver,Statistics_icon);
		 waitForElement(driver,Visual_icon);
         click(driver,Visual_icon);
         wait(driver,"1");
		 waitForElement1(driver,DashProPage);
		 elementnotvisible(driver,Loading);
		 waitForElement1(driver,ADD_widget_rightTop);
		 mouseOverToElement(driver, ADD_widget_rightTop);
		 
         click(driver,ADD_widget_rightTop);
 		 elementnotvisible(driver,Loading);
         verifyElementIsPresent(driver,WidgetPanel);
         
         
//          try {
//        	  elementScreenShot_new(driver,AllWidgets,"/Expected_screenshot/Widgets/AllWidgets");
//        	  elementScreenShot_new(driver,AllWidgets,"/Actual_screenshot/Widgets/AllWidgets");
//				imageComparison(driver, "/Widgets/AllWidgets", "/Widgets/AllWidgets");
//				wait(driver, "2");
//			} catch (Exception e1) {
//				fail(driver,"Unable to compare the Images for AllWidgets");
//			}
         
         
		 //Bar Widget Testcase Validation Starts...
         if(verifyElementIsPresent1(driver,Table_widget)) {
        	 if(flag==true) {	
				try {
//					elementScreenShot_new(driver,Table_widget,"/Expected_screenshot/Widgets/Table_Widget");
					elementScreenShot_new(driver,Table_widget,"/Actual_screenshot/Widgets/Table_Widget");
					imageComparison(driver, "/Widgets/Table_Widget", "/Widgets/Table_Widget");
					wait(driver, "2");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
        	 }
         	mouseOverToElement(driver,Table_widget);
         	if(isDisplayed(driver,WidgetText)) {
         		String Table_widget_Act=getText1(driver,WidgetText);
    			passReport(driver,"Tooltip should display the name of the Table Widget " ,"Tooltip displays the name of the Table Widget");
        		textValidation(driver,Table_Widget_Exp,Table_widget_Act,Table_widget);	
         	}else {
    			failReport(driver,"Tooltip should display the name of the Table Widget ","Tooltip not display the name of the Table Widget ");
         	}
         }
		 
         
         if(verifyElementIsPresent1(driver,Pivot_widget)) {
        	 if(flag==true) {
				try {
//					elementScreenShot_new(driver,Pivot_widget,"/Expected_screenshot/Widgets/Pivot_widget");
					elementScreenShot_new(driver,Pivot_widget,"/Actual_screenshot/Widgets/Pivot_widget");
					imageComparison(driver, "/Widgets/Pivot_widget", "/Widgets/Pivot_widget");
					wait(driver, "2");
				} catch (Exception e1) {
					fail(driver,"Unable to compare the Images for Pivot_widget");
				}
        	 }
          	mouseOverToElement(driver,Pivot_widget);
          	if(isDisplayed(driver,WidgetText)) {
          		String Pivot_widget_Act=getText1(driver,WidgetText);
     			passReport(driver,"Tooltip should display the name of the Pivot Widget " ,"Tooltip displays the name of the Pivot Widget");
         		textValidation(driver,Pivot_widget_Exp,Pivot_widget_Act,Pivot_widget);
          		
          	}else {
     			failReport(driver,"Tooltip should display the name of the Pivot Widget ","Tooltip not display the name of the Pivot Widget");
          	}
          }
         
         
         if(verifyElementIsPresent1(driver,Stacked_Bar_widget)) {
        	 if(flag==true) {
				try {
//					elementScreenShot_new(driver,Stacked_Bar_widget,"/Expected_screenshot/Widgets/Stacked_Bar_widget");
					elementScreenShot_new(driver,Stacked_Bar_widget,"/Actual_screenshot/Widgets/Stacked_Bar_widget");
					imageComparison(driver, "/Widgets/Stacked_Bar_widget", "/Widgets/Stacked_Bar_widget");
					wait(driver, "2");
				} catch (Exception e1) {
					fail(driver,"Unable to compare the Images for Stacked_Bar_widget");
				}
        	 }
            	mouseOverToElement(driver,Stacked_Bar_widget);
            	if(isDisplayed(driver,WidgetText)) {
            		String StackdedBar_widget_Act=getText1(driver,WidgetText);
       			passReport(driver,"Tooltip should display the name of the Stacked Bar Widget " ,"Tooltip displays the name of the Stacked Bar Widget");
           		textValidation(driver,Stacked_Bar_widget_Exp,StackdedBar_widget_Act,Stacked_Bar_widget);
            		
            	}else {
       			  failReport(driver,"Tooltip should display the name of the Stacked Bar Widget ","Tooltip not display the name of the Stacked Bar Widget");
            	}
            }
          
         if(verifyElementIsPresent1(driver,Grouped_Bar_widget)) {
        	 if(flag==true) {
				try {
//					elementScreenShot_new(driver,Grouped_Bar_widget,"/Expected_screenshot/Widgets/Grouped_Bar_widget");
					elementScreenShot_new(driver,Grouped_Bar_widget,"/Actual_screenshot/Widgets/Grouped_Bar_widget");
					imageComparison(driver, "/Widgets/Grouped_Bar_widget", "/Widgets/Grouped_Bar_widget");
					wait(driver, "2");
				} catch (Exception e1) {
					fail(driver,"Unable to compare the Images for Grouped_Bar_widget");
				}
        	 }
         	mouseOverToElement(driver,Grouped_Bar_widget);
         	if(isDisplayed(driver,WidgetText)) {
         		String GroupedBar_widget_Act=getText1(driver,WidgetText);
    			passReport(driver,"Tooltip should display the name of the Grouped Bar Widget " ,"Tooltip displays the name of the Grouped Bar Widget");
        		textValidation(driver,Grouped_Bar_widget_Exp,GroupedBar_widget_Act,Grouped_Bar_widget);
         		
         	}else {
    			failReport(driver,"Tooltip should display the name of the Grouped Bar Widget ","Tooltip not display the name of the Grouped Bar Widget");
         	}
         }
       
         if(verifyElementIsPresent1(driver,Coloumn_widget)) {
        	 if(flag==true) {
				try {
//					elementScreenShot_new(driver,Coloumn_widget,"/Expected_screenshot/Widgets/Coloumn_widget");
					elementScreenShot_new(driver,Coloumn_widget,"/Actual_screenshot/Widgets/Coloumn_widget");
					imageComparison(driver, "/Widgets/Coloumn_widget", "/Widgets/Coloumn_widget");
					wait(driver, "2");
				} catch (Exception e1) {
					fail(driver,"Unable to compare the Images for Coloumn_widget");
				}
        	 }
          	mouseOverToElement(driver,Coloumn_widget);
          	if(isDisplayed(driver,WidgetText)) {
          		String Coloumn_widget_Act=getText1(driver,WidgetText);
     			passReport(driver,"Tooltip should display the name of the Coloumn Widget " ,"Tooltip displays the name of the Coloumn Widget");
         		textValidation(driver,Coloumn_widget_Exp,Coloumn_widget_Act,Coloumn_widget);
          		
          	}else {
     			failReport(driver,"Tooltip should display the name of the Column Widget ","Tooltip not display the name of the Coloumn Widget");
          	}
          }
        
         if(verifyElementIsPresent1(driver,Stacked_Column_widget)) {
        	 if(flag==true) {
				try {
//					elementScreenShot_new(driver,Stacked_Column_widget,"/Expected_screenshot/Widgets/Stacked_Column_widget");
					elementScreenShot_new(driver,Stacked_Column_widget,"/Actual_screenshot/Widgets/Stacked_Column_widget");
					imageComparison(driver, "/Widgets/Stacked_Column_widget", "/Widgets/Stacked_Column_widget");
					wait(driver, "2");
				} catch (Exception e1) {
					fail(driver,"Unable to compare the Images for Stacked_Column_widget");
				}
        	 }
           	mouseOverToElement(driver,Stacked_Column_widget);
           	if(isDisplayed(driver,WidgetText)) {
           		String StackedColoumn_widget_Act=getText1(driver,WidgetText);
      			passReport(driver,"Tooltip should display the name of the Stacked Coloumn Widget " ,"Tooltip displays the name of the Stacked Coloumn Widget");
          		textValidation(driver,Stacked_Column_widget_Exp,StackedColoumn_widget_Act,Stacked_Column_widget);
           		
           	}else {
      			failReport(driver,"Tooltip should display the name of the Stacked Column Widget ","Tooltip not display the name of the Stacked Coloumn Widget");
           	}
           }
         
         if(verifyElementIsPresent1(driver,Grouped_Column_widget)) {
        	 if(flag==true) {
				try {
//					elementScreenShot_new(driver,Grouped_Column_widget,"/Expected_screenshot/Widgets/Grouped_Column_widget");
					elementScreenShot_new(driver,Grouped_Column_widget,"/Actual_screenshot/Widgets/Grouped_Column_widget");
					imageComparison(driver, "/Widgets/Grouped_Column_widget", "/Widgets/Grouped_Column_widget");
					wait(driver, "2");
				} catch (Exception e1) {
					fail(driver,"Unable to compare the Images for Grouped_Column_widget");
				}
        	 }
            	mouseOverToElement(driver,Grouped_Column_widget);
            	if(isDisplayed(driver,WidgetText)) {
            		String GroupedColoumn_widget_Act=getText1(driver,WidgetText);
       			passReport(driver,"Tooltip should display the name of the Grouped Coloumn Widget " ,"Tooltip displays the name of the Grouped Coloumn Widget");
           		textValidation(driver,Grouped_Column_widget_Exp,GroupedColoumn_widget_Act,Grouped_Column_widget);
            		
            	}else {
       			failReport(driver,"Tooltip should display the name of the Grouped Column Widget ","Tooltip not display the name of the Grouped Coloumn Widget");
            	}
            }
         
         if(verifyElementIsPresent1(driver,Pie_widget)) {
        	 if(flag==true) {
				try {
//					elementScreenShot_new(driver,Pie_widget,"/Expected_screenshot/Widgets/Pie_widget");
					elementScreenShot_new(driver,Pie_widget,"/Actual_screenshot/Widgets/Pie_widget");
					imageComparison(driver, "/Widgets/Pie_widget", "/Widgets/Pie_widget");
					wait(driver, "2");
				} catch (Exception e1) {
					fail(driver,"Unable to compare the Images for Pie_widget");
				}
        	 }
         	mouseOverToElement(driver,Pie_widget);
         	if(isDisplayed(driver,WidgetText)) {
         		String Pie_widget_Act=getText1(driver,WidgetText);
    			passReport(driver,"Tooltip should display the name of the Pie Widget " ,"Tooltip displays the name of the Pie Widget");
        		textValidation(driver,Pie_widget_Exp,Pie_widget_Act,Pie_widget);
         		
         	}else {
    			failReport(driver,"Tooltip should display the name of the Pie Widget ","Tooltip not display the name of the Pie Widget");
         	}
         }
         
         if(verifyElementIsPresent1(driver,Donut_widget)) {
        	 if(flag==true) {
				try {
//					elementScreenShot_new(driver,Donut_widget,"/Expected_screenshot/Widgets/Donut_widget");
					elementScreenShot_new(driver,Donut_widget,"/Actual_screenshot/Widgets/Donut_widget");
					imageComparison(driver, "/Widgets/Donut_widget", "/Widgets/Donut_widget");
					wait(driver, "2");
				} catch (Exception e1) {
					fail(driver,"Unable to compare the Images for Donut_widget");
				}
        	 }
          	mouseOverToElement(driver,Donut_widget);
          	if(isDisplayed(driver,WidgetText)) {
          		String Donut_widget_Act=getText1(driver,WidgetText);
     			passReport(driver,"Tooltip should display the name of the Donut Widget " ,"Tooltip displays the name of the Donut Widget");
         		textValidation(driver,Donut_widget_Exp,Donut_widget_Act,Donut_widget);
          		
          	}else {
     			failReport(driver,"Tooltip should display the name of the Donut Widget ","Tooltip not display the name of the Donut Widget");
          	}
          }
         
         if(verifyElementIsPresent1(driver,SemiCircle_widget)) {
        	 if(flag==true) {
				try {
//					elementScreenShot_new(driver,SemiCircle_widget,"/Expected_screenshot/Widgets/SemiCircle_widget");
					elementScreenShot_new(driver,SemiCircle_widget,"/Actual_screenshot/Widgets/SemiCircle_widget");
					imageComparison(driver, "/Widgets/SemiCircle_widget", "/Widgets/SemiCircle_widget");
					wait(driver, "2");
				} catch (Exception e1) {
					fail(driver,"Unable to compare the Images for SemiCircle_widget");
				}
        	 }
          	mouseOverToElement(driver,SemiCircle_widget);
          	if(isDisplayed(driver,WidgetText)) {
          		String SemiCircle_widget_Act=getText1(driver,WidgetText);
     			passReport(driver,"Tooltip should display the name of the SemiCircle Widget " ,"Tooltip displays the name of the SemiCircle Widget");
         		textValidation(driver,SemiCircle_widget_Exp,SemiCircle_widget_Act,SemiCircle_widget);
          		
          	}else {
     			failReport(driver,"Tooltip should display the name of the SemiCircle Widget ","Tooltip not display the name of the SemiCircle Widget");
          	}
          }
         
         if(verifyElementIsPresent1(driver,SunBurst_widget)) {
        	 if(flag==true) {
				try {
//					elementScreenShot_new(driver,SunBurst_widget,"/Expected_screenshot/Widgets/SunBurst_widget");
					elementScreenShot_new(driver,SunBurst_widget,"/Actual_screenshot/Widgets/SunBurst_widget");
					imageComparison(driver, "/Widgets/SunBurst_widget", "/Widgets/SunBurst_widget");
					wait(driver, "2");
				} catch (Exception e1) {
					fail(driver,"Unable to compare the Images for SunBurst_widget");
				}
        	 }
           	mouseOverToElement(driver,SunBurst_widget);
           	if(isDisplayed(driver,WidgetText)) {
           		String SunBurst_widget_Act=getText1(driver,WidgetText);
      			passReport(driver,"Tooltip should display the name of the SunBurst Widget " ,"Tooltip displays the name of the SunBurst Widget");
          		textValidation(driver,SunBurst_widget_Exp,SunBurst_widget_Act,SunBurst_widget);
           		
           	}else {
      			failReport(driver,"Tooltip should display the name of the SunBurst Widget ","Tooltip not display the name of the SunBurst Widget");
           	}
           }
         
         if(verifyElementIsPresent1(driver,WaterFall_widget)) {
        	 if(flag==true) {
				try {
//					elementScreenShot_new(driver,WaterFall_widget,"/Expected_screenshot/Widgets/WaterFall_widget");
					elementScreenShot_new(driver,WaterFall_widget,"/Actual_screenshot/Widgets/WaterFall_widget");
					imageComparison(driver, "/Widgets/WaterFall_widget", "/Widgets/WaterFall_widget");
					wait(driver, "2");
				} catch (Exception e1) {
					fail(driver,"Unable to compare the Images for WaterFall_widget");
				}
        	 }
            	mouseOverToElement(driver,WaterFall_widget);
            	if(isDisplayed(driver,WidgetText)) {
            	String WaterFall_widget_Act=getText1(driver,WidgetText);
       			passReport(driver,"Tooltip should display the name of the WaterFall Widget " ,"Tooltip displays the name of the WaterFall Widget");
           		textValidation(driver,WaterFall_widget_Exp,WaterFall_widget_Act,WaterFall_widget);
            		
            	}else {
       			failReport(driver,"Tooltip should display the name of the WaterFall Widget ","Tooltip not display the name of the WaterFall Widget");
            	}
            }
         
         if(verifyElementIsPresent1(driver,Network_widget)) {
			if(flag==true) {
        	    try {
//        	    	elementScreenShot_new(driver,Network_widget,"/Expected_screenshot/Widgets/Network_widget");
        	    	elementScreenShot_new(driver,Network_widget,"/Actual_screenshot/Widgets/Network_widget");
					imageComparison(driver, "/Widgets/Network_widget", "/Widgets/Network_widget");
					wait(driver, "2");
				} catch (Exception e1) {
					fail(driver,"Unable to compare the Images for Network_widget");
				}
			}
         	mouseOverToElement(driver,Network_widget);
         	if(isDisplayed(driver,WidgetText)) {
         	String Network_widget_Act=getText1(driver,WidgetText);
    		passReport(driver,"Tooltip should display the name of the Network Widget " ,"Tooltip displays the name of the Network Widget");
        	textValidation(driver,Network_widget_Exp,Network_widget_Act,Network_widget);
         		
         	}else {
    			failReport(driver,"Tooltip should display the name of the Network Widget ","Tooltip not display the name of the Network Widget");
         	}
         }
         
         if(verifyElementIsPresent1(driver,Line_widget)) {
        	 if(flag==true) {
				try {
//					elementScreenShot_new(driver,Line_widget,"/Expected_screenshot/Widgets/Line_widget");
					elementScreenShot_new(driver,Line_widget,"/Actual_screenshot/Widgets/Line_widget");
					imageComparison(driver, "/Widgets/Line_widget", "/Widgets/Line_widget");
					wait(driver, "2");
				} catch (Exception e1) {
					fail(driver,"Unable to compare the Images for Line_widget");
				}
        	 }
          	mouseOverToElement(driver,Line_widget);
          	if(isDisplayed(driver,WidgetText)) {
          	String Line_widget_Act=getText1(driver,WidgetText);
     		passReport(driver,"Tooltip should display the name of the Line Widget " ,"Tooltip displays the name of the Line Widget");
         	textValidation(driver,Line_widget_Exp,Line_widget_Act,Line_widget);
          		
          	}else {
     			failReport(driver,"Tooltip should display the name of the Line Widget ","Tooltip not display the name of the Line Widget");
          		}
          }
          
         if(verifyElementIsPresent1(driver,Area_widget)) {
        	 if(flag==true) {
				try {
//					elementScreenShot_new(driver,Area_widget,"/Expected_screenshot/Widgets/Area_widget");
					elementScreenShot_new(driver,Area_widget,"/Actual_screenshot/Widgets/Area_widget");
					imageComparison(driver, "/Widgets/Area_widget", "/Widgets/Area_widget");
					wait(driver, "2");
				} catch (Exception e1) {
					fail(driver,"Unable to compare the Images for Area_widget");
				}
        	 }
           	mouseOverToElement(driver,Area_widget);
           	if(isDisplayed(driver,WidgetText)) {
           	String Area_widget_Act=getText1(driver,WidgetText);
      		passReport(driver,"Tooltip should display the name of the Area Widget " ,"Tooltip displays the name of the Area Widget");
          	textValidation(driver,Area_widget_Exp,Area_widget_Act,Area_widget);
           		
           	}else {
      			failReport(driver,"Tooltip should display the name of the Area Widget ","Tooltip not display the name of the Area Widget");
           		}
           }
         
         if(verifyElementIsPresent1(driver,Gantt_widget)) {
        	 if(flag==true) {
				try {
//					elementScreenShot_new(driver,Gantt_widget,"/Expected_screenshot/Widgets/Gantt_widget");
					elementScreenShot_new(driver,Gantt_widget,"/Actual_screenshot/Widgets/Gantt_widget");
					imageComparison(driver, "/Widgets/Gantt_widget", "/Widgets/Gantt_widget");
					wait(driver, "2");
				} catch (Exception e1) {
					fail(driver,"Unable to compare the Images for Gantt_widget");
				}
        	 }
           	mouseOverToElement(driver,Gantt_widget);
           	if(isDisplayed(driver,WidgetText)) {
           	String Gantt_widget_Act=getText1(driver,WidgetText);
      		passReport(driver,"Tooltip should display the name of the Gantt Widget " ,"Tooltip displays the name of the Gantt Widget");
          	textValidation(driver,Gantt_widget_Exp,Gantt_widget_Act,Gantt_widget);
           		
           	}else {
      			failReport(driver,"Tooltip should display the name of the Gantt Widget ","Tooltip not display the name of the Gantt Widget");
           		}
           }
         
         if(verifyElementIsPresent1(driver,Scatter_widget)) {
        	 if(flag==true) {
				try {
//					elementScreenShot_new(driver,Scatter_widget,"/Expected_screenshot/Widgets/Scatter_widget");
					elementScreenShot_new(driver,Scatter_widget,"/Actual_screenshot/Widgets/Scatter_widget");
					imageComparison(driver, "/Widgets/Scatter_widget", "/Widgets/Scatter_widget");
					wait(driver, "2");
				} catch (Exception e1) {
					fail(driver,"Unable to compare the Images for Scatter_widget");
				}
        	 }
        	mouseOverToElement(driver,Scatter_widget);
        	if(isDisplayed(driver,WidgetText)) {
        	String Scatter_widget_Act=getText1(driver,WidgetText);
       		passReport(driver,"Tooltip should display the name of the Scatter Widget " ,"Tooltip displays the name of the Scatter Widget");
           	textValidation(driver,Scatter_widget_Exp,Scatter_widget_Act,Scatter_widget);
        	}else {
       			failReport(driver,"Tooltip should display the name of the Scatter Widget ","Tooltip not display the name of the Scatter Widget");
        		}
            }
         
         if(verifyElementIsPresent1(driver,Dumbel_plot_widget)) {
        	 if(flag==true) {
				try {
//					elementScreenShot_new(driver,Dumbel_plot_widget,"/Expected_screenshot/Widgets/Dumbel_plot_widget");
					elementScreenShot_new(driver,Dumbel_plot_widget,"/Actual_screenshot/Widgets/Dumbel_plot_widget");
					imageComparison(driver, "/Widgets/Dumbel_plot_widget", "/Widgets/Dumbel_plot_widget");
					wait(driver, "2");
				} catch (Exception e1) {
					fail(driver,"Unable to compare the Images for Dumbel_plot_widget");
				}
        	 }
         	mouseOverToElement(driver,Dumbel_plot_widget);
         	if(isDisplayed(driver,WidgetText)) {
         	String DumbelPlot_widget_Act=getText1(driver,WidgetText);
    		passReport(driver,"Tooltip should display the name of the Dumbel plot Widget " ,"Tooltip displays the name of the Dumbel plot Widget");
        	textValidation(driver,Dumbel_plot_widget_Exp,DumbelPlot_widget_Act,Dumbel_plot_widget);
         	}else {
    			failReport(driver,"Tooltip should display the name of the Dumbel plot Widget ","Tooltip not display the name of the Dumbel plot Widget");
         		}
             }
         
         if(verifyElementIsPresent1(driver,Tree_map_widget)) {
        	 if(flag==true) {
				try {
//					elementScreenShot_new(driver,Tree_map_widget,"/Expected_screenshot/Widgets/Tree_map_widget");
					elementScreenShot_new(driver,Tree_map_widget,"/Actual_screenshot/Widgets/Tree_map_widget");
					imageComparison(driver, "/Widgets/Tree_map_widget", "/Widgets/Tree_map_widget");
					wait(driver, "2");
				} catch (Exception e1) {
					fail(driver,"Unable to compare the Images for Tree_map_widget");
				}
        	 }
          	mouseOverToElement(driver,Tree_map_widget);
          	if(isDisplayed(driver,WidgetText)) {
          	String TreeMap_widget_Act=getText1(driver,WidgetText);
     		passReport(driver,"Tooltip should display the name of the Tree map Widget " ,"Tooltip displays the name of the Tree Map Widget");
         	textValidation(driver,Tree_map_widget_Exp,TreeMap_widget_Act,Tree_map_widget);
          	}else {
     			failReport(driver,"Tooltip should display the name of the Tree Map Widget ","Tooltip not display the name of the Tree Map Widget");
      			}
          	}
         
         if(verifyElementIsPresent1(driver,HeatMap_Legend_widget)) {
        	 if(flag==true) {
				try {
//					elementScreenShot_new(driver,HeatMap_Legend_widget,"/Expected_screenshot/Widgets/HeatMap_Legend_widget");
					elementScreenShot_new(driver,HeatMap_Legend_widget,"/Actual_screenshot/Widgets/HeatMap_Legend_widget");
					imageComparison(driver, "/Widgets/HeatMap_Legend_widget", "/Widgets/HeatMap_Legend_widget");
					wait(driver, "2");
				} catch (Exception e1) {
					fail(driver,"Unable to compare the Images for HeatMap_Legend_widget");
				}
        	 }
           	mouseOverToElement(driver,HeatMap_Legend_widget);
           	if(isDisplayed(driver,WidgetText)) {
           	String HeatMap_widget_Act=getText1(driver,WidgetText);
      		passReport(driver,"Tooltip should display the name of the Heat map Widget " ,"Tooltip displays the name of the Heat Map Widget");
          	textValidation(driver,HeatMap_Legend_widget_Exp,HeatMap_widget_Act,HeatMap_Legend_widget);
           	}else {
      			failReport(driver,"Tooltip should display the name of the Heat Map Widget ","Tooltip not display the name of the Heat Map Widget");
       			}
           }
         
         if(verifyElementIsPresent1(driver,GroupandSorted_widget)) {
        	 if(flag==true) {
				try {
//					elementScreenShot_new(driver,GroupandSorted_widget,"/Expected_screenshot/Widgets/GroupandSorted_widget");
					elementScreenShot_new(driver,GroupandSorted_widget,"/Actual_screenshot/Widgets/GroupandSorted_widget");
					imageComparison(driver, "/Widgets/GroupandSorted_widget", "/Widgets/GroupandSorted_widget");
					wait(driver, "2");
				} catch (Exception e1) {
					fail(driver,"Unable to compare the Images for GroupandSorted_widget");
				}
        	 }
        	mouseOverToElement(driver,GroupandSorted_widget);
        	if(isDisplayed(driver,WidgetText)) {
        	String GropuAndSort_widget_Act=getText1(driver,WidgetText);
       		passReport(driver,"Tooltip should display the name of the Group And Sorted Widget " ,"Tooltip displays the name of the Group And Sorted Widget");
           	textValidation(driver,GroupandSorted_widget_Exp,GropuAndSort_widget_Act,GroupandSorted_widget);
        	}else {
       			failReport(driver,"Tooltip should display the name of the Group And Sorted Widget ","Tooltip not display the name of the Group And Sorted Widget");
        		}
            }
         
         if(verifyElementIsPresent1(driver,Multiple_Axis_widget)) {
        	 if(flag==true) {
				try {
//					elementScreenShot_new(driver,Multiple_Axis_widget,"/Expected_screenshot/Widgets/Multiple_Axis_widget");
					elementScreenShot_new(driver,Multiple_Axis_widget,"/Actual_screenshot/Widgets/Multiple_Axis_widget");
					imageComparison(driver, "/Widgets/Multiple_Axis_widget", "/Widgets/Multiple_Axis_widget");
					wait(driver, "2");
				} catch (Exception e1) {
					fail(driver,"Unable to compare the Images for Multiple_Axis_widget");
				}
        	 }
         	mouseOverToElement(driver,Multiple_Axis_widget);
         	if(isDisplayed(driver,WidgetText)) {
         	String MultipleAxis_widget_Act=getText1(driver,WidgetText);
    		passReport(driver,"Tooltip should display the name of the Multiple Axis Widget " ,"Tooltip displays the name of the Multiple Axis Widget");
        	textValidation(driver,Multiple_Axis_widget_Exp,MultipleAxis_widget_Act,Multiple_Axis_widget);
         	}else {
    			failReport(driver,"Tooltip should display the name of the Multiple Axis Widget ","Tooltip not display the name of the Multiple Axis Widget");
         		}
         	}
          

         if(verifyElementIsPresent1(driver,Radar_Line_widget)) {
        	 if(flag==true) {
				try {
//					elementScreenShot_new(driver,Radar_Line_widget,"/Expected_screenshot/Widgets/Radar_Line_widget");
					elementScreenShot_new(driver,Radar_Line_widget,"/Actual_screenshot/Widgets/Radar_Line_widget");
					imageComparison(driver, "/Widgets/Radar_Line_widget", "/Widgets/Radar_Line_widget");
					wait(driver, "2");
				} catch (Exception e1) {
					fail(driver,"Unable to compare the Images for Radar_Line_widget");
				}
        	 }
         	mouseOverToElement(driver,Radar_Line_widget);
         	if(isDisplayed(driver,WidgetText)) {
         	String RadarLine_widget_Act=getText1(driver,WidgetText);
    		passReport(driver,"Tooltip should display the name of the Radar Line Widget " ,"Tooltip displays the name of the Radar Line Widget");
        	textValidation(driver,Radar_Line_widget_Exp,RadarLine_widget_Act,Radar_Line_widget);
         	}else {
    			failReport(driver,"Tooltip should display the name of the Radar Line Widget ","Tooltip not display the name of the Radar Line Widget");
         		}
         	}
         
         if(verifyElementIsPresent1(driver,Zoomable_Bubble_widget)) {
        	 if(flag==true) {
				try {
//					elementScreenShot_new(driver,Zoomable_Bubble_widget,"/Expected_screenshot/Widgets/Zoomable_Bubble_widget");
					elementScreenShot_new(driver,Zoomable_Bubble_widget,"/Actual_screenshot/Widgets/Zoomable_Bubble_widget");
					imageComparison(driver, "/Widgets/Zoomable_Bubble_widget", "/Widgets/Zoomable_Bubble_widget");
					wait(driver, "2");
				} catch (Exception e1) {
					fail(driver,"Unable to compare the Images for Zoomable_Bubble_widget");
				}
        	 }
          	mouseOverToElement(driver,Zoomable_Bubble_widget);
          	if(isDisplayed(driver,WidgetText)) {
          	String ZoomableBubble_widget_Act=getText1(driver,WidgetText);
     		passReport(driver,"Tooltip should display the name of the Zoomable Bubble Widget " ,"Tooltip displays the name of the Zoomable Bubble Widget");
         	textValidation(driver,Zoomable_Bubble_widget_Exp,ZoomableBubble_widget_Act,Zoomable_Bubble_widget);
          	}else {
     			failReport(driver,"Tooltip should display the name of the Zoomable Bubble Widget ","Tooltip not display the name of the Zoomable Bubble Widget");
          		}
          	}
          
         if(verifyElementIsPresent1(driver,Time_line_widget)) {
        	 if(flag==true) {
				try {
//					elementScreenShot_new(driver,Time_line_widget,"/Expected_screenshot/Widgets/Time_line_widget");
					elementScreenShot_new(driver,Time_line_widget,"/Actual_screenshot/Widgets/Time_line_widget");
					imageComparison(driver, "/Widgets/Time_line_widget", "/Widgets/Time_line_widget");
					wait(driver, "2");
				} catch (Exception e1) {
					fail(driver,"Unable to compare the Images for Time_line_widget");
				}
        	 }
           	mouseOverToElement(driver,Time_line_widget);
           	if(isDisplayed(driver,WidgetText)) {
           	String TimeLine_widget_Act=getText1(driver,WidgetText);
      		passReport(driver,"Tooltip should display the name of the Time Line Widget " ,"Tooltip displays the name of the Time Line Widget");
          	textValidation(driver,Time_line_widget_Exp,TimeLine_widget_Act,Time_line_widget);
           	}else {
      			failReport(driver,"Tooltip should display the name of the Time Line Widget ","Tooltip not display the name of the Time Line Widget");
           		}
           	}
         
         if(verifyElementIsPresent1(driver,Population_Pyramid_widget)) {
        	 if(flag==true) {
				try {
//					elementScreenShot_new(driver,Population_Pyramid_widget,"/Expected_screenshot/Widgets/Population_Pyramid_widget");
					elementScreenShot_new(driver,Population_Pyramid_widget,"/Actual_screenshot/Widgets/Population_Pyramid_widget");
					imageComparison(driver, "/Widgets/Population_Pyramid_widget", "/Widgets/Population_Pyramid_widget");
					wait(driver, "2");
				} catch (Exception e1) {
					fail(driver,"Unable to compare the Images for Population_Pyramid_widget");
				}
        	 }
        	mouseOverToElement(driver,Population_Pyramid_widget);
        	if(isDisplayed(driver,WidgetText)) {
        	String PopulationPyramid_widget_Act=getText1(driver,WidgetText);
       		passReport(driver,"Tooltip should display the name of the Population pyramid Widget " ,"Tooltip displays the name of the Population pyramid Widget");
           	textValidation(driver,Population_Pyramid_widget_Exp,PopulationPyramid_widget_Act,Population_Pyramid_widget);
        	}else {
       			failReport(driver,"Tooltip should display the name of the Population pyramid Widget ","Tooltip not display the name of the Population pyramid Widget");
        		}
        	}
         
         if(verifyElementIsPresent1(driver,Box_Plot_widget)) {
        	 if(flag==true) {
				try {
//					elementScreenShot_new(driver,Box_Plot_widget,"/Expected_screenshot/Widgets/Box_Plot_widget");
					elementScreenShot_new(driver,Box_Plot_widget,"/Actual_screenshot/Widgets/Box_Plot_widget");
					imageComparison(driver, "/Widgets/Box_Plot_widget", "/Widgets/Box_Plot_widget");
					wait(driver, "2");
				} catch (Exception e1) {
					fail(driver,"Unable to compare the Images for Box_Plot_widget");
				}
        	 }
         	mouseOverToElement(driver,Box_Plot_widget);
         	if(isDisplayed(driver,WidgetText)) {
         	String BoxPlot_widget_Act=getText1(driver,WidgetText);
    		passReport(driver,"Tooltip should display the name of the Box plot Widget " ,"Tooltip displays the name of the Box plot Widget");
        	textValidation(driver,Box_Plot_widget_Exp,BoxPlot_widget_Act,Box_Plot_widget);
         	}else {
    			failReport(driver,"Tooltip should display the name of the Box plot Widget ","Tooltip not display the name of the Box plot Widget");
         		}
         	}
         
         if(verifyElementIsPresent1(driver,Text_widget)) {
        	if(flag==true) { 
				try {
//					elementScreenShot_new(driver,Text_widget,"/Expected_screenshot/Widgets/Text_widget");
					elementScreenShot_new(driver,Text_widget,"/Actual_screenshot/Widgets/Text_widget");
					imageComparison(driver, "/Widgets/Text_widget", "/Widgets/Text_widget");
					wait(driver, "2");
				} catch (Exception e1) {
					fail(driver,"Unable to compare the Images for Text_widget");
				}
				
        	}
          	mouseOverToElement(driver,Text_widget);
          	if(isDisplayed(driver,WidgetText)) {
          	String Text_widget_Act=getText1(driver,WidgetText);
     		passReport(driver,"Tooltip should display the name of the Text Widget " ,"Tooltip displays the name of the Text Widget");
         	textValidation(driver,Text_widget_Exp,Text_widget_Act,Text_widget);
          	}else {
     			failReport(driver,"Tooltip should display the name of the Text Widget ","Tooltip not display the name of the Text Widget");
          		}
          	}
         
         if(verifyElementIsPresent1(driver,BarLine_Scatter_widget)) {
        	 if(flag==true) {
				try {
//					elementScreenShot_new(driver,BarLine_Scatter_widget,"/Expected_screenshot/Widgets/BarLine_Scatter_widget");
					elementScreenShot_new(driver,BarLine_Scatter_widget,"/Actual_screenshot/Widgets/BarLine_Scatter_widget");
					imageComparison(driver, "/Widgets/BarLine_Scatter_widget", "/Widgets/BarLine_Scatter_widget");
					wait(driver, "2");
				} catch (Exception e1) {
					fail(driver,"Unable to compare the Images for BarLine_Scatter_widget");
				}
        	 }
           	mouseOverToElement(driver,BarLine_Scatter_widget);
           	if(isDisplayed(driver,WidgetText)) {
           	String BarLineScatter_widget_Act=getText1(driver,WidgetText);
      		passReport(driver,"Tooltip should display the name of the Bar Line Scatter Widget " ,"Tooltip displays the name of the Bar Line Scatter Widget");
          	textValidation(driver,BarLine_Scatter_widget_Exp,BarLineScatter_widget_Act,BarLine_Scatter_widget);
           	}else {
      			failReport(driver,"Tooltip should display the name of the Bar Line Scatter Widget ","Tooltip not display the name of the Bar Line Scatter Widget");
           		}
           	}
         
         if(verifyElementIsPresent1(driver,Layered_Column_widget)) {
        	 if(flag==true) {
				try {
//					elementScreenShot_new(driver,Layered_Column_widget,"/Expected_screenshot/Widgets/Layered_Column_widget");
					elementScreenShot_new(driver,Layered_Column_widget,"/Actual_screenshot/Widgets/Layered_Column_widget");
					imageComparison(driver, "/Widgets/Layered_Column_widget", "/Widgets/Layered_Column_widget");
					wait(driver, "2");
				} catch (Exception e1) {
					fail(driver,"Unable to compare the Images for Layered_Column_widget");
				}
        	 }
        	mouseOverToElement(driver,Layered_Column_widget);
        	if(isDisplayed(driver,WidgetText)) {
        	String LayeredColumn_widget_Act=getText1(driver,WidgetText);
       		passReport(driver,"Tooltip should display the name of the Layered Column Widget " ,"Tooltip displays the name of the Layered Column Widget");
           	textValidation(driver,Layered_Column_widget_Exp,LayeredColumn_widget_Act,Layered_Column_widget);
        	}else {
        		failReport(driver,"Tooltip should display the name of the Layered Column Widget ","Tooltip not display the name of the Layered Column Widget");
    			}
        	}
         
         if(verifyElementIsPresent1(driver,Bullet_widget)) {
        	 if(flag==true) {
				try {
//					elementScreenShot_new(driver,Bullet_widget,"/Expected_screenshot/Widgets/Bullet_widget");
					elementScreenShot_new(driver,Bullet_widget,"/Actual_screenshot/Widgets/Bullet_widget");
					imageComparison(driver, "/Widgets/Bullet_widget", "/Widgets/Bullet_widget");
					wait(driver, "2");
				} catch (Exception e1) {
					fail(driver,"Unable to compare the Images for Bullet_widget");
				}
        	 }
         	mouseOverToElement(driver,Bullet_widget);
         	if(isDisplayed(driver,WidgetText)) {
         	String Bullet_widget_Act=getText1(driver,WidgetText);
    		passReport(driver,"Tooltip should display the name of the Bullet Widget " ,"Tooltip displays the name of the Bullet Widget");
        	textValidation(driver,Bullet_widget_Exp,Bullet_widget_Act,Bullet_widget);
         	}else {
         		failReport(driver,"Tooltip should display the name of the Bullet Widget ","Tooltip not display the name of the Bullet Widget");
     			}
         	}
         
         if(verifyElementIsPresent1(driver,Circose_widget)) {
        	 if(flag==true) {
				try {
//					elementScreenShot_new(driver,Circose_widget,"/Expected_screenshot/Widgets/Circose_widget");
					elementScreenShot_new(driver,Circose_widget,"/Actual_screenshot/Widgets/Circose_widget");
					imageComparison(driver, "/Widgets/Circose_widget", "/Widgets/Circose_widget");
					wait(driver, "2");
				} catch (Exception e1) {
					fail(driver,"Unable to compare the Images for Circose_widget");
				}
        	 }
          	mouseOverToElement(driver,Circose_widget);
          	if(isDisplayed(driver,WidgetText)) {
          	String Circose_widget_Act=getText1(driver,WidgetText);
     		passReport(driver,"Tooltip should display the name of the Circose Widget " ,"Tooltip displays the name of the Circose Widget");
         	textValidation(driver,Circose_widget_Exp,Circose_widget_Act,Circose_widget);
          	}else {
          		failReport(driver,"Tooltip should display the name of the Circose Widget ","Tooltip not display the name of the Circose Widget");
      			}
          	}
         
         if(verifyElementIsPresent1(driver,Candle_stick_widget)) {
        	 if(flag==true) {
				try {
//					elementScreenShot_new(driver,Candle_stick_widget,"/Expected_screenshot/Widgets/Candle_stick_widget");
					elementScreenShot_new(driver,Candle_stick_widget,"/Actual_screenshot/Widgets/Candle_stick_widget");
					imageComparison(driver, "/Widgets/Candle_stick_widget", "/Widgets/Candle_stick_widget");
					wait(driver, "2");
				} catch (Exception e1) {
					fail(driver,"Unable to compare the Images for Candle_stick_widget");
				}
        	 }
           	mouseOverToElement(driver,Candle_stick_widget);
           	if(isDisplayed(driver,WidgetText)) {
           	String CandleStick_widget_Act=getText1(driver,WidgetText);
      		passReport(driver,"Tooltip should display the name of the Candle Stick Widget " ,"Tooltip displays the name of the Candle Stick Widget");
          	textValidation(driver,Candle_stick_widget_Exp,CandleStick_widget_Act,Candle_stick_widget);
           	}else {
           		failReport(driver,"Tooltip should display the name of the Candle Stick Widget ","Tooltip not display the name of the Candle Stick Widget");
       			}
           	}
         
         if(verifyElementIsPresent1(driver,MapWith_Bubble_widget)) {
        	 if(flag==true) {
				try {
//					elementScreenShot_new(driver,MapWith_Bubble_widget,"/Expected_screenshot/Widgets/MapWith_Bubble_widget");
					elementScreenShot_new(driver,MapWith_Bubble_widget,"/Actual_screenshot/Widgets/MapWith_Bubble_widget");
					imageComparison(driver, "/Widgets/MapWith_Bubble_widget", "/Widgets/MapWith_Bubble_widget");
					wait(driver, "2");
				} catch (Exception e1) {
					fail(driver,"Unable to compare the Images for MapWith_Bubble_widget");
				}
        	 }
        	mouseOverToElement(driver,MapWith_Bubble_widget);
        	if(isDisplayed(driver,WidgetText)) {
        	String MapBubble_widget_Act=getText1(driver,WidgetText);
       		passReport(driver,"Tooltip should display the name of the MapWith Bubble Widget " ,"Tooltip displays the name of the MapWith Bubble Widget");
           	textValidation(driver,MapWith_Bubble_widget_Exp,MapBubble_widget_Act,MapWith_Bubble_widget);
        	}else {
        		failReport(driver,"Tooltip should display the name of the MapWith Bubble Widget ","Tooltip not display the name of the MapWith Bubble Widget");
    			}
        	}
         
         if(verifyElementIsPresent1(driver,Word_Cloud_widget)) {
        	 if(flag==true) {
				try {
//					elementScreenShot_new(driver,Word_Cloud_widget,"/Expected_screenshot/Widgets/Word_Cloud_widget");
					elementScreenShot_new(driver,Word_Cloud_widget,"/Actual_screenshot/Widgets/Word_Cloud_widget");
					imageComparison(driver, "/Widgets/Word_Cloud_widget", "/Widgets/Word_Cloud_widget");
					wait(driver, "2");
				} catch (Exception e1) {
					fail(driver,"Unable to compare the Images for Word_Cloud_widget");
				}
        	 }
         	mouseOverToElement(driver,Word_Cloud_widget);
         	if(isDisplayed(driver,WidgetText)) {
         	String WordCloud_widget_Act=getText1(driver,WidgetText);
    		passReport(driver,"Tooltip should display the name of the Word Cloud Widget " ,"Tooltip displays the name of the Word Cloud Widget");
        	textValidation(driver,Word_Cloud_widget_Exp,WordCloud_widget_Act,Word_Cloud_widget);
         	}else {
         		failReport(driver,"Tooltip should display the name of the Word Cloud Widget ","Tooltip not display the name of the Word Cloud Widget");
     			}
         	}
          
         if(verifyElementIsPresent1(driver,Summary_widget)) {
        	 if(flag==true) {
				try {
//					elementScreenShot_new(driver,Summary_widget,"/Expected_screenshot/Widgets/Summary_widget");
					elementScreenShot_new(driver,Summary_widget,"/Actual_screenshot/Widgets/Summary_widget");
					imageComparison(driver, "/Widgets/Summary_widget", "/Widgets/Summary_widget");
					wait(driver, "2");
				} catch (Exception e1) {
					fail(driver,"Unable to compare the Images for Summary_widget");
				}
        	 }
          	mouseOverToElement(driver,Summary_widget);
          	if(isDisplayed(driver,WidgetText)) {
          	String Summary_widget_Act=getText1(driver,WidgetText);
     		passReport(driver,"Tooltip should display the name of the Summary Widget " ,"Tooltip displays the name of the Summary Widget");
         	textValidation(driver,Summary_widget_Exp,Summary_widget_Act,Summary_widget);
          	}else {
          		failReport(driver,"Tooltip should display the name of the Summary Widget ","Tooltip not display the name of the Summary Widget");
      			}
          	}
           
         if(verifyElementIsPresent1(driver,Card_widget)) {
        	 if(flag==true) {
				try {
//					elementScreenShot_new(driver,Card_widget,"/Expected_screenshot/Widgets/Card_widget");
					elementScreenShot_new(driver,Card_widget,"/Actual_screenshot/Widgets/Card_widget");
					imageComparison(driver, "/Widgets/Card_widget", "/Widgets/Card_widget");
					wait(driver, "2");
				} catch (Exception e1) {
					fail(driver,"Unable to compare the Images for Card_widget");
				}
        	 }
           	mouseOverToElement(driver,Card_widget);
           	if(isDisplayed(driver,WidgetText)) {
           	String Card_widget_Act=getText1(driver,WidgetText);
      		passReport(driver,"Tooltip should display the name of the Card Widget " ,"Tooltip displays the name of the Card Widget");
          	textValidation(driver,Card_widget_Exp,Card_widget_Act,Card_widget);
           	}else {
           		failReport(driver,"Tooltip should display the name of the Card Widget ","Tooltip not display the name of the Card Widget");
       			}
           	}
            
         if(verifyElementIsPresent1(driver,KPI_Card_widget)) {
        	 if(flag==true) {
				try {
//					elementScreenShot_new(driver,KPI_Card_widget,"/Expected_screenshot/Widgets/KPI_Card_widget");
					elementScreenShot_new(driver,KPI_Card_widget,"/Actual_screenshot/Widgets/KPI_Card_widget");
					imageComparison(driver, "/Widgets/KPI_Card_widget", "/Widgets/KPI_Card_widget");
					wait(driver, "2");
				} catch (Exception e1) {
					fail(driver,"Unable to compare the Images for KPI_Card_widget");
				}
        	 }
        	mouseOverToElement(driver,KPI_Card_widget);
        	if(isDisplayed(driver,WidgetText)) {
        	String KPICard_widget_Act=getText1(driver,WidgetText);
       		passReport(driver,"Tooltip should display the name of the KPI Card Widget " ,"Tooltip displays the name of the KPI Card Widget");
           	textValidation(driver,KPI_Card_widget_Exp,KPICard_widget_Act,KPI_Card_widget);
        	}else {
        		failReport(driver,"Tooltip should display the name of the KPI Card Widget ","Tooltip not display the name of the KPI Card Widget");
    			}
        	}
             
         if(verifyElementIsPresent1(driver,Custom_Pivot_widget)) {
        	 if(flag==true) {
				try {
//					elementScreenShot_new(driver,Custom_Pivot_widget,"/Expected_screenshot/Widgets/Custom_Pivot_widget");
					elementScreenShot_new(driver,Custom_Pivot_widget,"/Actual_screenshot/Widgets/Custom_Pivot_widget");
					imageComparison(driver, "/Widgets/Custom_Pivot_widget", "/Widgets/Custom_Pivot_widget");
					wait(driver, "2");
				} catch (Exception e1) {
					fail(driver,"Unable to compare the Images for Custom_Pivot_widget");
				}
        	 }
         	mouseOverToElement(driver,Custom_Pivot_widget);
         	if(isDisplayed(driver,WidgetText)) {
         	String CustomPivot_widget_Act=getText1(driver,WidgetText);
    		passReport(driver,"Tooltip should display the name of the Custom Pivot Widget " ,"Tooltip displays the name of the Custom Pivot Widget");
        	textValidation(driver,Custom_Pivot_widget_Exp,CustomPivot_widget_Act,Custom_Pivot_widget);
         	}else {
         		failReport(driver,"Tooltip should display the name of the Custom Pivot Widget ","Tooltip not display the name of the Custom Pivot Widget");
     			}
         	}
         
         if(verifyElementIsPresent1(driver,Sparkline_widget)) {
        	if(flag==true) {
				try {
//					elementScreenShot_new(driver,Sparkline_widget,"/Expected_screenshot/Widgets/Sparkline_widget");
					elementScreenShot_new(driver,Sparkline_widget,"/Actual_screenshot/Widgets/Sparkline_widget");
					imageComparison(driver, "/Widgets/Sparkline_widget", "/Widgets/Sparkline_widget");
					wait(driver, "2");
				} catch (Exception e1) {
					fail(driver,"Unable to compare the Images for Sparkline_widget");
				}
        	}
          	mouseOverToElement(driver,Sparkline_widget);
          	if(isDisplayed(driver,WidgetText)) {
          	String Sparkline_widget_Act=getText1(driver,WidgetText);
     		passReport(driver,"Tooltip should display the name of the Sparkline Widget " ,"Tooltip displays the name of the Sparkline Widget");
         	textValidation(driver,Sparkline_widget_Exp,Sparkline_widget_Act,Sparkline_widget);
          	}else {
          		failReport(driver,"Tooltip should display the name of the Sparkline Widget ","Tooltip not display the name of the Sparkline Widget");
      			}
          	}
         
         if(verifyElementIsPresent(driver,Bar_widget)) {
        	 if(flag==true) {
				try {
//					elementScreenShot_new(driver,Bar_widget,"/Expected_screenshot/Widgets/Bar_widget");
					elementScreenShot_new(driver,Bar_widget,"/Actual_screenshot/Widgets/Bar_widget");
					imageComparison(driver, "/Widgets/Bar_widget", "/Widgets/Bar_widget");
					wait(driver, "2");
				} catch (Exception e1) {
					fail(driver,"Unable to compare the Images for Bar_widget");
				}
        	 }
        	mouseOverToElement(driver,Bar_widget);
        	if(isDisplayed(driver,WidgetText)) {
    		String Bar_widget_Act=getText1(driver,WidgetText);
   			passReport(driver,"Tooltip should display the name of the Bar Widget " ,"Tooltip displays the name of the Bar Widget");
       		textValidation(driver,Bar_widget_Exp,Bar_widget_Act,Bar_widget);
        	}else {
       			failReport(driver,"Tooltip should display the name of the Bar Widget ","Tooltip not display the name of the Bar Widget");
            	}
            }
         
     	 mouseOverToElement(driver,Widget);
     	 if(isDisplayed(driver,WidgetText)) {
    	    failReport(driver,"Tooltip Should get disappeared","Tooltip not disappeared");
        	}else {
        		passReport(driver,"Tooltip Should get disappeared" ,"Tooltip gets disappeared");
        	}
         
     	 
     	 click(driver,Bar_widget);
     	 String widgetValue=getText1(driver,WidgetValue);
     	 if(widgetValue.equals("Bar")) {
			passReport(driver,"Bar Should Clickable and Widget Value Display : Bar" ,"Bar widget is Clickbale and Widget Value : "+widgetValue);
     	 }else {
     	    failReport(driver,"Bar Should Clickable and Widget Value Display : Bar","Bar Widget not Clickable ");
     	 }
         
     	 
 		//Axes properties Validation Start
     	 String AxesExpand=getAttribute1(driver,Axes_Expand,"class");
     	 if(AxesExpand.contains("up")) {
			passReport(driver,"Bar Axes Should Expand" ,"Bar Axes is Expanded");
     	 }else {
     	    failReport(driver,"Bar Axes Should Expand","Bar Axes not Expanded");
     	 }
     	 
 		String AxesTextColor_Act=getTextColor(driver,Axes);
		colorValidation(driver,AxesColor_Exp,AxesTextColor_Act,Axes);

		verifyElementIsPresent1(driver,Y_Axis_dropdown);
		if(verifyElementIsPresent1(driver,Y_Axis_text)) {
			String Y_axis_text_Act=getText1(driver,Y_Axis_text);
       		textValidation(driver,Y_axis_text_Exp,Y_axis_text_Act,Y_Axis_text);
		}
		
		String defaultSelectValue_Y_Act=getText1(driver,Y_Axis_dropdown);
		if(defaultSelectValue_Y_Act.equals("Select")) {
			passReport(driver,"By Default 'Select' Should display as Y axis value" ,"By Default '"+defaultSelectValue_Y_Act+"' is displayed as Y axis value");
		}else {
     	    failReport(driver,"By Default 'Select' Should display as Y axis value","By Default '"+defaultSelectValue_Y_Act+"' is displayed as Y axis value");
		}
		
		verifyElementIsPresent1(driver,X_Axis_dropdown);
		if(verifyElementIsPresent1(driver,X_Axis_text)) {
			String X_axis_text_Act=getText1(driver,X_Axis_text);
       		textValidation(driver,X_axis_text_Exp,X_axis_text_Act,X_Axis_text);
		}
		String defaultSelectValue_X_Act=getText1(driver,X_Axis_dropdown);
		if(defaultSelectValue_X_Act.equals("Select")) {
			passReport(driver,"By Default 'Select' Should display as Y axis value" ,"By Default '"+defaultSelectValue_X_Act+"' is displayed as Y axis value");
		}else {
     	    failReport(driver,"By Default 'Select' Should display as Y axis value","By Default '"+defaultSelectValue_X_Act+"' is displayed as Y axis value");
		}
		
		verifyElementIsPresent1(driver,aggregation);
		if(verifyElementIsPresent1(driver,aggText)) {
			String Agg_text_Act=getText1(driver,aggText);
       		textValidation(driver,Agg_text_Exp,Agg_text_Act,aggText);
		}
		
		
		verifyElementIsPresent(driver,ApplyButton);
		String ApplyBtn_textAct=getText1(driver,ApplyButton);
		textValidation(driver,ApplyBtn_text_Exp,ApplyBtn_textAct,ApplyButton);

		String ApplyBtn_Color_Act=getTextBackgroundColor(driver,ApplyButton);
		colorValidation(driver,ApplyBtn_color_Exp,ApplyBtn_Color_Act,ApplyButton);
		//Axes properties Validation end
		
		//Click Apply button without select X and Y value , then Validating error start
		click(driver,ApplyButton);
		if(isDisplayed(driver,ApplyError1)) {
			passReport(driver,"'Kindly select X axis and Y axis ', Error should Display ","'Kindly select X axis and Y axis ', Error Displayed");
		}else {
     	    failReport(driver,"'Kindly select X axis and Y axis ', Error Should Display ","Kindly select X axis and Y axis ', Error not Displyed");
		}
		//Click Apply button without select X and Y value , then Validating error End
 
		
		click(driver,Y_Axis_dropdown);
		if(isDisplayed(driver,Y_Axis_dropdownResults)) {
			passReport(driver,"Y-Axis dropdown Should Expand ","Y-Axis Dropdown is Expanded");
		}else {
     	    failReport(driver,"Y-Axis dropdown Should Expand ","Y-Axis dropdown not Expanded");
		}
		verifyElementIsPresent1(driver,CategoricalImg);
		verifyElementIsPresent1(driver,NumericalImg);
		verifyElementIsPresent1(driver,DateImg);
		verifyElementIsPresent1(driver,TextImg);
		
		ScrollBarValidation(driver,Y_Axis_dropdownResults,HighlightTextElement,"Y-Axis");
		
		//img[contains(@src, 'Numerical')]//ancestor::li/descendant::div[contains(@title,'calories_chicken')]
		mouseOverToElement(driver,fourthValue);
		String Highlight_Color_Act=getTextBackgroundColor(driver,fourthValue);
		colorValidation(driver,Highlight_color_Exp,Highlight_Color_Act,HighlightTextElement);
		
		click(driver,fourthValue);
		if(isDisplayed(driver,Y_Axis_dropdownResults)) {
			 failReport(driver,"Y-Axis dropdown Should Close after Selecting value ","Y-Axis dropdown not Closed after Selecting value ");
		}else {
			passReport(driver,"Y-Axis dropdown Should Close after Selecting value ","Y-Axis dropdown Closed after Selecting value ");

		}
		
		String selectYValue=getText1(driver,Y_Axis_dropdown);
		click3(driver,Y_Axis_dropdown);
		waitForElement(driver,Y_Axis_dropdownResults);
		mouseOverToElement(driver,SecondValue);
		
		String selectedColorAct=getTextBackgroundColor(driver,ListSelected);
		String highlightText=getText1(driver,ListSelectedText);
		if((selectYValue.equals(highlightText))&&SelectedTextColorExp.equals(selectedColorAct)) {
			 passReport(driver,"Selected Value ("+selectYValue+") Should Highlight in Grey("+SelectedTextColorExp+") Color","Selected Value ("+highlightText+") Highlighted in Grey("+selectedColorAct+") Color");
		}else {
     	    failReport(driver,"Selected Value ("+selectYValue+") Should Highlight in Grey("+SelectedTextColorExp+") Color",highlightText+" Value Highlighted in "+selectedColorAct+" Color");
		}
//		colorValidation(driver,"#DDDDDD",selectedColorAct,ListSelected);
		act.sendKeys(Keys.ESCAPE).build().perform();

		
		//X-Axis check....
		click(driver,X_Axis_dropdown);
		if(isDisplayed(driver,X_Axis_dropdownResults)) {
			passReport(driver,"X-Axis dropdown Should Expand ","X-Axis Dropdown is Expanded");
		}else {
     	    failReport(driver,"X-Axis dropdown Should Expand ","X-Axis dropdown not Expanded");

		}
		
		verifyElementIsPresent1(driver,CategoricalImg);
		verifyElementIsPresent1(driver,NumericalImg);
		verifyElementIsPresent1(driver,DateImg);
		verifyElementIsPresent1(driver,TextImg);
		
		ScrollBarValidation(driver,X_Axis_dropdownResults,HighlightTextElement,"X-Axis");
		mouseOverToElement(driver,ThirdValue);
		Highlight_Color_Act=getTextBackgroundColor(driver,ThirdValue);
		colorValidation(driver,Highlight_color_Exp,Highlight_Color_Act,highlightText);
		
		click(driver,fourthValue);
		if(isDisplayed(driver,X_Axis_dropdownResults)) {
			 failReport(driver,"X-Axis dropdown Should Close after Selecting value ","X-Axis dropdown not Closed after Selecting value ");
		}else {
			passReport(driver,"X-Axis dropdown Should Close after Selecting value ","X-Axis dropdown Closed after Selecting value ");

		}
		String selectXValue=getText1(driver,X_Axis_dropdown);
		click3(driver,X_Axis_dropdown);
		waitForElement(driver,X_Axis_dropdownResults);
		mouseOverToElement(driver,SecondValue);
		
		String selectedColorAct1=getTextBackgroundColor(driver,ListSelected);
		String highlightText1=getText1(driver,ListSelectedText);
		if((selectXValue.equals(highlightText1))&&SelectedTextColorExp.equals(selectedColorAct1)) {
			 passReport(driver,"Selected Value ("+selectXValue+") Should Highlight in Grey("+SelectedTextColorExp+") Color","Selected Value ("+highlightText1+") Should Highlight in Grey("+selectedColorAct1+") Color");
		}else {
     	    failReport(driver,"Selected Value ("+selectXValue+") Should Highlight in Grey("+SelectedTextColorExp+") Color",highlightText1+" Value Highlighted in "+selectedColorAct1+"Color");
		}
		act.sendKeys(Keys.ESCAPE).build().perform();

		
		
		click3(driver,ApplyButton);
		if(isDisplayed(driver,ApplyError2)) {
			passReport(driver,"'Kindly check fields and select different values ', Error should Display ","'Kindly check fields and select different values ', Error Displayed");
		}else {
     	    failReport(driver,"'Kindly check fields and select different values ', Error Should Display ","Kindly check fields and select different values ', Error not Displyed");
		}
		
		click3(driver,X_Axis_dropdown);
		click3(driver,select);
		click3(driver,ApplyButton);
		if(isDisplayed(driver,ApplyError1)) {
			passReport(driver,"'Kindly select X axis and Y axis ', Error should Display When only select the Y value ","'Kindly select X axis and Y axis ', Error Displayed");
		}else {
     	    failReport(driver,"'Kindly select X axis and Y axis ', Error should Display When only select the Y value ","Kindly select X axis and Y axis ', Error not Displyed");
		}
		
		click3(driver,X_Axis_dropdown);
		click3(driver,categarical1);
		

        //default Aggregation..
        String defaultaggre=defaultSelectedValue(driver,aggregation);
//        System.out.println("Default selected option: " + defaultaggre);
        if(defaultaggre.equals("Count")) {
			passReport(driver,"Aggregation should display the default value as, 'Count' for Categorical","Aggregation displayed the default value as, "+defaultaggre+" for Categorical");
		}else {
     	    failReport(driver,"Aggregation should display the default value as, 'Count' for Categorical ","Aggregation displayed the default value as, "+defaultaggre+"for Categorical");
		}
        
		click3(driver,aggregation);
		 //aggregation validation
        if(isDisplayed2(driver,sumDisabled)) {
			passReport(driver,"Sum should be disabled for Categorical value ","Sum disabled for Categorical value");
        }else {
     	    failReport(driver,"Sum should be disabled for Categorical value  ","Sum  enabled for Categorical value ");
        }
        
        if(isDisplayed2(driver,AvgDisabled)) {
			passReport(driver,"Average should be disabled for Categorical value ","Average disabled for Categorical value");
        }else {
     	    failReport(driver,"Average should be disabled for Categorical value  ","Average  enabled for Categorical value ");
        }
        
        if(isDisplayed2(driver,minDisabled)) {
			passReport(driver,"Minimum should be disabled for Categorical value ","Minimum disabled for Categorical value");
        }else {
     	    failReport(driver,"Minimum should be disabled for Categorical value  ","Minimum  enabled for Categorical value ");
        }
        
        if(isDisplayed2(driver,maxDisabled)) {
			passReport(driver,"Maximum should be disabled for Categorical value ","Maximum disabled for Categorical value");
        }else {
     	    failReport(driver,"Maximum should be disabled for Categorical value  ","Maximum  enabled for Categorical value ");
        }
        
        if(!isDisplayed2(driver,uniqueDisabled)) {
			passReport(driver,"Unique should be enabled for Categorical value ","Unique enabled for Categorical value");
        }else {
     	    failReport(driver,"Unique should be enabled for Categorical value  ","Unique  disabled for Categorical value ");
        }
        
        if(!isDisplayed2(driver,countDisabled)) {
			passReport(driver,"Count should be enabled for Categorical value ","Count enabled for Categorical value");
        }else {
     	    failReport(driver,"Count should be enabled for Categorical value  ","Count  disabled for Categorical value ");
        } 
        
        click3(driver,X_Axis_dropdown);
		click3(driver,numerical1);
		
		 //default Aggregation..
        defaultaggre=defaultSelectedValue(driver,aggregation);
//        System.out.println("Default selected option: " + defaultaggre);
        if(defaultaggre.equals("Sum")) {
			passReport(driver,"Aggregation should display the default value as, 'Sum' for Numerical","Aggregation displayed the default value as, "+defaultaggre+" for Numerical");
		}else {
     	    failReport(driver,"Aggregation should display the default value as, 'Sum' for Numerical ","Aggregation displayed the default value as, "+defaultaggre+"for Numerical");
		}
        
		click3(driver,aggregation);
		
		if(!isDisplayed2(driver,sumDisabled)) {
			passReport(driver,"Sum should be enabled for Numerical value ","Sum enabled for Numerical value");
        }else {
     	    failReport(driver,"Sum should be enabled for Numerical value  ","Sum  disabled for Numerical value ");
        }
        
        if(!isDisplayed2(driver,AvgDisabled)) {
			passReport(driver,"Average should be enabled for Numerical value ","Average enabled for Numerical value");
        }else {
     	    failReport(driver,"Average should be enabled for Numerical value  ","Average disabled for Numerical value ");
        }
        
        if(!isDisplayed2(driver,minDisabled)) {
			passReport(driver,"Minimum should be enabled for Numerical value ","Minimum enabled for Numerical value");
        }else {
     	    failReport(driver,"Minimum should be enabled for Numerical value  ","Minimum disabled for Numerical value ");
        }
        
        if(!isDisplayed2(driver,maxDisabled)) {
			passReport(driver,"Maximum should be enabled for Numerical value ","Maximum enabled for Numerical value");
        }else {
     	    failReport(driver,"Maximum should be enabled for Numerical value  ","Maximum disabled for Numerical value ");
        }
        
        if(!isDisplayed2(driver,uniqueDisabled)) {
			passReport(driver,"Unique should be enabled for Numerical value ","Unique enabled for Numerical value");
        }else {
     	    failReport(driver,"Unique should be enabled for Numerical value  ","Unique  disabled for Numerical value ");
        }
        
        if(!isDisplayed2(driver,countDisabled)) {
			passReport(driver,"Count should be enabled for Numerical value ","Count enabled for Numerical value");
        }else {
     	    failReport(driver,"Count should be enabled for Numerical value  ","Count  disabled for Numerical value ");
        }
        
        // Need to modify the code to get the data from excel
        click3(driver,X_Axis_dropdown);
        selectDropdownValue(driver,X_Axis_Type_1,X_Axis_Value_1);
//		click3(driver,categarical1);/
		
		click3(driver,Y_Axis_dropdown);
		click3(driver,select);
		click3(driver,ApplyButton);
		if(isDisplayed(driver,ApplyError1)) {
			passReport(driver,"'Kindly select X axis and Y axis ', Error should Display When only select the X value ","'Kindly select X axis and Y axis ', Error Displayed");
		}else {
     	    failReport(driver,"'Kindly select X axis and Y axis ', Error should Display When only select the X value ","Kindly select X axis and Y axis ', Error not Displyed");
		}
		
		click3(driver,Y_Axis_dropdown);
        selectDropdownValue(driver,Y_Axis_Type_1,Y_Axis_Value_1);
//		click3(driver,categarical2);
			
		String defaultShowResult=defaultSelectedValue(driver,showResult);
        if(defaultShowResult.equals("All")) {
			passReport(driver,"ShowResults should display the default value as, 'All' ","ShowResults displayed the default value as, "+defaultShowResult);
		}else {
     	    failReport(driver,"ShowResults should display the default value as, 'All' ","ShowResults displayed the default value as, "+defaultShowResult);
		}
        
		verifyElementIsPresent1(driver,All);
		verifyElementIsPresent1(driver,Limit);
		wait(driver,"1");
		click3(driver,showResult);
		click3(driver,All);
		wait(driver,"1");
		
		verifyElementIsPresent(driver,sortType);  
		verifyElementIsPresent(driver,sortBy);
		
		click3(driver,sortType);
		click3(driver,QuickSort);
		click3(driver,sortBy);
		verifyElementIsPresent(driver,sortByDropdownExpand);
	    List<WebElement> SortByValues=getWebElements(driver,sortByValues);
	    int SortByValuesCount=SortByValues.size();
	    if(SortByValuesCount<=3) {
			passReport(driver,"Only X and Y value should display in the sortBy field for Quicksort condition","Only X and Y value displayed in the sortBy field for Quicksort condition");
	    }else {
			failReport(driver,"Only X and Y value should display in the sortBy field for Quicksort condition","All values displayed in the sortBy field for Quicksort condition");
	    }
	    
	    
	    click3(driver,sortType);
		wait(driver,"1");
		click3(driver,FieldSort);
		wait(driver,"1");
		click3(driver,sortBy1);
		verifyElementIsPresent(driver,sortByDropdownExpand);
		List<WebElement> SortByValues1=getWebElements(driver,sortByValues1);
        SortByValuesCount=SortByValues1.size();
    	if(SortByValuesCount>3) {
			passReport(driver,"All values should display in the sortBy field for Fieldsort condition","All values displayed in the sortBy field for Fieldsort condition");
    	}else {
			failReport(driver,"All values should display in the sortBy field for Fieldsort condition","Only X and Y value displayed in the sortBy field for Fieldsort condition");
    	}
	    
    	String defaultCategoricalSelect=getText1(driver,Cate_agg_fieldSortValue);
    	if(defaultCategoricalSelect.equals("Count")) {
			passReport(driver,"'Count' should be selected as default for Categorical in Field sort ","'Count' is selected as default for Categorical in Field sort ");
    	}else {
			failReport(driver,"'Count' should be selected as default for Categorical in Field sort ","'"+defaultCategoricalSelect+"' is selected as default for Categorical in Field sort ");
    	}
		
    	click3(driver,Cat_agg_fieldSort);
    	
    	 if(isDisplayed2(driver,sumDisabledFieldsortCate)) {
 			passReport(driver,"Sum should be disabled for Categorical value in Field sort ","Sum disabled for Categorical value in Field sort");
         }else {
      	    failReport(driver,"Sum should be disabled for Categorical value in Field sort ","Sum  enabled for Categorical value in Field sort");
         }
         
         if(isDisplayed2(driver,AvgDisabledFieldsortCate)) {
 			passReport(driver,"Average should be disabled for Categorical value in Field sort ","Average disabled for Categorical value in Field sort");
         }else {
      	    failReport(driver,"Average should be disabled for Categorical value in Field sort ","Average  enabled for Categorical value Field sort");
         }
         
         if(isDisplayed2(driver,minDisabledFieldsortCate)) {
 			passReport(driver,"Minimum should be disabled for Categorical value in Field sort  ","Minimum disabled for Categorical value in Field sort");
         }else {
      	    failReport(driver,"Minimum should be disabled for Categorical value in Field sort ","Minimum enabled for Categorical value in Field sort");
         }
         
         if(isDisplayed2(driver,maxDisabledFieldsortCate)) {
 			passReport(driver,"Maximum should be disabled for Categorical value in Field sort","Maximum disabled for Categorical value in Field sort");
         }else {
      	    failReport(driver,"Maximum should be disabled for Categorical value in Field sort ","Maximum enabled for Categorical value in Field sort");
         }
         
         if(!isDisplayed2(driver,uniqueDisabledFieldsortCate)) {
 			passReport(driver,"Unique should be enabled for Categorical value in Field sort ","Unique enabled for Categorical value in Field sort");
         }else {
      	    failReport(driver,"Unique should be enabled for Categorical value in Field sort ","Unique  disabled for Categorical value in Field sort");
         }
         
         if(!isDisplayed2(driver,countDisabledFieldsortCate)) {
 			passReport(driver,"Count should be enabled for Categorical value in Field sort ","Count enabled for Categorical value in Field sort");
         }else {
      	    failReport(driver,"Count should be enabled for Categorical value in Field sort ","Count  disabled for Categorical value in Field  sort");
         } 
    	
		 act.sendKeys(Keys.ESCAPE).build().perform();

		 String defaultNumericalSelect=getText1(driver,Num_agg_fieldSortValue);
	    	if(defaultNumericalSelect.equals("Sum")) {
				passReport(driver,"'Sum' should be selected as default for Numerical in Field sort ","'Sum' is selected as default for Numerical in Field sort ");
	    	}else {
				failReport(driver,"'Sum' should be selected as default for Numerical in Field sort ","'"+defaultNumericalSelect+"' is selected as default for Numerical in Field sort ");
	    	}
			
	    click3(driver,Num_agg_fieldSort);
	    	
	    if(!isDisplayed2(driver,sumDisabledFieldsortNum)) {
			passReport(driver,"Sum should be enabled for Numerical value in Field sort ","Sum enabled for Numerical value in Field sort");
        }else {
     	    failReport(driver,"Sum should be enabled for Numerical value in Field sort ","Sum  disabled for Numerical value in Field sort");
        }
        
        if(!isDisplayed2(driver,AvgDisabledFieldsortNum)) {
			passReport(driver,"Average should be enabled for Numerical value in Field sort ","Average enabled for Numerical value in Field sort ");
        }else {
     	    failReport(driver,"Average should be enabled for Numerical value in Field sort ","Average disabled for Numerical value in Field sort ");
        }
        
        if(!isDisplayed2(driver,minDisabledFieldsortNum)) {
			passReport(driver,"Minimum should be enabled for Numerical value in Field sort","Minimum enabled for Numerical value in Field sort");
        }else {
     	    failReport(driver,"Minimum should be enabled for Numerical value in Field sort ","Minimum disabled for Numerical value in Field sort");
        }
        
        if(!isDisplayed2(driver,maxDisabledFieldsortNum)) {
			passReport(driver,"Maximum should be enabled for Numerical value in Field sort","Maximum enabled for Numerical value in Field sort");
        }else {
     	    failReport(driver,"Maximum should be enabled for Numerical value in Field sort ","Maximum disabled for Numerical value in Field sort ");
        }
        
        if(!isDisplayed2(driver,uniqueDisabledFieldsortNum)) {
			passReport(driver,"Unique should be enabled for Numerical value in Field sort","Unique enabled for Numerical value in Field sort");
        }else {
     	    failReport(driver,"Unique should be enabled for Numerical value in Field sort ","Unique  disabled for Numerical value in Field sort");
        }
        
        if(!isDisplayed2(driver,countDisabledFieldsortNum)) {
			passReport(driver,"Count should be enabled for Numerical value in Field sort ","Count enabled for Numerical value in Field sort");
        }else {
     	    failReport(driver,"Count should be enabled for Numerical value Field sort ","Count  disabled for Numerical value in Field sort");
        }	
	    	
		 act.sendKeys(Keys.ESCAPE).build().perform();

		mouseOverAndClick(driver,sortType);
		click3(driver,QuickSort);
			
		String QuickSortByText=getText1(driver,quickSortBytext);
		mouseOverAndClick(driver,ApplyButton);

		verifyElementIsPresent(driver,Chart);
		List<WebElement> moveElements=driver.findElements(By.xpath("//*[name()='tspan']"));
		for(WebElement ele:moveElements) {
			Actions act3=new Actions(driver);
			act3.moveToElement(ele).build().perform();
		}
		
        String Y_Selected=getText1(driver,Y_SelectedValue);
        String X_Selected=getText1(driver,X_SelectedValue);
       
        int Y_number=getNumber(Y_Selected);
        String Y_SelectedString=getStringValue(Y_Selected);
        int X_number=getNumber(X_Selected);
        String X_SelectedString=getStringValue(X_Selected);
         
        String Y_chartvalue=getText1(driver,Y_Value);
        if(Y_chartvalue.equals(Y_SelectedString)) {
			passReport(driver,"Selected Y-Axis value Should display in Y-Axis in the chart : "+Y_SelectedString,"Selected Y-Axis value displayed in Y-Axis in the chart : "+Y_chartvalue);
        }else {
     	    failReport(driver,"Selected Y-Axis value Should display in Y-Axis in the chart : "+Y_SelectedString ,"Selected Y-Axis value not displayed in Y-Axis in the chart ");
        }
        
        String X_chartvaluefull=getText1(driver,X_Value);
        int startIndex = X_chartvaluefull.indexOf('(') + 1;
        int endIndex = X_chartvaluefull.indexOf(')');
        String X_chartvalue = X_chartvaluefull.substring(startIndex, endIndex);
        
        if(X_chartvalue.equals(X_SelectedString)) {
			passReport(driver,"Selected X-Axis value Should display in X-Axis in the chart : "+X_SelectedString,"Selected X-Axis value displayed in X-Axis in the chart : "+X_chartvalue);
        }else {
     	    failReport(driver,"Selected X-Axis value Should display in X-Axis in the chart : "+X_SelectedString ,"Selected X-Axis not displayed in X-Axis in the chart ");
        }
        
        mouseOverAndClick(driver,ApplyButton);
		verifyElementIsPresent(driver,Chart);
        if(isDisplayed(driver,minimize)) {
        	click3(driver,minimize);
        }
        mouseOverToElement(driver,DashProPage);
    	wait(driver,"2");

        List<WebElement> charts=getWebElements(driver,chartBars);
        int chartCount=charts.size();
        if(chartCount==Y_number) {
			passReport(driver,"For Show results 'All', Should display "+Y_number +" bar values in charts ","For Show results 'All', displayed "+chartCount +" bar values in charts ");
        }else {
     	    failReport(driver,"For Show results 'All', Should display "+Y_number +" bar values in charts ","For Show results 'All', not displayed "+Y_number +" bar values in charts  ");
        }
        
        graphOrderValidation(driver,charts,QuickSortByText);
        
        String sortValueBefore=getAttribute1(driver,AscDes,"value");
        click3(driver,AscDescButton);
        String sortValueAfter=getAttribute1(driver,AscDes,"value");
        if(sortValueBefore.equals(sortValueAfter)) {
     	    failReport(driver,"Ascending Descending button should works properly","Ascending Descending button not works properly");
        }else {
     	    passReport(driver,"Ascending Descending button should works properly","Ascending Descending button not works properly");
        }
        
        QuickSortByText=getText1(driver,quickSortBytext);
        mouseOverAndClick(driver,ApplyButton);
        wait(driver,"1");
		verifyElementIsPresent(driver,Chart);
		 if(isDisplayed(driver,minimize)) {
	        	mouseOverAndClick(driver,minimize);
	        	wait(driver,"1");
	       }
		 mouseOverToElement(driver,DashProPage);
	     wait(driver,"2");

		 
		List<WebElement> charts1=getWebElements(driver,chartBars);
	      
		graphOrderValidation(driver,charts1,QuickSortByText);
        
	    click3(driver,sortBy);  
	    click(driver,xvalueQuicksortBy);
		mouseOverAndClick(driver,ApplyButton);
		wait(driver,"1");
		verifyElementIsPresent(driver,Chart); 
		QuickSortByText=getText1(driver,quickSortBytext);
		 if(isDisplayed(driver,minimize)) {
	        	mouseOverAndClick(driver,minimize);
	        	wait(driver,"1");
	       }
		 mouseOverToElement(driver,DashProPage);
	    wait(driver,"2");

		List<WebElement> charts2=getWebElements(driver,chartBars);
		
		graphOrderValidation(driver,charts2,QuickSortByText);
	        
        click3(driver,AscDescButton);
        QuickSortByText=getText1(driver,quickSortBytext);
        mouseOverAndClick(driver,ApplyButton);
		wait(driver,"1");
        verifyElementIsPresent(driver,Chart); 
        if(isDisplayed(driver,minimize)) {
        	mouseOverAndClick(driver,minimize);
        	wait(driver,"1");
       }
        mouseOverToElement(driver,DashProPage);
    	wait(driver,"2");

        List<WebElement> charts3=getWebElements(driver,chartBars);
       
		graphOrderValidation(driver,charts3,QuickSortByText);

	        
	    click3(driver,showResult);
        click3(driver,Limit);
        
		verifyElementIsPresent(driver,showRecordType);
		verifyElementIsPresent(driver,Top1);
		verifyElementIsPresent(driver,Bottom1);
		verifyElementIsPresent(driver,limitInput);

		String defaultRecordType=defaultSelectedValue(driver,showRecordType);
		if(defaultRecordType.equals("Top")) {
			passReport(driver,"ShowRecordType should display the default value as, 'Top' ","ShowRecordType displayed the default value as, "+defaultRecordType);
		}else {
			passReport(driver,"ShowRecordType should display the default value as, 'Top' ","ShowRecordType displayed the default value as, "+defaultRecordType);
		}
        
		click3(driver,limitInput);
        act.sendKeys(Keys.BACK_SPACE).build().perform();
        act.sendKeys(Keys.BACK_SPACE).build().perform();
	    wait(driver,"1");
	    mouseOverAndClick(driver,ApplyButton);
		if(verifyElementIsPresent1(driver,Limit_Error)) {
			passReport(driver,"'Kindly provide the limit', Error should Display When limit not Given ","'Kindly provide the limit', Error Displayed When limit not Given");
		}else {
			failReport(driver,"'Kindly provide the limit', Error should Display When limit not Given","'Kindly provide the limit', Error not Displayed When limit not Given");
		}
	    wait(driver,"1");
		sendKeys(driver,limitInput,limitValue);
		wait(driver,"1");
		mouseOverAndClick(driver,ApplyButton);
		wait(driver,"1");
		verifyElementIsPresent(driver,Chart);  
		 if(isDisplayed(driver,minimize)) {
	        	mouseOverAndClick(driver,minimize);
	        	wait(driver,"1");
	       }
	        mouseOverToElement(driver,DashProPage);
	    	wait(driver,"2");

		List<WebElement> chartsLimit=getWebElements(driver,chartBars);
		String chartSiz= String.valueOf(chartsLimit.size());
	    if(chartSiz.equals(limitValue)) {
			passReport(driver,"The chart should  display according to limit selected","The chart displayed according to limit selected");
	    }else {
			failReport(driver,"The chart should  display according to limit selected","The chart not displayed according to limit selected");
	    }
		 
	    
	    
	    click(driver,Y_Axis_dropdown);
	    click(driver,selectDateValue);
	    
		verifyElementIsPresent(driver,groupDropdown);
		verifyElementIsPresent(driver,GroupText);
        String Grouptext_Act=getText1(driver,GroupText);
        textValidation(driver,GroupText_Exp,Grouptext_Act,GroupText);
        click(driver,groupDropdown);
		verifyElementIsPresent(driver,GroupDropdownExpand);
		click(driver,yearMonthDate);
		wait(driver,"1");
		if(isDisplayed2(driver,GroupDropdownExpand)) {
			 failReport(driver,"Group dropdown Should Close after Selecting value ","Group dropdown not Closed after Selecting value ");
		}else {
			passReport(driver,"Group dropdown Should Close after Selecting value ","Group dropdown Closed after Selecting value ");
		}
		
        String selectedGrouptextAct=getText1(driver,groupDropdown);
		click3(driver,groupDropdown);
		waitForElement(driver,GroupDropdownExpand);
        mouseOverToElement(driver,yearMonth);
		String selectedColorActGroup=getTextBackgroundColor(driver,ListSelected);
		String highlightTextgroup=getText1(driver,ListSelected);

		if((selectedGrouptextAct.equals(highlightTextgroup))&&SelectedTextColorExp.equals(selectedColorActGroup)) {
			 passReport(driver,"Selected Value ("+selectedGrouptextAct+") Should Highlight in Grey("+SelectedTextColorExp+") Color","Selected Value ("+highlightTextgroup+") Should Highlight in Grey("+selectedColorActGroup+") Color");
		}else {
   	    failReport(driver,"Selected Value ("+selectedGrouptextAct+") Should Highlight in Grey("+SelectedTextColorExp+") Color",highlightTextgroup+" Value Highlighted in "+selectedColorActGroup+"Color");
		}
		act.sendKeys(Keys.ESCAPE).build().perform();
		
		click3(driver,showResult);
        click3(driver,All);
		wait(driver,"1");
		mouseOverAndClick(driver,ApplyButton);
		click3(driver,ApplyButton);
		wait(driver,"1");
		verifyElementIsPresent(driver,Chart); 
		QuickSortByText=getText1(driver,quickSortBytext);
		 if(isDisplayed(driver,minimize)) {
	        	mouseOverAndClick(driver,minimize);
	        	wait(driver,"1");
	       }
		 mouseOverToElement(driver,DashProPage);
		 wait(driver,"2");
		List<WebElement> DateChart=getWebElements(driver,chartBars);
      
		graphOrderValidation(driver,DateChart,QuickSortByText);
		
        click3(driver,AscDescButton);
        mouseOverAndClick(driver,ApplyButton);
		wait(driver,"1");
        verifyElementIsPresent(driver,Chart); 
        
        List<WebElement> moveElements1=driver.findElements(By.xpath("//*[name()='tspan']"));
		for(WebElement ele:moveElements1) {
			Actions act3=new Actions(driver);
			act3.moveToElement(ele).build().perform();
		}
        
		String Y_chartvalue1=getText1(driver,Y_Value);
        if(Y_chartvalue1.equals("Date")) {
			passReport(driver,"Date Should display in Y-Axis in the chart ","Date displayed in Y-Axis in the chart ");
        }else {
     	    failReport(driver,"Date Should display in Y-Axis in the chart  ","Date not displayed in Y-Axis in the chart ");
        }
		
        if(isDisplayed(driver,minimize)) {
        	mouseOverAndClick(driver,minimize);
        	wait(driver,"1");
       }
        mouseOverToElement(driver,DashProPage);
    	wait(driver,"2");
        
        List<WebElement> DateChart1=getWebElements(driver,chartBars);
		
		graphOrderValidation(driver,DateChart1,QuickSortByText);    
        
        click(driver,sortType);
        click(driver,FieldSort);
        
        mouseOverAndClick(driver,ApplyButton);
        
        if(verifyElementIsPresent1(driver,sortError)) {
			passReport(driver,"'Kindly select any column to perform sort', Error should Display When sortBy not selected ","'Kindly select any column to perform sort', Error Displayed When sortBy not selected");
        }else {
			failReport(driver,"'Kindly select any column to perform sort', Error should Display When sortBy not selected","'Kindly select any column to perform sort', Error not Displayed When sort not selected");
        }
	    
       wait(driver,"1");
       click3(driver,fieldSortBytext);
       waitForElement(driver,sortByDropdownExpand);
       wait(driver,"1");
       doubleClick(driver,secondElementFieldSort);
       wait(driver,"1");
      
       String selectedText=getText1(driver,fieldSortBytext1);
       int startIndex1;
       int endIndex1;
        startIndex1 =0;
        if(selectedText.contains("[")) {
            endIndex1 = selectedText.indexOf('[');
        }else {
            endIndex1 = selectedText.indexOf(')');
        }

       String sortString = selectedText.substring(startIndex1, endIndex1);
       QuickSortByText=sortString.trim();
       mouseOverAndClick(driver,ApplyButton);
       wait(driver,"1");
       verifyElementIsPresent(driver,Chart);
       
       List<WebElement> moveElements2=driver.findElements(By.xpath("//*[name()='tspan']"));
		for(WebElement ele:moveElements2) {
			Actions act3=new Actions(driver);
			act3.moveToElement(ele).build().perform();
		}
       
		 if(isDisplayed(driver,minimize)) {
	        	mouseOverAndClick(driver,minimize);
	        	wait(driver,"1");
	       }
	        mouseOverToElement(driver,DashProPage);
	    	wait(driver,"2");
		List<WebElement> charts4=getWebElements(driver,chartBars);

//		graphOrderValidation(driver,charts4,QuickSortByText);

	}
	

 }
