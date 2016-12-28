package steps;

import driver.DriverWorker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.MainPage;

public class Steps {
    private WebDriver driver;

    private final Logger logger = LogManager.getRootLogger();

    public void initBrowser()
    {   driver = DriverWorker.getDriver(); }

    public void closeDriver()
    {
        DriverWorker.closeDriver();
    }

    public void openRestaurants()
    {
        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        mainPage.openRestaurants();
    }

    public boolean isRestaurantsOpened()
    {
        MainPage mainPage = new MainPage(driver);
        return mainPage.getTitle().trim().equals("Рестораны Минска");
    }
}
