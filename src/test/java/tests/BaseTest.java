package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.RoomPage;

public class BaseTest {
    private WebDriver webDriver;
    RoomPage roomPage;

    @BeforeMethod
    protected void beforeMethod() {
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        roomPage = new RoomPage(webDriver);
        roomPage.openRoomPage();
    }

    @AfterMethod
    protected void afterMethod() {
        webDriver.quit();
    }
}
