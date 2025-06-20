package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Eeki_dev_Testing_Page {
    private WebDriver driver;
    private WebDriverWait wait;

    // Constructor
    public Eeki_dev_Testing_Page(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Harvesting\"]")
    private WebElement HarvestingTest;

    @FindBy(xpath="//android.view.ViewGroup[@content-desc=\"Media Moisture\"]")
    private  WebElement MediaMoistureTest;

    @FindBy(xpath="//android.view.ViewGroup[@content-desc=\"\uDB83\uDE62, \uDB81\uDC15, Specimen\"]")
    private WebElement SpecimenTest;

    @FindBy(xpath="//android.widget.TextView[@text=\"\uDB80\uDC4D\"]")
    private WebElement Backbutton;
/*
dome home = "//android.view.ViewGroup[@content-desc="Dome"]/android.view.ViewGroup"
    text home="//android.widget.TextView[@text=\"Production Data Collection\"]"
            text specimen="//android.widget.TextView[@text=\"Specimen\"]"
submitbtn ="//android.view.ViewGroup[@content-desc="Submitted"]/android.view.ViewGroup"

add+="//android.view.ViewGroup[@resource-id="add-fab"]"

    addspectext="//android.widget.TextView[@text="Add Specimen"]"

    dometextbox="//android.widget.EditText[@resource-id="dome-0-0"]"

    Linetextbox="//android.widget.EditText[@resource-id="line-0-1"]"

    settextbox="//android.widget.EditText[@resource-id="set-0-2"]"
    chambertextbox="//android.widget.EditText[@resource-id="chamber-0-3"]"
    positiontextbox="//android.widget.EditText[@resource-id="position-0-4"]"
    cancelbtn="(//android.view.ViewGroup[@resource-id="button-container"])[1]"
    submitbtninspec="(//android.view.ViewGroup[@resource-id="button-container"])[2]"

    mandorty="//android.widget.TextView[@text="Dome is required"]"
    invaliddata="//android.widget.TextView[@text="Line must not contain special characters or spaces"]"
    crossbtninspecdetails="(//android.widget.Button[@resource-id="icon-button"])[1]"
    nextbtn="//android.widget.TextView[@text="Next"]"
    previousbtn="//android.widget.TextView[@text="Previous"]"




    Addmediatext="//android.widget.TextView[@text="Add Media Moisture"]"
    mediamoisturetext="//android.widget.TextView[@text="Media Moisture"]"
    sectiontextbox="//android.widget.EditText[@resource-id="section-0-1"]"
    ectextbox="//android.widget.EditText[@resource-id="ec-0-2"]"
    moisturetextbox="//android.widget.EditText[@resource-id="moisture-0-3"]"
    temptextbox="//android.widget.EditText[@resource-id="temperature-0-4"]"
*/



    public void clickOnHarvesting() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(HarvestingTest));
        HarvestingTest.click();
    }

    public void backmethod(){
        Backbutton.click();
    }
    public void clickMediaMoisture() {
        MediaMoistureTest.click();
    }

    public void clickSpecimen() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(SpecimenTest));
        SpecimenTest.click();
    }

}
