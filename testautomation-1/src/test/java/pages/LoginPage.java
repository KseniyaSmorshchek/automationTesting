package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractPage {
    private final Logger logger = LogManager.getRootLogger();
    private final String BASE_URL = "https://ru.airbnb.com/login";

    @FindBy(id = "signin_email")
    private WebElement inputEmail;

    @FindBy(id = "signin_password")
    private WebElement inputPassword;

    @FindBy(id = "user-login-btn")
    private WebElement submitButton;

    @FindBy(xpath = "//*[@id=\"new-header\"]/div[2]/a/div/img")
    private WebElement profileLink;

    @FindBy(xpath = "/html/body/main/div[3]/div/div[1]/div[1]/div[2]/h2")
    private WebElement titleName;

    @FindBy(id = "language-selector")
    private WebElement langSelect;

    @FindBy(xpath = "/html/body/div[6]/div/footer/div[1]/div[1]/div[1]/div/div/div/div/select/option[6]")
    private WebElement engButton;

    @FindBy(xpath = "//*[@id=\"site-content\"]/div[3]/div/div[2]/div[2]/div[1]")
    private WebElement engTitle;

    @FindBy(xpath = "//*[@id=\"site-content\"]/div/div/div[2]/div[2]/div/div/div[2]/div[3]/div/div/div/div[1]/div/div[1]/a/div/div[1]/div/div/div/div/div")
    private WebElement placeImg;

    @FindBy(xpath = "//*[@id=\"summary\"]/div/div/div[2]/div[4]/div/div[4]/div[1]/div/div/label/span[2]/span")
    private WebElement wishlistBut;

    @FindBy(xpath = "//*[@id=\"new-header\"]/div[1]/a/i[1]")
    private WebElement mainpageBut;

    @FindBy(xpath = "/html/body/div[3]/header/div[8]/a/div/span")
    private WebElement messButton;

    @FindBy(xpath = "//*[@id=\"inbox-container\"]/div[2]/div/div/div/h3/span")
    private WebElement messTitle;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
    @Override
    public void openPage()
    {
        driver.navigate().to(BASE_URL);
    }

    public void login(String username, String password)
    {
        inputEmail.sendKeys(username);
        inputPassword.sendKeys(password);
        submitButton.click();
    }
    public String getTitleName()
    {
        profileLink.click();
        return titleName.getText();
    }
    public void changeLang()
    {
        langSelect.click();
        engButton.click();
    }
    public String getEngTitle()
    {
        return engTitle.getText();
    }
    public void addFave()
    {
        mainpageBut.click();
        placeImg.click();
        wishlistBut.click();
    }
    public void openMessages()
    {
        messButton.click();
    }
    public String getMessTitle()
    {
        return messTitle.getText();
    }
}
