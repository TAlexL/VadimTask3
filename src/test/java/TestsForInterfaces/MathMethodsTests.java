package TestsForInterfaces;

import Interfaces.MathMethodsTwo;
import Interfaces.MathMetods;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.apache.commons.lang3.ClassUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MathMethodsTests {

    Interfaces.MathMetods mathMetods = new MathMetods();
    Interfaces.MathMethodsTwo mathMethodsTwo = new MathMethodsTwo();

    @Test
    public void summMethodTest() {

        Assert.assertTrue(mathMetods.summMethod(5, 10) == 15);
        Assert.assertEquals(mathMetods.summMethod(5, 10), 15);
        Assert.assertFalse(mathMetods.summMethod(5, 10) == 20);
    }

    @Test
    public void MinusMethodTest(){

        Assert.assertTrue(mathMetods.minusMethod(10, 5)==5);
        Assert.assertEquals(mathMetods.minusMethod(10, 5), 5);
        Assert.assertFalse(mathMetods.summMethod(5, 10) == 20);
    }

    @Test
    public void multiPlaceMethodTest(){

        Assert.assertTrue(mathMetods.multiPlaceMethod(10, 5)==50);
        Assert.assertEquals(mathMetods.multiPlaceMethod(10, 5), 50);
        Assert.assertFalse(mathMetods.multiPlaceMethod(5, 10) == 20);
    }

    @Test
    public void divisionMethodTest(){

        Assert.assertTrue(mathMetods.divisionMethod(10, 5)==2);
        Assert.assertEquals(mathMetods.divisionMethod(10, 5), 2);
        Assert.assertFalse(mathMetods.divisionMethod(10, 5) == 20);
    }

    @Test
    public void summMethodTwoTest() {

        Assert.assertTrue(mathMethodsTwo.summMethod(5, 10) == 30);
        Assert.assertEquals(mathMethodsTwo.summMethod(5, 10), 30);
        Assert.assertFalse(mathMethodsTwo.summMethod(5, 10) == 20);
    }

    @Test
    public void minusMethodTwoTest() {

        Assert.assertTrue(mathMethodsTwo.minusMethod(10, 5) == 10);
        Assert.assertEquals(mathMethodsTwo.minusMethod(10,5), 10);
        Assert.assertFalse(mathMethodsTwo.minusMethod(10, 5) == 20);
    }

    @Test
    public void multiplaceMethodTwoTest() {

        Assert.assertTrue(mathMethodsTwo.multiPlaceMethod(10, 5) == 100);
        Assert.assertEquals(mathMethodsTwo.multiPlaceMethod(10,5), 100);
        Assert.assertFalse(mathMethodsTwo.multiPlaceMethod(10, 5) == 20);
    }

    @Test
    public void divisioneMethodTwoTest() {

        Assert.assertTrue(mathMethodsTwo.divisionMethod(10, 5) == 4);
        Assert.assertEquals(mathMethodsTwo.divisionMethod(10,5), 4);
        Assert.assertFalse(mathMethodsTwo.divisionMethod(10, 5) == 20);
    }
}
