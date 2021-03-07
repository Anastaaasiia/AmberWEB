package pageObjects;

import base.CommonPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author Nastya
 */
public class Exercise2 extends CommonPage {

    public Exercise2(WebDriver driver)  {
        super(driver);
    }

    @FindBy(id = "t14")
    public WebElement t14;

    public Exercise2 put_text_into_t14(String text){
        t14.clear();
        t14.sendKeys(text);
        return this;
    }

    public Exercise2 getExercise2Url() {
        super.getExerciseUrl(2);
        return this;
    }


}
