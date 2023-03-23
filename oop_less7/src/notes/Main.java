package notes;

import notes.controller.NotepadController;
import notes.models.*;
import notes.view.NotepadView;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        JsonDb jsonDb = new JsonDb("notes.json");
        TxtDb txtDb = new TxtDb("notice/");
        Repositoriable<Note> notesRepo = new RepoW(jsonDb, txtDb);
        NotepadController controller = new NotepadController(notesRepo);
        NotepadView view = new NotepadView(controller);
        view.run();
    }
}
