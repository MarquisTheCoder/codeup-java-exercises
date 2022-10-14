package src.shapes;

import org.w3c.dom.css.Rect;

public class Rectangle extends Quadrilateral{
//    protected int length;
//    protected int width;

    public Rectangle(double width, double length){
        super(width, length);
    }
//    public int area(){
//        System.out.println("Rectangle");
//        return this.width * this.length;
//    }
//    public int perimeter(){
//        System.out.println("Rectangle");
//        return this.width * 2 + this.length * 2;
//    }
    public double getPerimeter(){
        return this.width * 2 + this.length * 2;
    }
    public double getArea(){
       return this.width * this.length;
    }

}
class Square extends Quadrilateral{
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

