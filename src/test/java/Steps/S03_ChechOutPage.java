package Steps;

import Base.TestBase;
import Pages.CheckOutPage;
import org.testng.annotations.Test;

public class S03_ChechOutPage extends TestBase {
    CheckOutPage CheckOutPageObject;
@Test
    public void TestOne(){
    CheckOutPageObject = new CheckOutPage(driver);
    CheckOutPageObject.setFirstName();
    CheckOutPageObject.setLastName();
    CheckOutPageObject.setPostalCode();
    CheckOutPageObject.clickOnContinueButton();
    CheckOutPageObject.clickOnFinishButton();
    CheckOutPageObject.clickOnMenuBar();
    CheckOutPageObject.clickOnLogoutButton();
}
}
