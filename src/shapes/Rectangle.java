package src.shapes;

public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    public int area(){
        System.out.println("Rectangle");
        return this.width * this.length;
    }
    public int perimeter(){
        System.out.println("Rectangle");
        return this.width * 2 + this.length * 2;
    }

}

class Square extends Rectangle{
    public Square(int side){
        super(side,side);

    }
    public int perimeter(){
        System.out.println("Square");
        return this.width * 4;
    }
    public int area(){
        System.out.println("Square");
        return (int) Math.pow(this.width, 2);
    }
}
