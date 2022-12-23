package UtillityClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {
	public static WebDriver driver;
	
	@BeforeTest
	public void beforetest()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
	}
	@Test
	public void run()
	{
    System.out.println("DROPDOWN SELECTION TESTING");
    WebElement ele=driver.findElement(By.id("dropdowm-menu-1"));
    TestUtil.SelectByIndex(ele, 2);
    Assert.assertTrue(TestUtil.isDisplayed(ele));
    System.out.println("Dropdown1 selected");
    WebElement ele1=driver.findElement(By.id("dropdowm-menu-2"));
    TestUtil.SelectByValue(ele1,"maven");
    Assert.assertTrue(TestUtil.isDisplayed(ele1));
    System.out.println("Dropdown2 selected");
    WebElement ele2=driver.findElement(By.id("dropdowm-menu-3"));
    TestUtil.SelectByVisibleText(ele2,"JavaScript");
    Assert.assertTrue(TestUtil.isDisplayed(ele2));
    System.out.println("Dropdown3 selected");
   
	}
	
	@Test
	public void chechkboxtest()
	{
		System.out.println("CHECKBOX TESTING");
		WebElement ele=driver.findElement(By.xpath("//input[@value='option-1']"));
		ele.click();
		Assert.assertTrue(TestUtil.isSelected(ele));
		System.out.println("OPTION-1 SELECTED");
		WebElement ele1=driver.findElement(By.xpath("//input[@value='option-3']"));
		Assert.assertTrue(TestUtil.isSelected(ele));
		System.out.println("OPTION-3 SELECTED");
		
	}
	@Test
	public void radiotest()
	{
		System.out.println("RADIOBUTTON TESTING");
		WebElement ele=driver.findElement(By.xpath("//input[@value='yellow']"));
		ele.click();
		Assert.assertTrue(TestUtil.isEnabled(ele));
		
		Assert.assertTrue(TestUtil.isSelected(ele));
		System.out.println("OPTION-YELLOW IS SELECTED");
	}
	
	@Test
	public void selectedtest()
	{
		System.out.println("SELECTED-DIABLED TESTING");
		WebElement ele=driver.findElement(By.xpath("//input[@value='cabbage']"));

		Assert.assertFalse(TestUtil.isEnabled(ele));
		System.out.println("CABBAGE OPTION DISABLED");
		WebElement ele1=driver.findElement(By.xpath("//input[@value='pumpkin']"));
		Assert.assertTrue(TestUtil.isSelected(ele1));
		System.out.println("OPTION-PUMPKIN IS SELECTED");
	}

}
