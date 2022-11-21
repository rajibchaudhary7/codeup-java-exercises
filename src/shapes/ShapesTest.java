package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(5,4);
//        System.out.println("Perimeter of Rectangle is: " + box1.getPerimeter());
//        System.out.println("Area of Rectangle is: "+ box1.getArea());
//
//        Rectangle box2 = new Square(5);
//        System.out.println("Perimeter of Square is: " + box2.getPerimeter());
//        System.out.println("Area of Square is: " + box2.getArea());

        Measurable myShape = new Rectangle(4, 5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
        Measurable myNewShape = new Square(4);
        System.out.println(myNewShape.getArea());
        System.out.println(myNewShape.getPerimeter());
//        System.out.println(myShape.getLength());
//        System.out.println(myShape.getWidth());
    }
}
