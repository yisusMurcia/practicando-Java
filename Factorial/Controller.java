package Factorial;

import java.math.BigInteger;

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
                    displayFactorialInView(getPositiveNum());
                    break;
                case 0:
                    view.sayGoodbye();
                    break;
                default:
                    view.alertNotValidOption();
        }
    }while (option != 0);

    }

    private void displayFactorialInView(BigInteger num){
        BigInteger factorial = num;
        if (num.intValue() == 0){
            factorial = new BigInteger("1");
        }
        try {
            for (int i = 1; i < num.intValue(); i++){
                factorial = factorial.multiply(BigInteger.valueOf(i));
            }
            view.displayFactorialNum(num, factorial);
        }catch (StackOverflowError e){
            view.alertPossibleBlowUp();
        }
    }

    private BigInteger getPositiveNum(){
        BigInteger num = view.getNum();

        while (num.intValue() < 0){
            view.alertNotValidNum();
            num = view.getNum();
        }

        return num;
    }
}
