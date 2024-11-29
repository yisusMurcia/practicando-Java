package Math;

public class Potencia {
    public static int potencia(int base, int exponente){
        int num = 1;
        for (int i = 0; i < exponente; i++){
            num *= base;
        }
        return num;
    }

    public static double potencia(double base, int exponente){
        double num = 1;
        for(int i = 0; i < exponente; i++){
            num*= base;
        }

        return num;
    }
}
