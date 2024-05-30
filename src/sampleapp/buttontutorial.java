package sampleapp;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class buttontutorial {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "E:\\Rajarata University Of Srilanka\\Selenium\\New folder\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://leafground.com/link.xhtml");

        WebElement positionbutton = driver.findElement(By.id("j_idt88:j_idt94"));

        int xValue = positionbutton.getLocation().getX();
        int yValue = positionbutton.getLocation().getY();

        System.out.println("X value is:"+ xValue);
        System.out.println("Y value is:"+ yValue);



    }
}
