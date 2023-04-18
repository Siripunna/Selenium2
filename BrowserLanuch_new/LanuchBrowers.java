package BrowserLanuch_new;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LanuchBrowers 
{

	public static void main(String[] args)
	{
		ChromeDriver chorme=new ChromeDriver();
		chorme.get("https://www.instagram.com/");
		
		FirefoxDriver firefox=new FirefoxDriver();
		firefox.get("https://www.facebook.com/");		
	}

}
