package com.company;

import com.company.Shape;

import java.util.ArrayList;

public class Paint {
    private ArrayList<Shape> shapes;

    /**
     * Create a paint
     */
    public Paint(){
        shapes = new ArrayList<>();
    }

    /**
     * add a shape to the list
     * @param shape the given shape
     */
    public void addShape(Shape shape){
        shapes.add(shape);
    }

    /**
     * draw all shapes
     */
    public void drawAll(){
        for (int i = 0; i < shapes.size(); i++){
            shapes.get(i).draw();
        }

    }


    /**
     * print all the shapes
     */
    public void  printAll(){
        for (int i = 0 ; i<shapes.size();i++){
            System.out.println(shapes.get(i).toString());
        }
//        for (int i = 0; i < circles.size(); i++)
//            System.out.println(circles.get(i).toString());
//        for(int i = 0; i < triangles.size(); i++)
//            System.out.println(triangles.get(i).toString());
//        for (int i = 0; i < rectangles.size(); i++)
//            System.out.println(rectangles.get(i).toString());
    }

    /**
     *Search the shapes and  Describe if there is square or equilateral in it the print them
     */
    public void describeEqualSides(){
        for (Shape shape : shapes) {
            if (shape instanceof Triangle) {
                if(((Triangle) shape).isEquilateral()) {
                    System.out.println("Equilateral :" +  shape.toString());

                }
            }
            if (shape instanceof Rectangle) {
                if (((Rectangle) shape).isSquare()){
                    System.out.println("Square : " + shape.toString());
                }
            }
        }
    }
}
