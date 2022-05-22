package pages;

import WebControllers.ElementController;
import WebControllers.WaitControllers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.SearchedPageObjects;

public class SearchedPage extends SearchedPageObjects {

    public static boolean verifySearchedPage(WebDriver driver, String searchedValue){
        try {
            WaitControllers.waitTillPageTitleLoads(driver, "Buy Roadster Shirts For Women & Men Online at Myntra");
            String[] values = searchedValue.split("-");
                WaitControllers.waitTillPageUrlLoads(driver, values[0]);
        } catch (Exception e){
            return false;
        }
        return true;
    }

    public static boolean verifyBreadCrumbsAvailability(WebDriver driver, String searchedValue){
        WebElement element = ElementController.getWebElement(driver, "XPATH", breadCrumbsValue.replace("#", searchedValue));
        WaitControllers.waitTillElementIsVisible(driver,element);
        return ElementController.isElementDisplayed(element);
    }

    public static boolean verifySearchedResultTitle(WebDriver driver, String searchedValue){
        WebElement element = ElementController.getWebElement(driver, "XPATH", searchedResultTitle.replace("#", searchedValue));
        WaitControllers.waitTillElementIsVisible(driver,element);
        return ElementController.isElementDisplayed(element);
    }
}
