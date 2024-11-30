package geometricInheritance;

public class Rectangle extends Figure{
    protected double width;
    protected double height;

    public Rectangle(){
        super();
        width = 1;
        height = 1;
    }

    public Rectangle(double width, double height){
        super();
        this.height = height;
        this.width = width;
    }

    public Rectangle(double width, double height, String color, boolean relleno){
        super(color, relleno);
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return height * width;
    }

    public double getPerimeter(){
        return 2 * height + 2 * width;
    }

    @Override
    public String toString() {
        return STR."Soy un cuadrado de \{width} ancho y \{height} alto, mi super clase es \{super.toString()}";
    }
}
