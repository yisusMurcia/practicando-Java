package Restaurant;

public class Restaurant {
    private int numOfEggs;
    private double gramesOfChorizo;
    private int amountOfDishes;

    public Restaurant(int numOfDozensOfEggs, double kilosOfChorizo){
        numOfEggs = numOfDozensOfEggs * 12;
        gramesOfChorizo = kilosOfChorizo * 1000;

        calcAmountOfDishes();
    }

    private void calcAmountOfDishes(){
        int dishesByEggs = numOfEggs / 2;
        int dishesByChorizos = (int) (gramesOfChorizo / 200);


        amountOfDishes=  Math.min(dishesByEggs, dishesByChorizos);
    }

    public int getNumOfEggs() {
        return numOfEggs;
    }

    public double getGramesOfChorizo() {
        return gramesOfChorizo;
    }

    public int getAmountOfDishes() {
        return amountOfDishes;
    }

    public void addEggs(int dozensOfEggs){
        numOfEggs += dozensOfEggs*12;

        calcAmountOfDishes();
    }

    public void addChorizos(double kilosOfChorizo){
        gramesOfChorizo += kilosOfChorizo * 1000;

        calcAmountOfDishes();
    }

    public void serveDish(){
        numOfEggs -= 2;
        gramesOfChorizo -= 200;

        calcAmountOfDishes();
    }
}
