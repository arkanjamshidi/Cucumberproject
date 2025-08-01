package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='My Account']")
    private WebElement myAccount;
    
    @FindBy(xpath="//a[text()='Login']")
    private WebElement Login;
    
    public void clickMyAccount() {
        myAccount.click();
    }
    public void clickLogin() {
    	Login.click();
    }
}

