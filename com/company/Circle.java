package com.company;

import com.company.Shape;

/**
 * Create a shape of type  of circle
 */
public class Circle extends Shape{
    private double radius;

    /**
     * Create a circle with the amount of radius
     * @param radius radius of the circle
     */
    public Circle(double radius){
     super();

        this.radius  = radius;
    }

    /**
     * Get the radius of the circle
     * @return double radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Calculate the perimeter of the circle
     * @return double perimeter
     */
    public double calculatePerimeter(){
        return 2 * Math.PI*(getRadius());
    }

    /**
     * Calculate the area of the circle
     * @return double area
     */
    public  double calculateArea(){
        return Math.PI * Math.pow(getRadius(),2);
    }

    /**
     * Print circle's area & perimeter
     */
    public void draw(){
        System.out.println("Circle" + "    Perimeter:  "+calculatePerimeter() +
                "   Area:  " + calculateArea() );

    }

    /**
     * Check if two circles are equal or not
     * @param shape
     * @return boolean true if they are the same
     */
    public boolean equals(Shape shape){
        if(shape instanceof Circle){
            Circle circle = (Circle) shape;
            if (getRadius() == circle.getRadius())
                return true;
        }
        return false;
    }

    /**
     * Return the specification of the circle in a string
     * @return String specification of the circle
     */
    public String toString(){
        double r = getRadius();
        String rAsString = Double.toString(r);
        return getClass().getName().concat(rAsString);
    }
}
