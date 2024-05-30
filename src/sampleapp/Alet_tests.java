package sampleapp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alet_tests {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "E:\\Rajarata University Of Srilanka\\Selenium\\New folder\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://leafground.com/alert.xhtml");

        WebElement aletbutton = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[1]/button/span[2]"));
        aletbutton.click();

        Alert alert1 = driver.switchTo().alert();
        alert1.accept();

        WebElement confirmbutton = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[2]/button/span[2]"));
        confirmbutton.click();

        Alert alert2 = driver.switchTo().alert();
        //alert2.dismiss();
        alert2.accept();

        WebElement promtbutton = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[1]/button/span[2]"));
        promtbutton.click();

        Alert alert3 = driver.switchTo().alert();
        alert3.sendKeys("Dinuja Kelum Rathnayaka");
        alert3.accept();

        WebElement sweetalertbutton = driver.findElement(By.id("j_idt88:j_idt95"));
        sweetalertbutton.click();

        Alert alert4 =driver.switchTo().alert();
       // alert4.accept();
         //WebElement dismissbutton = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt98\"]/span[2]"));
        //dismissbutton.click();

        WebElement closebutton = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt96\"]/div[1]/a"));
        closebutton.click();






    }
}
