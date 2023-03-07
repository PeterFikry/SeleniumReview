package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication {
    public static void main(String[] args) {
        //1. Open the Browser
        System.setProperty("webdriver.chrome.driver","/Users/peterghobrial/Desktop/IntelliJ/Selenium Review/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();




    }
}
