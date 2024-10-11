package test_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase2 {
	@Test
	public void Login()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
	}

}
