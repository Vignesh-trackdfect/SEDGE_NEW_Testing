package commonMethods;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import atu.testng.reports.listeners.ATUReportsListener;
import atu.testng.reports.listeners.ConfigurationListener;
import atu.testng.reports.listeners.MethodListener;
import atu.testng.reports.logging.LogAs;
import scripts.DASHPRO_ADMIN_SMOKE_TESTING;
import scripts.DASHPRO_BARWITHLINE_TESTING;
import scripts.DASHPRO_BAR_SMOKE_TESTING;
import scripts.DASHPRO_CARD_TESTING;
import scripts.DASHPRO_COLUMN_SMOKE_TESTING;
import scripts.DASHPRO_CUSTOM_PIVOT_TESTING;
import scripts.DASHPRO_GANTT_TESTING;
import scripts.DASHPRO_GROUPED_AND_SORTED_TESTING;
import scripts.DASHPRO_GROUPED_BAR;
import scripts.DASHPRO_GROUPED_COLUMN_TESTING;
import scripts.DASHPRO_HEAT_MAP_LEGEND_TESTING;
import scripts.DASHPRO_KPI_CARD_TESTING;
import scripts.DASHPRO_LINE_TESTING;
import scripts.DASHPRO_MULTIPLE_AXIS_TESTING;
import scripts.DASHPRO_NETWORK_TESTING;
import scripts.DASHPRO_PIVOT_SMOKE_TESTING;
import scripts.DASHPRO_RADAR_LINE_TESTING;
import scripts.DASHPRO_SMOKE_TESTING;
import scripts.DASHPRO_SPARKLINE_TESTING;
import scripts.DASHPRO_STACKED_BAR;
import scripts.DASHPRO_STACKED_COLUMN_TESTING;
import scripts.DASHPRO_TABLES_SMOKE_TESTING;
import scripts.DASHPRO_TEXT_TESTING;
import scripts.DASHPRO_TREE_MAP_TESTING;
import scripts.DASHPRO_WATERFALL_TESTING;
import scripts.DB_CONNECTION_SMOKE_TESTING;
import scripts.FILE_UPLOAD_TESTING;
import scripts.LOGIN;
import scripts.LOGIN_SMOKE_TESTING;
import scripts.PREVIEW_SMOKE_TESTING;
import scripts.PROJECT_SELECTION;
import scripts.SMOKE_TESTING_ALL_CHARTS;
import scripts.STATISTICS_SMOKE_TESTING;
import scripts.TestCase_DP01;

@Listeners({ ATUReportsListener.class, ConfigurationListener.class, MethodListener.class })

public class Testcases extends Config {
	{
		System.setProperty("atu.reporter.config", System.getProperty("user.dir") + "/atu.properties");
	}
	
	public String browser;
	public WebDriver driver;
	static ExtentSparkReporter spark;
	static ExtentTest test;
	static ExtentReports extent;
	public String environment;
	public String Execution = "null";
	boolean log = false;

	TestCase_DP01 dp01=new TestCase_DP01();
	
	LOGIN loginTest=new LOGIN();
	LOGIN_SMOKE_TESTING login_Page=new LOGIN_SMOKE_TESTING();
	DB_CONNECTION_SMOKE_TESTING DB_Connection=new DB_CONNECTION_SMOKE_TESTING();
	PREVIEW_SMOKE_TESTING preview_page=new PREVIEW_SMOKE_TESTING();
	STATISTICS_SMOKE_TESTING statistics_page=new STATISTICS_SMOKE_TESTING();
	DASHPRO_SMOKE_TESTING dashPro_page=new DASHPRO_SMOKE_TESTING();
	DASHPRO_TABLES_SMOKE_TESTING dash_Table=new DASHPRO_TABLES_SMOKE_TESTING();
	DASHPRO_BAR_SMOKE_TESTING dash_Bar=new DASHPRO_BAR_SMOKE_TESTING();
	DASHPRO_ADMIN_SMOKE_TESTING dash_Admin=new DASHPRO_ADMIN_SMOKE_TESTING();
	DASHPRO_STACKED_BAR StackBar=new DASHPRO_STACKED_BAR();
	DASHPRO_GROUPED_BAR groupedBar=new DASHPRO_GROUPED_BAR();
	SMOKE_TESTING_ALL_CHARTS Allchart=new SMOKE_TESTING_ALL_CHARTS();
	DASHPRO_PIVOT_SMOKE_TESTING dashPro_pivot=new DASHPRO_PIVOT_SMOKE_TESTING();
	DASHPRO_COLUMN_SMOKE_TESTING dashPro_column=new DASHPRO_COLUMN_SMOKE_TESTING();
	DASHPRO_STACKED_COLUMN_TESTING stackedColumn=new DASHPRO_STACKED_COLUMN_TESTING();
	DASHPRO_GROUPED_COLUMN_TESTING groupedColumn=new DASHPRO_GROUPED_COLUMN_TESTING();
	DASHPRO_LINE_TESTING linewidget=new DASHPRO_LINE_TESTING();
	DASHPRO_GANTT_TESTING ganttwidget=new DASHPRO_GANTT_TESTING();
	DASHPRO_TEXT_TESTING textwidget=new DASHPRO_TEXT_TESTING();
	DASHPRO_BARWITHLINE_TESTING barWithLine=new DASHPRO_BARWITHLINE_TESTING();
	DASHPRO_CARD_TESTING cardTest=new DASHPRO_CARD_TESTING();
	DASHPRO_SPARKLINE_TESTING da=new DASHPRO_SPARKLINE_TESTING();
	PROJECT_SELECTION project=new PROJECT_SELECTION();
	DASHPRO_CUSTOM_PIVOT_TESTING customPivot=new DASHPRO_CUSTOM_PIVOT_TESTING();
	FILE_UPLOAD_TESTING fileUpload=new FILE_UPLOAD_TESTING();
	DASHPRO_WATERFALL_TESTING waterFall=new DASHPRO_WATERFALL_TESTING();
	DASHPRO_RADAR_LINE_TESTING radarLine=new DASHPRO_RADAR_LINE_TESTING();
	DASHPRO_NETWORK_TESTING newtwork=new DASHPRO_NETWORK_TESTING();
	DASHPRO_TREE_MAP_TESTING treeMap=new DASHPRO_TREE_MAP_TESTING();
	DASHPRO_GROUPED_AND_SORTED_TESTING groupSorted=new DASHPRO_GROUPED_AND_SORTED_TESTING();
	DASHPRO_KPI_CARD_TESTING kpiCard=new DASHPRO_KPI_CARD_TESTING();
	DASHPRO_HEAT_MAP_LEGEND_TESTING heatMap=new DASHPRO_HEAT_MAP_LEGEND_TESTING();
	DASHPRO_MULTIPLE_AXIS_TESTING multipleAxis=new DASHPRO_MULTIPLE_AXIS_TESTING();
	
	
	@BeforeMethod
	public void getDataFromConfig() throws Exception {
		System.out.println("******************Script Execution Started******************");
		Execution = Utils.getDataFromTestConfig("Execution env");
		browser = Utils.getDataFromTestConfig("AppBrowser");
        driver=getWebDriver(browser);
		
	}
	
	@AfterMethod
	public void Teardown() throws Throwable {
//     	driver.quit();   // command this line, If we need to activate the chrome browser after completed the execution.
	}
	
    @DataProvider(name = "SmokeTestingDataProvider")
    public Object[][] smokeTestingData() {
    	
    	List<String> SelectedUrl = getdata(driver, "SmokeTesting", "Iteration_Sheet", "TestcaseName", "Condition", "Environment");
		List<String> TestDataSheet = getdata(driver, "SmokeTesting", "Iteration_Sheet", "TestcaseName", "Condition","IterationData");
		List<String> TestCaseSelection = getdata(driver, "SmokeTesting", "Iteration_Sheet", "TestcaseName", "Condition","TestSplitFlag");
		List<String> TestDataFileName = getdata(driver, "SmokeTesting", "Iteration_Sheet", "TestcaseName", "Condition","TestDataFileName");

		// Create a dynamic list to hold each dataset
		List<Object[]> data = new ArrayList<>();

		int size = SelectedUrl.size();
		
		for (int i = 0; i < size; i++) {

			String Index = TestDataSheet.get(i);
			List<String> expandedList = splitAndExpand(Index);

			int dataset_size = expandedList.size();

			//System.out.println(dataset_size);

			String URL = SelectedUrl.get(i);
			String TestCaseSelectionFlag = TestCaseSelection.get(i);
			String DataFileName = TestDataFileName.get(i);
		//	System.out.println("TestCaseSelectionFlag : "+TestCaseSelectionFlag);

			for (int j = 0; j < dataset_size; j++) {
				String numberof_dataset = expandedList.get(j);
				int iteration = Integer.parseInt(numberof_dataset);
			
				// Add each combination to the list
				data.add(new Object[] {URL, iteration, TestCaseSelectionFlag,DataFileName});

				//System.out.println("numberof_dataset : "+numberof_dataset);
				//System.out.println("iteration : "+iteration);
			}
		}

		Object[][] dataArray = new Object[data.size()][];
		data.toArray(dataArray);
		
		return dataArray;
    }
    
    @Test(dataProvider = "SmokeTestingDataProvider")
	public void SmokeTesting(String URL,int iteration,String TestCaseSelectionFlag,String TestDataFileName) throws Exception {

			try {
				String methodName="SmokeTesting_Data_"+iteration+"_"+TestCaseSelectionFlag;
				Utils.InputDataFileName(TestDataFileName);
				ITestResult result = Reporter.getCurrentTestResult();
				result.setAttribute("iteration", String.valueOf(iteration));
		        result.setAttribute("name", methodName);
		        result.setAttribute("flag", TestCaseSelectionFlag);
		        result.setAttribute("Url", URL);
		        result.setAttribute("ModuleName", "SmokeTesting");
		        ATUReportsListener.createReportDir1(result);
				String Login = getCellValue("TestExecution","Testcase_Selection","Login",TestCaseSelectionFlag);
				String LoginPage_Run = getCellValue("TestExecution","Testcase_Selection","Login_Page_Validation",TestCaseSelectionFlag);
				String DB_Connection_Run = getCellValue("TestExecution","Testcase_Selection","DB_Connection",TestCaseSelectionFlag);
				String FileUpload_Run = getCellValue("TestExecution","Testcase_Selection","File_Upload",TestCaseSelectionFlag);
				String Preview_Run = getCellValue("TestExecution","Testcase_Selection","Preview",TestCaseSelectionFlag);
				String Statistics_Run =getCellValue("TestExecution","Testcase_Selection","Statistics",TestCaseSelectionFlag);          
		        String DashPro_Run=getCellValue("TestExecution","Testcase_Selection","DashPro",TestCaseSelectionFlag);   
		        String DashPro_All_Charts=getCellValue("TestExecution","Testcase_Selection","DashPro_All_Charts",TestCaseSelectionFlag);
		        String DashPro_Admin=getCellValue("TestExecution","Testcase_Selection","DashPro_Admin",TestCaseSelectionFlag);  
		        String Project_Selection=getCellValue("TestExecution","Testcase_Selection","Project_Selection",TestCaseSelectionFlag);  		        
		        
		        setTestCaseID(""); 
		        
		        if(Login.contains("Yes")) {
		        	loginTest.login(driver, iteration,URL);
				}else if(LoginPage_Run.contains("Yes")) {
					login_Page.loginPage(driver, iteration,URL);
				}else {
					System.out.println("Please Select Any one of the Login Page Script...!!!!!!");
					add1(driver, "Please Select Any one of the Login Page Script...!!!!!!" , LogAs.FAILED, true, "");
					Assert.fail();
				}
					
		        if(Project_Selection.contains("Yes")) {
		        	project.projectSelection(driver, iteration);
		        }else {
		        	if(DB_Connection_Run.contains("Yes")) {
						DB_Connection.dbConnection(driver, iteration);
					}else if(FileUpload_Run.contains("Yes")) {
						fileUpload.file_uploading(driver, iteration);
					}else {
						fail(driver,"Please select 'Yes' in DB Connection or File Upload Script");
					}
		        	
		        	if(Preview_Run.contains("Yes")) {
						preview_page.previewPageTest(driver, iteration);
					}
					
					if(Statistics_Run.contains("Yes")) {
						statistics_page.statisticsTest(driver, iteration);
					}
		        }
				
				if(DashPro_Run.contains("Yes")) {
					dashPro_page.dashProPage(driver, iteration);
				}
				
				if(DashPro_All_Charts.contains("Yes")) {
					Allchart.allCharts(driver, iteration);
				}

				if(DashPro_Admin.contains("Yes")) {
					dash_Admin.dashProAdmin(driver, iteration);
				}
				pass(driver,"*****Script Executed Completely*****");
			} catch (Exception e) {
				System.out.println("Execution failed for Iteration : " + iteration);
                add1(driver, "Execution failed  :  " + e.getLocalizedMessage(), LogAs.FAILED, true, "");
			} 
		setTestCaseID("");
	}
    
    
    @DataProvider(name = "ComprehensiveDataProvider")
    public Object[][] ComprehensiveTestingData() {
    	
    	List<String> SelectedUrl = getdata(driver, "ComprehensiveTesting", "Iteration_Sheet", "TestcaseName", "Condition", "Environment");
		List<String> TestDataSheet = getdata(driver, "ComprehensiveTesting", "Iteration_Sheet", "TestcaseName", "Condition","IterationData");
		List<String> TestCaseSelection = getdata(driver, "ComprehensiveTesting", "Iteration_Sheet", "TestcaseName", "Condition","TestSplitFlag");
		List<String> TestDataFileName = getdata(driver, "ComprehensiveTesting", "Iteration_Sheet", "TestcaseName", "Condition","TestDataFileName");

		// Create a dynamic list to hold each dataset
		List<Object[]> data = new ArrayList<>();

		int size = SelectedUrl.size();
		for (int i = 0; i < size; i++) {

			String Index = TestDataSheet.get(i);
			List<String> expandedList = splitAndExpand(Index);

			int dataset_size = expandedList.size();

			//System.out.println(dataset_size);

			String URL = SelectedUrl.get(i);
			String TestCaseSelectionFlag = TestCaseSelection.get(i);
			String DataFileName = TestDataFileName.get(i);
			for (int j = 0; j < dataset_size; j++) {
				String numberof_dataset = expandedList.get(j);
				int iteration = Integer.parseInt(numberof_dataset);
			
				data.add(new Object[] {URL, iteration, TestCaseSelectionFlag,DataFileName});

			}
		}

		// Convert the list to an Object[][]
		Object[][] dataArray = new Object[data.size()][];
		data.toArray(dataArray);
		
		// Return the final Object[][]
		return dataArray;
    }
    
    
    
	@Test(dataProvider = "ComprehensiveDataProvider")
	public void ComprehensiveTesting(String URL,int iteration,String TestCaseSelectionFlag,String TestDataFileName) throws Exception {

		try {
			String methodName="ComprehensiveTesting_Data_"+iteration+"_"+TestCaseSelectionFlag;
			Utils.InputDataFileName(TestDataFileName);
			ITestResult result = Reporter.getCurrentTestResult();
			result.setAttribute("iteration", String.valueOf(iteration));
	        result.setAttribute("name", methodName);
	        result.setAttribute("flag", TestCaseSelectionFlag);
	        result.setAttribute("Url", URL);
	        result.setAttribute("ModuleName", "ComprehensiveTesting");
	        ATUReportsListener.createReportDir1(result);
	        //driver=getWebDriver(browser);
			String Login = getCellValue("TestExecution","Testcase_Selection","Login",TestCaseSelectionFlag);
			String LoginPage_Run = getCellValue("TestExecution","Testcase_Selection","Login_Page_Validation",TestCaseSelectionFlag);
			String DB_Connection_Run = getCellValue("TestExecution","Testcase_Selection","DB_Connection",TestCaseSelectionFlag);
			String FileUpload_Run = getCellValue("TestExecution","Testcase_Selection","File_Upload",TestCaseSelectionFlag);
			String Preview_Run = getCellValue("TestExecution","Testcase_Selection","Preview",TestCaseSelectionFlag);
			String Statistics_Run =getCellValue("TestExecution","Testcase_Selection","Statistics",TestCaseSelectionFlag);          
	        String DashPro_Run=getCellValue("TestExecution","Testcase_Selection","DashPro",TestCaseSelectionFlag);   
	        String DashPro_Tables_Run=getCellValue("TestExecution","Testcase_Selection","Tables_Columns",TestCaseSelectionFlag);
	        String DashPro_Bar_Run=getCellValue("TestExecution","Testcase_Selection","Bar_Axes",TestCaseSelectionFlag);   
	        String DashPro_Admin=getCellValue("TestExecution","Testcase_Selection","DashPro_Admin",TestCaseSelectionFlag);  
	        String DashPro_Stacked_Bar=getCellValue("TestExecution","Testcase_Selection","Stacked_Bar_Axes",TestCaseSelectionFlag);    
	        String DashPro_Grouped_Bar=getCellValue("TestExecution","Testcase_Selection","Grouped_Bar_Axes",TestCaseSelectionFlag);    
	        String DashPro_Column=getCellValue("TestExecution","Testcase_Selection","Column_Axes",TestCaseSelectionFlag);     
	        String DashPro_All_Charts=getCellValue("TestExecution","Testcase_Selection","DashPro_All_Charts",TestCaseSelectionFlag);    
	        String DashPro_Pivot_Run=getCellValue("TestExecution","Testcase_Selection","Pivot_Panel",TestCaseSelectionFlag); 
	        String DashPro_Stacked_Column=getCellValue("TestExecution","Testcase_Selection","Stacked_Column_Axes",TestCaseSelectionFlag); 
	        String DashPro_Grouped_Column=getCellValue("TestExecution","Testcase_Selection","Grouped_Column_Axes",TestCaseSelectionFlag); 
	        String DashPro_Line=getCellValue("TestExecution","Testcase_Selection","Line_Axes",TestCaseSelectionFlag); 
	        String DashPro_Gantt=getCellValue("TestExecution","Testcase_Selection","Gantt_Axes",TestCaseSelectionFlag); 
	        String DashPro_Text=getCellValue("TestExecution","Testcase_Selection","DashPro_Text",TestCaseSelectionFlag); 
	        String DashPro_BarWithLine=getCellValue("TestExecution","Testcase_Selection","BarWithLine_Axes",TestCaseSelectionFlag); 
	        String DashPro_Card=getCellValue("TestExecution","Testcase_Selection","DashPro_Card",TestCaseSelectionFlag); 
	        String DashPro_SparkLine=getCellValue("TestExecution","Testcase_Selection","DashPro_SparkLine",TestCaseSelectionFlag); 
	        String Project_Selection=getCellValue("TestExecution","Testcase_Selection","Project_Selection",TestCaseSelectionFlag); 
	        String DashPro_Custom_Pivot=getCellValue("TestExecution","Testcase_Selection","Custom_Pivot_Axes",TestCaseSelectionFlag); 
	        String DashPro_WaterFall=getCellValue("TestExecution","Testcase_Selection","WaterFall_Axes",TestCaseSelectionFlag); 
	        String DashPro_RadarLine=getCellValue("TestExecution","Testcase_Selection","Radar_Line_Axes",TestCaseSelectionFlag); 
	        String DashPro_Network=getCellValue("TestExecution","Testcase_Selection","Network_Axes",TestCaseSelectionFlag); 
	        String DashPro_TreeMap=getCellValue("TestExecution","Testcase_Selection","TreeMap_Axes",TestCaseSelectionFlag); 
	        String DashPro_GroupAndSorted=getCellValue("TestExecution","Testcase_Selection","Grouped_And_Sorted_Axes",TestCaseSelectionFlag); 
	        String DashPro_KPI_card=getCellValue("TestExecution","Testcase_Selection","KPI_Card_Axes",TestCaseSelectionFlag); 
	        String DashPro_Heat_Map_Legend=getCellValue("TestExecution","Testcase_Selection","Heat_Map_Legend_Axes",TestCaseSelectionFlag); 
	        String DashPro_Multiple_Axis=getCellValue("TestExecution","Testcase_Selection","Multiple_Axis_Axes",TestCaseSelectionFlag); 
	        
	        setTestCaseID("");
	        if(Login.contains("Yes")) {
	        	loginTest.login(driver, iteration,URL);
			}else if(LoginPage_Run.contains("Yes")) {
				login_Page.loginPage(driver, iteration,URL);
			}else {
				System.out.println("Please Select Any one of the Login Page Script...!!!!!!");
				add1(driver, "Please Select Any one of the Login Page Script...!!!!!!" , LogAs.FAILED, true, "");
				Assert.fail();
			}
				
	        if(Project_Selection.contains("Yes")) {
	        	project.projectSelection(driver, iteration);
	        }else {
	        	if(DB_Connection_Run.contains("Yes")) {
					DB_Connection.dbConnection(driver, iteration);
				}else if(FileUpload_Run.contains("Yes")) {
					fileUpload.file_uploading(driver, iteration);
				}else {
					pass(driver,"Please select 'Yes' in 'DB Connection' or 'File Upload' Script");
				}
	        	
	        	if(Preview_Run.contains("Yes")) {
					preview_page.previewPageTest(driver, iteration);
				}
				
				if(Statistics_Run.contains("Yes")) {
					statistics_page.statisticsTest(driver, iteration);
				}
				
				if(DashPro_Run.contains("Yes")) {
					dashPro_page.dashProPage(driver, iteration);
				}
	        }
			
			if(DashPro_All_Charts.contains("Yes")) {
				Allchart.allCharts(driver, iteration);
			}
			
			if(DashPro_Tables_Run.contains("Yes")) {
				dash_Table.tablesDashProTest(driver, iteration,TestCaseSelectionFlag);
			}
			
			if(DashPro_Pivot_Run.contains("Yes")) {
				dashPro_pivot.pivot_testing(driver, iteration,TestCaseSelectionFlag);
			}
			
			if(DashPro_Bar_Run.contains("Yes")) {
				dash_Bar.barwidgetTest(driver, iteration,TestCaseSelectionFlag);
			}
			
			if(DashPro_Stacked_Bar.contains("Yes")) {
				StackBar.StackedBarwidgetTest(driver, iteration,TestCaseSelectionFlag);
			}
			
			if(DashPro_Grouped_Bar.contains("Yes")) {
				groupedBar.groupedBarwidgetTest(driver, iteration,TestCaseSelectionFlag);
			}
			
			if(DashPro_Column.contains("Yes")) {
				dashPro_column.column_testing(driver, iteration,TestCaseSelectionFlag);
			}
			
			if(DashPro_Stacked_Column.contains("Yes")) {
				stackedColumn.stacked_column_testing(driver, iteration,TestCaseSelectionFlag);
			}
			
			if(DashPro_Grouped_Column.contains("Yes")) {
				groupedColumn.groupedColumn(driver, iteration,TestCaseSelectionFlag);
			}
			
			if(DashPro_Line.contains("Yes")) {
				linewidget.line_widget_testing(driver, iteration,TestCaseSelectionFlag);
			}
			
			if(DashPro_Gantt.contains("Yes")) {
				ganttwidget.gantt_widget_testing(driver, iteration,TestCaseSelectionFlag);
			}
			
			if(DashPro_Text.contains("Yes")) {
				textwidget.text_widget_testing(driver, iteration,TestCaseSelectionFlag);
			}
			
			if(DashPro_BarWithLine.contains("Yes")) {
				barWithLine.barWithLine_testing(driver, iteration,TestCaseSelectionFlag);
			}
			
			if(DashPro_Card.contains("Yes")) {
				cardTest.card_testing(driver, iteration,TestCaseSelectionFlag);
			}
			
			if(DashPro_SparkLine.contains("Yes")) {
				da.sparkLine_testing(driver, iteration,TestCaseSelectionFlag);
			}
			
			if(DashPro_Custom_Pivot.contains("Yes")) {
				customPivot.custom_pivot_testing(driver, iteration,TestCaseSelectionFlag);
			}
			
			if(DashPro_WaterFall.contains("Yes")) {
				waterFall.waterfallTesting(driver, iteration, TestCaseSelectionFlag);
			}
			
			if(DashPro_RadarLine.contains("Yes")) {
				radarLine.radarLineTesting(driver, iteration, TestCaseSelectionFlag);
			}
			
			if(DashPro_Network.contains("Yes")) {
				newtwork.network_Testing(driver, iteration, TestCaseSelectionFlag);
			}
			
			if(DashPro_TreeMap.contains("Yes")) {
				treeMap.treeMap_Testing(driver, iteration, TestCaseSelectionFlag);
			}
			
			if(DashPro_GroupAndSorted.contains("Yes")) {
				groupSorted.groupedAndSortedTesting(driver, iteration, TestCaseSelectionFlag);
			}
			
			if(DashPro_KPI_card.contains("Yes")) {
				kpiCard.kpiCardTesting(driver, iteration, TestCaseSelectionFlag);
			}
			
			if(DashPro_Heat_Map_Legend.contains("Yes")) {
				heatMap.heatMapLegendTesting(driver, iteration, TestCaseSelectionFlag);
			}
			
			if(DashPro_Multiple_Axis.contains("Yes")) {
				multipleAxis.multipleAxisTesting(driver, iteration, TestCaseSelectionFlag);
			}
			
			if(DashPro_Admin.contains("Yes")) {
				dash_Admin.dashProAdmin(driver, iteration);
			}
			
			pass(driver,"*****Script Executed Completely*****");
			
		} catch (Exception e) {
			System.out.println("Execution failed for Iteration : " + iteration);
            add1(driver, "Execution failed for Iteration : "+ iteration +" error : "+ e.getLocalizedMessage(), LogAs.FAILED, true, "");
		} 
	}
	
	
	 @DataProvider(name = "TestCase_DP01DataProvider")
	    public Object[][] TestCase_DP01TestingData() {
	    	
	    	List<String> SelectedUrl = getdata(driver, "TestCase_DP01", "Iteration_Sheet", "TestcaseName", "Condition", "Environment");
			List<String> TestDataSheet = getdata(driver, "TestCase_DP01", "Iteration_Sheet", "TestcaseName", "Condition","IterationData");
			List<String> TestDataFileName = getdata(driver, "TestCase_DP01", "Iteration_Sheet", "TestcaseName", "Condition","TestDataFileName");

			// Create a dynamic list to hold each dataset
			List<Object[]> data = new ArrayList<>();

			int size = SelectedUrl.size();
			
			for (int i = 0; i < size; i++) {

				String Index = TestDataSheet.get(i);
				List<String> expandedList = splitAndExpand(Index);
				int dataset_size = expandedList.size();
				String URL = SelectedUrl.get(i);
				String DataFileName = TestDataFileName.get(i);

				for (int j = 0; j < dataset_size; j++) {
					String numberof_dataset = expandedList.get(j);
					int iteration = Integer.parseInt(numberof_dataset);
				
					// Add each combination to the list
					data.add(new Object[] {URL, iteration,DataFileName});

				}
			}

			Object[][] dataArray = new Object[data.size()][];
			data.toArray(dataArray);
			
			return dataArray;
	    }
	    
	
	@Test(dataProvider = "TestCase_DP01DataProvider")
	public void TestCase_DP01(String URL,int iteration,String TestDataFileName) throws Exception {

		try {
			String methodName="TestCase_DP01_Data_"+iteration;
			Utils.InputDataFileName(TestDataFileName);
			ITestResult result = Reporter.getCurrentTestResult();
			result.setAttribute("iteration", String.valueOf(iteration));
	        result.setAttribute("name", methodName);
	        result.setAttribute("Url", URL);
	        result.setAttribute("ModuleName", "TestCase_DP01");
	        ATUReportsListener.createReportDir1(result);
			dp01.TestCasesFull(driver, iteration);
			pass(driver,"*****Script Executed Completely*****");
		} catch (Exception e) {
			add1(driver, "Execution failed  :  " + e.getLocalizedMessage(), LogAs.FAILED, true, "");
			//fail(driver,"Script not executed Completely.."+e.getLocalizedMessage());
			e.printStackTrace();
		}
		
	}
	
	
	
}

