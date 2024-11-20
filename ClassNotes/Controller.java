package ClassNotes;

public class Controller {
    private final Professor professor;
    private final View view;

    public Controller(){
        view = new View();
        professor = new Professor();

        setStudents();

        int option;
        do {
            view.displayMenu();
            option = view.getOption();

            switch (option){
                case 1:
                    professor.resetListOfStudents();
                case 2:
                    setStudents();
                    break;
                case 3:
                    view.displayPassStudents(professor.getPassStudents());
                    break;
                case 4:
                    view.displayNoPassStudents(professor.getNoPassStudents());
                    break;
                case 0:
                    view.sayGoodbye();
                    break;
                default:
                    view.noValidOption();
                    break;
            }
        }while (option != 0);
    }

    private void setStudents(){
        do {
            setStudent();
        }while (view.continueAddingStudents() && professor.getNumOfStudents() < 30);
    }

    private void setStudent(){
        Student student = new Student(view.getName());

        int note;
        do {
            //Obtener nota valida
            do {
                note = view.getNotes();
            }while (!validateNote(note));

            student.addNote(note);
        }while (note != 0);

        professor.addStudent(student);
    }

    private boolean validateNote(int note){
        if (note < 0 || note > 10){
            view.alertNoValidNote();
            return false;
        }

        return true;
    }
}
