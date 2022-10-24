package src.shapes;

public abstract class Quadrilateral extends Shape implements Measurable{
    protected double width, length;

    public Quadrilateral(double width, double length) {
       this.width =  width;
       this.length = length;
    }

    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setLength(double length){this.length = length;}
}
