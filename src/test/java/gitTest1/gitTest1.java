package gitTest1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class gitTest1 {
	@Test
	public void loginTest() throws IOException{
		WebDriver wd = new FirefoxDriver();
		wd.get("https://www.bing.com/");
		WebElement input = wd.findElement(By.name("q"));
		input.sendKeys("chennai");
		input.submit();
		File src =((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		org.apache.commons.io.FileUtils.copyFile(src,new File("C:\\seleniumWorkspace\\gitTest1\\screenshot"));
		
	}

}
