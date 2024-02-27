package pages;

import core.BasePage;
import helpers.TestValues;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MainPage extends BasePage {

    static {
        System.out.println("URL: " + TestValues.URL);
    }

    @FindBy(xpath = "//h1[@class='logo']")
    private WebElement logo;

    @FindBy(xpath = "//*[@id=\"root\"]/div/footer/div/div[1]/div[2]/div[2]/ul/li[1]/a")
    private WebElement contactUsLink;
    @FindBy(xpath = "//*[@id=\"root\"]/div/footer/div/div[1]/div[2]/div[2]/ul/li[2]/a")
    private WebElement sellWithUsLink;
    @FindBy(xpath = "//body[1]/div[1]/div[1]/footer[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[3]/a[1]")
    private WebElement shippingLink;

    //customer service section
    @FindBy(xpath = "//h3[@class='text-uppercase']")
    private WebElement customerServiceHeader;
    @FindBy(xpath = "//div[@class='footer-content']/div[1]//a[@href='/contact']")
    private List<WebElement> customerService;
    // elements in Customer Service

    @FindBy(xpath = "//div[@class='footer-content']/div[1]//a[@href='/contact']")
    private WebElement contactUsServiceLink;
    @FindBy (xpath = "//div[@class='footer-content']/div[1]//a[@href='/sell']")
    private WebElement sellServiceLink;



    public MainPage() {
        driver.get(TestValues.URL);
        PageFactory.initElements(driver, this);
    }

    public String getCustomerServiceHeader() {
        return customerServiceHeader.getText();
    }
    public WebElement getContactUsServiceLink() {
        return contactUsServiceLink;
    }

    public ContactUsPage openContactUsPage() {
        contactUsServiceLink.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return new ContactUsPage();
    }
    public SellWithUsPage openSellWithUsPage(){
        sellServiceLink.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return new SellWithUsPage();
    }
}
