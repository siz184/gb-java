import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();
        ex1(phoneBook);
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
}