package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase{
    By AddToCard = By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']");
    By MarketIcon = By.xpath("//div[@id='shopping_cart_container']");
    By CheckOutButton = By.xpath("//button[@id='checkout']");
    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void clickOnAddToCard(){clickOnElement(AddToCard);}
    public void clickOnMarketIcon(){clickOnElement(MarketIcon);}
    public void clickOnCheckOutButton(){clickOnElement(CheckOutButton);}


}
