package squareRoot;

import java.util.Scanner;

public class View {
    Scanner scan = new Scanner(System.in);
    public View(){
        System.out.println("Welcome, this program get the square root of any number");
    }

    public void showMenu(){
        System.out.println("""
                1. Set number.
                2. Get square root.
                \t0.Exit""");
    }

    public double getANumber(){
        System.out.println("Please enter a number:");
        return scan.nextDouble();
    }

    public void notValideNum(){
        System.out.println("The number can´t be negative");
    }

    public int getOption(){
        System.out.println("Please select an option");
        return scan.nextInt();
    }

    public void showSqrRoot(double num, double sqrtRoot){
        System.out.println(STR."The square root of \{num} is \{sqrtRoot}");
    }

    public void notValidOption(){
        System.out.println("There isn´t a valid option");
    }

    public void sayGoodbye(){
        System.out.println("Thanks for using this program, have a nice day");
        scan.close();
    }
}
