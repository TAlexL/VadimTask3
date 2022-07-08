package Interfaces;

import Interfaces.VolumeFiguresInterface;

public class VolumeFiguresMethodsTwo implements VolumeFiguresInterface {
    @Override
    public int volumeOfFigures(int a, int b, int c) {
        return a * b * c;
    }

    @Override
    public int halfOfVolumeFigures(int a, int b, int c) {
        return (a * b * c)/2;
    }


//    int volumeOfFigures(int a, int b, int c) {
//        return a * b * c;
//    }
//
//    int halfOfVolumeFigures(int a, int b, int c) {
//        return (a * b * c)/2;
//    }
}
