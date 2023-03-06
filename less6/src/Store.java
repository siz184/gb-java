import java.util.*;

public class Store {
    private List<Notebook> notebooks = new ArrayList<>();
    public List<Notebook> getNotebooks() {
        return notebooks;
    }
    public Store addNotebook(Notebook notebook){
        this.notebooks.add(notebook);
        return this;
    }
    public List findNotebooks(Map<Integer, String> filters){
        List<Notebook> notebooks = new ArrayList<>();
        for(Notebook notebook : getNotebooks()){
            boolean exist = true;
            for(Map.Entry<Integer, String> entry : filters.entrySet()){
                if(filters.containsKey(1)) {
                    if (notebook.getMemory() < Integer.parseInt(entry.getValue())) {
                        exist = false;
                    }
                }
                if(filters.containsKey(2)) {
                    if (notebook.getHdd() < Integer.parseInt(entry.getValue())) {
                        exist = false;
                    }
                }
                if(filters.containsKey(3)) {
                    if (!notebook.getOs().equals(entry.getValue())) {
                        exist = false;
                    }
                }
                if(filters.containsKey(4)) {
                    if (!notebook.getColor().equals(entry.getValue())) {
                        exist = false;
                    }
                }
                if(exist){
                    notebooks.add(notebook);
                }
            }

        }
        return notebooks;
    }
    public String toString(){
        StringBuilder showNotebooks = new StringBuilder();
        for (Notebook notebook : this.getNotebooks()){
            showNotebooks.append(notebook.toString())
                    .append("\n");
        }
        return showNotebooks.toString();
    }
}
