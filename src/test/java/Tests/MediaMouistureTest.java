package Tests;

import UtilityMethods.ScreenshotListener;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.BaseTest;
import pages.MediaMoistureTestsPage;

@Listeners(ScreenshotListener.class)
public class MediaMouistureTest extends BaseTest{
    // Attach the listener to capture screenshots on failure
    private MediaMoistureTestsPage moisturescreen;
    @BeforeMethod
    public void setUpharvestclass() {
        // Initialize Harvesting
        moisturescreen = new MediaMoistureTestsPage(driver);
        ScreenshotListener.driver = driver;
    }
    @Test(priority = 1)
    public void test1() throws InterruptedException {




    }
}

