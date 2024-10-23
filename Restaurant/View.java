package Restaurant;

public class View {
    public View(){
        System.out.println("Welcome to the restaurant");
    }

    public void showMenu(){
        System.out.println("""
                Please select an option:
                1: Serve plate.
                2: Display inventory.
                3: Supply eggs
                4: Supply chorizo""");
    }

    public void askForEggs(){
        System.out.println("Enter the amount of dozen eggs to add at inventory");
    }

    public void askForChorizo(){
        System.out.println("Enter the amount of kilos of chorizo to add at inventory");
    }

    public void displayInventory(int numOfEggs, double gramesOfChorizos, int dishes){
        System.out.println(STR."Eggs: \{numOfEggs}\nChorizo: \{gramesOfChorizos} grames\n Dishes: \{dishes}");
    }

    public void servePlate(){
        System.out.println("The dish is served");
    }

    public void closeProgram(){
        System.out.println("Thanks for using the program, have a nice day");
    }
}
