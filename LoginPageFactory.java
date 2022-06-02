package DigiPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPageFactory {
	
	@Test
	
	public void loginVerify() throws Exception {
               System.setProperty("webdriver.chrome.driver", "/Users/gsns/Downloads/chromedriver");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://apptest.digiboxx.com/login");
				
				WebElements login = PageFactory.initElements(driver, WebElements.class);
				  login.loginMethod("Intern3", "testing2510932@gmail.com", "Gaurav@123");
				  //driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				  Thread.sleep(1500);
				  }

		  }


