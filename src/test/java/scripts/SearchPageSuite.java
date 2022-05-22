package scripts;

import ExtControllers.ReportController;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchedPage;

public class SearchPageSuite extends TestInitializer{

    @Test
    public void verifySearchedProduct(){
        String testName = new Throwable().getStackTrace()[0].getMethodName();
        WebDriver driver = testBuilder(testName);
        try {
            HomePage.searchForProduct(driver, testData.get("SearchValue"));
            ReportController.logStatusToReport(test, "INFO", "Searched for product: " + testData.get("SearchValue"));
            Assert.assertTrue(SearchedPage.verifySearchedPage(driver, testData.get("SearchValue")));
            ReportController.logStatusToReport(test, "INFO", "Verified searched page with value as: " + testData.get("SearchValue"));
            Assert.assertTrue(SearchedPage.verifyBreadCrumbsAvailability(driver, testData.get("SearchValue")));
            ReportController.logStatusToReport(test, "INFO", "Verified " + testData.get("SearchValue") + " in displayed breadcrumbs");
            Assert.assertTrue(SearchedPage.verifySearchedResultTitle(driver, testData.get("SearchValue")));
            ReportController.logStatusToReport(test, "INFO", "Verified " + testData.get("SearchValue") + " as result page title");
            ReportController.logStatusToReport(test, "PASS", "TEST PASSED");
        } catch (Exception e){
            ReportController.logTestAsFailed(driver, test, testName, e.getMessage());
            e.printStackTrace();
        }
        finally {
            if(driver!=null)
                driver.close();
        }
    }
}
