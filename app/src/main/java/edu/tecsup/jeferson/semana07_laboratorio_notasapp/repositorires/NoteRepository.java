package edu.tecsup.jeferson.semana07_laboratorio_notasapp.repositorires;

import java.util.ArrayList;
import java.util.List;

import edu.tecsup.jeferson.semana07_laboratorio_notasapp.models.Note;

/**
 * Created by Alumno on 10/2/2017.
 */

public class NoteRepository {

    private static final String TAG = NoteRepository.class.getSimpleName();

    private static List<Note> notes = new ArrayList<>();

    public static List<Note> getNotes() {
        return notes;
    }

    private static long sequence = 1;

    public static Note add (Note note){
        note.setId(sequence++);
        notes.add(0, note);
        return note;
    }
    
}
