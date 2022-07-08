package TestsForInterfaces;

import Interfaces.VolumeFiguresMethods;
import Interfaces.VolumeFiguresMethodsTwo;
import org.apache.commons.lang3.ClassUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VolumeFiguresMethodsTests {

    Interfaces.VolumeFiguresMethods volumeFiguresMethods = new VolumeFiguresMethods();
    Interfaces.VolumeFiguresMethodsTwo volumeFiguresMethodsTwo = new VolumeFiguresMethodsTwo();

    @Test
    public void volumeOfFiguresTests(){

        Assert.assertTrue(volumeFiguresMethods.volumeOfFigures(5,6,7)==210);
        Assert.assertEquals(volumeFiguresMethods.volumeOfFigures(5,6,7), 210);
        Assert.assertFalse(volumeFiguresMethods.volumeOfFigures(5,6,7)==300);
    }

    @Test
    public void halfVolumeOfFiguresTests(){

        Assert.assertTrue(volumeFiguresMethods.halfOfVolumeFigures(5,6,7)==105);
        Assert.assertEquals(volumeFiguresMethods.halfOfVolumeFigures(5,6,7), 105);
        Assert.assertFalse(volumeFiguresMethods.halfOfVolumeFigures(5,6,7)==300);
    }

    @Test
    public void volumeOfFiguresTwoTests(){

        Assert.assertTrue(volumeFiguresMethodsTwo.volumeOfFigures(7,8,9)==504);
        Assert.assertEquals(volumeFiguresMethodsTwo.volumeOfFigures(7,8,9), 504);
        Assert.assertFalse(volumeFiguresMethodsTwo.volumeOfFigures(7,8,9)==300);
    }

    @Test
    public void halfVolumeOfFiguresTwoTests(){

        Assert.assertTrue(volumeFiguresMethodsTwo.halfOfVolumeFigures(7,8,9)==252);
        Assert.assertEquals(volumeFiguresMethodsTwo.halfOfVolumeFigures(7,8,9), 252);
        Assert.assertFalse(volumeFiguresMethodsTwo.halfOfVolumeFigures(7,8,9)==300);
    }
}
