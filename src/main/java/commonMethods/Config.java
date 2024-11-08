package commonMethods;

import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;

import atu.testng.reports.ATUReports;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Config extends Keywords {
	public WebDriver driver;
	ATUReports atuRep = new ATUReports();

	public WebDriver getDriver() throws MalformedURLException {
		return this.driver;

	}

	public void setDriver(WebDriver paramDriver) throws MalformedURLException {
		this.driver = paramDriver;
	}


	public WebDriver getWebDriver(String browserName) throws MalformedURLException {
		if (browserName.equals("Chrome")) {
			
			//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
            WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--force-device-scale-factor=0.8");
//			options.addArguments("--headless");
			options.addArguments("disable-notifications");
			LoggingPreferences logPrefs = new LoggingPreferences();
			logPrefs.enable(LogType.BROWSER, Level.ALL);
			options.setCapability("goog:loggingPrefs", logPrefs);
			options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
			WebDriver driver = new ChromeDriver(options);
			System.out.println("Chrome Browser launched...");
			setDriver(driver);
			driver.manage().window().maximize();
//			Dimension dimension = new Dimension(1930, 1090);
//			driver.manage().window().setSize(dimension);
			
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.notifications", 1);
			prefs.put("download.default_directory", System.getProperty("user.dir") + "\\DownloadedFiles");

		} else if (browserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\driver\\geckodriver.exe");

			FirefoxOptions option = new FirefoxOptions();
			option.addPreference("dom.webnotifications.enabled", false);
			WebDriver driver = new FirefoxDriver(option);
			System.out.println("Firefox Browser launched...");
			setDriver(driver);
			driver.manage().window().maximize();

		} else if (browserName.equalsIgnoreCase("IE")) {
			WebDriverManager.iedriver().setup();
			WebDriver driver = new InternetExplorerDriver();
			System.out.println("IE Browser launched...");
			setDriver(driver);
			driver.manage().window().maximize();

		}
		return driver;
	}

	public static void setZoomLevel(WebDriver driver) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("document.body.style.zoom='80%'");
//        jsExecutor.executeScript("document.body.style.zoom='" + zoomLevel + "'");
    }
}
