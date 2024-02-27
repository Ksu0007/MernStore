package pages;

import core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SellWithUsPage extends BasePage {
    @FindBy(xpath = "//h3[text()='Become A MERN Store Seller!']")
    private WebElement header;

    public String getHeader() {return header.getText();}

    public SellWithUsPage() {
        PageFactory.initElements(driver, this);
    }
}
