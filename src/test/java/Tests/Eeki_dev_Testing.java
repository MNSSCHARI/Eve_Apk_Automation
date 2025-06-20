package Tests;

import UtilityMethods.ScreenshotListener;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.BaseTest;
import pages.Eeki_dev_Testing_Page;

@Listeners(ScreenshotListener.class)
public class Eeki_dev_Testing extends BaseTest {
     // Attach the listener to capture screenshots on failure
private Eeki_dev_Testing_Page eekiDevTestingPage;

        @BeforeMethod
        public void setUpLoginClass() {
            // Initialize PayCioPage
            eekiDevTestingPage = new Eeki_dev_Testing_Page(driver);
            ScreenshotListener.driver = driver;

        }


        @Test(priority = 1)
        public void loginScenario() throws InterruptedException {
            eekiDevTestingPage.clickOnHarvesting();
            eekiDevTestingPage.backmethod();

            eekiDevTestingPage.clickMediaMoisture();
            eekiDevTestingPage.backmethod();

            eekiDevTestingPage.clickSpecimen();
            eekiDevTestingPage.backmethod();


        }
}
