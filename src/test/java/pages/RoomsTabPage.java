package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
import java.util.ArrayList;

public class RoomsTabPage extends BasePage {

    @FindBy(xpath = "//div[3]/div[4]/button[1]")
    private WebElement bookNowButton;

    @FindBy(xpath = "//div/ul/li[3]/a[@class='item-link']")
    private WebElement roomsTab;

    /**
     * Initialize web elements on rooms tab page.
     * @param webDriver - WebDriver with Google Chrome
     */
    public RoomsTabPage(WebDriver webDriver) {
        initializationWebElements(webDriver);
    }

    /**
     * check if the rooms tab page is loaded
     * @return currentUrl
     */
    public boolean roomsTabIsLoaded() {
        return webDriver.getCurrentUrl().equals("https://knickerbocker-hotel-new-york.nochi.com/#/roomstab");
    }

    /**
     * Wait until bookNowButton is clickable
     * Click on bookNowButton
     * @return RoomBuyPage object
     * @throws IOException - important part for screenshot method
     */
    public RoomBuyPage clickBookNowButton() throws IOException {
        waitUntilElementIsClickable(bookNowButton);
        bookNowButton.click();
        return new RoomBuyPage(webDriver);
    }

    /**
     * close tab
     * switch to another tab
     */
    public void changeTab() {
        ArrayList<String> tabs2 = new ArrayList<String> (webDriver.getWindowHandles());
        webDriver.close();
        webDriver.switchTo().window(tabs2.get(1));
    }
}
