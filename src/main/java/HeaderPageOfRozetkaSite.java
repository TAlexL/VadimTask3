import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.print.DocFlavor;

public class HeaderPageOfRozetkaSite extends BasePage{

    HeaderPageOfRozetkaSite(WebDriver driver){
        super(driver);
    }

    public String site = "https://rozetka.com.ua/";

    public WebElement getComputersNotebooksBtn() {
        return driver.findElement(By.xpath("//a[@class='menu-categories__link' and @href = 'https://rozetka.com.ua/computers-notebooks/c80253/']"));
    }

    public WebElement getTelefonyTvEhlektronikaBtn() {
        return driver.findElement(By.xpath("//a[@class='menu-categories__link' and @href = 'https://rozetka.com.ua/telefony-tv-i-ehlektronika/c4627949/']"));
    }

    public WebElement getGameZoneBtn() {
        return driver.findElement(By.xpath("//a[@class='menu-categories__link' and @href = 'https://rozetka.com.ua/game-zone/c80261/']"));
    }

    public WebElement getBTBtn() {
        return driver.findElement(By.xpath("//a[@class='menu-categories__link' and @href = 'https://bt.rozetka.com.ua/']"));
    }

    public WebElement gettovaryDlyaDomaBtn() {
        return driver.findElement(By.xpath("//a[@class='menu-categories__link' and @href = 'https://rozetka.com.ua/tovary-dlya-doma/c2394287/']"));
    }
}

