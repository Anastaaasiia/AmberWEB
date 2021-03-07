/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author Anastasiia Bondarenko
 */
public class Helper {

    protected WebDriver driver;

    Helper(WebDriver driver) {
        this.driver = driver;
    }

    //checking if page is loaded
    public boolean isPageLoaded(){
        return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
    }

}
