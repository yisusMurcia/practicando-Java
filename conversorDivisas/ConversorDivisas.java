package conversorDivisas;

public class ConversorDivisas {
    double valorDeCambio;
    public ConversorDivisas(){
        valorDeCambio = 0.85;
        System.out.println("El valor de cambio entre euros y libras es de 0.85");
    }

    public ConversorDivisas(double valorDeCambio){
        this.valorDeCambio = valorDeCambio;
        System.out.println("El valor de cambio entre euros y libras es de " + valorDeCambio);
    }

    public double librasTOEuro(double libras){
        return  libras/ valorDeCambio;
    }

    public double euroToLibra(double euro){
        return euro * valorDeCambio;
    }

    public void setValorDeCambio(double valorDeCambio) {
        this.valorDeCambio = valorDeCambio;
    }
}
