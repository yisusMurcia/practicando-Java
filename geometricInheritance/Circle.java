package geometricInheritance;

import java.lang.classfile.instruction.ReturnInstruction;

public class Circle extends Figure{
    private double radio;

    public Circle(){
        super();
        radio = 1;
    }

    public Circle (double radio){
        super();
        this.radio = radio;
    }

    public Circle(double radio, String color, Boolean relleno){
        super(color, relleno);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea(){
        return Math.PI * radio * radio;
    }

    public double getPerimeter(){
        return Math.PI * 2 * radio;
    }

    @Override
    public String toString() {
        return STR."Soy un circulo con radio = \{radio} y esta es mi superclase: \{super.toString()}";
    }
}
