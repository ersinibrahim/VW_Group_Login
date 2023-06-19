package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utilities.BaseDriver;
import utilities.ExcelUtilities;

import java.util.List;

public class LoginSteps {

    LoginPage loginPage;

    public LoginSteps(LoginPage loginPage) {this.loginPage = loginPage;}

    @Given("^Navigate to VW Group Website$")
    public void navigate_to_VW_Group_Website()  {
        WebDriver driver= BaseDriver.getDriver();
        driver.get("https://jobs.volkswagen-groupservices.com/");
        driver.manage().window().maximize();
    }

    @When("^Enter username and password and click login button$")
    public void enter_username_and_password_and_click_login_button()  {

        loginPage.clickFunction(loginPage.getCookiesButton());

        loginPage.clickFunction(loginPage.getBewerbungsProfil());

        List<List<String>> list = ExcelUtilities.getListData("src/test/java/resources/LoginData.xlsx",
                "Page1",2);

        loginPage.sendKeysFunction(loginPage.getBenutzerName(), list.get(0).get(0));
        loginPage.sendKeysFunction(loginPage.getPasswort(), list.get(0).get(1));
        loginPage.clickFunction(loginPage.getLoginButton());

    }

    @Then("^User should login successfully$")
    public void user_should_login_successfully() {
    loginPage.verifyContainsText(loginPage.getContentBox(), "successfully");

    }

}
