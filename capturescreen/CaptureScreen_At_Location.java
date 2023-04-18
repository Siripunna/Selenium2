package capturescreen;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreen_At_Location
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		WebElement FooterLocation=driver.findElement(By.xpath("(//div[contains(@class,'_aacl _aacn _aacu _aacy _aad6')])[10]"));
		File src= FooterLocation.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("C:\\Users\\Raviteja Kema\\OneDrive\\Desktop\\CAPTURESCREENSHOT\\capturescreen\\image1.PNG"));
		
	}

}
