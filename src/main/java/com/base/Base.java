package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;
	public static Properties properties;
	public static Actions actions;
	
	
	public static Properties readPropertyFile() {
		try {
			FileInputStream fileInputStream = new FileInputStream("C:\\Users\\sathiya\\eclipse-workspace\\scrum\\Flipkart\\src\\test\\resources\\com\\properties\\config.properties");
			properties = new Properties();
			try {
				properties.load(fileInputStream);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return properties;

	}

	public static WebDriver browser_launch(String browserName) {
		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}else if (browserName.equalsIgnoreCase("ie")) {
				WebDriverManager.iedriver().setup();
				driver= new InternetExplorerDriver();
			}else if (browserName.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				driver= new EdgeDriver();
			}else {
				throw new Exception("Invalid Brwoser");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		return driver;
	}


	public static void sendKeys(WebElement element , String value) {
		element.sendKeys(value);
	}

	public static void click(WebElement element) {
		element.click();
	}
	public static void getTitle() {
		System.out.println(driver.getTitle());
	}
	
	public static void currentUrl() {
		System.out.println(driver.getCurrentUrl());
	}
	
	public static void implicityWaitTime(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

	public static void pageLoadWait(String time) {
		driver.manage().timeouts().pageLoadTimeout(Long.parseLong(time), TimeUnit.SECONDS);
	}
	
	public static WebElement activeElement() {
		WebElement activeElement = driver.switchTo().activeElement();
		return activeElement;
		
	}
	
	public static String getTextInWebElement(WebElement element) {
		String text = element.getText();
		return text;
		
	}

	public static WebElement elementToBeClickable(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		try {
			WebElement clickable = wait.until(ExpectedConditions.elementToBeClickable(element));
			return clickable;
		}catch (Exception e) {
			e.printStackTrace();
		}return element;

	}
	public static WebElement elementToBeVisible(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		try {
			WebElement visible = wait.until(ExpectedConditions.visibilityOf(element));
			return visible;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return element;
	}
	
	public static void mouseHover(WebElement element) {
		actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}
	
	public static WebElement elementIsPresent(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return element;
	}
	
	public static void waitNumberOfWindowsPresent(int noOfWindows) {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.numberOfWindowsToBe(noOfWindows));
	}
	
	public static void alertToBePresent(int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();
	}
	
	
	
	public static boolean isEnabled(WebElement element) {
		try {
			boolean enabled = element.isEnabled();
			return enabled;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
			}

	
	public static void getUrl (String URL){
		driver.get(URL);

	}

	public static void selectDropdown(WebElement element,String selectBy,String ReqValue) {
		Select select = new Select(element);
		try {
			if (selectBy.equalsIgnoreCase("index")) {
				select.selectByIndex(Integer.parseInt(ReqValue));
			}else if (selectBy.equalsIgnoreCase("visibleText")) {
				select.selectByVisibleText(ReqValue);
			}else if (selectBy.equalsIgnoreCase("value")) {
				select.selectByValue(ReqValue);
			}else {
				throw new Exception("Invalid Selector");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void scrollDownToElement(WebElement element) {
		actions = new Actions(driver);
		actions.moveToElement(element);
	}

	
	public static void screenshot(String filename) {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File destination = new File("target/screenshot/"+filename+".png");
		try {
			FileUtils.copyFile(source, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void clickAndHold(WebElement element) {
		actions.clickAndHold(element).build().perform();
	}

	public static void releaseMouseClick() {
		actions.release().build().perform();
	}
	
	public static WebDriver close() {
		driver.close();
		return driver;
	}
	public static WebDriver quit() {
		driver.quit();
		return driver;
	}
}
