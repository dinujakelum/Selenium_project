package amctest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amclogintest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "E:\\Rajarata University Of Srilanka\\Selenium\\New folder\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://amcclinicalguide.com.au/");

        //maximize the browse window
        driver.manage().window().maximize();

        WebElement loginbutton = driver.findElement(By.xpath("/html/body/header/div/div[2]/div/nav/ul/li[6]/a"));
        loginbutton.click();


        WebElement emailfield = driver.findElement(By.id("email"));
        emailfield.sendKeys("dinujakalumgmail.com");

        WebElement passwordfield = driver.findElement(By.id("password"));
        passwordfield.sendKeys("12345678");

        WebElement Loginabutton2 = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/form/div[3]/button"));
        Loginabutton2.click();








    }
}