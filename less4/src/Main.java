import java.util.*;

public class Main {
    public static void main(String[] args) {
        //ex1(5);
        ex2(5);
        //ex3(5);
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
    static void ex2(int n){
        /*
        Реализуйте очередь с помощью LinkedList со следующими методами:
        enqueue() - помещает элемент в конец очереди,
        dequeue() - возвращает первый элемент из очереди и удаляет его,
        first() - возвращает первый элемент из очереди, не удаляя.
         */
        LinkedList<Integer> linkedList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            linkedList.add(random.nextInt(100));
        }
        System.out.println(linkedList);
        enqueue(linkedList);
        System.out.println(linkedList);
        System.out.println(dequeue(linkedList));
        System.out.println(linkedList);
        System.out.println(first(linkedList));
        System.out.println(linkedList);

    }

    static void enqueue(LinkedList<Integer> linkedList){
        linkedList.add(5);
    }
    static Integer dequeue(LinkedList<Integer> linkedList){
        Integer first = linkedList.getFirst();
        linkedList.removeFirst();
        return first;
    }
    static Integer first(LinkedList<Integer> linkedList){
        Integer first = linkedList.getFirst();
        return first;
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

