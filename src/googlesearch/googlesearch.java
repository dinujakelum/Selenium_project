package googlesearch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlesearch {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","E:\\Rajarata University Of Srilanka\\Selenium\\New folder\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys("selenium"+ Keys.ENTER);

        Thread.sleep(5000);


        driver.close();
    }
}
