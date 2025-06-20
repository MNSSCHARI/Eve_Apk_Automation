package UtilityMethods;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class ScreenshotListener implements ITestListener {

    public static WebDriver driver;

    @Override
    public void onTestFailure(ITestResult result) {
        // Take a screenshot when a test fails
        if (driver != null) {
            String methodName = result.getMethod().getMethodName(); // Get the failed method name

            // Define the screenshots directory
            String screenshotsDir = System.getProperty("user.dir") + "/screenshots";

            // Ensure the screenshots directory exists
            File directory = new File(screenshotsDir);
            if (!directory.exists()) {
                directory.mkdir(); // Create the directory if it doesn't exist
            }

            // Save the screenshot
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String screenshotPath = screenshotsDir + "/" + methodName + ".png";

            try {
                FileUtils.copyFile(screenshot, new File(screenshotPath));

                // Log the screenshot path as a clickable link in the TestNG report
                System.setProperty("org.uncommons.reportng.escape-output", "false"); // Enable HTML in logs
                System.out.println("<a href='" + screenshotPath + "' target='_blank'>Screenshot for " + methodName + "</a>");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
