package Figure;

public class Triangle extends Figure{
    double side1;
    double side2;
    double side3;

    public Triangle(){
        super("Triangle");
        side1 = 1;
        side2 = 1;
        side3 = 1;
    }

    public Triangle(double lado1, double lado2, double lado3){
        super("Triangle");
        this.side1 = lado1;
        this.side2 = lado2;
        this.side3 = lado3;
    }
    @Override
    public String toString() {
        return STR."Hey, i´m a triangle and my sides are \{side1}, \{side2}, \{side3}";
    }
}
