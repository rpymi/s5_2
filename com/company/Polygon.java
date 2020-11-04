package com.company;

import com.company.Shape;

import java.util.ArrayList;

public class Polygon extends Shape {



    protected ArrayList<Double> sides;


    public Polygon(){
        sides = new ArrayList<>();
    }

    /**
     * Get a list of sides
     *
     * @return ArrayList sides
     */
    public ArrayList<Double> getSides() {
        return sides;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public void draw() {

    }

    @Override
    public boolean equals(Shape shape) {
        return false;
    }

    @Override
    public String toString() {
        return null;
    }
}
