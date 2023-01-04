package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        System.out.println("Enter the radius of the circle?");
        Input a = new Input();
        double radius = a.getDouble();
        Circle circle = new Circle(radius);
        double circumference = circle.getCircumference();
        double area = circle.getArea();
        System.out.printf("Area is %s and circumference is %s.", area, circumference);

    }
}
