package temperatura;

import java.util.*;

public class Temperature {
    private double celcius;
    private double  farenheit;

    public Temperature(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados celcius");
        celcius = scan.nextDouble();
        farenheit = 1.8 * celcius + 32;
        scan.close();
    }

    public double getCelcius() {
        return celcius;
    }

    public void setCelcius(double celcius) {
        this.celcius = celcius;
        farenheit = 1.8 * celcius + 32;
    }

    public double getFarenheit() {
        return farenheit;
    }

    public void setFarenheit(double farenheit) {
        this.farenheit = farenheit;
        celcius = (farenheit - 32)/1.8;
    }
}
