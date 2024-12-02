package Teacher;

public class Principal extends Teacher{
    public Principal(String nombre, int sueldo) {
        super(nombre, sueldo);
    }

    @Override
    public double getSueldo() {
        return super.getSueldo() * 1.25;
    }
}
