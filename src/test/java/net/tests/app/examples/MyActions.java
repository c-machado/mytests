package net.tests.app.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyActions {

    public static void main (String args[]){
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver");
        WebDriver browser = new ChromeDriver();
        Actions actions = new Actions(browser);
        browser.navigate().to("https://www.amazon.com");
        WebElement primeMenu = browser.findElement(By.id("nav-link-prime"));
        actions.moveToElement(primeMenu).build().perform();
        WebElement searchField = browser.findElement(By.id("twotabsearchtextbox"));
        WebElement searchButton = browser.findElement(By.cssSelector("input[type='submit']"));
        actions.moveToElement(searchField).click().sendKeys("Garmin 5s").moveToElement(searchButton).click().build().perform();

    }
}
