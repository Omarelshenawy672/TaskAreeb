import Base.TestBase;
import Steps.S01_login;
import Steps.S02_HomePage;
import Steps.S03_ChechOutPage;

public class runner extends TestBase {
    public static void main(String[] args) {
        S01_login test = new S01_login();
        test.startBrowser();
        test.testOne();
        S02_HomePage test1 = new S02_HomePage();
        test1.testOne();
        S03_ChechOutPage test2 = new S03_ChechOutPage();
        test2.TestOne();
    }

}
