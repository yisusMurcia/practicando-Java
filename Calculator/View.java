package Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class View {
    private final Scanner scan;

    public View(){
        scan = new Scanner(System.in);
        System.out.println("Welcome, this is the first version of my calculator");
    }

    public void displayMainMenu(){
        System.out.println("""
                Option 1: Make calculations
                Option 2: Edit numbers
                \tOption 0: Exit""");
    }

    public double getNum(){
        double num;
        System.out.println("Enter a num");
        try{
            num = scan.nextDouble();

        }catch (InputMismatchException e){
            System.out.println("Something go wrong, try again");
            scan.next();

            num = getNum();
        }
        return num;
    }

    public int getOption(){
        int option;

        System.out.println("Please enter an option");

        try {
            option = scan.nextInt();
        }catch (InputMismatchException e){
            scan.next();

            System.out.println("Something go wrong, try again");

            option = getOption();
        }

        return option;
    }

    public void displayOperations(){
        System.out.println("""
                Available operations:
                \t+\t-\t*\t/""");
    }

    public String getOperation(){
        String operation;

        System.out.println("Please enter the operation that you would like to do");

        try{
            operation = scan.next();
        }catch (InputMismatchException e){
            alertNoValidOperation();
            scan.next();

            operation = getOperation();
        }
        return operation;
    }

    public void displayResult(Calculator calculator, String operation, double result){
        System.out.println(STR."\{calculator.getNum1()} \{operation} \{calculator.getNum2()} = \{result}");
    }

    public void sayGoodbye(){
        System.out.println("Thanks for using the program");
        scan.close();
    }

    public void displayNoValidOption(){
        System.out.println("This isn´t a valid option");
    }

    public void alertNoValidOperation(){
        System.out.println("Operation not valid, try again");
    }

    public void alertDivisionBy0(){
        System.out.println("Are you crazy?\nwhy you´re going to divide by 0\n By your device´s security, the result´ll be 0");
    }
}
