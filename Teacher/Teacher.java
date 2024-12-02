package Teacher;

public class Teacher {
    private String nombre;
    private double sueldo;

    public Teacher(String nombre, int sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return STR."Hi, i´m \{getNombre()} and I earn \{getSueldo()}";
    }
}
