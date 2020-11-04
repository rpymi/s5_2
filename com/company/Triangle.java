package com.company;

import com.company.Shape;

import java.awt.*;
import java.util.ArrayList;

    /**
     * Create a shape in type of triangle
     */
    public class Triangle extends Polygon {

        /**
         * Create a triangle
         *
         * @param side1 the first side
         * @param side2 the second side
         * @param side3 the third side
         */
        public Triangle(double side1, double side2, double side3) {
            sides = new ArrayList<>();
            sides.add(side1);
            sides.add(side2);
            sides.add(side3);
        }

        /**
         * Check if it is equilateral or not
         *
         * @return boolean
         */
        public boolean isEquilateral() {
//        System.out.println(sides.get(0) +" "+ sides.get(1) + " "+sides.get(2));
            if (sides.get(0).equals( sides.get(1)) && sides.get(1).equals( sides.get(2))) {
                return true;
            }
            return false;

        }

        /**
         * Calculate the perimeter of the triangle
         * @return int perimeter
         */
        public double calculatePerimeter(){
            return sides.get(0) + sides.get(1) + sides.get(2);
        }

        /**
         * Calculate the area of the triangle
         * @return int area
         */
        public double calculateArea(){
            double s = (sides.get(0) + sides.get(1) + sides.get(2)) / 2;
            return Math.sqrt(s * (s - sides.get(0)) * (s - sides.get(1)) * (s - sides.get(2)));
        }

        /**
         * print the triangle's area and perimeter
         */
        public void draw(){
            System.out.println(this.getClass().getName() + "    Perimeter: " + calculatePerimeter() + "   Area: " +
                    calculateArea());
        }

        /**
         * check if two triangles are equals or not
         * @param shape the given shape
         * @return boolean true if they are the same
         */
        public boolean equals(Shape shape){
            if (shape instanceof Triangle){
                Triangle triangle = (Triangle) shape;
                if(triangle.getSides().get(0).equals(sides.get(0))
                        && triangle.getSides().get(1).equals(sides.get(1))
                        && triangle.getSides().get(2).equals(sides.get(2)))

                    return true;}
            return  false;
        }

        /**
         * Return the specification of the triangle in a string
         * @return String specification of the triangle
         */
        public  String toString(){
            return  getClass().getName().toString() + sides.get(0).toString()
                    + sides.get(1).toString() + sides.get(2).toString();
        }
    }

