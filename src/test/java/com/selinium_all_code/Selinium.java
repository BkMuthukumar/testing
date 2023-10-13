package com.selinium_all_code;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selinium extends Baseclass{

	public static void main(String[] args) {
		//launch browser
		WebDriver driver =new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		//send keys 
		driver.findElement(By.id("name")).sendKeys("Muthu");
		//radio
		driver.findElement(By.id("male")).click();
		//check box
		driver.findElement(By.xpath("//input[@type='checkbox']"));
		WebElement sel = driver.findElement(By.id("country"));
		Select select = new Select(sel);
		select.selectByIndex(4);
		List<WebElement> wbs = driver.findElements(By.xpath("//select[@class='form-control']"));
		for (WebElement wbss : wbs) {
			System.out.println(wbss.getText());
		}
		driver.findElement(By.id("datepicker")).sendKeys("10/11/2023");
		
		
		

	}

}
