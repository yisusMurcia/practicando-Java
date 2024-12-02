package Figure;

public class Square extends Figure{
    double side;

    public Square(){
        super("Square");
        side = 1;
    }

    public Square(double side){
        super("Square");
        this.side = side;
    }

    @Override
    public String toString() {
        return STR."I´m a square, mi side is of \{side}";
    }

}
