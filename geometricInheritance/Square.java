package geometricInheritance;

public class Square extends Rectangle{
    double side;

    public Square(){
        super(1, 1);
    }

    public Square(double side){
        super(side, side);
    }

    public Square(double side, String color, boolean relleno){
        super(side, side, color, relleno);
    }

    private void setSide(double side){
        this.side = side;
        width = side;
        height = side;
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setHeight(double height) {
        setSide(height);
    }
}
