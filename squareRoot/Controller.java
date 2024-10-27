package squareRoot;

public class Controller {
    View view = new View();
    Num num;
    int option;
    public Controller(){
        num = new Num(getNoNegativeNum());

        do {
            view.showMenu();
            option = view.getOption();

            switch (option){
                case 1:
                    num.setNum(getNoNegativeNum());
                    break;
                case 2:
                    view.showSqrRoot(num.getNum(), num.getSqrt());
                    break;
                case 0:
                    view.sayGoodbye();
                    break;
                default:
                    view.notValidOption();
                    break;
            }

        }while(option != 0);
    }

    public double getNoNegativeNum(){//The num can´t be negative for get it square root
        double num;
        num = view.getANumber();
        while(num < 0){
            view.notValideNum();

            num = view.getANumber();
        }

        return num;
    }
}
