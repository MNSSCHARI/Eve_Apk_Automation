package pages;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Collections;

public class HarvestingTestsPage {
    private WebDriver driver;
    private WebDriverWait wait;

    // Constructor
    public HarvestingTestsPage(AndroidDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Harvesting\"]")
    private WebElement Harvestingbtn;

@FindBy(xpath ="//android.view.ViewGroup[@resource-id='add-fab']")
private WebElement addrowbtn;

    @FindBy( xpath="//android.widget.EditText[@resource-id=\"line-0-1\"]")
    private WebElement lineTextbox;

    @FindBy( xpath ="//android.widget.EditText[@resource-id=\"domes-0-0\"]")
    private WebElement Dometextbox;

   @FindBy (xpath="//android.widget.TextView[@text=\"Grade A\"]")
    private WebElement gradetextA;

    @FindBy (xpath="//android.widget.TextView[@text='Harvesting']")
    private WebElement Harvestingtext;

    @FindBy (xpath="//android.widget.EditText[@resource-id='brix-value-5-0']")
    private WebElement BrixTextvalue;

    @FindBy (xpath="//android.widget.EditText[@resource-id='remarks-5-1']")
    private WebElement remarkstextbox;

    @FindBy (xpath="(//android.view.ViewGroup[@resource-id='button-container'])[1]")
    private WebElement CancelbtninHarvesting;

    @FindBy (xpath="(//android.view.ViewGroup[@resource-id='button-container'])[2]")
    private WebElement SubmitbtninHarvesting;

    @FindBy(xpath="//android.widget.TextView[@text=\"\uDB80\uDC4D\"]")
    private WebElement Backbutton;

//Total Weight text boxes
    @FindBy (xpath="//android.widget.EditText[@resource-id='total-weight-a-1-0']")
    private WebElement A_totalweighttextbox;

    @FindBy (xpath="//android.widget.EditText[@resource-id='total-weight-b-2-0']")
    private WebElement B_totalweighttextbox;

    @FindBy (xpath="//android.widget.EditText[@resource-id='total-weight-c-3-0']")
    private WebElement C_totalweighttextbox;

    @FindBy (xpath="//android.widget.EditText[@resource-id='total-weight-d-4-0']")
    private WebElement D_totalweighttextbox;


//Total Excess weight text boxes
    @FindBy (xpath="//android.widget.EditText[@resource-id='excess-weight-a-1-1']")
    private WebElement A_excessweighttext;

    @FindBy (xpath="//android.widget.EditText[@resource-id='excess-weight-b-2-1']")
    private WebElement B_excessweighttext;

    @FindBy (xpath="//android.widget.EditText[@resource-id='excess-weight-c-3-1']")
    private WebElement C_excessweighttext;

    @FindBy (xpath="//android.widget.EditText[@resource-id='excess-weight-d-4-1']")
    private WebElement D_excessweighttext;


//Loose weight text box
    @FindBy (xpath="//android.widget.EditText[@resource-id='loose-weight-a-1-2']")
    private WebElement A_looseweitextbox;

    @FindBy (xpath="//android.widget.EditText[@resource-id='loose-weight-b-2-2']")
    private WebElement B_looseweitextbox;

    @FindBy (xpath="//android.widget.EditText[@resource-id='loose-weight-c-3-2']")
    private WebElement C_looseweitextbox;

    @FindBy (xpath="//android.widget.EditText[@resource-id='loose-weight-d-4-2']")
    private WebElement D_looseweitextbox;

//total bags text bags
    @FindBy (xpath="//android.widget.EditText[@resource-id='total-bags-a-1-3']")
    private WebElement A_totalbags;

    @FindBy (xpath="//android.widget.EditText[@resource-id='total-bags-b-2-3']")
    private WebElement B_totalbags;

    @FindBy (xpath="//android.widget.EditText[@resource-id='total-bags-c-3-3']")
    private WebElement C_totalbags;

    @FindBy (xpath="//android.widget.EditText[@resource-id='total-bags-d-4-3']")
    private WebElement D_totalbags;

    @FindBy (xpath="//android.widget.TextView[@text=\"Grade A\"]")
    private WebElement gradeA;

    public void Harvesting() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(Harvestingbtn));
        Harvestingbtn.click();
    }
    public void ClickAddbtn() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(addrowbtn));
        addrowbtn.click();
    }

    public void AddingAtoBRowinHarvesting() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(Dometextbox));
        Dometextbox.sendKeys("Dome1");
        lineTextbox.sendKeys("4");

        A_totalweighttextbox.sendKeys("15");
        A_excessweighttext.sendKeys("5");
        A_looseweitextbox.sendKeys("1");
        A_totalbags.sendKeys("14");

        B_totalweighttextbox.sendKeys("15");
        B_excessweighttext.sendKeys("5");
        B_looseweitextbox.sendKeys("1");
        B_totalbags.sendKeys("14");
    }
        public void AddingCtoDRowinHarvesting() {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
            wait.until(ExpectedConditions.elementToBeClickable(C_totalweighttextbox));

        C_totalweighttextbox.sendKeys("15");
        C_excessweighttext.sendKeys("5");
        C_looseweitextbox.sendKeys("1");
        C_totalbags.sendKeys("14");

        D_totalweighttextbox.sendKeys("15");
        D_excessweighttext.sendKeys("5");
        D_looseweitextbox.sendKeys("1");
        D_totalbags.sendKeys("14");

        BrixTextvalue.sendKeys("54");
        remarkstextbox.sendKeys("Nothing to say");

    }

    public void Submitfeededharvest(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(SubmitbtninHarvesting));
        SubmitbtninHarvesting.click();

    }
    public void Cancelfeededharvest(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(CancelbtninHarvesting));
        CancelbtninHarvesting.click();

    }


    public void Backarrow(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(Backbutton));
        Backbutton.click();
    }




}

