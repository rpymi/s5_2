package com.company;

import javafx.scene.shape.Circle;

public class Main {

    public static void main(String[] args) {
        Paint paint = new Paint();
        Circle circle1  = new Circle(3);
        Circle circle2 = new Circle(4);
        Triangle triangle1 = new Triangle(1 , 2 , 3);
        Triangle triangle2 = new Triangle(2,2,2);
        Rectangle rectangle1 = new Rectangle(1,2,1,2);
        Rectangle rectangle2= new Rectangle(1,1,1,1);
//
//    paint.addShape(circle1);
//    paint.addShape(circle2);
        paint.addShape(triangle1);
        paint.addShape(triangle2);
        paint.addShape(rectangle1);
        paint.addShape(rectangle2);
        if(!(circle1.equals(circle2)))
            System.out.println("They are not the same");

        //System.out.println(triangle2.isEquilateral());
        if(triangle2.isEquilateral())
            System.out.println("Equilateral");

        //System.out.println("gfhhgv");
        if(rectangle2.isSquare())
            System.out.println("Square");
        paint.drawAll();
        //paint.printAll();
        paint.describeEqualSides();
    }

}
