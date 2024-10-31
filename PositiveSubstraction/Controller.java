package PositiveSubstraction;

public class Controller {
    private View view;
    private PositiveNum num1;
    private PositiveNum num2;
    private PositiveNum result;

    public Controller(){
        view = new View();
        num1 = new PositiveNum(view.getInt());
        num2 = new PositiveNum(view.getInt());

        result = new PositiveNum((num1.getNum())- num2.getNum());

        view.displayNum(result.getNum());

    }
}
