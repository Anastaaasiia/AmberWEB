package pageObjects;

import base.CommonPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.*;

/**
 *
 * @author Anastasiia Bondarenko
 */
public class Exercise4 extends CommonPage {

    public Exercise4(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input")
    public List<WebElement> inputs;

    public Exercise4 choose_options(String options[]){
        for(String option : options) {
            for (WebElement input : inputs) {
                if (input.getAttribute("value").equals(option))
                    input.click();
            }
        }
        return this;
    }

    public Exercise4 getExercise4Url() {
        super.getExerciseUrl(4);
        return this;
    }

}
