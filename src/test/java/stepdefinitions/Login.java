package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import factory.Factory;
import io.cucumber.java.en.*;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;

public class Login {

    WebDriver driver;
    HomePage homepage;
    LoginPage loginpage;
    AccountPage accountPage;

    @Given("User navigates to the page")
    public void user_navigates_to_the_page() {
        driver = Factory.getdriver();
        homepage = new HomePage(driver);
        homepage.clickMyAccount();
    }

    @When("User clicks on Login")
    public void user_clicks_on_login() {
        homepage.clickLogin();
    }

    @And("User enters valid email address {string}")
    public void user_enters_valid_email_address(String email) {
        loginpage = new LoginPage(driver);
        loginpage.enterEmail(email);
    }

    @And("User enters valid password {string}")
    public void user_enters_valid_password(String password) {
    	LoginPage   loginpage = new LoginPage(driver);
        loginpage.enterpassword(password);
    }

    @And("User clicks the login button")
    public void user_clicks_the_login_button() {
    	LoginPage   loginpage = new LoginPage(driver);
        loginpage.Click();
    }

    @Then("User should successfully login")
    public void user_should_successfully_login() {
        accountPage = new AccountPage(driver);
        Assert.assertTrue("Account info not displayed after login", accountPage.isAccountInformationDisplayed());
    }
}
