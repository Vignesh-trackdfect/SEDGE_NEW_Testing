package Mail;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.testng.ITestResult;
import org.testng.Reporter;

import atu.testng.reports.logging.LogAs;
import atu.testng.reports.utils.Steps;
import commonMethods.Utils;

public class EmailContent {

   static String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
   static String mailID = Utils.getDataFromTestConfig("Receiver");
   static String reportname = Utils.getDataFromTestConfig("Project_Name");
   static String buildVersion = Utils.getDataFromTestConfig("Version_Name");
   static String Description = Utils.getDataFromTestConfig("Description");
	public static void sendEmail(List<ITestResult> pass, List<ITestResult> fail,List<ITestResult> skip,List<String> filePaths,List<String> passFilePath) throws Exception {
		
		int passedTests=pass.size();
		int failedTests=fail.size();
		int skipTests=skip.size();
		int totalTests=passedTests+failedTests+skipTests;
		
		  StringBuilder emailContent = new StringBuilder();
	        emailContent.append("<div style=\"font-family: Arial, sans-serif; text-align: center;\">"); // Center align content and set font-family
	        emailContent.append("<h2 style=\"color: #34568B;\">"+ reportname +"_"+buildVersion+" Test Summary Report - ").append(timeStamp).append("</h2>");
	        emailContent.append("<h3 style=\"color: #34568B;\">"+Description).append("</h3>");
	        emailContent.append("</div>");
	        emailContent.append("<br>");
	        emailContent.append("<table style=\"border-collapse: collapse; width: 80%; margin: auto;\">"); // Table with 80% width and centered
	        emailContent.append("<tr>");
	        emailContent.append("<th style=\"border: 1px solid #dddddd; text-align: center; padding: 8px;\">Testcases</th>");
	        emailContent.append("<th style=\"border: 1px solid #dddddd; text-align: center; padding: 8px;\">Count</th>");
	        emailContent.append("</tr>");

	        emailContent.append("<tr>");
	        emailContent.append("<td style=\"border: 1px solid #dddddd; text-align: left; padding: 8px;\"><b>Total No of Executed</b></td>");
	        emailContent.append("<td style=\"border: 1px solid #dddddd; text-align: center; padding: 8px;\">").append("<b>"+totalTests+"</b>").append("</td>");
	        emailContent.append("</tr>");
	        
	        emailContent.append("<tr>");
	        emailContent.append("<td style=\"border: 1px solid #dddddd; text-align: left; padding: 8px;\"><b>No of Passed Cases</b></td>");
	        emailContent.append("<td style=\"border: 1px solid #dddddd; text-align: center; padding: 8px;\">").append("<b>"+passedTests+"</b>").append("</td>");
	        emailContent.append("</tr>");

	        emailContent.append("<tr>");
	        emailContent.append("<td style=\"border: 1px solid #dddddd; text-align: left; padding: 8px;\"><b>No of Failed Cases</b></td>");
	        emailContent.append("<td style=\"border: 1px solid #dddddd; text-align: center; padding: 8px;\">").append("<b>"+failedTests+"</b>").append("</td>");
	        emailContent.append("</tr>");
	        
	        emailContent.append("</table>");
	        
	        emailContent.append("<br>");
	        emailContent.append("<table style=\"border-collapse: collapse; width: 80%; margin: auto;\">"); // Table with 80% width and centered

	        if (pass.size()>0 || fail.size()>0) {
	            emailContent.append("<tr>");
	            emailContent.append("<td style=\"border: 1px solid #dddddd; text-align: center; padding: 8px;\"><b>Testcases Names</b></td>");
	            emailContent.append("<td style=\"border: 1px solid #dddddd; text-align: center; padding: 8px;\"><b>Status</b></td>");
	            emailContent.append("<td style=\"border: 1px solid #dddddd; text-align: center; padding: 8px;\"><b>Total Steps</b></td>");
	            emailContent.append("<td style=\"border: 1px solid #dddddd; text-align: center; padding: 8px;\"><b>Passed Steps</b></td>");
	            emailContent.append("<td style=\"border: 1px solid #dddddd; text-align: center; padding: 8px;\"><b>Failed Steps</b></td>");
	            emailContent.append("<td style=\"border: 1px solid #dddddd; text-align: center; padding: 8px;\"><b>Result in Percentage </b></td>");
	            emailContent.append("</tr>");

	            for (ITestResult test : pass) {
	            	String testName=test.getAttribute("name").toString();
	            	
	            	int totalSteps=Reporter.getOutput(test).size();
	        	    int passedSize=0;
	        	    int failedSize=0;
	        	    for (int i = 0; i <= totalSteps; i++) {
	        	        // Retrieve the Steps object stored with the attribute
	        	        Steps step = (Steps) test.getAttribute("STEP" + i);
	        	
	        	        // Check the status of each step
	        	        if (step != null) {
	        	            LogAs status = step.getLogAs();  // Assuming LogAs is an enum or similar
	        	
	        	            if (status == LogAs.PASSED) {
	        	            	passedSize++;
	        	            } else if (status == LogAs.FAILED) {
	        	            	failedSize++;
	        	            } 
	        	        }
	        	    }
	        	    
	        	   // System.out.println("Pass1 : "+passedSize+",  Fail1 : "+failedSize+" Total : "+totalSteps);
	        	    int passPercentage = (int) ((double) passedSize / totalSteps * 100);
	        	    int failPercentage = (int) ((double) failedSize / totalSteps * 100);
	        	   // System.out.println("Pass : "+passPercentage+"%,  Fail : "+failPercentage+"%");
	                emailContent.append("<tr>");
	                emailContent.append("<td style=\"border: 1px solid #dddddd; color: #4CAF50; text-align: left; padding: 8px;\">").append(testName).append("</td>");
	                emailContent.append("<td style=\"border: 1px solid #dddddd; color: #4CAF50; text-align: left; padding: 8px;\">").append("Passed").append("</td>");
	                emailContent.append("<td style=\"border: 1px solid #dddddd; color: #000000; text-align: left; padding: 8px;\">").append(totalSteps).append("</td>");
	                emailContent.append("<td style=\"border: 1px solid #dddddd; color: #4CAF50; text-align: left; padding: 8px;\">").append(passedSize).append("</td>");
	                emailContent.append("<td style=\"border: 1px solid #dddddd; color: #DD4124; text-align: left; padding: 8px;\">").append(failedSize).append("</td>");
	                emailContent.append("<td style=\"border: 1px solid #dddddd; color: #000000; text-align: left; padding: 8px;\">").append("Pass : "+passPercentage+"%, Fail : "+failPercentage+"%").append("</td>");
	        	    
	                emailContent.append("</tr>");
	            }

	            for (ITestResult test : fail) {
	            	String testName=test.getAttribute("name").toString();
	            	
	            	int totalSteps=Reporter.getOutput(test).size();
	        	    int passedSize=0;
	        	    int failedSize=0;
	        	    for (int i = 0; i <= totalSteps; i++) {
	        	        // Retrieve the Steps object stored with the attribute
	        	        Steps step = (Steps) test.getAttribute("STEP" + i);
	        	
	        	        // Check the status of each step
	        	        if (step != null) {
	        	            LogAs status = step.getLogAs();  // Assuming LogAs is an enum or similar
	        	
	        	            if (status == LogAs.PASSED) {
	        	            	passedSize++;
	        	            } else if (status == LogAs.FAILED) {
	        	            	failedSize++;
	        	            } 
	        	        }
	        	    }
	        	    //System.out.println("Pass1 : "+passedSize+",  Fail1 : "+failedSize+" Total : "+totalSteps);
	        	    int passPercentage = (int) ((double) passedSize / totalSteps * 100);
	        	    int failPercentage = (int) ((double) failedSize / totalSteps * 100);
	        	    
	                emailContent.append("<tr>");
	                emailContent.append("<td style=\"border: 1px solid #dddddd; color: #DD4124; text-align: left; padding: 8px;\">").append(testName).append("</td>");
	                emailContent.append("<td style=\"border: 1px solid #dddddd; color: #DD4124; text-align: left; padding: 8px;\">").append("Failed").append("</td>");
	                emailContent.append("<td style=\"border: 1px solid #dddddd; color: #000000; text-align: left; padding: 8px;\">").append(totalSteps).append("</td>");
	                emailContent.append("<td style=\"border: 1px solid #dddddd; color: #4CAF50; text-align: left; padding: 8px;\">").append(passedSize).append("</td>");
	                emailContent.append("<td style=\"border: 1px solid #dddddd; color: #DD4124; text-align: left; padding: 8px;\">").append(failedSize).append("</td>");
	                emailContent.append("<td style=\"border: 1px solid #dddddd; color: #000000; text-align: left; padding: 8px;\">").append("Pass : "+passPercentage+"%, Fail : "+failPercentage+"%").append("</td>");
	                //System.out.println("Pass : "+passPercentage+"%,  Fail : "+failPercentage+"%");
	                emailContent.append("</tr>");
	            }
	        }
	        emailContent.append("</table>");
	        emailContent.append("</div>");
	        // Send email with the content
	        try {
	            EmailSender.sendTestSummaryEmail(mailID, "Solverminds Test Summary Report - " + timeStamp, emailContent.toString(),filePaths,passFilePath);	        
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}
	
}
