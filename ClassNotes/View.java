package ClassNotes;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class View {
    private final Scanner scan;


    public View(){
        scan = new Scanner(System.in);

        System.out.println("Welcome, this program allows you to register the notes of your  30 students, or less");
    }

    public void displayMenu(){
        System.out.println("""
                Option 1: Set students notes
                Option 2: Add more students
                Option 3: Get pass students
                Option 4: Get no pass students
                \tOption 0: Exit""");
    }

    public String getName(){
        scan.nextLine();
        System.out.println("Enter the student´s name");
        return scan.nextLine();
    }

    public int getNotes(){
        System.out.println("Enter the student note, for exit, enter a 0");
        int note;
        try {
            note = scan.nextInt();
        }catch (InputMismatchException e){
            scan.next();
            System.out.println("Input not valid, please try again");
            note = getNotes();
        }

        return note;
    }

    public int getOption(){
        System.out.println("Please enter an option");
        int option;
        try {
            option = scan.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Input not valid, try again");
            scan.next();
            option = getOption();
        }

        return option;
    }

    public boolean continueAddingStudents(){
        String answer;
        do{
            System.out.println("Enter 'y' for continue adding estudents or 'n' for stop");
            answer = scan.next();
        }while (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n"));

        return answer.equalsIgnoreCase("y");
    }

    public void noValidOption(){
        System.out.println("This isn´t a valid option");
    }

    public void alertNoValidNote(){
        System.out.println("The notes are between 1 and 10, 0 for exit");
    }

    public void displayPassStudents(ArrayList<Student> students){
        System.out.println("Pass students:");
        for (Student student : students){
            System.out.println(STR."\t\{student.getName()}: \{student.getNotes()}");
        }
    }

    public void displayNoPassStudents(ArrayList<Student> students){
        System.out.println("No Pass students:");
        for (Student student : students){
            System.out.println(STR."\t\{student.getName()}: \{student.getNotes()}");
        }
    }

    public void sayGoodbye(){
        System.out.println("Thanks for using the program");
        scan.close();
    }
}
