package tests;

import core.BaseTest;
import helpers.TestValues;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.MainPage;
import pages.SellWithUsPage;

public class MainPageTest extends BaseTest {




    @Test
    public void openContactUsPageTest() {
        MainPage mainPage = new MainPage();
        Assert.assertEquals(mainPage.openContactUsPage().getContactPageHeader(), TestValues.ContactUs.CONTACT_PAGE_HEADER);
    }

    @Test
    public void openSellWithUsPageTest() {
        SellWithUsPage sellWithUsPage = new MainPage().openSellWithUsPage();
        Assert.assertEquals(sellWithUsPage.getHeader(), TestValues.SellWithUs.SELL_HEADER);
    }



}
