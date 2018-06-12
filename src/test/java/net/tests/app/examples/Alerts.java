package net.tests.app.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String args[])throws Exception{
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver");
        WebDriver browser = new ChromeDriver();
        browser.navigate().to("https://www.tutorialspoint.com/javascript/src/alert_dialog_box.htm");
        browser.findElement(By.cssSelector("input[type='button']")).click();
        Thread.sleep(4000);
        browser.switchTo().alert().accept();

        browser.navigate().to("https://www.tutorialspoint.com/javascript/src/confirmation_dialog_box.htm");
        browser.findElement(By.cssSelector("input[type='button']")).click();
        Thread.sleep(4000);
        browser.switchTo().alert().dismiss();

        browser.navigate().to("https://www.tutorialspoint.com/javascript/src/prompt_dialog_box.htm");
        browser.findElement(By.cssSelector("input[type='button']")).click();
        Thread.sleep(4000);
        browser.switchTo().alert().sendKeys("Carolina");
        System.out.println("Text in the alert: " + browser.switchTo().alert().getText());

    }
}
