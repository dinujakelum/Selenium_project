package sampleapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkstutorialpath {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","E:\\Rajarata University Of Srilanka\\Selenium\\New folder\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://leafground.com/link.xhtml");

        //driver.findElement(By.linkText("Go to Dashboard")).click();
        driver.findElement(By.partialLinkText("Dashboard")).click();
        driver.close();



    }


}
