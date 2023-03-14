package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchApplication {
    public static void main(String[] args) {
        //1. Open the Browser
        System.setProperty("webdriver.chrome.driver","/Users/peterghobrial/Desktop/IntelliJ/Selenium Review/Drivers/chromedriver");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com");
        String pageTitle= driver.getTitle();
        System.out.println(pageTitle);



    }
}
