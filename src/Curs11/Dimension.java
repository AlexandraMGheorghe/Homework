package Curs11;

import java.util.Objects;

public class Dimension {
    private final int width;
    private final int length;
    private final int depth;

    public Dimension(int width, int length, int depth) {
        this.width = width;
        this.length = length;
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "Dimension: Width " + width + ", length " + length + ", depth " + depth ;
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
        Dimension dimensionObj = (Dimension) obj;
        return  ((super.equals(dimensionObj)) && this.width == dimensionObj.width && this.length == dimensionObj.length
        && this.depth == dimensionObj.depth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, length, depth);
    }
}
