package src.shapes;


public class Square extends Quadrilateral{

    public Square(double width, double length){
        super(width, length);
    }

    public double getPerimeter(){
        return this.width * 2 + this.length * 2;
    }
    public double getArea(){
        return this.width * this.length;
    }
}
