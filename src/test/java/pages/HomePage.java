package pages;

import WebControllers.ElementController;
import org.openqa.selenium.WebDriver;
import pageObjects.HomePageObjects;

public class HomePage extends HomePageObjects {

    public static boolean verifyMenOptionAvailability(WebDriver driver){
        return ElementController.isElementDisplayed(ElementController.getWebElement(driver, "XPATH", menOption));
    }

    public static boolean verifyWomenOptionAvailability(WebDriver driver){
        return ElementController.isElementDisplayed(ElementController.getWebElement(driver, "XPATH", womenOption));
    }

    public static boolean verifyKidsOptionAvailability(WebDriver driver){
        return ElementController.isElementDisplayed(ElementController.getWebElement(driver, "XPATH", kidsOption));
    }

    public static boolean verifyHomeAndLivingOptionAvailability(WebDriver driver){
        return ElementController.isElementDisplayed(ElementController.getWebElement(driver, "XPATH", homeAndLivingOption));
    }

    public static boolean verifyBeautyOptionAvailability(WebDriver driver){
        return ElementController.isElementDisplayed(ElementController.getWebElement(driver, "XPATH", beautyOption));
    }

    public static boolean verifyStudioOptionAvailability(WebDriver driver){
        return ElementController.isElementDisplayed(ElementController.getWebElement(driver, "XPATH", studioOption));
    }

    public static void searchForProduct(WebDriver driver, String value){
        ElementController.enterData(ElementController.getWebElement(driver, "XPATH", searchBox), value,true);
    }
}
