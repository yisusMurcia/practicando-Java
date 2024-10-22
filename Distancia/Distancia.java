package Distancia;

public class Distancia {
    private double valorEnMillas;
    private double valorEnKilometros;
    public Distancia(){
        valorEnMillas = 0;
        valorEnKilometros = 0;
    }

    public double getValorEnMillas() {
        return valorEnMillas;
    }

    public void setValorEnMillas(double valorEnMillas) {
        this.valorEnMillas = valorEnMillas;
        valorEnKilometros = valorEnMillas / 1.852;
    }

    public double getValorEnKilometros() {
        return valorEnKilometros;
    }

    public void setValorEnKilometros(double valorEnKilometros) {
        this.valorEnKilometros = valorEnKilometros;
        valorEnMillas = 1.852 * valorEnKilometros;
    }
}
