package Fibonacci;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class View {
    private final Scanner scan;

    public View(){
        scan = new Scanner(System.in);
        System.out.println("Welcome, this code allows you to get a Fibonacci number");
    }

    public void displayMenu(){
        System.out.println("""
                Option 1: Get fibonacci series
                Option 2: Get a fibonacci num
                \tOption 0: Exit""");
    }

    public  void sayGoodbye(){
        System.out.println("Thanks for using this program");
        scan.close();
    }

    public int getOption(){
        int num;
        System.out.println("Please enter an option");
        try{
            num = scan.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Something go wrong, try again");
            scan.next();
            num = getOption();
        }

        return num;
    }

    public int getFibonacciPosition(){
        int position;
        System.out.println("Please enter the position of the number in the fibonacci series");

        try{
            position = scan.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Something go wrong, try again");
            scan.next();

            position = getFibonacciPosition();
        }

        return position;
    }

    public void alertNotValidOption(){
        System.out.println("This isn´t a valid option");
    }

    public void displayFibonacciList(int position, List<Integer> fibonacciNum){
        System.out.println(STR."The numbers until the position \{position} are: \{fibonacciNum}");
    }

    public void displayFibonacciNum(int position, int num){
        System.out.println(STR."The number in the position \{position} of the fibonnaci series is: \{num}");
    }

    public void alertInvalidPosition(){
        System.out.println("This isn´t a valid position, it must be greater than 0");
    }
}
