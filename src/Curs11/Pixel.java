package Curs11;

import java.util.Objects;

public class Pixel {
    private String color;

    public Pixel() {
        this.color = "#FFFFFF";
    }

    public Pixel(String color) {
        this.color = color;
    }

    public void setPixel(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Pixel: color " + color ;
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
        Pixel pixelObj = (Pixel) obj;
        return  ((super.equals(pixelObj)) && this.color.equals(pixelObj.color));
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}
