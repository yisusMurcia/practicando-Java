package sortedNumbers;

import java.util.InputMismatchException;
import java.util.Scanner;

public class View {
    private final Scanner scan;

    public View(){
        scan = new Scanner(System.in);
        System.out.println("Welcome, this code compare a sort of three numbers");
    }

    public void displayMenu(){
        System.out.println("""
                Option 1: Set numbers.
                Option 2: Compare if the numbers are in order
                Option 3: Compare if the numbers are consecutive
                \tOption 0: Exit""");
    }
    
    public int getOption(){
        int num;
        System.out.println("Please enter an option:");
        
        try{
            num = scan.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Input not valid, try again");
            scan.nextLine(); //Limpiar el scanner
            num = getOption();
        }
        
        return num;
    }
    
    public int[] setNums(){
        int[] nums = new int[3];
        
        for (int i = 0; i < 3; i++){
            nums[i] = getNum();
        }
        
        return  nums;
    }

    public int getNum(){
        int num;
        System.out.println("Please enter a num:");

        try{
            num = scan.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Input not valid, try again");
            scan.nextLine(); //Limpiar el scanner
            num = getNum();
        }

        return num;
    }

    public void sayGoodbye(){
        System.out.println("Thanks for using this code, have a nice day");
        scan.close();
    }

    public void numsInOrder(boolean inOrder){
        System.out.println(STR."The numbers are\{inOrder? " ": "n´t " }in order");
    }

    public void numsConsecutive(boolean areConsecutive){
        System.out.println(STR."The numbers are\{areConsecutive? " ": "n´t " }consecutive");
    }

    public void optionNotValid(){
        System.out.println("This option isn´t valid");
    }
}
