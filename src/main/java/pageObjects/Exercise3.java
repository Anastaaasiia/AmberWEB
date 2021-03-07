package pageObjects;

import base.CommonPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author Anastasiia Bondarenko
 */
public class Exercise3 extends CommonPage {

    public Exercise3(WebDriver driver)  {
        super(driver);
    }

    public Exercise3 select_option(String option){
        Select select = new Select(driver.findElement(By.id("s13")));
        select.selectByVisibleText(option);
        return this;
    }

    public Exercise3 getExercise3Url() {
        super.getExerciseUrl(3);
        return this;
    }

}
