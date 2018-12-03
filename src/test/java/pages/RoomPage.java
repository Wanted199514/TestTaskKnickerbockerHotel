package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class RoomPage extends BasePage {

    @FindBy(xpath = "//div/ul/li[1]/a[@class='item-link']")
    private WebElement overviewTab;

    @FindBy(xpath = "//div[1]/ul/li[2]/a[@class='item-link']")
    private WebElement facilitiesTab;

    @FindBy(xpath = "//div[1]/ul/li[3]/a[@class='item-link']")
    private WebElement roomsTab;

    @FindBy(xpath = "//div[1]/ul/li[4]/a[@class='item-link']")
    private WebElement locationTab;

    @FindBy(xpath = "//div[1]/ul/li[5]/a[@class='item-link']")
    private WebElement reviewsTab;

    @FindBy(xpath = "//div/div[1][contains(@class,'check-date')]/div")
    private WebElement checkInDate;

    @FindBy(xpath = "//table[@class='month2']/tbody/tr[4]/td[4]")
    private WebElement january24;

    @FindBy(xpath = "//table[@class='month2']/tbody/tr[4]/td[5]")
    private WebElement january25;

    @FindBy(xpath = "//div/div/div/span[contains(@class,'guest-rooms')]")
    private WebElement roomsAndGuests;

    @FindBy(xpath = "//div[@class='adults-wrapper']/div/div[3]")
    private WebElement addAdultGuest;

    @FindBy(xpath = "//div[@class='children-wrapper']/div/div[3]")
    private WebElement addChildGuest;

    @FindBy(xpath = "//div/span[contains(@class,'guest-rooms')]/span/span")
    private WebElement sumGuests;

    @FindBy(xpath = "//div/span[contains(@class,'guest-rooms')]/span[2]")
    private WebElement sumRooms;

    @FindBy(xpath = "//div/select[1]")
    private WebElement minChildAge;

    @FindBy(xpath = "//div/select[2]")
    private WebElement maxChildAge;

    @FindBy(xpath = "//div[contains(@class,'basic-input js-basic-field')]//span[@class='check-day']")
    private WebElement checkInDay;

    @FindBy(xpath = "//div[contains(@class,'basic-input js-basic-field')]//span[@class='check-month']")
    private WebElement checkInMonth;

    @FindBy(xpath = "//div[contains(@class,'basic-input js-basic-field')]//span[@class='check-year']")
    private WebElement checkInYear;

    @FindBy(xpath = "//div[contains(@class,'check-input basic-input js-d')]//span[@class='check-day']")
    private WebElement checkOutDay;

    @FindBy(xpath = "//div[contains(@class,'check-input basic-input js-d')]//span[@class='check-month']")
    private WebElement checkOutMonth;

    @FindBy(xpath = "//div[contains(@class,'check-input basic-input js-d')]//span[@class='check-year']")
    private WebElement checkOutYear;

    @FindBy(xpath = "//*[@id='container']/div/div/div/div[5]/form/div[1]/div[2]/div/div[2]/button[1]")
    private WebElement getPricesButton;

    /**
     * Initialize web elements on room page.
     * @param webDriver - WebDriver with Google Chrome
     */
    public RoomPage(WebDriver webDriver) {
        initializationWebElements(webDriver);
    }

    /**
     * Open Room page
     */
    public void openRoomPage() {
        webDriver.get("https://knickerbocker-hotel-new-york.nochi.com/?btest=119");
    }

    /**
     * Click on all tabs and make screenshots
     * @throws IOException - important part for getScreenshot method
     */
    public void clickOnTabs() throws IOException {
        overviewTab.click();

        waitUntilElementIsClickable(facilitiesTab);
        getScreenshot("clickOnTabOverview", webDriver);
        facilitiesTab.click();

        waitUntilElementIsClickable(roomsTab);
        getScreenshot("clickOnTabFacilities", webDriver);
        roomsTab.click();

        waitUntilElementIsClickable(locationTab);
        getScreenshot("clickOnTabRooms", webDriver);
        locationTab.click();

        waitUntilElementIsClickable(reviewsTab);
        getScreenshot("clickOnTabLocation", webDriver);
        reviewsTab.click();

        getScreenshot("clickOnTabReviews", webDriver);
    }

    /**
     * Choose dates 24.01.2019 and 25.01.2019
     */
    public void chooseDates() {
        waitUntilElementIsClickable(checkInDate);
        checkInDate.click();
        waitUntilElementIsClickable(january24);
        january24.click();
        waitUntilElementIsClickable(january25);
        january25.click();
    }

    /**
     * Choose number of guests and children.
     */
    public void chooseNumberOfGuestsAndChildren() {
        waitUntilElementIsClickable(roomsAndGuests);
        roomsAndGuests.click();
        waitUntilElementIsClickable(addAdultGuest);
        addAdultGuest.click();
        for (int i = 0; i < 2; i++) {
            waitUntilElementIsClickable(addChildGuest);
            addChildGuest.click();
        }
        minChildAge.click();
        minChildAge.sendKeys("2");

        maxChildAge.click();
        maxChildAge.sendKeys("10");
        maxChildAge.click();

        roomsAndGuests.click();
    }

    /**
     * @return sumGuests text
     */
    public String messageSumGuests() {
        return sumGuests.getText();
    }

    /**
     * @return sumRooms text
     */
    public String messageSumRooms() {
        return sumRooms.getText();
    }

    /**
     * @return checkInDay text
     */
    public String messageCheckInDay() {
        return checkInDay.getText();
    }

    /**
     * @return checkInMonth text
     */
    public String messageCheckInMonth() {
        return checkInMonth.getText();
    }

    /**
     * @return checkInYear text
     */
    public String messageCheckInYear() {
        return checkInYear.getText();
    }

    /**
     * @return checkOutDay text
     */
    public String messageCheckOutDay() {
        return checkOutDay.getText();
    }

    /**
     * @return checkOutMonth text
     */
    public String messageCheckOutMonth() {
        return checkOutMonth.getText();
    }

    /**
     * @return checkOutYear text
     */
    public String messageCheckOutYear() {
        return checkOutYear.getText();
    }

    /**
     * wait until getPricesButton is clickable
     * Click on getPricesButton
     * @return RoomsTabPage object
     */
    public RoomsTabPage clickGetPricesButton() {
        waitUntilElementIsClickable(getPricesButton);
        getPricesButton.click();
        return new RoomsTabPage(webDriver);
    }

    /**
     * Choose dates
     * Wait 0.5 seconds
     * Choose number of guests and children
     */
    public void chooseDatesAndNumberOfGuests() {
        chooseDates();
        waitUntilElementIsClickable(roomsAndGuests);
        chooseNumberOfGuestsAndChildren();
    }
}
