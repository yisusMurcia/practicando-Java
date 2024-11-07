package sortedNumbers;

public class Controller {
    private final Nums nums;
    private int option;
    private View view;

    public Controller(){
        view = new View();
        nums = new Nums(view.setNums());

        do {
            view.displayMenu();
            option = view.getOption();
            switch (option){
                case 1:
                    nums.setNums(view.setNums());
                    break;
                case 2:
                    view.numsInOrder(nums.isOrder());
                    break;
                case 3:
                    if (nums.isOrder()){
                        view.numsConsecutive(nums.areNumsConsecutives());
                    }else{
                        view.numsInOrder(nums.isOrder());
                    }
                    break;
                case 0:
                    view.sayGoodbye();
                    break;
                default:
                    view.optionNotValid();
                    break;
            }
        }while(option != 0);
    }
}
