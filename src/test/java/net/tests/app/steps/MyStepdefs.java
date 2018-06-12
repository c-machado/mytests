package net.tests.app.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {

    WebDriver browser;


    @Given("^I am in the WestMarine homepage$")
    public void iAmInTheWestMarineHomepage() {
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver");
        browser = new ChromeDriver();
        browser.navigate().to("https://www.westmarine.com/");
    }

    @When("^I type \"([^\"]*)\" in the search field$")
    public void iTypeInTheSearchField(String keyword) throws Throwable{
        Thread.sleep(1000);
        System.out.println("key in ckeckout guest"+keyword);
        browser.findElement(By.id("search")).sendKeys(keyword);
    }

    @And("^I click on the search button$")
    public void iClickOnTheSearchButton(){
        browser.findElement(By.cssSelector("form[name='search_form'] .button")).click();
    }

    @Then("^I should see results for the item searched$")
    public void iShouldSeeResultsForSearchedItem() {
        browser.findElement(By.cssSelector(".total-records")).isDisplayed();
    }


}
