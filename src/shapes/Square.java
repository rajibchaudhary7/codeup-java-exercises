package shapes;

//public class Square extends Rectangle{
//    public double side;
//    public Square(double side){
//        super(side, side);
//        this.side = side;
//    }
//
//
//    public double getPerimeter(){
//        return 4 * side;
//    }
//
//    public double getArea(){
//        return side * side;
//    }
//}
public class Square extends Quadrilateral{
    public  Square(double side){
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void setLength(double side) {
        this.length = side;
    }

    @Override
    public void setWidth(double side) {
        this.width = side;
    }
}