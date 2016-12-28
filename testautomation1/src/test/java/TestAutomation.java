import org.testng.Assert;
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

    @Test(description = "Open restaurants")
    public void oneCanOpenRestaurants()
    {
        steps.openRestaurants();
        Assert.assertTrue(steps.isRestaurantsOpened());
    }
    @AfterMethod(description = "Stop Browser")
    public void stopBrowser()
    {
        steps.closeDriver();
    }
}
