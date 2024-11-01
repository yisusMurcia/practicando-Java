package decimalPart;


import java.util.InputMismatchException;
import java.util.Scanner;

public class View {
    private final Scanner scan= new Scanner(System.in);

    public View(){
        System.out.println("Welcome, this program take a number and determinate if it´s whole or decimal");

    }

    public void displayMenu(){
        System.out.println("""
                Option 1: Set number
                Option 2: Evale number
                \tOption 0: Exit""");
    }

    public int getOption(){
        int num;
        System.out.println("Please enter an option:");
        try {
            num = scan.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Something goes wrong, try again");
            num = getOption();
        }

        return num;
    }

    public double getNum(){
        double num;
        System.out.println("Please enter a num:");
        try {
            num = scan.nextDouble();
        }catch (InputMismatchException e){
            System.out.println("Something goes wrong, try again");
            num = getOption();
        }

        return num;
    }

    public void displayResult(Num num){
        System.out.println(STR."The number \{num.getNum()} is\{num.isWholeNum()?"n´t": " "} decimal");
    }

    public void defaultMessage(){
        System.out.println("Invalid option, please enter a valid option");
    }

    public void sayGoodbye(){
        System.out.println("Thanks for using the program");
        scan.close();
    }
}
