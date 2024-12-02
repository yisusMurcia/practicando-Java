package Teacher;

public class AplMain {
    public static void main(String[] args){
        Teacher teacher = new Teacher("Villada", 120);
        System.out.println(teacher);

        Principal principal = new Principal("Ratazona", 51000);
        System.out.println(principal);
    }
}
