package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchApplication2 {
    public static void main(String[] args) {
//        driver.get("https://www.google.com/");
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.navigate().to("https://www.google.com/");
        String pageTitle= driver.getTitle();
        System.out.println(pageTitle);

    }
}
