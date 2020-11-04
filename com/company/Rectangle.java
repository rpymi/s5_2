package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Rectangle  extends Polygon {

    /**
     * Create a triangle
     * @param side1 the first side
     * @param side2 the second side
     * @param side3 the third side
     * @param side4 the 4th side
     */
    public Rectangle(double side1 , double side2 ,double side3 , double side4){
        super();
        sides.add(side1);
        sides.add(side2);
        sides.add(side3);
        sides.add(side4);
    }



    /**
     * check if the rectangle is a square or not
     * @return true if it is square
     */
    public boolean isSquare(){
        if (sides.get(0).equals(sides.get(1)))
            return true;
        return false;
    }
    /**
     * Calculate the perimeter of the rectangle
     * @return double perimeter
     */
    public double calculatePerimeter(){
        return sides.get(0) + sides.get(1) + sides.get(2) + sides.get(3);
    }
    /**
     * Calculate the area of the rectangle
     * @return double area
     */
    public double calculateArea(){
        return sides.get(0) * sides.get(1);
    }

    /**
     * print the rectangle's area and perimeter
     */
    public void draw(){
        System.out.println(this.getClass().getName() + "    Perimeter: " + calculatePerimeter() + "   Area: " +
                calculateArea());
    }
    /**
     * check if two rectangles are equals or not
     * @param shape the given shape
     * @return boolean true if they are the same
     */
    public boolean equals(Shape shape){
        if(shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            return (sides.get(0) == rectangle.getSides().get(0))
                    && ((sides.get(1) == rectangle.getSides().get(1)));
        }
        return false;

    }
    /**
     * Return the specification of the rectangle in a string
     * @return String specification of the rectangle
     */
    public  String toString(){
        return  getClass().getName().toString() + sides.get(0).toString()
                + sides.get(1).toString();
    }
}
