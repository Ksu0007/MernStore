package pages;

import core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SellWithUsPage extends BasePage {
    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div/div/h3")
    private WebElement header;

    public String getHeader() {return header.getText();}

    public SellWithUsPage() {
        PageFactory.initElements(driver, this);
    }
}
