package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebElement;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//set the path of the msedgedriver.exe file to the webdriver.edge.driver property
        System.setProperty("webdriver.edge.driver", "msedgedriver.exe");

        //create MS Edge instance
        WebDriver driver = new EdgeDriver();

        try {
            // Navigate to Google
            driver.get("http://www.google.com");

            // Enter the search term "Selenium"
            driver.findElement(By.name("q")).sendKeys("Selenium");

            // Submit the search query
            driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

            // Pause to allow the search results to load
            Thread.sleep(2000);

            // Verify the page title contains the search term
            if (driver.getTitle().contains(".")) {
                System.out.println("Test Passed: ");
            } else {
                System.out.println("Test Failed: ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
//             Close the browser
            driver.quit();
        }

    }
}