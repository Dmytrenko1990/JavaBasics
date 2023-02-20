package project2;
/*Create an Interface 'Shape' with undefined
        methods as calculateArea and
        calculatePerimiter. Create 2 classes Circle &
        Square that implements functionality defined in
        the Shape Interface. Test your code.*/
public interface Shape {
    void calculateArea();
    void calculatePerimeter();
}
class Circle implements Shape{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    @Override
    public void calculateArea() {
        System.out.println(Math.PI*radius*radius);
    }
    @Override
    public void calculatePerimeter() {
        System.out.println(2*Math.PI*radius);
    }
}
class Square implements Shape{
    double side;
    Square(double side){
        this.side=side;
    }
    @Override
    public void calculateArea() {
        System.out.println(side*side);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println(4*side);
    }
}
class Test{
    public static void main(String[] args) {
    Shape[]elements={new Circle(3.0),new Square(3.0)};
    for(Shape calc:elements){
        calc.calculateArea();
        calc.calculatePerimeter();
    }
    }
}
