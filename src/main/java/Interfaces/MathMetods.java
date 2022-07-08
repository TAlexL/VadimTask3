package Interfaces;

import Interfaces.MathInterface;

public class MathMetods implements MathInterface {


    @Override
    public int summMethod(int a, int b) {
        return a + b;
    }

    @Override
    public int minusMethod(int a, int b) {

        return a - b;
    }

    @Override
    public int multiPlaceMethod(int a, int b) {

        return a * b;
    }

    @Override
    public int divisionMethod(int a, int b) {
        return a / b;
    }

    float summMethod(float a, float b, float c) {
        return (float) a + b + c;
    }
    
    float minusMethod(float a, float b, float c) {

        return (float) a - b - c;
    }

    float multiPlaceMethod(float a, float b, float c) {
        return (float) a * b * c;
    }

    float divisionMethod(float a, float b, float c) {
        return (float) a / b / c;
    }
}
