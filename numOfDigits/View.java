package numOfDigits;

import java.util.InputMismatchException;
import java.util.Scanner;

public class View {
    private Scanner scan;
    private int num;

    public View(){
        System.out.println("Welcome, this code get the num of digits of a num");
        scan = new Scanner(System.in);
    }

    public void displayMenu(){
        System.out.println("""
                1. Set num
                2. Get num of digits
                \t 0. Exit""");
    }

    public int getOption(){
        System.out.println("Please enter an option");

        try{
            num = scan.nextInt();
        }catch (InputMismatchException e){
            scan.nextLine(); //Limpiar el escaner
            System.out.println("Something fail, try again");
            num = getOption();
        }

        return num;
    }

    public int getNum(){
        System.out.println("Please enter a num");

        try{
            num = scan.nextInt();
        }catch (InputMismatchException e){
            scan.nextLine(); //Limpiar el escaner
            System.out.println("Something fail, try again");
            num = getNum();
        }
        return num;
    }

    public void displayOptionNotValid(){
        System.out.println("Option not valid");
    }

    public void displayNumOfdigits(int num, int numOfDigits){
        System.out.println(STR."\{num} has \{numOfDigits} digits");
    }

    public void sayGoodbye(){
        scan.close();
        System.out.println("Thanks for using the code");
    }
}
