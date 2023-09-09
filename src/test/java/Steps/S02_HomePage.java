package Steps;

import Base.TestBase;
import Pages.HomePage;
import org.testng.annotations.Test;

public class S02_HomePage extends TestBase {
    HomePage HomePageObject;
@Test
    public void testOne(){
    HomePageObject = new HomePage(driver);
    HomePageObject.clickOnAddToCard();
    HomePageObject.clickOnMarketIcon();
    HomePageObject.clickOnCheckOutButton();
}
}
