package Steps;

import Base.TestBase;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class S01_login extends TestBase {
    LoginPage LoginPageObject;
@Test
public  void testOne(){
    LoginPageObject = new LoginPage(driver);
    LoginPageObject.setEmailField();
    LoginPageObject.setPasswordField();
    LoginPageObject.clickOnLogin();
}
}
