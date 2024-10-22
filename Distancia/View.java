package Distancia;

public class View {
    public View(){
        System.out.println("Hello, check out this code");
    }

    public void showMenu(){
        System.out.println("""
                Select an option":
                1. Convert miles to km
                2. Convert Km to miles
                0. Exit""");
    }

    public void askForValue(String measurer){
        System.out.println(STR."Enter the value in \{measurer}");
    }

    public void displayResult(double value, String measurer){
        System.out.println(STR."The value in \{measurer} is \{value}");
    }

    public void sayGoodbay(){
        System.out.println("Thnanks for using the programm");
    }
}
