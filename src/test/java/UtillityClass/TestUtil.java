package UtillityClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestUtil {

	
	public static void onClick(WebElement ele)
	{
		ele.click();
		
	}
	public static void SelectByValue(WebElement ele,String value)
	{
		Select s=new Select(ele);
		s.selectByValue(value);
	}
	
	public static void SelectByIndex(WebElement ele,int value)
	{
		Select s=new Select(ele);
		s.selectByIndex(value);
	}
	public static void SelectByVisibleText(WebElement ele,String value)
	{
		Select s=new Select(ele);
		s.selectByVisibleText(value);
	}
	public static boolean isEnabled(WebElement ele)
	{
		return ele.isEnabled();
	}
	public static boolean isSelected(WebElement ele)
	{
		return ele.isSelected();
	}
	public static boolean isDisplayed(WebElement ele)
	{
		return ele.isDisplayed();
	}
	
	
}
