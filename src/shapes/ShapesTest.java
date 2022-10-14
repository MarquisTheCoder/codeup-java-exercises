package src.shapes;

public class ShapesTest {
    public static void main(String[] args){

        Measurable myShape = new Measurable() {
            @Override
            public double getPerimeter() {
                return 0;
            }

            @Override
            public double getArea() {
                return 0;
            }
        };
        myShape = new Rectangle(4,5);
//        Rectangle box2 = new Square(5);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());
        System.out.println();
        myShape =  new Square(2,3);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());


//        code fails to execute if you leave getPerimeter off of the Rectangle class
//        because the Rectangle class is an implementation of the Measurable Interface
//        and all Interface methods must be Overridden before class instantiation.

//        The getLength and getWidth methods do not work for shapes because they are
//        Quadrilateral class methods, therefore a Shape instance object cannot access
//        those methods because it cannot reach that level of abstraction.
    }
}
