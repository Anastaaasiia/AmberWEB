package pageObjects;

import base.CommonPage;
import java.awt.AWTException;
import org.openqa.selenium.WebDriver;

/**
 * @author Anastasiia Bondarenko
 */
public class Exercise1 extends CommonPage {

    public Exercise1(WebDriver driver) throws AWTException {
        super(driver);
    }

    public Exercise1 getExercise1Url() {
        super.getExerciseUrl(1);
        return this;
    }
}
