package com.company;

import java.util.List;

public class IrregularPolygonAreaCalculator {
    public static double getArea(List<Double> x, List<Double> y){
        double area = 0;
        int j = x.size() - 1;

        for(int i=0; i<x.size(); i++){
            area += (x.get(j) + x.get(i)) * (y.get(j) - y.get(i));
            j = i;
        }

        return area / 2.0;
    }
}
