package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import pageObjects.Exercise1;
import pageObjects.Exercise2;
import pageObjects.Exercise3;
import pageObjects.Exercise4;

import java.awt.*;

/**
 *
 * @author Anastasiia Bondarenko
 */
public class BeforeAfterTests {

    protected static WebDriver driver;
    protected static Helper helper;
    protected static Exercise3 exercise3;
    protected static Exercise2 exercise2;
    protected static Exercise1 exercise1;
    protected static Exercise4 exercise4;

    @BeforeClass
    public static void setUpClass() throws AWTException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        helper = new Helper(driver);

        exercise1 = new Exercise1(driver);
        exercise2 = new Exercise2(driver);
        exercise3 = new Exercise3(driver);
        exercise4 = new Exercise4(driver);
    }

    @AfterMethod
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
    }

    @AfterClass
    public static void tearDownClass()    {
        if (null != driver) {
            driver.close();
            driver.quit();
        }

    }
}
