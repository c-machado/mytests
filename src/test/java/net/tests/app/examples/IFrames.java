package net.tests.app.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class IFrames {
    public static void main(String []args) throws Exception{
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver");
        WebDriver browser = new ChromeDriver();
        browser.navigate().to("http://jqueryui.com/droppable/");
        WebElement iframe = browser.findElement(By.cssSelector("iframe"));
        browser.switchTo().frame(iframe);
        WebElement draggable = browser.findElement(By.id("draggable"));
        WebElement droppable = browser.findElement(By.id("droppable"));
        System.out.println(draggable.getText());
        Actions draggingAction = new Actions(browser);
        Thread.sleep(2000);
        draggingAction.dragAndDrop(draggable,droppable).build().perform();
        browser.switchTo().defaultContent();
    }
}
