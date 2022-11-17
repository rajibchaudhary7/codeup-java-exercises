package shapes;

public class Rectangle {
    protected double length;
    protected double width;
    public double area;
    public double perimeter;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        return area = length * width;
    }

    public double getPerimeter(){
        return perimeter = 2 * length + 2 * width;
    }

}
