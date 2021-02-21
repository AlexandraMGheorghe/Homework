package Curs12;

import Curs10.Shape;

public class TriangleNew extends Shape {
    private int base;
    private int height;

    public TriangleNew(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public TriangleNew(String text, String material, int base, int height) {
        super(text, material);
        this.base = base;
        this.height = height;
    }

    public void displayShapeHeight(){
        System.out.println("Triangle height is: " + this.height);
    }

    public double getSize1(){
        return ((this.base * this.height) / 2.00);
    }

    @Override
    public String toString(){
        return "Triangle: height is: " + this.height + ", base is: " + this.base + "," + super.toString();
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
        TriangleNew triangleObj = (TriangleNew) obj;
        return ((super.equals(triangleObj)) && this.base == triangleObj.base && this.height == triangleObj.height);
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((base == 0) ? 0 : base);
        result = prime * result + ((height == 0) ? 0 : height);
        return result;
    }
}
