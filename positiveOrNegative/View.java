package positiveOrNegative;


public class View {
    public View(){
        System.out.println("Welcome");
    }

    public void showMenu(){
        System.out.println("""
                Please select an option:
                1. Set num
                2. Ask if the number is positive or negative
                \t0. Exit""");
    }

    public void askForInt(){
        System.out.println("Please enter an integer");
    }

    public void sayPositiveOrNegative(int num, String value){
        System.out.println(STR."The num \{num} is: \{value}");
    }

    public void sayGoodBye(){
        System.out.println("Thanks for using the program");
    }
}
