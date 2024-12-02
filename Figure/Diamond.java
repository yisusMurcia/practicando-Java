package Figure;

public class Diamond extends Figure{
    double diagonal1;
    double diagonal2;

    public Diamond(){
        super("Diamond");
        diagonal1 = 1;
        diagonal2 = 1;
    }

    public Diamond(double diagonal1, double diagonal2){
        super("Diamond");
        this.diagonal2 = diagonal2;
        this.diagonal1 = diagonal1;
    }
    @Override
    public String toString() {
        return STR."I´m a diamond and my diagonals are \{diagonal1} and \{diagonal2}";
    }
}
