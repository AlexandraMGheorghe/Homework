package Curs12;

public abstract class ShapeNew {
    private String text;
    private String material;

    public ShapeNew() {
        this.text = "";
        this.material = "";
    }

    public ShapeNew(String text, String material) {
        this.text = text;
        this.material = material;
    }
    public abstract double getSize1();

    public abstract void displayShapeHeight();


    @Override
    public String toString(){
        return "made of " + this.material + ", contains the text: \"" + this.text + "\".";
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
        ShapeNew shapeObj = (ShapeNew) obj;
        return (this.text.equals(shapeObj.text) && this.material.equals(shapeObj.material));
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime * result + ((text == null) ? 0 : text.hashCode());
        result = prime * result + ((material == null) ? 0 : material.hashCode());
        return result;
    }

}
