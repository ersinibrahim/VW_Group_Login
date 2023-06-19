package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class LoginPage extends Parent {


    public LoginPage() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(css = "button#CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")
    private WebElement cookiesButton;

    @FindBy(css = ".trigger>.profileLabel")
    private WebElement bewerbungsProfil;

    @FindBy(css = "input[class='inputElem aliasInput']")
    private WebElement benutzerName;

    @FindBy(css = "input[class='inputElem passInput']")
    private WebElement passwort;

    @FindBy(css = "button[class='button secondaryBtn loginBtn arrowButton']")
    private WebElement loginButton;

    @FindBy(css = "div[class='fixErrorContent']")
    private WebElement contentBox;

    public WebElement getBewerbungsProfil() {
        return bewerbungsProfil;
    }

    public WebElement getBenutzerName() {
        return benutzerName;
    }

    public WebElement getPasswort() {
        return passwort;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getCookiesButton() {
        return cookiesButton;
    }

    public WebElement getContentBox() {
        return contentBox;
    }
}
