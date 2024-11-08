package atu.testng.reports.writers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.testng.ITestResult;
import org.testng.Reporter;

import atu.testng.reports.enums.ExceptionDetails;
import atu.testng.reports.enums.ReportLabels;
import atu.testng.reports.excel.ExcelReports.ExcelChart1;
import atu.testng.reports.logging.LogAs;
import atu.testng.reports.utils.AuthorDetails;
import atu.testng.reports.utils.Directory;
import atu.testng.reports.utils.Platform;
import atu.testng.reports.utils.Steps;
import atu.testng.reports.utils.Utils1;
import commonMethods.Testcases;

public class TestcaseFailWriter extends ReportsPage{
	Testcases test1=new Testcases();
	Platform plat=new Platform();

	public static String getExecutionTime(ITestResult paramITestResult) {
		long l = paramITestResult.getEndMillis() - paramITestResult.getStartMillis();
		if (l > 1000L) {
			l /= 1000L;
			return l + " Sec";
		}
		return l + " Milli Sec";
	}

//	public static String getReqCoverageInfo(ITestResult paramITestResult) {
//		try {
//			if (paramITestResult.getAttribute("reqCoverage") == null)
//				return ReportLabels.TC_INFO_LABEL.getLabel();
//			return paramITestResult.getAttribute("reqCoverage").toString();
//		} catch (Exception localException) {
//		}
//		return ReportLabels.TC_INFO_LABEL.getLabel();
//	}

	
	public static void createHtmlFile(String filePath,ITestResult paramITestResult, int paramInt) throws Exception {
		Object currentClass = paramITestResult.getInstance();
		 
	     String browserName= ((Testcases) currentClass).browser;   
	 
       int totalSteps=Reporter.getOutput(paramITestResult).size();
	    //System.out.println("Total Steps Count : "+totalSteps);
	    int passedSize=0;
	    int failedSize=0;
	    int skippedSize=0;
	    for (int i = 0; i <= totalSteps; i++) {
	        // Retrieve the Steps object stored with the attribute
	        Steps step = (Steps) paramITestResult.getAttribute("STEP" + i);
	
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
		StringBuilder sb=new StringBuilder();
		 if (Reporter.getOutput(paramITestResult).size() <= 0)
	      {
			 sb.append("<tr> <td colspan=\"8\"><b>No Steps Available</b></td> </tr>");
	      }
		
		 Object localObject1 = Reporter.getOutput(paramITestResult);
		 Iterator<?> localIterator = ((List<?>)localObject1).iterator();
		  int i=1;
		  String str="ab";
	      while (localIterator.hasNext())
	      {
	        Object localObject2 = (String)localIterator.next();
	        Steps localSteps = null;
	        localSteps = (Steps)paramITestResult.getAttribute("STEP" + i);	        
	      //new lines for filter
	        String stepStatus=localSteps.getStatus();
	        //System.out.println(" stepStatus : "+stepStatus);
	        String FailedScreenShot="";
	        String image="";
	        if(stepStatus.contains("FAIL")){
	        	try {
	        		String str2 = Directory.RUNDir + Directory.SEP+paramITestResult.getAttribute("relativeReportDir") + Directory.SEP
							+ Directory.SCREENSHOT_DIRName+Directory.SEP;
			        String imagePath = str2 + i + ".PNG";
		        	File imageFile = new File(imagePath);
		            byte[] fileContent = Files.readAllBytes(imageFile.toPath());
		            // Convert the byte array to a Base64 string
		            String base64String = Base64.getEncoder().encodeToString(fileContent);
		            
		            String imagePath1 = Directory.IMGDir + Directory.SEP+"fail.png";
		        	File imageFile1 = new File(imagePath1);
		            byte[] fileContent1 = Files.readAllBytes(imageFile1.toPath());
		            String base64String1 = Base64.getEncoder().encodeToString(fileContent1);
		            image="<img style=\" height : 15px; width:15px; margin-left: 10px\" alt=\"No Screenshot\" src=\"data:image/png;base64," + base64String1 + "\"/>";
		            
		            FailedScreenShot=  "<a href=\"data:image/png;base64," + base64String + "\" target=\"_blank\">" + "<img style=\" height : 30px; width:70px;\" alt=\"No Screenshot\" src=\"data:image/png;base64," + base64String + "\"/></a>";
		        	str="fail";
		        	//System.out.println(" Steps checked to print the report");
	        	}catch(Exception e) {
	        		
	        	}
	        	
	        }else {
	        	str="pass";
	        	String imagePath1 = Directory.IMGDir + Directory.SEP+"pass.png";
	        	File imageFile1 = new File(imagePath1);
	            byte[] fileContent1 = Files.readAllBytes(imageFile1.toPath());
	            String base64String1 = Base64.getEncoder().encodeToString(fileContent1);
	            image="<img style=\" height : 15px; width:15px; margin-left: 10px \" alt=\"No Screenshot\" src=\"data:image/png;base64," + base64String1 + "\"/>";
	            
	        }
        	sb.append("<tr class=\"all " + str + "\"> \n  <td>"+i+"</td>\n  <td> "+localSteps.getDescription()+"</td>\n  <td> "+localSteps.getInputValue()+"</td>\n  <td> "+localSteps.getActualValue()+"</td>\n  <td> "+localSteps.getTime()+" </td>\n  <td title='" + localSteps.getClassName() + "' > "+localSteps.getLineNum()+" </td> \n  <td > "+image+" </td>  <td>"+FailedScreenShot+ " </td> </tr>");

	        ++i;
	      //new lines for filter
	      
	      }
		String TDLogo=Directory.IMGDir + Directory.SEP+"TrackDfect.jpg";
    	File imageFile1 = new File(TDLogo);
        byte[] fileContent1 = Files.readAllBytes(imageFile1.toPath());
        String base64String1 = Base64.getEncoder().encodeToString(fileContent1);
        String TDimage="<img alt=\"No Screenshot\" src=\"data:image/png;base64," + base64String1 + "\" height=\"70\" width=\"140\"/>";
        
		//String SEDGLogo=Directory.IMGDir + Directory.SEP+"Solverminds.png";
		
        // Define the HTML content
        String htmlContent = "<html>\n" +
                "<head>\n" +
                "    <title>SEDGE Test Report</title>\n" +
                "    <style>\n" +
                "        html,body{\n"+
                "               margin: 0;\n"+ 
                "               padding: 0;\n"+
                "               height: 100%;  \n" + 
                "               text-align: center; \n"+ 
                "               min-width: 900px;\n"+ 
                "               min-height: 800px;border-top: 2px solid #B0B0B0 ; \n"+ 
                "               border-right: 2px solid #B0B0B0; border-left: 2px solid #B0B0B0 ; \n"+ 
                "               font-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\n"+              
                "              } \n"+  
                "       .summary{\n"+ 
                "           float: left;\n" +
                "           width: 200px;\n" +
                "    	    font-family: Segoe UI Light;\n"+ 
                "           text-align: left;\n"+
                "           padding-left: 15px;\n"+ 
                "           padding-top: 10px;\n"+ 
                "           height: 280px;    \n"+ 
                "           color: white;    \n"+
                "         } \n"+
                "      .summary:hover{\n" + 
                "          color: black;\n"+ 
                "          background-color:#F2F2F2;\n"+
                "        } \n"+
                "    .chartStyle{\n"+ 
                "      height: 290px;\n"+
                "      margin-top: 30px;\n" +
                "      width: 85%;\n"+ 
                "      border-style: solid;\n"+ 
                "      border-width: 1px;\n"+ 
                "      border-color: #B0B0B0;\n" +
                "      -moz-box-shadow: 0 0 10px #CCCCCC;\n"+ 
                "      -ms-box-shadow: 0 0 10px #CCCCCC;\n"+
                "      -webkit-box-shadow: 0 0 10px #CCCCCC;\n"+ 
                "       box-shadow: 0 0 10px #CCCCCC;\n"+ 
                "      zoom: 1;\n" + 
                "      filter: progid:DXImageTransform.Microsoft.Shadow(Color=#cccccc, Strength=2, Direction=0),\n" +
                "          progid:DXImageTransform.Microsoft.Shadow(Color=#cccccc, Strength=2, Direction=90),\n"+ 
                "          progid:DXImageTransform.Microsoft.Shadow(Color=#cccccc, Strength=2, Direction=180),\n" +
                "          progid:DXImageTransform.Microsoft.Shadow(Color=#cccccc, Strength=2, Direction=270);\n"+
                "          background-color: white;\n"+ 
                "        } \n" +
//                "  .chartStyle:hover{\n"+
//                "      background-color:#F2F2F2;\n"+
//                "     }\n "+
                "        #tableStyle {\n" +
                "            height: 100%; width: 95%; \n" +
                "            border-collapse: collapse; margin-left: 20px;\n" +
                "        }\n" +
                "        #tableStyle td {\n" +
                "             border: 1px solid #ccc;text-align: center;padding: 4px 4px;  \n" +
                "        }\n" +
                "        #tableStyle th {\n" +
                "           font-size: 16px; font-family: Segoe UI Light;height: 35px; background-color: #E9DC02 ; color: black; \n" +
                "        }\n" +
                " #tableStyle tr:hover{\n" +
                "    background-color:#F2F2F2;\n" +
                "    color:Black;\n" +
                "    }"+
                "        h1 {\n" +
                "            text-align: center;\n" +
                "            border-bottom: 1px solid #ccc ;"+
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n  " +
               " <div style=\"padding-right:20px;float:left;border-style: solid;border-width: 1px; border-color: #B0B0B0; \">"+TDimage+"</i> </div>  <h1>Test Report</h1>\n" +
                "<div class=\"info\" style=\" border-bottom: 1px solid #ccc ;\">\n       TestCase Name: <b>" + paramITestResult.getAttribute("name") + "</b><br/>" + "                        Time Taken for Executing: <b>" + getExecutionTime(paramITestResult) + "</b> <br/>\n" + "                        Current Run Number: <b>Run " + paramInt + "</b></br>\n"   + "                    </div>"+
                "</div> \n <div class=\"chartStyle summary\" style=\"background-color:#dbae0f;margin-left: 40px; width: 25%; height: 200px;\">          \n                        <b>Execution Platform Details</b><br/><br/>\n                        <table>\n                            <tr>\n                                <td>O.S</td>\n                                <td>&nbsp;&nbsp;:&nbsp;&nbsp;</td>\n                                <td>" + Platform.OS + ", " + Platform.OS_ARCH + "Bit, v" + Platform.OS_VERSION + "</td>\n" + "                            </tr>\n" + "                            <tr>\n" + "                                <td>Java</td>\n" + "                                <td>&nbsp;&nbsp;:&nbsp;&nbsp;</td>\n" + "                                <td>" + Platform.JAVA_VERSION + "</td>\n" + "                            </tr>\n" + "\n" + "                            <tr>\n" + "                                <td>Hostname</td>\n" + "                                <td>&nbsp;&nbsp;:&nbsp;&nbsp;</td>\n" + "                                <td>" + Platform.getHostName() + "</td>\n" + "                            </tr>\n" + "\n" + "                            <tr>\n" + "                                <td>Appium</td>\n" + "                                <td>&nbsp;&nbsp;:&nbsp;&nbsp;</td>\n" + "                                <td>" + Platform.DRIVER_VERSION + "</td>\n" + "                            </tr>\n" + "                        </table>  \n" + "                    </div>\n" + "                   "+
                " <div class=\"chartStyle summary\" style=\"background-color:#03b78a; margin-left: 40px; height: 200px;width: 25%; \">\n" + "                        <b>Summary</b><br/><br/>\n" + "                        <table>\n" + "                            <tr>\n" + "                                <td>Status</td>\n" + "                                <td>&nbsp;&nbsp;:&nbsp;&nbsp;</td>\n" + "                                <td>" + getResult(paramITestResult) + "</td>\n" + "                            </tr>\n" + "                            <tr>\n" + "                                <td>Execution Date</td>\n" + "                                <td>&nbsp;&nbsp;:&nbsp;&nbsp;</td>\n" + "                                <td>" + Utils1.getCurrentTime() + "</td>\n" + "                            </tr>\n" + "                            \n" + "\n" + "                            <tr>\n" + "                                <td>Browser</td>\n" + "                                <td>&nbsp;&nbsp;:&nbsp;&nbsp;</td>\n" + "                                <td>" +browserName+ "</td>\n" + "                            </tr>\n" + "                        </table> \n" + "                    </div>"+
                " <div class=\"chartStyle summary\" style=\"background-color:#3B9C9C; margin-left: 40px; height: 200px;width: 20%;\">\n" + "                        <b>Results Summary</b><br/><br/>\n" + "                        <table>\n" + "                            <tr>\n" + "                                <td>Total Steps </td>\n" + "                                <td>&nbsp;&nbsp;:&nbsp;&nbsp;</td>\n" + "                                <td>" + totalSteps + "</td>\n" + "                            </tr>\n" + "                            <tr>\n" + "                                <td>Pass Count</td>\n" + "                                <td>&nbsp;&nbsp;:&nbsp;&nbsp;</td>\n" + "                                <td>" + passedSize + "</td>\n" + "                            </tr>\n" + "                            \n" + "\n" + "                            <tr>\n" + "                                <td>Fail Count </td>\n" + "                                <td>&nbsp;&nbsp;:&nbsp;&nbsp;</td>\n" + "                                <td>" +failedSize+ "</td>\n" + "                            </tr>\n" + "                        </table> \n" + "                    </div>"+
              //  "</div> "+
              //  "<div class=\"chart\" style=\"--passed: "+passpercentage+"%; --failed: "+failpercentage+"% ; --skipped : "+skippercentage+"% ;\" data-pass=\""+passpercentage+"\" data-fail=\""+failpercentage+"\" data-skip=\""+skippercentage+"\"  ></div>"+
                "                        <table class=\"chartStyle\" id=\"tableStyle\" style=\"height:50px; float: left\">\n                            <tr>\n                                <th>S.No</th>\n                    <th>Step Description</th>\n                       <th>Input Value</th>\n                    <th>Testcase ID</th>\n                   <th>Time</th>\n                                <th>Line No</th>\n                                <th>Status</th>\n                     <th>Screen shot</th>\n                               </tr>\n                           \n"+
                sb.toString()+
                "          <tr id=\"footer\" style=\"background-color: #E9DC02;\">\n"
			    + "<td colspan=\"2\" style=\"text-align: center; padding: 4px 4px;\" >\n"
			    + "&nbsp;\nTrackDfect Reports"
			    + "&nbsp;\n Reports by: <a href=\"https://trackdfect.com/\" target=\"_blank\">TrackDfect.com</a>\n"
			    + "</td>\n"
			    + "</tr>\n"+
                " </table>"+
                "</body>\n" +
                "</html>";

        // Write the content to the HTML file
        FileWriter fileWriter = new FileWriter(filePath);
        fileWriter.write(htmlContent);
        fileWriter.close();
    }

	private static String getResult(ITestResult paramITestResult) {
		if (paramITestResult.getStatus() == 1)
			try {
				if (paramITestResult.getAttribute("passedButFailed").equals("passedButFailed"))
					return "Failed";
				return "Passed";
			} catch (Exception localException) {
				return "Passed";
			}
		if (paramITestResult.getStatus() == 2)
			return "Failed";
		if (paramITestResult.getStatus() == 3)
			return "Skipped";
		return "Unknown";
	}


}
