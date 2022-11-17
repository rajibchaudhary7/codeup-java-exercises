package shapes;
import static java.lang.Math.PI;

public class Circle {
    private double radius;
    public double area;
    public double circumference;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return area = PI * (radius * radius);
    }
    public double getCircumference(){
        return circumference = 2 * PI * radius;
    }

    public static void main(String[] args){
        Circle c = new Circle(4);
        System.out.println(c.getArea());
        System.out.println(c.getCircumference());

    }
}
