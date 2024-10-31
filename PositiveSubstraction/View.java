package PositiveSubstraction;

import java.util.Scanner;

public class View {
    Scanner scan;
    public View(){
        System.out.println("Welcome, this program substracts two diferentes num, without get enay negative number");
        scan = new Scanner(System.in);
    }

    public void displayNum(int num){
        System.out.println(STR."The num is: \{num}");
    }

    public int getInt(){
        System.out.println("Please insert a number:");
        return scan.nextInt();
    }

    public void closeProgram(){
        System.out.println("Thanks for using this program");
        scan.close();
    }
}
