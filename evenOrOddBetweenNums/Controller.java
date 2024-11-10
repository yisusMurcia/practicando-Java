package evenOrOddBetweenNums;

import java.util.List;

public class Controller {
    private View view;
    private BetweenNums betweenNums;
    private int option;
    private List<Integer> nums;

    public Controller(){
        view = new View();
        betweenNums = new BetweenNums(view.getNum(), view.getOption());
        do {
            view.displayMenu();

            option = view.getOption();

            switch (option){
                case 1 -> betweenNums.setNums(view.getNum(), view.getOption());
                case 2 -> displayEvenNums();
                case 3 -> displayOddNums();
                case 0 -> view.sayGoodbye();
                default -> view.alertOptionNotValid();
            }
        }while (option != 0);
    }

    private void displayEvenNums(){
        nums = betweenNums.getEvenNumsBetween();
        if(nums.isEmpty()){
            view.alertNoEvenNums(betweenNums.getStartNum(), betweenNums.getFinalNum());
        }else{
            view.displayNums(nums);
        }
    }

    private void displayOddNums(){
        nums = betweenNums.getOddNumsBetween();
        if(nums.isEmpty()){
            view.alertNoOddNums(betweenNums.getStartNum(), betweenNums.getFinalNum());
        }else{
            view.displayNums(nums);
        }
    }
}
