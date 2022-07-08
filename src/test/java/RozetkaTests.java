import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RozetkaTests extends TestInit{

    HeaderPageOfRozetkaSite headerPageOfRozetkaSite;

    @BeforeMethod
    public void getRozetkaHeaderBtn() {
    headerPageOfRozetkaSite = new HeaderPageOfRozetkaSite(driver);
    driver.get(headerPageOfRozetkaSite.site);
    }

    @Test
    public void computersNotebooksBtnTest(){
        headerPageOfRozetkaSite.getComputersNotebooksBtn().click();
        sleep(2);

        Assert.assertTrue(driver.getCurrentUrl().contains("https://rozetka.com.ua/computers-notebooks/c80253/"));
    }

    @Test
    public void telefonyTvEhlektronikaBtn(){
        headerPageOfRozetkaSite.getTelefonyTvEhlektronikaBtn().click();
        sleep(2);

        Assert.assertTrue(driver.getCurrentUrl().contains("https://rozetka.com.ua/telefony-tv-i-ehlektronika/c4627949/"));
    }

    @Test
    public void gameZoneBtn(){
        headerPageOfRozetkaSite.getGameZoneBtn().click();
        sleep(2);

        Assert.assertTrue(driver.getCurrentUrl().contains("https://rozetka.com.ua/game-zone/c80261/"));
    }

    @Test
    public void BTBtn(){
        headerPageOfRozetkaSite.getBTBtn().click();
        sleep(2);

        Assert.assertTrue(driver.getCurrentUrl().contains("https://bt.rozetka.com.ua/"));
    }

    @Test
    public void tovaryDlyaDomaBtn(){
        headerPageOfRozetkaSite.gettovaryDlyaDomaBtn().click();
        sleep(2);

        Assert.assertTrue(driver.getCurrentUrl().contains("https://rozetka.com.ua/tovary-dlya-doma/c2394287/"));
    }
}
