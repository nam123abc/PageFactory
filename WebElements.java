package DigiPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

public class WebElements {

	WebDriver driver;


	@FindBy(how=How.ID, using= "workspace")
	WebElement digispace;

	@FindBy(how=How.ID, using= "Username")
	WebElement Email;

	@FindBy(how=How.ID, using= "Password")
	WebElement password;
	
	@FindBy(how=How.XPATH, using= "//button[contains(text(),'Login Now')]")
	WebElement loginButton;
	
	public WebElements(WebDriver driver) {
		this.driver = driver;
	}


	public void loginMethod(String Digi,String user,String passw) {
		digispace.sendKeys(Digi);
		Email.sendKeys(user);
		password.sendKeys(passw);
		loginButton.click();
	
	}
	}

