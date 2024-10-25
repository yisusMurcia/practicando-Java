package positiveOrNegative;

import java.util.Scanner;

public class Controller {
    private Scanner scan;
    private View view;
    private Num num;
    private int option;

    public Controller(){
        scan = new Scanner(System.in);
        view = new View();
        num = new Num(getInt(scan));

        do {
            view.showMenu();

            option = getInt(scan);

            scan.nextLine();

            switch (option){
                case 1:
                    view.askForInt();
                    num.setNum(getInt(scan));
                    break;
                case 2:
                    view.sayPositiveOrNegative(num.getNum(), num.isPositiveOrNegative());
                    break;
                case 0:
                    view.sayGoodBye();
            }
        }while (option != 0);

        scan.close();
    }

    public int getInt(Scanner scan){
        return scan.nextInt();
    }
}
