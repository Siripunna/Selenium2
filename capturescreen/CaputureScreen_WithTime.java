package capturescreen;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaputureScreen_WithTime 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		LocalDateTime now=LocalDateTime.now();
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyy-MM-dd_HH-mm-ss");
		String timestamp=now.format(formatter);
		
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		screenshot.renameTo(new File("C:\\Users\\Raviteja Kema\\OneDrive\\Desktop\\CAPTURESCREENSHOT\\withtime\\FBHome"+timestamp+".PNG"));
		
		driver.quit();
		
		
	}

}
