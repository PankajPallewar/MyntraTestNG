package scripts;

import ExtControllers.ReportController;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageSuite extends TestInitializer {

    @Test
    public void verifyHomePageMenus(){
        String testName = new Throwable().getStackTrace()[0].getMethodName();
        WebDriver driver = testBuilder(testName);
        try {
            Assert.assertTrue(HomePage.verifyMenOptionAvailability(driver));
            ReportController.logStatusToReport(test, "INFO", "Verified availability of 'Men' option");
            Assert.assertTrue(HomePage.verifyWomenOptionAvailability(driver));
            ReportController.logStatusToReport(test, "INFO", "Verified availability of 'Women' option");
            Assert.assertTrue(HomePage.verifyKidsOptionAvailability(driver));
            ReportController.logStatusToReport(test, "INFO", "Verified availability of 'Kids' option");
            Assert.assertTrue(HomePage.verifyBeautyOptionAvailability(driver));
            ReportController.logStatusToReport(test, "INFO", "Verified availability of 'Beauty' option");
            Assert.assertTrue(HomePage.verifyHomeAndLivingOptionAvailability(driver));
            ReportController.logStatusToReport(test, "INFO", "Verified availability of 'Home and Living' option");
            Assert.assertTrue(HomePage.verifyStudioOptionAvailability(driver));
            ReportController.logStatusToReport(test, "INFO", "Verified availability of 'Studio' option");
            ReportController.logStatusToReport(test, "PASS", "TEST PASSED");
        } catch (Exception e){
            ReportController.logTestAsFailed(driver, test, testName, e.getMessage());
            e.printStackTrace();
        }
        finally {
            if (driver!=null)
                driver.close();
        }
    }
}
