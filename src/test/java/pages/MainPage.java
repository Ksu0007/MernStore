package pages;

import core.BasePage;
import helpers.TestValues;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainPage extends BasePage {

    static {
        System.out.println("URL: " + TestValues.URL);
    }

    @FindBy(xpath = "//*[@class=\"logo\"]")
    private WebElement logo;

    @FindBy(xpath = "//*[@id=\"root\"]/div/footer/div/div[1]/div[2]/div[2]/ul/li[1]/a")
    private WebElement contactUsLink;
    @FindBy(xpath = "//*[@id=\"root\"]/div/footer/div/div[1]/div[2]/div[2]/ul/li[2]/a")
    private WebElement sellWithUsLink;
    @FindBy(xpath = "//body[1]/div[1]/div[1]/footer[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[3]/a[1]")
    private WebElement shippingLink;

    //customer service section
    @FindBy(xpath = "//*[@id=\"root\"]/div/footer/div/div[1]/div[1]/div[1]/h3")
    private WebElement customerServiceHeader;
    @FindBy(xpath = "//*[@id=\"root\"]/div/footer/div/div[1]/div[1]/div[2]")
    private List<WebElement> customerService;
    // elements in Customer Service

    @FindBy(xpath = "//*[@id=\"root\"]/div/footer/div/div[1]/div[1]/div[2]/ul/li[1]")
    private WebElement contactUsServiceLink;
    @FindBy (xpath = "//*[@id=\"root\"]/div/footer/div/div[1]/div[1]/div[2]/ul/li[2]")
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
        return new ContactUsPage();
    }
    public SellWithUsPage openSellWithUsPage(){
        sellServiceLink.click();
        return new SellWithUsPage();
    }
}
