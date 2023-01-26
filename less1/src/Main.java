import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //ex1();
        //ex2();
        //ex3();
        ex4();

    }

    static void ex1(){
        /* Вычислить n-ое треугольного число(сумма чисел от 1 до n) */
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        for(int i=1;i<=num;i++){
            sum += i;
        }
        System.out.println("Сумма чисел от 1 до " + num + ": "+sum);
    }

    static void ex2(){
        /* Вычислить n! (произведение чисел от 1 до n) */
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int product = 1;
        for(int i=1;i<=num;i++){
            product *= i;
        }
        System.out.println("Факториал " + num + ": "+product);
    }

    static void ex3(){
        /* Вывести все простые числа от 1 до 1000 (простые числа - это числа которые делятся только на себя и на единицу без остатка.
        Чтобы найти остаток от деления используйте оператор % , например 10%3 будет равно единице) */

        int num = 1000;
        boolean p;
        for(int i = 1;i <= num; i++){
            p = true;
            for (int j = 2; j < i; j++) {
                if(i%j==0){
                    p = false;
                    break;
                }
            }
            if(p) {
                System.out.println(i);
            }
        }

    }

    static void ex4(){
        /* Реализовать простой калькулятор
        ("введите первое число"... "Введите второе число"... "укажите операцию,
        которую надо выполнить с этими числами"... "ответ: ...")
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();

        System.out.println("Укажите операцию ('+','-','*','/'): ");
        char act = scanner.next().charAt(0);

        double res;

        switch(act) {
            case('/'):
                res = (double) num1 / (double)num2;
                break;
            case('*'):
                res = num1 * num2;
                break;
            case('-'):
                res = num1 - num2;
                break;
            default:
                res = num1 + num2;
                break;
        }
        System.out.println("Ответ: "+res);
    }

}