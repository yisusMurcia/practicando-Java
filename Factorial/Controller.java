package Factorial;

public class Controller {
    private final View view;

    public Controller(){
        view = new View();

        int option;

        do {
            view.displayMenu();

            option = view.getOption();

            switch (option){
                case 1:
                    displayFactorialInView(getPositveNum());
                    break;
                case 0:
                    view.sayGoodbye();
                    break;
                default:
                    view.alertNotValidOption();
            }
        }while (option != 0);

    }

    private void displayFactorialInView(int num){
        try {
            view.displayFactorialNum(num, getFactorial(num));
        }catch (StackOverflowError e){
            view.alertPossibleBlowUp();
        }
    }

    private int getFactorial(int num){
        if(num < 2){
            return 1;//De una vez se valida que 0! = 1

        }else {
            num = num * getFactorial(num - 1);
        }

        return  num;
    }

    private int getPositveNum(){
        int num = view.getNum();

        while (num < 0){
            view.alertNotValidNum();
            num = view.getNum();
        }

        return num;
    }
}
