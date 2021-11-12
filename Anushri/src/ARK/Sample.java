package ARK;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Sample {

	public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\\\chromedriver.exe");
      WebDriver d= new ChromeDriver();
      d.get("https://mail.google.com/");
      d.close();
      
	}

}
