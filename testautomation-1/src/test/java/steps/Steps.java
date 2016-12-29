package steps;

import Driver.DriverWorker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class Steps {
    private WebDriver driver;

    private final Logger logger = LogManager.getRootLogger();

    public void initBrowser()
    {   driver = DriverWorker.getDriver(); }

    public void closeDriver()
    {
        DriverWorker.closeDriver();
    }
    public void login(String username, String password)
    {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openPage();
        loginPage.login(username, password);
    }
    public boolean isLoggedIn()
    {
        LoginPage loginPage = new LoginPage(driver);
        return loginPage.getTitleName().trim().equals("Kseniya");
    }
    public void changeLang()
    {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.changeLang();
    }
    public boolean isLangChanged()
    {
        LoginPage loginPage = new LoginPage(driver);
        return (loginPage.getEngTitle().trim().equals("Notifications"));
    }
    public void addFave()
    {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.addFave();
    }
    public void openMess()
    {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.openMessages();
    }
    public boolean isMessagesOpened()
    {
        LoginPage loginPage = new LoginPage(driver);
        return loginPage.getMessTitle().trim().equals("Сообщений пока нет.");
    }
}
