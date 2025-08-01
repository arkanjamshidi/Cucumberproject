package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement email;
    
    @FindBy(xpath="//input[@id='input-password']")
    private WebElement password;
    
    @FindBy(xpath="//input[@value='Login']")
    private WebElement LoginClick;
    
    
    public void enterEmail(String emailText) {
    	
    	email.sendKeys(emailText);
    }
    public void enterpassword(String passwordText) {
    	
    	password.sendKeys(passwordText);
      }
public void Click() {
    	
    	LoginClick.click();
    }
    }