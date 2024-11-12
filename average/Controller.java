package average;

public class Controller {
    private final View view;
    private final Average average;

    public Controller() {
        view = new View();
        average = new Average();

        addNums();

        int option;
        do {
            view.displayMenu();

            option = view.getOption();

            switch (option){
                case 1:
                    average.clearNums();
                    addNums();
                    break;
                case 2:
                    view.displayAverage(average.getAverage());
                    break;
                case 3:
                    addNums();
                    break;
                case 0:
                    view.sayGoodbye();
                    break;
                default:
                    view.alertNoValidOption();
            }
        }while (option != 0);
    }

    private void addNums(){
        int num;
        do {
            num = view.getNum();
            if(num > 0){
                average.addNum(num);
            }
        }while (num >= 0);

        average.setAverage();
        view.exitNumSetter();
    }
}
