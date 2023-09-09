package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage extends PageBase{
    By FirstName = By.id("first-name");
    By LastName = By.id("last-name");
    By PostalCode = By.id("postal-code");
    By ContinueButton = By.id("continue");
    By FinishButton = By.xpath("//button[@id='finish']");
    By MenuBar = By.xpath("//button[@id='react-burger-menu-btn']");
    By LogoutButton = By.xpath("//a[@id='logout_sidebar_link']");
    public CheckOutPage(WebDriver driver) {
        super(driver);
    }
    public void setFirstName(){
    setElementText(FirstName,"Omar");
    }
    public void setLastName(){
        setElementText(LastName,"adel");
    }
    public void setPostalCode(){
        setElementText(PostalCode,"0355");
    }
    public void clickOnContinueButton(){
        clickOnElement(ContinueButton);
    }
    public void clickOnFinishButton(){
        clickOnElement(FinishButton);
    }
    public void clickOnMenuBar(){
        clickOnElement(MenuBar);
    }
    public void clickOnLogoutButton(){
        clickOnElement(LogoutButton);
    }
}
