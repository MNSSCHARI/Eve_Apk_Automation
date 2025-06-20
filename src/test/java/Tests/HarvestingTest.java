package Tests;

import UtilityMethods.ScreenshotListener;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.BaseTest;
import pages.HarvestingTestsPage;

@Listeners(ScreenshotListener.class)
public class HarvestingTest extends BaseTest{
        // Attach the listener to capture screenshots on failure
        private HarvestingTestsPage haverestingscreen;
        @BeforeMethod
        public void setUpharvestclass() {
            // Initialize Harvesting
            haverestingscreen = new HarvestingTestsPage(driver);
            ScreenshotListener.driver = driver;
        }
    @Test(priority = 1)
        public void test1() throws InterruptedException {
for (int i=0;i<=50;i++) {
//        haverestingscreen.wait();
    haverestingscreen.Harvesting();
    haverestingscreen.ClickAddbtn();
    haverestingscreen.AddingAtoBRowinHarvesting();

    ScrollToEnd();
//        ScrollToEnd();

    haverestingscreen.AddingCtoDRowinHarvesting();
    haverestingscreen.Submitfeededharvest();
    haverestingscreen.Backarrow();
    Thread.sleep(500);
    System.out.println(i +" times data created");

}
        }
    }

