package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RoomBuyPage;
import pages.RoomsTabPage;

import java.io.IOException;

public class RoomTest extends BaseTest {

    @Test
    public void clickOnTab() throws IOException {
        roomPage.clickOnTabs();
    }

    @Test
    public void checkCheckInDay() {
        roomPage.chooseDates();
        Assert.assertEquals(roomPage.messageCheckInDay(),"24","Check in day is not correct.");
    }

    @Test
    public void checkCheckInMonth() {
        roomPage.chooseDates();
        Assert.assertEquals(roomPage.messageCheckInMonth(),"Январь","Check in month is not correct.");
    }

    @Test
    public void checkCheckInYear() {
        roomPage.chooseDates();
        Assert.assertEquals(roomPage.messageCheckInYear(),"19","Check in year is not correct.");
    }

    @Test
    public void checkCheckOutDay() {
        roomPage.chooseDates();
        Assert.assertEquals(roomPage.messageCheckOutDay(),"25","Check out day is not correct.");

    }

    @Test
    public void checkCheckOutMonth() {
        roomPage.chooseDates();
        Assert.assertEquals(roomPage.messageCheckOutMonth(),"Январь","Check out month is not correct.");
    }

    @Test
    public void checkCheckOutYear() {
        roomPage.chooseDates();
        Assert.assertEquals(roomPage.messageCheckOutYear(),"19","Check out year is not correct.");
    }

    @Test
    public void checkSumGuests() {
        roomPage.chooseNumberOfGuestsAndChildren();
        Assert.assertEquals(roomPage.messageSumGuests(),"5","Sum guests is not correct.");
        Assert.assertEquals(roomPage.messageSumRooms(),"1 Номер","Sum rooms is not correct.");
    }

    @Test
    public void checkSumRooms() {
        roomPage.chooseNumberOfGuestsAndChildren();
        Assert.assertEquals(roomPage.messageSumRooms(),"1 Номер","Sum rooms is not correct.");
    }

    @Test
    public void checkTabRoomOpened() throws InterruptedException {
        roomPage.chooseDatesAndNumberOfGuests();
        RoomsTabPage roomsTabPage = roomPage.clickGetPricesButton();
        Assert.assertTrue(roomsTabPage.roomsTabIsLoaded(),"Rooms tab is not loaded.");
    }

    @Test
    public void checkCheckInDayInGetNewRoomPage() throws InterruptedException, IOException {
        roomPage.chooseDatesAndNumberOfGuests();
        RoomsTabPage roomsTabPage = roomPage.clickGetPricesButton();
        roomsTabPage.changeTab();
        Assert.assertTrue(roomsTabPage.roomsTabIsLoaded(),"Rooms tab is not loaded.");
        RoomBuyPage roomBuyPage = roomsTabPage.clickBookNowButton();
        Assert.assertTrue(roomBuyPage.roomBuyPageIsLoaded(),"Room buy page is not loaded.");
        Assert.assertEquals(roomBuyPage.messageCheckInDay(),"24","Check in day is not correct.");
    }

    @Test
    public void checkCheckOutDayInGetNewRoomPage() throws InterruptedException, IOException {
        roomPage.chooseDatesAndNumberOfGuests();
        RoomsTabPage roomsTabPage = roomPage.clickGetPricesButton();
        roomsTabPage.changeTab();
        Assert.assertTrue(roomsTabPage.roomsTabIsLoaded(),"Rooms tab is not loaded.");
        RoomBuyPage roomBuyPage = roomsTabPage.clickBookNowButton();
        Assert.assertTrue(roomBuyPage.roomBuyPageIsLoaded(),"Room buy page is not loaded.");
        Assert.assertEquals(roomBuyPage.messageCheckOutDay(),"25","Check out day is not correct.");
    }

    @Test
    public void checkCheckInMonthAndYearInGetNewRoomPage() throws InterruptedException, IOException {
        roomPage.chooseDatesAndNumberOfGuests();
        RoomsTabPage roomsTabPage = roomPage.clickGetPricesButton();
        roomsTabPage.changeTab();
        Assert.assertTrue(roomsTabPage.roomsTabIsLoaded(),"Rooms tab is not loaded.");
        RoomBuyPage roomBuyPage = roomsTabPage.clickBookNowButton();
        Assert.assertTrue(roomBuyPage.roomBuyPageIsLoaded(),"Room buy page is not loaded.");
        Assert.assertEquals(roomBuyPage.messageCheckInMonthAndYear(),"Янв '19Чт","Check in month and year is not correct.");
    }

    @Test
    public void checkCheckOutMonthAndYearInGetNewRoomPage() throws InterruptedException, IOException {
        roomPage.chooseDatesAndNumberOfGuests();
        RoomsTabPage roomsTabPage = roomPage.clickGetPricesButton();
        roomsTabPage.changeTab();
        Assert.assertTrue(roomsTabPage.roomsTabIsLoaded(),"Rooms tab is not loaded.");
        RoomBuyPage roomBuyPage = roomsTabPage.clickBookNowButton();
        Assert.assertTrue(roomBuyPage.roomBuyPageIsLoaded(),"Room buy page is not loaded.");
        Assert.assertEquals(roomBuyPage.messageCheckOutMonthAndYear(),"Янв '19Пт","Check out month and year is not correct.");
    }

    @Test
    public void checkSumGuestsInGetNewRoomPage() throws InterruptedException, IOException {
        roomPage.chooseDatesAndNumberOfGuests();
        RoomsTabPage roomsTabPage = roomPage.clickGetPricesButton();
        roomsTabPage.changeTab();
        Assert.assertTrue(roomsTabPage.roomsTabIsLoaded(),"Rooms tab is not loaded.");
        RoomBuyPage roomBuyPage = roomsTabPage.clickBookNowButton();
        Assert.assertTrue(roomBuyPage.roomBuyPageIsLoaded(),"Room buy page is not loaded.");
        Assert.assertEquals(roomBuyPage.sumGuests(),5,"The number of guests is wrong.");
    }
}
