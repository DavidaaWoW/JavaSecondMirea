package Sixth.Prototype;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 4, "red");
        Shape circle = new Circle(3, "blue");
        Shape newCircle = circle.clone();
        Shape newRectangle = rectangle.clone();
        System.out.println(rectangle.toString());
        System.out.println(newRectangle.toString());
        System.out.println(circle.toString());
        System.out.println(newCircle.toString());
    }
}
