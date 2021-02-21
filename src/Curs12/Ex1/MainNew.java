package Curs12;

public class MainNew {
    public static void main(String[] args) {




        TriangleNew triangle = new TriangleNew("I reflect light", "glass", 23, 11);
        TriangleNew triangle2 = new TriangleNew("I reflect light", "glass", 23, 11);
        TriangleNew triangle3 = new TriangleNew("I reflect light", "glass", 13, 24);


        RectangleNew rectangle = new RectangleNew("Yellow rectangle", "steel", 10, 50);
        RectangleNew rectangle2 = new RectangleNew("Yellow rectangle", "steel", 10, 50);
        RectangleNew rectangle3 = new RectangleNew("Yellow rectangle", "steel", 52, 14);



        System.out.println(triangle.getSize());
        System.out.println(triangle.equals(triangle2));
        System.out.println(triangle.equals(triangle3));
        System.out.println(triangle.toString());
        System.out.println(triangle.hashCode());
        triangle.displayShapeHeight();

        System.out.println(rectangle.getSize());
        System.out.println(rectangle.equals(rectangle2));
        System.out.println(rectangle.equals(rectangle3));
        System.out.println(rectangle.toString());
        System.out.println(rectangle.hashCode());
        rectangle.displayShapeHeight();



    }
}
