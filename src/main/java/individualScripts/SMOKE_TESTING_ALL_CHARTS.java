package individualScripts;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import atu.testng.reports.logging.LogAs;
import commonMethods.Keywords;
import commonMethods.Utils;

public class SMOKE_TESTING_ALL_CHARTS extends Keywords{

	
	public void allCharts(WebDriver driver,int iteration) {
		
		//Bar Column
		String Y_Axis_dataType_BarWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Bar_Input", "Y_Axis_dataType_BarWidget");
		String Select_Y_Axis_Value_BarWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Bar_Input", "Select_Y_Axis_Value_BarWidget");
		String X_Axis_dataType_BarWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Bar_Input", "X_Axis_dataType_BarWidget");
		String Select_X_Axis_Value_BarWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Bar_Input", "Select_X_Axis_Value_BarWidget");
		String SelectGroupValue_Date_BarWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Bar_Input", "SelectGroupValue_Date_BarWidget");

		//Stacked Bar
		String Y_Axis_dataType_StackedBarWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_StackedBar_Input", "Y_Axis_dataType_StackedBarWidget");
		String Select_Y_Axis_Value_StackedBarWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_StackedBar_Input", "Select_Y_Axis_Value_StackedBarWidget");
		String X_Axis_dataType_StackedBarWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_StackedBar_Input", "X_Axis_dataType_StackedBarWidget");
		String Select_X_Axis_Value_StackedBarWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_StackedBar_Input", "Select_X_Axis_Value_StackedBarWidget");
		String SelectGroupValue_Date_StackedBarWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_StackedBar_Input", "SelectGroupValue_Date_StackedBarWidget");
		String Select_Color_Value_StackedBarWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_StackedBar_Input", "Select_Color_Value_StackedBarWidget");

		//Grouped Bar
		String Y_Axis_dataType_GroupedBarWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_GroupedBar_Input", "Y_Axis_dataType_GroupedBarWidget");
		String Select_Y_Axis_Value_GroupedBarWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_GroupedBar_Input", "Select_Y_Axis_Value_GroupedBarWidget");
		String X_Axis_dataType_GroupedBarWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_GroupedBar_Input", "X_Axis_dataType_GroupedBarWidget");
		String Select_X_Axis_Value_GroupedBarWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_GroupedBar_Input", "Select_X_Axis_Value_GroupedBarWidget");
		String SelectGroupValue_Date_GroupedBarWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_GroupedBar_Input", "SelectGroupValue_Date_GroupedBarWidget");
		String Group_Value_X_Axis_GroupedBar=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_GroupedBar_Input", "Group_Value_X_Axis_GroupedBar");

		//Column
		String X_Axis_dataType_ColumnWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Column_Input", "X_Axis_dataType_ColumnWidget");
		String Select_X_Axis_Value_ColumnWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Column_Input", "Select_X_Axis_Value_ColumnWidget");
		String SelectGroupValue_Date_Column=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Column_Input", "SelectGroupValue_Date_Column");
		String Y_Axis_dataType_ColumnWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Column_Input", "Y_Axis_dataType_ColumnWidget");
		String Select_Y_Axis_Value_ColumnWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Column_Input", "Select_Y_Axis_Value_ColumnWidget");
	
		//Stacked Column
		String X_Axis_dataType_StackedColumnWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Stacked_Column_Input", "X_Axis_dataType_StackedColumnWidget");
		String Select_X_Axis_Value_StackedColumnWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Stacked_Column_Input", "Select_X_Axis_Value_StackedColumnWidget");
		String SelectGroupValue_Date_StackedColumn=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Stacked_Column_Input", "SelectGroupValue_Date_StackedColumn");
		String Y_Axis_dataType_StackedColumnWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Stacked_Column_Input", "Y_Axis_dataType_StackedColumnWidget");
		String Select_Y_Axis_Value_StackedColumWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Stacked_Column_Input", "Select_Y_Axis_Value_StackedColumWidget");
		String Select_Color_Value_StackedColumnWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Stacked_Column_Input", "Select_Color_Value_StackedColumnWidget");

		//Grouped Column 
		String X_Axis_dataType_GroupedColumnWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Grouped_Column_Input", "X_Axis_dataType_GroupedColumnWidget");
		String Select_X_Axis_Value_GroupedColumnWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Grouped_Column_Input", "Select_X_Axis_Value_GroupedColumnWidget");
		String Y_Axis_dataType_GroupedColumnWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Grouped_Column_Input", "Y_Axis_dataType_GroupedColumnWidget");
		String Select_Y_Axis_Value_GroupedColumnWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Grouped_Column_Input", "Select_Y_Axis_Value_GroupedColumnWidget");
		String SelectGroupValue_Date_GroupedColumn=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Grouped_Column_Input", "SelectGroupValue_Date_GroupedColumn");
		String SelectGroupValue_YAxis_GroupedColumn=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Grouped_Column_Input", "SelectGroupValue_YAxis_GroupedColumn");

		//Pie Widget
		String X_Axis_dataType_PieWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Pie_Input", "X_Axis_dataType_PieWidget");
		String Select_X_Axis_Value_PieWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Pie_Input", "Select_X_Axis_Value_PieWidget");
		String Y_Axis_dataType_PieWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Pie_Input", "Y_Axis_dataType_PieWidget");
		String Select_Y_Axis_Value_PieWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Pie_Input", "Select_Y_Axis_Value_PieWidget");
		String SelectGroupValue_Date_PieChart=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Pie_Input", "SelectGroupValue_Date_PieChart");
	
		//Donut Widget
		String X_Axis_dataType_DonutWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Donut_Input", "X_Axis_dataType_DonutWidget");
		String Select_X_Axis_Value_DonutWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Donut_Input", "Select_X_Axis_Value_DonutWidget");
		String Y_Axis_dataType_DonutWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Donut_Input", "Y_Axis_dataType_DonutWidget");
		String Select_Y_Axis_Value_DonutWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Donut_Input", "Select_Y_Axis_Value_DonutWidget");
		String SelectGroupValue_Date_DonutChart=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Donut_Input", "SelectGroupValue_Date_DonutChart");
		
		//Semi Circle Widget
		String X_Axis_dataType_SemiCircleWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_SemiCircle_Input", "X_Axis_dataType_SemiCircleWidget");
		String Select_X_Axis_Value_SemiCircleWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_SemiCircle_Input", "Select_X_Axis_Value_SemiCircleWidget");
		String Y_Axis_dataType_SemiCircleWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_SemiCircle_Input", "Y_Axis_dataType_SemiCircleWidget");
		String Select_Y_Axis_Value_SemiCircleWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_SemiCircle_Input", "Select_Y_Axis_Value_SemiCircleWidget");
		String SelectGroupValue_Date_SemiCircleChart=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_SemiCircle_Input", "SelectGroupValue_Date_SemiCircleChart");
				
		//Sun Burst Widget
		String Categories_dataType_SunBurstWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_SunBurst_Input", "Categories_dataType_SunBurstWidget");
		String Select_Categories_Value_SunBurstWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_SunBurst_Input", "Select_Categories_Value_SunBurstWidget");
		String Series_dataType_SunBurstWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_SunBurst_Input", "Series_dataType_SunBurstWidget");
		String Select_Series_Value_SunBurstWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_SunBurst_Input", "Select_Series_Value_SunBurstWidget");					
		
		//WaterFall Widget
		String X_Axis_dataType_WaterFallWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_WaterFall_Input", "X_Axis_dataType_WaterFallWidget");
		String Select_X_Axis_Value_WaterFallWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_WaterFall_Input", "Select_X_Axis_Value_WaterFallWidget");
		String Y_Axis_dataType_WaterFallWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_WaterFall_Input", "Y_Axis_dataType_WaterFallWidget");
		String Select_Y_Axis_Value_WaterFallWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_WaterFall_Input", "Select_Y_Axis_Value_WaterFallWidget");					
			
		//Network Widget
		String Categories_dataType_NetworkWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Network_Input", "Categories_dataType_NetworkWidget");
		String Select_Categories_Value_NetworkWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Network_Input", "Select_Categories_Value_NetworkWidget");
		String Series_dataType_NetworkWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Network_Input", "Series_dataType_NetworkWidget");
		String Select_Series_Value_NetworkWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Network_Input", "Select_Series_Value_NetworkWidget");					
		
		//Line Widget 
		String X_Axis_dataType_LineWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Line_Input", "X_Axis_dataType_LineWidget");
		String Select_X_Axis_Value_LineWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Line_Input", "Select_X_Axis_Value_LineWidget");
		String Y_Axis_dataType_LineWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Line_Input", "Y_Axis_dataType_LineWidget");
		String Select_Y_Axis_Value_LineWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Line_Input", "Select_Y_Axis_Value_LineWidget");
		String SelectGroupValue_Date_Line=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Line_Input", "SelectGroupValue_Date_Line");
		String SelectGroupValue_YAxis_Line=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Line_Input", "SelectGroupValue_YAxis_Line");
		
		//Area Widget 
		String X_Axis_dataType_AreaWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Area_Input", "X_Axis_dataType_AreaWidget");
		String Select_X_Axis_Value_AreaWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Area_Input", "Select_X_Axis_Value_AreaWidget");
		String Y_Axis_dataType_AreaWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Area_Input", "Y_Axis_dataType_AreaWidget");
		String Select_Y_Axis_Value_AreaWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Area_Input", "Select_Y_Axis_Value_AreaWidget");
		String SelectGroupValue_Date_Area=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Area_Input", "SelectGroupValue_Date_Area");
		String SelectGroupValue_YAxis_Area=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Area_Input", "SelectGroupValue_YAxis_Area");
				
		//Gantt Widget 
		String Y_Axis_dataType_GanttWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Gantt_Input", "Y_Axis_dataType_GanttWidget");
		String Select_Y_Axis_Value_GanttWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Gantt_Input", "Select_Y_Axis_Value_GanttWidget");
		String X_Axis_dataType_GanttWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Gantt_Input", "X_Axis_dataType_GanttWidget");
		String Select_X_Axis_Value_GanttWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Gantt_Input", "Select_X_Axis_Value_GanttWidget");
		String StartDate_Value_GanttWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Gantt_Input", "StartDate_Value_GanttWidget");
		String Duration_Value_GanttWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Gantt_Input", "Duration_Value_GanttWidget");
				
		//Scatter Widget 
		String X_Axis_dataType_ScatterWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Scatter_Input", "X_Axis_dataType_ScatterWidget");
		String Select_X_Axis_Value_ScatterWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Scatter_Input", "Select_X_Axis_Value_ScatterWidget");
		String Y_Axis_dataType_ScatterWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Scatter_Input", "Y_Axis_dataType_ScatterWidget");
		String Select_Y_Axis_Value_ScatterWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Scatter_Input", "Select_Y_Axis_Value_ScatterWidget");
			
		//Dumbell_Plot Widget 
		String Category_dataType_DumbbellWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Dumbbell_Plot_Input", "Category_dataType_DumbbellWidget");
		String Select_Category_Value_DumbbellWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Dumbbell_Plot_Input", "Select_Category_Value_DumbbellWidget");
		String Value1_dataType_DumbbellWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Dumbbell_Plot_Input", "Value1_dataType_DumbbellWidget");
		String Select_Value1_DumbbellWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Dumbbell_Plot_Input", "Select_Value1_DumbbellWidget");
		String Value2_dataType_DumbbellWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Dumbbell_Plot_Input", "Value2_dataType_DumbbellWidget");
		String Select_Value2_DumbbellWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Dumbbell_Plot_Input", "Select_Value2_DumbbellWidget");
			
		//Tree map Widget
		String Categories_dataType_TreeMapWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_TreeMap_Input", "Categories_dataType_TreeMapWidget");
		String Select_Categories_Value_TreeMapWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_TreeMap_Input", "Select_Categories_Value_TreeMapWidget");
		String Series_dataType_TreeMapWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_TreeMap_Input", "Series_dataType_TreeMapWidget");
		String Select_Series_Value_TreeMapWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_TreeMap_Input", "Select_Series_Value_TreeMapWidget");					
			
		//Heat map Widget
		String X_Axis_dataType_HeatMapWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_HeatMap_Input", "X_Axis_dataType_HeatMapWidget");
		String Select_X_Axis_Value_HeatMapWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_HeatMap_Input", "Select_X_Axis_Value_HeatMapWidget");
		String Y_Axis_dataType_HeatMapWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_HeatMap_Input", "Y_Axis_dataType_HeatMapWidget");
		String Select_Y_Axis_Value_HeatMapWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_HeatMap_Input", "Select_Y_Axis_Value_HeatMapWidget");					
		String Series_dataType_HeatMapWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_HeatMap_Input", "Series_dataType_HeatMapWidget");
		String Select_Series_Value_HeatMapWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_HeatMap_Input", "Select_Series_Value_HeatMapWidget");					
			
		//Grouped And Sorted Widget
		String Categories_dataType_GrouptAndSortWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_GroupAndSort_Input", "Categories_dataType_GrouptAndSortWidget");
		String Select_Categories_Value_GroupAndSortWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_GroupAndSort_Input", "Select_Categories_Value_GroupAndSortWidget");
		String Series_dataType_GroupAndSortWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_GroupAndSort_Input", "Series_dataType_GroupAndSortWidget");
		String Select_Series_Value_GroupAndSortWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_GroupAndSort_Input", "Select_Series_Value_GroupAndSortWidget");					
			
		//Multiple Axes Widget 
		String Category_dataType_MultipleAxisWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_MultipleAxis_Input", "Category_dataType_MultipleAxisWidget");
		String Select_Category_Value_MultipleAxisWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_MultipleAxis_Input", "Select_Category_Value_MultipleAxisWidget");
		String Y_Axis_dataType_MultipleAxisWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_MultipleAxis_Input", "Y_Axis_dataType_MultipleAxisWidget");
		String Select_Y_Axis_MultipleAxisWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_MultipleAxis_Input", "Select_Y_Axis_MultipleAxisWidget");
		String SelectGroupValue_Date_MultipleAxis=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_MultipleAxis_Input", "SelectGroupValue_Date_MultipleAxis");
		
		//RadarLine Widget 
		String Category_dataType_RadarLineWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_RadarLine_Input", "Category_dataType_RadarLineWidget");
		String Select_Category_Value_RadarLineAxisWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_RadarLine_Input", "Select_Category_Value_RadarLineAxisWidget");
		String Y_Axis_dataType_RadarLineWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_RadarLine_Input", "Y_Axis_dataType_RadarLineWidget");
		String Select_Y_Axis_RadarLineWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_RadarLine_Input", "Select_Y_Axis_RadarLineWidget");
		String SelectGroupValue_Date_RadarLine=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_RadarLine_Input", "SelectGroupValue_Date_RadarLine");
		
		//Zoomable Bubble Widget 
		String X_Axis_dataType_ZoomableWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Zoomable_Input", "X_Axis_dataType_ZoomableWidget");
		String Select_X_Axis_Value_ZoomableWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Zoomable_Input", "Select_X_Axis_Value_ZoomableWidget");
		String Y_Axis_dataType_ZoomableWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Zoomable_Input", "Y_Axis_dataType_ZoomableWidget");
		String Select_Y_Axis_Value_ZoomableWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Zoomable_Input", "Select_Y_Axis_Value_ZoomableWidget");
		String Color_dataType_ZoomableWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Zoomable_Input", "Color_dataType_ZoomableWidget");
		String Select_Color_Value_ZoomableWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Zoomable_Input", "Select_Color_Value_ZoomableWidget");
		String Series_dataType_ZoomableWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Zoomable_Input", "Series_dataType_ZoomableWidget");
		String Select_Series_Value_ZoomableWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Zoomable_Input", "Select_Series_Value_ZoomableWidget");
			
		//Time Line Widget 
		String Select_Date_Value_TimeLineWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_TimeLine_Input", "Select_Date_Value_TimeLineWidget");
		String Select_Group_Value_TimeLineWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_TimeLine_Input", "Select_Group_Value_TimeLineWidget");
		String Series_dataType_TimeLineWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_TimeLine_Input", "Series_dataType_TimeLineWidget");
		String Select_Series_Value_TimeLineWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_TimeLine_Input", "Select_Series_Value_TimeLineWidget");
		
		//Population Pyramid Widget 
		String Y_Axis_dataType_PopulationWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_PopulationPyramid_Input", "Y_Axis_dataType_PopulationWidget");
		String Select_Y_Axis_Value_PopulationWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_PopulationPyramid_Input", "Select_Y_Axis_Value_PopulationWidget");
		String X_Axis_dataType_PopulationWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_PopulationPyramid_Input", "X_Axis_dataType_PopulationWidget");
		String Select_X_Axis_Value_PopulationWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_PopulationPyramid_Input", "Select_X_Axis_Value_PopulationWidget");
		String Series_dataType_PopulationWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_PopulationPyramid_Input", "Series_dataType_PopulationWidget");
		String Select_Series_Value_PopulationWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_PopulationPyramid_Input", "Select_Series_Value_PopulationWidget");
			
		//Box Plot Widget 
		String X_Axis_dataType_BoxPlotWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_BoxPlot_Input", "X_Axis_dataType_BoxPlotWidget");
		String Select_X_Axis_Value_BoxPlotWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_BoxPlot_Input", "Select_X_Axis_Value_BoxPlotWidget");
		String Y_Axis_dataType_BoxPlotWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_BoxPlot_Input", "Y_Axis_dataType_BoxPlotWidget");
		String Select_Y_Axis_Value_BoxPlotWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_BoxPlot_Input", "Select_Y_Axis_Value_BoxPlotWidget");
		String SelectGroupValue_Date_BoxPlot=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_BoxPlot_Input", "SelectGroupValue_Date_BoxPlot");
		String Select_Sort_Value_BoxPlot=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_BoxPlot_Input", "Select_Sort_Value_BoxPlot");
		
		//Bar with Line/Scatter Widget 
		String Select_Line_OR_Scatter=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_BarWithLine_Input", "Select_Line_OR_Scatter");
		String X_Axis_dataType_BarLineWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_BarWithLine_Input", "X_Axis_dataType_BarLineWidget");
		String Select_X_Axis_Value_BarLineWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_BarWithLine_Input", "Select_X_Axis_Value_BarLineWidget");
		String Y_Axis_dataType_BarLineWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_BarWithLine_Input", "Y_Axis_dataType_BarLineWidget");
		String Select_Y_Axis_Value_BarLineWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_BarWithLine_Input", "Select_Y_Axis_Value_BarLineWidget");
		String Series_dataType_BarLineWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_BarWithLine_Input", "Series_dataType_BarLineWidget");
		String Select_Series_Value_BarLineWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_BarWithLine_Input", "Select_Series_Value_BarLineWidget");
		String SelectGroupValue_Date_BarLine=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_BarWithLine_Input", "SelectGroupValue_Date_BarLine");

		//Layered Column Widget 
		String X_Axis_dataType_LayeredWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_LayeredColumn_Input", "X_Axis_dataType_LayeredWidget");
		String Select_X_Axis_Value_LayeredWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_LayeredColumn_Input", "Select_X_Axis_Value_LayeredWidget");
		String Series_dataType_LayeredWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_LayeredColumn_Input", "Series_dataType_LayeredWidget");
		String Select_Series_Value_LayeredWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_LayeredColumn_Input", "Select_Series_Value_LayeredWidget");
		
		//Bullet Widget 
		String Y_Axis_dataType_BulletWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Bullet_Input", "Y_Axis_dataType_BulletWidget");
		String Select_Y_Axis_Value_BulletWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Bullet_Input", "Select_Y_Axis_Value_BulletWidget");
		String Group_dataType_BulletWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Bullet_Input", "Group_dataType_BulletWidget");
		String Select_Group_Value_BulletWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Bullet_Input", "Select_Group_Value_BulletWidget");
		String Target_dataType_BulletWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Bullet_Input", "Target_dataType_BulletWidget");
		String Select_Target_Value_BulletWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Bullet_Input", "Select_Target_Value_BulletWidget");
		String Value_dataType_BulletWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Bullet_Input", "Value_dataType_BulletWidget");
		String Select_Values_BulletWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Bullet_Input", "Select_Values_BulletWidget");
			
		//Circose Widget 
		String ValuesInput1_dataType_CircosWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Circos_Input", "ValuesInput1_dataType_CircosWidget");
		String Select_ValuesInput_Value1_CircoseWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Circos_Input", "Select_ValuesInput_Value1_CircoseWidget");
		String ValuesInput2_dataType_CircosWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Circos_Input", "ValuesInput2_dataType_CircosWidget");
		String Select_ValuesInput_Value2_CircoseWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Circos_Input", "Select_ValuesInput_Value2_CircoseWidget");
			
		//Candle Stick Widget 
		String DateInput_dataType_CandleWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_CandleStick_Input", "DateInput_dataType_CandleWidget");
		String Select_Date_Value_CandleWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_CandleStick_Input", "Select_Date_Value_CandleWidget");
		String Open_dataType_CandleWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_CandleStick_Input", "Open_dataType_CandleWidget");
		String Select_Open_Value_CandleWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_CandleStick_Input", "Select_Open_Value_CandleWidget");
		String High_dataType_CandleWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_CandleStick_Input", "High_dataType_CandleWidget");
		String Select_High_Value_CandleWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_CandleStick_Input", "Select_High_Value_CandleWidget");
		String Low_dataType_CandleWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_CandleStick_Input", "Low_dataType_CandleWidget");
		String Select_Low_Value_CandleWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_CandleStick_Input", "Select_Low_Value_CandleWidget");
		String Close_dataType_CandleWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_CandleStick_Input", "Close_dataType_CandleWidget");
		String Select_Close_Value_CandleWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_CandleStick_Input", "Select_Close_Value_CandleWidget");
		
		//Map With Bubble Widget 
		String Country_dataType_MapBubbleWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_MapWithBubble_Input", "Country_dataType_MapBubbleWidget");
		String Select_Country_Value_MapBubbleWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_MapWithBubble_Input", "Select_Country_Value_MapBubbleWidget");
		String Series_dataType_MapBubbleWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_MapWithBubble_Input", "Series_dataType_MapBubbleWidget");
		String Select_Series_Value_MapBubbleWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_MapWithBubble_Input", "Select_Series_Value_MapBubbleWidget");
		
		//WordCloud Widget 
		String Category_dataType_WordCloudWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_WordCloud_Input", "Category_dataType_WordCloudWidget");
		String Select_Category_Value_WordCloudWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_WordCloud_Input", "Select_Category_Value_WordCloudWidget");
		String N_Grams_Value=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_WordCloud_Input", "N_Grams_Value");
		String Top_K_Frequent_Value=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_WordCloud_Input", "Top_K_Frequent_Value");
		
		//Summary Widget 
		String X_Axis_dataType_SummaryWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Summary_Input", "X_Axis_dataType_SummaryWidget");
		String Select_X_Axis_Value_SummaryWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Summary_Input", "Select_X_Axis_Value_SummaryWidget");
		String Y_Axis_dataType_SummaryWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Summary_Input", "Y_Axis_dataType_SummaryWidget");
		String Select_Y_Axis_Value_SummaryWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Summary_Input", "Select_Y_Axis_Value_SummaryWidget");
		String SelectGroupValue_Date_SummaryChart=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Summary_Input", "SelectGroupValue_Date_SummaryChart");
		
		//Card Widget 
		String ColumnInput_dataType_CardWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Card_Input", "ColumnInput_dataType_CardWidget");
		String Select_ColumnInput_Value_CardWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Card_Input", "Select_ColumnInput_Value_CardWidget");
		
		//KPI Card Widget 
		String TimeLine_dataType_KPICardWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_KPICard_Input", "TimeLine_dataType_KPICardWidget");
		String Select_TimeLine_Value_KPICardWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_KPICard_Input", "Select_TimeLine_Value_KPICardWidget");
		String KPIName_dataType_KPICardWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_KPICard_Input", "KPIName_dataType_KPICardWidget");
		String Select_KPIName_Value_KPICardWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_KPICard_Input", "Select_KPIName_Value_KPICardWidget");
		String Group_dataType_KPICardWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_KPICard_Input", "Group_dataType_KPICardWidget");
		String Select_Group_Value_KPICardWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_KPICard_Input", "Select_Group_Value_KPICardWidget");
		String Period_Value_KPICardWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_KPICard_Input", "Period_Value_KPICardWidget");
		String Period_Count_Value_KPICardWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_KPICard_Input", "Period_Count_Value_KPICardWidget");
		
		//Custom Pivot Widget 
		String Group_dataType_CustomPivotWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_CustomPivot_Input", "Group_dataType_CustomPivotWidget");
		String Select_Group_Value_CustomPivotWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_CustomPivot_Input", "Select_Group_Value_CustomPivotWidget");
		String ValueInput_dataType_CustomPivotWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_CustomPivot_Input", "ValueInput_dataType_CustomPivotWidget");
		String Select_ValuesInput_Value_CustomPivotWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_CustomPivot_Input", "Select_ValuesInput_Value_CustomPivotWidget");
		
		//Pivot Widget 
		String Select_ColumnValue1_Pivot=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Pivot_Input", "Select_ColumnValue1_Pivot");
		String Select_ColumnValue2_Pivot=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_Pivot_Input", "Select_ColumnValue2_Pivot");
		
		//Custom Pivot Widget 
		String Date_dataType_SparkLineWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_SparkLine_Input", "Date_dataType_SparkLineWidget");
		String Select_Date_Value_SparkLineWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_SparkLine_Input", "Select_Date_Value_SparkLineWidget");
		String SelectGroupValue_Date_SparkLine=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_SparkLine_Input", "SelectGroupValue_Date_SparkLine");
		String Categories_dataType_SparkLineWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_SparkLine_Input", "Categories_dataType_SparkLineWidget");
		String Select_Categories_Value_SparkLineWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_SparkLine_Input", "Select_Categories_Value_SparkLineWidget");
		String Numericals_dataType_SparkLineWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_SparkLine_Input", "Numericals_dataType_SparkLineWidget");
		String Select_Numericals_Value_SparkLineWidget=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_SparkLine_Input", "Select_Numericals_Value_SparkLineWidget");
		String Period_Count_Value_Sparkline=Utils.getDataFromTestDataIteration(iteration,"SmokeTesting_AllCharts_SparkLine_Input", "Period_Count_Value_Sparkline");
				
		Actions action=new Actions(driver);
		mouseOverToElement(driver, ADDTabPlus);
  	    mouseOverAndClick(driver, ADDTabPlus);
  	    wait(driver,"1");
  	    sendKeys(driver,newlyAddedTab,"AllChartsTestTab");
  	    click(driver,DashProPage);
  	    elementnotvisible1(driver, RPE_Loading);
		waitForElement(driver,ADD_widget_rightTop);
	    click(driver,ADD_widget_rightTop);
	    elementnotvisible(driver,Loading);
	    elementnotvisible(driver,RPE_Loading);
	    verifyElementDisplayed(driver,WidgetPanel);
	    
     	//WidgetValidation(driver,Table_widget,"Table");
 	    // Need to Command for dry run Execution 
//    	 mouseOverToElement(driver,Widget);
//    	 if(isDisplayed2(driver,WidgetText)) {
//    		 fail(driver,"Tooltip not disappeared");
//   		 }else {
//       		  pass(driver,"Tooltip gets disappeared");
//   		 }
	    verifyElementDisplayed(driver, ThemeList);
	    verifyElementDisplayed(driver, WidgetSec);
	     
	     if(isDisplayed(driver,Table_widget)) {
	    	 WidgetValidation(driver,Table_widget,"Table");
	    	 click(driver,Table_widget);
	    	 if(isDisplayed2(driver,error)) {
	    		 String errorWidget=getText1(driver,error);
	    		 if(errorWidget.contains("Please refer the logs in Logs")) {
	    			 fail(driver,"Error displayed When click on 'Table' Widget, Validation : "+errorWidget);
	    		 }else {
	    			 pass(driver,"Error displayed When click on 'Table' Widget, Validation : "+errorWidget);
	    		 }
				 elementnotvisible1(driver, error);
	    	 }
	    	 if(isDisplayed(driver,AvailableColumnValues)) {
	    		 List<WebElement> AvailableColumns=getWebElements(driver, AvailableColumnValues);
	    		 int AvailableColumnsCount=AvailableColumns.size();
	    		 List<String> selectedText=new ArrayList<String>();
	    		 String allselectText="";
	    		 for (int i=0;i<3;i++) {
	    			 try {
	    				 WebElement columnAvailable=AvailableColumns.get(i);
	    				 action.moveToElement(columnAvailable).click().build().perform();
	    				 String text=columnAvailable.getText();
	    				 selectedText.add(text);
	    				 allselectText=allselectText+", ";
	    			 }catch(Exception e) {
	    				 
	    			 }
	    		 }
	    		 if(isToggleEnable(driver, SelectAllToogle)) {
	    	       	fail(driver,"Select All toggle Enabled while manually selecting only 3 coloumn");
	    		 }else {
		       		pass(driver,"Select All toggle not automatically Enabled while manually selecting only 3 coloumn");
	    		 }
	    		 scrollUsingElement(driver, ApplyButton);
	    		 click(driver,ApplyButton);
	    		 elementnotvisible1(driver, RPE_Loading);
	    		 if(isDisplayed2(driver,error)){
	    			 String errorWidget=getText1(driver,error);
		    		 if(errorWidget.contains("Please refer the logs in Logs")) {
		    			 fail(driver,"Error displayed When click Apply Button on 'Table' Widget, Validation : "+errorWidget);
		    		 }else {
		    			 pass(driver,"Error displayed When click on Apply Button 'Table' Widget, Validation : "+errorWidget);
		    		 }
		    		 elementnotvisible1(driver, error);
	    		 }else if(isDisplayed(driver,TableHeadings)) {
	    			 List<WebElement> chartdisplayedHeader=getWebElements(driver, TableHeadings);
	    			 int chartdisplayedHeaderCount=chartdisplayedHeader.size();
	    			 if(chartdisplayedHeaderCount==3) {
	    				 pass(driver,"Chart is displayed, Table header count matched with selected Column count");
	    			 }else {
	    				 fail(driver,"Chart is displayed, Table header count not matched with selected Column count");
	    			 }
	    		 }
	    		 
	    		 if(isDisplayed(driver,TableChartError)) {
	    			 pass(driver,"Chart not displayed for the select 3 column : "+allselectText +", Validation displayed in the chart : "+getText1(driver,TableChartError));
	    		 }
	    		 
	    		 click(driver,SelectAllToggleInput);
	    	     wait(driver,"1");
		       	 if(isToggleEnable(driver, SelectAllToogle)) {
		       		pass(driver,"Select All toogle enabled while click on it");
		       	 }else {
			       	fail(driver,"Select All toogle not enabled while click on it");
		       	 }
		         scrollUsingElement(driver, ApplyButton);
	    		 click(driver,ApplyButton);
	    		 elementnotvisible1(driver, RPE_Loading);
	    		 if(isDisplayed2(driver,error)){
	    			 String errorWidget=getText1(driver,error);
		    		 if(errorWidget.contains("Please refer the logs in Logs")) {
		    			 fail(driver,"Error displayed When click Apply Button on 'Table' Widget, Validation : "+errorWidget);
		    		 }else {
		    			 pass(driver,"Error displayed When click Apply Button on 'Table' Widget, Validation : "+errorWidget);
		    		 }
		    		 elementnotvisible1(driver, error);
	    		 }else if (isDisplayed(driver,TableHeadings)) {
	    			 List<WebElement> chartdisplayedHeader=getWebElements(driver, TableHeadings);
	    			 int chartdisplayedHeaderCount=chartdisplayedHeader.size();
	    			 if(chartdisplayedHeaderCount==AvailableColumnsCount) {
	    				 pass(driver,"Chart is displayed, Table header count matched with All selected Column count");
	    			 }else {
	    				 fail(driver,"Chart is displayed, Table header count not matched with All selected Column count");
	    			 }
	    		 }
	    		 
	    		 if(isDisplayed(driver,TableChartError)) {
	    			 pass(driver,"Chart not displayed for the Select All column , Validation displayed in the chart : "+getText1(driver,TableChartError));
	    		 }
	    		 
	    	 }else {
	    		 fail(driver,"No Column present in the Available Column, unable to perofrm Chart validation");
	    	 }
	    	 
	     }else {
	    	 fail(driver,"Table Widget is not displayed");
	     }
	     
	     if(isDisplayed(driver,Pivot_widget)) {
				WidgetValidation(driver,Pivot_widget,"Pivot");
				click(driver,Pivot_widget);
				if(!isDisplayed2(driver,error)) {
					waitForElement(driver,ColumnSelect_SectionPivot);
					waitForElement(driver,PivotSearch);
					sendKeys(driver,PivotSearch,Select_ColumnValue1_Pivot);
					selctPivotvalue(driver,Select_ColumnValue1_Pivot);
					clear1(driver,PivotSearch);
					sendKeys(driver,PivotSearch,Select_ColumnValue2_Pivot);
					selctPivotvalue(driver,Select_ColumnValue2_Pivot);
					
					scrollUsingElement(driver,ApplyButton);
					click(driver,ApplyButton);
					if(isDisplayed(driver,error)) {
						 String errorWidget=getText1(driver,error);
			    		 if(errorWidget.contains("Please refer the logs in Logs")) {
			    			 fail(driver,"Error displayed When click Apply button in the 'Pivot' Widget, Error : "+errorWidget);
			    		 }else {
			    			 pass(driver,"Error displayed When click Apply button in the 'Pivot' Widget, Error : "+errorWidget);
			    		 }
						elementnotvisible1(driver, error);
					}
					elementnotvisible1(driver, RPE_Loading);
					if(isDisplayed(driver,KPI_Card_Chart)) {
						pass(driver,"**Chart is Displayed in the Pivot Widget**");
					}else {
						fail(driver,"**Chart is not displayed in the Pivot Widget**");
					}
				}else {
	    			 String errorWidget=getText1(driver,error);
		    		 if(errorWidget.contains("Please refer the logs in Logs")) {
		    			 fail(driver,"Error displayed When click on 'Pivot' Widget Unable to perform Chart Validation, Error : "+errorWidget);
		    		 }else {
		    			 pass(driver,"Error displayed When click on 'Pivot' Widget Unable to perform Chart Validation, Error : "+errorWidget);
		    		 }
		    		 elementnotvisible1(driver, error);
				}
			}else {
				fail(driver,"Pivot Widget is not displayed");
			}
	     
	     
	     if(isDisplayed(driver,Bar_widget)) {
	    	    WidgetValidation(driver,Bar_widget,"Bar");
				click(driver,Bar_widget);
				if(isDisplayed2(driver,error)) {
					String errorWidget=getText1(driver,error);
		    		 if(errorWidget.contains("Please refer the logs in Logs")) {
		    			 fail(driver,"Error displayed When click on 'Bar' Widget Unable to perform Chart Validation, Error : "+errorWidget);
		    		 }else {
		    			 pass(driver,"Error displayed When click on 'Bar' Widget Unable to perform Chart Validation, Error : "+errorWidget);
		    		 }
					elementnotvisible1(driver, error);
				}
				if(isDisplayed2(driver,Axes)) {
					if(verifyElementDisplayed(driver, Y_Axis_dropdown)) {
						click(driver,Y_Axis_dropdown);
						waitForElement(driver,Y_Axis_dropdownResults);
						selectDropdownValue(driver,Y_Axis_dataType_BarWidget,Select_Y_Axis_Value_BarWidget);
						//new lines
						if(Y_Axis_dataType_BarWidget.equals("Date")) {
							verifyElementDisplayed(driver,GroupText);
							if(isDisplayed(driver,groupDropdown)) {
								pass(driver,"Group selection input option is displayed While select Date datatype in Y_axis");
								click(driver,groupDropdown);
								if(verifyElementDisplayed(driver, GroupDropdownExpand)){
									
									selectGroupDateValue(driver,SelectGroupValue_Date_BarWidget);
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
					}
					
					if(verifyElementDisplayed(driver, X_Axis_dropdown)) {
						click(driver,X_Axis_dropdown);
						waitForElement(driver,X_Axis_dropdownResults);
						selectDropdownValue(driver,X_Axis_dataType_BarWidget,Select_X_Axis_Value_BarWidget);
					}
					
					scrollUsingElement(driver,ApplyButton);
					click(driver,ApplyButton);
					elementnotvisible1(driver, RPE_Loading);
					if(isDisplayed2(driver,error)){
		    			 String errorWidget=getText1(driver,error);
			    		 if(errorWidget.contains("Please refer the logs in Logs")) {
			    			 fail(driver,"Error displayed When click Apply Button on 'Bar' Widget, Validation : "+errorWidget);
			    		 }else {
			    			 pass(driver,"Error displayed When click Apply Button on 'Bar' Widget, Validation : "+errorWidget);
			    		 }
			    		 elementnotvisible1(driver, error);
		    		 }else if(isDisplayed(driver,ChartGraph)) {
						pass(driver,"Chart is Displayed in the Bar Widget");
					}
		    		 
//					if(isDisplayed(driver,TableChartError)) {
//						fail(driver,"Chart is not displayed in the Bar Widget ,Error "+getText1(driver,TableChartError));
//					}
				}else {
					fail(driver,"Axes not displayed When Click the Bar Widget, Unable to perform Chart Validation");
					elementnotvisible1(driver, error);
				}
			}else {
				fail(driver,"Bar Widget is not displayed");
			}
	     
	     if(isDisplayed(driver,Stacked_Bar_widget)) {
	  	    	WidgetValidation(driver,Stacked_Bar_widget,"Stacked Bar");
				click(driver,Stacked_Bar_widget);
				if(!isDisplayed2(driver,error)) {
					waitForElement(driver, Axes);
					if(verifyElementDisplayed(driver, Y_Axis_dropdown)) {
						click(driver,Y_Axis_dropdown);
						waitForElement(driver,Y_Axis_dropdownResults);
						selectDropdownValue(driver,Y_Axis_dataType_StackedBarWidget,Select_Y_Axis_Value_StackedBarWidget);
						//new lines
						if(Y_Axis_dataType_StackedBarWidget.equals("Date")) {
							verifyElementDisplayed(driver,GroupText);
							if(isDisplayed(driver,groupDropdown)) {
								pass(driver,"Group selection input option is displayed While select Date datatype in Y_axis");
								click(driver,groupDropdown);
								if(verifyElementDisplayed(driver, GroupDropdownExpand)){
									
									selectGroupDateValue(driver,SelectGroupValue_Date_StackedBarWidget);
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
					}
					
					if(verifyElementDisplayed(driver, X_Axis_dropdown)) {
						click(driver,X_Axis_dropdown);
						waitForElement(driver,X_Axis_dropdownResults);
						selectDropdownValue(driver,X_Axis_dataType_StackedBarWidget,Select_X_Axis_Value_StackedBarWidget);
					}
					
					if(verifyElementDisplayed(driver, ColorSelectDropdown)) {
						click(driver,ColorSelectDropdown);
						waitForElement(driver,Color_DropdownResults);
						selectDropdownValue1(driver,Select_Color_Value_StackedBarWidget);
					}
					
					scrollUsingElement(driver,ApplyButton);
					click(driver,ApplyButton);
					
					elementnotvisible1(driver, RPE_Loading);
					if(isDisplayed2(driver,error)){
		    			 String errorWidget=getText1(driver,error);
			    		 if(errorWidget.contains("Please refer the logs in Logs")) {
			    			 fail(driver,"Error displayed When click Apply Button on 'Stacked Bar' Widget, Validation : "+errorWidget);
			    		 }else {
			    			 pass(driver,"Error displayed When click Apply Button on 'Stacked Bar' Widget, Validation : "+errorWidget);
			    		 }
			    		 elementnotvisible1(driver, error);
		    		 }else if(isDisplayed(driver,ChartGraph)) {
						pass(driver,"Chart is Displayed in the Stacked Bar Widget");
					}
		    		 
//		    		 if(isDisplayed(driver,TableChartError)) {
//						pass(driver,"Chart is not displayed in the Stacked Bar Widget , "+getText1(driver,TableChartError));
//					 }
				}else {
					 String errorWidget=getText1(driver,error);
		    		 if(errorWidget.contains("Please refer the logs in Logs")) {
		    			 fail(driver,"Error displayed When click on 'Stacked Bar' Widget Unable to perform Chart Validation, Error : "+errorWidget);
		    		 }else {
		    			 pass(driver,"Error displayed When click on 'Stacked Bar' Widget Unable to perform Chart Validation, Error : "+errorWidget);
		    		 }
					elementnotvisible1(driver, error);
				}
				
			}else {
				fail(driver,"Stacked Bar Widget is not displayed");
			}
	  
	     if(isDisplayed(driver,Grouped_Bar_widget)) {
	  	        WidgetValidation(driver,Grouped_Bar_widget,"Grouped Bar");
				click(driver,Grouped_Bar_widget);
				if(!isDisplayed2(driver,error)) {
					waitForElement(driver, Axes);
					if(verifyElementDisplayed(driver, Y_Axis_dropdown)) {
						click(driver,Y_Axis_dropdown);
						waitForElement(driver,Y_Axis_dropdownResults);
						selectDropdownValue(driver,Y_Axis_dataType_GroupedBarWidget,Select_Y_Axis_Value_GroupedBarWidget);
						//new lines
						if(Y_Axis_dataType_GroupedBarWidget.equals("Date")) {
							verifyElementDisplayed(driver,GroupText);
							if(isDisplayed(driver,groupDropdown)) {
								pass(driver,"Group selection input option is displayed While select Date datatype in Y_axis");
								click(driver,groupDropdown);
								if(verifyElementDisplayed(driver, GroupDropdownExpand)){
									selectGroupDateValue(driver,SelectGroupValue_Date_GroupedBarWidget);
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
					}
					
					if(verifyElementDisplayed(driver, X_Axis_Input_GroupedBar)) {
						click(driver,X_Axis_Input_GroupedBar);
						waitForElement(driver, X_Axis_DropdownExpand);
						selectDropdownValue(driver,X_Axis_dataType_GroupedBarWidget,Select_X_Axis_Value_GroupedBarWidget);
						click(driver,X_Axis_Text_GroupedBar);
						if(X_Axis_dataType_GroupedBarWidget.equals("Numerical")) {
							if(isDisplayed(driver,GroupInput_Numeric)) {
								pass(driver,"Group selection input option is displayed While select Numerical datatype in X_axis");
								click(driver,GroupInput_Numeric);
								waitForElement(driver,GroupDropdown_Numeric_Expand);
								selectDropdownValue1(driver,Group_Value_X_Axis_GroupedBar);
							}else {
								fail(driver,"Group selection input option is not displayed While select Numerical datatype in X_axis");
							}
						}
					}
					
					scrollUsingElement(driver,ApplyButton);
					click(driver,ApplyButton);
					elementnotvisible1(driver, RPE_Loading);
					if(isDisplayed2(driver,error)){
		    			 String errorWidget=getText1(driver,error);
			    		 if(errorWidget.contains("Please refer the logs in Logs")) {
			    			 fail(driver,"Error displayed When click Apply Button on 'Grouped Bar' Widget, Validation : "+errorWidget);
			    		 }else {
			    			 pass(driver,"Error displayed When click Apply Button on 'Grouped Bar' Widget, Validation : "+errorWidget);
			    		 }
			    		 elementnotvisible1(driver, error);
		    		 }else if(isDisplayed(driver,ChartGraph)) {
						pass(driver,"Chart is Displayed in the Grouped Bar Widget");
					}
		    		 		    		 
//		    		 if(isDisplayed(driver,TableChartError)) {
//						pass(driver,"Chart is not displayed in the Grouped Bar Widget , "+getText1(driver,TableChartError));
//					}
					
				}else {
					 String errorWidget=getText1(driver,error);
		    		 if(errorWidget.contains("Please refer the logs in Logs")) {
		    			 fail(driver,"Error displayed When click on 'Grouped Bar' Widget Unable to perform Chart Validation, Error : "+errorWidget);
		    		 }else {
		    			 pass(driver,"Error displayed When click on 'Grouped Bar' Widget Unable to perform Chart Validation, Error : "+errorWidget);
		    		 }
					elementnotvisible1(driver, error);
				}
				
			}else {
				fail(driver,"Grouped Widget is not displayed");
			}
	     
		 if(isDisplayed(driver,Coloumn_widget)) {
			WidgetValidation(driver,Coloumn_widget,"Column");
			click(driver,Coloumn_widget);
			if(!isDisplayed2(driver,error)) {
				waitForElement(driver,Axes);
				if(verifyElementDisplayed(driver, X_Axis_Input)) {
					click(driver,X_Axis_Input);
					if(isDisplayed(driver,X_Axis_dropdownResultsExp)) {
						pass(driver,"X-Axis dropdown Expanded after click on it");
						selectDropdownValue(driver,X_Axis_dataType_ColumnWidget,Select_X_Axis_Value_ColumnWidget);
						if(X_Axis_dataType_ColumnWidget.equals("Date")) {
							 if(isDisplayed(driver,groupDropdown)) {
								  pass(driver,"Group selection input option is displayed While select Date datatype in X_axis");
								  click(driver,groupDropdown);
								  if(verifyElementDisplayed(driver, GroupDropdownExpand)){
									  selectGroupDateValue(driver,SelectGroupValue_Date_Column);
								  }
									
							 }else {
								 fail(driver,"Group selection input option is not displayed While select Date datatype in X_axis");
							 }
						 }
					}else {
						fail(driver,"X-Axis dropdown not Expanded after click on it");
					}
				}
				
				if(verifyElementDisplayed(driver, Y_Axis_Input)) {
					click(driver,Y_Axis_Input);
					if(isDisplayed(driver,Y_Axis_dropdownResultsExp)) {
						pass(driver,"Y-Axis dropdown Expanded after click on it");
						selectDropdownValue(driver,Y_Axis_dataType_ColumnWidget,Select_Y_Axis_Value_ColumnWidget);
					}else {
						fail(driver,"Y-Axis dropdown not Expanded after click on it");
					}
				}
				
				scrollUsingElement(driver,ApplyButton);
				click(driver,ApplyButton);
				elementnotvisible1(driver, RPE_Loading);
				if(isDisplayed2(driver,error)){
	    			 String errorWidget=getText1(driver,error);
		    		 if(errorWidget.contains("Please refer the logs in Logs")) {
		    			 fail(driver,"Error displayed When click Apply Button on 'Column' Widget, Validation : "+errorWidget);
		    		 }else {
		    			 pass(driver,"Error displayed When click Apply Button on 'Column' Widget, Validation : "+errorWidget);
		    		 }
		    		 elementnotvisible1(driver, error);
	    		}else if(isDisplayed(driver,ChartGraph)) {
					pass(driver,"Chart is Displayed in the Column Widget");
				}
				
			}else {
				String errorWidget=getText1(driver,error);
	    		 if(errorWidget.contains("Please refer the logs in Logs")) {
	    			 fail(driver,"Error displayed When click on 'Column' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }else {
	    			 pass(driver,"Error displayed When click on 'Column' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }
				elementnotvisible1(driver, error);
			}
		}else {
			fail(driver,"Column Widget is not displayed");
		}
		
		if(isDisplayed(driver,Stacked_Column_widget)) {
			WidgetValidation(driver,Stacked_Column_widget,"Stacked Column");
			click(driver,Stacked_Column_widget);
			if(!isDisplayed2(driver,error)) {
				waitForElement(driver,Axes);
				if(verifyElementDisplayed(driver, X_Axis_Input)) {
					click(driver,X_Axis_Input);
					if(isDisplayed(driver,X_Axis_dropdownResultsExp)) {
						pass(driver,"X-Axis dropdown Expanded after click on it");
						selectDropdownValue(driver,X_Axis_dataType_StackedColumnWidget,Select_X_Axis_Value_StackedColumnWidget);
						if(X_Axis_dataType_StackedColumnWidget.equals("Date")) {
							 if(isDisplayed(driver,groupDropdown)) {
								  pass(driver,"Group selection input option is displayed While select Date datatype in X_axis");
								  click(driver,groupDropdown);
								  if(verifyElementDisplayed(driver, GroupDropdownExpand)){
									  selectGroupDateValue(driver,SelectGroupValue_Date_StackedColumn);
								  }
									
							 }else {
								 fail(driver,"Group selection input option is not displayed While select Date datatype in X_axis");
							 }
						 }
					}else {
						fail(driver,"X-Axis dropdown not Expanded after click on it");
					}
				}
				
				if(verifyElementDisplayed(driver, Y_Axis_Input)) {
					click(driver,Y_Axis_Input);
					if(isDisplayed(driver,Y_Axis_dropdownResultsExp)) {
						pass(driver,"Y-Axis dropdown Expanded after click on it");
						selectDropdownValue(driver,Y_Axis_dataType_StackedColumnWidget,Select_Y_Axis_Value_StackedColumWidget);
					}else {
						fail(driver,"Y-Axis dropdown not Expanded after click on it");
					}
				}
				
				if(verifyElementDisplayed(driver, ColorSelectDropdown)) {
					click(driver,ColorSelectDropdown);
					if(isDisplayed(driver,Color_DropdownResults)) {
						pass(driver,"Color dropdown Expanded after click on it");
						selectDropdownValue1(driver,Select_Color_Value_StackedColumnWidget);
					}else {
						fail(driver,"Color dropdown not Expanded after click on it");
					}
				}
				
				
				scrollUsingElement(driver,ApplyButton);
				click(driver,ApplyButton);
				elementnotvisible1(driver, RPE_Loading);
				if(isDisplayed2(driver,error)){
	    			 String errorWidget=getText1(driver,error);
		    		 if(errorWidget.contains("Please refer the logs in Logs")) {
		    			 fail(driver,"Error displayed When click Apply Button on 'Stacked Column' Widget, Validation : "+errorWidget);
		    		 }else {
		    			 pass(driver,"Error displayed When click Apply Button on 'Stacked Column' Widget, Validation : "+errorWidget);
		    		 }
		    		 elementnotvisible1(driver, error);
	    		 }else if(isDisplayed(driver,ChartGraph)) {
					pass(driver,"Chart is Displayed in the Stacked_Column Widget");
				 }
				
			}else {
				 String errorWidget=getText1(driver,error);
	    		 if(errorWidget.contains("Please refer the logs in Logs")) {
	    			 fail(driver,"Error displayed When click on 'Stacked Column' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }else {
	    			 pass(driver,"Error displayed When click on 'Stacked Column' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }
				elementnotvisible1(driver, error);
			}
			// test update
			
		}else {
			fail(driver,"Stacked Column Widget is not displayed");
		}
		
		
		if(isDisplayed(driver,Grouped_Column_widget)) {
			WidgetValidation(driver,Grouped_Column_widget,"Grouped Column");
			click(driver,Grouped_Column_widget);
			if(!isDisplayed2(driver,error)) {
				waitForElement(driver,Axes);
				if(verifyElementDisplayed(driver, X_Axis_Input)) {
					click(driver,X_Axis_Input);
					if(isDisplayed(driver,X_Axis_dropdownResultsExp)) {
						pass(driver,"X-Axis dropdown Expanded after click on it");
						selectDropdownValue(driver,X_Axis_dataType_GroupedColumnWidget,Select_X_Axis_Value_GroupedColumnWidget);
						if(X_Axis_dataType_GroupedColumnWidget.equals("Date")) {
							 if(isDisplayed(driver,groupDropdown)) {
								  pass(driver,"Group selection input option is displayed While select Date datatype in X_axis");
								  click(driver,groupDropdown);
								  if(verifyElementDisplayed(driver, GroupDropdownExpand)){
									  selectGroupDateValue(driver,SelectGroupValue_Date_GroupedColumn);
								  }
									
							 }else {
								 fail(driver,"Group selection input option is not displayed While select Date datatype in X_axis");
							 }
						 }
					}else {
						fail(driver,"X-Axis dropdown not Expanded after click on it");
					}
				}
				
				if(verifyElementDisplayed(driver, Y_Axis_Input_Group)) {
					click(driver,Y_Axis_Input_Group);
					if(isDisplayed(driver,Y_Axis_DropdownExpand)) {
						pass(driver,"Y-Axis dropdown Expanded after click on it");
						selectDropdownValue(driver,Y_Axis_dataType_GroupedColumnWidget,Select_Y_Axis_Value_GroupedColumnWidget);
						click(driver,Y_Axis_Text_Group);
						if(Y_Axis_dataType_GroupedColumnWidget.equalsIgnoreCase("Numerical")) {
							waitForElement(driver, GroupInput_Numeric);
							click(driver,GroupInput_Numeric);
							if(isDisplayed(driver, GroupDropdown_Numeric_Expand)) {
								pass(driver,"Group dropdown is expanded after click on it");
								selectDropdownValue1(driver,SelectGroupValue_YAxis_GroupedColumn);
								wait(driver,"1");
							}
						}
					}else {
						fail(driver,"Y-Axis dropdown not Expanded after click on it");
					}
				}
				
				scrollUsingElement(driver,ApplyButton);
				click(driver,ApplyButton);
				
				elementnotvisible1(driver, RPE_Loading);
				if(isDisplayed2(driver,error)){
	    			 String errorWidget=getText1(driver,error);
		    		 if(errorWidget.contains("Please refer the logs in Logs")) {
		    			 fail(driver,"Error displayed When click Apply Button on 'Grouped Column' Widget, Validation : "+errorWidget);
		    		 }else {
		    			 pass(driver,"Error displayed When click Apply Button on 'Grouped Column' Widget, Validation : "+errorWidget);
		    		 }
		    		 elementnotvisible1(driver, error);
	    		 }else if(isDisplayed(driver,ChartGraph)) {
					pass(driver,"Chart is Displayed in the Grouped_Column Widget");
				 }
				
			}else {
				 String errorWidget=getText1(driver,error);
	    		 if(errorWidget.contains("Please refer the logs in Logs")) {
	    			 fail(driver,"Error displayed When click on 'Grouped Column' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }else {
	    			 pass(driver,"Error displayed When click on 'Grouped Column' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }
				elementnotvisible1(driver, error);
			}
			
			
		}else {
			fail(driver,"Grouped Column Widget is not displayed");
		}
		
		if(isDisplayed(driver,Pie_widget)) {
			 WidgetValidation(driver,Pie_widget,"Pie");
			click(driver,Pie_widget);
			if(!isDisplayed2(driver,error)) {
				waitForElement(driver,Axes);
				if(verifyElementDisplayed(driver, X_Axis_Input)) {
					click(driver,X_Axis_Input);
					if(isDisplayed(driver,X_Axis_dropdownResultsExp)) {
						pass(driver,"X-Axis dropdown Expanded after click on it");
						selectDropdownValue(driver,X_Axis_dataType_PieWidget,Select_X_Axis_Value_PieWidget);
						if(X_Axis_dataType_PieWidget.equals("Date")) {
							 if(isDisplayed(driver,groupDropdown)) {
								  pass(driver,"Group selection input option is displayed While select Date datatype in X_axis");
								  click(driver,groupDropdown);
								  if(verifyElementDisplayed(driver, GroupDropdownExpand)){
									  selectGroupDateValue(driver,SelectGroupValue_Date_PieChart);
								  }
									
							 }else {
								 fail(driver,"Group selection input option is not displayed While select Date datatype in X_axis");
							 }
						 }
					}else {
						fail(driver,"X-Axis dropdown not Expanded after click on it");
					}
				}
				
				if(verifyElementDisplayed(driver, Y_Axis_Input)) {
					click(driver,Y_Axis_Input);
					if(isDisplayed(driver,Y_Axis_dropdownResultsExp)) {
						pass(driver,"Y-Axis dropdown Expanded after click on it");
						selectDropdownValue(driver,Y_Axis_dataType_PieWidget,Select_Y_Axis_Value_PieWidget);
					}else {
						fail(driver,"Y-Axis dropdown not Expanded after click on it");
					}
				}
				
				scrollUsingElement(driver,ApplyButton);
				click(driver,ApplyButton);
				elementnotvisible1(driver, RPE_Loading);
				
				if(isDisplayed2(driver,error)){
	    			 String errorWidget=getText1(driver,error);
		    		 if(errorWidget.contains("Please refer the logs in Logs")) {
		    			 fail(driver,"Error displayed When click Apply Button on 'Pie' Widget, Validation : "+errorWidget);
		    		 }else {
		    			 pass(driver,"Error displayed When click Apply Button on 'Pie' Widget, Validation : "+errorWidget);
		    		 }
		    		 elementnotvisible1(driver, error);
	    		 }else if(isDisplayed(driver,ChartGraph)) {
					pass(driver,"Chart is Displayed in the Pie Widget");
				 }
				
			}else {
				 String errorWidget=getText1(driver,error);
	    		 if(errorWidget.contains("Please refer the logs in Logs")) {
	    			 fail(driver,"Error displayed When click on 'Pie' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }else {
	    			 pass(driver,"Error displayed When click on 'Pie' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }
				elementnotvisible1(driver, error);
			}
			
			
		}else {
			fail(driver,"Pie Widget is not displayed");
		}
		
		if(isDisplayed(driver,Donut_widget)) {
			WidgetValidation(driver,Donut_widget,"Donut");
			click(driver,Donut_widget);
			if(!isDisplayed2(driver,error)) {
				waitForElement(driver,Axes);
				if(verifyElementDisplayed(driver, X_Axis_Input)) {
					click(driver,X_Axis_Input);
					if(isDisplayed(driver,X_Axis_dropdownResultsExp)) {
						pass(driver,"X-Axis dropdown Expanded after click on it");
						selectDropdownValue(driver,X_Axis_dataType_DonutWidget,Select_X_Axis_Value_DonutWidget);
						if(X_Axis_dataType_DonutWidget.equals("Date")) {
							 if(isDisplayed(driver,groupDropdown)) {
								  pass(driver,"Group selection input option is displayed While select Date datatype in X_axis");
								  click(driver,groupDropdown);
								  if(verifyElementDisplayed(driver, GroupDropdownExpand)){
									  selectGroupDateValue(driver,SelectGroupValue_Date_DonutChart);
								  }
									
							 }else {
								 fail(driver,"Group selection input option is not displayed While select Date datatype in X_axis");
							 }
						 }
					}else {
						fail(driver,"X-Axis dropdown not Expanded after click on it");
					}
				}
				
				if(verifyElementDisplayed(driver, Y_Axis_Input)) {
					click(driver,Y_Axis_Input);
					if(isDisplayed(driver,Y_Axis_dropdownResultsExp)) {
						pass(driver,"Y-Axis dropdown Expanded after click on it");
						selectDropdownValue(driver,Y_Axis_dataType_DonutWidget,Select_Y_Axis_Value_DonutWidget);
					}else {
						fail(driver,"Y-Axis dropdown not Expanded after click on it");
					}
				}
				
				scrollUsingElement(driver,ApplyButton);
				click(driver,ApplyButton);
				elementnotvisible1(driver, RPE_Loading);
				if(isDisplayed2(driver,error)){
	    			 String errorWidget=getText1(driver,error);
		    		 if(errorWidget.contains("Please refer the logs in Logs")) {
		    			 fail(driver,"Error displayed When click Apply Button on 'Donut' Widget, Validation : "+errorWidget);
		    		 }else {
		    			 pass(driver,"Error displayed When click Apply Button on 'Donut' Widget, Validation : "+errorWidget);
		    		 }
		    		 elementnotvisible1(driver, error);
	    		 }else if(isDisplayed(driver,ChartGraph)) {
					pass(driver,"Chart is Displayed in the Donut Widget");
				 }
				
			}else {
				 String errorWidget=getText1(driver,error);
	    		 if(errorWidget.contains("Please refer the logs in Logs")) {
	    			 fail(driver,"Error displayed When click on 'Donut' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }else {
	    			 pass(driver,"Error displayed When click on 'Donut' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }
				elementnotvisible1(driver, error);
			}
			
		}else {
			fail(driver,"Donut Widget is not displayed");
		}
		
		if(isDisplayed(driver,SemiCircle_widget)) {
			WidgetValidation(driver,SemiCircle_widget,"semi circle");
			click(driver,SemiCircle_widget);
			if(!isDisplayed2(driver,error)) {
				waitForElement(driver,Axes);
				if(verifyElementDisplayed(driver, X_Axis_Input)) {
					click(driver,X_Axis_Input);
					if(isDisplayed(driver,X_Axis_dropdownResultsExp)) {
						pass(driver,"X-Axis dropdown Expanded after click on it");
						selectDropdownValue(driver,X_Axis_dataType_SemiCircleWidget,Select_X_Axis_Value_SemiCircleWidget);
						if(X_Axis_dataType_SemiCircleWidget.equals("Date")) {
							 if(isDisplayed(driver,groupDropdown)) {
								  pass(driver,"Group selection input option is displayed While select Date datatype in X_axis");
								  click(driver,groupDropdown);
								  if(verifyElementDisplayed(driver, GroupDropdownExpand)){
									  selectGroupDateValue(driver,SelectGroupValue_Date_SemiCircleChart);
								  }
									
							 }else {
								 fail(driver,"Group selection input option is not displayed While select Date datatype in X_axis");
							 }
						 }
					}else {
						fail(driver,"X-Axis dropdown not Expanded after click on it");
					}
				}
				
				if(verifyElementDisplayed(driver, Y_Axis_Input)) {
					click(driver,Y_Axis_Input);
					if(isDisplayed(driver,Y_Axis_dropdownResultsExp)) {
						pass(driver,"Y-Axis dropdown Expanded after click on it");
						selectDropdownValue(driver,Y_Axis_dataType_SemiCircleWidget,Select_Y_Axis_Value_SemiCircleWidget);
					}else {
						fail(driver,"Y-Axis dropdown not Expanded after click on it");
					}
				}
				
				scrollUsingElement(driver,ApplyButton);
				click(driver,ApplyButton);
				elementnotvisible1(driver, RPE_Loading);
				if(isDisplayed2(driver,error)){
	    			 String errorWidget=getText1(driver,error);
		    		 if(errorWidget.contains("Please refer the logs in Logs")) {
		    			 fail(driver,"Error displayed When click Apply Button on 'Semi Circle' Widget, Validation : "+errorWidget);
		    		 }else {
		    			 pass(driver,"Error displayed When click Apply Button on 'Semi Circle' Widget, Validation : "+errorWidget);
		    		 }
		    		 elementnotvisible1(driver, error);
	    		 }else if(isDisplayed(driver,ChartGraph)) {
					pass(driver,"Chart is Displayed in the Semi Circle Widget");
				 }
			}else {
				 String errorWidget=getText1(driver,error);
	    		 if(errorWidget.contains("Please refer the logs in Logs")) {
	    			 fail(driver,"Error displayed When click on 'Semi Circle' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }else {
	    			 pass(driver,"Error displayed When click on 'Semi Circle' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }
				elementnotvisible1(driver, error);
			}
			
		}else {
			fail(driver,"Semi Circle Widget is not displayed");
		}
		
		if(isDisplayed(driver,SunBurst_widget)) {
			WidgetValidation(driver,SunBurst_widget,"Sun burst");
			click(driver,SunBurst_widget);
			if(!isDisplayed2(driver,error)) {
				waitForElement(driver,Axes);
				if(verifyElementDisplayed(driver, Categories_Input)) {
					click(driver,Categories_Input);
					if(isDisplayed(driver,Categories_DropdownExpand)) {
						pass(driver,"Categories dropdown Expanded after click on it");
						selectDropdownValue(driver,Categories_dataType_SunBurstWidget,Select_Categories_Value_SunBurstWidget);
						wait(driver,"1");
						click(driver,CategoriesText);
					}else {
						fail(driver,"Categories dropdown not Expanded after click on it");
					}
				}
				
				if(verifyElementDisplayed(driver, Series_Input)) {
					click(driver,Series_Input);
					if(isDisplayed(driver,Series_DropdownExpand)) {
						pass(driver,"Series dropdown Expanded after click on it");
						selectDropdownValue(driver,Series_dataType_SunBurstWidget,Select_Series_Value_SunBurstWidget);
					}else {
						fail(driver,"Series dropdown not Expanded after click on it");
					}
				}
				
				scrollUsingElement(driver,ApplyButton);
				click(driver,ApplyButton);
				elementnotvisible1(driver, RPE_Loading);
				if(isDisplayed2(driver,error)){
	    			 String errorWidget=getText1(driver,error);
		    		 if(errorWidget.contains("Please refer the logs in Logs")) {
		    			 fail(driver,"Error displayed When click Apply Button on 'Sun Burst' Widget, Validation : "+errorWidget);
		    		 }else {
		    			 pass(driver,"Error displayed When click Apply Button on 'Sun Burst' Widget, Validation : "+errorWidget);
		    		 }
		    		 elementnotvisible1(driver, error);
	    		 }else if(isDisplayed(driver,ChartGraph)) {
					pass(driver,"Chart is Displayed in the Sun Burst Widget");
				 }
				
			}else {
				 String errorWidget=getText1(driver,error);
	    		 if(errorWidget.contains("Please refer the logs in Logs")) {
	    			 fail(driver,"Error displayed When click on 'Sun Burst' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }else {
	    			 pass(driver,"Error displayed When click on 'Sun Burst' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }
				 elementnotvisible1(driver, error);
			}
			
		}else {
			fail(driver,"Sun Burst Widget is not displayed");
		}
		
		
		if(isDisplayed(driver,WaterFall_widget)) {
			WidgetValidation(driver,WaterFall_widget,"Water Fall");
			click(driver,WaterFall_widget);
			if(!isDisplayed2(driver,error)) {
				waitForElement(driver,Axes);
				if(verifyElementDisplayed(driver, X_Axis_Input)) {
					click(driver,X_Axis_Input);
					if(isDisplayed(driver,X_Axis_dropdownResultsExp)) {
						pass(driver,"X-Axis dropdown Expanded after click on it");
						selectDropdownValue(driver,X_Axis_dataType_WaterFallWidget,Select_X_Axis_Value_WaterFallWidget);
					}else {
						fail(driver,"X-Axis dropdown not Expanded after click on it");
					}
				}
				
				
				if(verifyElementDisplayed(driver, Y_Axis_Input)) {
					click(driver,Y_Axis_Input);
					if(isDisplayed(driver,Y_Axis_dropdownResultsExp)) {
						pass(driver,"Y-Axis dropdown Expanded after click on it");
						selectDropdownValue(driver,Y_Axis_dataType_WaterFallWidget,Select_Y_Axis_Value_WaterFallWidget);
					}else {
						fail(driver,"Y-Axis dropdown not Expanded after click on it");
					}
				}
				
				scrollUsingElement(driver,ApplyButton);
				click(driver,ApplyButton);
				elementnotvisible1(driver, RPE_Loading);
				if(isDisplayed2(driver,error)){
	    			 String errorWidget=getText1(driver,error);
		    		 if(errorWidget.contains("Please refer the logs in Logs")) {
		    			 fail(driver,"Error displayed When click Apply Button on 'Water Fall' Widget, Validation : "+errorWidget);
		    		 }else {
		    			 pass(driver,"Error displayed When click Apply Button on 'Water Fall' Widget, Validation : "+errorWidget);
		    		 }
		    		 elementnotvisible1(driver, error);
	    		 }else if(isDisplayed(driver,ChartGraph)) {
					pass(driver,"Chart is Displayed in the Water Fall Widget");
				 }
				
			}else {
				 String errorWidget=getText1(driver,error);
	    		 if(errorWidget.contains("Please refer the logs in Logs")) {
	    			 fail(driver,"Error displayed When click on 'Water Fall' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }else {
	    			 pass(driver,"Error displayed When click on 'Water Fall' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }
				elementnotvisible1(driver, error);
			}
			
		}else {
			fail(driver,"Water Fall Widget is not displayed");
		}
		
		if(isDisplayed(driver,Network_widget)) {
			WidgetValidation(driver,Network_widget,"Network");
			click(driver,Network_widget);
			if(!isDisplayed2(driver,error)) {
				waitForElement(driver,Axes);
				if(verifyElementDisplayed(driver, Categories_Input)) {
					click(driver,Categories_Input);
					if(isDisplayed(driver,Categories_DropdownExpand)) {
						pass(driver,"Categories dropdown Expanded after click on it");
						selectDropdownValue(driver,Categories_dataType_NetworkWidget,Select_Categories_Value_NetworkWidget);
						wait(driver,"1");
						click(driver,CategoriesText);
					}else {
						fail(driver,"Categories dropdown not Expanded after click on it");
					}
				}
				
				if(verifyElementDisplayed(driver, Series_Input)) {
					click(driver,Series_Input);
					if(isDisplayed(driver,Series_DropdownExpand)) {
						pass(driver,"Series dropdown Expanded after click on it");
						selectDropdownValue(driver,Series_dataType_NetworkWidget,Select_Series_Value_NetworkWidget);
					}else {
						fail(driver,"Series dropdown not Expanded after click on it");
					}
				}
				
				scrollUsingElement(driver,ApplyButton);
				click(driver,ApplyButton);
				elementnotvisible1(driver, RPE_Loading);
				if(isDisplayed2(driver,error)){
	    			 String errorWidget=getText1(driver,error);
		    		 if(errorWidget.contains("Please refer the logs in Logs")) {
		    			 fail(driver,"Error displayed When click Apply Button on 'Network' Widget, Validation : "+errorWidget);
		    		 }else {
		    			 pass(driver,"Error displayed When click Apply Button on 'Network' Widget, Validation : "+errorWidget);
		    		 }
		    		 elementnotvisible1(driver, error);
	    		 }else if(isDisplayed(driver,ChartGraph)) {
					pass(driver,"Chart is Displayed in the Network Widget");
				 }
				
			}else {
				 String errorWidget=getText1(driver,error);
	    		 if(errorWidget.contains("Please refer the logs in Logs")) {
	    			 fail(driver,"Error displayed When click on 'Network' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }else {
	    			 pass(driver,"Error displayed When click on 'Network' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }
				elementnotvisible1(driver, error);
			}
			
		}else {
			fail(driver,"Network Widget is not displayed");
		}
		
		if(isDisplayed(driver,Line_widget)) {
			WidgetValidation(driver,Line_widget,"Line");
			click(driver,Line_widget);
			if(!isDisplayed2(driver,error)) {
				waitForElement(driver,Axes);
				if(verifyElementDisplayed(driver, X_Axis_Input)) {
					click(driver,X_Axis_Input);
					if(isDisplayed(driver,X_Axis_dropdownResultsExp)) {
						pass(driver,"X-Axis dropdown Expanded after click on it");
						selectDropdownValue(driver,X_Axis_dataType_LineWidget,Select_X_Axis_Value_LineWidget);
						if(X_Axis_dataType_LineWidget.equals("Date")) {
							 if(isDisplayed(driver,groupDropdown)) {
								  pass(driver,"Group selection input option is displayed While select Date datatype in X_axis");
								  click(driver,groupDropdown);
								  if(verifyElementDisplayed(driver, GroupDropdownExpand)){
									  selectGroupDateValue(driver,SelectGroupValue_Date_Line);
								  }
									
							 }else {
								 fail(driver,"Group selection input option is not displayed While select Date datatype in X_axis");
							 }
						 }
					}else {
						fail(driver,"X-Axis dropdown not Expanded after click on it");
					}
				}
				
				if(verifyElementDisplayed(driver, Y_Axis_Input_Group)) {
					click(driver,Y_Axis_Input_Group);
					if(isDisplayed(driver,Y_Axis_DropdownExpand)) {
						pass(driver,"Y-Axis dropdown Expanded after click on it");
						selectDropdownValue(driver,Y_Axis_dataType_LineWidget,Select_Y_Axis_Value_LineWidget);
						click(driver,Y_Axis_Text_Group);
						if(Y_Axis_dataType_LineWidget.equalsIgnoreCase("Numerical")) {
							waitForElement(driver, GroupInput_Numeric);
							click(driver,GroupInput_Numeric);
							if(isDisplayed(driver, GroupDropdown_Numeric_Expand)) {
								pass(driver,"Group dropdown is expanded after click on it");
								selectDropdownValue1(driver,SelectGroupValue_YAxis_Line);
								wait(driver,"1");
							}
						}
					}else {
						fail(driver,"Y-Axis dropdown not Expanded after click on it");
					}
				}
				
				scrollUsingElement(driver,ApplyButton);
				click(driver,ApplyButton);
				elementnotvisible1(driver, RPE_Loading);
				if(isDisplayed2(driver,error)){
	    			 String errorWidget=getText1(driver,error);
		    		 if(errorWidget.contains("Please refer the logs in Logs")) {
		    			 fail(driver,"Error displayed When click Apply Button on 'Line' Widget, Validation : "+errorWidget);
		    		 }else {
		    			 pass(driver,"Error displayed When click Apply Button on 'Line' Widget, Validation : "+errorWidget);
		    		 }
		    		 elementnotvisible1(driver, error);
	    		 }else if(isDisplayed(driver,ChartGraph)) {
					pass(driver,"Chart is Displayed in the Line Widget");
				 }
				
			}else {
				 String errorWidget=getText1(driver,error);
	    		 if(errorWidget.contains("Please refer the logs in Logs")) {
	    			 fail(driver,"Error displayed When click on 'Line' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }else {
	    			 pass(driver,"Error displayed When click on 'Line' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }
				 elementnotvisible1(driver, error);
			}
			
		}else {
			fail(driver,"Line Widget is not displayed");
		}
		
		if(isDisplayed(driver,Area_widget)) {
			WidgetValidation(driver,Area_widget,"Area");
			click(driver,Area_widget);
			if(!isDisplayed2(driver,error)) {
				waitForElement(driver,Axes);
				if(verifyElementDisplayed(driver, X_Axis_Input)) {
					click(driver,X_Axis_Input);
					if(isDisplayed(driver,X_Axis_dropdownResultsExp)) {
						pass(driver,"X-Axis dropdown Expanded after click on it");
						selectDropdownValue(driver,X_Axis_dataType_AreaWidget,Select_X_Axis_Value_AreaWidget);
						if(X_Axis_dataType_AreaWidget.equals("Date")) {
							 if(isDisplayed(driver,groupDropdown)) {
								  pass(driver,"Group selection input option is displayed While select Date datatype in X_axis");
								  click(driver,groupDropdown);
								  if(verifyElementDisplayed(driver, GroupDropdownExpand)){
									  selectGroupDateValue(driver,SelectGroupValue_Date_Area);
								  }
									
							 }else {
								 fail(driver,"Group selection input option is not displayed While select Date datatype in X_axis");
							 }
						 }
					}else {
						fail(driver,"X-Axis dropdown not Expanded after click on it");
					}
				}
				
				if(verifyElementDisplayed(driver, Y_Axis_Input_Group)) {
					click(driver,Y_Axis_Input_Group);
					if(isDisplayed(driver,Y_Axis_DropdownExpand)) {
						pass(driver,"Y-Axis dropdown Expanded after click on it");
						selectDropdownValue(driver,Y_Axis_dataType_AreaWidget,Select_Y_Axis_Value_AreaWidget);
						click(driver,Y_Axis_Text_Group);
						if(Y_Axis_dataType_AreaWidget.equalsIgnoreCase("Numerical")) {
							waitForElement(driver, GroupInput_Numeric);
							click(driver,GroupInput_Numeric);
							if(isDisplayed(driver, GroupDropdown_Numeric_Expand)) {
								pass(driver,"Group dropdown is expanded after click on it");
								selectDropdownValue1(driver,SelectGroupValue_YAxis_Area);
								wait(driver,"1");
							}
						}
					}else {
						fail(driver,"Y-Axis dropdown not Expanded after click on it");
					}
				}
				
				scrollUsingElement(driver,ApplyButton);
				click(driver,ApplyButton);
				elementnotvisible1(driver, RPE_Loading);
				if(isDisplayed2(driver,error)){
	    			 String errorWidget=getText1(driver,error);
		    		 if(errorWidget.contains("Please refer the logs in Logs")) {
		    			 fail(driver,"Error displayed When click Apply Button on 'Area' Widget, Validation : "+errorWidget);
		    		 }else {
		    			 pass(driver,"Error displayed When click Apply Button on 'Area' Widget, Validation : "+errorWidget);
		    		 }
		    		 elementnotvisible1(driver, error);
	    		 }else if(isDisplayed(driver,ChartGraph)) {
					pass(driver,"Chart is Displayed in the Area Widget");
				 }
				
			}else {
				 String errorWidget=getText1(driver,error);
	    		 if(errorWidget.contains("Please refer the logs in Logs")) {
	    			 fail(driver,"Error displayed When click on 'Area' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }else {
	    			 pass(driver,"Error displayed When click on 'Area' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }
				elementnotvisible1(driver, error);
			}
			
		}else {
			fail(driver,"Area Widget is not displayed");
		}
		
		if(isDisplayed(driver,Gantt_widget)) {
			WidgetValidation(driver,Gantt_widget,"Gantt");
			click(driver,Gantt_widget);
			if(!isDisplayed2(driver,error)) {
				waitForElement(driver,Axes);
				if(verifyElementDisplayed(driver, Y_Axis_dropdown)) {
					click(driver,Y_Axis_dropdown);
					if(isDisplayed(driver,Y_Axis_dropdownResults)) {
						pass(driver,"Y-Axis dropdown Expanded after click on it");
						selectDropdownValue(driver,Y_Axis_dataType_GanttWidget,Select_Y_Axis_Value_GanttWidget);
					}else {
						fail(driver,"Y-Axis dropdown not Expanded after click on it");
					}
				}
				
				if(verifyElementDisplayed(driver, X_Axis_dropdown)) {
					click(driver,X_Axis_dropdown);
					if(isDisplayed(driver,X_Axis_dropdownResults)) {
						pass(driver,"X-Axis dropdown Expanded after click on it");
						selectDropdownValue(driver,X_Axis_dataType_GanttWidget,Select_X_Axis_Value_GanttWidget);
					}else {
						fail(driver,"X-Axis dropdown not Expanded after click on it");
					}
				}
				
				if(verifyElementDisplayed(driver, Start_Date_Input)) {
					click(driver,Start_Date_Input);
					if(isDisplayed(driver,Start_Date_DropdownExpand)) {
						pass(driver,"Start Date dropdown Expanded after click on it");
						selectDropdownValue1(driver,StartDate_Value_GanttWidget);
					}else {
						fail(driver,"Start Date dropdown not Expanded after click on it");
					}
				}
				
				if(verifyElementDisplayed(driver, Duration_Input)) {
					click(driver,Duration_Input);
					if(isDisplayed(driver,Duration_DropdownExpand)) {
						pass(driver,"Duration dropdown Expanded after click on it");
						selectDropdownValue1(driver,Duration_Value_GanttWidget);
					}else {
						fail(driver,"Duration dropdown not Expanded after click on it");
					}
				}
				
				scrollUsingElement(driver,ApplyButton);
				click(driver,ApplyButton);
				elementnotvisible1(driver, RPE_Loading);
				if(isDisplayed2(driver,error)){
	    			 String errorWidget=getText1(driver,error);
		    		 if(errorWidget.contains("Please refer the logs in Logs")) {
		    			 fail(driver,"Error displayed When click Apply Button on 'Gantt' Widget, Validation : "+errorWidget);
		    		 }else {
		    			 pass(driver,"Error displayed When click Apply Button on 'Gantt' Widget, Validation : "+errorWidget);
		    		 }
		    		 elementnotvisible1(driver, error);
	    		 }else if(isDisplayed(driver,ChartGraph)) {
					pass(driver,"Chart is Displayed in the Gantt Widget");
				 }
				
			}else {
				 String errorWidget=getText1(driver,error);
	    		 if(errorWidget.contains("Please refer the logs in Logs")) {
	    			 fail(driver,"Error displayed When click on 'Gantt' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }else {
	    			 pass(driver,"Error displayed When click on 'Gantt' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }
				 elementnotvisible1(driver, error);
			}
			
		}else {
			fail(driver,"Gantt Widget is not displayed");
		}
		
		if(isDisplayed(driver,Scatter_widget)) {
			WidgetValidation(driver,Scatter_widget,"Scatter");
			click(driver,Scatter_widget);
			if(!isDisplayed2(driver,error)) {
				waitForElement(driver,Axes);
				if(verifyElementDisplayed(driver, X_Axis_Input)) {
					click(driver,X_Axis_Input);
					if(isDisplayed(driver,X_Axis_dropdownResultsExp)) {
						pass(driver,"X-Axis dropdown Expanded after click on it");
						selectDropdownValue(driver,X_Axis_dataType_ScatterWidget,Select_X_Axis_Value_ScatterWidget);
					}else {
						fail(driver,"X-Axis dropdown not Expanded after click on it");
					}
				}
				
				if(verifyElementDisplayed(driver, Y_Axis_Input)) {
					click(driver,Y_Axis_Input);
					if(isDisplayed(driver,Y_Axis_dropdownResultsExp)) {
						pass(driver,"Y-Axis dropdown Expanded after click on it");
						selectDropdownValue(driver,Y_Axis_dataType_ScatterWidget,Select_Y_Axis_Value_ScatterWidget);
					}else {
						fail(driver,"Y-Axis dropdown not Expanded after click on it");
					}
				}
				
				scrollUsingElement(driver,ApplyButton);
				click(driver,ApplyButton);
				elementnotvisible1(driver, RPE_Loading);
				if(isDisplayed2(driver,error)){
	    			 String errorWidget=getText1(driver,error);
		    		 if(errorWidget.contains("Please refer the logs in Logs")) {
		    			 fail(driver,"Error displayed When click Apply Button on 'Scatter' Widget, Validation : "+errorWidget);
		    		 }else {
		    			 pass(driver,"Error displayed When click Apply Button on 'Scatter' Widget, Validation : "+errorWidget);
		    		 }
		    		 elementnotvisible1(driver, error);
	    		 }else if(isDisplayed(driver,ChartGraph)) {
					pass(driver,"Chart is Displayed in the Scatter Widget");
				 }
			}else {
				 String errorWidget=getText1(driver,error);
	    		 if(errorWidget.contains("Please refer the logs in Logs")) {
	    			 fail(driver,"Error displayed When click on 'Scatter' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }else {
	    			 pass(driver,"Error displayed When click on 'Scatter' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }
				elementnotvisible1(driver, error);
			}
			
		}else {
			fail(driver,"Scatter Widget is not displayed");
		}
		
		if(isDisplayed(driver,Dumbel_plot_widget)) {
			WidgetValidation(driver,Dumbel_plot_widget,"Dumbbell Plot");
			click(driver,Dumbel_plot_widget);
			if(!isDisplayed2(driver,error)) {
				waitForElement(driver,Axes);
				if(verifyElementDisplayed(driver, Category_Input)) {
					click(driver,Category_Input);
					if(isDisplayed(driver,Category_dropdownExpand)) {
						pass(driver,"Category dropdown Expanded after click on it");
						selectDropdownValue(driver,Category_dataType_DumbbellWidget,Select_Category_Value_DumbbellWidget);
					}else {
						fail(driver,"Category dropdown not Expanded after click on it");
					}
				}
				
				if(verifyElementDisplayed(driver, Value1_Input)) {
					click(driver,Value1_Input);
					if(isDisplayed(driver,Value1_DropdownExpand)) {
						pass(driver,"Value1 dropdown Expanded after click on it");
						selectDropdownValue(driver,Value1_dataType_DumbbellWidget,Select_Value1_DumbbellWidget);
					}else {
						fail(driver,"Value1 dropdown not Expanded after click on it");
					}
				}
				
				if(verifyElementDisplayed(driver, Value2_Input)) {
					click(driver,Value2_Input);
					if(isDisplayed(driver,Value2_DropdownExpand)) {
						pass(driver,"Value2 dropdown Expanded after click on it");
						selectDropdownValue(driver,Value2_dataType_DumbbellWidget,Select_Value2_DumbbellWidget);
					}else {
						fail(driver,"Value2 dropdown not Expanded after click on it");
					}
				}
				
				scrollUsingElement(driver,ApplyButton);
				click(driver,ApplyButton);
				elementnotvisible1(driver, RPE_Loading);
				if(isDisplayed2(driver,error)){
	    			 String errorWidget=getText1(driver,error);
		    		 if(errorWidget.contains("Please refer the logs in Logs")) {
		    			 fail(driver,"Error displayed When click Apply Button on 'Dumbell Plot' Widget, Validation : "+errorWidget);
		    		 }else {
		    			 pass(driver,"Error displayed When click Apply Button on 'Dumbell Plot' Widget, Validation : "+errorWidget);
		    		 }
		    		 elementnotvisible1(driver, error);
	    		 }else if(isDisplayed(driver,ChartGraph)) {
					pass(driver,"Chart is Displayed in the Dumbell Plot Widget");
				 }
				
			}else {
				 String errorWidget=getText1(driver,error);
	    		 if(errorWidget.contains("Please refer the logs in Logs")) {
	    			 fail(driver,"Error displayed When click on 'Dumbell Plot' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }else {
	    			 pass(driver,"Error displayed When click on 'Dumbbell Plot' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }
				elementnotvisible1(driver, error);
			}
			
		}else {
			fail(driver,"Dumbbell Plot Widget is not displayed");
		}
		
		if(isDisplayed(driver,Tree_map_widget)) {
			WidgetValidation(driver,Tree_map_widget,"Tree Map");
			click(driver,Tree_map_widget);
			if(!isDisplayed2(driver,error)) {
				waitForElement(driver,Axes);
				if(verifyElementDisplayed(driver, Categories_Input)) {
					click(driver,Categories_Input);
					if(isDisplayed(driver,Categories_DropdownExpand)) {
						pass(driver,"Categories dropdown Expanded after click on it");
						selectDropdownValue(driver,Categories_dataType_TreeMapWidget,Select_Categories_Value_TreeMapWidget);
						wait(driver,"1");
						click(driver,CategoriesText);
					}else {
						fail(driver,"Categories dropdown not Expanded after click on it");
					}
				}
				
				if(verifyElementDisplayed(driver, Series_Input)) {
					click(driver,Series_Input);
					if(isDisplayed(driver,Series_DropdownExpand)) {
						pass(driver,"Series dropdown Expanded after click on it");
						selectDropdownValue(driver,Series_dataType_TreeMapWidget,Select_Series_Value_TreeMapWidget);
					}else {
						fail(driver,"Series dropdown not Expanded after click on it");
					}
				}
				
				scrollUsingElement(driver,ApplyButton);
				click(driver,ApplyButton);
				elementnotvisible1(driver, RPE_Loading);
				if(isDisplayed2(driver,error)){
	    			 String errorWidget=getText1(driver,error);
		    		 if(errorWidget.contains("Please refer the logs in Logs")) {
		    			 fail(driver,"Error displayed When click Apply Button on 'Tree Map' Widget, Validation : "+errorWidget);
		    		 }else {
		    			 pass(driver,"Error displayed When click Apply Button on 'Tree Map' Widget, Validation : "+errorWidget);
		    		 }
		    		 elementnotvisible1(driver, error);
	    		 }else if(isDisplayed(driver,ChartGraph)) {
					pass(driver,"Chart is Displayed in the Tree Map Widget");
				 }
				
			}else {
				 String errorWidget=getText1(driver,error);
	    		 if(errorWidget.contains("Please refer the logs in Logs")) {
	    			 fail(driver,"Error displayed When click on 'Tree Map' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }else {
	    			 pass(driver,"Error displayed When click on 'Tree Map' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }
				elementnotvisible1(driver, error);
			}
			
		}else {
			fail(driver,"Tree Map Widget is not displayed");
		}
		
		if(isDisplayed(driver,HeatMap_Legend_widget)) {
			WidgetValidation(driver,HeatMap_Legend_widget,"Heat Map Legend");
			click(driver,HeatMap_Legend_widget);
			if(!isDisplayed2(driver,error)) {
				waitForElement(driver,Axes);
				if(verifyElementDisplayed(driver, X_Axis_Input)) {
					click(driver,X_Axis_Input);
					if(isDisplayed(driver,X_Axis_dropdownResultsExp)) {
						pass(driver,"X-Axis dropdown Expanded after click on it");
						selectDropdownValue(driver,X_Axis_dataType_HeatMapWidget,Select_X_Axis_Value_HeatMapWidget);
					}else {
						fail(driver,"X-Axis dropdown not Expanded after click on it");
					}
				}
				
				if(verifyElementDisplayed(driver, Y_Axis_Input)) {
					click(driver,Y_Axis_Input);
					if(isDisplayed(driver,Y_Axis_dropdownResultsExp)) {
						pass(driver,"Y-Axis dropdown Expanded after click on it");
						selectDropdownValue(driver,Y_Axis_dataType_HeatMapWidget,Select_Y_Axis_Value_HeatMapWidget);
					}else {
						fail(driver,"Y-Axis dropdown not Expanded after click on it");
					}
				}
				
				if(verifyElementDisplayed(driver, Series_Input)) {
					click(driver,Series_Input);
					if(isDisplayed(driver,Series_DropdownExpand)) {
						pass(driver,"Series dropdown Expanded after click on it");
						selectDropdownValue(driver,Series_dataType_HeatMapWidget,Select_Series_Value_HeatMapWidget);
					}else {
						fail(driver,"Series dropdown not Expanded after click on it");
					}
				}
				
				scrollUsingElement(driver,ApplyButton);
				click(driver,ApplyButton);
				elementnotvisible1(driver, RPE_Loading);
				if(isDisplayed2(driver,error)){
	    			 String errorWidget=getText1(driver,error);
		    		 if(errorWidget.contains("Please refer the logs in Logs")) {
		    			 fail(driver,"Error displayed When click Apply Button on 'Heat Map' Widget, Validation : "+errorWidget);
		    		 }else {
		    			 pass(driver,"Error displayed When click Apply Button on 'Heat Map' Widget, Validation : "+errorWidget);
		    		 }
		    		 elementnotvisible1(driver, error);
	    		 }else if(isDisplayed(driver,ChartGraph)) {
					pass(driver,"Chart is Displayed in the Heat Map Widget");
				 }
				
			}else {
				 String errorWidget=getText1(driver,error);
	    		 if(errorWidget.contains("Please refer the logs in Logs")) {
	    			 fail(driver,"Error displayed When click on 'Heat Map' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }else {
	    			 pass(driver,"Error displayed When click on 'Heat Map' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }
				elementnotvisible1(driver, error);
			}
			
		}else {
			fail(driver,"Heat Map Widget is not displayed");
		}
		
		if(isDisplayed(driver,GroupandSorted_widget)) {
			WidgetValidation(driver,GroupandSorted_widget,"Grouped and Sorted");
			click(driver,GroupandSorted_widget);
			if(!isDisplayed2(driver,error)) {
				waitForElement(driver,Axes);
				if(verifyElementDisplayed(driver, Categories_Input)) {
					click(driver,Categories_Input);
					if(isDisplayed(driver,Categories_DropdownExpand)) {
						pass(driver,"Categories dropdown Expanded after click on it");
						selectDropdownValue(driver,Categories_dataType_GrouptAndSortWidget,Select_Categories_Value_GroupAndSortWidget);
						wait(driver,"1");
						click(driver,CategoriesText);
					}else {
						fail(driver,"Categories dropdown not Expanded after click on it");
					}
				}
				
				if(verifyElementDisplayed(driver, Series_Input)) {
					click(driver,Series_Input);
					if(isDisplayed(driver,Series_DropdownExpand)) {
						pass(driver,"Series dropdown Expanded after click on it");
						selectDropdownValue(driver,Series_dataType_GroupAndSortWidget,Select_Series_Value_GroupAndSortWidget);
					}else {
						fail(driver,"Series dropdown not Expanded after click on it");
					}
				}
				
				scrollUsingElement(driver,ApplyButton);
				click(driver,ApplyButton);
				elementnotvisible1(driver, RPE_Loading);
				if(isDisplayed2(driver,error)){
	    			 String errorWidget=getText1(driver,error);
		    		 if(errorWidget.contains("Please refer the logs in Logs")) {
		    			 fail(driver,"Error displayed When click Apply Button on 'Group And Sorted' Widget, Validation : "+errorWidget);
		    		 }else {
		    			 pass(driver,"Error displayed When click Apply Button on 'Group And Sorted' Widget, Validation : "+errorWidget);
		    		 }
		    		 elementnotvisible1(driver, error);
	    		 }else if(isDisplayed(driver,ChartGraph)) {
					pass(driver,"Chart is Displayed in the Group And Sorted Widget");
				 }
				
			}else {
				 String errorWidget=getText1(driver,error);
	    		 if(errorWidget.contains("Please refer the logs in Logs")) {
	    			 fail(driver,"Error displayed When click on 'Group And Sorted' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }else {
	    			 pass(driver,"Error displayed When click on 'Group And Sorted' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }
				elementnotvisible1(driver, error);
			}
			
		}else {
			fail(driver,"Grouped And Sorted Widget is not displayed");
		}
		
		if(isDisplayed(driver,Multiple_Axis_widget)) {
			WidgetValidation(driver,Multiple_Axis_widget,"Multiple Axis");
			click(driver,Multiple_Axis_widget);
			if(!isDisplayed2(driver,error)) {
				waitForElement(driver,Axes);
				if(verifyElementDisplayed(driver, Category_Input)) {
					click(driver,Category_Input);
					if(isDisplayed(driver,Category_dropdownExpand)) {
						pass(driver,"Category dropdown Expanded after click on it");
						selectDropdownValue(driver,Category_dataType_MultipleAxisWidget,Select_Category_Value_MultipleAxisWidget);
						
						if(Category_dataType_MultipleAxisWidget.equals("Date")) {
							 if(isDisplayed(driver,groupDropdown)) {
								  pass(driver,"Group selection input option is displayed While select Date datatype in Category");
								  click(driver,groupDropdown);
								  if(verifyElementDisplayed(driver, GroupDropdownExpand)){
									  selectGroupDateValue(driver,SelectGroupValue_Date_MultipleAxis);
								  }
									
							 }else {
								 fail(driver,"Group selection input option is not displayed While select Date datatype in Category");
							 }
						 }
						
					}else {
						fail(driver,"Category dropdown not Expanded after click on it");
					}
				}
				
				if(verifyElementDisplayed(driver, Y_Axis_Input_Group)) {
					click(driver,Y_Axis_Input_Group);
					if(isDisplayed(driver,Y_Axis_DropdownExpand)) {
						pass(driver,"Y-Axis dropdown Expanded after click on it");
						selectDropdownValue(driver,Y_Axis_dataType_MultipleAxisWidget,Select_Y_Axis_MultipleAxisWidget);
						click(driver,Y_Axis_Text_Group);
					}else {
						fail(driver,"Y-Axis dropdown not Expanded after click on it");
					}
				}
				
				scrollUsingElement(driver,ApplyButton);
				click(driver,ApplyButton);
				elementnotvisible1(driver, RPE_Loading);
				if(isDisplayed2(driver,error)){
	    			 String errorWidget=getText1(driver,error);
		    		 if(errorWidget.contains("Please refer the logs in Logs")) {
		    			 fail(driver,"Error displayed When click Apply Button on 'Multiple Axis' Widget, Validation : "+errorWidget);
		    		 }else {
		    			 pass(driver,"Error displayed When click Apply Button on 'Multiple Axis' Widget, Validation : "+errorWidget);
		    		 }
		    		 elementnotvisible1(driver, error);
	    		 }else if(isDisplayed(driver,ChartGraph)) {
					pass(driver,"Chart is Displayed in the Multiple Axis Widget");
				 }
				
			}else {
				 String errorWidget=getText1(driver,error);
	    		 if(errorWidget.contains("Please refer the logs in Logs")) {
	    			 fail(driver,"Error displayed When click on 'Multiple Axis' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }else {
	    			 pass(driver,"Error displayed When click on 'Multiple Axis' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }
				elementnotvisible1(driver, error);
			}
			
		}else {
			fail(driver,"Multiple Axis Widget is not displayed");
		}
		
		if(isDisplayed(driver,Radar_Line_widget)) {
			WidgetValidation(driver,Radar_Line_widget,"Radar Line");
			click(driver,Radar_Line_widget);
			if(!isDisplayed2(driver,error)) {
				waitForElement(driver,Axes);
				if(verifyElementDisplayed(driver, Category_Input)) {
					click(driver,Category_Input);
					if(isDisplayed(driver,Category_dropdownExpand)) {
						pass(driver,"Category dropdown Expanded after click on it");
						selectDropdownValue(driver,Category_dataType_RadarLineWidget,Select_Category_Value_RadarLineAxisWidget);
						
						if(Category_dataType_RadarLineWidget.equals("Date")) {
							 if(isDisplayed(driver,groupDropdown)) {
								  pass(driver,"Group selection input option is displayed While select Date datatype in Category");
								  click(driver,groupDropdown);
								  if(verifyElementDisplayed(driver, GroupDropdownExpand)){
									  selectGroupDateValue(driver,SelectGroupValue_Date_RadarLine);
								  }
									
							 }else {
								 fail(driver,"Group selection input option is not displayed While select Date datatype in Category");
							 }
						 }
						
					}else {
						fail(driver,"Category dropdown not Expanded after click on it");
					}
				}
				
				if(verifyElementDisplayed(driver, Y_Axis_Input_Group)) {
					click(driver,Y_Axis_Input_Group);
					if(isDisplayed(driver,Y_Axis_DropdownExpand)) {
						pass(driver,"Y-Axis dropdown Expanded after click on it");
						selectDropdownValue(driver,Y_Axis_dataType_RadarLineWidget,Select_Y_Axis_RadarLineWidget);
						click(driver,Y_Axis_Text_Group);
					}else {
						fail(driver,"Y-Axis dropdown not Expanded after click on it");
					}
				}
				
				scrollUsingElement(driver,ApplyButton);
				click(driver,ApplyButton);
				elementnotvisible1(driver, RPE_Loading);
				if(isDisplayed2(driver,error)){
	    			 String errorWidget=getText1(driver,error);
		    		 if(errorWidget.contains("Please refer the logs in Logs")) {
		    			 fail(driver,"Error displayed When click Apply Button on 'Radar Line' Widget, Validation : "+errorWidget);
		    		 }else {
		    			 pass(driver,"Error displayed When click Apply Button on 'Radar Line' Widget, Validation : "+errorWidget);
		    		 }
		    		 elementnotvisible1(driver, error);
	    		 }else if(isDisplayed(driver,ChartGraph)) {
					pass(driver,"Chart is Displayed in the Radar Line Widget");
				 }
			}else {
				 String errorWidget=getText1(driver,error);
	    		 if(errorWidget.contains("Please refer the logs in Logs")) {
	    			 fail(driver,"Error displayed When click on 'Radar Line' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }else {
	    			 pass(driver,"Error displayed When click on 'Radar Line' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }
				elementnotvisible1(driver, error);
			}
			
		}else {
			fail(driver,"Radar Line Widget is not displayed");
		}
		
		if(isDisplayed(driver,Zoomable_Bubble_widget)) {
			WidgetValidation(driver,Zoomable_Bubble_widget,"Zoomable Bubble");
			click(driver,Zoomable_Bubble_widget);
			if(!isDisplayed2(driver,error)) {
				waitForElement(driver,Axes);
				if(verifyElementDisplayed(driver, X_Axis_Input)) {
					click(driver,X_Axis_Input);
					if(isDisplayed(driver,X_Axis_dropdownResultsExp)) {
						pass(driver,"X Axis dropdown Expanded after click on it");
						selectDropdownValue(driver,X_Axis_dataType_ZoomableWidget,Select_X_Axis_Value_ZoomableWidget);
					}else {
						fail(driver,"X Axis dropdown not Expanded after click on it");
					}
				}
				
				if(verifyElementDisplayed(driver, Y_Axis_Input)) {
					click(driver,Y_Axis_Input);
					if(isDisplayed(driver,Y_Axis_dropdownResultsExp)) {
						pass(driver,"Y Axis dropdown Expanded after click on it");
						selectDropdownValue(driver,Y_Axis_dataType_ZoomableWidget,Select_Y_Axis_Value_ZoomableWidget);
					}else {
						fail(driver,"Y Axis dropdown not Expanded after click on it");
					}
				}
				
				if(verifyElementDisplayed(driver, Color_Input)) {
					click(driver,Color_Input);
					if(isDisplayed(driver,Color_DropdownExpand)) {
						pass(driver,"Color dropdown Expanded after click on it");
						selectDropdownValue(driver,Color_dataType_ZoomableWidget,Select_Color_Value_ZoomableWidget);
					}else {
						fail(driver,"Color dropdown not Expanded after click on it");
					}
				}
				
				if(verifyElementDisplayed(driver, Series_Input)) {
					click(driver,Series_Input);
					if(isDisplayed(driver,Series_DropdownExpand)) {
						pass(driver,"Series dropdown Expanded after click on it");
						selectDropdownValue(driver,Series_dataType_ZoomableWidget,Select_Series_Value_ZoomableWidget);
					}else {
						fail(driver,"Series dropdown not Expanded after click on it");
					}
				}
				
				scrollUsingElement(driver,ApplyButton);
				click(driver,ApplyButton);
				elementnotvisible1(driver, RPE_Loading);
				if(isDisplayed2(driver,error)){
	    			 String errorWidget=getText1(driver,error);
		    		 if(errorWidget.contains("Please refer the logs in Logs")) {
		    			 fail(driver,"Error displayed When click Apply Button on 'Zommable Bubble' Widget, Validation : "+errorWidget);
		    		 }else {
		    			 pass(driver,"Error displayed When click Apply Button on 'Zommable Bubble' Widget, Validation : "+errorWidget);
		    		 }
		    		 elementnotvisible1(driver, error);
	    		 }else if(isDisplayed(driver,ChartGraph)) {
					pass(driver,"Chart is Displayed in the Zommable Bubble Widget");
				 }
				
			}else {
				 String errorWidget=getText1(driver,error);
	    		 if(errorWidget.contains("Please refer the logs in Logs")) {
	    			 fail(driver,"Error displayed When click on 'Zommable Bubble' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }else {
	    			 pass(driver,"Error displayed When click on 'Zommable Bubble' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }
				elementnotvisible1(driver, error);
			}
			
		}else {
			fail(driver,"Zoomable Bubble Widget is not displayed");
		}
		
		if(isDisplayed(driver,Time_line_widget)) {
			WidgetValidation(driver,Time_line_widget,"Time line");
			click(driver,Time_line_widget);
			if(!isDisplayed2(driver,error)) {
				waitForElement(driver,Axes);
				if(verifyElementDisplayed(driver, Date_Input)) {
					click(driver,Date_Input);
					if(isDisplayed(driver,Date_DropdownExpand)) {
						pass(driver,"Date dropdown Expanded after click on it");
						selectDropdownValue1(driver,Select_Date_Value_TimeLineWidget);
					}else {
						fail(driver,"Date dropdown not Expanded after click on it");
					}
				}
				
				if(verifyElementDisplayed(driver, GroupDate_Input)) {
					click(driver,GroupDate_Input);
					if(isDisplayed(driver,GroupDate_dropdownExpand)) {
						pass(driver,"Group dropdown Expanded after click on it");
						selectDropdownValue1(driver,Select_Group_Value_TimeLineWidget);
					}else {
						fail(driver,"Group dropdown not Expanded after click on it");
					}
				}
				
				if(verifyElementDisplayed(driver, Series_Input)) {
					click(driver,Series_Input);
					if(isDisplayed(driver,Series_DropdownExpand)) {
						pass(driver,"Series dropdown Expanded after click on it");
						selectDropdownValue(driver,Series_dataType_TimeLineWidget,Select_Series_Value_TimeLineWidget);
					}else {
						fail(driver,"Series dropdown not Expanded after click on it");
					}
				}
				
				scrollUsingElement(driver,ApplyButton);
				click(driver,ApplyButton);
				elementnotvisible1(driver, RPE_Loading);
				if(isDisplayed2(driver,error)){
	    			 String errorWidget=getText1(driver,error);
		    		 if(errorWidget.contains("Please refer the logs in Logs")) {
		    			 fail(driver,"Error displayed When click Apply Button on 'Time Line' Widget, Validation : "+errorWidget);
		    		 }else {
		    			 pass(driver,"Error displayed When click Apply Button on 'Time Line' Widget, Validation : "+errorWidget);
		    		 }
		    		 elementnotvisible1(driver, error);
	    		 }else if(isDisplayed(driver,ChartGraph)) {
					pass(driver,"Chart is Displayed in the Time Line Widget");
				 }
				
			}else {
				String errorWidget=getText1(driver,error);
	    		 if(errorWidget.contains("Please refer the logs in Logs")) {
	    			 fail(driver,"Error displayed When click on 'Time Line' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }else {
	    			 pass(driver,"Error displayed When click on 'Time Line' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }
				elementnotvisible1(driver, error);
				
			}
			
		}else {
			fail(driver,"Time Line Widget is not displayed");
		}
		
		if(isDisplayed(driver,Population_Pyramid_widget)) {
			WidgetValidation(driver,Population_Pyramid_widget,"Population Pyramid");
			click(driver,Population_Pyramid_widget);
			if(!isDisplayed2(driver,error)) {
				waitForElement(driver,Axes);
				if(verifyElementDisplayed(driver, Y_Axis_dropdown)) {
					click(driver,Y_Axis_dropdown);
					if(isDisplayed(driver,Y_Axis_dropdownResults)) {
						pass(driver,"Y Axis dropdown Expanded after click on it");
						selectDropdownValue(driver,Y_Axis_dataType_PopulationWidget,Select_Y_Axis_Value_PopulationWidget);
					}else {
						fail(driver,"Y Axis dropdown not Expanded after click on it");
					}
				}
				
				if(verifyElementDisplayed(driver, X_Axis_dropdown)) {
					click(driver,X_Axis_dropdown);
					if(isDisplayed(driver,X_Axis_dropdownResults)) {
						pass(driver,"X Axis dropdown Expanded after click on it");
						selectDropdownValue(driver,X_Axis_dataType_PopulationWidget,Select_X_Axis_Value_PopulationWidget);
						
					}else {
						fail(driver,"X Axis dropdown not Expanded after click on it");
					}
				}
				
				if(verifyElementDisplayed(driver, Series_Input)) {
					click(driver,Series_Input);
					if(isDisplayed(driver,Series_DropdownExpand)) {
						pass(driver,"Series dropdown Expanded after click on it");
						selectDropdownValue(driver,Series_dataType_PopulationWidget,Select_Series_Value_PopulationWidget);
					}else {
						fail(driver,"Series dropdown not Expanded after click on it");
					}
				}
				
				scrollUsingElement(driver,ApplyButton);
				click(driver,ApplyButton);
				elementnotvisible1(driver, RPE_Loading);
				if(isDisplayed2(driver,error)){
	    			 String errorWidget=getText1(driver,error);
		    		 if(errorWidget.contains("Please refer the logs in Logs")) {
		    			 fail(driver,"Error displayed When click Apply Button on 'Population Pyramid' Widget, Validation : "+errorWidget);
		    		 }else {
		    			 pass(driver,"Error displayed When click Apply Button on 'Population Pyramid' Widget, Validation : "+errorWidget);
		    		 }
		    		 elementnotvisible1(driver, error);
	    		 }else if(isDisplayed(driver,ChartGraph)) {
					pass(driver,"Chart is Displayed in the Population Pyramid Widget");
				 }
				
			}else {
				String errorWidget=getText1(driver,error);
	    		 if(errorWidget.contains("Please refer the logs in Logs")) {
	    			 fail(driver,"Error displayed When click on 'Population Pyramid' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }else {
	    			 pass(driver,"Error displayed When click on 'Population Pyramid' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }
				elementnotvisible1(driver, error);
				
			}
			
		}else {
			fail(driver,"Population Pyramid Widget is not displayed");
		}
		
		if(isDisplayed(driver,Box_Plot_widget)) {
			WidgetValidation(driver,Box_Plot_widget,"Box Plot");
			click(driver,Box_Plot_widget);
			if(!isDisplayed2(driver,error)) {
				waitForElement(driver,Axes);
				if(verifyElementDisplayed(driver, X_Axis_Input)) {
					click(driver,X_Axis_Input);
					if(isDisplayed(driver,X_Axis_dropdownResultsExp)) {
						pass(driver,"X Axis dropdown Expanded after click on it");
						selectDropdownValue(driver,X_Axis_dataType_BoxPlotWidget,Select_X_Axis_Value_BoxPlotWidget);
						
						if(X_Axis_dataType_BoxPlotWidget.equals("Date")) {
							 if(isDisplayed(driver,groupDropdown)) {
								  pass(driver,"Group selection input option is displayed While select Date datatype in X Axis");
								  click(driver,groupDropdown);
								  if(verifyElementDisplayed(driver, GroupDropdownExpand)){
									  selectGroupDateValue(driver,SelectGroupValue_Date_BoxPlot);
								  }
									
							 }else {
								 fail(driver,"Group selection input option is not displayed While select Date datatype in X Axis");
							 }
						 }
						
					}else {
						fail(driver,"X Axis dropdown not Expanded after click on it");
					}
				}
				
				if(verifyElementDisplayed(driver, Y_Axis_Input)) {
					click(driver,Y_Axis_Input);
					if(isDisplayed(driver,Y_Axis_dropdownResultsExp)) {
						pass(driver,"Y Axis dropdown Expanded after click on it");
						selectDropdownValue(driver,Y_Axis_dataType_BoxPlotWidget,Select_Y_Axis_Value_BoxPlotWidget);
					}else {
						fail(driver,"Y Axis dropdown not Expanded after click on it");
					}
				}
				
				if(verifyElementDisplayed(driver, Sort_Input)) {
					selectByText(driver, Sort_Input, Select_Sort_Value_BoxPlot);
				}
				
				scrollUsingElement(driver,ApplyButton);
				click(driver,ApplyButton);
				elementnotvisible1(driver, RPE_Loading);
				if(isDisplayed2(driver,error)){
	    			 String errorWidget=getText1(driver,error);
		    		 if(errorWidget.contains("Please refer the logs in Logs")) {
		    			 fail(driver,"Error displayed When click Apply Button on 'Box Plot' Widget, Validation : "+errorWidget);
		    		 }else {
		    			 pass(driver,"Error displayed When click Apply Button on 'Box Plot' Widget, Validation : "+errorWidget);
		    		 }
		    		 elementnotvisible1(driver, error);
	    		 }else if(isDisplayed(driver,ChartGraph)) {
					pass(driver,"Chart is Displayed in the Box Plot Widget");
				 }
				
			}else {
				String errorWidget=getText1(driver,error);
	    		 if(errorWidget.contains("Please refer the logs in Logs")) {
	    			 fail(driver,"Error displayed When click on 'Box Plot' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }else {
	    			 pass(driver,"Error displayed When click on 'Box Plot' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }
				elementnotvisible1(driver, error);
			}
			
		}else {
			fail(driver,"Box Plot Widget is not displayed");
		}
		
		if(isDisplayed(driver,Text_widget)) {
			WidgetValidation(driver,Text_widget,"Text");
			click(driver,Text_widget);
			if(!isDisplayed2(driver,error)) {
				waitForElement(driver,TextTypeInput_Chart);
				click(driver,TypeInput_TextChart);
				sendKeys(driver,TypeInput_TextChart,"Testing the 'Text' widget");
				scrollUsingElement(driver,ApplyButton);
				click(driver,ApplyButton);
				if(isDisplayed2(driver,error)){
	    			 String errorWidget=getText1(driver,error);
		    		 if(errorWidget.contains("Please refer the logs in Logs")) {
		    			 fail(driver,"Error displayed When click Apply Button on 'Text' Widget, Validation : "+errorWidget);
		    		 }else {
		    			 pass(driver,"Error displayed When click Apply Button on 'Text' Widget, Validation : "+errorWidget);
		    		 }
		    		 elementnotvisible1(driver, error);
	    		 }
				
				String AfterApply_Text=getText(driver, TypeInput_TextChart);
				if(AfterApply_Text.equals("Testing the 'Text' widget")) {
					pass(driver,"Text widget chart worked propely");
				}else {
					fail(driver,"Text widget chart not worked propely");
				}
			}else {
				String errorWidget=getText1(driver,error);
	    		 if(errorWidget.contains("Please refer the logs in Logs")) {
	    			 fail(driver,"Error displayed When click on 'Text' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }else {
	    			 pass(driver,"Error displayed When click on 'Text' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }
				elementnotvisible1(driver, error);
			}
			
		}else {
			fail(driver,"Text Widget is not displayed");
		}
		
		if(isDisplayed(driver,BarLine_Scatter_widget)) {
			WidgetValidation(driver,BarLine_Scatter_widget,"Bar with Line/Scatter");
			click(driver,BarLine_Scatter_widget);
			if(!isDisplayed2(driver,error)) {
				waitForElement(driver,Axes);
				if(Select_Line_OR_Scatter.contains("Line")) {
					mouseOverAndClick(driver,LineOption);
				}else if(Select_Line_OR_Scatter.contains("Scatter")) {
					mouseOverAndClick(driver,ScatterOption);
				}else {
					fail(driver,"InValid value to select the Option");
				}
				
				if(verifyElementDisplayed(driver, X_Axis_Input)) {
					click(driver,X_Axis_Input);
					if(isDisplayed(driver,X_Axis_dropdownResultsExp)) {
						pass(driver,"X Axis dropdown Expanded after click on it");
						selectDropdownValue(driver,X_Axis_dataType_BarLineWidget,Select_X_Axis_Value_BarLineWidget);
						
						if(X_Axis_dataType_BarLineWidget.equals("Date")) {
							 if(isDisplayed(driver,groupDropdown)) {
								  pass(driver,"Group selection input option is displayed While select Date datatype in X Axis");
								  click(driver,groupDropdown);
								  if(verifyElementDisplayed(driver, GroupDropdownExpand)){
									  selectGroupDateValue(driver,SelectGroupValue_Date_BarLine);
								  }
									
							 }else {
								 fail(driver,"Group selection input option is not displayed While select Date datatype in X Axis");
							 }
						 }
						
					}else {
						fail(driver,"X Axis dropdown not Expanded after click on it");
					}
				}
				
				if(verifyElementDisplayed(driver, Y_Axis_Input)) {
					click(driver,Y_Axis_Input);
					if(isDisplayed(driver,Y_Axis_dropdownResultsExp)) {
						pass(driver,"Y Axis dropdown Expanded after click on it");
						selectDropdownValue(driver,Y_Axis_dataType_BarLineWidget,Select_Y_Axis_Value_BarLineWidget);
					}else {
						fail(driver,"Y Axis dropdown not Expanded after click on it");
					}
				}
				
				if(verifyElementDisplayed(driver, Series_Select_Input)) {
					click(driver,Series_Select_Input);
					if(isDisplayed(driver,Series_Select_DropdownExpand)) {
						pass(driver,"Series dropdown Expanded after click on it");
						selectDropdownValue(driver,Series_dataType_BarLineWidget,Select_Series_Value_BarLineWidget);
						click(driver,X_Axis_text);
					}else {
						fail(driver,"Series dropdown not Expanded after click on it");
					}
				}
				
				scrollUsingElement(driver,ApplyButton);
				click(driver,ApplyButton);
				elementnotvisible1(driver, RPE_Loading);
				if(isDisplayed2(driver,error)){
	    			 String errorWidget=getText1(driver,error);
		    		 if(errorWidget.contains("Please refer the logs in Logs")) {
		    			 fail(driver,"Error displayed When click Apply Button on 'Bar With Line/Scatter' Widget, Validation : "+errorWidget);
		    		 }else {
		    			 pass(driver,"Error displayed When click Apply Button on 'Bar with Line/Scatter' Widget, Validation : "+errorWidget);
		    		 }
		    		 elementnotvisible1(driver, error);
	    		 }else if(isDisplayed(driver,ChartGraph)) {
					pass(driver,"Chart is Displayed in the Bar with Line/Scatter Widget");
				 }
				
			}else {
				 String errorWidget=getText1(driver,error);
	    		 if(errorWidget.contains("Please refer the logs in Logs")) {
	    			 fail(driver,"Error displayed When click on 'Bar With Line/Scatter' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }else {
	    			 pass(driver,"Error displayed When click on 'Bar With Line/Scatter' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }
				elementnotvisible1(driver, error);
			}
			
		}else {
			fail(driver,"Bar with Line/Scatter Widget is not displayed");
		}
		
		if(isDisplayed(driver,Layered_Column_widget)) {
			WidgetValidation(driver,Layered_Column_widget,"Layered Column");
			click(driver,Layered_Column_widget);
			if(!isDisplayed2(driver,error)) {
				waitForElement(driver,Axes);
				if(verifyElementDisplayed(driver, X_Axis_Input)) {
					click(driver,X_Axis_Input);
					if(isDisplayed(driver,X_Axis_dropdownResultsExp)) {
						pass(driver,"X Axis dropdown Expanded after click on it");
						selectDropdownValue(driver,X_Axis_dataType_LayeredWidget,Select_X_Axis_Value_LayeredWidget);
					}else {
						fail(driver,"X Axis dropdown not Expanded after click on it");
					}
				}
				
				if(verifyElementDisplayed(driver, Series_Select_Input)) {
					click(driver,Series_Select_Input);
					if(isDisplayed(driver,Series_Select_DropdownExpand)) {
						pass(driver,"Series dropdown Expanded after click on it");
						selectDropdownValue(driver,Series_dataType_LayeredWidget,Select_Series_Value_LayeredWidget);
						click(driver,Y_Axis_text);
					}else {
						fail(driver,"Series dropdown not Expanded after click on it");
					}
				}

				scrollUsingElement(driver,ApplyButton);
				click(driver,ApplyButton);
				elementnotvisible1(driver, RPE_Loading);
				if(isDisplayed2(driver,error)){
	    			 String errorWidget=getText1(driver,error);
		    		 if(errorWidget.contains("Please refer the logs in Logs")) {
		    			 fail(driver,"Error displayed When click Apply Button on 'Layered Column' Widget, Validation : "+errorWidget);
		    		 }else {
		    			 pass(driver,"Error displayed When click Apply Button on 'Layered Column' Widget, Validation : "+errorWidget);
		    		 }
		    		 elementnotvisible1(driver, error);
	    		 }else if(isDisplayed(driver,ChartGraph)) {
					pass(driver,"Chart is Displayed in the Layered_Column Widget");
				 }
				
			}else {
				 String errorWidget=getText1(driver,error);
	    		 if(errorWidget.contains("Please refer the logs in Logs")) {
	    			 fail(driver,"Error displayed When click on 'Layered Column' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }else {
	    			 pass(driver,"Error displayed When click on 'Layered Column' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }
				elementnotvisible1(driver, error);
			}
			
		}else {
			fail(driver,"Layered Column Widget is not displayed");
		}
		
		if(isDisplayed(driver,Bullet_widget)) {
			WidgetValidation(driver,Bullet_widget,"Bullet");
			click(driver,Bullet_widget);
			if(!isDisplayed2(driver,error)) {
				waitForElement(driver,Axes);
				if(verifyElementDisplayed(driver, Y_Axis_dropdown)) {
					click(driver,Y_Axis_dropdown);
					if(isDisplayed(driver,Y_Axis_dropdownResults)) {
						pass(driver,"Y Axis dropdown Expanded after click on it");
						selectDropdownValue(driver,Y_Axis_dataType_BulletWidget,Select_Y_Axis_Value_BulletWidget);
					}else {
						fail(driver,"Y Axis dropdown not Expanded after click on it");
					}
				}
				
				if(verifyElementDisplayed(driver, Group_Input_Bullet)) {
					click(driver,Group_Input_Bullet);
					if(isDisplayed(driver,Group_DropdownExpand_Bullet)) {
						pass(driver,"Group dropdown Expanded after click on it");
						selectDropdownValue(driver,Group_dataType_BulletWidget,Select_Group_Value_BulletWidget);
					}else {
						fail(driver,"Group dropdown not Expanded after click on it");
					}
				}

				if(verifyElementDisplayed(driver, Target_Input)) {
					click(driver,Target_Input);
					if(isDisplayed(driver,Target_DropdownExpand)) {
						pass(driver,"Target dropdown Expanded after click on it");
						selectDropdownValue(driver,Target_dataType_BulletWidget,Select_Target_Value_BulletWidget);
					}else {
						fail(driver,"Target dropdown not Expanded after click on it");
					}
				}
				
				if(verifyElementDisplayed(driver, Values_Select_Input)) {
					click(driver,Values_Select_Input);
					if(isDisplayed(driver,Values_Select_DropdownExpand)) {
						pass(driver,"Values dropdown Expanded after click on it");
						selectDropdownValue(driver,Value_dataType_BulletWidget,Select_Values_BulletWidget);
						click(driver,Y_Axis_text);
					}else {
						fail(driver,"Values dropdown not Expanded after click on it");
					}
				}
				scrollUsingElement(driver,ApplyButton);
				click(driver,ApplyButton);
				elementnotvisible1(driver, RPE_Loading);
				if(isDisplayed2(driver,error)){
	    			 String errorWidget=getText1(driver,error);
		    		 if(errorWidget.contains("Please refer the logs in Logs")) {
		    			 fail(driver,"Error displayed When click Apply Button on 'Bullet' Widget, Validation : "+errorWidget);
		    		 }else {
		    			 pass(driver,"Error displayed When click Apply Button on 'Bullet' Widget, Validation : "+errorWidget);
		    		 }
		    		 elementnotvisible1(driver, error);
	    		 }else if(isDisplayed(driver,ChartGraph)) {
					pass(driver,"Chart is Displayed in the Bullet Widget");
				 }
				
			}else {
				 String errorWidget=getText1(driver,error);
	    		 if(errorWidget.contains("Please refer the logs in Logs")) {
	    			 fail(driver,"Error displayed When click on 'Bullet' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }else {
	    			 pass(driver,"Error displayed When click on 'Bullet' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }
				elementnotvisible1(driver, error);
			}
			
		}else {
			fail(driver,"Bullet Widget is not displayed");
		}
		
		if(isDisplayed(driver,Circose_widget)) {
			WidgetValidation(driver,Circose_widget,"Circos");
			click(driver,Circose_widget);
			if(!isDisplayed2(driver,error)) {
				waitForElement(driver,Axes);
				
				if(verifyElementDisplayed(driver, Values_input_Circose)) {
					click(driver,Values_input_Circose);
					if(isDisplayed(driver,Values_DropdownExpand_Circose)) {
						pass(driver,"Values dropdown Expanded after click on it");
						selectDropdownValue(driver,ValuesInput1_dataType_CircosWidget,Select_ValuesInput_Value1_CircoseWidget);
						selectDropdownValue(driver,ValuesInput2_dataType_CircosWidget,Select_ValuesInput_Value2_CircoseWidget);
						click(driver,DashProPage);
					}else {
						fail(driver,"Values dropdown not Expanded after click on it");
					}
				}
				scrollUsingElement(driver,ApplyButton);
				click(driver,ApplyButton);
				elementnotvisible1(driver, RPE_Loading);
				if(isDisplayed2(driver,error)){
	    			 String errorWidget=getText1(driver,error);
		    		 if(errorWidget.contains("Please refer the logs in Logs")) {
		    			 fail(driver,"Error displayed When click Apply Button on 'Circose' Widget, Validation : "+errorWidget);
		    		 }else {
		    			 pass(driver,"Error displayed When click Apply Button on 'Circose' Widget, Validation : "+errorWidget);
		    		 }
		    		 elementnotvisible1(driver, error);
	    		 }else if(isDisplayed(driver,ChartGraph)) {
					pass(driver,"Chart is Displayed in the Circose Widget");
				 }
				
			}else {
				 String errorWidget=getText1(driver,error);
	    		 if(errorWidget.contains("Please refer the logs in Logs")) {
	    			 fail(driver,"Error displayed When click on 'Circose' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }else {
	    			 pass(driver,"Error displayed When click on 'Circose' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }
				elementnotvisible1(driver, error);
			}
		}else {
			fail(driver,"Circose Widget is not displayed");
		}
		
		if(isDisplayed(driver,Candle_stick_widget)) {
			WidgetValidation(driver,Candle_stick_widget,"Candle stick");
			click(driver,Candle_stick_widget);
			if(!isDisplayed2(driver,error)) {
				waitForElement(driver,Axes);
				if(verifyElementDisplayed(driver, Date_Input)) {
					click(driver,Date_Input);
					if(isDisplayed(driver,Date_DropdownExpand)) {
						pass(driver,"Date dropdown Expanded after click on it");
						selectDropdownValue(driver,DateInput_dataType_CandleWidget,Select_Date_Value_CandleWidget);
					}else {
						fail(driver,"Date dropdown not Expanded after click on it");
					}
				}
				
				if(verifyElementDisplayed(driver, Open_Input)) {
					click(driver,Open_Input);
					if(isDisplayed(driver,Open_dropdownExpand)) {
						pass(driver,"Open dropdown Expanded after click on it");
						selectDropdownValue(driver,Open_dataType_CandleWidget,Select_Open_Value_CandleWidget);
					}else {
						fail(driver,"Open dropdown not Expanded after click on it");
					}
				}
				
				if(verifyElementDisplayed(driver, High_Input)) {
					click(driver,High_Input);
					if(isDisplayed(driver,High_dropdownExpand)) {
						pass(driver,"High dropdown Expanded after click on it");
						selectDropdownValue(driver,High_dataType_CandleWidget,Select_High_Value_CandleWidget);
					}else {
						fail(driver,"High dropdown not Expanded after click on it");
					}
				}
				
				if(verifyElementDisplayed(driver, Low_Input)) {
					click(driver,Low_Input);
					if(isDisplayed(driver,Low_dropdownExpand)) {
						pass(driver,"Low dropdown Expanded after click on it");
						selectDropdownValue(driver,Low_dataType_CandleWidget,Select_Low_Value_CandleWidget);
					}else {
						fail(driver,"Low dropdown not Expanded after click on it");
					}
				}
				
				if(verifyElementDisplayed(driver, Close_Input)) {
					click(driver,Close_Input);
					if(isDisplayed(driver,Close_DropdownExpand)) {
						pass(driver,"Close dropdown Expanded after click on it");
						selectDropdownValue(driver,Close_dataType_CandleWidget,Select_Close_Value_CandleWidget);
					}else {
						fail(driver,"Close dropdown not Expanded after click on it");
					}
				}
				
				scrollUsingElement(driver,ApplyButton);
				click(driver,ApplyButton);
				elementnotvisible1(driver, RPE_Loading);
				if(isDisplayed2(driver,error)){
	    			 String errorWidget=getText1(driver,error);
		    		 if(errorWidget.contains("Please refer the logs in Logs")) {
		    			 fail(driver,"Error displayed When click Apply Button on 'Candle Stick' Widget, Validation : "+errorWidget);
		    		 }else {
		    			 pass(driver,"Error displayed When click Apply Button on 'Candle Stick' Widget, Validation : "+errorWidget);
		    		 }
		    		 elementnotvisible1(driver, error);
	    		 }else if(isDisplayed(driver,ChartGraph)) {
					pass(driver,"Chart is Displayed in the Candle Stick Widget");
				 }
				
			}else {
				 String errorWidget=getText1(driver,error);
	    		 if(errorWidget.contains("Please refer the logs in Logs")) {
	    			 fail(driver,"Error displayed When click on 'Candle Stick' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }else {
	    			 pass(driver,"Error displayed When click on 'Candle Stick' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }
				elementnotvisible1(driver, error);
				
			}
			
		}else {
			fail(driver,"Candle Stick Widget is not displayed");
		}
		
		if(isDisplayed(driver,MapWith_Bubble_widget)) {
			WidgetValidation(driver,MapWith_Bubble_widget,"Map with Bubble");
			click(driver,MapWith_Bubble_widget);
			if(!isDisplayed2(driver,error)) {
				waitForElement(driver,Axes);
				if(verifyElementDisplayed(driver, Country_Input)) {
					click(driver,Country_Input);
					if(isDisplayed(driver,Country_dropdownResultsExp)) {
						pass(driver,"Country dropdown Expanded after click on it");
						selectDropdownValue(driver,Country_dataType_MapBubbleWidget,Select_Country_Value_MapBubbleWidget);
					}else {
						fail(driver,"Country dropdown not Expanded after click on it");
					}
				}
				
				if(verifyElementDisplayed(driver, Series_MapBubble_Input)) {
					click(driver,Series_MapBubble_Input);
					if(isDisplayed(driver,Series_dropdownResultsExp)) {
						pass(driver,"Series dropdown Expanded after click on it");
						selectDropdownValue(driver,Series_dataType_MapBubbleWidget,Select_Series_Value_MapBubbleWidget);
					}else {
						fail(driver,"Series dropdown not Expanded after click on it");
					}
				}
				
				scrollUsingElement(driver,ApplyButton);
				click(driver,ApplyButton);
				elementnotvisible1(driver, RPE_Loading);
				if(isDisplayed2(driver,error)){
	    			 String errorWidget=getText1(driver,error);
		    		 if(errorWidget.contains("Please refer the logs in Logs")) {
		    			 fail(driver,"Error displayed When click Apply Button on 'Map with Bubble' Widget, Validation : "+errorWidget);
		    		 }else {
		    			 pass(driver,"Error displayed When click Apply Button on 'Map with Bubble' Widget, Validation : "+errorWidget);
		    		 }
		    		 elementnotvisible1(driver, error);
	    		 }else if(isDisplayed(driver,ChartGraph)) {
					pass(driver,"Chart is Displayed in the Map with Bubble Widget");
				 }
				
			}else {
				 String errorWidget=getText1(driver,error);
	    		 if(errorWidget.contains("Please refer the logs in Logs")) {
	    			 fail(driver,"Error displayed When click on 'Map with Bubble' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }else {
	    			 pass(driver,"Error displayed When click on 'Map with Bubble' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }
				elementnotvisible1(driver, error);
			}
			
		}else {
			fail(driver,"Map with Bubble Widget is not displayed");
		}
		
		if(isDisplayed(driver,Word_Cloud_widget)) {
			WidgetValidation(driver,Word_Cloud_widget,"Word Cloud");
			click(driver,Word_Cloud_widget);
			if(!isDisplayed2(driver,error)) {
				waitForElement(driver,Axes);
				if(verifyElementDisplayed(driver, Category_Input)) {
					click(driver,Category_Input);
					if(isDisplayed(driver,Category_dropdownExpand)) {
						pass(driver,"Category dropdown Expanded after click on it");
						selectDropdownValue(driver,Category_dataType_WordCloudWidget,Select_Category_Value_WordCloudWidget);
					}else {
						fail(driver,"Category dropdown not Expanded after click on it");
					}
				}
				if(verifyElementDisplayed(driver, N_Grams_Input)) {
					click(driver,N_Grams_Input);
					clear1(driver,N_Grams_Input);
					sendKeys(driver,N_Grams_Input,N_Grams_Value);
				}
				
				if(verifyElementDisplayed(driver, Top_K_FrequentInput)) {
					click(driver,Top_K_FrequentInput);
					clear1(driver,Top_K_FrequentInput);
					sendKeys(driver,Top_K_FrequentInput,Top_K_Frequent_Value);
				}
				
				
				scrollUsingElement(driver,ApplyButton);
				click(driver,ApplyButton);
				if(isDisplayed(driver,error)) {
					fail(driver,"Error displayed after click Apply button in the 'Word Cloud' Widget");
					elementnotvisible1(driver, error);
				}
				elementnotvisible1(driver, RPE_Loading);
				if(isDisplayed(driver,ChartGraph)) {
					pass(driver,"**Chart is Displayed in the Word Cloud Widget**");
				}else {
					fail(driver,"**Chart is not displayed in the Word Cloud Widget**");
				}
			}else {
				 String errorWidget=getText1(driver,error);
	    		 if(errorWidget.contains("Please refer the logs in Logs")) {
	    			 fail(driver,"Error displayed When click on 'Word Cloud' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }else {
	    			 pass(driver,"Error displayed When click on 'Word Cloud' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }
				elementnotvisible1(driver, error);
			}
			
		}else {
			fail(driver,"Word Cloud Widget is not displayed");
		}
		
		if(isDisplayed(driver,Summary_widget)) {
			WidgetValidation(driver,Summary_widget,"Summary");
			click(driver,Summary_widget);
			if(!isDisplayed2(driver,error)) {
				waitForElement(driver,Axes);
				if(verifyElementDisplayed(driver, X_Axis_Input)) {
					click(driver,X_Axis_Input);
					if(isDisplayed(driver,X_Axis_dropdownResultsExp)) {
						pass(driver,"X Axis dropdown Expanded after click on it");
						selectDropdownValue(driver,X_Axis_dataType_SummaryWidget,Select_X_Axis_Value_SummaryWidget);
						
						if(X_Axis_dataType_SummaryWidget.equals("Date")) {
							 if(isDisplayed(driver,groupDropdown)) {
								  pass(driver,"Group selection input option is displayed While select Date datatype in X Axis");
								  click(driver,groupDropdown);
								  if(verifyElementDisplayed(driver, GroupDropdownExpand)){
									  selectGroupDateValue(driver,SelectGroupValue_Date_SummaryChart);
								  }
							 }else {
								 fail(driver,"Group selection input option is not displayed While select Date datatype in X Axis");
							 }
						 }
						
					}else {
						fail(driver,"X Axis dropdown not Expanded after click on it");
					}
				}
				
				if(verifyElementDisplayed(driver, Y_Axis_Input)) {
					click(driver,Y_Axis_Input);
					if(isDisplayed(driver,Y_Axis_dropdownResultsExp)) {
						pass(driver,"Y-Axis dropdown Expanded after click on it");
						selectDropdownValue(driver,Y_Axis_dataType_SummaryWidget,Select_Y_Axis_Value_SummaryWidget);
					}else {
						fail(driver,"Y-Axis dropdown not Expanded after click on it");
					}
				}
				
				scrollUsingElement(driver,ApplyButton);
				click(driver,ApplyButton);
				elementnotvisible1(driver, RPE_Loading);
				if(isDisplayed2(driver,error)){
	    			 String errorWidget=getText1(driver,error);
		    		 if(errorWidget.contains("Please refer the logs in Logs")) {
		    			 fail(driver,"Error displayed When click Apply Button on 'Summary' Widget, Validation : "+errorWidget);
		    		 }else {
		    			 pass(driver,"Error displayed When click Apply Button on 'Summary' Widget, Validation : "+errorWidget);
		    		 }
		    		 elementnotvisible1(driver, error);
	    		 }else if(isDisplayed(driver,Summary_Chart)) {
					pass(driver,"Chart is Displayed in the Summary Widget");
	    		 }
			}else {
				String errorWidget=getText1(driver,error);
	    		 if(errorWidget.contains("Please refer the logs in Logs")) {
	    			 fail(driver,"Error displayed When click on 'Summary' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }else {
	    			 pass(driver,"Error displayed When click on 'Summary' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }
				elementnotvisible1(driver, error);
			}
			
		}else {
			fail(driver,"Summary Widget is not displayed");
		}
		
		if(isDisplayed(driver,Card_widget)) {
			WidgetValidation(driver,Card_widget,"Card");
			click(driver,Card_widget);
			if(!isDisplayed2(driver,error)) {
				if(verifyElementDisplayed(driver, CardColumnSelect_Input)) {
					click(driver,CardColumnSelect_Input);
					if(isDisplayed(driver,CardColumnSelect_dropdownResults)) {
						pass(driver,"Card Column Select dropdown Expanded after click on it");
						selectDropdownValue(driver,ColumnInput_dataType_CardWidget,Select_ColumnInput_Value_CardWidget);
					}else {
						fail(driver,"Card Column Select dropdown not Expanded after click on it");
					}
				}
				
				mouseOverAndClick(driver, Plus_button);
				
				scrollUsingElement(driver,ApplyButton);
				click(driver,ApplyButton);
				elementnotvisible1(driver, RPE_Loading);
				if(isDisplayed2(driver,error)){
	    			 String errorWidget=getText1(driver,error);
		    		 if(errorWidget.contains("Please refer the logs in Logs")) {
		    			 fail(driver,"Error displayed When click Apply Button on 'Card' Widget, Validation : "+errorWidget);
		    		 }else {
		    			 pass(driver,"Error displayed When click Apply Button on 'Card' Widget, Validation : "+errorWidget);
		    		 }
		    		 elementnotvisible1(driver, error);
	    		 }else if(isDisplayed(driver,Card_Chart)) {
					pass(driver,"Chart is Displayed in the Card Widget");
				 }
			}else {
				String errorWidget=getText1(driver,error);
	    		 if(errorWidget.contains("Please refer the logs in Logs")) {
	    			 fail(driver,"Error displayed When click on 'Card' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }else {
	    			 pass(driver,"Error displayed When click on 'Card' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }
				elementnotvisible1(driver, error);
			}
			
		}else {
			fail(driver,"Card Widget is not displayed");
		}
		
		if(isDisplayed(driver,KPI_Card_widget)) {
			WidgetValidation(driver,KPI_Card_widget,"KPI card");
			click(driver,KPI_Card_widget);
			if(!isDisplayed2(driver,error)) {
				waitForElement(driver,Axes);
				if(verifyElementDisplayed(driver, TimeLine_Input)) {
					click(driver,TimeLine_Input);
					if(isDisplayed(driver,TimeLine_dropdownResultsExp)) {
						pass(driver,"Time Line dropdown Expanded after click on it");
						selectDropdownValue(driver,TimeLine_dataType_KPICardWidget,Select_TimeLine_Value_KPICardWidget);
					}else {
						fail(driver,"Time Line dropdown not Expanded after click on it");
					}
				}
				
				if(verifyElementDisplayed(driver, KPI_Name_Input)) {
					click(driver,KPI_Name_Input);
					if(isDisplayed(driver,KPI_Name_dropdownResults)) {
						pass(driver,"KPI Name dropdown Expanded after click on it");
						selectDropdownValue(driver,KPIName_dataType_KPICardWidget,Select_KPIName_Value_KPICardWidget);
					}else {
						fail(driver,"KPI Name dropdown not Expanded after click on it");
					}
				}
				
				mouseOverAndClick(driver,DashProPage);
				
				if(verifyElementDisplayed(driver, Group_Select_Input)) {
					click(driver,Group_Select_Input);
					if(isDisplayed(driver,Group_DropdownResults)) {
						pass(driver,"Group dropdown Expanded after click on it");
						selectDropdownValue(driver,Group_dataType_KPICardWidget,Select_Group_Value_KPICardWidget);
					}else {
						fail(driver,"Group dropdown not Expanded after click on it");
					}
				}
				
				mouseOverAndClick(driver,DashProPage);
				
				if(verifyElementDisplayed(driver, Period_input)) {
					selectByText(driver, Period_input, Period_Value_KPICardWidget);
				}
				
				if(verifyElementDisplayed(driver, Period_Count_Input)) {
					clear1(driver,Period_Count_Input);
					sendKeys(driver,Period_Count_Input,Period_Count_Value_KPICardWidget);
				}
				
				scrollUsingElement(driver,ApplyButton);
				click(driver,ApplyButton);
				elementnotvisible1(driver, RPE_Loading);
				if(isDisplayed2(driver,error)){
	    			 String errorWidget=getText1(driver,error);
		    		 if(errorWidget.contains("Please refer the logs in Logs")) {
		    			 fail(driver,"Error displayed When click Apply Button on 'KPI Card' Widget, Validation : "+errorWidget);
		    		 }else {
		    			 pass(driver,"Error displayed When click Apply Button on 'KPI Card' Widget, Validation : "+errorWidget);
		    		 }
		    		 elementnotvisible1(driver, error);
	    		 }else if(isDisplayed(driver,KPI_Card_Chart)) {
					pass(driver,"Chart is Displayed in the KPI Card Widget");
				}
			}else {
				 String errorWidget=getText1(driver,error);
	    		 if(errorWidget.contains("Please refer the logs in Logs")) {
	    			 fail(driver,"Error displayed When click on 'KPI Card' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }else {
	    			 pass(driver,"Error displayed When click on 'KPI Card' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }
				elementnotvisible1(driver, error);
			}
			
		}else {
			fail(driver,"KPI Card Widget is not displayed");
		}
		
		if(isDisplayed(driver,Custom_Pivot_widget)) {
			WidgetValidation(driver,Custom_Pivot_widget,"Custom pivot");
			click(driver,Custom_Pivot_widget);
			if(!isDisplayed2(driver,error)) {
				waitForElement(driver,Axes);
				if(verifyElementDisplayed(driver, Groups_Input_CustomPivot)) {
					click(driver,Groups_Input_CustomPivot);
					if(isDisplayed(driver,Groups_DropdownResults_CustomPivot)) {
						pass(driver,"Group dropdown Expanded after click on it");
						selectDropdownValue(driver,Group_dataType_CustomPivotWidget,Select_Group_Value_CustomPivotWidget);
					}else {
						fail(driver,"Group dropdown not Expanded after click on it");
					}
				}
				
				mouseOverAndClick(driver,DashProPage);
				
				if(verifyElementDisplayed(driver, Values_Input_CustomPivot)) {
					click(driver,Values_Input_CustomPivot);
					if(isDisplayed(driver,Values_DropdownResults_CustomPivot)) {
						pass(driver,"Values dropdown Expanded after click on it");
						selectDropdownValue(driver,ValueInput_dataType_CustomPivotWidget,Select_ValuesInput_Value_CustomPivotWidget);
					}else {
						fail(driver,"Values dropdown not Expanded after click on it");
					}
				}
				
				mouseOverAndClick(driver,DashProPage);
				
				scrollUsingElement(driver,ApplyButton);
				click(driver,ApplyButton);
				elementnotvisible1(driver, RPE_Loading);
				if(isDisplayed2(driver,error)){
	    			 String errorWidget=getText1(driver,error);
		    		 if(errorWidget.contains("Please refer the logs in Logs")) {
		    			 fail(driver,"Error displayed When click Apply Button on 'Custom Pivot' Widget, Validation : "+errorWidget);
		    		 }else {
		    			 pass(driver,"Error displayed When click Apply Button on 'Custom Pivot' Widget, Validation : "+errorWidget);
		    		 }
		    		 elementnotvisible1(driver, error);
	    		 }else if(isDisplayed(driver,KPI_Card_Chart)) {
					pass(driver,"Chart is Displayed in the Custom Pivot Widget");
				}
			}else {
				String errorWidget=getText1(driver,error);
	    		 if(errorWidget.contains("Please refer the logs in Logs")) {
	    			 fail(driver,"Error displayed When click on 'Custom Pivot' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }else {
	    			 pass(driver,"Error displayed When click on 'Custom Pivot' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }
				elementnotvisible1(driver, error);
			}
			
		}else {
			fail(driver,"Custom Pivot Widget is not displayed");
		}
		
		if(isDisplayed(driver,Sparkline_widget)) {
			WidgetValidation(driver,Sparkline_widget,"Sparkline");
			click(driver,Sparkline_widget);
			if(!isDisplayed2(driver,error)) {
				waitForElement(driver,Axes);
				if(verifyElementDisplayed(driver, Date_Input_Sparkline)) {
					click(driver,Date_Input_Sparkline);
					if(isDisplayed(driver,Date_dropdownResultsExp_Sparkline)) {
						pass(driver,"Date dropdown Expanded after click on it");
						selectDropdownValue(driver,Date_dataType_SparkLineWidget,Select_Date_Value_SparkLineWidget);
						if(Date_dataType_SparkLineWidget.equals("Date")) {
							 if(isDisplayed(driver,groupDropdown)) {
								  pass(driver,"Group selection input option is displayed While select Date datatype in DateInput");
								  click(driver,groupDropdown);
								  if(verifyElementDisplayed(driver, GroupDropdownExpand)){
									  selectGroupDateValue(driver,SelectGroupValue_Date_SparkLine);
								  }
							 }else {
								 fail(driver,"Group selection input option is not displayed While select Date datatype in DateInput");
							 }
						 }
						
					}else {
						fail(driver,"Date dropdown not Expanded after click on it");
					}
				}
			
				if(verifyElementDisplayed(driver, Categories_input_Sparkline)) {
					click(driver,Categories_input_Sparkline);
					if(isDisplayed(driver,Categories_DropdownExpand_Sparkline)) {
						pass(driver,"Categories dropdown Expanded after click on it");
						selectDropdownValue(driver,Categories_dataType_SparkLineWidget,Select_Categories_Value_SparkLineWidget);
					}else {
						fail(driver,"Categories dropdown not Expanded after click on it");
					}
				}
				
				mouseOverAndClick(driver,DashProPage);
				
				if(verifyElementDisplayed(driver, Numericals_Input_Sparkline)) {
					click(driver,Numericals_Input_Sparkline);
					if(isDisplayed(driver,Numericals_DropdownExpand_Sparkline)) {
						pass(driver,"Numericals dropdown Expanded after click on it");
						selectDropdownValue(driver,Numericals_dataType_SparkLineWidget,Select_Numericals_Value_SparkLineWidget);
					}else {
						fail(driver,"Numericals dropdown not Expanded after click on it");
					}
				}
				
				mouseOverAndClick(driver,DashProPage);
				
				if(verifyElementDisplayed(driver, PeriodInput)) {
					clear1(driver,PeriodInput);
					sendKeys(driver, PeriodInput, Period_Count_Value_Sparkline);
				}
				scrollUsingElement(driver,ApplyButton);
				click(driver,ApplyButton);
				elementnotvisible1(driver, RPE_Loading);
				if(isDisplayed2(driver,error)){
	    			 String errorWidget=getText1(driver,error);
		    		 if(errorWidget.contains("Please refer the logs in Logs")) {
		    			 fail(driver,"Error displayed When click Apply Button on 'SparkLine' Widget, Validation : "+errorWidget);
		    		 }else {
		    			 pass(driver,"Error displayed When click Apply Button on 'SparkLine' Widget, Validation : "+errorWidget);
		    		 }
		    		 elementnotvisible1(driver, error);
	    		 }else if(isDisplayed(driver,KPI_Card_Chart)) {
					pass(driver,"Chart is Displayed in the SparkLine Widget");
				}
			}else {
				String errorWidget=getText1(driver,error);
	    		 if(errorWidget.contains("Please refer the logs in Logs")) {
	    			 fail(driver,"Error displayed When click on 'SparkLine' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }else {
	    			 pass(driver,"Error displayed When click on 'SparkLine' Widget Unable to perform Chart Validation, Error : "+errorWidget);
	    		 }
				elementnotvisible1(driver, error);
				
			}
			
		}else {
			fail(driver,"SparkLine Widget is not displayed");
		}
		
		
		click(driver,ChartTitleInput);
 		clear(driver,ChartTitleInput);
       	sendKeys(driver,ChartTitleInput,"AllChartsTest");
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
