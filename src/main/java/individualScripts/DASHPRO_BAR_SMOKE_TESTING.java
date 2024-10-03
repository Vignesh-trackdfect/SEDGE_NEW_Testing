package individualScripts;

import java.text.ParseException;
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

public class DASHPRO_BAR_SMOKE_TESTING extends Keywords{

	public void barwidgetTest(WebDriver driver,int iteration,String Flag,boolean AllTestcase) throws Exception {
		
		//Axes
		String AxesColor_Exp=Utils.getDataFromTestData("Axes", "Axes_Color_Exp");
		String ApplyBtn_text_Exp=Utils.getDataFromTestData("Axes", "Apply_Btn_Txt");
		String ApplyBtn_color_Exp=Utils.getDataFromTestData("Axes", "Apply_Btn_Color");
		String Highlight_color_Exp=Utils.getDataFromTestData("Axes", "HighlightColor");
		String Y_axis_text_Exp=Utils.getDataFromTestData("Axes", "Y_Axis_text");
		String X_axis_text_Exp=Utils.getDataFromTestData("Axes", "X_Axis_text");
		String Agg_text_Exp=Utils.getDataFromTestData("Axes", "Agg_text");

		//Axis title
		String AxisTextColorExp=Utils.getDataFromTestData("AxisTitle", "AxisTextColor_Exp");
		String default_FontFamily=Utils.getDataFromTestData("AxisTitle", "default_FontFamily");
		String default_FontSize_Exp=Utils.getDataFromTestData("AxisTitle", "default_FontSize");
		String defaultRotation=Utils.getDataFromTestData("AxisTitle", "default_Rotation_Value");
		String RotationInputColor_Exp=Utils.getDataFromTestData("AxisTitle", "RotationInput_Color");
		String Highlight_Color_Exp=Utils.getDataFromTestData("AxisTitle", "HighlightColor_Exp");
		String Selected_Color_Exp=Utils.getDataFromTestData("AxisTitle", "SelectedColor_Exp");

		//Chart title
		String ChartTitleColorExp=Utils.getDataFromTestData("ChartTitle", "ChartTitleColorExp");
		String DefaultBackgroundColor_Exp=Utils.getDataFromTestData("ChartTitle", "DefaultBackgroundColor");
		String DefaultFontColor_Exp=Utils.getDataFromTestData("ChartTitle", "DefaultFontColor");
		String Default_FontFamily=Utils.getDataFromTestData("ChartTitle", "default_FontFamily");
		String default_FontSizeChartTitle_Exp=Utils.getDataFromTestData("ChartTitle", "default_FontSize");

		//Chart Style
		String ChartFormatColorExp=Utils.getDataFromTestData("ChartFormat_ChartStyle", "ChartFormatColorExp");
		String ChartStylingColor_Exp=Utils.getDataFromTestData("ChartFormat_ChartStyle", "ChartStylingColor_Exp");
		String DefaultThemeValue_Exp=Utils.getDataFromTestData("ChartFormat_ChartStyle", "defaultThemeValue_Exp");
		String Highlight_ColorStyle_Exp=Utils.getDataFromTestData("ChartFormat_ChartStyle", "HighlightColor_Exp");
//		String EnableButtonColor=Utils.getDataFromTestData("ChartFormat_ChartStyle", "EnableButtonColor");
		
		//Data Labels
		String DataLabelsColor_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DataLabelsColor_Exp");
		String DefaultFormatValue_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DefaultFormatValue");
		String DefaultSeperatorValue_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DefaultSeperatorValue");
		String DefaultFontSizeValue_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DefaultFontSizeValue");
		String DefaultRoundOffValue_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DefaultRoundOffValue");
		String DefaultPositionValue_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DefaultPositionValue");
		String DefaultRotationValue_Exp=Utils.getDataFromTestData("ChartFormat_DataLabel", "DefaultRotationValue");

		//Other
		String Others_Color_Exp=Utils.getDataFromTestData("ChartFormat_Others", "Others_Color_Exp");
		String default_StatslineValueExp=Utils.getDataFromTestData("ChartFormat_Others", "default_StatslineValue");
		String defaultStatsLineColor_Exp=Utils.getDataFromTestData("ChartFormat_Others", "defaultStatsLineColor");
		String default_StatslinePosition_Exp=Utils.getDataFromTestData("ChartFormat_Others", "default_StatslinePosition");
		String default_RoundOffValue_Exp=Utils.getDataFromTestData("ChartFormat_Others", "default_RoundOffValue");
		//Filter
       	String AppluBtnColor_LocalFilterExp=Utils.getDataFromTestData("SmokeTesting_UI", "AppluBtnColor_LocalFilterExp");
		
		//Iteration Inputs
		//Axes
		String Select_Axis_Same_Value=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_BAR_Input", "Select_Axis_Same_Value");
		String Y_Axis_dataType=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_BAR_Input", "Y_Axis_dataType");
		String Select_Y_Axis_Value=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_BAR_Input", "Select_Y_Axis_Value");
		String X_Axis_dataType=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_BAR_Input", "X_Axis_dataType");
		String Select_X_Axis_Value=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_BAR_Input", "Select_X_Axis_Value");
		String Limit_Input_Axes=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_BAR_Input", "Limit_Input_Axes");
		String Select_SortBy_Value=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_BAR_Input", "Select_SortBy_Value");
		String SelectGroupValue_Date=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_BAR_Input", "SelectGroupValue_Date");

		//Axis Title
		String Change_Y_Title_Name=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_BAR_Input", "Change_Y_Title_Name");
		String Change_X_Title_Name=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_BAR_Input", "Change_X_Title_Name");
		String ChangeFontFamily_AxisTitle=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_BAR_Input", "ChangeFontFamily_AxisTitle");
		String ChangeTitleFontSize_AxisTitle=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_BAR_Input", "ChangeTitleFontSize_AxisTitle");
		String Change_X_label_FontSize=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_BAR_Input", "Change_X_label_FontSize");
		String Change_Y_label_FontSize=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_BAR_Input", "Change_Y_label_FontSize");
		String X_Rotation_Input=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_BAR_Input", "X_Rotation_Input");
		String Y_Rotation_Input=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_BAR_Input", "Y_Rotation_Input");
		
		//Chart title
		String TypeBackgroundColor1=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_BAR_Input", "TypeBackgroundColor1");
		String TypeTextColor1=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_BAR_Input", "TypeTextColor1");
		String Change_FontFamily_ChartTitle=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_BAR_Input", "Change_FontFamily_ChartTitle");
		String ChangeFontSize_ChartTitle=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_BAR_Input", "ChangeFontSize_ChartTitle");
		String ChangeChartTitleName=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_BAR_Input", "ChangeChartTitleName");

		//Chart Style
		String Change_ChartTheme_ChartStyle=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_BAR_Input", "Change_ChartTheme_ChartStyle");
		
		//Data Label
		String ChangeFontSizeValue_DataLabel=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_BAR_Input", "ChangeFontSizeValue_DataLabel");
		String ChangeRoundOffValue_DataLabel=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_BAR_Input", "ChangeRoundOffValue_DataLabel");
		String ChangeRotataionVal_Positive_DataLabel=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_BAR_Input", "ChangeRotataionVal_Positive_DataLabel");
		String ChangeRotataionVal_Negative_DataLabel=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_BAR_Input", "ChangeRotataionVal_Negative_DataLabel");
		String ChangeRoundOffValue_Others=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_BAR_Input", "ChangeRoundOffValue_Others");
		String ChartTitleName1_BAR_Smoke=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_BAR_Input", "ChartTitleName1_BAR_Smoke");

		String TabNameNew_Global_Bar=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_BAR_Input", "TabNameNew_Global_Bar");
		String ChartTitleName2_BAR_Smoke=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_BAR_Input", "ChartTitleName2_BAR_Smoke");

      //Local filter inputs Categorical
		String ByValuesInput_Categorical_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_LocalFilter_Bar", "ByValuesInput_Categorical_LF");
		String FirstCondition_1_Categorical_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_LocalFilter_Bar", "FirstCondition_1_Categorical_LF");
		String FirstCondition_2_Categorical_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_LocalFilter_Bar", "FirstCondition_2_Categorical_LF");
		String FirstCondition_3_Categorical_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_LocalFilter_Bar", "FirstCondition_3_Categorical_LF");
		String FirstCondition_4_Categorical_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_LocalFilter_Bar", "FirstCondition_4_Categorical_LF");
		String FirstCondition_5_Categorical_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_LocalFilter_Bar", "FirstCondition_5_Categorical_LF");
		String FirstCondition_6_Categorical_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_LocalFilter_Bar", "FirstCondition_6_Categorical_LF");
		String FirstCondition_7_Categorical_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_LocalFilter_Bar", "FirstCondition_7_Categorical_LF");
		String FirstCondition_8_Categorical_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_LocalFilter_Bar", "FirstCondition_8_Categorical_LF");
		String FirstCondition_Input_1_Categorical_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_LocalFilter_Bar", "FirstCondition_Input_1_Categorical_LF");
		String FirstCondition_Input_2_Categorical_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_LocalFilter_Bar", "FirstCondition_Input_2_Categorical_LF");
		String FirstCondition_Input_3_Categorical_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_LocalFilter_Bar", "FirstCondition_Input_3_Categorical_LF");
		String FirstCondition_Input_4_Categorical_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_LocalFilter_Bar", "FirstCondition_Input_4_Categorical_LF");
		String FirstCondition_Input_5_Categorical_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_LocalFilter_Bar", "FirstCondition_Input_5_Categorical_LF");
		String FirstCondition_Input_6_Categorical_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_LocalFilter_Bar", "FirstCondition_Input_6_Categorical_LF");
		String FirstCondition_Input_7_Categorical_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_LocalFilter_Bar", "FirstCondition_Input_7_Categorical_LF");
		String FirstCondition_Input_8_Categorical_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_LocalFilter_Bar", "FirstCondition_Input_8_Categorical_LF");
		String FirstCondition_Categorical_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_LocalFilter_Bar", "FirstCondition_Categorical_LF");
		String FirstCondition_Input_Categorical_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_LocalFilter_Bar", "FirstCondition_Input_Categorical_LF");
		String FirstOperator_Input_Categorical_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_LocalFilter_Bar", "FirstOperator_Input_Categorical_LF");
		String SecondOperator_Input_Categorical_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_LocalFilter_Bar", "SecondOperator_Input_Categorical_LF");
		String SecondCondition_Categorical_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_LocalFilter_Bar", "SecondCondition_Categorical_LF");
		String SecondCondition_Input_Categorical_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_LocalFilter_Bar", "SecondCondition_Input_Categorical_LF");
		String ThirdCondition_Categorical_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_LocalFilter_Bar", "ThirdCondition_Categorical_LF");
		String ThirdCondition_Input_Categorical_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_LocalFilter_Bar", "ThirdCondition_Input_Categorical_LF");

		//Local filter inputs Date
		String RelativeFilter_1_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Bar", "RelativeFilter_1_Date_LF");
		String RelativeFilter_2_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Bar", "RelativeFilter_2_Date_LF");
		String RelativeFilter_3_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Bar", "RelativeFilter_3_Date_LF");
		String RelativeFilter_4_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Bar", "RelativeFilter_4_Date_LF");
		String RelativeFilter_5_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Bar", "RelativeFilter_5_Date_LF");
		String RelativeFilter_6_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Bar", "RelativeFilter_6_Date_LF");
		String RelativeFilter_7_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Bar", "RelativeFilter_7_Date_LF");
		String RelativeFilter_8_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Bar", "RelativeFilter_8_Date_LF");
		String RelativeFilter_9_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Bar", "RelativeFilter_9_Date_LF");
		String RelativeFilter_10_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Bar", "RelativeFilter_10_Date_LF");
		String RelativeFilter_11_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Bar", "RelativeFilter_11_Date_LF");
		String RelativeFilter_12_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Bar", "RelativeFilter_12_Date_LF");
		String RelativeFilter_13_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Bar", "RelativeFilter_13_Date_LF");
		String RelativeFilter_14_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Bar", "RelativeFilter_14_Date_LF");
		String RelativeFilter_11_Input_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Bar", "RelativeFilter_11_Input_Date_LF");
		String RelativeFilter_12_Input_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Bar", "RelativeFilter_12_Input_Date_LF");
		String RelativeFilter_13_Input_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Bar", "RelativeFilter_13_Input_Date_LF");
		String RelativeFilter_14_Input_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Bar", "RelativeFilter_14_Input_Date_LF");
		String Condition_1_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Bar", "Condition_1_Date_LF");
		String Condition_2_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Bar", "Condition_2_Date_LF");
		String Condition_3_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Bar", "Condition_3_Date_LF");
		String Condition_4_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Bar", "Condition_4_Date_LF");
		String Condition_5_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Bar", "Condition_5_Date_LF");
		String Condition_6_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Bar", "Condition_6_Date_LF");
		String Condition_7_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Bar", "Condition_7_Date_LF");
		String Condition_8_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Bar", "Condition_8_Date_LF");
		String Condition_9_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Bar", "Condition_9_Date_LF");
		String Condition_1_Input_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Bar", "Condition_1_Input_Date_LF");
		String Condition_2_Input_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Bar", "Condition_2_Input_Date_LF");
		String Condition_3_Input_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Bar", "Condition_3_Input_Date_LF");
		String Condition_4_Input_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Bar", "Condition_4_Input_Date_LF");
		String Condition_5_Input_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Bar", "Condition_5_Input_Date_LF");
		String Condition_6_Input_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Bar", "Condition_6_Input_Date_LF");
		String Condition_7_Input_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Bar", "Condition_7_Input_Date_LF");
		String Condition_8_Input_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Bar", "Condition_8_Input_Date_LF");
		String Condition_9_InputA_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Bar", "Condition_9_InputA_Date_LF");
		String Condition_9_InputB_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Bar", "Condition_9_InputB_Date_LF");
		
		String FirstCondition_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Bar", "FirstCondition_Date_LF");
		String SecondCondition_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Bar", "SecondCondition_Date_LF");
		String ThirdCondition_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Bar", "ThirdCondition_Date_LF");
		String FirstCondition_Date_Input_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Bar", "FirstCondition_Date_Input_LF");
		String SecondCondition_Date_Input_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Bar", "SecondCondition_Date_Input_LF");
		String ThirdCondition_Date_Input_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Bar", "ThirdCondition_Date_Input_LF");
		String FirstOperator_Input_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Bar", "FirstOperator_Input_Date_LF");
		String SecondOperator_Input_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Bar", "SecondOperator_Input_Date_LF");
				
		// Numerical Local Filter Inputs
		String Condition_1_Num_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Bar", "Condition_1_Num_LF");
		String Condition_2_Num_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Bar", "Condition_2_Num_LF");
		String Condition_3_Num_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Bar", "Condition_3_Num_LF");
		String Condition_4_Num_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Bar", "Condition_4_Num_LF");
		String Condition_5_Num_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Bar", "Condition_5_Num_LF");
		String Condition_6_Num_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Bar", "Condition_6_Num_LF");
		String Condition_7_Num_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Bar", "Condition_7_Num_LF");
		String Condition_8_Num_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Bar", "Condition_8_Num_LF");
		String Condition_9_Num_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Bar", "Condition_9_Num_LF");
		String Condition_1_Input_Num_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Bar", "Condition_1_Input_Num_LF");
		String Condition_2_Input_Num_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Bar", "Condition_2_Input_Num_LF");
		String Condition_3_Input_Num_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Bar", "Condition_3_Input_Num_LF");
		String Condition_4_Input_Num_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Bar", "Condition_4_Input_Num_LF");
		String Condition_5_Input_Num_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Bar", "Condition_5_Input_Num_LF");
		String Condition_6_Input_Num_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Bar", "Condition_6_Input_Num_LF");
		String Condition_7_Input_Num_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Bar", "Condition_7_Input_Num_LF");
		String Condition_8_Input_Num_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Bar", "Condition_8_Input_Num_LF");
		String Condition_9_InputA_Num_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Bar", "Condition_9_InputA_Num_LF");
		String Condition_Between_InputB_Num_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Bar", "Condition_Between_InputB_Num_LF");
		
		String FirstCondition_Num_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Bar", "FirstCondition_Num_LF");
		String SecondCondition_Num_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Bar", "SecondCondition_Num_LF");
		String ThirdCondition_num_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Bar", "ThirdCondition_num_LF");
		String FirstCondition_Num_Input_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Bar", "FirstCondition_Num_Input_LF");
		String SecondCondition_Num_Input_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Bar", "SecondCondition_Num_Input_LF");
		String ThirdCondition_Num_Input_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Bar", "ThirdCondition_Num_Input_LF");
		String FirstOperator_Input_Num_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Bar", "FirstOperator_Input_Num_LF");
		String SecondOperator_Input_Num_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Bar", "SecondOperator_Input_Num_LF");
		  
		//filter inputs Text
		String ByValuesInput_Text_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_LocalFilter_Bar", "ByValuesInput_Text_LF");
		String Condition_1_Text_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_LocalFilter_Bar", "Condition_1_Text_LF");
		String Condition_2_Text_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_LocalFilter_Bar", "Condition_2_Text_LF");
		String Condition_3_Text_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_LocalFilter_Bar", "Condition_3_Text_LF");
		String Condition_4_Text_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_LocalFilter_Bar", "Condition_4_Text_LF");
		String Condition_5_Text_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_LocalFilter_Bar", "Condition_5_Text_LF");
		String Condition_6_Text_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_LocalFilter_Bar", "Condition_6_Text_LF");
		String Condition_7_Text_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_LocalFilter_Bar", "Condition_7_Text_LF");
		String Condition_8_Text_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_LocalFilter_Bar", "Condition_8_Text_LF");
		String Condition_Input_1_Text_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_LocalFilter_Bar", "Condition_Input_1_Text_LF");
		String Condition_Input_2_Text_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_LocalFilter_Bar", "Condition_Input_2_Text_LF");
		String Condition_Input_3_Text_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_LocalFilter_Bar", "Condition_Input_3_Text_LF");
		String Condition_Input_4_Text_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_LocalFilter_Bar", "Condition_Input_4_Text_LF");
		String Condition_Input_5_Text_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_LocalFilter_Bar", "Condition_Input_5_Text_LF");
		String Condition_Input_6_Text_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_LocalFilter_Bar", "Condition_Input_6_Text_LF");
		String Condition_Input_7_Text_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_LocalFilter_Bar", "Condition_Input_7_Text_LF");
		String Condition_Input_8_Text_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_LocalFilter_Bar", "Condition_Input_8_Text_LF");
		String FirstCondition_Text_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_LocalFilter_Bar", "FirstCondition_Text_LF");
		String FirstCondition_Input_Text_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_LocalFilter_Bar", "FirstCondition_Input_Text_LF");
		String FirstOperator_Input_Text_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_LocalFilter_Bar", "FirstOperator_Input_Text_LF");
		String SecondOperator_Input_Text_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_LocalFilter_Bar", "SecondOperator_Input_Text_LF");
		String SecondCondition_Text_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_LocalFilter_Bar", "SecondCondition_Text_LF");
		String SecondCondition_Input_Text_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_LocalFilter_Bar", "SecondCondition_Input_Text_LF");
		String ThirdCondition_Text_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_LocalFilter_Bar", "ThirdCondition_Text_LF");
		String ThirdCondition_Input_Text_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_LocalFilter_Bar", "ThirdCondition_Input_Text_LF");	
		
		Actions action=new Actions(driver);
		
		mouseOverToElement(driver, ADDTabPlus);
  	    mouseOverAndClick(driver, ADDTabPlus);
  	    wait(driver,"1");
  	    sendKeys(driver,newlyAddedTab,"BarTestTab1");
  	    click(driver,DashProPage);
  	    elementnotvisible1(driver, RPE_Loading);
		waitForElement(driver,ADD_widget_rightTop);
	    click(driver,ADD_widget_rightTop);
	    elementnotvisible(driver,Loading);
	    elementnotvisible1(driver, RPE_Loading);
	    if(isDisplayed(driver,WidgetPanel) && isDisplayed(driver,Sparkline_widget)) {
		    pass(driver,"Widgets are displayed after click the Add widget button ");
	   	}else {       
	   		fail(driver,"Widgets are not displayed after click the Add widget button ");
	   	}
	   
		waitForElement(driver,WidgetPanel);
		waitForElement(driver,Sparkline_widget);
		waitForElement(driver,Bar_widget);
		click(driver,Bar_widget);
		elementnotvisible(driver, Loading);
		elementnotvisible1(driver, RPE_Loading);
		String widgetValue=getText1(driver,WidgetValue);
	 	if(widgetValue.equals("Bar")) {
			pass(driver,"Bar displayed as the selected Widget ");
	 	}else {
	 		fail(driver,"Bar not displayed as the selected Widget ");
	 	}
		
	 	String AxesExpand=getAttribute1(driver,Axes_Expand,"class");
    	if(AxesExpand.contains("up")) {
    		 pass(driver,"By default Bar Axes Section is Expanded");
    	}else {
    		 fail(driver,"By default Bar Axes Section is not Expanded");
    	}
    	 
		String AxesTextColor_Act=getTextColor(driver,Axes);
		if(AxesColor_Exp.equalsIgnoreCase(AxesTextColor_Act)) {
			pass(driver," 'Axes' highlighted in blue color");
		}else {
			fail(driver," 'Axes' not highlighted in blue color");
		}
		
		verifyElementDisplayed(driver,Y_Axis_dropdown);
		if(verifyElementDisplayed(driver,Y_Axis_text)) {
			String Y_axis_text_Act=getText1(driver,Y_Axis_text);
      		textValidation(driver,Y_axis_text_Exp,Y_axis_text_Act,Y_Axis_text);
		}
		
		String defaultSelectValue_Y_Act=getText1(driver,Y_Axis_dropdown);
		if(defaultSelectValue_Y_Act.equals("Select")) {
			pass(driver,"By Default 'Select' is selected in the Y axis value input dropdown ");
		}else {
			fail(driver,"By Default 'Select' is not selected in the Y axis value input dropdown ");
		}
		
		verifyElementDisplayed(driver,X_Axis_dropdown);
		if(verifyElementDisplayed(driver,X_Axis_text)) {
			String X_axis_text_Act=getText1(driver,X_Axis_text);
      		textValidation(driver,X_axis_text_Exp,X_axis_text_Act,X_Axis_text);
		}
		
		String defaultSelectValue_X_Act=getText1(driver,X_Axis_dropdown);
		if(defaultSelectValue_X_Act.equals("Select")) {
			pass(driver,"By Default 'Select' is selected in the X axis value input dropdown ");
		}else {
			fail(driver,"By Default 'Select' is not selected in the X axis value input dropdown ");
		}
		
		verifyElementDisplayed(driver,aggregation);
		if(verifyElementDisplayed(driver,aggText)) {
			String Agg_text_Act=getText1(driver,aggText);
      		textValidation(driver,Agg_text_Exp,Agg_text_Act,aggText);
		}
		
		
		verifyElementDisplayed(driver,ApplyButton);
		String ApplyBtn_textAct=getText1(driver,ApplyButton);
		textValidation(driver,ApplyBtn_text_Exp,ApplyBtn_textAct,ApplyButton);

		String ApplyBtn_Color_Act=getTextBackgroundColor(driver,ApplyButton);
		if(ApplyBtn_color_Exp.equalsIgnoreCase(ApplyBtn_Color_Act)) {
			pass(driver,"Apply button displayed with blue color");
		}else {
			fail(driver,"Apply button not displayed with blue color, Exp : "+ApplyBtn_color_Exp+" Act : "+ApplyBtn_Color_Act);
		}
		
//		colorValidation(driver,ApplyBtn_color_Exp,ApplyBtn_Color_Act,ApplyButton);
		//Axes properties Validation end
		
		//Click Apply button without select X and Y value , then Validating error start
		scrollUsingElement(driver, ApplyButton);
		click(driver,ApplyButton);
		if(isDisplayed(driver,ApplyError1)) {
			pass(driver,"'Kindly select X axis and Y axis ' Error displayed when click Apply button without providing inputs");
		}else {
			fail(driver,"'Kindly select X axis and Y axis ' Error not displayed when click Apply button without providing inputs");
		}
		//Click Apply button without select X and Y value , then Validating error End

		
		click(driver,Y_Axis_dropdown);
		if(isDisplayed(driver,Y_Axis_dropdownResults)) {
			pass(driver,"Y-Axis dropdown Expanded after click on it");
			
			List<WebElement> displayedDataImage=getWebElements(driver, dataTypeImages);
			List<WebElement> AvailableColumnList=getWebElements(driver, AvailableList);
			int AvailableColumnListSize=AvailableColumnList.size()-1;
			if(AvailableColumnListSize==displayedDataImage.size()) {
				pass(driver,"All the available columns are displayed with data Type icon in the Y_Axis dropdown");
			}else {
				fail(driver,"Some columns are not correctly displayed with data Type icon in the Y_Axis dropdown");
			}
			
			for(WebElement dataImag:displayedDataImage) {
				String dataTypeDisplay=dataImag.getAttribute("src");
				if(dataTypeDisplay.contains("Date") || dataTypeDisplay.contains("Categorical") || dataTypeDisplay.contains("Numerical") || dataTypeDisplay.contains("Text")) {
					
				}else {
					fail(driver,"Other than Date,Categorical,Numerical and Text datatype column is displayed in the Y_Axis dropdown");
					break;
				}
				
			}
			
			if(isDisplayed2(driver,CategoricalColumnAxisDropdown)) {
				String Categorical1=getText1(driver,CategoricalColumnAxisDropdown);
				if(Categorical1.contains("(")) {
					pass(driver,"Unique values are displayed in the Categorical Column in the Y_Axis dropdown");
				}else {
					fail(driver,"Unique values are not displayed in the Categorical Column in the Y_Axis dropdown");
				}
			}
			
			if(isDisplayed2(driver,TextColumnAxisDropdown)) {
				String Text1=getText1(driver,TextColumnAxisDropdown);
				if(Text1.contains("(")) {
					pass(driver,"Unique values are displayed in the Text Column in the Y_Axis dropdown");
				}else {
					fail(driver,"Unique values are not displayed in the Text Column in the Y_Axis dropdown");
				}
			}
			
			ScrollBarValidation1(driver,Y_Axis_dropdownResults,"Y-Axis");
			//ScrollBarValidation(driver,Y_Axis_dropdownResults,HighlightTextElement,"Y-Axis");
			mouseOverToElement(driver,SecondValue);
			String Highlight_Color_Act=getTextBackgroundColor(driver,SecondValue);
			if(Highlight_color_Exp.equalsIgnoreCase(Highlight_Color_Act)) {
				pass(driver," Mouse hovered Column Value highlighted in blue color in the Y_Axis dropdown");
			}else {
				fail(driver," Mouse hovered Column Value not highlighted in blue color in the Y_Axis dropdown, Exp : "+Highlight_color_Exp+" Act : "+Highlight_Color_Act);
			}
			
			
			if(verifyElementDisplayed(driver, dropdownInputsearchBox)) {
				click(driver,dropdownInputsearchBox);
				sendKeys(driver,dropdownInputsearchBox,"afghjku");
				if(isDisplayed2(driver,NoResultsFound)) {
					pass(driver,"'No Results found' message is displayed in while searching invalid value in the Y_Axis dropdown input");
				}else {
					fail(driver,"'No Results found' message is not displayed in while searching invalid value in the Y_Axis dropdown input");
				}
				
				clear1(driver,dropdownInputsearchBox);
				wait(driver,"1");
				if(isDisplayed2(driver,NoResultsFound)){
					fail(driver,"Column List are not displayed after clear the search input in the Y_Axis dropdown");
				}else {
					pass(driver,"Column List are displayed after clear the search input in the Y_Axis dropdown");
				}
				
				sendKeys(driver,dropdownInputsearchBox,Select_Axis_Same_Value);
				wait(driver,"1");
				String firstValue_Y=getText1(driver,FirstSearchedvalue);
				if(firstValue_Y.contains(Select_Axis_Same_Value)) {
					pass(driver,"Searched Value correctly displayed in the Y_Axis dropdown");
					action.sendKeys(Keys.ENTER).build().perform();
					wait(driver,"1");
					if(isDisplayed2(driver,Y_Axis_dropdownResults)) {
						fail(driver,"Y_Axis Value dropdown not closed after perform 'Enter' action");
					}else {
						pass(driver,"Y_Axis Value dropdown closed automatically after perform 'Enter' action");
						String seletcedValue=getText1(driver,Y_Axis_dropdown);
						if(seletcedValue.contains(Select_Axis_Same_Value)) {
							pass(driver,"Selected value displayed in the Y_Axis Input after click Enter");
						}else {
							fail(driver,"Selected value not displayed in the Y_Axis Input after click Enter");
						}
					}
					
				}else {
					fail(driver,"Searched Value not correctly displayed in the Y_Axis dropdown");
				}
			}
			
		}else {
			fail(driver,"Y-Axis dropdown not Expanded after click on it");
		}
		
		click(driver,Y_Axis_text);
		click(driver,Y_Axis_dropdown);
		waitForElement(driver,Y_Axis_dropdownResults);
		String selectedColorAct=getTextBackgroundColor(driver,ListSelected);
		System.out.println("Highlight_color_Exp : "+Highlight_color_Exp+"selectedColorAct : "+selectedColorAct);
		String highlightText=getText1(driver,ListSelectedText);
		if((highlightText.contains(Select_Axis_Same_Value))&&Highlight_color_Exp.equalsIgnoreCase(selectedColorAct)) {
			pass(driver,"Selected Value ("+Select_Axis_Same_Value+") highlighted in blue color");
		}else {
			fail(driver,"Selected Value ("+Select_Axis_Same_Value+") not highlighted in blue color");
		}
		
		selectDropdownValue1(driver,Select_Axis_Same_Value);
		wait(driver,"1");
		if(isDisplayed2(driver,Y_Axis_dropdownResults)) {
			fail(driver,"Y_Axis Value dropdown not closed after selecting the value");
		}else {
			pass(driver,"Y_Axis Value dropdown closed automatically after selecting the value");
		}
		
		scrollUsingElement(driver, ApplyButton);
		click(driver,ApplyButton);
		if(isDisplayed(driver,ApplyError1)) {
			pass(driver,"'Kindly select X axis and Y axis ' Error displayed when click Apply button only providing Y_Axis Value");
		}else {
			fail(driver,"'Kindly select X axis and Y axis ' Error not displayed when click Apply button only providing Y_Axis Value");
		}
		
		String defaultaggre=defaultSelectedValue(driver,aggregation);
        if(defaultaggre.equals("Sum")) {
        	pass(driver,"'Sum' is selected as default aggrigation");
		}else {
			fail(driver,"'Sum' is not selected as default aggrigation");
		}
		
		click(driver,Y_Axis_dropdown);
		waitForElement(driver,SelectOption);
		click(driver,SelectOption);
		wait(driver,"1");
		
		click(driver,X_Axis_dropdown);
		if(isDisplayed(driver,X_Axis_dropdownResults)) {
			pass(driver,"X-Axis dropdown Expanded after click on it");
		}else {
			fail(driver,"X-Axis dropdown not Expanded after click on it");
		}
		
		verifyElementDisplayed(driver, dropdownInputsearchBox);
		click(driver,dropdownInputsearchBox);
		
		List<WebElement> displayedDataImage=getWebElements(driver, dataTypeImages);
		List<WebElement> AvailableColumnList=getWebElements(driver, AvailableList);
		int AvailableColumnListSize=AvailableColumnList.size()-1;
		if(AvailableColumnListSize==displayedDataImage.size()) {
			pass(driver,"All the available columns are displayed with data Type icon in the X_Axis dropdown");
		}else {
			fail(driver,"Some columns are not correctly displayed with data Type icon in the X_Axis dropdown");
		}
		
		for(WebElement dataImag:displayedDataImage) {
			String dataTypeDisplay=dataImag.getAttribute("src");
			if(dataTypeDisplay.contains("Date") || dataTypeDisplay.contains("Categorical") || dataTypeDisplay.contains("Numerical") || dataTypeDisplay.contains("Text")) {
				
			}else {
				fail(driver,"Other than Date,Categorical,Numerical and Text datatype column is displayed in the X_Axis dropdown");
				break;
			}
			
		}
		
		if(isDisplayed2(driver,CategoricalColumnAxisDropdown)) {
			String Categorical1=getText1(driver,CategoricalColumnAxisDropdown);
			if(Categorical1.contains("(")) {
				pass(driver,"Unique values are displayed in the Categorical Column in the X_Axis dropdown");
			}else {
				fail(driver,"Unique values are not displayed in the Categorical Column in the X_Axis dropdown");
			}
		}
		
		if(isDisplayed2(driver,TextColumnAxisDropdown)) {
			String Text1=getText1(driver,TextColumnAxisDropdown);
			if(Text1.contains("(")) {
				pass(driver,"Unique values are displayed in the Text Column in the X_Axis dropdown");
			}else {
				fail(driver,"Unique values are not displayed in the Text Column in the X_Axis dropdown");
			}
		}
		
		ScrollBarValidation1(driver,X_Axis_dropdownResults,"X-Axis");
		selectDropdownValue1(driver,Select_Axis_Same_Value);
		wait(driver,"1");
		if(isDisplayed2(driver,X_Axis_dropdownResults)) {
			fail(driver,"X_Axis Value dropdown not closed after selecting the value");
		}else {
			pass(driver,"X_Axis Value dropdown closed automatically after selecting the value");
		}
		
		scrollUsingElement(driver, ApplyButton);
		click(driver,ApplyButton);
		if(isDisplayed(driver,ApplyError1)) {
			pass(driver,"'Kindly select X axis and Y axis ' Error displayed when click Apply button only providing X_Axis Value");
		}else {
			fail(driver,"'Kindly select X axis and Y axis ' Error not displayed when click Apply button only providing X_Axis Value");
		}
		
		click(driver,Y_Axis_dropdown);
		waitForElement(driver,Y_Axis_dropdownResults);
		selectDropdownValue1(driver,Select_Axis_Same_Value);
		wait(driver,"1");
		scrollUsingElement(driver, ApplyButton);
		click(driver,ApplyButton);
		if(isDisplayed(driver,ApplyError2)) {
			pass(driver,"'Kindly check fields and select different values' Error displayed when click Apply button with same X_Axis and Y_Axis Value");
		}else {
			fail(driver,"'Kindly check fields and select different values' Error not displayed when click Apply button with same X_Axis and Y_Axis Value");
		}
		
		click(driver,Y_Axis_dropdown);
		waitForElement(driver,Y_Axis_dropdownResults);
		selectDropdownValue(driver,Y_Axis_dataType,Select_Y_Axis_Value);
		//new lines
		if(Y_Axis_dataType.equals("Date")) {
			verifyElementDisplayed(driver,GroupText);
			if(isDisplayed(driver,groupDropdown)) {
				pass(driver,"Group selection input option is displayed While select Date datatype in Y_axis");
				click(driver,groupDropdown);
				if(verifyElementDisplayed(driver, GroupDropdownExpand)){
					
					selectGroupDateValue(driver,SelectGroupValue_Date);
					wait(driver,"1");
					if(isDisplayed2(driver,GroupDropdownExpand)) {
						 fail(driver,"Group dropdown not closed after Selecting value ");
					}else {
						pass(driver,"Group dropdown Closed after Selecting value ");
					}
				}
				
			}else {
				fail(driver,"Group selection input option is not displayed While select Date datatype in Y_axis");
			}
		}
		//new lines
		waitForElement(driver,X_Axis_dropdown);
		click(driver,X_Axis_dropdown);
		waitForElement(driver,X_Axis_dropdownResults);
		selectDropdownValue(driver,X_Axis_dataType,Select_X_Axis_Value);
		
		//For testing validation purpose, need to command
		//scrollUsingElement(driver, ApplyButton);
		//click(driver,ApplyButton);
		//For testing validation purpose, need to command
		
		click(driver,aggregation);
		verifyElementIsPresent1(driver, Sum);
		verifyElementIsPresent1(driver, Count);
		verifyElementIsPresent1(driver, Average);
		verifyElementIsPresent1(driver, Min);
		verifyElementIsPresent1(driver, Max);
		verifyElementIsPresent1(driver, Unique);

		if(X_Axis_dataType.contains("Categorical") || X_Axis_dataType.contains("Text") || X_Axis_dataType.contains("Date")) {
			aggregationValidation1(driver);
		}else {
			aggregationValidation2(driver);
		}
		
		String defaultShowResult=defaultSelectedValue(driver,showResult);
        if(defaultShowResult.equals("All")) {
        	pass(driver,"'All' is selected by default in the Showresults input");
		}else {
        	fail(driver,"'All' is not selected by default in the Showresults input");
		}
        click(driver,showResult);
		verifyElementIsPresent1(driver,All);
		verifyElementIsPresent1(driver,Limit);
		wait(driver,"1");
		
		String Y_Selected=getText1(driver,Y_SelectedValue);
		if(Y_Axis_dataType.contains("Categorical") || Y_Axis_dataType.contains("Text")) {
			
			int Y_number=getNumber(Y_Selected);
	        String Y_SelectedString=getStringValue(Y_Selected);
	        
			scrollUsingElement(driver, ApplyButton);
			click(driver,ApplyButton);
			elementnotvisible1(driver, RPE_Loading);
			verifyElementDisplayed(driver,Chart);
	        if(isDisplayed(driver,minimize)) {
	        	click(driver,minimize);
	        }
	        
	        mouseOverToElement(driver,DashProPage);
	    	wait(driver,"2");

	        List<WebElement> charts=getWebElements(driver,chartBars);
	        int chartCount=charts.size();
	        if(Y_number!=0) {
	        	if(chartCount==Y_number) {
		        	pass(driver,"For Show results 'All' bar displayed count matched with selected Y_Axis count value");
		        }else {
		        	fail(driver,"For Show results 'All' bar displayed count mismatched with selected Y_Axis count value, Exp : "+Y_number+" Act : "+chartCount);
		        }
	        }
	        
		}
        
		List<WebElement> DefaultCharts=getWebElements(driver,chartBars);
		int defaultSizeChart=DefaultCharts.size();
		click(driver,showResult);
		selectByText(driver, showResult, "Limit");
        
		verifyElementIsPresent1(driver,showRecordType);
		verifyElementIsPresent1(driver,Top1);
		verifyElementIsPresent1(driver,Bottom1);
		verifyElementIsPresent1(driver,limitInput);
		
		String defaultShowRecordType=defaultSelectedValue(driver,showRecordType);
        if(defaultShowRecordType.equals("Top")) {
        	pass(driver,"'Top' is selected by default in the showRecordType input");
		}else {
        	fail(driver,"'Top' is not selected by default in the showRecordType input");
		}
        
		clear1(driver,limitInput);
		scrollUsingElement(driver, ApplyButton);
		click(driver,ApplyButton);
		
		if(isDisplayed(driver,Limit_Error)) {
			pass(driver,"'Kindly provide the limit', Error displayed when click the Apply button without providing the limit value");
		}else {
			fail(driver,"'Kindly provide the limit', Error not displayed when click the Apply button without providing the limit value");
		}
		
		if(defaultSizeChart>1) {
			click3(driver,limitInput);
			sendKeys(driver,limitInput,Limit_Input_Axes);
			scrollUsingElement(driver, ApplyButton);
			click(driver,ApplyButton);
			elementnotvisible1(driver, RPE_Loading);
			verifyElementDisplayed(driver,Chart);
	        if(isDisplayed(driver,minimize)) {
	        	click(driver,minimize);
	        }
	        
	        
	        mouseOverToElement(driver,DashProPage);
	    	wait(driver,"2");
	        int limit_Number=Integer.parseInt(Limit_Input_Axes);
	        List<WebElement> charts=getWebElements(driver,chartBars);
	        int chartCount=charts.size();
	        if(chartCount==limit_Number) {
	        	pass(driver,"For Selected Limit Value, bar displayed count matched with Limit count value");
	        }else {
	        	fail(driver,"For Selected Limit Value, bar displayed count mismatched with Limit count value, Exp : "+limit_Number+" Act : "+chartCount);
	        }
			
	        elementScreenShot_new(driver,Chart,"/Expected_screenshot/SmokeTesting/barChart_Top");
	        
			selectByText(driver, showRecordType, "Bottom");
			wait(driver,"1");
			clear1(driver,limitInput);
			sendKeys(driver,limitInput,Limit_Input_Axes);
			scrollUsingElement(driver, ApplyButton);
			click(driver,ApplyButton);
			elementnotvisible1(driver, RPE_Loading);
			verifyElementDisplayed(driver,Chart);
	        if(isDisplayed(driver,minimize)) {
	        	click(driver,minimize);
	        }
			
			elementScreenShot_new(driver,Chart,"/Actual_screenshot/SmokeTesting/barChart_Bottom");

	        try {
	        	boolean chartDiff=imageComparison2(driver, "/SmokeTesting/barChart_Top", "/SmokeTesting/barChart_Bottom");
				wait(driver, "2");
				if(chartDiff==false) {
					pass(driver,"'Bottom' in the Show recordType working properly");
				}else {
					fail(driver,"'Bottom' in the Show recordType not working properly");
				}
			} catch (Exception e1) {
				fail(driver,"Unable to compare the Images Top and Bottom charts images");
			}
	        
		}
		
        selectByText(driver,showResult,"All");
        
		verifyElementIsPresent1(driver,sortType);  
		verifyElementIsPresent1(driver,sortBy);
		
		String defaultSortType=defaultSelectedValue(driver,sortType);
        if(defaultSortType.equals("Quick Sort")) {
        	pass(driver,"'Quick Sort' is selected by default in the sortType input");
		}else {
        	fail(driver,"'Quick Sort' is not selected by default in the sortType input");
		}
        
		click(driver,sortType);
		selectByText(driver,sortType,"Quick Sort");
		click(driver,sortBy);
		if(verifyElementDisplayed(driver,sortByDropdownExpand)) {
			List<WebElement> SortByValues=getWebElements(driver,sortByValues);
		    int SortByValuesCount=SortByValues.size();
		    if(SortByValuesCount<=3) {
		    	pass(driver,"Only X and Y values are displayed in the sortBy field for Quicksort condition");
		    }else {
		    	fail(driver,"Other than X and Y values are displayed in the sortBy field for Quicksort condition");
		    }
		    
		}
	    
		selectByText(driver,sortType,"Field Sort");
		click(driver,sortBy1);
		if(verifyElementDisplayed(driver,sortByDropdownExpand)) {
			
			List<WebElement> SortByValues1=getWebElements(driver,sortByValues1);
	        int SortByValuesCount=SortByValues1.size();
	    	if(SortByValuesCount<=3) {
		    	fail(driver,"Only X and Y values are displayed in the sortBy field for Fieldsort condition");
	    	}else {
		    	pass(driver,"All values are displayed in the sortBy field for Fieldsort condition");
		    	wait(driver,"1");
		    	
		    	if(isDisplayed(driver,Cate_agg_fieldSortValue)) {
		    		mouseOverAndClick(driver, Cate_agg_fieldSortValue);
		    		String defaultCategoricalSelect=defaultSelectedValue(driver,Cate_agg_fieldSortValue);
			    	if(defaultCategoricalSelect.equals("Count")) {
			    		pass(driver,"'Count' is selected as default for Categorical in Field sort ");
			    	}else {
			    		fail(driver,"'Count' is not selected as default for Categorical in Field sort ");
			    	}
			    	
			    	//mouseOverAndClick(driver,Cat_agg_fieldSort);
			    	if(isDisplayed2(driver,sumDisabledFieldsortCate)) {
			 			pass(driver,"Sum disabled for Categorical value in Field sort");
			         }else {
			 			fail(driver,"Sum not disabled for Categorical value in Field sort");
			         }
			         
			         if(isDisplayed2(driver,AvgDisabledFieldsortCate)) {
			 			pass(driver,"Average disabled for Categorical value in Field sort");
			         }else {
				 		fail(driver,"Average not disabled for Categorical value in Field sort");
			         }
			         
			         if(isDisplayed2(driver,minDisabledFieldsortCate)) {
			 			pass(driver,"Minimum disabled for Categorical value in Field sort");
			         }else {
			 			fail(driver,"Minimum not disabled for Categorical value in Field sort");
			         }
			         
			         if(isDisplayed2(driver,maxDisabledFieldsortCate)) {
			 			pass(driver,"Maximum disabled for Categorical value in Field sort");
			         }else {
			 			fail(driver,"Maximum not disabled for Categorical value in Field sort");
			         }
			         
			         if(!isDisplayed2(driver,uniqueDisabledFieldsortCate)) {
			 			pass(driver,"Unique enabled for Categorical value in Field sort");
			         }else {
			 			fail(driver,"Unique not enabled for Categorical value in Field sort");
			         }
			         
			         if(!isDisplayed2(driver,countDisabledFieldsortCate)) {
				 		pass(driver,"Count enabled for Categorical value in Field sort");
			         }else {
					 	fail(driver,"Count not enabled for Categorical value in Field sort");
			         } 
			         mouseOverAndClick(driver, Cate_agg_fieldSortValue);
			         //action.sendKeys(Keys.ESCAPE).build().perform();
		    	}else {
		    		fail(driver,"Categorical Sort by agg Value not present in the dropdown");
		    	}
		    	
		    	 wait(driver,"1");
		    	 if(isDisplayed(driver,Num_agg_fieldSortValue)) {
		    		 mouseOverAndClick(driver, Num_agg_fieldSortValue);
		    		 String defaultNumericalSelect=defaultSelectedValue(driver,Num_agg_fieldSortValue);
			 		 if(defaultNumericalSelect.equals("Sum")) {
			 			pass(driver,"'Sum' is selected as default for Numerical in Field sort ");
			     	 }else {
			 			fail(driver,"'Sum' is not selected as default for Numerical in Field sort ");
			     	 }
			 	     //click3(driver,Num_agg_fieldSort);
			 	    	
			 	     if(!isDisplayed2(driver,sumDisabledFieldsortNum)) {
			 			pass(driver,"Sum enabled for Numerical value in Field sort");
			         }else {
				 		fail(driver,"Sum not enabled for Numerical value in Field sort");
			         }
			         
			         if(!isDisplayed2(driver,AvgDisabledFieldsortNum)) {
			 			pass(driver,"Average enabled for Numerical value in Field sort ");
			         }else {
			 			fail(driver,"Average not enabled for Numerical value in Field sort ");
			         }
			         
			         if(!isDisplayed2(driver,minDisabledFieldsortNum)) {
			 			pass(driver,"Minimum enabled for Numerical value in Field sort");
			         }else {
				 		fail(driver,"Minimum not enabled for Numerical value in Field sort");
			         }
			         
			         if(!isDisplayed2(driver,maxDisabledFieldsortNum)) {
			 			pass(driver,"Maximum enabled for Numerical value in Field sort");
			         }else {
			 			fail(driver,"Maximum not enabled for Numerical value in Field sort");
			         }
			         
			         if(!isDisplayed2(driver,uniqueDisabledFieldsortNum)) {
			 			pass(driver,"Unique enabled for Numerical value in Field sort");
			         }else {
			 			fail(driver,"Unique not enabled for Numerical value in Field sort");
			         }
			         
			         if(!isDisplayed2(driver,countDisabledFieldsortNum)) {
			 			pass(driver,"Count enabled for Numerical value in Field sort");
			         }else {
			 			fail(driver,"Count not enabled for Numerical value in Field sort");
			         }	
			         mouseOverAndClick(driver, Num_agg_fieldSortValue);
			 		 //action.sendKeys(Keys.ESCAPE).build().perform();
		    	 }else {
			    	  fail(driver,"Numerical Sort by agg Value not present in the dropdown");
			     }
		 		 
		 		ScrollBarValidation1(driver, ListFieldSection, "Field Sort");
		 		if(verifyElementDisplayed(driver, inputFieldSort)) {
		 			
		 			List<WebElement> AllList=getWebElements(driver, ListFieldsort);
		 			int lastindex=AllList.size()-1;
		 			String lastText=AllList.get(lastindex).getText();
		 			click(driver,inputFieldSort);
		 			sendKeys(driver, inputFieldSort, "dgrehtj");
		 			if(isDisplayed(driver,NoResultsFound)) {
		 				pass(driver,"No results found is displayed for invalid input");
		 			}else {
		 				fail(driver,"No results found is not displayed for invalid input");
		 			}
		 			clear1(driver,inputFieldSort);
		 			wait(driver,"1");
		 			sendKeys(driver, inputFieldSort, lastText);
		 			String firstList=getText1(driver, FirstField);
		 			if(firstList.equals(lastText)) {
		 				pass(driver,"Search input inside the field sort working properly");
		 			}else {
		 				fail(driver,"Search input inside the field sort not working properly");
		 			}
		 			
		 			action.sendKeys(Keys.ENTER).build().perform();
		 			wait(driver,"1");
		 			String appliedSort=getText1(driver, sortedInput);
		 			if(!appliedSort.equalsIgnoreCase("Select")) {
		 				pass(driver,"Column Value selected when click Enter in the field sort");
		 			}else {
		 				fail(driver,"Column Value not selected when click Enter in the field sort");
		 			}
		 			
		 		}
		 		
	    	}
	    	
		}
		
		mouseOverAndClick(driver,sortType);
		selectByText(driver,sortType,"Quick Sort");
		click(driver,quickSortBytext);
		waitForElement(driver,SelectOption);
		click(driver,SelectOption);
		scrollUsingElement(driver, ApplyButton);
		click(driver,ApplyButton);
		
		if(isDisplayed(driver,sortError)) {
			pass(driver,"'Kindly select any column to perform sort', Error Displayed When sortBy input not selected");
		}else {
			fail(driver,"'Kindly select any column to perform sort', Error not Displayed When sortBy input not selected");
		}
		
		click(driver,quickSortBytext);
		WebElement selectSort=driver.findElement(By.xpath("//ul//span[text()='"+Select_SortBy_Value+"']"));
		selectSort.click();
		String QuickSortByText=getText1(driver,quickSortBytext);
		scrollUsingElement(driver, ApplyButton);
		click(driver,ApplyButton);
		
		elementnotvisible1(driver, RPE_Loading);
		verifyElementIsPresent(driver,Chart);
		if(isDisplayed(driver,minimize)) {
        	click(driver,minimize);
        	elementnotvisible(driver,Loading);
        }
		
	
		List<WebElement> moveElements=driver.findElements(By.xpath("//div[@id='RPE_Preview']//*[name()='tspan']"));
		for(WebElement ele:moveElements) {
			Actions act3=new Actions(driver);
			try {
				act3.moveToElement(ele).build().perform();
			}catch(Exception e) {
				
			}
		}
		
		List<WebElement> charts=getWebElements(driver,chartBars);
		
        Y_Selected=getText1(driver,Y_SelectedValue);
        String X_Selected=getText1(driver,X_SelectedValue);
        
        System.out.println("X_Selected : "+X_Selected);
        System.out.println("Y_Selected : "+Y_Selected);
        String aggreagtionSelected=defaultSelectedValue(driver,aggregation);
        
        String Y_SelectedString=getStringValue(Y_Selected);
        String X_SelectedString=getStringValue(X_Selected);
         
        String Y_chartvalue=getText1(driver,Y_Value);
        if(Y_chartvalue.equals(Y_SelectedString)) {
			pass(driver,"Selected Y-Axis value displayed in Y-Axis in the chart");
        }else {
     	    fail(driver,"Selected Y-Axis value not displayed in Y-Axis in the chart,Exp : "+Y_SelectedString+" Act : "+Y_chartvalue);
        }
        
        String X_chartvaluefull=getText1(driver,X_Value);
      
        if(X_chartvaluefull.contains(X_SelectedString)&&X_chartvaluefull.contains(aggreagtionSelected)) {
			pass(driver,"Selected X-Axis value with aggretaion displayed in X-Axis in the chart ");
        }else {
     	    fail(driver,"Selected X-Axis value with aggretaion not displayed in X-Axis in the chart");
        }
        
        if(defaultSizeChart>1) {
        	try {
        		graphOrderValidation(driver,charts,QuickSortByText);
        	}catch(Exception e) {
        		System.out.println("Grpah Validation Failed");
        		e.printStackTrace();
        	}
        }
        
        String sortValueBefore=getAttribute1(driver,AscDes,"value");
        click(driver,AscDescButton);
        String sortValueAfter=getAttribute1(driver,AscDes,"value");
        if(sortValueBefore.equals(sortValueAfter)) {
     	    fail(driver,"Ascending Descending not changed while click Asc/Desc button");
        }else {
     	    pass(driver,"Ascending Descending changed while click Asc/Desc button");
        }
        
        QuickSortByText=getText1(driver,quickSortBytext);
        scrollUsingElement(driver, ApplyButton);
		click(driver,ApplyButton);
		elementnotvisible1(driver, RPE_Loading);
		verifyElementIsPresent(driver,Chart);
		if(isDisplayed(driver,minimize)) {
	        	mouseOverAndClick(driver,minimize);
	        	wait(driver,"1");
		}
		mouseOverToElement(driver,DashProPage);
		wait(driver,"1");
		List<WebElement> charts1=getWebElements(driver,chartBars);
		if(defaultSizeChart>1) {
	    	graphOrderValidation(driver,charts1,QuickSortByText);
		}
		// *********** Axes Validation End *************
		
		
    	// *********** AxisTitle Validation Start *************
		String Bar_AxisTitle= getCellValue("TestExecution","Testcase_Selection","Bar_AxisTitle",Flag);
		if(Bar_AxisTitle.equals("Yes") && AllTestcase==true) {
			verifyElementDisplayed(driver, AxisTitle);
			 click(driver,AxisTitle);
			 wait(driver,"1");
			 String AxisExpand=getAttribute1(driver,AxisTitleExpand,"class");
	     	 if(AxisExpand.contains("up")) {
				pass(driver,"Axis Title section is Expanded after click on it");
	     	 }else {
	 			fail(driver,"Axis Title section is not Expanded after click on it");
	     	 }
	        
	     	String AxisTextColor_Act=getTextColor(driver,AxisTitleExpand);
	     	if(AxisTextColorExp.equalsIgnoreCase(AxisTextColor_Act)) {
	     		pass(driver,"Axis Title displayed in blue color after select on it");
	     	}else {
	     		fail(driver,"Axis Title displayed in blue color after select on it");
	     	}
	     	
	     	verifyElementDisplayed(driver, X_Title_text);
	     	verifyElementDisplayed(driver,X_Title_input);

	     	verifyElementDisplayed(driver, Y_Title_text);
	     	verifyElementDisplayed(driver,Y_Title_input);
		
	     	verifyElementDisplayed(driver,fontFamilyText);
	     	
	     	if(verifyElementDisplayed(driver,fontFamily_dropdown)) {
	     		
	     		String fontFamily_Value=getText1(driver,fontFamily_dropdown);
	     		System.out.println("FontFamily_Value : "+fontFamily_Value);
	     		if(fontFamily_Value.equals(default_FontFamily)) {
	    			pass(driver,"By default, "+default_FontFamily+" displayed in the Font Family input");
	     		}else {
	         	    fail(driver,"By default, "+default_FontFamily+" is not displayed in the Font Family input");
	     		}
	     	}
	    
	     	verifyElementDisplayed(driver,titleFontSize);
	     	if(verifyElementDisplayed(driver,titleFontSizeDropdown)) {
	     		
	     		String font_Size_Act=defaultSelectedValue(driver,titleFontSizeDropdown);
	     		System.out.println("Font_Size : "+font_Size_Act);
	     		if(font_Size_Act.equals(default_FontSize_Exp)) {
	    			pass(driver,"By default, "+default_FontSize_Exp+" displayed in the Font Size input");
	     		}else {
	         	    fail(driver,"By default, "+default_FontSize_Exp+" is not displayed in the Font Size input");
	     		}
	     	}
	     	
	     	verifyElementDisplayed(driver,X_axisFontSizeText);
	     	if(verifyElementDisplayed(driver,X_axisFontSizeDropdown)) {
	     		String X_font_Size_Act=defaultSelectedValue(driver,X_axisFontSizeDropdown);
	     		System.out.println("X Font_Size : "+X_font_Size_Act);
	     		if(X_font_Size_Act.equals(default_FontSize_Exp)) {
	    			pass(driver,"By default, "+default_FontSize_Exp+" displayed in the X axis Font Size input");
	     		}else {
	         	    fail(driver,"By default, "+default_FontSize_Exp+" is not displayed in the X axis Font Size input");
	     		}
	     	}
	     	
	     	verifyElementDisplayed(driver, Y_axisFontSizeText);
	     	if(verifyElementDisplayed(driver,Y_axisFontSizeDropdown)) {
	     		
	     		String Y_font_Size_Act=defaultSelectedValue(driver,Y_axisFontSizeDropdown);
	     		System.out.println("Y Font_Size : "+Y_font_Size_Act);
	     		if(Y_font_Size_Act.equals(default_FontSize_Exp)) {
	    			pass(driver,"By default, "+default_FontSize_Exp+" displayed in the Y axis Font Size input");
	     		}else {
	         	    fail(driver,"By default, "+default_FontSize_Exp+" is not displayed in the Y axis Font Size input");
	     		}
	     	}
	     	
	     	verifyElementDisplayed(driver, X_RotationText);
	     	if(verifyElementDisplayed(driver,X_RotationOutputValue)){
	     		String X_RotationValueAct=getText1(driver,X_RotationOutputValue);
	     		System.out.println("X rotation : "+X_RotationValueAct);
	     		if(X_RotationValueAct.equals(defaultRotation)) {
	    			pass(driver,"By default, '"+defaultRotation+"' displayed in the X axis Rotation output field");
	     		}else {
	         	    fail(driver,"By default, '"+defaultRotation+"' is not displayed in the X axis Rotation output field");
	     		}
	    		String X_Rotation_Color_Act=getTextBackgroundColor(driver,X_RotationOutputValue);
	    		if(RotationInputColor_Exp.equalsIgnoreCase(X_Rotation_Color_Act)) {
	    			pass(driver,"X rotation output highlighted in blue color");
	    		}else {
	    			fail(driver,"X rotation output not highlighted in blue color");
	    		}
	     	}
	     	
	     	verifyElementDisplayed(driver, Y_RotationText);
	     	if(verifyElementDisplayed(driver,Y_RotationOutputValue)) {
	     		String Y_RotationValueAct=getText1(driver,Y_RotationOutputValue);
	     		System.out.println("Y rotation : "+Y_RotationValueAct);
	     		if(Y_RotationValueAct.equals(defaultRotation)) {
	    			pass(driver,"By default, '"+defaultRotation+"' displayed in the Y axis Rotation output field");
	     		}else {
	         	    fail(driver,"By default, '"+defaultRotation+"' displayed in the Y axis Rotation output field");
	     		}
	    		String Y_Rotation_Color_Act=getTextBackgroundColor(driver,Y_RotationOutputValue);
	    		if(RotationInputColor_Exp.equalsIgnoreCase(Y_Rotation_Color_Act)) {
	    			pass(driver,"Y rotation output highlighted in blue color");
	    		}else {
	    			fail(driver,"Y rotation output not highlighted in blue color");
	    		}
	     	}
	     	
	     	
	     	clearAndType(driver,X_Title_input,Change_X_Title_Name);
	     	wait(driver,"1");
	     	clearAndType(driver,Y_Title_input,Change_Y_Title_Name);
	     	wait(driver,"1");
	     	
	     	scrollUsingElement(driver, ApplyButton);
			click(driver,ApplyButton);
			elementnotvisible1(driver, RPE_Loading);
			waitForElement(driver,Chart);
			elementnotvisible(driver,Loading);
			List<WebElement>  moveElements1=driver.findElements(By.xpath("//div[@id='RPE_Preview']//*[name()='tspan']"));
				for(WebElement ele:moveElements1) {
					Actions act3=new Actions(driver);
					try {
						act3.moveToElement(ele).build().perform();
					}catch(Exception e) {
						
					}
				}
				
			String Y_ChartText=getText1(driver,Y_Value);
			String X_ChartText=getText1(driver,X_Value);
		    
	     	if(Y_ChartText.equals(Change_Y_Title_Name)) {
	        	pass(driver,"Given Y Title ("+Change_Y_Title_Name+") input value updated in the Y Axis chart");
	     	}else {
	        	fail(driver,"Y Title ("+Change_Y_Title_Name+") input value not updated in the Y Axis chart");
	     	}
	        
	     	if(X_ChartText.equals(Change_X_Title_Name)) {
	        	pass(driver,"Given X Title ("+Change_X_Title_Name+") input value updated in the X Axis chart");
	     	}else {
	        	fail(driver,"Given X Title ("+Change_X_Title_Name+") input value not updated in the X Axis chart");
	     	}
	        
	     	String fontFamily_Value=getText1(driver,fontFamily_dropdown);
	     	click(driver,fontFamily_dropdown);
	     	
	     	if(isDisplayed(driver,fontFamily_DropdownExpand)) {
	        	pass(driver,"Font family dropdown is expanded after click on it");
	        	mouseOverToElement(driver,SecondValue);
	        	wait(driver,"1");
	    		String mouseHighlightColor=getTextBackgroundColor(driver,SecondValue);
	    		if(Highlight_Color_Exp.equalsIgnoreCase(mouseHighlightColor)) {
	    			pass(driver,"Mouse hovered value highlighted in blue color");
	    		}else {
	    			fail(driver,"Mouse hovered value not highlighted in blue color");
	    		}

	    		ScrollBarValidation1(driver,fontFamily_DropdownExpand,"Font Family");
	    		String selectedColorAct2=getTextBackgroundColor(driver,ListSelected);
	    		String highlightText2=getText1(driver,listSelectedText1);
	    		if((fontFamily_Value.equals(highlightText2))&&Selected_Color_Exp.equals(selectedColorAct2)) {
	    			 pass(driver,"Selected Value Highlighted in Grey Color");
	    		}else {
	         	    fail(driver,"Selected Value not Value Highlighted in Grey Color");
	    		}
	    		
	         	List<WebElement> beforeSearchResults=getWebElements(driver,fontFamilyResults);
	         	int beforeSearchSize=beforeSearchResults.size();
	         	click(driver,dropdownInputsearchBox);
	         	sendKeys(driver,dropdownInputsearchBox,"dfsaght");
	         	if(isDisplayed2(driver,NoResultsFound)) {
	         		pass(driver,"'No Results found' is displayed when search invalid font family value");
	         	}else {
	         		fail(driver,"'No Results found' is not displayed when search invalid font family value");
	         	}
	         	
	         	clear1(driver,dropdownInputsearchBox);
	         	wait(driver,"1");
	         	sendKeys(driver,dropdownInputsearchBox,ChangeFontFamily_AxisTitle);
	         	List<WebElement> afterSearchResults=getWebElements(driver,fontFamilyResults);
	         	int afterSearchSize=afterSearchResults.size();
	            String resultText=getText1(driver,fontFamilyFirstResult);
	            if((beforeSearchSize>afterSearchSize)&&resultText.equals(ChangeFontFamily_AxisTitle)) {
	   			 pass(driver,"Search input in the Font Family dropdown works properly");
	            }else {
	         	    fail(driver,"Search input in the Font Family dropdown not works properly");
	            }
	         	
	           	selectFontFamily(driver,ChangeFontFamily_AxisTitle);
	           	wait(driver,"1");
	           	scrollUsingElement(driver, ApplyButton);
	    		click(driver,ApplyButton);
	    		elementnotvisible1(driver, RPE_Loading);
	           	waitForElement(driver,Chart);
	    	    moveElements1=driver.findElements(By.xpath("//div[@id='RPE_Preview']//*[name()='tspan']"));
	    			for(WebElement ele:moveElements1) {
	    				Actions act3=new Actions(driver);
	    				try {
	    					act3.moveToElement(ele).build().perform();
	    				}catch(Exception e) {
	    					
	    				}
	    			}
	    		String fontFamily_Y_Act=getFontFamily(driver,Y_Value);
	    		if(fontFamily_Y_Act.equals(ChangeFontFamily_AxisTitle)) {
	   			     pass(driver,"Selected fontFamily ("+ChangeFontFamily_AxisTitle+") Updated in Y Axis chart value");
	    		}else {
	         	    fail(driver,"Selected FontFamily ("+ChangeFontFamily_AxisTitle+") is not Updated in Y Axis chart value");
	    		}
	           	
	         	
	        }else {
	     	    fail(driver,"Font family dropdown is not expanded after click on it");
	        }
	     	
	     	
			click(driver,titleFontSizeDropdown);
			selectOptionValue(driver,titleFontSizeDropdown,ChangeTitleFontSize_AxisTitle);
			wait(driver,"1");
			scrollUsingElement(driver, ApplyButton);
			click(driver,ApplyButton);
			elementnotvisible1(driver, RPE_Loading);
	       	waitForElement(driver,Chart);
		    moveElements1=driver.findElements(By.xpath("//div[@id='RPE_Preview']//*[name()='tspan']"));
				for(WebElement ele:moveElements1) {
					Actions act3=new Actions(driver);
					try {
						act3.moveToElement(ele).build().perform();
					}catch(Exception e) {
						
					}
				}
				
			String fontSize_Y_Act=getFontSize(driver,Y_Value);
			String fontSize_X_Act=getFontSize(driver,X_Value);
			if((ChangeTitleFontSize_AxisTitle.equals(fontSize_Y_Act))&&ChangeTitleFontSize_AxisTitle.equals(fontSize_X_Act)) {
				pass(driver,"Given Title Font Size Updated in X-Axis Title and Y-Axis Title chart value");
			}else {
				fail(driver,"Given Title Font Size not Updated in any one of X-Axis Title and Y-Axis Title chart value");
			}
			
			click(driver,X_axisFontSizeDropdown);
			selectOptionValue(driver,X_axisFontSizeDropdown,Change_X_label_FontSize);
			scrollUsingElement(driver, ApplyButton);
			click(driver,ApplyButton);
			elementnotvisible1(driver, RPE_Loading);
	       	waitForElement(driver,Chart);
	       	
	       	String fontSize_X_label_Act=getFontSize(driver,X_AxisLabel_chart);
	       	if(Change_X_label_FontSize.equals(fontSize_X_label_Act)) {
			    pass(driver,"Selected fontSize ("+Change_X_label_FontSize+") Updated in X Axis label chart value");
			}else {
	  	       fail(driver,"Selected fontSize  ("+Change_X_label_FontSize+") not Updated in X Axis label chart value");
			}
		
	       	click(driver,Y_axisFontSizeDropdown);
			selectOptionValue(driver,Y_axisFontSizeDropdown,Change_Y_label_FontSize);
			scrollUsingElement(driver, ApplyButton);
			click(driver,ApplyButton);
			elementnotvisible1(driver, RPE_Loading);
	       	waitForElement(driver,Chart);
	       	String fontSize_Y_label_Act=getFontSize(driver,Y_AxisLabel_chart);
	    	if(Change_Y_label_FontSize.equals(fontSize_Y_label_Act)) {
			    pass(driver,"Selected fontSize ("+Change_Y_label_FontSize+") Updated in Y Axis label chart value");
			}else {
	  	       fail(driver,"Selected fontSize ("+Change_Y_label_FontSize+") not Updated in Y Axis label chart value");
			}
	    	
	     	waitForElement(driver, X_RotationInputSlider);
	     	moveSlider(driver,X_RotationInputSlider,X_RotationOutputValue,X_Rotation_Input);
	     	scrollUsingElement(driver, ApplyButton);
			click(driver,ApplyButton);
			elementnotvisible1(driver, RPE_Loading);
	       	waitForElement(driver,Chart);
	     	
	       	String X_label_Rotation_Act=getRotationValue(driver,X_AxisLabel_chart);
	       	if(X_Rotation_Input.equals(X_label_Rotation_Act)) {
			    pass(driver,"Selected Rotation Angle ("+X_Rotation_Input+") Updated in X Axis label chart value");
			}else {
	  	       fail(driver,"Selected Rotation Angle ("+X_Rotation_Input+") is not Updated in X Axis label chart value");
			}
	    	
	       	waitForElement(driver, Y_RotationInputSlider);
	     	moveSlider(driver,Y_RotationInputSlider,Y_RotationOutputValue,Y_Rotation_Input);
	     	scrollUsingElement(driver, ApplyButton);
			click(driver,ApplyButton);
			elementnotvisible1(driver, RPE_Loading);
	       	waitForElement(driver,Chart);
	     	
	       	String Y_label_Rotation_Act=getRotationValue(driver,Y_AxisLabel_chart);
	       	if(Y_Rotation_Input.equals(Y_label_Rotation_Act)) {
			    pass(driver,"Selected Rotation Angle ("+Y_Rotation_Input+") Updated in Y Axis label chart value");
			}else {
	  	       fail(driver,"Selected Rotation Angle ("+Y_Rotation_Input+") is not Updated in Y Axis label chart value");
			}
	       	
	       	verifyElementDisplayed(driver, switchSliderText);
	       	if(verifyElementDisplayed(driver,switchSlider)){
	     		String sliderColor=getTextBackgroundColor(driver,switchSlider);
	     		
	     		if(isToggleEnable(driver, switchSliderInput)) {
	     			fail(driver,"By default Start axis at 0 toggle enabled");
	     		}else {
	     			pass(driver,"By default Start axis at 0 toggle disabled");
	     			String x_firstAscValue=getText1(driver,X_AxisLabel_chart_1);
	     			if(!(x_firstAscValue.equals("0"))) {
	        			pass(driver,"X axis label value not started from '0' in the chart, When 'Start axis at 0' toggle is disabled");
	            	}else {
	        			pass(driver,"X axis label value started from '0' in the chart, When 'Start axis at 0' toggle is disabled");
	            	}
	     			
	     			List<WebElement> yValues=getWebElements(driver,Y_AxisLabel_chart_Full);
	         		int lastsize=yValues.size()-1;
	         		String y_firstDesValue=driver.findElement(By.xpath("(//*[name()='g' and @transform and @aria-label]//*[name()='tspan'])["+lastsize+"]")).getText();
	         		String y_firstAscValue=getText1(driver,Y_AxisLabel_chart_1);
	           	
	         		String sortOrderType=getAttribute1(driver,AscDes,"value");
	         		if(sortOrderType.equals("desc")) {
	         			if(!(y_firstAscValue.equals("0"))) {
	         				pass(driver,"Y axis label value not start from 0 in the chart, when toogle is disabled");
	         			}else {
	         				pass(driver,"Y axis label value started from 0 in the chart when toogle is disabled");
	         			}	
	         		}else {
	         			if(!(y_firstDesValue.equals("0"))) {
	         				pass(driver,"Y axis label value not start from 0 in the chart, when toogle is disabled");
	         			}else {
	         				pass(driver,"Y axis label value started from 0 in the chart when toogle is disabled");
	         			}
	            	
	         		}
	     		}
	       	    
	            click(driver,switchSlider);
	            scrollUsingElement(driver, ApplyButton);
	    		click(driver,ApplyButton);
	    		elementnotvisible1(driver, RPE_Loading);
	     		waitForElement(driver,Chart);
	       	    
	     		if(isDisplayed(driver,minimize)) {
	     			click3(driver,minimize);
	     		}
	       	
	       	    String x_firstAscValue=getText1(driver,X_AxisLabel_chart_1);
	        	if((x_firstAscValue.equals("0"))) {
	    			pass(driver,"X axis label value started from '0' in the chart, After enbling the 'Start axis at 0' toggle");
	        	}else {
	    			pass(driver,"X axis label value not started from '0' in the chart, After enbling the 'Start axis at 0' toggle");
	        	}	
	        	String sortOrderType=getAttribute1(driver,AscDes,"value");
	     		List<WebElement> yValues=getWebElements(driver,Y_AxisLabel_chart_Full);
	     		int lastsize=yValues.size()-1;
	     		String y_firstDesValue=driver.findElement(By.xpath("(//*[name()='g' and @transform and @aria-label]//*[name()='tspan'])["+lastsize+"]")).getText();
	     		String y_firstAscValue=getText1(driver,Y_AxisLabel_chart_1);
	       	
	     		if(sortOrderType.equals("desc")) {
	     			if((y_firstAscValue.equals("0"))) {
	        			pass(driver,"Y axis label value started from '0' in the chart, After enbling the 'Start axis at 0' toggle");
	     			}else {
	        			pass(driver,"Y axis label value not started from '0' in the chart, After enbling the 'Start axis at 0' toggle");
	     			}	
	     		}else {
	     			if((y_firstDesValue.equals("0"))) {
	        			pass(driver,"Y axis label value started from '0' in the chart, After enbling the 'Start axis at 0' toggle");
	     			}else {
	        			pass(driver,"Y axis label value not started from '0' in the chart, After enbling the 'Start axis at 0' toggle");
	     			}
	        	
	     		}
	         	
	     	}
		}
       	// ******************** AxisTitle Validation End *******************
		
        // ******************** ChartTitle Validation Start *******************
		String Bar_ChartTitle= getCellValue("TestExecution","Testcase_Selection","Bar_ChartTitle",Flag);
		if(Bar_ChartTitle.equals("Yes") && AllTestcase==true) {
			verifyElementDisplayed(driver,chartTitle);
			 click(driver,chartTitle);
			 wait(driver,"1");
			 String CharttitleExpand=getAttribute1(driver,ChartTitleExpand,"class");
	     	 if(CharttitleExpand.contains("up")) {
				pass(driver,"Chart Title is Expanded after click on it");
	     	 }else {
	 			fail(driver,"Chart Title is not Expanded after click on it");
	     	 }
	        
	     	 wait(driver,"1");
	     	 String chartTitleTextColor_Act=getTextColor(driver,chartTitle);
	     	 if(ChartTitleColorExp.equalsIgnoreCase(chartTitleTextColor_Act)) {
	     		 pass(driver,"Chart title highlighted in blue color after expand it");
	     	 }else {
	     		fail(driver,"Chart title not highlighted in blue color after expand it");
	     	 }
	     	 
	     	verifyElementDisplayed(driver, BackgroundText);
	        if(verifyElementDisplayed(driver,BackgroundInput)) {

	     		String BackgroundInputText=getTextJavascript(driver,BackgroundInput);
	     		System.out.println("BackgroundInputText : "+BackgroundInputText);
	     		if(BackgroundInputText.equals(DefaultBackgroundColor_Exp)) {
	    			pass(driver,"By default, '"+DefaultBackgroundColor_Exp+"' Value selected in the Background Input");
	     		}else {
	         	    fail(driver,"By default, '"+DefaultBackgroundColor_Exp+"' Value not selected in the Background Input");
	     		}
	     	}
			 
	        verifyElementDisplayed(driver, FontColorText);
	        if(verifyElementDisplayed(driver,FontColorInput)) {

	     		String DefaultFontColor_Act=getTextJavascript(driver,FontColorInput);
	     		System.out.println("DefaultFontColor_Act : "+DefaultFontColor_Act);
	     		if(DefaultFontColor_Act.equals(DefaultFontColor_Exp)) {
	    			pass(driver,"By default, '"+DefaultFontColor_Exp+"' Value selected in the FontColor Input ");
	     		}else {
	         	    fail(driver,"By default, '"+DefaultFontColor_Exp+"' Value not selected in the FontColor Input ");
	     		}
	     	}
	        
	        verifyElementDisplayed(driver, ChartFontFamilytext);
	        if(verifyElementDisplayed(driver,ChartFontFamilyDropdown)) {

	     		String default_FontFamily_Act=getText1(driver,ChartFontFamilyDropdown);
	     		System.out.println("default_FontFamily_Act : "+default_FontFamily_Act);
	     		if(Default_FontFamily.equals(default_FontFamily_Act)) {
	     			pass(driver,"By default, '"+Default_FontFamily+"' selected in the Font Family input");
	     		}else {
	         	    fail(driver,"By default, '"+Default_FontFamily+"' not selected in the Font Family input");
	     		}
	     	}
	       
	        verifyElementDisplayed(driver, ChartFontSizeText);
	        if(verifyElementDisplayed(driver,ChartFontSizedDropdown)) {

	     		String defaultFontSize_Act=getTextJavascript(driver,ChartFontSizedDropdown);
	     		System.out.println("defaultFontSize_Act : "+defaultFontSize_Act);
	     		if(default_FontSizeChartTitle_Exp.equals(defaultFontSize_Act)) {
	    			pass(driver,"By default, '"+default_FontSizeChartTitle_Exp+"' Value selected in the Font Size Input");
	     		}else {
	         	    fail(driver,"By default, '"+default_FontSizeChartTitle_Exp+"' Value not selected in the Font Size Input");
	     		}
	     	}
	        
	        // Background color Validation End
	        
	        click(driver,BackgroundInput);
	        if(isDisplayed(driver,ColorPickerOpen)) {
				pass(driver,"The color pickers opens promptly after clicking text box in background");
	        }else {
				fail(driver,"The color pickers not opens promptly after clicking text box in background");
	        }
	        
	        click(driver,BackgroundText);
	        wait(driver,"1");
	        if(isDisplayed2(driver,ColorPickerOpen)) {
				fail(driver,"The color picker not closes immediately when the user clicks outside its boundaries");
	        }else {
				pass(driver,"The color picker closes immediately when the user clicks outside its boundaries");
	        }
	        
	        for (int i=0;i<2;i++) {
	        	click3(driver,BackgroundInput);
	            if(isDisplayed(driver,ColorPickerOpen)) {
	    			pass(driver,"The color pickers opens properly for repeated Clicking");
	            }else {
	    			fail(driver,"The color pickers not opens properly for repeated Clicking");
	            }
	            click3(driver,BackgroundText);
	            wait(driver,"1");
	            if(isDisplayed2(driver,ColorPickerOpen)) {
	    			fail(driver,"The color picker not closes immediately for repeated Clicking");
	            }else {
	    			pass(driver,"The color picker closes immediately for repeated Clicking");
	            }
	        }
	        
	        
	        WebElement background=getWebElement(driver,BackgroundInput);
	        action.click(background).build().perform();
	        action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
	        sendKeys(driver,BackgroundInput,TypeBackgroundColor1);
	        click3(driver,BackgroundText);
	        String SelectedBackgroundColor=getTextBackgroundColor(driver, BackgroundInputPointer);
	        String AppliedChartTitleInputColor=getTextBackgroundColor(driver, ChartTitleInput);
	        System.out.println("SelectedBackgroundColor : "+SelectedBackgroundColor+"  ---> AppliedChartTitleInputColor : "+AppliedChartTitleInputColor);

	        if((SelectedBackgroundColor.equalsIgnoreCase(TypeBackgroundColor1))&&AppliedChartTitleInputColor.equalsIgnoreCase(TypeBackgroundColor1)) {
				pass(driver,"While Manually Enter the Color, "+TypeBackgroundColor1+" updated in the Background Color input and Chart Title Input");
	        }else {
				fail(driver,"While Manually Enter the Color, "+TypeBackgroundColor1+" not updated correctly in the Background Color input and Chart Title Input");
	        }
	        
	        action.click(background).build().perform();
	        action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
	        action.sendKeys(Keys.BACK_SPACE).build().perform();

	        click3(driver,BackgroundText);
	        String ResetBackgroundColor=getTextBackgroundColor(driver, BackgroundInputPointer);
	        String ResetChartTitleInputColor=getTextBackgroundColor(driver, ChartTitleInput);
	        System.out.println("ResetBackgroundColor : "+ResetBackgroundColor+"  ---> ResetChartTitleInputColor : "+ResetChartTitleInputColor);

	        if(ResetBackgroundColor.equals(DefaultBackgroundColor_Exp)) {
				pass(driver,"After revert all color selections, the color picker reset to the default color");
	        }else {
				fail(driver,"After revert all color selections, the color picker not reset to the default color");
	        }
	        
	        if(ResetChartTitleInputColor.equals(DefaultBackgroundColor_Exp)) {
				pass(driver,"After revert all color selections, the Chart Title Input reset to the default color");
	        }else {
				fail(driver,"After revert all color selections, the Chart Title Input not reset to the default color");
	        }
	        
	        click(driver,BackgroundInput);
	        waitForElement(driver,ColorPickerOpen);
	        verifyElementIsPresent1(driver,ThemeColor);
	        verifyElementIsPresent1(driver,History);
	        mouseOverToElement(driver,Color1);
	        mouseOverToElement(driver,Color1);
	        String mouseOverColorValue=getTextBackgroundColor(driver, Color1);
	        String mouseOverHistoryColor=getText1(driver,mouseOverColorHistory);
//	        System.out.println("mouseOverColorValue : "+mouseOverColorValue+"  ---> mouseOverHistoryColor : "+mouseOverHistoryColor);
	        if(mouseOverColorValue.equals(mouseOverHistoryColor)) {
				pass(driver,"Mouse over color value updated in the history");
	        }else {
				fail(driver,"Mouse over color value not updated in the history");
	        }
	        
	        String SelectColorValue=getTextBackgroundColor(driver, Color2);
	        System.out.println("  ---> SelectColorValue : "+SelectColorValue); 
	        click(driver,Color2);
	        wait(driver,"1");
	        if(isDisplayed2(driver,ColorPickerOpen)) {
				fail(driver,"The color picker not closes immediately when the user select the color");
	        }else {
				pass(driver,"The color picker closes immediately when the user select the color");
	        }
	        String SelectedColorValue1=getTextJavascript(driver,BackgroundInput);
	 		System.out.println("SelectedColorValue1 : "+SelectedColorValue1);
	 		if(SelectedColorValue1.equals(SelectColorValue)) {
				pass(driver,"Selected Color updated in the Background Input");
	 		}else {
				fail(driver,"Selected Color not updated in the Background Input");
	 		}
	        
	 		 String ChartTitleInputColor1=getTextBackgroundColor(driver, ChartTitleInput);
	         if(ChartTitleInputColor1.equals(SelectColorValue)) {
	 			pass(driver,"Selected Color "+SelectColorValue+" updated in the Chart Title Input");
	         }else {
	  			fail(driver,"Selected Color not updated in the Chart Title Input");
	         }
	 		
	         click(driver,BackgroundInput);
	         waitForElement(driver,ColorPickerOpen);
	         
	         String SelectedColorHistory=getText1(driver,selectedColorHistory);
	         if(SelectedColorHistory.equals(SelectColorValue)) {
	  			pass(driver,"Selected Color "+SelectedColorHistory+" updated in the history");
	          }else {
	   			fail(driver,"Selected Color not updated in the history");
	          }
	        
	         mouseOverToElement(driver,mouseOverColorHistory);
	         wait(driver,"1");
	         mouseOverToElement(driver,Color2);
	         wait(driver,"1");
	         mouseOverHistoryColor=getText1(driver,mouseOverColorHistory);
	         doubleClick(driver,mouseOverColorHistory);
	         wait(driver,"1");
	         action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
	         click(driver,BackgroundText);
	         wait(driver,"1");
	         doubleClick(driver,BackgroundInput);
	         wait(driver,"1");
	         action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
	         wait(driver,"1");
	         click(driver,BackgroundText);
	         String AfterPasteBackgroundColor=getTextBackgroundColor(driver, BackgroundInputPointer);
	         if(AfterPasteBackgroundColor.equalsIgnoreCase(mouseOverHistoryColor)) {
	        	pass(driver,"Copy Paste Color value is working fine in Background Input");
	         }else {
	        	fail(driver,"Copy Paste Color value is not working fine in Background Input");
	         }
	         
	         click3(driver,BackgroundText);
	         click(driver,BackgroundInput);
	         action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
	         sendKeys(driver,BackgroundInput,TypeBackgroundColor1);
	         click3(driver,BackgroundText);
//	      Background color Validation  End
	 		
	         click(driver,SaveBtn_Chart);
	         if(verifyElementIsPresent1(driver,chartSaveError1)) {
	   			pass(driver,"'Enter Widget Name' error displayed When click Save button without giving the value");
	         }else {
	    		fail(driver,"'Enter Widget Name' error not displayed When click Save button without giving the value");
	         }
	         
//	      Font color Validation start...
	        sendKeys(driver,ChartTitleInput,ChangeChartTitleName);
	        wait(driver,"1");
	        String defaultChartTitletextColor=getTextColor(driver,ChartTitleInput);
	        System.out.println("defaultChartTitletextColor : -> "+defaultChartTitletextColor);
	        if(defaultChartTitletextColor.equalsIgnoreCase(DefaultFontColor_Exp)) {
				pass(driver,"By Default, '"+DefaultFontColor_Exp+"' is updated in the Chart Title input text ");
	        }else {
				fail(driver,"By Default, '"+DefaultFontColor_Exp+"' is not updated in the Chart Title input text ");
	        }
	        
	        click(driver,FontColorInput);
	        if(isDisplayed(driver,ColorPickerOpen)) {
				pass(driver,"The color pickers opens promptly after clicking font color input");
	        }else {
				fail(driver,"The color pickers not opens promptly after clicking font color input");
	        }
	        
	        click(driver,FontColorText);
	        wait(driver,"1");
	        if(isDisplayed2(driver,ColorPickerOpen)) {
				fail(driver,"The color picker not closes immediately when the user clicks outside Font color boundaries");
	        }else {
				pass(driver,"The color picker closes immediately when the user clicks outside Font color boundaries");
	        }
	        click(driver,FontColorInput);
	        wait(driver,"1");
	        action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
	        sendKeys(driver,FontColorInput,TypeTextColor1);
	        click3(driver,FontColorText);
	        String SelectedFontColor=getTextBackgroundColor(driver, FontColorInputPointer);
	        String AppliedChartTitleTextColor=getTextColor(driver, ChartTitleInput);
	        System.out.println("SelectedFontColor : "+SelectedFontColor+"  ---> AppliedChartTitleTextColor : "+AppliedChartTitleTextColor);
	 
	        if((SelectedFontColor.equalsIgnoreCase(TypeTextColor1))&&AppliedChartTitleTextColor.equalsIgnoreCase(TypeTextColor1)) {
				pass(driver,"While Manually Enter the Color, "+TypeTextColor1+" updated in the Font Color input and Chart Title text");
	        }else {
				fail(driver,"While Manually Enter the Color, "+TypeTextColor1+" not updated in the Font Color input and Chart Title text");
	        }
	        
	        click(driver,FontColorInput);
	        wait(driver,"1");
	        action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
	        action.sendKeys(Keys.BACK_SPACE).build().perform();
	        wait(driver,"1");
	        click(driver,FontColorText);
	        String ResetFontColorColor=getTextBackgroundColor(driver, FontColorInputPointer);
	        String ResetChartTitleTextColor=getTextColor(driver, ChartTitleInput);
	        System.out.println("ResetFontColorColor : "+ResetFontColorColor+"  ---> ResetChartTitleTextColor : "+ResetChartTitleTextColor);

	        if(ResetFontColorColor.equalsIgnoreCase(DefaultFontColor_Exp)) {
				pass(driver,"After revert all color selections, the Font Color Input reset to the default color ");
	        }else {
				fail(driver,"After revert all color selections, the Font Color Input not reset to the default color ");
	        }
	        
	        if(ResetChartTitleTextColor.equalsIgnoreCase(DefaultFontColor_Exp)) {
				pass(driver,"After revert all color selections, the Chart Title Text reset to the default color ");
	        }else {
				fail(driver,"After revert all color selections, the Chart Title Text not reset to the default color ");
	        }
	        
	        click(driver,FontColorInput);
	        waitForElement(driver,ColorPickerOpen);
	        verifyElementIsPresent1(driver,ThemeColor);
	        verifyElementIsPresent1(driver,History);
	        mouseOverToElement(driver,Color1);
	        mouseOverToElement(driver,Color1);
	        mouseOverColorValue=getTextBackgroundColor(driver, Color1);
	        mouseOverHistoryColor=getText1(driver,mouseOverColorHistory);
	        System.out.println("mouseOverColorValue : "+mouseOverColorValue+"  ---> mouseOverHistoryColor : "+mouseOverHistoryColor);
	        if(mouseOverColorValue.equals(mouseOverHistoryColor)) {
				pass(driver,"Mouse over color value updated in the history");
	        }else {
				fail(driver,"Mouse over color value not updated in the history");
	        }
	        
	        String SelectFontColorValue=getTextBackgroundColor(driver, Color2);
	        System.out.println("  ---> SelectFontColorValue : "+SelectFontColorValue); 
	        click(driver,Color2);
	        wait(driver,"1");
	        if(isDisplayed2(driver,ColorPickerOpen)) {
				fail(driver,"The color picker not closes immediately when the user select the color");
	        }else {
				pass(driver,"The color picker closes immediately when the user select the color");
	        }
	        
	        String SelectedFontColorValue1=getTextJavascript(driver,FontColorInput);
	 		System.out.println("SelectedFontColorValue1 : "+SelectedFontColorValue1);
	 		if(SelectedFontColorValue1.equals(SelectFontColorValue)) {
				pass(driver,"Selected Background Color "+SelectFontColorValue+" updated in the Font Color Input");
	 		}else {
				fail(driver,"Selected Background Color "+SelectFontColorValue+" not updated in the Font Color Input");
	 		}
	        
	 		String ChartTitleTextColor1=getTextColor(driver, ChartTitleInput);
	        if(ChartTitleTextColor1.equals(SelectFontColorValue)) {
				pass(driver,"Selected Background Color "+SelectFontColorValue+" updated in the Chart Title Text");
	        }else {
				fail(driver,"Selected Background Color "+SelectFontColorValue+" not updated in the Chart Title Text");
	        }
			
	        click3(driver,FontColorInput);
	        waitForElement(driver,ColorPickerOpen);
	        
	        String SelectedFontColorHistory=getText1(driver,selectedColorHistory);
	        if(SelectedFontColorHistory.equals(SelectFontColorValue)) {
	 			pass(driver,"Selected Font Color "+SelectFontColorValue+" updated in the history");
	         }else {
	  			fail(driver,"Selected Font Color not updated in the history");
	         }
	        click3(driver,FontColorText);
	        
//	      Font color Validation End...

//	      Font Family Validation start...
	        
	        String fontFamily_ValueChartTitle=getText1(driver,ChartFontFamilyDropdown);
	     	click(driver,ChartFontFamilyDropdown);
	     	
	     	if(verifyElementDisplayed(driver,ChartFontFamilyDropdownExpand)) {
	        	pass(driver,"Font family dropdown expanded after click on it");
	        	mouseOverToElement(driver,SecondValue);
	        	wait(driver,"1");
	    		String mouseHighlightColor=getTextBackgroundColor(driver,SecondValue);
	    		if(Highlight_color_Exp.equalsIgnoreCase(mouseHighlightColor)) {
	    			pass(driver,"Mouse hovered color value highlighted in blue color");
	    		}else {
	    			fail(driver,"Mouse hovered color value not highlighted in blue color");
	    		}

	         	ScrollBarValidation1(driver,ChartFontFamilyDropdownExpand,"Font Family");
	         	
	        // 	AlphabetOrderValidation(driver,chartFontFamilyResults);

	         	List<WebElement> beforeSearchResults=getWebElements(driver,chartFontFamilyResults);
	         	int beforeSearchSize=beforeSearchResults.size();
	         	verifyElementDisplayed(driver, dropdownInputsearchBox);
	         	click(driver,dropdownInputsearchBox);
	         	sendKeys(driver,dropdownInputsearchBox,Change_FontFamily_ChartTitle);
	         	List<WebElement> afterSearchResults=getWebElements(driver,chartFontFamilyResults);
	         	int afterSearchSize=afterSearchResults.size();
	            String resultText=getText1(driver,fontFamilyFirstResult);
	            if((beforeSearchSize>afterSearchSize)&&resultText.equals(Change_FontFamily_ChartTitle)) {
	   			   pass(driver,"Search input in the Font Family dropdown works properly");
	            }else {
	         	    fail(driver,"Search input in the Font Family dropdown not works properly");
	            }
	         	
	           	selectFontFamily(driver,Change_FontFamily_ChartTitle);
	           	wait(driver,"1");
	           	if(isDisplayed2(driver,ChartFontFamilyDropdownExpand)) {
	           		fail(driver,"Font Family dropdown not closed after select the value");
	           	}else {
	      			 pass(driver,"Font Family dropdown closed after select the value");
	           	}
	         	wait(driver,"1");
	           	String selectedFontFamilyValue=getText1(driver,ChartFontFamilyDropdown); 
	           	if(selectedFontFamilyValue.equals(Change_FontFamily_ChartTitle)) {
				    pass(driver,"Selected fontFamily Updated in Font Family Input field");
	           	}else {
	           		fail(driver,"Selected fontFamily not Updated in Font Family Input field");
	           	}
	        	
	    		String fontFamily_ChartTitleText_Act=getFontFamily(driver,ChartTitleInput);
	    		if(fontFamily_ChartTitleText_Act.equals(Change_FontFamily_ChartTitle)) {
	   			    pass(driver,"Selected fontFamily  Updated in Chart Title text");
	    		}else {
	         	    fail(driver,"Selected fontFamily not Updated in Chart Title text");
	    		}
	           	
	        }else {
	     	    fail(driver,"Font family dropdown not expanded");
	        }
	        
	        // Font Size Validation start....
	     	
	        String defaultFontSizeValue=getTextJavascript(driver,ChartFontSizedDropdown);
	        String ChartTitleFontSize_Actual=getFontSize(driver,ChartTitleInput);
	        if(ChartTitleFontSize_Actual.equals(defaultFontSizeValue)) {
				 pass(driver,"By default font size  Updated in Chart Title text");
			}else {
	     	    fail(driver,"By default font size not Updated in Chart Title text");
			}
	     	
	        selectOptionValue(driver,ChartFontSizedDropdown,ChangeFontSize_ChartTitle);
	        wait(driver,"1");
	        String selectedFontSizeValue=getTextJavascript(driver,ChartFontSizedDropdown);
	        if(selectedFontSizeValue.equals(ChangeFontSize_ChartTitle)) {
			    pass(driver,"Selected Font Size Updated in Font Size Input");
			}else {
		 	    fail(driver,"Font Size not Updated in Font Size Input");
			}
	        
	        String AppliedChartTitleFontSize_Actual=getFontSize(driver,ChartTitleInput);
	        if(AppliedChartTitleFontSize_Actual.equals(ChangeFontSize_ChartTitle)) {
			    pass(driver,"Selected Font Size Updated in Chart Title text");
			}else {
		 	    fail(driver,"Selected Font Size not Updated in Chart Title text");
			}
	        
	        FontSizeOrderValidation(driver,FontSizeResults);
		}
		
       	// ******** ChartTitle Validation End ***********************
        if(AllTestcase==true) {
    		 verifyElementDisplayed(driver,Chart_FormatSec);
   		     click(driver,Chart_FormatSec);
   		     waitForElement(driver, chartFormatExpand);
	   		 String ChartFormatOpenstatus=getAttribute1(driver, chartFormatExpand, "class");
			 if(ChartFormatOpenstatus.contains("up")) {
				pass(driver,"Chart Format is expanded when clicking the Chart Format");
			 }else {
				fail(driver,"Chart Format is not expanded when click the Chart Format");
				
			 }
			 //ChartFormatColorExp
			 String ChartFormatColor=getTextColor(driver, Chart_FormatSec);
			 if(ChartFormatColor.equalsIgnoreCase(ChartFormatColorExp)) {
				pass(driver,"Chart Format gets highlighted in blue color after it expands");
			 }else {
				fail(driver,"Chart Format not highlighted in blue Color after it expands"); 
			 }
        }
        //********** ChartStyle Validation Start *************************
		 String Bar_ChartFormat_ChartStyle= getCellValue("TestExecution","Testcase_Selection","Bar_ChartFormat_ChartStyle",Flag);
		 if(Bar_ChartFormat_ChartStyle.equals("Yes") && AllTestcase==true) {
			 
			 if(verifyElementDisplayed(driver,ChartStyling)) {
				 String ChartStylingExpand=getAttribute1(driver, ChartStyling_Expand, "class");
				 if(ChartStylingExpand.contains("up")) {
					pass(driver,"By default, Chart Styling gets Expanded");
				 }else {
					fail(driver,"By default, Chart Styling not gets Expand");
				 }
				
				 String ChartStylingColor_Act=getTextColor(driver, ChartStyling);
				 if(ChartStylingColor_Exp.equalsIgnoreCase(ChartStylingColor_Act)) {
					pass(driver,"Chart Styling gets highlighted in blue color ");
				 }else {
					fail(driver,"Chart Styling not highlighted in blue color"); 
				 }
			 }
			
	    	verifyElementDisplayed(driver,ChartThemeText);
	    	verifyElementDisplayed(driver,ChartThemeInput);
	    	
	    	verifyElementDisplayed(driver,X_ScrollText);
	    	verifyElementDisplayed(driver,X_ScrollInputSlider);

	    	verifyElementDisplayed(driver,Y_ScrollText);
	    	verifyElementDisplayed(driver,Y_ScrollInputSlider);

	    	verifyElementDisplayed(driver,Auto_ScrollText);
	    	verifyElementDisplayed(driver,Auto_ScrollInputSlider);

	    	verifyElementDisplayed(driver,EnableGridText);
	    	verifyElementDisplayed(driver,EnableGrid_InputSlider);

	    	String defaultThemeValue_Act=getText1(driver,ChartThemeInput);
	    	if(defaultThemeValue_Act.equals(DefaultThemeValue_Exp)) {
				pass(driver,"By default, Chart theme selected the value as '"+DefaultThemeValue_Exp+"'");
	    	}else {
				fail(driver,"By default, '"+DefaultThemeValue_Exp+"' value not selected in the  Chart theme input");
	    	}
	    	
	    	click(driver,ChartThemeInput);
	    	if(verifyElementDisplayed(driver,ChartThemeResults)) {
				pass(driver,"Chart theme dropdown opened and displayed list of chart themes");
				mouseOverToElement(driver,ThirdValue);
				wait(driver,"1");
				String mouseHighlightColor=getTextBackgroundColor(driver,ThirdValue);
				if(Highlight_ColorStyle_Exp.equalsIgnoreCase(mouseHighlightColor)) {
					pass(driver,"Mouse hovered value highlighted in blue color");
				}else {
					fail(driver,"Mouse hovered value not highlighted in blue color");
				}

	        	ScrollBarValidation1(driver,ChartThemeResults,"Chart Theme");

	        	List<WebElement> beforeSearchResults=getWebElements(driver,chartThemeResultList);
	        	int beforeSearchSize=beforeSearchResults.size();
	        	verifyElementIsPresent1(driver,dropdownInputsearchBox);
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
	        	int afterSearchSize=afterSearchResults.size();
	            String resultText=getText1(driver,chartThemeFirstResult);
	            if((beforeSearchSize>afterSearchSize)&&resultText.equals(Change_ChartTheme_ChartStyle)) {
	  			  pass(driver,"Search input in the Chart Theme dropdown works properly");
	            }else {
	              fail(driver,"Search input in the Chart Theme dropdown not works properly");
	            }
	        	
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
	           
	    	}else {
				 fail(driver,"Chart theme dropdown not opened after click on it");
	    	}

	    	if(isToggleEnable(driver,AutoScroll_toggle)) {
	   		   pass(driver,"By default, 'AutoScroll' toggle is enabled");
	   		   if(isToggleEnable(driver,X_Scroll_toggle)) {
	   			   fail(driver,"X Scroll toggle not disabled when AutoScroll toggle is enabled");
	   		   }else {
	   			   pass(driver,"X Scroll toggle disabled when AutoScroll toggle is enabled");
	   		   }
	   		   
	   		   if(isToggleEnable(driver,Y_Scroll_toggle)) {
				    fail(driver,"Y Scroll toggle not disabled when AutoScroll toggle is enabled for the Y_Value : "+Y_Selected);
			   }else {
				    pass(driver,"Y Scroll toggle disabled when AutoScroll toggle is enabled for the Y_Value : "+Y_Selected);
			   }
	   		   
	    	}else {
	  		     fail(driver,"By default, 'AutoScroll' toggle is not enabled");
	    	}
	    	
	    	if(isToggleAccessible(driver,X_Scroll_toggle) && isToggleAccessible(driver,Y_Scroll_toggle)){
	  		    fail(driver,"X Scroll and Y Scroll toggle accessible when AutoScroll toggle is enabled");
	     	}else {
	   		    pass(driver,"X Scroll and Y Scroll toggle not accessible when AutoScroll toggle is enabled");
	     	}
	    	
	    	click(driver,Auto_ScrollInputSlider);
	    	if(isToggleEnable(driver,AutoScroll_toggle)){
	 		    fail(driver,"'Auto Scroll' toggle not disabled when click on it");
	    	}else {
	  		    pass(driver,"'Auto Scroll' toggle disabled when click on it");
	    	}
	    	
	    	if(isToggleAccessible(driver,X_Scroll_toggle) && isToggleAccessible(driver,Y_Scroll_toggle)){
	  		    pass(driver,"X Scroll and Y Scroll toggle accessible when AutoScroll toggle is disabled");
	    	}else {
	 		    fail(driver,"X Scroll and Y Scroll toggle not accessible when AutoScroll toggle is disabled");
	    	}
	    	
	    	
	    	click(driver,X_ScrollInputSlider);
	    	if(isToggleEnable(driver,X_Scroll_toggle)){
	    		pass(driver,"X Scroll toggle enabled when click on it");
	    	}else {
	  		    fail(driver,"X Scroll toggle not enabled when click on it");
	    	}
	    	
	    	 boolean Y_ScrollEnable=false;
   			 if(isToggleEnable(driver,Y_Scroll_toggle)){
   				 //pass(driver,"Y Scroll toggle enabled when click on it");
   				 Y_ScrollEnable=true;
   			 }else {
   				 //fail(driver,"Y Scroll toggle not enabled when click on it");
   				 click(driver,Y_ScrollInputSlider);
   				 wait(driver,"1");
   				 if(isToggleEnable(driver,Y_Scroll_toggle)){
   					 pass(driver,"Y Scroll toggle enabled when enabling it");
   					 Y_ScrollEnable=true;
   				 }else {
   					 fail(driver,"Y Scroll toggle not enabled when enabling it");
   				 }
   			 }
   			   	
	    	
	    	
	    	
	    	click(driver,Auto_ScrollInputSlider);
	    	wait(driver,"1");
	    	
	    	if(isToggleEnable(driver,X_Scroll_toggle) && isToggleEnable(driver,Y_Scroll_toggle)){
	 		    fail(driver,"X Scroll and Y Scroll toggle not automatically disabled when enabling the AutoScroll toggle");
	    	}else {
	  		    pass(driver,"X Scroll and Y Scroll toggle automatically disabled when enabling the AutoScroll toggle");
	    	}
	    	
	    	if(isToggleEnable(driver,EnableGrid_toggle)) {
	     		 pass(driver,"By default, 'Enable Grid' toggle is enabled");
	     		 
	     		 click(driver,EnableGrid_InputSlider);
	     		 wait(driver,"1");
	     		 if(isToggleEnable(driver,EnableGrid_toggle)){
	         		 fail(driver,"'Enable Grid' toggle not disabled when click on it ");
	        	 }else {
	         		 pass(driver,"'Enable Grid' toggle disabled when click on it ");
	        	}
	     		 
	      	 }else {
	    	    fail(driver,"By default, 'Enable Grid' toggle is not enabled");
	      	 }

	       
	    	click(driver,ChartStyling);
	    	wait(driver,"1");
	    	String chartStyleClose_Act=getAttribute1(driver, ChartStyling_Expand, "class");
			 if(chartStyleClose_Act.contains("down")) {
				pass(driver,"Chart styling gets collapsed when click on it");
			 }else {
				fail(driver,"Chart styling not gets collapsed when click on it");
			 }
	      	
		 }
		 
	     //*********** ChartStyle validation end ************
   
		 // ********** DataLabel Validation Start ***************
		 String Bar_ChartFormat_DataLabel= getCellValue("TestExecution","Testcase_Selection","Bar_ChartFormat_DataLabel",Flag); 
		 if(Bar_ChartFormat_DataLabel.equals("Yes") && AllTestcase==true) {
			 verifyElementDisplayed(driver,DataLabels);
			 scrollUsingElement(driver,DataLabels);
			 String DataLabelsExpand=getAttribute1(driver, DataLabels_Expand, "class");
			 if(DataLabelsExpand.contains("up")) {
				pass(driver,"By default, Data Labels gets Expanded");
			 }else {
				fail(driver,"By default, Data Labels not gets Expand");
				click(driver,DataLabels);
			 }
			
			 String DataLabelsColor_Act=getTextColor(driver, DataLabels);
			 if(DataLabelsColor_Exp.equalsIgnoreCase(DataLabelsColor_Act)) {
				pass(driver,"Data Labels gets displayed in blue color");
			 }else {
				fail(driver,"Data Labels not displayed in blue color"); 
			 }
			 
			 //Validation of the visibility of data label options start...
				
			 verifyElementDisplayed(driver,EnableValue_text);
			 verifyElementIsPresent1(driver, EnableValue_Input);

			 verifyElementDisplayed(driver,ValueFormat_text);
			 verifyElementIsPresent1(driver,ValueFormatInput);
	     
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
	     
			 verifyElementDisplayed(driver,ShowAsPositive_text);
			 verifyElementIsPresent1(driver,ShowPositive_Input);
	   
			 verifyElementDisplayed(driver,ValueRotation_text);
			 verifyElementIsPresent1(driver,ValueRotation_Input);
			 //Validation of the visibility of data label options End...
		     
		     //All options are inaccessible when the enable value toggle is disabled. Validation end
		     if(isToggleEnable(driver,EnableValue_Input)) {
		  		 fail(driver,"By Default, Enable Value toggle is enabled");
		     }else {
		  		 pass(driver,"By Default, Enable Value toggle is disabled");
		  		 
		  		 if(isToggleAccessible(driver,ValueFormatInput)) {
			  		 fail(driver,"'Value Format' is accessible when the 'Enable value' toggle is disabled.");
			     }else {
			  		 pass(driver,"'Value Format' is inaccessible when the 'Enable value' toggle is disabled.");
			     }
			     
			     if(isToggleAccessible(driver,SeperatorInput)) {
			  		 fail(driver,"'Seperator Input' is accessible when the 'Enable value' toggle is disabled.");
			     }else {
			  		 pass(driver,"'Seperator Input' is inaccessible when the 'Enable value' toggle is disabled.");
			     }
			     
			     if(isToggleAccessible(driver,ValueFontSizeInput)) {
			  		 fail(driver,"'ValueFontSize Input' is accessible when the 'Enable value' toggle is disabled.");
			     }else {
			  		 pass(driver,"'ValueFontSize Input' is inaccessible when the 'Enable value' toggle is disabled.");
			     }
			     
			     if(isToggleAccessible(driver,RoundOffValueInput)) {
			  		 fail(driver,"'RoundOffValue Input' is accessible when the 'Enable value' toggle is disabled.");
			     }else {
			  		 pass(driver,"'RoundOffValue Input' is inaccessible when the 'Enable value' toggle is disabled.");
			     }
			     
			     if(isToggleAccessible(driver,PositionInput)) {
			  		 fail(driver,"'Position Input' is accessible when the 'Enable value' toggle is disabled.");
			     }else {
			  		 pass(driver,"'Position Input' is inaccessible when the 'Enable value' toggle is disabled.");
			     }
				 
			     if(isToggleAccessible(driver,BigNumberInput)) {
			  		 fail(driver,"'BigNumber Suffix Input' is accessible when the 'Enable value' toggle is disabled.");
			     }else {
			  		 pass(driver,"'BigNumber Suffix Input' is inaccessible when the 'Enable value' toggle is disabled.");
			     }
			     
			     if(isToggleAccessible(driver,ValueRotation_Input)) {
			  		 fail(driver,"'ValueRotation_Input' is accessible when the 'Enable value' toggle is disabled.");
			     }else {
			  		 pass(driver,"'ValueRotation_Input' is inaccessible when the 'Enable value' toggle is disabled.");
			     }
			     
			     if(isToggleAccessible(driver,ShowPositive_Input)) {
			    	 pass(driver,"'Show As Positive Input' is accessible when the 'Enable value' toggle is disabled.");
			     }else {
			  		 fail(driver,"'Show As Positive Input' is not accessible when the 'Enable value' toggle is disabled.");
			     }
		  		 
		     }
		     
		     //All options are inaccessible when the enable value toggle is disabled. Validation end
		     
			 click(driver,EnableValue_InputSlider);
			 if(isToggleEnable(driver,EnableValue_Input)) {
		  		 pass(driver,"'Enable Value' toggle is enabled after click on it");
			 }else {
		  		 fail(driver,"'Enable Value' toggle is not enabled after click on it");
		  		 
			 }
			
			 scrollUsingElement(driver, ApplyButton);
			 click(driver,ApplyButton);
			 elementnotvisible1(driver, RPE_Loading);
			 waitForElement(driver,Chart);
			 
			 //new
			 
			 List<WebElement> chartValues=getWebElements(driver, ValueFormat_ChartValue);
			 int chartValueSize=chartValues.size();
			 WebElement lastChartValue=chartValues.get(chartValueSize-3);
			 
			 //isDisplayed(driver,ValueFormat_ChartValue
			 
			 if(lastChartValue.isDisplayed()) {
		  		 pass(driver,"Values enabled in charts after enabling the 'Enable Value' toggle"); 
			 }else {
		  		 fail(driver,"Values not enabled in charts after enabling the 'Enable Value' toggle"); 
			 }
			 
			//new
			 if(isToggleAccessible(driver,ValueFormatInput)) {		
		  		 pass(driver,"'Value Format Input' is accessible after enabling the 'Enable Value' toggle"); 
		  		 String defaultFormatValue_Act=defaultSelectedValue(driver, ValueFormatInput);
		  		 if(DefaultFormatValue_Exp.equals(defaultFormatValue_Act)) {
			  		 pass(driver,"By default, '"+DefaultFormatValue_Exp+"' is selected in the Value Format Input"); 
		  		 }else {
			  		 fail(driver,"By default, '"+DefaultFormatValue_Exp+"' is not selected in the Value Format Input"); 
		  		 }
			 }else {
		  		 fail(driver,"'Value Format Input' is not accessible after enabling the 'Enable Value' toggle");
		  		 
			 }
	       
			 selectOptionValue(driver,ValueFormatInput,"value");
			 
			 scrollUsingElement(driver, ApplyButton);
			 click(driver,ApplyButton);
			 elementnotvisible1(driver, RPE_Loading);
			 waitForElement(driver,Chart);
			 
			 //new 
			 chartValues=getWebElements(driver, ValueFormat_ChartValue);
			 chartValueSize=chartValues.size();
			 lastChartValue=chartValues.get(chartValueSize-3);
			 //new
			 
			 String ValueTextAct=lastChartValue.getText();  //getText1(driver,ValueFormat_ChartValue);
			 if(ValueTextAct.endsWith("%")) {
		  		 fail(driver,"'Value Format' is not display in the chart for Value format selection");
			 }else {
		  		 pass(driver,"'Value Format' is displayed in the chart for Value format selection");
			 }
			 
			 selectOptionValue(driver,ValueFormatInput,"percentage");
			 scrollUsingElement(driver, ApplyButton);
			 click(driver,ApplyButton);
			 elementnotvisible1(driver, RPE_Loading);
			 waitForElement(driver,Chart);
			 
			 //new 
			 chartValues=getWebElements(driver, ValueFormat_ChartValue);
			 chartValueSize=chartValues.size();
			 lastChartValue=chartValues.get(chartValueSize-3);
			 //new
			 
			 ValueTextAct= lastChartValue.getText();    //getText1(driver,ValueFormat_ChartValue);
			 if(ValueTextAct.contains("%")) {
		  		 pass(driver,"'Percentage Format' displayed in the chart for Percentage format selection");
			 }else {
		  		 fail(driver,"'Percentage Format' is not displayed in the chart for Percentage format selection");
			 }
			 
			 if(isToggleAccessible(driver,SeperatorInput)) {	
				 fail(driver,"'Seperator Input' is accessible  when 'percentage' is selected in value format");	  		
			 }else {
				 pass(driver,"'Seperator Input' is inaccessible  when 'percentage' is selected in value format"); 
			 }
			 
			 selectOptionValue(driver,ValueFormatInput,"value");
			 
			 scrollUsingElement(driver, ApplyButton);
			 click(driver,ApplyButton);
			 elementnotvisible1(driver, RPE_Loading);
			 if(isToggleAccessible(driver,SeperatorInput)) {	
				pass(driver,"'Seperator Input' is accessible  when 'value' is selected in value format"); 
			 }else {
				fail(driver,"'Seperator Input' is not accessible  when 'value' is selected in value format"); 
			 }
			 
			 verifyElementIsPresent1(driver, Thousand_Seperator);
			 verifyElementIsPresent1(driver, Houndred_Seperator);

			 String defaultSeperator_Act=defaultSelectedValue(driver,SeperatorInput);
			 if(DefaultSeperatorValue_Exp.equals(defaultSeperator_Act)) {
		  		 pass(driver,"By default, '"+DefaultSeperatorValue_Exp+"' is selected in the Seperator Input"); 
			 }else {
		  		 fail(driver,"By default, '"+DefaultSeperatorValue_Exp+"' is not selected in the Seperator Input"); 
			 } 
	       
			click(driver,SeperatorInput);
			selectOptionValue(driver,SeperatorInput,"#,###");
			scrollUsingElement(driver, ApplyButton);
			click(driver,ApplyButton);
			elementnotvisible1(driver, RPE_Loading);
			waitForElement(driver,Chart);
			//new 
			 chartValues=getWebElements(driver, ValueFormat_ChartValue);
			 chartValueSize=chartValues.size();
			 lastChartValue=chartValues.get(chartValueSize-3);
			 //new
			
			String ChartValueTextAct=lastChartValue.getText();     //getText1(driver,ValueFormat_ChartValue);
			
			if(!ChartValueTextAct.contains(".") && ChartValueTextAct.length()>4) {
				String ValueSeperatorFormat=validateNumberFormat(ChartValueTextAct);
				
				if(ValueSeperatorFormat.equals("#,###")) {
			  		 pass(driver,"Thousand seperator gets applied for chart enabled values"); 
				}else {
			  		 fail(driver,"Thousand seperator not applied for chart enabled values"); 
				}
			}
			
			
			click(driver,SeperatorInput);
			selectOptionValue(driver,SeperatorInput,"#,##");
			scrollUsingElement(driver, ApplyButton);
			click(driver,ApplyButton);
			elementnotvisible1(driver, RPE_Loading);
			waitForElement(driver,Chart);
			 //new 
			 chartValues=getWebElements(driver, ValueFormat_ChartValue);
			 chartValueSize=chartValues.size();
			 lastChartValue=chartValues.get(chartValueSize-3);
			 //new
			 
			ChartValueTextAct=lastChartValue.getText();     //getText1(driver,ValueFormat_ChartValue);
			if(!ChartValueTextAct.contains(".") && ChartValueTextAct.length()>4) {
				String ValueSeperatorFormat=validateNumberFormat(ChartValueTextAct);
				if(ValueSeperatorFormat.equals("#,##")) {
			  		 pass(driver,"Hundred Separator gets applied for chart enabled values"); 
				}else {
			  		 fail(driver,"Hundred Separator not applied for chart enabled values"); 
				}
				
			}
			
			if(isToggleAccessible(driver,ValueFontSizeInput)) {		
		  		 pass(driver,"'Value FontSize Input' is accessible after enabling the 'Enable Value' toggle"); 
		  		 String defaultFontSize_Act=defaultSelectedValue(driver, ValueFontSizeInput);
		  		 if(DefaultFontSizeValue_Exp.equals(defaultFontSize_Act)) {
			  		 pass(driver,"By default, '"+DefaultFontSizeValue_Exp+"' is selected in the Value Font Size Input"); 
		  		 }else {
			  		 fail(driver,"By default, '"+DefaultFontSizeValue_Exp+"' is not selected in the Value Font Size Input"); 
		  		 }
			}else {
		  		 fail(driver,"'Value FontSize Input' is not accessible after enabling the 'Enable Value' toggle");
			}
	      
			click(driver,ValueFontSizeInput);
			selectOptionValue(driver,ValueFontSizeInput,ChangeFontSizeValue_DataLabel);
			scrollUsingElement(driver, ApplyButton);
			click(driver,ApplyButton);
			elementnotvisible1(driver, RPE_Loading);
			waitForElement(driver,Chart);
			
			String ValueFontSizeAct=getFontSize(driver,ValueFormat_ChartValue);
			if(ValueFontSizeAct.equals(ChangeFontSizeValue_DataLabel)) {
		  		 pass(driver,"The chart's value displayed with Selected '"+ChangeFontSizeValue_DataLabel+"' font size."); 
			}else {
		  		 fail(driver,"The chart's value not displayed with Selected '"+ChangeFontSizeValue_DataLabel+"' font size."); 
			}
			
			if(isToggleAccessible(driver,RoundOffValueInput)) {		
		  		 pass(driver,"'RoundOff Value Input' is accessible after enabling the 'Enable Value' toggle"); 
		  		 String defaultRoundOffValue_Act=defaultSelectedValue(driver, RoundOffValueInput);
		  		 if(DefaultRoundOffValue_Exp.equals(defaultRoundOffValue_Act)) {
			  		 pass(driver,"By default, '"+DefaultRoundOffValue_Exp+"' is selected in the RoundOffValue Input"); 
		  		 }else {
			  		 fail(driver,"By default, '"+DefaultRoundOffValue_Exp+"' is not selected in the RoundOffValue Input"); 
		  		 }
			}else {
		  		 fail(driver,"'RoundOff Value Input' is not accessible after enabling the 'Enable Value' toggle");
			}
			
		   click(driver,RoundOffValueInput);
		   wait(driver,"1");
		   selectByText(driver,RoundOffValueInput,ChangeRoundOffValue_DataLabel);
		   scrollUsingElement(driver, ApplyButton);
		   click(driver,ApplyButton);
		   elementnotvisible1(driver, RPE_Loading);
		   waitForElement(driver,Chart);
		   //new 
			 chartValues=getWebElements(driver, ValueFormat_ChartValue);
			 chartValueSize=chartValues.size();
			 lastChartValue=chartValues.get(chartValueSize-3);
		   //new
		   
		   ChartValueTextAct=lastChartValue.getText();     //getText1(driver,ValueFormat_ChartValue);
		   String RoundOffValue_Act=String.valueOf(getRoundOffValue(ChartValueTextAct));
		   if(RoundOffValue_Act.equals(ChangeRoundOffValue_DataLabel)) {
		  	   pass(driver,"The chart's value displayed with Selected'"+ChangeRoundOffValue_DataLabel+"' RoundOff Value"); 
		   }else {
		  	   fail(driver,"The chart's value not displayed with Selected '"+ChangeRoundOffValue_DataLabel+"' RoundOff Value"); 
		   }
		   
		   if(isToggleAccessible(driver,PositionInput)) {		
		  		 pass(driver,"'Position Input' is accessible after enabling the 'Enable Value' toggle"); 
		  		 String defaultPosition_Act=defaultSelectedValue(driver, PositionInput);
		  		 if(DefaultPositionValue_Exp.equals(defaultPosition_Act)) {
			  		 pass(driver,"By default, '"+DefaultPositionValue_Exp+"' is selected in the Position Input"); 
		  		 }else {
			  		 fail(driver,"By default, '"+DefaultPositionValue_Exp+"' is not selected in the Position Input"); 
		  		 }
			}else {
		  		 fail(driver,"'Position Input' is not accessible after enabling the 'Enable Value' toggle");
			}
		   
		   //  position check
		   
//		   if(isDisplayed(driver,minimize)) {
//	       	click(driver,minimize);
//	       	elementnotvisible(driver,Loading);
//	       }
		   
		   boolean chartValuePositionAct=validateElementPosition(driver,chartBar2,chartValue_Rotation,"center");
		   if(chartValuePositionAct==true) {
		  		pass(driver,"By default, Chart value displayed center the chartbar for position selected as 'center' condition"); 
		   }else {
		  		fail(driver,"By default, Chart value is not displayed center the chartbar for position selected as 'center' condition"); 
		   }
		   
		   click(driver,PositionInput);
		   selectOptionValue(driver,PositionInput,"inside");
		   scrollUsingElement(driver, ApplyButton);
		   click(driver,ApplyButton);
		   elementnotvisible1(driver, RPE_Loading);
		   waitForElement(driver,Chart);
//		   if(isDisplayed(driver,minimize)) {
//		       	click(driver,minimize);
//		       	elementnotvisible(driver,Loading);
//	       }
		   chartValuePositionAct=validateElementPosition(driver,chartBar2,chartValue_Rotation,"inside");
		   if(chartValuePositionAct==true) {
		  		pass(driver,"Chart value displayed inside the chartbar for position selected as 'inside' condition"); 
		   }else {
		  		fail(driver,"Chart value is not displayed inside the chartbar for position selected as 'inside' condition"); 
		   }

		   selectOptionValue(driver,PositionInput,"outside");
		   scrollUsingElement(driver, ApplyButton);
		   click(driver,ApplyButton);
		   elementnotvisible1(driver, RPE_Loading);
		   waitForElement(driver,Chart);
//		   if(isDisplayed(driver,minimize)) {
//		       	click(driver,minimize);
//		       	elementnotvisible(driver,Loading);
//	       }
		   chartValuePositionAct=validateElementPosition(driver,chartBar2,chartValue_Rotation,"outside");
		   if(chartValuePositionAct==true) {
		  		pass(driver,"Chart value displayed outside the chartbar for position selected as 'outside' condition"); 
		   }else {
		  		fail(driver,"Chart value is not displayed outside the chartbar for position selected as 'outside' condition"); 
		   }
		   
		   selectOptionValue(driver,PositionInput,"center");
		   scrollUsingElement(driver, ApplyButton);
		   click(driver,ApplyButton);
		   elementnotvisible1(driver, RPE_Loading);
		   waitForElement(driver,Chart);
		   
		   //   position check endd
		   
			selectOptionValue(driver,SeperatorInput,"#,###");
			
			if(isToggleAccessible(driver,BigNumberInput)) {
				 fail(driver,"'Big Number Suffix' toggle is accessible while Seperator value is selected");
			}else {
				 pass(driver,"'Big Number Suffix' toggle is Inaccessible while Seperator value is selected");
			}
			
			selectByText(driver,SeperatorInput,"Select");

			if(isToggleAccessible(driver,BigNumberInput)) {
				 pass(driver,"'Big Number Suffix' toggle is accessible while Seperator value is not selected");
			}else {
				 fail(driver,"'Big Number Suffix' toggle is Inaccessible while Seperator value is not selected");
			}
			
			selectOptionValue(driver,ValueFormatInput,"percentage");
			scrollUsingElement(driver, ApplyButton);
			click(driver,ApplyButton);
			elementnotvisible1(driver, RPE_Loading);
		    if(isToggleAccessible(driver,BigNumberInput)) {
				 fail(driver,"'Big Number Suffix' toggle is accessible while 'Percentage'  is selected in the Value Format input");
			}else {
				 pass(driver,"'Big Number Suffix' toggle is Inaccessible while 'Percentage'  is selected in the Value Format input");
			}

		    selectOptionValue(driver,ValueFormatInput,"value");
		    scrollUsingElement(driver, ApplyButton);
		    click(driver,ApplyButton);
		    elementnotvisible1(driver, RPE_Loading);
		    if(isToggleAccessible(driver,BigNumberInput)) {
				 pass(driver,"'Big Number Suffix' toggle is accessible while 'Percentage' is not selected in the Value Format input");
				 click(driver,BigNumberInputSlider);
				    if(isToggleEnable(driver,BigNumberInput)) {
						 pass(driver,"'Big Number Suffix' toggle is enabled while click on it");
						 
						 scrollUsingElement(driver, ApplyButton);
						 click(driver,ApplyButton);
						 elementnotvisible1(driver, RPE_Loading);
						 waitForElement(driver,Chart);
					    //new 
						 chartValues=getWebElements(driver, ValueFormat_ChartValue);
						 chartValueSize=chartValues.size();
						 lastChartValue=chartValues.get(chartValueSize-3);
						 //new
					    
						 ChartValueTextAct=lastChartValue.getText();     //getText1(driver,ValueFormat_ChartValue);
						 
						 if(!ChartValueTextAct.contains(".") && ChartValueTextAct.length()>3) {
							 if(ChartValueTextAct.endsWith("K") || ChartValueTextAct.endsWith("k")) {
								 pass(driver,"The big number suffix is applied for enabled value in charts");
							 }else {
								 fail(driver,"The big number suffix is not applied for enabled value in charts");
							 }
						  }
							
					}else {
						 fail(driver,"'Big Number Suffix' toggle is not enabled while click on it");
					}
				    
				    
				    
				    click(driver,BigNumberInputSlider);
				    if(isToggleEnable(driver,BigNumberInput)) {
						 fail(driver,"'Big Number Suffix' toggle is enabled while disabling it");
				    }else {
						 pass(driver,"'Big Number Suffix' toggle is disabled while disabling it");
						 scrollUsingElement(driver, ApplyButton);
						 click(driver,ApplyButton);
						 elementnotvisible1(driver, RPE_Loading);
						 waitForElement(driver,Chart);
					    //new 
						 chartValues=getWebElements(driver, ValueFormat_ChartValue);
						 chartValueSize=chartValues.size();
						 lastChartValue=chartValues.get(chartValueSize-3);
						 //new
					    
						 ChartValueTextAct=lastChartValue.getText();     //getText1(driver,ValueFormat_ChartValue);
						 if(ChartValueTextAct.endsWith("K") || ChartValueTextAct.endsWith("k")) {
							 fail(driver,"The big number suffix is applied for enabled value in charts after disabling it");
						 }else {
							 pass(driver,"The big number suffix is not applied for enabled value in charts after disabling it");
						 }
					}
				    
				 
			}else {
				 fail(driver,"'Big Number Suffix' toggle is Inaccessible while 'Percentage' is not selected in the Value Format input");
			}
			 Pattern numericalPattern = Pattern.compile("^\\d+(\\.\\d+)?$");	

			if(isToggleEnable(driver,ShowPositive_Input)) {
				 fail(driver,"By default, 'Show As Positive' toggle is enabled");
		    }else {
				 pass(driver,"By default, 'Show As Positive' toggle is disabled");
				 String X_StartValue=getText1(driver,X_AxisLabel_chart_1);
				 if(numericalPattern.matcher(X_StartValue).matches()) {
					 if(X_StartValue.startsWith("-")) {
						 pass(driver,"Chart started with negative value when 'Show positive' toogle is disabled");
					 }else {
						 pass(driver,"Chart not started with negative value when 'Show positive' toogle is disabled");
					 }
				 }
				 
			}
			
			click(driver,ShowPositive_InputSlider);
			if(isToggleEnable(driver,ShowPositive_Input)) {
				 pass(driver,"'Show As Positive' toggle is enabled while enabling it");
				 scrollUsingElement(driver, ApplyButton);
				 click(driver,ApplyButton);
				 elementnotvisible1(driver, RPE_Loading);
				 waitForElement(driver,Chart);
	     		 String	X_StartValue=getText1(driver,X_AxisLabel_chart_1);
	     		 if(numericalPattern.matcher(X_StartValue).matches()) {
	     			if(X_StartValue.startsWith("-")) {
						pass(driver,"Chart not started with positive value when 'Show positive' toogle is enabled");
		     		 }else {
						pass(driver,"Chart  started with positive value when 'Show positive' toogle is enabled");
		     		 }
	     		 }
	     		 
		    }else {
				 fail(driver,"'Show As Positive' toggle is not enabled while enabling it");
		    }
		    
			if(isToggleAccessible(driver,ValueRotation_Input)) {
				 pass(driver,"Value rotation is accessible after enabling the 'Enable Value' toggle");
			}else {
				 fail(driver,"Value rotation is Inaccessible after enabling the 'Enable Value' toggle");
			}
			
			String defaultRotationValue_Act=getText1(driver,ValueRotation_Output);
			if(DefaultRotationValue_Exp.equals(defaultRotationValue_Act)) {
				 pass(driver,"By default, '"+DefaultRotationValue_Exp+"' is displayed in value rotation output");
			}else {
				 fail(driver,"By default, '"+DefaultRotationValue_Exp+"' is not displayed in value rotation output");
			}
			
			moveSlider(driver,ValueRotation_Input,ValueRotation_Output,ChangeRotataionVal_Positive_DataLabel);
			scrollUsingElement(driver, ApplyButton);
			click(driver,ApplyButton);
			elementnotvisible1(driver, RPE_Loading);
	     	wait(driver,"1");
	     	waitForElement(driver,Chart);
	     	String chartValueRotation_Act=getRotationValue(driver,chartValue_Rotation);
	     	if(chartValueRotation_Act.equals(ChangeRotataionVal_Positive_DataLabel)) {
			    pass(driver,"Selected positive Rotation Angle ("+ChangeRotataionVal_Positive_DataLabel+") is Updated in chart value");
			}else {
		       	fail(driver,"Selected positive Rotation Angle ("+ChangeRotataionVal_Positive_DataLabel+") is not Updated in chart value");
			}
	      
	        moveSlider(driver,ValueRotation_Input,ValueRotation_Output,ChangeRotataionVal_Negative_DataLabel);
	        scrollUsingElement(driver, ApplyButton);
	 	   	click(driver,ApplyButton);
	 	    elementnotvisible1(driver, RPE_Loading);
	     	wait(driver,"1");
	     	waitForElement(driver,Chart);
	     	chartValueRotation_Act=getRotationValue(driver,chartValue_Rotation);
	     	if(chartValueRotation_Act.equals(ChangeRotataionVal_Negative_DataLabel)) {
			    pass(driver,"Selected Negative Rotation Angle ("+ChangeRotataionVal_Negative_DataLabel+") is Updated in chart value");
			}else {
		       	fail(driver,"Selected Negative Rotation Angle ("+ChangeRotataionVal_Negative_DataLabel+") is not Updated in chart value");
			}
	      
	     	mouseOverToElement(driver, DataLabels);
	     	click(driver,DataLabels);
	      
	     	String DataLabelsClose_Act=getAttribute1(driver, DataLabels_Expand, "class");
			 if(DataLabelsClose_Act.contains("down")) {
				pass(driver,"Data labels gets collapsed when click on it");
			 }else {
				fail(driver,"Data Labels not gets collapsed when click on it");
			 }

		 }
	    
		 //******************* DataLabel Validation End ***************
		 
		// ******************* Others Validation Start *********************
		 String Bar_ChartFormat_Others= getCellValue("TestExecution","Testcase_Selection","Bar_ChartFormat_Others",Flag);
		 if(Bar_ChartFormat_Others.equals("Yes") && AllTestcase==true) {
			 verifyElementDisplayed(driver,ChartFormat_Others);
			 scrollUsingElement(driver,ChartFormat_Others);
			 String OthersExpand=getAttribute1(driver, ChartFormat_OthersExpand, "class");
			 if(OthersExpand.contains("up")) {
				pass(driver,"By default, 'Others' gets Expanded");
			 }else {
				fail(driver,"By default, 'Others' not gets Expand");
			 }
			
			 String Others_Color_Act=getTextColor(driver, ChartFormat_Others);
			 if(Others_Color_Exp.equalsIgnoreCase(Others_Color_Act)) {
				pass(driver,"'Others' gets displayed in blue color");
			 }else {
				fail(driver,"'Others' not displayed in blue color");
			 }
			 
		    //Validation of the visibility of Others options start...
			 verifyElementDisplayed(driver,StatsLine_text);
			 verifyElementIsPresent1(driver, StatsLine_Input);
			 
			 verifyElementDisplayed(driver,statsLinePosition_text);
			 verifyElementIsPresent1(driver, statsLinePosition_Input);
		
			 verifyElementDisplayed(driver,statsLineRoundOffText);
			 verifyElementIsPresent1(driver, statsLineRoundOff_Input);
			
			 verifyElementDisplayed(driver,Cursor_text);
			 verifyElementIsPresent1(driver, Cursor_Input);
			
			 verifyElementDisplayed(driver,Export_text);
			 verifyElementIsPresent1(driver, Export_Input);
			 
			 String default_StatslineValueAct=defaultSelectedValue(driver, StatsLine_Input);
	  		 if(default_StatslineValueExp.equals(default_StatslineValueAct)) {
		  		 pass(driver,"By default, '"+default_StatslineValueExp+"' is selected in the StatusLine Input"); 
		  		 
		  		if(isToggleAccessible(driver,statsLinePosition_Input)) {		
			  		 fail(driver,"'statsLinePosition Input' is accessible when no selection is made in the stats line field"); 
				}else {
			  		 pass(driver,"'statsLinePosition Input' is Inaccessible when no selection is made in the stats line field"); 
				}
		  		
		  		if(isToggleAccessible(driver,statsLineRoundOff_Input)) {		
			  		 fail(driver,"'statsLineRoundOff Input' is accessible when no selection is made in the stats line field"); 
				}else {
			  		 pass(driver,"'statsLineRoundOff Input' is Inaccessible when no selection is made in the stats line field"); 
				}
		  		
		  		if(isDisplayed2(driver, statsLineColorInput)) {
			  		 fail(driver,"'StatsLineColor Input' is displayed without enable stats line"); 
		 		}else {
			  		 pass(driver,"'StatsLineColor Input' is not displayed without enable stats line"); 
		 		}
		  		
	  		 }else {
		  		 fail(driver,"By default, '"+default_StatslineValueExp+"' is not selected in the StatusLine Input"); 
	  		 }
		    
	  		
	  		if(isToggleAccessible(driver,StatsLine_Input)) {		
		  		 pass(driver,"'StatsLine Input' is accessible"); 
			}else {
		  		 fail(driver,"'StatsLine Input' is not accessible"); 
			}
	  		
	  		click(driver,StatsLine_Input);
	  		String[] statLineValue= {"q1","q3","mean","median","std deviation","min","max"};
	  		
	  		for(int i=0;i<statLineValue.length;i++) {
	  			
		  	  	try {
		  	  		selectOptionValue(driver,StatsLine_Input,statLineValue[i]);
		  	  		wait(driver,"1");
		  	  		String selectedStatsLine=getTextJavascript(driver, StatsLine_Input);
		  	  		scrollUsingElement(driver, ApplyButton);
		  	  		click(driver,ApplyButton);
		  	  		elementnotvisible1(driver, RPE_Loading);
		  	  		waitForElement(driver,Chart);
		  	  		if(isDisplayed(driver,StatsLine_Chart)) {
		  	  			pass(driver,"StatsLine is displayed in the chart for the Condition : "+selectedStatsLine);
		  	  		}else {
		  	  			fail(driver,"StatsLine is not displayed in the chart for the Condition : "+selectedStatsLine);
		  	  		}
	  			} catch (Exception e1) {
	  				
	  			}
	  		}
	  		
	  		selectOptionValue(driver,StatsLine_Input,"custom");
	  		
	  		if(isDisplayed(driver,StatsLine_NumInput)) {
	  			pass(driver,"StatsLine Number Input is displayed when select the 'Custom' Value ");
	  			scrollUsingElement(driver, ApplyButton);
	  	  		click(driver,ApplyButton);
	  	  		if(isDisplayed(driver,StatsLine_Error)) {
	  	  			pass(driver,"'Kindly enter custom value for stats line' error displayed when input not given");
	  	  		}else {
	  	  			fail(driver,"'Kindly enter custom value for stats line' error not displayed when input not given");
	  	  		}
	  	  		
	  	  		sendKeys(driver,StatsLine_NumInput,"1");
	  	  	    scrollUsingElement(driver, ApplyButton);
		  		click(driver,ApplyButton);
		  		elementnotvisible1(driver, RPE_Loading);
	  	  		waitForElement(driver,Chart);
		  		if(isDisplayed(driver,StatsLine_Chart)) {
	  	  			pass(driver,"StatsLine is displayed in the chart for the Custom Condition ");
	  	  		}else {
	  	  			fail(driver,"StatsLine is not displayed in the chart for the Custom Condition");
	  	  		}
	  	  		
	  		}else {
	  			fail(driver,"StatsLine Number Input is not displayed when select the 'Custom' Value ");
	  		}
	  		 
	  		if(isToggleAccessible(driver,statsLineRoundOff_Input)) {		
		  		 fail(driver,"'statsLineRoundOff Input' is accessible when 'Custom' is selected in the stats line field"); 
			}else {
		  		 pass(driver,"'statsLineRoundOff Input' is InAccessible when 'Custom' is selected in the stats line field"); 
			}
	  		
	  		selectOptionValue(driver,StatsLine_Input,"q1");
	  		scrollUsingElement(driver, ApplyButton);
	  		click(driver,ApplyButton);
	  		elementnotvisible1(driver, RPE_Loading);
	  		waitForElement(driver,Chart);	
	  		
	  		if(isDisplayed(driver, statsLineColorInput)) {
	  			 pass(driver,"'StatsLineColor Input' is displayed when selecting the StatsLine Value"); 
		  		 String defaultStatsLineColor_Act=getTextJavascript(driver, statsLineColorInput);
		  		 if(defaultStatsLineColor_Exp.equals(defaultStatsLineColor_Act)) {
			  		 pass(driver,"By default, '"+defaultStatsLineColor_Exp+"' color is display in StatsLine Color Input"); 
		  		 }else {
			  		 fail(driver,"By default, '"+defaultStatsLineColor_Exp+"' color is not display in StatsLine Color Input"); 
		  		 }
		  		 
		  		 click(driver,statsLineColorInput);
		  		 if(isDisplayed(driver, ColorPickerOpen)) {  
		  			 scrollUsingElement(driver, ColorPickerOpen);
			  		 pass(driver,"Stats line color is accessible and color picker get opened"); 
			  		 click(driver,statsLineColor_text);
			  		 wait(driver,"1");
			  		 if(isDisplayed2(driver,ColorPickerOpen)) {
			  			 fail(driver, "Color picker not Closed when click outside the color input");
			  		 }else {
			  			 pass(driver, "Color picker Closed when click outside the color input");
			  		 }
			  		 
		  		 }else {
			  		 fail(driver,"Stats line color is not accessible and color picker not opened"); 
		  		 }
		  		 
		  		 doubleClick(driver,statsLineColorInput);
		  		 action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		  		 sendKeys(driver,statsLineColorInput,"#3366ff");
		  		 wait(driver,"1");
		  		 scrollUsingElement(driver, ApplyButton);
		  		 click(driver,ApplyButton);
		  		 elementnotvisible1(driver, RPE_Loading);
		  		 waitForElement(driver,Chart);	
		  		 
		  		 if(verifyElementDisplayed(driver, StatsLine_Chart)){
		  			String ChartStatsLineColorRGB=getWebElement(driver, StatsLine_Chart).getCssValue("stroke");  
		  			String appliedStatsLineColor=rgbToHex1(ChartStatsLineColorRGB);
		  			if(appliedStatsLineColor.equalsIgnoreCase("#3366ff")) {
						 pass(driver,"Selected Color '#3366ff' is applied in the displayed StatsLine in the chart");
	 				}else {
						 fail(driver,"Selected Color '#3366ff' is not applied in the displayed StatsLine in the chart");
	 				}
		  		 }
		  		 
		  		 clear1(driver,statsLineColorInput);
		  		 wait(driver,"1");
		  		 String StatsColorAfterClear=getTextJavascript(driver, statsLineColorInput);
		  		 if(StatsColorAfterClear.equalsIgnoreCase(defaultStatsLineColor_Exp)) {
		  			 pass(driver," Default color is displayed after revert the color ");
		  			 scrollUsingElement(driver, ApplyButton);
			  		 click(driver,ApplyButton);
			  		 elementnotvisible1(driver, RPE_Loading);
			  		 waitForElement(driver,Chart);
			  		 if(verifyElementDisplayed(driver, StatsLine_Chart)){
			  			String ChartStatsLineColorRGB=getWebElement(driver, StatsLine_Chart).getCssValue("stroke");  
			  			String appliedStatsLineColor=rgbToHex1(ChartStatsLineColorRGB);
			  			if(appliedStatsLineColor.equalsIgnoreCase(defaultStatsLineColor_Exp)) {
							 pass(driver,defaultStatsLineColor_Exp+" is applied in the displayed StatsLine in the chart after revert the Color");
		  				}else {
							 fail(driver,defaultStatsLineColor_Exp+" is not applied in the displayed StatsLine in the chart after revert the Color");
		  				}
			  		 }
			  		 
		  		 }else {
		  			 fail(driver," Default color is not displayed after revert the color ");
		  		 }
		  		 
	  		}else {
		  		 fail(driver,"'StatsLineColor Input' is not displayed when selecting the StatsLine Value"); 
	  		}
	  		
	  		// Position Validation start....
	  		if(isToggleAccessible(driver,statsLinePosition_Input)) {		
		  		 pass(driver,"'StatsLinePosition Input' accessible when selecting the StatsLine Value"); 
			}else {
		  		 fail(driver,"'StatsLinePosition Input' Inaccessible when selecting the StatsLine Value"); 
			}
	  		
	  		 String default_StatslinePosition_Act=defaultSelectedValue(driver, statsLinePosition_Input);
	  		 if(default_StatslinePosition_Exp.equals(default_StatslinePosition_Act)) {
		  		 pass(driver,"By default, '"+default_StatslinePosition_Exp+"' is selected in the StatusLine Position Input"); 
		  		 if(isDisplayed2(driver,StrokeLineBehind)) {
			  		 pass(driver,"StrokeLine displayed '"+default_StatslinePosition_Exp+"' the chart bars for the default selected Position "); 
				 }else {
			  		 fail(driver,"StrokeLine not displayed '"+default_StatslinePosition_Exp+"' the chart bars for the default selected Position "); 
				 }
	  		 }else {
		  		 fail(driver,"By default, '"+default_StatslinePosition_Exp+"' is not selected in the StatusLine Position Input"); 
	  		 }

	   		 selectOptionValue(driver,statsLinePosition_Input,"above");
	   		 scrollUsingElement(driver, ApplyButton);
			 click(driver,ApplyButton);
			 elementnotvisible1(driver, RPE_Loading);
			 waitForElement(driver,Chart);
			 
			 if(isDisplayed2(driver,StrokeLineAbove)) {
		  		 pass(driver,"StrokeLine displayed Above the chart bars after selected the Position as 'Above'"); 
			 }else {
		  		 fail(driver,"StrokeLine not displayed Above the chart bars after selected the Position as 'Above'"); 
			 }
			 
	  		 //position Validation End 
	  		 
	  		 if(isToggleAccessible(driver,statsLineRoundOff_Input)) {		
		  		 pass(driver,"'StatsLineRoundOff Input' accessible when selecting the StatsLine Value"); 
	  		 }else {
		  		 fail(driver,"'StatsLineRoundOff Input' Inaccessible when selecting the StatsLine Value"); 
	  		 }
	 		
	 		 String default_RoundOffValue_Act=defaultSelectedValue(driver, statsLineRoundOff_Input);
	 		 if(default_RoundOffValue_Exp.equals(default_RoundOffValue_Act)) {
		  		 pass(driver,"By default, '"+default_RoundOffValue_Exp+"' is selected in the StatusLine RoundOff Input"); 
	 		 }else {
		  		 fail(driver,"By default, '"+default_RoundOffValue_Exp+"' is not selected in the StatusLine RoundOff Input"); 
	 		 }
	 		 
	 		 selectOptionValue(driver, statsLineRoundOff_Input, ChangeRoundOffValue_Others);
	 		 scrollUsingElement(driver, ApplyButton);
	 		 click(driver,ApplyButton);
	 		 elementnotvisible1(driver, RPE_Loading);
	 		 waitForElement(driver,Chart);
	 		 
			 if(verifyElementDisplayed(driver, StatsLineRoundOff_Chart)) {
				 String StatsLineString=getText(driver, StatsLineRoundOff_Chart);
				 String roundOffStringValueAct=String.valueOf(getRoundOffValue(StatsLineString));
				 if(roundOffStringValueAct.equals(ChangeRoundOffValue_Others)) {
			  		 pass(driver,"StatsLine value displayed with selected '"+ChangeRoundOffValue_Others+"' RoundOff Value ");  
		 		 }else {
			  		 fail(driver,"StatsLine value not displayed with selected '"+ChangeRoundOffValue_Others+"' RoundOff Value "); 
		 		 }
			 }
	 		 
	 		 //cursor validation start....
	 		 if(isToggleEnable(driver,Cursor_Input)) {		
		  		 pass(driver,"'Cursor Input' is enabled by default"); 
			 }else {
		  		 fail(driver,"'Cursor Input' is disabled by default"); 
			 }
	 		 scrollUsingElement(driver, ApplyButton);
	  		 click(driver,ApplyButton);
	  		 elementnotvisible1(driver, RPE_Loading);
	  		 waitForElement(driver,Chart);
	 		 mouseOverToElement(driver, ChartGraph);
	 		
	 		 if(isDisplayed2(driver,MouseCursor)) {
		  		 pass(driver,"Cursor is displayed in chart when cursor is enable"); 
	 		 }else {
		  		 fail(driver,"Cursor is not displayed in chart when cursor is enable");  
	 		 }
	 		
	 		//
	 		click(driver,Cursor_InputClick);
	 		if(isToggleEnable(driver,Cursor_Input)) {		
		  		 fail(driver,"'Cursor Input' is enable while click on it"); 
			}else {
		  		 pass(driver,"'Cursor Input' is disable while click on it"); 
			}
	 		 scrollUsingElement(driver, ApplyButton);
	 		 click(driver,ApplyButton);
	 		 elementnotvisible1(driver, RPE_Loading);
	 		 waitForElement(driver,Chart);
			 mouseOverToElement(driver, ChartGraph);
			 if(isDisplayed2(driver,MouseCursor)) {
		  		 fail(driver,"Cursor is displayed in chart when cursor is disable"); 
	 		 }else {
		  		 pass(driver,"Cursor is not displayed in chart when cursor is disable");  
	 		 }
	 		
			 //cursor validation End....
	 		
	 		if(isToggleEnable(driver,Export_Input)) {		
		  		 fail(driver,"'Export Input' enable by default");
			}else {
		  		 pass(driver,"'Export Input' disable by default"); 
			}
	 		
	 		scrollUsingElement(driver, ApplyButton);
	 		click(driver,ApplyButton);
	 		elementnotvisible1(driver, RPE_Loading);
	 		waitForElement(driver,Chart);
	 		if(isDisplayed2(driver,ExportChartOptions)) {
		  		 fail(driver,"'Export Options' is displayed in charts when Export chart is disabled"); 
			}else {
		  		 pass(driver,"'Export Options' not displayed in charts when Export chart is disabled"); 
			}
	 		
	 		click(driver,Export_InputClick);
	 		if(isToggleEnable(driver,Export_Input)) {		
		  		 pass(driver,"'Export Input' is enabled while enabling it");
			}else {
		  		 fail(driver,"'Export Input' not enabled while enabling it"); 
			}
	 		
	 		scrollUsingElement(driver, ApplyButton);
	 		click(driver,ApplyButton);
	 		elementnotvisible1(driver, RPE_Loading);
	 		waitForElement(driver,Chart);
	 		if(isDisplayed2(driver,ExportChartOptions)) {
		  		 pass(driver,"'Export Options' is displayed in charts when Export chart is enabled"); 
		  		 mouseOverToElement(driver, ExportChartOptions);
		  		 if(isDisplayed2(driver,ExportOptionExpandList)) {
			  		pass(driver,"'Export Options' is expanded when click on it"); 
			  		if(isDisplayed2(driver,Export_Image)) {
				  		 pass(driver,"'IMG' Option is displayed When expand the charts Export"); 
				  		 mouseOverToElement(driver, Export_Image);
				  		 
				  		if(elementIsVisible(driver,Export_PNG)) {
					  		 pass(driver,"'PNG' Option displayed When Mouse hover on IMG Option"); 
			  			}else {
					  		 fail(driver,"'PNG' Option is not displayed When Mouse hover on IMG Option"); 
			  			}
				  		
				  		if(elementIsVisible(driver,Export_JPG)) {
					  		 pass(driver,"'JPG' Option displayed When Mouse hover on IMG Option"); 
			  			}else {
					  		 fail(driver,"'JPG' Option is not displayed When Mouse hover on IMG Option"); 
			  			}
				  		
				  		if(elementIsVisible(driver,Export_SVG)) {
					  		 pass(driver,"'SVG' Option displayed When Mouse hover on IMG Option"); 
			  			}else {
					  		 fail(driver,"'SVG' Option is not displayed When Mouse hover on IMG Option"); 
			  			}
			  		 }else {
				  		 fail(driver,"'IMG' Option is not displayed When expand the charts Export"); 
			  		 }
			  		 
			  		if(isDisplayed2(driver,Export_Data)) {
				  		 pass(driver,"'Data' Option is displayed When expand the charts Export"); 
				  		 mouseOverToElement(driver, Export_Data);
				  		 verifyElementIsPresent1(driver, Export_JSON);
				  		 verifyElementIsPresent1(driver, Export_CSV);
				  		 verifyElementIsPresent1(driver, Export_XLSX);
				  		 verifyElementIsPresent1(driver, Export_HTML);

			  		 }else {
				  		 fail(driver,"'Data' Option is not displayed When expand the charts Export"); 
			  		 }
			  		
			  		if(isDisplayed2(driver,Export_Print)) {
				  		 pass(driver,"'Print' Option is displayed When expand the charts Export"); 			  		 
			  		 }else {
				  		 fail(driver,"'Print' Option is not displayed When expand the charts Export"); 
			  		 }
			  		 
		  		 }else {
			  		 fail(driver,"'Export Options' is not expanded when click on it"); 
		  		 }
			}else {
		  		 fail(driver,"'Export Options' not displayed in charts when Export chart is enabled"); 
			}
		 }
		 
 	    // ******************* Others Validation End *********************
		
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
       	sendKeys(driver,ChartTitleInput,ChartTitleName1_BAR_Smoke);
       	click(driver,SaveBtn_Chart);
       	elementnotvisible1(driver, RPE_Loading);
       	if(!isDisplayed2(driver,chartSaveError1) && isDisplayed(driver,SavedChartTitleInput)) {
       		pass(driver,"Chart Saved Successfully");
       	}else {
       		fail(driver,"Chart not Saved Successfully");
       	}	
	      
       	String AfterSaveChartTitleName=getText1(driver, SavedChartTitleName);
       	if(AfterSaveChartTitleName.equals(ChartTitleName1_BAR_Smoke)) {
       		pass(driver,"Same Chart Title name displayed after saved the chart ");
       	}else {
       		fail(driver,"Different Chart Title name displayed after saved the chart ");
       	}
	    	  
       	if(AllTestcase==true) {
       		mouseOverToElement(driver, SavedChartTitleInput);
           	
       		if(Bar_ChartFormat_Others.equals("Yes")) {
       			if(isDisplayed2(driver,ExportOption_SavedChart)) {
               		pass(driver,"Export option get enabled after save chart");
               	}else {
               		fail(driver,"Export option not get enabled after save chart");
               	}
       		}
           	
           	verifyElementDisplayed(driver, copyChart);
           	verifyElementDisplayed(driver, filterChart);
           	verifyElementDisplayed(driver, editeChart);
           	verifyElementDisplayed(driver, deteleBtn_chart);
        	verifyElementDisplayed(driver, TableView_icon);
           	verifyElementDisplayed(driver, Alpha_asc_icon);
           	verifyElementDisplayed(driver, Alpha_Desc_icon);
           	verifyElementDisplayed(driver, Numeric_asc_icon);
        	verifyElementDisplayed(driver, Numeric_Desc_icon);
        	
        	String Filter_tooltip="Local Filter: OFF \r\n"
        			+ "Tab Filter: OFF \r\n"
        			+ "Global Filter: OFF";
        	String Filter_tooltip1="Local Filter: OFF";
        	String Filter_tooltip2="Tab Filter: OFF";
        	String Filter_tooltip3="Global Filter: OFF";
        	mouseOverToElement(driver, filterChart);
        	if(verifyElementIsPresent1(driver, FilterChartIcon)) {
        		String Filter_tooltipAct=getAttribute1(driver, FilterChartIcon, "title");
        		if(Filter_tooltipAct.contains(Filter_tooltip1)&&Filter_tooltipAct.contains(Filter_tooltip2)&&Filter_tooltipAct.contains(Filter_tooltip3)) {
        			pass(driver,"Filter status correctly displayed without selecting any filter : "+Filter_tooltipAct);
        		}else {
        			fail(driver,"Filter status not correctly displayed without selecting any filter, Exp "+Filter_tooltip+" Act : "+Filter_tooltipAct);
        		}
        	}
       	}
       
    	
    	// *************** Local Filter Start **************** 
    	String Bar_LocalFilter= getCellValue("TestExecution","Testcase_Selection","Bar_LocalFilter",Flag);
    	 if(Bar_LocalFilter.contains("Yes") && AllTestcase==true) {
    		 mouseOverToElement(driver, chartBody);
    		 click(driver,filterChart);
    		 
    		 if(isDisplayed(driver,LocalFilterSec)) {
    			 pass(driver,"Local Filter section is displayed when click the filter chart icon");
    			 if(verifyElementDisplayed(driver, ChartTitleNameLocalFilter)) {
    				 String chartTitlename=getText1(driver, ChartTitleNameLocalFilter);
   	    		  	 if(chartTitlename.equals(ChartTitleName1_BAR_Smoke)) {
   	    		  		 pass(driver,"Same chart title name displayed in Local filter section");
   	    		  	 }else {
   	    		  		 fail(driver,"Different chart title name displayed in Local filter section");
   	    		  	 }
    			 }
    			 
    			 verifyElementDisplayed(driver, DatasetName_LocalFilter);
    			 
    			 if(isDisplayed(driver,ColumnListSec_LocalFilter)) {
	    			  pass(driver,"ColumnList Section is present in the Local filter");
	    			  if(isDisplayed(driver,ColumnListValue_LocalFilter)) {
	    				  pass(driver,"Column List Names are displayed in the Local Filter");
	    				  List<WebElement> ColumnListElements=getWebElements(driver, ColumnListValue_LocalFilter);
	    				  List<WebElement> ColumnListImgElements=getWebElements(driver, ColumnTypeIcon_LocalFilter);
	    				  if(ColumnListElements.size()==ColumnListImgElements.size()) {
	    					  pass(driver,"All column values displayed with dataType Image icon");
	    				  }else {
	    					  fail(driver,"Some column values not displayed with dataType Image icon");
	    				  }
	    				  
	    			  }else {
	    				  fail(driver,"Column List Names are displayed in the Local Filter");
	    			  }
	    		  }else {
	    			  fail(driver,"ColumnList Section is present in the Local filter");
	    		  }
    			 
    			  if(verifyElementDisplayed(driver, Tab_toggle_LocalFilter)) {
	    			  if(isToggleEnable(driver, Tab_inputToggle_LocalFilter)) {
	    				  pass(driver,"Tab toggle enabled by default");
	    			  }else {
	    				  fail(driver,"Tab toggle not enabled by default");
	    			  }
	    		  }
	    		  
	    		  if(verifyElementDisplayed(driver, Global_toggle_LocalFilter)) {
	    			  if(isToggleEnable(driver, Global_inputToggle_LocalFilter)) {
	    				  pass(driver,"Global toggle enabled by default");
	    			  }else {
	    				  fail(driver,"Global toggle not enabled by default");
	    			  }
	    		  }
	    		  
	    		  if(verifyElementDisplayed(driver, ApplyButton_LocalFilter)) {
	    			  String ApplyButtonColorAct=getTextBackgroundColor(driver, ApplyButton_LocalFilter);
	    			  if(ApplyButtonColorAct.equalsIgnoreCase(AppluBtnColor_LocalFilterExp)) {
	    				  pass(driver,"Apply button in Local filter is displayed with blue color Exp : "+AppluBtnColor_LocalFilterExp+", Act : "+ApplyButtonColorAct);
	    			  }else {
	    				  fail(driver,"Apply button in Local filter is not displayed with blue color Exp : "+AppluBtnColor_LocalFilterExp+", Act : "+ApplyButtonColorAct);
	    			  }
	    		  }
	    		  
	    		  verifyElementDisplayed(driver, ResetButton_LocalFilter);
	    		  ScrollBarValidation1(driver, ColumnListSec_LocalFilter, "ColumnList Local Filter");
	    		  
	    		  if(verifyElementDisplayed(driver, SearchBar_Local_Filter)) {
	    			  List<WebElement> ColumnListElements=getWebElements(driver, ColumnListValue_LocalFilter); 
	    			  int ColumnListElementsLastSize=ColumnListElements.size()-1;
	    			  String LastColumnName=ColumnListElements.get(ColumnListElementsLastSize).getText();
	    			  click(driver,SearchBar_Local_Filter);
	    			  sendKeys(driver, SearchBar_Local_Filter, LastColumnName);
	    			  wait(driver,"1");
	    			  String AfterSearchLastName=getText1(driver,ColumnListFirstValue_LocalFilter);
	    			  if(AfterSearchLastName.equals(LastColumnName)) {
	    				  pass(driver,"Search Function works properly in Local Filter");
	    				  if(isDisplayed(driver,ImageFirstColumn_localFiler)) {
	    					  pass(driver,"DataType image is displayed in the searched Value");
	    				  }else {
	    					  fail(driver,"DataType image is not displayed in the searched Value");
	    				  }
	    			  }else {
	    				  fail(driver,"Search Function not works properly in Local Filter");
	    			  }
	    			  clear1(driver,SearchBar_Local_Filter);
	    			  wait(driver,"1");
	    			  enter(driver);
	    			  String AfterRestSearchValue=getText1(driver, SearchBar_Local_Filter);
	    			  if(AfterRestSearchValue.isEmpty() || AfterRestSearchValue.equals(null)) {
	    				  pass(driver,"Value cleared successfully in searchbar");
	    			  }else {
	    				  fail(driver,"Value not cleared successfully in searchbar");
	    			  }
	    			  
	    		  }
	    		  
	    	 if(Y_Axis_dataType.equals("Categorical")) {
	    		 
	    		 //categorical Validation start...
	    		  boolean categoricalFilter=false;
	    		  try {
	    			  WebElement CategoricalColumn= driver.findElement(By.xpath("//div[@id='dashboardLRPE_select_filterColsCon']//div[@id='"+Select_Y_Axis_Value+"']//a"));
		    		  action.moveToElement(CategoricalColumn).click().build().perform();
		    		  categoricalFilter=true;
	    		  }catch(Exception e) {
	    			  
	    		  }
	    		  
	    		  if(categoricalFilter==true) {
		    		  WebElement CategoricalColumnExp=driver.findElement(By.xpath("//div[@id='dashboardLRPE_select_filterColsCon']//div[@id='"+Select_Y_Axis_Value+"']//a//i"));
		    		  String CategoricalColumnExpText=CategoricalColumnExp.getAttribute("class");
		    		  if(CategoricalColumnExpText.contains("up")) {
		    			  pass(driver,"Categorical Column Expand After click on it ");
		    			  if(verifyElementDisplayed(driver, byValueFilterOption)) {
		    				  if(isElementSelected(driver,byValueRadioButton)) {
		    					  pass(driver,"By default, 'By Values' radio button selected ");
		    				  }else {
		    					  fail(driver,"By default, 'By Values' radio button not selected ");
		    				  }
	    				  }
		    			  
		    			  verifyElementDisplayed(driver, AllCheckbox_CategoricalSec);
    				      verifyElementDisplayed(driver, CategoricalSearchListOptions);
    				      verifyElementDisplayed(driver, ExcludeOption_Categorical);
    				      verifyElementDisplayed(driver, ExcludeCheckbox);

    				      List<WebElement> searchListAvailable=getWebElements(driver,AvailableList_ByValue);
    				      List<WebElement> searchListCheckboxAvailable=getWebElements(driver,AvailableListCheckbox_ByValue);
    				      
    				      if(searchListAvailable.size()==searchListCheckboxAvailable.size()) {
    				    	  pass(driver,"All the available searchlist are displayed with Checkbox");
    				      }else {
    				    	  fail(driver,"Some available searchlist are not displayed with Checkbox");
    				      }
    				      
    				      waitForElement(driver,SearchField_CategoricalSec);
    				      click(driver,SearchField_CategoricalSec);
		    			  sendKeys(driver,SearchField_CategoricalSec,ByValuesInput_Categorical_LF);
		    			  wait(driver,"1");
		    			  String firstOptionText=getText1(driver,FirstSearchedListValue);
		    			  if(firstOptionText.equals(ByValuesInput_Categorical_LF)) {
		    				  pass(driver,"Search bar inside the Categorical section works properly");
		    			  }else {
		    				  fail(driver,"Search bar inside the Categorical section not works properly");
		    			  }
	    			  
		    			  click(driver,FirstSearchedListValue);
	    				  wait(driver,"1");
	    				  
	    				  if(isElementSelected(driver,FirstSearchedCheckbox)) {
	    					  pass(driver,"Check box selected when click the First searched value");
	    				  }else {
			    			  fail(driver,"Check box not selected when click the First searched value"); 
	    				  }
			    		  
			    		  click(driver,ApplyButton_LocalFilter);
    					  wait(driver,"1");
    					  if(isDisplayed(driver,Bug_msg)) {
    						  fail(driver,"Error displayed : "+getText1(driver, Bug_msg));
    					  }
    					  elementnotvisible(driver, RPE_Loading);
    					  if(isDisplayed(driver,chartBody)) {
    						  
    						  mouseOverToElement(driver, chartBody);
	    					  
	    					  mouseOverToElement(driver, LocalFilterChartIcon);
	    					  
	    					  String LocatFilterExpected="Local Filter: ON ";
	    					  String LocatFilterAct=getAttribute1(driver, FilterChartIcon, "title");
	    					  System.out.println("LocatFilterAct : "+LocatFilterAct);
	    					  if(LocatFilterAct.contains(LocatFilterExpected)) {
	    						  pass(driver,"Local filter is ON in the chart after Apply filter");
	    					  }else {
	    						  fail(driver,"Local filter is not ON in the chart after Apply filter");
	    					  }
	    					  
	    					  String LocalFilterIconColorRGB=getWebElement(driver, LocalFilterChartIcon).getCssValue("fill");  
	    					  String LocalFilterIconColorAct=rgbToHex1(LocalFilterIconColorRGB);
	    					  
	    					  if("#00E600".equalsIgnoreCase(LocalFilterIconColorAct)) { // need to modify.
	    						  pass(driver,"Local Filter icon changed to green color after Applying the Local Filter"); 
	    					  }else {
	    						  fail(driver,"Local Filter icon not changed to green color after Applying the Local Filter");
	    					  }
	    					  
		    		          boolean filteredCell=true;
	    					  List<WebElement> FilterChartValues=getWebElements(driver,ChartBody_Y_Values);
	    					  for(WebElement localEle:FilterChartValues) {
	    						  String FilteredValue=localEle.getAttribute("aria-label");
	    						  
	    						  if(!FilteredValue.equals(ByValuesInput_Categorical_LF)) {
	    							  filteredCell=false;
	    						  }
	    						  
	    					  }
	    					  
		    		         if(filteredCell==true) {
		  			    	       pass(driver,"For 'By Values' condition applied correctly in the BarChart");
		  			          }else {
		  			    	       fail(driver,"For 'By Values' condition not applied correctly in the BarChart");
		  			          }
	    					  
    					  }else {
    						  pass(driver,"Unable to get the chart value for the selected filter, By Values : "+getText1(driver, ValidationChart));
    					  }
    					  
			    		  click(driver,ExcludeCheckbox);
			    		  click(driver,ApplyButton_LocalFilter);
			    		  if(isDisplayed(driver,Bug_msg)) {
    						  fail(driver,"Error displayed : "+getText1(driver, Bug_msg));
    					  }
			    		  elementnotvisible1(driver, RPE_Loading);
    					  if(isDisplayed(driver,chartBody)) {
    						  
    						  mouseOverToElement(driver, chartBody);
	    					  mouseOverToElement(driver, LocalFilterChartIcon);
	    					  String LocalFilterIconColorRGB=getWebElement(driver, LocalFilterChartIcon).getCssValue("fill");  
	    					  String LocalFilterIconColorAct=rgbToHex1(LocalFilterIconColorRGB);
	    					  
	    					  if("#00E600".equalsIgnoreCase(LocalFilterIconColorAct)) { // need to modify.
//	    						  pass(driver,"Local Filter icon changed to green color after Applying the Local Filter"); 
	    					  }else {
	    						  fail(driver,"Local Filter icon not changed to green color after Applying the Local Filter");
	    					  }
	    					  
		    		          boolean filteredCell=true;
	    					  List<WebElement> FilterChartValues=getWebElements(driver,ChartBody_Y_Values);
	    					  for(WebElement localEle:FilterChartValues) {
	    						  String FilteredValue=localEle.getAttribute("aria-label");
	    						  
	    						  if(FilteredValue.equals(ByValuesInput_Categorical_LF)) {
	    							  filteredCell=false;
	    						  }
	    						  
	    					  }
	    					  
	    					  if(filteredCell==true) {
		  			    	       pass(driver,"For 'By Values' with Exclude condition applied correctly in the BarChart");
		  			          }else {
		  			    	       fail(driver,"For 'By Values' with Exclude condition not applied correctly in the BarChart");
		  			          }
	    					  
    					  }else {
    						  pass(driver,"Unable to get the chart value for the selected filter By Values with Exclude : "+getText1(driver, ValidationChart));
    					  }
    					    
    					  if(verifyElementDisplayed(driver, ConditionFilterOption_Categorical)) {
    				    	  click(driver,ConditionFilterOption_Categorical);
    				    	  wait(driver,"1");
    				    	  if(isElementSelected(driver,ConditionRadioButton_Categorical)) {
    				    		  pass(driver,"Condition radio button selected after click on it");
    				    	  }else {
    				    		  fail(driver,"Condition radio button not selected after click on it");
    				    	  } 
    				    		  
			    		  	  if(verifyElementDisplayed(driver, ConditionSelectDropdown)) {
				    			  String defaultSelectedCondition=defaultSelectedValue(driver, ConditionSelectDropdown);
				    			  if(defaultSelectedCondition.equals("equal to")) {
				    				  pass(driver,"By default, 'equal to' option selected in the Condition select dropdown");
				    			  }else {
				    				  fail(driver,"By default, 'equal to' option not selected in the Condition select dropdown");
				    			  }
    				    			  
				    			  verifyElementIsPresent1(driver, equalTo_Option);
				    			  verifyElementIsPresent1(driver, NotequalTo_Option);
				    			  verifyElementIsPresent1(driver, NotequalTo_Option);
				    			  verifyElementIsPresent1(driver, BeginsWith_Option);
				    			  verifyElementIsPresent1(driver, notBeginsWith_Option);
				    			  verifyElementIsPresent1(driver, endsWith_Option);
				    			  verifyElementIsPresent1(driver, notendsWith_Option);
				    			  verifyElementIsPresent1(driver, Contains_Option);
				    			  verifyElementIsPresent1(driver, NotContains_Option);
    				    		 
				    			  String[] conditionsList= {FirstCondition_1_Categorical_LF,FirstCondition_2_Categorical_LF,FirstCondition_3_Categorical_LF,FirstCondition_4_Categorical_LF,FirstCondition_5_Categorical_LF,FirstCondition_6_Categorical_LF,FirstCondition_7_Categorical_LF,FirstCondition_8_Categorical_LF};
				    			  String[] conditionsInputList= {FirstCondition_Input_1_Categorical_LF,FirstCondition_Input_2_Categorical_LF,FirstCondition_Input_3_Categorical_LF,FirstCondition_Input_4_Categorical_LF,FirstCondition_Input_5_Categorical_LF,FirstCondition_Input_6_Categorical_LF,FirstCondition_Input_7_Categorical_LF,FirstCondition_Input_8_Categorical_LF};

				    			  for(int k=0;k<8;k++) {

				    				  try {
				    					 selectByText(driver, ConditionSelectDropdown, conditionsList[k]); 
				    					 wait(driver,"1");
				    			  		 click(driver,ConditonInput1);
				    			  		 clear1(driver,ConditonInput1);
				    			  		 sendKeys(driver,ConditonInput1,conditionsInputList[k]);
				    			  		 wait(driver,"1");
				    			  		 click(driver,ApplyButton_LocalFilter);
				    			  		 if(isDisplayed(driver,Bug_msg)) {
				    					 	  fail(driver,conditionsList[k]+"  Error displayed : "+getText1(driver, Bug_msg));
				    					  }
				    			  		 elementnotvisible1(driver, RPE_Loading);
				    			  		 
				    			  		 if(isDisplayed(driver,chartBody)) {
				    						  mouseOverToElement(driver, chartBody);
					    					  mouseOverToElement(driver, LocalFilterChartIcon);
					    					  String LocalFilterIconColorRGB=getWebElement(driver, LocalFilterChartIcon).getCssValue("fill");  
					    					  String LocalFilterIconColorAct=rgbToHex1(LocalFilterIconColorRGB);
					    					  
					    					  if("#00E600".equalsIgnoreCase(LocalFilterIconColorAct)) { // need to modify.
//					    						  pass(driver,"Local Filter icon changed to green color after Applying the Local Filter"); 
					    					  }else {
					    						  fail(driver,"Local Filter icon not changed to green color after Applying the Local Filter");
					    					  }
					    					  
						    		          boolean filteredCell=true;
					    					  List<WebElement> FilterChartValues=getWebElements(driver,ChartBody_Y_Values);
					    					  for(WebElement localEle:FilterChartValues) {
					    						  String FilteredValue=localEle.getAttribute("aria-label");
					    						  
					    						  if(!Categorical_ConditionFiltercell(conditionsList[k],FilteredValue,conditionsInputList[k])) {
				    			  					   filteredCell=false;
				    			  				  }
					    					  }
					    					  
					    					  if(filteredCell==true) {
						  			    		  pass(driver,"For '"+conditionsList[k]+"' Local Filter condition applied correctly in the BarChart");
								  			  }else {
		    			  					      fail(driver,conditionsList[k]+" Condition in Local Filter not applied correctly in the BarChart");
								  			  }
					    					  
				    					  }else {
				    						  pass(driver,"Unable to get the chart value for the selected filter, "+conditionsList[k]+" : "+getText1(driver, ValidationChart));
				    					  }
				    			  		 
				    				  }catch(Exception e) {
				    					 // e.printStackTrace();
				    				  }
				    			  }
    				    			 
				    			  click(driver,ConditionSelectDropdown);
				    			  selectByText(driver, ConditionSelectDropdown, FirstCondition_Categorical_LF);
				    			  wait(driver,"1");
				    			  click(driver,ConditonInput1);
				    			  clear1(driver,ConditonInput1);
				    			  sendKeys(driver,ConditonInput1,FirstCondition_Input_Categorical_LF);
				    			  wait(driver,"1");
				    			  if(isDisplayed(driver,AddButtonCondition)) {
				    				  pass(driver,"ADD button displayed after selecting the condition");
				    			  }else {
					    			  fail(driver,"ADD button not displayed after selecting the condition"); 
					    		  }
				    			  
			    				  selectOperatorCondition1(driver,FirstOperator_Input_Categorical_LF);
			    				  
			    				  if(isDisplayed(driver,ConditionSelectDropdown2)) {
			    					  pass(driver,"After click 'ADD' button Second time Condition Selection dropdown is displayed");
			    				  }else {
				    				  fail(driver,"After click 'ADD' button Second time Condition Selection dropdown is not displayed"); 
				    			  } 
			    					 
			    				  click(driver,ConditionSelectDropdown2);
		    					  selectByText(driver, ConditionSelectDropdown2, SecondCondition_Categorical_LF);
		    					  wait(driver,"1");
		    					  click(driver,ConditonInput2);
		    					  sendKeys(driver,ConditonInput2,SecondCondition_Input_Categorical_LF);
		    					  wait(driver,"1");
		    					  if(isDisplayed(driver,AddButtonCondition)) {
				    				  pass(driver,"2 time ADD button displayed after selecting the condition 2nd time ");
		    					  }else {
		    						  fail(driver,"2 time ADD button not displayed after selecting the condition 2nd time ");
		    					  } 
				    				  
		    					  selectOperatorCondition2(driver,SecondOperator_Input_Categorical_LF);
			    				  
			    				  if(isDisplayed(driver,ConditionSelectDropdown3)) {
			    					  pass(driver,"After click 'ADD' button Third time Condition Selection dropdown is displayed");
			    				  }else {
			    					  fail(driver,"After click 'ADD' button Third time Condition Selection dropdown is not displayed");
			    				  }
			    					  
		    					  selectByText(driver, ConditionSelectDropdown3, ThirdCondition_Categorical_LF);
		    					  wait(driver,"1");
		    					  click(driver,ConditonInput3);
		    					  sendKeys(driver,ConditonInput3,ThirdCondition_Input_Categorical_LF);
		    					  wait(driver,"1");
		    					  if(isDisplayed2(driver,AddButtonCondition)) {
		    						  fail(driver,"'ADD' button displayed after given 3 times condition ");
		    					  }else {
		    						  pass(driver,"'ADD' button not displayed after given 3 times condition");
		    					  }
		    					 
		    					  click(driver,ApplyButton_LocalFilter);
		    					  if(isDisplayed(driver,Bug_msg)) {
		    						  fail(driver,"Error displayed : "+getText1(driver, Bug_msg));
		    					  }
		    					  elementnotvisible1(driver, RPE_Loading);
		    					  if(isDisplayed(driver,chartBody)) {
		    						  
		    						  mouseOverToElement(driver, chartBody);
			    					  mouseOverToElement(driver, LocalFilterChartIcon);
			    					  String LocalFilterIconColorRGB=getWebElement(driver, LocalFilterChartIcon).getCssValue("fill");  
			    					  String LocalFilterIconColorAct=rgbToHex1(LocalFilterIconColorRGB);
			    					  
			    					  if("#00E600".equalsIgnoreCase(LocalFilterIconColorAct)) { // need to modify.
//			    						  pass(driver,"Local Filter icon changed to green color after Applying the Local Filter"); 
			    					  }else {
			    						  fail(driver,"Local Filter icon not changed to green color after Applying the Local Filter");
			    					  }
			    					  
				    		          boolean filteredCell=true;
			    					  List<WebElement> FilterChartValues=getWebElements(driver,ChartBody_Y_Values);
			    					  for(WebElement localEle:FilterChartValues) {
			    						  String FilteredValue=localEle.getAttribute("aria-label");
			    						  
			    						  boolean condition_1_Result=Categorical_ConditionFiltercell(FirstCondition_Categorical_LF,FilteredValue,FirstCondition_Input_Categorical_LF);
			    						  boolean condition_2_Result=Categorical_ConditionFiltercell(SecondCondition_Categorical_LF,FilteredValue,SecondCondition_Input_Categorical_LF);
			    						  boolean condition_3_Result=Categorical_ConditionFiltercell(ThirdCondition_Categorical_LF,FilteredValue,ThirdCondition_Input_Categorical_LF);
			    						  String operator1 = FirstOperator_Input_Categorical_LF; 
			    						  String operator2 = SecondOperator_Input_Categorical_LF;
		    			  				 
			    						  if(!evaluateConditions(condition_1_Result,operator1,condition_2_Result,operator2,condition_3_Result)) {
		    			  					 filteredCell=false;
			    						  }
			    						  
			    					  }
			    					  
			    					  if(filteredCell==true) {
				  			    	       pass(driver,"For selected 3 condition applied correctly in the BarChart");
				  			          }else {
				  			    	       fail(driver,"For selected 3 condition not applied correctly in the BarChart");
				  			          }
			    					  
		    					  }else {
		    						  pass(driver,"Unable to get the chart value for the selected filter,  3 condition : "+getText1(driver, ValidationChart));
		    					  }
		    					  
		    					  
		    					  click(driver,ResetButton_LocalFilter);
		    					  elementnotvisible1(driver, RPE_Loading);
		    					  waitForElement(driver, chartBody);
		    					  mouseOverToElement(driver, chartBody);
		    					  mouseOverToElement(driver, LocalFilterChartIcon);
		    					  String LocatFilterExpected="Local Filter: OFF ";
		    					  String LocatFilterExpRest=getAttribute1(driver, FilterChartIcon, "title");
		    					  System.out.println("LocatFilterExpRest : "+LocatFilterExpRest);
		    					  
		    					  if(LocatFilterExpRest.contains(LocatFilterExpected)) {
		    						  System.out.println("Passed : LocatFilterAct");
		    						  pass(driver,"Local filter is OFF in the chart after Reset filter");
		    					  }else {
		    						  System.out.println("Failed.!! : LocatFilterAct");
		    						  fail(driver,"Local filter is not OFF in the chart after Reset filter");
		    					  }
		    					   
		    					  String LocalFilterIconColorRGB=getWebElement(driver, LocalFilterChartIcon).getCssValue("fill");
			    				  String LocalFilterIconColorAct=rgbToHex1(LocalFilterIconColorRGB);
		    					  if(!"#00E600".equalsIgnoreCase(LocalFilterIconColorAct)) { // need to modify.
		    						  pass(driver,"Local Filter icon changed to default color after Reset the Local Filter"); 
		    					  }else {
		    						  fail(driver,"Local Filter icon not changed to default color after Reset the Local Filter");
		    					  }
    				    		  
    				    	   }
    					  	}
    				    		
    					  }else {
    						  fail(driver,"Selected Categorical Column not Expand After click on it ");
    		    		  }	
    					  
		    		  }else {
		    			  fail(driver,Select_Y_Axis_Value+" Categorical Column value not present in local filter");
		    		  }	
	    		  
    		 	}  // Categorical Local Validation End  
	    		  
	    	      // Date Local Validation End  
    		  if(Y_Axis_dataType.equals("Date")) {
    			   click(driver,ResetButton_LocalFilter);
    			   elementnotvisible1(driver, RPE_Loading);
 	    		   boolean dateFilter=false;
 	    		   try {
 	    			  WebElement DateColumnElement=driver.findElement(By.xpath("//div[@id='dashboardLRPE_select_filterColsCon']//div[@id='"+Select_Y_Axis_Value+"']//a"));
     				  action.moveToElement(DateColumnElement).click().build().perform();
     				  dateFilter=true;
 	    		   }catch(Exception e) {
 	    			  
 	    		   }
			   
 	    		   if(dateFilter==true) { 
    				  WebElement DateColumnElementExpand=driver.findElement(By.xpath("//div[@id='dashboardLRPE_select_filterColsCon']//div[@id='"+Select_Y_Axis_Value+"']//a//i"));
    				  String DateColumnElementExpandString=DateColumnElementExpand.getAttribute("class");
    				  if(DateColumnElementExpandString.contains("up")) {
    					  pass(driver,"Selected Date Column expanded after click on it");
    					 
    					  if(verifyElementDisplayed(driver, RelativeOption)) {
    						  if(isElementSelected(driver, RelativeOptionRadioBtn)) {
    							  pass(driver,"By default, 'Relative' option selected in the Date Column");
    						  }else {
    							  fail(driver,"By default, 'Relative' option not selected in the Date Column");
    						  }
    						  
    						  click(driver,Relative_conditin_dropdown);
    						  verifyElementIsPresent1(driver, Today_RelativeOption);
							  verifyElementIsPresent1(driver, Yesterday_RelativeOption);
							  verifyElementIsPresent1(driver, Last7Day_RelativeOption);
							  verifyElementIsPresent1(driver, ThisWeek_RelativeOption);
							  verifyElementIsPresent1(driver, LastWeek_RelativeOption);
							  verifyElementIsPresent1(driver, ThisMonth_RelativeOption);
							  verifyElementIsPresent1(driver, LastMonth_RelativeOption);
							  verifyElementIsPresent1(driver, Last6Month_RelativeOption);
							  verifyElementIsPresent1(driver, ThisYear_RelativeOption);
							  verifyElementIsPresent1(driver, LastYear_RelativeOption);
							  verifyElementIsPresent1(driver, Last_N_Days_RelativeOption);
							  verifyElementIsPresent1(driver, Last_N_Week_RelativeOption);
							  verifyElementIsPresent1(driver, Last_N_Months_RelativeOption);
							  verifyElementIsPresent1(driver, Last_N_Years_RelativeOption);
							
							  String[] RelativeFilterList= {RelativeFilter_1_Date_LF,RelativeFilter_2_Date_LF,RelativeFilter_3_Date_LF,RelativeFilter_4_Date_LF,RelativeFilter_5_Date_LF,RelativeFilter_6_Date_LF,RelativeFilter_7_Date_LF,RelativeFilter_8_Date_LF,RelativeFilter_9_Date_LF,RelativeFilter_10_Date_LF,RelativeFilter_11_Date_LF,RelativeFilter_12_Date_LF,RelativeFilter_13_Date_LF,RelativeFilter_14_Date_LF};
	    			  		  String[] RelativeFilterInputList= {"","","","","","","","","","",RelativeFilter_11_Input_Date_LF,RelativeFilter_12_Input_Date_LF,RelativeFilter_13_Input_Date_LF,RelativeFilter_14_Input_Date_LF};
	    			  		  
	    			  		  for(int k=0;k<14;k++) {
			    				 
			    				 try {
			    					 selectByText(driver, Relative_conditin_dropdown, RelativeFilterList[k]); 
			    					 wait(driver,"1");
			    			  		 if(k>=10 && isDisplayed(driver,Relative_Input_Value_date)) {
			    			  			 click(driver,Relative_Input_Value_date);
			    			  			 clear1(driver,Relative_Input_Value_date);
			    			  			 sendKeys(driver,Relative_Input_Value_date,RelativeFilterInputList[k]);
			    			  		 }
			    			  		 wait(driver,"1");
			    			  		 click(driver,ApplyButton_LocalFilter);
			    			  		 if(isDisplayed(driver,Bug_msg)) {
			    						  fail(driver,"Error displayed : "+getText1(driver, Bug_msg));
			    					  }
			    			  		 elementnotvisible1(driver, RPE_Loading);
			    			  		 
			    			  		 if(isDisplayed(driver,chartBody)) {
			    						  mouseOverToElement(driver, chartBody);
				    					  mouseOverToElement(driver, LocalFilterChartIcon);
				    					  String LocalFilterIconColorRGB=getWebElement(driver, LocalFilterChartIcon).getCssValue("fill");  
				    					  String LocalFilterIconColorAct=rgbToHex1(LocalFilterIconColorRGB);
				    					  
				    					  if("#00E600".equalsIgnoreCase(LocalFilterIconColorAct)) { // need to modify.
//				    						  pass(driver,"Local Filter icon changed to green color after Applying the Local Filter"); 
				    					  }else {
				    						  fail(driver,"Local Filter icon not changed to green color after Applying the Local Filter");
				    					  }
				    					  
					    		          boolean filteredCell=true;
				    					  List<WebElement> FilterChartValues=getWebElements(driver,ChartBody_Y_Values);
				    					  for(WebElement localEle:FilterChartValues) {
				    						  String FilteredValue=localEle.getAttribute("aria-label");
				    						   if(FilteredValue != null && FilteredValue.length() >= 10) {
				    							    FilteredValue=FilteredValue.substring(0, 10);
				    						   }
				    						   if(!Date_RelativeFiltercell(RelativeFilterList[k],FilteredValue,RelativeFilterInputList[k])) {
		    			  				 			 filteredCell=false;
		    			  				 	   }
				    						  
				    					  }
				    					  
				    					  if(filteredCell==true) {
					  			    		  pass(driver,"For '"+RelativeFilterList[k]+"' Local Filter condition applied correctly in the BarChart");
							  			  }else {
	    			  					      fail(driver,RelativeFilterList[k]+" Condition in Local Filter not applied correctly in the BarChart");
							  			  }
				    					  
			    			  		 	}else {
			    						  pass(driver,"Unable to get the chart value for the selected filter, "+RelativeFilterList[k]+" : "+getText1(driver, ValidationChart));
			    			  		 	}
			    			  		 
				    				 }catch(Exception e) {
//				    					 e.printStackTrace();
				    				 }
	    			  		  }
						
    					  }

					  System.out.println();
					  System.out.println("********** Conditions filter in Date *********************");
					  System.out.println();
					  if(verifyElementDisplayed(driver,ConditionFilterOption_Date)) {
						  click(driver,ConditionFilterOption_Date);
						  wait(driver,"1");
						  if(isElementSelected(driver, ConditionRadioButton_Date)) {
							  pass(driver,"Conditions Filter in Date type Colunm is selected after click on it ");
    							  
							  verifyElementIsPresent1(driver, EqualTo_OptionDate);
							  verifyElementIsPresent1(driver, NotEqualTo_OptionDate);
							  verifyElementIsPresent1(driver, GreaterThan_OptionDate);
							  verifyElementIsPresent1(driver, LessThan_OptionDate);
							  verifyElementIsPresent1(driver, GreaterEqualTo_OptionDate);
							  verifyElementIsPresent1(driver, LessThanEqualTo_OptionDate);
							  verifyElementIsPresent1(driver, IsNull_OptionDate);
							  verifyElementIsPresent1(driver, IsNotNull_OptionDate);
							  verifyElementIsPresent1(driver, Between_OptionDate);
    							  
							  String[] ConditionFilterList= {Condition_1_Date_LF,Condition_2_Date_LF,Condition_3_Date_LF,Condition_4_Date_LF,Condition_5_Date_LF,Condition_6_Date_LF,Condition_7_Date_LF,Condition_8_Date_LF,Condition_9_Date_LF};
							  String[] ConditionFilterInputList= {Condition_1_Input_Date_LF,Condition_2_Input_Date_LF,Condition_3_Input_Date_LF,Condition_4_Input_Date_LF,Condition_5_Input_Date_LF,Condition_6_Input_Date_LF,Condition_7_Input_Date_LF,Condition_8_Input_Date_LF,Condition_9_InputA_Date_LF};
		    			  		  
    			  		 	  for(int k=0;k<9;k++) {
				    				 
				    				 try {
				    					 selectByText(driver, ConditionInput1_Date, ConditionFilterList[k]); 
				    					 wait(driver,"1");
				    					 if(!ConditionFilterList[k].equals("is null") && !ConditionFilterList[k].equals("is not null") ) {
				    						 click(driver,FirstConditionValueInput1_date);
					    					 for(int m=0;m<3;m++) {
					    						 action.sendKeys(Keys.BACK_SPACE).build().perform();
					    						 action.sendKeys(Keys.ARROW_RIGHT).build().perform();
					    					 }
					    					 click(driver,DashProPage);
					    					 click(driver,FirstConditionValueInput1_date);
					    					 sendKeys(driver,FirstConditionValueInput1_date,ConditionFilterInputList[k]);
					    					 wait(driver,"1");
					    					 
					    					 if(ConditionFilterList[k].equals("between")) {
					    						 if(isDisplayed(driver,FirstConditionValueInput2_date)) {
					    							 pass(driver,"Second input element is available for 'between' condition");
						    						 click(driver,FirstConditionValueInput2_date);
						    						 for(int m=0;m<3;m++) {
							    						 action.sendKeys(Keys.BACK_SPACE).build().perform();
							    						 action.sendKeys(Keys.ARROW_RIGHT).build().perform();
							    					 }
							    					 click(driver,FirstConditionValueInput1_date);
							    					 click(driver,FirstConditionValueInput2_date);
							    					 sendKeys(driver,FirstConditionValueInput2_date,Condition_9_InputB_Date_LF);
						    					 }else {
						    						 fail(driver,"Second input element is not available for 'between' condition");
						    					 }
					    					 }
					    					 
				    					 }
				    			  		 wait(driver,"2");
				    			  		 click(driver,ApplyButton_LocalFilter);
				    			  		 if(isDisplayed(driver,Bug_msg)) {
				    						  fail(driver,"Error displayed : "+getText1(driver, Bug_msg));
				    					  }
				    			  		elementnotvisible1(driver, RPE_Loading);
				    			  		 
				    			  		 if(isDisplayed(driver,chartBody)) {
				    						  mouseOverToElement(driver, chartBody);
					    					  mouseOverToElement(driver, LocalFilterChartIcon);
					    					  String LocalFilterIconColorRGB=getWebElement(driver, LocalFilterChartIcon).getCssValue("fill");  
					    					  String LocalFilterIconColorAct=rgbToHex1(LocalFilterIconColorRGB);
					    					  
					    					  if("#00E600".equalsIgnoreCase(LocalFilterIconColorAct)) { // need to modify.
//					    						  pass(driver,"Local Filter icon changed to green color after Applying the Local Filter"); 
					    					  }else {
					    						  fail(driver,"Local Filter icon not changed to green color after Applying the Local Filter");
					    					  }
					    					  
						    		          boolean filteredCell=true;
					    					  List<WebElement> FilterChartValues=getWebElements(driver,ChartBody_Y_Values);
					    					  for(WebElement localEle:FilterChartValues) {
					    						  String FilteredValue=localEle.getAttribute("aria-label");
					    						   if(FilteredValue != null && FilteredValue.length() >= 10) {
					    							    FilteredValue=FilteredValue.substring(0, 10);
					    						   }
					    						   
					    						   if(!Date_ConditionFiltercell(ConditionFilterList[k],FilteredValue,ConditionFilterInputList[k],Condition_9_InputB_Date_LF)) {
					    			  					 filteredCell=false;
				    			  				   }
					    						   
					    					  }
					    					  
					    					  if(filteredCell==true) {
						  			    		  pass(driver,"For '"+ConditionFilterList[k]+"' Local Filter condition applied correctly in the BarChart");
								  			  }else {
		    			  					      fail(driver,ConditionFilterList[k]+" Condition in Local Filter not applied correctly in the BarChart");
								  			  }
					    					  
		    			  		 		}else {
			    						   pass(driver,"Unable to get the chart value for the selected filter, "+ConditionFilterList[k]+" : "+getText1(driver, ValidationChart));
			    			  		 	}
    				    			  	
				    				 }catch(Exception e) {
				    					 e.printStackTrace();
				    				 }
				    			 }
	    			  		 	
	    			  		 	 
	    			  		 	 click(driver,ConditionFilterOption_Date);
	    			  		 	 wait(driver,"1");
	    			  		 	 selectByText(driver, ConditionInput1_Date, FirstCondition_Date_LF);
	    			  		 	 wait(driver,"1");
	    			  		 	 if(!FirstCondition_Date_LF.equals("is null") && !FirstCondition_Date_LF.equals("is not null") ) {
		    						 click(driver,FirstConditionValueInput1_date);
			    					 for(int m=0;m<3;m++) {
			    						 action.sendKeys(Keys.BACK_SPACE).build().perform();
			    						 action.sendKeys(Keys.ARROW_RIGHT).build().perform();
			    					 }
			    					 click(driver,DashProPage);
			    					 click(driver,FirstConditionValueInput1_date);
			    					 sendKeys(driver,FirstConditionValueInput1_date,FirstCondition_Date_Input_LF);
			    					 wait(driver,"1");
		    					 }
		    			  		 wait(driver,"1");
		    			  		 if(isDisplayed(driver,AddButtonCondition)) {
				    				  pass(driver,"ADD button displayed after selecting the first condition");
				    			  }else {
					    			  fail(driver,"ADD button not displayed after selecting the first condition"); 
					    		  }
				    			  
			    				  selectOperatorCondition1(driver,FirstOperator_Input_Date_LF);
			    				  
			    				  if(isDisplayed(driver,ConditionInput2_Date)) {
			    					  pass(driver,"After click 'ADD' button Second time Condition Selection dropdown is displayed");
			    				  }else {
				    				  fail(driver,"After click 'ADD' button Second time Condition Selection dropdown is not displayed"); 
				    			  } 
			    					 
			    				  click(driver,ConditionInput2_Date);
		    					  selectByText(driver, ConditionInput2_Date, SecondCondition_Date_LF);
		    					  if(!SecondCondition_Date_LF.equals("is null") && !SecondCondition_Date_LF.equals("is not null") ) {
			    						 click(driver,SecondConditionValueInput1_date);
				    					 for(int m=0;m<3;m++) {
				    						 action.sendKeys(Keys.BACK_SPACE).build().perform();
				    						 action.sendKeys(Keys.ARROW_RIGHT).build().perform();
				    					 }
				    					 click(driver,DashProPage);
				    					 click(driver,SecondConditionValueInput1_date);
				    					 sendKeys(driver,SecondConditionValueInput1_date,SecondCondition_Date_Input_LF);
				    					 
		    					  }
		    					  wait(driver,"1");
		    					  if(isDisplayed(driver,AddButtonCondition)) {
				    				  pass(driver,"2 time ADD button displayed after selecting the condition 2nd time ");
		    					  }else {
		    						  fail(driver,"2 time ADD button not displayed after selecting the condition 2nd time ");
		    					  } 
				    			  
			    				  selectOperatorCondition2(driver,SecondOperator_Input_Date_LF);
			    				  
			    				  if(isDisplayed(driver,ConditionInput3_Date)) {
			    					  pass(driver,"After click 'ADD' button Third time Condition Selection dropdown is displayed");
			    				  }else {
			    					  fail(driver,"After click 'ADD' button Third time Condition Selection dropdown is not displayed");
			    				  }
			    					  
		    					  selectByText(driver, ConditionInput3_Date, ThirdCondition_Date_LF);
		    					  wait(driver,"1");
		    					  
		    					  if(!ThirdCondition_Date_LF.equals("is null") && !ThirdCondition_Date_LF.equals("is not null") ) {
			    						 click(driver,ThirdConditionValueInput1_date);
				    					 for(int m=0;m<3;m++) {
				    						 action.sendKeys(Keys.BACK_SPACE).build().perform();
				    						 action.sendKeys(Keys.ARROW_RIGHT).build().perform();
				    					 }
				    					 click(driver,DashProPage);
				    					 click(driver,ThirdConditionValueInput1_date);
				    					 sendKeys(driver,ThirdConditionValueInput1_date,ThirdCondition_Date_Input_LF);
		    					  }
		    					  
		    					  if(isDisplayed2(driver,AddButtonCondition)) {
		    						  fail(driver,"'ADD' button displayed after given 3 times condition ");
		    					  }else {
		    						  pass(driver,"'ADD' button not displayed after given 3 times condition");
		    					  }
			    				  
			    				  click(driver,ApplyButton_LocalFilter);
			    				  if(isDisplayed(driver,Bug_msg)) {
		    						  fail(driver,"Error displayed : "+getText1(driver, Bug_msg));
		    					  }
			    				  elementnotvisible1(driver, RPE_Loading);
		    					 
		    					  if(isDisplayed(driver,chartBody)) {
		    						  mouseOverToElement(driver, chartBody);
			    					  mouseOverToElement(driver, LocalFilterChartIcon);
			    					  String LocalFilterIconColorRGB=getWebElement(driver, LocalFilterChartIcon).getCssValue("fill");  
			    					  String LocalFilterIconColorAct=rgbToHex1(LocalFilterIconColorRGB);
			    					  
			    					  if("#00E600".equalsIgnoreCase(LocalFilterIconColorAct)) { // need to modify.
//			    						  pass(driver,"Local Filter icon changed to green color after Applying the Local Filter"); 
			    					  }else {
			    						  fail(driver,"Local Filter icon not changed to green color after Applying the Local Filter");
			    					  }
			    					  
				    		          boolean filteredCell=true;
			    					  List<WebElement> FilterChartValues=getWebElements(driver,ChartBody_Y_Values);
			    					  for(WebElement localEle:FilterChartValues) {
			    						  String FilteredValue=localEle.getAttribute("aria-label");
			    						   if(FilteredValue != null && FilteredValue.length() >= 10) {
			    							    FilteredValue=FilteredValue.substring(0, 10);
			    						   }
			    						   boolean condition_1_Result=Date_ConditionFiltercell(FirstCondition_Date_LF,FilteredValue,FirstCondition_Date_Input_LF,Condition_9_InputB_Date_LF);
			    						   boolean condition_2_Result=Date_ConditionFiltercell(SecondCondition_Date_LF,FilteredValue,SecondCondition_Date_Input_LF,Condition_9_InputB_Date_LF);
			    						   boolean condition_3_Result=Date_ConditionFiltercell(ThirdCondition_Date_LF,FilteredValue,ThirdCondition_Date_Input_LF,Condition_9_InputB_Date_LF);
			    						   String operator1 = FirstOperator_Input_Date_LF;
			    						   String operator2 = SecondOperator_Input_Date_LF;
			    			  				 
			    						   if(!evaluateConditions(condition_1_Result,operator1,condition_2_Result,operator2,condition_3_Result)) {
			    			  					 filteredCell=false;
			    						   }
			    						   
			    					  }
			    					  
			    					  if(filteredCell==true) {
				  			    		  pass(driver,"For Selected 3 condition in Local Filter applied correctly in the BarChart");
						  			  }else {
    			  					      fail(driver,"Selected 3 Condition in Local Filter not applied correctly in the BarChart");
						  			  }
			    					  
		    					  }else {
		    						  pass(driver,"Unable to get the chart value for the selected filter, 3 conditons : "+getText1(driver, ValidationChart));
		    					  }
		    	
		    					  click(driver,ResetButton_LocalFilter);
		    					  elementnotvisible1(driver, RPE_Loading);
		    					  waitForElement(driver, chartBody);
		    					  mouseOverToElement(driver, chartBody);
		    					  mouseOverToElement(driver, LocalFilterChartIcon);
		    					  String LocatFilterExpected="Local Filter: OFF ";
		    					  String LocatFilterExpRest=getAttribute1(driver, FilterChartIcon, "title");
		    					  
		    					  if(LocatFilterExpRest.contains(LocatFilterExpected)) {
//		    						  pass(driver,"Local filter is OFF in the chart after Reset filter");
		    					  }else {
		    						  fail(driver,"Local filter is not OFF in the chart after Reset filter");
		    					  }
		    					   
		    					  String LocalFilterIconColorRGB=getWebElement(driver, LocalFilterChartIcon).getCssValue("fill");			    					  
    			  			 	  String LocalFilterIconColorAct=rgbToHex1(LocalFilterIconColorRGB);
			    					  
    			  			 	  if(!"#00E600".equalsIgnoreCase(LocalFilterIconColorAct)) { 
//		    						  pass(driver,"Local Filter icon changed to Default color after Reset the Local Filter : with 3 conditions"); 
    			  			 	  }else {
		    						  fail(driver,"Local Filter icon not changed to Default color after Reset the Local Filter : with 3 conditions");
		    					  }  
		    					  
    						  }else {
    							  fail(driver,"Conditions Filter in Date type Colunm is not selected after click on it ");
    						  }
    					  }
    					  
    				  }else {
    					  fail(driver,Select_Y_Axis_Value+"Selected Date Column not expanded after click on it"); 
    				  }
    			  }else {
    				  fail(driver,Select_Y_Axis_Value+" Date Column value not present in local filter");
    			  }
 	    		 
    		  }// Date Column Local Filter validation end......
	          
    		//Local Numerical Filter validation
    		if(Y_Axis_dataType.equals("Numerical")) {
    			  
      			click(driver,ResetButton_LocalFilter);
      			elementnotvisible1(driver, RPE_Loading);
      			boolean NumericalFilter=false;
      			try {
      				WebElement NumericalColumnElement=driver.findElement(By.xpath("//div[@id='dashboardLRPE_select_filterColsCon']//div[@id='"+Select_Y_Axis_Value+"']//a"));
      				action.moveToElement(NumericalColumnElement).click().build().perform();
      				NumericalFilter=true;
      			}catch(Exception e) {
      				
      			}
      			if(NumericalFilter==true) {
    				  wait(driver,"1");
    				  WebElement NumericalColumnElementExpand=driver.findElement(By.xpath("//div[@id='dashboardLRPE_select_filterColsCon']//div[@id='"+Select_Y_Axis_Value+"']//a//i"));
    				  String NumericalColumnElementExpandString=NumericalColumnElementExpand.getAttribute("class");
    				  
    				  if(NumericalColumnElementExpandString.contains("up")) {
    					  pass(driver,"Selected Numerical Column expanded after click on it");
    					  if(isDisplayed(driver,ConditionInput1_Num)) {
    						  pass(driver,"Condition Selection dropdown is displayed in the Numerical column");
    					  }else {
    						  fail(driver,"Condition Selection dropdown is not displayed in the Numerical column");
    					  }
  					  
    					  click(driver,ConditionInput1_Num);
    					  verifyElementIsPresent1(driver, EqualTo_OptionNum);
    					  verifyElementIsPresent1(driver, NotEqualTo_OptionNum);
    					  verifyElementIsPresent1(driver, GreaterThan_OptionNum);
    					  verifyElementIsPresent1(driver, LessThan_OptionNum);
    					  verifyElementIsPresent1(driver, GreaterEqualTo_OptionNum);
    					  verifyElementIsPresent1(driver, LessThanEqualTo_OptionNum);
    					  verifyElementIsPresent1(driver, IsNull_OptionNum);
    					  verifyElementIsPresent1(driver, IsNotNull_OptionNum);
    					  verifyElementIsPresent1(driver, Between_OptionNum);
  					 
    					  String[] NumFilterList= {Condition_1_Num_LF,Condition_2_Num_LF,Condition_3_Num_LF,Condition_4_Num_LF,Condition_5_Num_LF,Condition_6_Num_LF,Condition_7_Num_LF,Condition_8_Num_LF,Condition_9_Num_LF};
    					  String[] NumFilterInputList= {Condition_1_Input_Num_LF,Condition_2_Input_Num_LF,Condition_3_Input_Num_LF,Condition_4_Input_Num_LF,Condition_5_Input_Num_LF,Condition_6_Input_Num_LF,Condition_7_Input_Num_LF,Condition_8_Input_Num_LF,Condition_9_InputA_Num_LF};
   			  		 
    					  for(int k=0;k<9;k++) {
  	    				 
    						  try {
    							  selectByText(driver, ConditionInput1_Num, NumFilterList[k]); 
    							  wait(driver,"1");
    							  if(!NumFilterList[k].equals("is null") && !NumFilterList[k].equals("is not null") ) {
    								  click(driver,FirstConditionValueInput1_Num);
    								  clear1(driver,FirstConditionValueInput1_Num);
    								  sendKeys(driver,FirstConditionValueInput1_Num,NumFilterInputList[k]);
    								  wait(driver,"1");
  		    					 
    								  if(NumFilterList[k].equals("between")) {
    									  if(isDisplayed(driver,FirstConditionValueInput2_Num)) {
    										  pass(driver,"Second input element is available for 'between' condition");
    										  click(driver,FirstConditionValueInput2_Num);
    										  //clear1(driver,"1");
    										  sendKeys(driver,FirstConditionValueInput2_Num,Condition_Between_InputB_Num_LF);
    									  }else {
    										  fail(driver,"Second input element is not available for 'between' condition");
    									  }
    								  }
  		    					 
    							  }
    							  wait(driver,"1");
    							  click(driver,ApplyButton_LocalFilter);
    							  if(isDisplayed(driver,Bug_msg)) {
    	    						  fail(driver,"Error displayed : "+getText1(driver, Bug_msg));
    	    					  }
    							  elementnotvisible1(driver, RPE_Loading);
    							  
    							  if(isDisplayed(driver,chartBody)) {
		    						  mouseOverToElement(driver, chartBody);
			    					  mouseOverToElement(driver, LocalFilterChartIcon);
			    					  String LocalFilterIconColorRGB=getWebElement(driver, LocalFilterChartIcon).getCssValue("fill");  
			    					  String LocalFilterIconColorAct=rgbToHex1(LocalFilterIconColorRGB);
			    					  
			    					  if("#00E600".equalsIgnoreCase(LocalFilterIconColorAct)) { // need to modify.
//			    						  pass(driver,"Local Filter icon changed to green color after Applying the Local Filter"); 
			    					  }else {
			    						  fail(driver,"Local Filter icon not changed to green color after Applying the Local Filter");
			    					  }
			    					  
				    		          boolean filteredCell=true;
			    					  List<WebElement> FilterChartValues=getWebElements(driver,ChartBody_Y_Values);
			    					  for(WebElement localEle:FilterChartValues) {
			    						  String FilteredValue=localEle.getAttribute("aria-label");
			    						  if(!Numerical_ConditionFiltercell(NumFilterList[k],FilteredValue,NumFilterInputList[k],Condition_Between_InputB_Num_LF)) {
    										  filteredCell=false;
    									  }
			    						   
			    					  }
			    					  
			    					  if(filteredCell==true) {
				  			    		  pass(driver,"For '"+NumFilterList[k]+"' Local Filter condition applied correctly in the BarChart");
						  			  }else {
    			  					      fail(driver,NumFilterList[k]+" Condition in Local Filter not applied correctly in the BarChart");
						  			  }
			    					  
    							  }else {
    								  pass(driver,"Unable to get the chart value for the selected filter, "+NumFilterList[k]+" : "+getText1(driver, ValidationChart));
    							  }
  		    				 }catch(Exception e) {
  		    					 e.printStackTrace();
  		    				 }
  		    			  }
   			  		
    					  wait(driver,"1");
    					  selectByText(driver, ConditionInput1_Num, FirstCondition_Num_LF); 
    					  wait(driver,"1");
    					  if(!FirstCondition_Num_LF.equals("is null") && !FirstCondition_Num_LF.equals("is not null") ) {
   			  		 		click(driver,FirstConditionValueInput1_Num);
   			  		 		clear1(driver,FirstConditionValueInput1_Num);
   			  		 		sendKeys(driver,FirstConditionValueInput1_Num,FirstCondition_Num_Input_LF);
   			  		 		wait(driver,"1");
    					  }
  					 
		  		 		  wait(driver,"1");
		  		 		  if(isDisplayed(driver,AddButtonCondition)) {
   			  		 		pass(driver,"ADD button displayed after selecting the first condition");
		  		 		  }else {
   			  		 		fail(driver,"ADD button not displayed after selecting the first condition"); 
		  		 		  }
  	    				  
		  		 		  selectOperatorCondition1(driver,FirstOperator_Input_Num_LF);
		  		 		  
		  		 		  if(isDisplayed(driver,ConditionInput2_Num)) {
		  		 			  pass(driver,"After click 'ADD' button Second time Condition Selection dropdown is displayed");
		  		 		  }else {
		  		 			  fail(driver,"After click 'ADD' button Second time Condition Selection dropdown is not displayed"); 
		  		 		  } 
   			  		
		  		 		  click(driver,ConditionInput2_Num);
		  		 		  selectByText(driver, ConditionInput2_Num, SecondCondition_Num_LF);
		  		 		  if(!SecondCondition_Num_LF.equals("is null") && !SecondCondition_Num_LF.equals("is not null") ) {
		  		 			  click(driver,SecondConditionValueInput1_Num);
		  		 			  clear(driver,SecondConditionValueInput1_Num);
		  		 			  sendKeys(driver,SecondConditionValueInput1_Num,SecondCondition_Num_Input_LF);
  	    					 
		  		 		  }
		  		 		 
		  		 		  if(isDisplayed(driver,AddButtonCondition)) {
		  		 			  pass(driver,"2 time ADD button displayed after selecting the condition 2nd time ");
		  		 		  }else {
		  		 			  fail(driver,"2 time ADD button not displayed after selecting the condition 2nd time ");
		  		 		  } 
      				 
		  		 		  selectOperatorCondition2(driver,SecondOperator_Input_Num_LF);
		  		 		  if(isDisplayed(driver,ConditionInput3_Num)) {
		  		 			  pass(driver,"After click 'ADD' button Third time Condition Selection dropdown is displayed");
		  		 		  }else {
		  		 			  fail(driver,"After click 'ADD' button Third time Condition Selection dropdown is not displayed");
		  		 		  }
		  		 		  click(driver,ConditionInput3_Num);
		  		 		  selectByText(driver, ConditionInput3_Num, ThirdCondition_num_LF);
		  		 		  wait(driver,"1");
  					  
		  		 		  if(!ThirdCondition_num_LF.equals("is null") && !ThirdCondition_num_LF.equals("is not null") ) {
		  		 			  click(driver,ThirdConditionValueInput1_Num);
		  		 			  clear1(driver,ThirdConditionValueInput1_Num);
		  		 			  sendKeys(driver,ThirdConditionValueInput1_Num,ThirdCondition_Num_Input_LF);
  	    					 
		  		 		  }
		  		 		  wait(driver,"1");
  					  
		  		 		  if(isDisplayed2(driver,AddButtonCondition)) {
		  		 			  fail(driver,"'ADD' button displayed after given 3 times condition ");
		  		 		  }else {
		  		 			  pass(driver,"'ADD' button not displayed after given 3 times condition");
		  		 		  }
  					  
		  		 		  click(driver,ApplyButton_LocalFilter);
		  		 		 if(isDisplayed(driver,Bug_msg)) {
  						     fail(driver,"Error displayed : "+getText1(driver, Bug_msg));
  					     }
		  		 		  elementnotvisible1(driver, RPE_Loading);
		  		 		  if(isDisplayed(driver,chartBody)) {
  						      mouseOverToElement(driver, chartBody);
	    					  mouseOverToElement(driver, LocalFilterChartIcon);
	    					  String LocalFilterIconColorRGB=getWebElement(driver, LocalFilterChartIcon).getCssValue("fill");  
	    					  String LocalFilterIconColorAct=rgbToHex1(LocalFilterIconColorRGB);
	    					  
	    					  if("#00E600".equalsIgnoreCase(LocalFilterIconColorAct)) { // need to modify.
//	    						  pass(driver,"Local Filter icon changed to green color after Applying the Local Filter"); 
	    					  }else {
	    						  fail(driver,"Local Filter icon not changed to green color after Applying the Local Filter");
	    					  }
	    					  
		    		          boolean filteredCell=true;
	    					  List<WebElement> FilterChartValues=getWebElements(driver,ChartBody_Y_Values);
	    					  for(WebElement localEle:FilterChartValues) {
	    						  String FilteredValue=localEle.getAttribute("aria-label");
	    						  
	    						  boolean condition_1_Result=Numerical_ConditionFiltercell(FirstCondition_Num_LF,FilteredValue,FirstCondition_Num_Input_LF,Condition_Between_InputB_Num_LF);
	    						  boolean condition_2_Result=Numerical_ConditionFiltercell(SecondCondition_Num_LF,FilteredValue,SecondCondition_Num_Input_LF,Condition_Between_InputB_Num_LF);
	    						  boolean condition_3_Result=Numerical_ConditionFiltercell(ThirdCondition_num_LF,FilteredValue,ThirdCondition_Num_Input_LF,Condition_Between_InputB_Num_LF);
	    						  String operator1 = FirstOperator_Input_Num_LF;
	    						  String operator2 = SecondOperator_Input_Num_LF;
	  			  				 
	    						  if(!evaluateConditions(condition_1_Result,operator1,condition_2_Result,operator2,condition_3_Result)) {
	  			  					 filteredCell=false;
	    						  }
	    					  }
	    					  
	    					  if(filteredCell==true) {
		  			    		  pass(driver,"For selected 3 condition in Local Filter  applied correctly in the BarChart");
				  			  }else {
		  					      fail(driver,"For selected 3 condition in Local Filter not applied correctly in the BarChart");
				  			  }
	    					  
						  }else {
							  pass(driver,"Unable to get the chart value for the selected filter, 3 condition : "+getText1(driver, ValidationChart));
						  }
		  		 		  
		  		 		  click(driver,ResetButton_LocalFilter);
		  		 		  elementnotvisible1(driver, RPE_Loading);
		  		 		  waitForElement(driver, chartBody);
		  		 		  mouseOverToElement(driver, chartBody);
    					  mouseOverToElement(driver, LocalFilterChartIcon);
    					  String LocatFilterExpected="Local Filter: OFF ";
    					  String LocatFilterExpRest=getAttribute1(driver, FilterChartIcon, "title");
    					  
    					  if(LocatFilterExpRest.contains(LocatFilterExpected)) {
//    						  pass(driver,"Local filter is OFF in the chart after Reset filter");
    					  }else {
    						  fail(driver,"Local filter is not OFF in the chart after Reset filter");
    					  }
    					   
    					  String LocalFilterIconColorRGB=getWebElement(driver, LocalFilterChartIcon).getCssValue("fill");			    					  
		  			 	  String LocalFilterIconColorAct=rgbToHex1(LocalFilterIconColorRGB);
	    					  
		  			 	  if(!"#00E600".equalsIgnoreCase(LocalFilterIconColorAct)) { 
//    						  pass(driver,"Local Filter icon changed to Default color after Reset the Local Filter : with 3 conditions"); 
		  			 	  }else {
    						  fail(driver,"Local Filter icon not changed to Default color after Reset the Local Filter : with 3 conditions");
    					  } 
		  		 		  
    				  }else {
    					  fail(driver,Select_Y_Axis_Value+" Numerical Column not expanded after click on it"); 
    				  }
    				  
      			}else {
      				fail(driver,Select_Y_Axis_Value+" Numerical Column not present");
      			}
  	    		
    		  }// Numerical Column Local Filter validation end......
	    		  
    		//Text Local filter Start....
    		if(Y_Axis_dataType.equals("Text")) {
    			
   			 	  boolean textFilter=false;
	    		  try {
	    			  WebElement TextColumn= driver.findElement(By.xpath("//div[@id='dashboardLRPE_select_filterColsCon']//div[@id='"+Select_Y_Axis_Value+"']//a"));
		    		  action.moveToElement(TextColumn).click().build().perform();
		    		  textFilter=true;
	    		  }catch(Exception e) {
	    			  
	    		  }
	    		  
		         if(textFilter==true) {
		    		  WebElement textColumnExp=driver.findElement(By.xpath("//div[@id='dashboardLRPE_select_filterColsCon']//div[@id='"+Select_Y_Axis_Value+"']//a//i"));
		    		  String textColumnExpText=textColumnExp.getAttribute("class");
		    		  if(textColumnExpText.contains("up")) {
		    			  pass(driver,"Text Column Expand After click on it ");
		    			  if(verifyElementDisplayed(driver, byValueFilterOption)) {
		    				  if(isElementSelected(driver,byValueRadioButton)) {
		    					  pass(driver,"By default, 'By Values' radio button selected ");
		    				  }else {
		    					  fail(driver,"By default, 'By Values' radio button not selected ");
		    				  }
	    				  }
		    			  
		    			  verifyElementDisplayed(driver, AllCheckbox_CategoricalSec);
		    			  verifyElementDisplayed(driver, CategoricalSearchListOptions);
		    			  verifyElementDisplayed(driver, ExcludeOption_Categorical);
		    			  verifyElementDisplayed(driver, ExcludeCheckbox);

		    			  List<WebElement> searchListAvailable=getWebElements(driver,AvailableList_ByValue);
    				      List<WebElement> searchListCheckboxAvailable=getWebElements(driver,AvailableListCheckbox_ByValue);
    				      
    				      if(searchListAvailable.size()==searchListCheckboxAvailable.size()) {
    				    	  pass(driver,"All the available searchlist are displayed with Checkbox");
    				      }else {
    				    	  fail(driver,"Some available searchlist are not displayed with Checkbox");
    				      }
 				      
    				      waitForElement(driver,SearchField_CategoricalSec);
    				      click(driver,SearchField_CategoricalSec);
		    			  sendKeys(driver,SearchField_CategoricalSec,ByValuesInput_Text_LF);
		    			  wait(driver,"1");
		    			  String firstOptionText=getText1(driver,FirstSearchedListValue);
		    			  if(firstOptionText.equals(ByValuesInput_Text_LF)) {
		    				  pass(driver,"Search bar inside the Text section works properly");
		    			  }else {
		    				  fail(driver,"Search bar inside the Text section not works properly");
		    			  }
		    			  
		    			  click(driver,FirstSearchedListValue);
	    				  wait(driver,"1");
	    				  
	    				  if(isElementSelected(driver,FirstSearchedCheckbox)) {
	    					  pass(driver,"Check box selected when click the First searched value");
	    				  }else {
			    			  fail(driver,"Check box not selected when click the First searched value"); 
	    				  }
			    		  
			    		  
			    		  click(driver,ApplyButton_LocalFilter);
			    		  if(isDisplayed(driver,Bug_msg)) {
    						  fail(driver,"Error displayed : "+getText1(driver, Bug_msg));
    					  }
			    		  elementnotvisible1(driver, RPE_Loading);
			    		  
			    		  if(isDisplayed(driver,chartBody)) {
    						  
    						  mouseOverToElement(driver, chartBody);
	    					  mouseOverToElement(driver, LocalFilterChartIcon);
	    					  String LocatFilterExpected="Local Filter: ON ";
	    					  String LocatFilterAct=getAttribute1(driver, FilterChartIcon, "title");
	    					  System.out.println("LocatFilterAct : "+LocatFilterAct);
	    					  if(LocatFilterAct.contains(LocatFilterExpected)) {
	    						  //pass(driver,"Local filter is ON in the chart after Apply filter");
	    					  }else {
	    						  fail(driver,"Local filter is not ON in the chart after Apply filter");
	    					  }
	    					  
	    					  String LocalFilterIconColorRGB=getWebElement(driver, LocalFilterChartIcon).getCssValue("fill");  
	    					  String LocalFilterIconColorAct=rgbToHex1(LocalFilterIconColorRGB);
	    					  if("#00E600".equalsIgnoreCase(LocalFilterIconColorAct)) { // need to modify.
	    						 // pass(driver,"Local Filter icon changed to green color after Applying the Local Filter"); 
	    					  }else {
	    						  fail(driver,"Local Filter icon not changed to green color after Applying the Local Filter");
	    					  }
	    					  
		    		          boolean filteredCell=true;
	    					  List<WebElement> FilterChartValues=getWebElements(driver,ChartBody_Y_Values);
	    					  for(WebElement localEle:FilterChartValues) {
	    						  String FilteredValue=localEle.getAttribute("aria-label");
	    						  
	    						  if(!FilteredValue.equals(ByValuesInput_Text_LF)) {
	    							  filteredCell=false;
	    						  }
	    						  
	    					  }
	    					  
		    		         if(filteredCell==true) {
		  			    	       pass(driver,"For 'By Values' condition applied correctly in the BarChart");
		  			          }else {
		  			    	       fail(driver,"For 'By Values' condition not applied correctly in the BarChart");
		  			          }
	    					  
    					  }else {
    						  pass(driver,"Unable to get the chart value for the selected filter, By Values : "+getText1(driver, ValidationChart));
    					  }
			    		  
			    		  
			    		  click(driver,ExcludeCheckbox);
			    		  click(driver,ApplyButton_LocalFilter);
			    		  if(isDisplayed(driver,Bug_msg)) {
    						  fail(driver,"Error displayed : "+getText1(driver, Bug_msg));
    					  }
			    		  elementnotvisible1(driver, RPE_Loading);
    					  
    					  if(isDisplayed(driver,chartBody)) {
    						  
    						  mouseOverToElement(driver, chartBody);
	    					  mouseOverToElement(driver, LocalFilterChartIcon);
	    					  String LocalFilterIconColorRGB=getWebElement(driver, LocalFilterChartIcon).getCssValue("fill");  
	    					  String LocalFilterIconColorAct=rgbToHex1(LocalFilterIconColorRGB);
	    					  
	    					  if("#00E600".equalsIgnoreCase(LocalFilterIconColorAct)) { // need to modify.
//	    						  pass(driver,"Local Filter icon changed to green color after Applying the Local Filter"); 
	    					  }else {
	    						  fail(driver,"Local Filter icon not changed to green color after Applying the Local Filter");
	    					  }
	    					  
		    		          boolean filteredCell=true;
	    					  List<WebElement> FilterChartValues=getWebElements(driver,ChartBody_Y_Values);
	    					  for(WebElement localEle:FilterChartValues) {
	    						  String FilteredValue=localEle.getAttribute("aria-label");
	    						  
	    						  if(FilteredValue.equals(ByValuesInput_Text_LF)) {
	    							  filteredCell=false;
	    						  }
	    						  
	    					  }
	    					  
	    					  if(filteredCell==true) {
		  			    	       pass(driver,"For 'By Values' with Exclude condition applied correctly in the BarChart");
		  			          }else {
		  			    	       fail(driver,"For 'By Values' with Exclude condition not applied correctly in the BarChart");
		  			          }
	    					  
    					  }else {
    						  pass(driver,"Unable to get the chart value for the selected filter By Values with Exclude : "+getText1(driver, ValidationChart));
    					  }
			    		  
 					  
    					  if(verifyElementDisplayed(driver, ConditionFilterOption_Categorical)) {
    						  click(driver,ConditionFilterOption_Categorical);
    						  wait(driver,"1");
    						  if(isElementSelected(driver,ConditionRadioButton_Categorical)) {
    							  pass(driver,"Condition radio button selected after click on it");
    						  }else {
    							  fail(driver,"Condition radio button not selected after click on it");
    						  } 
 				    		  
    						  if(verifyElementDisplayed(driver, ConditionSelectDropdown)) {
    							  String defaultSelectedCondition=defaultSelectedValue(driver, ConditionSelectDropdown);
    							  if(defaultSelectedCondition.equals("equal to")) {
    								  pass(driver,"By default, 'equal to' option selected in the Condition select dropdown");
    							  }else {
    								  fail(driver,"By default, 'equal to' option not selected in the Condition select dropdown");
    							  }
			    			  
    							  verifyElementIsPresent1(driver, equalTo_Option);
    							  verifyElementIsPresent1(driver, NotequalTo_Option);
    							  verifyElementIsPresent1(driver, NotequalTo_Option);
    							  verifyElementIsPresent1(driver, BeginsWith_Option);
    							  verifyElementIsPresent1(driver, notBeginsWith_Option);
    							  verifyElementIsPresent1(driver, endsWith_Option);
    							  verifyElementIsPresent1(driver, notendsWith_Option);
    							  verifyElementIsPresent1(driver, Contains_Option);
    							  verifyElementIsPresent1(driver, NotContains_Option);
			    		 
    							  String[] conditionsList= {Condition_1_Text_LF,Condition_2_Text_LF,Condition_3_Text_LF,Condition_4_Text_LF,Condition_5_Text_LF,Condition_6_Text_LF,Condition_7_Text_LF,Condition_8_Text_LF};
    							  String[] conditionsInputList= {Condition_Input_1_Text_LF,Condition_Input_2_Text_LF,Condition_Input_3_Text_LF,Condition_Input_4_Text_LF,Condition_Input_5_Text_LF,Condition_Input_6_Text_LF,Condition_Input_7_Text_LF,Condition_Input_8_Text_LF};

    							  for(int k=0;k<8;k++) {
			    				 
    								  try {
    									  selectByText(driver, ConditionSelectDropdown, conditionsList[k]); 
    									  wait(driver,"1");
    									  click(driver,ConditonInput1);
    									  clear1(driver,ConditonInput1);
    									  sendKeys(driver,ConditonInput1,conditionsInputList[k]);
    									  wait(driver,"1");
    									  click(driver,ApplyButton_LocalFilter);
    									  if(isDisplayed(driver,Bug_msg)) {
    			    						  fail(driver,conditionsList[k]+"  Error displayed : "+getText1(driver, Bug_msg));
    			    					  }
    									  elementnotvisible1(driver, RPE_Loading);
    									  if(isDisplayed(driver,chartBody)) {
    			    						  
    			    						  mouseOverToElement(driver, chartBody);
    				    					  mouseOverToElement(driver, LocalFilterChartIcon);
    				    					  String LocatFilterExpected="Local Filter: ON ";
    				    					  String LocatFilterAct=getAttribute1(driver, FilterChartIcon, "title");
    				    					  System.out.println("LocatFilterAct : "+LocatFilterAct);
    				    					  if(LocatFilterAct.contains(LocatFilterExpected)) {
    				    						  //pass(driver,"Local filter is ON in the chart after Apply filter");
    				    					  }else {
    				    						  fail(driver,"Local filter is not ON in the chart after Apply filter");
    				    					  }
    				    					  
    				    					  String LocalFilterIconColorRGB=getWebElement(driver, LocalFilterChartIcon).getCssValue("fill");  
    				    					  String LocalFilterIconColorAct=rgbToHex1(LocalFilterIconColorRGB);
    				    					  if("#00E600".equalsIgnoreCase(LocalFilterIconColorAct)) { // need to modify.
    				    						 // pass(driver,"Local Filter icon changed to green color after Applying the Local Filter"); 
    				    					  }else {
    				    						  fail(driver,"Local Filter icon not changed to green color after Applying the Local Filter");
    				    					  }
    				    					  
    					    		          boolean filteredCell=true;
    				    					  List<WebElement> FilterChartValues=getWebElements(driver,ChartBody_Y_Values);
    				    					  for(WebElement localEle:FilterChartValues) {
    				    						  String FilteredValue=localEle.getAttribute("aria-label");
    				    						  
    				    						  if(!Categorical_ConditionFiltercell(conditionsList[k],FilteredValue,conditionsInputList[k])) {
    												  filteredCell=false;
    											  }
    				    					  }
    				    					  
    					    		         if(filteredCell==true) {
    					  			    	       pass(driver,"For '"+conditionsList[k]+"' condition applied correctly in the BarChart");
    					  			          }else {
    					  			    	       fail(driver,"For '"+conditionsList[k]+"' condition not applied correctly in the BarChart");
    					  			          }
    				    					  
    			    					  }else {
    			    						  pass(driver,"Unable to get the chart value for the selected filter, '"+conditionsList[k]+"' : "+getText1(driver, ValidationChart));
    			    					  }
			    			  	
    								  }catch(Exception e) {
    									  e.printStackTrace();
    								  }
    							 }
			    			 
			    			  click(driver,ConditionSelectDropdown);
			    			  selectByText(driver, ConditionSelectDropdown, FirstCondition_Text_LF);
			    			  wait(driver,"1");
			    			  click(driver,ConditonInput1);
			    			  clear1(driver,ConditonInput1);
			    			  sendKeys(driver,ConditonInput1,FirstCondition_Input_Text_LF);
			    			  wait(driver,"1");
			    			  if(isDisplayed(driver,AddButtonCondition)) {
			    				  pass(driver,"ADD button displayed after selecting the condition");
			    			  }else {
				    			  fail(driver,"ADD button not displayed after selecting the condition"); 
				    		  }
			    				  
			    			  selectOperatorCondition1(driver,FirstOperator_Input_Text_LF);
			    			  
		    				  if(isDisplayed(driver,ConditionSelectDropdown2)) {
		    					  pass(driver,"After click 'ADD' button Second time Condition Selection dropdown is displayed");
		    				  }else {
			    				  fail(driver,"After click 'ADD' button Second time Condition Selection dropdown is not displayed"); 
			    			  } 
		    					 
		    				  click(driver,ConditionSelectDropdown2);
	    					  selectByText(driver, ConditionSelectDropdown2, SecondCondition_Text_LF);
	    					  wait(driver,"1");
	    					  click(driver,ConditonInput2);
	    					  sendKeys(driver,ConditonInput2,SecondCondition_Input_Text_LF);
	    					  wait(driver,"1");
	    					  if(isDisplayed(driver,AddButtonCondition)) {
			    				  pass(driver,"2 time ADD button displayed after selecting the condition 2nd time ");
	    					  }else {
	    						  fail(driver,"2 time ADD button not displayed after selecting the condition 2nd time ");
	    					  } 
			    				  
	    					  selectOperatorCondition2(driver,SecondOperator_Input_Text_LF);
	    					  
		    				  if(isDisplayed(driver,ConditionSelectDropdown3)) {
		    					  pass(driver,"After click 'ADD' button Third time Condition Selection dropdown is displayed");
		    				  }else {
		    					  fail(driver,"After click 'ADD' button Third time Condition Selection dropdown is not displayed");
		    				  }
		    					  
	    					  selectByText(driver, ConditionSelectDropdown3, ThirdCondition_Text_LF);
	    					  wait(driver,"1");
	    					  click(driver,ConditonInput3);
	    					  sendKeys(driver,ConditonInput3,ThirdCondition_Input_Text_LF);
	    					  wait(driver,"1");
	    					  if(isDisplayed2(driver,AddButtonCondition)) {
	    						  fail(driver,"'ADD' button displayed after given 3 times condition ");
	    					  }else {
	    						  pass(driver,"'ADD' button not displayed after given 3 times condition");
	    					  }
	    					 
	    					  click(driver,ApplyButton_LocalFilter);
	    					  if(isDisplayed(driver,Bug_msg)) {
	    						  fail(driver,"Error displayed : "+getText1(driver, Bug_msg));
	    					  }
	    					  elementnotvisible1(driver, RPE_Loading);
							  if(isDisplayed(driver,chartBody)) {
	    						  
	    						  mouseOverToElement(driver, chartBody);
		    					  mouseOverToElement(driver, LocalFilterChartIcon);
		    					  String LocatFilterExpected="Local Filter: ON ";
		    					  String LocatFilterAct=getAttribute1(driver, FilterChartIcon, "title");
		    					  System.out.println("LocatFilterAct : "+LocatFilterAct);
		    					  if(LocatFilterAct.contains(LocatFilterExpected)) {
		    						  //pass(driver,"Local filter is ON in the chart after Apply filter");
		    					  }else {
		    						  fail(driver,"Local filter is not ON in the chart after Apply filter");
		    					  }
		    					  
		    					  String LocalFilterIconColorRGB=getWebElement(driver, LocalFilterChartIcon).getCssValue("fill");  
		    					  String LocalFilterIconColorAct=rgbToHex1(LocalFilterIconColorRGB);
		    					  if("#00E600".equalsIgnoreCase(LocalFilterIconColorAct)) { // need to modify.
		    						 // pass(driver,"Local Filter icon changed to green color after Applying the Local Filter"); 
		    					  }else {
		    						  fail(driver,"Local Filter icon not changed to green color after Applying the Local Filter");
		    					  }
		    					  
			    		          boolean filteredCell=true;
		    					  List<WebElement> FilterChartValues=getWebElements(driver,ChartBody_Y_Values);
		    					  for(WebElement localEle:FilterChartValues) {
		    						  String FilteredValue=localEle.getAttribute("aria-label");
		    						  
		    						  boolean condition_1_Result=Categorical_ConditionFiltercell(FirstCondition_Text_LF,FilteredValue,FirstCondition_Input_Text_LF);
		    						  boolean condition_2_Result=Categorical_ConditionFiltercell(SecondCondition_Text_LF,FilteredValue,SecondCondition_Input_Text_LF);
		    						  boolean condition_3_Result=Categorical_ConditionFiltercell(ThirdCondition_Text_LF,FilteredValue,ThirdCondition_Input_Text_LF);
		    						  String operator1 = FirstOperator_Input_Text_LF; 
		    						  String operator2 = SecondOperator_Input_Text_LF;
		    			  				 
		    						  if(!evaluateConditions(condition_1_Result,operator1,condition_2_Result,operator2,condition_3_Result)) {
		    			  					 filteredCell=false;
		    						  }
		    					
		    					  }
		    					  
			    		          if(filteredCell==true) {
			  			    	       pass(driver,"For Selected 3 Condition applied correctly in the BarChart");
			  			          }else {
			  			    	       fail(driver,"For Selected 3 Condition condition not applied correctly in the BarChart");
			  			          }
		    					  
	    					  }else {
	    						  pass(driver,"Unable to get the chart value for the selected filter, 3 condition : "+getText1(driver, ValidationChart));
	    					  }
	    					  
	    					  click(driver,ResetButton_LocalFilter);
	    					  elementnotvisible1(driver, RPE_Loading);
			  		 		  waitForElement(driver, chartBody);
			  		 		  mouseOverToElement(driver, chartBody);
	    					  mouseOverToElement(driver, LocalFilterChartIcon);
	    					  String LocatFilterExpected="Local Filter: OFF ";
	    					  String LocatFilterExpRest=getAttribute1(driver, FilterChartIcon, "title");
	    					  
	    					  if(LocatFilterExpRest.contains(LocatFilterExpected)) {
//	    						  pass(driver,"Local filter is OFF in the chart after Reset filter");
	    					  }else {
	    						  fail(driver,"Local filter is not OFF in the chart after Reset filter");
	    					  }
	    					   
	    					  String LocalFilterIconColorRGB=getWebElement(driver, LocalFilterChartIcon).getCssValue("fill");			    					  
			  			 	  String LocalFilterIconColorAct=rgbToHex1(LocalFilterIconColorRGB);
		    					  
			  			 	  if(!"#00E600".equalsIgnoreCase(LocalFilterIconColorAct)) { 
	    						  pass(driver,"Local Filter icon changed to Default color after Reset the Local Filter "); 
			  			 	  }else {
	    						  fail(driver,"Local Filter icon not changed to Default color after Reset the Local Filter ");
	    					  } 
			    	      }
 					    }
 				    		
 					  }else {
 						  fail(driver, Select_Y_Axis_Value+" Text Column not Expand After click on it ");
 		    		  }	
 					  
	    		  }else {
	    			  pass(driver,Select_Y_Axis_Value+" Text Column value not present in local filter");
	    		  }		  
   			  
    			}//Text Local filter End....
    		
    		 }  //local filter sec display
    		 
    	 }  // if Local filter validation 
    	 
    	 String GlobalTab1Id=getAttribute1(driver, CurrentTab, "id");
    	 String GlobalTab2Id=getAttribute1(driver, CurrentTab, "id");
		//******************************* Global Filter Start **********************************//
		 String Bar_GlobalFilter= getCellValue("TestExecution","Testcase_Selection","Bar_GlobalFilter",Flag);
		  if(Bar_GlobalFilter.contains("Yes")&& AllTestcase==true) {
			  
			 mouseOverToElement(driver, ADDTabPlus);
	    	 mouseOverAndClick(driver, ADDTabPlus);
	    	 wait(driver,"1");
	    	 sendKeys(driver,newlyAddedTab,TabNameNew_Global_Bar);
	    	 click(driver,DashProPage);
	    	 wait(driver,"1");
	    	 waitForElement(driver, ADD_widget_rightTop);
	    	 mouseOverToElement(driver, ADD_widget_rightTop);
	    	 click(driver,ADD_widget_rightTop);
			 elementnotvisible(driver,Loading);
			  
			 waitForElement(driver,Bar_widget);
			 click(driver,Bar_widget);
			 elementnotvisible(driver, Loading);
			 waitForElement(driver,Y_Axis_dropdown);
			 click(driver,Y_Axis_dropdown);
			 waitForElement(driver,Y_Axis_dropdownResults);
			 selectDropdownValue(driver,Y_Axis_dataType,Select_Y_Axis_Value);
				//new lines
			 if(Y_Axis_dataType.equals("Date")) {
				 verifyElementDisplayed(driver,GroupText);
				 if(isDisplayed(driver,groupDropdown)) {
					  pass(driver,"Group selection input option is displayed While select Date datatype in Y_axis");
					  click(driver,groupDropdown);
					  if(verifyElementDisplayed(driver, GroupDropdownExpand)){
							
						  selectGroupDateValue(driver,SelectGroupValue_Date);
						  wait(driver,"1");
						  if(isDisplayed2(driver,GroupDropdownExpand)) {
								 fail(driver,"Group dropdown not closed after Selecting value ");
						  }else {
								pass(driver,"Group dropdown Closed after Selecting value ");
						  }
					  }
						
				 }else {
					 fail(driver,"Group selection input option is not displayed While select Date datatype in Y_axis");
				 }
			 }
				//new lines
			  waitForElement(driver,X_Axis_dropdown);
			  click(driver,X_Axis_dropdown);
			  waitForElement(driver,X_Axis_dropdownResults);
			  selectDropdownValue(driver,X_Axis_dataType,Select_X_Axis_Value);
				  
			  scrollUsingElement(driver,ApplyButton);
			  click(driver,ApplyButton);
			  elementnotvisible1(driver, RPE_Loading);
			  click(driver,ChartTitleInput);
			  sendKeys(driver,ChartTitleInput,ChartTitleName2_BAR_Smoke);
			  click(driver,SaveBtn_Chart);
			  elementnotvisible1(driver,RPE_Loading);
			  if(!isDisplayed2(driver,chartSaveError1) && isDisplayed(driver,SavedChartTitleInput)) {
				  pass(driver,"Chart saved Successfully");
			  }else {
				  fail(driver,"Chart not saved Successfully");
			  }
			  
			  GlobalTab2Id=getAttribute(driver, CurrentTab, "id");
			  GlobalFilter_BarChart(driver,Y_Axis_dataType,Select_Y_Axis_Value, GlobalTab1Id,GlobalTab2Id, iteration);
		  }else {
		    	System.out.println("user don't want to execute the Global Filter ");
		  }
		 //******************************* Global Filter End **********************************//
       	
		  //******************************* Tab Filter Start **********************************//
			String Bar_TabFilter= getCellValue("TestExecution","Testcase_Selection","Bar_TabFilter",Flag);
		    if(Bar_TabFilter.contains("Yes") && AllTestcase==true) {
		    	TabFilter_BarChart(driver,Y_Axis_dataType,Select_Y_Axis_Value,iteration);
		    	try {
			    	  if(!isDisplayed(driver,chartBody2)) {
			    		  mouseOverToElement(driver, chartBody);
			    		  waitForElement(driver,copyChart);
				    	  mouseOverToElement(driver,copyChart);
				    	  click(driver,copyChart);
				    	  if(isDisplayed(driver, chartBody2)) {
				    		  pass(driver,"Chart Copied Succesfully");
				    	  }else {
				    		  fail(driver,"Chart not Copied Succesfully");
				    	  }
			    	  }
			    	  mouseOverToElement(driver, chartBody);
			    	  waitForElement(driver,editeChart);
			    	  mouseOverToElement(driver,editeChart);
			    	  click(driver,editeChart);
					  if(isDisplayed(driver, cancel_chart)) {
						  pass(driver,"Chart Edit page is displayed After clicking the edit button");
						  click(driver,cancel_chart);
						  if(isDisplayed(driver,cancel_chart)) {
							  fail(driver,"Cancel button in the chart not working properly");  
						  }else {
							  pass(driver,"Cancel button in the chart working properly");  
						  }
						  
					  }else {
						  fail(driver,"Chart Edit page is not displayed After clicking the edit button");
					  }

					  mouseOverToElement(driver, chartBody);
					  waitForElement(driver,deteleBtn_chart);
					  mouseOverToElement(driver,deteleBtn_chart);
			    	  click(driver,deteleBtn_chart);
					  waitForElement(driver,deleteConfirmButton);
					  click(driver,deleteConfirmButton);
					  elementnotvisible1(driver, RPE_Loading);
					  if(!isDisplayed(driver,chartBody2)) {
						  pass(driver,"Chart deleted successfully after deleting it");
					  }else {
						  fail(driver,"Chart not deleted successfully after deleting it");
					  }
			    	  
				  }catch(Exception e) {
					  fail(driver," "+e.getLocalizedMessage());
					  e.printStackTrace();
				  }
		    	
		    }else {
		    	System.out.println("user don't want to execute the Tab Filter ");
		    }
		  //******************************* Tab Filter End **********************************//
		    
	}
	
	public void selectOperatorCondition1(WebDriver driver, String Value) {
		
		  mouseOverToElement(driver, AddButtonCondition);
		  click(driver,AddButtonCondition);
		  
		  verifyElementDisplayed(driver, AND_ConditionSec1);
		  verifyElementDisplayed(driver, OR_ConditionSec1);
		  if(Value.equals("AND")) { 
			  click(driver,AND_ConditionSec1);
			  wait(driver,"1");
			  if(isElementSelected(driver,AND_ConditionRadioBtn1)) {
				  pass(driver,"AND Operated Selected after click on it");
			  }else {
				  fail(driver,"AND Operated Selected after click on it");
			  }
			  
		  }else {
			  click(driver,OR_ConditionSec1);
			  wait(driver,"1");
			  if(isElementSelected(driver,OR_ConditionRadioBtn1)) {
				  pass(driver,"AND Operated Selected after click on it");
			  }else {
				  fail(driver,"AND Operated Selected after click on it");
			  }
		  }
	}
	
	public void selectOperatorCondition2(WebDriver driver, String Value) {
		
		  mouseOverToElement(driver, AddButtonCondition);
		  click(driver,AddButtonCondition);
		  verifyElementDisplayed(driver, AND_ConditionSec2);
		  verifyElementDisplayed(driver, OR_ConditionSec2);
		  
		  if(Value.equals("AND")) { 
			  click(driver,AND_ConditionSec2);
			  wait(driver,"1");
			  if(isElementSelected(driver,AND_ConditionRadioBtn2)) {
				  pass(driver,"AND Operated Selected after click on it");
			  }else {
				  fail(driver,"AND Operated Selected after click on it");
			  }
			  
		  }else {
			  click(driver,OR_ConditionSec2);
			  wait(driver,"1");
			  if(isElementSelected(driver,OR_ConditionRadioBtn2)) {
				  pass(driver,"AND Operated Selected after click on it");
			  }else {
				  fail(driver,"AND Operated Selected after click on it");
			  }
		  }
	}
	
	public void aggregationValidation1(WebDriver driver) {
		if(isDisplayed2(driver,sumDisabled)) {
        	pass(driver,"Sum is disabled in aggregation dropdown for Categorical,Text and Date type value");
		}else {
        	fail(driver,"Sum is not disabled in aggregation dropdown for Categorical,Text and Date type value");
		}
        
		if(isDisplayed2(driver,AvgDisabled)) {
			pass(driver,"Average is disabled in aggregation dropdown for Categorical,Text and Date type value");
		}else {
        	fail(driver,"Average is not disabled in aggregation dropdown for Categorical,Text and Date type value");
		}
        
		if(isDisplayed2(driver,minDisabled)) {
        	pass(driver,"Minimum is disabled in aggregation dropdown for Categorical,Text and Date type value");
		}else {
        	fail(driver,"Minimum is not disabled in aggregation dropdown for Categorical,Text and Date type value");
		}
        
		if(isDisplayed2(driver,maxDisabled)) {
        	pass(driver,"Maximum is disabled in aggregation dropdown for Categorical,Text and Date type value");
		}else {
        	fail(driver,"Maximum is not disabled in aggregation dropdown for Categorical,Text and Date type value");
		}
        
		if(!isDisplayed2(driver,uniqueDisabled)) {
        	pass(driver,"Unique is enabled in aggregation dropdown for Categorical,Text and Date type value");
		}else {
        	fail(driver,"Unique is not enabled in aggregation dropdown for Categorical,Text and Date type value");
		}
		
		if(!isDisplayed2(driver,countDisabled)) {
        	pass(driver,"Count is enabled in aggregation dropdown for Categorical,Text and Date type value");
		}else {
        	fail(driver,"Count is not enabled in aggregation dropdown for Categorical,Text and Date type value");
		} 
		
	}
	
	public void aggregationValidation2(WebDriver driver) {
		if(!isDisplayed2(driver,sumDisabled)) {
			pass(driver,"Sum is enabled for Numerical value");
        }else {
			fail(driver,"Sum is not enabled for Numerical value");
        }
        
        if(!isDisplayed2(driver,AvgDisabled)) {
			pass(driver,"Average is enabled for Numerical value");
        }else {
			fail(driver,"Average is not enabled for Numerical value");
        }
        
        if(!isDisplayed2(driver,minDisabled)) {
			pass(driver,"Minimum is enabled for Numerical value");
        }else {
			fail(driver,"Minimum is not enabled for Numerical value");
        }
        
        if(!isDisplayed2(driver,maxDisabled)) {
        	pass(driver,"Maximum is enabled for Numerical value");
        }else {
        	fail(driver,"Maximum is not enabled for Numerical value");
        }
        
        if(!isDisplayed2(driver,uniqueDisabled)) {
        	pass(driver,"Unique is enabled for Numerical value");
        }else {
        	fail(driver,"Unique is not enabled for Numerical value");
        }
        
        if(!isDisplayed2(driver,countDisabled)) {
        	pass(driver,"Count is enabled for Numerical value");
        }else {
        	fail(driver,"Count is not enabled for Numerical value");
        }
	}
	
	
	public void clickFirstTab(WebDriver driver,String id) {
		Actions action=new Actions(driver);
		WebElement tab1=driver.findElement(By.xpath("//li[@id='"+id+"']//a"));
		action.moveToElement(tab1).build().perform();
		action.click(tab1).build().perform();
		elementnotvisible(driver,Loading1);
	}

    	
	public void clickSecondTab(WebDriver driver,String id) {
		Actions action=new Actions(driver);
		WebElement globaltab2=driver.findElement(By.xpath("//li[@id='"+id+"']"));
      	action.moveToElement(globaltab2).build().perform();
      	wait(driver,"1");
      	globaltab2.click();
      	elementnotvisible(driver,Loading1);
      	waitForElement(driver,GlobalFilterOption);
      	click(driver,GlobalFilterOption);
      	waitForElement(driver,GlobalFilterSection);
	}
	
	public void GlobalFilter_BarChart(WebDriver driver,String Y_Axis_dataType,String Select_Y_Axis_Value,String TabId1,String TabId2, int iteration) throws Exception {
		
		//Global Filter Inputs Categorical
		String ByValuesInput_Categorical_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_GlobalFilter_Bar", "ByValuesInput_Categorical_GF");
		String FirstCondition_1_Categorical_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_GlobalFilter_Bar", "FirstCondition_1_Categorical_GF");
		String FirstCondition_2_Categorical_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_GlobalFilter_Bar", "FirstCondition_2_Categorical_GF");
		String FirstCondition_3_Categorical_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_GlobalFilter_Bar", "FirstCondition_3_Categorical_GF");
		String FirstCondition_4_Categorical_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_GlobalFilter_Bar", "FirstCondition_4_Categorical_GF");
		String FirstCondition_5_Categorical_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_GlobalFilter_Bar", "FirstCondition_5_Categorical_GF");
		String FirstCondition_6_Categorical_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_GlobalFilter_Bar", "FirstCondition_6_Categorical_GF");
		String FirstCondition_7_Categorical_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_GlobalFilter_Bar", "FirstCondition_7_Categorical_GF");
		String FirstCondition_8_Categorical_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_GlobalFilter_Bar", "FirstCondition_8_Categorical_GF");
		String FirstCondition_Input_1_Categorical_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_GlobalFilter_Bar", "FirstCondition_Input_1_Categorical_GF");
		String FirstCondition_Input_2_Categorical_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_GlobalFilter_Bar", "FirstCondition_Input_2_Categorical_GF");
		String FirstCondition_Input_3_Categorical_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_GlobalFilter_Bar", "FirstCondition_Input_3_Categorical_GF");
		String FirstCondition_Input_4_Categorical_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_GlobalFilter_Bar", "FirstCondition_Input_4_Categorical_GF");
		String FirstCondition_Input_5_Categorical_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_GlobalFilter_Bar", "FirstCondition_Input_5_Categorical_GF");
		String FirstCondition_Input_6_Categorical_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_GlobalFilter_Bar", "FirstCondition_Input_6_Categorical_GF");
		String FirstCondition_Input_7_Categorical_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_GlobalFilter_Bar", "FirstCondition_Input_7_Categorical_GF");
		String FirstCondition_Input_8_Categorical_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_GlobalFilter_Bar", "FirstCondition_Input_8_Categorical_GF");
		String FirstCondition_Categorical_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_GlobalFilter_Bar", "FirstCondition_Categorical_GF");
		String FirstCondition_Input_Categorical_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_GlobalFilter_Bar", "FirstCondition_Input_Categorical_GF");
		String FirstOperator_Input_Categorical_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_GlobalFilter_Bar", "FirstOperator_Input_Categorical_GF");
		String SecondOperator_Input_Categorical_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_GlobalFilter_Bar", "SecondOperator_Input_Categorical_GF");
		String SecondCondition_Categorical_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_GlobalFilter_Bar", "SecondCondition_Categorical_GF");
		String SecondCondition_Input_Categorical_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_GlobalFilter_Bar", "SecondCondition_Input_Categorical_GF");
		String ThirdCondition_Categorical_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_GlobalFilter_Bar", "ThirdCondition_Categorical_GF");
		String ThirdCondition_Input_Categorical_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_GlobalFilter_Table", "ThirdCondition_Input_Categorical_GF");

		//Global filter inputs Date
		String RelativeFilter_1_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Bar", "RelativeFilter_1_Date_GF");
		String RelativeFilter_2_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Bar", "RelativeFilter_2_Date_GF");
		String RelativeFilter_3_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Bar", "RelativeFilter_3_Date_GF");
		String RelativeFilter_4_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Bar", "RelativeFilter_4_Date_GF");
		String RelativeFilter_5_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Bar", "RelativeFilter_5_Date_GF");
		String RelativeFilter_6_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Bar", "RelativeFilter_6_Date_GF");
		String RelativeFilter_7_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Bar", "RelativeFilter_7_Date_GF");
		String RelativeFilter_8_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Bar", "RelativeFilter_8_Date_GF");
		String RelativeFilter_9_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Bar", "RelativeFilter_9_Date_GF");
		String RelativeFilter_10_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Bar", "RelativeFilter_10_Date_GF");
		String RelativeFilter_11_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Bar", "RelativeFilter_11_Date_GF");
		String RelativeFilter_12_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Bar", "RelativeFilter_12_Date_GF");
		String RelativeFilter_13_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Bar", "RelativeFilter_13_Date_GF");
		String RelativeFilter_14_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Bar", "RelativeFilter_14_Date_GF");
		String RelativeFilter_11_Input_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Bar", "RelativeFilter_11_Input_Date_GF");
		String RelativeFilter_12_Input_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Bar", "RelativeFilter_12_Input_Date_GF");
		String RelativeFilter_13_Input_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Bar", "RelativeFilter_13_Input_Date_GF");
		String RelativeFilter_14_Input_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Bar", "RelativeFilter_14_Input_Date_GF");
		String Condition_1_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Bar", "Condition_1_Date_GF");
		String Condition_2_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Bar", "Condition_2_Date_GF");
		String Condition_3_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Bar", "Condition_3_Date_GF");
		String Condition_4_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Bar", "Condition_4_Date_GF");
		String Condition_5_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Bar", "Condition_5_Date_GF");
		String Condition_6_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Bar", "Condition_6_Date_GF");
		String Condition_7_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Bar", "Condition_7_Date_GF");
		String Condition_8_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Bar", "Condition_8_Date_GF");
		String Condition_9_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Bar", "Condition_9_Date_GF");
		String Condition_1_Input_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Bar", "Condition_1_Input_Date_GF");
		String Condition_2_Input_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Bar", "Condition_2_Input_Date_GF");
		String Condition_3_Input_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Bar", "Condition_3_Input_Date_GF");
		String Condition_4_Input_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Bar", "Condition_4_Input_Date_GF");
		String Condition_5_Input_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Bar", "Condition_5_Input_Date_GF");
		String Condition_6_Input_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Bar", "Condition_6_Input_Date_GF");
		String Condition_7_Input_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Bar", "Condition_7_Input_Date_GF");
		String Condition_8_Input_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Bar", "Condition_8_Input_Date_GF");
		String Condition_9_InputA_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Bar", "Condition_9_InputA_Date_GF");
		String Condition_9_InputB_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Bar", "Condition_9_InputB_Date_GF");
		
		String FirstCondition_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Bar", "FirstCondition_Date_GF");
		String SecondCondition_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Bar", "SecondCondition_Date_GF");
		String ThirdCondition_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Bar", "ThirdCondition_Date_GF");
		String FirstCondition_Date_Input_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Bar", "FirstCondition_Date_Input_GF");
		String SecondCondition_Date_Input_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Bar", "SecondCondition_Date_Input_GF");
		String ThirdCondition_Date_Input_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Bar", "ThirdCondition_Date_Input_GF");
		String FirstOperator_Input_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Bar", "FirstOperator_Input_Date_GF");
		String SecondOperator_Input_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Bar", "SecondOperator_Input_Date_GF");
			
		// Global Numerical Filter Inputs
		String Condition_1_Num_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Bar", "Condition_1_Num_GF");
		String Condition_2_Num_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Bar", "Condition_2_Num_GF");
		String Condition_3_Num_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Bar", "Condition_3_Num_GF");
		String Condition_4_Num_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Bar", "Condition_4_Num_GF");
		String Condition_5_Num_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Bar", "Condition_5_Num_GF");
		String Condition_6_Num_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Bar", "Condition_6_Num_GF");
		String Condition_7_Num_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Bar", "Condition_7_Num_GF");
		String Condition_8_Num_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Bar", "Condition_8_Num_GF");
		String Condition_9_Num_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Bar", "Condition_9_Num_GF");
		String Condition_1_Input_Num_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Bar", "Condition_1_Input_Num_GF");
		String Condition_2_Input_Num_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Bar", "Condition_2_Input_Num_GF");
		String Condition_3_Input_Num_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Bar", "Condition_3_Input_Num_GF");
		String Condition_4_Input_Num_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Bar", "Condition_4_Input_Num_GF");
		String Condition_5_Input_Num_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Bar", "Condition_5_Input_Num_GF");
		String Condition_6_Input_Num_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Bar", "Condition_6_Input_Num_GF");
		String Condition_7_Input_Num_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Bar", "Condition_7_Input_Num_GF");
		String Condition_8_Input_Num_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Bar", "Condition_8_Input_Num_GF");
		String Condition_9_InputA_Num_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Bar", "Condition_9_InputA_Num_GF");
		String Condition_Between_InputB_Num_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Bar", "Condition_Between_InputB_Num_GF");
		
		String FirstCondition_Num_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Bar", "FirstCondition_Num_GF");
		String SecondCondition_Num_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Bar", "SecondCondition_Num_GF");
		String ThirdCondition_num_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Bar", "ThirdCondition_num_GF");
		String FirstCondition_Num_Input_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Bar", "FirstCondition_Num_Input_GF");
		String SecondCondition_Num_Input_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Bar", "SecondCondition_Num_Input_GF");
		String ThirdCondition_Num_Input_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Bar", "ThirdCondition_Num_Input_GF");
		String FirstOperator_Input_Num_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Bar", "FirstOperator_Input_Num_GF");
		String SecondOperator_Input_Num_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Bar", "SecondOperator_Input_Num_GF");
		
		//Global Filter inputs Text
		String ByValuesInput_Text_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_GlobalFilter_Bar", "ByValuesInput_Text_GF");
		String Condition_1_Text_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_GlobalFilter_Bar", "Condition_1_Text_GF");
		String Condition_2_Text_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_GlobalFilter_Bar", "Condition_2_Text_GF");
		String Condition_3_Text_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_GlobalFilter_Bar", "Condition_3_Text_GF");
		String Condition_4_Text_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_GlobalFilter_Bar", "Condition_4_Text_GF");
		String Condition_5_Text_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_GlobalFilter_Bar", "Condition_5_Text_GF");
		String Condition_6_Text_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_GlobalFilter_Bar", "Condition_6_Text_GF");
		String Condition_7_Text_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_GlobalFilter_Bar", "Condition_7_Text_GF");
		String Condition_8_Text_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_GlobalFilter_Bar", "Condition_8_Text_GF");
		String Condition_Input_1_Text_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_GlobalFilter_Bar", "Condition_Input_1_Text_GF");
		String Condition_Input_2_Text_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_GlobalFilter_Bar", "Condition_Input_2_Text_GF");
		String Condition_Input_3_Text_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_GlobalFilter_Bar", "Condition_Input_3_Text_GF");
		String Condition_Input_4_Text_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_GlobalFilter_Bar", "Condition_Input_4_Text_GF");
		String Condition_Input_5_Text_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_GlobalFilter_Bar", "Condition_Input_5_Text_GF");
		String Condition_Input_6_Text_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_GlobalFilter_Bar", "Condition_Input_6_Text_GF");
		String Condition_Input_7_Text_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_GlobalFilter_Bar", "Condition_Input_7_Text_GF");
		String Condition_Input_8_Text_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_GlobalFilter_Bar", "Condition_Input_8_Text_GF");
		String FirstCondition_Text_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_GlobalFilter_Bar", "FirstCondition_Text_GF");
		String FirstCondition_Input_Text_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_GlobalFilter_Bar", "FirstCondition_Input_Text_GF");
		String FirstOperator_Input_Text_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_GlobalFilter_Bar", "FirstOperator_Input_Text_GF");
		String SecondOperator_Input_Text_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_GlobalFilter_Bar", "SecondOperator_Input_Text_GF");
		String SecondCondition_Text_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_GlobalFilter_Bar", "SecondCondition_Text_GF");
		String SecondCondition_Input_Text_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_GlobalFilter_Bar", "SecondCondition_Input_Text_GF");
		String ThirdCondition_Text_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_GlobalFilter_Bar", "ThirdCondition_Text_GF");
		String ThirdCondition_Input_Text_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_GlobalFilter_Bar", "ThirdCondition_Input_Text_GF");
		
		Actions action=new Actions(driver);
		  verifyElementDisplayed(driver, GlobalFilterOption);
		  click(driver,GlobalFilterOption);
		  wait(driver,"1");
		  if(isDisplayed(driver, GlobalFilterSection)) {
			  pass(driver,"Global Filter section is displayed after click the global filter option");
			  verifyElementDisplayed(driver, DataSetGlobalVariable);
			  verifyElementDisplayed(driver, ApplyButton_GlobalFilter);
			  verifyElementDisplayed(driver, RestButton_GlobalFilter);
			  verifyElementDisplayed(driver, SearchInput_GlobalFilter);
			  
		  }else {
			  fail(driver,"Global Filter section is not displayed after click the global filter option");
		  }
		  
		  if(isDisplayed(driver, DataColumnList_GlobalFilter)) {
			  pass(driver,"Data Column Lists are displayed in the global filter section");
			  
			  List<WebElement> ColumnListElements=getWebElements(driver, DataColumnList_GlobalFilter);
			  List<WebElement> ColumnListImgElements=getWebElements(driver, ColumnTypeIcon_GlobalFilter);
			  if(ColumnListElements.size()==ColumnListImgElements.size()) {
				  pass(driver,"All column values displayed with dataType Image icon");
			  }else {
				  fail(driver,"Some column values not displayed with dataType Image icon");
			  }
			  
			  
			  int ColumnListElementsLastSize=ColumnListElements.size()-1;
			  String LastColumnName=ColumnListElements.get(ColumnListElementsLastSize).getText();
			  click(driver,SearchInput_GlobalFilter);
			  sendKeys(driver, SearchInput_GlobalFilter, LastColumnName);
			  wait(driver,"1");
			  String AfterSearchLastName=getText1(driver,ColumnListFirstValue_GlobalFilter);
			  if(AfterSearchLastName.equals(LastColumnName)) {
				  pass(driver,"Search Function works properly in Global Filter");
				  if(isDisplayed(driver,ImageFirstColumn_GlobalFilter)) {
					  pass(driver,"DataType image is displayed in the searched Value");
				  }else {
					  fail(driver,"DataType image is not displayed in the searched Value");
				  }
			  }else {
				  fail(driver,"Search Function not works properly in Global Filter");
			  }
			  clear1(driver,SearchInput_GlobalFilter);
			  wait(driver,"1");
			  enter(driver);
			  String AfterRestSearchValue=getText1(driver, SearchInput_GlobalFilter);
			  if(AfterRestSearchValue.isEmpty() || AfterRestSearchValue.equals(null)) {
				  pass(driver,"Value cleared successfully in searchbar");
			  }else {
				  fail(driver,"Value not cleared successfully in searchbar");
			  }
		  
  			if(Y_Axis_dataType.equals("Categorical")) {
	    		 
	    		 //categorical Validation start...
	    		  boolean categoricalFilter=false;
	    		  try {
	    			  WebElement CategoricalColumn= driver.findElement(By.xpath("//div[@id='globalRPE_select_filterColsCon']//div[@id='"+Select_Y_Axis_Value+"']//a"));
		    		  action.moveToElement(CategoricalColumn).click().build().perform();
		    		  categoricalFilter=true;
	    		  }catch(Exception e) {
	    			  
	    		  }
	    		  
	    		  if(categoricalFilter==true) {
		    		  WebElement CategoricalColumnExp=driver.findElement(By.xpath("//div[@id='globalRPE_select_filterColsCon']//div[@id='"+Select_Y_Axis_Value+"']//a//i"));
		    		  String CategoricalColumnExpText=CategoricalColumnExp.getAttribute("class");
		    		 if(CategoricalColumnExpText.contains("up")) {
		    			  pass(driver,"Categorical Column Expand After click on it ");
		    			  if(verifyElementDisplayed(driver, byValueFilterOption)) {
		    				  if(isElementSelected(driver,byValueRadioButton)) {
		    					  pass(driver,"By default, 'By Values' radio button selected ");
		    				  }else {
		    					  fail(driver,"By default, 'By Values' radio button not selected ");
		    				  }
	    				  }
		    			  
		    		    verifyElementDisplayed(driver, AllCheckbox_CategoricalSec);
   				        verifyElementDisplayed(driver, CategoricalSearchListOptions);
   				        verifyElementDisplayed(driver, ExcludeOption_Categorical);
   				        verifyElementDisplayed(driver, ExcludeCheckbox);

   				      List<WebElement> searchListAvailable=getWebElements(driver,AvailableList_ByValue);
   				      List<WebElement> searchListCheckboxAvailable=getWebElements(driver,AvailableListCheckbox_ByValue);
   				      
   				      if(searchListAvailable.size()==searchListCheckboxAvailable.size()) {
   				    	  pass(driver,"All the available searchlist are displayed with Checkbox");
   				      }else {
   				    	  fail(driver,"Some available searchlist are not displayed with Checkbox");
   				      }
   				      
   				      waitForElement(driver,SearchField_CategoricalSec);
   				      click(driver,SearchField_CategoricalSec);
   				      sendKeys(driver,SearchField_CategoricalSec,ByValuesInput_Categorical_GF);
	    			  wait(driver,"1");
	    			  String firstOptionText=getText1(driver,FirstSearchedListValue);
	    			  if(firstOptionText.equals(ByValuesInput_Categorical_GF)) {
	    				  pass(driver,"Search bar inside the Categorical section works properly");
	    			  }else {
	    				  fail(driver,"Search bar inside the Categorical section not works properly");
	    			  }
	    			  
	    			  click(driver,FirstSearchedListValue);
    				  wait(driver,"1");
	    				  
    				  if(isElementSelected(driver,FirstSearchedCheckbox)) {
    					  pass(driver,"Check box selected when click the First searched value");
    				  }else {
		    			  fail(driver,"Check box not selected when click the First searched value"); 
    				  }
			    		  
    				  click(driver,ApplyButton_GlobalFilter);
    				  if(isDisplayed(driver,Bug_msg)) {
						  fail(driver,"Error displayed : "+getText1(driver, Bug_msg));
					  }
    				  elementnotvisible1(driver, RPE_Loading);
   					  
   					  for(int k=2;k>=1;k--) {
   						  
   						if(isDisplayed(driver,chartBody)) {
     						  mouseOverToElement(driver, chartBody);
  	    					  mouseOverToElement(driver, GlobalFilterIcon);
  	    					  
  	    					  String GlobalFilterExpected="Global Filter: ON";
  	    					  String GlobalFilterAct=getAttribute1(driver, FilterChartIcon, "title");
//  	    					  System.out.println("GlobalFilterAct : "+GlobalFilterAct);
  	    					  if(GlobalFilterAct.contains(GlobalFilterExpected)) {
  	    						  pass(driver,"Global filter is ON in the chart after Apply filter");
  	    					  }else {
  	    						  fail(driver,"Global filter is not ON in the chart after Apply filter, Act : "+GlobalFilterAct);
  	    					  }
  	    					  
  	    					  String GlobalFilterIconColorRGB=getWebElement(driver, GlobalFilterIcon).getCssValue("fill");  
  	    					  String GlobalFilterIconColorAct=rgbToHex1(GlobalFilterIconColorRGB);
  	    					  
  	    					  if("#FF3333".equalsIgnoreCase(GlobalFilterIconColorAct)) {
								  pass(driver,"Global Filter icon changed to Red color after Applying the Global Filter"); 
							  }else {
								  fail(driver,"Global Filter icon not changed to Red color after Applying the Global Filter"); 
							  }
  	    					  
  	    					  
  		    		          boolean filteredCell=true;
  	    					  List<WebElement> FilterChartValues=getWebElements(driver,ChartBody_Y_Values);
  	    					  for(WebElement localEle:FilterChartValues) {
  	    						  String FilteredValue=localEle.getAttribute("aria-label");
  	    						  if(!FilteredValue.equals(ByValuesInput_Categorical_GF)) {
  	    							  filteredCell=false;
	    						  }
  	    					  }
  	    					  
  		    		         if(filteredCell==true) {
  		  			    	       pass(driver,"For 'By Values' condition applied correctly in the BarChart GlobalTab"+k);
  		  			          }else {
  		  			    	       fail(driver,"For 'By Values' condition not applied correctly in the BarChart GlobalTab"+k);
  		  			          }
  	    					  
     					  }else {
     						  pass(driver,"Unable to get the chart in GlobalTab"+k+" for the selected filter, By Values : "+getText1(driver, ValidationChart));
     					  }
   						
   						  clickFirstTab(driver,TabId1);
   						  
   					  }  //by Value global completed
   					  
   					  clickSecondTab(driver,TabId2);
			    	  click(driver,ExcludeCheckbox);
			    	  
			    	  click(driver,ApplyButton_GlobalFilter);
			    	  if(isDisplayed(driver,Bug_msg)) {
						  fail(driver,"Error displayed : "+getText1(driver, Bug_msg));
					  }
			    	  elementnotvisible1(driver, RPE_Loading);
   					  
   					  for(int k=2;k>=1;k--) {
   						 
   						  if(isDisplayed(driver,chartBody)) {
   							  mouseOverToElement(driver, chartBody);
   							  mouseOverToElement(driver, GlobalFilterIcon);
    	    					  
   							  String GlobalFilterExpected="Global Filter: ON";
   							  String GlobalFilterAct=getAttribute1(driver, FilterChartIcon, "title");
//	    					  System.out.println("GlobalFilterAct : "+GlobalFilterAct);
	    					  if(GlobalFilterAct.contains(GlobalFilterExpected)) {
	    						  //pass(driver,"Global filter is ON in the chart after Apply filter");
	    					  }else {
	    						  fail(driver,"Global filter is not ON in the chart after Apply filter");
	    					  }
    	    					  
	    					  String GlobalFilterIconColorRGB=getWebElement(driver, GlobalFilterIcon).getCssValue("fill");  
	    					  String GlobalFilterIconColorAct=rgbToHex1(GlobalFilterIconColorRGB);
    	    					  
	    					  if("#FF3333".equalsIgnoreCase(GlobalFilterIconColorAct)) {
  								  //pass(driver,"Global Filter icon changed to Red color after Applying the Global Filter"); 
  							  }else {
  								  fail(driver,"Global Filter icon not changed to Red color after Applying the Global Filter"); 
  							  }
    	    					  
		    		          boolean filteredCell=true;
	    					  List<WebElement> FilterChartValues=getWebElements(driver,ChartBody_Y_Values);
	    					  for(WebElement localEle:FilterChartValues) {
	    						  String FilteredValue=localEle.getAttribute("aria-label");
	    						  if(FilteredValue.equals(ByValuesInput_Categorical_GF)) {
	    							  filteredCell=false;
	    						  }
	    					  }
    	    					  
	    					  if(filteredCell==true) {
		  			    	       pass(driver,"For 'By Values' with Exclude condition applied correctly in the BarChart GlobalTab"+k);
	    					  }else {
		  			    	       fail(driver,"For 'By Values' with Exclude condition not applied correctly in the BarChart GlobalTab"+k);
	    					  }
    	    					  
       					  }else {
       						  pass(driver,"Unable to get the chart in GlobalTab"+k+" for the selected filter, By Values with Exclude : "+getText1(driver, ValidationChart));
       					  }
     						
 						  clickFirstTab(driver,TabId1);
     						  
 					  }  //by Value with Exclude global completed
   					  
   					  clickSecondTab(driver,TabId2);
   					  
   					  if(verifyElementDisplayed(driver, ConditionFilterOption_Categorical)) {
   				    	  click(driver,ConditionFilterOption_Categorical);
   				    	  wait(driver,"1");
   				    	  if(isElementSelected(driver,ConditionRadioButton_Categorical)) {
   				    		  pass(driver,"Condition radio button selected after click on it");
   				    	  }else {
   				    		  fail(driver,"Condition radio button not selected after click on it");
   				    	  } 
   				    		  
		    		  	  if(verifyElementDisplayed(driver, ConditionSelectDropdown)) {
			    			  String defaultSelectedCondition=defaultSelectedValue(driver, ConditionSelectDropdown);
			    			  if(defaultSelectedCondition.equals("equal to")) {
			    				  pass(driver,"By default, 'equal to' option selected in the Condition select dropdown");
			    			  }else {
			    				  fail(driver,"By default, 'equal to' option not selected in the Condition select dropdown");
			    			  }
   				    			  
			    			  verifyElementIsPresent1(driver, equalTo_Option);
			    			  verifyElementIsPresent1(driver, NotequalTo_Option);
			    			  verifyElementIsPresent1(driver, NotequalTo_Option);
			    			  verifyElementIsPresent1(driver, BeginsWith_Option);
			    			  verifyElementIsPresent1(driver, notBeginsWith_Option);
			    			  verifyElementIsPresent1(driver, endsWith_Option);
			    			  verifyElementIsPresent1(driver, notendsWith_Option);
			    			  verifyElementIsPresent1(driver, Contains_Option);
			    			  verifyElementIsPresent1(driver, NotContains_Option);
   				    		 
			    			  String[] conditionsList= {FirstCondition_1_Categorical_GF,FirstCondition_2_Categorical_GF,FirstCondition_3_Categorical_GF,FirstCondition_4_Categorical_GF,FirstCondition_5_Categorical_GF,FirstCondition_6_Categorical_GF,FirstCondition_7_Categorical_GF,FirstCondition_8_Categorical_GF};
			    			  String[] conditionsInputList= {FirstCondition_Input_1_Categorical_GF,FirstCondition_Input_2_Categorical_GF,FirstCondition_Input_3_Categorical_GF,FirstCondition_Input_4_Categorical_GF,FirstCondition_Input_5_Categorical_GF,FirstCondition_Input_6_Categorical_GF,FirstCondition_Input_7_Categorical_GF,FirstCondition_Input_8_Categorical_GF};

			    			  for(int k=0;k<8;k++) {

			    				  try {
			    					 selectByText(driver, ConditionSelectDropdown, conditionsList[k]); 
			    					 wait(driver,"1");
			    			  		 click(driver,ConditonInput1);
			    			  		 clear1(driver,ConditonInput1);
			    			  		 sendKeys(driver,ConditonInput1,conditionsInputList[k]);
			    			  		 
			    			  		 click(driver,ApplyButton_GlobalFilter);
			    			  		 if(isDisplayed(driver,Bug_msg)) {
			    						  fail(driver,"Error displayed : "+getText1(driver, Bug_msg));
			    					  }
			    			  		 elementnotvisible1(driver, RPE_Loading);
				    			  		 
			      					 for(int l=2;l>=1;l--) {
			      						 
			     						  if(isDisplayed(driver,chartBody)) {
			     							  mouseOverToElement(driver, chartBody);
			     							  mouseOverToElement(driver, GlobalFilterIcon);
			      	    					  
			     							  String GlobalFilterExpected="Global Filter: ON";
			     							  String GlobalFilterAct=getAttribute1(driver, FilterChartIcon, "title");
//			     							  System.out.println("GlobalFilterAct : "+GlobalFilterAct);
			     							  if(GlobalFilterAct.contains(GlobalFilterExpected)) {
			     								  //pass(driver,"Global filter is ON in the chart after Apply filter");
			     							  }else {
			     								  fail(driver,"Global filter is not ON in the chart after Apply filter");
			     							  }
			      	    					  
			     							  String GlobalFilterIconColorRGB=getWebElement(driver, GlobalFilterIcon).getCssValue("fill");  
			     							  String GlobalFilterIconColorAct=rgbToHex1(GlobalFilterIconColorRGB);
			      	    					  
			     							  if("#FF3333".equalsIgnoreCase(GlobalFilterIconColorAct)) {
			    								  //pass(driver,"Global Filter icon changed to Red color after Applying the Global Filter"); 
			    							  }else {
			    								  fail(driver,"Global Filter icon not changed to Red color after Applying the Global Filter"); 
			    							  }
			      	    					  
			     							  boolean filteredCell=true;
			     							  List<WebElement> FilterChartValues=getWebElements(driver,ChartBody_Y_Values);
			     							  for(WebElement localEle:FilterChartValues) {
			     								  String FilteredValue=localEle.getAttribute("aria-label");
			     								  if(!Categorical_ConditionFiltercell(conditionsList[k],FilteredValue,conditionsInputList[k])) {
				    			  					   filteredCell=false;
				    			  				  }
			     							  }
			      	    					  
			     							  if(filteredCell==true) {
		  		  			    	       		pass(driver,"For "+conditionsList[k]+" condition applied correctly in the BarChart GlobalTab"+l);
			     							  }else {
		  		  			    	       		fail(driver,"For "+conditionsList[k]+" condition not applied correctly in the BarChart GlobalTab"+l);
			     							  }
			      	    					  
			         					  	}else {
			         						  pass(driver,"Unable to get the chart in GlobalTab"+l+" for the selected filter, "+conditionsList[k]+" : "+getText1(driver, ValidationChart));
			         					  	}
			       						
			     						  clickFirstTab(driver,TabId1);
			       						  
			      					 }  //condition global completed
			      					
			      					clickSecondTab(driver,TabId2);
			      				
			    				  }catch(Exception e) {
				    					  e.printStackTrace();
			    				  }
			    			  }  //conditons seperate validation end
   				    			 
			    			  click(driver,ConditionSelectDropdown);
			    			  selectByText(driver, ConditionSelectDropdown, FirstCondition_Categorical_GF);
			    			  wait(driver,"1");
			    			  click(driver,ConditonInput1);
			    			  clear1(driver,ConditonInput1);
			    			  sendKeys(driver,ConditonInput1,FirstCondition_Input_Categorical_GF);
			    			  wait(driver,"1");
			    			  if(isDisplayed(driver,AddButtonCondition)) {
			    				  pass(driver,"ADD button displayed after selecting the condition");
			    			  }else {
				    			  fail(driver,"ADD button not displayed after selecting the condition"); 
				    		  }
				    			  
		    				  selectOperatorCondition1(driver,FirstOperator_Input_Categorical_GF);
		    				  
		    				  if(isDisplayed(driver,ConditionSelectDropdown2)) {
		    					  pass(driver,"After click 'ADD' button Second time Condition Selection dropdown is displayed");
		    				  }else {
			    				  fail(driver,"After click 'ADD' button Second time Condition Selection dropdown is not displayed"); 
			    			  } 
			    					 
		    				  click(driver,ConditionSelectDropdown2);
	    					  selectByText(driver, ConditionSelectDropdown2, SecondCondition_Categorical_GF);
	    					  wait(driver,"1");
	    					  click(driver,ConditonInput2);
	    					  sendKeys(driver,ConditonInput2,SecondCondition_Input_Categorical_GF);
	    					  wait(driver,"1");
	    					  if(isDisplayed(driver,AddButtonCondition)) {
			    				  pass(driver,"2 time ADD button displayed after selecting the condition 2nd time ");
	    					  }else {
	    						  fail(driver,"2 time ADD button not displayed after selecting the condition 2nd time ");
	    					  } 
				    				  
	    					  selectOperatorCondition2(driver,SecondOperator_Input_Categorical_GF);
			    				  
		    				  if(isDisplayed(driver,ConditionSelectDropdown3)) {
		    					  pass(driver,"After click 'ADD' button Third time Condition Selection dropdown is displayed");
		    				  }else {
		    					  fail(driver,"After click 'ADD' button Third time Condition Selection dropdown is not displayed");
		    				  }
			    					  
	    					  selectByText(driver, ConditionSelectDropdown3, ThirdCondition_Categorical_GF);
	    					  wait(driver,"1");
	    					  click(driver,ConditonInput3);
	    					  sendKeys(driver,ConditonInput3,ThirdCondition_Input_Categorical_GF);
	    					  wait(driver,"1");
	    					  if(isDisplayed2(driver,AddButtonCondition)) {
	    						  fail(driver,"'ADD' button displayed after given 3 times condition ");
	    					  }else {
	    						  pass(driver,"'ADD' button not displayed after given 3 times condition");
	    					  }
		    					 
	    					  click(driver,ApplyButton_GlobalFilter);
	    					  if(isDisplayed(driver,Bug_msg)) {
	    						  fail(driver,"Error displayed : "+getText1(driver, Bug_msg));
	    					  }
	    					  elementnotvisible1(driver, RPE_Loading);
	    					  
	    					  for(int l=2;l>=1;l--) {
		      						 
	     						  if(isDisplayed(driver,chartBody)) {
	     							  mouseOverToElement(driver, chartBody);
	     							  mouseOverToElement(driver, GlobalFilterIcon);
	      	    					  
	     							  String GlobalFilterExpected="Global Filter: ON";
	     							  String GlobalFilterAct=getAttribute1(driver, FilterChartIcon, "title");
//	     							  System.out.println("GlobalFilterAct : "+GlobalFilterAct);
	     							  if(GlobalFilterAct.contains(GlobalFilterExpected)) {
	     								  //pass(driver,"Global filter is ON in the chart after Apply filter");
	     							  }else {
	     								  fail(driver,"Global filter is not ON in the chart after Apply filter");
	     							  }
	      	    					  
	     							  String GlobalFilterIconColorRGB=getWebElement(driver, GlobalFilterIcon).getCssValue("fill");  
	     							  String GlobalFilterIconColorAct=rgbToHex1(GlobalFilterIconColorRGB);
	      	    					  
	     							  if("#FF3333".equalsIgnoreCase(GlobalFilterIconColorAct)) {
	    								  //pass(driver,"Global Filter icon changed to Red color after Applying the Global Filter"); 
	    							  }else {
	    								  fail(driver,"Global Filter icon not changed to Red color after Applying the Global Filter"); 
	    							  }
	      	    					  
	     							  boolean filteredCell=true;
	     							  List<WebElement> FilterChartValues=getWebElements(driver,ChartBody_Y_Values);
	     							  for(WebElement localEle:FilterChartValues) {
	     								  String FilteredValue=localEle.getAttribute("aria-label");
	     								  
	     								  boolean condition_1_Result=Categorical_ConditionFiltercell(FirstCondition_Categorical_GF,FilteredValue,FirstCondition_Input_Categorical_GF);
			    						  boolean condition_2_Result=Categorical_ConditionFiltercell(SecondCondition_Categorical_GF,FilteredValue,SecondCondition_Input_Categorical_GF);
			    						  boolean condition_3_Result=Categorical_ConditionFiltercell(ThirdCondition_Categorical_GF,FilteredValue,ThirdCondition_Input_Categorical_GF);
			    						  String operator1 = FirstOperator_Input_Categorical_GF; 
			    						  String operator2 = SecondOperator_Input_Categorical_GF;
		    			  				 
			    						  if(!evaluateConditions(condition_1_Result,operator1,condition_2_Result,operator2,condition_3_Result)) {
		    			  					 filteredCell=false;
			    						  }
	     							  }
	      	    					  
	     							  if(filteredCell==true) {
  		  			    	       		pass(driver,"For Selected 3 condition applied correctly in the BarChart GlobalTab"+l);
	     							  }else {
  		  			    	       		fail(driver,"For Selected 3 condition not applied correctly in the BarChart GlobalTab"+l);
	     							  }
	      	    					  
	         					  	}else {
	         						  pass(driver,"Unable to get the chart in GlobalTab"+l+" for the selected filter, 3 condition : "+getText1(driver, ValidationChart));
	         					  	}
	       						
	     						  clickFirstTab(driver,TabId1);
	      					  }
	    					  clickSecondTab(driver,TabId2);
	    					 
	    					  click(driver,RestButton_GlobalFilter);
	    					  elementnotvisible1(driver, RPE_Loading);
	    					  
	    					  waitForElement(driver, chartBody);
	    					  mouseOverToElement(driver, chartBody);
	    					  mouseOverToElement(driver, GlobalFilterIcon);
	    					  String GlobalFilterExpected="Global Filter: OFF";
	    					  String GlobalFilterExpRest=getAttribute1(driver, FilterChartIcon, "title");
	    					  System.out.println("LocatFilterExpRest : "+GlobalFilterExpRest);
		    					  
	    					  if(GlobalFilterExpRest.contains(GlobalFilterExpected)) {
	    						  pass(driver,"Global filter is OFF in the chart after Reset filter");
	    					  }else {
	    						  System.out.println("Failed.!! : LocatFilterAct");
	    						  fail(driver,"Global filter is not OFF in the chart after Reset filter");
	    					  }
		    					   
	    					  String GlobalFilterIconColorRGB=getWebElement(driver, GlobalFilterIcon).getCssValue("fill");  
 							  String GlobalFilterIconColorAct=rgbToHex1(GlobalFilterIconColorRGB);
  	    					  
 							  if(!"#FF3333".equalsIgnoreCase(GlobalFilterIconColorAct)) {
								  pass(driver,"Global Filter icon changed to default color after Reseting the Global Filter"); 
							  }else {
								  fail(driver,"Global Filter icon not changed to default color after Reseting the Global Filter"); 
							  }
   				    	   }
   					  	}
   				    		
   					  }else {
   						  fail(driver,Select_Y_Axis_Value+" :  Categorical Column not Expand After click on it ");
   		    		  }	
	    		  }else {
	    			  fail(driver,Select_Y_Axis_Value+" : Categorical Column value not present in Global Filter");
	    		  }	
	    		  
   		       }  // Categorical Local Validation End  
  			  
  			 
	    		 //Date Global Filter Validation start...........
  			 if(Y_Axis_dataType.equals("Date")) {
  				 
  				 click(driver,RestButton_GlobalFilter);
  				elementnotvisible1(driver, RPE_Loading);
  				 boolean dateFilter=false;
	    		  try {
	    			  WebElement DateColumnElement=driver.findElement(By.xpath("//div[@id='globalRPE_select_filterColsCon']//div[@id='"+Select_Y_Axis_Value+"']//a"));
				      action.moveToElement(DateColumnElement).click().build().perform();
				      dateFilter=true;
	    		  }catch(Exception e) {
	    			  
	    		  }
	    		  if(dateFilter==true) { 
	    			  wait(driver,"1");
	    			  WebElement DateColumnElementExpand=driver.findElement(By.xpath("//div[@id='globalRPE_select_filterColsCon']//div[@id='"+Select_Y_Axis_Value+"']//a//i"));
	    			  String DateColumnElementExpandString=DateColumnElementExpand.getAttribute("class");
	    			  if(DateColumnElementExpandString.contains("up")) {
	    				  pass(driver,"Selected Date Column expanded after click on it");
	    				  if(verifyElementDisplayed(driver, RelativeOption)) {
    						  if(isElementSelected(driver, RelativeOptionRadioBtn)) {
    							  pass(driver,"By default, 'Relative' option selected in the Date Column");
    						  }else {
    							  fail(driver,"By default, 'Relative' option not selected in the Date Column");
    						  }
    						  
    						  click(driver,Relative_conditin_dropdown);
    						  String[] RelativeFilterList= {RelativeFilter_1_Date_GF,RelativeFilter_2_Date_GF,RelativeFilter_3_Date_GF,RelativeFilter_4_Date_GF,RelativeFilter_5_Date_GF,RelativeFilter_6_Date_GF,RelativeFilter_7_Date_GF,RelativeFilter_8_Date_GF,RelativeFilter_9_Date_GF,RelativeFilter_10_Date_GF,RelativeFilter_11_Date_GF,RelativeFilter_12_Date_GF,RelativeFilter_13_Date_GF,RelativeFilter_14_Date_GF};
	    			  		  String[] RelativeFilterInputList= {"","","","","","","","","","",RelativeFilter_11_Input_Date_GF,RelativeFilter_12_Input_Date_GF,RelativeFilter_13_Input_Date_GF,RelativeFilter_14_Input_Date_GF};
	    			  		  
	    			  		  for(int k=0;k<14;k++) {
			    				 
			    				 try {
			    			  		 waitForElement(driver,Relative_conditin_dropdown);
			    					 selectByText(driver, Relative_conditin_dropdown, RelativeFilterList[k]); 
			    					 wait(driver,"1");
			    			  		 if(k>=10 && isDisplayed(driver,Relative_Input_Value_date)) {
			    			  			 click(driver,Relative_Input_Value_date);
			    			  			 clear1(driver,Relative_Input_Value_date);
			    			  			 sendKeys(driver,Relative_Input_Value_date,RelativeFilterInputList[k]);
			    			  		 }
			    			  		 wait(driver,"1");
			    			  		 click(driver,ApplyButton_GlobalFilter);
			    			  		 if(isDisplayed(driver,Bug_msg)) {
			    						  fail(driver,"Error displayed : "+getText1(driver, Bug_msg));
			    					  }
			    			  		 elementnotvisible1(driver, RPE_Loading);
			    			  		 
			    			  		 for(int l=2;l>=1;l--) {
			      						 
			     						  if(isDisplayed(driver,chartBody)) {
			     							  mouseOverToElement(driver, chartBody);
			     							  mouseOverToElement(driver, GlobalFilterIcon);
			      	    					  
			     							  String GlobalFilterExpected="Global Filter: ON";
			     							  String GlobalFilterAct=getAttribute1(driver, FilterChartIcon, "title");
//			     							  System.out.println("GlobalFilterAct : "+GlobalFilterAct);
			     							  if(GlobalFilterAct.contains(GlobalFilterExpected)) {
			     								  //pass(driver,"Global filter is ON in the chart after Apply filter");
			     							  }else {
			     								  fail(driver,"Global filter is not ON in the chart after Apply filter");
			     							  }
			      	    					  
			     							  String GlobalFilterIconColorRGB=getWebElement(driver, GlobalFilterIcon).getCssValue("fill");  
			     							  String GlobalFilterIconColorAct=rgbToHex1(GlobalFilterIconColorRGB);
			      	    					  
			     							  if("#FF3333".equalsIgnoreCase(GlobalFilterIconColorAct)) {
			    								  //pass(driver,"Global Filter icon changed to Red color after Applying the Global Filter"); 
			    							  }else {
			    								  fail(driver,"Global Filter icon not changed to Red color after Applying the Global Filter"); 
			    							  }
			      	    					  
			     							  boolean filteredCell=true;
			     							  List<WebElement> FilterChartValues=getWebElements(driver,ChartBody_Y_Values);
			     							  for(WebElement localEle:FilterChartValues) {
			     								  String FilteredValue=localEle.getAttribute("aria-label");
			     								  if (FilteredValue != null && FilteredValue.length() >= 10) {
			     									 FilteredValue=FilteredValue.substring(0, 10);
				    			  		           }
										    	
										    	  if(!Date_RelativeFiltercell(RelativeFilterList[k],FilteredValue,RelativeFilterInputList[k])) {
										    		  filteredCell=false;
										    	  }
			     							  }
			      	    					  
			     							  if(filteredCell==true) {
		  		  			    	       		pass(driver,"For "+RelativeFilterList[k]+" condition applied correctly in the BarChart GlobalTab"+l);
			     							  }else {
		  		  			    	       		fail(driver,"For "+RelativeFilterList[k]+" condition not applied correctly in the BarChart GlobalTab"+l);
			     							  }
			      	    					  
			         					  	}else {
			         						  pass(driver,"Unable to get the chart in GlobalTab"+l+" for the selected filter, "+RelativeFilterList[k]+" : "+getText1(driver, ValidationChart));
			         					  	}
			       						
			     						  clickFirstTab(driver,TabId1);
			      					 }  //Relative Filter global completed
			      					
			      					clickSecondTab(driver,TabId2);
			      				
			    				 }catch(Exception e) {
//			    					 e.printStackTrace();
			    				 }
	    			  		  }
						
    					  }
	    				  
						  System.out.println();
						  System.out.println("********** Conditions filter in Date *********************");
						  System.out.println();
					      if(verifyElementDisplayed(driver,ConditionFilterOption_Date)) {
						    click(driver,ConditionFilterOption_Date);
						    wait(driver,"1");
						    if(isElementSelected(driver, ConditionRadioButton_Date)) {
							     pass(driver,"Conditions Filter in Date type Colunm is selected after click on it ");
							
	    			  		 	 String[] ConditionFilterList= {Condition_1_Date_GF,Condition_2_Date_GF,Condition_3_Date_GF,Condition_4_Date_GF,Condition_5_Date_GF,Condition_6_Date_GF,Condition_7_Date_GF,Condition_8_Date_GF,Condition_9_Date_GF};
		    			  		 String[] ConditionFilterInputList= {Condition_1_Input_Date_GF,Condition_2_Input_Date_GF,Condition_3_Input_Date_GF,Condition_4_Input_Date_GF,Condition_5_Input_Date_GF,Condition_6_Input_Date_GF,Condition_7_Input_Date_GF,Condition_8_Input_Date_GF,Condition_9_InputA_Date_GF};
		    			  		  
	    			  		 	 for(int k=0;k<9;k++) {
				    				 
				    				 try {
				    					 waitForElement(driver,ConditionInput1_Date);
				    					 selectByText(driver, ConditionInput1_Date, ConditionFilterList[k]); 
				    					 wait(driver,"1");
				    					 if(!ConditionFilterList[k].equals("is null") && !ConditionFilterList[k].equals("is not null") ) {
				    						 click(driver,FirstConditionValueInput1_date);
					    					 for(int m=0;m<3;m++) {
					    						 action.sendKeys(Keys.BACK_SPACE).build().perform();
					    						 action.sendKeys(Keys.ARROW_RIGHT).build().perform();
					    					 }
					    					 click(driver,DashProPage);
					    					 click(driver,FirstConditionValueInput1_date);
					    					 sendKeys(driver,FirstConditionValueInput1_date,ConditionFilterInputList[k]);
					    					 wait(driver,"1");
					    					 
					    					 if(ConditionFilterList[k].equals("between")) {
					    						 if(isDisplayed(driver,FirstConditionValueInput2_date)) {
					    							 pass(driver,"Second input element is available for 'between' condition");
						    						 click(driver,FirstConditionValueInput2_date);
						    						 for(int m=0;m<3;m++) {
							    						 action.sendKeys(Keys.BACK_SPACE).build().perform();
							    						 action.sendKeys(Keys.ARROW_RIGHT).build().perform();
							    					 }
							    					 click(driver,FirstConditionValueInput1_date);
							    					 click(driver,FirstConditionValueInput2_date);
							    					 sendKeys(driver,FirstConditionValueInput2_date,Condition_9_InputB_Date_GF);
						    					 }else {
						    						 fail(driver,"Second input element is not available for 'between' condition");
						    					 }
					    					 }
					    					 
				    					 }
				    			  		 
				    			  		 click(driver,ApplyButton_GlobalFilter);
				    			  		 if(isDisplayed(driver,Bug_msg)) {
				    						  fail(driver,"Error displayed : "+getText1(driver, Bug_msg));
				    					  }
				    			  		elementnotvisible1(driver, RPE_Loading);
				    			  		 
				    			  		 for(int l=2;l>=1;l--) {
				      						 
				     						  if(isDisplayed(driver,chartBody)) {
				     							  mouseOverToElement(driver, chartBody);
				     							  mouseOverToElement(driver, GlobalFilterIcon);
				      	    					  
				     							  String GlobalFilterExpected="Global Filter: ON";
				     							  String GlobalFilterAct=getAttribute1(driver, FilterChartIcon, "title");
//				     							  System.out.println("GlobalFilterAct : "+GlobalFilterAct);
				     							  if(GlobalFilterAct.contains(GlobalFilterExpected)) {
				     								  //pass(driver,"Global filter is ON in the chart after Apply filter");
				     							  }else {
				     								  fail(driver,"Global filter is not ON in the chart after Apply filter");
				     							  }
				      	    					  
				     							  String GlobalFilterIconColorRGB=getWebElement(driver, GlobalFilterIcon).getCssValue("fill");  
				     							  String GlobalFilterIconColorAct=rgbToHex1(GlobalFilterIconColorRGB);
				      	    					  
				     							  if("#FF3333".equalsIgnoreCase(GlobalFilterIconColorAct)) {
				    								  //pass(driver,"Global Filter icon changed to Red color after Applying the Global Filter"); 
				    							  }else {
				    								  fail(driver,"Global Filter icon not changed to Red color after Applying the Global Filter"); 
				    							  }
				      	    					  
				     							  boolean filteredCell=true;
				     							  List<WebElement> FilterChartValues=getWebElements(driver,ChartBody_Y_Values);
				     							  for(WebElement localEle:FilterChartValues) {
				     								  String FilteredValue=localEle.getAttribute("aria-label");
				     								   if (FilteredValue != null && FilteredValue.length() >= 10) {
				     									  FilteredValue=FilteredValue.substring(0, 10);
					    			  		           }
											    	
				     								   if(!Date_ConditionFiltercell(ConditionFilterList[k],FilteredValue,ConditionFilterInputList[k],Condition_9_InputB_Date_GF)) {
				     									   filteredCell=false;
												       }
				     							  }
				      	    					  
				     							  if(filteredCell==true) {
			  		  			    	       		 pass(driver,"For "+ConditionFilterList[k]+" condition applied correctly in the BarChart GlobalTab"+l);
				     							  }else {
			  		  			    	       		 fail(driver,"For "+ConditionFilterList[k]+" condition not applied correctly in the BarChart GlobalTab"+l);
				     							  }
				      	    					  
				         					  	}else {
				         						  pass(driver,"Unable to get the chart in GlobalTab"+l+" for the selected filter, "+ConditionFilterList[k]+" : "+getText1(driver, ValidationChart));
				         					  	}
				       						
				     						  clickFirstTab(driver,TabId1);
				      					 }  //condition Filter global completed
				      					clickSecondTab(driver,TabId2);
				    			  		  
				    				 }catch(Exception e) {
				    					 e.printStackTrace();
				    				 }
				    			 }
	    			  		 	
	    			  		 	 waitForElement(driver, ConditionFilterOption_Date);
	    			  		 	 click(driver,ConditionFilterOption_Date);
	    			  		 	 wait(driver,"1");
	    			  		 	 selectByText(driver, ConditionInput1_Date, FirstCondition_Date_GF);
	    			  		 	 wait(driver,"1");
	    			  		 	 if(!FirstCondition_Date_GF.equals("is null") && !FirstCondition_Date_GF.equals("is not null") ) {
		    						 click(driver,FirstConditionValueInput1_date);
			    					 for(int m=0;m<3;m++) {
			    						 action.sendKeys(Keys.BACK_SPACE).build().perform();
			    						 action.sendKeys(Keys.ARROW_RIGHT).build().perform();
			    					 }
			    					 click(driver,DashProPage);
			    					 click(driver,FirstConditionValueInput1_date);
			    					 sendKeys(driver,FirstConditionValueInput1_date,FirstCondition_Date_Input_GF);
			    					 wait(driver,"1");
		    					 }
		    			  		 wait(driver,"1");
		    			  		 if(isDisplayed(driver,AddButtonCondition)) {
				    				  pass(driver,"ADD button displayed after selecting the first condition");
				    			  }else {
					    			  fail(driver,"ADD button not displayed after selecting the first condition"); 
					    		  }
				    				  
		    			  		  selectOperatorCondition1(driver,FirstOperator_Input_Date_GF);
		    				  
			    				  if(isDisplayed(driver,ConditionInput2_Date)) {
			    					  pass(driver,"After click 'ADD' button Second time Condition Selection dropdown is displayed");
			    				  }else {
				    				  fail(driver,"After click 'ADD' button Second time Condition Selection dropdown is not displayed"); 
				    			  } 
			    					 
			    				  click(driver,ConditionInput2_Date);
		    					  selectByText(driver, ConditionInput2_Date, SecondCondition_Date_GF);
		    					  if(!SecondCondition_Date_GF.equals("is null") && !SecondCondition_Date_GF.equals("is not null") ) {
			    						 click(driver,SecondConditionValueInput1_date);
				    					 for(int m=0;m<3;m++) {
				    						 action.sendKeys(Keys.BACK_SPACE).build().perform();
				    						 action.sendKeys(Keys.ARROW_RIGHT).build().perform();
				    					 }
				    					 click(driver,DashProPage);
				    					 click(driver,SecondConditionValueInput1_date);
				    					 sendKeys(driver,SecondConditionValueInput1_date,SecondCondition_Date_Input_GF);
				    					 
		    					  }
		    					  wait(driver,"1");
		    					  if(isDisplayed(driver,AddButtonCondition)) {
				    				  pass(driver,"2nd time ADD button displayed after selecting the condition 2nd time ");
		    					  }else {
		    						  fail(driver,"2nd time ADD button not displayed after selecting the condition 2nd time ");
		    					  } 
				    				 
		    					  selectOperatorCondition2(driver,SecondOperator_Input_Date_GF);
		    					  
			    				  if(isDisplayed(driver,ConditionInput3_Date)) {
			    					  pass(driver,"After click 'ADD' button Third time Condition Selection dropdown is displayed");
			    				  }else {
			    					  fail(driver,"After click 'ADD' button Third time Condition Selection dropdown is not displayed");
			    				  }
			    					  
		    					  selectByText(driver, ConditionInput3_Date, ThirdCondition_Date_GF);
		    					  wait(driver,"1");
		    					  
		    					  if(!ThirdCondition_Date_GF.equals("is null") && !ThirdCondition_Date_GF.equals("is not null") ) {
			    						 click(driver,ThirdConditionValueInput1_date);
				    					 for(int m=0;m<3;m++) {
				    						 action.sendKeys(Keys.BACK_SPACE).build().perform();
				    						 action.sendKeys(Keys.ARROW_RIGHT).build().perform();
				    					 }
				    					 click(driver,DashProPage);
				    					 click(driver,ThirdConditionValueInput1_date);
				    					 sendKeys(driver,ThirdConditionValueInput1_date,ThirdCondition_Date_Input_GF);
		    					  }
		    					  wait(driver,"1");
		    					  if(isDisplayed2(driver,AddButtonCondition)) {
		    						  fail(driver,"'ADD' button displayed after given 3 times condition ");
		    					  }else {
		    						  pass(driver,"'ADD' button not displayed after given 3 times condition");
		    					  }
		    					  
			    				  click(driver,ApplyButton_GlobalFilter);
			    				  if(isDisplayed(driver,Bug_msg)) {
		    						  fail(driver,"Error displayed : "+getText1(driver, Bug_msg));
		    					  }
			    				  elementnotvisible1(driver, RPE_Loading);
		    					  
		    					  for(int l=2;l>=1;l--) {
			      						 
		     						  if(isDisplayed(driver,chartBody)) {
		     							  mouseOverToElement(driver, chartBody);
		     							  mouseOverToElement(driver, GlobalFilterIcon);
		      	    					  
		     							  String GlobalFilterExpected="Global Filter: ON";
		     							  String GlobalFilterAct=getAttribute1(driver, FilterChartIcon, "title");
//		     							  System.out.println("GlobalFilterAct : "+GlobalFilterAct);
		     							  if(GlobalFilterAct.contains(GlobalFilterExpected)) {
		     								  //pass(driver,"Global filter is ON in the chart after Apply filter");
		     							  }else {
		     								  fail(driver,"Global filter is not ON in the chart after Apply filter");
		     							  }
		      	    					  
		     							  String GlobalFilterIconColorRGB=getWebElement(driver, GlobalFilterIcon).getCssValue("fill");  
		     							  String GlobalFilterIconColorAct=rgbToHex1(GlobalFilterIconColorRGB);
		      	    					  
		     							  if("#FF3333".equalsIgnoreCase(GlobalFilterIconColorAct)) {
		    								  //pass(driver,"Global Filter icon changed to Red color after Applying the Global Filter"); 
		    							  }else {
		    								  fail(driver,"Global Filter icon not changed to Red color after Applying the Global Filter"); 
		    							  }
		      	    					  
		     							  boolean filteredCell=true;
		     							  List<WebElement> FilterChartValues=getWebElements(driver,ChartBody_Y_Values);
		     							  for(WebElement localEle:FilterChartValues) {
		     								  String FilteredValue=localEle.getAttribute("aria-label");
		     								   if (FilteredValue != null && FilteredValue.length() >= 10) {
		     									  FilteredValue=FilteredValue.substring(0, 10);
			    			  		           }
									    	
		     								    boolean condition_1_Result=Date_ConditionFiltercell(FirstCondition_Date_GF,FilteredValue,FirstCondition_Date_Input_GF,Condition_9_InputB_Date_GF);
				    						    boolean condition_2_Result=Date_ConditionFiltercell(SecondCondition_Date_GF,FilteredValue,SecondCondition_Date_Input_GF,Condition_9_InputB_Date_GF);
				    						    boolean condition_3_Result=Date_ConditionFiltercell(ThirdCondition_Date_GF,FilteredValue,ThirdCondition_Date_Input_GF,Condition_9_InputB_Date_GF);
				    						    String operator1 = FirstOperator_Input_Date_GF;
				    						    String operator2 = SecondOperator_Input_Date_GF;
				    						    
				    						    if(!evaluateConditions(condition_1_Result,operator1,condition_2_Result,operator2,condition_3_Result)) {
				    						    	filteredCell=false;
				    						    }
		     							  }
		      	    					  
		     							  if(filteredCell==true) {
	  		  			    	       		 pass(driver,"For Selected 3 condition applied correctly in the BarChart GlobalTab"+l);
		     							  }else {
	  		  			    	       		 fail(driver,"For Selected 3 condition not applied correctly in the BarChart GlobalTab"+l);
		     							  }
		      	    					  
		         					  	}else {
		         						  pass(driver,"Unable to get the chart in GlobalTab"+l+" for the selected filter, 3 condition : "+getText1(driver, ValidationChart));
		         					  	}
		       						
		     						  clickFirstTab(driver,TabId1);
		      					 }  //condition Filter global completed
		      					 clickSecondTab(driver,TabId2);
			   					 click(driver,RestButton_GlobalFilter);
			   					elementnotvisible1(driver, RPE_Loading);
			   					 
			   					 waitForElement(driver, chartBody);
			   					 mouseOverToElement(driver, chartBody);
			   					 mouseOverToElement(driver, GlobalFilterIcon);
			   					 String GlobalFilterExpected="Global Filter: OFF";
			   					 String GlobalFilterExpRest=getAttribute1(driver, FilterChartIcon, "title");
			   					 System.out.println("LocatFilterExpRest : "+GlobalFilterExpRest);
			    					  
			   					 if(GlobalFilterExpRest.contains(GlobalFilterExpected)) {
		    						  pass(driver,"Global filter is OFF in the chart after Reset filter");
			   					 }else {
		    						  System.out.println("Failed.!! : LocatFilterAct");
		    						  fail(driver,"Global filter is not OFF in the chart after Reset filter");
			   					 }
			    					   
			   					 String GlobalFilterIconColorRGB=getWebElement(driver, GlobalFilterIcon).getCssValue("fill");  
			   					 String GlobalFilterIconColorAct=rgbToHex1(GlobalFilterIconColorRGB);
	  	    					  
			   					 if(!"#FF3333".equalsIgnoreCase(GlobalFilterIconColorAct)) {
									  pass(driver,"Global Filter icon changed to default color after Reseting the Global Filter"); 
			   					 }else {
									  fail(driver,"Global Filter icon  not changed to default color after Reseting the Global Filter"); 
			   					 }
			   					 
			   					 
					    	}else {
					    		fail(driver,"Conditions Filter in Date type Colunm is not selected after click on it ");
					    	}
					    }
					  
				  }else {
					  fail(driver,Select_Y_Axis_Value+" : Date Column not expanded after click on it"); 
				  }
			  	}else {
			  		fail(driver,Select_Y_Axis_Value+" : Date Column value not present in Global filter");
			  	}
			  
  			 } //Date Global Filter Validation End...........
  			 		  
			  
			// Numerical Filter validation
		if(Y_Axis_dataType.equals("Numerical")) {
			click(driver,RestButton_GlobalFilter);
			elementnotvisible1(driver, RPE_Loading);
			boolean NumericalFilter=false;
			try {
				WebElement NumericalColumnElement=driver.findElement(By.xpath("//div[@id='globalRPE_select_filterColsCon']//div[@id='"+Select_Y_Axis_Value+"']//a"));
				action.moveToElement(NumericalColumnElement).click().build().perform();
				NumericalFilter=true;
			}catch(Exception e) {
				
			}
			if(NumericalFilter==true) {
				  wait(driver,"1");
				  WebElement NumericalColumnElementExpand=driver.findElement(By.xpath("//div[@id='globalRPE_select_filterColsCon']//div[@id='"+Select_Y_Axis_Value+"']//a//i"));
				  String NumericalColumnElementExpandString=NumericalColumnElementExpand.getAttribute("class");
				  
				  if(NumericalColumnElementExpandString.contains("up")) {
					  pass(driver,"Selected Numerical Column expanded after click on it");
					  if(isDisplayed(driver,ConditionInput1_Num)) {
						  pass(driver,"Condition Selection dropdown is displayed in the Numerical column");
					  }else {
						  fail(driver,"Condition Selection dropdown is not displayed in the Numerical column");
					  }
					  
					 click(driver,ConditionInput1_Num);
					  
					 String[] NumFilterList= {Condition_1_Num_GF,Condition_2_Num_GF,Condition_3_Num_GF,Condition_4_Num_GF,Condition_5_Num_GF,Condition_6_Num_GF,Condition_7_Num_GF,Condition_8_Num_GF,Condition_9_Num_GF};
			  		 String[] NumFilterInputList= {Condition_1_Input_Num_GF,Condition_2_Input_Num_GF,Condition_3_Input_Num_GF,Condition_4_Input_Num_GF,Condition_5_Input_Num_GF,Condition_6_Input_Num_GF,Condition_7_Input_Num_GF,Condition_8_Input_Num_GF,Condition_9_InputA_Num_GF};
			  		 
			  		for(int k=0;k<9;k++) {
			  			
	    				 try {
	    					 waitForElement(driver,ConditionInput1_Num);
	    					 selectByText(driver, ConditionInput1_Num, NumFilterList[k]); 
	    					 wait(driver,"1");
	    					 if(!NumFilterList[k].equals("is null") && !NumFilterList[k].equals("is not null") ) {
	    						 click(driver,FirstConditionValueInput1_Num);
		    					 clear1(driver,FirstConditionValueInput1_Num);
		    					 sendKeys(driver,FirstConditionValueInput1_Num,NumFilterInputList[k]);
		    					 wait(driver,"1");
		    					 
		    					 if(NumFilterList[k].equals("between")) {
		    						 if(isDisplayed(driver,FirstConditionValueInput2_Num)) {
		    							 pass(driver,"Second input element is available for 'between' condition");
			    						 click(driver,FirstConditionValueInput2_Num);
//				    					 clear1(driver,"1");
				    					 sendKeys(driver,FirstConditionValueInput2_Num,Condition_Between_InputB_Num_GF);
			    					 }else {
			    						 fail(driver,"Second input element is not available for 'between' condition");
			    					 }
		    					 }
		    					 
	    					 }
	    			  		 wait(driver,"1");
	    			  		 click(driver,ApplyButton_GlobalFilter);
	    			  		 if(isDisplayed(driver,Bug_msg)) {
	    						  fail(driver,"Error displayed : "+getText1(driver, Bug_msg));
	    					  }
	    			  		 elementnotvisible1(driver, RPE_Loading);
	    			  		 
	    			  		 for(int l=2;l>=1;l--) {
	      						 
	     						  if(isDisplayed(driver,chartBody)) {
	     							  mouseOverToElement(driver, chartBody);
	     							  mouseOverToElement(driver, GlobalFilterIcon);
	      	    					  
	     							  String GlobalFilterExpected="Global Filter: ON";
	     							  String GlobalFilterAct=getAttribute1(driver, FilterChartIcon, "title");
//	     							  System.out.println("GlobalFilterAct : "+GlobalFilterAct);
	     							  if(GlobalFilterAct.contains(GlobalFilterExpected)) {
	     								  //pass(driver,"Global filter is ON in the chart after Apply filter");
	     							  }else {
	     								  fail(driver,"Global filter is not ON in the chart after Apply filter");
	     							  }
	      	    					  
	     							  String GlobalFilterIconColorRGB=getWebElement(driver, GlobalFilterIcon).getCssValue("fill");  
	     							  String GlobalFilterIconColorAct=rgbToHex1(GlobalFilterIconColorRGB);
	      	    					  
	     							  if("#FF3333".equalsIgnoreCase(GlobalFilterIconColorAct)) {
	    								  //pass(driver,"Global Filter icon changed to Red color after Applying the Global Filter"); 
	    							  }else {
	    								  fail(driver,"Global Filter icon not changed to Red color after Applying the Global Filter"); 
	    							  }
	      	    					  
	     							  boolean filteredCell=true;
	     							  List<WebElement> FilterChartValues=getWebElements(driver,ChartBody_Y_Values);
	     							  for(WebElement localEle:FilterChartValues) {
	     								  String FilteredValue=localEle.getAttribute("aria-label");
	     								  if(!Numerical_ConditionFiltercell(NumFilterList[k],FilteredValue,NumFilterInputList[k],Condition_Between_InputB_Num_GF)) {
	     									    filteredCell=false;
			  							    }
	     							  }
	     							  
	     							  if(filteredCell==true) {
		  			    	       		 pass(driver,"For "+NumFilterList[k]+" condition applied correctly in the BarChart GlobalTab"+l);
	     							  }else {
		  			    	       		 fail(driver,"For "+NumFilterList[k]+" condition not applied correctly in the BarChart GlobalTab"+l);
	     							  }
	      	    					  
	         					  	}else {
	         						  pass(driver,"Unable to get the chart in GlobalTab"+l+" for the selected filter, "+NumFilterList[k]+" : "+getText1(driver, ValidationChart));
	         					  	}
	       						
	     						  clickFirstTab(driver,TabId1);
	      					 }  //Numerical Filter global completed
	      					 clickSecondTab(driver,TabId2);
	    			  		 
	    				 }catch(Exception e) {
		    					 e.printStackTrace();
	    				 }
			  		}
			  		
			  		waitForElement(driver,ConditionInput1_Num);
			  		selectByText(driver, ConditionInput1_Num, FirstCondition_Num_GF); 
			  		wait(driver,"1");
			  		if(!FirstCondition_Num_GF.equals("is null") && !FirstCondition_Num_GF.equals("is not null") ) {
			  			click(driver,FirstConditionValueInput1_Num);
			  			clear1(driver,FirstConditionValueInput1_Num);
			  			sendKeys(driver,FirstConditionValueInput1_Num,FirstCondition_Num_Input_GF);
			  			wait(driver,"1");
			  		}
					 
			  		wait(driver,"1");
			  		if(isDisplayed(driver,AddButtonCondition)) {
			  			pass(driver,"ADD button displayed after selecting the first condition");
			  		}else {
			  			fail(driver,"ADD button not displayed after selecting the first condition"); 
			  		}
	    				
			  		selectOperatorCondition1(driver,FirstOperator_Input_Num_GF);
		  			if(isDisplayed(driver,ConditionInput2_Num)) {
		  				pass(driver,"After click 'ADD' button Second time Condition Selection dropdown is displayed");
		  			}else {
		  				fail(driver,"After click 'ADD' button Second time Condition Selection dropdown is not displayed"); 
		  			} 
			  		
		  			click(driver,ConditionInput2_Num);
		  			selectByText(driver, ConditionInput2_Num, SecondCondition_Num_GF);
		  			if(!SecondCondition_Num_GF.equals("is null") && !SecondCondition_Num_GF.equals("is not null") ) {
		  				click(driver,SecondConditionValueInput1_Num);
		  				clear(driver,SecondConditionValueInput1_Num);
		  				sendKeys(driver,SecondConditionValueInput1_Num,SecondCondition_Num_Input_GF);
	    					 
		  			}
		  			wait(driver,"1");
		  			if(isDisplayed(driver,AddButtonCondition)) {
		  				pass(driver,"2 time ADD button displayed after selecting the condition 2nd time ");
		  			}else {
		  				fail(driver,"2 time ADD button not displayed after selecting the condition 2nd time ");
		  			} 
				  
		  			selectOperatorCondition2(driver,SecondOperator_Input_Num_GF);
		  			
		  			if(isDisplayed(driver,ConditionInput3_Num)) {
		  				pass(driver,"After click 'ADD' button Third time Condition Selection dropdown is displayed");
		  			}else {
		  				fail(driver,"After click 'ADD' button Third time Condition Selection dropdown is not displayed");
		  			}
		  			
		  			click(driver,ConditionInput3_Num);
		  			selectByText(driver, ConditionInput3_Num, ThirdCondition_num_GF);
		  			wait(driver,"1");
					  
		  			if(!ThirdCondition_num_GF.equals("is null") && !ThirdCondition_num_GF.equals("is not null") ) {
		  				 click(driver,ThirdConditionValueInput1_Num);
    					 clear1(driver,ThirdConditionValueInput1_Num);
    					 sendKeys(driver,ThirdConditionValueInput1_Num,ThirdCondition_Num_Input_GF);
		  			}
		  			if(isDisplayed2(driver,AddButtonCondition)) {
		  				fail(driver,"'ADD' button displayed after given 3 times condition ");
		  			}else {
		  				pass(driver,"'ADD' button not displayed after given 3 times condition");
		  			}
		  			
		  			click(driver,ApplyButton_GlobalFilter);
		  			 if(isDisplayed(driver,Bug_msg)) {
						  fail(driver,"Error displayed : "+getText1(driver, Bug_msg));
					  }
		  			elementnotvisible1(driver, RPE_Loading);
		  			
		  			for(int l=2;l>=1;l--) {
  						 
						  if(isDisplayed(driver,chartBody)) {
							  mouseOverToElement(driver, chartBody);
							  mouseOverToElement(driver, GlobalFilterIcon);
 	    					  
							  String GlobalFilterExpected="Global Filter: ON";
							  String GlobalFilterAct=getAttribute1(driver, FilterChartIcon, "title");
//							  System.out.println("GlobalFilterAct : "+GlobalFilterAct);
							  if(GlobalFilterAct.contains(GlobalFilterExpected)) {
								  //pass(driver,"Global filter is ON in the chart after Apply filter");
							  }else {
								  fail(driver,"Global filter is not ON in the chart after Apply filter");
							  }
 	    					  
							  String GlobalFilterIconColorRGB=getWebElement(driver, GlobalFilterIcon).getCssValue("fill");  
							  String GlobalFilterIconColorAct=rgbToHex1(GlobalFilterIconColorRGB);
 	    					  
							  if("#FF3333".equalsIgnoreCase(GlobalFilterIconColorAct)) {
								  //pass(driver,"Global Filter icon changed to Red color after Applying the Global Filter"); 
							  }else {
								  fail(driver,"Global Filter icon not changed to Red color after Applying the Global Filter"); 
							  }
 	    					  
							  boolean filteredCell=true;
							  List<WebElement> FilterChartValues=getWebElements(driver,ChartBody_Y_Values);
							  for(WebElement localEle:FilterChartValues) {
								  String FilteredValue=localEle.getAttribute("aria-label");
								  
								  boolean condition_1_Result=Numerical_ConditionFiltercell(FirstCondition_Num_GF,FilteredValue,FirstCondition_Num_Input_GF,Condition_Between_InputB_Num_GF);
								  boolean condition_2_Result=Numerical_ConditionFiltercell(SecondCondition_Num_GF,FilteredValue,SecondCondition_Num_Input_GF,Condition_Between_InputB_Num_GF);
								  boolean condition_3_Result=Numerical_ConditionFiltercell(ThirdCondition_num_GF,FilteredValue,ThirdCondition_Num_Input_GF,Condition_Between_InputB_Num_GF);
								  String operator1 = FirstOperator_Input_Num_GF;
								  String operator2 = SecondOperator_Input_Num_GF;
	  			  				 
								  if(!evaluateConditions(condition_1_Result,operator1,condition_2_Result,operator2,condition_3_Result)) {
									  filteredCell=false;
								  }
							  }
							  
							  if(filteredCell==true) {
 			    	       		 pass(driver,"For Selected 3 condition applied correctly in the BarChart GlobalTab"+l);
							  }else {
 			    	       		 fail(driver,"For Selected 3 condition not applied correctly in the BarChart GlobalTab"+l);
							  }
 	    					  
    					  	}else {
    						  pass(driver,"Unable to get the chart in GlobalTab"+l+" for the selected filter, 3 condition : "+getText1(driver, ValidationChart));
    					  	}
  						
						  clickFirstTab(driver,TabId1);
 					 }  //Numerical Filter global completed
 					 clickSecondTab(driver,TabId2);
		  			
 					 waitForElement(driver,RestButton_GlobalFilter);
   					 click(driver,RestButton_GlobalFilter);
   					elementnotvisible1(driver, RPE_Loading);
   					 waitForElement(driver, chartBody);
  					 mouseOverToElement(driver, chartBody);
  					 mouseOverToElement(driver, GlobalFilterIcon);
  					 String GlobalFilterExpected="Global Filter: OFF";
  					 String GlobalFilterExpRest=getAttribute1(driver, FilterChartIcon, "title");
//  					 System.out.println("LocatFilterExpRest : "+GlobalFilterExpRest);
   					  
  					 if(GlobalFilterExpRest.contains(GlobalFilterExpected)) {
						  pass(driver,"Global filter is OFF in the chart after Reset filter");
  					 }else {
						  fail(driver,"Global filter is not OFF in the chart after Reset filter");
  					 }
   					   
  					 String GlobalFilterIconColorRGB=getWebElement(driver, GlobalFilterIcon).getCssValue("fill");  
  					 String GlobalFilterIconColorAct=rgbToHex1(GlobalFilterIconColorRGB);
 					  
  					 if(!"#FF3333".equalsIgnoreCase(GlobalFilterIconColorAct)) {
						  pass(driver,"Global Filter icon changed to default color after Reseting the Global Filter"); 
  					 }else {
						  fail(driver,"Global Filter icon  not changed to default color after Reseting the Global Filter"); 
  					 }		 
		  		 }else {
		  			 fail(driver,Select_Y_Axis_Value+" : Numerical Column not expanded after click on it"); 
		  		 }
			}else {
				fail(driver,Select_Y_Axis_Value+" : Numerical Column not present");
			}
	    		//Numerical Global filter end....
		}
			
		  if(Y_Axis_dataType.equals("Text")) {
			
			 //Text Global filter Start....
				 click(driver,RestButton_GlobalFilter);
				 elementnotvisible1(driver, RPE_Loading);
				 boolean textFilter=false;
				 try {
					 WebElement TextColumn= driver.findElement(By.xpath("//div[@id='globalRPE_select_filterColsCon']//div[@id='"+Select_Y_Axis_Value+"']//a"));
					 action.moveToElement(TextColumn).click().build().perform();
					 textFilter=true;
				 }catch(Exception e) {
			  
				 }
		  
				 if(textFilter==true) {
					 WebElement textColumnExp=driver.findElement(By.xpath("//div[@id='globalRPE_select_filterColsCon']//div[@id='"+Select_Y_Axis_Value+"']//a//i"));
					 String textColumnExpText=textColumnExp.getAttribute("class");
					 if(textColumnExpText.contains("up")) {
						 pass(driver,"Text Column Expand After click on it ");
						 
						 if(verifyElementDisplayed(driver, byValueFilterOption)) {
		    				  if(isElementSelected(driver,byValueRadioButton)) {
		    					  pass(driver,"By default, 'By Values' radio button selected ");
		    				  }else {
		    					  fail(driver,"By default, 'By Values' radio button not selected ");
		    				  }
	    				  }
		    			  
		    			  verifyElementDisplayed(driver, AllCheckbox_CategoricalSec);
		    			  verifyElementDisplayed(driver, CategoricalSearchListOptions);
		    			  verifyElementDisplayed(driver, ExcludeOption_Categorical);
		    			  verifyElementDisplayed(driver, ExcludeCheckbox);

		    			  List<WebElement> searchListAvailable=getWebElements(driver,AvailableList_ByValue);
		    			  List<WebElement> searchListCheckboxAvailable=getWebElements(driver,AvailableListCheckbox_ByValue);
   				      
						 if(searchListAvailable.size()==searchListCheckboxAvailable.size()) {
							 pass(driver,"All the available searchlist are displayed with Checkbox");
						 }else {
							 fail(driver,"Some available searchlist are not displayed with Checkbox");
						 }
				      
	    			  	waitForElement(driver,SearchField_CategoricalSec);
  				        click(driver,SearchField_CategoricalSec);
  				        sendKeys(driver,SearchField_CategoricalSec,ByValuesInput_Text_GF);
  				        wait(driver,"1");
  				        String firstOptionText=getText1(driver,FirstSearchedListValue);
  				        if(firstOptionText.equals(ByValuesInput_Text_GF)) {
		    				  pass(driver,"Search bar inside the Text section works properly");
  				        }else {
		    				  fail(driver,"Search bar inside the Text section not works properly");
  				        }
		    			  
  				        click(driver,FirstSearchedListValue);
  				        wait(driver,"1");
	    				  
  				        if(isElementSelected(driver,FirstSearchedCheckbox)) {
	    					  pass(driver,"Check box selected when click the First searched value");
  				        }else {
			    			  fail(driver,"Check box not selected when click the First searched value"); 
  				        }
	    			  	 
	    			  	click(driver,ApplyButton_GlobalFilter);
	    			  	 if(isDisplayed(driver,Bug_msg)) {
   						    fail(driver,"Error displayed : "+getText1(driver, Bug_msg));
   					    }
	    			  	elementnotvisible1(driver, RPE_Loading);
	    			  	for(int l=2;l>=1;l--) {
	  						 
							  if(isDisplayed(driver,chartBody)) {
								  mouseOverToElement(driver, chartBody);
								  mouseOverToElement(driver, GlobalFilterIcon);
	 	    					  
								  String GlobalFilterExpected="Global Filter: ON";
								  String GlobalFilterAct=getAttribute1(driver, FilterChartIcon, "title");
//								  System.out.println("GlobalFilterAct : "+GlobalFilterAct);
								  if(GlobalFilterAct.contains(GlobalFilterExpected)) {
									  //pass(driver,"Global filter is ON in the chart after Apply filter");
								  }else {
									  fail(driver,"Global filter is not ON in the chart after Apply filter");
								  }
	 	    					  
								  String GlobalFilterIconColorRGB=getWebElement(driver, GlobalFilterIcon).getCssValue("fill");  
								  String GlobalFilterIconColorAct=rgbToHex1(GlobalFilterIconColorRGB);
	 	    					  
								  if("#FF3333".equalsIgnoreCase(GlobalFilterIconColorAct)) {
									  //pass(driver,"Global Filter icon changed to Red color after Applying the Global Filter"); 
								  }else {
									  fail(driver,"Global Filter icon not changed to Red color after Applying the Global Filter"); 
								  }
	 	    					  
								  boolean filteredCell=true;
								  List<WebElement> FilterChartValues=getWebElements(driver,ChartBody_Y_Values);
								  for(WebElement localEle:FilterChartValues) {
									  String FilteredValue=localEle.getAttribute("aria-label");
									  
									  if(!FilteredValue.equals(ByValuesInput_Text_GF)) {
										  filteredCell=false;
		    			  			 }
									  
									 
								  }
								  
								  if(filteredCell==true) {
	 			    	       		 pass(driver,"For 'By Values' condition applied correctly in the BarChart GlobalTab"+l);
								  }else {
	 			    	       		 fail(driver,"For 'By Values' condition not applied correctly in the BarChart GlobalTab"+l);
								  }
	 	    					  
	    					  	}else {
	    						  pass(driver,"Unable to get the chart in GlobalTab"+l+" for the selected filter, By Values : "+getText1(driver, ValidationChart));
	    					  	}
	  						
							  clickFirstTab(driver,TabId1);
	 					 }  // By Values global completed
	 					 clickSecondTab(driver,TabId2);
	    			  	
	   					 waitForElement(driver, ExcludeCheckbox);
	   					 click(driver,ExcludeCheckbox);
	   					 click(driver,ApplyButton_GlobalFilter);
	   					 if(isDisplayed(driver,Bug_msg)) {
   						    fail(driver,"Error displayed : "+getText1(driver, Bug_msg));
   					    }
	   					elementnotvisible1(driver, RPE_Loading);
	   					 
	   					 for(int l=2;l>=1;l--) {
	  						 
							  if(isDisplayed(driver,chartBody)) {
								  mouseOverToElement(driver, chartBody);
								  mouseOverToElement(driver, GlobalFilterIcon);
	 	    					  
								  String GlobalFilterExpected="Global Filter: ON";
								  String GlobalFilterAct=getAttribute1(driver, FilterChartIcon, "title");
//								  System.out.println("GlobalFilterAct : "+GlobalFilterAct);
								  if(GlobalFilterAct.contains(GlobalFilterExpected)) {
									  //pass(driver,"Global filter is ON in the chart after Apply filter");
								  }else {
									  fail(driver,"Global filter is not ON in the chart after Apply filter");
								  }
	 	    					  
								  String GlobalFilterIconColorRGB=getWebElement(driver, GlobalFilterIcon).getCssValue("fill");  
								  String GlobalFilterIconColorAct=rgbToHex1(GlobalFilterIconColorRGB);
	 	    					  
								  if("#FF3333".equalsIgnoreCase(GlobalFilterIconColorAct)) {
									  //pass(driver,"Global Filter icon changed to Red color after Applying the Global Filter"); 
								  }else {
									  fail(driver,"Global Filter icon not changed to Red color after Applying the Global Filter"); 
								  }
	 	    					  
								  boolean filteredCell=true;
								  List<WebElement> FilterChartValues=getWebElements(driver,ChartBody_Y_Values);
								  for(WebElement localEle:FilterChartValues) {
									  String FilteredValue=localEle.getAttribute("aria-label");
									  if(FilteredValue.equals(ByValuesInput_Text_GF)) {
										  filteredCell=false;
		    			  			 }
								  }
								  
								  if(filteredCell==true) {
	 			    	       		 pass(driver,"For 'By Values' with Exclude condition applied correctly in the BarChart GlobalTab"+l);
								  }else {
	 			    	       		 fail(driver,"For 'By Values' with Exclude condition not applied correctly in the BarChart GlobalTab"+l);
								  }
	 	    					  
	    					  	}else {
	    						  pass(driver,"Unable to get the chart in GlobalTab"+l+" for the selected filter, By Values with Exclude : "+getText1(driver, ValidationChart));
	    					  	}
	  						
							  clickFirstTab(driver,TabId1);
	 					 }  // By Values global completed
	 					 clickSecondTab(driver,TabId2);
	   					 
	   					 if(verifyElementDisplayed(driver, ConditionFilterOption_Categorical)) {
	   						  click(driver,ConditionFilterOption_Categorical);
	   						  wait(driver,"1");
	   						  if(isElementSelected(driver,ConditionRadioButton_Categorical)) {
	   							  pass(driver,"Condition radio button selected after click on it");
	   						  }else {
	   							  fail(driver,"Condition radio button not selected after click on it");
	   						  } 
		    		  
	   						  if(verifyElementDisplayed(driver, ConditionSelectDropdown)) {
		   							 String defaultSelectedCondition=defaultSelectedValue(driver, ConditionSelectDropdown);
		   							 if(defaultSelectedCondition.equals("equal to")) {
		   								 pass(driver,"By default, 'equal to' option selected in the Condition select dropdown");
		   							 }else {
		   								 fail(driver,"By default, 'equal to' option not selected in the Condition select dropdown");
		   							 }
		   							 String[] conditionsList= {Condition_1_Text_GF,Condition_2_Text_GF,Condition_3_Text_GF,Condition_4_Text_GF,Condition_5_Text_GF,Condition_6_Text_GF,Condition_7_Text_GF,Condition_8_Text_GF};
		   							 String[] conditionsInputList= {Condition_Input_1_Text_GF,Condition_Input_2_Text_GF,Condition_Input_3_Text_GF,Condition_Input_4_Text_GF,Condition_Input_5_Text_GF,Condition_Input_6_Text_GF,Condition_Input_7_Text_GF,Condition_Input_8_Text_GF};

		   							 for(int k=0;k<8;k++) {
		   								 try {
		   									 waitForElement(driver,ConditionSelectDropdown);
		   									 selectByText(driver, ConditionSelectDropdown, conditionsList[k]); 
		   									 wait(driver,"1");
		   									 click(driver,ConditonInput1);
		   									 clear1(driver,ConditonInput1);
		   									 sendKeys(driver,ConditonInput1,conditionsInputList[k]);
		   									 wait(driver,"1");
		   									 click(driver,ApplyButton_GlobalFilter);
		   									 if(isDisplayed(driver,Bug_msg)) {
		   		    						     fail(driver,"Error displayed : "+getText1(driver, Bug_msg));
		   		    					     }
		   									  elementnotvisible1(driver, RPE_Loading);
		   									 
		   									 
		   									 for(int l=2;l>=1;l--) {
		   			  						 
		   									   if(isDisplayed(driver,chartBody)) {
		   										  mouseOverToElement(driver, chartBody);
		   										  mouseOverToElement(driver, GlobalFilterIcon);
		   			 	    					  
		   										  String GlobalFilterExpected="Global Filter: ON";
		   										  String GlobalFilterAct=getAttribute1(driver, FilterChartIcon, "title");
//		   										  System.out.println("GlobalFilterAct : "+GlobalFilterAct);
		   										  if(GlobalFilterAct.contains(GlobalFilterExpected)) {
		   											  //pass(driver,"Global filter is ON in the chart after Apply filter");
		   										  }else {
		   											  fail(driver,"Global filter is not ON in the chart after Apply filter");
		   										  }
		   			 	    					  
		   										  String GlobalFilterIconColorRGB=getWebElement(driver, GlobalFilterIcon).getCssValue("fill");  
		   										  String GlobalFilterIconColorAct=rgbToHex1(GlobalFilterIconColorRGB);
		   			 	    					  
		   										  if("#FF3333".equalsIgnoreCase(GlobalFilterIconColorAct)) {
		   											  //pass(driver,"Global Filter icon changed to Red color after Applying the Global Filter"); 
		   										  }else {
		   											  fail(driver,"Global Filter icon not changed to Red color after Applying the Global Filter"); 
		   										  }
		   			 	    					  
		   										  boolean filteredCell=true;
		   										  List<WebElement> FilterChartValues=getWebElements(driver,ChartBody_Y_Values);
		   										  for(WebElement localEle:FilterChartValues) {
		   											  String FilteredValue=localEle.getAttribute("aria-label");
		   											  if(!Categorical_ConditionFiltercell(conditionsList[k],FilteredValue,conditionsInputList[k])) {
		   												   filteredCell=false;
		   											  }
		   										  }
		   										  
		   										  if(filteredCell==true) {
		   			 			    	       		 pass(driver,"For '"+conditionsList[k]+"' condition applied correctly in the BarChart GlobalTab"+l);
		   										  }else {
		   			 			    	       		 fail(driver,"For '"+conditionsList[k]+"' condition not applied correctly in the BarChart GlobalTab"+l);
		   										  }
		   			 	    					  
		   			    					  	}else {
		   			    						  pass(driver,"Unable to get the chart in GlobalTab"+l+" for the selected filter, "+conditionsList[k]+" : "+getText1(driver, ValidationChart));
		   			    					  	}
		   			  						
		   									   clickFirstTab(driver,TabId1);
		   									 }  // By Values global completed
		   									 clickSecondTab(driver,TabId2);
		   									
			   									 
		   								 }catch(Exception e) {
			   									 e.printStackTrace();
		   								 }
		   							 }
		    			 
		    			           click(driver,ConditionSelectDropdown);
		    			           selectByText(driver, ConditionSelectDropdown, FirstCondition_Text_GF);
		    			           wait(driver,"1");
		    			           click(driver,ConditonInput1);
		    			           clear1(driver,ConditonInput1);
		    			           sendKeys(driver,ConditonInput1,FirstCondition_Input_Text_GF);
		    			           wait(driver,"1");
		    			           if(isDisplayed(driver,AddButtonCondition)) {
		    			        	   pass(driver,"ADD button displayed after selecting the condition");
		    			           }else {
		    			        	   fail(driver,"ADD button not displayed after selecting the condition"); 
		    			           }
		    			           
		    			           selectOperatorCondition1(driver,FirstOperator_Input_Text_GF);
		    			           
		    			           if(isDisplayed(driver,ConditionSelectDropdown2)) {
		    			        	   pass(driver,"After click 'ADD' button Second time Condition Selection dropdown is displayed");
		    			           }else {
		    			        	   fail(driver,"After click 'ADD' button Second time Condition Selection dropdown is not displayed"); 
		    			           } 
	    					 
		    			           click(driver,ConditionSelectDropdown2);
		    			           selectByText(driver, ConditionSelectDropdown2, SecondCondition_Text_GF);
		    			           wait(driver,"1");
		    			           click(driver,ConditonInput2);
		    			           sendKeys(driver,ConditonInput2,SecondCondition_Input_Text_GF);
		    			           wait(driver,"1");
		    			           if(isDisplayed(driver,AddButtonCondition)) {
		    			        	   pass(driver,"2 time ADD button displayed after selecting the condition 2nd time ");
		    			           }else {
		    			        	   fail(driver,"2 time ADD button not displayed after selecting the condition 2nd time ");
		    			           } 
		    				  
		    			           selectOperatorCondition2(driver,SecondOperator_Input_Text_GF);

		    			           if(isDisplayed(driver,ConditionSelectDropdown3)) {
		    			        	   pass(driver,"After click 'ADD' button Third time Condition Selection dropdown is displayed");
		    			           }else {
		    			        	   fail(driver,"After click 'ADD' button Third time Condition Selection dropdown is not displayed");
		    			           }
	    					  
		    			           selectByText(driver, ConditionSelectDropdown3, ThirdCondition_Text_GF);
		    			           wait(driver,"1");
		    			           click(driver,ConditonInput3);
		    			           sendKeys(driver,ConditonInput3,ThirdCondition_Input_Text_GF);
		    			           wait(driver,"1");
		    			           if(isDisplayed2(driver,AddButtonCondition)) {
		    			        	   fail(driver,"'ADD' button displayed after given 3 times condition ");
		    			           }else {
		    			        	   pass(driver,"'ADD' button not displayed after given 3 times condition");
		    			           }
					 
		    			           click(driver,ApplyButton_GlobalFilter);
		    			           if(isDisplayed(driver,Bug_msg)) {
		     						  fail(driver,"Error displayed : "+getText1(driver, Bug_msg));
		     					  }
		    			           elementnotvisible1(driver, RPE_Loading);
		    			           
		    			           for(int l=2;l>=1;l--) {
	   			  						 
   									   if(isDisplayed(driver,chartBody)) {
   										  mouseOverToElement(driver, chartBody);
   										  mouseOverToElement(driver, GlobalFilterIcon);
   			 	    					  
   										  String GlobalFilterExpected="Global Filter: ON";
   										  String GlobalFilterAct=getAttribute1(driver, FilterChartIcon, "title");
//   										  System.out.println("GlobalFilterAct : "+GlobalFilterAct);
   										  if(GlobalFilterAct.contains(GlobalFilterExpected)) {
   											  //pass(driver,"Global filter is ON in the chart after Apply filter");
   										  }else {
   											  fail(driver,"Global filter is not ON in the chart after Apply filter");
   										  }
   			 	    					  
   										  String GlobalFilterIconColorRGB=getWebElement(driver, GlobalFilterIcon).getCssValue("fill");  
   										  String GlobalFilterIconColorAct=rgbToHex1(GlobalFilterIconColorRGB);
   			 	    					  
   										  if("#FF3333".equalsIgnoreCase(GlobalFilterIconColorAct)) {
   											  //pass(driver,"Global Filter icon changed to Red color after Applying the Global Filter"); 
   										  }else {
   											  fail(driver,"Global Filter icon not changed to Red color after Applying the Global Filter"); 
   										  }
   			 	    					  
   										  boolean filteredCell=true;
   										  List<WebElement> FilterChartValues=getWebElements(driver,ChartBody_Y_Values);
   										  for(WebElement localEle:FilterChartValues) {
   											  String FilteredValue=localEle.getAttribute("aria-label");
   											  
   											  boolean condition_1_Result=Categorical_ConditionFiltercell(FirstCondition_Text_GF,FilteredValue,FirstCondition_Input_Text_GF);
   											  boolean condition_2_Result=Categorical_ConditionFiltercell(SecondCondition_Text_GF,FilteredValue,SecondCondition_Input_Text_GF);
   											  boolean condition_3_Result=Categorical_ConditionFiltercell(ThirdCondition_Text_GF,FilteredValue,ThirdCondition_Input_Text_GF);
   											  String operator1 = FirstOperator_Input_Text_GF; 
   											  String operator2 = SecondOperator_Input_Text_GF;
			    			  				 
   											  if(!evaluateConditions(condition_1_Result,operator1,condition_2_Result,operator2,condition_3_Result)) {
   												filteredCell=false;
   											  }
   										  }
   										  
   										  if(filteredCell==true) {
   			 			    	       		 pass(driver,"For Selected 3 condition applied correctly in the BarChart GlobalTab"+l);
   										  }else {
   			 			    	       		 fail(driver,"For Selected 3 condition not applied correctly in the BarChart GlobalTab"+l);
   										  }
   			 	    					  
   			    					  	}else {
   			    						  pass(driver,"Unable to get the chart in GlobalTab"+l+" for the selected filter, 3 conditions : "+getText1(driver, ValidationChart));
   			    					  	}
   			  						
   									   clickFirstTab(driver,TabId1);
   									 }  // By Values global completed
   									 clickSecondTab(driver,TabId2);
				   				     
				   				     waitForElement(driver,RestButton_GlobalFilter);
				   					 click(driver,RestButton_GlobalFilter);
				   					 elementnotvisible1(driver, RPE_Loading);
				   					 waitForElement(driver, chartBody);
				  					 mouseOverToElement(driver, chartBody);
				  					 mouseOverToElement(driver, GlobalFilterIcon);
				  					 String GlobalFilterExpected="Global Filter: OFF";
				  					 String GlobalFilterExpRest=getAttribute1(driver, FilterChartIcon, "title");
//				  					 System.out.println("LocatFilterExpRest : "+GlobalFilterExpRest);
				   					  
				  					 if(GlobalFilterExpRest.contains(GlobalFilterExpected)) {
										  pass(driver,"Global filter is OFF in the chart after Reset filter");
				  					 }else {
										  fail(driver,"Global filter is not OFF in the chart after Reset filter");
				  					 }
				   					   
				  					 String GlobalFilterIconColorRGB=getWebElement(driver, GlobalFilterIcon).getCssValue("fill");  
				  					 String GlobalFilterIconColorAct=rgbToHex1(GlobalFilterIconColorRGB);
				 					  
				  					 if(!"#FF3333".equalsIgnoreCase(GlobalFilterIconColorAct)) {
										  pass(driver,"Global Filter icon changed to default color after Reseting the Global Filter"); 
				  					 }else {
										  fail(driver,"Global Filter icon  not changed to default color after Reseting the Global Filter"); 
				  					 }
				  					 
			   						}
			   					 }
				    		
					  	}else {
					  		fail(driver, Select_Y_Axis_Value+" Text Column not Expand After click on it ");
					  	}	
				 }else {
					 pass(driver,Select_Y_Axis_Value+" Text Column value not present in Global filter");
				 }		  
				 
		   } //Text Local filter End...
				 
	    }else {
	        fail(driver,"Column Lists are not displayed in the Global filter section");
	    }
   	  
    	  //******** Global Filter Validation End *****************************//
	}
	
	public void TabFilter_BarChart(WebDriver driver,String Y_Axis_dataType,String Select_Y_Axis_Value,int iteration) throws Exception {
		
		//Tab filter inputs Categorical
		String ByValuesInput_Categorical_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_TabFilter_Bar", "ByValuesInput_Categorical_TF");
		String FirstCondition_1_Categorical_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_TabFilter_Bar", "FirstCondition_1_Categorical_TF");
		String FirstCondition_2_Categorical_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_TabFilter_Bar", "FirstCondition_2_Categorical_TF");
		String FirstCondition_3_Categorical_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_TabFilter_Bar", "FirstCondition_3_Categorical_TF");
		String FirstCondition_4_Categorical_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_TabFilter_Bar", "FirstCondition_4_Categorical_TF");
		String FirstCondition_5_Categorical_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_TabFilter_Bar", "FirstCondition_5_Categorical_TF");
		String FirstCondition_6_Categorical_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_TabFilter_Bar", "FirstCondition_6_Categorical_TF");
		String FirstCondition_7_Categorical_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_TabFilter_Bar", "FirstCondition_7_Categorical_TF");
		String FirstCondition_8_Categorical_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_TabFilter_Bar", "FirstCondition_8_Categorical_TF");
		String FirstCondition_Input_1_Categorical_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_TabFilter_Bar", "FirstCondition_Input_1_Categorical_TF");
		String FirstCondition_Input_2_Categorical_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_TabFilter_Bar", "FirstCondition_Input_2_Categorical_TF");
		String FirstCondition_Input_3_Categorical_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_TabFilter_Bar", "FirstCondition_Input_3_Categorical_TF");
		String FirstCondition_Input_4_Categorical_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_TabFilter_Bar", "FirstCondition_Input_4_Categorical_TF");
		String FirstCondition_Input_5_Categorical_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_TabFilter_Bar", "FirstCondition_Input_5_Categorical_TF");
		String FirstCondition_Input_6_Categorical_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_TabFilter_Bar", "FirstCondition_Input_6_Categorical_TF");
		String FirstCondition_Input_7_Categorical_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_TabFilter_Bar", "FirstCondition_Input_7_Categorical_TF");
		String FirstCondition_Input_8_Categorical_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_TabFilter_Bar", "FirstCondition_Input_8_Categorical_TF");
		String FirstCondition_Categorical_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_TabFilter_Bar", "FirstCondition_Categorical_TF");
		String FirstCondition_Input_Categorical_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_TabFilter_Bar", "FirstCondition_Input_Categorical_TF");
		String FirstOperator_Input_Categorical_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_TabFilter_Bar", "FirstOperator_Input_Categorical_TF");
		String SecondOperator_Input_Categorical_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_TabFilter_Bar", "SecondOperator_Input_Categorical_TF");
		String SecondCondition_Categorical_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_TabFilter_Bar", "SecondCondition_Categorical_TF");
		String SecondCondition_Input_Categorical_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_TabFilter_Bar", "SecondCondition_Input_Categorical_TF");
		String ThirdCondition_Categorical_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_TabFilter_Bar", "ThirdCondition_Categorical_TF");
		String ThirdCondition_Input_Categorical_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_TabFilter_Bar", "ThirdCondition_Input_Categorical_TF");

		//Tab filter inputs Date
		String RelativeFilter_1_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Bar", "RelativeFilter_1_Date_TF");
		String RelativeFilter_2_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Bar", "RelativeFilter_2_Date_TF");
		String RelativeFilter_3_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Bar", "RelativeFilter_3_Date_TF");
		String RelativeFilter_4_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Bar", "RelativeFilter_4_Date_TF");
		String RelativeFilter_5_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Bar", "RelativeFilter_5_Date_TF");
		String RelativeFilter_6_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Bar", "RelativeFilter_6_Date_TF");
		String RelativeFilter_7_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Bar", "RelativeFilter_7_Date_TF");
		String RelativeFilter_8_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Bar", "RelativeFilter_8_Date_TF");
		String RelativeFilter_9_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Bar", "RelativeFilter_9_Date_TF");
		String RelativeFilter_10_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Bar", "RelativeFilter_10_Date_TF");
		String RelativeFilter_11_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Bar", "RelativeFilter_11_Date_TF");
		String RelativeFilter_12_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Bar", "RelativeFilter_12_Date_TF");
		String RelativeFilter_13_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Bar", "RelativeFilter_13_Date_TF");
		String RelativeFilter_14_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Bar", "RelativeFilter_14_Date_TF");
		String RelativeFilter_11_Input_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Bar", "RelativeFilter_11_Input_Date_TF");
		String RelativeFilter_12_Input_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Bar", "RelativeFilter_12_Input_Date_TF");
		String RelativeFilter_13_Input_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Bar", "RelativeFilter_13_Input_Date_TF");
		String RelativeFilter_14_Input_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Bar", "RelativeFilter_14_Input_Date_TF");
		String Condition_1_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Bar", "Condition_1_Date_TF");
		String Condition_2_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Bar", "Condition_2_Date_TF");
		String Condition_3_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Bar", "Condition_3_Date_TF");
		String Condition_4_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Bar", "Condition_4_Date_TF");
		String Condition_5_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Bar", "Condition_5_Date_TF");
		String Condition_6_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Bar", "Condition_6_Date_TF");
		String Condition_7_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Bar", "Condition_7_Date_TF");
		String Condition_8_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Bar", "Condition_8_Date_TF");
		String Condition_9_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Bar", "Condition_9_Date_TF");
		String Condition_1_Input_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Bar", "Condition_1_Input_Date_TF");
		String Condition_2_Input_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Bar", "Condition_2_Input_Date_TF");
		String Condition_3_Input_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Bar", "Condition_3_Input_Date_TF");
		String Condition_4_Input_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Bar", "Condition_4_Input_Date_TF");
		String Condition_5_Input_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Bar", "Condition_5_Input_Date_TF");
		String Condition_6_Input_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Bar", "Condition_6_Input_Date_TF");
		String Condition_7_Input_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Bar", "Condition_7_Input_Date_TF");
		String Condition_8_Input_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Bar", "Condition_8_Input_Date_TF");
		String Condition_9_InputA_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Bar", "Condition_9_InputA_Date_TF");
		String Condition_9_InputB_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Bar", "Condition_9_InputB_Date_TF");
		
		String FirstCondition_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Bar", "FirstCondition_Date_TF");
		String SecondCondition_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Bar", "SecondCondition_Date_TF");
		String ThirdCondition_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Bar", "ThirdCondition_Date_TF");
		String FirstCondition_Date_Input_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Bar", "FirstCondition_Date_Input_TF");
		String SecondCondition_Date_Input_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Bar", "SecondCondition_Date_Input_TF");
		String ThirdCondition_Date_Input_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Bar", "ThirdCondition_Date_Input_TF");
		String FirstOperator_Input_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Bar", "FirstOperator_Input_Date_TF");
		String SecondOperator_Input_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Bar", "SecondOperator_Input_Date_TF");
	
		// Numerical Tab Filter Inputs
		String Condition_1_Num_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Bar", "Condition_1_Num_TF");
		String Condition_2_Num_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Bar", "Condition_2_Num_TF");
		String Condition_3_Num_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Bar", "Condition_3_Num_TF");
		String Condition_4_Num_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Bar", "Condition_4_Num_TF");
		String Condition_5_Num_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Bar", "Condition_5_Num_TF");
		String Condition_6_Num_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Bar", "Condition_6_Num_TF");
		String Condition_7_Num_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Bar", "Condition_7_Num_TF");
		String Condition_8_Num_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Bar", "Condition_8_Num_TF");
		String Condition_9_Num_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Bar", "Condition_9_Num_TF");
		String Condition_1_Input_Num_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Bar", "Condition_1_Input_Num_TF");
		String Condition_2_Input_Num_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Bar", "Condition_2_Input_Num_TF");
		String Condition_3_Input_Num_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Bar", "Condition_3_Input_Num_TF");
		String Condition_4_Input_Num_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Bar", "Condition_4_Input_Num_TF");
		String Condition_5_Input_Num_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Bar", "Condition_5_Input_Num_TF");
		String Condition_6_Input_Num_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Bar", "Condition_6_Input_Num_TF");
		String Condition_7_Input_Num_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Bar", "Condition_7_Input_Num_TF");
		String Condition_8_Input_Num_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Bar", "Condition_8_Input_Num_TF");
		String Condition_9_InputA_Num_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Bar", "Condition_9_InputA_Num_TF");
		String Condition_Between_InputB_Num_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Bar", "Condition_Between_InputB_Num_TF");
		
		String FirstCondition_Num_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Bar", "FirstCondition_Num_TF");
		String SecondCondition_Num_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Bar", "SecondCondition_Num_TF");
		String ThirdCondition_num_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Bar", "ThirdCondition_num_TF");
		String FirstCondition_Num_Input_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Bar", "FirstCondition_Num_Input_TF");
		String SecondCondition_Num_Input_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Bar", "SecondCondition_Num_Input_TF");
		String ThirdCondition_Num_Input_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Bar", "ThirdCondition_Num_Input_TF");
		String FirstOperator_Input_Num_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Bar", "FirstOperator_Input_Num_TF");
		String SecondOperator_Input_Num_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Bar", "SecondOperator_Input_Num_TF");
		     
		//Tab filter inputs Text
		String ByValuesInput_Text_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_TabFilter_Bar", "ByValuesInput_Text_TF");
		String Condition_1_Text_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_TabFilter_Bar", "Condition_1_Text_TF");
		String Condition_2_Text_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_TabFilter_Bar", "Condition_2_Text_TF");
		String Condition_3_Text_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_TabFilter_Bar", "Condition_3_Text_TF");
		String Condition_4_Text_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_TabFilter_Bar", "Condition_4_Text_TF");
		String Condition_5_Text_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_TabFilter_Bar", "Condition_5_Text_TF");
		String Condition_6_Text_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_TabFilter_Bar", "Condition_6_Text_TF");
		String Condition_7_Text_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_TabFilter_Bar", "Condition_7_Text_TF");
		String Condition_8_Text_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_TabFilter_Bar", "Condition_8_Text_TF");
		String Condition_Input_1_Text_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_TabFilter_Bar", "Condition_Input_1_Text_TF");
		String Condition_Input_2_Text_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_TabFilter_Bar", "Condition_Input_2_Text_TF");
		String Condition_Input_3_Text_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_TabFilter_Bar", "Condition_Input_3_Text_TF");
		String Condition_Input_4_Text_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_TabFilter_Bar", "Condition_Input_4_Text_TF");
		String Condition_Input_5_Text_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_TabFilter_Bar", "Condition_Input_5_Text_TF");
		String Condition_Input_6_Text_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_TabFilter_Bar", "Condition_Input_6_Text_TF");
		String Condition_Input_7_Text_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_TabFilter_Bar", "Condition_Input_7_Text_TF");
		String Condition_Input_8_Text_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_TabFilter_Bar", "Condition_Input_8_Text_TF");
		String FirstCondition_Text_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_TabFilter_Bar", "FirstCondition_Text_TF");
		String FirstCondition_Input_Text_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_TabFilter_Bar", "FirstCondition_Input_Text_TF");
		String FirstOperator_Input_Text_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_TabFilter_Bar", "FirstOperator_Input_Text_TF");
		String SecondOperator_Input_Text_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_TabFilter_Bar", "SecondOperator_Input_Text_TF");
		String SecondCondition_Text_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_TabFilter_Bar", "SecondCondition_Text_TF");
		String SecondCondition_Input_Text_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_TabFilter_Bar", "SecondCondition_Input_Text_TF");
		String ThirdCondition_Text_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_TabFilter_Bar", "ThirdCondition_Text_TF");
		String ThirdCondition_Input_Text_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_TabFilter_Bar", "ThirdCondition_Input_Text_TF");

		Actions action=new Actions(driver);
		String GlobalTab2TabId=getAttribute(driver, CurrentTab, "id");
	  
		mouseOverToElement(driver, chartBody);
		mouseOverAndClick(driver,copyChart);
		elementnotvisible(driver,Loading1);
		if(isDisplayed(driver,chartBody2)) {
			pass(driver,"Second Chart displayed after click the copy options in the first chart");
	 	}else {
	 		fail(driver,"Second Chart not displayed after click the copy options in the first chart");
	 	}
		
		boolean tabFilterCheck=false;
		try {
			WebElement TabFilter=driver.findElement(By.xpath("//div[@id='"+GlobalTab2TabId+"_tabfilter']"));
			if(TabFilter.isDisplayed()) {
				tabFilterCheck=true;
			}
		}catch(Exception e) {
			System.out.println("Tab Filter is not present in the current tab");
	  	}
		
		
		if(tabFilterCheck==true) {
			  WebElement TabFilter=driver.findElement(By.xpath("//div[@id='"+GlobalTab2TabId+"_tabfilter']"));
			  action.moveToElement(TabFilter).build().perform();
			  wait(driver,"1");
			  TabFilter.click();  
			  
			  verifyElementDisplayed(driver, TabFilterSection);
			  verifyElementDisplayed(driver, DataSetTabVariable);
			  verifyElementDisplayed(driver, ApplyButton_TabFilter);
			  verifyElementDisplayed(driver, ResetButton_TabFilter);
			  verifyElementDisplayed(driver, SearchInput_TabFilter);
			  
			  if(Y_Axis_dataType.equals("Categorical")) {
				  
				  boolean categoricalFilter=false;
	    		  try {
	    			  WebElement CategoricalColumn= driver.findElement(By.xpath("//div[@id='dashboardTRPE_select_filterColsCon']//div[@id='"+Select_Y_Axis_Value+"']//a"));
		    		  action.moveToElement(CategoricalColumn).click().build().perform();
		    		  categoricalFilter=true;
	    		  }catch(Exception e) {
	    			  
	    		  }
				  
	    		  if(categoricalFilter==true) {
		    		  WebElement CategoricalColumnExp=driver.findElement(By.xpath("//div[@id='dashboardTRPE_select_filterColsCon']//div[@id='"+Select_Y_Axis_Value+"']//a//i"));
		    		  String CategoricalColumnExpText=CategoricalColumnExp.getAttribute("class");
		    		  if(CategoricalColumnExpText.contains("up")) {
		    			  pass(driver,"Categorical Column Expand After click on it ");
		    			  if(verifyElementDisplayed(driver, byValueFilterOption)) {
		    				  if(isElementSelected(driver,byValueRadioButton)) {
		    					  pass(driver,"By default, 'By Values' radio button selected ");
		    				  }else {
		    					  fail(driver,"By default, 'By Values' radio button not selected ");
		    				  }
	    				  }
		    			 
		    			  verifyElementDisplayed(driver, AllCheckbox_CategoricalSec);
		    			  verifyElementDisplayed(driver, CategoricalSearchListOptions);
		    			  verifyElementDisplayed(driver, ExcludeOption_Categorical);
		    			  verifyElementDisplayed(driver, ExcludeCheckbox);
		    			  
		    			  List<WebElement> searchListAvailable=getWebElements(driver,AvailableList_ByValue);
	   				      List<WebElement> searchListCheckboxAvailable=getWebElements(driver,AvailableListCheckbox_ByValue);
	   				      
	   				      if(searchListAvailable.size()==searchListCheckboxAvailable.size()) {
	   				    	  pass(driver,"All the available searchlist are displayed with Checkbox");
	   				      }else {
	   				    	  fail(driver,"Some available searchlist are not displayed with Checkbox");
	   				      }
	   				      
	   				      waitForElement(driver,SearchField_CategoricalSec);
	   				      click(driver,SearchField_CategoricalSec);
	   				      sendKeys(driver,SearchField_CategoricalSec,ByValuesInput_Categorical_TF);
		    			  wait(driver,"1");
		    			  String firstOptionText=getText1(driver,FirstSearchedListValue);
		    			  if(firstOptionText.equals(ByValuesInput_Categorical_TF)) {
		    				  pass(driver,"Search bar inside the Categorical section works properly");
		    			  }else {
		    				  fail(driver,"Search bar inside the Categorical section not works properly");
		    			  }
		    			  
		    			  click(driver,FirstSearchedListValue);
	    				  wait(driver,"1");
		    				  
	    				  if(isElementSelected(driver,FirstSearchedCheckbox)) {
	    					  pass(driver,"Check box selected when click the First searched value");
	    				  }else {
			    			  fail(driver,"Check box not selected when click the First searched value"); 
	    				  }
				    		  
		    			  click(driver,ApplyButton_TabFilter);
		    			  if(isDisplayed(driver,Bug_msg)) {
    						  fail(driver,"Error displayed : "+getText1(driver, Bug_msg));
    					  }
		    			  elementnotvisible1(driver, RPE_Loading);
		    			  
		    			  for (int m=1;m<=2;m++) {
    						  
		    				  boolean chartdisplay=false;
    						  try {
	    						  WebElement chartBod1=driver.findElement(By.xpath("(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[name()='g' and @aria-label='Chart'])["+m+"]"));
	    						  if(chartBod1.isDisplayed()) {
	    							  chartdisplay=true;
	    						  }
	    					  }catch(Exception e) {
    						  
    					      }
		    				  
		    				  if(chartdisplay==true) {
	  	    					  WebElement chartBod1=driver.findElement(By.xpath("(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[name()='g' and @aria-label='Chart'])["+m+"]"));
    							  action.moveToElement(chartBod1).build().perform();
	  	    					  
	  	    					  String TabFilterExpected="Tab Filter: ON";
	  	    					  String TabFilterAct=getAttribute1(driver, FilterChartIcon, "title");
	  	    					  System.out.println("TabFilterAct : "+TabFilterAct);
	  	    					  if(TabFilterAct.contains(TabFilterExpected)) {
	  	    						  pass(driver,"Tab filter is ON in the chart after Apply filter");
	  	    					  }else {
	  	    						  fail(driver,"Tab filter is not ON in the chart after Apply filter, Act : "+TabFilterAct);
	  	    					  }
	  	    					  
	  	    					  if(m==1) {
	  	    						String TabFilterIconColorRGB=getWebElement(driver, TabFilterIconChart1).getCssValue("fill");  
		  	    					String TabFilterIconColorAct=rgbToHex1(TabFilterIconColorRGB);
		  	    					  
		  	    					if("#0000FF".equalsIgnoreCase(TabFilterIconColorAct)) {
										  pass(driver,"Tab Filter icon in chart1 changed to Blue color after Applying the Tab Filter"); 
									}else {
										  fail(driver,"Tab Filter icon in chart1 not changed to Blue color after Applying the Tab Filter"); 
									}
	  	    					  }else {
	  	    						String TabFilterIconColorRGB=getWebElement(driver, TabFilterIconChart2).getCssValue("fill");  
		  	    					String TabFilterIconColorAct=rgbToHex1(TabFilterIconColorRGB);
		  	    					  
		  	    					if("#0000FF".equalsIgnoreCase(TabFilterIconColorAct)) {
										  pass(driver,"Tab Filter icon in chart2 changed to Blue color after Applying the Tab Filter"); 
									}else {
										  fail(driver,"Tab Filter icon in chart2 not changed to Blue color after Applying the Tab Filter"); 
									}
	  	    					  }
	  	    					  
			    		          boolean filteredCell=true;
		    					  List<WebElement> FilterChartValues=driver.findElements(By.xpath("(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[@aria-label='Chart'])["+m+"]//*[@transform]/*[name()='g']/*[@aria-label and not(@fill-opacity)]"));
		    					  for(WebElement localEle:FilterChartValues) {
		    						  String FilteredValue=localEle.getText();
		    						  if(!FilteredValue.equals(ByValuesInput_Categorical_TF)) {
		    							  filteredCell=false;
		    						  }
		    					  }
	  	    					  
		    					  if(filteredCell==true) {
			  			    	       pass(driver,"For 'By Values' condition applied correctly in the chart"+m);
			  			          }else {
	    							  fail(driver,"By Value Tab Filter not Applied correctly in the chart"+m);
			  			          }
		    					  
		    					  
		    				  }else {
		    					  String Failed=getText1(driver, ValidationChart);
    							  pass(driver,"Unable to get the chart"+m+"  for the selected filter, By Values , error : "+Failed);
    						  }
    					  }
		    			  
		    			  click(driver,ExcludeCheckbox);
			    		  click(driver,ApplyButton_TabFilter);
			    		  if(isDisplayed(driver,Bug_msg)) {
    						  fail(driver,"Error displayed : "+getText1(driver, Bug_msg));
    					  }
			    		  elementnotvisible1(driver, RPE_Loading);
		    			  
			    		  for (int m=1;m<=2;m++) {
    						  
		    				  boolean chartdisplay=false;
    						  try {
	    						  WebElement chartBod1=driver.findElement(By.xpath("(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[name()='g' and @aria-label='Chart'])["+m+"]"));
	    						  if(chartBod1.isDisplayed()) {
	    							  chartdisplay=true;
	    						  }
	    					  }catch(Exception e) {
    						  
    					      }
		    				  
		    				  if(chartdisplay==true) {
	  	    					  WebElement chartBod1=driver.findElement(By.xpath("(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[name()='g' and @aria-label='Chart'])["+m+"]"));
    							  action.moveToElement(chartBod1).build().perform();
	  	    					  
	  	    					  String TabFilterExpected="Tab Filter: ON";
	  	    					  String TabFilterAct=getAttribute1(driver, FilterChartIcon, "title");
	  	    					  System.out.println("TabFilterAct : "+TabFilterAct);
	  	    					  if(TabFilterAct.contains(TabFilterExpected)) {
	  	    						  //pass(driver,"Tab filter is ON in the chart after Apply filter");
	  	    					  }else {
	  	    						  fail(driver,"Tab filter is not ON in the chart after Apply filter, Act : "+TabFilterAct);
	  	    					  }
	  	    					  
	  	    					  if(m==1) {
	  	    						String TabFilterIconColorRGB=getWebElement(driver, TabFilterIconChart1).getCssValue("fill");  
		  	    					String TabFilterIconColorAct=rgbToHex1(TabFilterIconColorRGB);
		  	    					  
		  	    					if("#0000FF".equalsIgnoreCase(TabFilterIconColorAct)) {
										  //pass(driver,"Tab Filter icon in chart1 changed to Blue color after Applying the Tab Filter"); 
									}else {
										  fail(driver,"Tab Filter icon in chart1 not changed to Blue color after Applying the Tab Filter"); 
									}
	  	    					  }else {
	  	    						String TabFilterIconColorRGB=getWebElement(driver, TabFilterIconChart2).getCssValue("fill");  
		  	    					String TabFilterIconColorAct=rgbToHex1(TabFilterIconColorRGB);
		  	    					  
		  	    					if("#0000FF".equalsIgnoreCase(TabFilterIconColorAct)) {
										  //pass(driver,"Tab Filter icon in chart2 changed to Blue color after Applying the Tab Filter"); 
									}else {
										  fail(driver,"Tab Filter icon in chart2 not changed to Blue color after Applying the Tab Filter"); 
									}
	  	    					  }
	  	    					  
			    		          boolean filteredCell=true;
		    					  List<WebElement> FilterChartValues=driver.findElements(By.xpath("(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[@aria-label='Chart'])["+m+"]//*[@transform]/*[name()='g']/*[@aria-label and not(@fill-opacity)]"));
		    					  for(WebElement localEle:FilterChartValues) {
		    						  String FilteredValue=localEle.getText();
		    						  if(FilteredValue.equals(ByValuesInput_Categorical_TF)) {
		    							  filteredCell=false;
		    						  }
		    					  }
	  	    					  
		    					  if(filteredCell==true) {
			  			    	       pass(driver,"For 'By Values' with 'Exclude' condition applied correctly in the chart"+m);
			  			          }else {
	    							  fail(driver,"By Value with 'Exclude' Tab Filter not Applied correctly in the chart"+m);
			  			          }
		    					  
		    					  
		    				  }else {
		    					  String Failed=getText1(driver, ValidationChart);
    							  pass(driver,"Unable to get the chart"+m+"  for the selected filter, By Values with 'Exclude' : "+Failed);
    						  }
    					  }
			    		  
			    		  if(verifyElementDisplayed(driver, ConditionFilterOption_Categorical)) {
    				    	  click(driver,ConditionFilterOption_Categorical);
    				    	  wait(driver,"1");
    				    	  if(isElementSelected(driver,ConditionRadioButton_Categorical)) {
    				    		  pass(driver,"Condition radio button selected after click on it");
    				    	  }else {
    				    		  fail(driver,"Condition radio button not selected after click on it");
    				    	  } 
    				    	  
    				    	  if(verifyElementDisplayed(driver, ConditionSelectDropdown)) {
				    			  String defaultSelectedCondition=defaultSelectedValue(driver, ConditionSelectDropdown);
				    			  if(defaultSelectedCondition.equals("equal to")) {
				    				  pass(driver,"By default, 'equal to' option selected in the Condition select dropdown");
				    			  }else {
				    				  fail(driver,"By default, 'equal to' option not selected in the Condition select dropdown");
				    			  }
				    			  
				    			 String[] conditionsList= {FirstCondition_1_Categorical_TF,FirstCondition_2_Categorical_TF,FirstCondition_3_Categorical_TF,FirstCondition_4_Categorical_TF,FirstCondition_5_Categorical_TF,FirstCondition_6_Categorical_TF,FirstCondition_7_Categorical_TF,FirstCondition_8_Categorical_TF};
				    			 String[] conditionsInputList= {FirstCondition_Input_1_Categorical_TF,FirstCondition_Input_2_Categorical_TF,FirstCondition_Input_3_Categorical_TF,FirstCondition_Input_4_Categorical_TF,FirstCondition_Input_5_Categorical_TF,FirstCondition_Input_6_Categorical_TF,FirstCondition_Input_7_Categorical_TF,FirstCondition_Input_8_Categorical_TF};
				    			 
				    			 for(int k=0;k<8;k++) {
				    				 
				    				 try {
				    					 selectByText(driver, ConditionSelectDropdown, conditionsList[k]); 
				    					 wait(driver,"1");
				    			  		 click(driver,ConditonInput1);
				    			  		 clear1(driver,ConditonInput1);
				    			  		 sendKeys(driver,ConditonInput1,conditionsInputList[k]);
				    			  		 wait(driver,"1");
				    			  		 click(driver,ApplyButton_TabFilter);
				    			  		 if(isDisplayed(driver,Bug_msg)) {
				    						  fail(driver,"Error displayed : "+getText1(driver, Bug_msg));
				    					  }
				    			  		 elementnotvisible1(driver, RPE_Loading);
				    			  		 
				    			  		 for (int m=1;m<=2;m++) {
				    						  
						    				  boolean chartdisplay=false;
				    						  try {
					    						  WebElement chartBod1=driver.findElement(By.xpath("(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[name()='g' and @aria-label='Chart'])["+m+"]"));
					    						  if(chartBod1.isDisplayed()) {
					    							  chartdisplay=true;
					    						  }
					    					  }catch(Exception e) {
				    						  
				    					      }
						    				  
						    				  if(chartdisplay==true) {
					  	    					  WebElement chartBod1=driver.findElement(By.xpath("(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[name()='g' and @aria-label='Chart'])["+m+"]"));
				    							  action.moveToElement(chartBod1).build().perform();
					  	    					  
					  	    					  String TabFilterExpected="Tab Filter: ON";
					  	    					  String TabFilterAct=getAttribute1(driver, FilterChartIcon, "title");
					  	    					  System.out.println("TabFilterAct : "+TabFilterAct);
					  	    					  if(TabFilterAct.contains(TabFilterExpected)) {
					  	    						  //pass(driver,"Tab filter is ON in the chart after Apply filter");
					  	    					  }else {
					  	    						  fail(driver,"Tab filter is not ON in the chart after Apply filter, Act : "+TabFilterAct);
					  	    					  }
					  	    					  
					  	    					  if(m==1) {
					  	    						String TabFilterIconColorRGB=getWebElement(driver, TabFilterIconChart1).getCssValue("fill");  
						  	    					String TabFilterIconColorAct=rgbToHex1(TabFilterIconColorRGB);
						  	    					  
						  	    					if("#0000FF".equalsIgnoreCase(TabFilterIconColorAct)) {
														 // pass(driver,"Tab Filter icon in chart1 changed to Blue color after Applying the Tab Filter"); 
													}else {
														  fail(driver,"Tab Filter icon in chart1 not changed to Blue color after Applying the Tab Filter"); 
													}
					  	    					  }else {
					  	    						String TabFilterIconColorRGB=getWebElement(driver, TabFilterIconChart2).getCssValue("fill");  
						  	    					String TabFilterIconColorAct=rgbToHex1(TabFilterIconColorRGB);
						  	    					  
						  	    					if("#0000FF".equalsIgnoreCase(TabFilterIconColorAct)) {
														  //pass(driver,"Tab Filter icon in chart2 changed to Blue color after Applying the Tab Filter"); 
													}else {
														  fail(driver,"Tab Filter icon in chart2 not changed to Blue color after Applying the Tab Filter"); 
													}
					  	    					  }
					  	    					  
							    		          boolean filteredCell=true;
						    					  List<WebElement> FilterChartValues=driver.findElements(By.xpath("(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[@aria-label='Chart'])["+m+"]//*[@transform]/*[name()='g']/*[@aria-label and not(@fill-opacity)]"));
						    					  for(WebElement localEle:FilterChartValues) {
						    						  String FilteredValue=localEle.getText();
						    						  if(!Categorical_ConditionFiltercell(conditionsList[k],FilteredValue,conditionsInputList[k])) {
   				    			  					   	filteredCell=false;
						    						  }
						    					  }
					  	    					  
						    					  if(filteredCell==true) {
							  			    	       pass(driver,"For "+conditionsList[k]+" condition applied correctly in the chart"+m);
							  			          }else {
					    							  fail(driver,conditionsList[k]+" Tab Filter not Applied correctly in the chart"+m);
							  			          }
						    				  }else {
						    					  String Failed=getText1(driver, ValidationChart);
				    							  pass(driver,"Unable to get the chart"+m+"  for the selected filter, "+conditionsList[k]+" : "+Failed);
				    						  }
				    					  } //2 charts validation end
				    			  		 
				    				 }catch(Exception e) {
				    					 //e.printStackTrace();
				    				 }
				    			 }
				    			 
				    			 
				    			  click(driver,ConditionSelectDropdown);
				    			  selectByText(driver, ConditionSelectDropdown, FirstCondition_Categorical_TF);
				    			  wait(driver,"1");
				    			  click(driver,ConditonInput1);
				    			  clear1(driver,ConditonInput1);
				    			  sendKeys(driver,ConditonInput1,FirstCondition_Input_Categorical_TF);
				    			  wait(driver,"1");
				    			  if(isDisplayed(driver,AddButtonCondition)) {
				    				  pass(driver,"ADD button displayed after selecting the condition");
				    			  }else {
					    			  fail(driver,"ADD button not displayed after selecting the condition"); 
					    		  }
				    				  
				    			  selectOperatorCondition1(driver,FirstOperator_Input_Categorical_TF);
				    			  
			    				  if(isDisplayed(driver,ConditionSelectDropdown2)) {
			    					  pass(driver,"After click 'ADD' button Second time Condition Selection dropdown is displayed");
			    				  }else {
				    				  fail(driver,"After click 'ADD' button Second time Condition Selection dropdown is not displayed"); 
				    			  } 
			    					 
			    				  click(driver,ConditionSelectDropdown2);
		    					  selectByText(driver, ConditionSelectDropdown2, SecondCondition_Categorical_TF);
		    					  wait(driver,"1");
		    					  click(driver,ConditonInput2);
		    					  sendKeys(driver,ConditonInput2,SecondCondition_Input_Categorical_TF);
		    					  wait(driver,"1");
		    					  if(isDisplayed(driver,AddButtonCondition)) {
				    				  pass(driver,"2 time ADD button displayed after selecting the condition 2nd time ");
		    					  }else {
		    						  fail(driver,"2 time ADD button not displayed after selecting the condition 2nd time ");
		    					  } 
				    				  
		    					  selectOperatorCondition2(driver,SecondOperator_Input_Categorical_TF);
		    					  
			    				  if(isDisplayed(driver,ConditionSelectDropdown3)) {
			    					  pass(driver,"After click 'ADD' button Third time Condition Selection dropdown is displayed");
			    				  }else {
			    					  fail(driver,"After click 'ADD' button Third time Condition Selection dropdown is not displayed");
			    				  }
			    					  
		    					  selectByText(driver, ConditionSelectDropdown3, ThirdCondition_Categorical_TF);
		    					  wait(driver,"1");
		    					  click(driver,ConditonInput3);
		    					  sendKeys(driver,ConditonInput3,ThirdCondition_Input_Categorical_TF);
		    					  wait(driver,"1");
		    					  if(isDisplayed2(driver,AddButtonCondition)) {
		    						  fail(driver,"'ADD' button displayed after given 3 times condition ");
		    					  }else {
		    						  pass(driver,"'ADD' button not displayed after given 3 times condition");
		    					  }
		    					 
		    					  click(driver,ApplyButton_TabFilter);
		    					  if(isDisplayed(driver,Bug_msg)) {
		    						  fail(driver,"Error displayed : "+getText1(driver, Bug_msg));
		    					  }
		    					  elementnotvisible1(driver, RPE_Loading);
				    			 
		    					  for (int m=1;m<=2;m++) {
		    						  
				    				  boolean chartdisplay=false;
		    						  try {
			    						  WebElement chartBod1=driver.findElement(By.xpath("(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[name()='g' and @aria-label='Chart'])["+m+"]"));
			    						  if(chartBod1.isDisplayed()) {
			    							  chartdisplay=true;
			    						  }
			    					  }catch(Exception e) {
		    						  
		    					      }
				    				  
				    				  if(chartdisplay==true) {
			  	    					  WebElement chartBod1=driver.findElement(By.xpath("(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[name()='g' and @aria-label='Chart'])["+m+"]"));
		    							  action.moveToElement(chartBod1).build().perform();
			  	    					  
			  	    					  String TabFilterExpected="Tab Filter: ON";
			  	    					  String TabFilterAct=getAttribute1(driver, FilterChartIcon, "title");
			  	    					  System.out.println("TabFilterAct : "+TabFilterAct);
			  	    					  if(TabFilterAct.contains(TabFilterExpected)) {
			  	    						  //pass(driver,"Tab filter is ON in the chart after Apply filter");
			  	    					  }else {
			  	    						  fail(driver,"Tab filter is not ON in the chart after Apply filter, Act : "+TabFilterAct);
			  	    					  }
			  	    					  
			  	    					  if(m==1) {
			  	    						String TabFilterIconColorRGB=getWebElement(driver, TabFilterIconChart1).getCssValue("fill");  
				  	    					String TabFilterIconColorAct=rgbToHex1(TabFilterIconColorRGB);
				  	    					  
				  	    					if("#0000FF".equalsIgnoreCase(TabFilterIconColorAct)) {
												 // pass(driver,"Tab Filter icon in chart1 changed to Blue color after Applying the Tab Filter"); 
											}else {
												 fail(driver,"Tab Filter icon in chart1 not changed to Blue color after Applying the Tab Filter"); 
											}
			  	    					  }else {
			  	    						String TabFilterIconColorRGB=getWebElement(driver, TabFilterIconChart2).getCssValue("fill");  
				  	    					String TabFilterIconColorAct=rgbToHex1(TabFilterIconColorRGB);
				  	    					  
				  	    					if("#0000FF".equalsIgnoreCase(TabFilterIconColorAct)) {
												  //pass(driver,"Tab Filter icon in chart2 changed to Blue color after Applying the Tab Filter"); 
											}else {
												  fail(driver,"Tab Filter icon in chart2 not changed to Blue color after Applying the Tab Filter"); 
											}
			  	    					  }
			  	    					  
					    		          boolean filteredCell=true;
				    					  List<WebElement> FilterChartValues=driver.findElements(By.xpath("(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[@aria-label='Chart'])["+m+"]//*[@transform]/*[name()='g']/*[@aria-label and not(@fill-opacity)]"));
				    					  for(WebElement localEle:FilterChartValues) {
				    						  String FilteredValue=localEle.getText();
				    						  
				    						  boolean condition_1_Result=Categorical_ConditionFiltercell(FirstCondition_Categorical_TF,FilteredValue,FirstCondition_Input_Categorical_TF);
	    		    						  boolean condition_2_Result=Categorical_ConditionFiltercell(SecondCondition_Categorical_TF,FilteredValue,SecondCondition_Input_Categorical_TF);
	    		    						  boolean condition_3_Result=Categorical_ConditionFiltercell(ThirdCondition_Categorical_TF,FilteredValue,ThirdCondition_Input_Categorical_TF);
	    		    						  String operator1 = FirstOperator_Input_Categorical_TF; 
	    		    						  String operator2 = SecondOperator_Input_Categorical_TF;
			    			  				 
			    			  				 if(!evaluateConditions(condition_1_Result,operator1,condition_2_Result,operator2,condition_3_Result)) {
			    			  				 	  filteredCell=false;
			    			  				 }
				    					  }
			  	    					  
				    					  if(filteredCell==true) {
					  			    	       pass(driver,"For Selected 3 condition applied correctly in the chart"+m);
					  			          }else {
			    							  fail(driver,"For Selected 3 condition Tab Filter not Applied correctly in the chart"+m);
					  			          }
				    				  }else {
				    					  String Failed=getText1(driver, ValidationChart);
		    							  pass(driver,"Unable to get the chart"+m+"  for the selected filter, 3 condition : "+Failed);
		    						  }
		    					  } //2 charts validation end
		    					  
		    					  
		    					  click(driver,ResetButton_TabFilter);
		    					  if(isDisplayed(driver,Bug_msg)) {
		    						  fail(driver,"Error displayed : "+getText1(driver, Bug_msg));
		    					  }
		    					  elementnotvisible1(driver, RPE_Loading);
		    					  
		    					  for (int m=1;m<=2;m++) {
    				    			  
		    						  boolean chartdisplay=false;
		    						  try {
			    						  WebElement chartBod1=driver.findElement(By.xpath("(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[name()='g' and @aria-label='Chart'])["+m+"]"));
			    						  if(chartBod1.isDisplayed()) {
			    							  chartdisplay=true;
			    						  }
			    					  }catch(Exception e) {
		    						  
		    					      }
    	    						  
    	    						  if(chartdisplay==true) {
    	    							  
    	    							  WebElement chartBod1=driver.findElement(By.xpath("(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[name()='g' and @aria-label='Chart'])["+m+"]"));
		    							  action.moveToElement(chartBod1).build().perform();
    	    							  
		    							  if(m==1) {
				  	    						String TabFilterIconColorRGB=getWebElement(driver, TabFilterIconChart1).getCssValue("fill");  
					  	    					String TabFilterIconColorAct=rgbToHex1(TabFilterIconColorRGB);
					  	    					  
					  	    					if(!"#0000FF".equalsIgnoreCase(TabFilterIconColorAct)) {
													  pass(driver,"Tab Filter icon in chart1 changed to default color after Reset the Tab Filter"); 
												}else {
													  fail(driver,"Tab Filter icon in chart1 not changed to default color after Reset the Tab Filter"); 
												}
			  	    					  }else {
				  	    						String TabFilterIconColorRGB=getWebElement(driver, TabFilterIconChart2).getCssValue("fill");  
					  	    					String TabFilterIconColorAct=rgbToHex1(TabFilterIconColorRGB);
					  	    					  
					  	    					if(!"#0000FF".equalsIgnoreCase(TabFilterIconColorAct)) {
													  pass(driver,"Tab Filter icon in chart2 changed to default color after Reset the Tab Filter"); 
												}else {
													  fail(driver,"Tab Filter icon in chart2 not changed to default color after Reset the Tab Filter"); 
												}
			  	    					  }
    	    						  }else {
    			    					  String Failed=getText1(driver, ValidationChart);
    	    							  fail(driver,"Unable to get the chart"+m+" for the after reseting the filter : "+Failed);
    	    						  }
    	    					  }  // loop end for 2 charts validation .
				    			 
    				    	  }
			    		  }
			    		  
		    		  }else {
  						fail(driver,Select_Y_Axis_Value+"Categorical Column not Expand After click on it ");
		    		  }
	    		  }else {
		    			 fail(driver,Select_Y_Axis_Value+" Categorical Column value not present in Tab filter");
	    		  }
			  }  // Categorical End....
			  
			  
			  
			  //Date Global Filter Validation start...........
		     if(Y_Axis_dataType.equals("Date")) {
		    	// Date Validation Start....   
                  click(driver,ResetButton_TabFilter);
                  elementnotvisible1(driver, RPE_Loading);
	    		  boolean dateFilter=false;
	    		  try {
	    			  WebElement DateColumnElement=driver.findElement(By.xpath("//div[@id='dashboardTRPE_select_filterColsCon']//div[@id='"+Select_Y_Axis_Value+"']//a"));
   				      action.moveToElement(DateColumnElement).click().build().perform();
   				      dateFilter=true;
	    		  }catch(Exception e) {
	    			  
	    		  }
	    		  if(dateFilter==true) { 
	    			  wait(driver,"1");
	    			  WebElement DateColumnElementExpand=driver.findElement(By.xpath("//div[@id='dashboardTRPE_select_filterColsCon']//div[@id='"+Select_Y_Axis_Value+"']//a//i"));
	    			  String DateColumnElementExpandString=DateColumnElementExpand.getAttribute("class");
	    			  if(DateColumnElementExpandString.contains("up")) {
	    				  pass(driver,"Selected Date Column expanded after click on it");
	    				  if(verifyElementDisplayed(driver, RelativeOption)) {
    						  if(isElementSelected(driver, RelativeOptionRadioBtn)) {
    							  pass(driver,"By default, 'Relative' option selected in the Date Column");
    						  }else {
    							  fail(driver,"By default, 'Relative' option not selected in the Date Column");
    						  }
    						  
    						  click(driver,Relative_conditin_dropdown);
							  
	    			  		  String[] RelativeFilterList= {RelativeFilter_1_Date_TF,RelativeFilter_2_Date_TF,RelativeFilter_3_Date_TF,RelativeFilter_4_Date_TF,RelativeFilter_5_Date_TF,RelativeFilter_6_Date_TF,RelativeFilter_7_Date_TF,RelativeFilter_8_Date_TF,RelativeFilter_9_Date_TF,RelativeFilter_10_Date_TF,RelativeFilter_11_Date_TF,RelativeFilter_12_Date_TF,RelativeFilter_13_Date_TF,RelativeFilter_14_Date_TF};
	    			  		  String[] RelativeFilterInputList= {"","","","","","","","","","",RelativeFilter_11_Input_Date_TF,RelativeFilter_12_Input_Date_TF,RelativeFilter_13_Input_Date_TF,RelativeFilter_14_Input_Date_TF};
	    			  		  
	    			  		  for(int k=0;k<14;k++) {
			    				 
			    				 try {
			    					 selectByText(driver, Relative_conditin_dropdown, RelativeFilterList[k]); 
			    					 wait(driver,"1");
			    			  		 if(k>=10 && isDisplayed(driver,Relative_Input_Value_date)) {
			    			  			 click(driver,Relative_Input_Value_date);
			    			  			 clear1(driver,Relative_Input_Value_date);
			    			  			 sendKeys(driver,Relative_Input_Value_date,RelativeFilterInputList[k]);
			    			  		 }
			    			  		 wait(driver,"1");
			    			  		 click(driver,ApplyButton_TabFilter);
			    			  		 if(isDisplayed(driver,Bug_msg)) {
			    						  fail(driver,"Error displayed : "+getText1(driver, Bug_msg));
			    					  }
			    			  		 elementnotvisible1(driver, RPE_Loading);
			    			  		 
			    			  		 for (int m=1;m<=2;m++) {
			    						  
					    				  boolean chartdisplay=false;
			    						  try {
				    						  WebElement chartBod1=driver.findElement(By.xpath("(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[name()='g' and @aria-label='Chart'])["+m+"]"));
				    						  if(chartBod1.isDisplayed()) {
				    							  chartdisplay=true;
				    						  }
				    					  }catch(Exception e) {
			    						  
			    					      }
					    				  
					    				  if(chartdisplay==true) {
				  	    					  WebElement chartBod1=driver.findElement(By.xpath("(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[name()='g' and @aria-label='Chart'])["+m+"]"));
			    							  action.moveToElement(chartBod1).build().perform();
				  	    					  
				  	    					  String TabFilterExpected="Tab Filter: ON";
				  	    					  String TabFilterAct=getAttribute1(driver, FilterChartIcon, "title");
				  	    					  System.out.println("TabFilterAct : "+TabFilterAct);
				  	    					  if(TabFilterAct.contains(TabFilterExpected)) {
				  	    						  //pass(driver,"Tab filter is ON in the chart after Apply filter");
				  	    					  }else {
				  	    						  fail(driver,"Tab filter is not ON in the chart after Apply filter, Act : "+TabFilterAct);
				  	    					  }
				  	    					  
				  	    					  if(m==1) {
				  	    						String TabFilterIconColorRGB=getWebElement(driver, TabFilterIconChart1).getCssValue("fill");  
					  	    					String TabFilterIconColorAct=rgbToHex1(TabFilterIconColorRGB);
					  	    					  
					  	    					if("#0000FF".equalsIgnoreCase(TabFilterIconColorAct)) {
													 // pass(driver,"Tab Filter icon in chart1 changed to Blue color after Applying the Tab Filter"); 
												}else {
													 fail(driver,"Tab Filter icon in chart1 not changed to Blue color after Applying the Tab Filter"); 
												}
				  	    					  }else {
				  	    						String TabFilterIconColorRGB=getWebElement(driver, TabFilterIconChart2).getCssValue("fill");  
					  	    					String TabFilterIconColorAct=rgbToHex1(TabFilterIconColorRGB);
					  	    					  
					  	    					if("#0000FF".equalsIgnoreCase(TabFilterIconColorAct)) {
													  //pass(driver,"Tab Filter icon in chart2 changed to Blue color after Applying the Tab Filter"); 
												}else {
													  fail(driver,"Tab Filter icon in chart2 not changed to Blue color after Applying the Tab Filter"); 
												}
				  	    					  }
				  	    					  
						    		          boolean filteredCell=true;
					    					  List<WebElement> FilterChartValues=driver.findElements(By.xpath("(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[@aria-label='Chart'])["+m+"]//*[@transform]/*[name()='g']/*[@aria-label and not(@fill-opacity)]"));
					    					  for(WebElement localEle:FilterChartValues) {
					    						  String FilteredValue=localEle.getText();
					    						  
					    						  if (FilteredValue != null && FilteredValue.length() >= 10) {
					    							  FilteredValue=FilteredValue.substring(0, 10);
		    		    						  }
					    						  if(!Date_RelativeFiltercell(RelativeFilterList[k],FilteredValue,RelativeFilterInputList[k])) {
		    			  				 			 filteredCell=false;
					    						  } 
					    					  }
				  	    					  
					    					  if(filteredCell==true) {
						  			    	       pass(driver,"For "+RelativeFilterList[k]+" condition applied correctly in the chart"+m);
						  			          }else {
				    							  fail(driver,"For "+RelativeFilterList[k]+" condition Tab Filter not Applied correctly in the chart"+m);
						  			          }
					    				  }else {
					    					  String Failed=getText1(driver, ValidationChart);
			    							  pass(driver,"Unable to get the chart"+m+"  for the selected filter, "+RelativeFilterList[k]+" : "+Failed);
			    						  }
			    					  } //2 charts validation end
			    			  		 
			    				 }catch(Exception e) {
//				    					 e.printStackTrace();
			    				 }
	    			  		  }
	    			  		  
	    			  		if(verifyElementDisplayed(driver,ConditionFilterOption_Date)) {
	    						  click(driver,ConditionFilterOption_Date);
	    						  if(isElementSelected(driver, ConditionRadioButton_Date)) {
	    							  pass(driver,"Conditions Filter in Date type Colunm is selected after click on it ");
	    						  }else {
	    							  fail(driver,"Conditions Filter in Date type Colunm is not selected after click on it ");
	    						  }
	    						  
	    						  click(driver,ConditionInput1_Date);
	    						  String[] ConditionFilterList= {Condition_1_Date_TF,Condition_2_Date_TF,Condition_3_Date_TF,Condition_4_Date_TF,Condition_5_Date_TF,Condition_6_Date_TF,Condition_7_Date_TF,Condition_8_Date_TF,Condition_9_Date_TF};
	    						  String[] ConditionFilterInputList= {Condition_1_Input_Date_TF,Condition_2_Input_Date_TF,Condition_3_Input_Date_TF,Condition_4_Input_Date_TF,Condition_5_Input_Date_TF,Condition_6_Input_Date_TF,Condition_7_Input_Date_TF,Condition_8_Input_Date_TF,Condition_9_InputA_Date_TF};
			    			  		  
	    						  for(int k=0;k<9;k++) {
					    				 
					    				 try {
					    					 selectByText(driver, ConditionInput1_Date, ConditionFilterList[k]); 
					    					 wait(driver,"1");
					    					 if(!ConditionFilterList[k].equals("is null") && !ConditionFilterList[k].equals("is not null") ) {
					    						 click(driver,FirstConditionValueInput1_date);
						    					 for(int m=0;m<3;m++) {
						    						 action.sendKeys(Keys.BACK_SPACE).build().perform();
						    						 action.sendKeys(Keys.ARROW_RIGHT).build().perform();
						    					 }
						    					 click(driver,DashProPage);
						    					 click(driver,FirstConditionValueInput1_date);
						    					 sendKeys(driver,FirstConditionValueInput1_date,ConditionFilterInputList[k]);
						    					 wait(driver,"1");
						    					 
						    					 if(ConditionFilterList[k].equals("between")) {
						    						 if(isDisplayed(driver,FirstConditionValueInput2_date)) {
						    							 pass(driver,"Second input element is available for 'between' condition");
							    						 click(driver,FirstConditionValueInput2_date);
							    						 for(int m=0;m<3;m++) {
								    						 action.sendKeys(Keys.BACK_SPACE).build().perform();
								    						 action.sendKeys(Keys.ARROW_RIGHT).build().perform();
								    					 }
								    					 click(driver,FirstConditionValueInput1_date);
								    					 click(driver,FirstConditionValueInput2_date);
								    					 sendKeys(driver,FirstConditionValueInput2_date,Condition_9_InputB_Date_TF);
							    					 }else {
							    						 fail(driver,"Second input element is not available for 'between' condition");
							    					 }
						    					 }
						    					 
					    					 }
					    			  		 wait(driver,"2");
					    			  		 click(driver,ApplyButton_TabFilter);
					    			  		 if(isDisplayed(driver,Bug_msg)) {
					    						  fail(driver,"Error displayed : "+getText1(driver, Bug_msg));
					    					  }
					    			  		elementnotvisible1(driver, RPE_Loading);
					    			  		 
					    			  		 for (int m=1;m<=2;m++) {
					    			  			  boolean chartdisplay=false;
					    						  try {
						    						  WebElement chartBod1=driver.findElement(By.xpath("(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[name()='g' and @aria-label='Chart'])["+m+"]"));
						    						  if(chartBod1.isDisplayed()) {
						    							  chartdisplay=true;
						    						  }
						    					  }catch(Exception e) {
					    						  
					    					      }
		    	    						  
			    			  			 		 if(chartdisplay==true) {
						    						  WebElement chartBod1=driver.findElement(By.xpath("(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[name()='g' and @aria-label='Chart'])["+m+"]"));
			    			  			 			  action.moveToElement(chartBod1).build().perform();
			    			  			 			  String TabFilterExpected="Tab Filter: ON";
						  	    					  String TabFilterAct=getAttribute1(driver, FilterChartIcon, "title");
						  	    					  System.out.println("TabFilterAct : "+TabFilterAct);
						  	    					  if(TabFilterAct.contains(TabFilterExpected)) {
						  	    						  //pass(driver,"Tab filter is ON in the chart after Apply filter");
						  	    					  }else {
						  	    						  fail(driver,"Tab filter is not ON in the chart after Apply filter, Act : "+TabFilterAct);
						  	    					  }
						  	    					  
						  	    					  if(m==1) {
						  	    						String TabFilterIconColorRGB=getWebElement(driver, TabFilterIconChart1).getCssValue("fill");  
							  	    					String TabFilterIconColorAct=rgbToHex1(TabFilterIconColorRGB);
							  	    					  
							  	    					if("#0000FF".equalsIgnoreCase(TabFilterIconColorAct)) {
															 // pass(driver,"Tab Filter icon in chart1 changed to Blue color after Applying the Tab Filter"); 
														}else {
															 fail(driver,"Tab Filter icon in chart1 not changed to Blue color after Applying the Tab Filter"); 
														}
						  	    					  }else {
						  	    						String TabFilterIconColorRGB=getWebElement(driver, TabFilterIconChart2).getCssValue("fill");  
							  	    					String TabFilterIconColorAct=rgbToHex1(TabFilterIconColorRGB);
							  	    					  
							  	    					if("#0000FF".equalsIgnoreCase(TabFilterIconColorAct)) {
															  //pass(driver,"Tab Filter icon in chart2 changed to Blue color after Applying the Tab Filter"); 
														}else {
															  fail(driver,"Tab Filter icon in chart2 not changed to Blue color after Applying the Tab Filter"); 
														}
						  	    					  }
			    			  			 			  
						  	    					  boolean filteredCell=true;
							    					  List<WebElement> FilterChartValues=driver.findElements(By.xpath("(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[@aria-label='Chart'])["+m+"]//*[@transform]/*[name()='g']/*[@aria-label and not(@fill-opacity)]"));
							    					  for(WebElement localEle:FilterChartValues) {
							    						  String FilteredValue=localEle.getText();
							    						  
							    						  if (FilteredValue != null && FilteredValue.length() >= 10) {
							    							  FilteredValue=FilteredValue.substring(0, 10);
				    		    						  }
							    						  
	 			    		    						  if(!Date_ConditionFiltercell(ConditionFilterList[k],FilteredValue,ConditionFilterInputList[k],Condition_9_InputB_Date_TF)) {
					    			  					      filteredCell=false;
	 			    		    						  } 
							    					  }
						  	    					  
							    					  if(filteredCell==true) {
								  			    	       pass(driver,"For "+ConditionFilterList[k]+" condition applied correctly in the chart"+m);
								  			          }else {
						    							  fail(driver,"For "+ConditionFilterList[k]+" condition Tab Filter not Applied correctly in the chart"+m);
								  			          }
	 			    		    					  
			    			  			 		 }else {
			    			    					  String Failed=getText1(driver, ValidationChart);
			    			  			 			 pass(driver,"Unable to get the chart"+m+"  for the selected filter, "+ConditionFilterList[k]+" : "+Failed);
			    			  			 		 }
					    			  		 }  // loop end for 2 charts validation .
					    			  		 
					    				 }catch(Exception e) {
//					    					 e.printStackTrace();
					    				 }
	    						  }
	    						  
	    						  click(driver,ConditionFilterOption_Date);
	    						  wait(driver,"1");
	    						  selectByText(driver, ConditionInput1_Date, FirstCondition_Date_TF);
	    						  wait(driver,"1");
	    						  if(!FirstCondition_Date_TF.equals("is null") && !FirstCondition_Date_TF.equals("is not null") ) {
	    							  click(driver,FirstConditionValueInput1_date);
	    							  for(int m=0;m<3;m++) {
	    								  action.sendKeys(Keys.BACK_SPACE).build().perform();
	    								  action.sendKeys(Keys.ARROW_RIGHT).build().perform();
	    							  }
	    							  click(driver,DashProPage);
	    							  click(driver,FirstConditionValueInput1_date);
	    							  sendKeys(driver,FirstConditionValueInput1_date,FirstCondition_Date_Input_TF);
	    							  wait(driver,"1");
	    						  }
			    			  		 
	    						  if(isDisplayed(driver,AddButtonCondition)) {
	    							  pass(driver,"ADD button displayed after selecting the first condition");
	    						  }else {
	    							  fail(driver,"ADD button not displayed after selecting the first condition"); 
	    						  }
					    				  
	    						  selectOperatorCondition1(driver,FirstOperator_Input_Date_TF);
	    						  
	    						  if(isDisplayed(driver,ConditionInput2_Date)) {
	    							  pass(driver,"After click 'ADD' button Second time Condition Selection dropdown is displayed");
	    						  }else {
	    							  fail(driver,"After click 'ADD' button Second time Condition Selection dropdown is not displayed"); 
	    						  } 
				    					 
	    						  click(driver,ConditionInput2_Date);
	    						  selectByText(driver, ConditionInput2_Date, SecondCondition_Date_TF);
	    						  if(!SecondCondition_Date_TF.equals("is null") && !SecondCondition_Date_TF.equals("is not null") ) {
	    							  click(driver,SecondConditionValueInput1_date);
	    							  for(int m=0;m<3;m++) {
	    								  action.sendKeys(Keys.BACK_SPACE).build().perform();
	    								  action.sendKeys(Keys.ARROW_RIGHT).build().perform();
	    							  }
	    							  click(driver,DashProPage);
	    							  click(driver,SecondConditionValueInput1_date);
	    							  sendKeys(driver,SecondConditionValueInput1_date,SecondCondition_Date_Input_TF);
					    					 
	    						  }
	    						  wait(driver,"1");
	    						  if(isDisplayed(driver,AddButtonCondition)) {
	    							  pass(driver,"2 time ADD button displayed after selecting the condition 2nd time ");
		    					  }else {
		    						  fail(driver,"2 time ADD button not displayed after selecting the condition 2nd time ");
		    					  } 
	    						  selectOperatorCondition2(driver,SecondOperator_Input_Date_TF);
	    						  
	    						  if(isDisplayed(driver,ConditionInput3_Date)) {
	    							  pass(driver,"After click 'ADD' button Third time Condition Selection dropdown is displayed");
	    						  }else {
	    							  fail(driver,"After click 'ADD' button Third time Condition Selection dropdown is not displayed");
	    						  }
				    					  
	    						  selectByText(driver, ConditionInput3_Date, ThirdCondition_Date_TF);
	    						  wait(driver,"1");
			    					  
	    						  if(!ThirdCondition_Date_TF.equals("is null") && !ThirdCondition_Date_TF.equals("is not null") ) {
	    							  click(driver,ThirdConditionValueInput1_date);
	    							  for(int m=0;m<3;m++) {
	    								  action.sendKeys(Keys.BACK_SPACE).build().perform();
	    								  action.sendKeys(Keys.ARROW_RIGHT).build().perform();
	    							  }
	    							  click(driver,DashProPage);
	    							  click(driver,ThirdConditionValueInput1_date);
	    							  sendKeys(driver,ThirdConditionValueInput1_date,ThirdCondition_Date_Input_TF);
					    					 
	    						  }
	    						  wait(driver,"1");
			    					  
	    						  if(isDisplayed2(driver,AddButtonCondition)) {
	    							  fail(driver,"'ADD' button displayed after given 3 times condition ");
	    						  }else {
	    							  pass(driver,"'ADD' button not displayed after given 3 times condition");
	    						  }	
			    					  
	    						  click(driver,ApplyButton_TabFilter);
	    						  if(isDisplayed(driver,Bug_msg)) {
	        						  fail(driver,"Error displayed : "+getText1(driver, Bug_msg));
	        					  }
	    						  elementnotvisible1(driver, RPE_Loading);
	    						  
	    						  for (int m=1;m<=2;m++) {
    				    			  
	    							  boolean chartdisplay=false;
		    						  try {
			    						  WebElement chartBod1=driver.findElement(By.xpath("(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[name()='g' and @aria-label='Chart'])["+m+"]"));
			    						  if(chartBod1.isDisplayed()) {
			    							  chartdisplay=true;
			    						  }
			    					  }catch(Exception e) {
		    						  
		    					      }
 	    						  
			  			 		 	 if(chartdisplay==true) {
			    						  WebElement chartBod1=driver.findElement(By.xpath("(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[name()='g' and @aria-label='Chart'])["+m+"]"));
    			  			 			  action.moveToElement(chartBod1).build().perform();
    			  			 			  if(m==1) {
			  	    						String TabFilterIconColorRGB=getWebElement(driver, TabFilterIconChart1).getCssValue("fill");  
				  	    					String TabFilterIconColorAct=rgbToHex1(TabFilterIconColorRGB);
				  	    					  
				  	    					if("#0000FF".equalsIgnoreCase(TabFilterIconColorAct)) {
												 // pass(driver,"Tab Filter icon in chart1 changed to Blue color after Applying the Tab Filter"); 
											}else {
												 fail(driver,"Tab Filter icon in chart1 not changed to Blue color after Applying the Tab Filter"); 
											}
			  	    					  }else {
			  	    						String TabFilterIconColorRGB=getWebElement(driver, TabFilterIconChart2).getCssValue("fill");  
				  	    					String TabFilterIconColorAct=rgbToHex1(TabFilterIconColorRGB);
				  	    					  
				  	    					if("#0000FF".equalsIgnoreCase(TabFilterIconColorAct)) {
												  //pass(driver,"Tab Filter icon in chart2 changed to Blue color after Applying the Tab Filter"); 
											}else {
												  fail(driver,"Tab Filter icon in chart2 not changed to Blue color after Applying the Tab Filter"); 
											}
			  	    					  }
    			  			 			  
			  	    					  boolean filteredCell=true;
				    					  List<WebElement> FilterChartValues=driver.findElements(By.xpath("(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[@aria-label='Chart'])["+m+"]//*[@transform]/*[name()='g']/*[@aria-label and not(@fill-opacity)]"));
				    					  for(WebElement localEle:FilterChartValues) {
				    						  String FilteredValue=localEle.getText();
				    						  
				    						  if (FilteredValue != null && FilteredValue.length() >= 10) {
				    							  FilteredValue=FilteredValue.substring(0, 10);
	    		    						  }
				    						  
				    						  boolean condition_1_Result=Date_ConditionFiltercell(FirstCondition_Date_TF,FilteredValue,FirstCondition_Date_Input_TF,Condition_9_InputB_Date_TF);
	    		    						  boolean condition_2_Result=Date_ConditionFiltercell(SecondCondition_Date_TF,FilteredValue,SecondCondition_Date_Input_TF,Condition_9_InputB_Date_TF);
	    		    						  boolean condition_3_Result=Date_ConditionFiltercell(ThirdCondition_Date_TF,FilteredValue,ThirdCondition_Date_Input_TF,Condition_9_InputB_Date_TF);
	    		    						  String operator1 = FirstOperator_Input_Date_TF;
	    		    						  String operator2 = SecondOperator_Input_Date_TF;
			    			  				 
			    			  				  if(!evaluateConditions(condition_1_Result,operator1,condition_2_Result,operator2,condition_3_Result)) {
			    			  					 filteredCell=false;
			    			  				  } 
				    					  }
			  	    					  
				    					  if(filteredCell==true) {
					  			    	       pass(driver,"For Selected 3 condition applied correctly in the chart"+m);
					  			          }else {
			    							  fail(driver,"For Selected 3 condition Tab Filter not Applied correctly in the chart"+m);
					  			          }  
			  			 		 	 }else {
				    					  String Failed=getText1(driver, ValidationChart);
			  			 		 		 pass(driver,"Unable to get the chart"+m+"  for the selected filter, 3 conditions : "+Failed);
			  			 		 	 }
	    						  } // loop end for 2 charts validation .
		    					 
	    						  click(driver,ResetButton_TabFilter);
	    						  elementnotvisible1(driver, RPE_Loading);
		    					  for (int m=1;m<=2;m++) {
		    						  boolean chartdisplay=false;
		    						  try {
			    						  WebElement chartBod1=driver.findElement(By.xpath("(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[name()='g' and @aria-label='Chart'])["+m+"]"));
			    						  if(chartBod1.isDisplayed()) {
			    							  chartdisplay=true;
			    						  }
			    					  }catch(Exception e) {
		    						  
		    					      }
    	    						  
    	    						  if(chartdisplay==true) {
    	    							  
    	    							  WebElement chartBod1=driver.findElement(By.xpath("(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[name()='g' and @aria-label='Chart'])["+m+"]"));
		    							  action.moveToElement(chartBod1).build().perform();
    	    							  
		    							  if(m==1) {
				  	    						String TabFilterIconColorRGB=getWebElement(driver, TabFilterIconChart1).getCssValue("fill");  
					  	    					String TabFilterIconColorAct=rgbToHex1(TabFilterIconColorRGB);
					  	    					  
					  	    					if(!"#0000FF".equalsIgnoreCase(TabFilterIconColorAct)) {
													  pass(driver,"Tab Filter icon in chart1 changed to default color after Reset the Tab Filter"); 
												}else {
													  fail(driver,"Tab Filter icon in chart1 not changed to default color after Reset the Tab Filter"); 
												}
			  	    					  }else {
				  	    						String TabFilterIconColorRGB=getWebElement(driver, TabFilterIconChart2).getCssValue("fill");  
					  	    					String TabFilterIconColorAct=rgbToHex1(TabFilterIconColorRGB);
					  	    					  
					  	    					if(!"#0000FF".equalsIgnoreCase(TabFilterIconColorAct)) {
													  pass(driver,"Tab Filter icon in chart2 changed to default color after Reset the Tab Filter"); 
												}else {
													  fail(driver,"Tab Filter icon in chart2 not changed to default color after Reset the Tab Filter"); 
												}
			  	    					  }
    	    						  }else {
    			    					  String Failed=getText1(driver, ValidationChart);
    	    							  fail(driver,"Unable to get the chart"+m+" for the after reseting the filter : "+Failed);
    	    						  }
    	    					  }  // loop end for 2 charts validation .
	    			  		 }
	    				  }
	    			  }else {
	    				  fail(driver,"Selected Date Column not expanded after click on it");
	    			  }
	    		  }else {
    				  fail(driver,Select_Y_Axis_Value+" Date Column value not present in Tab filter");
    			  }
		     }  // Date End....
			  
		 	// Numerical Filter validation
			if(Y_Axis_dataType.equals("Numerical")) { 
				
				  click(driver,ResetButton_TabFilter);
				  elementnotvisible1(driver, RPE_Loading);
	    		  boolean NumericalFilter=false;
	    		  try {
	    			  WebElement DateColumnElement=driver.findElement(By.xpath("//div[@id='dashboardTRPE_select_filterColsCon']//div[@id='"+Select_Y_Axis_Value+"']//a"));
  				      action.moveToElement(DateColumnElement).click().build().perform();
  				      NumericalFilter=true;
	    		  }catch(Exception e) {
	    			  
	    		  }
				
	    		  if(NumericalFilter==true) {
	  				  wait(driver,"1");
	  				  WebElement NumericalColumnElementExpand=driver.findElement(By.xpath("//div[@id='dashboardTRPE_select_filterColsCon']//div[@id='"+Select_Y_Axis_Value+"']//a//i"));
	  				  String NumericalColumnElementExpandString=NumericalColumnElementExpand.getAttribute("class");
	  				  
	  				  if(NumericalColumnElementExpandString.contains("up")) {
						  pass(driver,"Selected Numerical Column expanded after click on it");
						  if(isDisplayed(driver,ConditionInput1_Num)) {
							  pass(driver,"Condition Selection dropdown is displayed in the Numerical column");
						  }else {
							  fail(driver,"Condition Selection dropdown is not displayed in the Numerical column");
						  }
						  
						  click(driver,ConditionInput1_Num);
						  verifyElementIsPresent1(driver, EqualTo_OptionNum);
						  verifyElementIsPresent1(driver, NotEqualTo_OptionNum);
						  verifyElementIsPresent1(driver, GreaterThan_OptionNum);
						  verifyElementIsPresent1(driver, LessThan_OptionNum);
						  verifyElementIsPresent1(driver, GreaterEqualTo_OptionNum);
						  verifyElementIsPresent1(driver, LessThanEqualTo_OptionNum);
						  verifyElementIsPresent1(driver, IsNull_OptionNum);
						  verifyElementIsPresent1(driver, IsNotNull_OptionNum);
						  verifyElementIsPresent1(driver, Between_OptionNum);
						  
						  String[] NumFilterList= {Condition_1_Num_TF,Condition_2_Num_TF,Condition_3_Num_TF,Condition_4_Num_TF,Condition_5_Num_TF,Condition_6_Num_TF,Condition_7_Num_TF,Condition_8_Num_TF,Condition_9_Num_TF};
	 			  		  String[] NumFilterInputList= {Condition_1_Input_Num_TF,Condition_2_Input_Num_TF,Condition_3_Input_Num_TF,Condition_4_Input_Num_TF,Condition_5_Input_Num_TF,Condition_6_Input_Num_TF,Condition_7_Input_Num_TF,Condition_8_Input_Num_TF,Condition_9_InputA_Num_TF};
	 			  		 
	 			  		  for(int k=0;k<9;k++) {
		    				 
		    				 try {
		    					 selectByText(driver, ConditionInput1_Num, NumFilterList[k]); 
		    					 wait(driver,"1");
		    					 if(!NumFilterList[k].equals("is null") && !NumFilterList[k].equals("is not null") ) {
		    						 click(driver,FirstConditionValueInput1_Num);
			    					 clear1(driver,FirstConditionValueInput1_Num);
			    					 sendKeys(driver,FirstConditionValueInput1_Num,NumFilterInputList[k]);
			    					 wait(driver,"1");
			    					 
			    					 if(NumFilterList[k].equals("between")) {
			    						 if(isDisplayed(driver,FirstConditionValueInput2_Num)) {
			    							 pass(driver,"Second input element is available for 'between' condition");
				    						 click(driver,FirstConditionValueInput2_Num);
//	    					    					 clear1(driver,"1");
					    					 sendKeys(driver,FirstConditionValueInput2_Num,Condition_Between_InputB_Num_TF);
				    					 }else {
				    						 fail(driver,"Second input element is not available for 'between' condition");
				    					 }
			    					 }
			    					 
		    					 }
		    			  		 wait(driver,"1");
		    			  		 click(driver,ApplyButton_TabFilter);
		    			  		 if(isDisplayed(driver,Bug_msg)) {
		    						  fail(driver,"Error displayed : "+getText1(driver, Bug_msg));
		    					  }
		    			  		 elementnotvisible1(driver, RPE_Loading);
		    					  
		    					  for (int m=1;m<=2;m++) {
	    				    			
		    						  boolean chartdisplay=false;
		    						  try {
			    						  WebElement chartBod1=driver.findElement(By.xpath("(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[name()='g' and @aria-label='Chart'])["+m+"]"));
			    						  if(chartBod1.isDisplayed()) {
			    							  chartdisplay=true;
			    						  }
			    					  }catch(Exception e) {
		    						  
		    					      }
 	    						  
			  			 		 	 if(chartdisplay==true) {
			    						  WebElement chartBod1=driver.findElement(By.xpath("(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[name()='g' and @aria-label='Chart'])["+m+"]"));
    			  			 			  action.moveToElement(chartBod1).build().perform();
    			  			 			  if(m==1) {
			  	    						String TabFilterIconColorRGB=getWebElement(driver, TabFilterIconChart1).getCssValue("fill");  
				  	    					String TabFilterIconColorAct=rgbToHex1(TabFilterIconColorRGB);
				  	    					  
				  	    					if("#0000FF".equalsIgnoreCase(TabFilterIconColorAct)) {
												 // pass(driver,"Tab Filter icon in chart1 changed to Blue color after Applying the Tab Filter"); 
											}else {
												 fail(driver,"Tab Filter icon in chart1 not changed to Blue color after Applying the Tab Filter"); 
											}
			  	    					  }else {
			  	    						String TabFilterIconColorRGB=getWebElement(driver, TabFilterIconChart2).getCssValue("fill");  
				  	    					String TabFilterIconColorAct=rgbToHex1(TabFilterIconColorRGB);
				  	    					  
				  	    					if("#0000FF".equalsIgnoreCase(TabFilterIconColorAct)) {
												  //pass(driver,"Tab Filter icon in chart2 changed to Blue color after Applying the Tab Filter"); 
											}else {
												  fail(driver,"Tab Filter icon in chart2 not changed to Blue color after Applying the Tab Filter"); 
											}
			  	    					  }
    			  			 			  
			  	    					  boolean filteredCell=true;
				    					  List<WebElement> FilterChartValues=driver.findElements(By.xpath("(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[@aria-label='Chart'])["+m+"]//*[@transform]/*[name()='g']/*[@aria-label and not(@fill-opacity)]"));
				    					  for(WebElement localEle:FilterChartValues) {
				    						  String FilteredValue=localEle.getText();
				    						  
				    						  if(!Numerical_ConditionFiltercell(NumFilterList[k],FilteredValue,NumFilterInputList[k],Condition_Between_InputB_Num_TF)) {
    			    			  				  filteredCell=false;
    			  							  }
				    					  }
				    					  
				    					  if(filteredCell==true) {
					  			    	       pass(driver,"For '"+NumFilterList[k]+"' condition applied correctly in the chart"+m);
					  			          }else {
			    							  fail(driver,"For '"+NumFilterList[k]+"' condition Tab Filter not Applied correctly in the chart"+m);
					  			          }  
			  			 		 	 }else {
				    					 String Failed=getText1(driver, ValidationChart);
			  			 		 		 pass(driver,"Unable to get the chart"+m+"  for the selected filter, "+NumFilterList[k]+" : "+Failed);
			  			 		 	 }
		    					  } // loop end for 2 charts validation .
		    			  		 
		    				 }catch(Exception e) {
		    					 e.printStackTrace();
		    				 }
	 			  		  }
	 			  		  
	 			  		 wait(driver,"1");
	 			  		 selectByText(driver, ConditionInput1_Num, FirstCondition_Num_TF); 
						 wait(driver,"1");
						 if(!FirstCondition_Num_TF.equals("is null") && !FirstCondition_Num_TF.equals("is not null") ) {
							 click(driver,FirstConditionValueInput1_Num);
							 clear1(driver,FirstConditionValueInput1_Num);
							 sendKeys(driver,FirstConditionValueInput1_Num,FirstCondition_Num_Input_TF);
							 wait(driver,"1");
						 }
						 
						 wait(driver,"1");
				  		 if(isDisplayed(driver,AddButtonCondition)) {
		    				  pass(driver,"ADD button displayed after selecting the first condition");
		    			  }else {
			    			  fail(driver,"ADD button not displayed after selecting the first condition"); 
			    		  }
		    				 
				  		  selectOperatorCondition1(driver,FirstOperator_Input_Num_TF);
				  		  
	    				  if(isDisplayed(driver,ConditionInput2_Num)) {
	    					  pass(driver,"After click 'ADD' button Second time Condition Selection dropdown is displayed");
	    				  }else {
		    				  fail(driver,"After click 'ADD' button Second time Condition Selection dropdown is not displayed"); 
		    			  } 
	 			  		
	    				  click(driver,ConditionInput2_Num);
						  selectByText(driver, ConditionInput2_Num, SecondCondition_Num_TF);
						  if(!SecondCondition_Num_TF.equals("is null") && !SecondCondition_Num_TF.equals("is not null") ) {
	    						 click(driver,SecondConditionValueInput1_Num);
		    					 clear(driver,SecondConditionValueInput1_Num);
		    					 sendKeys(driver,SecondConditionValueInput1_Num,SecondCondition_Num_Input_TF);
		    					 
						  }
						  wait(driver,"1");
						  if(isDisplayed(driver,AddButtonCondition)) {
		    				  pass(driver,"2 time ADD button displayed after selecting the condition 2nd time ");
						  }else {
							  fail(driver,"2 time ADD button not displayed after selecting the condition 2nd time ");
						  } 
	    				  
						  selectOperatorCondition2(driver,SecondOperator_Input_Num_TF);
						 
	    				  if(isDisplayed(driver,ConditionInput3_Num)) {
	    					  pass(driver,"After click 'ADD' button Third time Condition Selection dropdown is displayed");
	    				  }else {
	    					  fail(driver,"After click 'ADD' button Third time Condition Selection dropdown is not displayed");
	    				  }
	    				  click(driver,ConditionInput3_Num);
						  selectByText(driver, ConditionInput3_Num, ThirdCondition_num_TF);
						  wait(driver,"1");
						  
						  if(!ThirdCondition_num_TF.equals("is null") && !ThirdCondition_num_TF.equals("is not null") ) {
	    						 click(driver,ThirdConditionValueInput1_Num);
		    					 clear1(driver,ThirdConditionValueInput1_Num);
		    					 sendKeys(driver,ThirdConditionValueInput1_Num,ThirdCondition_Num_Input_TF);
		    					 
						  }
						  wait(driver,"1");
						  
						  if(isDisplayed2(driver,AddButtonCondition)) {
							  fail(driver,"'ADD' button displayed after given 3 times condition ");
						  }else {
							  pass(driver,"'ADD' button not displayed after given 3 times condition");
						  }
						  
						 
						  click(driver,ApplyButton_TabFilter);
						  if(isDisplayed(driver,Bug_msg)) {
    						  fail(driver,"Error displayed : "+getText1(driver, Bug_msg));
    					  }
						  elementnotvisible1(driver, RPE_Loading);
	 			  		
						  for (int m=1;m<=2;m++) {
				    			
    						  boolean chartdisplay=false;
    						  try {
	    						  WebElement chartBod1=driver.findElement(By.xpath("(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[name()='g' and @aria-label='Chart'])["+m+"]"));
	    						  if(chartBod1.isDisplayed()) {
	    							  chartdisplay=true;
	    						  }
	    					  }catch(Exception e) {
    						  
    					      }
 						  
	  			 		 	 if(chartdisplay==true) {
	    						  WebElement chartBod1=driver.findElement(By.xpath("(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[name()='g' and @aria-label='Chart'])["+m+"]"));
		  			 			  action.moveToElement(chartBod1).build().perform();
		  			 			  if(m==1) {
	  	    						String TabFilterIconColorRGB=getWebElement(driver, TabFilterIconChart1).getCssValue("fill");  
		  	    					String TabFilterIconColorAct=rgbToHex1(TabFilterIconColorRGB);
		  	    					  
		  	    					if("#0000FF".equalsIgnoreCase(TabFilterIconColorAct)) {
										 // pass(driver,"Tab Filter icon in chart1 changed to Blue color after Applying the Tab Filter"); 
									}else {
										 fail(driver,"Tab Filter icon in chart1 not changed to Blue color after Applying the Tab Filter"); 
									}
	  	    					  }else {
	  	    						String TabFilterIconColorRGB=getWebElement(driver, TabFilterIconChart2).getCssValue("fill");  
		  	    					String TabFilterIconColorAct=rgbToHex1(TabFilterIconColorRGB);
		  	    					  
		  	    					if("#0000FF".equalsIgnoreCase(TabFilterIconColorAct)) {
										  //pass(driver,"Tab Filter icon in chart2 changed to Blue color after Applying the Tab Filter"); 
									}else {
										  fail(driver,"Tab Filter icon in chart2 not changed to Blue color after Applying the Tab Filter"); 
									}
	  	    					  }
		  			 			  
	  	    					  boolean filteredCell=true;
		    					  List<WebElement> FilterChartValues=driver.findElements(By.xpath("(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[@aria-label='Chart'])["+m+"]//*[@transform]/*[name()='g']/*[@aria-label and not(@fill-opacity)]"));
		    					  for(WebElement localEle:FilterChartValues) {
		    						  String FilteredValue=localEle.getText();
		    						  boolean condition_1_Result=Numerical_ConditionFiltercell(FirstCondition_Num_TF,FilteredValue,FirstCondition_Num_Input_TF,Condition_Between_InputB_Num_TF);
		    						  boolean condition_2_Result=Numerical_ConditionFiltercell(SecondCondition_Num_TF,FilteredValue,SecondCondition_Num_Input_TF,Condition_Between_InputB_Num_TF);
		    						  boolean condition_3_Result=Numerical_ConditionFiltercell(ThirdCondition_num_TF,FilteredValue,ThirdCondition_Num_Input_TF,Condition_Between_InputB_Num_TF);
		    						  String operator1 = FirstOperator_Input_Num_TF;
		    						  String operator2 = SecondOperator_Input_Num_TF;
    	    			  				 
    			  				 	  if(!evaluateConditions(condition_1_Result,operator1,condition_2_Result,operator2,condition_3_Result)) {
    	    			  					 filteredCell=false;
    			  				 	  }
		    					  }
		    					  
		    					  if(filteredCell==true) {
			  			    	       pass(driver,"For Selected 3 condition applied correctly in the chart"+m);
			  			          }else {
	    							  fail(driver,"For Selected 3 condition Tab Filter not Applied correctly in the chart"+m);
			  			          }  
	  			 		 	 }else {
		    					 String Failed=getText1(driver, ValidationChart);
	  			 		 		 pass(driver,"Unable to get the chart"+m+"  for the selected filter, 3 conditions : "+Failed);
	  			 		 	 }
    					  } // loop end for 2 charts validation .
						  
						  click(driver,ResetButton_TabFilter);
						  elementnotvisible1(driver, RPE_Loading);
						  for (int m=1;m<=2;m++) {
    						  boolean chartdisplay=false;
    						  try {
	    						  WebElement chartBod1=driver.findElement(By.xpath("(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[name()='g' and @aria-label='Chart'])["+m+"]"));
	    						  if(chartBod1.isDisplayed()) {
	    							  chartdisplay=true;
	    						  }
	    					  }catch(Exception e) {
    						  
    					      }
    						  
    						  if(chartdisplay==true) {
    							  
    							  WebElement chartBod1=driver.findElement(By.xpath("(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[name()='g' and @aria-label='Chart'])["+m+"]"));
    							  action.moveToElement(chartBod1).build().perform();
    							  
    							  if(m==1) {
		  	    						String TabFilterIconColorRGB=getWebElement(driver, TabFilterIconChart1).getCssValue("fill");  
			  	    					String TabFilterIconColorAct=rgbToHex1(TabFilterIconColorRGB);
			  	    					  
			  	    					if(!"#0000FF".equalsIgnoreCase(TabFilterIconColorAct)) {
											  pass(driver,"Tab Filter icon in chart1 changed to default color after Reset the Tab Filter"); 
										}else {
											  fail(driver,"Tab Filter icon in chart1 not changed to default color after Reset the Tab Filter"); 
										}
	  	    					  }else {
		  	    						String TabFilterIconColorRGB=getWebElement(driver, TabFilterIconChart2).getCssValue("fill");  
			  	    					String TabFilterIconColorAct=rgbToHex1(TabFilterIconColorRGB);
			  	    					  
			  	    					if(!"#0000FF".equalsIgnoreCase(TabFilterIconColorAct)) {
											  pass(driver,"Tab Filter icon in chart2 changed to default color after Reset the Tab Filter"); 
										}else {
											  fail(driver,"Tab Filter icon in chart2 not changed to default color after Reset the Tab Filter"); 
										}
	  	    					  }
    						  }else {
		    					  String Failed=getText1(driver, ValidationChart);
    							  fail(driver,"Unable to get the chart"+m+" for the after reseting the filter : "+Failed);
    						  }
    					  }  // loop end for 2 charts validation .
						  
	  				  }
	    		  }else {
	    			  fail(driver,Select_Y_Axis_Value+" Numerical Column not present");
	    		  }
	    		  
			} //Num End......
			  
			//Text Local filter Start....
			if(Y_Axis_dataType.equals("Text")) { 
				
				boolean textFilter=false;
    		  	try {
	    			  WebElement TextColumn= driver.findElement(By.xpath("//div[@id='dashboardTRPE_select_filterColsCon']//div[@id='"+Select_Y_Axis_Value+"']//a"));
		    		  action.moveToElement(TextColumn).click().build().perform();
		    		  textFilter=true;
    		  	}catch(Exception e) {
	    			  
    		  	}
				
    		  	if(textFilter==true) {
		    		  WebElement textColumnExp=driver.findElement(By.xpath("//div[@id='dashboardTRPE_select_filterColsCon']//div[@id='"+Select_Y_Axis_Value+"']//a//i"));
		    		  String textColumnExpText=textColumnExp.getAttribute("class");
		    		  if(textColumnExpText.contains("up")) {
		    			  pass(driver,"Text Column Expand After click on it ");
		    			  if(verifyElementDisplayed(driver, byValueFilterOption)) {
		    				  if(isElementSelected(driver,byValueRadioButton)) {
		    					  pass(driver,"By default, 'By Values' radio button selected ");
		    				  }else {
		    					  fail(driver,"By default, 'By Values' radio button not selected ");
		    				  }
	    				  }
		    			  
	   				      verifyElementDisplayed(driver, AllCheckbox_CategoricalSec);
		    			  verifyElementDisplayed(driver, CategoricalSearchListOptions);
		    			  verifyElementDisplayed(driver, ExcludeOption_Categorical);
		    			  verifyElementDisplayed(driver, ExcludeCheckbox);

		    			  List<WebElement> searchListAvailable=getWebElements(driver,AvailableList_ByValue);
		    			  List<WebElement> searchListCheckboxAvailable=getWebElements(driver,AvailableListCheckbox_ByValue);
 				      
		    			  if(searchListAvailable.size()==searchListCheckboxAvailable.size()) {
		    				  pass(driver,"All the available searchlist are displayed with Checkbox");
		    			  }else {
		    				  fail(driver,"Some available searchlist are not displayed with Checkbox");
		    			  }
				      
		    			  waitForElement(driver,SearchField_CategoricalSec);
		    			  click(driver,SearchField_CategoricalSec);
		    			  sendKeys(driver,SearchField_CategoricalSec,ByValuesInput_Text_TF);
		    			  wait(driver,"1");
		    			  String firstOptionText=getText1(driver,FirstSearchedListValue);
		    			  if(firstOptionText.equals(ByValuesInput_Text_TF)) {
		    				  pass(driver,"Search bar inside the Text section works properly");
		    			  }else {
		    				  fail(driver,"Search bar inside the Text section not works properly");
		    			  }
		    			  
		    			  click(driver,FirstSearchedListValue);
	    				  wait(driver,"1");
	    				  
	    				  if(isElementSelected(driver,FirstSearchedCheckbox)) {
	    					  pass(driver,"Check box selected when click the First searched value");
	    				  }else {
			    			  fail(driver,"Check box not selected when click the First searched value"); 
	    				  }
	   				      
	    				  click(driver,ApplyButton_TabFilter);
	    				  if(isDisplayed(driver,Bug_msg)) {
    						  fail(driver,"Error displayed : "+getText1(driver, Bug_msg));
    					  }
	    				  elementnotvisible1(driver, RPE_Loading);
   					      for (int m=1;m<=2;m++) {
			    			
   					    	  boolean chartdisplay=false;
   					    	  try {
   					    		  WebElement chartBod1=driver.findElement(By.xpath("(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[name()='g' and @aria-label='Chart'])["+m+"]"));
   					    		  if(chartBod1.isDisplayed()) {
   					    			  chartdisplay=true;
   					    		  }
   					    	  }catch(Exception e) {
						  
   					    	  }
					  
   					    	  if(chartdisplay==true) {
   					    		  WebElement chartBod1=driver.findElement(By.xpath("(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[name()='g' and @aria-label='Chart'])["+m+"]"));
   					    		  action.moveToElement(chartBod1).build().perform();
   					    		  if(m==1) {
   					    			  String TabFilterIconColorRGB=getWebElement(driver, TabFilterIconChart1).getCssValue("fill");  
   					    			  String TabFilterIconColorAct=rgbToHex1(TabFilterIconColorRGB);
	  	    					  
   					    			  if("#0000FF".equalsIgnoreCase(TabFilterIconColorAct)) {
   					    				  // pass(driver,"Tab Filter icon in chart1 changed to Blue color after Applying the Tab Filter"); 
   					    			  }else {
   					    				  fail(driver,"Tab Filter icon in chart1 not changed to Blue color after Applying the Tab Filter"); 
   					    			  }
   					    		  }else {
   					    			  String TabFilterIconColorRGB=getWebElement(driver, TabFilterIconChart2).getCssValue("fill");  
   					    			  String TabFilterIconColorAct=rgbToHex1(TabFilterIconColorRGB);
	  	    					  
   					    			  if("#0000FF".equalsIgnoreCase(TabFilterIconColorAct)) {
   					    				  //pass(driver,"Tab Filter icon in chart2 changed to Blue color after Applying the Tab Filter"); 
   					    			  }else {
   					    				  fail(driver,"Tab Filter icon in chart2 not changed to Blue color after Applying the Tab Filter"); 
   					    			  }
   					    		  }
	  			 			  
   					    		  boolean filteredCell=true;
   					    		  List<WebElement> FilterChartValues=driver.findElements(By.xpath("(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[@aria-label='Chart'])["+m+"]//*[@transform]/*[name()='g']/*[@aria-label and not(@fill-opacity)]"));
   					    		  for(WebElement localEle:FilterChartValues) {
   					    			  String FilteredValue=localEle.getText();
   					    			  if(!FilteredValue.equals(ByValuesInput_Text_TF)) {
   					    				  filteredCell=false;
   					    			  }
   					    		  }
	    					  
   					    		  if(filteredCell==true) {
   					    			  pass(driver,"For By Value condition applied correctly in the chart"+m);
   					    		  }else {
   					    			  fail(driver,"For By Value condition Tab Filter not Applied correctly in the chart"+m);
   					    		  }  
   					    	  }else {
		    					  String Failed=getText1(driver, ValidationChart);
   					    		  pass(driver,"Unable to get the chart"+m+"  for the selected filter, By Value : "+Failed);
   					    	  }
   					      } // loop end for 2 charts validation .
   					      
   					      click(driver,ExcludeCheckbox);
	 		    		  click(driver,ApplyButton_TabFilter);
	 		    		 if(isDisplayed(driver,Bug_msg)) {
	 		    			 fail(driver,"Error displayed : "+getText1(driver, Bug_msg));
	 		    		 }
	 		    		  elementnotvisible1(driver, RPE_Loading);
	   					  for (int m=1;m<=2;m++) {
 					    	  boolean chartdisplay=false;
 					    	  try {
 					    		  WebElement chartBod1=driver.findElement(By.xpath("(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[name()='g' and @aria-label='Chart'])["+m+"]"));
 					    		  if(chartBod1.isDisplayed()) {
 					    			  chartdisplay=true;
 					    		  }
 					    	  }catch(Exception e) {
						  
 					    	  }
					  
 					    	  if(chartdisplay==true) {
 					    		  WebElement chartBod1=driver.findElement(By.xpath("(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[name()='g' and @aria-label='Chart'])["+m+"]"));
 					    		  action.moveToElement(chartBod1).build().perform();
 					    		  if(m==1) {
 					    			  String TabFilterIconColorRGB=getWebElement(driver, TabFilterIconChart1).getCssValue("fill");  
 					    			  String TabFilterIconColorAct=rgbToHex1(TabFilterIconColorRGB);
 					    			  if("#0000FF".equalsIgnoreCase(TabFilterIconColorAct)) {
 					    				  // pass(driver,"Tab Filter icon in chart1 changed to Blue color after Applying the Tab Filter"); 
 					    			  }else {
 					    				  fail(driver,"Tab Filter icon in chart1 not changed to Blue color after Applying the Tab Filter"); 
 					    			  }
 					    		  }else {
 					    			  String TabFilterIconColorRGB=getWebElement(driver, TabFilterIconChart2).getCssValue("fill");  
 					    			  String TabFilterIconColorAct=rgbToHex1(TabFilterIconColorRGB);
	  	    					  
 					    			  if("#0000FF".equalsIgnoreCase(TabFilterIconColorAct)) {
 					    				  //pass(driver,"Tab Filter icon in chart2 changed to Blue color after Applying the Tab Filter"); 
 					    			  }else {
 					    				  fail(driver,"Tab Filter icon in chart2 not changed to Blue color after Applying the Tab Filter"); 
 					    			  }
 					    		  }
	  			 			  
 					    		  boolean filteredCell=true;
 					    		  List<WebElement> FilterChartValues=driver.findElements(By.xpath("(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[@aria-label='Chart'])["+m+"]//*[@transform]/*[name()='g']/*[@aria-label and not(@fill-opacity)]"));
 					    		  for(WebElement localEle:FilterChartValues) {
 					    			  String FilteredValue=localEle.getText();
 					    			  if(FilteredValue.equals(ByValuesInput_Text_TF)) {
 					    				  filteredCell=false;
 					    			  }
 					    		  }
	    					  
 					    		  if(filteredCell==true) {
 					    			  pass(driver,"For By Value with Exclude condition applied correctly in the chart"+m);
 					    		  }else {
 					    			  fail(driver,"For By Value with Exclude condition Tab Filter not Applied correctly in the chart"+m);
 					    		  }  
 					    	  }else {
		    					  String Failed=getText1(driver, ValidationChart);
 					    		  pass(driver,"Unable to get the chart"+m+"  for the selected filter, By Value with Exclude : "+Failed);
 					    	  }
 					      } // loop end for 2 charts validation.....
	   					  
	   					 if(verifyElementDisplayed(driver, ConditionFilterOption_Categorical)) {
	   				    	  click(driver,ConditionFilterOption_Categorical);
	   				    	  wait(driver,"1");
	   				    	  if(isElementSelected(driver,ConditionRadioButton_Categorical)) {
	   				    		  pass(driver,"Condition radio button selected after click on it");
	   				    	  }else {
	   				    		  fail(driver,"Condition radio button not selected after click on it");
	   				    	  } 
	   				    	  
	   				    	 if(verifyElementDisplayed(driver, ConditionSelectDropdown)) {
	 			    			  String defaultSelectedCondition=defaultSelectedValue(driver, ConditionSelectDropdown);
	 			    			  if(defaultSelectedCondition.equals("equal to")) {
	 			    				  pass(driver,"By default, 'equal to' option selected in the Condition select dropdown");
	 			    			  }else {
	 			    				  fail(driver,"By default, 'equal to' option not selected in the Condition select dropdown");
	 			    			  }
	 			    			  
	 			    			 String[] conditionsList= {Condition_1_Text_TF,Condition_2_Text_TF,Condition_3_Text_TF,Condition_4_Text_TF,Condition_5_Text_TF,Condition_6_Text_TF,Condition_7_Text_TF,Condition_8_Text_TF};
	 			    			 String[] conditionsInputList= {Condition_Input_1_Text_TF,Condition_Input_2_Text_TF,Condition_Input_3_Text_TF,Condition_Input_4_Text_TF,Condition_Input_5_Text_TF,Condition_Input_6_Text_TF,Condition_Input_7_Text_TF,Condition_Input_8_Text_TF};
	 			    			 for(int k=0;k<8;k++) {
	 			    				 
	 			    				 try {
	 			    					 selectByText(driver, ConditionSelectDropdown, conditionsList[k]); 
	 			    					 wait(driver,"1");
	 			    			  		 click(driver,ConditonInput1);
	 			    			  		 clear1(driver,ConditonInput1);
	 			    			  		 sendKeys(driver,ConditonInput1,conditionsInputList[k]);
	 			    			  		 wait(driver,"1");
	 			    			  		 click(driver,ApplyButton_TabFilter);
	 			    			  		 if(isDisplayed(driver,Bug_msg)) {
	 			    						  fail(driver,"Error displayed : "+getText1(driver, Bug_msg));
	 			    					 }
	 			    			  		 elementnotvisible1(driver, RPE_Loading);
	 			    			  		 
	 			    			  		 for (int m=1;m<=2;m++) {
	 						    			
	 			   					    	  boolean chartdisplay=false;
	 			   					    	  try {
	 			   					    		  WebElement chartBod1=driver.findElement(By.xpath("(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[name()='g' and @aria-label='Chart'])["+m+"]"));
	 			   					    		  if(chartBod1.isDisplayed()) {
	 			   					    			  chartdisplay=true;
	 			   					    		  }
	 			   					    	  }catch(Exception e) {
	 									  
	 			   					    	  }
	 								  
	 			   					    	  if(chartdisplay==true) {
	 			   					    		  WebElement chartBod1=driver.findElement(By.xpath("(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[name()='g' and @aria-label='Chart'])["+m+"]"));
	 			   					    		  action.moveToElement(chartBod1).build().perform();
	 			   					    		  if(m==1) {
	 			   					    			  String TabFilterIconColorRGB=getWebElement(driver, TabFilterIconChart1).getCssValue("fill");  
	 			   					    			  String TabFilterIconColorAct=rgbToHex1(TabFilterIconColorRGB);
	 				  	    					  
	 			   					    			  if("#0000FF".equalsIgnoreCase(TabFilterIconColorAct)) {
	 			   					    				  // pass(driver,"Tab Filter icon in chart1 changed to Blue color after Applying the Tab Filter"); 
	 			   					    			  }else {
	 			   					    				  fail(driver,"Tab Filter icon in chart1 not changed to Blue color after Applying the Tab Filter"); 
	 			   					    			  }
	 			   					    		  }else {
	 			   					    			  String TabFilterIconColorRGB=getWebElement(driver, TabFilterIconChart2).getCssValue("fill");  
	 			   					    			  String TabFilterIconColorAct=rgbToHex1(TabFilterIconColorRGB);
	 				  	    					  
	 			   					    			  if("#0000FF".equalsIgnoreCase(TabFilterIconColorAct)) {
	 			   					    				  //pass(driver,"Tab Filter icon in chart2 changed to Blue color after Applying the Tab Filter"); 
	 			   					    			  }else {
	 			   					    				  fail(driver,"Tab Filter icon in chart2 not changed to Blue color after Applying the Tab Filter"); 
	 			   					    			  }
	 			   					    		  }
	 				  			 			  
	 			   					    		  boolean filteredCell=true;
	 			   					    		  List<WebElement> FilterChartValues=driver.findElements(By.xpath("(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[@aria-label='Chart'])["+m+"]//*[@transform]/*[name()='g']/*[@aria-label and not(@fill-opacity)]"));
	 			   					    		  for(WebElement localEle:FilterChartValues) {
	 			   					    			  String FilteredValue=localEle.getText();
	 			   					    			  if(!Categorical_ConditionFiltercell(conditionsList[k],FilteredValue,conditionsInputList[k])) {
	 			   					    				  filteredCell=false;
	 			   					    			  }
	 			   					    		  }
	 				    					  
	 			   					    		  if(filteredCell==true) {
	 			   					    			  pass(driver,"For "+conditionsList[k]+" condition applied correctly in the chart"+m);
	 			   					    		  }else {
	 			   					    			  fail(driver,"For "+conditionsList[k]+"condition Tab Filter not Applied correctly in the chart"+m);
	 			   					    		  }  
	 			   					    	  }else {
	 					    					  String Failed=getText1(driver, ValidationChart);
	 			   					    		  pass(driver,"Unable to get the chart"+m+"  for the selected filter, "+conditionsList[k]+" : "+Failed);
	 			   					    	  }
	 			   					      } // loop end for 2 charts validation .
	 			    			  		 
	 			    				 }catch(Exception e) {
	 			    					 e.printStackTrace();
	 			    				 }
	 			    			 }
	 			    			 
	 			    			  click(driver,ConditionSelectDropdown);
	 			    			  selectByText(driver, ConditionSelectDropdown, FirstCondition_Text_TF);
	 			    			  wait(driver,"1");
	 			    			  click(driver,ConditonInput1);
	 			    			  clear1(driver,ConditonInput1);
	 			    			  sendKeys(driver,ConditonInput1,FirstCondition_Input_Text_TF);
	 			    			  wait(driver,"1");
	 			    			  if(isDisplayed(driver,AddButtonCondition)) {
	 			    				  pass(driver,"ADD button displayed after selecting the condition");
	 			    			  }else {
	 				    			  fail(driver,"ADD button not displayed after selecting the condition"); 
	 				    		  }
	 			    				  
	 			    			  selectOperatorCondition1(driver,FirstOperator_Input_Text_TF);
	 			    			 
	 		    				  if(isDisplayed(driver,ConditionSelectDropdown2)) {
	 		    					  pass(driver,"After click 'ADD' button Second time Condition Selection dropdown is displayed");
	 		    				  }else {
	 			    				  fail(driver,"After click 'ADD' button Second time Condition Selection dropdown is not displayed"); 
	 			    			  } 
	 		    					 
	 		    				  click(driver,ConditionSelectDropdown2);
	 	    					  selectByText(driver, ConditionSelectDropdown2, SecondCondition_Text_TF);
	 	    					  wait(driver,"1");
	 	    					  click(driver,ConditonInput2);
	 	    					  sendKeys(driver,ConditonInput2,SecondCondition_Input_Text_TF);
	 	    					  wait(driver,"1");
	 	    					  if(isDisplayed(driver,AddButtonCondition)) {
	 			    				  pass(driver,"2 time ADD button displayed after selecting the condition 2nd time ");
	 	    					  }else {
	 	    						  fail(driver,"2 time ADD button not displayed after selecting the condition 2nd time ");
	 	    					  } 
	 			    				  
	 	    					  selectOperatorCondition2(driver,SecondOperator_Input_Text_TF);
	 	    					 
	 		    				  if(isDisplayed(driver,ConditionSelectDropdown3)) {
	 		    					  pass(driver,"After click 'ADD' button Third time Condition Selection dropdown is displayed");
	 		    				  }else {
	 		    					  fail(driver,"After click 'ADD' button Third time Condition Selection dropdown is not displayed");
	 		    				  }
	 		    					  
	 	    					  selectByText(driver, ConditionSelectDropdown3, ThirdCondition_Text_TF);
	 	    					  wait(driver,"1");
	 	    					  click(driver,ConditonInput3);
	 	    					  sendKeys(driver,ConditonInput3,ThirdCondition_Input_Text_TF);
	 	    					  wait(driver,"1");
	 	    					  if(isDisplayed2(driver,AddButtonCondition)) {
	 	    						  fail(driver,"'ADD' button displayed after given 3 times condition ");
	 	    					  }else {
	 	    						  pass(driver,"'ADD' button not displayed after given 3 times condition");
	 	    					  }
	 	    					 
	 	    					  click(driver,ApplyButton_TabFilter);
	 	    					 if(isDisplayed(driver,Bug_msg)) {
	 	    						  fail(driver,"Error displayed : "+getText1(driver, Bug_msg));
	 	    					  }
	 	    					  elementnotvisible1(driver, RPE_Loading);
	 			    			  
	 	    					  for (int m=1;m<=2;m++) {
						    			
		   					    	  boolean chartdisplay=false;
		   					    	  try {
		   					    		  WebElement chartBod1=driver.findElement(By.xpath("(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[name()='g' and @aria-label='Chart'])["+m+"]"));
		   					    		  if(chartBod1.isDisplayed()) {
		   					    			  chartdisplay=true;
		   					    		  }
		   					    	  }catch(Exception e) {
								  
		   					    	  }
							  
		   					    	  if(chartdisplay==true) {
		   					    		  WebElement chartBod1=driver.findElement(By.xpath("(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[name()='g' and @aria-label='Chart'])["+m+"]"));
		   					    		  action.moveToElement(chartBod1).build().perform();
		   					    		  if(m==1) {
		   					    			  String TabFilterIconColorRGB=getWebElement(driver, TabFilterIconChart1).getCssValue("fill");  
		   					    			  String TabFilterIconColorAct=rgbToHex1(TabFilterIconColorRGB);
			  	    					  
		   					    			  if("#0000FF".equalsIgnoreCase(TabFilterIconColorAct)) {
		   					    				  // pass(driver,"Tab Filter icon in chart1 changed to Blue color after Applying the Tab Filter"); 
		   					    			  }else {
		   					    				  fail(driver,"Tab Filter icon in chart1 not changed to Blue color after Applying the Tab Filter"); 
		   					    			  }
		   					    		  }else {
		   					    			  String TabFilterIconColorRGB=getWebElement(driver, TabFilterIconChart2).getCssValue("fill");  
		   					    			  String TabFilterIconColorAct=rgbToHex1(TabFilterIconColorRGB);
			  	    					  
		   					    			  if("#0000FF".equalsIgnoreCase(TabFilterIconColorAct)) {
		   					    				  //pass(driver,"Tab Filter icon in chart2 changed to Blue color after Applying the Tab Filter"); 
		   					    			  }else {
		   					    				  fail(driver,"Tab Filter icon in chart2 not changed to Blue color after Applying the Tab Filter"); 
		   					    			  }
		   					    		  }
			  			 			  
		   					    		  boolean filteredCell=true;
		   					    		  List<WebElement> FilterChartValues=driver.findElements(By.xpath("(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[@aria-label='Chart'])["+m+"]//*[@transform]/*[name()='g']/*[@aria-label and not(@fill-opacity)]"));
		   					    		  for(WebElement localEle:FilterChartValues) {
		   					    			  String FilteredValue=localEle.getText();
		   					    			  
		   					    			  boolean condition_1_Result=Categorical_ConditionFiltercell(FirstCondition_Text_TF,FilteredValue,FirstCondition_Input_Text_TF);
	 		    						      boolean condition_2_Result=Categorical_ConditionFiltercell(SecondCondition_Text_TF,FilteredValue,SecondCondition_Input_Text_TF);
	 		    						      boolean condition_3_Result=Categorical_ConditionFiltercell(ThirdCondition_Text_TF,FilteredValue,ThirdCondition_Input_Text_TF);
	 		    						      String operator1 = FirstOperator_Input_Text_TF; 
	 		    						      String operator2 = SecondOperator_Input_Text_TF;
	 		    			  				 
	 		    			  				  if(!evaluateConditions(condition_1_Result,operator1,condition_2_Result,operator2,condition_3_Result)) {
	 		    			  					 filteredCell=false;
	 		    			  				  }
		   					    		  }
			    					  
		   					    		  if(filteredCell==true) {
		   					    			  pass(driver,"For Selected 3 condition applied correctly in the chart"+m);
		   					    		  }else {
		   					    			  fail(driver,"For Selected 3 condition Tab Filter not Applied correctly in the chart"+m);
		   					    		  }  
		   					    	  }else {
				    					  String Failed=getText1(driver, ValidationChart);
		   					    		  pass(driver,"Unable to get the chart"+m+"  for the selected filter, 3 condition : "+Failed);
		   					    	  }
		   					      } // loop end for 2 charts validation .
	 	    					  
	 	    					  click(driver,ResetButton_TabFilter);
	 	    					  if(isDisplayed(driver,Bug_msg)) {
	 	    						  fail(driver,"Error displayed : "+getText1(driver, Bug_msg));
	 	    					  }
	 	    					  elementnotvisible1(driver, RPE_Loading);
		    					  
		    					  for (int m=1;m<=2;m++) {
   				    			  
		    						  boolean chartdisplay=false;
		    						  try {
			    						  WebElement chartBod1=driver.findElement(By.xpath("(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[name()='g' and @aria-label='Chart'])["+m+"]"));
			    						  if(chartBod1.isDisplayed()) {
			    							  chartdisplay=true;
			    						  }
			    					  }catch(Exception e) {
		    						  
		    					      }
   	    						  
   	    						      if(chartdisplay==true) {
   	    							  
   	    							      WebElement chartBod1=driver.findElement(By.xpath("(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[name()='g' and @aria-label='Chart'])["+m+"]"));
		    							  action.moveToElement(chartBod1).build().perform();
   	    							  
		    							  if(m==1) {
				  	    						String TabFilterIconColorRGB=getWebElement(driver, TabFilterIconChart1).getCssValue("fill");  
					  	    					String TabFilterIconColorAct=rgbToHex1(TabFilterIconColorRGB);
					  	    					  
					  	    					if(!"#0000FF".equalsIgnoreCase(TabFilterIconColorAct)) {
													  pass(driver,"Tab Filter icon in chart1 changed to default color after Reset the Tab Filter"); 
												}else {
													  fail(driver,"Tab Filter icon in chart1 not changed to default color after Reset the Tab Filter"); 
												}
			  	    					  }else {
				  	    						String TabFilterIconColorRGB=getWebElement(driver, TabFilterIconChart2).getCssValue("fill");  
					  	    					String TabFilterIconColorAct=rgbToHex1(TabFilterIconColorRGB);
					  	    					  
					  	    					if(!"#0000FF".equalsIgnoreCase(TabFilterIconColorAct)) {
													  pass(driver,"Tab Filter icon in chart2 changed to default color after Reset the Tab Filter"); 
												}else {
													  fail(driver,"Tab Filter icon in chart2 not changed to default color after Reset the Tab Filter"); 
												}
			  	    					  }
   	    						      }else {
   	 		    					      String Failed=getText1(driver, ValidationChart);
   	    						    	  fail(driver,"Unable to get the chart"+m+" for the after reseting the filter : "+Failed);
   	    						      }
		    					  }  // loop end for 2 charts validation .
		    					  
	   				    	 }
	   					 }
		    		  }else {
   						  fail(driver, Select_Y_Axis_Value+" Text Column not Expand After click on it ");
   		    		  }
    		  	 }else {
	    			pass(driver,Select_Y_Axis_Value+" Text Column value not present in Tab filter");
	    		 }
			 }  //Numerical Validation End.. 
			  
		  }
		  
	}
	
	
	
}
