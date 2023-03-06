import java.util.*;


public class Main {

    public class Constants {
        public static final Map<Integer,String> criterias = new HashMap<>();

    }
    public static void main(String[] args) {

        Constants.criterias.put(1, "ОЗУ");
        Constants.criterias.put(2, "Объем ЖД");
        Constants.criterias.put(3, "Операционная система");
        Constants.criterias.put(4, "Цвет");

        Map<Integer,String> chooseCriterias = new HashMap<>();


        Store store = new Store();
        store.addNotebook(new Notebook("Model 1","Asus", 50000.00,"Win",256,8,"Black"))
                .addNotebook(new Notebook("Model 2","Lenovo", 60000.00,"Win",256,16,"Black"))
                .addNotebook(new Notebook("Model 3","Xiaomi", 70000.00,"FreeDOS",512,16,"Silver"));

        System.out.println(store);

        for(Map.Entry<Integer, String> entry : Constants.criterias.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        Map chooseUserCriterias = filterCriterias(chooseCriterias);
        showUserCriterias(chooseUserCriterias);

        System.out.println(store.findNotebooks(chooseUserCriterias).toString());

    }

    public static Map filterCriterias(Map<Integer, String> chooseCriterias){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите критерий для поиска: ");
        Integer critType = scanner.nextInt();
        System.out.println("Выберите значение критерия " + Constants.criterias.get(critType) + ": ");
        String critValue = scanner.next();
        chooseCriterias.put(critType,critValue);
        System.out.println("Добавить еще критерий: Да/Нет");
        String procced = scanner.next();
        if(procced.equals("Да")){
            chooseCriterias = filterCriterias(chooseCriterias);
        }
        return chooseCriterias;
    }

    public static void showUserCriterias(Map<Integer, String> chooseUserCriterias) {
        System.out.println("Выбранные критерии:");
        for(Map.Entry<Integer, String> entry : chooseUserCriterias.entrySet()){
            System.out.println(Constants.criterias.get(entry.getKey()) + ": " + entry.getValue());
        }
    }



}