package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends AbstractPage {
    private final Logger logger = LogManager.getRootLogger();
    private final String BASE_URL = "https://ru.airbnb.com/";

    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    @Override
    public void openPage()
    {
        driver.navigate().to(BASE_URL);
    }
}
