package Curs10;

import Curs9.Terrestrial;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Shape shape = new Shape("Math is easy", "plastic");
        Shape shape2 = new Shape("Math is easy", "plastic");
        Shape shape3 = new Shape("Math is easy", "glass");

        Triangle triangle = new Triangle("I reflect light", "glass", 23, 11);
        Triangle triangle2 = new Triangle("I reflect light", "glass", 23, 11);
        Triangle triangle3 = new Triangle("I reflect light", "glass", 13, 24);


        Rectangle rectangle = new Rectangle("Yellow rectangle", "steel", 10, 50);
        Rectangle rectangle2 = new Rectangle("Yellow rectangle", "steel", 10, 50);
        Rectangle rectangle3 = new Rectangle("Yellow rectangle", "steel", 52, 14);

        System.out.println(shape.getSize());
        System.out.println(shape.equals(shape2));
        System.out.println(shape.equals(shape3));
        System.out.println(shape.toString());
        System.out.println(shape.hashCode());

        System.out.println(triangle.getSize());
        System.out.println(triangle.equals(triangle2));
        System.out.println(triangle.equals(triangle3));
        System.out.println(triangle.toString());
        System.out.println(triangle.hashCode());
        triangle.displayTriangleHeight();

        System.out.println(rectangle.getSize());
        System.out.println(rectangle.equals(rectangle2));
        System.out.println(rectangle.equals(rectangle3));
        System.out.println(rectangle.toString());
        System.out.println(rectangle.hashCode());
        rectangle.displayRectangleHeight();

        System.out.println(" exercitiul 7 :");

        ArrayList<Shape> allShapes = new ArrayList<Shape>();
        allShapes.add(shape);
        allShapes.add(shape3);
        allShapes.add(triangle);
        allShapes.add(triangle3);
        allShapes.add(rectangle);
        allShapes.add(rectangle3);
        for(Shape shapeAll : allShapes){
            System.out.println(shapeAll.toString());
            System.out.println(shapeAll.getSize());

        }
        System.out.println("exercitiul 8");

        for(int i=0; i < allShapes.size(); i++) {
            if (allShapes.get(i) instanceof Triangle) {
                Triangle triangleRef = (Triangle) allShapes.get(i);
                triangleRef.displayTriangleHeight();
            } else if (allShapes.get(i) instanceof Rectangle) {
                Rectangle rectangleRef = (Rectangle) allShapes.get(i);
                rectangleRef.displayRectangleHeight();
            } else {
                System.out.println("Is a Shape");
            }
        }
    }
}
