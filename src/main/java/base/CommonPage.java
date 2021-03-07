package base;

import java.awt.*;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.*;

/**
 * @author Anastasiia Bondarenko
 */

public class CommonPage {
    protected WebDriver driver;
    public static final int DEFULT_TIMEOUT = 10;
    public static final String SEED = "863b494d-4ac7-493b-a825-f670f3d4e19b";
    public static final String URL = "https://antycaptcha.amberteam.pl/exercises/exercise";

    @FindBy(id = "btnButton1")
    public WebElement b1;

    @FindBy(xpath = "//pre[@id='trail']/code")
    public WebElement trail;

    @FindBy(id = "solution")
    public WebElement solution;

    public CommonPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public CommonPage click_b1_button() {
        b1.click();
        return this;
    }

    public CommonPage check_text_in_trail_box(String expectedText)  {
        waitTextToBePresentInElement(trail, expectedText);
        assertEquals(trail.getText(), expectedText);
        return this;
    }

    public CommonPage click_check_solution() {
        solution.click();
        return this;
    }

    public void waitPageLoad() {
        ExpectedCondition<Boolean> expectation = (WebDriver driver1) -> ((JavascriptExecutor) driver1).executeScript("return document.readyState").toString().equals("complete");
        new WebDriverWait(driver, DEFULT_TIMEOUT).until(expectation);
    }

    public void waitTextToBePresentInElement(WebElement element, String text) {
        new WebDriverWait(driver, DEFULT_TIMEOUT).until(ExpectedConditions.textToBePresentInElement(element, text));
    }

    public void getExerciseUrl(int exerciseNumber)  {

        driver.get(URL + exerciseNumber + "?seed=" + SEED);
        waitPageLoad();
    }

}