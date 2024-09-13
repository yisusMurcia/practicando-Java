package temperatura;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args){
        Temperature temperature = new Temperature();
        Scanner scan = new Scanner(System.in);
        System.out.println("Celcius: " + temperature.getCelcius() + "Farenheit:" + temperature.getFarenheit());
        temperature.setFarenheit(scan.nextDouble());
        System.out.println("Celcius: " + temperature.getCelcius() + "Farenheit:" + temperature.getFarenheit());
        scan.close();
    }
}
