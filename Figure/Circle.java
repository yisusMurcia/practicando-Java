package Figure;

public class Circle extends Figure{
    double ratio;

    public Circle(){
        super("Circle");
        ratio = 1;
    }

    public Circle(double ratio){
        super("Circle");
        this.ratio = ratio;
    }

    @Override
    public String toString() {
        return STR."Hi, i´m a circle and my ratio is \{ratio}";
    }

}
