package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends AbstractPage {
    private final Logger logger = LogManager.getRootLogger();
    private final String BASE_URL = "https://relax.by/";

    @FindBy(xpath = "/html/body/div[3]/div/div/div[3]/div[1]/div/div[2]/div/a[2]")
    private WebElement restaurantIcon;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[3]/div/div[1]/div[1]/div/h1")
    private WebElement title;

    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    @Override
    public void openPage()
    {
        driver.navigate().to(BASE_URL);
    }

    public void openRestaurants()
    {
        restaurantIcon.click();
    }
    public String getTitle()
    {
        return title.getText();
    }
}
