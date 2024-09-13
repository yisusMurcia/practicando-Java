package miNumero;

import java.util.Scanner;
public class Controller{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MyNumero num = new MyNumero();
        int option;
        System.out.println("\t\tWelcome");
        do {
            System.out.println("Please select an option:\n Option 1: set new value \n Option 2: Get a multiple\n Option 3: Add \nOption 4: Subtract a number\nOption 5: See number value\n\t Option 0: Exit");
            option = scan.nextInt();
            switch (option) {
                case 1:
                    setnumberValue(scan, num);
                    break;
                case 2:
                    getAMultipler(scan, num);
                    break;
                case 3:
                    addNumber(scan, num);
                    break;
                case 4:
                    subtractNumber(scan, num);
                    break;
                case 5:
                    System.out.println(STR."The number is: \{num.getValor()}");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        } while (option != 0);
        scan.close();
    }

    public static void setnumberValue(Scanner scan, MyNumero num){
        System.out.println("Enter the new number value");
        num.setNum(scan.nextInt());
    }

    public static void getAMultipler(Scanner scan, MyNumero num){
        System.out.println(STR."Enter the value to multiply \{num.getValor()}");
        System.out.println(num.getMultipler(scan.nextInt()));
    }

    public static void addNumber(Scanner scan, MyNumero num){
        System.out.println(STR."Enter the value to add \{num.getValor()}");
        System.out.println(num.addNUm(scan.nextInt()));
    }

    public static void subtractNumber(Scanner scan, MyNumero num){
        System.out.println(STR."Enter the value to substract \{num.getValor()}");
        System.out.println(num.subtractNumber(scan.nextInt()));
    }
}