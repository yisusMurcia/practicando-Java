package evensBetweenNums;

import java.util.List;

public class Controller {
    private View view;
    private BetweenNums betweenNums;
    private int option;
    private List<Integer> evenNums;

    public Controller(){
        view = new View();
        betweenNums = new BetweenNums(view.getNum(), view.getOption());
        do {
            view.displayMenu();

            option = view.getOption();

            switch (option){
                case 1 -> betweenNums.setNums(view.getNum(), view.getOption());
                case 2 -> displayEvenNums();
                case 0 -> view.sayGoodbye();
                default -> view.alertOptionNotValid();
            }
        }while (option != 0);
    }

    private void displayEvenNums(){
        evenNums = betweenNums.getEvenNumsBetween();
        if(evenNums.isEmpty()){
            view.alertNoEvenNums(betweenNums.getStartNum(), betweenNums.getFinalNum());
        }else{
            view.displayEvenNums(evenNums);
        }
    }
}
