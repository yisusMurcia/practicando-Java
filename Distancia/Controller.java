package Distancia;

import java.util.Scanner;

public class Controller {
    private View view;
    private Distancia distancia;
    private int option;
    private double value;
    private Scanner scan;
    public Controller(){
        scan = new Scanner(System.in);
        view = new View();
        distancia = new Distancia();

        do{
            view.showMenu();
            option = getInt(scan);

            switch (option){
                case 1:
                    view.askForValue("miles");
                    value = getDouble(scan);
                    distancia.setValorEnMillas(value);
                    view.displayResult(distancia.getValorEnKilometros(), "Km");
                    break;
                case 2:
                    view.askForValue("Km");
                    value = getDouble(scan);
                    distancia.setValorEnKilometros(value);
                    view.displayResult(distancia.getValorEnMillas(), "miles");
                    break;
                case 0:
                    view.sayGoodbay();
                    scan.close();
            }
        }while (option != 0);
    }

    public double getDouble(Scanner scan){
        return scan.nextDouble();
    }
    public int getInt(Scanner scan){
        return scan.nextInt();
    }


}
