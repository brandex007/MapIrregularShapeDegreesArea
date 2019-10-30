package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Double> latitudes;
    static List<Double> longitudes;

    static List<Double> x;
    static List<Double> y;

    static String roundOffTo2DecPlaces(double val) {
        return String.format("%.2f", val);
    }

    public static void main(String[] args) {
	    // write your code here
        latitudes = new ArrayList<>();
        latitudes.add((double) 10);
        latitudes.add((double) 15);
        latitudes.add((double) 20);

        longitudes = new ArrayList<>();
        longitudes.add((double) 10);
        longitudes.add((double) 15);
        longitudes.add((double) 20);

        x = new ArrayList<>();
        y = new ArrayList<>();

        for(int i=0; i<latitudes.size(); i++){
            DegreesUTM degreesUTM = new DegreesUTM(latitudes.get(i), longitudes.get(i));
            x.add(degreesUTM.getEasting());
            y.add(degreesUTM.getNorthing());
        }

        double area = IrregularPolygonAreaCalculator.getArea(x,y);
        System.out.println("Area: " + roundOffTo2DecPlaces(area) + "km");
    }
}
