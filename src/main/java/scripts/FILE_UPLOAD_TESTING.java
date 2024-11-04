package scripts;

import org.openqa.selenium.WebDriver;

import commonMethods.Keywords;
import commonMethods.Utils;

public class FILE_UPLOAD_TESTING extends Keywords{

	
	public void file_uploading(WebDriver driver,int iteration) {
		
		String TestcaseFileName="FILE_UPLOAD";
		String SheetName="FILE UPLOAD";
		String TestcaseID_Flag="Flag";
		String TescasesID_Column="TEST CASE ID";
		//Yes/No Input for Testcases Id
		String TC_FILEUPLOAD_001=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_FILEUPLOAD_001",TestcaseID_Flag);
		String TC_FILEUPLOAD_002=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_FILEUPLOAD_002",TestcaseID_Flag);
		String TC_FILEUPLOAD_003=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_FILEUPLOAD_003",TestcaseID_Flag);
		String TC_FILEUPLOAD_004=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_FILEUPLOAD_004",TestcaseID_Flag);
		String TC_FILEUPLOAD_005=getTestcaseID_Flag(TestcaseFileName,SheetName,TescasesID_Column,"TC_FILEUPLOAD_005",TestcaseID_Flag);

		
		//Iteration inputs
		String Valid_CSV_FileName=Utils.getDataFromTestDataIteration(iteration,"File_Upload", "Valid_CSV_FileName");
		String InValid_FileName=Utils.getDataFromTestDataIteration(iteration,"File_Upload", "InValid_FileName");
		String Zip_File_name=Utils.getDataFromTestDataIteration(iteration,"File_Upload", "Zip_File_name");
		String Change_Project_Name=Utils.getDataFromTestDataIteration(iteration,"File_Upload", "Change_Project_Name");
		String Change_File_Name=Utils.getDataFromTestDataIteration(iteration,"File_Upload", "Change_File_Name");

		
		String ValidFile_Path=System.getProperty("user.dir") + "\\testdata\\"+Valid_CSV_FileName+".csv";
		String InValidFile_Path=System.getProperty("user.dir") + "\\testdata\\"+InValid_FileName;
		String ZipFile_Path=System.getProperty("user.dir") + "\\testdata\\"+Zip_File_name;
		System.out.println("InValidFile_Path : "+InValidFile_Path);
		System.out.println("ValidFile_Path : "+ValidFile_Path);
		System.out.println("ZipFile_Path : "+ZipFile_Path);
		
		
		waitForElement(driver,HomePage);
		waitForElement(driver,Data_Analytics_page_link);
		click(driver,Data_Analytics_page_link);
		elementnotvisible(driver,Loading);
		click(driver,Create_project);
		waitForElement(driver, file_upload_page);
		
		if(TC_FILEUPLOAD_002.equals("Yes")) {
			setTestCaseID("TC_FILEUPLOAD_002");
			if(verifyElementDisplayed(driver,AddFiles)) {
				uploadfile(driver,InValidFile_Path);
				if(isDisplayed2(driver,error)){
					fail(driver,"Error displayed when upload the invalid file");
				}
				if(verifyElementDisplayed(driver, Upload_Btn)) {
					click(driver,Upload_Btn);
					if(isDisplayed2(driver, error)) {
						String ErrorText=getText1(driver,error);
						if(ErrorText.contains("Please refer the logs in Logs")) {
							fail(driver,"'Please refer the logs in Logs' error is displayed When upload the invalid file");
						}else {
							pass(driver,"'Invalid delimeter'  error is displayed When upload the invalid file");
						}
					}
				}
				
			}
		}
		
		if(TC_FILEUPLOAD_003.equals("Yes")) {
			setTestCaseID("TC_FILEUPLOAD_003");
			waitForElement(driver,DataExplorer);
			mouseOverAndClick(driver, DataExplorer);
			waitForElement(driver, Data_Source);
			click(driver, Data_Source);
			waitForElement(driver, AddFiles);
			uploadfile(driver,ZipFile_Path);
			waitForElement(driver, Upload_Btn);
			click(driver,Upload_Btn);
			if(isDisplayed2(driver, error)) {
				fail(driver,"Error Displayed when upload the Zip file with Valid CSV File");
			}else {
				pass(driver,"Error not displayed When upload the Zip file with Valid CSV File");
				elementnotvisible1(driver,upload_wait);
				elementnotvisible1(driver, Loading1);
			}
			
		}
		
		if(TC_FILEUPLOAD_001.equals("Yes")) {
			setTestCaseID("TC_FILEUPLOAD_001");
			if(TC_FILEUPLOAD_003.equals("Yes") || TC_FILEUPLOAD_002.equals("Yes")) {
				waitForElement(driver,DataExplorer);
				mouseOverAndClick(driver, DataExplorer);
				waitForElement(driver, Data_Source);
				click(driver, Data_Source);
			}
			
			waitForElement(driver, AddFiles);
			uploadfile(driver,ValidFile_Path);
			String AddedFileName=getText1(driver,FileName_text);
			if(AddedFileName.contains(Valid_CSV_FileName)){
				pass(driver,"Correct File is Added");
			}else {
				fail(driver,"Different File is Added, Actual name : "+AddedFileName);
			}
			
			
			if(TC_FILEUPLOAD_004.equals("Yes")) {
				if(verifyElementDisplayed(driver, ProjectName_Input_FileUpload)) {
					clear1(driver,ProjectName_Input_FileUpload);
					sendKeys(driver,ProjectName_Input_FileUpload,Change_Project_Name);
					wait(driver,"1");
					String projectName=getTextJavascript(driver, ProjectName_Input_FileUpload);
					if(projectName.equals(Change_Project_Name)) {
						pass(driver,"Project Name is changed in the input successfully");
					}else {
						fail(driver,"Project Name is not changed in the input successfully");
					}
					
				}
			}
			
			if(TC_FILEUPLOAD_005.equals("Yes")) {
				if(verifyElementDisplayed(driver, Edit_Icon_FileName)) {
					click(driver,Edit_Icon_FileName);
					clear1(driver,FileName_Input_FileUpoad);
					sendKeys(driver,FileName_Input_FileUpoad,Change_File_Name);
					wait(driver,"1");
					click(driver,FileName_YesBtn);
					wait(driver,"1");
					String fileName=getText1(driver, FileName_Output);
					try {
						if(fileName.equals(Change_File_Name)) {
							pass(driver,"File Name is changed successfully");
						}else {
							fail(driver,"File Name is not changed successfully");
						}
					}catch(Exception e) {
						fail(driver,"Unable to get File Name "+e.getLocalizedMessage());
					}
				}
			}
			
			waitForElement(driver, Upload_Btn);
			click(driver,Upload_Btn);
			if(isDisplayed(driver, error)) {
				fail(driver,"Error Displayed when upload the Valid CSV File");
			}else {
				pass(driver,"Error not displayed When upload the Valid CSV File");
				waitForElement(driver,upload_wait);
				elementnotvisible1(driver,upload_wait);
				verifyElementDisplayed(driver,fileUploaded_1);
				verifyElementDisplayed(driver,fileUploaded_2);
				verifyElementDisplayed(driver,fileUploaded_3);
				elementnotvisible1(driver,fileUploaded_3);
				elementnotvisible1(driver, Loading1);
				
			}
		}
	
		verifyElementDisplayed(driver, Preview_text);

	}
}
