package LeapYear;

import java.util.InputMismatchException;
import java.util.Scanner;

public class View {
    private final Scanner scan = new Scanner(System.in);

    public View(){
        System.out.println("Welcome, this program determines if a year is leap");
    }

    public void displayMenu(){
        System.out.println("""
                Option 1: Set year
                Option 2: Determines if is a leap year
                \tOption 0: Exit""");
    }

    public int getOption(){
        int num;
        try {
            System.out.println("Please enter an option:");
            num = scan.nextInt();
        }catch(Error e){
            System.out.println("Input not valid, try again");
            num = getOption();
        }
        return  num;
    }

    public int getYear(){
        int num;
        try {
            System.out.println("Please enter a year:");
            num = scan.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Input not valid, try again");
            scan.nextLine();
            num = getYear();
        }
        return  num;
    }

    public void sayIfIsLeapYear(int year, boolean leapYear){
        System.out.println(STR."The year \{year} is\{leapYear? "" : "n´t"} leap");
    }

    public void optionNotValid(){
        System.out.println("The option isn´t valid");
    }

    public void sayGoodbye(){
        System.out.println("Thanks for using the program");
        scan.close();
    }
}
