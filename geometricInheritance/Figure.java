package geometricInheritance;

public class Figure{
    protected String color;
    protected boolean relleno;

    public Figure(){
        relleno = false;
        color = "rojo";
    }

    public Figure(String color, boolean relleno){
        this.color = color;
        this.relleno = relleno;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    @Override
    public String toString() {
        return STR."Soy una figura de color \{color} y \{relleno? "": "no "}rellena";
    }
}
