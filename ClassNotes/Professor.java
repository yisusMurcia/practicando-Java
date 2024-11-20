package ClassNotes;

import java.util.ArrayList;

public class Professor {
    private Student[] students;
    private int numOfStudents;

    public Professor(){
        students = new Student[30];
        numOfStudents = 0;
    }

    public void addStudent(Student student){
        students[numOfStudents] = student;
        numOfStudents++;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public ArrayList<Student> getPassStudents(){
        ArrayList<Student> passStudents = new ArrayList<>();
        for (int i = 0; i < numOfStudents; i++){
            if(students[i].isPassed()){
                passStudents.add(students[i]);
            }
        }

        return passStudents;
    }

    public ArrayList<Student> getNoPassStudents(){
        ArrayList<Student> noPassStudents = new ArrayList<>();


        for (int i = 0; i < numOfStudents; i++){
            if(!students[i].isPassed()){
                noPassStudents.add(students[i]);
            }
        }

        return  noPassStudents;
    }

    public void resetListOfStudents(){
        students = new Student[30];
        numOfStudents = 0;
    }
}
