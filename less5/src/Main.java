import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();
        //ex1(phoneBook);

        System.out.println(ex2("Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов"));
    }

    static void ex1(Map<String, String> phoneBook){
        /* Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов. */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ФИО: ");
        String fio = scanner.nextLine();
        System.out.println("Введите телефон: ");
        String phone = scanner.nextLine();

        if(phoneBook.containsKey(fio)){
            phoneBook.put(fio,phoneBook.get(fio) + ", " + phone);
        }else{
            phoneBook.put(fio, phone);
        }

        System.out.println(phoneBook);

        System.out.println("Ввести еще: Да / Нет");
        String more = scanner.nextLine();
        if(more.equals("Да")){
            ex1(phoneBook);
        }else{
            System.out.println("До скорой встречи");
        }
    }

    static Map<String, Integer> ex2(String s){
        /* Пусть дан список сотрудников:
        Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин,
        Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина,
        Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов.
        Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
        Отсортировать по убыванию популярности. Для сортировки использовать TreeMap. */
        s = s.replace(",", "");
        String[] words = s.split(" ");

        TreeMap<String,Integer> treeMap = new TreeMap<>(Comparator.reverseOrder());

        for (String word: words){
            if (treeMap.containsKey(word)){
                treeMap.put(word, treeMap.get(word) + 1);
            } else {
                Integer num = 1;
                treeMap.put(word, num);
            }
        }

        Map sortedMap = sortByValues(treeMap);
        return sortedMap;
    }

    public static <K, V extends Comparable<V>> Map<K, V>
    sortByValues(final Map<K, V> map) {
        Comparator<K> valueComparator =
                new Comparator<K>() {
                    public int compare(K k1, K k2) {
                        int compare =
                                map.get(k2).compareTo(map.get(k1));
                        if (compare == 0)
                            return 1;
                        else
                            return compare;
                    }
                };

        Map<K, V> sortedByValues =
                new TreeMap<K, V>(valueComparator);
        sortedByValues.putAll(map);
        return sortedByValues;
    }

}