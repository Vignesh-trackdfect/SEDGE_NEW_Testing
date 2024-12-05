package scripts;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import commonMethods.Keywords;
import commonMethods.Utils;

public class DASHPRO_TABLES_SMOKE_TESTING extends Keywords{
	
	public void tablesDashProTest(WebDriver driver, int iteration,String Flag) throws Exception {
		
		String TableColumnSelectColor=Utils.getDataFromTestData("SmokeTesting_UI", "TableColumnSelectColor");
		String DefaultFontFamily_TableFormat=Utils.getDataFromTestData("SmokeTesting_UI", "DefaultFontFamily_TableFormat");
		String DefaultFontSize_TableFormat=Utils.getDataFromTestData("SmokeTesting_UI", "DefaultFontSize_TableFormat");
		String DefaultHeaderColor_TableFormat=Utils.getDataFromTestData("SmokeTesting_UI", "DefaultHeaderColor_TableFormat");
       	String DefaultBodyFontSize_TableFormat=Utils.getDataFromTestData("SmokeTesting_UI", "DefaultBodyFontSize_TableFormat");
       	String DefaultBorderType_TableFormat=Utils.getDataFromTestData("SmokeTesting_UI", "DefaultBorderType_TableFormat");
       	String NegativeCellColor_TableFormat=Utils.getDataFromTestData("SmokeTesting_UI", "NegativeCellColor_TableFormat");
       	String AlignmentSelectedColor_TableFormat=Utils.getDataFromTestData("SmokeTesting_UI", "AlignmentSelectedColor_TableFormat");
       	String DefaultGrandTotalColor_TableFormat=Utils.getDataFromTestData("SmokeTesting_UI", "DefaultGrandTotalColor_TableFormat");
       	String DefaultSeperator_TableFormat=Utils.getDataFromTestData("SmokeTesting_UI", "DefaultSeperator_TableFormat");
       	String DefaultRoundOff_TableFormat=Utils.getDataFromTestData("SmokeTesting_UI", "DefaultRoundOff_TableFormat");
       	String AppluBtnColor_LocalFilterExp=Utils.getDataFromTestData("SmokeTesting_UI", "AppluBtnColor_LocalFilterExp");

       	
       	String ChartTitle_text_Exp=Utils.getDataFromTestData("ChartTitle", "ChartTitle_text");
		String ChartTitleColorExp=Utils.getDataFromTestData("ChartTitle", "ChartTitleColorExp");
		String BackgroundText_Exp=Utils.getDataFromTestData("ChartTitle", "BackgroundText_Exp");
		String DefaultBackgroundColor_Exp=Utils.getDataFromTestData("ChartTitle", "DefaultBackgroundColor");
		String FontColorText_Exp=Utils.getDataFromTestData("ChartTitle", "FontColorText_Exp");
		String DefaultFontColor_Exp=Utils.getDataFromTestData("ChartTitle", "DefaultFontColor");
		String FontFamily_text_Exp=Utils.getDataFromTestData("ChartTitle", "FontFamily_text");
//		String Default_FontFamily=Utils.getDataFromTestData("ChartTitle", "default_FontFamily");
		String FontSizeText_Exp=Utils.getDataFromTestData("ChartTitle", "FontSizeText_Exp");

		String TableFormatExpandColor=Utils.getDataFromTestData("SmokeTesting_UI", "TableFormatExpandColor");
		
		//Iteration Inputs
//		String ColumnNameInput_Smoke_131=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input", "ColumnNameInput_Smoke_131");
		String SearchColumInput_Somke_168=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input", "SearchColumInput_Somke_168");
		String MultipleSearchInput_Smoke_171=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input", "MultipleSearchInput_Smoke_171");
		String SearchUpperLowerInput_Smoke_172=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input", "SearchUpperLowerInput_Smoke_172");
		String BackColorInputTable_Smoke_180=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input", "BackColorInputTable_Smoke_180");
		String FontColorInputTable_Smoke_186=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input", "FontColorInputTable_Smoke_186");
		String ChartTitleName_Smoke=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input", "ChartTitleName_Smoke");
		String DefaultFontFamily_Smoke_189=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input", "DefaultFontFamily_Smoke_189");
		String FontFamilyInput_Smoke_193=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input", "FontFamilyInput_Smoke_193");
		String DefaultFontSize_Smoke_196=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input", "DefaultFontSize_Smoke_196");
		String ChangeFontSize_Smoke_202=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input", "ChangeFontSize_Smoke_202");
		String SelectTableTheme_Smoke_211=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input", "SelectTableTheme_Smoke_211");
		String SearchFontFamily_Smoke_220=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input", "SearchFontFamily_Smoke_220");
		String SelectFontSize_Smoke_225=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input", "SelectFontSize_Smoke_225");
		String ChangeHeaderColor_Smoke_231=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input", "ChangeHeaderColor_Smoke_231");
		String ChangeBodyFontSize_Smoke_239=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input", "ChangeBodyFontSize_Smoke_239");
		String ChangeBorderValue_Smoke_244=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input", "ChangeBorderValue_Smoke_244");
		String ChangeRowTotalColor_Smoke_282=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input", "ChangeRowTotalColor_Smoke_282");
		String ChangeColumnTotalColor_Smoke_290=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input", "ChangeColumnTotalColor_Smoke_290");
		String ChangeSeperator_Smoke_293=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input", "ChangeSeperator_Smoke_293");
		String SelectColumnSeperator_Smoke_299=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input", "SelectColumnSeperator_Smoke_299");
		String ChangeRoundOff_Smoke_304=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input", "ChangeRoundOff_Smoke_304");
		String SelectColumnRoundOff_Smoke_303=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input", "SelectColumnRoundOff_Smoke_303");
		String ColumnRename_Smoke_311=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input", "ColumnRename_Smoke_311");
		String TabNameNew_Global_Smoke_=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input", "TabNameNew_Global_Smoke_");
		String ChartNameGlobal_Smoke=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input", "ChartNameGlobal_Smoke");

	    //Local filter inputs Categorical
		String SelectCategorical_LocalFilter=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_LocalFilter_Table", "SelectCategoricalColumn_Smoke_LocalFilter");
		String ByValuesInput_Categorical_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_LocalFilter_Table", "ByValuesInput_Categorical_LF");
		String FirstCondition_1_Categorical_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_LocalFilter_Table", "FirstCondition_1_Categorical_LF");
		String FirstCondition_2_Categorical_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_LocalFilter_Table", "FirstCondition_2_Categorical_LF");
		String FirstCondition_3_Categorical_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_LocalFilter_Table", "FirstCondition_3_Categorical_LF");
		String FirstCondition_4_Categorical_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_LocalFilter_Table", "FirstCondition_4_Categorical_LF");
		String FirstCondition_5_Categorical_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_LocalFilter_Table", "FirstCondition_5_Categorical_LF");
		String FirstCondition_6_Categorical_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_LocalFilter_Table", "FirstCondition_6_Categorical_LF");
		String FirstCondition_7_Categorical_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_LocalFilter_Table", "FirstCondition_7_Categorical_LF");
		String FirstCondition_8_Categorical_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_LocalFilter_Table", "FirstCondition_8_Categorical_LF");
		String FirstCondition_Input_1_Categorical_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_LocalFilter_Table", "FirstCondition_Input_1_Categorical_LF");
		String FirstCondition_Input_2_Categorical_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_LocalFilter_Table", "FirstCondition_Input_2_Categorical_LF");
		String FirstCondition_Input_3_Categorical_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_LocalFilter_Table", "FirstCondition_Input_3_Categorical_LF");
		String FirstCondition_Input_4_Categorical_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_LocalFilter_Table", "FirstCondition_Input_4_Categorical_LF");
		String FirstCondition_Input_5_Categorical_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_LocalFilter_Table", "FirstCondition_Input_5_Categorical_LF");
		String FirstCondition_Input_6_Categorical_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_LocalFilter_Table", "FirstCondition_Input_6_Categorical_LF");
		String FirstCondition_Input_7_Categorical_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_LocalFilter_Table", "FirstCondition_Input_7_Categorical_LF");
		String FirstCondition_Input_8_Categorical_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_LocalFilter_Table", "FirstCondition_Input_8_Categorical_LF");
		String FirstCondition_Categorical_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_LocalFilter_Table", "FirstCondition_Categorical_LF");
		String FirstCondition_Input_Categorical_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_LocalFilter_Table", "FirstCondition_Input_Categorical_LF");
		String FirstOperator_Input_Categorical_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_LocalFilter_Table", "FirstOperator_Input_Categorical_LF");
		String SecondOperator_Input_Categorical_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_LocalFilter_Table", "SecondOperator_Input_Categorical_LF");
		String SecondCondition_Categorical_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_LocalFilter_Table", "SecondCondition_Categorical_LF");
		String SecondCondition_Input_Categorical_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_LocalFilter_Table", "SecondCondition_Input_Categorical_LF");
		String ThirdCondition_Categorical_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_LocalFilter_Table", "ThirdCondition_Categorical_LF");
		String ThirdCondition_Input_Categorical_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_LocalFilter_Table", "ThirdCondition_Input_Categorical_LF");

		//Local filter inputs Date
		String SelectDateColumn_Smoke_LocalFilter=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Table", "SelectDateColumn_Smoke_LocalFilter");
		String RelativeFilter_1_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Table", "RelativeFilter_1_Date_LF");
		String RelativeFilter_2_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Table", "RelativeFilter_2_Date_LF");
		String RelativeFilter_3_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Table", "RelativeFilter_3_Date_LF");
		String RelativeFilter_4_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Table", "RelativeFilter_4_Date_LF");
		String RelativeFilter_5_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Table", "RelativeFilter_5_Date_LF");
		String RelativeFilter_6_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Table", "RelativeFilter_6_Date_LF");
		String RelativeFilter_7_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Table", "RelativeFilter_7_Date_LF");
		String RelativeFilter_8_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Table", "RelativeFilter_8_Date_LF");
		String RelativeFilter_9_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Table", "RelativeFilter_9_Date_LF");
		String RelativeFilter_10_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Table", "RelativeFilter_10_Date_LF");
		String RelativeFilter_11_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Table", "RelativeFilter_11_Date_LF");
		String RelativeFilter_12_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Table", "RelativeFilter_12_Date_LF");
		String RelativeFilter_13_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Table", "RelativeFilter_13_Date_LF");
		String RelativeFilter_14_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Table", "RelativeFilter_14_Date_LF");
		String RelativeFilter_11_Input_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Table", "RelativeFilter_11_Input_Date_LF");
		String RelativeFilter_12_Input_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Table", "RelativeFilter_12_Input_Date_LF");
		String RelativeFilter_13_Input_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Table", "RelativeFilter_13_Input_Date_LF");
		String RelativeFilter_14_Input_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Table", "RelativeFilter_14_Input_Date_LF");
		String Condition_1_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Table", "Condition_1_Date_LF");
		String Condition_2_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Table", "Condition_2_Date_LF");
		String Condition_3_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Table", "Condition_3_Date_LF");
		String Condition_4_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Table", "Condition_4_Date_LF");
		String Condition_5_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Table", "Condition_5_Date_LF");
		String Condition_6_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Table", "Condition_6_Date_LF");
		String Condition_7_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Table", "Condition_7_Date_LF");
		String Condition_8_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Table", "Condition_8_Date_LF");
		String Condition_9_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Table", "Condition_9_Date_LF");
		String Condition_1_Input_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Table", "Condition_1_Input_Date_LF");
		String Condition_2_Input_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Table", "Condition_2_Input_Date_LF");
		String Condition_3_Input_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Table", "Condition_3_Input_Date_LF");
		String Condition_4_Input_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Table", "Condition_4_Input_Date_LF");
		String Condition_5_Input_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Table", "Condition_5_Input_Date_LF");
		String Condition_6_Input_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Table", "Condition_6_Input_Date_LF");
		String Condition_7_Input_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Table", "Condition_7_Input_Date_LF");
		String Condition_8_Input_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Table", "Condition_8_Input_Date_LF");
		String Condition_9_InputA_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Table", "Condition_9_InputA_Date_LF");
		String Condition_9_InputB_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Table", "Condition_9_InputB_Date_LF");
		
		String FirstCondition_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Table", "FirstCondition_Date_LF");
		String SecondCondition_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Table", "SecondCondition_Date_LF");
		String ThirdCondition_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Table", "ThirdCondition_Date_LF");
		String FirstCondition_Date_Input_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Table", "FirstCondition_Date_Input_LF");
		String SecondCondition_Date_Input_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Table", "SecondCondition_Date_Input_LF");
		String ThirdCondition_Date_Input_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Table", "ThirdCondition_Date_Input_LF");
		String FirstOperator_Input_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Table", "FirstOperator_Input_Date_LF");
		String SecondOperator_Input_Date_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_LocalFilter_Table", "SecondOperator_Input_Date_LF");
		
		// Numerical Filter Inputs
		String SelectNumerical_Smoke_LocalFilter=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Table", "SelectNumericalColumn_Smoke_LocalFilter");
		String Condition_1_Num_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Table", "Condition_1_Num_LF");
		String Condition_2_Num_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Table", "Condition_2_Num_LF");
		String Condition_3_Num_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Table", "Condition_3_Num_LF");
		String Condition_4_Num_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Table", "Condition_4_Num_LF");
		String Condition_5_Num_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Table", "Condition_5_Num_LF");
		String Condition_6_Num_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Table", "Condition_6_Num_LF");
		String Condition_7_Num_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Table", "Condition_7_Num_LF");
		String Condition_8_Num_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Table", "Condition_8_Num_LF");
		String Condition_9_Num_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Table", "Condition_9_Num_LF");
		String Condition_1_Input_Num_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Table", "Condition_1_Input_Num_LF");
		String Condition_2_Input_Num_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Table", "Condition_2_Input_Num_LF");
		String Condition_3_Input_Num_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Table", "Condition_3_Input_Num_LF");
		String Condition_4_Input_Num_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Table", "Condition_4_Input_Num_LF");
		String Condition_5_Input_Num_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Table", "Condition_5_Input_Num_LF");
		String Condition_6_Input_Num_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Table", "Condition_6_Input_Num_LF");
		String Condition_7_Input_Num_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Table", "Condition_7_Input_Num_LF");
		String Condition_8_Input_Num_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Table", "Condition_8_Input_Num_LF");
		String Condition_9_InputA_Num_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Table", "Condition_9_InputA_Num_LF");
		String Condition_Between_InputB_Num_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Table", "Condition_Between_InputB_Num_LF");
		
		String FirstCondition_Num_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Table", "FirstCondition_Num_LF");
		String SecondCondition_Num_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Table", "SecondCondition_Num_LF");
		String ThirdCondition_num_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Table", "ThirdCondition_num_LF");
		String FirstCondition_Num_Input_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Table", "FirstCondition_Num_Input_LF");
		String SecondCondition_Num_Input_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Table", "SecondCondition_Num_Input_LF");
		String ThirdCondition_Num_Input_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Table", "ThirdCondition_Num_Input_LF");
		String FirstOperator_Input_Num_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Table", "FirstOperator_Input_Num_LF");
		String SecondOperator_Input_Num_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_LocalFilter_Table", "SecondOperator_Input_Num_LF");
     
		
//		//filter inputs Text
		String SelectText_LocalFilter=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_LocalFilter_Table", "SelectText_Smoke_LocalFilter");
		String ByValuesInput_Text_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_LocalFilter_Table", "ByValuesInput_Text_LF");
		String Condition_1_Text_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_LocalFilter_Table", "Condition_1_Text_LF");
		String Condition_2_Text_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_LocalFilter_Table", "Condition_2_Text_LF");
		String Condition_3_Text_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_LocalFilter_Table", "Condition_3_Text_LF");
		String Condition_4_Text_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_LocalFilter_Table", "Condition_4_Text_LF");
		String Condition_5_Text_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_LocalFilter_Table", "Condition_5_Text_LF");
		String Condition_6_Text_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_LocalFilter_Table", "Condition_6_Text_LF");
		String Condition_7_Text_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_LocalFilter_Table", "Condition_7_Text_LF");
		String Condition_8_Text_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_LocalFilter_Table", "Condition_8_Text_LF");
		String Condition_Input_1_Text_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_LocalFilter_Table", "Condition_Input_1_Text_LF");
		String Condition_Input_2_Text_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_LocalFilter_Table", "Condition_Input_2_Text_LF");
		String Condition_Input_3_Text_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_LocalFilter_Table", "Condition_Input_3_Text_LF");
		String Condition_Input_4_Text_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_LocalFilter_Table", "Condition_Input_4_Text_LF");
		String Condition_Input_5_Text_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_LocalFilter_Table", "Condition_Input_5_Text_LF");
		String Condition_Input_6_Text_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_LocalFilter_Table", "Condition_Input_6_Text_LF");
		String Condition_Input_7_Text_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_LocalFilter_Table", "Condition_Input_7_Text_LF");
		String Condition_Input_8_Text_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_LocalFilter_Table", "Condition_Input_8_Text_LF");
		String FirstCondition_Text_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_LocalFilter_Table", "FirstCondition_Text_LF");
		String FirstCondition_Input_Text_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_LocalFilter_Table", "FirstCondition_Input_Text_LF");
		String FirstOperator_Input_Text_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_LocalFilter_Table", "FirstOperator_Input_Text_LF");
		String SecondOperator_Input_Text_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_LocalFilter_Table", "SecondOperator_Input_Text_LF");
		String SecondCondition_Text_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_LocalFilter_Table", "SecondCondition_Text_LF");
		String SecondCondition_Input_Text_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_LocalFilter_Table", "SecondCondition_Input_Text_LF");
		String ThirdCondition_Text_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_LocalFilter_Table", "ThirdCondition_Text_LF");
		String ThirdCondition_Input_Text_LF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_LocalFilter_Table", "ThirdCondition_Input_Text_LF");
	
		//Global Filter Inputs Categorical
		String SelectCategorical_GlobalFilter=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_GlobalFilter_Table", "SelectCategoricalColumn_Smoke_GlobalFilter");
		String ByValuesInput_Categorical_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_GlobalFilter_Table", "ByValuesInput_Categorical_GF");
		String FirstCondition_1_Categorical_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_GlobalFilter_Table", "FirstCondition_1_Categorical_GF");
		String FirstCondition_2_Categorical_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_GlobalFilter_Table", "FirstCondition_2_Categorical_GF");
		String FirstCondition_3_Categorical_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_GlobalFilter_Table", "FirstCondition_3_Categorical_GF");
		String FirstCondition_4_Categorical_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_GlobalFilter_Table", "FirstCondition_4_Categorical_GF");
		String FirstCondition_5_Categorical_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_GlobalFilter_Table", "FirstCondition_5_Categorical_GF");
		String FirstCondition_6_Categorical_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_GlobalFilter_Table", "FirstCondition_6_Categorical_GF");
		String FirstCondition_7_Categorical_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_GlobalFilter_Table", "FirstCondition_7_Categorical_GF");
		String FirstCondition_8_Categorical_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_GlobalFilter_Table", "FirstCondition_8_Categorical_GF");
		String FirstCondition_Input_1_Categorical_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_GlobalFilter_Table", "FirstCondition_Input_1_Categorical_GF");
		String FirstCondition_Input_2_Categorical_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_GlobalFilter_Table", "FirstCondition_Input_2_Categorical_GF");
		String FirstCondition_Input_3_Categorical_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_GlobalFilter_Table", "FirstCondition_Input_3_Categorical_GF");
		String FirstCondition_Input_4_Categorical_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_GlobalFilter_Table", "FirstCondition_Input_4_Categorical_GF");
		String FirstCondition_Input_5_Categorical_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_GlobalFilter_Table", "FirstCondition_Input_5_Categorical_GF");
		String FirstCondition_Input_6_Categorical_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_GlobalFilter_Table", "FirstCondition_Input_6_Categorical_GF");
		String FirstCondition_Input_7_Categorical_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_GlobalFilter_Table", "FirstCondition_Input_7_Categorical_GF");
		String FirstCondition_Input_8_Categorical_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_GlobalFilter_Table", "FirstCondition_Input_8_Categorical_GF");
		String FirstCondition_Categorical_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_GlobalFilter_Table", "FirstCondition_Categorical_GF");
		String FirstCondition_Input_Categorical_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_GlobalFilter_Table", "FirstCondition_Input_Categorical_GF");
		String FirstOperator_Input_Categorical_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_GlobalFilter_Table", "FirstOperator_Input_Categorical_GF");
		String SecondOperator_Input_Categorical_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_GlobalFilter_Table", "SecondOperator_Input_Categorical_GF");
		String SecondCondition_Categorical_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_GlobalFilter_Table", "SecondCondition_Categorical_GF");
		String SecondCondition_Input_Categorical_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_GlobalFilter_Table", "SecondCondition_Input_Categorical_GF");
		String ThirdCondition_Categorical_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_GlobalFilter_Table", "ThirdCondition_Categorical_GF");
		String ThirdCondition_Input_Categorical_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_GlobalFilter_Table", "ThirdCondition_Input_Categorical_GF");

		
		//Global filter inputs Date
		String SelectDateColumn_Smoke_GlobalFilter=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Table", "SelectDateColumn_Smoke_GlobalFilter");
		String RelativeFilter_1_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Table", "RelativeFilter_1_Date_GF");
		String RelativeFilter_2_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Table", "RelativeFilter_2_Date_GF");
		String RelativeFilter_3_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Table", "RelativeFilter_3_Date_GF");
		String RelativeFilter_4_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Table", "RelativeFilter_4_Date_GF");
		String RelativeFilter_5_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Table", "RelativeFilter_5_Date_GF");
		String RelativeFilter_6_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Table", "RelativeFilter_6_Date_GF");
		String RelativeFilter_7_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Table", "RelativeFilter_7_Date_GF");
		String RelativeFilter_8_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Table", "RelativeFilter_8_Date_GF");
		String RelativeFilter_9_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Table", "RelativeFilter_9_Date_GF");
		String RelativeFilter_10_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Table", "RelativeFilter_10_Date_GF");
		String RelativeFilter_11_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Table", "RelativeFilter_11_Date_GF");
		String RelativeFilter_12_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Table", "RelativeFilter_12_Date_GF");
		String RelativeFilter_13_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Table", "RelativeFilter_13_Date_GF");
		String RelativeFilter_14_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Table", "RelativeFilter_14_Date_GF");
		String RelativeFilter_11_Input_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Table", "RelativeFilter_11_Input_Date_GF");
		String RelativeFilter_12_Input_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Table", "RelativeFilter_12_Input_Date_GF");
		String RelativeFilter_13_Input_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Table", "RelativeFilter_13_Input_Date_GF");
		String RelativeFilter_14_Input_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Table", "RelativeFilter_14_Input_Date_GF");
		String Condition_1_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Table", "Condition_1_Date_GF");
		String Condition_2_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Table", "Condition_2_Date_GF");
		String Condition_3_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Table", "Condition_3_Date_GF");
		String Condition_4_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Table", "Condition_4_Date_GF");
		String Condition_5_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Table", "Condition_5_Date_GF");
		String Condition_6_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Table", "Condition_6_Date_GF");
		String Condition_7_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Table", "Condition_7_Date_GF");
		String Condition_8_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Table", "Condition_8_Date_GF");
		String Condition_9_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Table", "Condition_9_Date_GF");
		String Condition_1_Input_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Table", "Condition_1_Input_Date_GF");
		String Condition_2_Input_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Table", "Condition_2_Input_Date_GF");
		String Condition_3_Input_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Table", "Condition_3_Input_Date_GF");
		String Condition_4_Input_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Table", "Condition_4_Input_Date_GF");
		String Condition_5_Input_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Table", "Condition_5_Input_Date_GF");
		String Condition_6_Input_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Table", "Condition_6_Input_Date_GF");
		String Condition_7_Input_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Table", "Condition_7_Input_Date_GF");
		String Condition_8_Input_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Table", "Condition_8_Input_Date_GF");
		String Condition_9_InputA_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Table", "Condition_9_InputA_Date_GF");
		String Condition_9_InputB_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Table", "Condition_9_InputB_Date_GF");
		
		String FirstCondition_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Table", "FirstCondition_Date_GF");
		String SecondCondition_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Table", "SecondCondition_Date_GF");
		String ThirdCondition_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Table", "ThirdCondition_Date_GF");
		String FirstCondition_Date_Input_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Table", "FirstCondition_Date_Input_GF");
		String SecondCondition_Date_Input_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Table", "SecondCondition_Date_Input_GF");
		String ThirdCondition_Date_Input_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Table", "ThirdCondition_Date_Input_GF");
		String FirstOperator_Input_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Table", "FirstOperator_Input_Date_GF");
		String SecondOperator_Input_Date_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_GlobalFilter_Table", "SecondOperator_Input_Date_GF");
				
		// Global Numerical Filter Inputs
		String SelectNumerical_Smoke_GlobalFilter=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Table", "SelectNumericalColumn_Smoke_GlobalFilter");
		String Condition_1_Num_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Table", "Condition_1_Num_GF");
		String Condition_2_Num_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Table", "Condition_2_Num_GF");
		String Condition_3_Num_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Table", "Condition_3_Num_GF");
		String Condition_4_Num_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Table", "Condition_4_Num_GF");
		String Condition_5_Num_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Table", "Condition_5_Num_GF");
		String Condition_6_Num_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Table", "Condition_6_Num_GF");
		String Condition_7_Num_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Table", "Condition_7_Num_GF");
		String Condition_8_Num_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Table", "Condition_8_Num_GF");
		String Condition_9_Num_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Table", "Condition_9_Num_GF");
		String Condition_1_Input_Num_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Table", "Condition_1_Input_Num_GF");
		String Condition_2_Input_Num_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Table", "Condition_2_Input_Num_GF");
		String Condition_3_Input_Num_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Table", "Condition_3_Input_Num_GF");
		String Condition_4_Input_Num_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Table", "Condition_4_Input_Num_GF");
		String Condition_5_Input_Num_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Table", "Condition_5_Input_Num_GF");
		String Condition_6_Input_Num_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Table", "Condition_6_Input_Num_GF");
		String Condition_7_Input_Num_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Table", "Condition_7_Input_Num_GF");
		String Condition_8_Input_Num_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Table", "Condition_8_Input_Num_GF");
		String Condition_9_InputA_Num_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Table", "Condition_9_InputA_Num_GF");
		String Condition_Between_InputB_Num_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Table", "Condition_Between_InputB_Num_GF");
		
		String FirstCondition_Num_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Table", "FirstCondition_Num_GF");
		String SecondCondition_Num_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Table", "SecondCondition_Num_GF");
		String ThirdCondition_num_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Table", "ThirdCondition_num_GF");
		String FirstCondition_Num_Input_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Table", "FirstCondition_Num_Input_GF");
		String SecondCondition_Num_Input_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Table", "SecondCondition_Num_Input_GF");
		String ThirdCondition_Num_Input_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Table", "ThirdCondition_Num_Input_GF");
		String FirstOperator_Input_Num_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Table", "FirstOperator_Input_Num_GF");
		String SecondOperator_Input_Num_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_GlobalFilter_Table", "SecondOperator_Input_Num_GF");
		    
		//Global Filter inputs Text
		String SelectText_GlobalFilter=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_GlobalFilter_Table", "SelectText_Smoke_GlobalFilter");
		String ByValuesInput_Text_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_GlobalFilter_Table", "ByValuesInput_Text_GF");
		String Condition_1_Text_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_GlobalFilter_Table", "Condition_1_Text_GF");
		String Condition_2_Text_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_GlobalFilter_Table", "Condition_2_Text_GF");
		String Condition_3_Text_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_GlobalFilter_Table", "Condition_3_Text_GF");
		String Condition_4_Text_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_GlobalFilter_Table", "Condition_4_Text_GF");
		String Condition_5_Text_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_GlobalFilter_Table", "Condition_5_Text_GF");
		String Condition_6_Text_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_GlobalFilter_Table", "Condition_6_Text_GF");
		String Condition_7_Text_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_GlobalFilter_Table", "Condition_7_Text_GF");
		String Condition_8_Text_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_GlobalFilter_Table", "Condition_8_Text_GF");
		String Condition_Input_1_Text_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_GlobalFilter_Table", "Condition_Input_1_Text_GF");
		String Condition_Input_2_Text_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_GlobalFilter_Table", "Condition_Input_2_Text_GF");
		String Condition_Input_3_Text_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_GlobalFilter_Table", "Condition_Input_3_Text_GF");
		String Condition_Input_4_Text_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_GlobalFilter_Table", "Condition_Input_4_Text_GF");
		String Condition_Input_5_Text_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_GlobalFilter_Table", "Condition_Input_5_Text_GF");
		String Condition_Input_6_Text_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_GlobalFilter_Table", "Condition_Input_6_Text_GF");
		String Condition_Input_7_Text_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_GlobalFilter_Table", "Condition_Input_7_Text_GF");
		String Condition_Input_8_Text_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_GlobalFilter_Table", "Condition_Input_8_Text_GF");
		String FirstCondition_Text_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_GlobalFilter_Table", "FirstCondition_Text_GF");
		String FirstCondition_Input_Text_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_GlobalFilter_Table", "FirstCondition_Input_Text_GF");
		String FirstOperator_Input_Text_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_GlobalFilter_Table", "FirstOperator_Input_Text_GF");
		String SecondOperator_Input_Text_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_GlobalFilter_Table", "SecondOperator_Input_Text_GF");
		String SecondCondition_Text_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_GlobalFilter_Table", "SecondCondition_Text_GF");
		String SecondCondition_Input_Text_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_GlobalFilter_Table", "SecondCondition_Input_Text_GF");
		String ThirdCondition_Text_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_GlobalFilter_Table", "ThirdCondition_Text_GF");
		String ThirdCondition_Input_Text_GF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_GlobalFilter_Table", "ThirdCondition_Input_Text_GF");

		//Iteration inputs
		Actions action=new Actions(driver);
		mouseOverToElement(driver, ADDTabPlus);
  	    mouseOverAndClick(driver, ADDTabPlus);
  	    wait(driver,"1");
  	    sendKeys(driver,newlyAddedTab,"TableTestTab1");
  	    click(driver,DashProPage);
  	    elementnotvisible1(driver, RPE_Loading);
		waitForElement(driver,ADD_widget_rightTop);
	    click(driver,ADD_widget_rightTop);
	    elementnotvisible(driver,Loading);
	    elementnotvisible(driver,RPE_Loading);
	   	if(isDisplayed(driver,WidgetPanel) && isDisplayed(driver,Sparkline_widget)) {
		    pass(driver,"Widgets are displayed after click the Add widget button ");
	   	}else {       
	   		fail(driver,"Widgets are not displayed after click the Add widget button ");
	   	}
	   
		waitForElement(driver,WidgetPanel);
		waitForElement(driver,Sparkline_widget);
		waitForElement(driver, Table_widget);
		
		click(driver,Table_widget);
	    elementnotvisible(driver, Loading);
	    elementnotvisible(driver,RPE_Loading);
	    String widgetValue=getText1(driver,WidgetValue);
	 	if(widgetValue.equals("Table")) {
			pass(driver,"Table displayed as the selected Widget ");
	 	}else {
	 		fail(driver,"Table not displayed as the selected Widget ");
	 	}
		    
	 	verifyElementDisplayed(driver, TableSect);
	    String TableExpandAct=getAttribute1(driver, TableColumnExpand, "class");
       	if(TableExpandAct.contains("up")) {
       		pass(driver,"Table Colum  Expanded after clicking Table Widget" );
    	}else {
    	    fail(driver,"Table Colum not Expanded after clicking Table Widget");
    	}
	       	
   		verifyElementIsPresent1(driver, SelectAllToogle);
       	if(isToggleEnable(driver, SelectAllToogle)) {
       		fail(driver,"Select All toggle enabled by default");
       	}else {
       		pass(driver,"Select All toggle disabled by default");
       	}
       	   
       	verifyElementDisplayed(driver, AvailableColumnText);
       	if(isDisplayed(driver,AvailableColum)) {
       		pass(driver,"Available Column is displayed ");
       	}else {
       		fail(driver,"Available Column is not displayed ");
       	}
       	
       	scrollUsingElement(driver, ApplyButton);
       	wait(driver,"1");
       	click(driver,ApplyButton);
       	if(isDisplayed(driver,TableError)) {
       		pass(driver,"'Kindly select column' error displayed");
       	}else {
       		fail(driver,"'Kindly select column' error not displayed");
       	}
       	
       	click(driver,SelectAllToggleInput);
       	wait(driver,"1");
       	if(isToggleEnable(driver, SelectAllToogle)) {
       		pass(driver,"Select All toggle enabled after clicking it");
       	}else {
       		fail(driver,"Select All toggle not enabled after clicking on it");
       	}
       	//need to commnad after dry run
//       	click(driver,ApplyButton);
//       	elementnotvisible1(driver, RPE_Loading);
//    	       	
        //TC_Smoketest_161 
    	List<WebElement> AvailableColumns=getWebElements(driver, AvailableColumnValues);
        List<WebElement> SelectedColumns=getWebElements(driver, SelectedAvailableColumnValue);
        
    	int AvailableColumnsSize=AvailableColumns.size();
    	int SelectedSize=SelectedColumns.size();
    	boolean AllColumnGreen=true;
    	for(WebElement column:AvailableColumns) {
		String rgbFormatColumn = column.getCssValue("background-color");
		String ColumnBackColor = rgbToHex(rgbFormatColumn);
		if(!ColumnBackColor.equalsIgnoreCase(TableColumnSelectColor)) {
			AllColumnGreen=false;
		}
		
    	}
    	
    	if(AllColumnGreen==false) {
    		fail(driver,"Some columnValues not changed to green color After enabling the Select All toggle ");
    	}else {
    		pass(driver,"All columnValues changed to green color After enabling the Select All toggle ");
    	}
    	
    	scrollUsingElement(driver, ApplyButton);
    	wait(driver,"1");
    	click(driver, ApplyButton);
    	elementnotvisible1(driver, RPE_Loading);
    	if(isDisplayed(driver, TableHeadingFirst)) {
    		pass(driver,"Table is Displayed After clicking apply button");
    	}else {
    		fail(driver,"Table is not Displayed After clicking apply button");
    	}
    	
    	List<WebElement> DisplayedHeadColumns=getWebElements(driver, TableHeadings);
    	int DisplayedHeadColumnssSize=DisplayedHeadColumns.size();
    	if(DisplayedHeadColumnssSize==SelectedSize) {
    		pass(driver,"All Selcted Available column size equals to resulting table heading column size");
    	}else {
    		fail(driver,"All Selected Available column size not equals to resulting table heading column size");
    	}
    	
        // TC_Smoketest_161	
       	
    	// TC_Smoketest_162	
       	click(driver,SelectAllToggleInput);
       	wait(driver,"1");
       	// Need to Command for dry run Execution (9)
       	if(isToggleEnable(driver, SelectAllToogle)) {
       		fail(driver,"Select All toggle not disabled while disabling it");
       	}else {
       		pass(driver,"Select All toggle disabled while disabling it");
       	}
       // TC_Smoketest_162	
       
       // TC_Smoketest_164
       	for(WebElement column:AvailableColumns) {
       		column.click();
       	}
       	wait(driver,"1");
       	if(isToggleEnable(driver, SelectAllToogle)) {
       		pass(driver,"Select All toggle automatically Enabled while manually selecting all coloumn");
       	}else {
       		fail(driver,"Select All toggle not automatically Enabled while manually selecting all coloumn");
       	}
       	
      // TC_Smoketest_164
       	
      // TC_Smoketest_165
       	wait(driver,"1");
       	click(driver,FirstAvailableColumn1);
       	wait(driver,"1");
       	if(isToggleEnable(driver, SelectAllToogle)) {
       		fail(driver,"Select All toggle not automatically disabled when deselect one column");
       	}else {
       		pass(driver,"Select All toggle automatically disabled when deselect one column");
       	}
       	scrollUsingElement(driver, ApplyButton);
       	wait(driver,"1");
       	click(driver, ApplyButton);
       	elementnotvisible1(driver, RPE_Loading);
       	waitForElement1(driver, TableHeadingFirst);
        List<WebElement> SelectedColumns1=getWebElements(driver, SelectedAvailableColumnValue);
       	int SelectedColumns1Size=SelectedColumns1.size();
       	List<WebElement> DisplayedHeadColumns1=getWebElements(driver, TableHeadings);
    	int DisplayedHeadColumns1Size=DisplayedHeadColumns1.size();
    	if(DisplayedHeadColumns1Size==SelectedColumns1Size) {
    		pass(driver,"Selcted Available column size equals to resulting table heading column size");
    	}else {
    		fail(driver,"Selected Available column size not equals to resulting table heading column size");
    	}
       	
     // TC_Smoketest_165
       	
       	click(driver,SelectAllToggleInput);
       	click(driver,SelectAllToggleInput);
       	
     // TC_Smoketest_166
       	verifyElementIsPresent1(driver, SearchInColumn);
     // TC_Smoketest_166 ColumnSearchName
       	
     // TC_Smoketest_167 & 168
       	click(driver,SearchInColumn);
       	sendKeys(driver,SearchInColumn,SearchColumInput_Somke_168);
       	String FirstValue=getText1(driver,FirstAvailableColumn);
       	if(FirstValue.equalsIgnoreCase(SearchColumInput_Somke_168)) {
       		pass(driver,"Searched results are displayed correctly on the available columns");
       	}else {
       		fail(driver,"Searched results are not displayed correctly on the available columns");
       	}
     // TC_Smoketest_167 & 168
       	
     // TC_Smoketest_169
       	clear1(driver, SearchInColumn);
       	sendKeys(driver,SearchInColumn,"grggjdh");
       	if(isDisplayed(driver, FirstAvailableColumn)) {
       		fail(driver,"Columns are displayed when searching invalid column name");
       	}else {
       		pass(driver,"Columns are not displayed when searching invalid column name");
       	}
     // TC_Smoketest_169
      
     // TC_Smoketest_170
       	clear1(driver, SearchInColumn);
       	sendKeys(driver,SearchInColumn,"_");
       	if(isDisplayed(driver, FirstAvailableColumn)) {
       		pass(driver,"Columns are displayed when searching Column name with Special character");
       	}else {
       		fail(driver,"Columns are not displayed when searching Column name with Special character");
       	}
     // TC_Smoketest_170
       	
     // TC_Smoketest_171
       	clear1(driver,SearchInColumn);
       	sendKeys(driver, SearchInColumn, MultipleSearchInput_Smoke_171);
       	wait(driver,"1");
       	List<WebElement> AvailableColumns1=getWebElements(driver, AvailableColumnValues);
       	boolean multiple=true;
       	for(WebElement AvailableColumn1:AvailableColumns1) {
       		if(AvailableColumn1.isDisplayed()) {
	       		if(!((AvailableColumn1.getText()).contains(MultipleSearchInput_Smoke_171)) && !((AvailableColumn1.getText()).contains(MultipleSearchInput_Smoke_171.toLowerCase())) ) {
	       			multiple=false;
	       		}
       		}
       	}
       	if(multiple==false) {
       		fail(driver,"Application not filtered correctly..");
       	}else {
       		pass(driver,"Application filtered correctly..");
       	}
     // TC_Smoketest_171
       	
     // TC_Smoketest_172
       	clear1(driver,SearchInColumn);
       	sendKeys(driver, SearchInColumn, SearchUpperLowerInput_Smoke_172);
       	wait(driver,"1");
       	if(isDisplayed(driver, FirstAvailableColumn)) {
       		pass(driver,"Columns are displayed when searching Column name with a mix of upper and lower case letters : "+SearchUpperLowerInput_Smoke_172);
       	}else {
       		fail(driver,"Columns are not displayed when searching Column name with a mix of upper and lower case letters : "+SearchUpperLowerInput_Smoke_172);
       	}
     // TC_Smoketest_172
       	
     // TC_Smoketest_173
       	String SearchUpperLowerInput_Smoke_173=SearchUpperLowerInput_Smoke_172.toLowerCase();
       	clear1(driver,SearchInColumn);
       	sendKeys(driver, SearchInColumn, SearchUpperLowerInput_Smoke_173);
       	wait(driver,"1");
       	if(isDisplayed(driver, FirstAvailableColumn)) {
       		pass(driver,"Columns are displayed when searching Column name with only lower case letters : "+SearchUpperLowerInput_Smoke_173);
       	}else {
       		fail(driver,"Columns are not displayed when searching Column name with only lower case letters : "+SearchUpperLowerInput_Smoke_173);
       	}
       	
     // TC_Smoketest_173
       	
     // TC_Smoketest_174
        String SearchUpperLowerInput_Smoke_174=SearchUpperLowerInput_Smoke_172.toUpperCase();
       	clear1(driver,SearchInColumn);
       	sendKeys(driver, SearchInColumn, SearchUpperLowerInput_Smoke_174);
       	wait(driver,"1");
       	if(isDisplayed(driver, FirstAvailableColumn)) {
       		pass(driver,"Columns are displayed when searching Column name with only Upper case letters : "+SearchUpperLowerInput_Smoke_174);
       	}else {
       		fail(driver,"Columns are not displayed when searching Column name with only Upper case letters : "+SearchUpperLowerInput_Smoke_174);
       	}
     // TC_Smoketest_174
       	click(driver,SelectAllToggleInput);
       	scrollUsingElement(driver, ApplyButton);
    	click(driver,ApplyButton);
    	elementnotvisible1(driver, RPE_Loading);
    	
	    String Tables_ChartTitle= getCellValue("TestExecution","Testcase_Selection","Tables_ChartTitle",Flag);
       	if(Tables_ChartTitle.equals("Yes")) {
       		
       	// TC_Smoketest_175
       		verifyElementIsPresent1(driver, chartTitle);
	       	click(driver,chartTitle);
	        wait(driver,"1");
			 String CharttitleExpand=getAttribute1(driver,ChartTitleExpand,"class");
	    	 if(CharttitleExpand.contains("up")) {
				pass(driver,"Chart title is expanded When Click on it");
	    	 }else {
	    	    fail(driver,"Chart title is not expanded When Click on it");
	    	 }
	    	 
	    	String chartTitleText_Act=getText1(driver,chartTitle);
	 		textValidation(driver,ChartTitle_text_Exp,chartTitleText_Act,chartTitle);
	      	
	 		if(isDisplayed(driver,BackgroundInput)) {
	 			pass(driver,"Background Input is present in the Chart Title Section");
	 		}else {
	 			fail(driver,"Background Input is not present in the Chart Title Section");
	 		}
	 		
	 		if(verifyElementIsPresent1(driver,BackgroundText)) {
	     		String BackgroundText_Act=getText1(driver,BackgroundText);
	    		textValidation(driver,BackgroundText_Exp,BackgroundText_Act,BackgroundText);
	     	}
	 		
	 		if(isDisplayed(driver,FontColorInput)) {
	 			pass(driver,"Font Color Input is present in the Chart Title Section");
	 		}else {
	 			fail(driver,"Font Color Input is not present in the Chart Title Section");
	 		}
	 		if(verifyElementIsPresent1(driver,FontColorText)) {
	     		String FontColorText_Act=getText1(driver,FontColorText);
	    		textValidation(driver,FontColorText_Exp,FontColorText_Act,FontColorText);
	     	}
	 		
	 		if(isDisplayed(driver,ChartFontFamilyDropdown)) {
	 			pass(driver,"Font Family Input is present in the Chart Title Section");
	 		}else {
	 			fail(driver,"Font Family  Input is not present in the Chart Title Section");
	 		}
	 		if(verifyElementIsPresent1(driver,ChartFontFamilytext)) {
	     		String ChartFontFamilytext_Act=getText1(driver,ChartFontFamilytext);
	    		textValidation(driver,FontFamily_text_Exp,ChartFontFamilytext_Act,ChartFontFamilytext);
	     	}
	        
	 		
	 		if(isDisplayed(driver,ChartFontSizedDropdown)) {
	 			pass(driver,"Font Size Input is present in the Chart Title Section");
	 		}else {
	 			fail(driver,"Font Size Input is not present in the Chart Title Section");
	 		}
	 		if(verifyElementIsPresent1(driver,ChartFontSizeText)) {
	     		String FontSizeText_Act=getText1(driver,ChartFontSizeText);
	    		textValidation(driver,FontSizeText_Exp,FontSizeText_Act,ChartFontSizeText);
	     	}
	    // TC_Smoketest_175
	 		
	    // TC_Smoketest_176
	 		String chartTitleTextColor_Act=getTextColor(driver,chartTitle);
	      	if(ChartTitleColorExp.equalsIgnoreCase(chartTitleTextColor_Act)) {
	      		pass(driver,"The Chart title highlighted in blue colour after expand it ");
	      	}else {
	      		pass(driver,"The Chart title is not highlighted in blue colour after expand it");
	      	}
	     // TC_Smoketest_176
	      	
	     // TC_Smoketest_177
	      	String BackgroundInputColorText=getTextJavascript(driver,BackgroundInput);
	 		System.out.println("BackgroundInputText : "+BackgroundInputColorText);
	 		if(BackgroundInputColorText.equals(DefaultBackgroundColor_Exp)) {
				pass(driver,"The predefined default color ("+BackgroundInputColorText+") is displayed in Background color input without any user interaction");
	 		}else {
	     	    fail(driver,"The predefined default color in not displayed in the Background Color Input");
	 		} 
	 	// TC_Smoketest_177
	 		
	 	// TC_Smoketest_178
	 		click(driver,BackgroundInput);
	        if(isDisplayed(driver,ColorPickerOpen)) {
				pass(driver,"The color pickers opened promptly after clicking background input");
	        }else {
	        	fail(driver,"The color pickers not opened promptly after clicking background input");
	        }
	     // TC_Smoketest_178
	        
	     // TC_Smoketest_179
	        click(driver,BackgroundText);
	        wait(driver,"1");
	        if(isDisplayed2(driver,ColorPickerOpen)) {
				fail(driver,"The color picker not closes immediately when the user clicks outside its boundaries");
	        }else {
	        	pass(driver,"The color picker closes immediately when the user clicks outside its boundaries");
	        }
	      // TC_Smoketest_179
	        
	      // TC_Smoketest_180       
	        WebElement background=getWebElement(driver,BackgroundInput);
	        action.click(background).build().perform();
	        action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
	        sendKeys(driver,BackgroundInput,BackColorInputTable_Smoke_180);
	        click3(driver,BackgroundText);
	        String SelectedBackgroundColor=getTextBackgroundColor(driver, BackgroundInputPointer);
	        if(SelectedBackgroundColor.equalsIgnoreCase(BackColorInputTable_Smoke_180)) {
				pass(driver,"Manually Entered Color Value is updated in the Background Color picker..");
	        }else {
	        	fail(driver,"Manually Entered Color Value is not updated in the Background Color picker..");
	        }
	        
	        String AppliedChartTitleInputColor=getTextBackgroundColor(driver, ChartTitleInput);
	        if(AppliedChartTitleInputColor.equalsIgnoreCase(BackColorInputTable_Smoke_180)) {
				pass(driver,"Manually Entered Color Value is updated in the Preview Chart Title Background Input");
	        }else {
	        	fail(driver,"Manually Entered Color Value is not updated in the Preview Chart Title Background Input");
	        }
	        
	     // TC_Smoketest_180 
	     // TC_Smoketest_181
	        action.click(background).build().perform();
	        action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
	        action.sendKeys(Keys.BACK_SPACE).build().perform();

	        click3(driver,BackgroundText);
	        String ResetBackgroundColor=getTextBackgroundColor(driver, BackgroundInputPointer);
	        if(ResetBackgroundColor.equals(DefaultBackgroundColor_Exp)) {
				pass(driver,"After revert the color selections, the Background color picker reset to the default color");
	        }else {
	        	fail(driver,"After revert the color selections, the Background color picker not reset to the default color");
	    	}
	        
	        String ResetChartTitleInputColor=getTextBackgroundColor(driver, ChartTitleInput);
	        if(ResetChartTitleInputColor.equals(DefaultBackgroundColor_Exp)) {
				pass(driver,"After revert all color selections, in the preview Chart Title Input reset to the default color");
	        }else {
				fail(driver,"After revert all color selections, in the preview Chart Title Input not reset to the default color");
	        }
	     // TC_Smoketest_181
	        
	     // TC_Smoketest_182
	        click(driver,BackgroundInput);
	        waitForElement(driver,ColorPickerOpen);
	        verifyElementIsPresent1(driver,ThemeColor);
	        verifyElementIsPresent1(driver,History);
	        mouseOverToElement(driver,Color2);
	        wait(driver,"1");
	        String mouseOverHistoryColor=getText1(driver,mouseOverColorHistory);
	        doubleClick(driver,mouseOverColorHistory);
	        wait(driver,"1");
	        action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
	        doubleClick(driver,BackgroundInput);
	        wait(driver,"1");
	        action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
	        wait(driver,"1");
	        click3(driver,BackgroundText);
	        String AfterPasteBackgroundColor=getTextBackgroundColor(driver, BackgroundInputPointer);
	        if(AfterPasteBackgroundColor.equalsIgnoreCase(mouseOverHistoryColor)) {
	        	pass(driver,"Copy Paste Color value is working fine in Background Input");
	        }else {
	        	fail(driver,"Copy Paste Color value is not working fine in Background Input");
	        }
	        
	     // TC_Smoketest_182
	        
	     // TC_Smoketest_183
	        String defaultChartTitletextColor=getTextColor(driver,ChartTitleInput);
	        System.out.println("defaultChartTitletextColor : -> "+defaultChartTitletextColor);
	        if(defaultChartTitletextColor.equalsIgnoreCase(DefaultFontColor_Exp)) {
	            pass(driver,"The predefined default color ("+DefaultFontColor_Exp+") is displayed in Font color input without any user interaction");
	        }else {
	            pass(driver,"The predefined default color is not displayed in Font color input without any user interaction");
	        }
	     // TC_Smoketest_183
	        
	     // TC_Smoketest_184
	        click(driver,FontColorInput);
	        if(isDisplayed(driver,ColorPickerOpen)) {
				pass(driver,"The color pickers opened promptly after clicking Font Color input");
	        }else {
				fail(driver,"The color pickers not opened promptly after clicking Font Color input");
	        }
	     // TC_Smoketest_184
	        
	     // TC_Smoketest_185
	        click(driver,FontColorText);
	        wait(driver,"1");
	        if(isDisplayed2(driver,ColorPickerOpen)) {
				fail(driver,"The color picker not closes immediately when the user clicks outside its boundaries");
	        }else {
	        	pass(driver,"The color picker closes immediately when the user clicks outside its boundaries");
	        }
	     // TC_Smoketest_185
	        
	     // TC_Smoketest_186 
	        sendKeys(driver,ChartTitleInput,ChartTitleName_Smoke);
	        click3(driver,FontColorInput);
	        action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
	        sendKeys(driver,FontColorInput,FontColorInputTable_Smoke_186);
	        click3(driver,FontColorText);
	        String SelectedFontColor=getTextBackgroundColor(driver, FontColorInputPointer);
	        if(SelectedFontColor.equalsIgnoreCase(FontColorInputTable_Smoke_186)) {
				pass(driver,"Manually Entered Color Value is updated in the Font Color picker..");
	        }else {
	        	fail(driver,"Manually Entered Color Value is not updated in the Font Color picker..");
	        }
	        
	        String AppliedChartTitleTextColor=getTextColor(driver, ChartTitleInput);
	        if(AppliedChartTitleTextColor.equalsIgnoreCase(FontColorInputTable_Smoke_186)) {
				pass(driver,"Manually Entered Color Value is updated in the Preview Chart Title Text");
	        }else {
	        	fail(driver,"Manually Entered Color Value is not updated in the Preview Chart Title Text");
	        }
	     // TC_Smoketest_186
	        
	     // TC_Smoketest_187
	        click(driver,FontColorInput);
	        action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
	        action.sendKeys(Keys.BACK_SPACE).build().perform();

	        click(driver,FontColorText);
	        String ResetFontColorColor=getTextBackgroundColor(driver, FontColorInputPointer);
	        if(ResetFontColorColor.equalsIgnoreCase(DefaultFontColor_Exp)) {
				pass(driver,"After revert the color selections, the Font color picker reset to the default color");
	        }else {
	        	fail(driver,"After revert the color selections, the Font color picker not reset to the default color");
	    	}
	        
	        String ResetChartTitleTextColor=getTextColor(driver, ChartTitleInput);
	        if(ResetChartTitleTextColor.equalsIgnoreCase(DefaultFontColor_Exp)) {
				pass(driver,"After revert all color selections, in the preview Chart Title Text reset to the default color");
	        }else {
				fail(driver,"After revert all color selections, in the preview Chart Title Text not reset to the default color");
	        }
	     // TC_Smoketest_187
	        
	     // TC_Smoketest_188
	        click(driver,FontColorInput);
	        waitForElement(driver,ColorPickerOpen);
	        verifyElementIsPresent1(driver,ThemeColor);
	        verifyElementIsPresent1(driver,History);
	        mouseOverToElement(driver,Color1);
	        wait(driver,"1");
	        String mouseOverHistoryColor1=getText1(driver,mouseOverColorHistory);
	        doubleClick(driver,mouseOverColorHistory);
	        wait(driver,"1");
	        action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
	        doubleClick(driver,FontColorInput);
	        wait(driver,"1");
	        action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
	        wait(driver,"1");
	        click(driver,FontColorText);
	        String AfterPasteFontColorInput=getTextBackgroundColor(driver, FontColorInputPointer);
	        if(AfterPasteFontColorInput.equalsIgnoreCase(mouseOverHistoryColor1)) {
	        	pass(driver,"Copy Paste Color value is working fine in Font Color Input");
	        }else {
	        	fail(driver,"Copy Paste Color value is not working fine in Font Color Input");
	        }
	        
	     // TC_Smoketest_188
	 		
	     // TC_Smoketest_189
	        String DefaultFontFamily_ChartTitle=getText1(driver,ChartFontFamilyDropdown);
	        if(DefaultFontFamily_Smoke_189.equals(DefaultFontFamily_ChartTitle)) {
	        	pass(driver,"By default 'Verdana' is displayed in Font Family Input");
	        }else {
	        	fail(driver,"By default 'Verdana' is not displayed in Font Family Input");
	        }
	     // TC_Smoketest_189
	        
	     // TC_Smoketest_190 && TC_Smoketest_192
	        click(driver,ChartFontFamilyDropdown);
	        if(isDisplayed(driver,ChartFontFamilyDropdownExpand)) {
	        	pass(driver,"Font Family dropdown is expanded with values when click on it");
	        }else {
	        	fail(driver,"Font Family dropdown is not expanded with values when click on it");
	        }
	     // TC_Smoketest_190
	        
	     // TC_Smoketest_191
	        click(driver,ChartFontFamilytext);
	        wait(driver,"1");
	        if(isDisplayed(driver,ChartFontFamilyDropdownExpand)) {
	        	fail(driver,"Font Family dropdown is not closed when click outside it");
	        }else {
	        	pass(driver,"Font Family dropdown is closed when click outside it");
	        }
	     // TC_Smoketest_191
	        
	     // TC_Smoketest_192
	     // TC_Smoketest_192
	       
	     // TC_Smoketest_193 
	        click(driver,ChartFontFamilyDropdown);
	        waitForElement1(driver, ChartFontFamilyDropdownExpand);
	        if(isDisplayed(driver,SearchInput_FontFamily)) {
	        	pass(driver,"Search Input is present in the Font Family dropdown");
	        	click(driver,SearchInput_FontFamily);
	        	sendKeys(driver,SearchInput_FontFamily,FontFamilyInput_Smoke_193);
	        	wait(driver,"1");
	        	String firstValue=getText1(driver,FirstDisplayedList);
	        	if(firstValue.equals(FontFamilyInput_Smoke_193)) {
	        		pass(driver,"Searched Font Family Correctly filtered in the Font Family dropdown");
	        	}else {
	        		fail(driver,"Searched Font Family not Correctly filtered in the Font Family dropdown");
	        	}
	        	
	        	
	        }else {
	        	fail(driver,"Search Input is not present in the Font Family dropdown");
	        }
	        
	     // TC_Smoketest_193 
	        
	     // TC_Smoketest_194 & TC_Smoketest_195
	        String selectingValue=getText1(driver,FirstDisplayedList);
	        click(driver,FirstDisplayedList);
	        
	        String SelectedFontFamilyValue=getText1(driver,ChartFontFamilyDropdown);
	        if(SelectedFontFamilyValue.equals(selectingValue)) {
	        	pass(driver,"Selected Value is updated in the Font Family Input");
	        }else {
	        	fail(driver,"Selected Value is not updated in the Font Family Input");
	        }
	        
	     // TC_Smoketest_194 & TC_Smoketest_195
	        
	     // TC_Smoketest_196
	        String defaultFontSizeValue=getTextJavascript(driver,ChartFontSizedDropdown);
	        if(DefaultFontSize_Smoke_196.equals(defaultFontSizeValue)) {
	        	pass(driver,"By Default, 20 is displayed in the Font Size Input");
	        }else {
	        	fail(driver,"By Default, 20 is not displayed in the Font Size Input");
	        }
	     // TC_Smoketest_196
	        
	     // TC_Smoketest_197
	        if(isToggleAccessible(driver, ChartFontSizedDropdown)) {
	        	pass(driver,"Chart Font Size Dropdown is accessible");
	        }else {
	        	fail(driver,"Chart Font Size Dropdown is not accessible");
	        }
	     // TC_Smoketest_197
	        
	     // TC_Smoketest_202
	        selectOptionValue(driver,ChartFontSizedDropdown,ChangeFontSize_Smoke_202);
	        wait(driver,"1");
	        String selectedFontSize=getTextJavascript(driver, ChartFontSizedDropdown);
	        if(selectedFontSize.equals(ChangeFontSize_Smoke_202)) {
	        	pass(driver,"Selected Font Size '"+ChangeFontSize_Smoke_202+"' updated in the Font Size Input");
	        }else {
	        	fail(driver,"Selected Font Size '"+ChangeFontSize_Smoke_202+"' not updated in the Font Size Input, Act : "+selectedFontSize);
	        }
	     // TC_Smoketest_202
	       
	 	// TC_Smoketest_203
	        String AppliedChartTitleFontSize_Actual=getFontSize(driver,ChartTitleInput);
	        if(AppliedChartTitleFontSize_Actual.equals(ChangeFontSize_Smoke_202)) {
	        	pass(driver,"Selected Font Size '"+ChangeFontSize_Smoke_202+"' is updated in the Chart Title text");
			}else {
				fail(driver,"Selected Font Size '"+ChangeFontSize_Smoke_202+"' is not updated in the Chart Title text , Act : "+AppliedChartTitleFontSize_Actual);
			}
	     // TC_Smoketest_203
	     
       	}  
       // ************** Tables Chart Title Completed *****************
       	
        String Tables_TableFormat= getCellValue("TestExecution","Testcase_Selection","Tables_TableFormat",Flag);//TestNgXml.getdatafromExecution1("Sheet2",2,3).get("Tables_TableFormat");
       	if(Tables_TableFormat.equals("Yes")) {
       		
       		// TC_Smoketest_204
	        if(verifyElementDisplayed(driver, TableFormat_Sec)) {
		       	click(driver,TableFormat_Sec);
		        wait(driver,"1");
		        String TableFormatSecExpand=getAttribute1(driver,TableFormatExpand,"class");
		        if(!TableFormatSecExpand.contains("up")) {
		        	fail(driver,"Table Format Section is not expanded When Click on it");
		        }else {
		        	pass(driver,"Table Format Section is expanded When Click on it");
		        	
		        	// TC_Smoketest_205
			    	 String TableFormateSec_Act=getTextColor(driver, TableFormat_Sec);
			    	 System.out.println("TableFormateSec_Act : "+TableFormateSec_Act);
					 if(TableFormatExpandColor.equalsIgnoreCase(TableFormateSec_Act)) {
						 pass(driver,"TableFormat is highlighted in blue color after expand it");
					 }else {
						 fail(driver,"TableFormat is not highlighted in blue color after expand it");
					 }
			        // TC_Smoketest_205 
		        	
		        	verifyElementDisplayed(driver, Table_Theme_Input);
		        	verifyElementDisplayed(driver, TableThemeText);
					 
		        	verifyElementDisplayed(driver, ODDEven_toggleTableFormat1);
		        	verifyElementDisplayed(driver, OddEven_text_TableFormat);
					 
		        	verifyElementDisplayed(driver, FontFamily_Input_TableFormat);
		        	verifyElementDisplayed(driver, FontFamilyText_TableFormat);
					 
		        	verifyElementDisplayed(driver, FontSizeInput_TableFormat);
		        	verifyElementDisplayed(driver, FontSizeText_TableFormat);
					 
		        	verifyElementDisplayed(driver, HeaderColorInput_TableFormat);
		        	verifyElementDisplayed(driver, HeaderColorText_TableFormat);
				 
		        	verifyElementDisplayed(driver, WrapHeaded_toggle_TableFormat);
		        	verifyElementDisplayed(driver, WrapHeaders_Text_TableFormat);
					 
		        	verifyElementDisplayed(driver, BodyFontSize_Input_TableFormat);
		        	verifyElementDisplayed(driver, BodyFontSize_text_TableFormat);
					 
		        	verifyElementDisplayed(driver, BorderInput_TableFormat);
		        	verifyElementDisplayed(driver, Border_text_TableFormat);

		        	verifyElementDisplayed(driver, NegativeHighlight_toggle);
		        	verifyElementDisplayed(driver, NegativeHighlight_text);

		        	verifyElementDisplayed(driver, AlignmentLeft_TableFormat);
		        	verifyElementDisplayed(driver, Alignmentcenter_TableFormat);
		        	verifyElementDisplayed(driver, AlignmentRight_TableFormat);
		        	verifyElementDisplayed(driver, AlignmentText_TableFormat);

		        	verifyElementDisplayed(driver, RowTotal_toggle_TableFormat);
		        	verifyElementDisplayed(driver, RowTotal_text_TableFormat);

		        	verifyElementDisplayed(driver, ColumnTotal_toggle_TableFormat);
		        	verifyElementDisplayed(driver, ColumnTotal_text_TableFormat);

		        	verifyElementDisplayed(driver, PinRowTotal_toggle_TableFormat);
		        	verifyElementDisplayed(driver, PinRowTotal_text_TableFormat);

		        	verifyElementDisplayed(driver, PinColumnTotal_toggle_TableFormat);
		        	verifyElementDisplayed(driver, PinColumnTotal_text_TableFormat);
					 
		        	verifyElementDisplayed(driver, HighLightRowTotal_Input);
		        	verifyElementDisplayed(driver, HighLightRowTotal_Text);
					 
		        	verifyElementDisplayed(driver, HighLightColumnTotal_Input);
		        	verifyElementDisplayed(driver, HighLightColumnTotal_Text);
					 
		        	verifyElementDisplayed(driver, SeperatorInput_TableFormat);
		        	verifyElementDisplayed(driver, SeperatorText_TableFormat);
		        	// TC_Smoketest_204
		        	
		        	// TC_Smoketest_207
					 if(!isToggleAccessible(driver,Table_Theme_Input)) {
						 fail(driver,"Table theme input is not Accessible");
					 }else {
						 pass(driver,"Table theme input is Accessible");
						// TC_Smoketest_206
						 String TableThemeAct="";
						 List<WebElement> ThemeResultValues=getWebElements(driver, Table_Theme_Results);
						 for(WebElement ThemeResultValue:ThemeResultValues) {
							 if(ThemeResultValue.isSelected()) {
								 
								 String SelectedClass=ThemeResultValue.getAttribute("value");
								 System.out.println("SelectedClassValue "+SelectedClass);
								 TableThemeAct=SelectedClass;
							 }
						 }
						 
						 System.out.println("TableThemeAct : "+TableThemeAct);
						 if(TableThemeAct.equals("")) {
							 pass(driver,"By default, Table theme value is selected as 'Default'");
						 }else {
							 fail(driver,"By default, Table theme value is not selected as 'Default'");
						 }
					// TC_Smoketest_206 
					// TC_Smoketest_211
						 //click(driver,Table_Theme_Input);
						 selectByText(driver,Table_Theme_Input,SelectTableTheme_Smoke_211);
						 wait(driver,"1");
						 String AfterSelectThemeValue="";
						 ThemeResultValues=getWebElements(driver, Table_Theme_Results);
						
						 for(WebElement ThemeResultValue:ThemeResultValues) {
							 if(ThemeResultValue.isSelected()) {
								 String SelectedClass=ThemeResultValue.getAttribute("value");
								 System.out.println("SelectedClassValue "+SelectedClass);
								 AfterSelectThemeValue=SelectedClass;
							 }
						 }
						 
						 try {
							 SelectTableTheme_Smoke_211=SelectTableTheme_Smoke_211.replace(" ", "");
						 }catch(Exception e) {
							 
						 }
						 
						 SelectTableTheme_Smoke_211=SelectTableTheme_Smoke_211.toLowerCase();
						 if(AfterSelectThemeValue.contains(SelectTableTheme_Smoke_211.toLowerCase())) {
							 pass(driver,"Selected Value '"+SelectTableTheme_Smoke_211+"' is updated in the Table Theme Input");
						 }else {
							 fail(driver,"Selected Value '"+SelectTableTheme_Smoke_211+"' is not updated in the Table Theme Input");
						 }
						 
						 scrollUsingElement(driver, ApplyButton);
						 wait(driver,"1");
						 click(driver, ApplyButton); //click Apply change
						 elementnotvisible1(driver, RPE_Loading);
						 waitForElement(driver,Table_firstRow);
						 
						 String tableAppliedTheme=getAttribute1(driver, TableChart, "class");
						 if(tableAppliedTheme.contains(SelectTableTheme_Smoke_211)) {
							 pass(driver,"Selected theme value applied in the Chart");
						 }else {
							 fail(driver,"Selected theme value not applied in the Chart");
						 }
					// TC_Smoketest_211 
						 
					 }
				// TC_Smoketest_207 
		        	
						// TC_Smoketest_213 
					 if(isToggleEnable(driver,OddEven_toggle_TableFormat)) {
						 pass(driver,"By default, 'Odd/Even Colors' input toggle is displayed as ON");
						 scrollUsingElement(driver, ApplyButton);
						 wait(driver,"1");
						 click(driver, ApplyButton); //click Apply change
						 elementnotvisible1(driver, RPE_Loading);
						 waitForElement(driver,Table_firstRow);
						 String firstRowBackgroundColor=getTextBackgroundColor(driver, Table_firstRow);
						 //System.out.println("firstRowBackgroundColor : "+ firstRowBackgroundColor);
						 String secondRowBackgroundColor=getTextBackgroundColor(driver, Table_SecondRow);
						 //System.out.println("secondRowBackgroundColor : "+ secondRowBackgroundColor);
						 if(firstRowBackgroundColor.equalsIgnoreCase(secondRowBackgroundColor)) {
							 fail(driver,"Odd/Even Colors is not applied in the Table When the toggle is in 'ON' Condition");
						 }else {
							 pass(driver,"Odd/Even Colors is applied in the Table When the toggle is in 'ON' Condition");
						 }
						 
					 }else {
						 fail(driver,"By default, 'Odd/Even Colors' input toggle is displayed as ON");
					 }
				// TC_Smoketest_213 
					 
					if(IsElementEnabled(driver, OddEven_toggle_TableFormat)) { 
						// TC_Smoketest_214
						 click(driver,ODDEven_toggleTableFormat1);
						 wait(driver,"1");
						 if(isToggleEnable(driver,OddEven_toggle_TableFormat)) {
							 fail(driver,"'Odd/Even Colors' input toggle is not changed to 'OFF' when click on it");
						 }else {
							 pass(driver,"'Odd/Even Colors' input toggle is changed to 'OFF' when click on it");
							 scrollUsingElement(driver, ApplyButton);
							 wait(driver,"1");
							 click(driver, ApplyButton);
							 elementnotvisible1(driver, RPE_Loading);
							 String firstRowBackgroundColor=getTextBackgroundColor(driver, Table_firstRow);
							// System.out.println("firstRowBackgroundColor : "+ firstRowBackgroundColor);
							 String secondRowBackgroundColor=getTextBackgroundColor(driver, Table_SecondRow);
							// System.out.println("secondRowBackgroundColor : "+ secondRowBackgroundColor);
							 if(firstRowBackgroundColor.equalsIgnoreCase(secondRowBackgroundColor)) {
								 pass(driver,"Odd/Even Colors is not applied in the Table When the toggle is in 'OFF' Condition");
							 }else {
								 fail(driver,"Odd/Even Colors is applied in the Table When the toggle is in 'OFF' Condition");
							 }
						 }
						 
						 click(driver,ODDEven_toggleTableFormat1);
						 wait(driver,"1");
						 if(isToggleEnable(driver,OddEven_toggle_TableFormat)) {
							 pass(driver,"'Odd/Even Colors' input toggle is changed to 'ON' when click on it");
						 }else {
							 fail(driver,"'Odd/Even Colors' input toggle is not changed to 'ON' when click on it");
						 }
					// TC_Smoketest_214 
					}else {
						fail(driver,"Odd/Even input toggle is not Accessible");
					}
					 
					// TC_Smoketest_215
					 String FontFamilyAct_TableFormat=getText1(driver,FontFamily_Input_TableFormat);
					 System.out.println("FontFamilyAct_TableFormat : "+FontFamilyAct_TableFormat);
					 if(FontFamilyAct_TableFormat.equals(DefaultFontFamily_TableFormat)) {
						 pass(driver,"By default, '"+DefaultFontFamily_TableFormat+"' is selected in the Font Family input");
					 }else {
						 fail(driver,"By default, '"+DefaultFontFamily_TableFormat+"' is not selected in the Font Family input");
					 }
				// TC_Smoketest_215
					 
				// TC_Smoketest_216
					 if(!isToggleAccessible(driver,FontFamily_Input_TableFormat)) {
						 fail(driver,"Font Family Input is not Accessible");
					 }else {
						 pass(driver,"Font Family Input is Accessible");
						// TC_Smoketest_217 to TC_Smoketest_221
							click(driver,FontFamily_Input_TableFormat);
							if(isDisplayed(driver,FontFamilyExpand_TableFormat)) {
								pass(driver,"FontFamily dropdown is expanded with results after click on it");
							}else {
								fail(driver,"FontFamily dropdown is not expanded with results after click on it");
							}
							click(driver,FontFamilyText_TableFormat);
							wait(driver,"1");
							if(isDisplayed2(driver, FontFamilyExpand_TableFormat)) {
								fail(driver,"FontFamily dropdown is not Closed when click outside of it");
							}else {
								pass(driver,"FontFamily dropdown is Closed when click outside of it");
							}
							
							click(driver,FontFamily_Input_TableFormat);
							waitForElement(driver,FontFamilyExpand_TableFormat);
							if(isDisplayed(driver,SearchInput_FontFamilyDropdown)) {
								pass(driver,"Search Input is present in the Fontfamily dropdown");
								click(driver,SearchInput_FontFamilyDropdown);
								sendKeys(driver,SearchInput_FontFamilyDropdown,SearchFontFamily_Smoke_220);
								wait(driver,"1");
								String FirstFontFamilyResult=getText1(driver,FontFamilyResult1);
								if(FirstFontFamilyResult.equals(SearchFontFamily_Smoke_220)) {
									pass(driver,"Seach functions works properly in the font family results");
								}else {
									fail(driver,"Seach functions not working properly in the font family results");
								}
								
							}else {
								fail(driver,"Search Input is not present in the Fontfamily dropdown");
							}
							
							String FirstFontFamilyResult=getText1(driver,FontFamilyResult1);
							click(driver,FontFamilyResult1);
							wait(driver,"1");
							if(isDisplayed2(driver,FontFamilyExpand_TableFormat)) {
								fail(driver,"Font Family dropdown is not closed after selecting value");
							}else {
								pass(driver,"Font Family dropdown is closed after selecting value");
							}
								
							String FontFamilyResutValue=getText1(driver,FontFamily_Input_TableFormat);
							if(FontFamilyResutValue.equals(FirstFontFamilyResult)) {
								pass(driver,"Selected Font Family Value is updadted in the FontFamily Input");
							}else {
								fail(driver,"Selected Font Family Value is not updated in the FontFamily Input");
							}
							
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
							
						// TC_Smoketest_217 to TC_Smoketest_221
					 }
					 // TC_Smoketest_216 
					
					//TC_Smoketest_222
					 String defaultFontSizeHeader=getTextJavascript(driver, FontSizeInput_TableFormat);
					 System.out.println("defaultFontSizeHeader : "+defaultFontSizeHeader);
					 if(DefaultFontSize_TableFormat.equals(defaultFontSizeHeader)) {
						 pass(driver,"Predefined fontsize value '"+DefaultFontSize_TableFormat+"' is updated by default in the Font Size input");
					 }else {
						 fail(driver,"Predefined fontsize value '"+DefaultFontSize_TableFormat+"' is not updated by default in the Font Size input");
					 }
					//TC_Smoketest_222
				   //TC_Smoketest_223
					 if(!isToggleAccessible(driver,FontSizeInput_TableFormat)) {
						 fail(driver,"Header Font Size input is not Accessible");
					 }else {
						 pass(driver,"Header Font Size input is Accessible");
						 
						// TC_Smoketest_224
						click(driver,FontSizeInput_TableFormat);
						List<WebElement> fonSizeResults=getWebElements(driver, FontSize__Results);
						int fonSizeResultsCount=fonSizeResults.size();
						if(fonSizeResultsCount==54) {
							pass(driver,"All the Font Size Values is present ");
						}else {
							fail(driver,"Some Font Size Values is not present ");
						}
						// TC_Smoketest_224
							
						// TC_Smoketest_225 & TC_Smoketest_226
						//click(driver,FontSizeText_TableFormat);
						selectByText(driver,FontSizeInput_TableFormat,SelectFontSize_Smoke_225);
						wait(driver,"1");
						String selectedFontSizeResult=getTextJavascript(driver, FontSizeInput_TableFormat);
						System.out.println("selectedFontSizeResult : "+selectedFontSizeResult);
						if(selectedFontSizeResult.equals(SelectFontSize_Smoke_225)) {
							pass(driver,"Selected Font size value updated in the Header FontSize input");
						}else {
							fail(driver,"Selected Font size value is not updated in the Header FontSize input");
						}
						
						scrollUsingElement(driver, ApplyButton);
						wait(driver,"1");
						click(driver, ApplyButton);
						elementnotvisible1(driver, RPE_Loading);
						waitForElement(driver,TableChart);
						String AppliedFontSize_TableHeader=getFontSize(driver, TableHeaderRow);
						if(AppliedFontSize_TableHeader.equals(SelectFontSize_Smoke_225)) {
							pass(driver,"Selected Font Size is updated in the Header rows in the resulting Table");
						}else {
							fail(driver,"Selected Font Size is not updated in the Header rows in the resulting Table");
						}
						// TC_Smoketest_225 & TC_Smoketest_226
						 
					 }
					//	TC_Smoketest_223
					 
					// TC_Smoketest_227
					String defaultHeaderColorAct=getTextJavascript(driver,HeaderColorInput_TableFormat);
					System.out.println("defaultHeaderColorAct : "+defaultHeaderColorAct);
					if(DefaultHeaderColor_TableFormat.equalsIgnoreCase(defaultHeaderColorAct)) {
						pass(driver,"By default '"+DefaultHeaderColor_TableFormat+"' color is selected in the Header Color Input");
					}else {
						fail(driver,"By default '"+DefaultHeaderColor_TableFormat+"' color is not selected in the Header Color Input");
					}
					// TC_Smoketest_227
					
				// TC_Smoketest_228
					if(!isToggleAccessible(driver,HeaderColorInput_TableFormat)) {
						fail(driver,"Header Color input is not Accessible");
					}else {
						pass(driver,"Header Color input is Accessible");
						//TC_Smoketest_229 to TC_Smoketest_231
						click(driver,HeaderColorInput_TableFormat);
						if(isDisplayed(driver,ColorPickerOpen)) {
							pass(driver,"Color picker results opened after click on the Header Color Input");
							mouseOverToElement(driver, Color1);
							mouseOverToElement(driver, mouseOverColorHistory);
							mouseOverToElement(driver, Color1);
							String MouseHoveredColor=getText1(driver,mouseOverColorHistory);
							click(driver,Color1);
							wait(driver,"1");
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
							fail(driver,"Color picker results not opened after click on the Header Color Input");
						}
						
						click(driver,HeaderColorInput_TableFormat);
						action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
						sendKeys(driver,HeaderColorInput_TableFormat,ChangeHeaderColor_Smoke_231);
						wait(driver,"1");
						click3(driver,HeaderColorText_TableFormat);
						String SelectedHeaderColorValue=getTextBackgroundColor(driver, HeaderColorInput_Pointer);
						if(SelectedHeaderColorValue.equalsIgnoreCase(ChangeHeaderColor_Smoke_231)) {
							pass(driver,"Manually Entered Color Value is updated in the Header Color input..");
						}else {
							fail(driver,"Manually Entered Color Value is not updated in the Header Color input..");
						}
				       
						scrollUsingElement(driver, ApplyButton);
						wait(driver,"1");
						click(driver, ApplyButton);
						elementnotvisible1(driver, RPE_Loading);
						String Applied_Table_HeaderColor=getTextColor(driver, TableHeadingCell);
						if(Applied_Table_HeaderColor.equalsIgnoreCase(ChangeHeaderColor_Smoke_231)) {
							pass(driver,"Manually Entered Color Value is updated in the Table Header values");
						}else {
							fail(driver,"Manually Entered Color Value is not updated in the Table Header values");
						}
					// TC_Smoketest_229 to TC_Smoketest_231
						
						// TC_Smoketest_232
						mouseOverToElement(driver, TableHeadingCell);
						String beforeSortingOrder=getAttribute1(driver, TableHeadingCell, "aria-sort");
						click(driver,TableHeadingCell);
						wait(driver,"1");
						String AfterSortingOrder=getAttribute1(driver, TableHeadingCell, "aria-sort");
						if(beforeSortingOrder.equals(AfterSortingOrder)) {
							fail(driver,"Changing color affects the sorting functionality of the Header cell");
						}else {
							pass(driver,"Changing color not affects the sorting functionality of the Header cell");
						}
						
						ScrollBarValidation1(driver,ResultTableBody,"Resulted Table");
						HorizontalScrollFull(driver,HorizontalScroll2);
					// TC_Smoketest_232
					}
				// TC_Smoketest_228
					 
				 // TC_Smoketest_233
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
				   // TC_Smoketest_233
					
				// TC_Smoketest_234
					if(!isToggleAccessible(driver,WrapHeaders_Input_TableFormat)) {
						fail(driver,"Wrap Header input toggle is not Accessible");
					}else {
						pass(driver,"Wrap Header input toggle is Accessible");
						// TC_Smoketest_235
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
					// TC_Smoketest_235
						
					}
				// TC_Smoketest_234
					
				// TC_Smoketest_236
					String defaultBodyFontSize_Act=getTextJavascript(driver,BodyFontSize_Input_TableFormat);
					if(defaultBodyFontSize_Act.equals(DefaultBodyFontSize_TableFormat)) {
						pass(driver,"By defualt, '"+DefaultBodyFontSize_TableFormat+"' is displayed in the Body Font Size Input");
					}else {
						fail(driver,"By default,'"+DefaultBodyFontSize_TableFormat+"' is not displayed in the Body Font Size Input");
					}
				// TC_Smoketest_236 
				 // TC_Smoketest_237
					if(!isToggleAccessible(driver,BodyFontSize_Input_TableFormat)) {
						fail(driver,"Body Font Size Input is not Accessible");
					}else {
						pass(driver,"Body Font Size Input is Accessible");
						
						// TC_Smoketest_238
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
					     // TC_Smoketest_238
						
					     // TC_Smoketest_239 & TC_Smoketest_240
						//click3(driver,BodyFontSize_text_TableFormat);
						selectByText(driver,BodyFontSize_Input_TableFormat,ChangeBodyFontSize_Smoke_239);
						wait(driver,"1");
						String selectedBodyFontSize=getTextJavascript(driver,BodyFontSize_Input_TableFormat);
						if(selectedBodyFontSize.equals(ChangeBodyFontSize_Smoke_239)) {
							pass(driver,"Selcted Font Size value updated in the Body Font Size Input");
						}else {
							fail(driver,"Selcted Font Size value not updated in the Body Font Size Input");
						}
						
						scrollUsingElement(driver, ApplyButton);
						click(driver, ApplyButton);
						elementnotvisible1(driver, RPE_Loading);
						waitForElement(driver,ResultTableBody);
						String AppliedTable_BodyFontSize=getFontSize(driver, ResultTableBody);
						if(AppliedTable_BodyFontSize.equals(ChangeBodyFontSize_Smoke_239)) {
							pass(driver,"Selected Font Size '"+ChangeBodyFontSize_Smoke_239+"' value Applied in the Table Body values");
						}else {
							fail(driver,"Selected Font Size '"+ChangeBodyFontSize_Smoke_239+"' value not Applied in the Table Body values, Act result: "+AppliedTable_BodyFontSize);
						}
					// TC_Smoketest_239 & TC_Smoketest_240
					}
				// TC_Smoketest_237
					
				// TC_Smoketest_241
					String DefaultBorderType=defaultSelectedValue(driver,BorderInput_TableFormat);
					System.out.println("DefaultBorderType : "+DefaultBorderType+"  , Exp : "+DefaultBorderType_TableFormat);
					if(DefaultBorderType_TableFormat.equals(DefaultBorderType)) {
						pass(driver,"By default, 'Default' is displayed in the Border Input Field");
					}else {
						fail(driver,"By default, 'Default' is not displayed in the Border Input Field");
					}
				// TC_Smoketest_241
				// TC_Smoketest_242
					if(!isToggleAccessible(driver,BorderInput_TableFormat)) {
						fail(driver,"Border Input is not Accessible");
					}else {
						pass(driver,"Border Input is Accessible");
						 //TC_Smoketest_243
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
					// TC_Smoketest_243
						
					// TC_Smoketest_244 to TC_Smoketest_246
						click(driver,BorderInput_TableFormat);
						selectByText(driver,BorderInput_TableFormat,ChangeBorderValue_Smoke_244);
						wait(driver,"1");
						
						String selectedBorder=defaultSelectedValue(driver,BorderInput_TableFormat);
						System.out.println("selectedBorder : "+selectedBorder);
						if(selectedBorder.equals(ChangeBorderValue_Smoke_244)) {
							pass(driver,"Selcted Border value updated in the Border Input");
						}else {
							fail(driver,"Selcted Border value not updated in the Border Input");
						}
						
						scrollUsingElement(driver, ApplyButton);
						click(driver, ApplyButton);
						elementnotvisible1(driver, RPE_Loading);
						waitForElement(driver,ResultTableBody);
						String BorderValidationClass="table"+ChangeBorderValue_Smoke_244.toLowerCase()+"border";
						String AppliedBorder_Table=getAttribute1(driver, TableChart, "class");
						if(AppliedBorder_Table.contains(BorderValidationClass)) {
							pass(driver,"Selected Border '"+ChangeBorderValue_Smoke_244+"' value Applied in the Table Border");
						}else {
							fail(driver,"Selected Border '"+ChangeBorderValue_Smoke_244+"' value not Applied in the Table Border");
						}
					// TC_Smoketest_244 to TC_Smoketest_246
					}
				// TC_Smoketest_242
					
				// TC_Smoketest_247 to TC_Smoketest_254
					if(isToggleEnable(driver,NegativeHighlight_Input)) {
						fail(driver,"By default, Negaitve Highlight Toggle is not displayed in 'OFF' Condition");
					}else {
						pass(driver,"By default, Negaitve Highlight Toggle is displayed in 'OFF' Condition");
					}
					
					if(isToggleAccessible(driver,NegativeHighlight_Input)) {
						pass(driver,"Negative Highlight Toggle is Accessible");
						click(driver,NegativeHighlight_toggle);
						if(isToggleEnable(driver,NegativeHighlight_Input)) {
							pass(driver,"Negaitve Highlight Toggle is displayed in 'ON' Condition when click on it");
						}else {
							fail(driver,"Negaitve Highlight Toggle is not displayed in 'ON' Condition when click on it");
						}
						
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
								action.moveToElement(resultTableCell).build().perform();
								String rgbFormatNegativeCell = resultTableCell.getCssValue("background-color");
								String NegativeCellBackColorAct = rgbToHex(rgbFormatNegativeCell);
								if(NegativeCellBackColorAct.equalsIgnoreCase(NegativeCellColor_TableFormat)) {
									pass(driver,"Negative value cell is highlighted when the Negative highlight toggle is 'ON' condition");
								}else {
									fail(driver,"Negative value cell is not highlighted when the Negative highlight toggle is 'ON' condition");
								}
								negativecell=true;
								break;
							}
						}
						
						if(!negativecell==true) {
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
						
					}else {
						fail(driver,"Negative Highlight Toggle is not Accessible");
					}
				// TC_Smoketest_247 to TC_Smoketest_254
					
					// TC_Smoketest_255 to TC_Smoketest_260
					//default
					List<WebElement> AllCellElements=getWebElements(driver,TableCell);
					
					Pattern numericalPattern = Pattern.compile("^\\d+(\\.\\d+)?$");
			        Pattern datePattern = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");

			        boolean TextDefaultAlign=true;
			        boolean NumericalDefaultAlign=true;
			        String FailedStringCell="";
			        String FailedNumericCell="";
			        
			        for (WebElement cell : AllCellElements) {
			            String cellText = cell.getText();
			            String textAlign = cell.getCssValue("text-align");
			            String ColumnValue=cell.getAttribute("col-id");

			            if (datePattern.matcher(cellText).matches() || cellText.equals("") || cellText.isEmpty()) {
			                continue;
			            } else if (numericalPattern.matcher(cellText).matches()) {
			                if (!textAlign.contains("right")) {
			                	String FailedNum=ColumnValue+" : "+cellText;
			                    //System.out.println("Numerical cell not right-aligned: " + FailedNum);
			                    NumericalDefaultAlign=false;
			                    FailedNumericCell=FailedNumericCell+", "+FailedNum;
			                    
			                }
			            } else {
			                // Check if text cells are left-aligned
			                if (!textAlign.contains("left")) {
			                	String FailedText=ColumnValue+" : "+cellText;
			                   // System.out.println("Text cell not left-aligned: " + FailedText);
			                    TextDefaultAlign=false;
			                    FailedStringCell=FailedStringCell+", "+FailedText;
			                }
			            }
			        }
			        
			        if(TextDefaultAlign==false) {
			        	fail(driver,"Some Text cell values are not aligned left by default :"+FailedStringCell);
			        }else {
			        	pass(driver,"All the text cell values are aligned left by default ");
			        }
			        
			        if(NumericalDefaultAlign==false) {
			        	fail(driver,"Some Numerical cell values are not aligned right by default :"+FailedNumericCell);
			        }else {
			        	pass(driver,"All the Numerical cell values are aligned right by default ");
			        }
					
					if(IsElementEnabled(driver, AlignmentLeft_TableFormat)) {
						// Left
						click(driver,AlignmentLeft_TableFormat);
						scrollUsingElement(driver, ApplyButton);
						click(driver, ApplyButton);
						elementnotvisible1(driver, RPE_Loading);
						String SelectedAlignmentColorAct=getTextBackgroundColor(driver, AlignmentLeft_TableFormat);
						System.out.println("SelectedAlignmentColorAct : "+SelectedAlignmentColorAct);
						if(AlignmentSelectedColor_TableFormat.equalsIgnoreCase(SelectedAlignmentColorAct)) {
							pass(driver,"Left Alignment highlighted in grey color When click on it ");
						}else {
							fail(driver,"Left Alignment not highlighted in grey color When click on it ");
						}
						
						AllCellElements=getWebElements(driver,TableCell);
						boolean AllLeftAlignment=true;
						String FailedLeftAllign="";
					//	System.out.println("Cells left-aligned Validation  : ***********");
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
					//	System.out.println("Cells left-aligned  Validation end : ***********");
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
						
					}else {
						fail(driver,"Left Allignment is not accessible");
					}
					
					if(IsElementEnabled(driver, Alignmentcenter_TableFormat)) {
						// Center
						click(driver,Alignmentcenter_TableFormat);
						scrollUsingElement(driver, ApplyButton);
						click(driver, ApplyButton);
						elementnotvisible1(driver, RPE_Loading);
						String SelectedAlignmentColorAct=getTextBackgroundColor(driver, Alignmentcenter_TableFormat);
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
						
					}else {
						fail(driver,"Center Allignment is not accessible");
					}
					 
					if(IsElementEnabled(driver, AlignmentRight_TableFormat)) {
						
						//Right 
						click(driver,AlignmentRight_TableFormat);
						scrollUsingElement(driver, ApplyButton);
						click(driver, ApplyButton);
						elementnotvisible1(driver, RPE_Loading);
						String SelectedAlignmentColorAct=getTextBackgroundColor(driver, AlignmentRight_TableFormat);
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
						click(driver,AlignmentRight_TableFormat);
						wait(driver,"1");
						SelectedAlignmentColorAct=getTextBackgroundColor(driver, AlignmentRight_TableFormat);
						if(AlignmentSelectedColor_TableFormat.equalsIgnoreCase(SelectedAlignmentColorAct)) {
							fail(driver,"Right Alignment highlighted in grey color When deselect on it ");
						}else {
							pass(driver,"Right Alignment not highlighted in grey color When deselect on it ");
						}
					 // TC_Smoketest_255 to TC_Smoketest_260
					}else {
						fail(driver,"Right Allignment is not accessible");
					}
					
					VerticalScrollFull(driver,ResultTableBody);
					HorizontalScrollFull(driver,HorizontalScroll2);
					
					if(IsElementEnabled(driver, RowTotal_toggle_TableFormat)) {
						 //TC_Smoketest_261 to TC_Smoketest_265 && TC_Smoketest_270 to TC_Smoketest_272 and TC_Smoketest_276 to TC_Smoketest_284 Start..
						if(isToggleEnable(driver,RowTotal_Input_TableFormat)) {
							fail(driver,"Row Total Toggle is not displayed in 'OFF' Condition by default"); 
						}else {
							pass(driver,"Row Total Toggle is displayed in 'OFF' Condition by default");
						}
						
						click(driver,RowTotal_toggle_TableFormat);
						wait(driver,"1");
						if(isToggleEnable(driver,RowTotal_Input_TableFormat)) {
							pass(driver,"Row Total Toggle is displayed in 'ON' Condition When enabling it");
						}else {
							fail(driver,"Row Total Toggle is not displayed in 'ON' Condition When enabling it");
						}
						
						scrollUsingElement(driver, ApplyButton);
						wait(driver,"1");
						click(driver, ApplyButton);
						elementnotvisible1(driver, RPE_Loading);
						waitForElement(driver, TableCell);
						
						HorizontalScrollFull(driver,HorizontalScroll2);
						// grand Total Validations
						if(isDisplayed(driver,GrandTotalRow)) {
							pass(driver,"Grand Row total is displayed in the table when the toggle is 'ON' condition");
				 		}else {
							fail(driver,"Grand Row total is not displayed in the table when the toggle is 'ON' condition");
				 		}
						
						click(driver,RowTotal_toggle_TableFormat);
						if(isToggleEnable(driver,RowTotal_Input_TableFormat)) {
							fail(driver,"Row Total Toggle is not displayed in 'OFF' Condition When disabling it");
						}else {
							pass(driver,"Row Total Toggle is displayed in 'OFF' Condition When disabling it");
						}
						
						scrollUsingElement(driver, ApplyButton);
						wait(driver,"1");
						click(driver, ApplyButton);
						elementnotvisible1(driver, RPE_Loading);
						waitForElement(driver, TableCell);
						HorizontalScrollFull(driver,HorizontalScroll2);
						if(isDisplayed2(driver,GrandTotalRow)) {
							fail(driver,"Grand Row total is displayed in the table when the toggle is 'OFF' condition");
				 		}else {
							pass(driver,"Grand Row total is not displayed in the table when the toggle is 'OFF' condition");
				 		}
						
						
						click(driver,RowTotal_toggle_TableFormat);
						wait(driver,"1");
						if(isToggleAccessible(driver,PinRowTotal_Input_TableFormat)) {
							pass(driver,"Pin Row Total Toggle Accessible when Row Total toggle is 'ON' Condition");
							// extra validations
							if(isToggleEnable(driver,PinRowTotal_Input_TableFormat)) {
								fail(driver,"By deafult, Pin Row Total Toggle is not displayed in 'OFF' Condition");
							}else {
								pass(driver,"By deafult, Pin Row Total Toggle is displayed in 'OFF' Condition");
							}
							
							click(driver,PinRowTotal_toggle_TableFormat);
							wait(driver,"1");
							if(isToggleEnable(driver,PinRowTotal_Input_TableFormat)) {
								pass(driver,"Pin Row Total Toggle is displayed in 'ON' Condition when enabling it");
							}else {
								fail(driver,"Pin Row Total Toggle is not displayed in 'ON' Condition when enabling it");
							}
							scrollUsingElement(driver, ApplyButton);
							wait(driver,"1");
							click(driver, ApplyButton);
							elementnotvisible1(driver, RPE_Loading);
							waitForElement(driver,TableCell);
							if(isDisplayed2(driver,GrandTotalRow)) {
								pass(driver,"Grand Row total is displayed, Pin Row Total function working properly");
								// Pin grand total row sum validation
								
								// TC_Smoketest_276 to TC_Smoketest_284
								String DefaultRowTotalColorAct=getTextJavascript(driver, HighLightRowTotal_Input);
								System.out.println("DefaultRowTotalColorAct : "+DefaultRowTotalColorAct);
								if(DefaultGrandTotalColor_TableFormat.equalsIgnoreCase(DefaultRowTotalColorAct)) {
									pass(driver,"By default, '"+DefaultGrandTotalColor_TableFormat+"' color is displayed in the Row total color input");
								}else {
									fail(driver,"By default, '"+DefaultGrandTotalColor_TableFormat+"' color is not displayed in the Row total color input");
								}
								
								String TableAppliedGrantTotalColor=getTextBackgroundColor(driver, GrandTotalRows);
								if(DefaultGrandTotalColor_TableFormat.equalsIgnoreCase(TableAppliedGrantTotalColor)) {
									pass(driver,"By deafult, Grant Row total cells displayed with deafult selected color, Exp : "+DefaultGrandTotalColor_TableFormat+", Act : "+ TableAppliedGrantTotalColor);
								}else {
									fail(driver,"By deafult, Grant Row total cells not displayed with deafult selected color, Exp : "+DefaultGrandTotalColor_TableFormat+", Act : "+ TableAppliedGrantTotalColor);
								}
								
								click(driver,HighLightRowTotal_Input);
						        if(isDisplayed(driver,ColorPickerOpen)) {
									pass(driver,"The color pickers opened promptly after clicking HighLight RowTotal Input");
									mouseOverToElement(driver, Color1);
									String mouseOveredColorText=getText1(driver,mouseOverColorHistory);
									if(mouseOveredColorText!=null) {
										mouseOverToElement(driver, mouseOverColorHistory);
										wait(driver,"1");
										mouseOverToElement(driver, Color1);
										doubleClick(driver,mouseOverColorHistory);
										action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
								        doubleClick(driver,HighLightRowTotal_Input);
								        wait(driver,"1");
								        action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
								        wait(driver,"1");
										String AfterCopyPasteColor=getTextJavascript(driver, HighLightRowTotal_Input);
										System.out.println("AAfterCopyPasteColor : "+AfterCopyPasteColor);
										if(mouseOveredColorText.equals(AfterCopyPasteColor)) {
											pass(driver,"Copy paste color value works properly in Highlight Row Toata Input");
										}else {
											fail(driver,"Copy paste color value not working properly in Highlight Row Toata Input");
										}
										
									}else {
										fail(driver,"MouseOveredColor Value not displayed in the history");
									}
									
						        }else {
									fail(driver,"The color pickers not opened promptly after clicking HighLight RowTotal Input");
						        }
								
						        //click(driver,HighLightRowTotal_Text);
							    click(driver,HighLightRowTotal_Input);
							    waitForElement(driver,ColorPickerOpen);
							    mouseOverAndClick(driver,Color1);
								wait(driver,"1");
								if(isDisplayed2(driver,ColorPickerOpen)){
									fail(driver,"Colorpicker not closed promptly After selecting the color");
								}else {
									pass(driver,"Colorpicker closed promptly After selecting the color");
								}
								
								String SelectedColorInput=getTextJavascript(driver, HighLightRowTotal_Input);
								scrollUsingElement(driver, ApplyButton);
								wait(driver,"1");
								click(driver, ApplyButton);
								elementnotvisible1(driver, RPE_Loading);
								//waitForElement(driver, GrandTotalRows);
							    TableAppliedGrantTotalColor=getTextBackgroundColor(driver, GrandTotalRows);
								if(TableAppliedGrantTotalColor.equalsIgnoreCase(SelectedColorInput)) {
									pass(driver,"Selected Color is applied in the Grand total Row cells");
								}else {
									fail(driver,"Selected Color is not applied in the Grand total Row cells");
								}
						        
						       
						        click(driver,HighLightRowTotal_Input);
						        action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
						        sendKeys(driver,HighLightRowTotal_Input,ChangeRowTotalColor_Smoke_282);
						        scrollUsingElement(driver, ApplyButton);
						        wait(driver,"1");
						        click(driver, ApplyButton);
						        elementnotvisible1(driver, RPE_Loading);
						        //waitForElement(driver, GrandTotalRows);
							    TableAppliedGrantTotalColor=getTextBackgroundColor(driver, GrandTotalRows);
								if(TableAppliedGrantTotalColor.equalsIgnoreCase(ChangeRowTotalColor_Smoke_282)) {
									pass(driver,"Manually Entered Color is applied in the Grand total Row cells");
								}else {
									fail(driver,"Manually Entered Color is not applied in the Grand total Row cells");
								}
						        
								clear1(driver,HighLightRowTotal_Input);
								wait(driver,"1");
								String AfterRevertColor=getTextJavascript(driver, HighLightRowTotal_Input);
								if(AfterRevertColor.equalsIgnoreCase(DefaultGrandTotalColor_TableFormat)) {
									pass(driver,"Default color is displayed after revert the color value");
									scrollUsingElement(driver, ApplyButton);
									wait(driver,"1");
									click(driver, ApplyButton);
									elementnotvisible1(driver, RPE_Loading);
									//waitForElement(driver, GrandTotalRows);
								    TableAppliedGrantTotalColor=getTextBackgroundColor(driver, GrandTotalRows);
									if(TableAppliedGrantTotalColor.equalsIgnoreCase(DefaultGrandTotalColor_TableFormat)) {
										pass(driver,"Default color is applied in the Grand total Row cells after revert the color");
									}else {
										fail(driver,"Default color is not applied in the Grand total Row cells after revert the color");
									}
									
								}else {
									fail(driver,"Default color is not displayed after revert the color value");
								}
						        
					 		}else {
								fail(driver,"Grand Row total is not displayed,  Row Total function not working properly");
					 		}
							
							click(driver,RowTotal_toggle_TableFormat);
							wait(driver,"1");
							if(isToggleEnable(driver,PinRowTotal_Input_TableFormat)) {
								fail(driver,"Pin Row Total Toggle is not automatically changed to 'OFF' Condition When disabling the Row Total toggle");
							}else {
								pass(driver,"Pin Row Total Toggle is automatically changed to 'OFF' Condition When disabling the Row Total toggle");
								scrollUsingElement(driver, ApplyButton);
								wait(driver,"1");
								click(driver, ApplyButton);
								elementnotvisible1(driver, RPE_Loading);
								waitForElement(driver,TableCell);
								if(isDisplayed2(driver,GrandTotalRow)) {
									fail(driver,"Grand total row is displayed when the toggle is 'OFF' condition");
								}else {
									pass(driver,"Grand total row is not displayed when the toggle is 'OFF' condition");
								}
							}
						//	(TC_Smoketest_261 to TC_Smoketest_265) && (TC_Smoketest_270 to TC_Smoketest_272) and TC_Smoketest_276 to TC_Smoketest_284 End....
							
						}else {
							fail(driver,"Pin Row Total Toggle Accessible when Row Total toggle is 'ON' Condition");
						}
					}else {
						fail(driver,"Row Total toggle is not Accessible");
					}
					
					if(IsElementEnabled(driver, ColumnTotal_Input_TableFormat)) {
						//(TC_Smoketest_266 to TC_Smoketest_269) && (TC_Smoketest_273 to TC_Smoketest_275) and TC_Smoketest_285 to TC_Smoketest_290 Start....
						if(isToggleEnable(driver,ColumnTotal_Input_TableFormat)) {
							fail(driver,"Column Total Toggle is not displayed in 'OFF' Condition by default");
						}else {
							pass(driver,"Column Total Toggle is displayed in 'OFF' Condition by default");
						}
						
						click(driver,ColumnTotal_toggle_TableFormat);
						wait(driver,"1");
						if(isToggleEnable(driver,ColumnTotal_Input_TableFormat)) {
							pass(driver,"Column Total Toggle is displayed in 'ON' Condition When enabling it");
						}else {
							fail(driver,"Column Total Toggle is not displayed in 'ON' Condition When enabling it");
						}
						
						scrollUsingElement(driver, ApplyButton);
						click(driver, ApplyButton);
						elementnotvisible1(driver, RPE_Loading);
						waitForElement(driver, TableCell);
						VerticalScrollFull(driver,ResultTableBody);
						if(isDisplayed(driver,GrandTotalColumns)) {
							pass(driver,"Grand Column total is displayed in the table when the toggle is 'ON' condition");
						}else {
							fail(driver,"Grand Column total is not displayed in the table when the toggle is 'ON' condition");
						}
						
						click(driver,ColumnTotal_toggle_TableFormat);
						wait(driver,"1");
						if(isToggleEnable(driver,ColumnTotal_Input_TableFormat)) {
							fail(driver,"Column Total Toggle is not displayed in 'OFF' Condition When disabling it");
						}else {
							pass(driver,"Column Total Toggle is displayed in 'OFF' Condition When disabling it");
						}
						
						scrollUsingElement(driver, ApplyButton);
						wait(driver,"1");
						click(driver, ApplyButton);
						elementnotvisible1(driver, RPE_Loading);
						waitForElement(driver, TableCell);
						VerticalScrollFull(driver,ResultTableBody);
						if(isDisplayed2(driver,GrandTotalColumns)) {
							fail(driver,"Grand Column total is displayed in the table when the toggle is 'OFF' condition");
				 		}else {
							pass(driver,"Grand Column total is not displayed in the table when the toggle is 'OFF' condition");
				 		}
						
						click(driver,ColumnTotal_toggle_TableFormat);
						wait(driver,"1");
						if(isToggleAccessible(driver,PinColumnTotal_Input_TableFormat)) {
							pass(driver,"Pin Column Total Toggle Accessible when Column Total toggle is 'ON' Condition");
							if(isToggleEnable(driver,PinColumnTotal_Input_TableFormat)) {
								fail(driver,"By deafult, Pin Column Total Toggle is not displayed in 'OFF' Condition");
							}else {
								pass(driver,"By deafult, Pin Column Total Toggle is displayed in 'OFF' Condition");
							}
							
							click(driver,PinColumnTotal_toggle_TableFormat);
							wait(driver,"1");
							if(isToggleEnable(driver,PinColumnTotal_Input_TableFormat)) {
								pass(driver,"Pin Column Total Toggle is displayed in 'ON' Condition when enabling it");
							}else {
								fail(driver,"Pin Column Total Toggle is not displayed in 'ON' Condition when enabling it");
							}
							scrollUsingElement(driver, ApplyButton);
							click(driver, ApplyButton);
							elementnotvisible1(driver, RPE_Loading);
							waitForElement(driver,TableCell);
							if(isDisplayed(driver,GrandTotalColumns)) {
								pass(driver,"Grand Column total is displayed, Pin Column Total function Applied properly");
								// pin grand column total sum validation end
								String DefaultColumnTotalColorAct=getTextJavascript(driver, HighLightColumnTotal_Input);
								System.out.println("DefaultRowTotalColorAct : "+DefaultColumnTotalColorAct);
								if(DefaultGrandTotalColor_TableFormat.equalsIgnoreCase(DefaultColumnTotalColorAct)) {
									pass(driver,"By default, '"+DefaultGrandTotalColor_TableFormat+"' color is displayed in the Coloumn total color input");
								}else {
									fail(driver,"By default, '"+DefaultGrandTotalColor_TableFormat+"' color is not displayed in the Column total color input");
								}
								
								String TableColumndGrantTotalColor=getTextBackgroundColor(driver, GrandTotalColumns);
								if(DefaultColumnTotalColorAct.equalsIgnoreCase(TableColumndGrantTotalColor)) {
									pass(driver,"By deafult, Grant Column total cells displayed with deafult selected color, Exp : "+DefaultColumnTotalColorAct+", Act : "+ TableColumndGrantTotalColor);
								}else {
									fail(driver,"By deafult, Grant Column total cells not displayed with deafult selected color, Exp : "+DefaultColumnTotalColorAct+", Act : "+ TableColumndGrantTotalColor);
								}
								
								click(driver,HighLightColumnTotal_Input);
						        if(isDisplayed(driver,ColorPickerOpen)) {
									pass(driver,"The color pickers opened promptly after clicking HighLight Column Total Input");
									mouseOverToElement(driver, Color1);
									String mouseOveredColorText=getText1(driver,mouseOverColorHistory);
									if(mouseOveredColorText!=null) {
										mouseOverToElement(driver,mouseOverColorHistory);
										wait(driver,"1");
										mouseOverToElement(driver, Color1);
										doubleClick(driver,mouseOverColorHistory);
										action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
								        doubleClick(driver,HighLightColumnTotal_Input);
								        wait(driver,"1");
								        action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
								        wait(driver,"1");
										String AfterCopyPasteColor=getTextJavascript(driver, HighLightColumnTotal_Input);
										System.out.println("AfterCopyPasteColor : "+AfterCopyPasteColor);
										if(mouseOveredColorText.equalsIgnoreCase(AfterCopyPasteColor)) {
											pass(driver,"Copy paste color value works properly in Highlight Column Total Input");
										}else {
											fail(driver,"Copy paste color value not working properly in Highlight Column Total Input , Exp : "+mouseOveredColorText+", Act : "+AfterCopyPasteColor);
										}
										
									}else {
										fail(driver,"MouseOveredColor Value not displayed in the history");
									}
									
									mouseOverAndClick(driver, Color1);
									wait(driver,"1");
									if(isDisplayed2(driver,ColorPickerOpen)){
										fail(driver,"Colorpicker not closed promptly After selecting the color");
									}else {
										pass(driver,"Colorpicker closed promptly After selecting the color");
									}
									
									String SelectedColorInput=getTextJavascript(driver, HighLightColumnTotal_Input);
									scrollUsingElement(driver, ApplyButton);
									wait(driver,"1");
									click(driver, ApplyButton);
									elementnotvisible1(driver, RPE_Loading);
									waitForElement(driver, GrandTotalColumns);
									TableColumndGrantTotalColor=getTextBackgroundColor(driver, GrandTotalColumns);
									if(TableColumndGrantTotalColor.equalsIgnoreCase(SelectedColorInput)) {
										pass(driver,"Selected Color is applied in the Grand total Column cells");
									}else {
										fail(driver,"Selected Color is not applied in the Grand total Column cells");
									}
									
						        }else {
									fail(driver,"The color pickers not opened promptly after clicking HighLight Column Total Input");
						        }
								
								click(driver,HighLightColumnTotal_Input);
						        action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
						        sendKeys(driver,HighLightColumnTotal_Input,ChangeColumnTotalColor_Smoke_290);
						        scrollUsingElement(driver, ApplyButton);
						        wait(driver,"1");
						        click(driver, ApplyButton);
						        elementnotvisible1(driver, RPE_Loading);
						        waitForElement(driver, GrandTotalColumns);
						        TableColumndGrantTotalColor=getTextBackgroundColor(driver, GrandTotalColumns);
								if(TableColumndGrantTotalColor.equalsIgnoreCase(ChangeColumnTotalColor_Smoke_290)) {
									pass(driver,"Manually Entered Color is applied in the Grand total Column cells");
								}else {
									fail(driver,"Manually Entered Color is not applied in the Grand total Column cells");
								}
						        
								clear1(driver,HighLightColumnTotal_Input);
								wait(driver,"1");
								String AfterRevertColor=getTextJavascript(driver, HighLightColumnTotal_Input);
								if(AfterRevertColor.equalsIgnoreCase(DefaultGrandTotalColor_TableFormat)) {
									pass(driver,"Default color is displayed after revert the color value");
									scrollUsingElement(driver, ApplyButton);
									wait(driver,"1");
									click(driver, ApplyButton);
									elementnotvisible1(driver, RPE_Loading);
									waitForElement(driver, GrandTotalColumns);
									TableColumndGrantTotalColor=getTextBackgroundColor(driver, GrandTotalColumns);
									if(TableColumndGrantTotalColor.equalsIgnoreCase(DefaultGrandTotalColor_TableFormat)) {
										pass(driver,"Default color is applied in the Grand total Column cells after revert the color");
									}else {
										fail(driver,"Default color is not applied in the Grand total Column cells after revert the color");
									}
									
								}else {
									fail(driver,"Default color is not displayed after revert the color value");
								}
							}else {
								fail(driver,"Grand Column total is not displayed, Pin Column Total function not Applied properly");
							}
							
							click(driver,ColumnTotal_toggle_TableFormat);
							wait(driver,"1");
							if(isToggleEnable(driver,PinColumnTotal_Input_TableFormat)) {
								fail(driver,"Pin Column Total Toggle is not automatically changed to 'OFF' Condition When disabling the Column Total toggle");
							}else {
								pass(driver,"Pin Column Total Toggle is automatically changed to 'OFF' Condition When disabling the Column Total toggle");
								scrollUsingElement(driver, ApplyButton);
								wait(driver,"1");
								click(driver, ApplyButton);
								elementnotvisible1(driver, RPE_Loading);
								waitForElement(driver,TableCell);
								if(isDisplayed2(driver,GrandTotalColumns)) {
									fail(driver,"Grand total Column is displayed when the toggle is 'OFF' condition");
								}else {
									pass(driver,"Grand total Column is not displayed when the toggle is 'OFF' condition");
								}
							}
						    // (TC_Smoketest_266 to TC_Smoketest_269) && (TC_Smoketest_273 to TC_Smoketest_275) and TC_Smoketest_285 to TC_Smoketest_290 End....
						}else {
							fail(driver,"Pin Column Total Toggle Accessible when Column Total toggle is 'ON' Condition");
						}
						
					}else {
					    fail(driver,"Column Total toggle is not Accessible");
					}
					
					// TC_Smoketest_290 to TC_Smoketest_300 start....
					if(IsElementEnabled(driver, SeperatorInput_TableFormat)) {
						String defaultSeperatorSelect=defaultSelectedValue(driver, SeperatorInput_TableFormat);
						System.out.println("defaultSeperatorSelect : "+defaultSeperatorSelect);
						if(defaultSeperatorSelect.equals("")||defaultSeperatorSelect.equals(DefaultSeperator_TableFormat)) {
							pass(driver,"By default, 'Select' is displayed in the seperater input");
						}else {
							fail(driver,"By default, 'Select' is not displayed in the seperater input");
						}
						
					    click(driver,SeperatorInput_TableFormat);
					    verifyElementIsPresent(driver, SeparatorOption1);
					    verifyElementIsPresent(driver, SeperatorOption2);
				        
					    selectByText(driver, SeperatorInput_TableFormat, ChangeSeperator_Smoke_293);
					    wait(driver,"1");
					    String AfterSelectSeperatorValue=getTextJavascript(driver, SeperatorInput_TableFormat);
					    System.out.println("AfterSelectSeperatorValue : "+AfterSelectSeperatorValue);
					    if(AfterSelectSeperatorValue.equals(ChangeSeperator_Smoke_293)) {
					    	pass(driver,"Selected seperator value is correctly displayed in the Seperator Input");
					    }else {
					    	fail(driver,"Selected seperator value is not correctly displayed in the Seperator Input");
					    }
					    
					    if(isDisplayed(driver,SeperatorSelectedColumnBox)) {
							pass(driver,"Seperator Selected Column box is displayed after selecting the seperator value");
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
									int availableSeperatorColoumnCount=availableSeperatorColoumnList.size();
									
									List<String> availableNumList=new ArrayList<String>();
									for(WebElement ele:availableSeperatorColoumnList) {
										String listtext=ele.getText();
										availableNumList.add(listtext);
									}
									
									click3(driver,SeperatorText_TableFormat);
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
										
										Pattern numericalPattern1 = Pattern.compile("^(\\d{1,3}(,\\d{3})*|\\d{1,2}(,\\d{2}){2,})(\\.\\d+)?$");
										 datePattern = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");
								        
										boolean seperatorCheck=true;
								        String FailResultSeperator="";
								        
								        for(String availabelList:availableNumList) {
								        	
											List<WebElement> AllCellElements1=getWebElements(driver,TableCell);

								        	for (WebElement cell : AllCellElements1) {
								        		String Col_ID=cell.getAttribute("col-id");
								        		if(Col_ID.contains(availabelList)) {
								        			 String cellText = cell.getText();
											            int Explength=6;
											            if(cellText.contains(".")) {
											            	Explength=10;
											            }
							                            
											            if (datePattern.matcher(cellText).matches() || cellText.equals("") || cellText.isEmpty() || cellText.equals("0")) {
											                continue;
											            } else if (numericalPattern1.matcher(cellText).matches()) {
											            	if(!cellText.contains(",")) {
											            		seperatorCheck=false;
											            		FailResultSeperator=FailResultSeperator+" || Column : "+Col_ID+", cellValue : "+cellText;
											            	}
											            	if(cellText.length()>=Explength) {
											            		String cellFormat=SeperatorValidationTable(cellText);
												            	if(!cellFormat.equals(ChangeSeperator_Smoke_293)) {
												            		seperatorCheck=false;
												            		FailResultSeperator=FailResultSeperator+" || Column : "+Col_ID+", cellValue : "+cellText;
												            	}
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
								        
								        click(driver,SelectAllCheckBox_Seperator);
								        wait(driver,"1");
								        if(isDisplayed2(driver,AppliedSeperatorColoumn)) {
											fail(driver,"Column Names displayed in the seperator selected column After deSelecting 'Select All checkbox' ");
										}else {
											pass(driver,"Column Names not displayed in the seperator selected column After deSelecting 'Select All checkbox' ");
											click(driver,SeperatorSelectedColumnBox);
											sendKeys(driver,SearchSeperatorColumnInput,SelectColumnSeperator_Smoke_299);
											WebElement searchedColumn=driver.findElement(By.xpath("//li//div[@title='"+SelectColumnSeperator_Smoke_299+"']"));
											searchedColumn.click();
											wait(driver,"1");
											String SelectedSeperatorColumnName=getAttribute1(driver, AppliedSeperatorColoumn, "data-value");
											if(SelectedSeperatorColumnName.equals(SelectColumnSeperator_Smoke_299)) {
												pass(driver,"Selected Column Name updated in the Seperator column input box");
												scrollUsingElement(driver, ApplyButton);
												wait(driver,"1");
												click(driver, ApplyButton);
												elementnotvisible1(driver, RPE_Loading);
												waitForElement(driver,TableCell);
												List<WebElement> AllCellElements2=driver.findElements(By.xpath("//div[@col-id='"+SelectColumnSeperator_Smoke_299+"' and @role='gridcell']"));
												
												numericalPattern1 = Pattern.compile("^(\\d{1,3}(,\\d{3})*|\\d{1,2}(,\\d{2}){2,})(\\.\\d+)?$");
										        datePattern = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");
										        
										        boolean seperatorCheck2=true;
										        String FailResultSeperator2="";
										        
										        for (WebElement cell : AllCellElements2) {
										            String cellText = cell.getText();
						                            String Col_ID=cell.getAttribute("col-id");
						                            int Explength=5;
										            if(cellText.contains(".")) {
										            	Explength=10;
										            }
										            if (datePattern.matcher(cellText).matches() || cellText.equals("") || cellText.isEmpty()|| cellText.equals("0")) {
										                continue;
										            } else if (numericalPattern1.matcher(cellText).matches() && cellText.length()>=Explength) {
										            	
										            	String cellFormat=SeperatorValidationTable(cellText);
										            	
										            	if(!cellFormat.equals(ChangeSeperator_Smoke_293)) {
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
//										SeperatorValidationTable
										
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
							
						}else {
							fail(driver,"Seperator Selected Column box is displayed after selecting the seperator value");
						}
					}else {
						fail(driver,"Seperator input is not accessible in the Table Format");
					}
					
			  // TC_Smoketest_290 to TC_Smoketest_300 End....
					
			  // TC_Smoketest_301 to TC_Smoketest_304 Start...
					
				if(IsElementEnabled(driver, RoundOffInput_TableFormat)) {
					String defaultRoundOffSelect=defaultSelectedValue(driver, RoundOffInput_TableFormat);
					System.out.println("defaultRoundOffSelect : "+defaultRoundOffSelect);
					if(defaultRoundOffSelect.equals("")||defaultRoundOffSelect.equals(DefaultRoundOff_TableFormat)) {
						pass(driver,"By default, 'Select' is displayed in the RoundOff input");
					}else {
						fail(driver,"By default, 'Select' is not displayed in the RoundOff input");
					}
					
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
					
					selectByText(driver, RoundOffInput_TableFormat, ChangeRoundOff_Smoke_304);
				    wait(driver,"1");
				    String AfterSelectRoundOffValue=getTextJavascript(driver, RoundOffInput_TableFormat);
				    System.out.println("AfterSelectRoundOffValue : "+AfterSelectRoundOffValue);
				    if(AfterSelectRoundOffValue.equals(ChangeRoundOff_Smoke_304)) {
				    	pass(driver,"Selected RoundOff value is correctly displayed in the RoundOff Input");
				    }else {
				    	fail(driver,"Selected RoundOff value is not correctly displayed in the RoundOff Input");
				    }
					
				    if(isDisplayed(driver,RoundOffSelectColumnBox)) {
						pass(driver,"RoundOff Selected Column box is displayed after selecting the RoundOff value");
						 if(isDisplayed(driver,SelectAllCheckbox_RoundOff)) {
						    	pass(driver,"Select All Checkbox is displayed after selecting the RoundOff value");
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
									int availableRoundOffColoumnCount=availableRoundOffColoumnList.size();
									click3(driver,SeperatorText_TableFormat);
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
				                        List<WebElement> AllCellElements1=getWebElements(driver,TableCell);
										
										Pattern numericalPattern1 = Pattern.compile("^(\\d{1,3}(,\\d{3})*|\\d{1,2}(,\\d{2}){2,})(\\.\\d+)?$");
										datePattern = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$"); // need to delete Pattern
										
								        boolean RoundOffCheck1=true;
								        String FailResultRoundOff1="";
								        
										for (WebElement cell : AllCellElements1) {
								            String cellText = cell.getText();
				                            String Col_ID=cell.getAttribute("col-id");
								            if (datePattern.matcher(cellText).matches() || cellText.equals("") || cellText.isEmpty() || cellText.equals("0")) {
								                continue;
								            } else if (numericalPattern1.matcher(cellText).matches()) {
								            	
								            	int CellRoundOffValueNum=getRoundOffValue(cellText);
								            	String CellRoundOffValue=String.valueOf(CellRoundOffValueNum);
								            	if(!CellRoundOffValue.equals(ChangeRoundOff_Smoke_304)) {
								            		RoundOffCheck1=false;
								            		FailResultRoundOff1=FailResultRoundOff1+" || Column : "+Col_ID+", cellValue : "+cellText;
								            	}
								            	
								            } 
								        }
										
										if(RoundOffCheck1==true) {
											pass(driver,"RoundOff correctly Applied for all the cells");
										}else {
											fail(driver,"RoundOff not correctly Applied in this cell : "+FailResultRoundOff1);
										}
										
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
										sendKeys(driver,SearchRoundOffColumnInput,SelectColumnRoundOff_Smoke_303);
										WebElement searchedColumn=driver.findElement(By.xpath("//li//div[@title='"+SelectColumnRoundOff_Smoke_303+"']"));
										searchedColumn.click();
										wait(driver,"1");
										String SelectedRoundOffColumnName=getAttribute1(driver, AppliedRoundOffColumns, "data-value");
										if(SelectedRoundOffColumnName.equals(SelectColumnRoundOff_Smoke_303)) {
											
											pass(driver,"Selected Column Name updated in the RoundOff column input box");
											scrollUsingElement(driver, ApplyButton);
											wait(driver,"1");
											click(driver, ApplyButton);
											elementnotvisible1(driver, RPE_Loading);
											waitForElement(driver,TableCell);
											List<WebElement> AllCellElements2=driver.findElements(By.xpath("//div[@col-id='"+SelectColumnRoundOff_Smoke_303+"' and @role='gridcell']"));
											
											numericalPattern1 = Pattern.compile("^(\\d{1,3}(,\\d{3})*|\\d{1,2}(,\\d{2}){2,})(\\.\\d+)?$");
									        datePattern = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");
											
									        boolean RoundOffCheck2=true;
									        String FailResultRoundOff2="";
									        
											for (WebElement cell : AllCellElements2) {
									            String cellText = cell.getText();
					                            String Col_ID=cell.getAttribute("col-id");
									            if (datePattern.matcher(cellText).matches() || cellText.equals("") || cellText.isEmpty() || cellText.equals("0") ) {
									                continue;
									            } else if (numericalPattern1.matcher(cellText).matches()) {
									            	
									            	int CellRoundOffValueNum=getRoundOffValue(cellText);
									            	String CellRoundOffValue=String.valueOf(CellRoundOffValueNum);
									            	
									            	if(!CellRoundOffValue.equals(ChangeRoundOff_Smoke_304)) {
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
					}else {
						fail(driver,"RoundOff Selected Column box is displayed after selecting the RoundOff value");
					}
				}else {
					fail(driver,"RoundOff input is not Accessible in the Table Format");
				}
				// TC_Smoketest_301 to TC_Smoketest_304 End... 
		      }//Table Format expand
		    	 
//			   // TC_Smoketest_305
//			    scrollUsingElement(driver, ApplyButton);
//			    wait(driver,"1");
//	       	    click(driver, ApplyButton); //for dryrun
//	       	    elementnotvisible1(driver, RPE_Loading);
//	          	waitForElement(driver,TableCell);
//			    VerticalScrollFull(driver,ResultTableBody);
//				HorizontalScrollFull(driver,HorizontalScroll2);
//				try {
//		    		  WebElement element = getWebElement(driver, HorizontalScroll2);
//		              JavascriptExecutor js = (JavascriptExecutor) driver;
//		              js.executeScript("arguments[0].scrollLeft = 0;", element);
//		              pass(driver,"Horizontal scroll moved to left end");
//				}catch(Exception e) {
//					  fail(driver,"Horizontal scroll moved to left end");
//				}
//			  // TC_Smoketest_305
					
			 // TC_Smoketest_306
				String beforeExpandWidth=getElementWidth(driver,TableHeadingCell);
				System.out.println("beforeExpandWidth : "+beforeExpandWidth);
				int beforeExpandWidthNum=Integer.parseInt(beforeExpandWidth);
				WebElement tableHeadElement=getWebElement(driver, TableCellExpand);
				
				mouseOverToElement(driver, TableHeadingCell);
				try {
					action.moveToElement(tableHeadElement).build().perform();
					wait(driver,"2");
					action.clickAndHold(tableHeadElement).moveByOffset(15,0).build().perform();
					action.release().build().perform();
				}catch(Exception e) {
					System.out.println("Expanding of column sec failed");
				}
				String AfterExpandWidth=getElementWidth(driver,TableHeadingCell);
				System.out.println("AfterExpandWidth : "+AfterExpandWidth);
				int afterExpandWidthNum=Integer.parseInt(AfterExpandWidth);
				
				if(afterExpandWidthNum>beforeExpandWidthNum) {
					pass(driver,"Expanding of column section works properly");
				}else {
					fail(driver,"Expanding of column section not works properly");
				}
			  // TC_Smoketest_306   
					
			 // TC_Smoketest_307   
				WebElement tableHeadElement2=getWebElement(driver, TableHeadingCell2);
				String beforeSwapColumnNum=getAttribute1(driver, TableHeadingCell2, "aria-colindex");
				System.out.println("beforeSwapColumnNum : "+beforeSwapColumnNum);
				action.moveToElement(tableHeadElement2).build().perform();
				wait(driver,"1");
				action.clickAndHold(tableHeadElement2).moveByOffset(100,0).build().perform();
				action.release().build().perform();
				wait(driver,"1");
				String afterSwapColumnNum=getAttribute1(driver, TableHeadingCell2, "aria-colindex");
				System.out.println("afterSwapColumnNum : "+afterSwapColumnNum);
				if(!beforeSwapColumnNum.equals(afterSwapColumnNum)) {
					pass(driver,"Drag columns works properly");
				}else {
					fail(driver,"Drag columns not works properly");
				}
			 // TC_Smoketest_307 	
					
			// TC_Smoketest_308
				List<WebElement> headingCells=getWebElements(driver, TableHeadingCells);
				List<WebElement> sortIcons=getWebElements(driver, sortingIcon);
				List<WebElement> menuIcons=getWebElements(driver, menuOption);
				if(headingCells.size()==sortIcons.size()) {
					pass(driver,"Sorting Icon present in all the Columns");
				}else {
					fail(driver,"Sorting Icon not present in some Columns");
				}
				
				if(headingCells.size()==menuIcons.size()) {
					pass(driver,"Menu Icon present in all the Columns");
				}else {
					fail(driver,"Menu Icon not present in some Columns");
				}
			 // TC_Smoketest_308 
				
		     // TC_Smoketest_309 
				mouseOverToElement(driver, TableHeadingCell);
				String beforeSortingOrder1=getAttribute1(driver, TableHeadingCell, "aria-sort");
				click(driver,TableHeadingCell);
				wait(driver,"1");
				String AfterSortingOrder1=getAttribute1(driver, TableHeadingCell, "aria-sort");
				if(beforeSortingOrder1.equals(AfterSortingOrder1)) {
					fail(driver,"Sorting Function not works properly");
				}else {
					pass(driver,"Sorting Function works properly");
				}
			 // TC_Smoketest_309 
					
			// TC_Smoketest_310 to TC_Smoketest_313 Start
				mouseOverToElement(driver, TableHeadingCell);
				String BeforeRenameColumnName=getText1(driver, ColumnName2);
				String secondCell_Id=getAttribute1(driver, TableHeadingCell, "col-id");
				if(isDisplayed2(driver,menuOptionSecondColumn)) {
					pass(driver,"Menu Option is displpayed when mouse hover to column");
					click(driver,menuOptionSecondColumn);
					verifyElementIsPresent1(driver, PinColumnOption);
					verifyElementIsPresent1(driver, AutoSizeColumnOption);
					verifyElementIsPresent1(driver, AutoSizeAllColumnOption);
					verifyElementIsPresent1(driver, ResetColumnOption);
					verifyElementIsPresent1(driver, ChangeHeaderOption);
					verifyElementIsPresent1(driver, AllignOption);
					
					click(driver,ChangeHeaderOption);
					if(isDisplayed(driver,RenameSection_Popup)) {
						pass(driver,"Rename Section Popup displayed after click the ChangeHeader Option");
						verifyElementIsPresent1(driver, RenameHeading_popup);
						verifyElementIsPresent1(driver, RenameInput);
						verifyElementIsPresent1(driver, RenameHeading_popup);
						verifyElementIsPresent1(driver, RenameHeading_popup);

						click(driver,RenameInput);
						clearAndType1(driver,RenameInput,ColumnRename_Smoke_311);
						click(driver,Rename_Yes_Button);
						wait(driver,"1");
						String HeadCellXpath="//div[@id='RPE_Preview']//div[@col-id='"+secondCell_Id+"' and @role='columnheader']";
						String HeadCellTextXpath="//div[@id='RPE_Preview']//div[@col-id='"+secondCell_Id+"' and @role='columnheader']//span[@ref='eText']";
						WebElement SecondHeadCellElement=driver.findElement(By.xpath(HeadCellXpath));
						WebElement SecondHeadCellTextElement=driver.findElement(By.xpath(HeadCellTextXpath));
						String AfterRenameColumnName=SecondHeadCellTextElement.getText();
						System.out.println("AfterRenameColumnName1 : "+AfterRenameColumnName);
						if(AfterRenameColumnName.equals(ColumnRename_Smoke_311)) {
							pass(driver,"Header Name changed Successfully after click rename ok buton ");
						}else {
							fail(driver,"Header Name not changed Successfully after click rename ok buton ");
						}
						//mouseOverToElement(driver, TableHeadingCell); //old changed
						action.moveToElement(SecondHeadCellElement).build().perform();
						wait(driver,"1");
						String XpathFormenuOption="//div[@id='RPE_Preview']//div[@col-id='"+secondCell_Id+"' and @role='columnheader']//span[@ref='eMenu']";
						WebElement menuOptionElement=driver.findElement(By.xpath(XpathFormenuOption));
						menuOptionElement.click();
						//click(driver,menuOptionSecondColumn);
						waitForElement(driver,ChangeHeaderOption);
						click(driver,ChangeHeaderOption);
						waitForElement(driver,RenameInput);
						click(driver,RenameInput);
						clearAndType1(driver,RenameInput,ColumnRename_Smoke_311+"23");
						click(driver,Rename_Cancel_Button);
						wait(driver,"1");
//							String 
						SecondHeadCellTextElement=driver.findElement(By.xpath(HeadCellTextXpath));//changed
						String AfterCancelRenameColumnName=SecondHeadCellTextElement.getText();//getText1(driver, ColumnName2); //old changed
						if(!AfterCancelRenameColumnName.equals(ColumnRename_Smoke_311+"23")) {
							pass(driver,"HeaderColumn name not changed when click cancel button");
						}else {
							fail(driver,"HeaderColumn name changed when click cancel button");
						}
						//mouseOverToElement(driver, TableHeadingCell); //old changed
						SecondHeadCellElement=driver.findElement(By.xpath(HeadCellXpath));
						action.moveToElement(SecondHeadCellElement).build().perform();
						wait(driver,"1");
						menuOptionElement=driver.findElement(By.xpath(XpathFormenuOption));
						menuOptionElement.click();
						//click(driver,menuOptionSecondColumn);
						waitForElement(driver,ChangeHeaderOption);
						click(driver,ChangeHeaderOption);
						waitForElement(driver,RenameInput);
						click(driver,RenameInput);
						clearAndType1(driver,RenameInput,ColumnRename_Smoke_311+"23");
						click(driver,Rename_Reset_Button);
						wait(driver,"1");
						SecondHeadCellTextElement=driver.findElement(By.xpath(HeadCellTextXpath));
						String AfterRevertRenameColumnName=SecondHeadCellTextElement.getText();//getText1(driver, ColumnName2); //old changed
						System.out.println("AfterRevertRenameColumnName : "+AfterRevertRenameColumnName);
						System.out.println("AfterCancelRenameColumnName : "+AfterCancelRenameColumnName);
						System.out.println("AfterRenameColumnName : "+AfterRenameColumnName);
						System.out.println("BeforeRenameColumnName : "+BeforeRenameColumnName);

						if(AfterRevertRenameColumnName.equals(BeforeRenameColumnName)) {
							pass(driver,"After click revert button the HeaderColumn Name reset to initial name");
						}else {
							fail(driver,"After click revert button the HeaderColumn Name not reset to initial name");
						}
						
						
					}else {
						fail(driver,"Rename Section Popup displayed after click the ChangeHeader Option");
					}
					
				}else {
					fail(driver,"Menu Option is not displpayed when mouse hover to column");
				}
			 // TC_Smoketest_310 to TC_Smoketest_313 End
	        }

       		
       	}   //************ TableFormat Completed ******************
	     
				
		// TC_Smoketest_314
	      click(driver,ChartTitleInput);
	      clear(driver,ChartTitleInput);
	      verifyElementIsPresent1(driver, SaveBtn_Chart);
	      verifyElementIsPresent1(driver, cancel_chart);
	      click(driver,SaveBtn_Chart);
	      if(isDisplayed(driver,chartSaveError1)) {
	    	  pass(driver,"'Enter Widget Name' error displayed when save the chart without given chart title name");
	      }else {
	    	  fail(driver,"'Enter Widget Name' error not displayed when save the chart without given chart title name");
	      }
	      elementnotvisible(driver, chartSaveError1);
	      sendKeys(driver,ChartTitleInput,ChartTitleName_Smoke);
	      click(driver,SaveBtn_Chart);
	      elementnotvisible1(driver, RPE_Loading);
	      if(!isDisplayed2(driver,chartSaveError1) && isDisplayed(driver,SavedChartTitleInput)) {
	    	  pass(driver,"Chart saved Successfully");
	      }else {
	    	  fail(driver,"Chart not saved Successfully");
	      }
	      
	      String AfterSaveChartTitleName=getText1(driver, SavedChartTitleName);
    	  if(AfterSaveChartTitleName.equals(ChartTitleName_Smoke)) {
    		  pass(driver,"Same Chart Title name displayed after saved the chart ");
    	  }else {
    		  fail(driver,"Different Chart Title name displayed after saved the chart ");
    	  }
		    	  
	    	  
    	  //....................Filter Functionality starts.................
    	  
    	  String GlobalTab1Id=getAttribute(driver, CurrentTab, "id");
  		  String Table_LocalFilter= getCellValue("TestExecution","Testcase_Selection","Table_LocalFilter",Flag);

	      if(Table_LocalFilter.contains("Yes")) {
	    	  mouseOverToElement(driver, SavedChartTitleInput);
	    	  verifyElementDisplayed(driver, copyChart);
	    	  verifyElementDisplayed(driver, filterChart);
	    	  verifyElementDisplayed(driver, editeChart);
	    	  verifyElementDisplayed(driver, deteleBtn_chart);

	    	  mouseOverToElement(driver, filterChart);
	    	  click(driver,filterChart);
	    	  if(isDisplayed(driver,LocalFilterSec)) {
	    		  pass(driver,"Local Filter section is displayed when click the filter chart icon");
	    		  String chartTitlename=getText1(driver, ChartTitleNameLocalFilter);
	    		  if(chartTitlename.equals(ChartTitleName_Smoke)) {
	    			  pass(driver,"Same chart title name displayed in Local filter section");
	    		  }else {
	    			  fail(driver,"Different chart title name displayed in Local filter section");
	    		  }
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
	    		  
	    		  verifyElementDisplayed(driver, DatasetName_LocalFilter);
	    		  //TC_Smoketest_323
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
	    		  
	           //categorical Dynamic change Start... 
	    		  boolean categoricalFilter=false;
	    		  try {
	    			  WebElement CategoricalColumn= driver.findElement(By.xpath("//div[@id='dashboardLRPE_select_filterColsCon']//div[@id='"+SelectCategorical_LocalFilter+"']//a"));
		    		  action.moveToElement(CategoricalColumn).click().build().perform();
		    		  categoricalFilter=true;
	    		  }catch(Exception e) {
	    			  
	    		  }
	    		  
		         if(categoricalFilter==true) {
		    		  WebElement CategoricalColumnExp=driver.findElement(By.xpath("//div[@id='dashboardLRPE_select_filterColsCon']//div[@id='"+SelectCategorical_LocalFilter+"']//a//i"));
		    		  String CategoricalColumnExpText=CategoricalColumnExp.getAttribute("class");
		    		  if(CategoricalColumnExpText.contains("up")) {
		    			  pass(driver,"Categorical Column Expand After click on it ");
		    			  if(verifyElementDisplayed(driver, byValueFilterOption)) {
		    				  if(verifyElementDisplayed(driver, byValueFilterOption)) {
			    				  if(isElementSelected(driver,byValueRadioButton)) {
			    					  pass(driver,"By default, 'By Values' radio button selected ");
			    				  }else {
			    					  fail(driver,"By default, 'By Values' radio button not selected ");
			    				  }
		    				  }
	    				  }
		    			  
		    			  verifyElementDisplayed(driver, AllCheckbox_CategoricalSec);
    				      verifyElementDisplayed(driver, CategoricalSearchListOptions);
    				      verifyElementDisplayed(driver, ExcludeOption_Categorical);
    				      verifyElementDisplayed(driver, ExcludeCheckbox);

    				      List<WebElement> searchListAvailable=driver.findElements(By.xpath("//div[@id='"+SelectCategorical_LocalFilter+"_FactorsList']//li"));
    				      List<WebElement> searchListCheckboxAvailable=driver.findElements(By.xpath("//div[@id='"+SelectCategorical_LocalFilter+"_FactorsList']//li//input[@type='checkbox']"));
    				      if(searchListAvailable.size()==searchListCheckboxAvailable.size()) {
    				    	  pass(driver,"All the available searchlist are displayed with Checkbox");
    				      }else {
    				    	  fail(driver,"Some available searchlist are not displayed with Checkbox");
    				      }
    				      
    				      
		    			  WebElement SearchBar_=driver.findElement(By.xpath("//input[@id='"+SelectCategorical_LocalFilter+"LFsearch']"));
		    			  SearchBar_.click();
		    			  wait(driver,"1");
		    			  SearchBar_.sendKeys(ByValuesInput_Categorical_LF);
		    			  pass(driver,"Type On Value "+ByValuesInput_Categorical_LF+" search input");
		    			  wait(driver,"1");
		    			  WebElement firstOption=driver.findElement(By.xpath("(//div[@id='"+SelectCategorical_LocalFilter+"_FactorsList']//li)[1]"));
		    			  String firstOptionText=firstOption.getText();
		    			  if(firstOptionText.equals(ByValuesInput_Categorical_LF)) {
		    				  pass(driver,"Search bar inside the Categorical section works properly");
		    			  }else {
		    				  fail(driver,"Search bar inside the Categorical section not works properly");
		    			  }
	    			  
		    			  firstOption.click();
	    				  wait(driver,"1");
	    				  WebElement firstCheckBox=driver.findElement(By.xpath("(//div[@id='"+SelectCategorical_LocalFilter+"_FactorsList']//li//input)[1]"));
			    		  if(firstCheckBox.isSelected()){
			    			  pass(driver,"Check box selected when click the First searched value");
			    		  }else {
			    			  fail(driver,"Check box not selected when click the First searched value");
			    		  }
			    		  
			    		  click(driver,ApplyButton_LocalFilter);
    					  elementnotvisible1(driver, RPE_Loading);
    					  if(isDisplayed(driver,Bug_msg)) {
    						  fail(driver,"Error displayed : "+getText1(driver, Bug_msg));
    					  }
    					  if(isDisplayed(driver,body)) {
    						  mouseOverToElement(driver, body);
	    					  
	    					  mouseOverToElement(driver, LocalFilterChartIcon);
	    					  String LocatFilterExpected="Local Filter: ON ";
	    					  String LocatFilterAct=getAttribute1(driver, FilterChartIcon, "title");
	    					  System.out.println("LocatFilterExp : "+LocatFilterAct);
	    					  if(LocatFilterAct.contains(LocatFilterExpected)) {
	    						  System.out.println("Passed : LocatFilterAct");
	    						  pass(driver,"Local filter is ON in the chart after Apply filter");
	    					  }else {
	    						  System.out.println("Failed.!! : LocatFilterAct");
	    						  fail(driver,"Local filter is not ON in the chart after Apply filter");
	    					  }
	    					  
	    					  String LocalFilterIconColorRGB=getWebElement(driver, LocalFilterChartIcon).getCssValue("fill");  
	    					  String LocalFilterIconColorAct=rgbToHex1(LocalFilterIconColorRGB);
	    					  
	    					  if("#00E600".equalsIgnoreCase(LocalFilterIconColorAct)) { // need to modify.
	    						  pass(driver,"Local Filter icon changed to green color after Applying the Local Filter"); 
	    					  }else {
	    						  fail(driver,"Local Filter icon not changed to green color after Applying the Local Filter");
	    					  }
	    					  
	    					  int j=1;
		    		          boolean filteredCell=true;
		    		          String failedValues=" ";
	    					  List<WebElement> LocalFilterChartValue=driver.findElements(By.xpath("(//div[@ref='gridBody'])[1]//div[@col-id='"+SelectCategorical_LocalFilter+"' and @role='gridcell']"));
	    					  for(WebElement localEle:LocalFilterChartValue) {
	    						  String LocalFilterCellValue=localEle.getText();
	    						  
	    						  if(!LocalFilterCellValue.equals(ByValuesInput_Categorical_LF)) {
	    							  filteredCell=false;
	    							  failedValues=failedValues+j+", ";
	    						  }
	    						  j++;
	    					  }
	    					  
		    		         if(filteredCell==true) {
		  			    	       pass(driver,"For 'By Values' condition applied correctly");
		  			          }else {
    							  fail(driver,"By Value Local Filter not Applied correctly for the Categorical column : "+SelectCategorical_LocalFilter+", Rows : "+failedValues);
		  			          }
	    					  
    					  }else {
    						  String Failed=getText1(driver, ValidationChart);
    						  pass(driver,"Unable to get the chart value for the selected filter 'By Values' , error : "+Failed);
    					  }
    					 
			    		  click(driver,ExcludeCheckbox);
			    		  click(driver,ApplyButton_LocalFilter);
			    		  elementnotvisible1(driver, RPE_Loading);
			    		  if(isDisplayed(driver,Bug_msg)) {
    						  fail(driver,"Error displayed : "+getText1(driver, Bug_msg));
    					  }
    					  if(isDisplayed(driver,body)) {
    						  mouseOverToElement(driver, body);
		    		          mouseOverToElement(driver, LocalFilterChartIcon);
		    		          String LocalFilterIconColorRGB=getWebElement(driver, LocalFilterChartIcon).getCssValue("fill");	    					  
	    					  String LocalFilterIconColorAct=rgbToHex1(LocalFilterIconColorRGB);
	    					  
	    					  if("#00E600".equalsIgnoreCase(LocalFilterIconColorAct)) { // need to modify.
	    						  pass(driver,"Local Filter icon changed to green color after Applying the Local Filter"); 
	    					  }else {
	    						  fail(driver,"Local Filter icon not changed to green color after Applying the Local Filter");
	    					  }
    						  int j=1;
		    		          boolean filteredCell=true;
		    		          String failedValues1=" ";
    						  List<WebElement> LocalFilterChartValue=driver.findElements(By.xpath("(//div[@ref='gridBody'])[1]//div[@col-id='"+SelectCategorical_LocalFilter+"' and @role='gridcell']"));
	    					  for(WebElement localEle:LocalFilterChartValue) {
	    						  String LocalFilterCellValue=localEle.getText();
	    						  
	    						  if(LocalFilterCellValue.equals(ByValuesInput_Categorical_LF)) {
	    							  filteredCell=false;
	    							  failedValues1=failedValues1+j+", ";
	    						  }
	    						  j++;
	    					  }
    						  
				    		  if(filteredCell==true) {
				  			    	pass(driver,"For 'By Values 'Exclude' ' condition applied correctly..");
		  			    	  }else {
	    							fail(driver,"By Value Local 'Exclude' Filter not Applied correctly for the Categorical column : "+SelectCategorical_LocalFilter+", Rows : "+failedValues1);
		  			    	  }
    						  
    					  }else {
    						  String Failed=getText1(driver, ValidationChart);
    						  pass(driver,"Unable to get the chart value for the selected filter 'By Value Exclude' , error : "+Failed);
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
    				    			  		 elementnotvisible1(driver, RPE_Loading);
    				    			  		if(isDisplayed(driver,Bug_msg)) {
    				    						  fail(driver,"Error displayed , condition :  "+conditionsList[k]+"  : " +getText1(driver, Bug_msg));
    				    					  }
    				    			  		 if(isDisplayed(driver,body)) {
    				    			  			 mouseOverToElement(driver, body);
		    		  							 mouseOverToElement(driver, LocalFilterChartIcon);
		    		  							 String LocalFilterIconColorRGB=getWebElement(driver, LocalFilterChartIcon).getCssValue("fill");
												  
		    		  							 String LocalFilterIconColorAct=rgbToHex1(LocalFilterIconColorRGB);
	    		  							 	 if("#00E600".equalsIgnoreCase(LocalFilterIconColorAct)) { // need to modify.
													  pass(driver,"Local Filter icon changed to green color after Applying the Local Filter : "+conditionsList[k]); 
	    		  							 	 }else {
													  fail(driver,"Local Filter icon not changed to green color after Applying the Local Filter : "+conditionsList[k]);
	    		  							 	 }
		    		  
    				    			  			 int j=1;
		    		                             boolean filteredCell=true;
		    		                             String failedvalues2=" ";
    				    			  			 List<WebElement> LocalFilterChartValue=driver.findElements(By.xpath("(//div[@ref='gridBody'])[1]//div[@col-id='"+SelectCategorical_LocalFilter+"' and @role='gridcell']"));
    				    			  			 for(WebElement localEle:LocalFilterChartValue) {
    				    			  				 String LocalFilterCellValue=localEle.getText();
    				    			  				 if(!Categorical_ConditionFiltercell(conditionsList[k],LocalFilterCellValue,conditionsInputList[k])) {
    				    			  					   filteredCell=false;
    				    			  					   failedvalues2=failedvalues2+j+", ";
    				    			  				 }
    				    			  				 j++;
    				    			  			 }
									    		  if(filteredCell==true) {
									  			    	pass(driver,"For '"+conditionsList[k]+"' condition applied correctly..");
									  			  }else {
   				    			  					    fail(driver,conditionsList[k]+" Condition in Local Filter not Applied correctly for the column : "+SelectCategorical_LocalFilter+", Rows : "+failedvalues2 );
									  			  }
  	    		    						 
    				    			  		 }else {
    				    			  			 
    				    			  			 pass(driver,"Unable to get the chart value for the selected filter "+conditionsList[k]+", error display : "+getText1(driver, ValidationChart));
    				    			  		 }
    				    			  	
    				    				 }catch(Exception e) {
    				    					 e.printStackTrace();
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
				    				  
			    				  mouseOverToElement(driver, AddButtonCondition);
			    				  click(driver,AddButtonCondition);
			    				  
			    				  verifyElementDisplayed(driver, AND_ConditionSec1);
			    				  verifyElementDisplayed(driver, OR_ConditionSec1);
			    				 
			    				  if(FirstOperator_Input_Categorical_LF.equals("AND")) { 
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
				    				  
			    				  mouseOverToElement(driver, AddButtonCondition);
			    				  click(driver,AddButtonCondition);
			    				  verifyElementDisplayed(driver, AND_ConditionSec2);
			    				  verifyElementDisplayed(driver, OR_ConditionSec2);
			    				  
			    				  if(SecondOperator_Input_Categorical_LF.equals("AND")) { 
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
		    					  elementnotvisible1(driver, RPE_Loading);
		    					  if(isDisplayed(driver,Bug_msg)) {
		    						  fail(driver,"Error displayed, 3 condition : "+getText1(driver, Bug_msg));
		    					  }
		    					  if(isDisplayed(driver,body)) {
			    			  			 mouseOverToElement(driver, body);
			    			  			 int j=1;
		    		                     boolean filteredCell=true;
		    		                     String failedValues3=" ";
			    			  			 List<WebElement> LocalFilterChartValue=driver.findElements(By.xpath("(//div[@ref='gridBody'])[1]//div[@col-id='"+SelectCategorical_LocalFilter+"' and @role='gridcell']"));
			    			  			 for(WebElement localEle:LocalFilterChartValue) {
			    			  				 String LocalFilterCellValue=localEle.getText();
			    						     boolean condition_1_Result=Categorical_ConditionFiltercell(FirstCondition_Categorical_LF,LocalFilterCellValue,FirstCondition_Input_Categorical_LF);
			    						     boolean condition_2_Result=Categorical_ConditionFiltercell(SecondCondition_Categorical_LF,LocalFilterCellValue,SecondCondition_Input_Categorical_LF);
			    						     boolean condition_3_Result=Categorical_ConditionFiltercell(ThirdCondition_Categorical_LF,LocalFilterCellValue,ThirdCondition_Input_Categorical_LF);
			    						     String operator1 = FirstOperator_Input_Categorical_LF; 
			    						     String operator2 = SecondOperator_Input_Categorical_LF;
			    			  				 
			    			  				 if(!evaluateConditions(condition_1_Result,operator1,condition_2_Result,operator2,condition_3_Result)) {
			    			  					 filteredCell=false;
			    			  					 failedValues3=failedValues3+j+", ";
			    			  				 }
			    			  				 j++;
			    			  			 }
							    		  if(filteredCell==true) {
							  			    	pass(driver,"For 'Selected 3 Condition'  applied correctly Local Filter..");
							  			    }else {
			    			  					 fail(driver,"Selected 3 Condition in Local Filter not Applied correctly for the Categorical column : "+SelectCategorical_LocalFilter+", Rows : "+failedValues3);
							  			    }
		    						 
		    			  		 }else {
		    			  			 pass(driver,"Unable to get the chart value for the selected filter '3 conditions' , error display : "+getText1(driver, ValidationChart));
		    			  		 }
		    					  
		    					  click(driver,ResetButton_LocalFilter);
		    					  elementnotvisible1(driver, RPE_Loading);
		    					  waitForElement(driver, body);
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
			    					  
		    					  try {
			    						String LocalFilterIconColorAct=rgbToHex1(LocalFilterIconColorRGB);
				    					  
				    					  if(!"#00E600".equalsIgnoreCase(LocalFilterIconColorAct)) { // need to modify.
				    						  pass(driver,"Local Filter icon changed to Original color after Reset the Local Filter"); 
				    					  }else {
				    						  fail(driver,"Local Filter icon not changed to Original color after Reset the Local Filter");
				    					  }
		    					  } catch (Exception e) {
										// TODO Auto-generated catch block
										System.out.println("LocalFilterIconColorAct : Failed");
		    					  }
    				    		  
    				    	   }
    					  }
    				    		
    					  }else {
    						  fail(driver,"Categorical Column not Expand After click on it ");
    		    		  }	
    					  
		    		  }else {
		    			  fail(driver,SelectCategorical_LocalFilter+" Categorical Column value not present in local filter");
		    		  }		  
//			  
		  // Categorical Validation End...
	    			  
	    // Date Validation Start....   
                  click(driver,ResetButton_LocalFilter);
                  elementnotvisible1(driver, RPE_Loading);
	    		  boolean dateFilter=false;
	    		  try {
	    			  WebElement DateColumnElement=driver.findElement(By.xpath("//div[@id='dashboardLRPE_select_filterColsCon']//div[@id='"+SelectDateColumn_Smoke_LocalFilter+"']//a"));
    				  action.moveToElement(DateColumnElement).click().build().perform();
    				  dateFilter=true;
	    		  }catch(Exception e) {
	    			  
	    		  }
                  
    			  if(dateFilter==true) { 
    	
    				  wait(driver,"1");
    				  WebElement DateColumnElementExpand=driver.findElement(By.xpath("//div[@id='dashboardLRPE_select_filterColsCon']//div[@id='"+SelectDateColumn_Smoke_LocalFilter+"']//a//i"));
    				  String DateColumnElementExpandString=DateColumnElementExpand.getAttribute("class");
    				  if(DateColumnElementExpandString.contains("up")) {
    					  pass(driver,"Selected Date Column expanded after click on it");
    					 
						  WebElement Date_RelativeSection=driver.findElement(By.xpath("//div[@id='"+SelectDateColumn_Smoke_LocalFilter+"_content']//div[@id='relative_div']"));
						  pass(driver,"Relative filter present in the Date Column");
						  WebElement Date_RelativeRadioBtn=driver.findElement(By.xpath("//div[@id='"+SelectDateColumn_Smoke_LocalFilter+"_content']//div[@id='relative_div']//input"));
						  if(Date_RelativeRadioBtn.isSelected()) {
							  pass(driver,"By default, 'Relative' option selected in the Date Column");
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
			    			  		 elementnotvisible1(driver, RPE_Loading);
			    			  		if(isDisplayed(driver,Bug_msg)) {
			    						  fail(driver,"Error displayed : "+getText1(driver, Bug_msg));
			    					  }
			    			  		 if(isDisplayed(driver,body)) {
			    			  			 mouseOverToElement(driver, body);
			    			  			 wait(driver,"1");
			    			  			 mouseOverToElement(driver, LocalFilterChartIcon);
				    		             String LocalFilterIconColorRGB=getWebElement(driver, LocalFilterChartIcon).getCssValue("fill"); 
			    					     String LocalFilterIconColorAct=rgbToHex1(LocalFilterIconColorRGB);
				    					  
			    					     if("#00E600".equalsIgnoreCase(LocalFilterIconColorAct)) { // need to modify.
				    						  pass(driver,"Local Filter icon changed to green color after Applying the Local Filter : "+RelativeFilterList[k]); 
			    					     }else {
				    						  fail(driver,"Local Filter icon not changed to green color after Applying the Local Filter : "+RelativeFilterList[k]);
		    					  		 }
			    			  			 
			    			  			 int j=1;
			    			  			 boolean filteredCell=true;
			    			  			 String failedValues=" ";
			    			  			 List<WebElement> LocalFilterChartValue=driver.findElements(By.xpath("(//div[@ref='gridBody'])[1]//div[@col-id='"+SelectDateColumn_Smoke_LocalFilter+"' and @role='gridcell']"));
			    			  			 for(WebElement localEle:LocalFilterChartValue) {
			    			  				 String LocalFilterCellValue=localEle.getText();
//				    			  				 System.out.println("LocalFilterDate CellValue  : "+LocalFilterCellValue);

				    			  				if (LocalFilterCellValue != null && LocalFilterCellValue.length() >= 10) {
				    			  					LocalFilterCellValue=LocalFilterCellValue.substring(0, 10);
				    			  		        }
		    			  				 		if(!Date_RelativeFiltercell(RelativeFilterList[k],LocalFilterCellValue,RelativeFilterInputList[k])) {
		    			  				 			 filteredCell=false;
		    			  				 			 failedValues=failedValues+j+", ";
		    			  				 		}
		    			  				 		j++;
			    			  			 	}
    		    						 
			    			  			    if(filteredCell==true) {
			    			  			    	pass(driver,"For '"+RelativeFilterList[k]+"' condition applied correctly Local Filter..");
			    			  			    }else {
			    			  					fail(driver,RelativeFilterList[k]+" Condition in Local Filter not Applied correctly for the Date column : "+SelectDateColumn_Smoke_LocalFilter+", Rows : "+failedValues);
			    			  			    }
				    			  		 }else {
				    			  			 pass(driver,"Unable to get the chart value for the selected filter "+RelativeFilterList[k]+", error display : "+getText1(driver, ValidationChart));
				    			  		 }
				    			  	
				    				 }catch(Exception e) {
				    					 e.printStackTrace();
				    				 }
				    			 }
		    			  		 
		    			  		 
							  
						  }else {
							  fail(driver,"By default, 'Relative' option not selected in the Date Column");
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
				    			  		 elementnotvisible1(driver, RPE_Loading);
				    			  		 if(isDisplayed(driver,Bug_msg)) {
				    						  fail(driver,"Error displayed : "+getText1(driver, Bug_msg));
				    					  }
				    			  		 if(isDisplayed(driver,body)) {
				    			  			 mouseOverToElement(driver, body);
				    			  			 mouseOverToElement(driver, LocalFilterChartIcon);
				    			  			 String LocalFilterIconColorRGB=getWebElement(driver, LocalFilterChartIcon).getCssValue("fill");					    					  
				    			  			 String LocalFilterIconColorAct=rgbToHex1(LocalFilterIconColorRGB);
					    					  
				    			  			 if("#00E600".equalsIgnoreCase(LocalFilterIconColorAct)) { // need to modify.
					    						  pass(driver,"Local Filter icon changed to green color after Applying the Local Filter : "+ConditionFilterList[k]); 
				    			  			 }else {
					    						  fail(driver,"Local Filter icon not changed to green color after Applying the Local Filter : "+ConditionFilterList[k]);
				    			  			 }
				    			  			 wait(driver,"1");
				    			  			 int j=1;
				    			  			 boolean filteredCell=true;
				    			  			 String failedValues=" ";
				    			  			 List<WebElement> LocalFilterChartValue=driver.findElements(By.xpath("(//div[@ref='gridBody'])[1]//div[@col-id='"+SelectDateColumn_Smoke_LocalFilter+"' and @role='gridcell']"));
				    			  			 for(WebElement localEle:LocalFilterChartValue) {
				    			  				 String LocalFilterCellValue=localEle.getText();
				    			  				if (LocalFilterCellValue != null && LocalFilterCellValue.length() >= 10) {
				    			  					LocalFilterCellValue=LocalFilterCellValue.substring(0, 10);
				    			  		        }
				    			  				 
				    			  				if(!Date_ConditionFiltercell(ConditionFilterList[k],LocalFilterCellValue,ConditionFilterInputList[k],Condition_9_InputB_Date_LF)) {
				    			  					 filteredCell=false;
				    			  					 failedValues=failedValues+j+", ";
			    			  				 	}
				    			  				 j++;
				    			  			 }
  	    		    						 
				    			  			 if(filteredCell==true) {
			    			  			    	pass(driver,"For '"+ConditionFilterList[k]+"' condition applied correctly Local Filter..");
				    			  			 }else {
			    			  					 fail(driver,ConditionFilterList[k]+" Condition in Local Filter not Applied correctly for the Date column : "+SelectDateColumn_Smoke_LocalFilter+", Rows : "+failedValues);
				    			  			 }
					    			  			
    				    			  		 }else {
    				    			  			 pass(driver,"Unable to get the chart value for the selected filter "+ConditionFilterList[k]+" , error display : "+getText1(driver, ValidationChart));
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
				    				  
			    				  mouseOverToElement(driver, AddButtonCondition);
			    				  click(driver,AddButtonCondition);
			    				  
			    				  verifyElementDisplayed(driver, AND_ConditionSec1);
			    				  verifyElementDisplayed(driver, OR_ConditionSec1);
			    				 
			    				  if(FirstOperator_Input_Date_LF.equals("AND")) { 
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
				    				 
			    				  mouseOverToElement(driver, AddButtonCondition);
			    				  click(driver,AddButtonCondition);
			    				  verifyElementDisplayed(driver, AND_ConditionSec2);
			    				  verifyElementDisplayed(driver, OR_ConditionSec2);
			    				  
			    				  if(SecondOperator_Input_Date_LF.equals("AND")) { 
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
		    					  wait(driver,"1");
		    					  
		    					  if(isDisplayed2(driver,AddButtonCondition)) {
		    						  fail(driver,"'ADD' button displayed after given 3 times condition ");
		    					  }else {
		    						  pass(driver,"'ADD' button not displayed after given 3 times condition");
		    					  }
		    					  
//				    				  /test
			    				  
			    				  click(driver,ApplyButton_LocalFilter);
		    					  elementnotvisible1(driver, RPE_Loading);
		    					  if(isDisplayed(driver,Bug_msg)) {
		    						  fail(driver,"Error displayed : "+getText1(driver, Bug_msg));
		    					  }
		    					  if(isDisplayed(driver,body)) {
			    			  			 mouseOverToElement(driver, body);
			    			  			 mouseOverToElement(driver, LocalFilterChartIcon);
			    			  			 String LocalFilterIconColorRGB=getWebElement(driver, LocalFilterChartIcon).getCssValue("fill");				    					  
			    			  			 String LocalFilterIconColorAct=rgbToHex1(LocalFilterIconColorRGB);
				    					  
				    					  if("#00E600".equalsIgnoreCase(LocalFilterIconColorAct)) { // need to modify.
				    						  pass(driver,"Local Filter icon changed to green color after Applying the Local Filter : with 3 conditions"); 
				    					  }else {
				    						  fail(driver,"Local Filter icon not changed to green color after Applying the Local Filter : with 3 conditions");
				    					  }
			    			  			 int j=1;
		    		                     boolean filteredCell=true;
		    		                     String failedValues=" ";
		    			  				 List<WebElement> LocalFilterChartValue=driver.findElements(By.xpath("(//div[@ref='gridBody'])[1]//div[@col-id='"+SelectDateColumn_Smoke_LocalFilter+"' and @role='gridcell']"));
			    			  			 for(WebElement localEle:LocalFilterChartValue) {
			    			  				 String LocalFilterCellValue=localEle.getText();
			    			  				 if (LocalFilterCellValue != null && LocalFilterCellValue.length() >= 10) {
			    			  					LocalFilterCellValue=LocalFilterCellValue.substring(0, 10);	
			    			  		         }
			    						     boolean condition_1_Result=Date_ConditionFiltercell(FirstCondition_Date_LF,LocalFilterCellValue,FirstCondition_Date_Input_LF,Condition_9_InputB_Date_LF);
			    						     boolean condition_2_Result=Date_ConditionFiltercell(SecondCondition_Date_LF,LocalFilterCellValue,SecondCondition_Date_Input_LF,Condition_9_InputB_Date_LF);
			    						     boolean condition_3_Result=Date_ConditionFiltercell(ThirdCondition_Date_LF,LocalFilterCellValue,ThirdCondition_Date_Input_LF,Condition_9_InputB_Date_LF);
			    						     String operator1 = FirstOperator_Input_Date_LF;
			    						     String operator2 = SecondOperator_Input_Date_LF;
			    			  				 
			    			  				 if(!evaluateConditions(condition_1_Result,operator1,condition_2_Result,operator2,condition_3_Result)) {
			    			  					 filteredCell=false;
			    			  					 failedValues=failedValues+j+", ";
			    			  				 }
			    			  				 j++;
			    			  			 }
			    			  	
		    			  			 	if(filteredCell==true) {
						  			    	pass(driver,"For 'Selected 3 Condition' Applied correctly in Local Filter..");
		    			  			 	}else {
		    			  					 fail(driver,"Selected 3 Condition in Local Filter not Applied correctly for the Date column : "+SelectDateColumn_Smoke_LocalFilter+", Rows : "+failedValues);
		    			  			 	}
//		    						 
		    			  		 }else {
		    			  			 String Failed=getText1(driver, ValidationChart);
		    			  			 pass(driver,"Unable to get the chart value for the selected filter, 3 conditions : "+Failed);
		    			  		 }
		    					  
		    					  click(driver,ResetButton_LocalFilter);
		    					  elementnotvisible1(driver, RPE_Loading);
		    					  waitForElement(driver, body);
		    					  mouseOverToElement(driver, LocalFilterChartIcon);
		    					  String LocatFilterExpected="Local Filter: OFF ";
		    					  String LocatFilterExpRest=getAttribute1(driver, FilterChartIcon, "title");
		    					  
		    					  if(LocatFilterExpRest.contains(LocatFilterExpected)) {
		    						  pass(driver,"Local filter is OFF in the chart after Reset filter");
		    					  }else {
		    						  fail(driver,"Local filter is not OFF in the chart after Reset filter");
		    					  }
		    					   
		    					  String LocalFilterIconColorRGB=getWebElement(driver, LocalFilterChartIcon).getCssValue("fill");			    					  
    			  			 	  String LocalFilterIconColorAct=rgbToHex1(LocalFilterIconColorRGB);
			    					  
    			  			 	  if(!"#00E600".equalsIgnoreCase(LocalFilterIconColorAct)) { 
		    						  pass(driver,"Local Filter icon changed to Orginal color after Reset the Local Filter : with 3 conditions"); 
    			  			 	  }else {
		    						  fail(driver,"Local Filter icon not changed to Original color after Reset the Local Filter : with 3 conditions");
		    					  }  
		    					  
		    					  
		    					  
    						  }else {
    							  fail(driver,"Conditions Filter in Date type Colunm is not selected after click on it ");
    						  }
    					  }
    					  
    				  }else {
    					  fail(driver,SelectDateColumn_Smoke_LocalFilter+"Selected Date Column not expanded after click on it"); 
    				  }
    				  
    				  
    			  }else {
    				  fail(driver,SelectDateColumn_Smoke_LocalFilter+" Date Column value not present in local filter");
    			  }
    			// Local Date Validation End.....
    			  
    			//Local Numerical Filter validation
    			click(driver,ResetButton_LocalFilter);
    			elementnotvisible1(driver, RPE_Loading);
    			boolean NumericalFilter=false;
    			try {
    				WebElement NumericalColumnElement=driver.findElement(By.xpath("//div[@id='dashboardLRPE_select_filterColsCon']//div[@id='"+SelectNumerical_Smoke_LocalFilter+"']//a"));
    				action.moveToElement(NumericalColumnElement).click().build().perform();
    				NumericalFilter=true;
    			}catch(Exception e) {
    				
    			}
    			if(NumericalFilter==true) {
  				  wait(driver,"1");
  				  WebElement NumericalColumnElementExpand=driver.findElement(By.xpath("//div[@id='dashboardLRPE_select_filterColsCon']//div[@id='"+SelectNumerical_Smoke_LocalFilter+"']//a//i"));
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
//				    					 clear1(driver,"1");
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
	    			  		 if(isDisplayed(driver,body)) {
	    			  			 mouseOverToElement(driver, body);
	    			  			 mouseOverToElement(driver, LocalFilterChartIcon);
	    			  			 String LocalFilterIconColorRGB=getWebElement(driver, LocalFilterChartIcon).getCssValue("fill");
	    			  			 String LocalFilterIconColorAct=rgbToHex1(LocalFilterIconColorRGB);
		    					  
	    			  			 if("#00E600".equalsIgnoreCase(LocalFilterIconColorAct)) { // need to modify.
		    						  pass(driver,"Local Filter icon changed to green color after Applying the Local Filter : "+NumFilterList[k]); 
	    			  			 }else {
		    						  fail(driver,"Local Filter icon not changed to green color after Applying the Local Filter : "+NumFilterList[k]);
	    			  			 }
	    			  			 wait(driver,"1");
	    			  			 int j=1;
	    			  			 boolean filteredCell=true;
	    			  			 String NumFailedCellLF1=" ";
	    			  			 List<WebElement> LocalFilterChartValue=driver.findElements(By.xpath("(//div[@ref='gridBody'])[1]//div[@col-id='"+SelectNumerical_Smoke_LocalFilter+"' and @role='gridcell']//span"));
	    			  			 for(WebElement localEle:LocalFilterChartValue) {
	    			  				 String LocalFilterCellValue=localEle.getText();
	    			  				 //System.out.println(" text : "+LocalFilterCellValue);
	    			  				 
		  							 if(!Numerical_ConditionFiltercell(NumFilterList[k],LocalFilterCellValue,NumFilterInputList[k],Condition_Between_InputB_Num_LF)) {
		    			  				  filteredCell=false;
		    			  				  NumFailedCellLF1=NumFailedCellLF1+j+", ";
		  							  }
	    			  				 j++;
	    			  			 } 
	    			  			 
			    			  		 if(filteredCell==true) {
			    			  			 pass(driver,"For '"+NumFilterList[k]+"' condition applied correctly..");
			    			  		 }else {
			    			  			 fail(driver,NumFilterList[k]+" Condition in Local Filter not Applied correctly for the Num column : "+SelectNumerical_Smoke_LocalFilter+", Rows : "+NumFailedCellLF1);
			    			  		 }
		    			  			
		    			  		 }else {
		    			  			 String Failed=getText1(driver, ValidationChart);
		    			  			 pass(driver,"Unable to get the chart value for the selected filter, "+NumFilterList[k]+" : "+Failed);
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
	    				  
    				  mouseOverToElement(driver, AddButtonCondition);
    				  click(driver,AddButtonCondition);
    				  
    				  verifyElementDisplayed(driver, AND_ConditionSec1);
    				  verifyElementDisplayed(driver, OR_ConditionSec1);
					 
    				  if(FirstOperator_Input_Num_LF.equals("AND")) { 
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
					  wait(driver,"1");
					  if(isDisplayed(driver,AddButtonCondition)) {
	    				  pass(driver,"2 time ADD button displayed after selecting the condition 2nd time ");
					  }else {
						  fail(driver,"2 time ADD button not displayed after selecting the condition 2nd time ");
					  } 
    				  
					  mouseOverToElement(driver, AddButtonCondition);
    				  click(driver,AddButtonCondition);
    				  verifyElementDisplayed(driver, AND_ConditionSec2);
    				  verifyElementDisplayed(driver, OR_ConditionSec2);
    				  
    				  if(SecondOperator_Input_Num_LF.equals("AND")) { 
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
					  if(isDisplayed(driver,body)) {
    			  			 mouseOverToElement(driver, body);
    			  			 mouseOverToElement(driver, LocalFilterChartIcon);
    			  			 String LocalFilterIconColorRGB=getWebElement(driver, LocalFilterChartIcon).getCssValue("fill");	    					  
    			  			 String LocalFilterIconColorAct=rgbToHex1(LocalFilterIconColorRGB);
	    					  
	    					  if("#00E600".equalsIgnoreCase(LocalFilterIconColorAct)) { // need to modify.
	    						  pass(driver,"Local Filter icon changed to green color after Applying the Local Filter : with 3 conditions"); 
	    					  }else {
	    						  fail(driver,"Local Filter icon not changed to green color after Applying the Local Filter : with 3 conditions");
	    					  }
    			  			 int j=1;
		                     boolean filteredCell=true;
		                     String failedValue=" ";
			  				 List<WebElement> LocalFilterChartValue=driver.findElements(By.xpath("(//div[@ref='gridBody'])[1]//div[@col-id='"+SelectNumerical_Smoke_LocalFilter+"' and @role='gridcell']"));
    			  			 for(WebElement localEle:LocalFilterChartValue) {
    			  				 String LocalFilterCellValue=localEle.getText();
    						     boolean condition_1_Result=Numerical_ConditionFiltercell(FirstCondition_Num_LF,LocalFilterCellValue,FirstCondition_Num_Input_LF,Condition_Between_InputB_Num_LF);
    						     boolean condition_2_Result=Numerical_ConditionFiltercell(SecondCondition_Num_LF,LocalFilterCellValue,SecondCondition_Num_Input_LF,Condition_Between_InputB_Num_LF);
    						     boolean condition_3_Result=Numerical_ConditionFiltercell(ThirdCondition_num_LF,LocalFilterCellValue,ThirdCondition_Num_Input_LF,Condition_Between_InputB_Num_LF);
    						     String operator1 = FirstOperator_Input_Num_LF;
    						     String operator2 = SecondOperator_Input_Num_LF;
    			  				 
    			  				 if(!evaluateConditions(condition_1_Result,operator1,condition_2_Result,operator2,condition_3_Result)) {
    			  					 filteredCell=false;
    			  					 failedValue=failedValue+j+", ";
    			  				 }
    			  				 j++;
    			  			 }
    			  	
			  			 	if(filteredCell==true) {
			  			    	pass(driver,"For 'Selected 3 Condition' applied correctly Local Filter..");
			  			 	}else {
			  					 fail(driver,"Selected 3 Condition in Local Filter not Applied correctly for the Num column : "+SelectNumerical_Smoke_LocalFilter+", Row Nums : "+failedValue);
			  			 	}
						 
			  		 }else {
			  			  
			  			 String Failed=getText1(driver, ValidationChart);
			  			 pass(driver,"Unable to get the chart value for the selected filter, 3 condition : "+Failed);
			  		 }
					  
					  click(driver,ResetButton_LocalFilter);
					  wait(driver,"1");
					  waitForElement(driver, body);
					  mouseOverToElement(driver, LocalFilterChartIcon);
					  String LocatFilterExpected="Local Filter: OFF ";
					  String LocatFilterExpRest=getAttribute1(driver, FilterChartIcon, "title");
					  
					  if(LocatFilterExpRest.contains(LocatFilterExpected)) {
						  pass(driver,"Local filter is OFF in the chart after Reset filter");
					  }else {
						  System.out.println("Failed.!! : LocatFilterAct");
						  fail(driver,"Local filter is not OFF in the chart after Reset filter");
					  }
					   
					  String LocalFilterIconColorRGB=getWebElement(driver, LocalFilterChartIcon).getCssValue("fill");    					  
	  			 	  String LocalFilterIconColorAct=rgbToHex1(LocalFilterIconColorRGB);
    					  
	  			 	  if(!"#00E600".equalsIgnoreCase(LocalFilterIconColorAct)) { 
						  pass(driver,"Local Filter icon changed to Orginal color after Reset the Local Filter : with 3 conditions"); 
	  			 	  }else {
						  fail(driver,"Local Filter icon not changed to Original color after Reset the Local Filter : with 3 conditions");
					  }  
					  
					  
  				  }else {
					  fail(driver,"Selected Numerical Column not expanded after click on it"); 
				  }
  				  
    			}else {
    				fail(driver,SelectNumerical_Smoke_LocalFilter+" Numerical Column not present");
    			}
	    		//Numerical Local filter end....
    			
    			//Text Local filter Start....
    			 boolean textFilter=false;
	    		  try {
	    			  WebElement TextColumn= driver.findElement(By.xpath("//div[@id='dashboardLRPE_select_filterColsCon']//div[@id='"+SelectText_LocalFilter+"']//a"));
		    		  action.moveToElement(TextColumn).click().build().perform();
		    		  textFilter=true;
	    		  }catch(Exception e) {
	    			  
	    		  }
	    		  
		         if(textFilter==true) {
		    		  WebElement textColumnExp=driver.findElement(By.xpath("//div[@id='dashboardLRPE_select_filterColsCon']//div[@id='"+SelectText_LocalFilter+"']//a//i"));
		    		  String textColumnExpText=textColumnExp.getAttribute("class");
		    		  if(textColumnExpText.contains("up")) {
		    			  pass(driver,"Text Column Expand After click on it ");
		    			  if(verifyElementDisplayed(driver, byValueFilterOption)) {
		    				  try {
			    				  WebElement ByValueElementRadio=driver.findElement(By.xpath("//div[@id='"+SelectText_LocalFilter+"_content']//div[@id='byRelative_div']//input"));
			    				  if(ByValueElementRadio.isSelected()) {
			    					  pass(driver,"By default, 'By Values' radio button selected ");
			    				  }else {
			    					  fail(driver,"By default, 'By Values' radio button not selected ");
			    				  }
			    			  }catch(Exception e) {
			    				  fail(driver,"Unable to find 'By Values' radio button ");
			    				  e.printStackTrace();
			    			  }
	    				  }
		    			  
		    		  verifyElementDisplayed(driver, AllCheckbox_CategoricalSec);
  				      verifyElementDisplayed(driver, CategoricalSearchListOptions);
  				      verifyElementDisplayed(driver, ExcludeOption_Categorical);
  				      verifyElementDisplayed(driver, ExcludeCheckbox);

  				      List<WebElement> searchListAvailable=driver.findElements(By.xpath("//div[@id='"+SelectText_LocalFilter+"_FactorsList']//li"));
  				      List<WebElement> searchListCheckboxAvailable=driver.findElements(By.xpath("//div[@id='"+SelectText_LocalFilter+"_FactorsList']//li//input[@type='checkbox']"));
  				      if(searchListAvailable.size()==searchListCheckboxAvailable.size()) {
  				    	  pass(driver,"All the available searchlist are displayed with Checkbox");
  				      }else {
  				    	  fail(driver,"Some available searchlist are not displayed with Checkbox");
  				      }
  				      
  				      
		    			  WebElement SearchBar_=driver.findElement(By.xpath("//input[@id='"+SelectText_LocalFilter+"LFsearch']"));
		    			  SearchBar_.click();
		    			  wait(driver,"1");
		    			  SearchBar_.sendKeys(ByValuesInput_Text_LF);
		    			  pass(driver,"Type On Value "+ByValuesInput_Text_LF+" search input");
		    			  wait(driver,"1");
		    			  WebElement firstOption=driver.findElement(By.xpath("(//div[@id='"+SelectText_LocalFilter+"_FactorsList']//li)[1]"));
		    			  String firstOptionText=firstOption.getText();
		    			  if(firstOptionText.equals(ByValuesInput_Text_LF)) {
		    				  pass(driver,"Search bar inside the Text section works properly");
		    			  }else {
		    				  fail(driver,"Search bar inside the Text section not works properly");
		    			  }
	    			  
		    			  firstOption.click();
	    				  wait(driver,"1");
	    				  WebElement firstCheckBox=driver.findElement(By.xpath("(//div[@id='"+SelectText_LocalFilter+"_FactorsList']//li//input)[1]"));
			    		  if(firstCheckBox.isSelected()){
			    			  pass(driver,"Check box selected when click the First searched value");
			    		  }else {
			    			  fail(driver,"Check box not selected when click the First searched value");
			    		  }
			    		  
			    		  click(driver,ApplyButton_LocalFilter);
			    		  if(isDisplayed(driver,Bug_msg)) {
    						  fail(driver,"Error displayed : "+getText1(driver, Bug_msg));
    					  }
			    		  elementnotvisible1(driver, RPE_Loading);
			    		  if(isDisplayed(driver,body)) {
			    			  mouseOverToElement(driver, body);
	    					  mouseOverToElement(driver, LocalFilterChartIcon);
	    					  String LocatFilterExpected="Local Filter: ON ";
	    					  String LocatFilterAct=getAttribute1(driver, FilterChartIcon, "title");
	    					  System.out.println("LocatFilterExp : "+LocatFilterAct);
	    					  if(LocatFilterAct.contains(LocatFilterExpected)) {
	    						  System.out.println("Passed : LocatFilterAct");
	    						  pass(driver,"Local filter is ON in the chart after Apply filter");
	    					  }else {
	    						  System.out.println("Failed.!! : LocatFilterAct");
	    						  fail(driver,"Local filter is not ON in the chart after Apply filter");
	    					  }
	    					  
	    					  String LocalFilterIconColorRGB=getWebElement(driver, LocalFilterChartIcon).getCssValue("fill");	    					  
	    					  String LocalFilterIconColorAct=rgbToHex1(LocalFilterIconColorRGB);
	    					  
	    					  if("#00E600".equalsIgnoreCase(LocalFilterIconColorAct)) { // need to modify.
	    						  pass(driver,"Local Filter icon changed to green color after Applying the Local Filter"); 
	    					  }else {
	    						  fail(driver,"Local Filter icon not changed to green color after Applying the Local Filter");
	    					  }
	    					  
	    					  int j=1;
		    		          boolean filteredCell=true;
		    		          String failedValue=" ";
	    					  List<WebElement> LocalFilterChartValue=driver.findElements(By.xpath("(//div[@ref='gridBody'])[1]//div[@col-id='"+SelectText_LocalFilter+"' and @role='gridcell']"));
	    					  for(WebElement localEle:LocalFilterChartValue) {
	    						  String LocalFilterCellValue=localEle.getText();
	    						  
	    						  if(!LocalFilterCellValue.equals(ByValuesInput_Text_LF)) {
	    							  filteredCell=false;
	    							  failedValue=failedValue+j+", ";
	    						  }
	    						  j++;
	    					  }
		    		          if(filteredCell==true) {
		  			    	       pass(driver,"For 'By Values' condition applied correctly Local Filter..");
		  			          }else {
    							  fail(driver,"By Value Local Filter not Applied correctly for the Text column : "+SelectText_LocalFilter+", Rows : "+failedValue);
		  			          }
	    					  
  					  }else {
		    		           String Failed=" ";
		    		           if(isDisplayed2(driver,ValidationChart)) {
		    		        	   Failed=getText1(driver, ValidationChart);
		    		           }
  						     pass(driver,"Unable to get the chart value for the selected filter, By Values : "+Failed);
  					  }
  					 
		    		  click(driver,ExcludeCheckbox);
		    		  click(driver,ApplyButton_LocalFilter);
		    		  if(isDisplayed(driver,Bug_msg)) {
						  fail(driver,"Error displayed : "+getText1(driver, Bug_msg));
					  }
		    		  elementnotvisible1(driver, RPE_Loading);
  					  if(isDisplayed(driver,body)) {
  						  mouseOverToElement(driver, body);
		    		          mouseOverToElement(driver, LocalFilterChartIcon);
		    		          String LocalFilterIconColorRGB=getWebElement(driver, LocalFilterChartIcon).getCssValue("fill");	    					  
	    					  String LocalFilterIconColorAct=rgbToHex1(LocalFilterIconColorRGB);
	    					  
	    					  if("#00E600".equalsIgnoreCase(LocalFilterIconColorAct)) { // need to modify.
	    						  pass(driver,"Local Filter icon changed to green color after Applying the Local Filter"); 
	    					  }else {
	    						  fail(driver,"Local Filter icon not changed to green color after Applying the Local Filter");
	    					  }
  						  int j=1;
		    		          boolean filteredCell=true;
		    		          String failedValue=" ";
  						      List<WebElement> LocalFilterChartValue=driver.findElements(By.xpath("(//div[@ref='gridBody'])[1]//div[@col-id='"+SelectText_LocalFilter+"' and @role='gridcell']"));
	    					  for(WebElement localEle:LocalFilterChartValue) {
	    						  String LocalFilterCellValue=localEle.getText();
	    						  
	    						  if(LocalFilterCellValue.equals(ByValuesInput_Text_LF)) {
	    							   filteredCell=false;
	    							   failedValue=failedValue+j+", ";
	    						  }
	    						  j++;
	    					  }
  						  
				    		  if(filteredCell==true) {
				  			    	pass(driver,"For 'By Values 'Exclude' ' condition applied correctly..");
				  			    }else {
	    							fail(driver,"By Value Local 'Exclude' Filter not Applied correctly for the Text column : "+SelectText_LocalFilter+", Rows : "+failedValue);
				  			    }
  						  
  					  }else {
  						  String Failed=getText1(driver, ValidationChart);
  						  pass(driver,"Unable to get the chart value for the selected filter 'By Value Exclude' , error : "+Failed);
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
			    						  fail(driver,conditionsList[k]+" Error displayed : "+getText1(driver, Bug_msg));
			    					  }
			    			  		 elementnotvisible1(driver, RPE_Loading);
			    			  		 if(isDisplayed(driver,body)) {
			    			  			 mouseOverToElement(driver, body);
	    		  							 mouseOverToElement(driver, LocalFilterChartIcon);
	    		  							 String LocalFilterIconColorRGB=getWebElement(driver, LocalFilterChartIcon).getCssValue("fill");											  
	    		  							 String LocalFilterIconColorAct=rgbToHex1(LocalFilterIconColorRGB);
    		  							 	 if("#00E600".equalsIgnoreCase(LocalFilterIconColorAct)) { // need to modify.
												  pass(driver,"Local Filter icon changed to green color after Applying the Local Filter : "+conditionsList[k]); 
    		  							 	 }else {
												  fail(driver,"Local Filter icon not changed to green color after Applying the Local Filter : "+conditionsList[k]);
    		  							 	 }
	    		  
			    			  			 int j=1;
    		                             boolean filteredCell=true;
    		                             String failedValue=" ";
			    			  			 List<WebElement> LocalFilterChartValue=driver.findElements(By.xpath("(//div[@ref='gridBody'])[1]//div[@col-id='"+SelectText_LocalFilter+"' and @role='gridcell']"));
			    			  			 for(WebElement localEle:LocalFilterChartValue) {
			    			  				 String LocalFilterCellValue=localEle.getText();
			    			  				 if(!Categorical_ConditionFiltercell(conditionsList[k],LocalFilterCellValue,conditionsInputList[k])) {
			    			  					 filteredCell=false;
			    			  					 failedValue=failedValue+j+", ";
			    			  				 }
			    			  				 j++;
			    			  			 }
								    		  if(filteredCell==true) {
								  			    	pass(driver,"For '"+conditionsList[k]+"' condition applied correctly..");
								  			    }else {
				    			  					 fail(driver,conditionsList[k]+" Condition in Local Filter not Applied correctly for the Text column : "+SelectText_LocalFilter+", Rows : "+failedValue);
								  			    }
    		    						 
			    			  		 }else {
			    			  			 String Failed=getText1(driver, ValidationChart);
			    			  			 pass(driver,"Unable to get the chart value for the selected filter : "+conditionsList[k]+" , error display : "+Failed);
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
			    				  
		    				  mouseOverToElement(driver, AddButtonCondition);
		    				  click(driver,AddButtonCondition);
		    				  verifyElementDisplayed(driver, AND_ConditionSec1);
		    				  verifyElementDisplayed(driver, OR_ConditionSec1);
		    				 
		    				  if(FirstOperator_Input_Text_LF.equals("AND")) { 
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
			    				  
		    				  mouseOverToElement(driver, AddButtonCondition);
		    				  click(driver,AddButtonCondition);
		    				  verifyElementDisplayed(driver, AND_ConditionSec2); verifyElementDisplayed(driver, OR_ConditionSec2);
		    				  
		    				  if(SecondOperator_Input_Text_LF.equals("AND")) { 
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
	    					  if(isDisplayed(driver,body)) {
		    			  			 mouseOverToElement(driver, body);
		    			  			 int j=1;
	    		                     boolean filteredCell=true;
	    		                     String failedValue=" ";
		    			  			 List<WebElement> LocalFilterChartValue=driver.findElements(By.xpath("(//div[@ref='gridBody'])[1]//div[@col-id='"+SelectText_LocalFilter+"' and @role='gridcell']"));
		    			  			 for(WebElement localEle:LocalFilterChartValue) {
		    			  				 String LocalFilterCellValue=localEle.getText();
		    						     boolean condition_1_Result=Categorical_ConditionFiltercell(FirstCondition_Text_LF,LocalFilterCellValue,FirstCondition_Input_Text_LF);
		    						     boolean condition_2_Result=Categorical_ConditionFiltercell(SecondCondition_Text_LF,LocalFilterCellValue,SecondCondition_Input_Text_LF);
		    						     boolean condition_3_Result=Categorical_ConditionFiltercell(ThirdCondition_Text_LF,LocalFilterCellValue,ThirdCondition_Input_Text_LF);
		    						     String operator1 = FirstOperator_Input_Text_LF; 
		    						     String operator2 = SecondOperator_Input_Text_LF;
		    			  				 
		    			  				 if(!evaluateConditions(condition_1_Result,operator1,condition_2_Result,operator2,condition_3_Result)) {
		    			  					 filteredCell=false;
		    			  					 failedValue=failedValue+j+", ";
		    			  				 }
		    			  				 j++;
		    			  			 }
						    		  if(filteredCell==true) {
						  			    	pass(driver,"For 'Selected 3 Condition' applied correctly..");
						  			    }else {
		    			  					 fail(driver,"Selected 3 Condition in Local Filter not Applied correctly for the Text column : "+SelectText_LocalFilter+", Rows : "+failedValue);
						  			    }
//	    						 
	    			  		 }else {
	    			  			 String Failed=getText1(driver, ValidationChart);
	    			  			 pass(driver,"Unable to get the chart value for the selected filter, 3 condition : "+Failed);
	    			  		 }
	    					  
	    					  click(driver,ResetButton_LocalFilter);
	    					  elementnotvisible1(driver, RPE_Loading);
	    					  waitForElement(driver, body);
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
		    					  
	    					  try {
		    						String LocalFilterIconColorAct=rgbToHex1(LocalFilterIconColorRGB);
			    					System.out.println("LocalFilterIconColorAct : "+LocalFilterIconColorAct);
			    					  
			    					  if(!"#00E600".equalsIgnoreCase(LocalFilterIconColorAct)) { // need to modify.
			    						  pass(driver,"Local Filter icon changed to Original color after Reset the Local Filter"); 
			    					  }else {
			    						  fail(driver,"Local Filter icon not changed to Original color after Reset the Local Filter");
			    					  }
	    					  } catch (Exception e) {
									// TODO Auto-generated catch block
									System.out.println("LocalFilterIconColorAct : Failed");
	    					  }
			    		  
			    	      }
  					    }
  				    		
  					  }else {
  						  fail(driver, SelectText_LocalFilter+" Text Column not Expand After click on it ");
  		    		  }	
  					  
	    		  }else {
	    			  fail(driver,SelectText_LocalFilter+" Text Column value not present in local filter");
	    		  }		  
    			  
		       //Text Local filter End....
		         
	    	  }else {
	    		  fail(driver,"Local Filter section is not displayed when click the filter chart icon");
	    	  }
	    	  //************************ Local Filter Validation End......................
	   }else {
		   System.out.println("User don't want to execute the Local Filter");
	   }
	      
	   String GlobalTab2TabId=getAttribute(driver, CurrentTab, "id");
	  // ************************** Global Filter Validation Start......................
		
		 String Table_GlobalFilter= getCellValue("TestExecution","Testcase_Selection","Table_GlobalFilter",Flag);
	     if(Table_GlobalFilter.contains("Yes")) { 
		      
	    	 mouseOverToElement(driver, ADDTabPlus);
	    	  mouseOverAndClick(driver, ADDTabPlus);
	    	  wait(driver,"1");
	    	  sendKeys(driver,newlyAddedTab,TabNameNew_Global_Smoke_);
	    	  click(driver,DashProPage);
	    	  wait(driver,"1");
	    	  waitForElement(driver, ADD_widget_rightTop);
	    	  mouseOverToElement(driver, ADD_widget_rightTop);
	    	  click(driver,ADD_widget_rightTop);
			  elementnotvisible(driver,Loading);
			  waitForElement(driver,Table_widget);
			  click(driver,Table_widget);
			  elementnotvisible(driver, Loading1);
			  waitForElement(driver,SelectAllToggleInput);
			  click(driver,SelectAllToggleInput);
			  if(isToggleEnable(driver, SelectAllToogle)) {
		       		pass(driver,"Select All toggle enabled after clicking it");
		      }else {
		       		fail(driver,"Select All toggle not enabled after clicking on it");
		      }
			  wait(driver,"1");
			  click(driver,ApplyButton);
			  elementnotvisible1(driver, RPE_Loading);
			  click(driver,ChartTitleInput);
		      sendKeys(driver,ChartTitleInput,ChartNameGlobal_Smoke);
		    	
		      click(driver,SaveBtn_Chart);
		      elementnotvisible(driver,RPE_Loading);
		      if(!isDisplayed2(driver,chartSaveError1) && isDisplayed(driver,SavedChartTitleInput)) {
		    	  pass(driver,"Chart saved Successfully");
		      }else {
		    	  fail(driver,"Chart not saved Successfully");
		      }
		      
		      GlobalTab2TabId=getAttribute(driver, CurrentTab, "id");
	    	 
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
    			  
    		
       			//categorical Dynamic change Start global... 
    			  boolean categoricalFilter=false;
	    		  try {
	    			  WebElement CategoricalColumn= driver.findElement(By.xpath("//div[@id='globalRPE_select_filterColsCon']//div[@id='"+SelectCategorical_GlobalFilter+"']//a"));
		    		  action.moveToElement(CategoricalColumn).click().build().perform();
		    		  categoricalFilter=true;
	    		  }catch(Exception e) {
	    			  
	    		  }
    			  
	    		  if(categoricalFilter==true) {
		    		  WebElement CategoricalColumnExp=driver.findElement(By.xpath("//div[@id='globalRPE_select_filterColsCon']//div[@id='"+SelectCategorical_GlobalFilter+"']//a//i"));
		    		  String CategoricalColumnExpText=CategoricalColumnExp.getAttribute("class");
		    		  if(CategoricalColumnExpText.contains("up")) {
		    			  pass(driver,"Categorical Column Expand After click on it ");
		    			  if(verifyElementDisplayed(driver, byValueFilterOption)) {
		    				  try {
			    				  WebElement ByValueElementRadio=driver.findElement(By.xpath("//div[@id='"+SelectCategorical_GlobalFilter+"_content']//div[@id='byRelative_div']//input"));
			    				  if(ByValueElementRadio.isSelected()) {
			    					  pass(driver,"By default, 'By Values' radio button selected ");
			    				  }else {
			    					  fail(driver,"By default, 'By Values' radio button not selected ");
			    				  }
			    			  }catch(Exception e) {
			    				  fail(driver,"Unable to find 'By Values' radio button ");
			    				  e.printStackTrace();
			    			  }
	    				  }
		    			  
		    			  verifyElementDisplayed(driver, AllCheckbox_CategoricalSec);
    				      verifyElementDisplayed(driver, CategoricalSearchListOptions);
    				      verifyElementDisplayed(driver, ExcludeOption_Categorical);
    				      verifyElementDisplayed(driver, ExcludeCheckbox);

    				      List<WebElement> searchListAvailable=driver.findElements(By.xpath("//div[@id='"+SelectCategorical_GlobalFilter+"_FactorsList']//li"));
    				      List<WebElement> searchListCheckboxAvailable=driver.findElements(By.xpath("//div[@id='"+SelectCategorical_GlobalFilter+"_FactorsList']//li//input[@type='checkbox']"));
    				      if(searchListAvailable.size()==searchListCheckboxAvailable.size()) {
    				    	  pass(driver,"All the available searchlist are displayed with Checkbox");
    				      }else {
    				    	  fail(driver,"Some available searchlist are not displayed with Checkbox");
    				      }
    				      
    				      
		    			  WebElement SearchBar_=driver.findElement(By.xpath("//input[@id='"+SelectCategorical_GlobalFilter+"LFsearch']"));
		    			  SearchBar_.click();
		    			  wait(driver,"1");
		    			  SearchBar_.sendKeys(ByValuesInput_Categorical_GF);
		    			  pass(driver,"Type On Value "+ByValuesInput_Categorical_GF+" search input");
		    			  wait(driver,"1");
		    			  WebElement firstOption=driver.findElement(By.xpath("(//div[@id='"+SelectCategorical_GlobalFilter+"_FactorsList']//li)[1]"));
		    			  String firstOptionText=firstOption.getText();
		    			  if(firstOptionText.equals(ByValuesInput_Categorical_GF)) {
		    				  pass(driver,"Search bar inside the Categorical section works properly");
		    			  }else {
		    				  fail(driver,"Search bar inside the Categorical section not works properly");
		    			  }
	    			  
		    			  firstOption.click();
	    				  wait(driver,"1");
	    				  WebElement firstCheckBox=driver.findElement(By.xpath("(//div[@id='"+SelectCategorical_GlobalFilter+"_FactorsList']//li//input)[1]"));
			    		  if(firstCheckBox.isSelected()){
			    			  pass(driver,"Check box selected when click the First searched value");
			    		  }else {
			    			  fail(driver,"Check box not selected when click the First searched value");
			    		  }
			    		  
			    		  click(driver,ApplyButton_GlobalFilter);
			    		  elementnotvisible1(driver, RPE_Loading);
    					  
    					  boolean chartpresentGlobal2=false;
    					  try {
    						  WebElement chartPresent=driver.findElement(By.xpath("//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody']"));
    						  if(chartPresent.isDisplayed()) {
    							  chartpresentGlobal2=true;
    						  }
    						  
    					  }catch(Exception e) {
    						  
    					  }
    					  
    					  if(chartpresentGlobal2) {
    						  WebElement chartPresent=driver.findElement(By.xpath("//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody']"));
    						  action.moveToElement(chartPresent).build().perform();
    						  try {
    							  WebElement globalFilterIconChartTab3=driver.findElement(By.xpath("//div[contains(@id,'"+GlobalTab2TabId+"')]//*[name()='svg']//*[name()='g'][2]//*[name()='path'][3]"));
    							  action.moveToElement(globalFilterIconChartTab3).build().perform();
    							  String globalIconColorRGB=globalFilterIconChartTab3.getCssValue("fill");
    							  String globalIconColor=rgbToHex1(globalIconColorRGB);
    							  
    							  if("#FF3333".equalsIgnoreCase(globalIconColor)) {
    								  pass(driver,"Global Filter icon changed to Red color after Applying the Global Filter"); 
    							  }else {
    								  fail(driver,"Global Filter icon not changed to Red color after Applying the Global Filter"); 
    							  }
    							  
    						  }catch(Exception e) {
    							  fail(driver,"unable to find the globalfilter icon in the chart result");
    						  }
    						  
    						  // old script if need uncommand
	    					  int j=1;
		    		          boolean filteredCellGlobalTab2=true;
		    		          String failedCell_Categorical_GF=" ";
	    					  List<WebElement> FilterChartValue=driver.findElements(By.xpath("//div[contains(@id,'"+GlobalTab2TabId+"')]//div[@ref='gridBody']//div[@col-id='"+SelectCategorical_GlobalFilter+"' and @role='gridcell']"));
	    					  
	    					  for(WebElement localEle:FilterChartValue) {
	    						  String LocalFilterCellValue=localEle.getText();
	    						  
	    						  if(!LocalFilterCellValue.equals(ByValuesInput_Categorical_GF)) {
	    							  filteredCellGlobalTab2=false;
	    							  failedCell_Categorical_GF=failedCell_Categorical_GF+j+", ";
	    						  }
	    						  j++;
	    					  }
	    					  
		    		          if(filteredCellGlobalTab2==true) {
		  			    	       pass(driver,"For 'By Values' condition applied correctly in the GlobalTab2 charts..");
		  			          }else {
    							  fail(driver,"By Value Global Filter not Applied correctly in the GlobalTab2 for the Categorical column : "+SelectCategorical_GlobalFilter+", Rows : "+failedCell_Categorical_GF);
		  			          }
		    		          
    						// old script if need uncommand
	    					  
    					  }else {
    						  String Failed=getText1(driver, ValidationChart);
    						  fail(driver,"Unable to get the chart value in GlobalTab2 for the selected filter By Value : "+Failed);
    					  }
    					 
    					  
    					  //First tab chart cell validation in global filter
    					  //moving to firstTab and click  (1)
    					 boolean chartpresentGlobal1=clickFirstTab(driver,GlobalTab1Id);
	   					  //moving to firstTab and click
	   					  elementnotvisible(driver, Loading1);
   					  	if(chartpresentGlobal1) {
	   						  
		   						try {
		   							  wait(driver,"1");
		   							  WebElement globalFilterIconChartTab1=driver.findElement(By.xpath("//div[contains(@id,'"+GlobalTab1Id+"')]//*[name()='svg']//*[name()='g'][2]//*[name()='path'][3]"));
		   							  action.moveToElement(globalFilterIconChartTab1).build().perform();
		   							  String globalIconColorRGB=globalFilterIconChartTab1.getCssValue("fill");
		   							  String globalIconColor=rgbToHex1(globalIconColorRGB);
		   							  
		   							  if("#FF3333".equalsIgnoreCase(globalIconColor)) {
		   								  pass(driver,"Global Filter icon changed to Red color after Applying the Global Filter"); 
		   							  }else {
		   								  fail(driver,"Global Filter icon not changed to Red color after Applying the Global Filter"); 
		   							  }
		   							  
		   						  }catch(Exception e) {
		   							  fail(driver,"unable to find the globalfilter icon in the chart result");
		   							  e.printStackTrace();
		   						  }
	   						  
			   						int j=1;
			    		            boolean filteredCellGlobalTab1=true;
			    		            String failedCell_Categorical_GF=" ";
			    		            List<WebElement> FilterChartValue=driver.findElements(By.xpath("//div[contains(@id,'"+GlobalTab1Id+"')]//div[@ref='gridBody']//div[@col-id='"+SelectCategorical_GlobalFilter+"' and @role='gridcell']"));
			    		            for(WebElement localEle:FilterChartValue) {
			    		            	String FilterCellValue=localEle.getText();
		    						  
			    		            	if(!FilterCellValue.equals(ByValuesInput_Categorical_GF)) {
			    		            		filteredCellGlobalTab1=false;
			    		            		failedCell_Categorical_GF=failedCell_Categorical_GF+j+", ";
			    		            	}
			    		            	j++;
			    		            }
			    		            
			    		            if(filteredCellGlobalTab1==true) {
			    		            	pass(driver,"For 'By Values' condition applied correctly in the GlobalTab1 charts..");
			  			          	}else {
		    		            		fail(driver,"By Value Global Filter not Applied correctly in the GlobalTab1 for the Categorical column : "+SelectCategorical_GlobalFilter+", Rows : "+failedCell_Categorical_GF);
			  			          	}
	   						
	   						  
	   					   	}else {
	   					   	   String Failed=getText1(driver, ValidationChart);
	   						   fail(driver,"Unable to get the chart value in GlobalTab1 for the selected filter : "+Failed);
	   					    }
	   						  
	   					 //after checking the first tab then switch back to global filtered tab
	   					 clickSecondTab(driver,GlobalTab2TabId);
	   				     //after checking the first tab then switch back to global filtered tab
	   					 waitForElement(driver,ExcludeCheckbox);
	   					 click(driver,ExcludeCheckbox);
	   					 click(driver,ApplyButton_GlobalFilter);
	   					 elementnotvisible1(driver, RPE_Loading);
					     chartpresentGlobal2=false;
			   			 try {
			   				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
					   		WebElement chartPresent=driver.findElement(By.xpath("//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody']"));
					   		if(chartPresent.isDisplayed()) {
					   			chartpresentGlobal2=true;
					   		}
					   		
					   	 }catch(Exception e) {
						   e.printStackTrace();
					   	 }
					  
					   	 if(chartpresentGlobal2) {
						   		 WebElement chartPresent=driver.findElement(By.xpath("//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody']"));
						   		 action.moveToElement(chartPresent).build().perform();
							     try {
							     	WebElement globalFilterIconChartTab3=driver.findElement(By.xpath("//div[contains(@id,'"+GlobalTab2TabId+"')]//*[name()='svg']//*[name()='g'][2]//*[name()='path'][3]"));
							    	action.moveToElement(globalFilterIconChartTab3).build().perform();
							    	String globalIconColorRGB=globalFilterIconChartTab3.getCssValue("fill");
							    	String globalIconColor=rgbToHex1(globalIconColorRGB);
								  
							    	if("#FF3333".equalsIgnoreCase(globalIconColor)) {
							    		pass(driver,"Global Filter icon changed to Red color after Applying the Global Filter"); 
							    	}else {
							    		fail(driver,"Global Filter icon not changed to Red color after Applying the Global Filter"); 
							    	}
								  
							     }catch(Exception e) {
							    	fail(driver,"unable to find the globalfilter icon in the chart result");
							     }
							  
	    					  
							     int j=1;
							     boolean filteredCellGlobalTab2=true;
							     String failedCell_Categorical_GF=" ";
							     List<WebElement> FilterChartValue=driver.findElements(By.xpath("//div[contains(@id,'"+GlobalTab2TabId+"')]//div[@ref='gridBody']//div[@col-id='"+SelectCategorical_GlobalFilter+"' and @role='gridcell']"));
							     for(WebElement localEle:FilterChartValue) {
							    	 String FilterCellValue=localEle.getText();
	    						  
							    	 if(FilterCellValue.equals(ByValuesInput_Categorical_GF)) {
							    		 filteredCellGlobalTab2=false;
							    		 failedCell_Categorical_GF=failedCell_Categorical_GF+j+", ";
							    	 }
	    						   j++;
							     }
							     
							     if(filteredCellGlobalTab2==true) {
		  			    	       	  pass(driver,"For 'By Values' with 'Exclude' condition in Global Filter applied correctly in the GlobalTab2 charts..");
	  			          		  }else {
	    							  fail(driver,"By Value with 'Exclude' Global Filter not Applied correctly in the GlobalTab2 for the Categorical column : "+SelectCategorical_GlobalFilter+", Rows : "+failedCell_Categorical_GF); 
	  			          		  }
    					  
					   	 	}else {
					   	 		String Failed=getText1(driver, ValidationChart);
					   	 		fail(driver,"Unable to get the chart value in GlobalTab2 for the selected filter, "+Failed);
					   	 	}
					   	 
					     //moving to firstTab and click  (1)
    					  chartpresentGlobal1=clickFirstTab(driver,GlobalTab1Id);
	   					  //moving to firstTab and click

   					  	if(chartpresentGlobal1) {
   						  
   					  		int j=1;
   					  		boolean filteredCellGlobalTab1=true;
   					  		String failedCell_Categorical_GF=" ";
   					  		List<WebElement> FilterChartValue=driver.findElements(By.xpath("//div[contains(@id,'"+GlobalTab1Id+"')]//div[@ref='gridBody']//div[@col-id='"+SelectCategorical_GlobalFilter+"' and @role='gridcell']"));
   					  		for(WebElement localEle:FilterChartValue) {
   					  			String FilterCellValue=localEle.getText();
						  
   					  			if(FilterCellValue.equals(ByValuesInput_Categorical_GF)) {
   					  				filteredCellGlobalTab1=false;
   					  				failedCell_Categorical_GF=failedCell_Categorical_GF+j+", ";
   					  			}
   					  			
   					  			j++;
   					  		}
   					  		
   					  		if(filteredCellGlobalTab1==true) {
   					  			pass(driver,"For 'By Values' with 'Exclude' condition Global Filter applied correctly in the GlobalTab1 charts..");
   					  		}else {
				  				fail(driver,"By Value with 'Exclude' Global Filter not Applied correctly in the GlobalTab1 for the Categorical column : "+SelectCategorical_GlobalFilter+", Rows : "+failedCell_Categorical_GF);
   					  		}
   						
   						  
   					  	}else {
   					  		String Failed=getText1(driver, ValidationChart);
   					  		fail(driver,"Unable to get the chart value in GlobalTab1 for the selected filter, "+Failed);
   					  	}
					   	    
   					  	//after checking the first tab then switch back to global filtered tab
	   					 clickSecondTab(driver,GlobalTab2TabId);
	   				     //after checking the first tab then switch back to global filtered tab

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
    				    		 
				    			  String[] conditionsList= {FirstCondition_1_Categorical_GF,FirstCondition_2_Categorical_GF,FirstCondition_3_Categorical_GF,FirstCondition_4_Categorical_GF,FirstCondition_5_Categorical_GF,FirstCondition_6_Categorical_GF,FirstCondition_7_Categorical_GF,FirstCondition_8_Categorical_GF};
				    			  String[] conditionsInputList= {FirstCondition_Input_1_Categorical_GF,FirstCondition_Input_2_Categorical_GF,FirstCondition_Input_3_Categorical_GF,FirstCondition_Input_4_Categorical_GF,FirstCondition_Input_5_Categorical_GF,FirstCondition_Input_6_Categorical_GF,FirstCondition_Input_7_Categorical_GF,FirstCondition_Input_8_Categorical_GF};

    				    			 
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
		    			  		 	   elementnotvisible1(driver, RPE_Loading);
			    			  		   chartpresentGlobal2=false;
			    			  		   try {
			    			  			   WebElement chartPresent=driver.findElement(By.xpath("//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody']"));
			    			  			   if(chartPresent.isDisplayed()) {
			    			  				 chartpresentGlobal2=true;
			    			  			   }
			    			  			   
			    			  		   }catch(Exception e) {
			    			  			   e.printStackTrace();
			    			  		   }	
								  
								   	if(chartpresentGlobal2) {
								   		WebElement chartPresent=driver.findElement(By.xpath("//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody']"));
								   		action.moveToElement(chartPresent).build().perform();
			    					    
									    int j=1;
									    boolean filteredCellGlobalTab2=true;
									    String failedCell_Categorical_GF=" ";
									    List<WebElement> FilterChartValue=driver.findElements(By.xpath("//div[contains(@id,'"+GlobalTab2TabId+"')]//div[@ref='gridBody']//div[@col-id='"+SelectCategorical_GlobalFilter+"' and @role='gridcell']"));
									    for(WebElement localEle:FilterChartValue) {
									    	String FilterCellValue=localEle.getText();
			    						    
									    	if(!Categorical_ConditionFiltercell(conditionsList[k],FilterCellValue,conditionsInputList[k])) {
									    		filteredCellGlobalTab2=false;
									    		failedCell_Categorical_GF=failedCell_Categorical_GF+j+", ";
									    	}
							
			    						  j++;
									    }
									    
									    if(filteredCellGlobalTab2==true) {
									    	pass(driver,"For '"+conditionsList[k]+"' condition applied correctly in the GlobalTab2 charts..");
									    }else {
							  				fail(driver,"For '"+conditionsList[k]+"' Global Filter not Applied correctly in the GlobalTab2 for the Categorical column : "+SelectCategorical_GlobalFilter+", Rows : "+failedCell_Categorical_GF);
									    }
									   
			    					  
								   	}else {
								   		String Failed=getText1(driver, ValidationChart);
								   		fail(driver,"Unable to get the chart value in GlobalTab2 for the selected filter, "+conditionsList[k]+" "+Failed);
								   	}
			    			  		 
								    //moving to firstTab and click  (1)
			    				    chartpresentGlobal1=clickFirstTab(driver,GlobalTab1Id);
				   					//moving to firstTab and click
				   					  
			   					  	if(chartpresentGlobal1) {
					   						int j=1;
					    		            boolean filteredCellGlobalTab1=true;
					    		            String failedCell_Categorical_GF=" ";
					    		            List<WebElement> FilterChartValue=driver.findElements(By.xpath("//div[contains(@id,'"+GlobalTab1Id+"')]//div[@ref='gridBody']//div[@col-id='"+SelectCategorical_GlobalFilter+"' and @role='gridcell']"));
					    		            for(WebElement localEle:FilterChartValue) {
					    		            	String FilterCellValue=localEle.getText();
				    						  
					    		            	if(!Categorical_ConditionFiltercell(conditionsList[k],FilterCellValue,conditionsInputList[k])) {
					    		            		filteredCellGlobalTab1=false;
										    		failedCell_Categorical_GF=failedCell_Categorical_GF+j+", ";
										    	}
					    		            	j++;
					    		            }
					    		            
					    		            if(filteredCellGlobalTab1==true) {
										    	pass(driver,"For '"+conditionsList[k]+"' condition applied correctly in the GlobalTab1 charts..");
					  			          	}else {
								  				fail(driver,"For '"+conditionsList[k]+"' Global Filter not Applied correctly in the GlobalTab1 for the Categorical column : "+SelectCategorical_GlobalFilter+", Rows : "+failedCell_Categorical_GF);
					  			          	}
				   						
				   						  
				   					   	}else {
				   					   	   String Failed=getText1(driver, ValidationChart);
				   						   fail(driver,"Unable to get the chart value in GlobalTab1 for the selected filter, "+conditionsList[k]+" "+Failed);
				   					    }
			    			  		 
				   					    //after checking the first tab then switch back to global filtered tab
					   					 clickSecondTab(driver,GlobalTab2TabId);
					   				     //after checking the first tab then switch back to global filtered tab
    				    			  	
				    				 }catch(Exception e) {
				    					 e.printStackTrace();
				    				 }
				    			 }
			    			 
			    			      waitForElement(driver, ConditionSelectDropdown);
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
				    				  
			    				  mouseOverToElement(driver, AddButtonCondition);
			    				  click(driver,AddButtonCondition);
			    				  
			    				  verifyElementDisplayed(driver, AND_ConditionSec1);
			    				  verifyElementDisplayed(driver, OR_ConditionSec1);
			    				 
			    				  if(FirstOperator_Input_Categorical_GF.equals("AND")) { 
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
				    				  pass(driver,"2nd time ADD button displayed after selecting the condition 2nd time ");
		    					  }else {
		    						  fail(driver,"2nd time ADD button not displayed after selecting the condition 2nd time ");
		    					  } 
				    				  
			    				  mouseOverToElement(driver, AddButtonCondition);
			    				  click(driver,AddButtonCondition);
			    				  verifyElementDisplayed(driver, AND_ConditionSec2);
			    				  verifyElementDisplayed(driver, OR_ConditionSec2);
			    				  
			    				  if(SecondOperator_Input_Categorical_GF.equals("AND")) { 
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
		    					  elementnotvisible1(driver, RPE_Loading);
		    					  chartpresentGlobal2=false;
		    			  		   try {
		    			  			   WebElement chartPresent=driver.findElement(By.xpath("//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody']"));
		    			  			   if(chartPresent.isDisplayed()) {
		    			  				 chartpresentGlobal2=true;
		    			  			   }
		    			  			   
		    			  		   }catch(Exception e) {
		    			  			   e.printStackTrace();
		    			  		   }	
							  
							   	  if(chartpresentGlobal2) {
							   		  WebElement chartPresent=driver.findElement(By.xpath("//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody']"));
							   		  action.moveToElement(chartPresent).build().perform();
		    					    
							   		  int j=1;
							   		  boolean filteredCellGlobalTab2=true;
							   		  String failedCell_Categorical_GF=" ";
							   		  List<WebElement> FilterChartValue=driver.findElements(By.xpath("//div[contains(@id,'"+GlobalTab2TabId+"')]//div[@ref='gridBody']//div[@col-id='"+SelectCategorical_GlobalFilter+"' and @role='gridcell']"));
							   		  for(WebElement localEle:FilterChartValue) {
							   			  String FilterCellValue=localEle.getText();
							   			  
							   			  boolean condition_1_Result=Categorical_ConditionFiltercell(FirstCondition_Categorical_GF,FilterCellValue,FirstCondition_Input_Categorical_GF);
							   			  boolean condition_2_Result=Categorical_ConditionFiltercell(SecondCondition_Categorical_GF,FilterCellValue,SecondCondition_Input_Categorical_GF);
							   			  boolean condition_3_Result=Categorical_ConditionFiltercell(ThirdCondition_Categorical_GF,FilterCellValue,ThirdCondition_Input_Categorical_GF);
							   			  String operator1 = FirstOperator_Input_Categorical_GF; 
							   			  String operator2 = SecondOperator_Input_Categorical_GF;
							   
							   			  System.out.println("condition_3_Result : "+condition_3_Result);

							   			  System.out.println(condition_1_Result+" "+operator1+" "+condition_2_Result+" "+operator2+" "+condition_3_Result);

							   			  if(!evaluateConditions(condition_1_Result,operator1,condition_2_Result,operator2,condition_3_Result)) {
							   				filteredCellGlobalTab2=false;
							   				failedCell_Categorical_GF=failedCell_Categorical_GF+j+", ";
							   			  }
							   			  j++;
							   		  }
						   			  

							   		  
							   		  if(filteredCellGlobalTab2==true) {
							   			  pass(driver,"For selected 3 condition Global Filter Applied correctly in the GlobalTab2 charts..");
							   		  }else {
							   			  fail(driver,"For selected 3 condition Global Filter not Applied correctly in the GlobalTab2 for the Categorical column : "+SelectCategorical_GlobalFilter+", Rows : "+failedCell_Categorical_GF);
							   		  }
								   
		    					  
							   	 }else {
							   		 String Failed=getText1(driver, ValidationChart);
							   		 fail(driver,"Unable to get the chart value in GlobalTab2 for the selected filter for 3 conditions, "+Failed);
						   	 	 }
		    					  
						   	//moving to firstTab and click 
	    				    chartpresentGlobal1=clickFirstTab(driver,GlobalTab1Id);
		   					//moving to firstTab and click
		   					  
	   					  	if(chartpresentGlobal1) {
			   						int j=1;
			    		            boolean filteredCellGlobalTab1=true;
			    		            String failedCell_Categorical_GF=" ";
			    		            List<WebElement> FilterChartValue=driver.findElements(By.xpath("//div[contains(@id,'"+GlobalTab1Id+"')]//div[@ref='gridBody']//div[@col-id='"+SelectCategorical_GlobalFilter+"' and @role='gridcell']"));
			    		            for(WebElement localEle:FilterChartValue) {
			    		            	String FilterCellValue=localEle.getText();
		    						  
			    		            	boolean condition_1_Result=Categorical_ConditionFiltercell(FirstCondition_Categorical_GF,FilterCellValue,FirstCondition_Input_Categorical_GF);
						   			  	boolean condition_2_Result=Categorical_ConditionFiltercell(SecondCondition_Categorical_GF,FilterCellValue,SecondCondition_Input_Categorical_GF);
						   			  	boolean condition_3_Result=Categorical_ConditionFiltercell(ThirdCondition_Categorical_GF,FilterCellValue,ThirdCondition_Input_Categorical_GF);
						   			  	String operator1 = FirstOperator_Input_Categorical_GF; 
						   			  	String operator2 = SecondOperator_Input_Categorical_GF;
		    			  				 
						   			  	if(!evaluateConditions(condition_1_Result,operator1,condition_2_Result,operator2,condition_3_Result)) {
						   			  		filteredCellGlobalTab1=false;
							   				failedCell_Categorical_GF=failedCell_Categorical_GF+j+", ";
						   			  	}
			    		            	j++;
			    		            }
			    		            
			    		            if(filteredCellGlobalTab1==true) {
								    	pass(driver,"For selected 3 condition Global Filter Applied correctly in the GlobalTab1 charts..");
			  			          	}else {
							   			fail(driver,"For selected 3 condition Global Filter not Applied correctly in the GlobalTab1 for the Categorical column : "+SelectCategorical_GlobalFilter+", Rows : "+failedCell_Categorical_GF);
			  			          	}
		   						
		   						  
		   					   	}else {
		   					   	   String Failed=getText1(driver, ValidationChart);
		   						   fail(driver,"Unable to get the chart value in GlobalTab1 for the selected filter for 3 conditions "+Failed);
		   					    }
	    			  		 
		   					      //after checking the first tab then switch back to global filtered tab
			   					  clickSecondTab(driver,GlobalTab2TabId);
			   				      //after checking the first tab then switch back to global filtered tab
		    			  	
			   					  waitForElement(driver,RestButton_GlobalFilter);
		    					  click(driver,RestButton_GlobalFilter);
		    					  elementnotvisible(driver,Loading);
		    					  elementnotvisible1(driver, RPE_Loading);
		    					  ResetGlobalValidation(driver,GlobalTab2TabId);
		 					   	  
    				    	   }
    					  }
    				    		
    					  }else {
    						  fail(driver,"Categorical Column not Expand After click on it ");
    		    		  }	
    					  
		    		  }else {
		    			  fail(driver,SelectCategorical_GlobalFilter+" Categorical Column value not present in Global filter");
		    		  }	
	    		 // categorical global filter validation end......
	    		  
	    		  
		  
	    		 //Date Global Filter Validation start...........
	    		 
                  click(driver,RestButton_GlobalFilter);
                  elementnotvisible1(driver, RPE_Loading);
	    		  boolean dateFilter=false;
	    		  try {
	    			  WebElement DateColumnElement=driver.findElement(By.xpath("//div[@id='globalRPE_select_filterColsCon']//div[@id='"+SelectDateColumn_Smoke_GlobalFilter+"']//a"));
  				      action.moveToElement(DateColumnElement).click().build().perform();
  				      dateFilter=true;
	    		  }catch(Exception e) {
	    			  
	    		  }
	    		  if(dateFilter==true) { 
	    			  wait(driver,"1");
	    			  WebElement DateColumnElementExpand=driver.findElement(By.xpath("//div[@id='globalRPE_select_filterColsCon']//div[@id='"+SelectDateColumn_Smoke_GlobalFilter+"']//a//i"));
	    			  String DateColumnElementExpandString=DateColumnElementExpand.getAttribute("class");
	    			  if(DateColumnElementExpandString.contains("up")) {
	    				  pass(driver,"Selected Date Column expanded after click on it");
  					 
						  WebElement Date_RelativeSection=driver.findElement(By.xpath("//div[@id='"+SelectDateColumn_Smoke_GlobalFilter+"_content']//div[@id='relative_div']"));
						  pass(driver,"Relative filter present in the Date Column");
						  WebElement Date_RelativeRadioBtn=driver.findElement(By.xpath("//div[@id='"+SelectDateColumn_Smoke_GlobalFilter+"_content']//div[@id='relative_div']//input"));
						  if(Date_RelativeRadioBtn.isSelected()) {
							  pass(driver,"By default, 'Relative' option selected in the Date Column");
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
			    			  		 elementnotvisible1(driver, RPE_Loading);
		    			  		     boolean chartpresentGlobal2=false;
		    			  		     try {
			    			  			   WebElement chartPresent=driver.findElement(By.xpath("//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody']"));
			    			  			   if(chartPresent.isDisplayed()) {
			    			  				 chartpresentGlobal2=true;
			    			  			   }
		    			  		     }catch(Exception e) {
//			    			  			   e.printStackTrace();
		    			  		     }	
			    			  		 
			    			  		 
		    			  		     if(chartpresentGlobal2) {
								   		WebElement chartPresent=driver.findElement(By.xpath("//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody']"));
								   		action.moveToElement(chartPresent).build().perform();
			    					    
			    					    try {
			    							  WebElement globalFilterIconChartTab3=driver.findElement(By.xpath("//div[contains(@id,'"+GlobalTab2TabId+"')]//*[name()='svg']//*[name()='g'][2]//*[name()='path'][3]"));
			    							  action.moveToElement(globalFilterIconChartTab3).build().perform();
			    							  String globalIconColorRGB=globalFilterIconChartTab3.getCssValue("fill");
			    							  String globalIconColor=rgbToHex1(globalIconColorRGB);
			    							  
			    							  if("#FF3333".equalsIgnoreCase(globalIconColor)) {
			    								  pass(driver,"Global Filter icon changed to Red color after Applying the Global Filter"); 
			    							  }else {
			    								  fail(driver,"Global Filter icon not changed to Red color after Applying the Global Filter"); 
			    							  }
			    							  
			    						  }catch(Exception e) {
			    							  fail(driver,"unable to find the globalfilter icon in the chart result");
			    						  }
								   		
								   		
									      int j=1;
									      boolean filteredCellGlobalTab2=true;
									      String failedCell_Date_GF=" ";
									      List<WebElement> FilterChartValue=driver.findElements(By.xpath("//div[contains(@id,'"+GlobalTab2TabId+"')]//div[@ref='gridBody']//div[@col-id='"+SelectDateColumn_Smoke_GlobalFilter+"' and @role='gridcell']"));
									      for(WebElement localEle:FilterChartValue) {
									    	  String FilterCellValue=localEle.getText();
									    	  if (FilterCellValue != null && FilterCellValue.length() >= 10) {
									    		  FilterCellValue=FilterCellValue.substring(0, 10);
			    			  		           }
									    	
									    	  if(!Date_RelativeFiltercell(RelativeFilterList[k],FilterCellValue,RelativeFilterInputList[k])) {
									    		  filteredCellGlobalTab2=false;
									    		  failedCell_Date_GF=failedCell_Date_GF+j+", ";
									    	  }
									    	  j++;
									       }
									    
									       if(filteredCellGlobalTab2==true) {
									    	  pass(driver,"For '"+RelativeFilterList[k]+"' condition applied correctly in the GlobalTab2 charts..");
									       }else {
							  					fail(driver,"For '"+RelativeFilterList[k]+"' Global Filter not Applied correctly in the GlobalTab2 for the Date column : "+SelectDateColumn_Smoke_GlobalFilter+", Rows : "+failedCell_Date_GF);
									       }
								   		}else {
								   			String Failed=getText1(driver, ValidationChart);
								   			fail(driver,"Unable to get the chart value in GlobalTab2 for the selected filter, "+RelativeFilterList[k]+" "+Failed);
								   		}
		    			  		     
		    			  		     
		    			  		     //moving to firstTab and click  (1)
		    			  		     boolean chartpresentGlobal1=clickFirstTab(driver,GlobalTab1Id);
				   					 //moving to firstTab and click
				   					  
			   					  	 if(chartpresentGlobal1) {
					   						int j=1;
					    		            boolean filteredCellGlobalTab1=true;
					    		            String failedCell_Date_GF=" ";
					    		            List<WebElement> FilterChartValue=driver.findElements(By.xpath("//div[contains(@id,'"+GlobalTab1Id+"')]//div[@ref='gridBody']//div[@col-id='"+SelectDateColumn_Smoke_GlobalFilter+"' and @role='gridcell']"));
					    		            for(WebElement localEle:FilterChartValue) {
					    		            	String FilterCellValue=localEle.getText();
					    		            	if (FilterCellValue != null && FilterCellValue.length() >= 10) {
										    		FilterCellValue=FilterCellValue.substring(0, 10);
				    			  		        }
					    		            	
					    		            	if(!Date_RelativeFiltercell(RelativeFilterList[k],FilterCellValue,RelativeFilterInputList[k])) {
					    		            		filteredCellGlobalTab1=false;
										    		failedCell_Date_GF=failedCell_Date_GF+j+", ";
										    	}
					    		            	j++;
					    		            }
					    		            if(filteredCellGlobalTab1==true) {
										    	pass(driver,"For '"+RelativeFilterList[k]+"' condition applied correctly in the GlobalTab1 charts..");
					  			          	}else {
								  				fail(driver,"For '"+RelativeFilterList[k]+"' Global Filter not Applied correctly in the GlobalTab1 for the Date column : "+SelectDateColumn_Smoke_GlobalFilter+", Rows : "+failedCell_Date_GF);
					  			          	}
				   						
				   					   	}else {
				   					   	   String Failed=getText1(driver, ValidationChart);
				   						   fail(driver,"Unable to get the chart value in GlobalTab1 for the selected filter, "+RelativeFilterList[k]+" "+Failed);
				   					    }
			    			  		 
				   					    //after checking the first tab then switch back to global filtered tab
					   					 clickSecondTab(driver,GlobalTab2TabId);
					   				     //after checking the first tab then switch back to global filtered tab
   				    			  	
				    				 }catch(Exception e) {
				    					 e.printStackTrace();
				    				 }
				    			 }
		    			  		 
						  }else {
							  fail(driver,"By default, 'Relative' option not selected in the Date Column");
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
				    			  		 wait(driver,"1");
				    			  		 click(driver,ApplyButton_GlobalFilter);
				    			  		 elementnotvisible1(driver, RPE_Loading);
			    			  		     boolean chartpresentGlobal2=false;
			    			  		     try {
				    			  			   WebElement chartPresent=driver.findElement(By.xpath("//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody']"));
				    			  			   if(chartPresent.isDisplayed()) {
				    			  				 chartpresentGlobal2=true;
				    			  			   }
				    			  			   
			    			  		     }catch(Exception e) {
				    			  			   e.printStackTrace();
			    			  		     }	
				    			  		 
				    			  		 
			    			  		   if(chartpresentGlobal2) {
									   		WebElement chartPresent=driver.findElement(By.xpath("//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody']"));
									   		action.moveToElement(chartPresent).build().perform();
				    					    
										    int j=1;
										    boolean filteredCellGlobalTab2=true;
										    String failedCell_Date_GF=" ";
										    List<WebElement> FilterChartValue=driver.findElements(By.xpath("//div[contains(@id,'"+GlobalTab2TabId+"')]//div[@ref='gridBody']//div[@col-id='"+SelectDateColumn_Smoke_GlobalFilter+"' and @role='gridcell']"));
										    for(WebElement localEle:FilterChartValue) {
										    	String FilterCellValue=localEle.getText();
										    	if (FilterCellValue != null && FilterCellValue.length() >= 10) {
										    		FilterCellValue=FilterCellValue.substring(0, 10);
				    			  		        }
										    	
										    	if(!Date_ConditionFiltercell(ConditionFilterList[k],FilterCellValue,ConditionFilterInputList[k],Condition_9_InputB_Date_GF)) {
										    		filteredCellGlobalTab2=false;
										    		failedCell_Date_GF=failedCell_Date_GF+j+", ";
										    	}
				    						  j++;
										    }
										    
										    if(filteredCellGlobalTab2==true) {
										    	pass(driver,"For '"+ConditionFilterList[k]+"' condition applied correctly in the GlobalTab2 charts..");
										    }else {
								  				fail(driver,"For '"+ConditionFilterList[k]+"' Global Filter not Applied correctly in the GlobalTab2 for the Date column : "+SelectDateColumn_Smoke_GlobalFilter+", Rows : "+failedCell_Date_GF);
										    }
										   
				    					  
									   	}else {
									   		String Failed=getText1(driver, ValidationChart);
									   		fail(driver,"Unable to get the chart value in GlobalTab2 for the selected filter, "+ConditionFilterList[k]+" "+Failed);
									   	}
			    			  		     
			    			  		   //moving to firstTab and click  (1)
				    				    boolean chartpresentGlobal1=clickFirstTab(driver,GlobalTab1Id);
					   					//moving to firstTab and click
					   					  
				   					  	if(chartpresentGlobal1) {
						   						int j=1;
						    		            boolean filteredCellGlobalTab1=true;
						    		            String failedCell_Date_GF=" ";
						    		            List<WebElement> FilterChartValue=driver.findElements(By.xpath("//div[contains(@id,'"+GlobalTab1Id+"')]//div[@ref='gridBody']//div[@col-id='"+SelectDateColumn_Smoke_GlobalFilter+"' and @role='gridcell']"));
						    		            for(WebElement localEle:FilterChartValue) {
						    		            	String FilterCellValue=localEle.getText();
						    		            	if (FilterCellValue != null && FilterCellValue.length() >= 10) {
											    		FilterCellValue=FilterCellValue.substring(0, 10);
					    			  		        }
						    		            	
						    		            	if(!Date_ConditionFiltercell(ConditionFilterList[k],FilterCellValue,ConditionFilterInputList[k],Condition_9_InputB_Date_GF)) {
						    		            		filteredCellGlobalTab1=false;
											    		failedCell_Date_GF=failedCell_Date_GF+j+", ";
											    	}
					    						  
						    		           
						    		            	j++;
						    		            }
						    		            
						    		            if(filteredCellGlobalTab1==true) {
											    	pass(driver,"For '"+ConditionFilterList[k]+"' condition applied correctly in the GlobalTab1 charts..");
											    }else {
									  				fail(driver,"For '"+ConditionFilterList[k]+"' Global Filter not Applied correctly in the GlobalTab1 for the Date column : "+SelectDateColumn_Smoke_GlobalFilter+", Rows : "+failedCell_Date_GF);
											    }
					   						
					   					   	}else {
					   					   	   String Failed=getText1(driver, ValidationChart);
					   						   fail(driver,"Unable to get the chart value in GlobalTab1 for the selected filter, "+ConditionFilterList[k]+" "+Failed);
					   					    }
				    			  		
					   					    //after checking the first tab then switch back to global filtered tab
						   					 clickSecondTab(driver,GlobalTab2TabId);
						   				     //after checking the first tab then switch back to global filtered tab 
				    			  		 
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
				    				  
			    				  mouseOverToElement(driver, AddButtonCondition);
			    				  click(driver,AddButtonCondition);
			    				  
			    				  verifyElementDisplayed(driver, AND_ConditionSec1);
			    				  verifyElementDisplayed(driver, OR_ConditionSec1);
			    				 
			    				  if(FirstOperator_Input_Date_GF.equals("AND")) { 
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
				    				 
			    				  mouseOverToElement(driver, AddButtonCondition);
			    				  click(driver,AddButtonCondition);
			    				  verifyElementDisplayed(driver, AND_ConditionSec2);
			    				  verifyElementDisplayed(driver, OR_ConditionSec2);
			    				  
			    				  if(SecondOperator_Input_Date_GF.equals("AND")) { 
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
		    					  
//				    				  /test
			    				  
			    				  click(driver,ApplyButton_GlobalFilter);
			    				  elementnotvisible1(driver, RPE_Loading);
	    			  		      boolean chartpresentGlobal2=false;
	    			  		      try {
		    			  			   WebElement chartPresent=driver.findElement(By.xpath("//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody']"));
		    			  			   if(chartPresent.isDisplayed()) {
		    			  				 chartpresentGlobal2=true;
		    			  			   }
		    			  			   
	    			  		      }catch(Exception e) {
		    			  			   e.printStackTrace();
	    			  		      }	
			    			  		 
			    			  		 
		    			  		  if(chartpresentGlobal2) {
								   		WebElement chartPresent=driver.findElement(By.xpath("//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody']"));
								   		action.moveToElement(chartPresent).build().perform();
			    					    
									    int j=1;
									    boolean filteredCellGlobalTab2=true;
									    String failedCell_Date_GF=" ";
									    List<WebElement> FilterChartValue=driver.findElements(By.xpath("//div[contains(@id,'"+GlobalTab2TabId+"')]//div[@ref='gridBody']//div[@col-id='"+SelectDateColumn_Smoke_GlobalFilter+"' and @role='gridcell']"));
									    for(WebElement localEle:FilterChartValue) {
									    	String FilterCellValue=localEle.getText();
									    	if (FilterCellValue != null && FilterCellValue.length() >= 10) {
									    		FilterCellValue=FilterCellValue.substring(0, 10);
			    			  		        }
									    	
									    	boolean condition_1_Result=Date_ConditionFiltercell(FirstCondition_Date_GF,FilterCellValue,FirstCondition_Date_Input_GF,Condition_9_InputB_Date_GF);
			    						    boolean condition_2_Result=Date_ConditionFiltercell(SecondCondition_Date_GF,FilterCellValue,SecondCondition_Date_Input_GF,Condition_9_InputB_Date_GF);
			    						    boolean condition_3_Result=Date_ConditionFiltercell(ThirdCondition_Date_GF,FilterCellValue,ThirdCondition_Date_Input_GF,Condition_9_InputB_Date_GF);
			    						    String operator1 = FirstOperator_Input_Date_GF;
			    						    String operator2 = SecondOperator_Input_Date_GF;
			    						    
			    						    if(!evaluateConditions(condition_1_Result,operator1,condition_2_Result,operator2,condition_3_Result)) {
			    						    	filteredCellGlobalTab2=false;
			    						    	failedCell_Date_GF=failedCell_Date_GF+j+", ";
			    						    }
									    	
			    						  j++;
									    }
									    
									    if(filteredCellGlobalTab2==true) {
									    	pass(driver,"For Selected 3 condition applied correctly in the GlobalTab2 charts..");
									    }else {
							  				fail(driver,"For Selected 3 conditions Global Filter not Applied correctly in the GlobalTab2 for the Date column : "+SelectDateColumn_Smoke_GlobalFilter+", Rows : "+failedCell_Date_GF);
									    }
									   
			    					  
								   	}else {
								   		String Failed=getText1(driver, ValidationChart);
								   		fail(driver,"Unable to get the chart value in GlobalTab2 for the selected filter 3 conditions "+Failed);
								   	}
		    			  		     
		    			  		   //moving to firstTab and click  (1)
			    				    boolean chartpresentGlobal1=clickFirstTab(driver,GlobalTab1Id);
				   					//moving to firstTab and click
				   					  
			   					  	if(chartpresentGlobal1) {
					   						int j=1;
					    		            boolean filteredCellGlobalTab1=true;
					    		            String failedCell_Date_GF=" ";
					    		            List<WebElement> FilterChartValue=driver.findElements(By.xpath("//div[contains(@id,'"+GlobalTab1Id+"')]//div[@ref='gridBody']//div[@col-id='"+SelectDateColumn_Smoke_GlobalFilter+"' and @role='gridcell']"));
					    		            for(WebElement localEle:FilterChartValue) {
					    		            	String FilterCellValue=localEle.getText();
					    		            	if (FilterCellValue != null && FilterCellValue.length() >= 10) {
										    		FilterCellValue=FilterCellValue.substring(0, 10);
				    			  		        }
					    		            	
					    		            	boolean condition_1_Result=Date_ConditionFiltercell(FirstCondition_Date_GF,FilterCellValue,FirstCondition_Date_Input_GF,Condition_9_InputB_Date_GF);
				    						    boolean condition_2_Result=Date_ConditionFiltercell(SecondCondition_Date_GF,FilterCellValue,SecondCondition_Date_Input_GF,Condition_9_InputB_Date_GF);
				    						    boolean condition_3_Result=Date_ConditionFiltercell(ThirdCondition_Date_GF,FilterCellValue,ThirdCondition_Date_Input_GF,Condition_9_InputB_Date_GF);
				    						    String operator1 = FirstOperator_Input_Date_GF;
				    						    String operator2 = SecondOperator_Input_Date_GF;
				    						    
				    						    if(!evaluateConditions(condition_1_Result,operator1,condition_2_Result,operator2,condition_3_Result)) {
				    						    	filteredCellGlobalTab1=false;
				    						    	failedCell_Date_GF=failedCell_Date_GF+j+", ";
				    						    }
					    		           
					    		            	j++;
					    		            }
					    		            
					    		            if(filteredCellGlobalTab1==true) {
										    	pass(driver,"For selected 3 condition applied correctly in the GlobalTab1 charts..");
										    }else {
								  				fail(driver,"For selected 3 condition Global Filter not Applied correctly in the GlobalTab1 for the Date column : "+SelectDateColumn_Smoke_GlobalFilter+", Rows : "+failedCell_Date_GF);
										    }
				   						
				   					   	}else {
				   					   	   String Failed=getText1(driver, ValidationChart);
				   						   fail(driver,"Unable to get the chart value in GlobalTab1 for the selected filter, 3 conditions "+Failed);
				   					    }
			    			  		
				   					    //after checking the first tab then switch back to global filtered tab
					   					 clickSecondTab(driver,GlobalTab2TabId);
					   				     //after checking the first tab then switch back to global filtered tab 
		    					  
					   					 click(driver,RestButton_GlobalFilter);
					   					 elementnotvisible1(driver, RPE_Loading);
					   					 ResetGlobalValidation(driver,GlobalTab2TabId);
  						    	}else {
  						    		fail(driver,"Conditions Filter in Date type Colunm is not selected after click on it ");
  						    	}
  					    }
  					  
  				  }else {
  					  fail(driver,"Selected Date Column not expanded after click on it"); 
  				  }
  				  
  				  
  			  	}else {
  			  		fail(driver,SelectDateColumn_Smoke_GlobalFilter+" Date Column value not present in Global filter");
  			  	}
	    		  
  			//Date Global Filter Validation End...........
  			  
  			  
  			
  			// Numerical Filter validation
  			click(driver,RestButton_GlobalFilter);
  			elementnotvisible1(driver, RPE_Loading);
  			boolean NumericalFilter=false;
  			try {
  				WebElement NumericalColumnElement=driver.findElement(By.xpath("//div[@id='globalRPE_select_filterColsCon']//div[@id='"+SelectNumerical_Smoke_GlobalFilter+"']//a"));
  				action.moveToElement(NumericalColumnElement).click().build().perform();
  				NumericalFilter=true;
  			}catch(Exception e) {
  				
  			}
  			if(NumericalFilter==true) {
				  wait(driver,"1");
				  WebElement NumericalColumnElementExpand=driver.findElement(By.xpath("//div[@id='globalRPE_select_filterColsCon']//div[@id='"+SelectNumerical_Smoke_GlobalFilter+"']//a//i"));
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
	    			  		 elementnotvisible1(driver, RPE_Loading);
		  		      		 boolean chartpresentGlobal2=false;
		  		      		 try {
	    			  			   WebElement chartPresent=driver.findElement(By.xpath("//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody']"));
	    			  			   if(chartPresent.isDisplayed()) {
	    			  				 chartpresentGlobal2=true;
	    			  			   }
	    			  			   
  			  		      	 }catch(Exception e) {
	    			  			   e.printStackTrace();
  			  		      	 }	
		    			  		 
		    			  		 
	    			  		  if(chartpresentGlobal2) {
							   		WebElement chartPresent=driver.findElement(By.xpath("//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody']"));
							   		action.moveToElement(chartPresent).build().perform();
		    					    
								    int j=1;
								    boolean filteredCellGlobalTab2=true;
								    String failedCell_Num_GF=" ";
								    List<WebElement> FilterChartValue=driver.findElements(By.xpath("//div[contains(@id,'"+GlobalTab2TabId+"')]//div[@ref='gridBody']//div[@col-id='"+SelectNumerical_Smoke_GlobalFilter+"' and @role='gridcell']"));
								    for(WebElement localEle:FilterChartValue) {
								    	String FilterCellValue=localEle.getText();
								    	
								    	if(!Numerical_ConditionFiltercell(NumFilterList[k],FilterCellValue,NumFilterInputList[k],Condition_Between_InputB_Num_GF)) {
								    		filteredCellGlobalTab2=false;
								    		failedCell_Num_GF=failedCell_Num_GF+j+", ";
		  							    }
								    	
								    	
		    						  j++;
								    }
								    
								    if(filteredCellGlobalTab2==true) {
								    	pass(driver,"For '"+NumFilterList[k]+"' condition applied correctly in the GlobalTab2 charts..");
							    	}else {
						  				fail(driver,"For '"+NumFilterList[k]+"' conditions Global Filter not Applied correctly in the GlobalTab2 for the Num column : "+SelectNumerical_Smoke_GlobalFilter+", Rows : "+failedCell_Num_GF);
							    	}
								   
		    					  
							   	}else {
							   		String Failed=getText1(driver, ValidationChart);
							   		fail(driver,"Unable to get the chart value in GlobalTab2 for the selected filter "+NumFilterList[k]+" , "+Failed);
							   	}
	    			  		     
	    			  		   //moving to firstTab and click  (1)
		    				    boolean chartpresentGlobal1=clickFirstTab(driver,GlobalTab1Id);
			   					//moving to firstTab and click
			   					  
		   					  	if(chartpresentGlobal1) {
				   						int j=1;
				    		            boolean filteredCellGlobalTab1=true;
				    		            String failedCell_Num_GF=" ";
				    		            List<WebElement> FilterChartValue=driver.findElements(By.xpath("//div[contains(@id,'"+GlobalTab1Id+"')]//div[@ref='gridBody']//div[@col-id='"+SelectNumerical_Smoke_GlobalFilter+"' and @role='gridcell']"));
				    		            for(WebElement localEle:FilterChartValue) {
				    		            	String FilterCellValue=localEle.getText();
				    		            	
				    		            	if(!Numerical_ConditionFiltercell(NumFilterList[k],FilterCellValue,NumFilterInputList[k],Condition_Between_InputB_Num_GF)) {
				    		            		filteredCellGlobalTab1=false;
									    		failedCell_Num_GF=failedCell_Num_GF+j+", ";
			  							    }
				    		            	j++;
				    		            }
				    		            
				    		            if(filteredCellGlobalTab1==true) {
									    	pass(driver,"For '"+NumFilterList[k]+"' condition applied correctly in the GlobalTab1 charts..");
								    	}else {
							  				fail(driver,"For '"+NumFilterList[k]+"' conditions Global Filter not Applied correctly in the GlobalTab1 for the Num column : "+SelectNumerical_Smoke_GlobalFilter+", Rows : "+failedCell_Num_GF);
								    	}
				    		            
			   					   	}else {
			   					   	  String Failed=getText1(driver, ValidationChart);
			   						   fail(driver,"Unable to get the chart value in GlobalTab1 for the selected filter, "+NumFilterList[k]+" "+Failed);
			   					    }
		    			  		
			   					    //after checking the first tab then switch back to global filtered tab
				   					 clickSecondTab(driver,GlobalTab2TabId);
				   				     //after checking the first tab then switch back to global filtered tab 

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
	    				  
			  			mouseOverToElement(driver, AddButtonCondition);
			  			click(driver,AddButtonCondition);
  				  
			  			verifyElementDisplayed(driver, AND_ConditionSec1);
			  			verifyElementDisplayed(driver, OR_ConditionSec1);
					 
			  			if(FirstOperator_Input_Num_GF.equals("AND")) { 
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
  				  
			  			mouseOverToElement(driver, AddButtonCondition);
			  			click(driver,AddButtonCondition);
			  			verifyElementDisplayed(driver, AND_ConditionSec2);
			  			verifyElementDisplayed(driver, OR_ConditionSec2);
  				  
			  			if(SecondOperator_Input_Num_GF.equals("AND")) { 
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
			  			wait(driver,"1");
					  
			  			if(isDisplayed2(driver,AddButtonCondition)) {
			  				fail(driver,"'ADD' button displayed after given 3 times condition ");
			  			}else {
			  				pass(driver,"'ADD' button not displayed after given 3 times condition");
			  			}
					  
					 
			  			click(driver,ApplyButton_GlobalFilter);
			  			elementnotvisible1(driver, RPE_Loading);
	  		      		boolean chartpresentGlobal2=false;
	  		      		try {
   			  			   WebElement chartPresent=driver.findElement(By.xpath("//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody']"));
   			  			   if(chartPresent.isDisplayed()) {
   			  				 chartpresentGlobal2=true;
   			  			   }
   			  			   
	  		      	    }catch(Exception e) {
   			  			   e.printStackTrace();
	  		      	    }	
	    			  		 
	    			  		 
   			  		    if(chartpresentGlobal2) {
						   		WebElement chartPresent=driver.findElement(By.xpath("//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody']"));
						   		action.moveToElement(chartPresent).build().perform();
	    					    
							    int j=1;
							    boolean filteredCellGlobalTab2=true;
							    String failedCell_Num_GF=" ";
							    List<WebElement> FilterChartValue=driver.findElements(By.xpath("//div[contains(@id,'"+GlobalTab2TabId+"')]//div[@ref='gridBody']//div[@col-id='"+SelectNumerical_Smoke_GlobalFilter+"' and @role='gridcell']"));
							    for(WebElement localEle:FilterChartValue) {
							    	String FilterCellValue=localEle.getText();
							    	
							    	boolean condition_1_Result=Numerical_ConditionFiltercell(FirstCondition_Num_GF,FilterCellValue,FirstCondition_Num_Input_GF,Condition_Between_InputB_Num_GF);
				  					boolean condition_2_Result=Numerical_ConditionFiltercell(SecondCondition_Num_GF,FilterCellValue,SecondCondition_Num_Input_GF,Condition_Between_InputB_Num_GF);
				  					boolean condition_3_Result=Numerical_ConditionFiltercell(ThirdCondition_num_GF,FilterCellValue,ThirdCondition_Num_Input_GF,Condition_Between_InputB_Num_GF);
				  					String operator1 = FirstOperator_Input_Num_GF;
				  					String operator2 = SecondOperator_Input_Num_GF;
	  			  				 
				  					if(!evaluateConditions(condition_1_Result,operator1,condition_2_Result,operator2,condition_3_Result)) {
				  						filteredCellGlobalTab2=false;
				  						failedCell_Num_GF=failedCell_Num_GF+j+", ";
				  						
				  					}
	    						  j++;
							    }
							    
							    if(filteredCellGlobalTab2==true) {
							    	pass(driver,"For Selected 3 Conditions applied correctly in the GlobalTab2 charts..");
						    	}else {
					  				fail(driver,"For Selected 3 Conditions Global Filter not Applied correctly in the GlobalTab2 for the Num column : "+SelectNumerical_Smoke_GlobalFilter+", Rows : "+failedCell_Num_GF);
						    	}
							   
	    					  
						   	}else {
						   		String Failed=getText1(driver, ValidationChart);
						   		fail(driver,"Unable to get the chart value in GlobalTab2 for the selected filter 3 conditions , "+Failed);
						   	}
   			  		     
   			  		        //moving to firstTab and click  (1)
	    				    boolean chartpresentGlobal1=clickFirstTab(driver,GlobalTab1Id);
		   					//moving to firstTab and click
		   					  
	   					  	if(chartpresentGlobal1) {
			   						int j=1;
			    		            boolean filteredCellGlobalTab1=true;
			    		            String failedCell_Num_GF=" ";
			    		            List<WebElement> FilterChartValue=driver.findElements(By.xpath("//div[contains(@id,'"+GlobalTab1Id+"')]//div[@ref='gridBody']//div[@col-id='"+SelectNumerical_Smoke_GlobalFilter+"' and @role='gridcell']"));
			    		            for(WebElement localEle:FilterChartValue) {
			    		            	String FilterCellValue=localEle.getText();
			    		            	
			    		            	boolean condition_1_Result=Numerical_ConditionFiltercell(FirstCondition_Num_GF,FilterCellValue,FirstCondition_Num_Input_GF,Condition_Between_InputB_Num_GF);
					  					boolean condition_2_Result=Numerical_ConditionFiltercell(SecondCondition_Num_GF,FilterCellValue,SecondCondition_Num_Input_GF,Condition_Between_InputB_Num_GF);
					  					boolean condition_3_Result=Numerical_ConditionFiltercell(ThirdCondition_num_GF,FilterCellValue,ThirdCondition_Num_Input_GF,Condition_Between_InputB_Num_GF);
					  					String operator1 = FirstOperator_Input_Num_GF;
					  					String operator2 = SecondOperator_Input_Num_GF;
		  			  				 
					  					if(!evaluateConditions(condition_1_Result,operator1,condition_2_Result,operator2,condition_3_Result)) {
					  						filteredCellGlobalTab1=false;
					  						failedCell_Num_GF=failedCell_Num_GF+j+", ";
					  						
					  					}
			    		            	j++;
			    		            }
			    		            
			    		            if(filteredCellGlobalTab1==true) {
								    	pass(driver,"For Selected 3 Condition applied correctly in the GlobalTab1 charts..");
							    	}else {
						  				fail(driver,"For Selected 3 Condition Global Filter not Applied correctly in the GlobalTab1 for the Num column : "+SelectNumerical_Smoke_GlobalFilter+", Rows : "+failedCell_Num_GF);
							    	}
			    		            
		   					   	}else {
		   					   	   String Failed=getText1(driver, ValidationChart);
		   						   fail(driver,"Unable to get the chart value in GlobalTab1 for the selected filter 3 conditions, "+Failed);
		   					    }
	    			  		
		   					    //after checking the first tab then switch back to global filtered tab
			   					 clickSecondTab(driver,GlobalTab2TabId);
			   				     //after checking the first tab then switch back to global filtered tab 

			   					 waitForElement(driver,RestButton_GlobalFilter);
			   					 click(driver,RestButton_GlobalFilter);
			   					 wait(driver,"1");
			   					 elementnotvisible(driver, Loading1);
			   					 ResetGlobalValidation(driver,GlobalTab2TabId);
			   					 
			  		 }else {
			  			 fail(driver,"Selected Numerical Column not expanded after click on it"); 
			  		 }
				  
  				}else {
  					fail(driver,SelectNumerical_Smoke_GlobalFilter+" Numerical Column not present");
  				}
	    		//Numerical Global filter end....
  			
  			
  			
  		      //Text Global filter Start....
				 click(driver,RestButton_GlobalFilter);
				 boolean textFilter=false;
				 try {
					 WebElement TextColumn= driver.findElement(By.xpath("//div[@id='globalRPE_select_filterColsCon']//div[@id='"+SelectText_GlobalFilter+"']//a"));
					 action.moveToElement(TextColumn).click().build().perform();
					 textFilter=true;
				 }catch(Exception e) {
   			  
				 }
   		  
				 if(textFilter==true) {
					 WebElement textColumnExp=driver.findElement(By.xpath("//div[@id='globalRPE_select_filterColsCon']//div[@id='"+SelectText_GlobalFilter+"']//a//i"));
					 String textColumnExpText=textColumnExp.getAttribute("class");
					 if(textColumnExpText.contains("up")) {
						 pass(driver,"Text Column Expand After click on it ");
						 if(verifyElementDisplayed(driver, byValueFilterOption)) {
							 try {
								 WebElement ByValueElementRadio=driver.findElement(By.xpath("//div[@id='"+SelectText_GlobalFilter+"_content']//div[@id='byRelative_div']//input"));
								 if(ByValueElementRadio.isSelected()) {
									 pass(driver,"By default, 'By Values' radio button selected ");
								 }else {
									 fail(driver,"By default, 'By Values' radio button not selected ");
								 }
							 }catch(Exception e) {
								 fail(driver,"Unable to find 'By Values' radio button ");
							 }
						 }
	    			 

						 List<WebElement> searchListAvailable=driver.findElements(By.xpath("//div[@id='"+SelectText_GlobalFilter+"_FactorsList']//li"));
						 List<WebElement> searchListCheckboxAvailable=driver.findElements(By.xpath("//div[@id='"+SelectText_GlobalFilter+"_FactorsList']//li//input[@type='checkbox']"));
						 if(searchListAvailable.size()==searchListCheckboxAvailable.size()) {
							 pass(driver,"All the available searchlist are displayed with Checkbox");
						 }else {
							 fail(driver,"Some available searchlist are not displayed with Checkbox");
						 }
				      
				      
						 WebElement SearchBar_=driver.findElement(By.xpath("//input[@id='"+SelectText_GlobalFilter+"LFsearch']"));
						 SearchBar_.click();
						 wait(driver,"1");
	    			  	 SearchBar_.sendKeys(ByValuesInput_Text_GF);
	    			  	 pass(driver,"Type On Value "+ByValuesInput_Text_GF+" search input");
	    			  	 wait(driver,"1");
	    			  	 WebElement firstOption=driver.findElement(By.xpath("(//div[@id='"+SelectText_GlobalFilter+"_FactorsList']//li)[1]"));
	    			  	 String firstOptionText=firstOption.getText();
	    			  	 if(firstOptionText.equals(ByValuesInput_Text_GF)) {
	    			 		pass(driver,"Search bar inside the Text section works properly");
	    			  	 }else {
	    			  		 fail(driver,"Search bar inside the Text section not works properly");
	    			  	 }
   			  
	    			  	 firstOption.click();
	    			  	 wait(driver,"1");
	    			  	 WebElement firstCheckBox=driver.findElement(By.xpath("(//div[@id='"+SelectText_GlobalFilter+"_FactorsList']//li//input)[1]"));
	    			  	 if(firstCheckBox.isSelected()){
	    			  		 pass(driver,"Check box selected when click the First searched value");
	    			  	 }else {
	    			  		 fail(driver,"Check box not selected when click the First searched value");
	    			  	 }
		    		  
	    			  	 click(driver,ApplyButton_GlobalFilter);
	    			  	elementnotvisible1(driver, RPE_Loading);
	  		      		boolean chartpresentGlobal2=false;
	  		      		try {
   			  			   WebElement chartPresent=driver.findElement(By.xpath("//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody']"));
   			  			   if(chartPresent.isDisplayed()) {
   			  				 chartpresentGlobal2=true;
   			  			   }
   			  			   
	  		      	    }catch(Exception e) {
   			  			   e.printStackTrace();
	  		      	    }	
	    			  		 
	    			  		 
   			  		    if(chartpresentGlobal2) {
						   		WebElement chartPresent=driver.findElement(By.xpath("//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody']"));
						   		action.moveToElement(chartPresent).build().perform();
	    					    
							    int j=1;
							    boolean filteredCellGlobalTab2=true;
							    String failedCell_Text_GF=" ";
							    List<WebElement> FilterChartValue=driver.findElements(By.xpath("//div[contains(@id,'"+GlobalTab2TabId+"')]//div[@ref='gridBody']//div[@col-id='"+SelectText_GlobalFilter+"' and @role='gridcell']"));
							    for(WebElement localEle:FilterChartValue) {
							    	String FilterCellValue=localEle.getText();
							    	
							    	if(!FilterCellValue.equals(ByValuesInput_Text_GF)) {
							    		  filteredCellGlobalTab2=false;
							    		  failedCell_Text_GF=failedCell_Text_GF+j+", ";
		    			  			 }
	    						  j++;
							    }
							    
							    if(filteredCellGlobalTab2==true) {
							    	pass(driver,"For By Values Condition applied correctly in the GlobalTab2 charts..");
						    	}else {
					  				fail(driver,"For By Values Condition Global Filter not Applied correctly in the GlobalTab2 for the Text column : "+SelectText_GlobalFilter+", Rows : "+failedCell_Text_GF);
						    	}
							   
						   	}else {
						   		String Failed=getText1(driver, ValidationChart);
						   		fail(driver,"Unable to get the chart value in GlobalTab2 for the selected filter By values , "+Failed);
						   	}
   			  		     
   			  		        //moving to firstTab and click  (1)
	    				    boolean chartpresentGlobal1=clickFirstTab(driver,GlobalTab1Id);
		   					//moving to firstTab and click
		   					  
	   					  	if(chartpresentGlobal1) {
			   						int j=1;
			    		            boolean filteredCellGlobalTab1=true;
			    		            String failedCell_Text_GF=" ";
			    		            List<WebElement> FilterChartValue=driver.findElements(By.xpath("//div[contains(@id,'"+GlobalTab1Id+"')]//div[@ref='gridBody']//div[@col-id='"+SelectText_GlobalFilter+"' and @role='gridcell']"));
			    		            for(WebElement localEle:FilterChartValue) {
			    		            	String FilterCellValue=localEle.getText();
			    		            	if(!FilterCellValue.equals(ByValuesInput_Text_GF)) {
			    		            		  filteredCellGlobalTab1=false;
			    		            		  failedCell_Text_GF=failedCell_Text_GF+j+", ";
			    			  			 }
			    		            	j++;
			    		            }
			    		            
			    		            if(filteredCellGlobalTab1==true) {
								    	pass(driver,"For By Values Conditions applied correctly in the GlobalTab1 charts..");
							    	}else {
						  				fail(driver,"For By Values Conditions Global Filter not Applied correctly in the GlobalTab1 for the Text column : "+SelectText_GlobalFilter+", Rows : "+failedCell_Text_GF);
							    	}
			    		            
		   					   	}else {
		   					       String Failed=getText1(driver, ValidationChart);
		   						   fail(driver,"Unable to get the chart value in GlobalTab1 for the selected filter By Values , "+Failed);
		   					    }
	    			  		
		   					    //after checking the first tab then switch back to global filtered tab
			   					 clickSecondTab(driver,GlobalTab2TabId);
			   				     //after checking the first tab then switch back to global filtered tab 
	    			  	 
			   					 waitForElement(driver, ExcludeCheckbox);
			   					 click(driver,ExcludeCheckbox);
			   					 click(driver,ApplyButton_GlobalFilter);
			   					 elementnotvisible1(driver, RPE_Loading);
			   					chartpresentGlobal2=false;
			  		      		try {
		   			  			   WebElement chartPresent=driver.findElement(By.xpath("//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody']"));
		   			  			   if(chartPresent.isDisplayed()) {
		   			  				 chartpresentGlobal2=true;
		   			  			   }
		   			  			   
			  		      	    }catch(Exception e) {
		   			  			   e.printStackTrace();
			  		      	    }	
			    			  		 
		   			  		    if(chartpresentGlobal2) {
								   		WebElement chartPresent=driver.findElement(By.xpath("//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody']"));
								   		action.moveToElement(chartPresent).build().perform();
			    					    
									    int j=1;
									    boolean filteredCellGlobalTab2=true;
									    String failedCell_Text_GF=" ";
									    List<WebElement> FilterChartValue=driver.findElements(By.xpath("//div[contains(@id,'"+GlobalTab2TabId+"')]//div[@ref='gridBody']//div[@col-id='"+SelectText_GlobalFilter+"' and @role='gridcell']"));
									    for(WebElement localEle:FilterChartValue) {
									    	String FilterCellValue=localEle.getText();
									    	if(FilterCellValue.equals(ByValuesInput_Text_GF)) {
									    		  filteredCellGlobalTab2=false;
									    		  failedCell_Text_GF=failedCell_Text_GF+j+", ";
				    			  			 }
			    						  j++;
									    }
									    
									    if(filteredCellGlobalTab2==true) {
									    	pass(driver,"For By Values with 'Exclude' Condition applied correctly in the GlobalTab2 charts..");
								    	}else {
							  				fail(driver,"For By Values with 'Exclude' Condition Global Filter not Applied correctly in the GlobalTab2 for the Text column : "+SelectText_GlobalFilter+", Rows : "+failedCell_Text_GF);
								    	}
									   
							   	 }else {
							   		String Failed=getText1(driver, ValidationChart);
							   		 fail(driver,"Unable to get the chart value in GlobalTab2 for the selected filter By values with Exclude , "+Failed);
							   	 }
		   			  		     
	   			  		        //moving to firstTab and click  (1)
		    				     chartpresentGlobal1=clickFirstTab(driver,GlobalTab1Id);
			   					//moving to firstTab and click
			   					  
		   					  	if(chartpresentGlobal1) {
				   						int j=1;
				    		            boolean filteredCellGlobalTab1=true;
				    		            String failedCell_Text_GF=" ";
				    		            List<WebElement> FilterChartValue=driver.findElements(By.xpath("//div[contains(@id,'"+GlobalTab1Id+"')]//div[@ref='gridBody']//div[@col-id='"+SelectText_GlobalFilter+"' and @role='gridcell']"));
				    		            for(WebElement localEle:FilterChartValue) {
				    		            	String FilterCellValue=localEle.getText();
				    		            	if(FilterCellValue.equals(ByValuesInput_Text_GF)) {
				    		            		  filteredCellGlobalTab1=false;
				    		            		  failedCell_Text_GF=failedCell_Text_GF+j+", ";
				    			  			 }
				    		            	j++;
				    		            }
				    		            
				    		            if(filteredCellGlobalTab1==true) {
									    	pass(driver,"For By Values with 'Exclude' Conditions applied correctly in the GlobalTab1 charts..");
								    	}else {
							  				fail(driver,"For By Values with 'Exclude' Conditions Global Filter not Applied correctly in the GlobalTab1 for the Text column : "+SelectText_GlobalFilter+", Rows : "+failedCell_Text_GF);
								    	}
				    		            
			   					   	}else {
			   					   	  String Failed=getText1(driver, ValidationChart);
			   						   fail(driver,"Unable to get the chart value in GlobalTab1 for the selected filter By Values with Exclude , "+Failed);
			   					    }
			    			  		
			   					    //after checking the first tab then switch back to global filtered tab
				   					 clickSecondTab(driver,GlobalTab2TabId);
				   				     //after checking the first tab then switch back to global filtered tab 
			   					 
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
			   									 elementnotvisible1(driver, RPE_Loading);
			   				   					chartpresentGlobal2=false;
			   				  		      		try {
			   			   			  			   WebElement chartPresent=driver.findElement(By.xpath("//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody']"));
			   			   			  			   if(chartPresent.isDisplayed()) {
			   			   			  				 chartpresentGlobal2=true;
			   			   			  			   }
			   			   			  			   
			   				  		      	    }catch(Exception e) {
//			   			   			  			   e.printStackTrace();
			   				  		      	    }	
			   				    			  		 
			   			   			  		    if(chartpresentGlobal2) {
			   									   		WebElement chartPresent=driver.findElement(By.xpath("//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody']"));
			   									   		action.moveToElement(chartPresent).build().perform();
			   				    					    
			   										    int j=1;
			   										    boolean filteredCellGlobalTab2=true;
			   										    String failedCell_Text_GF=" ";
			   										    List<WebElement> FilterChartValue=driver.findElements(By.xpath("//div[contains(@id,'"+GlobalTab2TabId+"')]//div[@ref='gridBody']//div[@col-id='"+SelectText_GlobalFilter+"' and @role='gridcell']"));
			   										    for(WebElement localEle:FilterChartValue) {
			   										    	String FilterCellValue=localEle.getText();
			   										    	
			   										    	if(!Categorical_ConditionFiltercell(conditionsList[k],FilterCellValue,conditionsInputList[k])) {
			   										    		filteredCellGlobalTab2=false;
			   										    		failedCell_Text_GF=failedCell_Text_GF+j+", ";
			   										    		
				   											 }
			   				    						  j++;
			   										    }
			   										    
			   										    if(filteredCellGlobalTab2==true) {
			   										    	pass(driver,"For '"+conditionsList[k]+"' Condition applied correctly in the GlobalTab2 charts..");
			   									    	}else {
			   								  				fail(driver,"For '"+conditionsList[k]+"' Condition Global Filter not Applied correctly in the GlobalTab2 for the Text column : "+SelectText_GlobalFilter+", Rows : "+failedCell_Text_GF);
			   									    	}
			   										   
			   								   	 }else {
			   								   	     String Failed=getText1(driver, ValidationChart);
			   								   		 fail(driver,"Unable to get the chart value in GlobalTab2 for the selected filter "+conditionsList[k]+", "+Failed);
			   								   	 }
			   			   			  		     
			   		   			  		        //moving to firstTab and click  (1)
			   			    				     chartpresentGlobal1=clickFirstTab(driver,GlobalTab1Id);
			   				   					//moving to firstTab and click
			   				   					  
			   			   					  	if(chartpresentGlobal1) {
			   					   						int j=1;
			   					    		            boolean filteredCellGlobalTab1=true;
			   					    		            String failedCell_Text_GF=" ";
			   					    		            List<WebElement> FilterChartValue=driver.findElements(By.xpath("//div[contains(@id,'"+GlobalTab1Id+"')]//div[@ref='gridBody']//div[@col-id='"+SelectText_GlobalFilter+"' and @role='gridcell']"));
			   					    		            for(WebElement localEle:FilterChartValue) {
			   					    		            	String FilterCellValue=localEle.getText();
			   					    		            	
			   					    		            	if(!Categorical_ConditionFiltercell(conditionsList[k],FilterCellValue,conditionsInputList[k])) {
			   					    		            		filteredCellGlobalTab1=false;
			   										    		failedCell_Text_GF=failedCell_Text_GF+j+", ";
				   											 }
			   					    		            	j++;
			   					    		            }
			   					    		            
			   					    		            if(filteredCellGlobalTab1==true) {
			   										    	pass(driver,"For '"+conditionsList[k]+"' Conditions applied correctly in the GlobalTab1 charts..");
			   									    	}else {
			   								  				fail(driver,"For '"+conditionsList[k]+"' Conditions Global Filter not Applied correctly in the GlobalTab1 for the Text column : "+SelectText_GlobalFilter+", Rows : "+failedCell_Text_GF);
			   									    	}
			   					    		            
			   				   					   	}else {
			   				   					       String Failed=getText1(driver, ValidationChart);
			   				   						   fail(driver,"Unable to get the chart value in GlobalTab1 for the selected filter "+conditionsList[k]+" , "+Failed);
			   				   					    }
			   				    			  		
			   				   					    //after checking the first tab then switch back to global filtered tab
			   					   					 clickSecondTab(driver,GlobalTab2TabId);
			   					   				     //after checking the first tab then switch back to global filtered tab 
			   									 
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
		    				  
		    			           mouseOverToElement(driver, AddButtonCondition);
		    			           click(driver,AddButtonCondition);
	    				  
		    			           verifyElementDisplayed(driver, AND_ConditionSec1);
		    			           verifyElementDisplayed(driver, OR_ConditionSec1);
	    				 
		    			           if(FirstOperator_Input_Text_GF.equals("AND")) { 
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
		    				  
		    			           mouseOverToElement(driver, AddButtonCondition);
		    			           click(driver,AddButtonCondition);
		    			           verifyElementDisplayed(driver, AND_ConditionSec2);
		    			           verifyElementDisplayed(driver, OR_ConditionSec2);
	    				  
		    			           if(SecondOperator_Input_Text_GF.equals("AND")) { 
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
		    			           elementnotvisible1(driver, RPE_Loading);
  				   				   chartpresentGlobal2=false;
  				  		      		try {
  			   			  			   WebElement chartPresent=driver.findElement(By.xpath("//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody']"));
  			   			  			   if(chartPresent.isDisplayed()) {
  			   			  				 chartpresentGlobal2=true;
  			   			  			   }
  			   			  			   
  				  		      	    }catch(Exception e) {
  			   			  			   e.printStackTrace();
  				  		      	    }	
  				    			  		 
  			   			  		    if(chartpresentGlobal2) {
  									   		WebElement chartPresent=driver.findElement(By.xpath("//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody']"));
  									   		action.moveToElement(chartPresent).build().perform();
  				    					    
  										    int j=1;
  										    boolean filteredCellGlobalTab2=true;
  										    String failedCell_Text_GF=" ";
  										    List<WebElement> FilterChartValue=driver.findElements(By.xpath("//div[contains(@id,'"+GlobalTab2TabId+"')]//div[@ref='gridBody']//div[@col-id='"+SelectText_GlobalFilter+"' and @role='gridcell']"));
  										    for(WebElement localEle:FilterChartValue) {
  										    	String FilterCellValue=localEle.getText();
  										    	
  										    	boolean condition_1_Result=Categorical_ConditionFiltercell(FirstCondition_Text_GF,FilterCellValue,FirstCondition_Input_Text_GF);
  										    	boolean condition_2_Result=Categorical_ConditionFiltercell(SecondCondition_Text_GF,FilterCellValue,SecondCondition_Input_Text_GF);
  										    	boolean condition_3_Result=Categorical_ConditionFiltercell(ThirdCondition_Text_GF,FilterCellValue,ThirdCondition_Input_Text_GF);
  										    	String operator1 = FirstOperator_Input_Text_GF; 
  										    	String operator2 = SecondOperator_Input_Text_GF;
  				    			  				 
  										    	if(!evaluateConditions(condition_1_Result,operator1,condition_2_Result,operator2,condition_3_Result)) {
  										    		filteredCellGlobalTab2=false;
  										    		failedCell_Text_GF=failedCell_Text_GF+j+", ";
  										    	}
  				    						  j++;
  										    }
  										    
  										    if(filteredCellGlobalTab2==true) {
  										    	pass(driver,"For Selected 3 Condition applied correctly in the GlobalTab2 charts..");
  									    	}else {
  								  				fail(driver,"For Selected 3 Condition Global Filter not Applied correctly in the GlobalTab2 for the Text column : "+SelectText_GlobalFilter+", Rows : "+failedCell_Text_GF);
  									    	}
  										   
  								   	 }else {
  								   	     String Failed=getText1(driver, ValidationChart);
  								   		 fail(driver,"Unable to get the chart value in GlobalTab2 for the selected filter Selected 3 Condition, "+Failed);
  								   	 }
  			   			  		     
  		   			  		        //moving to firstTab and click  (1)
  			    				     chartpresentGlobal1=clickFirstTab(driver,GlobalTab1Id);
  				   					//moving to firstTab and click
  				   					  
  			   					  	if(chartpresentGlobal1) {
  					   						int j=1;
  					    		            boolean filteredCellGlobalTab1=true;
  					    		            String failedCell_Text_GF=" ";
  					    		            List<WebElement> FilterChartValue=driver.findElements(By.xpath("//div[contains(@id,'"+GlobalTab1Id+"')]//div[@ref='gridBody']//div[@col-id='"+SelectText_GlobalFilter+"' and @role='gridcell']"));
  					    		            for(WebElement localEle:FilterChartValue) {
  					    		            	String FilterCellValue=localEle.getText();
  					    		            	
  					    		            	boolean condition_1_Result=Categorical_ConditionFiltercell(FirstCondition_Text_GF,FilterCellValue,FirstCondition_Input_Text_GF);
  										    	boolean condition_2_Result=Categorical_ConditionFiltercell(SecondCondition_Text_GF,FilterCellValue,SecondCondition_Input_Text_GF);
  										    	boolean condition_3_Result=Categorical_ConditionFiltercell(ThirdCondition_Text_GF,FilterCellValue,ThirdCondition_Input_Text_GF);
  										    	String operator1 = FirstOperator_Input_Text_GF; 
  										    	String operator2 = SecondOperator_Input_Text_GF;
  				    			  				 
  										    	if(!evaluateConditions(condition_1_Result,operator1,condition_2_Result,operator2,condition_3_Result)) {
  										    		filteredCellGlobalTab1=false;
  										    		failedCell_Text_GF=failedCell_Text_GF+j+", ";
  										    	}
  					    		            	j++;
  					    		            }
  					    		            
  					    		            if(filteredCellGlobalTab1==true) {
  										    	pass(driver,"For Selected 3 Conditions applied correctly in the GlobalTab1 charts..");
  									    	}else {
  								  				fail(driver,"For Selected 3 Conditions Global Filter not Applied correctly in the GlobalTab1 for the Text column : "+SelectText_GlobalFilter+", Rows : "+failedCell_Text_GF);
  									    	}
  					    		            
  				   					   	}else {
  				   					       String Failed=getText1(driver, ValidationChart);
  				   						   fail(driver,"Unable to get the chart value in GlobalTab1 for the selected filter Selected 3 Condition , "+Failed);
  				   					    }
  				    			  		
  				   					    //after checking the first tab then switch back to global filtered tab
  					   					 clickSecondTab(driver,GlobalTab2TabId);
  					   				     //after checking the first tab then switch back to global filtered tab
		    			            
  					   					 click(driver,RestButton_GlobalFilter);
  					   					 elementnotvisible1(driver, RPE_Loading);
  					   				     ResetGlobalValidation(driver,GlobalTab2TabId);
		    		  
			   						 }
			   					 }
				    		
					  	}else {
					  		fail(driver, SelectText_GlobalFilter+" Text Column not Expand After click on it ");
					  	}	
					  
				 }else {
					 fail(driver,SelectText_GlobalFilter+" Text Column value not present in Global filter");
				 }		  
				 //Text Local filter End....
				 
	    	 }else {
	    		  fail(driver,"Column Lists are not displayed in the global filter section");
	    	 }
	    }else {
		   System.out.println("user don't want to execute the Global Filter ");
	    }
	   //******** Global Filter Validation End *****************************//
	     
	    //******************************* Tab Filter Start **********************************//
		 String Table_TabFilter= getCellValue("TestExecution","Testcase_Selection","Table_TabFilter",Flag);
		 
	    if(Table_TabFilter.contains("Yes")) {
	    	TabFilter(driver, iteration);
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
	  		  waitForElement(driver,ColumnLists_TabFilter);
	  		  elementnotvisible1(driver, RPE_Loading);
			  if(isDisplayed(driver,FirstCategorical)) {
				  click(driver,FirstCategorical);
				  waitForElement(driver,FirstSearchedListValue);
				  WebElement firstCheckbox=getWebElement(driver, FirstSearchedListValue);
	              action.moveToElement(firstCheckbox).build().perform();
	              action.click(firstCheckbox).build().perform();
	              wait(driver,"1");
	              click(driver,ApplyButton_TabFilter);
	              elementnotvisible1(driver, RPE_Loading);
	              try {
					  WebElement chartBod1=driver.findElement(By.xpath("(//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody'])[1]"));
					  action.moveToElement(chartBod1).build().perform();
					  WebElement TabFilterIconChart=driver.findElement(By.xpath("(//div[contains(@id,'"+GlobalTab2TabId+"')]//*[name()='svg']//*[name()='g'][2]//*[name()='path'][2])[1]"));
					  action.moveToElement(TabFilterIconChart).build().perform();
					  String TabIconColorRGB=TabFilterIconChart.getCssValue("fill");
					  String tabIconColor=rgbToHex1(TabIconColorRGB);
					  
					  if("#0000FF".equalsIgnoreCase(tabIconColor)) {
						  pass(driver,"Tab Filter icon changed to blue color after Applying the Tab Filter "); 
					  }else {
						  fail(driver,"Tab Filter icon not changed to blue color after Applying the Tab Filter"); 
					  } 
					  
				  }catch(Exception e) {
					  fail(driver,"unable to find the Tabfilter icon in the chart");
				  }
			  }
			  
	  	   } //tab filter checked..
	  	   
	  	   waitForElement(driver,GlobalFilterOption);
	  	   click(driver,GlobalFilterOption);
	  	   waitForElement(driver,DataColumnList_GlobalFilter);
	  	   elementnotvisible1(driver, RPE_Loading);
		   if(isDisplayed(driver,FirstCategorical)) {
				  click(driver,FirstCategorical);
				  waitForElement(driver,FirstSearchedListValue);
				  WebElement firstCheckbox=getWebElement(driver, FirstSearchedListValue);
		          action.moveToElement(firstCheckbox).build().perform();
		          action.click(firstCheckbox).build().perform();
		          wait(driver,"1");
		          click(driver,ApplyButton_GlobalFilter);
		          elementnotvisible1(driver, RPE_Loading);
		          try {
			    	  WebElement chartBod1=driver.findElement(By.xpath("(//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody'])[1]"));
					  action.moveToElement(chartBod1).build().perform();
					  WebElement GlobalFilterIconChart=driver.findElement(By.xpath("(//div[contains(@id,'"+GlobalTab2TabId+"')]//*[name()='svg']//*[name()='g'][2]//*[name()='path'][3])[1]"));
					  action.moveToElement(GlobalFilterIconChart).build().perform();
					  String globalIconColorRGB=GlobalFilterIconChart.getCssValue("fill");
					  String globalIconColor=rgbToHex1(globalIconColorRGB);
					  
					  if("#FF3333".equalsIgnoreCase(globalIconColor)) {
						  pass(driver,"Global Filter icon changed to Red color after Applying the Global Filter"); 
					  }else {
						  fail(driver,"Global Filter icon not changed to Red color after Applying the Global Filter"); 
					  }
					  
				  }catch(Exception e) {
					  fail(driver," "+e.getLocalizedMessage());
					  e.printStackTrace();
				  }
		     } // global applied ..
		   
		   try {
		     WebElement chartBod1=driver.findElement(By.xpath("(//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody'])[1]"));
		     action.moveToElement(chartBod1).build().perform();
		     WebElement localFilter=driver.findElement(By.xpath("(//div[@id='"+GlobalTab2TabId+"_div']//div[contains(@id,'RPE_header_filter')]//*[name()='svg'])[1]"));
		     action.moveToElement(localFilter).click().build().perform();
		     
		     waitForElement(driver,LocalFilterSec);
		     
		     if(isToggleEnable(driver, Tab_inputToggle_LocalFilter) && isToggleEnable(driver, Global_inputToggle_LocalFilter)) {
				  pass(driver,"Tab toggle and Global toggle is enabled in the Local Filter Section");
				  click(driver,Tab_toggle_LocalFilter);
				  wait(driver,"1");
				  if(isToggleEnable(driver, Tab_inputToggle_LocalFilter)) {
					  fail(driver,"Tab toggle in the Local Filter Section not disbaled while click on it");
				  }else {
					  pass(driver,"Tab toggle in the Local Filter disbaled while click on it");
				  }
				  click(driver,Global_toggle_LocalFilter);
				  wait(driver,"1");
				  if(isToggleEnable(driver, Global_inputToggle_LocalFilter)) {
					  fail(driver,"Global toggle in the Local Filter Section not disbaled while click on it");
				  }else {
					  pass(driver,"Global toggle in the Local Filter disbaled while click on it");
				  }
				  
				  click(driver,ApplyButton_LocalFilter);
				  elementnotvisible1(driver, RPE_Loading);
				  
		    	  chartBod1=driver.findElement(By.xpath("(//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody'])[1]"));
				  action.moveToElement(chartBod1).build().perform();
				  WebElement GlobalFilterIconChart=driver.findElement(By.xpath("(//div[contains(@id,'"+GlobalTab2TabId+"')]//*[name()='svg']//*[name()='g'][2]//*[name()='path'][3])[1]"));
				  action.moveToElement(GlobalFilterIconChart).build().perform();
				  WebElement TabFilterIconChart=driver.findElement(By.xpath("(//div[contains(@id,'"+GlobalTab2TabId+"')]//*[name()='svg']//*[name()='g'][2]//*[name()='path'][2])[1]"));
				  action.moveToElement(TabFilterIconChart).build().perform();
				  String TabIconColorRGB=TabFilterIconChart.getCssValue("fill");
				  String tabIconColor=rgbToHex1(TabIconColorRGB);
				  String globalIconColorRGB=GlobalFilterIconChart.getCssValue("fill");
				  String globalIconColor=rgbToHex1(globalIconColorRGB);
				  
				  if(!"#0000FF".equalsIgnoreCase(tabIconColor)) {
					  pass(driver,"Tab Filter condition successfully removed in the chart after disablig the Tab toggle in the Local Filter"); 
				  }else {
					  fail(driver,"Tab Filter condition not removed in the chart after disablig the Tab toggle in the Local Filter"); 
				  } 
				  
				  if(!"#FF3333".equalsIgnoreCase(globalIconColor)) {
					  pass(driver,"Global Filter condition successfully removed in the chart after disablig the Global toggle in the Local Filter"); 
				  }else {
					  fail(driver,"Global Filter condition not removed in the chart after disablig the Global toggle in the Local Filter"); 
				  }
	        } 
		     
		  }catch(Exception e) {
			  fail(driver," "+e.getLocalizedMessage());
			  e.printStackTrace();
		  }
				  
		  try {
			  
			  if(!isDisplayed(driver,body2)) {
	    		  mouseOverToElement(driver, body);
	    		  waitForElement(driver,copyChart);
		    	  mouseOverToElement(driver,copyChart);
		    	  click(driver,copyChart);
		    	  if(isDisplayed(driver, body2)) {
		    		  pass(driver,"Chart Copied Succesfully");
		    	  }else {
		    		  fail(driver,"Chart not Copied Succesfully");
		    	  }
	    	  }
			  
			  WebElement chartBod1=driver.findElement(By.xpath("(//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody'])[1]"));
			  action.moveToElement(chartBod1).build().perform();
			  WebElement EditeChart=driver.findElement(By.xpath("(//div[@id='"+GlobalTab2TabId+"_div']//i[contains(@class,'edit')])[1]"));
			  action.moveToElement(EditeChart).click().build().perform();
			  
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
	 
					  chartBod1=driver.findElement(By.xpath("(//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody'])[1]"));
			  action.moveToElement(chartBod1).build().perform();
			  List<WebElement> beforeDeleteChart=driver.findElements(By.xpath("//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody']"));
			  int beforeDeleteSize=beforeDeleteChart.size();
			  WebElement deleteChart=driver.findElement(By.xpath("(//div[@id='"+GlobalTab2TabId+"_div']//i[contains(@class,'trash')])[1]"));
			  action.moveToElement(deleteChart).click().build().perform();
			  waitForElement(driver,deleteConfirmButton);
			  click(driver,deleteConfirmButton);
			  wait(driver,"1");
			  List<WebElement> afterDeleteChart=driver.findElements(By.xpath("//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody']"));
			  int afterDeleteSize=afterDeleteChart.size();
			  if(beforeDeleteSize>afterDeleteSize) {
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
	
	
	public boolean clickFirstTab(WebDriver driver,String id) {
		Actions action=new Actions(driver);
		boolean chartpresentGlobal1=false;
			  try {
				  WebElement tab1=driver.findElement(By.xpath("//li[@id='"+id+"']//a"));
				  action.moveToElement(tab1).build().perform();
				  action.click(tab1).build().perform();
				  elementnotvisible(driver,Loading1);
				  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				  WebElement chartPresent=driver.findElement(By.xpath("//div[@id='"+id+"_div']//div[@ref='gridBody']"));
				  if(chartPresent.isDisplayed()) {
					  action.moveToElement(chartPresent).build().perform();
					 chartpresentGlobal1=true;
				  }else {
					  fail(driver,"GlobalTab1 not opened after click on it");
				  }
				  
				  return chartpresentGlobal1;
			  }catch(Exception e) {
				  //e.printStackTrace();
				  return false;
			  }
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
	
	public void ResetGlobalValidation(WebDriver driver,String id) {
		
		  Actions action=new Actions(driver);
	      	boolean chartpresentGlobal2=false;
			try {
				WebElement chartPresent=driver.findElement(By.xpath("//div[@id='"+id+"_div']//div[@ref='gridBody']"));
				if(chartPresent.isDisplayed()) {
					chartpresentGlobal2=true;
				}
	   	  	}catch(Exception e) {
	   	  		e.printStackTrace();
	   	  	}
	  
			try {
				if(chartpresentGlobal2) {
		   			WebElement chartPresent=driver.findElement(By.xpath("//div[@id='"+id+"_div']//div[@ref='gridBody']"));
		   			action.moveToElement(chartPresent).build().perform();
		   		 
		   			WebElement globalFilterIconChartTab3=driver.findElement(By.xpath("//div[contains(@id,'"+id+"')]//*[name()='svg']//*[name()='g'][2]//*[name()='path'][3]"));
		   			action.moveToElement(globalFilterIconChartTab3).build().perform();
		   			String globalIconColorRGB=globalFilterIconChartTab3.getCssValue("fill");
		   			String globalIconColor=rgbToHex1(globalIconColorRGB);
				  
		   			if("#FF3333".equalsIgnoreCase(globalIconColor)) {
		   				fail(driver,"Global Filter icon not changed to default color after Reseting the Global Filter"); 
		   			}else {
		   				pass(driver,"Global Filter icon changed to default color after Reseting the Global Filter"); 
		   			}
		   		 
		   	  	}else {
		   	  		fail(driver,"After Click the Reset button in global filter not able to find the chart..");
		   	  	}
			}catch(Exception e) {
				fail(driver,"After Click the Reset button Unable to Validate the global filter icon ins the chart..");
//	   	  		e.printStackTrace();
	   	  	}
			
		
	}
	
	
	public void TabFilter(WebDriver driver,int iteration) throws Exception {
		
		//Tab filter inputs Categorical
		String SelectCategorical_TabFilter=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_TabFilter_Table", "SelectCategoricalColumn_Smoke_TabFilter");
		String ByValuesInput_Categorical_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_TabFilter_Table", "ByValuesInput_Categorical_TF");
		String FirstCondition_1_Categorical_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_TabFilter_Table", "FirstCondition_1_Categorical_TF");
		String FirstCondition_2_Categorical_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_TabFilter_Table", "FirstCondition_2_Categorical_TF");
		String FirstCondition_3_Categorical_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_TabFilter_Table", "FirstCondition_3_Categorical_TF");
		String FirstCondition_4_Categorical_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_TabFilter_Table", "FirstCondition_4_Categorical_TF");
		String FirstCondition_5_Categorical_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_TabFilter_Table", "FirstCondition_5_Categorical_TF");
		String FirstCondition_6_Categorical_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_TabFilter_Table", "FirstCondition_6_Categorical_TF");
		String FirstCondition_7_Categorical_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_TabFilter_Table", "FirstCondition_7_Categorical_TF");
		String FirstCondition_8_Categorical_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_TabFilter_Table", "FirstCondition_8_Categorical_TF");
		String FirstCondition_Input_1_Categorical_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_TabFilter_Table", "FirstCondition_Input_1_Categorical_TF");
		String FirstCondition_Input_2_Categorical_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_TabFilter_Table", "FirstCondition_Input_2_Categorical_TF");
		String FirstCondition_Input_3_Categorical_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_TabFilter_Table", "FirstCondition_Input_3_Categorical_TF");
		String FirstCondition_Input_4_Categorical_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_TabFilter_Table", "FirstCondition_Input_4_Categorical_TF");
		String FirstCondition_Input_5_Categorical_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_TabFilter_Table", "FirstCondition_Input_5_Categorical_TF");
		String FirstCondition_Input_6_Categorical_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_TabFilter_Table", "FirstCondition_Input_6_Categorical_TF");
		String FirstCondition_Input_7_Categorical_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_TabFilter_Table", "FirstCondition_Input_7_Categorical_TF");
		String FirstCondition_Input_8_Categorical_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_TabFilter_Table", "FirstCondition_Input_8_Categorical_TF");
		String FirstCondition_Categorical_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_TabFilter_Table", "FirstCondition_Categorical_TF");
		String FirstCondition_Input_Categorical_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_TabFilter_Table", "FirstCondition_Input_Categorical_TF");
		String FirstOperator_Input_Categorical_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_TabFilter_Table", "FirstOperator_Input_Categorical_TF");
		String SecondOperator_Input_Categorical_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_TabFilter_Table", "SecondOperator_Input_Categorical_TF");
		String SecondCondition_Categorical_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_TabFilter_Table", "SecondCondition_Categorical_TF");
		String SecondCondition_Input_Categorical_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_TabFilter_Table", "SecondCondition_Input_Categorical_TF");
		String ThirdCondition_Categorical_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_TabFilter_Table", "ThirdCondition_Categorical_TF");
		String ThirdCondition_Input_Categorical_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Categorical_TabFilter_Table", "ThirdCondition_Input_Categorical_TF");

		//Tab filter inputs Date
		String SelectDateColumn_Smoke_TabFilter=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Table", "SelectDateColumn_Smoke_TabFilter");
		String RelativeFilter_1_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Table", "RelativeFilter_1_Date_TF");
		String RelativeFilter_2_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Table", "RelativeFilter_2_Date_TF");
		String RelativeFilter_3_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Table", "RelativeFilter_3_Date_TF");
		String RelativeFilter_4_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Table", "RelativeFilter_4_Date_TF");
		String RelativeFilter_5_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Table", "RelativeFilter_5_Date_TF");
		String RelativeFilter_6_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Table", "RelativeFilter_6_Date_TF");
		String RelativeFilter_7_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Table", "RelativeFilter_7_Date_TF");
		String RelativeFilter_8_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Table", "RelativeFilter_8_Date_TF");
		String RelativeFilter_9_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Table", "RelativeFilter_9_Date_TF");
		String RelativeFilter_10_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Table", "RelativeFilter_10_Date_TF");
		String RelativeFilter_11_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Table", "RelativeFilter_11_Date_TF");
		String RelativeFilter_12_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Table", "RelativeFilter_12_Date_TF");
		String RelativeFilter_13_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Table", "RelativeFilter_13_Date_TF");
		String RelativeFilter_14_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Table", "RelativeFilter_14_Date_TF");
		String RelativeFilter_11_Input_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Table", "RelativeFilter_11_Input_Date_TF");
		String RelativeFilter_12_Input_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Table", "RelativeFilter_12_Input_Date_TF");
		String RelativeFilter_13_Input_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Table", "RelativeFilter_13_Input_Date_TF");
		String RelativeFilter_14_Input_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Table", "RelativeFilter_14_Input_Date_TF");
		String Condition_1_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Table", "Condition_1_Date_TF");
		String Condition_2_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Table", "Condition_2_Date_TF");
		String Condition_3_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Table", "Condition_3_Date_TF");
		String Condition_4_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Table", "Condition_4_Date_TF");
		String Condition_5_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Table", "Condition_5_Date_TF");
		String Condition_6_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Table", "Condition_6_Date_TF");
		String Condition_7_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Table", "Condition_7_Date_TF");
		String Condition_8_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Table", "Condition_8_Date_TF");
		String Condition_9_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Table", "Condition_9_Date_TF");
		String Condition_1_Input_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Table", "Condition_1_Input_Date_TF");
		String Condition_2_Input_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Table", "Condition_2_Input_Date_TF");
		String Condition_3_Input_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Table", "Condition_3_Input_Date_TF");
		String Condition_4_Input_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Table", "Condition_4_Input_Date_TF");
		String Condition_5_Input_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Table", "Condition_5_Input_Date_TF");
		String Condition_6_Input_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Table", "Condition_6_Input_Date_TF");
		String Condition_7_Input_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Table", "Condition_7_Input_Date_TF");
		String Condition_8_Input_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Table", "Condition_8_Input_Date_TF");
		String Condition_9_InputA_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Table", "Condition_9_InputA_Date_TF");
		String Condition_9_InputB_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Table", "Condition_9_InputB_Date_TF");
		
		String FirstCondition_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Table", "FirstCondition_Date_TF");
		String SecondCondition_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Table", "SecondCondition_Date_TF");
		String ThirdCondition_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Table", "ThirdCondition_Date_TF");
		String FirstCondition_Date_Input_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Table", "FirstCondition_Date_Input_TF");
		String SecondCondition_Date_Input_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Table", "SecondCondition_Date_Input_TF");
		String ThirdCondition_Date_Input_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Table", "ThirdCondition_Date_Input_TF");
		String FirstOperator_Input_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Table", "FirstOperator_Input_Date_TF");
		String SecondOperator_Input_Date_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Date_TabFilter_Table", "SecondOperator_Input_Date_TF");
	
		// Numerical Tab Filter Inputs
		String SelectNumerical_Smoke_TabFilter=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Table", "SelectNumericalColumn_Smoke_TabFilter");
		String Condition_1_Num_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Table", "Condition_1_Num_TF");
		String Condition_2_Num_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Table", "Condition_2_Num_TF");
		String Condition_3_Num_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Table", "Condition_3_Num_TF");
		String Condition_4_Num_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Table", "Condition_4_Num_TF");
		String Condition_5_Num_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Table", "Condition_5_Num_TF");
		String Condition_6_Num_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Table", "Condition_6_Num_TF");
		String Condition_7_Num_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Table", "Condition_7_Num_TF");
		String Condition_8_Num_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Table", "Condition_8_Num_TF");
		String Condition_9_Num_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Table", "Condition_9_Num_TF");
		String Condition_1_Input_Num_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Table", "Condition_1_Input_Num_TF");
		String Condition_2_Input_Num_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Table", "Condition_2_Input_Num_TF");
		String Condition_3_Input_Num_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Table", "Condition_3_Input_Num_TF");
		String Condition_4_Input_Num_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Table", "Condition_4_Input_Num_TF");
		String Condition_5_Input_Num_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Table", "Condition_5_Input_Num_TF");
		String Condition_6_Input_Num_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Table", "Condition_6_Input_Num_TF");
		String Condition_7_Input_Num_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Table", "Condition_7_Input_Num_TF");
		String Condition_8_Input_Num_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Table", "Condition_8_Input_Num_TF");
		String Condition_9_InputA_Num_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Table", "Condition_9_InputA_Num_TF");
		String Condition_Between_InputB_Num_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Table", "Condition_Between_InputB_Num_TF");
		
		String FirstCondition_Num_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Table", "FirstCondition_Num_TF");
		String SecondCondition_Num_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Table", "SecondCondition_Num_TF");
		String ThirdCondition_num_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Table", "ThirdCondition_num_TF");
		String FirstCondition_Num_Input_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Table", "FirstCondition_Num_Input_TF");
		String SecondCondition_Num_Input_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Table", "SecondCondition_Num_Input_TF");
		String ThirdCondition_Num_Input_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Table", "ThirdCondition_Num_Input_TF");
		String FirstOperator_Input_Num_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Table", "FirstOperator_Input_Num_TF");
		String SecondOperator_Input_Num_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Numerical_TabFilter_Table", "SecondOperator_Input_Num_TF");
		     
		//Tab filter inputs Text
		String SelectText_TabFilter=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_TabFilter_Table", "SelectText_Smoke_TabFilter");
		String ByValuesInput_Text_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_TabFilter_Table", "ByValuesInput_Text_TF");
		String Condition_1_Text_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_TabFilter_Table", "Condition_1_Text_TF");
		String Condition_2_Text_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_TabFilter_Table", "Condition_2_Text_TF");
		String Condition_3_Text_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_TabFilter_Table", "Condition_3_Text_TF");
		String Condition_4_Text_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_TabFilter_Table", "Condition_4_Text_TF");
		String Condition_5_Text_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_TabFilter_Table", "Condition_5_Text_TF");
		String Condition_6_Text_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_TabFilter_Table", "Condition_6_Text_TF");
		String Condition_7_Text_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_TabFilter_Table", "Condition_7_Text_TF");
		String Condition_8_Text_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_TabFilter_Table", "Condition_8_Text_TF");
		String Condition_Input_1_Text_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_TabFilter_Table", "Condition_Input_1_Text_TF");
		String Condition_Input_2_Text_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_TabFilter_Table", "Condition_Input_2_Text_TF");
		String Condition_Input_3_Text_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_TabFilter_Table", "Condition_Input_3_Text_TF");
		String Condition_Input_4_Text_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_TabFilter_Table", "Condition_Input_4_Text_TF");
		String Condition_Input_5_Text_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_TabFilter_Table", "Condition_Input_5_Text_TF");
		String Condition_Input_6_Text_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_TabFilter_Table", "Condition_Input_6_Text_TF");
		String Condition_Input_7_Text_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_TabFilter_Table", "Condition_Input_7_Text_TF");
		String Condition_Input_8_Text_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_TabFilter_Table", "Condition_Input_8_Text_TF");
		String FirstCondition_Text_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_TabFilter_Table", "FirstCondition_Text_TF");
		String FirstCondition_Input_Text_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_TabFilter_Table", "FirstCondition_Input_Text_TF");
		String FirstOperator_Input_Text_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_TabFilter_Table", "FirstOperator_Input_Text_TF");
		String SecondOperator_Input_Text_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_TabFilter_Table", "SecondOperator_Input_Text_TF");
		String SecondCondition_Text_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_TabFilter_Table", "SecondCondition_Text_TF");
		String SecondCondition_Input_Text_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_TabFilter_Table", "SecondCondition_Input_Text_TF");
		String ThirdCondition_Text_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_TabFilter_Table", "ThirdCondition_Text_TF");
		String ThirdCondition_Input_Text_TF=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_Input_Text_TabFilter_Table", "ThirdCondition_Input_Text_TF");

		
		
		 //**************** TabFilter Validation startss************************ 
  	   
		Actions action=new Actions(driver);
		String GlobalTab2TabId=getAttribute(driver, CurrentTab, "id");
	  
		  GlobalTab2TabId=getAttribute(driver, CurrentTab, "id");
		  WebElement chart1=driver.findElement(By.xpath("//div[@id='"+GlobalTab2TabId+"_div']//div[contains(@class,'gr-chart-header')]"));
		  action.moveToElement(chart1).build().perform();
		  wait(driver,"1");
		  WebElement copyChartElement=driver.findElement(By.xpath("//div[@id='"+GlobalTab2TabId+"_div']//i[contains(@class,'copy')]"));
		  action.moveToElement(copyChartElement).build().perform();
		  action.click(copyChartElement).build().perform();
		
		  WebElement secondChart=driver.findElement(By.xpath("(//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody'])[2]"));
		  if(secondChart.isDisplayed()) {
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
			  
			  if(isDisplayed(driver,ColumnLists_TabFilter)) {
				  pass(driver,"ColumnLists Section present in the Tab Filter ");
				  
				  
			       //categorical Dynamic change Start... 
			    		  boolean categoricalFilter=false;
			    		  try {
			    			  WebElement CategoricalColumn= driver.findElement(By.xpath("//div[@id='dashboardTRPE_select_filterColsCon']//div[@id='"+SelectCategorical_TabFilter+"']//a"));
				    		  action.moveToElement(CategoricalColumn).click().build().perform();
				    		  categoricalFilter=true;
			    		  }catch(Exception e) {
			    			  
			    		  }
			    		  
			    		  
				         if(categoricalFilter==true) {
				    		  WebElement CategoricalColumnExp=driver.findElement(By.xpath("//div[@id='dashboardTRPE_select_filterColsCon']//div[@id='"+SelectCategorical_TabFilter+"']//a//i"));
				    		  String CategoricalColumnExpText=CategoricalColumnExp.getAttribute("class");
				    		  if(CategoricalColumnExpText.contains("up")) {
				    			  if(verifyElementDisplayed(driver, byValueFilterOption)) {
				    				  try {
					    				  WebElement ByValueElementRadio=driver.findElement(By.xpath("//div[@id='"+SelectCategorical_TabFilter+"_content']//div[@id='byRelative_div']//input"));
					    				  if(ByValueElementRadio.isSelected()) {
					    					  pass(driver,"By default, 'By Values' radio button selected ");
					    				  }else {
					    					  fail(driver,"By default, 'By Values' radio button not selected ");
					    				  }
					    			  }catch(Exception e) {
					    				  fail(driver,"Unable to find 'By Values' radio button ");
					    				  //e.printStackTrace();
					    			  }
			    				  }
				    			  
				    			  verifyElementDisplayed(driver, AllCheckbox_CategoricalSec);
		    				      verifyElementDisplayed(driver, CategoricalSearchListOptions);
		    				      verifyElementDisplayed(driver, ExcludeOption_Categorical);
		    				      verifyElementDisplayed(driver, ExcludeCheckbox);
	
		    				      List<WebElement> searchListAvailable=driver.findElements(By.xpath("//div[@id='"+SelectCategorical_TabFilter+"_FactorsList']//li"));
		    				      List<WebElement> searchListCheckboxAvailable=driver.findElements(By.xpath("//div[@id='"+SelectCategorical_TabFilter+"_FactorsList']//li//input[@type='checkbox']"));
		    				      if(searchListAvailable.size()==searchListCheckboxAvailable.size()) {
		    				    	  pass(driver,"All the available searchlist are displayed with Checkbox");
		    				      }else {
		    				    	  fail(driver,"Some available searchlist are not displayed with Checkbox");
		    				      }
		    				      
		    				      
				    			  WebElement SearchBar_=driver.findElement(By.xpath("//input[@id='"+SelectCategorical_TabFilter+"LFsearch']"));
				    			  SearchBar_.click();
				    			  wait(driver,"1");
				    			  SearchBar_.sendKeys(ByValuesInput_Categorical_TF);
				    			  pass(driver,"Type On Value "+ByValuesInput_Categorical_TF+" search input");
				    			  wait(driver,"1");
				    			  WebElement firstOption=driver.findElement(By.xpath("(//div[@id='"+SelectCategorical_TabFilter+"_FactorsList']//li)[1]"));
				    			  String firstOptionText=firstOption.getText();
				    			  if(firstOptionText.equals(ByValuesInput_Categorical_TF)) {
				    				  pass(driver,"Search bar inside the Categorical section works properly");
				    			  }else {
				    				  fail(driver,"Search bar inside the Categorical section not works properly");
				    			  }
			    			  
				    			  firstOption.click();
			    				  wait(driver,"1");
			    				  WebElement firstCheckBox=driver.findElement(By.xpath("(//div[@id='"+SelectCategorical_TabFilter+"_FactorsList']//li//input)[1]"));
					    		  if(firstCheckBox.isSelected()){
					    			  pass(driver,"Check box selected when click the First searched value");
					    		  }else {
					    			  fail(driver,"Check box not selected when click the First searched value");
					    		  }
					    		  
					    		  click(driver,ApplyButton_TabFilter);
					    		  elementnotvisible1(driver, RPE_Loading);
		    					  for (int m=1;m<=2;m++) {
		    						  
		    						  boolean chartdisplay=false;
		    						  try {
	    	    						  WebElement chartBod1=driver.findElement(By.xpath("(//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody'])["+m+"]"));
	    	    						  if(chartBod1.isDisplayed()) {
	    	    							  chartdisplay=true;
	    	    						  }
	    	    					  }catch(Exception e) {
		    						  
		    					      }
		    						  
		    						  if(chartdisplay==true) {
		    							  
		    							  WebElement chartBod1=driver.findElement(By.xpath("(//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody'])["+m+"]"));
		    							  action.moveToElement(chartBod1).build().perform();
		    							  
		    							  try {
		        							  WebElement TabFilterIconChart=driver.findElement(By.xpath("(//div[contains(@id,'"+GlobalTab2TabId+"')]//*[name()='svg']//*[name()='g'][2]//*[name()='path'][2])["+m+"]"));
		        							  action.moveToElement(TabFilterIconChart).build().perform();
		        							  String TabIconColorRGB=TabFilterIconChart.getCssValue("fill");
		        							  String tabIconColor=rgbToHex1(TabIconColorRGB);
		        							  
		        							  if("#0000FF".equalsIgnoreCase(tabIconColor)) {
		        								  pass(driver,"Chart"+m+" Tab Filter icon changed to Blue color after Applying the Tab Filter"); 
		        							  }else {
		        								  fail(driver,"Chart"+m+" Tab Filter icon not changed to Blue color after Applying the Tab Filter"); 
		        							  }
		        							  
		        						  }catch(Exception e) {
		        							  fail(driver,"unable to find the Tabfilter icon in the chart result");
		        						  }
		    							  
		    							  int j=1;
	    			    		          boolean filteredCell=true;
	    			    		          String failedValues=" ";
	    		    					  List<WebElement> FilterChartValue=driver.findElements(By.xpath("(//div[contains(@id,'"+GlobalTab2TabId+"')]//div[@ref='gridBody'])["+m+"]//div[@col-id='"+SelectCategorical_TabFilter+"' and @role='gridcell']"));
	    		    					  for(WebElement localEle:FilterChartValue) {
	    		    						  String FilterCellValue=localEle.getText();
	    		    						  
	    		    						  if(!FilterCellValue.equals(ByValuesInput_Categorical_TF)) {
	    		    							  filteredCell=false;
	    		    							  failedValues=failedValues+j+", ";
	    		    						  }
	    		    						  j++;
	    		    					  }
	    		    					  
	    			    		         if(filteredCell==true) {
	    			  			    	       pass(driver,"For 'By Values' condition applied correctly in the chart"+m);
	    			  			          }else {
	    	    							  fail(driver,"By Value Local Filter not Applied correctly in the chart"+m+" for the Categorical column : "+SelectCategorical_TabFilter+", Rows : "+failedValues);
	    			  			          }
		    							  
		    						  }else {
		    							  fail(driver,"Unable to get the chart"+m+"  for the selected filter, By Values ");
		    						  }
		    						  
		    						  
		    					  }
		    					  
					    		  click(driver,ExcludeCheckbox);
					    		  click(driver,ApplyButton_TabFilter);
					    		  elementnotvisible1(driver, RPE_Loading);
					    		  
					    		  for (int m=1;m<=2;m++) {
					    			  
		    						  boolean chartdisplay=false;
		    						  try {
	    	    						  WebElement chartBod1=driver.findElement(By.xpath("(//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody'])["+m+"]"));
	    	    						  if(chartBod1.isDisplayed()) {
	    	    							  chartdisplay=true;
	    	    						  }
	    	    					  }catch(Exception e) {
		    						  
		    					      }
		    						  
		    						  if(chartdisplay==true) {
		    							  
		    							  WebElement chartBod1=driver.findElement(By.xpath("(//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody'])["+m+"]"));
		    							  action.moveToElement(chartBod1).build().perform();
		    							  
		    							  try {
		        							  WebElement TabFilterIconChart=driver.findElement(By.xpath("(//div[contains(@id,'"+GlobalTab2TabId+"')]//*[name()='svg']//*[name()='g'][2]//*[name()='path'][2])["+m+"]"));
		        							  action.moveToElement(TabFilterIconChart).build().perform();
		        							  String TabIconColorRGB=TabFilterIconChart.getCssValue("fill");
		        							  String tabIconColor=rgbToHex1(TabIconColorRGB);
		        							  
		        							  if("#0000FF".equalsIgnoreCase(tabIconColor)) {
		        								  pass(driver,"Chart"+m+" Tab Filter icon to Blue color after Applying the Tab Filter"); 
		        							  }else {
		        								  fail(driver,"Chart"+m+" Tab Filter icon not changed to Blue color after Applying the Tab Filter"); 
		        							  }
		        							  
		        						  }catch(Exception e) {
		        							  fail(driver,"unable to find the Tabfilter icon in the chart result");
		        						  }
		    							  
		    							  int j=1;
	    			    		          boolean filteredCell=true;
	    			    		          String failedValues=" ";
	    		    					  List<WebElement> FilterChartValue=driver.findElements(By.xpath("(//div[contains(@id,'"+GlobalTab2TabId+"')]//div[@ref='gridBody'])["+m+"]//div[@col-id='"+SelectCategorical_TabFilter+"' and @role='gridcell']"));
	    		    					  for(WebElement localEle:FilterChartValue) {
	    		    						  String FilterCellValue=localEle.getText();
	    		    						  
	    		    						  if(FilterCellValue.equals(ByValuesInput_Categorical_TF)) {
	    		    							  filteredCell=false;
	    		    							  failedValues=failedValues+j+", ";
	    		    						  }
	    		    						  j++;
	    		    					  }
	    			    		          if(filteredCell==true) {
	    					  			    	pass(driver,"For 'By Values 'Exclude' ' condition applied correctly in the chart"+m);
	    			  			    	  }else {
	    		    							fail(driver,"By Value Local 'Exclude' Filter not Applied correctly in the chart"+m+" for the Categorical column : "+SelectCategorical_TabFilter+", Rows : "+failedValues);
	    			  			    	  }
	    			    		         
		    						  }else {
		    							  fail(driver,"Unable to get the chart"+m+"  for the selected filter, By Values with Exclude");
		    						  }
		    					  }  // loop end for 2 charts validation ..
					    	
						    		  
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
	    				    			  		 elementnotvisible1(driver, RPE_Loading);
	    				    			  		 
	    				    			  		 for (int m=1;m<=2;m++) {
	    		    				    			  
	    		    	    						  boolean chartdisplay=false;
	    		    	    						  try {
	    			    	    						  WebElement chartBod1=driver.findElement(By.xpath("(//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody'])["+m+"]"));
	    			    	    						  if(chartBod1.isDisplayed()) {
	    			    	    							  chartdisplay=true;
	    			    	    						  }
	    			    	    					  }catch(Exception e) {
	    		    	    						  
	    		    	    					      }
	    		    	    						  
	    		    	    						  if(chartdisplay==true) {
	    		    	    							  
	    		    	    							  WebElement chartBod1=driver.findElement(By.xpath("(//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody'])["+m+"]"));
	    		    	    							  action.moveToElement(chartBod1).build().perform();
	    		    	    							  
	    		    	    							  int j=1;
	    			    			    		          boolean filteredCell=true;
	    			    			    		          String failedValues=" ";
	    			    		    					  List<WebElement> FilterChartValue=driver.findElements(By.xpath("(//div[contains(@id,'"+GlobalTab2TabId+"')]//div[@ref='gridBody'])["+m+"]//div[@col-id='"+SelectCategorical_TabFilter+"' and @role='gridcell']"));
	    			    		    					  for(WebElement localEle:FilterChartValue) {
	    			    		    						  String FilterCellValue=localEle.getText();
	    			    		    						  
	    			    		    						  if(!Categorical_ConditionFiltercell(conditionsList[k],FilterCellValue,conditionsInputList[k])) {
		    				    			  					   filteredCell=false;
		    				    			  					 failedValues=failedValues+j+", ";
		    				    			  				  }
	    			    		    						  j++;
	    			    		    					  }
	    			    			    		          if(filteredCell==true) {
	    			    					  			    	pass(driver,"For '"+conditionsList[k]+"' condition applied correctly in the chart"+m);
	    			    			  			    	  }else {
	    			    		    							fail(driver,"For '"+conditionsList[k]+"' condition not Applied correctly in the chart"+m+" for the Categorical column : "+SelectCategorical_TabFilter+", Rows : "+failedValues);
	    			    			  			    	  }
	    			    			    		         
	    		    	    						  }else {
	    		    	    							  fail(driver,"Unable to get the chart"+m+"  for the selected filter, "+conditionsList[k]);
	    		    	    						  }
	    		    	    					  }  // loop end for 2 charts validation ..
	    				    			  		 
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
					    				  
				    				  mouseOverToElement(driver, AddButtonCondition);
				    				  click(driver,AddButtonCondition);
				    				  
				    				  verifyElementDisplayed(driver, AND_ConditionSec1);
				    				  verifyElementDisplayed(driver, OR_ConditionSec1);
				    				 
				    				  if(FirstOperator_Input_Categorical_TF.equals("AND")) { 
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
					    				  
				    				  mouseOverToElement(driver, AddButtonCondition);
				    				  click(driver,AddButtonCondition);
				    				  verifyElementDisplayed(driver, AND_ConditionSec2);
				    				  verifyElementDisplayed(driver, OR_ConditionSec2);
				    				  
				    				  if(SecondOperator_Input_Categorical_TF.equals("AND")) { 
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
			    					  elementnotvisible1(driver, RPE_Loading);
			    			  		  for (int m=1;m<=2;m++) {
	    				    			  
	    	    						  boolean chartdisplay=false;
	    	    						  try {
		    	    						  WebElement chartBod1=driver.findElement(By.xpath("(//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody'])["+m+"]"));
		    	    						  if(chartBod1.isDisplayed()) {
		    	    							  chartdisplay=true;
		    	    						  }
		    	    					  }catch(Exception e) {
	    	    						  
	    	    					      }
	    	    						  
	    	    						  if(chartdisplay==true) {
	    	    							  
	    	    							  WebElement chartBod1=driver.findElement(By.xpath("(//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody'])["+m+"]"));
	    	    							  action.moveToElement(chartBod1).build().perform();
	    	    							  
	    	    							  int j=1;
		    			    		          boolean filteredCell=true;
		    			    		          String failedValues=" ";
		    		    					  List<WebElement> FilterChartValue=driver.findElements(By.xpath("(//div[contains(@id,'"+GlobalTab2TabId+"')]//div[@ref='gridBody'])["+m+"]//div[@col-id='"+SelectCategorical_TabFilter+"' and @role='gridcell']"));
		    		    					  for(WebElement localEle:FilterChartValue) {
		    		    						  String FilterCellValue=localEle.getText();
		    		    						  
		    		    						  boolean condition_1_Result=Categorical_ConditionFiltercell(FirstCondition_Categorical_TF,FilterCellValue,FirstCondition_Input_Categorical_TF);
		    		    						  boolean condition_2_Result=Categorical_ConditionFiltercell(SecondCondition_Categorical_TF,FilterCellValue,SecondCondition_Input_Categorical_TF);
		    		    						  boolean condition_3_Result=Categorical_ConditionFiltercell(ThirdCondition_Categorical_TF,FilterCellValue,ThirdCondition_Input_Categorical_TF);
		    		    						  String operator1 = FirstOperator_Input_Categorical_TF; 
		    		    						  String operator2 = SecondOperator_Input_Categorical_TF;
				    			  				 
				    			  				 	if(!evaluateConditions(condition_1_Result,operator1,condition_2_Result,operator2,condition_3_Result)) {
				    			  				 		filteredCell=false;
				    			  				 		failedValues=failedValues+j+", ";
				    			  				 	}
		    		    						  j++;
		    		    					  }
		    		    					  
		    			    		          if(filteredCell==true) {
		    					  			    	pass(driver,"For selected 3 condition applied correctly in the chart"+m);
		    			  			    	  }else {
		    		    							fail(driver,"For selected 3 condition not Applied correctly in the chart"+m+" for the Categorical column : "+SelectCategorical_TabFilter+", Rows : "+failedValues);
		    			  			    	  }
		    			    		         
	    	    						  }else {
	    	    							  fail(driver,"Unable to get the chart"+m+"  for the selected filter, 3 conditions");
	    	    						  }
	    	    					  }  // loop end for 2 charts validation ..
			    					  
			    					  
			    					  click(driver,ResetButton_TabFilter);
			    					  elementnotvisible1(driver, RPE_Loading);
			    					  
			    					  for (int m=1;m<=2;m++) {
	    				    			  
	    	    						  boolean chartdisplay=false;
	    	    						  try {
		    	    						  WebElement chartBod1=driver.findElement(By.xpath("(//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody'])["+m+"]"));
		    	    						  if(chartBod1.isDisplayed()) {
		    	    							  chartdisplay=true;
		    	    						  }
		    	    					  }catch(Exception e) {
	    	    						  
	    	    					      }
	    	    						  
	    	    						  if(chartdisplay==true) {
	    	    							  
	    	    							  WebElement chartBod1=driver.findElement(By.xpath("(//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody'])["+m+"]"));
	    	    							  action.moveToElement(chartBod1).build().perform();
	    	    							  
	    	    							  try {
	    	        							  WebElement TabFilterIconChart=driver.findElement(By.xpath("(//div[contains(@id,'"+GlobalTab2TabId+"')]//*[name()='svg']//*[name()='g'][2]//*[name()='path'][2])["+m+"]"));
	    	        							  action.moveToElement(TabFilterIconChart).build().perform();
	    	        							  String TabIconColorRGB=TabFilterIconChart.getCssValue("fill");
	    	        							  String tabIconColor=rgbToHex1(TabIconColorRGB);
	    	        							  
	    	        							  if(!"#0000FF".equalsIgnoreCase(tabIconColor)) {
	    	        								  pass(driver,"Chart"+m+" Tab Filter icon changed to default color after Reseting the Tab Filter "); 
	    	        							  }else {
	    	        								  fail(driver,"Chart"+m+" Tab Filter icon not changed to default color after Reseting the Tab Filter"); 
	    	        							  }
	    	        							  
	    	        						  }catch(Exception e) {
	    	        							  fail(driver,"unable to find the Tabfilter icon in the chart"+m);
	    	        						  }
		    			    		         
	    	    						  }else {
	    	    							  fail(driver,"Unable to get the chart"+m+" for the after reseting the filter");
	    	    						  }
	    	    					  }  // loop end for 2 charts validation .
			    					  
			    					
	    				    		  }
		    					  }
		    				    		
		    					}else {
		    						fail(driver,SelectCategorical_TabFilter+"Categorical Column not Expand After click on it ");
		    		    		}	
		    					  
				    		 }else {
				    			 fail(driver,SelectCategorical_TabFilter+" Categorical Column value not present in Tab filter");
				    		 }		  
					     //Categorical tab Filter End... 
				         
				         // Date Validation Start....   
		                  click(driver,ResetButton_TabFilter);
		                  elementnotvisible1(driver, RPE_Loading);
			    		  boolean dateFilter=false;
			    		  try {
			    			  WebElement DateColumnElement=driver.findElement(By.xpath("//div[@id='dashboardTRPE_select_filterColsCon']//div[@id='"+SelectDateColumn_Smoke_TabFilter+"']//a"));
		    				  action.moveToElement(DateColumnElement).click().build().perform();
		    				  dateFilter=true;
			    		  }catch(Exception e) {
			    			  
			    		  }
		                  
		    			  if(dateFilter==true) { 
		    	
		    				  wait(driver,"1");
		    				  WebElement DateColumnElementExpand=driver.findElement(By.xpath("//div[@id='dashboardTRPE_select_filterColsCon']//div[@id='"+SelectDateColumn_Smoke_TabFilter+"']//a//i"));
		    				  String DateColumnElementExpandString=DateColumnElementExpand.getAttribute("class");
		    				  if(DateColumnElementExpandString.contains("up")) {
		    					  pass(driver,"Selected Date Column expanded after click on it");
								  WebElement Date_RelativeSection=driver.findElement(By.xpath("//div[@id='"+SelectDateColumn_Smoke_TabFilter+"_content']//div[@id='relative_div']"));
								  pass(driver,"Relative filter present in the Date Column");
								  WebElement Date_RelativeRadioBtn=driver.findElement(By.xpath("//div[@id='"+SelectDateColumn_Smoke_TabFilter+"_content']//div[@id='relative_div']//input"));
								  if(Date_RelativeRadioBtn.isSelected()) {
									  pass(driver,"By default, 'Relative' option selected in the Date Column");
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
					    			  		 elementnotvisible1(driver, RPE_Loading);
					    			  		 for (int m=1;m<=2;m++) {
		    				    			  
					    			  			 boolean chartdisplay=false;
					    			  			 try {
					    			  				 WebElement chartBod1=driver.findElement(By.xpath("(//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody'])["+m+"]"));
					    			  				 if(chartBod1.isDisplayed()) {
					    			  					 chartdisplay=true;
					    			  				 }
					    			  			 }catch(Exception e) {
		    	    						  
					    			  			 }
		    	    						  
			    			  			 		 if(chartdisplay==true) {
			    			  			 			  WebElement chartBod1=driver.findElement(By.xpath("(//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody'])["+m+"]"));
			    			  			 			  action.moveToElement(chartBod1).build().perform();
			    			  			 			  int j=1;
	 			    			    		          boolean filteredCell=true;
	 			    			    		          String failedValues=" ";
	 			    		    					  List<WebElement> FilterChartValue=driver.findElements(By.xpath("(//div[contains(@id,'"+GlobalTab2TabId+"')]//div[@ref='gridBody'])["+m+"]//div[@col-id='"+SelectDateColumn_Smoke_TabFilter+"' and @role='gridcell']"));
	 			    		    					  for(WebElement localEle:FilterChartValue) {
	 			    		    						  String FilterCellValue=localEle.getText();
	 			    		    						  
	 			    		    						  if (FilterCellValue != null && FilterCellValue.length() >= 10) {
	 			    		    							   FilterCellValue=FilterCellValue.substring(0, 10);
	 			    		    						  }
				    			  				 		  if(!Date_RelativeFiltercell(RelativeFilterList[k],FilterCellValue,RelativeFilterInputList[k])) {
	    			    			  				 			 filteredCell=false;
	    			    			  				 			 failedValues=failedValues+j+", ";
				    			  				 		  } 
	 			    		    						  j++;
	 			    		    					  }
	 			    		    					  
	 			    		    					  if(filteredCell==true) {
	    				    			  			      pass(driver,"For '"+RelativeFilterList[k]+"' condition applied correctly Tab Filter in chart"+m);
	 			    		    					  }else {
	    				    			  				  fail(driver,RelativeFilterList[k]+" Condition in Tab Filter not Applied correctly in the chart"+m+" for the Date column : "+SelectDateColumn_Smoke_TabFilter+", Rows : "+failedValues);
	 			    		    					  }
	 			    		    					  
			    			  			 		 }else {
			    			  			 			 fail(driver,"Unable to get the chart"+m+"  for the selected filter, "+RelativeFilterList[k]);
			    			  			 		 }
					    			  		  }  // loop end for 2 charts validation .
					    			  		
						    				 }catch(Exception e) {
						    					 e.printStackTrace();
						    				 }
						    			 }
				    			  		 
								  }else {
									  fail(driver,"By default, 'Relative' option not selected in the Date Column");
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
						    			  		 elementnotvisible1(driver, RPE_Loading);
						    			  		 
						    			  		 for (int m=1;m<=2;m++) {
	   		    				    			  
	    				    			  			 boolean chartdisplay=false;
	    				    			  			 try {
	    				    			  				 WebElement chartBod1=driver.findElement(By.xpath("(//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody'])["+m+"]"));
	    				    			  				 if(chartBod1.isDisplayed()) {
	    				    			  					 chartdisplay=true;
	    				    			  				 }
	    				    			  			 }catch(Exception e) {
	   		    	    						  
	    				    			  			 }
	   		    	    						  
				    			  			 		 if(chartdisplay==true) {
				    			  			 			  WebElement chartBod1=driver.findElement(By.xpath("(//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody'])["+m+"]"));
				    			  			 			  action.moveToElement(chartBod1).build().perform();
				    			  			 			  int j=1;
		 			    			    		          boolean filteredCell=true;
		 			    			    		          String failedValues=" ";
		 			    		    					  List<WebElement> FilterChartValue=driver.findElements(By.xpath("(//div[contains(@id,'"+GlobalTab2TabId+"')]//div[@ref='gridBody'])["+m+"]//div[@col-id='"+SelectDateColumn_Smoke_TabFilter+"' and @role='gridcell']"));
		 			    		    					  for(WebElement localEle:FilterChartValue) {
		 			    		    						  String FilterCellValue=localEle.getText();
		 			    		    						  
		 			    		    						  if (FilterCellValue != null && FilterCellValue.length() >= 10) {
		 			    		    							   FilterCellValue=FilterCellValue.substring(0, 10);
		 			    		    						  }
		 			    		    						  
		 			    		    						  if(!Date_ConditionFiltercell(ConditionFilterList[k],FilterCellValue,ConditionFilterInputList[k],Condition_9_InputB_Date_TF)) {
	    					    			  					 filteredCell=false;
	    					    			  					 failedValues=failedValues+j+", ";
	    				    			  				 	  }
		 			    		    						  j++;
		 			    		    					  }
		 			    		    					  
		 			    		    					  if(filteredCell==true) {
		    				    			  			      pass(driver,"For '"+ConditionFilterList[k]+"' condition applied correctly Tab Filter in chart"+m);
		 			    		    					  }else {
		    				    			  				  fail(driver,ConditionFilterList[k]+" Condition in Tab Filter not Applied correctly in the chart"+m+" for the Date column : "+SelectDateColumn_Smoke_TabFilter+", Rows : "+failedValues);
		 			    		    					  }
		 			    		    					  
		 			    		    					  
				    			  			 		 }else {
				    			  			 			 fail(driver,"Unable to get the chart"+m+"  for the selected filter, "+ConditionFilterList[k]);
				    			  			 		 }
	    				    			  		  }  // loop end for 2 charts validation .
						    			  		 
		    				    				 }catch(Exception e) {
		    				    					 e.printStackTrace();
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
				    			  		 wait(driver,"1");
				    			  		 if(isDisplayed(driver,AddButtonCondition)) {
						    				  pass(driver,"ADD button displayed after selecting the first condition");
						    			  }else {
							    			  fail(driver,"ADD button not displayed after selecting the first condition"); 
							    		  }
						    				  
					    				  mouseOverToElement(driver, AddButtonCondition);
					    				  click(driver,AddButtonCondition);
					    				  
					    				  verifyElementDisplayed(driver, AND_ConditionSec1);
					    				  verifyElementDisplayed(driver, OR_ConditionSec1);
					    				 
					    				  if(FirstOperator_Input_Date_TF.equals("AND")) { 
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
						    				 
					    				  mouseOverToElement(driver, AddButtonCondition);
					    				  click(driver,AddButtonCondition);
					    				  verifyElementDisplayed(driver, AND_ConditionSec2);
					    				  verifyElementDisplayed(driver, OR_ConditionSec2);
					    				  
					    				  if(SecondOperator_Input_Date_TF.equals("AND")) { 
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
					    				  elementnotvisible1(driver, RPE_Loading);
				    					  
				    					  for (int m=1;m<=2;m++) {
		    				    			  
					    			  			 boolean chartdisplay=false;
					    			  			 try {
					    			  				 WebElement chartBod1=driver.findElement(By.xpath("(//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody'])["+m+"]"));
					    			  				 if(chartBod1.isDisplayed()) {
					    			  					 chartdisplay=true;
					    			  				 }
					    			  			 }catch(Exception e) {
		    	    						  
					    			  			 }
		    	    						  
			    			  			 		 if(chartdisplay==true) {
			    			  			 			  WebElement chartBod1=driver.findElement(By.xpath("(//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody'])["+m+"]"));
			    			  			 			  action.moveToElement(chartBod1).build().perform();
			    			  			 			  int j=1;
	 			    			    		          boolean filteredCell=true;
	 			    			    		          String failedValues=" ";
	 			    		    					  List<WebElement> FilterChartValue=driver.findElements(By.xpath("(//div[contains(@id,'"+GlobalTab2TabId+"')]//div[@ref='gridBody'])["+m+"]//div[@col-id='"+SelectDateColumn_Smoke_TabFilter+"' and @role='gridcell']"));
	 			    		    					  for(WebElement localEle:FilterChartValue) {
	 			    		    						  String FilterCellValue=localEle.getText();
	 			    		    						  
	 			    		    						  if (FilterCellValue != null && FilterCellValue.length() >= 10) {
	 			    		    							   FilterCellValue=FilterCellValue.substring(0, 10);
	 			    		    						  }
	 			    		    						  
	 			    		    						  boolean condition_1_Result=Date_ConditionFiltercell(FirstCondition_Date_TF,FilterCellValue,FirstCondition_Date_Input_TF,Condition_9_InputB_Date_TF);
	 			    		    						  boolean condition_2_Result=Date_ConditionFiltercell(SecondCondition_Date_TF,FilterCellValue,SecondCondition_Date_Input_TF,Condition_9_InputB_Date_TF);
	 			    		    						  boolean condition_3_Result=Date_ConditionFiltercell(ThirdCondition_Date_TF,FilterCellValue,ThirdCondition_Date_Input_TF,Condition_9_InputB_Date_TF);
	 			    		    						  String operator1 = FirstOperator_Input_Date_TF;
	 			    		    						  String operator2 = SecondOperator_Input_Date_TF;
	    				    			  				 
	    				    			  				  if(!evaluateConditions(condition_1_Result,operator1,condition_2_Result,operator2,condition_3_Result)) {
	    				    			  					 filteredCell=false;
	    				    			  					 failedValues=failedValues+j+", ";
	    				    			  				  }
	 			    		    						  j++;
	 			    		    					  }
	 			    		    					  
	 			    		    					  if(filteredCell==true) {
	    				    			  			      pass(driver,"For Selected 3 conditions applied correctly Tab Filter in chart"+m);
	 			    		    					  }else {
	    				    			  				  fail(driver,"For Selected 3 conditions in Tab Filter not Applied correctly in the chart"+m+" for the Date column : "+SelectDateColumn_Smoke_TabFilter+", Rows : "+failedValues);
	 			    		    					  }
	 			    		    					 
			    			  			 		 }else {
			    			  			 			 fail(driver,"Unable to get the chart"+m+"  for the selected filter, 3 conditions");
			    			  			 		 }
					    			  		  } // loop end for 2 charts validation .
				    					 
				    					  
				    					  click(driver,ResetButton_TabFilter);
				    					  elementnotvisible1(driver, RPE_Loading);
				    					  
				    					  for (int m=1;m<=2;m++) {
		    				    			  
		    	    						  boolean chartdisplay=false;
		    	    						  try {
			    	    						  WebElement chartBod1=driver.findElement(By.xpath("(//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody'])["+m+"]"));
			    	    						  if(chartBod1.isDisplayed()) {
			    	    							  chartdisplay=true;
			    	    						  }
			    	    					  }catch(Exception e) {
		    	    						  
		    	    					      }
		    	    						  
		    	    						  if(chartdisplay==true) {
		    	    							  
		    	    							  WebElement chartBod1=driver.findElement(By.xpath("(//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody'])["+m+"]"));
		    	    							  action.moveToElement(chartBod1).build().perform();
		    	    							  
		    	    							  try {
		    	        							  WebElement TabFilterIconChart=driver.findElement(By.xpath("(//div[contains(@id,'"+GlobalTab2TabId+"')]//*[name()='svg']//*[name()='g'][2]//*[name()='path'][2])["+m+"]"));
		    	        							  action.moveToElement(TabFilterIconChart).build().perform();
		    	        							  String TabIconColorRGB=TabFilterIconChart.getCssValue("fill");
		    	        							  String tabIconColor=rgbToHex1(TabIconColorRGB);
		    	        							  
		    	        							  if(!"#0000FF".equalsIgnoreCase(tabIconColor)) {
		    	        								  pass(driver,"Chart"+m+" Tab Filter icon changed to default color after Reseting the Tab Filter "); 
		    	        							  }else {
		    	        								  fail(driver,"Chart"+m+" Tab Filter icon not changed to default color after Reseting the Tab Filter"); 
		    	        							  }
		    	        							  
		    	        						  }catch(Exception e) {
		    	        							  fail(driver,"unable to find the Tabfilter icon in the chart"+m);
		    	        						  }
			    			    		         
		    	    						  }else {
		    	    							  fail(driver,"Unable to get the chart"+m+" for the after reseting the filter");
		    	    						  }
		    	    					  }  // loop end for 2 charts validation .
				    					  
		    						  }else {
		    							  fail(driver,"Conditions Filter in Date type Colunm is not selected after click on it ");
		    						  }
		    					  }
		    					  
		    				  }else {
		    					  fail(driver,SelectDateColumn_Smoke_TabFilter+"Selected Date Column not expanded after click on it"); 
		    				  }
		    				  
		    			  }else {
		    				  fail(driver,SelectDateColumn_Smoke_TabFilter+" Date Column value not present in Tab filter");
		    			  }
		    			// TabFilter Date Validation End.....  
				        
				   //Tab Numerical Filter validation
		    			click(driver,ResetButton_TabFilter);
		    			elementnotvisible1(driver, RPE_Loading);
		    			boolean NumericalFilter=false;
		    			try {
		    				WebElement NumericalColumnElement=driver.findElement(By.xpath("//div[@id='dashboardTRPE_select_filterColsCon']//div[@id='"+SelectNumerical_Smoke_TabFilter+"']//a"));
		    				action.moveToElement(NumericalColumnElement).click().build().perform();
		    				NumericalFilter=true;
		    			}catch(Exception e) {
		    				
		    			}
		    			if(NumericalFilter==true) {
		  				  wait(driver,"1");
		  				  WebElement NumericalColumnElementExpand=driver.findElement(By.xpath("//div[@id='dashboardTRPE_select_filterColsCon']//div[@id='"+SelectNumerical_Smoke_TabFilter+"']//a//i"));
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
			    			  		 elementnotvisible1(driver, RPE_Loading);
			    					  
			    					  for (int m=1;m<=2;m++) {
		    				    			  
				    			  			 boolean chartdisplay=false;
				    			  			 try {
				    			  				 WebElement chartBod1=driver.findElement(By.xpath("(//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody'])["+m+"]"));
				    			  				 if(chartBod1.isDisplayed()) {
				    			  					 chartdisplay=true;
				    			  				 }
				    			  			 }catch(Exception e) {
	    	    						  
				    			  			 }
	    	    						  
		    			  			 		 if(chartdisplay==true) {
		    			  			 			  WebElement chartBod1=driver.findElement(By.xpath("(//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody'])["+m+"]"));
		    			  			 			  action.moveToElement(chartBod1).build().perform();
		    			  			 			  int j=1;
			    			    		          boolean filteredCell=true;
			    			    		          String failedValues=" ";
			    		    					  List<WebElement> FilterChartValue=driver.findElements(By.xpath("(//div[contains(@id,'"+GlobalTab2TabId+"')]//div[@ref='gridBody'])["+m+"]//div[@col-id='"+SelectNumerical_Smoke_TabFilter+"' and @role='gridcell']"));
			    		    					  for(WebElement localEle:FilterChartValue) {
			    		    						  String FilterCellValue=localEle.getText();
			    		    						  
			    		    						  if(!Numerical_ConditionFiltercell(NumFilterList[k],FilterCellValue,NumFilterInputList[k],Condition_Between_InputB_Num_TF)) {
		    			    			  				  filteredCell=false;
		    			    			  				  failedValues=failedValues+j+", ";
		    			  							  }
			    		    						  
			    		    						  j++;
			    		    					  }
			    		    					  
			    		    					  if(filteredCell==true) {
	    				    			  			 pass(driver,"For '"+NumFilterList[k]+"' condition applied Tab Filter in chart"+m);
	    				    			  		  }else {
	    				    			  			 fail(driver,NumFilterList[k]+" Condition in Tab Filter not Applied correctly in the chart"+m+" for the Num column : "+SelectNumerical_Smoke_TabFilter+", Rows : "+failedValues);
	    				    			  		  }
			    		    					 
		    			  			 		 }else {
		    			  			 			 fail(driver,"Unable to get the chart"+m+"  for the selected filter, "+NumFilterList[k]);
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
			    				  
		    				  mouseOverToElement(driver, AddButtonCondition);
		    				  click(driver,AddButtonCondition);
		    				  
		    				  verifyElementDisplayed(driver, AND_ConditionSec1);
		    				  verifyElementDisplayed(driver, OR_ConditionSec1);
							 
		    				  if(FirstOperator_Input_Num_TF.equals("AND")) { 
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
		    				  
							  mouseOverToElement(driver, AddButtonCondition);
		    				  click(driver,AddButtonCondition);
		    				  verifyElementDisplayed(driver, AND_ConditionSec2);
		    				  verifyElementDisplayed(driver, OR_ConditionSec2);
		    				  
		    				  if(SecondOperator_Input_Num_TF.equals("AND")) { 
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
							  elementnotvisible1(driver, RPE_Loading);
	    					  
	    					  for (int m=1;m<=2;m++) {
	    				    			  
		    			  			 boolean chartdisplay=false;
		    			  			 try {
		    			  				 WebElement chartBod1=driver.findElement(By.xpath("(//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody'])["+m+"]"));
		    			  				 if(chartBod1.isDisplayed()) {
		    			  					 chartdisplay=true;
		    			  				 }
		    			  			 }catch(Exception e) {
		    						  
		    			  			 }
		    						  
				  			 		 if(chartdisplay==true) {
				  			 			  WebElement chartBod1=driver.findElement(By.xpath("(//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody'])["+m+"]"));
				  			 			  action.moveToElement(chartBod1).build().perform();
				  			 			  int j=1;
		    			    		          boolean filteredCell=true;
		    			    		          String failedValues=" ";
		    		    					  List<WebElement> FilterChartValue=driver.findElements(By.xpath("(//div[contains(@id,'"+GlobalTab2TabId+"')]//div[@ref='gridBody'])["+m+"]//div[@col-id='"+SelectNumerical_Smoke_TabFilter+"' and @role='gridcell']"));
		    		    					  for(WebElement localEle:FilterChartValue) {
		    		    						  String FilterCellValue=localEle.getText();
		    		    						  
		    		    						  boolean condition_1_Result=Numerical_ConditionFiltercell(FirstCondition_Num_TF,FilterCellValue,FirstCondition_Num_Input_TF,Condition_Between_InputB_Num_TF);
		    		    						  boolean condition_2_Result=Numerical_ConditionFiltercell(SecondCondition_Num_TF,FilterCellValue,SecondCondition_Num_Input_TF,Condition_Between_InputB_Num_TF);
		    		    						  boolean condition_3_Result=Numerical_ConditionFiltercell(ThirdCondition_num_TF,FilterCellValue,ThirdCondition_Num_Input_TF,Condition_Between_InputB_Num_TF);
		    		    						  String operator1 = FirstOperator_Input_Num_TF;
		    		    						  String operator2 = SecondOperator_Input_Num_TF;
			    	    			  				 
	    	    			  				 	  if(!evaluateConditions(condition_1_Result,operator1,condition_2_Result,operator2,condition_3_Result)) {
			    	    			  					 filteredCell=false;
			    	    			  					failedValues=failedValues+j+", ";
	    	    			  				 	  }
		    		    						  j++;
		    		    					  }
		    		    					  
			    		    				  if(filteredCell==true) {
					    			  			 pass(driver,"For selected 3 conditions applied Tab Filter in chart"+m);
					    			  		  }else {
					    			  			 fail(driver,"For selected 3 conditions in Tab Filter not Applied correctly in the chart"+m+" for the Num column : "+SelectNumerical_Smoke_TabFilter+", Rows : "+failedValues);
					    			  		  }
		    		    					 
				  			 		 }else {
				  			 			 fail(driver,"Unable to get the chart"+m+"  for the selected filter, 3 conditions");
				  			 		 }
		    			  		  } // loop end for 2 charts validation .
							  
							  click(driver,ResetButton_TabFilter);
							  elementnotvisible1(driver, RPE_Loading);
	    					  
	    					  for (int m=1;m<=2;m++) {
				    			  
	    						  boolean chartdisplay=false;
	    						  try {
		    						  WebElement chartBod1=driver.findElement(By.xpath("(//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody'])["+m+"]"));
		    						  if(chartBod1.isDisplayed()) {
		    							  chartdisplay=true;
		    						  }
		    					  }catch(Exception e) {
	    						  
	    					      }
	    						  
	    						  if(chartdisplay==true) {
	    							  
	    							  WebElement chartBod1=driver.findElement(By.xpath("(//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody'])["+m+"]"));
	    							  action.moveToElement(chartBod1).build().perform();
	    							  
	    							  try {
	        							  WebElement TabFilterIconChart=driver.findElement(By.xpath("(//div[contains(@id,'"+GlobalTab2TabId+"')]//*[name()='svg']//*[name()='g'][2]//*[name()='path'][2])["+m+"]"));
	        							  action.moveToElement(TabFilterIconChart).build().perform();
	        							  String TabIconColorRGB=TabFilterIconChart.getCssValue("fill");
	        							  String tabIconColor=rgbToHex1(TabIconColorRGB);
	        							  
	        							  if(!"#0000FF".equalsIgnoreCase(tabIconColor)) {
	        								  pass(driver,"Chart"+m+" Tab Filter icon changed to default color after Reseting the Tab Filter "); 
	        							  }else {
	        								  fail(driver,"Chart"+m+" Tab Filter icon not changed to default color after Reseting the Tab Filter"); 
	        							  }
	        							  
	        						  }catch(Exception e) {
	        							  fail(driver,"unable to find the Tabfilter icon in the chart"+m);
	        						  }
				    		         
	    						  }else {
	    							  fail(driver,"Unable to get the chart"+m+" for the after reseting the filter");
	    						  }
	    					  }  // loop end for 2 charts validation .
							  
	    					  
		  				  }else {
							  fail(driver,SelectNumerical_Smoke_TabFilter +" Numerical Column not expanded after click on it"); 
						  }
		  				  
		    			}else {
		    				fail(driver,SelectNumerical_Smoke_TabFilter+" Numerical Column not present");
		    			}
		    			
			    		//Numerical Tab filter end....
		    			
		    			//Text Local filter Start....
		     			 boolean textFilter=false;
		 	    		  try {
		 	    			  WebElement TextColumn= driver.findElement(By.xpath("//div[@id='dashboardTRPE_select_filterColsCon']//div[@id='"+SelectText_TabFilter+"']//a"));
		 		    		  action.moveToElement(TextColumn).click().build().perform();
		 		    		  textFilter=true;
		 	    		  }catch(Exception e) {
		 	    			  
		 	    		  }
		 	    		  
		 		         if(textFilter==true) {
		 		    		  WebElement textColumnExp=driver.findElement(By.xpath("//div[@id='dashboardTRPE_select_filterColsCon']//div[@id='"+SelectText_TabFilter+"']//a//i"));
		 		    		  String textColumnExpText=textColumnExp.getAttribute("class");
		 		    		  if(textColumnExpText.contains("up")) {
		 		    			  pass(driver,"Text Column Expand After click on it ");
		 		    			  if(verifyElementDisplayed(driver, byValueFilterOption)) {
		 		    				  try {
		 			    				  WebElement ByValueElementRadio=driver.findElement(By.xpath("//div[@id='"+SelectText_TabFilter+"_content']//div[@id='byRelative_div']//input"));
		 			    				  if(ByValueElementRadio.isSelected()) {
		 			    					  pass(driver,"By default, 'By Values' radio button selected ");
		 			    				  }else {
		 			    					  fail(driver,"By default, 'By Values' radio button not selected ");
		 			    				  }
		 			    			  }catch(Exception e) {
		 			    				  fail(driver,"Unable to find 'By Values' radio button ");
		 			    				  e.printStackTrace();
		 			    			  }
		 	    				  }
		 		    			  
		 		    		  verifyElementDisplayed(driver, AllCheckbox_CategoricalSec);
		   				      verifyElementDisplayed(driver, CategoricalSearchListOptions);
		   				      verifyElementDisplayed(driver, ExcludeOption_Categorical);
		   				      verifyElementDisplayed(driver, ExcludeCheckbox);
	
		   				      List<WebElement> searchListAvailable=driver.findElements(By.xpath("//div[@id='"+SelectText_TabFilter+"_FactorsList']//li"));
		   				      List<WebElement> searchListCheckboxAvailable=driver.findElements(By.xpath("//div[@id='"+SelectText_TabFilter+"_FactorsList']//li//input[@type='checkbox']"));
		   				      if(searchListAvailable.size()==searchListCheckboxAvailable.size()) {
		   				    	  pass(driver,"All the available searchlist are displayed with Checkbox");
		   				      }else {
		   				    	  fail(driver,"Some available searchlist are not displayed with Checkbox");
		   				      }
		   				      
		   				      
		 		    			  WebElement SearchBar_=driver.findElement(By.xpath("//input[@id='"+SelectText_TabFilter+"LFsearch']"));
		 		    			  SearchBar_.click();
		 		    			  wait(driver,"1");
		 		    			  SearchBar_.sendKeys(ByValuesInput_Text_TF);
		 		    			  pass(driver,"Type On Value "+ByValuesInput_Text_TF+" search input");
		 		    			  wait(driver,"1");
		 		    			  WebElement firstOption=driver.findElement(By.xpath("(//div[@id='"+SelectText_TabFilter+"_FactorsList']//li)[1]"));
		 		    			  String firstOptionText=firstOption.getText();
		 		    			  if(firstOptionText.equals(ByValuesInput_Text_TF)) {
		 		    				  pass(driver,"Search bar inside the Text section works properly");
		 		    			  }else {
		 		    				  fail(driver,"Search bar inside the Text section not works properly");
		 		    			  }
		 	    			  
		 		    			  firstOption.click();
		 	    				  wait(driver,"1");
		 	    				  WebElement firstCheckBox=driver.findElement(By.xpath("(//div[@id='"+SelectText_TabFilter+"_FactorsList']//li//input)[1]"));
		 			    		  if(firstCheckBox.isSelected()){
		 			    			  pass(driver,"Check box selected when click the First searched value");
		 			    		  }else {
		 			    			  fail(driver,"Check box not selected when click the First searched value");
		 			    		  }
		 			    		  
		 			    		  click(driver,ApplyButton_TabFilter);
		 			    		  elementnotvisible1(driver, RPE_Loading);
		    					  
		    					  for (int m=1;m<=2;m++) {
	    				    			  
			    			  			 boolean chartdisplay=false;
			    			  			 try {
			    			  				 WebElement chartBod1=driver.findElement(By.xpath("(//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody'])["+m+"]"));
			    			  				 if(chartBod1.isDisplayed()) {
			    			  					 chartdisplay=true;
			    			  				 }
			    			  			 }catch(Exception e) {
		    						  
			    			  			 }
		    						  
	    			  			 		 if(chartdisplay==true) {
	    			  			 			  WebElement chartBod1=driver.findElement(By.xpath("(//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody'])["+m+"]"));
	    			  			 			  action.moveToElement(chartBod1).build().perform();
	    			  			 			  int j=1;
		    			    		          boolean filteredCell=true;
		    			    		          String failedValues=" ";
		    		    					  List<WebElement> FilterChartValue=driver.findElements(By.xpath("(//div[contains(@id,'"+GlobalTab2TabId+"')]//div[@ref='gridBody'])["+m+"]//div[@col-id='"+SelectText_TabFilter+"' and @role='gridcell']"));
		    		    					  for(WebElement localEle:FilterChartValue) {
		    		    						  String FilterCellValue=localEle.getText();
		    		    						  
		    		    						  if(!FilterCellValue.equals(ByValuesInput_Text_TF)) {
		    	 	    							  filteredCell=false;
		    	 	    							 failedValues=failedValues+j+", ";
		    	 	    						  }
		    		    						  j++;
		    		    					  }
		    		    					  
		    		    					  
		    		    					  if(filteredCell==true) {
		    	 		  			    	       pass(driver,"For 'By Values' condition applied correctly Tab Filter in chart"+m);
		    	 		  			          }else {
		    	     							  fail(driver,"By Value condition Tab Filter not Applied correctly in the chart"+m+" for the Text column : "+SelectText_TabFilter+", Rows : "+failedValues);
		    	 		  			          }
		    		    					 
	    			  			 		 }else {
	    			  			 			 fail(driver,"Unable to get the chart"+m+"  for the selected filter, By Value ");
	    			  			 		 }
			    			  		  } // loop end for 2 charts validation .
		   					     
		 		    		  click(driver,ExcludeCheckbox);
		 		    		  click(driver,ApplyButton_TabFilter);
		 		    		  elementnotvisible1(driver, RPE_Loading);
	    					  
	    					  for (int m=1;m<=2;m++) {
					    			  
		    			  			 boolean chartdisplay=false;
		    			  			 try {
		    			  				 WebElement chartBod1=driver.findElement(By.xpath("(//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody'])["+m+"]"));
		    			  				 if(chartBod1.isDisplayed()) {
		    			  					 chartdisplay=true;
		    			  				 }
		    			  			 }catch(Exception e) {
							  
		    			  			 }
							  
				  			 		 if(chartdisplay==true) {
				  			 			  WebElement chartBod1=driver.findElement(By.xpath("(//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody'])["+m+"]"));
				  			 			  action.moveToElement(chartBod1).build().perform();
				  			 			  int j=1;
	    			    		          boolean filteredCell=true;
	    			    		          String failedValues=" ";
	    		    					  List<WebElement> FilterChartValue=driver.findElements(By.xpath("(//div[contains(@id,'"+GlobalTab2TabId+"')]//div[@ref='gridBody'])["+m+"]//div[@col-id='"+SelectText_TabFilter+"' and @role='gridcell']"));
	    		    					  for(WebElement localEle:FilterChartValue) {
	    		    						  String FilterCellValue=localEle.getText();
	    		    						  
	    		    						  if(FilterCellValue.equals(ByValuesInput_Text_TF)) {
	    	 	    							  filteredCell=false;
	    	 	    							 failedValues=failedValues+j+", ";
	    	 	    						  }
	    		    						  j++;
	    		    					  }
	    		    					  
	    		    					  
	    		    					  if(filteredCell==true) {
	    	 		  			    	       pass(driver,"For 'By Values' with 'Exclude' condition applied correctly Tab Filter in chart"+m);
	    	 		  			          }else {
	    	     							  fail(driver,"By Value with 'Exclude' condition Tab Filter not Applied correctly in the chart"+m+" for the Text column : "+SelectText_TabFilter+", Rows : "+failedValues);
	    	 		  			          }
	    		    					 
				  			 		 }else {
				  			 			 fail(driver,"Unable to get the chart"+m+"  for the selected filter, By Value with Exclude ");
				  			 		 }
		    			  		  } // loop end for 2 charts validation .
		   					  
		   					  
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
		 			    			  		 elementnotvisible1(driver, RPE_Loading);
					    					  
					    					  for (int m=1;m<=2;m++) {
				    				    			  
						    			  			 boolean chartdisplay=false;
						    			  			 try {
						    			  				 WebElement chartBod1=driver.findElement(By.xpath("(//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody'])["+m+"]"));
						    			  				 if(chartBod1.isDisplayed()) {
						    			  					 chartdisplay=true;
						    			  				 }
						    			  			 }catch(Exception e) {
			    	    						  
						    			  			 }
			    	    						  
				    			  			 		 if(chartdisplay==true) {
				    			  			 			  WebElement chartBod1=driver.findElement(By.xpath("(//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody'])["+m+"]"));
				    			  			 			  action.moveToElement(chartBod1).build().perform();
				    			  			 			  int j=1;
					    			    		          boolean filteredCell=true;
					    			    		          String failedValues=" ";
					    		    					  List<WebElement> FilterChartValue=driver.findElements(By.xpath("(//div[contains(@id,'"+GlobalTab2TabId+"')]//div[@ref='gridBody'])["+m+"]//div[@col-id='"+SelectText_TabFilter+"' and @role='gridcell']"));
					    		    					  for(WebElement localEle:FilterChartValue) {
					    		    						  String FilterCellValue=localEle.getText();
					    		    						  if(!Categorical_ConditionFiltercell(conditionsList[k],FilterCellValue,conditionsInputList[k])) {
			    	 			    			  					 filteredCell=false;
			    	 			    			  					failedValues=failedValues+j+", ";
			    	 			    			  			  }
					    		    						  j++;
					    		    					  }
					    		    					  
					    		    					  if(filteredCell==true) {
					    	 		  			    	       pass(driver,"For '"+conditionsList[k]+"' condition applied correctly Tab Filter in chart"+m);
					    	 		  			          }else {
					    	     							  fail(driver,conditionsList[k]+" condition Tab Filter not Applied correctly in the chart"+m+" for the Text column : "+SelectText_TabFilter+", Rows : "+failedValues);
					    	 		  			          }
					    		    					 
				    			  			 		 }else {
				    			  			 			 fail(driver,"Unable to get the chart"+m+"  for the selected filter, "+conditionsList[k]);
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
		 			    				  
		 		    				  mouseOverToElement(driver, AddButtonCondition);
		 		    				  click(driver,AddButtonCondition);
		 		    				  
		 		    				  verifyElementDisplayed(driver, AND_ConditionSec1);
		 		    				  verifyElementDisplayed(driver, OR_ConditionSec1);
		 		    				 
		 		    				  if(FirstOperator_Input_Text_TF.equals("AND")) { 
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
		 			    				  
		 		    				  mouseOverToElement(driver, AddButtonCondition);
		 		    				  click(driver,AddButtonCondition);
		 		    				  verifyElementDisplayed(driver, AND_ConditionSec2);
		 		    				  verifyElementDisplayed(driver, OR_ConditionSec2);
		 		    				  
		 		    				  if(SecondOperator_Input_Text_TF.equals("AND")) { 
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
		 	    					  elementnotvisible1(driver, RPE_Loading);
			    					  for (int m=1;m<=2;m++) {
		    				    			  
				    			  			 boolean chartdisplay=false;
				    			  			 try {
				    			  				 WebElement chartBod1=driver.findElement(By.xpath("(//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody'])["+m+"]"));
				    			  				 if(chartBod1.isDisplayed()) {
				    			  					 chartdisplay=true;
				    			  				 }
				    			  			 }catch(Exception e) {
	    	    						  
				    			  			 }
	    	    						  
		    			  			 		 if(chartdisplay==true) {
		    			  			 			  WebElement chartBod1=driver.findElement(By.xpath("(//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody'])["+m+"]"));
		    			  			 			  action.moveToElement(chartBod1).build().perform();
		    			  			 			  int j=1;
			    			    		          boolean filteredCell=true;
			    			    		          String failedValues=" ";
			    		    					  List<WebElement> FilterChartValue=driver.findElements(By.xpath("(//div[contains(@id,'"+GlobalTab2TabId+"')]//div[@ref='gridBody'])["+m+"]//div[@col-id='"+SelectText_TabFilter+"' and @role='gridcell']"));
			    		    					  for(WebElement localEle:FilterChartValue) {
			    		    						  String FilterCellValue=localEle.getText();
			    		    						  
			    		    						  boolean condition_1_Result=Categorical_ConditionFiltercell(FirstCondition_Text_TF,FilterCellValue,FirstCondition_Input_Text_TF);
	    	 		    						      boolean condition_2_Result=Categorical_ConditionFiltercell(SecondCondition_Text_TF,FilterCellValue,SecondCondition_Input_Text_TF);
	    	 		    						      boolean condition_3_Result=Categorical_ConditionFiltercell(ThirdCondition_Text_TF,FilterCellValue,ThirdCondition_Input_Text_TF);
	    	 		    						      String operator1 = FirstOperator_Input_Text_TF; 
	    	 		    						      String operator2 = SecondOperator_Input_Text_TF;
	    	 		    			  				 
	    	 		    			  				  if(!evaluateConditions(condition_1_Result,operator1,condition_2_Result,operator2,condition_3_Result)) {
	    	 		    			  					 filteredCell=false;
	    	 		    			  					 failedValues=failedValues+j+", ";
	    	 		    			  				  }
			    		    						  j++;
			    		    					  }
			    		    					  
			    		    					  if(filteredCell==true) {
			    	 		  			    	       pass(driver,"For 'Selected 3 Condition' applied correctly Tab Filter in chart"+m);
			    	 		  			          }else {
			    	     							  fail(driver,"Selected 3 Condition Tab Filter not Applied correctly in the chart"+m+" for the Text column : "+SelectText_TabFilter+", Rows : "+failedValues);
			    	 		  			          }
			    		    					 
		    			  			 		 }else {
		    			  			 			 fail(driver,"Unable to get the chart"+m+"  for the selected filter, 3 condition ");
		    			  			 		 }
				    			  		  } // loop end for 2 charts validation .
		 	    					  
		 	    					  click(driver,ResetButton_TabFilter);
		 	    					  elementnotvisible1(driver, RPE_Loading);
			    					  
			    					  for (int m=1;m<=2;m++) {
	    				    			  
	    	    						  boolean chartdisplay=false;
	    	    						  try {
		    	    						  WebElement chartBod1=driver.findElement(By.xpath("(//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody'])["+m+"]"));
		    	    						  if(chartBod1.isDisplayed()) {
		    	    							  chartdisplay=true;
		    	    						  }
		    	    					  }catch(Exception e) {
	    	    						  
	    	    					      }
	    	    						  
	    	    						  if(chartdisplay==true) {
	    	    							  
	    	    							  WebElement chartBod1=driver.findElement(By.xpath("(//div[@id='"+GlobalTab2TabId+"_div']//div[@ref='gridBody'])["+m+"]"));
	    	    							  action.moveToElement(chartBod1).build().perform();
	    	    							  
	    	    							  try {
	    	        							  WebElement TabFilterIconChart=driver.findElement(By.xpath("(//div[contains(@id,'"+GlobalTab2TabId+"')]//*[name()='svg']//*[name()='g'][2]//*[name()='path'][2])["+m+"]"));
	    	        							  action.moveToElement(TabFilterIconChart).build().perform();
	    	        							  String TabIconColorRGB=TabFilterIconChart.getCssValue("fill");
	    	        							  String tabIconColor=rgbToHex1(TabIconColorRGB);
	    	        							  
	    	        							  if(!"#0000FF".equalsIgnoreCase(tabIconColor)) {
	    	        								  pass(driver,"Chart"+m+" Tab Filter icon changed to default color after Reseting the Tab Filter "); 
	    	        							  }else {
	    	        								  fail(driver,"Chart"+m+" Tab Filter icon not changed to default color after Reseting the Tab Filter"); 
	    	        							  }
	    	        							  
	    	        						  }catch(Exception e) {
	    	        							  fail(driver,"unable to find the Tabfilter icon in the chart"+m);
	    	        						  }
		    			    		         
	    	    						  }else {
	    	    							  fail(driver,"Unable to get the chart"+m+" for the after reseting the filter");
	    	    						  }
	    	    					  }  // loop end for 2 charts validation .
		 			    	      }
		   					    }
		   				    		
		   					  }else {
		   						  fail(driver, SelectText_TabFilter+" Text Column not Expand After click on it ");
		   		    		  }	
		   					  
		 	    		  }else {
		 	    			  pass(driver,SelectText_TabFilter+" Text Column value not present in Tab filter");
		 	    		  }		  
		     			  
		 		       //Text Tab filter End....
				  
			  }else {
				  fail(driver,"ColumnLists Section not present in the Tab Filter ");
			  }
			  
		  }
	    
	    //******************************* Tab Filter End **********************************//
		
	}
	
	
	 
}
