package Task3.model;

import com.sun.org.apache.xpath.internal.operations.Mod;

/**
 * Created by dvsta on 09.11.2017.
 */
public class Model {
    NoteBook noteBook = new NoteBook();

    public NoteBook getNoteBook() {
        return noteBook;
    }

    public void setNoteBook(NoteBook noteBook) {
        this.noteBook = noteBook;
    }
}
