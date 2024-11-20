package ClassNotes;

import java.util.ArrayList;

public class Student {
    private final ArrayList<Integer> notes;
    private String name;

    public Student(String name){
        notes = new ArrayList<>();
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void addNote(int note){
        if (note != 0) {
            notes.add(note);
        }
    }

    public boolean isPassed(){
        double average = 0;
        for (int note : notes){
            average += note;
        }
        average /= notes.size();

        return average >= 5;
    }

    public ArrayList<Integer> getNotes() {
        return notes;
    }
}
