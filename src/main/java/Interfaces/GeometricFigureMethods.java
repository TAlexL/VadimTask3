package Interfaces;

import Interfaces.GeometricFigureInterface;

public class GeometricFigureMethods implements GeometricFigureInterface {
    @Override
    public int perimetrOfSquareMethod(int a, int b) {
        return (a + b) * 2;
    }

    @Override
    public int volumeOfCoubeMethod(int a, int b, int c) {
        return a * b * c;
    }

    private double perimetrOfSquareMethod(double a, double b) {
        return ((a + b) * 2);
    }
    private double squaireOfCoubeMethod(double a, double b, double c) {
        return (a * b * c);
    }
}
