package co.com.google.capactacion.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MiPrimerSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		WebDriver Jonathan=new ChromeDriver();
		Jonathan.manage().window().maximize();
		Jonathan.get("https://www.google.com");
		Jonathan.findElement(By.name("q")).sendKeys("Quesito");
		Jonathan.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Jonathan.quit();
	}

}
