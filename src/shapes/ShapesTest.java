package src.shapes;

public class ShapesTest {
    public static void main(String[] args){
        Rectangle rectangle =  new Rectangle(4, 5);
        Rectangle box2 = new Square(5);


        System.out.format("The Rectangles perimeter is: %s\n", rectangle.perimeter());
        System.out.format("The Rectangles area is: %s\n", rectangle.area());

        System.out.format("The Squares perimeter is: %s\n", box2.perimeter());
        System.out.format("The Squares area is: %s\n", box2.area());
    }
}
