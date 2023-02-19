import java.util.*;

public class Main {
    public static void main(String[] args) {
        //ex1(5);
        //ex2();
        ex3(5);
    }

    static void ex1(int n){
        /* Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список. */
        LinkedList<Integer> linkedList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            linkedList.add(random.nextInt(100));
        }
        System.out.println(linkedList);
        LinkedList<Integer> revLinkedList = new LinkedList<>();
        for (int i = linkedList.size() - 1; i >= 0; i--) {
            revLinkedList.add(linkedList.get(i));
        }
        System.out.println(revLinkedList);
    }
    static void ex2(){
        /*
        Реализуйте очередь с помощью LinkedList со следующими методами:
        enqueue() - помещает элемент в конец очереди,
        dequeue() - возвращает первый элемент из очереди и удаляет его,
        first() - возвращает первый элемент из очереди, не удаляя.
         */
    }
    static void ex3(int n){
        /* Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор */
        LinkedList<Integer> linkedList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            linkedList.add(random.nextInt(100));
        }
        System.out.println(linkedList);
        int sum = 0;
        Iterator<Integer> iterator = linkedList.iterator();
        while(iterator.hasNext()){
            Integer integer = iterator.next();
            sum += integer;
        }
        System.out.println(sum);
    }
}

