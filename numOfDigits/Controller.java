package numOfDigits;

public class Controller {
    private View view;
    private Num num;
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
                    view.displayNumOfdigits(num.getNum(), num.getNumOfDigit());
                    break;
                case 0:
                    view.sayGoodbye();
                    break;
                default:
                    view.displayOptionNotValid();
            }
        }while (option != 0);
    }
}
