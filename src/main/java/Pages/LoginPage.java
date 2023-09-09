package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase{
    By emailField = By.id("user-name");
    By passwordField = By.id("password");
    By loginButton = By.id("login-button");
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void setEmailField(){
        setElementText(emailField,"standard_user");
    }
    public void setPasswordField(){
        setElementText(passwordField,"secret_sauce");
    }
    public void clickOnLogin(){
        clickOnElement(loginButton);
    }
}
