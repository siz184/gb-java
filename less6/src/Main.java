import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Notebook note1 = new Notebook();
        note1.setNote(0, "Модель 1, Производитель 1, 50000, Win, 250, 8, Silver");
        Notebook note2 = new Notebook();
        note2.setNote(0, "Модель 2, Производитель 1, 60000, DOS, 250, 8, Black");
        Notebook note3 = new Notebook();
        note3.setNote(0, "Модель 3, Производитель 2, 70000, Nix, 250, 8, Black");
        Set<Notebook> notebooks = new HashSet<>();
        notebooks.add(note1);
        notebooks.add(note2);
        notebooks.add(note3);
        System.out.println(notebooks);
    }
}