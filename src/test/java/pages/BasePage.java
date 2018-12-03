package pages;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BasePage {
    protected WebDriver webDriver;

    /**
     * Initialize web elements for different pages.
     * @param webDriver - WebDriver with Google Chrome
     */
    protected void initializationWebElements(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(this.webDriver,this);
    }

    /**
     * Make page screenshots
     * @param screenshotName - choose name for screenshot
     * @param webDriver - WebDriver with Google Chrome
     * @return the path where the screenshot will be saved
     * @throws IOException - important part for getScreenshot method
     */
    protected String getScreenshot (String screenshotName, WebDriver webDriver) throws IOException {
        DateFormat dateformate = new SimpleDateFormat("dd-mm-yy-hh-mm-ss");
        Date date = new Date();
        String currentdate = dateformate.format(date);
        String imageName =screenshotName+currentdate;
        TakesScreenshot ts=(TakesScreenshot)webDriver;
        File source=ts.getScreenshotAs(OutputType.FILE);
        String location =System.getProperty("user.dir")+"\\testOutput\\screenshot\\"+imageName+".png";
        File screenshotLocation =new File (location);
        FileHandler.copy(source, screenshotLocation);
        return location;

    }

    /**
     * waiting for a request for a certain period of time
     * @param webElement - WebElement with different web elements
     */
    protected void waitUntilElementIsClickable(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(webDriver,10);
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }
}
