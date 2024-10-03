package commonMethods;

public interface SEDGE_Locators {

	// Login Page
	public static String username_input="UserName>//input[@type='username']";
	public static String password_input="Password>(//h3[contains(text(),'Sign In')]//following::input)[2]";//input[@type='password']";
	public static String username_text="Username text>(//input[@type='username']//following::mat-label)[1]";
	public static String password_text="Password text>(//input[@type='password']//following::mat-label)[1]";
	public static String SignIn_text="Sign In text>//div[contains(@class,'title')]//h3";
	public static String forgot_username_link="Forgot username Link>//a[contains(@href,'username')]";
	public static String forgot_password_link="Forgot password link>//a[contains(@href,'password')]";
	public static String SignIn_Btn="Sign In Button>//button[contains(@id,'signin')]";
	public static String signup_link="SignUp Link>//a[contains(@class,'signup')]";
	public static String password_Hidden="Password Hidden>//input[@type='password']//following::mat-icon"; // visibility // visibility_off 
	public static String password_visible="Password Vissible>//input[@placeholder='Password']//following::mat-icon";
	public static String username_required_error="Username required error>//*[@id='mat-error-0']";
	public static String username_required_error2="Username required error>//*[@id='mat-error-2']";
	public static String Password_require_error="Password required error>//*[@id='mat-error-1']";
	public static String invalid_credentials="Invalid Credentials >//div[@role='alert']";
	
	//Home Page  Locators
	public static String HomePage="HomePage>//span[text()='Home']";
	public static String Data_Analytics_page_link="Data analytics page link>//i[contains(@class,'data-analytics')]";
	public static String Data_analytics_text="Data Analytics text>(//i[contains(@class,'data-analytics')]//following::h5)[1]";
	public static String Data_analytics_desc="Data Analytics Description>(//i[contains(@class,'data-analytics')]//following::p)[1]";
	public static String Help_Doc_dataAnalytics="Help Document img in Data Analytics>//a[@href='https://help.sedge.ai/Data%20analytics.html#']";
	public static String Video_tutorial_dataAnalytics="Video Tutorials img in Data Analytics>(//i[contains(@class,'data-analytics')]//following::a[@mattooltip='Video Tutorial'])[1]";
	public static String dashboard_dataAnalytics="Dashboard img in data Analytics>(//i[contains(@class,'data-analytics')]//following::a[@mattooltip='Published Dashboard'])[1]";
	public static String Help_doc_TimeSeries="Help Document img in Time Seried>(//i[contains(@class,'time-series')]//following::a[@mattooltip='Help Documentation'])[1]";
	public static String Help_doc_OCR="Help Document img in OCR>(//i[contains(@class,'ocr')]//following::a[@mattooltip='Help Documentation'])[1]";
	
	public static String Text_Analytics="Text Analytics>//i[contains(@class,'text-analytics')]";
	public static String Text_Analytics_text="Text Analytics text>(//i[contains(@class,'text-analytics')]//following::h5)[1]";
	public static String Text_Analytics_desc="Text Analytics Description>(//i[contains(@class,'text-analytics')]//following::p)[1]";
	public static String Time_series="Time Series>//i[contains(@class,'time-series')]";
	public static String Time_series_text="Time Series text>(//i[contains(@class,'time-series')]//following::h5)[1]";
	public static String Time_series_desc="Time series description>(//i[contains(@class,'time-series')]//following::p)[1]";
	public static String OCR="OCR>//i[contains(@class,'ocr')]";
	public static String OCR_text="OCR_text>(//i[contains(@class,'ocr')]//following::h5)[1]";
	public static String OCR_desc="OCR Description>(//i[contains(@class,'ocr')]//following::p)[1]";
	
	public static String OcrpageInput="Ocr page Input>//span[text()='INPUT FILE']";
	public static String move="Move>//label[@for='slider-input']";
	public static String OCR_="OCR_>//span[text()='OCR']";
	public static String textarea="textArea>//textarea[@id='outputArea']";
	
	public static String Create_project="Create Project>//img[contains(@src,'sort')]//following::button[1]";//span[text()='Create Project']";
	public static String Create_project_text="Create Project text>//div[contains(@id,'cdk-overlay-')]//div";
	public static String file_upload_page="File Upload page>//div[contains(@class,'datasource-file-upload')]";
	public static String upload_your_file="Upload your file option>//div[contains(@class,'title') and text()='Upload your file']";
	public static String DB_connection="DB Connection option>//div[contains(@class,'title') and text()='DB Connection']";
	public static String filetype_value="Default file type >//div[contains(@class,'select-value')]//span";
	public static String default_delimeter="Default Delimeter value>(//*[contains(@class,'radio-checked')]//input)//following::div[1]";
	public static String AddFiles="Add Files >//div[contains(@class,'select-value')]//following::button";
	public static String DataSetTable="Dataset Table Loaded>//div[@role='grid']";
	
	public static String fileUploaded_3="File Uploaded alert3>//*[contains(text(),'Numerical columns with exactly two unique values are treated as Categorical')]";
	public static String fileUploaded_2="File Uploaded alert2>//*[contains(text(),'In the column names Spaces are replaced with an underscore and Special characters are replaced with their short key-words.')]";
	public static String fileUploaded_1="File Uploaded alert1>//*[contains(text(),'File uploaded successfully')]";
    public static String Statistics_icon="Statistics Options>//i[contains(@class,'statistics')]";
    public static String Visual_icon="Visual Analytics Option>//i[contains(@class,'visual')]";
    public static String visual_Analytics="Visual Analytics>//*[contains(text(),'Visual Analytics')]";
    public static String predictive_analytics="Predictive analytics option>//i[contains(@class,'predictions')]";
    public static String Preview="Preview>//i[contains(@class,'analysis')]";
    public static String DashPro_Option="DashPro Option>//a/span[text()='Dash Pro']";
    
    public static String targetNotSelectError="Target not select error>//span[text()=' Kindly choose target in profiling page']";
	public static String closeTargeterror="Close target error>(//span[text()=' Kindly choose target in profiling page']//following::i)[1]";
	//new
	public static String DefaultSelectedtarget="Default Selected Target>//mat-select[@formcontrolname='selectedtarget']//span[contains(@class,'mat-select-value-text')]";
	//new
	
	public static String project_1="Project_1>//span[contains(text(),'customer_churn_analysis')]";
	public static String FileType_dropdown="FileType dropdown>//mat-select[@role='listbox']";
	public static String ColumnDelimetes="ColoumnDelimeters>//span[text()=' Column Delimiters']";
	public static String Upload_Btn="Upload Button>//span[text()='Upload ']";
	public static String FileName_text="Uploaded File Name>(//img[@alt='File']//following::span)[1]";
	public static String upload_Success="Uploaded Successfully>//*[contains(text(),'File uploaded successfully')]";
	public static String upload_wait="Uploading wait>//*[contains(text(),'Please wait while processing your file')]";
	public static String Loading="Loading>//*[name()='circle' and @r='45']";
	public static String Loading1="Loading>//*[name()='circle']";
	public static String Preview_text="Preview text>//div[text()='Preview']";
	public static String RPE_Loading="RPE Loading>//*[@id='RPE' and contains(@class,'Loading')]";
	
    public static String Preview_option="Preview option>(//span[contains(@class,'menu') and text()='Preview'])[2]";
    public static String Sampling_option="Sampling option>//span[contains(@class,'menu') and text()='Sampling']";
    public static String GDPR_option="GDPR option>//span[contains(@class,'menu') and text()='GDPR']";
    public static String ProfilingPage="Profiling Page>//div[text()='Profiling']";
    public static String target="Target>//a[text()='Target']";
    public static String sampling="Sampling>//a[text()='Sampling']";
    public static String dataProtection="Data Protection>//a[contains(text(),'Data protection')]";
    public static String machineLearnig="MachineLearning>//a[contains(text(),'Machine learning')]";
    public static String statisticalTest="Statistical Test>//span[text()='Statistical Test']";
    public static String statisctics="Statistics>(//span[text()='Statistics'])[2]";
    public static String accessible="Element Accessible>//ul[contains(@class,'hover')]";
    public static String statistics_page="Statistics Page>//label[text()='Statistics ']";
    public static String StatisticalTestPage="Statistical Test Page>//div[text()='Statistical Test']";
    public static String DashProPage="DashProPage>//div[text()='Dash Pro']";
    public static String PredectivePage="Predective Analytics Page>//div[text()='Predictive Analytics']";
    public static String defaultTab1="Default tab1>//a[text()='Tab1']";
    public static String ADDTabPlus="Add Tab + >//a[text()='+']";
    public static String Add_widget_center="Add_widget center>//div[@mattooltip='Add Widget']";
    public static String firstTab="First tab>(//a[@data-toggle='tooltip'])[1]";
    public static String FirstTabInput="FirstTab Input>(//a[@data-toggle='tooltip'])[1]//ancestor::li/descendant::input[@type='text']";
    public static String FirstTabLink="Firsttab Link>(//a[@data-toggle='tooltip'])[1]//ancestor::li";
    public static String Tab3create="Tab3 create button>(//a[@data-toggle='tooltip'])[3]";
    public static String ThirdTab="ThirdTab>(//a[@data-toggle='tooltip'])[3]//ancestor::li//input";
    public static String newlyAddedTab="NewlyAddedTab>//li[@id='newtabtobeadded']//input";
    public static String SecondTabLink="Second Lab Link>(//a[@data-toggle='tooltip'])[2]//ancestor::li";
    public static String ADD_widget_rightTop="Add Widget right corner>//button[@mattooltip='Widget']";
    public static String WidgetPanel="WidgetPanel>//div[@class='RPE_chartSelect']";
    public static String newTab="New tab>//a[@data-original-title='Tab']";
    public static String publicDashboard="Public Dashboard Icon>//a[@mattooltip='Published Dashboard']";
    public static String GlobalFilter="Global Filter>//a[@mattooltip='Global Filter']";
    public static String ThemeList="Theme List div>//div[@id='RPE_themeList_div']";
    public static String FilterSec="Filter Accordian>//div[@id='filterWidgetPanel']";
    public static String WidgetSec="Widget Accordian>//h3[@aria-controls='RPE_InputPanel']//div[text()='Widget']";
    
    public static String TargetDropDown="TargetDropDown>//mat-label[text()='Target variable']";
    public static String search_dropdown="Search in Target dropdown>//input[@placeholder='Search']";
    public static String dropdown_expand="Dropdown Expand>(//div[contains(@class,'cdk-overlay-pane')]//div//div)[1]";
    public static String dropdownText="Dropdown popup text>//*[contains(@class,'mat-tooltip-panel')]//div";
    public static String Date_Option_dropdown="Date option in dropdown>(//span[@class='mat-option-text']//img[contains(@src,'Date')])[1]";
    public static String Date_target_error="Date Target error>//span[text()='Date column cannot be selected as target']";
    public static String text_option="Text option>(//span[contains(@class,'ml') and contains(text(),'[')])[1]";
    public static String Unique_200_error="Unique value more than 200 error>//span[text()=' Kindly select column with unique class less than or equal to 200 as a target']";
    public static String Unique_200_error_Close="Unique value more than 200 error close>(//span[text()=' Kindly select column with unique class less than or equal to 200 as a target']//following::i)[1]";
    public static String categorical="Categorical>(//span[@class='mat-option-text']//img[contains(@src,'Categorical')])[1]";
    public static String Numerical_option="Numerical option>(//span[@class='mat-option-text']//img[contains(@src,'Numerical')])[1]";
    public static String Text_Option="Text Option>(//span[@class='mat-option-text']//img[contains(@src,'Text')])[1]";
    public static String target_Succes="Target Success popup>//span[contains(text(),'Target added successfully')]";
    public static String target_Success_popupClose="Target Success Pop up close>(//span[text()=' Target added successfully']//following::i)[1]";
    public static String textError="Text Option error>//span[text()='Text column cannot be selected as target']";
    
	public static String DataExplorer="DataExplorer>//i[contains(@class,'data-explorer')]";
	public static String Data_analysis_projects="Preview text>//label[text()='Data analysis projects']";
	public static String select_project="Select project>//td[@role='gridcell']//following::span[contains(text(),'automation_requirement')]";
	public static String deleteButton="Delete Button>(//span[text()='Upload Data']//following::button)[1]";
	public static String Delete_Confirm_popup="Delete confirm popup>//h3[text()='Confirmation']";
	public static String delete_Yes="Delete Yes Button>//span[text()='Yes']";
	public static String deleteSuccess="Delete Success>//*[contains(text(),'File(s) deleted successfully')]";
	
	public static String Sampling="Sampling>//mat-step-header[@role='tab']//following::span[text()='Sampling']";
	public static String LoadTable="Table Loaded>(//div[@role='columnheader']//div[@ref='eHeaderCompWrapper'])[1]";//(//span[@role='columnheader'])[1]"; Xpath changed
    
    public static String targetDrop="target dropdown>(//div[contains(@class,'mat-select-arrow-wrapper')])[1]";//(//div[@class='mat-select-arrow-wrapper'])[1]"; Xpath changed...
    public static String TargetSelect_1="TargetSelect1>(//mat-label[text()='Target variable']//following::span[@class='mat-option-text'])[1]";
    public static String TargetSelect_2="TargetSelect2>(//mat-label[text()='Target variable']//following::span[@class='mat-option-text'])[2]";
    public static String Target="Target>//a[@id='Target']";
   
    public static String CategoricalValues="Categorical Value>//span[@class='mat-option-text']//img[contains(@src,'Categorical')]//following::span[1]";
    public static String NumericalValues="NumericalValue>//span[@class='mat-option-text']//img[contains(@src,'Numerical')]//following::span[1]";
    public static String profile="Profile>(//img[@src='./assets/images/icon/User.png'])[1]";
    public static String Logout="Logout>//a[text()='SIGN OUT']";
    
    // BAR WIDGET TEST CASES LOCATORS
    public static String WidgetText="Widget Text>//div[contains(@id,'cdk-overlay-')]//div";
    public static String Table_widget="Table Widget>//div[@mattooltip='Table']//i";
    public static String Pivot_widget="Pivot Widget>//div[@mattooltip='Pivot']//i";
    public static String Bar_widget="Bar Widget>//div[@mattooltip='Bar']//i";
    public static String Stacked_Bar_widget="Stacked Bar Widget>//div[@mattooltip='Stacked Bar']//i";
    public static String Grouped_Bar_widget="Grouped Bar Widget>//div[@mattooltip='Grouped Bar']//i";
    public static String Coloumn_widget="Column Widget>//div[@mattooltip='Column']//i";
    public static String Stacked_Column_widget="Stacked Column Widget>//div[@mattooltip='Stacked Column']//i";
    public static String Grouped_Column_widget="Grouped Column Widget>//div[@mattooltip='Grouped Column']//i";
    public static String Pie_widget="Pie Widget>//div[@mattooltip='Pie']//i";
    public static String Donut_widget="Donut Widget>//div[@mattooltip='Donut']//i";
    public static String SemiCircle_widget="Semi Circle Widget>//div[@mattooltip='semi circle']//i";
    public static String SunBurst_widget="Sun Burst Widget>//div[@mattooltip='Sun burst']//i";
    public static String WaterFall_widget="Water Fall Widget>//div[@mattooltip='Water Fall']//i";
    public static String Network_widget="Network Widget>//div[@mattooltip='Network']//i";
    public static String Line_widget="Line Widget>//div[@mattooltip='Line']//i";
    public static String Area_widget="Area Widget>//div[@mattooltip='Area']//i";
    public static String Gantt_widget="Gantt Widget>//div[@mattooltip='Gantt']//i";
    public static String Scatter_widget="Scatter Widget>//div[@mattooltip='Scatter']//i";
    public static String Dumbel_plot_widget="Dumbbell Plot Widget >//div[@mattooltip='Dumbbell Plot']//i";
    public static String Tree_map_widget="Tree Map Widget>//div[@mattooltip='Tree Map']//i";
    public static String HeatMap_Legend_widget="Heat Map Legend Widget>//div[@mattooltip='Heat Map Legend']//i";
    public static String GroupandSorted_widget="Group And Sorted Widget>//div[@mattooltip='Grouped and Sorted']//i";
    public static String Multiple_Axis_widget="Multiple Axis Widget>//div[@mattooltip='Multiple Axis']//i";
    public static String Radar_Line_widget="Radar Line Widget>//div[@mattooltip='Radar Line']//i";
    public static String Zoomable_Bubble_widget="Zoomable Bubble Widget>//div[@mattooltip='Zoomable Bubble']//i";
    public static String Time_line_widget="Time line Widget>//div[@mattooltip='Time line']//i";
    public static String Population_Pyramid_widget="Population Pyramid Widget>//div[@mattooltip='Population Pyramid']//i";
    public static String Box_Plot_widget="Box Plot Widget>//div[@mattooltip='Box Plot']//i";
    public static String Text_widget="Text Widget>//div[@mattooltip='Text']//i";
    public static String BarLine_Scatter_widget="Bar Line Scattter Widget>//div[@mattooltip='Bar with Line/Scatter']//i";
    public static String Layered_Column_widget="Layered Column Widget>//div[@mattooltip='Layered Column']//i";
    public static String Bullet_widget="Bullet Widget>//div[@mattooltip='Bullet']//i";
    public static String Circose_widget="Circos Widget>//div[@mattooltip='Circos']//i";
    public static String Candle_stick_widget="Candle stick Widget>//div[@mattooltip='Candle stick']//i";
    public static String MapWith_Bubble_widget="Map with Bubble Widget>//div[@mattooltip='Map with Bubble']//i";
    public static String Word_Cloud_widget="Word Cloud Widget>//div[@mattooltip='Word Cloud']//i";
    public static String Summary_widget="Summary Widget>//div[@mattooltip='Summary']//i";
    public static String Card_widget="Card Widget>//div[@mattooltip='Card']//i";
    public static String KPI_Card_widget="KPI Card Widget>//div[@mattooltip='KPI card']//i";
    public static String Custom_Pivot_widget="Custom Pivot Widget>//div[@mattooltip='Custom pivot']//i";
    public static String Sparkline_widget="Sparkline Widget>//div[@mattooltip='Sparkline']//i";
   
    public static String Widget="Widget >//span[text()='Widgets:']";
    public static String WidgetValue="Widget Selected Value >//span[@id='RPE_selwgt']";////label[text()='Widgets:']//following::label[@id='RPE_selwgt']";
    public static String Axes="Axes>//div[@id='RPE_axis_colum_div']//a";
    public static String Axes_Expand="Axes Expand>//div[@id='RPE_axis_colum_div']//i";
    public static String Axes_Expand_Check="Axes Expand>//div[@id='RPE_axis_colum_div']//i[contains(@class,'chevron-up')]";
    public static String ApplyError1="X and Y Selection Error>//*[contains(text(),'Kindly select X axis and Y axis ')]";
    public static String ApplyError2="'Kindly check fields and select different values' Error>//*[contains(text(),'Kindly check fields and select different values')]";
    public static String ApplyButton="Apply Button>//div[@id='applychart']//button";
    public static String Y_Axis_text="Y- axis text>//span[@id='RPE_xaxis_div_label']";
    public static String X_Axis_text="X-Axis text>//span[@id='RPE_yaxis_div_label']";
    public static String Y_Axis_dropdown="Y-Axis dropdown>//span[@id='select2-RPE_categorySel-container']";
    public static String X_Axis_dropdown="X-Axis dropdown>//span[@id='select2-RPE_seriesSel-container']";
    public static String Y_Axis_dropdownResults="Y-Axis dropdown Results>//ul[@id='select2-RPE_categorySel-results']";
    public static String X_Axis_dropdownResults="X-Axis dropdown Results>//ul[@id='select2-RPE_seriesSel-results']";
    public static String aggText="Aggregation Text>//div[@id='RPE_yaxis_agg_div']//span";
    public static String groupDropdown="Group dropdown>//span[@id='select2-RPE_groupbySel-container']";
    public static String GroupText="Group text>//div[@id='RPE_groupby_div']//*[text()='Group']";
    public static String GroupDropdownExpand="GroupDropdown expand>//ul[@id='select2-RPE_groupbySel-results']";
    public static String yearMonthDate="Year Month Date>//li[contains(@title,'Year-Month-Day (')]";
    public static String yearMonth="Year-Month>//li[contains(@title,'Year-Month (')]";
    public static String ListSelected="List Selected>//li[@aria-selected='true']";
    public static String listSelectedText1="List Selected Text>//li[@aria-selected='true']//div";
    public static String ListSelectedText="ListSelected Text>//li[@aria-selected='true']//span";
    public static String ListSelectedText2="List Selected Text>//li[@aria-selected='true']//span[2]";
    public static String CategoricalImg="Categorical Image>(//img[@src='./assets/images/Categorical.svg'])[1]";
    public static String NumericalImg="Numerical Image>(//img[@src='./assets/images/Numerical.svg'])[1]";
    public static String DateImg="Date Img>(//img[@src='./assets/images/Date.svg'])[1]";
    public static String TextImg="Text Img>(//img[@src='./assets/images/Text.svg'])[1]";
    
    // new smoke
    public static String dataTypeImages="Data type image>//ul[contains(@id,'results')]//li//img";
    public static String AvailableList="Available Column Values>//ul[contains(@id,'results')]//li";
    public static String CategoricalColumnAxisDropdown="Categorical Column in axes dropdown>(//ul//img[@src='./assets/images/Categorical.svg']//ancestor::div[1])[1]";
    public static String TextColumnAxisDropdown="Text Column in axes dropdown>(//ul//img[@src='./assets/images/Text.svg']//ancestor::div[1])[1]";
    public static String NoResultsFound="No result Found>//ul/li[text()='No results found']";
    public static String FirstSearchedvalue="First searched Value>//li[contains(@class,'results')][1]//div[@title]";
    public static String SelectOption="Select >//ul//span[text()='Select']";
    public static String NumericalColumnOption="Numerical Option>(//ul//img[@src='./assets/images/Numerical.svg']//ancestor::div[1])[1]";
    //new smoke
    //#ddd
    
    public static String HighlightTextElement="Highlight text in Blue Color>//li[contains(@class,'highlighted')]//span";
    public static String FirstDisplayedList="First Displayed List>(//ul[@id='select2-RPE_ChartFontFamily-results']//li)[1]";
    public static String SecondValue="Second Value in the dropdown>//li[contains(@class,'results') and not(contains(@style,'display'))][2]";
    public static String ThirdValue="Third value in the dropdown>//li[contains(@class,'results') and not(contains(@style,'display'))][3]";
    public static String fourthValue="Fourth value in the dropdown>//li[contains(@class,'results') and not(contains(@style,'display'))][4]";
    public static String select="Select option>//li[contains(@class,'results')]//span[text()='Select']";
    public static String showResult="Show Results dropdown>//select[@id='RPE_showRecords']";
    public static String All="All>//option[@value='All']";
    public static String Limit="Limit>//option[@value='Limit']";
    public static String allt="text>//div[@class='RPE_acc_control d-flex']";
    public static String showRecordType="Show Record Type dropdown>//select[@class='w-25 mr-2' and @id='RPE_showRecordType']";
    public static String Top1="Top1>//select[@id='RPE_showRecordType']//option[@value='top']";
    public static String Bottom1="Bottom>//select[@id='RPE_showRecordType']//option[@value='bottom']";
    public static String Y_SelectedValue="Y-Axis Selected value>//span[@id='select2-RPE_categorySel-container']";
    public static String X_SelectedValue="X-Axis Selected value>//span[@id='select2-RPE_seriesSel-container']";
    public static String aggregation="Aggregation dropdown>//select[@id='RPE_selectAgg']";
    public static String sortType="Sort type>//select[@id='RPE_sortType']";
    public static String sortBy="Sort By>//span[@aria-labelledby='select2-RPE_quickSortBy-container']";
    public static String quickSortBytext="Sort By text>//span[@aria-labelledby='select2-RPE_quickSortBy-container']";
    public static String fieldSortBytext="FieldSortBy text>//span[@aria-labelledby='select2-RPE_sortBy-container']";
    public static String fieldSortBytext1="FieldSortBy text>//span[@aria-labelledby='select2-RPE_sortBy-container']//span";   
    public static String sortBy1="Sort By>//span[@aria-labelledby='select2-RPE_sortBy-container']";
    public static String sortByDropdownExpand="SortBy dropdown expand>//span[contains(@class,'select2-dropdown')]";
    public static String sortByValues="OuickSortBy Values>//ul[@id='select2-RPE_quickSortBy-results']//li";
    public static String xvalueQuicksortBy="QuickSortby Xvalue>(//ul[@id='select2-RPE_quickSortBy-results']//li)[3]";
    public static String uniqueValue="Unique>//li//span[contains(text(),' (')]";
//                                                               select2-RPE_sortBy-results
    public static String sortByValues1=" Field SortBy Values>//ul[@id='select2-RPE_sortBy-results']//li";
    public static String QuickSort="QuickSort>//option[@value='quick_sort']";
    public static String FieldSort="FieldSort>//option[@value='field_sort']";
    public static String Cat_agg_fieldSort="Categorical Aggregation in Fieldsort>(//img[contains(@src, 'Categorical')])//ancestor::li/descendant::select[1]";
    public static String Num_agg_fieldSort="Numerical Aggregation in Fieldsort>(//img[contains(@src, 'Numerical')])//ancestor::li/descendant::select[1]";
    public static String Num_agg_fieldSortValue="Default value for Numerical Agg in Fieldsort>((//img[contains(@src, 'Numerical')])//ancestor::li/descendant::select[1])";//((//img[contains(@src, 'Numerical')])[1]//ancestor::li/descendant::select[1])//option[@selected]";
    public static String Cate_agg_fieldSortValue="Default value for Categorical Agg in Fieldsort>((//img[contains(@src, 'Categorical')])//ancestor::li/descendant::select)[1]";//((//img[contains(@src, 'Categorical')])[1]//ancestor::li/descendant::select[1])//option[@selected]";
    
    public static String sumDisabledFieldsortCate="Sum Disabled>((//img[contains(@src, 'Categorical')])//ancestor::li/descendant::select[1])//option[@value='sum' and @disabled]";
    public static String countDisabledFieldsortCate="Count Disabled>((//img[contains(@src, 'Categorical')])//ancestor::li/descendant::select[1])//option[@value='count' and @disabled]";
    public static String AvgDisabledFieldsortCate="Average Disabled>((//img[contains(@src, 'Categorical')])//ancestor::li/descendant::select[1])//option[@value='mean' and @disabled]";
    public static String minDisabledFieldsortCate="Minimun Disabled>((//img[contains(@src, 'Categorical')])//ancestor::li/descendant::select[1])//option[@value='min' and @disabled]";
    public static String maxDisabledFieldsortCate="Maximum Disabled>((//img[contains(@src, 'Categorical')])//ancestor::li/descendant::select[1])//option[@value='max' and @disabled]";
    public static String uniqueDisabledFieldsortCate="Unique Disabled>((//img[contains(@src, 'Categorical')])//ancestor::li/descendant::select[1])//option[@value='nunique' and @disabled]";
    
    public static String sumDisabledFieldsortNum="Sum Disabled>((//img[contains(@src, 'Numerical')])//ancestor::li/descendant::select[1])//option[@value='sum' and @disabled]";
    public static String countDisabledFieldsortNum="Count Disabled>((//img[contains(@src, 'Numerical')])//ancestor::li/descendant::select[1])//option[@value='count' and @disabled]";
    public static String AvgDisabledFieldsortNum="Average Disabled>((//img[contains(@src, 'Numerical')])//ancestor::li/descendant::select[1])//option[@value='mean' and @disabled]";
    public static String minDisabledFieldsortNum="Minimun Disabled>((//img[contains(@src, 'Numerical')])//ancestor::li/descendant::select[1])//option[@value='min' and @disabled]";
    public static String maxDisabledFieldsortNum="Maximum Disabled>((//img[contains(@src, 'Numerical')])//ancestor::li/descendant::select[1])//option[@value='max' and @disabled]";
    public static String uniqueDisabledFieldsortNum="Unique Disabled>((//img[contains(@src, 'Numerical')])//ancestor::li/descendant::select[1])//option[@value='nunique' and @disabled]";
    
    public static String secondElementFieldSort="Second element in field sort>(((//img[contains(@src, 'Categorical')])[2]//ancestor::li)//div)[3]";
    //
    
    public static String categarical1="Categorical value 2>(//img[contains(@src,'Categorical')]//following::span[1])[2]";
    public static String categarical2="Categorical value 3>(//img[contains(@src,'Categorical')]//following::span[1])[3]";
    public static String categoricalFirst="Categorical first>(//img[contains(@src,'Categorical')]//following::span[1])[1]";
    public static String numerical1="Numerical>(//img[contains(@src,'Numerical')]//following::span[1])[1]";
    public static String selectDateValue="Date Value>(//img[contains(@src,'Date')]//following::span[1])[1]";
    
    public static String sumDisabled="Sum Disabled>//option[@value='sum' and @disabled]";
    public static String AvgDisabled="Average Disabled>//option[@value='mean' and @disabled]";
    public static String minDisabled="Minimun Disabled>//option[@value='min' and @disabled]";
    public static String maxDisabled="Maximum Disabled>//option[@value='max' and @disabled]";
    public static String uniqueDisabled="unique Disabled>//option[@value='nunique' and @disabled]";
    public static String countDisabled="Count Disabled>//option[@value='count' and @disabled]";
    public static String limitInput="Limit input>//input[@id='RPE_Limit']";
    public static String Limit_Error="Limit Error>//*[text()=' Kindly provide the limit']";
    public static String sortError="SortError>//*[text()='Kindly select any column to perform sort']";
   
    //new Smoke
    public static String Sum="Sum in aggregation>//select[@id='RPE_selectAgg2']//option[text()='Sum']";
    public static String Count="Count in aggregation>//select[@id='RPE_selectAgg2']//option[text()='Count']";
    public static String Average="Average in aggregation>//select[@id='RPE_selectAgg2']//option[text()='Average']";
    public static String Min="Min in aggregation>//select[@id='RPE_selectAgg2']//option[text()='Min']";
    public static String Max="Max in aggregation>//select[@id='RPE_selectAgg2']//option[text()='Max']";
    public static String Unique="Unique in aggregation>//select[@id='RPE_selectAgg2']//option[text()='Unique']";
    public static String inputFieldSort="Input Field in Field Sort>//span[contains(@class,'open')]//input[@class='select2-search__field']";
    public static String ListFieldsort="List in Field Sort>//img[@src][1]//ancestor::li/descendant::div[@title]";
    public static String ListFieldSection="Lists in Field Sort>//ul[@id='select2-RPE_sortBy-results']";
    public static String FirstField="First Field>(//img[@src][1]//ancestor::li/descendant::div[@title])[1]";
    public static String sortedInput="Sort Input>//span[@id='select2-RPE_sortBy-container']";
    //new Smoke
    
    //Chart                           
    public static String Chart="Chart>//div[@id='RPE_Preview']//*[@aria-label='Chart' and @role='region']";
    public static String Y_Value="Y Value in the Chart>(//div[@id='RPE_Preview']//*[@font-family or @font-size]//*[name()='g' and @fill]//*[name()='tspan'])[1]";//(//*[name()='g' and @id]//*[name()='tspan'])[1]";
    public static String X_Value="X value in the Chart>(//div[@id='RPE_Preview']//*[@font-family or @font-size]//*[name()='g' and @fill and not(@font-size)]//*[name()='tspan'])[2]";//(//*[name()='g' and @id and @fill]//*[name()='tspan'])[2]";//(//*[name()='g' and @id]//*[name()='tspan'])[2]";
    public static String X_ValueNew="X value in the Chart>(//div[@id='RPE_Preview']//*[name()='g' and @id and @fill]//*[name()='tspan'])[1]";
    public static String X_Chart_Value="X Value in chart>(//div[@id='RPE_Preview']//*[name()='g' and @id and @fill and not(@font-size)]//*[name()='tspan'])[2]";
    public static String chartBars="Charts >//div[@id='RPE_Preview']//*[name()='g' and contains(@role,'item')]";
    public static String chartBar1="ChartBar1>//div[@id='RPE_Preview']//*[name()='g' and contains(@role,'item') and not(contains(@display,'none'))][1]";
    public static String chartBar2="ChartBar2>//div[@id='RPE_Preview']//*[name()='g' and contains(@role,'item') and not(contains(@display,'none'))][2]";
 
    public static String ChartGraph="Chart graph>//input[@id='RPE_WidgetName']//following::*[@aria-label='Chart']";
   
    //                                     
    //*[@role='menuitem' and @focusable='true']";
    public static String countValue="Count Value>(//*[name()='tspan' and contains(text(),'Count')])[2]";
    public static String AscDes="Ascending or Descending>//button[contains(@class,'display-none') and @value]";
    public static String AscDescButton="Ascending Descending button>//div[@id='RPE_sortAscli']";//(//div[@id='RPE_sortAscli']//span)[1]";
    public static String minimize="Minimize Chart>//*[name()='g' and @role='button' and @opacity='1']";
    public static String groupValuesinChart="Group Values in chart>//*[name()='g' and @fill and @aria-label]//*[name()='tspan']";
    
    //Axis Title
    public static String AxisTitle="AxesTitle>//div[@id='RPE_chart_title_div']//a";
    public static String AxisTitleExpand="Axes Title Expand>//div[@id='RPE_chart_title_div']//i";
    public static String X_Title_text="X Title text>//div[contains(@class,'RPE_Xtitle')]//label";
    public static String X_Title_input="X Title Input>//input[@id='RPE_Xtitle']";
    public static String Y_Title_text="Y Title text>//input[@id='RPE_Ytitle']//ancestor::td/descendant::label";
    public static String Y_Title_input="Y Title Input>//input[@id='RPE_Ytitle']";
    public static String fontFamilyText="Font family text>//select[@id='RPE_ChartAxisFontFamily']//ancestor::td/descendant::label";
    public static String fontFamily_dropdown="Font Family dropdown>//span[@id='select2-RPE_ChartAxisFontFamily-container']";
    public static String fontFamily_DropdownExpand="Font family Dropdown expand>//ul[@id='select2-RPE_ChartAxisFontFamily-results']";
    public static String fontFamilyResults="Font family results>//ul[@id='select2-RPE_ChartAxisFontFamily-results']//li";
    public static String fontFamilyFirstResult="Font Family first resut>(//ul[contains(@id,'FontFamily-results')]//li)[1]";
    public static String titleFontSize="Title Font Size text>//select[@id='RPE_ChartTitleFontSize']//ancestor::td/descendant::label";
    public static String titleFontSizeDropdown="Title Font Size Dropdown>//select[@id='RPE_ChartTitleFontSize']";
    public static String X_axisFontSizeDropdown="X Axis Font Size Dropdown>//select[@id='RPE_ChartLabelFontSize']";
    public static String X_axisFontSizeText="X axis Font Size text>//select[@id='RPE_ChartLabelFontSize']//ancestor::td/descendant::label";
    public static String Y_axisFontSizeText="Y axis Font Size text>//select[@id='RPE_ChartLabelFontSize1']//ancestor::td/descendant::label";
    public static String Y_axisFontSizeDropdown="Y axis Font Size Dropdown>//select[@id='RPE_ChartLabelFontSize1']";
    public static String X_RotationText="X Rotation text>//output[@id='RPE_rangeoutput']//ancestor::td/descendant::span";
    public static String X_RotationOutputValue="X Rotation Output field>//output[@id='RPE_rangeoutput']";
    public static String X_RotationInputSlider="X Rotation Input>//input[@id='RPE_rotation']";
    public static String Y_RotationText="Y Rotation text>//output[@id='RPE_rangeoutput2']//ancestor::td/descendant::span";
    public static String Y_RotationOutputValue="Y_Rotation Output field>//output[@id='RPE_rangeoutput2']";
    public static String Y_RotationInputSlider="Y Rotation Input field>//input[@id='RPE_rotation2']";
    public static String switchSliderText="'Start Axis at 0' text>(//div[@id='RPE_cFMin']//label)[1]";
    public static String switchSlider="'Start Axis at 0' toggle>//input[@id='RPE_EnableAxisMin']//following::span[1]";//(//div[@id='RPE_cFMin']//label)//span";
    public static String switchSliderInput="'Start Axis at 0' toggle>//input[@id='RPE_EnableAxisMin']";
    public static String HighlightedFontFamily="Highlighted Font Family text>//li[contains(@class,'highlighted')]//div";
    public static String Y_AxisLabel_chart="Y Axis Label in chart>(//div[@id='RPE_Preview']//*[name()='g' and @transform and @aria-label])[2]";//(//*[name()='g' and @transform and @aria-label]//*[name()='tspan'])[2]";//(//*[name()='g' and @transform='translate(10,0)']//*[name()='g' and @fill])[2]";
    public static String X_AxisLabel_chart="X Axis Label in chart>((//*[name()='g' and @font-family])[2]//*[name()='g' and @font-size and @transform])[2]";
    public static String X_AxisLabel_chartNew="X Axis Label in chart>((//div[@id='RPE_Preview']//*[name()='g' and @font-family])[2]//*[name()='g' and @font-size and @transform])[1]";//((//*[name()='g' and @font-family])[2]//*[name()='g' and @font-size and @transform])[1]";
    public static String X_AxisLabel_chart_1="X Axis Label in chart>((//div[@id='RPE_Preview']//*[name()='g' and @aria-hidden and @font-family])[2]//*[name()='tspan'])[4]";//4 changed into 1
    public static String Y_AxisLabel_chart_1="Y Axis Label in chart>(//*[name()='g' and @transform and @aria-label]//*[name()='tspan'])[2]";
    public static String Y_AxisLabel_chart_1new="Y Axis Label in chart>(//div[@id='RPE_Preview']//*[name()='g' and @transform]/*[name()='g']/*[@font-size and @aria-label and not(@display)])[2]";
    public static String Y_AxisLabel_chart_Full="Y Axis Label Values in chart>//div[@id='RPE_Preview']//*[name()='g' and @transform and @aria-label]//*[name()='tspan']";
    public static String Y_AxisLabel_chart_Values="Y Axis Label Values in chart>(//div[@id='RPE_Preview']//*[name()='g' and @transform]/*[name()='g']/*[@font-size and @aria-label and not(@display)])";
    public static String dropdownInputsearchBox="Search Input in dropdown>//span[contains(@class,'open')]//input[@type='search']";
    public static String Column_Y_Labels_Chart="Y Lable Values Column Chart>(//div[@id='RPE_Preview']//*[@font-family and @aria-hidden]//*[name()='g' and @transform]/*[name()='g']/*[@font-size and not(@aria-label) and not(@display)])";
    public static String Column_X_Labels_Chart="X Lable Values Column Chart>((//div[@id='RPE_Preview']//*[name()='g' and @aria-hidden and @font-family])[2]//*[name()='tspan'])[2]";

    // Chart Title Test Cases
    public static String chartTitle="ChartTitle>//div[@id='RPE_widget_header_div']//a";
    public static String BackgroundInput="Background Input>//input[@id='RPE_ChartHeaderBGColor']";
    public static String BackgroundInputPointer="BackgroundInput Pointer>(//input[@id='RPE_ChartHeaderBGColor']//following::div)[1]";
    public static String ColorPickerOpen="Color picker Open>//div[contains(@class,'evo-palcenter')]";
    public static String BackgroundText="Background Text>(//div[@id='RPE_widget_header_div']//following::label)[1]";//    ////input[@id='RPE_ChartHeaderBGColor']//ancestor::div[@id='RPE_widget_header_div']/descendant::label
    public static String FontColorInput="Font Color Input>//input[@id='RPE_ChartTextColor']";
    public static String FontColorInputPointer="Font Color Input Pointer>(//input[@id='RPE_ChartTextColor']//following::div)[1]";
    public static String FontColorText="FontColorText>//input[@id='RPE_ChartHeaderBGColor']//following::label[1]";
    public static String ChartFontFamilyDropdown="Font Family Input dropdown in chart title>//span[@id='select2-RPE_ChartFontFamily-container']";
    public static String ChartFontFamilyDropdownExpand="Font Family Input dropdown Opne in chart title>//ul[@id='select2-RPE_ChartFontFamily-results']";
    public static String chartFontFamilyResults="Font family Results in Chart>//ul[contains(@id,'FontFamily-results')]//li";
    public static String SearchInput_FontFamily="Search Input Font Family>//ul[@id='select2-RPE_ChartFontFamily-results']//ancestor::span/descendant::input";
    public static String ChartFontFamilytext="Font Family text in chart title>(//input[@id='RPE_ChartTextColor']//following::label)[1]";
    public static String ChartFontSizedDropdown="Font Size Input Dropdown in chart title>//select[@id='RPE_ChartFontSize']";
    public static String ChartFontSizeInput="Chart title Font Size Input>//select[@id='RPE_ChartFontSize']//ancestor::div[@class='RPE_acc_control']";
    public static String ChartFontSizeText="FontSize text in chart>(//span[@id='select2-RPE_ChartFontFamily-container']//following::label)[1]";
    public static String FontSizeResults="Font Size Results>//select[@id='RPE_ChartFontSize']//option";
    public static String ChartTitleInput="Chart title Input>//input[@id='RPE_WidgetName']";
    public static String ChartTitleExpand="ChartTitleExpand>//div[@id='RPE_widget_header_div']//i";
    public static String ThemeColor="Theme Color>//a[text()='Theme Colors']";
    public static String History="History>//a[text()='History']";
    public static String Color1="Color1>(//td[contains(@style,'background-color:')])[1]";
    public static String Color2="Color2>(//td[contains(@style,'background-color:')])[2]";
    public static String Color6="Color2>(//td[contains(@style,'background-color:')])[6]";
    public static String mouseOverColorHistory="Mouse over Color History>(//div[@class='evo-color'])[2]//span";
    public static String selectedColorHistory="Selected Color History>(//div[@class='evo-color'])[1]//span";
    public static String SaveBtn_Chart="Save Button Chart>//a[@mattooltip='Save']//i[contains(@class,'save')]";
    public static String chartSaveError1="Enter Widget Name error>//*[contains(text(),'Enter Widget Name')]";
    public static String chartSaveError2="Please Choose Chart or Table error>//*[text()='Please Choose Chart or Table']";
    public static String savedChart="Saved Chart>(//div[@data-gs-id])[1]";
    public static String SavedChartTitleInput="Saved Chart Title Input>//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//div[contains(@class,'gr-chart-header')]";
    public static String SavedChartTitleName="Saved Chart Title Name>//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//div[contains(@class,'RPE_wid_name')]";
    public static String editeChart="Edit icon in Chart>//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//i[contains(@class,'edit')]";
    public static String cancel_chart="Cancel Chart>//a[@mattooltip='Cancel']";
    public static String deteleBtn_chart="Delete button>//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//i[contains(@class,'trash')]";
    public static String copyChart="Copy icon in Chart>//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//i[contains(@class,'copy')]";
    public static String filterChart="Filter icon chart>//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//div[contains(@id,'RPE_header_filter')]//*[name()='svg']";
    public static String deleteWidgetPopup="DeleteWidgetPopup>//p[text()='Delete Widget']";
    public static String deleteWidgetDesc="'Do you want to Delete Widget?' message>//label[text()='Do you want to Delete Widget?']";
    public static String deleteConfirmButton="Delete button>//p[text()='Delete Widget']//following::span[text()='Delete']";
    public static String deleteCancelButton="Delete button>//p[text()='Delete Widget']//following::span[text()='Cancel']";

    //new 
    public static String TableView_icon="Table view icon in chart>//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//i[contains(@class,'table')]";
    public static String Alpha_asc_icon="Alpha Ascending sort icon in chart>//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//i[contains(@class,'alpha-asc')]";
    public static String Alpha_Desc_icon="Alpha Descending sort icon in chart>//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//i[contains(@class,'alpha-desc')]";
    public static String Numeric_asc_icon="Numeric Ascending sort icon in chart>//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//i[contains(@class,'numeric-asc')]";
    public static String Numeric_Desc_icon="Numeric Descending sort icon in chart>//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//i[contains(@class,'numeric-desc')]";
    public static String SortingSec="Sorting Option>//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//div[contains(@id,'RPE_sorting')]";
    
    // Chart Format locators
    public static String Chart_FormatSec="Chart Format Section>//a[@id='RPE_chart_format_div_a']";
    public static String chartFormatExpand="Chart Format Expand>(//a[@id='RPE_chart_format_div_a']//i)[1]";
    public static String ChartStyling="ChartStyling>//div[@id='RPE_format_div']//a";
    public static String ChartStyling_Expand="ChartStyling_Expnad>(//a[text()='Chart Styling ']//i)[1]";
    public static String ChartThemeText="Chart Theme text>//div[@id='RPE_cFcharttheme']//label";
    public static String ChartThemeInput="Chart Theme Input>//span[@id='select2-RPE_charttheme-container']";
    public static String ChartThemeResults="ChartThemeResults>//ul[@id='select2-RPE_charttheme-results']";
    public static String chartThemeResultList="ChartThemeResultList>//ul[@id='select2-RPE_charttheme-results']//li";
    public static String X_ScrollText="X-Scroll text>(//div[@id='RPE_cFxScroll']//label)[1]";
    public static String X_ScrollInputSlider="X Scroll Input silder>(//input[@id='RPE_xscroll']//following::span)[1]";
    public static String Y_ScrollText="Y Scroll text>(//div[@id='RPE_cFyScroll']//label)[1]";
    public static String Y_ScrollInputSlider="Y Scroll Input slider>(//input[@id='RPE_yscroll']//following::span)[1]";
    public static String Auto_ScrollText="Auto-scroll text>(//div[@id='RPE_cFautoScroll']//label)[1]";
    public static String Auto_ScrollInputSlider="Auto Scroll Input Slider>(//input[@id='RPE_autoscroll']//following::span)[1]";
    public static String EnableGridText="Enable Grid Text>(//div[@id='RPE_cFGrid']//label)[1]";
    public static String EnableGrid_InputSlider="EnableGrid InputSlider>(//input[@id='RPE_EnableGrid']//following::span)[1]";
    public static String HighlightedTheme="Highlighted Theme>//li[contains(@class,'highlighted')]//div";
    public static String chartThemeFirstResult="Font Family first resut>(//ul[contains(@id,'select2-RPE_charttheme-results')]//li)[1]";

    public static String X_Scroll_toggle="X Scroll Toggle>//input[@id='RPE_xscroll']";
    public static String Y_Scroll_toggle="Y Scroll Toggle>//input[@id='RPE_yscroll']";
    public static String AutoScroll_toggle="Auto Scroll Toggle>//input[@id='RPE_autoscroll']";
    public static String EnableGrid_toggle="Enable Grid Toggle>//input[@id='RPE_EnableGrid']";
    public static String ChartFormat_Div="Chart Format Division>//a[@id='RPE_chart_format_div_a']//following::div[1]";
    
    public static String DataLabels="DataLabels>//div[@id='RPE_datalabels_header_div']//a";
    public static String DataLabels_Expand="Datalabels Expand>//div[@id='RPE_datalabels_header_div']//i";
    public static String EnableValue_text="Enabel Value text>(//div[@id='RPE_cFlabelValue']//label)[1]";
    public static String EnableValue_Input="EnableValue Input >//input[@id='RPE_enablevalue']";
    public static String EnableValue_InputSlider="EnableValue Input Slider>(//input[@id='RPE_enablevalue']//following::span)[1]";
    public static String ValueFormat_text="ValueFormat Text>(//div[@id='RPE_cFvalueLabel']//label)[1]";
    public static String ValueFormatInput="ValueFormat Input>//select[@id='RPE_valueformat']";
    public static String Seperator_text="Seperator text>(//div[@id='RPE_Seperator']//label)[1]";
    public static String SeperatorInput="Seperator Input>//select[@id='RPE_SeperatorValue']";
    public static String ValueFontSize_text="Value Font Size text>(//div[@id='RPE_cFenableValueFontSize']//label)[1]";
    public static String ValueFontSizeInput="ValueFontSizeInput>//select[@id='RPE_enableValueFontSize']";
    public static String RoundOffValue_text="Round Off Value text>(//div[@id='RPE_RoundVal']//label)[1]";
    public static String RoundOffValueInput="Round Off Value Input>//select[@id='RPE_RoundValue']";
    public static String Position_text="Position text>(//div[@id='RPE_cFlabelPosition']//label)[1]";
    public static String PositionInput="Position Input>//select[@id='RPE_datalabelposition']";
    public static String BigNumberSuffix_text="Big Number Suffix text>(//div[@id='RPE_cFBigNumber']//label)[1]";
    public static String BigNumberInput="Bignumber Input>//input[@id='RPE_bignumber']";
    public static String BigNumberInputSlider="Bignumber Input Slider>(//input[@id='RPE_bignumber']//following::span)[1]";
    public static String ShowAsPositive_text="Show As Positive>(//div[@id='RPE_showaspositivediv']//label)[1]";
    public static String ShowPositive_Input="Show Positive Input>//input[@id='RPE_showaspositive']";
    public static String ShowPositive_InputSlider="Show Positive Input Slider>(//input[@id='RPE_showaspositive']//following::span)[1]";
    public static String ValueRotation_text="ValueRotation text>//div[@id='RPE_Value_Rotation']//label";
    public static String ValueRotation_Input="Value Rotation Input>//input[@id='RPE_rotationvalue']";
    public static String ValueRotation_Output="ValueRotation_Output>//output[@id='RPE_rangeoutputvalue']";
    public static String ValueFormat_ChartValue="Enabled chart value>(//*[name()='g' and @fill='#000000' and @stroke-opacity])//*[name()='tspan']";//(//*[name()='g' and contains(@role,'item')]//following::*[name()='g' and @fill='#000000'])[1]//*[name()='tspan']";
    public static String chartValue_Rotation="ChartValue rotation>(//div[@id='RPE_Preview']//*[@transform and not(@display='none')]/*[name()='g']/*[@font-size])[2]";//(//*[@transform and not(@display='none')]/*[name()='g']/*[@font-size]/*[name()='g']/*[name()='text'])[2]";//(//*[@transform and not(@display='none')]/*[name()='g']/*[@font-size])[1]";
    public static String Thousand_Seperator="Thousand Seperator>//select[@id='RPE_SeperatorValue']//option[@value='#,###']";
    public static String Houndred_Seperator="Houndred Seperator>//select[@id='RPE_SeperatorValue']//option[@value='#,##']";
    
    public static String ChartFormat_Others="Others in chart Format>//div[@id='RPE_others_header_div']//a";
    public static String ChartFormat_OthersExpand="Chart Format Others Expand>//div[@id='RPE_others_header_div']//i";
    public static String StatsLine_text="StatsLine text>(//div[@id='RPE_statsline']//label)[1]";
    public static String StatsLine_Input="Stats Line Input dropdown>//select[@id='RPE_statsdiv']";
    public static String statsLinePosition_text="StatsLine Position text>//div[@id='RPE_statsPosition_div']//label";
    public static String statsLinePosition_Input="StatsLine position Input>//select[@id='RPE_statsPosition']";
    public static String statsLineRoundOffText="StatsLine roundOff text>(//div[@id='RPE_statsRoundValue_div']//label)[1]";
    public static String statsLineRoundOff_Input="StatsLine RoundOff Input>//select[@id='RPE_statsRoundValue']";
    public static String statsLineColor_text="Statsline Color text>(//div[@id='RPE_statslinecolor_div']//label)[1]";
    public static String statsLineColorInput="StatsLine Color Inout>//input[@id='RPE_StatslineColor']";
    public static String Cursor_text="Cursor text>(//div[@id='RPE_cFcursor']//label)[1]";
    public static String Cursor_Input="Cursor Input>//input[@id='RPE_cursor']";
    public static String Cursor_InputClick="Cursor Input toggle>(//input[@id='RPE_cursor']//following::span)[1]";
    public static String Export_text="Export text>(//div[@id='RPE_cFexport']//label)[1]";
    public static String Export_Input="Export Input>//input[@id='RPE_export']";
    public static String Export_InputClick="Export Input toggle>(//input[@id='RPE_export']//following::span)[1]";
    public static String StatsLine_Chart="StatsLine Displayed Chart>//div[@id='RPE_Preview']//*[name()='g' and @stroke-width='2' and @fill='none']";
    public static String StatsLine_NumInput="StatsLine Number Input>//input[@id='RPE_statslin']";
    public static String StatsLine_Error="StatsLine Error>//*[text()='Kindly enter custom value for stats line']";
    public static String StatsLineRoundOff_Chart="StatsLine Value in chart>//div[@id='RPE_Preview']//*[@fill-opacity and'g' and @aria-label and not(@stroke-opacity)]//*[name()='text']";
    
    public static String ExportOption_SavedChart="Export Option in Saved Chart>(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//a[contains(@aria-label,'Export')])[1]";
    public static String ExportChartOptions="Export Chart Options>(//div[@id='RPE_Preview']//ul[@role='menubar']//li)[1]";
    public static String ExportOptionExpandList="Export Option Expand List>//div[@id='RPE_Preview']//ul[@role='menu' and @aria-expanded='true']";
    public static String Export_Image="Image Export Options>//div[@id='RPE_Preview']//ul[@role='menu' and @aria-expanded='true']//a[text()='Image']";
    public static String Export_PNG="PNG Export Options>//div[@id='RPE_Preview']//li[@role='menuitem']//a[text()='PNG']";
    public static String Export_JPG="Export JPG>//div[@id='RPE_Preview']//li[@role='menuitem']//a[text()='JPG']";
    public static String Export_SVG="Export SVG>//div[@id='RPE_Preview']//li[@role='menuitem']//a[text()='SVG']";
    
    public static String Export_Data="Data Export Option>//div[@id='RPE_Preview']//ul[@role='menu' and @aria-expanded='true']//a[text()='Data']";
    public static String Export_JSON="Export JSON>//div[@id='RPE_Preview']//li[@role='menuitem']//a[text()='JSON']";
    public static String Export_CSV="Export CSV>//div[@id='RPE_Preview']//li[@role='menuitem']//a[text()='CSV']";
    public static String Export_XLSX="Export XLSX>//div[@id='RPE_Preview']//li[@role='menuitem']//a[text()='XLSX']";
    public static String Export_HTML="Export HTML>//div[@id='RPE_Preview']//li[@role='menuitem']//a[text()='HTML']";
    
    public static String Export_Print="Print Export Option>//div[@id='RPE_Preview']//ul[@role='menu' and @aria-expanded='true']//a[text()='Print']";
    public static String MouseCursor="Mouse cursor>//div[@id='RPE_Preview']//*[name()='g' and @role='tooltip' and @opacity='1']/*[name()='g' and @fill='#000000']";
    public static String StrokeLine="StrokeLine>//div[contains(@class,'previewBlock')]//following::*[name()='g' and @stroke-width='2' and @fill='none']";
    public static String StrokeLineAbove="Stroke Line Above >//div[contains(@class,'previewBlock')]//*[name()='g' and contains(@role,'item')][1]//following::*[name()='g' and @stroke-width='2' and @fill='none']";
    public static String StrokeLineBehind="StrokeLine Behind>//div[contains(@class,'previewBlock')]//*[name()='g' and contains(@role,'item')][1]//ancestor::div[@id='RPE_Preview']//*[name()='g' and @stroke-width='2' and @fill='none']";
    public static String StrokeLineBehindNew="StrokeLine Behind>//div[@id='RPE_Preview']//*[@fill-opacity]/ancestor::*[name()='g']/*[name()='g' and @stroke-width='2' and @fill='none']";
    
    //DB Connection TestCases Locators
    public static String New_Connection="New Connection>//span[@id='connection']";
    public static String Existing_Connection="Existing Connection>//span[@id='existing']";
    public static String DB_Type_Input="Data Base Type Input>//*[@formcontrolname='dbType']";
    public static String DB_Type_Input_text="Data Base input text>//*[@formcontrolname='dbType']//following::mat-label[1]";
    public static String dropdown_Expand="Dropdown Expand>//div[contains(@class,'mat-primary')]";
    public static String HostName_Input="HostName Input>//*[@formcontrolname='hostName']";
    public static String HostName_Input_Text="HostName Input text>//*[@formcontrolname='hostName']//following::mat-label[1]";
    public static String DB_Version_Input="DB Version Input>//*[@formcontrolname='dbVersion']";
    public static String DB_Version_Input_Text="DB Version Input Text>//*[@formcontrolname='dbVersion']//following::mat-label[1]";
    public static String DB_Type_Arrow="DB Type Down Arrow>//*[@formcontrolname='dbType']//div[2]//div";
    public static String DB_PortNumber="DB port number Input>//*[@formcontrolname='portNumber']";
    public static String DB_PortNumber_Text="Port number Input Text>//*[@formcontrolname='portNumber']//following::mat-label[1]";
    public static String UserName_Input="UserName Input>//*[@formcontrolname='userName']";
    public static String UserName_Input_Text="UserName Input Text>//*[@formcontrolname='userName']//following::mat-label[1]";
    public static String Password_Input="Password Input>//*[@formcontrolname='password']";
    public static String Password_Input_Text="Password Input text>//*[@formcontrolname='password']//following::mat-label[1]";
    public static String dbURL_Input="DB URL Input>//*[@formcontrolname='dbURL']";
    public static String dbURL_Input_Text="DB URL Input text>//*[@formcontrolname='dbURL']//following::mat-label[1]";
    public static String dBClassName_Input="DB Class Name Input>//*[@formcontrolname='className']";
    public static String dBClassName_InputText="DB Class Name Input text>//*[@formcontrolname='className']//following::mat-label[1]";

    public static String Connect_btn="Connect Button>//button[@type='submit']";
    public static String connect_btn_text="Connect Button text>//button[@type='submit']//span";
    public static String Reset_Btn="Reset button>//button[@type='reset']";
    public static String Reset_Btn_text="Reset Button text>//button[@type='reset']//span";
    public static String DB_ConnectError="DB Connect Error>//*[text()=' Please verify the connection details']";
    public static String DB_ConnectionErrorText="Error text>//h6[@class='custom-notification-title']//following::span[1]";
    
    public static String DataBaseNameInput="DataBase Name Input>//*[@formcontrolname='databaseName']";//following::mat-label[1]
    public static String DataBaseNameInputText="DataBase Name Input Text>//*[@formcontrolname='databaseName']//following::mat-label[1]";
    public static String SchemaNameInput="Schema Name Input>//*[@formcontrolname='schemaName']";
    public static String SchemaNameInputText="SchemaNameInput text>//*[@formcontrolname='schemaName']//following::mat-label[1]";
    public static String ConnectionNameInput="Conection Name Input>//*[@formcontrolname='connectionName']";
    public static String ConnectionNameInputText="Connection Name Input text>//*[@formcontrolname='connectionName']//following::mat-label[1]";
    public static String SaveConnectionBtn="Save Connection Button>//*[@formcontrolname='connectionName']//following::button[@type='submit']";
    public static String SaveConnectionBtnText="Save Connection Button Text>//*[@formcontrolname='connectionName']//following::button[@type='submit']//span";
    public static String ConnectionSuccessPopup="Connection Success Popup>//*[contains(text(),'Saved Successfully')]";
    public static String Connectionfail="Connection Fail Error>//*[contains(text(),'Connection has not been saved')]";
    public static String deleteIcon_1="Delete Icon 1>(//button[@title='Delete the connection']//i)[1]";
    public static String deleteConfirmPopup="Delete Confirm Popup>//kt-delete-entity-dialog";
    public static String deleteOkButton="Delete Yes Button>//button//span[text()='Yes']";
    public static String deleteSuccessPopup="DeleteSucces>//*[contains(text(),'has been deleted')]";
    
    public static String ExistingConectionTab="Existing Conection Tab>//div[@class='existing-connection-component']";
    public static String Existing_Connection_Tab="Existing Connection Tab>//table[@aria-label='Existing connection']";
    public static String SQLEditorPage="SQL Editor Page>//div[text()='SQL Editor']";
    public static String TablesAndColumns="Tables & Columns>//span[text()='Tables & Columns']";//Xpath changed //span[text()='Organisation Hierarchy']
    public static String Organisation="Organisation Hierarchy>//span[text()='Organisation Hierarchy']";
    public static String DataBaseSections="DataBase Sections>//span[@ref='eValue']//span[contains(text(),'Databases')]";
    public static String TableSections="Table Sections>//span[@ref='eValue']//span[contains(text(),'Tables')]";
    public static String SQLGeneratorSection="SQL generator Section>//h3[contains(text(),'SQL Query Generator')]";
    public static String LanguageToSqlText="Natural language to SQL text>//span[contains(text(),'Natural language to SQL')]";
    public static String LanguageToSqlButton="Natural language to SQL Button>//label[@title='Text to sql']//button";
    public static String LanguageToSqlButton1="Natural language to SQL Button>//label[@title='Text to sql']//button";
    public static String SQLGenerateArea="SQL Query generator area>//div//codemirror";
    public static String FormateQuery="Format Query Option>//button[@mattooltip='Format Query']";
    public static String ExecuteQuery="Execute Query Option>//button[@mattooltip='Execute query']";
    public static String ClearQuery="Clear Query Option>//button[@mattooltip='Clear query']";
    public static String CommandHistory="Command History Option>//button[@mattooltip='Command history']";
    public static String ExportResult="ExportResult Option>//button[@mattooltip='Export result']";
    public static String TableLists="Table Lists>//*[@src='/assets/images/icon/table.ico']/following::span[@ref='eValue']//span";
    public static String TableList1="Table List1>(//*[@src='/assets/images/icon/table.ico']/following::span[@ref='eValue']//span)[1]";
    public static String SearchField="Search Field in SQL Editor page>//input[@aria-label='Organisation Hierarchy Filter Input']";//input[@id='quickFilter' or @placeholder='Search']";
    
    public static String SearchedTableList="SearchedTableList>//span[text()=' Tables']//ancestor::div[@ref='eContainer']//div[@row-index='3'][1]";//span[text()=' Tables']//preceding::div[@row-index='3'][1]"; Xpath changed
    public static String searchedQuery="SQL Query text>//pre[@role='presentation']";
    public static String ProjectNameInputField="ProjectNameInputField>//mat-label[contains(text(),'Project Name')]//ancestor::mat-form-field/descendant::input";
    public static String FileNameInputField="FileName Input Field>//mat-label[contains(text(),'File Name')]//ancestor::mat-form-field/descendant::input";
    public static String SaveResultButton="Save Result Button>//button[@mattooltip='Save result']";
    public static String ProjectNameErro1="Project Name error>//*[contains(text(),'Supports alphanumeric and _ only')]";
    public static String ProjectNameErro2="Project Name error>//b[contains(text(),'Project name ')]";
    public static String FileNameError="FileName Error>//b[contains(text(),'File name')]";
    public static String QueryResults="QueryResults>//button[@mattooltip='Execute query']//following::div[@ref='eCenterContainer']";
    public static String heading1="Table Heading 1>//button[@mattooltip='Execute query']//following::div[@role='columnheader'][1]";//button[@mattooltip='Execute query']//following::span[@role='columnheader'][1]"; Xpath Changed
    public static String FileNamePreviewPage="FileName In Preview Page>//span[@title]";//label
    public static String selectedTarget="selected Target>//mat-select//span//span";
    public static String TargetNamePreviewPage="Target Preview page>(//label[@title]//following::i//label)[2]";
//    public static String TargetNamePreviewPage="Target Preview page>(//div[@id='targetHighchart']//*[name()='tspan'])[1]";
    public static String TargetPanel="Target Panel>//div[@id='targetHighchart']";//div[@id='Target-panel']";
    public static String TargetPanelResultText="Target value in target panel>(//div[@id='targetHighchart']//*[name()='text']//*[name()='tspan'])[1]";
    public static String featureSection="Feature Section>//li[@id='tab-Features']";//a[@id='Features']"; //Xpath changed
    public static String featurePanel="Feature Panel>//*[@id='myGrid']//div[@ref='gridBody']";//div[@id='Features-panel']";
    public static String HighlightedTarget="Highlighted target in feature>//div[@col-id='actual_column' and contains(@style,'background-color: rgb(106, 241, 137)')]";//div[@col-id='actual_column' and contains(@style,'background-color: #6AF189')]";
    public static String featureValue1="First column in feature>(//div[@col-id='actual_column'])[2]";
    public static String featureValue2="SecondValue in feature>(//div[@col-id='actual_column'])[3]";
    public static String IgnoreIcon="IgnoreIcon>//img[@mattooltip='Ignore']";
    public static String IgnoreError="Ignore error 1>//*[text()='Target column cannot be ignored']";
    public static String Checkbox1="Checkbox>(//input[@type='checkbox'])[1]";
    public static String IgnoreSuccess="IgnoreSucces>//*[contains(text(),'Selected column has been ignored or psuedonymized')]";
    public static String statisticsSection="Statistics Section>(//ag-grid-angular[@id='myGrid'])[1]//div[@ref='eBodyViewport']";//(//ag-grid-angular[@id='myGrid'])[1]";//xpath changed
    public static String statisticsTestHead="Statistics section Head>//label[text()='Statistics ']";
    public static String DataTableSection="Data Label Section>(//ag-grid-angular[@id='myGrid'])[2]//div[@ref='eBodyViewport']";//xpath changed
    public static String DataTableText="Data Table Section Heading>//div[text()=' Data Table: ']";
    public static String AdvancesStatistics="Advanced statistics Text>//div[contains(text(),'Advanced Statistics:')]";
    public static String AdvancedStatisticsSec="Adavanced Statistics Section>//div[@id='chartContainer']";
    public static String GraphSheetScetion="Graph sheet section>//div[@id='divHighchart']";
    public static String graph="Graph in grapghsheetSection>//div[@id='divHighchart']//*[name()='svg']";
    public static String textGrpah="TextGrpah>//div[@id='divTextChart']//*[name()='svg']";
    public static String GraphSheetHeading="Grapghsheet heading>//a[contains(text(),'Graphstat')]";
    public static String Transformations="tranformation headinig>//a[contains(text(),'Transformations')]";
    public static String PreviewSectionHead="Preview headinig>//a[contains(text(),'Preview')]";
    public static String variableImportance="Variable of Importance text>//*[name()='tspan' and text()='Variable of importance ']";
    public static String variableImportSect="Variable Importance Section>//div[@id='divHighchart2']";
    public static String refreshOptionVariable="Refresh Option in Variable importance Section>//img[@title='Refresh']";
    public static String ContextmenuOptionVariable="Context option in Variable importance section>//div[@id='divHighchart2']//*[name()='g' and contains(@class,'context')]";
    public static String refreshing="Refreshing>//*[contains(text(),'Computing variable of importance wit')]";
    public static String RowsBottom="Number of Rows in bottom >//b[text()='Rows: ']";
    public static String ColumnsBottom="Number of Columns in bottom>//b[text()='Columns: ']";
    public static String PreviewHeaderCount="Header Count>//div[contains(@class,'header-container')]//div[@ref='eHeaderCompWrapper']";
    public static String SortingIconsPreview="Sorting Icons Preview>//div[contains(@class,'header-container')]//div[@ref='eHeaderCompWrapper']//span[@ref='eSortIndicator']";
    public static String HeaderRow_Features="Header row in feature page>//div[@ref='eCenterContainer']/div[contains(@class,'header-row')]";
    public static String StatisticsHeader="Statistics Header>(//div[@ref='eCenterContainer']/div[contains(@class,'header-row')])[1]";
    public static String DataTableHeader_Statistics="Data table Headers>(//div[@ref='eCenterContainer']/div[contains(@class,'header-row')])[2]";
    public static String PreviewHeader_Statistics="Preview Headers in Statistics>(//div[contains(@class,'header-container')])[3]//div[@ref='eHeaderCompWrapper']";
    public static String PreviewSorting_Statistics="Preview Sorting Icons in Statistics>(//div[contains(@class,'header-container')])[3]//div[@ref='eHeaderCompWrapper']//span[@ref='eSortIndicator']";
    
    public static String HeadersCount_feature="Headers Count Feature>//div[@ref='eCenterContainer']/div[contains(@class,'header-row')]//div[@role='columnheader']//span[@ref='eText']";//div[@ref='eCenterContainer']/div[contains(@class,'header-row')]//div[@role='columnheader']";
    public static String SortingCount_feature="Sorting Count Feature>//div[@ref='eCenterContainer']/div[contains(@class,'header-row')]//span[@ref='eSortIndicator']";
    public static String Headers_statistics="Headers statistics>(//div[@ref='eCenterContainer']/div[contains(@class,'header-row')])[1]//div[@role='columnheader']";
    public static String Sorting_Statistics="Sorting Statistics>(//div[@ref='eCenterContainer']/div[contains(@class,'header-row')])[1]//span[@ref='eSortIndicator']";
    public static String Headers_DataTable="Headers DataTable>(//div[@ref='eCenterContainer']/div[contains(@class,'header-row')])[2]//div[@role='columnheader']";
    public static String Sorting_DataTable="Sorting DataTable>(//div[@ref='eCenterContainer']/div[contains(@class,'header-row')])[2]//span[@ref='eSortIndicator']";
    public static String Sorting_Factors="Sorting Icon for Factors>//span[text()='Factors']/ancestor::div[1]/span[@ref='eSortIndicator']";
    
    public static String HideIgnoredIcon="Hide Ignored icon>(//label[@title='Hide ignored columns']//button)[1]";
    public static String SelectAllCheckbox="Select All Check box>(//div[@role='presentation']//input[@ref='eInput'])[1]";
    public static String DataTypeImages="Data Type Image in statistics>(//div[@col-id='data_type']//img)[1]";
    public static String FullScreenInStatistics="Full Screen in statistics>(//img[@alt='Full Screen'])[1]";
    public static String SearchBarStatistics="SearchBar in statistics>(//input[@id='quickFilter'])[1]";
    public static String fourthColumnValue="Fourth Column value in statistics>(//div[@role='row']//div[@col-id='actual_column'])[5]//span[@id]"; //Xpath changed
    public static String firstColumnValue="FirstColumnValue>(//div[@role='row']//div[@col-id='actual_column'])[2]//span[@id]";
    public static String CategoricalType="Categorical Type>(//img[@src='./assets/images/Categorical.svg']//ancestor::div[@role='row']/descendant::div[@col-id='actual_column'])[1]";
    public static String NumericalType="Numerical Type>(//img[@src='./assets/images/Numerical.svg']//ancestor::div[@role='row']/descendant::div[@col-id='actual_column'])[1]";
    public static String TextType="Text Type>(//img[@src='./assets/images/Text.svg']//ancestor::div[@role='row']/descendant::div[@col-id='actual_column'])[1]";
    public static String DateType="Text Type>(//img[@src='./assets/images/Date.svg']//ancestor::div[@role='row']/descendant::div[@col-id='actual_column'])[1]";
    
    public static String NumericalTab="Numerical Tab>//a[contains(text(),'Numerical') and @aria-selected='true']";
    public static String absIcon="AbsIcon>//mat-icon[@custom-data-icon='abs']";
    public static String CeilIcon="CeilIcon>//mat-icon[@custom-data-icon='ceil']";
    public static String FloorIcon="FloorIcon>//mat-icon[@custom-data-icon='flooring']";
    public static String UnitConverterIcon="UnitConverterIcon>//mat-icon[@custom-data-icon='unit-converter']";
    public static String NumHexIcon="Number to Hexa Icon>//mat-icon[@custom-data-icon='number-to-hexadecimal']";
    public static String RoundIcon="RoundIcon>//mat-icon[@custom-data-icon='round']";
    public static String NumCatIcon="NumToCatIcon>//mat-icon[@custom-data-icon='num-to-cat']";
    public static String ExtractNumIcon="ExtractNumIcon>//mat-icon[@custom-data-icon='extract-num']";

    public static String GraphSectionValue="Value displayed in Graphical Section>(//div[@id='divHighchart']//*[name()='tspan'])[1]";
    public static String DataLabelValue="Value displayed in DataLabel Section>//div[@mattooltipclass='my-custom-tooltip']"; 
    public static String searchBarInDataLabel="Search Bar in dataLabel>(//input[@id='quickFilter'])[2]";
    public static String deleteDataLabel="Delete button in Data Label>//button[@mattooltip='Delete selected row(s)']";
    public static String mergeSelectRow="Merge Select row in Data Label>//button[@mattooltip='Merge selected row(s)']";
    public static String mergeUnSelect="Merge Unselect in Data Label>//button[@mattooltip='Merge unselected row(s)']";
    public static String clearRows="Clear rows in Data Label>//button[@mattooltip='Clear row(s)']";
    public static String fullScreenData="Full Screen in DataLabel>(//img[@alt='Full Screen'])[2]";
    
    public static String ChartContextGrpah="Chart Context Menu in Graph section>//div[@id='divHighchart']//*[name()='g' and @stroke-linecap='round']";
    public static String ChartContextVariable="Chart Context Menu in Variable section>//div[@id='divHighchart2']//*[name()='g' and @stroke-linecap='round']";
    public static String ChartContextAdvanced="Chart Context menu in Advanced Sec>//div[@id='chartContainer']//*[name()='g' and @stroke-linecap='round']";
    public static String ChartContextDataLabel="Chart Context Menu in DataLabel>//div[@id='divRadialChart']//*[name()='g' and @stroke-linecap='round']";
    public static String ChartContextText="Chart Context Menu for Text>//div[@id='divcharttext']//*[name()='g' and @stroke-linecap='round']";
    
    public static String FirstColoumnDataLabel="FirstColumnInDataLabel>(//div[@col-id='value'])[2]";
    public static String deleteSuccessDataLabel="Delete Success In DataLabels>//*[contains(text(),'Factor is deleted')]";
    public static String mergeConfirmPopup="MergeConfirm Popup>//div[@class='operations-dialog']";
    public static String valueReplaceInput="Value ReplaceInput>//input[@formcontrolname='rename_value']";
    public static String ApplyBtnMerge="Apply Button in Value Replace>//button[@type='submit']";
    public static String mergeSuccessDataLabel="Merge/Unmerge Success In DataLabels>//*[contains(text(),'Factor is updated')]";
    public static String NotificationMessage="Notification Message>//h6[@class='custom-notification-title']/ancestor::div[1]/span";
    public static String OutlierDelete="Outlier delete>//img[@title='Delete outlier']";
    public static String helpDocIcon="Help Doc Icon>//button[@pochelpkey='Advancedstatistics']";
    public static String ChangeNumberBins="Change Number of Bins>//label//i[@class='flaticon2-gear']";
    public static String StackTargetVariable="Stack with Target Variable>//span[not(@mattooltip)]//button";
    public static String ShowEmptyBins="Show Empty Bin>//label[@title='Show Empty Bins']//button";
    public static String firstNumeric="FirstNumeric>(//ag-grid-angular[@id='myGridColumnDtTable']//div[@role='gridcell'])[1]";
    public static String outlierDeleteSuccess="OutLier Delete Success>//*[contains(text(),'Outliers deleted successfully')]";
    public static String OutlierDeletePopup="Outlier Delete popup>//h6[@class='custom-notification-title']/ancestor::div/span";
    public static String GridViewIcon="Grid View Icon in Data Label>//img[@alt='View Grid']";
    public static String ChartViewIcon="Chart View Icon in Data Label>//img[@alt='View Chart']";
    public static String N_Grams="N -Grams>//div[@id='divcharttext']//div[contains(text(),'N-grams')]";
    public static String RadialChartView="Radial Chart View>//div[@id='divRadialChart']//div[@dir='ltr']";
    public static String previousPage="Previous page>//li//a[@aria-label='Previous']";
    public static String nextPage="Next Page>//li//a[@aria-label='Next']";
    public static String Currentpage="Current Page>//li[@aria-current='page']//a";
    public static String Pagination="Pagination>//ul[@class='pagination']";
    public static String PaginationLists="Page Size>//ul[@class='pagination']//li";
    public static String ChangeBinsTooltiptext="Change bins tooltip text>//div[not(@role='tooltip') and text()='Change number of Bins']";
    public static String StackWithTargetVariable="Stack with Target variable tooltip text>//div[not(@role='tooltip') and text()='Stack with Target variable']";
    
    public static String FunctuionsListSec="Function List Section>//div[@class='custom-col col-left']//div[@class='list']//div/span"; //xpath changed
    public static String eyeIcon="Eye Icon in functions>(//mat-icon[@aria-label='Example home icon'])";  // Xpath changed...
    public static String searchFunction="Search bar in Function>//div[@class='custom-col col-left']//input";
    public static String LabelFunction="Label Functions>//mat-label[text()='Functions']";
    public static String ColumnSection="Column Section>//div[@class='custom-col col-right fb']";
    public static String ColumnText="Column Text>//mat-label[text()='Columns']";
    public static String searchColumn="Search in Column>//div[@class='custom-col col-right fb']//input";
    public static String HelpDocframe="HelpDoc Frame>//iframe[@src='https://help.sedge.ai/Data%20analytics.html#absolute']";
    public static String HelpDocSec="Help Doc Section in transformation>//section[@id='transformations']";//xpath changed
    public static String HelpDocSecHeading="Heading in help documentation section>//section[@id='transformations']//section[@id='absolute']//h3"; //section[@id='transformations']//section[@id='absolute'] , //section[@id='transformations']//section[@id='absolute']//pre[1]
    public static String ExpressionHistory="Expression history>//button[@mattooltip='Expression History']";
    public static String ClearButton="Clear button in transformation>//button//span[text()='Clear']";
    public static String TestButton="Test Button in transformation>//span[text()='Test']//ancestor::button[1]";//button//span[text()='Test']";
    public static String ApplyButtonTrans="Apply button in transformation>//button//span[text()='Apply']";
    public static String SecondFunction="Second Function>(//mat-card//div[@class='list']//span)[2]";
    public static String FirstFunction="First Function>(//div[@class='left-col-opt']//span)[1]";
    public static String FunctionList="FunctionList>(//mat-card//div[@class='list'])[1]";
    public static String ColumnList="ColumnList>(//mat-card//div[@class='list'])[2]";
    public static String displayedLine="Displayed Text>(//pre[@class=' CodeMirror-line ']//span)[1]";//
//    public static String displayedLine="Displayed Text>//pre[@class=' CodeMirror-line ']";//(//pre[@class=' CodeMirror-line ']//span)[1]
    public static String TransformationError="'Provide a valid input column name' error>//*[contains(text(),'Provide a valid input column name')]";
    public static String thirdColumn_Value="Third Column Value>((//mat-card//div[@class='list'])[2]//span[@mattooltipposition='left'])[3]";
    public static String fourthColumn_Value="Fourth Column Value>((//mat-card//div[@class='list'])[2]//span[@mattooltipposition='left'])[4]";
    public static String firstColumn_Value="First Column Value>((//mat-card//div[@class='list'])[2]//span[@mattooltipposition='left'])[1]";
    public static String firstColumnImage="FirstColumnImage>((//mat-card//div[@class='list'])[2]//img[@alt='loading'])[1]";
    public static String Concat_ws_Syntax="Concat ws Syntax>(//div[@id='concat-ws']//div[@class='highlight-python']//div)[1]//pre";
    public static String firstComma="First Comma>(//span[text()='concat_ws']//span[@class='cm-punctuation'])[1]";
    public static String secondComma="Second Comma>(//span[text()='concat_ws']//span[@class='cm-punctuation'])[2]";
    public static String ValidExpression="Valid Expression>//*[contains(text,'Expression is valid')]";
    public static String NumericalColumnTrans="Numerical Column in transform>(//img[@alt='loading' and contains(@src,'Numerical')])[1]";
    public static String NumericalText="Numerical Column text>(//img[@alt='loading' and contains(@src,'Numerical')]//following::span)[1]";
    public static String AsciiError="Ascii erro>//*[contains(text(),'Kindly choose a categorical column for')]";
    public static String AsciiSuccess="Ascii Success>//*[contains(text(),'Expression is valid')]";
    public static String previewTabDisplay="Preview Tab display>//div[@id='preview-stat-grid']"; //Xpath changed
    public static String PreviewTable="Tabel in preview page>//div[@id='preview-stat-grid']";
    public static String PreviewTableValue="Preview Table >//div[@id='preview-stat-grid']//div[@ref='eBodyViewport']";
    
    public static String NewColumnError="New Column error>//*[contains(text(),'already exists')]";
    public static String ExpressionList="Expression List>//h1[text()='Expression List']";
    public static String ExpressHistoryTabClose="Expression History tab close>//button//span[text()='close']";
    
    //Table Column
    public static String TableSect="Table Column section>//a[@id='RPE_table_colum_header']";
    public static String TableColumnExpand="Table Column Expand>//a[@id='RPE_table_colum_header']//i";
    public static String SelectAllToogle="Select All toggle>//input[@id='RPE_selectall']";
    public static String SelectAllToggleInput="Select All toggle>//input[@id='RPE_selectall']//following::span[contains(@class,'RPE_switchslider')][1]";
    public static String AvailableColum="Available Column List>//div[@id='RPE_AvailColumn_list']";
    public static String AvailableColumnText="Available Column text>//span[text()='Available Columns']";
    public static String TableError="Kindly select column error>//*[contains(text(),'Kindly select column')]";
    public static String TableChartError="Error in the Chart>//div[@id='RPE_Preview_validationDiv']";
    
    public static String AvailableColumnValues="Available Column Elements>//div[@id='RPE_AvailColumn_listItems']//div";
    public static String SelectedAvailableColumnValue="Selected Available ColumnValue >//div[@id='RPE_AvailColumn_listItems']//div[@selected='selected']";
    public static String FirstAvailableColumn="FirstAvailable Column>(//div[@id='RPE_AvailColumn_listItems']//div[contains(@style,'display: block')])[1]";//(//div[@id='RPE_AvailColumn_listItems']//div)[1]";
    public static String FirstAvailableColumn1="FirstAvailable Column>(//div[@id='RPE_AvailColumn_listItems']//div)[1]";
    public static String TableHeadingFirst="Table Heading First>(//div[@id='RPE_Preview']//div[@ref='eCenterContainer']//div[@role='columnheader'])[2]";
    public static String TableHeadings="Table Headings>(//div[@id='RPE_Preview']//div[@ref='eCenterContainer']//div[@role='columnheader'])";
    public static String SearchInColumn="Search In Available Column Sec>(//div[@id='RPE_AvailColumn_list']//input)[1]";
    
    //Table Format...
    public static String TableFormat_Sec="Table Format Section>//div[@id='RPE_TableFormat']//a";
    public static String TableFormatExpand="Table Format Expand>//div[@id='RPE_TableFormat']//a//i";
    public static String Table_Theme_Input="Table Theme input>//select[@id='RPE_TableTheme']";
    public static String Table_Theme_Results="Table theme results>//select[@id='RPE_TableTheme']//option";
    public static String Table_Theme_Input_1="Table Theme Input>//select[@id='RPE_TableTheme']//ancestor::div[1]";
    public static String TableThemeText="Table Theme Text>//div//label[contains(text(),'Table Theme')]";
    public static String AddEven_toggle_TableFormat="ADD / Even toggle in Table Format>//input[@id='RPE_TableOdd']";
    public static String AddEven_text_TableFormat="ADD/Even text in Table format>//div//label[contains(text(),'Odd/Even Colors')]";
    public static String ADDEven_toggleTableFormat1="ADD/Even toogle>//input[@id='RPE_TableOdd']//ancestor::label/descendant::span";
    public static String FontFamily_Input_TableFormat="Font Family Input in Table Format>//span[@id='select2-RPE_TableFontFamily-container']";
    public static String FontFamilyText_TableFormat="Font Family Text in Table Format>//div[@id='RPE_TableFormat']//label[contains(text(),'Font Family')]";
    public static String FontFamilyExpand_TableFormat="FontFamily dropdown Expand>//ul[@id='select2-RPE_TableFontFamily-results']";
    public static String SearchInput_FontFamilyDropdown="Search input in FontFamily Dropdown>//ul[@id='select2-RPE_TableFontFamily-results']//ancestor::span/descendant::input[@type='search']";
    public static String FontFamilyResult1="FonFamily Result1>(//ul[@id='select2-RPE_TableFontFamily-results']//li)[1]";
    public static String FontSizeInput_TableFormat="Font Size Input in Table Format>//select[@id='RPE_TableHeaderFontSize']";
    public static String FontSizeText_TableFormat="Font Size text in Table Format>//div//label[contains(text(),'Header Font Size')]";
    public static String FontSize__Results="Font Size Results>//select[@id='RPE_TableHeaderFontSize']//option";
    public static String HeaderColorInput_TableFormat="Header Color Input in Table Format>//input[@id='RPE_tableheaderColor']";
    public static String HeaderColorText_TableFormat="Header Color text in Table Format>//div//label[contains(text(),'Header color')]";
    public static String HeaderColorInput_Pointer="Header Color Input pointer>(//input[@id='RPE_tableheaderColor']//following::div)[1]";
    public static String WrapHeaders_Input_TableFormat="Wrap headers Input in Table Format>//input[@id='RPE_WrapHeaders']";
    public static String WrapHeaders_Text_TableFormat="Wrap headers text in Table Format>//div//label[contains(text(),'Wrap Headers')]";
    public static String WrapHeaded_toggle_TableFormat="Wrap Headers toggle in Table Format>//input[@id='RPE_WrapHeaders']//ancestor::label/descendant::span";
    public static String BodyFontSize_Input_TableFormat="Body Font Size Input in Table Format>//select[@id='RPE_TableBodyFontSize']";
    public static String BodyFontSize_Results_TableFormat="Body Font Size Results in Table Format>//select[@id='RPE_TableBodyFontSize']//option";
    public static String BodyFontSize_text_TableFormat="Body Font Size text in Table Format>//div//label[contains(text(),'Body Font Size')]";
    public static String BorderInput_TableFormat="Border Input in Table Format>//select[@id='RPE_tableborder']";
    public static String BorderResults_TableFormat="Border Results Table Format>//select[@id='RPE_tableborder']//option";
    public static String Border_text_TableFormat="Border text in Table Format>//div//label[text()='Border']";
    public static String NegativeHighlight_Input="Negative Hightlight Input>//input[@id='RPE_HighlightNeg']";
    public static String NegativeHighlight_toggle="Negative Hightlight toggle>//input[@id='RPE_HighlightNeg']//ancestor::label/descendant::span";
    public static String NegativeHighlight_text="Negative Hightlight text>//div//label[contains(text(),'Highlight Negatives')]";
    public static String AlignmentLeft_TableFormat="Alignment Left in Table Format>//div[@id='RPE_tableCTextAlign']//i[@data-align='left']";
    public static String Alignmentcenter_TableFormat="Alignment center in Table Format>//div[@id='RPE_tableCTextAlign']//i[@data-align='center']";
    public static String AlignmentRight_TableFormat="Alignment Right in Table Format>//div[@id='RPE_tableCTextAlign']//i[@data-align='right']";
    public static String AlignmentText_TableFormat="AlignmentText in Table Format>//div//label[text()='Alignment']";

    public static String RowTotal_Input_TableFormat="Row Total Input in Table Format>//input[@id='RPE_Rowtotal']";
    public static String RowTotal_toggle_TableFormat="Row Total toggle in Table Format>//input[@id='RPE_Rowtotal']//ancestor::label/descendant::span";
    public static String RowTotal_text_TableFormat="Row Total text in Table Format>//div//label[text()='Row Total']";
    public static String ColumnTotal_Input_TableFormat="Column Total Input in Table Format>//input[@id='RPE_Columntotal']";
    public static String ColumnTotal_toggle_TableFormat="Column Total toggle in Table Format>//input[@id='RPE_Columntotal']//ancestor::label/descendant::span";
    public static String ColumnTotal_text_TableFormat="Column Total text in Table Format>//div//label[text()='Column Total']";
    public static String PinRowTotal_Input_TableFormat="PinRow Total Input in Table Format>//input[@id='RPE_PinRowtotal']";
    public static String PinRowTotal_toggle_TableFormat="PinRow Total toggle in Table Format>//input[@id='RPE_PinRowtotal']//ancestor::label/descendant::span";
    public static String PinRowTotal_text_TableFormat="PinRow Total text in Table Format>//div//label[text()='Pin Row Total']";
    public static String PinColumnTotal_Input_TableFormat="Pin Column Total Input in Table Format>//input[@id='RPE_PinColumntotal']";
    public static String PinColumnTotal_toggle_TableFormat="Pin Column toggle in Table Format>//input[@id='RPE_PinColumntotal']//ancestor::label/descendant::span";
    public static String PinColumnTotal_text_TableFormat="Pin Column text in Table Format>//div//label[text()='Pin column Total']";
    public static String HighLightRowTotal_Input="Highlight Row Total Input>//input[@id='RPE_tablerowtotalColor']";
    public static String HighLightRowTotal_Text="Highlight Row Total Text>//div//label[text()='Highlight Row Total']";
    public static String HighlightRowTotal_InputPointer="Highlight Row Total Input pointer>(//input[@id='RPE_tablerowtotalColor']//ancestor::div[1])//div";
    public static String HighLightColumnTotal_Input="Highlight Column Total Input>//input[@id='RPE_tablecoltotalColor']";
    public static String HighLightColumnTotal_InputPointer="Highlight Column Total Input Pointer>(//input[@id='RPE_tablecoltotalColor']//ancestor::div[1])//div";
    public static String HighLightColumnTotal_Text="Highlight Column Total Text>//div//label[text()='Highlight Column Total']";
    public static String SeperatorInput_TableFormat="Seperator Input in Table Format>//select[@id='RPE_TableSeperator']";
    public static String SeperatorText_TableFormat="Seperator Text in Table Format>//input[@id='RPE_tablecoltotalColor']//following::label[text()='Seperator'][1]";
    

    public static String TableChart="Full Table Chart>//div[@id='RPE_Preview']"; //font family validation & theme update
    public static String TableHeadingCell="Table Header Cell>(//div[@id='RPE_Preview']//div[@role='columnheader'])[2]";//background color validation
    public static String TableHeaderRow="TableHeader Row>//div[@id='RPE_Preview']//div[@role='rowgroup' and @ref='eCenterContainer']";//Header Font size validation
    public static String ResultTableBody="Result table body>//div[@id='RPE_Preview']//div[@ref='eBodyViewport']"; // body font size validation
    public static String FirstTableHeaderMenuIcon="First Table Header Menu icon>(//div[@id='RPE_Preview']//div[@role='columnheader'])[2]//span[@ref='eMenu']";
    public static String ColumnMenuOpen="ColumnMenu>//div[@aria-label='Column Menu']";
    public static String TableCellExpand="TableHead Cell Expand>(//div[@id='RPE_Preview']//div[@role='columnheader'])[2]//div[@ref='eResize']";
    public static String TableHeadingCells="Table Header Cells>//div[@id='RPE_Preview']//div[@role='columnheader']";
    public static String TableHeadingCell2="Table Header Cell2>(//div[@id='RPE_Preview']//div[@role='columnheader'])[2]";
    public static String TableHeadingCell3="Table Header Cell3>(//div[@id='RPE_Preview']//div[@role='columnheader'])[3]";
    public static String ColumnName2="SecondColumnName>(//div[@id='RPE_Preview']//div[@role='columnheader'])[2]//span[@ref='eText']";
    public static String sortingIcon="Sorting Icon>//div[@id='RPE_Preview']//span[@ref='eSortIndicator']";
    public static String menuOption="Menu icon>//div[@id='RPE_Preview']//span[@ref='eMenu']";
    public static String menuOptionSecondColumn="menuOption SecondColumn>(//div[@id='RPE_Preview']//div[@role='columnheader'])[2]//span[@ref='eMenu']";
    public static String PinColumnOption="Pin Column Option>//span[text()='Pin Column']";
    public static String AutoSizeColumnOption="AutoSize Column Option>//span[text()='Autosize This Column']";
    public static String AutoSizeAllColumnOption="AutoSize All Column Option>//span[text()='Autosize All Columns']";
    public static String ResetColumnOption="Reset Column Option>//span[text()='Reset Columns']";
    public static String ChangeHeaderOption="Change Header name option>//span[text()='Change header name']";
    public static String AllignOption="Allign option>//span[text()='Align']";
    
    public static String Bug_msg="error >//*[contains(text(),'Please refer the logs in Logs')]";
    public static String RenameSection_Popup="Rename Section Popup>//*[@id='RPE_Rename_columnName']";
    public static String RenameHeading_popup="Rename Heading in popup>//*[@id='RPE_Rename_columnName']//p[text()='Rename']";
    public static String RenameInput="Rename Input>//*[@id='RPE_Rename_columnName']//input[@id='RPE_newGridColumnName']";
    public static String Rename_Yes_Button="Rename Yes Button>//button[@id='RPE_Rename_columnNameApplyButton']";
    public static String Rename_Cancel_Button="Rename Cancel button>//button[@id='RPE_Rename_columnNameCancelButton']";
    public static String Rename_Reset_Button="Rename Reset button>//button[@id='RPE_Rename_columnNameResetButton']";
    
   public static String CurrentTab="CurrentTab ID>//li[contains(@class,'editactive')]";
   public static String CurrentTabText="CurrentTab Text>//li[contains(@class,'editactive')]//a";
    
//    public static String 
    public static String Table_firstRow="Table First Row>(//div[@id='RPE_Preview']//div[@ref='eViewport']//div[@role='row'])[1]";
    public static String FirstRowCells="First Row Cells>(//div[@id='RPE_Preview']//div[@ref='eViewport']//div[@role='row'])[1]//div[@role='gridcell']";
    public static String Table_SecondRow="Table Second Row>(//div[@id='RPE_Preview']//div[@ref='eViewport']//div[@role='row'])[2]";
    public static String HorizontalScroll="Table Horizontal Scroll >//div[@id='RPE_Preview']//div[contains(@class,'horizontal-scroll') and @ref='eContainer' ]";//div[@class='ag-body-horizontal-scroll']"; //horizontal scroll validation
    public static String HorizontalScroll1="Table Horizontal Scroll1 >//div[@id='RPE_Preview']//div[@class='ag-body-horizontal-scroll']"; //horizontal scroll validation
    public static String HorizontalScroll2="Table Horizontal Scroll2 >//div[@id='RPE_Preview']//div[@class='ag-body-horizontal-scroll-viewport']";//div[@class='ag-body-horizontal-scroll']"; //horizontal scroll validation

    public static String FullTableBody="Resulting Table >//div[@id='RPE_Preview']//div[@ref='rootWrapperBody']"; //Full validation //div[@ref='eBodyViewport']
    public static String TableCell="Table Cells>//div[@id='RPE_Preview']//div[@role='gridcell']";
    public static String NegativeHighlightCell="Negative highlighted cell>//div[@id='RPE_Preview']//div[@role='gridcell' and contains(@class,'negatives')]";
    public static String TableRows="Table Rows >//div[@id='RPE_Preview']//div[@ref='centerContainer']//div[@role='row' and @comp-id]";
    public static String GrandTotalRow="Grand Total Rows>//div[@id='RPE_Preview']//div[@col-id='GrandTotal']";
    public static String GrandTotalRows="Grand Total Rows>//div[@id='RPE_Preview']//div[@col-id='GrandTotal' and @role='gridcell']";
    public static String GrandTotalColumns="Grand Total Column>//div[@id='RPE_Preview']//div[@ref='eContainer']//div[@role='row' and contains(@class,'RPE_Previewtablecoltotalcolor')]";
    
 
    public static String SeparatorOption1="'###,###,###' Seperater Option>//select[@id='RPE_TableSeperator']//option[text()='###,###,###']";
    public static String SeperatorOption2="'##,##,##,###' Separater Option>//select[@id='RPE_TableSeperator']//option[text()='##,##,##,###']";
    public static String SelectAllOption_Seperator="Select All checkbox Seperator>//div[@id='RPE_seperatorSelectall_div']";
    public static String SelectAllCheckBox_Seperator="Select All Checkbox Seperator>//input[@id='RPE_seperatorSelectall']";
    public static String SeperatorSelectedColoumnSection="Seperator Selected Column Section>//div[@id='RPE_grid_seperator_div']";
    public static String SeperatorSelectedColumnBox="Seperator Selected input Column>//div[@id='RPE_seperator_sel_showArea']";
    public static String AppliedSeperatorColoumn="Applied Seperator Column>//div[@id='RPE_seperator_sel_showArea']//div[@data-value]";
    public static String SearchSeperatorColumnInput="Search Input SeperatorColumn>//span[@aria-owns='select2-RPE_seperator_sel-results']//input[@type='search']";
    public static String SepertorAvailableColumns="Seperator Available ColumnList>//ul[@id='select2-RPE_seperator_sel-results']//li";
    
    public static String RoundOffInput_TableFormat="RoundOffInput Table Format>//select[@id='RPE_TableRoundValue']";
    public static String RountOffValueOptions_TableFormat="RoundOffValueOptions>//select[@id='RPE_TableRoundValue']//option";
    public static String SelectAllCheckbox_RoundOff="SelectAll Checkbox RoundOff>//input[@id='RPE_roundOffSelectall']";
    public static String RoundOffSelectColumnBox="RoundOffSelectColumn Box>//div[@id='RPE_roundoffSel_showArea']";
    public static String AvailableRoundOffSelectColumn="Available Select Roundoff Columns>//ul[@id='select2-RPE_roundoffSel-results']//li";
    public static String AppliedRoundOffColumns="Applied RoundOff Columns>//div[@id='RPE_roundoffSel_showArea']//div[@data-value]";
    public static String SearchRoundOffColumnInput="Search Input RoundOff Column>//span[@aria-owns='select2-RPE_roundoffSel-results']//input[@type='search']";
    
    public static String LocalFilterSec="Local filter section>//div[@id='RPE_LFilterTogglePanel']";
    public static String ChartTitleNameLocalFilter="Chart Tile name in Local filter sect>//label[@id='dashboardLRPE_wname']";
    public static String DatasetName_LocalFilter="DataSet Name in Local Filter>//label[@id='dashboardLRPE_filterDataset']";
    public static String ColumnListSec_LocalFilter="ColumnListSec Local filter>//div[@id='dashboardLRPE_select_filterColsCon']";
    public static String ColumnListValue_LocalFilter="ColumnList Values Local Filter>//div[@id='dashboardLRPE_select_filterColsCon']//a//div[1]";
    public static String ColumnListFirstValue_LocalFilter="ColumnList First Values Local Filter>(//div[@id='dashboardLRPE_select_filterColsCon']/div[not(contains(@class,'sm-display-none'))]//a//div)[1]";
    public static String ImageFirstColumn_localFiler="Image in First Column Local filter>(//div[@id='dashboardLRPE_select_filterColsCon']/div[not(contains(@class,'sm-display-none'))]//img)[1]";
    public static String ColumnTypeIcon_LocalFilter="ColumnType Local Filter>//div[@id='dashboardLRPE_select_filterColsCon']//div//img[1]";
    public static String Tab_inputToggle_LocalFilter="Tab Input toggle Local Filter>//input[@id='dashboardTLRPE_TabFilter']";
    public static String Tab_toggle_LocalFilter="Tab toggle Local filter>//input[@id='dashboardTLRPE_TabFilter']//ancestor::label[1]//span";
    public static String Global_inputToggle_LocalFilter="Global Input toggle Local Filter>//input[@id='dashboardLRPE_GlobalFilter']";
    public static String Global_toggle_LocalFilter="Global Toggle Local Filter>//input[@id='dashboardLRPE_GlobalFilter']//ancestor::label[1]//span";
    public static String SearchBar_Local_Filter="Search Bar Local Filter>//input[@id='dashboardLRPE_filterLsearch']";
    public static String ApplyButton_LocalFilter="Apply Button local filter>//input[@id='dashboardLRPE_filterLsearch']//ancestor::div[2]//button[text()='Apply']";
    public static String ResetButton_LocalFilter="ResetButton LocalFilter>//input[@id='dashboardLRPE_filterLsearch']//ancestor::div[2]//button[text()='Reset']";
    public static String CategoricalColumn_LocalFilter="Categorical Column Local Filter>(//img[@src='./assets/images/Categorical.svg']//ancestor::div[1])[1]//a";
    public static String CategoricalColumnExpand_LocalFilter="Categorical Column Expand>(//img[@src='./assets/images/Categorical.svg']//ancestor::div[1])[1]//a//i"; 
    public static String byValueFilterOption="By Value Filter Option  >//div[contains(@class,'catcolFilterContent') and not(contains(@style,'display'))]//div[@id='byRelative_div']";
    public static String byValueRadioButton="By Value radio button >//div[contains(@class,'catcolFilterContent') and not(contains(@style,'display'))]//div[@id='byRelative_div']//input";
    public static String ConditionFilterOption_Categorical="Condition Filter option >//div[contains(@class,'catcolFilterContent') and not(contains(@style,'display'))]//div[@id='condition_div']";
    public static String ConditionRadioButton_Categorical="Condition radio button >//div[contains(@class,'catcolFilterContent') and not(contains(@style,'display'))]//div[@id='condition_div']//input";
    public static String SearchField_CategoricalSec="SearchField  Column>//div[contains(@class,'catcolFilterContent') and not(contains(@style,'display'))]//input[contains(@id,'LFsearch')]";
    public static String AllCheckbox_CategoricalSec="All Check box >//div[contains(@class,'catcolFilterContent') and not(contains(@style,'display'))]//input[contains(@id,'LFAllcheckbox')]";
    public static String CategoricalSearchListOptions="SearchList Option>//div[contains(@class,'catcolFilterContent') and not(contains(@style,'display'))]//div[contains(@id,'FactorsList')]//li";
    public static String FirstSearchedListValue="First Searched Value>//div[contains(@class,'catcolFilterContent') and not(contains(@style,'display'))]//div[contains(@id,'FactorsList')]//li[1]";
    public static String FirstSearchedCheckbox="First searched Checkbox>//div[contains(@class,'catcolFilterContent') and not(contains(@style,'display'))]//div[contains(@id,'FactorsList')]//li[1]//input";
    public static String SearchListCheckbox="SearchList Checkbox in >//div[contains(@id,'FactorsList')]//li//input[@type='checkbox']";
    public static String ExcludeOption_Categorical="Exclude Option in >//div[contains(@class,'catcolFilterContent') and not(contains(@style,'display'))]//li[contains(@id,'LFExclude')]";
    public static String ExcludeCheckbox="Exclude checkbox in Categorical>//div[contains(@class,'catcolFilterContent') and not(contains(@style,'display'))]//li[contains(@id,'LFExclude')]//input";
    public static String ConditionSelectDropdown="Condition Select dropdown>//select[contains(@id,'textDI') and contains(@id,'1_select')]";
    public static String ConditonInput1="Condition input1 Categorical>//select[contains(@id,'textDI') and contains(@id,'1_select')]//ancestor::div[1]//input";
    public static String AddButtonCondition="Add button Condition>//div[@id='addnumfiltercondition']//button";
    public static String AND_ConditionSec1="'AND' condition 1 >//div[contains(@id,'2')]//div[@id='and_div']";
    public static String AND_ConditionRadioBtn1="AND Condition Radio button>//div[contains(@id,'2')]//div[@id='and_div']//input";
    public static String OR_ConditionSec1="'OR' condition 1 >//div[contains(@id,'2')]//div[@id='or_div']";
    public static String OR_ConditionRadioBtn1="'OR' Condition Radio button>//div[contains(@id,'2')]//div[@id='or_div']//input";
    public static String ConditionSelectDropdown2="Condition Select dropdown2>//select[contains(@id,'textDI') and contains(@id,'2_select')]";
    public static String ConditonInput2="Condition input2 Categorical>//select[contains(@id,'textDI') and contains(@id,'2_select')]//ancestor::div[1]//input";
    public static String AND_ConditionSec2="'AND' condition 1 >//div[contains(@id,'3')]//div[@id='and_div']";
    public static String AND_ConditionRadioBtn2="AND Condition Radio button>//div[contains(@id,'3')]//div[@id='and_div']//input";
    public static String OR_ConditionSec2="'OR' condition 1 >//div[contains(@id,'3')]//div[@id='or_div']";
    public static String OR_ConditionRadioBtn2="'OR' Condition Radio button>//div[contains(@id,'3')]//div[@id='or_div']//input";
    public static String ConditionSelectDropdown3="Condition Select dropdown3>//select[contains(@id,'textDI') and contains(@id,'3_select')]";
    public static String ConditonInput3="Condition input3 Categorical>//select[contains(@id,'textDI') and contains(@id,'3_select')]//ancestor::div[1]//input";
    public static String body="Chart Value Body>//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//div[@ref='gridBody']";
    public static String body2="Table chart body 2>(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//div[@ref='gridBody'])[2]";
    public static String ValidationChart="Validation Chart>//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//div[contains(@id,'validationDiv')]";
    
    public static String AvailableList_ByValue="Available List in By values Section>//div[contains(@class,'catcolFilterContent') and not(contains(@style,'display'))]//div[contains(@id,'_FactorsList')]//li";
    public static String AvailableListCheckbox_ByValue="Available List Checkbox in By Values Sction>//div[contains(@class,'catcolFilterContent') and not(contains(@style,'display'))]//div[contains(@id,'_FactorsList')]//li//input";
    public static String closeFilterPanel="CloseFilterPanel>//div[@id='RPE_LFilterTogglePanel']//div//i[contains(@class,'close')]";
    
    
    public static String equalTo_Option="Equal to Option in condition dropdown>//select[contains(@id,'textDI')]//option[text()='equal to']";
    public static String NotequalTo_Option="Not Equal to Option in condition dropdown>//select[contains(@id,'textDI')]//option[text()='not equal to']";
    public static String BeginsWith_Option="Begins With Option in condition dropdown>//select[contains(@id,'textDI')]//option[text()='begins with']";
    public static String notBeginsWith_Option="Does Not Begins With Option in condition dropdown>//select[contains(@id,'textDI')]//option[text()='does not begin with']";
    public static String endsWith_Option="Ends With Option in condition dropdown>//select[contains(@id,'textDI')]//option[text()='ends with']";
    public static String notendsWith_Option="Does not Ends With Option in condition dropdown>//select[contains(@id,'textDI')]//option[text()='does not end with']";
    public static String Contains_Option="Contains Option in condition dropdown>//select[contains(@id,'textDI')]//option[text()='contains']";
    public static String NotContains_Option="Does not Contains Option in condition dropdown>//select[contains(@id,'textDI')]//option[text()='does not contain']";

    public static String LocalFilterChartIcon="LocalFilterIcon Chart>//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//div[contains(@id,'RPE_header_filter')]//*[name()='g'][2]//*[name()='path'][1]";
    public static String TabFilterIcon="TabFilter Icon>//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//div[contains(@id,'RPE_header_filter')]//*[name()='g'][2]//*[name()='path'][2]";
    public static String GlobalFilterIcon="Global Filter Icon>//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//div[contains(@id,'RPE_header_filter')]//*[name()='g'][2]//*[name()='path'][3]";
    public static String FilterChartIcon="FilterChartIcon>//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//div[contains(@id,'RPE_header_filter') and @title]";
    
    public static String TabFilterIconChart1="TabFilter Icon Chart 1>(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//div[contains(@id,'RPE_header_filter')]//*[name()='g'][2]//*[name()='path'][2])[1]";
    public static String TabFilterIconChart2="TabFilter Icon Chart 2>(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//div[contains(@id,'RPE_header_filter')]//*[name()='g'][2]//*[name()='path'][2])[2]";
  
    //Local Filter Date

    public static String DateColumn_LocalFilter="Date Column Local Filter>(//img[@src='./assets/images/Date.svg']//ancestor::div[1])[1]//a";
    public static String DateColumnExpand_LocalFilter="Date Column Expand Local Filter>(//img[@src='./assets/images/Date.svg']//ancestor::div[1])[1]//a//i";
   
    public static String RelativeOption="Relative Option>//div[contains(@class,'columnfilterContent') and not(contains(@style,'display'))]//div[@id='relative_div']";
    public static String RelativeOptionRadioBtn="Relative Option Radio Button>//div[contains(@class,'columnfilterContent') and not(contains(@style,'display'))]//div[@id='relative_div']//input";
    public static String Relative_conditin_dropdown="Relative Condition dropdown>//div[contains(@class,'columnfilterContent') and not(contains(@style,'display'))]//select[contains(@id,'Relative_select')]";
    public static String Relative_Input_Value_date="Relative Input Value>//div[contains(@id,'Relativeinputdiv')]//input";
    public static String Today_RelativeOption="Today option in Relative dropdown>//select[contains(@id,'Relative_select')]//option[text()='Today']";
    public static String Yesterday_RelativeOption="Yesterday option in Relative dropdown>//select[contains(@id,'Relative_select')]//option[text()='Yesterday']";
    public static String Last7Day_RelativeOption="Last 7 day option in Relative dropdown>//select[contains(@id,'Relative_select')]//option[text()='Last 7 days']";
    public static String ThisWeek_RelativeOption="This Week option in Relative dropdown>//select[contains(@id,'Relative_select')]//option[text()='This Week']";
    public static String LastWeek_RelativeOption="Last Week option in Relative dropdown>//select[contains(@id,'Relative_select')]//option[text()='Last Week']";
    public static String ThisMonth_RelativeOption="This Month option in Relative dropdown>//select[contains(@id,'Relative_select')]//option[text()='This Month']";
    public static String LastMonth_RelativeOption="Last Month option in Relative dropdown>//select[contains(@id,'Relative_select')]//option[text()='Last Month']";
    public static String Last6Month_RelativeOption="Last 6 Month option in Relative dropdown>//select[contains(@id,'Relative_select')]//option[text()='Last 6 Months']";
    public static String ThisYear_RelativeOption="This year option in Relative dropdown>//select[contains(@id,'Relative_select')]//option[text()='This Year']";
    public static String LastYear_RelativeOption="Last year option in Relative dropdown>//select[contains(@id,'Relative_select')]//option[text()='Last Year']";
    public static String Last_N_Days_RelativeOption="Last N Days option in Relative dropdown>//select[contains(@id,'Relative_select')]//option[text()='Last N Days']";
    public static String Last_N_Week_RelativeOption="Last N Weeks option in Relative dropdown>//select[contains(@id,'Relative_select')]//option[text()='Last N Weeks']";
    public static String Last_N_Months_RelativeOption="Last N Months option in Relative dropdown>//select[contains(@id,'Relative_select')]//option[text()='Last N Months']";
    public static String Last_N_Years_RelativeOption="Last N Years option in Relative dropdown>//select[contains(@id,'Relative_select')]//option[text()='Last N Years']";
    
    public static String ConditionInput1_Date="Condition Select Input 1 in Date>//select[contains(@id,'dateDI') and contains(@id,'1_select')]";
    public static String ConditionInput2_Date="Condition Select Input 2 in Date>//select[contains(@id,'dateDI') and contains(@id,'2_select')]";
    public static String ConditionInput3_Date="Condition Select Input 3 in Date>//select[contains(@id,'dateDI') and contains(@id,'3_select')]";
    public static String FirstConditionValueInput1_date="First Condition Value input 1 in Date>(//input[contains(@id,'dateDI') and contains(@id,'1_input')])[1]";
    public static String FirstConditionValueInput2_date="First Condition Value input 2 in Date>(//input[contains(@id,'dateDI') and contains(@id,'1_input2')])[1]";
    public static String SecondConditionValueInput1_date="Second Condition Value input 1 in Date>(//input[contains(@id,'dateDI') and contains(@id,'2_input')])[1]";
    public static String ThirdConditionValueInput1_date="Third Condition Value input 1 in Date>(//input[contains(@id,'dateDI') and contains(@id,'3_input')])[1]";
  

    public static String EqualTo_OptionDate="Equals to Option Date>//select[contains(@id,'dateDI') and contains(@id,'1_select')]//option[text()='equal to']";
    public static String NotEqualTo_OptionDate="Not Equals to Option Date>//select[contains(@id,'dateDI') and contains(@id,'1_select')]//option[text()='not equal to']";
    public static String GreaterThan_OptionDate="Greater Than Option Date>//select[contains(@id,'dateDI') and contains(@id,'1_select')]//option[text()='is greater than']";
    public static String LessThan_OptionDate="Less Than Option Date>//select[contains(@id,'dateDI') and contains(@id,'1_select')]//option[text()='is less than']";
    public static String GreaterEqualTo_OptionDate="Greater Than Equals to Option Date>//select[contains(@id,'dateDI') and contains(@id,'1_select')]//option[text()='is greater than or equal to']";
    public static String LessThanEqualTo_OptionDate="Less than Equals to Option Date>//select[contains(@id,'dateDI') and contains(@id,'1_select')]//option[text()='is less than or equal to']";
    public static String IsNull_OptionDate="Is Null Option Date>//select[contains(@id,'dateDI') and contains(@id,'1_select')]//option[text()='is null']";
    public static String IsNotNull_OptionDate="Is Not Null Option Date>//select[contains(@id,'dateDI') and contains(@id,'1_select')]//option[text()='is not null']";
    public static String Between_OptionDate="Between Option Date>//select[contains(@id,'dateDI') and contains(@id,'1_select')]//option[text()='between']";

    public static String ConditionFilterOption_Date="Condition Filter option Date>//div[contains(@class,'columnfilterContent') and not(contains(@style,'display'))]//div[@id='condition_div']";
    public static String ConditionRadioButton_Date="Condition radio button Date>//div[contains(@class,'columnfilterContent') and not(contains(@style,'display'))]//div[@id='condition_div']//input";
   
    
    //Local Filter Numerical
    public static String NumericalColumn_LocalFilter="Numerical Column Local Filter>(//img[@src='./assets/images/Numerical.svg']//ancestor::div[1])[1]//a";
    public static String NumericalColumnExpand_LocalFilter="Numerical Column Expand Local Filter>(//img[@src='./assets/images/Numerical.svg']//ancestor::div[1])[1]//a//i";
    public static String ConditionInput1_Num="Condition Select Input 1 in Numerical>//select[contains(@id,'numDI') and contains(@id,'1_select')]";
    public static String ConditionInput2_Num="Condition Select Input 2 in Numerical>//select[contains(@id,'numDI') and contains(@id,'2_select')]";
    public static String ConditionInput3_Num="Condition Select Input 3 in Numerical>//select[contains(@id,'numDI') and contains(@id,'3_select')]";
    public static String FirstConditionValueInput1_Num="First Condition Value input 1 in Numerical>(//input[contains(@id,'numDI') and contains(@id,'1_input')])[1]";
    public static String FirstConditionValueInput2_Num="First Condition Value input 2 in Numerical>(//input[contains(@id,'numDI') and contains(@id,'1_input2')])[1]";
    public static String SecondConditionValueInput1_Num="Second Condition Value input 2 in Numerical>(//input[contains(@id,'numDI') and contains(@id,'2_input')])[1]";
    public static String ThirdConditionValueInput1_Num="Third Condition Value input 2 in Numerical>(//input[contains(@id,'numDI') and contains(@id,'3_input')])[1]";
 
    public static String EqualTo_OptionNum="Equals to Option Num>//select[contains(@id,'numDI') and contains(@id,'1_select')]//option[text()='equal to']";
    public static String NotEqualTo_OptionNum="Not Equals to Option Num>//select[contains(@id,'numDI') and contains(@id,'1_select')]//option[text()='not equal to']";
    public static String GreaterThan_OptionNum="Greater Than Option Num>//select[contains(@id,'numDI') and contains(@id,'1_select')]//option[text()='is greater than']";
    public static String LessThan_OptionNum="Less Than Option Num>//select[contains(@id,'numDI') and contains(@id,'1_select')]//option[text()='is less than']";
    public static String GreaterEqualTo_OptionNum="Greater Than Equals to Option Num>//select[contains(@id,'numDI') and contains(@id,'1_select')]//option[text()='is greater than or equal to']";
    public static String LessThanEqualTo_OptionNum="Less than Equals to Option Num>//select[contains(@id,'numDI') and contains(@id,'1_select')]//option[text()='is less than or equal to']";
    public static String IsNull_OptionNum="Is Null Option Num>//select[contains(@id,'numDI') and contains(@id,'1_select')]//option[text()='is null']";
    public static String IsNotNull_OptionNum="Is Not Null Option Num>//select[contains(@id,'numDI') and contains(@id,'1_select')]//option[text()='is not null']";
    public static String Between_OptionNum="Between Option Num>//select[contains(@id,'numDI') and contains(@id,'1_select')]//option[text()='between']";

    
    public static String ThirdTabLink="Third Tab link>(//a[@data-toggle='tooltip'])[3]//ancestor::li";
    public static String FirstCategorical="First Categorical>(//img[@src='./assets/images/Categorical.svg']//ancestor::div[1])[1]";
    // ************* Global Filter ******************************
    public static String GlobalFilterOption="Global Filter Option>//a[@mattooltip='Global Filter']//img";
    public static String GlobalFilterSection="Global Filter Section>//div[@id='RPE_GFilterTogglePanel']";
    public static String DataSetGlobalVariable="Dataset in GlobalFilter section>//label[@id='globalRPE_filterDataset']";
    public static String ApplyButton_GlobalFilter="Applybutton in global Filter>//div[@id='RPE_GFilterTogglePanel']//button[text()='Apply']";
    public static String RestButton_GlobalFilter="Reset button in global Filter>//div[@id='RPE_GFilterTogglePanel']//button[text()='Reset']";
    public static String SearchInput_GlobalFilter="Search Input Global Filter>//input[@id='globalRPE_filterLsearch']";
    public static String DataColumnList_GlobalFilter="Data Column Lists in GlobalFilter>//div[@id='globalRPE_select_filterColsCon']/div//a";
    
    public static String ColumnListFirstValue_GlobalFilter="ColumnList First Value Global Filter>(//div[@id='globalRPE_select_filterColsCon']/div[not(contains(@class,'sm-display-none'))]//a//div)[1]";
    public static String ImageFirstColumn_GlobalFilter="Image in First Column Global filter>(//div[@id='globalRPE_select_filterColsCon']/div[not(contains(@class,'sm-display-none'))]//img)[1]";
    public static String ColumnTypeIcon_GlobalFilter="ColumnType Global Filter>//div[@id='globalRPE_select_filterColsCon']//div//img[1]";
    public static String CloseGlobalFilterPanel="Close Global Filter Panel>//div[@id='RPE_GFilterTogglePanel']//div//i[contains(@class,'close')]";
    
    // ***************** TabFilter *******************
    public static String TabFilterSection="TabFilter Section>//div[@id='RPE_TFilterTogglePanel']";
    public static String DataSetTabVariable="Dataset in TabFilter section>//label[@id='dashboardTRPE_filterDataset']";
    public static String ApplyButton_TabFilter="Apply button in TabFilter>//div[@id='RPE_TFilterTogglePanel']//button[text()='Apply']";
    public static String ResetButton_TabFilter="Reset button in TabFilter>//div[@id='RPE_TFilterTogglePanel']//button[text()='Reset']";
    public static String SearchInput_TabFilter="Search Input in TabFilter>//input[@id='dashboardTRPE_filterLsearch']";
    public static String ColumnLists_TabFilter="Column Lists section Tab Filter>//div[@id='dashboardTRPE_select_filterColsCon']/div//a";
    public static String TabFilterActive="TabFilter Active>//li[contains(@class,'editactive')]//div[contains(@id,'_tabfilter')]";
    
    // Bar chart Filter new
    public static String chartBody="Result Chart Body>//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[name()='g' and @aria-label='Chart']";
    public static String chartBody1="Result Chart Body1>(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[name()='g' and @aria-label='Chart'])[1]";    
    public static String chartBody2="Result Chart Body2>(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[name()='g' and @aria-label='Chart'])[2]";
    public static String LocalFilterChartIcon2="LocalFilterIcon Chart2>(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//div[contains(@id,'RPE_header_filter')]//*[name()='g'][2]//*[name()='path'][1])[2]";
    public static String TabFilterIcon2="TabFilter Icon2>(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//div[contains(@id,'RPE_header_filter')]//*[name()='g'][2]//*[name()='path'][2])[2]";
    public static String GlobalFilterIcon2="Global Filter Icon2>(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//div[contains(@id,'RPE_header_filter')]//*[name()='g'][2]//*[name()='path'][3])[2]";
    public static String FilterChartIcon2="FilterChartIcon2>(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//div[contains(@id,'RPE_header_filter') and @title])[2]";
    
    public static String ChartBody_Y_Values="Chart Result Y Values>(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[@aria-label='Chart'])[1]//*[@transform]/*[name()='g']/*[@aria-label and not(@fill-opacity)]";
    public static String ChartBody2_Y_Values="Chart Result2 Y Values>(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//*[@aria-label='Chart'])[2]//*[@transform]/*[name()='g']/*[@aria-label and not(@fill-opacity)]";

    
    //Admin & Publish Dashboard Validations
    public static String Publish_Dashboard="Publish Dashboard>//a[@id='RPE_gotoPublish']";
    public static String Publish="Publish>//a[@mattooltip='Publish']";
    public static String Publish_Error="Publish Error>//*[text()='Please select the Tab or widget']";
    public static String Publish_Success="Publish Success>//*[contains(text(),'published successfully')]";
    public static String CheckBox_Chart1="CheckBox Chart1>(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//input[@type='checkbox' and not(@ref)])[1]";
    public static String CheckBox_Chart2="CheckBox Chart2>(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//input[@type='checkbox' and not(@ref)])[2]";
    public static String ChartSec="Chart>//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//div[contains(@class,'RPE_GridStackItem')]";
    public static String CurrentTabCheckBox="CurrentTab Checkbox>//li[contains(@class,'editactive')]//div//input[@type='checkbox']";
    public static String Chart1_Checkbox="Checkbox Chart1>(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//p/input[@type='checkbox'])[1]";
    public static String Chart2_Checkbox="Checkbox Chart2>(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//p/input[@type='checkbox'])[2]";
    public static String Chart1_Flag="Chart 1 Red Color flagg>(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//div[@title='Published Chart'])[1]";
    public static String Chart2_Flag="Chart 2 Red Color flagg>(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//div[@title='Published Chart'])[2]";
    public static String PublishedChartPage="Published DashPro Page>//div[@id='RPE_publishedcharts']";
    public static String Chart1_="Chart1>(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//p/input[@type='checkbox'])[1]//ancestor::div[@data-gs-id]";
    public static String Chart2_="Chart2>(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//p/input[@type='checkbox'])[2]//ancestor::div[@data-gs-id]";  
    public static String ExportPDF="Export PDF>//a[@mattooltip='Export to PDF']/img";
    public static String MYCharts="My Charts>//a[@mattooltip='My Charts']/i";
    public static String MY_ChartsPage="MyCharts Page>//div[@id='RPE_graphcharts']";
    public static String DeleteTab="DeleteTab>//*[@id='RPE_DeleteTab']//span[text()='Delete']";
    
    public static String RefreshButton="Refresh Button>//button[@id='refreshButton']";
    public static String Refreshing="Refreshing>//*[text()='Refreshing the data. Please wait for a while...']";
    public static String Refreshed="Refreshed>//mat-tooltip-component/div[contains(text(),'Last refreshed on')]";
    public static String ExportPDF_Popup="Export PDF details box>//*[@id='RPE_ExportTitle']/div";
    public static String Title_Input="Title Input>//input[@id='RPE_txtArea']";
    public static String SubTitle_Input="Sub Title Input>//input[@id='RPE_txtAreaSTitle']";
    public static String ExportBtn="Export button>//span[text()='Export']//ancestor::button[1]";
    
    public static String ProjectsSearch="Projects Search Input>//div//input[@data-placeholder and not(@type)]";
    public static String FirstProjectName="First ProjectName>//table[@id='parentTable']/tbody/tr[1]/td[2]";
    public static String InvalidRenameError="Invalid rename error>//*[contains(text(),'Invalid Project name for the given user')]";
    
    public static String PublishedChart_1="Published Chart1>(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//div[contains(@class,'RPE_GridStackItem')])[1]";
    public static String PublishedChart_2="Published Chart2>(//div[contains(@class,'RPE_tabPanelDiv') and not(contains(@class,'sm-display-none'))]//div[contains(@class,'RPE_GridStackItem')])[2]";
    public static String RenameProjectNameInput="Rename Project Name input>//table[@id='parentTable']//td//input[@type='text']";
    
    public static String UploadOption="Upload Option in Dataset>//tr[1]//button//i[contains(@class,'upload')]";
    public static String UploadTooltip="Tooltip text in Upload option>//mat-tooltip-component//div[contains(text(),'Load the data to perform analysis')]";
    public static String DeleteOption="Delete Option in Dataset>//table[@id='detailTable']//tr[1]//button//i[contains(@class,'delete')]";
    public static String DownloadOption="Download option in DataSet>//tr[1]//button//i[contains(@class,'download')]";
    public static String PipelineOption="PipelineOption>//tr[1]//button//i[contains(@class,'pipeline')]";
    public static String DashProOption="DashPro Option in Dataset>//tr[1]//button//i[contains(@class,'dashpro')]";
    public static String DashProOptionDisable="DashProOptionDisable>(//div[contains(@class,'detailExpand') and not(contains(@style,'display: none'))]//tr[1]//i[contains(@class,'dashpro')]//ancestor::button[@disabled])[1]";
    public static String SharDatasetOption="ShareDataset Option in Dataset>//tr[1]//button//i[contains(@class,'shareDataset')]";
    public static String InformationOption="Information Option in Dataset>//tr[1]//button//i[contains(@class,'information')]";
    public static String DeleteTooltip="Delete Tooltip text>//mat-tooltip-component//div[contains(text(),'Delete a file from the project')]";
    public static String DownloadTooltip="Download tooltip text>//mat-tooltip-component//div[contains(text(),'Download the data into the local system as csv file')]";
    public static String PipelineTooltip="Pipeline tooltip text>//mat-tooltip-component//div[contains(text(),'Pipeline activities')]";
    public static String DashProTooltip="Dash Pro tooltip text>//mat-tooltip-component//div[contains(text(),'Dash Pro')]";
    public static String CollabrationTooltip="Collabration tooltip>//mat-tooltip-component//div[contains(text(),'Collaboration')]";
    public static String InformationTooltiptext="Information Tooltip text>//tr[1]//button//i[contains(@class,'information')]//following::div[contains(@id,'toolTip') and contains(@style,'block')][1]";
    
    public static String MyActivity="My Activity>//h1[text()='My Activities']";
    public static String CloseMyActivity="Close My Activity>//h1[text()='My Activities']//following::button/span[text()='close']";
    public static String FirstDatasetCheckbox="FirstDataset Checkbox>(//mat-icon[contains(@class,'arrow-up')]//following::table[@id='detailTable']//td[2]//mat-checkbox)[1]";
    public static String DataFileCheckbox="Data Files CheckBox>(//mat-icon[contains(@class,'arrow-up')]//following::table[@id='detailTable']//td[2]//mat-checkbox)";
    public static String ShareOption="ShareOption>//button[@mattooltip='Share']";
    public static String ShareListPage="ShareDetailed Page>//h1[text()='Users list']";
    public static String ShareEmailInput="Share email Input>(//div[@ref='eFloatingFilterInput']//input)[3]";
    public static String FirstCheckbox="FirstCheck box email>//div[@ref='eContainer']//input[@type='checkbox']";
    public static String ShareButton="ShareButton>//button//span[text()='Share ']";
    public static String ShareError="'Kindly select the user'>//*[contains(text(),'Kindly select the user')]";
    public static String ShareSuccess="Share success>//*[contains(text(),'File(S) shared successfully')]";
    public static String ProjectRenameSuccess="Project Rename Success>//*[contains(text(),'Project renamed successfully')]";
    public static String RenameProject="Rename Project>//table[@id='parentTable']/tbody/tr[1]/td[2]//ancestor::tr[1]//button[@mattooltip='Rename']";
    public static String UploadData="Upload Data>//button//span[text()='Upload Data']";
    public static String FileDeleteSuccess="File Delete Success message>//*[contains(text(),'File(s) deleted successfully')]";
    public static String MultipleDeleteBtn="Multiple Delete button>//button//span[text()='Upload Data']//ancestor::div[1]//button//i[contains(@class,'delete')]";
    public static String MultipleProjectCheckbox="Multiple Project Checkbox>//table[@id='parentTable']/tbody/tr/td[1]/div/mat-checkbox";
    public static String MultipleProjectDelete="Multile Project Delete>//*[text()='Create Project']//ancestor::div[1]//i[contains(@class,'delete')]//ancestor::button";
    public static String ProjectDeleteSuccess="Project delete Success>//*[contains(text(),'Project(s) deleted successfully')]";
    		
    //Stacked Bar
    public static String ColorError1="'Kindly select Color' error in color>//*[text()='Kindly select Color']";
    public static String ColorError2="'Distinct value for Color greater than 200' error in color>//*[text()='Distinct value for Color greater than 200']";
    public static String ColorSelectDropdown="Color Dropdown>//span[@id='select2-RPE_secondcategorySel-container']";
    public static String ColorText="'Color' Text>//div[@id='RPE_secondcategorydiv']//span[text()='Color']";
    public static String Color_DropdownResults="Color Dropdown results>//ul[@id='select2-RPE_secondcategorySel-results']";
    public static String Chart_Section="Chart >//div[@id='RPE_Preview']//*[@role='region']";
    public static String ChartGroupCount="Charts Group>//*[name()='g' and @aria-label and @role='group' and @id]";
    public static String ChartBarDisplayCount="Chart Displayed Count>(//div[@id='RPE_Preview']//*[name()='g' and @aria-label and @role='group' and @id])[1]//*[name()='g' and contains(@role,'item')]";
    public static String ChartBars="Chart Displayed Bars>(//div[@id='RPE_Preview']//*[name()='g' and @aria-label and @role='group' and @id])//*[name()='g' and contains(@role,'item')]";
    public static String Displayed_First_Bar="Displayed First Bar>((//div[@id='RPE_Preview']//*[name()='g' and @aria-label and @role='group' and @id])//*[name()='g' and contains(@role,'item') and @id ])[1]"; 
    public static String X_Scroll_Bar="X_Scroll Bar>//div[@id='RPE_Preview']//*[@role='scrollbar' and @aria-orientation='horizontal']";
    public static String Y_Scroll_Bar="Y_Scroll Bar>//div[@id='RPE_Preview']//*[@role='scrollbar' and @aria-orientation='vertical' and not(@visibility)]";
    public static String Displayed_FirstColumnBatr="First Column Bar>((//*[name()='g' and @aria-label and @role='group' ])//*[name()='g' and contains(@role,'item') and @id ])[1]";
    public static String charts_Bar="Charts Bar column>(//div[@id='RPE_Preview']//*[name()='g' and @aria-label and @role='group' ])//*[name()='g' and contains(@role,'item')]";
    public static String Charts_StackedColumn="Charts >(//div[@id='RPE_Preview']//*[name()='g' and @aria-label and @role='group' and @id])//*[name()='g' and contains(@role,'item')]";
    
    public static String Value_ValueFormat="Value ValueFormat>//select[@id='RPE_valueformat']/option[text()='Value']";
    public static String Percentage_ValueFormat="Percentage ValueFormat>//select[@id='RPE_valueformat']/option[text()='Percentage']";
    public static String Y_Scroll_Bar1="Y_Scroll Bar>//div[@id='RPE_Preview']//*[@role='scrollbar' and @aria-orientation='horizontal']";
    public static String X_Scroll_Bar1="X_Scroll Bar>//div[@id='RPE_Preview']//*[@role='scrollbar' and @aria-orientation='vertical' and not(@visibility)]";
   
    
    //DataLabel in Stack Bar
    public static String EnableValue="Enable Value>//div[@id='RPE_Preview']//*[name()='g' and @fill and @stroke]//*[name()='text']//ancestor::*[name()='g' and @stroke-opacity and @font-size and @fill]";
    public static String EnableValue_Transform="Enable Value transform>//*[name()='g' and @fill and @stroke]//*[name()='text']//ancestor::*[name()='g' and @transform and @focusable ]";    //*[name()='g' and @fill and @stroke]//*[name()='text']//ancestor::*[name()='g' and @stroke-opacity and @font-size and @fill]/*[@transform]";
    public static String ValueFormatInput_StackBar="ValueFormat Input Stack >//select[@id='RPE_stackvalueformat']";
    public static String ValueOption_ValueFormat="'Value' Option>//select[@id='RPE_stackvalueformat']/option[text()='Value']";
    public static String BarPercentOption_ValueFormat="'BarPercent' Option>//select[@id='RPE_stackvalueformat']/option[text()='Bar %']";
    public static String ColorPercentOption_ValueFormat="'ColorPercent' Option>//select[@id='RPE_stackvalueformat']/option[text()='Color %']";
    public static String Hundred_percentScaleInput="100 % Scale Input>//input[@id='RPE_Axispercentage']";
    public static String Hund_percentInputSlider="100 % Scale Input slider>//input[@id='RPE_Axispercentage']//ancestor::div[1]//span";
    public static String HundredPercentScaleText="100 % Scale text>//div[@id='RPE_cAxisperc_label']//label[text()='100% Scale']";
    public static String StackTotal_Inputtoggle="StackTotal Input toggle>//input[@id='RPE_stackTotal']//ancestor::div[1]//span";
    public static String StackTotal_Input="StackTotal Input >//input[@id='RPE_stackTotal']";
    public static String StackTotal_text="Stack Total text>//div[@id='RPE_stackTotaldiv']//label[text()='Stack Total']";
    public static String TotalFontSizeText="Total Font Size text>//div[@id='RPE_cFstackTotalFontSize']//label[text()='Total Fontsize']";
    public static String TotalFontSizeInput="Total Font Size Input>//select[@id='RPE_stackTotalFontSize']";
    public static String TotalSeperatorText="Total Seperator text>//div[@id='RPE_Seperator_Total']//label[text()='Total Seperator']";
    public static String TotalSeperatorInput="Total Seperator Input>//select[@id='RPE_TotalSeperatorValue']";
    public static String TotalRoundOffText="Total RoundOff Value Text>//div[@id='RPE_RoundVal_total']//label[text()='Total Roundoff Value']";
    public static String TotalRoundOffInput="Total RoundOff Value Input>//select[@id='RPE_TotalRoundValue']";
    public static String TotalRotationText="Total Rotation text>//div[@id='RPE_Value_Rotation_Total']//label[text()='Total rotation']";
    public static String TotalRotationInput="Total Rotation input>//input[@id='RPE_rotationtotal']";
    public static String TotalRotationOutput="Total Rotation Output>//output[@id='RPE_rangeoutputtotal']";
    public static String TotalBigNumberSuffixText="Total BigNumber Suffix text>//div[@id='RPE_cFTotalBigNumber']//label[text()='Total BigNumber Suffix']";
    public static String TotalBigNumberInput="Totatl Bignumber Input>//input[@id='RPE_totalbignumber']";
    public static String TotalBigNumberInputToggle="Totatl Bignumber Input Toggle>//input[@id='RPE_totalbignumber']//ancestor::div[1]//span";
    public static String X_ValuesChart="X Values in Charts>(//div[@id='RPE_Preview']//*[name()='g' and @aria-hidden and @font-family])[2]//*[@font-size and not(@stroke-opacity) and not(@display)]//*[name()='tspan']";
    public static String BarCountDisplay="Bar Count Display>//div[@id='RPE_Preview']//*[name()='text']//ancestor::*[name()='g' and @stroke-opacity and @font-size and @fill]//ancestor::*[@fill and @stroke][1]";
    public static String StackTotal_Chart="Stack Total Value in Chart>//div[@id='RPE_Preview']//*[name()='text' and not(@overflow)]//ancestor::*[@fill and @stroke and not(@role)]//*[@font-size and @stroke-opacity]";
    public static String StackTotal_Chart2="Stack Total Value in Chart>(//div[@id='RPE_Preview']//*[name()='text' and not(@overflow)]//ancestor::*[@fill and @stroke and not(@role)]//*[@font-size and @stroke-opacity])[2]";

    public static String StackTotal_Column_Chart="Stack Total in Column Chart>//div[@id='RPE_Preview']//*[name()='text']//ancestor::*[@fill and not(@role)]//*[name()='g' and not (@display)]/ancestor::*[@font-size and @stroke-opacity and @fill='#000000'][1]";
    
    //Legend in Stack Bar
    public static String Legend_="Legend>//div[@id='RPE_legend_header_div']/a";
    public static String Legends_Expand="Legends Expand>//div[@id='RPE_legend_header_div']//i";
    public static String Legend_Input="Legend Input>//input[@id='RPE_legend']";
    public static String Legend_InputToggle="Legend Input>//input[@id='RPE_legend']//ancestor::div[1]//span";
    public static String Legend_Text="Legend Text>//div[@id='RPE_cFlegend']//label[text()='Legend']";
    public static String LegendPosition_Input="Legend Position Input>//select[@id='RPE_legendpos']";
    public static String LegendPosition_Text="Legend Position Text>//div[@id='RPE_cFposition']//label[text()='Legend Position']";
    public static String LegendFontSize_Input="Legend Font Size Input>//select[@id='RPE_legendFontSize']";
    public static String LegendFontSize_Text="Legend Font Size Text>//div[@id='RPE_LedgendFontSize']//label[text()='Legend Font Size']";
    public static String Legend_Chart="Legend in Chart>//div[@id='RPE_Preview']//*[@aria-label='Legend']//*[@role='switch']";
    public static String Chart_Section_Display="Chart Section>//div[@id='RPE_Preview']//*[@transform and not(@role) and not(@fill)]/*[@fill='#ffffff' and @fill-opacity='0']";
    public static String Legend_Chart_Value="Legend Value in Chart>//div[@id='RPE_Preview']//*[@aria-label='Legend']//*[@role='switch']//*[@aria-label]";
    public static String Legend_Chart_ValueNew="Legend Value in Chart>//div[@id='RPE_Preview']//*[@aria-label='Legend']";

    //Grouped Bar..
    public static String X_Axis_Input_GroupedBar="X Axis input>//div[@id='yaxis_multiple_div_select']";
    public static String X_Axis_Text_GroupedBar="X Axis Text>//div[@id='RPE_yaxisBlock_div']//div[@id='RPE_yNumAxis_div']//span";
    public static String X_Axis_DropdownExpand="X Axis dropdown Expand>//ul[@id='select2-RPE_seriesSel4-results']";
    public static String AggSelect_X_Axis_dropdown="Agg Select option in X Axis Dropdown>//ul[contains(@id,'results')]//li//select[contains(@id,'agg_select')]";
    public static String Categorical_Agg_X_Axis_dropdown="Categorical Agg Option X Axis dropdown>(//ul//img[@src='./assets/images/Categorical.svg']//ancestor::li[1])[1]//select";
    public static String Date_Agg_X_Axis_dropdown="Date Agg Option X Axis dropdown>(//ul//img[@src='./assets/images/Date.svg']//ancestor::li[1])[1]//select";
    public static String Numerical_Agg_X_Axis_dropdown="Numerical Agg Option X Axis dropdown>(//ul//img[@src='./assets/images/Numerical.svg']//ancestor::li[1])[1]//select";
    public static String Text_Agg_X_Axis_dropdown="Text Agg Option X Axis dropdown>(//ul//img[@src='./assets/images/Text.svg']//ancestor::li[1])[1]//select";
    public static String Agg_FirstSearchedValue="Agg option in first searched value>//li[contains(@class,'results')][1]//select";
    public static String Selected_X_Axis_Value="Selected X Axis Value>//div[@id='yaxis_multiple_div_select']//div[@title]";
    public static String removeOptionSearched_Value="Removed Option Searched Value>//div[@id='yaxis_multiple_div_select']//div[@title]//span[@data-value]";
    public static String X_Axis_Limit_Error="X Axis Limit Error>//*[text()='Kindly select less than or equal to 10 column for Y axis']";
    public static String GroupInput_Numeric="Group option for Numeric in X Axis>//span[@id='select2-RPE_seriesSel3-container']";
    public static String GroupDropdown_Numeric_Expand="Numeric group dropdown Expand>//ul[@id='select2-RPE_seriesSel3-results']";
    public static String GroupError="Group Error>//*[contains(text(),'having less than 15 unique values')]";
    public static String Legend_X_Axis="Legend Values in chart>//div[@id='RPE_Preview']//*[@aria-label='Legend']//*[@aria-label]";
    
    //Grouped Column
    public static String Selected_Y_Axis_Value="Selected Y axis Value>//div[@id='yaxis_multiple_div_select']//div[@title]";
    public static String GroupInput_Numeric1="Group option for Numeric in Y Axis>//span[@id='select2-RPE_seriesSel3-container']";
    public static String Legends_Axis="Legend Values in chart>//div[@id='RPE_Preview']//*[@aria-label='Legend']//*[@aria-label]";

    
    //AllCharts Bar
    public static String X_Axis_text_="X Axis text>//span[text()='X axis']";
    public static String Y_Axis_text_="Y Axis text>//span[text()='Y axis']";
    public static String X_Axis_Input="X-Axis dropdown>//span[@id='select2-RPE_categorySel-container']";
    public static String Y_Axis_Input="Y-Axis dropdown>//span[@id='select2-RPE_seriesSel-container']";
    public static String X_Axis_dropdownResultsExp="X-Axis dropdown Results>//ul[@id='select2-RPE_categorySel-results']";
    public static String Y_Axis_dropdownResultsExp="Y-Axis dropdown Results>//ul[@id='select2-RPE_seriesSel-results']";
    public static String error="Error Message>//div[contains(@class,'alert')]";//div[contains(@class,'alert-dismissible')]
    public static String Y_Axis_Input_Group="Y Axis input>//div[@id='yaxis_multiple_div_select']";
    public static String Y_Axis_Text_Group="Y Axis Text>//div[@id='RPE_yaxisBlock_div']//div[@id='RPE_yNumAxis_div']//span";
    public static String Y_Axis_DropdownExpand="Y Axis dropdown Expand>//ul[@id='select2-RPE_seriesSel4-results']";
    public static String Categories_Input="Categories Input>//div[@id='RPE_categoriesMul_div']//div[@id='RPE_xaxis_div2_select']";
    public static String CategoriesText="Categories Text>//div[@id='RPE_categoriesMul_div']/span[text()='Categories']";
    public static String Categories_DropdownExpand="Categories Dropdown Expand>//ul[@id='select2-RPE_categoriesMul-results']";
    public static String Series_Input="Series input>//div[@id='RPE_seriesSel2DivSelect']";
    public static String Series_DropdownExpand="Series Dropdown Expand>//ul[@id='select2-RPE_seriesSel2-results']";
    public static String Start_Date_Input="Start Date Input>//span[@id='select2-RPE_ganntfrom-container']";
    public static String Start_Date_DropdownExpand="Start Date Dropdown Expand>//ul[@id='select2-RPE_ganntfrom-results']";
    public static String Duration_Input="Duration Input>//span[@id='select2-RPE_ganntduration-container']";
    public static String Duration_DropdownExpand="Duration Dropdown Expand>//ul[@id='select2-RPE_ganntduration-results']";
    public static String Category_Input="Category Input>//span[@id='select2-RPE_categorySel-container']";
    public static String Category_dropdownExpand="Category Dropdown Expand>//ul[@id='select2-RPE_categorySel-results']";
    public static String Value1_Input="Value1 Input>//span[@id='select2-RPE_seriesSel-container']";
    public static String Value1_DropdownExpand="Value1 dropdownExpand>//ul[@id='select2-RPE_seriesSel-results']";
    public static String Value2_Input="Value2 Input>//span[@id='select2-RPE_seriesSel2-container']";
    public static String Value2_DropdownExpand="Value2 dropdownExpand>//ul[@id='select2-RPE_seriesSel2-results']";
    public static String Color_Input="Color Input>//span[@id='select2-RPE_groupSel-container']";
    public static String Color_DropdownExpand="Color Dropdown Expand>//ul[@id='select2-RPE_groupSel-results']";
    public static String Date_Input="Date Input>//span[@id='select2-RPE_dateSel-container']";
    public static String Date_DropdownExpand="Date Dropdown Expand>//ul[@id='select2-RPE_dateSel-results']";
    public static String GroupDate_Input="Group Input>//span[@id='select2-RPE_groupbySel_timeline-container']";
    public static String GroupDate_dropdownExpand="Group Dropdown Expand>//ul[@id='select2-RPE_groupbySel_timeline-results']";
    public static String Sort_Input="Sort Input>//select[@id='RPE_sortSel']";
    public static String Series_Select_Input="Series Input>//div[@id='RPE_seriesSel2Mul_showArea']";
    public static String Series_Select_DropdownExpand="Series dropdownExpand>//ul[@id='select2-RPE_seriesSel2Mul-results']";
    public static String LineOption="Line Option>//input[@id='RPE_lineradio_input']";
    public static String ScatterOption="Scatter Option>//input[@id='RPE_scatterradio_input']";
    public static String Group_Input_Bullet="Group Input>//span[@id='select2-RPE_dateSel-container']";
    public static String Group_DropdownExpand_Bullet="Group dropdownExpand>//ul[@id='select2-RPE_dateSel-results']";
    public static String Target_Input="Target Input>//span[@id='select2-RPE_seriesSel-container']";
    public static String Target_DropdownExpand="Target dropdownExpand>//ul[@id='select2-RPE_seriesSel-results']";
    public static String Values_Select_Input="Values Input>//div[@id='RPE_seriesSel2Mul_showArea']";
    public static String Values_Select_DropdownExpand="Values dropdownExpand>//ul[@id='select2-RPE_seriesSel2Mul-results']";
    public static String Values_input_Circose="Values Input Circose>//div[@id='RPE_seriesSel2NoAggMul_showArea']";
    public static String Values_DropdownExpand_Circose="Values dropdownExpand Circose>//ul[@id='select2-RPE_seriesSel2NoAggMul-results']";
    public static String Open_Input="Open Input>//span[@id='select2-RPE_OpenSel-container']";
    public static String Open_dropdownExpand="Open DropdownExpand>//ul[@id='select2-RPE_OpenSel-results']";
    public static String High_Input="High Input>//span[@id='select2-RPE_highSel-container']";
    public static String High_dropdownExpand="High dropdown Expand>//ul[@id='select2-RPE_highSel-results']";
    public static String Low_Input="Low Input>//span[@id='select2-RPE_lowSel-container']";
    public static String Low_dropdownExpand="Low dropdown Expand>//ul[@id='select2-RPE_lowSel-results']";
    public static String Close_Input="Close Input>//span[@id='select2-RPE_closeSel-container']";
    public static String Close_DropdownExpand="Close dropdownExpand>//ul[@id='select2-RPE_closeSel-results']";
    public static String Country_Input="Country dropdown>//span[@id='select2-RPE_categorySel-container']";
    public static String Country_dropdownResultsExp="Country dropdown Results>//ul[@id='select2-RPE_categorySel-results']";
    public static String Series_MapBubble_Input="Series dropdown>//span[@id='select2-RPE_seriesSel-container']";
    public static String Series_dropdownResultsExp="Series dropdown Results>//ul[@id='select2-RPE_seriesSel-results']";
    public static String N_Grams_Input="N Grams input>//input[@id='RPE_ngrams']";
    public static String Top_K_FrequentInput="Top K Frequent Input>//input[@id='RPE_topKWords']";
    public static String CardColumnSelect_Input="Card Column Select Input>//span[@id='select2-RPE_Cardcolumn-container']";
    public static String CardColumnSelect_dropdownResults="Card Column Select dropdownResult>//ul[@id='select2-RPE_Cardcolumn-results']";
    public static String Plus_button="Plus button>//button[@class='RPE_addCardvalFormula']";
    public static String Card_Chart="Card Chart>//input[@id='RPE_WidgetName']//following::ul[@id='RPE_PreviewCard_card_data_div']";
    public static String Summary_Chart="Summary Chart>//input[@id='RPE_WidgetName']//following::div[contains(@class,'RPE_summary_values')]";
    public static String TimeLine_Input="Timeline dropdown>//span[@id='select2-RPE_categorySel-container']";
    public static String TimeLine_dropdownResultsExp="TimeLine dropdown Results>//ul[@id='select2-RPE_categorySel-results']";
    public static String KPI_Name_Input="KPI Name Input>//div[@id='RPE_seriesSel4_showArea']";
    public static String KPI_Name_dropdownResults="KPI_Name Dropdown results>//ul[@id='select2-RPE_seriesSel4-results']";
    public static String Group_Select_Input="Group Input>//div[@id='RPE_seriesSel2NoAggMuldivSel']";
    public static String Group_DropdownResults="Group dropdown results>//ul[@id='select2-RPE_seriesSel2NoAggMul-results']";
    public static String Period_input="Period Input>//select[@id='RPE_PeriodSel']";
    public static String Period_Count_Input="Period Count Input>//input[@id='RPE_periodCount']";
    public static String KPI_Card_Chart="KPI Card Chart>//input[@id='RPE_WidgetName']//following::div[@id='RPE_Preview']//div[@ref='gridBody']";
    public static String Groups_Input_CustomPivot="Groups Input >//div[@id='RPE_categoriesMul_showArea']";
    public static String Groups_DropdownResults_CustomPivot="Groups dropdown results>//ul[@id='select2-RPE_categoriesMul-results']";
    public static String Values_Input_CustomPivot="Values Input>//div[@id='RPE_seriesSel4_showArea']";
    public static String Values_DropdownResults_CustomPivot="Values Dropdown results>//ul[@id='select2-RPE_seriesSel4-results']";
    public static String Date_Input_Sparkline="Date dropdown>//span[@id='select2-RPE_categorySel-container']";
    public static String Date_dropdownResultsExp_Sparkline="Date dropdown Results>//ul[@id='select2-RPE_categorySel-results']";
    public static String Categories_input_Sparkline="Categories_input_Sparkline>//div[@id='RPE_seriesSel2NoAggMul_showArea']";
    public static String Categories_DropdownExpand_Sparkline="Categories_DropdownExpand_Sparkline>//ul[@id='select2-RPE_seriesSel2NoAggMul-results']";
    public static String PeriodInput="Period Input>//input[@id='RPE_periodNum']";
    public static String Numericals_Input_Sparkline="Numericals Input >//div[@id='RPE_MultipleSelection_showArea']";
    public static String Numericals_DropdownExpand_Sparkline="Numericals Dropdown expand >//ul[@id='select2-RPE_MultipleSelection-results']";
    public static String ColumnSelect_SectionPivot="Column List Pivot>//div[@ref='primaryColsListPanel']";
    public static String PivotSearch="Pivot Search Input>//div[@ref='primaryColsHeaderPanel']//input[@aria-label='Filter Columns Input']";
    public static String TextTypeInput_Chart="Text Input Area in Chart>//div[@id='RPE_labelTextDiv']";
    public static String TypeInput_TextChart="Text input in Text chart>//label[@id='RPE_labelText']";
    
    //Pivot chart
    public static String Pivot_Column_Panel="Pivot Column Panel>//div[@class='ag-column-panel']";
    public static String Column_Icon_Pivot="Column Icon Pivot>//span[text()='Columns']//ancestor::button[@ref='eToggleButton'][1]";
    public static String ColumnList_Sec_Pivot="Column List Section Pivot>//div[@ref='primaryColsListPanel']/div";
    public static String Row_Groups_Pivot="Row Groups in Pivot>//span[text()='Row Groups']//ancestor::div[2]//div[@aria-label='Row Groups']";
    public static String Row_Groups_text="Row Groups>//div[@id='RPE_Preview']//span[text()='Row Groups']";
    public static String Values_Pivot="Values in Pivot >//span[text()='Values']//ancestor::div[2]//div[@aria-label='Values']";
    public static String Values_Text="Values Text>//div[@id='RPE_Preview']//span[text()='Values']";
    public static String ColumnLabels_Pivot="ColumnLabels in Pivot>//span[text()='Column Labels']//ancestor::div[2]//div[@aria-label='Column Labels']";
    public static String ColumnLabels_Text="ColumnLabels in Pivot>//div[@aria-label='Column Labels']//following::span[text()='Column Labels'][1]";
    public static String ColumnValues_List="Column Values List>//div[@aria-label='Column List']/div";
    public static String FirstCheckBox="First Check box>(//div[@aria-label='Column List']/div//div[@ref='eWrapper'])[1]";
    public static String FirstDrag="First Drag Element>(//div[@aria-label='Column List']/div//span[contains(@class,'drag-handle')])[1]";
    public static String DragAndDrop_ColumnList="Drag and drop in Column List>//div[@aria-label='Column List']/div//span[contains(@class,'column-drag-handle')]";
    public static String CheckBox_ColumnList="Check Box in Column List>//div[@aria-label='Column List']/div//div[@ref='eWrapper']";
    public static String SearchInput_Pivot="Search Input in Pivot panel>//div[@class='ag-column-panel']//input[@aria-label='Filter Columns Input']";
    public static String List_RowGroup="List in Row Group>//span[text()='Row Groups']//ancestor::div[2]//div[@aria-label='Row Groups']//span[@ref='eText']";
    public static String List_Values="List in Values>//span[text()='Values']//ancestor::div[2]//div[@aria-label='Values']//span[@ref='eText']";
    public static String List_ColumnLabels="List in Column Labels>//span[text()='Column Labels']//ancestor::div[2]//div[@aria-label='Column Labels']//span[@ref='eText']";
    public static String Drag_RowGroupList1="Drag Icon In Row GroupList1>(//span[text()='Row Groups']//ancestor::div[2]//div[@aria-label='Row Groups']//span[@ref='eDragHandle'])[1]";
    public static String Drag_RowGroupList2="Drag Icon In Row GroupList2>(//span[text()='Row Groups']//ancestor::div[2]//div[@aria-label='Row Groups']//span[@ref='eDragHandle'])[2]";
    public static String ColumnList1_RowGroup="ColumnList1 in Row Group>(//span[text()='Row Groups']//ancestor::div[2]//div[@aria-label='Row Groups']//span[@ref='eText'])[1]";
    public static String SelctedColumn="Selected Column>//div[contains(@class,'checked')]//ancestor::div[@role='treeitem']//span[@ref='eLabel']";
    public static String SortingOption_RowGroupList="Sorting Option in Row GroupList>(//span[text()='Row Groups']//ancestor::div[2]//div[@aria-label='Row Groups']//span[@ref='eSortIndicator'])[1]";
    public static String SortingType_RowGroup="SortingType Row Group>(//span[text()='Row Groups']//ancestor::div[2]//div[@aria-label='Row Groups']//span[@ref='eSortIndicator'])[1]/span[not(contains(@class,'ag-hidden'))]";
    public static String AggregationDropdown="Aggregation dropdown>//div[@aria-label='Aggregation Function']/div";
    public static String Drag_ValuesList1="Drag Icon In Values List1>(//span[text()='Values']//ancestor::div[2]//div[@aria-label='Values']//span[@ref='eDragHandle'])[1]";
    public static String Drag_ValuesList2="DragIcon In Values List2>(//span[text()='Values']//ancestor::div[2]//div[@aria-label='Values']//span[@ref='eDragHandle'])[2]";
    public static String Drag_ColumnLabelsList1="Drag Icon In Column Labels List1>(//span[text()='Column Labels']//ancestor::div[2]//div[@aria-label='Column Labels']//span[@ref='eDragHandle'])[1]";
    public static String Drag_ColumnLabelsList2="Drag Icon In Column Labels List2>(//span[text()='Column Labels']//ancestor::div[2]//div[@aria-label='Column Labels']//span[@ref='eDragHandle'])[2]";
    public static String CancelButton_ColumnLabels="Cancel button Column Lables>(//span[text()='Column Labels']//ancestor::div[2]//div[@aria-label='Column Labels']//span[@ref='eButton'])[1]";
    public static String CancelButton_Values="Cancel button Values>(//span[text()='Values']//ancestor::div[2]//div[@aria-label='Values']//span[@ref='eButton'])[1]";
    public static String CancelButton_RowGroups="Cancel button RowGroups>(//span[text()='Row Groups']//ancestor::div[2]//div[@aria-label='Row Groups']//span[@ref='eButton'])[1]";
    public static String FirstHeader_PivotChart="First Headed Pivot Chart>(//div[@id='RPE_Preview']//div[@role='columnheader'])[1]";
    public static String SecondHeader_PivotChart="Second Headed Pivot Chart>(//div[@id='RPE_Preview']//div[@role='columnheader'])[2]";
    public static String SecondHeaderMenuOption="Menu Option in Seacond Header>(//div[@id='RPE_Preview']//div[@role='columnheader'])[2]//span[@ref='eMenu']";
    public static String FirstHeaderMenuOption="Menu Option in First Header>(//div[@id='RPE_Preview']//div[@role='columnheader'])[1]//span[@ref='eMenu']";
    public static String MenuList_Open="Column Menu Options Expand>//div[@id='RPE_Preview']//div[@aria-label='Column Menu']";
    public static String PinColumn_Option="Pin Column Option>//div[@id='RPE_Preview']//div[@aria-label='Column Menu']//span[text()='Pin Column']";
    public static String PinLeftOption="Pin Left Option>//div[@id='RPE_Preview']//span[text()='Pin Left']";
    public static String PinRightOption="Pin Right Option>//div[@id='RPE_Preview']//span[text()='Pin Right']";
    public static String NoPinOption="No pin Option>//div[@id='RPE_Preview']//span[text()='No Pin']";
    public static String FirstHeader_position="First Header Position Chart>(//div[@id='RPE_Preview']//div[@role='columnheader']/ancestor::div[@role='presentation'][1])[1]";
    public static String SecondHeader_position="Second Header Position Chart>(//div[@id='RPE_Preview']//div[@role='columnheader']/ancestor::div[@role='presentation'][1])[2]";
    public static String Multiple_PinColumnLeft="Multiple pinned Left Column>//div[@id='RPE_Preview']//div[@role='presentation' and contains(@class,'pinned-left')]//div[@role='columnheader']";
    public static String Multiple_PinColumnRight="Multiple pinned Right Column>//div[@id='RPE_Preview']//div[@role='presentation' and contains(@class,'pinned-right')]//div[@role='columnheader']";
    public static String LeftPinnedColumn_Menu="Left Pinned Column menu>//div[@id='RPE_Preview']//div[@role='presentation' and contains(@class,'pinned-left')]//div[@role='columnheader']//span[@ref='eMenu']";
    public static String RightPinnedColumn_Menu="Right Pinned Column menu>//div[@id='RPE_Preview']//div[@role='presentation' and contains(@class,'pinned-right')]//div[@role='columnheader']//span[@ref='eMenu']";
    public static String FirstHeaderText_PivotChart="First Headed Pivot Chart>(//div[contains(@class,'RPE_Previewtableheader')])[1]//span[@ref='eText']";
    public static String FirstHeader_Sort="FirstHeader Sort>(//div[@id='RPE_Preview']//div[@role='columnheader'])[1]//span[@ref='eSortIndicator']/span[not(contains(@class,'ag-hidden'))]";
    public static String FirstCell="First Cell>//div[@id='RPE_Preview']//div[@aria-rowindex='2']//div[@aria-colindex='1' and @col-id='ag-Grid-AutoColumn']";
    public static String SecondCell="Second Cell>//div[@id='RPE_Preview']//div[@aria-rowindex='3']//div[@aria-colindex='1' and @col-id='ag-Grid-AutoColumn']";
    public static String First_Row="First Row>//div[@id='RPE_Preview']//div[@aria-rowindex='2']//div[@aria-colindex='1' and @col-id='ag-Grid-AutoColumn']/ancestor::div[@role='row']";
    
    //Pivot Chart Format
    public static String Hide_Agg_Header_inputToggle="Hide Aggreation Header input toggle>//input[@id='RPE_HideAggregationOnHeader']";
    public static String Hide_Agg_Header_text="Hide Aggreation Header text>//label[text()='Hide Aggregation on Header']";
    public static String Hide_Agg_Heade_toggle="Hide Aggreation Header input toggle>//input[@id='RPE_HideAggregationOnHeader']/ancestor::div[1]//span";
    public static String PanelFontSize_Input="Panel Font Size Input>//select[@id='RPE_PannelFontSize']";
    public static String PanelFontSize_Text="Panel Font Size Text>//label[text()='Pannel Font Size']";
    public static String PanelFontSize_InuptResults="Panel Font Size Input Results>//select[@id='RPE_PannelFontSize']/option";
    public static String GrandTotal_Input_Toggle="Grand Total Input toggle>//input[@id='RPE_grandrowtotal']";
    public static String Grand_Total_Cell_Chart="Grand Total Cell >//div[@id='RPE_Preview']//div[contains(@col-id,'pivot_GrandRowTotal') and not(@role='columnheader')]";
    public static String Valuewise_Input_Toggle="Valuewise Input toggle>//input[@id='RPE_valuewiserowtotal']";
    public static String Valueswise_toggle="Valuewise toggle>//input[@id='RPE_valuewiserowtotal']/ancestor::div[1]//span";
    public static String Valueswise_text="Valuewise Total text>//label[text()='Valuewise Total']";
    public static String ResultPivot_Chart="Result Pivot chart>//div[@id='RPE_Preview']//div[@ref='gridHeader']";
    public static String ValuewiseTotal_Cell="Valuewise Total Cell>//div[@id='RPE_Preview']//div[contains(@class,'RPE_Previewtablerowtotalcolor') and not(@role='columnheader')]";
    public static String Highlights_ValuewiseTotalInput="Highlights Valuewise Total input>//input[@id='RPE_tablerowtotalColor']";
    public static String Highlighs_ValuesTotalText="Highlight Valuewise Total text>//label[text()='Highlight Valuewise Total']";
    public static String Pivot_ChartBody="Pivot Body Chart>(//div[@id='RPE_Preview']//div[@ref='eViewport']//div[@role='gridcell'])[1]";
    public static String HighlightGrandTotal_Input="Highlight Grand Total Input>//input[@id='RPE_tablegrandrowtotalColor']";
    public static String HighlightGrandTotal_Text="Highlight Grand Total Text>//*[text()='Highlight Grand Total']";
    public static String HighlightColumnTotal_Input="Highlight column total>//input[@id='RPE_tablecoltotalColor']";
    public static String HighlightColumnTotal_Text="Highlight column total Text>//label[text()='Highlight Column Total']";
    public static String ExpandedRowGroup_Input_Toggle="Expand row group toggle>//input[@id='RPE_expandall']";
    public static String ExpandedRowGroup_Toggle="Expand Row Group Toggle>//input[@id='RPE_expandall']//ancestor::div[1]//span";
    public static String ExpandedRowGroup_text="Expand Row group Text>//label[text()='Expand Row Groups']";
    public static String CollapseRowGroup_Input_toggle="Collapse Row Group toggle>//input[@id='RPE_collapseall']";
    public static String CollapseRowGroup_toggle="Collapse Row Group toggle>//input[@id='RPE_collapseall']/ancestor::div[1]//span";
    public static String CollapseRowGroup_Text="Collapse Row Group Text>//label[text()='Collapse Row Groups']";

    public static String ExpandColumnGroup_Input_toggle="Expand Column Input toggle>//input[@id='RPE_expandColGroup']";
    public static String ExpandColumnGroup_toggle="Expand Column toggle>//input[@id='RPE_expandColGroup']/ancestor::div[1]//span";
    public static String ExpandColumnGroup_Text="Expand Column Text>//label[text()='Expand Column Groups']";
    public static String CollapseColumnGroup_Input_toggle="Collapse Column Input toggle>//input[@id='RPE_collapseColGroup']";
    public static String CollapseColumnGroup_toggle="Collapse Column toggle>//input[@id='RPE_collapseColGroup']/ancestor::div[1]//span";
    public static String CollapseColumnGroup_Text="Collapse Column Text>//label[text()='Collapse Column Groups']";
    public static String ColumnHeaderExpand="Column Header>(//div[@id='RPE_Preview']//div[@role='columnheader' and @aria-expanded])[1]";
    public static String SelectAll_pivotColumn="Select all pivot Column>//input[@aria-label='Toggle Select All Columns']";
    
    //Column 
    public static String X_Label_Position_Input="X Label Position Input>//select[@id='RPE_labelposition']";
    public static String Grid_Distance_Input="Grid Distance Input>//select[@id='RPE_mingrddistance']";
    public static String Grid_Chart="Grid chart>(//div[@id='RPE_Preview']//*[name()='g' and @aria-label='Chart']//*[name()='g' and @transform and @style])[1]//*[name()='g' and @stroke='#000000' and not(@display) and not(@stroke-dasharray)]";
    public static String Grid_Stacked_Column="Grid Chart>//div[@id='RPE_Preview']//*[name()='g' and @aria-label='Chart']//*[name()='g' and @fill-opacity and @fill]/ancestor::*[name()='g' and @transform][1]//*[name()='g' and @stroke='#000000' and not(@display) and not(@stroke-dasharray)]";
    
    //Grouped Bar
    public static String StatsLineColumnInput="StatsLine Column Input>//div[@id='RPE_statslines']//select";
    public static String StatsLineColumn_Error="StatsLine Column Error>//*[text()='Kindly select column to perform stats line']";
    public static String StatsLineColumnOption="StatsLineColumn Option>//div[@id='RPE_statslines']//select/option";
    public static String StatsLineColumnOptionsDisplayed="StatsLineColumn Option>//ul[@id='select2-RPE_statscol-results']/li[not(@style='display: none;')]";
    public static String statsLineCOlumn_Select_Input="Select Column Input>//span[@id='select2-RPE_statscol-container']";
    
    //Line Widget
    public static String LineStyle_Input="Line Style Input>//select[@id='RPE_linestyle']";
    public static String LineStyle_text="Line Style Text>//div[@id='RPE_cFLinestyle']//label[text()='Line Style']";
    public static String LineStyle_Options="Line Style Options>//select[@id='RPE_linestyle']/option";
    public static String StrokeWidth_Input="Stroke Width Input>//select[@id='RPE_linestrokewidth']";
    public static String StrokeWidth_text="Stroke Width text>//label[text()='Stroke Width']";
    public static String StrokeWidthOptions="StrokeWidth Options>//select[@id='RPE_linestrokewidth']/option";
    public static String LineStyleAppliedChart="Line Style in chart>//div[@id='RPE_Preview']//*[@role='group' and @stroke-width and @stroke-dasharray ]";
    public static String ZoomRange_toggle="Zoom Rannge toggle>//input[@id='RPE_ZoomRange']";
    public static String ZoomRange_Select_Toggle="Zoom Range Select Toggle>//input[@id='RPE_ZoomRange']/ancestor::label/span";
    public static String ZoomOption_Chart="Zoom Options in chart>//div[@class='amcharts-range-selector-period-wrapper']";
    public static String IgnoreZero_toggle="IgnoreZero toggle>//input[@id='RPE_ignorezero']";
    public static String IgnoreZero_Input_toggle="IgnoreZero toggle>//input[@id='RPE_ignorezero']/ancestor::label/span";
    public static String IgnoreZero_text="Ignore Zero text>//label[text()='Ignore Zeros']";
    
    public static String Deviations_Section="Deviations section>//div[@id='RPE_deviation_header_div']/a";
    public static String Deviation_Expand="Deviation Expand>//div[@id='RPE_deviation_header_div']/a/i";
    public static String Deviation_Active="Deviation Active>//div[@id='RPE_deviation_header_div']/a[@class='active']";
    public static String Deviation_toggle="Deviation toggle>//input[@id='RPE_deviation']";
    public static String Deviation_Input_toggle="Deviation Input toggle>//input[@id='RPE_deviation']/ancestor::label/span";
    public static String Deviation_Column_Area="Deviation Column Area>//div[@id='RPE_deviationCols_showArea']";
    public static String Deviation_Input_Area_Disable="Deviation Input Area>//div[@id='RPE_deviationCols_showArea' and @disabled]";
    public static String Selected_deviations="Selected deviations>//div[@id='RPE_deviationCols_showArea']//div[@title]";
    public static String Value_FontSize_Deviation="Value FontSize in deviation>//select[@id='RPE_DeviationColsValueFontSize']";
    public static String Label_FontSize_Deviation="Label FontSize in deviation>//select[@id='RPE_DeviationColsLabelFontSize']";
    public static String Percentage_FontSize_Deviation="Percentage Font Size in Deviation>//select[@id='RPE_DeviationColsPercentFontSize']";
    public static String Deviation_FontFamily="Deviation Font Family>//span[@id='select2-RPE_DeviationColsFontFamily-container']";
    public static String Devialtion_FontFamilyResults="Deviation Font Family Results>//ul[@id='select2-RPE_DeviationColsFontFamily-results']";
    public static String Deviation_Alignment="Deviation Alignment>//div[@id='RPE_DeviationColsAlignment']";
    public static String DefaultAlignment_dev="Default Alignment Deviation>//div[@id='RPE_DeviationColsAlignment']/i[contains(@class,'active')]";
    public static String Deviation_Alignment_Left="Deviation Alignment left>//div[@id='RPE_DeviationColsAlignment']/i[@data-align='left']";
    public static String Deviation_Alignment_Right="Deviation Alignment Right>//div[@id='RPE_DeviationColsAlignment']/i[@data-align='right']";
    public static String Deviation_Alignment_Center="Deviation Alignment Center>//div[@id='RPE_DeviationColsAlignment']/i[@data-align='center']";
    public static String Overlap_toggle_deviation="Overlap toggle>//input[@id='RPE_deviationoverlap']";
    public static String Overlap_Input_toggle_deviation="Overlap Input toggle>//input[@id='RPE_deviationoverlap']/ancestor::label/span";
    public static String Seperator_Input_deviation="Seperator Input deviation>//select[@id='RPE_DeviationSeperatorValue']";
    public static String BigNumber_Suffix_toggle_deviation="BigNumber Suffix toggle>//input[@id='RPE_Deviationbignumber']";
    public static String BigNumber_Suffix_Inputtoggle_deviation="BigNumber Suffix toggle>//input[@id='RPE_Deviationbignumber']/ancestor::label/span";
    public static String RoundOff_Input_Deviation="RoundOff Input in Deviation>//select[@id='RPE_DeviationRoundValue']";
    public static String Order_Deviation="Order in Deviation>//div[@id='RPE_DeviationColsOrder']";
    public static String Order_Deviation1="Order 1 in Deviation>//div[@id='RPE_DeviationColsOrder']//div";
    public static String Order_Value="Order Value>//div[@id='RPE_DeviationColsOrder']//div[contains(@id,'value')]";
    public static String Order_Label="Order Label>//div[@id='RPE_DeviationColsOrder']//div[contains(@id,'label')]";
    
    public static String Deviation_Chart="Deviation displayed in chart>//div[@id='RPE_Preview']//*[@aria-label='Chart']/*/*[name()='g' and @fill and @id]//*[name()='foreignObject']/div";
    public static String Deviation_FontFamilyChart="Deviation Font Family>(//div[@id='RPE_Preview']//*[@aria-label='Chart']/*/*[name()='g' and @fill and @id]//*[name()='foreignObject']//div)[3]";
    public static String LineChart_Area="Line Chart displayed Area>//div[@id='RPE_Preview']//*[@aria-label='Chart']//*[not(@focusable) and not(@fill)]/*[name()='g' and @fill='#ffffff']/*[name()='rect']";
    public static String Deviation_Values="Deviation Values in chart>//div[@id='RPE_Preview']//*[@aria-label='Chart']/*/*[name()='g' and @fill and @id]//*[name()='foreignObject']/div//b/span";
    public static String Deviation_LastValue="Deviation Last Value in chart>(//div[@id='RPE_Preview']//*[@aria-label='Chart']/*/*[name()='g' and @fill and @id]//*[name()='foreignObject']/div//b/span)[3]";
    public static String Deviation_PercentageValue="Deviation Percentage Value>//div[@id='RPE_Preview']//*[@aria-label='Chart']/*/*[name()='g' and @fill and @id]//*[name()='foreignObject']//div/span[contains(@style,'color')]";
    public static String Deviation_LabelValue="Deviation Label Value>//div[@id='RPE_Preview']//*[@aria-label='Chart']/*/*[name()='g' and @fill and @id]//*[name()='foreignObject']//div/span[not(contains(@style,'color'))]";

    //Gantt
    public static String  AvailableList_Dropdown="Available List>//ul[contains(@id,'results')]//li[not(contains(@style,'display'))]";
    public static String Gantt_Y_Axis_Label="Y Axis Label Chart>((//div[@id='RPE_Preview']//*[name()='g'])//*[name()='g' and @font-size and @transform and not(@aria-label)])[1]";
    public static String Gantt_X_Axis_Label="X_Axis Label Chart>(//div[@id='RPE_Preview']//*[@transform]/*[name()='g' and @font-size])//*[name()='g' and @font-size and @transform and not(@aria-label)]";
    public static String FontFamily_Input_DataLabel="Font Family Input in Data Label>//span[@id='select2-RPE_enableValueFontFamily-container']";
    public static String FontFamily_Results="Font Family Results>//ul[@id='select2-RPE_enableValueFontFamily-results']";
    public static String FontFamiy_Results_List="Font Family Results List>//ul[@id='select2-RPE_enableValueFontFamily-results']//li";
    public static String FontFamily_Text="FontFamily Text>//div[@id='RPE_cFontFamilyLabel']//label[text()='Font Family']";
    
    //Text Widget
    public static String GradientColor_Input1="Gradient Color Input 1>//input[@id='RPE_BGColor']";
    public static String Gradient_InputPointer1="GradientInput Pointer>//input[@id='RPE_BGColor']//following::div[1]";
    public static String GradientColor_Input2="Gradient Color Input 2>//input[@id='RPE_BGColor2']";
    public static String Gradient_InputPointer2="GradientInput Pointer2>//input[@id='RPE_BGColor2']//following::div[1]";
    public static String Color_Gradient_text="Color Gradient>//label[text()='Color Gradient']";
    public static String Border_Radius_Input="Border Radius Input>//input[@class='set-border-radius-checkbox']";
    public static String Border_Radiun_Toggle="Border Radius Toggle>//input[@class='set-border-radius-checkbox']/ancestor::label/span";
    public static String Border_Radius_text="Border Radius text>//label[text()='Border Radius']";
    public static String Position_Input_Label="Position Input>//select[@id='RPE_LabelPosition']";
    public static String FontColor_Input_Label="Font Color Input>//input[@id='RPE_SummaryLabelcolorPicker']";
    public static String FontColor_Input_Pointer="Font Color Input Pointer>//input[@id='RPE_SummaryLabelcolorPicker']//following::div[1]";
    public static String FontFamily_Input_Label="Font Family Input>//span[@id='select2-RPE_SummaryLabelFontFamily-container']";
    public static String Font_Color_text_Label="Font Color Text>//div[@id='RPE_Label_div']//label[text()='Font Color']";
    public static String Font_Family_Results_Label="Font Family Results>//ul[@id='select2-RPE_SummaryLabelFontFamily-results']";
    public static String FontSize_Input_Label="Font Size Input >//select[@id='RPE_SummaryLabelfontsize']";
    public static String Bold_Label_Formating="Bold Label Formating>//div[@id='RPE_LabelFormatting']/i[@id='RPE_fontbold']";
    public static String Italic_Label_Formating="Italic Label Formating>//div[@id='RPE_LabelFormatting']/i[@id='RPE_fontitalic']";
    public static String Series_Limit_Error="Series Limit Error>//*[text()='Kindly select less than or equal to 10 column in series']";
    public static String RemoveOption_SeriesDropdown="Remove Option Series Dropdown>//div[@id='seriesSel2MuldivSel']//div[@title]//span[@data-value]";
    public static String Selected_Series_value="Selected Series value>//div[@id='seriesSel2MuldivSel']//div[@title]";
    public static String Y1_Title_Input="Y1 Title Input>//input[@id='RPE_LineYtitle']";
    public static String Y1_Title_Text="Y1 Title text>//label[@id='RPE_LineYOppositetitleLabel']";
    public static String Y1_Value_Chart="Y1 Value in Chart>(//div[@id='RPE_Preview']//*[@font-family and @font-size and @fill]//*[name()='tspan'])";
    public static String X_Label_Value_Chart="X_Label Value Chart>((//div[@id='RPE_Preview']//*[name()='g' and @aria-hidden and @font-family])[2]//*[@font-size and not(@stroke-opacity)])";
    public static String Y_Label_Value_Chart="Y Label Value Chart>(//div[@id='RPE_Preview']//*[name()='g' and @transform]/*[name()='g']/*[@font-size and not(@stroke-opacity) and not(@display)])";
  
}    
