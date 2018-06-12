package net.tests.app.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RadioButton {

    public static void main(String args []){

        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver");
        WebDriver browser = new ChromeDriver();
        /**
         * Time by default the page will wait to load or execute an action.
         */
        browser.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
        /**
         * Additional time to execute the actions within the page, in cases where it takes more than expected.
         */
        WebDriverWait explicitWait = new WebDriverWait(browser, 5);
        browser.navigate().to("http://www.html.am/html-codes/forms/html-radio-button-code.cfm");
        explicitWait.until(ExpectedConditions.urlContains("radio"));
        List<WebElement> myStringArray = browser.findElements(By.name("gender"));
        for(int i=0;i<myStringArray.size();i++){
            String value =myStringArray.get(i).getAttribute("value");
            if(value.equals("female")){
                myStringArray.get(i).click();
            }
        }
    }
}
