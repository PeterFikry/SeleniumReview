package Day5_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {
    public static void main(String[] args) {
            ChromeOptions options=new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            WebDriver driver = new ChromeDriver(options);
            driver.get("https://www.orangehrm.com/orangehrm-30-day-trial#free-trial-info-menu");
            driver.manage().window().maximize();
            WebElement countyDdl=driver.findElement(By.xpath("//select[@id='Form_getForm_Country']"));
            Select country=new Select(countyDdl);
            //country.selectByIndex(12);
            //country.selectByValue("Egypt");
            country.selectByVisibleText("Brazil");


    }
}
