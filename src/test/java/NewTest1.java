import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTest1 {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver",  "C:\\Users\\Kannan\\OneDrive\\Desktop\\geckodriver-v0.31.0-win64/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.shine.com/myshine/login/");

		// email
		WebElement mail = driver.findElement(By.id("id_email_login"));
		mail.sendKeys("kanna884@gmail.com");

		// password
		WebElement pass = driver.findElement(By.id("id_password"));
		pass.sendKeys("Testpassword@481");
		
		Thread.sleep(20000);

		// button
		WebElement login = driver.findElement(By.cssSelector("#cndidate_login_widget .msitelogin_mid2 .ui-btn_n"));
		login.click();
		Thread.sleep(20000);

  }
}
