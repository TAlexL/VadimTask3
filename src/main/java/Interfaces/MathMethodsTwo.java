package Interfaces;

import Interfaces.MathInterface;

public class MathMethodsTwo implements MathInterface {
    @Override
    public int summMethod(int a, int b) {
        return (a + b)*2;
    }

    @Override
    public int minusMethod(int a, int b) {
        return (a - b)*2;
    }

    @Override
    public int multiPlaceMethod(int a, int b) {
        return (a * b) * 2;
    }

    @Override
    public int divisionMethod(int a, int b) {
        return (a / b) * 2;
    }

    private int multiPlaceMethod(int a, int b, int c) {
        return (a * b * c) * 2;
    }

    private int divisionMethod(int a, int b, int c) {
        return (a / b / c) * 2;
    }
}
