package decimalPart;

public class Controller {
    private final View view;
    private final Num num;
    private int option;

    public Controller(){
        view = new View();
        num = new Num(view.getNum());

        do {
            view.displayMenu();

            option = view.getOption();

            switch (option){
                case 1:
                    num.setNum(view.getNum());
                    break;
                case 2:
                    view.displayResult(num);
                    break;
                case 0:
                    view.sayGoodbye();
                    break;
                default:
                    view.defaultMessage();
                    break;
            }
        }while (option != 0);
    }
}
