package com.automationtesting.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Tc_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://practice.automationtesting.in/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.id("username")).sendKeys("rajitha@gmail.com");
		driver.findElement(By.id("password")).sendKeys("abc");
		driver.findElement(By.name("login")).click();
		String actmessage=driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/ul/li")).getText();
		String expmessage="login successful";
		System.out.println("actmessage");
		if (expmessage==actmessage) {

		System.out.println("test is pass");

		}

		else {

		System.out.println("test is fail");
				
				
				
		
		

	}

	}
}
