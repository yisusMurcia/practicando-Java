package average;

import java.util.InputMismatchException;
import java.util.Scanner;

public class View {
    private final Scanner scan;
    private int num;

    public View() {
        scan = new Scanner(System.in);
        System.out.println("Welcome, this program calculate the average of integers positives nums");
    }

    public void displayMenu(){
        System.out.println("""
                1. Set numbers
                2. Get average
                3. Add more nums
                \t0. Exit""");
    }

    public int getOption(){
        System.out.println("Please enter an option");
        try{
            num = scan.nextInt();
        }catch (InputMismatchException e){
            scan.nextLine(); //Limpiar scanner
            System.out.println("Something goes wrong, lets try again");
            num = getOption();
        }

        return num;
    }

    public int getNum(){
        System.out.println("Please enter a number, enter a negative number for exit");
        try{
            num = scan.nextInt();
        }catch (InputMismatchException e){
            scan.nextLine(); //Limpiar scanner
            System.out.println("Something goes wrong, lets try again");
            num = getNum();
        }

        return num;
    }

    public void alertNoValidOption(){
        System.out.println("This option isn´t valid");
    }

    public void exitNumSetter(){
        System.out.println("The numbers are set");
    }

    public void displayAverage(double average){
        System.out.println(STR."The average is \{average}");
    }

    public void sayGoodbye(){
        scan.close();
        System.out.println("Thanks for using the program, have a nice day");
    }
}
