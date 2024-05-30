package sampleapp;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

public class textboxtest {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","E:\\Rajarata University Of Srilanka\\Selenium\\New folder\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://leafground.com/input.xhtml");

        WebElement namebox = driver.findElement(By.id("j_idt88:name"));
        namebox.sendKeys("Dinuja Kelum Rathnayake");

        WebElement citybox = driver.findElement(By.id("j_idt88:j_idt91"));
        citybox.sendKeys("Bandarawela");

        WebElement clearmebox = driver.findElement(By.id("j_idt88:j_idt95"));
        clearmebox.clear();

        WebElement disabledbox = driver.findElement(By.xpath("//*[@id=\"j_idt88\"]/div[3]/div"));
        boolean status = disabledbox.isEnabled();
        System.out.println(status);

        WebElement getbox = driver.findElement(By.id("j_idt88:j_idt97"));
        String text = getbox.getAttribute("value");
        System.out.println(text);

        //WebElement errormsg = driver.findElement(By.xpath("/html/body"));

        WebElement emailbox = driver.findElement(By.id("j_idt88:j_idt99"));
        emailbox.sendKeys("dinujakalum@gmail.com"+ Keys.TAB);

        WebElement abouttext = driver.findElement(By.id("j_idt88:j_idt101"));
        abouttext.sendKeys("Hi!! My name is Dinuja Kelum Rathnayake");



        //Thread.sleep(5000);









    }
}
