package evenOrOddBetweenNums;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class View {
    private Scanner scan;
    private int num;

    public View(){
        System.out.println("Welcome, this program return the even numbers between two given numbers");
        scan = new Scanner(System.in);
    }

    public void displayMenu(){
        System.out.println("""
                1. Set nums.
                2. Get even numbers
                3. Get odd numbers
                \t0. Exit""");
    }

    public int getOption(){
        System.out.println("Please enter an option");
        try {
            num = scan.nextInt();
        }catch (InputMismatchException e){
            scan.nextLine(); //Limpiar scanner
            num = getOption();
        }

        return num;
    }

    public int getNum(){
        System.out.println("Please enter a number");
        try {
            num = scan.nextInt();
        }catch (InputMismatchException e){
            scan.nextLine(); //Limpiar scanner
            num = getNum();
        }

        return num;
    }

    public void displayNums(List<Integer> nums){
        System.out.println("The nums are:");
        for (int num : nums){
            System.out.println(STR."# \{num}");
        }
    }

    public void alertNoEvenNums(int startNum, int finalNum){
        System.out.println(STR."Sorry honey, but there isn´t even nums between \{startNum} and \{finalNum}");
    }

    public void alertNoOddNums(int startNum, int finalNum){
        System.out.println(STR."Sorry honey, but there isn´t odd nums between \{startNum} and \{finalNum}");
    }

    public void sayGoodbye(){
        System.out.println("Thanks for using the program");
        scan.close();
    }

    public void alertOptionNotValid(){
        System.out.println("Sorry, there isn´t a valid option");
    }
}
