package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
import java.util.List;

public class RoomBuyPage extends BasePage {

    @FindBy(xpath = "//*[@id='container']/div[1]/ul")
    private WebElement navigationList;

    @FindBy(xpath = "//div[2]/div[1]/span[2]")
    private WebElement checkInDay;

    @FindBy(xpath = "//div[2]/div[2]/span[2]")
    private WebElement checkOutDay;

    @FindBy(xpath = "//div[2]/div[1]/span[3]")
    private WebElement checkInMonthAndYear;

    @FindBy(xpath = "//div[2]/div[2]/span[3]")
    private WebElement checkOutMonthAndYear;

    @FindBy(xpath = "//div[5]//label[1]//span[3]")
    private List<WebElement> guests;

    /**
     * Initialize web elements on room buy page.
     * Wait until navigationList is clickable.
     * Make screenshot.
     * @param webDriver - WebDriver with Google Chrome
     * @throws IOException - important part for getScreenshot method
     */
    public RoomBuyPage(WebDriver webDriver) throws IOException {
        initializationWebElements(webDriver);
        waitUntilElementIsClickable(navigationList);
        getScreenshot("roomBuyPage",webDriver);
    }

    /**
     * check if the room buy page is loaded
     * @return currentUrl, title and navigationList
     */
    public boolean roomBuyPageIsLoaded() {
        return webDriver.getCurrentUrl().contains("https://secure.booked.net/?page=book&groupID=")
                && webDriver.getTitle().contains("Забронировать отель онлайн")
                && navigationList.isDisplayed();

    }

    /**
     * @return checkInDay text
     */
    public String messageCheckInDay() {
        return checkInDay.getText();
    }

    /**
     * @return checkOutDay text
     */
    public String messageCheckOutDay() {
        return checkOutDay.getText();
    }

    /**
     * @return checkInMonthAndYear text
     */
    public String messageCheckInMonthAndYear() {
        return checkInMonthAndYear.getText();
    }

    /**
     * @return checkOutMonthAndYear text
     */
    public String messageCheckOutMonthAndYear() {
        return checkOutMonthAndYear.getText();
    }

    /**
     * @return guests number
     */
    public int sumGuests() {
        return guests.size();
    }
}
