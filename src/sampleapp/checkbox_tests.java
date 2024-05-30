package sampleapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox_tests {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "E:\\Rajarata University Of Srilanka\\Selenium\\New folder\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://leafground.com/checkbox.xhtml;jsessionid=node0hyywz4yy0lwv1ksakaux820pi1670030.node0");

        WebElement basiccheckbox = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt89\"]/div[2]"));
        basiccheckbox.click();

        WebElement java = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[3]/div/div/table/tbody/tr/td[1]/div/div[2]/span"));
        WebElement python = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[3]/div/div/table/tbody/tr/td[2]/div"));
        WebElement other = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[3]/div/div/table/tbody/tr/td[5]/div/div[2]"));

        //java.click();
        //python.click();
        other.click();



    }
}
