package net.tests.app.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.lang.reflect.Array;

public class MultipleWindows {

    public static void main (String args[]){
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver");
        WebDriver browser = new ChromeDriver();
        Actions actions = new Actions(browser);
        browser.navigate().to("https://www.amazon.com");
        System.out.println("tab " + browser.getTitle());
        WebElement departments = browser.findElement(By.id("nav-link-shopall"));
        WebElement fireTVMenu = browser.findElement(By.cssSelector("span[data-nav-panelkey='FireTvPanel']"));
        WebElement fireTVProducts = browser.findElement(By.xpath("//div[@class='nav-panel']//a//span[text()='Fire TV']"));
        actions.moveToElement(departments).moveToElement(fireTVMenu).moveToElement(fireTVProducts).keyDown(Keys.COMMAND)
                .click().build().perform();
        Object[] windowIds = browser.getWindowHandles().toArray();
        browser.switchTo().window(windowIds[1].toString());
        System.out.println("tab1 " + browser.getTitle());
    }
}
