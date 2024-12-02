package Figure;

public abstract class Figure {
    String nombre;

    public Figure(String nombre){
        this.nombre = nombre;
    }

    public String identidad(){
        return toString();
    }

    public abstract String toString();
}
