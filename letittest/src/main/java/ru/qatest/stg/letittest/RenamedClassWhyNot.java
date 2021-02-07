package ru.qatest.stg.letittest;

public class RenamedClassWhyNot<h> {
    public static void main(String[] args) {
        testFunc("FAKA");
        testFunc("FACA");
        testFunc("FAKKA");
        testFunc("FAKHA");
        testFunc("FAHKA");

        double length = 9;
        System.out.println("Площ квадр со стор " + length + "=" + plosh(length));
        
        double len = 4;
        double h=10;
        System.out.println("Площ прямоуг со сторонами " + length + " и " + h + plosh(len,h));
    }

    public static void testFunc(String text1) {

        System.out.println("MAZA " + text1 + " ?");
    }

    public static double plosh(double l) {
        return l * l;
    }


    public static double plosh(double len, double h) {
        return len * h;
    }
}