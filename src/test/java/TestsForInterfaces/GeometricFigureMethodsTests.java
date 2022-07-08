package TestsForInterfaces;

import Interfaces.GeometricFigureMethods;
import Interfaces.GeometricFigureMethodsTwo;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GeometricFigureMethodsTests {

    Interfaces.GeometricFigureMethods geometricFigureMethods = new GeometricFigureMethods();
    Interfaces.GeometricFigureMethodsTwo geometricFigureMethodsTwo = new GeometricFigureMethodsTwo();

    @Test
    public void perimetrOfSquareMethodTest(){

        Assert.assertTrue(geometricFigureMethods.perimetrOfSquareMethod(12,15)==54);
        Assert.assertEquals(geometricFigureMethods.perimetrOfSquareMethod(12,15), 54);
        Assert.assertFalse(geometricFigureMethods.perimetrOfSquareMethod(12,15)==50);
    }

    @Test
    public void volumeOfCoubeMethodTest(){

        Assert.assertTrue(geometricFigureMethods.volumeOfCoubeMethod(12,15, 17)==3060);
        Assert.assertEquals(geometricFigureMethods.volumeOfCoubeMethod(12,15, 17), 3060);
        Assert.assertFalse(geometricFigureMethods.volumeOfCoubeMethod(12,15,17)==50);
    }

    @Test
    public void perimetrOfSquareMethodTwoTest(){

        Assert.assertTrue(geometricFigureMethodsTwo.perimetrOfSquareMethod(12,15)==108);
        Assert.assertEquals(geometricFigureMethodsTwo.perimetrOfSquareMethod(12,15), 108);
        Assert.assertFalse(geometricFigureMethodsTwo.perimetrOfSquareMethod(12,15)==50);
    }

    @Test
    public void volumeOfCoubeMethodTwoTest(){

        Assert.assertTrue(geometricFigureMethodsTwo.volumeOfCoubeMethod(12,15, 17)==6120);
        Assert.assertEquals(geometricFigureMethodsTwo.volumeOfCoubeMethod(12,15, 17), 6120);
        Assert.assertFalse(geometricFigureMethodsTwo.volumeOfCoubeMethod(12,15,17)==50);
    }
}
