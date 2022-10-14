package src.shapes;

public abstract class Quadrilateral extends Shape implements Measurable{
    protected double width, length;

    public Quadrilateral(double width, double length) {
       this.width =  width;
       this.length = length;
    }

    public double getWidth(){
        return this.width;
    }
    public double getLength(){
        return this.length;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setLength(double length){
        this.length = length;
    }
}
