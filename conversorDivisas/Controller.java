package conversorDivisas;

import java.util.Scanner;

public class Controller {
    public  static void main(String[] args){
        int option;
        Scanner scan = new Scanner(System.in);
        ConversorDivisas converter = new ConversorDivisas();

        System.out.println("Welcome to the the currency converter");

        do {
            System.out.println("""
                    Select one option:
                    Option 1: Convert  Euros to libras
                    Option 2: Convert libras to euros
                    Option 3: Upgrade foreign exchang´s value
                    Option 4: Show exchange value
                    \tOption 0: Exit""");
            option = scan.nextInt();

            switch (option){
                case 0:
                    break;
                case 1:
                    convertToLibras(converter, scan);
                    break;
                case 2:
                    convertToEuro(converter, scan);
                    break;
                case 3:
                    upgradeexchangevalue(scan, converter);
                    break;
                case 4:
                    seeExchangeValue(converter);
                    break;
                default: System.out.println("Enter a valide option");
            }
        }while (option != 0);

        System.out.println("Thanks for  using this program");
    }

    public static double getNumber(Scanner scan){
        double num;
        System.out.println("Enter the amount of money");
        num = scan.nextDouble();
        return num;
    }

    public static void convertToLibras(ConversorDivisas conventer, Scanner scan){
        double num = getNumber(scan);
        System.out.println(STR."The value of num in libras is \{conventer.euroToLibra(num)}");
    }

    public static void convertToEuro(ConversorDivisas conventer, Scanner scan){
        double num = getNumber(scan);
        System.out.println(STR."The value of num in euros is \{conventer.librasToEuro(num)}");
    }

    public static void upgradeexchangevalue(Scanner scan, ConversorDivisas conventer){
        double exchangeValue;

        System.out.println("Enter the value of a Euro in libras");
        exchangeValue = scan.nextDouble();
        conventer.setValorDeCambio(exchangeValue);

        System.out.println(STR."The new exchange value is \{exchangeValue}");
    }

    public static void seeExchangeValue(ConversorDivisas converter){
        System.out.println(STR."The current exchange value is \{converter.getValorDeCambio()}");
    }
}
