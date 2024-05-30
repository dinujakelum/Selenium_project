package sampleapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Helloworld
{

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","E:\\Rajarata University Of Srilanka\\Selenium\\New folder\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.quit();
    }
}
