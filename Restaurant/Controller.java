package Restaurant;

import java.util.Scanner;

public class Controller {
    private View view = new View();
    private Restaurant restaurant;
    private int option;
    private Scanner scan = new Scanner(System.in);
    private int amountOfEggs;
    private double amountOfChorizo;

    public Controller(){
        view.askForEggs();
        amountOfEggs= getInt(scan);

        view.askForChorizo();
        amountOfChorizo = getDouble(scan);

        restaurant = new Restaurant(amountOfEggs, amountOfChorizo);

        do {
            view.showMenu();
            option = getInt(scan);

            switch (option){
                case 1:
                    view.servePlate();
                    restaurant.serveDish();
                    break;

                case 2:
                    view.displayInventory(restaurant.getNumOfEggs(), restaurant.getGramsOfChorizo(), restaurant.getAmountOfDishes());
                    break;

                case 3:
                    view.askForEggs();
                    amountOfEggs = getInt(scan);

                    restaurant.addEggs(amountOfEggs);
                    break;

                case 4:
                    view.askForChorizo();
                    amountOfChorizo = getDouble(scan);

                    restaurant.addChorizos(amountOfChorizo);
                    break;

                case 0:
                    view.closeProgram();
                    break;
            }
        }while(option != 0);

        scan.close();
    }

    public int getInt(Scanner scan){
        return scan.nextInt();
    }

    public double getDouble(Scanner scan){
        return scan.nextDouble();
    }
}
