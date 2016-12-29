import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import steps.Steps;

public class TestAutomation {
    private Steps steps;
    private final String USERNAME = "testepam2017@gmail.com";
    private final String PASSWORD = "testAutomation";

    @BeforeMethod(description = "Init browser")
    public void setUp()
    {
        steps = new Steps();
        steps.initBrowser();
    }
    @Test(description = "Login to airbnb")
    public void oneCanLogin()
    {
        steps.login(USERNAME, PASSWORD);
        Assert.assertTrue(steps.isLoggedIn());
    }
    @Test(description = "Change language")
    public void oneCanChangeLanguage() throws InterruptedException {
        steps.login(USERNAME, PASSWORD);
        Thread.sleep(1000);
        steps.changeLang();
        Assert.assertTrue(steps.isLangChanged());
    }
    @Test(description = "Add place to faves")
    public void oneCanAddFave() throws InterruptedException {
        steps.login(USERNAME, PASSWORD);
        Thread.sleep(1000);
        steps.addFave();
    }
    @Test(description = "Open messages")
    public void oneCanOpenMessages() throws InterruptedException {
        steps.login(USERNAME, PASSWORD);
        Thread.sleep(1000);
        steps.openMess();
        Assert.assertTrue(steps.isMessagesOpened());
    }
    @AfterMethod(description = "Stop Browser")
    public void stopBrowser()
    { steps.closeDriver(); }
}
