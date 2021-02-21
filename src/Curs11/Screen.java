package Curs11;

import Curs10.Triangle;

import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

public class Screen {
    private ArrayList <Pixel> pixels;
    private Dimension dimension;

    public Screen(int noPixels, int width, int length, int depth){
        this.pixels = new ArrayList<>();
        for(int i = 0; i<noPixels; i++ ){
            this.pixels.add(new Pixel());
        }
        this.dimension = new Dimension (width, length, depth);
    }

    public void setPixel(int indexOfPixel, String colorOfPixel){
        this.pixels.get(indexOfPixel).setPixel(colorOfPixel);
    }
    public void colorScreen (String color){
        for (Pixel allPixels : this.pixels){
            allPixels.setPixel(color);
        }
    }

    @Override
    public String toString(){
        return "Screen: pixels " + pixels + ", dimensions = " + dimension ;
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
        Screen screenObj= (Screen) obj;
        return  ((super.equals(screenObj)) && this.pixels == screenObj.pixels && this.dimension == screenObj.dimension);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pixels, dimension);
    }
}

