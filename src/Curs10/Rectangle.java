package Curs10;

public class Rectangle extends Shape{
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String text, String material, int width, int height) {
        super(text, material);
        this.width = width;
        this.height = height;
    }

    public void displayRectangleHeight(){
        System.out.println("Rectangle height is: " + this.height);
    }

    @Override
    public double getSize(){
        return (width * height);
    }

    @Override
    public String toString(){
        return "Rectangle: height is: " + this.height + ", width is: " + this.width + "," + super.toString();
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null){
            return false;
        }
        if (this.getClass() != obj.getClass()){
            return false;
        }
        Rectangle rectangleObj = (Rectangle) obj;
        return ((super.equals(rectangleObj)) && this.width == rectangleObj.width && this.height == rectangleObj.height);
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((width == 0) ? 0 : width);
        result = prime * result + ((height == 0) ? 0 : height);
        return result;
    }
}
