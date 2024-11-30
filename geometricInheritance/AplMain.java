package geometricInheritance;

public class AplMain {
    public static void main(String[] args){
        Circle circle = new Circle(2);
        System.out.println(circle);

        circle.setColor("Blue");

        System.out.println(circle);

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        System.out.println(rectangle.getArea());

        Square square = new Square(2, "Verde", true);

        System.out.println(square);

        square.setHeight(6);
        System.out.println(square);
    }
}
