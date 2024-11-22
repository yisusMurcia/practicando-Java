package Factorial;

import java.util.InputMismatchException;
import java.util.Scanner;

public class View {
    private final Scanner scan;
    private int option;

    public View(){
        scan = new Scanner(System.in);
        System.out.println("Welcome, this program allows you to get any factorial");
    }

    public void displayMenu(){
        System.out.println("""
                1. Get factorial
                2. Exit""");
    }

    public int getNum() {
        System.out.println("Please enter a positive num");
        int num;
        try {
            num = scan.nextInt();
        }catch (InputMismatchException e){
            scan.next();
            System.out.println("Something go wrong, please try again");
            num = getNum();
        }
        return num;
    }

    public int getOption() {
        System.out.println("Please select an option");
        try {
            option = scan.nextInt();
        }catch (InputMismatchException e){
            scan.next();
            System.out.println("Something go wrong, please try again");
        }
        return option;
    }

    public void alertNotValidNum(){
        System.out.println("This num isn´t valid");
    }

    public void displayFactorialNum(int num, int factorial){
        System.out.println(STR."\{num}! = \{factorial}");
    }

    public void alertNotValidOption(){
        System.out.println("This option isn´t valid");
    }

    public void alertPossibleBlowUp(){
        System.out.println("Are you crazy, you´re going to blow up this device");
    }

    public void sayGoodbye(){
        System.out.println("Thanks for using the program, blessings");
        scan.close();
    }
}
