package com.selenium.script.test_automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        //System.out.println( "Hello World!" );
    	//Initialize Web Driver
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\alayn\\OneDrive\\Desktop\\Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    	ChromeOptions chromeOptions = new ChromeOptions();
    	chromeOptions.addArguments("--headless");
    	chromeOptions.addArguments("--no-sandbox");
    	chromeOptions.addArguments("--disable-dev-shm-usage");
    	chromeOptions.addArguments("--remote-allow-origins=*");
    	WebDriver driver = new ChromeDriver(chromeOptions);
    	
    	//2. Open the application URL
    	driver.get("https://www.facebook.com/");
    	
    	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    	driver.manage().window().maximize();
    	
    	//3. Locate Fields
    	driver.findElement(By.id("email")).sendKeys("Wasim");
    	driver.findElement(By.name("pass")).sendKeys("Malik");
               
    	//4. Locate Log In Button
        //driver.findElement(By.id("u_0_5_OL")).sendKeys("Malik");
    	driver.findElement(By.name("login")).click();
    	  	
    	
    	//Validate info
    	
    	//Quit Driver
    	driver.quit();
    	
    	
    	
    }
}
