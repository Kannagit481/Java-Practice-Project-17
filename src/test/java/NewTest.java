import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class NewTest {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver",  "C:\\Users\\Kannan\\OneDrive\\Desktop\\geckodriver-v0.31.0-win64/geckodriver.exe");
      WebDriver driver = new FirefoxDriver();
		driver.get("https://www.shine.com/registration/");
		
		//name
		WebElement name= driver.findElement(By.id("id_name"));
		name.sendKeys("Kannan X");
		
		//email
		WebElement email= driver.findElement(By.id("id_email"));
		email.sendKeys("kanna884@gmail.com");
		
		//mobile
		WebElement mobile= driver.findElement(By.id("id_cell_phone"));
		mobile.sendKeys("6381019727");
		
		
		//password
		WebElement password= driver.findElement(By.id("id_password"));
		password.sendKeys("Testpassword@481");
		
		//button
		WebElement register= driver.findElement(By.cssSelector("#registerButton"));
		Thread.sleep(20000);
		register.click();
		Thread.sleep(20000);
		
	}

}
