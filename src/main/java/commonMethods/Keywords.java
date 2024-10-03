package commonMethods;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.image.BufferedImage;
import java.awt.image.RasterFormatException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.imageio.ImageIO;
import org.apache.poi.ss.usermodel.*;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.JSONException;
import org.json.JSONObject;
//import java.awt.Color;
	//import java.awt.image.BufferedImage;
	//import javax.imageio.ImageIO;
	//import java.io.File;
	//import java.io.IOException;
	import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.internal.TestResult;

import com.aventstack.extentreports.ExtentTest;
//import com.jayway.jsonpath.JsonPath;
	import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

import atu.testng.reports.ATUReports;
import atu.testng.reports.logging.LogAs;
	
	@SuppressWarnings("deprecation")
	public class Keywords extends ATUReports implements SEDGE_Locators {
	
		public String Main_Window = "";
		public ArrayList<String> tabs;
		public WebElement fromElement;
		public static ExtentTest test;
		public static String TestCaseID="";
		
		static List<String> elsePartData = new ArrayList<>();	    
	
		public String getCurrentDate() {
			Format formatter = new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
			Date date = new Date();
			String value = formatter.format(date);
			return value;
		}
	
		public static String[] splitXpath(String path) {
			String[] a = path.split(">");
			return a;
		}
	
		public static void setTestCaseID(String testcaseid) {
			TestCaseID = testcaseid;
		}
		
		
		public String ScreenCompareImage(WebDriver driver, String img_filepath1, String img_filepath2) {
			String image_res = null;
			try {
				BufferedImage img1 = ImageIO.read(new File(img_filepath1));
				BufferedImage img2 = ImageIO.read(new File(img_filepath2));
				int w1 = img1.getWidth();
				int w2 = img2.getWidth();
				int h1 = img1.getHeight();
				int h2 = img2.getHeight();
				if ((w1 != w2) || (h1 != h2)) {
					System.out.println("Both images should have same dimensions");
				} else {
					long diff = 0;
					for (int j = 0; j < h1; j++) {
						for (int i = 0; i < w1; i++) {
							// Getting the RGB values of a pixel
							int pixel1 = img1.getRGB(i, j);
							Color color1 = new Color(pixel1, true);
							int r1 = color1.getRed();
							int g1 = color1.getGreen();
							int b1 = color1.getBlue();
							int pixel2 = img2.getRGB(i, j);
							Color color2 = new Color(pixel2, true);
							int r2 = color2.getRed();
							int g2 = color2.getGreen();
							int b2 = color2.getBlue();
							// sum of differences of RGB values of the two images
							long data = Math.abs(r1 - r2) + Math.abs(g1 - g2) + Math.abs(b1 - b2);
							diff = diff + data;
						}
					}
					double avg = diff / (w1 * h1 * 3);
					double percentage = (avg / 255) * 100;
					System.out.println("Difference: " + percentage);
					if (percentage < 0.02) {
						image_res = "Pass";
					}
	
				}
			} catch (Exception e) {
				System.out.println("Exception while taking Screenshot" + e.getMessage());
				return e.getMessage();
			}
			return image_res;
		}
	
		public void wait(WebDriver driver, String inputData) {
			try {
				int time = Integer.parseInt(inputData);
				int seconds = time * 1000;
				Thread.sleep(seconds);
			} catch (InterruptedException e) {
				add1(driver, "Unable to wait ", LogAs.FAILED, true, "Wait");
			
				Assert.fail();
			}
		}
	
		public void uploadFileAutoIT(String filelocation) {
			try {
				String autoitscriptpath = System.getProperty("user.dir") + "\\" + "File_upload_selenium_webdriver.au3";
	
				Runtime.getRuntime().exec("cmd.exe /c Start AutoIt3.exe " + autoitscriptpath + " \"" + filelocation + "\"");
	
			} catch (Exception exp) {
	
				Assert.fail();
			}
		}
	
		
		
		public static void dropdown(WebDriver driver, String xpath) {
	
			String[] values = splitXpath(xpath);
	
			List<WebElement> li = driver.findElements(By.xpath(values[1]));
			try {
				for (int i = 0; i < li.size(); i++) {
					System.out.println(li.get(i).getText());
					Thread.sleep(2000);
					if (li.get(i).getText().contains("Apple iPhone 12")) {
	
						li.get(i).click();
						break;
					}
				}
			} catch (Exception e) {
			
				Assert.fail();
			}
	
		}
	
		public void waitForElement(WebDriver driver, String xpath) {
			String[] values = splitXpath(xpath);
			try {
				// int WaitElementSeconds1 = new Integer(ElementWait);
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				WebDriverWait wait = new WebDriverWait(driver, 60);
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(values[1])));

				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(values[1])));
				
			} catch (Exception e) {
			
				add1(driver, "Element Not Found - " + values[0] + "- " + e.getLocalizedMessage() + e, LogAs.FAILED, true,
						values[0]);
//				Assert.fail();
			}
		}
	
		public void waitForElement1(WebDriver driver, String xpath) {
			String[] values = splitXpath(xpath);
			try {
				// int WaitElementSeconds1 = new Integer(ElementWait);
				driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
				WebDriverWait wait = new WebDriverWait(driver, 6000);
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(values[1])));
	//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(values[1])));
				add(driver, "Wait for the Element " + values[0], LogAs.PASSED, true, values[0]);
			} catch (Exception e) {
			
				add1(driver, "Element Not Found - " + values[0] + "- " + e.getLocalizedMessage() + e, LogAs.FAILED, true,
						values[0]);
				Assert.fail();
			}
		}
	
		public void waitForElementtopresent(WebDriver driver, String xpath) {
			String[] values = splitXpath(xpath);
			try {
				// int WaitElementSeconds1 = new Integer(ElementWait);
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(values[1])));
				//add(driver, "Wait for the Element " + values[0], LogAs.PASSED, true, values[0]);
			} catch (Exception e) {
			
				//add1(driver, "Element Not Found - " + values[0] + "- " + e.getLocalizedMessage() + e, LogAs.FAILED, true,
				//		values[0]);
				//Assert.fail();
			}
		}
	
		public boolean elementIsVisible(WebDriver driver, String xpath) {
	
			String[] values = splitXpath(xpath);
			try {
				driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
	
				// System.out.println(driver.getTitle());
				WebDriverWait wait1 = new WebDriverWait(driver, 4);
				wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(values[1])));
				add(driver, "Wait for visibility of Element" + values[0], LogAs.PASSED, true, values[0]);
				return true;
			} catch (Exception e) {

			 return false;
//				Assert.fail();
			}
	
		}
	
		public void waitForElement5(WebDriver driver, String xpath) {
			String[] values = splitXpath(xpath);
			try {
				// int WaitElementSeconds1 = new Integer(ElementWait);
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(values[1])));
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath(values[1])));
				add(driver, "Wait for the Element " + values[0], LogAs.PASSED, true, values[0]);
			} catch (Exception e) {
			
				add1(driver, "Element Not Found - " + values[0] + "- " + e.getLocalizedMessage() + e, LogAs.FAILED, true,
						values[0]);
				Assert.fail();
			}
		}
	
//		public void click(WebDriver driver, String Xpath) {
//			String[] values = splitXpath(Xpath);
//			try {
//				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//				WebDriverWait wait1 = new WebDriverWait(driver, 30);
//				wait1.until(ExpectedConditions.elementToBeClickable(By.xpath(values[1])));
//				WebElement element = driver.findElement(By.xpath(values[1]));
//				element.click();
//				add(driver, "Click on " + values[0], LogAs.PASSED, true, "");
//	
//			} catch (Exception e) {
//				e.printStackTrace();
//				add1(driver, "Unable to click on " + values[0] + "- " + e.getLocalizedMessage(), LogAs.FAILED, true,
//						values[0]);
//				Assert.fail();
//			}
//	
//		}
	
		public void click(WebDriver driver, String Xpath) {
		    String[] values = splitXpath(Xpath);
		    try {
		        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		        WebDriverWait wait1 = new WebDriverWait(driver, 30);
		        wait1.until(ExpectedConditions.elementToBeClickable(By.xpath(values[1])));
		        WebElement element = driver.findElement(By.xpath(values[1]));
		        
		        try {
		            element.click();  // Try clicking using WebElement's click method
		            add(driver, "Click on " + values[0], LogAs.PASSED, true, "");
		        } catch (Exception e) {
		        	System.out.println("Element Click Failed");
		             // e.printStackTrace();  // Log the exception for WebElement click failure
		            try {
		                // Attempt to click using JavaScript if WebElement click fails
		                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		                add(driver, "Click on " + values[0] + " using JavaScript", LogAs.PASSED, true, "");
		            } catch (Exception jsException) {
		                jsException.printStackTrace();
		                // Log failure if both WebElement click and JavaScript click fail
		                add1(driver, "Unable to click on " + values[0] + "- " + jsException.getLocalizedMessage(), LogAs.FAILED, true, values[0]);
		                Assert.fail();
		            }
		        }
		    } catch (Exception e) {
		        e.printStackTrace();
		        add1(driver, "Unable to click on " + values[0] + "- " + e.getLocalizedMessage(), LogAs.FAILED, true, values[0]);
		        Assert.fail();
		    }
		}
		
		
		public void click3(WebDriver driver, String Xpath) {
			String[] values = splitXpath(Xpath);
			try {
				wait(driver,"1");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				WebDriverWait wait1 = new WebDriverWait(driver, 10);
				wait1.until(ExpectedConditions.elementToBeClickable(By.xpath(values[1])));
				WebElement element = driver.findElement(By.xpath(values[1]));
				element.click();
	
			} catch (Exception e) {
				
			}
	
		}
	
		
		public boolean isClickable(WebDriver driver,String Xpath) {
			String[] values = splitXpath(Xpath);

			try {
				WebDriverWait wait1 = new WebDriverWait(driver, 10);
				wait1.until(ExpectedConditions.elementToBeClickable(By.xpath(values[1])));
				return true;
			}catch(Exception e) {
				return false;
			}
		}
		
		public void click1(WebDriver driver, String path, int input) {
			String[] values = splitXpath(path);
			try {
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				WebElement webElement = driver.findElement(By.xpath(values[input]));
				System.out.println(webElement);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",
						webElement);
				webElement.click();
				System.out.println(values[0] + " clicked");
				add(driver, "Click1 on " + values[0], LogAs.PASSED, true, values[0]);
			} catch (Exception e) {
				System.out.println(" Exception " + e);
				add1(driver, "Unable to click1 on " + values[0] + "- " + e.getLocalizedMessage(), LogAs.FAILED, true,
						values[0]);
			
				Assert.fail();
			}
		}
	
		public void switchToActiveElement(WebDriver driver) {
			try {
				driver.switchTo().activeElement();
			} catch (Exception e) {
			}
		}
	
		public void clickByClassName(WebDriver driver, String className) {
			String[] values = splitXpath(className);
			try {
				WebElement webElement = driver.findElement(By.className(values[1]));
				webElement.click();
				// add(driver, "Click on " + values[0], LogAs.PASSED, true, values[0]);
			} catch (Exception e) {
				// add1(driver, "Unable to click on " + values[0], LogAs.FAILED, true,
				// values[0]);
			
				Assert.fail();
			}
		}
	
		public void clickWithoutFail(WebDriver driver, String path) {
			String[] values = splitXpath(path);
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			webElement.click();
			add(driver, "Click on " + values[0], LogAs.PASSED, true, values[0]);
	
		}
	
		public void jsClickByXPath(WebDriver driver, String Xpath) {
			String[] values = splitXpath(Xpath);
			try {
				// waitForElement(driver,Xpath);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				WebElement element = driver.findElement(By.xpath(values[1]));
				JavascriptExecutor executor = (JavascriptExecutor) driver;
				executor.executeScript("arguments[0].click();", element);
				add(driver, "Click on " + values[0], LogAs.PASSED, true, values[0]);
			} catch (Exception e) {
				add1(driver, "Unable to click on " + values[0] + "- " + e.getLocalizedMessage(), LogAs.FAILED, true,
						values[0]);
			
				Assert.fail();
			}
		}
			
		public void waitForTexttopresent(WebDriver driver, String xpath, String text) {
			String[] values = splitXpath(xpath);
			try {
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				// int WaitElementSeconds1 = new Integer(ElementWait);
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(values[1])));
				wait.until(ExpectedConditions.textToBePresentInElement(By.xpath(values[1]), text));
				add(driver, "Wait for the Text " + values[0], LogAs.PASSED, true, values[0]);
			} catch (Exception e) {
				add1(driver, "Text Not Found - " + values[0] + "- " + e.getLocalizedMessage() + e, LogAs.FAILED, true,
						values[0]);
			
				Assert.fail();
			}
		}
	
		public void clearAndType1(WebDriver driver,String Xpath,String inputText) {
			String[] values = splitXpath(Xpath);
			try {
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				WebElement webElement = driver.findElement(By.xpath(values[1]));
                Actions action=new Actions(driver);
                webElement.clear();
                action.sendKeys(webElement, inputText).build().perform();
                add(driver, "Type on " + values[0], inputText, true, values[0]);

			} catch (Exception e) {
				add1(driver, "Unable to type on " + values[0] + "- " + e.getLocalizedMessage(), inputText, true,
						values[0]);
			}
		}

		public String clearAndType(WebDriver driver, String xpaths, String keysToSend) {
			String[] values = splitXpath(xpaths);
			try {
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				WebDriverWait wait1 = new WebDriverWait(driver, 20);
				wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(values[1])));
	
				WebElement webElement = driver.findElement(By.xpath(values[1]));
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].value='';", webElement);
				js.executeScript("arguments[0].click();", webElement);
				// webElement.clear();
	//			webElement.sendKeys(keysToSend, Keys.ENTER);
				// JavascriptExecutor jse = (JavascriptExecutor)driver;
	
				wait(driver, "1");
				js.executeScript("arguments[0].value=" + "\'" + keysToSend + "\'" + ";", webElement);
				// js.executeScript("arguments[0].click();", webElement);
				webElement.sendKeys(Keys.ENTER);
	
				add(driver, "Clear and Type on " + values[0], keysToSend, true, values[0]);
			} catch (Exception e) {
				add1(driver, "Unable to type on " + values[0] + "- " + e.getLocalizedMessage(), keysToSend, true,
						values[0]);
			
				Assert.fail();
			}
			return keysToSend;
		}
	
		public String actionType(WebDriver driver, String xpath, String keysToSend) {
			String[] values = splitXpath(xpath);
			try {
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				WebElement webElement = driver.findElement(By.xpath(values[1]));
				Actions action = new Actions(driver);
				action.sendKeys(webElement, keysToSend).build().perform();
				add(driver, "Type on " + values[0], keysToSend, true, values[0]);
			} catch (StaleElementReferenceException e) {
				add1(driver, "Unable to type on " + values[0] + "- " + e.getLocalizedMessage(), LogAs.FAILED, true,
						values[0]);
			
				Assert.fail();
			}
			return keysToSend;
		}
	
		public void actionClick(WebDriver driver, String Xpath) {
			String[] values = splitXpath(Xpath);
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			try {
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				Actions action = new Actions(driver);
				action.click(webElement).build().perform();
				add(driver, "Click on " + values[0], LogAs.PASSED, true, values[0]);
			} catch (Exception e) {
				add1(driver, "Unable to click on " + values[0] + "- " + e.getLocalizedMessage(), LogAs.FAILED, true,
						values[0]);
			
				Assert.fail();
			}
		}
	
		public void doubleClick(WebDriver driver, String element) {
			String[] values = splitXpath(element);
			try {
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				WebElement webElement = driver.findElement(By.xpath(values[1]));
				Actions action = new Actions(driver);
				action.moveToElement(webElement).doubleClick(webElement).build().perform();
				add(driver, "Double click on " + values[0], LogAs.PASSED, true, "");
			} catch (Exception e) {
				add1(driver, "Unable to click on " + values[0] + "- " + e.getLocalizedMessage(), LogAs.FAILED, true,
						"");
			
				Assert.fail();
			}
		}
	
		public String sendKeys(WebDriver driver, String xpaths, String keysToSend) {
			String[] values = splitXpath(xpaths);
	
			try {
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				WebDriverWait wait1 = new WebDriverWait(driver, 20);
				wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(values[1])));
	
				WebElement webElement = driver.findElement(By.xpath(values[1]));
				webElement.sendKeys(keysToSend);
	
				add(driver, "Type on " + values[0], keysToSend, true, values[0]);
//				add(driver, "Expected : "+""+ " <--->  Actual  : "+"", LogAs.PASSED,true, "Passed");
				wait(driver, "1");
			} catch (Exception e) {
				add1(driver, "Unable to type on " + values[0] + "- " + e.getLocalizedMessage(), keysToSend, true,
						values[0]);
			      e.printStackTrace();
				//Assert.fail();
			}
			return keysToSend;
	
		}
	
		public static void implicitwait(WebDriver driver) {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	
		public String searchelement(WebDriver driver, String xpaths, String keysToSend) {
			String[] values = splitXpath(xpaths);
	
			try {
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				WebElement webElement = driver.findElement(By.xpath(values[1]));
				webElement.sendKeys(keysToSend, Keys.ENTER);
	
				add(driver, "Type on " + values[0], keysToSend, true, values[0]);
	
			} catch (Exception e) {
				add1(driver, "Unable to type on " + values[0] + "- " + e.getLocalizedMessage(), keysToSend, true,
						values[0]);
			
				Assert.fail();
			}
			return keysToSend;
	
		}
	
		public void clear1(WebDriver driver, String xpaths) {
			String[] values = splitXpath(xpaths);
			try {
				Actions action=new Actions(driver);
				WebElement webElement = driver.findElement(By.xpath(values[1]));
				action.click(webElement).build().perform();
				action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
				action.sendKeys(Keys.BACK_SPACE).build().perform();
				add(driver, "Text Clear on " + values[0]+" element ", LogAs.PASSED, true, "");
			} catch (Exception e) {
				add1(driver, "Unable to clear the text on " + values[0] + "- " + e.getLocalizedMessage(), LogAs.FAILED, true,
						"");
			
//				Assert.fail();
			}
		}
	
		public void clear(WebDriver driver, String xpaths) {
			String[] values = splitXpath(xpaths);
			try {
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				WebElement webElement = driver.findElement(By.xpath(values[1]));
				webElement.clear();
				add(driver, "Clear on " + values[0], LogAs.PASSED, true, values[0]);
			} catch (Exception e) {
				add1(driver, "Unable to clear on " + values[0] + "- " + e.getLocalizedMessage(), LogAs.FAILED, true,
						values[0]);
			
//				Assert.fail();
			}
		}
		public void webelementfunction(WebDriver driver, String xpaths) {
			String[] values = splitXpath(xpaths);
			try {
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				// WebElement webElement = driver.findElement(By.xpath(values[1]));
				// webElement.clear();
				List<WebElement> bakeries = driver.findElements(By.xpath(values[1]));
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",
						bakeries);
				System.out.println(bakeries.size());
				add(driver, "Clear on " + values[0], LogAs.PASSED, true, values[0]);
			} catch (Exception e) {
				add1(driver, "Unable to clear on " + values[0] + "- " + e.getLocalizedMessage(), LogAs.PASSED, true,
						values[0]);
			
//				Assert.fail();
			}
	
		}
	
		public void selectCheckBox(WebDriver driver, String xpaths) {
			String[] values = splitXpath(xpaths);
			try {
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				WebElement element = driver.findElement(By.xpath(values[1]));
				if (element.isSelected()) {
				} else {
					element.click();
				}
				add(driver, "Select the checkbox on " + values[0], LogAs.PASSED, true, values[0]);
			} catch (Exception e) {
				add1(driver, "Unable to select the checkbox on " + values[0] + "- " + e.getLocalizedMessage(), LogAs.FAILED,
						true, values[0]);
			
//				Assert.fail();
			}
		}
	
		public void deSelectCheckBox(WebDriver driver, String xpaths) {
			String[] values = splitXpath(xpaths);
			try {
				WebElement element = driver.findElement(By.xpath(values[1]));
				if (element.isSelected()) {
					element.click();
				} else {
				}
				add(driver, "Deselect the checkbox on " + values[0], LogAs.PASSED, true, values[0]);
			} catch (Exception e) {
				add1(driver, "Unable to deselect the checkbox on " + values[0] + "- " + e.getLocalizedMessage(),
						LogAs.FAILED, true, values[0]);
			
//				Assert.fail();
			}
		}
	
		public void selectByIndex(WebDriver driver, String xpaths, String inputData) {
			String[] values = splitXpath(xpaths);
			try {
				WebElement webElement = driver.findElement(By.xpath(values[1]));
				@SuppressWarnings("removal")
				Integer index = new Integer(inputData);
				Select selectBox = new Select(webElement);
				selectBox.selectByIndex(index);
				add(driver, "Select the Dropdown by Index " + values[0], LogAs.PASSED, true, values[0]);
			} catch (Exception e) {
				add1(driver, "Unable to select the Dropdown by Index " + values[0] + "- " + e.getLocalizedMessage(),
						inputData, true, values[0]);
			
				Assert.fail();
			}
		}
	
		public void selectByText(WebDriver driver, String xpaths, String inputData) {
			String[] values = splitXpath(xpaths);
			try {
				Select selectBox = new Select(driver.findElement(By.xpath(values[1])));
				selectBox.selectByVisibleText(inputData);
				add(driver, "Select the Dropdown by text " + inputData, inputData, true, "");
			} catch (Exception e) {
				add1(driver, "Unable to select the Dropdown by text " + inputData + "- " + e.getLocalizedMessage(),
						inputData, true, "");
			
//				Assert.fail();
			}
		}
	
		public void selectByValue(WebDriver driver, String xpaths, String inputData) {
			String[] values = splitXpath(xpaths);
			try {
	
				WebElement webElement = driver.findElement(By.xpath(values[1]));
				Select selectBox = new Select(webElement);
				selectBox.selectByValue(inputData);
				add(driver, "Select the Dropdown by Value " + values[0], inputData, true, values[0]);
			} catch (Exception e) {
				add1(driver, "Unable to select the Dropdown by Value " + values[0] + "- " + e.getLocalizedMessage(),
						inputData, true, values[0]);
			
				Assert.fail();
			}
		}
	
		
		public void close(WebDriver driver) {
			try {
				driver.close();
				add(driver, "Application is closed", LogAs.PASSED, true, "Not Req");
			} catch (Exception e) {
				add1(driver, "Unable to close the application ", LogAs.FAILED, true,"Not Req" + "- " + e.getLocalizedMessage());
			
				Assert.fail();
			}
		}
	
		public String getText(WebDriver driver, String xpath) {
			String[] values = splitXpath(xpath);
			try {
				WebElement webElement = driver.findElement(By.xpath(values[1]));
				String text = webElement.getText();
				add(driver, "The value '< " + text + " >' is retrieved from the element ' " + values[0] + "'", LogAs.PASSED,true, values[0]);
				return text;
	
			} catch (Exception e) {
				add1(driver, "Unable to retrieve the text " + values[0] + "- " + e.getLocalizedMessage(), LogAs.FAILED,true, values[0]);
				//Assert.fail();
				return null;
			}
		}
		
		
		public String getText1(WebDriver driver, String xpath) {
			String[] values = splitXpath(xpath);  
			try {
				WebElement webElement = driver.findElement(By.xpath(values[1]));
				String text = webElement.getText();
				return text;
	
			} catch (Exception e) {
				add1(driver, "Unable to retrieve the text " + values[0] + "- " + e.getLocalizedMessage(), LogAs.FAILED,true, values[0]);
//				Assert.fail();
				return "";
			}
		}
		
		public String getTextJavascript(WebDriver driver, String xpath) {
			String[] values = splitXpath(xpath);  
			try {
				WebElement webElement = driver.findElement(By.xpath(values[1]));
	            String text = (String)((JavascriptExecutor)driver).executeScript("return arguments[0].value;", webElement);
				return text;
	
			} catch (Exception e) {
				add1(driver, "Unable to retrieve the text " + values[0] + "- " + e.getLocalizedMessage(), LogAs.FAILED,true, values[0]);
//				Assert.fail();
				return "";
			}
		}
	
		public void compareText(WebDriver driver,String ExpectText,String ActualText) {
			
			try {
				if(ExpectText.equals(ActualText)) {
					add(driver, "Expected and Actual Text Same .!", LogAs.PASSED,true, ActualText);
				}
	
			} catch (Exception e) {
				add1(driver, "Expected and Actual Text NOt Same .!", LogAs.FAILED,true, ActualText);
			
//				Assert.fail();
				
			}
		}
		
		public void newTab2(WebDriver driver) {
			((JavascriptExecutor) driver).executeScript("window.open()");
	
			// Switch to the new tab
			ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
			wait(driver, "1");
			driver.switchTo().window(tab.get(tab.size() - 1));
			wait(driver, "2");
	
		}
	
		public String getTextWithoutFail(WebDriver driver, String xpath) {
			String[] values = splitXpath(xpath);
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			String text = webElement.getText();
			add(driver, "The value ' " + text + " ' is retrieved for the element ' " + values[0] + "'", LogAs.PASSED, true,values[0]);
			return text;
	
		}
	
		public static void waitTime(WebDriver driver, String waitSeconds) {
			driver.manage().timeouts().implicitlyWait(Integer.parseInt(waitSeconds), TimeUnit.SECONDS);
		}
	
		public void scrollBottom(WebDriver driver) {
			try {
	
				JavascriptExecutor jse = (JavascriptExecutor) driver;
				jse.executeScript("window.scroll(0,350)", "");
				waitTime(driver, "5");
				// add(driver, "Scrolled to the bottom ", LogAs.PASSED, true, "Not");
			} catch (Exception e) {
				// add1(driver, "Unable to scroll to the bottom", LogAs.FAILED, true, "Not");
			
				Assert.fail();
			}
		}
	
		public void scrollTop(WebDriver driver) {
			try {
				JavascriptExecutor jse = (JavascriptExecutor) driver;
				jse.executeScript("window.scroll(0,-200)", "");
				add(driver, "Scrolled to the Top ", LogAs.PASSED, true, "Not");
	
			} catch (Exception e) {
				add1(driver, "Unable to scroll to the Top", LogAs.FAILED, true, "Not" + "- " + e.getLocalizedMessage());
			
				Assert.fail();
			}
		}
	
		public boolean verifyElementIsPresent(WebDriver driver, String xpath) {
			String[] values = splitXpath(xpath);
			try {
				driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
				WebElement element = driver.findElement(By.xpath(values[1]));
				element.isDisplayed();
				add(driver, "Element '" + values[0] + "' present is verified ", LogAs.PASSED, true, "");
				return true;
			} catch (NoSuchElementException e) {
				add1(driver, "Element is Not Present : " + values[0] + "- " + e.getLocalizedMessage(), LogAs.FAILED, true,
						"");
			
//				Assert.fail();
				return false;
			}
		}
	
		
		public boolean verifyElementIsPresent1(WebDriver driver, String xpath) {
			String[] values = splitXpath(xpath);
			try {
				driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
				WebElement element = driver.findElement(By.xpath(values[1]));
				element.isDisplayed();
				add(driver, "Element '" + values[0] + "' present is verified ", LogAs.PASSED, true, "");
				return true;
			} catch (NoSuchElementException e) {
				add1(driver, "Element is Not Present : " + values[0] + "- " + e.getLocalizedMessage(), LogAs.FAILED, true,"");
				
				return false;
			}
		}
		
		public boolean verifyElementDisplayed(WebDriver driver, String xpath) {
			String[] values = splitXpath(xpath);
			try {
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				WebElement element = driver.findElement(By.xpath(values[1]));
				if(element.isDisplayed()) {
					add(driver, "Element '" + values[0] + "' present is verified ", LogAs.PASSED, true, "");
					return true;
				}else {
					add1(driver, "Element is Not displayed : " + values[0] + "- " , LogAs.FAILED, true,"");
					return false;
				}
				
			} catch (NoSuchElementException e) {
				add1(driver, "Unable to find Element " + values[0] , LogAs.FAILED, true,"");
				return false;
			}
		}
		
		
		public List<WebElement> getWebElements(WebDriver driver,String Xpath){
			try {
			String[] values = splitXpath(Xpath);
			List<WebElement> elements=driver.findElements(By.xpath(values[1]));
			return elements;
			}catch (Exception e) {
				return null;
			}
		}
		
		public WebElement getWebElement(WebDriver driver,String Xpath){
			try {
			String[] values = splitXpath(Xpath);
			WebElement element=driver.findElement(By.xpath(values[1]));
			return element;
			}catch (Exception e) {
				return null;
			}
		}
		
		public void verifyElementHasText(WebDriver driver, String xpath) {
			String[] values = splitXpath(xpath);
			try {
				String text = driver.findElement(By.xpath(values[1])).getText();
				if (!text.equals("")) {
					add(driver, "Element '" + values[0] + "' has text : " + text, LogAs.PASSED, true, "");
				} else {
					add1(driver, "No text on the element " + values[0], LogAs.FAILED, true, "");
				
					Assert.fail();
				}
			} catch (NoSuchElementException e) {
				add1(driver, "Element is Not Present " + values[0] + "- " + e.getLocalizedMessage(), LogAs.FAILED, true,
						"");
			
//				Assert.fail();
			}
		}
	
		public boolean isDisplayed(WebDriver driver, String xpath) {
			String[] values = splitXpath(xpath);
			try {
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				WebElement webElement = driver.findElement(By.xpath(values[1]));
				return webElement.isDisplayed();
			} catch (Exception e) {
				return false;
			}
		}
	
		public boolean isDisplayed2(WebDriver driver, String xpath) {
			String[] values = splitXpath(xpath);
			try {
				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				WebElement webElement = driver.findElement(By.xpath(values[1]));
				return webElement.isDisplayed();
			} catch (Exception e) {
				return false;
			}
		}
		public boolean isDisplayed1(WebDriver driver, String xpath) {
			String[] values = splitXpath(xpath);
			try {
				driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
				WebElement webElement = driver.findElement(By.xpath(values[1]));
				return webElement.isDisplayed();
			} catch (Exception e) {
				return false;
			}
		}
		public void elementnotvisible(WebDriver driver, String xpath) {
			String[] values = splitXpath(xpath);
			try {
				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				WebElement webElement = driver.findElement(By.xpath(values[1]));
				for (int i = 1; i <= 100; i++) {
					boolean flag = webElement.isDisplayed();
					if (flag == true) {
						Thread.sleep(3000);
					} else {
						break;
					}
				}
	
			} catch (Exception e) {
	
			}
		}
	
		public void elementnotvisible1(WebDriver driver, String xpath) {
			String[] values = splitXpath(xpath);
			try {
				WebDriverWait wait=new WebDriverWait(driver,200);
				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				WebElement webElement = driver.findElement(By.xpath(values[1]));
				if(webElement.isDisplayed()) {
					wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(values[1])));
//					System.out.println("Element not displayed Wait time over");
				}else {
//					System.out.println(values[0]+" not displayed ");
				}
			} catch (Exception e) {
//				/System.out.println("unable to find element : "+values[0]);
			}
		}
		
		public void waituntilelementnotvisible(WebDriver driver, String xpath) {
			String[] values = splitXpath(xpath);
	
				WebDriverWait wait =new WebDriverWait(driver,20);
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(values[1])));
				
		}
	
		public String getAttribute(WebDriver driver, String xpath, String attribute) {
			String[] values = splitXpath(xpath);
			try {
				WebElement inputBox = driver.findElement(By.xpath(values[1]));
				String textInsideInputBox = inputBox.getAttribute(attribute);
				add(driver, "Retrieved the text of " + values[0], textInsideInputBox, true, values[0]);
				return textInsideInputBox;
			} catch (NoSuchElementException e) {
				add1(driver, "Unable to retrieve the value " + values[0] + "- " + e.getLocalizedMessage(), LogAs.FAILED,
						true, values[0]);
			
//				Assert.fail();
				return null;
			}
	
		}
		
		public String getAttribute1(WebDriver driver, String xpath, String attribute) {
			String[] values = splitXpath(xpath);
			try {
				WebElement inputBox = driver.findElement(By.xpath(values[1]));
				String textInsideInputBox = inputBox.getAttribute(attribute);
//				add(driver, "Retrieved the text of " + values[0], textInsideInputBox, true, values[0]);
				return textInsideInputBox;
			} catch (NoSuchElementException e) {
				add1(driver, "Unable to retrieve the value " + values[0] + "- " + e.getLocalizedMessage(), LogAs.FAILED,
						true, values[0]);
			
//				Assert.fail();
				return null;
			}
	
		}
	
	
		public boolean verifyElementIsNotPresent(WebDriver driver, String xpaths) {
			String[] values = splitXpath(xpaths);
			try {
				WebElement element = driver.findElement(By.xpath(values[1]));
				element.isDisplayed();
				add1(driver, "Element is Present" + values[0], LogAs.FAILED, true, values[0]);
				Assert.fail();
				return true;
			} catch (NoSuchElementException e) {
				add(driver, "Verified Element is not Present" + values[0] + "- " + e.getLocalizedMessage(), values[0], true,
						values[0]);
			}
			return true;
	
		}
	
		public void scrollUsingElement(WebDriver driver, String xpath) {
			String[] values = splitXpath(xpath);
			try {
				WebElement element = driver.findElement(By.xpath(values[1]));
//				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true); window.scrollBy(0, -100);", element);
				WebDriverWait wait = new WebDriverWait(driver, 10);
	            wait.until(ExpectedConditions.visibilityOf(element));
	            wait.until(ExpectedConditions.elementToBeClickable(element));
//				add(driver, "Scrolled to " + values[0], LogAs.PASSED, true, values[0]);
			} catch (Exception e) {
				add1(driver, "Unable to scroll " + values[0] + "- " + e.getLocalizedMessage(), LogAs.FAILED, true,
						values[0]);
			
//				Assert.fail();
			}
		}
	
		public void goBack(WebDriver driver) {
	
			try {
				driver.navigate().back();
				add(driver, "Go Back", LogAs.PASSED, true, "goback");
	
			} catch (Exception e) {
				add(driver, "Unable to Go Back", LogAs.FAILED, true, "goback");
			
				Assert.fail();
	
			}
		}
	
		public void keyBoardEvent(int eventNumber) {
			try {
	
				Thread.sleep(1000);
	
				Runtime.getRuntime().exec(
	
						"cmd /C adb shell input keyevent " + eventNumber);
	
				Thread.sleep(3000);
	
			} catch (Throwable t) {
	
				t.printStackTrace();
	
			}
		}
	
		public void team_Arrow(WebDriver driver, String value) {
	
			driver.findElement(By.xpath("//td[text()='" + value + "@trackd.com']/..//div[@class='action-icon-container']"))
					.click();
	
		}
	
		public void type(WebDriver driver, int value) {
	
			driver.findElement(By.xpath("(//div[@class='sc-jcFjpl fOTaNF'])[" + value + "]")).click();
		}
	
		public void manufacturer(WebDriver driver, int value, String value1) {
	
			driver.findElement(By.xpath("(//*[text()='₹']//following::input[1])[" + value + "]")).sendKeys(value1);
	
			add(driver, "type on " + "manufacture", LogAs.PASSED, true, "");
		}
	
		public void Description(WebDriver driver, int value, String value1) {
			// *[@placeholder='Description']
			driver.findElement(By.xpath("(//*[text()='₹']//following::input[2])[" + value + "]")).sendKeys(value1);
			add(driver, "type on  " + "Description", LogAs.PASSED, true, "");
		}
	
		public void cost(WebDriver driver, int value, String value1) {
	
			driver.findElement(By.xpath("(//*[text()='₹']//preceding::input[1])[" + value + "]")).sendKeys(value1);
			add(driver, "type on  " + "Cost", LogAs.PASSED, true, "");
		}
	
		public void vendor(WebDriver driver, int value, String value1) {
	
			driver.findElement(By.xpath("(//*[text()='₹']//following::input[1])[" + value + "]")).sendKeys(value1);
			add(driver, "type on  " + "vendor", LogAs.PASSED, true, "");
	
		}
	
		public void familyname(WebDriver driver, int value, String value1) {
	
			driver.findElement(By.xpath("(//*[@placeholder='Furniture Family'])[" + value + "]")).sendKeys(value1);
			add(driver, "type on  " + "Furniture Family", LogAs.PASSED, true, "");
		}
	
		public void waitTillVisibilityElement(WebDriver driver, String xpath) {
			String[] values = splitXpath(xpath);
	
			try {
				driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
				WebElement webElement = driver.findElement(By.xpath(values[1]));
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.visibilityOf(webElement));
				add(driver, "Waited till the element is visible", LogAs.PASSED, true, values[0]);
			} catch (Exception e) {
				add(driver, "Unable to wait till an element is visible", LogAs.FAILED, true,
						values[0] + "-" + e.getLocalizedMessage());
			
				Assert.fail();
	
			}
		}
	
		public void waitTillElementIsClickable(WebDriver driver, String xpath) {
			try {
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				String[] values = splitXpath(xpath);
				WebElement webElement = driver.findElement(By.xpath(values[1]));
				WebDriverWait wait = new WebDriverWait(driver, 30);
				wait.until(ExpectedConditions.elementToBeClickable(webElement));
				add(driver, "Waited till the element is clickable", LogAs.PASSED, true, "Scroll down");
			} catch (Exception e) {
				add(driver, "Unable to wait till an element is clickable", LogAs.FAILED, true,
						"Scroll down" + "- " + e.getLocalizedMessage());
			
				Assert.fail();
	
			}
		}
	
		public boolean IsElementEnabled(WebDriver driver, String xpath) {
			String[] values = splitXpath(xpath);
			try {
				WebElement webElement = driver.findElement(By.xpath(values[1]));
				if(webElement.isEnabled()) {
					return true;
				}else {
					return false;
				}
//				add(driver, "Element is enabled" + values[0], LogAs.PASSED, true, values[0]);
				
			} catch (NoSuchElementException e) {
//				add(driver, "Element is not enabled", LogAs.FAILED, true, values[0]);
				return false;
			}
		}
	
		public int getRandomNum(WebDriver driver, int upperlimit) {
			List<Integer> randomZeroToSeven = new ArrayList<>();
			for (int i = 1; i <= upperlimit; i++) {
				randomZeroToSeven.add(i);
			}
			Collections.shuffle(randomZeroToSeven);
	
			return randomZeroToSeven.get(0);
	
		}
		
		public void deSelectByIndex(WebDriver driver, String xpath, String inputData) {
			String[] values = splitXpath(xpath);
			try {
				WebElement webElement = driver.findElement(By.xpath(values[1]));
				Integer index = new Integer(inputData);
				Select selectBox = new Select(webElement);
				selectBox.deselectByIndex(index);
				add(driver, "Deselect the dropdown by index " + values[0], LogAs.PASSED, true, values[1]);
			} catch (Exception e) {
				add1(driver, "Unable to deselect the dropdown by index" + values[0], LogAs.FAILED, true, values[1]);
			
				Assert.fail();
			}
		}
	
		public void deSelectByValue(WebDriver driver, String xpath, String inputData) {
			String[] values = splitXpath(xpath);
			try {
				WebElement webElement = driver.findElement(By.xpath(values[1]));
				Select selectBox = new Select(webElement);
				selectBox.deselectByValue(inputData);
				add(driver, "Deselect the dropdown by index " + values[0], LogAs.PASSED, true, values[1]);
			} catch (Exception e) {
				add(driver, "Unable to deselect the dropdown by index" + values[0], LogAs.FAILED, true, values[1]);
			
				Assert.fail();
			}
		}
	
		public void getWindow(WebDriver driver, String path) {
			try {
				waitTime(driver, "5");
				Main_Window = driver.getWindowHandle();
				System.out.println("Main_Window:" + Main_Window);
				String[] values = splitXpath(path);
				WebElement webElement = driver.findElement(By.xpath(values[1]));
				webElement.click();
				Thread.sleep(500);
				ArrayList<String> allWindows = new ArrayList<String>(driver.getWindowHandles());
				System.out.println("2nd Window:" + allWindows.get(1));
				driver.switchTo().window(allWindows.get(1));
			} catch (InterruptedException e) {
			}
		}
	
		public void switchWindow(WebDriver driver) {
			try {
				driver.switchTo().window(Main_Window);
			} catch (Exception e) {
			}
		}
	
		public void switchDefaultContent(WebDriver driver) {
			driver.switchTo().defaultContent();
		}
	
		public void getAutoit(String exePath) {
			try {
				Runtime.getRuntime().exec(exePath);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	
		public void dragElement(WebDriver driver, String xpath) {
			String[] values = splitXpath(xpath);
			try {
				WebElement webElement = driver.findElement(By.xpath(values[1]));
				fromElement = webElement;
				add(driver, "Drag an element " + values[0], LogAs.PASSED, true, values[0]);
			} catch (Exception e) {
				add1(driver, "Unable to drag an element " + values[0], LogAs.FAILED, true, values[0]);
			}
	
		}
	
		public void dropElement(WebDriver driver, String xpath) {
			String[] values = splitXpath(xpath);
			try {
				WebElement webElement = driver.findElement(By.xpath(values[1]));
				Actions action = new Actions(driver);
				Action dragDrop = action.dragAndDrop(fromElement, webElement).build();
				dragDrop.perform();
				add(driver, "Drop an element " + values[0], LogAs.PASSED, true, values[0]);
			} catch (Exception e) {
				add1(driver, "Unable to drag an element " + values[0], LogAs.FAILED, true, values[0]);
			}
		}
	
		public boolean isElementSelected(WebDriver driver, String xpaths) {
			String[] values = splitXpath(xpaths);
			try {
				WebElement webElement = driver.findElement(By.xpath(values[1]));
				if(webElement.isSelected()) {
//					add(driver, "Verified Element is selected " + values[0], LogAs.PASSED, true, values[0]);
					return true;
				}else {
//					add1(driver, "Element is not selected " + values[0], LogAs.FAILED, true, values[0]);
					return false;
				}
				
			} catch (NoSuchElementException e) {
	
				add1(driver, "Unable to check element selection" + values[0], LogAs.FAILED, true, values[0]);
				return false;
			}
		}
	
		
	
		public void IstextPresent(WebDriver driver, String inputData) {
			if (driver.getPageSource().contains(inputData)) {
				add(driver, "Text is Present " + inputData, LogAs.PASSED, true, inputData);
			} else {
				add1(driver, "Text is not Present " + inputData, LogAs.FAILED, true, inputData);
			}
		}
	
		
		public void isElementClickable(WebDriver driver, String xpath) {
			String[] values = splitXpath(xpath);
			try {
				WebElement webElement = driver.findElement(By.xpath(values[1]));
				WebDriverWait waits = new WebDriverWait(driver, 60);
				waits.until(ExpectedConditions.elementToBeClickable(webElement));
				add(driver, "Element is clickable " + values[0], LogAs.PASSED, true, values[0]);
			} catch (Exception e) {
				add1(driver, "Element is not clickable " + values[0] + "- " + e.getLocalizedMessage(), LogAs.FAILED, true,
						values[0]);
			}
		}
	
		public void isElementSelectable(WebDriver driver, String xpath) {
			String[] values = splitXpath(xpath);
			try {
				WebElement webElement = driver.findElement(By.xpath(values[1]));
				WebDriverWait waits = new WebDriverWait(driver, 60);
				waits.until(ExpectedConditions.elementToBeSelected(webElement));
				add(driver, "Element is selectable " + values[0], LogAs.PASSED, true, values[0]);
			} catch (Exception e) {
				add1(driver, "Element is not selectable " + values[0] + "- " + e.getLocalizedMessage(), LogAs.FAILED, true,
						values[0]);
			}
		}
	
		public void waitUntilVisibilityOfElement(WebDriver driver, String xpath) {
			String[] values = splitXpath(xpath);
			try {
				WebElement webElement = driver.findElement(By.xpath(values[1]));
				WebDriverWait wait = new WebDriverWait(driver, 60);
				wait.until(ExpectedConditions.visibilityOf(webElement));
				add(driver, "Wait till the Element is visible " + values[0], LogAs.PASSED, true, values[0]);
			} catch (Exception e) {
				add1(driver, "Element is not visible " + values[0] + "- " + e.getLocalizedMessage(), LogAs.FAILED, true,
						values[0]);
			}
	
		}
	
		public void waitForElementNotpresent(WebDriver driver, String xpath) {
			String[] values = splitXpath(xpath);
			try {
				WebDriverWait wait = new WebDriverWait(driver, 50);
				wait.until(ExpectedConditions.not(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))));
				add(driver, "Wait till the Element is visible " + values[0], LogAs.PASSED, true, values[0]);
			} catch (Exception e) {
				add1(driver, "Element is not visible " + values[0] + "- " + e.getLocalizedMessage(), LogAs.FAILED, true,
						values[0]);
			}
		}
	
		public String dynamicSendkeys(WebDriver driver, String inputData, String xpath) {
			String[] values = splitXpath(xpath);
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			webElement.clear();
			try {
				Thread.sleep(500);
				String currenttime = new SimpleDateFormat("HHmmssa").format(Calendar.getInstance().getTime());
				String originalValue = inputData;
				String combinedValues = currenttime + originalValue;
				sendKeys(driver, xpath, combinedValues);
				return combinedValues;
			} catch (InterruptedException e) {
	
				return null;
			}
	
		}
	
		public void partialTextVerify(String sentence, String word) {
			if (sentence.contains(word)) {
			} else {
			}
	
		}
	
		public String enterUniquePhone(WebDriver driver, String path) {
			String[] values = splitXpath(path);
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			webElement.clear();
			try {
				Thread.sleep(500);
				String phonenumber = new SimpleDateFormat("MMddHHmmss").format(Calendar.getInstance().getTime());
				sendKeys(driver, path, phonenumber);
				return phonenumber;
			} catch (InterruptedException e) {
				return null;
			}
	
		}
	
		public String dynamicTypeName(WebDriver driver, String inputData, String webElementxPath) {
			String[] values = splitXpath(webElementxPath);
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			webElement.clear();
			try {
				Thread.sleep(500);
				String currenttime = new SimpleDateFormat("HH_mmss").format(Calendar.getInstance().getTime());
				String combinedValues = inputData + currenttime;
				sendKeys(driver, webElementxPath, combinedValues);
				return combinedValues;
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}
	
		public String sumOfTwoNumbers(String GetText1, String GetText2) {
			try {
				int string1 = Integer.parseInt(GetText1);
				int string2 = Integer.parseInt(GetText2);
				int sum1 = string1 + string2;
				String sum = Integer.toString(sum1);
				return sum;
			} catch (Exception e) {
				return null;
			}
		}
	
		public void quit(WebDriver driver) {
			try {
				driver.quit();
			} catch (Exception e) {
			}
		}
	
		public void refreshPage(WebDriver driver) {
			try {
				waitTime(driver, "5");
				driver.navigate().refresh();
				waitTime(driver, "5");
			} catch (Exception e) {
				Assert.fail();
			}
		}
	
		public void maximize(WebDriver driver) {
			try {
				driver.manage().window().maximize();
			} catch (Exception e) {
				Assert.fail();
			}
		}
	
		public void keyTab(WebDriver driver) {
			try {
				Actions action = new Actions(driver);
				action.sendKeys(Keys.TAB).build().perform();
	
			} catch (Exception e) {
				Assert.fail();
			}
		}

	
		public void goForward(WebDriver driver) {
			try {
				driver.navigate().forward();
	
			} catch (Exception e) {
			
				Assert.fail();
			}
		}
	
		public void keyboardTab(WebDriver driver) {
			Actions actionObject = new Actions(driver);
			actionObject.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).perform();
		}
	
		public void enter(WebDriver driver) {
			try {
				Actions actionObject = new Actions(driver);
				actionObject.sendKeys(Keys.ENTER).build().perform();
			} catch (Exception e) {
			
				Assert.fail();
			}
		}
	
		public String alertAccept(WebDriver driver, String path) {
			String[] values = splitXpath(path);
	
			try {
				WebElement webElement = driver.findElement(By.xpath(values[1]));
				webElement.click();
				Alert alert = driver.switchTo().alert();
				String alertText = alert.getText();
				alert.accept();
				return alertText;
			} catch (Exception e) {
			
				Assert.fail();
				return null;
			}
		}
	
		public void dismissAlert(WebDriver driver) {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		}
	
		public String promptBox(WebDriver driver, String path, String inputData) {
			String[] values = splitXpath(path);
			try {
	
				WebElement element = driver.findElement(By.xpath(values[1]));
				element.click();
				Alert alert = driver.switchTo().alert();
				driver.switchTo().alert().sendKeys(inputData);
				String alertText = alert.getText();
				alert.accept();
				return alertText;
			} catch (Exception e) {
				return null;
			}
		}
	
		public void switchToFrame(WebDriver driver, String frameName) {
			String[] values = splitXpath(frameName);
			try {
				WebElement element = driver.findElement(By.xpath(values[1]));
				driver.switchTo().frame(element);
	
			} catch (NoSuchFrameException e) {
	
			}
		}
	
		public void switchToDefaultFrame(WebDriver driver) {
			try {
				driver.switchTo().defaultContent();
			} catch (Exception e) {
			
				Assert.fail();
			}
		}
	
		public static void uniqueObjects(WebDriver driver) {
	
			try {
	
				JavascriptExecutor js1 = (JavascriptExecutor) driver;
				js1.executeScript("checkBox = store.exposed.getBabylonGUIElementByName(\"arrayCheckbox\");\r\n"
						+ "if (checkBox){\r\n"
						+ "    const currentValue = store.arrayFunctionGlobalVariables.uniqueObjects;\r\n"
						+ "    const newValue = !currentValue;\r\n" + "\r\n" + "    checkBox.isChecked = newValue;\r\n"
						+ "    checkBox.onIsCheckedChangedObservable.notifyObservers(newValue);\r\n" + "}");
	
			}
	
			catch (Exception e1) {
				System.out.println(e1);
			
				Assert.fail();
	
			}
	
		}
		
		public void keyDown(WebDriver driver) {
			Actions actionObject = new Actions(driver);
			actionObject = actionObject.sendKeys(Keys.ARROW_DOWN);
			actionObject.perform();
		}
	
		public void keyUp(WebDriver driver) {
			Actions actionObject = new Actions(driver);
			actionObject = actionObject.sendKeys(Keys.ARROW_UP);
			actionObject.perform();
		}
	
		public void keyboardPageUp(WebDriver driver) {
			Actions actionObject = new Actions(driver);
			actionObject.keyDown(Keys.CONTROL).sendKeys(Keys.PAGE_UP).perform();
		}
	
		public void refreshUsingKeys(WebDriver driver) {
			Actions actionObject = new Actions(driver);
			actionObject.sendKeys(Keys.F5).perform();
		}
	
		public void keyboardPageDown(WebDriver driver) {
			Actions actionObject = new Actions(driver);
			actionObject.keyDown(Keys.CONTROL).sendKeys(Keys.PAGE_DOWN).perform();
			waitTime(driver, "5");
		}
	
		public void keyboardEnd(WebDriver driver) {
			Actions actionObject = new Actions(driver);
			actionObject.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
			waitTime(driver, "5");
		}
	
		public void keyboardHome(WebDriver driver) {
			Actions actionObject = new Actions(driver);
			actionObject.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
			waitTime(driver, "5");
		}
	
		public void keyboardArrowUp(WebDriver driver) {
			Actions actionObject = new Actions(driver);
			actionObject.keyDown(Keys.CONTROL).sendKeys(Keys.ARROW_UP).perform();
		}
	
		public void keyboardArrowDown(WebDriver driver) {
			Actions actionObject = new Actions(driver);
			actionObject.keyDown(Keys.CONTROL).sendKeys(Keys.ARROW_DOWN).perform();
		}
	
		public void keyboardArrowLeft(WebDriver driver) {
			Actions actionObject = new Actions(driver);
			actionObject.keyDown(Keys.CONTROL).sendKeys(Keys.ARROW_LEFT).perform();
		}
	
		public void keyboardArrowRight(WebDriver driver) {
			Actions actionObject = new Actions(driver);
			actionObject.keyDown(Keys.CONTROL).sendKeys(Keys.ARROW_RIGHT).perform();
		}
	
		public void pageMaximizeUsingKey(WebDriver driver) {
			Actions actionObject = new Actions(driver);
			actionObject = actionObject.sendKeys(Keys.F11);
			actionObject.perform();
		}
	
		public void deleteAllCookies(WebDriver driver) {
			driver.manage().deleteAllCookies();
	
		}
	
		public void navigateUrl(WebDriver driver, String inputData) {
			if (inputData == null) {
				add(driver, " Navigated to " + inputData, LogAs.FAILED, true, "");
			
				Assert.fail(inputData);
			} else {
				driver.navigate().to(inputData);
				add(driver, " Navigated to " + inputData, LogAs.PASSED, true, "");
				driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			}
	
		}
	
		public void highLightElement(WebDriver driver, String xpath) {
			String[] values = splitXpath(xpath);
			WebElement webElement = driver.findElement(By.xpath(values[1]));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', arguments[1]);", webElement,
					"color: red; border: 3px solid red;");
			js.executeScript("arguments[0].setAttribute('style', arguments[1]);", webElement, "");
		}
	
	
		public void windowhandlesframe(WebDriver driver, int values) {
	
			try {
				ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
				// Set<String>windowhandles1=driver.getWindowHandles();
				System.out.println(tabs1);
				Thread.sleep(5000);
				// List<String>list=new ArrayList<>(windowhandles1)
				driver.switchTo().window(tabs1.get(values));
				System.out.println(driver.getCurrentUrl());
			} catch (InterruptedException e) {
	
				e.printStackTrace();
			}
	
		}
	
		public void windowhandles(WebDriver driver) {
	
			Set<String> windowhandles1 = driver.getWindowHandles();
			System.out.println(windowhandles1);
			List<String> list = new ArrayList<>(windowhandles1);
			driver.switchTo().window(list.get(1));
			System.out.println(driver.getCurrentUrl());
	
		}
	
		public void Arrow_Click(WebDriver driver, String xpaths, String name) {
			String[] values = splitXpath(xpaths);
	
			List<WebElement> titletext1 = driver.findElements(By.xpath(values[1]));
	
			System.out.println("titlesize" + titletext1.size());
	
			for (WebElement webElement1 : titletext1) {
				String name1 = webElement1.getText();
				if (name1.contains(name)) {
					webElement1.click();
					System.out.println(name1);
					add(driver, " Click on " + values[0], LogAs.PASSED, true, values[0]);
					wait(driver, "1");
					break;
	
				}
			}
		}
	
		public void Folder_Select(WebDriver driver, String xpaths, String name) {
			String[] values = splitXpath(xpaths);
	
			try {
				WebDriverWait wait1 = new WebDriverWait(driver, 20);
				wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(values[1])));
	
				List<WebElement> title3 = driver.findElements(By.xpath(values[1]));
				System.out.println("title3" + title3.size());
				for (WebElement webElement3 : title3) {
					String text11 = webElement3.getText();
					if ((text11.equalsIgnoreCase(name))) {
						webElement3.click();
						System.out.println("text11 :" + text11);
						add(driver, " Able to select the folder " + text11, LogAs.PASSED, true, "");
						break;
	
					}
				}
	
			} catch (Exception e) {
				// add(driver, " Unable to select the folder " + "", LogAs.FAILED, true, "");
			}
		}
	
//		public void Upload_File(WebDriver driver, String Location, String xpaths) {
//			String[] values = splitXpath(xpaths);
//			Robot rb1;
//			try {
//				rb1 = new Robot();
//				rb1.delay(1000);
//				StringSelection ss = new StringSelection(Location);
//				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//	
//				rb1.keyPress(KeyEvent.VK_CONTROL);
//				rb1.keyPress(KeyEvent.VK_V);
//				rb1.keyRelease(KeyEvent.VK_V);
//				rb1.keyRelease(KeyEvent.VK_CONTROL);
//				wait(driver, "2");
//				rb1.keyPress(KeyEvent.VK_ENTER);
//				wait(driver, "10");
//				WebElement webElement = driver.findElement(By.xpath(values[1]));
//				JavascriptExecutor js = (JavascriptExecutor) driver;
//				js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",
//						webElement);
//				webElement.click();
//				wait(driver, "2");
//			} catch (AWTException e) {
//	
//				e.printStackTrace();
//			}
//	
//		}
	
		public void windowhandles1(WebDriver driver) {
	
			Set<String> windowhandles1 = driver.getWindowHandles();
			System.out.println(windowhandles1);
			List<String> list = new ArrayList<>(windowhandles1);
			driver.switchTo().window(list.get(0));
			System.out.println(driver.getCurrentUrl());
	
		}
	
		public void windowhandles2(WebDriver driver) {
	
			Set<String> windowhandles1 = driver.getWindowHandles();
			System.out.println(windowhandles1);
			List<String> list = new ArrayList<>(windowhandles1);
			driver.switchTo().window(list.get(2));
			System.out.println(driver.getCurrentUrl());
	
		}
	
		public void newtapopen(WebDriver driver) {
			// driver.switchTo()
		}
	
		
//		public void newTab(WebDriver driver) {
//			try {
//				Robot r = new Robot();
//				r.keyPress(KeyEvent.VK_CONTROL);
//				r.keyPress(KeyEvent.VK_T);
//				r.keyRelease(KeyEvent.VK_CONTROL);
//				wait(driver, "1");
//				ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//				driver.switchTo().window(tabs.get(1));
//				wait(driver, "1");
//				wait(driver, "1");
//			} catch (Exception e) {
//			}
//		}
	
		
	
		public void get(WebDriver driver, String url) {
			Capabilities localCapabilities = ((RemoteWebDriver) driver).getCapabilities();
			String browser = localCapabilities.getBrowserName().toLowerCase();
			driver.get(url);
			if (browser.equalsIgnoreCase("ie") || browser.equalsIgnoreCase("UnKnown")) {
				wait(driver, "5");
				driver.get("javascript:document.getElementById('overridelink').click();");
				wait(driver, "5");
			}
	
		}
	
		public static String apiputrequest(String url, String method, String header) throws JSONException {
	
			String URL = url;
	
			Response res = null;
	
			if (method.equalsIgnoreCase("PUT")) {
				res = RestAssured.given().headers("Authorization", header).with().contentType("application/json").then()
						.expect().when().put(URL);
			}
	
			JSONObject jsonObject = null;
			jsonObject = new JSONObject(res.asString());
			System.out.println("---output----" + jsonObject.toString() + "---output---");
			return res.asString();
	
		}
	
		public static int GenerateRandomNumber() {
	
			System.out.println("Random Numbers:");
			Random rand = new Random();
			int num = rand.nextInt(900000) + 100000;
			System.out.println("***************");
			System.out.println(num);
	
			return num;
		}
	
		public void mouseOverAndClick(WebDriver driver, String element) {
			String[] values = splitXpath(element);
			
			try {
				WebElement webElement = driver.findElement(By.xpath(values[1]));
				Actions builder = new Actions(driver);
				builder.moveToElement(webElement).build().perform();
				wait(driver,"1");
				builder.click(webElement).build().perform();
				add(driver, "Clicked on "+values[0], LogAs.PASSED, true, "");
			} catch (Exception e) {
		        System.out.println("not clicked : "+values[0]);
		        add1(driver, "Unable to Click on : "+values[0], LogAs.FAILED, true, "Not");
			}
		}
	
		public void mouseOverToElement(WebDriver driver, String element) {
			String[] values = splitXpath(element);
			try {
				WebElement webElement = driver.findElement(By.xpath(values[1]));
				Actions builder = new Actions(driver);
				builder.moveToElement(webElement).build().perform();
	         wait(driver,"1");
			} catch (Exception e) {
	
			}
		}
	
	
	
		// Click to given day
		public static void clickGivenDay(List<WebElement> elementList, String day) {
			// DatePicker is a table. Thus we can navigate to each cell
			// and if a cell matches with the current date then we will click it.
			/** Functional JAVA version of this method. */
			elementList.stream().filter(element -> element.getText().contains(day)).findFirst()
					.ifPresent(WebElement::click);
		}
	
		public static String getCurrentDay() {
			// Create a Calendar Object
			Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
	
			// Get Current Day as a number
			int todayInt = calendar.get(Calendar.DAY_OF_MONTH);
			System.out.println("Today Int: " + todayInt + "\n");
	
			// Integer to String Conversion
			String todayStr = Integer.toString(todayInt);
			System.out.println("Today Str: " + todayStr + "\n");
	
			return todayStr;
		}
	
		public void scrolltill(WebDriver driver) {
			try {
	
				JavascriptExecutor jse = (JavascriptExecutor) driver;
				jse.executeScript("window.scroll(0,12200)", "");
				waitTime(driver, "5");
				// add(driver, "Scrolled to the bottom ", LogAs.PASSED, true, "Not");
			} catch (Exception e) {
				// add1(driver, "Unable to scroll to the bottom", LogAs.FAILED, true, "Not");
				Assert.fail();
			
			}
		}
	
		public void Alert1(WebDriver driver) {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}
	
		public void Escape(WebDriver driver) {
	
			Actions action=new Actions(driver);
			try {
				//wait(driver,"1");
				action.sendKeys(Keys.ESCAPE).build().perform();
			} catch (Exception e) {
				System.out.println("escape its not working");
			}
	
		}
	
		public void takescreenshot(WebDriver driver, String screenshot_path) {
			File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File dest = new File(System.getProperty("user.dir") + "/Screenshots" + screenshot_path + ".png");
			try {
				FileUtils.copyFile(scr, dest);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			add(driver, "Captured the screenshot " + "", LogAs.PASSED, true, "");
//			Extent_pass(driver, "Click on " + "Screenshot", test);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		
//		public void elementScreenShot(WebDriver driver,String xpath,String screenshot_path) {
//			String [] elementPath=splitXpath(xpath);
//		
//	        try {
//	        	WebElement element = driver.findElement(By.xpath(elementPath[1]));
//	            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//	            int x = element.getLocation().getX();
//	            int y = element.getLocation().getY();
//	            int width = element.getSize().getWidth();
//	            int height = element.getSize().getHeight();
//
//	            BufferedImage img = ImageIO.read(screenshot);
//	            BufferedImage croppedImg = img.getSubimage(x, y, width, height);
//				File dest = new File(System.getProperty("user.dir") + "/Screenshots" + screenshot_path + ".png");
//	            ImageIO.write(croppedImg, "png", dest);
//
////	            System.out.println("Screenshot of element saved successfully.");
//
//	        } catch (IOException e) {
//	            e.printStackTrace();
//	        }
//		}
		
		
		public void elementScreenShot_new(WebDriver driver, String xpath, String screenshot_path) {
			
			try {
				String[] elementPath = splitXpath(xpath);

			    // Get the zoom level of the window
			    JavascriptExecutor js = (JavascriptExecutor) driver;
			    Object zoomObject = js.executeScript("return window.devicePixelRatio * 100");
			    long zoomLevel = Math.round((double) zoomObject);

			    // Wait for the WebElement to be clickable
			    WebDriverWait wait = new WebDriverWait(driver, 10);
			    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementPath[1])));

			    if (element != null) {
			        // Get the location and size of the WebElement
			        Point point = element.getLocation();
			        int width = element.getSize().getWidth();
			        int height = element.getSize().getHeight();

			        System.out.println("Location: (" + point.getX() + ", " + point.getY() + ")");
			        System.out.println("Size: (" + width + "x" + height + ")");

			        // Adjust coordinates and dimensions based on zoom level
			        double zoomFactor = zoomLevel / 100.0;
			        int adjustedX = (int) (point.getX() * zoomFactor);
			        int adjustedY = (int) (point.getY() * zoomFactor);
			        int adjustedWidth = (int) (width * zoomFactor);
			        int adjustedHeight = (int) (height * zoomFactor);

			        // Take a screenshot of the entire page
			        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			        try {
			            BufferedImage fullImg = ImageIO.read(screenshotFile);

			            // Ensure the cropped dimensions are within the bounds of the full image
			            adjustedWidth = Math.min(adjustedWidth, fullImg.getWidth() - adjustedX);
			            adjustedHeight = Math.min(adjustedHeight, fullImg.getHeight() - adjustedY);

			            BufferedImage elementImg = fullImg.getSubimage(adjustedX, adjustedY, adjustedWidth, adjustedHeight);
			            File croppedFile = new File(System.getProperty("user.dir") + "/Screenshots" + screenshot_path + ".png");
			            ImageIO.write(elementImg, "png", croppedFile);
			            System.out.println("Screenshot saved successfully.");
			        } catch (IOException | RasterFormatException e) {
			            e.printStackTrace();
			        }
			    } else {
			        System.out.println("Element not found or not clickable.");
			    }
				
			}catch(Exception e) {
				
			}
		    
		}
		
		public void takescreenshot1(WebDriver driver, String screenshot_path) {
			try {
				Robot robot = new Robot();
	
				// Define the region to capture using top-left and bottom-right coordinates
				int x1 = 70; // x-coordinate of the top-left corner
				int y1 = 200; // y-coordinate of the top-left corner
				int x2 = 1350; // x-coordinate of the bottom-right corner
				int y2 = 500; // y-coordinate of the bottom-right corner
	
				Rectangle captureRect = new Rectangle(x1, y1, x2, y2);
	
				BufferedImage screenCapture = robot.createScreenCapture(captureRect);
	
				// Save the screenshot
				File dest = new File(System.getProperty("user.dir") + "/Screenshots" + screenshot_path + ".png");
				ImageIO.write(screenCapture, "png", dest);
	
				System.out.println("Screenshot captured successfully!");
	
				add(driver, "Captured the screenshot " + "", LogAs.PASSED, true, "");
//				Extent_pass(driver, "Taken Screenshot for " + screenshot_path, test);
	
			} catch (AWTException | IOException e) {
				e.printStackTrace();
			}
	
		}
	
		
		public boolean imageComparison2(WebDriver driver, String ExpectedImage_path, String actualImage_path)
				throws IOException {
			String image_res = null;
	
			try {
				BufferedImage img1 = ImageIO
						.read(new File("./Screenshots/Expected_screenshot" + ExpectedImage_path + ".png"));
				BufferedImage img2 = ImageIO.read(new File("./Screenshots/Actual_screenshot" + actualImage_path + ".png"));
	
				int w1 = img1.getWidth();
				int w2 = img2.getWidth();
				int h1 = img1.getHeight();
				int h2 = img2.getHeight();
				long diff = 0;
	
				if ((w1 != w2) || (h1 != h2)) {
					System.out.println("Both images should have the same dimensions");
					return false;
				} else {
					for (int j = 0; j < h1; j++) {
						for (int i = 0; i < w1; i++) {
							int pixel1 = img1.getRGB(i, j);
							Color color1 = new Color(pixel1, true);
							int r1 = color1.getRed();
							int g1 = color1.getGreen();
							int b1 = color1.getBlue();
	
							int pixel2 = img2.getRGB(i, j);
							Color color2 = new Color(pixel2, true);
							int r2 = color2.getRed();
							int g2 = color2.getGreen();
							int b2 = color2.getBlue();
	
							long data = Math.abs(r1 - r2) + Math.abs(g1 - g2) + Math.abs(b1 - b2);
							diff = diff + data;
						}
					}
	
					String[] s = ExpectedImage_path.split("/");
					double avg = (double) diff / (w1 * h1 * 3);
					double percentage = (avg / 255) * 100;
					System.out.println("Difference: " + percentage);
	
					if (percentage < 0.2) {
						image_res = "Pass";
//						add(driver, s[1] + " - " + s[2] + " - Image compared successfully", LogAs.PASSED, true,
//								"");
						System.out.println(s[1] + " - " + s[2] + " - Image compared successfully");
						return true;
					} else {
//						add1(driver, s[1] + " - " + s[2] + " - Expected and Actual images are not the same", LogAs.FAILED,
//								true, "");
						System.out.println(s[1] + " - " + s[2] + " - Expected and Actual images are not the same ");
						return false;
					}
				}
			} catch (Exception e) {
				System.out.println("Exception while taking Screenshot: " + e.getMessage());
				return false;
			}
			
		}
	
		public static void disableToast(WebDriver driver) {
	
			try {
	
				JavascriptExecutor js1 = (JavascriptExecutor) driver;
				Object de = js1.executeScript("store.exposed.autoSaveConfig.disableToasts()");
				System.out.println(de);
	
			}
	
			catch (Exception e1) {
				Assert.fail();
			}
	
		}
	
//		public void getfps(WebDriver driver, String action) {
//	
//			try {
//	
//				JavascriptExecutor js1 = (JavascriptExecutor) driver;
//				Object de = js1.executeScript("return store.scene.getEngine().getFps()");
//				System.out.println(action + " FPS value : " + de);
//	
//				// add(driver, action+" : FPS", LogAs.PASSED, true, ""+de);
//				addfps(driver, action + " FPS", de.toString(), true, "");
//	
//			}
//	
//			catch (Exception e1) {
//				add1(driver, "Could not retrieve FPS value", LogAs.FAILED, true, "");
//			}
//	
//		}
	
		public void verifyElementText(WebDriver driver, String xpath, String expectedtext) {
			String[] values = splitXpath(xpath);
			try {
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				waitForElement(driver, xpath);
				String text = driver.findElement(By.xpath(values[1])).getText();
				if (text.equals(expectedtext)) {
					add(driver, "Exepected text is present" + values[0] + "" + text, LogAs.PASSED, true, values[0]);
				}
			} catch (NoSuchElementException e) {
				add1(driver, "Expected text is Not Present " + values[0], LogAs.FAILED, true, values[0]);
				Assert.fail();
			}
		}
	
		public static void ActionTest(ExtentTest extentTest) {
			test = extentTest;
		}
		public String imageComparison(WebDriver driver, String ExpectedImage_path, String actualImage_path)
				throws IOException {
			String image_res = null;
	
			try {
				BufferedImage img1 = ImageIO
						.read(new File("./Screenshots/Expected_screenshot" + ExpectedImage_path + ".png"));
				BufferedImage img2 = ImageIO.read(new File("./Screenshots/Actual_screenshot" + actualImage_path + ".png"));
	
				int w1 = img1.getWidth();
				int w2 = img2.getWidth();
				int h1 = img1.getHeight();
				int h2 = img2.getHeight();
				long diff = 0;
	
				if ((w1 != w2) || (h1 != h2)) {
					System.out.println("Both images should have the same dimensions");
				} else {
					for (int j = 0; j < h1; j++) {
						for (int i = 0; i < w1; i++) {
							int pixel1 = img1.getRGB(i, j);
							Color color1 = new Color(pixel1, true);
							int r1 = color1.getRed();
							int g1 = color1.getGreen();
							int b1 = color1.getBlue();
	
							int pixel2 = img2.getRGB(i, j);
							Color color2 = new Color(pixel2, true);
							int r2 = color2.getRed();
							int g2 = color2.getGreen();
							int b2 = color2.getBlue();
	
							long data = Math.abs(r1 - r2) + Math.abs(g1 - g2) + Math.abs(b1 - b2);
							diff = diff + data;
						}
					}
	
					String[] s = ExpectedImage_path.split("/");
					double avg = (double) diff / (w1 * h1 * 3);
					double percentage = (avg / 255) * 100;
					System.out.println("Difference: " + percentage);
	
					if (percentage < 0.4) {
						image_res = "Pass";
						add(driver, s[1] + " - " + s[2] + " - Image compared successfully", LogAs.PASSED, true,
								"");
						System.out.println(s[1] + " - " + s[2] + " - Image compared successfully");
					} else {
						add1(driver, s[1] + " - " + s[2] + " - Expected and Actual images are not the same", LogAs.FAILED,
								true, "");
						System.out.println(s[1] + " - " + s[2] + " - Expected and Actual images are not the same ");

					}
				}
			} catch (Exception e) {
				add1(driver, "unable to compare screenshot", LogAs.FAILED,
						true, "");
				e.printStackTrace(); // Log the exception stack trace
				return e.getMessage();
			}
			return image_res;
		}
	
		public void uploadfile(WebDriver driver, String path) {
			try {
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				WebElement element = driver.findElement(By.xpath("//input[@type='file']"));
				File file = new File(path);
				System.out.println(file.getAbsolutePath());
				element.sendKeys(file.getAbsolutePath());
				add(driver, "uploaded the file " + path, LogAs.PASSED, true, "");
				wait(driver, "2");
			} catch (Exception e) {
				add1(driver, "upload is falied - " + path + e, LogAs.FAILED, true, e.getLocalizedMessage());
				e.printStackTrace();
			
				Assert.fail();
			}
		}
	
		public void uploadfile1(WebDriver driver, String path) {
			try {
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				WebElement element = driver.findElement(By.xpath("//input[contains(@type,'file')]"));
				File file = new File(path);
				System.out.println(file.getAbsolutePath());
				element.sendKeys(file.getAbsolutePath());
				add(driver, "uploaded the file " + path, LogAs.PASSED, true, path);
				wait(driver, "2");
			} catch (Exception e) {
				add1(driver, "upload is falied - " + path + e, LogAs.FAILED, true, e.getLocalizedMessage());
				e.printStackTrace();
			
				Assert.fail();
			}
		}
	
		
		public void selectProject(WebDriver driver,String projectName) {
			
			try {
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				WebDriverWait wait =new WebDriverWait(driver,20);
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@role='gridcell']//following::span[contains(text(),'"+projectName+"')]")));
				WebElement element = driver.findElement(By.xpath("//td[@role='gridcell']//following::span[contains(text(),'"+projectName+"')]"));
				element.click();
			
			}catch(Exception e) {
				System.out.println("Unable to click the Project :"+projectName);
				Assert.fail();
			}
		}
		
		public void clickDatabaseCheckBox(WebDriver driver,String name) {
			//label[contains(text(),'Automationrequirement')]//preceding::mat-checkbox
			try {
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				List<WebElement> Elements=driver.findElements(By.xpath("//label[contains(text(),'"+name+"')]//preceding::mat-checkbox"));
				int elementSize=Elements.size();
				WebDriverWait wait =new WebDriverWait(driver,200);
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//label[contains(text(),'"+name+"')]//preceding::mat-checkbox)["+elementSize+"]")));
				WebElement element = driver.findElement(By.xpath("(//label[contains(text(),'"+name+"')]//preceding::mat-checkbox)["+elementSize+"]"));
				element.click();
			
			}catch(Exception e) {
				System.out.println("Unable to click the Dataset Checkbox :"+name);
				Assert.fail();
			}
		}
		
		public void LoadDataSet(WebDriver driver,String dataSetName) {
			try {
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				WebDriverWait wait =new WebDriverWait(driver,60);
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//label[contains(text(),'"+dataSetName+"')]//following::i[contains(@class,'upload')])[1]")));
				WebElement element = driver.findElement(By.xpath("(//label[contains(text(),'"+dataSetName+"')]//following::i[contains(@class,'upload')])[1]"));
				element.click();
			
			}catch(Exception e) {
				System.out.println("Unable to click the Dataset :"+dataSetName);
				Assert.fail();
			}
		}
			
		
		public void DownloadDataSet(WebDriver driver,String dataSetName) {
			try {
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				WebDriverWait wait =new WebDriverWait(driver,60);
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//label[contains(text(),'"+dataSetName+"')]//following::i[contains(@class,'download')])[1]")));
				WebElement element = driver.findElement(By.xpath("(//label[contains(text(),'"+dataSetName+"')]//following::i[contains(@class,'download')])[1]"));
				element.click();
			
			}catch(Exception e) {
				System.out.println("Unable to click the Dataset :"+dataSetName);
				Assert.fail();
			}
		}
		
		public String getTextBackgroundColor(WebDriver driver,String Xpath) {
			String[] values=splitXpath(Xpath);
			try {
				WebElement eleSearch = driver.findElement(By.xpath(values[1]));

				String rgbFormat = eleSearch.getCssValue("background-color");

//				System.out.println(rgbFormat);     //In RGB Format the value will be print => rgba(254, 189, 105, 1)

				String hexcolor = rgbToHex(rgbFormat);
//				System.out.println(hexcolor);
				
				return hexcolor;
			}catch(Exception e) {
				System.out.println("Unable to get color of the element..!");
				return "";
			}
			
			
		}
		
		public void WidgetValidation(WebDriver driver,String Xpath,String name) {
			String[] values=splitXpath(Xpath);
			String widgetName=values[0];
			if(widgetName.contains(" ")){
			  widgetName=widgetName.replace(" ", "_");
			}
			 if(verifyElementIsPresent1(driver,Xpath)) {
	        	
					try {
//						elementScreenShot_new(driver,Xpath,"/Expected_screenshot/SmokeTesting/"+widgetName);
						elementScreenShot_new(driver,Xpath,"/Actual_screenshot/SmokeTesting/"+widgetName);
						imageComparison(driver, "/SmokeTesting/"+widgetName, "/SmokeTesting/"+widgetName);
						wait(driver, "2");
					} catch (Exception e1) {
						add1(driver,"Unable to compare the Images for "+widgetName, LogAs.FAILED,true, ""); 
						//fail(driver,"Unable to compare the Images for "+widgetName);
					}
	        	 
	        	mouseOverToElement(driver,Xpath);
	        	if(isDisplayed(driver,WidgetText)) {
	        	   String widget_Act=getText1(driver,WidgetText);
	        	   add(driver,"Tooltip displays the name of the Widget : "+name, LogAs.PASSED,true, "");	
	       		  // passReport(driver,"Tooltip should display the name of the Widget " ,"Tooltip displays the name of the Widget");
	        	   if(name.equals(widget_Act)) {
	        		   add(driver,"Tooltip correctly displays the name of the Widget, Exp : "+name+" Act : "+widget_Act, LogAs.PASSED,true, "");	
	        	   }else {
		        		add1(driver,"Tooltip not correctly display the name of the Widget Exp : "+name+" Act : "+widget_Act, LogAs.FAILED,true, ""); 
	        	   }
	           	   //textValidation(driver,name,widget_Act,Xpath);
	        	}else {
	        		add1(driver,"Tooltip not display the name of the Widget : "+name, LogAs.FAILED,true, "");
	       			//failReport(driver,"Tooltip should display the name of the Widget ","Tooltip not display the name of the Widget");
	        		}
	            }
		}
		
		public String getTextColor(WebDriver driver,String Xpath) {
			String[] values=splitXpath(Xpath);
			try {
				WebElement eleSearch = driver.findElement(By.xpath(values[1]));
				String rgbFormat = eleSearch.getCssValue("color");
				String hexcolor = rgbToHex(rgbFormat);
				
				return hexcolor;
			}catch(Exception e) {
				System.out.println("Unable to get color of the element..!");
				return "";
			}
			
			
		}
		
//		public int getCssWidth(WebDriver driver,String Xpath) {
//			String[] values=splitXpath(Xpath);
//			try {
//				WebElement eleSearch = driver.findElement(By.xpath(values[1]));
//				String eleWidgth = eleSearch.getCssValue("width");
//				if(eleWidgth.contains("px")) {
//					eleWidgth=eleWidgth.substring(0,eleWidgth.indexOf('p'));
//				}
//				int width=Integer.parseInt(eleWidgth);
//				return width;
//			}catch(Exception e) {
//				System.out.println("Unable to get width of the element..!");
//				e.printStackTrace();
//				return 0;
//			}
//		}
		
		public double getCssWidth(WebDriver driver, String Xpath) {
		    String[] values = splitXpath(Xpath);
		    try {
		        WebElement eleSearch = driver.findElement(By.xpath(values[1]));
		        String eleWidth = eleSearch.getCssValue("width");
		        System.out.println("CSS eleWidth : "+eleWidth);
		        // Extract only the numeric part from the width string
		        String numericWidth = eleWidth.replaceAll("[^\\d.]", "");  // Remove non-numeric characters
		        double width = Double.parseDouble(numericWidth);
		        return width;
		    } catch (Exception e) {
		        System.out.println("Unable to get width of the element with XPath: " + values[1]);
		        e.printStackTrace();
		        return 0;
		    }
		}
		
		public static String rgbToHex(String rgb) {
	        String[] rgbValues = rgb.replace("rgba(", "").replace(")", "").split(", ");
	        int red = Integer.parseInt(rgbValues[0]);
	        int green = Integer.parseInt(rgbValues[1]);
	        int blue = Integer.parseInt(rgbValues[2]);

	        return String.format("#%02X%02X%02X", red, green, blue);
	    }
		
		public static String rgbToHex1(String rgb) {
			 try {
		            // Extract the numeric values from the rgb string
		            String[] parts = rgb.replace("rgb(", "").replace(")", "").split(",");
		            int r = Integer.parseInt(parts[0].trim());
		            int g = Integer.parseInt(parts[1].trim());
		            int b = Integer.parseInt(parts[2].trim());

		            // Convert each component to hexadecimal and ensure it's two characters long
		            String hexR = String.format("%02x", r);
		            String hexG = String.format("%02x", g);
		            String hexB = String.format("%02x", b);

		            // Combine the hex components into a single hex color code
		            return "#" + hexR + hexG + hexB;
		        } catch (Exception e) {
		            System.out.println("Error converting RGB to Hex: " + e.getMessage());
		            return "";
		        }
	    }

		public static String convertHexToRGB(String hex) {
	        if (hex.startsWith("rgba")) {
	            return hex; // Already in RGBA format
	        }
	        if (hex.startsWith("rgb")) {
	            return hex; // Already in RGB format
	        }

	        // Strip the '#' symbol if present
	        hex = hex.replace("#", "");

	        // Parse the R, G, and B components
	        int r = Integer.parseInt(hex.substring(0, 2), 16);
	        int g = Integer.parseInt(hex.substring(2, 4), 16);
	        int b = Integer.parseInt(hex.substring(4, 6), 16);

	        return "rgb(" + r + ", " + g + ", " + b + ")";
	    }
		
		public String RGB(String value) {
			
	        String pattern = "rgb\\(\\d{1,3}, \\d{1,3}, \\d{1,3}\\)";

	        Pattern r = Pattern.compile(pattern);
	        Matcher m = r.matcher(value);

	        if (m.find()) {
	            System.out.println(m.group(0));
	            return m.group(0);
	        } else {
	            System.out.println("No match found");
	            return null;
	        }
	        
	        
		}
		
		public static boolean evaluateConditions(boolean cond1, String operator1, boolean cond2, String operator2, boolean cond3) {
		        boolean result1 = applyOperator(cond1, operator1, cond2);
		        return applyOperator(result1, operator2, cond3);
		}
		
		public static boolean applyOperator(boolean cond1, String operator, boolean cond2) {
	        switch (operator) {
	            case "AND":
	                return cond1 && cond2;
	            case "OR":
	                return cond1 || cond2;
	            default:
	                throw new IllegalArgumentException("Invalid operator: " + operator);
	        }
	    }
		
		public boolean Categorical_ConditionFiltercell(String ConditionSelected,String cellText,String InputText){
		    boolean isValid=false;
//		    System.out.println("ConditionSelected : "+ConditionSelected);
			switch (ConditionSelected) {
					case "contains":
						isValid = cellText.contains(InputText);
						break;
					case "does not contain":
						isValid = !cellText.contains(InputText);
						break;
					case "begins with":
						isValid = cellText.startsWith(InputText);
						break;
					case "does not begin with":
						isValid = !cellText.startsWith(InputText);
						break;
					case "ends with":
						isValid = cellText.endsWith(InputText);
						break;
					case "does not end with":
						isValid = !cellText.endsWith(InputText);
						break;
					case "equal to":
						isValid = cellText.equals(InputText);
						break;
					case "not equal to":
						  //System.out.println("*********cellText "+cellText+" InputText : "+InputText);
						isValid = !cellText.equals(InputText);
						 // System.out.println("*********isValid : "+isValid);
						break;
			}
			
			return isValid;
		
		}
		
		public boolean Date_RelativeFiltercell(String ConditionSelected,String cellText,String InputText){
		    
		    
		    try {
		    	boolean isValid=false;
			    int nValue=0;
			    if(!InputText.isEmpty()) {
			    	nValue=Integer.parseInt(InputText);
			    }
			    //System.out.println("Num Value : "+nValue);
			    if (!cellText.equals("NaT") || !cellText.contains("Blank")) { 
			    	// System.out.println(" Execution entered condition check ...... : "+ConditionSelected);
			    	DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			    	cellText = reformatDate(cellText);
//			    	System.out.println("After reformat the text1 : "+cellText);
	                LocalDate cellDate = LocalDate.parse(cellText, dateFormatter);
	                
					switch (ConditionSelected) {
						case "Today":
			                isValid = cellDate.equals(LocalDate.now());
			                break;
			            case "Yesterday":
			                isValid = cellDate.equals(LocalDate.now().minusDays(1));
			                break;
			            case "Last 7 days":
			                isValid = cellDate.isAfter(LocalDate.now().minusDays(7)) && cellDate.isBefore(LocalDate.now().plusDays(1));
			                break;
			            case "This Week":
			                isValid = isSameWeek(cellDate, LocalDate.now());
			                break;
			            case "Last Week":
			                isValid = isSameWeek(cellDate, LocalDate.now().minusWeeks(1));
			                break;
			            case "This Month":
			                isValid = isSameMonth(cellDate, LocalDate.now());
			                break;
			            case "Last Month":
			                isValid = isSameMonth(cellDate, LocalDate.now().minusMonths(1));
			                break;
			            case "Last 6 Months":
			                isValid = cellDate.isAfter(LocalDate.now().minusMonths(6)) && cellDate.isBefore(LocalDate.now().plusDays(1));
			                break;
			            case "This Year":
			                isValid = isSameYear(cellDate, LocalDate.now());
			                break;
			            case "Last Year":
			                isValid = isSameYear(cellDate, LocalDate.now().minusYears(1));
			                break;
			            case "Last N Days":
			            	//System.out.println("Last N Days validation checked");
			                isValid = cellDate.isAfter(LocalDate.now().minusDays(nValue+1)) && cellDate.isBefore(LocalDate.now().plusDays(1));
			                break;
			            case "Last N Weeks":
			            	//System.out.println("Last N Weeks validation checked");
			                isValid = cellDate.isAfter(LocalDate.now().minusWeeks(nValue)) && cellDate.isBefore(LocalDate.now().plusDays(1));
			                break;
			            case "Last N Months":
			            	//System.out.println("Last N Months validation checked");
			                isValid = cellDate.isAfter(LocalDate.now().minusMonths(nValue)) && cellDate.isBefore(LocalDate.now().plusDays(1));
			                break;
			            case "Last N Years":
			            	//System.out.println("Last N Years validation checked");
			                isValid = cellDate.isAfter(LocalDate.now().minusYears(nValue)) && cellDate.isBefore(LocalDate.now().plusDays(1));
			                break;
				   }
				
					
			    }else {
			    	return false;
			    }
			    
				return isValid;
			
		    }catch(Exception e) {
		    	System.out.println("Unable to validate the filter for the value : "+cellText);
		    	e.printStackTrace();
		    	return false;
		    	
		    }
			
		
		}
		
		
		
		private static boolean isSameWeek(LocalDate date1, LocalDate date2) {
	        return date1.get(ChronoField.ALIGNED_WEEK_OF_YEAR) == date2.get(ChronoField.ALIGNED_WEEK_OF_YEAR) &&
	                date1.getYear() == date2.getYear();
	    }

	    private static boolean isSameMonth(LocalDate date1, LocalDate date2) {
	        return date1.getMonth() == date2.getMonth() && date1.getYear() == date2.getYear();
	    }

	    private static boolean isSameYear(LocalDate date1, LocalDate date2) {
	        return date1.getYear() == date2.getYear();
	    }
		
		public boolean Date_ConditionFiltercell(String ConditionSelected,String cellText,String inputText1,String inputText2) throws ParseException{
		    boolean isValid=false;
		    try {
	            if(!ConditionSelected.equals("is null") && !cellText.contains("Blank")) {
	            	if(!cellText.equals("NaT")) {
	            		cellText = reformatDate(cellText);
		            	
		            	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); 
		                Date cellDate = dateFormat.parse(cellText);
		                Date compareDate1 = dateFormat.parse(inputText1);
		                Date compareDate2 = dateFormat.parse(inputText2);
				    	
				    	//System.out.println("After reformat the text1 : "+cellText);
//		                LocalDate cellDate = LocalDate.parse(cellText, dateFormatter);
		                
		                switch (ConditionSelected) {
			                case "equal to":
			                    isValid = cellDate.equals(compareDate1);
			                    break;
			                case "not equal to":
			                    isValid = !cellDate.equals(compareDate1);
			                    break;
			                case "is greater than":
			                    isValid = cellDate.after(compareDate1);
			                    break;
			                case "is less than":
			                    isValid = cellDate.before(compareDate1);
			                    break;
			                case "is greater than or equal to":
			                    isValid = !cellDate.before(compareDate1);
			                    break;
			                case "is less than or equal to":
			                    isValid = !cellDate.after(compareDate1);
			                    break;
			                case "is not null":
			                    isValid = cellText != null && !cellText.isEmpty();
			                    break;
			                case "between":
			                	if(compareDate1.before(compareDate2)) {
			                		isValid = (cellDate.equals(compareDate1) || cellDate.after(compareDate1)) && (cellDate.equals(compareDate2) || cellDate.before(compareDate2));
				                    break;
			                	}else {
			                		isValid = (cellDate.equals(compareDate2) || cellDate.after(compareDate2)) && (cellDate.equals(compareDate1) || cellDate.before(compareDate1));
				                    break;
			                	}
			                    
		                }
		                
	            	}else {
	            		return false;
	            	}
	            	
				}else {
					if(cellText.equals("NaT") || cellText==null) {
						return true;
					}else {
						return false;
					}
				}
	            
				return isValid;
			
			}catch(Exception e) {
		    	System.out.println("Unable to validate the filter for the value : "+cellText);
//		    	e.printStackTrace();
		    	return false;
		    	
		    }
		
		}
		
		public boolean Numerical_ConditionFiltercell(String ConditionSelected,String cellText,String inputText1,String inputText2) throws ParseException{
		    boolean isValid=false;
		    
		    try {
		    	Pattern numericalPattern = Pattern.compile("^-?\\d+(\\.\\d+)?$");
		    	
	            if(numericalPattern.matcher(cellText).matches() && !ConditionSelected.equals("is null")) {
	            	//System.out.println(" Num validation entered");
	            		double cellNumvalue=Double.parseDouble(cellText);//Integer.parseInt(cellText);//11 11
	            		int decimalPlaces=getRoundOffValue(cellText);
	            		
	            		//System.out.println("cellNumvalue after double : "+cellNumvalue);
	            		double inputNum1=Double.parseDouble(inputText1);//Integer.parseInt(inputText1);//10  15
	            		//System.out.println("inputNum1 after double : "+inputNum1);
	            		
	                    BigDecimal bd = BigDecimal.valueOf(inputNum1); 
	                    bd = bd.setScale(decimalPlaces, RoundingMode.HALF_UP); //need to check.
	                    inputNum1 = bd.doubleValue();
	            		
	                    //System.out.println("After converting the decimal : "+inputNum1);
	            		double inputNum2=Double.parseDouble(inputText2);//Integer.parseInt(inputText2);//15  10
	            		
		                switch (ConditionSelected) {
			                case "equal to":
			                    isValid = cellNumvalue==inputNum1;
			                    break;
			                case "not equal to":
			                    isValid = cellNumvalue!=inputNum1;
			                    break;
			                case "is greater than":
			                    isValid = cellNumvalue>inputNum1;
			                    break;
			                case "is less than":
			                    isValid = cellNumvalue<inputNum1;
			                    break;
			                case "is greater than or equal to":
			                    isValid = cellNumvalue>=inputNum1;
			                    break;
			                case "is less than or equal to":
			                    isValid = cellNumvalue<=inputNum1;
			                    break;
			                case "is not null":
			                    isValid = cellText != null && !cellText.isEmpty();
			                    break;
			                case "between":
			                	if(inputNum1<inputNum2) {
			                		isValid = inputNum1<=cellNumvalue && cellNumvalue<=inputNum2;
				                    break;
			                	}else {
			                		isValid = inputNum1>=cellNumvalue && cellNumvalue>=inputNum2;
				                    break;
			                	}
		                }
		                
				}else {
					//System.out.println(" Num validation not  entered properly ");
					if(cellText.equals("NaT") || cellText==null) {
						return true;
					}else {
						return false;
					}
				}
	            
				return isValid;
			
			}catch(Exception e) {
		    	System.out.println("Unable to validate the filter for the value : "+cellText);
		    	e.printStackTrace();
		    	return false;
		    	
		    }
		
		}
		
		public void passReport(WebDriver driver, String Exptext,String Acttext) {
			add(driver, "Expected : "+Exptext+ " <--->  Actual  : "+Acttext, LogAs.PASSED,true, "Passed");
			
		}
		
		
        public void failReport(WebDriver driver, String Exptext,String Acttext) {
			add1(driver, "Expected : "+Exptext+" <---> Actual  : "+Acttext, LogAs.FAILED,true, "Failed");

		}
        
        public void pass(WebDriver driver, String value) {
			add(driver,value, LogAs.PASSED,true, "");	
		}
		
		public void fail(WebDriver driver, String value) {
			add1(driver,value, LogAs.FAILED,true, "");
		}
		
        public void textValidation(WebDriver driver,String Exptext,String Acttext,String Xpath) {
        	String[] values=splitXpath(Xpath);
        	if(Exptext.equals(Acttext)) {
        		add(driver, "Validation Passed , Expected Text : "+Exptext+" <---> Actual Text : "+Acttext, LogAs.PASSED,true, values[0]);
        	}else {
    			add1(driver, "Validation Failed , Expected Text : "+Exptext+" <---> Actual Text : "+Acttext, LogAs.FAILED,true, values[0]);
        	}
        	
        }
        
        public void colorValidation(WebDriver driver,String ExpColor,String ActColor,String Xpath) {
        	String[] values=splitXpath(Xpath);
        	if(ExpColor.equalsIgnoreCase(ActColor)) {
        		add(driver, "Color Validation Passed , Expected Color : "+ExpColor+"  Actual Color : "+ActColor, LogAs.PASSED,true, values[0]);
        	}else {
    			add1(driver, "Color Validation Failed , Expected Color : "+ExpColor+" Actual Color : "+ActColor, LogAs.FAILED,true, values[0]);
        	}
        	
        }
        
        
        public String[] getPositionOfElement(WebDriver driver,String Xpath) {
        	String[] values=splitXpath(Xpath);
        	String [] position=new String[2];
        	try {
        	WebElement element = driver.findElement(By.xpath(values[1]));
            Point location = element.getLocation();
            String X=String.valueOf(location.getX());
            String Y=String.valueOf(location.getY());
            position[0]=X;
            position[1]=Y;
            System.out.println("Element is located at X: " + location.getX() + ", Y: " + location.getY());
            return position;
        	}catch(Exception e) {
                System.out.println("Unable to get location..");
                 return null;
        	}
        }
        
        
        
        public int getNumber(String text) {
        	int number=0;
        	if(text.contains("(")) {
        		int startIndex = text.indexOf('(') + 1;
                int endIndex = text.indexOf(')');
                String numberString = text.substring(startIndex, endIndex);
                 number = Integer.parseInt(numberString);
                
        	}
             return number;
        }
        
        
        public String getStringValue(String text) {
        	
        	String Value=text;
        	try {
        		if(Value.contains("(")) {
            		int bracketIndex = Value.indexOf('(');
            		Value = text.substring(0, bracketIndex);
            	}
        	}catch(Exception e) {
        		
        	}
        	
            return Value.trim();
        }
        
        public double barValue(WebDriver driver, String value) {
        	wait(driver,"1");						            // (//*[name()='tspan' and contains(text(),'breakfast')])[2]
        	WebElement element=driver.findElement(By.xpath("(//*[name()='tspan' and contains(text(),'"+value+"')])[2]"));
        	String textvalue=element.getText();
        	double numberValue=getNumberFromChart1(textvalue);
        	return numberValue;
        	
        }
        
        public String reverseString(String value) {
            StringBuilder reverse = new StringBuilder();
            for (int i = value.length() - 1; i >= 0; i--) {
                reverse.append(value.charAt(i));
            }
            return reverse.toString();
        }
        
        public String reformatDate(String date) {
            
            DateTimeFormatter originalFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate localDate = LocalDate.parse(date, originalFormatter);
            DateTimeFormatter newFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            return localDate.format(newFormatter);
        }
        
        
        public int barValueDate(WebDriver driver, String value) {
            // (//*[name()='tspan' and contains(text(),'breakfast')])[2]
		WebElement element=driver.findElement(By.xpath("(//*[name()='tspan' and contains(text(),'"+value+"')])[2]"));
		String textvalue=element.getText();
//		String numberString=textvalue.replace("-", "").trim();
//		int numberValue=Integer.parseInt(numberString);
	
		String datePattern = "Date: (\\d{4}-\\d{2}-\\d{2})";
        Pattern pattern = Pattern.compile(datePattern);
        Matcher matcher = pattern.matcher(textvalue);
        int numericDate=0;
        if (matcher.find()) {
            String dateString = matcher.group(1);
            String numericDateString = dateString.replace("-", "");
             numericDate = Integer.parseInt(numericDateString);
        }
		return numericDate;
		
		}
        
        public String defaultSelectedValue(WebDriver driver,String Xpath) {
        	
       	    String[] values=splitXpath(Xpath);
       	    try {
       	   
	        	WebElement show=driver.findElement(By.xpath(values[1]));
	            Select select = new Select(show);
	            WebElement selectedOption = select.getFirstSelectedOption();
	            String selectedOptionText = selectedOption.getText();
	            return selectedOptionText;
            
       	    }catch(Exception e) {
       	    	return "";
       	    }
        }
        
    
        public int getNumberFromChart(String value) {
        	Pattern pattern = Pattern.compile("[0-9,]+");
            Matcher matcher = pattern.matcher(value);
            if (matcher.find()) {
                String numberString = matcher.group();
                if(numberString.contains(",")) {
                	numberString = numberString.replace(",", "");
                }
                
                String numberWithoutspace=numberString.trim();
                int number=Integer.parseInt(numberWithoutspace);
                return number;
            } else {
               return 0;
            }
        }
        
        
//        public static double getNumberFromChart1(String value) {
//            Pattern pattern = Pattern.compile("[+-]?\\d+(,\\d{3})*(\\.\\d+)?");
//            String[] actValue=value.split(": ");
//            Matcher matcher = pattern.matcher(actValue[1]);
//
//            if (matcher.find()) {
//                String numberString = matcher.group();
//                if(numberString.contains(",")) {
//                	numberString = numberString.replace(",", "");
//                }
//                
//            return Double.parseDouble(numberString);
//                
//            } else {
//                System.out.println("No number found in the input string.");
//                return 0.001; // or return 0 or another default value
//            }
//        }
        
        public static double getNumberFromChart1(String value) {
            // Use a regex pattern to match various types of numbers after the colon
            Pattern pattern = Pattern.compile(":\\s?([+-]?\\d+(?:\\.\\d+)?(?:,\\d{3})*(?:-\\d{2}-\\d{2})?)");
            Matcher matcher = pattern.matcher(value);

            if (matcher.find()) {
                // Extract the matched number string
                String numberString = matcher.group(1);
                // Remove commas and hyphens from the number string, if present
                numberString = numberString.replaceAll("[,-]", "");
                // Convert the number string to a double value
                return Double.parseDouble(numberString);
            } else {
                System.out.println("No number found in the input string.");
                return 0.001; // or return 0 or another default value
            }
        }

        
        public void graphOrderValidation(WebDriver driver,List<WebElement> charts,String QuickSortByText) {
        
            int firstElement=(charts.size())-1;
            int secondElement=(charts.size())-2;

            mouseOverToElement(driver, DashProPage);
            Actions act=new Actions(driver);
            WebElement firstbar=charts.get(firstElement);
            act.moveToElement(firstbar).build().perform();
          
            WebElement element_1=driver.findElement(By.xpath("(//*[name()='tspan' and contains(text(),'"+QuickSortByText+"') and contains(text(),':')])"));
        	String textvalue_1=element_1.getText();
            System.out.println("First : "+textvalue_1);

            WebElement secondbar=charts.get(secondElement);
            act.moveToElement(secondbar).build().perform();
//            double secondValue=barValue(driver,QuickSortByText);
//            System.out.println("Second : "+secondValue);
            
            WebElement element_2=driver.findElement(By.xpath("(//*[name()='tspan' and contains(text(),'"+QuickSortByText+"') and contains(text(),':')])"));
        	String textvalue_2=element_2.getText();
        	System.out.println("Second : "+textvalue_2);
           
        	String[] parts1 = textvalue_1.split(": ");
        	String[] parts2 = textvalue_2.split(": ");
        	boolean nextText=(parts1[1].trim().equals(parts2[1].trim()));
        	if(nextText) {
        		secondElement=secondElement-1;
        		while(secondElement>0) {
        			secondbar=charts.get(secondElement);
        	        act.moveToElement(secondbar).build().perform();
        	        element_2=driver.findElement(By.xpath("(//*[name()='tspan' and contains(text(),'"+QuickSortByText+"') and contains(text(),':')])"));
        	    	textvalue_2=element_2.getText();
        	    	parts2=textvalue_2.split(": ");
        	    	if(!(parts1[1].trim().equals(parts2[1].trim()))) {
        	    		break;
        	    	}
        	        secondElement--;
            	}
        	}
        	

            double num_1=getNumberFromChart1(textvalue_1);
            String text_1="";
            if(num_1==0.001) {
            	text_1=parts1[1].trim();
            }
            
            double num_2=getNumberFromChart1(textvalue_2);
            String text_2="";
            if(num_2==0.001) {
            	text_2=parts2[1].trim();
            }
            
            if((num_1==0.001)&&(num_2==0.001)) {
            	String str1Lower = text_1.toLowerCase();
                String str2Lower = text_2.toLowerCase();
                
                int comparisonResult = str1Lower.compareTo(str2Lower);
                System.out.println("text_1 : "+text_1);
             	System.out.println("text_2 : "+text_2);
                
                String sortValue=getAttribute1(driver,AscDes,"value");
                if(sortValue.equals("desc")) {
                	if(comparisonResult < 0) {
                		add(driver, "Expected : Charts Should display in "+QuickSortByText+" Ascending order, for Ascending selection <--->  Actual  : Charts Displayed in "+QuickSortByText+" Ascending order, for Ascending selection" , LogAs.PASSED,true, "Passed");
            			//passReport(driver,"Charts Should display in "+QuickSortByText+" Ascending order, for Ascending selection  ","Charts Displayed in "+QuickSortByText+" Ascending order, for Ascending selection ");
                	}else {
            			add1(driver, "Expected : Charts Should display in "+QuickSortByText+" Ascending order, for Ascending selection   <---> Actual  : Charts displayed in "+QuickSortByText+" Descending order, for Ascending selection ", LogAs.FAILED,true, "Failed");
                 	  //  failReport(driver,"Charts Should display in "+QuickSortByText+" Ascending order, for Ascending selection   ","Charts displayed in "+QuickSortByText+" Descending order, for Ascending selection ");
                	}	
                }else {
                	if(comparisonResult > 0) {
                		add(driver, "Expected : Charts Should display in "+QuickSortByText+" Descending order, for Descending selection <--->  Actual  : Charts Displayed in "+QuickSortByText+" Descending order, for Descending selection" , LogAs.PASSED,true, "Passed");
            			//passReport(driver,"Charts Should display in "+QuickSortByText+" Descending order, for Descending selection  ","Charts Displayed in "+QuickSortByText+" Descending order, for Descending selection ");
                	}else {
            			add1(driver, "Expected : Charts Should display in "+QuickSortByText+" Descending order, for Descending selection   <---> Actual  : Charts displayed in "+QuickSortByText+" Ascending order, for Descending selection ", LogAs.FAILED,true, "Failed");
                 	    //failReport(driver,"Charts Should display in "+QuickSortByText+" Descending order, for Descending selection   ","Charts displayed in "+QuickSortByText+" Ascending order, for Descending selection ");
                	}
                }
                
                if (comparisonResult < 0) {
                    System.out.println(text_1 + " comes before " + text_2 + " alphabetically.");
                } else if (comparisonResult > 0) {
                    System.out.println(text_2 + " comes before " + text_1 + " alphabetically.");
                } else {
                    System.out.println(text_1 + " and " + text_2 + " are equal alphabetically.");
                }
            }else if(!(num_1==0.001)&&!(num_2==0.001)) {
            	
            	String sortValue=getAttribute1(driver,AscDes,"value");
            	System.out.println("num_1 : "+num_1);
                System.out.println("num_2 : "+num_2);
                
                if(sortValue.equals("desc")) {
                	if(num_2>num_1) {
                		add(driver, "Expected : Charts Should display in "+QuickSortByText+" Ascending order, for Ascending selection <--->  Actual  : Charts Displayed in "+QuickSortByText+" Ascending order, for Ascending selection" , LogAs.PASSED,true, "Passed");
            			//passReport(driver,"Charts Should display in "+QuickSortByText+" Ascending order, for Ascending selection  ","Charts Displayed in "+QuickSortByText+" Ascending order, for Ascending selection ");
                	}else {
            			add1(driver, "Expected : Charts Should display in "+QuickSortByText+" Ascending order, for Ascending selection   <---> Actual  : Charts displayed in "+QuickSortByText+" Descending order, for Ascending selection ", LogAs.FAILED,true, "Failed");
                 	   // failReport(driver,"Charts Should display in "+QuickSortByText+" Ascending order, for Ascending selection   ","Charts displayed in "+QuickSortByText+" Descending order, for Ascending selection ");
                	}	
                }else {
                	if(num_1>num_2) {
                		add(driver, "Expected : Charts Should display in "+QuickSortByText+" Descending order, for Descending selection <--->  Actual  : Charts Displayed in "+QuickSortByText+" Descending order, for Descending selection" , LogAs.PASSED,true, "Passed");
            		//	passReport(driver,"Charts Should display in "+QuickSortByText+" Descending order, for Descending selection  ","Charts Displayed in "+QuickSortByText+" Descending order, for Descending selection ");
                	}else {
            			add1(driver, "Expected : Charts Should display in "+QuickSortByText+" Descending order, for Descending selection   <---> Actual  : Charts displayed in "+QuickSortByText+" Ascending order, for Descending selection ", LogAs.FAILED,true, "Failed");
                 	    failReport(driver,"Charts Should display in "+QuickSortByText+" Descending order, for Descending selection   ","Charts displayed in "+QuickSortByText+" Ascending order, for Descending selection ");
                	}
                }
            	
            }else {
            	String sortValue=getAttribute1(driver,AscDes,"value");
                if(sortValue.equals("desc")) {
                	if(!(num_1==0.001)&&(num_2==0.001)) {
                		add(driver, "Expected : Charts Should display in "+QuickSortByText+" Ascending order, for Ascending selection <--->  Actual  : Charts Displayed in "+QuickSortByText+" Ascending order, for Ascending selection" , LogAs.PASSED,true, "Passed");
            			//passReport(driver,"Charts Should display in "+QuickSortByText+" Ascending order, for Ascending selection  ","Charts Displayed in "+QuickSortByText+" Ascending order, for Ascending selection ");
                	}else {
            			add1(driver, "Expected : Charts Should display in "+QuickSortByText+" Ascending order, for Ascending selection   <---> Actual  : Charts displayed in "+QuickSortByText+" Descending order, for Ascending selection ", LogAs.FAILED,true, "Failed");
                 	    //failReport(driver,"Charts Should display in "+QuickSortByText+" Ascending order, for Ascending selection   ","Charts displayed in "+QuickSortByText+" Descending order, for Ascending selection ");
                	}	
                }else {
                	if(!(num_2==0.001)&&(num_1==0.001)) {
                		add(driver, "Expected : Charts Should display in "+QuickSortByText+" Descending order, for Descending selection <--->  Actual  : Charts Displayed in "+QuickSortByText+" Descending order, for Descending selection" , LogAs.PASSED,true, "Passed");
            		//	passReport(driver,"Charts Should display in "+QuickSortByText+" Descending order, for Descending selection  ","Charts Displayed in "+QuickSortByText+" Descending order, for Descending selection ");
                	}else {
            			add1(driver, "Expected : Charts Should display in "+QuickSortByText+" Descending order, for Descending selection   <---> Actual  : Charts displayed in "+QuickSortByText+" Ascending order, for Descending selection ", LogAs.FAILED,true, "Failed");
                 	    //failReport(driver,"Charts Should display in "+QuickSortByText+" Descending order, for Descending selection   ","Charts displayed in "+QuickSortByText+" Ascending order, for Descending selection ");
                	}
                	
                }
            }
            
        }
        
        public void graphOrderValidation2(WebDriver driver,List<WebElement> charts,String QuickSortByText) {
            
            int firstElement=(charts.size())-1;
            int secondElement=1;

            mouseOverToElement(driver, DashProPage);
            Actions act=new Actions(driver);
            WebElement firstbar=charts.get(0);
            act.moveToElement(firstbar).build().perform();
          
            WebElement element_1=driver.findElement(By.xpath("(//*[name()='tspan' and contains(text(),'"+QuickSortByText+"') and contains(text(),':')])"));
        	String textvalue_1=element_1.getText();
            System.out.println("First : "+textvalue_1);

            WebElement secondbar=charts.get(secondElement);
            act.moveToElement(secondbar).build().perform();
//            double secondValue=barValue(driver,QuickSortByText);
//            System.out.println("Second : "+secondValue);
            
            WebElement element_2=driver.findElement(By.xpath("(//*[name()='tspan' and contains(text(),'"+QuickSortByText+"') and contains(text(),':')])"));
        	String textvalue_2=element_2.getText();
        	System.out.println("Second : "+textvalue_2);
           
        	String[] parts1 = textvalue_1.split(": ");
        	String[] parts2 = textvalue_2.split(": ");
        	boolean nextText=(parts1[1].trim().equals(parts2[1].trim()));
        	if(nextText) {
        		secondElement=secondElement+1;
        		while(secondElement<charts.size()) {
        			secondbar=charts.get(secondElement);
        	        act.moveToElement(secondbar).build().perform();
        	        element_2=driver.findElement(By.xpath("(//*[name()='tspan' and contains(text(),'"+QuickSortByText+"') and contains(text(),':')])"));
        	    	textvalue_2=element_2.getText();
        	    	parts2=textvalue_2.split(": ");
        	    	if(!(parts1[1].trim().equals(parts2[1].trim()))) {
        	    		break;
        	    	}
        	        secondElement--;
            	}
        	}
        	

            double num_1=getNumberFromChart1(textvalue_1);
            String text_1="";
            if(num_1==0.001) {
            	text_1=parts1[1].trim();
            }
            
            double num_2=getNumberFromChart1(textvalue_2);
            String text_2="";
            if(num_2==0.001) {
            	text_2=parts2[1].trim();
            }
            
            if((num_1==0.001)&&(num_2==0.001)) {
            	String str1Lower = text_1.toLowerCase();
                String str2Lower = text_2.toLowerCase();
                
                int comparisonResult = str1Lower.compareTo(str2Lower);
                System.out.println("text_1 : "+text_1);
             	System.out.println("text_2 : "+text_2);
                
                String sortValue=getAttribute1(driver,AscDes,"value");
                if(sortValue.equals("desc")) {
                	if(comparisonResult < 0) {
                		add(driver, "Expected : Charts Should display in "+QuickSortByText+" Ascending order, for Ascending selection <--->  Actual  : Charts Displayed in "+QuickSortByText+" Ascending order, for Ascending selection" , LogAs.PASSED,true, "Passed");
            			//passReport(driver,"Charts Should display in "+QuickSortByText+" Ascending order, for Ascending selection  ","Charts Displayed in "+QuickSortByText+" Ascending order, for Ascending selection ");
                	}else {
            			add1(driver, "Expected : Charts Should display in "+QuickSortByText+" Ascending order, for Ascending selection   <---> Actual  : Charts displayed in "+QuickSortByText+" Descending order, for Ascending selection ", LogAs.FAILED,true, "Failed");
                 	  //  failReport(driver,"Charts Should display in "+QuickSortByText+" Ascending order, for Ascending selection   ","Charts displayed in "+QuickSortByText+" Descending order, for Ascending selection ");
                	}	
                }else {
                	if(comparisonResult > 0) {
                		add(driver, "Expected : Charts Should display in "+QuickSortByText+" Descending order, for Descending selection <--->  Actual  : Charts Displayed in "+QuickSortByText+" Descending order, for Descending selection" , LogAs.PASSED,true, "Passed");
            			//passReport(driver,"Charts Should display in "+QuickSortByText+" Descending order, for Descending selection  ","Charts Displayed in "+QuickSortByText+" Descending order, for Descending selection ");
                	}else {
            			add1(driver, "Expected : Charts Should display in "+QuickSortByText+" Descending order, for Descending selection   <---> Actual  : Charts displayed in "+QuickSortByText+" Ascending order, for Descending selection ", LogAs.FAILED,true, "Failed");
                 	    //failReport(driver,"Charts Should display in "+QuickSortByText+" Descending order, for Descending selection   ","Charts displayed in "+QuickSortByText+" Ascending order, for Descending selection ");
                	}
                }
                
                if (comparisonResult < 0) {
                    System.out.println(text_1 + " comes before " + text_2 + " alphabetically.");
                } else if (comparisonResult > 0) {
                    System.out.println(text_2 + " comes before " + text_1 + " alphabetically.");
                } else {
                    System.out.println(text_1 + " and " + text_2 + " are equal alphabetically.");
                }
            }else if(!(num_1==0.001)&&!(num_2==0.001)) {
            	
            	String sortValue=getAttribute1(driver,AscDes,"value");
            	System.out.println("num_1 : "+num_1);
                System.out.println("num_2 : "+num_2);
                
                if(sortValue.equals("desc")) {
                	if(num_2>num_1) {
                		add(driver, "Expected : Charts Should display in "+QuickSortByText+" Ascending order, for Ascending selection <--->  Actual  : Charts Displayed in "+QuickSortByText+" Ascending order, for Ascending selection" , LogAs.PASSED,true, "Passed");
            			//passReport(driver,"Charts Should display in "+QuickSortByText+" Ascending order, for Ascending selection  ","Charts Displayed in "+QuickSortByText+" Ascending order, for Ascending selection ");
                	}else {
            			add1(driver, "Expected : Charts Should display in "+QuickSortByText+" Ascending order, for Ascending selection   <---> Actual  : Charts displayed in "+QuickSortByText+" Descending order, for Ascending selection ", LogAs.FAILED,true, "Failed");
                 	   // failReport(driver,"Charts Should display in "+QuickSortByText+" Ascending order, for Ascending selection   ","Charts displayed in "+QuickSortByText+" Descending order, for Ascending selection ");
                	}	
                }else {
                	if(num_1>num_2) {
                		add(driver, "Expected : Charts Should display in "+QuickSortByText+" Descending order, for Descending selection <--->  Actual  : Charts Displayed in "+QuickSortByText+" Descending order, for Descending selection" , LogAs.PASSED,true, "Passed");
            		//	passReport(driver,"Charts Should display in "+QuickSortByText+" Descending order, for Descending selection  ","Charts Displayed in "+QuickSortByText+" Descending order, for Descending selection ");
                	}else {
            			add1(driver, "Expected : Charts Should display in "+QuickSortByText+" Descending order, for Descending selection   <---> Actual  : Charts displayed in "+QuickSortByText+" Ascending order, for Descending selection ", LogAs.FAILED,true, "Failed");
                 	    failReport(driver,"Charts Should display in "+QuickSortByText+" Descending order, for Descending selection   ","Charts displayed in "+QuickSortByText+" Ascending order, for Descending selection ");
                	}
                }
            	
            }else {
            	String sortValue=getAttribute1(driver,AscDes,"value");
                if(sortValue.equals("desc")) {
                	if(!(num_1==0.001)&&(num_2==0.001)) {
                		add(driver, "Expected : Charts Should display in "+QuickSortByText+" Ascending order, for Ascending selection <--->  Actual  : Charts Displayed in "+QuickSortByText+" Ascending order, for Ascending selection" , LogAs.PASSED,true, "Passed");
            			//passReport(driver,"Charts Should display in "+QuickSortByText+" Ascending order, for Ascending selection  ","Charts Displayed in "+QuickSortByText+" Ascending order, for Ascending selection ");
                	}else {
            			add1(driver, "Expected : Charts Should display in "+QuickSortByText+" Ascending order, for Ascending selection   <---> Actual  : Charts displayed in "+QuickSortByText+" Descending order, for Ascending selection ", LogAs.FAILED,true, "Failed");
                 	    //failReport(driver,"Charts Should display in "+QuickSortByText+" Ascending order, for Ascending selection   ","Charts displayed in "+QuickSortByText+" Descending order, for Ascending selection ");
                	}	
                }else {
                	if(!(num_2==0.001)&&(num_1==0.001)) {
                		add(driver, "Expected : Charts Should display in "+QuickSortByText+" Descending order, for Descending selection <--->  Actual  : Charts Displayed in "+QuickSortByText+" Descending order, for Descending selection" , LogAs.PASSED,true, "Passed");
            		//	passReport(driver,"Charts Should display in "+QuickSortByText+" Descending order, for Descending selection  ","Charts Displayed in "+QuickSortByText+" Descending order, for Descending selection ");
                	}else {
            			add1(driver, "Expected : Charts Should display in "+QuickSortByText+" Descending order, for Descending selection   <---> Actual  : Charts displayed in "+QuickSortByText+" Ascending order, for Descending selection ", LogAs.FAILED,true, "Failed");
                 	    //failReport(driver,"Charts Should display in "+QuickSortByText+" Descending order, for Descending selection   ","Charts displayed in "+QuickSortByText+" Ascending order, for Descending selection ");
                	}
                	
                }
            }
            
        }
      public void selectDropdownValue(WebDriver driver,String Type ,String value) {
    	 
    	 try {
    		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    		 WebElement element=driver.findElement(By.xpath("//img[contains(@src, '"+Type+"')]//ancestor::li/descendant::div[contains(@title,'"+value+"')]"));
        	 Actions action=new Actions(driver);
        	 action.moveToElement(element).click().build().perform();
    		 add(driver,"Selected the Value in droptdown : "+value, LogAs.PASSED,true, "");
    		 //wait(driver,"1");
    	 }catch(Exception e) {
 			add1(driver, "Unable to Select the Value in droptdown : "+value, LogAs.FAILED,true, "");
    	 }
    	 
      }
      
      public void selectGroupDateValue(WebDriver driver ,String value) {
     	 
     	 try {
     		 WebElement element=driver.findElement(By.xpath("//li[@title='"+value+"']"));
         	 Actions action=new Actions(driver);
         	 action.moveToElement(element).click().build().perform();
     		 add(driver,"Selected the Value in droptdown : "+value, LogAs.PASSED,true, "");
  
     	 }catch(Exception e) {
  			add1(driver, "Unable to Select the Value in droptdown : "+value, LogAs.FAILED,true, "");
     	 }
     	 
       }
      
      public void selctPivotvalue(WebDriver driver,String value) {
    	   	 
 	   	 try {
 	   		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 	   		 WebElement element=driver.findElement(By.xpath("//div[@ref='primaryColsListPanel']//div[contains(@aria-label,'"+value+"')]//div[@ref='cbSelect']"));
 	       	 Actions action=new Actions(driver);
 	       	 action.moveToElement(element).click().build().perform();
 	   		 add(driver,"Selected the Value in the pivot : "+value, LogAs.PASSED,true, "");
 	   		 //wait(driver,"1");
 	   	 }catch(Exception e) {
 				add1(driver, "Unable to Select the Value pivot : "+value, LogAs.FAILED,true, "");
 	   	 }
    	 
      }
      
      public void selectDropdownValue1(WebDriver driver,String value) {
     	 
     	 try {
     		 WebElement element=driver.findElement(By.xpath("//span[contains(@class,'open')]//ul//*[contains(@title,'"+value+"')]"));
         	 Actions action=new Actions(driver);
         	 action.moveToElement(element).click().build().perform();
     		 add(driver,"Selected the Value in droptdown : "+value, LogAs.PASSED,true, "");
  
     	 }catch(Exception e) {
  			add1(driver, "Unable to Select the Value in droptdown : "+value, LogAs.FAILED,true, "");
     	 }
     	 
       }
       
        
//      public void selectDropdownValue1(WebDriver driver,String Value) {
//    	  try {
//    		  WebElement element=driver.findElement(By.xpath("//mat-option[@role='option']//span[contains(text(),'"+Value+"')]"));
//    	  	    Actions action=new Actions(driver);
//    	   	    action.moveToElement(element).click().build().perform();
//    	        wait(driver,"1");
//    	        add(driver,"Selected the Value in droptdown : "+Value, LogAs.PASSED,true, "");
//    	  }catch(Exception e)  {
//     			add1(driver, "Unable to Select the Value in droptdown : "+Value, LogAs.FAILED,true, "");
//    	  }
//      }
      public void selectFontFamily(WebDriver driver,String fontFamilyValue) {
    	  try {
    		  WebElement element=driver.findElement(By.xpath("//li[@role='treeitem']//div[text()='"+fontFamilyValue+"']"));
        	  Actions action=new Actions(driver);
         	  action.moveToElement(element).click().build().perform();
     		  add(driver,"Selected the Value in droptdown : "+fontFamilyValue, LogAs.PASSED,true, "");
    	  }catch(Exception e) {
   			add1(driver, "Unable to Select the Value in droptdown : "+fontFamilyValue, LogAs.FAILED,true, "");
     	 }
    	  
      }
      
      public void selectChartTheme(WebDriver driver,String ChartThemeValue) {
    	  try {
    		  WebElement element=driver.findElement(By.xpath("//li[@role='treeitem']//span[text()='"+ChartThemeValue+"']"));
        	  Actions action=new Actions(driver);
         	  action.moveToElement(element).click().build().perform();
     		  add(driver,"Selected the Value in droptdown : "+ChartThemeValue, LogAs.PASSED,true, "");
    	  }catch(Exception e) {
   			add1(driver, "Unable to Select the Value in droptdown : "+ChartThemeValue, LogAs.FAILED,true, "");
     	 }
    	  
      }
      
      public static boolean isDropdownExpanded(WebDriver driver, String Xpath) {
    	  
    	  String[] values=splitXpath(Xpath);
    	  
    	  WebElement dropdown = driver.findElement(By.xpath(values[1]));
          JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
          Object result = jsExecutor.executeScript("return arguments[0].classList.contains('open') || arguments[0].getAttribute('aria-expanded') === 'true'", dropdown);
          
          return Boolean.parseBoolean(result.toString());
      }
      
      public boolean isToggleEnable(WebDriver driver,String Xpath) {
    	String[] values=splitXpath(Xpath);
    	try {
	    	driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	    	WebElement Autscroll=driver.findElement(By.xpath(values[1]));
	       	boolean isEnabled = Autscroll.isSelected();
	       	
	       	if (isEnabled) {
	       		return true;
	       	} else {
	       		return false;
	       	}
    	}catch(Exception e) {
    		return false;
    	}
      }
      
      public boolean isToggleAccessible(WebDriver driver,String Xpath) {
      	String[] values=splitXpath(Xpath);
      	try {
	  		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	      	WebElement Autscroll=driver.findElement(By.xpath(values[1]));
	        boolean isAccessible = Autscroll.isEnabled();
      	
	        if (isAccessible) {
	        	return true;
	        } else {
	        	return false;
	        }
      	}catch(Exception e) {
    		return false;
      	}
     	 
      }
      
      public String getFontFamily(WebDriver driver,String Xpath) {
    	  String[] values=splitXpath(Xpath);
    	  try {
    		  WebElement element=driver.findElement(By.xpath(values[1]));
    		  
    		  String fontFamily = (String) ((JavascriptExecutor) driver)
                      .executeScript("return window.getComputedStyle(arguments[0], null).getPropertyValue('font-family');", element);
    		  System.out.println("Font family: " + fontFamily);
    		  return fontFamily;
    	  }catch(Exception e) {
   			add1(driver, "Unable to get the font Family value ", LogAs.FAILED,true, "");
   		    return "";
     	 }
		 
      }
        
      public String getAlignment(WebDriver driver,String Xpath) {
    	  String[] values=splitXpath(Xpath);
    	  try {
    		  WebElement element=driver.findElement(By.xpath(values[1]));
    		  
    		  String fontFamily = (String) ((JavascriptExecutor) driver)
                      .executeScript("return window.getComputedStyle(arguments[0], null).getPropertyValue('text-align');", element);
    		  System.out.println("Font family: " + fontFamily);
    		  return fontFamily;
    	  }catch(Exception e) {
   			add1(driver, "Unable to get the Alignment value ", LogAs.FAILED,true, "");
   		    return "";
     	 }
		 
      }
      
      public String getFontSize(WebDriver driver,String Xpath) {
    	  String[] values=splitXpath(Xpath);
    	  try {
    		  WebElement element = driver.findElement(By.xpath(values[1]));

    	        String fontSize = (String) ((JavascriptExecutor) driver)
    	                .executeScript("return window.getComputedStyle(arguments[0], null).getPropertyValue('font-size');", element);
    	        int startIndex=0;
    	        int endIndex=fontSize.indexOf("p");
    	        fontSize=fontSize.substring(startIndex, endIndex);
//    	        System.out.println("Font size: " + fontSize);
    	        return fontSize;
    	  }catch(Exception e) {
    		  add1(driver, "Unable to get the font Size value ", LogAs.FAILED,true, "");
     		    return "";
    	  }
      }
      public void selectOptionValue(WebDriver driver,String Xpath,String optionValue) {
    	  String[] values=splitXpath(Xpath);
    	  try {
    		  WebElement element=driver.findElement(By.xpath(values[1]));
    		  Select select=new Select(element);
    		  select.selectByValue(optionValue);
    		 add(driver, "Value Selected from the option : "+optionValue, LogAs.PASSED,true, "");
    	  }catch(Exception e) {
   			add1(driver, "Unable to select the value : "+optionValue, LogAs.FAILED,true, "");
   			//Assert.fail();
     	 }
		 
      }
      
      public void selectTarget(WebDriver driver,String value) {
       	 
       	 try {
       		 WebElement element=driver.findElement(By.xpath("//mat-option[@mattooltipclass='my-custom-tooltip']//span[contains(text(),'"+value+"')]"));
           	 Actions action=new Actions(driver);
           	 action.moveToElement(element).click().build().perform();
       		 add(driver,"Selected the Value in target : "+value, LogAs.PASSED,true, "");
    
       	 }catch(Exception e) {
    		add1(driver, "Unable to Select the Value in target : "+value, LogAs.FAILED,true, "");
       	 }
       	 
      }
      
      public static int getRoundOffValue(String numberString) {
          int count = 0;
          boolean decimalPointFound = false;

          for (int i = 0; i < numberString.length(); i++) {
              char c = numberString.charAt(i);

              if (c == '.') {
                  decimalPointFound = true;
              } else if (decimalPointFound) {
            	  if(c!='%') {
            		  count++;  
            	  }
              }
          }
          return count;
      }
      
      public void moveSlider(WebDriver driver,String Xpath,String OutputXpath,String Value) {
    	  String[] values=splitXpath(Xpath);
    	  String[] output=splitXpath(OutputXpath);

    	  try {
    		  WebElement slider=driver.findElement(By.xpath(values[1]));
    		  WebElement outputElement=driver.findElement(By.xpath(output[1]));
    		  int defaultOutputValue=Integer.parseInt(outputElement.getText());
    		  int userOutputValue=Integer.parseInt(Value);
	   	      Actions sliderAction = new Actions(driver);
	   	      sliderAction.clickAndHold(slider).build().perform();
	   	      if(defaultOutputValue>userOutputValue) {
	   	    	boolean moveleft=true;
		   	    while(moveleft) {
		   	    	sliderAction.sendKeys(Keys.LEFT).build().perform();
		   	    	String outputText=outputElement.getText();
		   	    	if(outputText.equals(Value)) {
		   	    		break;
		   	    	}
		   	      }
	   	      }else {
	   	    	boolean moveRight=true;
		   	    while(moveRight) {
		   	    	sliderAction.sendKeys(Keys.RIGHT).build().perform();
		   	    	String outputText=outputElement.getText();
		   	    	if(outputText.equals(Value)) {
		   	    		break;
		   	    	}
		   	      }
	   	      }
	   	   sliderAction.release().build().perform();
    	  }catch(Exception e) {
   			add1(driver, "Unable to move the Slider ", LogAs.FAILED,true, "");
     	 }
      }
      
      public String getRotationValue(WebDriver driver,String Xpath) {
    	  String[] values=splitXpath(Xpath);
    	  try {
    		  WebElement element = driver.findElement(By.xpath(values[1]));

    		  String transform = (String) ((JavascriptExecutor) driver)
    	                .executeScript("return window.getComputedStyle(arguments[0], null).getPropertyValue('transform');", element);

    	        String rotationAngle = getRotationAngle(transform);
    	        System.out.println("Rotation angle: " + rotationAngle);
    	        return rotationAngle;
    	  }catch(Exception e) {
    		  add1(driver, "Unable to get the Rotation Angle value ", LogAs.FAILED,true, "");
     		    return "";
    	  }
      }
      
      public String validateNumberFormat(String numberString) {
    	  try {
    		  String hundredSeparatorPattern = "^\\d{1,2}(,\\d{2}){1,2}(\\.\\d+)?$"; //"^\\d{1,2}(,\\d{2}){2}(,\\d{3})(\\.\\d+)?$";    //"^\\d{1,2},\\d{2},\\d{2}$";
              String thousandSeparatorPattern = "^\\d{1,3}(,\\d{3})+(\\.\\d+)?$";  //"^\\d{1,3}(,\\d{3})+$";
              
              Pattern hundredPattern = Pattern.compile(hundredSeparatorPattern);
              Pattern thousandPattern = Pattern.compile(thousandSeparatorPattern);

              Matcher hundredMatcher = hundredPattern.matcher(numberString);
              Matcher thousandMatcher = thousandPattern.matcher(numberString);

              if (thousandMatcher.matches()) {
                  return "#,###";
              } else if (hundredMatcher.matches()) {
                  return "#,##";
              } else {
            	  System.out.println("Number format is invalid");
                  return "Number format is invalid";
              }
    	  }catch(Exception e) {
    		  return "";
    	  }
          
      }
      
         public String SeperatorValidationTable(String numberString) {

    	    // Pattern for hundred separator (Indian format like "##,##,###")
    	    String HUNDRED_SEPARATOR_PATTERN = "^\\d{1,2}(,\\d{2}){1,2}(,\\d{3})?(\\.\\d+)?$";

    	    // Pattern for thousand separator (International format like "###,###")
    	    String THOUSAND_SEPARATOR_PATTERN = "^\\d{1,3}(,\\d{3})+(\\.\\d+)?$";
    	    
    	    // Compile the patterns
    	    Pattern HUNDRED_PATTERN = Pattern.compile(HUNDRED_SEPARATOR_PATTERN);
    	    Pattern THOUSAND_PATTERN = Pattern.compile(THOUSAND_SEPARATOR_PATTERN);
    	    
    	    // Matchers for both patterns
    	    Matcher hundredMatcher = HUNDRED_PATTERN.matcher(numberString);
    	    Matcher thousandMatcher = THOUSAND_PATTERN.matcher(numberString);

    	    // Check for matches
    	    if (hundredMatcher.matches()) {
    	        return "##,##,##,###"; // Indian hundred separator pattern
    	    } else if (thousandMatcher.matches()) {
    	        return "###,###,###"; // International thousand separator pattern
    	    } else {
    	        return "Number format is invalid";
    	    }
    	}
      
//      public String SeperatorValidationTable(String numberString) {
//          
//    	  String HUNDRED_SEPARATOR_PATTERN = "^\\d{1,2}(,\\d{2}){2}(,\\d{3})(\\.\\d+)?$";        //= "^\\d{1,2}(,\\d{2}){2}(,\\d{3})$";
//    	  String THOUSAND_SEPARATOR_PATTERN = "^\\d{1,3}(,\\d{3})+(\\.\\d+)?$";   //= "^\\d{1,3}(,\\d{3})+$";
//    	  
//    	  Pattern HUNDRED_PATTERN = Pattern.compile(HUNDRED_SEPARATOR_PATTERN);
//    	  Pattern THOUSAND_PATTERN = Pattern.compile(THOUSAND_SEPARATOR_PATTERN);
//
//    	  Matcher hundredMatcher = HUNDRED_PATTERN.matcher(numberString);
//    	  Matcher thousandMatcher = THOUSAND_PATTERN.matcher(numberString);
//	        
//    	  String hundredSeparatorPattern = "^\\d{1,2}(,\\d{2}){1,2}(\\.\\d+)?$"; //"^\\d{1,2}(,\\d{2}){2}(,\\d{3})(\\.\\d+)?$";    //"^\\d{1,2},\\d{2},\\d{2}$";
//    	  String thousandSeparatorPattern = "^\\d{1,3}(,\\d{3})+(\\.\\d+)?$";  //"^\\d{1,3}(,\\d{3})+$";
//            
//    	  Pattern hundredPattern = Pattern.compile(hundredSeparatorPattern);
//    	  Pattern thousandPattern = Pattern.compile(thousandSeparatorPattern);
//
//    	  Matcher hundredMatcher1 = hundredPattern.matcher(numberString);
//    	  Matcher thousandMatcher1 = thousandPattern.matcher(numberString);
//
//
//	        if (hundredMatcher.matches() || hundredMatcher1.matches()) {
//	            return "##,##,##,###";
//	        } else if (thousandMatcher.matches() || thousandMatcher1.matches()) {
//	            return "###,###,###";
//	        } else {
//	            return "Number format is invalid";
//	        }
//    	        
//      }
      
      public String getElementWidth(WebDriver driver, String xpath) {
          String[] values = splitXpath(xpath);
          try {
              WebElement eleSearch = driver.findElement(By.xpath(values[1]));
              String width = eleSearch.getCssValue("width");
              int startIndex=0;
              int endIndex=width.indexOf("p");
              width=width.substring(startIndex, endIndex);
              return width;
          } catch (Exception e) {
              System.out.println("Unable to get width of the element..!");
              return "";
          }
      }
      
      public boolean validateElementPosition(WebDriver driver, String firstElementXpath, String secondElementXpath, String status) {
    	        String[] values1 = splitXpath(firstElementXpath);
    	        String[] values2 = splitXpath(secondElementXpath);
          try {
              WebElement firstElement = driver.findElement(By.xpath(values1[1]));
              WebElement secondElement = driver.findElement(By.xpath(values2[1]));

              int firstElementX = firstElement.getLocation().getX();
              int firstElementY = firstElement.getLocation().getY();
              int secondElementX = secondElement.getLocation().getX();
              int secondElementY = secondElement.getLocation().getY();

              int firstElementWidth = firstElement.getSize().getWidth();
              int firstElementHeight = firstElement.getSize().getHeight();
              int secondElementWidth = secondElement.getSize().getWidth();
              int secondElementHeight = secondElement.getSize().getHeight();

              switch (status.toLowerCase()) {
                  case "outside":
                      System.out.println("Outside checked..******");
                      return (secondElementX + secondElementWidth < firstElementX || 
                              secondElementX > firstElementX + firstElementWidth ||
                              secondElementY + secondElementHeight < firstElementY ||
                              secondElementY > firstElementY + firstElementHeight);
                  case "inside":
                      System.out.println("Inside checked..********");
                      return (secondElementX >= firstElementX &&
                              secondElementX + secondElementWidth <= firstElementX + firstElementWidth &&
                              secondElementY >= firstElementY &&
                              secondElementY + secondElementHeight <= firstElementY + firstElementHeight);
                  case "center":
                	  System.out.println("Center checked..*********");
                       firstElementWidth = firstElement.getSize().getWidth();
                       firstElementHeight = firstElement.getSize().getHeight();
                       secondElementWidth = secondElement.getSize().getWidth();
                       secondElementHeight = secondElement.getSize().getHeight();

                      int firstElementCenterX = firstElementX + firstElementWidth / 2;
                      int firstElementCenterY = firstElementY + firstElementHeight / 2;
                      int secondElementCenterX = secondElementX + secondElementWidth / 2;
                      int secondElementCenterY = secondElementY + secondElementHeight / 2;

                      System.out.println("firstElementCenterX : "+ firstElementCenterX+", secondElementCenterX : "+secondElementCenterX);
                      System.out.println("firstElementCenterY : "+ firstElementCenterY+", secondElementCenterY : "+secondElementCenterY);

                      return (firstElementCenterX == secondElementCenterX && firstElementCenterY == secondElementCenterY) || !(secondElementX < firstElementX || secondElementY < firstElementY) || !(secondElementX >= firstElementX && secondElementY >= firstElementY) ;
//                  case "center":
//                      System.out.println("Center checked..*********");
//                      int firstElementCenterX = firstElementX + firstElementWidth / 2;
//                      int firstElementCenterY = firstElementY + firstElementHeight / 2;
//                      int secondElementCenterX = secondElementX + secondElementWidth / 2;
//                      int secondElementCenterY = secondElementY + secondElementHeight / 2;
//
//                      System.out.println("firstElementCenterX: " + firstElementCenterX + ", secondElementCenterX: " + secondElementCenterX);
//                      System.out.println("firstElementCenterY: " + firstElementCenterY + ", secondElementCenterY: " + secondElementCenterY);
//
//                      return firstElementCenterX == secondElementCenterX && firstElementCenterY == secondElementCenterY;
                  default:
                      System.out.println("Invalid status");
                      return false;
              }
          } catch (Exception e) {
              System.out.println("Unable to validate the position");
              //fail(driver, "Unable to Validate the position: " );
              return false;
          }
      }
      
      
//      public boolean validateElementPosition2(WebDriver driver, String firstElementXpath, String secondElementXpath, String status) {
//    	    String[] values1 = splitXpath(firstElementXpath);
//    	    String[] values2 = splitXpath(secondElementXpath);
//    	    try {
//    	        WebElement firstElement = driver.findElement(By.xpath(values1[1]));
//    	        WebElement secondElement = driver.findElement(By.xpath(values2[1]));
//
//    	        int firstElementX = firstElement.getLocation().getX();
//    	        int firstElementY = firstElement.getLocation().getY();
//    	        int secondElementX = secondElement.getLocation().getX();
//    	        int secondElementY = secondElement.getLocation().getY();
//
//    	        int firstElementWidth = firstElement.getSize().getWidth();
//    	        int firstElementHeight = firstElement.getSize().getHeight();
//    	        int secondElementWidth = secondElement.getSize().getWidth();
//    	        int secondElementHeight = secondElement.getSize().getHeight();
//
//    	        
//    	        System.out.println("firstElementX : "+firstElementX);
//    	        System.out.println("firstElementY : "+firstElementY);
//    	        System.out.println("firstElementWidth : "+firstElementWidth);
//    	        System.out.println("firstElementHeight : "+firstElementHeight);
//
//    	        System.out.println("secondElementX : "+secondElementX);
//    	        System.out.println("secondElementY : "+secondElementY);
//    	        System.out.println("secondElementWidth : "+secondElementWidth);
//    	        System.out.println("secondElementHeight : "+secondElementHeight);
//
//    	        
//    	        
//    	        
//    	        switch (status.toLowerCase()) {
//    	            case "outside":
//    	                // Checks if the second element is completely outside the first element
//    	                System.out.println("Outside checked..******");
//    	                return (secondElementX + secondElementWidth <= firstElementX || 
//    	                        secondElementX >= firstElementX + firstElementWidth ||
//    	                        secondElementY + secondElementHeight <= firstElementY ||
//    	                        secondElementY >= firstElementY + firstElementHeight);
//
//    	            case "inside":
//    	                // Checks if the second element is completely inside the first element
//    	                System.out.println("Inside checked..********");
//    	                return (secondElementX >= firstElementX &&
//    	                        secondElementX + secondElementWidth <= firstElementX + firstElementWidth &&
//    	                        secondElementY >= firstElementY &&
//    	                        secondElementY + secondElementHeight <= firstElementY + firstElementHeight);
//
//    	            case "center":
//    	                // Checks if the center of the second element is exactly at the center of the first element
//    	                System.out.println("Center checked..*********");
//
//    	                int firstElementCenterX = firstElementX + firstElementWidth / 2;
//    	                int firstElementCenterY = firstElementY + firstElementHeight / 2;
//    	                int secondElementCenterX = secondElementX + secondElementWidth / 2;
//    	                int secondElementCenterY = secondElementY + secondElementHeight / 2;
//
//    	                System.out.println("firstElementCenterX: " + firstElementCenterX + ", secondElementCenterX: " + secondElementCenterX);
//    	                System.out.println("firstElementCenterY: " + firstElementCenterY + ", secondElementCenterY: " + secondElementCenterY);
//
//    	                return firstElementCenterX == secondElementCenterX && firstElementCenterY == secondElementCenterY;
//
//    	            default:
//    	                System.out.println("Invalid status");
//    	                return false;
//    	        }
//    	    } catch (Exception e) {
//    	        System.out.println("Unable to validate the position");
//    	        fail(driver, "Unable to Validate the position: " + e.getMessage());
//    	        return false;
//    	    }
//    	}
//      
      public boolean validateElementPosition2(WebDriver driver, String firstElementXpath, String secondElementXpath, String status) {
    	    String[] values1 = splitXpath(firstElementXpath);
    	    String[] values2 = splitXpath(secondElementXpath);
    	    try {
    	        WebElement firstElement = driver.findElement(By.xpath(values1[1]));
    	        WebElement secondElement = driver.findElement(By.xpath(values2[1]));

    	        // First element dimensions and location
    	        int firstElementX = firstElement.getLocation().getX();
    	        int firstElementY = firstElement.getLocation().getY();
    	        int firstElementWidth = firstElement.getSize().getWidth();
    	        int firstElementHeight = firstElement.getSize().getHeight();

    	        // Second element dimensions and location (text value)
    	        int secondElementX = secondElement.getLocation().getX();
    	        int secondElementY = secondElement.getLocation().getY();
    	        int secondElementWidth = secondElement.getSize().getWidth();
    	        int secondElementHeight = secondElement.getSize().getHeight();

    	        System.out.println("firstElementX : "+firstElementX);
    	        System.out.println("firstElementY : "+firstElementY);
    	        System.out.println("firstElementWidth : "+firstElementWidth);
    	        System.out.println("firstElementHeight : "+firstElementHeight);

    	        System.out.println("secondElementX : "+secondElementX);
    	        System.out.println("secondElementY : "+secondElementY);
    	        System.out.println("secondElementWidth : "+secondElementWidth);
    	        System.out.println("secondElementHeight : "+secondElementHeight);

    	        switch (status.toLowerCase()) {
    	            case "outside":
    	                // Checks if the text element is completely outside the bar (above or below)
    	                System.out.println("Outside checked..******");
    	                return secondElementY + secondElementHeight < firstElementY || secondElementY > firstElementY + firstElementHeight;

    	            case "inside":
    	                // Checks if the text element is inside the vertical boundaries of the bar
    	                System.out.println("Inside checked..********");
    	                return secondElementY + secondElementHeight <= firstElementY + firstElementHeight;

    	            case "center":
    	                // Checks if the text element is horizontally centered with the bar
    	                System.out.println("Center checked..*********");
    	                int firstElementCenterX = firstElementX + firstElementWidth / 2;
    	                int secondElementCenterX = secondElementX + secondElementWidth / 2;

    	                // You could choose to add a small tolerance (e.g., 2px) if exact centering is too strict
    	                return Math.abs(firstElementCenterX - secondElementCenterX) <= 2;

    	            default:
    	                System.out.println("Invalid status");
    	                return false;
    	        }
    	    } catch (Exception e) {
    	        System.out.println("Unable to validate the position");
    	        fail(driver, "Unable to Validate the position: " + e.getMessage());
    	        return false;
    	    }
    	}
      
      
//      public  boolean validateElementPosition(WebDriver driver,String firstElementXpath, String  secondElementXpath, String status) {
//    	  
//    	  try {
//    		  String[] values1=splitXpath(firstElementXpath);
//        	  String[] values2=splitXpath(secondElementXpath);
//        	  
//        	  WebElement firstElement=driver.findElement(By.xpath(values1[1]));
//        	  WebElement secondElement=driver.findElement(By.xpath(values2[1]));
//
//              int firstElementX = firstElement.getLocation().getX();
//              int firstElementY = firstElement.getLocation().getY();
//              int secondElementX = secondElement.getLocation().getX();
//              int secondElementY = secondElement.getLocation().getY();
//
//              switch (status) {
//                  case "outside":
//                	  System.out.println("Outside checked..******");
//                      return secondElementX < firstElementX || secondElementY < firstElementY;
//                  case "inside":
//                	  System.out.println("Inside checked..********");
//                      return secondElementX >= firstElementX && secondElementY >= firstElementY;
//                  case "center":
//                	  System.out.println("Center checked..*********");
//                      int firstElementWidth = firstElement.getSize().getWidth();
//                      int firstElementHeight = firstElement.getSize().getHeight();
//                      int secondElementWidth = secondElement.getSize().getWidth();
//                      int secondElementHeight = secondElement.getSize().getHeight();
//
//                      int firstElementCenterX = firstElementX + firstElementWidth / 2;
//                      int firstElementCenterY = firstElementY + firstElementHeight / 2;
//                      int secondElementCenterX = secondElementX + secondElementWidth / 2;
//                      int secondElementCenterY = secondElementY + secondElementHeight / 2;
//
//                      System.out.println("firstElementCenterX : "+ firstElementCenterX+", secondElementCenterX : "+secondElementCenterX);
//                      System.out.println("firstElementCenterY : "+ firstElementCenterY+", secondElementCenterY : "+secondElementCenterY);
//
//                      return (firstElementCenterX == secondElementCenterX && firstElementCenterY == secondElementCenterY) || !(secondElementX < firstElementX || secondElementY < firstElementY) || !(secondElementX >= firstElementX && secondElementY >= firstElementY) ;
//                  default:
//                      System.out.println("Invalid status");
//                      return false;
//              }
//    	    }catch(Exception e) {
//    		  System.out.println("Unable to validate the postion ");
//    		  fail(driver,"Unable to Validate the  position "+e.getLocalizedMessage());
//    		  return false;
//    	  }
//    	 
//          
//      }
      
      
      public  String getRelativePosition(WebDriver driver, String xpath1, String xpath2) {
    	  
    	  try {
    		  String[] values1=splitXpath(xpath1);
        	  String[] values2=splitXpath(xpath2);
        	  
    		  WebElement element1 = driver.findElement(By.xpath(values1[1]));
    		  WebElement element2 = driver.findElement(By.xpath(values2[1]));
              
              Point point1 = element1.getLocation();
              Point point2 = element2.getLocation();
              Dimension size1 = element1.getSize();
              Dimension size2 = element2.getSize();
              
              int x1 = point1.getX();
              int y1 = point1.getY();
              int width1 = size1.getWidth();
              int height1 = size1.getHeight();
              
              int x2 = point2.getX();
              int y2 = point2.getY();
              int width2 = size2.getWidth();
              int height2 = size2.getHeight();
              
              if (y1 + height1 <= y2) {
                  return "Top";
              } else if (y2 + height2 <= y1) {
                  return "Bottom";
              } else if (x1 + width1 <= x2) {
                  return "Left";
              } else if (x2 + width2 <= x1) {
                  return "Right";
              } else {
                  return "Overlap";
              }
    	  }catch(Exception e) {
    		  System.out.println("Unable to validate the postion ");
    		  fail(driver,"Unable to Validate the  position "+e.getLocalizedMessage());
    		  e.printStackTrace();
    		  return "";
    	  }
    	  
         
      }
      
      
      public static String getRotationAngle(String transform) {
    	    String[] parts = transform.split("\\(")[1].split("\\)")[0].split(",");
    	    double a = Double.parseDouble(parts[0]);
    	    double b = Double.parseDouble(parts[1]);
    	    int angle = (int) Math.round(Math.atan2(b, a) * (180 / Math.PI));
    	    return String.valueOf(angle);
    	}
      
      public void HorizontalScroll(WebDriver driver,String Xpath,String limit) {
    	  String [] values=splitXpath(Xpath);
    	  try {
    		  WebElement element = driver.findElement(By.xpath(values[1]));
              JavascriptExecutor js = (JavascriptExecutor) driver;
              js.executeScript("arguments[0].scrollLeft = arguments[0].scrollLeft + "+limit+";", element);
              add(driver,"Horizontal scroll performed : "+values[0], LogAs.PASSED,true, "");
    	  }catch(Exception e) {
    		  add1(driver, "Unable to perform the horizontal scroll : "+values[0], LogAs.FAILED,true, "");
    	  }
      }
      
      public void HorizontalScrollFull(WebDriver driver,String Xpath) {
    	  String [] values=splitXpath(Xpath);
    	  try {
    		  WebElement element = driver.findElement(By.xpath(values[1]));
              JavascriptExecutor js = (JavascriptExecutor) driver;
              js.executeScript("arguments[0].scrollLeft = arguments[0].scrollWidth;", element);
              add(driver,"Horizontal scroll performed : "+values[0], LogAs.PASSED,true, "");
    	  }catch(Exception e) {
    		  add1(driver, "Unable to perform the horizontal scroll : "+values[0], LogAs.FAILED,true, "");
    	  }
      }
      
      public void VerticalScrollFull(WebDriver driver,String Xpath) {
    	  String [] values=splitXpath(Xpath);
    	  try {
    		  WebElement element = driver.findElement(By.xpath(values[1]));
              JavascriptExecutor js = (JavascriptExecutor) driver;
              js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight;", element);
              add(driver,"Vertical scroll performed : "+values[0], LogAs.PASSED,true, "");
    	  }catch(Exception e) {
    		  add1(driver, "Unable to perform the Vertical scroll : "+values[0], LogAs.FAILED,true, "");
    	  }
      }
      
      public void VerticalScroll(WebDriver driver,String Xpath,String limit) {
    	  String [] values=splitXpath(Xpath);
    	  try {
    		  WebElement element = driver.findElement(By.xpath(values[1]));
              JavascriptExecutor js = (JavascriptExecutor) driver;
              js.executeScript("arguments[0].scrollTop = arguments[0].scrollTop+ "+limit+";", element);
              add(driver,"Vertical scroll performed : "+values[0], LogAs.PASSED,true, "");
    	  }catch(Exception e) {
    		  add1(driver, "Unable to perform the Vertical scroll : "+values[0], LogAs.FAILED,true, "");
    	  }
      }
      
      public void ScrollBarValidation1(WebDriver driver,String Xpath,String Element) {
    	 String[] values=splitXpath(Xpath);	
    	 WebElement dropdown = driver.findElement(By.xpath(values[1]));
    	 Actions builder = new Actions(driver);
		 builder.moveToElement(dropdown).build().perform();
		 wait(driver,"1");
		 try {
			 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollTop = 0;", dropdown);
		 }catch(Exception e) {
			 
		 }
		 elementScreenShot_new(driver,Xpath,"/Expected_screenshot/ScrollbarValidation/dropdown_"+Element);
		 
	     Boolean isScrollbarPresent = (Boolean) ((JavascriptExecutor) driver)
	                .executeScript("return arguments[0].scrollHeight > arguments[0].offsetHeight;", dropdown);
	        
	        if (isScrollbarPresent) {
              ((JavascriptExecutor) driver).executeScript("arguments[0].scrollTop = arguments[0].scrollHeight;", dropdown);
	   		   builder.moveToElement(dropdown).build().perform();
	   		   wait(driver,"1");
	   		elementScreenShot_new(driver,Xpath,"/Actual_screenshot/ScrollbarValidation/dropdown_"+Element);
	   		    
	   		    boolean scrollImageCheck;
				try {
					scrollImageCheck = imageComparison2(driver, "/ScrollbarValidation/dropdown_"+Element, "/ScrollbarValidation/dropdown_"+Element);
					 if (scrollImageCheck) {
						 add1(driver, "Scroll not working properly in the "+Element+" Element", LogAs.FAILED,true, "");
			      			//fail(driver,"Scroll not working properly in the "+Element+" Element");
			            } else {
			            	add(driver,"Scroll works properly in "+Element+" Element", LogAs.PASSED,true, "");
			    			//pass(driver,"Scroll works properly in "+Element+" Element");  
			            }
					 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollTop = 0;", dropdown);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	           
	        } else {
	        	add(driver,"Unable to Validate the ScrollBar working Functionality on  "+Element+", because Scrollbar is not present ", LogAs.PASSED,true, "");
	        	//add1(driver, "Scrollbar is not present on the "+Element, LogAs.FAILED,true, "");
      			//fail(driver,"Scrollbar is not present on the "+Element);
	        }
      }
			
      public void ScrollBarValidation(WebDriver driver,String Xpath,String XpathForText,String Element) {
    	 String[] values=splitXpath(Xpath);
    	 String[] values2=splitXpath(XpathForText);

    	 WebElement dropdown = driver.findElement(By.xpath(values[1]));
    	 Actions builder = new Actions(driver);
		 builder.moveToElement(dropdown).build().perform();
		 wait(driver,"1");
		 
		 WebElement webElement = driver.findElement(By.xpath(values2[1]));
		 String initialText=webElement.getText();
		 System.out.println(initialText);
		 
	     Boolean isScrollbarPresent = (Boolean) ((JavascriptExecutor) driver)
	                .executeScript("return arguments[0].scrollHeight > arguments[0].offsetHeight;", dropdown);
	        
	        if (isScrollbarPresent) {
              ((JavascriptExecutor) driver).executeScript("arguments[0].scrollTop = arguments[0].scrollHeight;", dropdown);
	   		   builder.moveToElement(dropdown).build().perform();
	   		   wait(driver,"1");
	   		   WebElement webElement2 = driver.findElement(By.xpath(values2[1]));
	           String finalText=webElement2.getText();
	   		   System.out.println(finalText);

	            if (initialText.equals(finalText)) {
	      			fail(driver,"Scroll not working properly in the "+Element+" dropdown");
	            } else {
	    			pass(driver,"Scroll works properly in "+Element+" dropdown");
//	                System.out.println("Scroll bar Accessible..");
	                
	            }
	        } else {
	        	fail(driver,"Scrollbar is not present on the "+Element+" dropdown.");
        	}
     }
      
      public void FontSizeOrderValidation(WebDriver driver,String Xpath) {
     	   String[] values=splitXpath(Xpath);

    	  List<WebElement> elements = driver.findElements(By.xpath(values[1]));
          boolean isNumericalOrder = true;

          for (int i = 0; i < elements.size() - 1; i++) {
              String currentText = elements.get(i).getText();
              int num1=Integer.parseInt(currentText);
              String nextText = elements.get(i + 1).getText();
              int num2=Integer.parseInt(nextText);
              
              if(num1>num2) {
            	  isNumericalOrder = false;
        		  add1(driver, num1+" Should come after "+num2, LogAs.FAILED,true, "");
              }
         
          }

          // Output result
          if (isNumericalOrder) {
  			passReport(driver,"Font Size results should in Numerical ascending order" ,"Font Size results are in Numerical ascending order");
              System.out.println("Texts are in Numerical ascending order.");
          } else {
    		  failReport(driver,"Font Size results should in Numerical ascending order","Font Size results are not in the Numerical ascending order");
              System.out.println("Texts are not in Numerical ascending order.");
          }

      }
      
      public static String getCellValueAsString(Cell cell) {
  		switch (cell.getCellTypeEnum()) {
  		case STRING:
  			return cell.getStringCellValue();
  		case NUMERIC:
  			if (DateUtil.isCellDateFormatted(cell)) {
  				return cell.getDateCellValue().toString();
  			} else {
  				return String.valueOf(cell.getNumericCellValue());
  			}
  		case BOOLEAN:
  			return String.valueOf(cell.getBooleanCellValue());
  		case FORMULA:
  			return cell.getCellFormula();
  		case BLANK:
  			return "";
  		default:
  			return "";
  		}
  	}
      
      public List<String> getdata(WebDriver driver, String Testcasename, String Sheetname,String testcasecolumn,String conditioncolumnname,String data) {

    	    String excelFilePath = System.getProperty("user.dir") + "//data//TestExecution.xlsx";

    	    List<String> testCaseData = new ArrayList<>();

    	    try {
    	        // Load the Excel file
    	        FileInputStream fis = new FileInputStream(excelFilePath);
    	        Workbook workbook = new XSSFWorkbook(fis);
    	        Sheet sheet = workbook.getSheet(Sheetname);

    	        // Create a map to store column names and their corresponding indices
    	        Map<String, Integer> columnIndices = new HashMap<>();

    	        // Assuming the first row is the header
    	        Row headerRow = sheet.getRow(0);
    	        if (headerRow != null) {
    	            for (Cell cell : headerRow) {
    	                columnIndices.put(getCellValueAsString(cell), cell.getColumnIndex());
    	            }
    	        }

    	        // Iterate through each row in the sheet, starting from the second row
    	        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
    	            Row row = sheet.getRow(i);
    	            if (row == null) continue;

    	            // Get cells by column names
    	            Cell testCaseCell = row.getCell(columnIndices.get(testcasecolumn));
    	            Cell conditionCell = row.getCell(columnIndices.get(conditioncolumnname));
    	            Cell dataCell = row.getCell(columnIndices.get(data));

    	            // Check if the cells are not null and the condition is "yes"
    	            if (testCaseCell != null && conditionCell != null && dataCell != null
    	                    && "yes".equalsIgnoreCase(getCellValueAsString(conditionCell))) {
    	                String testCaseName = getCellValueAsString(testCaseCell);
    	                String dataValue = getCellValueAsString(dataCell);

    	                // Add the data value to the corresponding test case list
    	                if (Testcasename.equalsIgnoreCase(testCaseName)) {
    	                    testCaseData.add(dataValue);
    	                }
    	            }
    	        }

    	        // Close the workbook and input stream
    	        workbook.close();
    	        fis.close();

    	        // Print the lists (for testing purposes)
    	        System.out.println("Test Case Data: " + testCaseData);

    	    } catch (IOException e) {
    	        e.printStackTrace();
    	    }

    	    return testCaseData;
    	  }
      
      public  String getCellValue(String FileName,String SheetName,String autoTestCaseNameVal, String label) {
  		String requiredCellVal = "";
  		try {
  			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/data/"+FileName+".xlsx");
  			XSSFWorkbook wb = new XSSFWorkbook(fis);
  			XSSFSheet ws = wb.getSheet(SheetName);
  			int rowNum = ws.getLastRowNum() + 1;

  			Iterator rowIterator = ws.rowIterator();
  			int numberOfCells = 0;
  			if (rowIterator.hasNext()) {
  				Row headerRow = (Row) rowIterator.next();
  				// get the number of cells in the header row
  				numberOfCells = headerRow.getLastCellNum();
  			}
  			XSSFRow row1 = ws.getRow(0);
  			for (int index = 0; index < rowNum; index++) {

  				XSSFRow row = ws.getRow(index);
  				XSSFCell cell = row.getCell(2);
  				String cellVal = cellToString(cell);
  				//System.out.println(cellVal);
  				if (cellVal.equals(autoTestCaseNameVal)) {
  					//System.out.println("Entered "+cellVal+" autoTestCaseNameVal "+autoTestCaseNameVal+"Row Index : "+index);
  					for (int cellIndex = 1; cellIndex < numberOfCells; cellIndex++) {
  						XSSFCell findLable = row1.getCell(cellIndex);
  						String labelString = cellToString(findLable);
  						//System.out.println("labelString : "+labelString+", findLable : "+label);
  						if (labelString.equals(label)) {
  							//System.out.println("Cell Index: "+cellIndex);
  							//XSSFRow nextRow = ws.getRow(index + 1);
  							XSSFCell adjacentRowCell = row.getCell(cellIndex);
  							String adjacentRowCellVal = cellToString(adjacentRowCell);
  							//System.out.println("Cell Val: "+adjacentRowCellVal);
  							requiredCellVal = adjacentRowCellVal;
  							break;
  						}
  					}

  					break;
  				}
  			}
  		} catch (Exception e) {
  			e.printStackTrace();
  		}
  		return requiredCellVal.trim();
  	}
      
      public static String cellToString(XSSFCell cell) 
  	{
  			int type;
  			String result;
  			type = cell.getCellType();

  			switch (type) {

  			case Cell.CELL_TYPE_NUMERIC: // numeric value in Excel
  				result = "" + cell.getNumericCellValue();
  				break;
  			case Cell.CELL_TYPE_FORMULA: // precomputed value based on formula
  				result = "" + cell.getNumericCellValue();
  				break;
  			case Cell.CELL_TYPE_STRING: // String Value in Excel
  				result = "" + cell.getStringCellValue();
  				break;
  			case Cell.CELL_TYPE_BLANK:
  				result = "";
  				break;
  			case Cell.CELL_TYPE_BOOLEAN: // boolean value
  				result = "" + cell.getBooleanCellValue();
  				break;
  			case Cell.CELL_TYPE_ERROR:
  				result = "Error";
  			default:
  				throw new RuntimeException(
  						"There is no support for this type of cell");
  			}

  			return result.toString();
  	}
  	
      public static List<String> expandRange(String rangeStr) {
          List<String> result = new ArrayList<>();
          String[] parts = rangeStr.split("-");
          int start = Integer.parseInt(parts[0]);
          int end = Integer.parseInt(parts[1]);
          for (int i = start; i <= end; i++) {
              result.add(String.valueOf(i));
          }
          return result;
      }

      public static List<String> splitAndExpand(String input) {
          List<String> result = new ArrayList<>();
          String[] parts = input.split(",");
          for (String part : parts) {
              if (part.contains("-")) {
                  result.addAll(expandRange(part));
              } else {
                  result.add(part);
              }
          }
          return result;
      }
      
      public static String LineStyleValidation(String value) {
    	  try {
    		  switch (value) {
      		case "_______":
      			return "";
      		case "...........":
      			return "2,2";
      		case "-----------.":
      			return "8,4";
      		case "-.-.-.-.-.-":
      			return "8,4,2,4";
      		default:
      			return "";
      		}
    	  }catch(Exception e) {
    		  return "-1";
    	  }
    		
    	}
      
      // For Create report for each interation
      public ITestResult createNewTestResult(String methodName) {
    	    ITestResult result = new TestResult();
    	    //result.
//    	    result.setTestClass(this.getClass().getDeclaredMethods());
//    	    result.setMethod(this.getClass().getDeclaredMethod(methodName, null));
//    	    result.setTestContext(TestContext);
    	    return result;
    	}
      
      public void AlphabetOrderValidation(WebDriver driver,String Xpath) {//AlphabetOrderValidation
    	   String[] values=splitXpath(Xpath);

   	  List<WebElement> elements = driver.findElements(By.xpath(values[1]));
         boolean isAlphabetical = true;

         for (int i = 0; i < elements.size() - 1; i++) {
             String currentText = elements.get(i).getText().toLowerCase();
             String nextText = elements.get(i + 1).getText().toLowerCase();

             if (currentText.compareTo(nextText) > 0) {
//           	  if(!(currentText.equals("Miriam")&&nextText.equals("MV Bol"))) {
                     isAlphabetical = false;
              		 add1(driver, currentText+" Should come after '"+nextText+"'", LogAs.FAILED,true, "");
//           	  }
//                 isAlphabetical = false;
             }
         }

         // Output result
         if (isAlphabetical) {
 			passReport(driver,"Font Family results should in alphabetical ascending order" ,"Font Family results are in alphabetical ascending order");
             System.out.println("Texts are in alphabetical ascending order.");
         } else {
   		  failReport(driver,"Font Family results should in alphabetical ascending order","Font Family results are not in the alphabetical ascending order");
             System.out.println("Texts are not in alphabetical ascending order.");
         }

     }
     
       
}