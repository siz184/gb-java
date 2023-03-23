package notes.view;

import notes.controller.NotepadController;
import notes.models.Note;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class NotepadView {
    private NotepadController notepadController;

    public NotepadView(NotepadController notepadController) {
        this.notepadController = notepadController;
    }

    public void run() {
        while (true) {
            try {
                String command = prompt("""
                        1 - create\n
                        2 - show one\n
                        3 - show all\n
                        4 - search\n
                        0 - exit\n
                        Your choice:""" + " ");
                switch (command) {
                    case "1" -> newNote();
                    case "2" -> pickNote();
                    case "3" -> showAll();
                    case "4" -> search();
                    case "0" -> {
                        return;
                    }
                }
            } catch (Exception e) {
                System.out.printf("Error: %s\n", e.getMessage());
            }
        }
    }

    private void newNote() throws IOException {
        String title = prompt("Title: ");
        String content = prompt("Body: ");
        notepadController.saveNote(new Note(title, content));
    }

    private void showAll() {
        List<Note> notes = notepadController.getAllNotes();
        if (!notes.isEmpty()) {
            for (Note note : notes) {
                System.out.println(note);
            }
        } else {
            System.out.println("There aren't any notes");
        }
    }

    private void pickNote() {
        String id = prompt("Note ID: ");
        Note note = notepadController.getNodeById(id);
        if (note != null) {
            System.out.println(note);
            try {
                String command = prompt("1 - edit\n2 - delete\nany char - exit\nYour choice: ");
                switch (command) {
                    case "1" -> updateNote(note);
                    case "2" -> deleteNote(note);
                }
            } catch (Exception e) {
                System.out.printf("Error: %s\n", e.getMessage());
            }

        } else {
            System.out.printf("There aren't ID = %s %n", id);
        }
    }

    private void search() {
        String request = prompt("Search: ");
        List<Note> foundNotes = notepadController.findNotes(request);
        if (!foundNotes.isEmpty()) {
            for (Note note : foundNotes) {
                System.out.println(note);
            }
        } else {
            System.out.println("Not found");
        }
    }

    private void deleteNote(Note note) {
        try {
            if (notepadController.deleteNote(note)) {
                System.out.printf("Note %s has deleted\n", note.getId());
            } else {
                System.out.println("Error!");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void updateNote(Note note) {
        try {
            String command = "";
            while (!command.equals("0")) {
                command = prompt("1 - edit title\n2 - edit body\n0 - save & exit\nYour choice: ");
                switch (command) {
                    case "1" -> note.setTopic(prompt("New title: "));
                    case "2" -> note.setContent(prompt("New body: "));
                }
            }
        } catch (Exception e) {
            System.out.printf("Error: %s\n", e.getMessage());
        }
        try {
            if (notepadController.updateNote(note)) {
                System.out.println(note);
            } else {
                System.out.println("Error!");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
