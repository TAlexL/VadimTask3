package Interfaces;

import Interfaces.VolumeFiguresInterface;

public class VolumeFiguresMethods implements VolumeFiguresInterface {


    @Override
    public int volumeOfFigures(int a, int b, int c) {
        return (a * b * c);
    }

    @Override
    public int halfOfVolumeFigures(int a, int b, int c) {
        return (a * b * c)/2;
    }

    float volumeOfFigures2(float a, float b, float c) {
        return (float) (a * b * c);
    }

    float halfOfVolumeFigures2(float a, float b, float c) {
        return (float) ((a * b * c) / 2);
    }
}
