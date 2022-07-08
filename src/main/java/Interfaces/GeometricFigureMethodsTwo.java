package Interfaces;

import Interfaces.GeometricFigureInterface;

public class GeometricFigureMethodsTwo implements GeometricFigureInterface {

    @Override
    public int perimetrOfSquareMethod(int a, int b) {
        return ((a + b) * 2)* 2;
    }

    @Override
    public int volumeOfCoubeMethod(int a, int b, int c) {
        return (a * b * c) * 2;
    }

    double perimetrOfSquareMethod(double a, double b) {
        return ((a + b) * 2);
    }
    double squaireOfCoubeMethod(double a, double b, double c) {
        return (a * b * c);
    }
}
