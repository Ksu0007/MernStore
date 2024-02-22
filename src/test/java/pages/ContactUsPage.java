package pages;

import core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage extends BasePage {
    @FindBy(className = "logo")
    private WebElement logo;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div/div/h3")
    private WebElement contactPageHeader;


    public String getContactPageHeader() {
        return contactPageHeader.getText();
    }

    public ContactUsPage() {
        PageFactory.initElements(driver, this);
    }

}
