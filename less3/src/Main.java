import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //ex1(10);
        ex2(5);
    }

    static void ex1(int n) {
        /*
        Пусть дан произвольный список целых чисел, удалить из него четные числа
         */
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }

    static void ex2(int n) {
        /*
        Задан целочисленный список ArrayList.
        Найти минимальное, максимальное и среднее арифметическое из этого списка.
         */
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(100));
        }
        int max = Collections.max(list);
        int min = Collections.min(list);
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        double avg = sum/list.size();
        System.out.println(list);
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
        System.out.println("Average: "+avg);
    }
}

