package net.tests.app.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class RadioButton {

    public static void main(String args []){
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver");
        WebDriver browser = new ChromeDriver();
        browser.navigate().to("http://www.html.am/html-codes/forms/html-radio-button-code.cfm");
        List<WebElement> myStringArray = browser.findElements(By.name("gender"));
        for(int i=0;i<myStringArray.size();i++){
            String value =myStringArray.get(i).getAttribute("value");
            if(value.equals("female")){
                myStringArray.get(i).click();
            }
        }
    }
}
