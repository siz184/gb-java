package notes.models;

import java.io.IOException;
import java.util.List;

public class RepoW implements Repositoriable<Note> {

    private Repositoriable repo;

    public RepoW(JsonDb jsonDb, TxtDb txtDb) {
        repo = new Repository(jsonDb, txtDb);
    }

    @Override
    public List<Note> getAll() {
        return repo.getAll();
    }

    @Override
    public Note create(Note newNote) throws IOException {
        return (Note) repo.create(newNote);
    }

    @Override
    public boolean delete(Note note) throws IOException {
        return repo.delete(note);
    }

    @Override
    public boolean update(Note note) throws IOException {
        return repo.update(note);
    }

    @Override
    public List<Note> find(String request) {
        return repo.find(request);
    }

    @Override
    public Note getById(List<Note> notes, String id) {
        return (Note) repo.getById(notes, id);
    }

    @Override
    public void saveRepo(List<Note> items) throws IOException {
        repo.saveRepo(items);
    }
}
